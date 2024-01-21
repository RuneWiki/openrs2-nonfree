import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
	public static int anInt4397;

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
	public static int anInt4398;

	@OriginalMember(owner = "client!bg", name = "g", descriptor = "[I")
	public static int[] anIntArray476;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1218 = Static158.method3034("level)2");

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1219 = aClass60_1218;

	@OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
	public static int anInt4401 = -1;

	@OriginalMember(owner = "client!bg", name = "i", descriptor = "[S")
	public static final short[] aShortArray58 = new short[] { 40, 30, 29, 44, 2, 19, 16, 6 };

	@OriginalMember(owner = "client!bg", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean176 = false;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(11) int local11 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg4);
		@Pc(17) int local17 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg6);
		@Pc(23) int local23 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg2);
		@Pc(29) int local29 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1);
		@Pc(38) int local38 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg4 + arg0);
		@Pc(47) int local47 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg6 - arg0);
		for (@Pc(49) int local49 = local11; local49 < local38; local49++) {
			Static163.method3070(local29, local23, arg5, Static42.anIntArrayArray8[local49]);
		}
		for (@Pc(65) int local65 = local17; local65 > local47; local65--) {
			Static163.method3070(local29, local23, arg5, Static42.anIntArrayArray8[local65]);
		}
		@Pc(91) int local91 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg2 + arg0);
		@Pc(100) int local100 = Static96.method2447(Static64.anInt1962, Static123.anInt3379, arg1 - arg0);
		for (@Pc(102) int local102 = local38; local102 <= local47; local102++) {
			@Pc(113) int[] local113 = Static42.anIntArrayArray8[local102];
			Static163.method3070(local91, local23, arg5, local113);
			Static163.method3070(local100, local91, arg3, local113);
			Static163.method3070(local29, local100, arg5, local113);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZLclient!ra;)Lclient!ob;")
	public static Class60 method3389(@OriginalArg(0) int arg0, @OriginalArg(2) Class72 arg1) {
		if (!Static25.method620(Static26.method637(arg1), arg0) && arg1.anObjectArray7 == null) {
			return null;
		} else if (arg1.aClass60Array24 == null || arg1.aClass60Array24.length <= arg0 || arg1.aClass60Array24[arg0] == null || arg1.aClass60Array24[arg0].method2689().method2673() == 0) {
			return Static89.aBoolean102 ? Static193.method3536(new Class60[] { Static7.aClass60_1327, Static72.method1661(arg0) }) : null;
		} else {
			return arg1.aClass60Array24[arg0];
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)V")
	public static void method3390() {
		Static148.anInt3844 = 0;
		Static122.anInt3358 = 0;
		Static42.method916();
		Static31.method775();
		Static56.method1331();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static122.anInt3358; local21++) {
			local27 = Static181.anIntArray475[local21];
			if (Static20.anInt580 != Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local27].anInt3299) {
				Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local27].aClass2_Sub1_Sub2_1 = null;
				Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[local27] = null;
			}
		}
		if (Static168.anInt4121 != Static139.aClass2_Sub3_Sub1_32.anInt273) {
			throw new RuntimeException("gnp1 pos:" + Static139.aClass2_Sub3_Sub1_32.anInt273 + " psize:" + Static168.anInt4121);
		}
		for (local27 = 0; local27 < Static174.anInt4255; local27++) {
			if (Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[Static180.anIntArray370[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static174.anInt4255);
			}
		}
	}
}
