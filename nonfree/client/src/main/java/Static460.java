import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
	public static int anInt7364;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;Lclient!bq;Lclient!ha;ZLclient!da;)V")
	public static void method6416(@OriginalArg(1) String arg0, @OriginalArg(2) Class31 arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class56 arg4) {
		@Pc(12) boolean local12 = !Static26.aBoolean89 || Static266.method3808();
		if (!local12) {
			return;
		}
		@Pc(39) int local39;
		@Pc(48) int local48;
		if (Static26.aBoolean89 && local12) {
			@Pc(26) Class31 local26 = Static302.aClass31_3;
			@Pc(32) Class56 local32 = arg2.method8081(local26, Static676.aClass51Array1);
			local39 = local26.method1020((Class17[]) null, arg0, 250);
			local48 = local26.method1021((Class17[]) null, local26.anInt1106, 250, arg0);
			@Pc(51) int local51 = Static660.aClass51_3.anInt1661;
			@Pc(55) int local55 = local51 + 4;
			local48 += local55 * 2;
			local39 += local55 * 2;
			if (Static138.anInt2558 > local39) {
				local39 = Static138.anInt2558;
			}
			if (Static166.anInt4558 > local48) {
				local48 = Static166.anInt4558;
			}
			@Pc(94) int local94 = Static557.aClass291_13.method6524(Static606.anInt9314, local39) + Static82.anInt8419;
			@Pc(103) int local103 = Static525.aClass125_14.method2842(local48, Static353.anInt5368) + Static335.anInt5217;
			if (Static423.aBoolean517) {
				local94 += Static383.method8455();
				local103 += Static286.method4120();
			}
			arg2.method8147(Static191.aClass51_2, false).method5255(Static30.aClass51_1.anInt1661 + local94, Static30.aClass51_1.anInt1657 + local103, local39 - Static30.aClass51_1.anInt1661 * 2, local48 + -(Static30.aClass51_1.anInt1657 * 2), 1, 0, 0);
			arg2.method8147(Static30.aClass51_1, true).method5246(local94, local103);
			Static30.aClass51_1.method1656();
			arg2.method8147(Static30.aClass51_1, true).method5246(local39 + local94 - local51, local103);
			Static30.aClass51_1.method1665();
			arg2.method8147(Static30.aClass51_1, true).method5246(local94 + local39 - local51, -local51 + local103 + local48);
			Static30.aClass51_1.method1656();
			arg2.method8147(Static30.aClass51_1, true).method5246(local94, local48 + local103 - local51);
			Static30.aClass51_1.method1665();
			arg2.method8147(Static660.aClass51_3, true).method5261(local94, local103 + Static30.aClass51_1.anInt1657, local51, local48 - Static30.aClass51_1.anInt1657 * 2);
			Static660.aClass51_3.method1661();
			arg2.method8147(Static660.aClass51_3, true).method5261(local94 + Static30.aClass51_1.anInt1661, local103, local39 - Static30.aClass51_1.anInt1661 * 2, local51);
			Static660.aClass51_3.method1661();
			arg2.method8147(Static660.aClass51_3, true).method5261(local39 + local94 - local51, Static30.aClass51_1.anInt1657 + local103, local51, local48 - Static30.aClass51_1.anInt1657 * 2);
			Static660.aClass51_3.method1661();
			arg2.method8147(Static660.aClass51_3, true).method5261(Static30.aClass51_1.anInt1661 + local94, -local51 + (local103 - -local48), local39 - Static30.aClass51_1.anInt1661 * 2, local51);
			Static660.aClass51_3.method1661();
			local32.method8065(0, -1, 1, 0, local103 + local55, 1, arg0, 0, local48 - local55 * 2, (Class17[]) null, (Class1) null, local39 - local55 * 2, (int[]) null, local55 + local94, Static378.anInt5619 | 0xFF000000);
			Static66.method1452(local48, local94, local103, local39);
		} else {
			local39 = arg1.method1020((Class17[]) null, arg0, 250);
			local48 = arg1.method1017((Class17[]) null, arg0, 250) * 13;
			arg2.aa(6, 6, local39 + 4 + 4, local48 - -4 + 4, -16777216, 0);
			arg2.method8142(6, 6, local39 + 4 + 4, local48 + 8, -1, 0);
			arg4.method8065(0, -1, 1, 0, 10, 1, arg0, 0, local48, (Class17[]) null, (Class1) null, local39, (int[]) null, 10, -1);
			Static66.method1452(local48 + 4 + 4, 6, 6, local39 + 4 + 4);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static423.aBoolean517) {
				Static247.method3633();
			} else {
				arg2.method8095();
			}
		} catch (@Pc(454) Exception_Sub1 local454) {
		}
	}

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
	public static void method6417() throws IOException {
		if (Static375.aClass192_2 == null || Static384.anInt5662 <= 0) {
			return;
		}
		Static81.aClass4_Sub11_2.anInt10466 = 0;
		while (true) {
			@Pc(18) Class4_Sub48 local18 = (Class4_Sub48) Static8.aClass163_2.method3639();
			if (local18 == null || Static81.aClass4_Sub11_2.aByteArray107.length - Static81.aClass4_Sub11_2.anInt10466 < local18.anInt9241) {
				Static375.aClass192_2.method7790(Static81.aClass4_Sub11_2.anInt10466, Static81.aClass4_Sub11_2.aByteArray107);
				Static200.anInt3300 += Static81.aClass4_Sub11_2.anInt10466;
				Static635.anInt9890 = 0;
				break;
			}
			Static81.aClass4_Sub11_2.method8824(local18.aClass4_Sub11_Sub1_2.aByteArray107, local18.anInt9241, 0);
			Static384.anInt5662 -= local18.anInt9241;
			local18.method9000();
			local18.aClass4_Sub11_Sub1_2.method8864();
			local18.method7902();
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I")
	public static int method6419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) int local12 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local12;
		@Pc(35) int local35 = ((arg0 & 0xFF00FF) * local12 & 0xFF00FF00 | (arg0 & 0xFF00) * local12 & 0xFF0000) >>> 8;
		return local35 + (((arg1 & 0xFF00FF) * local17 & 0xFF00FF00 | local17 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!kq;B)V")
	public static void method6421(@OriginalArg(0) Class199 arg0) {
		if (Static173.anInt3042 != arg0.anInt4955) {
			return;
		}
		if (Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37 == null) {
			arg0.anInt4956 = 0;
			arg0.anInt4983 = 0;
			return;
		}
		arg0.anInt4972 = 150;
		arg0.anInt5006 = (int) (Math.sin((double) Static177.anInt3088 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt4956 = Static184.anInt3149;
		arg0.anInt5039 = 5;
		arg0.anInt4983 = Static330.method4560(Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.aString37);
		arg0.anInt4948 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9967;
		arg0.anInt5014 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9972;
		arg0.anInt4960 = 0;
		arg0.anInt4985 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9973;
		@Pc(79) Class124 local79 = arg0.anInt4948 == -1 ? null : Static99.aClass2_1.method22(arg0.anInt4948);
		if (local79 != null) {
			Static122.method2185(arg0.anInt4985, local79);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BIIZLjava/lang/String;)I")
	public static int method6426(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(5) String arg3) {
		@Pc(10) int local10 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local10; local17++) {
			@Pc(25) char local25 = arg3.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg1[local17 + arg0] = (byte) local25;
			} else if (local25 == '€') {
				arg1[arg0 + local17] = -128;
			} else if (local25 == '‚') {
				arg1[arg0 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg1[local17 + arg0] = -125;
			} else if (local25 == '„') {
				arg1[arg0 + local17] = -124;
			} else if (local25 == '…') {
				arg1[local17 + arg0] = -123;
			} else if (local25 == '†') {
				arg1[arg0 + local17] = -122;
			} else if (local25 == '‡') {
				arg1[local17 + arg0] = -121;
			} else if (local25 == 'ˆ') {
				arg1[arg0 + local17] = -120;
			} else if (local25 == '‰') {
				arg1[arg0 + local17] = -119;
			} else if (local25 == 'Š') {
				arg1[local17 + arg0] = -118;
			} else if (local25 == '‹') {
				arg1[arg0 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg1[arg0 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg1[local17 + arg0] = -114;
			} else if (local25 == '‘') {
				arg1[arg0 + local17] = -111;
			} else if (local25 == '’') {
				arg1[local17 + arg0] = -110;
			} else if (local25 == '“') {
				arg1[arg0 + local17] = -109;
			} else if (local25 == '”') {
				arg1[arg0 + local17] = -108;
			} else if (local25 == '•') {
				arg1[arg0 + local17] = -107;
			} else if (local25 == '–') {
				arg1[local17 + arg0] = -106;
			} else if (local25 == '—') {
				arg1[local17 + arg0] = -105;
			} else if (local25 == '˜') {
				arg1[arg0 + local17] = -104;
			} else if (local25 == '™') {
				arg1[local17 + arg0] = -103;
			} else if (local25 == 'š') {
				arg1[arg0 + local17] = -102;
			} else if (local25 == '›') {
				arg1[local17 + arg0] = -101;
			} else if (local25 == 'œ') {
				arg1[local17 + arg0] = -100;
			} else if (local25 == 'ž') {
				arg1[local17 + arg0] = -98;
			} else if (local25 == 'Ÿ') {
				arg1[local17 + arg0] = -97;
			} else {
				arg1[arg0 + local17] = 63;
			}
		}
		return local10;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)Lclient!bja;")
	public static Class27 method6427(@OriginalArg(0) int arg0) {
		@Pc(6) Class27[] local6 = Static657.method8759();
		for (@Pc(8) int local8 = 0; local8 < local6.length; local8++) {
			if (arg0 == local6[local8].anInt883) {
				return local6[local8];
			}
		}
		return null;
	}
}
