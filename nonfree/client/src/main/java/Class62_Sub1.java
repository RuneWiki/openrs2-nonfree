import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class62_Sub1 extends Class62 {

	@OriginalMember(owner = "client!df", name = "o", descriptor = "S")
	private short aShort22;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Lclient!en;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!df", name = "q", descriptor = "[[I")
	private int[][] anIntArrayArray10;

	@OriginalMember(owner = "client!df", name = "s", descriptor = "Lclient!pea;")
	private Class277 aClass277_1;

	@OriginalMember(owner = "client!df", name = "z", descriptor = "[I")
	private int[] anIntArray119;

	@OriginalMember(owner = "client!df", name = "A", descriptor = "[Lclient!mk;")
	private Class235[] aClass235Array1;

	@OriginalMember(owner = "client!df", name = "B", descriptor = "[S")
	private short[] aShortArray20;

	@OriginalMember(owner = "client!df", name = "D", descriptor = "S")
	private short aShort23;

	@OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
	private int[] anIntArray120;

	@OriginalMember(owner = "client!df", name = "L", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!df", name = "Q", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!df", name = "R", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!df", name = "T", descriptor = "I")
	private int anInt1859;

	@OriginalMember(owner = "client!df", name = "U", descriptor = "I")
	private int anInt1860;

	@OriginalMember(owner = "client!df", name = "cb", descriptor = "S")
	private short aShort24;

	@OriginalMember(owner = "client!df", name = "db", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!df", name = "eb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!df", name = "gb", descriptor = "[[I")
	private int[][] anIntArrayArray11;

	@OriginalMember(owner = "client!df", name = "ib", descriptor = "S")
	private short aShort25;

	@OriginalMember(owner = "client!df", name = "kb", descriptor = "[Lclient!bea;")
	private Class25[] aClass25Array1;

	@OriginalMember(owner = "client!df", name = "ob", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!df", name = "pb", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!df", name = "qb", descriptor = "S")
	private short aShort26;

	@OriginalMember(owner = "client!df", name = "vb", descriptor = "[Lclient!ds;")
	private Class75[] aClass75Array1;

	@OriginalMember(owner = "client!df", name = "xb", descriptor = "[Lclient!ir;")
	private Class170[] aClass170Array1;

	@OriginalMember(owner = "client!df", name = "yb", descriptor = "[[I")
	private int[][] anIntArrayArray12;

	@OriginalMember(owner = "client!df", name = "Db", descriptor = "[B")
	private byte[] aByteArray24;

	@OriginalMember(owner = "client!df", name = "Hb", descriptor = "S")
	private short aShort27;

	@OriginalMember(owner = "client!df", name = "Kb", descriptor = "[I")
	private int[] anIntArray123;

	@OriginalMember(owner = "client!df", name = "Ob", descriptor = "S")
	private short aShort28;

	@OriginalMember(owner = "client!df", name = "Pb", descriptor = "S")
	private short aShort29;

	@OriginalMember(owner = "client!df", name = "Qb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!df", name = "Xb", descriptor = "[B")
	private byte[] aByteArray25;

	@OriginalMember(owner = "client!df", name = "Yb", descriptor = "Lclient!bia;")
	private Interface5 anInterface5_2;

	@OriginalMember(owner = "client!df", name = "Zb", descriptor = "S")
	private short aShort30;

	@OriginalMember(owner = "client!df", name = "ec", descriptor = "[F")
	private float[] aFloatArray5;

	@OriginalMember(owner = "client!df", name = "gc", descriptor = "S")
	private short aShort31;

	@OriginalMember(owner = "client!df", name = "jc", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!df", name = "kc", descriptor = "I")
	private int anInt1898;

	@OriginalMember(owner = "client!df", name = "nc", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!df", name = "oc", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!df", name = "wc", descriptor = "[F")
	private float[] aFloatArray6;

	@OriginalMember(owner = "client!df", name = "yc", descriptor = "B")
	private byte aByte19;

	@OriginalMember(owner = "client!df", name = "Gc", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!df", name = "y", descriptor = "I")
	private int anInt1849 = 0;

	@OriginalMember(owner = "client!df", name = "hb", descriptor = "I")
	private int anInt1869 = 0;

	@OriginalMember(owner = "client!df", name = "P", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!df", name = "jb", descriptor = "Z")
	private boolean aBoolean125 = true;

	@OriginalMember(owner = "client!df", name = "r", descriptor = "I")
	private int anInt1844 = 0;

	@OriginalMember(owner = "client!df", name = "tb", descriptor = "I")
	private int anInt1873 = 0;

	@OriginalMember(owner = "client!df", name = "Wb", descriptor = "I")
	private int anInt1890 = 0;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!df", name = "Ub", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!df", name = "nb", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_6;

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Lclient!sf;")
	private Class327 aClass327_9;

	@OriginalMember(owner = "client!df", name = "Nb", descriptor = "Lclient!sf;")
	private Class327 aClass327_10;

	@OriginalMember(owner = "client!df", name = "E", descriptor = "Lclient!sf;")
	private Class327 aClass327_8;

	@OriginalMember(owner = "client!df", name = "t", descriptor = "Lclient!sf;")
	private Class327 aClass327_7;

	@OriginalMember(owner = "client!df", name = "Rb", descriptor = "Lclient!qfa;")
	private Class302 aClass302_1;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class62_Sub1(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_6 = arg0;
		this.aClass327_9 = new Class327((Interface11) null, 5126, 3, 0);
		this.aClass327_10 = new Class327((Interface11) null, 5126, 2, 0);
		this.aClass327_8 = new Class327((Interface11) null, 5126, 3, 0);
		this.aClass327_7 = new Class327((Interface11) null, 5121, 4, 0);
		this.aClass302_1 = new Class302();
	}

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!pc;Lclient!so;IIII)V")
	public Class62_Sub1(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class334 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33_Sub3_6 = arg0;
		this.anInt1898 = arg5;
		this.anInt1859 = arg2;
		if (Static39.method4897(arg5, arg2)) {
			this.aClass327_9 = new Class327((Interface11) null, 5126, 3, 0);
		}
		if (Static84.method1758(arg5, arg2)) {
			this.aClass327_10 = new Class327((Interface11) null, 5126, 2, 0);
		}
		if (Static519.method7019(arg2, arg5)) {
			this.aClass327_8 = new Class327((Interface11) null, 5126, 3, 0);
		}
		if (Static135.method2423(arg5, arg2)) {
			this.aClass327_7 = new Class327((Interface11) null, 5121, 4, 0);
		}
		if (Static393.method5070(arg2, arg5)) {
			this.aClass302_1 = new Class302();
		}
		@Pc(108) Interface9 local108 = arg0.anInterface9_12;
		this.anIntArray119 = new int[arg1.anInt8560 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt8557];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt8557; local121++) {
			if (arg1.aByteArray89 == null || arg1.aByteArray89[local121] != 2) {
				if (arg1.aShortArray128 != null && arg1.aShortArray128[local121] != -1) {
					@Pc(152) Class130 local152 = local108.method1558(arg1.aShortArray128[local121] & 0xFFFF);
					if (((this.anInt1898 & 0x40) == 0 || !local152.aBoolean241) && local152.aBoolean238) {
						continue;
					}
				}
				local119[this.anInt1869++] = local121;
				this.anIntArray119[arg1.aShortArray125[local121]]++;
				this.anIntArray119[arg1.aShortArray132[local121]]++;
				this.anIntArray119[arg1.aShortArray130[local121]]++;
			}
		}
		this.anInt1849 = this.anInt1869;
		@Pc(228) long[] local228 = new long[this.anInt1869];
		@Pc(240) boolean local240 = (this.anInt1859 & 0x100) != 0;
		@Pc(252) int local252;
		@Pc(265) int local265;
		@Pc(450) int local450;
		for (@Pc(242) int local242 = 0; local242 < this.anInt1869; local242++) {
			@Pc(248) int local248 = local119[local242];
			@Pc(250) Class130 local250 = null;
			local252 = 0;
			@Pc(254) byte local254 = 0;
			@Pc(256) byte local256 = 0;
			@Pc(258) byte local258 = 0;
			if (arg1.aClass226Array1 != null) {
				@Pc(263) boolean local263 = false;
				for (local265 = 0; local265 < arg1.aClass226Array1.length; local265++) {
					@Pc(272) Class226 local272 = arg1.aClass226Array1[local265];
					if (local272.anInt5493 == local248) {
						@Pc(281) Class150 local281 = Static415.method5232(local272.anInt5502);
						if (local281.aBoolean261) {
							local263 = true;
						}
						if (local281.anInt3546 != -1) {
							@Pc(296) Class130 local296 = local108.method1558(local281.anInt3546);
							if (local296.anInt3119 == 2) {
								this.aBoolean124 = true;
							}
						}
					}
				}
				if (local263) {
					local228[local242] = Long.MAX_VALUE;
					this.anInt1849--;
					continue;
				}
			}
			@Pc(331) short local331 = -1;
			if (arg1.aShortArray128 != null) {
				local331 = arg1.aShortArray128[local248];
				if (local331 != -1) {
					local250 = local108.method1558(local331 & 0xFFFF);
					if ((this.anInt1898 & 0x40) != 0 && local250.aBoolean241) {
						local331 = -1;
						local250 = null;
					} else {
						if (local250.aByte34 != 0 || local250.aByte36 != 0) {
							this.aBoolean123 = true;
						}
						local256 = local250.aByte39;
						local258 = local250.aByte35;
					}
				}
			}
			@Pc(406) boolean local406 = arg1.aByteArray86 != null && arg1.aByteArray86[local248] != 0 || local250 != null && local250.anInt3119 != 0;
			if ((local240 || local406) && arg1.aByteArray90 != null) {
				local252 += arg1.aByteArray90[local248] << 17;
			}
			if (local406) {
				local252 += 65536;
			}
			local252 += (local256 & 0xFF) << 8;
			local252 += local258 & 0xFF;
			local450 = local254 + ((local331 & 0xFFFF) << 16);
			@Pc(456) int local456 = local450 + (local242 & 0xFFFF);
			local228[local242] = (long) local456 + ((long) local252 << 32);
			this.aBoolean123 |= local250 != null && (local250.aByte34 != 0 || local250.aByte36 != 0);
			this.aBoolean124 |= local406;
		}
		Static254.method3692(local228, local119);
		this.anIntArray120 = arg1.anIntArray589;
		this.anIntArray123 = arg1.anIntArray593;
		this.anInt1873 = arg1.anInt8570;
		this.anInt1890 = arg1.anInt8560;
		this.aShortArray20 = arg1.aShortArray126;
		this.anIntArray122 = arg1.anIntArray596;
		this.aClass235Array1 = arg1.aClass235Array5;
		@Pc(536) Class333[] local536 = new Class333[this.anInt1890];
		this.aClass170Array1 = arg1.aClass170Array5;
		@Pc(560) int local560;
		@Pc(574) int local574;
		@Pc(617) int local617;
		if (arg1.aClass226Array1 != null) {
			this.anInt1860 = arg1.aClass226Array1.length;
			this.aClass25Array1 = new Class25[this.anInt1860];
			this.aClass75Array1 = new Class75[this.anInt1860];
			for (local560 = 0; local560 < this.anInt1860; local560++) {
				@Pc(567) Class226 local567 = arg1.aClass226Array1[local560];
				@Pc(572) Class150 local572 = Static415.method5232(local567.anInt5502);
				local574 = -1;
				for (@Pc(576) int local576 = 0; local576 < this.anInt1869; local576++) {
					if (local119[local576] == local567.anInt5493) {
						local574 = local576;
						break;
					}
				}
				if (local574 == -1) {
					throw new RuntimeException();
				}
				local617 = Static411.anIntArray448[arg1.aShortArray129[local567.anInt5493] & 0xFFFF] & 0xFFFFFF;
				@Pc(635) int local635 = local617 | 255 - (arg1.aByteArray86 == null ? 0 : arg1.aByteArray86[local567.anInt5493]) << 24;
				this.aClass75Array1[local560] = new Class75(local574, arg1.aShortArray125[local567.anInt5493], arg1.aShortArray132[local567.anInt5493], arg1.aShortArray130[local567.anInt5493], local572.anInt3544, local572.anInt3549, local572.anInt3546, local572.anInt3545, local572.anInt3548, local572.aBoolean261, local572.aBoolean262, local567.anInt5494);
				this.aClass25Array1[local560] = new Class25(local635);
			}
		}
		local560 = this.anInt1869 * 3;
		this.aShortArray26 = new short[local560];
		this.aFloatArray6 = new float[local560];
		this.aFloatArray5 = new float[local560];
		this.aShortArray27 = new short[local560];
		if (arg1.aShortArray127 != null) {
			this.aShortArray21 = new short[this.anInt1869];
		}
		this.aShortArray23 = new short[this.anInt1869];
		this.aShortArray25 = new short[this.anInt1869];
		this.aShortArray30 = new short[local560];
		this.aShortArray29 = new short[this.anInt1869];
		this.aByteArray25 = new byte[local560];
		this.aByteArray24 = new byte[this.anInt1869];
		this.aShort25 = (short) arg4;
		this.aShortArray28 = new short[local560];
		this.aShortArray24 = new short[this.anInt1869];
		this.aShort27 = (short) arg3;
		Static453.aLongArray17 = new long[local560];
		this.aShortArray22 = new short[this.anInt1869];
		local252 = 0;
		for (local450 = 0; local450 < arg1.anInt8560; local450++) {
			local574 = this.anIntArray119[local450];
			this.anIntArray119[local450] = local252;
			local252 += local574;
			local536[local450] = new Class333();
		}
		this.anIntArray119[arg1.anInt8560] = local252;
		@Pc(817) Class43 local817 = Static469.method6481(arg1, local119, this.anInt1869);
		@Pc(821) Class83[] local821 = new Class83[arg1.anInt8557];
		@Pc(862) int local862;
		@Pc(873) int local873;
		@Pc(895) int local895;
		@Pc(906) int local906;
		@Pc(914) int local914;
		@Pc(923) int local923;
		@Pc(840) short local840;
		@Pc(851) int local851;
		for (local617 = 0; local617 < arg1.anInt8557; local617++) {
			@Pc(830) short local830 = arg1.aShortArray125[local617];
			@Pc(835) short local835 = arg1.aShortArray132[local617];
			local840 = arg1.aShortArray130[local617];
			local851 = this.anIntArray122[local835] - this.anIntArray122[local830];
			local862 = this.anIntArray123[local835] - this.anIntArray123[local830];
			local873 = this.anIntArray120[local835] - this.anIntArray120[local830];
			@Pc(884) int local884 = this.anIntArray122[local840] - this.anIntArray122[local830];
			local895 = this.anIntArray123[local840] - this.anIntArray123[local830];
			local906 = this.anIntArray120[local840] - this.anIntArray120[local830];
			local914 = local906 * local862 - local895 * local873;
			local923 = local884 * local873 - local906 * local851;
			@Pc(932) int local932;
			for (local932 = local851 * local895 - local862 * local884; local914 > 8192 || local923 > 8192 || local932 > 8192 || local914 < -8192 || local923 < -8192 || local932 < -8192; local932 >>= 0x1) {
				local923 >>= 0x1;
				local914 >>= 0x1;
			}
			@Pc(986) int local986 = (int) Math.sqrt((double) (local932 * local932 + local914 * local914 + local923 * local923));
			if (local986 <= 0) {
				local986 = 1;
			}
			local923 = local923 * 256 / local986;
			local914 = local914 * 256 / local986;
			local932 = local932 * 256 / local986;
			@Pc(1021) byte local1021 = arg1.aByteArray89 == null ? 0 : arg1.aByteArray89[local617];
			if (local1021 == 0) {
				@Pc(1030) Class333 local1030 = local536[local830];
				local1030.anInt8553 += local914;
				local1030.anInt8548++;
				local1030.anInt8552 += local923;
				local1030.anInt8550 += local932;
				@Pc(1058) Class333 local1058 = local536[local835];
				local1058.anInt8552 += local923;
				local1058.anInt8548++;
				local1058.anInt8550 += local932;
				local1058.anInt8553 += local914;
				@Pc(1086) Class333 local1086 = local536[local840];
				local1086.anInt8550 += local932;
				local1086.anInt8548++;
				local1086.anInt8552 += local923;
				local1086.anInt8553 += local914;
			} else if (local1021 == 1) {
				@Pc(1123) Class83 local1123 = local821[local617] = new Class83();
				local1123.anInt2237 = local932;
				local1123.anInt2238 = local923;
				local1123.anInt2240 = local914;
			}
		}
		@Pc(1145) int local1145;
		@Pc(1188) short local1188;
		for (local265 = 0; local265 < this.anInt1869; local265++) {
			local1145 = local119[local265];
			@Pc(1152) int local1152 = arg1.aShortArray129[local1145] & 0xFFFF;
			if (arg1.aByteArray87 == null) {
				local851 = -1;
			} else {
				local851 = arg1.aByteArray87[local1145];
			}
			if (arg1.aByteArray86 == null) {
				local862 = 0;
			} else {
				local862 = arg1.aByteArray86[local1145] & 0xFF;
			}
			local1188 = arg1.aShortArray128 == null ? -1 : arg1.aShortArray128[local1145];
			if (local1188 != -1 && (this.anInt1898 & 0x40) != 0) {
				@Pc(1203) Class130 local1203 = local108.method1558(local1188 & 0xFFFF);
				if (local1203.aBoolean241) {
					local1188 = -1;
				}
			}
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) float local1214 = 0.0F;
			@Pc(1216) float local1216 = 0.0F;
			@Pc(1218) float local1218 = 0.0F;
			@Pc(1220) float local1220 = 0.0F;
			@Pc(1222) byte local1222 = 0;
			@Pc(1224) byte local1224 = 0;
			@Pc(1226) int local1226 = 0;
			@Pc(1261) byte local1261;
			@Pc(1281) short local1281;
			@Pc(2075) short local2075;
			@Pc(2080) short local2080;
			if (local1188 != -1) {
				if (local851 == -1) {
					local1218 = 0.0F;
					local1224 = 2;
					local1222 = 1;
					local1220 = 0.0F;
					local1210 = 0.0F;
					local1214 = 1.0F;
					local1216 = 1.0F;
					local1212 = 1.0F;
				} else {
					local851 &= 0xFF;
					local1261 = arg1.aByteArray85[local851];
					@Pc(1271) short local1271;
					@Pc(1276) short local1276;
					@Pc(1314) float local1314;
					@Pc(1327) float local1327;
					@Pc(1421) float local1421;
					@Pc(1658) float local1658;
					@Pc(1666) float local1666;
					@Pc(1674) float local1674;
					@Pc(1697) float local1697;
					@Pc(1720) float local1720;
					@Pc(1743) float local1743;
					if (local1261 == 0) {
						local1271 = arg1.aShortArray125[local1145];
						local1276 = arg1.aShortArray132[local1145];
						local1281 = arg1.aShortArray130[local1145];
						local2075 = arg1.aShortArray131[local851];
						local2080 = arg1.aShortArray133[local851];
						@Pc(2085) short local2085 = arg1.aShortArray124[local851];
						@Pc(2091) float local2091 = (float) arg1.anIntArray596[local2075];
						@Pc(2097) float local2097 = (float) arg1.anIntArray593[local2075];
						local1314 = (float) arg1.anIntArray589[local2075];
						local1327 = (float) arg1.anIntArray596[local2080] - local2091;
						local1421 = (float) arg1.anIntArray593[local2080] - local2097;
						@Pc(2129) float local2129 = (float) arg1.anIntArray589[local2080] - local1314;
						@Pc(2138) float local2138 = (float) arg1.anIntArray596[local2085] - local2091;
						@Pc(2146) float local2146 = (float) arg1.anIntArray593[local2085] - local2097;
						@Pc(2154) float local2154 = (float) arg1.anIntArray589[local2085] - local1314;
						@Pc(2163) float local2163 = (float) arg1.anIntArray596[local1271] - local2091;
						@Pc(2171) float local2171 = (float) arg1.anIntArray593[local1271] - local2097;
						@Pc(2180) float local2180 = (float) arg1.anIntArray589[local1271] - local1314;
						@Pc(2189) float local2189 = (float) arg1.anIntArray596[local1276] - local2091;
						@Pc(2198) float local2198 = (float) arg1.anIntArray593[local1276] - local2097;
						local1658 = (float) arg1.anIntArray589[local1276] - local1314;
						local1666 = (float) arg1.anIntArray596[local1281] - local2091;
						local1674 = (float) arg1.anIntArray593[local1281] - local2097;
						local1697 = (float) arg1.anIntArray589[local1281] - local1314;
						local1720 = local2154 * local1421 - local2146 * local2129;
						local1743 = local2138 * local2129 - local2154 * local1327;
						@Pc(2257) float local2257 = local2146 * local1327 - local1421 * local2138;
						@Pc(2265) float local2265 = local2257 * local2146 - local2154 * local1743;
						@Pc(2273) float local2273 = local2154 * local1720 - local2257 * local2138;
						@Pc(2281) float local2281 = local2138 * local1743 - local2146 * local1720;
						@Pc(2295) float local2295 = 1.0F / (local1327 * local2265 + local2273 * local1421 + local2281 * local2129);
						local1214 = (local2265 * local2189 + local2273 * local2198 + local2281 * local1658) * local2295;
						local1218 = local2295 * (local1666 * local2265 + local1674 * local2273 + local1697 * local2281);
						local1210 = (local2273 * local2171 + local2163 * local2265 + local2281 * local2180) * local2295;
						@Pc(2345) float local2345 = local1421 * local2257 - local2129 * local1743;
						@Pc(2354) float local2354 = local1720 * local2129 - local1327 * local2257;
						@Pc(2363) float local2363 = local1327 * local1743 - local1720 * local1421;
						@Pc(2377) float local2377 = 1.0F / (local2154 * local2363 + local2354 * local2146 + local2345 * local2138);
						local1216 = local2377 * (local2363 * local1658 + local2345 * local2189 + local2354 * local2198);
						local1220 = (local1697 * local2363 + local2345 * local1666 + local2354 * local1674) * local2377;
						local1212 = local2377 * (local2163 * local2345 + local2171 * local2354 + local2180 * local2363);
					} else {
						local1271 = arg1.aShortArray125[local1145];
						local1276 = arg1.aShortArray132[local1145];
						local1281 = arg1.aShortArray130[local1145];
						@Pc(1286) int local1286 = local817.anIntArray95[local851];
						@Pc(1291) int local1291 = local817.anIntArray94[local851];
						@Pc(1296) int local1296 = local817.anIntArray96[local851];
						@Pc(1301) float[] local1301 = local817.aFloatArrayArray8[local851];
						@Pc(1306) byte local1306 = arg1.aByteArray91[local851];
						local1314 = (float) arg1.anIntArray590[local851] / 256.0F;
						if (local1261 == 1) {
							local1327 = (float) arg1.anIntArray595[local851] / 1024.0F;
							Static242.method3575(arg1.anIntArray593[local1271], local1327, local1291, local1301, local1314, local1296, local1286, arg1.anIntArray589[local1271], Static391.aFloatArray29, local1306, arg1.anIntArray596[local1271]);
							local1212 = Static391.aFloatArray29[1];
							local1210 = Static391.aFloatArray29[0];
							Static242.method3575(arg1.anIntArray593[local1276], local1327, local1291, local1301, local1314, local1296, local1286, arg1.anIntArray589[local1276], Static391.aFloatArray29, local1306, arg1.anIntArray596[local1276]);
							local1214 = Static391.aFloatArray29[0];
							local1216 = Static391.aFloatArray29[1];
							Static242.method3575(arg1.anIntArray593[local1281], local1327, local1291, local1301, local1314, local1296, local1286, arg1.anIntArray589[local1281], Static391.aFloatArray29, local1306, arg1.anIntArray596[local1281]);
							local1220 = Static391.aFloatArray29[1];
							local1218 = Static391.aFloatArray29[0];
							local1421 = local1327 / 2.0F;
							if ((local1306 & 0x1) == 0) {
								if (local1218 - local1210 > local1421) {
									local1218 -= local1327;
									local1224 = 1;
								} else if (local1210 - local1218 > local1421) {
									local1218 += local1327;
									local1224 = 2;
								}
								if (local1214 - local1210 > local1421) {
									local1214 -= local1327;
									local1222 = 1;
								} else if (local1421 < local1210 - local1214) {
									local1222 = 2;
									local1214 += local1327;
								}
							} else {
								if (local1421 < local1216 - local1212) {
									local1216 -= local1327;
									local1222 = 1;
								} else if (local1421 < local1212 - local1216) {
									local1216 += local1327;
									local1222 = 2;
								}
								if (local1421 < local1220 - local1212) {
									local1224 = 1;
									local1220 -= local1327;
								} else if (local1421 < local1212 - local1220) {
									local1224 = 2;
									local1220 += local1327;
								}
							}
						} else if (local1261 == 2) {
							local1327 = (float) arg1.anIntArray597[local851] / 256.0F;
							local1421 = (float) arg1.anIntArray592[local851] / 256.0F;
							@Pc(1570) int local1570 = arg1.anIntArray596[local1276] - arg1.anIntArray596[local1271];
							@Pc(1581) int local1581 = arg1.anIntArray593[local1276] - arg1.anIntArray593[local1271];
							@Pc(1592) int local1592 = arg1.anIntArray589[local1276] - arg1.anIntArray589[local1271];
							@Pc(1602) int local1602 = arg1.anIntArray596[local1281] - arg1.anIntArray596[local1271];
							@Pc(1613) int local1613 = arg1.anIntArray593[local1281] - arg1.anIntArray593[local1271];
							@Pc(1623) int local1623 = arg1.anIntArray589[local1281] - arg1.anIntArray589[local1271];
							@Pc(1632) int local1632 = local1581 * local1623 - local1592 * local1613;
							@Pc(1641) int local1641 = local1602 * local1592 - local1570 * local1623;
							@Pc(1650) int local1650 = local1570 * local1613 - local1602 * local1581;
							local1658 = 64.0F / (float) arg1.anIntArray599[local851];
							local1666 = 64.0F / (float) arg1.anIntArray594[local851];
							local1674 = 64.0F / (float) arg1.anIntArray595[local851];
							local1697 = ((float) local1650 * local1301[2] + local1301[1] * (float) local1641 + (float) local1632 * local1301[0]) / local1658;
							local1720 = (local1301[5] * (float) local1650 + (float) local1641 * local1301[4] + (float) local1632 * local1301[3]) / local1666;
							local1743 = (local1301[7] * (float) local1641 + local1301[6] * (float) local1632 + local1301[8] * (float) local1650) / local1674;
							local1226 = Static126.method2247(local1720, local1697, local1743);
							Static184.method2920(local1327, arg1.anIntArray596[local1271], local1301, local1306, Static391.aFloatArray29, local1291, local1421, local1296, local1226, local1314, local1286, arg1.anIntArray593[local1271], arg1.anIntArray589[local1271]);
							local1212 = Static391.aFloatArray29[1];
							local1210 = Static391.aFloatArray29[0];
							Static184.method2920(local1327, arg1.anIntArray596[local1276], local1301, local1306, Static391.aFloatArray29, local1291, local1421, local1296, local1226, local1314, local1286, arg1.anIntArray593[local1276], arg1.anIntArray589[local1276]);
							local1216 = Static391.aFloatArray29[1];
							local1214 = Static391.aFloatArray29[0];
							Static184.method2920(local1327, arg1.anIntArray596[local1281], local1301, local1306, Static391.aFloatArray29, local1291, local1421, local1296, local1226, local1314, local1286, arg1.anIntArray593[local1281], arg1.anIntArray589[local1281]);
							local1220 = Static391.aFloatArray29[1];
							local1218 = Static391.aFloatArray29[0];
						} else if (local1261 == 3) {
							Static364.method4832(arg1.anIntArray593[local1271], local1306, local1286, local1301, Static391.aFloatArray29, local1314, local1291, local1296, arg1.anIntArray589[local1271], arg1.anIntArray596[local1271]);
							local1212 = Static391.aFloatArray29[1];
							local1210 = Static391.aFloatArray29[0];
							Static364.method4832(arg1.anIntArray593[local1276], local1306, local1286, local1301, Static391.aFloatArray29, local1314, local1291, local1296, arg1.anIntArray589[local1276], arg1.anIntArray596[local1276]);
							local1216 = Static391.aFloatArray29[1];
							local1214 = Static391.aFloatArray29[0];
							Static364.method4832(arg1.anIntArray593[local1281], local1306, local1286, local1301, Static391.aFloatArray29, local1314, local1291, local1296, arg1.anIntArray589[local1281], arg1.anIntArray596[local1281]);
							local1218 = Static391.aFloatArray29[0];
							local1220 = Static391.aFloatArray29[1];
							if ((local1306 & 0x1) == 0) {
								if (local1214 - local1210 > 0.5F) {
									local1222 = 1;
									local1214--;
								} else if (local1210 - local1214 > 0.5F) {
									local1214++;
									local1222 = 2;
								}
								if (local1218 - local1210 > 0.5F) {
									local1224 = 1;
									local1218--;
								} else if (local1210 - local1218 > 0.5F) {
									local1218++;
									local1224 = 2;
								}
							} else {
								if (local1216 - local1212 > 0.5F) {
									local1216--;
									local1222 = 1;
								} else if (local1212 - local1216 > 0.5F) {
									local1216++;
									local1222 = 2;
								}
								if (local1220 - local1212 > 0.5F) {
									local1224 = 1;
									local1220--;
								} else if (local1212 - local1220 > 0.5F) {
									local1224 = 2;
									local1220++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray89 == null) {
				local1261 = 0;
			} else {
				local1261 = arg1.aByteArray89[local1145];
			}
			if (local1261 == 0) {
				@Pc(2453) long local2453 = ((long) local862 + (long) (local1152 << 8) + (long) (local1226 << 24) << 32) + (long) (local851 << 2);
				local1281 = arg1.aShortArray125[local1145];
				local2075 = arg1.aShortArray132[local1145];
				local2080 = arg1.aShortArray130[local1145];
				@Pc(2472) Class333 local2472 = local536[local1281];
				this.aShortArray24[local265] = this.method1876(local1212, local1281, local2472.anInt8552, local1210, local2472.anInt8548, local2472.anInt8553, local2472.anInt8550, local2453, arg1);
				@Pc(2496) Class333 local2496 = local536[local2075];
				this.aShortArray29[local265] = this.method1876(local1216, local2075, local2496.anInt8552, local1214, local2496.anInt8548, local2496.anInt8553, local2496.anInt8550, (long) local1222 + local2453, arg1);
				@Pc(2523) Class333 local2523 = local536[local2080];
				this.aShortArray22[local265] = this.method1876(local1220, local2080, local2523.anInt8552, local1218, local2523.anInt8548, local2523.anInt8553, local2523.anInt8550, local2453 + (long) local1224, arg1);
			} else if (local1261 == 1) {
				@Pc(2555) Class83 local2555 = local821[local1145];
				@Pc(2600) long local2600 = ((long) (local1152 << 8) + (long) (local1226 << 24) + (long) local862 << 32) + (long) ((local2555.anInt2237 + 256 << 22) + (local2555.anInt2240 <= 0 ? 2048 : 1024) + (local851 << 2) + (local2555.anInt2238 + 256 << 12));
				this.aShortArray24[local265] = this.method1876(local1212, arg1.aShortArray125[local1145], local2555.anInt2238, local1210, 0, local2555.anInt2240, local2555.anInt2237, local2600, arg1);
				this.aShortArray29[local265] = this.method1876(local1216, arg1.aShortArray132[local1145], local2555.anInt2238, local1214, 0, local2555.anInt2240, local2555.anInt2237, local2600 + (long) local1222, arg1);
				this.aShortArray22[local265] = this.method1876(local1220, arg1.aShortArray130[local1145], local2555.anInt2238, local1218, 0, local2555.anInt2240, local2555.anInt2237, local2600 + (long) local1224, arg1);
			}
			if (arg1.aByteArray86 != null) {
				this.aByteArray24[local265] = arg1.aByteArray86[local1145];
			}
			if (arg1.aShortArray127 != null) {
				this.aShortArray21[local265] = arg1.aShortArray127[local1145];
			}
			this.aShortArray23[local265] = arg1.aShortArray129[local1145];
			this.aShortArray25[local265] = local1188;
		}
		local1145 = 0;
		local840 = -10000;
		for (local851 = 0; local851 < this.anInt1849; local851++) {
			@Pc(2725) short local2725 = this.aShortArray25[local851];
			if (local2725 != local840) {
				local840 = local2725;
				local1145++;
			}
		}
		this.anIntArray121 = new int[local1145 + 1];
		local840 = -10000;
		local1145 = 0;
		for (local862 = 0; local862 < this.anInt1849; local862++) {
			local1188 = this.aShortArray25[local862];
			if (local840 != local1188) {
				local840 = local1188;
				this.anIntArray121[local1145++] = local862;
			}
		}
		this.anIntArray121[local1145] = this.anInt1849;
		Static453.aLongArray17 = null;
		this.aShortArray30 = Static62.method1354(this.aShortArray30, this.anInt1844);
		this.aShortArray28 = Static62.method1354(this.aShortArray28, this.anInt1844);
		this.aShortArray26 = Static62.method1354(this.aShortArray26, this.anInt1844);
		this.aByteArray25 = Static92.method1878(this.aByteArray25, this.anInt1844);
		this.aFloatArray6 = Static141.method2477(this.anInt1844, this.aFloatArray6);
		this.aFloatArray5 = Static141.method2477(this.anInt1844, this.aFloatArray5);
		if (arg1.anIntArray591 != null && Static85.method1761(arg2, this.anInt1898)) {
			this.anIntArrayArray11 = arg1.method7392(false);
		}
		if (arg1.aClass226Array1 != null && Static265.method3797(this.anInt1898, arg2)) {
			this.anIntArrayArray10 = arg1.method7380();
		}
		if (arg1.anIntArray588 != null && Static475.method6536(this.anInt1898, arg2)) {
			local873 = 0;
			@Pc(2878) int[] local2878 = new int[256];
			for (local895 = 0; local895 < this.anInt1869; local895++) {
				local906 = arg1.anIntArray588[local119[local895]];
				if (local906 >= 0) {
					if (local906 > local873) {
						local873 = local906;
					}
					@Pc(2907) int local2907 = local2878[local906]++;
				}
			}
			this.anIntArrayArray12 = new int[local873 + 1][];
			for (local906 = 0; local906 <= local873; local906++) {
				this.anIntArrayArray12[local906] = new int[local2878[local906]];
				local2878[local906] = 0;
			}
			for (local914 = 0; local914 < this.anInt1869; local914++) {
				local923 = arg1.anIntArray588[local119[local914]];
				if (local923 >= 0) {
					this.anIntArrayArray12[local923][local2878[local923]++] = local914;
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort30;
	}

	@OriginalMember(owner = "client!df", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort26;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!nh;ZII)Z")
	@Override
	public boolean method7341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method1872(arg0, arg2, arg3, arg5, arg4, arg1);
	}

	@OriginalMember(owner = "client!df", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface9 local9 = this.aClass33_Sub3_6.anInterface9_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt1869; local11++) {
			if (this.aShortArray25[local11] == arg0) {
				this.aShortArray25[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class130 local43 = local9.method1558(arg0 & 0xFFFF);
			local33 = local43.aByte38;
			local31 = local43.aByte40;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(64) Class130 local64 = local9.method1558(arg1 & 0xFFFF);
			if (local64.aByte34 != 0 || local64.aByte36 != 0) {
				this.aBoolean123 = true;
			}
			local51 = local64.aByte40;
			local53 = local64.aByte38;
		}
		if (!(local31 != local51 | local33 != local53)) {
			return;
		}
		if (this.aClass75Array1 != null) {
			for (@Pc(104) int local104 = 0; local104 < this.anInt1860; local104++) {
				@Pc(111) Class75 local111 = this.aClass75Array1[local104];
				@Pc(116) Class25 local116 = this.aClass25Array1[local104];
				local116.anInt775 = Static411.anIntArray448[this.aShortArray23[local111.anInt2149] & 0xFFFF] & 0xFFFFFF | local116.anInt775 & 0xFF000000;
			}
		}
		if (this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
	private void method1863() {
		if (!this.aBoolean125) {
			return;
		}
		this.aBoolean125 = false;
		if (this.aClass235Array1 == null && this.aClass170Array1 == null && this.aClass75Array1 == null && !Static101.method2027(this.anInt1859, this.anInt1898)) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			if (this.anIntArray122 != null && !Static666.method8894(this.anInt1898, this.anInt1859)) {
				if (this.aClass327_9 != null && this.aClass327_9.anInterface11_7 == null) {
					this.aBoolean125 = true;
				} else {
					if (!this.aBoolean126) {
						this.method1875();
					}
					local32 = true;
				}
			}
			@Pc(66) boolean local66 = false;
			if (this.anIntArray123 != null && !Static180.method8487(this.anInt1859, this.anInt1898)) {
				if (this.aClass327_9 != null && this.aClass327_9.anInterface11_7 == null) {
					this.aBoolean125 = true;
				} else {
					local34 = true;
					if (!this.aBoolean126) {
						this.method1875();
					}
				}
			}
			if (this.anIntArray120 != null && !Static144.method2499(this.anInt1898, this.anInt1859)) {
				if (this.aClass327_9 != null && this.aClass327_9.anInterface11_7 == null) {
					this.aBoolean125 = true;
				} else {
					if (!this.aBoolean126) {
						this.method1875();
					}
					local66 = true;
				}
			}
			if (local66) {
				this.anIntArray120 = null;
			}
			if (local34) {
				this.anIntArray123 = null;
			}
			if (local32) {
				this.anIntArray122 = null;
			}
		}
		if (this.aShortArray27 != null && this.anIntArray122 == null && this.anIntArray123 == null && this.anIntArray120 == null) {
			this.anIntArray119 = null;
			this.aShortArray27 = null;
		}
		if (this.aByteArray25 != null && !Static444.method6102(this.anInt1859, this.anInt1898)) {
			if (this.aClass327_8 == null) {
				if (this.aClass327_7 != null && this.aClass327_7.anInterface11_7 == null) {
					this.aBoolean125 = true;
				} else {
					this.aShortArray30 = this.aShortArray28 = this.aShortArray26 = null;
					this.aByteArray25 = null;
				}
			} else if (this.aClass327_8.anInterface11_7 == null) {
				this.aBoolean125 = true;
			} else {
				this.aByteArray25 = null;
				this.aShortArray30 = this.aShortArray28 = this.aShortArray26 = null;
			}
		}
		if (this.aShortArray23 != null && !Static285.method4102(this.anInt1859, this.anInt1898)) {
			if (this.aClass327_7 != null && this.aClass327_7.anInterface11_7 == null) {
				this.aBoolean125 = true;
			} else {
				this.aShortArray23 = null;
			}
		}
		if (this.aByteArray24 != null && !Static471.method6507(this.anInt1859, this.anInt1898)) {
			if (this.aClass327_7 != null && this.aClass327_7.anInterface11_7 == null) {
				this.aBoolean125 = true;
			} else {
				this.aByteArray24 = null;
			}
		}
		if (this.aFloatArray6 != null && !Static37.method744(this.anInt1898, this.anInt1859)) {
			if (this.aClass327_10 != null && this.aClass327_10.anInterface11_7 == null) {
				this.aBoolean125 = true;
			} else {
				this.aFloatArray6 = this.aFloatArray5 = null;
			}
		}
		if (this.aShortArray25 != null && !Static186.method2950(this.anInt1859, this.anInt1898)) {
			if (this.aClass327_7 != null && this.aClass327_7.anInterface11_7 == null) {
				this.aBoolean125 = true;
			} else {
				this.aShortArray25 = null;
			}
		}
		if (this.aShortArray24 != null && !Static312.method4348(this.anInt1898, this.anInt1859)) {
			if ((this.aClass302_1 == null || this.aClass302_1.anInterface5_5 != null) && (this.aClass327_7 == null || this.aClass327_7.anInterface11_7 != null)) {
				this.aShortArray24 = this.aShortArray29 = this.aShortArray22 = null;
			} else {
				this.aBoolean125 = true;
			}
		}
		if (this.anIntArrayArray12 != null && !Static475.method6536(this.anInt1898, this.anInt1859)) {
			this.anIntArrayArray12 = null;
			this.aShortArray21 = null;
		}
		if (this.anIntArrayArray11 != null && !Static85.method1761(this.anInt1859, this.anInt1898)) {
			this.anIntArrayArray11 = null;
			this.aShortArray20 = null;
		}
		if (this.anIntArrayArray10 != null && !Static265.method3797(this.anInt1898, this.anInt1859)) {
			this.anIntArrayArray10 = null;
		}
		if (this.anIntArray121 != null && (this.anInt1859 & 0x800) == 0 && (this.anInt1859 & 0x40000) == 0) {
			this.anIntArray121 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(ZI)V")
	private void method1864(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass327_7 != null && this.aClass327_7.anInterface11_7 == null;
		@Pc(27) boolean local27 = this.aClass327_8 != null && this.aClass327_8.anInterface11_7 == null;
		@Pc(38) boolean local38 = this.aClass327_9 != null && this.aClass327_9.anInterface11_7 == null;
		@Pc(49) boolean local49 = this.aClass327_10 != null && this.aClass327_10.anInterface11_7 == null;
		if (arg0) {
			local49 &= (this.aByte19 & 0x8) != 0;
			local16 &= (this.aByte19 & 0x2) != 0;
			local38 &= (this.aByte19 & 0x1) != 0;
			local27 &= (this.aByte19 & 0x4) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local38) {
			local106 = 12;
		}
		@Pc(123) byte local123 = 0;
		if (local16) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local27) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local49) {
			local123 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (this.anInt1844 * local106 > this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3.aByteArray107.length) {
			this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2((this.anInt1844 + 100) * local106);
		} else {
			this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3.anInt10466 = 0;
		}
		@Pc(186) Class4_Sub11_Sub2 local186 = this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3;
		@Pc(194) int local194;
		@Pc(203) int local203;
		@Pc(231) int local231;
		@Pc(240) int local240;
		if (local38) {
			@Pc(210) int local210;
			@Pc(217) int local217;
			@Pc(222) int local222;
			@Pc(229) int local229;
			if (this.aClass33_Sub3_6.aBoolean555) {
				for (local194 = 0; local194 < this.anInt1890; local194++) {
					local203 = Stream.floatToRawIntBits((float) this.anIntArray122[local194]);
					local210 = Stream.floatToRawIntBits((float) this.anIntArray123[local194]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray120[local194]);
					local222 = this.anIntArray119[local194];
					local229 = this.anIntArray119[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray27[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt10466 = local106 * local240;
						local186.method8860(local203);
						local186.method8860(local210);
						local186.method8860(local217);
					}
				}
			} else {
				for (local194 = 0; local194 < this.anInt1890; local194++) {
					local203 = Stream.floatToRawIntBits((float) this.anIntArray122[local194]);
					local210 = Stream.floatToRawIntBits((float) this.anIntArray123[local194]);
					local217 = Stream.floatToRawIntBits((float) this.anIntArray120[local194]);
					local222 = this.anIntArray119[local194];
					local229 = this.anIntArray119[local194 + 1];
					for (local231 = local222; local231 < local229; local231++) {
						local240 = this.aShortArray27[local231] - 1;
						if (local240 == -1) {
							break;
						}
						local186.anInt10466 = local240 * local106;
						local186.method8872(local203);
						local186.method8872(local210);
						local186.method8872(local217);
					}
				}
			}
		}
		@Pc(538) float local538;
		@Pc(442) short[] local442;
		@Pc(445) short[] local445;
		@Pc(439) short[] local439;
		@Pc(436) byte[] local436;
		@Pc(596) float local596;
		if (local16) {
			if (this.aClass327_8 == null) {
				if (this.aClass277_1 == null) {
					local436 = this.aByteArray25;
					local439 = this.aShortArray26;
					local442 = this.aShortArray30;
					local445 = this.aShortArray28;
				} else {
					local436 = this.aClass277_1.aByteArray69;
					local442 = this.aClass277_1.aShortArray90;
					local439 = this.aClass277_1.aShortArray88;
					local445 = this.aClass277_1.aShortArray89;
				}
				@Pc(469) float local469 = this.aClass33_Sub3_6.aFloatArray54[0];
				@Pc(475) float local475 = this.aClass33_Sub3_6.aFloatArray54[1];
				@Pc(481) float local481 = this.aClass33_Sub3_6.aFloatArray54[2];
				@Pc(485) float local485 = this.aClass33_Sub3_6.aFloat176;
				@Pc(495) float local495 = this.aClass33_Sub3_6.aFloat174 * 768.0F / (float) this.aShort25;
				@Pc(505) float local505 = this.aClass33_Sub3_6.aFloat166 * 768.0F / (float) this.aShort25;
				for (@Pc(507) int local507 = 0; local507 < this.anInt1869; local507++) {
					@Pc(527) int local527 = this.method1870(this.aByteArray24[local507], this.aShortArray23[local507], this.aShortArray25[local507], this.aShort27);
					local538 = (float) (local527 >> 16 & 0xFF) * this.aClass33_Sub3_6.aFloat179;
					@Pc(547) float local547 = this.aClass33_Sub3_6.aFloat164 * (float) (local527 >>> 24);
					@Pc(558) float local558 = this.aClass33_Sub3_6.aFloat171 * (float) (local527 >> 8 & 0xFF);
					@Pc(563) short local563 = this.aShortArray24[local507];
					@Pc(568) short local568 = (short) local436[local563];
					if (local568 == 0) {
						local596 = (local481 * (float) local439[local563] + (float) local442[local563] * local469 + (float) local445[local563] * local475) * 0.0026041667F;
					} else {
						local596 = (local469 * (float) local442[local563] + (float) local445[local563] * local475 + (float) local439[local563] * local481) / (float) (local568 * 256);
					}
					@Pc(636) float local636 = local485 + (local596 < 0.0F ? local505 : local495) * local596;
					@Pc(641) int local641 = (int) (local547 * local636);
					if (local641 < 0) {
						local641 = 0;
					} else if (local641 > 255) {
						local641 = 255;
					}
					@Pc(660) int local660 = (int) (local636 * local538);
					@Pc(665) int local665 = (int) (local558 * local636);
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					if (local665 < 0) {
						local665 = 0;
					} else if (local665 > 255) {
						local665 = 255;
					}
					local186.anInt10466 = local110 + local106 * local563;
					local186.method8822(local641);
					local186.method8822(local660);
					local186.method8822(local665);
					local186.method8822(255 - (this.aByteArray24[local507] & 0xFF));
					local563 = this.aShortArray29[local507];
					local568 = (short) local436[local563];
					if (local568 == 0) {
						local596 = (local475 * (float) local445[local563] + (float) local442[local563] * local469 + local481 * (float) local439[local563]) * 0.0026041667F;
					} else {
						local596 = ((float) local442[local563] * local469 + (float) local445[local563] * local475 + (float) local439[local563] * local481) / (float) (local568 * 256);
					}
					local636 = local485 + local596 * (local596 < 0.0F ? local505 : local495);
					local641 = (int) (local547 * local636);
					local660 = (int) (local538 * local636);
					if (local641 < 0) {
						local641 = 0;
					} else if (local641 > 255) {
						local641 = 255;
					}
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local665 = (int) (local558 * local636);
					local186.anInt10466 = local106 * local563 + local110;
					if (local665 < 0) {
						local665 = 0;
					} else if (local665 > 255) {
						local665 = 255;
					}
					local186.method8822(local641);
					local186.method8822(local660);
					local186.method8822(local665);
					local186.method8822(255 - (this.aByteArray24[local507] & 0xFF));
					local563 = this.aShortArray22[local507];
					local568 = (short) local436[local563];
					if (local568 == 0) {
						local596 = (local469 * (float) local442[local563] + local475 * (float) local445[local563] + local481 * (float) local439[local563]) * 0.0026041667F;
					} else {
						local596 = (local481 * (float) local439[local563] + local469 * (float) local442[local563] + local475 * (float) local445[local563]) / (float) (local568 * 256);
					}
					local636 = (local596 < 0.0F ? local505 : local495) * local596 + local485;
					local641 = (int) (local547 * local636);
					local660 = (int) (local538 * local636);
					if (local641 < 0) {
						local641 = 0;
					} else if (local641 > 255) {
						local641 = 255;
					}
					if (local660 < 0) {
						local660 = 0;
					} else if (local660 > 255) {
						local660 = 255;
					}
					local665 = (int) (local636 * local558);
					if (local665 < 0) {
						local665 = 0;
					} else if (local665 > 255) {
						local665 = 255;
					}
					local186.anInt10466 = local110 + local563 * local106;
					local186.method8822(local641);
					local186.method8822(local660);
					local186.method8822(local665);
					local186.method8822(255 - (this.aByteArray24[local507] & 0xFF));
				}
			} else {
				for (local194 = 0; local194 < this.anInt1869; local194++) {
					local203 = this.method1870(this.aByteArray24[local194], this.aShortArray23[local194], this.aShortArray25[local194], this.aShort27);
					local186.anInt10466 = this.aShortArray24[local194] * local106 + local110;
					local186.method8860(local203);
					local186.anInt10466 = local110 + local106 * this.aShortArray29[local194];
					local186.method8860(local203);
					local186.anInt10466 = this.aShortArray22[local194] * local106 + local110;
					local186.method8860(local203);
				}
			}
		}
		if (local27) {
			if (this.aClass277_1 == null) {
				local445 = this.aShortArray28;
				local436 = this.aByteArray25;
				local439 = this.aShortArray26;
				local442 = this.aShortArray30;
			} else {
				local445 = this.aClass277_1.aShortArray89;
				local436 = this.aClass277_1.aByteArray69;
				local439 = this.aClass277_1.aShortArray88;
				local442 = this.aClass277_1.aShortArray90;
			}
			@Pc(1112) float local1112 = 3.0F / (float) this.aShort25;
			local186.anInt10466 = local112;
			local596 = 3.0F / (float) (this.aShort25 / 2 + this.aShort25);
			if (this.aClass33_Sub3_6.aBoolean555) {
				for (local231 = 0; local231 < this.anInt1844; local231++) {
					local240 = local436[local231] & 0xFF;
					if (local240 == 0) {
						local186.method8897((float) local442[local231] * local596);
						local186.method8897(local596 * (float) local445[local231]);
						local186.method8897((float) local439[local231] * local596);
					} else {
						local538 = local1112 / (float) local240;
						local186.method8897((float) local442[local231] * local538);
						local186.method8897((float) local445[local231] * local538);
						local186.method8897(local538 * (float) local439[local231]);
					}
					local186.anInt10466 += local106 - 12;
				}
			} else {
				for (local231 = 0; local231 < this.anInt1844; local231++) {
					local240 = local436[local231] & 0xFF;
					if (local240 == 0) {
						local186.method8895((float) local442[local231] * local596);
						local186.method8895(local596 * (float) local445[local231]);
						local186.method8895(local596 * (float) local439[local231]);
					} else {
						local538 = local1112 / (float) local240;
						local186.method8895(local538 * (float) local442[local231]);
						local186.method8895((float) local445[local231] * local538);
						local186.method8895((float) local439[local231] * local538);
					}
					local186.anInt10466 += local106 - 12;
				}
			}
		}
		if (local49) {
			local186.anInt10466 = local123;
			if (this.aClass33_Sub3_6.aBoolean555) {
				for (local194 = 0; local194 < this.anInt1844; local194++) {
					local186.method8897(this.aFloatArray6[local194]);
					local186.method8897(this.aFloatArray5[local194]);
					local186.anInt10466 += local106 - 8;
				}
			} else {
				for (local194 = 0; local194 < this.anInt1844; local194++) {
					local186.method8895(this.aFloatArray6[local194]);
					local186.method8895(this.aFloatArray5[local194]);
					local186.anInt10466 += local106 - 8;
				}
			}
		}
		local186.anInt10466 = this.anInt1844 * local106;
		@Pc(1424) Interface11 local1424;
		if (arg0) {
			if (this.anInterface11_3 == null) {
				this.anInterface11_3 = this.aClass33_Sub3_6.method6308(local186.anInt10466, true, local186.aByteArray107, local106);
			} else {
				this.anInterface11_3.method7229(local186.anInt10466, local106, local186.aByteArray107);
			}
			local1424 = this.anInterface11_3;
			this.aByte19 = 0;
		} else {
			local1424 = this.aClass33_Sub3_6.method6308(local186.anInt10466, false, local186.aByteArray107, local106);
			this.aBoolean125 = true;
		}
		if (local38) {
			this.aClass327_9.anInterface11_7 = local1424;
			this.aClass327_9.aByte118 = 0;
		}
		if (local49) {
			this.aClass327_10.aByte118 = local123;
			this.aClass327_10.anInterface11_7 = local1424;
		}
		if (local16) {
			this.aClass327_7.aByte118 = local110;
			this.aClass327_7.anInterface11_7 = local1424;
		}
		if (local27) {
			this.aClass327_8.anInterface11_7 = local1424;
			this.aClass327_8.aByte118 = local112;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nfa;I)V")
	private void method1866(@OriginalArg(0) Class4_Sub5_Sub9_Sub2 arg0) {
		if (this.anInt1844 > this.aClass33_Sub3_6.anIntArray489.length) {
			this.aClass33_Sub3_6.anIntArray491 = new int[this.anInt1844];
			this.aClass33_Sub3_6.anIntArray489 = new int[this.anInt1844];
		}
		@Pc(28) int[] local28 = this.aClass33_Sub3_6.anIntArray489;
		@Pc(32) int[] local32 = this.aClass33_Sub3_6.anIntArray491;
		@Pc(61) int local61;
		@Pc(100) int local100;
		@Pc(109) int local109;
		for (@Pc(34) int local34 = 0; local34 < this.anInt1890; local34++) {
			local61 = (this.anIntArray122[local34] - (this.anIntArray123[local34] * this.aClass33_Sub3_6.anInt7282 >> 8) >> this.aClass33_Sub3_6.anInt7265) - arg0.anInt5831;
			@Pc(86) int local86 = (this.anIntArray120[local34] - (this.anIntArray123[local34] * this.aClass33_Sub3_6.anInt7283 >> 8) >> this.aClass33_Sub3_6.anInt7265) - arg0.anInt5830;
			@Pc(91) int local91 = this.anIntArray119[local34];
			@Pc(98) int local98 = this.anIntArray119[local34 + 1];
			for (local100 = local91; local100 < local98; local100++) {
				local109 = this.aShortArray27[local100] - 1;
				if (local109 == -1) {
					break;
				}
				local28[local109] = local61;
				local32[local109] = local86;
			}
		}
		for (local61 = 0; local61 < this.anInt1849; local61++) {
			if (this.aByteArray24 == null || this.aByteArray24[local61] <= 128) {
				@Pc(153) short local153 = this.aShortArray24[local61];
				@Pc(158) short local158 = this.aShortArray29[local61];
				@Pc(163) short local163 = this.aShortArray22[local61];
				local100 = local28[local153];
				local109 = local28[local158];
				@Pc(175) int local175 = local28[local163];
				@Pc(179) int local179 = local32[local153];
				@Pc(183) int local183 = local32[local158];
				@Pc(187) int local187 = local32[local163];
				if ((local100 - local109) * (local183 + -local187) - (local175 - local109) * (-local179 + local183) > 0) {
					arg0.method5116(local183, local175, local179, local109, local187, local100);
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean123;
	}

	@OriginalMember(owner = "client!df", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort22;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt1869; local7++) {
			local16 = this.aShortArray23[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local46 -= -(arg3 * (arg2 - local46) >> 7);
			}
			this.aShortArray23[local7] = (short) (local46 | local22 << 10 | local28 << 7);
		}
		if (this.aClass75Array1 != null) {
			for (local16 = 0; local16 < this.anInt1860; local16++) {
				@Pc(107) Class75 local107 = this.aClass75Array1[local16];
				@Pc(112) Class25 local112 = this.aClass25Array1[local16];
				local112.anInt775 = local112.anInt775 & 0xFF000000 | Static411.anIntArray448[this.aShortArray23[local107.anInt2149] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort28;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "()Z")
	@Override
	public boolean method7344() {
		if (this.aShortArray25 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray25.length; local12++) {
			if (this.aShortArray25[local12] != -1 && !this.aClass33_Sub3_6.anInterface9_12.method1557(this.aShortArray25[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIBIIIIII)Z")
	private boolean method1867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 > arg7 && arg1 > arg7 && arg4 > arg7) {
			return false;
		} else if (arg7 > arg5 && arg7 > arg1 && arg4 < arg7) {
			return false;
		} else if (arg2 > arg3 && arg3 < arg0 && arg3 < arg6) {
			return false;
		} else {
			return arg2 >= arg3 || arg3 <= arg0 || arg3 <= arg6;
		}
	}

	@OriginalMember(owner = "client!df", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt1890; local15++) {
			local33 = local9 * this.anIntArray120[local15] + local13 * this.anIntArray122[local15] >> 14;
			this.anIntArray120[local15] = local13 * this.anIntArray120[local15] - this.anIntArray122[local15] * local9 >> 14;
			this.anIntArray122[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt1844; local33++) {
			@Pc(83) int local83 = this.aShortArray30[local33] * local13 + local9 * this.aShortArray26[local33] >> 14;
			this.aShortArray26[local33] = (short) (this.aShortArray26[local33] * local13 - local9 * this.aShortArray30[local33] >> 14);
			this.aShortArray30[local33] = (short) local83;
		}
		if (this.aClass327_8 == null && this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
		}
		if (this.aClass327_8 != null) {
			this.aClass327_8.anInterface11_7 = null;
		}
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1890; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray120[local15] + local13 * this.anIntArray122[local15] >> 14;
			this.anIntArray120[local15] = local13 * this.anIntArray120[local15] - this.anIntArray122[local15] * local9 >> 14;
			this.anIntArray122[local15] = local33;
		}
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nh;)V")
	@Override
	public void method7336(@OriginalArg(0) Class92 arg0) {
		@Pc(8) Class92_Sub2 local8 = (Class92_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass235Array1 != null) {
			for (local13 = 0; local13 < this.aClass235Array1.length; local13++) {
				@Pc(20) Class235 local20 = this.aClass235Array1[local13];
				@Pc(22) Class235 local22 = local20;
				if (local20.aClass235_2 != null) {
					local22 = local20.aClass235_2;
				}
				local22.anInt5628 = (int) ((float) this.anIntArray120[local20.anInt5635] * local8.aFloat84 + (float) this.anIntArray122[local20.anInt5635] * local8.aFloat81 + local8.aFloat75 * (float) this.anIntArray123[local20.anInt5635] + local8.aFloat82);
				local22.anInt5637 = (int) (local8.aFloat77 * (float) this.anIntArray120[local20.anInt5635] + local8.aFloat80 * (float) this.anIntArray122[local20.anInt5635] + local8.aFloat78 * (float) this.anIntArray123[local20.anInt5635] + local8.aFloat74);
				local22.anInt5632 = (int) (local8.aFloat79 * (float) this.anIntArray123[local20.anInt5635] + local8.aFloat85 * (float) this.anIntArray122[local20.anInt5635] + local8.aFloat76 * (float) this.anIntArray120[local20.anInt5635] + local8.aFloat83);
				local22.anInt5627 = (int) (local8.aFloat82 + local8.aFloat81 * (float) this.anIntArray122[local20.anInt5634] + (float) this.anIntArray123[local20.anInt5634] * local8.aFloat75 + (float) this.anIntArray120[local20.anInt5634] * local8.aFloat84);
				local22.anInt5629 = (int) (local8.aFloat74 + local8.aFloat78 * (float) this.anIntArray123[local20.anInt5634] + (float) this.anIntArray122[local20.anInt5634] * local8.aFloat80 + (float) this.anIntArray120[local20.anInt5634] * local8.aFloat77);
				local22.anInt5623 = (int) ((float) this.anIntArray123[local20.anInt5634] * local8.aFloat79 + local8.aFloat85 * (float) this.anIntArray122[local20.anInt5634] + (float) this.anIntArray120[local20.anInt5634] * local8.aFloat76 + local8.aFloat83);
				local22.anInt5624 = (int) (local8.aFloat82 + local8.aFloat81 * (float) this.anIntArray122[local20.anInt5631] + local8.aFloat75 * (float) this.anIntArray123[local20.anInt5631] + (float) this.anIntArray120[local20.anInt5631] * local8.aFloat84);
				local22.anInt5626 = (int) (local8.aFloat74 + (float) this.anIntArray120[local20.anInt5631] * local8.aFloat77 + local8.aFloat78 * (float) this.anIntArray123[local20.anInt5631] + (float) this.anIntArray122[local20.anInt5631] * local8.aFloat80);
				local22.anInt5636 = (int) (local8.aFloat76 * (float) this.anIntArray120[local20.anInt5631] + (float) this.anIntArray123[local20.anInt5631] * local8.aFloat79 + local8.aFloat85 * (float) this.anIntArray122[local20.anInt5631] + local8.aFloat83);
			}
		}
		if (this.aClass170Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass170Array1.length; local13++) {
			@Pc(365) Class170 local365 = this.aClass170Array1[local13];
			@Pc(367) Class170 local367 = local365;
			if (local365.aClass170_2 != null) {
				local367 = local365.aClass170_2;
			}
			if (local365.aClass92_3 == null) {
				local365.aClass92_3 = local8.method3857();
			} else {
				local365.aClass92_3.method3865(local8);
			}
			local367.anInt4272 = (int) ((float) this.anIntArray120[local365.anInt4269] * local8.aFloat84 + (float) this.anIntArray122[local365.anInt4269] * local8.aFloat81 + local8.aFloat75 * (float) this.anIntArray123[local365.anInt4269] + local8.aFloat82);
			local367.anInt4275 = (int) (local8.aFloat78 * (float) this.anIntArray123[local365.anInt4269] + local8.aFloat80 * (float) this.anIntArray122[local365.anInt4269] + (float) this.anIntArray120[local365.anInt4269] * local8.aFloat77 + local8.aFloat74);
			local367.anInt4270 = (int) (local8.aFloat83 + (float) this.anIntArray120[local365.anInt4269] * local8.aFloat76 + (float) this.anIntArray123[local365.anInt4269] * local8.aFloat79 + local8.aFloat85 * (float) this.anIntArray122[local365.anInt4269]);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!nh;ZI)Z")
	@Override
	public boolean method7347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class92 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method1872(arg0, arg2, arg3, -1, arg4, arg1);
	}

	@OriginalMember(owner = "client!df", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt1859;
	}

	@OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V")
	private void method1869() {
		if (this.anInt1849 == 0) {
			return;
		}
		if (this.aByte19 != 0) {
			this.method1864(true);
		}
		this.method1864(false);
		if (this.aClass302_1 != null) {
			if (this.aClass302_1.anInterface5_5 == null) {
				this.method1873((this.aByte19 & 0x10) != 0);
			}
			if (this.aClass302_1.anInterface5_5 != null) {
				this.aClass33_Sub3_6.method6296(this.aClass327_8 != null);
				this.aClass33_Sub3_6.method6339(this.aClass327_10, this.aClass327_9, this.aClass327_7, this.aClass327_8);
				@Pc(81) int local81 = this.anIntArray121.length - 1;
				for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
					@Pc(90) int local90 = this.anIntArray121[local83];
					@Pc(97) int local97 = this.anIntArray121[local83 + 1];
					@Pc(104) int local104 = this.aShortArray25[local90] & 0xFFFF;
					if (local104 == 65535) {
						local104 = -1;
					}
					this.aClass33_Sub3_6.method6370(local104, this.aClass327_8 != null);
					this.aClass33_Sub3_6.method6348(local90 * 3, (local97 - local90) * 3, this.aClass302_1.anInterface5_5);
				}
			}
		}
		this.method1863();
	}

	@OriginalMember(owner = "client!df", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort29;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nh;Lclient!gca;II)V")
	@Override
	public void method7332(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt1844 == 0) {
			return;
		}
		@Pc(13) Class92_Sub2 local13 = this.aClass33_Sub3_6.aClass92_Sub2_3;
		@Pc(16) Class92_Sub2 local16 = (Class92_Sub2) arg0;
		if (!this.aBoolean126) {
			this.method1875();
		}
		Static530.aFloat197 = local13.aFloat79 * local16.aFloat74 + local13.aFloat85 * local16.aFloat82 + local16.aFloat83 * local13.aFloat76 + local13.aFloat83;
		Static87.aFloat33 = local13.aFloat76 * local16.aFloat79 + local16.aFloat78 * local13.aFloat79 + local16.aFloat75 * local13.aFloat85;
		@Pc(69) float local69 = (float) this.aShort30 * Static87.aFloat33 + Static530.aFloat197;
		@Pc(77) float local77 = (float) this.aShort26 * Static87.aFloat33 + Static530.aFloat197;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.aShort28;
			local94 = (float) -this.aShort28 + local77;
		} else {
			local94 = local69 - (float) this.aShort28;
			local87 = (float) this.aShort28 + local77;
		}
		if (this.aClass33_Sub3_6.aFloat180 <= local94 || (float) this.aClass33_Sub3_6.anInt7300 >= local87) {
			return;
		}
		Static188.aFloat70 = local13.aFloat82 + local16.aFloat74 * local13.aFloat75 + local16.aFloat82 * local13.aFloat81 + local16.aFloat83 * local13.aFloat84;
		Static259.aFloat99 = local16.aFloat78 * local13.aFloat75 + local16.aFloat75 * local13.aFloat81 + local16.aFloat79 * local13.aFloat84;
		@Pc(170) float local170 = (float) this.aShort30 * Static259.aFloat99 + Static188.aFloat70;
		@Pc(178) float local178 = (float) this.aShort26 * Static259.aFloat99 + Static188.aFloat70;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (local170 + (float) this.aShort28) * (float) this.aClass33_Sub3_6.anInt7304;
			local205 = (local178 - (float) this.aShort28) * (float) this.aClass33_Sub3_6.anInt7304;
		} else {
			local193 = ((float) this.aShort28 + local178) * (float) this.aClass33_Sub3_6.anInt7304;
			local205 = (float) this.aClass33_Sub3_6.anInt7304 * ((float) -this.aShort28 + local170);
		}
		if (local205 / (float) arg2 >= this.aClass33_Sub3_6.aFloat173 || local193 / (float) arg2 <= this.aClass33_Sub3_6.aFloat177) {
			return;
		}
		Static454.aFloat184 = local13.aFloat77 * local16.aFloat79 + local16.aFloat75 * local13.aFloat80 + local16.aFloat78 * local13.aFloat78;
		Static189.aFloat71 = local13.aFloat78 * local16.aFloat74 + local13.aFloat80 * local16.aFloat82 + local16.aFloat83 * local13.aFloat77 + local13.aFloat74;
		@Pc(296) float local296 = Static189.aFloat71 + (float) this.aShort30 * Static454.aFloat184;
		@Pc(304) float local304 = (float) this.aShort26 * Static454.aFloat184 + Static189.aFloat71;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local296 > local304) {
			local320 = ((float) -this.aShort28 + local304) * (float) this.aClass33_Sub3_6.anInt7280;
			local331 = (float) this.aClass33_Sub3_6.anInt7280 * ((float) this.aShort28 + local296);
		} else {
			local331 = (local304 + (float) this.aShort28) * (float) this.aClass33_Sub3_6.anInt7280;
			local320 = (float) this.aClass33_Sub3_6.anInt7280 * (local296 - (float) this.aShort28);
		}
		if (this.aClass33_Sub3_6.aFloat162 <= local320 / (float) arg2 || this.aClass33_Sub3_6.aFloat167 >= local331 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass75Array1 != null) {
			Static134.aFloat55 = local13.aFloat78 * local16.aFloat77 + local13.aFloat80 * local16.aFloat84 + local13.aFloat77 * local16.aFloat76;
			Static597.aFloat208 = local13.aFloat76 * local16.aFloat76 + local13.aFloat79 * local16.aFloat77 + local16.aFloat84 * local13.aFloat85;
			Static303.aFloat112 = local13.aFloat84 * local16.aFloat76 + local13.aFloat81 * local16.aFloat84 + local13.aFloat75 * local16.aFloat77;
			Static220.aFloat86 = local16.aFloat80 * local13.aFloat78 + local16.aFloat81 * local13.aFloat80 + local16.aFloat85 * local13.aFloat77;
			Static504.aFloat191 = local13.aFloat84 * local16.aFloat85 + local16.aFloat80 * local13.aFloat75 + local16.aFloat81 * local13.aFloat81;
			Static468.aFloat186 = local13.aFloat79 * local16.aFloat80 + local16.aFloat81 * local13.aFloat85 + local13.aFloat76 * local16.aFloat85;
		}
		if (arg1 != null) {
			@Pc(498) int local498 = this.aShort29 + this.aShort24 >> 1;
			@Pc(506) int local506 = this.aShort23 + this.aShort31 >> 1;
			@Pc(525) int local525 = (int) (Static303.aFloat112 * (float) local506 + Static259.aFloat99 * (float) this.aShort30 + Static188.aFloat70 + (float) local498 * Static504.aFloat191);
			@Pc(544) int local544 = (int) ((float) local506 * Static134.aFloat55 + (float) this.aShort30 * Static454.aFloat184 + Static189.aFloat71 + Static220.aFloat86 * (float) local498);
			@Pc(563) int local563 = (int) (Static468.aFloat186 * (float) local498 + Static530.aFloat197 + (float) this.aShort30 * Static87.aFloat33 + (float) local506 * Static597.aFloat208);
			@Pc(582) int local582 = (int) (Static303.aFloat112 * (float) local506 + (float) this.aShort26 * Static259.aFloat99 + Static188.aFloat70 + Static504.aFloat191 * (float) local498);
			@Pc(601) int local601 = (int) (Static134.aFloat55 * (float) local506 + Static454.aFloat184 * (float) this.aShort26 + (float) local498 * Static220.aFloat86 + Static189.aFloat71);
			arg1.anInt3113 = this.aClass33_Sub3_6.anInt7277 + local582 * this.aClass33_Sub3_6.anInt7304 / arg2;
			arg1.anInt3111 = local544 * this.aClass33_Sub3_6.anInt7280 / arg2 + this.aClass33_Sub3_6.anInt7297;
			arg1.anInt3115 = this.aClass33_Sub3_6.anInt7280 * local601 / arg2 + this.aClass33_Sub3_6.anInt7297;
			arg1.anInt3114 = this.aClass33_Sub3_6.anInt7277 + this.aClass33_Sub3_6.anInt7304 * local525 / arg2;
			@Pc(673) int local673 = (int) (Static597.aFloat208 * (float) local506 + (float) this.aShort26 * Static87.aFloat33 + (float) local498 * Static468.aFloat186 + Static530.aFloat197);
			if (local563 >= this.aClass33_Sub3_6.anInt7300 || local673 >= this.aClass33_Sub3_6.anInt7300) {
				arg1.aBoolean234 = true;
				arg1.anInt3112 = (local525 + this.aShort28) * this.aClass33_Sub3_6.anInt7304 / arg2 + this.aClass33_Sub3_6.anInt7277 - arg1.anInt3114;
			}
		}
		this.aClass33_Sub3_6.method6362((float) arg2);
		this.aClass33_Sub3_6.method6338();
		this.aClass33_Sub3_6.method6369(local16);
		this.method1869();
		this.aClass33_Sub3_6.method6327();
		this.method1874();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BISII)I")
	private int method1870(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14 = Static411.anIntArray448[Static356.method4762(arg1, arg3)];
		if (arg2 != -1) {
			@Pc(27) Class130 local27 = this.aClass33_Sub3_6.anInterface9_12.method1558(arg2 & 0xFFFF);
			@Pc(32) int local32 = local27.aByte40 & 0xFF;
			@Pc(49) int local49;
			@Pc(71) int local71;
			if (local32 != 0) {
				if (arg3 < 0) {
					local49 = 0;
				} else if (arg3 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg3 * 131586;
				}
				if (local32 == 256) {
					local14 = local49;
				} else {
					local71 = 256 - local32;
					local14 = (local71 * (local14 & 0xFF00FF) + (local49 & 0xFF00FF) * local32 & 0xFF00FF00) + ((local14 & 0xFF00) * local71 + local32 * (local49 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local49 = local27.aByte38 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(121) int local121 = (local14 >> 16 & 0xFF) * local49;
				if (local121 > 65535) {
					local121 = 65535;
				}
				local71 = local49 * (local14 >> 8 & 0xFF);
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(147) int local147 = (local14 & 0xFF) * local49;
				if (local147 > 65535) {
					local147 = 65535;
				}
				local14 = ((local121 & 0x1E00FF00) << 8) + ((local71 & 0xFF00) + (local147 >> 8));
			}
		}
		return (local14 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!df", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static393.anInt5779 = 0;
			local11 = 0;
			Static531.anInt8221 = 0;
			Static388.anInt5685 = 0;
			for (local17 = 0; local17 < this.anInt1890; local17++) {
				Static393.anInt5779 += this.anIntArray122[local17];
				Static388.anInt5685 += this.anIntArray123[local17];
				local11++;
				Static531.anInt8221 += this.anIntArray120[local17];
			}
			if (local11 <= 0) {
				Static393.anInt5779 = arg1;
				Static531.anInt8221 = arg3;
				Static388.anInt5685 = arg2;
			} else {
				Static393.anInt5779 = Static393.anInt5779 / local11 + arg1;
				Static388.anInt5685 = arg2 + Static388.anInt5685 / local11;
				Static531.anInt8221 = Static531.anInt8221 / local11 + arg3;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt1890; local11++) {
				this.anIntArray122[local11] += arg1;
				this.anIntArray123[local11] += arg2;
				this.anIntArray120[local11] += arg3;
			}
		} else {
			@Pc(169) int local169;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt1890; local11++) {
					this.anIntArray122[local11] -= Static393.anInt5779;
					this.anIntArray123[local11] -= Static388.anInt5685;
					this.anIntArray120[local11] -= Static531.anInt8221;
					if (arg3 != 0) {
						local17 = Class4_Sub2_Sub26.anIntArray563[arg3];
						local169 = Class4_Sub2_Sub26.anIntArray562[arg3];
						local187 = local169 * this.anIntArray122[local11] + local17 * this.anIntArray123[local11] + 16383 >> 14;
						this.anIntArray123[local11] = this.anIntArray123[local11] * local169 + 16383 - local17 * this.anIntArray122[local11] >> 14;
						this.anIntArray122[local11] = local187;
					}
					if (arg1 != 0) {
						local17 = Class4_Sub2_Sub26.anIntArray563[arg1];
						local169 = Class4_Sub2_Sub26.anIntArray562[arg1];
						local187 = this.anIntArray123[local11] * local169 + 16383 - local17 * this.anIntArray120[local11] >> 14;
						this.anIntArray120[local11] = this.anIntArray120[local11] * local169 + local17 * this.anIntArray123[local11] + 16383 >> 14;
						this.anIntArray123[local11] = local187;
					}
					if (arg2 != 0) {
						local17 = Class4_Sub2_Sub26.anIntArray563[arg2];
						local169 = Class4_Sub2_Sub26.anIntArray562[arg2];
						local187 = this.anIntArray120[local11] * local17 + this.anIntArray122[local11] * local169 + 16383 >> 14;
						this.anIntArray120[local11] = this.anIntArray120[local11] * local169 + 16383 - this.anIntArray122[local11] * local17 >> 14;
						this.anIntArray122[local11] = local187;
					}
					this.anIntArray122[local11] += Static393.anInt5779;
					this.anIntArray123[local11] += Static388.anInt5685;
					this.anIntArray120[local11] += Static531.anInt8221;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt1890; local11++) {
					this.anIntArray122[local11] -= Static393.anInt5779;
					this.anIntArray123[local11] -= Static388.anInt5685;
					this.anIntArray120[local11] -= Static531.anInt8221;
					this.anIntArray122[local11] = this.anIntArray122[local11] * arg1 / 128;
					this.anIntArray123[local11] = this.anIntArray123[local11] * arg2 / 128;
					this.anIntArray120[local11] = this.anIntArray120[local11] * arg3 / 128;
					this.anIntArray122[local11] += Static393.anInt5779;
					this.anIntArray123[local11] += Static388.anInt5685;
					this.anIntArray120[local11] += Static531.anInt8221;
				}
			} else {
				@Pc(526) Class75 local526;
				@Pc(531) Class25 local531;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt1869; local11++) {
						local17 = arg1 * 8 + (this.aByteArray24[local11] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray24[local11] = (byte) local17;
					}
					if (this.aClass327_7 != null) {
						this.aClass327_7.anInterface11_7 = null;
					}
					if (this.aClass75Array1 != null) {
						for (local17 = 0; local17 < this.anInt1860; local17++) {
							local526 = this.aClass75Array1[local17];
							local531 = this.aClass25Array1[local17];
							local531.anInt775 = 255 - (this.aByteArray24[local526.anInt2149] & 0xFF) << 24 | local531.anInt775 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt1869; local11++) {
						local17 = this.aShortArray23[local11] & 0xFFFF;
						local169 = local17 >> 10 & 0x3F;
						local187 = local17 >> 7 & 0x7;
						@Pc(594) int local594 = arg1 + local169 & 0x3F;
						@Pc(598) int local598 = local17 & 0x7F;
						local187 += arg2 / 4;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						local598 += arg3;
						if (local598 < 0) {
							local598 = 0;
						} else if (local598 > 127) {
							local598 = 127;
						}
						this.aShortArray23[local11] = (short) (local187 << 7 | local594 << 10 | local598);
					}
					if (this.aClass327_7 != null) {
						this.aClass327_7.anInterface11_7 = null;
					}
					if (this.aClass75Array1 != null) {
						for (local17 = 0; local17 < this.anInt1860; local17++) {
							local526 = this.aClass75Array1[local17];
							local531 = this.aClass25Array1[local17];
							local531.anInt775 = Static411.anIntArray448[this.aShortArray23[local526.anInt2149] & 0xFFFF] & 0xFFFFFF | local531.anInt775 & 0xFF000000;
						}
					}
				} else {
					@Pc(711) Class25 local711;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt1860; local11++) {
							local711 = this.aClass25Array1[local11];
							local711.anInt771 += arg2;
							local711.anInt770 += arg1;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt1860; local11++) {
							local711 = this.aClass25Array1[local11];
							local711.anInt769 = arg1 * local711.anInt769 >> 7;
							local711.anInt777 = local711.anInt777 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt1860; local11++) {
							local711 = this.aClass25Array1[local11];
							local711.anInt776 = local711.anInt776 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean124;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7339(@OriginalArg(0) Class62 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class62_Sub1 local8 = (Class62_Sub1) arg0;
		if (this.anInt1869 == 0 || local8.anInt1869 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt1890;
		@Pc(24) int[] local24 = local8.anIntArray122;
		@Pc(27) int[] local27 = local8.anIntArray123;
		@Pc(30) int[] local30 = local8.anIntArray120;
		@Pc(33) short[] local33 = local8.aShortArray30;
		@Pc(36) short[] local36 = local8.aShortArray28;
		@Pc(39) short[] local39 = local8.aShortArray26;
		@Pc(42) byte[] local42 = local8.aByteArray25;
		@Pc(53) short[] local53;
		@Pc(51) short[] local51;
		@Pc(47) short[] local47;
		@Pc(49) byte[] local49;
		if (this.aClass277_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local49 = this.aClass277_1.aByteArray69;
			local47 = this.aClass277_1.aShortArray88;
			local51 = this.aClass277_1.aShortArray89;
			local53 = this.aClass277_1.aShortArray90;
		}
		@Pc(80) short[] local80;
		@Pc(76) short[] local76;
		@Pc(82) short[] local82;
		@Pc(78) byte[] local78;
		if (local8.aClass277_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local76 = local8.aClass277_1.aShortArray89;
			local80 = local8.aClass277_1.aShortArray90;
			local78 = local8.aClass277_1.aByteArray69;
			local82 = local8.aClass277_1.aShortArray88;
		}
		@Pc(103) int[] local103 = local8.anIntArray119;
		@Pc(106) short[] local106 = local8.aShortArray27;
		if (!local8.aBoolean126) {
			local8.method1875();
		}
		@Pc(115) short local115 = local8.aShort30;
		@Pc(118) short local118 = local8.aShort26;
		@Pc(121) short local121 = local8.aShort24;
		@Pc(124) short local124 = local8.aShort29;
		@Pc(127) short local127 = local8.aShort23;
		@Pc(130) short local130 = local8.aShort31;
		for (@Pc(132) int local132 = 0; local132 < this.anInt1890; local132++) {
			@Pc(142) int local142 = this.anIntArray123[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray122[local132] - arg1;
				if (local162 >= local121 && local124 >= local162) {
					@Pc(182) int local182 = this.anIntArray120[local132] - arg3;
					if (local182 >= local127 && local182 <= local130) {
						@Pc(200) int local200 = -1;
						@Pc(205) int local205 = this.anIntArray119[local132];
						@Pc(212) int local212 = this.anIntArray119[local132 + 1];
						for (@Pc(214) int local214 = local205; local214 < local212; local214++) {
							local200 = this.aShortArray27[local214] - 1;
							if (local200 == -1 || this.aByteArray25[local200] != 0) {
								break;
							}
						}
						if (local200 != -1) {
							for (@Pc(248) int local248 = 0; local248 < local21; local248++) {
								if (local24[local248] == local162 && local30[local248] == local182 && local142 == local27[local248]) {
									local205 = local103[local248];
									@Pc(279) int local279 = -1;
									local212 = local103[local248 + 1];
									for (@Pc(287) int local287 = local205; local287 < local212; local287++) {
										local279 = local106[local287] - 1;
										if (local279 == -1 || local42[local279] != 0) {
											break;
										}
									}
									if (local279 != -1) {
										if (local53 == null) {
											this.aClass277_1 = new Class277();
											local53 = this.aClass277_1.aShortArray90 = Static208.method3119(this.aShortArray30);
											local51 = this.aClass277_1.aShortArray89 = Static208.method3119(this.aShortArray28);
											local47 = this.aClass277_1.aShortArray88 = Static208.method3119(this.aShortArray26);
											local49 = this.aClass277_1.aByteArray69 = Static96.method1972(this.aByteArray25);
										}
										if (local80 == null) {
											@Pc(370) Class277 local370 = local8.aClass277_1 = new Class277();
											local80 = local370.aShortArray90 = Static208.method3119(local33);
											local76 = local370.aShortArray89 = Static208.method3119(local36);
											local82 = local370.aShortArray88 = Static208.method3119(local39);
											local78 = local370.aByteArray69 = Static96.method1972(local42);
										}
										@Pc(403) short local403 = this.aShortArray30[local200];
										@Pc(408) short local408 = this.aShortArray28[local200];
										@Pc(413) short local413 = this.aShortArray26[local200];
										@Pc(418) byte local418 = this.aByteArray25[local200];
										local212 = local103[local248 + 1];
										local205 = local103[local248];
										@Pc(438) int local438;
										for (@Pc(430) int local430 = local205; local430 < local212; local430++) {
											local438 = local106[local430] - 1;
											if (local438 == -1) {
												break;
											}
											if (local78[local438] != 0) {
												local80[local438] += local403;
												local76[local438] += local408;
												local82[local438] += local413;
												local78[local438] += local418;
											}
										}
										local403 = local33[local279];
										local205 = this.anIntArray119[local132];
										local212 = this.anIntArray119[local132 + 1];
										local408 = local36[local279];
										local413 = local39[local279];
										local418 = local42[local279];
										for (local438 = local205; local438 < local212; local438++) {
											@Pc(525) int local525 = this.aShortArray27[local438] - 1;
											if (local525 == -1) {
												break;
											}
											if (local49[local525] != 0) {
												local53[local525] += local403;
												local51[local525] += local408;
												local47[local525] += local413;
												local49[local525] += local418;
											}
										}
										if (this.aClass327_8 == null && this.aClass327_7 != null) {
											this.aClass327_7.anInterface11_7 = null;
										}
										if (this.aClass327_8 != null) {
											this.aClass327_8.anInterface11_7 = null;
										}
										if (local8.aClass327_8 == null && local8.aClass327_7 != null) {
											local8.aClass327_7.anInterface11_7 = null;
										}
										if (local8.aClass327_8 != null) {
											local8.aClass327_8.anInterface11_7 = null;
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

	@OriginalMember(owner = "client!df", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1890; local15++) {
			@Pc(34) int local34 = this.anIntArray123[local15] * local13 - this.anIntArray120[local15] * local9 >> 14;
			this.anIntArray120[local15] = this.anIntArray120[local15] * local13 + local9 * this.anIntArray123[local15] >> 14;
			this.anIntArray123[local15] = local34;
		}
		this.aBoolean126 = false;
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class4_Sub5_Sub9 ba(@OriginalArg(0) Class4_Sub5_Sub9 arg0) {
		if (this.anInt1844 == 0) {
			return null;
		}
		if (!this.aBoolean126) {
			this.method1875();
		}
		@Pc(42) int local42;
		@Pc(58) int local58;
		if (this.aClass33_Sub3_6.anInt7282 <= 0) {
			local42 = this.aShort24 - (this.aShort30 * this.aClass33_Sub3_6.anInt7282 >> 8) >> this.aClass33_Sub3_6.anInt7265;
			local58 = this.aShort29 - (this.aShort26 * this.aClass33_Sub3_6.anInt7282 >> 8) >> this.aClass33_Sub3_6.anInt7265;
		} else {
			local42 = this.aShort24 - (this.aClass33_Sub3_6.anInt7282 * this.aShort26 >> 8) >> this.aClass33_Sub3_6.anInt7265;
			local58 = this.aShort29 - (this.aClass33_Sub3_6.anInt7282 * this.aShort30 >> 8) >> this.aClass33_Sub3_6.anInt7265;
		}
		@Pc(117) int local117;
		@Pc(133) int local133;
		if (this.aClass33_Sub3_6.anInt7283 > 0) {
			local117 = this.aShort23 - (this.aClass33_Sub3_6.anInt7283 * this.aShort26 >> 8) >> this.aClass33_Sub3_6.anInt7265;
			local133 = this.aShort31 - (this.aClass33_Sub3_6.anInt7283 * this.aShort30 >> 8) >> this.aClass33_Sub3_6.anInt7265;
		} else {
			local117 = this.aShort23 - (this.aClass33_Sub3_6.anInt7283 * this.aShort30 >> 8) >> this.aClass33_Sub3_6.anInt7265;
			local133 = this.aShort31 - (this.aClass33_Sub3_6.anInt7283 * this.aShort26 >> 8) >> this.aClass33_Sub3_6.anInt7265;
		}
		@Pc(176) int local176 = local58 + 1 - local42;
		@Pc(183) int local183 = local133 + 1 - local117;
		@Pc(186) Class4_Sub5_Sub9_Sub2 local186 = (Class4_Sub5_Sub9_Sub2) arg0;
		@Pc(202) Class4_Sub5_Sub9_Sub2 local202;
		if (local186 != null && local186.method5118(local183, local176)) {
			local202 = local186;
			local186.method5117();
		} else {
			local202 = new Class4_Sub5_Sub9_Sub2(this.aClass33_Sub3_6, local176, local183);
		}
		local202.method5115(local58, local42, local133, local117);
		this.method1866(local202);
		return local202;
	}

	@OriginalMember(owner = "client!df", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray11 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt1873; local12++) {
			this.anIntArray122[local12] <<= 0x4;
			this.anIntArray123[local12] <<= 0x4;
			this.anIntArray120[local12] <<= 0x4;
		}
		Static393.anInt5779 = 0;
		Static531.anInt8221 = 0;
		Static388.anInt5685 = 0;
		return true;
	}

	@OriginalMember(owner = "client!df", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class4_Sub2_Sub26.anIntArray563[arg0];
		@Pc(13) int local13 = Class4_Sub2_Sub26.anIntArray562[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt1890; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray123[local15] + local13 * this.anIntArray122[local15] >> 14;
			this.anIntArray123[local15] = this.anIntArray123[local15] * local13 - local9 * this.anIntArray122[local15] >> 14;
			this.anIntArray122[local15] = local34;
		}
		this.aBoolean126 = false;
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class42 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean126) {
			this.method1875();
		}
		@Pc(16) int local16 = this.aShort24 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort29;
		@Pc(26) int local26 = this.aShort23 + arg6;
		@Pc(31) int local31 = this.aShort31 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt8631 >> arg2.anInt8635 >= arg2.anInt8638 || local26 < 0 || local31 + arg2.anInt8631 >> arg2.anInt8635 >= arg2.anInt8630)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8638 <= arg3.anInt8631 + local21 >> arg3.anInt8635 || local26 < 0 || local31 + arg3.anInt8631 >> arg3.anInt8635 >= arg3.anInt8630) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8635;
			local21 = arg2.anInt8631 + local21 - 1 >> arg2.anInt8635;
			local26 >>= arg2.anInt8635;
			local31 = arg2.anInt8631 + local31 - 1 >> arg2.anInt8635;
			if (arg5 == arg2.method7450(local26, local16) && arg5 == arg2.method7450(local26, local21) && arg5 == arg2.method7450(local31, local16) && arg5 == arg2.method7450(local31, local21)) {
				return;
			}
		}
		@Pc(197) int local197;
		if (arg0 == 1) {
			for (local197 = 0; local197 < this.anInt1890; local197++) {
				this.anIntArray123[local197] = this.anIntArray123[local197] + arg2.method7453(arg4 + this.anIntArray122[local197], this.anIntArray120[local197] - -arg6) - arg5;
			}
		} else {
			@Pc(205) int local205;
			@Pc(213) int local213;
			if (arg0 == 2) {
				@Pc(422) short local422 = this.aShort30;
				if (local422 == 0) {
					return;
				}
				for (local205 = 0; local205 < this.anInt1890; local205++) {
					local213 = (this.anIntArray123[local205] << 16) / local422;
					if (local213 < arg1) {
						this.anIntArray123[local205] -= -((arg1 - local213) * (-arg5 + arg2.method7453(this.anIntArray122[local205] + arg4, arg6 + this.anIntArray120[local205])) / arg1);
					}
				}
			} else {
				@Pc(221) int local221;
				if (arg0 == 3) {
					local197 = (arg1 & 0xFF) * 4;
					local205 = (arg1 >> 8 & 0xFF) * 4;
					local213 = (arg1 >> 16 & 0xFF) << 6;
					local221 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local197 >> 1) < 0 || arg2.anInt8631 + (local197 >> 1) + arg4 >= arg2.anInt8638 << arg2.anInt8635 || arg6 - (local205 >> 1) < 0 || (local205 >> 1) + arg6 + arg2.anInt8631 >= arg2.anInt8630 << arg2.anInt8635) {
						return;
					}
					this.method7343(local221, local205, arg2, arg4, local197, local213, arg5, arg6);
				} else if (arg0 == 4) {
					local197 = this.aShort26 - this.aShort30;
					for (local205 = 0; local205 < this.anInt1890; local205++) {
						this.anIntArray123[local205] = this.anIntArray123[local205] + arg3.method7453(this.anIntArray122[local205] + arg4, arg6 + this.anIntArray120[local205]) + local197 - arg5;
					}
				} else if (arg0 == 5) {
					local197 = this.aShort26 - this.aShort30;
					for (local205 = 0; local205 < this.anInt1890; local205++) {
						local213 = arg4 + this.anIntArray122[local205];
						local221 = this.anIntArray120[local205] + arg6;
						@Pc(373) int local373 = arg2.method7453(local213, local221);
						@Pc(379) int local379 = arg3.method7453(local213, local221);
						@Pc(387) int local387 = local373 - local379 - arg1;
						this.anIntArray123[local205] = (local387 * ((this.anIntArray123[local205] << 8) / local197) >> 8) + local373 - arg5;
					}
				}
			}
		}
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!df", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort23;
	}

	@OriginalMember(owner = "client!df", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1890; local7++) {
			this.anIntArray120[local7] = -this.anIntArray120[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1844; local29++) {
			this.aShortArray26[local29] = (short) -this.aShortArray26[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt1869; local48++) {
			@Pc(55) short local55 = this.aShortArray24[local48];
			this.aShortArray24[local48] = this.aShortArray22[local48];
			this.aShortArray22[local48] = local55;
		}
		if (this.aClass327_8 == null && this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
		}
		if (this.aClass327_8 != null) {
			this.aClass327_8.anInterface11_7 = null;
		}
		if (this.aClass302_1 != null) {
			this.aClass302_1.anInterface5_5 = null;
		}
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
		this.aBoolean126 = false;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nh;IZ)V")
	@Override
	public void method7350(@OriginalArg(0) Class92 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray20 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt1890; local14++) {
			if ((this.aShortArray20[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method3867(this.anIntArray122[local14], this.anIntArray123[local14], this.anIntArray120[local14], local12);
				} else {
					arg0.method3862(this.anIntArray122[local14], this.anIntArray123[local14], this.anIntArray120[local14], local12);
				}
				this.anIntArray122[local14] = local12[0];
				this.anIntArray123[local14] = local12[1];
				this.anIntArray120[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "()V")
	@Override
	protected void method7345() {
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	@Override
	public void method7338() {
		if (this.anInt1844 <= 0 || this.anInt1849 <= 0) {
			return;
		}
		this.method1864(false);
		if ((this.aByte19 & 0x10) == 0 && this.aClass302_1.anInterface5_5 == null) {
			this.method1873(false);
		}
		this.method1863();
	}

	@OriginalMember(owner = "client!df", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort27 = (short) arg0;
		if (this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt1859 = arg0;
		this.aBoolean125 = true;
		if (this.aClass277_1 != null && (this.anInt1859 & 0x10000) == 0) {
			this.aShortArray30 = this.aClass277_1.aShortArray90;
			this.aShortArray28 = this.aClass277_1.aShortArray89;
			this.aByteArray25 = this.aClass277_1.aByteArray69;
			this.aShortArray26 = this.aClass277_1.aShortArray88;
			this.aClass277_1 = null;
		}
		this.method1863();
	}

	@OriginalMember(owner = "client!df", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort25;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()[Lclient!ir;")
	@Override
	public Class170[] method7333() {
		return this.aClass170Array1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!nh;Lclient!gca;I)V")
	@Override
	public void method7335(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt1844 == 0) {
			return;
		}
		@Pc(16) Class92_Sub2 local16 = this.aClass33_Sub3_6.aClass92_Sub2_3;
		@Pc(19) Class92_Sub2 local19 = (Class92_Sub2) arg0;
		if (!this.aBoolean126) {
			this.method1875();
		}
		Static530.aFloat197 = local16.aFloat83 + local19.aFloat74 * local16.aFloat79 + local19.aFloat82 * local16.aFloat85 + local19.aFloat83 * local16.aFloat76;
		Static87.aFloat33 = local19.aFloat75 * local16.aFloat85 + local16.aFloat79 * local19.aFloat78 + local16.aFloat76 * local19.aFloat79;
		@Pc(72) float local72 = Static87.aFloat33 * (float) this.aShort30 + Static530.aFloat197;
		@Pc(80) float local80 = Static530.aFloat197 + (float) this.aShort26 * Static87.aFloat33;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = (float) this.aShort28 + local72;
			local96 = local80 - (float) this.aShort28;
		} else {
			local96 = (float) -this.aShort28 + local72;
			local90 = (float) this.aShort28 + local80;
		}
		if (local96 >= this.aClass33_Sub3_6.aFloat172 || local90 <= (float) this.aClass33_Sub3_6.anInt7300) {
			return;
		}
		Static259.aFloat99 = local19.aFloat79 * local16.aFloat84 + local19.aFloat78 * local16.aFloat75 + local16.aFloat81 * local19.aFloat75;
		Static188.aFloat70 = local16.aFloat81 * local19.aFloat82 + local19.aFloat74 * local16.aFloat75 + local16.aFloat84 * local19.aFloat83 + local16.aFloat82;
		@Pc(173) float local173 = Static259.aFloat99 * (float) this.aShort30 + Static188.aFloat70;
		@Pc(181) float local181 = Static259.aFloat99 * (float) this.aShort26 + Static188.aFloat70;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local196 = (local181 - (float) this.aShort28) * (float) this.aClass33_Sub3_6.anInt7304;
			local207 = (float) this.aClass33_Sub3_6.anInt7304 * (local173 + (float) this.aShort28);
		} else {
			local207 = (float) this.aClass33_Sub3_6.anInt7304 * (local181 + (float) this.aShort28);
			local196 = ((float) -this.aShort28 + local173) * (float) this.aClass33_Sub3_6.anInt7304;
		}
		if (local196 / local90 >= this.aClass33_Sub3_6.aFloat173 || local207 / local90 <= this.aClass33_Sub3_6.aFloat177) {
			return;
		}
		Static189.aFloat71 = local19.aFloat83 * local16.aFloat77 + local19.aFloat74 * local16.aFloat78 + local16.aFloat80 * local19.aFloat82 + local16.aFloat74;
		Static454.aFloat184 = local16.aFloat77 * local19.aFloat79 + local16.aFloat78 * local19.aFloat78 + local19.aFloat75 * local16.aFloat80;
		@Pc(297) float local297 = Static189.aFloat71 + Static454.aFloat184 * (float) this.aShort30;
		@Pc(305) float local305 = (float) this.aShort26 * Static454.aFloat184 + Static189.aFloat71;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local320 = (float) this.aClass33_Sub3_6.anInt7280 * (local305 - (float) this.aShort28);
			local331 = ((float) this.aShort28 + local297) * (float) this.aClass33_Sub3_6.anInt7280;
		} else {
			local331 = (local305 + (float) this.aShort28) * (float) this.aClass33_Sub3_6.anInt7280;
			local320 = (local297 - (float) this.aShort28) * (float) this.aClass33_Sub3_6.anInt7280;
		}
		if (local320 / local90 >= this.aClass33_Sub3_6.aFloat162 || this.aClass33_Sub3_6.aFloat167 >= local331 / local90) {
			return;
		}
		if (arg1 != null || this.aClass75Array1 != null) {
			Static468.aFloat186 = local16.aFloat76 * local19.aFloat85 + local19.aFloat80 * local16.aFloat79 + local16.aFloat85 * local19.aFloat81;
			Static134.aFloat55 = local16.aFloat77 * local19.aFloat76 + local19.aFloat77 * local16.aFloat78 + local16.aFloat80 * local19.aFloat84;
			Static504.aFloat191 = local16.aFloat84 * local19.aFloat85 + local16.aFloat81 * local19.aFloat81 + local19.aFloat80 * local16.aFloat75;
			Static597.aFloat208 = local16.aFloat76 * local19.aFloat76 + local19.aFloat84 * local16.aFloat85 + local16.aFloat79 * local19.aFloat77;
			Static303.aFloat112 = local19.aFloat84 * local16.aFloat81 + local16.aFloat75 * local19.aFloat77 + local19.aFloat76 * local16.aFloat84;
			Static220.aFloat86 = local16.aFloat80 * local19.aFloat81 + local16.aFloat78 * local19.aFloat80 + local19.aFloat85 * local16.aFloat77;
		}
		if (arg1 != null) {
			@Pc(490) boolean local490 = false;
			@Pc(492) boolean local492 = true;
			@Pc(501) int local501 = this.aShort24 + this.aShort29 >> 1;
			@Pc(510) int local510 = this.aShort23 + this.aShort31 >> 1;
			@Pc(529) int local529 = (int) ((float) this.aShort30 * Static259.aFloat99 + Static188.aFloat70 + (float) local501 * Static504.aFloat191 + Static303.aFloat112 * (float) local510);
			@Pc(548) int local548 = (int) (Static134.aFloat55 * (float) local510 + Static189.aFloat71 + Static220.aFloat86 * (float) local501 + (float) this.aShort30 * Static454.aFloat184);
			@Pc(567) int local567 = (int) ((float) this.aShort30 * Static87.aFloat33 + Static468.aFloat186 * (float) local501 + Static530.aFloat197 + (float) local510 * Static597.aFloat208);
			if (this.aClass33_Sub3_6.anInt7300 > local567) {
				local490 = true;
			} else {
				arg1.anInt3114 = this.aClass33_Sub3_6.anInt7304 * local529 / local567 + this.aClass33_Sub3_6.anInt7277;
				arg1.anInt3111 = this.aClass33_Sub3_6.anInt7297 + local548 * this.aClass33_Sub3_6.anInt7280 / local567;
			}
			@Pc(625) int local625 = (int) (Static303.aFloat112 * (float) local510 + (float) this.aShort26 * Static259.aFloat99 + Static188.aFloat70 + Static504.aFloat191 * (float) local501);
			@Pc(644) int local644 = (int) (Static134.aFloat55 * (float) local510 + (float) this.aShort26 * Static454.aFloat184 + Static220.aFloat86 * (float) local501 + Static189.aFloat71);
			@Pc(663) int local663 = (int) ((float) this.aShort26 * Static87.aFloat33 + Static468.aFloat186 * (float) local501 + Static530.aFloat197 + Static597.aFloat208 * (float) local510);
			if (local663 < this.aClass33_Sub3_6.anInt7300) {
				local490 = true;
			} else {
				arg1.anInt3113 = this.aClass33_Sub3_6.anInt7277 + local625 * this.aClass33_Sub3_6.anInt7304 / local663;
				arg1.anInt3115 = local644 * this.aClass33_Sub3_6.anInt7280 / local663 + this.aClass33_Sub3_6.anInt7297;
			}
			if (local490) {
				if (this.aClass33_Sub3_6.anInt7300 > local567 && local663 < this.aClass33_Sub3_6.anInt7300) {
					local492 = false;
				} else {
					@Pc(747) int local747;
					@Pc(758) int local758;
					@Pc(769) int local769;
					if (this.aClass33_Sub3_6.anInt7300 > local567) {
						local747 = (local663 - this.aClass33_Sub3_6.anInt7300 << 16) / (local663 - local567);
						local758 = local625 + (local747 * (local625 - local529) >> 16);
						arg1.anInt3114 = this.aClass33_Sub3_6.anInt7277 + local758 * this.aClass33_Sub3_6.anInt7304 / this.aClass33_Sub3_6.anInt7300;
						local769 = local644 + (local747 * (local644 - local548) >> 16);
						arg1.anInt3111 = this.aClass33_Sub3_6.anInt7280 * local769 / this.aClass33_Sub3_6.anInt7300 + this.aClass33_Sub3_6.anInt7297;
					} else if (local663 < this.aClass33_Sub3_6.anInt7300) {
						local747 = (local567 - this.aClass33_Sub3_6.anInt7300 << 16) / (local567 - local663);
						local758 = (local747 * (local529 - local625) >> 16) + local529;
						local769 = ((local548 - local644) * local747 >> 16) + local548;
						arg1.anInt3114 = this.aClass33_Sub3_6.anInt7277 + local758 * this.aClass33_Sub3_6.anInt7304 / this.aClass33_Sub3_6.anInt7300;
						arg1.anInt3111 = local769 * this.aClass33_Sub3_6.anInt7280 / this.aClass33_Sub3_6.anInt7300 + this.aClass33_Sub3_6.anInt7297;
					}
				}
			}
			if (local492) {
				arg1.aBoolean234 = true;
				if (local663 < local567) {
					arg1.anInt3112 = (this.aShort28 + local529) * this.aClass33_Sub3_6.anInt7304 / local567 + this.aClass33_Sub3_6.anInt7277 - arg1.anInt3114;
				} else {
					arg1.anInt3112 = this.aClass33_Sub3_6.anInt7277 + this.aClass33_Sub3_6.anInt7304 * (this.aShort28 + local625) / local663 - arg1.anInt3113;
				}
			}
		}
		this.aClass33_Sub3_6.method6346();
		this.aClass33_Sub3_6.method6369(local19);
		this.method1869();
		this.aClass33_Sub3_6.method6327();
		this.method1874();
	}

	@OriginalMember(owner = "client!df", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort27;
	}

	@OriginalMember(owner = "client!df", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1890; local3++) {
			if (arg0 != 128) {
				this.anIntArray122[local3] = arg0 * this.anIntArray122[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray123[local3] = arg1 * this.anIntArray123[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray120[local3] = arg2 * this.anIntArray120[local3] >> 7;
			}
		}
		this.aBoolean126 = false;
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort31;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IILclient!nh;ZIII)Z")
	private boolean method1872(@OriginalArg(0) int arg0, @OriginalArg(2) Class92 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class92_Sub2 local8 = (Class92_Sub2) arg1;
		@Pc(12) Class92_Sub2 local12 = this.aClass33_Sub3_6.aClass92_Sub2_3;
		@Pc(33) float local33 = local8.aFloat74 * local12.aFloat75 + local8.aFloat82 * local12.aFloat81 + local8.aFloat83 * local12.aFloat84 + local12.aFloat82;
		@Pc(54) float local54 = local8.aFloat83 * local12.aFloat77 + local8.aFloat74 * local12.aFloat78 + local12.aFloat80 * local8.aFloat82 + local12.aFloat74;
		Static454.aFloat184 = local12.aFloat77 * local8.aFloat79 + local12.aFloat78 * local8.aFloat78 + local8.aFloat75 * local12.aFloat80;
		Static504.aFloat191 = local8.aFloat85 * local12.aFloat84 + local12.aFloat81 * local8.aFloat81 + local12.aFloat75 * local8.aFloat80;
		@Pc(111) float local111 = local12.aFloat83 + local8.aFloat83 * local12.aFloat76 + local8.aFloat82 * local12.aFloat85 + local8.aFloat74 * local12.aFloat79;
		Static597.aFloat208 = local12.aFloat76 * local8.aFloat76 + local12.aFloat79 * local8.aFloat77 + local8.aFloat84 * local12.aFloat85;
		Static303.aFloat112 = local12.aFloat75 * local8.aFloat77 + local12.aFloat81 * local8.aFloat84 + local8.aFloat76 * local12.aFloat84;
		Static87.aFloat33 = local12.aFloat79 * local8.aFloat78 + local12.aFloat85 * local8.aFloat75 + local8.aFloat79 * local12.aFloat76;
		Static134.aFloat55 = local8.aFloat77 * local12.aFloat78 + local8.aFloat84 * local12.aFloat80 + local12.aFloat77 * local8.aFloat76;
		Static220.aFloat86 = local12.aFloat80 * local8.aFloat81 + local8.aFloat80 * local12.aFloat78 + local8.aFloat85 * local12.aFloat77;
		Static259.aFloat99 = local8.aFloat75 * local12.aFloat81 + local12.aFloat75 * local8.aFloat78 + local8.aFloat79 * local12.aFloat84;
		Static468.aFloat186 = local8.aFloat80 * local12.aFloat79 + local12.aFloat85 * local8.aFloat81 + local12.aFloat76 * local8.aFloat85;
		@Pc(239) boolean local239 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass33_Sub3_6.anInt7304;
		@Pc(261) int local261 = this.aClass33_Sub3_6.anInt7280;
		if (!this.aBoolean126) {
			this.method1875();
		}
		@Pc(276) int local276 = this.aShort29 - this.aShort24 >> 1;
		@Pc(285) int local285 = this.aShort26 - this.aShort30 >> 1;
		@Pc(294) int local294 = this.aShort31 - this.aShort23 >> 1;
		@Pc(299) int local299 = local276 + this.aShort24;
		@Pc(305) int local305 = this.aShort30 + local285;
		@Pc(310) int local310 = this.aShort23 + local294;
		@Pc(317) int local317 = local299 - (local276 << arg4);
		@Pc(324) int local324 = local305 - (local285 << arg4);
		@Pc(331) int local331 = local310 - (local294 << arg4);
		@Pc(337) int local337 = (local276 << arg4) + local299;
		@Pc(343) int local343 = (local285 << arg4) + local305;
		Static615.anIntArray662[0] = local317;
		@Pc(353) int local353 = (local294 << arg4) + local310;
		Static522.anIntArray555[0] = local324;
		Static437.anIntArray704[0] = local331;
		Static615.anIntArray662[1] = local337;
		Static522.anIntArray555[1] = local324;
		Static437.anIntArray704[1] = local331;
		Static615.anIntArray662[2] = local317;
		Static522.anIntArray555[2] = local343;
		Static615.anIntArray662[3] = local337;
		Static437.anIntArray704[2] = local331;
		Static522.anIntArray555[3] = local343;
		Static615.anIntArray662[4] = local317;
		Static437.anIntArray704[3] = local331;
		Static522.anIntArray555[4] = local324;
		Static615.anIntArray662[5] = local337;
		Static437.anIntArray704[4] = local353;
		Static522.anIntArray555[5] = local324;
		Static437.anIntArray704[5] = local353;
		Static615.anIntArray662[6] = local317;
		Static522.anIntArray555[6] = local343;
		Static615.anIntArray662[7] = local337;
		Static437.anIntArray704[6] = local353;
		Static522.anIntArray555[7] = local343;
		Static437.anIntArray704[7] = local353;
		@Pc(506) float local506;
		@Pc(492) float local492;
		@Pc(478) float local478;
		@Pc(464) float local464;
		@Pc(454) float local454;
		@Pc(459) float local459;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = (float) Static522.anIntArray555[local447];
			local459 = (float) Static437.anIntArray704[local447];
			local464 = (float) Static615.anIntArray662[local447];
			local478 = local111 + Static87.aFloat33 * local454 + Static468.aFloat186 * local464 + local459 * Static597.aFloat208;
			local492 = local54 + local459 * Static134.aFloat55 + Static220.aFloat86 * local464 + local454 * Static454.aFloat184;
			local506 = local454 * Static259.aFloat99 + local464 * Static504.aFloat191 + Static303.aFloat112 * local459 + local33;
			if ((float) this.aClass33_Sub3_6.anInt7300 <= local478) {
				if (arg3 > 0) {
					local478 = (float) arg3;
				}
				@Pc(533) float local533 = (float) local257 * local506 / local478 + (float) this.aClass33_Sub3_6.anInt7277;
				if (local247 > local533) {
					local247 = local533;
				}
				if (local249 < local533) {
					local249 = local533;
				}
				@Pc(557) float local557 = (float) local261 * local492 / local478 + (float) this.aClass33_Sub3_6.anInt7297;
				if (local557 < local251) {
					local251 = local557;
				}
				local239 = true;
				if (local253 < local557) {
					local253 = local557;
				}
			}
		}
		if (local239 && local247 < (float) arg0 && (float) arg0 < local249 && (float) arg5 > local251 && (float) arg5 < local253) {
			if (arg2) {
				return true;
			}
			if (this.aClass33_Sub3_6.anIntArray489.length < this.anInt1844) {
				this.aClass33_Sub3_6.anIntArray489 = new int[this.anInt1844];
				this.aClass33_Sub3_6.anIntArray491 = new int[this.anInt1844];
			}
			@Pc(628) int[] local628 = this.aClass33_Sub3_6.anIntArray489;
			@Pc(632) int[] local632 = this.aClass33_Sub3_6.anIntArray491;
			@Pc(721) int local721;
			for (@Pc(634) int local634 = 0; local634 < this.anInt1890; local634++) {
				local454 = (float) this.anIntArray123[local634];
				local459 = (float) this.anIntArray120[local634];
				local464 = (float) this.anIntArray122[local634];
				local506 = local459 * Static303.aFloat112 + Static504.aFloat191 * local464 + local454 * Static259.aFloat99 + local33;
				local478 = local111 + Static468.aFloat186 * local464 + Static87.aFloat33 * local454 + Static597.aFloat208 * local459;
				local492 = local459 * Static134.aFloat55 + Static220.aFloat86 * local464 + Static454.aFloat184 * local454 + local54;
				@Pc(734) int local734;
				@Pc(739) int local739;
				@Pc(746) int local746;
				if ((float) this.aClass33_Sub3_6.anInt7300 <= local478) {
					if (arg3 > 0) {
						local478 = (float) arg3;
					}
					local721 = (int) (local506 * (float) local257 / local478 + (float) this.aClass33_Sub3_6.anInt7277);
					local734 = (int) (local492 * (float) local261 / local478 + (float) this.aClass33_Sub3_6.anInt7297);
					local739 = this.anIntArray119[local634];
					local746 = this.anIntArray119[local634 + 1];
					for (@Pc(748) int local748 = local739; local748 < local746; local748++) {
						@Pc(757) int local757 = this.aShortArray27[local748] - 1;
						if (local757 == -1) {
							break;
						}
						local628[local757] = local721;
						local632[local757] = local734;
					}
				} else {
					local721 = this.anIntArray119[local634];
					local734 = this.anIntArray119[local634 + 1];
					for (local739 = local721; local739 < local734; local739++) {
						local746 = this.aShortArray27[local739] - 1;
						if (local746 == -1) {
							break;
						}
						local628[this.aShortArray27[local739] - 1] = -999999;
					}
				}
			}
			for (local721 = 0; local721 < this.anInt1869; local721++) {
				if (local628[this.aShortArray24[local721]] != -999999 && local628[this.aShortArray29[local721]] != -999999 && local628[this.aShortArray22[local721]] != -999999 && this.method1867(local628[this.aShortArray29[local721]], local632[this.aShortArray29[local721]], local628[this.aShortArray24[local721]], arg0, local632[this.aShortArray22[local721]], local632[this.aShortArray24[local721]], local628[this.aShortArray22[local721]], arg5)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!df", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1890; local3++) {
			if (arg0 != 0) {
				this.anIntArray122[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray123[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray120[local3] += arg2;
			}
		}
		this.aBoolean126 = false;
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(ZI)V")
	private void method1873(@OriginalArg(0) boolean arg0) {
		if (this.anInt1849 * 6 <= this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3.aByteArray107.length) {
			this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3.anInt10466 = 0;
		} else {
			this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3 = new Class4_Sub11_Sub2(this.anInt1849 * 6 + 600);
		}
		@Pc(48) Class4_Sub11_Sub2 local48 = this.aClass33_Sub3_6.aClass4_Sub11_Sub2_3;
		@Pc(54) int local54;
		if (this.aClass33_Sub3_6.aBoolean555) {
			for (local54 = 0; local54 < this.anInt1849; local54++) {
				local48.method8838(this.aShortArray24[local54]);
				local48.method8838(this.aShortArray29[local54]);
				local48.method8838(this.aShortArray22[local54]);
			}
		} else {
			for (local54 = 0; local54 < this.anInt1849; local54++) {
				local48.method8848(this.aShortArray24[local54]);
				local48.method8848(this.aShortArray29[local54]);
				local48.method8848(this.aShortArray22[local54]);
			}
		}
		if (local48.anInt10466 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface5_2 == null) {
				this.anInterface5_2 = this.aClass33_Sub3_6.method6352(local48.anInt10466, local48.aByteArray107, true);
			} else {
				this.anInterface5_2.method8458(local48.anInt10466, local48.aByteArray107);
			}
			this.aClass302_1.anInterface5_5 = this.anInterface5_2;
		} else {
			this.aClass302_1.anInterface5_5 = this.aClass33_Sub3_6.method6352(local48.anInt10466, local48.aByteArray107, false);
		}
		if (!arg0) {
			this.aBoolean125 = true;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
	private void method1874() {
		if (this.aClass75Array1 == null) {
			return;
		}
		@Pc(18) Class92_Sub2 local18 = this.aClass33_Sub3_6.aClass92_Sub2_2;
		this.aClass33_Sub3_6.method6367();
		this.aClass33_Sub3_6.C(!this.aBoolean124);
		this.aClass33_Sub3_6.method6296(false);
		this.aClass33_Sub3_6.method6339(this.aClass33_Sub3_6.aClass327_15, this.aClass33_Sub3_6.aClass327_14, (Class327) null, (Class327) null);
		for (@Pc(52) int local52 = 0; local52 < this.anInt1860; local52++) {
			@Pc(59) Class75 local59 = this.aClass75Array1[local52];
			@Pc(64) Class25 local64 = this.aClass25Array1[local52];
			if (!local59.aBoolean140 || !this.aClass33_Sub3_6.method8136()) {
				@Pc(93) float local93 = (float) (this.anIntArray122[local59.anInt2150] + this.anIntArray122[local59.anInt2152] + this.anIntArray122[local59.anInt2148]) * 0.3333333F;
				@Pc(114) float local114 = (float) (this.anIntArray123[local59.anInt2148] + this.anIntArray123[local59.anInt2150] + this.anIntArray123[local59.anInt2152]) * 0.3333333F;
				@Pc(135) float local135 = (float) (this.anIntArray120[local59.anInt2152] + this.anIntArray120[local59.anInt2150] + this.anIntArray120[local59.anInt2148]) * 0.3333333F;
				@Pc(149) float local149 = Static188.aFloat70 + Static259.aFloat99 * local114 + Static504.aFloat191 * local93 + local135 * Static303.aFloat112;
				@Pc(163) float local163 = local135 * Static134.aFloat55 + local114 * Static454.aFloat184 + local93 * Static220.aFloat86 + Static189.aFloat71;
				@Pc(177) float local177 = Static468.aFloat186 * local93 + Static87.aFloat33 * local114 + Static597.aFloat208 * local135 + Static530.aFloat197;
				@Pc(198) float local198 = (float) (1.0D / Math.sqrt((double) (local177 * local177 + local149 * local149 + local163 * local163))) * (float) local59.anInt2153;
				local18.method3220(local198 * local177 - local177, local149 + (float) local64.anInt770 - local198 * local149, local64.anInt776, (float) local64.anInt771 + local198 * local163 - local163, local59.aShort38 * local64.anInt769 >> 7, local64.anInt777 * local59.aShort36 >> 7);
				this.aClass33_Sub3_6.method6301(local18);
				@Pc(249) int local249 = local64.anInt775;
				OpenGL.glColor4ub((byte) (local249 >> 16), (byte) (local249 >> 8), (byte) local249, (byte) (local249 >> 24));
				this.aClass33_Sub3_6.method6305(local59.aShort37);
				this.aClass33_Sub3_6.method6292(local59.aByte21);
				this.aClass33_Sub3_6.method6349(4);
			}
		}
		this.aClass33_Sub3_6.C(true);
		this.aClass33_Sub3_6.method6327();
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	private void method1875() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt1890; local31++) {
			@Pc(38) int local38 = this.anIntArray122[local31];
			@Pc(43) int local43 = this.anIntArray123[local31];
			if (local15 < local43) {
				local15 = local43;
			}
			@Pc(57) int local57 = this.anIntArray120[local31];
			if (local13 < local38) {
				local13 = local38;
			}
			if (local9 > local43) {
				local9 = local43;
			}
			if (local38 < local7) {
				local7 = local38;
			}
			if (local57 < local11) {
				local11 = local57;
			}
			if (local17 < local57) {
				local17 = local57;
			}
			@Pc(107) int local107 = local38 * local38 + local57 * local57;
			if (local107 > local19) {
				local19 = local107;
			}
			local107 = local43 * local43 + local38 * local38 + local57 * local57;
			if (local21 < local107) {
				local21 = local107;
			}
		}
		this.aShort24 = (short) local7;
		this.aShort30 = (short) local9;
		this.aShort31 = (short) local17;
		this.aShort29 = (short) local13;
		this.aShort23 = (short) local11;
		this.aShort26 = (short) local15;
		this.aShort28 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort22 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean126 = true;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(FIIBFIIIJLclient!so;)S")
	private short method1876(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) Class334 arg8) {
		@Pc(10) int local10 = this.anIntArray119[arg1];
		@Pc(17) int local17 = this.anIntArray119[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray27[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg7 == Static453.aLongArray17[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray27[local19] = (short) (this.anInt1844 + 1);
		Static453.aLongArray17[local19] = arg7;
		this.aShortArray30[this.anInt1844] = (short) arg5;
		this.aShortArray28[this.anInt1844] = (short) arg2;
		this.aShortArray26[this.anInt1844] = (short) arg6;
		this.aByteArray25[this.anInt1844] = (byte) arg4;
		this.aFloatArray6[this.anInt1844] = arg3;
		this.aFloatArray5[this.anInt1844] = arg0;
		return (short) this.anInt1844++;
	}

	@OriginalMember(owner = "client!df", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean126) {
			this.method1875();
		}
		return this.aShort24;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()[Lclient!mk;")
	@Override
	public Class235[] method7331() {
		return this.aClass235Array1;
	}

	@OriginalMember(owner = "client!df", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1869; local7++) {
			if (this.aShortArray23[local7] == arg0) {
				this.aShortArray23[local7] = arg1;
			}
		}
		if (this.aClass75Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt1860; local30++) {
				@Pc(37) Class75 local37 = this.aClass75Array1[local30];
				@Pc(42) Class25 local42 = this.aClass25Array1[local30];
				local42.anInt775 = local42.anInt775 & 0xFF000000 | Static411.anIntArray448[this.aShortArray23[local37.anInt2149] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!df;ZBLclient!df;IZ)Lclient!ka;")
	private Class62 method1877(@OriginalArg(0) Class62_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class62_Sub1 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg2.anInt1890 = this.anInt1890;
		if ((arg3 & 0x100) == 0) {
			arg2.aBoolean124 = this.aBoolean124;
		} else {
			arg2.aBoolean124 = true;
		}
		arg2.anInt1860 = this.anInt1860;
		arg2.aShort27 = this.aShort27;
		arg2.anInt1849 = this.anInt1849;
		arg2.aBoolean123 = this.aBoolean123;
		arg2.aByte19 = 0;
		arg2.anInt1873 = this.anInt1873;
		arg2.aShort25 = this.aShort25;
		arg2.anInt1859 = arg3;
		arg2.anInt1844 = this.anInt1844;
		arg2.anInt1869 = this.anInt1869;
		arg2.anInt1898 = this.anInt1898;
		@Pc(70) boolean local70 = Static386.method4993(arg3, this.anInt1898);
		@Pc(76) boolean local76 = Static615.method8045(arg3, this.anInt1898);
		@Pc(82) boolean local82 = Static180.method8497(this.anInt1898, arg3);
		@Pc(88) boolean local88 = local82 | local76 | local70;
		@Pc(203) int local203;
		if (local88) {
			if (!local70) {
				arg2.anIntArray122 = this.anIntArray122;
			} else if (arg0.anIntArray122 == null || this.anInt1873 > arg0.anIntArray122.length) {
				arg2.anIntArray122 = arg0.anIntArray122 = new int[this.anInt1873];
			} else {
				arg2.anIntArray122 = arg0.anIntArray122;
			}
			if (!local76) {
				arg2.anIntArray123 = this.anIntArray123;
			} else if (arg0.anIntArray123 == null || this.anInt1873 > arg0.anIntArray123.length) {
				arg2.anIntArray123 = arg0.anIntArray123 = new int[this.anInt1873];
			} else {
				arg2.anIntArray123 = arg0.anIntArray123;
			}
			if (!local82) {
				arg2.anIntArray120 = this.anIntArray120;
			} else if (arg0.anIntArray120 == null || this.anInt1873 > arg0.anIntArray120.length) {
				arg2.anIntArray120 = arg0.anIntArray120 = new int[this.anInt1873];
			} else {
				arg2.anIntArray120 = arg0.anIntArray120;
			}
			for (local203 = 0; local203 < this.anInt1873; local203++) {
				if (local70) {
					arg2.anIntArray122[local203] = this.anIntArray122[local203];
				}
				if (local76) {
					arg2.anIntArray123[local203] = this.anIntArray123[local203];
				}
				if (local82) {
					arg2.anIntArray120[local203] = this.anIntArray120[local203];
				}
			}
		} else {
			arg2.anIntArray122 = this.anIntArray122;
			arg2.anIntArray120 = this.anIntArray120;
			arg2.anIntArray123 = this.anIntArray123;
		}
		if (Static612.method8029(arg3, this.anInt1898)) {
			arg2.aClass327_9 = arg0.aClass327_9;
			if (arg4) {
				arg2.aByte19 = (byte) (arg2.aByte19 | 0x1);
			}
			arg2.aClass327_9.anInterface11_7 = this.aClass327_9.anInterface11_7;
			arg2.aClass327_9.aByte118 = this.aClass327_9.aByte118;
		} else if (Static39.method4897(this.anInt1898, arg3)) {
			arg2.aClass327_9 = this.aClass327_9;
		} else {
			arg2.aClass327_9 = null;
		}
		if (Static333.method4594(arg3, this.anInt1898)) {
			if (arg0.aShortArray23 == null || this.anInt1869 > arg0.aShortArray23.length) {
				arg2.aShortArray23 = arg0.aShortArray23 = new short[this.anInt1869];
			} else {
				arg2.aShortArray23 = arg0.aShortArray23;
			}
			for (local203 = 0; local203 < this.anInt1869; local203++) {
				arg2.aShortArray23[local203] = this.aShortArray23[local203];
			}
		} else {
			arg2.aShortArray23 = this.aShortArray23;
		}
		if (Static345.method4661(this.anInt1898, arg3)) {
			if (arg0.aByteArray24 == null || this.anInt1869 > arg0.aByteArray24.length) {
				arg2.aByteArray24 = arg0.aByteArray24 = new byte[this.anInt1869];
			} else {
				arg2.aByteArray24 = arg0.aByteArray24;
			}
			for (local203 = 0; local203 < this.anInt1869; local203++) {
				arg2.aByteArray24[local203] = this.aByteArray24[local203];
			}
		} else {
			arg2.aByteArray24 = this.aByteArray24;
		}
		if (Static638.method8538(arg3, this.anInt1898)) {
			arg2.aClass327_7 = arg0.aClass327_7;
			if (arg4) {
				arg2.aByte19 = (byte) (arg2.aByte19 | 0x2);
			}
			arg2.aClass327_7.aByte118 = this.aClass327_7.aByte118;
			arg2.aClass327_7.anInterface11_7 = this.aClass327_7.anInterface11_7;
		} else if (Static135.method2423(this.anInt1898, arg3)) {
			arg2.aClass327_7 = this.aClass327_7;
		} else {
			arg2.aClass327_7 = null;
		}
		@Pc(595) int local595;
		if (Static16.method300(this.anInt1898, arg3)) {
			if (arg0.aShortArray30 == null || arg0.aShortArray30.length < this.anInt1844) {
				local203 = this.anInt1844;
				arg2.aShortArray26 = arg0.aShortArray26 = new short[local203];
				arg2.aShortArray30 = arg0.aShortArray30 = new short[local203];
				arg2.aShortArray28 = arg0.aShortArray28 = new short[local203];
			} else {
				arg2.aShortArray28 = arg0.aShortArray28;
				arg2.aShortArray30 = arg0.aShortArray30;
				arg2.aShortArray26 = arg0.aShortArray26;
			}
			if (this.aClass277_1 == null) {
				for (local203 = 0; local203 < this.anInt1844; local203++) {
					arg2.aShortArray30[local203] = this.aShortArray30[local203];
					arg2.aShortArray28[local203] = this.aShortArray28[local203];
					arg2.aShortArray26[local203] = this.aShortArray26[local203];
				}
			} else {
				if (arg0.aClass277_1 == null) {
					arg0.aClass277_1 = new Class277();
				}
				@Pc(579) Class277 local579 = arg2.aClass277_1 = arg0.aClass277_1;
				if (local579.aShortArray90 == null || local579.aShortArray90.length < this.anInt1844) {
					local595 = this.anInt1844;
					local579.aByteArray69 = new byte[local595];
					local579.aShortArray89 = new short[local595];
					local579.aShortArray90 = new short[local595];
					local579.aShortArray88 = new short[local595];
				}
				for (local595 = 0; local595 < this.anInt1844; local595++) {
					arg2.aShortArray30[local595] = this.aShortArray30[local595];
					arg2.aShortArray28[local595] = this.aShortArray28[local595];
					arg2.aShortArray26[local595] = this.aShortArray26[local595];
					local579.aShortArray90[local595] = this.aClass277_1.aShortArray90[local595];
					local579.aShortArray89[local595] = this.aClass277_1.aShortArray89[local595];
					local579.aShortArray88[local595] = this.aClass277_1.aShortArray88[local595];
					local579.aByteArray69[local595] = this.aClass277_1.aByteArray69[local595];
				}
			}
			arg2.aByteArray25 = this.aByteArray25;
		} else {
			arg2.aShortArray30 = this.aShortArray30;
			arg2.aShortArray28 = this.aShortArray28;
			arg2.aByteArray25 = this.aByteArray25;
			arg2.aShortArray26 = this.aShortArray26;
			arg2.aClass277_1 = this.aClass277_1;
		}
		if (Static391.method5053(this.anInt1898, arg3)) {
			if (arg4) {
				arg2.aByte19 = (byte) (arg2.aByte19 | 0x4);
			}
			arg2.aClass327_8 = arg0.aClass327_8;
			arg2.aClass327_8.aByte118 = this.aClass327_8.aByte118;
			arg2.aClass327_8.anInterface11_7 = this.aClass327_8.anInterface11_7;
		} else if (Static519.method7019(arg3, this.anInt1898)) {
			arg2.aClass327_8 = this.aClass327_8;
		} else {
			arg2.aClass327_8 = null;
		}
		if (Static152.method2628(arg3, this.anInt1898)) {
			if (arg0.aFloatArray6 == null || arg0.aFloatArray6.length < this.anInt1869) {
				local203 = this.anInt1844;
				arg2.aFloatArray5 = arg0.aFloatArray5 = new float[local203];
				arg2.aFloatArray6 = arg0.aFloatArray6 = new float[local203];
			} else {
				arg2.aFloatArray6 = arg0.aFloatArray6;
				arg2.aFloatArray5 = arg0.aFloatArray5;
			}
			for (local203 = 0; local203 < this.anInt1844; local203++) {
				arg2.aFloatArray6[local203] = this.aFloatArray6[local203];
				arg2.aFloatArray5[local203] = this.aFloatArray5[local203];
			}
		} else {
			arg2.aFloatArray6 = this.aFloatArray6;
			arg2.aFloatArray5 = this.aFloatArray5;
		}
		if (Static352.method4720(this.anInt1898, arg3)) {
			if (arg4) {
				arg2.aByte19 = (byte) (arg2.aByte19 | 0x8);
			}
			arg2.aClass327_10 = arg0.aClass327_10;
			arg2.aClass327_10.anInterface11_7 = this.aClass327_10.anInterface11_7;
			arg2.aClass327_10.aByte118 = this.aClass327_10.aByte118;
		} else if (Static84.method1758(this.anInt1898, arg3)) {
			arg2.aClass327_10 = this.aClass327_10;
		} else {
			arg2.aClass327_10 = null;
		}
		if (Static481.method6598(this.anInt1898, arg3)) {
			if (arg0.aShortArray24 == null || this.anInt1869 > arg0.aShortArray24.length) {
				local203 = this.anInt1869;
				arg2.aShortArray29 = arg0.aShortArray29 = new short[local203];
				arg2.aShortArray24 = arg0.aShortArray24 = new short[local203];
				arg2.aShortArray22 = arg0.aShortArray22 = new short[local203];
			} else {
				arg2.aShortArray29 = arg0.aShortArray29;
				arg2.aShortArray24 = arg0.aShortArray24;
				arg2.aShortArray22 = arg0.aShortArray22;
			}
			for (local203 = 0; local203 < this.anInt1869; local203++) {
				arg2.aShortArray24[local203] = this.aShortArray24[local203];
				arg2.aShortArray29[local203] = this.aShortArray29[local203];
				arg2.aShortArray22[local203] = this.aShortArray22[local203];
			}
		} else {
			arg2.aShortArray29 = this.aShortArray29;
			arg2.aShortArray22 = this.aShortArray22;
			arg2.aShortArray24 = this.aShortArray24;
		}
		if (Static299.method4205(arg3, this.anInt1898)) {
			if (arg4) {
				arg2.aByte19 = (byte) (arg2.aByte19 | 0x10);
			}
			arg2.aClass302_1 = arg0.aClass302_1;
			arg2.aClass302_1.anInterface5_5 = this.aClass302_1.anInterface5_5;
		} else if (Static393.method5070(arg3, this.anInt1898)) {
			arg2.aClass302_1 = this.aClass302_1;
		} else {
			arg2.aClass302_1 = null;
		}
		if (Static149.method2602(this.anInt1898, arg3)) {
			if (arg0.aShortArray25 == null || arg0.aShortArray25.length < this.anInt1869) {
				local203 = this.anInt1869;
				arg2.aShortArray25 = arg0.aShortArray25 = new short[local203];
			} else {
				arg2.aShortArray25 = arg0.aShortArray25;
			}
			for (local203 = 0; local203 < this.anInt1869; local203++) {
				arg2.aShortArray25[local203] = this.aShortArray25[local203];
			}
		} else {
			arg2.aShortArray25 = this.aShortArray25;
		}
		if (!Static490.method8899(arg3, this.anInt1898)) {
			arg2.aClass25Array1 = this.aClass25Array1;
		} else if (arg0.aClass25Array1 == null || arg0.aClass25Array1.length < this.anInt1860) {
			local203 = this.anInt1860;
			arg2.aClass25Array1 = arg0.aClass25Array1 = new Class25[local203];
			for (local595 = 0; local595 < this.anInt1860; local595++) {
				arg2.aClass25Array1[local595] = this.aClass25Array1[local595].method714();
			}
		} else {
			arg2.aClass25Array1 = arg0.aClass25Array1;
			for (local203 = 0; local203 < this.anInt1860; local203++) {
				arg2.aClass25Array1[local203].method713(this.aClass25Array1[local203]);
			}
		}
		arg2.anIntArray121 = this.anIntArray121;
		arg2.anIntArrayArray10 = this.anIntArrayArray10;
		arg2.aClass170Array1 = this.aClass170Array1;
		arg2.aClass235Array1 = this.aClass235Array1;
		arg2.anIntArrayArray12 = this.anIntArrayArray12;
		arg2.anIntArrayArray11 = this.anIntArrayArray11;
		arg2.aClass75Array1 = this.aClass75Array1;
		arg2.aShortArray20 = this.aShortArray20;
		arg2.anIntArray119 = this.anIntArray119;
		arg2.aShortArray27 = this.aShortArray27;
		if (this.aBoolean126) {
			arg2.aShort30 = this.aShort30;
			arg2.aShort23 = this.aShort23;
			arg2.aShort24 = this.aShort24;
			arg2.aShort29 = this.aShort29;
			arg2.aShort28 = this.aShort28;
			arg2.aBoolean126 = true;
			arg2.aShort22 = this.aShort22;
			arg2.aShort26 = this.aShort26;
			arg2.aShort31 = this.aShort31;
		} else {
			arg2.aBoolean126 = false;
		}
		arg2.aShortArray21 = this.aShortArray21;
		return arg2;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	@Override
	protected void method7340() {
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7342(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			Static531.anInt8221 = 0;
			Static388.anInt5685 = 0;
			local28 = 0;
			Static393.anInt5779 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray11.length > local38) {
					local52 = this.anIntArrayArray11[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static393.anInt5779 += this.anIntArray122[local60];
						Static388.anInt5685 += this.anIntArray123[local60];
						local28++;
						Static531.anInt8221 += this.anIntArray120[local60];
					}
				}
			}
			if (local28 > 0) {
				Static393.anInt5779 = Static393.anInt5779 / local28 + local14;
				Static531.anInt8221 = Static531.anInt8221 / local28 + local22;
				Static388.anInt5685 = Static388.anInt5685 / local28 + local18;
			} else {
				Static531.anInt8221 = local22;
				Static393.anInt5779 = local14;
				Static388.anInt5685 = local18;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray11.length > local32) {
					local162 = this.anIntArrayArray11[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray122[local54] += local14;
						this.anIntArray123[local54] += local18;
						this.anIntArray120[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(285) int local285;
		@Pc(303) int local303;
		@Pc(761) int local761;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray11.length) {
					local162 = this.anIntArrayArray11[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray122[local54] -= Static393.anInt5779;
							this.anIntArray123[local54] -= Static388.anInt5685;
							this.anIntArray120[local54] -= Static531.anInt8221;
							if (arg4 != 0) {
								local60 = Class4_Sub2_Sub26.anIntArray563[arg4];
								local285 = Class4_Sub2_Sub26.anIntArray562[arg4];
								local303 = local60 * this.anIntArray123[local54] + this.anIntArray122[local54] * local285 + 16383 >> 14;
								this.anIntArray123[local54] = this.anIntArray123[local54] * local285 + 16383 - this.anIntArray122[local54] * local60 >> 14;
								this.anIntArray122[local54] = local303;
							}
							if (arg2 != 0) {
								local60 = Class4_Sub2_Sub26.anIntArray563[arg2];
								local285 = Class4_Sub2_Sub26.anIntArray562[arg2];
								local303 = this.anIntArray123[local54] * local285 + 16383 - this.anIntArray120[local54] * local60 >> 14;
								this.anIntArray120[local54] = local60 * this.anIntArray123[local54] + this.anIntArray120[local54] * local285 + 16383 >> 14;
								this.anIntArray123[local54] = local303;
							}
							if (arg3 != 0) {
								local60 = Class4_Sub2_Sub26.anIntArray563[arg3];
								local285 = Class4_Sub2_Sub26.anIntArray562[arg3];
								local303 = this.anIntArray120[local54] * local60 + local285 * this.anIntArray122[local54] + 16383 >> 14;
								this.anIntArray120[local54] = this.anIntArray120[local54] * local285 + 16383 - this.anIntArray122[local54] * local60 >> 14;
								this.anIntArray122[local54] = local303;
							}
							this.anIntArray122[local54] += Static393.anInt5779;
							this.anIntArray123[local54] += Static388.anInt5685;
							this.anIntArray120[local54] += Static531.anInt8221;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray122[local54] -= Static393.anInt5779;
							this.anIntArray123[local54] -= Static388.anInt5685;
							this.anIntArray120[local54] -= Static531.anInt8221;
							if (arg2 != 0) {
								local60 = Class4_Sub2_Sub26.anIntArray563[arg2];
								local285 = Class4_Sub2_Sub26.anIntArray562[arg2];
								local303 = local285 * this.anIntArray123[local54] + 16383 - this.anIntArray120[local54] * local60 >> 14;
								this.anIntArray120[local54] = local60 * this.anIntArray123[local54] + this.anIntArray120[local54] * local285 + 16383 >> 14;
								this.anIntArray123[local54] = local303;
							}
							if (arg4 != 0) {
								local60 = Class4_Sub2_Sub26.anIntArray563[arg4];
								local285 = Class4_Sub2_Sub26.anIntArray562[arg4];
								local303 = this.anIntArray123[local54] * local60 + local285 * this.anIntArray122[local54] + 16383 >> 14;
								this.anIntArray123[local54] = this.anIntArray123[local54] * local285 + 16383 - this.anIntArray122[local54] * local60 >> 14;
								this.anIntArray122[local54] = local303;
							}
							if (arg3 != 0) {
								local60 = Class4_Sub2_Sub26.anIntArray563[arg3];
								local285 = Class4_Sub2_Sub26.anIntArray562[arg3];
								local303 = local285 * this.anIntArray122[local54] + local60 * this.anIntArray120[local54] + 16383 >> 14;
								this.anIntArray120[local54] = this.anIntArray120[local54] * local285 + 16383 - this.anIntArray122[local54] * local60 >> 14;
								this.anIntArray122[local54] = local303;
							}
							this.anIntArray122[local54] += Static393.anInt5779;
							this.anIntArray123[local54] += Static388.anInt5685;
							this.anIntArray120[local54] += Static531.anInt8221;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray11.length) {
						local52 = this.anIntArrayArray11[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local285 = this.anIntArray119[local60];
							local303 = this.anIntArray119[local60 + 1];
							for (local761 = local285; local761 < local303; local761++) {
								@Pc(770) int local770 = this.aShortArray27[local761] - 1;
								if (local770 == -1) {
									break;
								}
								@Pc(783) int local783;
								@Pc(787) int local787;
								@Pc(805) int local805;
								if (arg4 != 0) {
									local783 = Class4_Sub2_Sub26.anIntArray563[arg4];
									local787 = Class4_Sub2_Sub26.anIntArray562[arg4];
									local805 = local787 * this.aShortArray30[local770] + this.aShortArray28[local770] * local783 + 16383 >> 14;
									this.aShortArray28[local770] = (short) (this.aShortArray28[local770] * local787 + 16383 - local783 * this.aShortArray30[local770] >> 14);
									this.aShortArray30[local770] = (short) local805;
								}
								if (arg2 != 0) {
									local783 = Class4_Sub2_Sub26.anIntArray563[arg2];
									local787 = Class4_Sub2_Sub26.anIntArray562[arg2];
									local805 = this.aShortArray28[local770] * local787 + 16383 - local783 * this.aShortArray26[local770] >> 14;
									this.aShortArray26[local770] = (short) (local787 * this.aShortArray26[local770] + this.aShortArray28[local770] * local783 + 16383 >> 14);
									this.aShortArray28[local770] = (short) local805;
								}
								if (arg3 != 0) {
									local783 = Class4_Sub2_Sub26.anIntArray563[arg3];
									local787 = Class4_Sub2_Sub26.anIntArray562[arg3];
									local805 = this.aShortArray26[local770] * local783 + this.aShortArray30[local770] * local787 + 16383 >> 14;
									this.aShortArray26[local770] = (short) (this.aShortArray26[local770] * local787 + 16383 - local783 * this.aShortArray30[local770] >> 14);
									this.aShortArray30[local770] = (short) local805;
								}
							}
						}
					}
				}
				if (this.aClass327_8 == null && this.aClass327_7 != null) {
					this.aClass327_7.anInterface11_7 = null;
				}
				if (this.aClass327_8 != null) {
					this.aClass327_8.anInterface11_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray11.length) {
					local162 = this.anIntArrayArray11[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray122[local54] -= Static393.anInt5779;
						this.anIntArray123[local54] -= Static388.anInt5685;
						this.anIntArray120[local54] -= Static531.anInt8221;
						this.anIntArray122[local54] = arg2 * this.anIntArray122[local54] >> 7;
						this.anIntArray123[local54] = this.anIntArray123[local54] * arg3 >> 7;
						this.anIntArray120[local54] = arg4 * this.anIntArray120[local54] >> 7;
						this.anIntArray122[local54] += Static393.anInt5779;
						this.anIntArray123[local54] += Static388.anInt5685;
						this.anIntArray120[local54] += Static531.anInt8221;
					}
				}
			}
		} else {
			@Pc(1223) Class75 local1223;
			@Pc(1228) Class25 local1228;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray12.length) {
							local162 = this.anIntArrayArray12[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local54 = local162[local164];
								local60 = (this.aByteArray24[local54] & 0xFF) + arg2 * 8;
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray24[local54] = (byte) local60;
							}
							if (local162.length > 0 && this.aClass327_7 != null) {
								this.aClass327_7.anInterface11_7 = null;
							}
						}
					}
					if (this.aClass75Array1 != null) {
						for (local32 = 0; local32 < this.anInt1860; local32++) {
							local1223 = this.aClass75Array1[local32];
							local1228 = this.aClass25Array1[local32];
							local1228.anInt775 = 255 - (this.aByteArray24[local1223.anInt2149] & 0xFF) << 24 | local1228.anInt775 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1465) Class25 local1465;
				if (arg0 == 8) {
					if (this.anIntArrayArray10 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (local32 < this.anIntArrayArray10.length) {
								local162 = this.anIntArrayArray10[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1465 = this.aClass25Array1[local162[local164]];
									local1465.anInt771 += arg3;
									local1465.anInt770 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray10 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray10.length > local32) {
								local162 = this.anIntArrayArray10[local32];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1465 = this.aClass25Array1[local162[local164]];
									local1465.anInt769 = local1465.anInt769 * arg2 >> 7;
									local1465.anInt777 = arg3 * local1465.anInt777 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray10 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray10.length) {
							local162 = this.anIntArrayArray10[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1465 = this.aClass25Array1[local162[local164]];
								local1465.anInt776 = arg2 + local1465.anInt776 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray12.length) {
						local162 = this.anIntArrayArray12[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							local60 = this.aShortArray23[local54] & 0xFFFF;
							local285 = local60 >> 10 & 0x3F;
							local303 = local60 >> 7 & 0x7;
							local303 += arg3 / 4;
							local761 = local60 & 0x7F;
							@Pc(1321) int local1321 = arg2 + local285 & 0x3F;
							if (local303 < 0) {
								local303 = 0;
							} else if (local303 > 7) {
								local303 = 7;
							}
							local761 += arg4;
							if (local761 < 0) {
								local761 = 0;
							} else if (local761 > 127) {
								local761 = 127;
							}
							this.aShortArray23[local54] = (short) (local1321 << 10 | local303 << 7 | local761);
						}
						if (local162.length > 0 && this.aClass327_7 != null) {
							this.aClass327_7.anInterface11_7 = null;
						}
					}
				}
				if (this.aClass75Array1 != null) {
					for (local32 = 0; local32 < this.anInt1860; local32++) {
						local1223 = this.aClass75Array1[local32];
						local1228 = this.aClass25Array1[local32];
						local1228.anInt775 = Static411.anIntArray448[this.aShortArray23[local1223.anInt2149] & 0xFFFF] & 0xFFFFFF | local1228.anInt775 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1873; local3++) {
			this.anIntArray122[local3] = this.anIntArray122[local3] + 7 >> 4;
			this.anIntArray123[local3] = this.anIntArray123[local3] + 7 >> 4;
			this.anIntArray120[local3] = this.anIntArray120[local3] + 7 >> 4;
		}
		this.aBoolean126 = false;
		if (this.aClass327_9 != null) {
			this.aClass327_9.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			Static388.anInt5685 = 0;
			local29 = 0;
			Static393.anInt5779 = 0;
			Static531.anInt8221 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray11.length > local41) {
					local51 = this.anIntArrayArray11[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local59]) != 0) {
							Static393.anInt5779 += this.anIntArray122[local59];
							Static388.anInt5685 += this.anIntArray123[local59];
							Static531.anInt8221 += this.anIntArray120[local59];
							local29++;
						}
					}
				}
			}
			if (local29 > 0) {
				Static393.anInt5779 = arg2 + Static393.anInt5779 / local29;
				Static645.aBoolean786 = true;
				Static388.anInt5685 = Static388.anInt5685 / local29 + arg3;
				Static531.anInt8221 = Static531.anInt8221 / local29 + arg4;
			} else {
				Static531.anInt8221 = arg4;
				Static388.anInt5685 = arg3;
				Static393.anInt5779 = arg2;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[1] * arg3 + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg2 * arg7[3] + arg3 * arg7[4] + arg7[5] * arg4 + 8192 >> 14;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local29;
				arg4 = local41;
				arg3 = local35;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray11.length > local35) {
					local250 = this.anIntArrayArray11[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local53 = local250[local252];
						if (this.aShortArray20 == null || (this.aShortArray20[local53] & arg6) != 0) {
							this.anIntArray122[local53] += arg2;
							this.anIntArray123[local53] += arg3;
							this.anIntArray120[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(393) int local393;
		@Pc(412) int local412;
		@Pc(642) int local642;
		@Pc(651) int local651;
		@Pc(661) int local661;
		@Pc(665) int local665;
		@Pc(683) int local683;
		@Pc(1027) int local1027;
		@Pc(1035) int local1035;
		@Pc(1190) int local1190;
		@Pc(1216) int local1216;
		@Pc(1221) int local1221;
		@Pc(1230) int local1230;
		@Pc(1235) int local1235;
		@Pc(1239) int local1239;
		@Pc(1243) int local1243;
		@Pc(1245) int local1245;
		@Pc(1375) int[] local1375;
		@Pc(1377) int local1377;
		@Pc(1381) int local1381;
		@Pc(1385) int local1385;
		@Pc(1387) int local1387;
		@Pc(1513) int local1513;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray11.length > local35) {
						local250 = this.anIntArrayArray11[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local53 = local250[local252];
							if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local53]) != 0) {
								this.anIntArray122[local53] -= Static393.anInt5779;
								this.anIntArray123[local53] -= Static388.anInt5685;
								this.anIntArray120[local53] -= Static531.anInt8221;
								if (arg4 != 0) {
									local59 = Class4_Sub2_Sub26.anIntArray563[arg4];
									local393 = Class4_Sub2_Sub26.anIntArray562[arg4];
									local412 = local59 * this.anIntArray123[local53] + local393 * this.anIntArray122[local53] + 16383 >> 14;
									this.anIntArray123[local53] = local393 * this.anIntArray123[local53] + 16383 - local59 * this.anIntArray122[local53] >> 14;
									this.anIntArray122[local53] = local412;
								}
								if (arg2 != 0) {
									local59 = Class4_Sub2_Sub26.anIntArray563[arg2];
									local393 = Class4_Sub2_Sub26.anIntArray562[arg2];
									local412 = this.anIntArray123[local53] * local393 + 16383 - local59 * this.anIntArray120[local53] >> 14;
									this.anIntArray120[local53] = this.anIntArray123[local53] * local59 + this.anIntArray120[local53] * local393 + 16383 >> 14;
									this.anIntArray123[local53] = local412;
								}
								if (arg3 != 0) {
									local59 = Class4_Sub2_Sub26.anIntArray563[arg3];
									local393 = Class4_Sub2_Sub26.anIntArray562[arg3];
									local412 = local59 * this.anIntArray120[local53] + this.anIntArray122[local53] * local393 + 16383 >> 14;
									this.anIntArray120[local53] = this.anIntArray120[local53] * local393 + 16383 - this.anIntArray122[local53] * local59 >> 14;
									this.anIntArray122[local53] = local412;
								}
								this.anIntArray122[local53] += Static393.anInt5779;
								this.anIntArray123[local53] += Static388.anInt5685;
								this.anIntArray120[local53] += Static531.anInt8221;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray11.length > local41) {
							local51 = this.anIntArrayArray11[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray20 == null || (this.aShortArray20[local59] & arg6) != 0) {
									local393 = this.anIntArray119[local59];
									local412 = this.anIntArray119[local59 + 1];
									for (local642 = local393; local642 < local412; local642++) {
										local651 = this.aShortArray27[local642] - 1;
										if (local651 == -1) {
											break;
										}
										if (arg4 != 0) {
											local661 = Class4_Sub2_Sub26.anIntArray563[arg4];
											local665 = Class4_Sub2_Sub26.anIntArray562[arg4];
											local683 = this.aShortArray28[local651] * local661 + local665 * this.aShortArray30[local651] + 16383 >> 14;
											this.aShortArray28[local651] = (short) (this.aShortArray28[local651] * local665 + 16383 - this.aShortArray30[local651] * local661 >> 14);
											this.aShortArray30[local651] = (short) local683;
										}
										if (arg2 != 0) {
											local661 = Class4_Sub2_Sub26.anIntArray563[arg2];
											local665 = Class4_Sub2_Sub26.anIntArray562[arg2];
											local683 = local665 * this.aShortArray28[local651] + 16383 - local661 * this.aShortArray26[local651] >> 14;
											this.aShortArray26[local651] = (short) (this.aShortArray26[local651] * local665 + this.aShortArray28[local651] * local661 + 16383 >> 14);
											this.aShortArray28[local651] = (short) local683;
										}
										if (arg3 != 0) {
											local661 = Class4_Sub2_Sub26.anIntArray563[arg3];
											local665 = Class4_Sub2_Sub26.anIntArray562[arg3];
											local683 = local661 * this.aShortArray26[local651] + this.aShortArray30[local651] * local665 + 16383 >> 14;
											this.aShortArray26[local651] = (short) (local665 * this.aShortArray26[local651] + 16383 - this.aShortArray30[local651] * local661 >> 14);
											this.aShortArray30[local651] = (short) local683;
										}
									}
								}
							}
						}
					}
					if (this.aClass327_8 == null && this.aClass327_7 != null) {
						this.aClass327_7.anInterface11_7 = null;
					}
					if (this.aClass327_8 != null) {
						this.aClass327_8.anInterface11_7 = null;
						return;
					}
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static645.aBoolean786) {
					local393 = Static531.anInt8221 * arg7[6] + Static388.anInt5685 * arg7[3] + arg7[0] * Static393.anInt5779 + 8192 >> 14;
					local412 = arg7[7] * Static531.anInt8221 + Static393.anInt5779 * arg7[1] + Static388.anInt5685 * arg7[4] + 8192 >> 14;
					local642 = Static531.anInt8221 * arg7[8] + arg7[5] * Static388.anInt5685 + arg7[2] * Static393.anInt5779 + 8192 >> 14;
					local412 += local53;
					local393 += local252;
					local642 += local59;
					Static388.anInt5685 = local412;
					Static393.anInt5779 = local393;
					Static531.anInt8221 = local642;
					Static645.aBoolean786 = false;
				}
				@Pc(995) int[] local995 = new int[9];
				local412 = Class4_Sub2_Sub26.anIntArray562[arg2];
				local642 = Class4_Sub2_Sub26.anIntArray563[arg2];
				local651 = Class4_Sub2_Sub26.anIntArray562[arg3];
				local661 = Class4_Sub2_Sub26.anIntArray563[arg3];
				local665 = Class4_Sub2_Sub26.anIntArray562[arg4];
				local683 = Class4_Sub2_Sub26.anIntArray563[arg4];
				local1027 = local665 * local642 + 8192 >> 14;
				local1035 = local683 * local642 + 8192 >> 14;
				local995[0] = local1035 * local661 + local665 * local651 + 8192 >> 14;
				local995[1] = local683 * -local651 + local661 * local1027 + 8192 >> 14;
				local995[5] = -local642;
				local995[3] = local412 * local683 + 8192 >> 14;
				local995[7] = local683 * local661 + local1027 * local651 + 8192 >> 14;
				local995[4] = local665 * local412 + 8192 >> 14;
				local995[8] = local651 * local412 + 8192 >> 14;
				local995[6] = -local661 * local665 + local651 * local1035 + 8192 >> 14;
				local995[2] = local661 * local412 + 8192 >> 14;
				@Pc(1164) int local1164 = -Static388.anInt5685 * local995[1] + -Static393.anInt5779 * local995[0] + local995[2] * -Static531.anInt8221 + 8192 >> 14;
				local1190 = local995[5] * -Static531.anInt8221 + -Static393.anInt5779 * local995[3] + -Static388.anInt5685 * local995[4] + 8192 >> 14;
				local1216 = -Static393.anInt5779 * local995[6] + local995[7] * -Static388.anInt5685 + local995[8] * -Static531.anInt8221 + 8192 >> 14;
				local1221 = local1164 + Static393.anInt5779;
				@Pc(1225) int local1225 = Static388.anInt5685 + local1190;
				local1230 = local1216 + Static531.anInt8221;
				@Pc(1233) int[] local1233 = new int[9];
				for (local1235 = 0; local1235 < 3; local1235++) {
					for (local1239 = 0; local1239 < 3; local1239++) {
						local1243 = 0;
						for (local1245 = 0; local1245 < 3; local1245++) {
							local1243 += arg7[local1239 * 3 + local1245] * local995[local1235 * 3 + local1245];
						}
						local1233[local1235 * 3 + local1239] = local1243 + 8192 >> 14;
					}
				}
				local1239 = local995[2] * local59 + local995[0] * local252 + local53 * local995[1] + 8192 >> 14;
				local1243 = local53 * local995[4] + local995[3] * local252 + local995[5] * local59 + 8192 >> 14;
				local1245 = local252 * local995[6] + local53 * local995[7] + local59 * local995[8] + 8192 >> 14;
				local1243 += local1225;
				local1239 += local1221;
				local1245 += local1230;
				local1375 = new int[9];
				for (local1377 = 0; local1377 < 3; local1377++) {
					for (local1381 = 0; local1381 < 3; local1381++) {
						local1385 = 0;
						for (local1387 = 0; local1387 < 3; local1387++) {
							local1385 += arg7[local1387 + local1377 * 3] * local1233[local1381 + local1387 * 3];
						}
						local1375[local1377 * 3 + local1381] = local1385 + 8192 >> 14;
					}
				}
				local1381 = local1245 * arg7[2] + arg7[0] * local1239 + local1243 * arg7[1] + 8192 >> 14;
				local1385 = arg7[4] * local1243 + arg7[3] * local1239 + local1245 * arg7[5] + 8192 >> 14;
				local1385 += local35;
				local1381 += local29;
				local1387 = local1245 * arg7[8] + local1243 * arg7[7] + local1239 * arg7[6] + 8192 >> 14;
				local1387 += local41;
				for (local1513 = 0; local1513 < local8; local1513++) {
					@Pc(1519) int local1519 = arg1[local1513];
					if (this.anIntArrayArray11.length > local1519) {
						@Pc(1529) int[] local1529 = this.anIntArrayArray11[local1519];
						for (@Pc(1531) int local1531 = 0; local1531 < local1529.length; local1531++) {
							@Pc(1537) int local1537 = local1529[local1531];
							if (this.aShortArray20 == null || (this.aShortArray20[local1537] & arg6) != 0) {
								@Pc(1582) int local1582 = this.anIntArray122[local1537] * local1375[0] + this.anIntArray123[local1537] * local1375[1] + this.anIntArray120[local1537] * local1375[2] + 8192 >> 14;
								@Pc(1614) int local1614 = local1375[4] * this.anIntArray123[local1537] + this.anIntArray122[local1537] * local1375[3] + local1375[5] * this.anIntArray120[local1537] + 8192 >> 14;
								@Pc(1618) int local1618 = local1614 + local1385;
								@Pc(1622) int local1622 = local1582 + local1381;
								@Pc(1653) int local1653 = this.anIntArray120[local1537] * local1375[8] + local1375[6] * this.anIntArray122[local1537] + this.anIntArray123[local1537] * local1375[7] + 8192 >> 14;
								this.anIntArray122[local1537] = local1622;
								@Pc(1662) int local1662 = local1653 + local1387;
								this.anIntArray123[local1537] = local1618;
								this.anIntArray120[local1537] = local1662;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2584) Class75 local2584;
			@Pc(2589) Class25 local2589;
			if (arg0 == 5) {
				if (this.anIntArrayArray12 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray12.length) {
							local250 = this.anIntArrayArray12[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local53 = local250[local252];
								if (this.aShortArray21 == null || (arg6 & this.aShortArray21[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray24[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray24[local53] = (byte) local59;
									if (this.aClass327_7 != null) {
										this.aClass327_7.anInterface11_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass75Array1 != null) {
						for (local35 = 0; local35 < this.anInt1860; local35++) {
							local2584 = this.aClass75Array1[local35];
							local2589 = this.aClass25Array1[local35];
							local2589.anInt775 = 255 - (this.aByteArray24[local2584.anInt2149] & 0xFF) << 24 | local2589.anInt775 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2832) Class25 local2832;
				if (arg0 == 8) {
					if (this.anIntArrayArray10 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray10.length > local35) {
								local250 = this.anIntArrayArray10[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2832 = this.aClass25Array1[local250[local252]];
									local2832.anInt770 += arg2;
									local2832.anInt771 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray10 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray10.length > local35) {
								local250 = this.anIntArrayArray10[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2832 = this.aClass25Array1[local250[local252]];
									local2832.anInt777 = local2832.anInt777 * arg3 >> 7;
									local2832.anInt769 = local2832.anInt769 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray10 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray10.length > local35) {
							local250 = this.anIntArrayArray10[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2832 = this.aClass25Array1[local250[local252]];
								local2832.anInt776 = local2832.anInt776 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray12 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray12.length) {
						local250 = this.anIntArrayArray12[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local53 = local250[local252];
							if (this.aShortArray21 == null || (this.aShortArray21[local53] & arg6) != 0) {
								local59 = this.aShortArray23[local53] & 0xFFFF;
								local393 = local59 >> 10 & 0x3F;
								local412 = local59 >> 7 & 0x7;
								local642 = local59 & 0x7F;
								local412 += arg3 / 4;
								@Pc(2692) int local2692 = local393 + arg2 & 0x3F;
								if (local412 < 0) {
									local412 = 0;
								} else if (local412 > 7) {
									local412 = 7;
								}
								local642 += arg4;
								if (local642 < 0) {
									local642 = 0;
								} else if (local642 > 127) {
									local642 = 127;
								}
								this.aShortArray23[local53] = (short) (local412 << 7 | local2692 << 10 | local642);
								if (this.aClass327_7 != null) {
									this.aClass327_7.anInterface11_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass75Array1 != null) {
					for (local35 = 0; local35 < this.anInt1860; local35++) {
						local2584 = this.aClass75Array1[local35];
						local2589 = this.aClass25Array1[local35];
						local2589.anInt775 = local2589.anInt775 & 0xFF000000 | Static411.anIntArray448[this.aShortArray23[local2584.anInt2149] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray11.length > local35) {
					local250 = this.anIntArrayArray11[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local53 = local250[local252];
						if (this.aShortArray20 == null || (arg6 & this.aShortArray20[local53]) != 0) {
							this.anIntArray122[local53] -= Static393.anInt5779;
							this.anIntArray123[local53] -= Static388.anInt5685;
							this.anIntArray120[local53] -= Static531.anInt8221;
							this.anIntArray122[local53] = arg2 * this.anIntArray122[local53] >> 7;
							this.anIntArray123[local53] = this.anIntArray123[local53] * arg3 >> 7;
							this.anIntArray120[local53] = this.anIntArray120[local53] * arg4 >> 7;
							this.anIntArray122[local53] += Static393.anInt5779;
							this.anIntArray123[local53] += Static388.anInt5685;
							this.anIntArray120[local53] += Static531.anInt8221;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static645.aBoolean786) {
				local393 = Static393.anInt5779 * arg7[0] + arg7[3] * Static388.anInt5685 + arg7[6] * Static531.anInt8221 + 8192 >> 14;
				local412 = arg7[7] * Static531.anInt8221 + Static388.anInt5685 * arg7[4] + arg7[1] * Static393.anInt5779 + 8192 >> 14;
				local393 += local252;
				local412 += local53;
				local642 = arg7[8] * Static531.anInt8221 + arg7[5] * Static388.anInt5685 + arg7[2] * Static393.anInt5779 + 8192 >> 14;
				local642 += local59;
				Static388.anInt5685 = local412;
				Static393.anInt5779 = local393;
				Static645.aBoolean786 = false;
				Static531.anInt8221 = local642;
			}
			local393 = arg2 << 15 >> 7;
			local412 = arg3 << 15 >> 7;
			local642 = arg4 << 15 >> 7;
			local651 = -Static393.anInt5779 * local393 + 8192 >> 14;
			local661 = -Static388.anInt5685 * local412 + 8192 >> 14;
			local665 = -Static531.anInt8221 * local642 + 8192 >> 14;
			local683 = Static393.anInt5779 + local651;
			local1027 = Static388.anInt5685 + local661;
			local1035 = local665 + Static531.anInt8221;
			@Pc(1877) int[] local1877 = new int[] { local393 * arg7[0] + 8192 >> 14, local393 * arg7[3] + 8192 >> 14, local393 * arg7[6] + 8192 >> 14, local412 * arg7[1] + 8192 >> 14, local412 * arg7[4] + 8192 >> 14, local412 * arg7[7] + 8192 >> 14, arg7[2] * local642 + 8192 >> 14, arg7[5] * local642 + 8192 >> 14, arg7[8] * local642 + 8192 >> 14 };
			local1190 = local252 * local393 + 8192 >> 14;
			local1216 = local412 * local53 + 8192 >> 14;
			local1221 = local59 * local642 + 8192 >> 14;
			@Pc(2013) int local2013 = local1190 + local683;
			@Pc(2017) int local2017 = local1216 + local1027;
			@Pc(2021) int local2021 = local1221 + local1035;
			@Pc(2024) int[] local2024 = new int[9];
			@Pc(2030) int local2030;
			for (local1230 = 0; local1230 < 3; local1230++) {
				for (local2030 = 0; local2030 < 3; local2030++) {
					local1235 = 0;
					for (local1239 = 0; local1239 < 3; local1239++) {
						local1235 += arg7[local1230 * 3 + local1239] * local1877[local2030 + local1239 * 3];
					}
					local2024[local2030 + local1230 * 3] = local1235 + 8192 >> 14;
				}
			}
			local2030 = local2021 * arg7[2] + local2017 * arg7[1] + arg7[0] * local2013 + 8192 >> 14;
			local1235 = arg7[4] * local2017 + arg7[3] * local2013 + local2021 * arg7[5] + 8192 >> 14;
			local2030 += local29;
			local1235 += local35;
			local1239 = arg7[7] * local2017 + arg7[6] * local2013 + local2021 * arg7[8] + 8192 >> 14;
			local1239 += local41;
			for (local1243 = 0; local1243 < local8; local1243++) {
				local1245 = arg1[local1243];
				if (this.anIntArrayArray11.length > local1245) {
					local1375 = this.anIntArrayArray11[local1245];
					for (local1377 = 0; local1377 < local1375.length; local1377++) {
						local1381 = local1375[local1377];
						if (this.aShortArray20 == null || (this.aShortArray20[local1381] & arg6) != 0) {
							local1385 = this.anIntArray123[local1381] * local2024[1] + this.anIntArray122[local1381] * local2024[0] + this.anIntArray120[local1381] * local2024[2] + 8192 >> 14;
							local1387 = this.anIntArray120[local1381] * local2024[5] + local2024[3] * this.anIntArray122[local1381] + this.anIntArray123[local1381] * local2024[4] + 8192 >> 14;
							@Pc(2267) int local2267 = local1387 + local1235;
							local1513 = this.anIntArray120[local1381] * local2024[8] + local2024[7] * this.anIntArray123[local1381] + local2024[6] * this.anIntArray122[local1381] + 8192 >> 14;
							@Pc(2302) int local2302 = local1385 + local2030;
							@Pc(2306) int local2306 = local1513 + local1239;
							this.anIntArray122[local1381] = local2302;
							this.anIntArray123[local1381] = local2267;
							this.anIntArray120[local1381] = local2306;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass327_7 != null) {
			this.aClass327_7.anInterface11_7 = null;
		}
		this.aShort25 = (short) arg0;
		if (this.aClass327_8 != null) {
			this.aClass327_8.anInterface11_7 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class62 method7329(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class62_Sub1 local14;
		@Pc(18) Class62_Sub1 local18;
		if (arg0 == 1) {
			local14 = this.aClass33_Sub3_6.aClass62_Sub1_3;
			local18 = this.aClass33_Sub3_6.aClass62_Sub1_7;
		} else if (arg0 == 2) {
			local14 = this.aClass33_Sub3_6.aClass62_Sub1_10;
			local18 = this.aClass33_Sub3_6.aClass62_Sub1_1;
		} else if (arg0 == 3) {
			local14 = this.aClass33_Sub3_6.aClass62_Sub1_9;
			local18 = this.aClass33_Sub3_6.aClass62_Sub1_4;
		} else if (arg0 == 4) {
			local14 = this.aClass33_Sub3_6.aClass62_Sub1_6;
			local18 = this.aClass33_Sub3_6.aClass62_Sub1_5;
		} else if (arg0 == 5) {
			local18 = this.aClass33_Sub3_6.aClass62_Sub1_2;
			local14 = this.aClass33_Sub3_6.aClass62_Sub1_8;
		} else {
			local14 = local18 = new Class62_Sub1(this.aClass33_Sub3_6);
		}
		return this.method1877(local18, arg2, local14, arg1, arg0 != 0);
	}
}
