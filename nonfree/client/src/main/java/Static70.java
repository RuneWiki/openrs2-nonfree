import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
	public static int anInt2162;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
	public static int anInt2156 = 0;

	@OriginalMember(owner = "client!hf", name = "kb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_678 = Static49.method1293("Your account is already logged in)3");

	@OriginalMember(owner = "client!hf", name = "V", descriptor = "Lclient!rf;")
	public static Class70 aClass70_675 = aClass70_678;

	@OriginalMember(owner = "client!hf", name = "mb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_679 = Static49.method1293("Cancel");

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "Lclient!rf;")
	public static Class70 aClass70_676 = aClass70_679;

	@OriginalMember(owner = "client!hf", name = "gb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_677 = Static49.method1293("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!hf", name = "lb", descriptor = "I")
	public static int anInt2170 = 0;

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(B)V")
	public static void method1600() {
		aClass70_677 = null;
		aClass70_678 = null;
		aClass70_679 = null;
		aClass70_675 = null;
		aClass70_676 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(BJ)V")
	public static void method1601(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < Static164.anInt4267; local19++) {
			if (Static79.aLongArray4[local19] == arg0) {
				Static164.anInt4267--;
				for (@Pc(41) int local41 = local19; local41 < Static164.anInt4267; local41++) {
					Static80.aClass70Array13[local41] = Static80.aClass70Array13[local41 + 1];
					Static107.anIntArray296[local41] = Static107.anIntArray296[local41 + 1];
					Static79.aLongArray4[local41] = Static79.aLongArray4[local41 + 1];
					Static48.anIntArray168[local41] = Static48.anIntArray168[local41 + 1];
				}
				Static102.anInt2901 = Static58.anInt1875;
				Static131.aClass1_Sub9_Sub1_3.method1283(62);
				Static131.aClass1_Sub9_Sub1_3.method1263(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIBI)V")
	public static void method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) Class1_Sub10 local15 = (Class1_Sub10) Static130.aClass4_13.method174(); local15 != null; local15 = (Class1_Sub10) Static130.aClass4_13.method181()) {
			if (local15.anInt1864 != -1 || local15.anIntArray189 != null) {
				@Pc(26) int local26 = 0;
				if (arg3 > local15.anInt1858) {
					local26 = arg3 - local15.anInt1858;
				} else if (local15.anInt1860 > arg3) {
					local26 = local15.anInt1860 - arg3;
				}
				if (arg2 > local15.anInt1871) {
					local26 += arg2 - local15.anInt1871;
				} else if (local15.anInt1856 > arg2) {
					local26 += local15.anInt1856 - arg2;
				}
				if (local15.anInt1867 < local26 - 64 || Static140.anInt3678 == 0 || arg1 != local15.anInt1872) {
					if (local15.aClass1_Sub8_Sub4_2 != null) {
						Static105.aClass1_Sub8_Sub1_1.method1088(local15.aClass1_Sub8_Sub4_2);
						local15.aClass1_Sub8_Sub4_2 = null;
					}
					if (local15.aClass1_Sub8_Sub4_3 != null) {
						Static105.aClass1_Sub8_Sub1_1.method1088(local15.aClass1_Sub8_Sub4_3);
						local15.aClass1_Sub8_Sub4_3 = null;
					}
				} else {
					local26 -= 64;
					if (local26 < 0) {
						local26 = 0;
					}
					@Pc(142) int local142 = (local15.anInt1867 - local26) * Static140.anInt3678 / local15.anInt1867;
					if (local15.aClass1_Sub8_Sub4_2 != null) {
						local15.aClass1_Sub8_Sub4_2.method2960(local142);
					} else if (local15.anInt1864 >= 0) {
						@Pc(154) Class47 local154 = Static187.method2174(Static113.aClass76_Sub1_10, local15.anInt1864, 0);
						if (local154 != null) {
							@Pc(161) Class1_Sub20_Sub1 local161 = local154.method2176().method2781(Static26.aClass77_1);
							@Pc(166) Class1_Sub8_Sub4 local166 = Static190.method2981(local161, local142);
							local166.method2968(-1);
							Static105.aClass1_Sub8_Sub1_1.method1090(local166);
							local15.aClass1_Sub8_Sub4_2 = local166;
						}
					}
					if (local15.aClass1_Sub8_Sub4_3 != null) {
						local15.aClass1_Sub8_Sub4_3.method2960(local142);
						if (!local15.aClass1_Sub8_Sub4_3.method3492()) {
							local15.aClass1_Sub8_Sub4_3 = null;
						}
					} else if (local15.anIntArray189 != null && (local15.anInt1868 -= arg0) <= 0) {
						@Pc(206) int local206 = (int) ((double) local15.anIntArray189.length * Math.random());
						@Pc(214) Class47 local214 = Static187.method2174(Static113.aClass76_Sub1_10, local15.anIntArray189[local206], 0);
						if (local214 != null) {
							@Pc(221) Class1_Sub20_Sub1 local221 = local214.method2176().method2781(Static26.aClass77_1);
							@Pc(226) Class1_Sub8_Sub4 local226 = Static190.method2981(local221, local142);
							local226.method2968(0);
							Static105.aClass1_Sub8_Sub1_1.method1090(local226);
							local15.aClass1_Sub8_Sub4_3 = local226;
							local15.anInt1868 = (int) ((double) (local15.anInt1862 - local15.anInt1863) * Math.random()) + local15.anInt1863;
						}
					}
				}
			}
		}
	}
}
