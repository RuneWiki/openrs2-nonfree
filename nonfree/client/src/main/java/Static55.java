import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static55 {

	@OriginalMember(owner = "client!df", name = "f", descriptor = "[I")
	public static final int[] anIntArray226 = new int[500];

	@OriginalMember(owner = "client!df", name = "h", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_19 = new Class11(48, 4);

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
	public static boolean aBoolean87 = false;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_21 = new Class32("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_26 = new Class205(3, 2);

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!mo;")
	public static final Class160 aClass160_9 = new Class160(4);

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII[BLjava/lang/String;)I")
	public static int method916(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) String arg3) {
		@Pc(8) int local8 = arg1;
		for (@Pc(10) int local10 = 0; local10 < local8; local10++) {
			@Pc(17) char local17 = arg3.charAt(local10);
			if (local17 > '\u0000' && local17 < '\u0080' || !(local17 < ' ' || local17 > 'ÿ')) {
				arg2[arg0 + local10] = (byte) local17;
			} else if (local17 == '€') {
				arg2[local10 + arg0] = -128;
			} else if (local17 == '‚') {
				arg2[local10 + arg0] = -126;
			} else if (local17 == 'ƒ') {
				arg2[arg0 + local10] = -125;
			} else if (local17 == '„') {
				arg2[local10 + arg0] = -124;
			} else if (local17 == '…') {
				arg2[local10 + arg0] = -123;
			} else if (local17 == '†') {
				arg2[local10 + arg0] = -122;
			} else if (local17 == '‡') {
				arg2[local10 + arg0] = -121;
			} else if (local17 == 'ˆ') {
				arg2[arg0 + local10] = -120;
			} else if (local17 == '‰') {
				arg2[local10 + arg0] = -119;
			} else if (local17 == 'Š') {
				arg2[arg0 + local10] = -118;
			} else if (local17 == '‹') {
				arg2[arg0 + local10] = -117;
			} else if (local17 == 'Œ') {
				arg2[local10 + arg0] = -116;
			} else if (local17 == 'Ž') {
				arg2[arg0 + local10] = -114;
			} else if (local17 == '‘') {
				arg2[local10 + arg0] = -111;
			} else if (local17 == '’') {
				arg2[local10 + arg0] = -110;
			} else if (local17 == '“') {
				arg2[arg0 + local10] = -109;
			} else if (local17 == '”') {
				arg2[local10 + arg0] = -108;
			} else if (local17 == '•') {
				arg2[local10 + arg0] = -107;
			} else if (local17 == '–') {
				arg2[local10 + arg0] = -106;
			} else if (local17 == '—') {
				arg2[arg0 + local10] = -105;
			} else if (local17 == '˜') {
				arg2[arg0 + local10] = -104;
			} else if (local17 == '™') {
				arg2[arg0 + local10] = -103;
			} else if (local17 == 'š') {
				arg2[arg0 + local10] = -102;
			} else if (local17 == '›') {
				arg2[arg0 + local10] = -101;
			} else if (local17 == 'œ') {
				arg2[arg0 + local10] = -100;
			} else if (local17 == 'ž') {
				arg2[local10 + arg0] = -98;
			} else if (local17 == 'Ÿ') {
				arg2[local10 + arg0] = -97;
			} else {
				arg2[arg0 + local10] = 63;
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBZII)V")
	public static void method918(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(14) long local14 = (long) (arg4 | (arg2 ? Integer.MIN_VALUE : 0));
		@Pc(20) Class2_Sub1 local20 = (Class2_Sub1) Static141.aClass246_7.method5613(local14);
		if (local20 == null) {
			local20 = new Class2_Sub1();
			Static141.aClass246_7.method5609(local20, local14);
		}
		if (local20.anIntArray14.length <= arg1) {
			@Pc(41) int[] local41 = new int[arg1 + 1];
			@Pc(46) int[] local46 = new int[arg1 + 1];
			for (@Pc(48) int local48 = 0; local48 < local20.anIntArray14.length; local48++) {
				local41[local48] = local20.anIntArray14[local48];
				local46[local48] = local20.anIntArray15[local48];
			}
			for (@Pc(74) int local74 = local20.anIntArray14.length; local74 < arg1; local74++) {
				local41[local74] = -1;
				local46[local74] = 0;
			}
			local20.anIntArray15 = local46;
			local20.anIntArray14 = local41;
		}
		local20.anIntArray14[arg1] = arg0;
		local20.anIntArray15[arg1] = arg3;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(III)V")
	public static void method919(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static348.method5096(arg1)) {
			Static185.method3200(Static183.aClass4ArrayArray1[arg1], arg0);
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
	public static void method920() {
		if (Static250.aString52.length() == 0) {
			return;
		}
		Static210.method3525("--> " + Static250.aString52);
		Static192.method3298(false, Static250.aString52);
		Static263.anInt4604 = 0;
		Static98.anInt2060 = 0;
		Static250.aString52 = "";
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BLclient!vc;)V")
	public static void method921(@OriginalArg(1) Class63 arg0) {
		if (Static285.anInt4946 < 2 && !Static110.aBoolean180 || Static242.aClass4_22 != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static110.aBoolean180 && Static285.anInt4946 < 2) {
			local41 = Static391.aString68 + Static9.aClass32_5.method701(Static107.anInt2498) + Static217.aString47 + " ->";
		} else if (Static250.aBoolean335 && Static48.aClass69_1.method2261(81) && Static285.anInt4946 > 2) {
			local41 = Static308.method4502((Class2_Sub26) Static195.aClass30_28.aClass2_41.aClass2_244.aClass2_244);
		} else {
			@Pc(37) Class2_Sub26 local37 = (Class2_Sub26) Static195.aClass30_28.aClass2_41.aClass2_244;
			local41 = Static308.method4502(local37);
			@Pc(43) int[] local43 = null;
			if (Static37.method674(local37.anInt3594)) {
				local43 = Static15.aClass81_1.method2175((int) local37.aLong127).anIntArray853;
			} else if (local37.anInt3593 != -1) {
				local43 = Static15.aClass81_1.method2175(local37.anInt3593).anIntArray853;
			} else if (Static17.method319(local37.anInt3594)) {
				@Pc(81) Class1_Sub5_Sub1_Sub2 local81 = Static299.aClass1_Sub5_Sub1_Sub2Array1[(int) local37.aLong127];
				if (local81 != null) {
					@Pc(86) Class133 local86 = local81.aClass133_1;
					if (local86.anIntArray653 != null) {
						local86 = local86.method3094(Static321.aClass211_1);
					}
					if (local86 != null) {
						local43 = local86.anIntArray651;
					}
				}
			} else if (Static249.method5593(local37.anInt3594)) {
				@Pc(122) Class172 local122;
				if (local37.anInt3594 == 1001) {
					local122 = Static221.aClass118_6.method2858((int) local37.aLong127);
				} else {
					local122 = Static221.aClass118_6.method2858((int) (local37.aLong127 >>> 32 & 0x7FFFFFFFL));
				}
				if (local122.anIntArray801 != null) {
					local122 = local122.method3775(Static321.aClass211_1);
				}
				if (local122 != null) {
					local43 = local122.anIntArray802;
				}
			}
			if (local43 != null) {
				local41 = local41 + Static245.method3916(local43);
			}
		}
		if (Static285.anInt4946 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static285.anInt4946 - 2) + Static265.aClass32_69.method701(Static107.anInt2498);
		}
		if (Static31.aClass4_5 != null) {
			@Pc(258) Class9 local258 = Static31.aClass4_5.method75(arg0);
			if (local258 == null) {
				local258 = Static340.aClass9_4;
			}
			local258.method5046(Static31.aClass4_5.anInt113, Static382.aClass18Array14, Static185.anIntArray675, Static31.aClass4_5.anInt134, Static51.aRandom1, Static31.aClass4_5.anInt57, Static31.aClass4_5.anInt49, Static31.aClass4_5.anInt86, Static259.anInt4530, Static44.anIntArray183, local41, Static133.anInt2725, Static31.aClass4_5.anInt101, Static283.anInt4895);
			Static29.method507(Static185.anIntArray675[3], Static185.anIntArray675[2], Static185.anIntArray675[0], Static185.anIntArray675[1]);
		} else if (Static40.aClass4_7 != null && Static275.aClass150_3 == Static195.aClass150_2) {
			@Pc(239) int local239 = Static340.aClass9_4.method5042(local41, Static31.anInt666 + 4, Static51.aRandom1, Static44.anIntArray183, Static380.anInt6480 + 16, Static382.aClass18Array14, Static259.anInt4530);
			Static29.method507(16, local239 + Static238.aClass136_7.method3125(local41), Static31.anInt666 + 4, Static380.anInt6480);
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(III)I")
	public static int method922(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static295.anIntArray1005[arg0 & 0x3] : Static85.anIntArray360[arg0 & 0x3];
	}
}
