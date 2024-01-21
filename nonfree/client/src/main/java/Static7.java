import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "tb", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!af", name = "V", descriptor = "Lclient!fc;")
	private static Class25 aClass25_83 = Static78.method1313("flash2:");

	@OriginalMember(owner = "client!af", name = "N", descriptor = "Lclient!fc;")
	public static Class25 aClass25_80 = aClass25_83;

	@OriginalMember(owner = "client!af", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_81 = Static78.method1313("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!af", name = "Q", descriptor = "[[[Lclient!aa;")
	public static Class2[][][] aClass2ArrayArrayArray1 = new Class2[4][104][104];

	@OriginalMember(owner = "client!af", name = "U", descriptor = "Lclient!fc;")
	public static Class25 aClass25_82 = Static78.method1313("Hierhin gehen");

	@OriginalMember(owner = "client!af", name = "W", descriptor = "Lclient!aa;")
	public static Class2 aClass2_2 = new Class2();

	@OriginalMember(owner = "client!af", name = "bb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray3 = new int[4][105][105];

	@OriginalMember(owner = "client!af", name = "db", descriptor = "Lclient!fc;")
	public static Class25 aClass25_84 = aClass25_83;

	@OriginalMember(owner = "client!af", name = "lb", descriptor = "I")
	public static int anInt166 = 0;

	@OriginalMember(owner = "client!af", name = "qb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_87 = Static78.method1313(" more options");

	@OriginalMember(owner = "client!af", name = "ob", descriptor = "Lclient!fc;")
	public static Class25 aClass25_85 = aClass25_87;

	@OriginalMember(owner = "client!af", name = "pb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_86 = Static78.method1313("(U3");

	@OriginalMember(owner = "client!af", name = "rb", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray4 = new int[4][13][13];

	@OriginalMember(owner = "client!af", name = "sb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_88 = Static78.method1313("<col=ff7000>");

	@OriginalMember(owner = "client!af", name = "ub", descriptor = "I")
	public static int anInt169 = 0;

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(I)V")
	public static void method126() {
		aClass25_86 = null;
		aClass25_83 = null;
		aClass25_84 = null;
		aClass25_82 = null;
		aClass2ArrayArrayArray1 = null;
		aClass25_88 = null;
		aClass25_81 = null;
		aClass2_2 = null;
		anIntArrayArrayArray3 = null;
		aClass25_85 = null;
		aClass25_80 = null;
		aClass1_Sub2_Sub2_Sub4_2 = null;
		anIntArrayArrayArray4 = null;
		aClass25_87 = null;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II[B)I")
	public static int method127(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		return Static38.method877(arg0, arg1, 0);
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(I)V")
	public static void method128() {
		@Pc(3) Class29 local3 = Static11.aClass29_1;
		synchronized (Static11.aClass29_1) {
			Static26.anInt728 = Static42.anInt1142;
			@Pc(18) int local18;
			if (Static52.anInt1262 >= 0) {
				while (Static109.anInt2515 != Static52.anInt1262) {
					local18 = Static48.anIntArray243[Static109.anInt2515];
					Static109.anInt2515 = Static109.anInt2515 + 1 & 0x7F;
					if (local18 >= 0) {
						Static99.aBooleanArray11[local18] = true;
					} else {
						Static99.aBooleanArray11[~local18] = false;
					}
				}
			} else {
				for (local18 = 0; local18 < 112; local18++) {
					Static99.aBooleanArray11[local18] = false;
				}
				Static52.anInt1262 = Static109.anInt2515;
			}
			Static42.anInt1142 = Static10.anInt265;
		}
	}

	@OriginalMember(owner = "client!af", name = "g", descriptor = "(I)V")
	public static void method132() {
		Static66.aClass63_9.method1513();
	}

	@OriginalMember(owner = "client!af", name = "h", descriptor = "(I)V")
	public static void method133() {
		for (@Pc(10) Class1_Sub16 local10 = (Class1_Sub16) Static38.aClass2_5.method22(); local10 != null; local10 = (Class1_Sub16) Static38.aClass2_5.method23()) {
			if (local10.anInt2585 == -1) {
				local10.anInt2591 = 0;
				Static112.method1807(local10);
			} else {
				local10.method2024();
			}
		}
	}
}
