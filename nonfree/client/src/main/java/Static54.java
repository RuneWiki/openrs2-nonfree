import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
	public static int anInt1372;

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt1368 = 0;

	@OriginalMember(owner = "client!ia", name = "f", descriptor = "Ljava/util/Calendar;")
	public static Calendar aCalendar1 = Calendar.getInstance();

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_694 = Static56.method816("");

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "Lclient!ic;")
	public static Class34 aClass34_695 = Static56.method816("Mitglieder)2Welt");

	@OriginalMember(owner = "client!ia", name = "j", descriptor = "[I")
	public static int[] anIntArray170 = new int[5];

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "[I")
	public static int[] anIntArray171 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ia", name = "l", descriptor = "Lclient!ic;")
	public static Class34 aClass34_696 = Static56.method816("welle2:");

	@OriginalMember(owner = "client!ia", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_697 = Static56.method816("Ung-Ultiges Anmelde)2Paket)3");

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIB)V")
	public static void method780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static33.method548();
		Static110.method1721(arg2, arg1, arg2 + Static22.aClass8_Sub1_Sub3_Sub2_7.anInt484, arg1 - -Static22.aClass8_Sub1_Sub3_Sub2_7.anInt485);
		if (Static17.anInt434 == 2 || Static17.anInt434 == 5) {
			Static110.method1722(arg2 + 25, arg1 + 5, Static119.anIntArray383, Static33.anIntArray113);
		} else {
			@Pc(31) int local31 = Static72.anInt1744 + Static111.anInt3027 & 0x7FF;
			@Pc(39) int local39 = 464 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
			@Pc(46) int local46 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32 + 48;
			Static41.aClass8_Sub1_Sub3_Sub3_1.method1593(arg2 + 25, arg1 - -5, 146, 151, local46, local39, local31, Static47.anInt1268 + 256, Static119.anIntArray383, Static33.anIntArray113);
			@Pc(82) int local82;
			@Pc(96) int local96;
			for (@Pc(66) int local66 = 0; local66 < Static109.anInt2503; local66++) {
				local82 = Static64.anIntArray265[local66] * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
				local96 = Static70.anIntArray210[local66] * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
				Static69.method1041(local96, local82, arg2, arg1, Static28.aClass8_Sub1_Sub3_Sub3Array14[local66]);
			}
			@Pc(139) int local139;
			@Pc(150) int local150;
			for (local82 = 0; local82 < 104; local82++) {
				for (local96 = 0; local96 < 104; local96++) {
					@Pc(125) Class49 local125 = Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local82][local96];
					if (local125 != null) {
						local139 = local82 * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
						local150 = local96 * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
						Static69.method1041(local150, local139, arg2, arg1, Static123.aClass8_Sub1_Sub3_Sub3Array38[0]);
					}
				}
			}
			@Pc(227) int local227;
			for (local96 = 0; local96 < Static94.anInt2223; local96++) {
				@Pc(179) Class8_Sub1_Sub1_Sub4_Sub2 local179 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static50.anIntArray164[local96]];
				if (local179 != null && local179.method1221()) {
					@Pc(188) Class8_Sub1_Sub16 local188 = local179.aClass8_Sub1_Sub16_1;
					if (local188 != null && local188.anIntArray331 != null) {
						local188 = local188.method1503();
					}
					if (local188 != null && local188.aBoolean93 && local188.aBoolean95) {
						local150 = local179.anInt2043 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
						local227 = local179.anInt2059 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
						Static69.method1041(local227, local150, arg2, arg1, Static123.aClass8_Sub1_Sub3_Sub3Array38[1]);
					}
				}
			}
			@Pc(250) Class8_Sub1_Sub1_Sub4_Sub1 local250;
			for (@Pc(242) int local242 = 0; local242 < Static41.anInt986; local242++) {
				local250 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static29.anIntArray109[local242]];
				if (local250 != null && local250.method1221()) {
					local227 = local250.anInt2059 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
					local150 = local250.anInt2043 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
					@Pc(282) long local282 = local250.aClass34_638.method830();
					@Pc(284) boolean local284 = false;
					for (@Pc(286) int local286 = 0; local286 < Static62.anInt1593; local286++) {
						if (Static77.aLongArray3[local286] == local282 && Static83.anIntArray266[local286] != 0) {
							local284 = true;
							break;
						}
					}
					@Pc(308) boolean local308 = false;
					if (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1265 != 0 && local250.anInt1265 != 0 && Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt1265 == local250.anInt1265) {
						local308 = true;
					}
					if (local284) {
						Static69.method1041(local227, local150, arg2, arg1, Static123.aClass8_Sub1_Sub3_Sub3Array38[3]);
					} else if (local308) {
						Static69.method1041(local227, local150, arg2, arg1, Static123.aClass8_Sub1_Sub3_Sub3Array38[4]);
					} else {
						Static69.method1041(local227, local150, arg2, arg1, Static123.aClass8_Sub1_Sub3_Sub3Array38[2]);
					}
				}
			}
			if (Static1.anInt24 != 0 && Static21.anInt655 % 20 < 10) {
				if (Static1.anInt24 == 1 && Static87.anInt2184 >= 0 && Static87.anInt2184 < Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1.length) {
					@Pc(397) Class8_Sub1_Sub1_Sub4_Sub2 local397 = Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[Static87.anInt2184];
					if (local397 != null) {
						local150 = local397.anInt2043 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
						local227 = local397.anInt2059 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
						Static53.method776(arg1, arg2, local227, local150, Static116.aClass8_Sub1_Sub3_Sub3Array35[1]);
					}
				}
				if (Static1.anInt24 == 2) {
					local139 = (Static67.anInt1664 - Static82.anInt1959) * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
					local150 = (Static133.anInt3059 - Static64.anInt2062) * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
					Static53.method776(arg1, arg2, local150, local139, Static116.aClass8_Sub1_Sub3_Sub3Array35[1]);
				}
				if (Static1.anInt24 == 10 && Static134.anInt3168 >= 0 && Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1.length > Static134.anInt3168) {
					local250 = Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[Static134.anInt3168];
					if (local250 != null) {
						local150 = local250.anInt2043 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
						local227 = local250.anInt2059 / 32 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
						Static53.method776(arg1, arg2, local227, local150, Static116.aClass8_Sub1_Sub3_Sub3Array35[1]);
					}
				}
			}
			if (Static81.anInt1951 != 0) {
				local139 = Static81.anInt1951 * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2043 / 32;
				local150 = Static50.anInt1321 * 4 + 2 - Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anInt2059 / 32;
				Static69.method1041(local150, local139, arg2, arg1, Static116.aClass8_Sub1_Sub3_Sub3Array35[0]);
			}
			Static110.method1729(arg2 + 93 + 4, arg1 + 78, 3, 3, 16777215);
		}
		if (Static17.anInt434 >= 3) {
			Static110.method1722(arg2, arg1, Static25.anIntArray88, Static9.anIntArray21);
		} else {
			Static116.aClass8_Sub1_Sub3_Sub3_5.method1593(arg2, arg1, 33, 33, 25, 25, Static72.anInt1744, 256, Static25.anIntArray88, Static9.anIntArray21);
		}
		if (Static47.aBooleanArray8[arg0]) {
			Static22.aClass8_Sub1_Sub3_Sub2_7.method300(arg2, arg1);
		}
		Static24.aBooleanArray11[arg0] = true;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
	public static void method781() {
		anIntArray170 = null;
		aClass34_697 = null;
		aClass34_695 = null;
		aClass34_694 = null;
		aCalendar1 = null;
		anIntArray171 = null;
		aClass34_696 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
	public static void method782() {
		Static106.aClass8_Sub20_Sub1_3.method1907(180);
		for (@Pc(18) Class8_Sub7 local18 = (Class8_Sub7) Static31.aClass7_3.method47(); local18 != null; local18 = (Class8_Sub7) Static31.aClass7_3.method46()) {
			if (local18.anInt953 == 0 || local18.anInt953 == 3) {
				Static45.method680(true, local18);
			}
		}
		if (Static126.aClass8_Sub24_8 != null) {
			Static40.method608(Static126.aClass8_Sub24_8);
			Static126.aClass8_Sub24_8 = null;
		}
	}
}
