import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Z")
	public static boolean aBoolean167;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "Lclient!hc;")
	public static Class51 aClass51_41;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23 = new String[100];

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
	public static int anInt3108 = 0;

	@OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
	public static int anInt3111 = 0;

	@OriginalMember(owner = "client!kc", name = "eb", descriptor = "Z")
	public static boolean aBoolean169 = false;

	@OriginalMember(owner = "client!kc", name = "hb", descriptor = "Ljava/lang/String;")
	public static String aString195 = "Select";

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method2366() {
		Static58.aClass1_Sub13_Sub1_1.method1817();
		@Pc(18) int local18 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
		if (local18 == 0) {
			return;
		}
		@Pc(28) int local28 = Static58.aClass1_Sub13_Sub1_1.method1826(2);
		if (local28 == 0) {
			Static126.anIntArray244[Static253.anInt3818++] = 2047;
			return;
		}
		@Pc(52) int local52;
		@Pc(64) int local64;
		if (local28 == 1) {
			local52 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
			Static83.aClass9_Sub1_Sub1_1.method210(1, local52);
			local64 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
			if (local64 == 1) {
				Static126.anIntArray244[Static253.anInt3818++] = 2047;
			}
		} else if (local28 == 2) {
			if (Static58.aClass1_Sub13_Sub1_1.method1826(1) == 1) {
				local52 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
				Static83.aClass9_Sub1_Sub1_1.method210(2, local52);
				local64 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
				Static83.aClass9_Sub1_Sub1_1.method210(2, local64);
			} else {
				local52 = Static58.aClass1_Sub13_Sub1_1.method1826(3);
				Static83.aClass9_Sub1_Sub1_1.method210(0, local52);
			}
			local52 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
			if (local52 == 1) {
				Static126.anIntArray244[Static253.anInt3818++] = 2047;
			}
		} else if (local28 == 3) {
			local52 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
			if (local52 == 1) {
				Static126.anIntArray244[Static253.anInt3818++] = 2047;
			}
			local64 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
			@Pc(179) int local179 = Static58.aClass1_Sub13_Sub1_1.method1826(7);
			@Pc(184) int local184 = Static58.aClass1_Sub13_Sub1_1.method1826(7);
			Static137.anInt3321 = Static58.aClass1_Sub13_Sub1_1.method1826(2);
			Static83.aClass9_Sub1_Sub1_1.method187(local179, local184, local64 == 1);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II[B)I")
	public static int method2367(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static49.method986(arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)Lclient!s;")
	public static Class115_Sub1 method2369() {
		Static113.anInt5511 = 0;
		return Static63.method1235();
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method2372() {
		Static171.aClass1_Sub13_Sub1_3.method1825(28);
		Static171.aClass1_Sub13_Sub1_3.method1789(Static175.anInt4027);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!se;I)Ljava/lang/String;")
	public static String method2373(@OriginalArg(0) int arg0, @OriginalArg(1) Class122 arg1) {
		if (!Static39.method702(arg1).method3655(arg0) && arg1.anObjectArray29 == null) {
			return null;
		} else if (arg1.aStringArray36 == null || arg1.aStringArray36.length <= arg0 || arg1.aStringArray36[arg0] == null || arg1.aStringArray36[arg0].trim().length() == 0) {
			return Static70.aBoolean113 ? "Hidden-" + arg0 : null;
		} else {
			return arg1.aStringArray36[arg0];
		}
	}
}
