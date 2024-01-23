import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public static int anInt235;

	@OriginalMember(owner = "client!b", name = "c", descriptor = "I")
	public static int anInt236;

	@OriginalMember(owner = "client!b", name = "g", descriptor = "I")
	public static int anInt239;

	@OriginalMember(owner = "client!b", name = "n", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!b", name = "r", descriptor = "[S")
	public static short[] aShortArray2;

	@OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
	public static int[] anIntArray27 = new int[128];

	@OriginalMember(owner = "client!b", name = "j", descriptor = "I")
	public static int anInt241 = 0;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "I")
	public static volatile int anInt243 = 0;

	@OriginalMember(owner = "client!b", name = "m", descriptor = "Lclient!hh;")
	public static Class50 aClass50_107 = Static186.method3527("loc");

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZJ)V")
	public static void method183(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static21.anInt420 >= 100 && Static65.anInt4126 != 1 || Static21.anInt420 >= 200) {
			Static123.method1275(Static189.aClass50_1255, Static7.aClass50_69, 0);
			return;
		}
		@Pc(37) Class50 local37 = Static130.method2183(arg0).method1218();
		for (@Pc(39) int local39 = 0; local39 < Static21.anInt420; local39++) {
			if (arg0 == Static129.aLongArray6[local39]) {
				Static123.method1275(Static17.method257(new Class50[] { local37, Static160.aClass50_1082 }), Static7.aClass50_69, 0);
				return;
			}
		}
		for (@Pc(78) int local78 = 0; local78 < Static201.anInt4066; local78++) {
			if (arg0 == Static118.aLongArray5[local78]) {
				Static123.method1275(Static17.method257(new Class50[] { Static79.aClass50_1056, local37, Static113.aClass50_782 }), Static7.aClass50_69, 0);
				return;
			}
		}
		if (local37.method1236(Static230.aClass20_Sub3_Sub1_3.aClass50_493)) {
			Static123.method1275(Static34.aClass50_266, Static7.aClass50_69, 0);
			return;
		}
		Static149.aClass50Array58[Static21.anInt420] = local37;
		Static129.aLongArray6[Static21.anInt420] = arg0;
		Static206.anIntArray467[Static21.anInt420] = 0;
		Static131.aClass50Array50[Static21.anInt420] = Static7.aClass50_69;
		Static113.anIntArray254[Static21.anInt420] = 0;
		Static11.aBooleanArray1[Static21.anInt420] = false;
		Static205.anInt4112 = Static31.anInt594;
		Static21.anInt420++;
		Static32.aClass1_Sub17_Sub1_1.method2182(188);
		Static32.aClass1_Sub17_Sub1_1.method2171(arg0);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method187(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}
}
