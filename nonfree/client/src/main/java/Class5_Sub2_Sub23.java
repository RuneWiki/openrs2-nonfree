import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ot")
public final class Class5_Sub2_Sub23 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
	private int anInt7149;

	@OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
	private int anInt7155;

	@OriginalMember(owner = "client!ot", name = "M", descriptor = "I")
	private int anInt7156;

	@OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
	private int anInt7159;

	@OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
	private int anInt7161;

	@OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
	private int anInt7163;

	@OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
	private int anInt7152 = 0;

	@OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
	private int anInt7160 = 0;

	@OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
	private int anInt7164 = 0;

	@OriginalMember(owner = "client!ot", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub23() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILclient!ofa;I)V")
	@Override
	public void method9040(@OriginalArg(1) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt7152 = arg0.method5956();
		} else if (arg1 == 1) {
			this.anInt7160 = (arg0.method5963() << 12) / 100;
		} else if (arg1 == 2) {
			this.anInt7164 = (arg0.method5963() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!ot", name = "c", descriptor = "(II)[[I")
	@Override
	public int[][] method9037(@OriginalArg(0) int arg0) {
		@Pc(19) int[][] local19 = super.aClass160_41.method3854(arg0);
		if (super.aClass160_41.aBoolean310) {
			@Pc(29) int[][] local29 = this.method9033(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local19[0];
			@Pc(49) int[] local49 = local19[1];
			@Pc(53) int[] local53 = local19[2];
			for (@Pc(55) int local55 = 0; local55 < Static597.anInt10025; local55++) {
				this.method6336(local33[local55], local37[local55], local41[local55]);
				this.anInt7161 += this.anInt7160;
				this.anInt7159 += this.anInt7164;
				for (this.anInt7163 += this.anInt7152; this.anInt7163 < 0; this.anInt7163 += 4096) {
				}
				if (this.anInt7161 < 0) {
					this.anInt7161 = 0;
				}
				while (this.anInt7163 > 4096) {
					this.anInt7163 -= 4096;
				}
				if (this.anInt7161 > 4096) {
					this.anInt7161 = 4096;
				}
				if (this.anInt7159 < 0) {
					this.anInt7159 = 0;
				}
				if (this.anInt7159 > 4096) {
					this.anInt7159 = 4096;
				}
				this.method6332(this.anInt7159, this.anInt7163, this.anInt7161);
				local45[local55] = this.anInt7149;
				local49[local55] = this.anInt7155;
				local53[local55] = this.anInt7156;
			}
		}
		return local19;
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(BIII)V")
	private void method6332(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : arg2 + arg0 - (arg2 * arg0 >> 12);
		if (local27 <= 0) {
			this.anInt7149 = this.anInt7155 = this.anInt7156 = arg0;
			return;
		}
		@Pc(33) int local33 = arg1 * 6;
		@Pc(40) int local40 = arg0 + arg0 - local27;
		@Pc(48) int local48 = (local27 - local40 << 12) / local27;
		@Pc(52) int local52 = local33 >> 12;
		@Pc(59) int local59 = local33 - (local52 << 12);
		@Pc(67) int local67 = local27 * local48 >> 12;
		@Pc(73) int local73 = local67 * local59 >> 12;
		@Pc(77) int local77 = local40 + local73;
		@Pc(81) int local81 = local27 - local73;
		if (local52 == 0) {
			this.anInt7156 = local40;
			this.anInt7149 = local27;
			this.anInt7155 = local77;
		} else if (local52 == 1) {
			this.anInt7149 = local81;
			this.anInt7155 = local27;
			this.anInt7156 = local40;
		} else if (local52 == 2) {
			this.anInt7149 = local40;
			this.anInt7156 = local77;
			this.anInt7155 = local27;
		} else if (local52 == 3) {
			this.anInt7155 = local81;
			this.anInt7149 = local40;
			this.anInt7156 = local27;
		} else if (local52 == 4) {
			this.anInt7155 = local40;
			this.anInt7156 = local27;
			this.anInt7149 = local77;
		} else if (local52 == 5) {
			this.anInt7155 = local40;
			this.anInt7156 = local81;
			this.anInt7149 = local27;
		}
	}

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIBI)V")
	private void method6336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 <= arg1 ? arg1 : arg0;
		@Pc(23) int local23 = local16 < arg2 ? arg2 : local16;
		@Pc(30) int local30 = arg1 <= arg0 ? arg1 : arg0;
		@Pc(37) int local37 = local30 > arg2 ? arg2 : local30;
		this.anInt7159 = (local23 + local37) / 2;
		@Pc(54) int local54 = local23 - local37;
		if (this.anInt7159 > 0 && this.anInt7159 < 4096) {
			this.anInt7161 = (local54 << 12) / (this.anInt7159 <= 2048 ? this.anInt7159 * 2 : 8192 - this.anInt7159 * 2);
		} else {
			this.anInt7161 = 0;
		}
		if (local54 <= 0) {
			this.anInt7163 = 0;
			return;
		}
		@Pc(105) int local105 = (local23 - arg0 << 12) / local54;
		@Pc(114) int local114 = (local23 - arg1 << 12) / local54;
		@Pc(123) int local123 = (local23 - arg2 << 12) / local54;
		if (arg0 == local23) {
			this.anInt7163 = local37 == arg1 ? local123 + 20480 : -local114 + 4096;
		} else if (local23 == arg1) {
			this.anInt7163 = arg2 == local37 ? local105 + 4096 : -local123 + 12288;
		} else {
			this.anInt7163 = arg0 == local37 ? local114 + 12288 : 20480 - local105;
		}
		this.anInt7163 /= 6;
	}
}
