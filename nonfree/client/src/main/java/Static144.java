import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "I")
	public static int anInt3081;

	@OriginalMember(owner = "client!ja", name = "i", descriptor = "I")
	public static int anInt3083;

	@OriginalMember(owner = "client!ja", name = "k", descriptor = "I")
	public static int anInt3085;

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "[Lclient!bf;")
	public static Class11_Sub2[] aClass11_Sub2Array1;

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_101 = new Class217(46, 12);

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "I")
	public static int anInt3082 = 2;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(I)V")
	public static void method2857() {
		if (Static336.anInt6389 == -1) {
			return;
		}
		@Pc(13) int local13 = Static164.aClass142_1.method4911();
		@Pc(19) int local19 = Static164.aClass142_1.method4915();
		if (Static189.aClass1_Sub8_1 != null) {
			local13 = Static189.aClass1_Sub8_1.method593();
			local19 = Static189.aClass1_Sub8_1.method596();
		}
		Static89.method1872(local19, 0, local13, Static336.anInt6389, 0, 0, 0, Static213.anInt4274, Static130.anInt2825);
		if (Static135.aClass112_10 != null) {
			Static352.method1731(local19, local13);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZLjava/lang/String;)V")
	public static void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(8) Class112 local8 = Static147.method2868(arg1, arg2);
		if (local8 == null) {
			return;
		}
		if (local8.anObjectArray6 != null) {
			@Pc(18) Class1_Sub35 local18 = new Class1_Sub35();
			local18.aClass112_16 = local8;
			local18.anObjectArray34 = local8.anObjectArray6;
			local18.anInt5221 = arg0;
			local18.aString49 = arg3;
			Static302.method5243(local18);
		}
		@Pc(35) boolean local35 = true;
		if (local8.anInt3446 != 0) {
			local35 = Static30.method718(local8);
		}
		if (!local35 || !Static44.method1079(local8).method5748(arg0 - 1)) {
			return;
		}
		if (arg0 == 1) {
			Static280.method5009(Static168.aClass18_114);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 2) {
			Static280.method5009(Static167.aClass18_111);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 3) {
			Static280.method5009(Static180.aClass18_119);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 4) {
			Static280.method5009(Static324.aClass18_208);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 5) {
			Static280.method5009(Static26.aClass18_25);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 6) {
			Static280.method5009(Static333.aClass18_212);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 7) {
			Static280.method5009(Static281.aClass18_184);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 8) {
			Static280.method5009(Static314.aClass18_202);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 9) {
			Static280.method5009(Static243.aClass18_168);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
		if (arg0 == 10) {
			Static280.method5009(Static142.aClass18_102);
			Static353.method5812(arg1, arg2, local8.anInt3451);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!ct;I)V")
	public static void method2859(@OriginalArg(0) Class30 arg0) {
		Static139.anInt3008 = 0;
		Static263.anInt5202 = 0;
		Static185.aClass195_5 = new Class195();
		Static324.aClass32_Sub3_Sub1_Sub1Array2 = new Class32_Sub3_Sub1_Sub1[1024];
		Static102.method6046(arg0);
		Static101.method2228(arg0);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZ)V")
	public static void method2860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub4_Sub17 local13 = Static132.method2717(arg1, 12);
		local13.method3480();
		local13.anInt3727 = arg0;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ZII)I")
	public static int method2862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(30) int local30 = (local7 * (arg1 & 0xFF00FF) & 0xFF00FF00 | (arg1 & 0xFF00) * local7 & 0xFF0000) >>> 8;
		@Pc(35) int local35 = 255 - local7;
		return ((local35 * (arg0 & 0xFF00FF) & 0xFF00FF00 | (arg0 & 0xFF00) * local35 & 0xFF0000) >>> 8) + local30;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLjava/lang/String;II[B)I")
	public static int method2863(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) byte[] arg3) {
		@Pc(15) int local15 = arg2;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(25) char local25 = arg1.charAt(local17);
			if (local25 > '\u0000' && local25 < '\u0080' || !(local25 < ' ' || local25 > 'ÿ')) {
				arg3[local17 + arg0] = (byte) local25;
			} else if (local25 == '€') {
				arg3[local17 + arg0] = -128;
			} else if (local25 == '‚') {
				arg3[arg0 + local17] = -126;
			} else if (local25 == 'ƒ') {
				arg3[local17 + arg0] = -125;
			} else if (local25 == '„') {
				arg3[arg0 + local17] = -124;
			} else if (local25 == '…') {
				arg3[arg0 + local17] = -123;
			} else if (local25 == '†') {
				arg3[arg0 + local17] = -122;
			} else if (local25 == '‡') {
				arg3[arg0 + local17] = -121;
			} else if (local25 == 'ˆ') {
				arg3[local17 + arg0] = -120;
			} else if (local25 == '‰') {
				arg3[local17 + arg0] = -119;
			} else if (local25 == 'Š') {
				arg3[local17 + arg0] = -118;
			} else if (local25 == '‹') {
				arg3[arg0 + local17] = -117;
			} else if (local25 == 'Œ') {
				arg3[arg0 + local17] = -116;
			} else if (local25 == 'Ž') {
				arg3[local17 + arg0] = -114;
			} else if (local25 == '‘') {
				arg3[local17 + arg0] = -111;
			} else if (local25 == '’') {
				arg3[arg0 + local17] = -110;
			} else if (local25 == '“') {
				arg3[local17 + arg0] = -109;
			} else if (local25 == '”') {
				arg3[local17 + arg0] = -108;
			} else if (local25 == '•') {
				arg3[arg0 + local17] = -107;
			} else if (local25 == '–') {
				arg3[arg0 + local17] = -106;
			} else if (local25 == '—') {
				arg3[local17 + arg0] = -105;
			} else if (local25 == '˜') {
				arg3[arg0 + local17] = -104;
			} else if (local25 == '™') {
				arg3[local17 + arg0] = -103;
			} else if (local25 == 'š') {
				arg3[local17 + arg0] = -102;
			} else if (local25 == '›') {
				arg3[arg0 + local17] = -101;
			} else if (local25 == 'œ') {
				arg3[arg0 + local17] = -100;
			} else if (local25 == 'ž') {
				arg3[local17 + arg0] = -98;
			} else if (local25 == 'Ÿ') {
				arg3[arg0 + local17] = -97;
			} else {
				arg3[local17 + arg0] = 63;
			}
		}
		return local15;
	}
}
