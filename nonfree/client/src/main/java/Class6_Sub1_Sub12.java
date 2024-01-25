import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gka")
public final class Class6_Sub1_Sub12 extends Class6_Sub1 {

	@OriginalMember(owner = "client!gka", name = "D", descriptor = "I")
	private int anInt3208;

	@OriginalMember(owner = "client!gka", name = "E", descriptor = "I")
	private int anInt3209;

	@OriginalMember(owner = "client!gka", name = "J", descriptor = "I")
	private int anInt3213;

	@OriginalMember(owner = "client!gka", name = "K", descriptor = "I")
	private int anInt3214;

	@OriginalMember(owner = "client!gka", name = "M", descriptor = "I")
	private int anInt3216;

	@OriginalMember(owner = "client!gka", name = "T", descriptor = "I")
	private int anInt3221;

	@OriginalMember(owner = "client!gka", name = "G", descriptor = "I")
	private int anInt3210 = 0;

	@OriginalMember(owner = "client!gka", name = "H", descriptor = "I")
	private int anInt3211 = 0;

	@OriginalMember(owner = "client!gka", name = "I", descriptor = "I")
	private int anInt3212 = 0;

	@OriginalMember(owner = "client!gka", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub12() {
		super(1, false);
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8957(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass54_41.method1386(arg0);
		if (super.aClass54_41.aBoolean81) {
			@Pc(28) int[][] local28 = this.method8959(arg0, 0);
			@Pc(32) int[] local32 = local28[0];
			@Pc(36) int[] local36 = local28[1];
			@Pc(40) int[] local40 = local28[2];
			@Pc(44) int[] local44 = local11[0];
			@Pc(48) int[] local48 = local11[1];
			@Pc(52) int[] local52 = local11[2];
			for (@Pc(54) int local54 = 0; local54 < Static479.anInt8231; local54++) {
				this.method2686(local32[local54], local36[local54], local40[local54]);
				this.anInt3213 += this.anInt3212;
				this.anInt3208 += this.anInt3211;
				this.anInt3216 += this.anInt3210;
				while (this.anInt3208 < 0) {
					this.anInt3208 += 4096;
				}
				if (this.anInt3216 < 0) {
					this.anInt3216 = 0;
				}
				while (this.anInt3208 > 4096) {
					this.anInt3208 -= 4096;
				}
				if (this.anInt3213 < 0) {
					this.anInt3213 = 0;
				}
				if (this.anInt3216 > 4096) {
					this.anInt3216 = 4096;
				}
				if (this.anInt3213 > 4096) {
					this.anInt3213 = 4096;
				}
				this.method2683(this.anInt3213, this.anInt3216, this.anInt3208);
				local44[local54] = this.anInt3209;
				local48[local54] = this.anInt3221;
				local52[local54] = this.anInt3214;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(BIII)V")
	private void method2683(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg0 > 2048 ? arg1 + arg0 - (arg1 * arg0 >> 12) : (arg1 + 4096) * arg0 >> 12;
		if (local27 <= 0) {
			this.anInt3209 = this.anInt3221 = this.anInt3214 = arg0;
			return;
		}
		@Pc(36) int local36 = arg2 * 6;
		@Pc(43) int local43 = arg0 + arg0 - local27;
		@Pc(51) int local51 = (local27 - local43 << 12) / local27;
		@Pc(55) int local55 = local36 >> 12;
		@Pc(62) int local62 = local36 - (local55 << 12);
		@Pc(70) int local70 = local51 * local27 >> 12;
		@Pc(76) int local76 = local62 * local70 >> 12;
		@Pc(80) int local80 = local76 + local43;
		@Pc(85) int local85 = local27 - local76;
		if (local55 == 0) {
			this.anInt3221 = local80;
			this.anInt3209 = local27;
			this.anInt3214 = local43;
		} else if (local55 == 1) {
			this.anInt3221 = local27;
			this.anInt3209 = local85;
			this.anInt3214 = local43;
		} else if (local55 == 2) {
			this.anInt3214 = local80;
			this.anInt3221 = local27;
			this.anInt3209 = local43;
		} else if (local55 == 3) {
			this.anInt3221 = local85;
			this.anInt3214 = local27;
			this.anInt3209 = local43;
		} else if (local55 == 4) {
			this.anInt3214 = local27;
			this.anInt3221 = local43;
			this.anInt3209 = local80;
		} else if (local55 == 5) {
			this.anInt3209 = local27;
			this.anInt3214 = local85;
			this.anInt3221 = local43;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(IIII)V")
	private void method2686(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg0 > arg1 ? arg0 : arg1;
		@Pc(19) int local19 = local12 < arg2 ? arg2 : local12;
		@Pc(30) int local30 = arg0 < arg1 ? arg0 : arg1;
		@Pc(41) int local41 = local30 <= arg2 ? local30 : arg2;
		this.anInt3213 = (local41 + local19) / 2;
		@Pc(53) int local53 = local19 - local41;
		if (local53 > 0) {
			@Pc(67) int local67 = (local19 - arg0 << 12) / local53;
			@Pc(76) int local76 = (local19 - arg1 << 12) / local53;
			@Pc(85) int local85 = (local19 - arg2 << 12) / local53;
			if (arg0 == local19) {
				this.anInt3208 = arg1 == local41 ? local85 + 20480 : -local76 + 4096;
			} else if (arg1 == local19) {
				this.anInt3208 = arg2 == local41 ? local67 + 4096 : -local85 + 12288;
			} else {
				this.anInt3208 = arg0 == local41 ? local76 + 12288 : -local67 + 20480;
			}
			this.anInt3208 /= 6;
		} else {
			this.anInt3208 = 0;
		}
		if (this.anInt3213 > 0 && this.anInt3213 < 4096) {
			this.anInt3216 = (local53 << 12) / (this.anInt3213 <= 2048 ? this.anInt3213 * 2 : 8192 - (this.anInt3213 * 2));
		} else {
			this.anInt3216 = 0;
		}
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3211 = arg0.method8395();
		} else if (arg1 == 1) {
			this.anInt3210 = (arg0.method8391() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt3212 = (arg0.method8391() << 12) / 100;
		}
	}
}
