import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static578 {

	@OriginalMember(owner = "client!un", name = "z", descriptor = "Lclient!of;")
	public static Class240 aClass240_12;

	@OriginalMember(owner = "client!un", name = "E", descriptor = "I")
	public static int anInt8192 = 0;

	@OriginalMember(owner = "client!un", name = "I", descriptor = "Z")
	public static boolean aBoolean579 = false;

	@OriginalMember(owner = "client!un", name = "K", descriptor = "I")
	public static int anInt8196 = 2;

	@OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
	public static int anInt8201 = 0;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I")
	public static int method6998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static15.aShortArrayArray1 == null ? 0 : Static15.aShortArrayArray1[arg0][arg1] & 0xFFFF;
	}

	@OriginalMember(owner = "client!un", name = "n", descriptor = "(I)Z")
	public static boolean method7000() {
		if (Static280.aClass2_Sub6_Sub3_3 == null) {
			return false;
		} else {
			if (Static280.aClass2_Sub6_Sub3_3.anInt2631 >= 2000) {
				Static280.aClass2_Sub6_Sub3_3.anInt2631 -= 2000;
			}
			return Static280.aClass2_Sub6_Sub3_3.anInt2631 == 1011;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIII)V")
	public static void method7001(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg3 >= Static161.anInt7734 && Static38.anInt823 >= arg0 && arg4 >= Static380.anInt7421 && Static237.anInt5159 >= arg2) {
			Static372.method6249(arg2, arg0, arg3, arg4, arg1);
		} else {
			Static506.method7811(arg4, arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!un", name = "o", descriptor = "(I)Lclient!mf;")
	public static Class206_Sub1 method7002() {
		Static491.anInt9078 = 0;
		return Static16.method334();
	}
}
