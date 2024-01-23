import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class2_Sub1_Sub32 extends Class2_Sub1 {

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub32() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IZI)V")
	private void method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9 = Static97.anIntArray240[arg1];
		@Pc(13) int local13 = Static20.anIntArray45[arg0];
		@Pc(24) float local24 = (float) Math.atan2((double) (local13 - 2048), (double) (local9 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static12.anInt403 = arg1;
			Static165.anInt3866 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static12.anInt403 = arg0;
			Static165.anInt3866 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static165.anInt3866 = Static62.anInt1675 - arg1;
			Static12.anInt403 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static165.anInt3866 = arg0;
			Static12.anInt403 = Static25.anInt4767 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static165.anInt3866 = Static62.anInt1675 - arg0;
			Static12.anInt403 = Static25.anInt4767 - arg1;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static165.anInt3866 = Static62.anInt1675 - arg1;
			Static12.anInt403 = Static25.anInt4767 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static165.anInt3866 = arg1;
			Static12.anInt403 = Static25.anInt4767 - arg0;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static12.anInt403 = arg1;
			Static165.anInt3866 = Static62.anInt1675 - arg0;
		}
		Static12.anInt403 &= Static195.anInt4423;
		Static165.anInt3866 &= Static41.anInt1259;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3201(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass73_41.method2249(arg0);
		if (super.aClass73_41.aBoolean188) {
			for (@Pc(25) int local25 = 0; local25 < Static62.anInt1675; local25++) {
				this.method2770(local25, arg0);
				@Pc(38) int[] local38 = this.method3203(Static12.anInt403, 0);
				local11[local25] = local38[Static165.anInt3866];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!ea;II)V")
	@Override
	public void method3204(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			super.aBoolean286 = arg0.method209() == 1;
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IB)[[I")
	@Override
	public int[][] method3211(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass99_41.method3152(arg0);
		if (super.aClass99_41.aBoolean280) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static62.anInt1675; local34++) {
				this.method2770(local34, arg0);
				@Pc(47) int[][] local47 = this.method3205(0, Static12.anInt403);
				local24[local34] = local47[0][Static165.anInt3866];
				local28[local34] = local47[1][Static165.anInt3866];
				local32[local34] = local47[2][Static165.anInt3866];
			}
		}
		return local16;
	}
}
