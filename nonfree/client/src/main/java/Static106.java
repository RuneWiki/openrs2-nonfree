import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!lc;")
	public static Class98 aClass98_65;

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
	public static int anInt2266;

	@OriginalMember(owner = "client!ia", name = "s", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "J")
	public static long aLong87 = 0L;

	@OriginalMember(owner = "client!ia", name = "v", descriptor = "Lclient!dh;")
	public static Class33 aClass33_18 = new Class33(64);

	@OriginalMember(owner = "client!ia", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString68 = "";

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
	public static String method1730(@OriginalArg(2) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(40) int local40 = 2;
		@Pc(51) int local51 = arg0 / 10;
		while (local51 != 0) {
			local51 /= 10;
			local40++;
		}
		@Pc(66) char[] local66 = new char[local40];
		local66[0] = '+';
		for (@Pc(74) int local74 = local40 - 1; local74 > 0; local74--) {
			@Pc(79) int local79 = arg0;
			arg0 /= 10;
			@Pc(90) int local90 = local79 - arg0 * 10;
			if (local90 < 10) {
				local66[local74] = (char) (local90 + 48);
			} else {
				local66[local74] = (char) (local90 + 87);
			}
		}
		return new String(local66);
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method1731() {
		aString68 = null;
		aClass33_18 = null;
		aByteArrayArrayArray5 = null;
		aClass98_65 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1732() {
		Static256.aClass33_37.method843();
	}

	@OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
	public static void method1733() {
		Static266.aClass4_Sub2_Sub1_10 = null;
		Static250.aClass4_Sub2_Sub1_8 = null;
		Static3.aClass4_Sub2_Sub1_1 = null;
		Static28.aClass4_Sub2_Sub1_2 = null;
		Static170.aClass4_Sub2_Sub1_6 = null;
	}
}
