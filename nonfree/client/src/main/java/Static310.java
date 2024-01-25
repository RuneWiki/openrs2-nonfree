import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!kia", name = "T", descriptor = "D")
	public static double aDouble21;

	@OriginalMember(owner = "client!kia", name = "V", descriptor = "Lclient!lu;")
	public static Class231 aClass231_2;

	@OriginalMember(owner = "client!kia", name = "J", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_103 = new Class126(2, 1);

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ILjava/lang/String;BLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V")
	public static void method4784(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		Static30.method942(arg4, arg1, (String) null, -1, arg2, arg0, arg5, arg3);
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZZ[B)V")
	public static void method4786(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static115.aClass3_Sub17_3 == null) {
			Static115.aClass3_Sub17_3 = new Class3_Sub17(20000);
		}
		Static115.aClass3_Sub17_3.method4838(0, arg1.length, arg1);
		if (!arg0) {
			return;
		}
		Static442.method6429(Static115.aClass3_Sub17_3.aByteArray59);
		Static491.aClass31_Sub1Array7 = new Class31_Sub1[Static120.anInt2362];
		@Pc(31) int local31 = 0;
		for (@Pc(33) int local33 = Static414.anInt7011; local33 <= Static119.anInt2334; local33++) {
			@Pc(39) Class31_Sub1 local39 = Static59.method1456(local33);
			if (local39 != null) {
				Static491.aClass31_Sub1Array7[local31++] = local39;
			}
		}
		Static140.aBoolean211 = false;
		Static94.aLong59 = Static131.method2268();
		Static115.aClass3_Sub17_3 = null;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIII)V")
	public static void method4787(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = Static227.aClass3_Sub15_11.aClass17_Sub3_2.method741() * arg1 >> 8;
		if (local12 == 0 || arg2 == -1) {
			return;
		}
		if (!Static666.aBoolean755 && Static149.anInt2812 != -1 && Static160.method2734() && !Static340.method5165()) {
			Static344.aClass3_Sub9_Sub5_1 = Static272.method4340();
			@Pc(41) Class3_Sub9_Sub5 local41 = Static552.method7577(Static344.aClass3_Sub9_Sub5_1);
			Static619.method8224(local41);
		}
		Static507.method7179(arg2, Static22.aClass143_6, local12);
		Static481.method6843(-1, 255);
		Static666.aBoolean755 = true;
	}
}
