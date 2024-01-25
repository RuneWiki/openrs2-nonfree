import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class1_Sub2_Sub18 extends Class1_Sub2 {

	@OriginalMember(owner = "client!jp", name = "I", descriptor = "[Lclient!ak;")
	private Class10[] aClass10Array1;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub18() {
		super(0, true);
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method5664(@OriginalArg(1) int arg0) {
		@Pc(11) int[][] local11 = super.aClass129_41.method3671(arg0);
		if (super.aClass129_41.aBoolean338) {
			@Pc(23) int local23 = Static251.anInt6509;
			@Pc(25) int local25 = Static81.anInt1606;
			@Pc(29) int[][] local29 = new int[local25][local23];
			@Pc(34) int[][][] local34 = super.aClass129_41.method3673();
			this.method2919(local29);
			for (@Pc(40) int local40 = 0; local40 < Static81.anInt1606; local40++) {
				@Pc(46) int[] local46 = local29[local40];
				@Pc(50) int[][] local50 = local34[local40];
				@Pc(54) int[] local54 = local50[0];
				@Pc(58) int[] local58 = local50[1];
				@Pc(62) int[] local62 = local50[2];
				for (@Pc(64) int local64 = 0; local64 < Static251.anInt6509; local64++) {
					@Pc(70) int local70 = local46[local64];
					local62[local64] = (local70 & 0xFF) << 4;
					local58[local64] = local70 >> 4 & 0xFF0;
					local54[local64] = local70 >> 12 & 0xFF0;
				}
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "([[IB)V")
	private void method2919(@OriginalArg(0) int[][] arg0) {
		@Pc(11) int local11 = Static251.anInt6509;
		@Pc(13) int local13 = Static81.anInt1606;
		Static340.method3660(arg0);
		Static219.method3991(Static206.anInt4136, Static260.anInt5056);
		if (this.aClass10Array1 == null) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < this.aClass10Array1.length; local29++) {
			@Pc(36) Class10 local36 = this.aClass10Array1[local29];
			@Pc(39) int local39 = local36.anInt5386;
			@Pc(42) int local42 = local36.anInt5381;
			if (local39 < 0) {
				if (local42 >= 0) {
					local36.method4801(local13, local11);
				}
			} else if (local42 >= 0) {
				local36.method4800(local11, local13);
			} else {
				local36.method4798(local13, local11);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5662(@OriginalArg(0) int arg0) {
		@Pc(17) int[] local17 = super.aClass84_41.method2422(arg0);
		if (super.aClass84_41.aBoolean227) {
			this.method2919(super.aClass84_41.method2421());
		}
		return local17;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILclient!eb;)V")
	@Override
	public void method5660(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		if (arg0 == 0) {
			this.aClass10Array1 = new Class10[arg1.method3141()];
			for (@Pc(28) int local28 = 0; local28 < this.aClass10Array1.length; local28++) {
				@Pc(34) int local34 = arg1.method3141();
				if (local34 == 0) {
					this.aClass10Array1[local28] = Static215.method3960(arg1);
				} else if (local34 == 1) {
					this.aClass10Array1[local28] = Static340.method3664(arg1);
				} else if (local34 == 2) {
					this.aClass10Array1[local28] = Static327.method5499(arg1);
				} else if (local34 == 3) {
					this.aClass10Array1[local28] = Static122.method2172(arg1);
				}
			}
		} else if (arg0 == 1) {
			super.aBoolean583 = arg1.method3141() == 1;
		}
	}
}
