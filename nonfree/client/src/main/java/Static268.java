import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!uk", name = "D", descriptor = "Lclient!jn;")
	public static Class71 aClass71_1;

	@OriginalMember(owner = "client!uk", name = "J", descriptor = "I")
	public static int anInt5549;

	@OriginalMember(owner = "client!uk", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray109 = new byte[250][];

	@OriginalMember(owner = "client!uk", name = "x", descriptor = "I")
	public static int anInt5542 = 0;

	@OriginalMember(owner = "client!uk", name = "A", descriptor = "I")
	public static int anInt5543 = 20;

	@OriginalMember(owner = "client!uk", name = "G", descriptor = "[S")
	public static short[] aShortArray86 = new short[] { 28, 15, 36, 3, 41, 46, 35, 17 };

	@OriginalMember(owner = "client!uk", name = "H", descriptor = "I")
	public static int anInt5547 = 0;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIII)V")
	public static void method4455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 == arg1) {
			Static31.method513(arg2, arg0, arg4, arg1);
		} else if (arg2 - arg1 >= Static68.anInt1509 && Static43.anInt1054 >= arg1 + arg2 && Static127.anInt2664 <= arg4 - arg3 && Static290.anInt6021 >= arg4 + arg3) {
			Static76.method1381(arg0, arg2, arg4, arg1, arg3);
		} else {
			Static71.method1329(arg4, arg2, arg3, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIII)V")
	public static void method4457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class2_Sub3_Sub16 local8 = Static119.method2204(arg0, 10);
		local8.method2718();
		local8.anInt3327 = arg1;
		local8.anInt3323 = arg2;
		local8.anInt3324 = arg3;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public static int method4458(@OriginalArg(0) String arg0) {
		if (Static37.aClass113_1 == null || arg0.length() == 0) {
			return -1;
		}
		for (@Pc(19) int local19 = 0; local19 < Static37.aClass113_1.anInt3429; local19++) {
			if (Static136.method2419(Static62.method1200(Static37.aClass113_1.aStringArray15[local19], " ", "<br>"), arg0)) {
				return local19;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)Lclient!i;")
	public static Class2_Sub3_Sub8 method4459(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub3_Sub8 local10 = (Class2_Sub3_Sub8) Static254.aClass53_11.method1254((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(21) byte[] local21 = Static215.aClass84_98.method2127(arg0, 11);
		local10 = new Class2_Sub3_Sub8();
		if (local21 != null) {
			local10.method1912(new Class2_Sub26(local21));
		}
		Static254.aClass53_11.method1258((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Z)V")
	public static void method4460() {
		Static250.aClass2_Sub26_Sub1_2.method4282();
		@Pc(14) int local14 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
		if (local14 == 0) {
			return;
		}
		@Pc(26) int local26 = Static250.aClass2_Sub26_Sub1_2.method4278(2);
		if (local26 == 0) {
			Static161.anIntArray256[Static102.anInt2234++] = 2047;
			return;
		}
		@Pc(49) int local49;
		@Pc(59) int local59;
		if (local26 == 1) {
			local49 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
			Static111.aClass36_Sub3_Sub2_1.method4094(1, local49);
			local59 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
			if (local59 == 1) {
				Static161.anIntArray256[Static102.anInt2234++] = 2047;
			}
		} else if (local26 == 2) {
			if (Static250.aClass2_Sub26_Sub1_2.method4278(1) == 1) {
				local49 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
				Static111.aClass36_Sub3_Sub2_1.method4094(2, local49);
				local59 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
				Static111.aClass36_Sub3_Sub2_1.method4094(2, local59);
			} else {
				local49 = Static250.aClass2_Sub26_Sub1_2.method4278(3);
				Static111.aClass36_Sub3_Sub2_1.method4094(0, local49);
			}
			local49 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
			if (local49 == 1) {
				Static161.anIntArray256[Static102.anInt2234++] = 2047;
			}
		} else if (local26 == 3) {
			local49 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
			if (local49 == 1) {
				Static161.anIntArray256[Static102.anInt2234++] = 2047;
			}
			local59 = Static250.aClass2_Sub26_Sub1_2.method4278(7);
			@Pc(166) int local166 = Static250.aClass2_Sub26_Sub1_2.method4278(7);
			@Pc(171) int local171 = Static250.aClass2_Sub26_Sub1_2.method4278(1);
			Static208.anInt4335 = Static250.aClass2_Sub26_Sub1_2.method4278(2);
			Static111.aClass36_Sub3_Sub2_1.method4112(local171 == 1, local166, local59);
		}
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(CLjava/lang/String;I)I")
	public static int method4461(@OriginalArg(0) char arg0, @OriginalArg(1) String arg1) {
		@Pc(3) int local3 = 0;
		@Pc(10) int local10 = arg1.length();
		for (@Pc(12) int local12 = 0; local12 < local10; local12++) {
			if (arg0 == arg1.charAt(local12)) {
				local3++;
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(I[I)[I")
	public static int[] method4462(@OriginalArg(1) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(20) int[] local20 = new int[arg0.length];
			Static301.method299(arg0, 0, local20, 0, arg0.length);
			return local20;
		}
	}
}
