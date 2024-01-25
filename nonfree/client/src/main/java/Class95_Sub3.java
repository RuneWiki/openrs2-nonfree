import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nha")
public final class Class95_Sub3 extends Class95 {

	@OriginalMember(owner = "client!nha", name = "v", descriptor = "S")
	private short aShort61;

	@OriginalMember(owner = "client!nha", name = "y", descriptor = "[Lclient!kea;")
	private Class186[] aClass186Array1;

	@OriginalMember(owner = "client!nha", name = "A", descriptor = "[S")
	private short[] aShortArray92;

	@OriginalMember(owner = "client!nha", name = "E", descriptor = "Lclient!m;")
	private Interface17 anInterface17_3;

	@OriginalMember(owner = "client!nha", name = "H", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!nha", name = "J", descriptor = "[I")
	private int[] anIntArray560;

	@OriginalMember(owner = "client!nha", name = "N", descriptor = "I")
	private int anInt6332;

	@OriginalMember(owner = "client!nha", name = "P", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!nha", name = "R", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!nha", name = "S", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!nha", name = "T", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!nha", name = "U", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!nha", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray40;

	@OriginalMember(owner = "client!nha", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray41;

	@OriginalMember(owner = "client!nha", name = "jb", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!nha", name = "mb", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!nha", name = "pb", descriptor = "I")
	private int anInt6348;

	@OriginalMember(owner = "client!nha", name = "qb", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!nha", name = "sb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!nha", name = "ub", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!nha", name = "yb", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!nha", name = "Bb", descriptor = "I")
	private int anInt6355;

	@OriginalMember(owner = "client!nha", name = "Eb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!nha", name = "Fb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!nha", name = "Kb", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!nha", name = "Nb", descriptor = "[Lclient!kw;")
	private Class197[] aClass197Array5;

	@OriginalMember(owner = "client!nha", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!nha", name = "Rb", descriptor = "[Lclient!vda;")
	private Class364[] aClass364Array1;

	@OriginalMember(owner = "client!nha", name = "Yb", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!nha", name = "cc", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!nha", name = "ec", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!nha", name = "ic", descriptor = "B")
	private byte aByte81;

	@OriginalMember(owner = "client!nha", name = "jc", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!nha", name = "nc", descriptor = "[I")
	private int[] anIntArray561;

	@OriginalMember(owner = "client!nha", name = "oc", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!nha", name = "rc", descriptor = "Lclient!fha;")
	private Interface9 anInterface9_5;

	@OriginalMember(owner = "client!nha", name = "sc", descriptor = "Lclient!sn;")
	private Class324 aClass324_1;

	@OriginalMember(owner = "client!nha", name = "uc", descriptor = "[I")
	private int[] anIntArray562;

	@OriginalMember(owner = "client!nha", name = "wc", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!nha", name = "Cc", descriptor = "[Lclient!cba;")
	private Class49[] aClass49Array5;

	@OriginalMember(owner = "client!nha", name = "Fc", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!nha", name = "Hc", descriptor = "[I")
	private int[] anIntArray563;

	@OriginalMember(owner = "client!nha", name = "Ic", descriptor = "[I")
	private int[] anIntArray564;

	@OriginalMember(owner = "client!nha", name = "Lc", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!nha", name = "B", descriptor = "I")
	private int anInt6324 = 0;

	@OriginalMember(owner = "client!nha", name = "cb", descriptor = "Z")
	private boolean aBoolean448 = true;

	@OriginalMember(owner = "client!nha", name = "Wb", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "client!nha", name = "V", descriptor = "I")
	private int anInt6335 = 0;

	@OriginalMember(owner = "client!nha", name = "Qb", descriptor = "I")
	private int anInt6364 = 0;

	@OriginalMember(owner = "client!nha", name = "z", descriptor = "I")
	private int anInt6323 = 0;

	@OriginalMember(owner = "client!nha", name = "Ec", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "client!nha", name = "K", descriptor = "Z")
	private boolean aBoolean447 = false;

	@OriginalMember(owner = "client!nha", name = "Kc", descriptor = "I")
	private int anInt6389 = 0;

	@OriginalMember(owner = "client!nha", name = "qc", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_27;

	@OriginalMember(owner = "client!nha", name = "Hb", descriptor = "Lclient!we;")
	private Class381 aClass381_12;

	@OriginalMember(owner = "client!nha", name = "W", descriptor = "Lclient!we;")
	private Class381 aClass381_10;

	@OriginalMember(owner = "client!nha", name = "zb", descriptor = "Lclient!we;")
	private Class381 aClass381_11;

	@OriginalMember(owner = "client!nha", name = "kc", descriptor = "Lclient!we;")
	private Class381 aClass381_13;

	@OriginalMember(owner = "client!nha", name = "Zb", descriptor = "Lclient!hn;")
	private Class139 aClass139_1;

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class95_Sub3(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_27 = arg0;
		this.aClass381_12 = new Class381((Interface9) null, 5126, 3, 0);
		this.aClass381_10 = new Class381((Interface9) null, 5126, 2, 0);
		this.aClass381_11 = new Class381((Interface9) null, 5126, 3, 0);
		this.aClass381_13 = new Class381((Interface9) null, 5121, 4, 0);
		this.aClass139_1 = new Class139();
	}

	@OriginalMember(owner = "client!nha", name = "<init>", descriptor = "(Lclient!dia;Lclient!gfa;IIII)V")
	public Class95_Sub3(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass13_Sub2_27 = arg0;
		this.anInt6332 = arg2;
		this.anInt6348 = arg5;
		if (Static189.method5093(arg5, arg2)) {
			this.aClass381_12 = new Class381((Interface9) null, 5126, 3, 0);
		}
		if (Static169.method3086(arg2, arg5)) {
			this.aClass381_10 = new Class381((Interface9) null, 5126, 2, 0);
		}
		if (Static618.method8719(arg2, arg5)) {
			this.aClass381_11 = new Class381((Interface9) null, 5126, 3, 0);
		}
		if (Static53.method1175(arg5, arg2)) {
			this.aClass381_13 = new Class381((Interface9) null, 5121, 4, 0);
		}
		if (Static41.method1053(arg2, arg5)) {
			this.aClass139_1 = new Class139();
		}
		@Pc(108) Interface4 local108 = arg0.anInterface4_14;
		this.anIntArray562 = new int[arg1.anInt3814 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt3811];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt3811; local121++) {
			if (arg1.aByteArray33 == null || arg1.aByteArray33[local121] != 2) {
				if (arg1.aShortArray58 != null && arg1.aShortArray58[local121] != -1) {
					@Pc(151) Class119 local151 = local108.method4673(arg1.aShortArray58[local121] & 0xFFFF);
					if (((this.anInt6348 & 0x40) == 0 || !local151.aBoolean291) && local151.aBoolean294) {
						continue;
					}
				}
				local119[this.anInt6364++] = local121;
				this.anIntArray562[arg1.aShortArray54[local121]]++;
				this.anIntArray562[arg1.aShortArray57[local121]]++;
				this.anIntArray562[arg1.aShortArray52[local121]]++;
			}
		}
		this.anInt6324 = this.anInt6364;
		@Pc(224) long[] local224 = new long[this.anInt6364];
		@Pc(233) boolean local233 = (this.anInt6332 & 0x100) != 0;
		@Pc(245) int local245;
		@Pc(258) int local258;
		@Pc(437) int local437;
		for (@Pc(235) int local235 = 0; local235 < this.anInt6364; local235++) {
			@Pc(241) int local241 = local119[local235];
			@Pc(243) Class119 local243 = null;
			local245 = 0;
			@Pc(247) byte local247 = 0;
			@Pc(249) byte local249 = 0;
			@Pc(251) byte local251 = 0;
			if (arg1.aClass163Array1 != null) {
				@Pc(256) boolean local256 = false;
				for (local258 = 0; local258 < arg1.aClass163Array1.length; local258++) {
					@Pc(265) Class163 local265 = arg1.aClass163Array1[local258];
					if (local241 == local265.anInt4727) {
						@Pc(278) Class143 local278 = Static173.method3146(local265.anInt4729);
						if (local278.aBoolean323) {
							local256 = true;
						}
						if (local278.anInt4306 != -1) {
							@Pc(294) Class119 local294 = local108.method4673(local278.anInt4306);
							if (local294.anInt3894 == 2) {
								this.aBoolean447 = true;
							}
						}
					}
				}
				if (local256) {
					local224[local235] = Long.MAX_VALUE;
					this.anInt6324--;
					continue;
				}
			}
			@Pc(323) short local323 = -1;
			if (arg1.aShortArray58 != null) {
				local323 = arg1.aShortArray58[local241];
				if (local323 != -1) {
					local243 = local108.method4673(local323 & 0xFFFF);
					if ((this.anInt6348 & 0x40) != 0 && local243.aBoolean291) {
						local243 = null;
						local323 = -1;
					} else {
						if (local243.aByte57 != 0 || local243.aByte59 != 0) {
							this.aBoolean450 = true;
						}
						local249 = local243.aByte54;
						local251 = local243.aByte56;
					}
				}
			}
			@Pc(393) boolean local393 = arg1.aByteArray34 != null && arg1.aByteArray34[local241] != 0 || local243 != null && local243.anInt3894 != 0;
			if ((local233 || local393) && arg1.aByteArray30 != null) {
				local245 += arg1.aByteArray30[local241] << 17;
			}
			if (local393) {
				local245 += 65536;
			}
			local245 += (local249 & 0xFF) << 8;
			local245 += local251 & 0xFF;
			local437 = local247 + ((local323 & 0xFFFF) << 16);
			@Pc(443) int local443 = local437 + (local235 & 0xFFFF);
			local224[local235] = ((long) local245 << 32) + ((long) local443);
			this.aBoolean450 |= local243 != null && (local243.aByte57 != 0 || local243.aByte59 != 0);
			this.aBoolean447 |= local393;
		}
		Static254.method4155(local119, local224);
		this.anIntArray561 = arg1.anIntArray335;
		this.anInt6335 = arg1.anInt3807;
		this.anIntArray564 = arg1.anIntArray333;
		this.anInt6323 = arg1.anInt3814;
		this.anIntArray560 = arg1.anIntArray325;
		this.aShortArray93 = arg1.aShortArray51;
		this.aClass49Array5 = arg1.aClass49Array2;
		this.aClass197Array5 = arg1.aClass197Array2;
		@Pc(524) Class122[] local524 = new Class122[this.anInt6323];
		@Pc(544) int local544;
		@Pc(558) int local558;
		@Pc(604) int local604;
		if (arg1.aClass163Array1 != null) {
			this.anInt6355 = arg1.aClass163Array1.length;
			this.aClass364Array1 = new Class364[this.anInt6355];
			this.aClass186Array1 = new Class186[this.anInt6355];
			for (local544 = 0; local544 < this.anInt6355; local544++) {
				@Pc(551) Class163 local551 = arg1.aClass163Array1[local544];
				@Pc(556) Class143 local556 = Static173.method3146(local551.anInt4729);
				local558 = -1;
				for (@Pc(560) int local560 = 0; local560 < this.anInt6364; local560++) {
					if (local119[local560] == local551.anInt4727) {
						local558 = local560;
						break;
					}
				}
				if (local558 == -1) {
					throw new RuntimeException();
				}
				local604 = Static363.anIntArray518[arg1.aShortArray50[local551.anInt4727] & 0xFFFF] & 0xFFFFFF;
				@Pc(622) int local622 = local604 | 255 - (arg1.aByteArray34 == null ? 0 : arg1.aByteArray34[local551.anInt4727]) << 24;
				this.aClass186Array1[local544] = new Class186(local558, arg1.aShortArray54[local551.anInt4727], arg1.aShortArray57[local551.anInt4727], arg1.aShortArray52[local551.anInt4727], local556.anInt4311, local556.anInt4312, local556.anInt4306, local556.anInt4308, local556.anInt4307, local556.aBoolean323, local556.aBoolean322, local551.anInt4724);
				this.aClass364Array1[local544] = new Class364(local622);
			}
		}
		local544 = this.anInt6364 * 3;
		this.aFloatArray45 = new float[local544];
		this.aShortArray98 = new short[local544];
		this.aShortArray97 = new short[this.anInt6364];
		this.aByteArray70 = new byte[this.anInt6364];
		this.aShortArray101 = new short[local544];
		this.aShort64 = (short) arg4;
		this.aShortArray94 = new short[local544];
		this.aShortArray95 = new short[this.anInt6364];
		this.aFloatArray44 = new float[local544];
		this.aShortArray100 = new short[local544];
		this.aShortArray102 = new short[this.anInt6364];
		this.aShort68 = (short) arg3;
		if (arg1.aShortArray53 != null) {
			this.aShortArray96 = new short[this.anInt6364];
		}
		this.aShortArray92 = new short[this.anInt6364];
		this.aShortArray99 = new short[this.anInt6364];
		this.aByteArray71 = new byte[local544];
		Static166.aLongArray6 = new long[local544];
		local245 = 0;
		for (local437 = 0; local437 < arg1.anInt3814; local437++) {
			local558 = this.anIntArray562[local437];
			this.anIntArray562[local437] = local245;
			local245 += local558;
			local524[local437] = new Class122();
		}
		this.anIntArray562[arg1.anInt3814] = local245;
		@Pc(808) Class363 local808 = Static253.method7879(arg1, this.anInt6364, local119);
		@Pc(812) Class57[] local812 = new Class57[arg1.anInt3811];
		@Pc(853) int local853;
		@Pc(864) int local864;
		@Pc(885) int local885;
		@Pc(896) int local896;
		@Pc(905) int local905;
		@Pc(914) int local914;
		@Pc(831) short local831;
		@Pc(842) int local842;
		for (local604 = 0; local604 < arg1.anInt3811; local604++) {
			@Pc(821) short local821 = arg1.aShortArray54[local604];
			@Pc(826) short local826 = arg1.aShortArray57[local604];
			local831 = arg1.aShortArray52[local604];
			local842 = this.anIntArray561[local826] - this.anIntArray561[local821];
			local853 = this.anIntArray564[local826] - this.anIntArray564[local821];
			local864 = this.anIntArray560[local826] - this.anIntArray560[local821];
			@Pc(875) int local875 = this.anIntArray561[local831] - this.anIntArray561[local821];
			local885 = this.anIntArray564[local831] - this.anIntArray564[local821];
			local896 = this.anIntArray560[local831] - this.anIntArray560[local821];
			local905 = local896 * local853 - local864 * local885;
			local914 = local864 * local875 - local896 * local842;
			@Pc(923) int local923 = local885 * local842 - local853 * local875;
			while (local905 > 8192 || local914 > 8192 || local923 > 8192 || local905 < -8192 || local914 < -8192 || local923 < -8192) {
				local905 >>= 0x1;
				local923 >>= 0x1;
				local914 >>= 0x1;
			}
			@Pc(976) int local976 = (int) Math.sqrt((double) (local923 * local923 + local914 * local914 + local905 * local905));
			if (local976 <= 0) {
				local976 = 1;
			}
			local923 = local923 * 256 / local976;
			local905 = local905 * 256 / local976;
			local914 = local914 * 256 / local976;
			@Pc(1011) byte local1011 = arg1.aByteArray33 == null ? 0 : arg1.aByteArray33[local604];
			if (local1011 == 0) {
				@Pc(1020) Class122 local1020 = local524[local821];
				local1020.anInt3957 += local914;
				local1020.anInt3960++;
				local1020.anInt3962 += local923;
				local1020.anInt3961 += local905;
				@Pc(1048) Class122 local1048 = local524[local826];
				local1048.anInt3957 += local914;
				local1048.anInt3961 += local905;
				local1048.anInt3962 += local923;
				local1048.anInt3960++;
				@Pc(1076) Class122 local1076 = local524[local831];
				local1076.anInt3957 += local914;
				local1076.anInt3961 += local905;
				local1076.anInt3962 += local923;
				local1076.anInt3960++;
			} else if (local1011 == 1) {
				@Pc(1115) Class57 local1115 = local812[local604] = new Class57();
				local1115.anInt1316 = local923;
				local1115.anInt1313 = local905;
				local1115.anInt1317 = local914;
			}
		}
		@Pc(1141) int local1141;
		@Pc(1184) short local1184;
		for (local258 = 0; local258 < this.anInt6364; local258++) {
			local1141 = local119[local258];
			@Pc(1148) int local1148 = arg1.aShortArray50[local1141] & 0xFFFF;
			if (arg1.aByteArray35 == null) {
				local842 = -1;
			} else {
				local842 = arg1.aByteArray35[local1141];
			}
			if (arg1.aByteArray34 == null) {
				local853 = 0;
			} else {
				local853 = arg1.aByteArray34[local1141] & 0xFF;
			}
			local1184 = arg1.aShortArray58 == null ? -1 : arg1.aShortArray58[local1141];
			if (local1184 != -1 && (this.anInt6348 & 0x40) != 0) {
				@Pc(1199) Class119 local1199 = local108.method4673(local1184 & 0xFFFF);
				if (local1199.aBoolean291) {
					local1184 = -1;
				}
			}
			@Pc(1206) float local1206 = 0.0F;
			@Pc(1208) float local1208 = 0.0F;
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) float local1214 = 0.0F;
			@Pc(1216) float local1216 = 0.0F;
			@Pc(1218) byte local1218 = 0;
			@Pc(1220) byte local1220 = 0;
			@Pc(1222) int local1222 = 0;
			@Pc(1256) byte local1256;
			@Pc(1273) short local1273;
			@Pc(1278) short local1278;
			@Pc(1283) short local1283;
			if (local1184 != -1) {
				if (local842 == -1) {
					local1212 = 1.0F;
					local1216 = 0.0F;
					local1210 = 1.0F;
					local1206 = 0.0F;
					local1218 = 1;
					local1208 = 1.0F;
					local1220 = 2;
					local1214 = 0.0F;
				} else {
					local842 &= 0xFF;
					local1256 = arg1.aByteArray31[local842];
					@Pc(1263) short local1263;
					@Pc(1268) short local1268;
					@Pc(1306) float local1306;
					@Pc(1314) float local1314;
					@Pc(1322) float local1322;
					@Pc(1408) float local1408;
					@Pc(1416) float local1416;
					@Pc(1424) float local1424;
					@Pc(1433) float local1433;
					@Pc(1442) float local1442;
					@Pc(1450) float local1450;
					if (local1256 == 0) {
						local1263 = arg1.aShortArray54[local1141];
						local1268 = arg1.aShortArray57[local1141];
						local1273 = arg1.aShortArray52[local1141];
						local1278 = arg1.aShortArray59[local842];
						local1283 = arg1.aShortArray56[local842];
						@Pc(1288) short local1288 = arg1.aShortArray55[local842];
						@Pc(1294) float local1294 = (float) arg1.anIntArray335[local1278];
						@Pc(1300) float local1300 = (float) arg1.anIntArray333[local1278];
						local1306 = (float) arg1.anIntArray325[local1278];
						local1314 = (float) arg1.anIntArray335[local1283] - local1294;
						local1322 = (float) arg1.anIntArray333[local1283] - local1300;
						@Pc(1331) float local1331 = (float) arg1.anIntArray325[local1283] - local1306;
						@Pc(1339) float local1339 = (float) arg1.anIntArray335[local1288] - local1294;
						@Pc(1348) float local1348 = (float) arg1.anIntArray333[local1288] - local1300;
						@Pc(1357) float local1357 = (float) arg1.anIntArray325[local1288] - local1306;
						@Pc(1365) float local1365 = (float) arg1.anIntArray335[local1263] - local1294;
						@Pc(1374) float local1374 = (float) arg1.anIntArray333[local1263] - local1300;
						@Pc(1383) float local1383 = (float) arg1.anIntArray325[local1263] - local1306;
						@Pc(1391) float local1391 = (float) arg1.anIntArray335[local1268] - local1294;
						@Pc(1400) float local1400 = (float) arg1.anIntArray333[local1268] - local1300;
						local1408 = (float) arg1.anIntArray325[local1268] - local1306;
						local1416 = (float) arg1.anIntArray335[local1273] - local1294;
						local1424 = (float) arg1.anIntArray333[local1273] - local1300;
						local1433 = (float) arg1.anIntArray325[local1273] - local1306;
						local1442 = local1357 * local1322 - local1348 * local1331;
						local1450 = local1339 * local1331 - local1357 * local1314;
						@Pc(1459) float local1459 = local1314 * local1348 - local1322 * local1339;
						@Pc(1468) float local1468 = local1459 * local1348 - local1450 * local1357;
						@Pc(1477) float local1477 = local1442 * local1357 - local1339 * local1459;
						@Pc(1486) float local1486 = local1450 * local1339 - local1348 * local1442;
						@Pc(1500) float local1500 = 1.0F / (local1486 * local1331 + local1477 * local1322 + local1468 * local1314);
						local1214 = (local1433 * local1486 + local1416 * local1468 + local1477 * local1424) * local1500;
						local1206 = local1500 * (local1468 * local1365 + local1374 * local1477 + local1486 * local1383);
						local1210 = local1500 * (local1408 * local1486 + local1391 * local1468 + local1477 * local1400);
						@Pc(1550) float local1550 = local1322 * local1459 - local1331 * local1450;
						@Pc(1559) float local1559 = local1450 * local1314 - local1442 * local1322;
						@Pc(1568) float local1568 = local1442 * local1331 - local1314 * local1459;
						@Pc(1582) float local1582 = 1.0F / (local1339 * local1550 + local1348 * local1568 + local1559 * local1357);
						local1216 = (local1416 * local1550 + local1424 * local1568 + local1433 * local1559) * local1582;
						local1208 = local1582 * (local1383 * local1559 + local1568 * local1374 + local1365 * local1550);
						local1212 = local1582 * (local1568 * local1400 + local1550 * local1391 + local1559 * local1408);
					} else {
						local1263 = arg1.aShortArray54[local1141];
						local1268 = arg1.aShortArray57[local1141];
						local1273 = arg1.aShortArray52[local1141];
						@Pc(1646) int local1646 = local808.anIntArray872[local842];
						@Pc(1651) int local1651 = local808.anIntArray873[local842];
						@Pc(1656) int local1656 = local808.anIntArray870[local842];
						@Pc(1661) float[] local1661 = local808.aFloatArrayArray13[local842];
						@Pc(1666) byte local1666 = arg1.aByteArray29[local842];
						local1306 = (float) arg1.anIntArray336[local842] / 256.0F;
						if (local1256 == 1) {
							local1314 = (float) arg1.anIntArray327[local842] / 1024.0F;
							Static425.method6145(local1646, local1661, local1666, local1306, local1651, arg1.anIntArray333[local1263], local1314, local1656, arg1.anIntArray325[local1263], Static593.aFloatArray77, arg1.anIntArray335[local1263]);
							local1208 = Static593.aFloatArray77[1];
							local1206 = Static593.aFloatArray77[0];
							Static425.method6145(local1646, local1661, local1666, local1306, local1651, arg1.anIntArray333[local1268], local1314, local1656, arg1.anIntArray325[local1268], Static593.aFloatArray77, arg1.anIntArray335[local1268]);
							local1210 = Static593.aFloatArray77[0];
							local1212 = Static593.aFloatArray77[1];
							Static425.method6145(local1646, local1661, local1666, local1306, local1651, arg1.anIntArray333[local1273], local1314, local1656, arg1.anIntArray325[local1273], Static593.aFloatArray77, arg1.anIntArray335[local1273]);
							local1216 = Static593.aFloatArray77[1];
							local1214 = Static593.aFloatArray77[0];
							local1322 = local1314 / 2.0F;
							if ((local1666 & 0x1) == 0) {
								if (local1214 - local1206 > local1322) {
									local1220 = 1;
									local1214 -= local1314;
								} else if (local1322 < local1206 - local1214) {
									local1214 += local1314;
									local1220 = 2;
								}
								if (local1322 < local1210 - local1206) {
									local1210 -= local1314;
									local1218 = 1;
								} else if (local1322 < local1206 - local1210) {
									local1210 += local1314;
									local1218 = 2;
								}
							} else {
								if (local1322 < local1216 - local1208) {
									local1216 -= local1314;
									local1220 = 1;
								} else if (local1208 - local1216 > local1322) {
									local1220 = 2;
									local1216 += local1314;
								}
								if (local1322 < local1212 - local1208) {
									local1218 = 1;
									local1212 -= local1314;
								} else if (local1322 < local1208 - local1212) {
									local1212 += local1314;
									local1218 = 2;
								}
							}
						} else if (local1256 == 2) {
							local1314 = (float) arg1.anIntArray331[local842] / 256.0F;
							local1322 = (float) arg1.anIntArray329[local842] / 256.0F;
							@Pc(1930) int local1930 = arg1.anIntArray335[local1268] - arg1.anIntArray335[local1263];
							@Pc(1940) int local1940 = arg1.anIntArray333[local1268] - arg1.anIntArray333[local1263];
							@Pc(1951) int local1951 = arg1.anIntArray325[local1268] - arg1.anIntArray325[local1263];
							@Pc(1962) int local1962 = arg1.anIntArray335[local1273] - arg1.anIntArray335[local1263];
							@Pc(1973) int local1973 = arg1.anIntArray333[local1273] - arg1.anIntArray333[local1263];
							@Pc(1984) int local1984 = arg1.anIntArray325[local1273] - arg1.anIntArray325[local1263];
							@Pc(1993) int local1993 = local1984 * local1940 - local1973 * local1951;
							@Pc(2002) int local2002 = local1962 * local1951 - local1984 * local1930;
							@Pc(2011) int local2011 = local1930 * local1973 - local1940 * local1962;
							local1408 = 64.0F / (float) arg1.anIntArray330[local842];
							local1416 = 64.0F / (float) arg1.anIntArray334[local842];
							local1424 = 64.0F / (float) arg1.anIntArray327[local842];
							local1433 = (local1661[0] * (float) local1993 + (float) local2002 * local1661[1] + (float) local2011 * local1661[2]) / local1408;
							local1442 = ((float) local1993 * local1661[3] + (float) local2002 * local1661[4] + (float) local2011 * local1661[5]) / local1416;
							local1450 = (local1661[6] * (float) local1993 + local1661[7] * (float) local2002 + (float) local2011 * local1661[8]) / local1424;
							local1222 = Static94.method1710(local1433, local1442, local1450);
							Static174.method3151(local1222, Static593.aFloatArray77, local1666, local1651, local1656, arg1.anIntArray335[local1263], local1646, local1661, local1322, arg1.anIntArray325[local1263], arg1.anIntArray333[local1263], local1306, local1314);
							local1208 = Static593.aFloatArray77[1];
							local1206 = Static593.aFloatArray77[0];
							Static174.method3151(local1222, Static593.aFloatArray77, local1666, local1651, local1656, arg1.anIntArray335[local1268], local1646, local1661, local1322, arg1.anIntArray325[local1268], arg1.anIntArray333[local1268], local1306, local1314);
							local1212 = Static593.aFloatArray77[1];
							local1210 = Static593.aFloatArray77[0];
							Static174.method3151(local1222, Static593.aFloatArray77, local1666, local1651, local1656, arg1.anIntArray335[local1273], local1646, local1661, local1322, arg1.anIntArray325[local1273], arg1.anIntArray333[local1273], local1306, local1314);
							local1214 = Static593.aFloatArray77[0];
							local1216 = Static593.aFloatArray77[1];
						} else if (local1256 == 3) {
							Static9.method165(Static593.aFloatArray77, local1646, arg1.anIntArray335[local1263], local1651, arg1.anIntArray325[local1263], arg1.anIntArray333[local1263], local1661, local1656, local1666, local1306);
							local1208 = Static593.aFloatArray77[1];
							local1206 = Static593.aFloatArray77[0];
							Static9.method165(Static593.aFloatArray77, local1646, arg1.anIntArray335[local1268], local1651, arg1.anIntArray325[local1268], arg1.anIntArray333[local1268], local1661, local1656, local1666, local1306);
							local1210 = Static593.aFloatArray77[0];
							local1212 = Static593.aFloatArray77[1];
							Static9.method165(Static593.aFloatArray77, local1646, arg1.anIntArray335[local1273], local1651, arg1.anIntArray325[local1273], arg1.anIntArray333[local1273], local1661, local1656, local1666, local1306);
							local1216 = Static593.aFloatArray77[1];
							local1214 = Static593.aFloatArray77[0];
							if ((local1666 & 0x1) == 0) {
								if (local1210 - local1206 > 0.5F) {
									local1218 = 1;
									local1210--;
								} else if (local1206 - local1210 > 0.5F) {
									local1218 = 2;
									local1210++;
								}
								if (local1214 - local1206 > 0.5F) {
									local1220 = 1;
									local1214--;
								} else if (local1206 - local1214 > 0.5F) {
									local1220 = 2;
									local1214++;
								}
							} else {
								if (local1216 - local1208 > 0.5F) {
									local1220 = 1;
									local1216--;
								} else if (local1208 - local1216 > 0.5F) {
									local1216++;
									local1220 = 2;
								}
								if (local1212 - local1208 > 0.5F) {
									local1218 = 1;
									local1212--;
								} else if (local1208 - local1212 > 0.5F) {
									local1218 = 2;
									local1212++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray33 == null) {
				local1256 = 0;
			} else {
				local1256 = arg1.aByteArray33[local1141];
			}
			if (local1256 == 0) {
				@Pc(2575) long local2575 = ((long) (local1222 << 24) + (long) (local1148 << 8) + (long) local853 << 32) + (long) (local842 << 2);
				local1273 = arg1.aShortArray54[local1141];
				local1278 = arg1.aShortArray57[local1141];
				local1283 = arg1.aShortArray52[local1141];
				@Pc(2594) Class122 local2594 = local524[local1273];
				this.aShortArray102[local258] = this.method5678(arg1, local2575, local2594.anInt3962, local1206, local2594.anInt3961, local2594.anInt3957, local1208, local2594.anInt3960, local1273);
				@Pc(2618) Class122 local2618 = local524[local1278];
				this.aShortArray95[local258] = this.method5678(arg1, (long) local1218 + local2575, local2618.anInt3962, local1210, local2618.anInt3961, local2618.anInt3957, local1212, local2618.anInt3960, local1278);
				@Pc(2645) Class122 local2645 = local524[local1283];
				this.aShortArray97[local258] = this.method5678(arg1, (long) local1220 + local2575, local2645.anInt3962, local1214, local2645.anInt3961, local2645.anInt3957, local1216, local2645.anInt3960, local1283);
			} else if (local1256 == 1) {
				@Pc(2438) Class57 local2438 = local812[local1141];
				@Pc(2480) long local2480 = (long) ((local2438.anInt1316 + 256 << 22) + ((local842 << 2) + (local2438.anInt1313 > 0 ? 1024 : 2048)) + (local2438.anInt1317 + 256 << 12)) + ((long) local853 + (long) (local1222 << 24) + (long) (local1148 << 8) << 32);
				this.aShortArray102[local258] = this.method5678(arg1, local2480, local2438.anInt1316, local1206, local2438.anInt1313, local2438.anInt1317, local1208, 0, arg1.aShortArray54[local1141]);
				this.aShortArray95[local258] = this.method5678(arg1, (long) local1218 + local2480, local2438.anInt1316, local1210, local2438.anInt1313, local2438.anInt1317, local1212, 0, arg1.aShortArray57[local1141]);
				this.aShortArray97[local258] = this.method5678(arg1, (long) local1220 + local2480, local2438.anInt1316, local1214, local2438.anInt1313, local2438.anInt1317, local1216, 0, arg1.aShortArray52[local1141]);
			}
			if (arg1.aByteArray34 != null) {
				this.aByteArray70[local258] = arg1.aByteArray34[local1141];
			}
			if (arg1.aShortArray53 != null) {
				this.aShortArray96[local258] = arg1.aShortArray53[local1141];
			}
			this.aShortArray92[local258] = arg1.aShortArray50[local1141];
			this.aShortArray99[local258] = local1184;
		}
		local1141 = 0;
		local831 = -10000;
		for (local842 = 0; local842 < this.anInt6324; local842++) {
			@Pc(2725) short local2725 = this.aShortArray99[local842];
			if (local2725 != local831) {
				local1141++;
				local831 = local2725;
			}
		}
		this.anIntArray563 = new int[local1141 + 1];
		local1141 = 0;
		local831 = -10000;
		for (local853 = 0; local853 < this.anInt6324; local853++) {
			local1184 = this.aShortArray99[local853];
			if (local1184 != local831) {
				local831 = local1184;
				this.anIntArray563[local1141++] = local853;
			}
		}
		this.anIntArray563[local1141] = this.anInt6324;
		Static166.aLongArray6 = null;
		this.aShortArray98 = Static530.method7673(this.aShortArray98, this.anInt6389);
		this.aShortArray94 = Static530.method7673(this.aShortArray94, this.anInt6389);
		this.aShortArray100 = Static530.method7673(this.aShortArray100, this.anInt6389);
		this.aByteArray71 = Static330.method5022(this.anInt6389, this.aByteArray71);
		this.aFloatArray44 = Static204.method3644(this.aFloatArray44, this.anInt6389);
		this.aFloatArray45 = Static204.method3644(this.aFloatArray45, this.anInt6389);
		if (arg1.anIntArray328 != null && Static172.method3125(arg2, this.anInt6348)) {
			this.anIntArrayArray42 = arg1.method3488(false);
		}
		if (arg1.aClass163Array1 != null && Static654.method9112(this.anInt6348, arg2)) {
			this.anIntArrayArray40 = arg1.method3482();
		}
		if (arg1.anIntArray332 != null && Static666.method9182(arg2, this.anInt6348)) {
			local864 = 0;
			@Pc(2874) int[] local2874 = new int[256];
			for (local885 = 0; local885 < this.anInt6364; local885++) {
				local896 = arg1.anIntArray332[local119[local885]];
				if (local896 >= 0) {
					if (local896 > local864) {
						local864 = local896;
					}
					@Pc(2896) int local2896 = local2874[local896]++;
				}
			}
			this.anIntArrayArray41 = new int[local864 + 1][];
			for (local896 = 0; local896 <= local864; local896++) {
				this.anIntArrayArray41[local896] = new int[local2874[local896]];
				local2874[local896] = 0;
			}
			for (local905 = 0; local905 < this.anInt6364; local905++) {
				local914 = arg1.anIntArray332[local119[local905]];
				if (local914 >= 0) {
					this.anIntArrayArray41[local914][local2874[local914]++] = local905;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6335; local7++) {
			this.anIntArray561[local7] = this.anIntArray561[local7] + 7 >> 4;
			this.anIntArray564[local7] = this.anIntArray564[local7] + 7 >> 4;
			this.anIntArray560[local7] = this.anIntArray560[local7] + 7 >> 4;
		}
		this.aBoolean449 = false;
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5672(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg4 << 4;
			local18 = arg3 << 4;
			local22 = arg2 << 4;
			Static329.anInt5474 = 0;
			Static254.anInt4534 = 0;
			Static337.anInt5569 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray42.length) {
					local52 = this.anIntArrayArray42[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static337.anInt5569 += this.anIntArray561[local60];
						Static329.anInt5474 += this.anIntArray564[local60];
						Static254.anInt4534 += this.anIntArray560[local60];
						local30++;
					}
				}
			}
			if (local30 > 0) {
				Static337.anInt5569 = local22 + Static337.anInt5569 / local30;
				Static254.anInt4534 = Static254.anInt4534 / local30 + local14;
				Static329.anInt5474 = Static329.anInt5474 / local30 + local18;
			} else {
				Static329.anInt5474 = local18;
				Static254.anInt4534 = local14;
				Static337.anInt5569 = local22;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local18 = arg3 << 4;
			local14 = arg4 << 4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray42.length > local32) {
					local154 = this.anIntArrayArray42[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local54 = local154[local156];
						this.anIntArray561[local54] += local22;
						this.anIntArray564[local54] += local18;
						this.anIntArray560[local54] += local14;
					}
				}
			}
			return;
		}
		@Pc(269) int local269;
		@Pc(287) int local287;
		@Pc(741) int local741;
		if (arg0 == 2) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray42.length) {
					local154 = this.anIntArrayArray42[local32];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local54 = local154[local156];
							this.anIntArray561[local54] -= Static337.anInt5569;
							this.anIntArray564[local54] -= Static329.anInt5474;
							this.anIntArray560[local54] -= Static254.anInt4534;
							if (arg4 != 0) {
								local60 = Class3_Sub20.anIntArray206[arg4];
								local269 = Class3_Sub20.anIntArray204[arg4];
								local287 = this.anIntArray564[local54] * local60 + local269 * this.anIntArray561[local54] + 16383 >> 14;
								this.anIntArray564[local54] = this.anIntArray564[local54] * local269 + 16383 - local60 * this.anIntArray561[local54] >> 14;
								this.anIntArray561[local54] = local287;
							}
							if (arg2 != 0) {
								local60 = Class3_Sub20.anIntArray206[arg2];
								local269 = Class3_Sub20.anIntArray204[arg2];
								local287 = this.anIntArray564[local54] * local269 + 16383 - local60 * this.anIntArray560[local54] >> 14;
								this.anIntArray560[local54] = local60 * this.anIntArray564[local54] + local269 * this.anIntArray560[local54] + 16383 >> 14;
								this.anIntArray564[local54] = local287;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub20.anIntArray206[arg3];
								local269 = Class3_Sub20.anIntArray204[arg3];
								local287 = this.anIntArray560[local54] * local60 + this.anIntArray561[local54] * local269 + 16383 >> 14;
								this.anIntArray560[local54] = local269 * this.anIntArray560[local54] + 16383 - this.anIntArray561[local54] * local60 >> 14;
								this.anIntArray561[local54] = local287;
							}
							this.anIntArray561[local54] += Static337.anInt5569;
							this.anIntArray564[local54] += Static329.anInt5474;
							this.anIntArray560[local54] += Static254.anInt4534;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local54 = local154[local156];
							this.anIntArray561[local54] -= Static337.anInt5569;
							this.anIntArray564[local54] -= Static329.anInt5474;
							this.anIntArray560[local54] -= Static254.anInt4534;
							if (arg2 != 0) {
								local60 = Class3_Sub20.anIntArray206[arg2];
								local269 = Class3_Sub20.anIntArray204[arg2];
								local287 = this.anIntArray564[local54] * local269 + 16383 - local60 * this.anIntArray560[local54] >> 14;
								this.anIntArray560[local54] = this.anIntArray564[local54] * local60 + this.anIntArray560[local54] * local269 + 16383 >> 14;
								this.anIntArray564[local54] = local287;
							}
							if (arg4 != 0) {
								local60 = Class3_Sub20.anIntArray206[arg4];
								local269 = Class3_Sub20.anIntArray204[arg4];
								local287 = this.anIntArray561[local54] * local269 + local60 * this.anIntArray564[local54] + 16383 >> 14;
								this.anIntArray564[local54] = this.anIntArray564[local54] * local269 + 16383 - local60 * this.anIntArray561[local54] >> 14;
								this.anIntArray561[local54] = local287;
							}
							if (arg3 != 0) {
								local60 = Class3_Sub20.anIntArray206[arg3];
								local269 = Class3_Sub20.anIntArray204[arg3];
								local287 = this.anIntArray561[local54] * local269 + local60 * this.anIntArray560[local54] + 16383 >> 14;
								this.anIntArray560[local54] = this.anIntArray560[local54] * local269 + 16383 - this.anIntArray561[local54] * local60 >> 14;
								this.anIntArray561[local54] = local287;
							}
							this.anIntArray561[local54] += Static337.anInt5569;
							this.anIntArray564[local54] += Static329.anInt5474;
							this.anIntArray560[local54] += Static254.anInt4534;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray42.length) {
						local52 = this.anIntArrayArray42[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local269 = this.anIntArray562[local60];
							local287 = this.anIntArray562[local60 + 1];
							for (local741 = local269; local741 < local287; local741++) {
								@Pc(750) int local750 = this.aShortArray101[local741] - 1;
								if (local750 == -1) {
									break;
								}
								@Pc(759) int local759;
								@Pc(763) int local763;
								@Pc(782) int local782;
								if (arg4 != 0) {
									local759 = Class3_Sub20.anIntArray206[arg4];
									local763 = Class3_Sub20.anIntArray204[arg4];
									local782 = this.aShortArray94[local750] * local759 + local763 * this.aShortArray98[local750] + 16383 >> 14;
									this.aShortArray94[local750] = (short) (local763 * this.aShortArray94[local750] + 16383 - local759 * this.aShortArray98[local750] >> 14);
									this.aShortArray98[local750] = (short) local782;
								}
								if (arg2 != 0) {
									local759 = Class3_Sub20.anIntArray206[arg2];
									local763 = Class3_Sub20.anIntArray204[arg2];
									local782 = this.aShortArray94[local750] * local763 + 16383 - this.aShortArray100[local750] * local759 >> 14;
									this.aShortArray100[local750] = (short) (this.aShortArray100[local750] * local763 + this.aShortArray94[local750] * local759 + 16383 >> 14);
									this.aShortArray94[local750] = (short) local782;
								}
								if (arg3 != 0) {
									local759 = Class3_Sub20.anIntArray206[arg3];
									local763 = Class3_Sub20.anIntArray204[arg3];
									local782 = this.aShortArray98[local750] * local763 + this.aShortArray100[local750] * local759 + 16383 >> 14;
									this.aShortArray100[local750] = (short) (local763 * this.aShortArray100[local750] + 16383 - this.aShortArray98[local750] * local759 >> 14);
									this.aShortArray98[local750] = (short) local782;
								}
							}
						}
					}
				}
				if (this.aClass381_11 == null && this.aClass381_13 != null) {
					this.aClass381_13.anInterface9_7 = null;
				}
				if (this.aClass381_11 != null) {
					this.aClass381_11.anInterface9_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray42.length) {
					local154 = this.anIntArrayArray42[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local54 = local154[local156];
						this.anIntArray561[local54] -= Static337.anInt5569;
						this.anIntArray564[local54] -= Static329.anInt5474;
						this.anIntArray560[local54] -= Static254.anInt4534;
						this.anIntArray561[local54] = this.anIntArray561[local54] * arg2 >> 7;
						this.anIntArray564[local54] = this.anIntArray564[local54] * arg3 >> 7;
						this.anIntArray560[local54] = arg4 * this.anIntArray560[local54] >> 7;
						this.anIntArray561[local54] += Static337.anInt5569;
						this.anIntArray564[local54] += Static329.anInt5474;
						this.anIntArray560[local54] += Static254.anInt4534;
					}
				}
			}
		} else {
			@Pc(1194) Class186 local1194;
			@Pc(1199) Class364 local1199;
			if (arg0 == 5) {
				if (this.anIntArrayArray41 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray41.length > local32) {
							local154 = this.anIntArrayArray41[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local54 = local154[local156];
								local60 = arg2 * 8 + (this.aByteArray70[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray70[local54] = (byte) local60;
							}
							if (local154.length > 0 && this.aClass381_13 != null) {
								this.aClass381_13.anInterface9_7 = null;
							}
						}
					}
					if (this.aClass186Array1 != null) {
						for (local32 = 0; local32 < this.anInt6355; local32++) {
							local1194 = this.aClass186Array1[local32];
							local1199 = this.aClass364Array1[local32];
							local1199.anInt10039 = local1199.anInt10039 & 0xFFFFFF | 255 - (this.aByteArray70[local1194.anInt5081] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1452) Class364 local1452;
				if (arg0 == 8) {
					if (this.anIntArrayArray40 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray40.length > local32) {
								local154 = this.anIntArrayArray40[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1452 = this.aClass364Array1[local154[local156]];
									local1452.anInt10046 += arg3;
									local1452.anInt10042 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray40 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray40.length) {
								local154 = this.anIntArrayArray40[local32];
								for (local156 = 0; local156 < local154.length; local156++) {
									local1452 = this.aClass364Array1[local154[local156]];
									local1452.anInt10036 = local1452.anInt10036 * arg2 >> 7;
									local1452.anInt10045 = local1452.anInt10045 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray40 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray40.length > local32) {
							local154 = this.anIntArrayArray40[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1452 = this.aClass364Array1[local154[local156]];
								local1452.anInt10044 = local1452.anInt10044 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray41 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray41.length) {
						local154 = this.anIntArrayArray41[local32];
						for (local156 = 0; local156 < local154.length; local156++) {
							local54 = local154[local156];
							local60 = this.aShortArray92[local54] & 0xFFFF;
							local269 = local60 >> 10 & 0x3F;
							local287 = local60 >> 7 & 0x7;
							local741 = local60 & 0x7F;
							@Pc(1291) int local1291 = arg2 + local269 & 0x3F;
							local287 += arg3 / 4;
							local741 += arg4;
							if (local287 < 0) {
								local287 = 0;
							} else if (local287 > 7) {
								local287 = 7;
							}
							if (local741 < 0) {
								local741 = 0;
							} else if (local741 > 127) {
								local741 = 127;
							}
							this.aShortArray92[local54] = (short) (local741 | local1291 << 10 | local287 << 7);
						}
						if (local154.length > 0 && this.aClass381_13 != null) {
							this.aClass381_13.anInterface9_7 = null;
						}
					}
				}
				if (this.aClass186Array1 != null) {
					for (local32 = 0; local32 < this.anInt6355; local32++) {
						local1194 = this.aClass186Array1[local32];
						local1199 = this.aClass364Array1[local32];
						local1199.anInt10039 = local1199.anInt10039 & 0xFF000000 | Static363.anIntArray518[this.aShortArray92[local1194.anInt5081] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILclient!uu;ZI)Z")
	@Override
	public boolean method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5675(arg3, arg1, -1, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class95 method5664(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class95_Sub3 local14;
		@Pc(18) Class95_Sub3 local18;
		if (arg0 == 1) {
			local14 = this.aClass13_Sub2_27.aClass95_Sub3_5;
			local18 = this.aClass13_Sub2_27.aClass95_Sub3_10;
		} else if (arg0 == 2) {
			local18 = this.aClass13_Sub2_27.aClass95_Sub3_8;
			local14 = this.aClass13_Sub2_27.aClass95_Sub3_4;
		} else if (arg0 == 3) {
			local18 = this.aClass13_Sub2_27.aClass95_Sub3_7;
			local14 = this.aClass13_Sub2_27.aClass95_Sub3_9;
		} else if (arg0 == 4) {
			local14 = this.aClass13_Sub2_27.aClass95_Sub3_6;
			local18 = this.aClass13_Sub2_27.aClass95_Sub3_1;
		} else if (arg0 == 5) {
			local18 = this.aClass13_Sub2_27.aClass95_Sub3_2;
			local14 = this.aClass13_Sub2_27.aClass95_Sub3_3;
		} else {
			local14 = local18 = new Class95_Sub3(this.aClass13_Sub2_27);
		}
		return this.method5683(local18, arg2, local14, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!nha", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean450;
	}

	@OriginalMember(owner = "client!nha", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6323; local3++) {
			this.anIntArray560[local3] = -this.anIntArray560[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6389; local25++) {
			this.aShortArray100[local25] = (short) -this.aShortArray100[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt6364; local44++) {
			@Pc(51) short local51 = this.aShortArray102[local44];
			this.aShortArray102[local44] = this.aShortArray97[local44];
			this.aShortArray97[local44] = local51;
		}
		if (this.aClass381_11 == null && this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
		}
		if (this.aClass381_11 != null) {
			this.aClass381_11.anInterface9_7 = null;
		}
		if (this.aClass139_1 != null) {
			this.aClass139_1.anInterface17_2 = null;
		}
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
		this.aBoolean449 = false;
	}

	@OriginalMember(owner = "client!nha", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6323; local7++) {
			if (arg0 != 128) {
				this.anIntArray561[local7] = this.anIntArray561[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray564[local7] = arg1 * this.anIntArray564[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray560[local7] = arg2 * this.anIntArray560[local7] >> 7;
			}
		}
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
		this.aBoolean449 = false;
	}

	@OriginalMember(owner = "client!nha", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!uu;IZ)V")
	@Override
	public void method5656(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray93 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6323; local14++) {
			if ((this.aShortArray93[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method9240(this.anIntArray561[local14], this.anIntArray564[local14], this.anIntArray560[local14], local12);
				} else {
					arg0.method9238(this.anIntArray561[local14], this.anIntArray564[local14], this.anIntArray560[local14], local12);
				}
				this.anIntArray561[local14] = local12[0];
				this.anIntArray564[local14] = local12[1];
				this.anIntArray560[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!nha", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort64;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZIIBIILclient!uu;)Z")
	private boolean method5675(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class239 arg5) {
		@Pc(8) Class239_Sub2 local8 = (Class239_Sub2) arg5;
		@Pc(12) Class239_Sub2 local12 = this.aClass13_Sub2_27.aClass239_Sub2_3;
		@Pc(33) float local33 = local12.aFloat165 * local8.aFloat171 + local8.aFloat164 * local12.aFloat163 + local12.aFloat168 * local8.aFloat167 + local12.aFloat164;
		@Pc(54) float local54 = local8.aFloat167 * local12.aFloat170 + local12.aFloat161 * local8.aFloat171 + local8.aFloat164 * local12.aFloat162 + local12.aFloat171;
		Static613.aFloat206 = local12.aFloat165 * local8.aFloat170 + local8.aFloat168 * local12.aFloat163 + local8.aFloat166 * local12.aFloat168;
		Static339.aFloat115 = local8.aFloat169 * local12.aFloat170 + local8.aFloat161 * local12.aFloat161 + local8.aFloat165 * local12.aFloat162;
		@Pc(111) float local111 = local12.aFloat167 + local12.aFloat166 * local8.aFloat167 + local12.aFloat169 * local8.aFloat171 + local12.aFloat160 * local8.aFloat164;
		Static459.aFloat156 = local12.aFloat163 * local8.aFloat163 + local8.aFloat162 * local12.aFloat165 + local12.aFloat168 * local8.aFloat160;
		Static250.aFloat99 = local8.aFloat166 * local12.aFloat170 + local12.aFloat162 * local8.aFloat168 + local12.aFloat161 * local8.aFloat170;
		Static74.aFloat40 = local12.aFloat166 * local8.aFloat169 + local12.aFloat169 * local8.aFloat161 + local8.aFloat165 * local12.aFloat160;
		Static166.aFloat82 = local12.aFloat166 * local8.aFloat160 + local8.aFloat162 * local12.aFloat169 + local12.aFloat160 * local8.aFloat163;
		Static651.aFloat211 = local12.aFloat168 * local8.aFloat169 + local8.aFloat165 * local12.aFloat163 + local12.aFloat165 * local8.aFloat161;
		Static8.aFloat1 = local12.aFloat166 * local8.aFloat166 + local8.aFloat168 * local12.aFloat160 + local12.aFloat169 * local8.aFloat170;
		Static398.aFloat122 = local12.aFloat161 * local8.aFloat162 + local12.aFloat162 * local8.aFloat163 + local12.aFloat170 * local8.aFloat160;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass13_Sub2_27.anInt2168;
		@Pc(255) int local255 = this.aClass13_Sub2_27.anInt2189;
		if (!this.aBoolean449) {
			this.method5677();
		}
		@Pc(269) int local269 = this.aShort63 - this.aShort66 >> 1;
		@Pc(277) int local277 = this.aShort62 - this.aShort61 >> 1;
		@Pc(286) int local286 = this.aShort65 - this.aShort70 >> 1;
		@Pc(291) int local291 = local269 + this.aShort66;
		@Pc(297) int local297 = this.aShort61 + local277;
		@Pc(302) int local302 = local286 + this.aShort70;
		@Pc(309) int local309 = local291 - (local269 << arg4);
		@Pc(316) int local316 = local297 - (local277 << arg4);
		@Pc(328) int local328 = local302 - (local286 << arg4);
		@Pc(335) int local335 = local291 + (local269 << arg4);
		@Pc(341) int local341 = (local277 << arg4) + local297;
		Static190.anIntArray326[0] = local309;
		@Pc(351) int local351 = (local286 << arg4) + local302;
		Static204.anIntArray353[0] = local316;
		Static251.anIntArray411[0] = local328;
		Static190.anIntArray326[1] = local335;
		Static204.anIntArray353[1] = local316;
		Static251.anIntArray411[1] = local328;
		Static190.anIntArray326[2] = local309;
		Static204.anIntArray353[2] = local341;
		Static251.anIntArray411[2] = local328;
		Static190.anIntArray326[3] = local335;
		Static204.anIntArray353[3] = local341;
		Static190.anIntArray326[4] = local309;
		Static251.anIntArray411[3] = local328;
		Static204.anIntArray353[4] = local316;
		Static251.anIntArray411[4] = local351;
		Static190.anIntArray326[5] = local335;
		Static204.anIntArray353[5] = local316;
		Static190.anIntArray326[6] = local309;
		Static251.anIntArray411[5] = local351;
		Static204.anIntArray353[6] = local341;
		Static251.anIntArray411[6] = local351;
		Static190.anIntArray326[7] = local335;
		Static204.anIntArray353[7] = local341;
		Static251.anIntArray411[7] = local351;
		@Pc(476) float local476;
		@Pc(490) float local490;
		@Pc(504) float local504;
		@Pc(452) float local452;
		@Pc(462) float local462;
		@Pc(457) float local457;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = (float) Static190.anIntArray326[local445];
			local457 = (float) Static251.anIntArray411[local445];
			local462 = (float) Static204.anIntArray353[local445];
			local476 = local33 + local462 * Static651.aFloat211 + Static459.aFloat156 * local452 + local457 * Static613.aFloat206;
			local490 = Static250.aFloat99 * local457 + local452 * Static398.aFloat122 + Static339.aFloat115 * local462 + local54;
			local504 = local111 + Static8.aFloat1 * local457 + Static74.aFloat40 * local462 + local452 * Static166.aFloat82;
			if ((float) this.aClass13_Sub2_27.anInt2173 <= local504) {
				if (arg2 > 0) {
					local504 = (float) arg2;
				}
				@Pc(528) float local528 = (float) this.aClass13_Sub2_27.anInt2198 + (float) local251 * local476 / local504;
				if (local528 < local241) {
					local241 = local528;
				}
				@Pc(546) float local546 = (float) this.aClass13_Sub2_27.anInt2192 + local490 * (float) local255 / local504;
				if (local528 > local243) {
					local243 = local528;
				}
				if (local546 < local245) {
					local245 = local546;
				}
				local239 = true;
				if (local247 < local546) {
					local247 = local546;
				}
			}
		}
		if (local239 && local241 < (float) arg3 && (float) arg3 < local243 && local245 < (float) arg1 && local247 > (float) arg1) {
			if (arg0) {
				return true;
			}
			if (this.aClass13_Sub2_27.anIntArray163.length < this.anInt6389) {
				this.aClass13_Sub2_27.anIntArray163 = new int[this.anInt6389];
				this.aClass13_Sub2_27.anIntArray165 = new int[this.anInt6389];
			}
			@Pc(621) int[] local621 = this.aClass13_Sub2_27.anIntArray163;
			@Pc(625) int[] local625 = this.aClass13_Sub2_27.anIntArray165;
			@Pc(714) int local714;
			for (@Pc(627) int local627 = 0; local627 < this.anInt6323; local627++) {
				local462 = (float) this.anIntArray564[local627];
				local452 = (float) this.anIntArray561[local627];
				local457 = (float) this.anIntArray560[local627];
				local504 = Static8.aFloat1 * local457 + Static74.aFloat40 * local462 + Static166.aFloat82 * local452 + local111;
				local476 = Static459.aFloat156 * local452 + Static651.aFloat211 * local462 + Static613.aFloat206 * local457 + local33;
				local490 = local54 + local462 * Static339.aFloat115 + local452 * Static398.aFloat122 + Static250.aFloat99 * local457;
				@Pc(727) int local727;
				@Pc(732) int local732;
				@Pc(739) int local739;
				if (local504 >= (float) this.aClass13_Sub2_27.anInt2173) {
					if (arg2 > 0) {
						local504 = (float) arg2;
					}
					local714 = (int) ((float) local251 * local476 / local504 + (float) this.aClass13_Sub2_27.anInt2198);
					local727 = (int) ((float) this.aClass13_Sub2_27.anInt2192 + local490 * (float) local255 / local504);
					local732 = this.anIntArray562[local627];
					local739 = this.anIntArray562[local627 + 1];
					for (@Pc(741) int local741 = local732; local741 < local739; local741++) {
						@Pc(750) int local750 = this.aShortArray101[local741] - 1;
						if (local750 == -1) {
							break;
						}
						local621[local750] = local714;
						local625[local750] = local727;
					}
				} else {
					local714 = this.anIntArray562[local627];
					local727 = this.anIntArray562[local627 + 1];
					for (local732 = local714; local732 < local727; local732++) {
						local739 = this.aShortArray101[local732] - 1;
						if (local739 == -1) {
							break;
						}
						local621[this.aShortArray101[local732] - 1] = -999999;
					}
				}
			}
			for (local714 = 0; local714 < this.anInt6364; local714++) {
				if (local621[this.aShortArray102[local714]] != -999999 && local621[this.aShortArray95[local714]] != -999999 && local621[this.aShortArray97[local714]] != -999999 && this.method5686(arg3, local625[this.aShortArray102[local714]], local621[this.aShortArray95[local714]], local621[this.aShortArray97[local714]], local625[this.aShortArray95[local714]], arg1, local621[this.aShortArray102[local714]], local625[this.aShortArray97[local714]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nha", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6323; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray564[local15] - local9 * this.anIntArray560[local15] >> 14;
			this.anIntArray560[local15] = local13 * this.anIntArray560[local15] + local9 * this.anIntArray564[local15] >> 14;
			this.anIntArray564[local15] = local33;
		}
		this.aBoolean449 = false;
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!nha", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6323; local15++) {
			@Pc(33) int local33 = this.anIntArray561[local15] * local13 + local9 * this.anIntArray564[local15] >> 14;
			this.anIntArray564[local15] = local13 * this.anIntArray564[local15] - this.anIntArray561[local15] * local9 >> 14;
			this.anIntArray561[local15] = local33;
		}
		this.aBoolean449 = false;
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray42 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6335; local12++) {
			this.anIntArray561[local12] <<= 0x4;
			this.anIntArray564[local12] <<= 0x4;
			this.anIntArray560[local12] <<= 0x4;
		}
		Static337.anInt5569 = 0;
		Static254.anInt4534 = 0;
		Static329.anInt5474 = 0;
		return true;
	}

	@OriginalMember(owner = "client!nha", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt6332 = arg0;
		if (this.aClass324_1 != null && (this.anInt6332 & 0x10000) == 0) {
			this.aByteArray71 = this.aClass324_1.aByteArray95;
			this.aShortArray94 = this.aClass324_1.aShortArray145;
			this.aShortArray98 = this.aClass324_1.aShortArray146;
			this.aShortArray100 = this.aClass324_1.aShortArray144;
			this.aClass324_1 = null;
		}
		this.aBoolean448 = true;
		this.method5682();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IILclient!uu;ZII)Z")
	@Override
	public boolean method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5675(arg3, arg1, arg5, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "()[Lclient!kw;")
	@Override
	public Class197[] method5668() {
		return this.aClass197Array5;
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "(I)V")
	private void method5676() {
		if (this.anInt6324 == 0) {
			return;
		}
		if (this.aByte81 != 0) {
			this.method5684(true);
		}
		this.method5684(false);
		if (this.aClass139_1 != null) {
			if (this.aClass139_1.anInterface17_2 == null) {
				this.method5679((this.aByte81 & 0x10) != 0);
			}
			if (this.aClass139_1.anInterface17_2 != null) {
				this.aClass13_Sub2_27.method1988(this.aClass381_11 != null);
				this.aClass13_Sub2_27.method1971(this.aClass381_11, this.aClass381_13, this.aClass381_12, this.aClass381_10);
				@Pc(77) int local77 = this.anIntArray563.length - 1;
				for (@Pc(79) int local79 = 0; local79 < local77; local79++) {
					@Pc(86) int local86 = this.anIntArray563[local79];
					@Pc(93) int local93 = this.anIntArray563[local79 + 1];
					@Pc(100) int local100 = this.aShortArray99[local86] & 0xFFFF;
					if (local100 == 65535) {
						local100 = -1;
					}
					this.aClass13_Sub2_27.method1985(this.aClass381_11 != null, local100);
					this.aClass13_Sub2_27.method1957(this.aClass139_1.anInterface17_2, (local93 - local86) * 3, local86 * 3);
				}
			}
		}
		this.method5682();
	}

	@OriginalMember(owner = "client!nha", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6332;
	}

	@OriginalMember(owner = "client!nha", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static337.anInt5569 = 0;
			local11 = 0;
			Static254.anInt4534 = 0;
			Static329.anInt5474 = 0;
			for (local17 = 0; local17 < this.anInt6323; local17++) {
				Static337.anInt5569 += this.anIntArray561[local17];
				Static329.anInt5474 += this.anIntArray564[local17];
				Static254.anInt4534 += this.anIntArray560[local17];
				local11++;
			}
			if (local11 <= 0) {
				Static337.anInt5569 = arg1;
				Static329.anInt5474 = arg2;
				Static254.anInt4534 = arg3;
			} else {
				Static337.anInt5569 = arg1 + Static337.anInt5569 / local11;
				Static329.anInt5474 = Static329.anInt5474 / local11 + arg2;
				Static254.anInt4534 = Static254.anInt4534 / local11 + arg3;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt6323; local11++) {
				this.anIntArray561[local11] += arg1;
				this.anIntArray564[local11] += arg2;
				this.anIntArray560[local11] += arg3;
			}
		} else {
			@Pc(153) int local153;
			@Pc(171) int local171;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt6323; local11++) {
					this.anIntArray561[local11] -= Static337.anInt5569;
					this.anIntArray564[local11] -= Static329.anInt5474;
					this.anIntArray560[local11] -= Static254.anInt4534;
					if (arg3 != 0) {
						local17 = Class3_Sub20.anIntArray206[arg3];
						local153 = Class3_Sub20.anIntArray204[arg3];
						local171 = local17 * this.anIntArray564[local11] + local153 * this.anIntArray561[local11] + 16383 >> 14;
						this.anIntArray564[local11] = local153 * this.anIntArray564[local11] + 16383 - local17 * this.anIntArray561[local11] >> 14;
						this.anIntArray561[local11] = local171;
					}
					if (arg1 != 0) {
						local17 = Class3_Sub20.anIntArray206[arg1];
						local153 = Class3_Sub20.anIntArray204[arg1];
						local171 = local153 * this.anIntArray564[local11] + 16383 - local17 * this.anIntArray560[local11] >> 14;
						this.anIntArray560[local11] = this.anIntArray560[local11] * local153 + local17 * this.anIntArray564[local11] + 16383 >> 14;
						this.anIntArray564[local11] = local171;
					}
					if (arg2 != 0) {
						local17 = Class3_Sub20.anIntArray206[arg2];
						local153 = Class3_Sub20.anIntArray204[arg2];
						local171 = this.anIntArray561[local11] * local153 + local17 * this.anIntArray560[local11] + 16383 >> 14;
						this.anIntArray560[local11] = local153 * this.anIntArray560[local11] + 16383 - local17 * this.anIntArray561[local11] >> 14;
						this.anIntArray561[local11] = local171;
					}
					this.anIntArray561[local11] += Static337.anInt5569;
					this.anIntArray564[local11] += Static329.anInt5474;
					this.anIntArray560[local11] += Static254.anInt4534;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt6323; local11++) {
					this.anIntArray561[local11] -= Static337.anInt5569;
					this.anIntArray564[local11] -= Static329.anInt5474;
					this.anIntArray560[local11] -= Static254.anInt4534;
					this.anIntArray561[local11] = this.anIntArray561[local11] * arg1 / 128;
					this.anIntArray564[local11] = this.anIntArray564[local11] * arg2 / 128;
					this.anIntArray560[local11] = arg3 * this.anIntArray560[local11] / 128;
					this.anIntArray561[local11] += Static337.anInt5569;
					this.anIntArray564[local11] += Static329.anInt5474;
					this.anIntArray560[local11] += Static254.anInt4534;
				}
			} else {
				@Pc(508) Class186 local508;
				@Pc(513) Class364 local513;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt6364; local11++) {
						local17 = arg1 * 8 + (this.aByteArray70[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray70[local11] = (byte) local17;
					}
					if (this.aClass381_13 != null) {
						this.aClass381_13.anInterface9_7 = null;
					}
					if (this.aClass186Array1 != null) {
						for (local17 = 0; local17 < this.anInt6355; local17++) {
							local508 = this.aClass186Array1[local17];
							local513 = this.aClass364Array1[local17];
							local513.anInt10039 = 255 - (this.aByteArray70[local508.anInt5081] & 0xFF) << 24 | local513.anInt10039 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt6364; local11++) {
						local17 = this.aShortArray92[local11] & 0xFFFF;
						local153 = local17 >> 10 & 0x3F;
						local171 = local17 >> 7 & 0x7;
						@Pc(570) int local570 = local17 & 0x7F;
						@Pc(576) int local576 = local153 + arg1 & 0x3F;
						local171 += arg2 / 4;
						if (local171 < 0) {
							local171 = 0;
						} else if (local171 > 7) {
							local171 = 7;
						}
						local570 += arg3;
						if (local570 < 0) {
							local570 = 0;
						} else if (local570 > 127) {
							local570 = 127;
						}
						this.aShortArray92[local11] = (short) (local570 | local171 << 7 | local576 << 10);
					}
					if (this.aClass381_13 != null) {
						this.aClass381_13.anInterface9_7 = null;
					}
					if (this.aClass186Array1 != null) {
						for (local17 = 0; local17 < this.anInt6355; local17++) {
							local508 = this.aClass186Array1[local17];
							local513 = this.aClass364Array1[local17];
							local513.anInt10039 = local513.anInt10039 & 0xFF000000 | Static363.anIntArray518[this.aShortArray92[local508.anInt5081] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(691) Class364 local691;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt6355; local11++) {
							local691 = this.aClass364Array1[local11];
							local691.anInt10046 += arg2;
							local691.anInt10042 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt6355; local11++) {
							local691 = this.aClass364Array1[local11];
							local691.anInt10045 = local691.anInt10045 * arg2 >> 7;
							local691.anInt10036 = arg1 * local691.anInt10036 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt6355; local11++) {
							local691 = this.aClass364Array1[local11];
							local691.anInt10044 = arg1 + local691.anInt10044 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "()V")
	@Override
	protected void method5667() {
	}

	@OriginalMember(owner = "client!nha", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "()[Lclient!cba;")
	@Override
	public Class49[] method5654() {
		return this.aClass49Array5;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6364; local3++) {
			local12 = this.aShortArray92[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			@Pc(28) int local28 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local28 += arg3 * (arg2 - local28) >> 7;
			}
			this.aShortArray92[local3] = (short) (local28 | local24 << 7 | local18 << 10);
		}
		if (this.aClass186Array1 != null) {
			for (local12 = 0; local12 < this.anInt6355; local12++) {
				@Pc(106) Class186 local106 = this.aClass186Array1[local12];
				@Pc(111) Class364 local111 = this.aClass364Array1[local12];
				local111.anInt10039 = local111.anInt10039 & 0xFF000000 | Static363.anIntArray518[this.aShortArray92[local106.anInt5081] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "c", descriptor = "()V")
	@Override
	public void method5665() {
		if (this.anInt6389 <= 0 || this.anInt6324 <= 0) {
			return;
		}
		this.method5684(false);
		if ((this.aByte81 & 0x10) == 0 && this.aClass139_1.anInterface17_2 == null) {
			this.method5679(false);
		}
		this.method5682();
	}

	@OriginalMember(owner = "client!nha", name = "e", descriptor = "(I)V")
	private void method5677() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6323; local29++) {
			@Pc(36) int local36 = this.anIntArray561[local29];
			@Pc(41) int local41 = this.anIntArray564[local29];
			@Pc(46) int local46 = this.anIntArray560[local29];
			if (local36 > local13) {
				local13 = local36;
			}
			if (local41 > local15) {
				local15 = local41;
			}
			if (local41 < local9) {
				local9 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local17 < local46) {
				local17 = local46;
			}
			if (local46 < local11) {
				local11 = local46;
			}
			@Pc(92) int local92 = local36 * local36 + local46 * local46;
			if (local92 > local25) {
				local25 = local92;
			}
			local92 = local41 * local41 + local46 * local46 + local36 * local36;
			if (local92 > local27) {
				local27 = local92;
			}
		}
		this.aShort66 = (short) local7;
		this.aShort70 = (short) local11;
		this.aShort62 = (short) local15;
		this.aShort61 = (short) local9;
		this.aShort65 = (short) local17;
		this.aShort63 = (short) local13;
		this.aShort69 = (short) (int) (Math.sqrt((double) local25) + 0.99D);
		this.aShort67 = (short) (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean449 = true;
	}

	@OriginalMember(owner = "client!nha", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
		}
		this.aShort64 = (short) arg0;
		if (this.aClass381_11 != null) {
			this.aClass381_11.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6323; local3++) {
			if (arg0 != 0) {
				this.anIntArray561[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray564[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray560[local3] += arg2;
			}
		}
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
		this.aBoolean449 = false;
	}

	@OriginalMember(owner = "client!nha", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass13_Sub2_27.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6364; local11++) {
			if (this.aShortArray99[local11] == arg0) {
				this.aShortArray99[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class119 local47 = local9.method4673(arg0 & 0xFFFF);
			local37 = local47.aByte53;
			local35 = local47.aByte55;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class119 local68 = local9.method4673(arg1 & 0xFFFF);
			if (local68.aByte57 != 0 || local68.aByte59 != 0) {
				this.aBoolean450 = true;
			}
			local57 = local68.aByte53;
			local55 = local68.aByte55;
		}
		if (!(local57 != local37 | local35 != local55)) {
			return;
		}
		if (this.aClass186Array1 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.anInt6355; local116++) {
				@Pc(123) Class186 local123 = this.aClass186Array1[local116];
				@Pc(128) Class364 local128 = this.aClass364Array1[local116];
				local128.anInt10039 = local128.anInt10039 & 0xFF000000 | Static363.anIntArray518[this.aShortArray92[local123.anInt5081] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5673(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class95_Sub3 local8 = (Class95_Sub3) arg0;
		if (this.anInt6364 == 0 || local8.anInt6364 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt6323;
		@Pc(21) int[] local21 = local8.anIntArray561;
		@Pc(24) int[] local24 = local8.anIntArray564;
		@Pc(27) int[] local27 = local8.anIntArray560;
		@Pc(30) short[] local30 = local8.aShortArray98;
		@Pc(33) short[] local33 = local8.aShortArray94;
		@Pc(36) short[] local36 = local8.aShortArray100;
		@Pc(39) byte[] local39 = local8.aByteArray71;
		@Pc(50) short[] local50;
		@Pc(58) short[] local58;
		@Pc(46) short[] local46;
		@Pc(54) byte[] local54;
		if (this.aClass324_1 == null) {
			local50 = null;
			local46 = null;
			local58 = null;
			local54 = null;
		} else {
			local46 = this.aClass324_1.aShortArray144;
			local50 = this.aClass324_1.aShortArray146;
			local54 = this.aClass324_1.aByteArray95;
			local58 = this.aClass324_1.aShortArray145;
		}
		@Pc(73) short[] local73;
		@Pc(75) short[] local75;
		@Pc(77) short[] local77;
		@Pc(79) byte[] local79;
		if (local8.aClass324_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local73 = local8.aClass324_1.aShortArray146;
			local77 = local8.aClass324_1.aShortArray144;
			local79 = local8.aClass324_1.aByteArray95;
			local75 = local8.aClass324_1.aShortArray145;
		}
		@Pc(100) int[] local100 = local8.anIntArray562;
		@Pc(103) short[] local103 = local8.aShortArray101;
		if (!local8.aBoolean449) {
			local8.method5677();
		}
		@Pc(112) short local112 = local8.aShort61;
		@Pc(115) short local115 = local8.aShort62;
		@Pc(118) short local118 = local8.aShort66;
		@Pc(121) short local121 = local8.aShort63;
		@Pc(124) short local124 = local8.aShort70;
		@Pc(127) short local127 = local8.aShort65;
		for (@Pc(129) int local129 = 0; local129 < this.anInt6323; local129++) {
			@Pc(139) int local139 = this.anIntArray564[local129] - arg2;
			if (local139 >= local112 && local115 >= local139) {
				@Pc(155) int local155 = this.anIntArray561[local129] - arg1;
				if (local118 <= local155 && local121 >= local155) {
					@Pc(175) int local175 = this.anIntArray560[local129] - arg3;
					if (local175 >= local124 && local175 <= local127) {
						@Pc(189) int local189 = -1;
						@Pc(194) int local194 = this.anIntArray562[local129];
						@Pc(201) int local201 = this.anIntArray562[local129 + 1];
						for (@Pc(203) int local203 = local194; local203 < local201; local203++) {
							local189 = this.aShortArray101[local203] - 1;
							if (local189 == -1 || this.aByteArray71[local189] != 0) {
								break;
							}
						}
						if (local189 != -1) {
							for (@Pc(235) int local235 = 0; local235 < local18; local235++) {
								if (local155 == local21[local235] && local175 == local27[local235] && local24[local235] == local139) {
									local201 = local100[local235 + 1];
									local194 = local100[local235];
									@Pc(268) int local268 = -1;
									for (@Pc(270) int local270 = local194; local270 < local201; local270++) {
										local268 = local103[local270] - 1;
										if (local268 == -1 || local39[local268] != 0) {
											break;
										}
									}
									if (local268 != -1) {
										if (local50 == null) {
											this.aClass324_1 = new Class324();
											local50 = this.aClass324_1.aShortArray146 = Static70.method5708(this.aShortArray98);
											local58 = this.aClass324_1.aShortArray145 = Static70.method5708(this.aShortArray94);
											local46 = this.aClass324_1.aShortArray144 = Static70.method5708(this.aShortArray100);
											local54 = this.aClass324_1.aByteArray95 = Static59.method1280(this.aByteArray71);
										}
										if (local73 == null) {
											@Pc(354) Class324 local354 = local8.aClass324_1 = new Class324();
											local73 = local354.aShortArray146 = Static70.method5708(local30);
											local75 = local354.aShortArray145 = Static70.method5708(local33);
											local77 = local354.aShortArray144 = Static70.method5708(local36);
											local79 = local354.aByteArray95 = Static59.method1280(local39);
										}
										@Pc(387) short local387 = this.aShortArray98[local189];
										@Pc(392) short local392 = this.aShortArray94[local189];
										@Pc(397) short local397 = this.aShortArray100[local189];
										@Pc(402) byte local402 = this.aByteArray71[local189];
										local201 = local100[local235 + 1];
										local194 = local100[local235];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local194; local414 < local201; local414++) {
											local422 = local103[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local79[local422] != 0) {
												local73[local422] += local387;
												local75[local422] += local392;
												local77[local422] += local397;
												local79[local422] += local402;
											}
										}
										local397 = local36[local268];
										local392 = local33[local268];
										local201 = this.anIntArray562[local129 + 1];
										local194 = this.anIntArray562[local129];
										local387 = local30[local268];
										local402 = local39[local268];
										for (local422 = local194; local422 < local201; local422++) {
											@Pc(505) int local505 = this.aShortArray101[local422] - 1;
											if (local505 == -1) {
												break;
											}
											if (local54[local505] != 0) {
												local50[local505] += local387;
												local58[local505] += local392;
												local46[local505] += local397;
												local54[local505] += local402;
											}
										}
										if (this.aClass381_11 == null && this.aClass381_13 != null) {
											this.aClass381_13.anInterface9_7 = null;
										}
										if (this.aClass381_11 != null) {
											this.aClass381_11.anInterface9_7 = null;
										}
										if (local8.aClass381_11 == null && local8.aClass381_13 != null) {
											local8.aClass381_13.anInterface9_7 = null;
										}
										if (local8.aClass381_11 != null) {
											local8.aClass381_11.anInterface9_7 = null;
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

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!uu;Lclient!taa;II)V")
	@Override
	public void method5659(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6389 == 0) {
			return;
		}
		@Pc(13) Class239_Sub2 local13 = this.aClass13_Sub2_27.aClass239_Sub2_3;
		@Pc(16) Class239_Sub2 local16 = (Class239_Sub2) arg0;
		if (!this.aBoolean449) {
			this.method5677();
		}
		Static74.aFloat40 = local16.aFloat161 * local13.aFloat169 + local13.aFloat160 * local16.aFloat165 + local13.aFloat166 * local16.aFloat169;
		Static316.aFloat108 = local13.aFloat160 * local16.aFloat164 + local13.aFloat169 * local16.aFloat171 + local13.aFloat166 * local16.aFloat167 + local13.aFloat167;
		@Pc(69) float local69 = Static74.aFloat40 * (float) this.aShort61 + Static316.aFloat108;
		@Pc(77) float local77 = Static316.aFloat108 + Static74.aFloat40 * (float) this.aShort62;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.aShort69;
			local93 = (float) this.aShort69 + local69;
		} else {
			local87 = local69 - (float) this.aShort69;
			local93 = (float) this.aShort69 + local77;
		}
		if (this.aClass13_Sub2_27.aFloat64 <= local87 || (float) this.aClass13_Sub2_27.anInt2173 >= local93) {
			return;
		}
		Static22.aFloat72 = local13.aFloat164 + local16.aFloat167 * local13.aFloat168 + local16.aFloat164 * local13.aFloat163 + local13.aFloat165 * local16.aFloat171;
		Static651.aFloat211 = local13.aFloat163 * local16.aFloat165 + local13.aFloat165 * local16.aFloat161 + local13.aFloat168 * local16.aFloat169;
		@Pc(169) float local169 = Static651.aFloat211 * (float) this.aShort61 + Static22.aFloat72;
		@Pc(177) float local177 = Static22.aFloat72 + Static651.aFloat211 * (float) this.aShort62;
		@Pc(203) float local203;
		@Pc(192) float local192;
		if (local177 < local169) {
			local192 = (float) this.aClass13_Sub2_27.anInt2168 * (local169 + (float) this.aShort69);
			local203 = (local177 - (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2168;
		} else {
			local192 = ((float) this.aShort69 + local177) * (float) this.aClass13_Sub2_27.anInt2168;
			local203 = (local169 - (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2168;
		}
		if (local203 / (float) arg2 >= this.aClass13_Sub2_27.aFloat50 || this.aClass13_Sub2_27.aFloat56 >= local192 / (float) arg2) {
			return;
		}
		Static339.aFloat115 = local16.aFloat161 * local13.aFloat161 + local13.aFloat162 * local16.aFloat165 + local13.aFloat170 * local16.aFloat169;
		Static63.aFloat37 = local13.aFloat171 + local13.aFloat170 * local16.aFloat167 + local16.aFloat164 * local13.aFloat162 + local13.aFloat161 * local16.aFloat171;
		@Pc(294) float local294 = Static63.aFloat37 + (float) this.aShort61 * Static339.aFloat115;
		@Pc(302) float local302 = Static63.aFloat37 + (float) this.aShort62 * Static339.aFloat115;
		@Pc(317) float local317;
		@Pc(328) float local328;
		if (local302 < local294) {
			local328 = (local294 + (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2189;
			local317 = (float) this.aClass13_Sub2_27.anInt2189 * (local302 - (float) this.aShort69);
		} else {
			local317 = (local294 - (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2189;
			local328 = (float) this.aClass13_Sub2_27.anInt2189 * (local302 + (float) this.aShort69);
		}
		if (local317 / (float) arg2 >= this.aClass13_Sub2_27.aFloat48 || this.aClass13_Sub2_27.aFloat52 >= local328 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass186Array1 != null) {
			Static166.aFloat82 = local16.aFloat160 * local13.aFloat166 + local13.aFloat160 * local16.aFloat163 + local13.aFloat169 * local16.aFloat162;
			Static8.aFloat1 = local13.aFloat166 * local16.aFloat166 + local13.aFloat169 * local16.aFloat170 + local13.aFloat160 * local16.aFloat168;
			Static613.aFloat206 = local13.aFloat163 * local16.aFloat168 + local16.aFloat170 * local13.aFloat165 + local16.aFloat166 * local13.aFloat168;
			Static398.aFloat122 = local16.aFloat160 * local13.aFloat170 + local13.aFloat161 * local16.aFloat162 + local16.aFloat163 * local13.aFloat162;
			Static459.aFloat156 = local13.aFloat168 * local16.aFloat160 + local16.aFloat162 * local13.aFloat165 + local13.aFloat163 * local16.aFloat163;
			Static250.aFloat99 = local16.aFloat166 * local13.aFloat170 + local16.aFloat170 * local13.aFloat161 + local16.aFloat168 * local13.aFloat162;
		}
		if (arg1 != null) {
			@Pc(495) int local495 = this.aShort63 + this.aShort66 >> 1;
			@Pc(503) int local503 = this.aShort65 + this.aShort70 >> 1;
			@Pc(522) int local522 = (int) ((float) this.aShort61 * Static651.aFloat211 + (float) local495 * Static459.aFloat156 + Static22.aFloat72 + Static613.aFloat206 * (float) local503);
			@Pc(541) int local541 = (int) ((float) local503 * Static250.aFloat99 + Static63.aFloat37 + Static398.aFloat122 * (float) local495 + (float) this.aShort61 * Static339.aFloat115);
			@Pc(560) int local560 = (int) (Static8.aFloat1 * (float) local503 + Static316.aFloat108 + Static166.aFloat82 * (float) local495 + Static74.aFloat40 * (float) this.aShort61);
			@Pc(579) int local579 = (int) (Static651.aFloat211 * (float) this.aShort62 + Static22.aFloat72 + Static459.aFloat156 * (float) local495 + (float) local503 * Static613.aFloat206);
			@Pc(598) int local598 = (int) (Static398.aFloat122 * (float) local495 + Static63.aFloat37 + (float) this.aShort62 * Static339.aFloat115 + (float) local503 * Static250.aFloat99);
			@Pc(617) int local617 = (int) (Static8.aFloat1 * (float) local503 + (float) local495 * Static166.aFloat82 + Static316.aFloat108 + (float) this.aShort62 * Static74.aFloat40);
			arg1.anInt9150 = this.aClass13_Sub2_27.anInt2192 + this.aClass13_Sub2_27.anInt2189 * local598 / arg2;
			arg1.anInt9152 = local541 * this.aClass13_Sub2_27.anInt2189 / arg2 + this.aClass13_Sub2_27.anInt2192;
			arg1.anInt9153 = this.aClass13_Sub2_27.anInt2198 + this.aClass13_Sub2_27.anInt2168 * local579 / arg2;
			arg1.anInt9151 = this.aClass13_Sub2_27.anInt2168 * local522 / arg2 + this.aClass13_Sub2_27.anInt2198;
			if (this.aClass13_Sub2_27.anInt2173 <= local560 || local617 >= this.aClass13_Sub2_27.anInt2173) {
				arg1.aBoolean716 = true;
				arg1.anInt9149 = (local522 + this.aShort69) * this.aClass13_Sub2_27.anInt2168 / arg2 + this.aClass13_Sub2_27.anInt2198 - arg1.anInt9151;
			}
		}
		this.aClass13_Sub2_27.method1984((float) arg2);
		this.aClass13_Sub2_27.method2021();
		this.aClass13_Sub2_27.method2014(local16);
		this.method5676();
		this.aClass13_Sub2_27.method1970();
		this.method5680();
	}

	@OriginalMember(owner = "client!nha", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort68;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!gfa;JIFIIIFII)S")
	private short method5678(@OriginalArg(0) Class117 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray562[arg8];
		@Pc(22) int local22 = this.anIntArray562[arg8 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local10; local26 < local22; local26++) {
			@Pc(33) short local33 = this.aShortArray101[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (Static166.aLongArray6[local26] == arg1) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray101[local24] = (short) (this.anInt6389 + 1);
		Static166.aLongArray6[local24] = arg1;
		this.aShortArray98[this.anInt6389] = (short) arg4;
		this.aShortArray94[this.anInt6389] = (short) arg5;
		this.aShortArray100[this.anInt6389] = (short) arg2;
		this.aByteArray71[this.anInt6389] = (byte) arg7;
		this.aFloatArray44[this.anInt6389] = arg3;
		this.aFloatArray45[this.anInt6389] = arg6;
		return (short) this.anInt6389++;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6323; local15++) {
			@Pc(33) int local33 = this.anIntArray561[local15] * local13 + this.anIntArray560[local15] * local9 >> 14;
			this.anIntArray560[local15] = this.anIntArray560[local15] * local13 - this.anIntArray561[local15] * local9 >> 14;
			this.anIntArray561[local15] = local33;
		}
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
		this.aBoolean449 = false;
	}

	@OriginalMember(owner = "client!nha", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!nha", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub11_Sub3 ba(@OriginalArg(0) Class3_Sub11_Sub3 arg0) {
		if (this.anInt6389 == 0) {
			return null;
		}
		if (!this.aBoolean449) {
			this.method5677();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass13_Sub2_27.anInt2165 <= 0) {
			local40 = this.aShort66 - (this.aClass13_Sub2_27.anInt2165 * this.aShort61 >> 8) >> this.aClass13_Sub2_27.anInt2154;
			local56 = this.aShort63 - (this.aClass13_Sub2_27.anInt2165 * this.aShort62 >> 8) >> this.aClass13_Sub2_27.anInt2154;
		} else {
			local40 = this.aShort66 - (this.aShort62 * this.aClass13_Sub2_27.anInt2165 >> 8) >> this.aClass13_Sub2_27.anInt2154;
			local56 = this.aShort63 - (this.aClass13_Sub2_27.anInt2165 * this.aShort61 >> 8) >> this.aClass13_Sub2_27.anInt2154;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass13_Sub2_27.anInt2177 > 0) {
			local115 = this.aShort70 - (this.aClass13_Sub2_27.anInt2177 * this.aShort62 >> 8) >> this.aClass13_Sub2_27.anInt2154;
			local132 = this.aShort65 - (this.aClass13_Sub2_27.anInt2177 * this.aShort61 >> 8) >> this.aClass13_Sub2_27.anInt2154;
		} else {
			local115 = this.aShort70 - (this.aShort61 * this.aClass13_Sub2_27.anInt2177 >> 8) >> this.aClass13_Sub2_27.anInt2154;
			local132 = this.aShort65 - (this.aClass13_Sub2_27.anInt2177 * this.aShort62 >> 8) >> this.aClass13_Sub2_27.anInt2154;
		}
		@Pc(175) int local175 = local56 + 1 - local40;
		@Pc(181) int local181 = local132 + 1 - local115;
		@Pc(184) Class3_Sub11_Sub3_Sub2 local184 = (Class3_Sub11_Sub3_Sub2) arg0;
		@Pc(194) Class3_Sub11_Sub3_Sub2 local194;
		if (local184 != null && local184.method6861(local181, local175)) {
			local194 = local184;
			local184.method6864();
		} else {
			local194 = new Class3_Sub11_Sub3_Sub2(this.aClass13_Sub2_27, local175, local181);
		}
		local194.method6865(local40, local56, local132, local115);
		this.method5681(local194);
		return local194;
	}

	@OriginalMember(owner = "client!nha", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!nha", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6364; local3++) {
			if (arg0 == this.aShortArray92[local3]) {
				this.aShortArray92[local3] = arg1;
			}
		}
		if (this.aClass186Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt6355; local34++) {
				@Pc(41) Class186 local41 = this.aClass186Array1[local34];
				@Pc(46) Class364 local46 = this.aClass364Array1[local34];
				local46.anInt10039 = local46.anInt10039 & 0xFF000000 | Static363.anIntArray518[this.aShortArray92[local41.anInt5081] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort68 = (short) arg0;
		if (this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "b", descriptor = "()V")
	@Override
	protected void method5660() {
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method5669(@OriginalArg(0) Class239 arg0) {
		@Pc(8) Class239_Sub2 local8 = (Class239_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass49Array5 != null) {
			for (local13 = 0; local13 < this.aClass49Array5.length; local13++) {
				@Pc(20) Class49 local20 = this.aClass49Array5[local13];
				@Pc(22) Class49 local22 = local20;
				if (local20.aClass49_1 != null) {
					local22 = local20.aClass49_1;
				}
				local22.anInt1238 = (int) (local8.aFloat164 + local8.aFloat168 * (float) this.anIntArray560[local20.anInt1244] + local8.aFloat165 * (float) this.anIntArray564[local20.anInt1244] + (float) this.anIntArray561[local20.anInt1244] * local8.aFloat163);
				local22.anInt1233 = (int) (local8.aFloat170 * (float) this.anIntArray560[local20.anInt1244] + (float) this.anIntArray564[local20.anInt1244] * local8.aFloat161 + local8.aFloat162 * (float) this.anIntArray561[local20.anInt1244] + local8.aFloat171);
				local22.anInt1234 = (int) (local8.aFloat167 + local8.aFloat166 * (float) this.anIntArray560[local20.anInt1244] + local8.aFloat169 * (float) this.anIntArray564[local20.anInt1244] + (float) this.anIntArray561[local20.anInt1244] * local8.aFloat160);
				local22.anInt1239 = (int) ((float) this.anIntArray560[local20.anInt1241] * local8.aFloat168 + (float) this.anIntArray564[local20.anInt1241] * local8.aFloat165 + local8.aFloat163 * (float) this.anIntArray561[local20.anInt1241] + local8.aFloat164);
				local22.anInt1231 = (int) (local8.aFloat171 + local8.aFloat162 * (float) this.anIntArray561[local20.anInt1241] + local8.aFloat161 * (float) this.anIntArray564[local20.anInt1241] + (float) this.anIntArray560[local20.anInt1241] * local8.aFloat170);
				local22.anInt1246 = (int) ((float) this.anIntArray561[local20.anInt1241] * local8.aFloat160 + local8.aFloat169 * (float) this.anIntArray564[local20.anInt1241] + local8.aFloat166 * (float) this.anIntArray560[local20.anInt1241] + local8.aFloat167);
				local22.anInt1232 = (int) (local8.aFloat164 + local8.aFloat168 * (float) this.anIntArray560[local20.anInt1237] + (float) this.anIntArray561[local20.anInt1237] * local8.aFloat163 + local8.aFloat165 * (float) this.anIntArray564[local20.anInt1237]);
				local22.anInt1245 = (int) (local8.aFloat162 * (float) this.anIntArray561[local20.anInt1237] + (float) this.anIntArray564[local20.anInt1237] * local8.aFloat161 + (float) this.anIntArray560[local20.anInt1237] * local8.aFloat170 + local8.aFloat171);
				local22.anInt1248 = (int) (local8.aFloat160 * (float) this.anIntArray561[local20.anInt1237] + local8.aFloat169 * (float) this.anIntArray564[local20.anInt1237] + local8.aFloat166 * (float) this.anIntArray560[local20.anInt1237] + local8.aFloat167);
			}
		}
		if (this.aClass197Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass197Array5.length; local13++) {
			@Pc(365) Class197 local365 = this.aClass197Array5[local13];
			@Pc(367) Class197 local367 = local365;
			if (local365.aClass197_1 != null) {
				local367 = local365.aClass197_1;
			}
			if (local365.aClass239_5 == null) {
				local365.aClass239_5 = local8.method9235();
			} else {
				local365.aClass239_5.method9247(local8);
			}
			local367.anInt5427 = (int) (local8.aFloat164 + local8.aFloat165 * (float) this.anIntArray564[local365.anInt5432] + local8.aFloat163 * (float) this.anIntArray561[local365.anInt5432] + (float) this.anIntArray560[local365.anInt5432] * local8.aFloat168);
			local367.anInt5431 = (int) (local8.aFloat171 + local8.aFloat161 * (float) this.anIntArray564[local365.anInt5432] + local8.aFloat162 * (float) this.anIntArray561[local365.anInt5432] + (float) this.anIntArray560[local365.anInt5432] * local8.aFloat170);
			local367.anInt5428 = (int) (local8.aFloat167 + (float) this.anIntArray564[local365.anInt5432] * local8.aFloat169 + local8.aFloat160 * (float) this.anIntArray561[local365.anInt5432] + (float) this.anIntArray560[local365.anInt5432] * local8.aFloat166);
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZB)V")
	private void method5679(@OriginalArg(0) boolean arg0) {
		if (this.anInt6324 * 6 > this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1.aByteArray106.length) {
			this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1 = new Class3_Sub25_Sub2((this.anInt6324 + 100) * 6);
		} else {
			this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1.anInt9765 = 0;
		}
		@Pc(38) Class3_Sub25_Sub2 local38 = this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1;
		@Pc(44) int local44;
		if (this.aClass13_Sub2_27.aBoolean166) {
			for (local44 = 0; local44 < this.anInt6324; local44++) {
				local38.method8649(this.aShortArray102[local44]);
				local38.method8649(this.aShortArray95[local44]);
				local38.method8649(this.aShortArray97[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt6324; local44++) {
				local38.method8602(this.aShortArray102[local44]);
				local38.method8602(this.aShortArray95[local44]);
				local38.method8602(this.aShortArray97[local44]);
			}
		}
		if (local38.anInt9765 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface17_3 == null) {
				this.anInterface17_3 = this.aClass13_Sub2_27.method1968(local38.anInt9765, true, local38.aByteArray106);
			} else {
				this.anInterface17_3.method6786(local38.anInt9765, local38.aByteArray106);
			}
			this.aClass139_1.anInterface17_2 = this.anInterface17_3;
		} else {
			this.aClass139_1.anInterface17_2 = this.aClass13_Sub2_27.method1968(local38.anInt9765, false, local38.aByteArray106);
		}
		if (!arg0) {
			this.aBoolean448 = true;
		}
	}

	@OriginalMember(owner = "client!nha", name = "f", descriptor = "(I)V")
	private void method5680() {
		if (this.aClass186Array1 == null) {
			return;
		}
		@Pc(8) Class239_Sub2 local8 = this.aClass13_Sub2_27.aClass239_Sub2_2;
		this.aClass13_Sub2_27.method1982();
		this.aClass13_Sub2_27.C(!this.aBoolean447);
		this.aClass13_Sub2_27.method1988(false);
		this.aClass13_Sub2_27.method1971((Class381) null, (Class381) null, this.aClass13_Sub2_27.aClass381_6, this.aClass13_Sub2_27.aClass381_5);
		for (@Pc(40) int local40 = 0; local40 < this.anInt6355; local40++) {
			@Pc(47) Class186 local47 = this.aClass186Array1[local40];
			@Pc(52) Class364 local52 = this.aClass364Array1[local40];
			if (!local47.aBoolean371 || !this.aClass13_Sub2_27.method8451()) {
				@Pc(80) float local80 = (float) (this.anIntArray561[local47.anInt5085] + this.anIntArray561[local47.anInt5083] + this.anIntArray561[local47.anInt5082]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray564[local47.anInt5082] + this.anIntArray564[local47.anInt5085] + this.anIntArray564[local47.anInt5083]) * 0.3333333F;
				@Pc(123) float local123 = (float) (this.anIntArray560[local47.anInt5085] + this.anIntArray560[local47.anInt5083] + this.anIntArray560[local47.anInt5082]) * 0.3333333F;
				@Pc(137) float local137 = local123 * Static613.aFloat206 + Static651.aFloat211 * local101 + local80 * Static459.aFloat156 + Static22.aFloat72;
				@Pc(151) float local151 = local123 * Static250.aFloat99 + Static339.aFloat115 * local101 + Static398.aFloat122 * local80 + Static63.aFloat37;
				@Pc(165) float local165 = Static316.aFloat108 + local101 * Static74.aFloat40 + Static166.aFloat82 * local80 + local123 * Static8.aFloat1;
				@Pc(186) float local186 = (float) (1.0D / Math.sqrt((double) (local165 * local165 + local151 * local151 + local137 * local137))) * (float) local47.anInt5084;
				local8.method7193((float) local52.anInt10046 + local151 * local186 - local151, local186 * local165 + -local165, (float) local52.anInt10042 + local137 - local186 * local137, local47.aShort52 * local52.anInt10036 >> 7, local47.aShort50 * local52.anInt10045 >> 7, local52.anInt10044);
				this.aClass13_Sub2_27.method2031(local8);
				@Pc(239) int local239 = local52.anInt10039;
				OpenGL.glColor4ub((byte) (local239 >> 16), (byte) (local239 >> 8), (byte) local239, (byte) (local239 >> 24));
				this.aClass13_Sub2_27.method2011(local47.aShort51);
				this.aClass13_Sub2_27.method2019(local47.aByte75);
				this.aClass13_Sub2_27.method1998(4);
			}
		}
		this.aClass13_Sub2_27.C(true);
		this.aClass13_Sub2_27.method1970();
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILclient!qa;)V")
	private void method5681(@OriginalArg(1) Class3_Sub11_Sub3_Sub2 arg0) {
		if (this.aClass13_Sub2_27.anIntArray163.length < this.anInt6389) {
			this.aClass13_Sub2_27.anIntArray165 = new int[this.anInt6389];
			this.aClass13_Sub2_27.anIntArray163 = new int[this.anInt6389];
		}
		@Pc(32) int[] local32 = this.aClass13_Sub2_27.anIntArray163;
		@Pc(36) int[] local36 = this.aClass13_Sub2_27.anIntArray165;
		@Pc(63) int local63;
		@Pc(102) int local102;
		@Pc(111) int local111;
		for (@Pc(38) int local38 = 0; local38 < this.anInt6323; local38++) {
			local63 = (this.anIntArray561[local38] - (this.aClass13_Sub2_27.anInt2165 * this.anIntArray564[local38] >> 8) >> this.aClass13_Sub2_27.anInt2154) - arg0.anInt7827;
			@Pc(88) int local88 = (this.anIntArray560[local38] - (this.anIntArray564[local38] * this.aClass13_Sub2_27.anInt2177 >> 8) >> this.aClass13_Sub2_27.anInt2154) - arg0.anInt7829;
			@Pc(93) int local93 = this.anIntArray562[local38];
			@Pc(100) int local100 = this.anIntArray562[local38 + 1];
			for (local102 = local93; local102 < local100; local102++) {
				local111 = this.aShortArray101[local102] - 1;
				if (local111 == -1) {
					break;
				}
				local32[local111] = local63;
				local36[local111] = local88;
			}
		}
		for (local63 = 0; local63 < this.anInt6324; local63++) {
			if (this.aByteArray70 == null || this.aByteArray70[local63] <= 128) {
				@Pc(160) short local160 = this.aShortArray102[local63];
				@Pc(165) short local165 = this.aShortArray95[local63];
				@Pc(170) short local170 = this.aShortArray97[local63];
				local102 = local32[local160];
				local111 = local32[local165];
				@Pc(182) int local182 = local32[local170];
				@Pc(186) int local186 = local36[local160];
				@Pc(190) int local190 = local36[local165];
				@Pc(194) int local194 = local36[local170];
				if (-((local182 - local111) * (local190 - local186)) + (local190 - local194) * (local102 - local111) > 0) {
					arg0.method6862(local190, local111, local182, local194, local102, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static329.anInt5474 = 0;
			Static337.anInt5569 = 0;
			Static254.anInt4534 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray42.length > local38) {
					local52 = this.anIntArrayArray42[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray93 == null || (this.aShortArray93[local60] & arg6) != 0) {
							Static337.anInt5569 += this.anIntArray561[local60];
							Static329.anInt5474 += this.anIntArray564[local60];
							Static254.anInt4534 += this.anIntArray560[local60];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static337.anInt5569 = arg2;
				Static254.anInt4534 = arg4;
				Static329.anInt5474 = arg3;
			} else {
				Static329.anInt5474 = arg3 + Static329.anInt5474 / local30;
				Static161.aBoolean245 = true;
				Static337.anInt5569 = arg2 + Static337.anInt5569 / local30;
				Static254.anInt4534 = Static254.anInt4534 / local30 + arg4;
			}
			return;
		}
		@Pc(248) int[] local248;
		@Pc(250) int local250;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg3 * arg7[1] + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg4 * arg7[5] + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg7[7] * arg3 + arg2 * arg7[6] + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local30;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray42.length > local32) {
					local248 = this.anIntArrayArray42[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local54 = local248[local250];
						if (this.aShortArray93 == null || (this.aShortArray93[local54] & arg6) != 0) {
							this.anIntArray561[local54] += arg2;
							this.anIntArray564[local54] += arg3;
							this.anIntArray560[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(401) int local401;
		@Pc(625) int local625;
		@Pc(634) int local634;
		@Pc(643) int local643;
		@Pc(647) int local647;
		@Pc(665) int local665;
		@Pc(1004) int local1004;
		@Pc(1012) int local1012;
		@Pc(1167) int local1167;
		@Pc(1193) int local1193;
		@Pc(1197) int local1197;
		@Pc(1205) int local1205;
		@Pc(1210) int local1210;
		@Pc(1214) int local1214;
		@Pc(1218) int local1218;
		@Pc(1220) int local1220;
		@Pc(1349) int[] local1349;
		@Pc(1351) int local1351;
		@Pc(1355) int local1355;
		@Pc(1359) int local1359;
		@Pc(1361) int local1361;
		@Pc(1487) int local1487;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray42.length) {
						local248 = this.anIntArrayArray42[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local54 = local248[local250];
							if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local54]) != 0) {
								this.anIntArray561[local54] -= Static337.anInt5569;
								this.anIntArray564[local54] -= Static329.anInt5474;
								this.anIntArray560[local54] -= Static254.anInt4534;
								if (arg4 != 0) {
									local60 = Class3_Sub20.anIntArray206[arg4];
									local382 = Class3_Sub20.anIntArray204[arg4];
									local401 = local60 * this.anIntArray564[local54] + local382 * this.anIntArray561[local54] + 16383 >> 14;
									this.anIntArray564[local54] = local382 * this.anIntArray564[local54] + 16383 - this.anIntArray561[local54] * local60 >> 14;
									this.anIntArray561[local54] = local401;
								}
								if (arg2 != 0) {
									local60 = Class3_Sub20.anIntArray206[arg2];
									local382 = Class3_Sub20.anIntArray204[arg2];
									local401 = this.anIntArray564[local54] * local382 + 16383 - this.anIntArray560[local54] * local60 >> 14;
									this.anIntArray560[local54] = local60 * this.anIntArray564[local54] + local382 * this.anIntArray560[local54] + 16383 >> 14;
									this.anIntArray564[local54] = local401;
								}
								if (arg3 != 0) {
									local60 = Class3_Sub20.anIntArray206[arg3];
									local382 = Class3_Sub20.anIntArray204[arg3];
									local401 = local382 * this.anIntArray561[local54] + local60 * this.anIntArray560[local54] + 16383 >> 14;
									this.anIntArray560[local54] = local382 * this.anIntArray560[local54] + 16383 - this.anIntArray561[local54] * local60 >> 14;
									this.anIntArray561[local54] = local401;
								}
								this.anIntArray561[local54] += Static337.anInt5569;
								this.anIntArray564[local54] += Static329.anInt5474;
								this.anIntArray560[local54] += Static254.anInt4534;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray42.length > local38) {
							local52 = this.anIntArrayArray42[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local60]) != 0) {
									local382 = this.anIntArray562[local60];
									local401 = this.anIntArray562[local60 + 1];
									for (local625 = local382; local625 < local401; local625++) {
										local634 = this.aShortArray101[local625] - 1;
										if (local634 == -1) {
											break;
										}
										if (arg4 != 0) {
											local643 = Class3_Sub20.anIntArray206[arg4];
											local647 = Class3_Sub20.anIntArray204[arg4];
											local665 = this.aShortArray94[local634] * local643 + local647 * this.aShortArray98[local634] + 16383 >> 14;
											this.aShortArray94[local634] = (short) (local647 * this.aShortArray94[local634] + 16383 - local643 * this.aShortArray98[local634] >> 14);
											this.aShortArray98[local634] = (short) local665;
										}
										if (arg2 != 0) {
											local643 = Class3_Sub20.anIntArray206[arg2];
											local647 = Class3_Sub20.anIntArray204[arg2];
											local665 = this.aShortArray94[local634] * local647 + 16383 - this.aShortArray100[local634] * local643 >> 14;
											this.aShortArray100[local634] = (short) (local643 * this.aShortArray94[local634] + this.aShortArray100[local634] * local647 + 16383 >> 14);
											this.aShortArray94[local634] = (short) local665;
										}
										if (arg3 != 0) {
											local643 = Class3_Sub20.anIntArray206[arg3];
											local647 = Class3_Sub20.anIntArray204[arg3];
											local665 = this.aShortArray98[local634] * local647 + this.aShortArray100[local634] * local643 + 16383 >> 14;
											this.aShortArray100[local634] = (short) (this.aShortArray100[local634] * local647 + 16383 - local643 * this.aShortArray98[local634] >> 14);
											this.aShortArray98[local634] = (short) local665;
										}
									}
								}
							}
						}
					}
					if (this.aClass381_11 == null && this.aClass381_13 != null) {
						this.aClass381_13.anInterface9_7 = null;
					}
					if (this.aClass381_11 != null) {
						this.aClass381_11.anInterface9_7 = null;
						return;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local250 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static161.aBoolean245) {
					local382 = Static329.anInt5474 * arg7[3] + arg7[0] * Static337.anInt5569 + Static254.anInt4534 * arg7[6] + 8192 >> 14;
					local401 = arg7[4] * Static329.anInt5474 + Static337.anInt5569 * arg7[1] + Static254.anInt4534 * arg7[7] + 8192 >> 14;
					local625 = Static329.anInt5474 * arg7[5] + Static337.anInt5569 * arg7[2] + Static254.anInt4534 * arg7[8] + 8192 >> 14;
					local382 += local250;
					local401 += local54;
					Static329.anInt5474 = local401;
					Static337.anInt5569 = local382;
					local625 += local60;
					Static161.aBoolean245 = false;
					Static254.anInt4534 = local625;
				}
				@Pc(972) int[] local972 = new int[9];
				local401 = Class3_Sub20.anIntArray204[arg2];
				local625 = Class3_Sub20.anIntArray206[arg2];
				local634 = Class3_Sub20.anIntArray204[arg3];
				local643 = Class3_Sub20.anIntArray206[arg3];
				local647 = Class3_Sub20.anIntArray204[arg4];
				local665 = Class3_Sub20.anIntArray206[arg4];
				local1004 = local647 * local625 + 8192 >> 14;
				local1012 = local665 * local625 + 8192 >> 14;
				local972[3] = local665 * local401 + 8192 >> 14;
				local972[6] = local1012 * local634 + -local643 * local647 + 8192 >> 14;
				local972[7] = local665 * local643 + local634 * local1004 + 8192 >> 14;
				local972[5] = -local625;
				local972[0] = local1012 * local643 + local634 * local647 + 8192 >> 14;
				local972[8] = local401 * local634 + 8192 >> 14;
				local972[4] = local647 * local401 + 8192 >> 14;
				local972[1] = local1004 * local643 + local665 * -local634 + 8192 >> 14;
				local972[2] = local401 * local643 + 8192 >> 14;
				@Pc(1142) int local1142 = local972[1] * -Static329.anInt5474 + -Static337.anInt5569 * local972[0] + local972[2] * -Static254.anInt4534 + 8192 >> 14;
				local1167 = -Static329.anInt5474 * local972[4] + -Static337.anInt5569 * local972[3] + -Static254.anInt4534 * local972[5] + 8192 >> 14;
				local1193 = -Static337.anInt5569 * local972[6] + -Static329.anInt5474 * local972[7] + local972[8] * -Static254.anInt4534 + 8192 >> 14;
				local1197 = Static337.anInt5569 + local1142;
				@Pc(1201) int local1201 = Static329.anInt5474 + local1167;
				local1205 = Static254.anInt4534 + local1193;
				@Pc(1208) int[] local1208 = new int[9];
				for (local1210 = 0; local1210 < 3; local1210++) {
					for (local1214 = 0; local1214 < 3; local1214++) {
						local1218 = 0;
						for (local1220 = 0; local1220 < 3; local1220++) {
							local1218 += arg7[local1220 + local1214 * 3] * local972[local1220 + local1210 * 3];
						}
						local1208[local1214 + local1210 * 3] = local1218 + 8192 >> 14;
					}
				}
				local1214 = local972[2] * local60 + local250 * local972[0] + local54 * local972[1] + 8192 >> 14;
				local1218 = local54 * local972[4] + local972[3] * local250 + local972[5] * local60 + 8192 >> 14;
				local1220 = local60 * local972[8] + local972[7] * local54 + local972[6] * local250 + 8192 >> 14;
				local1218 += local1201;
				local1214 += local1197;
				local1220 += local1205;
				local1349 = new int[9];
				for (local1351 = 0; local1351 < 3; local1351++) {
					for (local1355 = 0; local1355 < 3; local1355++) {
						local1359 = 0;
						for (local1361 = 0; local1361 < 3; local1361++) {
							local1359 += arg7[local1361 + local1351 * 3] * local1208[local1361 * 3 + local1355];
						}
						local1349[local1351 * 3 + local1355] = local1359 + 8192 >> 14;
					}
				}
				local1355 = local1220 * arg7[2] + arg7[0] * local1214 + arg7[1] * local1218 + 8192 >> 14;
				local1359 = local1220 * arg7[5] + local1214 * arg7[3] + arg7[4] * local1218 + 8192 >> 14;
				local1359 += local32;
				local1355 += local30;
				local1361 = arg7[8] * local1220 + local1214 * arg7[6] + arg7[7] * local1218 + 8192 >> 14;
				local1361 += local38;
				for (local1487 = 0; local1487 < local8; local1487++) {
					@Pc(1493) int local1493 = arg1[local1487];
					if (local1493 < this.anIntArrayArray42.length) {
						@Pc(1503) int[] local1503 = this.anIntArrayArray42[local1493];
						for (@Pc(1505) int local1505 = 0; local1505 < local1503.length; local1505++) {
							@Pc(1511) int local1511 = local1503[local1505];
							if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local1511]) != 0) {
								@Pc(1552) int local1552 = local1349[0] * this.anIntArray561[local1511] + this.anIntArray564[local1511] * local1349[1] + local1349[2] * this.anIntArray560[local1511] + 8192 >> 14;
								@Pc(1583) int local1583 = this.anIntArray560[local1511] * local1349[5] + local1349[4] * this.anIntArray564[local1511] + this.anIntArray561[local1511] * local1349[3] + 8192 >> 14;
								@Pc(1587) int local1587 = local1583 + local1359;
								@Pc(1618) int local1618 = local1349[6] * this.anIntArray561[local1511] + this.anIntArray564[local1511] * local1349[7] + local1349[8] * this.anIntArray560[local1511] + 8192 >> 14;
								@Pc(1622) int local1622 = local1552 + local1355;
								this.anIntArray561[local1511] = local1622;
								@Pc(1631) int local1631 = local1618 + local1361;
								this.anIntArray564[local1511] = local1587;
								this.anIntArray560[local1511] = local1631;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2549) Class186 local2549;
			@Pc(2554) Class364 local2554;
			if (arg0 == 5) {
				if (this.anIntArrayArray41 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray41.length) {
							local248 = this.anIntArrayArray41[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local54 = local248[local250];
								if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local54]) != 0) {
									local60 = arg2 * 8 + (this.aByteArray70[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray70[local54] = (byte) local60;
									if (this.aClass381_13 != null) {
										this.aClass381_13.anInterface9_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass186Array1 != null) {
						for (local32 = 0; local32 < this.anInt6355; local32++) {
							local2549 = this.aClass186Array1[local32];
							local2554 = this.aClass364Array1[local32];
							local2554.anInt10039 = 255 - (this.aByteArray70[local2549.anInt5081] & 0xFF) << 24 | local2554.anInt10039 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2808) Class364 local2808;
				if (arg0 == 8) {
					if (this.anIntArrayArray40 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray40.length) {
								local248 = this.anIntArrayArray40[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2808 = this.aClass364Array1[local248[local250]];
									local2808.anInt10042 += arg2;
									local2808.anInt10046 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray40 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray40.length) {
								local248 = this.anIntArrayArray40[local32];
								for (local250 = 0; local250 < local248.length; local250++) {
									local2808 = this.aClass364Array1[local248[local250]];
									local2808.anInt10045 = local2808.anInt10045 * arg3 >> 7;
									local2808.anInt10036 = arg2 * local2808.anInt10036 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray40 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray40.length > local32) {
							local248 = this.anIntArrayArray40[local32];
							for (local250 = 0; local250 < local248.length; local250++) {
								local2808 = this.aClass364Array1[local248[local250]];
								local2808.anInt10044 = local2808.anInt10044 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray41 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray41.length > local32) {
						local248 = this.anIntArrayArray41[local32];
						for (local250 = 0; local250 < local248.length; local250++) {
							local54 = local248[local250];
							if (this.aShortArray96 == null || (arg6 & this.aShortArray96[local54]) != 0) {
								local60 = this.aShortArray92[local54] & 0xFFFF;
								local382 = local60 >> 10 & 0x3F;
								local401 = local60 >> 7 & 0x7;
								local401 += arg3 / 4;
								local625 = local60 & 0x7F;
								@Pc(2660) int local2660 = arg2 + local382 & 0x3F;
								if (local401 < 0) {
									local401 = 0;
								} else if (local401 > 7) {
									local401 = 7;
								}
								local625 += arg4;
								if (local625 < 0) {
									local625 = 0;
								} else if (local625 > 127) {
									local625 = 127;
								}
								this.aShortArray92[local54] = (short) (local401 << 7 | local2660 << 10 | local625);
								if (this.aClass381_13 != null) {
									this.aClass381_13.anInterface9_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass186Array1 != null) {
					for (local32 = 0; local32 < this.anInt6355; local32++) {
						local2549 = this.aClass186Array1[local32];
						local2554 = this.aClass364Array1[local32];
						local2554.anInt10039 = Static363.anIntArray518[this.aShortArray92[local2549.anInt5081] & 0xFFFF] & 0xFFFFFF | local2554.anInt10039 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray42.length) {
					local248 = this.anIntArrayArray42[local32];
					for (local250 = 0; local250 < local248.length; local250++) {
						local54 = local248[local250];
						if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local54]) != 0) {
							this.anIntArray561[local54] -= Static337.anInt5569;
							this.anIntArray564[local54] -= Static329.anInt5474;
							this.anIntArray560[local54] -= Static254.anInt4534;
							this.anIntArray561[local54] = arg2 * this.anIntArray561[local54] >> 7;
							this.anIntArray564[local54] = this.anIntArray564[local54] * arg3 >> 7;
							this.anIntArray560[local54] = this.anIntArray560[local54] * arg4 >> 7;
							this.anIntArray561[local54] += Static337.anInt5569;
							this.anIntArray564[local54] += Static329.anInt5474;
							this.anIntArray560[local54] += Static254.anInt4534;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local250 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static161.aBoolean245) {
				local382 = Static254.anInt4534 * arg7[6] + arg7[0] * Static337.anInt5569 + arg7[3] * Static329.anInt5474 + 8192 >> 14;
				local401 = arg7[7] * Static254.anInt4534 + arg7[1] * Static337.anInt5569 + arg7[4] * Static329.anInt5474 + 8192 >> 14;
				local401 += local54;
				local625 = arg7[2] * Static337.anInt5569 + Static329.anInt5474 * arg7[5] + arg7[8] * Static254.anInt4534 + 8192 >> 14;
				local382 += local250;
				local625 += local60;
				Static329.anInt5474 = local401;
				Static337.anInt5569 = local382;
				Static161.aBoolean245 = false;
				Static254.anInt4534 = local625;
			}
			local382 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local625 = arg4 << 15 >> 7;
			local634 = -Static337.anInt5569 * local382 + 8192 >> 14;
			local643 = local401 * -Static329.anInt5474 + 8192 >> 14;
			local647 = -Static254.anInt4534 * local625 + 8192 >> 14;
			local665 = local634 + Static337.anInt5569;
			local1004 = local643 + Static329.anInt5474;
			local1012 = Static254.anInt4534 + local647;
			@Pc(1844) int[] local1844 = new int[] { arg7[0] * local382 + 8192 >> 14, arg7[3] * local382 + 8192 >> 14, local382 * arg7[6] + 8192 >> 14, local401 * arg7[1] + 8192 >> 14, arg7[4] * local401 + 8192 >> 14, arg7[7] * local401 + 8192 >> 14, arg7[2] * local625 + 8192 >> 14, arg7[5] * local625 + 8192 >> 14, local625 * arg7[8] + 8192 >> 14 };
			local1167 = local250 * local382 + 8192 >> 14;
			local1193 = local54 * local401 + 8192 >> 14;
			@Pc(1972) int local1972 = local1167 + local665;
			@Pc(1976) int local1976 = local1193 + local1004;
			local1197 = local625 * local60 + 8192 >> 14;
			@Pc(1988) int local1988 = local1197 + local1012;
			@Pc(1991) int[] local1991 = new int[9];
			@Pc(1997) int local1997;
			for (local1205 = 0; local1205 < 3; local1205++) {
				for (local1997 = 0; local1997 < 3; local1997++) {
					local1210 = 0;
					for (local1214 = 0; local1214 < 3; local1214++) {
						local1210 += arg7[local1205 * 3 + local1214] * local1844[local1214 * 3 + local1997];
					}
					local1991[local1997 + local1205 * 3] = local1210 + 8192 >> 14;
				}
			}
			local1997 = local1988 * arg7[2] + local1972 * arg7[0] + local1976 * arg7[1] + 8192 >> 14;
			local1210 = arg7[3] * local1972 + local1976 * arg7[4] + local1988 * arg7[5] + 8192 >> 14;
			local1997 += local30;
			local1210 += local32;
			local1214 = arg7[8] * local1988 + arg7[6] * local1972 + local1976 * arg7[7] + 8192 >> 14;
			local1214 += local38;
			for (local1218 = 0; local1218 < local8; local1218++) {
				local1220 = arg1[local1218];
				if (local1220 < this.anIntArrayArray42.length) {
					local1349 = this.anIntArrayArray42[local1220];
					for (local1351 = 0; local1351 < local1349.length; local1351++) {
						local1355 = local1349[local1351];
						if (this.aShortArray93 == null || (arg6 & this.aShortArray93[local1355]) != 0) {
							local1359 = local1991[1] * this.anIntArray564[local1355] + local1991[0] * this.anIntArray561[local1355] + this.anIntArray560[local1355] * local1991[2] + 8192 >> 14;
							local1361 = local1991[3] * this.anIntArray561[local1355] + local1991[4] * this.anIntArray564[local1355] + local1991[5] * this.anIntArray560[local1355] + 8192 >> 14;
							@Pc(2235) int local2235 = local1361 + local1210;
							local1487 = this.anIntArray564[local1355] * local1991[7] + local1991[6] * this.anIntArray561[local1355] + this.anIntArray560[local1355] * local1991[8] + 8192 >> 14;
							@Pc(2270) int local2270 = local1359 + local1997;
							this.anIntArray561[local1355] = local2270;
							@Pc(2279) int local2279 = local1487 + local1214;
							this.anIntArray564[local1355] = local2235;
							this.anIntArray560[local1355] = local2279;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Z)V")
	private void method5682() {
		if (!this.aBoolean448) {
			return;
		}
		this.aBoolean448 = false;
		if (this.aClass49Array5 == null && this.aClass197Array5 == null && this.aClass186Array1 == null && !Static457.method6677(this.anInt6348, this.anInt6332)) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			if (this.anIntArray561 != null && !Static72.method1376(this.anInt6332, this.anInt6348)) {
				if (this.aClass381_12 != null && this.aClass381_12.anInterface9_7 == null) {
					this.aBoolean448 = true;
				} else {
					local30 = true;
					if (!this.aBoolean449) {
						this.method5677();
					}
				}
			}
			@Pc(64) boolean local64 = false;
			if (this.anIntArray564 != null && !Static654.method9114(this.anInt6332, this.anInt6348)) {
				if (this.aClass381_12 != null && this.aClass381_12.anInterface9_7 == null) {
					this.aBoolean448 = true;
				} else {
					local32 = true;
					if (!this.aBoolean449) {
						this.method5677();
					}
				}
			}
			if (this.anIntArray560 != null && !Static549.method7861(this.anInt6348, this.anInt6332)) {
				if (this.aClass381_12 != null && this.aClass381_12.anInterface9_7 == null) {
					this.aBoolean448 = true;
				} else {
					local64 = true;
					if (!this.aBoolean449) {
						this.method5677();
					}
				}
			}
			if (local64) {
				this.anIntArray560 = null;
			}
			if (local32) {
				this.anIntArray564 = null;
			}
			if (local30) {
				this.anIntArray561 = null;
			}
		}
		if (this.aShortArray101 != null && this.anIntArray561 == null && this.anIntArray564 == null && this.anIntArray560 == null) {
			this.aShortArray101 = null;
			this.anIntArray562 = null;
		}
		if (this.aByteArray71 != null && !Static392.method5546(this.anInt6332, this.anInt6348)) {
			if (this.aClass381_11 == null) {
				if (this.aClass381_13 != null && this.aClass381_13.anInterface9_7 == null) {
					this.aBoolean448 = true;
				} else {
					this.aByteArray71 = null;
					this.aShortArray98 = this.aShortArray94 = this.aShortArray100 = null;
				}
			} else if (this.aClass381_11.anInterface9_7 == null) {
				this.aBoolean448 = true;
			} else {
				this.aShortArray98 = this.aShortArray94 = this.aShortArray100 = null;
				this.aByteArray71 = null;
			}
		}
		if (this.aShortArray92 != null && !Static85.method1622(this.anInt6332, this.anInt6348)) {
			if (this.aClass381_13 != null && this.aClass381_13.anInterface9_7 == null) {
				this.aBoolean448 = true;
			} else {
				this.aShortArray92 = null;
			}
		}
		if (this.aByteArray70 != null && !Static475.method6878(this.anInt6332, this.anInt6348)) {
			if (this.aClass381_13 != null && this.aClass381_13.anInterface9_7 == null) {
				this.aBoolean448 = true;
			} else {
				this.aByteArray70 = null;
			}
		}
		if (this.aFloatArray44 != null && !Static575.method8117(this.anInt6348, this.anInt6332)) {
			if (this.aClass381_10 != null && this.aClass381_10.anInterface9_7 == null) {
				this.aBoolean448 = true;
			} else {
				this.aFloatArray44 = this.aFloatArray45 = null;
			}
		}
		if (this.aShortArray99 != null && !Static340.method5194(this.anInt6332, this.anInt6348)) {
			if (this.aClass381_13 != null && this.aClass381_13.anInterface9_7 == null) {
				this.aBoolean448 = true;
			} else {
				this.aShortArray99 = null;
			}
		}
		if (this.aShortArray102 != null && !Static256.method3785(this.anInt6348, this.anInt6332)) {
			if (this.aClass139_1 != null && this.aClass139_1.anInterface17_2 == null || this.aClass381_13 != null && this.aClass381_13.anInterface9_7 == null) {
				this.aBoolean448 = true;
			} else {
				this.aShortArray102 = this.aShortArray95 = this.aShortArray97 = null;
			}
		}
		if (this.anIntArrayArray41 != null && !Static666.method9182(this.anInt6332, this.anInt6348)) {
			this.anIntArrayArray41 = null;
			this.aShortArray96 = null;
		}
		if (this.anIntArrayArray42 != null && !Static172.method3125(this.anInt6332, this.anInt6348)) {
			this.aShortArray93 = null;
			this.anIntArrayArray42 = null;
		}
		if (this.anIntArrayArray40 != null && !Static654.method9112(this.anInt6348, this.anInt6332)) {
			this.anIntArrayArray40 = null;
		}
		if (this.anIntArray563 != null && (this.anInt6332 & 0x800) == 0 && (this.anInt6332 & 0x40000) == 0) {
			this.anIntArray563 = null;
		}
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!uu;Lclient!taa;I)V")
	@Override
	public void method5653(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6389 == 0) {
			return;
		}
		@Pc(16) Class239_Sub2 local16 = this.aClass13_Sub2_27.aClass239_Sub2_3;
		if (!this.aBoolean449) {
			this.method5677();
		}
		@Pc(25) Class239_Sub2 local25 = (Class239_Sub2) arg0;
		Static316.aFloat108 = local16.aFloat166 * local25.aFloat167 + local25.aFloat171 * local16.aFloat169 + local16.aFloat160 * local25.aFloat164 + local16.aFloat167;
		Static74.aFloat40 = local25.aFloat169 * local16.aFloat166 + local16.aFloat160 * local25.aFloat165 + local16.aFloat169 * local25.aFloat161;
		@Pc(72) float local72 = Static316.aFloat108 + (float) this.aShort61 * Static74.aFloat40;
		@Pc(80) float local80 = Static316.aFloat108 + Static74.aFloat40 * (float) this.aShort62;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = local80 - (float) this.aShort69;
			local97 = local72 + (float) this.aShort69;
		} else {
			local91 = (float) -this.aShort69 + local72;
			local97 = (float) this.aShort69 + local80;
		}
		if (local91 >= this.aClass13_Sub2_27.aFloat58 || local97 <= (float) this.aClass13_Sub2_27.anInt2173) {
			return;
		}
		Static651.aFloat211 = local16.aFloat163 * local25.aFloat165 + local25.aFloat161 * local16.aFloat165 + local16.aFloat168 * local25.aFloat169;
		Static22.aFloat72 = local16.aFloat163 * local25.aFloat164 + local25.aFloat171 * local16.aFloat165 + local16.aFloat168 * local25.aFloat167 + local16.aFloat164;
		@Pc(173) float local173 = Static651.aFloat211 * (float) this.aShort61 + Static22.aFloat72;
		@Pc(181) float local181 = Static651.aFloat211 * (float) this.aShort62 + Static22.aFloat72;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local181 < local173) {
			local197 = (local181 - (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2168;
			local208 = (float) this.aClass13_Sub2_27.anInt2168 * ((float) this.aShort69 + local173);
		} else {
			local197 = ((float) -this.aShort69 + local173) * (float) this.aClass13_Sub2_27.anInt2168;
			local208 = (float) this.aClass13_Sub2_27.anInt2168 * (local181 + (float) this.aShort69);
		}
		if (this.aClass13_Sub2_27.aFloat50 <= local197 / local97 || local208 / local97 <= this.aClass13_Sub2_27.aFloat56) {
			return;
		}
		Static339.aFloat115 = local16.aFloat161 * local25.aFloat161 + local25.aFloat165 * local16.aFloat162 + local16.aFloat170 * local25.aFloat169;
		Static63.aFloat37 = local16.aFloat171 + local25.aFloat171 * local16.aFloat161 + local25.aFloat164 * local16.aFloat162 + local16.aFloat170 * local25.aFloat167;
		@Pc(297) float local297 = Static63.aFloat37 + Static339.aFloat115 * (float) this.aShort61;
		@Pc(305) float local305 = (float) this.aShort62 * Static339.aFloat115 + Static63.aFloat37;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local297 > local305) {
			local331 = (local297 + (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2189;
			local320 = (float) this.aClass13_Sub2_27.anInt2189 * (local305 - (float) this.aShort69);
		} else {
			local320 = (local297 - (float) this.aShort69) * (float) this.aClass13_Sub2_27.anInt2189;
			local331 = (float) this.aClass13_Sub2_27.anInt2189 * (local305 + (float) this.aShort69);
		}
		if (this.aClass13_Sub2_27.aFloat48 <= local320 / local97 || this.aClass13_Sub2_27.aFloat52 >= local331 / local97) {
			return;
		}
		if (arg1 != null || this.aClass186Array1 != null) {
			Static166.aFloat82 = local25.aFloat160 * local16.aFloat166 + local16.aFloat160 * local25.aFloat163 + local25.aFloat162 * local16.aFloat169;
			Static398.aFloat122 = local25.aFloat160 * local16.aFloat170 + local16.aFloat162 * local25.aFloat163 + local16.aFloat161 * local25.aFloat162;
			Static459.aFloat156 = local25.aFloat160 * local16.aFloat168 + local25.aFloat162 * local16.aFloat165 + local16.aFloat163 * local25.aFloat163;
			Static250.aFloat99 = local16.aFloat161 * local25.aFloat170 + local25.aFloat168 * local16.aFloat162 + local16.aFloat170 * local25.aFloat166;
			Static613.aFloat206 = local25.aFloat166 * local16.aFloat168 + local25.aFloat170 * local16.aFloat165 + local25.aFloat168 * local16.aFloat163;
			Static8.aFloat1 = local25.aFloat170 * local16.aFloat169 + local25.aFloat168 * local16.aFloat160 + local25.aFloat166 * local16.aFloat166;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(500) int local500 = this.aShort63 + this.aShort66 >> 1;
			@Pc(508) int local508 = this.aShort65 + this.aShort70 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static613.aFloat206 + (float) this.aShort61 * Static651.aFloat211 + (float) local500 * Static459.aFloat156 + Static22.aFloat72);
			@Pc(546) int local546 = (int) ((float) this.aShort61 * Static339.aFloat115 + (float) local500 * Static398.aFloat122 + Static63.aFloat37 + (float) local508 * Static250.aFloat99);
			@Pc(565) int local565 = (int) ((float) local508 * Static8.aFloat1 + Static316.aFloat108 + Static166.aFloat82 * (float) local500 + Static74.aFloat40 * (float) this.aShort61);
			if (this.aClass13_Sub2_27.anInt2173 <= local565) {
				arg1.anInt9152 = this.aClass13_Sub2_27.anInt2189 * local546 / local565 + this.aClass13_Sub2_27.anInt2192;
				arg1.anInt9151 = local527 * this.aClass13_Sub2_27.anInt2168 / local565 + this.aClass13_Sub2_27.anInt2198;
			} else {
				local490 = true;
			}
			@Pc(623) int local623 = (int) ((float) local508 * Static613.aFloat206 + Static651.aFloat211 * (float) this.aShort62 + Static22.aFloat72 + Static459.aFloat156 * (float) local500);
			@Pc(642) int local642 = (int) ((float) local508 * Static250.aFloat99 + Static63.aFloat37 + Static398.aFloat122 * (float) local500 + Static339.aFloat115 * (float) this.aShort62);
			@Pc(661) int local661 = (int) (Static316.aFloat108 + (float) local500 * Static166.aFloat82 + Static74.aFloat40 * (float) this.aShort62 + Static8.aFloat1 * (float) local508);
			if (local661 < this.aClass13_Sub2_27.anInt2173) {
				local490 = true;
			} else {
				arg1.anInt9153 = local623 * this.aClass13_Sub2_27.anInt2168 / local661 + this.aClass13_Sub2_27.anInt2198;
				arg1.anInt9150 = this.aClass13_Sub2_27.anInt2189 * local642 / local661 + this.aClass13_Sub2_27.anInt2192;
			}
			if (local490) {
				if (local565 < this.aClass13_Sub2_27.anInt2173 && local661 < this.aClass13_Sub2_27.anInt2173) {
					local492 = false;
				} else {
					@Pc(730) int local730;
					@Pc(742) int local742;
					@Pc(768) int local768;
					if (this.aClass13_Sub2_27.anInt2173 > local565) {
						local730 = (local661 - this.aClass13_Sub2_27.anInt2173 << 16) / (local661 - local565);
						local742 = local623 + (local730 * (local623 - local527) >> 16);
						arg1.anInt9151 = local742 * this.aClass13_Sub2_27.anInt2168 / this.aClass13_Sub2_27.anInt2173 + this.aClass13_Sub2_27.anInt2198;
						local768 = (local730 * (local642 - local546) >> 16) + local642;
						arg1.anInt9152 = this.aClass13_Sub2_27.anInt2189 * local768 / this.aClass13_Sub2_27.anInt2173 + this.aClass13_Sub2_27.anInt2192;
					} else if (local661 < this.aClass13_Sub2_27.anInt2173) {
						local730 = (local565 - this.aClass13_Sub2_27.anInt2173 << 16) / (local565 - local661);
						local742 = ((local527 - local623) * local730 >> 16) + local527;
						local768 = ((local546 - local642) * local730 >> 16) + local546;
						arg1.anInt9151 = this.aClass13_Sub2_27.anInt2168 * local742 / this.aClass13_Sub2_27.anInt2173 + this.aClass13_Sub2_27.anInt2198;
						arg1.anInt9152 = this.aClass13_Sub2_27.anInt2192 + this.aClass13_Sub2_27.anInt2189 * local768 / this.aClass13_Sub2_27.anInt2173;
					}
				}
			}
			if (local492) {
				arg1.aBoolean716 = true;
				if (local565 <= local661) {
					arg1.anInt9149 = this.aClass13_Sub2_27.anInt2198 + this.aClass13_Sub2_27.anInt2168 * (this.aShort69 + local623) / local661 - arg1.anInt9153;
				} else {
					arg1.anInt9149 = this.aClass13_Sub2_27.anInt2198 + this.aClass13_Sub2_27.anInt2168 * (local527 + this.aShort69) / local565 - arg1.anInt9151;
				}
			}
		}
		this.aClass13_Sub2_27.method1959();
		this.aClass13_Sub2_27.method2014(local25);
		this.method5676();
		this.aClass13_Sub2_27.method1970();
		this.method5680();
	}

	@OriginalMember(owner = "client!nha", name = "d", descriptor = "()Z")
	@Override
	public boolean method5666() {
		if (this.aShortArray99 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray99.length; local12++) {
			if (this.aShortArray99[local12] != -1 && !this.aClass13_Sub2_27.anInterface4_14.method4672(this.aShortArray99[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(Lclient!nha;ZLclient!nha;ZII)Lclient!ka;")
	private Class95 method5683(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class95_Sub3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		arg2.aBoolean450 = this.aBoolean450;
		arg2.anInt6335 = this.anInt6335;
		arg2.anInt6323 = this.anInt6323;
		arg2.anInt6348 = this.anInt6348;
		arg2.anInt6324 = this.anInt6324;
		arg2.anInt6332 = arg4;
		arg2.anInt6364 = this.anInt6364;
		arg2.anInt6355 = this.anInt6355;
		arg2.anInt6389 = this.anInt6389;
		if ((arg4 & 0x100) == 0) {
			arg2.aBoolean447 = this.aBoolean447;
		} else {
			arg2.aBoolean447 = true;
		}
		arg2.aShort68 = this.aShort68;
		arg2.aShort64 = this.aShort64;
		arg2.aByte81 = 0;
		@Pc(70) boolean local70 = Static259.method4252(this.anInt6348, arg4);
		@Pc(76) boolean local76 = Static450.method6576(arg4, this.anInt6348);
		@Pc(84) boolean local84 = Static623.method8760(arg4, this.anInt6348);
		@Pc(90) boolean local90 = local70 | local76 | local84;
		@Pc(209) int local209;
		if (local90) {
			if (!local70) {
				arg2.anIntArray561 = this.anIntArray561;
			} else if (arg0.anIntArray561 == null || arg0.anIntArray561.length < this.anInt6335) {
				arg2.anIntArray561 = arg0.anIntArray561 = new int[this.anInt6335];
			} else {
				arg2.anIntArray561 = arg0.anIntArray561;
			}
			if (!local76) {
				arg2.anIntArray564 = this.anIntArray564;
			} else if (arg0.anIntArray564 == null || arg0.anIntArray564.length < this.anInt6335) {
				arg2.anIntArray564 = arg0.anIntArray564 = new int[this.anInt6335];
			} else {
				arg2.anIntArray564 = arg0.anIntArray564;
			}
			if (!local84) {
				arg2.anIntArray560 = this.anIntArray560;
			} else if (arg0.anIntArray560 == null || arg0.anIntArray560.length < this.anInt6335) {
				arg2.anIntArray560 = arg0.anIntArray560 = new int[this.anInt6335];
			} else {
				arg2.anIntArray560 = arg0.anIntArray560;
			}
			for (local209 = 0; local209 < this.anInt6335; local209++) {
				if (local70) {
					arg2.anIntArray561[local209] = this.anIntArray561[local209];
				}
				if (local76) {
					arg2.anIntArray564[local209] = this.anIntArray564[local209];
				}
				if (local84) {
					arg2.anIntArray560[local209] = this.anIntArray560[local209];
				}
			}
		} else {
			arg2.anIntArray561 = this.anIntArray561;
			arg2.anIntArray560 = this.anIntArray560;
			arg2.anIntArray564 = this.anIntArray564;
		}
		if (Static81.method1578(this.anInt6348, arg4)) {
			arg2.aClass381_12 = arg0.aClass381_12;
			if (arg3) {
				arg2.aByte81 = (byte) (arg2.aByte81 | 0x1);
			}
			arg2.aClass381_12.aByte166 = this.aClass381_12.aByte166;
			arg2.aClass381_12.anInterface9_7 = this.aClass381_12.anInterface9_7;
		} else if (Static189.method5093(this.anInt6348, arg4)) {
			arg2.aClass381_12 = this.aClass381_12;
		} else {
			arg2.aClass381_12 = null;
		}
		if (Static631.method8808(this.anInt6348, arg4)) {
			if (arg0.aShortArray92 == null || arg0.aShortArray92.length < this.anInt6364) {
				arg2.aShortArray92 = arg0.aShortArray92 = new short[this.anInt6364];
			} else {
				arg2.aShortArray92 = arg0.aShortArray92;
			}
			for (local209 = 0; local209 < this.anInt6364; local209++) {
				arg2.aShortArray92[local209] = this.aShortArray92[local209];
			}
		} else {
			arg2.aShortArray92 = this.aShortArray92;
		}
		if (Static673.method9356(this.anInt6348, arg4)) {
			if (arg0.aByteArray70 == null || arg0.aByteArray70.length < this.anInt6364) {
				arg2.aByteArray70 = arg0.aByteArray70 = new byte[this.anInt6364];
			} else {
				arg2.aByteArray70 = arg0.aByteArray70;
			}
			for (local209 = 0; local209 < this.anInt6364; local209++) {
				arg2.aByteArray70[local209] = this.aByteArray70[local209];
			}
		} else {
			arg2.aByteArray70 = this.aByteArray70;
		}
		if (Static639.method8893(this.anInt6348, arg4)) {
			arg2.aClass381_13 = arg0.aClass381_13;
			if (arg3) {
				arg2.aByte81 = (byte) (arg2.aByte81 | 0x2);
			}
			arg2.aClass381_13.anInterface9_7 = this.aClass381_13.anInterface9_7;
			arg2.aClass381_13.aByte166 = this.aClass381_13.aByte166;
		} else if (Static53.method1175(this.anInt6348, arg4)) {
			arg2.aClass381_13 = this.aClass381_13;
		} else {
			arg2.aClass381_13 = null;
		}
		@Pc(570) int local570;
		if (Static568.method8029(arg4, this.anInt6348)) {
			if (arg0.aShortArray98 == null || this.anInt6389 > arg0.aShortArray98.length) {
				local209 = this.anInt6389;
				arg2.aShortArray98 = arg0.aShortArray98 = new short[local209];
				arg2.aShortArray94 = arg0.aShortArray94 = new short[local209];
				arg2.aShortArray100 = arg0.aShortArray100 = new short[local209];
			} else {
				arg2.aShortArray94 = arg0.aShortArray94;
				arg2.aShortArray100 = arg0.aShortArray100;
				arg2.aShortArray98 = arg0.aShortArray98;
			}
			if (this.aClass324_1 == null) {
				for (local209 = 0; local209 < this.anInt6389; local209++) {
					arg2.aShortArray98[local209] = this.aShortArray98[local209];
					arg2.aShortArray94[local209] = this.aShortArray94[local209];
					arg2.aShortArray100[local209] = this.aShortArray100[local209];
				}
			} else {
				if (arg0.aClass324_1 == null) {
					arg0.aClass324_1 = new Class324();
				}
				@Pc(558) Class324 local558 = arg2.aClass324_1 = arg0.aClass324_1;
				if (local558.aShortArray146 == null || local558.aShortArray146.length < this.anInt6389) {
					local570 = this.anInt6389;
					local558.aByteArray95 = new byte[local570];
					local558.aShortArray144 = new short[local570];
					local558.aShortArray145 = new short[local570];
					local558.aShortArray146 = new short[local570];
				}
				for (local570 = 0; local570 < this.anInt6389; local570++) {
					arg2.aShortArray98[local570] = this.aShortArray98[local570];
					arg2.aShortArray94[local570] = this.aShortArray94[local570];
					arg2.aShortArray100[local570] = this.aShortArray100[local570];
					local558.aShortArray146[local570] = this.aClass324_1.aShortArray146[local570];
					local558.aShortArray145[local570] = this.aClass324_1.aShortArray145[local570];
					local558.aShortArray144[local570] = this.aClass324_1.aShortArray144[local570];
					local558.aByteArray95[local570] = this.aClass324_1.aByteArray95[local570];
				}
			}
			arg2.aByteArray71 = this.aByteArray71;
		} else {
			arg2.aByteArray71 = this.aByteArray71;
			arg2.aShortArray100 = this.aShortArray100;
			arg2.aClass324_1 = this.aClass324_1;
			arg2.aShortArray98 = this.aShortArray98;
			arg2.aShortArray94 = this.aShortArray94;
		}
		if (Static544.method7820(arg4, this.anInt6348)) {
			if (arg3) {
				arg2.aByte81 = (byte) (arg2.aByte81 | 0x4);
			}
			arg2.aClass381_11 = arg0.aClass381_11;
			arg2.aClass381_11.aByte166 = this.aClass381_11.aByte166;
			arg2.aClass381_11.anInterface9_7 = this.aClass381_11.anInterface9_7;
		} else if (Static618.method8719(arg4, this.anInt6348)) {
			arg2.aClass381_11 = this.aClass381_11;
		} else {
			arg2.aClass381_11 = null;
		}
		if (Static414.method5908(arg4, this.anInt6348)) {
			if (arg0.aFloatArray44 == null || this.anInt6364 > arg0.aFloatArray44.length) {
				local209 = this.anInt6389;
				arg2.aFloatArray44 = arg0.aFloatArray44 = new float[local209];
				arg2.aFloatArray45 = arg0.aFloatArray45 = new float[local209];
			} else {
				arg2.aFloatArray44 = arg0.aFloatArray44;
				arg2.aFloatArray45 = arg0.aFloatArray45;
			}
			for (local209 = 0; local209 < this.anInt6389; local209++) {
				arg2.aFloatArray44[local209] = this.aFloatArray44[local209];
				arg2.aFloatArray45[local209] = this.aFloatArray45[local209];
			}
		} else {
			arg2.aFloatArray45 = this.aFloatArray45;
			arg2.aFloatArray44 = this.aFloatArray44;
		}
		if (Static451.method6585(arg4, this.anInt6348)) {
			arg2.aClass381_10 = arg0.aClass381_10;
			if (arg3) {
				arg2.aByte81 = (byte) (arg2.aByte81 | 0x8);
			}
			arg2.aClass381_10.anInterface9_7 = this.aClass381_10.anInterface9_7;
			arg2.aClass381_10.aByte166 = this.aClass381_10.aByte166;
		} else if (Static169.method3086(arg4, this.anInt6348)) {
			arg2.aClass381_10 = this.aClass381_10;
		} else {
			arg2.aClass381_10 = null;
		}
		if (Static375.method5426(arg4, this.anInt6348)) {
			if (arg0.aShortArray102 == null || arg0.aShortArray102.length < this.anInt6364) {
				local209 = this.anInt6364;
				arg2.aShortArray97 = arg0.aShortArray97 = new short[local209];
				arg2.aShortArray102 = arg0.aShortArray102 = new short[local209];
				arg2.aShortArray95 = arg0.aShortArray95 = new short[local209];
			} else {
				arg2.aShortArray102 = arg0.aShortArray102;
				arg2.aShortArray95 = arg0.aShortArray95;
				arg2.aShortArray97 = arg0.aShortArray97;
			}
			for (local209 = 0; local209 < this.anInt6364; local209++) {
				arg2.aShortArray102[local209] = this.aShortArray102[local209];
				arg2.aShortArray95[local209] = this.aShortArray95[local209];
				arg2.aShortArray97[local209] = this.aShortArray97[local209];
			}
		} else {
			arg2.aShortArray102 = this.aShortArray102;
			arg2.aShortArray95 = this.aShortArray95;
			arg2.aShortArray97 = this.aShortArray97;
		}
		if (Static651.method9019(arg4, this.anInt6348)) {
			if (arg3) {
				arg2.aByte81 = (byte) (arg2.aByte81 | 0x10);
			}
			arg2.aClass139_1 = arg0.aClass139_1;
			arg2.aClass139_1.anInterface17_2 = this.aClass139_1.anInterface17_2;
		} else if (Static41.method1053(arg4, this.anInt6348)) {
			arg2.aClass139_1 = this.aClass139_1;
		} else {
			arg2.aClass139_1 = null;
		}
		if (Static204.method3648(this.anInt6348, arg4)) {
			if (arg0.aShortArray99 == null || this.anInt6364 > arg0.aShortArray99.length) {
				local209 = this.anInt6364;
				arg2.aShortArray99 = arg0.aShortArray99 = new short[local209];
			} else {
				arg2.aShortArray99 = arg0.aShortArray99;
			}
			for (local209 = 0; local209 < this.anInt6364; local209++) {
				arg2.aShortArray99[local209] = this.aShortArray99[local209];
			}
		} else {
			arg2.aShortArray99 = this.aShortArray99;
		}
		if (!Static93.method9376(this.anInt6348, arg4)) {
			arg2.aClass364Array1 = this.aClass364Array1;
		} else if (arg0.aClass364Array1 == null || arg0.aClass364Array1.length < this.anInt6355) {
			local209 = this.anInt6355;
			arg2.aClass364Array1 = arg0.aClass364Array1 = new Class364[local209];
			for (local570 = 0; local570 < this.anInt6355; local570++) {
				arg2.aClass364Array1[local570] = this.aClass364Array1[local570].method8790();
			}
		} else {
			arg2.aClass364Array1 = arg0.aClass364Array1;
			for (local209 = 0; local209 < this.anInt6355; local209++) {
				arg2.aClass364Array1[local209].method8789(this.aClass364Array1[local209]);
			}
		}
		arg2.anIntArrayArray40 = this.anIntArrayArray40;
		arg2.aClass49Array5 = this.aClass49Array5;
		arg2.aShortArray101 = this.aShortArray101;
		arg2.anIntArray562 = this.anIntArray562;
		if (this.aBoolean449) {
			arg2.aShort66 = this.aShort66;
			arg2.aBoolean449 = true;
			arg2.aShort61 = this.aShort61;
			arg2.aShort69 = this.aShort69;
			arg2.aShort62 = this.aShort62;
			arg2.aShort70 = this.aShort70;
			arg2.aShort67 = this.aShort67;
			arg2.aShort65 = this.aShort65;
			arg2.aShort63 = this.aShort63;
		} else {
			arg2.aBoolean449 = false;
		}
		arg2.aClass197Array5 = this.aClass197Array5;
		arg2.aShortArray93 = this.aShortArray93;
		arg2.anIntArrayArray41 = this.anIntArrayArray41;
		arg2.aClass186Array1 = this.aClass186Array1;
		arg2.anIntArrayArray42 = this.anIntArrayArray42;
		arg2.anIntArray563 = this.anIntArray563;
		arg2.aShortArray96 = this.aShortArray96;
		return arg2;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BZ)V")
	private void method5684(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass381_13 != null && this.aClass381_13.anInterface9_7 == null;
		@Pc(27) boolean local27 = this.aClass381_11 != null && this.aClass381_11.anInterface9_7 == null;
		@Pc(38) boolean local38 = this.aClass381_12 != null && this.aClass381_12.anInterface9_7 == null;
		@Pc(49) boolean local49 = this.aClass381_10 != null && this.aClass381_10.anInterface9_7 == null;
		if (arg0) {
			local16 &= (this.aByte81 & 0x2) != 0;
			local38 &= (this.aByte81 & 0x1) != 0;
			local27 &= (this.aByte81 & 0x4) != 0;
			local49 &= (this.aByte81 & 0x8) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (local38) {
			local100 = 12;
		}
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local108 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1.aByteArray106.length >= local100 * this.anInt6389) {
			this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1.anInt9765 = 0;
		} else {
			this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1 = new Class3_Sub25_Sub2((this.anInt6389 + 100) * local100);
		}
		@Pc(190) Class3_Sub25_Sub2 local190 = this.aClass13_Sub2_27.aClass3_Sub25_Sub2_1;
		@Pc(198) int local198;
		@Pc(207) int local207;
		@Pc(235) int local235;
		@Pc(244) int local244;
		if (local38) {
			@Pc(214) int local214;
			@Pc(221) int local221;
			@Pc(226) int local226;
			@Pc(233) int local233;
			if (this.aClass13_Sub2_27.aBoolean166) {
				for (local198 = 0; local198 < this.anInt6323; local198++) {
					local207 = Stream.floatToRawIntBits((float) this.anIntArray561[local198]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray564[local198]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray560[local198]);
					local226 = this.anIntArray562[local198];
					local233 = this.anIntArray562[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray101[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt9765 = local244 * local100;
						local190.method8588(local207);
						local190.method8588(local214);
						local190.method8588(local221);
					}
				}
			} else {
				for (local198 = 0; local198 < this.anInt6323; local198++) {
					local207 = Stream.floatToRawIntBits((float) this.anIntArray561[local198]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray564[local198]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray560[local198]);
					local226 = this.anIntArray562[local198];
					local233 = this.anIntArray562[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray101[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt9765 = local100 * local244;
						local190.method8640(local207);
						local190.method8640(local214);
						local190.method8640(local221);
					}
				}
			}
		}
		@Pc(564) float local564;
		@Pc(459) short[] local459;
		@Pc(462) short[] local462;
		@Pc(456) short[] local456;
		@Pc(453) byte[] local453;
		@Pc(613) float local613;
		if (local16) {
			if (this.aClass381_11 == null) {
				if (this.aClass324_1 == null) {
					local453 = this.aByteArray71;
					local456 = this.aShortArray100;
					local459 = this.aShortArray98;
					local462 = this.aShortArray94;
				} else {
					local453 = this.aClass324_1.aByteArray95;
					local456 = this.aClass324_1.aShortArray144;
					local459 = this.aClass324_1.aShortArray146;
					local462 = this.aClass324_1.aShortArray145;
				}
				@Pc(486) float local486 = this.aClass13_Sub2_27.aFloatArray17[0];
				@Pc(492) float local492 = this.aClass13_Sub2_27.aFloatArray17[1];
				@Pc(498) float local498 = this.aClass13_Sub2_27.aFloatArray17[2];
				@Pc(502) float local502 = this.aClass13_Sub2_27.aFloat61;
				@Pc(512) float local512 = this.aClass13_Sub2_27.aFloat60 * 768.0F / (float) this.aShort64;
				@Pc(522) float local522 = this.aClass13_Sub2_27.aFloat49 * 768.0F / (float) this.aShort64;
				for (@Pc(524) int local524 = 0; local524 < this.anInt6364; local524++) {
					@Pc(544) int local544 = this.method5687(this.aByteArray70[local524], this.aShort68, this.aShortArray99[local524], this.aShortArray92[local524]);
					@Pc(553) float local553 = (float) (local544 >>> 24) * this.aClass13_Sub2_27.aFloat54;
					local564 = (float) (local544 >> 16 & 0xFF) * this.aClass13_Sub2_27.aFloat57;
					@Pc(575) float local575 = (float) (local544 >> 8 & 0xFF) * this.aClass13_Sub2_27.aFloat46;
					@Pc(580) short local580 = this.aShortArray102[local524];
					@Pc(585) short local585 = (short) local453[local580];
					if (local585 == 0) {
						local613 = (local486 * (float) local459[local580] + (float) local462[local580] * local492 + local498 * (float) local456[local580]) * 0.0026041667F;
					} else {
						local613 = ((float) local456[local580] * local498 + (float) local462[local580] * local492 + (float) local459[local580] * local486) / (float) (local585 * 256);
					}
					@Pc(650) float local650 = local613 * (local613 < 0.0F ? local522 : local512) + local502;
					@Pc(655) int local655 = (int) (local650 * local553);
					@Pc(660) int local660 = (int) (local564 * local650);
					if (local655 < 0) {
						local655 = 0;
					} else if (local655 > 255) {
						local655 = 255;
					}
					@Pc(676) int local676 = (int) (local650 * local575);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local190.anInt9765 = local104 + local100 * local580;
					if (local676 < 0) {
						local676 = 0;
					} else if (local676 > 255) {
						local676 = 255;
					}
					local190.method8614(local655);
					local190.method8614(local660);
					local190.method8614(local676);
					local190.method8614(255 - (this.aByteArray70[local524] & 0xFF));
					local580 = this.aShortArray95[local524];
					local585 = (short) local453[local580];
					if (local585 == 0) {
						local613 = ((float) local456[local580] * local498 + (float) local459[local580] * local486 + (float) local462[local580] * local492) * 0.0026041667F;
					} else {
						local613 = ((float) local462[local580] * local492 + (float) local459[local580] * local486 + (float) local456[local580] * local498) / (float) (local585 * 256);
					}
					local650 = (local613 < 0.0F ? local522 : local512) * local613 + local502;
					local655 = (int) (local650 * local553);
					if (local655 < 0) {
						local655 = 0;
					} else if (local655 > 255) {
						local655 = 255;
					}
					local660 = (int) (local564 * local650);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local676 = (int) (local650 * local575);
					local190.anInt9765 = local100 * local580 + local104;
					if (local676 < 0) {
						local676 = 0;
					} else if (local676 > 255) {
						local676 = 255;
					}
					local190.method8614(local655);
					local190.method8614(local660);
					local190.method8614(local676);
					local190.method8614(255 - (this.aByteArray70[local524] & 0xFF));
					local580 = this.aShortArray97[local524];
					local585 = (short) local453[local580];
					if (local585 == 0) {
						local613 = (local486 * (float) local459[local580] + local492 * (float) local462[local580] + (float) local456[local580] * local498) * 0.0026041667F;
					} else {
						local613 = (local486 * (float) local459[local580] + (float) local462[local580] * local492 + local498 * (float) local456[local580]) / (float) (local585 * 256);
					}
					local650 = (local613 < 0.0F ? local522 : local512) * local613 + local502;
					local655 = (int) (local553 * local650);
					local660 = (int) (local564 * local650);
					if (local655 < 0) {
						local655 = 0;
					} else if (local655 > 255) {
						local655 = 255;
					}
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local676 = (int) (local650 * local575);
					local190.anInt9765 = local104 + local100 * local580;
					if (local676 < 0) {
						local676 = 0;
					} else if (local676 > 255) {
						local676 = 255;
					}
					local190.method8614(local655);
					local190.method8614(local660);
					local190.method8614(local676);
					local190.method8614(255 - (this.aByteArray70[local524] & 0xFF));
				}
			} else {
				for (local198 = 0; local198 < this.anInt6364; local198++) {
					local207 = this.method5687(this.aByteArray70[local198], this.aShort68, this.aShortArray99[local198], this.aShortArray92[local198]);
					local190.anInt9765 = local104 + local100 * this.aShortArray102[local198];
					local190.method8588(local207);
					local190.anInt9765 = local104 + this.aShortArray95[local198] * local100;
					local190.method8588(local207);
					local190.anInt9765 = this.aShortArray97[local198] * local100 + local104;
					local190.method8588(local207);
				}
			}
		}
		if (local27) {
			if (this.aClass324_1 == null) {
				local453 = this.aByteArray71;
				local462 = this.aShortArray94;
				local456 = this.aShortArray100;
				local459 = this.aShortArray98;
			} else {
				local462 = this.aClass324_1.aShortArray145;
				local459 = this.aClass324_1.aShortArray146;
				local453 = this.aClass324_1.aByteArray95;
				local456 = this.aClass324_1.aShortArray144;
			}
			@Pc(1102) float local1102 = 3.0F / (float) this.aShort64;
			local190.anInt9765 = local106;
			local613 = 3.0F / (float) (this.aShort64 + this.aShort64 / 2);
			if (this.aClass13_Sub2_27.aBoolean166) {
				for (local235 = 0; local235 < this.anInt6389; local235++) {
					local244 = local453[local235] & 0xFF;
					if (local244 == 0) {
						local190.method8652((float) local459[local235] * local613);
						local190.method8652(local613 * (float) local462[local235]);
						local190.method8652(local613 * (float) local456[local235]);
					} else {
						local564 = local1102 / (float) local244;
						local190.method8652(local564 * (float) local459[local235]);
						local190.method8652((float) local462[local235] * local564);
						local190.method8652(local564 * (float) local456[local235]);
					}
					local190.anInt9765 += local100 - 12;
				}
			} else {
				for (local235 = 0; local235 < this.anInt6389; local235++) {
					local244 = local453[local235] & 0xFF;
					if (local244 == 0) {
						local190.method8653((float) local459[local235] * local613);
						local190.method8653((float) local462[local235] * local613);
						local190.method8653((float) local456[local235] * local613);
					} else {
						local564 = local1102 / (float) local244;
						local190.method8653((float) local459[local235] * local564);
						local190.method8653(local564 * (float) local462[local235]);
						local190.method8653((float) local456[local235] * local564);
					}
					local190.anInt9765 += local100 - 12;
				}
			}
		}
		if (local49) {
			local190.anInt9765 = local108;
			if (this.aClass13_Sub2_27.aBoolean166) {
				for (local198 = 0; local198 < this.anInt6389; local198++) {
					local190.method8652(this.aFloatArray44[local198]);
					local190.method8652(this.aFloatArray45[local198]);
					local190.anInt9765 += local100 - 8;
				}
			} else {
				for (local198 = 0; local198 < this.anInt6389; local198++) {
					local190.method8653(this.aFloatArray44[local198]);
					local190.method8653(this.aFloatArray45[local198]);
					local190.anInt9765 += local100 - 8;
				}
			}
		}
		local190.anInt9765 = local100 * this.anInt6389;
		@Pc(1397) Interface9 local1397;
		if (arg0) {
			if (this.anInterface9_5 == null) {
				this.anInterface9_5 = this.aClass13_Sub2_27.method1967(local190.anInt9765, local190.aByteArray106, true, local100);
			} else {
				this.anInterface9_5.method8391(local190.aByteArray106, local100, local190.anInt9765);
			}
			this.aByte81 = 0;
			local1397 = this.anInterface9_5;
		} else {
			local1397 = this.aClass13_Sub2_27.method1967(local190.anInt9765, local190.aByteArray106, false, local100);
			this.aBoolean448 = true;
		}
		if (local38) {
			this.aClass381_12.aByte166 = 0;
			this.aClass381_12.anInterface9_7 = local1397;
		}
		if (local49) {
			this.aClass381_10.anInterface9_7 = local1397;
			this.aClass381_10.aByte166 = local108;
		}
		if (local16) {
			this.aClass381_13.aByte166 = local104;
			this.aClass381_13.anInterface9_7 = local1397;
		}
		if (local27) {
			this.aClass381_11.anInterface9_7 = local1397;
			this.aClass381_11.aByte166 = local106;
		}
	}

	@OriginalMember(owner = "client!nha", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!nha", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort61;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(IBIIIIIII)Z")
	private boolean method5686(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > arg5 && arg4 > arg5 && arg5 < arg7) {
			return false;
		} else if (arg5 > arg1 && arg5 > arg4 && arg5 > arg7) {
			return false;
		} else if (arg6 > arg0 && arg2 > arg0 && arg0 < arg3) {
			return false;
		} else {
			return arg6 >= arg0 || arg0 <= arg2 || arg0 <= arg3;
		}
	}

	@OriginalMember(owner = "client!nha", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6323; local15++) {
			local33 = this.anIntArray560[local15] * local9 + this.anIntArray561[local15] * local13 >> 14;
			this.anIntArray560[local15] = this.anIntArray560[local15] * local13 - local9 * this.anIntArray561[local15] >> 14;
			this.anIntArray561[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6389; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray98[local33] + this.aShortArray100[local33] * local9 >> 14;
			this.aShortArray100[local33] = (short) (local13 * this.aShortArray100[local33] - local9 * this.aShortArray98[local33] >> 14);
			this.aShortArray98[local33] = (short) local87;
		}
		if (this.aClass381_11 == null && this.aClass381_13 != null) {
			this.aClass381_13.anInterface9_7 = null;
		}
		if (this.aClass381_11 != null) {
			this.aClass381_11.anInterface9_7 = null;
		}
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
		this.aBoolean449 = false;
	}

	@OriginalMember(owner = "client!nha", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean449) {
			this.method5677();
		}
		return this.aShort62;
	}

	@OriginalMember(owner = "client!nha", name = "a", descriptor = "(BIISI)I")
	private int method5687(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static363.anIntArray518[Static461.method6716(arg1, arg3)];
		if (arg2 != -1) {
			@Pc(24) Class119 local24 = this.aClass13_Sub2_27.anInterface4_14.method4673(arg2 & 0xFFFF);
			@Pc(29) int local29 = local24.aByte55 & 0xFF;
			@Pc(40) int local40;
			@Pc(61) int local61;
			if (local29 != 0) {
				if (arg1 < 0) {
					local40 = 0;
				} else if (arg1 > 127) {
					local40 = 16777215;
				} else {
					local40 = arg1 * 131586;
				}
				if (local29 == 256) {
					local12 = local40;
				} else {
					local61 = 256 - local29;
					local12 = (local29 * (local40 & 0xFF00) + local61 * (local12 & 0xFF00) & 0xFF0000) + ((local12 & 0xFF00FF) * local61 + local29 * (local40 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local40 = local24.aByte53 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(115) int local115 = local40 * (local12 >> 16 & 0xFF);
				if (local115 > 65535) {
					local115 = 65535;
				}
				local61 = (local12 >> 8 & 0xFF) * local40;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(141) int local141 = local40 * (local12 & 0xFF);
				if (local141 > 65535) {
					local141 = 65535;
				}
				local12 = (local141 >> 8) + ((local115 & 0xEF00FF00) << 8) + (local61 & 0xFF00);
			}
		}
		return (local12 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!nha", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean449) {
			this.method5677();
		}
		@Pc(16) int local16 = arg4 + this.aShort66;
		@Pc(22) int local22 = arg4 + this.aShort63;
		@Pc(27) int local27 = this.aShort70 + arg6;
		@Pc(32) int local32 = this.aShort65 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9123 + local22 >> arg2.anInt9125 >= arg2.anInt9129 || local27 < 0 || arg2.anInt9128 <= arg2.anInt9123 + local32 >> arg2.anInt9125)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local22 + arg3.anInt9123 >> arg3.anInt9125 >= arg3.anInt9129 || local27 < 0 || arg3.anInt9123 + local32 >> arg3.anInt9125 >= arg3.anInt9128) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9125;
			local22 = local22 + arg2.anInt9123 - 1 >> arg2.anInt9125;
			local27 >>= arg2.anInt9125;
			local32 = local32 + arg2.anInt9123 - 1 >> arg2.anInt9125;
			if (arg2.method7973(local16, local27) == arg5 && arg5 == arg2.method7973(local22, local27) && arg5 == arg2.method7973(local16, local32) && arg2.method7973(local22, local32) == arg5) {
				return;
			}
		}
		@Pc(209) int local209;
		if (arg0 == 1) {
			for (local209 = 0; local209 < this.anInt6323; local209++) {
				this.anIntArray564[local209] = this.anIntArray564[local209] + arg2.method7980(arg6 + this.anIntArray560[local209], this.anIntArray561[local209] + arg4) - arg5;
			}
		} else {
			@Pc(261) int local261;
			@Pc(272) int local272;
			if (arg0 == 2) {
				@Pc(253) short local253 = this.aShort61;
				if (local253 == 0) {
					return;
				}
				for (local261 = 0; local261 < this.anInt6323; local261++) {
					local272 = (this.anIntArray564[local261] << 16) / local253;
					if (arg1 > local272) {
						this.anIntArray564[local261] -= -((arg2.method7980(this.anIntArray560[local261] + arg6, this.anIntArray561[local261] + arg4) - arg5) * (-local272 + arg1) / arg1);
					}
				}
			} else {
				@Pc(361) int local361;
				if (arg0 == 3) {
					local209 = (arg1 & 0xFF) * 4;
					local261 = (arg1 >> 8 & 0xFF) * 4;
					local272 = (arg1 >> 16 & 0xFF) << 6;
					local361 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local209 >> 1) < 0 || arg2.anInt9129 << arg2.anInt9125 <= arg4 + (local209 >> 1) + arg2.anInt9123 || arg6 - (local261 >> 1) < 0 || arg2.anInt9123 + arg6 + (local261 >> 1) >= arg2.anInt9128 << arg2.anInt9125) {
						return;
					}
					this.method5655(arg5, arg2, local272, local361, local209, local261, arg4, arg6);
				} else if (arg0 == 4) {
					local209 = this.aShort62 - this.aShort61;
					for (local261 = 0; local261 < this.anInt6323; local261++) {
						this.anIntArray564[local261] = local209 + this.anIntArray564[local261] + arg3.method7980(this.anIntArray560[local261] + arg6, arg4 + this.anIntArray561[local261]) - arg5;
					}
				} else if (arg0 == 5) {
					local209 = this.aShort62 - this.aShort61;
					for (local261 = 0; local261 < this.anInt6323; local261++) {
						local272 = this.anIntArray561[local261] + arg4;
						local361 = arg6 + this.anIntArray560[local261];
						@Pc(465) int local465 = arg2.method7980(local361, local272);
						@Pc(471) int local471 = arg3.method7980(local361, local272);
						@Pc(479) int local479 = local465 - arg1 - local471;
						this.anIntArray564[local261] = local465 + ((this.anIntArray564[local261] << 8) / local209 * local479 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean449 = false;
		if (this.aClass381_12 != null) {
			this.aClass381_12.anInterface9_7 = null;
		}
	}
}
