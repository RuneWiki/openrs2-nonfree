import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class45_Sub1 extends Class45 {

	@OriginalMember(owner = "client!bm", name = "Ab", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "[Lclient!uda;")
	private Class364[] aClass364Array1;

	@OriginalMember(owner = "client!bm", name = "bc", descriptor = "[I")
	private int[] anIntArray85;

	@OriginalMember(owner = "client!bm", name = "ub", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!bm", name = "Fb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!bm", name = "tb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!bm", name = "ac", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!bm", name = "hb", descriptor = "S")
	private short aShort32;

	@OriginalMember(owner = "client!bm", name = "Sb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!bm", name = "eb", descriptor = "I")
	private int anInt952;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!bm", name = "xb", descriptor = "[F")
	private float[] aFloatArray6;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "S")
	private short aShort33;

	@OriginalMember(owner = "client!bm", name = "pb", descriptor = "[I")
	private int[] anIntArray86;

	@OriginalMember(owner = "client!bm", name = "cb", descriptor = "Lclient!pa;")
	private Class284 aClass284_1;

	@OriginalMember(owner = "client!bm", name = "Dc", descriptor = "[F")
	private float[] aFloatArray7;

	@OriginalMember(owner = "client!bm", name = "B", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!bm", name = "E", descriptor = "[Lclient!uc;")
	private Class363[] aClass363Array1;

	@OriginalMember(owner = "client!bm", name = "Tb", descriptor = "[Lclient!ei;")
	private Class98[] aClass98Array1;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!bm", name = "Vb", descriptor = "[I")
	private int[] anIntArray87;

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "S")
	private short aShort34;

	@OriginalMember(owner = "client!bm", name = "Mb", descriptor = "S")
	private short aShort35;

	@OriginalMember(owner = "client!bm", name = "Y", descriptor = "[Lclient!ns;")
	private Class265[] aClass265Array1;

	@OriginalMember(owner = "client!bm", name = "wb", descriptor = "S")
	private short aShort36;

	@OriginalMember(owner = "client!bm", name = "ec", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!bm", name = "Z", descriptor = "I")
	private int anInt971;

	@OriginalMember(owner = "client!bm", name = "gb", descriptor = "[S")
	private short[] aShortArray11;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "[S")
	private short[] aShortArray12;

	@OriginalMember(owner = "client!bm", name = "jb", descriptor = "B")
	private byte aByte46;

	@OriginalMember(owner = "client!bm", name = "Hb", descriptor = "[S")
	private short[] aShortArray13;

	@OriginalMember(owner = "client!bm", name = "zb", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!bm", name = "rb", descriptor = "[I")
	private int[] anIntArray89;

	@OriginalMember(owner = "client!bm", name = "Wb", descriptor = "S")
	private short aShort37;

	@OriginalMember(owner = "client!bm", name = "kc", descriptor = "Lclient!jv;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!bm", name = "ob", descriptor = "[S")
	private short[] aShortArray14;

	@OriginalMember(owner = "client!bm", name = "ab", descriptor = "[I")
	private int[] anIntArray90;

	@OriginalMember(owner = "client!bm", name = "Ob", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!bm", name = "Eb", descriptor = "Lclient!kw;")
	private Interface13 anInterface13_1;

	@OriginalMember(owner = "client!bm", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!bm", name = "cc", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	private int anInt940 = 0;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "I")
	private int anInt950 = 0;

	@OriginalMember(owner = "client!bm", name = "yb", descriptor = "Z")
	private boolean aBoolean119 = false;

	@OriginalMember(owner = "client!bm", name = "Cb", descriptor = "Z")
	private boolean aBoolean120 = false;

	@OriginalMember(owner = "client!bm", name = "A", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
	private int anInt992 = 0;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
	private int anInt994 = 0;

	@OriginalMember(owner = "client!bm", name = "nb", descriptor = "I")
	private int anInt993 = 0;

	@OriginalMember(owner = "client!bm", name = "Db", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_3;

	@OriginalMember(owner = "client!bm", name = "db", descriptor = "Lclient!ib;")
	private Class170 aClass170_1;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Lclient!ib;")
	private Class170 aClass170_3;

	@OriginalMember(owner = "client!bm", name = "Fc", descriptor = "Lclient!ib;")
	private Class170 aClass170_2;

	@OriginalMember(owner = "client!bm", name = "jc", descriptor = "Lclient!ib;")
	private Class170 aClass170_4;

	@OriginalMember(owner = "client!bm", name = "dc", descriptor = "Lclient!dk;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class45_Sub1(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aClass145_Sub3_3 = arg0;
		this.aClass170_1 = new Class170((Interface13) null, 5126, 3, 0);
		this.aClass170_3 = new Class170((Interface13) null, 5126, 2, 0);
		this.aClass170_2 = new Class170((Interface13) null, 5126, 3, 0);
		this.aClass170_4 = new Class170((Interface13) null, 5121, 4, 0);
		this.aClass84_1 = new Class84();
	}

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Lclient!uja;Lclient!ln;IIII)V")
	public Class45_Sub1(@OriginalArg(0) Class145_Sub3 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass145_Sub3_3 = arg0;
		this.anInt953 = arg2;
		this.anInt952 = arg5;
		if (Static368.method5276(arg5, arg2)) {
			this.aClass170_1 = new Class170((Interface13) null, 5126, 3, 0);
		}
		if (Static227.method3261(arg5, arg2)) {
			this.aClass170_3 = new Class170((Interface13) null, 5126, 2, 0);
		}
		if (Static596.method8184(arg2, arg5)) {
			this.aClass170_2 = new Class170((Interface13) null, 5126, 3, 0);
		}
		if (Static669.method9119(arg2, arg5)) {
			this.aClass170_4 = new Class170((Interface13) null, 5121, 4, 0);
		}
		if (Static12.method208(arg5, arg2)) {
			this.aClass84_1 = new Class84();
		}
		@Pc(116) Interface3 local116 = arg0.anInterface3_12;
		@Pc(120) int[] local120 = new int[arg1.anInt5934];
		this.anIntArray90 = new int[arg1.anInt5932 + 1];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt5934; local129++) {
			if (arg1.aByteArray79 == null || arg1.aByteArray79[local129] != 2) {
				if (arg1.aShortArray93 != null && arg1.aShortArray93[local129] != -1) {
					@Pc(169) Class8 local169 = local116.method2857(arg1.aShortArray93[local129] & 0xFFFF);
					if (((this.anInt952 & 0x40) == 0 || !local169.aBoolean32) && local169.aBoolean34) {
						continue;
					}
				}
				local120[this.anInt940++] = local129;
				this.anIntArray90[arg1.aShortArray102[local129]]++;
				this.anIntArray90[arg1.aShortArray95[local129]]++;
				this.anIntArray90[arg1.aShortArray98[local129]]++;
			}
		}
		this.anInt950 = this.anInt940;
		@Pc(249) long[] local249 = new long[this.anInt940];
		@Pc(264) boolean local264 = (this.anInt953 & 0x100) != 0;
		@Pc(278) int local278;
		@Pc(291) int local291;
		@Pc(492) int local492;
		for (@Pc(266) int local266 = 0; local266 < this.anInt940; local266++) {
			@Pc(274) int local274 = local120[local266];
			@Pc(276) Class8 local276 = null;
			local278 = 0;
			@Pc(280) byte local280 = 0;
			@Pc(282) byte local282 = 0;
			@Pc(284) byte local284 = 0;
			if (arg1.aClass390Array1 != null) {
				@Pc(289) boolean local289 = false;
				for (local291 = 0; local291 < arg1.aClass390Array1.length; local291++) {
					@Pc(298) Class390 local298 = arg1.aClass390Array1[local291];
					if (local298.anInt10646 == local274) {
						@Pc(311) Class28 local311 = Static200.method2824(local298.anInt10650);
						if (local311.aBoolean70) {
							local289 = true;
						}
						if (local311.anInt489 != -1) {
							@Pc(327) Class8 local327 = local116.method2857(local311.anInt489);
							if (local327.anInt186 == 2) {
								this.aBoolean120 = true;
							}
						}
					}
				}
				if (local289) {
					local249[local266] = Long.MAX_VALUE;
					this.anInt950--;
					continue;
				}
			}
			@Pc(368) short local368 = -1;
			if (arg1.aShortArray93 != null) {
				local368 = arg1.aShortArray93[local274];
				if (local368 != -1) {
					local276 = local116.method2857(local368 & 0xFFFF);
					if ((this.anInt952 & 0x40) != 0 && local276.aBoolean32) {
						local368 = -1;
						local276 = null;
					} else {
						local284 = local276.aByte11;
						if (local276.aByte16 != 0 || local276.aByte14 != 0) {
							this.aBoolean119 = true;
						}
						local282 = local276.aByte15;
					}
				}
			}
			@Pc(450) boolean local450 = arg1.aByteArray80 != null && arg1.aByteArray80[local274] != 0 || local276 != null && local276.anInt186 != 0;
			if ((local264 || local450) && arg1.aByteArray78 != null) {
				local278 += arg1.aByteArray78[local274] << 17;
			}
			if (local450) {
				local278 += 65536;
			}
			local278 += (local282 & 0xFF) << 8;
			local492 = local280 + ((local368 & 0xFFFF) << 16);
			local278 += local284 & 0xFF;
			@Pc(504) int local504 = local492 + (local266 & 0xFFFF);
			local249[local266] = ((long) local278 << 32) + (long) local504;
			this.aBoolean120 |= local450;
			this.aBoolean119 |= local276 != null && (local276.aByte16 != 0 || local276.aByte14 != 0);
		}
		Static595.method6984(-17667, local120, local249);
		this.anInt992 = arg1.anInt5932;
		this.anIntArray87 = arg1.anIntArray392;
		this.anInt993 = arg1.anInt5931;
		this.anIntArray89 = arg1.anIntArray396;
		this.anIntArray85 = arg1.anIntArray394;
		this.aShortArray8 = arg1.aShortArray99;
		this.aClass363Array1 = arg1.aClass363Array4;
		@Pc(593) Class305[] local593 = new Class305[this.anInt992];
		this.aClass364Array1 = arg1.aClass364Array4;
		@Pc(617) int local617;
		@Pc(633) int local633;
		@Pc(684) int local684;
		if (arg1.aClass390Array1 != null) {
			this.anInt971 = arg1.aClass390Array1.length;
			this.aClass98Array1 = new Class98[this.anInt971];
			this.aClass265Array1 = new Class265[this.anInt971];
			for (local617 = 0; local617 < this.anInt971; local617++) {
				@Pc(626) Class390 local626 = arg1.aClass390Array1[local617];
				@Pc(631) Class28 local631 = Static200.method2824(local626.anInt10650);
				local633 = -1;
				for (@Pc(635) int local635 = 0; local635 < this.anInt940; local635++) {
					if (local120[local635] == local626.anInt10646) {
						local633 = local635;
						break;
					}
				}
				if (local633 == -1) {
					throw new RuntimeException();
				}
				local684 = Static555.anIntArray633[arg1.aShortArray100[local626.anInt10646] & 0xFFFF] & 0xFFFFFF;
				@Pc(702) int local702 = local684 | 255 - (arg1.aByteArray80 == null ? 0 : arg1.aByteArray80[local626.anInt10646]) << 24;
				this.aClass265Array1[local617] = new Class265(local633, arg1.aShortArray102[local626.anInt10646], arg1.aShortArray95[local626.anInt10646], arg1.aShortArray98[local626.anInt10646], local631.anInt485, local631.anInt488, local631.anInt489, local631.anInt487, local631.anInt483, local631.aBoolean70, local631.aBoolean71, local626.anInt10643);
				this.aClass98Array1[local617] = new Class98(local702);
			}
		}
		local617 = this.anInt940 * 3;
		Static412.aLongArray14 = new long[local617];
		this.aShort35 = (short) arg4;
		if (arg1.aShortArray97 != null) {
			this.aShortArray10 = new short[this.anInt940];
		}
		this.aShortArray9 = new short[local617];
		this.aShortArray7 = new short[local617];
		this.aShortArray4 = new short[this.anInt940];
		this.aShortArray14 = new short[this.anInt940];
		this.aFloatArray6 = new float[local617];
		this.aShort36 = (short) arg3;
		this.aByteArray6 = new byte[this.anInt940];
		this.aShortArray5 = new short[this.anInt940];
		this.aFloatArray7 = new float[local617];
		this.aShortArray13 = new short[local617];
		this.aByteArray7 = new byte[local617];
		this.aShortArray11 = new short[this.anInt940];
		this.aShortArray12 = new short[local617];
		this.aShortArray6 = new short[this.anInt940];
		local278 = 0;
		for (local492 = 0; local492 < arg1.anInt5932; local492++) {
			local633 = this.anIntArray90[local492];
			this.anIntArray90[local492] = local278;
			local593[local492] = new Class305();
			local278 += local633;
		}
		this.anIntArray90[arg1.anInt5932] = local278;
		@Pc(896) Class369 local896 = Static348.method4823(this.anInt940, local120, arg1);
		@Pc(900) Class13[] local900 = new Class13[arg1.anInt5934];
		@Pc(942) int local942;
		@Pc(953) int local953;
		@Pc(975) int local975;
		@Pc(986) int local986;
		@Pc(995) int local995;
		@Pc(1004) int local1004;
		@Pc(921) short local921;
		@Pc(932) int local932;
		for (local684 = 0; local684 < arg1.anInt5934; local684++) {
			@Pc(911) short local911 = arg1.aShortArray102[local684];
			@Pc(916) short local916 = arg1.aShortArray95[local684];
			local921 = arg1.aShortArray98[local684];
			local932 = this.anIntArray85[local916] - this.anIntArray85[local911];
			local942 = this.anIntArray87[local916] - this.anIntArray87[local911];
			local953 = this.anIntArray89[local916] - this.anIntArray89[local911];
			@Pc(964) int local964 = this.anIntArray85[local921] - this.anIntArray85[local911];
			local975 = this.anIntArray87[local921] - this.anIntArray87[local911];
			local986 = this.anIntArray89[local921] - this.anIntArray89[local911];
			local995 = local942 * local986 - local975 * local953;
			local1004 = local953 * local964 - local986 * local932;
			@Pc(1013) int local1013 = local932 * local975 - local942 * local964;
			while (local995 > 8192 || local1004 > 8192 || local1013 > 8192 || local995 < -8192 || local1004 < -8192 || local1013 < -8192) {
				local1013 >>= 0x1;
				local995 >>= 0x1;
				local1004 >>= 0x1;
			}
			@Pc(1066) int local1066 = (int) Math.sqrt((double) (local1013 * local1013 + local995 * local995 + local1004 * local1004));
			if (local1066 <= 0) {
				local1066 = 1;
			}
			local995 = local995 * 256 / local1066;
			local1004 = local1004 * 256 / local1066;
			local1013 = local1013 * 256 / local1066;
			@Pc(1099) byte local1099 = arg1.aByteArray79 == null ? 0 : arg1.aByteArray79[local684];
			if (local1099 == 0) {
				@Pc(1105) Class305 local1105 = local593[local911];
				local1105.anInt8047 += local1004;
				local1105.anInt8049 += local1013;
				local1105.anInt8048++;
				local1105.anInt8045 += local995;
				@Pc(1133) Class305 local1133 = local593[local916];
				local1133.anInt8047 += local1004;
				local1133.anInt8045 += local995;
				local1133.anInt8048++;
				local1133.anInt8049 += local1013;
				@Pc(1161) Class305 local1161 = local593[local921];
				local1161.anInt8048++;
				local1161.anInt8045 += local995;
				local1161.anInt8047 += local1004;
				local1161.anInt8049 += local1013;
			} else if (local1099 == 1) {
				@Pc(1200) Class13 local1200 = local900[local684] = new Class13();
				local1200.anInt238 = local1013;
				local1200.anInt237 = local995;
				local1200.anInt236 = local1004;
			}
		}
		@Pc(1224) int local1224;
		@Pc(1268) short local1268;
		for (local291 = 0; local291 < this.anInt940; local291++) {
			local1224 = local120[local291];
			@Pc(1231) int local1231 = arg1.aShortArray100[local1224] & 0xFFFF;
			if (arg1.aByteArray77 == null) {
				local932 = -1;
			} else {
				local932 = arg1.aByteArray77[local1224];
			}
			if (arg1.aByteArray80 == null) {
				local942 = 0;
			} else {
				local942 = arg1.aByteArray80[local1224] & 0xFF;
			}
			local1268 = arg1.aShortArray93 == null ? -1 : arg1.aShortArray93[local1224];
			if (local1268 != -1 && (this.anInt952 & 0x40) != 0) {
				@Pc(1285) Class8 local1285 = local116.method2857(local1268 & 0xFFFF);
				if (local1285.aBoolean32) {
					local1268 = -1;
				}
			}
			@Pc(1292) float local1292 = 0.0F;
			@Pc(1294) float local1294 = 0.0F;
			@Pc(1296) float local1296 = 0.0F;
			@Pc(1298) float local1298 = 0.0F;
			@Pc(1300) float local1300 = 0.0F;
			@Pc(1302) float local1302 = 0.0F;
			@Pc(1304) byte local1304 = 0;
			@Pc(1306) byte local1306 = 0;
			@Pc(1308) int local1308 = 0;
			@Pc(1326) byte local1326;
			@Pc(1343) short local1343;
			@Pc(2162) short local2162;
			@Pc(2167) short local2167;
			if (local1268 != -1) {
				if (local932 == -1) {
					local1294 = 1.0F;
					local1292 = 0.0F;
					local1306 = 2;
					local1300 = 0.0F;
					local1296 = 1.0F;
					local1298 = 1.0F;
					local1302 = 0.0F;
					local1304 = 1;
				} else {
					local932 &= 0xFF;
					local1326 = arg1.aByteArray82[local932];
					@Pc(1333) short local1333;
					@Pc(1338) short local1338;
					@Pc(1376) float local1376;
					@Pc(1387) float local1387;
					@Pc(1481) float local1481;
					@Pc(1953) float local1953;
					@Pc(1961) float local1961;
					@Pc(1969) float local1969;
					@Pc(1992) float local1992;
					@Pc(2015) float local2015;
					@Pc(2038) float local2038;
					if (local1326 == 0) {
						local1333 = arg1.aShortArray102[local1224];
						local1338 = arg1.aShortArray95[local1224];
						local1343 = arg1.aShortArray98[local1224];
						local2162 = arg1.aShortArray94[local932];
						local2167 = arg1.aShortArray96[local932];
						@Pc(2172) short local2172 = arg1.aShortArray101[local932];
						@Pc(2178) float local2178 = (float) arg1.anIntArray394[local2162];
						@Pc(2184) float local2184 = (float) arg1.anIntArray392[local2162];
						local1376 = (float) arg1.anIntArray396[local2162];
						local1387 = (float) arg1.anIntArray394[local2167] - local2178;
						local1481 = (float) arg1.anIntArray392[local2167] - local2184;
						@Pc(2214) float local2214 = (float) arg1.anIntArray396[local2167] - local1376;
						@Pc(2223) float local2223 = (float) arg1.anIntArray394[local2172] - local2178;
						@Pc(2231) float local2231 = (float) arg1.anIntArray392[local2172] - local2184;
						@Pc(2240) float local2240 = (float) arg1.anIntArray396[local2172] - local1376;
						@Pc(2249) float local2249 = (float) arg1.anIntArray394[local1333] - local2178;
						@Pc(2257) float local2257 = (float) arg1.anIntArray392[local1333] - local2184;
						@Pc(2266) float local2266 = (float) arg1.anIntArray396[local1333] - local1376;
						@Pc(2274) float local2274 = (float) arg1.anIntArray394[local1338] - local2178;
						@Pc(2282) float local2282 = (float) arg1.anIntArray392[local1338] - local2184;
						local1953 = (float) arg1.anIntArray396[local1338] - local1376;
						local1961 = (float) arg1.anIntArray394[local1343] - local2178;
						local1969 = (float) arg1.anIntArray392[local1343] - local2184;
						local1992 = (float) arg1.anIntArray396[local1343] - local1376;
						local2015 = local2240 * local1481 - local2214 * local2231;
						local2038 = local2223 * local2214 - local1387 * local2240;
						@Pc(2343) float local2343 = local2231 * local1387 - local1481 * local2223;
						@Pc(2351) float local2351 = local2343 * local2231 - local2240 * local2038;
						@Pc(2359) float local2359 = local2240 * local2015 - local2223 * local2343;
						@Pc(2368) float local2368 = local2038 * local2223 - local2231 * local2015;
						@Pc(2382) float local2382 = 1.0F / (local2368 * local2214 + local2351 * local1387 + local2359 * local1481);
						local1296 = (local2351 * local2274 + local2282 * local2359 + local1953 * local2368) * local2382;
						local1300 = local2382 * (local2368 * local1992 + local2351 * local1961 + local2359 * local1969);
						local1292 = (local2368 * local2266 + local2359 * local2257 + local2249 * local2351) * local2382;
						@Pc(2433) float local2433 = local1481 * local2343 - local2038 * local2214;
						@Pc(2441) float local2441 = local2015 * local2214 - local1387 * local2343;
						@Pc(2450) float local2450 = local2038 * local1387 - local2015 * local1481;
						@Pc(2464) float local2464 = 1.0F / (local2240 * local2450 + local2223 * local2433 + local2441 * local2231);
						local1298 = local2464 * (local2441 * local2282 + local2274 * local2433 + local2450 * local1953);
						local1302 = (local2433 * local1961 + local1969 * local2441 + local2450 * local1992) * local2464;
						local1294 = (local2441 * local2257 + local2249 * local2433 + local2266 * local2450) * local2464;
					} else {
						local1333 = arg1.aShortArray102[local1224];
						local1338 = arg1.aShortArray95[local1224];
						local1343 = arg1.aShortArray98[local1224];
						@Pc(1348) int local1348 = local896.anIntArray711[local932];
						@Pc(1353) int local1353 = local896.anIntArray713[local932];
						@Pc(1358) int local1358 = local896.anIntArray712[local932];
						@Pc(1363) float[] local1363 = local896.aFloatArrayArray20[local932];
						@Pc(1368) byte local1368 = arg1.aByteArray83[local932];
						local1376 = (float) arg1.anIntArray400[local932] / 256.0F;
						if (local1326 == 1) {
							local1387 = (float) arg1.anIntArray398[local932] / 1024.0F;
							Static206.method2902(local1376, local1387, local1348, arg1.anIntArray392[local1333], local1358, local1368, Static117.aFloatArray17, local1363, local1353, arg1.anIntArray394[local1333], arg1.anIntArray396[local1333]);
							local1294 = Static117.aFloatArray17[1];
							local1292 = Static117.aFloatArray17[0];
							Static206.method2902(local1376, local1387, local1348, arg1.anIntArray392[local1338], local1358, local1368, Static117.aFloatArray17, local1363, local1353, arg1.anIntArray394[local1338], arg1.anIntArray396[local1338]);
							local1296 = Static117.aFloatArray17[0];
							local1298 = Static117.aFloatArray17[1];
							Static206.method2902(local1376, local1387, local1348, arg1.anIntArray392[local1343], local1358, local1368, Static117.aFloatArray17, local1363, local1353, arg1.anIntArray394[local1343], arg1.anIntArray396[local1343]);
							local1300 = Static117.aFloatArray17[0];
							local1302 = Static117.aFloatArray17[1];
							local1481 = local1387 / 2.0F;
							if ((local1368 & 0x1) == 0) {
								if (local1300 - local1292 > local1481) {
									local1300 -= local1387;
									local1306 = 1;
								} else if (local1292 - local1300 > local1481) {
									local1300 += local1387;
									local1306 = 2;
								}
								if (local1296 - local1292 > local1481) {
									local1304 = 1;
									local1296 -= local1387;
								} else if (local1481 < local1292 - local1296) {
									local1296 += local1387;
									local1304 = 2;
								}
							} else {
								if (local1481 < local1298 - local1294) {
									local1298 -= local1387;
									local1304 = 1;
								} else if (local1294 - local1298 > local1481) {
									local1304 = 2;
									local1298 += local1387;
								}
								if (local1481 < local1302 - local1294) {
									local1302 -= local1387;
									local1306 = 1;
								} else if (local1481 < local1294 - local1302) {
									local1302 += local1387;
									local1306 = 2;
								}
							}
						} else if (local1326 == 2) {
							local1387 = (float) arg1.anIntArray401[local932] / 256.0F;
							local1481 = (float) arg1.anIntArray393[local932] / 256.0F;
							@Pc(1866) int local1866 = arg1.anIntArray394[local1338] - arg1.anIntArray394[local1333];
							@Pc(1876) int local1876 = arg1.anIntArray392[local1338] - arg1.anIntArray392[local1333];
							@Pc(1887) int local1887 = arg1.anIntArray396[local1338] - arg1.anIntArray396[local1333];
							@Pc(1898) int local1898 = arg1.anIntArray394[local1343] - arg1.anIntArray394[local1333];
							@Pc(1909) int local1909 = arg1.anIntArray392[local1343] - arg1.anIntArray392[local1333];
							@Pc(1920) int local1920 = arg1.anIntArray396[local1343] - arg1.anIntArray396[local1333];
							@Pc(1928) int local1928 = local1920 * local1876 - local1909 * local1887;
							@Pc(1937) int local1937 = local1887 * local1898 - local1920 * local1866;
							@Pc(1945) int local1945 = local1909 * local1866 - local1898 * local1876;
							local1953 = 64.0F / (float) arg1.anIntArray399[local932];
							local1961 = 64.0F / (float) arg1.anIntArray402[local932];
							local1969 = 64.0F / (float) arg1.anIntArray398[local932];
							local1992 = ((float) local1945 * local1363[2] + local1363[0] * (float) local1928 + (float) local1937 * local1363[1]) / local1953;
							local2015 = ((float) local1937 * local1363[4] + (float) local1928 * local1363[3] + (float) local1945 * local1363[5]) / local1961;
							local2038 = ((float) local1945 * local1363[8] + (float) local1928 * local1363[6] + (float) local1937 * local1363[7]) / local1969;
							local1308 = Static237.method9874(local2015, local1992, local2038);
							Static536.method7525(local1358, local1363, local1348, local1387, arg1.anIntArray394[local1333], local1368, local1481, local1353, Static117.aFloatArray17, local1376, arg1.anIntArray392[local1333], arg1.anIntArray396[local1333], local1308);
							local1292 = Static117.aFloatArray17[0];
							local1294 = Static117.aFloatArray17[1];
							Static536.method7525(local1358, local1363, local1348, local1387, arg1.anIntArray394[local1338], local1368, local1481, local1353, Static117.aFloatArray17, local1376, arg1.anIntArray392[local1338], arg1.anIntArray396[local1338], local1308);
							local1296 = Static117.aFloatArray17[0];
							local1298 = Static117.aFloatArray17[1];
							Static536.method7525(local1358, local1363, local1348, local1387, arg1.anIntArray394[local1343], local1368, local1481, local1353, Static117.aFloatArray17, local1376, arg1.anIntArray392[local1343], arg1.anIntArray396[local1343], local1308);
							local1300 = Static117.aFloatArray17[0];
							local1302 = Static117.aFloatArray17[1];
						} else if (local1326 == 3) {
							Static670.method9140(arg1.anIntArray392[local1333], local1358, arg1.anIntArray396[local1333], local1376, local1348, local1353, local1368, arg1.anIntArray394[local1333], local1363, Static117.aFloatArray17);
							local1292 = Static117.aFloatArray17[0];
							local1294 = Static117.aFloatArray17[1];
							Static670.method9140(arg1.anIntArray392[local1338], local1358, arg1.anIntArray396[local1338], local1376, local1348, local1353, local1368, arg1.anIntArray394[local1338], local1363, Static117.aFloatArray17);
							local1298 = Static117.aFloatArray17[1];
							local1296 = Static117.aFloatArray17[0];
							Static670.method9140(arg1.anIntArray392[local1343], local1358, arg1.anIntArray396[local1343], local1376, local1348, local1353, local1368, arg1.anIntArray394[local1343], local1363, Static117.aFloatArray17);
							local1300 = Static117.aFloatArray17[0];
							local1302 = Static117.aFloatArray17[1];
							if ((local1368 & 0x1) == 0) {
								if (local1300 - local1292 > 0.5F) {
									local1306 = 1;
									local1300--;
								} else if (local1292 - local1300 > 0.5F) {
									local1306 = 2;
									local1300++;
								}
								if (local1296 - local1292 > 0.5F) {
									local1296--;
									local1304 = 1;
								} else if (local1292 - local1296 > 0.5F) {
									local1304 = 2;
									local1296++;
								}
							} else {
								if (local1302 - local1294 > 0.5F) {
									local1306 = 1;
									local1302--;
								} else if (local1294 - local1302 > 0.5F) {
									local1306 = 2;
									local1302++;
								}
								if (local1298 - local1294 > 0.5F) {
									local1304 = 1;
									local1298--;
								} else if (local1294 - local1298 > 0.5F) {
									local1304 = 2;
									local1298++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray79 == null) {
				local1326 = 0;
			} else {
				local1326 = arg1.aByteArray79[local1224];
			}
			if (local1326 == 0) {
				@Pc(2561) long local2561 = ((long) local942 + (long) (local1231 << 8) + (long) (local1308 << 24) << 32) + (long) (local932 << 2);
				local1343 = arg1.aShortArray102[local1224];
				local2162 = arg1.aShortArray95[local1224];
				local2167 = arg1.aShortArray98[local1224];
				@Pc(2580) Class305 local2580 = local593[local1343];
				this.aShortArray14[local291] = this.method893(local1292, local2580.anInt8049, local2580.anInt8045, arg1, local2580.anInt8047, local2580.anInt8048, local1343, local1294, local2561);
				@Pc(2604) Class305 local2604 = local593[local2162];
				this.aShortArray4[local291] = this.method893(local1296, local2604.anInt8049, local2604.anInt8045, arg1, local2604.anInt8047, local2604.anInt8048, local2162, local1298, local2561 + (long) local1304);
				@Pc(2631) Class305 local2631 = local593[local2167];
				this.aShortArray6[local291] = this.method893(local1300, local2631.anInt8049, local2631.anInt8045, arg1, local2631.anInt8047, local2631.anInt8048, local2167, local1302, local2561 + (long) local1306);
			} else if (local1326 == 1) {
				@Pc(2665) Class13 local2665 = local900[local1224];
				@Pc(2712) long local2712 = (long) ((local2665.anInt238 + 256 << 22) + (local2665.anInt236 + 256 << 12) + (local2665.anInt237 > 0 ? 1024 : 2048) + (local932 << 2)) + ((long) local942 + (long) (local1308 << 24) + (long) (local1231 << 8) << 32);
				this.aShortArray14[local291] = this.method893(local1292, local2665.anInt238, local2665.anInt237, arg1, local2665.anInt236, 0, arg1.aShortArray102[local1224], local1294, local2712);
				this.aShortArray4[local291] = this.method893(local1296, local2665.anInt238, local2665.anInt237, arg1, local2665.anInt236, 0, arg1.aShortArray95[local1224], local1298, local2712 + (long) local1304);
				this.aShortArray6[local291] = this.method893(local1300, local2665.anInt238, local2665.anInt237, arg1, local2665.anInt236, 0, arg1.aShortArray98[local1224], local1302, local2712 + (long) local1306);
			}
			if (arg1.aByteArray80 != null) {
				this.aByteArray6[local291] = arg1.aByteArray80[local1224];
			}
			if (arg1.aShortArray97 != null) {
				this.aShortArray10[local291] = arg1.aShortArray97[local1224];
			}
			this.aShortArray11[local291] = arg1.aShortArray100[local1224];
			this.aShortArray5[local291] = local1268;
		}
		local1224 = 0;
		local921 = -10000;
		for (local932 = 0; local932 < this.anInt950; local932++) {
			@Pc(2843) short local2843 = this.aShortArray5[local932];
			if (local2843 != local921) {
				local921 = local2843;
				local1224++;
			}
		}
		this.anIntArray86 = new int[local1224 + 1];
		local1224 = 0;
		local921 = -10000;
		for (local942 = 0; local942 < this.anInt950; local942++) {
			local1268 = this.aShortArray5[local942];
			if (local1268 != local921) {
				local921 = local1268;
				this.anIntArray86[local1224++] = local942;
			}
		}
		this.anIntArray86[local1224] = this.anInt950;
		Static412.aLongArray14 = null;
		this.aShortArray12 = Static199.method2818(this.anInt994, this.aShortArray12);
		this.aShortArray13 = Static199.method2818(this.anInt994, this.aShortArray13);
		this.aShortArray7 = Static199.method2818(this.anInt994, this.aShortArray7);
		this.aByteArray7 = Static715.method9512(this.anInt994, this.aByteArray7);
		this.aFloatArray7 = Static15.method236(this.aFloatArray7, this.anInt994);
		this.aFloatArray6 = Static15.method236(this.aFloatArray6, this.anInt994);
		if (arg1.anIntArray397 != null && Static515.method7311(this.anInt952, arg2)) {
			this.anIntArrayArray4 = arg1.method5320(false, -118);
		}
		if (arg1.aClass390Array1 != null && Static246.method3452(this.anInt952, arg2)) {
			this.anIntArrayArray5 = arg1.method5306();
		}
		if (arg1.anIntArray395 != null && Static508.method7187(arg2, this.anInt952)) {
			local953 = 0;
			@Pc(3010) int[] local3010 = new int[256];
			for (local975 = 0; local975 < this.anInt940; local975++) {
				local986 = arg1.anIntArray395[local120[local975]];
				if (local986 >= 0) {
					@Pc(3030) int local3030 = local3010[local986]++;
					if (local953 < local986) {
						local953 = local986;
					}
				}
			}
			this.anIntArrayArray3 = new int[local953 + 1][];
			for (local986 = 0; local986 <= local953; local986++) {
				this.anIntArrayArray3[local986] = new int[local3010[local986]];
				local3010[local986] = 0;
			}
			for (local995 = 0; local995 < this.anInt940; local995++) {
				local1004 = arg1.anIntArray395[local120[local995]];
				if (local1004 >= 0) {
					this.anIntArrayArray3[local1004][local3010[local1004]++] = local995;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!gw;IZ)V")
	@Override
	public void method5756(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray8 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt992; local15++) {
			if ((this.aShortArray8[local15] & arg1) != 0) {
				if (arg2) {
					arg0.method7031(this.anIntArray85[local15], this.anIntArray87[local15], this.anIntArray89[local15], local13);
				} else {
					arg0.method7028(this.anIntArray85[local15], this.anIntArray87[local15], this.anIntArray89[local15], local13);
				}
				this.anIntArray85[local15] = local13[0];
				this.anIntArray87[local15] = local13[1];
				this.anIntArray89[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZBIS)I")
	private int method892(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3) {
		@Pc(12) int local12 = Static555.anIntArray633[Static76.method1180(arg0, arg2)];
		if (arg3 != -1) {
			@Pc(32) Class8 local32 = this.aClass145_Sub3_3.anInterface3_12.method2857(arg3 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte13 & 0xFF;
			@Pc(45) int local45;
			@Pc(76) int local76;
			if (local37 != 0) {
				if (arg2 < 0) {
					local45 = 0;
				} else if (arg2 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg2 * 131586;
				}
				if (local37 == 256) {
					local12 = local45;
				} else {
					local76 = 256 - local37;
					local12 = ((local12 & 0xFF00) * local76 + (local45 & 0xFF00) * local37 & 0xFF0000) + ((local45 & 0xFF00FF) * local37 + ((local12 & 0xFF00FF) * local76) & 0xFF00FF00) >> 8;
				}
			}
			local45 = local32.aByte12 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(123) int local123 = local45 * (local12 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local76 = (local12 >> 8 & 0xFF) * local45;
				if (local76 > 65535) {
					local76 = 65535;
				}
				@Pc(149) int local149 = local45 * (local12 & 0xFF);
				if (local149 > 65535) {
					local149 = 65535;
				}
				local12 = (local76 & 0xFF00) + (local123 << 8 & 0xFF0075) + (local149 >> 8);
			}
		}
		return (local12 << 8) - ((arg1 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(FIIILclient!ln;IIIFJ)S")
	private short method893(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class229 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray90[arg6];
		@Pc(17) int local17 = this.anIntArray90[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray9[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (Static412.aLongArray14[local21] == arg8) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray9[local19] = (short) (this.anInt994 + 1);
		Static412.aLongArray14[local19] = arg8;
		this.aShortArray12[this.anInt994] = (short) arg2;
		this.aShortArray13[this.anInt994] = (short) arg4;
		this.aShortArray7[this.anInt994] = (short) arg1;
		this.aByteArray7[this.anInt994] = (byte) arg5;
		this.aFloatArray7[this.anInt994] = arg0;
		this.aFloatArray6[this.anInt994] = arg7;
		return (short) this.anInt994++;
	}

	@OriginalMember(owner = "client!bm", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt940; local7++) {
			if (arg0 == this.aShortArray11[local7]) {
				this.aShortArray11[local7] = arg1;
			}
		}
		if (this.aClass265Array1 != null) {
			for (@Pc(46) int local46 = 0; local46 < this.anInt971; local46++) {
				@Pc(53) Class265 local53 = this.aClass265Array1[local46];
				@Pc(58) Class98 local58 = this.aClass98Array1[local46];
				local58.anInt2460 = local58.anInt2460 & 0xFF000000 | Static555.anIntArray633[this.aShortArray11[local53.anInt7118] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B[B)V")
	@Override
	public void method5762(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(9) int local9;
		if (arg1 == null) {
			for (local9 = 0; local9 < this.anInt940; local9++) {
				this.aByteArray6[local9] = arg0;
			}
		} else {
			for (local9 = 0; local9 < this.anInt940; local9++) {
				@Pc(54) int local54 = 255 - (255 - (arg0 & 0xFF)) * (-(arg1[local9] & 0xFF) + 255) / 255;
				this.aByteArray6[local9] = (byte) local54;
			}
		}
		if (this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt992; local3++) {
			if (arg0 != 0) {
				this.anIntArray85[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray87[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray89[local3] += arg2;
			}
		}
		this.aBoolean121 = false;
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZILclient!bm;ZLclient!bm;I)Lclient!ka;")
	private Class45 method895(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class45_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class45_Sub1 arg3, @OriginalArg(5) int arg4) {
		arg1.anInt971 = this.anInt971;
		if ((arg4 & 0x100) == 0) {
			arg1.aBoolean120 = this.aBoolean120;
		} else {
			arg1.aBoolean120 = true;
		}
		arg1.anInt994 = this.anInt994;
		arg1.anInt993 = this.anInt993;
		arg1.anInt950 = this.anInt950;
		arg1.aBoolean119 = this.aBoolean119;
		arg1.aShort35 = this.aShort35;
		arg1.anInt952 = this.anInt952;
		arg1.anInt953 = arg4;
		arg1.aByte46 = 0;
		arg1.anInt992 = this.anInt992;
		arg1.aShort36 = this.aShort36;
		arg1.anInt940 = this.anInt940;
		@Pc(74) boolean local74 = Static619.method8404(arg4, this.anInt952);
		@Pc(80) boolean local80 = Static562.method7824(arg4, this.anInt952);
		@Pc(86) boolean local86 = Static406.method6007(this.anInt952, arg4);
		@Pc(92) boolean local92 = local80 | local74 | local86;
		@Pc(225) int local225;
		if (local92) {
			if (!local74) {
				arg1.anIntArray85 = this.anIntArray85;
			} else if (arg3.anIntArray85 == null || this.anInt993 > arg3.anIntArray85.length) {
				arg1.anIntArray85 = arg3.anIntArray85 = new int[this.anInt993];
			} else {
				arg1.anIntArray85 = arg3.anIntArray85;
			}
			if (!local80) {
				arg1.anIntArray87 = this.anIntArray87;
			} else if (arg3.anIntArray87 == null || this.anInt993 > arg3.anIntArray87.length) {
				arg1.anIntArray87 = arg3.anIntArray87 = new int[this.anInt993];
			} else {
				arg1.anIntArray87 = arg3.anIntArray87;
			}
			if (!local86) {
				arg1.anIntArray89 = this.anIntArray89;
			} else if (arg3.anIntArray89 == null || this.anInt993 > arg3.anIntArray89.length) {
				arg1.anIntArray89 = arg3.anIntArray89 = new int[this.anInt993];
			} else {
				arg1.anIntArray89 = arg3.anIntArray89;
			}
			for (local225 = 0; local225 < this.anInt993; local225++) {
				if (local74) {
					arg1.anIntArray85[local225] = this.anIntArray85[local225];
				}
				if (local80) {
					arg1.anIntArray87[local225] = this.anIntArray87[local225];
				}
				if (local86) {
					arg1.anIntArray89[local225] = this.anIntArray89[local225];
				}
			}
		} else {
			arg1.anIntArray85 = this.anIntArray85;
			arg1.anIntArray89 = this.anIntArray89;
			arg1.anIntArray87 = this.anIntArray87;
		}
		if (Static409.method6022(arg4, this.anInt952)) {
			arg1.aClass170_1 = arg3.aClass170_1;
			if (arg2) {
				arg1.aByte46 = (byte) (arg1.aByte46 | 0x1);
			}
			arg1.aClass170_1.aByte70 = this.aClass170_1.aByte70;
			arg1.aClass170_1.anInterface13_4 = this.aClass170_1.anInterface13_4;
		} else if (Static368.method5276(this.anInt952, arg4)) {
			arg1.aClass170_1 = this.aClass170_1;
		} else {
			arg1.aClass170_1 = null;
		}
		if (Static180.method5443(arg4, this.anInt952)) {
			if (arg3.aShortArray11 == null || this.anInt940 > arg3.aShortArray11.length) {
				arg1.aShortArray11 = arg3.aShortArray11 = new short[this.anInt940];
			} else {
				arg1.aShortArray11 = arg3.aShortArray11;
			}
			for (local225 = 0; local225 < this.anInt940; local225++) {
				arg1.aShortArray11[local225] = this.aShortArray11[local225];
			}
		} else {
			arg1.aShortArray11 = this.aShortArray11;
		}
		if (Static401.method5914(this.anInt952, arg4)) {
			if (arg3.aByteArray6 == null || this.anInt940 > arg3.aByteArray6.length) {
				arg1.aByteArray6 = arg3.aByteArray6 = new byte[this.anInt940];
			} else {
				arg1.aByteArray6 = arg3.aByteArray6;
			}
			for (local225 = 0; local225 < this.anInt940; local225++) {
				arg1.aByteArray6[local225] = this.aByteArray6[local225];
			}
		} else {
			arg1.aByteArray6 = this.aByteArray6;
		}
		if (Static400.method5898(arg4, this.anInt952)) {
			arg1.aClass170_4 = arg3.aClass170_4;
			if (arg2) {
				arg1.aByte46 = (byte) (arg1.aByte46 | 0x2);
			}
			arg1.aClass170_4.anInterface13_4 = this.aClass170_4.anInterface13_4;
			arg1.aClass170_4.aByte70 = this.aClass170_4.aByte70;
		} else if (Static669.method9119(arg4, this.anInt952)) {
			arg1.aClass170_4 = this.aClass170_4;
		} else {
			arg1.aClass170_4 = null;
		}
		@Pc(683) int local683;
		if (Static671.method9143(arg4, this.anInt952)) {
			if (arg3.aShortArray12 == null || arg3.aShortArray12.length < this.anInt994) {
				local225 = this.anInt994;
				arg1.aShortArray13 = arg3.aShortArray13 = new short[local225];
				arg1.aShortArray7 = arg3.aShortArray7 = new short[local225];
				arg1.aShortArray12 = arg3.aShortArray12 = new short[local225];
			} else {
				arg1.aShortArray7 = arg3.aShortArray7;
				arg1.aShortArray13 = arg3.aShortArray13;
				arg1.aShortArray12 = arg3.aShortArray12;
			}
			if (this.aClass284_1 == null) {
				for (local225 = 0; local225 < this.anInt994; local225++) {
					arg1.aShortArray12[local225] = this.aShortArray12[local225];
					arg1.aShortArray13[local225] = this.aShortArray13[local225];
					arg1.aShortArray7[local225] = this.aShortArray7[local225];
				}
			} else {
				if (arg3.aClass284_1 == null) {
					arg3.aClass284_1 = new Class284();
				}
				@Pc(669) Class284 local669 = arg1.aClass284_1 = arg3.aClass284_1;
				if (local669.aShortArray126 == null || local669.aShortArray126.length < this.anInt994) {
					local683 = this.anInt994;
					local669.aShortArray126 = new short[local683];
					local669.aShortArray127 = new short[local683];
					local669.aByteArray97 = new byte[local683];
					local669.aShortArray125 = new short[local683];
				}
				for (local683 = 0; local683 < this.anInt994; local683++) {
					arg1.aShortArray12[local683] = this.aShortArray12[local683];
					arg1.aShortArray13[local683] = this.aShortArray13[local683];
					arg1.aShortArray7[local683] = this.aShortArray7[local683];
					local669.aShortArray126[local683] = this.aClass284_1.aShortArray126[local683];
					local669.aShortArray127[local683] = this.aClass284_1.aShortArray127[local683];
					local669.aShortArray125[local683] = this.aClass284_1.aShortArray125[local683];
					local669.aByteArray97[local683] = this.aClass284_1.aByteArray97[local683];
				}
			}
			arg1.aByteArray7 = this.aByteArray7;
		} else {
			arg1.aShortArray13 = this.aShortArray13;
			arg1.aClass284_1 = this.aClass284_1;
			arg1.aByteArray7 = this.aByteArray7;
			arg1.aShortArray7 = this.aShortArray7;
			arg1.aShortArray12 = this.aShortArray12;
		}
		if (Static574.method7979(-110, arg4, this.anInt952)) {
			arg1.aClass170_2 = arg3.aClass170_2;
			if (arg2) {
				arg1.aByte46 = (byte) (arg1.aByte46 | 0x4);
			}
			arg1.aClass170_2.anInterface13_4 = this.aClass170_2.anInterface13_4;
			arg1.aClass170_2.aByte70 = this.aClass170_2.aByte70;
		} else if (Static596.method8184(arg4, this.anInt952)) {
			arg1.aClass170_2 = this.aClass170_2;
		} else {
			arg1.aClass170_2 = null;
		}
		if (Static536.method7522(this.anInt952, arg4)) {
			if (arg3.aFloatArray7 == null || this.anInt940 > arg3.aFloatArray7.length) {
				local225 = this.anInt994;
				arg1.aFloatArray6 = arg3.aFloatArray6 = new float[local225];
				arg1.aFloatArray7 = arg3.aFloatArray7 = new float[local225];
			} else {
				arg1.aFloatArray7 = arg3.aFloatArray7;
				arg1.aFloatArray6 = arg3.aFloatArray6;
			}
			for (local225 = 0; local225 < this.anInt994; local225++) {
				arg1.aFloatArray7[local225] = this.aFloatArray7[local225];
				arg1.aFloatArray6[local225] = this.aFloatArray6[local225];
			}
		} else {
			arg1.aFloatArray7 = this.aFloatArray7;
			arg1.aFloatArray6 = this.aFloatArray6;
		}
		if (Static117.method1695(this.anInt952, arg4)) {
			arg1.aClass170_3 = arg3.aClass170_3;
			if (arg2) {
				arg1.aByte46 = (byte) (arg1.aByte46 | 0x8);
			}
			arg1.aClass170_3.anInterface13_4 = this.aClass170_3.anInterface13_4;
			arg1.aClass170_3.aByte70 = this.aClass170_3.aByte70;
		} else if (Static227.method3261(this.anInt952, arg4)) {
			arg1.aClass170_3 = this.aClass170_3;
		} else {
			arg1.aClass170_3 = null;
		}
		if (Static451.method6590(arg4, this.anInt952)) {
			if (arg3.aShortArray14 == null || this.anInt940 > arg3.aShortArray14.length) {
				local225 = this.anInt940;
				arg1.aShortArray14 = arg3.aShortArray14 = new short[local225];
				arg1.aShortArray4 = arg3.aShortArray4 = new short[local225];
				arg1.aShortArray6 = arg3.aShortArray6 = new short[local225];
			} else {
				arg1.aShortArray6 = arg3.aShortArray6;
				arg1.aShortArray14 = arg3.aShortArray14;
				arg1.aShortArray4 = arg3.aShortArray4;
			}
			for (local225 = 0; local225 < this.anInt940; local225++) {
				arg1.aShortArray14[local225] = this.aShortArray14[local225];
				arg1.aShortArray4[local225] = this.aShortArray4[local225];
				arg1.aShortArray6[local225] = this.aShortArray6[local225];
			}
		} else {
			arg1.aShortArray6 = this.aShortArray6;
			arg1.aShortArray4 = this.aShortArray4;
			arg1.aShortArray14 = this.aShortArray14;
		}
		if (Static587.method7242(arg4, this.anInt952)) {
			if (arg2) {
				arg1.aByte46 = (byte) (arg1.aByte46 | 0x10);
			}
			arg1.aClass84_1 = arg3.aClass84_1;
			arg1.aClass84_1.anInterface12_3 = this.aClass84_1.anInterface12_3;
		} else if (Static12.method208(this.anInt952, arg4)) {
			arg1.aClass84_1 = this.aClass84_1;
		} else {
			arg1.aClass84_1 = null;
		}
		if (Static719.method9569(this.anInt952, arg4)) {
			if (arg3.aShortArray5 == null || this.anInt940 > arg3.aShortArray5.length) {
				local225 = this.anInt940;
				arg1.aShortArray5 = arg3.aShortArray5 = new short[local225];
			} else {
				arg1.aShortArray5 = arg3.aShortArray5;
			}
			for (local225 = 0; local225 < this.anInt940; local225++) {
				arg1.aShortArray5[local225] = this.aShortArray5[local225];
			}
		} else {
			arg1.aShortArray5 = this.aShortArray5;
		}
		if (!Static570.method7911(this.anInt952, arg4)) {
			arg1.aClass98Array1 = this.aClass98Array1;
		} else if (arg3.aClass98Array1 == null || this.anInt971 > arg3.aClass98Array1.length) {
			local225 = this.anInt971;
			arg1.aClass98Array1 = arg3.aClass98Array1 = new Class98[local225];
			for (local683 = 0; local683 < this.anInt971; local683++) {
				arg1.aClass98Array1[local683] = this.aClass98Array1[local683].method2131();
			}
		} else {
			arg1.aClass98Array1 = arg3.aClass98Array1;
			for (local225 = 0; local225 < this.anInt971; local225++) {
				arg1.aClass98Array1[local225].method2133(this.aClass98Array1[local225]);
			}
		}
		arg1.aClass265Array1 = this.aClass265Array1;
		arg1.aShortArray8 = this.aShortArray8;
		arg1.anIntArray90 = this.anIntArray90;
		arg1.aClass364Array1 = this.aClass364Array1;
		arg1.aClass363Array1 = this.aClass363Array1;
		arg1.anIntArrayArray3 = this.anIntArrayArray3;
		if (this.aBoolean121) {
			arg1.aShort30 = this.aShort30;
			arg1.aShort31 = this.aShort31;
			arg1.aShort37 = this.aShort37;
			arg1.aShort32 = this.aShort32;
			arg1.aShort34 = this.aShort34;
			arg1.aShort28 = this.aShort28;
			arg1.aBoolean121 = true;
			arg1.aShort33 = this.aShort33;
			arg1.aShort29 = this.aShort29;
		} else {
			arg1.aBoolean121 = false;
		}
		arg1.anIntArrayArray5 = this.anIntArrayArray5;
		arg1.anIntArrayArray4 = this.anIntArrayArray4;
		arg1.anIntArray86 = this.anIntArray86;
		arg1.aShortArray9 = this.aShortArray9;
		arg1.aShortArray10 = this.aShortArray10;
		return arg1;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "()Z")
	@Override
	public boolean method5757() {
		if (this.aShortArray5 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray5.length; local13++) {
			if (this.aShortArray5[local13] != -1 && !this.aClass145_Sub3_3.anInterface3_12.method2852(this.aShortArray5[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(B)V")
	private void method896() {
		if (!this.aBoolean122) {
			return;
		}
		this.aBoolean122 = false;
		if (this.aClass364Array1 == null && this.aClass363Array1 == null && this.aClass265Array1 == null && !Static581.method8083(this.anInt953, this.anInt952)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			if (this.anIntArray85 != null && !Static666.method9086(this.anInt953, this.anInt952)) {
				if (this.aClass170_1 != null && this.aClass170_1.anInterface13_4 == null) {
					this.aBoolean122 = true;
				} else {
					if (!this.aBoolean121) {
						this.method905();
					}
					local37 = true;
				}
			}
			if (this.anIntArray87 != null && !Static120.method1773(this.anInt953, this.anInt952)) {
				if (this.aClass170_1 != null && this.aClass170_1.anInterface13_4 == null) {
					this.aBoolean122 = true;
				} else {
					if (!this.aBoolean121) {
						this.method905();
					}
					local39 = true;
				}
			}
			if (this.anIntArray89 != null && !Static248.method3464(this.anInt952, this.anInt953)) {
				if (this.aClass170_1 != null && this.aClass170_1.anInterface13_4 == null) {
					this.aBoolean122 = true;
				} else {
					local41 = true;
					if (!this.aBoolean121) {
						this.method905();
					}
				}
			}
			if (local39) {
				this.anIntArray87 = null;
			}
			if (local41) {
				this.anIntArray89 = null;
			}
			if (local37) {
				this.anIntArray85 = null;
			}
		}
		if (this.aShortArray9 != null && this.anIntArray85 == null && this.anIntArray87 == null && this.anIntArray89 == null) {
			this.anIntArray90 = null;
			this.aShortArray9 = null;
		}
		if (this.aByteArray7 != null && !Static286.method4000(this.anInt952, this.anInt953)) {
			if (this.aClass170_2 == null) {
				if (this.aClass170_4 != null && this.aClass170_4.anInterface13_4 == null) {
					this.aBoolean122 = true;
				} else {
					this.aShortArray12 = this.aShortArray13 = this.aShortArray7 = null;
					this.aByteArray7 = null;
				}
			} else if (this.aClass170_2.anInterface13_4 == null) {
				this.aBoolean122 = true;
			} else {
				this.aShortArray12 = this.aShortArray13 = this.aShortArray7 = null;
				this.aByteArray7 = null;
			}
		}
		if (this.aShortArray11 != null && !Static313.method4358(this.anInt953, this.anInt952)) {
			if (this.aClass170_4 != null && this.aClass170_4.anInterface13_4 == null) {
				this.aBoolean122 = true;
			} else {
				this.aShortArray11 = null;
			}
		}
		if (this.aByteArray6 != null && !Static451.method6594(this.anInt953, this.anInt952)) {
			if (this.aClass170_4 != null && this.aClass170_4.anInterface13_4 == null) {
				this.aBoolean122 = true;
			} else {
				this.aByteArray6 = null;
			}
		}
		if (this.aFloatArray7 != null && !Static387.method8349(this.anInt952, this.anInt953)) {
			if (this.aClass170_3 != null && this.aClass170_3.anInterface13_4 == null) {
				this.aBoolean122 = true;
			} else {
				this.aFloatArray7 = this.aFloatArray6 = null;
			}
		}
		if (this.aShortArray5 != null && !Static474.method6817(this.anInt952, this.anInt953)) {
			if (this.aClass170_4 != null && this.aClass170_4.anInterface13_4 == null) {
				this.aBoolean122 = true;
			} else {
				this.aShortArray5 = null;
			}
		}
		if (this.aShortArray14 != null && !Static589.method9463(this.anInt953, this.anInt952)) {
			if ((this.aClass84_1 == null || this.aClass84_1.anInterface12_3 != null) && (this.aClass170_4 == null || this.aClass170_4.anInterface13_4 != null)) {
				this.aShortArray14 = this.aShortArray4 = this.aShortArray6 = null;
			} else {
				this.aBoolean122 = true;
			}
		}
		if (this.anIntArrayArray3 != null && !Static508.method7187(this.anInt953, this.anInt952)) {
			this.aShortArray10 = null;
			this.anIntArrayArray3 = null;
		}
		if (this.anIntArrayArray4 != null && !Static515.method7311(this.anInt952, this.anInt953)) {
			this.anIntArrayArray4 = null;
			this.aShortArray8 = null;
		}
		if (this.anIntArrayArray5 != null && !Static246.method3452(this.anInt952, this.anInt953)) {
			this.anIntArrayArray5 = null;
		}
		if (this.anIntArray86 != null && (this.anInt953 & 0x800) == 0 && (this.anInt953 & 0x40000) == 0) {
			this.anIntArray86 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(Z)V")
	private void method897() {
		if (this.aClass265Array1 == null) {
			return;
		}
		@Pc(8) Class86_Sub1 local8 = this.aClass145_Sub3_3.aClass86_Sub1_2;
		this.aClass145_Sub3_3.method8884();
		this.aClass145_Sub3_3.C(!this.aBoolean120);
		this.aClass145_Sub3_3.method8907(false);
		this.aClass145_Sub3_3.method8874((Class170) null, this.aClass145_Sub3_3.aClass170_16, (Class170) null, this.aClass145_Sub3_3.aClass170_15);
		for (@Pc(41) int local41 = 0; local41 < this.anInt971; local41++) {
			@Pc(50) Class265 local50 = this.aClass265Array1[local41];
			@Pc(55) Class98 local55 = this.aClass98Array1[local41];
			if (!local50.aBoolean604 || !this.aClass145_Sub3_3.method9632()) {
				@Pc(85) float local85 = (float) (this.anIntArray85[local50.anInt7117] + this.anIntArray85[local50.anInt7123] + this.anIntArray85[local50.anInt7122]) * 0.3333333F;
				@Pc(106) float local106 = (float) (this.anIntArray87[local50.anInt7117] + this.anIntArray87[local50.anInt7122] + this.anIntArray87[local50.anInt7123]) * 0.3333333F;
				@Pc(127) float local127 = (float) (this.anIntArray89[local50.anInt7122] + this.anIntArray89[local50.anInt7123] + this.anIntArray89[local50.anInt7117]) * 0.3333333F;
				@Pc(141) float local141 = Static266.aFloat50 + local106 * Static392.aFloat109 + Static658.aFloat141 * local85 + local127 * Static114.aFloat9;
				@Pc(155) float local155 = Static324.aFloat69 * local106 + local85 * Static716.aFloat177 + local127 * Static432.aFloat115 + Static135.aFloat23;
				@Pc(169) float local169 = local106 * Static350.aFloat71 + local85 * Static98.aFloat7 + Static168.aFloat28 * local127 + Static165.aFloat26;
				@Pc(190) float local190 = (float) (1.0D / Math.sqrt((double) (local141 * local141 + local155 * local155 + local169 * local169))) * (float) local50.anInt7120;
				local8.method1815(local169 * local190 - local169, (float) local55.anInt2461 + local141 - local190 * local141, local50.aShort95 * local55.anInt2463 >> 7, local55.anInt2462, (float) local55.anInt2467 + local155 * local190 - local155, local50.aShort96 * local55.anInt2466 >> 7);
				this.aClass145_Sub3_3.method8901(local8);
				@Pc(241) int local241 = local55.anInt2460;
				OpenGL.glColor4ub((byte) (local241 >> 16), (byte) (local241 >> 8), (byte) local241, (byte) (local241 >> 24));
				this.aClass145_Sub3_3.method8881(local50.aShort97);
				this.aClass145_Sub3_3.method8847(local50.aByte99);
				this.aClass145_Sub3_3.method8908(4);
			}
		}
		this.aClass145_Sub3_3.C(true);
		this.aClass145_Sub3_3.method8848();
	}

	@OriginalMember(owner = "client!bm", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(B)V")
	private void method899() {
		if (this.anInt950 == 0) {
			return;
		}
		if (this.aByte46 != 0) {
			this.method904(true);
		}
		this.method904(false);
		if (this.aClass84_1 != null) {
			if (this.aClass84_1.anInterface12_3 == null) {
				this.method902((this.aByte46 & 0x10) != 0);
			}
			if (this.aClass84_1.anInterface12_3 != null) {
				this.aClass145_Sub3_3.method8907(this.aClass170_2 != null);
				this.aClass145_Sub3_3.method8874(this.aClass170_4, this.aClass170_1, this.aClass170_2, this.aClass170_3);
				@Pc(98) int local98 = this.anIntArray86.length - 1;
				for (@Pc(100) int local100 = 0; local100 < local98; local100++) {
					@Pc(107) int local107 = this.anIntArray86[local100];
					@Pc(114) int local114 = this.anIntArray86[local100 + 1];
					@Pc(121) int local121 = this.aShortArray5[local107] & 0xFFFF;
					if (local121 == 65535) {
						local121 = -1;
					}
					this.aClass145_Sub3_3.method8910(this.aClass170_2 != null, local121);
					this.aClass145_Sub3_3.method8921((local114 - local107) * 3, local107 * 3, this.aClass84_1.anInterface12_3);
				}
			}
		}
		this.method896();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!gw;Lclient!fa;II)V")
	@Override
	public void method5759(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt994 == 0) {
			return;
		}
		@Pc(14) Class86_Sub1 local14 = this.aClass145_Sub3_3.aClass86_Sub1_3;
		@Pc(17) Class86_Sub1 local17 = (Class86_Sub1) arg0;
		if (!this.aBoolean121) {
			this.method905();
		}
		Static165.aFloat26 = local14.aFloat22 + local17.aFloat22 * local14.aFloat19 + local17.aFloat13 * local14.aFloat20 + local14.aFloat12 * local17.aFloat21;
		Static350.aFloat71 = local17.aFloat20 * local14.aFloat19 + local14.aFloat12 * local17.aFloat11 + local14.aFloat20 * local17.aFloat16;
		@Pc(72) float local72 = Static165.aFloat26 + Static350.aFloat71 * (float) this.aShort29;
		@Pc(80) float local80 = (float) this.aShort31 * Static350.aFloat71 + Static165.aFloat26;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.aShort28 + local72;
			local97 = (float) -this.aShort28 + local80;
		} else {
			local90 = local80 + (float) this.aShort28;
			local97 = local72 - (float) this.aShort28;
		}
		if (this.aClass145_Sub3_3.aFloat162 <= local97 || (float) this.aClass145_Sub3_3.anInt10164 >= local90) {
			return;
		}
		Static266.aFloat50 = local14.aFloat14 * local17.aFloat22 + local14.aFloat17 * local17.aFloat21 + local17.aFloat13 * local14.aFloat11 + local14.aFloat21;
		Static392.aFloat109 = local14.aFloat17 * local17.aFloat11 + local17.aFloat16 * local14.aFloat11 + local14.aFloat14 * local17.aFloat20;
		@Pc(175) float local175 = (float) this.aShort29 * Static392.aFloat109 + Static266.aFloat50;
		@Pc(183) float local183 = Static266.aFloat50 + Static392.aFloat109 * (float) this.aShort31;
		@Pc(209) float local209;
		@Pc(198) float local198;
		if (local183 < local175) {
			local209 = (local183 - (float) this.aShort28) * (float) this.aClass145_Sub3_3.anInt10169;
			local198 = (float) this.aClass145_Sub3_3.anInt10169 * ((float) this.aShort28 + local175);
		} else {
			local198 = (local183 + (float) this.aShort28) * (float) this.aClass145_Sub3_3.anInt10169;
			local209 = (float) this.aClass145_Sub3_3.anInt10169 * (local175 - (float) this.aShort28);
		}
		if (this.aClass145_Sub3_3.aFloat154 <= local209 / (float) arg2 || local198 / (float) arg2 <= this.aClass145_Sub3_3.aFloat155) {
			return;
		}
		Static324.aFloat69 = local14.aFloat18 * local17.aFloat20 + local17.aFloat16 * local14.aFloat16 + local17.aFloat11 * local14.aFloat15;
		Static135.aFloat23 = local14.aFloat13 + local17.aFloat13 * local14.aFloat16 + local14.aFloat15 * local17.aFloat21 + local17.aFloat22 * local14.aFloat18;
		@Pc(302) float local302 = (float) this.aShort29 * Static324.aFloat69 + Static135.aFloat23;
		@Pc(310) float local310 = Static135.aFloat23 + Static324.aFloat69 * (float) this.aShort31;
		@Pc(337) float local337;
		@Pc(325) float local325;
		if (local302 > local310) {
			local325 = (float) this.aClass145_Sub3_3.anInt10158 * ((float) this.aShort28 + local302);
			local337 = (local310 - (float) this.aShort28) * (float) this.aClass145_Sub3_3.anInt10158;
		} else {
			local325 = (local310 + (float) this.aShort28) * (float) this.aClass145_Sub3_3.anInt10158;
			local337 = (float) this.aClass145_Sub3_3.anInt10158 * ((float) -this.aShort28 + local302);
		}
		if (this.aClass145_Sub3_3.aFloat159 <= local337 / (float) arg2 || this.aClass145_Sub3_3.aFloat172 >= local325 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass265Array1 != null) {
			Static716.aFloat177 = local14.aFloat15 * local17.aFloat17 + local14.aFloat16 * local17.aFloat15 + local14.aFloat18 * local17.aFloat12;
			Static658.aFloat141 = local14.aFloat17 * local17.aFloat17 + local14.aFloat11 * local17.aFloat15 + local14.aFloat14 * local17.aFloat12;
			Static98.aFloat7 = local17.aFloat12 * local14.aFloat19 + local14.aFloat20 * local17.aFloat15 + local14.aFloat12 * local17.aFloat17;
			Static432.aFloat115 = local14.aFloat15 * local17.aFloat14 + local14.aFloat16 * local17.aFloat18 + local14.aFloat18 * local17.aFloat19;
			Static114.aFloat9 = local14.aFloat11 * local17.aFloat18 + local14.aFloat17 * local17.aFloat14 + local14.aFloat14 * local17.aFloat19;
			Static168.aFloat28 = local14.aFloat20 * local17.aFloat18 + local14.aFloat12 * local17.aFloat14 + local17.aFloat19 * local14.aFloat19;
		}
		if (arg1 != null) {
			@Pc(510) int local510 = this.aShort34 + this.aShort37 >> 1;
			@Pc(518) int local518 = this.aShort32 + this.aShort33 >> 1;
			@Pc(537) int local537 = (int) (Static266.aFloat50 + (float) local510 * Static658.aFloat141 + Static392.aFloat109 * (float) this.aShort29 + (float) local518 * Static114.aFloat9);
			@Pc(556) int local556 = (int) (Static716.aFloat177 * (float) local510 + Static135.aFloat23 + Static324.aFloat69 * (float) this.aShort29 + Static432.aFloat115 * (float) local518);
			@Pc(575) int local575 = (int) ((float) this.aShort29 * Static350.aFloat71 + Static98.aFloat7 * (float) local510 + Static165.aFloat26 + Static168.aFloat28 * (float) local518);
			@Pc(594) int local594 = (int) ((float) this.aShort31 * Static392.aFloat109 + (float) local510 * Static658.aFloat141 + Static266.aFloat50 + Static114.aFloat9 * (float) local518);
			@Pc(613) int local613 = (int) (Static432.aFloat115 * (float) local518 + Static324.aFloat69 * (float) this.aShort31 + Static135.aFloat23 + Static716.aFloat177 * (float) local510);
			arg1.anInt2724 = this.aClass145_Sub3_3.anInt10173 + this.aClass145_Sub3_3.anInt10169 * local537 / arg2;
			arg1.anInt2725 = local556 * this.aClass145_Sub3_3.anInt10158 / arg2 + this.aClass145_Sub3_3.anInt10178;
			@Pc(658) int local658 = (int) (Static350.aFloat71 * (float) this.aShort31 + Static165.aFloat26 + (float) local510 * Static98.aFloat7 + Static168.aFloat28 * (float) local518);
			arg1.anInt2722 = this.aClass145_Sub3_3.anInt10173 + this.aClass145_Sub3_3.anInt10169 * local594 / arg2;
			arg1.anInt2726 = this.aClass145_Sub3_3.anInt10158 * local613 / arg2 + this.aClass145_Sub3_3.anInt10178;
			if (this.aClass145_Sub3_3.anInt10164 <= local575 || local658 >= this.aClass145_Sub3_3.anInt10164) {
				arg1.anInt2723 = (this.aShort28 + local537) * this.aClass145_Sub3_3.anInt10169 / arg2 + this.aClass145_Sub3_3.anInt10173 - arg1.anInt2724;
				arg1.aBoolean269 = true;
			}
		}
		this.aClass145_Sub3_3.method8862((float) arg2);
		this.aClass145_Sub3_3.method8868();
		this.aClass145_Sub3_3.method8865(local17);
		this.method899();
		this.aClass145_Sub3_3.method8848();
		this.method897();
	}

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(65) int local65;
		@Pc(43) int local43;
		@Pc(59) int local59;
		@Pc(57) int[] local57;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static27.anInt379 = 0;
			local29 = 0;
			Static583.anInt2353 = 0;
			Static403.anInt6653 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray4.length) {
					local57 = this.anIntArrayArray4[local43];
					for (local59 = 0; local59 < local57.length; local59++) {
						local65 = local57[local59];
						if (this.aShortArray8 == null || (this.aShortArray8[local65] & arg6) != 0) {
							Static403.anInt6653 += this.anIntArray85[local65];
							Static27.anInt379 += this.anIntArray87[local65];
							Static583.anInt2353 += this.anIntArray89[local65];
							local29++;
						}
					}
				}
			}
			if (local29 <= 0) {
				Static403.anInt6653 = arg2;
				Static27.anInt379 = arg3;
				Static583.anInt2353 = arg4;
			} else {
				Static403.anInt6653 = Static403.anInt6653 / local29 + arg2;
				Static440.aBoolean607 = true;
				Static583.anInt2353 = arg4 + Static583.anInt2353 / local29;
				Static27.anInt379 = Static27.anInt379 / local29 + arg3;
			}
			return;
		}
		@Pc(264) int[] local264;
		@Pc(266) int local266;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 8192 >> 14;
				local35 = arg3 * arg7[4] + arg2 * arg7[3] + arg4 * arg7[5] + 8192 >> 14;
				local43 = arg4 * arg7[8] + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg4 = local43;
				arg2 = local29;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray4.length) {
					local264 = this.anIntArrayArray4[local35];
					for (local266 = 0; local266 < local264.length; local266++) {
						local59 = local264[local266];
						if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local59]) != 0) {
							this.anIntArray85[local59] += arg2;
							this.anIntArray87[local59] += arg3;
							this.anIntArray89[local59] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(413) int local413;
		@Pc(431) int local431;
		@Pc(682) int local682;
		@Pc(691) int local691;
		@Pc(702) int local702;
		@Pc(706) int local706;
		@Pc(724) int local724;
		@Pc(1087) int local1087;
		@Pc(1095) int local1095;
		@Pc(1251) int local1251;
		@Pc(1276) int local1276;
		@Pc(1280) int local1280;
		@Pc(1288) int local1288;
		@Pc(1293) int local1293;
		@Pc(1297) int local1297;
		@Pc(1301) int local1301;
		@Pc(1303) int local1303;
		@Pc(1440) int[] local1440;
		@Pc(1442) int local1442;
		@Pc(1448) int local1448;
		@Pc(1452) int local1452;
		@Pc(1454) int local1454;
		@Pc(1586) int local1586;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray4.length > local35) {
						local264 = this.anIntArrayArray4[local35];
						for (local266 = 0; local266 < local264.length; local266++) {
							local59 = local264[local266];
							if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local59]) != 0) {
								this.anIntArray85[local59] -= Static403.anInt6653;
								this.anIntArray87[local59] -= Static27.anInt379;
								this.anIntArray89[local59] -= Static583.anInt2353;
								if (arg4 != 0) {
									local65 = Class145_Sub1.anIntArray761[arg4];
									local413 = Class145_Sub1.anIntArray760[arg4];
									local431 = local413 * this.anIntArray85[local59] + this.anIntArray87[local59] * local65 + 16383 >> 14;
									this.anIntArray87[local59] = local413 * this.anIntArray87[local59] + 16383 - local65 * this.anIntArray85[local59] >> 14;
									this.anIntArray85[local59] = local431;
								}
								if (arg2 != 0) {
									local65 = Class145_Sub1.anIntArray761[arg2];
									local413 = Class145_Sub1.anIntArray760[arg2];
									local431 = this.anIntArray87[local59] * local413 + 16383 - this.anIntArray89[local59] * local65 >> 14;
									this.anIntArray89[local59] = local65 * this.anIntArray87[local59] + this.anIntArray89[local59] * local413 + 16383 >> 14;
									this.anIntArray87[local59] = local431;
								}
								if (arg3 != 0) {
									local65 = Class145_Sub1.anIntArray761[arg3];
									local413 = Class145_Sub1.anIntArray760[arg3];
									local431 = this.anIntArray85[local59] * local413 + local65 * this.anIntArray89[local59] + 16383 >> 14;
									this.anIntArray89[local59] = this.anIntArray89[local59] * local413 + 16383 - local65 * this.anIntArray85[local59] >> 14;
									this.anIntArray85[local59] = local431;
								}
								this.anIntArray85[local59] += Static403.anInt6653;
								this.anIntArray87[local59] += Static27.anInt379;
								this.anIntArray89[local59] += Static583.anInt2353;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray4.length) {
							local57 = this.anIntArrayArray4[local43];
							for (local59 = 0; local59 < local57.length; local59++) {
								local65 = local57[local59];
								if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local65]) != 0) {
									local413 = this.anIntArray90[local65];
									local431 = this.anIntArray90[local65 + 1];
									for (local682 = local413; local682 < local431; local682++) {
										local691 = this.aShortArray9[local682] - 1;
										if (local691 == -1) {
											break;
										}
										if (arg4 != 0) {
											local702 = Class145_Sub1.anIntArray761[arg4];
											local706 = Class145_Sub1.anIntArray760[arg4];
											local724 = local706 * this.aShortArray12[local691] + local702 * this.aShortArray13[local691] + 16383 >> 14;
											this.aShortArray13[local691] = (short) (this.aShortArray13[local691] * local706 + 16383 - local702 * this.aShortArray12[local691] >> 14);
											this.aShortArray12[local691] = (short) local724;
										}
										if (arg2 != 0) {
											local702 = Class145_Sub1.anIntArray761[arg2];
											local706 = Class145_Sub1.anIntArray760[arg2];
											local724 = local706 * this.aShortArray13[local691] + 16383 - this.aShortArray7[local691] * local702 >> 14;
											this.aShortArray7[local691] = (short) (local702 * this.aShortArray13[local691] + local706 * this.aShortArray7[local691] + 16383 >> 14);
											this.aShortArray13[local691] = (short) local724;
										}
										if (arg3 != 0) {
											local702 = Class145_Sub1.anIntArray761[arg3];
											local706 = Class145_Sub1.anIntArray760[arg3];
											local724 = this.aShortArray7[local691] * local702 + this.aShortArray12[local691] * local706 + 16383 >> 14;
											this.aShortArray7[local691] = (short) (local706 * this.aShortArray7[local691] + 16383 - local702 * this.aShortArray12[local691] >> 14);
											this.aShortArray12[local691] = (short) local724;
										}
									}
								}
							}
						}
					}
					if (this.aClass170_2 == null && this.aClass170_4 != null) {
						this.aClass170_4.anInterface13_4 = null;
					}
					if (this.aClass170_2 != null) {
						this.aClass170_2.anInterface13_4 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local266 = arg7[12] << 4;
				local59 = arg7[13] << 4;
				local65 = arg7[14] << 4;
				if (Static440.aBoolean607) {
					local413 = arg7[0] * Static403.anInt6653 + Static27.anInt379 * arg7[3] + arg7[6] * Static583.anInt2353 + 8192 >> 14;
					local431 = Static583.anInt2353 * arg7[7] + arg7[1] * Static403.anInt6653 + arg7[4] * Static27.anInt379 + 8192 >> 14;
					local682 = arg7[2] * Static403.anInt6653 + arg7[5] * Static27.anInt379 + arg7[8] * Static583.anInt2353 + 8192 >> 14;
					local413 += local266;
					local431 += local59;
					Static403.anInt6653 = local413;
					Static27.anInt379 = local431;
					local682 += local65;
					Static440.aBoolean607 = false;
					Static583.anInt2353 = local682;
				}
				@Pc(1055) int[] local1055 = new int[9];
				local431 = Class145_Sub1.anIntArray760[arg2];
				local682 = Class145_Sub1.anIntArray761[arg2];
				local691 = Class145_Sub1.anIntArray760[arg3];
				local702 = Class145_Sub1.anIntArray761[arg3];
				local706 = Class145_Sub1.anIntArray760[arg4];
				local724 = Class145_Sub1.anIntArray761[arg4];
				local1087 = local706 * local682 + 8192 >> 14;
				local1095 = local682 * local724 + 8192 >> 14;
				local1055[3] = local431 * local724 + 8192 >> 14;
				local1055[4] = local706 * local431 + 8192 >> 14;
				local1055[6] = -local702 * local706 + local691 * local1095 + 8192 >> 14;
				local1055[1] = local702 * local1087 + -local691 * local724 + 8192 >> 14;
				local1055[8] = local431 * local691 + 8192 >> 14;
				local1055[0] = local1095 * local702 + local706 * local691 + 8192 >> 14;
				local1055[2] = local431 * local702 + 8192 >> 14;
				local1055[7] = local702 * local724 + local691 * local1087 + 8192 >> 14;
				local1055[5] = -local682;
				@Pc(1225) int local1225 = local1055[0] * -Static403.anInt6653 + local1055[1] * -Static27.anInt379 + -Static583.anInt2353 * local1055[2] + 8192 >> 14;
				local1251 = -Static583.anInt2353 * local1055[5] + local1055[3] * -Static403.anInt6653 + -Static27.anInt379 * local1055[4] + 8192 >> 14;
				local1276 = -Static583.anInt2353 * local1055[8] + -Static403.anInt6653 * local1055[6] + local1055[7] * -Static27.anInt379 + 8192 >> 14;
				local1280 = Static403.anInt6653 + local1225;
				@Pc(1284) int local1284 = Static27.anInt379 + local1251;
				local1288 = Static583.anInt2353 + local1276;
				@Pc(1291) int[] local1291 = new int[9];
				for (local1293 = 0; local1293 < 3; local1293++) {
					for (local1297 = 0; local1297 < 3; local1297++) {
						local1301 = 0;
						for (local1303 = 0; local1303 < 3; local1303++) {
							local1301 += local1055[local1303 + local1293 * 3] * arg7[local1303 + local1297 * 3];
						}
						local1291[local1293 * 3 + local1297] = local1301 + 8192 >> 14;
					}
				}
				local1297 = local1055[1] * local59 + local1055[0] * local266 + local65 * local1055[2] + 8192 >> 14;
				local1301 = local59 * local1055[4] + local1055[3] * local266 + local65 * local1055[5] + 8192 >> 14;
				local1297 += local1280;
				local1301 += local1284;
				local1303 = local1055[6] * local266 + local59 * local1055[7] + local65 * local1055[8] + 8192 >> 14;
				local1303 += local1288;
				local1440 = new int[9];
				for (local1442 = 0; local1442 < 3; local1442++) {
					for (local1448 = 0; local1448 < 3; local1448++) {
						local1452 = 0;
						for (local1454 = 0; local1454 < 3; local1454++) {
							local1452 += arg7[local1454 + local1442 * 3] * local1291[local1454 * 3 + local1448];
						}
						local1440[local1448 + local1442 * 3] = local1452 + 8192 >> 14;
					}
				}
				local1448 = local1297 * arg7[0] + local1301 * arg7[1] + local1303 * arg7[2] + 8192 >> 14;
				local1452 = arg7[5] * local1303 + local1301 * arg7[4] + local1297 * arg7[3] + 8192 >> 14;
				local1452 += local35;
				local1448 += local29;
				local1454 = local1301 * arg7[7] + local1297 * arg7[6] + local1303 * arg7[8] + 8192 >> 14;
				local1454 += local43;
				for (local1586 = 0; local1586 < local8; local1586++) {
					@Pc(1594) int local1594 = arg1[local1586];
					if (this.anIntArrayArray4.length > local1594) {
						@Pc(1608) int[] local1608 = this.anIntArrayArray4[local1594];
						for (@Pc(1610) int local1610 = 0; local1610 < local1608.length; local1610++) {
							@Pc(1616) int local1616 = local1608[local1610];
							if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local1616]) != 0) {
								@Pc(1659) int local1659 = this.anIntArray87[local1616] * local1440[1] + this.anIntArray85[local1616] * local1440[0] + local1440[2] * this.anIntArray89[local1616] + 8192 >> 14;
								@Pc(1690) int local1690 = this.anIntArray89[local1616] * local1440[5] + this.anIntArray87[local1616] * local1440[4] + this.anIntArray85[local1616] * local1440[3] + 8192 >> 14;
								@Pc(1694) int local1694 = local1659 + local1448;
								@Pc(1726) int local1726 = local1440[7] * this.anIntArray87[local1616] + this.anIntArray85[local1616] * local1440[6] + local1440[8] * this.anIntArray89[local1616] + 8192 >> 14;
								@Pc(1730) int local1730 = local1690 + local1452;
								@Pc(1734) int local1734 = local1726 + local1454;
								this.anIntArray85[local1616] = local1694;
								this.anIntArray87[local1616] = local1730;
								this.anIntArray89[local1616] = local1734;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2703) Class265 local2703;
			@Pc(2708) Class98 local2708;
			if (arg0 == 5) {
				if (this.anIntArrayArray3 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray3.length > local35) {
							local264 = this.anIntArrayArray3[local35];
							for (local266 = 0; local266 < local264.length; local266++) {
								local59 = local264[local266];
								if (this.aShortArray10 == null || (this.aShortArray10[local59] & arg6) != 0) {
									local65 = (this.aByteArray6[local59] & 0xFF) + arg2 * 8;
									if (local65 < 0) {
										local65 = 0;
									} else if (local65 > 255) {
										local65 = 255;
									}
									this.aByteArray6[local59] = (byte) local65;
									if (this.aClass170_4 != null) {
										this.aClass170_4.anInterface13_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass265Array1 != null) {
						for (local35 = 0; local35 < this.anInt971; local35++) {
							local2703 = this.aClass265Array1[local35];
							local2708 = this.aClass98Array1[local35];
							local2708.anInt2460 = 255 - (this.aByteArray6[local2703.anInt7118] & 0xFF) << 24 | local2708.anInt2460 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2987) Class98 local2987;
				if (arg0 == 8) {
					if (this.anIntArrayArray5 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray5.length) {
								local264 = this.anIntArrayArray5[local35];
								for (local266 = 0; local266 < local264.length; local266++) {
									local2987 = this.aClass98Array1[local264[local266]];
									local2987.anInt2461 += arg2;
									local2987.anInt2467 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray5 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray5.length) {
								local264 = this.anIntArrayArray5[local35];
								for (local266 = 0; local266 < local264.length; local266++) {
									local2987 = this.aClass98Array1[local264[local266]];
									local2987.anInt2466 = arg3 * local2987.anInt2466 >> 7;
									local2987.anInt2463 = arg2 * local2987.anInt2463 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray5 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray5.length > local35) {
							local264 = this.anIntArrayArray5[local35];
							for (local266 = 0; local266 < local264.length; local266++) {
								local2987 = this.aClass98Array1[local264[local266]];
								local2987.anInt2462 = arg2 + local2987.anInt2462 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray3 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray3.length) {
						local264 = this.anIntArrayArray3[local35];
						for (local266 = 0; local266 < local264.length; local266++) {
							local59 = local264[local266];
							if (this.aShortArray10 == null || (this.aShortArray10[local59] & arg6) != 0) {
								local65 = this.aShortArray11[local59] & 0xFFFF;
								local413 = local65 >> 10 & 0x3F;
								local431 = local65 >> 7 & 0x7;
								local431 += arg3 / 4;
								local682 = local65 & 0x7F;
								@Pc(2827) int local2827 = local413 + arg2 & 0x3F;
								if (local431 < 0) {
									local431 = 0;
								} else if (local431 > 7) {
									local431 = 7;
								}
								local682 += arg4;
								if (local682 < 0) {
									local682 = 0;
								} else if (local682 > 127) {
									local682 = 127;
								}
								this.aShortArray11[local59] = (short) (local682 | local2827 << 10 | local431 << 7);
								if (this.aClass170_4 != null) {
									this.aClass170_4.anInterface13_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass265Array1 != null) {
					for (local35 = 0; local35 < this.anInt971; local35++) {
						local2703 = this.aClass265Array1[local35];
						local2708 = this.aClass98Array1[local35];
						local2708.anInt2460 = Static555.anIntArray633[this.aShortArray11[local2703.anInt7118] & 0xFFFF] & 0xFFFFFF | local2708.anInt2460 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray4.length > local35) {
					local264 = this.anIntArrayArray4[local35];
					for (local266 = 0; local266 < local264.length; local266++) {
						local59 = local264[local266];
						if (this.aShortArray8 == null || (this.aShortArray8[local59] & arg6) != 0) {
							this.anIntArray85[local59] -= Static403.anInt6653;
							this.anIntArray87[local59] -= Static27.anInt379;
							this.anIntArray89[local59] -= Static583.anInt2353;
							this.anIntArray85[local59] = arg2 * this.anIntArray85[local59] >> 7;
							this.anIntArray87[local59] = arg3 * this.anIntArray87[local59] >> 7;
							this.anIntArray89[local59] = this.anIntArray89[local59] * arg4 >> 7;
							this.anIntArray85[local59] += Static403.anInt6653;
							this.anIntArray87[local59] += Static27.anInt379;
							this.anIntArray89[local59] += Static583.anInt2353;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local266 = arg7[12] << 4;
			local59 = arg7[13] << 4;
			local65 = arg7[14] << 4;
			if (Static440.aBoolean607) {
				local413 = Static403.anInt6653 * arg7[0] + arg7[3] * Static27.anInt379 + Static583.anInt2353 * arg7[6] + 8192 >> 14;
				local431 = Static583.anInt2353 * arg7[7] + arg7[4] * Static27.anInt379 + Static403.anInt6653 * arg7[1] + 8192 >> 14;
				local413 += local266;
				local431 += local59;
				local682 = arg7[8] * Static583.anInt2353 + arg7[2] * Static403.anInt6653 + Static27.anInt379 * arg7[5] + 8192 >> 14;
				local682 += local65;
				Static27.anInt379 = local431;
				Static403.anInt6653 = local413;
				Static583.anInt2353 = local682;
				Static440.aBoolean607 = false;
			}
			local413 = arg2 << 15 >> 7;
			local431 = arg3 << 15 >> 7;
			local682 = arg4 << 15 >> 7;
			local691 = local413 * -Static403.anInt6653 + 8192 >> 14;
			local702 = local431 * -Static27.anInt379 + 8192 >> 14;
			local706 = local682 * -Static583.anInt2353 + 8192 >> 14;
			local724 = local691 + Static403.anInt6653;
			local1087 = local702 + Static27.anInt379;
			local1095 = Static583.anInt2353 + local706;
			@Pc(1967) int[] local1967 = new int[] { local413 * arg7[0] + 8192 >> 14, local413 * arg7[3] + 8192 >> 14, arg7[6] * local413 + 8192 >> 14, arg7[1] * local431 + 8192 >> 14, local431 * arg7[4] + 8192 >> 14, arg7[7] * local431 + 8192 >> 14, local682 * arg7[2] + 8192 >> 14, arg7[5] * local682 + 8192 >> 14, arg7[8] * local682 + 8192 >> 14 };
			local1251 = local413 * local266 + 8192 >> 14;
			local1276 = local431 * local59 + 8192 >> 14;
			@Pc(2095) int local2095 = local1276 + local1087;
			local1280 = local65 * local682 + 8192 >> 14;
			@Pc(2107) int local2107 = local1251 + local724;
			@Pc(2111) int local2111 = local1280 + local1095;
			@Pc(2114) int[] local2114 = new int[9];
			@Pc(2120) int local2120;
			for (local1288 = 0; local1288 < 3; local1288++) {
				for (local2120 = 0; local2120 < 3; local2120++) {
					local1293 = 0;
					for (local1297 = 0; local1297 < 3; local1297++) {
						local1293 += local1967[local2120 + local1297 * 3] * arg7[local1297 + local1288 * 3];
					}
					local2114[local1288 * 3 + local2120] = local1293 + 8192 >> 14;
				}
			}
			local2120 = arg7[2] * local2111 + arg7[0] * local2107 + arg7[1] * local2095 + 8192 >> 14;
			local1293 = local2095 * arg7[4] + arg7[3] * local2107 + arg7[5] * local2111 + 8192 >> 14;
			local1297 = arg7[8] * local2111 + arg7[7] * local2095 + local2107 * arg7[6] + 8192 >> 14;
			local2120 += local29;
			local1293 += local35;
			local1297 += local43;
			for (local1301 = 0; local1301 < local8; local1301++) {
				local1303 = arg1[local1301];
				if (local1303 < this.anIntArrayArray4.length) {
					local1440 = this.anIntArrayArray4[local1303];
					for (local1442 = 0; local1442 < local1440.length; local1442++) {
						local1448 = local1440[local1442];
						if (this.aShortArray8 == null || (this.aShortArray8[local1448] & arg6) != 0) {
							local1452 = local2114[2] * this.anIntArray89[local1448] + local2114[1] * this.anIntArray87[local1448] + local2114[0] * this.anIntArray85[local1448] + 8192 >> 14;
							local1454 = local2114[5] * this.anIntArray89[local1448] + local2114[3] * this.anIntArray85[local1448] + this.anIntArray87[local1448] * local2114[4] + 8192 >> 14;
							@Pc(2366) int local2366 = local1454 + local1293;
							@Pc(2370) int local2370 = local1452 + local2120;
							local1586 = this.anIntArray89[local1448] * local2114[8] + this.anIntArray85[local1448] * local2114[6] + this.anIntArray87[local1448] * local2114[7] + 8192 >> 14;
							this.anIntArray85[local1448] = local2370;
							@Pc(2411) int local2411 = local1586 + local1297;
							this.anIntArray87[local1448] = local2366;
							this.anIntArray89[local1448] = local2411;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort34;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!gw;ZI)Z")
	@Override
	public boolean method5770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method901(arg1, arg3, arg2, arg0, -1, arg4);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5760(@OriginalArg(0) Class45 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class45_Sub1 local8 = (Class45_Sub1) arg0;
		if (this.anInt940 == 0 || local8.anInt940 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt992;
		@Pc(27) int[] local27 = local8.anIntArray85;
		@Pc(30) int[] local30 = local8.anIntArray87;
		@Pc(33) int[] local33 = local8.anIntArray89;
		@Pc(36) short[] local36 = local8.aShortArray12;
		@Pc(39) short[] local39 = local8.aShortArray13;
		@Pc(42) short[] local42 = local8.aShortArray7;
		@Pc(45) byte[] local45 = local8.aByteArray7;
		@Pc(60) short[] local60;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(52) byte[] local52;
		if (this.aClass284_1 == null) {
			local60 = null;
			local64 = null;
			local56 = null;
			local52 = null;
		} else {
			local52 = this.aClass284_1.aByteArray97;
			local56 = this.aClass284_1.aShortArray127;
			local60 = this.aClass284_1.aShortArray126;
			local64 = this.aClass284_1.aShortArray125;
		}
		@Pc(93) short[] local93;
		@Pc(81) short[] local81;
		@Pc(89) short[] local89;
		@Pc(85) byte[] local85;
		if (local8.aClass284_1 == null) {
			local81 = null;
			local89 = null;
			local85 = null;
			local93 = null;
		} else {
			local81 = local8.aClass284_1.aShortArray127;
			local85 = local8.aClass284_1.aByteArray97;
			local89 = local8.aClass284_1.aShortArray125;
			local93 = local8.aClass284_1.aShortArray126;
		}
		@Pc(106) int[] local106 = local8.anIntArray90;
		@Pc(109) short[] local109 = local8.aShortArray9;
		if (!local8.aBoolean121) {
			local8.method905();
		}
		@Pc(120) short local120 = local8.aShort29;
		@Pc(123) short local123 = local8.aShort31;
		@Pc(126) short local126 = local8.aShort37;
		@Pc(129) short local129 = local8.aShort34;
		@Pc(132) short local132 = local8.aShort33;
		@Pc(135) short local135 = local8.aShort32;
		for (@Pc(137) int local137 = 0; local137 < this.anInt992; local137++) {
			@Pc(146) int local146 = this.anIntArray87[local137] - arg2;
			if (local120 <= local146 && local123 >= local146) {
				@Pc(170) int local170 = this.anIntArray85[local137] - arg1;
				if (local170 >= local126 && local170 <= local129) {
					@Pc(190) int local190 = this.anIntArray89[local137] - arg3;
					if (local132 <= local190 && local190 <= local135) {
						@Pc(208) int local208 = -1;
						@Pc(213) int local213 = this.anIntArray90[local137];
						@Pc(220) int local220 = this.anIntArray90[local137 + 1];
						for (@Pc(222) int local222 = local213; local222 < local220; local222++) {
							local208 = this.aShortArray9[local222] - 1;
							if (local208 == -1 || this.aByteArray7[local208] != 0) {
								break;
							}
						}
						if (local208 != -1) {
							for (@Pc(262) int local262 = 0; local262 < local24; local262++) {
								if (local170 == local27[local262] && local33[local262] == local190 && local30[local262] == local146) {
									local213 = local106[local262];
									local220 = local106[local262 + 1];
									@Pc(301) int local301 = -1;
									for (@Pc(303) int local303 = local213; local303 < local220; local303++) {
										local301 = local109[local303] - 1;
										if (local301 == -1 || local45[local301] != 0) {
											break;
										}
									}
									if (local301 != -1) {
										if (local60 == null) {
											this.aClass284_1 = new Class284();
											local60 = this.aClass284_1.aShortArray126 = Static394.method5844(this.aShortArray12);
											local56 = this.aClass284_1.aShortArray127 = Static394.method5844(this.aShortArray13);
											local64 = this.aClass284_1.aShortArray125 = Static394.method5844(this.aShortArray7);
											local52 = this.aClass284_1.aByteArray97 = Static681.method9203(this.aByteArray7);
										}
										if (local93 == null) {
											@Pc(392) Class284 local392 = local8.aClass284_1 = new Class284();
											local93 = local392.aShortArray126 = Static394.method5844(local36);
											local81 = local392.aShortArray127 = Static394.method5844(local39);
											local89 = local392.aShortArray125 = Static394.method5844(local42);
											local85 = local392.aByteArray97 = Static681.method9203(local45);
										}
										@Pc(425) short local425 = this.aShortArray12[local208];
										@Pc(430) short local430 = this.aShortArray13[local208];
										@Pc(435) short local435 = this.aShortArray7[local208];
										local213 = local106[local262];
										@Pc(444) byte local444 = this.aByteArray7[local208];
										local220 = local106[local262 + 1];
										@Pc(460) int local460;
										for (@Pc(452) int local452 = local213; local452 < local220; local452++) {
											local460 = local109[local452] - 1;
											if (local460 == -1) {
												break;
											}
											if (local85[local460] != 0) {
												local93[local460] += local425;
												local81[local460] += local430;
												local89[local460] += local435;
												local85[local460] += local444;
											}
										}
										local435 = local42[local301];
										local220 = this.anIntArray90[local137 + 1];
										local213 = this.anIntArray90[local137];
										local444 = local45[local301];
										local430 = local39[local301];
										local425 = local36[local301];
										for (local460 = local213; local460 < local220; local460++) {
											@Pc(551) int local551 = this.aShortArray9[local460] - 1;
											if (local551 == -1) {
												break;
											}
											if (local52[local551] != 0) {
												local60[local551] += local425;
												local56[local551] += local430;
												local64[local551] += local435;
												local52[local551] += local444;
											}
										}
										if (this.aClass170_2 == null && this.aClass170_4 != null) {
											this.aClass170_4.anInterface13_4 = null;
										}
										if (this.aClass170_2 != null) {
											this.aClass170_2.anInterface13_4 = null;
										}
										if (local8.aClass170_2 == null && local8.aClass170_4 != null) {
											local8.aClass170_4.anInterface13_4 = null;
										}
										if (local8.aClass170_2 != null) {
											local8.aClass170_2.anInterface13_4 = null;
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

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!gw;)V")
	@Override
	public void method5750(@OriginalArg(0) Class86 arg0) {
		@Pc(8) Class86_Sub1 local8 = (Class86_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass364Array1 != null) {
			for (local13 = 0; local13 < this.aClass364Array1.length; local13++) {
				@Pc(20) Class364 local20 = this.aClass364Array1[local13];
				@Pc(22) Class364 local22 = local20;
				if (local20.aClass364_1 != null) {
					local22 = local20.aClass364_1;
				}
				local22.anInt9825 = (int) ((float) this.anIntArray87[local20.anInt9816] * local8.aFloat11 + (float) this.anIntArray85[local20.anInt9816] * local8.aFloat17 + (float) this.anIntArray89[local20.anInt9816] * local8.aFloat14 + local8.aFloat21);
				local22.anInt9819 = (int) (local8.aFloat13 + local8.aFloat16 * (float) this.anIntArray87[local20.anInt9816] + (float) this.anIntArray85[local20.anInt9816] * local8.aFloat15 + (float) this.anIntArray89[local20.anInt9816] * local8.aFloat18);
				local22.anInt9826 = (int) (local8.aFloat22 + local8.aFloat20 * (float) this.anIntArray87[local20.anInt9816] + (float) this.anIntArray85[local20.anInt9816] * local8.aFloat12 + (float) this.anIntArray89[local20.anInt9816] * local8.aFloat19);
				local22.anInt9820 = (int) ((float) this.anIntArray89[local20.anInt9818] * local8.aFloat14 + local8.aFloat11 * (float) this.anIntArray87[local20.anInt9818] + (float) this.anIntArray85[local20.anInt9818] * local8.aFloat17 + local8.aFloat21);
				local22.anInt9832 = (int) ((float) this.anIntArray85[local20.anInt9818] * local8.aFloat15 + (float) this.anIntArray87[local20.anInt9818] * local8.aFloat16 + local8.aFloat18 * (float) this.anIntArray89[local20.anInt9818] + local8.aFloat13);
				local22.anInt9821 = (int) (local8.aFloat22 + local8.aFloat12 * (float) this.anIntArray85[local20.anInt9818] + local8.aFloat20 * (float) this.anIntArray87[local20.anInt9818] + (float) this.anIntArray89[local20.anInt9818] * local8.aFloat19);
				local22.anInt9827 = (int) (local8.aFloat21 + (float) this.anIntArray89[local20.anInt9822] * local8.aFloat14 + local8.aFloat17 * (float) this.anIntArray85[local20.anInt9822] + (float) this.anIntArray87[local20.anInt9822] * local8.aFloat11);
				local22.anInt9831 = (int) ((float) this.anIntArray89[local20.anInt9822] * local8.aFloat18 + (float) this.anIntArray85[local20.anInt9822] * local8.aFloat15 + (float) this.anIntArray87[local20.anInt9822] * local8.aFloat16 + local8.aFloat13);
				local22.anInt9830 = (int) (local8.aFloat22 + local8.aFloat20 * (float) this.anIntArray87[local20.anInt9822] + (float) this.anIntArray85[local20.anInt9822] * local8.aFloat12 + local8.aFloat19 * (float) this.anIntArray89[local20.anInt9822]);
			}
		}
		if (this.aClass363Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass363Array1.length; local13++) {
			@Pc(363) Class363 local363 = this.aClass363Array1[local13];
			@Pc(365) Class363 local365 = local363;
			if (local363.aClass363_2 != null) {
				local365 = local363.aClass363_2;
			}
			if (local363.aClass86_10 == null) {
				local363.aClass86_10 = local8.method7018();
			} else {
				local363.aClass86_10.method7032(local8);
			}
			local365.anInt9786 = (int) (local8.aFloat21 + (float) this.anIntArray89[local363.anInt9789] * local8.aFloat14 + (float) this.anIntArray85[local363.anInt9789] * local8.aFloat17 + (float) this.anIntArray87[local363.anInt9789] * local8.aFloat11);
			local365.anInt9783 = (int) ((float) this.anIntArray89[local363.anInt9789] * local8.aFloat18 + local8.aFloat16 * (float) this.anIntArray87[local363.anInt9789] + local8.aFloat15 * (float) this.anIntArray85[local363.anInt9789] + local8.aFloat13);
			local365.anInt9787 = (int) (local8.aFloat22 + (float) this.anIntArray87[local363.anInt9789] * local8.aFloat20 + local8.aFloat12 * (float) this.anIntArray85[local363.anInt9789] + (float) this.anIntArray89[local363.anInt9789] * local8.aFloat19);
		}
	}

	@OriginalMember(owner = "client!bm", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass145_Sub3_3.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt940; local11++) {
			if (arg0 == this.aShortArray5[local11]) {
				this.aShortArray5[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(53) Class8 local53 = local9.method2857(arg0 & 0xFFFF);
			local39 = local53.aByte13;
			local41 = local53.aByte12;
		}
		@Pc(61) byte local61 = 0;
		@Pc(63) byte local63 = 0;
		if (arg1 != -1) {
			@Pc(73) Class8 local73 = local9.method2857(arg1 & 0xFFFF);
			local61 = local73.aByte13;
			local63 = local73.aByte12;
			if (local73.aByte16 != 0 || local73.aByte14 != 0) {
				this.aBoolean119 = true;
			}
		}
		if (!(local63 != local41 | local39 != local61)) {
			return;
		}
		if (this.aClass265Array1 != null) {
			for (@Pc(125) int local125 = 0; local125 < this.anInt971; local125++) {
				@Pc(132) Class265 local132 = this.aClass265Array1[local125];
				@Pc(137) Class98 local137 = this.aClass98Array1[local125];
				local137.anInt2460 = local137.anInt2460 & 0xFF000000 | Static555.anIntArray633[this.aShortArray11[local132.anInt7118] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "()V")
	@Override
	protected void method5747() {
	}

	@OriginalMember(owner = "client!bm", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
		this.aShort36 = (short) arg0;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!gw;Lclient!fa;I)V")
	@Override
	public void method5769(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class4_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt994 == 0) {
			return;
		}
		@Pc(14) Class86_Sub1 local14 = this.aClass145_Sub3_3.aClass86_Sub1_3;
		@Pc(17) Class86_Sub1 local17 = (Class86_Sub1) arg0;
		if (!this.aBoolean121) {
			this.method905();
		}
		Static165.aFloat26 = local14.aFloat22 + local14.aFloat12 * local17.aFloat21 + local14.aFloat20 * local17.aFloat13 + local17.aFloat22 * local14.aFloat19;
		Static350.aFloat71 = local14.aFloat20 * local17.aFloat16 + local17.aFloat11 * local14.aFloat12 + local14.aFloat19 * local17.aFloat20;
		@Pc(72) float local72 = Static350.aFloat71 * (float) this.aShort29 + Static165.aFloat26;
		@Pc(80) float local80 = (float) this.aShort31 * Static350.aFloat71 + Static165.aFloat26;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = (float) -this.aShort28 + local80;
			local97 = local72 + (float) this.aShort28;
		} else {
			local91 = (float) -this.aShort28 + local72;
			local97 = local80 + (float) this.aShort28;
		}
		if (local91 >= this.aClass145_Sub3_3.aFloat161 || local97 <= (float) this.aClass145_Sub3_3.anInt10164) {
			return;
		}
		Static392.aFloat109 = local17.aFloat11 * local14.aFloat17 + local14.aFloat11 * local17.aFloat16 + local17.aFloat20 * local14.aFloat14;
		Static266.aFloat50 = local17.aFloat21 * local14.aFloat17 + local14.aFloat11 * local17.aFloat13 + local14.aFloat14 * local17.aFloat22 + local14.aFloat21;
		@Pc(176) float local176 = (float) this.aShort29 * Static392.aFloat109 + Static266.aFloat50;
		@Pc(184) float local184 = Static266.aFloat50 + Static392.aFloat109 * (float) this.aShort31;
		@Pc(210) float local210;
		@Pc(199) float local199;
		if (local184 < local176) {
			local199 = (float) this.aClass145_Sub3_3.anInt10169 * (local176 + (float) this.aShort28);
			local210 = (float) this.aClass145_Sub3_3.anInt10169 * (local184 - (float) this.aShort28);
		} else {
			local210 = (float) this.aClass145_Sub3_3.anInt10169 * (local176 - (float) this.aShort28);
			local199 = (float) this.aClass145_Sub3_3.anInt10169 * (local184 + (float) this.aShort28);
		}
		if (this.aClass145_Sub3_3.aFloat154 <= local210 / local97 || this.aClass145_Sub3_3.aFloat155 >= local199 / local97) {
			return;
		}
		Static324.aFloat69 = local14.aFloat18 * local17.aFloat20 + local14.aFloat16 * local17.aFloat16 + local17.aFloat11 * local14.aFloat15;
		Static135.aFloat23 = local14.aFloat18 * local17.aFloat22 + local14.aFloat15 * local17.aFloat21 + local14.aFloat16 * local17.aFloat13 + local14.aFloat13;
		@Pc(301) float local301 = (float) this.aShort29 * Static324.aFloat69 + Static135.aFloat23;
		@Pc(309) float local309 = Static324.aFloat69 * (float) this.aShort31 + Static135.aFloat23;
		@Pc(335) float local335;
		@Pc(324) float local324;
		if (local309 < local301) {
			local335 = ((float) -this.aShort28 + local309) * (float) this.aClass145_Sub3_3.anInt10158;
			local324 = (local301 + (float) this.aShort28) * (float) this.aClass145_Sub3_3.anInt10158;
		} else {
			local324 = (float) this.aClass145_Sub3_3.anInt10158 * ((float) this.aShort28 + local309);
			local335 = (local301 - (float) this.aShort28) * (float) this.aClass145_Sub3_3.anInt10158;
		}
		if (local335 / local97 >= this.aClass145_Sub3_3.aFloat159 || local324 / local97 <= this.aClass145_Sub3_3.aFloat172) {
			return;
		}
		if (arg1 != null || this.aClass265Array1 != null) {
			Static168.aFloat28 = local14.aFloat12 * local17.aFloat14 + local14.aFloat20 * local17.aFloat18 + local14.aFloat19 * local17.aFloat19;
			Static98.aFloat7 = local14.aFloat20 * local17.aFloat15 + local14.aFloat12 * local17.aFloat17 + local14.aFloat19 * local17.aFloat12;
			Static432.aFloat115 = local14.aFloat16 * local17.aFloat18 + local17.aFloat14 * local14.aFloat15 + local14.aFloat18 * local17.aFloat19;
			Static658.aFloat141 = local14.aFloat17 * local17.aFloat17 + local17.aFloat15 * local14.aFloat11 + local14.aFloat14 * local17.aFloat12;
			Static716.aFloat177 = local17.aFloat17 * local14.aFloat15 + local17.aFloat15 * local14.aFloat16 + local14.aFloat18 * local17.aFloat12;
			Static114.aFloat9 = local14.aFloat14 * local17.aFloat19 + local17.aFloat14 * local14.aFloat17 + local14.aFloat11 * local17.aFloat18;
		}
		if (arg1 != null) {
			@Pc(501) boolean local501 = false;
			@Pc(503) boolean local503 = true;
			@Pc(511) int local511 = this.aShort34 + this.aShort37 >> 1;
			@Pc(519) int local519 = this.aShort33 + this.aShort32 >> 1;
			@Pc(538) int local538 = (int) (Static266.aFloat50 + Static658.aFloat141 * (float) local511 + Static392.aFloat109 * (float) this.aShort29 + Static114.aFloat9 * (float) local519);
			@Pc(557) int local557 = (int) (Static432.aFloat115 * (float) local519 + (float) local511 * Static716.aFloat177 + Static135.aFloat23 + Static324.aFloat69 * (float) this.aShort29);
			@Pc(576) int local576 = (int) (Static168.aFloat28 * (float) local519 + Static350.aFloat71 * (float) this.aShort29 + (float) local511 * Static98.aFloat7 + Static165.aFloat26);
			if (this.aClass145_Sub3_3.anInt10164 <= local576) {
				arg1.anInt2724 = local538 * this.aClass145_Sub3_3.anInt10169 / local576 + this.aClass145_Sub3_3.anInt10173;
				arg1.anInt2725 = this.aClass145_Sub3_3.anInt10158 * local557 / local576 + this.aClass145_Sub3_3.anInt10178;
			} else {
				local501 = true;
			}
			@Pc(632) int local632 = (int) ((float) local519 * Static114.aFloat9 + Static392.aFloat109 * (float) this.aShort31 + Static266.aFloat50 + (float) local511 * Static658.aFloat141);
			@Pc(651) int local651 = (int) (Static432.aFloat115 * (float) local519 + Static324.aFloat69 * (float) this.aShort31 + Static716.aFloat177 * (float) local511 + Static135.aFloat23);
			@Pc(670) int local670 = (int) ((float) local511 * Static98.aFloat7 + Static165.aFloat26 + Static350.aFloat71 * (float) this.aShort31 + Static168.aFloat28 * (float) local519);
			if (local670 >= this.aClass145_Sub3_3.anInt10164) {
				arg1.anInt2726 = local651 * this.aClass145_Sub3_3.anInt10158 / local670 + this.aClass145_Sub3_3.anInt10178;
				arg1.anInt2722 = this.aClass145_Sub3_3.anInt10173 + this.aClass145_Sub3_3.anInt10169 * local632 / local670;
			} else {
				local501 = true;
			}
			if (local501) {
				if (local576 < this.aClass145_Sub3_3.anInt10164 && local670 < this.aClass145_Sub3_3.anInt10164) {
					local503 = false;
				} else {
					@Pc(752) int local752;
					@Pc(762) int local762;
					@Pc(789) int local789;
					if (this.aClass145_Sub3_3.anInt10164 > local576) {
						local752 = (local670 - this.aClass145_Sub3_3.anInt10164 << 16) / (local670 - local576);
						local762 = (local752 * (local632 - local538) >> 16) + local632;
						arg1.anInt2724 = this.aClass145_Sub3_3.anInt10173 + local762 * this.aClass145_Sub3_3.anInt10169 / this.aClass145_Sub3_3.anInt10164;
						local789 = (local752 * (local651 - local557) >> 16) + local651;
						arg1.anInt2725 = this.aClass145_Sub3_3.anInt10158 * local789 / this.aClass145_Sub3_3.anInt10164 + this.aClass145_Sub3_3.anInt10178;
					} else if (local670 < this.aClass145_Sub3_3.anInt10164) {
						local752 = (local576 - this.aClass145_Sub3_3.anInt10164 << 16) / (local576 - local670);
						local762 = local538 + (local752 * (local538 - local632) >> 16);
						local789 = local557 + ((local557 - local651) * local752 >> 16);
						arg1.anInt2724 = this.aClass145_Sub3_3.anInt10173 + local762 * this.aClass145_Sub3_3.anInt10169 / this.aClass145_Sub3_3.anInt10164;
						arg1.anInt2725 = this.aClass145_Sub3_3.anInt10158 * local789 / this.aClass145_Sub3_3.anInt10164 + this.aClass145_Sub3_3.anInt10178;
					}
				}
			}
			if (local503) {
				if (local576 <= local670) {
					arg1.anInt2723 = this.aClass145_Sub3_3.anInt10173 + this.aClass145_Sub3_3.anInt10169 * (this.aShort28 + local632) / local670 - arg1.anInt2722;
				} else {
					arg1.anInt2723 = this.aClass145_Sub3_3.anInt10169 * (local538 + this.aShort28) / local576 + this.aClass145_Sub3_3.anInt10173 - arg1.anInt2724;
				}
				arg1.aBoolean269 = true;
			}
		}
		this.aClass145_Sub3_3.method8888();
		this.aClass145_Sub3_3.method8865(local17);
		this.method899();
		this.aClass145_Sub3_3.method8848();
		this.method897();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		for (@Pc(7) int local7 = 0; local7 < this.anInt940; local7++) {
			local18 = this.aShortArray11[local7] & 0xFFFF;
			@Pc(24) int local24 = local18 >> 10 & 0x3F;
			@Pc(30) int local30 = local18 >> 7 & 0x7;
			@Pc(34) int local34 = local18 & 0x7F;
			if (arg0 != -1) {
				local24 += (arg0 - local24) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local30 += (arg1 - local30) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local34 -= -(arg3 * (arg2 - local34) >> 7);
			}
			this.aShortArray11[local7] = (short) (local30 << 7 | local24 << 10 | local34);
		}
		if (this.aClass265Array1 != null) {
			for (local18 = 0; local18 < this.anInt971; local18++) {
				@Pc(111) Class265 local111 = this.aClass265Array1[local18];
				@Pc(116) Class98 local116 = this.aClass98Array1[local18];
				local116.anInt2460 = local116.anInt2460 & 0xFF000000 | Static555.anIntArray633[this.aShortArray11[local111.anInt7118] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!bm", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!kja;B)V")
	private void method900(@OriginalArg(0) Class2_Sub6_Sub9_Sub1 arg0) {
		if (this.anInt994 > this.aClass145_Sub3_3.anIntArray716.length) {
			this.aClass145_Sub3_3.anIntArray715 = new int[this.anInt994];
			this.aClass145_Sub3_3.anIntArray716 = new int[this.anInt994];
		}
		@Pc(30) int[] local30 = this.aClass145_Sub3_3.anIntArray716;
		@Pc(34) int[] local34 = this.aClass145_Sub3_3.anIntArray715;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(36) int local36 = 0; local36 < this.anInt992; local36++) {
			local65 = (this.anIntArray85[local36] - (this.anIntArray87[local36] * this.aClass145_Sub3_3.anInt10171 >> 8) >> this.aClass145_Sub3_3.anInt10144) - arg0.anInt5106;
			@Pc(89) int local89 = (this.anIntArray89[local36] - (this.anIntArray87[local36] * this.aClass145_Sub3_3.anInt10170 >> 8) >> this.aClass145_Sub3_3.anInt10144) - arg0.anInt5102;
			@Pc(94) int local94 = this.anIntArray90[local36];
			@Pc(101) int local101 = this.anIntArray90[local36 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray9[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local30[local112] = local65;
				local34[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt950; local65++) {
			if (this.aByteArray6 == null || this.aByteArray6[local65] <= 128) {
				@Pc(167) short local167 = this.aShortArray14[local65];
				@Pc(172) short local172 = this.aShortArray4[local65];
				@Pc(177) short local177 = this.aShortArray6[local65];
				local103 = local30[local167];
				local112 = local30[local172];
				@Pc(189) int local189 = local30[local177];
				@Pc(193) int local193 = local34[local167];
				@Pc(197) int local197 = local34[local172];
				@Pc(201) int local201 = local34[local177];
				if ((local103 - local112) * (local197 - local201) - (local189 - local112) * (local197 + -local193) > 0) {
					arg0.method4633(local193, local201, local112, local189, local103, local197);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt992; local3++) {
			if (arg0 != 128) {
				this.anIntArray85[local3] = arg0 * this.anIntArray85[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray87[local3] = this.anIntArray87[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray89[local3] = arg2 * this.anIntArray89[local3] >> 7;
			}
		}
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
		this.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!bm", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub9 ba(@OriginalArg(0) Class2_Sub6_Sub9 arg0) {
		if (this.anInt994 == 0) {
			return null;
		}
		if (!this.aBoolean121) {
			this.method905();
		}
		@Pc(46) int local46;
		@Pc(63) int local63;
		if (this.aClass145_Sub3_3.anInt10171 > 0) {
			local46 = this.aShort37 - (this.aShort31 * this.aClass145_Sub3_3.anInt10171 >> 8) >> this.aClass145_Sub3_3.anInt10144;
			local63 = this.aShort34 - (this.aShort29 * this.aClass145_Sub3_3.anInt10171 >> 8) >> this.aClass145_Sub3_3.anInt10144;
		} else {
			local46 = this.aShort37 - (this.aClass145_Sub3_3.anInt10171 * this.aShort29 >> 8) >> this.aClass145_Sub3_3.anInt10144;
			local63 = this.aShort34 - (this.aShort31 * this.aClass145_Sub3_3.anInt10171 >> 8) >> this.aClass145_Sub3_3.anInt10144;
		}
		@Pc(119) int local119;
		@Pc(136) int local136;
		if (this.aClass145_Sub3_3.anInt10170 > 0) {
			local119 = this.aShort33 - (this.aClass145_Sub3_3.anInt10170 * this.aShort31 >> 8) >> this.aClass145_Sub3_3.anInt10144;
			local136 = this.aShort32 - (this.aShort29 * this.aClass145_Sub3_3.anInt10170 >> 8) >> this.aClass145_Sub3_3.anInt10144;
		} else {
			local119 = this.aShort33 - (this.aClass145_Sub3_3.anInt10170 * this.aShort29 >> 8) >> this.aClass145_Sub3_3.anInt10144;
			local136 = this.aShort32 - (this.aClass145_Sub3_3.anInt10170 * this.aShort31 >> 8) >> this.aClass145_Sub3_3.anInt10144;
		}
		@Pc(178) int local178 = local63 + 1 - local46;
		@Pc(185) int local185 = local136 + 1 - local119;
		@Pc(188) Class2_Sub6_Sub9_Sub1 local188 = (Class2_Sub6_Sub9_Sub1) arg0;
		@Pc(206) Class2_Sub6_Sub9_Sub1 local206;
		if (local188 != null && local188.method4629(local178, local185)) {
			local206 = local188;
			local188.method4631();
		} else {
			local206 = new Class2_Sub6_Sub9_Sub1(this.aClass145_Sub3_3, local178, local185);
		}
		local206.method4634(local46, local119, local136, local63);
		this.method900(local206);
		return local206;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IZLclient!gw;IIII)Z")
	private boolean method901(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class86_Sub1 local8 = (Class86_Sub1) arg2;
		@Pc(12) Class86_Sub1 local12 = this.aClass145_Sub3_3.aClass86_Sub1_3;
		@Pc(33) float local33 = local12.aFloat21 + local12.aFloat17 * local8.aFloat21 + local12.aFloat11 * local8.aFloat13 + local8.aFloat22 * local12.aFloat14;
		@Pc(54) float local54 = local12.aFloat13 + local12.aFloat18 * local8.aFloat22 + local8.aFloat13 * local12.aFloat16 + local12.aFloat15 * local8.aFloat21;
		Static392.aFloat109 = local12.aFloat17 * local8.aFloat11 + local8.aFloat16 * local12.aFloat11 + local8.aFloat20 * local12.aFloat14;
		Static432.aFloat115 = local12.aFloat18 * local8.aFloat19 + local8.aFloat14 * local12.aFloat15 + local8.aFloat18 * local12.aFloat16;
		Static114.aFloat9 = local12.aFloat14 * local8.aFloat19 + local12.aFloat11 * local8.aFloat18 + local8.aFloat14 * local12.aFloat17;
		Static324.aFloat69 = local8.aFloat20 * local12.aFloat18 + local8.aFloat16 * local12.aFloat16 + local8.aFloat11 * local12.aFloat15;
		Static168.aFloat28 = local12.aFloat20 * local8.aFloat18 + local8.aFloat14 * local12.aFloat12 + local8.aFloat19 * local12.aFloat19;
		Static658.aFloat141 = local8.aFloat17 * local12.aFloat17 + local12.aFloat11 * local8.aFloat15 + local8.aFloat12 * local12.aFloat14;
		@Pc(183) float local183 = local12.aFloat22 + local8.aFloat21 * local12.aFloat12 + local12.aFloat20 * local8.aFloat13 + local8.aFloat22 * local12.aFloat19;
		Static98.aFloat7 = local8.aFloat12 * local12.aFloat19 + local8.aFloat17 * local12.aFloat12 + local12.aFloat20 * local8.aFloat15;
		Static350.aFloat71 = local8.aFloat16 * local12.aFloat20 + local8.aFloat11 * local12.aFloat12 + local8.aFloat20 * local12.aFloat19;
		Static716.aFloat177 = local12.aFloat18 * local8.aFloat12 + local12.aFloat15 * local8.aFloat17 + local8.aFloat15 * local12.aFloat16;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass145_Sub3_3.anInt10169;
		@Pc(255) int local255 = this.aClass145_Sub3_3.anInt10158;
		if (!this.aBoolean121) {
			this.method905();
		}
		@Pc(272) int local272 = this.aShort34 - this.aShort37 >> 1;
		@Pc(281) int local281 = this.aShort31 - this.aShort29 >> 1;
		@Pc(289) int local289 = this.aShort32 - this.aShort33 >> 1;
		@Pc(294) int local294 = this.aShort37 + local272;
		@Pc(300) int local300 = this.aShort29 + local281;
		@Pc(305) int local305 = local289 + this.aShort33;
		@Pc(311) int local311 = local294 - (local272 << arg5);
		@Pc(318) int local318 = local300 - (local281 << arg5);
		@Pc(325) int local325 = local305 - (local289 << arg5);
		@Pc(331) int local331 = local294 + (local272 << arg5);
		@Pc(337) int local337 = (local281 << arg5) + local300;
		@Pc(343) int local343 = local305 + (local289 << arg5);
		Static248.anIntArray294[0] = local311;
		Static172.anIntArray224[0] = local318;
		Static385.anIntArray420[0] = local325;
		Static248.anIntArray294[1] = local331;
		Static172.anIntArray224[1] = local318;
		Static248.anIntArray294[2] = local311;
		Static385.anIntArray420[1] = local325;
		Static172.anIntArray224[2] = local337;
		Static248.anIntArray294[3] = local331;
		Static385.anIntArray420[2] = local325;
		Static172.anIntArray224[3] = local337;
		Static385.anIntArray420[3] = local325;
		Static248.anIntArray294[4] = local311;
		Static172.anIntArray224[4] = local318;
		Static385.anIntArray420[4] = local343;
		Static248.anIntArray294[5] = local331;
		Static172.anIntArray224[5] = local318;
		Static385.anIntArray420[5] = local343;
		Static248.anIntArray294[6] = local311;
		Static172.anIntArray224[6] = local337;
		Static385.anIntArray420[6] = local343;
		Static248.anIntArray294[7] = local331;
		Static172.anIntArray224[7] = local337;
		Static385.anIntArray420[7] = local343;
		@Pc(502) float local502;
		@Pc(474) float local474;
		@Pc(488) float local488;
		@Pc(455) float local455;
		@Pc(450) float local450;
		@Pc(460) float local460;
		for (@Pc(441) int local441 = 0; local441 < 8; local441++) {
			local450 = (float) Static172.anIntArray224[local441];
			local455 = (float) Static248.anIntArray294[local441];
			local460 = (float) Static385.anIntArray420[local441];
			local474 = local54 + local450 * Static324.aFloat69 + Static716.aFloat177 * local455 + Static432.aFloat115 * local460;
			local488 = local460 * Static168.aFloat28 + local450 * Static350.aFloat71 + local455 * Static98.aFloat7 + local183;
			local502 = local33 + local450 * Static392.aFloat109 + local455 * Static658.aFloat141 + Static114.aFloat9 * local460;
			if (local488 >= (float) this.aClass145_Sub3_3.anInt10164) {
				if (arg4 > 0) {
					local488 = (float) arg4;
				}
				@Pc(528) float local528 = local502 * (float) local251 / local488 + (float) this.aClass145_Sub3_3.anInt10173;
				if (local528 < local241) {
					local241 = local528;
				}
				@Pc(546) float local546 = local474 * (float) local255 / local488 + (float) this.aClass145_Sub3_3.anInt10178;
				if (local243 < local528) {
					local243 = local528;
				}
				local239 = true;
				if (local245 > local546) {
					local245 = local546;
				}
				if (local546 > local247) {
					local247 = local546;
				}
			}
		}
		if (local239 && (float) arg3 > local241 && local243 > (float) arg3 && local245 < (float) arg0 && (float) arg0 < local247) {
			if (arg1) {
				return true;
			}
			if (this.anInt994 > this.aClass145_Sub3_3.anIntArray716.length) {
				this.aClass145_Sub3_3.anIntArray716 = new int[this.anInt994];
				this.aClass145_Sub3_3.anIntArray715 = new int[this.anInt994];
			}
			@Pc(642) int[] local642 = this.aClass145_Sub3_3.anIntArray716;
			@Pc(646) int[] local646 = this.aClass145_Sub3_3.anIntArray715;
			@Pc(742) int local742;
			for (@Pc(648) int local648 = 0; local648 < this.anInt992; local648++) {
				local450 = (float) this.anIntArray87[local648];
				local460 = (float) this.anIntArray89[local648];
				local455 = (float) this.anIntArray85[local648];
				local474 = local54 + Static432.aFloat115 * local460 + local455 * Static716.aFloat177 + Static324.aFloat69 * local450;
				local502 = Static392.aFloat109 * local450 + Static658.aFloat141 * local455 + local460 * Static114.aFloat9 + local33;
				local488 = Static168.aFloat28 * local460 + local450 * Static350.aFloat71 + local455 * Static98.aFloat7 + local183;
				@Pc(755) int local755;
				@Pc(760) int local760;
				@Pc(767) int local767;
				if (local488 >= (float) this.aClass145_Sub3_3.anInt10164) {
					if (arg4 > 0) {
						local488 = (float) arg4;
					}
					local742 = (int) ((float) this.aClass145_Sub3_3.anInt10173 + local502 * (float) local251 / local488);
					local755 = (int) ((float) this.aClass145_Sub3_3.anInt10178 + (float) local255 * local474 / local488);
					local760 = this.anIntArray90[local648];
					local767 = this.anIntArray90[local648 + 1];
					for (@Pc(769) int local769 = local760; local769 < local767; local769++) {
						@Pc(778) int local778 = this.aShortArray9[local769] - 1;
						if (local778 == -1) {
							break;
						}
						local642[local778] = local742;
						local646[local778] = local755;
					}
				} else {
					local742 = this.anIntArray90[local648];
					local755 = this.anIntArray90[local648 + 1];
					for (local760 = local742; local760 < local755; local760++) {
						local767 = this.aShortArray9[local760] - 1;
						if (local767 == -1) {
							break;
						}
						local642[this.aShortArray9[local760] - 1] = -999999;
					}
				}
			}
			for (local742 = 0; local742 < this.anInt940; local742++) {
				if (local642[this.aShortArray14[local742]] != -999999 && local642[this.aShortArray4[local742]] != -999999 && local642[this.aShortArray6[local742]] != -999999 && this.method903(local642[this.aShortArray4[local742]], arg0, local642[this.aShortArray6[local742]], local646[this.aShortArray14[local742]], local646[this.aShortArray4[local742]], local642[this.aShortArray14[local742]], local646[this.aShortArray6[local742]], arg3)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt953 = arg0;
		if (this.aClass284_1 != null && (this.anInt953 & 0x10000) == 0) {
			this.aShortArray13 = this.aClass284_1.aShortArray127;
			this.aShortArray7 = this.aClass284_1.aShortArray125;
			this.aByteArray7 = this.aClass284_1.aByteArray97;
			this.aShortArray12 = this.aClass284_1.aShortArray126;
			this.aClass284_1 = null;
		}
		this.aBoolean122 = true;
		this.method896();
	}

	@OriginalMember(owner = "client!bm", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt992; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray85[local15] + local9 * this.anIntArray87[local15] >> 14;
			this.anIntArray87[local15] = this.anIntArray87[local15] * local13 - local9 * this.anIntArray85[local15] >> 14;
			this.anIntArray85[local15] = local33;
		}
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
		this.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class45 method5768(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) boolean local5 = false;
		@Pc(25) Class45_Sub1 local25;
		@Pc(24) Class45_Sub1 local24;
		if (arg0 > 0 && arg0 <= 7) {
			local24 = this.aClass145_Sub3_3.aClass45_Sub1Array1[arg0 - 1];
			local25 = this.aClass145_Sub3_3.aClass45_Sub1Array2[arg0 - 1];
			local5 = true;
		} else {
			local25 = local24 = new Class45_Sub1(this.aClass145_Sub3_3);
		}
		return this.method895(arg2, local25, local5, local24, arg1);
	}

	@OriginalMember(owner = "client!bm", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray4 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt993; local13++) {
			this.anIntArray85[local13] <<= 0x4;
			this.anIntArray87[local13] <<= 0x4;
			this.anIntArray89[local13] <<= 0x4;
		}
		Static583.anInt2353 = 0;
		Static27.anInt379 = 0;
		Static403.anInt6653 = 0;
		return true;
	}

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt992; local15++) {
			local33 = this.anIntArray85[local15] * local13 + local9 * this.anIntArray89[local15] >> 14;
			this.anIntArray89[local15] = this.anIntArray89[local15] * local13 - this.anIntArray85[local15] * local9 >> 14;
			this.anIntArray85[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt994; local33++) {
			@Pc(85) int local85 = local9 * this.aShortArray7[local33] + this.aShortArray12[local33] * local13 >> 14;
			this.aShortArray7[local33] = (short) (this.aShortArray7[local33] * local13 - this.aShortArray12[local33] * local9 >> 14);
			this.aShortArray12[local33] = (short) local85;
		}
		if (this.aClass170_2 == null && this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
		if (this.aClass170_2 != null) {
			this.aClass170_2.anInterface13_4 = null;
		}
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
		this.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!bm", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt992; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray87[local15] - local9 * this.anIntArray89[local15] >> 14;
			this.anIntArray89[local15] = local9 * this.anIntArray87[local15] + this.anIntArray89[local15] * local13 >> 14;
			this.anIntArray87[local15] = local33;
		}
		this.aBoolean121 = false;
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "()V")
	@Override
	protected void method5746() {
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZI)V")
	private void method902(@OriginalArg(0) boolean arg0) {
		if (this.anInt950 * 6 <= this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3.aByteArray111.length) {
			this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3.anInt9723 = 0;
		} else {
			this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3 = new Class2_Sub20_Sub1(this.anInt950 * 6 + 600);
		}
		@Pc(42) Class2_Sub20_Sub1 local42 = this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3;
		@Pc(56) int local56;
		if (this.aClass145_Sub3_3.aBoolean872) {
			for (local56 = 0; local56 < this.anInt950; local56++) {
				local42.method8551(this.aShortArray14[local56]);
				local42.method8551(this.aShortArray4[local56]);
				local42.method8551(this.aShortArray6[local56]);
			}
		} else {
			for (local56 = 0; local56 < this.anInt950; local56++) {
				local42.method8589(this.aShortArray14[local56]);
				local42.method8589(this.aShortArray4[local56]);
				local42.method8589(this.aShortArray6[local56]);
			}
		}
		if (local42.anInt9723 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface12_1 == null) {
				this.anInterface12_1 = this.aClass145_Sub3_3.method8911(true, local42.anInt9723, local42.aByteArray111);
			} else {
				this.anInterface12_1.method7099(local42.aByteArray111, local42.anInt9723);
			}
			this.aClass84_1.anInterface12_3 = this.anInterface12_1;
		} else {
			this.aClass84_1.anInterface12_3 = this.aClass145_Sub3_3.method8911(false, local42.anInt9723, local42.aByteArray111);
		}
		if (!arg0) {
			this.aBoolean122 = true;
		}
	}

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class133 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean121) {
			this.method905();
		}
		@Pc(18) int local18 = arg4 + this.aShort37;
		@Pc(23) int local23 = this.aShort34 + arg4;
		@Pc(28) int local28 = this.aShort33 + arg6;
		@Pc(33) int local33 = arg6 + this.aShort32;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9321 + local23 >> arg2.anInt9317 >= arg2.anInt9318 || local28 < 0 || local33 + arg2.anInt9321 >> arg2.anInt9317 >= arg2.anInt9315)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || local23 + arg3.anInt9321 >> arg3.anInt9317 >= arg3.anInt9318 || local28 < 0 || arg3.anInt9315 <= arg3.anInt9321 + local33 >> arg3.anInt9317) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9317;
			local23 = local23 + arg2.anInt9321 - 1 >> arg2.anInt9317;
			local28 >>= arg2.anInt9317;
			local33 = arg2.anInt9321 + local33 - 1 >> arg2.anInt9317;
			if (arg2.method8217(local18, local28) == arg5 && arg5 == arg2.method8217(local23, local28) && arg2.method8217(local18, local33) == arg5 && arg5 == arg2.method8217(local23, local33)) {
				return;
			}
		}
		@Pc(236) int local236;
		if (arg0 == 1) {
			for (local236 = 0; local236 < this.anInt992; local236++) {
				this.anIntArray87[local236] = this.anIntArray87[local236] + arg2.method8214(arg4 + this.anIntArray85[local236], arg6 + this.anIntArray89[local236]) - arg5;
			}
		} else {
			@Pc(244) int local244;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(483) short local483 = this.aShort29;
				if (local483 == 0) {
					return;
				}
				for (local244 = 0; local244 < this.anInt992; local244++) {
					local252 = (this.anIntArray87[local244] << 16) / local483;
					if (arg1 > local252) {
						this.anIntArray87[local244] -= -((arg1 - local252) * (arg2.method8214(this.anIntArray85[local244] + arg4, this.anIntArray89[local244] + arg6) - arg5) / arg1);
					}
				}
			} else {
				@Pc(260) int local260;
				if (arg0 == 3) {
					local236 = (arg1 & 0xFF) * 4;
					local244 = (arg1 >> 8 & 0xFF) * 4;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local260 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local236 >> 1) < 0 || arg2.anInt9321 + arg4 + (local236 >> 1) >= arg2.anInt9318 << arg2.anInt9317 || arg6 - (local244 >> 1) < 0 || arg2.anInt9315 << arg2.anInt9317 <= arg2.anInt9321 + (local244 >> 1) + arg6) {
						return;
					}
					this.method5764(local252, local236, local260, arg5, arg4, local244, arg2, arg6);
				} else if (arg0 == 4) {
					local236 = this.aShort31 - this.aShort29;
					for (local244 = 0; local244 < this.anInt992; local244++) {
						this.anIntArray87[local244] = this.anIntArray87[local244] + arg3.method8214(this.anIntArray85[local244] + arg4, arg6 + this.anIntArray89[local244]) + local236 - arg5;
					}
				} else if (arg0 == 5) {
					local236 = this.aShort31 - this.aShort29;
					for (local244 = 0; local244 < this.anInt992; local244++) {
						local252 = this.anIntArray85[local244] + arg4;
						local260 = arg6 + this.anIntArray89[local244];
						@Pc(433) int local433 = arg2.method8214(local252, local260);
						@Pc(439) int local439 = arg3.method8214(local252, local260);
						@Pc(446) int local446 = local433 - arg1 - local439;
						this.anIntArray87[local244] = ((this.anIntArray87[local244] << 8) / local236 * local446 >> 8) + local433 - arg5;
					}
				}
			}
		}
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
		this.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort37;
	}

	@OriginalMember(owner = "client!bm", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt953;
	}

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean119;
	}

	@OriginalMember(owner = "client!bm", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort36;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method903(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 < arg3 && arg4 > arg1 && arg6 > arg1) {
			return false;
		} else if (arg3 < arg1 && arg4 < arg1 && arg6 < arg1) {
			return false;
		} else if (arg5 > arg7 && arg7 < arg0 && arg7 < arg2) {
			return false;
		} else {
			return arg7 <= arg5 || arg0 >= arg7 || arg7 <= arg2;
		}
	}

	@OriginalMember(owner = "client!bm", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
		this.aShort35 = (short) arg0;
		if (this.aClass170_2 != null) {
			this.aClass170_2.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt992; local7++) {
			this.anIntArray89[local7] = -this.anIntArray89[local7];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt994; local31++) {
			this.aShortArray7[local31] = (short) -this.aShortArray7[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt940; local58++) {
			@Pc(69) short local69 = this.aShortArray14[local58];
			this.aShortArray14[local58] = this.aShortArray6[local58];
			this.aShortArray6[local58] = local69;
		}
		if (this.aClass170_2 == null && this.aClass170_4 != null) {
			this.aClass170_4.anInterface13_4 = null;
		}
		if (this.aClass170_2 != null) {
			this.aClass170_2.anInterface13_4 = null;
		}
		if (this.aClass84_1 != null) {
			this.aClass84_1.anInterface12_3 = null;
		}
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
		this.aBoolean121 = false;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class145_Sub1.anIntArray761[arg0];
		@Pc(13) int local13 = Class145_Sub1.anIntArray760[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt992; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray89[local15] + local13 * this.anIntArray85[local15] >> 14;
			this.anIntArray89[local15] = local13 * this.anIntArray89[local15] - this.anIntArray85[local15] * local9 >> 14;
			this.anIntArray85[local15] = local34;
		}
		this.aBoolean121 = false;
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "()[Lclient!uda;")
	@Override
	public Class364[] method5753() {
		return this.aClass364Array1;
	}

	@OriginalMember(owner = "client!bm", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort35;
	}

	@OriginalMember(owner = "client!bm", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt993; local7++) {
			this.anIntArray85[local7] = this.anIntArray85[local7] + 7 >> 4;
			this.anIntArray87[local7] = this.anIntArray87[local7] + 7 >> 4;
			this.anIntArray89[local7] = this.anIntArray89[local7] + 7 >> 4;
		}
		this.aBoolean121 = false;
		if (this.aClass170_1 != null) {
			this.aClass170_1.anInterface13_4 = null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "()V")
	@Override
	public void method5763() {
		if (this.anInt994 <= 0 || this.anInt950 <= 0) {
			return;
		}
		this.method904(false);
		if ((this.aByte46 & 0x10) == 0 && this.aClass84_1.anInterface12_3 == null) {
			this.method902(false);
		}
		this.method896();
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ZZ)V")
	private void method904(@OriginalArg(1) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass170_4 != null && this.aClass170_4.anInterface13_4 == null;
		@Pc(44) boolean local44 = this.aClass170_2 != null && this.aClass170_2.anInterface13_4 == null;
		@Pc(58) boolean local58 = this.aClass170_1 != null && this.aClass170_1.anInterface13_4 == null;
		@Pc(72) boolean local72 = this.aClass170_3 != null && this.aClass170_3.anInterface13_4 == null;
		if (arg0) {
			local58 &= (this.aByte46 & 0x1) != 0;
			local19 &= (this.aByte46 & 0x2) != 0;
			local72 &= (this.aByte46 & 0x8) != 0;
			local44 &= (this.aByte46 & 0x4) != 0;
		}
		@Pc(132) byte local132 = 0;
		@Pc(136) byte local136 = 0;
		@Pc(138) byte local138 = 0;
		@Pc(140) byte local140 = 0;
		if (local58) {
			local132 = 12;
		}
		if (local19) {
			local136 = local132;
			local132 = (byte) (local132 + 4);
		}
		if (local44) {
			local138 = local132;
			local132 = (byte) (local132 + 12);
		}
		if (local72) {
			local140 = local132;
			local132 = (byte) (local132 + 8);
		}
		if (local132 == 0) {
			return;
		}
		if (this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3.aByteArray111.length >= this.anInt994 * local132) {
			this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3.anInt9723 = 0;
		} else {
			this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3 = new Class2_Sub20_Sub1((this.anInt994 + 100) * local132);
		}
		@Pc(221) Class2_Sub20_Sub1 local221 = this.aClass145_Sub3_3.aClass2_Sub20_Sub1_3;
		@Pc(231) int local231;
		@Pc(240) int local240;
		@Pc(268) int local268;
		@Pc(277) int local277;
		if (local58) {
			@Pc(247) int local247;
			@Pc(254) int local254;
			@Pc(259) int local259;
			@Pc(266) int local266;
			if (this.aClass145_Sub3_3.aBoolean872) {
				for (local231 = 0; local231 < this.anInt992; local231++) {
					local240 = Stream.floatToRawIntBits((float) this.anIntArray85[local231]);
					local247 = Stream.floatToRawIntBits((float) this.anIntArray87[local231]);
					local254 = Stream.floatToRawIntBits((float) this.anIntArray89[local231]);
					local259 = this.anIntArray90[local231];
					local266 = this.anIntArray90[local231 + 1];
					for (local268 = local259; local268 < local266; local268++) {
						local277 = this.aShortArray9[local268] - 1;
						if (local277 == -1) {
							break;
						}
						local221.anInt9723 = local277 * local132;
						local221.method8577(local240);
						local221.method8577(local247);
						local221.method8577(local254);
					}
				}
			} else {
				for (local231 = 0; local231 < this.anInt992; local231++) {
					local240 = Stream.floatToRawIntBits((float) this.anIntArray85[local231]);
					local247 = Stream.floatToRawIntBits((float) this.anIntArray87[local231]);
					local254 = Stream.floatToRawIntBits((float) this.anIntArray89[local231]);
					local259 = this.anIntArray90[local231];
					local266 = this.anIntArray90[local231 + 1];
					for (local268 = local259; local268 < local266; local268++) {
						local277 = this.aShortArray9[local268] - 1;
						if (local277 == -1) {
							break;
						}
						local221.anInt9723 = local132 * local277;
						local221.method8548(local240);
						local221.method8548(local247);
						local221.method8548(local254);
					}
				}
			}
		}
		@Pc(599) float local599;
		@Pc(498) short[] local498;
		@Pc(502) short[] local502;
		@Pc(510) short[] local510;
		@Pc(506) byte[] local506;
		@Pc(657) float local657;
		if (local19) {
			if (this.aClass170_2 == null) {
				if (this.aClass284_1 == null) {
					local510 = this.aShortArray7;
					local498 = this.aShortArray12;
					local502 = this.aShortArray13;
					local506 = this.aByteArray7;
				} else {
					local498 = this.aClass284_1.aShortArray126;
					local502 = this.aClass284_1.aShortArray127;
					local506 = this.aClass284_1.aByteArray97;
					local510 = this.aClass284_1.aShortArray125;
				}
				@Pc(530) float local530 = this.aClass145_Sub3_3.aFloatArray62[0];
				@Pc(536) float local536 = this.aClass145_Sub3_3.aFloatArray62[1];
				@Pc(542) float local542 = this.aClass145_Sub3_3.aFloatArray62[2];
				@Pc(546) float local546 = this.aClass145_Sub3_3.aFloat158;
				@Pc(556) float local556 = this.aClass145_Sub3_3.aFloat170 * 768.0F / (float) this.aShort35;
				@Pc(566) float local566 = this.aClass145_Sub3_3.aFloat165 * 768.0F / (float) this.aShort35;
				for (@Pc(568) int local568 = 0; local568 < this.anInt940; local568++) {
					@Pc(588) int local588 = this.method892(this.aShortArray11[local568], this.aByteArray6[local568], this.aShort36, this.aShortArray5[local568]);
					local599 = this.aClass145_Sub3_3.aFloat168 * (float) (local588 >> 16 & 0xFF);
					@Pc(610) float local610 = this.aClass145_Sub3_3.aFloat173 * (float) (local588 >> 8 & 0xFF);
					@Pc(619) float local619 = (float) (local588 >>> 24) * this.aClass145_Sub3_3.aFloat157;
					@Pc(624) short local624 = this.aShortArray14[local568];
					@Pc(629) short local629 = (short) local506[local624];
					if (local629 == 0) {
						local657 = ((float) local502[local624] * local536 + local530 * (float) local498[local624] + (float) local510[local624] * local542) * 0.0026041667F;
					} else {
						local657 = (local542 * (float) local510[local624] + (float) local498[local624] * local530 + (float) local502[local624] * local536) / (float) (local629 * 256);
					}
					@Pc(695) float local695 = (local657 < 0.0F ? local566 : local556) * local657 + local546;
					@Pc(700) int local700 = (int) (local695 * local619);
					@Pc(705) int local705 = (int) (local599 * local695);
					if (local700 < 0) {
						local700 = 0;
					} else if (local700 > 255) {
						local700 = 255;
					}
					if (local705 < 0) {
						local705 = 0;
					} else if (local705 > 255) {
						local705 = 255;
					}
					@Pc(739) int local739 = (int) (local695 * local610);
					local221.anInt9723 = local132 * local624 + local136;
					if (local739 < 0) {
						local739 = 0;
					} else if (local739 > 255) {
						local739 = 255;
					}
					local221.method8584(local700);
					local221.method8584(local705);
					local221.method8584(local739);
					local221.method8584(255 - (this.aByteArray6[local568] & 0xFF));
					local624 = this.aShortArray4[local568];
					local629 = (short) local506[local624];
					if (local629 == 0) {
						local657 = ((float) local498[local624] * local530 + local536 * (float) local502[local624] + (float) local510[local624] * local542) * 0.0026041667F;
					} else {
						local657 = (local536 * (float) local502[local624] + (float) local498[local624] * local530 + local542 * (float) local510[local624]) / (float) (local629 * 256);
					}
					local695 = local546 + (local657 < 0.0F ? local566 : local556) * local657;
					local700 = (int) (local695 * local619);
					local705 = (int) (local599 * local695);
					if (local700 < 0) {
						local700 = 0;
					} else if (local700 > 255) {
						local700 = 255;
					}
					if (local705 < 0) {
						local705 = 0;
					} else if (local705 > 255) {
						local705 = 255;
					}
					local739 = (int) (local695 * local610);
					if (local739 < 0) {
						local739 = 0;
					} else if (local739 > 255) {
						local739 = 255;
					}
					local221.anInt9723 = local624 * local132 + local136;
					local221.method8584(local700);
					local221.method8584(local705);
					local221.method8584(local739);
					local221.method8584(255 - (this.aByteArray6[local568] & 0xFF));
					local624 = this.aShortArray6[local568];
					local629 = (short) local506[local624];
					if (local629 == 0) {
						local657 = (local542 * (float) local510[local624] + local536 * (float) local502[local624] + local530 * (float) local498[local624]) * 0.0026041667F;
					} else {
						local657 = ((float) local510[local624] * local542 + local536 * (float) local502[local624] + (float) local498[local624] * local530) / (float) (local629 * 256);
					}
					local695 = local546 + (local657 < 0.0F ? local566 : local556) * local657;
					local700 = (int) (local619 * local695);
					if (local700 < 0) {
						local700 = 0;
					} else if (local700 > 255) {
						local700 = 255;
					}
					local705 = (int) (local695 * local599);
					if (local705 < 0) {
						local705 = 0;
					} else if (local705 > 255) {
						local705 = 255;
					}
					local739 = (int) (local610 * local695);
					local221.anInt9723 = local136 + local624 * local132;
					if (local739 < 0) {
						local739 = 0;
					} else if (local739 > 255) {
						local739 = 255;
					}
					local221.method8584(local700);
					local221.method8584(local705);
					local221.method8584(local739);
					local221.method8584(255 - (this.aByteArray6[local568] & 0xFF));
				}
			} else {
				for (local231 = 0; local231 < this.anInt940; local231++) {
					local240 = this.method892(this.aShortArray11[local231], this.aByteArray6[local231], this.aShort36, this.aShortArray5[local231]);
					local221.anInt9723 = local132 * this.aShortArray14[local231] + local136;
					local221.method8577(local240);
					local221.anInt9723 = this.aShortArray4[local231] * local132 + local136;
					local221.method8577(local240);
					local221.anInt9723 = local136 + this.aShortArray6[local231] * local132;
					local221.method8577(local240);
				}
			}
		}
		if (local44) {
			if (this.aClass284_1 == null) {
				local506 = this.aByteArray7;
				local502 = this.aShortArray13;
				local498 = this.aShortArray12;
				local510 = this.aShortArray7;
			} else {
				local506 = this.aClass284_1.aByteArray97;
				local498 = this.aClass284_1.aShortArray126;
				local510 = this.aClass284_1.aShortArray125;
				local502 = this.aClass284_1.aShortArray127;
			}
			@Pc(1173) float local1173 = 3.0F / (float) this.aShort35;
			local221.anInt9723 = local138;
			local657 = 3.0F / (float) (this.aShort35 / 2 + this.aShort35);
			if (this.aClass145_Sub3_3.aBoolean872) {
				for (local268 = 0; local268 < this.anInt994; local268++) {
					local277 = local506[local268] & 0xFF;
					if (local277 == 0) {
						local221.method3563(local657 * (float) local498[local268]);
						local221.method3563((float) local502[local268] * local657);
						local221.method3563((float) local510[local268] * local657);
					} else {
						local599 = local1173 / (float) local277;
						local221.method3563((float) local498[local268] * local599);
						local221.method3563((float) local502[local268] * local599);
						local221.method3563(local599 * (float) local510[local268]);
					}
					local221.anInt9723 += local132 - 12;
				}
			} else {
				for (local268 = 0; local268 < this.anInt994; local268++) {
					local277 = local506[local268] & 0xFF;
					if (local277 == 0) {
						local221.method3565((float) local498[local268] * local657);
						local221.method3565((float) local502[local268] * local657);
						local221.method3565((float) local510[local268] * local657);
					} else {
						local599 = local1173 / (float) local277;
						local221.method3565((float) local498[local268] * local599);
						local221.method3565(local599 * (float) local502[local268]);
						local221.method3565((float) local510[local268] * local599);
					}
					local221.anInt9723 += local132 - 12;
				}
			}
		}
		if (local72) {
			local221.anInt9723 = local140;
			if (this.aClass145_Sub3_3.aBoolean872) {
				for (local231 = 0; local231 < this.anInt994; local231++) {
					local221.method3563(this.aFloatArray7[local231]);
					local221.method3563(this.aFloatArray6[local231]);
					local221.anInt9723 += local132 - 8;
				}
			} else {
				for (local231 = 0; local231 < this.anInt994; local231++) {
					local221.method3565(this.aFloatArray7[local231]);
					local221.method3565(this.aFloatArray6[local231]);
					local221.anInt9723 += local132 - 8;
				}
			}
		}
		local221.anInt9723 = this.anInt994 * local132;
		@Pc(1485) Interface13 local1485;
		if (arg0) {
			if (this.anInterface13_1 == null) {
				this.anInterface13_1 = this.aClass145_Sub3_3.method8915(local221.anInt9723, local132, local221.aByteArray111, true);
			} else {
				this.anInterface13_1.method8068(local132, local221.aByteArray111, local221.anInt9723);
			}
			local1485 = this.anInterface13_1;
			this.aByte46 = 0;
		} else {
			local1485 = this.aClass145_Sub3_3.method8915(local221.anInt9723, local132, local221.aByteArray111, false);
			this.aBoolean122 = true;
		}
		if (local58) {
			this.aClass170_1.anInterface13_4 = local1485;
			this.aClass170_1.aByte70 = 0;
		}
		if (local72) {
			this.aClass170_3.anInterface13_4 = local1485;
			this.aClass170_3.aByte70 = local140;
		}
		if (local19) {
			this.aClass170_4.aByte70 = local136;
			this.aClass170_4.anInterface13_4 = local1485;
		}
		if (local44) {
			this.aClass170_2.aByte70 = local138;
			this.aClass170_2.anInterface13_4 = local1485;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!gw;ZII)Z")
	@Override
	public boolean method5743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method901(arg1, arg3, arg2, arg0, arg5, arg4);
	}

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort32;
	}

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "()[Lclient!uc;")
	@Override
	public Class363[] method5745() {
		return this.aClass363Array1;
	}

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static583.anInt2353 = 0;
			Static403.anInt6653 = 0;
			local16 = 0;
			Static27.anInt379 = 0;
			for (local20 = 0; local20 < this.anInt992; local20++) {
				Static403.anInt6653 += this.anIntArray85[local20];
				Static27.anInt379 += this.anIntArray87[local20];
				local16++;
				Static583.anInt2353 += this.anIntArray89[local20];
			}
			if (local16 <= 0) {
				Static403.anInt6653 = arg1;
				Static583.anInt2353 = arg3;
				Static27.anInt379 = arg2;
			} else {
				Static583.anInt2353 = Static583.anInt2353 / local16 + arg3;
				Static403.anInt6653 = Static403.anInt6653 / local16 + arg1;
				Static27.anInt379 = Static27.anInt379 / local16 + arg2;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt992; local16++) {
				this.anIntArray85[local16] += arg1;
				this.anIntArray87[local16] += arg2;
				this.anIntArray89[local16] += arg3;
			}
		} else {
			@Pc(176) int local176;
			@Pc(194) int local194;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt992; local16++) {
					this.anIntArray85[local16] -= Static403.anInt6653;
					this.anIntArray87[local16] -= Static27.anInt379;
					this.anIntArray89[local16] -= Static583.anInt2353;
					if (arg3 != 0) {
						local20 = Class145_Sub1.anIntArray761[arg3];
						local176 = Class145_Sub1.anIntArray760[arg3];
						local194 = this.anIntArray85[local16] * local176 + this.anIntArray87[local16] * local20 + 16383 >> 14;
						this.anIntArray87[local16] = this.anIntArray87[local16] * local176 + 16383 - local20 * this.anIntArray85[local16] >> 14;
						this.anIntArray85[local16] = local194;
					}
					if (arg1 != 0) {
						local20 = Class145_Sub1.anIntArray761[arg1];
						local176 = Class145_Sub1.anIntArray760[arg1];
						local194 = local176 * this.anIntArray87[local16] + 16383 - local20 * this.anIntArray89[local16] >> 14;
						this.anIntArray89[local16] = local176 * this.anIntArray89[local16] + this.anIntArray87[local16] * local20 + 16383 >> 14;
						this.anIntArray87[local16] = local194;
					}
					if (arg2 != 0) {
						local20 = Class145_Sub1.anIntArray761[arg2];
						local176 = Class145_Sub1.anIntArray760[arg2];
						local194 = this.anIntArray89[local16] * local20 + local176 * this.anIntArray85[local16] + 16383 >> 14;
						this.anIntArray89[local16] = local176 * this.anIntArray89[local16] + 16383 - this.anIntArray85[local16] * local20 >> 14;
						this.anIntArray85[local16] = local194;
					}
					this.anIntArray85[local16] += Static403.anInt6653;
					this.anIntArray87[local16] += Static27.anInt379;
					this.anIntArray89[local16] += Static583.anInt2353;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt992; local16++) {
					this.anIntArray85[local16] -= Static403.anInt6653;
					this.anIntArray87[local16] -= Static27.anInt379;
					this.anIntArray89[local16] -= Static583.anInt2353;
					this.anIntArray85[local16] = this.anIntArray85[local16] * arg1 / 128;
					this.anIntArray87[local16] = this.anIntArray87[local16] * arg2 / 128;
					this.anIntArray89[local16] = arg3 * this.anIntArray89[local16] / 128;
					this.anIntArray85[local16] += Static403.anInt6653;
					this.anIntArray87[local16] += Static27.anInt379;
					this.anIntArray89[local16] += Static583.anInt2353;
				}
			} else {
				@Pc(540) Class265 local540;
				@Pc(545) Class98 local545;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt940; local16++) {
						local20 = (this.aByteArray6[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray6[local16] = (byte) local20;
					}
					if (this.aClass170_4 != null) {
						this.aClass170_4.anInterface13_4 = null;
					}
					if (this.aClass265Array1 != null) {
						for (local20 = 0; local20 < this.anInt971; local20++) {
							local540 = this.aClass265Array1[local20];
							local545 = this.aClass98Array1[local20];
							local545.anInt2460 = 255 - (this.aByteArray6[local540.anInt7118] & 0xFF) << 24 | local545.anInt2460 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt940; local16++) {
						local20 = this.aShortArray11[local16] & 0xFFFF;
						local176 = local20 >> 10 & 0x3F;
						local194 = local20 >> 7 & 0x7;
						local194 += arg2 / 4;
						@Pc(611) int local611 = local20 & 0x7F;
						@Pc(618) int local618 = local176 + arg1 & 0x3F;
						if (local194 < 0) {
							local194 = 0;
						} else if (local194 > 7) {
							local194 = 7;
						}
						local611 += arg3;
						if (local611 < 0) {
							local611 = 0;
						} else if (local611 > 127) {
							local611 = 127;
						}
						this.aShortArray11[local16] = (short) (local194 << 7 | local618 << 10 | local611);
					}
					if (this.aClass170_4 != null) {
						this.aClass170_4.anInterface13_4 = null;
					}
					if (this.aClass265Array1 != null) {
						for (local20 = 0; local20 < this.anInt971; local20++) {
							local540 = this.aClass265Array1[local20];
							local545 = this.aClass98Array1[local20];
							local545.anInt2460 = Static555.anIntArray633[this.aShortArray11[local540.anInt7118] & 0xFFFF] & 0xFFFFFF | local545.anInt2460 & 0xFF000000;
						}
					}
				} else {
					@Pc(738) Class98 local738;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt971; local16++) {
							local738 = this.aClass98Array1[local16];
							local738.anInt2461 += arg1;
							local738.anInt2467 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt971; local16++) {
							local738 = this.aClass98Array1[local16];
							local738.anInt2463 = local738.anInt2463 * arg1 >> 7;
							local738.anInt2466 = local738.anInt2466 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt971; local16++) {
							local738 = this.aClass98Array1[local16];
							local738.anInt2462 = arg1 + local738.anInt2462 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "()[B")
	@Override
	public byte[] method5752() {
		return this.aByteArray6;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5751(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(65) int local65;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(17) int local17;
		@Pc(43) int local43;
		@Pc(59) int local59;
		@Pc(57) int[] local57;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg3 << 4;
			local25 = arg2 << 4;
			Static27.anInt379 = 0;
			Static403.anInt6653 = 0;
			local31 = 0;
			Static583.anInt2353 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray4.length > local43) {
					local57 = this.anIntArrayArray4[local43];
					for (local59 = 0; local59 < local57.length; local59++) {
						local65 = local57[local59];
						Static403.anInt6653 += this.anIntArray85[local65];
						Static27.anInt379 += this.anIntArray87[local65];
						Static583.anInt2353 += this.anIntArray89[local65];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static583.anInt2353 = local17 + Static583.anInt2353 / local31;
				Static27.anInt379 = Static27.anInt379 / local31 + local21;
				Static403.anInt6653 = local25 + Static403.anInt6653 / local31;
			} else {
				Static583.anInt2353 = local17;
				Static27.anInt379 = local21;
				Static403.anInt6653 = local25;
			}
			return;
		}
		@Pc(169) int[] local169;
		@Pc(171) int local171;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local25 = arg2 << 4;
			local21 = arg3 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray4.length) {
					local169 = this.anIntArrayArray4[local35];
					for (local171 = 0; local171 < local169.length; local171++) {
						local59 = local169[local171];
						this.anIntArray85[local59] += local25;
						this.anIntArray87[local59] += local21;
						this.anIntArray89[local59] += local17;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(305) int local305;
		@Pc(773) int local773;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray4.length) {
					local169 = this.anIntArrayArray4[local35];
					if ((arg5 & 0x1) == 0) {
						for (local171 = 0; local171 < local169.length; local171++) {
							local59 = local169[local171];
							this.anIntArray85[local59] -= Static403.anInt6653;
							this.anIntArray87[local59] -= Static27.anInt379;
							this.anIntArray89[local59] -= Static583.anInt2353;
							if (arg4 != 0) {
								local65 = Class145_Sub1.anIntArray761[arg4];
								local287 = Class145_Sub1.anIntArray760[arg4];
								local305 = local65 * this.anIntArray87[local59] + this.anIntArray85[local59] * local287 + 16383 >> 14;
								this.anIntArray87[local59] = local287 * this.anIntArray87[local59] + 16383 - local65 * this.anIntArray85[local59] >> 14;
								this.anIntArray85[local59] = local305;
							}
							if (arg2 != 0) {
								local65 = Class145_Sub1.anIntArray761[arg2];
								local287 = Class145_Sub1.anIntArray760[arg2];
								local305 = this.anIntArray87[local59] * local287 + 16383 - local65 * this.anIntArray89[local59] >> 14;
								this.anIntArray89[local59] = this.anIntArray89[local59] * local287 + this.anIntArray87[local59] * local65 + 16383 >> 14;
								this.anIntArray87[local59] = local305;
							}
							if (arg3 != 0) {
								local65 = Class145_Sub1.anIntArray761[arg3];
								local287 = Class145_Sub1.anIntArray760[arg3];
								local305 = local287 * this.anIntArray85[local59] + local65 * this.anIntArray89[local59] + 16383 >> 14;
								this.anIntArray89[local59] = local287 * this.anIntArray89[local59] + 16383 - this.anIntArray85[local59] * local65 >> 14;
								this.anIntArray85[local59] = local305;
							}
							this.anIntArray85[local59] += Static403.anInt6653;
							this.anIntArray87[local59] += Static27.anInt379;
							this.anIntArray89[local59] += Static583.anInt2353;
						}
					} else {
						for (local171 = 0; local171 < local169.length; local171++) {
							local59 = local169[local171];
							this.anIntArray85[local59] -= Static403.anInt6653;
							this.anIntArray87[local59] -= Static27.anInt379;
							this.anIntArray89[local59] -= Static583.anInt2353;
							if (arg2 != 0) {
								local65 = Class145_Sub1.anIntArray761[arg2];
								local287 = Class145_Sub1.anIntArray760[arg2];
								local305 = this.anIntArray87[local59] * local287 + 16383 - local65 * this.anIntArray89[local59] >> 14;
								this.anIntArray89[local59] = this.anIntArray89[local59] * local287 + this.anIntArray87[local59] * local65 + 16383 >> 14;
								this.anIntArray87[local59] = local305;
							}
							if (arg4 != 0) {
								local65 = Class145_Sub1.anIntArray761[arg4];
								local287 = Class145_Sub1.anIntArray760[arg4];
								local305 = local287 * this.anIntArray85[local59] + local65 * this.anIntArray87[local59] + 16383 >> 14;
								this.anIntArray87[local59] = this.anIntArray87[local59] * local287 + 16383 - local65 * this.anIntArray85[local59] >> 14;
								this.anIntArray85[local59] = local305;
							}
							if (arg3 != 0) {
								local65 = Class145_Sub1.anIntArray761[arg3];
								local287 = Class145_Sub1.anIntArray760[arg3];
								local305 = local65 * this.anIntArray89[local59] + local287 * this.anIntArray85[local59] + 16383 >> 14;
								this.anIntArray89[local59] = local287 * this.anIntArray89[local59] + 16383 - this.anIntArray85[local59] * local65 >> 14;
								this.anIntArray85[local59] = local305;
							}
							this.anIntArray85[local59] += Static403.anInt6653;
							this.anIntArray87[local59] += Static27.anInt379;
							this.anIntArray89[local59] += Static583.anInt2353;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (local43 < this.anIntArrayArray4.length) {
						local57 = this.anIntArrayArray4[local43];
						for (local59 = 0; local59 < local57.length; local59++) {
							local65 = local57[local59];
							local287 = this.anIntArray90[local65];
							local305 = this.anIntArray90[local65 + 1];
							for (local773 = local287; local773 < local305; local773++) {
								@Pc(782) int local782 = this.aShortArray9[local773] - 1;
								if (local782 == -1) {
									break;
								}
								@Pc(793) int local793;
								@Pc(797) int local797;
								@Pc(815) int local815;
								if (arg4 != 0) {
									local793 = Class145_Sub1.anIntArray761[arg4];
									local797 = Class145_Sub1.anIntArray760[arg4];
									local815 = this.aShortArray13[local782] * local793 + this.aShortArray12[local782] * local797 + 16383 >> 14;
									this.aShortArray13[local782] = (short) (this.aShortArray13[local782] * local797 + 16383 - this.aShortArray12[local782] * local793 >> 14);
									this.aShortArray12[local782] = (short) local815;
								}
								if (arg2 != 0) {
									local793 = Class145_Sub1.anIntArray761[arg2];
									local797 = Class145_Sub1.anIntArray760[arg2];
									local815 = this.aShortArray13[local782] * local797 + 16383 - this.aShortArray7[local782] * local793 >> 14;
									this.aShortArray7[local782] = (short) (this.aShortArray7[local782] * local797 + this.aShortArray13[local782] * local793 + 16383 >> 14);
									this.aShortArray13[local782] = (short) local815;
								}
								if (arg3 != 0) {
									local793 = Class145_Sub1.anIntArray761[arg3];
									local797 = Class145_Sub1.anIntArray760[arg3];
									local815 = this.aShortArray12[local782] * local797 + this.aShortArray7[local782] * local793 + 16383 >> 14;
									this.aShortArray7[local782] = (short) (this.aShortArray7[local782] * local797 + 16383 - this.aShortArray12[local782] * local793 >> 14);
									this.aShortArray12[local782] = (short) local815;
								}
							}
						}
					}
				}
				if (this.aClass170_2 == null && this.aClass170_4 != null) {
					this.aClass170_4.anInterface13_4 = null;
				}
				if (this.aClass170_2 != null) {
					this.aClass170_2.anInterface13_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray4.length) {
					local169 = this.anIntArrayArray4[local35];
					for (local171 = 0; local171 < local169.length; local171++) {
						local59 = local169[local171];
						this.anIntArray85[local59] -= Static403.anInt6653;
						this.anIntArray87[local59] -= Static27.anInt379;
						this.anIntArray89[local59] -= Static583.anInt2353;
						this.anIntArray85[local59] = this.anIntArray85[local59] * arg2 >> 7;
						this.anIntArray87[local59] = this.anIntArray87[local59] * arg3 >> 7;
						this.anIntArray89[local59] = arg4 * this.anIntArray89[local59] >> 7;
						this.anIntArray85[local59] += Static403.anInt6653;
						this.anIntArray87[local59] += Static27.anInt379;
						this.anIntArray89[local59] += Static583.anInt2353;
					}
				}
			}
		} else {
			@Pc(1263) Class265 local1263;
			@Pc(1268) Class98 local1268;
			if (arg0 == 5) {
				if (this.anIntArrayArray3 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray3.length) {
							local169 = this.anIntArrayArray3[local35];
							for (local171 = 0; local171 < local169.length; local171++) {
								local59 = local169[local171];
								local65 = arg2 * 8 + (this.aByteArray6[local59] & 0xFF);
								if (local65 < 0) {
									local65 = 0;
								} else if (local65 > 255) {
									local65 = 255;
								}
								this.aByteArray6[local59] = (byte) local65;
							}
							if (local169.length > 0 && this.aClass170_4 != null) {
								this.aClass170_4.anInterface13_4 = null;
							}
						}
					}
					if (this.aClass265Array1 != null) {
						for (local35 = 0; local35 < this.anInt971; local35++) {
							local1263 = this.aClass265Array1[local35];
							local1268 = this.aClass98Array1[local35];
							local1268.anInt2460 = local1268.anInt2460 & 0xFFFFFF | 255 - (this.aByteArray6[local1263.anInt7118] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1533) Class98 local1533;
				if (arg0 == 8) {
					if (this.anIntArrayArray5 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray5.length > local35) {
								local169 = this.anIntArrayArray5[local35];
								for (local171 = 0; local171 < local169.length; local171++) {
									local1533 = this.aClass98Array1[local169[local171]];
									local1533.anInt2461 += arg2;
									local1533.anInt2467 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray5 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray5.length > local35) {
								local169 = this.anIntArrayArray5[local35];
								for (local171 = 0; local171 < local169.length; local171++) {
									local1533 = this.aClass98Array1[local169[local171]];
									local1533.anInt2463 = local1533.anInt2463 * arg2 >> 7;
									local1533.anInt2466 = local1533.anInt2466 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray5 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray5.length) {
							local169 = this.anIntArrayArray5[local35];
							for (local171 = 0; local171 < local169.length; local171++) {
								local1533 = this.aClass98Array1[local169[local171]];
								local1533.anInt2462 = arg2 + local1533.anInt2462 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray3 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray3.length) {
						local169 = this.anIntArrayArray3[local35];
						for (local171 = 0; local171 < local169.length; local171++) {
							local59 = local169[local171];
							local65 = this.aShortArray11[local59] & 0xFFFF;
							local287 = local65 >> 10 & 0x3F;
							local305 = local65 >> 7 & 0x7;
							local305 += arg3 / 4;
							local773 = local65 & 0x7F;
							@Pc(1368) int local1368 = local287 + arg2 & 0x3F;
							if (local305 < 0) {
								local305 = 0;
							} else if (local305 > 7) {
								local305 = 7;
							}
							local773 += arg4;
							if (local773 < 0) {
								local773 = 0;
							} else if (local773 > 127) {
								local773 = 127;
							}
							this.aShortArray11[local59] = (short) (local773 | local305 << 7 | local1368 << 10);
						}
						if (local169.length > 0 && this.aClass170_4 != null) {
							this.aClass170_4.anInterface13_4 = null;
						}
					}
				}
				if (this.aClass265Array1 != null) {
					for (local35 = 0; local35 < this.anInt971; local35++) {
						local1263 = this.aClass265Array1[local35];
						local1268 = this.aClass98Array1[local35];
						local1268.anInt2460 = Static555.anIntArray633[this.aShortArray11[local1263.anInt7118] & 0xFFFF] & 0xFFFFFF | local1268.anInt2460 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort33;
	}

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean120;
	}

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "(I)V")
	private void method905() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt992; local23++) {
			@Pc(30) int local30 = this.anIntArray85[local23];
			@Pc(35) int local35 = this.anIntArray87[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(49) int local49 = this.anIntArray89[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local17 < local49) {
				local17 = local49;
			}
			if (local11 > local49) {
				local11 = local49;
			}
			@Pc(90) int local90 = local30 * local30 + local49 * local49;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local49 * local49 + local30 * local30 + local35 * local35;
			if (local21 < local90) {
				local21 = local90;
			}
		}
		this.aShort33 = (short) local11;
		this.aShort29 = (short) local9;
		this.aShort31 = (short) local15;
		this.aShort34 = (short) local13;
		this.aShort37 = (short) local7;
		this.aShort32 = (short) local17;
		this.aShort28 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort30 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean121 = true;
	}

	@OriginalMember(owner = "client!bm", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean121) {
			this.method905();
		}
		return this.aShort29;
	}
}
