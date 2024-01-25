import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class2_Sub15_Sub30 extends Class2_Sub15 {

	@OriginalMember(owner = "client!tda", name = "F", descriptor = "I")
	private int anInt9834;

	@OriginalMember(owner = "client!tda", name = "K", descriptor = "I")
	private int anInt9838;

	@OriginalMember(owner = "client!tda", name = "M", descriptor = "I")
	private int anInt9840;

	@OriginalMember(owner = "client!tda", name = "Q", descriptor = "I")
	private int anInt9843;

	@OriginalMember(owner = "client!tda", name = "S", descriptor = "I")
	private int anInt9845;

	@OriginalMember(owner = "client!tda", name = "U", descriptor = "I")
	private int anInt9847;

	@OriginalMember(owner = "client!tda", name = "J", descriptor = "I")
	private int anInt9837 = 0;

	@OriginalMember(owner = "client!tda", name = "G", descriptor = "I")
	private int anInt9835 = 0;

	@OriginalMember(owner = "client!tda", name = "T", descriptor = "I")
	private int anInt9846 = 0;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "()V")
	public Class2_Sub15_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZLclient!ol;)V")
	@Override
	public void method9718(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub8 arg1) {
		if (arg0 == 0) {
			this.anInt9837 = arg1.method5174();
		} else if (arg0 == 1) {
			this.anInt9835 = (arg1.method5175() << 12) / 100;
		} else if (arg0 == 2) {
			this.anInt9846 = (arg1.method5175() << 12) / 100;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(ZI)[[I")
	@Override
	public int[][] method9723(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass38_41.method1080(arg0);
		if (super.aClass38_41.aBoolean64) {
			@Pc(29) int[][] local29 = this.method9727(0, arg0);
			@Pc(33) int[] local33 = local29[0];
			@Pc(37) int[] local37 = local29[1];
			@Pc(41) int[] local41 = local29[2];
			@Pc(45) int[] local45 = local11[0];
			@Pc(49) int[] local49 = local11[1];
			@Pc(53) int[] local53 = local11[2];
			for (@Pc(55) int local55 = 0; local55 < Static329.anInt6017; local55++) {
				this.method8616(local33[local55], local41[local55], local37[local55]);
				this.anInt9845 += this.anInt9846;
				this.anInt9834 += this.anInt9835;
				for (this.anInt9840 += this.anInt9837; this.anInt9840 < 0; this.anInt9840 += 4096) {
				}
				while (this.anInt9840 > 4096) {
					this.anInt9840 -= 4096;
				}
				if (this.anInt9834 < 0) {
					this.anInt9834 = 0;
				}
				if (this.anInt9834 > 4096) {
					this.anInt9834 = 4096;
				}
				if (this.anInt9845 < 0) {
					this.anInt9845 = 0;
				}
				if (this.anInt9845 > 4096) {
					this.anInt9845 = 4096;
				}
				this.method8617(this.anInt9840, this.anInt9845, this.anInt9834);
				local45[local55] = this.anInt9843;
				local49[local55] = this.anInt9847;
				local53[local55] = this.anInt9838;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZII)V")
	private void method8616(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg2 >= arg0 ? arg2 : arg0;
		@Pc(27) int local27 = arg2 <= arg0 ? arg2 : arg0;
		@Pc(43) int local43 = arg1 <= local16 ? local16 : arg1;
		@Pc(54) int local54 = arg1 < local27 ? arg1 : local27;
		this.anInt9845 = (local43 + local54) / 2;
		@Pc(66) int local66 = local43 - local54;
		if (this.anInt9845 > 0 && this.anInt9845 < 4096) {
			this.anInt9834 = (local66 << 12) / (this.anInt9845 <= 2048 ? this.anInt9845 * 2 : 8192 - (this.anInt9845 * 2));
		} else {
			this.anInt9834 = 0;
		}
		if (local66 <= 0) {
			this.anInt9840 = 0;
			return;
		}
		@Pc(118) int local118 = (local43 - arg0 << 12) / local66;
		@Pc(127) int local127 = (local43 - arg2 << 12) / local66;
		@Pc(136) int local136 = (local43 - arg1 << 12) / local66;
		if (local43 == arg0) {
			this.anInt9840 = arg2 == local54 ? local136 + 20480 : -local127 + 4096;
		} else if (local43 == arg2) {
			this.anInt9840 = arg1 == local54 ? local118 + 4096 : -local136 + 12288;
		} else {
			this.anInt9840 = local54 == arg0 ? local127 + 12288 : -local118 + 20480;
		}
		this.anInt9840 /= 6;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIII)V")
	private void method8617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(27) int local27 = arg1 <= 2048 ? (arg2 + 4096) * arg1 >> 12 : arg2 + arg1 - (arg1 * arg2 >> 12);
		if (local27 <= 0) {
			this.anInt9843 = this.anInt9847 = this.anInt9838 = arg1;
			return;
		}
		@Pc(36) int local36 = arg0 * 6;
		@Pc(43) int local43 = arg1 + arg1 - local27;
		@Pc(52) int local52 = (local27 - local43 << 12) / local27;
		@Pc(56) int local56 = local36 >> 12;
		@Pc(63) int local63 = local36 - (local56 << 12);
		@Pc(71) int local71 = local27 * local52 >> 12;
		@Pc(77) int local77 = local63 * local71 >> 12;
		@Pc(82) int local82 = local43 + local77;
		@Pc(87) int local87 = local27 - local77;
		if (local56 == 0) {
			this.anInt9838 = local43;
			this.anInt9847 = local82;
			this.anInt9843 = local27;
		} else if (local56 == 1) {
			this.anInt9843 = local87;
			this.anInt9847 = local27;
			this.anInt9838 = local43;
		} else if (local56 == 2) {
			this.anInt9843 = local43;
			this.anInt9847 = local27;
			this.anInt9838 = local82;
		} else if (local56 == 3) {
			this.anInt9847 = local87;
			this.anInt9843 = local43;
			this.anInt9838 = local27;
		} else if (local56 == 4) {
			this.anInt9838 = local27;
			this.anInt9847 = local43;
			this.anInt9843 = local82;
		} else if (local56 == 5) {
			this.anInt9847 = local43;
			this.anInt9843 = local27;
			this.anInt9838 = local87;
		}
	}
}
