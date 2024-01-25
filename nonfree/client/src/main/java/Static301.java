import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
	public static int anInt5506;

	@OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
	public static int anInt5507;

	@OriginalMember(owner = "client!pc", name = "d", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_180 = new Class92(55, 4);

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_180 = new Class175("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!jt;Lclient!qt;Lclient!mv;IIIII)V")
	public static void method4446(@OriginalArg(0) Class128 arg0, @OriginalArg(1) Class1_Sub3_Sub3_Sub2 arg1, @OriginalArg(2) Class1_Sub3_Sub3_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class3_Sub36 local12 = new Class3_Sub36();
		local12.anInt6171 = arg3 << 7;
		local12.anInt6180 = arg6 << 7;
		local12.anInt6170 = arg5;
		if (arg0 != null) {
			local12.aClass128_1 = arg0;
			@Pc(33) int local33 = arg0.anInt4004;
			@Pc(36) int local36 = arg0.anInt4036;
			if (arg4 == 1 || arg4 == 3) {
				local33 = arg0.anInt4036;
				local36 = arg0.anInt4004;
			}
			local12.anInt6178 = arg0.anInt4043;
			local12.anInt6165 = arg3 + local33 << 7;
			local12.anIntArray455 = arg0.anIntArray305;
			local12.anInt6176 = arg0.anInt4041;
			local12.anInt6169 = arg0.anInt4026 << 7;
			local12.anInt6172 = local36 + arg6 << 7;
			local12.anInt6166 = arg0.anInt4012;
			local12.anInt6179 = arg0.anInt4046;
			if (arg0.anIntArray307 != null) {
				local12.aBoolean431 = true;
				local12.method4863();
			}
			if (local12.anIntArray455 != null) {
				local12.anInt6167 = (int) (Math.random() * (double) (local12.anInt6179 - local12.anInt6178)) + local12.anInt6178;
			}
			Static455.aClass229_37.method5321(local12);
		} else if (arg1 != null) {
			local12.aClass1_Sub3_Sub3_Sub2_1 = arg1;
			@Pc(187) Class47 local187 = arg1.aClass47_1;
			if (local187.anIntArray134 != null) {
				local12.aBoolean431 = true;
				local187 = local187.method1296(Static369.aClass11_1);
			}
			if (local187 != null) {
				local12.anInt6165 = arg3 + local187.anInt1578 << 7;
				local12.anInt6172 = arg6 + local187.anInt1578 << 7;
				local12.anInt6176 = Static133.method2297(arg1);
				local12.anInt6166 = local187.anInt1584;
				local12.anInt6169 = local187.anInt1570 << 7;
			}
			Static437.aClass229_47.method5321(local12);
		} else if (arg2 != null) {
			local12.aClass1_Sub3_Sub3_Sub1_3 = arg2;
			local12.anInt6165 = arg3 + arg2.method4831() << 7;
			local12.anInt6172 = arg2.method4831() + arg6 << 7;
			local12.anInt6176 = Static151.method2693(arg2);
			local12.anInt6169 = arg2.anInt4904 << 7;
			local12.anInt6166 = arg2.anInt4896;
			Static222.aClass127_23.method3257((long) arg2.anInt6066, local12);
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZI)V")
	public static void method4448(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub3_Sub7 local12 = Static139.method2522(1, arg0);
		local12.method1570();
		local12.anInt1933 = arg1;
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!wt;Z)Z")
	public static boolean method4449(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub2 arg1) {
		@Pc(8) int local8 = arg1.method6057(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(102) int local102;
		@Pc(106) int local106;
		@Pc(112) int local112;
		if (local8 == 0) {
			if (arg1.method6057(1) != 0) {
				method4449(arg0, arg1);
			}
			local31 = arg1.method6057(6);
			local36 = arg1.method6057(6);
			@Pc(46) boolean local46 = arg1.method6057(1) == 1;
			if (local46) {
				Static412.anIntArray499[Static442.anInt7517++] = arg0;
			}
			if (Static308.aClass1_Sub3_Sub3_Sub1Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(69) Class239 local69 = Static405.aClass239Array1[arg0];
			@Pc(77) Class1_Sub3_Sub3_Sub1 local77 = Static308.aClass1_Sub3_Sub3_Sub1Array1[arg0] = new Class1_Sub3_Sub3_Sub1();
			local77.anInt6066 = arg0;
			if (Static319.aClass3_Sub2Array1[arg0] != null) {
				local77.method3934(Static319.aClass3_Sub2Array1[arg0]);
			}
			local77.method4833(local69.anInt7069);
			local77.anInt6102 = local69.anInt7064;
			local102 = local69.anInt7065;
			local106 = local102 >> 28;
			local112 = local102 >> 14 & 0xFF;
			local77.aBoolean364 = local69.aBoolean493;
			@Pc(120) int local120 = local102 & 0xFF;
			local77.aByteArray69[0] = Static365.aByteArray71[arg0];
			local77.aByte77 = (byte) local106;
			local77.method3933((local112 << 6) + local31 - Static108.anInt3458, -Static339.anInt6223 + ((local120 << 6) - -local36));
			local77.aBoolean365 = false;
			Static405.aClass239Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg1.method6057(2);
			local36 = Static405.aClass239Array1[arg0].anInt7065;
			Static405.aClass239Array1[arg0].anInt7065 = (local36 & 0xFFFFFFF) + (((local36 >> 28) + local31 & 0x3) << 28);
			return false;
		} else {
			@Pc(210) int local210;
			@Pc(215) int local215;
			@Pc(223) int local223;
			if (local8 != 2) {
				local31 = arg1.method6057(18);
				local36 = local31 >> 16;
				local210 = local31 >> 8 & 0xFF;
				local215 = local31 & 0xFF;
				local223 = Static405.aClass239Array1[arg0].anInt7065;
				local102 = (local223 >> 28) + local36 & 0x3;
				local106 = local210 + (local223 >> 14) & 0xFF;
				local112 = local215 + local223 & 0xFF;
				Static405.aClass239Array1[arg0].anInt7065 = (local106 << 14) + (local102 << 28) + local112;
				return false;
			}
			local31 = arg1.method6057(5);
			local36 = local31 >> 3;
			local210 = local31 & 0x7;
			local215 = Static405.aClass239Array1[arg0].anInt7065;
			local223 = local36 + (local215 >> 28) & 0x3;
			local102 = local215 >> 14 & 0xFF;
			local106 = local215 & 0xFF;
			if (local210 == 0) {
				local106--;
				local102--;
			}
			if (local210 == 1) {
				local106--;
			}
			if (local210 == 2) {
				local102++;
				local106--;
			}
			if (local210 == 3) {
				local102--;
			}
			if (local210 == 4) {
				local102++;
			}
			if (local210 == 5) {
				local102--;
				local106++;
			}
			if (local210 == 6) {
				local106++;
			}
			if (local210 == 7) {
				local106++;
				local102++;
			}
			Static405.aClass239Array1[arg0].anInt7065 = local106 + (local223 << 28) + (local102 << 14);
			return false;
		}
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
	public static void method4450() {
		if (Static168.anIntArray264 != null) {
			return;
		}
		Static168.anIntArray264 = new int[65536];
		@Pc(17) double local17 = Math.random() * 0.03D + 0.7D - 0.015D;
		for (@Pc(26) int local26 = 0; local26 < 65536; local26++) {
			@Pc(38) double local38 = (double) (local26 >> 10 & 0x3F) / 64.0D + 0.0078125D;
			@Pc(49) double local49 = (double) (local26 >> 7 & 0x7) / 8.0D + 0.0625D;
			@Pc(56) double local56 = (double) (local26 & 0x7F) / 128.0D;
			@Pc(58) double local58 = local56;
			@Pc(60) double local60 = local56;
			@Pc(62) double local62 = local56;
			if (local49 != 0.0D) {
				@Pc(76) double local76;
				if (local56 < 0.5D) {
					local76 = (local49 + 1.0D) * local56;
				} else {
					local76 = local56 + local49 - local49 * local56;
				}
				@Pc(93) double local93 = local56 * 2.0D - local76;
				@Pc(97) double local97 = local38 + 0.3333333333333333D;
				if (local97 > 1.0D) {
					local97--;
				}
				@Pc(111) double local111 = local38 - 0.3333333333333333D;
				if (local97 * 6.0D < 1.0D) {
					local58 = (local76 - local93) * 6.0D * local97 + local93;
				} else if (local97 * 2.0D < 1.0D) {
					local58 = local76;
				} else if (local97 * 3.0D < 2.0D) {
					local58 = local93 + (local76 - local93) * (0.6666666666666666D - local97) * 6.0D;
				} else {
					local58 = local93;
				}
				if (local111 < 0.0D) {
					local111++;
				}
				if (local38 * 6.0D < 1.0D) {
					local60 = local38 * 6.0D * (local76 - local93) + local93;
				} else if (local38 * 2.0D < 1.0D) {
					local60 = local76;
				} else if (local38 * 3.0D < 2.0D) {
					local60 = (local76 - local93) * 6.0D * (0.6666666666666666D - local38) + local93;
				} else {
					local60 = local93;
				}
				if (local111 * 6.0D < 1.0D) {
					local62 = (local76 - local93) * 6.0D * local111 + local93;
				} else if (local111 * 2.0D < 1.0D) {
					local62 = local76;
				} else if (local111 * 3.0D < 2.0D) {
					local62 = (local76 - local93) * (0.6666666666666666D - local111) * 6.0D + local93;
				} else {
					local62 = local93;
				}
			}
			local58 = Math.pow(local58, local17);
			local60 = Math.pow(local60, local17);
			local62 = Math.pow(local62, local17);
			@Pc(280) int local280 = (int) (local58 * 256.0D);
			@Pc(285) int local285 = (int) (local60 * 256.0D);
			@Pc(290) int local290 = (int) (local62 * 256.0D);
			@Pc(300) int local300 = local290 + (local285 << 8) + (local280 << 16);
			Static168.anIntArray264[local26] = local300;
		}
	}
}
