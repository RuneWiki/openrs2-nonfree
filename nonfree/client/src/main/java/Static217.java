import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "Lclient!dk;")
	public static Class54 aClass54_63;

	@OriginalMember(owner = "client!kp", name = "r", descriptor = "I")
	public static int anInt3574;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "Lclient!dk;")
	public static Class54 aClass54_64;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_58 = new Class134("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(IIILclient!dc;IIIZILclient!dc;)V")
	public static void method2870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub4_Sub1 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(9) Class3_Sub4_Sub1 arg6) {
		@Pc(7) int local7 = arg3.method3998();
		if (local7 == -1) {
			return;
		}
		@Pc(20) Class13 local20 = (Class13) Static314.aClass132_48.method2701((long) local7);
		if (local20 == null) {
			@Pc(27) Class17[] local27 = Static461.method256(Static103.aClass54_28, local7);
			if (local27 == null) {
				return;
			}
			local20 = Static82.aClass163_1.method5549(local27[0]);
			Static314.aClass132_48.method2711(local20, (long) local7);
		}
		Static456.method5710(arg6.method4009() * 64, 0, arg6.aByte91, arg2 >> 1, arg6.anInt6835, arg6.anInt6833, arg5 >> 1);
		@Pc(73) int local73 = Static31.anIntArray53[0] + arg0 - 18;
		@Pc(81) int local81 = local73 + arg1 / 4 * 18;
		@Pc(91) int local91 = Static31.anIntArray53[1] + arg4 - 16 - 54;
		@Pc(99) int local99 = local91 + arg1 % 4 * 18;
		local20.method5668(local81, local99);
		if (arg6 == arg3) {
			Static82.aClass163_1.method5504(-256, 18, local99 - 1, 18, local81 - 1);
		}
		@Pc(121) Class21_Sub4 local121 = Static326.method4919();
		local121.anInt3115 = local99;
		local121.anInt3116 = local81;
		local121.anInt3119 = local99 + 16;
		local121.anInt3117 = local81 + 16;
		local121.aClass3_Sub4_Sub1_1 = arg3;
		Static313.aClass93_5.method2079(local121);
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILclient!at;II)V")
	public static void method2871(@OriginalArg(1) Class16 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static215.aBoolean217) {
			@Pc(175) Class200 local175 = Static405.anInt6628 == -1 ? null : Static234.aClass135_1.method2749(Static405.anInt6628);
			if (Static55.method815(arg0).method1537() && (Static256.anInt2800 & 0x20) != 0 && (local175 == null || arg0.method236(local175.anInt5511, Static405.anInt6628) != local175.anInt5511)) {
				Static153.method2190(arg0.anInt320, Static76.aString45, true, Static201.anInt3379, Static408.aString205 + " -> " + arg0.aString13, arg0.anInt301, arg0.anInt293, 25, false, 0L);
			}
			return;
		}
		@Pc(12) String local12;
		for (@Pc(5) int local5 = 9; local5 >= 5; local5--) {
			local12 = Static251.method3195(local5, arg0);
			if (local12 != null) {
				Static153.method2190(arg0.anInt320, local12, true, Static65.method967(arg0, local5), arg0.aString13, arg0.anInt301, arg0.anInt293, 1002, false, (long) (local5 + 1));
			}
		}
		local12 = Static460.method5500(arg0);
		if (local12 != null) {
			Static153.method2190(arg0.anInt320, local12, true, arg0.anInt338, arg0.aString13, arg0.anInt301, arg0.anInt293, 11, false, 0L);
		}
		for (@Pc(73) int local73 = 4; local73 >= 0; local73--) {
			@Pc(80) String local80 = Static251.method3195(local73, arg0);
			if (local80 != null) {
				Static153.method2190(arg0.anInt320, local80, true, Static65.method967(arg0, local73), arg0.aString13, arg0.anInt301, arg0.anInt293, 23, false, (long) (local73 + 1));
			}
		}
		if (!Static55.method815(arg0).method1533()) {
			return;
		}
		if (arg0.aString12 == null) {
			Static153.method2190(arg0.anInt320, Static412.aClass134_96.method2720(Static331.anInt5597), true, -1, "", arg0.anInt301, arg0.anInt293, 8, false, 0L);
		} else {
			Static153.method2190(arg0.anInt320, arg0.aString12, true, -1, "", arg0.anInt301, arg0.anInt293, 8, false, 0L);
		}
	}
}
