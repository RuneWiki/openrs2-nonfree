import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lc")
public final class Class1_Sub1_Sub21 extends Class1_Sub1 {

	@OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub21() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			super.aBoolean185 = arg1.method1738() == 1;
		}
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3313(@OriginalArg(0) int arg0) {
		@Pc(9) int[][] local9 = super.aClass39_41.method1383(arg0);
		if (super.aClass39_41.aBoolean82) {
			@Pc(26) int[] local26 = local9[0];
			@Pc(30) int[] local30 = local9[1];
			@Pc(34) int[] local34 = local9[2];
			for (@Pc(36) int local36 = 0; local36 < Static176.anInt3921; local36++) {
				this.method1958(local36, arg0);
				@Pc(49) int[][] local49 = this.method3307(0, Static136.anInt3355);
				local26[local36] = local49[0][Static120.anInt2980];
				local30[local36] = local49[1][Static120.anInt2980];
				local34[local36] = local49[2][Static120.anInt2980];
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			for (@Pc(17) int local17 = 0; local17 < Static176.anInt3921; local17++) {
				this.method1958(local17, arg0);
				@Pc(32) int[] local32 = this.method3303(Static136.anInt3355, 0);
				local11[local17] = local32[Static120.anInt2980];
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(IBI)V")
	private void method1958(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = Static171.anIntArray439[arg0];
		@Pc(13) int local13 = Static22.anIntArray68[arg1];
		@Pc(24) float local24 = (float) Math.atan2((double) (local5 - 2048), (double) (local13 - 2048));
		if ((double) local24 >= -3.141592653589793D && (double) local24 <= -2.356194490192345D) {
			Static136.anInt3355 = arg1;
			Static120.anInt2980 = arg0;
		} else if ((double) local24 <= -1.5707963267948966D && (double) local24 >= -2.356194490192345D) {
			Static136.anInt3355 = arg0;
			Static120.anInt2980 = arg1;
		} else if ((double) local24 <= -0.7853981633974483D && (double) local24 >= -1.5707963267948966D) {
			Static120.anInt2980 = Static176.anInt3921 - arg1;
			Static136.anInt3355 = arg0;
		} else if (local24 <= 0.0F && (double) local24 >= -0.7853981633974483D) {
			Static120.anInt2980 = arg0;
			Static136.anInt3355 = Static112.anInt2736 - arg1;
		} else if (local24 >= 0.0F && (double) local24 <= 0.7853981633974483D) {
			Static136.anInt3355 = Static112.anInt2736 - arg1;
			Static120.anInt2980 = Static176.anInt3921 - arg0;
		} else if ((double) local24 >= 0.7853981633974483D && (double) local24 <= 1.5707963267948966D) {
			Static120.anInt2980 = Static176.anInt3921 - arg1;
			Static136.anInt3355 = Static112.anInt2736 - arg0;
		} else if ((double) local24 >= 1.5707963267948966D && (double) local24 <= 2.356194490192345D) {
			Static136.anInt3355 = Static112.anInt2736 - arg0;
			Static120.anInt2980 = arg1;
		} else if ((double) local24 >= 2.356194490192345D && (double) local24 <= 3.141592653589793D) {
			Static136.anInt3355 = arg1;
			Static120.anInt2980 = Static176.anInt3921 - arg0;
		}
		Static120.anInt2980 &= Static70.anInt1730;
		Static136.anInt3355 &= Static134.anInt3338;
	}
}
