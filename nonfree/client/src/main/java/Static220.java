import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!pm", name = "U", descriptor = "Lclient!ek;")
	public static Class42 aClass42_69;

	@OriginalMember(owner = "client!pm", name = "eb", descriptor = "I")
	public static int anInt4519;

	@OriginalMember(owner = "client!pm", name = "fb", descriptor = "I")
	public static int anInt4520;

	@OriginalMember(owner = "client!pm", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString154 = "Loaded config";

	@OriginalMember(owner = "client!pm", name = "cb", descriptor = "Lclient!sf;")
	public static Class157 aClass157_37 = new Class157(64);

	@OriginalMember(owner = "client!pm", name = "db", descriptor = "Ljava/lang/String;")
	public static String aString155 = "yellow:";

	@OriginalMember(owner = "client!pm", name = "g", descriptor = "(I)V")
	public static void method3662() {
		if (Static22.aClass43_1 != null) {
			Static22.aClass43_1.method2454();
		}
		if (Static48.aClass43_2 != null) {
			Static48.aClass43_2.method2454();
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIBI)Lclient!an;")
	public static Class2_Sub4 method3663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) Class2_Sub4 local9 = new Class2_Sub4();
		local9.anInt274 = arg2;
		local9.anInt278 = arg0;
		Static132.aClass101_8.method2860(local9, (long) arg1);
		Static66.method1201(arg2);
		@Pc(33) Class56 local33 = Static38.method715(arg1);
		if (local33 != null) {
			Static287.method4466(local33);
		}
		if (Static159.aClass56_17 != null) {
			Static287.method4466(Static159.aClass56_17);
			Static159.aClass56_17 = null;
		}
		@Pc(48) int local48 = Static68.anInt1741;
		@Pc(50) int local50;
		for (local50 = 0; local50 < local48; local50++) {
			if (Static120.method2001(Static290.aShortArray85[local50])) {
				Static211.method3516(local50);
			}
		}
		if (Static68.anInt1741 == 1) {
			Static196.aBoolean281 = false;
			Static253.method3981(Static275.anInt5450, Static39.anInt982, Static68.anInt1739, Static274.anInt5436);
		} else {
			Static253.method3981(Static275.anInt5450, Static39.anInt982, Static68.anInt1739, Static274.anInt5436);
			local50 = Static237.aClass2_Sub8_Sub5_5.method1237(Static204.aString145);
			for (@Pc(91) int local91 = 0; local91 < Static68.anInt1741; local91++) {
				@Pc(100) int local100 = Static237.aClass2_Sub8_Sub5_5.method1237(Static143.method2543(local91));
				if (local50 < local100) {
					local50 = local100;
				}
			}
			Static274.anInt5436 = local50 + 8;
			Static275.anInt5450 = (Static54.aBoolean90 ? 26 : 22) + Static68.anInt1741 * 15;
		}
		if (local33 != null) {
			Static52.method967(false, local33);
		}
		Static302.method4602(arg2);
		if (Static303.anInt5868 != -1) {
			Static73.method1398(1, Static303.anInt5868);
		}
		return local9;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)Lclient!qi;")
	public static Class144 method3665(@OriginalArg(0) int arg0) {
		@Pc(6) Class144 local6 = (Class144) Static72.aClass157_12.method4031((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(31) byte[] local31 = Static179.aClass42_50.method1256(Static219.method3639(arg0), Static33.method645(arg0));
		local6 = new Class144();
		if (local31 != null) {
			local6.method3759(new Class2_Sub16(local31));
		}
		Static72.aClass157_12.method4026((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(IIIIIII)V")
	public static void method3667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static53.anInt1319 <= arg2 && arg1 <= Static81.anInt1915 && Static148.anInt3245 <= arg3 && Static166.anInt3675 >= arg4) {
			if (arg5 == 1) {
				Static70.method1359(arg2, arg1, arg0, arg3, arg4);
			} else {
				Static37.method707(arg2, arg0, arg3, arg4, arg1, arg5);
			}
		} else if (arg5 == 1) {
			Static218.method3616(arg1, arg4, arg2, arg0, arg3);
		} else {
			Static305.method4629(arg4, arg3, arg5, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILjava/lang/String;Lclient!ek;)Lclient!ga;")
	public static Class57 method3668(@OriginalArg(0) boolean arg0, @OriginalArg(2) String arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(8) int local8 = arg2.method1254(arg1);
		if (local8 == -1) {
			return new Class57(0);
		}
		@Pc(23) int local23 = 0;
		@Pc(25) int local25 = 0;
		@Pc(35) int[] local35 = arg2.method1265(local8);
		@Pc(41) Class57 local41 = new Class57(local35.length);
		while (true) {
			while (local41.anInt2126 > local23) {
				@Pc(57) Class2_Sub16 local57 = new Class2_Sub16(arg2.method1256(local8, local35[local25++]));
				@Pc(61) int local61 = local57.method2145();
				@Pc(65) int local65 = local57.method2130();
				@Pc(69) int local69 = local57.method2146();
				if (!arg0 && local69 == 1) {
					local41.anInt2126--;
				} else {
					local41.anIntArray193[local23] = local61;
					local41.aClass2_Sub8_Sub21Array1[local23] = new Class2_Sub8_Sub21();
					local41.aClass2_Sub8_Sub21Array1[local23].anInt4970 = local65;
					local23++;
				}
			}
			return local41;
		}
	}
}
