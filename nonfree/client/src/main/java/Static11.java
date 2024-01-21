import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!c", name = "n", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!c", name = "e", descriptor = "I")
	public static int anInt464 = 0;

	@OriginalMember(owner = "client!c", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_174 = Static56.method972("::");

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Lclient!ae;")
	private static Class5 aClass5_175 = Static56.method972("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!c", name = "q", descriptor = "Lclient!ae;")
	private static Class5 aClass5_176 = Static56.method972("Moderator option: Mute player for 48 hours: <OFF>");

	@OriginalMember(owner = "client!c", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_177 = Static56.method972("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!c", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_178 = Static56.method972("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen");

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Lclient!ae;")
	public static Class5 aClass5_179 = aClass5_175;

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_180 = Static56.method972("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!c", name = "y", descriptor = "I")
	public static volatile int anInt476 = -1;

	@OriginalMember(owner = "client!c", name = "z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_181 = aClass5_176;

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(B)[Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4[] method318() {
		@Pc(13) Class3_Sub1_Sub2_Sub4[] local13 = new Class3_Sub1_Sub2_Sub4[Static18.anInt630];
		for (@Pc(15) int local15 = 0; local15 < Static18.anInt630; local15++) {
			@Pc(25) Class3_Sub1_Sub2_Sub4 local25 = local13[local15] = new Class3_Sub1_Sub2_Sub4();
			local25.anInt2811 = Static14.anInt2882;
			local25.anInt2812 = Static80.anInt1994;
			local25.anInt2813 = Static50.anIntArray157[local15];
			local25.anInt2808 = Static63.anIntArray375[local15];
			local25.anInt2809 = Static56.anIntArray170[local15];
			local25.anInt2810 = Static116.anIntArray382[local15];
			local25.anIntArray364 = Static89.anIntArray256;
			local25.aByteArray24 = Static38.aByteArrayArray6[local15];
		}
		Static21.method436();
		return local13;
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(II)V")
	public static void method319(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static58.method1005(Static15.aClass5_208, Static15.aClass5_232, Static92.aClass5_1078);
		} else if (arg0 == -2) {
			Static58.method1005(Static18.aClass5_282, Static15.aClass5_248, Static15.aClass5_227);
		} else if (arg0 == -1) {
			Static58.method1005(Static15.aClass5_214, Static15.aClass5_235, Static90.aClass5_1065);
		} else if (arg0 == 3) {
			Static58.method1005(Static116.aClass5_1368, Static15.aClass5_231, Static15.aClass5_238);
		} else if (arg0 == 4) {
			Static58.method1005(Static30.aClass5_398, Static15.aClass5_240, Static108.aClass5_1277);
		} else if (arg0 == 5) {
			Static58.method1005(Static5.aClass5_105, Static15.aClass5_244, Static43.aClass5_567);
		} else if (arg0 == 6) {
			Static58.method1005(Static106.aClass5_1230, Static15.aClass5_230, Static104.aClass5_815);
		} else if (arg0 == 7) {
			Static58.method1005(Static109.aClass5_1287, Static15.aClass5_237, Static9.aClass5_163);
		} else if (arg0 == 8) {
			Static58.method1005(Static72.aClass5_861, Static15.aClass5_253, Static14.aClass5_1294);
		} else if (arg0 == 9) {
			Static58.method1005(Static35.aClass5_465, Static15.aClass5_257, Static34.aClass5_451);
		} else if (arg0 == 10) {
			Static58.method1005(Static105.aClass5_1207, Static15.aClass5_256, Static14.aClass5_1295);
		} else if (arg0 == 11) {
			Static58.method1005(Static5.aClass5_109, Static15.aClass5_242, Static34.aClass5_456);
		} else if (arg0 == 12) {
			Static58.method1005(Static52.aClass5_677, Static15.aClass5_250, Static74.aClass5_877);
		} else if (arg0 == 13) {
			Static58.method1005(Static15.aClass5_213, Static15.aClass5_249, Static23.aClass5_326);
		} else if (arg0 == 14) {
			Static58.method1005(Static32.aClass5_422, Static15.aClass5_224, Static104.aClass5_821);
		} else if (arg0 == 16) {
			Static58.method1005(Static46.aClass5_608, Static15.aClass5_254, Static43.aClass5_560);
		} else if (arg0 == 17) {
			Static58.method1005(Static79.aClass5_904, Static15.aClass5_234, Static15.aClass5_216);
		} else if (arg0 == 18) {
			Static58.method1005(Static110.aClass5_1305, Static15.aClass5_255, Static15.aClass5_209);
		} else if (arg0 == 19) {
			Static58.method1005(Static31.aClass5_525, Static109.aClass5_1286, aClass5_179);
		} else if (arg0 == 20) {
			Static58.method1005(Static15.aClass5_211, Static15.aClass5_252, Static14.aClass5_1296);
		} else if (arg0 == 22) {
			Static58.method1005(Static24.aClass5_328, Static15.aClass5_236, Static110.aClass5_1308);
		} else if (arg0 == 23) {
			Static58.method1005(Static32.aClass5_421, Static15.aClass5_233, Static16.aClass5_268);
		} else if (arg0 == 24) {
			Static58.method1005(Static35.aClass5_466, Static15.aClass5_225, Static100.aClass5_1131);
		} else if (arg0 == 25) {
			Static58.method1005(Static15.aClass5_207, Static15.aClass5_246, Static105.aClass5_1209);
		} else if (arg0 == 26) {
			Static58.method1005(Static92.aClass5_1079, Static15.aClass5_243, Static43.aClass5_566);
		} else if (arg0 == 27) {
			Static58.method1005(Static9.aClass5_166, Static15.aClass5_229, Static15.aClass5_239);
		} else {
			Static58.method1005(Static15.aClass5_222, Static15.aClass5_245, Static4.aClass5_101);
		}
		Static116.method1971(10);
	}

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
	public static void method320() {
		aClass5_178 = null;
		aClass5_179 = null;
		aClass5_176 = null;
		aClass5_180 = null;
		aClass5_181 = null;
		aFrame1 = null;
		aClass5_174 = null;
		aClass5_177 = null;
		aClass5_175 = null;
	}
}
