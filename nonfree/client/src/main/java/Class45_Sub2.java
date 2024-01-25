import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class45_Sub2 extends Class45 {

	@OriginalMember(owner = "client!fca", name = "hb", descriptor = "I")
	private int anInt2797;

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "I")
	private int anInt2804;

	@OriginalMember(owner = "client!fca", name = "ib", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!fca", name = "M", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!fca", name = "Wb", descriptor = "Lclient!hn;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!fca", name = "q", descriptor = "I")
	private int anInt2812;

	@OriginalMember(owner = "client!fca", name = "B", descriptor = "Lclient!tka;")
	private Class357 aClass357_1;

	@OriginalMember(owner = "client!fca", name = "nb", descriptor = "I")
	private int anInt2820;

	@OriginalMember(owner = "client!fca", name = "n", descriptor = "Lclient!bia;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!fca", name = "yc", descriptor = "Z")
	private boolean aBoolean280;

	@OriginalMember(owner = "client!fca", name = "wb", descriptor = "I")
	private int anInt2824;

	@OriginalMember(owner = "client!fca", name = "nc", descriptor = "I")
	private int anInt2833;

	@OriginalMember(owner = "client!fca", name = "mb", descriptor = "I")
	private int anInt2841;

	@OriginalMember(owner = "client!fca", name = "kc", descriptor = "Lclient!lb;")
	private final Class145_Sub1 aClass145_Sub1_9;

	@OriginalMember(owner = "client!fca", name = "Hb", descriptor = "I")
	private int anInt2847;

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "Z")
	private boolean aBoolean281;

	@OriginalMember(owner = "client!fca", name = "jb", descriptor = "Lclient!hn;")
	private Class164 aClass164_2;

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "I")
	private int anInt2862;

	@OriginalMember(owner = "client!fca", name = "lb", descriptor = "Lclient!hn;")
	private Class164 lb;

	@OriginalMember(owner = "client!fca", name = "t", descriptor = "I")
	private int anInt2871;

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "Lclient!hn;")
	private Class164 aClass164_3;

	@OriginalMember(owner = "client!fca", name = "hc", descriptor = "[I")
	private int[] anIntArray210;

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "I")
	private int anInt2864;

	@OriginalMember(owner = "client!fca", name = "jc", descriptor = "I")
	private int anInt2863;

	@OriginalMember(owner = "client!fca", name = "Eb", descriptor = "Z")
	private boolean aBoolean279;

	@OriginalMember(owner = "client!fca", name = "P", descriptor = "Z")
	private boolean aBoolean282;

	@OriginalMember(owner = "client!fca", name = "Ub", descriptor = "[I")
	private int[] anIntArray212;

	@OriginalMember(owner = "client!fca", name = "K", descriptor = "[I")
	private int[] anIntArray213;

	@OriginalMember(owner = "client!fca", name = "cb", descriptor = "I")
	private int anInt2815;

	@OriginalMember(owner = "client!fca", name = "Db", descriptor = "[I")
	private int[] anIntArray214;

	@OriginalMember(owner = "client!fca", name = "Y", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!fca", name = "G", descriptor = "I")
	private int anInt2855;

	@OriginalMember(owner = "client!fca", name = "Jb", descriptor = "[Lclient!uc;")
	private Class363[] aClass363Array2;

	@OriginalMember(owner = "client!fca", name = "Vb", descriptor = "[Lclient!uda;")
	private Class364[] aClass364Array2;

	@OriginalMember(owner = "client!fca", name = "xc", descriptor = "I")
	private int anInt2860;

	@OriginalMember(owner = "client!fca", name = "ob", descriptor = "[Lclient!bj;")
	private Class40[] aClass40Array1;

	@OriginalMember(owner = "client!fca", name = "uc", descriptor = "[Lclient!rr;")
	private Class329[] aClass329Array1;

	@OriginalMember(owner = "client!fca", name = "kb", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!fca", name = "E", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!fca", name = "A", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!fca", name = "Oc", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!fca", name = "S", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!fca", name = "bc", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!fca", name = "Fb", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!fca", name = "X", descriptor = "S")
	private short aShort49;

	@OriginalMember(owner = "client!fca", name = "Rb", descriptor = "S")
	private short aShort50;

	@OriginalMember(owner = "client!fca", name = "x", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!fca", name = "yb", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!fca", name = "V", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!fca", name = "z", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!fca", name = "cc", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!fca", name = "Tb", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!fca", name = "gc", descriptor = "[F")
	private float[] aFloatArray19;

	@OriginalMember(owner = "client!fca", name = "W", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!fca", name = "Ic", descriptor = "[I")
	private int[] anIntArray208;

	@OriginalMember(owner = "client!fca", name = "pc", descriptor = "[I")
	private int[] anIntArray211;

	@OriginalMember(owner = "client!fca", name = "tb", descriptor = "[I")
	private int[] anIntArray209;

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!fca", name = "ab", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!fca", name = "U", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!lb;Lclient!ln;IIII)V")
	public Class45_Sub2(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_12;
		this.anIntArray210 = new int[arg1.anInt5932 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt5934];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5934; local24++) {
			if (arg1.aByteArray79 == null || arg1.aByteArray79[local24] != 2) {
				if (arg1.aShortArray93 != null && arg1.aShortArray93[local24] != -1) {
					@Pc(63) Class8 local63 = local11.method2857(arg1.aShortArray93[local24] & 0xFFFF);
					if (((this.anInt2797 & 0x40) == 0 || !local63.aBoolean32) && local63.aBoolean34) {
						continue;
					}
				}
				local22[this.anInt2864++] = local24;
				this.anIntArray210[arg1.aShortArray102[local24]]++;
				this.anIntArray210[arg1.aShortArray95[local24]]++;
				this.anIntArray210[arg1.aShortArray98[local24]]++;
			}
		}
		this.anInt2863 = this.anInt2864;
		@Pc(143) long[] local143 = new long[this.anInt2864];
		@Pc(158) boolean local158 = (this.anInt2862 & 0x100) != 0;
		@Pc(172) int local172;
		@Pc(185) int local185;
		@Pc(370) int local370;
		for (@Pc(160) int local160 = 0; local160 < this.anInt2864; local160++) {
			@Pc(168) int local168 = local22[local160];
			@Pc(170) Class8 local170 = null;
			local172 = 0;
			@Pc(174) byte local174 = 0;
			@Pc(176) byte local176 = 0;
			@Pc(178) byte local178 = 0;
			if (arg1.aClass390Array1 != null) {
				@Pc(183) boolean local183 = false;
				for (local185 = 0; local185 < arg1.aClass390Array1.length; local185++) {
					@Pc(192) Class390 local192 = arg1.aClass390Array1[local185];
					if (local192.anInt10646 == local168) {
						@Pc(205) Class28 local205 = Static200.method2824(local192.anInt10650);
						if (local205.aBoolean70) {
							local183 = true;
						}
						if (local205.anInt489 != -1) {
							@Pc(221) Class8 local221 = local11.method2857(local205.anInt489);
							if (local221.anInt186 == 2) {
								this.aBoolean279 = true;
							}
						}
					}
				}
				if (local183) {
					local143[local160] = Long.MAX_VALUE;
					this.anInt2863--;
					continue;
				}
			}
			@Pc(262) short local262 = -1;
			if (arg1.aShortArray93 != null) {
				local262 = arg1.aShortArray93[local168];
				if (local262 != -1) {
					local170 = local11.method2857(local262 & 0xFFFF);
					if ((this.anInt2797 & 0x40) != 0 && local170.aBoolean32) {
						local170 = null;
						local262 = -1;
					} else {
						local178 = local170.aByte11;
						local176 = local170.aByte15;
					}
				}
			}
			@Pc(328) boolean local328 = arg1.aByteArray80 != null && arg1.aByteArray80[local168] != 0 || local170 != null && local170.anInt186 != 0;
			if ((local158 || local328) && arg1.aByteArray78 != null) {
				local172 += arg1.aByteArray78[local168] << 17;
			}
			if (local328) {
				local172 += 65536;
			}
			local172 += (local176 & 0xFF) << 8;
			local370 = local174 + ((local262 & 0xFFFF) << 16);
			local172 += local178 & 0xFF;
			@Pc(382) int local382 = local370 + (local160 & 0xFFFF);
			local143[local160] = ((long) local172 << 32) + ((long) local382);
			this.aBoolean279 |= local328;
			this.aBoolean282 |= local170 != null && (local170.aByte16 != 0 || local170.aByte14 != 0);
		}
		Static595.method6984(-17667, local22, local143);
		this.anIntArray212 = arg1.anIntArray394;
		this.anIntArray213 = arg1.anIntArray396;
		this.anInt2815 = arg1.anInt5932;
		this.anIntArray214 = arg1.anIntArray392;
		this.aShortArray61 = arg1.aShortArray99;
		this.anInt2855 = arg1.anInt5931;
		@Pc(465) Class162[] local465 = new Class162[this.anInt2815];
		this.aClass363Array2 = arg1.aClass363Array4;
		this.aClass364Array2 = arg1.aClass364Array4;
		@Pc(493) int local493;
		@Pc(509) int local509;
		@Pc(565) int local565;
		if (arg1.aClass390Array1 != null) {
			this.anInt2860 = arg1.aClass390Array1.length;
			this.aClass40Array1 = new Class40[this.anInt2860];
			this.aClass329Array1 = new Class329[this.anInt2860];
			for (local493 = 0; local493 < this.anInt2860; local493++) {
				@Pc(502) Class390 local502 = arg1.aClass390Array1[local493];
				@Pc(507) Class28 local507 = Static200.method2824(local502.anInt10650);
				local509 = -1;
				for (@Pc(511) int local511 = 0; local511 < this.anInt2864; local511++) {
					if (local502.anInt10646 == local22[local511]) {
						local509 = local511;
						break;
					}
				}
				if (local509 == -1) {
					throw new RuntimeException();
				}
				local565 = Static555.anIntArray633[arg1.aShortArray100[local502.anInt10646] & 0xFFFF] & 0xFFFFFF;
				@Pc(584) int local584 = local565 | 255 - (arg1.aByteArray80 == null ? 0 : arg1.aByteArray80[local502.anInt10646]) << 24;
				this.aClass40Array1[local493] = new Class40(local509, arg1.aShortArray102[local502.anInt10646], arg1.aShortArray95[local502.anInt10646], arg1.aShortArray98[local502.anInt10646], local507.anInt485, local507.anInt488, local507.anInt489, local507.anInt487, local507.anInt483, local507.aBoolean70, local507.aBoolean71, local502.anInt10643);
				this.aClass329Array1[local493] = new Class329(local584);
			}
		}
		local493 = this.anInt2864 * 3;
		if (arg1.aShortArray97 != null) {
			this.aShortArray57 = new short[this.anInt2864];
		}
		this.aShortArray59 = new short[this.anInt2864];
		this.aFloatArray20 = new float[local493];
		this.aShortArray67 = new short[local493];
		this.aShortArray60 = new short[local493];
		this.aShortArray66 = new short[local493];
		this.aByteArray33 = new byte[this.anInt2864];
		this.aShort49 = (short) arg3;
		Static411.aLongArray13 = new long[local493];
		this.aShort50 = (short) arg4;
		this.aShortArray64 = new short[local493];
		this.aByteArray34 = new byte[local493];
		this.aShortArray68 = new short[this.anInt2864];
		this.aShortArray63 = new short[local493];
		this.aShortArray56 = new short[this.anInt2864];
		this.aShortArray65 = new short[local493];
		this.aShortArray58 = new short[this.anInt2864];
		this.aFloatArray19 = new float[local493];
		this.aShortArray62 = new short[this.anInt2864];
		local172 = 0;
		for (local370 = 0; local370 < arg1.anInt5932; local370++) {
			local509 = this.anIntArray210[local370];
			this.anIntArray210[local370] = local172;
			local465[local370] = new Class162();
			local172 += local509;
		}
		this.anIntArray210[arg1.anInt5932] = local172;
		@Pc(786) Class369 local786 = Static348.method4823(this.anInt2864, local22, arg1);
		@Pc(790) Class249[] local790 = new Class249[arg1.anInt5934];
		@Pc(833) int local833;
		@Pc(844) int local844;
		@Pc(855) int local855;
		@Pc(811) short local811;
		@Pc(822) int local822;
		for (local565 = 0; local565 < arg1.anInt5934; local565++) {
			@Pc(801) short local801 = arg1.aShortArray102[local565];
			@Pc(806) short local806 = arg1.aShortArray95[local565];
			local811 = arg1.aShortArray98[local565];
			local822 = this.anIntArray212[local806] - this.anIntArray212[local801];
			local833 = this.anIntArray214[local806] - this.anIntArray214[local801];
			local844 = this.anIntArray213[local806] - this.anIntArray213[local801];
			local855 = this.anIntArray212[local811] - this.anIntArray212[local801];
			@Pc(866) int local866 = this.anIntArray214[local811] - this.anIntArray214[local801];
			@Pc(877) int local877 = this.anIntArray213[local811] - this.anIntArray213[local801];
			@Pc(886) int local886 = local877 * local833 - local844 * local866;
			@Pc(895) int local895 = local855 * local844 - local877 * local822;
			@Pc(904) int local904 = local866 * local822 - local855 * local833;
			while (local886 > 8192 || local895 > 8192 || local904 > 8192 || local886 < -8192 || local895 < -8192 || local904 < -8192) {
				local895 >>= 0x1;
				local904 >>= 0x1;
				local886 >>= 0x1;
			}
			@Pc(961) int local961 = (int) Math.sqrt((double) (local895 * local895 + local886 * local886 + local904 * local904));
			if (local961 <= 0) {
				local961 = 1;
			}
			local904 = local904 * 256 / local961;
			local895 = local895 * 256 / local961;
			local886 = local886 * 256 / local961;
			@Pc(997) byte local997 = arg1.aByteArray79 == null ? 0 : arg1.aByteArray79[local565];
			if (local997 == 0) {
				@Pc(1032) Class162 local1032 = local465[local801];
				local1032.anInt3837++;
				local1032.anInt3841 += local886;
				local1032.anInt3842 += local904;
				local1032.anInt3835 += local895;
				@Pc(1060) Class162 local1060 = local465[local806];
				local1060.anInt3841 += local886;
				local1060.anInt3842 += local904;
				local1060.anInt3835 += local895;
				local1060.anInt3837++;
				@Pc(1088) Class162 local1088 = local465[local811];
				local1088.anInt3835 += local895;
				local1088.anInt3837++;
				local1088.anInt3841 += local886;
				local1088.anInt3842 += local904;
			} else if (local997 == 1) {
				@Pc(1017) Class249 local1017 = local790[local565] = new Class249();
				local1017.anInt6704 = local895;
				local1017.anInt6706 = local904;
				local1017.anInt6703 = local886;
			}
		}
		@Pc(1133) int local1133;
		@Pc(1177) short local1177;
		for (local185 = 0; local185 < this.anInt2864; local185++) {
			local1133 = local22[local185];
			@Pc(1140) int local1140 = arg1.aShortArray100[local1133] & 0xFFFF;
			if (arg1.aByteArray77 == null) {
				local822 = -1;
			} else {
				local822 = arg1.aByteArray77[local1133];
			}
			if (arg1.aByteArray80 == null) {
				local833 = 0;
			} else {
				local833 = arg1.aByteArray80[local1133] & 0xFF;
			}
			local1177 = arg1.aShortArray93 == null ? -1 : arg1.aShortArray93[local1133];
			if (local1177 != -1 && (this.anInt2797 & 0x40) != 0) {
				@Pc(1194) Class8 local1194 = local11.method2857(local1177 & 0xFFFF);
				if (local1194.aBoolean32) {
					local1177 = -1;
				}
			}
			@Pc(1201) float local1201 = 0.0F;
			@Pc(1203) float local1203 = 0.0F;
			@Pc(1205) float local1205 = 0.0F;
			@Pc(1207) float local1207 = 0.0F;
			@Pc(1209) float local1209 = 0.0F;
			@Pc(1211) float local1211 = 0.0F;
			@Pc(1213) byte local1213 = 0;
			@Pc(1215) byte local1215 = 0;
			@Pc(1217) int local1217 = 0;
			@Pc(1252) byte local1252;
			@Pc(1272) short local1272;
			@Pc(1277) short local1277;
			@Pc(1282) short local1282;
			if (local1177 != -1) {
				if (local822 == -1) {
					local1211 = 0.0F;
					local1215 = 2;
					local1205 = 1.0F;
					local1201 = 0.0F;
					local1209 = 0.0F;
					local1207 = 1.0F;
					local1203 = 1.0F;
					local1213 = 1;
				} else {
					local822 &= 0xFF;
					local1252 = arg1.aByteArray82[local822];
					@Pc(1262) short local1262;
					@Pc(1267) short local1267;
					@Pc(1305) float local1305;
					@Pc(1314) float local1314;
					@Pc(1322) float local1322;
					@Pc(1409) float local1409;
					@Pc(1417) float local1417;
					@Pc(1426) float local1426;
					@Pc(1435) float local1435;
					@Pc(1443) float local1443;
					@Pc(1452) float local1452;
					if (local1252 == 0) {
						local1262 = arg1.aShortArray102[local1133];
						local1267 = arg1.aShortArray95[local1133];
						local1272 = arg1.aShortArray98[local1133];
						local1277 = arg1.aShortArray94[local822];
						local1282 = arg1.aShortArray96[local822];
						@Pc(1287) short local1287 = arg1.aShortArray101[local822];
						@Pc(1293) float local1293 = (float) arg1.anIntArray394[local1277];
						@Pc(1299) float local1299 = (float) arg1.anIntArray392[local1277];
						local1305 = (float) arg1.anIntArray396[local1277];
						local1314 = (float) arg1.anIntArray394[local1282] - local1293;
						local1322 = (float) arg1.anIntArray392[local1282] - local1299;
						@Pc(1331) float local1331 = (float) arg1.anIntArray396[local1282] - local1305;
						@Pc(1340) float local1340 = (float) arg1.anIntArray394[local1287] - local1293;
						@Pc(1348) float local1348 = (float) arg1.anIntArray392[local1287] - local1299;
						@Pc(1357) float local1357 = (float) arg1.anIntArray396[local1287] - local1305;
						@Pc(1365) float local1365 = (float) arg1.anIntArray394[local1262] - local1293;
						@Pc(1374) float local1374 = (float) arg1.anIntArray392[local1262] - local1299;
						@Pc(1382) float local1382 = (float) arg1.anIntArray396[local1262] - local1305;
						@Pc(1391) float local1391 = (float) arg1.anIntArray394[local1267] - local1293;
						@Pc(1400) float local1400 = (float) arg1.anIntArray392[local1267] - local1299;
						local1409 = (float) arg1.anIntArray396[local1267] - local1305;
						local1417 = (float) arg1.anIntArray394[local1272] - local1293;
						local1426 = (float) arg1.anIntArray392[local1272] - local1299;
						local1435 = (float) arg1.anIntArray396[local1272] - local1305;
						local1443 = local1357 * local1322 - local1348 * local1331;
						local1452 = local1340 * local1331 - local1314 * local1357;
						@Pc(1461) float local1461 = local1348 * local1314 - local1340 * local1322;
						@Pc(1469) float local1469 = local1348 * local1461 - local1452 * local1357;
						@Pc(1478) float local1478 = local1357 * local1443 - local1340 * local1461;
						@Pc(1486) float local1486 = local1452 * local1340 - local1348 * local1443;
						@Pc(1500) float local1500 = 1.0F / (local1486 * local1331 + local1314 * local1469 + local1322 * local1478);
						local1201 = local1500 * (local1469 * local1365 + local1478 * local1374 + local1382 * local1486);
						local1209 = local1500 * (local1486 * local1435 + local1469 * local1417 + local1426 * local1478);
						local1205 = (local1409 * local1486 + local1391 * local1469 + local1478 * local1400) * local1500;
						@Pc(1550) float local1550 = local1461 * local1322 - local1452 * local1331;
						@Pc(1559) float local1559 = local1314 * local1452 - local1443 * local1322;
						@Pc(1567) float local1567 = local1331 * local1443 - local1461 * local1314;
						@Pc(1581) float local1581 = 1.0F / (local1348 * local1567 + local1340 * local1550 + local1357 * local1559);
						local1207 = (local1567 * local1400 + local1391 * local1550 + local1409 * local1559) * local1581;
						local1203 = (local1567 * local1374 + local1550 * local1365 + local1382 * local1559) * local1581;
						local1211 = local1581 * (local1417 * local1550 + local1426 * local1567 + local1559 * local1435);
					} else {
						local1262 = arg1.aShortArray102[local1133];
						local1267 = arg1.aShortArray95[local1133];
						local1272 = arg1.aShortArray98[local1133];
						@Pc(1645) int local1645 = local786.anIntArray711[local822];
						@Pc(1650) int local1650 = local786.anIntArray713[local822];
						@Pc(1655) int local1655 = local786.anIntArray712[local822];
						@Pc(1660) float[] local1660 = local786.aFloatArrayArray20[local822];
						@Pc(1665) byte local1665 = arg1.aByteArray83[local822];
						local1305 = (float) arg1.anIntArray400[local822] / 256.0F;
						if (local1252 == 1) {
							local1314 = (float) arg1.anIntArray398[local822] / 1024.0F;
							Static206.method2902(local1305, local1314, local1645, arg1.anIntArray392[local1262], local1655, local1665, Static5.aFloatArray2, local1660, local1650, arg1.anIntArray394[local1262], arg1.anIntArray396[local1262]);
							local1203 = Static5.aFloatArray2[1];
							local1201 = Static5.aFloatArray2[0];
							Static206.method2902(local1305, local1314, local1645, arg1.anIntArray392[local1267], local1655, local1665, Static5.aFloatArray2, local1660, local1650, arg1.anIntArray394[local1267], arg1.anIntArray396[local1267]);
							local1205 = Static5.aFloatArray2[0];
							local1207 = Static5.aFloatArray2[1];
							Static206.method2902(local1305, local1314, local1645, arg1.anIntArray392[local1272], local1655, local1665, Static5.aFloatArray2, local1660, local1650, arg1.anIntArray394[local1272], arg1.anIntArray396[local1272]);
							local1209 = Static5.aFloatArray2[0];
							local1211 = Static5.aFloatArray2[1];
							local1322 = local1314 / 2.0F;
							if ((local1665 & 0x1) == 0) {
								if (local1205 - local1201 > local1322) {
									local1213 = 1;
									local1205 -= local1314;
								} else if (local1201 - local1205 > local1322) {
									local1205 += local1314;
									local1213 = 2;
								}
								if (local1209 - local1201 > local1322) {
									local1209 -= local1314;
									local1215 = 1;
								} else if (local1322 < local1201 - local1209) {
									local1215 = 2;
									local1209 += local1314;
								}
							} else {
								if (local1322 < local1211 - local1203) {
									local1211 -= local1314;
									local1215 = 1;
								} else if (local1322 < local1203 - local1211) {
									local1211 += local1314;
									local1215 = 2;
								}
								if (local1322 < local1207 - local1203) {
									local1207 -= local1314;
									local1213 = 1;
								} else if (local1203 - local1207 > local1322) {
									local1213 = 2;
									local1207 += local1314;
								}
							}
						} else if (local1252 == 2) {
							local1314 = (float) arg1.anIntArray401[local822] / 256.0F;
							local1322 = (float) arg1.anIntArray393[local822] / 256.0F;
							@Pc(1929) int local1929 = arg1.anIntArray394[local1267] - arg1.anIntArray394[local1262];
							@Pc(1940) int local1940 = arg1.anIntArray392[local1267] - arg1.anIntArray392[local1262];
							@Pc(1951) int local1951 = arg1.anIntArray396[local1267] - arg1.anIntArray396[local1262];
							@Pc(1962) int local1962 = arg1.anIntArray394[local1272] - arg1.anIntArray394[local1262];
							@Pc(1973) int local1973 = arg1.anIntArray392[local1272] - arg1.anIntArray392[local1262];
							@Pc(1984) int local1984 = arg1.anIntArray396[local1272] - arg1.anIntArray396[local1262];
							@Pc(1993) int local1993 = local1940 * local1984 - local1951 * local1973;
							@Pc(2001) int local2001 = local1962 * local1951 - local1984 * local1929;
							@Pc(2010) int local2010 = local1973 * local1929 - local1962 * local1940;
							local1409 = 64.0F / (float) arg1.anIntArray399[local822];
							local1417 = 64.0F / (float) arg1.anIntArray402[local822];
							local1426 = 64.0F / (float) arg1.anIntArray398[local822];
							local1435 = (local1660[1] * (float) local2001 + local1660[0] * (float) local1993 + local1660[2] * (float) local2010) / local1409;
							local1443 = (local1660[5] * (float) local2010 + (float) local2001 * local1660[4] + local1660[3] * (float) local1993) / local1417;
							local1452 = (local1660[8] * (float) local2010 + (float) local1993 * local1660[6] + (float) local2001 * local1660[7]) / local1426;
							local1217 = Static237.method9874(local1443, local1435, local1452);
							Static536.method7525(local1655, local1660, local1645, local1314, arg1.anIntArray394[local1262], local1665, local1322, local1650, Static5.aFloatArray2, local1305, arg1.anIntArray392[local1262], arg1.anIntArray396[local1262], local1217);
							local1201 = Static5.aFloatArray2[0];
							local1203 = Static5.aFloatArray2[1];
							Static536.method7525(local1655, local1660, local1645, local1314, arg1.anIntArray394[local1267], local1665, local1322, local1650, Static5.aFloatArray2, local1305, arg1.anIntArray392[local1267], arg1.anIntArray396[local1267], local1217);
							local1205 = Static5.aFloatArray2[0];
							local1207 = Static5.aFloatArray2[1];
							Static536.method7525(local1655, local1660, local1645, local1314, arg1.anIntArray394[local1272], local1665, local1322, local1650, Static5.aFloatArray2, local1305, arg1.anIntArray392[local1272], arg1.anIntArray396[local1272], local1217);
							local1209 = Static5.aFloatArray2[0];
							local1211 = Static5.aFloatArray2[1];
						} else if (local1252 == 3) {
							Static670.method9140(arg1.anIntArray392[local1262], local1655, arg1.anIntArray396[local1262], local1305, local1645, local1650, local1665, arg1.anIntArray394[local1262], local1660, Static5.aFloatArray2);
							local1201 = Static5.aFloatArray2[0];
							local1203 = Static5.aFloatArray2[1];
							Static670.method9140(arg1.anIntArray392[local1267], local1655, arg1.anIntArray396[local1267], local1305, local1645, local1650, local1665, arg1.anIntArray394[local1267], local1660, Static5.aFloatArray2);
							local1205 = Static5.aFloatArray2[0];
							local1207 = Static5.aFloatArray2[1];
							Static670.method9140(arg1.anIntArray392[local1272], local1655, arg1.anIntArray396[local1272], local1305, local1645, local1650, local1665, arg1.anIntArray394[local1272], local1660, Static5.aFloatArray2);
							local1211 = Static5.aFloatArray2[1];
							local1209 = Static5.aFloatArray2[0];
							if ((local1665 & 0x1) == 0) {
								if (local1209 - local1201 > 0.5F) {
									local1209--;
									local1215 = 1;
								} else if (local1201 - local1209 > 0.5F) {
									local1215 = 2;
									local1209++;
								}
								if (local1205 - local1201 > 0.5F) {
									local1213 = 1;
									local1205--;
								} else if (local1201 - local1205 > 0.5F) {
									local1213 = 2;
									local1205++;
								}
							} else {
								if (local1207 - local1203 > 0.5F) {
									local1213 = 1;
									local1207--;
								} else if (local1203 - local1207 > 0.5F) {
									local1213 = 2;
									local1207++;
								}
								if (local1211 - local1203 > 0.5F) {
									local1215 = 1;
									local1211--;
								} else if (local1203 - local1211 > 0.5F) {
									local1211++;
									local1215 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray79 == null) {
				local1252 = 0;
			} else {
				local1252 = arg1.aByteArray79[local1133];
			}
			if (local1252 == 0) {
				@Pc(2604) long local2604 = (long) (local822 << 2) + ((long) local833 + (long) (local1140 << 8) + (long) (local1217 << 24) << 32);
				local1272 = arg1.aShortArray102[local1133];
				local1277 = arg1.aShortArray95[local1133];
				local1282 = arg1.aShortArray98[local1133];
				@Pc(2623) Class162 local2623 = local465[local1272];
				this.aShortArray62[local185] = this.method2504(local2623.anInt3835, local1203, local2623.anInt3842, local2623.anInt3837, local2623.anInt3841, local185, arg1, local2604, local1272, local1201);
				@Pc(2648) Class162 local2648 = local465[local1277];
				this.aShortArray68[local185] = this.method2504(local2648.anInt3835, local1207, local2648.anInt3842, local2648.anInt3837, local2648.anInt3841, local185, arg1, local2604 + (long) local1213, local1277, local1205);
				@Pc(2676) Class162 local2676 = local465[local1282];
				this.aShortArray56[local185] = this.method2504(local2676.anInt3835, local1211, local2676.anInt3842, local2676.anInt3837, local2676.anInt3841, local185, arg1, (long) local1215 + local2604, local1282, local1209);
			} else if (local1252 == 1) {
				@Pc(2459) Class249 local2459 = local790[local1133];
				@Pc(2506) long local2506 = ((long) (local1217 << 24) + (long) (local1140 << 8) + (long) local833 << 32) + (long) ((local2459.anInt6706 + 256 << 22) + (local2459.anInt6704 + 256 << 12) + (local822 << 2) + (local2459.anInt6703 > 0 ? 1024 : 2048));
				this.aShortArray62[local185] = this.method2504(local2459.anInt6704, local1203, local2459.anInt6706, 0, local2459.anInt6703, local185, arg1, local2506, arg1.aShortArray102[local1133], local1201);
				this.aShortArray68[local185] = this.method2504(local2459.anInt6704, local1207, local2459.anInt6706, 0, local2459.anInt6703, local185, arg1, local2506 + (long) local1213, arg1.aShortArray95[local1133], local1205);
				this.aShortArray56[local185] = this.method2504(local2459.anInt6704, local1211, local2459.anInt6706, 0, local2459.anInt6703, local185, arg1, local2506 + (long) local1215, arg1.aShortArray98[local1133], local1209);
			}
			if (arg1.aByteArray80 != null) {
				this.aByteArray33[local185] = arg1.aByteArray80[local1133];
			}
			if (arg1.aShortArray97 != null) {
				this.aShortArray57[local185] = arg1.aShortArray97[local1133];
			}
			this.aShortArray59[local185] = arg1.aShortArray100[local1133];
			this.aShortArray58[local185] = local1177;
		}
		if (this.anInt2863 > 0) {
			local1133 = 1;
			local811 = this.aShortArray58[0];
			for (local822 = 0; local822 < this.anInt2863; local822++) {
				@Pc(2774) short local2774 = this.aShortArray58[local822];
				if (local811 != local2774) {
					local811 = local2774;
					local1133++;
				}
			}
			this.anIntArray208 = new int[local1133];
			this.anIntArray211 = new int[local1133];
			this.anIntArray209 = new int[local1133 + 1];
			this.anIntArray209[0] = 0;
			local833 = this.anInt2824;
			local811 = this.aShortArray58[0];
			local1133 = 0;
			local1177 = 0;
			for (local855 = 0; local855 < this.anInt2863; local855++) {
				@Pc(2833) short local2833 = this.aShortArray58[local855];
				if (local2833 != local811) {
					this.anIntArray211[local1133] = local833;
					this.anIntArray208[local1133] = local1177 + 1 - local833;
					local1133++;
					this.anIntArray209[local1133] = local855;
					local833 = this.anInt2824;
					local1177 = 0;
					local811 = local2833;
				}
				@Pc(2873) short local2873 = this.aShortArray62[local855];
				if (local2873 < local833) {
					local833 = local2873;
				}
				if (local2873 > local1177) {
					local1177 = local2873;
				}
				local2873 = this.aShortArray68[local855];
				if (local833 > local2873) {
					local833 = local2873;
				}
				if (local2873 > local1177) {
					local1177 = local2873;
				}
				local2873 = this.aShortArray56[local855];
				if (local833 > local2873) {
					local833 = local2873;
				}
				if (local1177 < local2873) {
					local1177 = local2873;
				}
			}
			this.anIntArray211[local1133] = local833;
			this.anIntArray208[local1133] = local1177 + 1 - local833;
			local1133++;
			this.anIntArray209[local1133] = this.anInt2863;
		}
		Static411.aLongArray13 = null;
		this.aShortArray65 = Static191.method2741(this.aShortArray65, this.anInt2824);
		this.aShortArray60 = Static191.method2741(this.aShortArray60, this.anInt2824);
		this.aShortArray64 = Static191.method2741(this.aShortArray64, this.anInt2824);
		this.aShortArray66 = Static191.method2741(this.aShortArray66, this.anInt2824);
		this.aShortArray63 = Static191.method2741(this.aShortArray63, this.anInt2824);
		this.aByteArray34 = Static274.method3839(this.aByteArray34, this.anInt2824);
		this.aFloatArray19 = Static340.method4736(this.anInt2824, this.aFloatArray19);
		this.aFloatArray20 = Static340.method4736(this.anInt2824, this.aFloatArray20);
		if (arg1.anIntArray397 != null && Static15.method240(arg2, this.anInt2797)) {
			this.anIntArrayArray16 = arg1.method5320(false, -126);
		}
		if (arg1.aClass390Array1 != null && Static81.method1219(arg2, this.anInt2797)) {
			this.anIntArrayArray18 = arg1.method5306();
		}
		if (arg1.anIntArray395 != null && Static392.method5837(arg2, this.anInt2797)) {
			local1133 = 0;
			@Pc(3086) int[] local3086 = new int[256];
			for (local822 = 0; local822 < this.anInt2864; local822++) {
				local833 = arg1.anIntArray395[local22[local822]];
				if (local833 >= 0) {
					@Pc(3106) int local3106 = local3086[local833]++;
					if (local1133 < local833) {
						local1133 = local833;
					}
				}
			}
			this.anIntArrayArray17 = new int[local1133 + 1][];
			for (local833 = 0; local833 <= local1133; local833++) {
				this.anIntArrayArray17[local833] = new int[local3086[local833]];
				local3086[local833] = 0;
			}
			for (local844 = 0; local844 < this.anInt2864; local844++) {
				local855 = arg1.anIntArray395[local22[local844]];
				if (local855 >= 0) {
					this.anIntArrayArray17[local855][local3086[local855]++] = local844;
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Lclient!lb;IIZZ)V")
	public Class45_Sub2(@OriginalArg(0) Class145_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean278 = false;
		this.aBoolean280 = false;
		this.aBoolean279 = false;
		this.anInt2863 = 0;
		this.anInt2855 = 0;
		this.aBoolean282 = false;
		this.anInt2824 = 0;
		this.anInt2864 = 0;
		this.aBoolean281 = true;
		this.anInt2815 = 0;
		this.aBoolean280 = arg4;
		this.anInt2862 = arg1;
		this.aClass145_Sub1_9 = arg0;
		this.anInt2797 = arg2;
		if (arg3 || Static645.method8740(this.anInt2797, this.anInt2862)) {
			this.lb = new Class164(Static435.method6316(this.anInt2797, this.anInt2862));
		}
		if (arg3 || Static239.method3386(this.anInt2862, this.anInt2797)) {
			this.aClass164_2 = new Class164(Static207.method2929(this.anInt2862, this.anInt2797));
		}
		if (arg3 || Static135.method1980(this.anInt2862, this.anInt2797)) {
			this.aClass164_1 = new Class164(Static13.method212(this.anInt2862, this.anInt2797));
		}
		if (arg3 || Static62.method942(this.anInt2797, this.anInt2862)) {
			this.aClass164_3 = new Class164(Static170.method2539(this.anInt2797, this.anInt2862));
		}
		if (arg3 || Static507.method7185(this.anInt2797, this.anInt2862)) {
			this.aClass357_1 = new Class357(Static299.method4195(this.anInt2797, this.anInt2862));
		}
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(B)V")
	private void method2488() {
		if (this.aClass164_1 != null) {
			this.aClass164_1.aBoolean344 = false;
		}
	}

	@OriginalMember(owner = "client!fca", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2807;
	}

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt2815; local15++) {
			local33 = local13 * this.anIntArray212[local15] + this.anIntArray213[local15] * local9 >> 14;
			this.anIntArray213[local15] = local13 * this.anIntArray213[local15] - this.anIntArray212[local15] * local9 >> 14;
			this.anIntArray212[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt2824; local33++) {
			@Pc(89) int local89 = local13 * this.aShortArray64[local33] + this.aShortArray63[local33] * local9 >> 14;
			this.aShortArray63[local33] = (short) (this.aShortArray63[local33] * local13 - this.aShortArray64[local33] * local9 >> 14);
			this.aShortArray64[local33] = (short) local89;
		}
		this.method2496();
		this.method2498();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)V")
	private void method2489() {
		if (this.aClass40Array1 == null) {
			return;
		}
		this.aClass145_Sub1_9.C(!this.aBoolean279);
		this.aClass145_Sub1_9.method9801(false);
		this.aClass145_Sub1_9.method9813(Static45.aClass352_1, 1);
		this.aClass145_Sub1_9.method9795(1, Static45.aClass352_1);
		for (@Pc(35) int local35 = 0; local35 < this.anInt2860; local35++) {
			@Pc(44) Class40 local44 = this.aClass40Array1[local35];
			@Pc(49) Class329 local49 = this.aClass329Array1[local35];
			if (!local44.aBoolean105 || !this.aClass145_Sub1_9.method9632()) {
				@Pc(80) float local80 = (float) (this.anIntArray212[local44.anInt856] + this.anIntArray212[local44.anInt857] + this.anIntArray212[local44.anInt861]) * 0.3333333F;
				@Pc(102) float local102 = (float) (this.anIntArray214[local44.anInt856] + this.anIntArray214[local44.anInt857] + this.anIntArray214[local44.anInt861]) * 0.3333333F;
				@Pc(124) float local124 = (float) (this.anIntArray213[local44.anInt856] + this.anIntArray213[local44.anInt857] + this.anIntArray213[local44.anInt861]) * 0.3333333F;
				@Pc(138) float local138 = local80 * Static404.aFloat112 + Static418.aFloat113 * local102 + local124 * Static535.aFloat142 + Static248.aFloat48;
				@Pc(152) float local152 = Static611.aFloat150 + Static629.aFloat152 * local80 + local102 * Static718.aFloat178 + local124 * Static457.aFloat125;
				@Pc(166) float local166 = Static259.aFloat49 + Static330.aFloat70 * local102 + Static139.aFloat25 * local80 + local124 * Static677.aFloat174;
				@Pc(187) float local187 = (float) (1.0D / Math.sqrt((double) (local166 * local166 + local138 * local138 + local152 * local152))) * (float) local44.anInt859;
				@Pc(192) Class86_Sub2 local192 = this.aClass145_Sub1_9.method9835();
				local192.method2734(local152 + (float) local49.anInt8858 - local187 * local152, local166 - local166 * local187, local44.aShort26 * local49.anInt8852 >> 7, local49.anInt8848, local138 + (float) local49.anInt8849 - local138 * local187, local44.aShort27 * local49.anInt8857 >> 7);
				local192.method2730(this.aClass145_Sub1_9.aClass86_Sub2_17);
				this.aClass145_Sub1_9.method9786();
				@Pc(249) int local249 = local49.anInt8856;
				this.aClass145_Sub1_9.method9724(local44.aShort25, false, false);
				this.aClass145_Sub1_9.method9832(local44.aByte44);
				this.aClass145_Sub1_9.method9769(local249);
				this.aClass145_Sub1_9.method9738();
			}
		}
		this.aClass145_Sub1_9.method9795(1, Static240.aClass352_6);
		this.aClass145_Sub1_9.method9813(Static240.aClass352_6, 1);
		this.aClass145_Sub1_9.C(true);
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "()V")
	@Override
	protected void method5747() {
	}

	@OriginalMember(owner = "client!fca", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub9 ba(@OriginalArg(0) Class2_Sub6_Sub9 arg0) {
		if (this.anInt2824 == 0) {
			return null;
		}
		if (!this.aBoolean278) {
			this.method2493();
		}
		@Pc(46) int local46;
		@Pc(63) int local63;
		if (this.aClass145_Sub1_9.anInt11251 > 0) {
			local46 = this.anInt2833 - (this.anInt2812 * this.aClass145_Sub1_9.anInt11251 >> 8) >> this.aClass145_Sub1_9.anInt11265;
			local63 = this.anInt2871 - (this.aClass145_Sub1_9.anInt11251 * this.anInt2807 >> 8) >> this.aClass145_Sub1_9.anInt11265;
		} else {
			local46 = this.anInt2833 - (this.aClass145_Sub1_9.anInt11251 * this.anInt2807 >> 8) >> this.aClass145_Sub1_9.anInt11265;
			local63 = this.anInt2871 - (this.anInt2812 * this.aClass145_Sub1_9.anInt11251 >> 8) >> this.aClass145_Sub1_9.anInt11265;
		}
		@Pc(119) int local119;
		@Pc(135) int local135;
		if (this.aClass145_Sub1_9.anInt11275 <= 0) {
			local119 = this.anInt2804 - (this.anInt2807 * this.aClass145_Sub1_9.anInt11275 >> 8) >> this.aClass145_Sub1_9.anInt11265;
			local135 = this.anInt2847 - (this.aClass145_Sub1_9.anInt11275 * this.anInt2812 >> 8) >> this.aClass145_Sub1_9.anInt11265;
		} else {
			local119 = this.anInt2804 - (this.aClass145_Sub1_9.anInt11275 * this.anInt2812 >> 8) >> this.aClass145_Sub1_9.anInt11265;
			local135 = this.anInt2847 - (this.anInt2807 * this.aClass145_Sub1_9.anInt11275 >> 8) >> this.aClass145_Sub1_9.anInt11265;
		}
		@Pc(177) int local177 = local63 + 1 - local46;
		@Pc(184) int local184 = local135 + 1 - local119;
		@Pc(187) Class2_Sub6_Sub9_Sub2 local187 = (Class2_Sub6_Sub9_Sub2) arg0;
		@Pc(205) Class2_Sub6_Sub9_Sub2 local205;
		if (local187 != null && local187.method4757(local184, local177)) {
			local205 = local187;
			local187.method4759();
		} else {
			local205 = new Class2_Sub6_Sub9_Sub2(this.aClass145_Sub1_9, local177, local184);
		}
		local205.method4758(local119, local46, local63, local135);
		this.method2499(local205);
		return local205;
	}

	@OriginalMember(owner = "client!fca", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2847;
	}

	@OriginalMember(owner = "client!fca", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort49;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!gw;IZ)V")
	@Override
	public void method5756(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray61 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2815; local15++) {
			if ((this.aShortArray61[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method7031(this.anIntArray212[local15], this.anIntArray214[local15], this.anIntArray213[local15], local13);
				} else {
					arg0.method7028(this.anIntArray212[local15], this.anIntArray214[local15], this.anIntArray213[local15], local13);
				}
				this.anIntArray212[local15] = local13[0];
				this.anIntArray214[local15] = local13[1];
				this.anIntArray213[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2833;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2815; local15++) {
			@Pc(35) int local35 = this.anIntArray213[local15] * local9 + this.anIntArray212[local15] * local13 >> 14;
			this.anIntArray213[local15] = local13 * this.anIntArray213[local15] - this.anIntArray212[local15] * local9 >> 14;
			this.anIntArray212[local15] = local35;
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class45 method5768(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(30) Class45_Sub2 local30;
		@Pc(22) Class45_Sub2 local22;
		if (arg0 > 0 && arg0 <= 7) {
			local22 = this.aClass145_Sub1_9.aClass45_Sub2Array6[arg0 - 1];
			local30 = this.aClass145_Sub1_9.aClass45_Sub2Array5[arg0 - 1];
			local5 = true;
		} else {
			local30 = local22 = new Class45_Sub2(this.aClass145_Sub1_9, 0, 0, true, false);
		}
		return this.method2497(arg1, local5, arg2, local30, local22);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 > arg4 && arg4 < arg7 && arg5 > arg4) {
			return false;
		} else if (arg4 > arg2 && arg7 < arg4 && arg5 < arg4) {
			return false;
		} else if (arg6 < arg3 && arg6 < arg0 && arg1 > arg6) {
			return false;
		} else {
			return arg3 >= arg6 || arg0 >= arg6 || arg6 <= arg1;
		}
	}

	@OriginalMember(owner = "client!fca", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2871;
	}

	@OriginalMember(owner = "client!fca", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2820;
	}

	@OriginalMember(owner = "client!fca", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2841;
	}

	@OriginalMember(owner = "client!fca", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2815; local15++) {
			@Pc(35) int local35 = this.anIntArray212[local15] * local13 + local9 * this.anIntArray214[local15] >> 14;
			this.anIntArray214[local15] = local13 * this.anIntArray214[local15] - local9 * this.anIntArray212[local15] >> 14;
			this.anIntArray212[local15] = local35;
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean278) {
			this.method2493();
		}
		@Pc(18) int local18 = this.anInt2833 + arg4;
		@Pc(23) int local23 = arg4 + this.anInt2871;
		@Pc(28) int local28 = arg6 + this.anInt2804;
		@Pc(33) int local33 = this.anInt2847 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9321 + local23 >> arg2.anInt9317 >= arg2.anInt9318 || local28 < 0 || arg2.anInt9321 + local33 >> arg2.anInt9317 >= arg2.anInt9315)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt9318 <= local23 + arg3.anInt9321 >> arg3.anInt9317 || local28 < 0 || arg3.anInt9315 <= arg3.anInt9321 + local33 >> arg3.anInt9317) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9317;
			local23 = arg2.anInt9321 + local23 - 1 >> arg2.anInt9317;
			local28 >>= arg2.anInt9317;
			local33 = arg2.anInt9321 + local33 - 1 >> arg2.anInt9317;
			if (arg5 == arg2.method8217(local18, local28) && arg2.method8217(local23, local28) == arg5 && arg2.method8217(local18, local33) == arg5 && arg5 == arg2.method8217(local23, local33)) {
				return;
			}
		}
		@Pc(229) int local229;
		if (arg0 == 1) {
			for (local229 = 0; local229 < this.anInt2815; local229++) {
				this.anIntArray214[local229] = this.anIntArray214[local229] + arg2.method8214(this.anIntArray212[local229] - -arg4, this.anIntArray213[local229] + arg6) - arg5;
			}
		} else {
			@Pc(298) int local298;
			@Pc(370) int local370;
			if (arg0 == 2) {
				local229 = this.anInt2807;
				if (local229 == 0) {
					return;
				}
				for (local298 = 0; local298 < this.anInt2815; local298++) {
					local370 = (this.anIntArray214[local298] << 16) / local229;
					if (local370 < arg1) {
						this.anIntArray214[local298] -= -((arg2.method8214(this.anIntArray212[local298] + arg4, this.anIntArray213[local298] - -arg6) - arg5) * (-local370 + arg1) / arg1);
					}
				}
			} else {
				@Pc(377) int local377;
				if (arg0 == 3) {
					local229 = (arg1 & 0xFF) * 4;
					local298 = (arg1 >> 8 & 0xFF) * 4;
					local370 = (arg1 >> 16 & 0xFF) << 6;
					local377 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local229 >> 1) < 0 || arg2.anInt9318 << arg2.anInt9317 <= (local229 >> 1) + (arg4 + arg2.anInt9321) || arg6 - (local298 >> 1) < 0 || arg2.anInt9315 << arg2.anInt9317 <= arg2.anInt9321 + arg6 + (local298 >> 1)) {
						return;
					}
					this.method5764(local370, local229, local377, arg5, arg4, local298, arg2, arg6);
				} else if (arg0 == 4) {
					local229 = this.anInt2812 - this.anInt2807;
					for (local298 = 0; local298 < this.anInt2815; local298++) {
						this.anIntArray214[local298] = local229 + this.anIntArray214[local298] + arg3.method8214(this.anIntArray212[local298] + arg4, arg6 + this.anIntArray213[local298]) - arg5;
					}
				} else if (arg0 == 5) {
					local229 = this.anInt2812 - this.anInt2807;
					for (local298 = 0; local298 < this.anInt2815; local298++) {
						local370 = this.anIntArray212[local298] + arg4;
						local377 = this.anIntArray213[local298] + arg6;
						@Pc(383) int local383 = arg2.method8214(local370, local377);
						@Pc(389) int local389 = arg3.method8214(local370, local377);
						@Pc(397) int local397 = local383 - arg1 - local389;
						this.anIntArray214[local298] = (local397 * ((this.anIntArray214[local298] << 8) / local229) >> 8) - (arg5 - local383);
					}
				}
			}
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort50 = (short) arg0;
		this.method2496();
		this.method2498();
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)Z")
	private boolean method2492() {
		@Pc(14) boolean local14 = !this.aClass164_1.aBoolean344;
		@Pc(30) boolean local30 = (this.anInt2797 & 0x37) != 0 && !this.aClass164_3.aBoolean344;
		@Pc(39) boolean local39 = !this.lb.aBoolean344;
		@Pc(48) boolean local48 = !this.aClass164_2.aBoolean344;
		if (!local39 && !local14 && !local30 && !local48) {
			return true;
		}
		@Pc(73) boolean local73 = true;
		@Pc(102) Interface24 local102;
		@Pc(116) Buffer local116;
		if (local39) {
			if (this.aShortArray65 == null) {
				return true;
			}
			if (this.lb.anInterface24_5 == null) {
				this.lb.anInterface24_5 = this.aClass145_Sub1_9.method9825(this.aBoolean280);
			}
			local102 = this.lb.anInterface24_5;
			local102.method9227(12, this.anInt2824 * 12);
			local116 = local102.method9228();
			if (local116 == null) {
				local73 = false;
			} else {
				this.aClass145_Sub1_9.aNativeInterface3.copyPositions(this.anIntArray212, this.anIntArray214, this.anIntArray213, this.aShortArray65, 0, 12, this.anInt2824, local116.getAddress());
				if (local102.method9230()) {
					this.lb.aBoolean344 = true;
					this.lb.anInterface24_4 = local102;
				} else {
					local73 = false;
				}
			}
		}
		@Pc(245) short[] local245;
		@Pc(248) short[] local248;
		@Pc(251) short[] local251;
		@Pc(254) byte[] local254;
		if (local14) {
			if (this.aClass164_1.anInterface24_5 == null) {
				this.aClass164_1.anInterface24_5 = this.aClass145_Sub1_9.method9825(this.aBoolean280);
			}
			local102 = this.aClass164_1.anInterface24_5;
			local102.method9227(4, this.anInt2824 * 4);
			local116 = local102.method9228();
			if (local116 == null) {
				local73 = false;
			} else {
				if ((this.anInt2797 & 0x37) == 0) {
					if (this.aClass39_1 == null) {
						local245 = this.aShortArray64;
						local248 = this.aShortArray66;
						local251 = this.aShortArray63;
						local254 = this.aByteArray34;
					} else {
						local245 = this.aClass39_1.aShortArray2;
						local251 = this.aClass39_1.aShortArray3;
						local254 = this.aClass39_1.aByteArray5;
						local248 = this.aClass39_1.aShortArray1;
					}
					this.aClass145_Sub1_9.aNativeInterface3.copyLighting(this.aShortArray59, this.aByteArray33, this.aShortArray58, local245, local248, local251, local254, this.aShort49, this.aShort50, this.aShortArray60, 0, 4, this.anInt2824, local116.getAddress());
				} else {
					this.aClass145_Sub1_9.aNativeInterface3.copyColours(this.aShortArray59, this.aByteArray33, this.aShortArray58, this.aShort49, this.aShortArray60, 0, 4, this.anInt2824, local116.getAddress());
				}
				if (local102.method9230()) {
					this.aClass164_1.aBoolean344 = true;
					this.aClass164_1.anInterface24_4 = local102;
				} else {
					local73 = false;
				}
			}
		}
		if (local30) {
			if (this.aClass164_3.anInterface24_5 == null) {
				this.aClass164_3.anInterface24_5 = this.aClass145_Sub1_9.method9825(this.aBoolean280);
			}
			local102 = this.aClass164_3.anInterface24_5;
			local102.method9227(12, this.anInt2824 * 12);
			local116 = local102.method9228();
			if (local116 == null) {
				local73 = false;
			} else {
				if (this.aClass39_1 == null) {
					local245 = this.aShortArray64;
					local248 = this.aShortArray66;
					local251 = this.aShortArray63;
					local254 = this.aByteArray34;
				} else {
					local254 = this.aClass39_1.aByteArray5;
					local251 = this.aClass39_1.aShortArray3;
					local248 = this.aClass39_1.aShortArray1;
					local245 = this.aClass39_1.aShortArray2;
				}
				this.aClass145_Sub1_9.aNativeInterface3.copyNormals(local245, local248, local251, local254, 3.0F / (float) this.aShort50, 3.0F / (float) (this.aShort50 + this.aShort50 / 2), 0, 12, this.anInt2824, local116.getAddress());
				if (local102.method9230()) {
					this.aClass164_3.aBoolean344 = true;
					this.aClass164_3.anInterface24_4 = local102;
				} else {
					local73 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass164_2.anInterface24_5 == null) {
				this.aClass164_2.anInterface24_5 = this.aClass145_Sub1_9.method9825(this.aBoolean280);
			}
			local102 = this.aClass164_2.anInterface24_5;
			local102.method9227(8, this.anInt2824 * 8);
			local116 = local102.method9228();
			if (local116 == null) {
				local73 = false;
			} else {
				this.aClass145_Sub1_9.aNativeInterface3.copyTexCoords(this.aFloatArray19, this.aFloatArray20, 0, 8, this.anInt2824, local116.getAddress());
				if (local102.method9230()) {
					this.aClass164_2.aBoolean344 = true;
					this.aClass164_2.anInterface24_4 = local102;
				} else {
					local73 = false;
				}
			}
		}
		return local73;
	}

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "(I)V")
	private void method2493() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = -32768;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt2815; local31++) {
			@Pc(40) int local40 = this.anIntArray212[local31];
			@Pc(45) int local45 = this.anIntArray214[local31];
			if (local23 < local45) {
				local23 = local45;
			}
			if (local9 > local45) {
				local9 = local45;
			}
			if (local13 < local40) {
				local13 = local40;
			}
			@Pc(69) int local69 = this.anIntArray213[local31];
			if (local7 > local40) {
				local7 = local40;
			}
			if (local69 < local11) {
				local11 = local69;
			}
			if (local25 < local69) {
				local25 = local69;
			}
			@Pc(96) int local96 = local69 * local69 + local40 * local40;
			if (local96 > local27) {
				local27 = local96;
			}
			local96 = local69 * local69 + local40 * local40 + local45 * local45;
			if (local96 > local29) {
				local29 = local96;
			}
		}
		this.anInt2847 = local25;
		this.anInt2807 = local9;
		this.anInt2871 = local13;
		this.anInt2812 = local23;
		this.anInt2833 = local7;
		this.anInt2804 = local11;
		this.anInt2820 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.anInt2841 = (int) (Math.sqrt((double) local29) + 0.99D);
		this.aBoolean278 = true;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIIIZILclient!gw;)Z")
	private boolean method2494(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class86 arg5) {
		@Pc(8) Class86_Sub2 local8 = (Class86_Sub2) arg5;
		@Pc(12) Class86_Sub2 local12 = this.aClass145_Sub1_9.aClass86_Sub2_16;
		@Pc(33) float local33 = local8.aFloat31 * local12.aFloat33 + local12.aFloat36 * local8.aFloat41 + local12.aFloat32 * local8.aFloat38 + local12.aFloat31;
		@Pc(54) float local54 = local12.aFloat41 + local12.aFloat34 * local8.aFloat41 + local8.aFloat31 * local12.aFloat40 + local12.aFloat35 * local8.aFloat38;
		Static139.aFloat25 = local12.aFloat37 * local8.aFloat30 + local12.aFloat39 * local8.aFloat40 + local8.aFloat33 * local12.aFloat30;
		Static330.aFloat70 = local12.aFloat37 * local8.aFloat39 + local12.aFloat39 * local8.aFloat34 + local8.aFloat36 * local12.aFloat30;
		@Pc(111) float local111 = local12.aFloat30 * local8.aFloat31 + local8.aFloat41 * local12.aFloat39 + local12.aFloat37 * local8.aFloat38 + local12.aFloat38;
		Static418.aFloat113 = local12.aFloat32 * local8.aFloat39 + local8.aFloat34 * local12.aFloat36 + local8.aFloat36 * local12.aFloat33;
		Static629.aFloat152 = local8.aFloat30 * local12.aFloat35 + local8.aFloat40 * local12.aFloat34 + local12.aFloat40 * local8.aFloat33;
		Static457.aFloat125 = local12.aFloat35 * local8.aFloat37 + local8.aFloat35 * local12.aFloat34 + local8.aFloat32 * local12.aFloat40;
		Static718.aFloat178 = local12.aFloat34 * local8.aFloat34 + local8.aFloat36 * local12.aFloat40 + local8.aFloat39 * local12.aFloat35;
		Static677.aFloat174 = local8.aFloat37 * local12.aFloat37 + local12.aFloat30 * local8.aFloat32 + local12.aFloat39 * local8.aFloat35;
		Static404.aFloat112 = local8.aFloat33 * local12.aFloat33 + local8.aFloat40 * local12.aFloat36 + local8.aFloat30 * local12.aFloat32;
		Static535.aFloat142 = local12.aFloat33 * local8.aFloat32 + local8.aFloat35 * local12.aFloat36 + local12.aFloat32 * local8.aFloat37;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass145_Sub1_9.anInt11241;
		@Pc(255) int local255 = this.aClass145_Sub1_9.anInt11245;
		if (!this.aBoolean278) {
			this.method2493();
		}
		@Pc(272) int local272 = this.anInt2871 - this.anInt2833 >> 1;
		@Pc(281) int local281 = this.anInt2812 - this.anInt2807 >> 1;
		@Pc(290) int local290 = this.anInt2847 - this.anInt2804 >> 1;
		@Pc(295) int local295 = local272 + this.anInt2833;
		@Pc(300) int local300 = this.anInt2807 + local281;
		@Pc(305) int local305 = this.anInt2804 + local290;
		@Pc(312) int local312 = local295 - (local272 << arg0);
		@Pc(319) int local319 = local300 - (local281 << arg0);
		@Pc(326) int local326 = local305 - (local290 << arg0);
		@Pc(333) int local333 = local295 + (local272 << arg0);
		@Pc(345) int local345 = (local281 << arg0) + local300;
		@Pc(351) int local351 = (local290 << arg0) + local305;
		Static487.anIntArray555[0] = local312;
		Static701.anIntArray611[0] = local319;
		Static487.anIntArray555[1] = local333;
		Static104.anIntArray134[0] = local326;
		Static701.anIntArray611[1] = local319;
		Static487.anIntArray555[2] = local312;
		Static104.anIntArray134[1] = local326;
		Static701.anIntArray611[2] = local345;
		Static104.anIntArray134[2] = local326;
		Static487.anIntArray555[3] = local333;
		Static701.anIntArray611[3] = local345;
		Static487.anIntArray555[4] = local312;
		Static104.anIntArray134[3] = local326;
		Static701.anIntArray611[4] = local319;
		Static487.anIntArray555[5] = local333;
		Static104.anIntArray134[4] = local351;
		Static701.anIntArray611[5] = local319;
		Static487.anIntArray555[6] = local312;
		Static104.anIntArray134[5] = local351;
		Static701.anIntArray611[6] = local345;
		Static104.anIntArray134[6] = local351;
		Static487.anIntArray555[7] = local333;
		Static701.anIntArray611[7] = local345;
		Static104.anIntArray134[7] = local351;
		@Pc(496) float local496;
		@Pc(482) float local482;
		@Pc(510) float local510;
		@Pc(458) float local458;
		@Pc(468) float local468;
		@Pc(463) float local463;
		for (@Pc(449) int local449 = 0; local449 < 8; local449++) {
			local458 = (float) Static487.anIntArray555[local449];
			local463 = (float) Static104.anIntArray134[local449];
			local468 = (float) Static701.anIntArray611[local449];
			local482 = Static457.aFloat125 * local463 + Static629.aFloat152 * local458 + local468 * Static718.aFloat178 + local54;
			local496 = local463 * Static535.aFloat142 + Static404.aFloat112 * local458 + local468 * Static418.aFloat113 + local33;
			local510 = Static139.aFloat25 * local458 + Static330.aFloat70 * local468 + Static677.aFloat174 * local463 + local111;
			if ((float) this.aClass145_Sub1_9.anInt11250 <= local510) {
				if (arg1 > 0) {
					local510 = (float) arg1;
				}
				@Pc(536) float local536 = (float) this.aClass145_Sub1_9.anInt11246 + (float) local251 * local496 / local510;
				if (local241 > local536) {
					local241 = local536;
				}
				if (local536 > local243) {
					local243 = local536;
				}
				@Pc(560) float local560 = (float) this.aClass145_Sub1_9.anInt11273 + local482 * (float) local255 / local510;
				if (local560 < local245) {
					local245 = local560;
				}
				if (local247 < local560) {
					local247 = local560;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg4 && local243 > (float) arg4 && (float) arg2 > local245 && (float) arg2 < local247) {
			if (arg3) {
				return true;
			}
			if (this.anInt2824 > Static499.anIntArray570.length) {
				Static499.anIntArray570 = new int[this.anInt2824];
				Static277.anIntArray315 = new int[this.anInt2824];
			}
			@Pc(733) int local733;
			for (@Pc(642) int local642 = 0; local642 < this.anInt2815; local642++) {
				local463 = (float) this.anIntArray213[local642];
				local468 = (float) this.anIntArray214[local642];
				local458 = (float) this.anIntArray212[local642];
				local510 = local111 + Static139.aFloat25 * local458 + Static330.aFloat70 * local468 + local463 * Static677.aFloat174;
				local482 = local54 + Static457.aFloat125 * local463 + Static718.aFloat178 * local468 + Static629.aFloat152 * local458;
				local496 = Static418.aFloat113 * local468 + Static404.aFloat112 * local458 + local463 * Static535.aFloat142 + local33;
				@Pc(746) int local746;
				@Pc(751) int local751;
				@Pc(758) int local758;
				if (local510 >= (float) this.aClass145_Sub1_9.anInt11250) {
					if (arg1 > 0) {
						local510 = (float) arg1;
					}
					local733 = (int) ((float) this.aClass145_Sub1_9.anInt11246 + local496 * (float) local251 / local510);
					local746 = (int) ((float) local255 * local482 / local510 + (float) this.aClass145_Sub1_9.anInt11273);
					local751 = this.anIntArray210[local642];
					local758 = this.anIntArray210[local642 + 1];
					for (@Pc(760) int local760 = local751; local760 < local758; local760++) {
						@Pc(769) int local769 = this.aShortArray67[local760] - 1;
						if (local769 == -1) {
							break;
						}
						Static499.anIntArray570[local769] = local733;
						Static277.anIntArray315[local769] = local746;
					}
				} else {
					local733 = this.anIntArray210[local642];
					local746 = this.anIntArray210[local642 + 1];
					for (local751 = local733; local751 < local746; local751++) {
						local758 = this.aShortArray67[local751] - 1;
						if (local758 == -1) {
							break;
						}
						Static499.anIntArray570[this.aShortArray67[local751] - 1] = -999999;
					}
				}
			}
			for (local733 = 0; local733 < this.anInt2864; local733++) {
				if (Static499.anIntArray570[this.aShortArray62[local733]] != -999999 && Static499.anIntArray570[this.aShortArray68[local733]] != -999999 && Static499.anIntArray570[this.aShortArray56[local733]] != -999999 && this.method2490(Static499.anIntArray570[this.aShortArray68[local733]], Static499.anIntArray570[this.aShortArray56[local733]], Static277.anIntArray315[this.aShortArray62[local733]], Static499.anIntArray570[this.aShortArray62[local733]], arg2, Static277.anIntArray315[this.aShortArray56[local733]], arg4, Static277.anIntArray315[this.aShortArray68[local733]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static108.anInt1826 = 0;
			Static422.anInt6874 = 0;
			local31 = 0;
			Static390.anInt6474 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray16.length) {
					local53 = this.anIntArrayArray16[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static422.anInt6874 += this.anIntArray212[local61];
						Static108.anInt1826 += this.anIntArray214[local61];
						local31++;
						Static390.anInt6474 += this.anIntArray213[local61];
					}
				}
			}
			if (local31 > 0) {
				Static422.anInt6874 = Static422.anInt6874 / local31 + local17;
				Static108.anInt1826 = local21 + Static108.anInt1826 / local31;
				Static390.anInt6474 = local25 + Static390.anInt6474 / local31;
			} else {
				Static390.anInt6474 = local25;
				Static422.anInt6874 = local17;
				Static108.anInt1826 = local21;
			}
			return;
		}
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (arg0 == 1) {
			local25 = arg4 << 4;
			local21 = arg3 << 4;
			local17 = arg2 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray16.length > local35) {
					local169 = this.anIntArrayArray16[local35];
					for (local171 = 0; local171 < local169.length; local171++) {
						local55 = local169[local171];
						this.anIntArray212[local55] += local17;
						this.anIntArray214[local55] += local21;
						this.anIntArray213[local55] += local25;
					}
				}
			}
			return;
		}
		@Pc(292) int local292;
		@Pc(310) int local310;
		@Pc(770) int local770;
		@Pc(779) int local779;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray16.length > local35) {
					local169 = this.anIntArrayArray16[local35];
					if ((arg5 & 0x1) == 0) {
						for (local171 = 0; local171 < local169.length; local171++) {
							local55 = local169[local171];
							this.anIntArray212[local55] -= Static422.anInt6874;
							this.anIntArray214[local55] -= Static108.anInt1826;
							this.anIntArray213[local55] -= Static390.anInt6474;
							if (arg4 != 0) {
								local61 = Class145_Sub1.anIntArray761[arg4];
								local292 = Class145_Sub1.anIntArray760[arg4];
								local310 = this.anIntArray212[local55] * local292 + local61 * this.anIntArray214[local55] + 16383 >> 14;
								this.anIntArray214[local55] = local292 * this.anIntArray214[local55] + 16383 - this.anIntArray212[local55] * local61 >> 14;
								this.anIntArray212[local55] = local310;
							}
							if (arg2 != 0) {
								local61 = Class145_Sub1.anIntArray761[arg2];
								local292 = Class145_Sub1.anIntArray760[arg2];
								local310 = this.anIntArray214[local55] * local292 + 16383 - this.anIntArray213[local55] * local61 >> 14;
								this.anIntArray213[local55] = local61 * this.anIntArray214[local55] + this.anIntArray213[local55] * local292 + 16383 >> 14;
								this.anIntArray214[local55] = local310;
							}
							if (arg3 != 0) {
								local61 = Class145_Sub1.anIntArray761[arg3];
								local292 = Class145_Sub1.anIntArray760[arg3];
								local310 = local292 * this.anIntArray212[local55] + this.anIntArray213[local55] * local61 + 16383 >> 14;
								this.anIntArray213[local55] = local292 * this.anIntArray213[local55] + 16383 - this.anIntArray212[local55] * local61 >> 14;
								this.anIntArray212[local55] = local310;
							}
							this.anIntArray212[local55] += Static422.anInt6874;
							this.anIntArray214[local55] += Static108.anInt1826;
							this.anIntArray213[local55] += Static390.anInt6474;
						}
					} else {
						for (local171 = 0; local171 < local169.length; local171++) {
							local55 = local169[local171];
							this.anIntArray212[local55] -= Static422.anInt6874;
							this.anIntArray214[local55] -= Static108.anInt1826;
							this.anIntArray213[local55] -= Static390.anInt6474;
							if (arg2 != 0) {
								local61 = Class145_Sub1.anIntArray761[arg2];
								local292 = Class145_Sub1.anIntArray760[arg2];
								local310 = local292 * this.anIntArray214[local55] + 16383 - local61 * this.anIntArray213[local55] >> 14;
								this.anIntArray213[local55] = local61 * this.anIntArray214[local55] + local292 * this.anIntArray213[local55] + 16383 >> 14;
								this.anIntArray214[local55] = local310;
							}
							if (arg4 != 0) {
								local61 = Class145_Sub1.anIntArray761[arg4];
								local292 = Class145_Sub1.anIntArray760[arg4];
								local310 = this.anIntArray212[local55] * local292 + local61 * this.anIntArray214[local55] + 16383 >> 14;
								this.anIntArray214[local55] = this.anIntArray214[local55] * local292 + 16383 - local61 * this.anIntArray212[local55] >> 14;
								this.anIntArray212[local55] = local310;
							}
							if (arg3 != 0) {
								local61 = Class145_Sub1.anIntArray761[arg3];
								local292 = Class145_Sub1.anIntArray760[arg3];
								local310 = local61 * this.anIntArray213[local55] + this.anIntArray212[local55] * local292 + 16383 >> 14;
								this.anIntArray213[local55] = local292 * this.anIntArray213[local55] + 16383 - local61 * this.anIntArray212[local55] >> 14;
								this.anIntArray212[local55] = local310;
							}
							this.anIntArray212[local55] += Static422.anInt6874;
							this.anIntArray214[local55] += Static108.anInt1826;
							this.anIntArray213[local55] += Static390.anInt6474;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (this.anIntArrayArray16.length > local43) {
						local53 = this.anIntArrayArray16[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local292 = this.anIntArray210[local61];
							local310 = this.anIntArray210[local61 + 1];
							for (local770 = local292; local770 < local310; local770++) {
								local779 = this.aShortArray67[local770] - 1;
								if (local779 == -1) {
									break;
								}
								@Pc(794) int local794;
								@Pc(798) int local798;
								@Pc(816) int local816;
								if (arg4 != 0) {
									local794 = Class145_Sub1.anIntArray761[arg4];
									local798 = Class145_Sub1.anIntArray760[arg4];
									local816 = this.aShortArray64[local779] * local798 + local794 * this.aShortArray66[local779] + 16383 >> 14;
									this.aShortArray66[local779] = (short) (this.aShortArray66[local779] * local798 + 16383 - this.aShortArray64[local779] * local794 >> 14);
									this.aShortArray64[local779] = (short) local816;
								}
								if (arg2 != 0) {
									local794 = Class145_Sub1.anIntArray761[arg2];
									local798 = Class145_Sub1.anIntArray760[arg2];
									local816 = this.aShortArray66[local779] * local798 + 16383 - this.aShortArray63[local779] * local794 >> 14;
									this.aShortArray63[local779] = (short) (local794 * this.aShortArray66[local779] + this.aShortArray63[local779] * local798 + 16383 >> 14);
									this.aShortArray66[local779] = (short) local816;
								}
								if (arg3 != 0) {
									local794 = Class145_Sub1.anIntArray761[arg3];
									local798 = Class145_Sub1.anIntArray760[arg3];
									local816 = local794 * this.aShortArray63[local779] + this.aShortArray64[local779] * local798 + 16383 >> 14;
									this.aShortArray63[local779] = (short) (this.aShortArray63[local779] * local798 + 16383 - local794 * this.aShortArray64[local779] >> 14);
									this.aShortArray64[local779] = (short) local816;
								}
							}
						}
					}
				}
				this.method2498();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray16.length > local35) {
					local169 = this.anIntArrayArray16[local35];
					for (local171 = 0; local171 < local169.length; local171++) {
						local55 = local169[local171];
						this.anIntArray212[local55] -= Static422.anInt6874;
						this.anIntArray214[local55] -= Static108.anInt1826;
						this.anIntArray213[local55] -= Static390.anInt6474;
						this.anIntArray212[local55] = this.anIntArray212[local55] * arg2 >> 7;
						this.anIntArray214[local55] = this.anIntArray214[local55] * arg3 >> 7;
						this.anIntArray213[local55] = this.anIntArray213[local55] * arg4 >> 7;
						this.anIntArray212[local55] += Static422.anInt6874;
						this.anIntArray214[local55] += Static108.anInt1826;
						this.anIntArray213[local55] += Static390.anInt6474;
					}
				}
			}
		} else {
			@Pc(1260) Class329 local1260;
			@Pc(1144) boolean local1144;
			@Pc(1255) Class40 local1255;
			if (arg0 == 5) {
				if (this.anIntArrayArray17 != null) {
					local1144 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray17.length > local43) {
							local53 = this.anIntArrayArray17[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local292 = (this.aByteArray33[local61] & 0xFF) + (arg2 * 8);
								if (local292 < 0) {
									local292 = 0;
								} else if (local292 > 255) {
									local292 = 255;
								}
								this.aByteArray33[local61] = (byte) local292;
							}
							local1144 |= local53.length > 0;
						}
					}
					if (local1144) {
						if (this.aClass40Array1 != null) {
							for (local43 = 0; local43 < this.anInt2860; local43++) {
								local1255 = this.aClass40Array1[local43];
								local1260 = this.aClass329Array1[local43];
								local1260.anInt8856 = local1260.anInt8856 & 0xFFFFFF | 255 - (this.aByteArray33[local1255.anInt860] & 0xFF) << 24;
							}
						}
						this.method2488();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray17 != null) {
					local1144 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray17.length > local43) {
							local53 = this.anIntArrayArray17[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local292 = this.aShortArray59[local61] & 0xFFFF;
								local310 = local292 >> 10 & 0x3F;
								local770 = local292 >> 7 & 0x7;
								@Pc(1360) int local1360 = arg2 + local310 & 0x3F;
								local770 += arg3 / 4;
								local779 = local292 & 0x7F;
								local779 += arg4;
								if (local770 < 0) {
									local770 = 0;
								} else if (local770 > 7) {
									local770 = 7;
								}
								if (local779 < 0) {
									local779 = 0;
								} else if (local779 > 127) {
									local779 = 127;
								}
								this.aShortArray59[local61] = (short) (local779 | local770 << 7 | local1360 << 10);
							}
							local1144 |= local53.length > 0;
						}
					}
					if (local1144) {
						if (this.aClass40Array1 != null) {
							for (local43 = 0; local43 < this.anInt2860; local43++) {
								local1255 = this.aClass40Array1[local43];
								local1260 = this.aClass329Array1[local43];
								local1260.anInt8856 = local1260.anInt8856 & 0xFF000000 | Static555.anIntArray633[this.aShortArray59[local1255.anInt860] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method2488();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray18 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray18.length) {
							local169 = this.anIntArrayArray18[local35];
							for (local171 = 0; local171 < local169.length; local171++) {
								local1260 = this.aClass329Array1[local169[local171]];
								local1260.anInt8858 += arg3;
								local1260.anInt8849 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray18 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray18.length) {
							local169 = this.anIntArrayArray18[local35];
							for (local171 = 0; local171 < local169.length; local171++) {
								local1260 = this.aClass329Array1[local169[local171]];
								local1260.anInt8857 = local1260.anInt8857 * arg3 >> 7;
								local1260.anInt8852 = arg2 * local1260.anInt8852 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray18 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray18.length > local35) {
						local169 = this.anIntArrayArray18[local35];
						for (local171 = 0; local171 < local169.length; local171++) {
							local1260 = this.aClass329Array1[local169[local171]];
							local1260.anInt8848 = local1260.anInt8848 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!gw;ZII)Z")
	@Override
	public boolean method5743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2494(arg4, arg5, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "(I)V")
	private void method2495() {
		if (!this.aBoolean281) {
			return;
		}
		this.aBoolean281 = false;
		if (this.aClass364Array2 == null && this.aClass363Array2 == null && this.aClass40Array1 == null && !Static72.method1101(this.anInt2797, this.anInt2862)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			if (this.anIntArray212 != null && !Static609.method8335(this.anInt2862, this.anInt2797)) {
				if (this.lb == null || this.lb.method3463()) {
					if (!this.aBoolean278) {
						this.method2493();
					}
					local37 = true;
				} else {
					this.aBoolean281 = true;
				}
			}
			if (this.anIntArray214 != null && !Static177.method2622(this.anInt2862, this.anInt2797)) {
				if (this.lb == null || this.lb.method3463()) {
					local39 = true;
					if (!this.aBoolean278) {
						this.method2493();
					}
				} else {
					this.aBoolean281 = true;
				}
			}
			if (this.anIntArray213 != null && !Static627.method8474(this.anInt2797, this.anInt2862)) {
				if (this.lb == null || this.lb.method3463()) {
					local41 = true;
					if (!this.aBoolean278) {
						this.method2493();
					}
				} else {
					this.aBoolean281 = true;
				}
			}
			if (local39) {
				this.anIntArray214 = null;
			}
			if (local41) {
				this.anIntArray213 = null;
			}
			if (local37) {
				this.anIntArray212 = null;
			}
		}
		if (this.aShortArray67 != null && this.anIntArray212 == null && this.anIntArray214 == null && this.anIntArray213 == null) {
			this.aShortArray67 = null;
			this.anIntArray210 = null;
		}
		if (this.aByteArray34 != null && !Static475.method6830(this.anInt2862, this.anInt2797)) {
			label203: {
				label202: {
					@Pc(252) boolean local252;
					if ((this.anInt2797 & 0x37) == 0) {
						if (this.aClass164_1 == null || this.aClass164_1.method3463()) {
							break label202;
						}
						local252 = false;
					} else {
						if (this.aClass164_3 == null || this.aClass164_3.method3463()) {
							break label202;
						}
						local252 = false;
					}
					if (!local252) {
						this.aBoolean281 = true;
						break label203;
					}
				}
				this.aByteArray34 = null;
				this.aShortArray64 = this.aShortArray66 = this.aShortArray63 = null;
			}
		}
		if (this.aShortArray59 != null && !Static658.method7507(this.anInt2862, this.anInt2797)) {
			if (this.aClass164_1 == null || this.aClass164_1.method3463()) {
				this.aShortArray59 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.aByteArray33 != null && !Static389.method5819(this.anInt2797, this.anInt2862)) {
			if (this.aClass164_1 == null || this.aClass164_1.method3463()) {
				this.aByteArray33 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.aFloatArray19 != null && !Static161.method2380(this.anInt2862, this.anInt2797)) {
			if (this.aClass164_2 == null || this.aClass164_2.method3463()) {
				this.aFloatArray19 = this.aFloatArray20 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.aShortArray58 != null && !Static396.method5851(this.anInt2862, this.anInt2797)) {
			if (this.aClass164_1 == null || this.aClass164_1.method3463()) {
				this.aShortArray58 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.aShortArray62 != null && !Static311.method4346(this.anInt2797, this.anInt2862)) {
			if ((this.aClass357_1 == null || this.aClass357_1.method8405()) && (this.aClass164_1 == null || this.aClass164_1.method3463())) {
				this.aShortArray62 = this.aShortArray68 = this.aShortArray56 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.aShortArray65 != null) {
			if (this.lb == null || this.lb.method3463()) {
				this.aShortArray65 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.aShortArray60 != null) {
			if (this.aClass164_1 == null || this.aClass164_1.method3463()) {
				this.aShortArray60 = null;
			} else {
				this.aBoolean281 = true;
			}
		}
		if (this.anIntArrayArray17 != null && !Static392.method5837(this.anInt2862, this.anInt2797)) {
			this.anIntArrayArray17 = null;
			this.aShortArray57 = null;
		}
		if (this.anIntArrayArray16 != null && !Static15.method240(this.anInt2862, this.anInt2797)) {
			this.anIntArrayArray16 = null;
			this.aShortArray61 = null;
		}
		if (this.anIntArrayArray18 != null && !Static81.method1219(this.anInt2862, this.anInt2797)) {
			this.anIntArrayArray18 = null;
		}
		if (this.anIntArray209 != null && (this.anInt2862 & 0x800) == 0 && (this.anInt2862 & 0x40000) == 0) {
			this.anIntArray208 = null;
			this.anIntArray209 = null;
			this.anIntArray211 = null;
		}
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(I)V")
	private void method2496() {
		if (this.lb != null) {
			this.lb.aBoolean344 = false;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IZIZLclient!fca;Lclient!fca;)Lclient!ka;")
	private Class45 method2497(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class45_Sub2 arg3, @OriginalArg(5) Class45_Sub2 arg4) {
		arg3.anInt2864 = this.anInt2864;
		arg3.anInt2855 = this.anInt2855;
		arg3.anInt2862 = arg0;
		arg3.anInt2797 = this.anInt2797;
		arg3.aShort50 = this.aShort50;
		arg3.anInt2824 = this.anInt2824;
		arg3.anInt2863 = this.anInt2863;
		if ((arg0 & 0x100) == 0) {
			arg3.aBoolean279 = this.aBoolean279;
		} else {
			arg3.aBoolean279 = true;
		}
		arg3.aBoolean282 = this.aBoolean282;
		arg3.aShort49 = this.aShort49;
		arg3.anInt2860 = this.anInt2860;
		arg3.anInt2815 = this.anInt2815;
		@Pc(73) boolean local73 = Static158.method8587(arg0, this.anInt2797);
		@Pc(81) boolean local81 = Static172.method2596(arg0, this.anInt2797);
		@Pc(87) boolean local87 = Static327.method8981(arg0, this.anInt2797);
		@Pc(93) boolean local93 = local73 | local81 | local87;
		@Pc(222) int local222;
		if (local93) {
			if (!local73) {
				arg3.anIntArray212 = this.anIntArray212;
			} else if (arg4.anIntArray212 == null || this.anInt2855 > arg4.anIntArray212.length) {
				arg3.anIntArray212 = arg4.anIntArray212 = new int[this.anInt2855];
			} else {
				arg3.anIntArray212 = arg4.anIntArray212;
			}
			if (!local81) {
				arg3.anIntArray214 = this.anIntArray214;
			} else if (arg4.anIntArray214 == null || arg4.anIntArray214.length < this.anInt2855) {
				arg3.anIntArray214 = arg4.anIntArray214 = new int[this.anInt2855];
			} else {
				arg3.anIntArray214 = arg4.anIntArray214;
			}
			if (!local87) {
				arg3.anIntArray213 = this.anIntArray213;
			} else if (arg4.anIntArray213 == null || this.anInt2855 > arg4.anIntArray213.length) {
				arg3.anIntArray213 = arg4.anIntArray213 = new int[this.anInt2855];
			} else {
				arg3.anIntArray213 = arg4.anIntArray213;
			}
			for (local222 = 0; local222 < this.anInt2855; local222++) {
				if (local73) {
					arg3.anIntArray212[local222] = this.anIntArray212[local222];
				}
				if (local81) {
					arg3.anIntArray214[local222] = this.anIntArray214[local222];
				}
				if (local87) {
					arg3.anIntArray213[local222] = this.anIntArray213[local222];
				}
			}
		} else {
			arg3.anIntArray212 = this.anIntArray212;
			arg3.anIntArray213 = this.anIntArray213;
			arg3.anIntArray214 = this.anIntArray214;
		}
		if (Static435.method6316(this.anInt2797, arg0)) {
			arg3.lb = arg4.lb;
			arg3.lb.aBoolean344 = this.lb.aBoolean344;
			arg3.lb.aBoolean345 = true;
			arg3.lb.anInterface24_4 = this.lb.anInterface24_4;
		} else if (Static645.method8740(this.anInt2797, arg0)) {
			arg3.lb = this.lb;
		} else {
			arg3.lb = null;
		}
		if (Static71.method4092(this.anInt2797, arg0)) {
			if (arg4.aShortArray59 == null || arg4.aShortArray59.length < this.anInt2864) {
				arg3.aShortArray59 = arg4.aShortArray59 = new short[this.anInt2864];
			} else {
				arg3.aShortArray59 = arg4.aShortArray59;
			}
			for (local222 = 0; local222 < this.anInt2864; local222++) {
				arg3.aShortArray59[local222] = this.aShortArray59[local222];
			}
		} else {
			arg3.aShortArray59 = this.aShortArray59;
		}
		if (Static267.method3771(arg0, this.anInt2797)) {
			if (arg4.aByteArray33 == null || this.anInt2864 > arg4.aByteArray33.length) {
				arg3.aByteArray33 = arg4.aByteArray33 = new byte[this.anInt2864];
			} else {
				arg3.aByteArray33 = arg4.aByteArray33;
			}
			for (local222 = 0; local222 < this.anInt2864; local222++) {
				arg3.aByteArray33[local222] = this.aByteArray33[local222];
			}
		} else {
			arg3.aByteArray33 = this.aByteArray33;
		}
		if (Static13.method212(arg0, this.anInt2797)) {
			arg3.aClass164_1 = arg4.aClass164_1;
			arg3.aClass164_1.aBoolean344 = this.aClass164_1.aBoolean344;
			arg3.aClass164_1.aBoolean345 = true;
			arg3.aClass164_1.anInterface24_4 = this.aClass164_1.anInterface24_4;
		} else if (Static135.method1980(arg0, this.anInt2797)) {
			arg3.aClass164_1 = this.aClass164_1;
		} else {
			arg3.aClass164_1 = null;
		}
		@Pc(655) int local655;
		if (Static561.method7806(arg0, this.anInt2797)) {
			if (arg4.aShortArray64 == null || this.anInt2824 > arg4.aShortArray64.length) {
				local222 = this.anInt2824;
				arg3.aShortArray63 = arg4.aShortArray63 = new short[local222];
				arg3.aShortArray64 = arg4.aShortArray64 = new short[local222];
				arg3.aShortArray66 = arg4.aShortArray66 = new short[local222];
			} else {
				arg3.aShortArray63 = arg4.aShortArray63;
				arg3.aShortArray66 = arg4.aShortArray66;
				arg3.aShortArray64 = arg4.aShortArray64;
			}
			if (this.aClass39_1 == null) {
				arg3.aClass39_1 = null;
				for (local222 = 0; local222 < this.anInt2824; local222++) {
					arg3.aShortArray64[local222] = this.aShortArray64[local222];
					arg3.aShortArray66[local222] = this.aShortArray66[local222];
					arg3.aShortArray63[local222] = this.aShortArray63[local222];
				}
			} else {
				if (arg4.aClass39_1 == null) {
					arg4.aClass39_1 = new Class39();
				}
				@Pc(637) Class39 local637 = arg3.aClass39_1 = arg4.aClass39_1;
				if (local637.aShortArray2 == null || local637.aShortArray2.length < this.anInt2824) {
					local655 = this.anInt2824;
					local637.aShortArray3 = new short[local655];
					local637.aShortArray1 = new short[local655];
					local637.aByteArray5 = new byte[local655];
					local637.aShortArray2 = new short[local655];
				}
				for (local655 = 0; local655 < this.anInt2824; local655++) {
					arg3.aShortArray64[local655] = this.aShortArray64[local655];
					arg3.aShortArray66[local655] = this.aShortArray66[local655];
					arg3.aShortArray63[local655] = this.aShortArray63[local655];
					local637.aShortArray2[local655] = this.aClass39_1.aShortArray2[local655];
					local637.aShortArray1[local655] = this.aClass39_1.aShortArray1[local655];
					local637.aShortArray3[local655] = this.aClass39_1.aShortArray3[local655];
					local637.aByteArray5[local655] = this.aClass39_1.aByteArray5[local655];
				}
			}
			arg3.aByteArray34 = this.aByteArray34;
		} else {
			arg3.aShortArray66 = this.aShortArray66;
			arg3.aByteArray34 = this.aByteArray34;
			arg3.aClass39_1 = this.aClass39_1;
			arg3.aShortArray63 = this.aShortArray63;
			arg3.aShortArray64 = this.aShortArray64;
		}
		if (Static170.method2539(this.anInt2797, arg0)) {
			arg3.aClass164_3 = arg4.aClass164_3;
			arg3.aClass164_3.aBoolean344 = this.aClass164_3.aBoolean344;
			arg3.aClass164_3.aBoolean345 = true;
			arg3.aClass164_3.anInterface24_4 = this.aClass164_3.anInterface24_4;
		} else if (Static62.method942(this.anInt2797, arg0)) {
			arg3.aClass164_3 = this.aClass164_3;
		} else {
			arg3.aClass164_3 = null;
		}
		if (Static154.method2199(arg0, this.anInt2797)) {
			if (arg4.aFloatArray19 == null || this.anInt2864 > arg4.aFloatArray19.length) {
				local222 = this.anInt2824;
				arg3.aFloatArray19 = arg4.aFloatArray19 = new float[local222];
				arg3.aFloatArray20 = arg4.aFloatArray20 = new float[local222];
			} else {
				arg3.aFloatArray19 = arg4.aFloatArray19;
				arg3.aFloatArray20 = arg4.aFloatArray20;
			}
			for (local222 = 0; local222 < this.anInt2824; local222++) {
				arg3.aFloatArray19[local222] = this.aFloatArray19[local222];
				arg3.aFloatArray20[local222] = this.aFloatArray20[local222];
			}
		} else {
			arg3.aFloatArray19 = this.aFloatArray19;
			arg3.aFloatArray20 = this.aFloatArray20;
		}
		if (Static207.method2929(arg0, this.anInt2797)) {
			arg3.aClass164_2 = arg4.aClass164_2;
			arg3.aClass164_2.aBoolean344 = this.aClass164_2.aBoolean344;
			arg3.aClass164_2.anInterface24_4 = this.aClass164_2.anInterface24_4;
			arg3.aClass164_2.aBoolean345 = true;
		} else if (Static239.method3386(arg0, this.anInt2797)) {
			arg3.aClass164_2 = this.aClass164_2;
		} else {
			arg3.aClass164_2 = null;
		}
		if (Static302.method4222(this.anInt2797, arg0)) {
			if (arg4.aShortArray62 == null || this.anInt2864 > arg4.aShortArray62.length) {
				local222 = this.anInt2864;
				arg3.aShortArray56 = arg4.aShortArray56 = new short[local222];
				arg3.aShortArray62 = arg4.aShortArray62 = new short[local222];
				arg3.aShortArray68 = arg4.aShortArray68 = new short[local222];
			} else {
				arg3.aShortArray68 = arg4.aShortArray68;
				arg3.aShortArray56 = arg4.aShortArray56;
				arg3.aShortArray62 = arg4.aShortArray62;
			}
			for (local222 = 0; local222 < this.anInt2864; local222++) {
				arg3.aShortArray62[local222] = this.aShortArray62[local222];
				arg3.aShortArray68[local222] = this.aShortArray68[local222];
				arg3.aShortArray56[local222] = this.aShortArray56[local222];
			}
		} else {
			arg3.aShortArray68 = this.aShortArray68;
			arg3.aShortArray56 = this.aShortArray56;
			arg3.aShortArray62 = this.aShortArray62;
		}
		if (Static299.method4195(this.anInt2797, arg0)) {
			arg3.aClass357_1 = arg4.aClass357_1;
			arg3.aClass357_1.aBoolean816 = this.aClass357_1.aBoolean816;
			arg3.aClass357_1.anInterface15_5 = this.aClass357_1.anInterface15_5;
			arg3.aClass357_1.aBoolean817 = true;
		} else if (Static507.method7185(this.anInt2797, arg0)) {
			arg3.aClass357_1 = this.aClass357_1;
		} else {
			arg3.aClass357_1 = null;
		}
		if (Static494.method7076(arg0, this.anInt2797)) {
			if (arg4.aShortArray58 == null || this.anInt2864 > arg4.aShortArray58.length) {
				local222 = this.anInt2864;
				arg3.aShortArray58 = arg4.aShortArray58 = new short[local222];
			} else {
				arg3.aShortArray58 = arg4.aShortArray58;
			}
			for (local222 = 0; local222 < this.anInt2864; local222++) {
				arg3.aShortArray58[local222] = this.aShortArray58[local222];
			}
		} else {
			arg3.aShortArray58 = this.aShortArray58;
		}
		if (!Static438.method6363(arg0, this.anInt2797)) {
			arg3.aClass329Array1 = this.aClass329Array1;
		} else if (arg4.aClass329Array1 == null || this.anInt2860 > arg4.aClass329Array1.length) {
			local222 = this.anInt2860;
			arg3.aClass329Array1 = arg4.aClass329Array1 = new Class329[local222];
			for (local655 = 0; local655 < this.anInt2860; local655++) {
				arg3.aClass329Array1[local655] = this.aClass329Array1[local655].method7828();
			}
		} else {
			arg3.aClass329Array1 = arg4.aClass329Array1;
			for (local222 = 0; local222 < this.anInt2860; local222++) {
				arg3.aClass329Array1[local222].method7827(this.aClass329Array1[local222]);
			}
		}
		arg3.aClass364Array2 = this.aClass364Array2;
		arg3.aClass363Array2 = this.aClass363Array2;
		arg3.anIntArrayArray18 = this.anIntArrayArray18;
		arg3.aShortArray61 = this.aShortArray61;
		arg3.anIntArray210 = this.anIntArray210;
		arg3.anIntArray209 = this.anIntArray209;
		arg3.aShortArray57 = this.aShortArray57;
		if (this.aBoolean278) {
			arg3.anInt2812 = this.anInt2812;
			arg3.anInt2871 = this.anInt2871;
			arg3.anInt2804 = this.anInt2804;
			arg3.anInt2833 = this.anInt2833;
			arg3.anInt2820 = this.anInt2820;
			arg3.aBoolean278 = true;
			arg3.anInt2847 = this.anInt2847;
			arg3.anInt2841 = this.anInt2841;
			arg3.anInt2807 = this.anInt2807;
		} else {
			arg3.aBoolean278 = false;
		}
		arg3.anIntArrayArray16 = this.anIntArrayArray16;
		arg3.aShortArray67 = this.aShortArray67;
		arg3.anIntArray208 = this.anIntArray208;
		arg3.aShortArray65 = this.aShortArray65;
		arg3.anIntArray211 = this.anIntArray211;
		arg3.aShortArray60 = this.aShortArray60;
		arg3.aClass40Array1 = this.aClass40Array1;
		arg3.anIntArrayArray17 = this.anIntArrayArray17;
		return arg3;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(I)V")
	private void method2498() {
		if ((this.anInt2797 & 0x37) == 0) {
			if (this.aClass164_1 != null) {
				this.aClass164_1.aBoolean344 = false;
			}
		} else if (this.aClass164_3 != null) {
			this.aClass164_3.aBoolean344 = false;
		}
	}

	@OriginalMember(owner = "client!fca", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort49 = (short) arg0;
		this.method2488();
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "()[Lclient!uc;")
	@Override
	public Class363[] method5745() {
		return this.aClass363Array2;
	}

	@OriginalMember(owner = "client!fca", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray16 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt2855; local13++) {
			this.anIntArray212[local13] <<= 0x4;
			this.anIntArray214[local13] <<= 0x4;
			this.anIntArray213[local13] <<= 0x4;
		}
		Static108.anInt1826 = 0;
		Static390.anInt6474 = 0;
		Static422.anInt6874 = 0;
		return true;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method5750(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class86_Sub2 local8 = (Class86_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass364Array2 != null) {
			for (local13 = 0; local13 < this.aClass364Array2.length; local13++) {
				@Pc(20) Class364 local20 = this.aClass364Array2[local13];
				@Pc(22) Class364 local22 = local20;
				if (local20.aClass364_1 != null) {
					local22 = local20.aClass364_1;
				}
				local22.anInt9825 = (int) (local8.aFloat32 * (float) this.anIntArray213[local20.anInt9816] + (float) this.anIntArray214[local20.anInt9816] * local8.aFloat36 + (float) this.anIntArray212[local20.anInt9816] * local8.aFloat33 + local8.aFloat31);
				local22.anInt9819 = (int) (local8.aFloat34 * (float) this.anIntArray214[local20.anInt9816] + local8.aFloat40 * (float) this.anIntArray212[local20.anInt9816] + local8.aFloat35 * (float) this.anIntArray213[local20.anInt9816] + local8.aFloat41);
				local22.anInt9826 = (int) (local8.aFloat38 + local8.aFloat37 * (float) this.anIntArray213[local20.anInt9816] + local8.aFloat30 * (float) this.anIntArray212[local20.anInt9816] + local8.aFloat39 * (float) this.anIntArray214[local20.anInt9816]);
				local22.anInt9820 = (int) (local8.aFloat31 + (float) this.anIntArray213[local20.anInt9818] * local8.aFloat32 + local8.aFloat36 * (float) this.anIntArray214[local20.anInt9818] + local8.aFloat33 * (float) this.anIntArray212[local20.anInt9818]);
				local22.anInt9832 = (int) (local8.aFloat34 * (float) this.anIntArray214[local20.anInt9818] + local8.aFloat40 * (float) this.anIntArray212[local20.anInt9818] + (float) this.anIntArray213[local20.anInt9818] * local8.aFloat35 + local8.aFloat41);
				local22.anInt9821 = (int) (local8.aFloat39 * (float) this.anIntArray214[local20.anInt9818] + (float) this.anIntArray212[local20.anInt9818] * local8.aFloat30 + local8.aFloat37 * (float) this.anIntArray213[local20.anInt9818] + local8.aFloat38);
				local22.anInt9827 = (int) (local8.aFloat31 + local8.aFloat36 * (float) this.anIntArray214[local20.anInt9822] + local8.aFloat33 * (float) this.anIntArray212[local20.anInt9822] + local8.aFloat32 * (float) this.anIntArray213[local20.anInt9822]);
				local22.anInt9831 = (int) (local8.aFloat41 + local8.aFloat35 * (float) this.anIntArray213[local20.anInt9822] + local8.aFloat34 * (float) this.anIntArray214[local20.anInt9822] + local8.aFloat40 * (float) this.anIntArray212[local20.anInt9822]);
				local22.anInt9830 = (int) (local8.aFloat37 * (float) this.anIntArray213[local20.anInt9822] + (float) this.anIntArray212[local20.anInt9822] * local8.aFloat30 + local8.aFloat39 * (float) this.anIntArray214[local20.anInt9822] + local8.aFloat38);
			}
		}
		if (this.aClass363Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass363Array2.length; local13++) {
			@Pc(367) Class363 local367 = this.aClass363Array2[local13];
			@Pc(369) Class363 local369 = local367;
			if (local367.aClass363_2 != null) {
				local369 = local367.aClass363_2;
			}
			if (local367.aClass86_10 == null) {
				local367.aClass86_10 = local8.method7018();
			} else {
				local367.aClass86_10.method7032(local8);
			}
			local369.anInt9786 = (int) (local8.aFloat31 + (float) this.anIntArray212[local367.anInt9789] * local8.aFloat33 + (float) this.anIntArray214[local367.anInt9789] * local8.aFloat36 + (float) this.anIntArray213[local367.anInt9789] * local8.aFloat32);
			local369.anInt9783 = (int) (local8.aFloat41 + local8.aFloat34 * (float) this.anIntArray214[local367.anInt9789] + (float) this.anIntArray212[local367.anInt9789] * local8.aFloat40 + local8.aFloat35 * (float) this.anIntArray213[local367.anInt9789]);
			local369.anInt9787 = (int) (local8.aFloat38 + local8.aFloat39 * (float) this.anIntArray214[local367.anInt9789] + (float) this.anIntArray212[local367.anInt9789] * local8.aFloat30 + local8.aFloat37 * (float) this.anIntArray213[local367.anInt9789]);
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!ko;)V")
	private void method2499(@OriginalArg(1) Class2_Sub6_Sub9_Sub2 arg0) {
		if (Static499.anIntArray570.length < this.anInt2824) {
			Static277.anIntArray315 = new int[this.anInt2824];
			Static499.anIntArray570 = new int[this.anInt2824];
		}
		@Pc(50) int local50;
		@Pc(88) int local88;
		@Pc(97) int local97;
		for (@Pc(22) int local22 = 0; local22 < this.anInt2815; local22++) {
			local50 = (this.anIntArray212[local22] - (this.anIntArray214[local22] * this.aClass145_Sub1_9.anInt11251 >> 8) >> this.aClass145_Sub1_9.anInt11265) - arg0.anInt5298;
			@Pc(74) int local74 = (this.anIntArray213[local22] - (this.anIntArray214[local22] * this.aClass145_Sub1_9.anInt11275 >> 8) >> this.aClass145_Sub1_9.anInt11265) - arg0.anInt5303;
			@Pc(79) int local79 = this.anIntArray210[local22];
			@Pc(86) int local86 = this.anIntArray210[local22 + 1];
			for (local88 = local79; local88 < local86; local88++) {
				local97 = this.aShortArray67[local88] - 1;
				if (local97 == -1) {
					break;
				}
				Static499.anIntArray570[local97] = local50;
				Static277.anIntArray315[local97] = local74;
			}
		}
		if (20121 != 20121) {
			this.anIntArray209 = null;
		}
		for (local50 = 0; local50 < this.anInt2863; local50++) {
			if (this.aByteArray33 == null || this.aByteArray33[local50] <= 128) {
				@Pc(155) short local155 = this.aShortArray62[local50];
				@Pc(160) short local160 = this.aShortArray68[local50];
				@Pc(165) short local165 = this.aShortArray56[local50];
				local88 = Static499.anIntArray570[local155];
				local97 = Static499.anIntArray570[local160];
				@Pc(177) int local177 = Static499.anIntArray570[local165];
				@Pc(181) int local181 = Static277.anIntArray315[local155];
				@Pc(185) int local185 = Static277.anIntArray315[local160];
				@Pc(189) int local189 = Static277.anIntArray315[local165];
				if (-((local185 - local181) * (local177 - local97)) + (local88 - local97) * (local185 - local189) > 0) {
					arg0.method4761(local88, local177, local181, local185, local189, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass145_Sub1_9.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt2864; local11++) {
			if (this.aShortArray58[local11] == arg0) {
				this.aShortArray58[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(54) Class8 local54 = local9.method2857(arg0 & 0xFFFF);
			local41 = local54.aByte12;
			local39 = local54.aByte13;
		}
		@Pc(62) byte local62 = 0;
		@Pc(64) byte local64 = 0;
		if (arg1 != -1) {
			@Pc(74) Class8 local74 = local9.method2857(arg1 & 0xFFFF);
			local62 = local74.aByte13;
			local64 = local74.aByte12;
			if (local74.aByte16 != 0 || local74.aByte14 != 0) {
				this.aBoolean282 = true;
			}
		}
		if (!(local41 != local64 | local62 != local39)) {
			return;
		}
		if (this.aClass40Array1 != null) {
			for (@Pc(127) int local127 = 0; local127 < this.anInt2860; local127++) {
				@Pc(134) Class40 local134 = this.aClass40Array1[local127];
				@Pc(139) Class329 local139 = this.aClass329Array1[local127];
				local139.anInt8856 = Static555.anIntArray633[this.aShortArray59[local134.anInt860] & 0xFFFF] & 0xFFFFFF | local139.anInt8856 & 0xFF000000;
			}
		}
		this.method2488();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!gw;Lclient!fa;II)V")
	@Override
	public void method5759(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt2824 == 0) {
			return;
		}
		@Pc(17) Class86_Sub2 local17 = this.aClass145_Sub1_9.aClass86_Sub2_16;
		if (!this.aBoolean278) {
			this.method2493();
		}
		@Pc(28) Class86_Sub2 local28 = (Class86_Sub2) arg0;
		Static259.aFloat49 = local17.aFloat38 + local17.aFloat30 * local28.aFloat31 + local17.aFloat39 * local28.aFloat41 + local17.aFloat37 * local28.aFloat38;
		Static330.aFloat70 = local28.aFloat34 * local17.aFloat39 + local17.aFloat30 * local28.aFloat36 + local17.aFloat37 * local28.aFloat39;
		@Pc(75) float local75 = Static259.aFloat49 + (float) this.anInt2807 * Static330.aFloat70;
		@Pc(83) float local83 = (float) this.anInt2812 * Static330.aFloat70 + Static259.aFloat49;
		@Pc(100) float local100;
		@Pc(93) float local93;
		if (local83 < local75) {
			local93 = (float) this.anInt2820 + local75;
			local100 = (float) -this.anInt2820 + local83;
		} else {
			local93 = (float) this.anInt2820 + local83;
			local100 = (float) -this.anInt2820 + local75;
		}
		if (this.aClass145_Sub1_9.aFloat189 <= local100 || (float) this.aClass145_Sub1_9.anInt11250 >= local93) {
			return;
		}
		Static418.aFloat113 = local28.aFloat39 * local17.aFloat32 + local28.aFloat36 * local17.aFloat33 + local17.aFloat36 * local28.aFloat34;
		Static248.aFloat48 = local17.aFloat31 + local28.aFloat31 * local17.aFloat33 + local17.aFloat36 * local28.aFloat41 + local17.aFloat32 * local28.aFloat38;
		@Pc(179) float local179 = Static248.aFloat48 + Static418.aFloat113 * (float) this.anInt2807;
		@Pc(187) float local187 = (float) this.anInt2812 * Static418.aFloat113 + Static248.aFloat48;
		@Pc(202) float local202;
		@Pc(213) float local213;
		if (local187 < local179) {
			local202 = (float) this.aClass145_Sub1_9.anInt11241 * (local187 - (float) this.anInt2820);
			local213 = (float) this.aClass145_Sub1_9.anInt11241 * (local179 + (float) this.anInt2820);
		} else {
			local202 = (local179 - (float) this.anInt2820) * (float) this.aClass145_Sub1_9.anInt11241;
			local213 = (float) this.aClass145_Sub1_9.anInt11241 * ((float) this.anInt2820 + local187);
		}
		if (local202 / (float) arg2 >= this.aClass145_Sub1_9.aFloat193 || local213 / (float) arg2 <= this.aClass145_Sub1_9.aFloat186) {
			return;
		}
		Static611.aFloat150 = local28.aFloat38 * local17.aFloat35 + local17.aFloat34 * local28.aFloat41 + local28.aFloat31 * local17.aFloat40 + local17.aFloat41;
		Static718.aFloat178 = local17.aFloat35 * local28.aFloat39 + local28.aFloat34 * local17.aFloat34 + local28.aFloat36 * local17.aFloat40;
		@Pc(306) float local306 = Static611.aFloat150 + (float) this.anInt2807 * Static718.aFloat178;
		@Pc(314) float local314 = Static611.aFloat150 + Static718.aFloat178 * (float) this.anInt2812;
		@Pc(330) float local330;
		@Pc(341) float local341;
		if (local306 > local314) {
			local330 = (local314 - (float) this.anInt2820) * (float) this.aClass145_Sub1_9.anInt11245;
			local341 = ((float) this.anInt2820 + local306) * (float) this.aClass145_Sub1_9.anInt11245;
		} else {
			local330 = (float) this.aClass145_Sub1_9.anInt11245 * ((float) -this.anInt2820 + local306);
			local341 = (float) this.aClass145_Sub1_9.anInt11245 * ((float) this.anInt2820 + local314);
		}
		if (local330 / (float) arg2 >= this.aClass145_Sub1_9.aFloat182 || local341 / (float) arg2 <= this.aClass145_Sub1_9.aFloat187) {
			return;
		}
		if (arg1 != null || this.aClass40Array1 != null) {
			Static677.aFloat174 = local28.aFloat37 * local17.aFloat37 + local17.aFloat39 * local28.aFloat35 + local17.aFloat30 * local28.aFloat32;
			Static404.aFloat112 = local17.aFloat32 * local28.aFloat30 + local17.aFloat33 * local28.aFloat33 + local28.aFloat40 * local17.aFloat36;
			Static457.aFloat125 = local28.aFloat37 * local17.aFloat35 + local28.aFloat32 * local17.aFloat40 + local28.aFloat35 * local17.aFloat34;
			Static139.aFloat25 = local17.aFloat37 * local28.aFloat30 + local17.aFloat39 * local28.aFloat40 + local17.aFloat30 * local28.aFloat33;
			Static629.aFloat152 = local17.aFloat34 * local28.aFloat40 + local28.aFloat33 * local17.aFloat40 + local17.aFloat35 * local28.aFloat30;
			Static535.aFloat142 = local17.aFloat33 * local28.aFloat32 + local28.aFloat35 * local17.aFloat36 + local28.aFloat37 * local17.aFloat32;
		}
		if (arg1 != null) {
			@Pc(514) int local514 = this.anInt2871 + this.anInt2833 >> 1;
			@Pc(522) int local522 = this.anInt2804 + this.anInt2847 >> 1;
			@Pc(541) int local541 = (int) (Static535.aFloat142 * (float) local522 + Static248.aFloat48 + Static404.aFloat112 * (float) local514 + (float) this.anInt2807 * Static418.aFloat113);
			@Pc(560) int local560 = (int) ((float) local522 * Static457.aFloat125 + (float) this.anInt2807 * Static718.aFloat178 + Static611.aFloat150 + (float) local514 * Static629.aFloat152);
			@Pc(579) int local579 = (int) (Static677.aFloat174 * (float) local522 + Static139.aFloat25 * (float) local514 + Static259.aFloat49 + (float) this.anInt2807 * Static330.aFloat70);
			@Pc(598) int local598 = (int) ((float) local522 * Static535.aFloat142 + (float) local514 * Static404.aFloat112 + Static248.aFloat48 + Static418.aFloat113 * (float) this.anInt2812);
			@Pc(617) int local617 = (int) ((float) local522 * Static457.aFloat125 + Static629.aFloat152 * (float) local514 + Static611.aFloat150 + Static718.aFloat178 * (float) this.anInt2812);
			arg1.anInt2726 = this.aClass145_Sub1_9.anInt11273 + local617 * this.aClass145_Sub1_9.anInt11245 / arg2;
			arg1.anInt2725 = this.aClass145_Sub1_9.anInt11273 + this.aClass145_Sub1_9.anInt11245 * local560 / arg2;
			@Pc(662) int local662 = (int) (Static259.aFloat49 + (float) local514 * Static139.aFloat25 + (float) this.anInt2812 * Static330.aFloat70 + Static677.aFloat174 * (float) local522);
			arg1.anInt2722 = this.aClass145_Sub1_9.anInt11241 * local598 / arg2 + this.aClass145_Sub1_9.anInt11246;
			arg1.anInt2724 = local541 * this.aClass145_Sub1_9.anInt11241 / arg2 + this.aClass145_Sub1_9.anInt11246;
			if (local579 >= this.aClass145_Sub1_9.anInt11250 || this.aClass145_Sub1_9.anInt11250 <= local662) {
				arg1.aBoolean269 = true;
				arg1.anInt2723 = (this.anInt2820 + local541) * this.aClass145_Sub1_9.anInt11241 / arg2 + this.aClass145_Sub1_9.anInt11246 - arg1.anInt2724;
			}
		}
		this.aClass145_Sub1_9.method9777((float) arg2);
		this.aClass145_Sub1_9.method9792();
		this.aClass145_Sub1_9.method9743(local28);
		this.method2502();
		this.method2489();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5760(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class45_Sub2 local8 = (Class45_Sub2) arg0;
		if (this.anInt2864 == 0 || local8.anInt2864 == 0) {
			return;
		}
		@Pc(27) int local27 = local8.anInt2815;
		@Pc(30) int[] local30 = local8.anIntArray212;
		@Pc(33) int[] local33 = local8.anIntArray214;
		@Pc(36) int[] local36 = local8.anIntArray213;
		@Pc(39) short[] local39 = local8.aShortArray64;
		@Pc(42) short[] local42 = local8.aShortArray66;
		@Pc(45) short[] local45 = local8.aShortArray63;
		@Pc(48) byte[] local48 = local8.aByteArray34;
		@Pc(67) short[] local67;
		@Pc(63) short[] local63;
		@Pc(55) short[] local55;
		@Pc(59) byte[] local59;
		if (this.aClass39_1 == null) {
			local67 = null;
			local59 = null;
			local55 = null;
			local63 = null;
		} else {
			local55 = this.aClass39_1.aShortArray3;
			local59 = this.aClass39_1.aByteArray5;
			local63 = this.aClass39_1.aShortArray1;
			local67 = this.aClass39_1.aShortArray2;
		}
		@Pc(88) short[] local88;
		@Pc(84) short[] local84;
		@Pc(82) short[] local82;
		@Pc(86) byte[] local86;
		if (local8.aClass39_1 == null) {
			local82 = null;
			local84 = null;
			local86 = null;
			local88 = null;
		} else {
			local82 = local8.aClass39_1.aShortArray3;
			local84 = local8.aClass39_1.aShortArray1;
			local88 = local8.aClass39_1.aShortArray2;
			local86 = local8.aClass39_1.aByteArray5;
		}
		@Pc(109) int[] local109 = local8.anIntArray210;
		@Pc(112) short[] local112 = local8.aShortArray67;
		if (!local8.aBoolean278) {
			local8.method2493();
		}
		@Pc(123) int local123 = local8.anInt2807;
		@Pc(126) int local126 = local8.anInt2812;
		@Pc(129) int local129 = local8.anInt2833;
		@Pc(132) int local132 = local8.anInt2871;
		@Pc(135) int local135 = local8.anInt2804;
		@Pc(138) int local138 = local8.anInt2847;
		for (@Pc(140) int local140 = 0; local140 < this.anInt2815; local140++) {
			@Pc(150) int local150 = this.anIntArray214[local140] - arg2;
			if (local150 >= local123 && local126 >= local150) {
				@Pc(169) int local169 = this.anIntArray212[local140] - arg1;
				if (local129 <= local169 && local169 <= local132) {
					@Pc(192) int local192 = this.anIntArray213[local140] - arg3;
					if (local192 >= local135 && local192 <= local138) {
						@Pc(214) int local214 = -1;
						@Pc(219) int local219 = this.anIntArray210[local140];
						@Pc(226) int local226 = this.anIntArray210[local140 + 1];
						for (@Pc(228) int local228 = local219; local228 < local226; local228++) {
							local214 = this.aShortArray67[local228] - 1;
							if (local214 == -1 || this.aByteArray34[local214] != 0) {
								break;
							}
						}
						if (local214 != -1) {
							for (@Pc(268) int local268 = 0; local268 < local27; local268++) {
								if (local169 == local30[local268] && local36[local268] == local192 && local150 == local33[local268]) {
									local219 = local109[local268];
									local226 = local109[local268 + 1];
									@Pc(303) int local303 = -1;
									for (@Pc(305) int local305 = local219; local305 < local226; local305++) {
										local303 = local112[local305] - 1;
										if (local303 == -1 || local48[local303] != 0) {
											break;
										}
									}
									if (local303 != -1) {
										if (local67 == null) {
											this.aClass39_1 = new Class39();
											local67 = this.aClass39_1.aShortArray2 = Static394.method5844(this.aShortArray64);
											local63 = this.aClass39_1.aShortArray1 = Static394.method5844(this.aShortArray66);
											local55 = this.aClass39_1.aShortArray3 = Static394.method5844(this.aShortArray63);
											local59 = this.aClass39_1.aByteArray5 = Static681.method9203(this.aByteArray34);
										}
										if (local88 == null) {
											@Pc(399) Class39 local399 = local8.aClass39_1 = new Class39();
											local88 = local399.aShortArray2 = Static394.method5844(local39);
											local84 = local399.aShortArray1 = Static394.method5844(local42);
											local82 = local399.aShortArray3 = Static394.method5844(local45);
											local86 = local399.aByteArray5 = Static681.method9203(local48);
										}
										@Pc(432) short local432 = this.aShortArray64[local214];
										@Pc(437) short local437 = this.aShortArray66[local214];
										@Pc(442) short local442 = this.aShortArray63[local214];
										local219 = local109[local268];
										local226 = local109[local268 + 1];
										@Pc(457) byte local457 = this.aByteArray34[local214];
										@Pc(467) int local467;
										for (@Pc(459) int local459 = local219; local459 < local226; local459++) {
											local467 = local112[local459] - 1;
											if (local467 == -1) {
												break;
											}
											if (local86[local467] != 0) {
												local88[local467] += local432;
												local84[local467] += local437;
												local82[local467] += local442;
												local86[local467] += local457;
											}
										}
										local219 = this.anIntArray210[local140];
										local437 = local42[local303];
										local442 = local45[local303];
										local226 = this.anIntArray210[local140 + 1];
										local432 = local39[local303];
										local457 = local48[local303];
										for (local467 = local219; local467 < local226; local467++) {
											@Pc(557) int local557 = this.aShortArray67[local467] - 1;
											if (local557 == -1) {
												break;
											}
											if (local59[local557] != 0) {
												local67[local557] += local432;
												local63[local557] += local437;
												local55[local557] += local442;
												local59[local557] += local457;
											}
										}
										local8.method2498();
										this.method2498();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(B)V")
	public void method2500() {
		if (this.lb != null) {
			this.lb.method3460();
		}
		if (this.aClass164_2 != null) {
			this.aClass164_2.method3460();
		}
		if (this.aClass164_1 != null) {
			this.aClass164_1.method3460();
		}
		if (this.aClass164_3 != null) {
			this.aClass164_3.method3460();
		}
		if (this.aClass357_1 != null) {
			this.aClass357_1.method8406();
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5762(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5;
		if (arg1 == null) {
			for (local5 = 0; local5 < this.anInt2864; local5++) {
				this.aByteArray33[local5] = arg0;
			}
		} else {
			for (local5 = 0; local5 < this.anInt2864; local5++) {
				@Pc(55) int local55 = 255 - (255 - (arg0 & 0xFF)) * (255 - (arg1[local5] & 0xFF)) / 255;
				this.aByteArray33[local5] = (byte) local55;
			}
		}
		Static165.anInt2854++;
		this.method2488();
	}

	@OriginalMember(owner = "client!fca", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean279;
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(B)V")
	private void method2501() {
		if (this.aClass357_1 != null) {
			this.aClass357_1.aBoolean816 = false;
		}
	}

	@OriginalMember(owner = "client!fca", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2855; local7++) {
			this.anIntArray212[local7] = this.anIntArray212[local7] + 7 >> 4;
			this.anIntArray214[local7] = this.anIntArray214[local7] + 7 >> 4;
			this.anIntArray213[local7] = this.anIntArray213[local7] + 7 >> 4;
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt2862;
	}

	@OriginalMember(owner = "client!fca", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(58) int local58;
		@Pc(40) int local40;
		@Pc(50) int[] local50;
		@Pc(52) int local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static390.anInt6474 = 0;
			local26 = 0;
			Static422.anInt6874 = 0;
			Static108.anInt1826 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray16.length) {
					local50 = this.anIntArrayArray16[local40];
					for (local52 = 0; local52 < local50.length; local52++) {
						local58 = local50[local52];
						if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local58]) != 0) {
							Static422.anInt6874 += this.anIntArray212[local58];
							Static108.anInt1826 += this.anIntArray214[local58];
							Static390.anInt6474 += this.anIntArray213[local58];
							local26++;
						}
					}
				}
			}
			if (local26 > 0) {
				Static390.anInt6474 = arg4 + Static390.anInt6474 / local26;
				Static422.anInt6874 = arg2 + Static422.anInt6874 / local26;
				Static108.anInt1826 = Static108.anInt1826 / local26 + arg3;
				Static461.aBoolean646 = true;
			} else {
				Static108.anInt1826 = arg3;
				Static422.anInt6874 = arg2;
				Static390.anInt6474 = arg4;
			}
			return;
		}
		@Pc(252) int[] local252;
		@Pc(254) int local254;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg4 * arg7[2] + arg2 * arg7[0] + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg7[3] * arg2 + arg7[5] * arg4 + 8192 >> 14;
				local40 = arg7[8] * arg4 + arg2 * arg7[6] + arg3 * arg7[7] + 8192 >> 14;
				arg2 = local26;
				arg4 = local40;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray16.length) {
					local252 = this.anIntArrayArray16[local32];
					for (local254 = 0; local254 < local252.length; local254++) {
						local52 = local252[local254];
						if (this.aShortArray61 == null || (this.aShortArray61[local52] & arg6) != 0) {
							this.anIntArray212[local52] += arg2;
							this.anIntArray214[local52] += arg3;
							this.anIntArray213[local52] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(408) int local408;
		@Pc(426) int local426;
		@Pc(664) int local664;
		@Pc(673) int local673;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(710) int local710;
		@Pc(1040) int local1040;
		@Pc(1048) int local1048;
		@Pc(1204) int local1204;
		@Pc(1231) int local1231;
		@Pc(1236) int local1236;
		@Pc(1246) int local1246;
		@Pc(1251) int local1251;
		@Pc(1255) int local1255;
		@Pc(1259) int local1259;
		@Pc(1261) int local1261;
		@Pc(1399) int[] local1399;
		@Pc(1401) int local1401;
		@Pc(1407) int local1407;
		@Pc(1411) int local1411;
		@Pc(1413) int local1413;
		@Pc(1546) int local1546;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray16.length > local32) {
						local252 = this.anIntArrayArray16[local32];
						for (local254 = 0; local254 < local252.length; local254++) {
							local52 = local252[local254];
							if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local52]) != 0) {
								this.anIntArray212[local52] -= Static422.anInt6874;
								this.anIntArray214[local52] -= Static108.anInt1826;
								this.anIntArray213[local52] -= Static390.anInt6474;
								if (arg4 != 0) {
									local58 = Class145_Sub1.anIntArray761[arg4];
									local408 = Class145_Sub1.anIntArray760[arg4];
									local426 = local408 * this.anIntArray212[local52] + this.anIntArray214[local52] * local58 + 16383 >> 14;
									this.anIntArray214[local52] = local408 * this.anIntArray214[local52] + 16383 - this.anIntArray212[local52] * local58 >> 14;
									this.anIntArray212[local52] = local426;
								}
								if (arg2 != 0) {
									local58 = Class145_Sub1.anIntArray761[arg2];
									local408 = Class145_Sub1.anIntArray760[arg2];
									local426 = this.anIntArray214[local52] * local408 + 16383 - this.anIntArray213[local52] * local58 >> 14;
									this.anIntArray213[local52] = this.anIntArray214[local52] * local58 + this.anIntArray213[local52] * local408 + 16383 >> 14;
									this.anIntArray214[local52] = local426;
								}
								if (arg3 != 0) {
									local58 = Class145_Sub1.anIntArray761[arg3];
									local408 = Class145_Sub1.anIntArray760[arg3];
									local426 = this.anIntArray213[local52] * local58 + this.anIntArray212[local52] * local408 + 16383 >> 14;
									this.anIntArray213[local52] = this.anIntArray213[local52] * local408 + 16383 - this.anIntArray212[local52] * local58 >> 14;
									this.anIntArray212[local52] = local426;
								}
								this.anIntArray212[local52] += Static422.anInt6874;
								this.anIntArray214[local52] += Static108.anInt1826;
								this.anIntArray213[local52] += Static390.anInt6474;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray16.length > local40) {
							local50 = this.anIntArrayArray16[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local58]) != 0) {
									local408 = this.anIntArray210[local58];
									local426 = this.anIntArray210[local58 + 1];
									for (local664 = local408; local664 < local426; local664++) {
										local673 = this.aShortArray67[local664] - 1;
										if (local673 == -1) {
											break;
										}
										if (arg4 != 0) {
											local688 = Class145_Sub1.anIntArray761[arg4];
											local692 = Class145_Sub1.anIntArray760[arg4];
											local710 = this.aShortArray64[local673] * local692 + local688 * this.aShortArray66[local673] + 16383 >> 14;
											this.aShortArray66[local673] = (short) (local692 * this.aShortArray66[local673] + 16383 - this.aShortArray64[local673] * local688 >> 14);
											this.aShortArray64[local673] = (short) local710;
										}
										if (arg2 != 0) {
											local688 = Class145_Sub1.anIntArray761[arg2];
											local692 = Class145_Sub1.anIntArray760[arg2];
											local710 = this.aShortArray66[local673] * local692 + 16383 - this.aShortArray63[local673] * local688 >> 14;
											this.aShortArray63[local673] = (short) (this.aShortArray66[local673] * local688 + local692 * this.aShortArray63[local673] + 16383 >> 14);
											this.aShortArray66[local673] = (short) local710;
										}
										if (arg3 != 0) {
											local688 = Class145_Sub1.anIntArray761[arg3];
											local692 = Class145_Sub1.anIntArray760[arg3];
											local710 = this.aShortArray63[local673] * local688 + this.aShortArray64[local673] * local692 + 16383 >> 14;
											this.aShortArray63[local673] = (short) (local692 * this.aShortArray63[local673] + 16383 - local688 * this.aShortArray64[local673] >> 14);
											this.aShortArray64[local673] = (short) local710;
										}
									}
								}
							}
						}
					}
					this.method2498();
					return;
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local254 = arg7[12] << 4;
				local52 = arg7[13] << 4;
				local58 = arg7[14] << 4;
				if (Static461.aBoolean646) {
					local408 = arg7[6] * Static390.anInt6474 + Static108.anInt1826 * arg7[3] + arg7[0] * Static422.anInt6874 + 8192 >> 14;
					local426 = Static390.anInt6474 * arg7[7] + Static108.anInt1826 * arg7[4] + Static422.anInt6874 * arg7[1] + 8192 >> 14;
					local408 += local254;
					local664 = Static108.anInt1826 * arg7[5] + Static422.anInt6874 * arg7[2] + arg7[8] * Static390.anInt6474 + 8192 >> 14;
					local426 += local52;
					local664 += local58;
					Static108.anInt1826 = local426;
					Static422.anInt6874 = local408;
					Static461.aBoolean646 = false;
					Static390.anInt6474 = local664;
				}
				@Pc(1008) int[] local1008 = new int[9];
				local426 = Class145_Sub1.anIntArray760[arg2];
				local664 = Class145_Sub1.anIntArray761[arg2];
				local673 = Class145_Sub1.anIntArray760[arg3];
				local688 = Class145_Sub1.anIntArray761[arg3];
				local692 = Class145_Sub1.anIntArray760[arg4];
				local710 = Class145_Sub1.anIntArray761[arg4];
				local1040 = local664 * local692 + 8192 >> 14;
				local1048 = local710 * local664 + 8192 >> 14;
				local1008[0] = local673 * local692 + local1048 * local688 + 8192 >> 14;
				local1008[1] = local1040 * local688 + -local673 * local710 + 8192 >> 14;
				local1008[3] = local710 * local426 + 8192 >> 14;
				local1008[8] = local426 * local673 + 8192 >> 14;
				local1008[5] = -local664;
				local1008[7] = local688 * local710 + local1040 * local673 + 8192 >> 14;
				local1008[2] = local688 * local426 + 8192 >> 14;
				local1008[4] = local426 * local692 + 8192 >> 14;
				local1008[6] = -local688 * local692 + local1048 * local673 + 8192 >> 14;
				@Pc(1179) int local1179 = local1008[0] * -Static422.anInt6874 + -Static108.anInt1826 * local1008[1] + local1008[2] * -Static390.anInt6474 + 8192 >> 14;
				local1204 = -Static390.anInt6474 * local1008[5] + local1008[4] * -Static108.anInt1826 + local1008[3] * -Static422.anInt6874 + 8192 >> 14;
				local1231 = -Static422.anInt6874 * local1008[6] + local1008[7] * -Static108.anInt1826 + -Static390.anInt6474 * local1008[8] + 8192 >> 14;
				local1236 = local1179 + Static422.anInt6874;
				@Pc(1241) int local1241 = local1204 + Static108.anInt1826;
				local1246 = local1231 + Static390.anInt6474;
				@Pc(1249) int[] local1249 = new int[9];
				for (local1251 = 0; local1251 < 3; local1251++) {
					for (local1255 = 0; local1255 < 3; local1255++) {
						local1259 = 0;
						for (local1261 = 0; local1261 < 3; local1261++) {
							local1259 += local1008[local1251 * 3 + local1261] * arg7[local1255 * 3 + local1261];
						}
						local1249[local1255 + local1251 * 3] = local1259 + 8192 >> 14;
					}
				}
				local1255 = local254 * local1008[0] + local52 * local1008[1] + local1008[2] * local58 + 8192 >> 14;
				local1259 = local58 * local1008[5] + local52 * local1008[4] + local254 * local1008[3] + 8192 >> 14;
				local1255 += local1236;
				local1259 += local1241;
				local1261 = local254 * local1008[6] + local52 * local1008[7] + local1008[8] * local58 + 8192 >> 14;
				local1261 += local1246;
				local1399 = new int[9];
				for (local1401 = 0; local1401 < 3; local1401++) {
					for (local1407 = 0; local1407 < 3; local1407++) {
						local1411 = 0;
						for (local1413 = 0; local1413 < 3; local1413++) {
							local1411 += local1249[local1413 * 3 + local1407] * arg7[local1401 * 3 + local1413];
						}
						local1399[local1407 + local1401 * 3] = local1411 + 8192 >> 14;
					}
				}
				local1407 = arg7[2] * local1261 + local1259 * arg7[1] + local1255 * arg7[0] + 8192 >> 14;
				local1411 = local1261 * arg7[5] + local1255 * arg7[3] + arg7[4] * local1259 + 8192 >> 14;
				local1407 += local26;
				local1413 = arg7[8] * local1261 + arg7[7] * local1259 + arg7[6] * local1255 + 8192 >> 14;
				local1411 += local32;
				local1413 += local40;
				for (local1546 = 0; local1546 < local8; local1546++) {
					@Pc(1554) int local1554 = arg1[local1546];
					if (local1554 < this.anIntArrayArray16.length) {
						@Pc(1568) int[] local1568 = this.anIntArrayArray16[local1554];
						for (@Pc(1570) int local1570 = 0; local1570 < local1568.length; local1570++) {
							@Pc(1576) int local1576 = local1568[local1570];
							if (this.aShortArray61 == null || (this.aShortArray61[local1576] & arg6) != 0) {
								@Pc(1620) int local1620 = this.anIntArray214[local1576] * local1399[1] + this.anIntArray212[local1576] * local1399[0] + this.anIntArray213[local1576] * local1399[2] + 8192 >> 14;
								@Pc(1651) int local1651 = local1399[3] * this.anIntArray212[local1576] + this.anIntArray214[local1576] * local1399[4] + local1399[5] * this.anIntArray213[local1576] + 8192 >> 14;
								@Pc(1655) int local1655 = local1651 + local1411;
								@Pc(1686) int local1686 = this.anIntArray213[local1576] * local1399[8] + this.anIntArray212[local1576] * local1399[6] + local1399[7] * this.anIntArray214[local1576] + 8192 >> 14;
								@Pc(1690) int local1690 = local1620 + local1407;
								@Pc(1694) int local1694 = local1686 + local1413;
								this.anIntArray212[local1576] = local1690;
								this.anIntArray214[local1576] = local1655;
								this.anIntArray213[local1576] = local1694;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2676) Class329 local2676;
			@Pc(2548) boolean local2548;
			@Pc(2671) Class40 local2671;
			if (arg0 == 5) {
				if (this.anIntArrayArray17 != null) {
					local2548 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray17.length > local40) {
							local50 = this.anIntArrayArray17[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray57 == null || (this.aShortArray57[local58] & arg6) != 0) {
									local408 = (this.aByteArray33[local58] & 0xFF) + arg2 * 8;
									if (local408 < 0) {
										local408 = 0;
									} else if (local408 > 255) {
										local408 = 255;
									}
									this.aByteArray33[local58] = (byte) local408;
								}
							}
							local2548 |= local50.length > 0;
						}
					}
					if (local2548) {
						if (this.aClass40Array1 != null) {
							for (local40 = 0; local40 < this.anInt2860; local40++) {
								local2671 = this.aClass40Array1[local40];
								local2676 = this.aClass329Array1[local40];
								local2676.anInt8856 = local2676.anInt8856 & 0xFFFFFF | 255 - (this.aByteArray33[local2671.anInt860] & 0xFF) << 24;
							}
						}
						this.method2488();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray17 != null) {
					local2548 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (this.anIntArrayArray17.length > local40) {
							local50 = this.anIntArrayArray17[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray57 == null || (arg6 & this.aShortArray57[local58]) != 0) {
									local408 = this.aShortArray59[local58] & 0xFFFF;
									local426 = local408 >> 10 & 0x3F;
									local664 = local408 >> 7 & 0x7;
									local664 += arg3 / 4;
									local673 = local408 & 0x7F;
									@Pc(2798) int local2798 = arg2 + local426 & 0x3F;
									if (local664 < 0) {
										local664 = 0;
									} else if (local664 > 7) {
										local664 = 7;
									}
									local673 += arg4;
									if (local673 < 0) {
										local673 = 0;
									} else if (local673 > 127) {
										local673 = 127;
									}
									this.aShortArray59[local58] = (short) (local673 | local2798 << 10 | local664 << 7);
								}
							}
							local2548 |= local50.length > 0;
						}
					}
					if (local2548) {
						if (this.aClass40Array1 != null) {
							for (local40 = 0; local40 < this.anInt2860; local40++) {
								local2671 = this.aClass40Array1[local40];
								local2676 = this.aClass329Array1[local40];
								local2676.anInt8856 = local2676.anInt8856 & 0xFF000000 | Static555.anIntArray633[this.aShortArray59[local2671.anInt860] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method2488();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray18 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray18.length) {
							local252 = this.anIntArrayArray18[local32];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2676 = this.aClass329Array1[local252[local254]];
								local2676.anInt8858 += arg3;
								local2676.anInt8849 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray18 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray18.length > local32) {
							local252 = this.anIntArrayArray18[local32];
							for (local254 = 0; local254 < local252.length; local254++) {
								local2676 = this.aClass329Array1[local252[local254]];
								local2676.anInt8857 = local2676.anInt8857 * arg3 >> 7;
								local2676.anInt8852 = arg2 * local2676.anInt8852 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray18 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray18.length) {
						local252 = this.anIntArrayArray18[local32];
						for (local254 = 0; local254 < local252.length; local254++) {
							local2676 = this.aClass329Array1[local252[local254]];
							local2676.anInt8848 = local2676.anInt8848 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray16.length) {
					local252 = this.anIntArrayArray16[local32];
					for (local254 = 0; local254 < local252.length; local254++) {
						local52 = local252[local254];
						if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local52]) != 0) {
							this.anIntArray212[local52] -= Static422.anInt6874;
							this.anIntArray214[local52] -= Static108.anInt1826;
							this.anIntArray213[local52] -= Static390.anInt6474;
							this.anIntArray212[local52] = arg2 * this.anIntArray212[local52] >> 7;
							this.anIntArray214[local52] = this.anIntArray214[local52] * arg3 >> 7;
							this.anIntArray213[local52] = this.anIntArray213[local52] * arg4 >> 7;
							this.anIntArray212[local52] += Static422.anInt6874;
							this.anIntArray214[local52] += Static108.anInt1826;
							this.anIntArray213[local52] += Static390.anInt6474;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local254 = arg7[12] << 4;
			local52 = arg7[13] << 4;
			local58 = arg7[14] << 4;
			if (Static461.aBoolean646) {
				local408 = Static422.anInt6874 * arg7[0] + arg7[3] * Static108.anInt1826 + arg7[6] * Static390.anInt6474 + 8192 >> 14;
				local426 = arg7[7] * Static390.anInt6474 + arg7[4] * Static108.anInt1826 + Static422.anInt6874 * arg7[1] + 8192 >> 14;
				local426 += local52;
				local664 = Static390.anInt6474 * arg7[8] + arg7[5] * Static108.anInt1826 + Static422.anInt6874 * arg7[2] + 8192 >> 14;
				local408 += local254;
				Static422.anInt6874 = local408;
				local664 += local58;
				Static108.anInt1826 = local426;
				Static461.aBoolean646 = false;
				Static390.anInt6474 = local664;
			}
			local408 = arg2 << 15 >> 7;
			local426 = arg3 << 15 >> 7;
			local664 = arg4 << 15 >> 7;
			local673 = local408 * -Static422.anInt6874 + 8192 >> 14;
			local688 = -Static108.anInt1826 * local426 + 8192 >> 14;
			local692 = -Static390.anInt6474 * local664 + 8192 >> 14;
			local710 = local673 + Static422.anInt6874;
			local1040 = Static108.anInt1826 + local688;
			local1048 = local692 + Static390.anInt6474;
			@Pc(1920) int[] local1920 = new int[] { arg7[0] * local408 + 8192 >> 14, arg7[3] * local408 + 8192 >> 14, arg7[6] * local408 + 8192 >> 14, arg7[1] * local426 + 8192 >> 14, local426 * arg7[4] + 8192 >> 14, arg7[7] * local426 + 8192 >> 14, arg7[2] * local664 + 8192 >> 14, local664 * arg7[5] + 8192 >> 14, arg7[8] * local664 + 8192 >> 14 };
			local1204 = local254 * local408 + 8192 >> 14;
			local1231 = local52 * local426 + 8192 >> 14;
			local1236 = local58 * local664 + 8192 >> 14;
			@Pc(2056) int local2056 = local1231 + local1040;
			@Pc(2060) int local2060 = local1204 + local710;
			@Pc(2064) int local2064 = local1236 + local1048;
			@Pc(2067) int[] local2067 = new int[9];
			@Pc(2073) int local2073;
			for (local1246 = 0; local1246 < 3; local1246++) {
				for (local2073 = 0; local2073 < 3; local2073++) {
					local1251 = 0;
					for (local1255 = 0; local1255 < 3; local1255++) {
						local1251 += local1920[local1255 * 3 + local2073] * arg7[local1246 * 3 + local1255];
					}
					local2067[local2073 + local1246 * 3] = local1251 + 8192 >> 14;
				}
			}
			local2073 = local2060 * arg7[0] + local2056 * arg7[1] + local2064 * arg7[2] + 8192 >> 14;
			local1251 = arg7[5] * local2064 + local2060 * arg7[3] + arg7[4] * local2056 + 8192 >> 14;
			local1251 += local32;
			local2073 += local26;
			local1255 = arg7[8] * local2064 + local2060 * arg7[6] + local2056 * arg7[7] + 8192 >> 14;
			local1255 += local40;
			for (local1259 = 0; local1259 < local8; local1259++) {
				local1261 = arg1[local1259];
				if (local1261 < this.anIntArrayArray16.length) {
					local1399 = this.anIntArrayArray16[local1261];
					for (local1401 = 0; local1401 < local1399.length; local1401++) {
						local1407 = local1399[local1401];
						if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local1407]) != 0) {
							local1411 = this.anIntArray212[local1407] * local2067[0] + this.anIntArray214[local1407] * local2067[1] + local2067[2] * this.anIntArray213[local1407] + 8192 >> 14;
							local1413 = local2067[5] * this.anIntArray213[local1407] + local2067[4] * this.anIntArray214[local1407] + local2067[3] * this.anIntArray212[local1407] + 8192 >> 14;
							local1546 = this.anIntArray214[local1407] * local2067[7] + this.anIntArray212[local1407] * local2067[6] + this.anIntArray213[local1407] * local2067[8] + 8192 >> 14;
							@Pc(2359) int local2359 = local1411 + local2073;
							@Pc(2363) int local2363 = local1413 + local1251;
							this.anIntArray212[local1407] = local2359;
							@Pc(2372) int local2372 = local1546 + local1255;
							this.anIntArray214[local1407] = local2363;
							this.anIntArray213[local1407] = local2372;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "(I)V")
	private void method2502() {
		if (this.anInt2863 == 0) {
			return;
		}
		if (this.method2492() && this.method2506()) {
			this.aClass145_Sub1_9.method9800(0, this.lb.anInterface24_4);
			this.aClass145_Sub1_9.method9800(1, this.aClass164_1.anInterface24_4);
			this.aClass145_Sub1_9.method9800(2, this.aClass164_2.anInterface24_4);
			@Pc(59) boolean local59;
			if ((this.anInt2797 & 0x37) == 0) {
				this.aClass145_Sub1_9.method9801(false);
				local59 = false;
				this.aClass145_Sub1_9.method9766(this.aClass145_Sub1_9.aClass277_20);
			} else {
				local59 = true;
				this.aClass145_Sub1_9.method9801(true);
				this.aClass145_Sub1_9.method9800(3, this.aClass164_3.anInterface24_4);
				this.aClass145_Sub1_9.method9766(this.aClass145_Sub1_9.aClass277_23);
			}
			for (@Pc(97) int local97 = 0; local97 < this.anIntArray211.length; local97++) {
				@Pc(104) int local104 = this.anIntArray209[local97];
				@Pc(111) int local111 = this.anIntArray209[local97 + 1];
				@Pc(118) int local118 = this.aShortArray58[local104] & 0xFFFF;
				if (local118 == 65535) {
					local118 = -1;
				}
				this.aClass145_Sub1_9.method9724(local118, local59, true);
				this.aClass145_Sub1_9.method9778(local104 * 3, Static601.aClass317_8, local111 - local104, this.anIntArray211[local97], this.anIntArray208[local97], this.aClass357_1.anInterface15_5);
			}
		}
		this.method2495();
	}

	@OriginalMember(owner = "client!fca", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2804;
	}

	@OriginalMember(owner = "client!fca", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort50;
	}

	@OriginalMember(owner = "client!fca", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2815; local3++) {
			this.anIntArray213[local3] = -this.anIntArray213[local3];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt2824; local31++) {
			this.aShortArray63[local31] = (short) -this.aShortArray63[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt2864; local58++) {
			@Pc(69) short local69 = this.aShortArray62[local58];
			this.aShortArray62[local58] = this.aShortArray56[local58];
			this.aShortArray56[local58] = local69;
		}
		this.method2496();
		this.method2498();
		this.method2501();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!gw;Lclient!fa;I)V")
	@Override
	public void method5769(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2824 == 0) {
			return;
		}
		@Pc(14) Class86_Sub2 local14 = this.aClass145_Sub1_9.aClass86_Sub2_16;
		if (!this.aBoolean278) {
			this.method2493();
		}
		@Pc(25) Class86_Sub2 local25 = (Class86_Sub2) arg0;
		Static330.aFloat70 = local14.aFloat37 * local25.aFloat39 + local14.aFloat39 * local25.aFloat34 + local25.aFloat36 * local14.aFloat30;
		Static259.aFloat49 = local14.aFloat37 * local25.aFloat38 + local14.aFloat30 * local25.aFloat31 + local14.aFloat39 * local25.aFloat41 + local14.aFloat38;
		@Pc(72) float local72 = Static259.aFloat49 + Static330.aFloat70 * (float) this.anInt2807;
		@Pc(80) float local80 = (float) this.anInt2812 * Static330.aFloat70 + Static259.aFloat49;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local90 = local80 - (float) this.anInt2820;
			local96 = local72 + (float) this.anInt2820;
		} else {
			local96 = (float) this.anInt2820 + local80;
			local90 = (float) -this.anInt2820 + local72;
		}
		if (this.aClass145_Sub1_9.aFloat180 <= local90 || local96 <= (float) this.aClass145_Sub1_9.anInt11250) {
			return;
		}
		Static418.aFloat113 = local25.aFloat39 * local14.aFloat32 + local25.aFloat34 * local14.aFloat36 + local25.aFloat36 * local14.aFloat33;
		Static248.aFloat48 = local14.aFloat36 * local25.aFloat41 + local25.aFloat31 * local14.aFloat33 + local14.aFloat32 * local25.aFloat38 + local14.aFloat31;
		@Pc(175) float local175 = Static248.aFloat48 + (float) this.anInt2807 * Static418.aFloat113;
		@Pc(183) float local183 = Static418.aFloat113 * (float) this.anInt2812 + Static248.aFloat48;
		@Pc(199) float local199;
		@Pc(210) float local210;
		if (local183 < local175) {
			local199 = (float) this.aClass145_Sub1_9.anInt11241 * ((float) -this.anInt2820 + local183);
			local210 = (float) this.aClass145_Sub1_9.anInt11241 * (local175 + (float) this.anInt2820);
		} else {
			local210 = (float) this.aClass145_Sub1_9.anInt11241 * (local183 + (float) this.anInt2820);
			local199 = (local175 - (float) this.anInt2820) * (float) this.aClass145_Sub1_9.anInt11241;
		}
		if (this.aClass145_Sub1_9.aFloat193 <= local199 / local96 || this.aClass145_Sub1_9.aFloat186 >= local210 / local96) {
			return;
		}
		Static611.aFloat150 = local14.aFloat41 + local25.aFloat38 * local14.aFloat35 + local14.aFloat40 * local25.aFloat31 + local14.aFloat34 * local25.aFloat41;
		Static718.aFloat178 = local14.aFloat34 * local25.aFloat34 + local14.aFloat40 * local25.aFloat36 + local25.aFloat39 * local14.aFloat35;
		@Pc(301) float local301 = Static611.aFloat150 + (float) this.anInt2807 * Static718.aFloat178;
		@Pc(309) float local309 = (float) this.anInt2812 * Static718.aFloat178 + Static611.aFloat150;
		@Pc(324) float local324;
		@Pc(335) float local335;
		if (local309 < local301) {
			local335 = ((float) this.anInt2820 + local301) * (float) this.aClass145_Sub1_9.anInt11245;
			local324 = ((float) -this.anInt2820 + local309) * (float) this.aClass145_Sub1_9.anInt11245;
		} else {
			local324 = (float) this.aClass145_Sub1_9.anInt11245 * (local301 - (float) this.anInt2820);
			local335 = (float) this.aClass145_Sub1_9.anInt11245 * (local309 + (float) this.anInt2820);
		}
		if (local324 / local96 >= this.aClass145_Sub1_9.aFloat182 || local335 / local96 <= this.aClass145_Sub1_9.aFloat187) {
			return;
		}
		if (arg1 != null || this.aClass40Array1 != null) {
			Static535.aFloat142 = local14.aFloat33 * local25.aFloat32 + local14.aFloat36 * local25.aFloat35 + local25.aFloat37 * local14.aFloat32;
			Static404.aFloat112 = local14.aFloat32 * local25.aFloat30 + local25.aFloat40 * local14.aFloat36 + local14.aFloat33 * local25.aFloat33;
			Static139.aFloat25 = local14.aFloat30 * local25.aFloat33 + local14.aFloat39 * local25.aFloat40 + local14.aFloat37 * local25.aFloat30;
			Static677.aFloat174 = local14.aFloat37 * local25.aFloat37 + local25.aFloat35 * local14.aFloat39 + local14.aFloat30 * local25.aFloat32;
			Static629.aFloat152 = local14.aFloat35 * local25.aFloat30 + local25.aFloat33 * local14.aFloat40 + local14.aFloat34 * local25.aFloat40;
			Static457.aFloat125 = local25.aFloat37 * local14.aFloat35 + local14.aFloat34 * local25.aFloat35 + local14.aFloat40 * local25.aFloat32;
		}
		if (arg1 != null) {
			@Pc(501) boolean local501 = false;
			@Pc(503) boolean local503 = true;
			@Pc(511) int local511 = this.anInt2833 + this.anInt2871 >> 1;
			@Pc(519) int local519 = this.anInt2847 + this.anInt2804 >> 1;
			@Pc(538) int local538 = (int) ((float) local519 * Static535.aFloat142 + (float) local511 * Static404.aFloat112 + Static248.aFloat48 + Static418.aFloat113 * (float) this.anInt2807);
			@Pc(557) int local557 = (int) (Static611.aFloat150 + (float) local511 * Static629.aFloat152 + Static718.aFloat178 * (float) this.anInt2807 + (float) local519 * Static457.aFloat125);
			@Pc(576) int local576 = (int) ((float) local519 * Static677.aFloat174 + (float) local511 * Static139.aFloat25 + Static259.aFloat49 + Static330.aFloat70 * (float) this.anInt2807);
			if (local576 < this.aClass145_Sub1_9.anInt11250) {
				local501 = true;
			} else {
				arg1.anInt2725 = local557 * this.aClass145_Sub1_9.anInt11245 / local576 + this.aClass145_Sub1_9.anInt11273;
				arg1.anInt2724 = this.aClass145_Sub1_9.anInt11241 * local538 / local576 + this.aClass145_Sub1_9.anInt11246;
			}
			@Pc(636) int local636 = (int) ((float) this.anInt2812 * Static418.aFloat113 + Static248.aFloat48 + (float) local511 * Static404.aFloat112 + (float) local519 * Static535.aFloat142);
			@Pc(655) int local655 = (int) ((float) local511 * Static629.aFloat152 + Static611.aFloat150 + Static718.aFloat178 * (float) this.anInt2812 + Static457.aFloat125 * (float) local519);
			@Pc(674) int local674 = (int) (Static259.aFloat49 + Static139.aFloat25 * (float) local511 + (float) this.anInt2812 * Static330.aFloat70 + (float) local519 * Static677.aFloat174);
			if (this.aClass145_Sub1_9.anInt11250 > local674) {
				local501 = true;
			} else {
				arg1.anInt2726 = local655 * this.aClass145_Sub1_9.anInt11245 / local674 + this.aClass145_Sub1_9.anInt11273;
				arg1.anInt2722 = this.aClass145_Sub1_9.anInt11246 + this.aClass145_Sub1_9.anInt11241 * local636 / local674;
			}
			if (local501) {
				if (local576 < this.aClass145_Sub1_9.anInt11250 && local674 < this.aClass145_Sub1_9.anInt11250) {
					local503 = false;
				} else {
					@Pc(771) int local771;
					@Pc(782) int local782;
					@Pc(793) int local793;
					if (local576 < this.aClass145_Sub1_9.anInt11250) {
						local771 = (local674 - this.aClass145_Sub1_9.anInt11250 << 16) / (local674 - local576);
						local782 = ((local636 - local538) * local771 >> 16) + local636;
						arg1.anInt2724 = local782 * this.aClass145_Sub1_9.anInt11241 / this.aClass145_Sub1_9.anInt11250 + this.aClass145_Sub1_9.anInt11246;
						local793 = local655 + ((local655 - local557) * local771 >> 16);
						arg1.anInt2725 = this.aClass145_Sub1_9.anInt11273 + local793 * this.aClass145_Sub1_9.anInt11245 / this.aClass145_Sub1_9.anInt11250;
					} else if (local674 < this.aClass145_Sub1_9.anInt11250) {
						local771 = (local576 - this.aClass145_Sub1_9.anInt11250 << 16) / (local576 - local674);
						local782 = (local771 * (local538 - local636) >> 16) + local538;
						local793 = ((local557 - local655) * local771 >> 16) + local557;
						arg1.anInt2724 = this.aClass145_Sub1_9.anInt11246 + this.aClass145_Sub1_9.anInt11241 * local782 / this.aClass145_Sub1_9.anInt11250;
						arg1.anInt2725 = this.aClass145_Sub1_9.anInt11273 + local793 * this.aClass145_Sub1_9.anInt11245 / this.aClass145_Sub1_9.anInt11250;
					}
				}
			}
			if (local503) {
				arg1.aBoolean269 = true;
				if (local576 > local674) {
					arg1.anInt2723 = this.aClass145_Sub1_9.anInt11241 * (local538 + this.anInt2820) / local576 + this.aClass145_Sub1_9.anInt11246 - arg1.anInt2724;
				} else {
					arg1.anInt2723 = this.aClass145_Sub1_9.anInt11246 + this.aClass145_Sub1_9.anInt11241 * (this.anInt2820 + local636) / local674 - arg1.anInt2722;
				}
			}
		}
		this.aClass145_Sub1_9.method9831();
		this.aClass145_Sub1_9.method9743(local25);
		this.method2502();
		this.method2489();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IFIIIIILclient!ln;JIF)S")
	private short method2504(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class229 arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray210[arg8];
		@Pc(17) int local17 = this.anIntArray210[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray67[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (arg7 == Static411.aLongArray13[local21]) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray67[local19] = (short) (this.anInt2824 + 1);
		Static411.aLongArray13[local19] = arg7;
		this.aShortArray60[this.anInt2824] = (short) arg5;
		this.aShortArray65[this.anInt2824] = (short) arg8;
		this.aShortArray64[this.anInt2824] = (short) arg4;
		this.aShortArray66[this.anInt2824] = (short) arg0;
		this.aShortArray63[this.anInt2824] = (short) arg2;
		this.aByteArray34[this.anInt2824] = (byte) arg3;
		this.aFloatArray19[this.anInt2824] = arg9;
		this.aFloatArray20[this.anInt2824] = arg1;
		return (short) this.anInt2824++;
	}

	@OriginalMember(owner = "client!fca", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2815; local7++) {
			if (arg0 != 128) {
				this.anIntArray212[local7] = this.anIntArray212[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray214[local7] = arg1 * this.anIntArray214[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray213[local7] = arg2 * this.anIntArray213[local7] >> 7;
			}
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean282;
	}

	@OriginalMember(owner = "client!fca", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.lb != null) {
			this.lb.aBoolean345 = Static435.method6316(this.anInt2797, arg0);
		}
		if (this.aClass164_2 != null) {
			this.aClass164_2.aBoolean345 = Static207.method2929(arg0, this.anInt2797);
		}
		if (this.aClass164_1 != null) {
			this.aClass164_1.aBoolean345 = Static13.method212(arg0, this.anInt2797);
		}
		if (this.aClass164_3 != null) {
			this.aClass164_3.aBoolean345 = Static170.method2539(this.anInt2797, arg0);
		}
		this.anInt2862 = arg0;
		if (this.aClass39_1 != null && (this.anInt2862 & 0x10000) == 0) {
			this.aByteArray34 = this.aClass39_1.aByteArray5;
			this.aShortArray63 = this.aClass39_1.aShortArray3;
			this.aShortArray66 = this.aClass39_1.aShortArray1;
			this.aShortArray64 = this.aClass39_1.aShortArray2;
			this.aClass39_1 = null;
		}
		this.aBoolean281 = true;
		this.method2495();
	}

	@OriginalMember(owner = "client!fca", name = "d", descriptor = "()V")
	@Override
	protected void method5746() {
	}

	@OriginalMember(owner = "client!fca", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean278) {
			this.method2493();
		}
		return this.anInt2812;
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "()Z")
	@Override
	public boolean method5757() {
		if (this.aShortArray58 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray58.length; local13++) {
			if (this.aShortArray58[local13] != -1 && !this.aClass145_Sub1_9.anInterface3_12.method2852(this.aShortArray58[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "()[B")
	@Override
	public byte[] method5752() {
		return this.aByteArray33;
	}

	@OriginalMember(owner = "client!fca", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt2815; local7++) {
			if (arg0 != 0) {
				this.anIntArray212[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray214[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray213[local7] += arg2;
			}
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		for (@Pc(7) int local7 = 0; local7 < this.anInt2864; local7++) {
			local18 = this.aShortArray59[local7] & 0xFFFF;
			@Pc(24) int local24 = local18 >> 10 & 0x3F;
			@Pc(30) int local30 = local18 >> 7 & 0x7;
			if (arg0 != -1) {
				local24 += (arg0 - local24) * arg3 >> 7;
			}
			@Pc(47) int local47 = local18 & 0x7F;
			if (arg1 != -1) {
				local30 -= -((arg1 - local30) * arg3 >> 7);
			}
			if (arg2 != -1) {
				local47 += arg3 * (arg2 - local47) >> 7;
			}
			this.aShortArray59[local7] = (short) (local47 | local30 << 7 | local24 << 10);
		}
		if (this.aClass40Array1 != null) {
			for (local18 = 0; local18 < this.anInt2860; local18++) {
				@Pc(112) Class40 local112 = this.aClass40Array1[local18];
				@Pc(117) Class329 local117 = this.aClass329Array1[local18];
				local117.anInt8856 = Static555.anIntArray633[this.aShortArray59[local112.anInt860] & 0xFFFF] & 0xFFFFFF | local117.anInt8856 & 0xFF000000;
			}
		}
		this.method2488();
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Z")
	private boolean method2506() {
		if (this.aClass357_1.aBoolean816) {
			return true;
		}
		if (this.aClass357_1.anInterface15_6 == null) {
			this.aClass357_1.anInterface15_6 = this.aClass145_Sub1_9.method9776(this.aBoolean280);
		}
		@Pc(31) Interface15 local31 = this.aClass357_1.anInterface15_6;
		local31.method9224(this.anInt2863 * 6);
		@Pc(51) Buffer local51 = local31.method4689();
		if (local51 != null) {
			@Pc(59) Stream local59 = this.aClass145_Sub1_9.method9844(local51);
			@Pc(63) int local63;
			if (Stream.b()) {
				for (local63 = 0; local63 < this.anInt2863; local63++) {
					local59.d(this.aShortArray62[local63]);
					local59.d(this.aShortArray68[local63]);
					local59.d(this.aShortArray56[local63]);
				}
			} else {
				for (local63 = 0; local63 < this.anInt2863; local63++) {
					local59.b(this.aShortArray62[local63]);
					local59.b(this.aShortArray68[local63]);
					local59.b(this.aShortArray56[local63]);
				}
			}
			local59.a();
			if (local31.method4691()) {
				this.aBoolean281 = true;
				this.aClass357_1.aBoolean816 = true;
				this.aClass357_1.anInterface15_5 = local31;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "()[Lclient!uda;")
	@Override
	public Class364[] method5753() {
		return this.aClass364Array2;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!gw;ZI)Z")
	@Override
	public boolean method5770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method2494(arg4, -1, arg1, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!fca", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt2815; local15++) {
			@Pc(34) int local34 = this.anIntArray214[local15] * local13 - local9 * this.anIntArray213[local15] >> 14;
			this.anIntArray213[local15] = this.anIntArray214[local15] * local9 + local13 * this.anIntArray213[local15] >> 14;
			this.anIntArray214[local15] = local34;
		}
		this.method2496();
		this.aBoolean278 = false;
	}

	@OriginalMember(owner = "client!fca", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static108.anInt1826 = 0;
			Static422.anInt6874 = 0;
			local13 = 0;
			Static390.anInt6474 = 0;
			for (local17 = 0; local17 < this.anInt2815; local17++) {
				Static422.anInt6874 += this.anIntArray212[local17];
				Static108.anInt1826 += this.anIntArray214[local17];
				Static390.anInt6474 += this.anIntArray213[local17];
				local13++;
			}
			if (local13 > 0) {
				Static108.anInt1826 = Static108.anInt1826 / local13 + arg2;
				Static390.anInt6474 = Static390.anInt6474 / local13 + arg3;
				Static422.anInt6874 = arg1 + Static422.anInt6874 / local13;
			} else {
				Static108.anInt1826 = arg2;
				Static390.anInt6474 = arg3;
				Static422.anInt6874 = arg1;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt2815; local13++) {
				this.anIntArray212[local13] += arg1;
				this.anIntArray214[local13] += arg2;
				this.anIntArray213[local13] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt2815; local13++) {
					this.anIntArray212[local13] -= Static422.anInt6874;
					this.anIntArray214[local13] -= Static108.anInt1826;
					this.anIntArray213[local13] -= Static390.anInt6474;
					if (arg3 != 0) {
						local17 = Class145_Sub1.anIntArray761[arg3];
						local168 = Class145_Sub1.anIntArray760[arg3];
						local186 = local168 * this.anIntArray212[local13] + local17 * this.anIntArray214[local13] + 16383 >> 14;
						this.anIntArray214[local13] = local168 * this.anIntArray214[local13] + 16383 - this.anIntArray212[local13] * local17 >> 14;
						this.anIntArray212[local13] = local186;
					}
					if (arg1 != 0) {
						local17 = Class145_Sub1.anIntArray761[arg1];
						local168 = Class145_Sub1.anIntArray760[arg1];
						local186 = this.anIntArray214[local13] * local168 + 16383 - local17 * this.anIntArray213[local13] >> 14;
						this.anIntArray213[local13] = local17 * this.anIntArray214[local13] + this.anIntArray213[local13] * local168 + 16383 >> 14;
						this.anIntArray214[local13] = local186;
					}
					if (arg2 != 0) {
						local17 = Class145_Sub1.anIntArray761[arg2];
						local168 = Class145_Sub1.anIntArray760[arg2];
						local186 = local168 * this.anIntArray212[local13] + this.anIntArray213[local13] * local17 + 16383 >> 14;
						this.anIntArray213[local13] = this.anIntArray213[local13] * local168 + 16383 - this.anIntArray212[local13] * local17 >> 14;
						this.anIntArray212[local13] = local186;
					}
					this.anIntArray212[local13] += Static422.anInt6874;
					this.anIntArray214[local13] += Static108.anInt1826;
					this.anIntArray213[local13] += Static390.anInt6474;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt2815; local13++) {
					this.anIntArray212[local13] -= Static422.anInt6874;
					this.anIntArray214[local13] -= Static108.anInt1826;
					this.anIntArray213[local13] -= Static390.anInt6474;
					this.anIntArray212[local13] = arg1 * this.anIntArray212[local13] / 128;
					this.anIntArray214[local13] = arg2 * this.anIntArray214[local13] / 128;
					this.anIntArray213[local13] = arg3 * this.anIntArray213[local13] / 128;
					this.anIntArray212[local13] += Static422.anInt6874;
					this.anIntArray214[local13] += Static108.anInt1826;
					this.anIntArray213[local13] += Static390.anInt6474;
				}
			} else {
				@Pc(539) Class40 local539;
				@Pc(544) Class329 local544;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt2864; local13++) {
						local17 = (this.aByteArray33[local13] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray33[local13] = (byte) local17;
					}
					if (this.aClass40Array1 != null) {
						for (local17 = 0; local17 < this.anInt2860; local17++) {
							local539 = this.aClass40Array1[local17];
							local544 = this.aClass329Array1[local17];
							local544.anInt8856 = local544.anInt8856 & 0xFFFFFF | 255 - (this.aByteArray33[local539.anInt860] & 0xFF) << 24;
						}
					}
					this.method2488();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt2864; local13++) {
						local17 = this.aShortArray59[local13] & 0xFFFF;
						local168 = local17 >> 10 & 0x3F;
						local186 = local17 >> 7 & 0x7;
						local186 += arg2 / 4;
						@Pc(617) int local617 = local17 & 0x7F;
						@Pc(623) int local623 = arg1 + local168 & 0x3F;
						local617 += arg3;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						if (local617 < 0) {
							local617 = 0;
						} else if (local617 > 127) {
							local617 = 127;
						}
						this.aShortArray59[local13] = (short) (local617 | local623 << 10 | local186 << 7);
					}
					if (this.aClass40Array1 != null) {
						for (local17 = 0; local17 < this.anInt2860; local17++) {
							local539 = this.aClass40Array1[local17];
							local544 = this.aClass329Array1[local17];
							local544.anInt8856 = local544.anInt8856 & 0xFF000000 | Static555.anIntArray633[this.aShortArray59[local539.anInt860] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method2488();
				} else {
					@Pc(749) Class329 local749;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt2860; local13++) {
							local749 = this.aClass329Array1[local13];
							local749.anInt8849 += arg1;
							local749.anInt8858 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt2860; local13++) {
							local749 = this.aClass329Array1[local13];
							local749.anInt8852 = arg1 * local749.anInt8852 >> 7;
							local749.anInt8857 = arg2 * local749.anInt8857 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt2860; local13++) {
							local749 = this.aClass329Array1[local13];
							local749.anInt8848 = local749.anInt8848 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "()V")
	@Override
	public void method5763() {
		if (this.anInt2824 > 0 && this.anInt2863 > 0) {
			this.method2492();
			this.method2506();
			this.method2495();
		}
	}

	@OriginalMember(owner = "client!fca", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2864; local3++) {
			if (this.aShortArray59[local3] == arg0) {
				this.aShortArray59[local3] = arg1;
			}
		}
		if (this.aClass40Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.anInt2860; local46++) {
				@Pc(53) Class40 local53 = this.aClass40Array1[local46];
				@Pc(58) Class329 local58 = this.aClass329Array1[local46];
				local58.anInt8856 = Static555.anIntArray633[this.aShortArray59[local53.anInt860] & 0xFFFF] & 0xFFFFFF | local58.anInt8856 & 0xFF000000;
			}
		}
		this.method2488();
	}
}
