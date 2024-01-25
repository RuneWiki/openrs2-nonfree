import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class129_Sub1 extends Class129 {

	@OriginalMember(owner = "client!gea", name = "Hb", descriptor = "[S")
	private short[] aShortArray41;

	@OriginalMember(owner = "client!gea", name = "zb", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!gea", name = "Z", descriptor = "[S")
	private short[] aShortArray42;

	@OriginalMember(owner = "client!gea", name = "Fb", descriptor = "I")
	private int anInt3130;

	@OriginalMember(owner = "client!gea", name = "kc", descriptor = "[I")
	private int[] anIntArray187;

	@OriginalMember(owner = "client!gea", name = "N", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!gea", name = "Ab", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!gea", name = "kb", descriptor = "[Lclient!ih;")
	private Class172[] aClass172Array2;

	@OriginalMember(owner = "client!gea", name = "Cb", descriptor = "[F")
	private float[] aFloatArray15;

	@OriginalMember(owner = "client!gea", name = "Bb", descriptor = "I")
	private int anInt3133;

	@OriginalMember(owner = "client!gea", name = "ic", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!gea", name = "n", descriptor = "[S")
	private short[] aShortArray44;

	@OriginalMember(owner = "client!gea", name = "gb", descriptor = "B")
	private byte aByte67;

	@OriginalMember(owner = "client!gea", name = "cc", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!gea", name = "ab", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!gea", name = "Hc", descriptor = "[[I")
	private int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!gea", name = "V", descriptor = "[Lclient!jea;")
	private Class185[] aClass185Array1;

	@OriginalMember(owner = "client!gea", name = "oc", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!gea", name = "Y", descriptor = "[I")
	private int[] anIntArray188;

	@OriginalMember(owner = "client!gea", name = "Yb", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!gea", name = "Eb", descriptor = "[F")
	private float[] aFloatArray16;

	@OriginalMember(owner = "client!gea", name = "rb", descriptor = "I")
	private int anInt3153;

	@OriginalMember(owner = "client!gea", name = "Xb", descriptor = "[Lclient!mp;")
	private Class242[] aClass242Array1;

	@OriginalMember(owner = "client!gea", name = "Qb", descriptor = "[I")
	private int[] anIntArray189;

	@OriginalMember(owner = "client!gea", name = "pb", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!gea", name = "Gb", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!gea", name = "S", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!gea", name = "Wb", descriptor = "[[I")
	private int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!gea", name = "sc", descriptor = "[I")
	private int[] anIntArray190;

	@OriginalMember(owner = "client!gea", name = "ec", descriptor = "Lclient!dd;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!gea", name = "M", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!gea", name = "ib", descriptor = "[Lclient!tm;")
	private Class352[] aClass352Array2;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "[I")
	private int[] anIntArray191;

	@OriginalMember(owner = "client!gea", name = "Mb", descriptor = "Lclient!fb;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!gea", name = "Db", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!gea", name = "jb", descriptor = "S")
	private short aShort40;

	@OriginalMember(owner = "client!gea", name = "uc", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "S")
	private short aShort41;

	@OriginalMember(owner = "client!gea", name = "mb", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!gea", name = "Tb", descriptor = "Lclient!ku;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!gea", name = "Lb", descriptor = "Z")
	private boolean aBoolean228 = false;

	@OriginalMember(owner = "client!gea", name = "Jb", descriptor = "Z")
	private boolean aBoolean229 = false;

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "Z")
	private boolean aBoolean230 = false;

	@OriginalMember(owner = "client!gea", name = "nc", descriptor = "I")
	private int anInt3185 = 0;

	@OriginalMember(owner = "client!gea", name = "db", descriptor = "I")
	private int anInt3179 = 0;

	@OriginalMember(owner = "client!gea", name = "pc", descriptor = "Z")
	private boolean aBoolean231 = true;

	@OriginalMember(owner = "client!gea", name = "sb", descriptor = "I")
	private int anInt3188 = 0;

	@OriginalMember(owner = "client!gea", name = "X", descriptor = "I")
	private int anInt3171 = 0;

	@OriginalMember(owner = "client!gea", name = "Fc", descriptor = "I")
	private int anInt3140 = 0;

	@OriginalMember(owner = "client!gea", name = "Cc", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_11;

	@OriginalMember(owner = "client!gea", name = "hb", descriptor = "Lclient!vm;")
	private Class380 aClass380_2;

	@OriginalMember(owner = "client!gea", name = "ob", descriptor = "Lclient!vm;")
	private Class380 aClass380_3;

	@OriginalMember(owner = "client!gea", name = "fc", descriptor = "Lclient!vm;")
	private Class380 aClass380_4;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "Lclient!vm;")
	private Class380 aClass380_1;

	@OriginalMember(owner = "client!gea", name = "Q", descriptor = "Lclient!nea;")
	private Class248 aClass248_1;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class129_Sub1(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aClass144_Sub3_11 = arg0;
		this.aClass380_2 = new Class380((Interface12) null, 5126, 3, 0);
		this.aClass380_3 = new Class380((Interface12) null, 5126, 2, 0);
		this.aClass380_4 = new Class380((Interface12) null, 5126, 3, 0);
		this.aClass380_1 = new Class380((Interface12) null, 5121, 4, 0);
		this.aClass248_1 = new Class248();
	}

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!pi;Lclient!dea;IIII)V")
	public Class129_Sub1(@OriginalArg(0) Class144_Sub3 arg0, @OriginalArg(1) Class72 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3130 = arg2;
		this.anInt3133 = arg5;
		this.aClass144_Sub3_11 = arg0;
		if (Static540.method7939(arg5, arg2)) {
			this.aClass380_2 = new Class380((Interface12) null, 5126, 3, 0);
		}
		if (Static372.method5788(arg5, arg2)) {
			this.aClass380_3 = new Class380((Interface12) null, 5126, 2, 0);
		}
		if (Static474.method7099(arg2, arg5)) {
			this.aClass380_4 = new Class380((Interface12) null, 5126, 3, 0);
		}
		if (Static7.method105(arg2, arg5)) {
			this.aClass380_1 = new Class380((Interface12) null, 5121, 4, 0);
		}
		if (Static385.method5885(arg5, arg2)) {
			this.aClass248_1 = new Class248();
		}
		@Pc(116) Interface4 local116 = arg0.anInterface4_12;
		this.anIntArray187 = new int[arg1.anInt1755 + 1];
		@Pc(127) int[] local127 = new int[arg1.anInt1750];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt1750; local129++) {
			if (arg1.aByteArray28 == null || arg1.aByteArray28[local129] != 2) {
				if (arg1.aShortArray22 != null && arg1.aShortArray22[local129] != -1) {
					@Pc(168) Class69 local168 = local116.method8975(arg1.aShortArray22[local129] & 0xFFFF);
					if (((this.anInt3133 & 0x40) == 0 || !local168.aBoolean110) && local168.aBoolean114) {
						continue;
					}
				}
				local127[this.anInt3171++] = local129;
				this.anIntArray187[arg1.aShortArray25[local129]]++;
				this.anIntArray187[arg1.aShortArray27[local129]]++;
				this.anIntArray187[arg1.aShortArray24[local129]]++;
			}
		}
		this.anInt3188 = this.anInt3171;
		@Pc(252) long[] local252 = new long[this.anInt3171];
		@Pc(267) boolean local267 = (this.anInt3130 & 0x100) != 0;
		@Pc(281) int local281;
		@Pc(294) int local294;
		@Pc(486) int local486;
		for (@Pc(269) int local269 = 0; local269 < this.anInt3171; local269++) {
			@Pc(277) int local277 = local127[local269];
			@Pc(279) Class69 local279 = null;
			local281 = 0;
			@Pc(283) byte local283 = 0;
			@Pc(285) byte local285 = 0;
			@Pc(287) byte local287 = 0;
			if (arg1.aClass381Array1 != null) {
				@Pc(292) boolean local292 = false;
				for (local294 = 0; local294 < arg1.aClass381Array1.length; local294++) {
					@Pc(301) Class381 local301 = arg1.aClass381Array1[local294];
					if (local301.anInt10709 == local277) {
						@Pc(310) Class109 local310 = Static133.method2022(local301.anInt10711);
						if (local310.aBoolean162) {
							local292 = true;
						}
						if (local310.anInt2374 != -1) {
							@Pc(325) Class69 local325 = local116.method8975(local310.anInt2374);
							if (local325.anInt1679 == 2) {
								this.aBoolean230 = true;
							}
						}
					}
				}
				if (local292) {
					local252[local269] = Long.MAX_VALUE;
					this.anInt3188--;
					continue;
				}
			}
			@Pc(364) short local364 = -1;
			if (arg1.aShortArray22 != null) {
				local364 = arg1.aShortArray22[local277];
				if (local364 != -1) {
					local279 = local116.method8975(local364 & 0xFFFF);
					if ((this.anInt3133 & 0x40) != 0 && local279.aBoolean110) {
						local279 = null;
						local364 = -1;
					} else {
						if (local279.aByte23 != 0 || local279.aByte24 != 0) {
							this.aBoolean229 = true;
						}
						local287 = local279.aByte18;
						local285 = local279.aByte19;
					}
				}
			}
			@Pc(444) boolean local444 = arg1.aByteArray29 != null && arg1.aByteArray29[local277] != 0 || local279 != null && local279.anInt1679 != 0;
			if ((local267 || local444) && arg1.aByteArray27 != null) {
				local281 += arg1.aByteArray27[local277] << 17;
			}
			if (local444) {
				local281 += 65536;
			}
			local281 += (local285 & 0xFF) << 8;
			local486 = local283 + ((local364 & 0xFFFF) << 16);
			local281 += local287 & 0xFF;
			@Pc(498) int local498 = local486 + (local269 & 0xFFFF);
			local252[local269] = ((long) local281 << 32) + (long) local498;
			this.aBoolean230 |= local444;
			this.aBoolean229 |= local279 != null && (local279.aByte23 != 0 || local279.aByte24 != 0);
		}
		Static10.method116(local252, local127);
		this.anInt3140 = arg1.anInt1755;
		this.aShortArray46 = arg1.aShortArray28;
		this.anInt3185 = arg1.anInt1746;
		this.anIntArray189 = arg1.anIntArray93;
		this.anIntArray190 = arg1.anIntArray102;
		this.anIntArray191 = arg1.anIntArray99;
		this.aClass352Array2 = arg1.aClass352Array1;
		@Pc(590) Class107[] local590 = new Class107[this.anInt3140];
		this.aClass172Array2 = arg1.aClass172Array1;
		@Pc(614) int local614;
		@Pc(630) int local630;
		@Pc(681) int local681;
		if (arg1.aClass381Array1 != null) {
			this.anInt3153 = arg1.aClass381Array1.length;
			this.aClass242Array1 = new Class242[this.anInt3153];
			this.aClass185Array1 = new Class185[this.anInt3153];
			for (local614 = 0; local614 < this.anInt3153; local614++) {
				@Pc(623) Class381 local623 = arg1.aClass381Array1[local614];
				@Pc(628) Class109 local628 = Static133.method2022(local623.anInt10711);
				local630 = -1;
				for (@Pc(632) int local632 = 0; local632 < this.anInt3171; local632++) {
					if (local127[local632] == local623.anInt10709) {
						local630 = local632;
						break;
					}
				}
				if (local630 == -1) {
					throw new RuntimeException();
				}
				local681 = Static302.anIntArray299[arg1.aShortArray21[local623.anInt10709] & 0xFFFF] & 0xFFFFFF;
				@Pc(699) int local699 = local681 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local623.anInt10709]) << 24;
				this.aClass242Array1[local614] = new Class242(local630, arg1.aShortArray25[local623.anInt10709], arg1.aShortArray27[local623.anInt10709], arg1.aShortArray24[local623.anInt10709], local628.anInt2368, local628.anInt2370, local628.anInt2374, local628.anInt2375, local628.anInt2373, local628.aBoolean162, local628.aBoolean163, local623.anInt10716);
				this.aClass185Array1[local614] = new Class185(local699);
			}
		}
		local614 = this.anInt3171 * 3;
		this.aShortArray48 = new short[this.anInt3171];
		this.aShort41 = (short) arg4;
		this.aShortArray47 = new short[local614];
		this.aByteArray49 = new byte[this.anInt3171];
		this.aShortArray44 = new short[local614];
		Static491.aLongArray18 = new long[local614];
		this.aShortArray49 = new short[this.anInt3171];
		this.aShort37 = (short) arg3;
		this.aShortArray42 = new short[this.anInt3171];
		this.aFloatArray15 = new float[local614];
		this.aShortArray41 = new short[this.anInt3171];
		this.aShortArray43 = new short[this.anInt3171];
		this.aFloatArray16 = new float[local614];
		this.aShortArray45 = new short[local614];
		if (arg1.aShortArray23 != null) {
			this.aShortArray51 = new short[this.anInt3171];
		}
		this.aByteArray48 = new byte[local614];
		this.aShortArray50 = new short[local614];
		local281 = 0;
		for (local486 = 0; local486 < arg1.anInt1755; local486++) {
			local630 = this.anIntArray187[local486];
			this.anIntArray187[local486] = local281;
			local590[local486] = new Class107();
			local281 += local630;
		}
		this.anIntArray187[arg1.anInt1755] = local281;
		@Pc(885) Class178 local885 = Static287.method6688(arg1, this.anInt3171, local127);
		@Pc(889) Class17[] local889 = new Class17[arg1.anInt1750];
		@Pc(931) int local931;
		@Pc(942) int local942;
		@Pc(964) int local964;
		@Pc(975) int local975;
		@Pc(984) int local984;
		@Pc(992) int local992;
		@Pc(910) short local910;
		@Pc(920) int local920;
		for (local681 = 0; local681 < arg1.anInt1750; local681++) {
			@Pc(900) short local900 = arg1.aShortArray25[local681];
			@Pc(905) short local905 = arg1.aShortArray27[local681];
			local910 = arg1.aShortArray24[local681];
			local920 = this.anIntArray189[local905] - this.anIntArray189[local900];
			local931 = this.anIntArray190[local905] - this.anIntArray190[local900];
			local942 = this.anIntArray191[local905] - this.anIntArray191[local900];
			@Pc(953) int local953 = this.anIntArray189[local910] - this.anIntArray189[local900];
			local964 = this.anIntArray190[local910] - this.anIntArray190[local900];
			local975 = this.anIntArray191[local910] - this.anIntArray191[local900];
			local984 = local975 * local931 - local942 * local964;
			local992 = local942 * local953 - local920 * local975;
			@Pc(1001) int local1001 = local964 * local920 - local931 * local953;
			while (local984 > 8192 || local992 > 8192 || local1001 > 8192 || local984 < -8192 || local992 < -8192 || local1001 < -8192) {
				local992 >>= 0x1;
				local1001 >>= 0x1;
				local984 >>= 0x1;
			}
			@Pc(1059) int local1059 = (int) Math.sqrt((double) (local1001 * local1001 + local984 * local984 + local992 * local992));
			if (local1059 <= 0) {
				local1059 = 1;
			}
			local992 = local992 * 256 / local1059;
			local984 = local984 * 256 / local1059;
			local1001 = local1001 * 256 / local1059;
			@Pc(1092) byte local1092 = arg1.aByteArray28 == null ? 0 : arg1.aByteArray28[local681];
			if (local1092 == 0) {
				@Pc(1122) Class107 local1122 = local590[local900];
				local1122.anInt2320 += local984;
				local1122.anInt2319 += local1001;
				local1122.anInt2314 += local992;
				local1122.anInt2317++;
				@Pc(1150) Class107 local1150 = local590[local905];
				local1150.anInt2317++;
				local1150.anInt2320 += local984;
				local1150.anInt2319 += local1001;
				local1150.anInt2314 += local992;
				@Pc(1178) Class107 local1178 = local590[local910];
				local1178.anInt2319 += local1001;
				local1178.anInt2314 += local992;
				local1178.anInt2320 += local984;
				local1178.anInt2317++;
			} else if (local1092 == 1) {
				@Pc(1107) Class17 local1107 = local889[local681] = new Class17();
				local1107.anInt199 = local984;
				local1107.anInt200 = local992;
				local1107.anInt198 = local1001;
			}
		}
		@Pc(1217) int local1217;
		@Pc(1261) short local1261;
		for (local294 = 0; local294 < this.anInt3171; local294++) {
			local1217 = local127[local294];
			@Pc(1224) int local1224 = arg1.aShortArray21[local1217] & 0xFFFF;
			if (arg1.aByteArray30 == null) {
				local920 = -1;
			} else {
				local920 = arg1.aByteArray30[local1217];
			}
			if (arg1.aByteArray29 == null) {
				local931 = 0;
			} else {
				local931 = arg1.aByteArray29[local1217] & 0xFF;
			}
			local1261 = arg1.aShortArray22 == null ? -1 : arg1.aShortArray22[local1217];
			if (local1261 != -1 && (this.anInt3133 & 0x40) != 0) {
				@Pc(1278) Class69 local1278 = local116.method8975(local1261 & 0xFFFF);
				if (local1278.aBoolean110) {
					local1261 = -1;
				}
			}
			@Pc(1285) float local1285 = 0.0F;
			@Pc(1287) float local1287 = 0.0F;
			@Pc(1289) float local1289 = 0.0F;
			@Pc(1291) float local1291 = 0.0F;
			@Pc(1293) float local1293 = 0.0F;
			@Pc(1295) float local1295 = 0.0F;
			@Pc(1297) byte local1297 = 0;
			@Pc(1299) byte local1299 = 0;
			@Pc(1301) int local1301 = 0;
			@Pc(1320) byte local1320;
			@Pc(1340) short local1340;
			@Pc(1345) short local1345;
			@Pc(1350) short local1350;
			if (local1261 != -1) {
				if (local920 == -1) {
					local1297 = 1;
					local1289 = 1.0F;
					local1295 = 0.0F;
					local1285 = 0.0F;
					local1299 = 2;
					local1287 = 1.0F;
					local1291 = 1.0F;
					local1293 = 0.0F;
				} else {
					local920 &= 0xFF;
					local1320 = arg1.aByteArray32[local920];
					@Pc(1330) short local1330;
					@Pc(1335) short local1335;
					@Pc(1373) float local1373;
					@Pc(1382) float local1382;
					@Pc(1391) float local1391;
					@Pc(1475) float local1475;
					@Pc(1483) float local1483;
					@Pc(1492) float local1492;
					@Pc(1500) float local1500;
					@Pc(1508) float local1508;
					@Pc(1516) float local1516;
					if (local1320 == 0) {
						local1330 = arg1.aShortArray25[local1217];
						local1335 = arg1.aShortArray27[local1217];
						local1340 = arg1.aShortArray24[local1217];
						local1345 = arg1.aShortArray29[local920];
						local1350 = arg1.aShortArray30[local920];
						@Pc(1355) short local1355 = arg1.aShortArray26[local920];
						@Pc(1361) float local1361 = (float) arg1.anIntArray93[local1345];
						@Pc(1367) float local1367 = (float) arg1.anIntArray102[local1345];
						local1373 = (float) arg1.anIntArray99[local1345];
						local1382 = (float) arg1.anIntArray93[local1350] - local1361;
						local1391 = (float) arg1.anIntArray102[local1350] - local1367;
						@Pc(1399) float local1399 = (float) arg1.anIntArray99[local1350] - local1373;
						@Pc(1408) float local1408 = (float) arg1.anIntArray93[local1355] - local1361;
						@Pc(1417) float local1417 = (float) arg1.anIntArray102[local1355] - local1367;
						@Pc(1425) float local1425 = (float) arg1.anIntArray99[local1355] - local1373;
						@Pc(1433) float local1433 = (float) arg1.anIntArray93[local1330] - local1361;
						@Pc(1441) float local1441 = (float) arg1.anIntArray102[local1330] - local1367;
						@Pc(1449) float local1449 = (float) arg1.anIntArray99[local1330] - local1373;
						@Pc(1457) float local1457 = (float) arg1.anIntArray93[local1335] - local1361;
						@Pc(1466) float local1466 = (float) arg1.anIntArray102[local1335] - local1367;
						local1475 = (float) arg1.anIntArray99[local1335] - local1373;
						local1483 = (float) arg1.anIntArray93[local1340] - local1361;
						local1492 = (float) arg1.anIntArray102[local1340] - local1367;
						local1500 = (float) arg1.anIntArray99[local1340] - local1373;
						local1508 = local1391 * local1425 - local1417 * local1399;
						local1516 = local1408 * local1399 - local1382 * local1425;
						@Pc(1524) float local1524 = local1382 * local1417 - local1391 * local1408;
						@Pc(1532) float local1532 = local1417 * local1524 - local1516 * local1425;
						@Pc(1540) float local1540 = local1508 * local1425 - local1408 * local1524;
						@Pc(1549) float local1549 = local1516 * local1408 - local1417 * local1508;
						@Pc(1563) float local1563 = 1.0F / (local1399 * local1549 + local1382 * local1532 + local1391 * local1540);
						local1293 = local1563 * (local1549 * local1500 + local1483 * local1532 + local1540 * local1492);
						local1285 = local1563 * (local1540 * local1441 + local1532 * local1433 + local1549 * local1449);
						local1289 = local1563 * (local1457 * local1532 + local1466 * local1540 + local1475 * local1549);
						@Pc(1614) float local1614 = local1391 * local1524 - local1399 * local1516;
						@Pc(1623) float local1623 = local1516 * local1382 - local1391 * local1508;
						@Pc(1632) float local1632 = local1399 * local1508 - local1524 * local1382;
						@Pc(1646) float local1646 = 1.0F / (local1417 * local1632 + local1614 * local1408 + local1425 * local1623);
						local1287 = (local1614 * local1433 + local1632 * local1441 + local1623 * local1449) * local1646;
						local1295 = (local1614 * local1483 + local1492 * local1632 + local1623 * local1500) * local1646;
						local1291 = local1646 * (local1475 * local1623 + local1457 * local1614 + local1632 * local1466);
					} else {
						local1330 = arg1.aShortArray25[local1217];
						local1335 = arg1.aShortArray27[local1217];
						local1340 = arg1.aShortArray24[local1217];
						@Pc(1710) int local1710 = local885.anIntArray245[local920];
						@Pc(1715) int local1715 = local885.anIntArray246[local920];
						@Pc(1720) int local1720 = local885.anIntArray244[local920];
						@Pc(1725) float[] local1725 = local885.aFloatArrayArray5[local920];
						@Pc(1730) byte local1730 = arg1.aByteArray33[local920];
						local1373 = (float) arg1.anIntArray95[local920] / 256.0F;
						if (local1320 == 1) {
							local1382 = (float) arg1.anIntArray97[local920] / 1024.0F;
							Static584.method8113(local1715, arg1.anIntArray102[local1330], local1710, local1720, local1382, local1373, arg1.anIntArray93[local1330], local1730, local1725, Static227.aFloatArray37, arg1.anIntArray99[local1330]);
							local1285 = Static227.aFloatArray37[0];
							local1287 = Static227.aFloatArray37[1];
							Static584.method8113(local1715, arg1.anIntArray102[local1335], local1710, local1720, local1382, local1373, arg1.anIntArray93[local1335], local1730, local1725, Static227.aFloatArray37, arg1.anIntArray99[local1335]);
							local1289 = Static227.aFloatArray37[0];
							local1291 = Static227.aFloatArray37[1];
							Static584.method8113(local1715, arg1.anIntArray102[local1340], local1710, local1720, local1382, local1373, arg1.anIntArray93[local1340], local1730, local1725, Static227.aFloatArray37, arg1.anIntArray99[local1340]);
							local1295 = Static227.aFloatArray37[1];
							local1293 = Static227.aFloatArray37[0];
							local1391 = local1382 / 2.0F;
							if ((local1730 & 0x1) == 0) {
								if (local1289 - local1285 > local1391) {
									local1297 = 1;
									local1289 -= local1382;
								} else if (local1391 < local1285 - local1289) {
									local1289 += local1382;
									local1297 = 2;
								}
								if (local1293 - local1285 > local1391) {
									local1299 = 1;
									local1293 -= local1382;
								} else if (local1285 - local1293 > local1391) {
									local1299 = 2;
									local1293 += local1382;
								}
							} else {
								if (local1291 - local1287 > local1391) {
									local1291 -= local1382;
									local1297 = 1;
								} else if (local1287 - local1291 > local1391) {
									local1291 += local1382;
									local1297 = 2;
								}
								if (local1391 < local1295 - local1287) {
									local1295 -= local1382;
									local1299 = 1;
								} else if (local1391 < local1287 - local1295) {
									local1295 += local1382;
									local1299 = 2;
								}
							}
						} else if (local1320 == 2) {
							local1382 = (float) arg1.anIntArray98[local920] / 256.0F;
							local1391 = (float) arg1.anIntArray96[local920] / 256.0F;
							@Pc(2236) int local2236 = arg1.anIntArray93[local1335] - arg1.anIntArray93[local1330];
							@Pc(2247) int local2247 = arg1.anIntArray102[local1335] - arg1.anIntArray102[local1330];
							@Pc(2258) int local2258 = arg1.anIntArray99[local1335] - arg1.anIntArray99[local1330];
							@Pc(2269) int local2269 = arg1.anIntArray93[local1340] - arg1.anIntArray93[local1330];
							@Pc(2280) int local2280 = arg1.anIntArray102[local1340] - arg1.anIntArray102[local1330];
							@Pc(2291) int local2291 = arg1.anIntArray99[local1340] - arg1.anIntArray99[local1330];
							@Pc(2300) int local2300 = local2291 * local2247 - local2280 * local2258;
							@Pc(2308) int local2308 = local2258 * local2269 - local2236 * local2291;
							@Pc(2317) int local2317 = local2236 * local2280 - local2269 * local2247;
							local1475 = 64.0F / (float) arg1.anIntArray94[local920];
							local1483 = 64.0F / (float) arg1.anIntArray103[local920];
							local1492 = 64.0F / (float) arg1.anIntArray97[local920];
							local1500 = ((float) local2300 * local1725[0] + (float) local2308 * local1725[1] + local1725[2] * (float) local2317) / local1475;
							local1508 = ((float) local2317 * local1725[5] + (float) local2308 * local1725[4] + (float) local2300 * local1725[3]) / local1483;
							local1516 = ((float) local2317 * local1725[8] + (float) local2308 * local1725[7] + local1725[6] * (float) local2300) / local1492;
							local1301 = Static52.method950(local1508, local1516, local1500);
							Static528.method7839(local1725, local1710, local1730, local1720, local1373, Static227.aFloatArray37, local1715, local1301, arg1.anIntArray93[local1330], local1382, arg1.anIntArray99[local1330], arg1.anIntArray102[local1330], local1391);
							local1287 = Static227.aFloatArray37[1];
							local1285 = Static227.aFloatArray37[0];
							Static528.method7839(local1725, local1710, local1730, local1720, local1373, Static227.aFloatArray37, local1715, local1301, arg1.anIntArray93[local1335], local1382, arg1.anIntArray99[local1335], arg1.anIntArray102[local1335], local1391);
							local1291 = Static227.aFloatArray37[1];
							local1289 = Static227.aFloatArray37[0];
							Static528.method7839(local1725, local1710, local1730, local1720, local1373, Static227.aFloatArray37, local1715, local1301, arg1.anIntArray93[local1340], local1382, arg1.anIntArray99[local1340], arg1.anIntArray102[local1340], local1391);
							local1293 = Static227.aFloatArray37[0];
							local1295 = Static227.aFloatArray37[1];
						} else if (local1320 == 3) {
							Static3.method77(local1715, local1720, arg1.anIntArray99[local1330], local1725, arg1.anIntArray93[local1330], local1710, local1730, Static227.aFloatArray37, local1373, arg1.anIntArray102[local1330]);
							local1285 = Static227.aFloatArray37[0];
							local1287 = Static227.aFloatArray37[1];
							Static3.method77(local1715, local1720, arg1.anIntArray99[local1335], local1725, arg1.anIntArray93[local1335], local1710, local1730, Static227.aFloatArray37, local1373, arg1.anIntArray102[local1335]);
							local1291 = Static227.aFloatArray37[1];
							local1289 = Static227.aFloatArray37[0];
							Static3.method77(local1715, local1720, arg1.anIntArray99[local1340], local1725, arg1.anIntArray93[local1340], local1710, local1730, Static227.aFloatArray37, local1373, arg1.anIntArray102[local1340]);
							local1293 = Static227.aFloatArray37[0];
							local1295 = Static227.aFloatArray37[1];
							if ((local1730 & 0x1) == 0) {
								if (local1289 - local1285 > 0.5F) {
									local1289--;
									local1297 = 1;
								} else if (local1285 - local1289 > 0.5F) {
									local1297 = 2;
									local1289++;
								}
								if (local1293 - local1285 > 0.5F) {
									local1293--;
									local1299 = 1;
								} else if (local1285 - local1293 > 0.5F) {
									local1299 = 2;
									local1293++;
								}
							} else {
								if (local1295 - local1287 > 0.5F) {
									local1295--;
									local1299 = 1;
								} else if (local1287 - local1295 > 0.5F) {
									local1299 = 2;
									local1295++;
								}
								if (local1291 - local1287 > 0.5F) {
									local1291--;
									local1297 = 1;
								} else if (local1287 - local1291 > 0.5F) {
									local1291++;
									local1297 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray28 == null) {
				local1320 = 0;
			} else {
				local1320 = arg1.aByteArray28[local1217];
			}
			if (local1320 == 0) {
				@Pc(2692) long local2692 = ((long) local931 + (long) (local1301 << 24) + (long) (local1224 << 8) << 32) + (long) (local920 << 2);
				local1340 = arg1.aShortArray25[local1217];
				local1345 = arg1.aShortArray27[local1217];
				local1350 = arg1.aShortArray24[local1217];
				@Pc(2711) Class107 local2711 = local590[local1340];
				this.aShortArray48[local294] = this.method2818(local1287, local2711.anInt2320, arg1, local1340, local2711.anInt2319, local1285, local2692, local2711.anInt2317, local2711.anInt2314);
				@Pc(2735) Class107 local2735 = local590[local1345];
				this.aShortArray42[local294] = this.method2818(local1291, local2735.anInt2320, arg1, local1345, local2735.anInt2319, local1289, (long) local1297 + local2692, local2735.anInt2317, local2735.anInt2314);
				@Pc(2762) Class107 local2762 = local590[local1350];
				this.aShortArray43[local294] = this.method2818(local1295, local2762.anInt2320, arg1, local1350, local2762.anInt2319, local1293, (long) local1299 + local2692, local2762.anInt2317, local2762.anInt2314);
			} else if (local1320 == 1) {
				@Pc(2553) Class17 local2553 = local889[local1217];
				@Pc(2598) long local2598 = ((long) (local1224 << 8) + (long) (local1301 << 24) + (long) local931 << 32) + (long) ((local2553.anInt200 + 256 << 12) + (local920 << 2) + (local2553.anInt199 > 0 ? 1024 : 2048) + (local2553.anInt198 - -256 << 22));
				this.aShortArray48[local294] = this.method2818(local1287, local2553.anInt199, arg1, arg1.aShortArray25[local1217], local2553.anInt198, local1285, local2598, 0, local2553.anInt200);
				this.aShortArray42[local294] = this.method2818(local1291, local2553.anInt199, arg1, arg1.aShortArray27[local1217], local2553.anInt198, local1289, (long) local1297 + local2598, 0, local2553.anInt200);
				this.aShortArray43[local294] = this.method2818(local1295, local2553.anInt199, arg1, arg1.aShortArray24[local1217], local2553.anInt198, local1293, (long) local1299 + local2598, 0, local2553.anInt200);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray49[local294] = arg1.aByteArray29[local1217];
			}
			if (arg1.aShortArray23 != null) {
				this.aShortArray51[local294] = arg1.aShortArray23[local1217];
			}
			this.aShortArray41[local294] = arg1.aShortArray21[local1217];
			this.aShortArray49[local294] = local1261;
		}
		local1217 = 0;
		local910 = -10000;
		for (local920 = 0; local920 < this.anInt3188; local920++) {
			@Pc(2848) short local2848 = this.aShortArray49[local920];
			if (local2848 != local910) {
				local910 = local2848;
				local1217++;
			}
		}
		this.anIntArray188 = new int[local1217 + 1];
		local1217 = 0;
		local910 = -10000;
		for (local931 = 0; local931 < this.anInt3188; local931++) {
			local1261 = this.aShortArray49[local931];
			if (local1261 != local910) {
				this.anIntArray188[local1217++] = local931;
				local910 = local1261;
			}
		}
		this.anIntArray188[local1217] = this.anInt3188;
		Static491.aLongArray18 = null;
		this.aShortArray50 = Static397.method6081(this.aShortArray50, this.anInt3179);
		this.aShortArray47 = Static397.method6081(this.aShortArray47, this.anInt3179);
		this.aShortArray44 = Static397.method6081(this.aShortArray44, this.anInt3179);
		this.aByteArray48 = Static154.method2231(this.aByteArray48, this.anInt3179);
		this.aFloatArray15 = Static228.method3850(this.aFloatArray15, this.anInt3179);
		this.aFloatArray16 = Static228.method3850(this.aFloatArray16, this.anInt3179);
		if (arg1.anIntArray101 != null && Static660.method5892(arg2, this.anInt3133)) {
			this.anIntArrayArray21 = arg1.method1693(false);
		}
		if (arg1.aClass381Array1 != null && Static64.method1039(this.anInt3133, arg2)) {
			this.anIntArrayArray20 = arg1.method1682();
		}
		if (arg1.anIntArray100 != null && Static629.method8827(this.anInt3133, arg2)) {
			local942 = 0;
			@Pc(3019) int[] local3019 = new int[256];
			for (local964 = 0; local964 < this.anInt3171; local964++) {
				local975 = arg1.anIntArray100[local127[local964]];
				if (local975 >= 0) {
					@Pc(3036) int local3036 = local3019[local975]++;
					if (local975 > local942) {
						local942 = local975;
					}
				}
			}
			this.anIntArrayArray19 = new int[local942 + 1][];
			for (local975 = 0; local975 <= local942; local975++) {
				this.anIntArrayArray19[local975] = new int[local3019[local975]];
				local3019[local975] = 0;
			}
			for (local984 = 0; local984 < this.anInt3171; local984++) {
				local992 = arg1.anIntArray100[local127[local984]];
				if (local992 >= 0) {
					this.anIntArrayArray19[local992][local3019[local992]++] = local984;
				}
			}
		} else if (Static364.aBoolean92) {
		}
	}

	@OriginalMember(owner = "client!gea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3171; local7++) {
			if (this.aShortArray41[local7] == arg0) {
				this.aShortArray41[local7] = arg1;
			}
		}
		if (this.aClass242Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt3153; local42++) {
				@Pc(49) Class242 local49 = this.aClass242Array1[local42];
				@Pc(54) Class185 local54 = this.aClass185Array1[local42];
				local54.anInt5132 = local54.anInt5132 & 0xFF000000 | Static302.anIntArray299[this.aShortArray41[local49.anInt6778] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt3130 = arg0;
		this.aBoolean231 = true;
		if (this.aClass71_1 != null && (this.anInt3130 & 0x10000) == 0) {
			this.aShortArray44 = this.aClass71_1.aShortArray18;
			this.aShortArray50 = this.aClass71_1.aShortArray20;
			this.aShortArray47 = this.aClass71_1.aShortArray19;
			this.aByteArray48 = this.aClass71_1.aByteArray24;
			this.aClass71_1 = null;
		}
		this.method2824();
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "()[Lclient!tm;")
	@Override
	public Class352[] method5304() {
		return this.aClass352Array2;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3140; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray189[local15] + this.anIntArray191[local15] * local9 >> 14;
			this.anIntArray191[local15] = this.anIntArray191[local15] * local13 - this.anIntArray189[local15] * local9 >> 14;
			this.anIntArray189[local15] = local33;
		}
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
		this.aBoolean228 = false;
	}

	@OriginalMember(owner = "client!gea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static280.anInt5163 = 0;
			Static216.anInt6459 = 0;
			local16 = 0;
			Static356.anInt6089 = 0;
			for (local20 = 0; local20 < this.anInt3140; local20++) {
				Static356.anInt6089 += this.anIntArray189[local20];
				Static216.anInt6459 += this.anIntArray190[local20];
				Static280.anInt5163 += this.anIntArray191[local20];
				local16++;
			}
			if (local16 <= 0) {
				Static216.anInt6459 = arg2;
				Static356.anInt6089 = arg1;
				Static280.anInt5163 = arg3;
			} else {
				Static356.anInt6089 = arg1 + Static356.anInt6089 / local16;
				Static280.anInt5163 = arg3 + Static280.anInt5163 / local16;
				Static216.anInt6459 = Static216.anInt6459 / local16 + arg2;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt3140; local16++) {
				this.anIntArray189[local16] += arg1;
				this.anIntArray190[local16] += arg2;
				this.anIntArray191[local16] += arg3;
			}
		} else {
			@Pc(183) int local183;
			@Pc(201) int local201;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt3140; local16++) {
					this.anIntArray189[local16] -= Static356.anInt6089;
					this.anIntArray190[local16] -= Static216.anInt6459;
					this.anIntArray191[local16] -= Static280.anInt5163;
					if (arg3 != 0) {
						local20 = Class141.anIntArray207[arg3];
						local183 = Class141.anIntArray208[arg3];
						local201 = local183 * this.anIntArray189[local16] + local20 * this.anIntArray190[local16] + 16383 >> 14;
						this.anIntArray190[local16] = this.anIntArray190[local16] * local183 + 16383 - local20 * this.anIntArray189[local16] >> 14;
						this.anIntArray189[local16] = local201;
					}
					if (arg1 != 0) {
						local20 = Class141.anIntArray207[arg1];
						local183 = Class141.anIntArray208[arg1];
						local201 = local183 * this.anIntArray190[local16] + 16383 - local20 * this.anIntArray191[local16] >> 14;
						this.anIntArray191[local16] = this.anIntArray190[local16] * local20 + local183 * this.anIntArray191[local16] + 16383 >> 14;
						this.anIntArray190[local16] = local201;
					}
					if (arg2 != 0) {
						local20 = Class141.anIntArray207[arg2];
						local183 = Class141.anIntArray208[arg2];
						local201 = local183 * this.anIntArray189[local16] + local20 * this.anIntArray191[local16] + 16383 >> 14;
						this.anIntArray191[local16] = this.anIntArray191[local16] * local183 + 16383 - this.anIntArray189[local16] * local20 >> 14;
						this.anIntArray189[local16] = local201;
					}
					this.anIntArray189[local16] += Static356.anInt6089;
					this.anIntArray190[local16] += Static216.anInt6459;
					this.anIntArray191[local16] += Static280.anInt5163;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt3140; local16++) {
					this.anIntArray189[local16] -= Static356.anInt6089;
					this.anIntArray190[local16] -= Static216.anInt6459;
					this.anIntArray191[local16] -= Static280.anInt5163;
					this.anIntArray189[local16] = this.anIntArray189[local16] * arg1 / 128;
					this.anIntArray190[local16] = arg2 * this.anIntArray190[local16] / 128;
					this.anIntArray191[local16] = this.anIntArray191[local16] * arg3 / 128;
					this.anIntArray189[local16] += Static356.anInt6089;
					this.anIntArray190[local16] += Static216.anInt6459;
					this.anIntArray191[local16] += Static280.anInt5163;
				}
			} else {
				@Pc(556) Class242 local556;
				@Pc(561) Class185 local561;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt3171; local16++) {
						local20 = (this.aByteArray49[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray49[local16] = (byte) local20;
					}
					if (this.aClass380_1 != null) {
						this.aClass380_1.anInterface12_7 = null;
					}
					if (this.aClass242Array1 != null) {
						for (local20 = 0; local20 < this.anInt3153; local20++) {
							local556 = this.aClass242Array1[local20];
							local561 = this.aClass185Array1[local20];
							local561.anInt5132 = local561.anInt5132 & 0xFFFFFF | 255 - (this.aByteArray49[local556.anInt6778] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt3171; local16++) {
						local20 = this.aShortArray41[local16] & 0xFFFF;
						local183 = local20 >> 10 & 0x3F;
						local201 = local20 >> 7 & 0x7;
						@Pc(619) int local619 = arg1 + local183 & 0x3F;
						@Pc(623) int local623 = local20 & 0x7F;
						local201 += arg2 / 4;
						local623 += arg3;
						if (local201 < 0) {
							local201 = 0;
						} else if (local201 > 7) {
							local201 = 7;
						}
						if (local623 < 0) {
							local623 = 0;
						} else if (local623 > 127) {
							local623 = 127;
						}
						this.aShortArray41[local16] = (short) (local201 << 7 | local619 << 10 | local623);
					}
					if (this.aClass380_1 != null) {
						this.aClass380_1.anInterface12_7 = null;
					}
					if (this.aClass242Array1 != null) {
						for (local20 = 0; local20 < this.anInt3153; local20++) {
							local556 = this.aClass242Array1[local20];
							local561 = this.aClass185Array1[local20];
							local561.anInt5132 = Static302.anIntArray299[this.aShortArray41[local556.anInt6778] & 0xFFFF] & 0xFFFFFF | local561.anInt5132 & 0xFF000000;
						}
					}
				} else {
					@Pc(755) Class185 local755;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt3153; local16++) {
							local755 = this.aClass185Array1[local16];
							local755.anInt5135 += arg1;
							local755.anInt5129 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt3153; local16++) {
							local755 = this.aClass185Array1[local16];
							local755.anInt5137 = arg2 * local755.anInt5137 >> 7;
							local755.anInt5136 = local755.anInt5136 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt3153; local16++) {
							local755 = this.aClass185Array1[local16];
							local755.anInt5131 = local755.anInt5131 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray21 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt3185; local13++) {
			this.anIntArray189[local13] <<= 0x4;
			this.anIntArray190[local13] <<= 0x4;
			this.anIntArray191[local13] <<= 0x4;
		}
		Static280.anInt5163 = 0;
		Static216.anInt6459 = 0;
		Static356.anInt6089 = 0;
		return true;
	}

	@OriginalMember(owner = "client!gea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort37;
	}

	@OriginalMember(owner = "client!gea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort39;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!rd;IZ)V")
	@Override
	public void method5305(@OriginalArg(0) Class263 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray46 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3140; local15++) {
			if ((arg1 & this.aShortArray46[local15]) != 0) {
				if (arg2) {
					arg0.method8448(this.anIntArray189[local15], this.anIntArray190[local15], this.anIntArray191[local15], local13);
				} else {
					arg0.method8440(this.anIntArray189[local15], this.anIntArray190[local15], this.anIntArray191[local15], local13);
				}
				this.anIntArray189[local15] = local13[0];
				this.anIntArray190[local15] = local13[1];
				this.anIntArray191[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean229;
	}

	@OriginalMember(owner = "client!gea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3140; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray190[local15] - local9 * this.anIntArray191[local15] >> 14;
			this.anIntArray191[local15] = this.anIntArray190[local15] * local9 + this.anIntArray191[local15] * local13 >> 14;
			this.anIntArray190[local15] = local34;
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort41;
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "()[B")
	@Override
	public byte[] method5295() {
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZIIIIIIII)Z")
	private boolean method2813(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg3 && arg5 < arg7 && arg5 < arg1) {
			return false;
		} else if (arg5 > arg3 && arg7 < arg5 && arg1 < arg5) {
			return false;
		} else if (arg2 > arg6 && arg6 < arg0 && arg4 > arg6) {
			return false;
		} else {
			return arg6 <= arg2 || arg6 <= arg0 || arg4 >= arg6;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!vja;)V")
	private void method2814(@OriginalArg(1) Class14_Sub2_Sub5_Sub2 arg0) {
		if (this.aClass144_Sub3_11.anIntArray419.length < this.anInt3179) {
			this.aClass144_Sub3_11.anIntArray418 = new int[this.anInt3179];
			this.aClass144_Sub3_11.anIntArray419 = new int[this.anInt3179];
		}
		@Pc(42) int[] local42 = this.aClass144_Sub3_11.anIntArray419;
		@Pc(46) int[] local46 = this.aClass144_Sub3_11.anIntArray418;
		@Pc(74) int local74;
		@Pc(111) int local111;
		@Pc(120) int local120;
		for (@Pc(48) int local48 = 0; local48 < this.anInt3140; local48++) {
			local74 = (this.anIntArray189[local48] - (this.anIntArray190[local48] * this.aClass144_Sub3_11.anInt8086 >> 8) >> this.aClass144_Sub3_11.anInt8053) - arg0.anInt10650;
			@Pc(97) int local97 = (this.anIntArray191[local48] - (this.anIntArray190[local48] * this.aClass144_Sub3_11.anInt8090 >> 8) >> this.aClass144_Sub3_11.anInt8053) - arg0.anInt10655;
			@Pc(102) int local102 = this.anIntArray187[local48];
			@Pc(109) int local109 = this.anIntArray187[local48 + 1];
			for (local111 = local102; local111 < local109; local111++) {
				local120 = this.aShortArray45[local111] - 1;
				if (local120 == -1) {
					break;
				}
				local42[local120] = local74;
				local46[local120] = local97;
			}
		}
		for (local74 = 0; local74 < this.anInt3188; local74++) {
			if (this.aByteArray49 == null || this.aByteArray49[local74] <= 128) {
				@Pc(178) short local178 = this.aShortArray48[local74];
				@Pc(183) short local183 = this.aShortArray42[local74];
				@Pc(188) short local188 = this.aShortArray43[local74];
				local111 = local42[local178];
				local120 = local42[local183];
				@Pc(200) int local200 = local42[local188];
				@Pc(204) int local204 = local46[local178];
				@Pc(208) int local208 = local46[local183];
				@Pc(212) int local212 = local46[local188];
				if (-((local200 - local120) * (-local204 + local208)) + (local208 - local212) * (local111 + -local120) > 0) {
					arg0.method9102(local204, local212, local208, local200, local120, local111);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!rd;)V")
	@Override
	public void method5294(@OriginalArg(0) Class263 arg0) {
		@Pc(8) Class263_Sub1 local8 = (Class263_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass352Array2 != null) {
			for (local13 = 0; local13 < this.aClass352Array2.length; local13++) {
				@Pc(20) Class352 local20 = this.aClass352Array2[local13];
				@Pc(22) Class352 local22 = local20;
				if (local20.aClass352_2 != null) {
					local22 = local20.aClass352_2;
				}
				local22.anInt9774 = (int) ((float) this.anIntArray191[local20.anInt9767] * local8.aFloat131 + local8.aFloat126 * (float) this.anIntArray189[local20.anInt9767] + (float) this.anIntArray190[local20.anInt9767] * local8.aFloat133 + local8.aFloat130);
				local22.anInt9769 = (int) ((float) this.anIntArray191[local20.anInt9767] * local8.aFloat132 + local8.aFloat122 * (float) this.anIntArray190[local20.anInt9767] + local8.aFloat129 * (float) this.anIntArray189[local20.anInt9767] + local8.aFloat128);
				local22.anInt9776 = (int) (local8.aFloat125 * (float) this.anIntArray190[local20.anInt9767] + local8.aFloat123 * (float) this.anIntArray189[local20.anInt9767] + local8.aFloat124 * (float) this.anIntArray191[local20.anInt9767] + local8.aFloat127);
				local22.anInt9780 = (int) ((float) this.anIntArray191[local20.anInt9765] * local8.aFloat131 + (float) this.anIntArray189[local20.anInt9765] * local8.aFloat126 + (float) this.anIntArray190[local20.anInt9765] * local8.aFloat133 + local8.aFloat130);
				local22.anInt9778 = (int) (local8.aFloat128 + local8.aFloat122 * (float) this.anIntArray190[local20.anInt9765] + local8.aFloat129 * (float) this.anIntArray189[local20.anInt9765] + (float) this.anIntArray191[local20.anInt9765] * local8.aFloat132);
				local22.anInt9775 = (int) (local8.aFloat127 + (float) this.anIntArray190[local20.anInt9765] * local8.aFloat125 + (float) this.anIntArray189[local20.anInt9765] * local8.aFloat123 + local8.aFloat124 * (float) this.anIntArray191[local20.anInt9765]);
				local22.anInt9766 = (int) (local8.aFloat133 * (float) this.anIntArray190[local20.anInt9772] + local8.aFloat126 * (float) this.anIntArray189[local20.anInt9772] + local8.aFloat131 * (float) this.anIntArray191[local20.anInt9772] + local8.aFloat130);
				local22.anInt9768 = (int) (local8.aFloat129 * (float) this.anIntArray189[local20.anInt9772] + (float) this.anIntArray190[local20.anInt9772] * local8.aFloat122 + (float) this.anIntArray191[local20.anInt9772] * local8.aFloat132 + local8.aFloat128);
				local22.anInt9777 = (int) (local8.aFloat125 * (float) this.anIntArray190[local20.anInt9772] + local8.aFloat123 * (float) this.anIntArray189[local20.anInt9772] + (float) this.anIntArray191[local20.anInt9772] * local8.aFloat124 + local8.aFloat127);
			}
		}
		if (this.aClass172Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass172Array2.length; local13++) {
			@Pc(367) Class172 local367 = this.aClass172Array2[local13];
			@Pc(369) Class172 local369 = local367;
			if (local367.aClass172_2 != null) {
				local369 = local367.aClass172_2;
			}
			if (local367.aClass263_3 == null) {
				local367.aClass263_3 = local8.method8434();
			} else {
				local367.aClass263_3.method8437(local8);
			}
			local369.anInt4763 = (int) (local8.aFloat130 + (float) this.anIntArray190[local367.anInt4761] * local8.aFloat133 + local8.aFloat126 * (float) this.anIntArray189[local367.anInt4761] + (float) this.anIntArray191[local367.anInt4761] * local8.aFloat131);
			local369.anInt4756 = (int) ((float) this.anIntArray190[local367.anInt4761] * local8.aFloat122 + (float) this.anIntArray189[local367.anInt4761] * local8.aFloat129 + (float) this.anIntArray191[local367.anInt4761] * local8.aFloat132 + local8.aFloat128);
			local369.anInt4758 = (int) ((float) this.anIntArray191[local367.anInt4761] * local8.aFloat124 + (float) this.anIntArray190[local367.anInt4761] * local8.aFloat125 + local8.aFloat123 * (float) this.anIntArray189[local367.anInt4761] + local8.aFloat127);
		}
	}

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3140; local15++) {
			local34 = local9 * this.anIntArray191[local15] + this.anIntArray189[local15] * local13 >> 14;
			this.anIntArray191[local15] = local13 * this.anIntArray191[local15] - this.anIntArray189[local15] * local9 >> 14;
			this.anIntArray189[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt3179; local34++) {
			@Pc(89) int local89 = this.aShortArray44[local34] * local9 + this.aShortArray50[local34] * local13 >> 14;
			this.aShortArray44[local34] = (short) (local13 * this.aShortArray44[local34] - this.aShortArray50[local34] * local9 >> 14);
			this.aShortArray50[local34] = (short) local89;
		}
		if (this.aClass380_4 == null && this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
		if (this.aClass380_4 != null) {
			this.aClass380_4.anInterface12_7 = null;
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass144_Sub3_11.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3171; local11++) {
			if (arg0 == this.aShortArray49[local11]) {
				this.aShortArray49[local11] = arg1;
			}
		}
		@Pc(43) byte local43 = 0;
		@Pc(45) byte local45 = 0;
		if (arg0 != -1) {
			@Pc(58) Class69 local58 = local9.method8975(arg0 & 0xFFFF);
			local45 = local58.aByte20;
			local43 = local58.aByte22;
		}
		@Pc(66) byte local66 = 0;
		@Pc(68) byte local68 = 0;
		if (arg1 != -1) {
			@Pc(78) Class69 local78 = local9.method8975(arg1 & 0xFFFF);
			local66 = local78.aByte22;
			if (local78.aByte23 != 0 || local78.aByte24 != 0) {
				this.aBoolean229 = true;
			}
			local68 = local78.aByte20;
		}
		if (!(local66 != local43 | local45 != local68)) {
			return;
		}
		if (this.aClass242Array1 != null) {
			for (@Pc(130) int local130 = 0; local130 < this.anInt3153; local130++) {
				@Pc(137) Class242 local137 = this.aClass242Array1[local130];
				@Pc(142) Class185 local142 = this.aClass185Array1[local130];
				local142.anInt5132 = Static302.anIntArray299[this.aShortArray41[local137.anInt6778] & 0xFFFF] & 0xFFFFFF | local142.anInt5132 & 0xFF000000;
			}
		}
		if (this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "g", descriptor = "()V")
	@Override
	protected void method5309() {
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V")
	private void method2815() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3140; local23++) {
			@Pc(30) int local30 = this.anIntArray189[local23];
			@Pc(35) int local35 = this.anIntArray190[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(58) int local58 = this.anIntArray191[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local11 > local58) {
				local11 = local58;
			}
			if (local58 > local17) {
				local17 = local58;
			}
			@Pc(94) int local94 = local58 * local58 + local30 * local30;
			if (local94 > local19) {
				local19 = local94;
			}
			local94 = local35 * local35 + local58 * local58 + local30 * local30;
			if (local21 < local94) {
				local21 = local94;
			}
		}
		this.aShort33 = (short) local13;
		this.aShort35 = (short) local7;
		this.aShort36 = (short) local9;
		this.aShort34 = (short) local15;
		this.aShort38 = (short) local11;
		this.aShort40 = (short) local17;
		this.aShort32 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort39 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean228 = true;
	}

	@OriginalMember(owner = "client!gea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5303(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5;
		if (arg1 == null) {
			for (local5 = 0; local5 < this.anInt3171; local5++) {
				this.aByteArray49[local5] = arg0;
			}
		} else {
			for (local5 = 0; local5 < this.anInt3171; local5++) {
				@Pc(56) int local56 = 255 - (255 - (arg0 & 0xFF)) * (-(arg1[local5] & 0xFF) + 255) / 255;
				this.aByteArray49[local5] = (byte) local56;
			}
		}
		Static188.anInt3129++;
		if (this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort36;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BLclient!gea;IZLclient!gea;Z)Lclient!ka;")
	private Class129 method2816(@OriginalArg(1) Class129_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class129_Sub1 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt3133 = this.anInt3133;
		arg3.anInt3130 = arg1;
		arg3.anInt3179 = this.anInt3179;
		arg3.aByte67 = 0;
		arg3.aShort37 = this.aShort37;
		arg3.anInt3171 = this.anInt3171;
		arg3.anInt3140 = this.anInt3140;
		arg3.aBoolean229 = this.aBoolean229;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean230 = this.aBoolean230;
		} else {
			arg3.aBoolean230 = true;
		}
		arg3.anInt3153 = this.anInt3153;
		arg3.anInt3188 = this.anInt3188;
		arg3.anInt3185 = this.anInt3185;
		arg3.aShort41 = this.aShort41;
		@Pc(74) boolean local74 = Static579.method8822(this.anInt3133, arg1);
		@Pc(80) boolean local80 = Static86.method1433(arg1, this.anInt3133);
		@Pc(86) boolean local86 = Static614.method8657(arg1, this.anInt3133);
		@Pc(92) boolean local92 = local80 | local74 | local86;
		@Pc(225) int local225;
		if (local92) {
			if (!local74) {
				arg3.anIntArray189 = this.anIntArray189;
			} else if (arg0.anIntArray189 == null || arg0.anIntArray189.length < this.anInt3185) {
				arg3.anIntArray189 = arg0.anIntArray189 = new int[this.anInt3185];
			} else {
				arg3.anIntArray189 = arg0.anIntArray189;
			}
			if (!local80) {
				arg3.anIntArray190 = this.anIntArray190;
			} else if (arg0.anIntArray190 == null || arg0.anIntArray190.length < this.anInt3185) {
				arg3.anIntArray190 = arg0.anIntArray190 = new int[this.anInt3185];
			} else {
				arg3.anIntArray190 = arg0.anIntArray190;
			}
			if (!local86) {
				arg3.anIntArray191 = this.anIntArray191;
			} else if (arg0.anIntArray191 == null || this.anInt3185 > arg0.anIntArray191.length) {
				arg3.anIntArray191 = arg0.anIntArray191 = new int[this.anInt3185];
			} else {
				arg3.anIntArray191 = arg0.anIntArray191;
			}
			for (local225 = 0; local225 < this.anInt3185; local225++) {
				if (local74) {
					arg3.anIntArray189[local225] = this.anIntArray189[local225];
				}
				if (local80) {
					arg3.anIntArray190[local225] = this.anIntArray190[local225];
				}
				if (local86) {
					arg3.anIntArray191[local225] = this.anIntArray191[local225];
				}
			}
		} else {
			arg3.anIntArray190 = this.anIntArray190;
			arg3.anIntArray191 = this.anIntArray191;
			arg3.anIntArray189 = this.anIntArray189;
		}
		if (Static63.method1036(arg1, this.anInt3133)) {
			arg3.aClass380_2 = arg0.aClass380_2;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x1);
			}
			arg3.aClass380_2.anInterface12_7 = this.aClass380_2.anInterface12_7;
			arg3.aClass380_2.aByte143 = this.aClass380_2.aByte143;
		} else if (Static540.method7939(this.anInt3133, arg1)) {
			arg3.aClass380_2 = this.aClass380_2;
		} else {
			arg3.aClass380_2 = null;
		}
		if (Static585.method8347(arg1, this.anInt3133)) {
			if (arg0.aShortArray41 == null || arg0.aShortArray41.length < this.anInt3171) {
				arg3.aShortArray41 = arg0.aShortArray41 = new short[this.anInt3171];
			} else {
				arg3.aShortArray41 = arg0.aShortArray41;
			}
			for (local225 = 0; local225 < this.anInt3171; local225++) {
				arg3.aShortArray41[local225] = this.aShortArray41[local225];
			}
		} else {
			arg3.aShortArray41 = this.aShortArray41;
		}
		if (Static595.method8430(arg1, this.anInt3133)) {
			if (arg0.aByteArray49 == null || this.anInt3171 > arg0.aByteArray49.length) {
				arg3.aByteArray49 = arg0.aByteArray49 = new byte[this.anInt3171];
			} else {
				arg3.aByteArray49 = arg0.aByteArray49;
			}
			for (local225 = 0; local225 < this.anInt3171; local225++) {
				arg3.aByteArray49[local225] = this.aByteArray49[local225];
			}
		} else {
			arg3.aByteArray49 = this.aByteArray49;
		}
		if (Static497.method7459(this.anInt3133, arg1)) {
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x2);
			}
			arg3.aClass380_1 = arg0.aClass380_1;
			arg3.aClass380_1.anInterface12_7 = this.aClass380_1.anInterface12_7;
			arg3.aClass380_1.aByte143 = this.aClass380_1.aByte143;
		} else if (Static7.method105(arg1, this.anInt3133)) {
			arg3.aClass380_1 = this.aClass380_1;
		} else {
			arg3.aClass380_1 = null;
		}
		@Pc(713) int local713;
		if (Static511.method7646(this.anInt3133, arg1)) {
			if (arg0.aShortArray50 == null || arg0.aShortArray50.length < this.anInt3179) {
				local225 = this.anInt3179;
				arg3.aShortArray47 = arg0.aShortArray47 = new short[local225];
				arg3.aShortArray50 = arg0.aShortArray50 = new short[local225];
				arg3.aShortArray44 = arg0.aShortArray44 = new short[local225];
			} else {
				arg3.aShortArray50 = arg0.aShortArray50;
				arg3.aShortArray47 = arg0.aShortArray47;
				arg3.aShortArray44 = arg0.aShortArray44;
			}
			if (this.aClass71_1 == null) {
				for (local225 = 0; local225 < this.anInt3179; local225++) {
					arg3.aShortArray50[local225] = this.aShortArray50[local225];
					arg3.aShortArray47[local225] = this.aShortArray47[local225];
					arg3.aShortArray44[local225] = this.aShortArray44[local225];
				}
			} else {
				if (arg0.aClass71_1 == null) {
					arg0.aClass71_1 = new Class71();
				}
				@Pc(699) Class71 local699 = arg3.aClass71_1 = arg0.aClass71_1;
				if (local699.aShortArray20 == null || local699.aShortArray20.length < this.anInt3179) {
					local713 = this.anInt3179;
					local699.aByteArray24 = new byte[local713];
					local699.aShortArray20 = new short[local713];
					local699.aShortArray19 = new short[local713];
					local699.aShortArray18 = new short[local713];
				}
				for (local713 = 0; local713 < this.anInt3179; local713++) {
					arg3.aShortArray50[local713] = this.aShortArray50[local713];
					arg3.aShortArray47[local713] = this.aShortArray47[local713];
					arg3.aShortArray44[local713] = this.aShortArray44[local713];
					local699.aShortArray20[local713] = this.aClass71_1.aShortArray20[local713];
					local699.aShortArray19[local713] = this.aClass71_1.aShortArray19[local713];
					local699.aShortArray18[local713] = this.aClass71_1.aShortArray18[local713];
					local699.aByteArray24[local713] = this.aClass71_1.aByteArray24[local713];
				}
			}
			arg3.aByteArray48 = this.aByteArray48;
		} else {
			arg3.aShortArray50 = this.aShortArray50;
			arg3.aShortArray47 = this.aShortArray47;
			arg3.aShortArray44 = this.aShortArray44;
			arg3.aClass71_1 = this.aClass71_1;
			arg3.aByteArray48 = this.aByteArray48;
		}
		if (Static333.method8698(arg1, this.anInt3133)) {
			arg3.aClass380_4 = arg0.aClass380_4;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x4);
			}
			arg3.aClass380_4.anInterface12_7 = this.aClass380_4.anInterface12_7;
			arg3.aClass380_4.aByte143 = this.aClass380_4.aByte143;
		} else if (Static474.method7099(arg1, this.anInt3133)) {
			arg3.aClass380_4 = this.aClass380_4;
		} else {
			arg3.aClass380_4 = null;
		}
		if (Static588.method8382(this.anInt3133, arg1)) {
			if (arg0.aFloatArray15 == null || this.anInt3171 > arg0.aFloatArray15.length) {
				local225 = this.anInt3179;
				arg3.aFloatArray16 = arg0.aFloatArray16 = new float[local225];
				arg3.aFloatArray15 = arg0.aFloatArray15 = new float[local225];
			} else {
				arg3.aFloatArray15 = arg0.aFloatArray15;
				arg3.aFloatArray16 = arg0.aFloatArray16;
			}
			for (local225 = 0; local225 < this.anInt3179; local225++) {
				arg3.aFloatArray15[local225] = this.aFloatArray15[local225];
				arg3.aFloatArray16[local225] = this.aFloatArray16[local225];
			}
		} else {
			arg3.aFloatArray15 = this.aFloatArray15;
			arg3.aFloatArray16 = this.aFloatArray16;
		}
		if (Static531.method7865(this.anInt3133, arg1)) {
			arg3.aClass380_3 = arg0.aClass380_3;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x8);
			}
			arg3.aClass380_3.anInterface12_7 = this.aClass380_3.anInterface12_7;
			arg3.aClass380_3.aByte143 = this.aClass380_3.aByte143;
		} else if (Static372.method5788(this.anInt3133, arg1)) {
			arg3.aClass380_3 = this.aClass380_3;
		} else {
			arg3.aClass380_3 = null;
		}
		if (Static376.method7670(arg1, this.anInt3133)) {
			if (arg0.aShortArray48 == null || arg0.aShortArray48.length < this.anInt3171) {
				local225 = this.anInt3171;
				arg3.aShortArray42 = arg0.aShortArray42 = new short[local225];
				arg3.aShortArray48 = arg0.aShortArray48 = new short[local225];
				arg3.aShortArray43 = arg0.aShortArray43 = new short[local225];
			} else {
				arg3.aShortArray48 = arg0.aShortArray48;
				arg3.aShortArray42 = arg0.aShortArray42;
				arg3.aShortArray43 = arg0.aShortArray43;
			}
			for (local225 = 0; local225 < this.anInt3171; local225++) {
				arg3.aShortArray48[local225] = this.aShortArray48[local225];
				arg3.aShortArray42[local225] = this.aShortArray42[local225];
				arg3.aShortArray43[local225] = this.aShortArray43[local225];
			}
		} else {
			arg3.aShortArray48 = this.aShortArray48;
			arg3.aShortArray42 = this.aShortArray42;
			arg3.aShortArray43 = this.aShortArray43;
		}
		if (Static245.method4089(arg1, this.anInt3133)) {
			arg3.aClass248_1 = arg0.aClass248_1;
			if (arg2) {
				arg3.aByte67 = (byte) (arg3.aByte67 | 0x10);
			}
			arg3.aClass248_1.anInterface6_2 = this.aClass248_1.anInterface6_2;
		} else if (Static385.method5885(this.anInt3133, arg1)) {
			arg3.aClass248_1 = this.aClass248_1;
		} else {
			arg3.aClass248_1 = null;
		}
		if (Static438.method6534(this.anInt3133, arg1)) {
			if (arg0.aShortArray49 == null || arg0.aShortArray49.length < this.anInt3171) {
				local225 = this.anInt3171;
				arg3.aShortArray49 = arg0.aShortArray49 = new short[local225];
			} else {
				arg3.aShortArray49 = arg0.aShortArray49;
			}
			for (local225 = 0; local225 < this.anInt3171; local225++) {
				arg3.aShortArray49[local225] = this.aShortArray49[local225];
			}
		} else {
			arg3.aShortArray49 = this.aShortArray49;
		}
		if (!Static487.method7353(arg1, this.anInt3133)) {
			arg3.aClass185Array1 = this.aClass185Array1;
		} else if (arg0.aClass185Array1 == null || this.anInt3153 > arg0.aClass185Array1.length) {
			local225 = this.anInt3153;
			arg3.aClass185Array1 = arg0.aClass185Array1 = new Class185[local225];
			for (local713 = 0; local713 < this.anInt3153; local713++) {
				arg3.aClass185Array1[local713] = this.aClass185Array1[local713].method4676();
			}
		} else {
			arg3.aClass185Array1 = arg0.aClass185Array1;
			for (local225 = 0; local225 < this.anInt3153; local225++) {
				arg3.aClass185Array1[local225].method4675(this.aClass185Array1[local225]);
			}
		}
		arg3.anIntArray187 = this.anIntArray187;
		arg3.aShortArray51 = this.aShortArray51;
		arg3.aShortArray46 = this.aShortArray46;
		arg3.aClass172Array2 = this.aClass172Array2;
		if (this.aBoolean228) {
			arg3.aBoolean228 = true;
			arg3.aShort35 = this.aShort35;
			arg3.aShort38 = this.aShort38;
			arg3.aShort33 = this.aShort33;
			arg3.aShort39 = this.aShort39;
			arg3.aShort34 = this.aShort34;
			arg3.aShort32 = this.aShort32;
			arg3.aShort40 = this.aShort40;
			arg3.aShort36 = this.aShort36;
		} else {
			arg3.aBoolean228 = false;
		}
		arg3.aClass352Array2 = this.aClass352Array2;
		arg3.anIntArrayArray20 = this.anIntArrayArray20;
		arg3.anIntArrayArray19 = this.anIntArrayArray19;
		arg3.anIntArray188 = this.anIntArray188;
		arg3.aClass242Array1 = this.aClass242Array1;
		arg3.anIntArrayArray21 = this.anIntArrayArray21;
		arg3.aShortArray45 = this.aShortArray45;
		return arg3;
	}

	@OriginalMember(owner = "client!gea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort38;
	}

	@OriginalMember(owner = "client!gea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3140; local7++) {
			if (arg0 != 128) {
				this.anIntArray189[local7] = arg0 * this.anIntArray189[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray190[local7] = arg1 * this.anIntArray190[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray191[local7] = this.anIntArray191[local7] * arg2 >> 7;
			}
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort37 = (short) arg0;
		if (this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean230;
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V")
	private void method2817() {
		if (this.anInt3188 == 0) {
			return;
		}
		if (this.aByte67 != 0) {
			this.method2820(true);
		}
		this.method2820(false);
		if (this.aClass248_1 != null) {
			if (this.aClass248_1.anInterface6_2 == null) {
				this.method2823((this.aByte67 & 0x10) != 0);
			}
			if (this.aClass248_1.anInterface6_2 != null) {
				this.aClass144_Sub3_11.method7015(this.aClass380_4 != null);
				this.aClass144_Sub3_11.method6978(this.aClass380_3, this.aClass380_2, this.aClass380_4, this.aClass380_1);
				@Pc(94) int local94 = this.anIntArray188.length - 1;
				for (@Pc(96) int local96 = 0; local96 < local94; local96++) {
					@Pc(103) int local103 = this.anIntArray188[local96];
					@Pc(110) int local110 = this.anIntArray188[local96 + 1];
					@Pc(117) int local117 = this.aShortArray49[local103] & 0xFFFF;
					if (local117 == 65535) {
						local117 = -1;
					}
					this.aClass144_Sub3_11.method7009(this.aClass380_4 != null, local117);
					this.aClass144_Sub3_11.method7029(this.aClass248_1.anInterface6_2, (local110 - local103) * 3, local103 * 3);
				}
			}
		}
		this.method2824();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!rd;ZII)Z")
	@Override
	public boolean method5302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method2822(arg4, arg3, arg2, arg5, arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class141.anIntArray207[arg0];
		@Pc(13) int local13 = Class141.anIntArray208[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3140; local15++) {
			@Pc(35) int local35 = this.anIntArray189[local15] * local13 + this.anIntArray190[local15] * local9 >> 14;
			this.anIntArray190[local15] = this.anIntArray190[local15] * local13 - local9 * this.anIntArray189[local15] >> 14;
			this.anIntArray189[local15] = local35;
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(FILclient!dea;IIIFJII)S")
	private short method2818(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray187[arg3];
		@Pc(17) int local17 = this.anIntArray187[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(38) short local38 = this.aShortArray45[local21];
			if (local38 == 0) {
				local19 = local21;
				break;
			}
			if (arg6 == Static491.aLongArray18[local21]) {
				return (short) (local38 - 1);
			}
		}
		this.aShortArray45[local19] = (short) (this.anInt3179 + 1);
		Static491.aLongArray18[local19] = arg6;
		this.aShortArray50[this.anInt3179] = (short) arg1;
		this.aShortArray47[this.anInt3179] = (short) arg8;
		this.aShortArray44[this.anInt3179] = (short) arg4;
		this.aByteArray48[this.anInt3179] = (byte) arg7;
		this.aFloatArray15[this.anInt3179] = arg5;
		this.aFloatArray16[this.anInt3179] = arg0;
		return (short) this.anInt3179++;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "()V")
	@Override
	protected void method5292() {
	}

	@OriginalMember(owner = "client!gea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3185; local3++) {
			this.anIntArray189[local3] = this.anIntArray189[local3] + 7 >> 4;
			this.anIntArray190[local3] = this.anIntArray190[local3] + 7 >> 4;
			this.anIntArray191[local3] = this.anIntArray191[local3] + 7 >> 4;
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3140; local7++) {
			if (arg0 != 0) {
				this.anIntArray189[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray190[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray191[local7] += arg2;
			}
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!gea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class14_Sub2_Sub5 ba(@OriginalArg(0) Class14_Sub2_Sub5 arg0) {
		if (this.anInt3179 == 0) {
			return null;
		}
		if (!this.aBoolean228) {
			this.method2815();
		}
		@Pc(45) int local45;
		@Pc(61) int local61;
		if (this.aClass144_Sub3_11.anInt8086 <= 0) {
			local45 = this.aShort35 - (this.aShort36 * this.aClass144_Sub3_11.anInt8086 >> 8) >> this.aClass144_Sub3_11.anInt8053;
			local61 = this.aShort33 - (this.aClass144_Sub3_11.anInt8086 * this.aShort34 >> 8) >> this.aClass144_Sub3_11.anInt8053;
		} else {
			local45 = this.aShort35 - (this.aClass144_Sub3_11.anInt8086 * this.aShort34 >> 8) >> this.aClass144_Sub3_11.anInt8053;
			local61 = this.aShort33 - (this.aShort36 * this.aClass144_Sub3_11.anInt8086 >> 8) >> this.aClass144_Sub3_11.anInt8053;
		}
		@Pc(120) int local120;
		@Pc(137) int local137;
		if (this.aClass144_Sub3_11.anInt8090 > 0) {
			local120 = this.aShort38 - (this.aShort34 * this.aClass144_Sub3_11.anInt8090 >> 8) >> this.aClass144_Sub3_11.anInt8053;
			local137 = this.aShort40 - (this.aClass144_Sub3_11.anInt8090 * this.aShort36 >> 8) >> this.aClass144_Sub3_11.anInt8053;
		} else {
			local120 = this.aShort38 - (this.aClass144_Sub3_11.anInt8090 * this.aShort36 >> 8) >> this.aClass144_Sub3_11.anInt8053;
			local137 = this.aShort40 - (this.aShort34 * this.aClass144_Sub3_11.anInt8090 >> 8) >> this.aClass144_Sub3_11.anInt8053;
		}
		@Pc(177) int local177 = local61 + 1 - local45;
		@Pc(184) int local184 = local137 + 1 - local120;
		@Pc(187) Class14_Sub2_Sub5_Sub2 local187 = (Class14_Sub2_Sub5_Sub2) arg0;
		@Pc(199) Class14_Sub2_Sub5_Sub2 local199;
		if (local187 != null && local187.method9103(local184, local177)) {
			local199 = local187;
			local187.method9107();
		} else {
			local199 = new Class14_Sub2_Sub5_Sub2(this.aClass144_Sub3_11, local177, local184);
		}
		local199.method9106(local137, local45, local120, local61);
		this.method2814(local199);
		return local199;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!rd;Lclient!aba;II)V")
	@Override
	public void method5289(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3179 == 0) {
			return;
		}
		@Pc(17) Class263_Sub1 local17 = this.aClass144_Sub3_11.aClass263_Sub1_3;
		if (!this.aBoolean228) {
			this.method2815();
		}
		@Pc(28) Class263_Sub1 local28 = (Class263_Sub1) arg0;
		Static202.aFloat30 = local28.aFloat125 * local17.aFloat124 + local17.aFloat123 * local28.aFloat133 + local17.aFloat125 * local28.aFloat122;
		Static503.aFloat178 = local17.aFloat127 + local17.aFloat124 * local28.aFloat127 + local17.aFloat123 * local28.aFloat130 + local17.aFloat125 * local28.aFloat128;
		@Pc(75) float local75 = Static503.aFloat178 + (float) this.aShort36 * Static202.aFloat30;
		@Pc(83) float local83 = (float) this.aShort34 * Static202.aFloat30 + Static503.aFloat178;
		@Pc(100) float local100;
		@Pc(93) float local93;
		if (local83 < local75) {
			local93 = (float) this.aShort32 + local75;
			local100 = local83 - (float) this.aShort32;
		} else {
			local93 = (float) this.aShort32 + local83;
			local100 = (float) -this.aShort32 + local75;
		}
		if (this.aClass144_Sub3_11.aFloat152 <= local100 || (float) this.aClass144_Sub3_11.anInt8068 >= local93) {
			return;
		}
		Static431.aFloat134 = local28.aFloat127 * local17.aFloat131 + local17.aFloat133 * local28.aFloat128 + local28.aFloat130 * local17.aFloat126 + local17.aFloat130;
		Static438.aFloat135 = local28.aFloat133 * local17.aFloat126 + local17.aFloat133 * local28.aFloat122 + local17.aFloat131 * local28.aFloat125;
		@Pc(178) float local178 = Static431.aFloat134 + (float) this.aShort36 * Static438.aFloat135;
		@Pc(186) float local186 = Static438.aFloat135 * (float) this.aShort34 + Static431.aFloat134;
		@Pc(212) float local212;
		@Pc(201) float local201;
		if (local186 < local178) {
			local201 = (local178 + (float) this.aShort32) * (float) this.aClass144_Sub3_11.anInt8073;
			local212 = (local186 - (float) this.aShort32) * (float) this.aClass144_Sub3_11.anInt8073;
		} else {
			local201 = (local186 + (float) this.aShort32) * (float) this.aClass144_Sub3_11.anInt8073;
			local212 = (local178 - (float) this.aShort32) * (float) this.aClass144_Sub3_11.anInt8073;
		}
		if (this.aClass144_Sub3_11.aFloat143 <= local212 / (float) arg2 || this.aClass144_Sub3_11.aFloat155 >= local201 / (float) arg2) {
			return;
		}
		Static638.aFloat206 = local28.aFloat125 * local17.aFloat132 + local28.aFloat122 * local17.aFloat122 + local17.aFloat129 * local28.aFloat133;
		Static408.aFloat108 = local17.aFloat128 + local28.aFloat127 * local17.aFloat132 + local28.aFloat130 * local17.aFloat129 + local17.aFloat122 * local28.aFloat128;
		@Pc(305) float local305 = Static408.aFloat108 + Static638.aFloat206 * (float) this.aShort36;
		@Pc(313) float local313 = Static408.aFloat108 + (float) this.aShort34 * Static638.aFloat206;
		@Pc(340) float local340;
		@Pc(328) float local328;
		if (local305 > local313) {
			local328 = (float) this.aClass144_Sub3_11.anInt8092 * ((float) this.aShort32 + local305);
			local340 = (float) this.aClass144_Sub3_11.anInt8092 * ((float) -this.aShort32 + local313);
		} else {
			local340 = (float) this.aClass144_Sub3_11.anInt8092 * (local305 - (float) this.aShort32);
			local328 = (float) this.aClass144_Sub3_11.anInt8092 * ((float) this.aShort32 + local313);
		}
		if (local340 / (float) arg2 >= this.aClass144_Sub3_11.aFloat151 || this.aClass144_Sub3_11.aFloat160 >= local328 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass242Array1 != null) {
			Static476.aFloat163 = local28.aFloat129 * local17.aFloat125 + local28.aFloat126 * local17.aFloat123 + local28.aFloat123 * local17.aFloat124;
			Static303.aFloat142 = local17.aFloat132 * local28.aFloat124 + local17.aFloat122 * local28.aFloat132 + local17.aFloat129 * local28.aFloat131;
			Static248.aFloat75 = local28.aFloat123 * local17.aFloat131 + local28.aFloat129 * local17.aFloat133 + local28.aFloat126 * local17.aFloat126;
			Static407.aFloat26 = local17.aFloat131 * local28.aFloat124 + local17.aFloat133 * local28.aFloat132 + local28.aFloat131 * local17.aFloat126;
			Static243.aFloat74 = local17.aFloat129 * local28.aFloat126 + local17.aFloat122 * local28.aFloat129 + local17.aFloat132 * local28.aFloat123;
			Static329.aFloat84 = local28.aFloat124 * local17.aFloat124 + local28.aFloat131 * local17.aFloat123 + local28.aFloat132 * local17.aFloat125;
		}
		if (arg1 != null) {
			@Pc(513) int local513 = this.aShort33 + this.aShort35 >> 1;
			@Pc(522) int local522 = this.aShort38 + this.aShort40 >> 1;
			@Pc(541) int local541 = (int) ((float) local522 * Static407.aFloat26 + Static248.aFloat75 * (float) local513 + Static431.aFloat134 + (float) this.aShort36 * Static438.aFloat135);
			@Pc(560) int local560 = (int) ((float) local522 * Static303.aFloat142 + Static638.aFloat206 * (float) this.aShort36 + (float) local513 * Static243.aFloat74 + Static408.aFloat108);
			@Pc(579) int local579 = (int) (Static202.aFloat30 * (float) this.aShort36 + Static503.aFloat178 + (float) local513 * Static476.aFloat163 + Static329.aFloat84 * (float) local522);
			@Pc(598) int local598 = (int) ((float) this.aShort34 * Static438.aFloat135 + (float) local513 * Static248.aFloat75 + Static431.aFloat134 + Static407.aFloat26 * (float) local522);
			@Pc(617) int local617 = (int) (Static303.aFloat142 * (float) local522 + Static638.aFloat206 * (float) this.aShort34 + Static243.aFloat74 * (float) local513 + Static408.aFloat108);
			@Pc(636) int local636 = (int) ((float) this.aShort34 * Static202.aFloat30 + Static476.aFloat163 * (float) local513 + Static503.aFloat178 + (float) local522 * Static329.aFloat84);
			arg1.anInt31 = this.aClass144_Sub3_11.anInt8066 + local598 * this.aClass144_Sub3_11.anInt8073 / arg2;
			arg1.anInt29 = this.aClass144_Sub3_11.anInt8078 + this.aClass144_Sub3_11.anInt8092 * local560 / arg2;
			arg1.anInt32 = local617 * this.aClass144_Sub3_11.anInt8092 / arg2 + this.aClass144_Sub3_11.anInt8078;
			arg1.anInt28 = local541 * this.aClass144_Sub3_11.anInt8073 / arg2 + this.aClass144_Sub3_11.anInt8066;
			if (this.aClass144_Sub3_11.anInt8068 <= local579 || this.aClass144_Sub3_11.anInt8068 <= local636) {
				arg1.aBoolean3 = true;
				arg1.anInt30 = this.aClass144_Sub3_11.anInt8066 + this.aClass144_Sub3_11.anInt8073 * (local541 + this.aShort32) / arg2 - arg1.anInt28;
			}
		}
		this.aClass144_Sub3_11.method7003((float) arg2);
		this.aClass144_Sub3_11.method6989();
		this.aClass144_Sub3_11.method6990(local28);
		this.method2817();
		this.aClass144_Sub3_11.method6984();
		this.method2819();
	}

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort40;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	private void method2819() {
		if (this.aClass242Array1 == null) {
			return;
		}
		@Pc(12) Class263_Sub1 local12 = this.aClass144_Sub3_11.aClass263_Sub1_2;
		this.aClass144_Sub3_11.method7001();
		this.aClass144_Sub3_11.C(!this.aBoolean230);
		this.aClass144_Sub3_11.method7015(false);
		this.aClass144_Sub3_11.method6978(this.aClass144_Sub3_11.aClass380_12, this.aClass144_Sub3_11.aClass380_11, (Class380) null, (Class380) null);
		for (@Pc(45) int local45 = 0; local45 < this.anInt3153; local45++) {
			@Pc(54) Class242 local54 = this.aClass242Array1[local45];
			@Pc(59) Class185 local59 = this.aClass185Array1[local45];
			if (!local54.aBoolean484 || !this.aClass144_Sub3_11.method6898()) {
				@Pc(90) float local90 = (float) (this.anIntArray189[local54.anInt6781] + this.anIntArray189[local54.anInt6782] + this.anIntArray189[local54.anInt6783]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray190[local54.anInt6783] + this.anIntArray190[local54.anInt6782] + this.anIntArray190[local54.anInt6781]) * 0.3333333F;
				@Pc(132) float local132 = (float) (this.anIntArray191[local54.anInt6782] + this.anIntArray191[local54.anInt6781] + this.anIntArray191[local54.anInt6783]) * 0.3333333F;
				@Pc(146) float local146 = Static431.aFloat134 + Static407.aFloat26 * local132 + local111 * Static438.aFloat135 + local90 * Static248.aFloat75;
				@Pc(160) float local160 = Static408.aFloat108 + Static638.aFloat206 * local111 + Static243.aFloat74 * local90 + local132 * Static303.aFloat142;
				@Pc(174) float local174 = Static329.aFloat84 * local132 + local90 * Static476.aFloat163 + local111 * Static202.aFloat30 + Static503.aFloat178;
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local160 * local160 + local146 * local146 + local174 * local174))) * (float) local54.anInt6784;
				local12.method6421(local174 * local195 - local174, local54.aShort71 * local59.anInt5137 >> 7, local59.anInt5131, (float) local59.anInt5129 + local160 * local195 - local160, local146 + (float) local59.anInt5135 - local195 * local146, local59.anInt5136 * local54.aShort70 >> 7);
				this.aClass144_Sub3_11.method6997(local12);
				@Pc(246) int local246 = local59.anInt5132;
				OpenGL.glColor4ub((byte) (local246 >> 16), (byte) (local246 >> 8), (byte) local246, (byte) (local246 >> 24));
				this.aClass144_Sub3_11.method7053(local54.aShort69);
				this.aClass144_Sub3_11.method7054(local54.aByte94);
				this.aClass144_Sub3_11.method6974(4);
			}
		}
		this.aClass144_Sub3_11.C(true);
		this.aClass144_Sub3_11.method6984();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class129 method5288(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class129_Sub1 local18;
		@Pc(14) Class129_Sub1 local14;
		if (arg0 == 1) {
			local14 = this.aClass144_Sub3_11.aClass129_Sub1_1;
			local18 = this.aClass144_Sub3_11.aClass129_Sub1_7;
		} else if (arg0 == 2) {
			local18 = this.aClass144_Sub3_11.aClass129_Sub1_9;
			local14 = this.aClass144_Sub3_11.aClass129_Sub1_6;
		} else if (arg0 == 3) {
			local14 = this.aClass144_Sub3_11.aClass129_Sub1_4;
			local18 = this.aClass144_Sub3_11.aClass129_Sub1_5;
		} else if (arg0 == 4) {
			local18 = this.aClass144_Sub3_11.aClass129_Sub1_3;
			local14 = this.aClass144_Sub3_11.aClass129_Sub1_2;
		} else if (arg0 == 5) {
			local18 = this.aClass144_Sub3_11.aClass129_Sub1_8;
			local14 = this.aClass144_Sub3_11.aClass129_Sub1_10;
		} else {
			local18 = local14 = new Class129_Sub1(this.aClass144_Sub3_11);
		}
		return this.method2816(local14, arg1, arg0 != 0, local18, arg2);
	}

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3140; local3++) {
			this.anIntArray191[local3] = -this.anIntArray191[local3];
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt3179; local27++) {
			this.aShortArray44[local27] = (short) -this.aShortArray44[local27];
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt3171; local54++) {
			@Pc(65) short local65 = this.aShortArray48[local54];
			this.aShortArray48[local54] = this.aShortArray43[local54];
			this.aShortArray43[local54] = local65;
		}
		if (this.aClass380_4 == null && this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
		if (this.aClass380_4 != null) {
			this.aClass380_4.anInterface12_7 = null;
		}
		if (this.aClass248_1 != null) {
			this.aClass248_1.anInterface6_2 = null;
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!rd;Lclient!aba;I)V")
	@Override
	public void method5307(@OriginalArg(0) Class263 arg0, @OriginalArg(1) Class4_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3179 == 0) {
			return;
		}
		@Pc(17) Class263_Sub1 local17 = this.aClass144_Sub3_11.aClass263_Sub1_3;
		if (!this.aBoolean228) {
			this.method2815();
		}
		@Pc(28) Class263_Sub1 local28 = (Class263_Sub1) arg0;
		Static503.aFloat178 = local17.aFloat127 + local28.aFloat127 * local17.aFloat124 + local17.aFloat123 * local28.aFloat130 + local28.aFloat128 * local17.aFloat125;
		Static202.aFloat30 = local17.aFloat125 * local28.aFloat122 + local28.aFloat133 * local17.aFloat123 + local17.aFloat124 * local28.aFloat125;
		@Pc(75) float local75 = Static503.aFloat178 + Static202.aFloat30 * (float) this.aShort36;
		@Pc(83) float local83 = Static503.aFloat178 + (float) this.aShort34 * Static202.aFloat30;
		@Pc(100) float local100;
		@Pc(93) float local93;
		if (local83 < local75) {
			local100 = (float) -this.aShort32 + local83;
			local93 = local75 + (float) this.aShort32;
		} else {
			local93 = (float) this.aShort32 + local83;
			local100 = (float) -this.aShort32 + local75;
		}
		if (local100 >= this.aClass144_Sub3_11.aFloat162 || local93 <= (float) this.aClass144_Sub3_11.anInt8068) {
			return;
		}
		Static438.aFloat135 = local28.aFloat122 * local17.aFloat133 + local28.aFloat133 * local17.aFloat126 + local17.aFloat131 * local28.aFloat125;
		Static431.aFloat134 = local17.aFloat130 + local17.aFloat126 * local28.aFloat130 + local17.aFloat133 * local28.aFloat128 + local17.aFloat131 * local28.aFloat127;
		@Pc(179) float local179 = Static431.aFloat134 + (float) this.aShort36 * Static438.aFloat135;
		@Pc(187) float local187 = Static431.aFloat134 + Static438.aFloat135 * (float) this.aShort34;
		@Pc(202) float local202;
		@Pc(213) float local213;
		if (local187 < local179) {
			local202 = (float) this.aClass144_Sub3_11.anInt8073 * (local187 - (float) this.aShort32);
			local213 = (float) this.aClass144_Sub3_11.anInt8073 * (local179 + (float) this.aShort32);
		} else {
			local202 = (float) this.aClass144_Sub3_11.anInt8073 * ((float) -this.aShort32 + local179);
			local213 = (float) this.aClass144_Sub3_11.anInt8073 * ((float) this.aShort32 + local187);
		}
		if (local202 / local93 >= this.aClass144_Sub3_11.aFloat143 || this.aClass144_Sub3_11.aFloat155 >= local213 / local93) {
			return;
		}
		Static638.aFloat206 = local28.aFloat133 * local17.aFloat129 + local28.aFloat122 * local17.aFloat122 + local17.aFloat132 * local28.aFloat125;
		Static408.aFloat108 = local17.aFloat128 + local28.aFloat130 * local17.aFloat129 + local28.aFloat128 * local17.aFloat122 + local17.aFloat132 * local28.aFloat127;
		@Pc(305) float local305 = Static638.aFloat206 * (float) this.aShort36 + Static408.aFloat108;
		@Pc(313) float local313 = (float) this.aShort34 * Static638.aFloat206 + Static408.aFloat108;
		@Pc(329) float local329;
		@Pc(340) float local340;
		if (local313 < local305) {
			local329 = ((float) -this.aShort32 + local313) * (float) this.aClass144_Sub3_11.anInt8092;
			local340 = (local305 + (float) this.aShort32) * (float) this.aClass144_Sub3_11.anInt8092;
		} else {
			local329 = (float) this.aClass144_Sub3_11.anInt8092 * ((float) -this.aShort32 + local305);
			local340 = (float) this.aClass144_Sub3_11.anInt8092 * ((float) this.aShort32 + local313);
		}
		if (this.aClass144_Sub3_11.aFloat151 <= local329 / local93 || local340 / local93 <= this.aClass144_Sub3_11.aFloat160) {
			return;
		}
		if (arg1 != null || this.aClass242Array1 != null) {
			Static248.aFloat75 = local28.aFloat129 * local17.aFloat133 + local17.aFloat126 * local28.aFloat126 + local17.aFloat131 * local28.aFloat123;
			Static329.aFloat84 = local17.aFloat124 * local28.aFloat124 + local17.aFloat123 * local28.aFloat131 + local28.aFloat132 * local17.aFloat125;
			Static243.aFloat74 = local17.aFloat132 * local28.aFloat123 + local17.aFloat129 * local28.aFloat126 + local28.aFloat129 * local17.aFloat122;
			Static476.aFloat163 = local17.aFloat125 * local28.aFloat129 + local28.aFloat126 * local17.aFloat123 + local28.aFloat123 * local17.aFloat124;
			Static303.aFloat142 = local28.aFloat124 * local17.aFloat132 + local28.aFloat132 * local17.aFloat122 + local28.aFloat131 * local17.aFloat129;
			Static407.aFloat26 = local28.aFloat124 * local17.aFloat131 + local17.aFloat126 * local28.aFloat131 + local28.aFloat132 * local17.aFloat133;
		}
		if (arg1 != null) {
			@Pc(506) boolean local506 = false;
			@Pc(508) boolean local508 = true;
			@Pc(516) int local516 = this.aShort33 + this.aShort35 >> 1;
			@Pc(524) int local524 = this.aShort40 + this.aShort38 >> 1;
			@Pc(543) int local543 = (int) ((float) local524 * Static407.aFloat26 + Static438.aFloat135 * (float) this.aShort36 + Static431.aFloat134 + Static248.aFloat75 * (float) local516);
			@Pc(562) int local562 = (int) ((float) local524 * Static303.aFloat142 + Static408.aFloat108 + Static243.aFloat74 * (float) local516 + (float) this.aShort36 * Static638.aFloat206);
			@Pc(581) int local581 = (int) ((float) local524 * Static329.aFloat84 + Static503.aFloat178 + Static476.aFloat163 * (float) local516 + (float) this.aShort36 * Static202.aFloat30);
			if (this.aClass144_Sub3_11.anInt8068 <= local581) {
				arg1.anInt29 = this.aClass144_Sub3_11.anInt8078 + this.aClass144_Sub3_11.anInt8092 * local562 / local581;
				arg1.anInt28 = this.aClass144_Sub3_11.anInt8066 + local543 * this.aClass144_Sub3_11.anInt8073 / local581;
			} else {
				local506 = true;
			}
			@Pc(643) int local643 = (int) ((float) this.aShort34 * Static438.aFloat135 + (float) local516 * Static248.aFloat75 + Static431.aFloat134 + (float) local524 * Static407.aFloat26);
			@Pc(662) int local662 = (int) ((float) this.aShort34 * Static638.aFloat206 + Static408.aFloat108 + (float) local516 * Static243.aFloat74 + Static303.aFloat142 * (float) local524);
			@Pc(681) int local681 = (int) (Static476.aFloat163 * (float) local516 + Static503.aFloat178 + Static202.aFloat30 * (float) this.aShort34 + Static329.aFloat84 * (float) local524);
			if (this.aClass144_Sub3_11.anInt8068 > local681) {
				local506 = true;
			} else {
				arg1.anInt31 = this.aClass144_Sub3_11.anInt8066 + local643 * this.aClass144_Sub3_11.anInt8073 / local681;
				arg1.anInt32 = this.aClass144_Sub3_11.anInt8078 + local662 * this.aClass144_Sub3_11.anInt8092 / local681;
			}
			if (local506) {
				if (this.aClass144_Sub3_11.anInt8068 > local581 && local681 < this.aClass144_Sub3_11.anInt8068) {
					local508 = false;
				} else {
					@Pc(775) int local775;
					@Pc(787) int local787;
					@Pc(798) int local798;
					if (this.aClass144_Sub3_11.anInt8068 > local581) {
						local775 = (local681 - this.aClass144_Sub3_11.anInt8068 << 16) / (local681 - local581);
						local787 = local643 + ((local643 - local543) * local775 >> 16);
						local798 = ((local662 - local562) * local775 >> 16) + local662;
						arg1.anInt28 = local787 * this.aClass144_Sub3_11.anInt8073 / this.aClass144_Sub3_11.anInt8068 + this.aClass144_Sub3_11.anInt8066;
						arg1.anInt29 = this.aClass144_Sub3_11.anInt8078 + this.aClass144_Sub3_11.anInt8092 * local798 / this.aClass144_Sub3_11.anInt8068;
					} else if (local681 < this.aClass144_Sub3_11.anInt8068) {
						local775 = (local581 - this.aClass144_Sub3_11.anInt8068 << 16) / (local581 - local681);
						local787 = local543 + ((local543 - local643) * local775 >> 16);
						local798 = local562 + ((local562 - local662) * local775 >> 16);
						arg1.anInt28 = this.aClass144_Sub3_11.anInt8073 * local787 / this.aClass144_Sub3_11.anInt8068 + this.aClass144_Sub3_11.anInt8066;
						arg1.anInt29 = local798 * this.aClass144_Sub3_11.anInt8092 / this.aClass144_Sub3_11.anInt8068 + this.aClass144_Sub3_11.anInt8078;
					}
				}
			}
			if (local508) {
				arg1.aBoolean3 = true;
				if (local581 > local681) {
					arg1.anInt30 = this.aClass144_Sub3_11.anInt8073 * (this.aShort32 + local543) / local581 + this.aClass144_Sub3_11.anInt8066 - arg1.anInt28;
				} else {
					arg1.anInt30 = (this.aShort32 + local643) * this.aClass144_Sub3_11.anInt8073 / local681 + this.aClass144_Sub3_11.anInt8066 - arg1.anInt31;
				}
			}
		}
		this.aClass144_Sub3_11.method6976();
		this.aClass144_Sub3_11.method6990(local28);
		this.method2817();
		this.aClass144_Sub3_11.method6984();
		this.method2819();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZI)V")
	private void method2820(@OriginalArg(0) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass380_1 != null && this.aClass380_1.anInterface12_7 == null;
		@Pc(33) boolean local33 = this.aClass380_4 != null && this.aClass380_4.anInterface12_7 == null;
		@Pc(47) boolean local47 = this.aClass380_2 != null && this.aClass380_2.anInterface12_7 == null;
		@Pc(61) boolean local61 = this.aClass380_3 != null && this.aClass380_3.anInterface12_7 == null;
		if (arg0) {
			local19 &= (this.aByte67 & 0x2) != 0;
			local47 &= (this.aByte67 & 0x1) != 0;
			local61 &= (this.aByte67 & 0x8) != 0;
			local33 &= (this.aByte67 & 0x4) != 0;
		}
		@Pc(118) byte local118 = 0;
		@Pc(122) byte local122 = 0;
		@Pc(124) byte local124 = 0;
		if (local47) {
			local118 = 12;
		}
		@Pc(145) byte local145 = 0;
		if (local19) {
			local122 = local118;
			local118 = (byte) (local118 + 4);
		}
		if (local33) {
			local124 = local118;
			local118 = (byte) (local118 + 12);
		}
		if (local61) {
			local145 = local118;
			local118 = (byte) (local118 + 8);
		}
		if (local118 == 0) {
			return;
		}
		if (this.anInt3179 * local118 > this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2.aByteArray99.length) {
			this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2 = new Class14_Sub21_Sub1((this.anInt3179 + 100) * local118);
		} else {
			this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2.anInt8936 = 0;
		}
		@Pc(213) Class14_Sub21_Sub1 local213 = this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2;
		@Pc(223) int local223;
		@Pc(232) int local232;
		@Pc(260) int local260;
		@Pc(269) int local269;
		if (local47) {
			@Pc(239) int local239;
			@Pc(246) int local246;
			@Pc(251) int local251;
			@Pc(258) int local258;
			if (this.aClass144_Sub3_11.aBoolean557) {
				for (local223 = 0; local223 < this.anInt3140; local223++) {
					local232 = Stream.floatToRawIntBits((float) this.anIntArray189[local223]);
					local239 = Stream.floatToRawIntBits((float) this.anIntArray190[local223]);
					local246 = Stream.floatToRawIntBits((float) this.anIntArray191[local223]);
					local251 = this.anIntArray187[local223];
					local258 = this.anIntArray187[local223 + 1];
					for (local260 = local251; local260 < local258; local260++) {
						local269 = this.aShortArray45[local260] - 1;
						if (local269 == -1) {
							break;
						}
						local213.anInt8936 = local118 * local269;
						local213.method7730(local232);
						local213.method7730(local239);
						local213.method7730(local246);
					}
				}
			} else {
				for (local223 = 0; local223 < this.anInt3140; local223++) {
					local232 = Stream.floatToRawIntBits((float) this.anIntArray189[local223]);
					local239 = Stream.floatToRawIntBits((float) this.anIntArray190[local223]);
					local246 = Stream.floatToRawIntBits((float) this.anIntArray191[local223]);
					local251 = this.anIntArray187[local223];
					local258 = this.anIntArray187[local223 + 1];
					for (local260 = local251; local260 < local258; local260++) {
						local269 = this.aShortArray45[local260] - 1;
						if (local269 == -1) {
							break;
						}
						local213.anInt8936 = local118 * local269;
						local213.method7701(local232);
						local213.method7701(local239);
						local213.method7701(local246);
					}
				}
			}
		}
		@Pc(516) float local516;
		@Pc(406) short[] local406;
		@Pc(414) short[] local414;
		@Pc(410) short[] local410;
		@Pc(418) byte[] local418;
		@Pc(562) float local562;
		if (local19) {
			if (this.aClass380_4 == null) {
				if (this.aClass71_1 == null) {
					local418 = this.aByteArray48;
					local410 = this.aShortArray44;
					local406 = this.aShortArray50;
					local414 = this.aShortArray47;
				} else {
					local406 = this.aClass71_1.aShortArray20;
					local410 = this.aClass71_1.aShortArray18;
					local414 = this.aClass71_1.aShortArray19;
					local418 = this.aClass71_1.aByteArray24;
				}
				@Pc(438) float local438 = this.aClass144_Sub3_11.aFloatArray65[0];
				@Pc(444) float local444 = this.aClass144_Sub3_11.aFloatArray65[1];
				@Pc(450) float local450 = this.aClass144_Sub3_11.aFloatArray65[2];
				@Pc(454) float local454 = this.aClass144_Sub3_11.lb;
				@Pc(464) float local464 = this.aClass144_Sub3_11.aFloat149 * 768.0F / (float) this.aShort41;
				@Pc(474) float local474 = this.aClass144_Sub3_11.aFloat154 * 768.0F / (float) this.aShort41;
				for (@Pc(476) int local476 = 0; local476 < this.anInt3171; local476++) {
					@Pc(496) int local496 = this.method2825(this.aShortArray49[local476], this.aShortArray41[local476], this.aByteArray49[local476], this.aShort37);
					@Pc(505) float local505 = this.aClass144_Sub3_11.aFloat144 * (float) (local496 >>> 24);
					local516 = (float) (local496 >> 16 & 0xFF) * this.aClass144_Sub3_11.aFloat161;
					@Pc(521) short local521 = this.aShortArray48[local476];
					@Pc(532) float local532 = (float) (local496 >> 8 & 0xFF) * this.aClass144_Sub3_11.aFloat145;
					@Pc(537) short local537 = (short) local418[local521];
					if (local537 == 0) {
						local562 = (local444 * (float) local414[local521] + (float) local406[local521] * local438 + (float) local410[local521] * local450) * 0.0026041667F;
					} else {
						local562 = ((float) local410[local521] * local450 + local438 * (float) local406[local521] + (float) local414[local521] * local444) / (float) (local537 * 256);
					}
					@Pc(603) float local603 = (local562 < 0.0F ? local474 : local464) * local562 + local454;
					@Pc(608) int local608 = (int) (local505 * local603);
					@Pc(613) int local613 = (int) (local603 * local516);
					if (local608 < 0) {
						local608 = 0;
					} else if (local608 > 255) {
						local608 = 255;
					}
					@Pc(634) int local634 = (int) (local603 * local532);
					if (local613 < 0) {
						local613 = 0;
					} else if (local613 > 255) {
						local613 = 255;
					}
					local213.anInt8936 = local118 * local521 + local122;
					if (local634 < 0) {
						local634 = 0;
					} else if (local634 > 255) {
						local634 = 255;
					}
					local213.method7747(local608);
					local213.method7747(local613);
					local213.method7747(local634);
					local213.method7747(255 - (this.aByteArray49[local476] & 0xFF));
					local521 = this.aShortArray42[local476];
					local537 = (short) local418[local521];
					if (local537 == 0) {
						local562 = ((float) local410[local521] * local450 + local438 * (float) local406[local521] + local444 * (float) local414[local521]) * 0.0026041667F;
					} else {
						local562 = (local444 * (float) local414[local521] + (float) local406[local521] * local438 + (float) local410[local521] * local450) / (float) (local537 * 256);
					}
					local603 = (local562 < 0.0F ? local474 : local464) * local562 + local454;
					local608 = (int) (local505 * local603);
					if (local608 < 0) {
						local608 = 0;
					} else if (local608 > 255) {
						local608 = 255;
					}
					local613 = (int) (local603 * local516);
					if (local613 < 0) {
						local613 = 0;
					} else if (local613 > 255) {
						local613 = 255;
					}
					local634 = (int) (local603 * local532);
					if (local634 < 0) {
						local634 = 0;
					} else if (local634 > 255) {
						local634 = 255;
					}
					local213.anInt8936 = local118 * local521 + local122;
					local213.method7747(local608);
					local213.method7747(local613);
					local213.method7747(local634);
					local213.method7747(255 - (this.aByteArray49[local476] & 0xFF));
					local521 = this.aShortArray43[local476];
					local537 = (short) local418[local521];
					if (local537 == 0) {
						local562 = (local438 * (float) local406[local521] + (float) local414[local521] * local444 + (float) local410[local521] * local450) * 0.0026041667F;
					} else {
						local562 = (local450 * (float) local410[local521] + (float) local406[local521] * local438 + (float) local414[local521] * local444) / (float) (local537 * 256);
					}
					local603 = local454 + (local562 < 0.0F ? local474 : local464) * local562;
					local608 = (int) (local603 * local505);
					if (local608 < 0) {
						local608 = 0;
					} else if (local608 > 255) {
						local608 = 255;
					}
					local613 = (int) (local603 * local516);
					if (local613 < 0) {
						local613 = 0;
					} else if (local613 > 255) {
						local613 = 255;
					}
					local634 = (int) (local532 * local603);
					if (local634 < 0) {
						local634 = 0;
					} else if (local634 > 255) {
						local634 = 255;
					}
					local213.anInt8936 = local521 * local118 + local122;
					local213.method7747(local608);
					local213.method7747(local613);
					local213.method7747(local634);
					local213.method7747(255 - (this.aByteArray49[local476] & 0xFF));
				}
			} else {
				for (local223 = 0; local223 < this.anInt3171; local223++) {
					local232 = this.method2825(this.aShortArray49[local223], this.aShortArray41[local223], this.aByteArray49[local223], this.aShort37);
					local213.anInt8936 = local118 * this.aShortArray48[local223] + local122;
					local213.method7730(local232);
					local213.anInt8936 = local122 + this.aShortArray42[local223] * local118;
					local213.method7730(local232);
					local213.anInt8936 = local118 * this.aShortArray43[local223] + local122;
					local213.method7730(local232);
				}
			}
		}
		if (local33) {
			if (this.aClass71_1 == null) {
				local406 = this.aShortArray50;
				local418 = this.aByteArray48;
				local410 = this.aShortArray44;
				local414 = this.aShortArray47;
			} else {
				local406 = this.aClass71_1.aShortArray20;
				local414 = this.aClass71_1.aShortArray19;
				local410 = this.aClass71_1.aShortArray18;
				local418 = this.aClass71_1.aByteArray24;
			}
			@Pc(1177) float local1177 = 3.0F / (float) this.aShort41;
			local213.anInt8936 = local124;
			local562 = 3.0F / (float) (this.aShort41 / 2 + this.aShort41);
			if (this.aClass144_Sub3_11.aBoolean557) {
				for (local260 = 0; local260 < this.anInt3179; local260++) {
					local269 = local418[local260] & 0xFF;
					if (local269 == 0) {
						local213.method7246((float) local406[local260] * local562);
						local213.method7246(local562 * (float) local414[local260]);
						local213.method7246((float) local410[local260] * local562);
					} else {
						local516 = local1177 / (float) local269;
						local213.method7246((float) local406[local260] * local516);
						local213.method7246(local516 * (float) local414[local260]);
						local213.method7246(local516 * (float) local410[local260]);
					}
					local213.anInt8936 += local118 - 12;
				}
			} else {
				for (local260 = 0; local260 < this.anInt3179; local260++) {
					local269 = local418[local260] & 0xFF;
					if (local269 == 0) {
						local213.method7248((float) local406[local260] * local562);
						local213.method7248(local562 * (float) local414[local260]);
						local213.method7248((float) local410[local260] * local562);
					} else {
						local516 = local1177 / (float) local269;
						local213.method7248(local516 * (float) local406[local260]);
						local213.method7248((float) local414[local260] * local516);
						local213.method7248((float) local410[local260] * local516);
					}
					local213.anInt8936 += local118 - 12;
				}
			}
		}
		if (local61) {
			local213.anInt8936 = local145;
			if (this.aClass144_Sub3_11.aBoolean557) {
				for (local223 = 0; local223 < this.anInt3179; local223++) {
					local213.method7246(this.aFloatArray15[local223]);
					local213.method7246(this.aFloatArray16[local223]);
					local213.anInt8936 += local118 - 8;
				}
			} else {
				for (local223 = 0; local223 < this.anInt3179; local223++) {
					local213.method7248(this.aFloatArray15[local223]);
					local213.method7248(this.aFloatArray16[local223]);
					local213.anInt8936 += local118 - 8;
				}
			}
		}
		local213.anInt8936 = local118 * this.anInt3179;
		@Pc(1498) Interface12 local1498;
		if (arg0) {
			if (this.anInterface12_1 == null) {
				this.anInterface12_1 = this.aClass144_Sub3_11.method7037(true, local118, local213.aByteArray99, local213.anInt8936);
			} else {
				this.anInterface12_1.method5812(local213.aByteArray99, local118, local213.anInt8936);
			}
			local1498 = this.anInterface12_1;
			this.aByte67 = 0;
		} else {
			local1498 = this.aClass144_Sub3_11.method7037(false, local118, local213.aByteArray99, local213.anInt8936);
			this.aBoolean231 = true;
		}
		if (local47) {
			this.aClass380_2.aByte143 = 0;
			this.aClass380_2.anInterface12_7 = local1498;
		}
		if (local61) {
			this.aClass380_3.aByte143 = local145;
			this.aClass380_3.anInterface12_7 = local1498;
		}
		if (local19) {
			this.aClass380_1.aByte143 = local122;
			this.aClass380_1.anInterface12_7 = local1498;
		}
		if (local33) {
			this.aClass380_4.aByte143 = local124;
			this.aClass380_4.anInterface12_7 = local1498;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt3171; local3++) {
			local14 = this.aShortArray41[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			@Pc(30) int local30 = local14 & 0x7F;
			if (arg1 != -1) {
				local26 -= -((arg1 - local26) * arg3 >> 7);
			}
			if (arg0 != -1) {
				local20 += arg3 * (arg0 - local20) >> 7;
			}
			if (arg2 != -1) {
				local30 += (arg2 - local30) * arg3 >> 7;
			}
			this.aShortArray41[local3] = (short) (local26 << 7 | local20 << 10 | local30);
		}
		Static188.anInt3149++;
		if (this.aClass242Array1 != null) {
			for (local14 = 0; local14 < this.anInt3153; local14++) {
				@Pc(111) Class242 local111 = this.aClass242Array1[local14];
				@Pc(116) Class185 local116 = this.aClass185Array1[local14];
				local116.anInt5132 = local116.anInt5132 & 0xFF000000 | Static302.anIntArray299[this.aShortArray41[local111.anInt6778] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZLclient!rd;IIZI)Z")
	private boolean method2822(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class263_Sub1 local8 = (Class263_Sub1) arg2;
		@Pc(12) Class263_Sub1 local12 = this.aClass144_Sub3_11.aClass263_Sub1_3;
		@Pc(33) float local33 = local12.aFloat130 + local12.aFloat133 * local8.aFloat128 + local12.aFloat126 * local8.aFloat130 + local12.aFloat131 * local8.aFloat127;
		@Pc(54) float local54 = local12.aFloat129 * local8.aFloat130 + local12.aFloat122 * local8.aFloat128 + local8.aFloat127 * local12.aFloat132 + local12.aFloat128;
		Static202.aFloat30 = local12.aFloat124 * local8.aFloat125 + local8.aFloat133 * local12.aFloat123 + local8.aFloat122 * local12.aFloat125;
		Static407.aFloat26 = local8.aFloat131 * local12.aFloat126 + local8.aFloat132 * local12.aFloat133 + local8.aFloat124 * local12.aFloat131;
		@Pc(111) float local111 = local12.aFloat125 * local8.aFloat128 + local12.aFloat123 * local8.aFloat130 + local12.aFloat124 * local8.aFloat127 + local12.aFloat127;
		Static329.aFloat84 = local12.aFloat124 * local8.aFloat124 + local12.aFloat123 * local8.aFloat131 + local12.aFloat125 * local8.aFloat132;
		Static303.aFloat142 = local12.aFloat132 * local8.aFloat124 + local8.aFloat131 * local12.aFloat129 + local12.aFloat122 * local8.aFloat132;
		Static243.aFloat74 = local12.aFloat132 * local8.aFloat123 + local12.aFloat122 * local8.aFloat129 + local12.aFloat129 * local8.aFloat126;
		Static476.aFloat163 = local8.aFloat126 * local12.aFloat123 + local8.aFloat129 * local12.aFloat125 + local8.aFloat123 * local12.aFloat124;
		Static438.aFloat135 = local12.aFloat131 * local8.aFloat125 + local8.aFloat122 * local12.aFloat133 + local12.aFloat126 * local8.aFloat133;
		Static248.aFloat75 = local8.aFloat129 * local12.aFloat133 + local12.aFloat126 * local8.aFloat126 + local8.aFloat123 * local12.aFloat131;
		Static638.aFloat206 = local8.aFloat122 * local12.aFloat122 + local12.aFloat129 * local8.aFloat133 + local12.aFloat132 * local8.aFloat125;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass144_Sub3_11.anInt8073;
		@Pc(255) int local255 = this.aClass144_Sub3_11.anInt8092;
		if (!this.aBoolean228) {
			this.method2815();
		}
		@Pc(272) int local272 = this.aShort33 - this.aShort35 >> 1;
		@Pc(281) int local281 = this.aShort34 - this.aShort36 >> 1;
		@Pc(290) int local290 = this.aShort40 - this.aShort38 >> 1;
		@Pc(296) int local296 = this.aShort35 + local272;
		@Pc(301) int local301 = local281 + this.aShort36;
		@Pc(306) int local306 = local290 + this.aShort38;
		@Pc(313) int local313 = local296 - (local272 << arg0);
		@Pc(319) int local319 = local301 - (local281 << arg0);
		@Pc(325) int local325 = local306 - (local290 << arg0);
		@Pc(332) int local332 = local296 + (local272 << arg0);
		@Pc(338) int local338 = local301 + (local281 << arg0);
		@Pc(344) int local344 = (local290 << arg0) + local306;
		Static228.anIntArray225[0] = local313;
		Static17.anIntArray23[0] = local319;
		Static228.anIntArray225[1] = local332;
		Static2.anIntArray1[0] = local325;
		Static17.anIntArray23[1] = local319;
		Static2.anIntArray1[1] = local325;
		Static228.anIntArray225[2] = local313;
		Static17.anIntArray23[2] = local338;
		Static2.anIntArray1[2] = local325;
		Static228.anIntArray225[3] = local332;
		Static17.anIntArray23[3] = local338;
		Static2.anIntArray1[3] = local325;
		Static228.anIntArray225[4] = local313;
		Static17.anIntArray23[4] = local319;
		Static2.anIntArray1[4] = local344;
		Static228.anIntArray225[5] = local332;
		Static17.anIntArray23[5] = local319;
		Static2.anIntArray1[5] = local344;
		Static228.anIntArray225[6] = local313;
		Static17.anIntArray23[6] = local338;
		Static228.anIntArray225[7] = local332;
		Static2.anIntArray1[6] = local344;
		Static17.anIntArray23[7] = local338;
		Static2.anIntArray1[7] = local344;
		@Pc(483) float local483;
		@Pc(497) float local497;
		@Pc(511) float local511;
		@Pc(469) float local469;
		@Pc(459) float local459;
		@Pc(464) float local464;
		for (@Pc(450) int local450 = 0; local450 < 8; local450++) {
			local459 = (float) Static17.anIntArray23[local450];
			local464 = (float) Static2.anIntArray1[local450];
			local469 = (float) Static228.anIntArray225[local450];
			local483 = local459 * Static438.aFloat135 + Static248.aFloat75 * local469 + Static407.aFloat26 * local464 + local33;
			local497 = local464 * Static303.aFloat142 + local459 * Static638.aFloat206 + Static243.aFloat74 * local469 + local54;
			local511 = Static476.aFloat163 * local469 + Static202.aFloat30 * local459 + Static329.aFloat84 * local464 + local111;
			if (local511 >= (float) this.aClass144_Sub3_11.anInt8068) {
				if (arg3 > 0) {
					local511 = (float) arg3;
				}
				@Pc(537) float local537 = (float) local251 * local483 / local511 + (float) this.aClass144_Sub3_11.anInt8066;
				@Pc(549) float local549 = (float) local255 * local497 / local511 + (float) this.aClass144_Sub3_11.anInt8078;
				if (local243 < local537) {
					local243 = local537;
				}
				if (local537 < local241) {
					local241 = local537;
				}
				if (local247 < local549) {
					local247 = local549;
				}
				local239 = true;
				if (local549 < local245) {
					local245 = local549;
				}
			}
		}
		if (local239 && (float) arg4 > local241 && local243 > (float) arg4 && local245 < (float) arg5 && local247 > (float) arg5) {
			if (arg1) {
				return true;
			}
			if (this.aClass144_Sub3_11.anIntArray419.length < this.anInt3179) {
				this.aClass144_Sub3_11.anIntArray418 = new int[this.anInt3179];
				this.aClass144_Sub3_11.anIntArray419 = new int[this.anInt3179];
			}
			@Pc(651) int[] local651 = this.aClass144_Sub3_11.anIntArray419;
			@Pc(655) int[] local655 = this.aClass144_Sub3_11.anIntArray418;
			@Pc(751) int local751;
			for (@Pc(657) int local657 = 0; local657 < this.anInt3140; local657++) {
				local459 = (float) this.anIntArray190[local657];
				local469 = (float) this.anIntArray189[local657];
				local464 = (float) this.anIntArray191[local657];
				local497 = local54 + Static243.aFloat74 * local469 + local459 * Static638.aFloat206 + local464 * Static303.aFloat142;
				local483 = local33 + local459 * Static438.aFloat135 + Static248.aFloat75 * local469 + local464 * Static407.aFloat26;
				local511 = local111 + Static329.aFloat84 * local464 + Static202.aFloat30 * local459 + Static476.aFloat163 * local469;
				@Pc(764) int local764;
				@Pc(769) int local769;
				@Pc(776) int local776;
				if ((float) this.aClass144_Sub3_11.anInt8068 <= local511) {
					if (arg3 > 0) {
						local511 = (float) arg3;
					}
					local751 = (int) ((float) local251 * local483 / local511 + (float) this.aClass144_Sub3_11.anInt8066);
					local764 = (int) ((float) this.aClass144_Sub3_11.anInt8078 + local497 * (float) local255 / local511);
					local769 = this.anIntArray187[local657];
					local776 = this.anIntArray187[local657 + 1];
					for (@Pc(778) int local778 = local769; local778 < local776; local778++) {
						@Pc(787) int local787 = this.aShortArray45[local778] - 1;
						if (local787 == -1) {
							break;
						}
						local651[local787] = local751;
						local655[local787] = local764;
					}
				} else {
					local751 = this.anIntArray187[local657];
					local764 = this.anIntArray187[local657 + 1];
					for (local769 = local751; local769 < local764; local769++) {
						local776 = this.aShortArray45[local769] - 1;
						if (local776 == -1) {
							break;
						}
						local651[this.aShortArray45[local769] - 1] = -999999;
					}
				}
			}
			for (local751 = 0; local751 < this.anInt3171; local751++) {
				if (local651[this.aShortArray48[local751]] != -999999 && local651[this.aShortArray42[local751]] != -999999 && local651[this.aShortArray43[local751]] != -999999 && this.method2813(local651[this.aShortArray42[local751]], local655[this.aShortArray43[local751]], local651[this.aShortArray48[local751]], local655[this.aShortArray48[local751]], local651[this.aShortArray43[local751]], arg5, arg4, local655[this.aShortArray42[local751]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort35;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IZ)V")
	private void method2823(@OriginalArg(1) boolean arg0) {
		if (this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2.aByteArray99.length < this.anInt3188 * 6) {
			this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2 = new Class14_Sub21_Sub1((this.anInt3188 + 100) * 6);
		} else {
			this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2.anInt8936 = 0;
		}
		@Pc(46) Class14_Sub21_Sub1 local46 = this.aClass144_Sub3_11.aClass14_Sub21_Sub1_2;
		@Pc(52) int local52;
		if (this.aClass144_Sub3_11.aBoolean557) {
			for (local52 = 0; local52 < this.anInt3188; local52++) {
				local46.method7751(this.aShortArray48[local52]);
				local46.method7751(this.aShortArray42[local52]);
				local46.method7751(this.aShortArray43[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt3188; local52++) {
				local46.method7722(this.aShortArray48[local52]);
				local46.method7722(this.aShortArray42[local52]);
				local46.method7722(this.aShortArray43[local52]);
			}
		}
		if (7108 != 7108) {
			this.aShortArray43 = null;
		}
		if (local46.anInt8936 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface6_1 == null) {
				this.anInterface6_1 = this.aClass144_Sub3_11.method6991(true, local46.aByteArray99, local46.anInt8936);
			} else {
				this.anInterface6_1.method8717(local46.anInt8936, local46.aByteArray99);
			}
			this.aClass248_1.anInterface6_2 = this.anInterface6_1;
		} else {
			this.aClass248_1.anInterface6_2 = this.aClass144_Sub3_11.method6991(false, local46.aByteArray99, local46.anInt8936);
		}
		if (!arg0) {
			this.aBoolean231 = true;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!rd;ZI)Z")
	@Override
	public boolean method5296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class263 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method2822(arg4, arg3, arg2, -1, arg0, arg1);
	}

	@OriginalMember(owner = "client!gea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt3130;
	}

	@OriginalMember(owner = "client!gea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean228) {
			this.method2815();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!gea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass380_1 != null) {
			this.aClass380_1.anInterface12_7 = null;
		}
		this.aShort41 = (short) arg0;
		if (this.aClass380_4 != null) {
			this.aClass380_4.anInterface12_7 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5284(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(58) int local58;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(40) int local40;
		@Pc(52) int local52;
		@Pc(50) int[] local50;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static356.anInt6089 = 0;
			Static216.anInt6459 = 0;
			Static280.anInt5163 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray21.length) {
					local50 = this.anIntArrayArray21[local40];
					for (local52 = 0; local52 < local50.length; local52++) {
						local58 = local50[local52];
						Static356.anInt6089 += this.anIntArray189[local58];
						Static216.anInt6459 += this.anIntArray190[local58];
						local24++;
						Static280.anInt5163 += this.anIntArray191[local58];
					}
				}
			}
			if (local24 > 0) {
				Static356.anInt6089 = local14 + Static356.anInt6089 / local24;
				Static216.anInt6459 = local18 + Static216.anInt6459 / local24;
				Static280.anInt5163 = Static280.anInt5163 / local24 + local22;
			} else {
				Static280.anInt5163 = local22;
				Static216.anInt6459 = local18;
				Static356.anInt6089 = local14;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local18 = arg3 << 4;
			local14 = arg2 << 4;
			local22 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray21.length > local32) {
					local165 = this.anIntArrayArray21[local32];
					for (local167 = 0; local167 < local165.length; local167++) {
						local52 = local165[local167];
						this.anIntArray189[local52] += local14;
						this.anIntArray190[local52] += local18;
						this.anIntArray191[local52] += local22;
					}
				}
			}
			return;
		}
		@Pc(288) int local288;
		@Pc(307) int local307;
		@Pc(772) int local772;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray21.length) {
					local165 = this.anIntArrayArray21[local32];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local52 = local165[local167];
							this.anIntArray189[local52] -= Static356.anInt6089;
							this.anIntArray190[local52] -= Static216.anInt6459;
							this.anIntArray191[local52] -= Static280.anInt5163;
							if (arg4 != 0) {
								local58 = Class141.anIntArray207[arg4];
								local288 = Class141.anIntArray208[arg4];
								local307 = this.anIntArray189[local52] * local288 + local58 * this.anIntArray190[local52] + 16383 >> 14;
								this.anIntArray190[local52] = this.anIntArray190[local52] * local288 + 16383 - this.anIntArray189[local52] * local58 >> 14;
								this.anIntArray189[local52] = local307;
							}
							if (arg2 != 0) {
								local58 = Class141.anIntArray207[arg2];
								local288 = Class141.anIntArray208[arg2];
								local307 = this.anIntArray190[local52] * local288 + 16383 - local58 * this.anIntArray191[local52] >> 14;
								this.anIntArray191[local52] = local58 * this.anIntArray190[local52] + this.anIntArray191[local52] * local288 + 16383 >> 14;
								this.anIntArray190[local52] = local307;
							}
							if (arg3 != 0) {
								local58 = Class141.anIntArray207[arg3];
								local288 = Class141.anIntArray208[arg3];
								local307 = local288 * this.anIntArray189[local52] + local58 * this.anIntArray191[local52] + 16383 >> 14;
								this.anIntArray191[local52] = this.anIntArray191[local52] * local288 + 16383 - local58 * this.anIntArray189[local52] >> 14;
								this.anIntArray189[local52] = local307;
							}
							this.anIntArray189[local52] += Static356.anInt6089;
							this.anIntArray190[local52] += Static216.anInt6459;
							this.anIntArray191[local52] += Static280.anInt5163;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local52 = local165[local167];
							this.anIntArray189[local52] -= Static356.anInt6089;
							this.anIntArray190[local52] -= Static216.anInt6459;
							this.anIntArray191[local52] -= Static280.anInt5163;
							if (arg2 != 0) {
								local58 = Class141.anIntArray207[arg2];
								local288 = Class141.anIntArray208[arg2];
								local307 = local288 * this.anIntArray190[local52] + 16383 - this.anIntArray191[local52] * local58 >> 14;
								this.anIntArray191[local52] = local58 * this.anIntArray190[local52] + local288 * this.anIntArray191[local52] + 16383 >> 14;
								this.anIntArray190[local52] = local307;
							}
							if (arg4 != 0) {
								local58 = Class141.anIntArray207[arg4];
								local288 = Class141.anIntArray208[arg4];
								local307 = this.anIntArray190[local52] * local58 + local288 * this.anIntArray189[local52] + 16383 >> 14;
								this.anIntArray190[local52] = this.anIntArray190[local52] * local288 + 16383 - local58 * this.anIntArray189[local52] >> 14;
								this.anIntArray189[local52] = local307;
							}
							if (arg3 != 0) {
								local58 = Class141.anIntArray207[arg3];
								local288 = Class141.anIntArray208[arg3];
								local307 = local288 * this.anIntArray189[local52] + local58 * this.anIntArray191[local52] + 16383 >> 14;
								this.anIntArray191[local52] = local288 * this.anIntArray191[local52] + 16383 - this.anIntArray189[local52] * local58 >> 14;
								this.anIntArray189[local52] = local307;
							}
							this.anIntArray189[local52] += Static356.anInt6089;
							this.anIntArray190[local52] += Static216.anInt6459;
							this.anIntArray191[local52] += Static280.anInt5163;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local40 = arg1[local32];
					if (this.anIntArrayArray21.length > local40) {
						local50 = this.anIntArrayArray21[local40];
						for (local52 = 0; local52 < local50.length; local52++) {
							local58 = local50[local52];
							local288 = this.anIntArray187[local58];
							local307 = this.anIntArray187[local58 + 1];
							for (local772 = local288; local772 < local307; local772++) {
								@Pc(781) int local781 = this.aShortArray45[local772] - 1;
								if (local781 == -1) {
									break;
								}
								@Pc(793) int local793;
								@Pc(797) int local797;
								@Pc(815) int local815;
								if (arg4 != 0) {
									local793 = Class141.anIntArray207[arg4];
									local797 = Class141.anIntArray208[arg4];
									local815 = local797 * this.aShortArray50[local781] + local793 * this.aShortArray47[local781] + 16383 >> 14;
									this.aShortArray47[local781] = (short) (local797 * this.aShortArray47[local781] + 16383 - this.aShortArray50[local781] * local793 >> 14);
									this.aShortArray50[local781] = (short) local815;
								}
								if (arg2 != 0) {
									local793 = Class141.anIntArray207[arg2];
									local797 = Class141.anIntArray208[arg2];
									local815 = local797 * this.aShortArray47[local781] + 16383 - local793 * this.aShortArray44[local781] >> 14;
									this.aShortArray44[local781] = (short) (this.aShortArray44[local781] * local797 + this.aShortArray47[local781] * local793 + 16383 >> 14);
									this.aShortArray47[local781] = (short) local815;
								}
								if (arg3 != 0) {
									local793 = Class141.anIntArray207[arg3];
									local797 = Class141.anIntArray208[arg3];
									local815 = this.aShortArray44[local781] * local793 + this.aShortArray50[local781] * local797 + 16383 >> 14;
									this.aShortArray44[local781] = (short) (this.aShortArray44[local781] * local797 + 16383 - this.aShortArray50[local781] * local793 >> 14);
									this.aShortArray50[local781] = (short) local815;
								}
							}
						}
					}
				}
				if (this.aClass380_4 == null && this.aClass380_1 != null) {
					this.aClass380_1.anInterface12_7 = null;
				}
				if (this.aClass380_4 != null) {
					this.aClass380_4.anInterface12_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray21.length) {
					local165 = this.anIntArrayArray21[local32];
					for (local167 = 0; local167 < local165.length; local167++) {
						local52 = local165[local167];
						this.anIntArray189[local52] -= Static356.anInt6089;
						this.anIntArray190[local52] -= Static216.anInt6459;
						this.anIntArray191[local52] -= Static280.anInt5163;
						this.anIntArray189[local52] = this.anIntArray189[local52] * arg2 >> 7;
						this.anIntArray190[local52] = this.anIntArray190[local52] * arg3 >> 7;
						this.anIntArray191[local52] = arg4 * this.anIntArray191[local52] >> 7;
						this.anIntArray189[local52] += Static356.anInt6089;
						this.anIntArray190[local52] += Static216.anInt6459;
						this.anIntArray191[local52] += Static280.anInt5163;
					}
				}
			}
		} else {
			@Pc(1262) Class242 local1262;
			@Pc(1267) Class185 local1267;
			if (arg0 == 5) {
				if (this.anIntArrayArray19 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray19.length > local32) {
							local165 = this.anIntArrayArray19[local32];
							for (local167 = 0; local167 < local165.length; local167++) {
								local52 = local165[local167];
								local58 = (this.aByteArray49[local52] & 0xFF) + (arg2 * 8);
								if (local58 < 0) {
									local58 = 0;
								} else if (local58 > 255) {
									local58 = 255;
								}
								this.aByteArray49[local52] = (byte) local58;
							}
							if (local165.length > 0 && this.aClass380_1 != null) {
								this.aClass380_1.anInterface12_7 = null;
							}
						}
					}
					if (this.aClass242Array1 != null) {
						for (local32 = 0; local32 < this.anInt3153; local32++) {
							local1262 = this.aClass242Array1[local32];
							local1267 = this.aClass185Array1[local32];
							local1267.anInt5132 = local1267.anInt5132 & 0xFFFFFF | 255 - (this.aByteArray49[local1262.anInt6778] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1537) Class185 local1537;
				if (arg0 == 8) {
					if (this.anIntArrayArray20 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray20.length) {
								local165 = this.anIntArrayArray20[local32];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1537 = this.aClass185Array1[local165[local167]];
									local1537.anInt5129 += arg3;
									local1537.anInt5135 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray20 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray20.length) {
								local165 = this.anIntArrayArray20[local32];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1537 = this.aClass185Array1[local165[local167]];
									local1537.anInt5137 = local1537.anInt5137 * arg3 >> 7;
									local1537.anInt5136 = arg2 * local1537.anInt5136 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray20 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray20.length > local32) {
							local165 = this.anIntArrayArray20[local32];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1537 = this.aClass185Array1[local165[local167]];
								local1537.anInt5131 = arg2 + local1537.anInt5131 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray19 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray19.length) {
						local165 = this.anIntArrayArray19[local32];
						for (local167 = 0; local167 < local165.length; local167++) {
							local52 = local165[local167];
							local58 = this.aShortArray41[local52] & 0xFFFF;
							local288 = local58 >> 10 & 0x3F;
							local307 = local58 >> 7 & 0x7;
							@Pc(1358) int local1358 = local288 + arg2 & 0x3F;
							local307 += arg3 / 4;
							local772 = local58 & 0x7F;
							if (local307 < 0) {
								local307 = 0;
							} else if (local307 > 7) {
								local307 = 7;
							}
							local772 += arg4;
							if (local772 < 0) {
								local772 = 0;
							} else if (local772 > 127) {
								local772 = 127;
							}
							this.aShortArray41[local52] = (short) (local772 | local307 << 7 | local1358 << 10);
						}
						if (local165.length > 0 && this.aClass380_1 != null) {
							this.aClass380_1.anInterface12_7 = null;
						}
					}
				}
				if (this.aClass242Array1 != null) {
					for (local32 = 0; local32 < this.anInt3153; local32++) {
						local1262 = this.aClass242Array1[local32];
						local1267 = this.aClass185Array1[local32];
						local1267.anInt5132 = Static302.anIntArray299[this.aShortArray41[local1262.anInt6778] & 0xFFFF] & 0xFFFFFF | local1267.anInt5132 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "()V")
	@Override
	public void method5300() {
		if (this.anInt3179 <= 0 || this.anInt3188 <= 0) {
			return;
		}
		this.method2820(false);
		if ((this.aByte67 & 0x10) == 0 && this.aClass248_1.anInterface6_2 == null) {
			this.method2823(false);
		}
		this.method2824();
	}

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(62) int local62;
		@Pc(40) int local40;
		@Pc(56) int local56;
		@Pc(54) int[] local54;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static280.anInt5163 = 0;
			local26 = 0;
			Static216.anInt6459 = 0;
			Static356.anInt6089 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (this.anIntArrayArray21.length > local40) {
					local54 = this.anIntArrayArray21[local40];
					for (local56 = 0; local56 < local54.length; local56++) {
						local62 = local54[local56];
						if (this.aShortArray46 == null || (arg6 & this.aShortArray46[local62]) != 0) {
							Static356.anInt6089 += this.anIntArray189[local62];
							Static216.anInt6459 += this.anIntArray190[local62];
							local26++;
							Static280.anInt5163 += this.anIntArray191[local62];
						}
					}
				}
			}
			if (local26 > 0) {
				Static280.anInt5163 = Static280.anInt5163 / local26 + arg4;
				Static356.anInt6089 = Static356.anInt6089 / local26 + arg2;
				Static216.anInt6459 = Static216.anInt6459 / local26 + arg3;
				Static51.aBoolean67 = true;
			} else {
				Static216.anInt6459 = arg3;
				Static280.anInt5163 = arg4;
				Static356.anInt6089 = arg2;
			}
			return;
		}
		@Pc(267) int[] local267;
		@Pc(269) int local269;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg4 * arg7[2] + arg3 * arg7[1] + arg7[0] * arg2 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local40 = arg4 * arg7[8] + arg2 * arg7[6] + arg7[7] * arg3 + 8192 >> 14;
				arg3 = local32;
				arg4 = local40;
				arg2 = local26;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray21.length > local32) {
					local267 = this.anIntArrayArray21[local32];
					for (local269 = 0; local269 < local267.length; local269++) {
						local56 = local267[local269];
						if (this.aShortArray46 == null || (arg6 & this.aShortArray46[local56]) != 0) {
							this.anIntArray189[local56] += arg2;
							this.anIntArray190[local56] += arg3;
							this.anIntArray191[local56] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(416) int local416;
		@Pc(434) int local434;
		@Pc(676) int local676;
		@Pc(685) int local685;
		@Pc(699) int local699;
		@Pc(703) int local703;
		@Pc(721) int local721;
		@Pc(1074) int local1074;
		@Pc(1082) int local1082;
		@Pc(1236) int local1236;
		@Pc(1261) int local1261;
		@Pc(1266) int local1266;
		@Pc(1275) int local1275;
		@Pc(1280) int local1280;
		@Pc(1284) int local1284;
		@Pc(1288) int local1288;
		@Pc(1290) int local1290;
		@Pc(1427) int[] local1427;
		@Pc(1429) int local1429;
		@Pc(1435) int local1435;
		@Pc(1439) int local1439;
		@Pc(1441) int local1441;
		@Pc(1573) int local1573;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray21.length) {
						local267 = this.anIntArrayArray21[local32];
						for (local269 = 0; local269 < local267.length; local269++) {
							local56 = local267[local269];
							if (this.aShortArray46 == null || (this.aShortArray46[local56] & arg6) != 0) {
								this.anIntArray189[local56] -= Static356.anInt6089;
								this.anIntArray190[local56] -= Static216.anInt6459;
								this.anIntArray191[local56] -= Static280.anInt5163;
								if (arg4 != 0) {
									local62 = Class141.anIntArray207[arg4];
									local416 = Class141.anIntArray208[arg4];
									local434 = this.anIntArray189[local56] * local416 + local62 * this.anIntArray190[local56] + 16383 >> 14;
									this.anIntArray190[local56] = this.anIntArray190[local56] * local416 + 16383 - local62 * this.anIntArray189[local56] >> 14;
									this.anIntArray189[local56] = local434;
								}
								if (arg2 != 0) {
									local62 = Class141.anIntArray207[arg2];
									local416 = Class141.anIntArray208[arg2];
									local434 = this.anIntArray190[local56] * local416 + 16383 - local62 * this.anIntArray191[local56] >> 14;
									this.anIntArray191[local56] = local62 * this.anIntArray190[local56] + this.anIntArray191[local56] * local416 + 16383 >> 14;
									this.anIntArray190[local56] = local434;
								}
								if (arg3 != 0) {
									local62 = Class141.anIntArray207[arg3];
									local416 = Class141.anIntArray208[arg3];
									local434 = local62 * this.anIntArray191[local56] + local416 * this.anIntArray189[local56] + 16383 >> 14;
									this.anIntArray191[local56] = this.anIntArray191[local56] * local416 + 16383 - local62 * this.anIntArray189[local56] >> 14;
									this.anIntArray189[local56] = local434;
								}
								this.anIntArray189[local56] += Static356.anInt6089;
								this.anIntArray190[local56] += Static216.anInt6459;
								this.anIntArray191[local56] += Static280.anInt5163;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray21.length) {
							local54 = this.anIntArrayArray21[local40];
							for (local56 = 0; local56 < local54.length; local56++) {
								local62 = local54[local56];
								if (this.aShortArray46 == null || (this.aShortArray46[local62] & arg6) != 0) {
									local416 = this.anIntArray187[local62];
									local434 = this.anIntArray187[local62 + 1];
									for (local676 = local416; local676 < local434; local676++) {
										local685 = this.aShortArray45[local676] - 1;
										if (local685 == -1) {
											break;
										}
										if (arg4 != 0) {
											local699 = Class141.anIntArray207[arg4];
											local703 = Class141.anIntArray208[arg4];
											local721 = this.aShortArray50[local685] * local703 + local699 * this.aShortArray47[local685] + 16383 >> 14;
											this.aShortArray47[local685] = (short) (local703 * this.aShortArray47[local685] + 16383 - local699 * this.aShortArray50[local685] >> 14);
											this.aShortArray50[local685] = (short) local721;
										}
										if (arg2 != 0) {
											local699 = Class141.anIntArray207[arg2];
											local703 = Class141.anIntArray208[arg2];
											local721 = this.aShortArray47[local685] * local703 + 16383 - this.aShortArray44[local685] * local699 >> 14;
											this.aShortArray44[local685] = (short) (local699 * this.aShortArray47[local685] + this.aShortArray44[local685] * local703 + 16383 >> 14);
											this.aShortArray47[local685] = (short) local721;
										}
										if (arg3 != 0) {
											local699 = Class141.anIntArray207[arg3];
											local703 = Class141.anIntArray208[arg3];
											local721 = this.aShortArray44[local685] * local699 + local703 * this.aShortArray50[local685] + 16383 >> 14;
											this.aShortArray44[local685] = (short) (this.aShortArray44[local685] * local703 + 16383 - local699 * this.aShortArray50[local685] >> 14);
											this.aShortArray50[local685] = (short) local721;
										}
									}
								}
							}
						}
					}
					if (this.aClass380_4 == null && this.aClass380_1 != null) {
						this.aClass380_1.anInterface12_7 = null;
					}
					if (this.aClass380_4 != null) {
						this.aClass380_4.anInterface12_7 = null;
						return;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local269 = arg7[12] << 4;
				local56 = arg7[13] << 4;
				local62 = arg7[14] << 4;
				if (Static51.aBoolean67) {
					local416 = Static280.anInt5163 * arg7[6] + arg7[3] * Static216.anInt6459 + arg7[0] * Static356.anInt6089 + 8192 >> 14;
					local434 = arg7[7] * Static280.anInt5163 + arg7[1] * Static356.anInt6089 + Static216.anInt6459 * arg7[4] + 8192 >> 14;
					local416 += local269;
					local676 = arg7[2] * Static356.anInt6089 + Static216.anInt6459 * arg7[5] + arg7[8] * Static280.anInt5163 + 8192 >> 14;
					local434 += local56;
					Static356.anInt6089 = local416;
					local676 += local62;
					Static216.anInt6459 = local434;
					Static51.aBoolean67 = false;
					Static280.anInt5163 = local676;
				}
				@Pc(1042) int[] local1042 = new int[9];
				local434 = Class141.anIntArray208[arg2];
				local676 = Class141.anIntArray207[arg2];
				local685 = Class141.anIntArray208[arg3];
				local699 = Class141.anIntArray207[arg3];
				local703 = Class141.anIntArray208[arg4];
				local721 = Class141.anIntArray207[arg4];
				local1074 = local676 * local703 + 8192 >> 14;
				local1082 = local676 * local721 + 8192 >> 14;
				local1042[5] = -local676;
				local1042[7] = local685 * local1074 + local721 * local699 + 8192 >> 14;
				local1042[2] = local699 * local434 + 8192 >> 14;
				local1042[3] = local721 * local434 + 8192 >> 14;
				local1042[0] = local685 * local703 + local1082 * local699 + 8192 >> 14;
				local1042[8] = local434 * local685 + 8192 >> 14;
				local1042[4] = local434 * local703 + 8192 >> 14;
				local1042[1] = local699 * local1074 + -local685 * local721 + 8192 >> 14;
				local1042[6] = local703 * -local699 + local1082 * local685 + 8192 >> 14;
				@Pc(1211) int local1211 = local1042[2] * -Static280.anInt5163 + -Static216.anInt6459 * local1042[1] + -Static356.anInt6089 * local1042[0] + 8192 >> 14;
				local1236 = -Static216.anInt6459 * local1042[4] + -Static356.anInt6089 * local1042[3] + local1042[5] * -Static280.anInt5163 + 8192 >> 14;
				local1261 = local1042[8] * -Static280.anInt5163 + -Static216.anInt6459 * local1042[7] + local1042[6] * -Static356.anInt6089 + 8192 >> 14;
				local1266 = local1211 + Static356.anInt6089;
				@Pc(1271) int local1271 = local1236 + Static216.anInt6459;
				local1275 = local1261 + Static280.anInt5163;
				@Pc(1278) int[] local1278 = new int[9];
				for (local1280 = 0; local1280 < 3; local1280++) {
					for (local1284 = 0; local1284 < 3; local1284++) {
						local1288 = 0;
						for (local1290 = 0; local1290 < 3; local1290++) {
							local1288 += local1042[local1280 * 3 + local1290] * arg7[local1284 * 3 + local1290];
						}
						local1278[local1280 * 3 + local1284] = local1288 + 8192 >> 14;
					}
				}
				local1284 = local56 * local1042[1] + local269 * local1042[0] + local62 * local1042[2] + 8192 >> 14;
				local1288 = local62 * local1042[5] + local269 * local1042[3] + local1042[4] * local56 + 8192 >> 14;
				local1284 += local1266;
				local1288 += local1271;
				local1290 = local1042[6] * local269 + local1042[7] * local56 + local1042[8] * local62 + 8192 >> 14;
				local1290 += local1275;
				local1427 = new int[9];
				for (local1429 = 0; local1429 < 3; local1429++) {
					for (local1435 = 0; local1435 < 3; local1435++) {
						local1439 = 0;
						for (local1441 = 0; local1441 < 3; local1441++) {
							local1439 += arg7[local1441 + local1429 * 3] * local1278[local1441 * 3 + local1435];
						}
						local1427[local1429 * 3 + local1435] = local1439 + 8192 >> 14;
					}
				}
				local1435 = local1290 * arg7[2] + arg7[1] * local1288 + arg7[0] * local1284 + 8192 >> 14;
				local1439 = local1290 * arg7[5] + arg7[4] * local1288 + local1284 * arg7[3] + 8192 >> 14;
				local1441 = local1288 * arg7[7] + arg7[6] * local1284 + arg7[8] * local1290 + 8192 >> 14;
				local1435 += local26;
				local1439 += local32;
				local1441 += local40;
				for (local1573 = 0; local1573 < local8; local1573++) {
					@Pc(1581) int local1581 = arg1[local1573];
					if (this.anIntArrayArray21.length > local1581) {
						@Pc(1595) int[] local1595 = this.anIntArrayArray21[local1581];
						for (@Pc(1597) int local1597 = 0; local1597 < local1595.length; local1597++) {
							@Pc(1603) int local1603 = local1595[local1597];
							if (this.aShortArray46 == null || (this.aShortArray46[local1603] & arg6) != 0) {
								@Pc(1651) int local1651 = local1427[0] * this.anIntArray189[local1603] + this.anIntArray190[local1603] * local1427[1] + local1427[2] * this.anIntArray191[local1603] + 8192 >> 14;
								@Pc(1683) int local1683 = this.anIntArray189[local1603] * local1427[3] + local1427[4] * this.anIntArray190[local1603] + local1427[5] * this.anIntArray191[local1603] + 8192 >> 14;
								@Pc(1687) int local1687 = local1651 + local1435;
								@Pc(1719) int local1719 = this.anIntArray190[local1603] * local1427[7] + this.anIntArray189[local1603] * local1427[6] + this.anIntArray191[local1603] * local1427[8] + 8192 >> 14;
								@Pc(1723) int local1723 = local1683 + local1439;
								this.anIntArray189[local1603] = local1687;
								@Pc(1732) int local1732 = local1719 + local1441;
								this.anIntArray190[local1603] = local1723;
								this.anIntArray191[local1603] = local1732;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2698) Class242 local2698;
			@Pc(2703) Class185 local2703;
			if (arg0 == 5) {
				if (this.anIntArrayArray19 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray19.length) {
							local267 = this.anIntArrayArray19[local32];
							for (local269 = 0; local269 < local267.length; local269++) {
								local56 = local267[local269];
								if (this.aShortArray51 == null || (this.aShortArray51[local56] & arg6) != 0) {
									local62 = (this.aByteArray49[local56] & 0xFF) + arg2 * 8;
									if (local62 < 0) {
										local62 = 0;
									} else if (local62 > 255) {
										local62 = 255;
									}
									this.aByteArray49[local56] = (byte) local62;
									if (this.aClass380_1 != null) {
										this.aClass380_1.anInterface12_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass242Array1 != null) {
						for (local32 = 0; local32 < this.anInt3153; local32++) {
							local2698 = this.aClass242Array1[local32];
							local2703 = this.aClass185Array1[local32];
							local2703.anInt5132 = 255 - (this.aByteArray49[local2698.anInt6778] & 0xFF) << 24 | local2703.anInt5132 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2964) Class185 local2964;
				if (arg0 == 8) {
					if (this.anIntArrayArray20 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray20.length > local32) {
								local267 = this.anIntArrayArray20[local32];
								for (local269 = 0; local269 < local267.length; local269++) {
									local2964 = this.aClass185Array1[local267[local269]];
									local2964.anInt5129 += arg3;
									local2964.anInt5135 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray20 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (local32 < this.anIntArrayArray20.length) {
								local267 = this.anIntArrayArray20[local32];
								for (local269 = 0; local269 < local267.length; local269++) {
									local2964 = this.aClass185Array1[local267[local269]];
									local2964.anInt5136 = arg2 * local2964.anInt5136 >> 7;
									local2964.anInt5137 = local2964.anInt5137 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray20 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray20.length) {
							local267 = this.anIntArrayArray20[local32];
							for (local269 = 0; local269 < local267.length; local269++) {
								local2964 = this.aClass185Array1[local267[local269]];
								local2964.anInt5131 = arg2 + local2964.anInt5131 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray19 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray19.length > local32) {
						local267 = this.anIntArrayArray19[local32];
						for (local269 = 0; local269 < local267.length; local269++) {
							local56 = local267[local269];
							if (this.aShortArray51 == null || (arg6 & this.aShortArray51[local56]) != 0) {
								local62 = this.aShortArray41[local56] & 0xFFFF;
								local416 = local62 >> 10 & 0x3F;
								local434 = local62 >> 7 & 0x7;
								local676 = local62 & 0x7F;
								local434 += arg3 / 4;
								@Pc(2812) int local2812 = local416 + arg2 & 0x3F;
								local676 += arg4;
								if (local434 < 0) {
									local434 = 0;
								} else if (local434 > 7) {
									local434 = 7;
								}
								if (local676 < 0) {
									local676 = 0;
								} else if (local676 > 127) {
									local676 = 127;
								}
								this.aShortArray41[local56] = (short) (local2812 << 10 | local434 << 7 | local676);
								if (this.aClass380_1 != null) {
									this.aClass380_1.anInterface12_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass242Array1 != null) {
					for (local32 = 0; local32 < this.anInt3153; local32++) {
						local2698 = this.aClass242Array1[local32];
						local2703 = this.aClass185Array1[local32];
						local2703.anInt5132 = local2703.anInt5132 & 0xFF000000 | Static302.anIntArray299[this.aShortArray41[local2698.anInt6778] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray21.length > local32) {
					local267 = this.anIntArrayArray21[local32];
					for (local269 = 0; local269 < local267.length; local269++) {
						local56 = local267[local269];
						if (this.aShortArray46 == null || (this.aShortArray46[local56] & arg6) != 0) {
							this.anIntArray189[local56] -= Static356.anInt6089;
							this.anIntArray190[local56] -= Static216.anInt6459;
							this.anIntArray191[local56] -= Static280.anInt5163;
							this.anIntArray189[local56] = arg2 * this.anIntArray189[local56] >> 7;
							this.anIntArray190[local56] = arg3 * this.anIntArray190[local56] >> 7;
							this.anIntArray191[local56] = arg4 * this.anIntArray191[local56] >> 7;
							this.anIntArray189[local56] += Static356.anInt6089;
							this.anIntArray190[local56] += Static216.anInt6459;
							this.anIntArray191[local56] += Static280.anInt5163;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local269 = arg7[12] << 4;
			local56 = arg7[13] << 4;
			local62 = arg7[14] << 4;
			if (Static51.aBoolean67) {
				local416 = arg7[3] * Static216.anInt6459 + Static356.anInt6089 * arg7[0] + arg7[6] * Static280.anInt5163 + 8192 >> 14;
				local434 = Static216.anInt6459 * arg7[4] + Static356.anInt6089 * arg7[1] + arg7[7] * Static280.anInt5163 + 8192 >> 14;
				local676 = Static356.anInt6089 * arg7[2] + Static216.anInt6459 * arg7[5] + Static280.anInt5163 * arg7[8] + 8192 >> 14;
				local434 += local56;
				local416 += local269;
				Static356.anInt6089 = local416;
				Static216.anInt6459 = local434;
				local676 += local62;
				Static280.anInt5163 = local676;
				Static51.aBoolean67 = false;
			}
			local416 = arg2 << 15 >> 7;
			local434 = arg3 << 15 >> 7;
			local676 = arg4 << 15 >> 7;
			local685 = local416 * -Static356.anInt6089 + 8192 >> 14;
			local699 = -Static216.anInt6459 * local434 + 8192 >> 14;
			local703 = local676 * -Static280.anInt5163 + 8192 >> 14;
			local721 = Static356.anInt6089 + local685;
			local1074 = Static216.anInt6459 + local699;
			local1082 = local703 + Static280.anInt5163;
			@Pc(2092) int[] local2092 = new int[] { arg7[0] * local416 + 8192 >> 14, local416 * arg7[3] + 8192 >> 14, arg7[6] * local416 + 8192 >> 14, local434 * arg7[1] + 8192 >> 14, local434 * arg7[4] + 8192 >> 14, arg7[7] * local434 + 8192 >> 14, arg7[2] * local676 + 8192 >> 14, arg7[5] * local676 + 8192 >> 14, local676 * arg7[8] + 8192 >> 14 };
			local1236 = local269 * local416 + 8192 >> 14;
			local1261 = local56 * local434 + 8192 >> 14;
			@Pc(2220) int local2220 = local1261 + local1074;
			local1266 = local676 * local62 + 8192 >> 14;
			@Pc(2232) int local2232 = local1236 + local721;
			@Pc(2236) int local2236 = local1266 + local1082;
			@Pc(2239) int[] local2239 = new int[9];
			@Pc(2245) int local2245;
			for (local1275 = 0; local1275 < 3; local1275++) {
				for (local2245 = 0; local2245 < 3; local2245++) {
					local1280 = 0;
					for (local1284 = 0; local1284 < 3; local1284++) {
						local1280 += arg7[local1275 * 3 + local1284] * local2092[local1284 * 3 + local2245];
					}
					local2239[local2245 + local1275 * 3] = local1280 + 8192 >> 14;
				}
			}
			local2245 = local2232 * arg7[0] + local2220 * arg7[1] + local2236 * arg7[2] + 8192 >> 14;
			local1280 = arg7[5] * local2236 + arg7[3] * local2232 + local2220 * arg7[4] + 8192 >> 14;
			local1284 = local2236 * arg7[8] + arg7[6] * local2232 + arg7[7] * local2220 + 8192 >> 14;
			local2245 += local26;
			local1280 += local32;
			local1284 += local40;
			for (local1288 = 0; local1288 < local8; local1288++) {
				local1290 = arg1[local1288];
				if (this.anIntArrayArray21.length > local1290) {
					local1427 = this.anIntArrayArray21[local1290];
					for (local1429 = 0; local1429 < local1427.length; local1429++) {
						local1435 = local1427[local1429];
						if (this.aShortArray46 == null || (this.aShortArray46[local1435] & arg6) != 0) {
							local1439 = local2239[1] * this.anIntArray190[local1435] + this.anIntArray189[local1435] * local2239[0] + local2239[2] * this.anIntArray191[local1435] + 8192 >> 14;
							local1441 = local2239[3] * this.anIntArray189[local1435] + this.anIntArray190[local1435] * local2239[4] + local2239[5] * this.anIntArray191[local1435] + 8192 >> 14;
							local1573 = local2239[6] * this.anIntArray189[local1435] + this.anIntArray190[local1435] * local2239[7] + this.anIntArray191[local1435] * local2239[8] + 8192 >> 14;
							@Pc(2530) int local2530 = local1439 + local2245;
							@Pc(2534) int local2534 = local1441 + local1280;
							this.anIntArray189[local1435] = local2530;
							@Pc(2543) int local2543 = local1573 + local1284;
							this.anIntArray190[local1435] = local2534;
							this.anIntArray191[local1435] = local2543;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
	private void method2824() {
		if (!this.aBoolean231) {
			return;
		}
		this.aBoolean231 = false;
		if (this.aClass352Array2 == null && this.aClass172Array2 == null && this.aClass242Array1 == null && !Static488.method7359(this.anInt3133, this.anInt3130)) {
			@Pc(45) boolean local45 = false;
			@Pc(47) boolean local47 = false;
			@Pc(49) boolean local49 = false;
			if (this.anIntArray189 != null && !Static654.method9150(this.anInt3133, this.anInt3130)) {
				if (this.aClass380_2 != null && this.aClass380_2.anInterface12_7 == null) {
					this.aBoolean231 = true;
				} else {
					local45 = true;
					if (!this.aBoolean228) {
						this.method2815();
					}
				}
			}
			if (this.anIntArray190 != null && !Static103.method1710(this.anInt3130, this.anInt3133)) {
				if (this.aClass380_2 != null && this.aClass380_2.anInterface12_7 == null) {
					this.aBoolean231 = true;
				} else {
					if (!this.aBoolean228) {
						this.method2815();
					}
					local47 = true;
				}
			}
			if (this.anIntArray191 != null && !Static221.method3809(this.anInt3130, this.anInt3133)) {
				if (this.aClass380_2 != null && this.aClass380_2.anInterface12_7 == null) {
					this.aBoolean231 = true;
				} else {
					local49 = true;
					if (!this.aBoolean228) {
						this.method2815();
					}
				}
			}
			if (local49) {
				this.anIntArray191 = null;
			}
			if (local47) {
				this.anIntArray190 = null;
			}
			if (local45) {
				this.anIntArray189 = null;
			}
		}
		if (this.aShortArray45 != null && this.anIntArray189 == null && this.anIntArray190 == null && this.anIntArray191 == null) {
			this.anIntArray187 = null;
			this.aShortArray45 = null;
		}
		if (this.aByteArray48 != null && !Static129.method1989(this.anInt3133, this.anInt3130)) {
			if (this.aClass380_4 == null) {
				if (this.aClass380_1 != null && this.aClass380_1.anInterface12_7 == null) {
					this.aBoolean231 = true;
				} else {
					this.aByteArray48 = null;
					this.aShortArray50 = this.aShortArray47 = this.aShortArray44 = null;
				}
			} else if (this.aClass380_4.anInterface12_7 == null) {
				this.aBoolean231 = true;
			} else {
				this.aByteArray48 = null;
				this.aShortArray50 = this.aShortArray47 = this.aShortArray44 = null;
			}
		}
		if (this.aShortArray41 != null && !Static683.method9416(this.anInt3133, this.anInt3130)) {
			if (this.aClass380_1 != null && this.aClass380_1.anInterface12_7 == null) {
				this.aBoolean231 = true;
			} else {
				this.aShortArray41 = null;
			}
		}
		if (this.aByteArray49 != null && !Static242.method4048(this.anInt3130, this.anInt3133)) {
			if (this.aClass380_1 != null && this.aClass380_1.anInterface12_7 == null) {
				this.aBoolean231 = true;
			} else {
				this.aByteArray49 = null;
			}
		}
		if (this.aFloatArray15 != null && !Static287.method6689(this.anInt3133, this.anInt3130)) {
			if (this.aClass380_3 != null && this.aClass380_3.anInterface12_7 == null) {
				this.aBoolean231 = true;
			} else {
				this.aFloatArray15 = this.aFloatArray16 = null;
			}
		}
		if (this.aShortArray49 != null && !Static229.method3853(this.anInt3133, this.anInt3130)) {
			if (this.aClass380_1 != null && this.aClass380_1.anInterface12_7 == null) {
				this.aBoolean231 = true;
			} else {
				this.aShortArray49 = null;
			}
		}
		if (this.aShortArray48 != null && !Static603.method8516(this.anInt3130, this.anInt3133)) {
			if (this.aClass248_1 != null && this.aClass248_1.anInterface6_2 == null || this.aClass380_1 != null && this.aClass380_1.anInterface12_7 == null) {
				this.aBoolean231 = true;
			} else {
				this.aShortArray48 = this.aShortArray42 = this.aShortArray43 = null;
			}
		}
		if (this.anIntArrayArray19 != null && !Static629.method8827(this.anInt3133, this.anInt3130)) {
			this.aShortArray51 = null;
			this.anIntArrayArray19 = null;
		}
		if (this.anIntArrayArray21 != null && !Static660.method5892(this.anInt3130, this.anInt3133)) {
			this.aShortArray46 = null;
			this.anIntArrayArray21 = null;
		}
		if (this.anIntArrayArray20 != null && !Static64.method1039(this.anInt3133, this.anInt3130)) {
			this.anIntArrayArray20 = null;
		}
		if (this.anIntArray188 != null && (this.anInt3130 & 0x800) == 0 && (this.anInt3130 & 0x40000) == 0) {
			this.anIntArray188 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "()Z")
	@Override
	public boolean method5293() {
		if (this.aShortArray49 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray49.length; local13++) {
			if (this.aShortArray49[local13] != -1 && !this.aClass144_Sub3_11.anInterface4_12.method8974(this.aShortArray49[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5299(@OriginalArg(0) Class129 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class129_Sub1 local8 = (Class129_Sub1) arg0;
		if (this.anInt3171 == 0 || local8.anInt3171 == 0) {
			return;
		}
		@Pc(27) int local27 = local8.anInt3140;
		@Pc(30) int[] local30 = local8.anIntArray189;
		@Pc(33) int[] local33 = local8.anIntArray190;
		@Pc(36) int[] local36 = local8.anIntArray191;
		@Pc(39) short[] local39 = local8.aShortArray50;
		@Pc(42) short[] local42 = local8.aShortArray47;
		@Pc(45) short[] local45 = local8.aShortArray44;
		@Pc(48) byte[] local48 = local8.aByteArray48;
		@Pc(59) short[] local59;
		@Pc(63) short[] local63;
		@Pc(55) short[] local55;
		@Pc(67) byte[] local67;
		if (this.aClass71_1 == null) {
			local55 = null;
			local59 = null;
			local67 = null;
			local63 = null;
		} else {
			local55 = this.aClass71_1.aShortArray18;
			local59 = this.aClass71_1.aShortArray20;
			local63 = this.aClass71_1.aShortArray19;
			local67 = this.aClass71_1.aByteArray24;
		}
		@Pc(84) short[] local84;
		@Pc(92) short[] local92;
		@Pc(96) short[] local96;
		@Pc(88) byte[] local88;
		if (local8.aClass71_1 == null) {
			local88 = null;
			local96 = null;
			local84 = null;
			local92 = null;
		} else {
			local84 = local8.aClass71_1.aShortArray20;
			local88 = local8.aClass71_1.aByteArray24;
			local92 = local8.aClass71_1.aShortArray19;
			local96 = local8.aClass71_1.aShortArray18;
		}
		@Pc(109) int[] local109 = local8.anIntArray187;
		@Pc(112) short[] local112 = local8.aShortArray45;
		if (!local8.aBoolean228) {
			local8.method2815();
		}
		@Pc(123) short local123 = local8.aShort36;
		@Pc(126) short local126 = local8.aShort34;
		@Pc(129) short local129 = local8.aShort35;
		@Pc(132) short local132 = local8.aShort33;
		@Pc(135) short local135 = local8.aShort38;
		@Pc(138) short local138 = local8.aShort40;
		for (@Pc(140) int local140 = 0; local140 < this.anInt3140; local140++) {
			@Pc(150) int local150 = this.anIntArray190[local140] - arg2;
			if (local123 <= local150 && local150 <= local126) {
				@Pc(170) int local170 = this.anIntArray189[local140] - arg1;
				if (local129 <= local170 && local132 >= local170) {
					@Pc(194) int local194 = this.anIntArray191[local140] - arg3;
					if (local194 >= local135 && local138 >= local194) {
						@Pc(212) int local212 = -1;
						@Pc(217) int local217 = this.anIntArray187[local140];
						@Pc(224) int local224 = this.anIntArray187[local140 + 1];
						for (@Pc(226) int local226 = local217; local226 < local224; local226++) {
							local212 = this.aShortArray45[local226] - 1;
							if (local212 == -1 || this.aByteArray48[local212] != 0) {
								break;
							}
						}
						if (local212 != -1) {
							for (@Pc(267) int local267 = 0; local267 < local27; local267++) {
								if (local30[local267] == local170 && local36[local267] == local194 && local150 == local33[local267]) {
									local217 = local109[local267];
									@Pc(296) int local296 = -1;
									local224 = local109[local267 + 1];
									for (@Pc(304) int local304 = local217; local304 < local224; local304++) {
										local296 = local112[local304] - 1;
										if (local296 == -1 || local48[local296] != 0) {
											break;
										}
									}
									if (local296 != -1) {
										if (local59 == null) {
											this.aClass71_1 = new Class71();
											local59 = this.aClass71_1.aShortArray20 = Static258.method4327(this.aShortArray50);
											local63 = this.aClass71_1.aShortArray19 = Static258.method4327(this.aShortArray47);
											local55 = this.aClass71_1.aShortArray18 = Static258.method4327(this.aShortArray44);
											local67 = this.aClass71_1.aByteArray24 = Static156.method2242(this.aByteArray48);
										}
										if (local84 == null) {
											@Pc(392) Class71 local392 = local8.aClass71_1 = new Class71();
											local84 = local392.aShortArray20 = Static258.method4327(local39);
											local92 = local392.aShortArray19 = Static258.method4327(local42);
											local96 = local392.aShortArray18 = Static258.method4327(local45);
											local88 = local392.aByteArray24 = Static156.method2242(local48);
										}
										@Pc(425) short local425 = this.aShortArray50[local212];
										@Pc(430) short local430 = this.aShortArray47[local212];
										@Pc(435) short local435 = this.aShortArray44[local212];
										local217 = local109[local267];
										@Pc(444) byte local444 = this.aByteArray48[local212];
										local224 = local109[local267 + 1];
										@Pc(460) int local460;
										for (@Pc(452) int local452 = local217; local452 < local224; local452++) {
											local460 = local112[local452] - 1;
											if (local460 == -1) {
												break;
											}
											if (local88[local460] != 0) {
												local84[local460] += local425;
												local92[local460] += local430;
												local96[local460] += local435;
												local88[local460] += local444;
											}
										}
										local444 = local48[local296];
										local435 = local45[local296];
										local224 = this.anIntArray187[local140 + 1];
										local430 = local42[local296];
										local425 = local39[local296];
										local217 = this.anIntArray187[local140];
										for (local460 = local217; local460 < local224; local460++) {
											@Pc(550) int local550 = this.aShortArray45[local460] - 1;
											if (local550 == -1) {
												break;
											}
											if (local67[local550] != 0) {
												local59[local550] += local425;
												local63[local550] += local430;
												local55[local550] += local435;
												local67[local550] += local444;
											}
										}
										if (this.aClass380_4 == null && this.aClass380_1 != null) {
											this.aClass380_1.anInterface12_7 = null;
										}
										if (this.aClass380_4 != null) {
											this.aClass380_4.anInterface12_7 = null;
										}
										if (local8.aClass380_4 == null && local8.aClass380_1 != null) {
											local8.aClass380_1.anInterface12_7 = null;
										}
										if (local8.aClass380_4 != null) {
											local8.aClass380_4.anInterface12_7 = null;
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

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "()[Lclient!ih;")
	@Override
	public Class172[] method5310() {
		return this.aClass172Array2;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(SIIBI)I")
	private int method2825(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(20) int local20 = Static302.anIntArray299[Static103.method1711(arg3, arg1)];
		if (arg0 != -1) {
			@Pc(33) Class69 local33 = this.aClass144_Sub3_11.anInterface4_12.method8975(arg0 & 0xFFFF);
			@Pc(38) int local38 = local33.aByte22 & 0xFF;
			@Pc(54) int local54;
			@Pc(78) int local78;
			if (local38 != 0) {
				if (arg3 < 0) {
					local54 = 0;
				} else if (arg3 > 127) {
					local54 = 16777215;
				} else {
					local54 = arg3 * 131586;
				}
				if (local38 == 256) {
					local20 = local54;
				} else {
					local78 = 256 - local38;
					local20 = ((local20 & 0xFF00) * local78 + (local54 & 0xFF00) * local38 & 0xFF0000) + (local78 * (local20 & 0xFF00FF) + local38 * (local54 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local54 = local33.aByte20 & 0xFF;
			if (local54 != 0) {
				local54 += 256;
				@Pc(124) int local124 = (local20 >> 16 & 0xFF) * local54;
				if (local124 > 65535) {
					local124 = 65535;
				}
				local78 = (local20 >> 8 & 0xFF) * local54;
				if (local78 > 65535) {
					local78 = 65535;
				}
				@Pc(150) int local150 = (local20 & 0xFF) * local54;
				if (local150 > 65535) {
					local150 = 65535;
				}
				local20 = (local150 >> 8) + (local78 & 0xFF00) + (local124 << 8 & 0xFF0094);
			}
		}
		return (local20 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class159 arg2, @OriginalArg(3) Class159 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean228) {
			this.method2815();
		}
		@Pc(18) int local18 = this.aShort35 + arg4;
		@Pc(23) int local23 = arg4 + this.aShort33;
		@Pc(28) int local28 = arg6 + this.aShort38;
		@Pc(33) int local33 = this.aShort40 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9504 <= local23 + arg2.anInt9502 >> arg2.anInt9501 || local28 < 0 || arg2.anInt9506 <= arg2.anInt9502 + local33 >> arg2.anInt9501)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || local23 + arg3.anInt9502 >> arg3.anInt9501 >= arg3.anInt9504 || local28 < 0 || arg3.anInt9502 + local33 >> arg3.anInt9501 >= arg3.anInt9506) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9501;
			local23 = local23 + arg2.anInt9502 - 1 >> arg2.anInt9501;
			local28 >>= arg2.anInt9501;
			local33 = local33 + arg2.anInt9502 - 1 >> arg2.anInt9501;
			if (arg5 == arg2.method8207(local28, local18) && arg5 == arg2.method8207(local28, local23) && arg2.method8207(local33, local18) == arg5 && arg2.method8207(local33, local23) == arg5) {
				return;
			}
		}
		@Pc(247) int local247;
		if (arg0 == 1) {
			for (local247 = 0; local247 < this.anInt3140; local247++) {
				this.anIntArray190[local247] = this.anIntArray190[local247] + arg2.method8209(this.anIntArray189[local247] + arg4, arg6 + this.anIntArray191[local247]) - arg5;
			}
		} else {
			@Pc(255) int local255;
			@Pc(263) int local263;
			if (arg0 == 2) {
				@Pc(498) short local498 = this.aShort36;
				if (local498 == 0) {
					return;
				}
				for (local255 = 0; local255 < this.anInt3140; local255++) {
					local263 = (this.anIntArray190[local255] << 16) / local498;
					if (arg1 > local263) {
						this.anIntArray190[local255] -= -((arg1 - local263) * (arg2.method8209(this.anIntArray189[local255] - -arg4, this.anIntArray191[local255] + arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(271) int local271;
				if (arg0 == 3) {
					local247 = (arg1 & 0xFF) * 4;
					local255 = (arg1 >> 8 & 0xFF) * 4;
					local263 = (arg1 >> 16 & 0xFF) << 6;
					local271 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local247 >> 1) < 0 || arg2.anInt9504 << arg2.anInt9501 <= arg4 + (local247 >> 1) + arg2.anInt9502 || arg6 - (local255 >> 1) < 0 || arg2.anInt9502 + (local255 >> 1) + arg6 >= arg2.anInt9506 << arg2.anInt9501) {
						return;
					}
					this.method5290(arg6, arg5, local255, local247, local263, arg4, arg2, local271);
				} else if (arg0 == 4) {
					local247 = this.aShort34 - this.aShort36;
					for (local255 = 0; local255 < this.anInt3140; local255++) {
						this.anIntArray190[local255] -= arg5 - arg3.method8209(this.anIntArray189[local255] + arg4, this.anIntArray191[local255] - -arg6) - local247;
					}
				} else if (arg0 == 5) {
					local247 = this.aShort34 - this.aShort36;
					for (local255 = 0; local255 < this.anInt3140; local255++) {
						local263 = this.anIntArray189[local255] + arg4;
						local271 = this.anIntArray191[local255] + arg6;
						@Pc(448) int local448 = arg2.method8209(local263, local271);
						@Pc(454) int local454 = arg3.method8209(local263, local271);
						@Pc(462) int local462 = local448 - local454 - arg1;
						this.anIntArray190[local255] = local448 + (local462 * ((this.anIntArray190[local255] << 8) / local247) >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean228 = false;
		if (this.aClass380_2 != null) {
			this.aClass380_2.anInterface12_7 = null;
		}
	}
}
