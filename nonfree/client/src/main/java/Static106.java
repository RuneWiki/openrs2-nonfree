import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "J")
	public static long aLong79;

	@OriginalMember(owner = "client!ta", name = "e", descriptor = "Lclient!jb;")
	public static Class37 aClass37_4;

	@OriginalMember(owner = "client!ta", name = "f", descriptor = "[Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3[] aClass3_Sub1_Sub5_Sub3Array10;

	@OriginalMember(owner = "client!ta", name = "j", descriptor = "Lclient!gf;")
	public static Class3_Sub1_Sub5_Sub3 aClass3_Sub1_Sub5_Sub3_24;

	@OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
	public static int anInt2444;

	@OriginalMember(owner = "client!ta", name = "q", descriptor = "[I")
	public static int[] anIntArray322;

	@OriginalMember(owner = "client!ta", name = "v", descriptor = "Lclient!ba;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "J")
	public static long aLong78 = 0L;

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "Lclient!na;")
	private static Class53 aClass53_1217 = Static109.method1737("Password: ");

	@OriginalMember(owner = "client!ta", name = "w", descriptor = "Lclient!na;")
	private static Class53 aClass53_1223 = Static109.method1737("Loading fonts )2 ");

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1218 = aClass53_1223;

	@OriginalMember(owner = "client!ta", name = "h", descriptor = "Lclient!na;")
	public static Class53 aClass53_1219 = Static109.method1737("Spiel)2Fenster geladen)3");

	@OriginalMember(owner = "client!ta", name = "k", descriptor = "Z")
	public static boolean aBoolean103 = false;

	@OriginalMember(owner = "client!ta", name = "r", descriptor = "Lclient!na;")
	private static Class53 aClass53_1221 = Static109.method1737("Public chat");

	@OriginalMember(owner = "client!ta", name = "p", descriptor = "Lclient!na;")
	public static Class53 aClass53_1220 = aClass53_1221;

	@OriginalMember(owner = "client!ta", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1222 = Static109.method1737(" )2> @whi@");

	@OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
	public static int anInt2446 = 0;

	@OriginalMember(owner = "client!ta", name = "x", descriptor = "Lclient!na;")
	public static Class53 aClass53_1224 = aClass53_1217;

	@OriginalMember(owner = "client!ta", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_1225 = Static109.method1737("Untersuchen");

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIB)I")
	public static int method1708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(II)Lclient!na;")
	public static Class53 method1709(@OriginalArg(1) int arg0) {
		return Static103.method1689(new Class53[] { Static108.method1725(arg0 >> 24 & 0xFF), Static51.aClass53_621, Static108.method1725(arg0 >> 16 & 0xFF), Static51.aClass53_621, Static108.method1725(arg0 >> 8 & 0xFF), Static51.aClass53_621, Static108.method1725(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
	public static void method1710() {
		aClass53_1219 = null;
		aClass53_1217 = null;
		aClass53_1225 = null;
		aClass53_1221 = null;
		aClass6_3 = null;
		aClass53_1224 = null;
		aClass53_1218 = null;
		aClass53_1223 = null;
		anIntArray322 = null;
		aClass53_1220 = null;
		aClass3_Sub1_Sub5_Sub3Array10 = null;
		aClass53_1222 = null;
		aClass37_4 = null;
		aClass3_Sub1_Sub5_Sub3_24 = null;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
	public static void method1711() {
		Static62.aClass27_25.method1540();
		Static109.anIntArray333 = Static24.method475(Static109.anIntArray333);
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IJ)Lclient!na;")
	public static Class53 method1712(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if ((long) 0 == arg0 % 37L) {
			return null;
		} else {
			@Pc(30) int local30 = 0;
			@Pc(32) long local32 = arg0;
			while (local32 != 0L) {
				local32 /= 37L;
				local30++;
			}
			@Pc(48) byte[] local48 = new byte[local30];
			while (arg0 != 0L) {
				@Pc(52) long local52 = arg0;
				arg0 /= 37L;
				local30--;
				local48[local30] = Static59.aByteArray29[(int) (local52 - arg0 * 37L)];
			}
			@Pc(77) Class53 local77 = new Class53();
			local77.aByteArray43 = local48;
			local77.anInt1890 = local48.length;
			return local77;
		}
	}
}
