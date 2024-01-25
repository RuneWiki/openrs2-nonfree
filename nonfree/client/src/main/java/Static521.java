import jagex3.jagmisc.jagmisc;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Lclient!da;")
	public static Class63 aClass63_14;

	@OriginalMember(owner = "client!sj", name = "g", descriptor = "Lclient!fe;")
	public static Class105 aClass105_2;

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public static int anInt8817;

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "Lclient!uu;")
	public static Class343 aClass343_238;

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
	public static int anInt8816 = 0;

	@OriginalMember(owner = "client!sj", name = "i", descriptor = "Z")
	public static boolean aBoolean654 = true;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZI)Lclient!uu;")
	private static Class343 method7579(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Class196 local5 = null;
		if (Static8.aClass305_1 != null) {
			local5 = new Class196(arg0, Static8.aClass305_1, Static405.aClass305Array1[arg0], 1000000);
		}
		Static624.aClass40_Sub1Array2[arg0] = Static365.aClass183_1.method4575(arg0, Static35.aClass196_1, local5);
		Static624.aClass40_Sub1Array2[arg0].method7343();
		return new Class343(Static624.aClass40_Sub1Array2[arg0], arg2, arg1);
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
	public static int method7580() {
		@Pc(11) int local11;
		if (Static32.aClass3_Sub41_3.aClass7_Sub23_1.method6638() == 0) {
			for (local11 = 0; local11 < Static227.anInt4609; local11++) {
				if (Static512.anInterface26Array1[local11].method211() == 's' || Static512.anInterface26Array1[local11].method211() == 'S') {
					Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub23_1);
					Static493.aBoolean605 = true;
					break;
				}
			}
		}
		@Pc(63) int local63;
		if (Static300.aClass53_34 == Static72.aClass53_4) {
			@Pc(54) Runtime local54 = Runtime.getRuntime();
			local63 = (int) ((local54.totalMemory() - local54.freeMemory()) / 1024L);
			@Pc(66) long local66 = Static191.method3071();
			if (Static212.aLong107 == 0L) {
				Static212.aLong107 = local66;
			}
			if (local63 > 16384 && local66 - Static212.aLong107 < 5000L) {
				if (local66 - Static66.aLong47 > 1000L) {
					System.gc();
					Static66.aLong47 = local66;
				}
				return 0;
			}
		}
		if (Static300.aClass53_34 == Static72.aClass53_5) {
			if (Static365.aClass183_1 == null) {
				Static365.aClass183_1 = new Class183(Static186.aClass323_1, Static220.aClass286_1, Static475.aBigInteger8, Static422.aBigInteger7);
			}
			if (!Static365.aClass183_1.method4579()) {
				return 0;
			}
			Static525.method7638(true, 0, (String) null);
			Static296.aBoolean428 = !Static38.method705();
			Static450.aClass343_210 = method7579(Static296.aBoolean428 ? 34 : 32, 1, false);
			Static578.aClass343_255 = method7579(33, 1, false);
			Static394.aClass343_188 = method7579(13, 1, false);
		}
		@Pc(162) boolean local162;
		if (Static300.aClass53_34 == Static72.aClass53_6) {
			local162 = Static578.aClass343_255.method8151();
			local63 = Static624.aClass40_Sub1Array2[33].method7341();
			local63 += Static624.aClass40_Sub1Array2[Static296.aBoolean428 ? 34 : 32].method7341();
			local63 += Static624.aClass40_Sub1Array2[13].method7341();
			local63 += local162 ? 100 : Static578.aClass343_255.method8161();
			if (local63 != 400) {
				return local63 / 4;
			}
			Static7.anInt96 = Static450.aClass343_210.method8153();
			Static413.anInt7269 = Static578.aClass343_255.method8153();
			Static213.method3753(Static450.aClass343_210);
			@Pc(225) int local225 = Static32.aClass3_Sub41_3.aClass7_Sub12_1.method5242();
			Static201.aClass112_1 = new Class112(Static431.aClass133_11, Static455.anInt7738, Static578.aClass343_255);
			@Pc(237) int[] local237 = Static201.aClass112_1.method2786(local225);
			if (local237.length == 0) {
				local237 = Static201.aClass112_1.method2786(0);
			}
			@Pc(251) Class319 local251 = new Class319(Static450.aClass343_210, Static394.aClass343_188);
			if (local237.length > 0) {
				Static23.anInterface21Array1 = new Interface21[local237.length];
				for (@Pc(263) int local263 = 0; local263 < Static23.anInterface21Array1.length; local263++) {
					Static23.anInterface21Array1[local263] = new Class156(Static201.aClass112_1.method2787(local237[local263]), local251);
				}
			}
		}
		if (Static72.aClass53_7 == Static300.aClass53_34) {
			Static4.method76(Static450.aClass343_210, Static300.method8287(), Static394.aClass343_188);
		}
		if (Static300.aClass53_34 == Static72.aClass53_8) {
			local11 = Static228.method3951();
			local63 = Static156.method2752();
			if (local11 < local63) {
				return local11 * 100 / local63;
			}
		}
		if (Static300.aClass53_34 == Static72.aClass53_9) {
			if (Static23.anInterface21Array1 != null && Static23.anInterface21Array1.length > 0) {
				if (Static23.anInterface21Array1[0].method8192() < 100) {
					return 0;
				}
				if (Static23.anInterface21Array1.length > 1 && Static201.aClass112_1.method2785() && Static23.anInterface21Array1[1].method8192() < 100) {
					return 0;
				}
			}
			Static625.method8479(Static266.aClass82_8);
			Static624.method8473(Static266.aClass82_8);
			Static206.method3226(1);
		}
		if (Static72.aClass53_10 == Static300.aClass53_34) {
			for (local11 = 0; local11 < 4; local11++) {
				Static174.aClass237Array1[local11] = method7581(Static399.anInt7121, Static24.anInt345);
			}
		}
		if (Static300.aClass53_34 == Static72.aClass53_11) {
			Static419.aClass343_200 = method7579(8, 1, false);
			Static260.aClass343_134 = method7579(0, 1, false);
			Static292.aClass343_147 = method7579(1, 1, false);
			Static605.aClass343_260 = method7579(2, 1, false);
			Static468.aClass343_221 = method7579(3, 1, false);
			Static155.aClass343_77 = method7579(4, 1, false);
			Static235.aClass343_118 = method7579(5, 1, true);
			aClass343_238 = method7579(6, 1, true);
			Static638.aClass343_270 = method7579(7, 1, false);
			Static396.aClass343_190 = method7579(9, 1, false);
			Static148.aClass343_74 = method7579(10, 1, false);
			Static498.aClass343_232 = method7579(11, 1, false);
			Static22.aClass343_17 = method7579(12, 1, false);
			Static311.aClass343_155 = method7579(14, 1, false);
			Static4.aClass343_7 = method7579(15, 1, false);
			Static202.aClass343_101 = method7579(16, 1, false);
			Static258.aClass343_131 = method7579(17, 1, false);
			Static632.aClass343_268 = method7579(18, 1, false);
			Static509.aClass343_220 = method7579(19, 1, false);
			Static93.aClass343_52 = method7579(20, 1, false);
			Static128.aClass343_48 = method7579(21, 1, false);
			Static10.aClass343_12 = method7579(22, 1, false);
			Static207.aClass343_103 = method7579(23, 1, true);
			Static422.aClass343_209 = method7579(24, 1, false);
			Static108.aClass343_57 = method7579(25, 1, false);
			Static94.aClass343_55 = method7579(26, 1, true);
			Static132.aClass343_67 = method7579(27, 1, false);
			Static50.aClass343_36 = method7579(28, 1, true);
			Static62.aClass343_41 = method7579(29, 1, false);
			Static174.aClass343_84 = method7579(30, 1, true);
			Static567.aClass343_251 = method7579(31, 1, true);
			Static487.aClass343_231 = method7579(36, 2, true);
		}
		if (Static300.aClass53_34 == Static72.aClass53_12) {
			local11 = 0;
			for (local63 = 0; local63 < 37; local63++) {
				if (Static624.aClass40_Sub1Array2[local63] != null) {
					local11 += Static624.aClass40_Sub1Array2[local63].method7341() * Static240.anIntArray261[local63] / 100;
				}
			}
			if (local11 != 100) {
				if (Static307.anInt5989 < 0) {
					Static307.anInt5989 = local11;
				}
				return (local11 - Static307.anInt5989) * 100 / (100 - Static307.anInt5989);
			}
			Static603.method8313(Static419.aClass343_200);
			Static4.method76(Static419.aClass343_200, Static300.method8287(), Static394.aClass343_188);
		}
		if (Static300.aClass53_34 == Static72.aClass53_13) {
			if (Static384.anInt6926 == -1) {
				Static384.anInt6926 = aClass343_238.method8158("scape main");
			}
			Static595.method8228();
			Static206.method3226(2);
		}
		if (Static300.aClass53_34 == Static72.aClass53_14) {
			Static535.method7743(Static174.aClass343_84, Static48.aClass298_12);
		}
		if (Static72.aClass53_15 == Static300.aClass53_34) {
			local11 = Static395.method6225();
			if (local11 < 100) {
				return local11;
			}
			Static413.method6395(Static50.aClass343_36.method8143(1));
			Static213.method3759(Static50.aClass343_36.method8143(3));
		}
		if (Static72.aClass53_16 == Static300.aClass53_34) {
			if (Static268.anInt5214 != -1 && !Static638.aClass343_270.method8130(Static268.anInt5214, 0)) {
				return 99;
			}
			Static621.anInterface5_12 = new Class164(Static94.aClass343_55, Static396.aClass343_190, Static419.aClass343_200);
			Static220.aClass214_2 = new Class214(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static61.aClass119_1 = new Class119(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static114.aClass67_1 = new Class67(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260, Static419.aClass343_200);
			Static324.aClass307_1 = new Class307(Static431.aClass133_11, Static455.anInt7738, Static258.aClass343_131);
			Static503.aClass32_5 = new Class32(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static371.aClass263_4 = new Class263(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static409.aClass361_1 = new Class361(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260, Static419.aClass343_200);
			Static54.aClass22_1 = new Class22(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260, Static638.aClass343_270);
			Static543.aClass115_1 = new Class115(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static498.aClass362_1 = new Class362(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static370.aClass284_3 = new Class284(Static431.aClass133_11, Static455.anInt7738, true, Static202.aClass343_101, Static638.aClass343_270);
			Static167.aClass154_3 = new Class154(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260, Static419.aClass343_200);
			Static383.aClass233_150 = new Class233(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260, Static419.aClass343_200);
			Static153.aClass2_1 = new Class2(Static431.aClass133_11, Static455.anInt7738, true, Static632.aClass343_268, Static638.aClass343_270);
			Static298.aClass132_1 = new Class132(Static431.aClass133_11, Static455.anInt7738, true, Static220.aClass214_2, Static509.aClass343_220, Static638.aClass343_270);
			Static27.aClass254_1 = new Class254(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static474.aClass264_2 = new Class264(Static431.aClass133_11, Static455.anInt7738, Static93.aClass343_52, Static260.aClass343_134, Static292.aClass343_147);
			Static148.aClass212_1 = new Class212(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static166.aClass310_1 = new Class310(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static266.aClass135_1 = new Class135(Static431.aClass133_11, Static455.anInt7738, Static128.aClass343_48, Static638.aClass343_270);
			Static113.aClass175_1 = new Class175(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static369.aClass131_1 = new Class131(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static17.aClass318_1 = new Class318(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static133.aClass222_30 = new Class222(Static431.aClass133_11, Static455.anInt7738, Static10.aClass343_12);
			Static580.aClass186_1 = new Class186(Static431.aClass133_11, Static455.anInt7738, Static605.aClass343_260);
			Static73.method1255(Static419.aClass343_200, Static468.aClass343_221, Static638.aClass343_270, Static394.aClass343_188);
			Static344.method5468(Static62.aClass343_41);
			Static131.aClass204_1 = new Class204(Static455.anInt7738, Static422.aClass343_209, Static108.aClass343_57);
			Static54.aClass257_1 = new Class257(Static455.anInt7738, Static422.aClass343_209, Static108.aClass343_57, new Class327());
			Static416.method6438();
			Static370.aClass284_3.method6912(Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 0);
			Static183.aClass285_1 = new Class285();
			Static408.method6354();
			Static445.method6662(Static132.aClass343_67);
			Static170.method2825(Static621.anInterface5_12, Static638.aClass343_270);
			@Pc(981) Class236 local981 = new Class236(Static148.aClass343_74.method8142("", "huffman"));
			Static576.method8075(local981);
			try {
				jagmisc.init();
			} catch (@Pc(988) Throwable local988) {
			}
			Static602.aClass28_1 = Static402.method6292();
			Static545.aClass3_Sub38_1 = new Class3_Sub38(true, Static48.aClass298_12);
		}
		if (Static72.aClass53_18 == Static300.aClass53_34) {
			local11 = Static172.method2842(Static419.aClass343_200) + Static17.method255(true);
			local63 = Static175.method2892() + Static156.method2752();
			if (local11 < local63) {
				return local11 * 100 / local63;
			}
		}
		if (Static300.aClass53_34 == Static72.aClass53_19) {
			Static598.method2532(Static207.aClass343_103, Static503.aClass32_5, Static371.aClass263_4, Static370.aClass284_3, Static167.aClass154_3, Static383.aClass233_150, Static183.aClass285_1);
		}
		if (Static300.aClass53_34 == Static72.aClass53_20) {
			Static10.aStringArray4 = new String[Static369.aClass131_1.anInt3552];
			Static584.anIntArray595 = new int[Static17.aClass318_1.anInt9061];
			Static586.aBooleanArray29 = new boolean[Static17.aClass318_1.anInt9061];
			for (local11 = 0; local11 < Static17.aClass318_1.anInt9061; local11++) {
				if (Static17.aClass318_1.method7783(local11).anInt4670 == 0) {
					Static586.aBooleanArray29[local11] = true;
					Static419.anInt7367++;
				}
				Static584.anIntArray595[local11] = -1;
			}
			Static574.method8062();
			Static154.anInt3151 = Static468.aClass343_221.method8158("loginscreen");
			Static408.anInt7195 = Static468.aClass343_221.method8158("lobbyscreen");
			Static235.aClass343_118.method8149(false);
			aClass343_238.method8149(true);
			Static419.aClass343_200.method8149(true);
			Static394.aClass343_188.method8149(true);
			Static148.aClass343_74.method8149(true);
			Static468.aClass343_221.method8149(true);
			Static605.aClass343_260.anInt9505 = 2;
			Static580.aBoolean712 = true;
			Static258.aClass343_131.anInt9505 = 2;
			Static202.aClass343_101.anInt9505 = 2;
			Static632.aClass343_268.anInt9505 = 2;
			Static509.aClass343_220.anInt9505 = 2;
			Static93.aClass343_52.anInt9505 = 2;
			Static128.aClass343_48.anInt9505 = 2;
		}
		if (Static300.aClass53_34 == Static72.aClass53_21) {
			if (!Static64.method1061(Static154.anInt3151)) {
				return 0;
			}
			local162 = true;
			for (local63 = 0; local63 < Static319.aClass344ArrayArray2[Static154.anInt3151].length; local63++) {
				@Pc(1178) Class344 local1178 = Static319.aClass344ArrayArray2[Static154.anInt3151][local63];
				if (local1178.anInt9554 == 5 && local1178.anInt9597 != -1 && !Static419.aClass343_200.method8130(local1178.anInt9597, 0)) {
					local162 = false;
				}
			}
			if (!local162) {
				return 0;
			}
		}
		if (Static72.aClass53_22 == Static300.aClass53_34) {
			Static284.method4611(true);
		}
		if (Static72.aClass53_23 == Static300.aClass53_34) {
			Static369.aClass302_1.method7395();
			try {
				Static188.aThread3.join();
			} catch (@Pc(1223) InterruptedException local1223) {
				return 0;
			}
			Static23.anInterface21Array1 = null;
			Static201.aClass112_1 = null;
			Static369.aClass302_1 = null;
			Static578.aClass343_255 = null;
			Static450.aClass343_210 = null;
			Static188.aThread3 = null;
			Static477.method7056();
			Static211.aBoolean272 = Static32.aClass3_Sub41_3.aClass7_Sub23_1.method6638() == 1;
			Static32.aClass3_Sub41_3.method6773(1, Static32.aClass3_Sub41_3.aClass7_Sub23_1);
			if (Static211.aBoolean272) {
				Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
			} else if (Static32.aClass3_Sub41_3.aClass7_Sub9_1.aBoolean358 && Static545.aClass3_Sub38_1.anInt7213 < 512 && Static545.aClass3_Sub38_1.anInt7213 != 0) {
				Static32.aClass3_Sub41_3.method6773(0, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
			}
			Static124.method2223();
			if (Static211.aBoolean272) {
				Static230.method3973(0, false);
			} else {
				Static230.method3973(Static32.aClass3_Sub41_3.aClass7_Sub9_1.method4181(), false);
			}
			Static545.method7843(-1, Static32.aClass3_Sub41_3.aClass7_Sub22_2.method6533(), -1, false);
			Static625.method8479(Static266.aClass82_8);
			Static624.method8473(Static266.aClass82_8);
			Static388.method6070(Static419.aClass343_200, Static266.aClass82_8);
			Static576.method8078(Static427.aClass103Array16);
		}
		return Static216.method6757();
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)Lclient!nfa;")
	public static Class237 method7581(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class237 local7 = new Class237();
		local7.anInt6790 = -1;
		local7.anInt6797 = arg1 + 1 + 5;
		local7.anInt6799 = -1;
		local7.anInt6796 = arg0 + 5 + 1;
		local7.anIntArrayArray33 = new int[local7.anInt6796][local7.anInt6797];
		local7.method5911();
		return local7;
	}
}
