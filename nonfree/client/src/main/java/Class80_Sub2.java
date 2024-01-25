import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hba")
public final class Class80_Sub2 extends Class80 {

	@OriginalMember(owner = "client!hba", name = "l", descriptor = "I")
	private int anInt3827;

	@OriginalMember(owner = "client!hba", name = "t", descriptor = "S")
	private short aShort51;

	@OriginalMember(owner = "client!hba", name = "A", descriptor = "S")
	private short aShort52;

	@OriginalMember(owner = "client!hba", name = "B", descriptor = "[I")
	private int[] anIntArray313;

	@OriginalMember(owner = "client!hba", name = "D", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!hba", name = "H", descriptor = "Lclient!gda;")
	private Interface8 anInterface8_2;

	@OriginalMember(owner = "client!hba", name = "K", descriptor = "Lclient!af;")
	private Class10 aClass10_1;

	@OriginalMember(owner = "client!hba", name = "N", descriptor = "B")
	private byte aByte76;

	@OriginalMember(owner = "client!hba", name = "P", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!hba", name = "Q", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!hba", name = "R", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!hba", name = "S", descriptor = "Lclient!kda;")
	private Interface12 anInterface12_1;

	@OriginalMember(owner = "client!hba", name = "U", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!hba", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!hba", name = "W", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!hba", name = "cb", descriptor = "[I")
	private int[] anIntArray314;

	@OriginalMember(owner = "client!hba", name = "gb", descriptor = "[Lclient!oq;")
	private Class265[] aClass265Array3;

	@OriginalMember(owner = "client!hba", name = "ib", descriptor = "I")
	private int anInt3854;

	@OriginalMember(owner = "client!hba", name = "jb", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!hba", name = "kb", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!hba", name = "mb", descriptor = "[Lclient!rga;")
	private Class301[] aClass301Array1;

	@OriginalMember(owner = "client!hba", name = "vb", descriptor = "S")
	private short aShort55;

	@OriginalMember(owner = "client!hba", name = "wb", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!hba", name = "xb", descriptor = "[Lclient!gv;")
	private Class136[] aClass136Array3;

	@OriginalMember(owner = "client!hba", name = "zb", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!hba", name = "Cb", descriptor = "S")
	private short aShort56;

	@OriginalMember(owner = "client!hba", name = "Eb", descriptor = "S")
	private short aShort57;

	@OriginalMember(owner = "client!hba", name = "Ib", descriptor = "S")
	private short aShort58;

	@OriginalMember(owner = "client!hba", name = "Jb", descriptor = "[B")
	private byte[] aByteArray50;

	@OriginalMember(owner = "client!hba", name = "Pb", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!hba", name = "Rb", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!hba", name = "Vb", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!hba", name = "Wb", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!hba", name = "Yb", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!hba", name = "Zb", descriptor = "[I")
	private int[] anIntArray315;

	@OriginalMember(owner = "client!hba", name = "cc", descriptor = "[F")
	private float[] aFloatArray25;

	@OriginalMember(owner = "client!hba", name = "fc", descriptor = "S")
	private short aShort59;

	@OriginalMember(owner = "client!hba", name = "gc", descriptor = "[I")
	private int[] anIntArray316;

	@OriginalMember(owner = "client!hba", name = "hc", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!hba", name = "mc", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!hba", name = "pc", descriptor = "S")
	private short aShort60;

	@OriginalMember(owner = "client!hba", name = "sc", descriptor = "I")
	private int anInt3888;

	@OriginalMember(owner = "client!hba", name = "wc", descriptor = "[I")
	private int[] anIntArray317;

	@OriginalMember(owner = "client!hba", name = "xc", descriptor = "[Lclient!wp;")
	private Class391[] aClass391Array1;

	@OriginalMember(owner = "client!hba", name = "y", descriptor = "Z")
	private boolean aBoolean282 = false;

	@OriginalMember(owner = "client!hba", name = "G", descriptor = "I")
	private int anInt3841 = 0;

	@OriginalMember(owner = "client!hba", name = "nb", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!hba", name = "Y", descriptor = "Z")
	private boolean aBoolean283 = false;

	@OriginalMember(owner = "client!hba", name = "Xb", descriptor = "I")
	private int anInt3876 = 0;

	@OriginalMember(owner = "client!hba", name = "Nb", descriptor = "I")
	private int anInt3870 = 0;

	@OriginalMember(owner = "client!hba", name = "jc", descriptor = "I")
	private int anInt3882 = 0;

	@OriginalMember(owner = "client!hba", name = "rc", descriptor = "I")
	private int anInt3887 = 0;

	@OriginalMember(owner = "client!hba", name = "Z", descriptor = "Z")
	private boolean aBoolean284 = true;

	@OriginalMember(owner = "client!hba", name = "oc", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_13;

	@OriginalMember(owner = "client!hba", name = "Hb", descriptor = "Lclient!ei;")
	private Class91 aClass91_4;

	@OriginalMember(owner = "client!hba", name = "I", descriptor = "Lclient!ei;")
	private Class91 aClass91_2;

	@OriginalMember(owner = "client!hba", name = "w", descriptor = "Lclient!ei;")
	private Class91 aClass91_1;

	@OriginalMember(owner = "client!hba", name = "Bb", descriptor = "Lclient!ei;")
	private Class91 aClass91_3;

	@OriginalMember(owner = "client!hba", name = "F", descriptor = "Lclient!qw;")
	private Class293 aClass293_1;

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class80_Sub2(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aClass137_Sub3_13 = arg0;
		this.aClass91_4 = new Class91((Interface8) null, 5126, 3, 0);
		this.aClass91_2 = new Class91((Interface8) null, 5126, 2, 0);
		this.aClass91_1 = new Class91((Interface8) null, 5126, 3, 0);
		this.aClass91_3 = new Class91((Interface8) null, 5121, 4, 0);
		this.aClass293_1 = new Class293();
	}

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!qfa;Lclient!dba;IIII)V")
	public Class80_Sub2(@OriginalArg(0) Class137_Sub3 arg0, @OriginalArg(1) Class67 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt3888 = arg5;
		this.anInt3827 = arg2;
		this.aClass137_Sub3_13 = arg0;
		if (Static305.method4469(arg2, arg5)) {
			this.aClass91_4 = new Class91((Interface8) null, 5126, 3, 0);
		}
		if (Static628.method8809(arg2, arg5)) {
			this.aClass91_2 = new Class91((Interface8) null, 5126, 2, 0);
		}
		if (Static597.method8442(arg2, arg5)) {
			this.aClass91_1 = new Class91((Interface8) null, 5126, 3, 0);
		}
		if (Static49.method1023(arg5, arg2)) {
			this.aClass91_3 = new Class91((Interface8) null, 5121, 4, 0);
		}
		if (Static135.method2158(arg5, arg2)) {
			this.aClass293_1 = new Class293();
		}
		@Pc(108) Interface3 local108 = arg0.anInterface3_11;
		@Pc(112) int[] local112 = new int[arg1.anInt2019];
		this.anIntArray317 = new int[arg1.anInt2029 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt2019; local121++) {
			if (arg1.aByteArray27 == null || arg1.aByteArray27[local121] != 2) {
				if (arg1.aShortArray26 != null && arg1.aShortArray26[local121] != -1) {
					@Pc(154) Class224 local154 = local108.method6177(arg1.aShortArray26[local121] & 0xFFFF);
					if (((this.anInt3888 & 0x40) == 0 || !local154.aBoolean453) && local154.aBoolean450) {
						continue;
					}
				}
				local112[this.anInt3887++] = local121;
				this.anIntArray317[arg1.aShortArray28[local121]]++;
				this.anIntArray317[arg1.aShortArray22[local121]]++;
				this.anIntArray317[arg1.aShortArray25[local121]]++;
			}
		}
		this.anInt3882 = this.anInt3887;
		@Pc(223) long[] local223 = new long[this.anInt3887];
		@Pc(235) boolean local235 = (this.anInt3827 & 0x100) != 0;
		@Pc(247) int local247;
		@Pc(260) int local260;
		@Pc(437) int local437;
		for (@Pc(237) int local237 = 0; local237 < this.anInt3887; local237++) {
			@Pc(243) int local243 = local112[local237];
			@Pc(245) Class224 local245 = null;
			local247 = 0;
			@Pc(249) byte local249 = 0;
			@Pc(251) byte local251 = 0;
			@Pc(253) byte local253 = 0;
			if (arg1.aClass156Array1 != null) {
				@Pc(258) boolean local258 = false;
				for (local260 = 0; local260 < arg1.aClass156Array1.length; local260++) {
					@Pc(267) Class156 local267 = arg1.aClass156Array1[local260];
					if (local243 == local267.anInt4303) {
						@Pc(280) Class182 local280 = Static356.method5394(local267.anInt4305);
						if (local280.aBoolean331) {
							local258 = true;
						}
						if (local280.anInt4854 != -1) {
							@Pc(296) Class224 local296 = local108.method6177(local280.anInt4854);
							if (local296.anInt6492 == 2) {
								this.aBoolean285 = true;
							}
						}
					}
				}
				if (local258) {
					local223[local237] = Long.MAX_VALUE;
					this.anInt3882--;
					continue;
				}
			}
			@Pc(329) short local329 = -1;
			if (arg1.aShortArray26 != null) {
				local329 = arg1.aShortArray26[local243];
				if (local329 != -1) {
					local245 = local108.method6177(local329 & 0xFFFF);
					if ((this.anInt3888 & 0x40) != 0 && local245.aBoolean453) {
						local245 = null;
						local329 = -1;
					} else {
						if (local245.aByte98 != 0 || local245.aByte97 != 0) {
							this.aBoolean282 = true;
						}
						local253 = local245.aByte94;
						local251 = local245.aByte96;
					}
				}
			}
			@Pc(399) boolean local399 = arg1.aByteArray26 != null && arg1.aByteArray26[local243] != 0 || local245 != null && local245.anInt6492 != 0;
			if ((local235 || local399) && arg1.aByteArray29 != null) {
				local247 += arg1.aByteArray29[local243] << 17;
			}
			if (local399) {
				local247 += 65536;
			}
			local247 += (local251 & 0xFF) << 8;
			local437 = local249 + ((local329 & 0xFFFF) << 16);
			local247 += local253 & 0xFF;
			@Pc(449) int local449 = local437 + (local237 & 0xFFFF);
			local223[local237] = (long) local449 + ((long) local247 << 32);
			this.aBoolean282 |= local245 != null && (local245.aByte98 != 0 || local245.aByte97 != 0);
			this.aBoolean285 |= local399;
		}
		Static116.method1962(local112, local223);
		this.anInt3870 = arg1.anInt2029;
		this.anIntArray315 = arg1.anIntArray146;
		this.anIntArray313 = arg1.anIntArray148;
		this.anIntArray314 = arg1.anIntArray147;
		this.aShortArray67 = arg1.aShortArray21;
		this.anInt3876 = arg1.anInt2023;
		@Pc(522) Class367[] local522 = new Class367[this.anInt3870];
		this.aClass265Array3 = arg1.aClass265Array1;
		this.aClass136Array3 = arg1.aClass136Array1;
		@Pc(550) int local550;
		@Pc(564) int local564;
		@Pc(611) int local611;
		if (arg1.aClass156Array1 != null) {
			this.anInt3854 = arg1.aClass156Array1.length;
			this.aClass391Array1 = new Class391[this.anInt3854];
			this.aClass301Array1 = new Class301[this.anInt3854];
			for (local550 = 0; local550 < this.anInt3854; local550++) {
				@Pc(557) Class156 local557 = arg1.aClass156Array1[local550];
				@Pc(562) Class182 local562 = Static356.method5394(local557.anInt4305);
				local564 = -1;
				for (@Pc(566) int local566 = 0; local566 < this.anInt3887; local566++) {
					if (local112[local566] == local557.anInt4303) {
						local564 = local566;
						break;
					}
				}
				if (local564 == -1) {
					throw new RuntimeException();
				}
				local611 = Static659.anIntArray816[arg1.aShortArray23[local557.anInt4303] & 0xFFFF] & 0xFFFFFF;
				@Pc(629) int local629 = local611 | 255 - (arg1.aByteArray26 == null ? 0 : arg1.aByteArray26[local557.anInt4303]) << 24;
				this.aClass391Array1[local550] = new Class391(local564, arg1.aShortArray28[local557.anInt4303], arg1.aShortArray22[local557.anInt4303], arg1.aShortArray25[local557.anInt4303], local562.anInt4852, local562.anInt4851, local562.anInt4854, local562.anInt4857, local562.anInt4853, local562.aBoolean331, local562.aBoolean332, local557.anInt4306);
				this.aClass301Array1[local550] = new Class301(local629);
			}
		}
		local550 = this.anInt3887 * 3;
		this.aShortArray65 = new short[this.anInt3887];
		this.aFloatArray25 = new float[local550];
		this.aShortArray57 = new short[local550];
		this.aShort56 = (short) arg3;
		this.aShortArray60 = new short[this.anInt3887];
		this.aShortArray63 = new short[local550];
		this.aShort55 = (short) arg4;
		this.aShortArray64 = new short[this.anInt3887];
		this.aByteArray50 = new byte[this.anInt3887];
		this.aShortArray62 = new short[local550];
		this.aFloatArray24 = new float[local550];
		this.aShortArray58 = new short[this.anInt3887];
		this.aByteArray49 = new byte[local550];
		if (arg1.aShortArray19 != null) {
			this.aShortArray66 = new short[this.anInt3887];
		}
		Static531.aLongArray19 = new long[local550];
		this.aShortArray59 = new short[this.anInt3887];
		this.aShortArray61 = new short[local550];
		local247 = 0;
		for (local437 = 0; local437 < arg1.anInt2029; local437++) {
			local564 = this.anIntArray317[local437];
			this.anIntArray317[local437] = local247;
			local247 += local564;
			local522[local437] = new Class367();
		}
		this.anIntArray317[arg1.anInt2029] = local247;
		@Pc(811) Class358 local811 = Static54.method1182(arg1, this.anInt3887, local112);
		@Pc(815) Class8[] local815 = new Class8[arg1.anInt2019];
		@Pc(856) int local856;
		@Pc(867) int local867;
		@Pc(888) int local888;
		@Pc(898) int local898;
		@Pc(906) int local906;
		@Pc(915) int local915;
		@Pc(834) short local834;
		@Pc(845) int local845;
		for (local611 = 0; local611 < arg1.anInt2019; local611++) {
			@Pc(824) short local824 = arg1.aShortArray28[local611];
			@Pc(829) short local829 = arg1.aShortArray22[local611];
			local834 = arg1.aShortArray25[local611];
			local845 = this.anIntArray314[local829] - this.anIntArray314[local824];
			local856 = this.anIntArray315[local829] - this.anIntArray315[local824];
			local867 = this.anIntArray313[local829] - this.anIntArray313[local824];
			@Pc(877) int local877 = this.anIntArray314[local834] - this.anIntArray314[local824];
			local888 = this.anIntArray315[local834] - this.anIntArray315[local824];
			local898 = this.anIntArray313[local834] - this.anIntArray313[local824];
			local906 = local898 * local856 - local888 * local867;
			local915 = local867 * local877 - local845 * local898;
			@Pc(924) int local924 = local845 * local888 - local856 * local877;
			while (local906 > 8192 || local915 > 8192 || local924 > 8192 || local906 < -8192 || local915 < -8192 || local924 < -8192) {
				local924 >>= 0x1;
				local915 >>= 0x1;
				local906 >>= 0x1;
			}
			@Pc(975) int local975 = (int) Math.sqrt((double) (local924 * local924 + local915 * local915 + local906 * local906));
			if (local975 <= 0) {
				local975 = 1;
			}
			local906 = local906 * 256 / local975;
			local924 = local924 * 256 / local975;
			local915 = local915 * 256 / local975;
			@Pc(1010) byte local1010 = arg1.aByteArray27 == null ? 0 : arg1.aByteArray27[local611];
			if (local1010 == 0) {
				@Pc(1043) Class367 local1043 = local522[local824];
				local1043.anInt10583 += local915;
				local1043.anInt10581 += local906;
				local1043.anInt10582 += local924;
				local1043.anInt10578++;
				@Pc(1071) Class367 local1071 = local522[local829];
				local1071.anInt10581 += local906;
				local1071.anInt10582 += local924;
				local1071.anInt10578++;
				local1071.anInt10583 += local915;
				@Pc(1099) Class367 local1099 = local522[local834];
				local1099.anInt10582 += local924;
				local1099.anInt10583 += local915;
				local1099.anInt10581 += local906;
				local1099.anInt10578++;
			} else if (local1010 == 1) {
				@Pc(1028) Class8 local1028 = local815[local611] = new Class8();
				local1028.anInt55 = local924;
				local1028.anInt56 = local906;
				local1028.anInt59 = local915;
			}
		}
		@Pc(1136) int local1136;
		@Pc(1179) short local1179;
		for (local260 = 0; local260 < this.anInt3887; local260++) {
			local1136 = local112[local260];
			@Pc(1143) int local1143 = arg1.aShortArray23[local1136] & 0xFFFF;
			if (arg1.aByteArray32 == null) {
				local845 = -1;
			} else {
				local845 = arg1.aByteArray32[local1136];
			}
			if (arg1.aByteArray26 == null) {
				local856 = 0;
			} else {
				local856 = arg1.aByteArray26[local1136] & 0xFF;
			}
			local1179 = arg1.aShortArray26 == null ? -1 : arg1.aShortArray26[local1136];
			if (local1179 != -1 && (this.anInt3888 & 0x40) != 0) {
				@Pc(1195) Class224 local1195 = local108.method6177(local1179 & 0xFFFF);
				if (local1195.aBoolean453) {
					local1179 = -1;
				}
			}
			@Pc(1202) float local1202 = 0.0F;
			@Pc(1204) float local1204 = 0.0F;
			@Pc(1206) float local1206 = 0.0F;
			@Pc(1208) float local1208 = 0.0F;
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) byte local1214 = 0;
			@Pc(1216) byte local1216 = 0;
			@Pc(1218) int local1218 = 0;
			@Pc(1253) byte local1253;
			@Pc(1273) short local1273;
			@Pc(1278) short local1278;
			@Pc(1283) short local1283;
			if (local1179 != -1) {
				if (local845 == -1) {
					local1204 = 1.0F;
					local1214 = 1;
					local1206 = 1.0F;
					local1212 = 0.0F;
					local1208 = 1.0F;
					local1210 = 0.0F;
					local1202 = 0.0F;
					local1216 = 2;
				} else {
					local845 &= 0xFF;
					local1253 = arg1.aByteArray31[local845];
					@Pc(1263) short local1263;
					@Pc(1268) short local1268;
					@Pc(1306) float local1306;
					@Pc(1315) float local1315;
					@Pc(1323) float local1323;
					@Pc(1412) float local1412;
					@Pc(1420) float local1420;
					@Pc(1428) float local1428;
					@Pc(1436) float local1436;
					@Pc(1444) float local1444;
					@Pc(1453) float local1453;
					if (local1253 == 0) {
						local1263 = arg1.aShortArray28[local1136];
						local1268 = arg1.aShortArray22[local1136];
						local1273 = arg1.aShortArray25[local1136];
						local1278 = arg1.aShortArray27[local845];
						local1283 = arg1.aShortArray24[local845];
						@Pc(1288) short local1288 = arg1.aShortArray20[local845];
						@Pc(1294) float local1294 = (float) arg1.anIntArray147[local1278];
						@Pc(1300) float local1300 = (float) arg1.anIntArray146[local1278];
						local1306 = (float) arg1.anIntArray148[local1278];
						local1315 = (float) arg1.anIntArray147[local1283] - local1294;
						local1323 = (float) arg1.anIntArray146[local1283] - local1300;
						@Pc(1332) float local1332 = (float) arg1.anIntArray148[local1283] - local1306;
						@Pc(1341) float local1341 = (float) arg1.anIntArray147[local1288] - local1294;
						@Pc(1350) float local1350 = (float) arg1.anIntArray146[local1288] - local1300;
						@Pc(1359) float local1359 = (float) arg1.anIntArray148[local1288] - local1306;
						@Pc(1368) float local1368 = (float) arg1.anIntArray147[local1263] - local1294;
						@Pc(1377) float local1377 = (float) arg1.anIntArray146[local1263] - local1300;
						@Pc(1386) float local1386 = (float) arg1.anIntArray148[local1263] - local1306;
						@Pc(1395) float local1395 = (float) arg1.anIntArray147[local1268] - local1294;
						@Pc(1404) float local1404 = (float) arg1.anIntArray146[local1268] - local1300;
						local1412 = (float) arg1.anIntArray148[local1268] - local1306;
						local1420 = (float) arg1.anIntArray147[local1273] - local1294;
						local1428 = (float) arg1.anIntArray146[local1273] - local1300;
						local1436 = (float) arg1.anIntArray148[local1273] - local1306;
						local1444 = local1323 * local1359 - local1332 * local1350;
						local1453 = local1341 * local1332 - local1315 * local1359;
						@Pc(1461) float local1461 = local1315 * local1350 - local1323 * local1341;
						@Pc(1469) float local1469 = local1461 * local1350 - local1453 * local1359;
						@Pc(1478) float local1478 = local1444 * local1359 - local1461 * local1341;
						@Pc(1486) float local1486 = local1341 * local1453 - local1350 * local1444;
						@Pc(1500) float local1500 = 1.0F / (local1478 * local1323 + local1315 * local1469 + local1486 * local1332);
						local1202 = (local1377 * local1478 + local1469 * local1368 + local1486 * local1386) * local1500;
						local1206 = (local1395 * local1469 + local1478 * local1404 + local1412 * local1486) * local1500;
						local1210 = local1500 * (local1420 * local1469 + local1428 * local1478 + local1486 * local1436);
						@Pc(1551) float local1551 = local1453 * local1315 - local1323 * local1444;
						@Pc(1560) float local1560 = local1444 * local1332 - local1315 * local1461;
						@Pc(1568) float local1568 = local1323 * local1461 - local1453 * local1332;
						@Pc(1582) float local1582 = 1.0F / (local1341 * local1568 + local1350 * local1560 + local1551 * local1359);
						local1212 = local1582 * (local1551 * local1436 + local1560 * local1428 + local1568 * local1420);
						local1208 = local1582 * (local1395 * local1568 + local1404 * local1560 + local1412 * local1551);
						local1204 = (local1377 * local1560 + local1368 * local1568 + local1551 * local1386) * local1582;
					} else {
						local1263 = arg1.aShortArray28[local1136];
						local1268 = arg1.aShortArray22[local1136];
						local1273 = arg1.aShortArray25[local1136];
						@Pc(1646) int local1646 = local811.anIntArray756[local845];
						@Pc(1651) int local1651 = local811.anIntArray757[local845];
						@Pc(1656) int local1656 = local811.anIntArray758[local845];
						@Pc(1661) float[] local1661 = local811.aFloatArrayArray18[local845];
						@Pc(1666) byte local1666 = arg1.aByteArray30[local845];
						local1306 = (float) arg1.anIntArray151[local845] / 256.0F;
						if (local1253 == 1) {
							local1315 = (float) arg1.anIntArray145[local845] / 1024.0F;
							Static529.method7861(arg1.anIntArray148[local1263], local1315, local1306, local1646, arg1.anIntArray146[local1263], local1656, Static209.aFloatArray26, local1666, local1651, arg1.anIntArray147[local1263], local1661);
							local1204 = Static209.aFloatArray26[1];
							local1202 = Static209.aFloatArray26[0];
							Static529.method7861(arg1.anIntArray148[local1268], local1315, local1306, local1646, arg1.anIntArray146[local1268], local1656, Static209.aFloatArray26, local1666, local1651, arg1.anIntArray147[local1268], local1661);
							local1206 = Static209.aFloatArray26[0];
							local1208 = Static209.aFloatArray26[1];
							Static529.method7861(arg1.anIntArray148[local1273], local1315, local1306, local1646, arg1.anIntArray146[local1273], local1656, Static209.aFloatArray26, local1666, local1651, arg1.anIntArray147[local1273], local1661);
							local1210 = Static209.aFloatArray26[0];
							local1212 = Static209.aFloatArray26[1];
							local1323 = local1315 / 2.0F;
							if ((local1666 & 0x1) == 0) {
								if (local1323 < local1210 - local1202) {
									local1210 -= local1315;
									local1216 = 1;
								} else if (local1202 - local1210 > local1323) {
									local1216 = 2;
									local1210 += local1315;
								}
								if (local1206 - local1202 > local1323) {
									local1206 -= local1315;
									local1214 = 1;
								} else if (local1202 - local1206 > local1323) {
									local1206 += local1315;
									local1214 = 2;
								}
							} else {
								if (local1208 - local1204 > local1323) {
									local1214 = 1;
									local1208 -= local1315;
								} else if (local1323 < local1204 - local1208) {
									local1208 += local1315;
									local1214 = 2;
								}
								if (local1212 - local1204 > local1323) {
									local1216 = 1;
									local1212 -= local1315;
								} else if (local1323 < local1204 - local1212) {
									local1216 = 2;
									local1212 += local1315;
								}
							}
						} else if (local1253 == 2) {
							local1315 = (float) arg1.anIntArray143[local845] / 256.0F;
							local1323 = (float) arg1.anIntArray150[local845] / 256.0F;
							@Pc(1919) int local1919 = arg1.anIntArray147[local1268] - arg1.anIntArray147[local1263];
							@Pc(1930) int local1930 = arg1.anIntArray146[local1268] - arg1.anIntArray146[local1263];
							@Pc(1941) int local1941 = arg1.anIntArray148[local1268] - arg1.anIntArray148[local1263];
							@Pc(1952) int local1952 = arg1.anIntArray147[local1273] - arg1.anIntArray147[local1263];
							@Pc(1963) int local1963 = arg1.anIntArray146[local1273] - arg1.anIntArray146[local1263];
							@Pc(1973) int local1973 = arg1.anIntArray148[local1273] - arg1.anIntArray148[local1263];
							@Pc(1982) int local1982 = local1930 * local1973 - local1941 * local1963;
							@Pc(1991) int local1991 = local1941 * local1952 - local1973 * local1919;
							@Pc(2000) int local2000 = local1919 * local1963 - local1952 * local1930;
							local1412 = 64.0F / (float) arg1.anIntArray141[local845];
							local1420 = 64.0F / (float) arg1.anIntArray144[local845];
							local1428 = 64.0F / (float) arg1.anIntArray145[local845];
							local1436 = ((float) local2000 * local1661[2] + local1661[1] * (float) local1991 + local1661[0] * (float) local1982) / local1412;
							local1444 = (local1661[5] * (float) local2000 + local1661[3] * (float) local1982 + local1661[4] * (float) local1991) / local1420;
							local1453 = (local1661[7] * (float) local1991 + (float) local1982 * local1661[6] + (float) local2000 * local1661[8]) / local1428;
							local1218 = Static230.method3500(local1444, local1453, local1436);
							Static245.method9052(arg1.anIntArray148[local1263], local1666, Static209.aFloatArray26, local1218, local1323, local1306, local1646, local1661, arg1.anIntArray146[local1263], arg1.anIntArray147[local1263], local1315, local1651, local1656);
							local1204 = Static209.aFloatArray26[1];
							local1202 = Static209.aFloatArray26[0];
							Static245.method9052(arg1.anIntArray148[local1268], local1666, Static209.aFloatArray26, local1218, local1323, local1306, local1646, local1661, arg1.anIntArray146[local1268], arg1.anIntArray147[local1268], local1315, local1651, local1656);
							local1208 = Static209.aFloatArray26[1];
							local1206 = Static209.aFloatArray26[0];
							Static245.method9052(arg1.anIntArray148[local1273], local1666, Static209.aFloatArray26, local1218, local1323, local1306, local1646, local1661, arg1.anIntArray146[local1273], arg1.anIntArray147[local1273], local1315, local1651, local1656);
							local1212 = Static209.aFloatArray26[1];
							local1210 = Static209.aFloatArray26[0];
						} else if (local1253 == 3) {
							Static240.method3605(arg1.anIntArray148[local1263], local1656, local1646, arg1.anIntArray146[local1263], local1651, arg1.anIntArray147[local1263], local1666, local1661, local1306, Static209.aFloatArray26);
							local1204 = Static209.aFloatArray26[1];
							local1202 = Static209.aFloatArray26[0];
							Static240.method3605(arg1.anIntArray148[local1268], local1656, local1646, arg1.anIntArray146[local1268], local1651, arg1.anIntArray147[local1268], local1666, local1661, local1306, Static209.aFloatArray26);
							local1208 = Static209.aFloatArray26[1];
							local1206 = Static209.aFloatArray26[0];
							Static240.method3605(arg1.anIntArray148[local1273], local1656, local1646, arg1.anIntArray146[local1273], local1651, arg1.anIntArray147[local1273], local1666, local1661, local1306, Static209.aFloatArray26);
							local1210 = Static209.aFloatArray26[0];
							local1212 = Static209.aFloatArray26[1];
							if ((local1666 & 0x1) == 0) {
								if (local1210 - local1202 > 0.5F) {
									local1210--;
									local1216 = 1;
								} else if (local1202 - local1210 > 0.5F) {
									local1216 = 2;
									local1210++;
								}
								if (local1206 - local1202 > 0.5F) {
									local1214 = 1;
									local1206--;
								} else if (local1202 - local1206 > 0.5F) {
									local1214 = 2;
									local1206++;
								}
							} else {
								if (local1212 - local1204 > 0.5F) {
									local1212--;
									local1216 = 1;
								} else if (local1204 - local1212 > 0.5F) {
									local1216 = 2;
									local1212++;
								}
								if (local1208 - local1204 > 0.5F) {
									local1214 = 1;
									local1208--;
								} else if (local1204 - local1208 > 0.5F) {
									local1214 = 2;
									local1208++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray27 == null) {
				local1253 = 0;
			} else {
				local1253 = arg1.aByteArray27[local1136];
			}
			if (local1253 == 0) {
				@Pc(2453) long local2453 = ((long) local856 + (long) (local1218 << 24) + (long) (local1143 << 8) << 32) + (long) (local845 << 2);
				local1273 = arg1.aShortArray28[local1136];
				local1278 = arg1.aShortArray22[local1136];
				local1283 = arg1.aShortArray25[local1136];
				@Pc(2472) Class367 local2472 = local522[local1273];
				this.aShortArray65[local260] = this.method3238(local2472.anInt10582, local1204, local2472.anInt10583, local2472.anInt10581, local1202, local2472.anInt10578, local1273, local2453, arg1);
				@Pc(2496) Class367 local2496 = local522[local1278];
				this.aShortArray64[local260] = this.method3238(local2496.anInt10582, local1208, local2496.anInt10583, local2496.anInt10581, local1206, local2496.anInt10578, local1278, local2453 + (long) local1214, arg1);
				@Pc(2523) Class367 local2523 = local522[local1283];
				this.aShortArray59[local260] = this.method3238(local2523.anInt10582, local1212, local2523.anInt10583, local2523.anInt10581, local1210, local2523.anInt10578, local1283, (long) local1216 + local2453, arg1);
			} else if (local1253 == 1) {
				@Pc(2557) Class8 local2557 = local815[local1136];
				@Pc(2602) long local2602 = (long) ((local2557.anInt55 + 256 << 22) + (local2557.anInt59 + 256 << 12) + (local845 << 2) + (local2557.anInt56 > 0 ? 1024 : 2048)) + ((long) local856 + (long) (local1143 << 8) + (long) (local1218 << 24) << 32);
				this.aShortArray65[local260] = this.method3238(local2557.anInt55, local1204, local2557.anInt59, local2557.anInt56, local1202, 0, arg1.aShortArray28[local1136], local2602, arg1);
				this.aShortArray64[local260] = this.method3238(local2557.anInt55, local1208, local2557.anInt59, local2557.anInt56, local1206, 0, arg1.aShortArray22[local1136], local2602 + (long) local1214, arg1);
				this.aShortArray59[local260] = this.method3238(local2557.anInt55, local1212, local2557.anInt59, local2557.anInt56, local1210, 0, arg1.aShortArray25[local1136], local2602 + (long) local1216, arg1);
			}
			if (arg1.aByteArray26 != null) {
				this.aByteArray50[local260] = arg1.aByteArray26[local1136];
			}
			if (arg1.aShortArray19 != null) {
				this.aShortArray66[local260] = arg1.aShortArray19[local1136];
			}
			this.aShortArray58[local260] = arg1.aShortArray23[local1136];
			this.aShortArray60[local260] = local1179;
		}
		local1136 = 0;
		local834 = -10000;
		for (local845 = 0; local845 < this.anInt3882; local845++) {
			@Pc(2727) short local2727 = this.aShortArray60[local845];
			if (local834 != local2727) {
				local834 = local2727;
				local1136++;
			}
		}
		this.anIntArray316 = new int[local1136 + 1];
		local1136 = 0;
		local834 = -10000;
		for (local856 = 0; local856 < this.anInt3882; local856++) {
			local1179 = this.aShortArray60[local856];
			if (local834 != local1179) {
				this.anIntArray316[local1136++] = local856;
				local834 = local1179;
			}
		}
		this.anIntArray316[local1136] = this.anInt3882;
		Static531.aLongArray19 = null;
		this.aShortArray57 = Static613.method8610(this.anInt3841, this.aShortArray57);
		this.aShortArray62 = Static613.method8610(this.anInt3841, this.aShortArray62);
		this.aShortArray61 = Static613.method8610(this.anInt3841, this.aShortArray61);
		this.aByteArray49 = Static293.method6370(this.aByteArray49, this.anInt3841);
		this.aFloatArray25 = Static623.method8747(this.anInt3841, this.aFloatArray25);
		this.aFloatArray24 = Static623.method8747(this.anInt3841, this.aFloatArray24);
		if (arg1.anIntArray149 != null && Static661.method9136(arg2, this.anInt3888)) {
			this.anIntArrayArray26 = arg1.method1713(false);
		}
		if (arg1.aClass156Array1 != null && Static328.method5135(arg2, this.anInt3888)) {
			this.anIntArrayArray27 = arg1.method1726();
		}
		if (arg1.anIntArray142 != null && Static578.method8265(arg2, this.anInt3888)) {
			local867 = 0;
			@Pc(2880) int[] local2880 = new int[256];
			for (local888 = 0; local888 < this.anInt3887; local888++) {
				local898 = arg1.anIntArray142[local112[local888]];
				if (local898 >= 0) {
					if (local867 < local898) {
						local867 = local898;
					}
					@Pc(2909) int local2909 = local2880[local898]++;
				}
			}
			this.anIntArrayArray28 = new int[local867 + 1][];
			for (local898 = 0; local898 <= local867; local898++) {
				this.anIntArrayArray28[local898] = new int[local2880[local898]];
				local2880[local898] = 0;
			}
			for (local906 = 0; local906 < this.anInt3887; local906++) {
				local915 = arg1.anIntArray142[local112[local906]];
				if (local915 >= 0) {
					this.anIntArrayArray28[local915][local2880[local915]++] = local906;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)V")
	private void method3233() {
		if (!this.aBoolean284) {
			return;
		}
		this.aBoolean284 = false;
		if (this.aClass136Array3 == null && this.aClass265Array3 == null && this.aClass391Array1 == null && !Static419.method6218(this.anInt3827, this.anInt3888)) {
			@Pc(30) boolean local30 = false;
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			if (this.anIntArray314 != null && !Static296.method5215(this.anInt3827, this.anInt3888)) {
				if (this.aClass91_4 != null && this.aClass91_4.anInterface8_1 == null) {
					this.aBoolean284 = true;
				} else {
					if (!this.aBoolean283) {
						this.method3234();
					}
					local30 = true;
				}
			}
			if (this.anIntArray315 != null && !Static141.method1566(this.anInt3888, this.anInt3827)) {
				if (this.aClass91_4 != null && this.aClass91_4.anInterface8_1 == null) {
					this.aBoolean284 = true;
				} else {
					local32 = true;
					if (!this.aBoolean283) {
						this.method3234();
					}
				}
			}
			if (this.anIntArray313 != null && !Static588.method8388(this.anInt3827, this.anInt3888)) {
				if (this.aClass91_4 != null && this.aClass91_4.anInterface8_1 == null) {
					this.aBoolean284 = true;
				} else {
					local34 = true;
					if (!this.aBoolean283) {
						this.method3234();
					}
				}
			}
			if (local30) {
				this.anIntArray314 = null;
			}
			if (local34) {
				this.anIntArray313 = null;
			}
			if (local32) {
				this.anIntArray315 = null;
			}
		}
		if (this.aShortArray63 != null && this.anIntArray314 == null && this.anIntArray315 == null && this.anIntArray313 == null) {
			this.aShortArray63 = null;
			this.anIntArray317 = null;
		}
		if (this.aByteArray49 != null && !Static585.method8339(this.anInt3888, this.anInt3827)) {
			if (this.aClass91_1 == null) {
				if (this.aClass91_3 != null && this.aClass91_3.anInterface8_1 == null) {
					this.aBoolean284 = true;
				} else {
					this.aByteArray49 = null;
					this.aShortArray57 = this.aShortArray62 = this.aShortArray61 = null;
				}
			} else if (this.aClass91_1.anInterface8_1 == null) {
				this.aBoolean284 = true;
			} else {
				this.aByteArray49 = null;
				this.aShortArray57 = this.aShortArray62 = this.aShortArray61 = null;
			}
		}
		if (this.aShortArray58 != null && !Static246.method3649(this.anInt3888, this.anInt3827)) {
			if (this.aClass91_3 != null && this.aClass91_3.anInterface8_1 == null) {
				this.aBoolean284 = true;
			} else {
				this.aShortArray58 = null;
			}
		}
		if (this.aByteArray50 != null && !Static499.method7331(this.anInt3827, this.anInt3888)) {
			if (this.aClass91_3 != null && this.aClass91_3.anInterface8_1 == null) {
				this.aBoolean284 = true;
			} else {
				this.aByteArray50 = null;
			}
		}
		if (this.aFloatArray25 != null && !Static42.method927(this.anInt3827, this.anInt3888)) {
			if (this.aClass91_2 != null && this.aClass91_2.anInterface8_1 == null) {
				this.aBoolean284 = true;
			} else {
				this.aFloatArray25 = this.aFloatArray24 = null;
			}
		}
		if (this.aShortArray60 != null && !Static123.method2084(this.anInt3888, this.anInt3827)) {
			if (this.aClass91_3 != null && this.aClass91_3.anInterface8_1 == null) {
				this.aBoolean284 = true;
			} else {
				this.aShortArray60 = null;
			}
		}
		if (this.aShortArray65 != null && !Static68.method1353(this.anInt3827, this.anInt3888)) {
			if ((this.aClass293_1 == null || this.aClass293_1.anInterface12_5 != null) && (this.aClass91_3 == null || this.aClass91_3.anInterface8_1 != null)) {
				this.aShortArray65 = this.aShortArray64 = this.aShortArray59 = null;
			} else {
				this.aBoolean284 = true;
			}
		}
		if (this.anIntArrayArray28 != null && !Static578.method8265(this.anInt3827, this.anInt3888)) {
			this.aShortArray66 = null;
			this.anIntArrayArray28 = null;
		}
		if (this.anIntArrayArray26 != null && !Static661.method9136(this.anInt3827, this.anInt3888)) {
			this.aShortArray67 = null;
			this.anIntArrayArray26 = null;
		}
		if (this.anIntArrayArray27 != null && !Static328.method5135(this.anInt3827, this.anInt3888)) {
			this.anIntArrayArray27 = null;
		}
		if (this.anIntArray316 != null && (this.anInt3827 & 0x800) == 0 && (this.anInt3827 & 0x40000) == 0) {
			this.anIntArray316 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(I)V")
	private void method3234() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3870; local23++) {
			@Pc(30) int local30 = this.anIntArray314[local23];
			@Pc(35) int local35 = this.anIntArray315[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(67) int local67 = this.anIntArray313[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			if (local67 < local11) {
				local11 = local67;
			}
			if (local17 < local67) {
				local17 = local67;
			}
			@Pc(90) int local90 = local67 * local67 + local30 * local30;
			if (local90 > local19) {
				local19 = local90;
			}
			local90 = local67 * local67 + local30 * local30 + local35 * local35;
			if (local21 < local90) {
				local21 = local90;
			}
		}
		this.aShort51 = (short) local15;
		this.aShort57 = (short) local9;
		this.aShort60 = (short) local11;
		this.aShort58 = (short) local7;
		this.aShort52 = (short) local17;
		this.aShort53 = (short) local13;
		this.aShort59 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort54 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean283 = true;
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "()V")
	@Override
	protected void method6377() {
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!qja;)V")
	@Override
	public void method6373(@OriginalArg(0) Class26 arg0) {
		@Pc(8) Class26_Sub3 local8 = (Class26_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass136Array3 != null) {
			for (local13 = 0; local13 < this.aClass136Array3.length; local13++) {
				@Pc(20) Class136 local20 = this.aClass136Array3[local13];
				@Pc(22) Class136 local22 = local20;
				if (local20.aClass136_1 != null) {
					local22 = local20.aClass136_1;
				}
				local22.anInt3747 = (int) (local8.aFloat177 * (float) this.anIntArray315[local20.anInt3741] + (float) this.anIntArray314[local20.anInt3741] * local8.aFloat172 + local8.aFloat173 * (float) this.anIntArray313[local20.anInt3741] + local8.aFloat176);
				local22.anInt3738 = (int) ((float) this.anIntArray313[local20.anInt3741] * local8.aFloat174 + local8.aFloat182 * (float) this.anIntArray314[local20.anInt3741] + local8.aFloat180 * (float) this.anIntArray315[local20.anInt3741] + local8.aFloat178);
				local22.anInt3753 = (int) (local8.aFloat171 + (float) this.anIntArray314[local20.anInt3741] * local8.aFloat181 + (float) this.anIntArray315[local20.anInt3741] * local8.aFloat175 + (float) this.anIntArray313[local20.anInt3741] * local8.aFloat179);
				local22.anInt3746 = (int) (local8.aFloat176 + local8.aFloat173 * (float) this.anIntArray313[local20.anInt3739] + (float) this.anIntArray314[local20.anInt3739] * local8.aFloat172 + (float) this.anIntArray315[local20.anInt3739] * local8.aFloat177);
				local22.anInt3737 = (int) (local8.aFloat174 * (float) this.anIntArray313[local20.anInt3739] + local8.aFloat182 * (float) this.anIntArray314[local20.anInt3739] + local8.aFloat180 * (float) this.anIntArray315[local20.anInt3739] + local8.aFloat178);
				local22.anInt3749 = (int) (local8.aFloat175 * (float) this.anIntArray315[local20.anInt3739] + (float) this.anIntArray314[local20.anInt3739] * local8.aFloat181 + local8.aFloat179 * (float) this.anIntArray313[local20.anInt3739] + local8.aFloat171);
				local22.anInt3744 = (int) ((float) this.anIntArray313[local20.anInt3750] * local8.aFloat173 + (float) this.anIntArray315[local20.anInt3750] * local8.aFloat177 + (float) this.anIntArray314[local20.anInt3750] * local8.aFloat172 + local8.aFloat176);
				local22.anInt3743 = (int) (local8.aFloat182 * (float) this.anIntArray314[local20.anInt3750] + (float) this.anIntArray315[local20.anInt3750] * local8.aFloat180 + (float) this.anIntArray313[local20.anInt3750] * local8.aFloat174 + local8.aFloat178);
				local22.anInt3736 = (int) ((float) this.anIntArray313[local20.anInt3750] * local8.aFloat179 + local8.aFloat175 * (float) this.anIntArray315[local20.anInt3750] + (float) this.anIntArray314[local20.anInt3750] * local8.aFloat181 + local8.aFloat171);
			}
		}
		if (this.aClass265Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass265Array3.length; local13++) {
			@Pc(365) Class265 local365 = this.aClass265Array3[local13];
			@Pc(367) Class265 local367 = local365;
			if (local365.aClass265_1 != null) {
				local367 = local365.aClass265_1;
			}
			if (local365.aClass26_10 == null) {
				local365.aClass26_10 = local8.method6452();
			} else {
				local365.aClass26_10.method6447(local8);
			}
			local367.anInt7790 = (int) (local8.aFloat173 * (float) this.anIntArray313[local365.anInt7789] + (float) this.anIntArray315[local365.anInt7789] * local8.aFloat177 + local8.aFloat172 * (float) this.anIntArray314[local365.anInt7789] + local8.aFloat176);
			local367.anInt7791 = (int) (local8.aFloat178 + (float) this.anIntArray313[local365.anInt7789] * local8.aFloat174 + (float) this.anIntArray314[local365.anInt7789] * local8.aFloat182 + local8.aFloat180 * (float) this.anIntArray315[local365.anInt7789]);
			local367.anInt7792 = (int) (local8.aFloat171 + (float) this.anIntArray313[local365.anInt7789] * local8.aFloat179 + local8.aFloat181 * (float) this.anIntArray314[local365.anInt7789] + local8.aFloat175 * (float) this.anIntArray315[local365.anInt7789]);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6385(@OriginalArg(0) Class80 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class80_Sub2 local8 = (Class80_Sub2) arg0;
		if (this.anInt3887 == 0 || local8.anInt3887 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt3870;
		@Pc(27) int[] local27 = local8.anIntArray314;
		@Pc(30) int[] local30 = local8.anIntArray315;
		@Pc(33) int[] local33 = local8.anIntArray313;
		@Pc(36) short[] local36 = local8.aShortArray57;
		@Pc(39) short[] local39 = local8.aShortArray62;
		@Pc(42) short[] local42 = local8.aShortArray61;
		@Pc(45) byte[] local45 = local8.aByteArray49;
		@Pc(52) short[] local52;
		@Pc(50) short[] local50;
		@Pc(56) short[] local56;
		@Pc(54) byte[] local54;
		if (this.aClass10_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local54 = this.aClass10_1.aByteArray7;
			local56 = this.aClass10_1.aShortArray3;
			local50 = this.aClass10_1.aShortArray2;
			local52 = this.aClass10_1.aShortArray1;
		}
		@Pc(85) short[] local85;
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(81) byte[] local81;
		if (local8.aClass10_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local83 = local8.aClass10_1.aShortArray3;
			local79 = local8.aClass10_1.aShortArray2;
			local81 = local8.aClass10_1.aByteArray7;
			local85 = local8.aClass10_1.aShortArray1;
		}
		@Pc(106) int[] local106 = local8.anIntArray317;
		@Pc(109) short[] local109 = local8.aShortArray63;
		if (!local8.aBoolean283) {
			local8.method3234();
		}
		@Pc(118) short local118 = local8.aShort57;
		@Pc(121) short local121 = local8.aShort51;
		@Pc(124) short local124 = local8.aShort58;
		@Pc(127) short local127 = local8.aShort53;
		@Pc(130) short local130 = local8.aShort60;
		@Pc(133) short local133 = local8.aShort52;
		for (@Pc(135) int local135 = 0; local135 < this.anInt3870; local135++) {
			@Pc(145) int local145 = this.anIntArray315[local135] - arg2;
			if (local118 <= local145 && local145 <= local121) {
				@Pc(169) int local169 = this.anIntArray314[local135] - arg1;
				if (local124 <= local169 && local127 >= local169) {
					@Pc(184) int local184 = this.anIntArray313[local135] - arg3;
					if (local184 >= local130 && local184 <= local133) {
						@Pc(194) int local194 = -1;
						@Pc(199) int local199 = this.anIntArray317[local135];
						@Pc(206) int local206 = this.anIntArray317[local135 + 1];
						for (@Pc(208) int local208 = local199; local208 < local206; local208++) {
							local194 = this.aShortArray63[local208] - 1;
							if (local194 == -1 || this.aByteArray49[local194] != 0) {
								break;
							}
						}
						if (local194 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local24; local242++) {
								if (local27[local242] == local169 && local184 == local33[local242] && local30[local242] == local145) {
									@Pc(265) int local265 = -1;
									local206 = local106[local242 + 1];
									local199 = local106[local242];
									for (@Pc(277) int local277 = local199; local277 < local206; local277++) {
										local265 = local109[local277] - 1;
										if (local265 == -1 || local45[local265] != 0) {
											break;
										}
									}
									if (local265 != -1) {
										if (local52 == null) {
											this.aClass10_1 = new Class10();
											local52 = this.aClass10_1.aShortArray1 = Static9.method54(this.aShortArray57);
											local50 = this.aClass10_1.aShortArray2 = Static9.method54(this.aShortArray62);
											local56 = this.aClass10_1.aShortArray3 = Static9.method54(this.aShortArray61);
											local54 = this.aClass10_1.aByteArray7 = Static50.method1051(this.aByteArray49);
										}
										if (local85 == null) {
											@Pc(358) Class10 local358 = local8.aClass10_1 = new Class10();
											local85 = local358.aShortArray1 = Static9.method54(local36);
											local79 = local358.aShortArray2 = Static9.method54(local39);
											local83 = local358.aShortArray3 = Static9.method54(local42);
											local81 = local358.aByteArray7 = Static50.method1051(local45);
										}
										@Pc(391) short local391 = this.aShortArray57[local194];
										@Pc(396) short local396 = this.aShortArray62[local194];
										@Pc(401) short local401 = this.aShortArray61[local194];
										local199 = local106[local242];
										local206 = local106[local242 + 1];
										@Pc(416) byte local416 = this.aByteArray49[local194];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local199; local418 < local206; local418++) {
											local426 = local109[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local81[local426] != 0) {
												local85[local426] += local391;
												local79[local426] += local396;
												local83[local426] += local401;
												local81[local426] += local416;
											}
										}
										local401 = local42[local265];
										local391 = local36[local265];
										local199 = this.anIntArray317[local135];
										local416 = local45[local265];
										local396 = local39[local265];
										local206 = this.anIntArray317[local135 + 1];
										for (local426 = local199; local426 < local206; local426++) {
											@Pc(511) int local511 = this.aShortArray63[local426] - 1;
											if (local511 == -1) {
												break;
											}
											if (local54[local511] != 0) {
												local52[local511] += local391;
												local50[local511] += local396;
												local56[local511] += local401;
												local54[local511] += local416;
											}
										}
										if (this.aClass91_1 == null && this.aClass91_3 != null) {
											this.aClass91_3.anInterface8_1 = null;
										}
										if (this.aClass91_1 != null) {
											this.aClass91_1.anInterface8_1 = null;
										}
										if (local8.aClass91_1 == null && local8.aClass91_3 != null) {
											local8.aClass91_3.anInterface8_1 = null;
										}
										if (local8.aClass91_1 != null) {
											local8.aClass91_1.anInterface8_1 = null;
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

	@OriginalMember(owner = "client!hba", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt3827;
	}

	@OriginalMember(owner = "client!hba", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort53;
	}

	@OriginalMember(owner = "client!hba", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class14_Sub3_Sub14 ba(@OriginalArg(0) Class14_Sub3_Sub14 arg0) {
		if (this.anInt3841 == 0) {
			return null;
		}
		if (!this.aBoolean283) {
			this.method3234();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass137_Sub3_13.anInt8585 > 0) {
			local43 = this.aShort58 - (this.aClass137_Sub3_13.anInt8585 * this.aShort51 >> 8) >> this.aClass137_Sub3_13.anInt8545;
			local59 = this.aShort53 - (this.aClass137_Sub3_13.anInt8585 * this.aShort57 >> 8) >> this.aClass137_Sub3_13.anInt8545;
		} else {
			local43 = this.aShort58 - (this.aShort57 * this.aClass137_Sub3_13.anInt8585 >> 8) >> this.aClass137_Sub3_13.anInt8545;
			local59 = this.aShort53 - (this.aClass137_Sub3_13.anInt8585 * this.aShort51 >> 8) >> this.aClass137_Sub3_13.anInt8545;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass137_Sub3_13.anInt8564 > 0) {
			local116 = this.aShort60 - (this.aClass137_Sub3_13.anInt8564 * this.aShort51 >> 8) >> this.aClass137_Sub3_13.anInt8545;
			local133 = this.aShort52 - (this.aShort57 * this.aClass137_Sub3_13.anInt8564 >> 8) >> this.aClass137_Sub3_13.anInt8545;
		} else {
			local116 = this.aShort60 - (this.aClass137_Sub3_13.anInt8564 * this.aShort57 >> 8) >> this.aClass137_Sub3_13.anInt8545;
			local133 = this.aShort52 - (this.aShort51 * this.aClass137_Sub3_13.anInt8564 >> 8) >> this.aClass137_Sub3_13.anInt8545;
		}
		@Pc(176) int local176 = local59 + 1 - local43;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class14_Sub3_Sub14_Sub2 local186 = (Class14_Sub3_Sub14_Sub2) arg0;
		@Pc(196) Class14_Sub3_Sub14_Sub2 local196;
		if (local186 != null && local186.method8719(local183, local176)) {
			local196 = local186;
			local186.method8716();
		} else {
			local196 = new Class14_Sub3_Sub14_Sub2(this.aClass137_Sub3_13, local176, local183);
		}
		local196.method8718(local133, local43, local116, local59);
		this.method3237(local196);
		return local196;
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "(I)V")
	private void method3235() {
		if (this.aClass391Array1 == null) {
			return;
		}
		@Pc(12) Class26_Sub3 local12 = this.aClass137_Sub3_13.aClass26_Sub3_2;
		this.aClass137_Sub3_13.method7105();
		this.aClass137_Sub3_13.C(!this.aBoolean285);
		this.aClass137_Sub3_13.method7038(false);
		this.aClass137_Sub3_13.method7036((Class91) null, this.aClass137_Sub3_13.aClass91_9, this.aClass137_Sub3_13.aClass91_8, (Class91) null);
		for (@Pc(46) int local46 = 0; local46 < this.anInt3854; local46++) {
			@Pc(53) Class391 local53 = this.aClass391Array1[local46];
			@Pc(58) Class301 local58 = this.aClass301Array1[local46];
			if (!local53.aBoolean762 || !this.aClass137_Sub3_13.method7880()) {
				@Pc(86) float local86 = (float) (this.anIntArray314[local53.anInt11145] + this.anIntArray314[local53.anInt11147] + this.anIntArray314[local53.anInt11143]) * 0.3333333F;
				@Pc(108) float local108 = (float) (this.anIntArray315[local53.anInt11143] + this.anIntArray315[local53.anInt11147] + this.anIntArray315[local53.anInt11145]) * 0.3333333F;
				@Pc(131) float local131 = (float) (this.anIntArray313[local53.anInt11143] + this.anIntArray313[local53.anInt11147] + this.anIntArray313[local53.anInt11145]) * 0.3333333F;
				@Pc(145) float local145 = Static611.aFloat258 * local131 + Static283.aFloat102 * local108 + local86 * Static321.aFloat146 + Static146.aFloat63;
				@Pc(159) float local159 = Static15.aFloat6 + Static247.aFloat97 * local131 + Static133.aFloat59 * local108 + local86 * Static635.aFloat261;
				@Pc(173) float local173 = Static445.aFloat147 + local108 * Static647.aFloat265 + local86 * Static205.aFloat78 + local131 * Static653.aFloat266;
				@Pc(194) float local194 = (float) (1.0D / Math.sqrt((double) (local159 * local159 + local145 * local145 + local173 * local173))) * (float) local53.anInt11149;
				local12.method6465(local58.anInt8992 * local53.aShort124 >> 7, local145 + (float) local58.anInt8985 - local194 * local145, -local173 + local194 * local173, local159 * local194 + (float) local58.anInt8991 - local159, local58.anInt8987, local58.anInt8989 * local53.aShort123 >> 7);
				this.aClass137_Sub3_13.method7026(local12);
				@Pc(248) int local248 = local58.anInt8993;
				OpenGL.glColor4ub((byte) (local248 >> 16), (byte) (local248 >> 8), (byte) local248, (byte) (local248 >> 24));
				this.aClass137_Sub3_13.method7029(local53.aShort122);
				this.aClass137_Sub3_13.method7082(local53.aByte149);
				this.aClass137_Sub3_13.method7057(4);
			}
		}
		this.aClass137_Sub3_13.C(true);
		this.aClass137_Sub3_13.method7047();
	}

	@OriginalMember(owner = "client!hba", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean282;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "()Z")
	@Override
	public boolean method6371() {
		if (this.aShortArray60 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray60.length; local12++) {
			if (this.aShortArray60[local12] != -1 && !this.aClass137_Sub3_13.anInterface3_11.method6181(this.aShortArray60[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hba", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3870; local15++) {
			@Pc(33) int local33 = this.anIntArray314[local15] * local13 + local9 * this.anIntArray315[local15] >> 14;
			this.anIntArray315[local15] = this.anIntArray315[local15] * local13 - this.anIntArray314[local15] * local9 >> 14;
			this.anIntArray314[local15] = local33;
		}
		this.aBoolean283 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort54;
	}

	@OriginalMember(owner = "client!hba", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static28.anInt703 = 0;
			Static296.anInt6295 = 0;
			local13 = 0;
			Static208.anInt3938 = 0;
			for (local17 = 0; local17 < this.anInt3870; local17++) {
				Static208.anInt3938 += this.anIntArray314[local17];
				Static28.anInt703 += this.anIntArray315[local17];
				Static296.anInt6295 += this.anIntArray313[local17];
				local13++;
			}
			if (local13 <= 0) {
				Static28.anInt703 = arg2;
				Static296.anInt6295 = arg3;
				Static208.anInt3938 = arg1;
			} else {
				Static296.anInt6295 = arg3 + Static296.anInt6295 / local13;
				Static208.anInt3938 = Static208.anInt3938 / local13 + arg1;
				Static28.anInt703 = Static28.anInt703 / local13 + arg2;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt3870; local13++) {
				this.anIntArray314[local13] += arg1;
				this.anIntArray315[local13] += arg2;
				this.anIntArray313[local13] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(186) int local186;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt3870; local13++) {
					this.anIntArray314[local13] -= Static208.anInt3938;
					this.anIntArray315[local13] -= Static28.anInt703;
					this.anIntArray313[local13] -= Static296.anInt6295;
					if (arg3 != 0) {
						local17 = Class32.anIntArray76[arg3];
						local168 = Class32.anIntArray77[arg3];
						local186 = local168 * this.anIntArray314[local13] + local17 * this.anIntArray315[local13] + 16383 >> 14;
						this.anIntArray315[local13] = this.anIntArray315[local13] * local168 + 16383 - this.anIntArray314[local13] * local17 >> 14;
						this.anIntArray314[local13] = local186;
					}
					if (arg1 != 0) {
						local17 = Class32.anIntArray76[arg1];
						local168 = Class32.anIntArray77[arg1];
						local186 = this.anIntArray315[local13] * local168 + 16383 - this.anIntArray313[local13] * local17 >> 14;
						this.anIntArray313[local13] = this.anIntArray313[local13] * local168 + this.anIntArray315[local13] * local17 + 16383 >> 14;
						this.anIntArray315[local13] = local186;
					}
					if (arg2 != 0) {
						local17 = Class32.anIntArray76[arg2];
						local168 = Class32.anIntArray77[arg2];
						local186 = this.anIntArray314[local13] * local168 + this.anIntArray313[local13] * local17 + 16383 >> 14;
						this.anIntArray313[local13] = this.anIntArray313[local13] * local168 + 16383 - local17 * this.anIntArray314[local13] >> 14;
						this.anIntArray314[local13] = local186;
					}
					this.anIntArray314[local13] += Static208.anInt3938;
					this.anIntArray315[local13] += Static28.anInt703;
					this.anIntArray313[local13] += Static296.anInt6295;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt3870; local13++) {
					this.anIntArray314[local13] -= Static208.anInt3938;
					this.anIntArray315[local13] -= Static28.anInt703;
					this.anIntArray313[local13] -= Static296.anInt6295;
					this.anIntArray314[local13] = this.anIntArray314[local13] * arg1 / 128;
					this.anIntArray315[local13] = this.anIntArray315[local13] * arg2 / 128;
					this.anIntArray313[local13] = this.anIntArray313[local13] * arg3 / 128;
					this.anIntArray314[local13] += Static208.anInt3938;
					this.anIntArray315[local13] += Static28.anInt703;
					this.anIntArray313[local13] += Static296.anInt6295;
				}
			} else {
				@Pc(524) Class391 local524;
				@Pc(529) Class301 local529;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt3887; local13++) {
						local17 = (this.aByteArray50[local13] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray50[local13] = (byte) local17;
					}
					if (this.aClass91_3 != null) {
						this.aClass91_3.anInterface8_1 = null;
					}
					if (this.aClass391Array1 != null) {
						for (local17 = 0; local17 < this.anInt3854; local17++) {
							local524 = this.aClass391Array1[local17];
							local529 = this.aClass301Array1[local17];
							local529.anInt8993 = 255 - (this.aByteArray50[local524.anInt11146] & 0xFF) << 24 | local529.anInt8993 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt3887; local13++) {
						local17 = this.aShortArray58[local13] & 0xFFFF;
						local168 = local17 >> 10 & 0x3F;
						local186 = local17 >> 7 & 0x7;
						@Pc(586) int local586 = local168 + arg1 & 0x3F;
						local186 += arg2 / 4;
						@Pc(596) int local596 = local17 & 0x7F;
						if (local186 < 0) {
							local186 = 0;
						} else if (local186 > 7) {
							local186 = 7;
						}
						local596 += arg3;
						if (local596 < 0) {
							local596 = 0;
						} else if (local596 > 127) {
							local596 = 127;
						}
						this.aShortArray58[local13] = (short) (local186 << 7 | local586 << 10 | local596);
					}
					if (this.aClass91_3 != null) {
						this.aClass91_3.anInterface8_1 = null;
					}
					if (this.aClass391Array1 != null) {
						for (local17 = 0; local17 < this.anInt3854; local17++) {
							local524 = this.aClass391Array1[local17];
							local529 = this.aClass301Array1[local17];
							local529.anInt8993 = Static659.anIntArray816[this.aShortArray58[local524.anInt11146] & 0xFFFF] & 0xFFFFFF | local529.anInt8993 & 0xFF000000;
						}
					}
				} else {
					@Pc(711) Class301 local711;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt3854; local13++) {
							local711 = this.aClass301Array1[local13];
							local711.anInt8985 += arg1;
							local711.anInt8991 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt3854; local13++) {
							local711 = this.aClass301Array1[local13];
							local711.anInt8989 = arg2 * local711.anInt8989 >> 7;
							local711.anInt8992 = arg1 * local711.anInt8992 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt3854; local13++) {
							local711 = this.aClass301Array1[local13];
							local711.anInt8987 = arg1 + local711.anInt8987 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IILclient!qja;ZII)Z")
	@Override
	public boolean method6386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3244(arg1, arg3, arg0, arg2, arg5, arg4);
	}

	@OriginalMember(owner = "client!hba", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3870; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray315[local15] - local9 * this.anIntArray313[local15] >> 14;
			this.anIntArray313[local15] = local9 * this.anIntArray315[local15] + this.anIntArray313[local15] * local13 >> 14;
			this.anIntArray315[local15] = local33;
		}
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
		this.aBoolean283 = false;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3236(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg1 > arg0 && arg6 > arg0 && arg0 < arg7) {
			return false;
		} else if (arg1 < arg0 && arg6 < arg0 && arg7 < arg0) {
			return false;
		} else if (arg3 < arg2 && arg5 > arg3 && arg4 > arg3) {
			return false;
		} else {
			return arg3 <= arg2 || arg5 >= arg3 || arg4 >= arg3;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!vba;I)V")
	private void method3237(@OriginalArg(0) Class14_Sub3_Sub14_Sub2 arg0) {
		if (this.aClass137_Sub3_13.anIntArray632.length < this.anInt3841) {
			this.aClass137_Sub3_13.anIntArray633 = new int[this.anInt3841];
			this.aClass137_Sub3_13.anIntArray632 = new int[this.anInt3841];
		}
		@Pc(36) int[] local36 = this.aClass137_Sub3_13.anIntArray632;
		@Pc(40) int[] local40 = this.aClass137_Sub3_13.anIntArray633;
		@Pc(68) int local68;
		@Pc(106) int local106;
		@Pc(115) int local115;
		for (@Pc(42) int local42 = 0; local42 < this.anInt3870; local42++) {
			local68 = (this.anIntArray314[local42] - (this.aClass137_Sub3_13.anInt8585 * this.anIntArray315[local42] >> 8) >> this.aClass137_Sub3_13.anInt8545) - arg0.anInt10449;
			@Pc(92) int local92 = (this.anIntArray313[local42] - (this.anIntArray315[local42] * this.aClass137_Sub3_13.anInt8564 >> 8) >> this.aClass137_Sub3_13.anInt8545) - arg0.anInt10448;
			@Pc(97) int local97 = this.anIntArray317[local42];
			@Pc(104) int local104 = this.anIntArray317[local42 + 1];
			for (local106 = local97; local106 < local104; local106++) {
				local115 = this.aShortArray63[local106] - 1;
				if (local115 == -1) {
					break;
				}
				local36[local115] = local68;
				local40[local115] = local92;
			}
		}
		for (local68 = 0; local68 < this.anInt3882; local68++) {
			if (this.aByteArray50 == null || this.aByteArray50[local68] <= 128) {
				@Pc(158) short local158 = this.aShortArray65[local68];
				@Pc(163) short local163 = this.aShortArray64[local68];
				@Pc(168) short local168 = this.aShortArray59[local68];
				local106 = local36[local158];
				local115 = local36[local163];
				@Pc(180) int local180 = local36[local168];
				@Pc(184) int local184 = local40[local158];
				@Pc(188) int local188 = local40[local163];
				@Pc(192) int local192 = local40[local168];
				if (-((local188 - local184) * (local180 - local115)) + (local106 - local115) * (-local192 + local188) > 0) {
					arg0.method8717(local106, local184, local180, local192, local188, local115);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass137_Sub3_13.anInterface3_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3887; local11++) {
			if (arg0 == this.aShortArray60[local11]) {
				this.aShortArray60[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class224 local52 = local9.method6177(arg0 & 0xFFFF);
			local41 = local52.aByte99;
			local39 = local52.aByte100;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(73) Class224 local73 = local9.method6177(arg1 & 0xFFFF);
			if (local73.aByte98 != 0 || local73.aByte97 != 0) {
				this.aBoolean282 = true;
			}
			local62 = local73.aByte99;
			local60 = local73.aByte100;
		}
		if (!(local39 != local60 | local62 != local41)) {
			return;
		}
		if (this.aClass391Array1 != null) {
			for (@Pc(115) int local115 = 0; local115 < this.anInt3854; local115++) {
				@Pc(122) Class391 local122 = this.aClass391Array1[local115];
				@Pc(127) Class301 local127 = this.aClass301Array1[local115];
				local127.anInt8993 = local127.anInt8993 & 0xFF000000 | Static659.anIntArray816[this.aShortArray58[local122.anInt11146] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6384(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local27 = 0;
			Static208.anInt3938 = 0;
			Static28.anInt703 = 0;
			Static296.anInt6295 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray26.length > local41) {
					local51 = this.anIntArrayArray26[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static208.anInt3938 += this.anIntArray314[local59];
						Static28.anInt703 += this.anIntArray315[local59];
						local27++;
						Static296.anInt6295 += this.anIntArray313[local59];
					}
				}
			}
			if (local27 > 0) {
				Static208.anInt3938 = Static208.anInt3938 / local27 + local25;
				Static28.anInt703 = local17 + Static28.anInt703 / local27;
				Static296.anInt6295 = Static296.anInt6295 / local27 + local21;
			} else {
				Static28.anInt703 = local17;
				Static208.anInt3938 = local25;
				Static296.anInt6295 = local21;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local25 = arg2 << 4;
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray26.length) {
					local159 = this.anIntArrayArray26[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local53 = local159[local161];
						this.anIntArray314[local53] += local25;
						this.anIntArray315[local53] += local17;
						this.anIntArray313[local53] += local21;
					}
				}
			}
			return;
		}
		@Pc(271) int local271;
		@Pc(290) int local290;
		@Pc(741) int local741;
		if (arg0 == 2) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray26.length) {
					local159 = this.anIntArrayArray26[local35];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							this.anIntArray314[local53] -= Static208.anInt3938;
							this.anIntArray315[local53] -= Static28.anInt703;
							this.anIntArray313[local53] -= Static296.anInt6295;
							if (arg4 != 0) {
								local59 = Class32.anIntArray76[arg4];
								local271 = Class32.anIntArray77[arg4];
								local290 = this.anIntArray315[local53] * local59 + this.anIntArray314[local53] * local271 + 16383 >> 14;
								this.anIntArray315[local53] = this.anIntArray315[local53] * local271 + 16383 - this.anIntArray314[local53] * local59 >> 14;
								this.anIntArray314[local53] = local290;
							}
							if (arg2 != 0) {
								local59 = Class32.anIntArray76[arg2];
								local271 = Class32.anIntArray77[arg2];
								local290 = local271 * this.anIntArray315[local53] + 16383 - this.anIntArray313[local53] * local59 >> 14;
								this.anIntArray313[local53] = local59 * this.anIntArray315[local53] + this.anIntArray313[local53] * local271 + 16383 >> 14;
								this.anIntArray315[local53] = local290;
							}
							if (arg3 != 0) {
								local59 = Class32.anIntArray76[arg3];
								local271 = Class32.anIntArray77[arg3];
								local290 = local59 * this.anIntArray313[local53] + local271 * this.anIntArray314[local53] + 16383 >> 14;
								this.anIntArray313[local53] = this.anIntArray313[local53] * local271 + 16383 - this.anIntArray314[local53] * local59 >> 14;
								this.anIntArray314[local53] = local290;
							}
							this.anIntArray314[local53] += Static208.anInt3938;
							this.anIntArray315[local53] += Static28.anInt703;
							this.anIntArray313[local53] += Static296.anInt6295;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							this.anIntArray314[local53] -= Static208.anInt3938;
							this.anIntArray315[local53] -= Static28.anInt703;
							this.anIntArray313[local53] -= Static296.anInt6295;
							if (arg2 != 0) {
								local59 = Class32.anIntArray76[arg2];
								local271 = Class32.anIntArray77[arg2];
								local290 = local271 * this.anIntArray315[local53] + 16383 - local59 * this.anIntArray313[local53] >> 14;
								this.anIntArray313[local53] = this.anIntArray315[local53] * local59 + local271 * this.anIntArray313[local53] + 16383 >> 14;
								this.anIntArray315[local53] = local290;
							}
							if (arg4 != 0) {
								local59 = Class32.anIntArray76[arg4];
								local271 = Class32.anIntArray77[arg4];
								local290 = local271 * this.anIntArray314[local53] + local59 * this.anIntArray315[local53] + 16383 >> 14;
								this.anIntArray315[local53] = this.anIntArray315[local53] * local271 + 16383 - local59 * this.anIntArray314[local53] >> 14;
								this.anIntArray314[local53] = local290;
							}
							if (arg3 != 0) {
								local59 = Class32.anIntArray76[arg3];
								local271 = Class32.anIntArray77[arg3];
								local290 = local271 * this.anIntArray314[local53] + local59 * this.anIntArray313[local53] + 16383 >> 14;
								this.anIntArray313[local53] = this.anIntArray313[local53] * local271 + 16383 - local59 * this.anIntArray314[local53] >> 14;
								this.anIntArray314[local53] = local290;
							}
							this.anIntArray314[local53] += Static208.anInt3938;
							this.anIntArray315[local53] += Static28.anInt703;
							this.anIntArray313[local53] += Static296.anInt6295;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray26.length > local41) {
						local51 = this.anIntArrayArray26[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local271 = this.anIntArray317[local59];
							local290 = this.anIntArray317[local59 + 1];
							for (local741 = local271; local741 < local290; local741++) {
								@Pc(750) int local750 = this.aShortArray63[local741] - 1;
								if (local750 == -1) {
									break;
								}
								@Pc(762) int local762;
								@Pc(766) int local766;
								@Pc(785) int local785;
								if (arg4 != 0) {
									local762 = Class32.anIntArray76[arg4];
									local766 = Class32.anIntArray77[arg4];
									local785 = local762 * this.aShortArray62[local750] + this.aShortArray57[local750] * local766 + 16383 >> 14;
									this.aShortArray62[local750] = (short) (local766 * this.aShortArray62[local750] + 16383 - this.aShortArray57[local750] * local762 >> 14);
									this.aShortArray57[local750] = (short) local785;
								}
								if (arg2 != 0) {
									local762 = Class32.anIntArray76[arg2];
									local766 = Class32.anIntArray77[arg2];
									local785 = local766 * this.aShortArray62[local750] + 16383 - this.aShortArray61[local750] * local762 >> 14;
									this.aShortArray61[local750] = (short) (this.aShortArray62[local750] * local762 + local766 * this.aShortArray61[local750] + 16383 >> 14);
									this.aShortArray62[local750] = (short) local785;
								}
								if (arg3 != 0) {
									local762 = Class32.anIntArray76[arg3];
									local766 = Class32.anIntArray77[arg3];
									local785 = this.aShortArray57[local750] * local766 + local762 * this.aShortArray61[local750] + 16383 >> 14;
									this.aShortArray61[local750] = (short) (this.aShortArray61[local750] * local766 + 16383 - local762 * this.aShortArray57[local750] >> 14);
									this.aShortArray57[local750] = (short) local785;
								}
							}
						}
					}
				}
				if (this.aClass91_1 == null && this.aClass91_3 != null) {
					this.aClass91_3.anInterface8_1 = null;
				}
				if (this.aClass91_1 != null) {
					this.aClass91_1.anInterface8_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray26.length) {
					local159 = this.anIntArrayArray26[local35];
					for (local161 = 0; local161 < local159.length; local161++) {
						local53 = local159[local161];
						this.anIntArray314[local53] -= Static208.anInt3938;
						this.anIntArray315[local53] -= Static28.anInt703;
						this.anIntArray313[local53] -= Static296.anInt6295;
						this.anIntArray314[local53] = this.anIntArray314[local53] * arg2 >> 7;
						this.anIntArray315[local53] = this.anIntArray315[local53] * arg3 >> 7;
						this.anIntArray313[local53] = arg4 * this.anIntArray313[local53] >> 7;
						this.anIntArray314[local53] += Static208.anInt3938;
						this.anIntArray315[local53] += Static28.anInt703;
						this.anIntArray313[local53] += Static296.anInt6295;
					}
				}
			}
		} else {
			@Pc(1208) Class391 local1208;
			@Pc(1213) Class301 local1213;
			if (arg0 == 5) {
				if (this.anIntArrayArray28 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray28.length > local35) {
							local159 = this.anIntArrayArray28[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local53 = local159[local161];
								local59 = (this.aByteArray50[local53] & 0xFF) + (arg2 * 8);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray50[local53] = (byte) local59;
							}
							if (local159.length > 0 && this.aClass91_3 != null) {
								this.aClass91_3.anInterface8_1 = null;
							}
						}
					}
					if (this.aClass391Array1 != null) {
						for (local35 = 0; local35 < this.anInt3854; local35++) {
							local1208 = this.aClass391Array1[local35];
							local1213 = this.aClass301Array1[local35];
							local1213.anInt8993 = 255 - (this.aByteArray50[local1208.anInt11146] & 0xFF) << 24 | local1213.anInt8993 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1457) Class301 local1457;
				if (arg0 == 8) {
					if (this.anIntArrayArray27 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray27.length > local35) {
								local159 = this.anIntArrayArray27[local35];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1457 = this.aClass301Array1[local159[local161]];
									local1457.anInt8991 += arg3;
									local1457.anInt8985 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray27 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray27.length > local35) {
								local159 = this.anIntArrayArray27[local35];
								for (local161 = 0; local161 < local159.length; local161++) {
									local1457 = this.aClass301Array1[local159[local161]];
									local1457.anInt8989 = local1457.anInt8989 * arg3 >> 7;
									local1457.anInt8992 = arg2 * local1457.anInt8992 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray27 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray27.length > local35) {
							local159 = this.anIntArrayArray27[local35];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1457 = this.aClass301Array1[local159[local161]];
								local1457.anInt8987 = local1457.anInt8987 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray28 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray28.length > local35) {
						local159 = this.anIntArrayArray28[local35];
						for (local161 = 0; local161 < local159.length; local161++) {
							local53 = local159[local161];
							local59 = this.aShortArray58[local53] & 0xFFFF;
							local271 = local59 >> 10 & 0x3F;
							local290 = local59 >> 7 & 0x7;
							local290 += arg3 / 4;
							local741 = local59 & 0x7F;
							@Pc(1311) int local1311 = arg2 + local271 & 0x3F;
							if (local290 < 0) {
								local290 = 0;
							} else if (local290 > 7) {
								local290 = 7;
							}
							local741 += arg4;
							if (local741 < 0) {
								local741 = 0;
							} else if (local741 > 127) {
								local741 = 127;
							}
							this.aShortArray58[local53] = (short) (local290 << 7 | local1311 << 10 | local741);
						}
						if (local159.length > 0 && this.aClass91_3 != null) {
							this.aClass91_3.anInterface8_1 = null;
						}
					}
				}
				if (this.aClass391Array1 != null) {
					for (local35 = 0; local35 < this.anInt3854; local35++) {
						local1208 = this.aClass391Array1[local35];
						local1213 = this.aClass301Array1[local35];
						local1213.anInt8993 = Static659.anIntArray816[this.aShortArray58[local1208.anInt11146] & 0xFFFF] & 0xFFFFFF | local1213.anInt8993 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IFIIFIIIJLclient!dba;)S")
	private short method3238(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) long arg7, @OriginalArg(9) Class67 arg8) {
		@Pc(10) int local10 = this.anIntArray317[arg6];
		@Pc(17) int local17 = this.anIntArray317[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray63[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static531.aLongArray19[local21] == arg7) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray63[local19] = (short) (this.anInt3841 + 1);
		Static531.aLongArray19[local19] = arg7;
		this.aShortArray57[this.anInt3841] = (short) arg3;
		this.aShortArray62[this.anInt3841] = (short) arg2;
		this.aShortArray61[this.anInt3841] = (short) arg0;
		this.aByteArray49[this.anInt3841] = (byte) arg5;
		this.aFloatArray25[this.anInt3841] = arg4;
		this.aFloatArray24[this.anInt3841] = arg1;
		return (short) this.anInt3841++;
	}

	@OriginalMember(owner = "client!hba", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3870; local7++) {
			if (arg0 != 128) {
				this.anIntArray314[local7] = this.anIntArray314[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray315[local7] = this.anIntArray315[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray313[local7] = this.anIntArray313[local7] * arg2 >> 7;
			}
		}
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
		this.aBoolean283 = false;
	}

	@OriginalMember(owner = "client!hba", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
		}
		this.aShort55 = (short) arg0;
		if (this.aClass91_1 != null) {
			this.aClass91_1.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BZ)V")
	private void method3239(@OriginalArg(1) boolean arg0) {
		@Pc(20) boolean local20 = this.aClass91_3 != null && this.aClass91_3.anInterface8_1 == null;
		@Pc(31) boolean local31 = this.aClass91_1 != null && this.aClass91_1.anInterface8_1 == null;
		@Pc(42) boolean local42 = this.aClass91_4 != null && this.aClass91_4.anInterface8_1 == null;
		@Pc(53) boolean local53 = this.aClass91_2 != null && this.aClass91_2.anInterface8_1 == null;
		if (arg0) {
			local53 &= (this.aByte76 & 0x8) != 0;
			local20 &= (this.aByte76 & 0x2) != 0;
			local42 &= (this.aByte76 & 0x1) != 0;
			local31 &= (this.aByte76 & 0x4) != 0;
		}
		@Pc(107) byte local107 = 0;
		@Pc(111) byte local111 = 0;
		@Pc(113) byte local113 = 0;
		if (local42) {
			local107 = 12;
		}
		@Pc(124) byte local124 = 0;
		if (local20) {
			local111 = local107;
			local107 = (byte) (local107 + 4);
		}
		if (local31) {
			local113 = local107;
			local107 = (byte) (local107 + 12);
		}
		if (local53) {
			local124 = local107;
			local107 = (byte) (local107 + 8);
		}
		if (local107 == 0) {
			return;
		}
		if (this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2.aByteArray84.length >= local107 * this.anInt3841) {
			this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2.anInt7264 = 0;
		} else {
			this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2 = new Class14_Sub29_Sub2((this.anInt3841 + 100) * local107);
		}
		@Pc(190) Class14_Sub29_Sub2 local190 = this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2;
		@Pc(198) int local198;
		@Pc(207) int local207;
		@Pc(235) int local235;
		@Pc(244) int local244;
		if (local42) {
			@Pc(214) int local214;
			@Pc(221) int local221;
			@Pc(226) int local226;
			@Pc(233) int local233;
			if (this.aClass137_Sub3_13.aBoolean594) {
				for (local198 = 0; local198 < this.anInt3870; local198++) {
					local207 = Stream.floatToRawIntBits((float) this.anIntArray314[local198]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray315[local198]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray313[local198]);
					local226 = this.anIntArray317[local198];
					local233 = this.anIntArray317[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray63[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt7264 = local107 * local244;
						local190.method5861(local207);
						local190.method5861(local214);
						local190.method5861(local221);
					}
				}
			} else {
				for (local198 = 0; local198 < this.anInt3870; local198++) {
					local207 = Stream.floatToRawIntBits((float) this.anIntArray314[local198]);
					local214 = Stream.floatToRawIntBits((float) this.anIntArray315[local198]);
					local221 = Stream.floatToRawIntBits((float) this.anIntArray313[local198]);
					local226 = this.anIntArray317[local198];
					local233 = this.anIntArray317[local198 + 1];
					for (local235 = local226; local235 < local233; local235++) {
						local244 = this.aShortArray63[local235] - 1;
						if (local244 == -1) {
							break;
						}
						local190.anInt7264 = local244 * local107;
						local190.method5879(local207);
						local190.method5879(local214);
						local190.method5879(local221);
					}
				}
			}
		}
		@Pc(499) float local499;
		@Pc(377) short[] local377;
		@Pc(381) short[] local381;
		@Pc(385) short[] local385;
		@Pc(373) byte[] local373;
		@Pc(532) float local532;
		if (local20) {
			if (this.aClass91_1 == null) {
				if (this.aClass10_1 == null) {
					local385 = this.aShortArray61;
					local381 = this.aShortArray62;
					local373 = this.aByteArray49;
					local377 = this.aShortArray57;
				} else {
					local373 = this.aClass10_1.aByteArray7;
					local377 = this.aClass10_1.aShortArray1;
					local381 = this.aClass10_1.aShortArray2;
					local385 = this.aClass10_1.aShortArray3;
				}
				@Pc(405) float local405 = this.aClass137_Sub3_13.aFloatArray65[0];
				@Pc(411) float local411 = this.aClass137_Sub3_13.aFloatArray65[1];
				@Pc(417) float local417 = this.aClass137_Sub3_13.aFloatArray65[2];
				@Pc(421) float local421 = this.aClass137_Sub3_13.aFloat206;
				@Pc(431) float local431 = this.aClass137_Sub3_13.aFloat207 * 768.0F / (float) this.aShort55;
				@Pc(441) float local441 = this.aClass137_Sub3_13.aFloat204 * 768.0F / (float) this.aShort55;
				for (@Pc(443) int local443 = 0; local443 < this.anInt3887; local443++) {
					@Pc(463) int local463 = this.method3242(this.aByteArray50[local443], this.aShortArray58[local443], this.aShort56, this.aShortArray60[local443]);
					@Pc(472) float local472 = (float) (local463 >>> 24) * this.aClass137_Sub3_13.aFloat205;
					@Pc(477) short local477 = this.aShortArray65[local443];
					@Pc(488) float local488 = this.aClass137_Sub3_13.aFloat191 * (float) (local463 >> 8 & 0xFF);
					local499 = (float) (local463 >> 16 & 0xFF) * this.aClass137_Sub3_13.aFloat210;
					@Pc(504) short local504 = (short) local373[local477];
					if (local504 == 0) {
						local532 = ((float) local385[local477] * local417 + local405 * (float) local377[local477] + local411 * (float) local381[local477]) * 0.0026041667F;
					} else {
						local532 = (local411 * (float) local381[local477] + (float) local377[local477] * local405 + (float) local385[local477] * local417) / (float) (local504 * 256);
					}
					@Pc(572) float local572 = local421 + local532 * (local532 < 0.0F ? local441 : local431);
					@Pc(577) int local577 = (int) (local472 * local572);
					if (local577 < 0) {
						local577 = 0;
					} else if (local577 > 255) {
						local577 = 255;
					}
					@Pc(598) int local598 = (int) (local499 * local572);
					@Pc(603) int local603 = (int) (local488 * local572);
					if (local598 < 0) {
						local598 = 0;
					} else if (local598 > 255) {
						local598 = 255;
					}
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local190.anInt7264 = local111 + local477 * local107;
					local190.method5854(local577);
					local190.method5854(local598);
					local190.method5854(local603);
					local190.method5854(255 - (this.aByteArray50[local443] & 0xFF));
					local477 = this.aShortArray64[local443];
					local504 = (short) local373[local477];
					if (local504 == 0) {
						local532 = ((float) local385[local477] * local417 + (float) local377[local477] * local405 + local411 * (float) local381[local477]) * 0.0026041667F;
					} else {
						local532 = (local405 * (float) local377[local477] + local411 * (float) local381[local477] + (float) local385[local477] * local417) / (float) (local504 * 256);
					}
					local572 = (local532 < 0.0F ? local441 : local431) * local532 + local421;
					local577 = (int) (local472 * local572);
					local598 = (int) (local499 * local572);
					if (local577 < 0) {
						local577 = 0;
					} else if (local577 > 255) {
						local577 = 255;
					}
					if (local598 < 0) {
						local598 = 0;
					} else if (local598 > 255) {
						local598 = 255;
					}
					local603 = (int) (local488 * local572);
					local190.anInt7264 = local111 + local107 * local477;
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local190.method5854(local577);
					local190.method5854(local598);
					local190.method5854(local603);
					local190.method5854(255 - (this.aByteArray50[local443] & 0xFF));
					local477 = this.aShortArray59[local443];
					local504 = (short) local373[local477];
					if (local504 == 0) {
						local532 = ((float) local385[local477] * local417 + local405 * (float) local377[local477] + local411 * (float) local381[local477]) * 0.0026041667F;
					} else {
						local532 = ((float) local385[local477] * local417 + (float) local377[local477] * local405 + (float) local381[local477] * local411) / (float) (local504 * 256);
					}
					local572 = (local532 < 0.0F ? local441 : local431) * local532 + local421;
					local577 = (int) (local472 * local572);
					if (local577 < 0) {
						local577 = 0;
					} else if (local577 > 255) {
						local577 = 255;
					}
					local598 = (int) (local572 * local499);
					if (local598 < 0) {
						local598 = 0;
					} else if (local598 > 255) {
						local598 = 255;
					}
					local603 = (int) (local572 * local488);
					local190.anInt7264 = local111 + local107 * local477;
					if (local603 < 0) {
						local603 = 0;
					} else if (local603 > 255) {
						local603 = 255;
					}
					local190.method5854(local577);
					local190.method5854(local598);
					local190.method5854(local603);
					local190.method5854(255 - (this.aByteArray50[local443] & 0xFF));
				}
			} else {
				for (local198 = 0; local198 < this.anInt3887; local198++) {
					local207 = this.method3242(this.aByteArray50[local198], this.aShortArray58[local198], this.aShort56, this.aShortArray60[local198]);
					local190.anInt7264 = local107 * this.aShortArray65[local198] + local111;
					local190.method5861(local207);
					local190.anInt7264 = local107 * this.aShortArray64[local198] + local111;
					local190.method5861(local207);
					local190.anInt7264 = local111 + this.aShortArray59[local198] * local107;
					local190.method5861(local207);
				}
			}
		}
		if (local31) {
			if (this.aClass10_1 == null) {
				local373 = this.aByteArray49;
				local381 = this.aShortArray62;
				local377 = this.aShortArray57;
				local385 = this.aShortArray61;
			} else {
				local385 = this.aClass10_1.aShortArray3;
				local373 = this.aClass10_1.aByteArray7;
				local381 = this.aClass10_1.aShortArray2;
				local377 = this.aClass10_1.aShortArray1;
			}
			@Pc(1115) float local1115 = 3.0F / (float) this.aShort55;
			local532 = 3.0F / (float) (this.aShort55 + this.aShort55 / 2);
			local190.anInt7264 = local113;
			if (this.aClass137_Sub3_13.aBoolean594) {
				for (local235 = 0; local235 < this.anInt3841; local235++) {
					local244 = local373[local235] & 0xFF;
					if (local244 == 0) {
						local190.method5908(local532 * (float) local377[local235]);
						local190.method5908(local532 * (float) local381[local235]);
						local190.method5908(local532 * (float) local385[local235]);
					} else {
						local499 = local1115 / (float) local244;
						local190.method5908(local499 * (float) local377[local235]);
						local190.method5908((float) local381[local235] * local499);
						local190.method5908(local499 * (float) local385[local235]);
					}
					local190.anInt7264 += local107 - 12;
				}
			} else {
				for (local235 = 0; local235 < this.anInt3841; local235++) {
					local244 = local373[local235] & 0xFF;
					if (local244 == 0) {
						local190.method5911(local532 * (float) local377[local235]);
						local190.method5911(local532 * (float) local381[local235]);
						local190.method5911((float) local385[local235] * local532);
					} else {
						local499 = local1115 / (float) local244;
						local190.method5911((float) local377[local235] * local499);
						local190.method5911((float) local381[local235] * local499);
						local190.method5911((float) local385[local235] * local499);
					}
					local190.anInt7264 += local107 - 12;
				}
			}
		}
		if (local53) {
			local190.anInt7264 = local124;
			if (this.aClass137_Sub3_13.aBoolean594) {
				for (local198 = 0; local198 < this.anInt3841; local198++) {
					local190.method5908(this.aFloatArray25[local198]);
					local190.method5908(this.aFloatArray24[local198]);
					local190.anInt7264 += local107 - 8;
				}
			} else {
				for (local198 = 0; local198 < this.anInt3841; local198++) {
					local190.method5911(this.aFloatArray25[local198]);
					local190.method5911(this.aFloatArray24[local198]);
					local190.anInt7264 += local107 - 8;
				}
			}
		}
		local190.anInt7264 = local107 * this.anInt3841;
		@Pc(1432) Interface8 local1432;
		if (arg0) {
			if (this.anInterface8_2 == null) {
				this.anInterface8_2 = this.aClass137_Sub3_13.method7076(local107, true, local190.aByteArray84, local190.anInt7264);
			} else {
				this.anInterface8_2.method5116(local190.anInt7264, local107, local190.aByteArray84);
			}
			this.aByte76 = 0;
			local1432 = this.anInterface8_2;
		} else {
			local1432 = this.aClass137_Sub3_13.method7076(local107, false, local190.aByteArray84, local190.anInt7264);
			this.aBoolean284 = true;
		}
		if (local42) {
			this.aClass91_4.anInterface8_1 = local1432;
			this.aClass91_4.aByte48 = 0;
		}
		if (local53) {
			this.aClass91_2.aByte48 = local124;
			this.aClass91_2.anInterface8_1 = local1432;
		}
		if (local20) {
			this.aClass91_3.anInterface8_1 = local1432;
			this.aClass91_3.aByte48 = local111;
		}
		if (local31) {
			this.aClass91_1.anInterface8_1 = local1432;
			this.aClass91_1.aByte48 = local113;
		}
	}

	@OriginalMember(owner = "client!hba", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort56 = (short) arg0;
		if (this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!qja;Lclient!ag;I)V")
	@Override
	public void method6391(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3841 == 0) {
			return;
		}
		@Pc(13) Class26_Sub3 local13 = this.aClass137_Sub3_13.aClass26_Sub3_3;
		@Pc(16) Class26_Sub3 local16 = (Class26_Sub3) arg0;
		if (!this.aBoolean283) {
			this.method3234();
		}
		Static445.aFloat147 = local16.aFloat171 * local13.aFloat179 + local16.aFloat178 * local13.aFloat175 + local13.aFloat181 * local16.aFloat176 + local13.aFloat171;
		Static647.aFloat265 = local16.aFloat177 * local13.aFloat181 + local16.aFloat180 * local13.aFloat175 + local16.aFloat175 * local13.aFloat179;
		@Pc(69) float local69 = Static647.aFloat265 * (float) this.aShort57 + Static445.aFloat147;
		@Pc(77) float local77 = Static445.aFloat147 + (float) this.aShort51 * Static647.aFloat265;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.aShort59 + local69;
			local93 = local77 - (float) this.aShort59;
		} else {
			local87 = local77 + (float) this.aShort59;
			local93 = local69 - (float) this.aShort59;
		}
		if (this.aClass137_Sub3_13.aFloat196 <= local93 || local87 <= (float) this.aClass137_Sub3_13.anInt8561) {
			return;
		}
		Static146.aFloat63 = local13.aFloat176 + local16.aFloat176 * local13.aFloat172 + local13.aFloat177 * local16.aFloat178 + local13.aFloat173 * local16.aFloat171;
		Static283.aFloat102 = local16.aFloat175 * local13.aFloat173 + local13.aFloat177 * local16.aFloat180 + local13.aFloat172 * local16.aFloat177;
		@Pc(169) float local169 = Static283.aFloat102 * (float) this.aShort57 + Static146.aFloat63;
		@Pc(177) float local177 = Static283.aFloat102 * (float) this.aShort51 + Static146.aFloat63;
		@Pc(193) float local193;
		@Pc(204) float local204;
		if (local169 > local177) {
			local204 = (float) this.aClass137_Sub3_13.anInt8566 * ((float) this.aShort59 + local169);
			local193 = (float) this.aClass137_Sub3_13.anInt8566 * ((float) -this.aShort59 + local177);
		} else {
			local193 = ((float) -this.aShort59 + local169) * (float) this.aClass137_Sub3_13.anInt8566;
			local204 = (float) this.aClass137_Sub3_13.anInt8566 * (local177 + (float) this.aShort59);
		}
		if (this.aClass137_Sub3_13.aFloat202 <= local193 / local87 || this.aClass137_Sub3_13.aFloat199 >= local204 / local87) {
			return;
		}
		Static133.aFloat59 = local16.aFloat177 * local13.aFloat182 + local16.aFloat180 * local13.aFloat180 + local13.aFloat174 * local16.aFloat175;
		Static15.aFloat6 = local13.aFloat182 * local16.aFloat176 + local16.aFloat178 * local13.aFloat180 + local13.aFloat174 * local16.aFloat171 + local13.aFloat178;
		@Pc(294) float local294 = Static15.aFloat6 + (float) this.aShort57 * Static133.aFloat59;
		@Pc(302) float local302 = Static133.aFloat59 * (float) this.aShort51 + Static15.aFloat6;
		@Pc(329) float local329;
		@Pc(317) float local317;
		if (local302 < local294) {
			local317 = (float) this.aClass137_Sub3_13.anInt8578 * (local294 + (float) this.aShort59);
			local329 = ((float) -this.aShort59 + local302) * (float) this.aClass137_Sub3_13.anInt8578;
		} else {
			local317 = (float) this.aClass137_Sub3_13.anInt8578 * ((float) this.aShort59 + local302);
			local329 = ((float) -this.aShort59 + local294) * (float) this.aClass137_Sub3_13.anInt8578;
		}
		if (this.aClass137_Sub3_13.aFloat193 <= local329 / local87 || local317 / local87 <= this.aClass137_Sub3_13.aFloat192) {
			return;
		}
		if (arg1 != null || this.aClass391Array1 != null) {
			Static247.aFloat97 = local16.aFloat173 * local13.aFloat182 + local16.aFloat174 * local13.aFloat180 + local16.aFloat179 * local13.aFloat174;
			Static653.aFloat266 = local16.aFloat174 * local13.aFloat175 + local16.aFloat173 * local13.aFloat181 + local16.aFloat179 * local13.aFloat179;
			Static205.aFloat78 = local16.aFloat172 * local13.aFloat181 + local16.aFloat182 * local13.aFloat175 + local16.aFloat181 * local13.aFloat179;
			Static635.aFloat261 = local16.aFloat182 * local13.aFloat180 + local16.aFloat172 * local13.aFloat182 + local16.aFloat181 * local13.aFloat174;
			Static321.aFloat146 = local13.aFloat173 * local16.aFloat181 + local16.aFloat182 * local13.aFloat177 + local13.aFloat172 * local16.aFloat172;
			Static611.aFloat258 = local16.aFloat173 * local13.aFloat172 + local13.aFloat177 * local16.aFloat174 + local16.aFloat179 * local13.aFloat173;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.aShort53 + this.aShort58 >> 1;
			@Pc(507) int local507 = this.aShort52 + this.aShort60 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static611.aFloat258 + (float) this.aShort57 * Static283.aFloat102 + Static146.aFloat63 + (float) local499 * Static321.aFloat146);
			@Pc(545) int local545 = (int) (Static635.aFloat261 * (float) local499 + Static15.aFloat6 + Static133.aFloat59 * (float) this.aShort57 + Static247.aFloat97 * (float) local507);
			@Pc(564) int local564 = (int) ((float) this.aShort57 * Static647.aFloat265 + Static445.aFloat147 + (float) local499 * Static205.aFloat78 + (float) local507 * Static653.aFloat266);
			if (local564 < this.aClass137_Sub3_13.anInt8561) {
				local489 = true;
			} else {
				arg1.anInt83 = local545 * this.aClass137_Sub3_13.anInt8578 / local564 + this.aClass137_Sub3_13.anInt8559;
				arg1.anInt80 = local526 * this.aClass137_Sub3_13.anInt8566 / local564 + this.aClass137_Sub3_13.anInt8584;
			}
			@Pc(618) int local618 = (int) (Static611.aFloat258 * (float) local507 + (float) local499 * Static321.aFloat146 + Static146.aFloat63 + Static283.aFloat102 * (float) this.aShort51);
			@Pc(637) int local637 = (int) (Static635.aFloat261 * (float) local499 + Static15.aFloat6 + (float) this.aShort51 * Static133.aFloat59 + (float) local507 * Static247.aFloat97);
			@Pc(656) int local656 = (int) (Static445.aFloat147 + (float) local499 * Static205.aFloat78 + (float) this.aShort51 * Static647.aFloat265 + Static653.aFloat266 * (float) local507);
			if (local656 >= this.aClass137_Sub3_13.anInt8561) {
				arg1.anInt82 = local637 * this.aClass137_Sub3_13.anInt8578 / local656 + this.aClass137_Sub3_13.anInt8559;
				arg1.anInt84 = this.aClass137_Sub3_13.anInt8584 + local618 * this.aClass137_Sub3_13.anInt8566 / local656;
			} else {
				local489 = true;
			}
			if (local489) {
				if (this.aClass137_Sub3_13.anInt8561 > local564 && this.aClass137_Sub3_13.anInt8561 > local656) {
					local491 = false;
				} else {
					@Pc(739) int local739;
					@Pc(750) int local750;
					@Pc(777) int local777;
					if (local564 < this.aClass137_Sub3_13.anInt8561) {
						local739 = (local656 - this.aClass137_Sub3_13.anInt8561 << 16) / (local656 - local564);
						local750 = ((local618 - local526) * local739 >> 16) + local618;
						local777 = local637 + (local739 * (local637 - local545) >> 16);
						arg1.anInt80 = this.aClass137_Sub3_13.anInt8566 * local750 / this.aClass137_Sub3_13.anInt8561 + this.aClass137_Sub3_13.anInt8584;
						arg1.anInt83 = local777 * this.aClass137_Sub3_13.anInt8578 / this.aClass137_Sub3_13.anInt8561 + this.aClass137_Sub3_13.anInt8559;
					} else if (local656 < this.aClass137_Sub3_13.anInt8561) {
						local739 = (local564 - this.aClass137_Sub3_13.anInt8561 << 16) / (local564 - local656);
						local750 = (local739 * (local526 - local618) >> 16) + local526;
						arg1.anInt80 = local750 * this.aClass137_Sub3_13.anInt8566 / this.aClass137_Sub3_13.anInt8561 + this.aClass137_Sub3_13.anInt8584;
						local777 = local545 + (local739 * (local545 - local637) >> 16);
						arg1.anInt83 = this.aClass137_Sub3_13.anInt8559 + local777 * this.aClass137_Sub3_13.anInt8578 / this.aClass137_Sub3_13.anInt8561;
					}
				}
			}
			if (local491) {
				arg1.aBoolean6 = true;
				if (local564 <= local656) {
					arg1.anInt81 = (this.aShort59 + local618) * this.aClass137_Sub3_13.anInt8566 / local656 + this.aClass137_Sub3_13.anInt8584 - arg1.anInt84;
				} else {
					arg1.anInt81 = this.aClass137_Sub3_13.anInt8566 * (this.aShort59 + local526) / local564 + this.aClass137_Sub3_13.anInt8584 - arg1.anInt80;
				}
			}
		}
		this.aClass137_Sub3_13.method7049();
		this.aClass137_Sub3_13.method7041(local16);
		this.method3240();
		this.aClass137_Sub3_13.method7047();
		this.method3235();
	}

	@OriginalMember(owner = "client!hba", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3876; local3++) {
			this.anIntArray314[local3] = this.anIntArray314[local3] + 7 >> 4;
			this.anIntArray315[local3] = this.anIntArray315[local3] + 7 >> 4;
			this.anIntArray313[local3] = this.anIntArray313[local3] + 7 >> 4;
		}
		this.aBoolean283 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3870; local15++) {
			local33 = this.anIntArray314[local15] * local13 + this.anIntArray313[local15] * local9 >> 14;
			this.anIntArray313[local15] = this.anIntArray313[local15] * local13 - this.anIntArray314[local15] * local9 >> 14;
			this.anIntArray314[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt3841; local33++) {
			@Pc(87) int local87 = this.aShortArray57[local33] * local13 + this.aShortArray61[local33] * local9 >> 14;
			this.aShortArray61[local33] = (short) (this.aShortArray61[local33] * local13 - this.aShortArray57[local33] * local9 >> 14);
			this.aShortArray57[local33] = (short) local87;
		}
		if (this.aClass91_1 == null && this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
		}
		if (this.aClass91_1 != null) {
			this.aClass91_1.anInterface8_1 = null;
		}
		this.aBoolean283 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3887; local7++) {
			if (arg0 == this.aShortArray58[local7]) {
				this.aShortArray58[local7] = arg1;
			}
		}
		if (this.aClass391Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt3854; local38++) {
				@Pc(45) Class391 local45 = this.aClass391Array1[local38];
				@Pc(50) Class301 local50 = this.aClass301Array1[local38];
				local50.anInt8993 = Static659.anIntArray816[this.aShortArray58[local45.anInt11146] & 0xFFFF] & 0xFFFFFF | local50.anInt8993 & 0xFF000000;
			}
		}
		if (this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class32.anIntArray76[arg0];
		@Pc(13) int local13 = Class32.anIntArray77[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3870; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray314[local15] + this.anIntArray313[local15] * local9 >> 14;
			this.anIntArray313[local15] = this.anIntArray313[local15] * local13 - local9 * this.anIntArray314[local15] >> 14;
			this.anIntArray314[local15] = local33;
		}
		this.aBoolean283 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class80 method6378(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class80_Sub2 local17;
		@Pc(21) Class80_Sub2 local21;
		if (arg0 == 1) {
			local17 = this.aClass137_Sub3_13.aClass80_Sub2_10;
			local21 = this.aClass137_Sub3_13.aClass80_Sub2_8;
		} else if (arg0 == 2) {
			local17 = this.aClass137_Sub3_13.aClass80_Sub2_1;
			local21 = this.aClass137_Sub3_13.aClass80_Sub2_4;
		} else if (arg0 == 3) {
			local21 = this.aClass137_Sub3_13.aClass80_Sub2_5;
			local17 = this.aClass137_Sub3_13.aClass80_Sub2_3;
		} else if (arg0 == 4) {
			local21 = this.aClass137_Sub3_13.aClass80_Sub2_6;
			local17 = this.aClass137_Sub3_13.aClass80_Sub2_2;
		} else if (arg0 == 5) {
			local21 = this.aClass137_Sub3_13.aClass80_Sub2_7;
			local17 = this.aClass137_Sub3_13.aClass80_Sub2_9;
		} else {
			local17 = local21 = new Class80_Sub2(this.aClass137_Sub3_13);
		}
		return this.method3243(local17, arg2, arg0 != 0, local21, arg1);
	}

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "(I)V")
	private void method3240() {
		if (this.anInt3882 == 0) {
			return;
		}
		if (this.aByte76 != 0) {
			this.method3239(true);
		}
		this.method3239(false);
		if (this.aClass293_1 != null) {
			if (this.aClass293_1.anInterface12_5 == null) {
				this.method3241((this.aByte76 & 0x10) != 0);
			}
			if (this.aClass293_1.anInterface12_5 != null) {
				this.aClass137_Sub3_13.method7038(this.aClass91_1 != null);
				this.aClass137_Sub3_13.method7036(this.aClass91_3, this.aClass91_2, this.aClass91_4, this.aClass91_1);
				@Pc(75) int local75 = this.anIntArray316.length - 1;
				for (@Pc(77) int local77 = 0; local77 < local75; local77++) {
					@Pc(84) int local84 = this.anIntArray316[local77];
					@Pc(91) int local91 = this.anIntArray316[local77 + 1];
					@Pc(98) int local98 = this.aShortArray60[local84] & 0xFFFF;
					if (local98 == 65535) {
						local98 = -1;
					}
					this.aClass137_Sub3_13.method7032(this.aClass91_1 != null, local98);
					this.aClass137_Sub3_13.method7063(local84 * 3, this.aClass293_1.anInterface12_5, (local91 - local84) * 3);
				}
			}
		}
		this.method3233();
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IILclient!qja;ZI)Z")
	@Override
	public boolean method6380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class26 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3244(arg1, arg3, arg0, arg2, -1, arg4);
	}

	@OriginalMember(owner = "client!hba", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean283) {
			this.method3234();
		}
		@Pc(17) int local17 = arg4 + this.aShort58;
		@Pc(22) int local22 = arg4 + this.aShort53;
		@Pc(27) int local27 = this.aShort60 + arg6;
		@Pc(32) int local32 = this.aShort52 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt9511 <= arg2.anInt9506 + local22 >> arg2.anInt9507 || local27 < 0 || local32 + arg2.anInt9506 >> arg2.anInt9507 >= arg2.anInt9512)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt9506 + local22 >> arg3.anInt9507 >= arg3.anInt9511 || local27 < 0 || arg3.anInt9506 + local32 >> arg3.anInt9507 >= arg3.anInt9512) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9507;
			local22 = local22 + arg2.anInt9506 - 1 >> arg2.anInt9507;
			local27 >>= arg2.anInt9507;
			local32 = arg2.anInt9506 + local32 - 1 >> arg2.anInt9507;
			if (arg2.method7857(local27, local17) == arg5 && arg2.method7857(local27, local22) == arg5 && arg5 == arg2.method7857(local32, local17) && arg2.method7857(local32, local22) == arg5) {
				return;
			}
		}
		@Pc(273) int local273;
		if (arg0 == 1) {
			for (local273 = 0; local273 < this.anInt3870; local273++) {
				this.anIntArray315[local273] = this.anIntArray315[local273] + arg2.method7866(this.anIntArray314[local273] - -arg4, this.anIntArray313[local273] - -arg6) - arg5;
			}
		} else {
			@Pc(201) int local201;
			@Pc(212) int local212;
			if (arg0 == 2) {
				@Pc(193) short local193 = this.aShort57;
				if (local193 == 0) {
					return;
				}
				for (local201 = 0; local201 < this.anInt3870; local201++) {
					local212 = (this.anIntArray315[local201] << 16) / local193;
					if (local212 < arg1) {
						this.anIntArray315[local201] -= -((arg1 - local212) * (-arg5 + arg2.method7866(arg4 + this.anIntArray314[local201], this.anIntArray313[local201] + arg6)) / arg1);
					}
				}
			} else {
				@Pc(345) int local345;
				if (arg0 == 3) {
					local273 = (arg1 & 0xFF) * 4;
					local201 = (arg1 >> 8 & 0xFF) * 4;
					local212 = (arg1 >> 16 & 0xFF) << 6;
					local345 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local273 >> 1) < 0 || arg2.anInt9511 << arg2.anInt9507 <= arg2.anInt9506 + arg4 + (local273 >> 1) || arg6 - (local201 >> 1) < 0 || arg6 + (local201 >> 1) + arg2.anInt9506 >= arg2.anInt9512 << arg2.anInt9507) {
						return;
					}
					this.method6392(arg2, arg5, local345, arg6, local212, local273, arg4, local201);
				} else if (arg0 == 4) {
					local273 = this.aShort51 - this.aShort57;
					for (local201 = 0; local201 < this.anInt3870; local201++) {
						this.anIntArray315[local201] = local273 + this.anIntArray315[local201] + arg3.method7866(this.anIntArray314[local201] + arg4, this.anIntArray313[local201] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local273 = this.aShort51 - this.aShort57;
					for (local201 = 0; local201 < this.anInt3870; local201++) {
						local212 = this.anIntArray314[local201] + arg4;
						local345 = this.anIntArray313[local201] + arg6;
						@Pc(351) int local351 = arg2.method7866(local212, local345);
						@Pc(357) int local357 = arg3.method7866(local212, local345);
						@Pc(365) int local365 = local351 - arg1 - local357;
						this.anIntArray315[local201] = local351 + ((this.anIntArray315[local201] << 8) / local273 * local365 >> 8) - arg5;
					}
				}
			}
		}
		this.aBoolean283 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "c", descriptor = "()[Lclient!gv;")
	@Override
	public Class136[] method6376() {
		return this.aClass136Array3;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt3887; local3++) {
			local12 = this.aShortArray58[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 -= -(arg3 * (arg0 - local18) >> 7);
			}
			if (arg2 != -1) {
				local42 += (arg2 - local42) * arg3 >> 7;
			}
			this.aShortArray58[local3] = (short) (local24 << 7 | local18 << 10 | local42);
		}
		if (this.aClass391Array1 != null) {
			for (local12 = 0; local12 < this.anInt3854; local12++) {
				@Pc(110) Class391 local110 = this.aClass391Array1[local12];
				@Pc(115) Class301 local115 = this.aClass301Array1[local12];
				local115.anInt8993 = local115.anInt8993 & 0xFF000000 | Static659.anIntArray816[this.aShortArray58[local110.anInt11146] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZB)V")
	private void method3241(@OriginalArg(0) boolean arg0) {
		if (this.anInt3882 * 6 > this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2.aByteArray84.length) {
			this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2 = new Class14_Sub29_Sub2(this.anInt3882 * 6 + 600);
		} else {
			this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2.anInt7264 = 0;
		}
		@Pc(38) Class14_Sub29_Sub2 local38 = this.aClass137_Sub3_13.aClass14_Sub29_Sub2_2;
		@Pc(44) int local44;
		if (this.aClass137_Sub3_13.aBoolean594) {
			for (local44 = 0; local44 < this.anInt3882; local44++) {
				local38.method5859(this.aShortArray65[local44]);
				local38.method5859(this.aShortArray64[local44]);
				local38.method5859(this.aShortArray59[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt3882; local44++) {
				local38.method5867(this.aShortArray65[local44]);
				local38.method5867(this.aShortArray64[local44]);
				local38.method5867(this.aShortArray59[local44]);
			}
		}
		if (local38.anInt7264 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface12_1 == null) {
				this.anInterface12_1 = this.aClass137_Sub3_13.method7075(local38.aByteArray84, local38.anInt7264, true);
			} else {
				this.anInterface12_1.method5494(local38.aByteArray84, local38.anInt7264);
			}
			this.aClass293_1.anInterface12_5 = this.anInterface12_1;
		} else {
			this.aClass293_1.anInterface12_5 = this.aClass137_Sub3_13.method7075(local38.aByteArray84, local38.anInt7264, false);
		}
		if (!arg0) {
			this.aBoolean284 = true;
		}
	}

	@OriginalMember(owner = "client!hba", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort59;
	}

	@OriginalMember(owner = "client!hba", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3870; local7++) {
			this.anIntArray313[local7] = -this.anIntArray313[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3841; local25++) {
			this.aShortArray61[local25] = (short) -this.aShortArray61[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt3887; local48++) {
			@Pc(55) short local55 = this.aShortArray65[local48];
			this.aShortArray65[local48] = this.aShortArray59[local48];
			this.aShortArray59[local48] = local55;
		}
		if (this.aClass91_1 == null && this.aClass91_3 != null) {
			this.aClass91_3.anInterface8_1 = null;
		}
		if (this.aClass91_1 != null) {
			this.aClass91_1.anInterface8_1 = null;
		}
		this.aBoolean283 = false;
		if (this.aClass293_1 != null) {
			this.aClass293_1.anInterface12_5 = null;
		}
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort51;
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "()[Lclient!oq;")
	@Override
	public Class265[] method6372() {
		return this.aClass265Array3;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(BIIIS)I")
	private int method3242(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3) {
		@Pc(12) int local12 = Static659.anIntArray816[Static280.method4054(arg2, arg1)];
		if (arg3 != -1) {
			@Pc(32) Class224 local32 = this.aClass137_Sub3_13.anInterface3_11.method6177(arg3 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte100 & 0xFF;
			@Pc(49) int local49;
			@Pc(73) int local73;
			if (local37 != 0) {
				if (arg2 < 0) {
					local49 = 0;
				} else if (arg2 > 127) {
					local49 = 16777215;
				} else {
					local49 = arg2 * 131586;
				}
				if (local37 == 256) {
					local12 = local49;
				} else {
					local73 = 256 - local37;
					local12 = (local37 * (local49 & 0xFF00FF) + local73 * (local12 & 0xFF00FF) & 0xFF00FF00) + (local73 * (local12 & 0xFF00) + local37 * (local49 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local49 = local32.aByte99 & 0xFF;
			if (local49 != 0) {
				local49 += 256;
				@Pc(119) int local119 = (local12 >> 16 & 0xFF) * local49;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local73 = (local12 >> 8 & 0xFF) * local49;
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(145) int local145 = local49 * (local12 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				local12 = (local145 >> 8) + (local73 & 0xFF00) + ((local119 & 0xE500FF00) << 8);
			}
		}
		return (local12 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!qja;IZ)V")
	@Override
	public void method6382(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray67 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3870; local14++) {
			if ((arg1 & this.aShortArray67[local14]) != 0) {
				if (arg2) {
					arg0.method6454(this.anIntArray314[local14], this.anIntArray315[local14], this.anIntArray313[local14], local12);
				} else {
					arg0.method6461(this.anIntArray314[local14], this.anIntArray315[local14], this.anIntArray313[local14], local12);
				}
				this.anIntArray314[local14] = local12[0];
				this.anIntArray315[local14] = local12[1];
				this.anIntArray313[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!qja;Lclient!ag;II)V")
	@Override
	public void method6375(@OriginalArg(0) Class26 arg0, @OriginalArg(1) Class12_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3841 == 0) {
			return;
		}
		@Pc(13) Class26_Sub3 local13 = this.aClass137_Sub3_13.aClass26_Sub3_3;
		@Pc(16) Class26_Sub3 local16 = (Class26_Sub3) arg0;
		if (!this.aBoolean283) {
			this.method3234();
		}
		Static647.aFloat265 = local13.aFloat181 * local16.aFloat177 + local13.aFloat175 * local16.aFloat180 + local16.aFloat175 * local13.aFloat179;
		Static445.aFloat147 = local16.aFloat176 * local13.aFloat181 + local13.aFloat175 * local16.aFloat178 + local13.aFloat179 * local16.aFloat171 + local13.aFloat171;
		@Pc(69) float local69 = Static445.aFloat147 + (float) this.aShort57 * Static647.aFloat265;
		@Pc(77) float local77 = Static445.aFloat147 + Static647.aFloat265 * (float) this.aShort51;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = (float) -this.aShort59 + local77;
			local93 = (float) this.aShort59 + local69;
		} else {
			local87 = local69 - (float) this.aShort59;
			local93 = (float) this.aShort59 + local77;
		}
		if (local87 >= this.aClass137_Sub3_13.aFloat200 || (float) this.aClass137_Sub3_13.anInt8561 >= local93) {
			return;
		}
		Static283.aFloat102 = local16.aFloat175 * local13.aFloat173 + local16.aFloat180 * local13.aFloat177 + local16.aFloat177 * local13.aFloat172;
		Static146.aFloat63 = local13.aFloat176 + local16.aFloat171 * local13.aFloat173 + local16.aFloat178 * local13.aFloat177 + local13.aFloat172 * local16.aFloat176;
		@Pc(170) float local170 = (float) this.aShort57 * Static283.aFloat102 + Static146.aFloat63;
		@Pc(178) float local178 = Static146.aFloat63 + Static283.aFloat102 * (float) this.aShort51;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local170 > local178) {
			local205 = ((float) -this.aShort59 + local178) * (float) this.aClass137_Sub3_13.anInt8566;
			local193 = ((float) this.aShort59 + local170) * (float) this.aClass137_Sub3_13.anInt8566;
		} else {
			local193 = (float) this.aClass137_Sub3_13.anInt8566 * ((float) this.aShort59 + local178);
			local205 = ((float) -this.aShort59 + local170) * (float) this.aClass137_Sub3_13.anInt8566;
		}
		if (local205 / (float) arg2 >= this.aClass137_Sub3_13.aFloat202 || this.aClass137_Sub3_13.aFloat199 >= local193 / (float) arg2) {
			return;
		}
		Static15.aFloat6 = local13.aFloat182 * local16.aFloat176 + local16.aFloat178 * local13.aFloat180 + local13.aFloat174 * local16.aFloat171 + local13.aFloat178;
		Static133.aFloat59 = local16.aFloat180 * local13.aFloat180 + local16.aFloat177 * local13.aFloat182 + local13.aFloat174 * local16.aFloat175;
		@Pc(297) float local297 = (float) this.aShort57 * Static133.aFloat59 + Static15.aFloat6;
		@Pc(305) float local305 = Static15.aFloat6 + (float) this.aShort51 * Static133.aFloat59;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local331 = ((float) this.aShort59 + local297) * (float) this.aClass137_Sub3_13.anInt8578;
			local320 = (local305 - (float) this.aShort59) * (float) this.aClass137_Sub3_13.anInt8578;
		} else {
			local320 = (float) this.aClass137_Sub3_13.anInt8578 * (local297 - (float) this.aShort59);
			local331 = ((float) this.aShort59 + local305) * (float) this.aClass137_Sub3_13.anInt8578;
		}
		if (local320 / (float) arg2 >= this.aClass137_Sub3_13.aFloat193 || local331 / (float) arg2 <= this.aClass137_Sub3_13.aFloat192) {
			return;
		}
		if (arg1 != null || this.aClass391Array1 != null) {
			Static611.aFloat258 = local13.aFloat172 * local16.aFloat173 + local16.aFloat174 * local13.aFloat177 + local13.aFloat173 * local16.aFloat179;
			Static635.aFloat261 = local13.aFloat180 * local16.aFloat182 + local16.aFloat172 * local13.aFloat182 + local13.aFloat174 * local16.aFloat181;
			Static653.aFloat266 = local13.aFloat175 * local16.aFloat174 + local13.aFloat181 * local16.aFloat173 + local13.aFloat179 * local16.aFloat179;
			Static321.aFloat146 = local16.aFloat172 * local13.aFloat172 + local16.aFloat182 * local13.aFloat177 + local13.aFloat173 * local16.aFloat181;
			Static247.aFloat97 = local16.aFloat173 * local13.aFloat182 + local13.aFloat180 * local16.aFloat174 + local16.aFloat179 * local13.aFloat174;
			Static205.aFloat78 = local16.aFloat181 * local13.aFloat179 + local16.aFloat172 * local13.aFloat181 + local13.aFloat175 * local16.aFloat182;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort58 + this.aShort53 >> 1;
			@Pc(507) int local507 = this.aShort52 + this.aShort60 >> 1;
			@Pc(526) int local526 = (int) (Static146.aFloat63 + Static321.aFloat146 * (float) local499 + Static283.aFloat102 * (float) this.aShort57 + (float) local507 * Static611.aFloat258);
			@Pc(545) int local545 = (int) (Static15.aFloat6 + Static635.aFloat261 * (float) local499 + (float) this.aShort57 * Static133.aFloat59 + Static247.aFloat97 * (float) local507);
			@Pc(564) int local564 = (int) ((float) local499 * Static205.aFloat78 + Static445.aFloat147 + Static647.aFloat265 * (float) this.aShort57 + (float) local507 * Static653.aFloat266);
			@Pc(583) int local583 = (int) ((float) local507 * Static611.aFloat258 + (float) local499 * Static321.aFloat146 + Static146.aFloat63 + (float) this.aShort51 * Static283.aFloat102);
			@Pc(602) int local602 = (int) (Static133.aFloat59 * (float) this.aShort51 + Static635.aFloat261 * (float) local499 + Static15.aFloat6 + (float) local507 * Static247.aFloat97);
			arg1.anInt82 = local602 * this.aClass137_Sub3_13.anInt8578 / arg2 + this.aClass137_Sub3_13.anInt8559;
			@Pc(634) int local634 = (int) (Static205.aFloat78 * (float) local499 + Static445.aFloat147 + (float) this.aShort51 * Static647.aFloat265 + (float) local507 * Static653.aFloat266);
			arg1.anInt84 = this.aClass137_Sub3_13.anInt8566 * local583 / arg2 + this.aClass137_Sub3_13.anInt8584;
			arg1.anInt80 = local526 * this.aClass137_Sub3_13.anInt8566 / arg2 + this.aClass137_Sub3_13.anInt8584;
			arg1.anInt83 = this.aClass137_Sub3_13.anInt8559 + local545 * this.aClass137_Sub3_13.anInt8578 / arg2;
			if (local564 >= this.aClass137_Sub3_13.anInt8561 || this.aClass137_Sub3_13.anInt8561 <= local634) {
				arg1.anInt81 = (this.aShort59 + local526) * this.aClass137_Sub3_13.anInt8566 / arg2 + this.aClass137_Sub3_13.anInt8584 - arg1.anInt80;
				arg1.aBoolean6 = true;
			}
		}
		this.aClass137_Sub3_13.method7101((float) arg2);
		this.aClass137_Sub3_13.method7059();
		this.aClass137_Sub3_13.method7041(local16);
		this.method3240();
		this.aClass137_Sub3_13.method7047();
		this.method3235();
	}

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "()V")
	@Override
	public void method6389() {
		if (this.anInt3841 <= 0 || this.anInt3882 <= 0) {
			return;
		}
		this.method3239(false);
		if ((this.aByte76 & 0x10) == 0 && this.aClass293_1.anInterface12_5 == null) {
			this.method3241(false);
		}
		this.method3233();
	}

	@OriginalMember(owner = "client!hba", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray26 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3876; local12++) {
			this.anIntArray314[local12] <<= 0x4;
			this.anIntArray315[local12] <<= 0x4;
			this.anIntArray313[local12] <<= 0x4;
		}
		Static208.anInt3938 = 0;
		Static28.anInt703 = 0;
		Static296.anInt6295 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hba", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort56;
	}

	@OriginalMember(owner = "client!hba", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort55;
	}

	@OriginalMember(owner = "client!hba", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt3827 = arg0;
		if (this.aClass10_1 != null && (this.anInt3827 & 0x10000) == 0) {
			this.aShortArray62 = this.aClass10_1.aShortArray2;
			this.aShortArray57 = this.aClass10_1.aShortArray1;
			this.aByteArray49 = this.aClass10_1.aByteArray7;
			this.aShortArray61 = this.aClass10_1.aShortArray3;
			this.aClass10_1 = null;
		}
		this.aBoolean284 = true;
		this.method3233();
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(ZLclient!hba;ZZLclient!hba;I)Lclient!ka;")
	private Class80 method3243(@OriginalArg(1) Class80_Sub2 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class80_Sub2 arg3, @OriginalArg(5) int arg4) {
		arg0.anInt3870 = this.anInt3870;
		arg0.aShort55 = this.aShort55;
		arg0.anInt3882 = this.anInt3882;
		arg0.aShort56 = this.aShort56;
		arg0.anInt3854 = this.anInt3854;
		arg0.aByte76 = 0;
		arg0.anInt3841 = this.anInt3841;
		arg0.anInt3888 = this.anInt3888;
		arg0.anInt3827 = arg4;
		arg0.aBoolean282 = this.aBoolean282;
		if ((arg4 & 0x100) == 0) {
			arg0.aBoolean285 = this.aBoolean285;
		} else {
			arg0.aBoolean285 = true;
		}
		arg0.anInt3887 = this.anInt3887;
		arg0.anInt3876 = this.anInt3876;
		@Pc(79) boolean local79 = Static535.method7641(this.anInt3888, arg4);
		@Pc(85) boolean local85 = Static275.method4000(this.anInt3888, arg4);
		@Pc(91) boolean local91 = Static410.method6056(this.anInt3888, arg4);
		@Pc(97) boolean local97 = local85 | local79 | local91;
		@Pc(216) int local216;
		if (local97) {
			if (!local79) {
				arg0.anIntArray314 = this.anIntArray314;
			} else if (arg3.anIntArray314 == null || this.anInt3876 > arg3.anIntArray314.length) {
				arg0.anIntArray314 = arg3.anIntArray314 = new int[this.anInt3876];
			} else {
				arg0.anIntArray314 = arg3.anIntArray314;
			}
			if (!local85) {
				arg0.anIntArray315 = this.anIntArray315;
			} else if (arg3.anIntArray315 == null || arg3.anIntArray315.length < this.anInt3876) {
				arg0.anIntArray315 = arg3.anIntArray315 = new int[this.anInt3876];
			} else {
				arg0.anIntArray315 = arg3.anIntArray315;
			}
			if (!local91) {
				arg0.anIntArray313 = this.anIntArray313;
			} else if (arg3.anIntArray313 == null || this.anInt3876 > arg3.anIntArray313.length) {
				arg0.anIntArray313 = arg3.anIntArray313 = new int[this.anInt3876];
			} else {
				arg0.anIntArray313 = arg3.anIntArray313;
			}
			for (local216 = 0; local216 < this.anInt3876; local216++) {
				if (local79) {
					arg0.anIntArray314[local216] = this.anIntArray314[local216];
				}
				if (local85) {
					arg0.anIntArray315[local216] = this.anIntArray315[local216];
				}
				if (local91) {
					arg0.anIntArray313[local216] = this.anIntArray313[local216];
				}
			}
		} else {
			arg0.anIntArray313 = this.anIntArray313;
			arg0.anIntArray315 = this.anIntArray315;
			arg0.anIntArray314 = this.anIntArray314;
		}
		if (Static70.method1361(this.anInt3888, arg4)) {
			arg0.aClass91_4 = arg3.aClass91_4;
			if (arg2) {
				arg0.aByte76 = (byte) (arg0.aByte76 | 0x1);
			}
			arg0.aClass91_4.anInterface8_1 = this.aClass91_4.anInterface8_1;
			arg0.aClass91_4.aByte48 = this.aClass91_4.aByte48;
		} else if (Static305.method4469(arg4, this.anInt3888)) {
			arg0.aClass91_4 = this.aClass91_4;
		} else {
			arg0.aClass91_4 = null;
		}
		if (Static322.method5083(this.anInt3888, arg4)) {
			if (arg3.aShortArray58 == null || this.anInt3887 > arg3.aShortArray58.length) {
				arg0.aShortArray58 = arg3.aShortArray58 = new short[this.anInt3887];
			} else {
				arg0.aShortArray58 = arg3.aShortArray58;
			}
			for (local216 = 0; local216 < this.anInt3887; local216++) {
				arg0.aShortArray58[local216] = this.aShortArray58[local216];
			}
		} else {
			arg0.aShortArray58 = this.aShortArray58;
		}
		if (Static532.method7628(arg4, this.anInt3888)) {
			if (arg3.aByteArray50 == null || arg3.aByteArray50.length < this.anInt3887) {
				arg0.aByteArray50 = arg3.aByteArray50 = new byte[this.anInt3887];
			} else {
				arg0.aByteArray50 = arg3.aByteArray50;
			}
			for (local216 = 0; local216 < this.anInt3887; local216++) {
				arg0.aByteArray50[local216] = this.aByteArray50[local216];
			}
		} else {
			arg0.aByteArray50 = this.aByteArray50;
		}
		if (Static226.method5385(this.anInt3888, arg4)) {
			if (arg2) {
				arg0.aByte76 = (byte) (arg0.aByte76 | 0x2);
			}
			arg0.aClass91_3 = arg3.aClass91_3;
			arg0.aClass91_3.anInterface8_1 = this.aClass91_3.anInterface8_1;
			arg0.aClass91_3.aByte48 = this.aClass91_3.aByte48;
		} else if (Static49.method1023(this.anInt3888, arg4)) {
			arg0.aClass91_3 = this.aClass91_3;
		} else {
			arg0.aClass91_3 = null;
		}
		@Pc(590) int local590;
		if (Static400.method5985(arg4, this.anInt3888)) {
			if (arg3.aShortArray57 == null || this.anInt3841 > arg3.aShortArray57.length) {
				local216 = this.anInt3841;
				arg0.aShortArray61 = arg3.aShortArray61 = new short[local216];
				arg0.aShortArray57 = arg3.aShortArray57 = new short[local216];
				arg0.aShortArray62 = arg3.aShortArray62 = new short[local216];
			} else {
				arg0.aShortArray61 = arg3.aShortArray61;
				arg0.aShortArray57 = arg3.aShortArray57;
				arg0.aShortArray62 = arg3.aShortArray62;
			}
			if (this.aClass10_1 == null) {
				for (local216 = 0; local216 < this.anInt3841; local216++) {
					arg0.aShortArray57[local216] = this.aShortArray57[local216];
					arg0.aShortArray62[local216] = this.aShortArray62[local216];
					arg0.aShortArray61[local216] = this.aShortArray61[local216];
				}
			} else {
				if (arg3.aClass10_1 == null) {
					arg3.aClass10_1 = new Class10();
				}
				@Pc(574) Class10 local574 = arg0.aClass10_1 = arg3.aClass10_1;
				if (local574.aShortArray1 == null || local574.aShortArray1.length < this.anInt3841) {
					local590 = this.anInt3841;
					local574.aShortArray2 = new short[local590];
					local574.aShortArray3 = new short[local590];
					local574.aByteArray7 = new byte[local590];
					local574.aShortArray1 = new short[local590];
				}
				for (local590 = 0; local590 < this.anInt3841; local590++) {
					arg0.aShortArray57[local590] = this.aShortArray57[local590];
					arg0.aShortArray62[local590] = this.aShortArray62[local590];
					arg0.aShortArray61[local590] = this.aShortArray61[local590];
					local574.aShortArray1[local590] = this.aClass10_1.aShortArray1[local590];
					local574.aShortArray2[local590] = this.aClass10_1.aShortArray2[local590];
					local574.aShortArray3[local590] = this.aClass10_1.aShortArray3[local590];
					local574.aByteArray7[local590] = this.aClass10_1.aByteArray7[local590];
				}
			}
			arg0.aByteArray49 = this.aByteArray49;
		} else {
			arg0.aShortArray57 = this.aShortArray57;
			arg0.aByteArray49 = this.aByteArray49;
			arg0.aClass10_1 = this.aClass10_1;
			arg0.aShortArray61 = this.aShortArray61;
			arg0.aShortArray62 = this.aShortArray62;
		}
		if (Static603.method8473(this.anInt3888, arg4)) {
			if (arg2) {
				arg0.aByte76 = (byte) (arg0.aByte76 | 0x4);
			}
			arg0.aClass91_1 = arg3.aClass91_1;
			arg0.aClass91_1.aByte48 = this.aClass91_1.aByte48;
			arg0.aClass91_1.anInterface8_1 = this.aClass91_1.anInterface8_1;
		} else if (Static597.method8442(arg4, this.anInt3888)) {
			arg0.aClass91_1 = this.aClass91_1;
		} else {
			arg0.aClass91_1 = null;
		}
		if (Static161.method2611(this.anInt3888, arg4)) {
			if (arg3.aFloatArray25 == null || arg3.aFloatArray25.length < this.anInt3887) {
				local216 = this.anInt3841;
				arg0.aFloatArray24 = arg3.aFloatArray24 = new float[local216];
				arg0.aFloatArray25 = arg3.aFloatArray25 = new float[local216];
			} else {
				arg0.aFloatArray25 = arg3.aFloatArray25;
				arg0.aFloatArray24 = arg3.aFloatArray24;
			}
			for (local216 = 0; local216 < this.anInt3841; local216++) {
				arg0.aFloatArray25[local216] = this.aFloatArray25[local216];
				arg0.aFloatArray24[local216] = this.aFloatArray24[local216];
			}
		} else {
			arg0.aFloatArray25 = this.aFloatArray25;
			arg0.aFloatArray24 = this.aFloatArray24;
		}
		if (Static179.method2848(this.anInt3888, arg4)) {
			arg0.aClass91_2 = arg3.aClass91_2;
			if (arg2) {
				arg0.aByte76 = (byte) (arg0.aByte76 | 0x8);
			}
			arg0.aClass91_2.aByte48 = this.aClass91_2.aByte48;
			arg0.aClass91_2.anInterface8_1 = this.aClass91_2.anInterface8_1;
		} else if (Static628.method8809(arg4, this.anInt3888)) {
			arg0.aClass91_2 = this.aClass91_2;
		} else {
			arg0.aClass91_2 = null;
		}
		if (Static22.method343(this.anInt3888, arg4)) {
			if (arg3.aShortArray65 == null || arg3.aShortArray65.length < this.anInt3887) {
				local216 = this.anInt3887;
				arg0.aShortArray65 = arg3.aShortArray65 = new short[local216];
				arg0.aShortArray59 = arg3.aShortArray59 = new short[local216];
				arg0.aShortArray64 = arg3.aShortArray64 = new short[local216];
			} else {
				arg0.aShortArray65 = arg3.aShortArray65;
				arg0.aShortArray64 = arg3.aShortArray64;
				arg0.aShortArray59 = arg3.aShortArray59;
			}
			for (local216 = 0; local216 < this.anInt3887; local216++) {
				arg0.aShortArray65[local216] = this.aShortArray65[local216];
				arg0.aShortArray64[local216] = this.aShortArray64[local216];
				arg0.aShortArray59[local216] = this.aShortArray59[local216];
			}
		} else {
			arg0.aShortArray64 = this.aShortArray64;
			arg0.aShortArray59 = this.aShortArray59;
			arg0.aShortArray65 = this.aShortArray65;
		}
		if (Static63.method1257(this.anInt3888, arg4)) {
			if (arg2) {
				arg0.aByte76 = (byte) (arg0.aByte76 | 0x10);
			}
			arg0.aClass293_1 = arg3.aClass293_1;
			arg0.aClass293_1.anInterface12_5 = this.aClass293_1.anInterface12_5;
		} else if (Static135.method2158(this.anInt3888, arg4)) {
			arg0.aClass293_1 = this.aClass293_1;
		} else {
			arg0.aClass293_1 = null;
		}
		if (Static204.method7912(this.anInt3888, arg4)) {
			if (arg3.aShortArray60 == null || this.anInt3887 > arg3.aShortArray60.length) {
				local216 = this.anInt3887;
				arg0.aShortArray60 = arg3.aShortArray60 = new short[local216];
			} else {
				arg0.aShortArray60 = arg3.aShortArray60;
			}
			for (local216 = 0; local216 < this.anInt3887; local216++) {
				arg0.aShortArray60[local216] = this.aShortArray60[local216];
			}
		} else {
			arg0.aShortArray60 = this.aShortArray60;
		}
		if (!Static530.method7612(arg4, this.anInt3888)) {
			arg0.aClass301Array1 = this.aClass301Array1;
		} else if (arg3.aClass301Array1 == null || this.anInt3854 > arg3.aClass301Array1.length) {
			local216 = this.anInt3854;
			arg0.aClass301Array1 = arg3.aClass301Array1 = new Class301[local216];
			for (local590 = 0; local590 < this.anInt3854; local590++) {
				arg0.aClass301Array1[local590] = this.aClass301Array1[local590].method7446();
			}
		} else {
			arg0.aClass301Array1 = arg3.aClass301Array1;
			for (local216 = 0; local216 < this.anInt3854; local216++) {
				arg0.aClass301Array1[local216].method7445(this.aClass301Array1[local216]);
			}
		}
		if (this.aBoolean283) {
			arg0.aShort58 = this.aShort58;
			arg0.aShort60 = this.aShort60;
			arg0.aShort53 = this.aShort53;
			arg0.aBoolean283 = true;
			arg0.aShort51 = this.aShort51;
			arg0.aShort59 = this.aShort59;
			arg0.aShort52 = this.aShort52;
			arg0.aShort54 = this.aShort54;
			arg0.aShort57 = this.aShort57;
		} else {
			arg0.aBoolean283 = false;
		}
		arg0.anIntArray316 = this.anIntArray316;
		arg0.aClass391Array1 = this.aClass391Array1;
		arg0.aShortArray63 = this.aShortArray63;
		arg0.aShortArray66 = this.aShortArray66;
		arg0.aClass136Array3 = this.aClass136Array3;
		arg0.anIntArrayArray27 = this.anIntArrayArray27;
		arg0.anIntArrayArray28 = this.anIntArrayArray28;
		arg0.anIntArrayArray26 = this.anIntArrayArray26;
		arg0.anIntArray317 = this.anIntArray317;
		arg0.aClass265Array3 = this.aClass265Array3;
		arg0.aShortArray67 = this.aShortArray67;
		return arg0;
	}

	@OriginalMember(owner = "client!hba", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort60;
	}

	@OriginalMember(owner = "client!hba", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3870; local3++) {
			if (arg0 != 0) {
				this.anIntArray314[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray315[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray313[local3] += arg2;
			}
		}
		this.aBoolean283 = false;
		if (this.aClass91_4 != null) {
			this.aClass91_4.anInterface8_1 = null;
		}
	}

	@OriginalMember(owner = "client!hba", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			local27 = 0;
			Static296.anInt6295 = 0;
			Static208.anInt3938 = 0;
			Static28.anInt703 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray26.length > local41) {
					local51 = this.anIntArrayArray26[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray67 == null || (this.aShortArray67[local59] & arg6) != 0) {
							Static208.anInt3938 += this.anIntArray314[local59];
							Static28.anInt703 += this.anIntArray315[local59];
							local27++;
							Static296.anInt6295 += this.anIntArray313[local59];
						}
					}
				}
			}
			if (local27 > 0) {
				Static208.anInt3938 = arg2 + Static208.anInt3938 / local27;
				Static519.aBoolean633 = true;
				Static296.anInt6295 = arg4 + Static296.anInt6295 / local27;
				Static28.anInt703 = Static28.anInt703 / local27 + arg3;
			} else {
				Static296.anInt6295 = arg4;
				Static28.anInt703 = arg3;
				Static208.anInt3938 = arg2;
			}
			return;
		}
		@Pc(258) int[] local258;
		@Pc(260) int local260;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg7[1] * arg3 + arg7[0] * arg2 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg7[7] * arg3 + arg2 * arg7[6] + arg7[8] * arg4 + 8192 >> 14;
				arg2 = local27;
				arg3 = local35;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray26.length) {
					local258 = this.anIntArrayArray26[local35];
					for (local260 = 0; local260 < local258.length; local260++) {
						local53 = local258[local260];
						if (this.aShortArray67 == null || (arg6 & this.aShortArray67[local53]) != 0) {
							this.anIntArray314[local53] += arg2;
							this.anIntArray315[local53] += arg3;
							this.anIntArray313[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(388) int local388;
		@Pc(406) int local406;
		@Pc(630) int local630;
		@Pc(639) int local639;
		@Pc(649) int local649;
		@Pc(653) int local653;
		@Pc(672) int local672;
		@Pc(1014) int local1014;
		@Pc(1022) int local1022;
		@Pc(1178) int local1178;
		@Pc(1203) int local1203;
		@Pc(1207) int local1207;
		@Pc(1215) int local1215;
		@Pc(1220) int local1220;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1230) int local1230;
		@Pc(1363) int[] local1363;
		@Pc(1365) int local1365;
		@Pc(1369) int local1369;
		@Pc(1373) int local1373;
		@Pc(1375) int local1375;
		@Pc(1502) int local1502;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray26.length > local35) {
						local258 = this.anIntArrayArray26[local35];
						for (local260 = 0; local260 < local258.length; local260++) {
							local53 = local258[local260];
							if (this.aShortArray67 == null || (this.aShortArray67[local53] & arg6) != 0) {
								this.anIntArray314[local53] -= Static208.anInt3938;
								this.anIntArray315[local53] -= Static28.anInt703;
								this.anIntArray313[local53] -= Static296.anInt6295;
								if (arg4 != 0) {
									local59 = Class32.anIntArray76[arg4];
									local388 = Class32.anIntArray77[arg4];
									local406 = this.anIntArray314[local53] * local388 + local59 * this.anIntArray315[local53] + 16383 >> 14;
									this.anIntArray315[local53] = local388 * this.anIntArray315[local53] + 16383 - local59 * this.anIntArray314[local53] >> 14;
									this.anIntArray314[local53] = local406;
								}
								if (arg2 != 0) {
									local59 = Class32.anIntArray76[arg2];
									local388 = Class32.anIntArray77[arg2];
									local406 = this.anIntArray315[local53] * local388 + 16383 - this.anIntArray313[local53] * local59 >> 14;
									this.anIntArray313[local53] = this.anIntArray313[local53] * local388 + this.anIntArray315[local53] * local59 + 16383 >> 14;
									this.anIntArray315[local53] = local406;
								}
								if (arg3 != 0) {
									local59 = Class32.anIntArray76[arg3];
									local388 = Class32.anIntArray77[arg3];
									local406 = this.anIntArray313[local53] * local59 + local388 * this.anIntArray314[local53] + 16383 >> 14;
									this.anIntArray313[local53] = local388 * this.anIntArray313[local53] + 16383 - this.anIntArray314[local53] * local59 >> 14;
									this.anIntArray314[local53] = local406;
								}
								this.anIntArray314[local53] += Static208.anInt3938;
								this.anIntArray315[local53] += Static28.anInt703;
								this.anIntArray313[local53] += Static296.anInt6295;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray26.length) {
							local51 = this.anIntArrayArray26[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray67 == null || (this.aShortArray67[local59] & arg6) != 0) {
									local388 = this.anIntArray317[local59];
									local406 = this.anIntArray317[local59 + 1];
									for (local630 = local388; local630 < local406; local630++) {
										local639 = this.aShortArray63[local630] - 1;
										if (local639 == -1) {
											break;
										}
										if (arg4 != 0) {
											local649 = Class32.anIntArray76[arg4];
											local653 = Class32.anIntArray77[arg4];
											local672 = local649 * this.aShortArray62[local639] + this.aShortArray57[local639] * local653 + 16383 >> 14;
											this.aShortArray62[local639] = (short) (local653 * this.aShortArray62[local639] + 16383 - local649 * this.aShortArray57[local639] >> 14);
											this.aShortArray57[local639] = (short) local672;
										}
										if (arg2 != 0) {
											local649 = Class32.anIntArray76[arg2];
											local653 = Class32.anIntArray77[arg2];
											local672 = this.aShortArray62[local639] * local653 + 16383 - local649 * this.aShortArray61[local639] >> 14;
											this.aShortArray61[local639] = (short) (this.aShortArray62[local639] * local649 + this.aShortArray61[local639] * local653 + 16383 >> 14);
											this.aShortArray62[local639] = (short) local672;
										}
										if (arg3 != 0) {
											local649 = Class32.anIntArray76[arg3];
											local653 = Class32.anIntArray77[arg3];
											local672 = this.aShortArray61[local639] * local649 + this.aShortArray57[local639] * local653 + 16383 >> 14;
											this.aShortArray61[local639] = (short) (local653 * this.aShortArray61[local639] + 16383 - this.aShortArray57[local639] * local649 >> 14);
											this.aShortArray57[local639] = (short) local672;
										}
									}
								}
							}
						}
					}
					if (this.aClass91_1 == null && this.aClass91_3 != null) {
						this.aClass91_3.anInterface8_1 = null;
					}
					if (this.aClass91_1 != null) {
						this.aClass91_1.anInterface8_1 = null;
						return;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local260 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static519.aBoolean633) {
					local388 = Static296.anInt6295 * arg7[6] + Static28.anInt703 * arg7[3] + arg7[0] * Static208.anInt3938 + 8192 >> 14;
					local406 = Static296.anInt6295 * arg7[7] + arg7[1] * Static208.anInt3938 + Static28.anInt703 * arg7[4] + 8192 >> 14;
					local630 = Static208.anInt3938 * arg7[2] + arg7[5] * Static28.anInt703 + arg7[8] * Static296.anInt6295 + 8192 >> 14;
					local406 += local53;
					local388 += local260;
					Static208.anInt3938 = local388;
					Static28.anInt703 = local406;
					local630 += local59;
					Static296.anInt6295 = local630;
					Static519.aBoolean633 = false;
				}
				@Pc(982) int[] local982 = new int[9];
				local406 = Class32.anIntArray77[arg2];
				local630 = Class32.anIntArray76[arg2];
				local639 = Class32.anIntArray77[arg3];
				local649 = Class32.anIntArray76[arg3];
				local653 = Class32.anIntArray77[arg4];
				local672 = Class32.anIntArray76[arg4];
				local1014 = local653 * local630 + 8192 >> 14;
				local1022 = local672 * local630 + 8192 >> 14;
				local982[3] = local406 * local672 + 8192 >> 14;
				local982[8] = local639 * local406 + 8192 >> 14;
				local982[4] = local653 * local406 + 8192 >> 14;
				local982[7] = local672 * local649 + local639 * local1014 + 8192 >> 14;
				local982[0] = local653 * local639 + local649 * local1022 + 8192 >> 14;
				local982[1] = local649 * local1014 + -local639 * local672 + 8192 >> 14;
				local982[5] = -local630;
				local982[2] = local649 * local406 + 8192 >> 14;
				local982[6] = local639 * local1022 + -local649 * local653 + 8192 >> 14;
				@Pc(1153) int local1153 = local982[2] * -Static296.anInt6295 + -Static208.anInt3938 * local982[0] + -Static28.anInt703 * local982[1] + 8192 >> 14;
				local1178 = local982[3] * -Static208.anInt3938 + -Static28.anInt703 * local982[4] + local982[5] * -Static296.anInt6295 + 8192 >> 14;
				local1203 = -Static296.anInt6295 * local982[8] + local982[7] * -Static28.anInt703 + -Static208.anInt3938 * local982[6] + 8192 >> 14;
				local1207 = Static208.anInt3938 + local1153;
				@Pc(1211) int local1211 = Static28.anInt703 + local1178;
				local1215 = Static296.anInt6295 + local1203;
				@Pc(1218) int[] local1218 = new int[9];
				for (local1220 = 0; local1220 < 3; local1220++) {
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1228 = 0;
						for (local1230 = 0; local1230 < 3; local1230++) {
							local1228 += arg7[local1230 + local1224 * 3] * local982[local1220 * 3 + local1230];
						}
						local1218[local1224 + local1220 * 3] = local1228 + 8192 >> 14;
					}
				}
				local1224 = local260 * local982[0] + local53 * local982[1] + local982[2] * local59 + 8192 >> 14;
				local1228 = local982[5] * local59 + local53 * local982[4] + local982[3] * local260 + 8192 >> 14;
				local1230 = local982[7] * local53 + local260 * local982[6] + local59 * local982[8] + 8192 >> 14;
				local1224 += local1207;
				local1228 += local1211;
				local1230 += local1215;
				local1363 = new int[9];
				for (local1365 = 0; local1365 < 3; local1365++) {
					for (local1369 = 0; local1369 < 3; local1369++) {
						local1373 = 0;
						for (local1375 = 0; local1375 < 3; local1375++) {
							local1373 += arg7[local1375 + local1365 * 3] * local1218[local1375 * 3 + local1369];
						}
						local1363[local1365 * 3 + local1369] = local1373 + 8192 >> 14;
					}
				}
				local1369 = arg7[2] * local1230 + local1228 * arg7[1] + local1224 * arg7[0] + 8192 >> 14;
				local1373 = arg7[5] * local1230 + local1224 * arg7[3] + arg7[4] * local1228 + 8192 >> 14;
				local1369 += local27;
				local1375 = arg7[7] * local1228 + local1224 * arg7[6] + arg7[8] * local1230 + 8192 >> 14;
				local1373 += local35;
				local1375 += local41;
				for (local1502 = 0; local1502 < local8; local1502++) {
					@Pc(1508) int local1508 = arg1[local1502];
					if (local1508 < this.anIntArrayArray26.length) {
						@Pc(1518) int[] local1518 = this.anIntArrayArray26[local1508];
						for (@Pc(1520) int local1520 = 0; local1520 < local1518.length; local1520++) {
							@Pc(1526) int local1526 = local1518[local1520];
							if (this.aShortArray67 == null || (this.aShortArray67[local1526] & arg6) != 0) {
								@Pc(1568) int local1568 = this.anIntArray315[local1526] * local1363[1] + local1363[0] * this.anIntArray314[local1526] + this.anIntArray313[local1526] * local1363[2] + 8192 >> 14;
								@Pc(1600) int local1600 = this.anIntArray314[local1526] * local1363[3] + this.anIntArray315[local1526] * local1363[4] + this.anIntArray313[local1526] * local1363[5] + 8192 >> 14;
								@Pc(1604) int local1604 = local1600 + local1373;
								@Pc(1636) int local1636 = local1363[6] * this.anIntArray314[local1526] + local1363[7] * this.anIntArray315[local1526] + local1363[8] * this.anIntArray313[local1526] + 8192 >> 14;
								@Pc(1640) int local1640 = local1568 + local1369;
								this.anIntArray314[local1526] = local1640;
								@Pc(1649) int local1649 = local1636 + local1375;
								this.anIntArray315[local1526] = local1604;
								this.anIntArray313[local1526] = local1649;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2575) Class391 local2575;
			@Pc(2580) Class301 local2580;
			if (arg0 == 5) {
				if (this.anIntArrayArray28 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray28.length > local35) {
							local258 = this.anIntArrayArray28[local35];
							for (local260 = 0; local260 < local258.length; local260++) {
								local53 = local258[local260];
								if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray50[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray50[local53] = (byte) local59;
									if (this.aClass91_3 != null) {
										this.aClass91_3.anInterface8_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass391Array1 != null) {
						for (local35 = 0; local35 < this.anInt3854; local35++) {
							local2575 = this.aClass391Array1[local35];
							local2580 = this.aClass301Array1[local35];
							local2580.anInt8993 = 255 - (this.aByteArray50[local2575.anInt11146] & 0xFF) << 24 | local2580.anInt8993 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2837) Class301 local2837;
				if (arg0 == 8) {
					if (this.anIntArrayArray27 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray27.length) {
								local258 = this.anIntArrayArray27[local35];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2837 = this.aClass301Array1[local258[local260]];
									local2837.anInt8991 += arg3;
									local2837.anInt8985 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray27 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray27.length > local35) {
								local258 = this.anIntArrayArray27[local35];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2837 = this.aClass301Array1[local258[local260]];
									local2837.anInt8989 = local2837.anInt8989 * arg3 >> 7;
									local2837.anInt8992 = local2837.anInt8992 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray27 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray27.length) {
							local258 = this.anIntArrayArray27[local35];
							for (local260 = 0; local260 < local258.length; local260++) {
								local2837 = this.aClass301Array1[local258[local260]];
								local2837.anInt8987 = local2837.anInt8987 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray28 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray28.length) {
						local258 = this.anIntArrayArray28[local35];
						for (local260 = 0; local260 < local258.length; local260++) {
							local53 = local258[local260];
							if (this.aShortArray66 == null || (this.aShortArray66[local53] & arg6) != 0) {
								local59 = this.aShortArray58[local53] & 0xFFFF;
								local388 = local59 >> 10 & 0x3F;
								local406 = local59 >> 7 & 0x7;
								@Pc(2677) int local2677 = local388 + arg2 & 0x3F;
								local630 = local59 & 0x7F;
								local406 += arg3 / 4;
								local630 += arg4;
								if (local406 < 0) {
									local406 = 0;
								} else if (local406 > 7) {
									local406 = 7;
								}
								if (local630 < 0) {
									local630 = 0;
								} else if (local630 > 127) {
									local630 = 127;
								}
								this.aShortArray58[local53] = (short) (local630 | local406 << 7 | local2677 << 10);
								if (this.aClass91_3 != null) {
									this.aClass91_3.anInterface8_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass391Array1 != null) {
					for (local35 = 0; local35 < this.anInt3854; local35++) {
						local2575 = this.aClass391Array1[local35];
						local2580 = this.aClass301Array1[local35];
						local2580.anInt8993 = local2580.anInt8993 & 0xFF000000 | Static659.anIntArray816[this.aShortArray58[local2575.anInt11146] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray26.length > local35) {
					local258 = this.anIntArrayArray26[local35];
					for (local260 = 0; local260 < local258.length; local260++) {
						local53 = local258[local260];
						if (this.aShortArray67 == null || (this.aShortArray67[local53] & arg6) != 0) {
							this.anIntArray314[local53] -= Static208.anInt3938;
							this.anIntArray315[local53] -= Static28.anInt703;
							this.anIntArray313[local53] -= Static296.anInt6295;
							this.anIntArray314[local53] = arg2 * this.anIntArray314[local53] >> 7;
							this.anIntArray315[local53] = arg3 * this.anIntArray315[local53] >> 7;
							this.anIntArray313[local53] = arg4 * this.anIntArray313[local53] >> 7;
							this.anIntArray314[local53] += Static208.anInt3938;
							this.anIntArray315[local53] += Static28.anInt703;
							this.anIntArray313[local53] += Static296.anInt6295;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local260 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static519.aBoolean633) {
				local388 = arg7[0] * Static208.anInt3938 + Static28.anInt703 * arg7[3] + arg7[6] * Static296.anInt6295 + 8192 >> 14;
				local406 = arg7[4] * Static28.anInt703 + Static208.anInt3938 * arg7[1] + Static296.anInt6295 * arg7[7] + 8192 >> 14;
				local630 = Static208.anInt3938 * arg7[2] + Static28.anInt703 * arg7[5] + Static296.anInt6295 * arg7[8] + 8192 >> 14;
				local388 += local260;
				local406 += local53;
				Static208.anInt3938 = local388;
				Static28.anInt703 = local406;
				local630 += local59;
				Static519.aBoolean633 = false;
				Static296.anInt6295 = local630;
			}
			local388 = arg2 << 15 >> 7;
			local406 = arg3 << 15 >> 7;
			local630 = arg4 << 15 >> 7;
			local639 = -Static208.anInt3938 * local388 + 8192 >> 14;
			local649 = -Static28.anInt703 * local406 + 8192 >> 14;
			local653 = -Static296.anInt6295 * local630 + 8192 >> 14;
			local672 = Static208.anInt3938 + local639;
			local1014 = local649 + Static28.anInt703;
			local1022 = local653 + Static296.anInt6295;
			@Pc(2008) int[] local2008 = new int[] { local388 * arg7[0] + 8192 >> 14, local388 * arg7[3] + 8192 >> 14, local388 * arg7[6] + 8192 >> 14, arg7[1] * local406 + 8192 >> 14, local406 * arg7[4] + 8192 >> 14, local406 * arg7[7] + 8192 >> 14, arg7[2] * local630 + 8192 >> 14, arg7[5] * local630 + 8192 >> 14, arg7[8] * local630 + 8192 >> 14 };
			local1178 = local388 * local260 + 8192 >> 14;
			local1203 = local53 * local406 + 8192 >> 14;
			local1207 = local59 * local630 + 8192 >> 14;
			@Pc(2144) int local2144 = local1178 + local672;
			@Pc(2148) int local2148 = local1203 + local1014;
			@Pc(2152) int local2152 = local1207 + local1022;
			@Pc(2155) int[] local2155 = new int[9];
			@Pc(2161) int local2161;
			for (local1215 = 0; local1215 < 3; local1215++) {
				for (local2161 = 0; local2161 < 3; local2161++) {
					local1220 = 0;
					for (local1224 = 0; local1224 < 3; local1224++) {
						local1220 += local2008[local1224 * 3 + local2161] * arg7[local1215 * 3 + local1224];
					}
					local2155[local1215 * 3 + local2161] = local1220 + 8192 >> 14;
				}
			}
			local2161 = local2144 * arg7[0] + local2148 * arg7[1] + arg7[2] * local2152 + 8192 >> 14;
			local1220 = arg7[4] * local2148 + local2144 * arg7[3] + local2152 * arg7[5] + 8192 >> 14;
			local1220 += local35;
			local1224 = local2152 * arg7[8] + local2144 * arg7[6] + arg7[7] * local2148 + 8192 >> 14;
			local2161 += local27;
			local1224 += local41;
			for (local1228 = 0; local1228 < local8; local1228++) {
				local1230 = arg1[local1228];
				if (local1230 < this.anIntArrayArray26.length) {
					local1363 = this.anIntArrayArray26[local1230];
					for (local1365 = 0; local1365 < local1363.length; local1365++) {
						local1369 = local1363[local1365];
						if (this.aShortArray67 == null || (this.aShortArray67[local1369] & arg6) != 0) {
							local1373 = this.anIntArray314[local1369] * local2155[0] + local2155[1] * this.anIntArray315[local1369] + local2155[2] * this.anIntArray313[local1369] + 8192 >> 14;
							local1375 = local2155[4] * this.anIntArray315[local1369] + local2155[3] * this.anIntArray314[local1369] + this.anIntArray313[local1369] * local2155[5] + 8192 >> 14;
							@Pc(2404) int local2404 = local1375 + local1220;
							local1502 = this.anIntArray313[local1369] * local2155[8] + this.anIntArray315[local1369] * local2155[7] + this.anIntArray314[local1369] * local2155[6] + 8192 >> 14;
							@Pc(2439) int local2439 = local1373 + local2161;
							this.anIntArray314[local1369] = local2439;
							@Pc(2448) int local2448 = local1502 + local1224;
							this.anIntArray315[local1369] = local2404;
							this.anIntArray313[local1369] = local2448;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hba", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort58;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZILclient!qja;III)Z")
	private boolean method3244(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class26 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class26_Sub3 local8 = (Class26_Sub3) arg3;
		@Pc(12) Class26_Sub3 local12 = this.aClass137_Sub3_13.aClass26_Sub3_3;
		@Pc(33) float local33 = local8.aFloat176 * local12.aFloat172 + local8.aFloat178 * local12.aFloat177 + local12.aFloat173 * local8.aFloat171 + local12.aFloat176;
		@Pc(54) float local54 = local12.aFloat178 + local8.aFloat176 * local12.aFloat182 + local8.aFloat178 * local12.aFloat180 + local8.aFloat171 * local12.aFloat174;
		Static647.aFloat265 = local8.aFloat175 * local12.aFloat179 + local12.aFloat175 * local8.aFloat180 + local12.aFloat181 * local8.aFloat177;
		Static247.aFloat97 = local8.aFloat174 * local12.aFloat180 + local12.aFloat182 * local8.aFloat173 + local12.aFloat174 * local8.aFloat179;
		Static611.aFloat258 = local12.aFloat173 * local8.aFloat179 + local8.aFloat173 * local12.aFloat172 + local8.aFloat174 * local12.aFloat177;
		Static635.aFloat261 = local8.aFloat181 * local12.aFloat174 + local12.aFloat180 * local8.aFloat182 + local8.aFloat172 * local12.aFloat182;
		Static133.aFloat59 = local12.aFloat174 * local8.aFloat175 + local12.aFloat182 * local8.aFloat177 + local8.aFloat180 * local12.aFloat180;
		Static205.aFloat78 = local8.aFloat181 * local12.aFloat179 + local12.aFloat175 * local8.aFloat182 + local12.aFloat181 * local8.aFloat172;
		Static283.aFloat102 = local8.aFloat180 * local12.aFloat177 + local8.aFloat177 * local12.aFloat172 + local12.aFloat173 * local8.aFloat175;
		Static653.aFloat266 = local8.aFloat174 * local12.aFloat175 + local8.aFloat173 * local12.aFloat181 + local12.aFloat179 * local8.aFloat179;
		Static321.aFloat146 = local8.aFloat182 * local12.aFloat177 + local8.aFloat172 * local12.aFloat172 + local12.aFloat173 * local8.aFloat181;
		@Pc(242) float local242 = local8.aFloat176 * local12.aFloat181 + local12.aFloat175 * local8.aFloat178 + local12.aFloat179 * local8.aFloat171 + local12.aFloat171;
		@Pc(244) boolean local244 = false;
		@Pc(246) float local246 = Float.MAX_VALUE;
		@Pc(248) float local248 = -3.4028235E38F;
		@Pc(250) float local250 = Float.MAX_VALUE;
		@Pc(252) float local252 = -3.4028235E38F;
		@Pc(256) int local256 = this.aClass137_Sub3_13.anInt8566;
		@Pc(260) int local260 = this.aClass137_Sub3_13.anInt8578;
		if (!this.aBoolean283) {
			this.method3234();
		}
		@Pc(275) int local275 = this.aShort53 - this.aShort58 >> 1;
		@Pc(284) int local284 = this.aShort51 - this.aShort57 >> 1;
		@Pc(293) int local293 = this.aShort52 - this.aShort60 >> 1;
		@Pc(298) int local298 = local275 + this.aShort58;
		@Pc(303) int local303 = this.aShort57 + local284;
		@Pc(308) int local308 = local293 + this.aShort60;
		@Pc(315) int local315 = local298 - (local275 << arg5);
		@Pc(322) int local322 = local303 - (local284 << arg5);
		@Pc(328) int local328 = local308 - (local293 << arg5);
		@Pc(334) int local334 = local298 + (local275 << arg5);
		@Pc(341) int local341 = local303 + (local284 << arg5);
		Static287.anIntArray396[0] = local315;
		@Pc(351) int local351 = local308 + (local293 << arg5);
		Static46.anIntArray85[0] = local322;
		Static287.anIntArray396[1] = local334;
		Static192.anIntArray301[0] = local328;
		Static46.anIntArray85[1] = local322;
		Static192.anIntArray301[1] = local328;
		Static287.anIntArray396[2] = local315;
		Static46.anIntArray85[2] = local341;
		Static192.anIntArray301[2] = local328;
		Static287.anIntArray396[3] = local334;
		Static46.anIntArray85[3] = local341;
		Static192.anIntArray301[3] = local328;
		Static287.anIntArray396[4] = local315;
		Static46.anIntArray85[4] = local322;
		Static287.anIntArray396[5] = local334;
		Static192.anIntArray301[4] = local351;
		Static46.anIntArray85[5] = local322;
		Static287.anIntArray396[6] = local315;
		Static192.anIntArray301[5] = local351;
		Static46.anIntArray85[6] = local341;
		Static192.anIntArray301[6] = local351;
		Static287.anIntArray396[7] = local334;
		Static46.anIntArray85[7] = local341;
		Static192.anIntArray301[7] = local351;
		@Pc(476) float local476;
		@Pc(504) float local504;
		@Pc(490) float local490;
		@Pc(457) float local457;
		@Pc(452) float local452;
		@Pc(462) float local462;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = (float) Static46.anIntArray85[local445];
			local457 = (float) Static287.anIntArray396[local445];
			local462 = (float) Static192.anIntArray301[local445];
			local476 = local33 + local462 * Static611.aFloat258 + local457 * Static321.aFloat146 + local452 * Static283.aFloat102;
			local490 = local242 + local462 * Static653.aFloat266 + Static647.aFloat265 * local452 + local457 * Static205.aFloat78;
			local504 = local54 + Static133.aFloat59 * local452 + local457 * Static635.aFloat261 + local462 * Static247.aFloat97;
			if ((float) this.aClass137_Sub3_13.anInt8561 <= local490) {
				if (arg4 > 0) {
					local490 = (float) arg4;
				}
				@Pc(528) float local528 = (float) local256 * local476 / local490 + (float) this.aClass137_Sub3_13.anInt8584;
				if (local248 < local528) {
					local248 = local528;
				}
				@Pc(546) float local546 = (float) local260 * local504 / local490 + (float) this.aClass137_Sub3_13.anInt8559;
				if (local246 > local528) {
					local246 = local528;
				}
				if (local252 < local546) {
					local252 = local546;
				}
				if (local250 > local546) {
					local250 = local546;
				}
				local244 = true;
			}
		}
		if (local244 && local246 < (float) arg2 && (float) arg2 < local248 && (float) arg0 > local250 && (float) arg0 < local252) {
			if (arg1) {
				return true;
			}
			if (this.aClass137_Sub3_13.anIntArray632.length < this.anInt3841) {
				this.aClass137_Sub3_13.anIntArray633 = new int[this.anInt3841];
				this.aClass137_Sub3_13.anIntArray632 = new int[this.anInt3841];
			}
			@Pc(619) int[] local619 = this.aClass137_Sub3_13.anIntArray632;
			@Pc(623) int[] local623 = this.aClass137_Sub3_13.anIntArray633;
			@Pc(699) int local699;
			for (@Pc(625) int local625 = 0; local625 < this.anInt3870; local625++) {
				local462 = (float) this.anIntArray313[local625];
				local457 = (float) this.anIntArray314[local625];
				local452 = (float) this.anIntArray315[local625];
				local476 = local452 * Static283.aFloat102 + local457 * Static321.aFloat146 + Static611.aFloat258 * local462 + local33;
				local504 = Static635.aFloat261 * local457 + local452 * Static133.aFloat59 + Static247.aFloat97 * local462 + local54;
				local490 = local462 * Static653.aFloat266 + Static647.aFloat265 * local452 + Static205.aFloat78 * local457 + local242;
				@Pc(706) int local706;
				@Pc(708) int local708;
				@Pc(717) int local717;
				if ((float) this.aClass137_Sub3_13.anInt8561 <= local490) {
					if (arg4 > 0) {
						local490 = (float) arg4;
					}
					local699 = (int) ((float) this.aClass137_Sub3_13.anInt8584 + (float) local256 * local476 / local490);
					local706 = (int) (local504 * (float) local260 / local490 + (float) this.aClass137_Sub3_13.anInt8559);
					local708 = this.anIntArray317[local625];
					local717 = this.anIntArray317[local625 + 1];
					for (@Pc(785) int local785 = local708; local785 < local717; local785++) {
						@Pc(794) int local794 = this.aShortArray63[local785] - 1;
						if (local794 == -1) {
							break;
						}
						local619[local794] = local699;
						local623[local794] = local706;
					}
				} else {
					local699 = this.anIntArray317[local625];
					local706 = this.anIntArray317[local625 + 1];
					for (local708 = local699; local708 < local706; local708++) {
						local717 = this.aShortArray63[local708] - 1;
						if (local717 == -1) {
							break;
						}
						local619[this.aShortArray63[local708] - 1] = -999999;
					}
				}
			}
			for (local699 = 0; local699 < this.anInt3887; local699++) {
				if (local619[this.aShortArray65[local699]] != -999999 && local619[this.aShortArray64[local699]] != -999999 && local619[this.aShortArray59[local699]] != -999999 && this.method3236(arg0, local623[this.aShortArray65[local699]], local619[this.aShortArray65[local699]], arg2, local619[this.aShortArray59[local699]], local619[this.aShortArray64[local699]], local623[this.aShortArray64[local699]], local623[this.aShortArray59[local699]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hba", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort57;
	}

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "()V")
	@Override
	protected void method6381() {
	}

	@OriginalMember(owner = "client!hba", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean283) {
			this.method3234();
		}
		return this.aShort52;
	}

	@OriginalMember(owner = "client!hba", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean285;
	}
}
