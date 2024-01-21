import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	public static int anInt3333;

	@OriginalMember(owner = "client!qh", name = "Q", descriptor = "Lclient!fd;")
	public static Class7_Sub1 aClass7_Sub1_15;

	@OriginalMember(owner = "client!qh", name = "u", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1093 = Static170.method3101("Password: ");

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1092 = aClass28_1093;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	public static int anInt3334 = 0;

	@OriginalMember(owner = "client!qh", name = "x", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1094 = Static170.method3101("compass");

	@OriginalMember(owner = "client!qh", name = "fb", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1102 = Static170.method3101("Loaded textures");

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1095 = aClass28_1102;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1096 = Static170.method3101("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!qh", name = "C", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1097 = Static170.method3101("<img=0>");

	@OriginalMember(owner = "client!qh", name = "P", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1099 = Static170.method3101("level)2");

	@OriginalMember(owner = "client!qh", name = "M", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1098 = aClass28_1099;

	@OriginalMember(owner = "client!qh", name = "U", descriptor = "Z")
	public static boolean aBoolean160 = false;

	@OriginalMember(owner = "client!qh", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1100 = Static170.method3101("(U(Y");

	@OriginalMember(owner = "client!qh", name = "ab", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1101 = Static170.method3101("::noclip");

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	public static void method2565() {
		aClass28_1093 = null;
		aClass28_1096 = null;
		aClass28_1101 = null;
		aClass28_1098 = null;
		aClass28_1094 = null;
		aClass28_1095 = null;
		aClass7_Sub1_15 = null;
		aClass28_1097 = null;
		aClass28_1100 = null;
		aClass28_1099 = null;
		aClass28_1102 = null;
		aClass28_1092 = null;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IZIII)V")
	public static void method2566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) int local12 = arg3; local12 <= arg1 + arg3; local12++) {
			for (@Pc(16) int local16 = arg2; local16 <= arg2 + arg0; local16++) {
				if (local16 >= 0 && local16 < 104 && local12 >= 0 && local12 < 104) {
					Static172.aByteArrayArrayArray45[0][local16][local12] = 127;
					if (local16 == arg2 && local16 > 0) {
						Static90.anIntArrayArrayArray31[0][local16][local12] = Static90.anIntArrayArrayArray31[0][local16 - 1][local12];
					}
					if (local16 == arg0 + arg2 && local16 < 103) {
						Static90.anIntArrayArrayArray31[0][local16][local12] = Static90.anIntArrayArrayArray31[0][local16 + 1][local12];
					}
					if (arg3 == local12 && local12 > 0) {
						Static90.anIntArrayArrayArray31[0][local16][local12] = Static90.anIntArrayArrayArray31[0][local16][local12 - 1];
					}
					if (local12 == arg1 + arg3 && local12 < 103) {
						Static90.anIntArrayArrayArray31[0][local16][local12] = Static90.anIntArrayArrayArray31[0][local16][local12 + 1];
					}
				}
			}
		}
	}
}
