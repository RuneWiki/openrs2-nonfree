import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!cea", name = "ob", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!cea", name = "tb", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!cea", name = "Gc", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!cea", name = "Ac", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!cea", name = "R", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!cea", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cea", name = "Pb", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!cea", name = "Pc", descriptor = "[Lclient!uia;")
	private Class360[] aClass360Array1;

	@OriginalMember(owner = "client!cea", name = "Kc", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!cea", name = "Dc", descriptor = "Lclient!aj;")
	private Interface2 anInterface2_1;

	@OriginalMember(owner = "client!cea", name = "mb", descriptor = "[I")
	private int[] anIntArray66;

	@OriginalMember(owner = "client!cea", name = "F", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!cea", name = "wb", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!cea", name = "oc", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!cea", name = "Lc", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!cea", name = "K", descriptor = "Lclient!bda;")
	private Interface4 anInterface4_2;

	@OriginalMember(owner = "client!cea", name = "cb", descriptor = "[S")
	private short[] aShortArray28;

	@OriginalMember(owner = "client!cea", name = "Nc", descriptor = "[I")
	private int[] anIntArray68;

	@OriginalMember(owner = "client!cea", name = "xb", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!cea", name = "Fc", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!cea", name = "Mc", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!cea", name = "bc", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!cea", name = "cc", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!cea", name = "zc", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!cea", name = "y", descriptor = "[S")
	private short[] aShortArray31;

	@OriginalMember(owner = "client!cea", name = "bb", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!cea", name = "hb", descriptor = "S")
	private short aShort12;

	@OriginalMember(owner = "client!cea", name = "vc", descriptor = "S")
	private short aShort13;

	@OriginalMember(owner = "client!cea", name = "nb", descriptor = "[I")
	private int[] anIntArray70;

	@OriginalMember(owner = "client!cea", name = "O", descriptor = "B")
	private byte aByte10;

	@OriginalMember(owner = "client!cea", name = "W", descriptor = "[Lclient!iia;")
	private Class173[] aClass173Array1;

	@OriginalMember(owner = "client!cea", name = "Ic", descriptor = "I")
	private int anInt907;

	@OriginalMember(owner = "client!cea", name = "S", descriptor = "Lclient!qq;")
	private Class305 aClass305_1;

	@OriginalMember(owner = "client!cea", name = "Jc", descriptor = "S")
	private short aShort14;

	@OriginalMember(owner = "client!cea", name = "vb", descriptor = "S")
	private short aShort15;

	@OriginalMember(owner = "client!cea", name = "nc", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!cea", name = "Rb", descriptor = "[F")
	private float[] aFloatArray3;

	@OriginalMember(owner = "client!cea", name = "Tb", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!cea", name = "B", descriptor = "[S")
	private short[] aShortArray33;

	@OriginalMember(owner = "client!cea", name = "gb", descriptor = "[Lclient!kw;")
	private Class216[] aClass216Array1;

	@OriginalMember(owner = "client!cea", name = "Z", descriptor = "[Lclient!dh;")
	private Class76[] aClass76Array1;

	@OriginalMember(owner = "client!cea", name = "Sb", descriptor = "[F")
	private float[] aFloatArray4;

	@OriginalMember(owner = "client!cea", name = "lc", descriptor = "[S")
	private short[] aShortArray34;

	@OriginalMember(owner = "client!cea", name = "kc", descriptor = "I")
	private int anInt918;

	@OriginalMember(owner = "client!cea", name = "D", descriptor = "I")
	private int anInt861 = 0;

	@OriginalMember(owner = "client!cea", name = "Ob", descriptor = "I")
	private int anInt867 = 0;

	@OriginalMember(owner = "client!cea", name = "w", descriptor = "I")
	private int anInt880 = 0;

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!cea", name = "Ec", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!cea", name = "ib", descriptor = "I")
	private int anInt905 = 0;

	@OriginalMember(owner = "client!cea", name = "Y", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!cea", name = "gc", descriptor = "I")
	private int anInt897 = 0;

	@OriginalMember(owner = "client!cea", name = "yb", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!cea", name = "Eb", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_4;

	@OriginalMember(owner = "client!cea", name = "fc", descriptor = "Lclient!so;")
	private Class332 aClass332_4;

	@OriginalMember(owner = "client!cea", name = "Bb", descriptor = "Lclient!so;")
	private Class332 aClass332_1;

	@OriginalMember(owner = "client!cea", name = "jc", descriptor = "Lclient!so;")
	private Class332 aClass332_3;

	@OriginalMember(owner = "client!cea", name = "Oc", descriptor = "Lclient!so;")
	private Class332 aClass332_2;

	@OriginalMember(owner = "client!cea", name = "Qb", descriptor = "Lclient!bga;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class54_Sub1(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aClass75_Sub3_4 = arg0;
		this.aClass332_4 = new Class332((Interface2) null, 5126, 3, 0);
		this.aClass332_1 = new Class332((Interface2) null, 5126, 2, 0);
		this.aClass332_3 = new Class332((Interface2) null, 5126, 3, 0);
		this.aClass332_2 = new Class332((Interface2) null, 5121, 4, 0);
		this.aClass36_1 = new Class36();
	}

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(Lclient!ml;Lclient!rha;IIII)V")
	public Class54_Sub1(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) Class316 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt870 = arg2;
		this.aClass75_Sub3_4 = arg0;
		this.anInt907 = arg5;
		if (Static435.method6609(arg2, arg5)) {
			this.aClass332_4 = new Class332((Interface2) null, 5126, 3, 0);
		}
		if (Static170.method3322(arg2, arg5)) {
			this.aClass332_1 = new Class332((Interface2) null, 5126, 2, 0);
		}
		if (Static188.method3524(arg5, arg2)) {
			this.aClass332_3 = new Class332((Interface2) null, 5126, 3, 0);
		}
		if (Static373.method5634(arg2, arg5)) {
			this.aClass332_2 = new Class332((Interface2) null, 5121, 4, 0);
		}
		if (Static441.method4892(arg5, arg2)) {
			this.aClass36_1 = new Class36();
		}
		@Pc(116) Interface11 local116 = arg0.anInterface11_10;
		this.anIntArray69 = new int[arg1.anInt8603 + 1];
		@Pc(127) int[] local127 = new int[arg1.anInt8614];
		for (@Pc(129) int local129 = 0; local129 < arg1.anInt8614; local129++) {
			if (arg1.aByteArray90 == null || arg1.aByteArray90[local129] != 2) {
				if (arg1.aShortArray133 != null && arg1.aShortArray133[local129] != -1) {
					@Pc(167) Class297 local167 = local116.method6027(arg1.aShortArray133[local129] & 0xFFFF);
					if (((this.anInt907 & 0x40) == 0 || !local167.aBoolean625) && local167.aBoolean627) {
						continue;
					}
				}
				local127[this.anInt897++] = local129;
				this.anIntArray69[arg1.aShortArray131[local129]]++;
				this.anIntArray69[arg1.aShortArray125[local129]]++;
				this.anIntArray69[arg1.aShortArray129[local129]]++;
			}
		}
		this.anInt861 = this.anInt897;
		@Pc(251) long[] local251 = new long[this.anInt897];
		@Pc(266) boolean local266 = (this.anInt870 & 0x100) != 0;
		@Pc(280) int local280;
		@Pc(293) int local293;
		@Pc(485) int local485;
		for (@Pc(268) int local268 = 0; local268 < this.anInt897; local268++) {
			@Pc(276) int local276 = local127[local268];
			@Pc(278) Class297 local278 = null;
			local280 = 0;
			@Pc(282) byte local282 = 0;
			@Pc(284) byte local284 = 0;
			@Pc(286) byte local286 = 0;
			if (arg1.aClass395Array1 != null) {
				@Pc(291) boolean local291 = false;
				for (local293 = 0; local293 < arg1.aClass395Array1.length; local293++) {
					@Pc(300) Class395 local300 = arg1.aClass395Array1[local293];
					if (local300.anInt10374 == local276) {
						@Pc(313) Class399 local313 = Static634.method8589(local300.anInt10370);
						if (local313.aBoolean779) {
							local291 = true;
						}
						if (local313.anInt10492 != -1) {
							@Pc(329) Class297 local329 = local116.method6027(local313.anInt10492);
							if (local329.anInt8252 == 2) {
								this.aBoolean59 = true;
							}
						}
					}
				}
				if (local291) {
					local251[local268] = Long.MAX_VALUE;
					this.anInt861--;
					continue;
				}
			}
			@Pc(364) short local364 = -1;
			if (arg1.aShortArray133 != null) {
				local364 = arg1.aShortArray133[local276];
				if (local364 != -1) {
					local278 = local116.method6027(local364 & 0xFFFF);
					if ((this.anInt907 & 0x40) != 0 && local278.aBoolean625) {
						local278 = null;
						local364 = -1;
					} else {
						if (local278.aByte121 != 0 || local278.aByte119 != 0) {
							this.aBoolean60 = true;
						}
						local284 = local278.aByte124;
						local286 = local278.aByte122;
					}
				}
			}
			@Pc(443) boolean local443 = arg1.aByteArray94 != null && arg1.aByteArray94[local276] != 0 || local278 != null && local278.anInt8252 != 0;
			if ((local266 || local443) && arg1.aByteArray91 != null) {
				local280 += arg1.aByteArray91[local276] << 17;
			}
			if (local443) {
				local280 += 65536;
			}
			local280 += (local284 & 0xFF) << 8;
			local485 = local282 + ((local364 & 0xFFFF) << 16);
			local280 += local286 & 0xFF;
			@Pc(497) int local497 = local485 + (local268 & 0xFFFF);
			local251[local268] = (long) local497 + ((long) local280 << 32);
			this.aBoolean60 |= local278 != null && (local278.aByte121 != 0 || local278.aByte119 != 0);
			this.aBoolean59 |= local443;
		}
		Static677.method8633(local127, local251);
		this.anIntArray70 = arg1.anIntArray575;
		this.anIntArray68 = arg1.anIntArray570;
		this.anInt880 = arg1.anInt8603;
		this.aShortArray33 = arg1.aShortArray124;
		this.anInt867 = arg1.anInt8599;
		this.anIntArray66 = arg1.anIntArray574;
		@Pc(581) Class239[] local581 = new Class239[this.anInt880];
		this.aClass216Array1 = arg1.aClass216Array5;
		this.aClass173Array1 = arg1.aClass173Array5;
		@Pc(609) int local609;
		@Pc(625) int local625;
		@Pc(673) int local673;
		if (arg1.aClass395Array1 != null) {
			this.anInt918 = arg1.aClass395Array1.length;
			this.aClass76Array1 = new Class76[this.anInt918];
			this.aClass360Array1 = new Class360[this.anInt918];
			for (local609 = 0; local609 < this.anInt918; local609++) {
				@Pc(618) Class395 local618 = arg1.aClass395Array1[local609];
				@Pc(623) Class399 local623 = Static634.method8589(local618.anInt10370);
				local625 = -1;
				for (@Pc(627) int local627 = 0; local627 < this.anInt897; local627++) {
					if (local127[local627] == local618.anInt10374) {
						local625 = local627;
						break;
					}
				}
				if (local625 == -1) {
					throw new RuntimeException();
				}
				local673 = Static229.anIntArray228[arg1.aShortArray132[local618.anInt10374] & 0xFFFF] & 0xFFFFFF;
				@Pc(691) int local691 = local673 | 255 - (arg1.aByteArray94 == null ? 0 : arg1.aByteArray94[local618.anInt10374]) << 24;
				this.aClass360Array1[local609] = new Class360(local625, arg1.aShortArray131[local618.anInt10374], arg1.aShortArray125[local618.anInt10374], arg1.aShortArray129[local618.anInt10374], local623.anInt10493, local623.anInt10495, local623.anInt10492, local623.anInt10494, local623.anInt10496, local623.aBoolean779, local623.aBoolean778, local618.anInt10373);
				this.aClass76Array1[local609] = new Class76(local691);
			}
		}
		local609 = this.anInt897 * 3;
		this.aShortArray24 = new short[this.anInt897];
		if (arg1.aShortArray127 != null) {
			this.aShortArray26 = new short[this.anInt897];
		}
		Static93.aLongArray5 = new long[local609];
		this.aShortArray29 = new short[this.anInt897];
		this.aFloatArray4 = new float[local609];
		this.aByteArray10 = new byte[this.anInt897];
		this.aShortArray30 = new short[local609];
		this.aByteArray9 = new byte[local609];
		this.aShortArray31 = new short[local609];
		this.aFloatArray3 = new float[local609];
		this.aShort15 = (short) arg3;
		this.aShortArray25 = new short[this.anInt897];
		this.aShortArray27 = new short[this.anInt897];
		this.aShortArray34 = new short[local609];
		this.aShortArray28 = new short[local609];
		this.aShort8 = (short) arg4;
		this.aShortArray32 = new short[this.anInt897];
		local280 = 0;
		for (local485 = 0; local485 < arg1.anInt8603; local485++) {
			local625 = this.anIntArray69[local485];
			this.anIntArray69[local485] = local280;
			local581[local485] = new Class239();
			local280 += local625;
		}
		this.anIntArray69[arg1.anInt8603] = local280;
		@Pc(877) Class18 local877 = Static452.method6947(this.anInt897, local127, arg1);
		@Pc(881) Class364[] local881 = new Class364[arg1.anInt8614];
		@Pc(923) int local923;
		@Pc(934) int local934;
		@Pc(955) int local955;
		@Pc(966) int local966;
		@Pc(974) int local974;
		@Pc(983) int local983;
		@Pc(902) short local902;
		@Pc(913) int local913;
		for (local673 = 0; local673 < arg1.anInt8614; local673++) {
			@Pc(892) short local892 = arg1.aShortArray131[local673];
			@Pc(897) short local897 = arg1.aShortArray125[local673];
			local902 = arg1.aShortArray129[local673];
			local913 = this.anIntArray68[local897] - this.anIntArray68[local892];
			local923 = this.anIntArray70[local897] - this.anIntArray70[local892];
			local934 = this.anIntArray66[local897] - this.anIntArray66[local892];
			@Pc(945) int local945 = this.anIntArray68[local902] - this.anIntArray68[local892];
			local955 = this.anIntArray70[local902] - this.anIntArray70[local892];
			local966 = this.anIntArray66[local902] - this.anIntArray66[local892];
			local974 = local923 * local966 - local955 * local934;
			local983 = local934 * local945 - local913 * local966;
			@Pc(991) int local991 = local913 * local955 - local923 * local945;
			while (local974 > 8192 || local983 > 8192 || local991 > 8192 || local974 < -8192 || local983 < -8192 || local991 < -8192) {
				local983 >>= 0x1;
				local991 >>= 0x1;
				local974 >>= 0x1;
			}
			@Pc(1045) int local1045 = (int) Math.sqrt((double) (local974 * local974 + local983 * local983 + local991 * local991));
			if (local1045 <= 0) {
				local1045 = 1;
			}
			local991 = local991 * 256 / local1045;
			local974 = local974 * 256 / local1045;
			local983 = local983 * 256 / local1045;
			@Pc(1081) byte local1081 = arg1.aByteArray90 == null ? 0 : arg1.aByteArray90[local673];
			if (local1081 == 0) {
				@Pc(1116) Class239 local1116 = local581[local892];
				local1116.anInt6632 += local974;
				local1116.anInt6630 += local983;
				local1116.anInt6629++;
				local1116.anInt6631 += local991;
				@Pc(1144) Class239 local1144 = local581[local897];
				local1144.anInt6632 += local974;
				local1144.anInt6630 += local983;
				local1144.anInt6629++;
				local1144.anInt6631 += local991;
				@Pc(1172) Class239 local1172 = local581[local902];
				local1172.anInt6630 += local983;
				local1172.anInt6631 += local991;
				local1172.anInt6632 += local974;
				local1172.anInt6629++;
			} else if (local1081 == 1) {
				@Pc(1101) Class364 local1101 = local881[local673] = new Class364();
				local1101.anInt9834 = local991;
				local1101.anInt9832 = local983;
				local1101.anInt9831 = local974;
			}
		}
		@Pc(1211) int local1211;
		@Pc(1255) short local1255;
		for (local293 = 0; local293 < this.anInt897; local293++) {
			local1211 = local127[local293];
			@Pc(1218) int local1218 = arg1.aShortArray132[local1211] & 0xFFFF;
			if (arg1.aByteArray93 == null) {
				local913 = -1;
			} else {
				local913 = arg1.aByteArray93[local1211];
			}
			if (arg1.aByteArray94 == null) {
				local923 = 0;
			} else {
				local923 = arg1.aByteArray94[local1211] & 0xFF;
			}
			local1255 = arg1.aShortArray133 == null ? -1 : arg1.aShortArray133[local1211];
			if (local1255 != -1 && (this.anInt907 & 0x40) != 0) {
				@Pc(1273) Class297 local1273 = local116.method6027(local1255 & 0xFFFF);
				if (local1273.aBoolean625) {
					local1255 = -1;
				}
			}
			@Pc(1280) float local1280 = 0.0F;
			@Pc(1282) float local1282 = 0.0F;
			@Pc(1284) float local1284 = 0.0F;
			@Pc(1286) float local1286 = 0.0F;
			@Pc(1288) float local1288 = 0.0F;
			@Pc(1290) float local1290 = 0.0F;
			@Pc(1292) byte local1292 = 0;
			@Pc(1294) byte local1294 = 0;
			@Pc(1296) int local1296 = 0;
			@Pc(1332) byte local1332;
			@Pc(1349) short local1349;
			@Pc(2174) short local2174;
			@Pc(2179) short local2179;
			if (local1255 != -1) {
				if (local913 == -1) {
					local1288 = 0.0F;
					local1286 = 1.0F;
					local1294 = 2;
					local1282 = 1.0F;
					local1290 = 0.0F;
					local1280 = 0.0F;
					local1292 = 1;
					local1284 = 1.0F;
				} else {
					local913 &= 0xFF;
					local1332 = arg1.aByteArray96[local913];
					@Pc(1339) short local1339;
					@Pc(1344) short local1344;
					@Pc(1382) float local1382;
					@Pc(1393) float local1393;
					@Pc(1487) float local1487;
					@Pc(1738) float local1738;
					@Pc(1746) float local1746;
					@Pc(1754) float local1754;
					@Pc(1777) float local1777;
					@Pc(1800) float local1800;
					@Pc(1823) float local1823;
					if (local1332 == 0) {
						local1339 = arg1.aShortArray131[local1211];
						local1344 = arg1.aShortArray125[local1211];
						local1349 = arg1.aShortArray129[local1211];
						local2174 = arg1.aShortArray126[local913];
						local2179 = arg1.aShortArray128[local913];
						@Pc(2184) short local2184 = arg1.aShortArray130[local913];
						@Pc(2190) float local2190 = (float) arg1.anIntArray570[local2174];
						@Pc(2196) float local2196 = (float) arg1.anIntArray575[local2174];
						local1382 = (float) arg1.anIntArray574[local2174];
						local1393 = (float) arg1.anIntArray570[local2179] - local2190;
						local1487 = (float) arg1.anIntArray575[local2179] - local2196;
						@Pc(2227) float local2227 = (float) arg1.anIntArray574[local2179] - local1382;
						@Pc(2235) float local2235 = (float) arg1.anIntArray570[local2184] - local2190;
						@Pc(2243) float local2243 = (float) arg1.anIntArray575[local2184] - local2196;
						@Pc(2252) float local2252 = (float) arg1.anIntArray574[local2184] - local1382;
						@Pc(2261) float local2261 = (float) arg1.anIntArray570[local1339] - local2190;
						@Pc(2269) float local2269 = (float) arg1.anIntArray575[local1339] - local2196;
						@Pc(2277) float local2277 = (float) arg1.anIntArray574[local1339] - local1382;
						@Pc(2285) float local2285 = (float) arg1.anIntArray570[local1344] - local2190;
						@Pc(2294) float local2294 = (float) arg1.anIntArray575[local1344] - local2196;
						local1738 = (float) arg1.anIntArray574[local1344] - local1382;
						local1746 = (float) arg1.anIntArray570[local1349] - local2190;
						local1754 = (float) arg1.anIntArray575[local1349] - local2196;
						local1777 = (float) arg1.anIntArray574[local1349] - local1382;
						local1800 = local1487 * local2252 - local2243 * local2227;
						local1823 = local2235 * local2227 - local2252 * local1393;
						@Pc(2355) float local2355 = local1393 * local2243 - local1487 * local2235;
						@Pc(2363) float local2363 = local2355 * local2243 - local1823 * local2252;
						@Pc(2372) float local2372 = local1800 * local2252 - local2235 * local2355;
						@Pc(2381) float local2381 = local2235 * local1823 - local2243 * local1800;
						@Pc(2395) float local2395 = 1.0F / (local2381 * local2227 + local2372 * local1487 + local2363 * local1393);
						local1288 = local2395 * (local1754 * local2372 + local2363 * local1746 + local2381 * local1777);
						local1284 = (local1738 * local2381 + local2363 * local2285 + local2294 * local2372) * local2395;
						local1280 = (local2277 * local2381 + local2269 * local2372 + local2363 * local2261) * local2395;
						@Pc(2445) float local2445 = local1487 * local2355 - local2227 * local1823;
						@Pc(2453) float local2453 = local1823 * local1393 - local1800 * local1487;
						@Pc(2461) float local2461 = local2227 * local1800 - local2355 * local1393;
						@Pc(2475) float local2475 = 1.0F / (local2445 * local2235 + local2243 * local2461 + local2453 * local2252);
						local1286 = (local2453 * local1738 + local2294 * local2461 + local2285 * local2445) * local2475;
						local1290 = local2475 * (local2445 * local1746 + local2461 * local1754 + local2453 * local1777);
						local1282 = local2475 * (local2445 * local2261 + local2269 * local2461 + local2453 * local2277);
					} else {
						local1339 = arg1.aShortArray131[local1211];
						local1344 = arg1.aShortArray125[local1211];
						local1349 = arg1.aShortArray129[local1211];
						@Pc(1354) int local1354 = local877.anIntArray13[local913];
						@Pc(1359) int local1359 = local877.anIntArray14[local913];
						@Pc(1364) int local1364 = local877.anIntArray16[local913];
						@Pc(1369) float[] local1369 = local877.aFloatArrayArray1[local913];
						@Pc(1374) byte local1374 = arg1.aByteArray92[local913];
						local1382 = (float) arg1.anIntArray566[local913] / 256.0F;
						if (local1332 == 1) {
							local1393 = (float) arg1.anIntArray567[local913] / 1024.0F;
							Static569.method7984(local1374, Static571.aFloatArray73, local1359, local1364, arg1.anIntArray570[local1339], arg1.anIntArray574[local1339], arg1.anIntArray575[local1339], local1382, local1393, local1369, local1354);
							local1282 = Static571.aFloatArray73[1];
							local1280 = Static571.aFloatArray73[0];
							Static569.method7984(local1374, Static571.aFloatArray73, local1359, local1364, arg1.anIntArray570[local1344], arg1.anIntArray574[local1344], arg1.anIntArray575[local1344], local1382, local1393, local1369, local1354);
							local1284 = Static571.aFloatArray73[0];
							local1286 = Static571.aFloatArray73[1];
							Static569.method7984(local1374, Static571.aFloatArray73, local1359, local1364, arg1.anIntArray570[local1349], arg1.anIntArray574[local1349], arg1.anIntArray575[local1349], local1382, local1393, local1369, local1354);
							local1288 = Static571.aFloatArray73[0];
							local1290 = Static571.aFloatArray73[1];
							local1487 = local1393 / 2.0F;
							if ((local1374 & 0x1) == 0) {
								if (local1284 - local1280 > local1487) {
									local1284 -= local1393;
									local1292 = 1;
								} else if (local1280 - local1284 > local1487) {
									local1292 = 2;
									local1284 += local1393;
								}
								if (local1487 < local1288 - local1280) {
									local1294 = 1;
									local1288 -= local1393;
								} else if (local1487 < local1280 - local1288) {
									local1294 = 2;
									local1288 += local1393;
								}
							} else {
								if (local1487 < local1290 - local1282) {
									local1290 -= local1393;
									local1294 = 1;
								} else if (local1282 - local1290 > local1487) {
									local1290 += local1393;
									local1294 = 2;
								}
								if (local1487 < local1286 - local1282) {
									local1292 = 1;
									local1286 -= local1393;
								} else if (local1487 < local1282 - local1286) {
									local1292 = 2;
									local1286 += local1393;
								}
							}
						} else if (local1332 == 2) {
							local1393 = (float) arg1.anIntArray568[local913] / 256.0F;
							local1487 = (float) arg1.anIntArray576[local913] / 256.0F;
							@Pc(1649) int local1649 = arg1.anIntArray570[local1344] - arg1.anIntArray570[local1339];
							@Pc(1660) int local1660 = arg1.anIntArray575[local1344] - arg1.anIntArray575[local1339];
							@Pc(1671) int local1671 = arg1.anIntArray574[local1344] - arg1.anIntArray574[local1339];
							@Pc(1681) int local1681 = arg1.anIntArray570[local1349] - arg1.anIntArray570[local1339];
							@Pc(1692) int local1692 = arg1.anIntArray575[local1349] - arg1.anIntArray575[local1339];
							@Pc(1703) int local1703 = arg1.anIntArray574[local1349] - arg1.anIntArray574[local1339];
							@Pc(1712) int local1712 = local1703 * local1660 - local1671 * local1692;
							@Pc(1721) int local1721 = local1681 * local1671 - local1703 * local1649;
							@Pc(1730) int local1730 = local1649 * local1692 - local1660 * local1681;
							local1738 = 64.0F / (float) arg1.anIntArray571[local913];
							local1746 = 64.0F / (float) arg1.anIntArray573[local913];
							local1754 = 64.0F / (float) arg1.anIntArray567[local913];
							local1777 = (local1369[1] * (float) local1721 + (float) local1712 * local1369[0] + local1369[2] * (float) local1730) / local1738;
							local1800 = (local1369[5] * (float) local1730 + local1369[4] * (float) local1721 + (float) local1712 * local1369[3]) / local1746;
							local1823 = ((float) local1721 * local1369[7] + (float) local1712 * local1369[6] + local1369[8] * (float) local1730) / local1754;
							local1296 = Static524.method7531(local1800, local1777, local1823);
							Static252.method8469(local1359, local1296, arg1.anIntArray575[local1339], local1364, arg1.anIntArray574[local1339], local1382, local1487, local1393, Static571.aFloatArray73, arg1.anIntArray570[local1339], local1354, local1369, local1374);
							local1280 = Static571.aFloatArray73[0];
							local1282 = Static571.aFloatArray73[1];
							Static252.method8469(local1359, local1296, arg1.anIntArray575[local1344], local1364, arg1.anIntArray574[local1344], local1382, local1487, local1393, Static571.aFloatArray73, arg1.anIntArray570[local1344], local1354, local1369, local1374);
							local1284 = Static571.aFloatArray73[0];
							local1286 = Static571.aFloatArray73[1];
							Static252.method8469(local1359, local1296, arg1.anIntArray575[local1349], local1364, arg1.anIntArray574[local1349], local1382, local1487, local1393, Static571.aFloatArray73, arg1.anIntArray570[local1349], local1354, local1369, local1374);
							local1288 = Static571.aFloatArray73[0];
							local1290 = Static571.aFloatArray73[1];
						} else if (local1332 == 3) {
							Static96.method1396(local1354, arg1.anIntArray570[local1339], local1364, local1359, arg1.anIntArray574[local1339], local1369, local1374, arg1.anIntArray575[local1339], Static571.aFloatArray73, local1382);
							local1282 = Static571.aFloatArray73[1];
							local1280 = Static571.aFloatArray73[0];
							Static96.method1396(local1354, arg1.anIntArray570[local1344], local1364, local1359, arg1.anIntArray574[local1344], local1369, local1374, arg1.anIntArray575[local1344], Static571.aFloatArray73, local1382);
							local1286 = Static571.aFloatArray73[1];
							local1284 = Static571.aFloatArray73[0];
							Static96.method1396(local1354, arg1.anIntArray570[local1349], local1364, local1359, arg1.anIntArray574[local1349], local1369, local1374, arg1.anIntArray575[local1349], Static571.aFloatArray73, local1382);
							local1288 = Static571.aFloatArray73[0];
							local1290 = Static571.aFloatArray73[1];
							if ((local1374 & 0x1) == 0) {
								if (local1284 - local1280 > 0.5F) {
									local1292 = 1;
									local1284--;
								} else if (local1280 - local1284 > 0.5F) {
									local1284++;
									local1292 = 2;
								}
								if (local1288 - local1280 > 0.5F) {
									local1294 = 1;
									local1288--;
								} else if (local1280 - local1288 > 0.5F) {
									local1288++;
									local1294 = 2;
								}
							} else {
								if (local1290 - local1282 > 0.5F) {
									local1294 = 1;
									local1290--;
								} else if (local1282 - local1290 > 0.5F) {
									local1294 = 2;
									local1290++;
								}
								if (local1286 - local1282 > 0.5F) {
									local1292 = 1;
									local1286--;
								} else if (local1282 - local1286 > 0.5F) {
									local1292 = 2;
									local1286++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray90 == null) {
				local1332 = 0;
			} else {
				local1332 = arg1.aByteArray90[local1211];
			}
			if (local1332 == 0) {
				@Pc(2554) long local2554 = ((long) local923 + (long) (local1218 << 8) + (long) (local1296 << 24) << 32) + (long) (local913 << 2);
				local1349 = arg1.aShortArray131[local1211];
				local2174 = arg1.aShortArray125[local1211];
				local2179 = arg1.aShortArray129[local1211];
				@Pc(2573) Class239 local2573 = local581[local1349];
				this.aShortArray27[local293] = this.method902(arg1, local1349, local1282, local2573.anInt6630, local2573.anInt6631, local1280, local2573.anInt6632, local2573.anInt6629, local2554);
				@Pc(2597) Class239 local2597 = local581[local2174];
				this.aShortArray32[local293] = this.method902(arg1, local2174, local1286, local2597.anInt6630, local2597.anInt6631, local1284, local2597.anInt6632, local2597.anInt6629, (long) local1292 + local2554);
				@Pc(2624) Class239 local2624 = local581[local2179];
				this.aShortArray29[local293] = this.method902(arg1, local2179, local1290, local2624.anInt6630, local2624.anInt6631, local1288, local2624.anInt6632, local2624.anInt6629, local2554 + (long) local1294);
			} else if (local1332 == 1) {
				@Pc(2658) Class364 local2658 = local881[local1211];
				@Pc(2704) long local2704 = ((long) local923 + (long) (local1296 << 24) + (long) (local1218 << 8) << 32) + (long) ((local2658.anInt9834 + 256 << 22) + (local2658.anInt9832 + 256 << 12) + (local2658.anInt9831 > 0 ? 1024 : 2048) + (local913 << 2));
				this.aShortArray27[local293] = this.method902(arg1, arg1.aShortArray131[local1211], local1282, local2658.anInt9832, local2658.anInt9834, local1280, local2658.anInt9831, 0, local2704);
				this.aShortArray32[local293] = this.method902(arg1, arg1.aShortArray125[local1211], local1286, local2658.anInt9832, local2658.anInt9834, local1284, local2658.anInt9831, 0, (long) local1292 + local2704);
				this.aShortArray29[local293] = this.method902(arg1, arg1.aShortArray129[local1211], local1290, local2658.anInt9832, local2658.anInt9834, local1288, local2658.anInt9831, 0, (long) local1294 + local2704);
			}
			if (arg1.aByteArray94 != null) {
				this.aByteArray10[local293] = arg1.aByteArray94[local1211];
			}
			if (arg1.aShortArray127 != null) {
				this.aShortArray26[local293] = arg1.aShortArray127[local1211];
			}
			this.aShortArray24[local293] = arg1.aShortArray132[local1211];
			this.aShortArray25[local293] = local1255;
		}
		local1211 = 0;
		local902 = -10000;
		for (local913 = 0; local913 < this.anInt861; local913++) {
			@Pc(2835) short local2835 = this.aShortArray25[local913];
			if (local902 != local2835) {
				local902 = local2835;
				local1211++;
			}
		}
		this.anIntArray71 = new int[local1211 + 1];
		local902 = -10000;
		local1211 = 0;
		for (local923 = 0; local923 < this.anInt861; local923++) {
			local1255 = this.aShortArray25[local923];
			if (local902 != local1255) {
				local902 = local1255;
				this.anIntArray71[local1211++] = local923;
			}
		}
		this.anIntArray71[local1211] = this.anInt861;
		Static93.aLongArray5 = null;
		this.aShortArray30 = Static122.method2210(this.aShortArray30, this.anInt905);
		this.aShortArray28 = Static122.method2210(this.aShortArray28, this.anInt905);
		this.aShortArray31 = Static122.method2210(this.aShortArray31, this.anInt905);
		this.aByteArray9 = Static618.method8504(this.anInt905, this.aByteArray9);
		this.aFloatArray3 = Static535.method3793(this.anInt905, this.aFloatArray3);
		this.aFloatArray4 = Static535.method3793(this.anInt905, this.aFloatArray4);
		if (arg1.anIntArray569 != null && Static446.method6906(arg2, this.anInt907)) {
			this.anIntArrayArray5 = arg1.method7532(false);
		}
		if (arg1.aClass395Array1 != null && Static49.method595(this.anInt907, arg2)) {
			this.anIntArrayArray7 = arg1.method7543();
		}
		if (arg1.anIntArray572 != null && Static208.method3833(arg2, this.anInt907)) {
			local934 = 0;
			@Pc(3006) int[] local3006 = new int[256];
			for (local955 = 0; local955 < this.anInt897; local955++) {
				local966 = arg1.anIntArray572[local127[local955]];
				if (local966 >= 0) {
					if (local966 > local934) {
						local934 = local966;
					}
					@Pc(3037) int local3037 = local3006[local966]++;
				}
			}
			this.anIntArrayArray6 = new int[local934 + 1][];
			for (local966 = 0; local966 <= local934; local966++) {
				this.anIntArrayArray6[local966] = new int[local3006[local966]];
				local3006[local966] = 0;
			}
			for (local974 = 0; local974 < this.anInt897; local974++) {
				local983 = arg1.anIntArray572[local127[local974]];
				if (local983 >= 0) {
					this.anIntArrayArray6[local983][local3006[local983]++] = local974;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7403(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(43) int local43;
		@Pc(55) int local55;
		@Pc(53) int[] local53;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static230.anInt4473 = 0;
			Static367.anInt6182 = 0;
			Static644.anInt9970 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray5.length) {
					local53 = this.anIntArrayArray5[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static644.anInt9970 += this.anIntArray68[local61];
						Static230.anInt4473 += this.anIntArray70[local61];
						Static367.anInt6182 += this.anIntArray66[local61];
						local27++;
					}
				}
			}
			if (local27 <= 0) {
				Static230.anInt4473 = local17;
				Static644.anInt9970 = local25;
				Static367.anInt6182 = local21;
			} else {
				Static230.anInt4473 = Static230.anInt4473 / local27 + local17;
				Static367.anInt6182 = local21 + Static367.anInt6182 / local27;
				Static644.anInt9970 = local25 + Static644.anInt9970 / local27;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local25 = arg2 << 4;
			local21 = arg4 << 4;
			local17 = arg3 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray5.length > local35) {
					local161 = this.anIntArrayArray5[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local55 = local161[local163];
						this.anIntArray68[local55] += local25;
						this.anIntArray70[local55] += local17;
						this.anIntArray66[local55] += local21;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(305) int local305;
		@Pc(768) int local768;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray5.length > local35) {
					local161 = this.anIntArrayArray5[local35];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local55 = local161[local163];
							this.anIntArray68[local55] -= Static644.anInt9970;
							this.anIntArray70[local55] -= Static230.anInt4473;
							this.anIntArray66[local55] -= Static367.anInt6182;
							if (arg4 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg4];
								local286 = Class6_Sub2_Sub12.anIntArray292[arg4];
								local305 = this.anIntArray68[local55] * local286 + local61 * this.anIntArray70[local55] + 16383 >> 14;
								this.anIntArray70[local55] = local286 * this.anIntArray70[local55] + 16383 - this.anIntArray68[local55] * local61 >> 14;
								this.anIntArray68[local55] = local305;
							}
							if (arg2 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg2];
								local286 = Class6_Sub2_Sub12.anIntArray292[arg2];
								local305 = local286 * this.anIntArray70[local55] + 16383 - local61 * this.anIntArray66[local55] >> 14;
								this.anIntArray66[local55] = this.anIntArray70[local55] * local61 + local286 * this.anIntArray66[local55] + 16383 >> 14;
								this.anIntArray70[local55] = local305;
							}
							if (arg3 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg3];
								local286 = Class6_Sub2_Sub12.anIntArray292[arg3];
								local305 = this.anIntArray66[local55] * local61 + local286 * this.anIntArray68[local55] + 16383 >> 14;
								this.anIntArray66[local55] = this.anIntArray66[local55] * local286 + 16383 - local61 * this.anIntArray68[local55] >> 14;
								this.anIntArray68[local55] = local305;
							}
							this.anIntArray68[local55] += Static644.anInt9970;
							this.anIntArray70[local55] += Static230.anInt4473;
							this.anIntArray66[local55] += Static367.anInt6182;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local55 = local161[local163];
							this.anIntArray68[local55] -= Static644.anInt9970;
							this.anIntArray70[local55] -= Static230.anInt4473;
							this.anIntArray66[local55] -= Static367.anInt6182;
							if (arg2 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg2];
								local286 = Class6_Sub2_Sub12.anIntArray292[arg2];
								local305 = local286 * this.anIntArray70[local55] + 16383 - local61 * this.anIntArray66[local55] >> 14;
								this.anIntArray66[local55] = local61 * this.anIntArray70[local55] + this.anIntArray66[local55] * local286 + 16383 >> 14;
								this.anIntArray70[local55] = local305;
							}
							if (arg4 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg4];
								local286 = Class6_Sub2_Sub12.anIntArray292[arg4];
								local305 = local286 * this.anIntArray68[local55] + local61 * this.anIntArray70[local55] + 16383 >> 14;
								this.anIntArray70[local55] = this.anIntArray70[local55] * local286 + 16383 - this.anIntArray68[local55] * local61 >> 14;
								this.anIntArray68[local55] = local305;
							}
							if (arg3 != 0) {
								local61 = Class6_Sub2_Sub12.anIntArray293[arg3];
								local286 = Class6_Sub2_Sub12.anIntArray292[arg3];
								local305 = this.anIntArray66[local55] * local61 + this.anIntArray68[local55] * local286 + 16383 >> 14;
								this.anIntArray66[local55] = this.anIntArray66[local55] * local286 + 16383 - this.anIntArray68[local55] * local61 >> 14;
								this.anIntArray68[local55] = local305;
							}
							this.anIntArray68[local55] += Static644.anInt9970;
							this.anIntArray70[local55] += Static230.anInt4473;
							this.anIntArray66[local55] += Static367.anInt6182;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (local43 < this.anIntArrayArray5.length) {
						local53 = this.anIntArrayArray5[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local286 = this.anIntArray69[local61];
							local305 = this.anIntArray69[local61 + 1];
							for (local768 = local286; local768 < local305; local768++) {
								@Pc(777) int local777 = this.aShortArray34[local768] - 1;
								if (local777 == -1) {
									break;
								}
								@Pc(789) int local789;
								@Pc(793) int local793;
								@Pc(811) int local811;
								if (arg4 != 0) {
									local789 = Class6_Sub2_Sub12.anIntArray293[arg4];
									local793 = Class6_Sub2_Sub12.anIntArray292[arg4];
									local811 = this.aShortArray30[local777] * local793 + this.aShortArray28[local777] * local789 + 16383 >> 14;
									this.aShortArray28[local777] = (short) (local793 * this.aShortArray28[local777] + 16383 - local789 * this.aShortArray30[local777] >> 14);
									this.aShortArray30[local777] = (short) local811;
								}
								if (arg2 != 0) {
									local789 = Class6_Sub2_Sub12.anIntArray293[arg2];
									local793 = Class6_Sub2_Sub12.anIntArray292[arg2];
									local811 = this.aShortArray28[local777] * local793 + 16383 - local789 * this.aShortArray31[local777] >> 14;
									this.aShortArray31[local777] = (short) (local789 * this.aShortArray28[local777] + this.aShortArray31[local777] * local793 + 16383 >> 14);
									this.aShortArray28[local777] = (short) local811;
								}
								if (arg3 != 0) {
									local789 = Class6_Sub2_Sub12.anIntArray293[arg3];
									local793 = Class6_Sub2_Sub12.anIntArray292[arg3];
									local811 = this.aShortArray30[local777] * local793 + local789 * this.aShortArray31[local777] + 16383 >> 14;
									this.aShortArray31[local777] = (short) (this.aShortArray31[local777] * local793 + 16383 - local789 * this.aShortArray30[local777] >> 14);
									this.aShortArray30[local777] = (short) local811;
								}
							}
						}
					}
				}
				if (this.aClass332_3 == null && this.aClass332_2 != null) {
					this.aClass332_2.anInterface2_6 = null;
				}
				if (this.aClass332_3 != null) {
					this.aClass332_3.anInterface2_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray5.length) {
					local161 = this.anIntArrayArray5[local35];
					for (local163 = 0; local163 < local161.length; local163++) {
						local55 = local161[local163];
						this.anIntArray68[local55] -= Static644.anInt9970;
						this.anIntArray70[local55] -= Static230.anInt4473;
						this.anIntArray66[local55] -= Static367.anInt6182;
						this.anIntArray68[local55] = arg2 * this.anIntArray68[local55] >> 7;
						this.anIntArray70[local55] = arg3 * this.anIntArray70[local55] >> 7;
						this.anIntArray66[local55] = this.anIntArray66[local55] * arg4 >> 7;
						this.anIntArray68[local55] += Static644.anInt9970;
						this.anIntArray70[local55] += Static230.anInt4473;
						this.anIntArray66[local55] += Static367.anInt6182;
					}
				}
			}
		} else {
			@Pc(1259) Class360 local1259;
			@Pc(1264) Class76 local1264;
			if (arg0 == 5) {
				if (this.anIntArrayArray6 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray6.length > local35) {
							local161 = this.anIntArrayArray6[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local55 = local161[local163];
								local61 = (this.aByteArray10[local55] & 0xFF) + arg2 * 8;
								if (local61 < 0) {
									local61 = 0;
								} else if (local61 > 255) {
									local61 = 255;
								}
								this.aByteArray10[local55] = (byte) local61;
							}
							if (local161.length > 0 && this.aClass332_2 != null) {
								this.aClass332_2.anInterface2_6 = null;
							}
						}
					}
					if (this.aClass360Array1 != null) {
						for (local35 = 0; local35 < this.anInt918; local35++) {
							local1259 = this.aClass360Array1[local35];
							local1264 = this.aClass76Array1[local35];
							local1264.anInt2034 = local1264.anInt2034 & 0xFFFFFF | 255 - (this.aByteArray10[local1259.anInt9776] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1530) Class76 local1530;
				if (arg0 == 8) {
					if (this.anIntArrayArray7 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray7.length) {
								local161 = this.anIntArrayArray7[local35];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1530 = this.aClass76Array1[local161[local163]];
									local1530.anInt2042 += arg3;
									local1530.anInt2030 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray7 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray7.length) {
								local161 = this.anIntArrayArray7[local35];
								for (local163 = 0; local163 < local161.length; local163++) {
									local1530 = this.aClass76Array1[local161[local163]];
									local1530.anInt2037 = local1530.anInt2037 * arg2 >> 7;
									local1530.anInt2041 = arg3 * local1530.anInt2041 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray7 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray7.length) {
							local161 = this.anIntArrayArray7[local35];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1530 = this.aClass76Array1[local161[local163]];
								local1530.anInt2032 = local1530.anInt2032 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray6 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray6.length > local35) {
						local161 = this.anIntArrayArray6[local35];
						for (local163 = 0; local163 < local161.length; local163++) {
							local55 = local161[local163];
							local61 = this.aShortArray24[local55] & 0xFFFF;
							local286 = local61 >> 10 & 0x3F;
							local305 = local61 >> 7 & 0x7;
							local768 = local61 & 0x7F;
							local305 += arg3 / 4;
							@Pc(1365) int local1365 = arg2 + local286 & 0x3F;
							if (local305 < 0) {
								local305 = 0;
							} else if (local305 > 7) {
								local305 = 7;
							}
							local768 += arg4;
							if (local768 < 0) {
								local768 = 0;
							} else if (local768 > 127) {
								local768 = 127;
							}
							this.aShortArray24[local55] = (short) (local1365 << 10 | local305 << 7 | local768);
						}
						if (local161.length > 0 && this.aClass332_2 != null) {
							this.aClass332_2.anInterface2_6 = null;
						}
					}
				}
				if (this.aClass360Array1 != null) {
					for (local35 = 0; local35 < this.anInt918; local35++) {
						local1259 = this.aClass360Array1[local35];
						local1264 = this.aClass76Array1[local35];
						local1264.anInt2034 = Static229.anIntArray228[this.aShortArray24[local1259.anInt9776] & 0xFFFF] & 0xFFFFFF | local1264.anInt2034 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(B)V")
	private void method893() {
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = 32767;
		@Pc(16) int local16 = 32767;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = -32768;
		@Pc(22) int local22 = -32768;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt880; local28++) {
			@Pc(37) int local37 = this.anIntArray68[local28];
			@Pc(42) int local42 = this.anIntArray70[local28];
			@Pc(47) int local47 = this.anIntArray66[local28];
			if (local42 > local20) {
				local20 = local42;
			}
			if (local14 > local42) {
				local14 = local42;
			}
			if (local18 < local37) {
				local18 = local37;
			}
			if (local37 < local12) {
				local12 = local37;
			}
			if (local47 < local16) {
				local16 = local47;
			}
			if (local22 < local47) {
				local22 = local47;
			}
			@Pc(101) int local101 = local47 * local47 + local37 * local37;
			if (local24 < local101) {
				local24 = local101;
			}
			local101 = local42 * local42 + local47 * local47 + local37 * local37;
			if (local26 < local101) {
				local26 = local101;
			}
		}
		this.aShort7 = (short) local18;
		this.aShort13 = (short) local16;
		this.aShort10 = (short) local22;
		this.aShort14 = (short) local14;
		this.aShort12 = (short) local20;
		this.aShort6 = (short) local12;
		this.aShort9 = (short) (int) (Math.sqrt((double) local24) + 0.99D);
		this.aShort11 = (short) (int) (Math.sqrt((double) local26) + 0.99D);
		this.aBoolean62 = true;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!qa;IZ)V")
	@Override
	public void method7416(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray33 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt880; local15++) {
			if ((arg1 & this.aShortArray33[local15]) != 0) {
				if (arg2) {
					arg0.method4610(this.anIntArray68[local15], this.anIntArray70[local15], this.anIntArray66[local15], local13);
				} else {
					arg0.method4596(this.anIntArray68[local15], this.anIntArray70[local15], this.anIntArray66[local15], local13);
				}
				this.anIntArray68[local15] = local13[0];
				this.anIntArray70[local15] = local13[1];
				this.anIntArray66[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt870;
	}

	@OriginalMember(owner = "client!cea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort13;
	}

	@OriginalMember(owner = "client!cea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!cea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt867; local7++) {
			this.anIntArray68[local7] = this.anIntArray68[local7] + 7 >> 4;
			this.anIntArray70[local7] = this.anIntArray70[local7] + 7 >> 4;
			this.anIntArray66[local7] = this.anIntArray66[local7] + 7 >> 4;
		}
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt880; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray68[local15] + this.anIntArray66[local15] * local9 >> 14;
			this.anIntArray66[local15] = local13 * this.anIntArray66[local15] - this.anIntArray68[local15] * local9 >> 14;
			this.anIntArray68[local15] = local33;
		}
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!cea", name = "e", descriptor = "()[B")
	@Override
	public byte[] method7423() {
		return this.aByteArray10;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILclient!qa;ZII)Z")
	@Override
	public boolean method7399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method901(arg1, arg0, arg3, arg4, arg5, arg2);
	}

	@OriginalMember(owner = "client!cea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort15;
	}

	@OriginalMember(owner = "client!cea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort10;
	}

	@OriginalMember(owner = "client!cea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!cea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort14;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZB)V")
	private void method895(@OriginalArg(0) boolean arg0) {
		@Pc(19) boolean local19 = this.aClass332_2 != null && this.aClass332_2.anInterface2_6 == null;
		@Pc(33) boolean local33 = this.aClass332_3 != null && this.aClass332_3.anInterface2_6 == null;
		@Pc(47) boolean local47 = this.aClass332_4 != null && this.aClass332_4.anInterface2_6 == null;
		@Pc(61) boolean local61 = this.aClass332_1 != null && this.aClass332_1.anInterface2_6 == null;
		if (arg0) {
			local47 &= (this.aByte10 & 0x1) != 0;
			local61 &= (this.aByte10 & 0x8) != 0;
			local19 &= (this.aByte10 & 0x2) != 0;
			local33 &= (this.aByte10 & 0x4) != 0;
		}
		@Pc(121) byte local121 = 0;
		@Pc(125) byte local125 = 0;
		@Pc(127) byte local127 = 0;
		@Pc(129) byte local129 = 0;
		if (local47) {
			local121 = 12;
		}
		if (local19) {
			local125 = local121;
			local121 = (byte) (local121 + 4);
		}
		if (local33) {
			local127 = local121;
			local121 = (byte) (local121 + 12);
		}
		if (local61) {
			local129 = local121;
			local121 = (byte) (local121 + 8);
		}
		if (local121 == 0) {
			return;
		}
		if (local121 * this.anInt905 > this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2.aByteArray20.length) {
			this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2 = new Class6_Sub15_Sub2(local121 * (this.anInt905 + 100));
		} else {
			this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2.anInt3174 = 0;
		}
		@Pc(210) Class6_Sub15_Sub2 local210 = this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2;
		@Pc(220) int local220;
		@Pc(229) int local229;
		@Pc(257) int local257;
		@Pc(266) int local266;
		if (local47) {
			@Pc(236) int local236;
			@Pc(243) int local243;
			@Pc(248) int local248;
			@Pc(255) int local255;
			if (this.aClass75_Sub3_4.aBoolean480) {
				for (local220 = 0; local220 < this.anInt880; local220++) {
					local229 = Stream.floatToRawIntBits((float) this.anIntArray68[local220]);
					local236 = Stream.floatToRawIntBits((float) this.anIntArray70[local220]);
					local243 = Stream.floatToRawIntBits((float) this.anIntArray66[local220]);
					local248 = this.anIntArray69[local220];
					local255 = this.anIntArray69[local220 + 1];
					for (local257 = local248; local257 < local255; local257++) {
						local266 = this.aShortArray34[local257] - 1;
						if (local266 == -1) {
							break;
						}
						local210.anInt3174 = local121 * local266;
						local210.method3029(local229);
						local210.method3029(local236);
						local210.method3029(local243);
					}
				}
			} else {
				for (local220 = 0; local220 < this.anInt880; local220++) {
					local229 = Stream.floatToRawIntBits((float) this.anIntArray68[local220]);
					local236 = Stream.floatToRawIntBits((float) this.anIntArray70[local220]);
					local243 = Stream.floatToRawIntBits((float) this.anIntArray66[local220]);
					local248 = this.anIntArray69[local220];
					local255 = this.anIntArray69[local220 + 1];
					for (local257 = local248; local257 < local255; local257++) {
						local266 = this.aShortArray34[local257] - 1;
						if (local266 == -1) {
							break;
						}
						local210.anInt3174 = local121 * local266;
						local210.method3011(local229);
						local210.method3011(local236);
						local210.method3011(local243);
					}
				}
			}
		}
		@Pc(634) float local634;
		@Pc(510) short[] local510;
		@Pc(507) short[] local507;
		@Pc(516) short[] local516;
		@Pc(513) byte[] local513;
		@Pc(664) float local664;
		if (local19) {
			if (this.aClass332_3 == null) {
				if (this.aClass305_1 == null) {
					local507 = this.aShortArray28;
					local510 = this.aShortArray30;
					local513 = this.aByteArray9;
					local516 = this.aShortArray31;
				} else {
					local510 = this.aClass305_1.aShortArray114;
					local516 = this.aClass305_1.aShortArray112;
					local507 = this.aClass305_1.aShortArray113;
					local513 = this.aClass305_1.aByteArray86;
				}
				@Pc(540) float local540 = this.aClass75_Sub3_4.aFloatArray51[0];
				@Pc(546) float local546 = this.aClass75_Sub3_4.aFloatArray51[1];
				@Pc(552) float local552 = this.aClass75_Sub3_4.aFloatArray51[2];
				@Pc(556) float local556 = this.aClass75_Sub3_4.aFloat132;
				@Pc(566) float local566 = this.aClass75_Sub3_4.aFloat131 * 768.0F / (float) this.aShort8;
				@Pc(576) float local576 = this.aClass75_Sub3_4.aFloat115 * 768.0F / (float) this.aShort8;
				for (@Pc(578) int local578 = 0; local578 < this.anInt897; local578++) {
					@Pc(598) int local598 = this.method903(this.aByteArray10[local578], this.aShortArray24[local578], this.aShortArray25[local578], this.aShort15);
					@Pc(603) short local603 = this.aShortArray27[local578];
					@Pc(614) float local614 = this.aClass75_Sub3_4.aFloat114 * (float) (local598 >> 8 & 0xFF);
					@Pc(623) float local623 = (float) (local598 >>> 24) * this.aClass75_Sub3_4.aFloat123;
					local634 = this.aClass75_Sub3_4.aFloat128 * (float) (local598 >> 16 & 0xFF);
					@Pc(639) short local639 = (short) local513[local603];
					if (local639 == 0) {
						local664 = (local540 * (float) local510[local603] + local546 * (float) local507[local603] + local552 * (float) local516[local603]) * 0.0026041667F;
					} else {
						local664 = ((float) local516[local603] * local552 + (float) local510[local603] * local540 + local546 * (float) local507[local603]) / (float) (local639 * 256);
					}
					@Pc(705) float local705 = (local664 < 0.0F ? local576 : local566) * local664 + local556;
					@Pc(710) int local710 = (int) (local623 * local705);
					@Pc(715) int local715 = (int) (local705 * local634);
					if (local710 < 0) {
						local710 = 0;
					} else if (local710 > 255) {
						local710 = 255;
					}
					if (local715 < 0) {
						local715 = 0;
					} else if (local715 > 255) {
						local715 = 255;
					}
					@Pc(754) int local754 = (int) (local614 * local705);
					if (local754 < 0) {
						local754 = 0;
					} else if (local754 > 255) {
						local754 = 255;
					}
					local210.anInt3174 = local125 + local603 * local121;
					local210.method3016(local710);
					local210.method3016(local715);
					local210.method3016(local754);
					local210.method3016(255 - (this.aByteArray10[local578] & 0xFF));
					local603 = this.aShortArray32[local578];
					local639 = (short) local513[local603];
					if (local639 == 0) {
						local664 = (local546 * (float) local507[local603] + (float) local510[local603] * local540 + (float) local516[local603] * local552) * 0.0026041667F;
					} else {
						local664 = (local552 * (float) local516[local603] + (float) local507[local603] * local546 + local540 * (float) local510[local603]) / (float) (local639 * 256);
					}
					local705 = (local664 < 0.0F ? local576 : local566) * local664 + local556;
					local710 = (int) (local623 * local705);
					local715 = (int) (local705 * local634);
					if (local710 < 0) {
						local710 = 0;
					} else if (local710 > 255) {
						local710 = 255;
					}
					local754 = (int) (local705 * local614);
					if (local715 < 0) {
						local715 = 0;
					} else if (local715 > 255) {
						local715 = 255;
					}
					if (local754 < 0) {
						local754 = 0;
					} else if (local754 > 255) {
						local754 = 255;
					}
					local210.anInt3174 = local603 * local121 + local125;
					local210.method3016(local710);
					local210.method3016(local715);
					local210.method3016(local754);
					local210.method3016(255 - (this.aByteArray10[local578] & 0xFF));
					local603 = this.aShortArray29[local578];
					local639 = (short) local513[local603];
					if (local639 == 0) {
						local664 = ((float) local516[local603] * local552 + (float) local510[local603] * local540 + (float) local507[local603] * local546) * 0.0026041667F;
					} else {
						local664 = ((float) local507[local603] * local546 + local540 * (float) local510[local603] + local552 * (float) local516[local603]) / (float) (local639 * 256);
					}
					local705 = local556 + (local664 < 0.0F ? local576 : local566) * local664;
					local710 = (int) (local623 * local705);
					if (local710 < 0) {
						local710 = 0;
					} else if (local710 > 255) {
						local710 = 255;
					}
					local715 = (int) (local705 * local634);
					local754 = (int) (local705 * local614);
					if (local715 < 0) {
						local715 = 0;
					} else if (local715 > 255) {
						local715 = 255;
					}
					local210.anInt3174 = local121 * local603 + local125;
					if (local754 < 0) {
						local754 = 0;
					} else if (local754 > 255) {
						local754 = 255;
					}
					local210.method3016(local710);
					local210.method3016(local715);
					local210.method3016(local754);
					local210.method3016(255 - (this.aByteArray10[local578] & 0xFF));
				}
			} else {
				for (local220 = 0; local220 < this.anInt897; local220++) {
					local229 = this.method903(this.aByteArray10[local220], this.aShortArray24[local220], this.aShortArray25[local220], this.aShort15);
					local210.anInt3174 = this.aShortArray27[local220] * local121 + local125;
					local210.method3029(local229);
					local210.anInt3174 = local125 + local121 * this.aShortArray32[local220];
					local210.method3029(local229);
					local210.anInt3174 = local125 + local121 * this.aShortArray29[local220];
					local210.method3029(local229);
				}
			}
		}
		if (local33) {
			if (this.aClass305_1 == null) {
				local507 = this.aShortArray28;
				local513 = this.aByteArray9;
				local510 = this.aShortArray30;
				local516 = this.aShortArray31;
			} else {
				local510 = this.aClass305_1.aShortArray114;
				local516 = this.aClass305_1.aShortArray112;
				local507 = this.aClass305_1.aShortArray113;
				local513 = this.aClass305_1.aByteArray86;
			}
			@Pc(1203) float local1203 = 3.0F / (float) this.aShort8;
			local664 = 3.0F / (float) (this.aShort8 + this.aShort8 / 2);
			local210.anInt3174 = local127;
			if (this.aClass75_Sub3_4.aBoolean480) {
				for (local257 = 0; local257 < this.anInt905; local257++) {
					local266 = local513[local257] & 0xFF;
					if (local266 == 0) {
						local210.method3052(local664 * (float) local510[local257]);
						local210.method3052(local664 * (float) local507[local257]);
						local210.method3052((float) local516[local257] * local664);
					} else {
						local634 = local1203 / (float) local266;
						local210.method3052(local634 * (float) local510[local257]);
						local210.method3052((float) local507[local257] * local634);
						local210.method3052((float) local516[local257] * local634);
					}
					local210.anInt3174 += local121 - 12;
				}
			} else {
				for (local257 = 0; local257 < this.anInt905; local257++) {
					local266 = local513[local257] & 0xFF;
					if (local266 == 0) {
						local210.method3055((float) local510[local257] * local664);
						local210.method3055(local664 * (float) local507[local257]);
						local210.method3055(local664 * (float) local516[local257]);
					} else {
						local634 = local1203 / (float) local266;
						local210.method3055((float) local510[local257] * local634);
						local210.method3055((float) local507[local257] * local634);
						local210.method3055((float) local516[local257] * local634);
					}
					local210.anInt3174 += local121 - 12;
				}
			}
		}
		if (local61) {
			local210.anInt3174 = local129;
			if (this.aClass75_Sub3_4.aBoolean480) {
				for (local220 = 0; local220 < this.anInt905; local220++) {
					local210.method3052(this.aFloatArray3[local220]);
					local210.method3052(this.aFloatArray4[local220]);
					local210.anInt3174 += local121 - 8;
				}
			} else {
				for (local220 = 0; local220 < this.anInt905; local220++) {
					local210.method3055(this.aFloatArray3[local220]);
					local210.method3055(this.aFloatArray4[local220]);
					local210.anInt3174 += local121 - 8;
				}
			}
		}
		local210.anInt3174 = local121 * this.anInt905;
		@Pc(1562) Interface2 local1562;
		if (arg0) {
			if (this.anInterface2_1 == null) {
				this.anInterface2_1 = this.aClass75_Sub3_4.method5805(local121, local210.anInt3174, true, local210.aByteArray20);
			} else {
				this.anInterface2_1.method7558(local210.anInt3174, local121, local210.aByteArray20);
			}
			this.aByte10 = 0;
			local1562 = this.anInterface2_1;
		} else {
			local1562 = this.aClass75_Sub3_4.method5805(local121, local210.anInt3174, false, local210.aByteArray20);
			this.aBoolean61 = true;
		}
		if (local47) {
			this.aClass332_4.anInterface2_6 = local1562;
			this.aClass332_4.aByte137 = 0;
		}
		if (local61) {
			this.aClass332_1.anInterface2_6 = local1562;
			this.aClass332_1.aByte137 = local129;
		}
		if (local19) {
			this.aClass332_2.aByte137 = local125;
			this.aClass332_2.anInterface2_6 = local1562;
		}
		if (local33) {
			this.aClass332_3.anInterface2_6 = local1562;
			this.aClass332_3.aByte137 = local127;
		}
	}

	@OriginalMember(owner = "client!cea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt897; local3++) {
			if (arg0 == this.aShortArray24[local3]) {
				this.aShortArray24[local3] = arg1;
			}
		}
		if (this.aClass360Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt918; local42++) {
				@Pc(49) Class360 local49 = this.aClass360Array1[local42];
				@Pc(54) Class76 local54 = this.aClass76Array1[local42];
				local54.anInt2034 = Static229.anIntArray228[this.aShortArray24[local49.anInt9776] & 0xFFFF] & 0xFFFFFF | local54.anInt2034 & 0xFF000000;
			}
		}
		if (this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class54 method7398(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(21) Class54_Sub1 local21;
		@Pc(17) Class54_Sub1 local17;
		if (arg0 == 1) {
			local17 = this.aClass75_Sub3_4.aClass54_Sub1_7;
			local21 = this.aClass75_Sub3_4.aClass54_Sub1_4;
		} else if (arg0 == 2) {
			local17 = this.aClass75_Sub3_4.aClass54_Sub1_8;
			local21 = this.aClass75_Sub3_4.aClass54_Sub1_1;
		} else if (arg0 == 3) {
			local17 = this.aClass75_Sub3_4.aClass54_Sub1_5;
			local21 = this.aClass75_Sub3_4.aClass54_Sub1_6;
		} else if (arg0 == 4) {
			local21 = this.aClass75_Sub3_4.aClass54_Sub1_10;
			local17 = this.aClass75_Sub3_4.aClass54_Sub1_3;
		} else if (arg0 == 5) {
			local17 = this.aClass75_Sub3_4.aClass54_Sub1_2;
			local21 = this.aClass75_Sub3_4.aClass54_Sub1_9;
		} else {
			local21 = local17 = new Class54_Sub1(this.aClass75_Sub3_4);
		}
		return this.method898(local21, arg1, arg0 != 0, arg2, local17);
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "()V")
	@Override
	protected void method7420() {
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7405(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class54_Sub1 local8 = (Class54_Sub1) arg0;
		if (this.anInt897 == 0 || local8.anInt897 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt880;
		@Pc(24) int[] local24 = local8.anIntArray68;
		@Pc(27) int[] local27 = local8.anIntArray70;
		@Pc(30) int[] local30 = local8.anIntArray66;
		@Pc(33) short[] local33 = local8.aShortArray30;
		@Pc(36) short[] local36 = local8.aShortArray28;
		@Pc(39) short[] local39 = local8.aShortArray31;
		@Pc(42) byte[] local42 = local8.aByteArray9;
		@Pc(49) short[] local49;
		@Pc(61) short[] local61;
		@Pc(53) short[] local53;
		@Pc(57) byte[] local57;
		if (this.aClass305_1 == null) {
			local53 = null;
			local61 = null;
			local49 = null;
			local57 = null;
		} else {
			local49 = this.aClass305_1.aShortArray114;
			local53 = this.aClass305_1.aShortArray112;
			local57 = this.aClass305_1.aByteArray86;
			local61 = this.aClass305_1.aShortArray113;
		}
		@Pc(90) short[] local90;
		@Pc(82) short[] local82;
		@Pc(86) short[] local86;
		@Pc(78) byte[] local78;
		if (local8.aClass305_1 == null) {
			local86 = null;
			local90 = null;
			local78 = null;
			local82 = null;
		} else {
			local78 = local8.aClass305_1.aByteArray86;
			local82 = local8.aClass305_1.aShortArray113;
			local86 = local8.aClass305_1.aShortArray112;
			local90 = local8.aClass305_1.aShortArray114;
		}
		@Pc(103) int[] local103 = local8.anIntArray69;
		@Pc(106) short[] local106 = local8.aShortArray34;
		if (!local8.aBoolean62) {
			local8.method893();
		}
		@Pc(117) short local117 = local8.aShort14;
		@Pc(120) short local120 = local8.aShort12;
		@Pc(123) short local123 = local8.aShort6;
		@Pc(126) short local126 = local8.aShort7;
		@Pc(129) short local129 = local8.aShort13;
		@Pc(132) short local132 = local8.aShort10;
		for (@Pc(134) int local134 = 0; local134 < this.anInt880; local134++) {
			@Pc(144) int local144 = this.anIntArray70[local134] - arg2;
			if (local117 <= local144 && local144 <= local120) {
				@Pc(167) int local167 = this.anIntArray68[local134] - arg1;
				if (local123 <= local167 && local126 >= local167) {
					@Pc(191) int local191 = this.anIntArray66[local134] - arg3;
					if (local129 <= local191 && local132 >= local191) {
						@Pc(209) int local209 = -1;
						@Pc(214) int local214 = this.anIntArray69[local134];
						@Pc(221) int local221 = this.anIntArray69[local134 + 1];
						for (@Pc(223) int local223 = local214; local223 < local221; local223++) {
							local209 = this.aShortArray34[local223] - 1;
							if (local209 == -1 || this.aByteArray9[local209] != 0) {
								break;
							}
						}
						if (local209 != -1) {
							for (@Pc(264) int local264 = 0; local264 < local21; local264++) {
								if (local167 == local24[local264] && local30[local264] == local191 && local27[local264] == local144) {
									@Pc(297) int local297 = -1;
									local221 = local103[local264 + 1];
									local214 = local103[local264];
									for (@Pc(309) int local309 = local214; local309 < local221; local309++) {
										local297 = local106[local309] - 1;
										if (local297 == -1 || local42[local297] != 0) {
											break;
										}
									}
									if (local297 != -1) {
										if (local49 == null) {
											this.aClass305_1 = new Class305();
											local49 = this.aClass305_1.aShortArray114 = Static124.method2323(this.aShortArray30);
											local61 = this.aClass305_1.aShortArray113 = Static124.method2323(this.aShortArray28);
											local53 = this.aClass305_1.aShortArray112 = Static124.method2323(this.aShortArray31);
											local57 = this.aClass305_1.aByteArray86 = Static387.method5967(this.aByteArray9);
										}
										if (local90 == null) {
											@Pc(401) Class305 local401 = local8.aClass305_1 = new Class305();
											local90 = local401.aShortArray114 = Static124.method2323(local33);
											local82 = local401.aShortArray113 = Static124.method2323(local36);
											local86 = local401.aShortArray112 = Static124.method2323(local39);
											local78 = local401.aByteArray86 = Static387.method5967(local42);
										}
										@Pc(434) short local434 = this.aShortArray30[local209];
										@Pc(439) short local439 = this.aShortArray28[local209];
										@Pc(444) short local444 = this.aShortArray31[local209];
										local221 = local103[local264 + 1];
										@Pc(455) byte local455 = this.aByteArray9[local209];
										local214 = local103[local264];
										@Pc(469) int local469;
										for (@Pc(461) int local461 = local214; local461 < local221; local461++) {
											local469 = local106[local461] - 1;
											if (local469 == -1) {
												break;
											}
											if (local78[local469] != 0) {
												local90[local469] += local434;
												local82[local469] += local439;
												local86[local469] += local444;
												local78[local469] += local455;
											}
										}
										local434 = local33[local297];
										local214 = this.anIntArray69[local134];
										local455 = local42[local297];
										local221 = this.anIntArray69[local134 + 1];
										local439 = local36[local297];
										local444 = local39[local297];
										for (local469 = local214; local469 < local221; local469++) {
											@Pc(555) int local555 = this.aShortArray34[local469] - 1;
											if (local555 == -1) {
												break;
											}
											if (local57[local555] != 0) {
												local49[local555] += local434;
												local61[local555] += local439;
												local53[local555] += local444;
												local57[local555] += local455;
											}
										}
										if (this.aClass332_3 == null && this.aClass332_2 != null) {
											this.aClass332_2.anInterface2_6 = null;
										}
										if (this.aClass332_3 != null) {
											this.aClass332_3.anInterface2_6 = null;
										}
										if (local8.aClass332_3 == null && local8.aClass332_2 != null) {
											local8.aClass332_2.anInterface2_6 = null;
										}
										if (local8.aClass332_3 != null) {
											local8.aClass332_3.anInterface2_6 = null;
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

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method896(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg0 && arg6 > arg2 && arg4 > arg2) {
			return false;
		} else if (arg2 > arg0 && arg2 > arg6 && arg2 > arg4) {
			return false;
		} else if (arg1 < arg3 && arg1 < arg5 && arg7 > arg1) {
			return false;
		} else {
			return arg1 <= arg3 || arg1 <= arg5 || arg1 <= arg7;
		}
	}

	@OriginalMember(owner = "client!cea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class96 arg2, @OriginalArg(3) Class96 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean62) {
			this.method893();
		}
		@Pc(18) int local18 = this.aShort6 + arg4;
		@Pc(23) int local23 = this.aShort7 + arg4;
		@Pc(28) int local28 = this.aShort13 + arg6;
		@Pc(33) int local33 = this.aShort10 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || arg2.anInt9246 + local23 >> arg2.anInt9248 >= arg2.anInt9255 || local28 < 0 || arg2.anInt9257 <= arg2.anInt9246 + local33 >> arg2.anInt9248)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt9255 <= local23 + arg3.anInt9246 >> arg3.anInt9248 || local28 < 0 || local33 + arg3.anInt9246 >> arg3.anInt9248 >= arg3.anInt9257) {
				return;
			}
		} else {
			local18 >>= arg2.anInt9248;
			local23 = local23 + arg2.anInt9246 - 1 >> arg2.anInt9248;
			local28 >>= arg2.anInt9248;
			local33 = local33 + arg2.anInt9246 - 1 >> arg2.anInt9248;
			if (arg5 == arg2.method8080(local18, local28) && arg5 == arg2.method8080(local23, local28) && arg5 == arg2.method8080(local18, local33) && arg5 == arg2.method8080(local23, local33)) {
				return;
			}
		}
		@Pc(227) int local227;
		if (arg0 == 1) {
			for (local227 = 0; local227 < this.anInt880; local227++) {
				this.anIntArray70[local227] = this.anIntArray70[local227] + arg2.method8077(arg4 + this.anIntArray68[local227], arg6 + this.anIntArray66[local227]) - arg5;
			}
		} else {
			@Pc(301) int local301;
			@Pc(368) int local368;
			if (arg0 == 2) {
				@Pc(532) short local532 = this.aShort14;
				if (local532 == 0) {
					return;
				}
				for (local301 = 0; local301 < this.anInt880; local301++) {
					local368 = (this.anIntArray70[local301] << 16) / local532;
					if (local368 < arg1) {
						this.anIntArray70[local301] += (arg1 - local368) * (arg2.method8077(arg4 + this.anIntArray68[local301], arg6 + this.anIntArray66[local301]) - arg5) / arg1;
					}
				}
			} else {
				@Pc(376) int local376;
				if (arg0 == 3) {
					local227 = (arg1 & 0xFF) * 4;
					local301 = (arg1 >> 8 & 0xFF) * 4;
					local368 = (arg1 >> 16 & 0xFF) << 6;
					local376 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local227 >> 1) < 0 || arg2.anInt9246 + (local227 >> 1) + arg4 >= arg2.anInt9255 << arg2.anInt9248 || arg6 - (local301 >> 1) < 0 || (local301 >> 1) + arg6 + arg2.anInt9246 >= arg2.anInt9257 << arg2.anInt9248) {
						return;
					}
					this.method7411(arg4, local227, arg5, arg6, local376, local368, arg2, local301);
				} else if (arg0 == 4) {
					local227 = this.aShort12 - this.aShort14;
					for (local301 = 0; local301 < this.anInt880; local301++) {
						this.anIntArray70[local301] = this.anIntArray70[local301] + arg3.method8077(arg4 + this.anIntArray68[local301], this.anIntArray66[local301] + arg6) + local227 - arg5;
					}
				} else if (arg0 == 5) {
					local227 = this.aShort12 - this.aShort14;
					for (local301 = 0; local301 < this.anInt880; local301++) {
						local368 = arg4 + this.anIntArray68[local301];
						local376 = this.anIntArray66[local301] + arg6;
						@Pc(382) int local382 = arg2.method8077(local368, local376);
						@Pc(388) int local388 = arg3.method8077(local368, local376);
						@Pc(395) int local395 = local382 - arg1 - local388;
						this.anIntArray70[local301] = ((this.anIntArray70[local301] << 8) / local227 * local395 >> 8) + local382 - arg5;
					}
				}
			}
		}
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(I)V")
	private void method897() {
		if (!this.aBoolean61) {
			return;
		}
		this.aBoolean61 = false;
		if (this.aClass216Array1 == null && this.aClass173Array1 == null && this.aClass360Array1 == null && !Static524.method7529(this.anInt870, this.anInt907)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			if (this.anIntArray68 != null && !Static529.method7608(this.anInt907, this.anInt870)) {
				if (this.aClass332_4 != null && this.aClass332_4.anInterface2_6 == null) {
					this.aBoolean61 = true;
				} else {
					local37 = true;
					if (!this.aBoolean62) {
						this.method893();
					}
				}
			}
			if (this.anIntArray70 != null && !Static288.method4732(this.anInt907, this.anInt870)) {
				if (this.aClass332_4 != null && this.aClass332_4.anInterface2_6 == null) {
					this.aBoolean61 = true;
				} else {
					if (!this.aBoolean62) {
						this.method893();
					}
					local39 = true;
				}
			}
			if (this.anIntArray66 != null && !Static483.method7197(this.anInt907, this.anInt870)) {
				if (this.aClass332_4 != null && this.aClass332_4.anInterface2_6 == null) {
					this.aBoolean61 = true;
				} else {
					local41 = true;
					if (!this.aBoolean62) {
						this.method893();
					}
				}
			}
			if (local41) {
				this.anIntArray66 = null;
			}
			if (local39) {
				this.anIntArray70 = null;
			}
			if (local37) {
				this.anIntArray68 = null;
			}
		}
		if (this.aShortArray34 != null && this.anIntArray68 == null && this.anIntArray70 == null && this.anIntArray66 == null) {
			this.anIntArray69 = null;
			this.aShortArray34 = null;
		}
		if (this.aByteArray9 != null && !Static76.method1028(this.anInt870, this.anInt907)) {
			if (this.aClass332_3 == null) {
				if (this.aClass332_2 != null && this.aClass332_2.anInterface2_6 == null) {
					this.aBoolean61 = true;
				} else {
					this.aByteArray9 = null;
					this.aShortArray30 = this.aShortArray28 = this.aShortArray31 = null;
				}
			} else if (this.aClass332_3.anInterface2_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray30 = this.aShortArray28 = this.aShortArray31 = null;
				this.aByteArray9 = null;
			}
		}
		if (this.aShortArray24 != null && !Static629.method8579(this.anInt870, this.anInt907)) {
			if (this.aClass332_2 != null && this.aClass332_2.anInterface2_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray24 = null;
			}
		}
		if (this.aByteArray10 != null && !Static298.method4812(this.anInt870, this.anInt907)) {
			if (this.aClass332_2 != null && this.aClass332_2.anInterface2_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aByteArray10 = null;
			}
		}
		if (this.aFloatArray3 != null && !Static140.method2718(this.anInt870, this.anInt907)) {
			if (this.aClass332_1 != null && this.aClass332_1.anInterface2_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aFloatArray3 = this.aFloatArray4 = null;
			}
		}
		if (this.aShortArray25 != null && !Static183.method3452(this.anInt870, this.anInt907)) {
			if (this.aClass332_2 != null && this.aClass332_2.anInterface2_6 == null) {
				this.aBoolean61 = true;
			} else {
				this.aShortArray25 = null;
			}
		}
		if (this.aShortArray27 != null && !Static374.method5641(this.anInt870, this.anInt907)) {
			if ((this.aClass36_1 == null || this.aClass36_1.anInterface4_1 != null) && (this.aClass332_2 == null || this.aClass332_2.anInterface2_6 != null)) {
				this.aShortArray27 = this.aShortArray32 = this.aShortArray29 = null;
			} else {
				this.aBoolean61 = true;
			}
		}
		if (this.anIntArrayArray6 != null && !Static208.method3833(this.anInt870, this.anInt907)) {
			this.anIntArrayArray6 = null;
			this.aShortArray26 = null;
		}
		if (this.anIntArrayArray5 != null && !Static446.method6906(this.anInt870, this.anInt907)) {
			this.anIntArrayArray5 = null;
			this.aShortArray33 = null;
		}
		if (this.anIntArrayArray7 != null && !Static49.method595(this.anInt907, this.anInt870)) {
			this.anIntArrayArray7 = null;
		}
		if (this.anIntArray71 != null && (this.anInt870 & 0x800) == 0 && (this.anInt870 & 0x40000) == 0) {
			this.anIntArray71 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt880; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray70[local15] - this.anIntArray66[local15] * local9 >> 14;
			this.anIntArray66[local15] = this.anIntArray70[local15] * local9 + local13 * this.anIntArray66[local15] >> 14;
			this.anIntArray70[local15] = local33;
		}
		this.aBoolean62 = false;
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub18 ba(@OriginalArg(0) Class6_Sub2_Sub18 arg0) {
		if (this.anInt905 == 0) {
			return null;
		}
		if (!this.aBoolean62) {
			this.method893();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass75_Sub3_4.anInt6572 <= 0) {
			local43 = this.aShort6 - (this.aShort14 * this.aClass75_Sub3_4.anInt6572 >> 8) >> this.aClass75_Sub3_4.anInt6531;
			local60 = this.aShort7 - (this.aClass75_Sub3_4.anInt6572 * this.aShort12 >> 8) >> this.aClass75_Sub3_4.anInt6531;
		} else {
			local43 = this.aShort6 - (this.aShort12 * this.aClass75_Sub3_4.anInt6572 >> 8) >> this.aClass75_Sub3_4.anInt6531;
			local60 = this.aShort7 - (this.aShort14 * this.aClass75_Sub3_4.anInt6572 >> 8) >> this.aClass75_Sub3_4.anInt6531;
		}
		@Pc(118) int local118;
		@Pc(135) int local135;
		if (this.aClass75_Sub3_4.anInt6557 <= 0) {
			local118 = this.aShort13 - (this.aShort14 * this.aClass75_Sub3_4.anInt6557 >> 8) >> this.aClass75_Sub3_4.anInt6531;
			local135 = this.aShort10 - (this.aShort12 * this.aClass75_Sub3_4.anInt6557 >> 8) >> this.aClass75_Sub3_4.anInt6531;
		} else {
			local118 = this.aShort13 - (this.aClass75_Sub3_4.anInt6557 * this.aShort12 >> 8) >> this.aClass75_Sub3_4.anInt6531;
			local135 = this.aShort10 - (this.aShort14 * this.aClass75_Sub3_4.anInt6557 >> 8) >> this.aClass75_Sub3_4.anInt6531;
		}
		@Pc(177) int local177 = local60 + 1 - local43;
		@Pc(184) int local184 = local135 + 1 - local118;
		@Pc(187) Class6_Sub2_Sub18_Sub1 local187 = (Class6_Sub2_Sub18_Sub1) arg0;
		@Pc(205) Class6_Sub2_Sub18_Sub1 local205;
		if (local187 != null && local187.method7744(local177, local184)) {
			local205 = local187;
			local187.method7742();
		} else {
			local205 = new Class6_Sub2_Sub18_Sub1(this.aClass75_Sub3_4, local177, local184);
		}
		local205.method7738(local43, local135, local60, local118);
		this.method904(local205);
		return local205;
	}

	@OriginalMember(owner = "client!cea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!cea", name = "f", descriptor = "()V")
	@Override
	protected void method7418() {
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!qa;)V")
	@Override
	public void method7410(@OriginalArg(0) Class109 arg0) {
		@Pc(8) Class109_Sub2 local8 = (Class109_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass216Array1 != null) {
			for (local13 = 0; local13 < this.aClass216Array1.length; local13++) {
				@Pc(20) Class216 local20 = this.aClass216Array1[local13];
				@Pc(22) Class216 local22 = local20;
				if (local20.aClass216_1 != null) {
					local22 = local20.aClass216_1;
				}
				local22.anInt5653 = (int) (local8.aFloat73 + (float) this.anIntArray66[local20.anInt5662] * local8.aFloat82 + (float) this.anIntArray70[local20.anInt5662] * local8.aFloat77 + local8.aFloat78 * (float) this.anIntArray68[local20.anInt5662]);
				local22.anInt5657 = (int) (local8.aFloat76 * (float) this.anIntArray66[local20.anInt5662] + local8.aFloat79 * (float) this.anIntArray68[local20.anInt5662] + (float) this.anIntArray70[local20.anInt5662] * local8.aFloat80 + local8.aFloat81);
				local22.anInt5655 = (int) (local8.aFloat74 * (float) this.anIntArray68[local20.anInt5662] + (float) this.anIntArray70[local20.anInt5662] * local8.aFloat83 + local8.aFloat75 * (float) this.anIntArray66[local20.anInt5662] + local8.aFloat72);
				local22.anInt5663 = (int) (local8.aFloat73 + local8.aFloat82 * (float) this.anIntArray66[local20.anInt5658] + local8.aFloat78 * (float) this.anIntArray68[local20.anInt5658] + (float) this.anIntArray70[local20.anInt5658] * local8.aFloat77);
				local22.anInt5666 = (int) (local8.aFloat81 + local8.aFloat76 * (float) this.anIntArray66[local20.anInt5658] + local8.aFloat80 * (float) this.anIntArray70[local20.anInt5658] + local8.aFloat79 * (float) this.anIntArray68[local20.anInt5658]);
				local22.anInt5667 = (int) (local8.aFloat72 + local8.aFloat75 * (float) this.anIntArray66[local20.anInt5658] + (float) this.anIntArray70[local20.anInt5658] * local8.aFloat83 + (float) this.anIntArray68[local20.anInt5658] * local8.aFloat74);
				local22.anInt5665 = (int) ((float) this.anIntArray68[local20.anInt5664] * local8.aFloat78 + (float) this.anIntArray70[local20.anInt5664] * local8.aFloat77 + local8.aFloat82 * (float) this.anIntArray66[local20.anInt5664] + local8.aFloat73);
				local22.anInt5654 = (int) ((float) this.anIntArray70[local20.anInt5664] * local8.aFloat80 + (float) this.anIntArray68[local20.anInt5664] * local8.aFloat79 + local8.aFloat76 * (float) this.anIntArray66[local20.anInt5664] + local8.aFloat81);
				local22.anInt5656 = (int) ((float) this.anIntArray68[local20.anInt5664] * local8.aFloat74 + local8.aFloat83 * (float) this.anIntArray70[local20.anInt5664] + (float) this.anIntArray66[local20.anInt5664] * local8.aFloat75 + local8.aFloat72);
			}
		}
		if (this.aClass173Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass173Array1.length; local13++) {
			@Pc(367) Class173 local367 = this.aClass173Array1[local13];
			@Pc(369) Class173 local369 = local367;
			if (local367.aClass173_1 != null) {
				local369 = local367.aClass173_1;
			}
			if (local367.aClass109_4 == null) {
				local367.aClass109_4 = local8.method4609();
			} else {
				local367.aClass109_4.method4595(local8);
			}
			local369.anInt4955 = (int) (local8.aFloat73 + (float) this.anIntArray68[local367.anInt4951] * local8.aFloat78 + local8.aFloat77 * (float) this.anIntArray70[local367.anInt4951] + local8.aFloat82 * (float) this.anIntArray66[local367.anInt4951]);
			local369.anInt4954 = (int) (local8.aFloat81 + (float) this.anIntArray68[local367.anInt4951] * local8.aFloat79 + (float) this.anIntArray70[local367.anInt4951] * local8.aFloat80 + local8.aFloat76 * (float) this.anIntArray66[local367.anInt4951]);
			local369.anInt4949 = (int) (local8.aFloat72 + local8.aFloat83 * (float) this.anIntArray70[local367.anInt4951] + (float) this.anIntArray68[local367.anInt4951] * local8.aFloat74 + local8.aFloat75 * (float) this.anIntArray66[local367.anInt4951]);
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!cea;IIZZLclient!cea;)Lclient!ka;")
	private Class54 method898(@OriginalArg(0) Class54_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class54_Sub1 arg4) {
		arg0.aShort15 = this.aShort15;
		arg0.anInt905 = this.anInt905;
		arg0.anInt918 = this.anInt918;
		arg0.aByte10 = 0;
		arg0.anInt870 = arg1;
		arg0.anInt867 = this.anInt867;
		if ((arg1 & 0x100) == 0) {
			arg0.aBoolean59 = this.aBoolean59;
		} else {
			arg0.aBoolean59 = true;
		}
		arg0.anInt907 = this.anInt907;
		arg0.aBoolean60 = this.aBoolean60;
		arg0.anInt897 = this.anInt897;
		arg0.aShort8 = this.aShort8;
		arg0.anInt861 = this.anInt861;
		arg0.anInt880 = this.anInt880;
		@Pc(77) boolean local77 = Static465.method7031(this.anInt907, arg1);
		@Pc(85) boolean local85 = Static4.method25(arg1, this.anInt907);
		@Pc(91) boolean local91 = Static447.method6916(arg1, this.anInt907);
		@Pc(97) boolean local97 = local77 | local85 | local91;
		@Pc(234) int local234;
		if (local97) {
			if (!local77) {
				arg0.anIntArray68 = this.anIntArray68;
			} else if (arg4.anIntArray68 == null || this.anInt867 > arg4.anIntArray68.length) {
				arg0.anIntArray68 = arg4.anIntArray68 = new int[this.anInt867];
			} else {
				arg0.anIntArray68 = arg4.anIntArray68;
			}
			if (!local85) {
				arg0.anIntArray70 = this.anIntArray70;
			} else if (arg4.anIntArray70 == null || arg4.anIntArray70.length < this.anInt867) {
				arg0.anIntArray70 = arg4.anIntArray70 = new int[this.anInt867];
			} else {
				arg0.anIntArray70 = arg4.anIntArray70;
			}
			if (!local91) {
				arg0.anIntArray66 = this.anIntArray66;
			} else if (arg4.anIntArray66 == null || this.anInt867 > arg4.anIntArray66.length) {
				arg0.anIntArray66 = arg4.anIntArray66 = new int[this.anInt867];
			} else {
				arg0.anIntArray66 = arg4.anIntArray66;
			}
			for (local234 = 0; local234 < this.anInt867; local234++) {
				if (local77) {
					arg0.anIntArray68[local234] = this.anIntArray68[local234];
				}
				if (local85) {
					arg0.anIntArray70[local234] = this.anIntArray70[local234];
				}
				if (local91) {
					arg0.anIntArray66[local234] = this.anIntArray66[local234];
				}
			}
		} else {
			arg0.anIntArray66 = this.anIntArray66;
			arg0.anIntArray70 = this.anIntArray70;
			arg0.anIntArray68 = this.anIntArray68;
		}
		if (Static114.method2148(this.anInt907, arg1)) {
			arg0.aClass332_4 = arg4.aClass332_4;
			if (arg2) {
				arg0.aByte10 = (byte) (arg0.aByte10 | 0x1);
			}
			arg0.aClass332_4.anInterface2_6 = this.aClass332_4.anInterface2_6;
			arg0.aClass332_4.aByte137 = this.aClass332_4.aByte137;
		} else if (Static435.method6609(arg1, this.anInt907)) {
			arg0.aClass332_4 = this.aClass332_4;
		} else {
			arg0.aClass332_4 = null;
		}
		if (Static577.method8048(arg1, this.anInt907)) {
			if (arg4.aShortArray24 == null || arg4.aShortArray24.length < this.anInt897) {
				arg0.aShortArray24 = arg4.aShortArray24 = new short[this.anInt897];
			} else {
				arg0.aShortArray24 = arg4.aShortArray24;
			}
			for (local234 = 0; local234 < this.anInt897; local234++) {
				arg0.aShortArray24[local234] = this.aShortArray24[local234];
			}
		} else {
			arg0.aShortArray24 = this.aShortArray24;
		}
		if (Static207.method3816(arg1, this.anInt907)) {
			if (arg4.aByteArray10 == null || this.anInt897 > arg4.aByteArray10.length) {
				arg0.aByteArray10 = arg4.aByteArray10 = new byte[this.anInt897];
			} else {
				arg0.aByteArray10 = arg4.aByteArray10;
			}
			for (local234 = 0; local234 < this.anInt897; local234++) {
				arg0.aByteArray10[local234] = this.aByteArray10[local234];
			}
		} else {
			arg0.aByteArray10 = this.aByteArray10;
		}
		if (Static584.method8153(arg1, this.anInt907)) {
			arg0.aClass332_2 = arg4.aClass332_2;
			if (arg2) {
				arg0.aByte10 = (byte) (arg0.aByte10 | 0x2);
			}
			arg0.aClass332_2.anInterface2_6 = this.aClass332_2.anInterface2_6;
			arg0.aClass332_2.aByte137 = this.aClass332_2.aByte137;
		} else if (Static373.method5634(arg1, this.anInt907)) {
			arg0.aClass332_2 = this.aClass332_2;
		} else {
			arg0.aClass332_2 = null;
		}
		@Pc(702) int local702;
		if (Static249.method4344(arg1, this.anInt907)) {
			if (arg4.aShortArray30 == null || this.anInt905 > arg4.aShortArray30.length) {
				local234 = this.anInt905;
				arg0.aShortArray30 = arg4.aShortArray30 = new short[local234];
				arg0.aShortArray31 = arg4.aShortArray31 = new short[local234];
				arg0.aShortArray28 = arg4.aShortArray28 = new short[local234];
			} else {
				arg0.aShortArray30 = arg4.aShortArray30;
				arg0.aShortArray28 = arg4.aShortArray28;
				arg0.aShortArray31 = arg4.aShortArray31;
			}
			if (this.aClass305_1 == null) {
				for (local234 = 0; local234 < this.anInt905; local234++) {
					arg0.aShortArray30[local234] = this.aShortArray30[local234];
					arg0.aShortArray28[local234] = this.aShortArray28[local234];
					arg0.aShortArray31[local234] = this.aShortArray31[local234];
				}
			} else {
				if (arg4.aClass305_1 == null) {
					arg4.aClass305_1 = new Class305();
				}
				@Pc(688) Class305 local688 = arg0.aClass305_1 = arg4.aClass305_1;
				if (local688.aShortArray114 == null || local688.aShortArray114.length < this.anInt905) {
					local702 = this.anInt905;
					local688.aShortArray113 = new short[local702];
					local688.aShortArray114 = new short[local702];
					local688.aShortArray112 = new short[local702];
					local688.aByteArray86 = new byte[local702];
				}
				for (local702 = 0; local702 < this.anInt905; local702++) {
					arg0.aShortArray30[local702] = this.aShortArray30[local702];
					arg0.aShortArray28[local702] = this.aShortArray28[local702];
					arg0.aShortArray31[local702] = this.aShortArray31[local702];
					local688.aShortArray114[local702] = this.aClass305_1.aShortArray114[local702];
					local688.aShortArray113[local702] = this.aClass305_1.aShortArray113[local702];
					local688.aShortArray112[local702] = this.aClass305_1.aShortArray112[local702];
					local688.aByteArray86[local702] = this.aClass305_1.aByteArray86[local702];
				}
			}
			arg0.aByteArray9 = this.aByteArray9;
		} else {
			arg0.aByteArray9 = this.aByteArray9;
			arg0.aClass305_1 = this.aClass305_1;
			arg0.aShortArray30 = this.aShortArray30;
			arg0.aShortArray28 = this.aShortArray28;
			arg0.aShortArray31 = this.aShortArray31;
		}
		if (Static30.method351(this.anInt907, arg1)) {
			arg0.aClass332_3 = arg4.aClass332_3;
			if (arg2) {
				arg0.aByte10 = (byte) (arg0.aByte10 | 0x4);
			}
			arg0.aClass332_3.anInterface2_6 = this.aClass332_3.anInterface2_6;
			arg0.aClass332_3.aByte137 = this.aClass332_3.aByte137;
		} else if (Static188.method3524(this.anInt907, arg1)) {
			arg0.aClass332_3 = this.aClass332_3;
		} else {
			arg0.aClass332_3 = null;
		}
		if (Static41.method528(this.anInt907, arg1)) {
			if (arg4.aFloatArray3 == null || arg4.aFloatArray3.length < this.anInt897) {
				local234 = this.anInt905;
				arg0.aFloatArray4 = arg4.aFloatArray4 = new float[local234];
				arg0.aFloatArray3 = arg4.aFloatArray3 = new float[local234];
			} else {
				arg0.aFloatArray4 = arg4.aFloatArray4;
				arg0.aFloatArray3 = arg4.aFloatArray3;
			}
			for (local234 = 0; local234 < this.anInt905; local234++) {
				arg0.aFloatArray3[local234] = this.aFloatArray3[local234];
				arg0.aFloatArray4[local234] = this.aFloatArray4[local234];
			}
		} else {
			arg0.aFloatArray4 = this.aFloatArray4;
			arg0.aFloatArray3 = this.aFloatArray3;
		}
		if (Static13.method182(this.anInt907, arg1)) {
			arg0.aClass332_1 = arg4.aClass332_1;
			if (arg2) {
				arg0.aByte10 = (byte) (arg0.aByte10 | 0x8);
			}
			arg0.aClass332_1.anInterface2_6 = this.aClass332_1.anInterface2_6;
			arg0.aClass332_1.aByte137 = this.aClass332_1.aByte137;
		} else if (Static170.method3322(arg1, this.anInt907)) {
			arg0.aClass332_1 = this.aClass332_1;
		} else {
			arg0.aClass332_1 = null;
		}
		if (Static207.method3818(this.anInt907, arg1)) {
			if (arg4.aShortArray27 == null || this.anInt897 > arg4.aShortArray27.length) {
				local234 = this.anInt897;
				arg0.aShortArray27 = arg4.aShortArray27 = new short[local234];
				arg0.aShortArray32 = arg4.aShortArray32 = new short[local234];
				arg0.aShortArray29 = arg4.aShortArray29 = new short[local234];
			} else {
				arg0.aShortArray27 = arg4.aShortArray27;
				arg0.aShortArray32 = arg4.aShortArray32;
				arg0.aShortArray29 = arg4.aShortArray29;
			}
			for (local234 = 0; local234 < this.anInt897; local234++) {
				arg0.aShortArray27[local234] = this.aShortArray27[local234];
				arg0.aShortArray32[local234] = this.aShortArray32[local234];
				arg0.aShortArray29[local234] = this.aShortArray29[local234];
			}
		} else {
			arg0.aShortArray27 = this.aShortArray27;
			arg0.aShortArray32 = this.aShortArray32;
			arg0.aShortArray29 = this.aShortArray29;
		}
		if (Static121.method2200(arg1, this.anInt907)) {
			if (arg2) {
				arg0.aByte10 = (byte) (arg0.aByte10 | 0x10);
			}
			arg0.aClass36_1 = arg4.aClass36_1;
			arg0.aClass36_1.anInterface4_1 = this.aClass36_1.anInterface4_1;
		} else if (Static441.method4892(this.anInt907, arg1)) {
			arg0.aClass36_1 = this.aClass36_1;
		} else {
			arg0.aClass36_1 = null;
		}
		if (Static150.method2925(arg1, this.anInt907)) {
			if (arg4.aShortArray25 == null || arg4.aShortArray25.length < this.anInt897) {
				local234 = this.anInt897;
				arg0.aShortArray25 = arg4.aShortArray25 = new short[local234];
			} else {
				arg0.aShortArray25 = arg4.aShortArray25;
			}
			for (local234 = 0; local234 < this.anInt897; local234++) {
				arg0.aShortArray25[local234] = this.aShortArray25[local234];
			}
		} else {
			arg0.aShortArray25 = this.aShortArray25;
		}
		if (!Static90.method8274(this.anInt907, arg1)) {
			arg0.aClass76Array1 = this.aClass76Array1;
		} else if (arg4.aClass76Array1 == null || this.anInt918 > arg4.aClass76Array1.length) {
			local234 = this.anInt918;
			arg0.aClass76Array1 = arg4.aClass76Array1 = new Class76[local234];
			for (local702 = 0; local702 < this.anInt918; local702++) {
				arg0.aClass76Array1[local702] = this.aClass76Array1[local702].method1967();
			}
		} else {
			arg0.aClass76Array1 = arg4.aClass76Array1;
			for (local234 = 0; local234 < this.anInt918; local234++) {
				arg0.aClass76Array1[local234].method1966(this.aClass76Array1[local234]);
			}
		}
		arg0.anIntArrayArray7 = this.anIntArrayArray7;
		if (this.aBoolean62) {
			arg0.aShort13 = this.aShort13;
			arg0.aBoolean62 = true;
			arg0.aShort12 = this.aShort12;
			arg0.aShort9 = this.aShort9;
			arg0.aShort14 = this.aShort14;
			arg0.aShort6 = this.aShort6;
			arg0.aShort11 = this.aShort11;
			arg0.aShort10 = this.aShort10;
			arg0.aShort7 = this.aShort7;
		} else {
			arg0.aBoolean62 = false;
		}
		arg0.aShortArray26 = this.aShortArray26;
		arg0.aClass360Array1 = this.aClass360Array1;
		arg0.aClass173Array1 = this.aClass173Array1;
		arg0.aShortArray34 = this.aShortArray34;
		arg0.anIntArrayArray6 = this.anIntArrayArray6;
		arg0.anIntArray71 = this.anIntArray71;
		arg0.anIntArrayArray5 = this.anIntArrayArray5;
		arg0.anIntArray69 = this.anIntArray69;
		arg0.aShortArray33 = this.aShortArray33;
		arg0.aClass216Array1 = this.aClass216Array1;
		return arg0;
	}

	@OriginalMember(owner = "client!cea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt880; local15++) {
			local34 = local9 * this.anIntArray66[local15] + local13 * this.anIntArray68[local15] >> 14;
			this.anIntArray66[local15] = this.anIntArray66[local15] * local13 - local9 * this.anIntArray68[local15] >> 14;
			this.anIntArray68[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt905; local34++) {
			@Pc(92) int local92 = this.aShortArray31[local34] * local9 + this.aShortArray30[local34] * local13 >> 14;
			this.aShortArray31[local34] = (short) (this.aShortArray31[local34] * local13 - local9 * this.aShortArray30[local34] >> 14);
			this.aShortArray30[local34] = (short) local92;
		}
		if (this.aClass332_3 == null && this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
		if (this.aClass332_3 != null) {
			this.aClass332_3.anInterface2_6 = null;
		}
		this.aBoolean62 = false;
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IILclient!qa;ZI)Z")
	@Override
	public boolean method7417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method901(arg1, arg0, arg3, arg4, -1, arg2);
	}

	@OriginalMember(owner = "client!cea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt870 = arg0;
		if (this.aClass305_1 != null && (this.anInt870 & 0x10000) == 0) {
			this.aByteArray9 = this.aClass305_1.aByteArray86;
			this.aShortArray28 = this.aClass305_1.aShortArray113;
			this.aShortArray31 = this.aClass305_1.aShortArray112;
			this.aShortArray30 = this.aClass305_1.aShortArray114;
			this.aClass305_1 = null;
		}
		this.aBoolean61 = true;
		this.method897();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!qa;Lclient!wha;I)V")
	@Override
	public void method7401(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt905 == 0) {
			return;
		}
		@Pc(14) Class109_Sub2 local14 = this.aClass75_Sub3_4.aClass109_Sub2_3;
		@Pc(17) Class109_Sub2 local17 = (Class109_Sub2) arg0;
		if (!this.aBoolean62) {
			this.method893();
		}
		Static329.aFloat105 = local17.aFloat73 * local14.aFloat74 + local14.aFloat83 * local17.aFloat81 + local17.aFloat72 * local14.aFloat75 + local14.aFloat72;
		Static482.aFloat161 = local14.aFloat75 * local17.aFloat83 + local17.aFloat77 * local14.aFloat74 + local17.aFloat80 * local14.aFloat83;
		@Pc(72) float local72 = Static329.aFloat105 + (float) this.aShort14 * Static482.aFloat161;
		@Pc(80) float local80 = Static329.aFloat105 + Static482.aFloat161 * (float) this.aShort12;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort9 + local72;
			local97 = (float) -this.aShort9 + local80;
		} else {
			local90 = local80 + (float) this.aShort9;
			local97 = (float) -this.aShort9 + local72;
		}
		if (this.aClass75_Sub3_4.aFloat125 <= local97 || (float) this.aClass75_Sub3_4.anInt6548 >= local90) {
			return;
		}
		Static425.aFloat141 = local17.aFloat83 * local14.aFloat82 + local17.aFloat80 * local14.aFloat77 + local17.aFloat77 * local14.aFloat78;
		Static667.aFloat199 = local14.aFloat73 + local14.aFloat77 * local17.aFloat81 + local17.aFloat73 * local14.aFloat78 + local14.aFloat82 * local17.aFloat72;
		@Pc(176) float local176 = Static425.aFloat141 * (float) this.aShort14 + Static667.aFloat199;
		@Pc(184) float local184 = (float) this.aShort12 * Static425.aFloat141 + Static667.aFloat199;
		@Pc(210) float local210;
		@Pc(199) float local199;
		if (local184 < local176) {
			local199 = (float) this.aClass75_Sub3_4.anInt6542 * (local176 + (float) this.aShort9);
			local210 = (local184 - (float) this.aShort9) * (float) this.aClass75_Sub3_4.anInt6542;
		} else {
			local199 = (float) this.aClass75_Sub3_4.anInt6542 * (local184 + (float) this.aShort9);
			local210 = (float) this.aClass75_Sub3_4.anInt6542 * ((float) -this.aShort9 + local176);
		}
		if (local210 / local90 >= this.aClass75_Sub3_4.aFloat124 || local199 / local90 <= this.aClass75_Sub3_4.aFloat113) {
			return;
		}
		Static512.aFloat171 = local14.aFloat81 + local17.aFloat72 * local14.aFloat76 + local14.aFloat80 * local17.aFloat81 + local14.aFloat79 * local17.aFloat73;
		Static191.aFloat70 = local14.aFloat76 * local17.aFloat83 + local17.aFloat77 * local14.aFloat79 + local14.aFloat80 * local17.aFloat80;
		@Pc(302) float local302 = Static512.aFloat171 + (float) this.aShort14 * Static191.aFloat70;
		@Pc(310) float local310 = (float) this.aShort12 * Static191.aFloat70 + Static512.aFloat171;
		@Pc(326) float local326;
		@Pc(337) float local337;
		if (local302 > local310) {
			local337 = (float) this.aClass75_Sub3_4.anInt6567 * (local302 + (float) this.aShort9);
			local326 = (local310 - (float) this.aShort9) * (float) this.aClass75_Sub3_4.anInt6567;
		} else {
			local326 = (float) this.aClass75_Sub3_4.anInt6567 * ((float) -this.aShort9 + local302);
			local337 = ((float) this.aShort9 + local310) * (float) this.aClass75_Sub3_4.anInt6567;
		}
		if (this.aClass75_Sub3_4.aFloat126 <= local326 / local90 || this.aClass75_Sub3_4.aFloat127 >= local337 / local90) {
			return;
		}
		if (arg1 != null || this.aClass360Array1 != null) {
			Static269.aFloat100 = local14.aFloat83 * local17.aFloat76 + local14.aFloat74 * local17.aFloat82 + local17.aFloat75 * local14.aFloat75;
			Static315.aFloat104 = local17.aFloat74 * local14.aFloat76 + local14.aFloat79 * local17.aFloat78 + local14.aFloat80 * local17.aFloat79;
			Static254.aFloat97 = local14.aFloat82 * local17.aFloat75 + local17.aFloat82 * local14.aFloat78 + local14.aFloat77 * local17.aFloat76;
			Static146.aFloat53 = local14.aFloat82 * local17.aFloat74 + local14.aFloat77 * local17.aFloat79 + local17.aFloat78 * local14.aFloat78;
			Static265.aFloat99 = local14.aFloat74 * local17.aFloat78 + local17.aFloat79 * local14.aFloat83 + local17.aFloat74 * local14.aFloat75;
			Static298.aFloat102 = local17.aFloat76 * local14.aFloat80 + local17.aFloat82 * local14.aFloat79 + local17.aFloat75 * local14.aFloat76;
		}
		if (arg1 != null) {
			@Pc(502) boolean local502 = false;
			@Pc(504) boolean local504 = true;
			@Pc(513) int local513 = this.aShort6 + this.aShort7 >> 1;
			@Pc(521) int local521 = this.aShort10 + this.aShort13 >> 1;
			@Pc(540) int local540 = (int) (Static425.aFloat141 * (float) this.aShort14 + Static146.aFloat53 * (float) local513 + Static667.aFloat199 + Static254.aFloat97 * (float) local521);
			@Pc(559) int local559 = (int) (Static298.aFloat102 * (float) local521 + (float) this.aShort14 * Static191.aFloat70 + (float) local513 * Static315.aFloat104 + Static512.aFloat171);
			@Pc(578) int local578 = (int) (Static482.aFloat161 * (float) this.aShort14 + Static265.aFloat99 * (float) local513 + Static329.aFloat105 + Static269.aFloat100 * (float) local521);
			if (this.aClass75_Sub3_4.anInt6548 > local578) {
				local502 = true;
			} else {
				arg1.anInt10340 = this.aClass75_Sub3_4.anInt6542 * local540 / local578 + this.aClass75_Sub3_4.anInt6559;
				arg1.anInt10338 = this.aClass75_Sub3_4.anInt6567 * local559 / local578 + this.aClass75_Sub3_4.anInt6546;
			}
			@Pc(638) int local638 = (int) ((float) local521 * Static254.aFloat97 + Static667.aFloat199 + Static146.aFloat53 * (float) local513 + Static425.aFloat141 * (float) this.aShort12);
			@Pc(657) int local657 = (int) ((float) local521 * Static298.aFloat102 + (float) this.aShort12 * Static191.aFloat70 + Static512.aFloat171 + (float) local513 * Static315.aFloat104);
			@Pc(676) int local676 = (int) (Static482.aFloat161 * (float) this.aShort12 + Static329.aFloat105 + (float) local513 * Static265.aFloat99 + Static269.aFloat100 * (float) local521);
			if (local676 < this.aClass75_Sub3_4.anInt6548) {
				local502 = true;
			} else {
				arg1.anInt10341 = this.aClass75_Sub3_4.anInt6542 * local638 / local676 + this.aClass75_Sub3_4.anInt6559;
				arg1.anInt10342 = this.aClass75_Sub3_4.anInt6567 * local657 / local676 + this.aClass75_Sub3_4.anInt6546;
			}
			if (local502) {
				if (this.aClass75_Sub3_4.anInt6548 > local578 && this.aClass75_Sub3_4.anInt6548 > local676) {
					local504 = false;
				} else {
					@Pc(757) int local757;
					@Pc(768) int local768;
					@Pc(779) int local779;
					if (local578 < this.aClass75_Sub3_4.anInt6548) {
						local757 = (local676 - this.aClass75_Sub3_4.anInt6548 << 16) / (local676 - local578);
						local768 = local638 + ((local638 - local540) * local757 >> 16);
						local779 = local657 + (local757 * (local657 - local559) >> 16);
						arg1.anInt10340 = this.aClass75_Sub3_4.anInt6559 + this.aClass75_Sub3_4.anInt6542 * local768 / this.aClass75_Sub3_4.anInt6548;
						arg1.anInt10338 = local779 * this.aClass75_Sub3_4.anInt6567 / this.aClass75_Sub3_4.anInt6548 + this.aClass75_Sub3_4.anInt6546;
					} else if (this.aClass75_Sub3_4.anInt6548 > local676) {
						local757 = (local578 - this.aClass75_Sub3_4.anInt6548 << 16) / (local578 - local676);
						local768 = (local757 * (local540 - local638) >> 16) + local540;
						local779 = local559 + (local757 * (local559 - local657) >> 16);
						arg1.anInt10340 = this.aClass75_Sub3_4.anInt6559 + local768 * this.aClass75_Sub3_4.anInt6542 / this.aClass75_Sub3_4.anInt6548;
						arg1.anInt10338 = local779 * this.aClass75_Sub3_4.anInt6567 / this.aClass75_Sub3_4.anInt6548 + this.aClass75_Sub3_4.anInt6546;
					}
				}
			}
			if (local504) {
				if (local578 > local676) {
					arg1.anInt10339 = this.aClass75_Sub3_4.anInt6559 + this.aClass75_Sub3_4.anInt6542 * (this.aShort9 + local540) / local578 - arg1.anInt10340;
				} else {
					arg1.anInt10339 = (this.aShort9 + local638) * this.aClass75_Sub3_4.anInt6542 / local676 + this.aClass75_Sub3_4.anInt6559 - arg1.anInt10341;
				}
				arg1.aBoolean765 = true;
			}
		}
		this.aClass75_Sub3_4.method5792();
		this.aClass75_Sub3_4.method5833(local17);
		this.method906();
		this.aClass75_Sub3_4.method5812();
		this.method907();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "()V")
	@Override
	public void method7414() {
		if (this.anInt905 <= 0 || this.anInt861 <= 0) {
			return;
		}
		this.method895(false);
		if ((this.aByte10 & 0x10) == 0 && this.aClass36_1.anInterface4_1 == null) {
			this.method900(false);
		}
		this.method897();
	}

	@OriginalMember(owner = "client!cea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt880; local7++) {
			this.anIntArray66[local7] = -this.anIntArray66[local7];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt905; local31++) {
			this.aShortArray31[local31] = (short) -this.aShortArray31[local31];
		}
		for (@Pc(58) int local58 = 0; local58 < this.anInt897; local58++) {
			@Pc(69) short local69 = this.aShortArray27[local58];
			this.aShortArray27[local58] = this.aShortArray29[local58];
			this.aShortArray29[local58] = local69;
		}
		if (this.aClass332_3 == null && this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
		if (this.aClass332_3 != null) {
			this.aClass332_3.anInterface2_6 = null;
		}
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
		if (this.aClass36_1 != null) {
			this.aClass36_1.anInterface4_1 = null;
		}
		this.aBoolean62 = false;
	}

	@OriginalMember(owner = "client!cea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean59;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt897; local3++) {
			local14 = this.aShortArray24[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			@Pc(30) int local30 = local14 & 0x7F;
			if (arg0 != -1) {
				local20 += (arg0 - local20) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local26 += arg3 * (arg1 - local26) >> 7;
			}
			if (arg2 != -1) {
				local30 -= -((arg2 - local30) * arg3 >> 7);
			}
			this.aShortArray24[local3] = (short) (local30 | local20 << 10 | local26 << 7);
		}
		if (this.aClass360Array1 != null) {
			for (local14 = 0; local14 < this.anInt918; local14++) {
				@Pc(112) Class360 local112 = this.aClass360Array1[local14];
				@Pc(117) Class76 local117 = this.aClass76Array1[local14];
				local117.anInt2034 = Static229.anIntArray228[this.aShortArray24[local112.anInt9776] & 0xFFFF] & 0xFFFFFF | local117.anInt2034 & 0xFF000000;
			}
		}
		if (this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt880; local3++) {
			if (arg0 != 0) {
				this.anIntArray68[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray70[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray66[local3] += arg2;
			}
		}
		this.aBoolean62 = false;
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(ZB)V")
	private void method900(@OriginalArg(0) boolean arg0) {
		if (this.anInt861 * 6 <= this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2.aByteArray20.length) {
			this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2.anInt3174 = 0;
		} else {
			this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2 = new Class6_Sub15_Sub2(this.anInt861 * 6 + 600);
		}
		@Pc(46) Class6_Sub15_Sub2 local46 = this.aClass75_Sub3_4.aClass6_Sub15_Sub2_2;
		@Pc(52) int local52;
		if (this.aClass75_Sub3_4.aBoolean480) {
			for (local52 = 0; local52 < this.anInt861; local52++) {
				local46.method3040(this.aShortArray27[local52]);
				local46.method3040(this.aShortArray32[local52]);
				local46.method3040(this.aShortArray29[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt861; local52++) {
				local46.method3008(this.aShortArray27[local52]);
				local46.method3008(this.aShortArray32[local52]);
				local46.method3008(this.aShortArray29[local52]);
			}
		}
		if (local46.anInt3174 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface4_2 == null) {
				this.anInterface4_2 = this.aClass75_Sub3_4.method5768(local46.anInt3174, true, local46.aByteArray20);
			} else {
				this.anInterface4_2.method5017(local46.anInt3174, local46.aByteArray20);
			}
			this.aClass36_1.anInterface4_1 = this.anInterface4_2;
		} else {
			this.aClass36_1.anInterface4_1 = this.aClass75_Sub3_4.method5768(local46.anInt3174, false, local46.aByteArray20);
		}
		if (!arg0) {
			this.aBoolean61 = true;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIZIILclient!qa;)Z")
	private boolean method901(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class109 arg5) {
		@Pc(8) Class109_Sub2 local8 = (Class109_Sub2) arg5;
		@Pc(12) Class109_Sub2 local12 = this.aClass75_Sub3_4.aClass109_Sub2_3;
		@Pc(33) float local33 = local8.aFloat81 * local12.aFloat77 + local12.aFloat78 * local8.aFloat73 + local12.aFloat82 * local8.aFloat72 + local12.aFloat73;
		@Pc(54) float local54 = local12.aFloat76 * local8.aFloat72 + local8.aFloat73 * local12.aFloat79 + local12.aFloat80 * local8.aFloat81 + local12.aFloat81;
		@Pc(75) float local75 = local12.aFloat83 * local8.aFloat81 + local8.aFloat73 * local12.aFloat74 + local8.aFloat72 * local12.aFloat75 + local12.aFloat72;
		Static425.aFloat141 = local8.aFloat83 * local12.aFloat82 + local12.aFloat78 * local8.aFloat77 + local8.aFloat80 * local12.aFloat77;
		Static482.aFloat161 = local12.aFloat75 * local8.aFloat83 + local12.aFloat74 * local8.aFloat77 + local8.aFloat80 * local12.aFloat83;
		Static315.aFloat104 = local8.aFloat78 * local12.aFloat79 + local8.aFloat79 * local12.aFloat80 + local12.aFloat76 * local8.aFloat74;
		Static254.aFloat97 = local12.aFloat82 * local8.aFloat75 + local8.aFloat82 * local12.aFloat78 + local8.aFloat76 * local12.aFloat77;
		Static298.aFloat102 = local8.aFloat76 * local12.aFloat80 + local12.aFloat79 * local8.aFloat82 + local12.aFloat76 * local8.aFloat75;
		Static269.aFloat100 = local8.aFloat75 * local12.aFloat75 + local12.aFloat83 * local8.aFloat76 + local8.aFloat82 * local12.aFloat74;
		Static146.aFloat53 = local12.aFloat78 * local8.aFloat78 + local12.aFloat77 * local8.aFloat79 + local12.aFloat82 * local8.aFloat74;
		Static191.aFloat70 = local8.aFloat77 * local12.aFloat79 + local8.aFloat80 * local12.aFloat80 + local12.aFloat76 * local8.aFloat83;
		Static265.aFloat99 = local12.aFloat75 * local8.aFloat74 + local8.aFloat78 * local12.aFloat74 + local12.aFloat83 * local8.aFloat79;
		@Pc(239) boolean local239 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass75_Sub3_4.anInt6542;
		@Pc(261) int local261 = this.aClass75_Sub3_4.anInt6567;
		if (!this.aBoolean62) {
			this.method893();
		}
		@Pc(278) int local278 = this.aShort7 - this.aShort6 >> 1;
		@Pc(287) int local287 = this.aShort12 - this.aShort14 >> 1;
		@Pc(296) int local296 = this.aShort10 - this.aShort13 >> 1;
		@Pc(301) int local301 = this.aShort6 + local278;
		@Pc(307) int local307 = this.aShort14 + local287;
		@Pc(312) int local312 = local296 + this.aShort13;
		@Pc(319) int local319 = local301 - (local278 << arg3);
		@Pc(325) int local325 = local307 - (local287 << arg3);
		@Pc(332) int local332 = local312 - (local296 << arg3);
		@Pc(339) int local339 = local301 + (local278 << arg3);
		@Pc(345) int local345 = (local287 << arg3) + local307;
		Static605.anIntArray621[0] = local319;
		@Pc(355) int local355 = (local296 << arg3) + local312;
		Static543.anIntArray583[0] = local325;
		Static605.anIntArray621[1] = local339;
		Static617.anIntArray641[0] = local332;
		Static543.anIntArray583[1] = local325;
		Static605.anIntArray621[2] = local319;
		Static617.anIntArray641[1] = local332;
		Static543.anIntArray583[2] = local345;
		Static605.anIntArray621[3] = local339;
		Static617.anIntArray641[2] = local332;
		Static543.anIntArray583[3] = local345;
		Static617.anIntArray641[3] = local332;
		Static605.anIntArray621[4] = local319;
		Static543.anIntArray583[4] = local325;
		Static605.anIntArray621[5] = local339;
		Static617.anIntArray641[4] = local355;
		Static543.anIntArray583[5] = local325;
		Static617.anIntArray641[5] = local355;
		Static605.anIntArray621[6] = local319;
		Static543.anIntArray583[6] = local345;
		Static605.anIntArray621[7] = local339;
		Static617.anIntArray641[6] = local355;
		Static543.anIntArray583[7] = local345;
		Static617.anIntArray641[7] = local355;
		@Pc(482) float local482;
		@Pc(510) float local510;
		@Pc(496) float local496;
		@Pc(458) float local458;
		@Pc(468) float local468;
		@Pc(463) float local463;
		for (@Pc(449) int local449 = 0; local449 < 8; local449++) {
			local458 = (float) Static605.anIntArray621[local449];
			local463 = (float) Static617.anIntArray641[local449];
			local468 = (float) Static543.anIntArray583[local449];
			local482 = local33 + local463 * Static254.aFloat97 + Static146.aFloat53 * local458 + local468 * Static425.aFloat141;
			local496 = local75 + local468 * Static482.aFloat161 + Static265.aFloat99 * local458 + Static269.aFloat100 * local463;
			local510 = local463 * Static298.aFloat102 + local468 * Static191.aFloat70 + local458 * Static315.aFloat104 + local54;
			if ((float) this.aClass75_Sub3_4.anInt6548 <= local496) {
				if (arg4 > 0) {
					local496 = (float) arg4;
				}
				@Pc(539) float local539 = (float) local257 * local482 / local496 + (float) this.aClass75_Sub3_4.anInt6559;
				if (local539 < local247) {
					local247 = local539;
				}
				@Pc(557) float local557 = local510 * (float) local261 / local496 + (float) this.aClass75_Sub3_4.anInt6546;
				if (local249 < local539) {
					local249 = local539;
				}
				if (local253 < local557) {
					local253 = local557;
				}
				local239 = true;
				if (local557 < local251) {
					local251 = local557;
				}
			}
		}
		if (local239 && local247 < (float) arg1 && local249 > (float) arg1 && (float) arg0 > local251 && local253 > (float) arg0) {
			if (arg2) {
				return true;
			}
			if (this.anInt905 > this.aClass75_Sub3_4.anIntArray371.length) {
				this.aClass75_Sub3_4.anIntArray371 = new int[this.anInt905];
				this.aClass75_Sub3_4.anIntArray372 = new int[this.anInt905];
			}
			@Pc(647) int[] local647 = this.aClass75_Sub3_4.anIntArray371;
			@Pc(651) int[] local651 = this.aClass75_Sub3_4.anIntArray372;
			@Pc(747) int local747;
			for (@Pc(653) int local653 = 0; local653 < this.anInt880; local653++) {
				local458 = (float) this.anIntArray68[local653];
				local463 = (float) this.anIntArray66[local653];
				local468 = (float) this.anIntArray70[local653];
				local496 = local75 + local458 * Static265.aFloat99 + Static482.aFloat161 * local468 + local463 * Static269.aFloat100;
				local510 = local54 + Static315.aFloat104 * local458 + Static191.aFloat70 * local468 + Static298.aFloat102 * local463;
				local482 = local33 + local468 * Static425.aFloat141 + local458 * Static146.aFloat53 + local463 * Static254.aFloat97;
				@Pc(760) int local760;
				@Pc(765) int local765;
				@Pc(772) int local772;
				if ((float) this.aClass75_Sub3_4.anInt6548 <= local496) {
					if (arg4 > 0) {
						local496 = (float) arg4;
					}
					local747 = (int) ((float) local257 * local482 / local496 + (float) this.aClass75_Sub3_4.anInt6559);
					local760 = (int) (local510 * (float) local261 / local496 + (float) this.aClass75_Sub3_4.anInt6546);
					local765 = this.anIntArray69[local653];
					local772 = this.anIntArray69[local653 + 1];
					for (@Pc(774) int local774 = local765; local774 < local772; local774++) {
						@Pc(783) int local783 = this.aShortArray34[local774] - 1;
						if (local783 == -1) {
							break;
						}
						local647[local783] = local747;
						local651[local783] = local760;
					}
				} else {
					local747 = this.anIntArray69[local653];
					local760 = this.anIntArray69[local653 + 1];
					for (local765 = local747; local765 < local760; local765++) {
						local772 = this.aShortArray34[local765] - 1;
						if (local772 == -1) {
							break;
						}
						local647[this.aShortArray34[local765] - 1] = -999999;
					}
				}
			}
			for (local747 = 0; local747 < this.anInt897; local747++) {
				if (local647[this.aShortArray27[local747]] != -999999 && local647[this.aShortArray32[local747]] != -999999 && local647[this.aShortArray29[local747]] != -999999 && this.method896(local651[this.aShortArray27[local747]], arg1, arg0, local647[this.aShortArray27[local747]], local651[this.aShortArray29[local747]], local647[this.aShortArray32[local747]], local651[this.aShortArray32[local747]], local647[this.aShortArray29[local747]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "()[Lclient!iia;")
	@Override
	public Class173[] method7409() {
		return this.aClass173Array1;
	}

	@OriginalMember(owner = "client!cea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static230.anInt4473 = 0;
			local11 = 0;
			Static367.anInt6182 = 0;
			Static644.anInt9970 = 0;
			for (local17 = 0; local17 < this.anInt880; local17++) {
				Static644.anInt9970 += this.anIntArray68[local17];
				Static230.anInt4473 += this.anIntArray70[local17];
				local11++;
				Static367.anInt6182 += this.anIntArray66[local17];
			}
			if (local11 > 0) {
				Static367.anInt6182 = Static367.anInt6182 / local11 + arg3;
				Static644.anInt9970 = arg1 + Static644.anInt9970 / local11;
				Static230.anInt4473 = Static230.anInt4473 / local11 + arg2;
			} else {
				Static230.anInt4473 = arg2;
				Static367.anInt6182 = arg3;
				Static644.anInt9970 = arg1;
			}
		} else if (arg0 == 1) {
			for (local11 = 0; local11 < this.anInt880; local11++) {
				this.anIntArray68[local11] += arg1;
				this.anIntArray70[local11] += arg2;
				this.anIntArray66[local11] += arg3;
			}
		} else {
			@Pc(179) int local179;
			@Pc(197) int local197;
			if (arg0 == 2) {
				for (local11 = 0; local11 < this.anInt880; local11++) {
					this.anIntArray68[local11] -= Static644.anInt9970;
					this.anIntArray70[local11] -= Static230.anInt4473;
					this.anIntArray66[local11] -= Static367.anInt6182;
					if (arg3 != 0) {
						local17 = Class6_Sub2_Sub12.anIntArray293[arg3];
						local179 = Class6_Sub2_Sub12.anIntArray292[arg3];
						local197 = this.anIntArray68[local11] * local179 + local17 * this.anIntArray70[local11] + 16383 >> 14;
						this.anIntArray70[local11] = this.anIntArray70[local11] * local179 + 16383 - this.anIntArray68[local11] * local17 >> 14;
						this.anIntArray68[local11] = local197;
					}
					if (arg1 != 0) {
						local17 = Class6_Sub2_Sub12.anIntArray293[arg1];
						local179 = Class6_Sub2_Sub12.anIntArray292[arg1];
						local197 = local179 * this.anIntArray70[local11] + 16383 - local17 * this.anIntArray66[local11] >> 14;
						this.anIntArray66[local11] = this.anIntArray70[local11] * local17 + this.anIntArray66[local11] * local179 + 16383 >> 14;
						this.anIntArray70[local11] = local197;
					}
					if (arg2 != 0) {
						local17 = Class6_Sub2_Sub12.anIntArray293[arg2];
						local179 = Class6_Sub2_Sub12.anIntArray292[arg2];
						local197 = local179 * this.anIntArray68[local11] + this.anIntArray66[local11] * local17 + 16383 >> 14;
						this.anIntArray66[local11] = local179 * this.anIntArray66[local11] + 16383 - local17 * this.anIntArray68[local11] >> 14;
						this.anIntArray68[local11] = local197;
					}
					this.anIntArray68[local11] += Static644.anInt9970;
					this.anIntArray70[local11] += Static230.anInt4473;
					this.anIntArray66[local11] += Static367.anInt6182;
				}
			} else if (arg0 == 3) {
				for (local11 = 0; local11 < this.anInt880; local11++) {
					this.anIntArray68[local11] -= Static644.anInt9970;
					this.anIntArray70[local11] -= Static230.anInt4473;
					this.anIntArray66[local11] -= Static367.anInt6182;
					this.anIntArray68[local11] = arg1 * this.anIntArray68[local11] / 128;
					this.anIntArray70[local11] = this.anIntArray70[local11] * arg2 / 128;
					this.anIntArray66[local11] = this.anIntArray66[local11] * arg3 / 128;
					this.anIntArray68[local11] += Static644.anInt9970;
					this.anIntArray70[local11] += Static230.anInt4473;
					this.anIntArray66[local11] += Static367.anInt6182;
				}
			} else {
				@Pc(545) Class360 local545;
				@Pc(550) Class76 local550;
				if (arg0 == 5) {
					for (local11 = 0; local11 < this.anInt897; local11++) {
						local17 = (this.aByteArray10[local11] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray10[local11] = (byte) local17;
					}
					if (this.aClass332_2 != null) {
						this.aClass332_2.anInterface2_6 = null;
					}
					if (this.aClass360Array1 != null) {
						for (local17 = 0; local17 < this.anInt918; local17++) {
							local545 = this.aClass360Array1[local17];
							local550 = this.aClass76Array1[local17];
							local550.anInt2034 = 255 - (this.aByteArray10[local545.anInt9776] & 0xFF) << 24 | local550.anInt2034 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local11 = 0; local11 < this.anInt897; local11++) {
						local17 = this.aShortArray24[local11] & 0xFFFF;
						local179 = local17 >> 10 & 0x3F;
						local197 = local17 >> 7 & 0x7;
						local197 += arg2 / 4;
						@Pc(616) int local616 = local17 & 0x7F;
						@Pc(622) int local622 = local179 + arg1 & 0x3F;
						if (local197 < 0) {
							local197 = 0;
						} else if (local197 > 7) {
							local197 = 7;
						}
						local616 += arg3;
						if (local616 < 0) {
							local616 = 0;
						} else if (local616 > 127) {
							local616 = 127;
						}
						this.aShortArray24[local11] = (short) (local197 << 7 | local622 << 10 | local616);
					}
					if (this.aClass332_2 != null) {
						this.aClass332_2.anInterface2_6 = null;
					}
					if (this.aClass360Array1 != null) {
						for (local17 = 0; local17 < this.anInt918; local17++) {
							local545 = this.aClass360Array1[local17];
							local550 = this.aClass76Array1[local17];
							local550.anInt2034 = local550.anInt2034 & 0xFF000000 | Static229.anIntArray228[this.aShortArray24[local545.anInt9776] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(752) Class76 local752;
					if (arg0 == 8) {
						for (local11 = 0; local11 < this.anInt918; local11++) {
							local752 = this.aClass76Array1[local11];
							local752.anInt2030 += arg1;
							local752.anInt2042 += arg2;
						}
					} else if (arg0 == 10) {
						for (local11 = 0; local11 < this.anInt918; local11++) {
							local752 = this.aClass76Array1[local11];
							local752.anInt2037 = arg1 * local752.anInt2037 >> 7;
							local752.anInt2041 = local752.anInt2041 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local11 = 0; local11 < this.anInt918; local11++) {
							local752 = this.aClass76Array1[local11];
							local752.anInt2032 = arg1 + local752.anInt2032 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort8;
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "()Z")
	@Override
	public boolean method7404() {
		if (this.aShortArray25 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray25.length; local13++) {
			if (this.aShortArray25[local13] != -1 && !this.aClass75_Sub3_4.anInterface11_10.method6032(this.aShortArray25[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!rha;IFBIIFIIJ)S")
	private short method902(@OriginalArg(0) Class316 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8) {
		@Pc(10) int local10 = this.anIntArray69[arg1];
		@Pc(17) int local17 = this.anIntArray69[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(41) short local41 = this.aShortArray34[local21];
			if (local41 == 0) {
				local19 = local21;
				break;
			}
			if (arg8 == Static93.aLongArray5[local21]) {
				return (short) (local41 - 1);
			}
		}
		this.aShortArray34[local19] = (short) (this.anInt905 + 1);
		Static93.aLongArray5[local19] = arg8;
		this.aShortArray30[this.anInt905] = (short) arg6;
		this.aShortArray28[this.anInt905] = (short) arg3;
		this.aShortArray31[this.anInt905] = (short) arg4;
		this.aByteArray9[this.anInt905] = (byte) arg7;
		this.aFloatArray3[this.anInt905] = arg5;
		this.aFloatArray4[this.anInt905] = arg2;
		return (short) this.anInt905++;
	}

	@OriginalMember(owner = "client!cea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort8 = (short) arg0;
		if (this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
		if (this.aClass332_3 != null) {
			this.aClass332_3.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BISII)I")
	private int method903(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19 = Static229.anIntArray228[Static420.method6419(arg1, arg3)];
		if (arg2 != -1) {
			@Pc(33) Class297 local33 = this.aClass75_Sub3_4.anInterface11_10.method6027(arg2 & 0xFFFF);
			@Pc(38) int local38 = local33.aByte118 & 0xFF;
			@Pc(49) int local49;
			@Pc(79) int local79;
			if (local38 != 0) {
				if (arg3 < 0) {
					local49 = 0;
				} else if (arg3 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg3 * 131586;
				}
				if (local38 == 256) {
					local19 = local49;
				} else {
					local79 = 256 - local38;
					local19 = (local79 * (local19 & 0xFF00FF) + local38 * (local49 & 0xFF00FF) & 0xFF00FF00) + (local38 * (local49 & 0xFF00) + ((local19 & 0xFF00) * local79) & 0xFF0000) >> 8;
				}
			}
			local49 = local33.aByte123 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(130) int local130 = (local19 >> 16 & 0xFF) * local49;
				if (local130 > 65535) {
					local130 = 65535;
				}
				local79 = local49 * (local19 >> 8 & 0xFF);
				if (local79 > 65535) {
					local79 = 65535;
				}
				@Pc(158) int local158 = local49 * (local19 & 0xFF);
				if (local158 > 65535) {
					local158 = 65535;
				}
				local19 = ((local130 & 0x6100FF00) << 8) + (local79 & 0xFF00) + (local158 >> 8);
			}
		}
		return (local19 << 8) - ((arg0 & 0xFF) - 255);
	}

	@OriginalMember(owner = "client!cea", name = "g", descriptor = "()[Lclient!kw;")
	@Override
	public Class216[] method7408() {
		return this.aClass216Array1;
	}

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort15 = (short) arg0;
		if (this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt880; local3++) {
			if (arg0 != 128) {
				this.anIntArray68[local3] = this.anIntArray68[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray70[local3] = this.anIntArray70[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray66[local3] = this.anIntArray66[local3] * arg2 >> 7;
			}
		}
		this.aBoolean62 = false;
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!sc;)V")
	private void method904(@OriginalArg(1) Class6_Sub2_Sub18_Sub1 arg0) {
		if (this.aClass75_Sub3_4.anIntArray371.length < this.anInt905) {
			this.aClass75_Sub3_4.anIntArray372 = new int[this.anInt905];
			this.aClass75_Sub3_4.anIntArray371 = new int[this.anInt905];
		}
		@Pc(34) int[] local34 = this.aClass75_Sub3_4.anIntArray371;
		@Pc(38) int[] local38 = this.aClass75_Sub3_4.anIntArray372;
		@Pc(69) int local69;
		@Pc(108) int local108;
		@Pc(117) int local117;
		for (@Pc(40) int local40 = 0; local40 < this.anInt880; local40++) {
			local69 = (this.anIntArray68[local40] - (this.anIntArray70[local40] * this.aClass75_Sub3_4.anInt6572 >> 8) >> this.aClass75_Sub3_4.anInt6531) - arg0.anInt8855;
			@Pc(94) int local94 = (this.anIntArray66[local40] - (this.aClass75_Sub3_4.anInt6557 * this.anIntArray70[local40] >> 8) >> this.aClass75_Sub3_4.anInt6531) - arg0.anInt8848;
			@Pc(99) int local99 = this.anIntArray69[local40];
			@Pc(106) int local106 = this.anIntArray69[local40 + 1];
			for (local108 = local99; local108 < local106; local108++) {
				local117 = this.aShortArray34[local108] - 1;
				if (local117 == -1) {
					break;
				}
				local34[local117] = local69;
				local38[local117] = local94;
			}
		}
		if (-60 <= -83) {
			this.wa();
		}
		for (local69 = 0; local69 < this.anInt861; local69++) {
			if (this.aByteArray10 == null || this.aByteArray10[local69] <= 128) {
				@Pc(177) short local177 = this.aShortArray27[local69];
				@Pc(182) short local182 = this.aShortArray32[local69];
				@Pc(187) short local187 = this.aShortArray29[local69];
				local108 = local34[local177];
				local117 = local34[local182];
				@Pc(199) int local199 = local34[local187];
				@Pc(203) int local203 = local38[local177];
				@Pc(207) int local207 = local38[local182];
				@Pc(211) int local211 = local38[local187];
				if (-((local199 - local117) * (local207 + -local203)) + (local108 - local117) * (local207 - local211) > 0) {
					arg0.method7741(local108, local199, local207, local117, local203, local211);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!qa;Lclient!wha;II)V")
	@Override
	public void method7407(@OriginalArg(0) Class109 arg0, @OriginalArg(1) Class60_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt905 == 0) {
			return;
		}
		@Pc(17) Class109_Sub2 local17 = this.aClass75_Sub3_4.aClass109_Sub2_3;
		@Pc(20) Class109_Sub2 local20 = (Class109_Sub2) arg0;
		if (!this.aBoolean62) {
			this.method893();
		}
		Static329.aFloat105 = local17.aFloat72 + local17.aFloat75 * local20.aFloat72 + local20.aFloat81 * local17.aFloat83 + local20.aFloat73 * local17.aFloat74;
		Static482.aFloat161 = local17.aFloat74 * local20.aFloat77 + local20.aFloat80 * local17.aFloat83 + local20.aFloat83 * local17.aFloat75;
		@Pc(75) float local75 = Static329.aFloat105 + Static482.aFloat161 * (float) this.aShort14;
		@Pc(83) float local83 = Static329.aFloat105 + (float) this.aShort12 * Static482.aFloat161;
		@Pc(93) float local93;
		@Pc(99) float local99;
		if (local75 > local83) {
			local93 = local83 - (float) this.aShort9;
			local99 = (float) this.aShort9 + local75;
		} else {
			local93 = local75 - (float) this.aShort9;
			local99 = (float) this.aShort9 + local83;
		}
		if (local93 >= this.aClass75_Sub3_4.aFloat117 || local99 <= (float) this.aClass75_Sub3_4.anInt6548) {
			return;
		}
		Static425.aFloat141 = local17.aFloat78 * local20.aFloat77 + local20.aFloat80 * local17.aFloat77 + local17.aFloat82 * local20.aFloat83;
		Static667.aFloat199 = local20.aFloat81 * local17.aFloat77 + local20.aFloat73 * local17.aFloat78 + local17.aFloat82 * local20.aFloat72 + local17.aFloat73;
		@Pc(177) float local177 = Static667.aFloat199 + Static425.aFloat141 * (float) this.aShort14;
		@Pc(185) float local185 = Static425.aFloat141 * (float) this.aShort12 + Static667.aFloat199;
		@Pc(200) float local200;
		@Pc(211) float local211;
		if (local177 > local185) {
			local200 = (float) this.aClass75_Sub3_4.anInt6542 * (local185 - (float) this.aShort9);
			local211 = (float) this.aClass75_Sub3_4.anInt6542 * (local177 + (float) this.aShort9);
		} else {
			local200 = (float) this.aClass75_Sub3_4.anInt6542 * (local177 - (float) this.aShort9);
			local211 = ((float) this.aShort9 + local185) * (float) this.aClass75_Sub3_4.anInt6542;
		}
		if (this.aClass75_Sub3_4.aFloat124 <= local200 / (float) arg2 || this.aClass75_Sub3_4.aFloat113 >= local211 / (float) arg2) {
			return;
		}
		Static512.aFloat171 = local17.aFloat81 + local17.aFloat76 * local20.aFloat72 + local20.aFloat81 * local17.aFloat80 + local17.aFloat79 * local20.aFloat73;
		Static191.aFloat70 = local17.aFloat76 * local20.aFloat83 + local17.aFloat80 * local20.aFloat80 + local17.aFloat79 * local20.aFloat77;
		@Pc(304) float local304 = Static191.aFloat70 * (float) this.aShort14 + Static512.aFloat171;
		@Pc(312) float local312 = (float) this.aShort12 * Static191.aFloat70 + Static512.aFloat171;
		@Pc(338) float local338;
		@Pc(327) float local327;
		if (local312 < local304) {
			local327 = ((float) this.aShort9 + local304) * (float) this.aClass75_Sub3_4.anInt6567;
			local338 = (local312 - (float) this.aShort9) * (float) this.aClass75_Sub3_4.anInt6567;
		} else {
			local338 = ((float) -this.aShort9 + local304) * (float) this.aClass75_Sub3_4.anInt6567;
			local327 = (float) this.aClass75_Sub3_4.anInt6567 * (local312 + (float) this.aShort9);
		}
		if (local338 / (float) arg2 >= this.aClass75_Sub3_4.aFloat126 || local327 / (float) arg2 <= this.aClass75_Sub3_4.aFloat127) {
			return;
		}
		if (arg1 != null || this.aClass360Array1 != null) {
			Static298.aFloat102 = local17.aFloat79 * local20.aFloat82 + local17.aFloat80 * local20.aFloat76 + local20.aFloat75 * local17.aFloat76;
			Static146.aFloat53 = local17.aFloat82 * local20.aFloat74 + local20.aFloat78 * local17.aFloat78 + local20.aFloat79 * local17.aFloat77;
			Static265.aFloat99 = local17.aFloat83 * local20.aFloat79 + local17.aFloat74 * local20.aFloat78 + local17.aFloat75 * local20.aFloat74;
			Static269.aFloat100 = local20.aFloat76 * local17.aFloat83 + local20.aFloat82 * local17.aFloat74 + local17.aFloat75 * local20.aFloat75;
			Static315.aFloat104 = local20.aFloat78 * local17.aFloat79 + local17.aFloat80 * local20.aFloat79 + local17.aFloat76 * local20.aFloat74;
			Static254.aFloat97 = local17.aFloat78 * local20.aFloat82 + local17.aFloat77 * local20.aFloat76 + local17.aFloat82 * local20.aFloat75;
		}
		if (arg1 != null) {
			@Pc(512) int local512 = this.aShort6 + this.aShort7 >> 1;
			@Pc(520) int local520 = this.aShort10 + this.aShort13 >> 1;
			@Pc(539) int local539 = (int) (Static254.aFloat97 * (float) local520 + (float) this.aShort14 * Static425.aFloat141 + (float) local512 * Static146.aFloat53 + Static667.aFloat199);
			@Pc(558) int local558 = (int) ((float) local520 * Static298.aFloat102 + (float) this.aShort14 * Static191.aFloat70 + Static315.aFloat104 * (float) local512 + Static512.aFloat171);
			@Pc(577) int local577 = (int) ((float) this.aShort14 * Static482.aFloat161 + (float) local512 * Static265.aFloat99 + Static329.aFloat105 + (float) local520 * Static269.aFloat100);
			@Pc(596) int local596 = (int) ((float) this.aShort12 * Static425.aFloat141 + Static667.aFloat199 + Static146.aFloat53 * (float) local512 + (float) local520 * Static254.aFloat97);
			@Pc(615) int local615 = (int) (Static315.aFloat104 * (float) local512 + Static512.aFloat171 + Static191.aFloat70 * (float) this.aShort12 + (float) local520 * Static298.aFloat102);
			arg1.anInt10342 = this.aClass75_Sub3_4.anInt6546 + local615 * this.aClass75_Sub3_4.anInt6567 / arg2;
			@Pc(648) int local648 = (int) (Static329.aFloat105 + Static265.aFloat99 * (float) local512 + (float) this.aShort12 * Static482.aFloat161 + (float) local520 * Static269.aFloat100);
			arg1.anInt10341 = this.aClass75_Sub3_4.anInt6542 * local596 / arg2 + this.aClass75_Sub3_4.anInt6559;
			arg1.anInt10340 = this.aClass75_Sub3_4.anInt6559 + local539 * this.aClass75_Sub3_4.anInt6542 / arg2;
			arg1.anInt10338 = this.aClass75_Sub3_4.anInt6546 + this.aClass75_Sub3_4.anInt6567 * local558 / arg2;
			if (this.aClass75_Sub3_4.anInt6548 <= local577 || this.aClass75_Sub3_4.anInt6548 <= local648) {
				arg1.aBoolean765 = true;
				arg1.anInt10339 = (this.aShort9 + local539) * this.aClass75_Sub3_4.anInt6542 / arg2 + this.aClass75_Sub3_4.anInt6559 - arg1.anInt10340;
			}
		}
		this.aClass75_Sub3_4.method5808((float) arg2);
		this.aClass75_Sub3_4.method5842();
		this.aClass75_Sub3_4.method5833(local20);
		this.method906();
		this.aClass75_Sub3_4.method5812();
		this.method907();
	}

	@OriginalMember(owner = "client!cea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean60;
	}

	@OriginalMember(owner = "client!cea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub2_Sub12.anIntArray293[arg0];
		@Pc(13) int local13 = Class6_Sub2_Sub12.anIntArray292[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt880; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray70[local15] + this.anIntArray68[local15] * local13 >> 14;
			this.anIntArray70[local15] = local13 * this.anIntArray70[local15] - this.anIntArray68[local15] * local9 >> 14;
			this.anIntArray68[local15] = local34;
		}
		this.aBoolean62 = false;
		if (this.aClass332_4 != null) {
			this.aClass332_4.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray5 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt867; local13++) {
			this.anIntArray68[local13] <<= 0x4;
			this.anIntArray70[local13] <<= 0x4;
			this.anIntArray66[local13] <<= 0x4;
		}
		Static367.anInt6182 = 0;
		Static230.anInt4473 = 0;
		Static644.anInt9970 = 0;
		return true;
	}

	@OriginalMember(owner = "client!cea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(58) int local58;
		@Pc(40) int local40;
		@Pc(52) int local52;
		@Pc(50) int[] local50;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static644.anInt9970 = 0;
			Static367.anInt6182 = 0;
			local28 = 0;
			Static230.anInt4473 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local40 = arg1[local32];
				if (local40 < this.anIntArrayArray5.length) {
					local50 = this.anIntArrayArray5[local40];
					for (local52 = 0; local52 < local50.length; local52++) {
						local58 = local50[local52];
						if (this.aShortArray33 == null || (this.aShortArray33[local58] & arg6) != 0) {
							Static644.anInt9970 += this.anIntArray68[local58];
							Static230.anInt4473 += this.anIntArray70[local58];
							Static367.anInt6182 += this.anIntArray66[local58];
							local28++;
						}
					}
				}
			}
			if (local28 > 0) {
				Static84.aBoolean111 = true;
				Static230.anInt4473 = Static230.anInt4473 / local28 + arg3;
				Static367.anInt6182 = arg4 + Static367.anInt6182 / local28;
				Static644.anInt9970 = Static644.anInt9970 / local28 + arg2;
			} else {
				Static367.anInt6182 = arg4;
				Static644.anInt9970 = arg2;
				Static230.anInt4473 = arg3;
			}
			return;
		}
		@Pc(254) int[] local254;
		@Pc(256) int local256;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg3 * arg7[1] + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg7[4] * arg3 + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local40 = arg7[7] * arg3 + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local32;
				arg2 = local28;
				arg4 = local40;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray5.length) {
					local254 = this.anIntArrayArray5[local32];
					for (local256 = 0; local256 < local254.length; local256++) {
						local52 = local254[local256];
						if (this.aShortArray33 == null || (this.aShortArray33[local52] & arg6) != 0) {
							this.anIntArray68[local52] += arg2;
							this.anIntArray70[local52] += arg3;
							this.anIntArray66[local52] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(389) int local389;
		@Pc(411) int local411;
		@Pc(437) int local437;
		@Pc(468) int local468;
		@Pc(472) int local472;
		@Pc(476) int local476;
		@Pc(480) int local480;
		@Pc(488) int local488;
		@Pc(496) int local496;
		@Pc(650) int local650;
		@Pc(675) int local675;
		@Pc(680) int local680;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(697) int local697;
		@Pc(701) int local701;
		@Pc(703) int local703;
		@Pc(840) int[] local840;
		@Pc(842) int local842;
		@Pc(848) int local848;
		@Pc(852) int local852;
		@Pc(854) int local854;
		@Pc(994) int local994;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray5.length > local32) {
						local254 = this.anIntArrayArray5[local32];
						for (local256 = 0; local256 < local254.length; local256++) {
							local52 = local254[local256];
							if (this.aShortArray33 == null || (this.aShortArray33[local52] & arg6) != 0) {
								this.anIntArray68[local52] -= Static644.anInt9970;
								this.anIntArray70[local52] -= Static230.anInt4473;
								this.anIntArray66[local52] -= Static367.anInt6182;
								if (arg4 != 0) {
									local58 = Class6_Sub2_Sub12.anIntArray293[arg4];
									local389 = Class6_Sub2_Sub12.anIntArray292[arg4];
									local411 = local389 * this.anIntArray68[local52] + local58 * this.anIntArray70[local52] + 16383 >> 14;
									this.anIntArray70[local52] = this.anIntArray70[local52] * local389 + 16383 - local58 * this.anIntArray68[local52] >> 14;
									this.anIntArray68[local52] = local411;
								}
								if (arg2 != 0) {
									local58 = Class6_Sub2_Sub12.anIntArray293[arg2];
									local389 = Class6_Sub2_Sub12.anIntArray292[arg2];
									local411 = this.anIntArray70[local52] * local389 + 16383 - this.anIntArray66[local52] * local58 >> 14;
									this.anIntArray66[local52] = local389 * this.anIntArray66[local52] + this.anIntArray70[local52] * local58 + 16383 >> 14;
									this.anIntArray70[local52] = local411;
								}
								if (arg3 != 0) {
									local58 = Class6_Sub2_Sub12.anIntArray293[arg3];
									local389 = Class6_Sub2_Sub12.anIntArray292[arg3];
									local411 = this.anIntArray68[local52] * local389 + this.anIntArray66[local52] * local58 + 16383 >> 14;
									this.anIntArray66[local52] = local389 * this.anIntArray66[local52] + 16383 - this.anIntArray68[local52] * local58 >> 14;
									this.anIntArray68[local52] = local411;
								}
								this.anIntArray68[local52] += Static644.anInt9970;
								this.anIntArray70[local52] += Static230.anInt4473;
								this.anIntArray66[local52] += Static367.anInt6182;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local40 = arg1[local32];
						if (local40 < this.anIntArrayArray5.length) {
							local50 = this.anIntArrayArray5[local40];
							for (local52 = 0; local52 < local50.length; local52++) {
								local58 = local50[local52];
								if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local58]) != 0) {
									local389 = this.anIntArray69[local58];
									local411 = this.anIntArray69[local58 + 1];
									for (local437 = local389; local437 < local411; local437++) {
										local468 = this.aShortArray34[local437] - 1;
										if (local468 == -1) {
											break;
										}
										if (arg4 != 0) {
											local472 = Class6_Sub2_Sub12.anIntArray293[arg4];
											local476 = Class6_Sub2_Sub12.anIntArray292[arg4];
											local480 = this.aShortArray28[local468] * local472 + local476 * this.aShortArray30[local468] + 16383 >> 14;
											this.aShortArray28[local468] = (short) (local476 * this.aShortArray28[local468] + 16383 - local472 * this.aShortArray30[local468] >> 14);
											this.aShortArray30[local468] = (short) local480;
										}
										if (arg2 != 0) {
											local472 = Class6_Sub2_Sub12.anIntArray293[arg2];
											local476 = Class6_Sub2_Sub12.anIntArray292[arg2];
											local480 = local476 * this.aShortArray28[local468] + 16383 - local472 * this.aShortArray31[local468] >> 14;
											this.aShortArray31[local468] = (short) (local476 * this.aShortArray31[local468] + this.aShortArray28[local468] * local472 + 16383 >> 14);
											this.aShortArray28[local468] = (short) local480;
										}
										if (arg3 != 0) {
											local472 = Class6_Sub2_Sub12.anIntArray293[arg3];
											local476 = Class6_Sub2_Sub12.anIntArray292[arg3];
											local480 = local472 * this.aShortArray31[local468] + local476 * this.aShortArray30[local468] + 16383 >> 14;
											this.aShortArray31[local468] = (short) (this.aShortArray31[local468] * local476 + 16383 - local472 * this.aShortArray30[local468] >> 14);
											this.aShortArray30[local468] = (short) local480;
										}
									}
								}
							}
						}
					}
					if (this.aClass332_3 == null && this.aClass332_2 != null) {
						this.aClass332_2.anInterface2_6 = null;
					}
					if (this.aClass332_3 != null) {
						this.aClass332_3.anInterface2_6 = null;
					}
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local40 = arg7[11] << 4;
				local256 = arg7[12] << 4;
				local52 = arg7[13] << 4;
				local58 = arg7[14] << 4;
				if (Static84.aBoolean111) {
					local389 = Static367.anInt6182 * arg7[6] + Static644.anInt9970 * arg7[0] + Static230.anInt4473 * arg7[3] + 8192 >> 14;
					local411 = arg7[1] * Static644.anInt9970 + Static230.anInt4473 * arg7[4] + Static367.anInt6182 * arg7[7] + 8192 >> 14;
					local389 += local256;
					local437 = Static367.anInt6182 * arg7[8] + arg7[5] * Static230.anInt4473 + Static644.anInt9970 * arg7[2] + 8192 >> 14;
					local411 += local52;
					Static644.anInt9970 = local389;
					Static230.anInt4473 = local411;
					local437 += local58;
					Static367.anInt6182 = local437;
					Static84.aBoolean111 = false;
				}
				@Pc(456) int[] local456 = new int[9];
				local411 = Class6_Sub2_Sub12.anIntArray292[arg2];
				local437 = Class6_Sub2_Sub12.anIntArray293[arg2];
				local468 = Class6_Sub2_Sub12.anIntArray292[arg3];
				local472 = Class6_Sub2_Sub12.anIntArray293[arg3];
				local476 = Class6_Sub2_Sub12.anIntArray292[arg4];
				local480 = Class6_Sub2_Sub12.anIntArray293[arg4];
				local488 = local476 * local437 + 8192 >> 14;
				local496 = local480 * local437 + 8192 >> 14;
				local456[8] = local411 * local468 + 8192 >> 14;
				local456[5] = -local437;
				local456[0] = local496 * local472 + local468 * local476 + 8192 >> 14;
				local456[7] = local468 * local488 + local472 * local480 + 8192 >> 14;
				local456[1] = -local468 * local480 + local472 * local488 + 8192 >> 14;
				local456[4] = local411 * local476 + 8192 >> 14;
				local456[6] = local468 * local496 + -local472 * local476 + 8192 >> 14;
				local456[2] = local411 * local472 + 8192 >> 14;
				local456[3] = local480 * local411 + 8192 >> 14;
				@Pc(624) int local624 = local456[2] * -Static367.anInt6182 + -Static644.anInt9970 * local456[0] + local456[1] * -Static230.anInt4473 + 8192 >> 14;
				local650 = local456[3] * -Static644.anInt9970 + local456[4] * -Static230.anInt4473 + local456[5] * -Static367.anInt6182 + 8192 >> 14;
				local675 = local456[8] * -Static367.anInt6182 + local456[7] * -Static230.anInt4473 + local456[6] * -Static644.anInt9970 + 8192 >> 14;
				local680 = local624 + Static644.anInt9970;
				@Pc(684) int local684 = Static230.anInt4473 + local650;
				local688 = Static367.anInt6182 + local675;
				@Pc(691) int[] local691 = new int[9];
				for (local693 = 0; local693 < 3; local693++) {
					for (local697 = 0; local697 < 3; local697++) {
						local701 = 0;
						for (local703 = 0; local703 < 3; local703++) {
							local701 += arg7[local697 * 3 + local703] * local456[local693 * 3 + local703];
						}
						local691[local697 + local693 * 3] = local701 + 8192 >> 14;
					}
				}
				local697 = local456[1] * local52 + local256 * local456[0] + local58 * local456[2] + 8192 >> 14;
				local701 = local58 * local456[5] + local52 * local456[4] + local256 * local456[3] + 8192 >> 14;
				local701 += local684;
				local703 = local58 * local456[8] + local256 * local456[6] + local52 * local456[7] + 8192 >> 14;
				local697 += local680;
				local703 += local688;
				local840 = new int[9];
				for (local842 = 0; local842 < 3; local842++) {
					for (local848 = 0; local848 < 3; local848++) {
						local852 = 0;
						for (local854 = 0; local854 < 3; local854++) {
							local852 += arg7[local842 * 3 + local854] * local691[local848 + local854 * 3];
						}
						local840[local842 * 3 + local848] = local852 + 8192 >> 14;
					}
				}
				local848 = local703 * arg7[2] + local697 * arg7[0] + arg7[1] * local701 + 8192 >> 14;
				local852 = local703 * arg7[5] + arg7[3] * local697 + local701 * arg7[4] + 8192 >> 14;
				local854 = arg7[6] * local697 + local701 * arg7[7] + arg7[8] * local703 + 8192 >> 14;
				local848 += local28;
				local852 += local32;
				local854 += local40;
				for (local994 = 0; local994 < local8; local994++) {
					@Pc(1002) int local1002 = arg1[local994];
					if (this.anIntArrayArray5.length > local1002) {
						@Pc(1016) int[] local1016 = this.anIntArrayArray5[local1002];
						for (@Pc(1018) int local1018 = 0; local1018 < local1016.length; local1018++) {
							@Pc(1024) int local1024 = local1016[local1018];
							if (this.aShortArray33 == null || (this.aShortArray33[local1024] & arg6) != 0) {
								@Pc(1068) int local1068 = local840[0] * this.anIntArray68[local1024] + local840[1] * this.anIntArray70[local1024] + this.anIntArray66[local1024] * local840[2] + 8192 >> 14;
								@Pc(1099) int local1099 = this.anIntArray66[local1024] * local840[5] + this.anIntArray70[local1024] * local840[4] + this.anIntArray68[local1024] * local840[3] + 8192 >> 14;
								@Pc(1103) int local1103 = local1068 + local848;
								@Pc(1107) int local1107 = local1099 + local852;
								@Pc(1138) int local1138 = local840[8] * this.anIntArray66[local1024] + local840[6] * this.anIntArray68[local1024] + this.anIntArray70[local1024] * local840[7] + 8192 >> 14;
								this.anIntArray68[local1024] = local1103;
								@Pc(1147) int local1147 = local1138 + local854;
								this.anIntArray70[local1024] = local1107;
								this.anIntArray66[local1024] = local1147;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2682) Class360 local2682;
			@Pc(2687) Class76 local2687;
			if (arg0 == 5) {
				if (this.anIntArrayArray6 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray6.length > local32) {
							local254 = this.anIntArrayArray6[local32];
							for (local256 = 0; local256 < local254.length; local256++) {
								local52 = local254[local256];
								if (this.aShortArray26 == null || (arg6 & this.aShortArray26[local52]) != 0) {
									local58 = (this.aByteArray10[local52] & 0xFF) + arg2 * 8;
									if (local58 < 0) {
										local58 = 0;
									} else if (local58 > 255) {
										local58 = 255;
									}
									this.aByteArray10[local52] = (byte) local58;
									if (this.aClass332_2 != null) {
										this.aClass332_2.anInterface2_6 = null;
									}
								}
							}
						}
					}
					if (this.aClass360Array1 != null) {
						for (local32 = 0; local32 < this.anInt918; local32++) {
							local2682 = this.aClass360Array1[local32];
							local2687 = this.aClass76Array1[local32];
							local2687.anInt2034 = 255 - (this.aByteArray10[local2682.anInt9776] & 0xFF) << 24 | local2687.anInt2034 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2951) Class76 local2951;
				if (arg0 == 8) {
					if (this.anIntArrayArray7 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray7.length > local32) {
								local254 = this.anIntArrayArray7[local32];
								for (local256 = 0; local256 < local254.length; local256++) {
									local2951 = this.aClass76Array1[local254[local256]];
									local2951.anInt2030 += arg2;
									local2951.anInt2042 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray7 != null) {
						for (local28 = 0; local28 < local8; local28++) {
							local32 = arg1[local28];
							if (this.anIntArrayArray7.length > local32) {
								local254 = this.anIntArrayArray7[local32];
								for (local256 = 0; local256 < local254.length; local256++) {
									local2951 = this.aClass76Array1[local254[local256]];
									local2951.anInt2037 = arg2 * local2951.anInt2037 >> 7;
									local2951.anInt2041 = local2951.anInt2041 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray7 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray7.length > local32) {
							local254 = this.anIntArrayArray7[local32];
							for (local256 = 0; local256 < local254.length; local256++) {
								local2951 = this.aClass76Array1[local254[local256]];
								local2951.anInt2032 = arg2 + local2951.anInt2032 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray6 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray6.length) {
						local254 = this.anIntArrayArray6[local32];
						for (local256 = 0; local256 < local254.length; local256++) {
							local52 = local254[local256];
							if (this.aShortArray26 == null || (this.aShortArray26[local52] & arg6) != 0) {
								local58 = this.aShortArray24[local52] & 0xFFFF;
								local389 = local58 >> 10 & 0x3F;
								local411 = local58 >> 7 & 0x7;
								@Pc(2791) int local2791 = local389 + arg2 & 0x3F;
								local437 = local58 & 0x7F;
								local411 += arg3 / 4;
								if (local411 < 0) {
									local411 = 0;
								} else if (local411 > 7) {
									local411 = 7;
								}
								local437 += arg4;
								if (local437 < 0) {
									local437 = 0;
								} else if (local437 > 127) {
									local437 = 127;
								}
								this.aShortArray24[local52] = (short) (local437 | local411 << 7 | local2791 << 10);
								if (this.aClass332_2 != null) {
									this.aClass332_2.anInterface2_6 = null;
								}
							}
						}
					}
				}
				if (this.aClass360Array1 != null) {
					for (local32 = 0; local32 < this.anInt918; local32++) {
						local2682 = this.aClass360Array1[local32];
						local2687 = this.aClass76Array1[local32];
						local2687.anInt2034 = Static229.anIntArray228[this.aShortArray24[local2682.anInt9776] & 0xFFFF] & 0xFFFFFF | local2687.anInt2034 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray5.length > local32) {
					local254 = this.anIntArrayArray5[local32];
					for (local256 = 0; local256 < local254.length; local256++) {
						local52 = local254[local256];
						if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local52]) != 0) {
							this.anIntArray68[local52] -= Static644.anInt9970;
							this.anIntArray70[local52] -= Static230.anInt4473;
							this.anIntArray66[local52] -= Static367.anInt6182;
							this.anIntArray68[local52] = this.anIntArray68[local52] * arg2 >> 7;
							this.anIntArray70[local52] = this.anIntArray70[local52] * arg3 >> 7;
							this.anIntArray66[local52] = this.anIntArray66[local52] * arg4 >> 7;
							this.anIntArray68[local52] += Static644.anInt9970;
							this.anIntArray70[local52] += Static230.anInt4473;
							this.anIntArray66[local52] += Static367.anInt6182;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local40 = arg7[11] << 4;
			local256 = arg7[12] << 4;
			local52 = arg7[13] << 4;
			local58 = arg7[14] << 4;
			if (Static84.aBoolean111) {
				local389 = arg7[3] * Static230.anInt4473 + Static644.anInt9970 * arg7[0] + Static367.anInt6182 * arg7[6] + 8192 >> 14;
				local411 = arg7[1] * Static644.anInt9970 + Static230.anInt4473 * arg7[4] + arg7[7] * Static367.anInt6182 + 8192 >> 14;
				local389 += local256;
				local411 += local52;
				local437 = arg7[2] * Static644.anInt9970 + Static230.anInt4473 * arg7[5] + Static367.anInt6182 * arg7[8] + 8192 >> 14;
				Static644.anInt9970 = local389;
				Static230.anInt4473 = local411;
				local437 += local58;
				Static367.anInt6182 = local437;
				Static84.aBoolean111 = false;
			}
			local389 = arg2 << 15 >> 7;
			local411 = arg3 << 15 >> 7;
			local437 = arg4 << 15 >> 7;
			local468 = -Static644.anInt9970 * local389 + 8192 >> 14;
			local472 = local411 * -Static230.anInt4473 + 8192 >> 14;
			local476 = -Static367.anInt6182 * local437 + 8192 >> 14;
			local480 = Static644.anInt9970 + local468;
			local488 = Static230.anInt4473 + local472;
			local496 = local476 + Static367.anInt6182;
			@Pc(1955) int[] local1955 = new int[] { arg7[0] * local389 + 8192 >> 14, arg7[3] * local389 + 8192 >> 14, local389 * arg7[6] + 8192 >> 14, local411 * arg7[1] + 8192 >> 14, local411 * arg7[4] + 8192 >> 14, arg7[7] * local411 + 8192 >> 14, local437 * arg7[2] + 8192 >> 14, arg7[5] * local437 + 8192 >> 14, local437 * arg7[8] + 8192 >> 14 };
			local650 = local256 * local389 + 8192 >> 14;
			local675 = local411 * local52 + 8192 >> 14;
			@Pc(2083) int local2083 = local675 + local488;
			@Pc(2087) int local2087 = local650 + local480;
			local680 = local437 * local58 + 8192 >> 14;
			@Pc(2099) int local2099 = local680 + local496;
			@Pc(2102) int[] local2102 = new int[9];
			@Pc(2108) int local2108;
			for (local688 = 0; local688 < 3; local688++) {
				for (local2108 = 0; local2108 < 3; local2108++) {
					local693 = 0;
					for (local697 = 0; local697 < 3; local697++) {
						local693 += arg7[local697 + local688 * 3] * local1955[local2108 + local697 * 3];
					}
					local2102[local2108 + local688 * 3] = local693 + 8192 >> 14;
				}
			}
			local2108 = arg7[0] * local2087 + arg7[1] * local2083 + local2099 * arg7[2] + 8192 >> 14;
			local693 = arg7[3] * local2087 + arg7[4] * local2083 + local2099 * arg7[5] + 8192 >> 14;
			local2108 += local28;
			local693 += local32;
			local697 = arg7[8] * local2099 + local2087 * arg7[6] + local2083 * arg7[7] + 8192 >> 14;
			local697 += local40;
			for (local701 = 0; local701 < local8; local701++) {
				local703 = arg1[local701];
				if (this.anIntArrayArray5.length > local703) {
					local840 = this.anIntArrayArray5[local703];
					for (local842 = 0; local842 < local840.length; local842++) {
						local848 = local840[local842];
						if (this.aShortArray33 == null || (arg6 & this.aShortArray33[local848]) != 0) {
							local852 = local2102[2] * this.anIntArray66[local848] + local2102[0] * this.anIntArray68[local848] + this.anIntArray70[local848] * local2102[1] + 8192 >> 14;
							local854 = this.anIntArray66[local848] * local2102[5] + this.anIntArray70[local848] * local2102[4] + this.anIntArray68[local848] * local2102[3] + 8192 >> 14;
							@Pc(2359) int local2359 = local854 + local693;
							@Pc(2363) int local2363 = local852 + local2108;
							local994 = local2102[6] * this.anIntArray68[local848] + this.anIntArray70[local848] * local2102[7] + this.anIntArray66[local848] * local2102[8] + 8192 >> 14;
							@Pc(2400) int local2400 = local994 + local697;
							this.anIntArray68[local848] = local2363;
							this.anIntArray70[local848] = local2359;
							this.anIntArray66[local848] = local2400;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "(I)V")
	private void method906() {
		if (this.anInt861 == 0) {
			return;
		}
		if (this.aByte10 != 0) {
			this.method895(true);
		}
		this.method895(false);
		if (this.aClass36_1 != null) {
			if (this.aClass36_1.anInterface4_1 == null) {
				this.method900((this.aByte10 & 0x10) != 0);
			}
			if (this.aClass36_1.anInterface4_1 != null) {
				this.aClass75_Sub3_4.method5840(this.aClass332_3 != null);
				this.aClass75_Sub3_4.method5809(this.aClass332_2, this.aClass332_1, this.aClass332_3, this.aClass332_4);
				@Pc(87) int local87 = this.anIntArray71.length - 1;
				for (@Pc(89) int local89 = 0; local89 < local87; local89++) {
					@Pc(96) int local96 = this.anIntArray71[local89];
					@Pc(103) int local103 = this.anIntArray71[local89 + 1];
					@Pc(110) int local110 = this.aShortArray25[local96] & 0xFFFF;
					if (local110 == 65535) {
						local110 = -1;
					}
					this.aClass75_Sub3_4.method5841(this.aClass332_3 != null, local110);
					this.aClass75_Sub3_4.method5803(local96 * 3, (local103 - local96) * 3, this.aClass36_1.anInterface4_1);
				}
			}
		}
		this.method897();
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B[B)V")
	@Override
	public void method7424(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		@Pc(5) int local5;
		if (arg1 == null) {
			for (local5 = 0; local5 < this.anInt897; local5++) {
				this.aByteArray10[local5] = arg0;
			}
		} else {
			for (local5 = 0; local5 < this.anInt897; local5++) {
				@Pc(51) int local51 = 255 - (255 - (arg1[local5] & 0xFF)) * (255 - (arg0 & 0xFF)) / 255;
				this.aByteArray10[local5] = (byte) local51;
			}
		}
		Static69.anInt872++;
		if (this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
		}
	}

	@OriginalMember(owner = "client!cea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean62) {
			this.method893();
		}
		return this.aShort12;
	}

	@OriginalMember(owner = "client!cea", name = "d", descriptor = "(B)V")
	private void method907() {
		if (this.aClass360Array1 == null) {
			return;
		}
		@Pc(16) Class109_Sub2 local16 = this.aClass75_Sub3_4.aClass109_Sub2_2;
		this.aClass75_Sub3_4.method5795();
		this.aClass75_Sub3_4.C(!this.aBoolean59);
		this.aClass75_Sub3_4.method5840(false);
		this.aClass75_Sub3_4.method5809((Class332) null, this.aClass75_Sub3_4.aClass332_8, (Class332) null, this.aClass75_Sub3_4.aClass332_9);
		for (@Pc(49) int local49 = 0; local49 < this.anInt918; local49++) {
			@Pc(58) Class360 local58 = this.aClass360Array1[local49];
			@Pc(63) Class76 local63 = this.aClass76Array1[local49];
			if (!local58.aBoolean720 || !this.aClass75_Sub3_4.method6705()) {
				@Pc(93) float local93 = (float) (this.anIntArray68[local58.anInt9778] + this.anIntArray68[local58.anInt9772] + this.anIntArray68[local58.anInt9774]) * 0.3333333F;
				@Pc(115) float local115 = (float) (this.anIntArray70[local58.anInt9774] + this.anIntArray70[local58.anInt9772] + this.anIntArray70[local58.anInt9778]) * 0.3333333F;
				@Pc(137) float local137 = (float) (this.anIntArray66[local58.anInt9774] + this.anIntArray66[local58.anInt9772] + this.anIntArray66[local58.anInt9778]) * 0.3333333F;
				@Pc(151) float local151 = Static667.aFloat199 + local115 * Static425.aFloat141 + local93 * Static146.aFloat53 + local137 * Static254.aFloat97;
				@Pc(165) float local165 = Static512.aFloat171 + local137 * Static298.aFloat102 + local93 * Static315.aFloat104 + local115 * Static191.aFloat70;
				@Pc(179) float local179 = Static329.aFloat105 + Static269.aFloat100 * local137 + Static265.aFloat99 * local93 + local115 * Static482.aFloat161;
				@Pc(200) float local200 = (float) (1.0D / Math.sqrt((double) (local151 * local151 + local165 * local165 + local179 * local179))) * (float) local58.anInt9775;
				local16.method3698(local58.aShort128 * local63.anInt2041 >> 7, local63.anInt2032, (float) local63.anInt2042 + local200 * local165 - local165, local179 * local200 + -local179, local63.anInt2037 * local58.aShort129 >> 7, local151 + (float) local63.anInt2030 - local200 * local151);
				this.aClass75_Sub3_4.method5800(local16);
				@Pc(253) int local253 = local63.anInt2034;
				OpenGL.glColor4ub((byte) (local253 >> 16), (byte) (local253 >> 8), (byte) local253, (byte) (local253 >> 24));
				this.aClass75_Sub3_4.method5781(local58.aShort127);
				this.aClass75_Sub3_4.method5826(local58.aByte142);
				this.aClass75_Sub3_4.method5779(4);
			}
		}
		this.aClass75_Sub3_4.C(true);
		this.aClass75_Sub3_4.method5812();
	}

	@OriginalMember(owner = "client!cea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface11 local9 = this.aClass75_Sub3_4.anInterface11_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt897; local11++) {
			if (arg0 == this.aShortArray25[local11]) {
				this.aShortArray25[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(54) Class297 local54 = local9.method6027(arg0 & 0xFFFF);
			local41 = local54.aByte123;
			local39 = local54.aByte118;
		}
		@Pc(62) byte local62 = 0;
		@Pc(64) byte local64 = 0;
		if (arg1 != -1) {
			@Pc(75) Class297 local75 = local9.method6027(arg1 & 0xFFFF);
			if (local75.aByte121 != 0 || local75.aByte119 != 0) {
				this.aBoolean60 = true;
			}
			local62 = local75.aByte118;
			local64 = local75.aByte123;
		}
		if (!(local62 != local39 | local64 != local41)) {
			return;
		}
		if (this.aClass360Array1 != null) {
			for (@Pc(124) int local124 = 0; local124 < this.anInt918; local124++) {
				@Pc(131) Class360 local131 = this.aClass360Array1[local124];
				@Pc(136) Class76 local136 = this.aClass76Array1[local124];
				local136.anInt2034 = Static229.anIntArray228[this.aShortArray24[local131.anInt9776] & 0xFFFF] & 0xFFFFFF | local136.anInt2034 & 0xFF000000;
			}
		}
		if (this.aClass332_2 != null) {
			this.aClass332_2.anInterface2_6 = null;
			return;
		}
	}
}
