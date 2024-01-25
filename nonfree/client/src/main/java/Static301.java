import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!kaa", name = "y", descriptor = "Lclient!wfa;")
	private static Class391 aClass391_1;

	@OriginalMember(owner = "client!kaa", name = "k", descriptor = "[Ljava/lang/String;")
	private static String[] aStringArray21;

	@OriginalMember(owner = "client!kaa", name = "g", descriptor = "[I")
	private static int[] anIntArray297;

	@OriginalMember(owner = "client!kaa", name = "l", descriptor = "Lclient!vo;")
	private static Class381 aClass381_5;

	@OriginalMember(owner = "client!kaa", name = "w", descriptor = "Lclient!bia;")
	private static Class39 aClass39_1;

	@OriginalMember(owner = "client!kaa", name = "o", descriptor = "[J")
	private static long[] aLongArray14;

	@OriginalMember(owner = "client!kaa", name = "G", descriptor = "Lclient!vo;")
	private static Class381 aClass381_6;

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "Lclient!kj;")
	private static Class6_Sub29 aClass6_Sub29_2;

	@OriginalMember(owner = "client!kaa", name = "h", descriptor = "[I")
	private static final int[] anIntArray296 = new int[1000];

	@OriginalMember(owner = "client!kaa", name = "q", descriptor = "I")
	private static int anInt5278 = 0;

	@OriginalMember(owner = "client!kaa", name = "z", descriptor = "I")
	private static int anInt5279 = 0;

	@OriginalMember(owner = "client!kaa", name = "x", descriptor = "I")
	private static int anInt5283 = 0;

	@OriginalMember(owner = "client!kaa", name = "n", descriptor = "[I")
	private static final int[] anIntArray298 = new int[5];

	@OriginalMember(owner = "client!kaa", name = "A", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray22 = new String[1000];

	@OriginalMember(owner = "client!kaa", name = "B", descriptor = "I")
	private static int anInt5286 = 0;

	@OriginalMember(owner = "client!kaa", name = "F", descriptor = "[I")
	private static final int[] anIntArray299 = new int[3];

	@OriginalMember(owner = "client!kaa", name = "u", descriptor = "[J")
	private static final long[] aLongArray13 = new long[1000];

	@OriginalMember(owner = "client!kaa", name = "p", descriptor = "Lclient!ui;")
	public static final Class359 aClass359_43 = new Class359(4);

	@OriginalMember(owner = "client!kaa", name = "s", descriptor = "[[I")
	private static final int[][] anIntArrayArray28 = new int[5][5000];

	@OriginalMember(owner = "client!kaa", name = "D", descriptor = "[Lclient!gba;")
	private static final Class128[] aClass128Array1 = new Class128[50];

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "Z")
	public static boolean aBoolean399 = false;

	@OriginalMember(owner = "client!kaa", name = "t", descriptor = "I")
	private static int anInt5292 = 0;

	@OriginalMember(owner = "client!kaa", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(I)Ljava/lang/String;")
	private static String method4830(@OriginalArg(0) int arg0) {
		@Pc(9) String local9 = aClass391_1.method8889(Static129.aClass121_1.anInt3555 << 16 | arg0);
		return local9 == null ? "" : local9;
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(I)J")
	private static long method4831(@OriginalArg(0) int arg0) {
		@Pc(9) Long local9 = aClass391_1.method8904(Static129.aClass121_1.anInt3555 << 16 | arg0);
		return local9 == null ? -1L : local9;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(IZ)V")
	private static void method4832(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(109) int local109;
		@Pc(375) int local375;
		@Pc(95) String local95;
		@Pc(192) int local192;
		@Pc(1578) boolean local1578;
		@Pc(834) int local834;
		@Pc(115) int local115;
		@Pc(198) String local198;
		@Pc(101) String local101;
		if (arg0 < 5100) {
			if (arg0 == 5000) {
				anIntArray296[anInt5278++] = Static535.anInt4139;
				return;
			}
			@Pc(57) Class260 local57;
			@Pc(63) Class6_Sub13 local63;
			if (arg0 == 5001) {
				anInt5278 -= 3;
				Static535.anInt4139 = anIntArray296[anInt5278];
				Static188.aClass267_2 = Static483.method7190(anIntArray296[anInt5278 + 1]);
				if (Static188.aClass267_2 == null) {
					Static188.aClass267_2 = Static435.aClass267_4;
				}
				Class60_Sub1_Sub5_Sub2.lb = anIntArray296[anInt5278 + 2];
				local57 = Static629.method8573();
				local63 = Static30.method353(Static567.aClass241_110, local57.aClass270_2);
				local63.aClass6_Sub15_Sub1_1.method3016(Static535.anInt4139);
				local63.aClass6_Sub15_Sub1_1.method3016(Static188.aClass267_2.anInt7238);
				local63.aClass6_Sub15_Sub1_1.method3016(Class60_Sub1_Sub5_Sub2.lb);
				local57.method6404(local63);
				return;
			}
			if (arg0 == 5002) {
				anInt5283 -= 2;
				local95 = aStringArray22[anInt5283];
				local101 = aStringArray22[anInt5283 + 1];
				anInt5278 -= 2;
				local109 = anIntArray296[anInt5278];
				local115 = anIntArray296[anInt5278 + 1];
				if (local101 == null) {
					local101 = "";
				}
				if (local101.length() > 80) {
					local101 = local101.substring(0, 80);
				}
				@Pc(135) Class260 local135 = Static629.method8573();
				@Pc(141) Class6_Sub13 local141 = Static30.method353(Static247.aClass241_64, local135.aClass270_2);
				local141.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(local95) + Static290.method8800(local101) + 2);
				local141.aClass6_Sub15_Sub1_1.method2991(local95);
				local141.aClass6_Sub15_Sub1_1.method3016(local109 - 1);
				local141.aClass6_Sub15_Sub1_1.method3016(local115);
				local141.aClass6_Sub15_Sub1_1.method2991(local101);
				local135.method6404(local141);
				return;
			}
			@Pc(196) Class321 local196;
			if (arg0 == 5003) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local198 = "";
				if (local196 != null && local196.aString101 != null) {
					local198 = local196.aString101;
				}
				aStringArray22[anInt5283++] = local198;
				return;
			}
			if (arg0 == 5004) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt8809;
				}
				anIntArray296[anInt5278++] = local109;
				return;
			}
			if (arg0 == 5005) {
				if (Static188.aClass267_2 == null) {
					anIntArray296[anInt5278++] = -1;
					return;
				}
				anIntArray296[anInt5278++] = Static188.aClass267_2.anInt7238;
				return;
			}
			@Pc(295) Class6_Sub13 local295;
			@Pc(289) Class260 local289;
			if (arg0 == 5006) {
				local192 = anIntArray296[--anInt5278];
				local289 = Static629.method8573();
				local295 = Static30.method353(Static319.aClass241_71, local289.aClass270_2);
				local295.aClass6_Sub15_Sub1_1.method3016(local192);
				local289.method6404(local295);
				return;
			}
			if (arg0 == 5008) {
				local95 = aStringArray22[--anInt5283];
				method4846(local95, arg0);
				return;
			}
			if (arg0 == 5009) {
				anInt5283 -= 2;
				local95 = aStringArray22[anInt5283];
				local101 = aStringArray22[anInt5283 + 1];
				if (Static679.anInt6104 != 0 || (!Static334.aBoolean425 || Static364.aBoolean455) && !Static610.aBoolean714) {
					@Pc(360) Class260 local360 = Static629.method8573();
					@Pc(366) Class6_Sub13 local366 = Static30.method353(Static683.aClass241_126, local360.aClass270_2);
					local366.aClass6_Sub15_Sub1_1.method3016(0);
					local375 = local366.aClass6_Sub15_Sub1_1.anInt3174;
					local366.aClass6_Sub15_Sub1_1.method2991(local95);
					Static568.method8736(local101, local366.aClass6_Sub15_Sub1_1);
					local366.aClass6_Sub15_Sub1_1.method2999(local366.aClass6_Sub15_Sub1_1.anInt3174 - local375);
					local360.method6404(local366);
					return;
				}
				return;
			}
			if (arg0 == 5010) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local198 = "";
				if (local196 != null && local196.aString102 != null) {
					local198 = local196.aString102;
				}
				aStringArray22[anInt5283++] = local198;
				return;
			}
			if (arg0 == 5011) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local198 = "";
				if (local196 != null && local196.aString103 != null) {
					local198 = local196.aString103;
				}
				aStringArray22[anInt5283++] = local198;
				return;
			}
			if (arg0 == 5012) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt8804;
				}
				anIntArray296[anInt5278++] = local109;
				return;
			}
			if (arg0 == 5015) {
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == null || Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString24 == null) {
					local95 = "";
				} else {
					local95 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method2701();
				}
				aStringArray22[anInt5283++] = local95;
				return;
			}
			if (arg0 == 5016) {
				anIntArray296[anInt5278++] = Class60_Sub1_Sub5_Sub2.lb;
				return;
			}
			if (arg0 == 5017) {
				anIntArray296[anInt5278++] = Static647.method8681();
				return;
			}
			if (arg0 == 5018) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local109 = 0;
				if (local196 != null) {
					local109 = local196.anInt8803;
				}
				anIntArray296[anInt5278++] = local109;
				return;
			}
			if (arg0 == 5019) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local198 = "";
				if (local196 != null && local196.aString105 != null) {
					local198 = local196.aString105;
				}
				aStringArray22[anInt5283++] = local198;
				return;
			}
			if (arg0 == 5020) {
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 == null || Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString24 == null) {
					local95 = "";
				} else {
					local95 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.method2703();
				}
				aStringArray22[anInt5283++] = local95;
				return;
			}
			if (arg0 == 5023) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt8810;
				}
				anIntArray296[anInt5278++] = local109;
				return;
			}
			if (arg0 == 5024) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local109 = -1;
				if (local196 != null) {
					local109 = local196.anInt8807;
				}
				anIntArray296[anInt5278++] = local109;
				return;
			}
			if (arg0 == 5025) {
				local192 = anIntArray296[--anInt5278];
				local196 = Static16.method208(local192);
				local198 = "";
				if (local196 != null && local196.aString104 != null) {
					local198 = local196.aString104;
				}
				aStringArray22[anInt5283++] = local198;
				return;
			}
			if (arg0 == 5050) {
				local192 = anIntArray296[--anInt5278];
				aStringArray22[anInt5283++] = Static457.aClass48_1.method685(local192).aString93;
				return;
			}
			@Pc(793) Class6_Sub2_Sub17 local793;
			if (arg0 == 5051) {
				local192 = anIntArray296[--anInt5278];
				local793 = Static457.aClass48_1.method685(local192);
				if (local793.anIntArray521 == null) {
					anIntArray296[anInt5278++] = 0;
					return;
				}
				anIntArray296[anInt5278++] = local793.anIntArray521.length;
				return;
			}
			if (arg0 == 5052) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				@Pc(839) Class6_Sub2_Sub17 local839 = Static457.aClass48_1.method685(local192);
				local115 = local839.anIntArray521[local834];
				anIntArray296[anInt5278++] = local115;
				return;
			}
			if (arg0 == 5053) {
				local192 = anIntArray296[--anInt5278];
				local793 = Static457.aClass48_1.method685(local192);
				if (local793.anIntArray522 == null) {
					anIntArray296[anInt5278++] = 0;
					return;
				}
				anIntArray296[anInt5278++] = local793.anIntArray522.length;
				return;
			}
			if (arg0 == 5054) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				anIntArray296[anInt5278++] = Static457.aClass48_1.method685(local192).anIntArray522[local834];
				return;
			}
			if (arg0 == 5055) {
				local192 = anIntArray296[--anInt5278];
				aStringArray22[anInt5283++] = Static35.aClass276_1.method6929(local192).method8375();
				return;
			}
			if (arg0 == 5056) {
				local192 = anIntArray296[--anInt5278];
				@Pc(966) Class6_Sub2_Sub20 local966 = Static35.aClass276_1.method6929(local192);
				if (local966.anIntArray625 == null) {
					anIntArray296[anInt5278++] = 0;
					return;
				}
				anIntArray296[anInt5278++] = local966.anIntArray625.length;
				return;
			}
			if (arg0 == 5057) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				anIntArray296[anInt5278++] = Static35.aClass276_1.method6929(local192).anIntArray625[local834];
				return;
			}
			if (arg0 == 5058) {
				aClass39_1 = new Class39();
				aClass39_1.anInt552 = anIntArray296[--anInt5278];
				aClass39_1.aClass6_Sub2_Sub20_1 = Static35.aClass276_1.method6929(aClass39_1.anInt552);
				aClass39_1.anIntArray42 = new int[aClass39_1.aClass6_Sub2_Sub20_1.method8381()];
				return;
			}
			if (arg0 == 5059) {
				local57 = Static629.method8573();
				local63 = Static30.method353(Static592.aClass241_112, local57.aClass270_2);
				local63.aClass6_Sub15_Sub1_1.method3016(0);
				local109 = local63.aClass6_Sub15_Sub1_1.anInt3174;
				local63.aClass6_Sub15_Sub1_1.method3016(0);
				local63.aClass6_Sub15_Sub1_1.method3040(aClass39_1.anInt552);
				aClass39_1.aClass6_Sub2_Sub20_1.method8378(aClass39_1.anIntArray42, local63.aClass6_Sub15_Sub1_1);
				local63.aClass6_Sub15_Sub1_1.method2999(local63.aClass6_Sub15_Sub1_1.anInt3174 - local109);
				local57.method6404(local63);
				return;
			}
			if (arg0 == 5060) {
				local95 = aStringArray22[--anInt5283];
				local289 = Static629.method8573();
				local295 = Static30.method353(Static681.aClass241_125, local289.aClass270_2);
				local295.aClass6_Sub15_Sub1_1.method3016(0);
				local115 = local295.aClass6_Sub15_Sub1_1.anInt3174;
				local295.aClass6_Sub15_Sub1_1.method2991(local95);
				local295.aClass6_Sub15_Sub1_1.method3040(aClass39_1.anInt552);
				aClass39_1.aClass6_Sub2_Sub20_1.method8378(aClass39_1.anIntArray42, local295.aClass6_Sub15_Sub1_1);
				local295.aClass6_Sub15_Sub1_1.method2999(local295.aClass6_Sub15_Sub1_1.anInt3174 - local115);
				local289.method6404(local295);
				return;
			}
			if (arg0 == 5061) {
				local57 = Static629.method8573();
				local63 = Static30.method353(Static592.aClass241_112, local57.aClass270_2);
				local63.aClass6_Sub15_Sub1_1.method3016(0);
				local109 = local63.aClass6_Sub15_Sub1_1.anInt3174;
				local63.aClass6_Sub15_Sub1_1.method3016(1);
				local63.aClass6_Sub15_Sub1_1.method3040(aClass39_1.anInt552);
				aClass39_1.aClass6_Sub2_Sub20_1.method8378(aClass39_1.anIntArray42, local63.aClass6_Sub15_Sub1_1);
				local63.aClass6_Sub15_Sub1_1.method2999(local63.aClass6_Sub15_Sub1_1.anInt3174 - local109);
				local57.method6404(local63);
				return;
			}
			if (arg0 == 5062) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				anIntArray296[anInt5278++] = Static457.aClass48_1.method685(local192).aCharArray13[local834];
				return;
			}
			if (arg0 == 5063) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				anIntArray296[anInt5278++] = Static457.aClass48_1.method685(local192).aCharArray12[local834];
				return;
			}
			if (arg0 == 5064) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				if (local834 == -1) {
					anIntArray296[anInt5278++] = -1;
					return;
				}
				anIntArray296[anInt5278++] = Static457.aClass48_1.method685(local192).method7250(13, (char) local834);
				return;
			}
			if (arg0 == 5065) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				if (local834 == -1) {
					anIntArray296[anInt5278++] = -1;
					return;
				}
				anIntArray296[anInt5278++] = Static457.aClass48_1.method685(local192).method7245((char) local834);
				return;
			}
			if (arg0 == 5066) {
				local192 = anIntArray296[--anInt5278];
				anIntArray296[anInt5278++] = Static35.aClass276_1.method6929(local192).method8381();
				return;
			}
			if (arg0 == 5067) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				local109 = Static35.aClass276_1.method6929(local192).method8382(local834).anInt4414;
				anIntArray296[anInt5278++] = local109;
				return;
			}
			if (arg0 == 5068) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				aClass39_1.anIntArray42[local192] = local834;
				return;
			}
			if (arg0 == 5069) {
				anInt5278 -= 2;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				aClass39_1.anIntArray42[local192] = local834;
				return;
			}
			if (arg0 == 5070) {
				anInt5278 -= 3;
				local192 = anIntArray296[anInt5278];
				local834 = anIntArray296[anInt5278 + 1];
				local109 = anIntArray296[anInt5278 + 2];
				@Pc(1526) Class6_Sub2_Sub20 local1526 = Static35.aClass276_1.method6929(local192);
				if (local1526.method8382(local834).anInt4414 != 0) {
					throw new RuntimeException("bad command");
				}
				anIntArray296[anInt5278++] = local1526.method8377(local109, local834);
				return;
			}
			if (arg0 == 5071) {
				local95 = aStringArray22[--anInt5283];
				local1578 = anIntArray296[--anInt5278] == 1;
				Static451.method6940(local95, local1578);
				anIntArray296[anInt5278++] = Static327.anInt5649;
				return;
			}
			if (arg0 == 5072) {
				if (Static141.aShortArray139 != null && Static12.anInt187 < Static327.anInt5649) {
					anIntArray296[anInt5278++] = Static141.aShortArray139[Static12.anInt187++] & 0xFFFF;
					return;
				}
				anIntArray296[anInt5278++] = -1;
				return;
			}
			if (arg0 == 5073) {
				Static12.anInt187 = 0;
				return;
			}
			if (arg0 == 5074) {
				local57 = Static629.method8573();
				local63 = Static30.method353(Static592.aClass241_112, local57.aClass270_2);
				local63.aClass6_Sub15_Sub1_1.method3016(0);
				local109 = local63.aClass6_Sub15_Sub1_1.anInt3174;
				local63.aClass6_Sub15_Sub1_1.method3016(2);
				local63.aClass6_Sub15_Sub1_1.method3040(aClass39_1.anInt552);
				aClass39_1.aClass6_Sub2_Sub20_1.method8378(aClass39_1.anIntArray42, local63.aClass6_Sub15_Sub1_1);
				local63.aClass6_Sub15_Sub1_1.method2999(local63.aClass6_Sub15_Sub1_1.anInt3174 - local109);
				local57.method6404(local63);
				return;
			}
			if (arg0 == 5075) {
				local57 = Static629.method8573();
				local63 = Static30.method353(Static592.aClass241_112, local57.aClass270_2);
				local63.aClass6_Sub15_Sub1_1.method3016(0);
				local109 = local63.aClass6_Sub15_Sub1_1.anInt3174;
				local63.aClass6_Sub15_Sub1_1.method3016(3);
				local63.aClass6_Sub15_Sub1_1.method3040(aClass39_1.anInt552);
				aClass39_1.aClass6_Sub2_Sub20_1.method8378(aClass39_1.anIntArray42, local63.aClass6_Sub15_Sub1_1);
				local63.aClass6_Sub15_Sub1_1.method2999(local63.aClass6_Sub15_Sub1_1.anInt3174 - local109);
				local57.method6404(local63);
				return;
			}
		} else if (arg0 < 5200) {
			if (arg0 == 5100) {
				if (Static435.aClass148_1.method3952(86)) {
					anIntArray296[anInt5278++] = 1;
					return;
				}
				anIntArray296[anInt5278++] = 0;
				return;
			}
			if (arg0 == 5101) {
				if (Static435.aClass148_1.method3952(82)) {
					anIntArray296[anInt5278++] = 1;
					return;
				}
				anIntArray296[anInt5278++] = 0;
				return;
			}
			if (arg0 == 5102) {
				if (Static435.aClass148_1.method3952(81)) {
					anIntArray296[anInt5278++] = 1;
					return;
				}
				anIntArray296[anInt5278++] = 0;
				return;
			}
		} else {
			@Pc(2331) boolean local2331;
			if (arg0 < 5300) {
				if (arg0 == 5200) {
					Static38.method489(anIntArray296[--anInt5278]);
					return;
				}
				if (arg0 == 5201) {
					anIntArray296[anInt5278++] = Static363.method5532();
					return;
				}
				if (arg0 == 5205) {
					Static568.method8738(anIntArray296[--anInt5278], false, -1, -1);
					return;
				}
				@Pc(1908) Class6_Sub2_Sub9 local1908;
				if (arg0 == 5206) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static627.method6471(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					if (local1908 == null) {
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = local1908.anInt4780;
					return;
				}
				@Pc(1942) Class6_Sub2_Sub9 local1942;
				if (arg0 == 5207) {
					local1942 = Static627.method6468(anIntArray296[--anInt5278]);
					if (local1942 != null && local1942.aString49 != null) {
						aStringArray22[anInt5283++] = local1942.aString49;
						return;
					}
					aStringArray22[anInt5283++] = "";
					return;
				}
				if (arg0 == 5208) {
					anIntArray296[anInt5278++] = Static56.anInt690;
					anIntArray296[anInt5278++] = Static543.anInt8805;
					return;
				}
				if (arg0 == 5209) {
					anIntArray296[anInt5278++] = Static91.anInt1364 + Static627.anInt7264;
					anIntArray296[anInt5278++] = Static488.anInt8263 + Static627.anInt7268;
					return;
				}
				if (arg0 == 5210) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static627.method6468(local192);
					if (local1908 == null) {
						anIntArray296[anInt5278++] = 0;
						anIntArray296[anInt5278++] = 0;
						return;
					}
					anIntArray296[anInt5278++] = local1908.anInt4776 >> 14 & 0x3FFF;
					anIntArray296[anInt5278++] = local1908.anInt4776 & 0x3FFF;
					return;
				}
				if (arg0 == 5211) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static627.method6468(local192);
					if (local1908 == null) {
						anIntArray296[anInt5278++] = 0;
						anIntArray296[anInt5278++] = 0;
						return;
					}
					anIntArray296[anInt5278++] = local1908.anInt4782 - local1908.anInt4774;
					anIntArray296[anInt5278++] = local1908.anInt4770 - local1908.anInt4767;
					return;
				}
				@Pc(2139) Class6_Sub24 local2139;
				if (arg0 == 5212) {
					local2139 = Static200.method3728();
					if (local2139 == null) {
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = local2139.anInt4787;
					local834 = local2139.anInt4797 << 28 | local2139.anInt4789 + Static627.anInt7264 << 14 | local2139.anInt4794 + Static627.anInt7268;
					anIntArray296[anInt5278++] = local834;
					return;
				}
				if (arg0 == 5213) {
					local2139 = Static113.method2131();
					if (local2139 == null) {
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = local2139.anInt4787;
					local834 = local2139.anInt4797 << 28 | local2139.anInt4789 + Static627.anInt7264 << 14 | local2139.anInt4794 + Static627.anInt7268;
					anIntArray296[anInt5278++] = local834;
					return;
				}
				@Pc(2289) boolean local2289;
				if (arg0 == 5214) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static388.method5971();
					if (local1908 != null) {
						local2289 = local1908.method4379(anIntArray299, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
						if (local2289) {
							Static519.method7506(anIntArray299[1], anIntArray299[2]);
						}
					}
					return;
				}
				if (arg0 == 5215) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local834 = anIntArray296[anInt5278 + 1];
					@Pc(2329) Class82 local2329 = Static627.method6478(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					local2331 = false;
					for (@Pc(2336) Class6_Sub2_Sub9 local2336 = (Class6_Sub2_Sub9) local2329.method2071(); local2336 != null; local2336 = (Class6_Sub2_Sub9) local2329.method2078()) {
						if (local2336.anInt4780 == local834) {
							local2331 = true;
							break;
						}
					}
					if (local2331) {
						anIntArray296[anInt5278++] = 1;
						return;
					}
					anIntArray296[anInt5278++] = 0;
					return;
				}
				if (arg0 == 5218) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static627.method6468(local192);
					if (local1908 == null) {
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = local1908.anInt4777;
					return;
				}
				if (arg0 == 5220) {
					anIntArray296[anInt5278++] = Static98.anInt1457 == 100 ? 1 : 0;
					return;
				}
				if (arg0 == 5221) {
					local192 = anIntArray296[--anInt5278];
					Static519.method7506(local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
					return;
				}
				if (arg0 == 5222) {
					local1942 = Static388.method5971();
					if (local1942 != null) {
						local1578 = local1942.method4380(anIntArray299, Static91.anInt1364 + Static627.anInt7264, Static488.anInt8263 + Static627.anInt7268);
						if (local1578) {
							anIntArray296[anInt5278++] = anIntArray299[1];
							anIntArray296[anInt5278++] = anIntArray299[2];
							return;
						}
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = -1;
					anIntArray296[anInt5278++] = -1;
					return;
				}
				if (arg0 == 5223) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local834 = anIntArray296[anInt5278 + 1];
					Static568.method8738(local192, false, local834 >> 14 & 0x3FFF, local834 & 0x3FFF);
					return;
				}
				if (arg0 == 5224) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static388.method5971();
					if (local1908 != null) {
						local2289 = local1908.method4379(anIntArray299, local192 >> 28 & 0x3, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
						if (local2289) {
							anIntArray296[anInt5278++] = anIntArray299[1];
							anIntArray296[anInt5278++] = anIntArray299[2];
							return;
						}
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = -1;
					anIntArray296[anInt5278++] = -1;
					return;
				}
				if (arg0 == 5225) {
					local192 = anIntArray296[--anInt5278];
					local1908 = Static388.method5971();
					if (local1908 != null) {
						local2289 = local1908.method4380(anIntArray299, local192 >> 14 & 0x3FFF, local192 & 0x3FFF);
						if (local2289) {
							anIntArray296[anInt5278++] = anIntArray299[1];
							anIntArray296[anInt5278++] = anIntArray299[2];
							return;
						}
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = -1;
					anIntArray296[anInt5278++] = -1;
					return;
				}
				if (arg0 == 5226) {
					Static35.method454(anIntArray296[--anInt5278]);
					return;
				}
				if (arg0 == 5227) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local834 = anIntArray296[anInt5278 + 1];
					Static568.method8738(local192, true, local834 >> 14 & 0x3FFF, local834 & 0x3FFF);
					return;
				}
				if (arg0 == 5228) {
					Static157.aBoolean254 = anIntArray296[--anInt5278] == 1;
					return;
				}
				if (arg0 == 5229) {
					anIntArray296[anInt5278++] = Static157.aBoolean254 ? 1 : 0;
					return;
				}
				if (arg0 == 5230) {
					local192 = anIntArray296[--anInt5278];
					Static493.method7296(local192);
					return;
				}
				@Pc(2867) Class6 local2867;
				if (arg0 == 5231) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local1578 = anIntArray296[anInt5278 + 1] == 1;
					if (Static685.aClass74_77 != null) {
						local2867 = Static685.aClass74_77.method1401((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9051();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class6();
							Static685.aClass74_77.method1399(local2867, (long) local192);
						}
					}
					return;
				}
				@Pc(2914) Class6 local2914;
				if (arg0 == 5232) {
					local192 = anIntArray296[--anInt5278];
					if (Static685.aClass74_77 != null) {
						local2914 = Static685.aClass74_77.method1401((long) local192);
						anIntArray296[anInt5278++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray296[anInt5278++] = 0;
					return;
				}
				if (arg0 == 5233) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local1578 = anIntArray296[anInt5278 + 1] == 1;
					if (Static512.aClass74_59 != null) {
						local2867 = Static512.aClass74_59.method1401((long) local192);
						if (local2867 != null && !local1578) {
							local2867.method9051();
							return;
						}
						if (local2867 == null && local1578) {
							local2867 = new Class6();
							Static512.aClass74_59.method1399(local2867, (long) local192);
						}
					}
					return;
				}
				if (arg0 == 5234) {
					local192 = anIntArray296[--anInt5278];
					if (Static512.aClass74_59 != null) {
						local2914 = Static512.aClass74_59.method1401((long) local192);
						anIntArray296[anInt5278++] = local2914 == null ? 0 : 1;
						return;
					}
					anIntArray296[anInt5278++] = 0;
					return;
				}
				if (arg0 == 5235) {
					anIntArray296[anInt5278++] = Static627.aClass6_Sub2_Sub9_2 == null ? -1 : Static627.aClass6_Sub2_Sub9_2.anInt4780;
					return;
				}
				if (arg0 == 5236) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local834 = anIntArray296[anInt5278 + 1];
					local109 = local834 >> 14 & 0x3FFF;
					local115 = local834 & 0x3FFF;
					local375 = Static364.method5537(local115, local109, local192);
					if (local375 < 0) {
						anIntArray296[anInt5278++] = -1;
						return;
					}
					anIntArray296[anInt5278++] = local375;
					return;
				}
				if (arg0 == 5237) {
					Static643.method3511();
					return;
				}
			} else if (arg0 < 5400) {
				if (arg0 == 5300) {
					anInt5278 -= 2;
					local192 = anIntArray296[anInt5278];
					local834 = anIntArray296[anInt5278 + 1];
					Static137.method2612(local834, local192, 3, false);
					anIntArray296[anInt5278++] = Static221.aFrame1 == null ? 0 : 1;
					return;
				}
				if (arg0 == 5301) {
					if (Static221.aFrame1 != null) {
						Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
					}
					return;
				}
				if (arg0 == 5302) {
					@Pc(3186) Class328[] local3186 = Static560.method7904();
					anIntArray296[anInt5278++] = local3186.length;
					return;
				}
				if (arg0 == 5303) {
					local192 = anIntArray296[--anInt5278];
					@Pc(3210) Class328[] local3210 = Static560.method7904();
					anIntArray296[anInt5278++] = local3210[local192].anInt9013;
					anIntArray296[anInt5278++] = local3210[local192].anInt9016;
					return;
				}
				if (arg0 == 5305) {
					local192 = Static448.anInt7755;
					local834 = Static177.anInt3581;
					local109 = -1;
					@Pc(3245) Class328[] local3245 = Static560.method7904();
					for (local375 = 0; local375 < local3245.length; local375++) {
						@Pc(3252) Class328 local3252 = local3245[local375];
						if (local3252.anInt9013 == local192 && local3252.anInt9016 == local834) {
							local109 = local375;
							break;
						}
					}
					anIntArray296[anInt5278++] = local109;
					return;
				}
				if (arg0 == 5306) {
					anIntArray296[anInt5278++] = Static368.method5566();
					return;
				}
				if (arg0 == 5307) {
					local192 = anIntArray296[--anInt5278];
					if (local192 >= 1 && local192 <= 2) {
						Static137.method2612(-1, -1, local192, false);
						return;
					}
					return;
				}
				if (arg0 == 5308) {
					anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279();
					return;
				}
				if (arg0 == 5309) {
					local192 = anIntArray296[--anInt5278];
					if (local192 >= 1 && local192 <= 2) {
						Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub18_2);
						Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub18_1);
						Static392.method6007();
						return;
					}
					return;
				}
			} else {
				@Pc(3561) int local3561;
				if (arg0 < 5500) {
					if (arg0 == 5400) {
						anInt5283 -= 2;
						local95 = aStringArray22[anInt5283];
						local101 = aStringArray22[anInt5283 + 1];
						local109 = anIntArray296[--anInt5278];
						@Pc(3411) Class260 local3411 = Static629.method8573();
						@Pc(3417) Class6_Sub13 local3417 = Static30.method353(Static219.aClass241_59, local3411.aClass270_2);
						local3417.aClass6_Sub15_Sub1_1.method3016(Static290.method8800(local95) + Static290.method8800(local101) + 1);
						local3417.aClass6_Sub15_Sub1_1.method2991(local95);
						local3417.aClass6_Sub15_Sub1_1.method2991(local101);
						local3417.aClass6_Sub15_Sub1_1.method3016(local109);
						local3411.method6404(local3417);
						return;
					}
					if (arg0 == 5401) {
						anInt5278 -= 2;
						Static103.aShortArray36[anIntArray296[anInt5278]] = (short) Static145.method2850(anIntArray296[anInt5278 + 1]);
						Static149.aClass244_1.method5966();
						Static149.aClass244_1.method5968();
						Static221.aClass164_1.method4155();
						Static35.method456();
						return;
					}
					if (arg0 == 5405) {
						anInt5278 -= 2;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1];
						if (local192 >= 0 && local192 < 2) {
							Static375.anIntArrayArrayArray15[local192] = new int[local834 << 1][4];
						}
						return;
					}
					if (arg0 == 5406) {
						anInt5278 -= 7;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1] << 1;
						local109 = anIntArray296[anInt5278 + 2];
						local115 = anIntArray296[anInt5278 + 3];
						local375 = anIntArray296[anInt5278 + 4];
						local3561 = anIntArray296[anInt5278 + 5];
						@Pc(3567) int local3567 = anIntArray296[anInt5278 + 6];
						if (local192 >= 0 && local192 < 2 && Static375.anIntArrayArrayArray15[local192] != null && local834 >= 0 && local834 < Static375.anIntArrayArrayArray15[local192].length) {
							Static375.anIntArrayArrayArray15[local192][local834] = new int[] { (local109 >> 14 & 0x3FFF) << 9, local115 << 2, (local109 & 0x3FFF) << 9, local3567 };
							Static375.anIntArrayArrayArray15[local192][local834 + 1] = new int[] { (local375 >> 14 & 0x3FFF) << 9, local3561 << 2, (local375 & 0x3FFF) << 9 };
						}
						return;
					}
					if (arg0 == 5407) {
						local192 = Static375.anIntArrayArrayArray15[anIntArray296[--anInt5278]].length >> 1;
						anIntArray296[anInt5278++] = local192;
						return;
					}
					if (arg0 == 5411) {
						if (Static221.aFrame1 != null) {
							Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
						}
						if (Static637.aFrame3 != null) {
							Static287.method4705();
							System.exit(0);
							return;
						}
						local95 = Static492.aString29 == null ? Static675.method5013() : Static492.aString29;
						Static379.method5863(local95, false, Static651.aClass122_38, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 1);
						return;
					}
					if (arg0 == 5419) {
						local95 = "";
						if (Static308.aClass380_3 != null) {
							if (Static308.aClass380_3.anObject25 == null) {
								local95 = Static148.method2918(Static308.aClass380_3.anInt10064);
							} else {
								local95 = (String) Static308.aClass380_3.anObject25;
							}
						}
						aStringArray22[anInt5283++] = local95;
						return;
					}
					if (arg0 == 5420) {
						anIntArray296[anInt5278++] = Static651.aClass122_38.aBoolean281 ? 0 : 1;
						return;
					}
					if (arg0 == 5421) {
						if (Static221.aFrame1 != null) {
							Static137.method2612(-1, -1, Static687.aClass6_Sub44_33.aClass7_Sub18_2.method6279(), false);
						}
						local95 = aStringArray22[--anInt5283];
						local1578 = anIntArray296[--anInt5278] == 1;
						local198 = Static675.method5013() + local95;
						Static379.method5863(local198, local1578, Static651.aClass122_38, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431() == 1);
						return;
					}
					if (arg0 == 5422) {
						anInt5283 -= 2;
						local95 = aStringArray22[anInt5283];
						local101 = aStringArray22[anInt5283 + 1];
						local109 = anIntArray296[--anInt5278];
						if (local95.length() > 0) {
							if (Static339.aStringArray25 == null) {
								Static339.aStringArray25 = new String[Static289.anIntArray284[Static129.aClass121_1.anInt3555]];
							}
							Static339.aStringArray25[local109] = local95;
						}
						if (local101.length() > 0) {
							if (Static188.aStringArray16 == null) {
								Static188.aStringArray16 = new String[Static289.anIntArray284[Static129.aClass121_1.anInt3555]];
							}
							Static188.aStringArray16[local109] = local101;
						}
						return;
					}
					if (arg0 == 5423) {
						System.out.println(aStringArray22[--anInt5283]);
						return;
					}
					if (arg0 == 5424) {
						anInt5278 -= 11;
						Static402.anInt6953 = anIntArray296[anInt5278];
						Static217.anInt4292 = anIntArray296[anInt5278 + 1];
						Static539.anInt8777 = anIntArray296[anInt5278 + 2];
						Static541.anInt9251 = anIntArray296[anInt5278 + 3];
						Static456.anInt7869 = anIntArray296[anInt5278 + 4];
						Static57.anInt698 = anIntArray296[anInt5278 + 5];
						Static605.anInt9557 = anIntArray296[anInt5278 + 6];
						Static186.anInt3732 = anIntArray296[anInt5278 + 7];
						Static79.anInt1141 = anIntArray296[anInt5278 + 8];
						Static92.anInt1369 = anIntArray296[anInt5278 + 9];
						Static265.anInt5022 = anIntArray296[anInt5278 + 10];
						Static583.aClass223_113.method5285(Static456.anInt7869);
						Static583.aClass223_113.method5285(Static57.anInt698);
						Static583.aClass223_113.method5285(Static605.anInt9557);
						Static583.aClass223_113.method5285(Static186.anInt3732);
						Static583.aClass223_113.method5285(Static79.anInt1141);
						Static664.aClass49_38 = null;
						Static382.aClass49_26 = null;
						Static270.aClass49_23 = null;
						Static426.aClass49_37 = null;
						Static334.aClass49_25 = null;
						Static495.aClass49_30 = null;
						Static190.aClass49_9 = null;
						Static432.aClass49_28 = null;
						Static356.aBoolean442 = true;
						return;
					}
					if (arg0 == 5425) {
						Static81.method1196();
						Static356.aBoolean442 = false;
						return;
					}
					if (arg0 == 5426) {
						anInt5278 -= 2;
						Static269.anInt5037 = anIntArray296[anInt5278];
						Static295.anInt5252 = anIntArray296[anInt5278 + 1];
						return;
					}
					if (arg0 == 5427) {
						anInt5278 -= 2;
						return;
					}
					if (arg0 == 5428) {
						anInt5278 -= 2;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1];
						anIntArray296[anInt5278++] = Static59.method706(local192, local834) ? 1 : 0;
						return;
					}
					if (arg0 == 5429) {
						Static654.method8744(false, aStringArray22[--anInt5283], false);
						return;
					}
					if (arg0 == 5430) {
						try {
							Static692.method2495("accountcreated", Static371.anApplet1);
							return;
						} catch (@Pc(4148) Throwable local4148) {
							return;
						}
					}
					if (arg0 == 5431) {
						try {
							Static692.method2495("accountcreatestarted", Static371.anApplet1);
							return;
						} catch (@Pc(4161) Throwable local4161) {
							return;
						}
					}
					if (arg0 == 5432) {
						local95 = "";
						if (Static4.aClipboard1 != null) {
							@Pc(4173) Transferable local4173 = Static4.aClipboard1.getContents((Object) null);
							if (local4173 != null) {
								try {
									local95 = (String) local4173.getTransferData(DataFlavor.stringFlavor);
									if (local95 == null) {
										local95 = "";
									}
								} catch (@Pc(4186) Exception local4186) {
								}
							}
						}
						aStringArray22[anInt5283++] = local95;
						return;
					}
					if (arg0 == 5433) {
						Static382.anInt6644 = anIntArray296[--anInt5278];
						return;
					}
					if (arg0 == 5435) {
						anIntArray296[anInt5278++] = Static477.aBoolean381 ? 1 : 0;
						return;
					}
					if (arg0 == 5436) {
						if (Static192.aClass6_Sub1_1.anInt49 < 6) {
							anIntArray296[anInt5278++] = 0;
							return;
						}
						if (Static192.aClass6_Sub1_1.anInt49 == 6 && Static192.aClass6_Sub1_1.anInt41 < 10) {
							anIntArray296[anInt5278++] = 0;
							return;
						}
						anIntArray296[anInt5278++] = 1;
						return;
					}
				} else if (arg0 < 5600) {
					if (arg0 == 5500) {
						anInt5278 -= 4;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1];
						local109 = anIntArray296[anInt5278 + 2];
						local115 = anIntArray296[anInt5278 + 3];
						Static155.method3085(local109, (local192 & 0x3FFF) - Static404.anInt7039, false, local115, (local192 >> 14 & 0x3FFF) - Static50.anInt606, local834 << 2);
						return;
					}
					if (arg0 == 5501) {
						anInt5278 -= 4;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1];
						local109 = anIntArray296[anInt5278 + 2];
						local115 = anIntArray296[anInt5278 + 3];
						Static437.method6611(local115, (local192 >> 14 & 0x3FFF) - Static50.anInt606, local109, (local192 & 0x3FFF) - Static404.anInt7039, local834 << 2);
						return;
					}
					if (arg0 == 5502) {
						anInt5278 -= 6;
						local192 = anIntArray296[anInt5278];
						if (local192 >= 2) {
							throw new RuntimeException();
						}
						Static619.anInt9777 = local192;
						local834 = anIntArray296[anInt5278 + 1];
						if (local834 + 1 >= Static375.anIntArrayArrayArray15[Static619.anInt9777].length >> 1) {
							throw new RuntimeException();
						}
						Static209.anInt4178 = local834;
						Static47.anInt578 = 0;
						Static93.anInt1379 = anIntArray296[anInt5278 + 2];
						Static221.anInt4356 = anIntArray296[anInt5278 + 3];
						local109 = anIntArray296[anInt5278 + 4];
						if (local109 >= 2) {
							throw new RuntimeException();
						}
						Static560.anInt9040 = local109;
						local115 = anIntArray296[anInt5278 + 5];
						if (local115 + 1 >= Static375.anIntArrayArrayArray15[Static560.anInt9040].length >> 1) {
							throw new RuntimeException();
						}
						Static358.anInt6046 = local115;
						Static526.anInt8626 = 3;
						Static16.anInt232 = -1;
						Static126.anInt2529 = -1;
						return;
					}
					if (arg0 == 5503) {
						Static552.method7810();
						return;
					}
					if (arg0 == 5504) {
						anInt5278 -= 2;
						Static75.method1017(anIntArray296[anInt5278 + 1], anIntArray296[anInt5278]);
						return;
					}
					if (arg0 == 5505) {
						anIntArray296[anInt5278++] = (int) Static135.aFloat51 >> 3;
						return;
					}
					if (arg0 == 5506) {
						anIntArray296[anInt5278++] = (int) Static409.aFloat135 >> 3;
						return;
					}
					if (arg0 == 5507) {
						Static594.method8230();
						return;
					}
					if (arg0 == 5508) {
						Static233.method4123();
						return;
					}
					if (arg0 == 5509) {
						Static645.method8046();
						return;
					}
					if (arg0 == 5510) {
						Static496.method7311();
						return;
					}
					if (arg0 == 5511) {
						local192 = anIntArray296[--anInt5278];
						local834 = local192 >> 14 & 0x3FFF;
						local109 = local192 & 0x3FFF;
						local834 -= Static50.anInt606;
						if (local834 < 0) {
							local834 = 0;
						} else if (local834 >= Static29.anInt380) {
							local834 = Static29.anInt380;
						}
						local109 -= Static404.anInt7039;
						if (local109 < 0) {
							local109 = 0;
						} else if (local109 >= Static327.anInt5650) {
							local109 = Static327.anInt5650;
						}
						Static492.anInt3485 = (local834 << 9) + 256;
						Static553.anInt8968 = (local109 << 9) + 256;
						Static526.anInt8626 = 4;
						Static16.anInt232 = -1;
						Static126.anInt2529 = -1;
						return;
					}
					if (arg0 == 5512) {
						Static470.method7087();
						return;
					}
					if (arg0 == 5514) {
						Static377.anInt6464 = anIntArray296[--anInt5278];
						return;
					}
					if (arg0 == 5516) {
						anIntArray296[anInt5278++] = Static377.anInt6464;
						return;
					}
					if (arg0 == 5517) {
						local192 = anIntArray296[--anInt5278];
						if (local192 == -1) {
							local834 = local192 >> 14 & 0x3FFF;
							local109 = local192 & 0x3FFF;
							local834 -= Static50.anInt606;
							if (local834 < 0) {
								local834 = 0;
							} else if (local834 >= Static29.anInt380) {
								local834 = Static29.anInt380;
							}
							local109 -= Static404.anInt7039;
							if (local109 < 0) {
								local109 = 0;
							} else if (local109 >= Static327.anInt5650) {
								local109 = Static327.anInt5650;
							}
							Static126.anInt2529 = (local834 << 9) + 256;
							Static16.anInt232 = (local109 << 9) + 256;
							return;
						}
						Static126.anInt2529 = -1;
						Static16.anInt232 = -1;
						return;
					}
					if (arg0 == 5547) {
						anIntArray296[anInt5278++] = Static526.anInt8626;
						return;
					}
				} else if (arg0 < 5700) {
					if (arg0 == 5600) {
						anInt5283 -= 2;
						local95 = aStringArray22[anInt5283];
						local101 = aStringArray22[anInt5283 + 1];
						local109 = anIntArray296[--anInt5278];
						Static352.method5391(local101, local95, local109);
						return;
					}
					if (arg0 == 5601) {
						Static58.method684();
						return;
					}
					if (arg0 == 5602) {
						if (!Static110.method2079()) {
							Static78.method1078();
						}
						return;
					}
					if (arg0 == 5604) {
						anInt5283--;
						if (Static37.anInt498 != 3) {
							return;
						}
						if (!Static110.method2079() && Static557.anInt9014 == 0) {
							Static142.method2790(aStringArray22[anInt5283]);
							return;
						}
						return;
					}
					if (arg0 == 5605) {
						anInt5283 -= 2;
						anInt5278 -= 2;
						if (Static37.anInt498 != 3) {
							return;
						}
						if (!Static110.method2079() && Static557.anInt9014 == 0) {
							Static127.method2490(aStringArray22[anInt5283], anIntArray296[anInt5278 + 1] == 1, aStringArray22[anInt5283 + 1], anIntArray296[anInt5278]);
							return;
						}
						return;
					}
					if (arg0 == 5606) {
						if (Static557.anInt9014 == 0) {
							Static607.anInt9572 = -2;
						}
						return;
					}
					if (arg0 == 5607) {
						anIntArray296[anInt5278++] = Static472.anInt8073;
						return;
					}
					if (arg0 == 5608) {
						anIntArray296[anInt5278++] = Static634.anInt9904;
						return;
					}
					if (arg0 == 5609) {
						anIntArray296[anInt5278++] = Static607.anInt9572;
						return;
					}
					if (arg0 == 5611) {
						anIntArray296[anInt5278++] = Static562.anInt9091;
						return;
					}
					if (arg0 == 5612) {
						local192 = anIntArray296[--anInt5278];
						Static98.method1415(local192);
						return;
					}
					if (arg0 == 5613) {
						anIntArray296[anInt5278++] = Static472.anInt8073;
						return;
					}
					if (arg0 == 5615) {
						anInt5283 -= 2;
						local95 = aStringArray22[anInt5283];
						local101 = aStringArray22[anInt5283 + 1];
						Static616.method8498(local101, local95);
						return;
					}
					if (arg0 == 5616) {
						Static166.method3296(false);
						return;
					}
					if (arg0 == 5617) {
						anIntArray296[anInt5278++] = Static513.anInt8474;
						return;
					}
					if (arg0 == 5618) {
						anInt5278--;
						return;
					}
					if (arg0 == 5619) {
						anInt5278--;
						return;
					}
					if (arg0 == 5620) {
						anIntArray296[anInt5278++] = 0;
						return;
					}
					if (arg0 == 5621) {
						anInt5283 -= 2;
						anInt5278 -= 2;
						return;
					}
					if (arg0 == 5622) {
						return;
					}
					if (arg0 == 5623) {
						if (Static468.aByteArray78 != null) {
							anIntArray296[anInt5278++] = 1;
							return;
						}
						anIntArray296[anInt5278++] = 0;
						return;
					}
					if (arg0 == 5624) {
						anIntArray296[anInt5278++] = (int) (Static48.aLong225 >> 32);
						anIntArray296[anInt5278++] = (int) (Static48.aLong225 & 0xFFFFFFFFFFFFFFFFL);
						return;
					}
					if (arg0 == 5625) {
						anIntArray296[anInt5278++] = Static444.aBoolean582 ? 1 : 0;
						return;
					}
					if (arg0 == 5626) {
						Static444.aBoolean582 = true;
						Static366.method5548();
						return;
					}
					if (arg0 == 5627) {
						anIntArray296[anInt5278++] = Static171.anInt3540;
						anIntArray296[anInt5278++] = Static677.anInt9949;
						anIntArray296[anInt5278++] = Static21.anInt277;
						Static171.anInt3540 = -2;
						Static677.anInt9949 = -1;
						Static21.anInt277 = -1;
						return;
					}
					if (arg0 == 5628) {
						anIntArray296[anInt5278++] = Static110.method2079() ? 1 : 0;
						return;
					}
					if (arg0 == 5629) {
						anIntArray296[anInt5278++] = Static462.anInt7983;
						return;
					}
					if (arg0 == 5630) {
						Static425.method6508();
						return;
					}
					if (arg0 == 5631) {
						anInt5278 -= 2;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1];
						Static499.method7330(local192, local834);
						return;
					}
					if (arg0 == 5632) {
						local192 = anIntArray296[--anInt5278];
						Static514.method7395(local192);
						return;
					}
					if (arg0 == 5633) {
						anIntArray296[anInt5278++] = Static584.anInt9324;
						return;
					}
				} else if (arg0 < 6100) {
					if (arg0 == 6001) {
						local192 = anIntArray296[--anInt5278];
						Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub5_1);
						Static41.method532();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					@Pc(5330) boolean local5330;
					if (arg0 == 6002) {
						local5330 = anIntArray296[--anInt5278] == 1;
						Static687.aClass6_Sub44_33.method7080(local5330 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub6_2);
						Static687.aClass6_Sub44_33.method7080(local5330 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub6_1);
						Static41.method532();
						Static183.method3450();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6003) {
						local5330 = anIntArray296[--anInt5278] == 1;
						Static687.aClass6_Sub44_33.method7080(local5330 ? 2 : 1, Static687.aClass6_Sub44_33.aClass7_Sub24_1);
						Static687.aClass6_Sub44_33.method7080(local5330 ? 2 : 1, Static687.aClass6_Sub44_33.aClass7_Sub24_2);
						Static183.method3450();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6005) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub8_1);
						Static41.method532();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6007) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub27_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6008) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub29_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6010) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub14_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6011) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub3_1);
						Static41.method532();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6012) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub4_1);
						Static423.method6439();
						Static433.method6599();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6014) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 2 : 0, Static687.aClass6_Sub44_33.aClass7_Sub28_1);
						Static41.method532();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6015) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.lb);
						Static41.method532();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6016) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub25_2);
						Static536.method7652(false, Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431());
						Static392.method6007();
						return;
					}
					if (arg0 == 6017) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub15_1);
						Static618.method8508();
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6018) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub13_5);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6019) {
						local192 = anIntArray296[--anInt5278];
						local834 = Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338();
						if (local192 != local834) {
							if (Static292.method4772(Static37.anInt498)) {
								if (local834 == 0 && Static478.anInt8119 != -1) {
									Static551.method7805(Static478.anInt8119, Static209.aClass223_41, local192);
									Static666.method8844();
									Static588.aBoolean698 = false;
								} else if (local192 == 0) {
									Static552.method7811();
									Static588.aBoolean698 = false;
								} else {
									Static605.method8339(local192);
								}
							}
							Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub13_2);
							Static392.method6007();
							Static554.aBoolean681 = false;
						}
						return;
					}
					if (arg0 == 6020) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub13_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6021) {
						local192 = Static687.aClass6_Sub44_33.aClass7_Sub24_1.method7501();
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 0 : local192, Static687.aClass6_Sub44_33.aClass7_Sub24_2);
						Static183.method3450();
						return;
					}
					if (arg0 == 6023) {
						local192 = anIntArray296[--anInt5278];
						Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub12_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6024) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub25_1);
						Static392.method6007();
						return;
					}
					if (arg0 == 6025) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub7_1);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6027) {
						local192 = anIntArray296[--anInt5278];
						if (local192 < 0 || local192 > 1) {
							local192 = 0;
						}
						Static591.method8211(local192 == 1);
						return;
					}
					if (arg0 == 6028) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 0 ? 0 : 1, Static687.aClass6_Sub44_33.aClass7_Sub30_1);
						Static392.method6007();
						return;
					}
					if (arg0 == 6029) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub27_1);
						Static392.method6007();
						return;
					}
					if (arg0 == 6030) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 0 ? 0 : 1, Static687.aClass6_Sub44_33.aClass7_Sub20_1);
						Static392.method6007();
						Static41.method532();
						return;
					}
					if (arg0 == 6031) {
						local192 = anIntArray296[--anInt5278];
						if (local192 < 0 || local192 > 5) {
							local192 = 2;
						}
						Static536.method7652(false, local192);
						return;
					}
					if (arg0 == 6032) {
						anInt5278 -= 2;
						local192 = anIntArray296[anInt5278];
						local1578 = anIntArray296[anInt5278 + 1] == 1;
						Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub19_2);
						if (!local1578) {
							Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub1_1);
						}
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6033) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub26_1);
						Static392.method6007();
						return;
					}
					if (arg0 == 6034) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : 0, Static687.aClass6_Sub44_33.aClass7_Sub2_1);
						Static392.method6007();
						Static423.method6439();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6035) {
						local192 = Static687.aClass6_Sub44_33.aClass7_Sub6_2.method926();
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278] == 1 ? 1 : local192, Static687.aClass6_Sub44_33.aClass7_Sub6_1);
						Static41.method532();
						Static183.method3450();
						return;
					}
					if (arg0 == 6036) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub10_1);
						Static392.method6007();
						Static513.aBoolean649 = true;
						return;
					}
					if (arg0 == 6037) {
						Static687.aClass6_Sub44_33.method7080(anIntArray296[--anInt5278], Static687.aClass6_Sub44_33.aClass7_Sub13_3);
						Static392.method6007();
						Static554.aBoolean681 = false;
						return;
					}
					if (arg0 == 6038) {
						local192 = anIntArray296[--anInt5278];
						local834 = Static687.aClass6_Sub44_33.aClass7_Sub13_4.method3338();
						if (local192 != local834 && Static478.anInt8119 == Static141.anInt8739) {
							if (!Static292.method4772(Static37.anInt498)) {
								if (local834 == 0) {
									Static551.method7805(Static478.anInt8119, Static209.aClass223_41, local192);
									Static666.method8844();
									Static588.aBoolean698 = false;
								} else if (local192 == 0) {
									Static552.method7811();
									Static588.aBoolean698 = false;
								} else {
									Static605.method8339(local192);
								}
							}
							Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub13_4);
							Static392.method6007();
							Static554.aBoolean681 = false;
						}
						return;
					}
					if (arg0 == 6039) {
						local192 = anIntArray296[--anInt5278];
						if (local192 > 255 || local192 < 0) {
							local192 = 0;
						}
						if (local192 != Static687.aClass6_Sub44_33.aClass7_Sub23_1.method7151()) {
							Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub23_1);
							Static392.method6007();
							Static554.aBoolean681 = false;
						}
						return;
					}
					if (arg0 == 6040) {
						local192 = anIntArray296[--anInt5278];
						if (local192 != Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2017()) {
							Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub9_1);
							Static392.method6007();
							Static554.aBoolean681 = false;
							Static300.method7412();
						}
						return;
					}
					if (arg0 == 6041) {
						local192 = anIntArray296[--anInt5278];
						if (local192 != Static687.aClass6_Sub44_33.aClass7_Sub11_1.method2916()) {
							Static687.aClass6_Sub44_33.method7080(local192, Static687.aClass6_Sub44_33.aClass7_Sub11_1);
							Static392.method6007();
							Static554.aBoolean681 = false;
						}
						return;
					}
				} else if (arg0 < 6200) {
					if (arg0 == 6101) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub5_1.method808();
						return;
					}
					if (arg0 == 6102) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub6_2.method926() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6103) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub24_1.method7501() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6105) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub8_1.method1416() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6107) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub27_1.method7953();
						return;
					}
					if (arg0 == 6108) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub29_1.method8614() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6110) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub14_1.method4756() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6111) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub3_1.method591();
						return;
					}
					if (arg0 == 6112) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub4_1.method648() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6114) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub28_1.method8314() == 2 ? 1 : 0;
						return;
					}
					if (arg0 == 6115) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.lb.method7058() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6116) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub25_2.method7631();
						return;
					}
					if (arg0 == 6117) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub15_1.method4771() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6118) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub13_5.method3338();
						return;
					}
					if (arg0 == 6119) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub13_2.method3338();
						return;
					}
					if (arg0 == 6120) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub13_1.method3338();
						return;
					}
					if (arg0 == 6123) {
						anIntArray296[anInt5278++] = Static483.method7188();
						return;
					}
					if (arg0 == 6124) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub25_1.method7631();
						return;
					}
					if (arg0 == 6125) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub7_1.method1193();
						return;
					}
					if (arg0 == 6127) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub17_1.method5991() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6128) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub30_1.method8787() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6129) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub27_1.method7953();
						return;
					}
					if (arg0 == 6130) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub20_1.method6876() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6131) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431();
						return;
					}
					if (arg0 == 6132) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub19_2.method6431();
						return;
					}
					if (arg0 == 6133) {
						anIntArray296[anInt5278++] = Static651.aClass122_38.aBoolean281 && !Static651.aClass122_38.aBoolean282 ? 1 : 0;
						return;
					}
					if (arg0 == 6135) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub26_1.method7643();
						return;
					}
					if (arg0 == 6136) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub2_1.method236() == 1 ? 1 : 0;
						return;
					}
					if (arg0 == 6138) {
						anIntArray296[anInt5278++] = Static565.method7970(Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431(), 200);
						return;
					}
					if (arg0 == 6139) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub10_1.method2536();
						return;
					}
					if (arg0 == 6142) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub13_3.method3338();
						return;
					}
					if (arg0 == 6143) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub13_4.method3338();
						return;
					}
					if (arg0 == 6144) {
						anIntArray296[anInt5278++] = Static210.aBoolean335 ? 1 : 0;
						return;
					}
					if (arg0 == 6145) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub23_1.method7151();
						return;
					}
					if (arg0 == 6146) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2017();
						return;
					}
					if (arg0 == 6147) {
						anIntArray296[anInt5278++] = Static192.aClass6_Sub1_1.anInt39 < 512 || Static210.aBoolean335 || Static211.aBoolean336 ? 1 : 0;
						return;
					}
					if (arg0 == 6148) {
						anIntArray296[anInt5278++] = Static121.aBoolean196 ? 1 : 0;
						return;
					}
					if (arg0 == 6149) {
						anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub11_1.method2916();
						return;
					}
				} else if (arg0 < 6300) {
					if (arg0 == 6200) {
						anInt5278 -= 2;
						Static593.aShort123 = (short) anIntArray296[anInt5278];
						if (Static593.aShort123 <= 0) {
							Static593.aShort123 = 256;
						}
						Static495.aShort103 = (short) anIntArray296[anInt5278 + 1];
						if (Static495.aShort103 <= 0) {
							Static495.aShort103 = 205;
						}
						return;
					}
					if (arg0 == 6201) {
						anInt5278 -= 2;
						Static582.aShort117 = (short) anIntArray296[anInt5278];
						if (Static582.aShort117 <= 0) {
							Static582.aShort117 = 256;
						}
						Static73.aShort43 = (short) anIntArray296[anInt5278 + 1];
						if (Static73.aShort43 <= 0) {
							Static73.aShort43 = 320;
						}
						return;
					}
					if (arg0 == 6202) {
						anInt5278 -= 4;
						Static426.aShort131 = (short) anIntArray296[anInt5278];
						if (Static426.aShort131 <= 0) {
							Static426.aShort131 = 1;
						}
						Static427.aShort81 = (short) anIntArray296[anInt5278 + 1];
						if (Static427.aShort81 <= 0) {
							Static427.aShort81 = 32767;
						} else if (Static427.aShort81 < Static426.aShort131) {
							Static427.aShort81 = Static426.aShort131;
						}
						Static398.aShort76 = (short) anIntArray296[anInt5278 + 2];
						if (Static398.aShort76 <= 0) {
							Static398.aShort76 = 1;
						}
						Static443.aShort28 = (short) anIntArray296[anInt5278 + 3];
						if (Static443.aShort28 <= 0) {
							Static443.aShort28 = 32767;
							return;
						}
						if (Static443.aShort28 < Static398.aShort76) {
							Static443.aShort28 = Static398.aShort76;
						}
						return;
					}
					if (arg0 == 6203) {
						Static316.method5657(Static493.aClass381_10.anInt10131, Static493.aClass381_10.anInt10159, 0, false, 0);
						anIntArray296[anInt5278++] = Static348.anInt5924;
						anIntArray296[anInt5278++] = Static391.anInt6746;
						return;
					}
					if (arg0 == 6204) {
						anIntArray296[anInt5278++] = Static582.aShort117;
						anIntArray296[anInt5278++] = Static73.aShort43;
						return;
					}
					if (arg0 == 6205) {
						anIntArray296[anInt5278++] = Static593.aShort123;
						anIntArray296[anInt5278++] = Static495.aShort103;
						return;
					}
				} else if (arg0 < 6400) {
					if (arg0 == 6300) {
						anIntArray296[anInt5278++] = (int) (Static549.method7758() / 60000L);
						return;
					}
					if (arg0 == 6301) {
						anIntArray296[anInt5278++] = (int) (Static549.method7758() / 86400000L) - 11745;
						return;
					}
					if (arg0 == 6302) {
						anInt5278 -= 3;
						local192 = anIntArray296[anInt5278];
						local834 = anIntArray296[anInt5278 + 1];
						local109 = anIntArray296[anInt5278 + 2];
						@Pc(7377) long local7377 = Static461.method7018(local109, local834, local192);
						local3561 = Static592.method8220(local7377);
						if (local109 < 1970) {
							local3561--;
						}
						anIntArray296[anInt5278++] = local3561;
						return;
					}
					if (arg0 == 6303) {
						anIntArray296[anInt5278++] = Static118.method2177(Static549.method7758());
						return;
					}
					if (arg0 == 6304) {
						local192 = anIntArray296[--anInt5278];
						local1578 = true;
						if (local192 < 0) {
							local1578 = (local192 + 1) % 4 == 0;
						} else if (local192 < 1582) {
							local1578 = local192 % 4 == 0;
						} else if (local192 % 4 != 0) {
							local1578 = false;
						} else if (local192 % 100 != 0) {
							local1578 = true;
						} else if (local192 % 400 != 0) {
							local1578 = false;
						}
						anIntArray296[anInt5278++] = local1578 ? 1 : 0;
						return;
					}
					if (arg0 == 6305) {
						local192 = anIntArray296[--anInt5278];
						@Pc(7505) int[] local7505 = Static34.method447(local192);
						Static695.method5649(local7505, 0, anIntArray296, anInt5278, 3);
						anInt5278 += 3;
						return;
					}
					if (arg0 == 6306) {
						local192 = anIntArray296[--anInt5278];
						anIntArray296[anInt5278++] = (int) (Static313.method4965(local192) / 60000L);
						return;
					}
				} else if (arg0 < 6500) {
					if (arg0 == 6405) {
						anIntArray296[anInt5278++] = Static547.method7750() ? 1 : 0;
						return;
					}
					if (arg0 == 6406) {
						anIntArray296[anInt5278++] = Static31.method415() ? 1 : 0;
						return;
					}
				} else if (arg0 < 6600) {
					if (arg0 == 6500) {
						if (Static37.anInt498 == 7 && !Static110.method2079() && Static557.anInt9014 == 0) {
							if (Static112.aBoolean191) {
								anIntArray296[anInt5278++] = 0;
								return;
							}
							if (Static235.aLong138 > Static549.method7758() - 1000L) {
								anIntArray296[anInt5278++] = 1;
								return;
							}
							Static112.aBoolean191 = true;
							@Pc(7655) Class6_Sub13 local7655 = Static30.method353(Static211.aClass241_56, Static525.aClass260_3.aClass270_2);
							local7655.aClass6_Sub15_Sub1_1.method3029(Static576.anInt9207);
							Static525.aClass260_3.method6404(local7655);
							anIntArray296[anInt5278++] = 0;
							return;
						}
						anIntArray296[anInt5278++] = 1;
						return;
					}
					@Pc(7712) Class182 local7712;
					@Pc(7679) Class204_Sub1 local7679;
					if (arg0 == 6501) {
						local7679 = Static372.method8351();
						if (local7679 != null) {
							anIntArray296[anInt5278++] = local7679.anInt6031;
							anIntArray296[anInt5278++] = local7679.anInt6021;
							aStringArray22[anInt5283++] = local7679.aString69;
							local7712 = local7679.method5432();
							anIntArray296[anInt5278++] = local7712.anInt5045;
							aStringArray22[anInt5283++] = local7712.aString53;
							anIntArray296[anInt5278++] = local7679.anInt6024;
							anIntArray296[anInt5278++] = local7679.anInt6032;
							aStringArray22[anInt5283++] = local7679.aString70;
							return;
						}
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						anIntArray296[anInt5278++] = 0;
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						return;
					}
					if (arg0 == 6502) {
						local7679 = Static633.method7207();
						if (local7679 != null) {
							anIntArray296[anInt5278++] = local7679.anInt6031;
							anIntArray296[anInt5278++] = local7679.anInt6021;
							aStringArray22[anInt5283++] = local7679.aString69;
							local7712 = local7679.method5432();
							anIntArray296[anInt5278++] = local7712.anInt5045;
							aStringArray22[anInt5283++] = local7712.aString53;
							anIntArray296[anInt5278++] = local7679.anInt6024;
							anIntArray296[anInt5278++] = local7679.anInt6032;
							aStringArray22[anInt5283++] = local7679.aString70;
							return;
						}
						anIntArray296[anInt5278++] = -1;
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						anIntArray296[anInt5278++] = 0;
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						return;
					}
					if (arg0 == 6503) {
						local192 = anIntArray296[--anInt5278];
						local101 = aStringArray22[--anInt5283];
						if (Static37.anInt498 == 7 && !Static110.method2079() && Static557.anInt9014 == 0) {
							anIntArray296[anInt5278++] = Static653.method8740(local192, local101) ? 1 : 0;
							return;
						}
						anIntArray296[anInt5278++] = 0;
						return;
					}
					if (arg0 == 6506) {
						local192 = anIntArray296[--anInt5278];
						@Pc(8046) Class204_Sub1 local8046 = Static517.method7487(local192);
						if (local8046 != null) {
							anIntArray296[anInt5278++] = local8046.anInt6021;
							aStringArray22[anInt5283++] = local8046.aString69;
							@Pc(8070) Class182 local8070 = local8046.method5432();
							anIntArray296[anInt5278++] = local8070.anInt5045;
							aStringArray22[anInt5283++] = local8070.aString53;
							anIntArray296[anInt5278++] = local8046.anInt6024;
							anIntArray296[anInt5278++] = local8046.anInt6032;
							aStringArray22[anInt5283++] = local8046.aString70;
							return;
						}
						anIntArray296[anInt5278++] = -1;
						aStringArray22[anInt5283++] = "";
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						anIntArray296[anInt5278++] = 0;
						anIntArray296[anInt5278++] = 0;
						aStringArray22[anInt5283++] = "";
						return;
					}
					if (arg0 == 6507) {
						anInt5278 -= 4;
						local192 = anIntArray296[anInt5278];
						local1578 = anIntArray296[anInt5278 + 1] == 1;
						local109 = anIntArray296[anInt5278 + 2];
						local2331 = anIntArray296[anInt5278 + 3] == 1;
						Static143.method438(local192, local109, local2331, local1578);
						return;
					}
					if (arg0 == 6508) {
						Static244.method4312();
						return;
					}
					if (arg0 == 6509) {
						if (Static37.anInt498 != 7) {
							return;
						}
						Static442.aBoolean581 = anIntArray296[--anInt5278] == 1;
						return;
					}
					if (arg0 == 6510) {
						anIntArray296[anInt5278++] = Static687.anInt9943;
						return;
					}
				} else if (arg0 >= 6700) {
					if (arg0 < 6800 && Static348.aClass136_3 == Static71.aClass136_1) {
						if (arg0 == 6700) {
							local192 = Static477.aClass74_31.method1400();
							if (Static635.anInt9910 != -1) {
								local192++;
							}
							anIntArray296[anInt5278++] = local192;
							return;
						}
						if (arg0 == 6701) {
							local192 = anIntArray296[--anInt5278];
							if (Static635.anInt9910 != -1) {
								if (local192 == 0) {
									anIntArray296[anInt5278++] = Static635.anInt9910;
									return;
								}
								local192--;
							}
							@Pc(8337) Class6_Sub25 local8337 = (Class6_Sub25) Static477.aClass74_31.method1404();
							while (local192-- > 0) {
								local8337 = (Class6_Sub25) Static477.aClass74_31.method1405();
							}
							anIntArray296[anInt5278++] = local8337.anInt5007;
							return;
						}
						if (arg0 == 6702) {
							local192 = anIntArray296[--anInt5278];
							if (Static686.aClass381ArrayArray2[local192] == null) {
								aStringArray22[anInt5283++] = "";
								return;
							}
							local101 = Static686.aClass381ArrayArray2[local192][0].aString124;
							if (local101 == null) {
								aStringArray22[anInt5283++] = "";
								return;
							}
							aStringArray22[anInt5283++] = local101.substring(0, local101.indexOf(58));
							return;
						}
						if (arg0 == 6703) {
							local192 = anIntArray296[--anInt5278];
							if (Static686.aClass381ArrayArray2[local192] == null) {
								anIntArray296[anInt5278++] = 0;
								return;
							}
							anIntArray296[anInt5278++] = Static686.aClass381ArrayArray2[local192].length;
							return;
						}
						if (arg0 == 6704) {
							anInt5278 -= 2;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							if (Static686.aClass381ArrayArray2[local192] == null) {
								aStringArray22[anInt5283++] = "";
								return;
							}
							local198 = Static686.aClass381ArrayArray2[local192][local834].aString124;
							if (local198 == null) {
								aStringArray22[anInt5283++] = "";
								return;
							}
							aStringArray22[anInt5283++] = local198;
							return;
						}
						if (arg0 == 6705) {
							anInt5278 -= 2;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							if (Static686.aClass381ArrayArray2[local192] == null) {
								anIntArray296[anInt5278++] = 0;
								return;
							}
							anIntArray296[anInt5278++] = Static686.aClass381ArrayArray2[local192][local834].anInt10146;
							return;
						}
						if (arg0 == 6706) {
							return;
						}
						if (arg0 == 6707) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(1, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6708) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(2, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6709) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(3, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6710) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(4, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6711) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(5, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6712) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(6, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6713) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(7, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6714) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(8, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6715) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(9, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6716) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							Static252.method8468(10, "", local109, local192 << 16 | local834);
							return;
						}
						if (arg0 == 6717) {
							anInt5278 -= 3;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							local109 = anIntArray296[anInt5278 + 2];
							@Pc(8933) Class381 local8933 = Static347.method5333(local109, local192 << 16 | local834);
							Static565.method7967();
							@Pc(8938) Class6_Sub32 local8938 = Static78.method1061(local8933);
							Static154.method3074(local8938.method5217(), local8933, local8938.anInt5779);
							return;
						}
					} else if (arg0 < 6900) {
						@Pc(8968) Class361 local8968;
						if (arg0 == 6800) {
							local192 = anIntArray296[--anInt5278];
							local8968 = Static508.aClass190_3.method4695(local192);
							if (local8968.aString117 == null) {
								aStringArray22[anInt5283++] = "";
								return;
							}
							aStringArray22[anInt5283++] = local8968.aString117;
							return;
						}
						if (arg0 == 6801) {
							local192 = anIntArray296[--anInt5278];
							local8968 = Static508.aClass190_3.method4695(local192);
							anIntArray296[anInt5278++] = local8968.anInt9805;
							return;
						}
						if (arg0 == 6802) {
							local192 = anIntArray296[--anInt5278];
							local8968 = Static508.aClass190_3.method4695(local192);
							anIntArray296[anInt5278++] = local8968.anInt9814;
							return;
						}
						if (arg0 == 6803) {
							local192 = anIntArray296[--anInt5278];
							local8968 = Static508.aClass190_3.method4695(local192);
							anIntArray296[anInt5278++] = local8968.anInt9818;
							return;
						}
						if (arg0 == 6804) {
							anInt5278 -= 2;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							@Pc(9091) Class302 local9091 = Static521.aClass20_21.method250(local834);
							if (local9091.method7331()) {
								aStringArray22[anInt5283++] = Static508.aClass190_3.method4695(local192).method8536(local834, local9091.aString96);
								return;
							}
							anIntArray296[anInt5278++] = Static508.aClass190_3.method4695(local192).method8530(local9091.anInt8386, local834);
							return;
						}
					} else if (arg0 < 7000) {
						if (arg0 == 6900) {
							anIntArray296[anInt5278++] = Static334.aBoolean425 && !Static364.aBoolean455 ? 1 : 0;
							return;
						}
						if (arg0 == 6901) {
							anIntArray296[anInt5278++] = (int) (Static478.aLong261 / 60000L);
							anIntArray296[anInt5278++] = (int) ((Static478.aLong261 - Static549.method7758() - Static453.aLong249) / 60000L);
							anIntArray296[anInt5278++] = Static608.aBoolean712 ? 1 : 0;
							return;
						}
						if (arg0 == 6902) {
							anIntArray296[anInt5278++] = Static335.anInt5740;
							return;
						}
						if (arg0 == 6903) {
							anIntArray296[anInt5278++] = Static337.anInt5770;
							return;
						}
						if (arg0 == 6904) {
							anIntArray296[anInt5278++] = Static397.anInt6877;
							return;
						}
						if (arg0 == 6905) {
							local95 = "";
							if (Static308.aClass380_3 != null) {
								if (Static308.aClass380_3.anObject25 == null) {
									local95 = Static148.method2918(Static308.aClass380_3.anInt10064);
								} else {
									local95 = (String) Static308.aClass380_3.anObject25;
								}
							}
							aStringArray22[anInt5283++] = local95;
							return;
						}
						if (arg0 == 6906) {
							anIntArray296[anInt5278++] = Static278.anInt3857;
							return;
						}
						if (arg0 == 6907) {
							anIntArray296[anInt5278++] = Static254.anInt4892;
							return;
						}
						if (arg0 == 6908) {
							anIntArray296[anInt5278++] = Static254.anInt4901;
							return;
						}
						if (arg0 == 6909) {
							anIntArray296[anInt5278++] = Static490.aBoolean633 ? 1 : 0;
							return;
						}
						if (arg0 == 6910) {
							anIntArray296[anInt5278++] = Static632.anInt9896;
							return;
						}
						if (arg0 == 6911) {
							anIntArray296[anInt5278++] = Static118.anInt2281;
							return;
						}
						if (arg0 == 6912) {
							anIntArray296[anInt5278++] = Static141.anInt8736;
							return;
						}
						if (arg0 == 6913) {
							anIntArray296[anInt5278++] = Static99.anInt1944;
							return;
						}
						if (arg0 == 6914) {
							anIntArray296[anInt5278++] = Static681.aBoolean768 ? 1 : 0;
							return;
						}
						if (arg0 == 6915) {
							anIntArray296[anInt5278++] = Static481.anInt8149;
							return;
						}
					} else if (arg0 < 7100) {
						if (arg0 == 7000) {
							local192 = Static629.method8578();
							anIntArray296[anInt5278++] = Static350.anInt5964 = Static687.aClass6_Sub44_33.aClass7_Sub19_1.method6431();
							anIntArray296[anInt5278++] = local192;
							Static41.method532();
							Static392.method6007();
							Static554.aBoolean681 = false;
							return;
						}
						if (arg0 == 7001) {
							Static550.method7784();
							Static41.method532();
							Static392.method6007();
							Static554.aBoolean681 = false;
							return;
						}
						if (arg0 == 7002) {
							Static610.method8412();
							Static41.method532();
							Static392.method6007();
							Static554.aBoolean681 = false;
							return;
						}
						if (arg0 == 7003) {
							Static680.method8955();
							Static41.method532();
							Static392.method6007();
							Static554.aBoolean681 = false;
							return;
						}
						if (arg0 == 7004) {
							Static419.method6415();
							Static41.method532();
							Static392.method6007();
							Static554.aBoolean681 = false;
							return;
						}
						if (arg0 == 7005) {
							Static687.aClass6_Sub44_33.method7080(0, Static687.aClass6_Sub44_33.aClass7_Sub1_1);
							Static392.method6007();
							Static554.aBoolean681 = false;
							return;
						}
						if (arg0 == 7006) {
							if (Static350.anInt5964 == 2) {
								Static114.aBoolean194 = true;
								return;
							}
							if (Static350.anInt5964 == 1) {
								Static419.aBoolean540 = true;
								return;
							}
							if (Static350.anInt5964 == 3) {
								Static363.aBoolean454 = true;
							}
							return;
						}
						if (arg0 == 7007) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub1_1.method56();
							return;
						}
					} else if (arg0 < 7200) {
						if (arg0 == 7100) {
							anInt5278 -= 2;
							local192 = anIntArray296[anInt5278];
							local834 = anIntArray296[anInt5278 + 1];
							if (local192 != -1) {
								if (local834 > 255) {
									local834 = 255;
								} else if (local834 < 0) {
									local834 = 0;
								}
								Static298.method4813(local192, false, local834);
							}
							return;
						}
						if (arg0 == 7101) {
							local192 = anIntArray296[--anInt5278];
							if (local192 != -1) {
								Static277.method4643(local192);
							}
							return;
						}
						if (arg0 == 7102) {
							local192 = anIntArray296[--anInt5278];
							if (local192 != -1) {
								Static468.method7067(local192);
							}
							return;
						}
						if (arg0 == 7103) {
							anIntArray296[anInt5278++] = Static687.method8626("jagtheora") ? 1 : 0;
							return;
						}
					} else if (arg0 < 7300) {
						if (arg0 == 7201) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub8_1.method1418() ? 1 : 0;
							return;
						}
						if (arg0 == 7202) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub14_1.method4757() ? 1 : 0;
							return;
						}
						if (arg0 == 7203) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub3_1.method594() ? 1 : 0;
							return;
						}
						if (arg0 == 7204) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub28_1.method8316() ? 1 : 0;
							return;
						}
						if (arg0 == 7205) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub25_1.method7632() && Static202.aClass75_5.method6676() ? 1 : 0;
							return;
						}
						if (arg0 == 7206) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub12_1.method3084() ? 1 : 0;
							return;
						}
						if (arg0 == 7207) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub7_1.method1194() ? 1 : 0;
							return;
						}
						if (arg0 == 7208) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub17_1.method5990() && Static202.aClass75_5.method6666() ? 1 : 0;
							return;
						}
						if (arg0 == 7209) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub20_1.method6875() ? 1 : 0;
							return;
						}
						if (arg0 == 7210) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub2_1.method238() ? 1 : 0;
							return;
						}
						if (arg0 == 7211) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub10_1.method2538() ? 1 : 0;
							return;
						}
						if (arg0 == 7212) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.lb.method7057() ? 1 : 0;
							return;
						}
						if (arg0 == 7213) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub9_1.method2019() ? 1 : 0;
							return;
						}
						if (arg0 == 7214) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub19_2.method6429() ? 1 : 0;
							return;
						}
						if (arg0 == 7215) {
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub11_1.method2917() ? 1 : 0;
							return;
						}
					} else if (arg0 < 7400) {
						if (arg0 == 7301) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub8_1.method8786(local192);
							return;
						}
						if (arg0 == 7302) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub14_1.method8786(local192);
							return;
						}
						if (arg0 == 7303) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub3_1.method8786(local192);
							return;
						}
						if (arg0 == 7304) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub28_1.method8786(local192);
							return;
						}
						if (arg0 == 7305) {
							local192 = anIntArray296[--anInt5278];
							if (!Static202.aClass75_5.method6676()) {
								anIntArray296[anInt5278++] = 3;
								return;
							}
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub25_1.method8786(local192);
							return;
						}
						if (arg0 == 7306) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub12_1.method8786(local192);
							return;
						}
						if (arg0 == 7307) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub7_1.method8786(local192);
							return;
						}
						if (arg0 == 7308) {
							local192 = anIntArray296[--anInt5278];
							if (!Static202.aClass75_5.method6666()) {
								anIntArray296[anInt5278++] = 3;
								return;
							}
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub17_1.method8786(local192);
							return;
						}
						if (arg0 == 7309) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub20_1.method8786(local192);
							return;
						}
						if (arg0 == 7310) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub2_1.method8786(local192);
							return;
						}
						if (arg0 == 7311) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub10_1.method8786(local192);
							return;
						}
						if (arg0 == 7312) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.lb.method8786(local192);
							return;
						}
						if (arg0 == 7313) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub9_1.method8786(local192);
							return;
						}
						if (arg0 == 7314) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub19_2.method8786(local192);
							return;
						}
						if (arg0 == 7315) {
							local192 = anIntArray296[--anInt5278];
							anIntArray296[anInt5278++] = Static687.aClass6_Sub44_33.aClass7_Sub11_1.method8786(local192);
							return;
						}
					}
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kaa", name = "c", descriptor = "(IZ)V")
	private static void method4833(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(220) Class381 local220;
		@Pc(21) int local21;
		@Pc(27) int local27;
		@Pc(72) int local72;
		@Pc(38) Class381 local38;
		@Pc(303) Class381 local303;
		@Pc(15) int local15;
		@Pc(248) Class381 local248;
		if (arg0 < 300) {
			if (arg0 == 150) {
				anInt5278 -= 3;
				local15 = anIntArray296[anInt5278];
				local21 = anIntArray296[anInt5278 + 1];
				local27 = anIntArray296[anInt5278 + 2];
				if (local21 == 0) {
					throw new RuntimeException();
				}
				local38 = Static69.method899(local15);
				if (local38.aClass381Array1 == null) {
					local38.aClass381Array1 = new Class381[local27 + 1];
					local38.aClass381Array2 = local38.aClass381Array1;
				}
				if (local38.aClass381Array1.length <= local27) {
					@Pc(70) Class381[] local70;
					if (local38.aClass381Array1 == local38.aClass381Array2) {
						local70 = new Class381[local27 + 1];
						for (local72 = 0; local72 < local38.aClass381Array1.length; local72++) {
							local70[local72] = local38.aClass381Array1[local72];
						}
						local38.aClass381Array1 = local38.aClass381Array2 = local70;
					} else {
						local70 = new Class381[local27 + 1];
						@Pc(104) Class381[] local104 = new Class381[local27 + 1];
						for (@Pc(106) int local106 = 0; local106 < local38.aClass381Array1.length; local106++) {
							local70[local106] = local38.aClass381Array1[local106];
							local104[local106] = local38.aClass381Array2[local106];
						}
						local38.aClass381Array1 = local70;
						local38.aClass381Array2 = local104;
					}
				}
				if (local27 > 0 && local38.aClass381Array1[local27 - 1] == null) {
					throw new RuntimeException("Gap at:" + (local27 - 1));
				}
				@Pc(166) Class381 local166 = new Class381();
				local166.anInt10156 = local21;
				local166.anInt10079 = local166.anInt10089 = local38.anInt10089;
				local166.anInt10112 = local27;
				local38.aClass381Array1[local27] = local166;
				if (local38.aClass381Array2 != local38.aClass381Array1) {
					local38.aClass381Array2[local27] = local166;
				}
				if (arg1) {
					aClass381_5 = local166;
				} else {
					aClass381_6 = local166;
				}
				Static168.method3312(local38);
				return;
			}
			if (arg0 == 151) {
				local220 = arg1 ? aClass381_5 : aClass381_6;
				if (local220.anInt10112 == -1) {
					if (arg1) {
						throw new RuntimeException("Tried to .cc_delete static .active-component!");
					}
					throw new RuntimeException("Tried to cc_delete static active-component!");
				}
				local248 = Static69.method899(local220.anInt10089);
				local248.aClass381Array1[local220.anInt10112] = null;
				Static168.method3312(local248);
				return;
			}
			if (arg0 == 152) {
				local220 = Static69.method899(anIntArray296[--anInt5278]);
				local220.aClass381Array1 = null;
				local220.aClass381Array2 = null;
				Static168.method3312(local220);
				return;
			}
			if (arg0 == 200) {
				anInt5278 -= 2;
				local15 = anIntArray296[anInt5278];
				local21 = anIntArray296[anInt5278 + 1];
				local303 = Static347.method5333(local21, local15);
				if (local303 != null && local21 != -1) {
					anIntArray296[anInt5278++] = 1;
					if (arg1) {
						aClass381_5 = local303;
						return;
					}
					aClass381_6 = local303;
					return;
				}
				anIntArray296[anInt5278++] = 0;
				return;
			}
			if (arg0 == 201) {
				local15 = anIntArray296[--anInt5278];
				local248 = Static69.method899(local15);
				if (local248 != null) {
					anIntArray296[anInt5278++] = 1;
					if (arg1) {
						aClass381_5 = local248;
						return;
					}
					aClass381_6 = local248;
					return;
				}
				anIntArray296[anInt5278++] = 0;
				return;
			}
			if (arg0 != 202 && arg0 != 204) {
				if (arg0 != 203 && arg0 != 205) {
					throw new IllegalStateException(String.valueOf(arg0));
				}
				if (arg0 == 203) {
					local21 = anIntArray296[--anInt5278];
					local220 = Static69.method899(local21);
				} else {
					local220 = arg1 ? aClass381_5 : aClass381_6;
				}
				method4837(local220);
				return;
			}
			if (arg0 == 202) {
				local21 = anIntArray296[--anInt5278];
				local220 = Static69.method899(local21);
			} else {
				local220 = arg1 ? aClass381_5 : aClass381_6;
			}
			method4847(local220);
			return;
		}
		@Pc(506) int local506;
		@Pc(575) boolean local575;
		if (arg0 < 500) {
			if (arg0 == 403) {
				anInt5278 -= 2;
				local15 = anIntArray296[anInt5278];
				local21 = anIntArray296[anInt5278 + 1];
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 == null) {
					return;
				}
				for (local27 = 0; local27 < Static140.anIntArray163.length; local27++) {
					if (Static140.anIntArray163[local27] == local15) {
						Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.method1362(Static664.aClass319_2, local21, local27);
						return;
					}
				}
				for (local506 = 0; local506 < Static56.anIntArray48.length; local506++) {
					if (Static56.anIntArray48[local506] == local15) {
						Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.method1362(Static664.aClass319_2, local21, local506);
						return;
					}
				}
				return;
			}
			if (arg0 == 404) {
				anInt5278 -= 2;
				local15 = anIntArray296[anInt5278];
				local21 = anIntArray296[anInt5278 + 1];
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 == null) {
					return;
				}
				Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.method1371(local15, local21);
				return;
			}
			if (arg0 == 410) {
				local575 = anIntArray296[--anInt5278] != 0;
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 == null) {
					return;
				}
				Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.method1370(local575);
				return;
			}
			if (arg0 == 411) {
				anInt5278 -= 2;
				local15 = anIntArray296[anInt5278];
				local21 = anIntArray296[anInt5278 + 1];
				if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 == null) {
					return;
				}
				Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.method1361(local21, local15, Static149.aClass244_1);
				return;
			}
		} else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
			if (arg0 >= 2000) {
				arg0 -= 1000;
				local220 = Static69.method899(anIntArray296[--anInt5278]);
			} else {
				local220 = arg1 ? aClass381_5 : aClass381_6;
			}
			if (arg0 == 1000) {
				anInt5278 -= 4;
				local220.anInt10135 = anIntArray296[anInt5278];
				local220.anInt10143 = anIntArray296[anInt5278 + 1];
				local21 = anIntArray296[anInt5278 + 2];
				if (local21 < 0) {
					local21 = 0;
				} else if (local21 > 5) {
					local21 = 5;
				}
				local27 = anIntArray296[anInt5278 + 3];
				if (local27 < 0) {
					local27 = 0;
				} else if (local27 > 5) {
					local27 = 5;
				}
				local220.aByte143 = (byte) local21;
				local220.aByte145 = (byte) local27;
				Static168.method3312(local220);
				Static203.method7612(local220);
				if (local220.anInt10112 == -1) {
					Static684.method9003(local220.anInt10089);
				}
				return;
			}
			if (arg0 == 1001) {
				anInt5278 -= 4;
				local220.anInt10094 = anIntArray296[anInt5278];
				local220.anInt10108 = anIntArray296[anInt5278 + 1];
				local220.anInt10092 = 0;
				local220.anInt10138 = 0;
				local21 = anIntArray296[anInt5278 + 2];
				if (local21 < 0) {
					local21 = 0;
				} else if (local21 > 4) {
					local21 = 4;
				}
				local27 = anIntArray296[anInt5278 + 3];
				if (local27 < 0) {
					local27 = 0;
				} else if (local27 > 4) {
					local27 = 4;
				}
				local220.aByte144 = (byte) local21;
				local220.aByte146 = (byte) local27;
				Static168.method3312(local220);
				Static203.method7612(local220);
				if (local220.anInt10156 == 0) {
					Static518.method7497(false, local220);
				}
				return;
			}
			if (arg0 == 1003) {
				@Pc(834) boolean local834 = anIntArray296[--anInt5278] == 1;
				if (local220.aBoolean749 != local834) {
					local220.aBoolean749 = local834;
					Static168.method3312(local220);
				}
				if (local220.anInt10112 == -1) {
					Static533.method7642(local220.anInt10089);
				}
				return;
			}
			if (arg0 == 1004) {
				anInt5278 -= 2;
				local220.anInt10093 = anIntArray296[anInt5278];
				local220.anInt10115 = anIntArray296[anInt5278 + 1];
				Static168.method3312(local220);
				Static203.method7612(local220);
				if (local220.anInt10156 == 0) {
					Static518.method7497(false, local220);
				}
				return;
			}
			if (arg0 == 1005) {
				local220.aBoolean752 = anIntArray296[--anInt5278] == 1;
				return;
			}
		} else {
			@Pc(1791) String local1791;
			@Pc(1394) String local1394;
			if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static69.method899(anIntArray296[--anInt5278]);
				} else {
					local220 = arg1 ? aClass381_5 : aClass381_6;
				}
				if (arg0 == 1100) {
					anInt5278 -= 2;
					local220.anInt10136 = anIntArray296[anInt5278];
					if (local220.anInt10136 > local220.anInt10100 - local220.anInt10159) {
						local220.anInt10136 = local220.anInt10100 - local220.anInt10159;
					}
					if (local220.anInt10136 < 0) {
						local220.anInt10136 = 0;
					}
					local220.anInt10141 = anIntArray296[anInt5278 + 1];
					if (local220.anInt10141 > local220.anInt10142 - local220.anInt10131) {
						local220.anInt10141 = local220.anInt10142 - local220.anInt10131;
					}
					if (local220.anInt10141 < 0) {
						local220.anInt10141 = 0;
					}
					Static168.method3312(local220);
					if (local220.anInt10112 == -1) {
						Static50.method598(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1101) {
					local220.anInt10106 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					if (local220.anInt10112 == -1) {
						Static593.method8227(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1102) {
					local220.aBoolean740 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1103) {
					local220.anInt10078 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1104) {
					local220.anInt10150 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1105) {
					local21 = anIntArray296[--anInt5278];
					if (local220.anInt10126 != local21) {
						local220.anInt10126 = local21;
						Static168.method3312(local220);
					}
					if (local220.anInt10112 == -1) {
						Static579.method8066(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1106) {
					local220.anInt10151 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1107) {
					local220.aBoolean741 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1108) {
					local220.anInt10086 = 1;
					local220.anInt10114 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1109) {
					anInt5278 -= 6;
					local220.anInt10127 = anIntArray296[anInt5278];
					local220.anInt10109 = anIntArray296[anInt5278 + 1];
					local220.anInt10101 = anIntArray296[anInt5278 + 2];
					local220.anInt10144 = anIntArray296[anInt5278 + 3];
					local220.anInt10128 = anIntArray296[anInt5278 + 4];
					local220.anInt10111 = anIntArray296[anInt5278 + 5];
					Static168.method3312(local220);
					if (local220.anInt10112 == -1) {
						Static88.method1288(local220.anInt10089);
						Static23.method261(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1110) {
					local21 = anIntArray296[--anInt5278];
					if (local21 != local220.anInt10158) {
						if (local21 == -1) {
							local220.aClass104_11 = null;
						} else {
							if (local220.aClass104_11 == null) {
								local220.aClass104_11 = new Class104_Sub1();
							}
							local220.aClass104_11.method9035(local21);
						}
						local220.anInt10158 = local21;
						Static168.method3312(local220);
					}
					if (local220.anInt10112 == -1) {
						Static350.method5366(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1111) {
					local220.aBoolean756 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1112) {
					local1394 = aStringArray22[--anInt5283];
					if (!local1394.equals(local220.aString123)) {
						local220.aString123 = local1394;
						Static168.method3312(local220);
					}
					if (local220.anInt10112 == -1) {
						Static120.method2196(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1113) {
					local220.anInt10080 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					if (local220.anInt10112 == -1) {
						Static564.method7959(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1114) {
					anInt5278 -= 3;
					local220.anInt10082 = anIntArray296[anInt5278];
					local220.anInt10073 = anIntArray296[anInt5278 + 1];
					local220.anInt10077 = anIntArray296[anInt5278 + 2];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1115) {
					local220.aBoolean744 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1116) {
					local220.anInt10140 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1117) {
					local220.anInt10090 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1118) {
					local220.aBoolean754 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1119) {
					local220.aBoolean750 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1120) {
					anInt5278 -= 2;
					local220.anInt10100 = anIntArray296[anInt5278];
					local220.anInt10142 = anIntArray296[anInt5278 + 1];
					Static168.method3312(local220);
					if (local220.anInt10156 == 0) {
						Static518.method7497(false, local220);
					}
					return;
				}
				if (arg0 == 1122) {
					local220.aBoolean745 = anIntArray296[--anInt5278] == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1123) {
					local220.anInt10111 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					if (local220.anInt10112 == -1) {
						Static88.method1288(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1124) {
					local21 = anIntArray296[--anInt5278];
					local220.aBoolean753 = local21 == 1;
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1125) {
					anInt5278 -= 2;
					local220.anInt10125 = anIntArray296[anInt5278];
					local220.anInt10132 = anIntArray296[anInt5278 + 1];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1126) {
					local220.anInt10085 = anIntArray296[--anInt5278];
					Static168.method3312(local220);
					return;
				}
				@Pc(1756) Class302 local1756;
				if (arg0 == 1127) {
					anInt5278 -= 2;
					local21 = anIntArray296[anInt5278];
					local27 = anIntArray296[anInt5278 + 1];
					local1756 = Static521.aClass20_21.method250(local21);
					if (local27 != local1756.anInt8386) {
						local220.method8742(local21, local27);
						return;
					}
					local220.method8745(local21);
					return;
				}
				if (arg0 == 1128) {
					local21 = anIntArray296[--anInt5278];
					local1791 = aStringArray22[--anInt5283];
					local1756 = Static521.aClass20_21.method250(local21);
					if (!local1756.aString96.equals(local1791)) {
						local220.method8753(local21, local1791);
						return;
					}
					local220.method8745(local21);
					return;
				}
				if (arg0 == 1129 || arg0 == 1130) {
					local21 = anIntArray296[--anInt5278];
					if ((local220.anInt10156 == 5 || arg0 != 1129) && (local220.anInt10156 == 4 || arg0 != 1130)) {
						if (local220.anInt10121 != local21) {
							local220.anInt10121 = local21;
							Static168.method3312(local220);
						}
						if (local220.anInt10112 == -1) {
							Static214.method3882(local220.anInt10089);
						}
						return;
					}
					return;
				}
				@Pc(1892) short local1892;
				@Pc(1899) short local1899;
				if (arg0 == 1131) {
					anInt5278 -= 3;
					local21 = anIntArray296[anInt5278];
					local1892 = (short) anIntArray296[anInt5278 + 1];
					local1899 = (short) anIntArray296[anInt5278 + 2];
					if (local21 >= 0 && local21 < 5) {
						local220.method8758(local1892, local21, local1899);
						Static168.method3312(local220);
						if (local220.anInt10112 == -1) {
							Static95.method1366(local21, local220.anInt10089);
						}
						return;
					}
					return;
				}
				if (arg0 == 1132) {
					anInt5278 -= 3;
					local21 = anIntArray296[anInt5278];
					local1892 = (short) anIntArray296[anInt5278 + 1];
					local1899 = (short) anIntArray296[anInt5278 + 2];
					if (local21 >= 0 && local21 < 5) {
						local220.method8754(local1899, local21, local1892);
						Static168.method3312(local220);
						if (local220.anInt10112 == -1) {
							Static384.method5927(local21, local220.anInt10089);
						}
						return;
					}
					return;
				}
			} else if ((arg0 < 1200 || arg0 >= 1300) && (arg0 < 2200 || arg0 >= 2300)) {
				@Pc(2872) int local2872;
				if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
					if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
						if (arg0 >= 2000) {
							arg0 -= 1000;
							local220 = Static69.method899(anIntArray296[--anInt5278]);
						} else {
							local220 = arg1 ? aClass381_5 : aClass381_6;
						}
						if (arg0 == 1499) {
							local220.method8759();
							return;
						}
						local1394 = aStringArray22[--anInt5283];
						@Pc(2971) int[] local2971 = null;
						if (local1394.length() > 0 && local1394.charAt(local1394.length() - 1) == 'Y') {
							local506 = anIntArray296[--anInt5278];
							if (local506 > 0) {
								local2971 = new int[local506];
								while (local506-- > 0) {
									local2971[local506] = anIntArray296[--anInt5278];
								}
							}
							local1394 = local1394.substring(0, local1394.length() - 1);
						}
						@Pc(3025) Object[] local3025 = new Object[local1394.length() + 1];
						for (local2872 = local3025.length - 1; local2872 >= 1; local2872--) {
							if (local1394.charAt(local2872 - 1) == 's') {
								local3025[local2872] = aStringArray22[--anInt5283];
							} else if (local1394.charAt(local2872 - 1) == '§') {
								local3025[local2872] = Long.valueOf(aLongArray13[--anInt5279]);
							} else {
								local3025[local2872] = Integer.valueOf(anIntArray296[--anInt5278]);
							}
						}
						local72 = anIntArray296[--anInt5278];
						if (local72 == -1) {
							local3025 = null;
						} else {
							local3025[0] = Integer.valueOf(local72);
						}
						if (arg0 == 1400) {
							local220.anObjectArray7 = local3025;
						} else if (arg0 == 1401) {
							local220.anObjectArray26 = local3025;
						} else if (arg0 == 1402) {
							local220.anObjectArray13 = local3025;
						} else if (arg0 == 1403) {
							local220.anObjectArray33 = local3025;
						} else if (arg0 == 1404) {
							local220.anObjectArray36 = local3025;
						} else if (arg0 == 1405) {
							local220.anObjectArray34 = local3025;
						} else if (arg0 == 1406) {
							local220.anObjectArray9 = local3025;
						} else if (arg0 == 1407) {
							local220.anObjectArray4 = local3025;
							local220.anIntArray663 = local2971;
						} else if (arg0 == 1408) {
							local220.anObjectArray5 = local3025;
						} else if (arg0 == 1409) {
							local220.anObjectArray28 = local3025;
						} else if (arg0 == 1410) {
							local220.anObjectArray16 = local3025;
						} else if (arg0 == 1411) {
							local220.anObjectArray35 = local3025;
						} else if (arg0 == 1412) {
							local220.anObjectArray12 = local3025;
						} else if (arg0 == 1414) {
							local220.anObjectArray21 = local3025;
							local220.anIntArray670 = local2971;
						} else if (arg0 == 1415) {
							local220.anObjectArray19 = local3025;
							local220.anIntArray661 = local2971;
						} else if (arg0 == 1416) {
							local220.anObjectArray29 = local3025;
						} else if (arg0 == 1417) {
							local220.anObjectArray15 = local3025;
						} else if (arg0 == 1418) {
							local220.anObjectArray6 = local3025;
						} else if (arg0 == 1419) {
							local220.anObjectArray22 = local3025;
						} else if (arg0 == 1420) {
							local220.anObjectArray23 = local3025;
						} else if (arg0 == 1421) {
							local220.anObjectArray27 = local3025;
						} else if (arg0 == 1422) {
							local220.anObjectArray31 = local3025;
						} else if (arg0 == 1423) {
							local220.anObjectArray20 = local3025;
						} else if (arg0 == 1424) {
							local220.anObjectArray8 = local3025;
						} else if (arg0 == 1425) {
							local220.anObjectArray30 = local3025;
						} else if (arg0 == 1426) {
							local220.anObjectArray10 = local3025;
						} else if (arg0 == 1427) {
							local220.anObjectArray11 = local3025;
						} else if (arg0 == 1428) {
							local220.anObjectArray18 = local3025;
							local220.anIntArray665 = local2971;
						} else if (arg0 == 1429) {
							local220.anObjectArray32 = local3025;
							local220.anIntArray669 = local2971;
						} else if (arg0 == 1430) {
							local220.anObjectArray17 = local3025;
						} else if (arg0 == 1431) {
							local220.anObjectArray25 = local3025;
						} else if (arg0 == 1432) {
							local220.anObjectArray24 = local3025;
						} else if (arg0 == 1433) {
							local220.lb = local3025;
						}
						local220.aBoolean742 = true;
						return;
					}
					if (arg0 < 1600) {
						local220 = arg1 ? aClass381_5 : aClass381_6;
						if (arg0 == 1500) {
							anIntArray296[anInt5278++] = local220.anInt10155;
							return;
						}
						if (arg0 == 1501) {
							anIntArray296[anInt5278++] = local220.anInt10116;
							return;
						}
						if (arg0 == 1502) {
							anIntArray296[anInt5278++] = local220.anInt10159;
							return;
						}
						if (arg0 == 1503) {
							anIntArray296[anInt5278++] = local220.anInt10131;
							return;
						}
						if (arg0 == 1504) {
							anIntArray296[anInt5278++] = local220.aBoolean749 ? 1 : 0;
							return;
						}
						if (arg0 == 1505) {
							anIntArray296[anInt5278++] = local220.anInt10079;
							return;
						}
						if (arg0 == 1506) {
							local248 = Static266.method4536(local220);
							anIntArray296[anInt5278++] = local248 == null ? -1 : local248.anInt10089;
							return;
						}
						if (arg0 == 1507) {
							anIntArray296[anInt5278++] = local220.anInt10106;
							return;
						}
					} else {
						@Pc(3742) Class302 local3742;
						if (arg0 < 1700) {
							local220 = arg1 ? aClass381_5 : aClass381_6;
							if (arg0 == 1600) {
								anIntArray296[anInt5278++] = local220.anInt10136;
								return;
							}
							if (arg0 == 1601) {
								anIntArray296[anInt5278++] = local220.anInt10141;
								return;
							}
							if (arg0 == 1602) {
								aStringArray22[anInt5283++] = local220.aString123;
								return;
							}
							if (arg0 == 1603) {
								anIntArray296[anInt5278++] = local220.anInt10100;
								return;
							}
							if (arg0 == 1604) {
								anIntArray296[anInt5278++] = local220.anInt10142;
								return;
							}
							if (arg0 == 1605) {
								anIntArray296[anInt5278++] = local220.anInt10111;
								return;
							}
							if (arg0 == 1606) {
								anIntArray296[anInt5278++] = local220.anInt10101;
								return;
							}
							if (arg0 == 1607) {
								anIntArray296[anInt5278++] = local220.anInt10128;
								return;
							}
							if (arg0 == 1608) {
								anIntArray296[anInt5278++] = local220.anInt10144;
								return;
							}
							if (arg0 == 1609) {
								anIntArray296[anInt5278++] = local220.anInt10078;
								return;
							}
							if (arg0 == 1610) {
								anIntArray296[anInt5278++] = local220.anInt10127;
								return;
							}
							if (arg0 == 1611) {
								anIntArray296[anInt5278++] = local220.anInt10109;
								return;
							}
							if (arg0 == 1612) {
								anIntArray296[anInt5278++] = local220.anInt10126;
								return;
							}
							if (arg0 == 1613) {
								local21 = anIntArray296[--anInt5278];
								local3742 = Static521.aClass20_21.method250(local21);
								if (local3742.method7331()) {
									aStringArray22[anInt5283++] = local220.method8749(local21, local3742.aString96);
									return;
								}
								anIntArray296[anInt5278++] = local220.method8755(local3742.anInt8386, local21);
								return;
							}
							if (arg0 == 1614) {
								anIntArray296[anInt5278++] = local220.anInt10151;
								return;
							}
							if (arg0 == 2614) {
								anIntArray296[anInt5278++] = local220.anInt10086 == 1 ? local220.anInt10114 : -1;
								return;
							}
						} else if (arg0 < 1800) {
							local220 = arg1 ? aClass381_5 : aClass381_6;
							if (arg0 == 1700) {
								anIntArray296[anInt5278++] = local220.anInt10149;
								return;
							}
							if (arg0 == 1701) {
								if (local220.anInt10149 != -1) {
									anIntArray296[anInt5278++] = local220.anInt10160;
									return;
								}
								anIntArray296[anInt5278++] = 0;
								return;
							}
							if (arg0 == 1702) {
								anIntArray296[anInt5278++] = local220.anInt10112;
								return;
							}
						} else if (arg0 < 1900) {
							local220 = arg1 ? aClass381_5 : aClass381_6;
							if (arg0 == 1800) {
								anIntArray296[anInt5278++] = Static78.method1061(local220).method5217();
								return;
							}
							if (arg0 == 1801) {
								local21 = anIntArray296[--anInt5278];
								local21--;
								if (local220.aStringArray42 != null && local21 < local220.aStringArray42.length && local220.aStringArray42[local21] != null) {
									aStringArray22[anInt5283++] = local220.aStringArray42[local21];
									return;
								}
								aStringArray22[anInt5283++] = "";
								return;
							}
							if (arg0 == 1802) {
								if (local220.aString121 == null) {
									aStringArray22[anInt5283++] = "";
									return;
								}
								aStringArray22[anInt5283++] = local220.aString121;
								return;
							}
						} else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
							if (arg0 >= 2000) {
								local220 = Static69.method899(anIntArray296[--anInt5278]);
								arg0 -= 1000;
							} else {
								local220 = arg1 ? aClass381_5 : aClass381_6;
							}
							if (anInt5292 >= 10) {
								throw new RuntimeException("C29xx-1");
							}
							if (arg0 == 1927) {
								if (local220.anObjectArray11 == null) {
									return;
								}
								@Pc(4049) Class6_Sub53 local4049 = new Class6_Sub53();
								local4049.aClass381_11 = local220;
								local4049.anObjectArray3 = local220.anObjectArray11;
								local4049.anInt9915 = anInt5292 + 1;
								Static131.aClass340_20.method8131(local4049);
								return;
							}
						} else if (arg0 < 2600) {
							local220 = Static69.method899(anIntArray296[--anInt5278]);
							if (arg0 == 2500) {
								anIntArray296[anInt5278++] = local220.anInt10155;
								return;
							}
							if (arg0 == 2501) {
								anIntArray296[anInt5278++] = local220.anInt10116;
								return;
							}
							if (arg0 == 2502) {
								anIntArray296[anInt5278++] = local220.anInt10159;
								return;
							}
							if (arg0 == 2503) {
								anIntArray296[anInt5278++] = local220.anInt10131;
								return;
							}
							if (arg0 == 2504) {
								anIntArray296[anInt5278++] = local220.aBoolean749 ? 1 : 0;
								return;
							}
							if (arg0 == 2505) {
								anIntArray296[anInt5278++] = local220.anInt10079;
								return;
							}
							if (arg0 == 2506) {
								local248 = Static266.method4536(local220);
								anIntArray296[anInt5278++] = local248 == null ? -1 : local248.anInt10089;
								return;
							}
							if (arg0 == 2507) {
								anIntArray296[anInt5278++] = local220.anInt10106;
								return;
							}
						} else if (arg0 < 2700) {
							local220 = Static69.method899(anIntArray296[--anInt5278]);
							if (arg0 == 2600) {
								anIntArray296[anInt5278++] = local220.anInt10136;
								return;
							}
							if (arg0 == 2601) {
								anIntArray296[anInt5278++] = local220.anInt10141;
								return;
							}
							if (arg0 == 2602) {
								aStringArray22[anInt5283++] = local220.aString123;
								return;
							}
							if (arg0 == 2603) {
								anIntArray296[anInt5278++] = local220.anInt10100;
								return;
							}
							if (arg0 == 2604) {
								anIntArray296[anInt5278++] = local220.anInt10142;
								return;
							}
							if (arg0 == 2605) {
								anIntArray296[anInt5278++] = local220.anInt10111;
								return;
							}
							if (arg0 == 2606) {
								anIntArray296[anInt5278++] = local220.anInt10101;
								return;
							}
							if (arg0 == 2607) {
								anIntArray296[anInt5278++] = local220.anInt10128;
								return;
							}
							if (arg0 == 2608) {
								anIntArray296[anInt5278++] = local220.anInt10144;
								return;
							}
							if (arg0 == 2609) {
								anIntArray296[anInt5278++] = local220.anInt10078;
								return;
							}
							if (arg0 == 2610) {
								anIntArray296[anInt5278++] = local220.anInt10127;
								return;
							}
							if (arg0 == 2611) {
								anIntArray296[anInt5278++] = local220.anInt10109;
								return;
							}
							if (arg0 == 2612) {
								anIntArray296[anInt5278++] = local220.anInt10126;
								return;
							}
							if (arg0 == 2613) {
								anIntArray296[anInt5278++] = local220.anInt10151;
								return;
							}
							if (arg0 == 2614) {
								anIntArray296[anInt5278++] = local220.anInt10086 == 1 ? local220.anInt10114 : -1;
								return;
							}
						} else {
							@Pc(4626) Class6_Sub25 local4626;
							@Pc(4519) Class6_Sub25 local4519;
							if (arg0 < 2800) {
								if (arg0 == 2700) {
									local220 = Static69.method899(anIntArray296[--anInt5278]);
									anIntArray296[anInt5278++] = local220.anInt10149;
									return;
								}
								if (arg0 == 2701) {
									local220 = Static69.method899(anIntArray296[--anInt5278]);
									if (local220.anInt10149 != -1) {
										anIntArray296[anInt5278++] = local220.anInt10160;
										return;
									}
									anIntArray296[anInt5278++] = 0;
									return;
								}
								if (arg0 == 2702) {
									local15 = anIntArray296[--anInt5278];
									local4519 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local15);
									if (local4519 != null) {
										anIntArray296[anInt5278++] = 1;
										return;
									}
									anIntArray296[anInt5278++] = 0;
									return;
								}
								if (arg0 == 2703) {
									local220 = Static69.method899(anIntArray296[--anInt5278]);
									if (local220.aClass381Array1 == null) {
										anIntArray296[anInt5278++] = 0;
										return;
									}
									local21 = local220.aClass381Array1.length;
									for (local27 = 0; local27 < local220.aClass381Array1.length; local27++) {
										if (local220.aClass381Array1[local27] == null) {
											local21 = local27;
											break;
										}
									}
									anIntArray296[anInt5278++] = local21;
									return;
								}
								if (arg0 == 2704 || arg0 == 2705) {
									anInt5278 -= 2;
									local15 = anIntArray296[anInt5278];
									local21 = anIntArray296[anInt5278 + 1];
									local4626 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local15);
									if (local4626 != null && local4626.anInt5007 == local21) {
										anIntArray296[anInt5278++] = 1;
										return;
									}
									anIntArray296[anInt5278++] = 0;
									return;
								}
							} else if (arg0 < 2900) {
								local220 = Static69.method899(anIntArray296[--anInt5278]);
								if (arg0 == 2800) {
									anIntArray296[anInt5278++] = Static78.method1061(local220).method5217();
									return;
								}
								if (arg0 == 2801) {
									local21 = anIntArray296[--anInt5278];
									local21--;
									if (local220.aStringArray42 != null && local21 < local220.aStringArray42.length && local220.aStringArray42[local21] != null) {
										aStringArray22[anInt5283++] = local220.aStringArray42[local21];
										return;
									}
									aStringArray22[anInt5283++] = "";
									return;
								}
								if (arg0 == 2802) {
									if (local220.aString121 == null) {
										aStringArray22[anInt5283++] = "";
										return;
									}
									aStringArray22[anInt5283++] = local220.aString121;
									return;
								}
							} else {
								@Pc(4871) Class6_Sub13 local4871;
								@Pc(4777) String local4777;
								if (arg0 < 3200) {
									if (arg0 == 3100) {
										local4777 = aStringArray22[--anInt5283];
										Static497.method7320(local4777);
										return;
									}
									if (arg0 == 3101) {
										anInt5278 -= 2;
										Static42.method535(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1, anIntArray296[anInt5278 + 1], anIntArray296[anInt5278]);
										return;
									}
									if (arg0 == 3103) {
										Static41.method531();
										return;
									}
									if (arg0 == 3104) {
										local4777 = aStringArray22[--anInt5283];
										local21 = 0;
										if (Static298.method4815(local4777)) {
											local21 = Static543.method7715(local4777);
										}
										@Pc(4840) Class6_Sub13 local4840 = Static30.method353(Static202.aClass241_52, Static525.aClass260_4.aClass270_2);
										local4840.aClass6_Sub15_Sub1_1.method3029(local21);
										Static525.aClass260_4.method6404(local4840);
										return;
									}
									if (arg0 == 3105) {
										local4777 = aStringArray22[--anInt5283];
										local4871 = Static30.method353(Static650.aClass241_119, Static525.aClass260_4.aClass270_2);
										local4871.aClass6_Sub15_Sub1_1.method3016(local4777.length() + 1);
										local4871.aClass6_Sub15_Sub1_1.method2991(local4777);
										Static525.aClass260_4.method6404(local4871);
										return;
									}
									if (arg0 == 3106) {
										local4777 = aStringArray22[--anInt5283];
										local4871 = Static30.method353(Static411.aClass241_91, Static525.aClass260_4.aClass270_2);
										local4871.aClass6_Sub15_Sub1_1.method3016(local4777.length() + 1);
										local4871.aClass6_Sub15_Sub1_1.method2991(local4777);
										Static525.aClass260_4.method6404(local4871);
										return;
									}
									if (arg0 == 3107) {
										local15 = anIntArray296[--anInt5278];
										local1394 = aStringArray22[--anInt5283];
										Static196.method3700(local15, local1394);
										return;
									}
									if (arg0 == 3108) {
										anInt5278 -= 3;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local27 = anIntArray296[anInt5278 + 2];
										local38 = Static69.method899(local27);
										Static437.method6612(local38, local21, local15);
										return;
									}
									if (arg0 == 3109) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local303 = arg1 ? aClass381_5 : aClass381_6;
										Static437.method6612(local303, local21, local15);
										return;
									}
									if (arg0 == 3110) {
										local15 = anIntArray296[--anInt5278];
										local4871 = Static30.method353(Static38.aClass241_12, Static525.aClass260_4.aClass270_2);
										local4871.aClass6_Sub15_Sub1_1.method3040(local15);
										Static525.aClass260_4.method6404(local4871);
										return;
									}
									if (arg0 == 3111) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local4626 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local15);
										if (local4626 != null) {
											Static133.method2562(local4626, local4626.anInt5007 != local21, true);
										}
										Static307.method4890(local15, true, local21, 3);
										return;
									}
									if (arg0 == 3112) {
										anInt5278--;
										local15 = anIntArray296[anInt5278];
										local4519 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local15);
										if (local4519 != null && local4519.anInt5008 == 3) {
											Static133.method2562(local4519, true, true);
										}
										return;
									}
									if (arg0 == 3113) {
										Static447.method6915(aStringArray22[--anInt5283]);
										return;
									}
									if (arg0 == 3114) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local1791 = aStringArray22[--anInt5283];
										Static14.method193("", "", "", local21, local1791, local15);
										return;
									}
									if (arg0 == 3115) {
										anInt5278 -= 11;
										@Pc(5186) Class318[] local5186 = Static70.method932();
										@Pc(5189) Class238[] local5189 = Static632.method8588();
										Static536.method7653(anIntArray296[anInt5278 + 9], anIntArray296[anInt5278 + 5], local5186[anIntArray296[anInt5278]], anIntArray296[anInt5278 + 3], local5189[anIntArray296[anInt5278 + 1]], anIntArray296[anInt5278 + 6], anIntArray296[anInt5278 + 4], anIntArray296[anInt5278 + 7], anIntArray296[anInt5278 + 8], anIntArray296[anInt5278 + 10], anIntArray296[anInt5278 + 2]);
										return;
									}
									if (arg0 == 3116) {
										local15 = anIntArray296[--anInt5278];
										local4871 = Static30.method353(Static678.aClass241_124, Static525.aClass260_4.aClass270_2);
										local4871.aClass6_Sub15_Sub1_1.method3040(local15);
										Static525.aClass260_4.method6404(local4871);
										return;
									}
									if (arg0 == 3117) {
										local4777 = aStringArray22[--anInt5283];
										local4871 = Static30.method353(Static364.aClass241_80, Static525.aClass260_4.aClass270_2);
										local4871.aClass6_Sub15_Sub1_1.method3016(local4777.length() + 1);
										local4871.aClass6_Sub15_Sub1_1.method2991(local4777);
										Static525.aClass260_4.method6404(local4871);
										return;
									}
								} else if (arg0 < 3300) {
									if (arg0 == 3200) {
										anInt5278 -= 3;
										Static241.method4231(256, anIntArray296[anInt5278], 255, anIntArray296[anInt5278 + 2], anIntArray296[anInt5278 + 1]);
										return;
									}
									if (arg0 == 3201) {
										Static229.method4087(255, 50, anIntArray296[--anInt5278]);
										return;
									}
									if (arg0 == 3202) {
										anInt5278 -= 2;
										Static67.method811(255, anIntArray296[anInt5278], anIntArray296[anInt5278 + 1]);
										return;
									}
									if (arg0 == 3203) {
										anInt5278 -= 4;
										Static241.method4231(256, anIntArray296[anInt5278], anIntArray296[anInt5278 + 3], anIntArray296[anInt5278 + 2], anIntArray296[anInt5278 + 1]);
										return;
									}
									if (arg0 == 3204) {
										anInt5278 -= 3;
										Static229.method4087(anIntArray296[anInt5278 + 1], anIntArray296[anInt5278 + 2], anIntArray296[anInt5278]);
										return;
									}
									if (arg0 == 3205) {
										anInt5278 -= 3;
										Static67.method811(anIntArray296[anInt5278 + 2], anIntArray296[anInt5278], anIntArray296[anInt5278 + 1]);
										return;
									}
									if (arg0 == 3206) {
										anInt5278 -= 4;
										Static503.method7340(anIntArray296[anInt5278 + 2], false, anIntArray296[anInt5278], anIntArray296[anInt5278 + 1], 256, anIntArray296[anInt5278 + 3]);
										return;
									}
									if (arg0 == 3207) {
										anInt5278 -= 4;
										Static503.method7340(anIntArray296[anInt5278 + 2], true, anIntArray296[anInt5278], anIntArray296[anInt5278 + 1], 256, anIntArray296[anInt5278 + 3]);
										return;
									}
									if (arg0 == 3208) {
										anInt5278 -= 5;
										Static241.method4231(anIntArray296[anInt5278 + 4], anIntArray296[anInt5278], anIntArray296[anInt5278 + 3], anIntArray296[anInt5278 + 2], anIntArray296[anInt5278 + 1]);
										return;
									}
									if (arg0 == 3209) {
										anInt5278 -= 5;
										Static503.method7340(anIntArray296[anInt5278 + 2], false, anIntArray296[anInt5278], anIntArray296[anInt5278 + 1], anIntArray296[anInt5278 + 4], anIntArray296[anInt5278 + 3]);
										return;
									}
								} else if (arg0 < 3400) {
									if (arg0 == 3300) {
										anIntArray296[anInt5278++] = Static141.anInt8737;
										return;
									}
									if (arg0 == 3301) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static542.method7708(local15, false, local21);
										return;
									}
									if (arg0 == 3302) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static309.method4914(local15, false, local21);
										return;
									}
									if (arg0 == 3303) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static588.method8177(local15, local21, false);
										return;
									}
									if (arg0 == 3304) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static544.aClass233_1.method5597(local15).anInt8005;
										return;
									}
									if (arg0 == 3305) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static476.anIntArray507[local15];
										return;
									}
									if (arg0 == 3306) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static232.anIntArray229[local15];
										return;
									}
									if (arg0 == 3307) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static147.anIntArray167[local15];
										return;
									}
									if (arg0 == 3308) {
										@Pc(5795) byte local5795 = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135;
										local21 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9) + Static50.anInt606;
										local27 = (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9) + Static404.anInt7039;
										anIntArray296[anInt5278++] = (local5795 << 28) + (local21 << 14) + local27;
										return;
									}
									if (arg0 == 3309) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = local15 >> 14 & 0x3FFF;
										return;
									}
									if (arg0 == 3310) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = local15 >> 28;
										return;
									}
									if (arg0 == 3311) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = local15 & 0x3FFF;
										return;
									}
									if (arg0 == 3312) {
										anIntArray296[anInt5278++] = Static340.aBoolean430 ? 1 : 0;
										return;
									}
									if (arg0 == 3313) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static542.method7708(local15, true, local21);
										return;
									}
									if (arg0 == 3314) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static309.method4914(local15, true, local21);
										return;
									}
									if (arg0 == 3315) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static588.method8177(local15, local21, true);
										return;
									}
									if (arg0 == 3316) {
										if (Static679.anInt6104 >= 2) {
											anIntArray296[anInt5278++] = Static679.anInt6104;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3317) {
										anIntArray296[anInt5278++] = Static594.anInt9443;
										return;
									}
									if (arg0 == 3318) {
										anIntArray296[anInt5278++] = Static82.aClass165_2.anInt4607;
										return;
									}
									if (arg0 == 3321) {
										anIntArray296[anInt5278++] = Static673.anInt10330;
										return;
									}
									if (arg0 == 3322) {
										anIntArray296[anInt5278++] = Static623.anInt9828;
										return;
									}
									if (arg0 == 3323) {
										if (Static614.anInt9721 >= 5 && Static614.anInt9721 <= 9) {
											anIntArray296[anInt5278++] = 1;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3324) {
										if (Static614.anInt9721 >= 5 && Static614.anInt9721 <= 9) {
											anIntArray296[anInt5278++] = Static614.anInt9721;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3325) {
										anIntArray296[anInt5278++] = Static200.aBoolean328 ? 1 : 0;
										return;
									}
									if (arg0 == 3326) {
										anIntArray296[anInt5278++] = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt2869;
										return;
									}
									if (arg0 == 3327) {
										anIntArray296[anInt5278++] = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 != null && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.aBoolean114 ? 1 : 0;
										return;
									}
									if (arg0 == 3329) {
										anIntArray296[anInt5278++] = Static610.aBoolean714 ? 1 : 0;
										return;
									}
									if (arg0 == 3330) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static133.method2561(local15);
										return;
									}
									if (arg0 == 3331) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static537.method7677(local21, local15, false);
										return;
									}
									if (arg0 == 3332) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										anIntArray296[anInt5278++] = Static537.method7677(local21, local15, true);
										return;
									}
									if (arg0 == 3333) {
										anIntArray296[anInt5278++] = Static380.method5891();
										return;
									}
									if (arg0 == 3335) {
										anIntArray296[anInt5278++] = Static601.anInt9518;
										return;
									}
									if (arg0 == 3336) {
										anInt5278 -= 4;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local27 = anIntArray296[anInt5278 + 2];
										local506 = anIntArray296[anInt5278 + 3];
										local15 += local21 << 14;
										local15 += local27 << 28;
										local15 += local506;
										anIntArray296[anInt5278++] = local15;
										return;
									}
									if (arg0 == 3337) {
										anIntArray296[anInt5278++] = Static99.anInt1987;
										return;
									}
									if (arg0 == 3338) {
										anIntArray296[anInt5278++] = Static508.method3113(9714);
										return;
									}
									if (arg0 == 3339) {
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3340) {
										anIntArray296[anInt5278++] = Static285.aBoolean390 ? 1 : 0;
										return;
									}
									if (arg0 == 3341) {
										anIntArray296[anInt5278++] = Static470.aBoolean604 ? 1 : 0;
										return;
									}
									if (arg0 == 3342) {
										anIntArray296[anInt5278++] = Static331.aClass42_8.method6019();
										return;
									}
									if (arg0 == 3343) {
										anIntArray296[anInt5278++] = Static331.aClass42_8.method6014();
										return;
									}
									if (arg0 == 3344) {
										aStringArray22[anInt5283++] = Static112.method2110();
										return;
									}
									if (arg0 == 3345) {
										aStringArray22[anInt5283++] = Static366.method5546();
										return;
									}
									if (arg0 == 3346) {
										anIntArray296[anInt5278++] = Static667.method8847();
										return;
									}
									if (arg0 == 3347) {
										anIntArray296[anInt5278++] = Static527.anInt8630;
										return;
									}
									if (arg0 == 3349) {
										anIntArray296[anInt5278++] = Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass258_7.method6285(16383) >> 3;
										return;
									}
								} else if (arg0 < 3500) {
									@Pc(6599) Class311 local6599;
									if (arg0 == 3400) {
										anInt5278 -= 2;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local6599 = Static146.aClass32_1.method445(local15);
										aStringArray22[anInt5283++] = local6599.method7471(local21);
										return;
									}
									if (arg0 == 3408) {
										anInt5278 -= 4;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local27 = anIntArray296[anInt5278 + 2];
										local506 = anIntArray296[anInt5278 + 3];
										@Pc(6645) Class311 local6645 = Static146.aClass32_1.method445(local27);
										if (local6645.aChar4 == local15 && local6645.aChar5 == local21) {
											if (local21 == 115) {
												aStringArray22[anInt5283++] = local6645.method7471(local506);
												return;
											}
											anIntArray296[anInt5278++] = local6645.method7464(local506);
											return;
										}
										throw new RuntimeException("C3408-1 " + local27 + "-" + local506);
									}
									if (arg0 == 3409) {
										anInt5278 -= 3;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local27 = anIntArray296[anInt5278 + 2];
										if (local21 == -1) {
											throw new RuntimeException("C3409-2");
										}
										@Pc(6740) Class311 local6740 = Static146.aClass32_1.method445(local21);
										if (local6740.aChar5 != local15) {
											throw new RuntimeException("C3409-1");
										}
										anIntArray296[anInt5278++] = local6740.method7466(local27) ? 1 : 0;
										return;
									}
									if (arg0 == 3410) {
										local15 = anIntArray296[--anInt5278];
										local1394 = aStringArray22[--anInt5283];
										if (local15 == -1) {
											throw new RuntimeException("C3410-2");
										}
										local6599 = Static146.aClass32_1.method445(local15);
										if (local6599.aChar5 != 's') {
											throw new RuntimeException("C3410-1");
										}
										anIntArray296[anInt5278++] = local6599.method7461(local1394) ? 1 : 0;
										return;
									}
									if (arg0 == 3411) {
										local15 = anIntArray296[--anInt5278];
										@Pc(6849) Class311 local6849 = Static146.aClass32_1.method445(local15);
										anIntArray296[anInt5278++] = local6849.method7462();
										return;
									}
								} else if (arg0 < 3700) {
									if (arg0 == 3600) {
										if (Static191.anInt3933 == 0) {
											anIntArray296[anInt5278++] = -2;
											return;
										}
										if (Static191.anInt3933 == 1) {
											anIntArray296[anInt5278++] = -1;
											return;
										}
										anIntArray296[anInt5278++] = Static265.anInt5023;
										return;
									}
									if (arg0 == 3601) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 == 2 && local15 < Static265.anInt5023) {
											aStringArray22[anInt5283++] = Static35.aStringArray5[local15];
											if (Static665.aStringArray45[local15] != null) {
												aStringArray22[anInt5283++] = Static665.aStringArray45[local15];
												return;
											}
											aStringArray22[anInt5283++] = "";
											return;
										}
										aStringArray22[anInt5283++] = "";
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3602) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 == 2 && local15 < Static265.anInt5023) {
											anIntArray296[anInt5278++] = Static241.anIntArray241[local15];
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3603) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 == 2 && local15 < Static265.anInt5023) {
											anIntArray296[anInt5278++] = Static609.anIntArray626[local15];
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3604) {
										local4777 = aStringArray22[--anInt5283];
										local21 = anIntArray296[--anInt5278];
										Static607.method8348(local21, local4777);
										return;
									}
									if (arg0 == 3605) {
										local4777 = aStringArray22[--anInt5283];
										Static4.method29(local4777);
										return;
									}
									if (arg0 == 3606) {
										local4777 = aStringArray22[--anInt5283];
										Static95.method1365(local4777);
										return;
									}
									if (arg0 == 3607) {
										local4777 = aStringArray22[--anInt5283];
										Static161.method3202(false, local4777);
										return;
									}
									if (arg0 == 3608) {
										local4777 = aStringArray22[--anInt5283];
										Static663.method9048(local4777);
										return;
									}
									if (arg0 == 3609) {
										local4777 = aStringArray22[--anInt5283];
										if (local4777.startsWith("<img=0>") || local4777.startsWith("<img=1>")) {
											local4777 = local4777.substring(7);
										}
										anIntArray296[anInt5278++] = Static346.method5316(local4777) ? 1 : 0;
										return;
									}
									if (arg0 == 3610) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 == 2 && local15 < Static265.anInt5023) {
											aStringArray22[anInt5283++] = Static626.aStringArray41[local15];
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3611) {
										if (Static175.aString39 != null) {
											aStringArray22[anInt5283++] = Static295.method4796(Static175.aString39);
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3612) {
										if (Static175.aString39 != null) {
											anIntArray296[anInt5278++] = Static188.anInt3786;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3613) {
										local15 = anIntArray296[--anInt5278];
										if (Static175.aString39 != null && local15 < Static188.anInt3786) {
											aStringArray22[anInt5283++] = Static29.aClass231Array1[local15].aString71;
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3614) {
										local15 = anIntArray296[--anInt5278];
										if (Static175.aString39 != null && local15 < Static188.anInt3786) {
											anIntArray296[anInt5278++] = Static29.aClass231Array1[local15].anInt6148;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3615) {
										local15 = anIntArray296[--anInt5278];
										if (Static175.aString39 != null && local15 < Static188.anInt3786) {
											anIntArray296[anInt5278++] = Static29.aClass231Array1[local15].aByte94;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3616) {
										anIntArray296[anInt5278++] = Static13.aByte2;
										return;
									}
									if (arg0 == 3617) {
										local4777 = aStringArray22[--anInt5283];
										Static554.method7869(local4777);
										return;
									}
									if (arg0 == 3618) {
										anIntArray296[anInt5278++] = Static522.aByte128;
										return;
									}
									if (arg0 == 3619) {
										local4777 = aStringArray22[--anInt5283];
										Static427.method6511(local4777);
										return;
									}
									if (arg0 == 3620) {
										Static161.method3200();
										return;
									}
									if (arg0 == 3621) {
										if (Static191.anInt3933 == 0) {
											anIntArray296[anInt5278++] = -1;
											return;
										}
										anIntArray296[anInt5278++] = Static287.anInt5151;
										return;
									}
									if (arg0 == 3622) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 != 0 && local15 < Static287.anInt5151) {
											aStringArray22[anInt5283++] = Static73.aStringArray11[local15];
											if (Static433.aStringArray31[local15] != null) {
												aStringArray22[anInt5283++] = Static433.aStringArray31[local15];
												return;
											}
											aStringArray22[anInt5283++] = "";
											return;
										}
										aStringArray22[anInt5283++] = "";
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3623) {
										local4777 = aStringArray22[--anInt5283];
										if (local4777.startsWith("<img=0>") || local4777.startsWith("<img=1>")) {
											local4777 = local4777.substring(7);
										}
										anIntArray296[anInt5278++] = Static446.method6903(local4777) ? 1 : 0;
										return;
									}
									if (arg0 == 3624) {
										local15 = anIntArray296[--anInt5278];
										if (Static29.aClass231Array1 != null && local15 < Static188.anInt3786 && Static29.aClass231Array1[local15].aString72.equalsIgnoreCase(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aString23)) {
											anIntArray296[anInt5278++] = 1;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3625) {
										if (Static108.aString18 != null) {
											aStringArray22[anInt5283++] = Static108.aString18;
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3626) {
										local15 = anIntArray296[--anInt5278];
										if (Static175.aString39 != null && local15 < Static188.anInt3786) {
											aStringArray22[anInt5283++] = Static29.aClass231Array1[local15].aString73;
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3627) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 == 2 && local15 >= 0 && local15 < Static265.anInt5023) {
											anIntArray296[anInt5278++] = Static665.aBooleanArray31[local15] ? 1 : 0;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3628) {
										local4777 = aStringArray22[--anInt5283];
										if (local4777.startsWith("<img=0>") || local4777.startsWith("<img=1>")) {
											local4777 = local4777.substring(7);
										}
										anIntArray296[anInt5278++] = Static541.method8070(local4777);
										return;
									}
									if (arg0 == 3629) {
										anIntArray296[anInt5278++] = Static604.anInt9535;
										return;
									}
									if (arg0 == 3630) {
										local4777 = aStringArray22[--anInt5283];
										Static161.method3202(true, local4777);
										return;
									}
									if (arg0 == 3631) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static510.aBooleanArray29[local15] ? 1 : 0;
										return;
									}
									if (arg0 == 3632) {
										local15 = anIntArray296[--anInt5278];
										if (Static175.aString39 != null && local15 < Static188.anInt3786) {
											aStringArray22[anInt5283++] = Static29.aClass231Array1[local15].aString72;
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
									if (arg0 == 3633) {
										local15 = anIntArray296[--anInt5278];
										if (Static191.anInt3933 != 0 && local15 < Static287.anInt5151) {
											aStringArray22[anInt5283++] = Static591.aStringArray36[local15];
											return;
										}
										aStringArray22[anInt5283++] = "";
										return;
									}
								} else if (arg0 < 3800) {
									if (arg0 == 3700) {
										if (Static579.aClass391_3 != null) {
											anIntArray296[anInt5278++] = 1;
											aClass391_1 = Static579.aClass391_3;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3701) {
										if (Static531.aClass391_2 != null) {
											anIntArray296[anInt5278++] = 1;
											aClass391_1 = Static531.aClass391_2;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3702) {
										aStringArray22[anInt5283++] = aClass391_1.aString129;
										return;
									}
									if (arg0 == 3703) {
										anIntArray296[anInt5278++] = aClass391_1.aBoolean762 ? 1 : 0;
										return;
									}
									if (arg0 == 3704) {
										anIntArray296[anInt5278++] = aClass391_1.aByte148;
										return;
									}
									if (arg0 == 3705) {
										anIntArray296[anInt5278++] = aClass391_1.aByte147;
										return;
									}
									if (arg0 == 3706) {
										anIntArray296[anInt5278++] = aClass391_1.aByte149;
										return;
									}
									if (arg0 == 3707) {
										anIntArray296[anInt5278++] = aClass391_1.aByte150;
										return;
									}
									if (arg0 == 3709) {
										anIntArray296[anInt5278++] = aClass391_1.anInt10309;
										return;
									}
									if (arg0 == 3710) {
										local15 = anIntArray296[--anInt5278];
										aStringArray22[anInt5283++] = aClass391_1.aStringArray47[local15];
										return;
									}
									if (arg0 == 3711) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = aClass391_1.aByteArray110[local15];
										return;
									}
									if (arg0 == 3712) {
										anIntArray296[anInt5278++] = aClass391_1.anInt10321;
										return;
									}
									if (arg0 == 3713) {
										local15 = anIntArray296[--anInt5278];
										aStringArray22[anInt5283++] = aClass391_1.aStringArray46[local15];
										return;
									}
									if (arg0 == 3714) {
										anInt5278 -= 3;
										local15 = anIntArray296[anInt5278];
										local21 = anIntArray296[anInt5278 + 1];
										local27 = anIntArray296[anInt5278 + 2];
										anIntArray296[anInt5278++] = aClass391_1.method8894(local27, local21, local15);
										return;
									}
									if (arg0 == 3715) {
										anIntArray296[anInt5278++] = aClass391_1.anInt10323;
										return;
									}
									if (arg0 == 3716) {
										anIntArray296[anInt5278++] = aClass391_1.anInt10320;
										return;
									}
									if (arg0 == 3717) {
										anIntArray296[anInt5278++] = aClass391_1.method8883(aStringArray22[--anInt5283]);
										return;
									}
									if (arg0 == 3718) {
										anIntArray296[anInt5278 - 1] = aClass391_1.method8887()[anIntArray296[anInt5278 - 1]];
										return;
									}
									if (arg0 == 3719) {
										Static42.method533(anIntArray296[--anInt5278]);
										return;
									}
									if (arg0 == 3720) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = aClass391_1.anIntArray688[local15];
										return;
									}
									if (arg0 == 3750) {
										if (Static99.aClass6_Sub29_1 != null) {
											anIntArray296[anInt5278++] = 1;
											aClass6_Sub29_2 = Static99.aClass6_Sub29_1;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3751) {
										if (Static488.aClass6_Sub29_3 != null) {
											anIntArray296[anInt5278++] = 1;
											aClass6_Sub29_2 = Static488.aClass6_Sub29_3;
											return;
										}
										anIntArray296[anInt5278++] = 0;
										return;
									}
									if (arg0 == 3752) {
										aStringArray22[anInt5283++] = aClass6_Sub29_2.aString61;
										return;
									}
									if (arg0 == 3753) {
										anIntArray296[anInt5278++] = aClass6_Sub29_2.aByte81;
										return;
									}
									if (arg0 == 3754) {
										anIntArray296[anInt5278++] = aClass6_Sub29_2.aByte82;
										return;
									}
									if (arg0 == 3755) {
										anIntArray296[anInt5278++] = aClass6_Sub29_2.anInt5466;
										return;
									}
									if (arg0 == 3756) {
										local15 = anIntArray296[--anInt5278];
										aStringArray22[anInt5283++] = aClass6_Sub29_2.aClass200Array1[local15].aString58;
										return;
									}
									if (arg0 == 3757) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = aClass6_Sub29_2.aClass200Array1[local15].aByte80;
										return;
									}
									if (arg0 == 3758) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = aClass6_Sub29_2.aClass200Array1[local15].anInt5266;
										return;
									}
									if (arg0 == 3759) {
										local15 = anIntArray296[--anInt5278];
										Static643.method3509(aClass6_Sub29_2 == Static488.aClass6_Sub29_3, local15);
										return;
									}
									if (arg0 == 3760) {
										anIntArray296[anInt5278++] = aClass6_Sub29_2.method4979(aStringArray22[--anInt5283]);
										return;
									}
									if (arg0 == 3761) {
										anIntArray296[anInt5278 - 1] = aClass6_Sub29_2.method4984()[anIntArray296[anInt5278 - 1]];
										return;
									}
									if (arg0 == 3790) {
										anIntArray296[anInt5278++] = Static64.anObjectArray1 == null ? 0 : 1;
										return;
									}
								} else if (arg0 < 4000) {
									if (arg0 == 3903) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static30.aClass272Array1[local15].method6602();
										return;
									}
									if (arg0 == 3904) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static30.aClass272Array1[local15].anInt7419;
										return;
									}
									if (arg0 == 3905) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static30.aClass272Array1[local15].anInt7426;
										return;
									}
									if (arg0 == 3906) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static30.aClass272Array1[local15].anInt7425;
										return;
									}
									if (arg0 == 3907) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static30.aClass272Array1[local15].anInt7420;
										return;
									}
									if (arg0 == 3908) {
										local15 = anIntArray296[--anInt5278];
										anIntArray296[anInt5278++] = Static30.aClass272Array1[local15].anInt7424;
										return;
									}
									if (arg0 == 3910) {
										local15 = anIntArray296[--anInt5278];
										local21 = Static30.aClass272Array1[local15].method6600();
										anIntArray296[anInt5278++] = local21 == 0 ? 1 : 0;
										return;
									}
									if (arg0 == 3911) {
										local15 = anIntArray296[--anInt5278];
										local21 = Static30.aClass272Array1[local15].method6600();
										anIntArray296[anInt5278++] = local21 == 2 ? 1 : 0;
										return;
									}
									if (arg0 == 3912) {
										local15 = anIntArray296[--anInt5278];
										local21 = Static30.aClass272Array1[local15].method6600();
										anIntArray296[anInt5278++] = local21 == 5 ? 1 : 0;
										return;
									}
									if (arg0 == 3913) {
										local15 = anIntArray296[--anInt5278];
										local21 = Static30.aClass272Array1[local15].method6600();
										anIntArray296[anInt5278++] = local21 == 1 ? 1 : 0;
										return;
									}
								} else {
									@Pc(9108) long local9108;
									if (arg0 < 4100) {
										if (arg0 == 4000) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 + local21;
											return;
										}
										if (arg0 == 4001) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 - local21;
											return;
										}
										if (arg0 == 4002) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 * local21;
											return;
										}
										if (arg0 == 4003) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 / local21;
											return;
										}
										if (arg0 == 4004) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = (int) (Math.random() * (double) local15);
											return;
										}
										if (arg0 == 4005) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = (int) (Math.random() * (double) (local15 + 1));
											return;
										}
										if (arg0 == 4006) {
											anInt5278 -= 5;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local27 = anIntArray296[anInt5278 + 2];
											local506 = anIntArray296[anInt5278 + 3];
											local2872 = anIntArray296[anInt5278 + 4];
											anIntArray296[anInt5278++] = local15 + (local21 - local15) * (local2872 - local27) / (local506 - local27);
											return;
										}
										@Pc(9115) long local9115;
										if (arg0 == 4007) {
											anInt5278 -= 2;
											local9108 = (long) anIntArray296[anInt5278];
											local9115 = (long) anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = (int) (local9108 + local9108 * local9115 / 100L);
											return;
										}
										if (arg0 == 4008) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 | 0x1 << local21;
											return;
										}
										if (arg0 == 4009) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 & -(0x1 << local21) - 1;
											return;
										}
										if (arg0 == 4010) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = (local15 & 0x1 << local21) == 0 ? 0 : 1;
											return;
										}
										if (arg0 == 4011) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 % local21;
											return;
										}
										if (arg0 == 4012) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											if (local15 == 0) {
												anIntArray296[anInt5278++] = 0;
												return;
											}
											anIntArray296[anInt5278++] = (int) Math.pow((double) local15, (double) local21);
											return;
										}
										if (arg0 == 4013) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											if (local15 == 0) {
												anIntArray296[anInt5278++] = 0;
												return;
											}
											if (local21 == 0) {
												anIntArray296[anInt5278++] = Integer.MAX_VALUE;
												return;
											}
											anIntArray296[anInt5278++] = (int) Math.pow((double) local15, 1.0D / (double) local21);
											return;
										}
										if (arg0 == 4014) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 & local21;
											return;
										}
										if (arg0 == 4015) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 | local21;
											return;
										}
										if (arg0 == 4016) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 < local21 ? local15 : local21;
											return;
										}
										if (arg0 == 4017) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local15 > local21 ? local15 : local21;
											return;
										}
										if (arg0 == 4018) {
											anInt5278 -= 3;
											local9108 = (long) anIntArray296[anInt5278];
											local9115 = (long) anIntArray296[anInt5278 + 1];
											@Pc(9502) long local9502 = (long) anIntArray296[anInt5278 + 2];
											anIntArray296[anInt5278++] = (int) (local9108 * local9502 / local9115);
											return;
										}
										if (arg0 == 4019) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											if (local15 > 700 || local21 > 700) {
												anIntArray296[anInt5278++] = 256;
											}
											@Pc(9565) double local9565 = (Math.random() * (double) (local21 + local15) + 800.0D - (double) local15) / 100.0D;
											anIntArray296[anInt5278++] = (int) (Math.pow(2.0D, local9565) + 0.5D);
											return;
										}
										if (arg0 == 4020) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static123.anIntArray129[Static70.method928(local15) & 0xFFFF];
											return;
										}
									} else if (arg0 < 4200) {
										if (arg0 == 4100) {
											local4777 = aStringArray22[--anInt5283];
											local21 = anIntArray296[--anInt5278];
											aStringArray22[anInt5283++] = local4777 + local21;
											return;
										}
										if (arg0 == 4101) {
											anInt5283 -= 2;
											local4777 = aStringArray22[anInt5283];
											local1394 = aStringArray22[anInt5283 + 1];
											aStringArray22[anInt5283++] = local4777 + local1394;
											return;
										}
										if (arg0 == 4102) {
											local4777 = aStringArray22[--anInt5283];
											local21 = anIntArray296[--anInt5278];
											aStringArray22[anInt5283++] = local4777 + Static240.method4225(true, local21);
											return;
										}
										if (arg0 == 4103) {
											local4777 = aStringArray22[--anInt5283];
											aStringArray22[anInt5283++] = local4777.toLowerCase();
											return;
										}
										if (arg0 == 4104) {
											aStringArray22[anInt5283++] = Static353.method5411(Static601.anInt9518, Static313.method4965(anIntArray296[--anInt5278]));
											return;
										}
										if (arg0 == 4105) {
											anInt5283 -= 2;
											local4777 = aStringArray22[anInt5283];
											local1394 = aStringArray22[anInt5283 + 1];
											if (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1 != null && Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aClass73_1.aBoolean114) {
												aStringArray22[anInt5283++] = local1394;
												return;
											}
											aStringArray22[anInt5283++] = local4777;
											return;
										}
										if (arg0 == 4106) {
											local15 = anIntArray296[--anInt5278];
											aStringArray22[anInt5283++] = Integer.toString(local15);
											return;
										}
										if (arg0 == 4107) {
											anInt5283 -= 2;
											anIntArray296[anInt5278++] = Static114.method2147(Static601.anInt9518, aStringArray22[anInt5283], aStringArray22[anInt5283 + 1]);
											return;
										}
										@Pc(9885) Class53 local9885;
										if (arg0 == 4108) {
											local4777 = aStringArray22[--anInt5283];
											anInt5278 -= 2;
											local21 = anIntArray296[anInt5278];
											local27 = anIntArray296[anInt5278 + 1];
											local9885 = Static629.method8576(local27, Static373.aClass223_79);
											anIntArray296[anInt5278++] = local9885.method823(local21, Static626.aClass49Array16, local4777);
											return;
										}
										if (arg0 == 4109) {
											local4777 = aStringArray22[--anInt5283];
											anInt5278 -= 2;
											local21 = anIntArray296[anInt5278];
											local27 = anIntArray296[anInt5278 + 1];
											local9885 = Static629.method8576(local27, Static373.aClass223_79);
											anIntArray296[anInt5278++] = local9885.method814(local21, local4777, Static626.aClass49Array16);
											return;
										}
										if (arg0 == 4110) {
											anInt5283 -= 2;
											local4777 = aStringArray22[anInt5283];
											local1394 = aStringArray22[anInt5283 + 1];
											if (anIntArray296[--anInt5278] == 1) {
												aStringArray22[anInt5283++] = local4777;
												return;
											}
											aStringArray22[anInt5283++] = local1394;
											return;
										}
										if (arg0 == 4111) {
											local4777 = aStringArray22[--anInt5283];
											aStringArray22[anInt5283++] = Static491.method7288(local4777, (byte) -111);
											return;
										}
										if (arg0 == 4112) {
											local4777 = aStringArray22[--anInt5283];
											local21 = anIntArray296[--anInt5278];
											if (local21 == -1) {
												throw new RuntimeException("null char");
											}
											aStringArray22[anInt5283++] = local4777 + (char) local21;
											return;
										}
										if (arg0 == 4113) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = method4838((char) local15);
											return;
										}
										if (arg0 == 4114) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static158.method3118((char) local15) ? 1 : 0;
											return;
										}
										if (arg0 == 4115) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static321.method5033((char) local15) ? 1 : 0;
											return;
										}
										if (arg0 == 4116) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static184.method3464((char) local15) ? 1 : 0;
											return;
										}
										if (arg0 == 4117) {
											local4777 = aStringArray22[--anInt5283];
											if (local4777 != null) {
												anIntArray296[anInt5278++] = local4777.length();
												return;
											}
											anIntArray296[anInt5278++] = 0;
											return;
										}
										if (arg0 == 4118) {
											local4777 = aStringArray22[--anInt5283];
											anInt5278 -= 2;
											local21 = anIntArray296[anInt5278];
											local27 = anIntArray296[anInt5278 + 1];
											aStringArray22[anInt5283++] = local4777.substring(local21, local27);
											return;
										}
										if (arg0 == 4119) {
											local4777 = aStringArray22[--anInt5283];
											@Pc(10251) StringBuffer local10251 = new StringBuffer(local4777.length());
											@Pc(10253) boolean local10253 = false;
											for (local506 = 0; local506 < local4777.length(); local506++) {
												@Pc(10260) char local10260 = local4777.charAt(local506);
												if (local10260 == '<') {
													local10253 = true;
												} else if (local10260 == '>') {
													local10253 = false;
												} else if (!local10253) {
													local10251.append(local10260);
												}
											}
											aStringArray22[anInt5283++] = local10251.toString();
											return;
										}
										if (arg0 == 4120) {
											local4777 = aStringArray22[--anInt5283];
											anInt5278 -= 2;
											local21 = anIntArray296[anInt5278];
											local27 = anIntArray296[anInt5278 + 1];
											anIntArray296[anInt5278++] = local4777.indexOf(local21, local27);
											return;
										}
										if (arg0 == 4121) {
											anInt5283 -= 2;
											local4777 = aStringArray22[anInt5283];
											local1394 = aStringArray22[anInt5283 + 1];
											local27 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = local4777.indexOf(local1394, local27);
											return;
										}
										if (arg0 == 4122) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Character.toLowerCase((char) local15);
											return;
										}
										if (arg0 == 4123) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Character.toUpperCase((char) local15);
											return;
										}
										if (arg0 == 4124) {
											local575 = anIntArray296[--anInt5278] != 0;
											local21 = anIntArray296[--anInt5278];
											aStringArray22[anInt5283++] = Static562.method7943(local575, (long) local21, Static601.anInt9518, 0);
											return;
										}
										if (arg0 == 4125) {
											local4777 = aStringArray22[--anInt5283];
											local21 = anIntArray296[--anInt5278];
											@Pc(10480) Class53 local10480 = Static629.method8576(local21, Static373.aClass223_79);
											anIntArray296[anInt5278++] = local10480.method822(Static626.aClass49Array16, local4777);
											return;
										}
										if (arg0 == 4126) {
											aStringArray22[anInt5283++] = Static70.method925((long) anIntArray296[--anInt5278] * 60000L, Static601.anInt9518) + " UTC";
											return;
										}
										if (arg0 == 4127) {
											local9108 = aLongArray13[--anInt5279];
											aStringArray22[anInt5283++] = local9108 == -1L ? "" : Long.toString(local9108, 36).toUpperCase();
											return;
										}
									} else if (arg0 < 4300) {
										if (arg0 == 4200) {
											local15 = anIntArray296[--anInt5278];
											aStringArray22[anInt5283++] = Static149.aClass244_1.method5958(local15).aString87;
											return;
										}
										@Pc(10609) Class282 local10609;
										if (arg0 == 4201) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local10609 = Static149.aClass244_1.method5958(local15);
											if (local21 >= 1 && local21 <= 5 && local10609.aStringArray33[local21 - 1] != null) {
												aStringArray22[anInt5283++] = local10609.aStringArray33[local21 - 1];
												return;
											}
											aStringArray22[anInt5283++] = "";
											return;
										}
										if (arg0 == 4202) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local10609 = Static149.aClass244_1.method5958(local15);
											if (local21 >= 1 && local21 <= 5 && local10609.aStringArray32[local21 - 1] != null) {
												aStringArray22[anInt5283++] = local10609.aStringArray32[local21 - 1];
												return;
											}
											aStringArray22[anInt5283++] = "";
											return;
										}
										if (arg0 == 4203) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static149.aClass244_1.method5958(local15).anInt7933;
											return;
										}
										if (arg0 == 4204) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static149.aClass244_1.method5958(local15).anInt7877 == 1 ? 1 : 0;
											return;
										}
										@Pc(10783) Class282 local10783;
										if (arg0 == 4205) {
											local15 = anIntArray296[--anInt5278];
											local10783 = Static149.aClass244_1.method5958(local15);
											if (local10783.anInt7895 == -1 && local10783.anInt7898 >= 0) {
												anIntArray296[anInt5278++] = local10783.anInt7898;
												return;
											}
											anIntArray296[anInt5278++] = local15;
											return;
										}
										if (arg0 == 4206) {
											local15 = anIntArray296[--anInt5278];
											local10783 = Static149.aClass244_1.method5958(local15);
											if (local10783.anInt7895 >= 0 && local10783.anInt7898 >= 0) {
												anIntArray296[anInt5278++] = local10783.anInt7898;
												return;
											}
											anIntArray296[anInt5278++] = local15;
											return;
										}
										if (arg0 == 4207) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static149.aClass244_1.method5958(local15).aBoolean600 ? 1 : 0;
											return;
										}
										if (arg0 == 4208) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local3742 = Static521.aClass20_21.method250(local21);
											if (local3742.method7331()) {
												aStringArray22[anInt5283++] = Static149.aClass244_1.method5958(local15).method6980(local3742.aString96, local21);
												return;
											}
											anIntArray296[anInt5278++] = Static149.aClass244_1.method5958(local15).method6975(local21, local3742.anInt8386);
											return;
										}
										if (arg0 == 4209) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1] - 1;
											local10609 = Static149.aClass244_1.method5958(local15);
											if (local10609.anInt7919 == local21) {
												anIntArray296[anInt5278++] = local10609.anInt7873;
												return;
											}
											if (local10609.anInt7882 == local21) {
												anIntArray296[anInt5278++] = local10609.anInt7888;
												return;
											}
											anIntArray296[anInt5278++] = -1;
											return;
										}
										if (arg0 == 4210) {
											local4777 = aStringArray22[--anInt5283];
											local21 = anIntArray296[--anInt5278];
											Static600.method8280(local4777, local21 == 1);
											anIntArray296[anInt5278++] = Static327.anInt5649;
											return;
										}
										if (arg0 == 4211) {
											if (Static141.aShortArray139 != null && Static12.anInt187 < Static327.anInt5649) {
												anIntArray296[anInt5278++] = Static141.aShortArray139[Static12.anInt187++] & 0xFFFF;
												return;
											}
											anIntArray296[anInt5278++] = -1;
											return;
										}
										if (arg0 == 4212) {
											Static12.anInt187 = 0;
											return;
										}
										if (arg0 == 4213) {
											local15 = anIntArray296[--anInt5278];
											anIntArray296[anInt5278++] = Static149.aClass244_1.method5958(local15).anInt7925;
											return;
										}
										if (arg0 == 4214) {
											local4777 = aStringArray22[--anInt5283];
											anInt5278 -= 3;
											local21 = anIntArray296[anInt5278];
											local27 = anIntArray296[anInt5278 + 1];
											local506 = anIntArray296[anInt5278 + 2];
											Static291.method4770(local21 == 1, local27, local4777, local506);
											anIntArray296[anInt5278++] = Static327.anInt5649;
											return;
										}
										if (arg0 == 4215) {
											anInt5283 -= 2;
											anInt5278 -= 2;
											local4777 = aStringArray22[anInt5283];
											local21 = anIntArray296[anInt5278];
											local27 = anIntArray296[anInt5278 + 1];
											@Pc(11200) String local11200 = aStringArray22[anInt5283 + 1];
											Static569.method7980(local4777, local11200, local27, local21 == 1);
											anIntArray296[anInt5278++] = Static327.anInt5649;
											return;
										}
									} else if (arg0 < 4400) {
										if (arg0 == 4300) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local3742 = Static521.aClass20_21.method250(local21);
											if (local3742.method7331()) {
												aStringArray22[anInt5283++] = Static221.aClass164_1.method4157(local15).method7165(local3742.aString96, local21);
												return;
											}
											anIntArray296[anInt5278++] = Static221.aClass164_1.method4157(local15).method7162(local21, local3742.anInt8386);
											return;
										}
									} else if (arg0 < 4500) {
										if (arg0 == 4400) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local3742 = Static521.aClass20_21.method250(local21);
											if (local3742.method7331()) {
												aStringArray22[anInt5283++] = Static290.aClass163_5.method4124(127, local15).method3372(local3742.aString96, local21);
												return;
											}
											anIntArray296[anInt5278++] = Static290.aClass163_5.method4124(127, local15).method3374(local3742.anInt8386, local21);
											return;
										}
									} else if (arg0 < 4600) {
										if (arg0 == 4500) {
											anInt5278 -= 2;
											local15 = anIntArray296[anInt5278];
											local21 = anIntArray296[anInt5278 + 1];
											local3742 = Static521.aClass20_21.method250(local21);
											if (local3742.method7331()) {
												aStringArray22[anInt5283++] = Static143.aClass296_2.method7212(local15).method4498(local3742.aString96, local21);
												return;
											}
											anIntArray296[anInt5278++] = Static143.aClass296_2.method7212(local15).method4502(local3742.anInt8386, local21);
											return;
										}
									} else if (arg0 < 4700) {
										if (arg0 == 4600) {
											local15 = anIntArray296[--anInt5278];
											@Pc(11440) Class396 local11440 = Static551.aClass392_1.method8909(local15);
											if (local11440.anIntArray694 != null && local11440.anIntArray694.length > 0) {
												local27 = 0;
												local506 = local11440.anIntArray692[0];
												for (local2872 = 1; local2872 < local11440.anIntArray694.length; local2872++) {
													if (local11440.anIntArray692[local2872] > local506) {
														local27 = local2872;
														local506 = local11440.anIntArray692[local2872];
													}
												}
												anIntArray296[anInt5278++] = local11440.anIntArray694[local27];
												return;
											}
											anIntArray296[anInt5278++] = local11440.anInt10432;
											return;
										}
									} else if (arg0 < 4800) {
										if (arg0 == 4700) {
											anIntArray296[anInt5278++] = Static434.aBoolean553 ? 1 : 0;
											return;
										}
										if (arg0 == 4701) {
											local4777 = aStringArray22[--anInt5283];
											if (Static37.anInt498 == 7 && !Static110.method2079()) {
												if (local4777.length() > 20) {
													Static58.aByte9 = -4;
													return;
												}
												Static58.aByte9 = -1;
												local4871 = Static30.method353(Static32.aClass241_11, Static525.aClass260_3.aClass270_2);
												local4871.aClass6_Sub15_Sub1_1.method3016(0);
												local27 = local4871.aClass6_Sub15_Sub1_1.anInt3174;
												local4871.aClass6_Sub15_Sub1_1.method2991(local4777);
												local4871.aClass6_Sub15_Sub1_1.method2999(local4871.aClass6_Sub15_Sub1_1.anInt3174 - local27);
												Static525.aClass260_3.method6404(local4871);
												return;
											}
											Static58.aByte9 = -5;
											return;
										}
										if (arg0 == 4702) {
											anIntArray296[anInt5278++] = Static58.aByte9;
											if (Static58.aByte9 != -1) {
												Static58.aByte9 = -6;
											}
											return;
										}
									}
								}
							}
						}
					}
				} else {
					if (arg0 >= 2000) {
						arg0 -= 1000;
						local220 = Static69.method899(anIntArray296[--anInt5278]);
					} else {
						local220 = arg1 ? aClass381_5 : aClass381_6;
					}
					if (arg0 == 1300) {
						local21 = anIntArray296[--anInt5278] - 1;
						if (local21 >= 0 && local21 <= 9) {
							local220.method8743(local21, aStringArray22[--anInt5283]);
							return;
						}
						anInt5283--;
						return;
					}
					if (arg0 == 1301) {
						anInt5278 -= 2;
						local21 = anIntArray296[anInt5278];
						local27 = anIntArray296[anInt5278 + 1];
						if (local21 == -1 && local27 == -1) {
							local220.aClass381_14 = null;
							return;
						}
						local220.aClass381_14 = Static347.method5333(local27, local21);
						return;
					}
					if (arg0 == 1302) {
						local21 = anIntArray296[--anInt5278];
						if (local21 != Static302.anInt5297 && local21 != Static592.anInt9419 && local21 != Static24.anInt312) {
							return;
						}
						local220.anInt10107 = local21;
						return;
					}
					if (arg0 == 1303) {
						local220.anInt10148 = anIntArray296[--anInt5278];
						return;
					}
					if (arg0 == 1304) {
						local220.anInt10102 = anIntArray296[--anInt5278];
						return;
					}
					if (arg0 == 1305) {
						local220.aString121 = aStringArray22[--anInt5283];
						return;
					}
					if (arg0 == 1306) {
						local220.aString122 = aStringArray22[--anInt5283];
						return;
					}
					if (arg0 == 1307) {
						local220.aStringArray42 = null;
						return;
					}
					if (arg0 == 1308) {
						local220.anInt10120 = anIntArray296[--anInt5278];
						local220.anInt10075 = anIntArray296[--anInt5278];
						return;
					}
					if (arg0 == 1309) {
						local21 = anIntArray296[--anInt5278];
						local27 = anIntArray296[--anInt5278];
						if (local27 >= 1 && local27 <= 10) {
							local220.method8741(local21, local27 - 1);
						}
						return;
					}
					if (arg0 == 1310) {
						local220.aString125 = aStringArray22[--anInt5283];
						return;
					}
					if (arg0 == 1311) {
						local220.anInt10084 = anIntArray296[--anInt5278];
						return;
					}
					if (arg0 == 1312 || arg0 == 1313) {
						if (arg0 == 1312) {
							anInt5278 -= 3;
							local21 = anIntArray296[anInt5278] - 1;
							local27 = anIntArray296[anInt5278 + 1];
							local506 = anIntArray296[anInt5278 + 2];
							if (local21 < 0 || local21 > 9) {
								throw new RuntimeException("IOR13121313");
							}
						} else {
							anInt5278 -= 2;
							local21 = 10;
							local27 = anIntArray296[anInt5278];
							local506 = anIntArray296[anInt5278 + 1];
						}
						if (local220.aByteArray108 == null) {
							if (local27 == 0) {
								return;
							}
							local220.aByteArray108 = new byte[11];
							local220.aByteArray109 = new byte[11];
							local220.anIntArray664 = new int[11];
						}
						local220.aByteArray108[local21] = (byte) local27;
						if (local27 == 0) {
							local220.aBoolean755 = false;
							for (local2872 = 0; local2872 < local220.aByteArray108.length; local2872++) {
								if (local220.aByteArray108[local2872] != 0) {
									local220.aBoolean755 = true;
									break;
								}
							}
						} else {
							local220.aBoolean755 = true;
						}
						local220.aByteArray109[local21] = (byte) local506;
						return;
					}
					if (arg0 == 1314) {
						local220.anInt10072 = anIntArray296[--anInt5278];
						return;
					}
				}
			} else {
				if (arg0 >= 2000) {
					arg0 -= 1000;
					local220 = Static69.method899(anIntArray296[--anInt5278]);
				} else {
					local220 = arg1 ? aClass381_5 : aClass381_6;
				}
				Static168.method3312(local220);
				if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
					anInt5278 -= 2;
					local21 = anIntArray296[anInt5278];
					local27 = anIntArray296[anInt5278 + 1];
					if (local220.anInt10112 == -1) {
						Static581.method8103(local220.anInt10089);
						Static88.method1288(local220.anInt10089);
						Static23.method261(local220.anInt10089);
					}
					if (local21 == -1) {
						local220.anInt10086 = 1;
						local220.anInt10114 = -1;
						local220.anInt10149 = -1;
						return;
					}
					local220.anInt10149 = local21;
					local220.anInt10160 = local27;
					if (arg0 == 1208 || arg0 == 1209) {
						local220.aBoolean747 = true;
					} else {
						local220.aBoolean747 = false;
					}
					@Pc(2130) Class282 local2130 = Static149.aClass244_1.method5958(local21);
					local220.anInt10101 = local2130.anInt7920;
					local220.anInt10144 = local2130.anInt7901;
					local220.anInt10128 = local2130.anInt7886;
					local220.anInt10127 = local2130.anInt7930;
					local220.anInt10109 = local2130.anInt7913;
					local220.anInt10111 = local2130.anInt7937;
					if (arg0 == 1205 || arg0 == 1209) {
						local220.anInt10083 = 0;
					} else if (arg0 == 1212 || arg0 == 1213) {
						local220.anInt10083 = 1;
					} else {
						local220.anInt10083 = 2;
					}
					if (local220.anInt10092 > 0) {
						local220.anInt10111 = local220.anInt10111 * 32 / local220.anInt10092;
						return;
					}
					if (local220.anInt10094 > 0) {
						local220.anInt10111 = local220.anInt10111 * 32 / local220.anInt10094;
					}
					return;
				}
				if (arg0 == 1201) {
					local220.anInt10086 = 2;
					local220.anInt10114 = anIntArray296[--anInt5278];
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1202) {
					local220.anInt10086 = 3;
					local220.anInt10114 = -1;
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1203) {
					local220.anInt10086 = 6;
					local220.anInt10114 = anIntArray296[--anInt5278];
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1204) {
					local220.anInt10086 = 5;
					local220.anInt10114 = anIntArray296[--anInt5278];
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1206) {
					anInt5278 -= 4;
					local220.anInt10147 = anIntArray296[anInt5278];
					local220.anInt10137 = anIntArray296[anInt5278 + 1];
					local220.anInt10098 = anIntArray296[anInt5278 + 2];
					local220.anInt10129 = anIntArray296[anInt5278 + 3];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1207) {
					anInt5278 -= 2;
					local220.anInt10068 = anIntArray296[anInt5278];
					local220.anInt10152 = anIntArray296[anInt5278 + 1];
					Static168.method3312(local220);
					return;
				}
				if (arg0 == 1210) {
					anInt5278 -= 4;
					local220.anInt10114 = anIntArray296[anInt5278];
					local220.anInt10071 = anIntArray296[anInt5278 + 1];
					if (anIntArray296[anInt5278 + 2] == 1) {
						local220.anInt10086 = 9;
					} else {
						local220.anInt10086 = 8;
					}
					if (anIntArray296[anInt5278 + 3] == 1) {
						local220.aBoolean747 = true;
					} else {
						local220.aBoolean747 = false;
					}
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
				if (arg0 == 1211) {
					local220.anInt10086 = 5;
					local220.anInt10114 = Static503.anInt8407;
					local220.anInt10071 = 0;
					if (local220.anInt10112 == -1) {
						Static374.method5639(local220.anInt10089);
					}
					return;
				}
			}
		}
		throw new IllegalStateException(String.valueOf(arg0));
	}

	@OriginalMember(owner = "client!kaa", name = "e", descriptor = "(I)V")
	public static void method4834(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static172.method3336(arg0, (byte) -31)) {
			return;
		}
		@Pc(14) Class381[] local14 = Static686.aClass381ArrayArray2[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(21) Class381 local21 = local14[local16];
			if (local21.anObjectArray14 != null) {
				@Pc(28) Class6_Sub53 local28 = new Class6_Sub53();
				local28.aClass381_11 = local21;
				local28.anObjectArray3 = local21.anObjectArray14;
				method4841(local28, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(I)I")
	private static int method4835(@OriginalArg(0) int arg0) {
		@Pc(4) Class84 local4 = Static338.aClass159_1.method4063(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c113");
		}
		@Pc(29) Integer local29 = aClass391_1.method8893(local4.anInt2261, Static129.aClass121_1.anInt3555 << 16 | local4.anInt2263, local4.anInt2265);
		return local29 == null ? 0 : local29;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "()V")
	public static void method4836() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!vo;)V")
	private static void method4837(@OriginalArg(0) Class381 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(69) Class381[] local69;
		if (arg0.anInt10112 == -1) {
			@Pc(106) int local106 = arg0.anInt10089 >>> 16;
			@Pc(110) Class381[] local110 = Static431.aClass381ArrayArray1[local106];
			if (local110 == null) {
				local69 = Static686.aClass381ArrayArray2[local106];
				@Pc(119) int local119 = local69.length;
				local110 = Static431.aClass381ArrayArray1[local106] = new Class381[local119];
				Static695.method5647(local69, 0, local110, 0, local69.length);
			}
			@Pc(135) int local135;
			for (local135 = 0; local135 < local110.length && local110[local135] != arg0; local135++) {
			}
			if (local135 >= local110.length) {
				return;
			}
			Static695.method5647(local110, 0, local110, 1, local135);
			local110[0] = arg0;
			return;
		}
		@Pc(12) Class381 local12 = Static69.method899(arg0.anInt10079);
		if (local12 == null) {
			return;
		}
		if (local12.aClass381Array2 == local12.aClass381Array1) {
			local12.aClass381Array2 = new Class381[local12.aClass381Array1.length];
			local12.aClass381Array2[0] = arg0;
			Static695.method5647(local12.aClass381Array1, 0, local12.aClass381Array2, 1, arg0.anInt10112);
			Static695.method5647(local12.aClass381Array1, arg0.anInt10112 + 1, local12.aClass381Array2, arg0.anInt10112 + 1, local12.aClass381Array1.length - arg0.anInt10112 - 1);
			return;
		}
		@Pc(66) int local66 = 0;
		local69 = local12.aClass381Array2;
		while (local66 < local69.length && local69[local66] != arg0) {
			local66++;
		}
		if (local66 >= local69.length) {
			return;
		}
		Static695.method5647(local69, 0, local69, 1, local66);
		local69[0] = arg0;
		return;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(C)I")
	private static int method4838(@OriginalArg(0) char arg0) {
		return Static563.method7955(arg0) ? 1 : 0;
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!ue;I)V")
	private static void method4839(@OriginalArg(0) Class6_Sub2_Sub21 arg0, @OriginalArg(1) int arg1) {
		anInt5278 = 0;
		anInt5283 = 0;
		@Pc(5) int local5 = -1;
		@Pc(8) int[] local8 = arg0.anIntArray629;
		@Pc(11) int[] local11 = arg0.anIntArray631;
		@Pc(13) byte local13 = -1;
		anInt5286 = 0;
		@Pc(706) int local706;
		try {
			@Pc(17) int local17 = 0;
			label381: while (true) {
				local17++;
				if (local17 > arg1) {
					throw new RuntimeException("slow");
				}
				local5++;
				@Pc(34) int local34 = local8[local5];
				if (aBoolean399 && (aString60 == null || arg0.aString115 != null && arg0.aString115.indexOf(aString60) != -1)) {
					System.out.println(arg0.aString115 + ": " + local34);
				}
				if (local34 >= 150) {
					@Pc(1436) boolean local1436;
					if (local11[local5] == 1) {
						local1436 = true;
					} else {
						local1436 = false;
					}
					if (local34 >= 150 && local34 < 5000) {
						method4833(local34, local1436);
					} else if (local34 >= 5000 && local34 < 10000) {
						method4832(local34, local1436);
					} else {
						throw new IllegalStateException("Command: " + local34);
					}
				} else if (local34 == 0) {
					anIntArray296[anInt5278++] = local11[local5];
				} else {
					@Pc(96) int local96;
					if (local34 == 1) {
						local96 = local11[local5];
						anIntArray296[anInt5278++] = Static303.aClass55_2.anIntArray73[local96];
					} else if (local34 == 2) {
						local96 = local11[local5];
						Static303.aClass55_2.method938(local96, anIntArray296[--anInt5278]);
					} else if (local34 == 3) {
						aStringArray22[anInt5283++] = arg0.aStringArray39[local5];
					} else if (local34 == 6) {
						local5 += local11[local5];
					} else if (local34 == 7) {
						anInt5278 -= 2;
						if (anIntArray296[anInt5278] != anIntArray296[anInt5278 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 8) {
						anInt5278 -= 2;
						if (anIntArray296[anInt5278] == anIntArray296[anInt5278 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 9) {
						anInt5278 -= 2;
						if (anIntArray296[anInt5278] < anIntArray296[anInt5278 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 10) {
						anInt5278 -= 2;
						if (anIntArray296[anInt5278] > anIntArray296[anInt5278 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 21) {
						if (anInt5286 == 0) {
							return;
						}
						@Pc(270) Class128 local270 = aClass128Array1[--anInt5286];
						arg0 = local270.aClass6_Sub2_Sub21_1;
						local8 = arg0.anIntArray629;
						local11 = arg0.anIntArray631;
						local5 = local270.anInt3679;
						anIntArray297 = local270.anIntArray200;
						aStringArray21 = local270.aStringArray15;
						aLongArray14 = local270.aLongArray6;
					} else if (local34 == 25) {
						local96 = local11[local5];
						anIntArray296[anInt5278++] = Static303.aClass55_2.method935(local96);
					} else if (local34 == 27) {
						local96 = local11[local5];
						Static303.aClass55_2.method937(anIntArray296[--anInt5278], local96);
					} else if (local34 == 31) {
						anInt5278 -= 2;
						if (anIntArray296[anInt5278] <= anIntArray296[anInt5278 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 32) {
						anInt5278 -= 2;
						if (anIntArray296[anInt5278] >= anIntArray296[anInt5278 + 1]) {
							local5 += local11[local5];
						}
					} else if (local34 == 33) {
						anIntArray296[anInt5278++] = anIntArray297[local11[local5]];
					} else if (local34 == 34) {
						anIntArray297[local11[local5]] = anIntArray296[--anInt5278];
					} else if (local34 == 35) {
						aStringArray22[anInt5283++] = aStringArray21[local11[local5]];
					} else if (local34 == 36) {
						aStringArray21[local11[local5]] = aStringArray22[--anInt5283];
					} else {
						@Pc(465) String local465;
						if (local34 == 37) {
							local96 = local11[local5];
							anInt5283 -= local96;
							local465 = Static596.method8243(aStringArray22, local96, anInt5283);
							aStringArray22[anInt5283++] = local465;
						} else if (local34 == 38) {
							anInt5278--;
						} else if (local34 == 39) {
							anInt5283--;
						} else if (local34 == 40) {
							local96 = local11[local5];
							@Pc(503) Class6_Sub2_Sub21 local503 = Static521.method7926(local96);
							if (local503 == null) {
								throw new RuntimeException();
							}
							@Pc(514) int[] local514 = new int[local503.anInt9640];
							@Pc(518) String[] local518 = new String[local503.anInt9641];
							@Pc(522) long[] local522 = new long[local503.anInt9642];
							for (@Pc(524) int local524 = 0; local524 < local503.anInt9636; local524++) {
								local514[local524] = anIntArray296[anInt5278 + local524 - local503.anInt9636];
							}
							for (@Pc(543) int local543 = 0; local543 < local503.anInt9635; local543++) {
								local518[local543] = aStringArray22[anInt5283 + local543 - local503.anInt9635];
							}
							for (@Pc(562) int local562 = 0; local562 < local503.anInt9638; local562++) {
								local522[local562] = aLongArray13[anInt5279 + local562 - local503.anInt9638];
							}
							anInt5278 -= local503.anInt9636;
							anInt5283 -= local503.anInt9635;
							anInt5279 -= local503.anInt9638;
							@Pc(598) Class128 local598 = new Class128();
							local598.aClass6_Sub2_Sub21_1 = arg0;
							local598.anInt3679 = local5;
							local598.anIntArray200 = anIntArray297;
							local598.aStringArray15 = aStringArray21;
							local598.aLongArray6 = aLongArray14;
							if (anInt5286 >= aClass128Array1.length) {
								throw new RuntimeException();
							}
							aClass128Array1[anInt5286++] = local598;
							arg0 = local503;
							local8 = local503.anIntArray629;
							local11 = local503.anIntArray631;
							local5 = -1;
							anIntArray297 = local514;
							aStringArray21 = local518;
							aLongArray14 = local522;
						} else if (local34 == 42) {
							anIntArray296[anInt5278++] = Static333.anIntArray333[local11[local5]];
						} else if (local34 == 43) {
							local96 = local11[local5];
							Static333.anIntArray333[local96] = anIntArray296[--anInt5278];
							Static50.method597(local96);
							Static269.aBoolean380 |= Static371.aBooleanArray19[local96];
						} else if (local34 == 44) {
							local96 = local11[local5] >> 16;
							local706 = local11[local5] & 0xFFFF;
							@Pc(714) int local714 = anIntArray296[--anInt5278];
							if (local714 >= 0 && local714 <= 5000) {
								anIntArray298[local96] = local714;
								@Pc(732) byte local732 = -1;
								if (local706 == 105) {
									local732 = 0;
								}
								@Pc(739) int local739 = 0;
								while (true) {
									if (local739 >= local714) {
										continue label381;
									}
									anIntArrayArray28[local96][local739] = local732;
									local739++;
								}
							}
							throw new RuntimeException();
						} else if (local34 == 45) {
							local96 = local11[local5];
							local706 = anIntArray296[--anInt5278];
							if (local706 < 0 || local706 >= anIntArray298[local96]) {
								throw new RuntimeException();
							}
							anIntArray296[anInt5278++] = anIntArrayArray28[local96][local706];
						} else if (local34 == 46) {
							local96 = local11[local5];
							anInt5278 -= 2;
							local706 = anIntArray296[anInt5278];
							if (local706 < 0 || local706 >= anIntArray298[local96]) {
								throw new RuntimeException();
							}
							anIntArrayArray28[local96][local706] = anIntArray296[anInt5278 + 1];
						} else if (local34 == 47) {
							@Pc(843) String local843 = Static592.aStringArray37[local11[local5]];
							if (local843 == null) {
								local843 = "null";
							}
							aStringArray22[anInt5283++] = local843;
						} else if (local34 == 48) {
							local96 = local11[local5];
							Static592.aStringArray37[local96] = aStringArray22[--anInt5283];
							Static320.method5031(local96);
						} else if (local34 == 51) {
							@Pc(889) Class74 local889 = arg0.aClass74Array1[local11[local5]];
							@Pc(902) Class6_Sub6 local902 = (Class6_Sub6) local889.method1401((long) anIntArray296[--anInt5278]);
							if (local902 != null) {
								local5 += local902.anInt482;
							}
						} else if (local34 == 54) {
							aLongArray13[anInt5279++] = arg0.aLongArray20[local5];
						} else if (local34 == 55) {
							anInt5279--;
						} else if (local34 == 66) {
							aLongArray13[anInt5279++] = aLongArray14[local11[local5]];
						} else if (local34 == 67) {
							aLongArray14[local11[local5]] = aLongArray13[--anInt5279];
						} else if (local34 == 68) {
							anInt5279 -= 2;
							if (aLongArray13[anInt5279] != aLongArray13[anInt5279 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 69) {
							anInt5279 -= 2;
							if (aLongArray13[anInt5279] == aLongArray13[anInt5279 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 70) {
							anInt5279 -= 2;
							if (aLongArray13[anInt5279] < aLongArray13[anInt5279 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 71) {
							anInt5279 -= 2;
							if (aLongArray13[anInt5279] > aLongArray13[anInt5279 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 72) {
							anInt5279 -= 2;
							if (aLongArray13[anInt5279] <= aLongArray13[anInt5279 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 73) {
							anInt5279 -= 2;
							if (aLongArray13[anInt5279] >= aLongArray13[anInt5279 + 1]) {
								local5 += local11[local5];
							}
						} else if (local34 == 86) {
							if (anIntArray296[--anInt5278] == 1) {
								local5 += local11[local5];
							}
						} else if (local34 == 87) {
							if (anIntArray296[--anInt5278] == 0) {
								local5 += local11[local5];
							}
						} else if (local34 == 106) {
							local96 = local11[local5];
							@Pc(1178) Integer local1178 = (Integer) Static64.anObjectArray1[local96];
							if (local1178 == null) {
								@Pc(1185) Class89 local1185 = Static582.aClass367_1.method8572(local96);
								if (local1185.aChar2 == 'i' || local1185.aChar2 == '1') {
									anIntArray296[anInt5278++] = 0;
								} else {
									anIntArray296[anInt5278++] = -1;
								}
							} else {
								anIntArray296[anInt5278++] = local1178;
							}
						} else if (local34 == 107) {
							local96 = local11[local5];
							@Pc(1236) Class89 local1236 = Static582.aClass367_1.method8572(local96);
							if (local1236.aChar2 != '\u0001') {
								anIntArray296[anInt5278++] = 0;
							}
							@Pc(1256) Integer local1256 = (Integer) Static64.anObjectArray1[local1236.anInt2300];
							if (local1256 == null) {
								anIntArray296[anInt5278++] = 0;
							} else {
								@Pc(1284) int local1284 = local1236.anInt2303 == 31 ? -1 : (0x1 << local1236.anInt2303 + 1) - 1;
								anIntArray296[anInt5278++] = (local1256 & local1284) >>> local1236.anInt2299;
							}
						} else if (local34 == 108) {
							local96 = local11[local5];
							@Pc(1311) Long local1311 = (Long) Static64.anObjectArray1[local96];
							if (local1311 == null) {
								aLongArray13[anInt5279++] = -1L;
							} else {
								aLongArray13[anInt5279++] = local1311;
							}
						} else if (local34 == 109) {
							local96 = local11[local5];
							local465 = (String) Static64.anObjectArray1[local96];
							if (local465 == null) {
								aStringArray22[anInt5283++] = "";
							} else {
								aStringArray22[anInt5283++] = local465;
							}
						} else if (local34 == 112) {
							anIntArray296[anInt5278++] = method4843(local11[local5]);
						} else if (local34 == 113) {
							anIntArray296[anInt5278++] = method4835(local11[local5]);
						} else if (local34 == 114) {
							aLongArray13[anInt5279++] = method4831(local11[local5]);
						} else if (local34 == 115) {
							aStringArray22[anInt5283++] = method4830(local11[local5]);
						}
					}
				}
			}
		} catch (@Pc(1479) Exception local1479) {
			@Pc(1484) StringBuffer local1484 = new StringBuffer(30);
			local1484.append("CS2: ").append(arg0.aLong346).append(" ");
			for (local706 = anInt5286 - 1; local706 >= 0; local706--) {
				local1484.append("v: ").append(aClass128Array1[local706].aClass6_Sub2_Sub21_1.aLong346).append(" ");
			}
			local1484.append("op: ").append(local13);
			Static550.method7785(local1479, local1484.toString());
		}
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!va;I)V")
	private static void method4841(@OriginalArg(0) Class6_Sub53 arg0, @OriginalArg(1) int arg1) {
		@Pc(2) Object[] local2 = arg0.anObjectArray3;
		@Pc(8) int local8 = (Integer) local2[0];
		@Pc(12) Class6_Sub2_Sub21 local12 = Static521.method7926(local8);
		if (local12 == null) {
			return;
		}
		anIntArray297 = new int[local12.anInt9640];
		@Pc(22) int local22 = 0;
		aStringArray21 = new String[local12.anInt9641];
		@Pc(28) int local28 = 0;
		aLongArray14 = new long[local12.anInt9642];
		@Pc(34) int local34 = 0;
		for (@Pc(36) int local36 = 1; local36 < local2.length; local36++) {
			if (local2[local36] instanceof Integer) {
				@Pc(48) int local48 = (Integer) local2[local36];
				if (local48 == -2147483647) {
					local48 = arg0.anInt9918;
				}
				if (local48 == -2147483646) {
					local48 = arg0.anInt9916;
				}
				if (local48 == -2147483645) {
					local48 = arg0.aClass381_11 == null ? -1 : arg0.aClass381_11.anInt10089;
				}
				if (local48 == -2147483644) {
					local48 = arg0.anInt9921;
				}
				if (local48 == -2147483643) {
					local48 = arg0.aClass381_11 == null ? -1 : arg0.aClass381_11.anInt10112;
				}
				if (local48 == -2147483642) {
					local48 = arg0.aClass381_12 == null ? -1 : arg0.aClass381_12.anInt10089;
				}
				if (local48 == -2147483641) {
					local48 = arg0.aClass381_12 == null ? -1 : arg0.aClass381_12.anInt10112;
				}
				if (local48 == -2147483640) {
					local48 = arg0.anInt9917;
				}
				if (local48 == -2147483639) {
					local48 = arg0.anInt9919;
				}
				anIntArray297[local22++] = local48;
			} else if (local2[local36] instanceof String) {
				@Pc(154) String local154 = (String) local2[local36];
				if (local154.equals("event_opbase")) {
					local154 = arg0.aString119;
				}
				aStringArray21[local28++] = local154;
			} else if (local2[local36] instanceof Long) {
				@Pc(180) long local180 = (Long) local2[local36];
				aLongArray14[local34++] = local180;
			}
		}
		anInt5292 = arg0.anInt9915;
		method4839(local12, arg1);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!va;)V")
	public static void method4842(@OriginalArg(0) Class6_Sub53 arg0) {
		method4841(arg0, 200000);
	}

	@OriginalMember(owner = "client!kaa", name = "d", descriptor = "(I)I")
	private static int method4843(@OriginalArg(0) int arg0) {
		@Pc(4) Class84 local4 = Static338.aClass159_1.method4063(arg0);
		if (local4 == null) {
			throw new RuntimeException("sr-c112");
		}
		@Pc(24) Integer local24 = aClass391_1.method8901(Static129.aClass121_1.anInt3555 << 16 | arg0);
		if (local24 == null) {
			return local4.aChar1 == 'i' || local4.aChar1 == '1' ? 0 : -1;
		} else {
			return local24;
		}
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(IZ)V")
	public static void method4844() {
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Lclient!op;II)V")
	public static void method4845(@OriginalArg(0) Class275 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) Class6_Sub2_Sub21 local5 = Static191.method3632(arg0, arg1, arg2);
		if (local5 == null) {
			return;
		}
		anIntArray297 = new int[local5.anInt9640];
		aStringArray21 = new String[local5.anInt9641];
		if (local5.aClass275_16 == Static84.aClass275_6 || local5.aClass275_16 == Static547.aClass275_15 || local5.aClass275_16 == Static82.aClass275_5) {
			@Pc(35) int local35 = 0;
			@Pc(37) int local37 = 0;
			if (Static88.aClass381_2 != null) {
				local35 = Static88.aClass381_2.anInt10155;
				local37 = Static88.aClass381_2.anInt10116;
			}
			anIntArray297[0] = Static331.aClass42_8.method6019() - local35;
			anIntArray297[1] = Static331.aClass42_8.method6014() - local37;
		}
		method4839(local5, 200000);
	}

	@OriginalMember(owner = "client!kaa", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private static void method4846(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static679.anInt6104 == 0 && (Static334.aBoolean425 && !Static364.aBoolean455 || Static610.aBoolean714)) {
			return;
		}
		@Pc(18) String local18 = arg0.toLowerCase();
		@Pc(20) byte local20 = 0;
		if (local18.startsWith(Static50.aClass43_46.method596(0))) {
			local20 = 0;
			arg0 = arg0.substring(Static50.aClass43_46.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_47.method596(0))) {
			local20 = 1;
			arg0 = arg0.substring(Static50.aClass43_47.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_48.method596(0))) {
			local20 = 2;
			arg0 = arg0.substring(Static50.aClass43_48.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_49.method596(0))) {
			local20 = 3;
			arg0 = arg0.substring(Static50.aClass43_49.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_50.method596(0))) {
			local20 = 4;
			arg0 = arg0.substring(Static50.aClass43_50.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_51.method596(0))) {
			local20 = 5;
			arg0 = arg0.substring(Static50.aClass43_51.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_52.method596(0))) {
			local20 = 6;
			arg0 = arg0.substring(Static50.aClass43_52.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_53.method596(0))) {
			local20 = 7;
			arg0 = arg0.substring(Static50.aClass43_53.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_54.method596(0))) {
			local20 = 8;
			arg0 = arg0.substring(Static50.aClass43_54.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_55.method596(0))) {
			local20 = 9;
			arg0 = arg0.substring(Static50.aClass43_55.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_56.method596(0))) {
			local20 = 10;
			arg0 = arg0.substring(Static50.aClass43_56.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_57.method596(0))) {
			local20 = 11;
			arg0 = arg0.substring(Static50.aClass43_57.method596(0).length());
		} else if (Static601.anInt9518 != 0) {
			if (local18.startsWith(Static50.aClass43_46.method596(Static601.anInt9518))) {
				local20 = 0;
				arg0 = arg0.substring(Static50.aClass43_46.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_47.method596(Static601.anInt9518))) {
				local20 = 1;
				arg0 = arg0.substring(Static50.aClass43_47.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_48.method596(Static601.anInt9518))) {
				local20 = 2;
				arg0 = arg0.substring(Static50.aClass43_48.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_49.method596(Static601.anInt9518))) {
				local20 = 3;
				arg0 = arg0.substring(Static50.aClass43_49.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_50.method596(Static601.anInt9518))) {
				local20 = 4;
				arg0 = arg0.substring(Static50.aClass43_50.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_51.method596(Static601.anInt9518))) {
				local20 = 5;
				arg0 = arg0.substring(Static50.aClass43_51.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_52.method596(Static601.anInt9518))) {
				local20 = 6;
				arg0 = arg0.substring(Static50.aClass43_52.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_53.method596(Static601.anInt9518))) {
				local20 = 7;
				arg0 = arg0.substring(Static50.aClass43_53.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_54.method596(Static601.anInt9518))) {
				local20 = 8;
				arg0 = arg0.substring(Static50.aClass43_54.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_55.method596(Static601.anInt9518))) {
				local20 = 9;
				arg0 = arg0.substring(Static50.aClass43_55.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_56.method596(Static601.anInt9518))) {
				local20 = 10;
				arg0 = arg0.substring(Static50.aClass43_56.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_57.method596(Static601.anInt9518))) {
				local20 = 11;
				arg0 = arg0.substring(Static50.aClass43_57.method596(Static601.anInt9518).length());
			}
		}
		local18 = arg0.toLowerCase();
		@Pc(460) byte local460 = 0;
		if (local18.startsWith(Static50.aClass43_58.method596(0))) {
			local460 = 1;
			arg0 = arg0.substring(Static50.aClass43_58.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_59.method596(0))) {
			local460 = 2;
			arg0 = arg0.substring(Static50.aClass43_59.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_60.method596(0))) {
			local460 = 3;
			arg0 = arg0.substring(Static50.aClass43_60.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_61.method596(0))) {
			local460 = 4;
			arg0 = arg0.substring(Static50.aClass43_61.method596(0).length());
		} else if (local18.startsWith(Static50.aClass43_62.method596(0))) {
			local460 = 5;
			arg0 = arg0.substring(Static50.aClass43_62.method596(0).length());
		} else if (Static601.anInt9518 != 0) {
			if (local18.startsWith(Static50.aClass43_58.method596(Static601.anInt9518))) {
				local460 = 1;
				arg0 = arg0.substring(Static50.aClass43_58.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_59.method596(Static601.anInt9518))) {
				local460 = 2;
				arg0 = arg0.substring(Static50.aClass43_59.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_60.method596(Static601.anInt9518))) {
				local460 = 3;
				arg0 = arg0.substring(Static50.aClass43_60.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_61.method596(Static601.anInt9518))) {
				local460 = 4;
				arg0 = arg0.substring(Static50.aClass43_61.method596(Static601.anInt9518).length());
			} else if (local18.startsWith(Static50.aClass43_62.method596(Static601.anInt9518))) {
				local460 = 5;
				arg0 = arg0.substring(Static50.aClass43_62.method596(Static601.anInt9518).length());
			}
		}
		@Pc(650) Class260 local650 = Static629.method8573();
		@Pc(656) Class6_Sub13 local656 = Static30.method353(Static110.aClass241_30, local650.aClass270_2);
		local656.aClass6_Sub15_Sub1_1.method3016(0);
		@Pc(665) int local665 = local656.aClass6_Sub15_Sub1_1.anInt3174;
		local656.aClass6_Sub15_Sub1_1.method3016(local20);
		local656.aClass6_Sub15_Sub1_1.method3016(local460);
		Static568.method8736(arg0, local656.aClass6_Sub15_Sub1_1);
		local656.aClass6_Sub15_Sub1_1.method2999(local656.aClass6_Sub15_Sub1_1.anInt3174 - local665);
		local650.method6404(local656);
	}

	@OriginalMember(owner = "client!kaa", name = "b", descriptor = "(Lclient!vo;)V")
	private static void method4847(@OriginalArg(0) Class381 arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(71) Class381[] local71;
		if (arg0.anInt10112 == -1) {
			@Pc(119) int local119 = arg0.anInt10089 >>> 16;
			@Pc(123) Class381[] local123 = Static431.aClass381ArrayArray1[local119];
			if (local123 == null) {
				local71 = Static686.aClass381ArrayArray2[local119];
				@Pc(132) int local132 = local71.length;
				local123 = Static431.aClass381ArrayArray1[local119] = new Class381[local132];
				Static695.method5647(local71, 0, local123, 0, local71.length);
			}
			@Pc(148) int local148;
			for (local148 = 0; local148 < local123.length && local123[local148] != arg0; local148++) {
			}
			if (local148 >= local123.length) {
				return;
			}
			Static695.method5647(local123, local148 + 1, local123, local148, local123.length - local148 - 1);
			local123[local123.length - 1] = arg0;
			return;
		}
		@Pc(12) Class381 local12 = Static69.method899(arg0.anInt10079);
		if (local12 == null) {
			return;
		}
		if (local12.aClass381Array2 == local12.aClass381Array1) {
			local12.aClass381Array2 = new Class381[local12.aClass381Array1.length];
			local12.aClass381Array2[local12.aClass381Array2.length - 1] = arg0;
			Static695.method5647(local12.aClass381Array1, 0, local12.aClass381Array2, 0, arg0.anInt10112);
			Static695.method5647(local12.aClass381Array1, arg0.anInt10112 + 1, local12.aClass381Array2, arg0.anInt10112, local12.aClass381Array1.length - arg0.anInt10112 - 1);
			return;
		}
		@Pc(68) int local68 = 0;
		local71 = local12.aClass381Array2;
		while (local68 < local71.length && local71[local68] != arg0) {
			local68++;
		}
		if (local68 >= local71.length) {
			return;
		}
		Static695.method5647(local71, local68 + 1, local71, local68, local71.length - local68 - 1);
		local71[local12.aClass381Array2.length - 1] = arg0;
		return;
	}
}
