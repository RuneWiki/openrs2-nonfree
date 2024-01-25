import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class5_Sub6_Sub37 extends Class5_Sub6 {

	@OriginalMember(owner = "client!tf", name = "B", descriptor = "I")
	private int anInt9202;

	@OriginalMember(owner = "client!tf", name = "C", descriptor = "I")
	private int anInt9203;

	@OriginalMember(owner = "client!tf", name = "I", descriptor = "I")
	private int anInt9208;

	@OriginalMember(owner = "client!tf", name = "K", descriptor = "I")
	private int anInt9210;

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	private int anInt9211;

	@OriginalMember(owner = "client!tf", name = "M", descriptor = "I")
	private int anInt9212;

	@OriginalMember(owner = "client!tf", name = "D", descriptor = "I")
	private int anInt9204 = 0;

	@OriginalMember(owner = "client!tf", name = "F", descriptor = "I")
	private int anInt9206 = 0;

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
	private int anInt9214 = 0;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class5_Sub6_Sub37() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!rv;I)V")
	@Override
	public void method8120(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt9214 = arg0.method3638();
		} else if (arg1 == 1) {
			this.anInt9206 = (arg0.method3677() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt9204 = (arg0.method3677() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8122(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass242_41.method5691(arg0);
		if (super.aClass242_41.aBoolean487) {
			@Pc(31) int[][] local31 = this.method8116(0, arg0);
			@Pc(35) int[] local35 = local31[0];
			@Pc(39) int[] local39 = local31[1];
			@Pc(43) int[] local43 = local31[2];
			@Pc(47) int[] local47 = local19[0];
			@Pc(51) int[] local51 = local19[1];
			@Pc(55) int[] local55 = local19[2];
			for (@Pc(57) int local57 = 0; local57 < Static421.anInt7443; local57++) {
				this.method7731(local43[local57], local35[local57], local39[local57]);
				this.anInt9210 += this.anInt9206;
				this.anInt9202 += this.anInt9204;
				for (this.anInt9208 += this.anInt9214; this.anInt9208 < 0; this.anInt9208 += 4096) {
				}
				if (this.anInt9210 < 0) {
					this.anInt9210 = 0;
				}
				while (this.anInt9208 > 4096) {
					this.anInt9208 -= 4096;
				}
				if (this.anInt9202 < 0) {
					this.anInt9202 = 0;
				}
				if (this.anInt9210 > 4096) {
					this.anInt9210 = 4096;
				}
				if (this.anInt9202 > 4096) {
					this.anInt9202 = 4096;
				}
				this.method7730(this.anInt9208, this.anInt9210, this.anInt9202);
				local47[local57] = this.anInt9203;
				local51[local57] = this.anInt9212;
				local55[local57] = this.anInt9211;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)V")
	private void method7730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(30) int local30 = arg2 > 2048 ? arg1 + arg2 - (arg2 * arg1 >> 12) : (arg1 + 4096) * arg2 >> 12;
		if (local30 <= 0) {
			this.anInt9203 = this.anInt9212 = this.anInt9211 = arg2;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(43) int local43 = arg2 + arg2 - local30;
		@Pc(51) int local51 = (local30 - local43 << 12) / local30;
		@Pc(55) int local55 = local36 >> 12;
		@Pc(62) int local62 = local36 - (local55 << 12);
		@Pc(70) int local70 = local30 * local51 >> 12;
		@Pc(76) int local76 = local70 * local62 >> 12;
		@Pc(80) int local80 = local76 + local43;
		@Pc(84) int local84 = local30 - local76;
		if (local55 == 0) {
			this.anInt9212 = local80;
			this.anInt9211 = local43;
			this.anInt9203 = local30;
			return;
		}
		if (local55 == 1) {
			this.anInt9211 = local43;
			this.anInt9212 = local30;
			this.anInt9203 = local84;
			return;
		}
		if (local55 == 2) {
			this.anInt9212 = local30;
			this.anInt9211 = local80;
			this.anInt9203 = local43;
			return;
		}
		if (local55 == 3) {
			this.anInt9211 = local30;
			this.anInt9212 = local84;
			this.anInt9203 = local43;
			return;
		}
		if (local55 == 4) {
			this.anInt9211 = local30;
			this.anInt9203 = local80;
			this.anInt9212 = local43;
			return;
		}
		if (local55 == 5) {
			this.anInt9203 = local30;
			this.anInt9212 = local43;
			this.anInt9211 = local84;
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIBI)V")
	private void method7731(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 >= arg1 ? arg2 : arg1;
		@Pc(31) int local31 = local16 >= arg0 ? local16 : arg0;
		@Pc(42) int local42 = arg2 <= arg1 ? arg2 : arg1;
		@Pc(53) int local53 = arg0 >= local42 ? local42 : arg0;
		this.anInt9202 = (local53 + local31) / 2;
		@Pc(65) int local65 = local31 - local53;
		if (local65 > 0) {
			@Pc(78) int local78 = (local31 - arg1 << 12) / local65;
			@Pc(87) int local87 = (local31 - arg2 << 12) / local65;
			@Pc(96) int local96 = (local31 - arg0 << 12) / local65;
			if (local31 == arg1) {
				this.anInt9208 = local53 == arg2 ? local96 + 20480 : -local87 + 4096;
			} else if (local31 == arg2) {
				this.anInt9208 = arg0 == local53 ? local78 + 4096 : -local96 + 12288;
			} else {
				this.anInt9208 = local53 == arg1 ? local87 + 12288 : 20480 - local78;
			}
			this.anInt9208 /= 6;
		} else {
			this.anInt9208 = 0;
		}
		if (this.anInt9202 > 0 && this.anInt9202 < 4096) {
			this.anInt9210 = (local65 << 12) / (this.anInt9202 > 2048 ? 8192 - (this.anInt9202 * 2) : this.anInt9202 * 2);
		} else {
			this.anInt9210 = 0;
		}
	}
}
