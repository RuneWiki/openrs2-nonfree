import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!vj", name = "j", descriptor = "[[I")
	public static final int[][] anIntArrayArray58 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIIZ)V")
	public static void method5879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		Static410.aLong229 = 0;
		@Pc(9) int local9 = Static282.method3967();
		if (arg1 == 3 || local9 == 3) {
			arg3 = true;
		}
		if (!Static413.aClass167_11.method6027()) {
			arg3 = true;
		}
		Static171.method2617(arg3, arg0, arg2, arg1, local9);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIZII)Lclient!cf;")
	public static Class3_Sub10 method5882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub10 local7 = new Class3_Sub10();
		local7.anInt827 = arg1;
		local7.anInt831 = arg0;
		Static32.aClass140_5.method3494((long) arg3, local7);
		Static141.method2174(arg1);
		@Pc(26) Class82 local26 = Static180.method2857(arg3);
		if (local26 != null) {
			Static463.method6297(local26);
		}
		if (Static444.aClass82_23 != null) {
			Static463.method6297(Static444.aClass82_23);
			Static444.aClass82_23 = null;
		}
		Static128.method2019();
		if (local26 != null) {
			Static325.method4506(local26, !arg2);
		}
		if (!arg2) {
			Static219.method3209(arg1);
		}
		if (!arg2 && Static343.anInt5785 != -1) {
			Static407.method5564(Static343.anInt5785, 1);
		}
		return local7;
	}
}
