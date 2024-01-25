import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!dt", name = "J", descriptor = "F")
	public static float aFloat28;

	@OriginalMember(owner = "client!dt", name = "P", descriptor = "Lclient!qe;")
	public static Class268 aClass268_38;

	@OriginalMember(owner = "client!dt", name = "W", descriptor = "I")
	public static int anInt2206;

	@OriginalMember(owner = "client!dt", name = "eb", descriptor = "Lclient!qq;")
	public static Class276 aClass276_1;

	@OriginalMember(owner = "client!dt", name = "R", descriptor = "I")
	public static final int anInt2203 = 50;

	@OriginalMember(owner = "client!dt", name = "I", descriptor = "[I")
	public static final int[] anIntArray150 = new int[anInt2203];

	@OriginalMember(owner = "client!dt", name = "K", descriptor = "I")
	public static int anInt2201 = -1;

	@OriginalMember(owner = "client!dt", name = "N", descriptor = "[I")
	public static final int[] anIntArray151 = new int[anInt2203];

	@OriginalMember(owner = "client!dt", name = "O", descriptor = "[I")
	public static final int[] anIntArray152 = new int[anInt2203];

	@OriginalMember(owner = "client!dt", name = "T", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray23 = new String[anInt2203];

	@OriginalMember(owner = "client!dt", name = "ab", descriptor = "[I")
	public static final int[] anIntArray153 = new int[anInt2203];

	@OriginalMember(owner = "client!dt", name = "cb", descriptor = "[I")
	public static int[] anIntArray154 = new int[2];

	@OriginalMember(owner = "client!dt", name = "hb", descriptor = "[I")
	public static final int[] anIntArray155 = new int[anInt2203];

	@OriginalMember(owner = "client!dt", name = "jb", descriptor = "[I")
	public static final int[] anIntArray156 = new int[anInt2203];

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "(I)V")
	public static void method1848() {
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub28_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub28_2);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub10_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub10_2);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub2_1);
		Static348.aClass6_Sub22_19.method3534(1, Static348.aClass6_Sub22_19.aClass15_Sub14_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub21_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub5_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub8_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub26_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub27_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub1_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub6_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub23_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_2);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub11_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub19_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub24_1);
		Static348.aClass6_Sub22_19.method3534(0, Static348.aClass6_Sub22_19.aClass15_Sub25_1);
		Static34.method4607();
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub16_1);
		Static348.aClass6_Sub22_19.method3534(2, Static348.aClass6_Sub22_19.aClass15_Sub13_1);
		Static499.method7443();
		Static245.method5548();
		Static585.aBoolean670 = true;
	}

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "(I)Ljava/lang/String;")
	public static String method1851() {
		@Pc(7) String local7 = "www";
		if (Static430.aClass35_4 == Static212.aClass35_2) {
			local7 = "www-wtrc";
		} else if (Static436.aClass35_5 == Static212.aClass35_2) {
			local7 = "www-wtqa";
		} else if (Static41.aClass35_1 == Static212.aClass35_2) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static162.aString32 != null) {
			local33 = "/p=" + Static162.aString32;
		}
		return "http://" + local7 + "." + Static630.aClass271_17.aString92 + ".com/l=" + Static307.anInt5931 + "/a=" + Static364.anInt6726 + local33 + "/";
	}

	@OriginalMember(owner = "client!dt", name = "f", descriptor = "(I)V")
	public static void method1853() {
		if (Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 0 && Static110.anInt2165 != Static175.anInt3636) {
			Static323.method5375(false, Static500.anInt8419, Static436.anInt7900, 11);
		} else {
			Static267.method4759(Static162.aClass100_7);
			if (Static454.anInt8106 != Static175.anInt3636) {
				Static485.method7236();
			}
		}
	}
}
