import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!ra", name = "N", descriptor = "Lclient!vl;")
	public static Class187 aClass187_6;

	@OriginalMember(owner = "client!ra", name = "U", descriptor = "[S")
	public static short[] aShortArray70;

	@OriginalMember(owner = "client!ra", name = "M", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!ra", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString158 = "Loading interfaces - ";

	@OriginalMember(owner = "client!ra", name = "W", descriptor = "Lclient!qf;")
	public static Class146 aClass146_15 = null;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lclient!ph;BLclient!ph;)V")
	public static void method3725(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		Static289.aClass1_Sub1_Sub12_4 = Static254.method3869(Static37.anInt758, arg0, arg1);
		if (Static291.aBoolean404) {
			Static110.aClass1_Sub1_Sub12_Sub2_1 = Static219.method3491(arg1, arg0, Static37.anInt758);
		} else {
			Static110.aClass1_Sub1_Sub12_Sub2_1 = (Class1_Sub1_Sub12_Sub2) Static289.aClass1_Sub1_Sub12_4;
		}
		Static233.aClass1_Sub1_Sub12_3 = Static254.method3869(Static73.anInt1413, arg0, arg1);
		Static245.aClass1_Sub1_Sub12_2 = Static254.method3869(Static177.anInt2086, arg0, arg1);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!v;Lclient!v;)V")
	public static void method3726(@OriginalArg(1) Class1_Sub1 arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0.aClass1_Sub1_74 != null) {
			arg0.method4617();
		}
		arg0.aClass1_Sub1_75 = arg1.aClass1_Sub1_75;
		arg0.aClass1_Sub1_74 = arg1;
		arg0.aClass1_Sub1_74.aClass1_Sub1_75 = arg0;
		arg0.aClass1_Sub1_75.aClass1_Sub1_74 = arg0;
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(B)V")
	public static void method3728() {
		Static316.anInt5941 = 0;
		Static122.anInt2466 = 0;
		Static251.anInt4928 = -1;
		Static108.aBoolean161 = false;
		Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
		Static127.anInt2543 = 0;
		Static237.aClass1_Sub14_Sub1_7.anInt3290 = 0;
		Static52.anInt1095 = 0;
		Static265.anInt5098 = -1;
		Static258.anInt5017 = -1;
		Static117.anInt2306 = -1;
		Static101.method1530();
		@Pc(39) int local39;
		for (local39 = 0; local39 < Static195.aClass22_Sub3_Sub2Array1.length; local39++) {
			if (Static195.aClass22_Sub3_Sub2Array1[local39] != null) {
				Static195.aClass22_Sub3_Sub2Array1[local39].anInt4638 = -1;
			}
		}
		for (local39 = 0; local39 < Static265.aClass22_Sub3_Sub1Array1.length; local39++) {
			if (Static265.aClass22_Sub3_Sub1Array1[local39] != null) {
				Static265.aClass22_Sub3_Sub1Array1[local39].anInt4638 = -1;
			}
		}
		Static221.method3497();
		Static101.anInt1895 = 1;
		Static176.method4598(30);
		for (local39 = 0; local39 < 100; local39++) {
			Static132.aBooleanArray25[local39] = true;
		}
		Static237.method2934();
	}
}
