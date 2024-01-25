import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "I")
	public static int anInt8;

	@OriginalMember(owner = "client!vl", name = "e", descriptor = "Lclient!tj;")
	public static Class193 aClass193_2;

	@OriginalMember(owner = "client!vl", name = "h", descriptor = "I")
	public static int anInt12;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "[I")
	public static int[] anIntArray4;

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "[I")
	public static final int[] anIntArray3 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Z")
	public static boolean method8() {
		if (Static302.aBoolean427) {
			try {
				if ((Boolean) Static366.method4253("showingVideoAd", Static1.aClass134_7.anApplet1)) {
					return false;
				}
				return true;
			} catch (@Pc(26) Throwable local26) {
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(BZ)V")
	public static void method10(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static357.anInt6821 != -1) {
				Static298.method4927(Static357.anInt6821);
			}
			for (@Pc(19) Class4_Sub25 local19 = (Class4_Sub25) Static270.aClass43_29.method1283(); local19 != null; local19 = (Class4_Sub25) Static270.aClass43_29.method1278()) {
				if (!local19.method5689()) {
					local19 = (Class4_Sub25) Static270.aClass43_29.method1283();
					if (local19 == null) {
						break;
					}
				}
				Static234.method4154(true, local19, false);
			}
			Static357.anInt6821 = -1;
			Static270.aClass43_29 = new Class43(8);
			Static116.method2425();
			Static357.anInt6821 = Static304.anInt5823;
			Static196.method5556(false);
			Static12.method242();
			Static164.method3191(Static357.anInt6821);
		}
		Static37.method748();
		Static273.anInt5438 = -1;
		Static75.method1747(Static65.anInt1680);
		Static158.aClass8_Sub1_Sub2_Sub1_1 = new Class8_Sub1_Sub2_Sub1();
		Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray415[0] = 52;
		Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6701 = 6656;
		Static158.aClass8_Sub1_Sub2_Sub1_1.anInt6702 = 6656;
		Static158.aClass8_Sub1_Sub2_Sub1_1.anIntArray416[0] = 52;
		Static129.anInt3039 = 0;
		Static240.anInt4829 = 0;
		if (Static353.anInt2640 == 2) {
			Static240.anInt4829 = Static237.anInt6655 << 7;
			Static129.anInt3039 = Static74.anInt1924 << 7;
		} else {
			Static292.method4890();
		}
		Static244.method4316();
		if (Static240.anInt4829 == 0 || Static129.anInt3039 == 0) {
			Static243.method5095(10);
		} else {
			Static161.method3159();
			Static243.method5095(28);
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(II)V")
	public static void method13(@OriginalArg(1) int arg0) {
		Static143.anInt3247 = arg0;
		@Pc(11) Class198 local11 = Static349.aClass198_242;
		synchronized (Static349.aClass198_242) {
			Static349.aClass198_242.method5213();
		}
	}
}
