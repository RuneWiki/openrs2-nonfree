import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
	public static int anInt2188;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "I")
	public static int anInt2189;

	@OriginalMember(owner = "client!pd", name = "z", descriptor = "Lclient!qd;")
	public static Class54_Sub1 aClass54_Sub1_38;

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!ne;")
	public static Class3_Sub3_Sub2_Sub4 aClass3_Sub3_Sub2_Sub4_89;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1030 = Static87.method1648("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!fc;")
	public static Class21 aClass21_25 = new Class21(50);

	@OriginalMember(owner = "client!pd", name = "l", descriptor = "I")
	public static int anInt2185 = 0;

	@OriginalMember(owner = "client!pd", name = "p", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1032 = Static87.method1648("Continue");

	@OriginalMember(owner = "client!pd", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1031 = aClass27_1032;

	@OriginalMember(owner = "client!pd", name = "r", descriptor = "Lclient!fc;")
	public static Class21 aClass21_26 = new Class21(100);

	@OriginalMember(owner = "client!pd", name = "t", descriptor = "Z")
	public static boolean aBoolean104 = true;

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1033 = Static87.method1648("chatback");

	@OriginalMember(owner = "client!pd", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1034 = Static87.method1648("Please remove ");

	@OriginalMember(owner = "client!pd", name = "w", descriptor = "[B")
	public static byte[] aByteArray20 = new byte[520];

	@OriginalMember(owner = "client!pd", name = "x", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1035 = aClass27_1034;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1038 = Static87.method1648("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!pd", name = "B", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1036 = aClass27_1038;

	@OriginalMember(owner = "client!pd", name = "C", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1037 = aClass27_1034;

	@OriginalMember(owner = "client!pd", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1039 = Static87.method1648("Texturen geladen)3");

	@OriginalMember(owner = "client!pd", name = "F", descriptor = "I")
	public static int anInt2190 = 0;

	@OriginalMember(owner = "client!pd", name = "G", descriptor = "I")
	public static int anInt2191 = 99;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)Z")
	public static boolean method1535(@OriginalArg(1) int arg0) {
		if (Static59.aBooleanArray9[arg0]) {
			return true;
		} else if (Static92.aClass54_31.method1611(arg0)) {
			@Pc(23) int local23 = Static92.aClass54_31.method1609(arg0);
			if (local23 == 0) {
				Static59.aBooleanArray9[arg0] = true;
				return true;
			}
			if (Static96.aClass3_Sub3_Sub6ArrayArray5[arg0] == null) {
				Static96.aClass3_Sub3_Sub6ArrayArray5[arg0] = new Class3_Sub3_Sub6[local23];
			}
			for (@Pc(45) int local45 = 0; local45 < local23; local45++) {
				if (Static96.aClass3_Sub3_Sub6ArrayArray5[arg0][local45] == null) {
					@Pc(59) byte[] local59 = Static92.aClass54_31.method1615(arg0, local45);
					if (local59 != null) {
						Static96.aClass3_Sub3_Sub6ArrayArray5[arg0][local45] = new Class3_Sub3_Sub6();
						Static96.aClass3_Sub3_Sub6ArrayArray5[arg0][local45].method1156(new Class3_Sub11(local59));
					}
				}
			}
			Static59.aBooleanArray9[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	public static void method1536() {
		if (Static13.aClass9_3 != null) {
			Static13.aClass9_3.method1873();
			Static13.aClass9_3 = null;
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(II)V")
	public static void method1537(@OriginalArg(0) int arg0) {
		Static66.anInt1717 = arg0;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIB)V")
	public static void method1538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = arg3; local3 <= arg3 + arg0; local3++) {
			for (@Pc(9) int local9 = arg2; local9 <= arg1 + arg2; local9++) {
				if (local9 >= 0 && local9 < 104 && local3 >= 0 && local3 < 104) {
					Static82.aByteArrayArrayArray7[0][local9][local3] = 127;
					if (local9 == arg2 && local9 > 0) {
						Static55.anIntArrayArrayArray4[0][local9][local3] = Static55.anIntArrayArrayArray4[0][local9 - 1][local3];
					}
					if (local9 == arg2 + arg1 && local9 < 103) {
						Static55.anIntArrayArrayArray4[0][local9][local3] = Static55.anIntArrayArrayArray4[0][local9 + 1][local3];
					}
					if (arg3 == local3 && local3 > 0) {
						Static55.anIntArrayArrayArray4[0][local9][local3] = Static55.anIntArrayArrayArray4[0][local9][local3 - 1];
					}
					if (local3 == arg3 + arg0 && local3 < 103) {
						Static55.anIntArrayArrayArray4[0][local9][local3] = Static55.anIntArrayArrayArray4[0][local9][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
	public static void method1539() {
		aClass27_1033 = null;
		aClass27_1038 = null;
		aClass27_1037 = null;
		aClass27_1031 = null;
		aClass21_25 = null;
		aClass27_1032 = null;
		aClass27_1034 = null;
		aClass27_1036 = null;
		aClass21_26 = null;
		aClass3_Sub3_Sub2_Sub4_89 = null;
		aClass27_1035 = null;
		aByteArray20 = null;
		aClass54_Sub1_38 = null;
		aClass27_1030 = null;
		aClass27_1039 = null;
	}
}
