import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!paa")
public final class Class166_Sub3 extends Class166 {

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
	private int anInt7801;

	@OriginalMember(owner = "client!paa", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!paa", name = "B", descriptor = "S")
	private short aShort88;

	@OriginalMember(owner = "client!paa", name = "C", descriptor = "[Lclient!eca;")
	private Class87[] aClass87Array5;

	@OriginalMember(owner = "client!paa", name = "D", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!paa", name = "E", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!paa", name = "F", descriptor = "S")
	private short aShort89;

	@OriginalMember(owner = "client!paa", name = "N", descriptor = "[F")
	private float[] aFloatArray68;

	@OriginalMember(owner = "client!paa", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!paa", name = "P", descriptor = "Lclient!hca;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!paa", name = "R", descriptor = "I")
	private int anInt7811;

	@OriginalMember(owner = "client!paa", name = "U", descriptor = "S")
	private short aShort90;

	@OriginalMember(owner = "client!paa", name = "Z", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!paa", name = "bb", descriptor = "[S")
	private short[] aShortArray106;

	@OriginalMember(owner = "client!paa", name = "gb", descriptor = "[F")
	private float[] aFloatArray69;

	@OriginalMember(owner = "client!paa", name = "hb", descriptor = "Lclient!oba;")
	private Class235 aClass235_1;

	@OriginalMember(owner = "client!paa", name = "ib", descriptor = "[S")
	private short[] aShortArray107;

	@OriginalMember(owner = "client!paa", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!paa", name = "ob", descriptor = "[S")
	private short[] aShortArray108;

	@OriginalMember(owner = "client!paa", name = "pb", descriptor = "[S")
	private short[] aShortArray109;

	@OriginalMember(owner = "client!paa", name = "qb", descriptor = "B")
	private byte aByte114;

	@OriginalMember(owner = "client!paa", name = "sb", descriptor = "[S")
	private short[] aShortArray110;

	@OriginalMember(owner = "client!paa", name = "vb", descriptor = "S")
	private short aShort91;

	@OriginalMember(owner = "client!paa", name = "Ab", descriptor = "S")
	private short aShort92;

	@OriginalMember(owner = "client!paa", name = "Bb", descriptor = "[S")
	private short[] aShortArray111;

	@OriginalMember(owner = "client!paa", name = "Cb", descriptor = "[I")
	private int[] anIntArray501;

	@OriginalMember(owner = "client!paa", name = "Db", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!paa", name = "Fb", descriptor = "[Lclient!iq;")
	private Class159[] aClass159Array1;

	@OriginalMember(owner = "client!paa", name = "Kb", descriptor = "[S")
	private short[] aShortArray112;

	@OriginalMember(owner = "client!paa", name = "Rb", descriptor = "[S")
	private short[] aShortArray113;

	@OriginalMember(owner = "client!paa", name = "ac", descriptor = "S")
	private short aShort93;

	@OriginalMember(owner = "client!paa", name = "ec", descriptor = "[Lclient!nea;")
	private Class219[] aClass219Array1;

	@OriginalMember(owner = "client!paa", name = "jc", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!paa", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!paa", name = "mc", descriptor = "S")
	private short aShort94;

	@OriginalMember(owner = "client!paa", name = "rc", descriptor = "S")
	private short aShort95;

	@OriginalMember(owner = "client!paa", name = "xc", descriptor = "[Lclient!nn;")
	private Class227[] aClass227Array5;

	@OriginalMember(owner = "client!paa", name = "Bc", descriptor = "[I")
	private int[] anIntArray503;

	@OriginalMember(owner = "client!paa", name = "Cc", descriptor = "S")
	private short aShort96;

	@OriginalMember(owner = "client!paa", name = "Dc", descriptor = "S")
	private short aShort97;

	@OriginalMember(owner = "client!paa", name = "Ec", descriptor = "Lclient!ni;")
	private Interface18 anInterface18_1;

	@OriginalMember(owner = "client!paa", name = "Fc", descriptor = "I")
	private int anInt7862;

	@OriginalMember(owner = "client!paa", name = "Gc", descriptor = "[S")
	private short[] aShortArray114;

	@OriginalMember(owner = "client!paa", name = "y", descriptor = "I")
	private int anInt7802 = 0;

	@OriginalMember(owner = "client!paa", name = "Q", descriptor = "Z")
	private boolean aBoolean561 = true;

	@OriginalMember(owner = "client!paa", name = "Eb", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!paa", name = "o", descriptor = "Z")
	private boolean aBoolean560 = false;

	@OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
	private int anInt7794 = 0;

	@OriginalMember(owner = "client!paa", name = "pc", descriptor = "I")
	private int anInt7853 = 0;

	@OriginalMember(owner = "client!paa", name = "S", descriptor = "I")
	private int anInt7812 = 0;

	@OriginalMember(owner = "client!paa", name = "zc", descriptor = "I")
	private int anInt7860 = 0;

	@OriginalMember(owner = "client!paa", name = "vc", descriptor = "Z")
	private boolean aBoolean564 = false;

	@OriginalMember(owner = "client!paa", name = "Hb", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_27;

	@OriginalMember(owner = "client!paa", name = "Ob", descriptor = "Lclient!nh;")
	private Class223 aClass223_7;

	@OriginalMember(owner = "client!paa", name = "dc", descriptor = "Lclient!nh;")
	private Class223 aClass223_9;

	@OriginalMember(owner = "client!paa", name = "Y", descriptor = "Lclient!nh;")
	private Class223 aClass223_6;

	@OriginalMember(owner = "client!paa", name = "Tb", descriptor = "Lclient!nh;")
	private Class223 aClass223_8;

	@OriginalMember(owner = "client!paa", name = "kb", descriptor = "Lclient!us;")
	private Class348 aClass348_1;

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class166_Sub3(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aClass20_Sub3_27 = arg0;
		this.aClass223_7 = new Class223(null, 5126, 3, 0);
		this.aClass223_9 = new Class223(null, 5126, 2, 0);
		this.aClass223_6 = new Class223(null, 5126, 3, 0);
		this.aClass223_8 = new Class223(null, 5121, 4, 0);
		this.aClass348_1 = new Class348();
	}

	@OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Lclient!qo;Lclient!bh;IIII)V")
	public Class166_Sub3(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7811 = arg5;
		this.anInt7862 = arg2;
		this.aClass20_Sub3_27 = arg0;
		if (Static279.method6686(arg2, arg5)) {
			this.aClass223_7 = new Class223(null, 5126, 3, 0);
		}
		if (Static385.method6307(arg5, arg2)) {
			this.aClass223_9 = new Class223(null, 5126, 2, 0);
		}
		if (Static363.method6138(arg5, arg2)) {
			this.aClass223_6 = new Class223(null, 5126, 3, 0);
		}
		if (Static44.method1646(arg5, arg2)) {
			this.aClass223_8 = new Class223(null, 5121, 4, 0);
		}
		if (Static408.method6621(arg2, arg5)) {
			this.aClass348_1 = new Class348();
		}
		@Pc(108) Interface4 local108 = arg0.anInterface4_12;
		this.anIntArray499 = new int[arg1.anInt1673 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt1670];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt1670; local121++) {
			if (arg1.aByteArray25 == null || arg1.aByteArray25[local121] != 2) {
				if (arg1.aShortArray11 != null && arg1.aShortArray11[local121] != -1) {
					@Pc(151) Class127 local151 = local108.method8048(arg1.aShortArray11[local121] & 0xFFFF);
					if (((this.anInt7811 & 0x40) == 0 || !local151.aBoolean338) && local151.aBoolean336) {
						continue;
					}
				}
				local119[this.anInt7853++] = local121;
				this.anIntArray499[arg1.aShortArray20[local121]]++;
				this.anIntArray499[arg1.aShortArray14[local121]]++;
				this.anIntArray499[arg1.aShortArray17[local121]]++;
			}
		}
		this.anInt7802 = this.anInt7853;
		@Pc(227) long[] local227 = new long[this.anInt7853];
		@Pc(236) boolean local236 = (this.anInt7862 & 0x100) != 0;
		@Pc(248) int local248;
		@Pc(261) int local261;
		@Pc(436) int local436;
		for (@Pc(238) int local238 = 0; local238 < this.anInt7853; local238++) {
			@Pc(244) int local244 = local119[local238];
			@Pc(246) Class127 local246 = null;
			local248 = 0;
			@Pc(250) byte local250 = 0;
			@Pc(252) byte local252 = 0;
			@Pc(254) byte local254 = 0;
			if (arg1.aClass256Array1 != null) {
				@Pc(259) boolean local259 = false;
				for (local261 = 0; local261 < arg1.aClass256Array1.length; local261++) {
					@Pc(268) Class256 local268 = arg1.aClass256Array1[local261];
					if (local244 == local268.anInt7920) {
						@Pc(277) Class280 local277 = Static298.method5320(local268.anInt7918);
						if (local277.aBoolean606) {
							local259 = true;
						}
						if (local277.anInt8471 != -1) {
							@Pc(292) Class127 local292 = local108.method8048(local277.anInt8471);
							if (local292.anInt4659 == 2) {
								this.aBoolean562 = true;
							}
						}
					}
				}
				if (local259) {
					local227[local238] = Long.MAX_VALUE;
					this.anInt7802--;
					continue;
				}
			}
			@Pc(323) short local323 = -1;
			if (arg1.aShortArray11 != null) {
				local323 = arg1.aShortArray11[local244];
				if (local323 != -1) {
					local246 = local108.method8048(local323 & 0xFFFF);
					if ((this.anInt7811 & 0x40) != 0 && local246.aBoolean338) {
						local323 = -1;
						local246 = null;
					} else {
						local254 = local246.aByte75;
						if (local246.aByte73 != 0 || local246.aByte77 != 0) {
							this.aBoolean564 = true;
						}
						local252 = local246.aByte78;
					}
				}
			}
			@Pc(392) boolean local392 = arg1.aByteArray23 != null && arg1.aByteArray23[local244] != 0 || local246 != null && local246.anInt4659 != 0;
			if ((local236 || local392) && arg1.aByteArray24 != null) {
				local248 += arg1.aByteArray24[local244] << 17;
			}
			if (local392) {
				local248 += 65536;
			}
			local248 += (local252 & 0xFF) << 8;
			local248 += local254 & 0xFF;
			local436 = local250 + ((local323 & 0xFFFF) << 16);
			@Pc(442) int local442 = local436 + (local238 & 0xFFFF);
			local227[local238] = ((long) local248 << 32) + ((long) local442);
			this.aBoolean564 |= local246 != null && (local246.aByte73 != 0 || local246.aByte77 != 0);
			this.aBoolean562 |= local392;
		}
		Static240.method4485(local119, local227);
		this.anIntArray503 = arg1.anIntArray67;
		this.anIntArray501 = arg1.anIntArray66;
		this.anInt7860 = arg1.anInt1679;
		this.anIntArray500 = arg1.anIntArray64;
		this.aShortArray113 = arg1.aShortArray15;
		this.anInt7812 = arg1.anInt1673;
		this.aClass87Array5 = arg1.aClass87Array1;
		@Pc(519) Class123[] local519 = new Class123[this.anInt7812];
		this.aClass227Array5 = arg1.aClass227Array1;
		@Pc(543) int local543;
		@Pc(557) int local557;
		@Pc(603) int local603;
		if (arg1.aClass256Array1 != null) {
			this.anInt7801 = arg1.aClass256Array1.length;
			this.aClass159Array1 = new Class159[this.anInt7801];
			this.aClass219Array1 = new Class219[this.anInt7801];
			for (local543 = 0; local543 < this.anInt7801; local543++) {
				@Pc(550) Class256 local550 = arg1.aClass256Array1[local543];
				@Pc(555) Class280 local555 = Static298.method5320(local550.anInt7918);
				local557 = -1;
				for (@Pc(559) int local559 = 0; local559 < this.anInt7853; local559++) {
					if (local119[local559] == local550.anInt7920) {
						local557 = local559;
						break;
					}
				}
				if (local557 == -1) {
					throw new RuntimeException();
				}
				local603 = Static195.anIntArray226[arg1.aShortArray19[local550.anInt7920] & 0xFFFF] & 0xFFFFFF;
				@Pc(621) int local621 = local603 | 255 - (arg1.aByteArray23 == null ? 0 : arg1.aByteArray23[local550.anInt7920]) << 24;
				this.aClass219Array1[local543] = new Class219(local557, arg1.aShortArray20[local550.anInt7920], arg1.aShortArray14[local550.anInt7920], arg1.aShortArray17[local550.anInt7920], local555.anInt8472, local555.anInt8474, local555.anInt8471, local555.anInt8476, local555.anInt8477, local555.aBoolean606, local555.aBoolean605, local550.anInt7922);
				this.aClass159Array1[local543] = new Class159(local621);
			}
		}
		local543 = this.anInt7853 * 3;
		this.aShortArray114 = new short[local543];
		Static443.aLongArray16 = new long[local543];
		this.aShortArray112 = new short[this.anInt7853];
		this.aFloatArray69 = new float[local543];
		this.aShortArray105 = new short[local543];
		this.lb = new short[local543];
		this.aByteArray104 = new byte[local543];
		this.aShortArray110 = new short[local543];
		if (arg1.aShortArray18 != null) {
			this.aShortArray107 = new short[this.anInt7853];
		}
		this.aShort89 = (short) arg3;
		this.aShortArray109 = new short[this.anInt7853];
		this.aShortArray108 = new short[this.anInt7853];
		this.aShortArray111 = new short[this.anInt7853];
		this.aShort96 = (short) arg4;
		this.aByteArray103 = new byte[this.anInt7853];
		this.aFloatArray68 = new float[local543];
		this.aShortArray106 = new short[this.anInt7853];
		local248 = 0;
		for (local436 = 0; local436 < arg1.anInt1673; local436++) {
			local557 = this.anIntArray499[local436];
			this.anIntArray499[local436] = local248;
			local519[local436] = new Class123();
			local248 += local557;
		}
		this.anIntArray499[arg1.anInt1673] = local248;
		@Pc(803) Class101 local803 = Static100.method2646(this.anInt7853, arg1, local119);
		@Pc(807) Class91[] local807 = new Class91[arg1.anInt1670];
		@Pc(847) int local847;
		@Pc(858) int local858;
		@Pc(880) int local880;
		@Pc(891) int local891;
		@Pc(900) int local900;
		@Pc(909) int local909;
		@Pc(826) short local826;
		@Pc(837) int local837;
		for (local603 = 0; local603 < arg1.anInt1670; local603++) {
			@Pc(816) short local816 = arg1.aShortArray20[local603];
			@Pc(821) short local821 = arg1.aShortArray14[local603];
			local826 = arg1.aShortArray17[local603];
			local837 = this.anIntArray500[local821] - this.anIntArray500[local816];
			local847 = this.anIntArray501[local821] - this.anIntArray501[local816];
			local858 = this.anIntArray503[local821] - this.anIntArray503[local816];
			@Pc(869) int local869 = this.anIntArray500[local826] - this.anIntArray500[local816];
			local880 = this.anIntArray501[local826] - this.anIntArray501[local816];
			local891 = this.anIntArray503[local826] - this.anIntArray503[local816];
			local900 = local847 * local891 - local880 * local858;
			local909 = local869 * local858 - local891 * local837;
			@Pc(918) int local918 = local880 * local837 - local847 * local869;
			while (local900 > 8192 || local909 > 8192 || local918 > 8192 || local900 < -8192 || local909 < -8192 || local918 < -8192) {
				local900 >>= 0x1;
				local918 >>= 0x1;
				local909 >>= 0x1;
			}
			@Pc(969) int local969 = (int) Math.sqrt((double) (local918 * local918 + local909 * local909 + local900 * local900));
			if (local969 <= 0) {
				local969 = 1;
			}
			local918 = local918 * 256 / local969;
			local900 = local900 * 256 / local969;
			local909 = local909 * 256 / local969;
			@Pc(1004) byte local1004 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local603];
			if (local1004 == 0) {
				@Pc(1010) Class123 local1010 = local519[local816];
				local1010.anInt4505 += local909;
				local1010.anInt4502 += local918;
				local1010.anInt4503++;
				local1010.anInt4504 += local900;
				@Pc(1038) Class123 local1038 = local519[local821];
				local1038.anInt4504 += local900;
				local1038.anInt4505 += local909;
				local1038.anInt4503++;
				local1038.anInt4502 += local918;
				@Pc(1066) Class123 local1066 = local519[local826];
				local1066.anInt4503++;
				local1066.anInt4502 += local918;
				local1066.anInt4505 += local909;
				local1066.anInt4504 += local900;
			} else if (local1004 == 1) {
				@Pc(1103) Class91 local1103 = local807[local603] = new Class91();
				local1103.anInt3208 = local918;
				local1103.anInt3205 = local909;
				local1103.anInt3207 = local900;
			}
		}
		@Pc(1125) int local1125;
		@Pc(1168) short local1168;
		for (local261 = 0; local261 < this.anInt7853; local261++) {
			local1125 = local119[local261];
			@Pc(1132) int local1132 = arg1.aShortArray19[local1125] & 0xFFFF;
			if (arg1.aByteArray20 == null) {
				local837 = -1;
			} else {
				local837 = arg1.aByteArray20[local1125];
			}
			if (arg1.aByteArray23 == null) {
				local847 = 0;
			} else {
				local847 = arg1.aByteArray23[local1125] & 0xFF;
			}
			local1168 = arg1.aShortArray11 == null ? -1 : arg1.aShortArray11[local1125];
			if (local1168 != -1 && (this.anInt7811 & 0x40) != 0) {
				@Pc(1187) Class127 local1187 = local108.method8048(local1168 & 0xFFFF);
				if (local1187.aBoolean338) {
					local1168 = -1;
				}
			}
			@Pc(1194) float local1194 = 0.0F;
			@Pc(1196) float local1196 = 0.0F;
			@Pc(1198) float local1198 = 0.0F;
			@Pc(1200) float local1200 = 0.0F;
			@Pc(1202) float local1202 = 0.0F;
			@Pc(1204) float local1204 = 0.0F;
			@Pc(1206) byte local1206 = 0;
			@Pc(1208) byte local1208 = 0;
			@Pc(1210) int local1210 = 0;
			@Pc(1245) byte local1245;
			@Pc(1265) short local1265;
			@Pc(1270) short local1270;
			@Pc(1275) short local1275;
			if (local1168 != -1) {
				if (local837 == -1) {
					local1200 = 1.0F;
					local1208 = 2;
					local1204 = 0.0F;
					local1206 = 1;
					local1196 = 1.0F;
					local1194 = 0.0F;
					local1202 = 0.0F;
					local1198 = 1.0F;
				} else {
					local837 &= 0xFF;
					local1245 = arg1.aByteArray21[local837];
					@Pc(1255) short local1255;
					@Pc(1260) short local1260;
					@Pc(1298) float local1298;
					@Pc(1306) float local1306;
					@Pc(1314) float local1314;
					@Pc(1401) float local1401;
					@Pc(1410) float local1410;
					@Pc(1419) float local1419;
					@Pc(1428) float local1428;
					@Pc(1437) float local1437;
					@Pc(1446) float local1446;
					if (local1245 == 0) {
						local1255 = arg1.aShortArray20[local1125];
						local1260 = arg1.aShortArray14[local1125];
						local1265 = arg1.aShortArray17[local1125];
						local1270 = arg1.aShortArray13[local837];
						local1275 = arg1.aShortArray16[local837];
						@Pc(1280) short local1280 = arg1.aShortArray12[local837];
						@Pc(1286) float local1286 = (float) arg1.anIntArray64[local1270];
						@Pc(1292) float local1292 = (float) arg1.anIntArray66[local1270];
						local1298 = arg1.anIntArray67[local1270];
						local1306 = (float) arg1.anIntArray64[local1275] - local1286;
						local1314 = (float) arg1.anIntArray66[local1275] - local1292;
						@Pc(1323) float local1323 = (float) arg1.anIntArray67[local1275] - local1298;
						@Pc(1331) float local1331 = (float) arg1.anIntArray64[local1280] - local1286;
						@Pc(1340) float local1340 = (float) arg1.anIntArray66[local1280] - local1292;
						@Pc(1349) float local1349 = (float) arg1.anIntArray67[local1280] - local1298;
						@Pc(1358) float local1358 = (float) arg1.anIntArray64[local1255] - local1286;
						@Pc(1366) float local1366 = (float) arg1.anIntArray66[local1255] - local1292;
						@Pc(1374) float local1374 = (float) arg1.anIntArray67[local1255] - local1298;
						@Pc(1383) float local1383 = (float) arg1.anIntArray64[local1260] - local1286;
						@Pc(1392) float local1392 = (float) arg1.anIntArray66[local1260] - local1292;
						local1401 = (float) arg1.anIntArray67[local1260] - local1298;
						local1410 = (float) arg1.anIntArray64[local1265] - local1286;
						local1419 = (float) arg1.anIntArray66[local1265] - local1292;
						local1428 = (float) arg1.anIntArray67[local1265] - local1298;
						local1437 = local1314 * local1349 - local1323 * local1340;
						local1446 = local1331 * local1323 - local1349 * local1306;
						@Pc(1454) float local1454 = local1340 * local1306 - local1331 * local1314;
						@Pc(1463) float local1463 = local1454 * local1340 - local1349 * local1446;
						@Pc(1472) float local1472 = local1349 * local1437 - local1331 * local1454;
						@Pc(1480) float local1480 = local1446 * local1331 - local1340 * local1437;
						@Pc(1494) float local1494 = 1.0F / (local1323 * local1480 + local1314 * local1472 + local1463 * local1306);
						local1202 = local1494 * (local1410 * local1463 + local1472 * local1419 + local1428 * local1480);
						local1194 = local1494 * (local1463 * local1358 + local1472 * local1366 + local1480 * local1374);
						local1198 = local1494 * (local1401 * local1480 + local1383 * local1463 + local1472 * local1392);
						@Pc(1545) float local1545 = local1306 * local1446 - local1437 * local1314;
						@Pc(1553) float local1553 = local1314 * local1454 - local1446 * local1323;
						@Pc(1561) float local1561 = local1323 * local1437 - local1454 * local1306;
						@Pc(1575) float local1575 = 1.0F / (local1349 * local1545 + local1331 * local1553 + local1561 * local1340);
						local1200 = (local1383 * local1553 + local1561 * local1392 + local1545 * local1401) * local1575;
						local1196 = (local1545 * local1374 + local1561 * local1366 + local1358 * local1553) * local1575;
						local1204 = (local1561 * local1419 + local1553 * local1410 + local1428 * local1545) * local1575;
					} else {
						local1255 = arg1.aShortArray20[local1125];
						local1260 = arg1.aShortArray14[local1125];
						local1265 = arg1.aShortArray17[local1125];
						@Pc(1639) int local1639 = local803.anIntArray170[local837];
						@Pc(1644) int local1644 = local803.anIntArray169[local837];
						@Pc(1649) int local1649 = local803.anIntArray168[local837];
						@Pc(1654) float[] local1654 = local803.aFloatArrayArray6[local837];
						@Pc(1659) byte local1659 = arg1.aByteArray26[local837];
						local1298 = (float) arg1.anIntArray71[local837] / 256.0F;
						if (local1245 == 1) {
							local1306 = (float) arg1.anIntArray65[local837] / 1024.0F;
							Static58.method8948(local1649, arg1.anIntArray67[local1255], local1659, arg1.anIntArray64[local1255], Static403.aFloatArray65, arg1.anIntArray66[local1255], local1298, local1644, local1639, local1306, local1654);
							local1194 = Static403.aFloatArray65[0];
							local1196 = Static403.aFloatArray65[1];
							Static58.method8948(local1649, arg1.anIntArray67[local1260], local1659, arg1.anIntArray64[local1260], Static403.aFloatArray65, arg1.anIntArray66[local1260], local1298, local1644, local1639, local1306, local1654);
							local1198 = Static403.aFloatArray65[0];
							local1200 = Static403.aFloatArray65[1];
							Static58.method8948(local1649, arg1.anIntArray67[local1265], local1659, arg1.anIntArray64[local1265], Static403.aFloatArray65, arg1.anIntArray66[local1265], local1298, local1644, local1639, local1306, local1654);
							local1202 = Static403.aFloatArray65[0];
							local1204 = Static403.aFloatArray65[1];
							local1314 = local1306 / 2.0F;
							if ((local1659 & 0x1) == 0) {
								if (local1314 < local1202 - local1194) {
									local1202 -= local1306;
									local1208 = 1;
								} else if (local1314 < local1194 - local1202) {
									local1202 += local1306;
									local1208 = 2;
								}
								if (local1198 - local1194 > local1314) {
									local1206 = 1;
									local1198 -= local1306;
								} else if (local1194 - local1198 > local1314) {
									local1206 = 2;
									local1198 += local1306;
								}
							} else {
								if (local1200 - local1196 > local1314) {
									local1200 -= local1306;
									local1206 = 1;
								} else if (local1196 - local1200 > local1314) {
									local1206 = 2;
									local1200 += local1306;
								}
								if (local1314 < local1204 - local1196) {
									local1208 = 1;
									local1204 -= local1306;
								} else if (local1196 - local1204 > local1314) {
									local1208 = 2;
									local1204 += local1306;
								}
							}
						} else if (local1245 == 2) {
							local1306 = (float) arg1.anIntArray68[local837] / 256.0F;
							local1314 = (float) arg1.anIntArray70[local837] / 256.0F;
							@Pc(1912) int local1912 = arg1.anIntArray64[local1260] - arg1.anIntArray64[local1255];
							@Pc(1923) int local1923 = arg1.anIntArray66[local1260] - arg1.anIntArray66[local1255];
							@Pc(1934) int local1934 = arg1.anIntArray67[local1260] - arg1.anIntArray67[local1255];
							@Pc(1944) int local1944 = arg1.anIntArray64[local1265] - arg1.anIntArray64[local1255];
							@Pc(1955) int local1955 = arg1.anIntArray66[local1265] - arg1.anIntArray66[local1255];
							@Pc(1966) int local1966 = arg1.anIntArray67[local1265] - arg1.anIntArray67[local1255];
							@Pc(1975) int local1975 = local1923 * local1966 - local1934 * local1955;
							@Pc(1984) int local1984 = local1944 * local1934 - local1966 * local1912;
							@Pc(1993) int local1993 = local1955 * local1912 - local1944 * local1923;
							local1401 = 64.0F / (float) arg1.anIntArray69[local837];
							local1410 = 64.0F / (float) arg1.anIntArray62[local837];
							local1419 = 64.0F / (float) arg1.anIntArray65[local837];
							local1428 = (local1654[2] * (float) local1993 + (float) local1984 * local1654[1] + (float) local1975 * local1654[0]) / local1401;
							local1437 = (local1654[5] * (float) local1993 + (float) local1984 * local1654[4] + local1654[3] * (float) local1975) / local1410;
							local1446 = ((float) local1993 * local1654[8] + local1654[7] * (float) local1984 + (float) local1975 * local1654[6]) / local1419;
							local1210 = Static102.method2662(local1437, local1446, local1428);
							Static571.method8520(local1314, local1298, local1654, arg1.anIntArray67[local1255], local1649, local1659, local1639, arg1.anIntArray64[local1255], arg1.anIntArray66[local1255], local1306, Static403.aFloatArray65, local1644, local1210);
							local1196 = Static403.aFloatArray65[1];
							local1194 = Static403.aFloatArray65[0];
							Static571.method8520(local1314, local1298, local1654, arg1.anIntArray67[local1260], local1649, local1659, local1639, arg1.anIntArray64[local1260], arg1.anIntArray66[local1260], local1306, Static403.aFloatArray65, local1644, local1210);
							local1200 = Static403.aFloatArray65[1];
							local1198 = Static403.aFloatArray65[0];
							Static571.method8520(local1314, local1298, local1654, arg1.anIntArray67[local1265], local1649, local1659, local1639, arg1.anIntArray64[local1265], arg1.anIntArray66[local1265], local1306, Static403.aFloatArray65, local1644, local1210);
							local1202 = Static403.aFloatArray65[0];
							local1204 = Static403.aFloatArray65[1];
						} else if (local1245 == 3) {
							Static446.method7026(local1649, local1659, local1298, arg1.anIntArray64[local1255], Static403.aFloatArray65, arg1.anIntArray67[local1255], local1639, arg1.anIntArray66[local1255], local1644, local1654);
							local1196 = Static403.aFloatArray65[1];
							local1194 = Static403.aFloatArray65[0];
							Static446.method7026(local1649, local1659, local1298, arg1.anIntArray64[local1260], Static403.aFloatArray65, arg1.anIntArray67[local1260], local1639, arg1.anIntArray66[local1260], local1644, local1654);
							local1198 = Static403.aFloatArray65[0];
							local1200 = Static403.aFloatArray65[1];
							Static446.method7026(local1649, local1659, local1298, arg1.anIntArray64[local1265], Static403.aFloatArray65, arg1.anIntArray67[local1265], local1639, arg1.anIntArray66[local1265], local1644, local1654);
							local1204 = Static403.aFloatArray65[1];
							local1202 = Static403.aFloatArray65[0];
							if ((local1659 & 0x1) == 0) {
								if (local1202 - local1194 > 0.5F) {
									local1208 = 1;
									local1202--;
								} else if (local1194 - local1202 > 0.5F) {
									local1208 = 2;
									local1202++;
								}
								if (local1198 - local1194 > 0.5F) {
									local1206 = 1;
									local1198--;
								} else if (local1194 - local1198 > 0.5F) {
									local1206 = 2;
									local1198++;
								}
							} else {
								if (local1200 - local1196 > 0.5F) {
									local1206 = 1;
									local1200--;
								} else if (local1196 - local1200 > 0.5F) {
									local1200++;
									local1206 = 2;
								}
								if (local1204 - local1196 > 0.5F) {
									local1204--;
									local1208 = 1;
								} else if (local1196 - local1204 > 0.5F) {
									local1208 = 2;
									local1204++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1245 = 0;
			} else {
				local1245 = arg1.aByteArray25[local1125];
			}
			if (local1245 == 0) {
				@Pc(2565) long local2565 = ((long) (local1132 << 8) + (long) (local1210 << 24) + (long) local847 << 32) + (long) (local837 << 2);
				local1265 = arg1.aShortArray20[local1125];
				local1270 = arg1.aShortArray14[local1125];
				local1275 = arg1.aShortArray17[local1125];
				@Pc(2584) Class123 local2584 = local519[local1265];
				this.aShortArray111[local261] = this.method6705(local2584.anInt4505, local2584.anInt4502, local2565, local2584.anInt4504, arg1, local2584.anInt4503, local1194, local1265, local1196);
				@Pc(2608) Class123 local2608 = local519[local1270];
				this.aShortArray108[local261] = this.method6705(local2608.anInt4505, local2608.anInt4502, (long) local1206 + local2565, local2608.anInt4504, arg1, local2608.anInt4503, local1198, local1270, local1200);
				@Pc(2635) Class123 local2635 = local519[local1275];
				this.aShortArray106[local261] = this.method6705(local2635.anInt4505, local2635.anInt4502, local2565 + (long) local1208, local2635.anInt4504, arg1, local2635.anInt4503, local1202, local1275, local1204);
			} else if (local1245 == 1) {
				@Pc(2429) Class91 local2429 = local807[local1125];
				@Pc(2471) long local2471 = ((long) (local1132 << 8) + (long) (local1210 << 24) + (long) local847 << 32) + (long) ((local2429.anInt3207 > 0 ? 1024 : 2048) + (local837 << 2) + (local2429.anInt3205 + 256 << 12) + (local2429.anInt3208 + 256 << 22));
				this.aShortArray111[local261] = this.method6705(local2429.anInt3205, local2429.anInt3208, local2471, local2429.anInt3207, arg1, 0, local1194, arg1.aShortArray20[local1125], local1196);
				this.aShortArray108[local261] = this.method6705(local2429.anInt3205, local2429.anInt3208, local2471 + (long) local1206, local2429.anInt3207, arg1, 0, local1198, arg1.aShortArray14[local1125], local1200);
				this.aShortArray106[local261] = this.method6705(local2429.anInt3205, local2429.anInt3208, local2471 + (long) local1208, local2429.anInt3207, arg1, 0, local1202, arg1.aShortArray17[local1125], local1204);
			}
			if (arg1.aByteArray23 != null) {
				this.aByteArray103[local261] = arg1.aByteArray23[local1125];
			}
			if (arg1.aShortArray18 != null) {
				this.aShortArray107[local261] = arg1.aShortArray18[local1125];
			}
			this.aShortArray109[local261] = arg1.aShortArray19[local1125];
			this.aShortArray112[local261] = local1168;
		}
		local1125 = 0;
		local826 = -10000;
		for (local837 = 0; local837 < this.anInt7802; local837++) {
			@Pc(2711) short local2711 = this.aShortArray112[local837];
			if (local826 != local2711) {
				local1125++;
				local826 = local2711;
			}
		}
		this.anIntArray502 = new int[local1125 + 1];
		local1125 = 0;
		local826 = -10000;
		for (local847 = 0; local847 < this.anInt7802; local847++) {
			local1168 = this.aShortArray112[local847];
			if (local826 != local1168) {
				this.anIntArray502[local1125++] = local847;
				local826 = local1168;
			}
		}
		this.anIntArray502[local1125] = this.anInt7802;
		Static443.aLongArray16 = null;
		this.aShortArray105 = Static643.method9229(this.aShortArray105, this.anInt7794);
		this.aShortArray110 = Static643.method9229(this.aShortArray110, this.anInt7794);
		this.lb = Static643.method9229(this.lb, this.anInt7794);
		this.aByteArray104 = Static334.method5735(this.anInt7794, this.aByteArray104);
		this.aFloatArray68 = Static519.method7862(this.anInt7794, this.aFloatArray68);
		this.aFloatArray69 = Static519.method7862(this.anInt7794, this.aFloatArray69);
		if (arg1.anIntArray72 != null && Static69.method2113(this.anInt7811, arg2)) {
			this.anIntArrayArray41 = arg1.method1600(false);
		}
		if (arg1.aClass256Array1 != null && Static517.method7857(arg2, this.anInt7811)) {
			this.anIntArrayArray43 = arg1.method1593();
		}
		if (arg1.anIntArray63 != null && Static239.method4465(arg2, this.anInt7811)) {
			local858 = 0;
			@Pc(2860) int[] local2860 = new int[256];
			for (local880 = 0; local880 < this.anInt7853; local880++) {
				local891 = arg1.anIntArray63[local119[local880]];
				if (local891 >= 0) {
					if (local891 > local858) {
						local858 = local891;
					}
					@Pc(2889) int local2889 = local2860[local891]++;
				}
			}
			this.anIntArrayArray42 = new int[local858 + 1][];
			for (local891 = 0; local891 <= local858; local891++) {
				this.anIntArrayArray42[local891] = new int[local2860[local891]];
				local2860[local891] = 0;
			}
			for (local900 = 0; local900 < this.anInt7853; local900++) {
				local909 = arg1.anIntArray63[local119[local900]];
				if (local909 >= 0) {
					this.anIntArrayArray42[local909][local2860[local909]++] = local900;
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7812; local15++) {
			@Pc(34) int local34 = this.anIntArray501[local15] * local13 - local9 * this.anIntArray503[local15] >> 14;
			this.anIntArray503[local15] = this.anIntArray501[local15] * local9 + this.anIntArray503[local15] * local13 >> 14;
			this.anIntArray501[local15] = local34;
		}
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
		this.aBoolean560 = false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class166 method6684(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class166_Sub3 local12;
		@Pc(16) Class166_Sub3 local16;
		if (arg0 == 1) {
			local12 = this.aClass20_Sub3_27.aClass166_Sub3_10;
			local16 = this.aClass20_Sub3_27.aClass166_Sub3_1;
		} else if (arg0 == 2) {
			local16 = this.aClass20_Sub3_27.aClass166_Sub3_3;
			local12 = this.aClass20_Sub3_27.aClass166_Sub3_7;
		} else if (arg0 == 3) {
			local12 = this.aClass20_Sub3_27.aClass166_Sub3_4;
			local16 = this.aClass20_Sub3_27.aClass166_Sub3_5;
		} else if (arg0 == 4) {
			local12 = this.aClass20_Sub3_27.aClass166_Sub3_6;
			local16 = this.aClass20_Sub3_27.aClass166_Sub3_9;
		} else if (arg0 == 5) {
			local12 = this.aClass20_Sub3_27.aClass166_Sub3_8;
			local16 = this.aClass20_Sub3_27.aClass166_Sub3_2;
		} else {
			local12 = local16 = new Class166_Sub3(this.aClass20_Sub3_27);
		}
		return this.method6708(local12, arg1, arg2, local16, arg0 != 0);
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)V")
	private void method6699() {
		if (this.anInt7802 == 0) {
			return;
		}
		if (this.aByte114 != 0) {
			this.method6710(true);
		}
		this.method6710(false);
		if (this.aClass348_1 != null) {
			if (this.aClass348_1.anInterface18_5 == null) {
				this.method6700((this.aByte114 & 0x10) != 0);
			}
			if (this.aClass348_1.anInterface18_5 != null) {
				this.aClass20_Sub3_27.method7315(this.aClass223_6 != null);
				this.aClass20_Sub3_27.method7381(this.aClass223_7, this.aClass223_8, this.aClass223_9, this.aClass223_6);
				@Pc(77) int local77 = this.anIntArray502.length - 1;
				for (@Pc(79) int local79 = 0; local79 < local77; local79++) {
					@Pc(86) int local86 = this.anIntArray502[local79];
					@Pc(93) int local93 = this.anIntArray502[local79 + 1];
					@Pc(100) int local100 = this.aShortArray112[local86] & 0xFFFF;
					if (local100 == 65535) {
						local100 = -1;
					}
					this.aClass20_Sub3_27.method7388(this.aClass223_6 != null, local100);
					this.aClass20_Sub3_27.method7346((local93 - local86) * 3, this.aClass348_1.anInterface18_5, local86 * 3);
				}
			}
		}
		this.method6713();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZB)V")
	private void method6700(@OriginalArg(0) boolean arg0) {
		if (this.anInt7802 * 6 > this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1.aByteArray128.length) {
			this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1((this.anInt7802 + 100) * 6);
		} else {
			this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1.anInt10066 = 0;
		}
		@Pc(44) Class2_Sub11_Sub1 local44 = this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1;
		@Pc(50) int local50;
		if (this.aClass20_Sub3_27.aBoolean616) {
			for (local50 = 0; local50 < this.anInt7802; local50++) {
				local44.method8333(this.aShortArray111[local50]);
				local44.method8333(this.aShortArray108[local50]);
				local44.method8333(this.aShortArray106[local50]);
			}
		} else {
			for (local50 = 0; local50 < this.anInt7802; local50++) {
				local44.method8393(this.aShortArray111[local50]);
				local44.method8393(this.aShortArray108[local50]);
				local44.method8393(this.aShortArray106[local50]);
			}
		}
		if (local44.anInt10066 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface18_1 == null) {
				this.anInterface18_1 = this.aClass20_Sub3_27.method7320(local44.anInt10066, local44.aByteArray128, true);
			} else {
				this.anInterface18_1.method9227(local44.aByteArray128, local44.anInt10066);
			}
			this.aClass348_1.anInterface18_5 = this.anInterface18_1;
		} else {
			this.aClass348_1.anInterface18_5 = this.aClass20_Sub3_27.method7320(local44.anInt10066, local44.aByteArray128, false);
		}
		if (!arg0) {
			this.aBoolean561 = true;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!bca;ZI)Z")
	@Override
	public boolean method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6706(arg3, -1, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg0 && arg0 < arg3 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg3 < arg0 && arg7 < arg0) {
			return false;
		} else if (arg4 > arg6 && arg1 > arg6 && arg6 < arg2) {
			return false;
		} else {
			return arg4 >= arg6 || arg6 <= arg1 || arg6 <= arg2;
		}
	}

	@OriginalMember(owner = "client!paa", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7812; local15++) {
			@Pc(33) int local33 = this.anIntArray500[local15] * local13 + local9 * this.anIntArray501[local15] >> 14;
			this.anIntArray501[local15] = this.anIntArray501[local15] * local13 - local9 * this.anIntArray500[local15] >> 14;
			this.anIntArray500[local15] = local33;
		}
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
		this.aBoolean560 = false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIBSI)I")
	private int method6702(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19 = Static195.anIntArray226[Static453.method7108(arg3, arg0)];
		if (arg2 != -1) {
			@Pc(32) Class127 local32 = this.aClass20_Sub3_27.anInterface4_12.method8048(arg2 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte74 & 0xFF;
			@Pc(46) int local46;
			@Pc(68) int local68;
			if (local37 != 0) {
				if (arg0 < 0) {
					local46 = 0;
				} else if (arg0 > 127) {
					local46 = 16777215;
				} else {
					local46 = arg0 * 131586;
				}
				if (local37 == 256) {
					local19 = local46;
				} else {
					local68 = 256 - local37;
					local19 = ((local46 & 0xFF00FF) * local37 + local68 * (local19 & 0xFF00FF) & 0xFF00FF00) + ((local46 & 0xFF00) * local37 + (local19 & 0xFF00) * local68 & 0xFF0000) >> 8;
				}
			}
			local46 = local32.aByte79 & 0xFF;
			if (local46 != 0) {
				local46 += 256;
				@Pc(123) int local123 = (local19 >> 16 & 0xFF) * local46;
				if (local123 > 65535) {
					local123 = 65535;
				}
				local68 = local46 * (local19 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(147) int local147 = (local19 & 0xFF) * local46;
				if (local147 > 65535) {
					local147 = 65535;
				}
				local19 = (local147 >> 8) + (((local123 & 0xA400FF00) << 8) + (local68 & 0xFF00));
			}
		}
		return (local19 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "()Z")
	@Override
	public boolean method6688() {
		if (this.aShortArray112 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray112.length; local12++) {
			if (this.aShortArray112[local12] != -1 && !this.aClass20_Sub3_27.anInterface4_12.method8049(this.aShortArray112[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6683(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class166_Sub3 local8 = (Class166_Sub3) arg0;
		if (this.anInt7853 == 0 || local8.anInt7853 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt7812;
		@Pc(27) int[] local27 = local8.anIntArray500;
		@Pc(30) int[] local30 = local8.anIntArray501;
		@Pc(33) int[] local33 = local8.anIntArray503;
		@Pc(36) short[] local36 = local8.aShortArray105;
		@Pc(39) short[] local39 = local8.aShortArray110;
		@Pc(42) short[] local42 = local8.lb;
		@Pc(45) byte[] local45 = local8.aByteArray104;
		@Pc(52) short[] local52;
		@Pc(60) short[] local60;
		@Pc(64) short[] local64;
		@Pc(56) byte[] local56;
		if (this.aClass235_1 == null) {
			local64 = null;
			local60 = null;
			local56 = null;
			local52 = null;
		} else {
			local52 = this.aClass235_1.aShortArray94;
			local56 = this.aClass235_1.aByteArray98;
			local60 = this.aClass235_1.aShortArray92;
			local64 = this.aClass235_1.aShortArray93;
		}
		@Pc(89) short[] local89;
		@Pc(93) short[] local93;
		@Pc(81) short[] local81;
		@Pc(85) byte[] local85;
		if (local8.aClass235_1 == null) {
			local85 = null;
			local93 = null;
			local89 = null;
			local81 = null;
		} else {
			local81 = local8.aClass235_1.aShortArray93;
			local85 = local8.aClass235_1.aByteArray98;
			local89 = local8.aClass235_1.aShortArray94;
			local93 = local8.aClass235_1.aShortArray92;
		}
		@Pc(106) int[] local106 = local8.anIntArray499;
		@Pc(109) short[] local109 = local8.aShortArray114;
		if (!local8.aBoolean560) {
			local8.method6714();
		}
		@Pc(118) short local118 = local8.aShort92;
		@Pc(121) short local121 = local8.aShort94;
		@Pc(124) short local124 = local8.aShort88;
		@Pc(127) short local127 = local8.aShort91;
		@Pc(130) short local130 = local8.aShort93;
		@Pc(133) short local133 = local8.aShort97;
		for (@Pc(135) int local135 = 0; local135 < this.anInt7812; local135++) {
			@Pc(145) int local145 = this.anIntArray501[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray500[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(181) int local181 = this.anIntArray503[local135] - arg3;
					if (local130 <= local181 && local133 >= local181) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray499[local135];
						@Pc(207) int local207 = this.anIntArray499[local135 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray114[local209] - 1;
							if (local195 == -1 || this.aByteArray104[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(244) int local244 = 0; local244 < local24; local244++) {
								if (local27[local244] == local165 && local181 == local33[local244] && local30[local244] == local145) {
									local207 = local106[local244 + 1];
									@Pc(269) int local269 = -1;
									local200 = local106[local244];
									for (@Pc(275) int local275 = local200; local275 < local207; local275++) {
										local269 = local109[local275] - 1;
										if (local269 == -1 || local45[local269] != 0) {
											break;
										}
									}
									if (local269 != -1) {
										if (local52 == null) {
											this.aClass235_1 = new Class235();
											local52 = this.aClass235_1.aShortArray94 = Static202.method4069(this.aShortArray105);
											local60 = this.aClass235_1.aShortArray92 = Static202.method4069(this.aShortArray110);
											local64 = this.aClass235_1.aShortArray93 = Static202.method4069(this.lb);
											local56 = this.aClass235_1.aByteArray98 = Static67.method2077(this.aByteArray104);
										}
										if (local89 == null) {
											@Pc(352) Class235 local352 = local8.aClass235_1 = new Class235();
											local89 = local352.aShortArray94 = Static202.method4069(local36);
											local93 = local352.aShortArray92 = Static202.method4069(local39);
											local81 = local352.aShortArray93 = Static202.method4069(local42);
											local85 = local352.aByteArray98 = Static67.method2077(local45);
										}
										@Pc(385) short local385 = this.aShortArray105[local195];
										@Pc(390) short local390 = this.aShortArray110[local195];
										@Pc(395) short local395 = this.lb[local195];
										@Pc(400) byte local400 = this.aByteArray104[local195];
										local200 = local106[local244];
										local207 = local106[local244 + 1];
										@Pc(420) int local420;
										for (@Pc(412) int local412 = local200; local412 < local207; local412++) {
											local420 = local109[local412] - 1;
											if (local420 == -1) {
												break;
											}
											if (local85[local420] != 0) {
												local89[local420] += local385;
												local93[local420] += local390;
												local81[local420] += local395;
												local85[local420] += local400;
											}
										}
										local390 = local39[local269];
										local395 = local42[local269];
										local400 = local45[local269];
										local200 = this.anIntArray499[local135];
										local207 = this.anIntArray499[local135 + 1];
										local385 = local36[local269];
										for (local420 = local200; local420 < local207; local420++) {
											@Pc(507) int local507 = this.aShortArray114[local420] - 1;
											if (local507 == -1) {
												break;
											}
											if (local56[local507] != 0) {
												local52[local507] += local385;
												local60[local507] += local390;
												local64[local507] += local395;
												local56[local507] += local400;
											}
										}
										if (this.aClass223_6 == null && this.aClass223_8 != null) {
											this.aClass223_8.anInterface11_2 = null;
										}
										if (this.aClass223_6 != null) {
											this.aClass223_6.anInterface11_2 = null;
										}
										if (local8.aClass223_6 == null && local8.aClass223_8 != null) {
											local8.aClass223_8.anInterface11_2 = null;
										}
										if (local8.aClass223_6 != null) {
											local8.aClass223_6.anInterface11_2 = null;
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IILclient!bca;ZII)Z")
	@Override
	public boolean method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6706(arg3, arg5, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Z)V")
	private void method6704() {
		if (this.aClass219Array1 == null) {
			return;
		}
		@Pc(8) Class30_Sub3 local8 = this.aClass20_Sub3_27.aClass30_Sub3_2;
		this.aClass20_Sub3_27.method7375();
		this.aClass20_Sub3_27.C(!this.aBoolean562);
		this.aClass20_Sub3_27.method7315(false);
		this.aClass20_Sub3_27.method7381(this.aClass20_Sub3_27.aClass223_11, null, this.aClass20_Sub3_27.aClass223_10, null);
		for (@Pc(40) int local40 = 0; local40 < this.anInt7801; local40++) {
			@Pc(47) Class219 local47 = this.aClass219Array1[local40];
			@Pc(52) Class159 local52 = this.aClass159Array1[local40];
			if (!local47.aBoolean535 || !this.aClass20_Sub3_27.method7269()) {
				@Pc(80) float local80 = (float) (this.anIntArray500[local47.anInt7326] + this.anIntArray500[local47.anInt7329] + this.anIntArray500[local47.anInt7325]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray501[local47.anInt7329] + this.anIntArray501[local47.anInt7325] + this.anIntArray501[local47.anInt7326]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray503[local47.anInt7329] + this.anIntArray503[local47.anInt7325] + this.anIntArray503[local47.anInt7326]) * 0.3333333F;
				@Pc(136) float local136 = Static52.aFloat76 + local122 * Static70.aFloat79 + local101 * Static108.aFloat94 + Static425.aFloat169 * local80;
				@Pc(150) float local150 = Static408.aFloat166 + Static498.aFloat198 * local122 + local101 * Static556.aFloat207 + Static72.aFloat69 * local80;
				@Pc(164) float local164 = local80 * Static139.aFloat103 + local101 * Static80.aFloat80 + local122 * Static585.aFloat210 + Static249.aFloat148;
				@Pc(185) float local185 = (float) (1.0D / Math.sqrt((double) (local164 * local164 + local150 * local150 + local136 * local136))) * (float) local47.anInt7328;
				local8.method4392(local164 * local185 - local164, local47.aShort81 * local52.anInt5347 >> 7, local136 + (float) local52.anInt5345 - local136 * local185, local47.aShort83 * local52.anInt5348 >> 7, local52.anInt5344, local185 * local150 + (float) local52.anInt5340 - local150);
				this.aClass20_Sub3_27.method7353(local8);
				@Pc(238) int local238 = local52.anInt5349;
				OpenGL.glColor4ub((byte) (local238 >> 16), (byte) (local238 >> 8), (byte) local238, (byte) (local238 >> 24));
				this.aClass20_Sub3_27.method7344(local47.aShort82);
				this.aClass20_Sub3_27.method7340(local47.aByte109);
				this.aClass20_Sub3_27.method7343(4);
			}
		}
		this.aClass20_Sub3_27.C(true);
		this.aClass20_Sub3_27.method7321();
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIJILclient!bh;IFIIF)S")
	private short method6705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class32 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray499[arg7];
		@Pc(17) int local17 = this.anIntArray499[arg7 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray114[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg2 == Static443.aLongArray16[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray114[local19] = (short) (this.anInt7794 + 1);
		Static443.aLongArray16[local19] = arg2;
		this.aShortArray105[this.anInt7794] = (short) arg3;
		this.aShortArray110[this.anInt7794] = (short) arg0;
		this.lb[this.anInt7794] = (short) arg1;
		this.aByteArray104[this.anInt7794] = (byte) arg5;
		this.aFloatArray68[this.anInt7794] = arg6;
		this.aFloatArray69[this.anInt7794] = arg8;
		return (short) this.anInt7794++;
	}

	@OriginalMember(owner = "client!paa", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort94;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(ZIIIIILclient!bca;)Z")
	private boolean method6706(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30 arg5) {
		@Pc(8) Class30_Sub3 local8 = (Class30_Sub3) arg5;
		@Pc(12) Class30_Sub3 local12 = this.aClass20_Sub3_27.aClass30_Sub3_3;
		@Pc(33) float local33 = local12.aFloat135 + local8.aFloat137 * local12.aFloat145 + local12.aFloat143 * local8.aFloat135 + local8.aFloat144 * local12.aFloat136;
		@Pc(54) float local54 = local12.aFloat144 + local8.aFloat137 * local12.aFloat141 + local8.aFloat135 * local12.aFloat140 + local8.aFloat144 * local12.aFloat142;
		Static108.aFloat94 = local12.aFloat145 * local8.aFloat138 + local8.aFloat142 * local12.aFloat136 + local12.aFloat143 * local8.aFloat136;
		Static498.aFloat198 = local8.aFloat145 * local12.aFloat140 + local12.aFloat142 * local8.aFloat141 + local12.aFloat141 * local8.aFloat146;
		Static139.aFloat103 = local12.aFloat138 * local8.aFloat140 + local8.aFloat143 * local12.aFloat139 + local8.aFloat139 * local12.aFloat146;
		Static585.aFloat210 = local8.aFloat145 * local12.aFloat139 + local8.aFloat141 * local12.aFloat138 + local12.aFloat146 * local8.aFloat146;
		@Pc(147) float local147 = local12.aFloat139 * local8.aFloat135 + local12.aFloat138 * local8.aFloat144 + local8.aFloat137 * local12.aFloat146 + local12.aFloat137;
		Static556.aFloat207 = local12.aFloat140 * local8.aFloat136 + local12.aFloat142 * local8.aFloat142 + local12.aFloat141 * local8.aFloat138;
		Static72.aFloat69 = local8.aFloat139 * local12.aFloat141 + local8.aFloat140 * local12.aFloat142 + local12.aFloat140 * local8.aFloat143;
		Static70.aFloat79 = local12.aFloat136 * local8.aFloat141 + local12.aFloat143 * local8.aFloat145 + local8.aFloat146 * local12.aFloat145;
		Static425.aFloat169 = local8.aFloat139 * local12.aFloat145 + local8.aFloat143 * local12.aFloat143 + local8.aFloat140 * local12.aFloat136;
		Static80.aFloat80 = local12.aFloat146 * local8.aFloat138 + local8.aFloat142 * local12.aFloat138 + local8.aFloat136 * local12.aFloat139;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass20_Sub3_27.anInt8784;
		@Pc(255) int local255 = this.aClass20_Sub3_27.anInt8792;
		if (!this.aBoolean560) {
			this.method6714();
		}
		@Pc(270) int local270 = this.aShort91 - this.aShort88 >> 1;
		@Pc(279) int local279 = this.aShort94 - this.aShort92 >> 1;
		@Pc(288) int local288 = this.aShort97 - this.aShort93 >> 1;
		@Pc(293) int local293 = this.aShort88 + local270;
		@Pc(299) int local299 = this.aShort92 + local279;
		@Pc(304) int local304 = local288 + this.aShort93;
		@Pc(311) int local311 = local293 - (local270 << arg3);
		@Pc(318) int local318 = local299 - (local279 << arg3);
		@Pc(324) int local324 = local304 - (local288 << arg3);
		@Pc(330) int local330 = local293 + (local270 << arg3);
		@Pc(336) int local336 = (local279 << arg3) + local299;
		@Pc(342) int local342 = (local288 << arg3) + local304;
		Static608.anIntArray686[0] = local311;
		Static197.anIntArray230[0] = local318;
		Static608.anIntArray686[1] = local330;
		Static535.anIntArray636[0] = local324;
		Static197.anIntArray230[1] = local318;
		Static608.anIntArray686[2] = local311;
		Static535.anIntArray636[1] = local324;
		Static197.anIntArray230[2] = local336;
		Static535.anIntArray636[2] = local324;
		Static608.anIntArray686[3] = local330;
		Static197.anIntArray230[3] = local336;
		Static608.anIntArray686[4] = local311;
		Static535.anIntArray636[3] = local324;
		Static197.anIntArray230[4] = local318;
		Static535.anIntArray636[4] = local342;
		Static608.anIntArray686[5] = local330;
		Static197.anIntArray230[5] = local318;
		Static535.anIntArray636[5] = local342;
		Static608.anIntArray686[6] = local311;
		Static197.anIntArray230[6] = local336;
		Static608.anIntArray686[7] = local330;
		Static535.anIntArray636[6] = local342;
		Static197.anIntArray230[7] = local336;
		Static535.anIntArray636[7] = local342;
		@Pc(504) float local504;
		@Pc(490) float local490;
		@Pc(476) float local476;
		@Pc(462) float local462;
		@Pc(457) float local457;
		@Pc(452) float local452;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = Static535.anIntArray636[local445];
			local457 = Static197.anIntArray230[local445];
			local462 = Static608.anIntArray686[local445];
			local476 = Static585.aFloat210 * local452 + local462 * Static139.aFloat103 + Static80.aFloat80 * local457 + local147;
			local490 = local54 + Static72.aFloat69 * local462 + Static556.aFloat207 * local457 + Static498.aFloat198 * local452;
			local504 = local33 + Static108.aFloat94 * local457 + local462 * Static425.aFloat169 + Static70.aFloat79 * local452;
			if ((float) this.aClass20_Sub3_27.anInt8805 <= local476) {
				if (arg1 > 0) {
					local476 = arg1;
				}
				@Pc(531) float local531 = local504 * (float) local251 / local476 + (float) this.aClass20_Sub3_27.anInt8808;
				if (local531 < local241) {
					local241 = local531;
				}
				if (local531 > local243) {
					local243 = local531;
				}
				@Pc(555) float local555 = local490 * (float) local255 / local476 + (float) this.aClass20_Sub3_27.anInt8800;
				if (local555 > local247) {
					local247 = local555;
				}
				local239 = true;
				if (local555 < local245) {
					local245 = local555;
				}
			}
		}
		if (local239 && (float) arg4 > local241 && (float) arg4 < local243 && (float) arg2 > local245 && (float) arg2 < local247) {
			if (arg0) {
				return true;
			}
			if (this.aClass20_Sub3_27.anIntArray559.length < this.anInt7794) {
				this.aClass20_Sub3_27.anIntArray561 = new int[this.anInt7794];
				this.aClass20_Sub3_27.anIntArray559 = new int[this.anInt7794];
			}
			@Pc(626) int[] local626 = this.aClass20_Sub3_27.anIntArray559;
			@Pc(630) int[] local630 = this.aClass20_Sub3_27.anIntArray561;
			@Pc(706) int local706;
			for (@Pc(632) int local632 = 0; local632 < this.anInt7812; local632++) {
				local462 = this.anIntArray500[local632];
				local452 = this.anIntArray503[local632];
				local457 = this.anIntArray501[local632];
				local476 = local147 + local452 * Static585.aFloat210 + Static139.aFloat103 * local462 + local457 * Static80.aFloat80;
				local504 = local33 + local457 * Static108.aFloat94 + local462 * Static425.aFloat169 + Static70.aFloat79 * local452;
				local490 = local54 + Static556.aFloat207 * local457 + local462 * Static72.aFloat69 + local452 * Static498.aFloat198;
				@Pc(713) int local713;
				@Pc(715) int local715;
				@Pc(724) int local724;
				if (local476 >= (float) this.aClass20_Sub3_27.anInt8805) {
					if (arg1 > 0) {
						local476 = arg1;
					}
					local706 = (int) ((float) this.aClass20_Sub3_27.anInt8808 + local504 * (float) local251 / local476);
					local713 = (int) ((float) this.aClass20_Sub3_27.anInt8800 + (float) local255 * local490 / local476);
					local715 = this.anIntArray499[local632];
					local724 = this.anIntArray499[local632 + 1];
					for (@Pc(791) int local791 = local715; local791 < local724; local791++) {
						@Pc(800) int local800 = this.aShortArray114[local791] - 1;
						if (local800 == -1) {
							break;
						}
						local626[local800] = local706;
						local630[local800] = local713;
					}
				} else {
					local706 = this.anIntArray499[local632];
					local713 = this.anIntArray499[local632 + 1];
					for (local715 = local706; local715 < local713; local715++) {
						local724 = this.aShortArray114[local715] - 1;
						if (local724 == -1) {
							break;
						}
						local626[this.aShortArray114[local715] - 1] = -999999;
					}
				}
			}
			for (local706 = 0; local706 < this.anInt7853; local706++) {
				if (local626[this.aShortArray111[local706]] != -999999 && local626[this.aShortArray108[local706]] != -999999 && local626[this.aShortArray106[local706]] != -999999 && this.method6701(arg2, local626[this.aShortArray108[local706]], local626[this.aShortArray106[local706]], local630[this.aShortArray108[local706]], local626[this.aShortArray111[local706]], local630[this.aShortArray111[local706]], arg4, local630[this.aShortArray106[local706]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!paa", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7812; local7++) {
			if (arg0 != 128) {
				this.anIntArray500[local7] = arg0 * this.anIntArray500[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray501[local7] = this.anIntArray501[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray503[local7] = this.anIntArray503[local7] * arg2 >> 7;
			}
		}
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
		this.aBoolean560 = false;
	}

	@OriginalMember(owner = "client!paa", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub7 ba(@OriginalArg(0) Class2_Sub6_Sub7 arg0) {
		if (this.anInt7794 == 0) {
			return null;
		}
		if (!this.aBoolean560) {
			this.method6714();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass20_Sub3_27.anInt8785 > 0) {
			local43 = this.aShort88 - (this.aShort94 * this.aClass20_Sub3_27.anInt8785 >> 8) >> this.aClass20_Sub3_27.anInt8771;
			local60 = this.aShort91 - (this.aShort92 * this.aClass20_Sub3_27.anInt8785 >> 8) >> this.aClass20_Sub3_27.anInt8771;
		} else {
			local43 = this.aShort88 - (this.aShort92 * this.aClass20_Sub3_27.anInt8785 >> 8) >> this.aClass20_Sub3_27.anInt8771;
			local60 = this.aShort91 - (this.aClass20_Sub3_27.anInt8785 * this.aShort94 >> 8) >> this.aClass20_Sub3_27.anInt8771;
		}
		@Pc(117) int local117;
		@Pc(133) int local133;
		if (this.aClass20_Sub3_27.anInt8787 > 0) {
			local117 = this.aShort93 - (this.aClass20_Sub3_27.anInt8787 * this.aShort94 >> 8) >> this.aClass20_Sub3_27.anInt8771;
			local133 = this.aShort97 - (this.aShort92 * this.aClass20_Sub3_27.anInt8787 >> 8) >> this.aClass20_Sub3_27.anInt8771;
		} else {
			local117 = this.aShort93 - (this.aClass20_Sub3_27.anInt8787 * this.aShort92 >> 8) >> this.aClass20_Sub3_27.anInt8771;
			local133 = this.aShort97 - (this.aClass20_Sub3_27.anInt8787 * this.aShort94 >> 8) >> this.aClass20_Sub3_27.anInt8771;
		}
		@Pc(175) int local175 = local60 + 1 - local43;
		@Pc(182) int local182 = local133 + 1 - local117;
		@Pc(185) Class2_Sub6_Sub7_Sub2 local185 = (Class2_Sub6_Sub7_Sub2) arg0;
		@Pc(201) Class2_Sub6_Sub7_Sub2 local201;
		if (local185 != null && local185.method8457(local182, local175)) {
			local201 = local185;
			local185.method8454();
		} else {
			local201 = new Class2_Sub6_Sub7_Sub2(this.aClass20_Sub3_27, local175, local182);
		}
		local201.method8453(local133, local60, local117, local43);
		this.method6707(local201);
		return local201;
	}

	@OriginalMember(owner = "client!paa", name = "b", descriptor = "()V")
	@Override
	public void method6682() {
		if (this.anInt7794 <= 0 || this.anInt7802 <= 0) {
			return;
		}
		this.method6710(false);
		if ((this.aByte114 & 0x10) == 0 && this.aClass348_1.anInterface18_5 == null) {
			this.method6700(false);
		}
		this.method6713();
	}

	@OriginalMember(owner = "client!paa", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort95;
	}

	@OriginalMember(owner = "client!paa", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7812; local15++) {
			local33 = this.anIntArray500[local15] * local13 + this.anIntArray503[local15] * local9 >> 14;
			this.anIntArray503[local15] = this.anIntArray503[local15] * local13 - this.anIntArray500[local15] * local9 >> 14;
			this.anIntArray500[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7794; local33++) {
			@Pc(87) int local87 = this.aShortArray105[local33] * local13 + this.lb[local33] * local9 >> 14;
			this.lb[local33] = (short) (local13 * this.lb[local33] - local9 * this.aShortArray105[local33] >> 14);
			this.aShortArray105[local33] = (short) local87;
		}
		if (this.aClass223_6 == null && this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
		}
		if (this.aClass223_6 != null) {
			this.aClass223_6.anInterface11_2 = null;
		}
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
		this.aBoolean560 = false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLclient!uc;)V")
	private void method6707(@OriginalArg(1) Class2_Sub6_Sub7_Sub2 arg0) {
		if (this.anInt7794 > this.aClass20_Sub3_27.anIntArray559.length) {
			this.aClass20_Sub3_27.anIntArray561 = new int[this.anInt7794];
			this.aClass20_Sub3_27.anIntArray559 = new int[this.anInt7794];
		}
		@Pc(32) int[] local32 = this.aClass20_Sub3_27.anIntArray559;
		@Pc(42) int[] local42 = this.aClass20_Sub3_27.anIntArray561;
		@Pc(70) int local70;
		@Pc(109) int local109;
		@Pc(118) int local118;
		for (@Pc(44) int local44 = 0; local44 < this.anInt7812; local44++) {
			local70 = (this.anIntArray500[local44] - (this.aClass20_Sub3_27.anInt8785 * this.anIntArray501[local44] >> 8) >> this.aClass20_Sub3_27.anInt8771) - arg0.anInt10150;
			@Pc(95) int local95 = (this.anIntArray503[local44] - (this.aClass20_Sub3_27.anInt8787 * this.anIntArray501[local44] >> 8) >> this.aClass20_Sub3_27.anInt8771) - arg0.anInt10147;
			@Pc(100) int local100 = this.anIntArray499[local44];
			@Pc(107) int local107 = this.anIntArray499[local44 + 1];
			for (local109 = local100; local109 < local107; local109++) {
				local118 = this.aShortArray114[local109] - 1;
				if (local118 == -1) {
					break;
				}
				local32[local118] = local70;
				local42[local118] = local95;
			}
		}
		for (local70 = 0; local70 < this.anInt7802; local70++) {
			if (this.aByteArray103 == null || this.aByteArray103[local70] <= 128) {
				@Pc(162) short local162 = this.aShortArray111[local70];
				@Pc(167) short local167 = this.aShortArray108[local70];
				@Pc(172) short local172 = this.aShortArray106[local70];
				local109 = local32[local162];
				local118 = local32[local167];
				@Pc(184) int local184 = local32[local172];
				@Pc(188) int local188 = local42[local162];
				@Pc(192) int local192 = local42[local167];
				@Pc(196) int local196 = local42[local172];
				if ((local109 - local118) * (local192 - local196) - (local184 - local118) * (local192 - local188) > 0) {
					arg0.method8455(local184, local109, local188, local118, local196, local192);
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7853; local7++) {
			local16 = this.aShortArray109[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(47) int local47 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local47 += (arg2 - local47) * arg3 >> 7;
			}
			this.aShortArray109[local7] = (short) (local28 << 7 | local22 << 10 | local47);
		}
		if (this.aClass219Array1 != null) {
			for (local16 = 0; local16 < this.anInt7801; local16++) {
				@Pc(106) Class219 local106 = this.aClass219Array1[local16];
				@Pc(111) Class159 local111 = this.aClass159Array1[local16];
				local111.anInt5349 = Static195.anIntArray226[this.aShortArray109[local106.anInt7327] & 0xFFFF] & 0xFFFFFF | local111.anInt5349 & 0xFF000000;
			}
		}
		if (this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7812; local7++) {
			if (arg0 != 0) {
				this.anIntArray500[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray501[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray503[local7] += arg2;
			}
		}
		this.aBoolean560 = false;
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7812; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray500[local15] + local9 * this.anIntArray503[local15] >> 14;
			this.anIntArray503[local15] = this.anIntArray503[local15] * local13 - this.anIntArray500[local15] * local9 >> 14;
			this.anIntArray500[local15] = local33;
		}
		this.aBoolean560 = false;
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean562;
	}

	@OriginalMember(owner = "client!paa", name = "f", descriptor = "()V")
	@Override
	protected void method6692() {
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!paa;IIZLclient!paa;Z)Lclient!ka;")
	private Class166 method6708(@OriginalArg(0) Class166_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class166_Sub3 arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt7860 = this.anInt7860;
		arg0.anInt7811 = this.anInt7811;
		arg0.anInt7801 = this.anInt7801;
		arg0.aByte114 = 0;
		arg0.aShort89 = this.aShort89;
		arg0.anInt7794 = this.anInt7794;
		arg0.aBoolean564 = this.aBoolean564;
		arg0.anInt7862 = arg1;
		arg0.aShort96 = this.aShort96;
		arg0.anInt7853 = this.anInt7853;
		arg0.anInt7802 = this.anInt7802;
		arg0.anInt7812 = this.anInt7812;
		if ((arg1 & 0x100) == 0) {
			arg0.aBoolean562 = this.aBoolean562;
		} else {
			arg0.aBoolean562 = true;
		}
		@Pc(70) boolean local70 = Static124.method9247(this.anInt7811, arg1);
		@Pc(76) boolean local76 = Static5.method116(this.anInt7811, arg1);
		@Pc(82) boolean local82 = Static107.method7094(this.anInt7811, arg1);
		@Pc(88) boolean local88 = local82 | local76 | local70;
		@Pc(203) int local203;
		if (local88) {
			if (!local70) {
				arg0.anIntArray500 = this.anIntArray500;
			} else if (arg3.anIntArray500 == null || arg3.anIntArray500.length < this.anInt7860) {
				arg0.anIntArray500 = arg3.anIntArray500 = new int[this.anInt7860];
			} else {
				arg0.anIntArray500 = arg3.anIntArray500;
			}
			if (!local76) {
				arg0.anIntArray501 = this.anIntArray501;
			} else if (arg3.anIntArray501 == null || this.anInt7860 > arg3.anIntArray501.length) {
				arg0.anIntArray501 = arg3.anIntArray501 = new int[this.anInt7860];
			} else {
				arg0.anIntArray501 = arg3.anIntArray501;
			}
			if (!local82) {
				arg0.anIntArray503 = this.anIntArray503;
			} else if (arg3.anIntArray503 == null || this.anInt7860 > arg3.anIntArray503.length) {
				arg0.anIntArray503 = arg3.anIntArray503 = new int[this.anInt7860];
			} else {
				arg0.anIntArray503 = arg3.anIntArray503;
			}
			for (local203 = 0; local203 < this.anInt7860; local203++) {
				if (local70) {
					arg0.anIntArray500[local203] = this.anIntArray500[local203];
				}
				if (local76) {
					arg0.anIntArray501[local203] = this.anIntArray501[local203];
				}
				if (local82) {
					arg0.anIntArray503[local203] = this.anIntArray503[local203];
				}
			}
		} else {
			arg0.anIntArray503 = this.anIntArray503;
			arg0.anIntArray501 = this.anIntArray501;
			arg0.anIntArray500 = this.anIntArray500;
		}
		if (Static611.method9090(arg1, this.anInt7811)) {
			arg0.aClass223_7 = arg3.aClass223_7;
			if (arg4) {
				arg0.aByte114 = (byte) (arg0.aByte114 | 0x1);
			}
			arg0.aClass223_7.anInterface11_2 = this.aClass223_7.anInterface11_2;
			arg0.aClass223_7.aByte110 = this.aClass223_7.aByte110;
		} else if (Static279.method6686(arg1, this.anInt7811)) {
			arg0.aClass223_7 = this.aClass223_7;
		} else {
			arg0.aClass223_7 = null;
		}
		if (Static370.method6241(this.anInt7811, arg1)) {
			if (arg3.aShortArray109 == null || this.anInt7853 > arg3.aShortArray109.length) {
				arg0.aShortArray109 = arg3.aShortArray109 = new short[this.anInt7853];
			} else {
				arg0.aShortArray109 = arg3.aShortArray109;
			}
			for (local203 = 0; local203 < this.anInt7853; local203++) {
				arg0.aShortArray109[local203] = this.aShortArray109[local203];
			}
		} else {
			arg0.aShortArray109 = this.aShortArray109;
		}
		if (Static594.method8740(arg1, this.anInt7811)) {
			if (arg3.aByteArray103 == null || this.anInt7853 > arg3.aByteArray103.length) {
				arg0.aByteArray103 = arg3.aByteArray103 = new byte[this.anInt7853];
			} else {
				arg0.aByteArray103 = arg3.aByteArray103;
			}
			for (local203 = 0; local203 < this.anInt7853; local203++) {
				arg0.aByteArray103[local203] = this.aByteArray103[local203];
			}
		} else {
			arg0.aByteArray103 = this.aByteArray103;
		}
		if (Static586.method8661(arg1, this.anInt7811)) {
			arg0.aClass223_8 = arg3.aClass223_8;
			if (arg4) {
				arg0.aByte114 = (byte) (arg0.aByte114 | 0x2);
			}
			arg0.aClass223_8.anInterface11_2 = this.aClass223_8.anInterface11_2;
			arg0.aClass223_8.aByte110 = this.aClass223_8.aByte110;
		} else if (Static44.method1646(this.anInt7811, arg1)) {
			arg0.aClass223_8 = this.aClass223_8;
		} else {
			arg0.aClass223_8 = null;
		}
		@Pc(593) int local593;
		if (Static408.method6624(this.anInt7811, arg1)) {
			if (arg3.aShortArray105 == null || arg3.aShortArray105.length < this.anInt7794) {
				local203 = this.anInt7794;
				arg0.aShortArray110 = arg3.aShortArray110 = new short[local203];
				arg0.aShortArray105 = arg3.aShortArray105 = new short[local203];
				arg0.lb = arg3.lb = new short[local203];
			} else {
				arg0.aShortArray105 = arg3.aShortArray105;
				arg0.aShortArray110 = arg3.aShortArray110;
				arg0.lb = arg3.lb;
			}
			if (this.aClass235_1 == null) {
				for (local203 = 0; local203 < this.anInt7794; local203++) {
					arg0.aShortArray105[local203] = this.aShortArray105[local203];
					arg0.aShortArray110[local203] = this.aShortArray110[local203];
					arg0.lb[local203] = this.lb[local203];
				}
			} else {
				if (arg3.aClass235_1 == null) {
					arg3.aClass235_1 = new Class235();
				}
				@Pc(581) Class235 local581 = arg0.aClass235_1 = arg3.aClass235_1;
				if (local581.aShortArray94 == null || this.anInt7794 > local581.aShortArray94.length) {
					local593 = this.anInt7794;
					local581.aShortArray92 = new short[local593];
					local581.aShortArray93 = new short[local593];
					local581.aShortArray94 = new short[local593];
					local581.aByteArray98 = new byte[local593];
				}
				for (local593 = 0; local593 < this.anInt7794; local593++) {
					arg0.aShortArray105[local593] = this.aShortArray105[local593];
					arg0.aShortArray110[local593] = this.aShortArray110[local593];
					arg0.lb[local593] = this.lb[local593];
					local581.aShortArray94[local593] = this.aClass235_1.aShortArray94[local593];
					local581.aShortArray92[local593] = this.aClass235_1.aShortArray92[local593];
					local581.aShortArray93[local593] = this.aClass235_1.aShortArray93[local593];
					local581.aByteArray98[local593] = this.aClass235_1.aByteArray98[local593];
				}
			}
			arg0.aByteArray104 = this.aByteArray104;
		} else {
			arg0.aShortArray105 = this.aShortArray105;
			arg0.aShortArray110 = this.aShortArray110;
			arg0.aClass235_1 = this.aClass235_1;
			arg0.aByteArray104 = this.aByteArray104;
			arg0.lb = this.lb;
		}
		if (Static634.method9195(arg1, this.anInt7811)) {
			if (arg4) {
				arg0.aByte114 = (byte) (arg0.aByte114 | 0x4);
			}
			arg0.aClass223_6 = arg3.aClass223_6;
			arg0.aClass223_6.anInterface11_2 = this.aClass223_6.anInterface11_2;
			arg0.aClass223_6.aByte110 = this.aClass223_6.aByte110;
		} else if (Static363.method6138(this.anInt7811, arg1)) {
			arg0.aClass223_6 = this.aClass223_6;
		} else {
			arg0.aClass223_6 = null;
		}
		if (Static632.method9169(arg1, this.anInt7811)) {
			if (arg3.aFloatArray68 == null || this.anInt7853 > arg3.aFloatArray68.length) {
				local203 = this.anInt7794;
				arg0.aFloatArray69 = arg3.aFloatArray69 = new float[local203];
				arg0.aFloatArray68 = arg3.aFloatArray68 = new float[local203];
			} else {
				arg0.aFloatArray69 = arg3.aFloatArray69;
				arg0.aFloatArray68 = arg3.aFloatArray68;
			}
			for (local203 = 0; local203 < this.anInt7794; local203++) {
				arg0.aFloatArray68[local203] = this.aFloatArray68[local203];
				arg0.aFloatArray69[local203] = this.aFloatArray69[local203];
			}
		} else {
			arg0.aFloatArray69 = this.aFloatArray69;
			arg0.aFloatArray68 = this.aFloatArray68;
		}
		if (Static482.method7525(this.anInt7811, arg1)) {
			arg0.aClass223_9 = arg3.aClass223_9;
			if (arg4) {
				arg0.aByte114 = (byte) (arg0.aByte114 | 0x8);
			}
			arg0.aClass223_9.anInterface11_2 = this.aClass223_9.anInterface11_2;
			arg0.aClass223_9.aByte110 = this.aClass223_9.aByte110;
		} else if (Static385.method6307(this.anInt7811, arg1)) {
			arg0.aClass223_9 = this.aClass223_9;
		} else {
			arg0.aClass223_9 = null;
		}
		if (Static46.method1674(this.anInt7811, arg1)) {
			if (arg3.aShortArray111 == null || arg3.aShortArray111.length < this.anInt7853) {
				local203 = this.anInt7853;
				arg0.aShortArray106 = arg3.aShortArray106 = new short[local203];
				arg0.aShortArray111 = arg3.aShortArray111 = new short[local203];
				arg0.aShortArray108 = arg3.aShortArray108 = new short[local203];
			} else {
				arg0.aShortArray108 = arg3.aShortArray108;
				arg0.aShortArray111 = arg3.aShortArray111;
				arg0.aShortArray106 = arg3.aShortArray106;
			}
			for (local203 = 0; local203 < this.anInt7853; local203++) {
				arg0.aShortArray111[local203] = this.aShortArray111[local203];
				arg0.aShortArray108[local203] = this.aShortArray108[local203];
				arg0.aShortArray106[local203] = this.aShortArray106[local203];
			}
		} else {
			arg0.aShortArray106 = this.aShortArray106;
			arg0.aShortArray108 = this.aShortArray108;
			arg0.aShortArray111 = this.aShortArray111;
		}
		if (Static288.method5234(arg1, this.anInt7811)) {
			if (arg4) {
				arg0.aByte114 = (byte) (arg0.aByte114 | 0x10);
			}
			arg0.aClass348_1 = arg3.aClass348_1;
			arg0.aClass348_1.anInterface18_5 = this.aClass348_1.anInterface18_5;
		} else if (Static408.method6621(arg1, this.anInt7811)) {
			arg0.aClass348_1 = this.aClass348_1;
		} else {
			arg0.aClass348_1 = null;
		}
		if (Static518.method7861(this.anInt7811, arg1)) {
			if (arg3.aShortArray112 == null || arg3.aShortArray112.length < this.anInt7853) {
				local203 = this.anInt7853;
				arg0.aShortArray112 = arg3.aShortArray112 = new short[local203];
			} else {
				arg0.aShortArray112 = arg3.aShortArray112;
			}
			for (local203 = 0; local203 < this.anInt7853; local203++) {
				arg0.aShortArray112[local203] = this.aShortArray112[local203];
			}
		} else {
			arg0.aShortArray112 = this.aShortArray112;
		}
		if (!Static505.method7791(arg1, this.anInt7811)) {
			arg0.aClass159Array1 = this.aClass159Array1;
		} else if (arg3.aClass159Array1 == null || this.anInt7801 > arg3.aClass159Array1.length) {
			local203 = this.anInt7801;
			arg0.aClass159Array1 = arg3.aClass159Array1 = new Class159[local203];
			for (local593 = 0; local593 < this.anInt7801; local593++) {
				arg0.aClass159Array1[local593] = this.aClass159Array1[local593].method4591();
			}
		} else {
			arg0.aClass159Array1 = arg3.aClass159Array1;
			for (local203 = 0; local203 < this.anInt7801; local203++) {
				arg0.aClass159Array1[local203].method4590(this.aClass159Array1[local203]);
			}
		}
		arg0.anIntArray499 = this.anIntArray499;
		arg0.aClass87Array5 = this.aClass87Array5;
		arg0.anIntArray502 = this.anIntArray502;
		if (this.aBoolean560) {
			arg0.aShort88 = this.aShort88;
			arg0.aShort90 = this.aShort90;
			arg0.aShort93 = this.aShort93;
			arg0.aShort91 = this.aShort91;
			arg0.aShort94 = this.aShort94;
			arg0.aShort92 = this.aShort92;
			arg0.aBoolean560 = true;
			arg0.aShort95 = this.aShort95;
			arg0.aShort97 = this.aShort97;
		} else {
			arg0.aBoolean560 = false;
		}
		arg0.aClass219Array1 = this.aClass219Array1;
		arg0.aShortArray113 = this.aShortArray113;
		arg0.anIntArrayArray41 = this.anIntArrayArray41;
		arg0.aShortArray114 = this.aShortArray114;
		arg0.anIntArrayArray42 = this.anIntArrayArray42;
		arg0.aShortArray107 = this.aShortArray107;
		arg0.anIntArrayArray43 = this.anIntArrayArray43;
		arg0.aClass227Array5 = this.aClass227Array5;
		return arg0;
	}

	@OriginalMember(owner = "client!paa", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
		}
		this.aShort96 = (short) arg0;
		if (this.aClass223_6 != null) {
			this.aClass223_6.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7860; local3++) {
			this.anIntArray500[local3] = this.anIntArray500[local3] + 7 >> 4;
			this.anIntArray501[local3] = this.anIntArray501[local3] + 7 >> 4;
			this.anIntArray503[local3] = this.anIntArray503[local3] + 7 >> 4;
		}
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
		this.aBoolean560 = false;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!bca;Lclient!iw;II)V")
	@Override
	public void method6678(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7794 == 0) {
			return;
		}
		@Pc(13) Class30_Sub3 local13 = this.aClass20_Sub3_27.aClass30_Sub3_3;
		@Pc(16) Class30_Sub3 local16 = (Class30_Sub3) arg0;
		if (!this.aBoolean560) {
			this.method6714();
		}
		Static80.aFloat80 = local16.aFloat136 * local13.aFloat139 + local13.aFloat138 * local16.aFloat142 + local13.aFloat146 * local16.aFloat138;
		Static249.aFloat148 = local16.aFloat137 * local13.aFloat146 + local13.aFloat139 * local16.aFloat135 + local16.aFloat144 * local13.aFloat138 + local13.aFloat137;
		@Pc(69) float local69 = Static249.aFloat148 + Static80.aFloat80 * (float) this.aShort92;
		@Pc(77) float local77 = Static80.aFloat80 * (float) this.aShort94 + Static249.aFloat148;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local69 > local77) {
			local87 = local69 + (float) this.aShort95;
			local93 = (float) -this.aShort95 + local77;
		} else {
			local87 = (float) this.aShort95 + local77;
			local93 = local69 - (float) this.aShort95;
		}
		if (local93 >= this.aClass20_Sub3_27.aFloat195 || (float) this.aClass20_Sub3_27.anInt8805 >= local87) {
			return;
		}
		Static108.aFloat94 = local13.aFloat145 * local16.aFloat138 + local16.aFloat142 * local13.aFloat136 + local16.aFloat136 * local13.aFloat143;
		Static52.aFloat76 = local13.aFloat145 * local16.aFloat137 + local16.aFloat144 * local13.aFloat136 + local13.aFloat143 * local16.aFloat135 + local13.aFloat135;
		@Pc(170) float local170 = Static52.aFloat76 + (float) this.aShort92 * Static108.aFloat94;
		@Pc(178) float local178 = Static52.aFloat76 + (float) this.aShort94 * Static108.aFloat94;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local170 > local178) {
			local205 = (float) this.aClass20_Sub3_27.anInt8784 * (local170 + (float) this.aShort95);
			local194 = (float) this.aClass20_Sub3_27.anInt8784 * (local178 - (float) this.aShort95);
		} else {
			local194 = (float) this.aClass20_Sub3_27.anInt8784 * ((float) -this.aShort95 + local170);
			local205 = (float) this.aClass20_Sub3_27.anInt8784 * (local178 + (float) this.aShort95);
		}
		if (this.aClass20_Sub3_27.aFloat186 <= local194 / (float) arg2 || local205 / (float) arg2 <= this.aClass20_Sub3_27.aFloat193) {
			return;
		}
		Static556.aFloat207 = local13.aFloat142 * local16.aFloat142 + local16.aFloat136 * local13.aFloat140 + local16.aFloat138 * local13.aFloat141;
		Static408.aFloat166 = local13.aFloat144 + local13.aFloat141 * local16.aFloat137 + local13.aFloat142 * local16.aFloat144 + local13.aFloat140 * local16.aFloat135;
		@Pc(296) float local296 = Static556.aFloat207 * (float) this.aShort92 + Static408.aFloat166;
		@Pc(304) float local304 = Static408.aFloat166 + (float) this.aShort94 * Static556.aFloat207;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local304 < local296) {
			local320 = ((float) -this.aShort95 + local304) * (float) this.aClass20_Sub3_27.anInt8792;
			local331 = (float) this.aClass20_Sub3_27.anInt8792 * ((float) this.aShort95 + local296);
		} else {
			local331 = (float) this.aClass20_Sub3_27.anInt8792 * (local304 + (float) this.aShort95);
			local320 = (float) this.aClass20_Sub3_27.anInt8792 * (local296 - (float) this.aShort95);
		}
		if (local320 / (float) arg2 >= this.aClass20_Sub3_27.aFloat184 || this.aClass20_Sub3_27.aFloat187 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass219Array1 != null) {
			Static72.aFloat69 = local16.aFloat143 * local13.aFloat140 + local13.aFloat142 * local16.aFloat140 + local16.aFloat139 * local13.aFloat141;
			Static70.aFloat79 = local13.aFloat145 * local16.aFloat146 + local16.aFloat145 * local13.aFloat143 + local13.aFloat136 * local16.aFloat141;
			Static139.aFloat103 = local13.aFloat146 * local16.aFloat139 + local16.aFloat143 * local13.aFloat139 + local13.aFloat138 * local16.aFloat140;
			Static498.aFloat198 = local16.aFloat141 * local13.aFloat142 + local16.aFloat145 * local13.aFloat140 + local13.aFloat141 * local16.aFloat146;
			Static585.aFloat210 = local13.aFloat146 * local16.aFloat146 + local16.aFloat141 * local13.aFloat138 + local16.aFloat145 * local13.aFloat139;
			Static425.aFloat169 = local16.aFloat139 * local13.aFloat145 + local16.aFloat140 * local13.aFloat136 + local16.aFloat143 * local13.aFloat143;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort91 + this.aShort88 >> 1;
			@Pc(506) int local506 = this.aShort93 + this.aShort97 >> 1;
			@Pc(525) int local525 = (int) ((float) this.aShort92 * Static108.aFloat94 + (float) local498 * Static425.aFloat169 + Static52.aFloat76 + Static70.aFloat79 * (float) local506);
			@Pc(544) int local544 = (int) (Static408.aFloat166 + (float) local498 * Static72.aFloat69 + Static556.aFloat207 * (float) this.aShort92 + Static498.aFloat198 * (float) local506);
			@Pc(563) int local563 = (int) (Static249.aFloat148 + (float) local498 * Static139.aFloat103 + Static80.aFloat80 * (float) this.aShort92 + Static585.aFloat210 * (float) local506);
			@Pc(582) int local582 = (int) (Static70.aFloat79 * (float) local506 + Static108.aFloat94 * (float) this.aShort94 + Static52.aFloat76 + Static425.aFloat169 * (float) local498);
			@Pc(601) int local601 = (int) (Static408.aFloat166 + Static72.aFloat69 * (float) local498 + Static556.aFloat207 * (float) this.aShort94 + (float) local506 * Static498.aFloat198);
			arg1.anInt5420 = this.aClass20_Sub3_27.anInt8808 + local525 * this.aClass20_Sub3_27.anInt8784 / arg2;
			arg1.anInt5417 = local544 * this.aClass20_Sub3_27.anInt8792 / arg2 + this.aClass20_Sub3_27.anInt8800;
			arg1.anInt5419 = this.aClass20_Sub3_27.anInt8800 + local601 * this.aClass20_Sub3_27.anInt8792 / arg2;
			@Pc(660) int local660 = (int) ((float) local506 * Static585.aFloat210 + Static80.aFloat80 * (float) this.aShort94 + Static139.aFloat103 * (float) local498 + Static249.aFloat148);
			arg1.anInt5421 = this.aClass20_Sub3_27.anInt8808 + local582 * this.aClass20_Sub3_27.anInt8784 / arg2;
			if (this.aClass20_Sub3_27.anInt8805 <= local563 || local660 >= this.aClass20_Sub3_27.anInt8805) {
				arg1.aBoolean411 = true;
				arg1.anInt5418 = this.aClass20_Sub3_27.anInt8808 + this.aClass20_Sub3_27.anInt8784 * (this.aShort95 + local525) / arg2 - arg1.anInt5420;
			}
		}
		this.aClass20_Sub3_27.method7376((float) arg2);
		this.aClass20_Sub3_27.method7347();
		this.aClass20_Sub3_27.method7345(local16);
		this.method6699();
		this.aClass20_Sub3_27.method7321();
		this.method6704();
	}

	@OriginalMember(owner = "client!paa", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort96;
	}

	@OriginalMember(owner = "client!paa", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray41 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7860; local12++) {
			this.anIntArray500[local12] <<= 0x4;
			this.anIntArray501[local12] <<= 0x4;
			this.anIntArray503[local12] <<= 0x4;
		}
		Static509.anInt9344 = 0;
		Static645.anInt11094 = 0;
		Static446.anInt8260 = 0;
		return true;
	}

	@OriginalMember(owner = "client!paa", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort91;
	}

	@OriginalMember(owner = "client!paa", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort97;
	}

	@OriginalMember(owner = "client!paa", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean560) {
			this.method6714();
		}
		@Pc(16) int local16 = this.aShort88 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort91;
		@Pc(28) int local28 = arg6 + this.aShort93;
		@Pc(33) int local33 = this.aShort97 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9615 <= arg2.anInt9620 + local22 >> arg2.anInt9616 || local28 < 0 || arg2.anInt9618 <= local33 + arg2.anInt9620 >> arg2.anInt9616)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9615 <= local22 + arg3.anInt9620 >> arg3.anInt9616 || local28 < 0 || arg3.anInt9618 <= arg3.anInt9620 + local33 >> arg3.anInt9616) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9616;
			local22 = local22 + arg2.anInt9620 - 1 >> arg2.anInt9616;
			local28 >>= arg2.anInt9616;
			local33 = local33 + arg2.anInt9620 - 1 >> arg2.anInt9616;
			if (arg2.method7995(local28, local16) == arg5 && arg2.method7995(local28, local22) == arg5 && arg5 == arg2.method7995(local33, local16) && arg5 == arg2.method7995(local33, local22)) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt7812; local199++) {
				this.anIntArray501[local199] = this.anIntArray501[local199] + arg2.method7999(this.anIntArray500[local199] + arg4, arg6 + this.anIntArray503[local199]) - arg5;
			}
		} else {
			@Pc(257) int local257;
			@Pc(265) int local265;
			if (arg0 == 2) {
				@Pc(463) short local463 = this.aShort92;
				if (local463 == 0) {
					return;
				}
				for (local257 = 0; local257 < this.anInt7812; local257++) {
					local265 = (this.anIntArray501[local257] << 16) / local463;
					if (arg1 > local265) {
						this.anIntArray501[local257] -= -((arg2.method7999(this.anIntArray500[local257] + arg4, arg6 + this.anIntArray503[local257]) - arg5) * (-local265 + arg1) / arg1);
					}
				}
			} else {
				@Pc(273) int local273;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local257 = (arg1 >> 8 & 0xFF) * 4;
					local265 = (arg1 >> 16 & 0xFF) << 6;
					local273 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || (local199 >> 1) + (arg4 + arg2.anInt9620) >= arg2.anInt9615 << arg2.anInt9616 || arg6 - (local257 >> 1) < 0 || (local257 >> 1) + arg6 + arg2.anInt9620 >= arg2.anInt9618 << arg2.anInt9616) {
						return;
					}
					this.method6696(local199, local273, arg4, local257, arg5, local265, arg2, arg6);
				} else if (arg0 == 4) {
					local199 = this.aShort94 - this.aShort92;
					for (local257 = 0; local257 < this.anInt7812; local257++) {
						this.anIntArray501[local257] -= arg5 - arg3.method7999(this.anIntArray500[local257] + arg4, this.anIntArray503[local257] + arg6) - local199;
					}
				} else if (arg0 == 5) {
					local199 = this.aShort94 - this.aShort92;
					for (local257 = 0; local257 < this.anInt7812; local257++) {
						local265 = this.anIntArray500[local257] + arg4;
						local273 = this.anIntArray503[local257] + arg6;
						@Pc(371) int local371 = arg2.method7999(local265, local273);
						@Pc(377) int local377 = arg3.method7999(local265, local273);
						@Pc(385) int local385 = local371 - arg1 - local377;
						this.anIntArray501[local257] = local371 + ((this.anIntArray501[local257] << 8) / local199 * local385 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean560 = false;
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass20_Sub3_27.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7853; local11++) {
			if (this.aShortArray112[local11] == arg0) {
				this.aShortArray112[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class127 local44 = local9.method8048(arg0 & 0xFFFF);
			local33 = local44.aByte79;
			local31 = local44.aByte74;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class127 local64 = local9.method8048(arg1 & 0xFFFF);
			if (local64.aByte73 != 0 || local64.aByte77 != 0) {
				this.aBoolean564 = true;
			}
			local52 = local64.aByte74;
			local54 = local64.aByte79;
		}
		if (!(local54 != local33 | local52 != local31)) {
			return;
		}
		if (this.aClass219Array1 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.anInt7801; local106++) {
				@Pc(113) Class219 local113 = this.aClass219Array1[local106];
				@Pc(118) Class159 local118 = this.aClass159Array1[local106];
				local118.anInt5349 = Static195.anIntArray226[this.aShortArray109[local113.anInt7327] & 0xFFFF] & 0xFFFFFF | local118.anInt5349 & 0xFF000000;
			}
		}
		if (this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IZ)V")
	private void method6710(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass223_8 != null && this.aClass223_8.anInterface11_2 == null;
		@Pc(27) boolean local27 = this.aClass223_6 != null && this.aClass223_6.anInterface11_2 == null;
		@Pc(38) boolean local38 = this.aClass223_7 != null && this.aClass223_7.anInterface11_2 == null;
		@Pc(49) boolean local49 = this.aClass223_9 != null && this.aClass223_9.anInterface11_2 == null;
		if (arg0) {
			local49 &= (this.aByte114 & 0x8) != 0;
			local27 &= (this.aByte114 & 0x4) != 0;
			local16 &= (this.aByte114 & 0x2) != 0;
			local38 &= (this.aByte114 & 0x1) != 0;
		}
		@Pc(97) byte local97 = 0;
		@Pc(105) byte local105 = 0;
		@Pc(107) byte local107 = 0;
		if (local38) {
			local97 = 12;
		}
		@Pc(118) byte local118 = 0;
		if (local16) {
			local105 = local97;
			local97 = (byte) (local97 + 4);
		}
		if (local27) {
			local107 = local97;
			local97 = (byte) (local97 + 12);
		}
		if (local49) {
			local118 = local97;
			local97 = (byte) (local97 + 8);
		}
		if (local97 == 0) {
			return;
		}
		if (this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1.aByteArray128.length < this.anInt7794 * local97) {
			this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1 = new Class2_Sub11_Sub1(local97 * (this.anInt7794 + 100));
		} else {
			this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1.anInt10066 = 0;
		}
		@Pc(185) Class2_Sub11_Sub1 local185 = this.aClass20_Sub3_27.aClass2_Sub11_Sub1_1;
		@Pc(193) int local193;
		@Pc(202) int local202;
		@Pc(230) int local230;
		@Pc(239) int local239;
		if (local38) {
			@Pc(209) int local209;
			@Pc(216) int local216;
			@Pc(221) int local221;
			@Pc(228) int local228;
			if (this.aClass20_Sub3_27.aBoolean616) {
				for (local193 = 0; local193 < this.anInt7812; local193++) {
					local202 = Stream.floatToRawIntBits((float) this.anIntArray500[local193]);
					local209 = Stream.floatToRawIntBits((float) this.anIntArray501[local193]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray503[local193]);
					local221 = this.anIntArray499[local193];
					local228 = this.anIntArray499[local193 + 1];
					for (local230 = local221; local230 < local228; local230++) {
						local239 = this.aShortArray114[local230] - 1;
						if (local239 == -1) {
							break;
						}
						local185.anInt10066 = local97 * local239;
						local185.method8387(local202);
						local185.method8387(local209);
						local185.method8387(local216);
					}
				}
			} else {
				for (local193 = 0; local193 < this.anInt7812; local193++) {
					local202 = Stream.floatToRawIntBits((float) this.anIntArray500[local193]);
					local209 = Stream.floatToRawIntBits((float) this.anIntArray501[local193]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray503[local193]);
					local221 = this.anIntArray499[local193];
					local228 = this.anIntArray499[local193 + 1];
					for (local230 = local221; local230 < local228; local230++) {
						local239 = this.aShortArray114[local230] - 1;
						if (local239 == -1) {
							break;
						}
						local185.anInt10066 = local97 * local239;
						local185.method8390(local202);
						local185.method8390(local209);
						local185.method8390(local216);
					}
				}
			}
		}
		@Pc(487) float local487;
		@Pc(366) short[] local366;
		@Pc(374) short[] local374;
		@Pc(370) short[] local370;
		@Pc(378) byte[] local378;
		@Pc(528) float local528;
		if (local16) {
			if (this.aClass223_6 == null) {
				if (this.aClass235_1 == null) {
					local370 = this.lb;
					local378 = this.aByteArray104;
					local374 = this.aShortArray110;
					local366 = this.aShortArray105;
				} else {
					local366 = this.aClass235_1.aShortArray94;
					local370 = this.aClass235_1.aShortArray93;
					local374 = this.aClass235_1.aShortArray92;
					local378 = this.aClass235_1.aByteArray98;
				}
				@Pc(398) float local398 = this.aClass20_Sub3_27.aFloatArray75[0];
				@Pc(404) float local404 = this.aClass20_Sub3_27.aFloatArray75[1];
				@Pc(410) float local410 = this.aClass20_Sub3_27.aFloatArray75[2];
				@Pc(414) float local414 = this.aClass20_Sub3_27.aFloat175;
				@Pc(424) float local424 = this.aClass20_Sub3_27.aFloat185 * 768.0F / (float) this.aShort96;
				@Pc(434) float local434 = this.aClass20_Sub3_27.aFloat192 * 768.0F / (float) this.aShort96;
				for (@Pc(436) int local436 = 0; local436 < this.anInt7853; local436++) {
					@Pc(456) int local456 = this.method6702(this.aShort89, this.aByteArray103[local436], this.aShortArray112[local436], this.aShortArray109[local436]);
					@Pc(465) float local465 = this.aClass20_Sub3_27.aFloat176 * (float) (local456 >>> 24);
					@Pc(476) float local476 = (float) (local456 >> 8 & 0xFF) * this.aClass20_Sub3_27.aFloat181;
					local487 = (float) (local456 >> 16 & 0xFF) * this.aClass20_Sub3_27.aFloat180;
					@Pc(492) short local492 = this.aShortArray111[local436];
					@Pc(497) short local497 = (short) local378[local492];
					if (local497 == 0) {
						local528 = ((float) local370[local492] * local410 + local398 * (float) local366[local492] + (float) local374[local492] * local404) * 0.0026041667F;
					} else {
						local528 = (local404 * (float) local374[local492] + local398 * (float) local366[local492] + local410 * (float) local370[local492]) / (float) (local497 * 256);
					}
					@Pc(565) float local565 = local414 + local528 * (local528 < 0.0F ? local434 : local424);
					@Pc(570) int local570 = (int) (local565 * local465);
					@Pc(575) int local575 = (int) (local565 * local487);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					@Pc(596) int local596 = (int) (local565 * local476);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local185.anInt10066 = local492 * local97 + local105;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local185.method8374(local570);
					local185.method8374(local575);
					local185.method8374(local596);
					local185.method8374(255 - (this.aByteArray103[local436] & 0xFF));
					local492 = this.aShortArray108[local436];
					local497 = local378[local492];
					if (local497 == 0) {
						local528 = (local398 * (float) local366[local492] + (float) local374[local492] * local404 + local410 * (float) local370[local492]) * 0.0026041667F;
					} else {
						local528 = ((float) local370[local492] * local410 + local398 * (float) local366[local492] + (float) local374[local492] * local404) / (float) (local497 * 256);
					}
					local565 = local414 + local528 * (local528 < 0.0F ? local434 : local424);
					local570 = (int) (local465 * local565);
					local575 = (int) (local565 * local487);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local596 = (int) (local565 * local476);
					local185.anInt10066 = local105 + local492 * local97;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local185.method8374(local570);
					local185.method8374(local575);
					local185.method8374(local596);
					local185.method8374(255 - (this.aByteArray103[local436] & 0xFF));
					local492 = this.aShortArray106[local436];
					local497 = local378[local492];
					if (local497 == 0) {
						local528 = ((float) local370[local492] * local410 + (float) local374[local492] * local404 + local398 * (float) local366[local492]) * 0.0026041667F;
					} else {
						local528 = ((float) local370[local492] * local410 + (float) local374[local492] * local404 + (float) local366[local492] * local398) / (float) (local497 * 256);
					}
					local565 = local414 + (local528 < 0.0F ? local434 : local424) * local528;
					local570 = (int) (local565 * local465);
					local575 = (int) (local565 * local487);
					if (local570 < 0) {
						local570 = 0;
					} else if (local570 > 255) {
						local570 = 255;
					}
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local596 = (int) (local476 * local565);
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local185.anInt10066 = local97 * local492 + local105;
					local185.method8374(local570);
					local185.method8374(local575);
					local185.method8374(local596);
					local185.method8374(255 - (this.aByteArray103[local436] & 0xFF));
				}
			} else {
				for (local193 = 0; local193 < this.anInt7853; local193++) {
					local202 = this.method6702(this.aShort89, this.aByteArray103[local193], this.aShortArray112[local193], this.aShortArray109[local193]);
					local185.anInt10066 = local105 + this.aShortArray111[local193] * local97;
					local185.method8387(local202);
					local185.anInt10066 = local105 + this.aShortArray108[local193] * local97;
					local185.method8387(local202);
					local185.anInt10066 = local105 + local97 * this.aShortArray106[local193];
					local185.method8387(local202);
				}
			}
		}
		if (local27) {
			if (this.aClass235_1 == null) {
				local366 = this.aShortArray105;
				local374 = this.aShortArray110;
				local378 = this.aByteArray104;
				local370 = this.lb;
			} else {
				local378 = this.aClass235_1.aByteArray98;
				local374 = this.aClass235_1.aShortArray92;
				local370 = this.aClass235_1.aShortArray93;
				local366 = this.aClass235_1.aShortArray94;
			}
			@Pc(1097) float local1097 = 3.0F / (float) this.aShort96;
			local185.anInt10066 = local107;
			local528 = 3.0F / (float) (this.aShort96 / 2 + this.aShort96);
			if (this.aClass20_Sub3_27.aBoolean616) {
				for (local230 = 0; local230 < this.anInt7794; local230++) {
					local239 = local378[local230] & 0xFF;
					if (local239 == 0) {
						local185.method3862(local528 * (float) local366[local230]);
						local185.method3862((float) local374[local230] * local528);
						local185.method3862(local528 * (float) local370[local230]);
					} else {
						local487 = local1097 / (float) local239;
						local185.method3862((float) local366[local230] * local487);
						local185.method3862(local487 * (float) local374[local230]);
						local185.method3862((float) local370[local230] * local487);
					}
					local185.anInt10066 += local97 - 12;
				}
			} else {
				for (local230 = 0; local230 < this.anInt7794; local230++) {
					local239 = local378[local230] & 0xFF;
					if (local239 == 0) {
						local185.method3861((float) local366[local230] * local528);
						local185.method3861((float) local374[local230] * local528);
						local185.method3861(local528 * (float) local370[local230]);
					} else {
						local487 = local1097 / (float) local239;
						local185.method3861((float) local366[local230] * local487);
						local185.method3861(local487 * (float) local374[local230]);
						local185.method3861(local487 * (float) local370[local230]);
					}
					local185.anInt10066 += local97 - 12;
				}
			}
		}
		if (local49) {
			local185.anInt10066 = local118;
			if (this.aClass20_Sub3_27.aBoolean616) {
				for (local193 = 0; local193 < this.anInt7794; local193++) {
					local185.method3862(this.aFloatArray68[local193]);
					local185.method3862(this.aFloatArray69[local193]);
					local185.anInt10066 += local97 - 8;
				}
			} else {
				for (local193 = 0; local193 < this.anInt7794; local193++) {
					local185.method3861(this.aFloatArray68[local193]);
					local185.method3861(this.aFloatArray69[local193]);
					local185.anInt10066 += local97 - 8;
				}
			}
		}
		local185.anInt10066 = this.anInt7794 * local97;
		@Pc(1413) Interface11 local1413;
		if (arg0) {
			if (this.anInterface11_3 == null) {
				this.anInterface11_3 = this.aClass20_Sub3_27.method7318(true, local97, local185.aByteArray128, local185.anInt10066);
			} else {
				this.anInterface11_3.method5046(local97, local185.anInt10066, local185.aByteArray128);
			}
			local1413 = this.anInterface11_3;
			this.aByte114 = 0;
		} else {
			local1413 = this.aClass20_Sub3_27.method7318(false, local97, local185.aByteArray128, local185.anInt10066);
			this.aBoolean561 = true;
		}
		if (local38) {
			this.aClass223_7.aByte110 = 0;
			this.aClass223_7.anInterface11_2 = local1413;
		}
		if (local49) {
			this.aClass223_9.aByte110 = local118;
			this.aClass223_9.anInterface11_2 = local1413;
		}
		if (local16) {
			this.aClass223_8.aByte110 = local105;
			this.aClass223_8.anInterface11_2 = local1413;
		}
		if (local27) {
			this.aClass223_6.aByte110 = local107;
			this.aClass223_6.anInterface11_2 = local1413;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!bca;Lclient!iw;I)V")
	@Override
	public void method6685(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7794 == 0) {
			return;
		}
		@Pc(13) Class30_Sub3 local13 = this.aClass20_Sub3_27.aClass30_Sub3_3;
		if (!this.aBoolean560) {
			this.method6714();
		}
		@Pc(22) Class30_Sub3 local22 = (Class30_Sub3) arg0;
		Static80.aFloat80 = local22.aFloat138 * local13.aFloat146 + local22.aFloat136 * local13.aFloat139 + local22.aFloat142 * local13.aFloat138;
		Static249.aFloat148 = local13.aFloat137 + local13.aFloat139 * local22.aFloat135 + local22.aFloat144 * local13.aFloat138 + local22.aFloat137 * local13.aFloat146;
		@Pc(69) float local69 = Static249.aFloat148 + Static80.aFloat80 * (float) this.aShort92;
		@Pc(77) float local77 = Static80.aFloat80 * (float) this.aShort94 + Static249.aFloat148;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local69 > local77) {
			local87 = local77 - (float) this.aShort95;
			local93 = local69 + (float) this.aShort95;
		} else {
			local87 = (float) -this.aShort95 + local69;
			local93 = local77 + (float) this.aShort95;
		}
		if (this.aClass20_Sub3_27.aFloat194 <= local87 || (float) this.aClass20_Sub3_27.anInt8805 >= local93) {
			return;
		}
		Static108.aFloat94 = local13.aFloat136 * local22.aFloat142 + local22.aFloat136 * local13.aFloat143 + local13.aFloat145 * local22.aFloat138;
		Static52.aFloat76 = local13.aFloat135 + local13.aFloat145 * local22.aFloat137 + local13.aFloat143 * local22.aFloat135 + local22.aFloat144 * local13.aFloat136;
		@Pc(170) float local170 = (float) this.aShort92 * Static108.aFloat94 + Static52.aFloat76;
		@Pc(178) float local178 = (float) this.aShort94 * Static108.aFloat94 + Static52.aFloat76;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local170 > local178) {
			local205 = (float) this.aClass20_Sub3_27.anInt8784 * ((float) -this.aShort95 + local178);
			local193 = (float) this.aClass20_Sub3_27.anInt8784 * ((float) this.aShort95 + local170);
		} else {
			local193 = (float) this.aClass20_Sub3_27.anInt8784 * (local178 + (float) this.aShort95);
			local205 = ((float) -this.aShort95 + local170) * (float) this.aClass20_Sub3_27.anInt8784;
		}
		if (this.aClass20_Sub3_27.aFloat186 <= local205 / local93 || local193 / local93 <= this.aClass20_Sub3_27.aFloat193) {
			return;
		}
		Static408.aFloat166 = local22.aFloat144 * local13.aFloat142 + local22.aFloat135 * local13.aFloat140 + local13.aFloat141 * local22.aFloat137 + local13.aFloat144;
		Static556.aFloat207 = local13.aFloat140 * local22.aFloat136 + local13.aFloat142 * local22.aFloat142 + local13.aFloat141 * local22.aFloat138;
		@Pc(295) float local295 = Static408.aFloat166 + Static556.aFloat207 * (float) this.aShort92;
		@Pc(303) float local303 = Static408.aFloat166 + (float) this.aShort94 * Static556.aFloat207;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local295 > local303) {
			local318 = ((float) this.aShort95 + local295) * (float) this.aClass20_Sub3_27.anInt8792;
			local329 = (float) this.aClass20_Sub3_27.anInt8792 * (local303 - (float) this.aShort95);
		} else {
			local318 = ((float) this.aShort95 + local303) * (float) this.aClass20_Sub3_27.anInt8792;
			local329 = (float) this.aClass20_Sub3_27.anInt8792 * (local295 - (float) this.aShort95);
		}
		if (local329 / local93 >= this.aClass20_Sub3_27.aFloat184 || this.aClass20_Sub3_27.aFloat187 >= local318 / local93) {
			return;
		}
		if (arg1 != null || this.aClass219Array1 != null) {
			Static585.aFloat210 = local22.aFloat141 * local13.aFloat138 + local22.aFloat145 * local13.aFloat139 + local22.aFloat146 * local13.aFloat146;
			Static139.aFloat103 = local13.aFloat146 * local22.aFloat139 + local22.aFloat143 * local13.aFloat139 + local13.aFloat138 * local22.aFloat140;
			Static70.aFloat79 = local13.aFloat145 * local22.aFloat146 + local22.aFloat141 * local13.aFloat136 + local22.aFloat145 * local13.aFloat143;
			Static72.aFloat69 = local13.aFloat140 * local22.aFloat143 + local22.aFloat140 * local13.aFloat142 + local22.aFloat139 * local13.aFloat141;
			Static425.aFloat169 = local22.aFloat140 * local13.aFloat136 + local13.aFloat143 * local22.aFloat143 + local13.aFloat145 * local22.aFloat139;
			Static498.aFloat198 = local22.aFloat146 * local13.aFloat141 + local13.aFloat142 * local22.aFloat141 + local13.aFloat140 * local22.aFloat145;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(499) int local499 = this.aShort88 + this.aShort91 >> 1;
			@Pc(508) int local508 = this.aShort93 + this.aShort97 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static70.aFloat79 + Static425.aFloat169 * (float) local499 + Static52.aFloat76 + (float) this.aShort92 * Static108.aFloat94);
			@Pc(546) int local546 = (int) (Static408.aFloat166 + (float) local499 * Static72.aFloat69 + (float) this.aShort92 * Static556.aFloat207 + (float) local508 * Static498.aFloat198);
			@Pc(565) int local565 = (int) (Static139.aFloat103 * (float) local499 + Static249.aFloat148 + Static80.aFloat80 * (float) this.aShort92 + Static585.aFloat210 * (float) local508);
			if (local565 >= this.aClass20_Sub3_27.anInt8805) {
				arg1.anInt5420 = local527 * this.aClass20_Sub3_27.anInt8784 / local565 + this.aClass20_Sub3_27.anInt8808;
				arg1.anInt5417 = local546 * this.aClass20_Sub3_27.anInt8792 / local565 + this.aClass20_Sub3_27.anInt8800;
			} else {
				local488 = true;
			}
			@Pc(623) int local623 = (int) (Static52.aFloat76 + Static425.aFloat169 * (float) local499 + Static108.aFloat94 * (float) this.aShort94 + Static70.aFloat79 * (float) local508);
			@Pc(642) int local642 = (int) ((float) local508 * Static498.aFloat198 + Static556.aFloat207 * (float) this.aShort94 + Static408.aFloat166 + Static72.aFloat69 * (float) local499);
			@Pc(661) int local661 = (int) (Static585.aFloat210 * (float) local508 + (float) local499 * Static139.aFloat103 + Static249.aFloat148 + (float) this.aShort94 * Static80.aFloat80);
			if (local661 >= this.aClass20_Sub3_27.anInt8805) {
				arg1.anInt5421 = local623 * this.aClass20_Sub3_27.anInt8784 / local661 + this.aClass20_Sub3_27.anInt8808;
				arg1.anInt5419 = local642 * this.aClass20_Sub3_27.anInt8792 / local661 + this.aClass20_Sub3_27.anInt8800;
			} else {
				local488 = true;
			}
			if (local488) {
				if (this.aClass20_Sub3_27.anInt8805 > local565 && local661 < this.aClass20_Sub3_27.anInt8805) {
					local490 = false;
				} else {
					@Pc(735) int local735;
					@Pc(746) int local746;
					@Pc(772) int local772;
					if (this.aClass20_Sub3_27.anInt8805 > local565) {
						local735 = (local661 - this.aClass20_Sub3_27.anInt8805 << 16) / (local661 - local565);
						local746 = ((local623 - local527) * local735 >> 16) + local623;
						arg1.anInt5420 = this.aClass20_Sub3_27.anInt8808 + local746 * this.aClass20_Sub3_27.anInt8784 / this.aClass20_Sub3_27.anInt8805;
						local772 = (local735 * (local642 - local546) >> 16) + local642;
						arg1.anInt5417 = local772 * this.aClass20_Sub3_27.anInt8792 / this.aClass20_Sub3_27.anInt8805 + this.aClass20_Sub3_27.anInt8800;
					} else if (this.aClass20_Sub3_27.anInt8805 > local661) {
						local735 = (local565 - this.aClass20_Sub3_27.anInt8805 << 16) / (local565 - local661);
						local746 = local527 + (local735 * (local527 - local623) >> 16);
						local772 = ((local546 - local642) * local735 >> 16) + local546;
						arg1.anInt5420 = local746 * this.aClass20_Sub3_27.anInt8784 / this.aClass20_Sub3_27.anInt8805 + this.aClass20_Sub3_27.anInt8808;
						arg1.anInt5417 = this.aClass20_Sub3_27.anInt8800 + this.aClass20_Sub3_27.anInt8792 * local772 / this.aClass20_Sub3_27.anInt8805;
					}
				}
			}
			if (local490) {
				if (local661 < local565) {
					arg1.anInt5418 = this.aClass20_Sub3_27.anInt8808 + this.aClass20_Sub3_27.anInt8784 * (local527 + this.aShort95) / local565 - arg1.anInt5420;
				} else {
					arg1.anInt5418 = this.aClass20_Sub3_27.anInt8808 + this.aClass20_Sub3_27.anInt8784 * (this.aShort95 + local623) / local661 - arg1.anInt5421;
				}
				arg1.aBoolean411 = true;
			}
		}
		this.aClass20_Sub3_27.method7371();
		this.aClass20_Sub3_27.method7345(local22);
		this.method6699();
		this.aClass20_Sub3_27.method7321();
		this.method6704();
	}

	@OriginalMember(owner = "client!paa", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort89;
	}

	@OriginalMember(owner = "client!paa", name = "c", descriptor = "(B)V")
	private void method6713() {
		if (!this.aBoolean561) {
			return;
		}
		this.aBoolean561 = false;
		if (this.aClass227Array5 == null && this.aClass87Array5 == null && this.aClass219Array1 == null) {
			if (this.anIntArray500 != null && !Static112.method2834(this.anInt7862, this.anInt7811)) {
				if (this.aClass223_7 != null && this.aClass223_7.anInterface11_2 == null) {
					this.aBoolean561 = true;
				} else {
					if (!this.aBoolean560) {
						this.method6714();
					}
					this.anIntArray500 = null;
				}
			}
			if (this.anIntArray501 != null && !Static119.method2925(this.anInt7811, this.anInt7862)) {
				if (this.aClass223_7 != null && this.aClass223_7.anInterface11_2 == null) {
					this.aBoolean561 = true;
				} else {
					if (!this.aBoolean560) {
						this.method6714();
					}
					this.anIntArray501 = null;
				}
			}
			if (this.anIntArray503 != null && !Static404.method6580(this.anInt7862, this.anInt7811)) {
				if (this.aClass223_7 != null && this.aClass223_7.anInterface11_2 == null) {
					this.aBoolean561 = true;
				} else {
					if (!this.aBoolean560) {
						this.method6714();
					}
					this.anIntArray503 = null;
				}
			}
		}
		if (this.aShortArray114 != null && this.anIntArray500 == null && this.anIntArray501 == null && this.anIntArray503 == null) {
			this.aShortArray114 = null;
			this.anIntArray499 = null;
		}
		if (this.aByteArray104 != null && !Static256.method4725(this.anInt7862, this.anInt7811)) {
			if (this.aClass223_6 == null) {
				if (this.aClass223_8 != null && this.aClass223_8.anInterface11_2 == null) {
					this.aBoolean561 = true;
				} else {
					this.aByteArray104 = null;
					this.aShortArray105 = this.aShortArray110 = this.lb = null;
				}
			} else if (this.aClass223_6.anInterface11_2 == null) {
				this.aBoolean561 = true;
			} else {
				this.aByteArray104 = null;
				this.aShortArray105 = this.aShortArray110 = this.lb = null;
			}
		}
		if (this.aShortArray109 != null && !Static73.method2126(this.anInt7862, this.anInt7811)) {
			if (this.aClass223_8 != null && this.aClass223_8.anInterface11_2 == null) {
				this.aBoolean561 = true;
			} else {
				this.aShortArray109 = null;
			}
		}
		if (this.aByteArray103 != null && !Static164.method3545(this.anInt7811, this.anInt7862)) {
			if (this.aClass223_8 != null && this.aClass223_8.anInterface11_2 == null) {
				this.aBoolean561 = true;
			} else {
				this.aByteArray103 = null;
			}
		}
		if (this.aFloatArray68 != null && !Static341.method5873(this.anInt7862, this.anInt7811)) {
			if (this.aClass223_9 != null && this.aClass223_9.anInterface11_2 == null) {
				this.aBoolean561 = true;
			} else {
				this.aFloatArray68 = this.aFloatArray69 = null;
			}
		}
		if (this.aShortArray112 != null && !Static472.method7445(this.anInt7811, this.anInt7862)) {
			if (this.aClass223_8 != null && this.aClass223_8.anInterface11_2 == null) {
				this.aBoolean561 = true;
			} else {
				this.aShortArray112 = null;
			}
		}
		if (this.aShortArray111 != null && !Static288.method5235(this.anInt7862, this.anInt7811)) {
			if ((this.aClass348_1 == null || this.aClass348_1.anInterface18_5 != null) && (this.aClass223_8 == null || this.aClass223_8.anInterface11_2 != null)) {
				this.aShortArray111 = this.aShortArray108 = this.aShortArray106 = null;
			} else {
				this.aBoolean561 = true;
			}
		}
		if (this.anIntArrayArray42 != null && !Static239.method4465(this.anInt7862, this.anInt7811)) {
			this.aShortArray107 = null;
			this.anIntArrayArray42 = null;
		}
		if (this.anIntArrayArray41 != null && !Static69.method2113(this.anInt7811, this.anInt7862)) {
			this.anIntArrayArray41 = null;
			this.aShortArray113 = null;
		}
		if (this.anIntArrayArray43 != null && !Static517.method7857(this.anInt7862, this.anInt7811)) {
			this.anIntArrayArray43 = null;
		}
		if (this.anIntArray502 != null && (this.anInt7862 & 0x800) == 0 && (this.anInt7862 & 0x40000) == 0) {
			this.anIntArray502 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "e", descriptor = "()V")
	@Override
	protected void method6691() {
	}

	@OriginalMember(owner = "client!paa", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7853; local7++) {
			if (arg0 == this.aShortArray109[local7]) {
				this.aShortArray109[local7] = arg1;
			}
		}
		if (this.aClass219Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt7801; local30++) {
				@Pc(37) Class219 local37 = this.aClass219Array1[local30];
				@Pc(42) Class159 local42 = this.aClass159Array1[local30];
				local42.anInt5349 = Static195.anIntArray226[this.aShortArray109[local37.anInt7327] & 0xFFFF] & 0xFFFFFF | local42.anInt5349 & 0xFF000000;
			}
		}
		if (this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "()[Lclient!nn;")
	@Override
	public Class227[] method6689() {
		return this.aClass227Array5;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "()[Lclient!eca;")
	@Override
	public Class87[] method6674() {
		return this.aClass87Array5;
	}

	@OriginalMember(owner = "client!paa", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort88;
	}

	@OriginalMember(owner = "client!paa", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean564;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method6690(@OriginalArg(0) Class30 arg0) {
		@Pc(8) Class30_Sub3 local8 = (Class30_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass227Array5 != null) {
			for (local13 = 0; local13 < this.aClass227Array5.length; local13++) {
				@Pc(20) Class227 local20 = this.aClass227Array5[local13];
				@Pc(22) Class227 local22 = local20;
				if (local20.aClass227_1 != null) {
					local22 = local20.aClass227_1;
				}
				local22.anInt7394 = (int) (local8.aFloat135 + (float) this.anIntArray501[local20.anInt7393] * local8.aFloat136 + local8.aFloat143 * (float) this.anIntArray500[local20.anInt7393] + (float) this.anIntArray503[local20.anInt7393] * local8.aFloat145);
				local22.anInt7400 = (int) (local8.aFloat144 + (float) this.anIntArray501[local20.anInt7393] * local8.aFloat142 + local8.aFloat140 * (float) this.anIntArray500[local20.anInt7393] + (float) this.anIntArray503[local20.anInt7393] * local8.aFloat141);
				local22.anInt7398 = (int) (local8.aFloat137 + (float) this.anIntArray500[local20.anInt7393] * local8.aFloat139 + local8.aFloat138 * (float) this.anIntArray501[local20.anInt7393] + (float) this.anIntArray503[local20.anInt7393] * local8.aFloat146);
				local22.anInt7395 = (int) (local8.aFloat135 + local8.aFloat143 * (float) this.anIntArray500[local20.anInt7390] + (float) this.anIntArray501[local20.anInt7390] * local8.aFloat136 + (float) this.anIntArray503[local20.anInt7390] * local8.aFloat145);
				local22.anInt7399 = (int) (local8.aFloat144 + local8.aFloat141 * (float) this.anIntArray503[local20.anInt7390] + (float) this.anIntArray500[local20.anInt7390] * local8.aFloat140 + (float) this.anIntArray501[local20.anInt7390] * local8.aFloat142);
				local22.anInt7392 = (int) (local8.aFloat137 + local8.aFloat146 * (float) this.anIntArray503[local20.anInt7390] + local8.aFloat138 * (float) this.anIntArray501[local20.anInt7390] + (float) this.anIntArray500[local20.anInt7390] * local8.aFloat139);
				local22.anInt7389 = (int) (local8.aFloat135 + (float) this.anIntArray501[local20.anInt7401] * local8.aFloat136 + (float) this.anIntArray500[local20.anInt7401] * local8.aFloat143 + local8.aFloat145 * (float) this.anIntArray503[local20.anInt7401]);
				local22.anInt7388 = (int) (local8.aFloat144 + (float) this.anIntArray503[local20.anInt7401] * local8.aFloat141 + local8.aFloat140 * (float) this.anIntArray500[local20.anInt7401] + local8.aFloat142 * (float) this.anIntArray501[local20.anInt7401]);
				local22.anInt7396 = (int) (local8.aFloat138 * (float) this.anIntArray501[local20.anInt7401] + local8.aFloat139 * (float) this.anIntArray500[local20.anInt7401] + (float) this.anIntArray503[local20.anInt7401] * local8.aFloat146 + local8.aFloat137);
			}
		}
		if (this.aClass87Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass87Array5.length; local13++) {
			@Pc(361) Class87 local361 = this.aClass87Array5[local13];
			@Pc(363) Class87 local363 = local361;
			if (local361.aClass87_1 != null) {
				local363 = local361.aClass87_1;
			}
			if (local361.aClass30_4 == null) {
				local361.aClass30_4 = local8.method4662();
			} else {
				local361.aClass30_4.method4653(local8);
			}
			local363.anInt3133 = (int) (local8.aFloat135 + (float) this.anIntArray503[local361.anInt3139] * local8.aFloat145 + (float) this.anIntArray500[local361.anInt3139] * local8.aFloat143 + local8.aFloat136 * (float) this.anIntArray501[local361.anInt3139]);
			local363.anInt3134 = (int) (local8.aFloat144 + (float) this.anIntArray501[local361.anInt3139] * local8.aFloat142 + local8.aFloat140 * (float) this.anIntArray500[local361.anInt3139] + (float) this.anIntArray503[local361.anInt3139] * local8.aFloat141);
			local363.anInt3135 = (int) (local8.aFloat137 + (float) this.anIntArray503[local361.anInt3139] * local8.aFloat146 + (float) this.anIntArray500[local361.anInt3139] * local8.aFloat139 + (float) this.anIntArray501[local361.anInt3139] * local8.aFloat138);
		}
	}

	@OriginalMember(owner = "client!paa", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort90;
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6675(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static446.anInt8260 = 0;
			local29 = 0;
			Static509.anInt9344 = 0;
			Static645.anInt11094 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray41.length) {
					local51 = this.anIntArrayArray41[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static645.anInt11094 += this.anIntArray500[local59];
						Static509.anInt9344 += this.anIntArray501[local59];
						local29++;
						Static446.anInt8260 += this.anIntArray503[local59];
					}
				}
			}
			if (local29 <= 0) {
				Static509.anInt9344 = local21;
				Static446.anInt8260 = local17;
				Static645.anInt11094 = local25;
			} else {
				Static509.anInt9344 = local21 + Static509.anInt9344 / local29;
				Static645.anInt11094 = Static645.anInt11094 / local29 + local25;
				Static446.anInt8260 = local17 + Static446.anInt8260 / local29;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local25 = arg2 << 4;
			local21 = arg3 << 4;
			local17 = arg4 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray41.length) {
					local157 = this.anIntArrayArray41[local35];
					for (local159 = 0; local159 < local157.length; local159++) {
						local53 = local157[local159];
						this.anIntArray500[local53] += local25;
						this.anIntArray501[local53] += local21;
						this.anIntArray503[local53] += local17;
					}
				}
			}
			return;
		}
		@Pc(269) int local269;
		@Pc(288) int local288;
		@Pc(746) int local746;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray41.length > local35) {
					local157 = this.anIntArrayArray41[local35];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local53 = local157[local159];
							this.anIntArray500[local53] -= Static645.anInt11094;
							this.anIntArray501[local53] -= Static509.anInt9344;
							this.anIntArray503[local53] -= Static446.anInt8260;
							if (arg4 != 0) {
								local59 = Class177.anIntArray361[arg4];
								local269 = Class177.anIntArray360[arg4];
								local288 = this.anIntArray500[local53] * local269 + local59 * this.anIntArray501[local53] + 16383 >> 14;
								this.anIntArray501[local53] = this.anIntArray501[local53] * local269 + 16383 - local59 * this.anIntArray500[local53] >> 14;
								this.anIntArray500[local53] = local288;
							}
							if (arg2 != 0) {
								local59 = Class177.anIntArray361[arg2];
								local269 = Class177.anIntArray360[arg2];
								local288 = local269 * this.anIntArray501[local53] + 16383 - this.anIntArray503[local53] * local59 >> 14;
								this.anIntArray503[local53] = local269 * this.anIntArray503[local53] + local59 * this.anIntArray501[local53] + 16383 >> 14;
								this.anIntArray501[local53] = local288;
							}
							if (arg3 != 0) {
								local59 = Class177.anIntArray361[arg3];
								local269 = Class177.anIntArray360[arg3];
								local288 = local59 * this.anIntArray503[local53] + local269 * this.anIntArray500[local53] + 16383 >> 14;
								this.anIntArray503[local53] = this.anIntArray503[local53] * local269 + 16383 - this.anIntArray500[local53] * local59 >> 14;
								this.anIntArray500[local53] = local288;
							}
							this.anIntArray500[local53] += Static645.anInt11094;
							this.anIntArray501[local53] += Static509.anInt9344;
							this.anIntArray503[local53] += Static446.anInt8260;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local53 = local157[local159];
							this.anIntArray500[local53] -= Static645.anInt11094;
							this.anIntArray501[local53] -= Static509.anInt9344;
							this.anIntArray503[local53] -= Static446.anInt8260;
							if (arg2 != 0) {
								local59 = Class177.anIntArray361[arg2];
								local269 = Class177.anIntArray360[arg2];
								local288 = local269 * this.anIntArray501[local53] + 16383 - this.anIntArray503[local53] * local59 >> 14;
								this.anIntArray503[local53] = this.anIntArray501[local53] * local59 + local269 * this.anIntArray503[local53] + 16383 >> 14;
								this.anIntArray501[local53] = local288;
							}
							if (arg4 != 0) {
								local59 = Class177.anIntArray361[arg4];
								local269 = Class177.anIntArray360[arg4];
								local288 = this.anIntArray500[local53] * local269 + local59 * this.anIntArray501[local53] + 16383 >> 14;
								this.anIntArray501[local53] = this.anIntArray501[local53] * local269 + 16383 - local59 * this.anIntArray500[local53] >> 14;
								this.anIntArray500[local53] = local288;
							}
							if (arg3 != 0) {
								local59 = Class177.anIntArray361[arg3];
								local269 = Class177.anIntArray360[arg3];
								local288 = local59 * this.anIntArray503[local53] + this.anIntArray500[local53] * local269 + 16383 >> 14;
								this.anIntArray503[local53] = this.anIntArray503[local53] * local269 + 16383 - local59 * this.anIntArray500[local53] >> 14;
								this.anIntArray500[local53] = local288;
							}
							this.anIntArray500[local53] += Static645.anInt11094;
							this.anIntArray501[local53] += Static509.anInt9344;
							this.anIntArray503[local53] += Static446.anInt8260;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray41.length) {
						local51 = this.anIntArrayArray41[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local269 = this.anIntArray499[local59];
							local288 = this.anIntArray499[local59 + 1];
							for (local746 = local269; local746 < local288; local746++) {
								@Pc(755) int local755 = this.aShortArray114[local746] - 1;
								if (local755 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(790) int local790;
								if (arg4 != 0) {
									local768 = Class177.anIntArray361[arg4];
									local772 = Class177.anIntArray360[arg4];
									local790 = local772 * this.aShortArray105[local755] + this.aShortArray110[local755] * local768 + 16383 >> 14;
									this.aShortArray110[local755] = (short) (local772 * this.aShortArray110[local755] + 16383 - this.aShortArray105[local755] * local768 >> 14);
									this.aShortArray105[local755] = (short) local790;
								}
								if (arg2 != 0) {
									local768 = Class177.anIntArray361[arg2];
									local772 = Class177.anIntArray360[arg2];
									local790 = local772 * this.aShortArray110[local755] + 16383 - this.lb[local755] * local768 >> 14;
									this.lb[local755] = (short) (local772 * this.lb[local755] + local768 * this.aShortArray110[local755] + 16383 >> 14);
									this.aShortArray110[local755] = (short) local790;
								}
								if (arg3 != 0) {
									local768 = Class177.anIntArray361[arg3];
									local772 = Class177.anIntArray360[arg3];
									local790 = local768 * this.lb[local755] + this.aShortArray105[local755] * local772 + 16383 >> 14;
									this.lb[local755] = (short) (this.lb[local755] * local772 + 16383 - this.aShortArray105[local755] * local768 >> 14);
									this.aShortArray105[local755] = (short) local790;
								}
							}
						}
					}
				}
				if (this.aClass223_6 == null && this.aClass223_8 != null) {
					this.aClass223_8.anInterface11_2 = null;
				}
				if (this.aClass223_6 != null) {
					this.aClass223_6.anInterface11_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray41.length > local35) {
					local157 = this.anIntArrayArray41[local35];
					for (local159 = 0; local159 < local157.length; local159++) {
						local53 = local157[local159];
						this.anIntArray500[local53] -= Static645.anInt11094;
						this.anIntArray501[local53] -= Static509.anInt9344;
						this.anIntArray503[local53] -= Static446.anInt8260;
						this.anIntArray500[local53] = arg2 * this.anIntArray500[local53] >> 7;
						this.anIntArray501[local53] = this.anIntArray501[local53] * arg3 >> 7;
						this.anIntArray503[local53] = this.anIntArray503[local53] * arg4 >> 7;
						this.anIntArray500[local53] += Static645.anInt11094;
						this.anIntArray501[local53] += Static509.anInt9344;
						this.anIntArray503[local53] += Static446.anInt8260;
					}
				}
			}
		} else {
			@Pc(1207) Class219 local1207;
			@Pc(1212) Class159 local1212;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray42.length > local35) {
							local157 = this.anIntArrayArray42[local35];
							for (local159 = 0; local159 < local157.length; local159++) {
								local53 = local157[local159];
								local59 = (this.aByteArray103[local53] & 0xFF) + arg2 * 8;
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray103[local53] = (byte) local59;
							}
							if (local157.length > 0 && this.aClass223_8 != null) {
								this.aClass223_8.anInterface11_2 = null;
							}
						}
					}
					if (this.aClass219Array1 != null) {
						for (local35 = 0; local35 < this.anInt7801; local35++) {
							local1207 = this.aClass219Array1[local35];
							local1212 = this.aClass159Array1[local35];
							local1212.anInt5349 = 255 - (this.aByteArray103[local1207.anInt7327] & 0xFF) << 24 | local1212.anInt5349 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1463) Class159 local1463;
				if (arg0 == 8) {
					if (this.anIntArrayArray43 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray43.length > local35) {
								local157 = this.anIntArrayArray43[local35];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1463 = this.aClass159Array1[local157[local159]];
									local1463.anInt5345 += arg2;
									local1463.anInt5340 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray43 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray43.length) {
								local157 = this.anIntArrayArray43[local35];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1463 = this.aClass159Array1[local157[local159]];
									local1463.anInt5347 = arg2 * local1463.anInt5347 >> 7;
									local1463.anInt5348 = local1463.anInt5348 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray43 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray43.length) {
							local157 = this.anIntArrayArray43[local35];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1463 = this.aClass159Array1[local157[local159]];
								local1463.anInt5344 = local1463.anInt5344 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray42 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray42.length) {
						local157 = this.anIntArrayArray42[local35];
						for (local159 = 0; local159 < local157.length; local159++) {
							local53 = local157[local159];
							local59 = this.aShortArray109[local53] & 0xFFFF;
							local269 = local59 >> 10 & 0x3F;
							local288 = local59 >> 7 & 0x7;
							local288 += arg3 / 4;
							@Pc(1302) int local1302 = local269 + arg2 & 0x3F;
							local746 = local59 & 0x7F;
							local746 += arg4;
							if (local288 < 0) {
								local288 = 0;
							} else if (local288 > 7) {
								local288 = 7;
							}
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 127) {
								local746 = 127;
							}
							this.aShortArray109[local53] = (short) (local288 << 7 | local1302 << 10 | local746);
						}
						if (local157.length > 0 && this.aClass223_8 != null) {
							this.aClass223_8.anInterface11_2 = null;
						}
					}
				}
				if (this.aClass219Array1 != null) {
					for (local35 = 0; local35 < this.anInt7801; local35++) {
						local1207 = this.aClass219Array1[local35];
						local1212 = this.aClass159Array1[local35];
						local1212.anInt5349 = Static195.anIntArray226[this.aShortArray109[local1207.anInt7327] & 0xFFFF] & 0xFFFFFF | local1212.anInt5349 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort93;
	}

	@OriginalMember(owner = "client!paa", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7862;
	}

	@OriginalMember(owner = "client!paa", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static645.anInt11094 = 0;
			Static446.anInt8260 = 0;
			Static509.anInt9344 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt7812; local17++) {
				Static645.anInt11094 += this.anIntArray500[local17];
				Static509.anInt9344 += this.anIntArray501[local17];
				local15++;
				Static446.anInt8260 += this.anIntArray503[local17];
			}
			if (local15 <= 0) {
				Static509.anInt9344 = arg2;
				Static446.anInt8260 = arg3;
				Static645.anInt11094 = arg1;
			} else {
				Static509.anInt9344 = Static509.anInt9344 / local15 + arg2;
				Static645.anInt11094 = arg1 + Static645.anInt11094 / local15;
				Static446.anInt8260 = Static446.anInt8260 / local15 + arg3;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt7812; local15++) {
				this.anIntArray500[local15] += arg1;
				this.anIntArray501[local15] += arg2;
				this.anIntArray503[local15] += arg3;
			}
		} else {
			@Pc(155) int local155;
			@Pc(173) int local173;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt7812; local15++) {
					this.anIntArray500[local15] -= Static645.anInt11094;
					this.anIntArray501[local15] -= Static509.anInt9344;
					this.anIntArray503[local15] -= Static446.anInt8260;
					if (arg3 != 0) {
						local17 = Class177.anIntArray361[arg3];
						local155 = Class177.anIntArray360[arg3];
						local173 = local155 * this.anIntArray500[local15] + this.anIntArray501[local15] * local17 + 16383 >> 14;
						this.anIntArray501[local15] = this.anIntArray501[local15] * local155 + 16383 - this.anIntArray500[local15] * local17 >> 14;
						this.anIntArray500[local15] = local173;
					}
					if (arg1 != 0) {
						local17 = Class177.anIntArray361[arg1];
						local155 = Class177.anIntArray360[arg1];
						local173 = local155 * this.anIntArray501[local15] + 16383 - this.anIntArray503[local15] * local17 >> 14;
						this.anIntArray503[local15] = local17 * this.anIntArray501[local15] + local155 * this.anIntArray503[local15] + 16383 >> 14;
						this.anIntArray501[local15] = local173;
					}
					if (arg2 != 0) {
						local17 = Class177.anIntArray361[arg2];
						local155 = Class177.anIntArray360[arg2];
						local173 = this.anIntArray503[local15] * local17 + local155 * this.anIntArray500[local15] + 16383 >> 14;
						this.anIntArray503[local15] = local155 * this.anIntArray503[local15] + 16383 - this.anIntArray500[local15] * local17 >> 14;
						this.anIntArray500[local15] = local173;
					}
					this.anIntArray500[local15] += Static645.anInt11094;
					this.anIntArray501[local15] += Static509.anInt9344;
					this.anIntArray503[local15] += Static446.anInt8260;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt7812; local15++) {
					this.anIntArray500[local15] -= Static645.anInt11094;
					this.anIntArray501[local15] -= Static509.anInt9344;
					this.anIntArray503[local15] -= Static446.anInt8260;
					this.anIntArray500[local15] = arg1 * this.anIntArray500[local15] / 128;
					this.anIntArray501[local15] = arg2 * this.anIntArray501[local15] / 128;
					this.anIntArray503[local15] = this.anIntArray503[local15] * arg3 / 128;
					this.anIntArray500[local15] += Static645.anInt11094;
					this.anIntArray501[local15] += Static509.anInt9344;
					this.anIntArray503[local15] += Static446.anInt8260;
				}
			} else {
				@Pc(507) Class219 local507;
				@Pc(512) Class159 local512;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt7853; local15++) {
						local17 = (this.aByteArray103[local15] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray103[local15] = (byte) local17;
					}
					if (this.aClass223_8 != null) {
						this.aClass223_8.anInterface11_2 = null;
					}
					if (this.aClass219Array1 != null) {
						for (local17 = 0; local17 < this.anInt7801; local17++) {
							local507 = this.aClass219Array1[local17];
							local512 = this.aClass159Array1[local17];
							local512.anInt5349 = local512.anInt5349 & 0xFFFFFF | 255 - (this.aByteArray103[local507.anInt7327] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt7853; local15++) {
						local17 = this.aShortArray109[local15] & 0xFFFF;
						local155 = local17 >> 10 & 0x3F;
						local173 = local17 >> 7 & 0x7;
						@Pc(573) int local573 = local155 + arg1 & 0x3F;
						@Pc(577) int local577 = local17 & 0x7F;
						local173 += arg2 / 4;
						local577 += arg3;
						if (local173 < 0) {
							local173 = 0;
						} else if (local173 > 7) {
							local173 = 7;
						}
						if (local577 < 0) {
							local577 = 0;
						} else if (local577 > 127) {
							local577 = 127;
						}
						this.aShortArray109[local15] = (short) (local577 | local173 << 7 | local573 << 10);
					}
					if (this.aClass223_8 != null) {
						this.aClass223_8.anInterface11_2 = null;
					}
					if (this.aClass219Array1 != null) {
						for (local17 = 0; local17 < this.anInt7801; local17++) {
							local507 = this.aClass219Array1[local17];
							local512 = this.aClass159Array1[local17];
							local512.anInt5349 = Static195.anIntArray226[this.aShortArray109[local507.anInt7327] & 0xFFFF] & 0xFFFFFF | local512.anInt5349 & 0xFF000000;
						}
					}
				} else {
					@Pc(694) Class159 local694;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt7801; local15++) {
							local694 = this.aClass159Array1[local15];
							local694.anInt5340 += arg2;
							local694.anInt5345 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt7801; local15++) {
							local694 = this.aClass159Array1[local15];
							local694.anInt5347 = local694.anInt5347 * arg1 >> 7;
							local694.anInt5348 = arg2 * local694.anInt5348 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt7801; local15++) {
							local694 = this.aClass159Array1[local15];
							local694.anInt5344 = local694.anInt5344 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt7862 = arg0;
		if (this.aClass235_1 != null && (this.anInt7862 & 0x10000) == 0) {
			this.lb = this.aClass235_1.aShortArray93;
			this.aByteArray104 = this.aClass235_1.aByteArray98;
			this.aShortArray105 = this.aClass235_1.aShortArray94;
			this.aShortArray110 = this.aClass235_1.aShortArray92;
			this.aClass235_1 = null;
		}
		this.aBoolean561 = true;
		this.method6713();
	}

	@OriginalMember(owner = "client!paa", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort89 = (short) arg0;
		if (this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7812; local7++) {
			this.anIntArray503[local7] = -this.anIntArray503[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7794; local29++) {
			this.lb[local29] = (short) -this.lb[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt7853; local52++) {
			@Pc(59) short local59 = this.aShortArray111[local52];
			this.aShortArray111[local52] = this.aShortArray106[local52];
			this.aShortArray106[local52] = local59;
		}
		if (this.aClass223_6 == null && this.aClass223_8 != null) {
			this.aClass223_8.anInterface11_2 = null;
		}
		if (this.aClass223_6 != null) {
			this.aClass223_6.anInterface11_2 = null;
		}
		this.aBoolean560 = false;
		if (this.aClass348_1 != null) {
			this.aClass348_1.anInterface18_5 = null;
		}
		if (this.aClass223_7 != null) {
			this.aClass223_7.anInterface11_2 = null;
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(Lclient!bca;IZ)V")
	@Override
	public void method6680(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray113 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7812; local14++) {
			if ((arg1 & this.aShortArray113[local14]) != 0) {
				if (arg2) {
					arg0.method4647(this.anIntArray500[local14], this.anIntArray501[local14], this.anIntArray503[local14], local12);
				} else {
					arg0.method4652(this.anIntArray500[local14], this.anIntArray501[local14], this.anIntArray503[local14], local12);
				}
				this.anIntArray500[local14] = local12[0];
				this.anIntArray501[local14] = local12[1];
				this.anIntArray503[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static645.anInt11094 = 0;
			Static509.anInt9344 = 0;
			Static446.anInt8260 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray41.length) {
					local52 = this.anIntArrayArray41[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local60]) != 0) {
							Static645.anInt11094 += this.anIntArray500[local60];
							Static509.anInt9344 += this.anIntArray501[local60];
							local24++;
							Static446.anInt8260 += this.anIntArray503[local60];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static645.anInt11094 = arg2;
				Static446.anInt8260 = arg4;
				Static509.anInt9344 = arg3;
			} else {
				Static645.anInt11094 = arg2 + Static645.anInt11094 / local24;
				Static509.anInt9344 = Static509.anInt9344 / local24 + arg3;
				Static446.anInt8260 = arg4 + Static446.anInt8260 / local24;
				Static338.aBoolean503 = true;
			}
			return;
		}
		@Pc(243) int[] local243;
		@Pc(245) int local245;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg2 * arg7[3] + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg2 = local24;
				arg4 = local38;
				arg3 = local32;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray41.length) {
					local243 = this.anIntArrayArray41[local32];
					for (local245 = 0; local245 < local243.length; local245++) {
						local54 = local243[local245];
						if (this.aShortArray113 == null || (this.aShortArray113[local54] & arg6) != 0) {
							this.anIntArray500[local54] += arg2;
							this.anIntArray501[local54] += arg3;
							this.anIntArray503[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(379) int local379;
		@Pc(398) int local398;
		@Pc(628) int local628;
		@Pc(637) int local637;
		@Pc(649) int local649;
		@Pc(653) int local653;
		@Pc(671) int local671;
		@Pc(1011) int local1011;
		@Pc(1019) int local1019;
		@Pc(1175) int local1175;
		@Pc(1201) int local1201;
		@Pc(1206) int local1206;
		@Pc(1215) int local1215;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1230) int local1230;
		@Pc(1359) int[] local1359;
		@Pc(1361) int local1361;
		@Pc(1365) int local1365;
		@Pc(1369) int local1369;
		@Pc(1371) int local1371;
		@Pc(1502) int local1502;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray41.length) {
						local243 = this.anIntArrayArray41[local32];
						for (local245 = 0; local245 < local243.length; local245++) {
							local54 = local243[local245];
							if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
								this.anIntArray500[local54] -= Static645.anInt11094;
								this.anIntArray501[local54] -= Static509.anInt9344;
								this.anIntArray503[local54] -= Static446.anInt8260;
								if (arg4 != 0) {
									local60 = Class177.anIntArray361[arg4];
									local379 = Class177.anIntArray360[arg4];
									local398 = local60 * this.anIntArray501[local54] + this.anIntArray500[local54] * local379 + 16383 >> 14;
									this.anIntArray501[local54] = this.anIntArray501[local54] * local379 + 16383 - this.anIntArray500[local54] * local60 >> 14;
									this.anIntArray500[local54] = local398;
								}
								if (arg2 != 0) {
									local60 = Class177.anIntArray361[arg2];
									local379 = Class177.anIntArray360[arg2];
									local398 = local379 * this.anIntArray501[local54] + 16383 - this.anIntArray503[local54] * local60 >> 14;
									this.anIntArray503[local54] = local60 * this.anIntArray501[local54] + this.anIntArray503[local54] * local379 + 16383 >> 14;
									this.anIntArray501[local54] = local398;
								}
								if (arg3 != 0) {
									local60 = Class177.anIntArray361[arg3];
									local379 = Class177.anIntArray360[arg3];
									local398 = local60 * this.anIntArray503[local54] + local379 * this.anIntArray500[local54] + 16383 >> 14;
									this.anIntArray503[local54] = this.anIntArray503[local54] * local379 + 16383 - this.anIntArray500[local54] * local60 >> 14;
									this.anIntArray500[local54] = local398;
								}
								this.anIntArray500[local54] += Static645.anInt11094;
								this.anIntArray501[local54] += Static509.anInt9344;
								this.anIntArray503[local54] += Static446.anInt8260;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray41.length > local38) {
							local52 = this.anIntArrayArray41[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray113 == null || (this.aShortArray113[local60] & arg6) != 0) {
									local379 = this.anIntArray499[local60];
									local398 = this.anIntArray499[local60 + 1];
									for (local628 = local379; local628 < local398; local628++) {
										local637 = this.aShortArray114[local628] - 1;
										if (local637 == -1) {
											break;
										}
										if (arg4 != 0) {
											local649 = Class177.anIntArray361[arg4];
											local653 = Class177.anIntArray360[arg4];
											local671 = this.aShortArray105[local637] * local653 + this.aShortArray110[local637] * local649 + 16383 >> 14;
											this.aShortArray110[local637] = (short) (local653 * this.aShortArray110[local637] + 16383 - local649 * this.aShortArray105[local637] >> 14);
											this.aShortArray105[local637] = (short) local671;
										}
										if (arg2 != 0) {
											local649 = Class177.anIntArray361[arg2];
											local653 = Class177.anIntArray360[arg2];
											local671 = this.aShortArray110[local637] * local653 + 16383 - local649 * this.lb[local637] >> 14;
											this.lb[local637] = (short) (local649 * this.aShortArray110[local637] + local653 * this.lb[local637] + 16383 >> 14);
											this.aShortArray110[local637] = (short) local671;
										}
										if (arg3 != 0) {
											local649 = Class177.anIntArray361[arg3];
											local653 = Class177.anIntArray360[arg3];
											local671 = local653 * this.aShortArray105[local637] + local649 * this.lb[local637] + 16383 >> 14;
											this.lb[local637] = (short) (this.lb[local637] * local653 + 16383 - local649 * this.aShortArray105[local637] >> 14);
											this.aShortArray105[local637] = (short) local671;
										}
									}
								}
							}
						}
					}
					if (this.aClass223_6 == null && this.aClass223_8 != null) {
						this.aClass223_8.anInterface11_2 = null;
					}
					if (this.aClass223_6 != null) {
						this.aClass223_6.anInterface11_2 = null;
						return;
					}
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local245 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static338.aBoolean503) {
					local379 = Static645.anInt11094 * arg7[0] + arg7[3] * Static509.anInt9344 + arg7[6] * Static446.anInt8260 + 8192 >> 14;
					local398 = arg7[1] * Static645.anInt11094 + Static509.anInt9344 * arg7[4] + arg7[7] * Static446.anInt8260 + 8192 >> 14;
					local379 += local245;
					local398 += local54;
					local628 = Static446.anInt8260 * arg7[8] + arg7[2] * Static645.anInt11094 + arg7[5] * Static509.anInt9344 + 8192 >> 14;
					local628 += local60;
					Static645.anInt11094 = local379;
					Static509.anInt9344 = local398;
					Static446.anInt8260 = local628;
					Static338.aBoolean503 = false;
				}
				@Pc(979) int[] local979 = new int[9];
				local398 = Class177.anIntArray360[arg2];
				local628 = Class177.anIntArray361[arg2];
				local637 = Class177.anIntArray360[arg3];
				local649 = Class177.anIntArray361[arg3];
				local653 = Class177.anIntArray360[arg4];
				local671 = Class177.anIntArray361[arg4];
				local1011 = local653 * local628 + 8192 >> 14;
				local1019 = local628 * local671 + 8192 >> 14;
				local979[6] = local1019 * local637 + local653 * -local649 + 8192 >> 14;
				local979[8] = local398 * local637 + 8192 >> 14;
				local979[4] = local398 * local653 + 8192 >> 14;
				local979[1] = local671 * -local637 + local1011 * local649 + 8192 >> 14;
				local979[3] = local398 * local671 + 8192 >> 14;
				local979[5] = -local628;
				local979[0] = local649 * local1019 + local653 * local637 + 8192 >> 14;
				local979[7] = local637 * local1011 + local671 * local649 + 8192 >> 14;
				local979[2] = local649 * local398 + 8192 >> 14;
				@Pc(1149) int local1149 = local979[1] * -Static509.anInt9344 + -Static645.anInt11094 * local979[0] + -Static446.anInt8260 * local979[2] + 8192 >> 14;
				local1175 = -Static645.anInt11094 * local979[3] + local979[4] * -Static509.anInt9344 + local979[5] * -Static446.anInt8260 + 8192 >> 14;
				local1201 = -Static446.anInt8260 * local979[8] + local979[6] * -Static645.anInt11094 + local979[7] * -Static509.anInt9344 + 8192 >> 14;
				local1206 = local1149 + Static645.anInt11094;
				@Pc(1211) int local1211 = local1175 + Static509.anInt9344;
				local1215 = Static446.anInt8260 + local1201;
				@Pc(1218) int[] local1218 = new int[9];
				for (local1220 = 0; local1220 < 3; local1220++) {
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1228 = 0;
						for (local1230 = 0; local1230 < 3; local1230++) {
							local1228 += arg7[local1224 * 3 + local1230] * local979[local1220 * 3 + local1230];
						}
						local1218[local1224 + local1220 * 3] = local1228 + 8192 >> 14;
					}
				}
				local1224 = local979[2] * local60 + local245 * local979[0] + local54 * local979[1] + 8192 >> 14;
				local1228 = local54 * local979[4] + local979[3] * local245 + local979[5] * local60 + 8192 >> 14;
				local1230 = local979[8] * local60 + local979[7] * local54 + local979[6] * local245 + 8192 >> 14;
				local1228 += local1211;
				local1224 += local1206;
				local1230 += local1215;
				local1359 = new int[9];
				for (local1361 = 0; local1361 < 3; local1361++) {
					for (local1365 = 0; local1365 < 3; local1365++) {
						local1369 = 0;
						for (local1371 = 0; local1371 < 3; local1371++) {
							local1369 += arg7[local1361 * 3 + local1371] * local1218[local1371 * 3 + local1365];
						}
						local1359[local1361 * 3 + local1365] = local1369 + 8192 >> 14;
					}
				}
				local1365 = arg7[2] * local1230 + local1228 * arg7[1] + local1224 * arg7[0] + 8192 >> 14;
				local1369 = arg7[3] * local1224 + arg7[4] * local1228 + arg7[5] * local1230 + 8192 >> 14;
				local1369 += local32;
				local1371 = local1230 * arg7[8] + arg7[7] * local1228 + local1224 * arg7[6] + 8192 >> 14;
				local1365 += local24;
				local1371 += local38;
				for (local1502 = 0; local1502 < local8; local1502++) {
					@Pc(1508) int local1508 = arg1[local1502];
					if (local1508 < this.anIntArrayArray41.length) {
						@Pc(1518) int[] local1518 = this.anIntArrayArray41[local1508];
						for (@Pc(1520) int local1520 = 0; local1520 < local1518.length; local1520++) {
							@Pc(1526) int local1526 = local1518[local1520];
							if (this.aShortArray113 == null || (this.aShortArray113[local1526] & arg6) != 0) {
								@Pc(1570) int local1570 = local1359[2] * this.anIntArray503[local1526] + local1359[1] * this.anIntArray501[local1526] + local1359[0] * this.anIntArray500[local1526] + 8192 >> 14;
								@Pc(1601) int local1601 = local1359[5] * this.anIntArray503[local1526] + this.anIntArray500[local1526] * local1359[3] + local1359[4] * this.anIntArray501[local1526] + 8192 >> 14;
								@Pc(1605) int local1605 = local1570 + local1365;
								@Pc(1609) int local1609 = local1601 + local1369;
								@Pc(1640) int local1640 = local1359[8] * this.anIntArray503[local1526] + this.anIntArray500[local1526] * local1359[6] + local1359[7] * this.anIntArray501[local1526] + 8192 >> 14;
								@Pc(1644) int local1644 = local1640 + local1371;
								this.anIntArray500[local1526] = local1605;
								this.anIntArray501[local1526] = local1609;
								this.anIntArray503[local1526] = local1644;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2581) Class219 local2581;
			@Pc(2586) Class159 local2586;
			if (arg0 == 5) {
				if (this.anIntArrayArray42 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray42.length) {
							local243 = this.anIntArrayArray42[local32];
							for (local245 = 0; local245 < local243.length; local245++) {
								local54 = local243[local245];
								if (this.aShortArray107 == null || (this.aShortArray107[local54] & arg6) != 0) {
									local60 = (this.aByteArray103[local54] & 0xFF) + (arg2 * 8);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray103[local54] = (byte) local60;
									if (this.aClass223_8 != null) {
										this.aClass223_8.anInterface11_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass219Array1 != null) {
						for (local32 = 0; local32 < this.anInt7801; local32++) {
							local2581 = this.aClass219Array1[local32];
							local2586 = this.aClass159Array1[local32];
							local2586.anInt5349 = 255 - (this.aByteArray103[local2581.anInt7327] & 0xFF) << 24 | local2586.anInt5349 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2841) Class159 local2841;
				if (arg0 == 8) {
					if (this.anIntArrayArray43 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray43.length) {
								local243 = this.anIntArrayArray43[local32];
								for (local245 = 0; local245 < local243.length; local245++) {
									local2841 = this.aClass159Array1[local243[local245]];
									local2841.anInt5340 += arg3;
									local2841.anInt5345 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray43 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray43.length) {
								local243 = this.anIntArrayArray43[local32];
								for (local245 = 0; local245 < local243.length; local245++) {
									local2841 = this.aClass159Array1[local243[local245]];
									local2841.anInt5348 = arg3 * local2841.anInt5348 >> 7;
									local2841.anInt5347 = arg2 * local2841.anInt5347 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray43 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray43.length > local32) {
							local243 = this.anIntArrayArray43[local32];
							for (local245 = 0; local245 < local243.length; local245++) {
								local2841 = this.aClass159Array1[local243[local245]];
								local2841.anInt5344 = local2841.anInt5344 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray42 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray42.length > local32) {
						local243 = this.anIntArrayArray42[local32];
						for (local245 = 0; local245 < local243.length; local245++) {
							local54 = local243[local245];
							if (this.aShortArray107 == null || (this.aShortArray107[local54] & arg6) != 0) {
								local60 = this.aShortArray109[local54] & 0xFFFF;
								local379 = local60 >> 10 & 0x3F;
								local398 = local60 >> 7 & 0x7;
								local398 += arg3 / 4;
								local628 = local60 & 0x7F;
								@Pc(2691) int local2691 = local379 + arg2 & 0x3F;
								if (local398 < 0) {
									local398 = 0;
								} else if (local398 > 7) {
									local398 = 7;
								}
								local628 += arg4;
								if (local628 < 0) {
									local628 = 0;
								} else if (local628 > 127) {
									local628 = 127;
								}
								this.aShortArray109[local54] = (short) (local628 | local2691 << 10 | local398 << 7);
								if (this.aClass223_8 != null) {
									this.aClass223_8.anInterface11_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass219Array1 != null) {
					for (local32 = 0; local32 < this.anInt7801; local32++) {
						local2581 = this.aClass219Array1[local32];
						local2586 = this.aClass159Array1[local32];
						local2586.anInt5349 = Static195.anIntArray226[this.aShortArray109[local2581.anInt7327] & 0xFFFF] & 0xFFFFFF | local2586.anInt5349 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray41.length > local32) {
					local243 = this.anIntArrayArray41[local32];
					for (local245 = 0; local245 < local243.length; local245++) {
						local54 = local243[local245];
						if (this.aShortArray113 == null || (arg6 & this.aShortArray113[local54]) != 0) {
							this.anIntArray500[local54] -= Static645.anInt11094;
							this.anIntArray501[local54] -= Static509.anInt9344;
							this.anIntArray503[local54] -= Static446.anInt8260;
							this.anIntArray500[local54] = this.anIntArray500[local54] * arg2 >> 7;
							this.anIntArray501[local54] = this.anIntArray501[local54] * arg3 >> 7;
							this.anIntArray503[local54] = arg4 * this.anIntArray503[local54] >> 7;
							this.anIntArray500[local54] += Static645.anInt11094;
							this.anIntArray501[local54] += Static509.anInt9344;
							this.anIntArray503[local54] += Static446.anInt8260;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local245 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static338.aBoolean503) {
				local379 = Static645.anInt11094 * arg7[0] + Static509.anInt9344 * arg7[3] + arg7[6] * Static446.anInt8260 + 8192 >> 14;
				local398 = arg7[7] * Static446.anInt8260 + Static509.anInt9344 * arg7[4] + arg7[1] * Static645.anInt11094 + 8192 >> 14;
				local398 += local54;
				local628 = arg7[5] * Static509.anInt9344 + Static645.anInt11094 * arg7[2] + arg7[8] * Static446.anInt8260 + 8192 >> 14;
				local379 += local245;
				Static509.anInt9344 = local398;
				local628 += local60;
				Static645.anInt11094 = local379;
				Static338.aBoolean503 = false;
				Static446.anInt8260 = local628;
			}
			local379 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local628 = arg4 << 15 >> 7;
			local637 = -Static645.anInt11094 * local379 + 8192 >> 14;
			local649 = local398 * -Static509.anInt9344 + 8192 >> 14;
			local653 = -Static446.anInt8260 * local628 + 8192 >> 14;
			local671 = local637 + Static645.anInt11094;
			local1011 = local649 + Static509.anInt9344;
			local1019 = Static446.anInt8260 + local653;
			@Pc(1869) int[] local1869 = new int[] { arg7[0] * local379 + 8192 >> 14, arg7[3] * local379 + 8192 >> 14, local379 * arg7[6] + 8192 >> 14, local398 * arg7[1] + 8192 >> 14, local398 * arg7[4] + 8192 >> 14, local398 * arg7[7] + 8192 >> 14, local628 * arg7[2] + 8192 >> 14, local628 * arg7[5] + 8192 >> 14, local628 * arg7[8] + 8192 >> 14 };
			local1175 = local379 * local245 + 8192 >> 14;
			local1201 = local398 * local54 + 8192 >> 14;
			@Pc(1997) int local1997 = local1201 + local1011;
			local1206 = local60 * local628 + 8192 >> 14;
			@Pc(2009) int local2009 = local1175 + local671;
			@Pc(2013) int local2013 = local1206 + local1019;
			@Pc(2016) int[] local2016 = new int[9];
			@Pc(2022) int local2022;
			for (local1215 = 0; local1215 < 3; local1215++) {
				for (local2022 = 0; local2022 < 3; local2022++) {
					local1220 = 0;
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1220 += arg7[local1215 * 3 + local1224] * local1869[local1224 * 3 + local2022];
					}
					local2016[local1215 * 3 + local2022] = local1220 + 8192 >> 14;
				}
			}
			local2022 = arg7[1] * local1997 + arg7[0] * local2009 + local2013 * arg7[2] + 8192 >> 14;
			local1220 = local2013 * arg7[5] + arg7[3] * local2009 + arg7[4] * local1997 + 8192 >> 14;
			local1224 = local2009 * arg7[6] + local1997 * arg7[7] + arg7[8] * local2013 + 8192 >> 14;
			local2022 += local24;
			local1220 += local32;
			local1224 += local38;
			for (local1228 = 0; local1228 < local8; local1228++) {
				local1230 = arg1[local1228];
				if (local1230 < this.anIntArrayArray41.length) {
					local1359 = this.anIntArrayArray41[local1230];
					for (local1361 = 0; local1361 < local1359.length; local1361++) {
						local1365 = local1359[local1361];
						if (this.aShortArray113 == null || (this.aShortArray113[local1365] & arg6) != 0) {
							local1369 = local2016[1] * this.anIntArray501[local1365] + local2016[0] * this.anIntArray500[local1365] + local2016[2] * this.anIntArray503[local1365] + 8192 >> 14;
							local1371 = local2016[4] * this.anIntArray501[local1365] + this.anIntArray500[local1365] * local2016[3] + local2016[5] * this.anIntArray503[local1365] + 8192 >> 14;
							@Pc(2265) int local2265 = local1369 + local2022;
							@Pc(2269) int local2269 = local1371 + local1220;
							local1502 = local2016[7] * this.anIntArray501[local1365] + local2016[6] * this.anIntArray500[local1365] + local2016[8] * this.anIntArray503[local1365] + 8192 >> 14;
							this.anIntArray500[local1365] = local2265;
							@Pc(2310) int local2310 = local1502 + local1224;
							this.anIntArray501[local1365] = local2269;
							this.anIntArray503[local1365] = local2310;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!paa", name = "d", descriptor = "(B)V")
	private void method6714() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7812; local23++) {
			@Pc(30) int local30 = this.anIntArray500[local23];
			@Pc(35) int local35 = this.anIntArray501[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			@Pc(50) int local50 = this.anIntArray503[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local50 > local17) {
				local17 = local50;
			}
			if (local11 > local50) {
				local11 = local50;
			}
			@Pc(78) int local78 = local30 * local30 + local50 * local50;
			if (local19 < local78) {
				local19 = local78;
			}
			local78 = local50 * local50 + local30 * local30 + local35 * local35;
			if (local78 > local21) {
				local21 = local78;
			}
		}
		this.aShort92 = (short) local9;
		this.aShort93 = (short) local11;
		this.aShort97 = (short) local17;
		this.aShort88 = (short) local7;
		this.aShort94 = (short) local15;
		this.aShort91 = (short) local13;
		this.aShort95 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort90 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean560 = true;
	}

	@OriginalMember(owner = "client!paa", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean560) {
			this.method6714();
		}
		return this.aShort92;
	}
}
