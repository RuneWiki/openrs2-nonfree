import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
	public static int anInt3175;

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "Lclient!ec;")
	public static Class46 aClass46_26 = new Class46(100);

	@OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
	public static int anInt3167 = 0;

	@OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
	public static int anInt3168 = 0;

	@OriginalMember(owner = "client!lh", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString151 = "Please wait...";

	@OriginalMember(owner = "client!lh", name = "n", descriptor = "Lclient!gk;")
	public static Class62 aClass62_1 = new Class62();

	@OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
	public static int[] anIntArray229 = new int[2000];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)V")
	public static void method2599() {
		if (Static17.anInt427 != -1) {
			Static170.method2925(Static17.anInt427);
		}
		for (@Pc(16) int local16 = 0; local16 < Static231.anInt4776; local16++) {
			if (Static165.aBooleanArray16[local16]) {
				Static90.aBooleanArray9[local16] = true;
			}
			Static222.aBooleanArray21[local16] = Static165.aBooleanArray16[local16];
			Static165.aBooleanArray16[local16] = false;
		}
		if (Static60.aBoolean106) {
			Static295.aBoolean488 = true;
		}
		Static197.anInt4133 = -1;
		Static43.aClass115_5 = null;
		Static65.anInt1453 = anInt3168;
		Static180.anInt3872 = -1;
		if (Static17.anInt427 != -1) {
			Static231.anInt4776 = 0;
			Static254.method4117();
		}
		if (Static60.aBoolean106) {
			Static94.method1750();
		} else {
			Static160.method2786();
		}
		Static37.anInt906 = 0;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILclient!mn;IIB)V")
	public static void method2600(@OriginalArg(0) int arg0, @OriginalArg(1) Class115 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static60.aBoolean106) {
			Static94.method1752(arg2, arg0, arg1.anInt3555 + arg2, arg1.anInt3487 + arg0);
		}
		if (Static110.anInt2374 < 3) {
			if (Static60.aBoolean106) {
				((Class2_Sub3_Sub1_Sub2) Static111.aClass2_Sub3_Sub1_4).method617(arg2, arg0, arg1.anInt3555, arg1.anInt3487, Static111.aClass2_Sub3_Sub1_4.anInt5453 / 2, Static111.aClass2_Sub3_Sub1_4.anInt5462 / 2, (int) Static142.aFloat31, 256, (Class2_Sub3_Sub1_Sub2) arg1.method2854(false));
			} else {
				((Class2_Sub3_Sub1_Sub1) Static111.aClass2_Sub3_Sub1_4).method4378(arg2, arg0, arg1.anInt3555, arg1.anInt3487, Static111.aClass2_Sub3_Sub1_4.anInt5453 / 2, Static111.aClass2_Sub3_Sub1_4.anInt5462 / 2, (int) Static142.aFloat31, arg1.anIntArray269, arg1.anIntArray277);
			}
		} else if (Static60.aBoolean106) {
			@Pc(90) Class2_Sub3_Sub1 local90 = arg1.method2854(false);
			if (local90 != null) {
				local90.method4367(arg2, arg0);
			}
		} else {
			Static160.method2776(arg2, arg0, arg1.anIntArray269, arg1.anIntArray277);
		}
		Static90.aBooleanArray9[arg3] = true;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(II[BILjava/lang/String;I)I")
	public static int method2601(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(4) String arg2, @OriginalArg(5) int arg3) {
		@Pc(6) int local6 = arg3;
		for (@Pc(17) int local17 = 0; local17 < local6; local17++) {
			@Pc(30) char local30 = arg2.charAt(local17);
			if (local30 > '\u0000' && local30 < '\u0080' || !(local30 < ' ' || local30 > 'ÿ')) {
				arg1[arg0 + local17] = (byte) local30;
			} else if (local30 == '€') {
				arg1[local17 + arg0] = -128;
			} else if (local30 == '‚') {
				arg1[arg0 + local17] = -126;
			} else if (local30 == 'ƒ') {
				arg1[arg0 + local17] = -125;
			} else if (local30 == '„') {
				arg1[local17 + arg0] = -124;
			} else if (local30 == '…') {
				arg1[local17 + arg0] = -123;
			} else if (local30 == '†') {
				arg1[arg0 + local17] = -122;
			} else if (local30 == '‡') {
				arg1[arg0 + local17] = -121;
			} else if (local30 == 'ˆ') {
				arg1[local17 + arg0] = -120;
			} else if (local30 == '‰') {
				arg1[local17 + arg0] = -119;
			} else if (local30 == 'Š') {
				arg1[arg0 + local17] = -118;
			} else if (local30 == '‹') {
				arg1[arg0 + local17] = -117;
			} else if (local30 == 'Œ') {
				arg1[local17 + arg0] = -116;
			} else if (local30 == 'Ž') {
				arg1[local17 + arg0] = -114;
			} else if (local30 == '‘') {
				arg1[arg0 + local17] = -111;
			} else if (local30 == '’') {
				arg1[local17 + arg0] = -110;
			} else if (local30 == '“') {
				arg1[local17 + arg0] = -109;
			} else if (local30 == '”') {
				arg1[arg0 + local17] = -108;
			} else if (local30 == '•') {
				arg1[local17 + arg0] = -107;
			} else if (local30 == '–') {
				arg1[arg0 + local17] = -106;
			} else if (local30 == '—') {
				arg1[arg0 + local17] = -105;
			} else if (local30 == '˜') {
				arg1[local17 + arg0] = -104;
			} else if (local30 == '™') {
				arg1[arg0 + local17] = -103;
			} else if (local30 == 'š') {
				arg1[local17 + arg0] = -102;
			} else if (local30 == '›') {
				arg1[arg0 + local17] = -101;
			} else if (local30 == 'œ') {
				arg1[local17 + arg0] = -100;
			} else if (local30 == 'ž') {
				arg1[arg0 + local17] = -98;
			} else if (local30 == 'Ÿ') {
				arg1[local17 + arg0] = -97;
			} else {
				arg1[arg0 + local17] = 63;
			}
		}
		return local6;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V")
	public static void method2602() {
		Static132.method2296();
		Static44.anInterface2Array1 = new Interface2[9];
		Static44.anInterface2Array1[1] = new Class68();
		Static44.anInterface2Array1[2] = new Class153();
		Static44.anInterface2Array1[3] = new Class20();
		Static44.anInterface2Array1[4] = new Class60();
		Static44.anInterface2Array1[5] = new Class163();
		Static44.anInterface2Array1[6] = new Class81();
		Static44.anInterface2Array1[7] = new Class182();
	}
}
