import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vo")
public final class Class187_Sub3 extends Class187 {

	@OriginalMember(owner = "client!vo", name = "n", descriptor = "[F")
	private float[] aFloatArray76;

	@OriginalMember(owner = "client!vo", name = "q", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!vo", name = "t", descriptor = "[S")
	private short[] aShortArray143;

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!vo", name = "x", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "[F")
	private float[] aFloatArray77;

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "[Lclient!nv;")
	private Class254[] aClass254Array1;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[S")
	private short[] aShortArray146;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!vo", name = "L", descriptor = "[I")
	private int[] anIntArray580;

	@OriginalMember(owner = "client!vo", name = "M", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!vo", name = "O", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!vo", name = "T", descriptor = "[I")
	private int[] anIntArray581;

	@OriginalMember(owner = "client!vo", name = "V", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!vo", name = "W", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!vo", name = "X", descriptor = "S")
	private short aShort125;

	@OriginalMember(owner = "client!vo", name = "Y", descriptor = "[[I")
	private int[][] anIntArrayArray73;

	@OriginalMember(owner = "client!vo", name = "ab", descriptor = "[B")
	private byte[] aByteArray106;

	@OriginalMember(owner = "client!vo", name = "cb", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!vo", name = "jb", descriptor = "[[I")
	private int[][] anIntArrayArray74;

	@OriginalMember(owner = "client!vo", name = "nb", descriptor = "[[I")
	private int[][] anIntArrayArray75;

	@OriginalMember(owner = "client!vo", name = "rb", descriptor = "[Lclient!sn;")
	private Class320[] aClass320Array4;

	@OriginalMember(owner = "client!vo", name = "Bb", descriptor = "[I")
	private int[] anIntArray582;

	@OriginalMember(owner = "client!vo", name = "Cb", descriptor = "I")
	private int anInt10152;

	@OriginalMember(owner = "client!vo", name = "Db", descriptor = "[I")
	private int[] anIntArray583;

	@OriginalMember(owner = "client!vo", name = "Nb", descriptor = "I")
	private int anInt10161;

	@OriginalMember(owner = "client!vo", name = "Pb", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!vo", name = "Vb", descriptor = "S")
	private short aShort126;

	@OriginalMember(owner = "client!vo", name = "Wb", descriptor = "[B")
	private byte[] aByteArray107;

	@OriginalMember(owner = "client!vo", name = "Xb", descriptor = "S")
	private short aShort127;

	@OriginalMember(owner = "client!vo", name = "Yb", descriptor = "Lclient!sf;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!vo", name = "Zb", descriptor = "S")
	private short aShort128;

	@OriginalMember(owner = "client!vo", name = "gc", descriptor = "[Lclient!ou;")
	private Class261[] aClass261Array5;

	@OriginalMember(owner = "client!vo", name = "pc", descriptor = "B")
	private byte aByte130;

	@OriginalMember(owner = "client!vo", name = "qc", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!vo", name = "rc", descriptor = "[S")
	private short[] aShortArray151;

	@OriginalMember(owner = "client!vo", name = "sc", descriptor = "Lclient!js;")
	private Interface10 anInterface10_7;

	@OriginalMember(owner = "client!vo", name = "tc", descriptor = "[Lclient!nca;")
	private Class241[] aClass241Array1;

	@OriginalMember(owner = "client!vo", name = "uc", descriptor = "[S")
	private short[] aShortArray152;

	@OriginalMember(owner = "client!vo", name = "wc", descriptor = "Lclient!sda;")
	private Interface21 anInterface21_5;

	@OriginalMember(owner = "client!vo", name = "Ac", descriptor = "S")
	private short aShort129;

	@OriginalMember(owner = "client!vo", name = "Bc", descriptor = "I")
	private int anInt10178;

	@OriginalMember(owner = "client!vo", name = "Dc", descriptor = "[I")
	private int[] anIntArray585;

	@OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
	private int anInt10121 = 0;

	@OriginalMember(owner = "client!vo", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "Z")
	private boolean aBoolean727 = false;

	@OriginalMember(owner = "client!vo", name = "qb", descriptor = "I")
	private int anInt10143 = 0;

	@OriginalMember(owner = "client!vo", name = "vc", descriptor = "I")
	private int anInt10175 = 0;

	@OriginalMember(owner = "client!vo", name = "hc", descriptor = "Z")
	private boolean aBoolean730 = false;

	@OriginalMember(owner = "client!vo", name = "bb", descriptor = "I")
	private int anInt10133 = 0;

	@OriginalMember(owner = "client!vo", name = "dc", descriptor = "Z")
	private boolean aBoolean729 = false;

	@OriginalMember(owner = "client!vo", name = "Jb", descriptor = "Z")
	private boolean aBoolean728 = true;

	@OriginalMember(owner = "client!vo", name = "Z", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_37;

	@OriginalMember(owner = "client!vo", name = "fb", descriptor = "Lclient!ak;")
	private Class18 aClass18_12;

	@OriginalMember(owner = "client!vo", name = "Tb", descriptor = "Lclient!ak;")
	private Class18 aClass18_14;

	@OriginalMember(owner = "client!vo", name = "jc", descriptor = "Lclient!ak;")
	private Class18 aClass18_15;

	@OriginalMember(owner = "client!vo", name = "wb", descriptor = "Lclient!ak;")
	private Class18 aClass18_13;

	@OriginalMember(owner = "client!vo", name = "l", descriptor = "Lclient!ig;")
	private Class159 aClass159_1;

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class187_Sub3(@OriginalArg(0) Class133_Sub3 arg0) {
		this.aClass133_Sub3_37 = arg0;
		this.aClass18_12 = new Class18(null, 5126, 3, 0);
		this.aClass18_14 = new Class18(null, 5126, 2, 0);
		this.aClass18_15 = new Class18(null, 5126, 3, 0);
		this.aClass18_13 = new Class18(null, 5121, 4, 0);
		this.aClass159_1 = new Class159();
	}

	@OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lclient!rs;Lclient!b;IIII)V")
	public Class187_Sub3(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10152 = arg2;
		this.aClass133_Sub3_37 = arg0;
		this.anInt10178 = arg5;
		if (Static549.method8015(arg5, arg2)) {
			this.aClass18_12 = new Class18(null, 5126, 3, 0);
		}
		if (Static214.method3666(arg2, arg5)) {
			this.aClass18_14 = new Class18(null, 5126, 2, 0);
		}
		if (Static378.method5551(arg5, arg2)) {
			this.aClass18_15 = new Class18(null, 5126, 3, 0);
		}
		if (Static165.method9035(arg2, arg5)) {
			this.aClass18_13 = new Class18(null, 5121, 4, 0);
		}
		if (Static173.method2686(arg5, arg2)) {
			this.aClass159_1 = new Class159();
		}
		@Pc(108) Interface3 local108 = arg0.anInterface3_12;
		@Pc(112) int[] local112 = new int[arg1.anInt390];
		this.anIntArray585 = new int[arg1.anInt377 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt390; local121++) {
			if (arg1.aByteArray7 == null || arg1.aByteArray7[local121] != 2) {
				if (arg1.aShortArray16 != null && arg1.aShortArray16[local121] != -1) {
					@Pc(151) Class145 local151 = local108.method4656(arg1.aShortArray16[local121] & 0xFFFF);
					if (((this.anInt10178 & 0x40) == 0 || !local151.aBoolean291) && local151.aBoolean294) {
						continue;
					}
				}
				local112[this.lb++] = local121;
				this.anIntArray585[arg1.aShortArray9[local121]]++;
				this.anIntArray585[arg1.aShortArray17[local121]]++;
				this.anIntArray585[arg1.aShortArray18[local121]]++;
			}
		}
		this.anInt10175 = this.lb;
		@Pc(224) long[] local224 = new long[this.lb];
		@Pc(233) boolean local233 = (this.anInt10152 & 0x100) != 0;
		@Pc(245) int local245;
		@Pc(258) int local258;
		@Pc(438) int local438;
		for (@Pc(235) int local235 = 0; local235 < this.lb; local235++) {
			@Pc(241) int local241 = local112[local235];
			@Pc(243) Class145 local243 = null;
			local245 = 0;
			@Pc(247) byte local247 = 0;
			@Pc(249) byte local249 = 0;
			@Pc(251) byte local251 = 0;
			if (arg1.aClass257Array1 != null) {
				@Pc(256) boolean local256 = false;
				for (local258 = 0; local258 < arg1.aClass257Array1.length; local258++) {
					@Pc(265) Class257 local265 = arg1.aClass257Array1[local258];
					if (local241 == local265.anInt6698) {
						@Pc(274) Class70 local274 = Static128.method59(local265.anInt6691);
						if (local274.aBoolean138) {
							local256 = true;
						}
						if (local274.anInt1880 != -1) {
							@Pc(290) Class145 local290 = local108.method4656(local274.anInt1880);
							if (local290.anInt3988 == 2) {
								this.aBoolean727 = true;
							}
						}
					}
				}
				if (local256) {
					local224[local235] = Long.MAX_VALUE;
					this.anInt10175--;
					continue;
				}
			}
			@Pc(321) short local321 = -1;
			if (arg1.aShortArray16 != null) {
				local321 = arg1.aShortArray16[local241];
				if (local321 != -1) {
					local243 = local108.method4656(local321 & 0xFFFF);
					if ((this.anInt10178 & 0x40) != 0 && local243.aBoolean291) {
						local243 = null;
						local321 = -1;
					} else {
						local251 = local243.aByte64;
						if (local243.aByte62 != 0 || local243.aByte65 != 0) {
							this.aBoolean730 = true;
						}
						local249 = local243.aByte68;
					}
				}
			}
			@Pc(400) boolean local400 = arg1.aByteArray10 != null && arg1.aByteArray10[local241] != 0 || local243 != null && local243.anInt3988 != 0;
			if ((local233 || local400) && arg1.aByteArray4 != null) {
				local245 += arg1.aByteArray4[local241] << 17;
			}
			if (local400) {
				local245 += 65536;
			}
			local245 += (local249 & 0xFF) << 8;
			local438 = local247 + ((local321 & 0xFFFF) << 16);
			local245 += local251 & 0xFF;
			@Pc(450) int local450 = local438 + (local235 & 0xFFFF);
			local224[local235] = ((long) local245 << 32) + (long) local450;
			this.aBoolean727 |= local400;
			this.aBoolean730 |= local243 != null && (local243.aByte62 != 0 || local243.aByte65 != 0);
		}
		Static126.method1894(local112, local224);
		this.anIntArray580 = arg1.anIntArray16;
		this.anIntArray583 = arg1.anIntArray17;
		this.anInt10133 = arg1.anInt377;
		this.anIntArray582 = arg1.anIntArray22;
		this.anInt10121 = arg1.anInt386;
		this.aShortArray149 = arg1.aShortArray14;
		this.aClass261Array5 = arg1.aClass261Array1;
		@Pc(526) Class327[] local526 = new Class327[this.anInt10133];
		this.aClass320Array4 = arg1.aClass320Array1;
		@Pc(550) int local550;
		@Pc(564) int local564;
		@Pc(611) int local611;
		if (arg1.aClass257Array1 != null) {
			this.anInt10161 = arg1.aClass257Array1.length;
			this.aClass241Array1 = new Class241[this.anInt10161];
			this.aClass254Array1 = new Class254[this.anInt10161];
			for (local550 = 0; local550 < this.anInt10161; local550++) {
				@Pc(557) Class257 local557 = arg1.aClass257Array1[local550];
				@Pc(562) Class70 local562 = Static128.method59(local557.anInt6691);
				local564 = -1;
				for (@Pc(566) int local566 = 0; local566 < this.lb; local566++) {
					if (local557.anInt6698 == local112[local566]) {
						local564 = local566;
						break;
					}
				}
				if (local564 == -1) {
					throw new RuntimeException();
				}
				local611 = Static349.anIntArray330[arg1.aShortArray15[local557.anInt6698] & 0xFFFF] & 0xFFFFFF;
				@Pc(628) int local628 = local611 | 255 - (arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local557.anInt6698]) << 24;
				this.aClass254Array1[local550] = new Class254(local564, arg1.aShortArray9[local557.anInt6698], arg1.aShortArray17[local557.anInt6698], arg1.aShortArray18[local557.anInt6698], local562.anInt1882, local562.anInt1884, local562.anInt1880, local562.anInt1883, local562.anInt1881, local562.aBoolean138, local562.aBoolean139, local557.anInt6695);
				this.aClass241Array1[local550] = new Class241(local628);
			}
		}
		local550 = this.lb * 3;
		this.aShortArray145 = new short[this.lb];
		this.aByteArray106 = new byte[this.lb];
		this.aShortArray142 = new short[this.lb];
		this.aShort127 = (short) arg4;
		this.aShortArray144 = new short[local550];
		this.aByteArray107 = new byte[local550];
		this.aShortArray147 = new short[local550];
		this.aFloatArray77 = new float[local550];
		Static199.aLongArray2 = new long[local550];
		if (arg1.aShortArray11 != null) {
			this.aShortArray148 = new short[this.lb];
		}
		this.aShort121 = (short) arg3;
		this.aShortArray150 = new short[local550];
		this.aFloatArray76 = new float[local550];
		this.aShortArray146 = new short[this.lb];
		this.aShortArray143 = new short[this.lb];
		this.aShortArray151 = new short[local550];
		this.aShortArray152 = new short[this.lb];
		local245 = 0;
		for (local438 = 0; local438 < arg1.anInt377; local438++) {
			local564 = this.anIntArray585[local438];
			this.anIntArray585[local438] = local245;
			local526[local438] = new Class327();
			local245 += local564;
		}
		this.anIntArray585[arg1.anInt377] = local245;
		@Pc(810) Class76 local810 = Static415.method6353(local112, arg1, this.lb);
		@Pc(814) Class218[] local814 = new Class218[arg1.anInt390];
		@Pc(854) int local854;
		@Pc(865) int local865;
		@Pc(887) int local887;
		@Pc(898) int local898;
		@Pc(907) int local907;
		@Pc(916) int local916;
		@Pc(833) short local833;
		@Pc(843) int local843;
		for (local611 = 0; local611 < arg1.anInt390; local611++) {
			@Pc(823) short local823 = arg1.aShortArray9[local611];
			@Pc(828) short local828 = arg1.aShortArray17[local611];
			local833 = arg1.aShortArray18[local611];
			local843 = this.anIntArray580[local828] - this.anIntArray580[local823];
			local854 = this.anIntArray582[local828] - this.anIntArray582[local823];
			local865 = this.anIntArray583[local828] - this.anIntArray583[local823];
			@Pc(876) int local876 = this.anIntArray580[local833] - this.anIntArray580[local823];
			local887 = this.anIntArray582[local833] - this.anIntArray582[local823];
			local898 = this.anIntArray583[local833] - this.anIntArray583[local823];
			local907 = local854 * local898 - local865 * local887;
			local916 = local876 * local865 - local898 * local843;
			@Pc(925) int local925 = local843 * local887 - local876 * local854;
			while (local907 > 8192 || local916 > 8192 || local925 > 8192 || local907 < -8192 || local916 < -8192 || local925 < -8192) {
				local925 >>= 0x1;
				local907 >>= 0x1;
				local916 >>= 0x1;
			}
			@Pc(974) int local974 = (int) Math.sqrt((double) (local925 * local925 + local916 * local916 + local907 * local907));
			if (local974 <= 0) {
				local974 = 1;
			}
			local916 = local916 * 256 / local974;
			local925 = local925 * 256 / local974;
			local907 = local907 * 256 / local974;
			@Pc(1006) byte local1006 = arg1.aByteArray7 == null ? 0 : arg1.aByteArray7[local611];
			if (local1006 == 0) {
				@Pc(1015) Class327 local1015 = local526[local823];
				local1015.anInt9104 += local907;
				local1015.anInt9102 += local925;
				local1015.anInt9106++;
				local1015.anInt9105 += local916;
				@Pc(1043) Class327 local1043 = local526[local828];
				local1043.anInt9102 += local925;
				local1043.anInt9104 += local907;
				local1043.anInt9106++;
				local1043.anInt9105 += local916;
				@Pc(1071) Class327 local1071 = local526[local833];
				local1071.anInt9106++;
				local1071.anInt9105 += local916;
				local1071.anInt9102 += local925;
				local1071.anInt9104 += local907;
			} else if (local1006 == 1) {
				@Pc(1110) Class218 local1110 = local814[local611] = new Class218();
				local1110.anInt5452 = local907;
				local1110.anInt5451 = local925;
				local1110.anInt5450 = local916;
			}
		}
		@Pc(1136) int local1136;
		@Pc(1179) short local1179;
		for (local258 = 0; local258 < this.lb; local258++) {
			local1136 = local112[local258];
			@Pc(1143) int local1143 = arg1.aShortArray15[local1136] & 0xFFFF;
			if (arg1.aByteArray9 == null) {
				local843 = -1;
			} else {
				local843 = arg1.aByteArray9[local1136];
			}
			if (arg1.aByteArray10 == null) {
				local854 = 0;
			} else {
				local854 = arg1.aByteArray10[local1136] & 0xFF;
			}
			local1179 = arg1.aShortArray16 == null ? -1 : arg1.aShortArray16[local1136];
			if (local1179 != -1 && (this.anInt10178 & 0x40) != 0) {
				@Pc(1194) Class145 local1194 = local108.method4656(local1179 & 0xFFFF);
				if (local1194.aBoolean291) {
					local1179 = -1;
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
			@Pc(1233) byte local1233;
			@Pc(1253) short local1253;
			@Pc(1258) short local1258;
			@Pc(1263) short local1263;
			if (local1179 != -1) {
				if (local843 == -1) {
					local1203 = 1.0F;
					local1213 = 1;
					local1205 = 1.0F;
					local1209 = 0.0F;
					local1207 = 1.0F;
					local1215 = 2;
					local1201 = 0.0F;
					local1211 = 0.0F;
				} else {
					local843 &= 0xFF;
					local1233 = arg1.aByteArray5[local843];
					@Pc(1243) short local1243;
					@Pc(1248) short local1248;
					@Pc(1286) float local1286;
					@Pc(1295) float local1295;
					@Pc(1303) float local1303;
					@Pc(1389) float local1389;
					@Pc(1397) float local1397;
					@Pc(1406) float local1406;
					@Pc(1415) float local1415;
					@Pc(1424) float local1424;
					@Pc(1433) float local1433;
					if (local1233 == 0) {
						local1243 = arg1.aShortArray9[local1136];
						local1248 = arg1.aShortArray17[local1136];
						local1253 = arg1.aShortArray18[local1136];
						local1258 = arg1.aShortArray13[local843];
						local1263 = arg1.aShortArray12[local843];
						@Pc(1268) short local1268 = arg1.aShortArray10[local843];
						@Pc(1274) float local1274 = (float) arg1.anIntArray16[local1258];
						@Pc(1280) float local1280 = (float) arg1.anIntArray22[local1258];
						local1286 = arg1.anIntArray17[local1258];
						local1295 = (float) arg1.anIntArray16[local1263] - local1274;
						local1303 = (float) arg1.anIntArray22[local1263] - local1280;
						@Pc(1312) float local1312 = (float) arg1.anIntArray17[local1263] - local1286;
						@Pc(1321) float local1321 = (float) arg1.anIntArray16[local1268] - local1274;
						@Pc(1329) float local1329 = (float) arg1.anIntArray22[local1268] - local1280;
						@Pc(1338) float local1338 = (float) arg1.anIntArray17[local1268] - local1286;
						@Pc(1347) float local1347 = (float) arg1.anIntArray16[local1243] - local1274;
						@Pc(1356) float local1356 = (float) arg1.anIntArray22[local1243] - local1280;
						@Pc(1364) float local1364 = (float) arg1.anIntArray17[local1243] - local1286;
						@Pc(1373) float local1373 = (float) arg1.anIntArray16[local1248] - local1274;
						@Pc(1381) float local1381 = (float) arg1.anIntArray22[local1248] - local1280;
						local1389 = (float) arg1.anIntArray17[local1248] - local1286;
						local1397 = (float) arg1.anIntArray16[local1253] - local1274;
						local1406 = (float) arg1.anIntArray22[local1253] - local1280;
						local1415 = (float) arg1.anIntArray17[local1253] - local1286;
						local1424 = local1338 * local1303 - local1312 * local1329;
						local1433 = local1321 * local1312 - local1338 * local1295;
						@Pc(1442) float local1442 = local1329 * local1295 - local1321 * local1303;
						@Pc(1450) float local1450 = local1442 * local1329 - local1433 * local1338;
						@Pc(1458) float local1458 = local1424 * local1338 - local1321 * local1442;
						@Pc(1466) float local1466 = local1433 * local1321 - local1329 * local1424;
						@Pc(1480) float local1480 = 1.0F / (local1466 * local1312 + local1450 * local1295 + local1458 * local1303);
						local1201 = local1480 * (local1347 * local1450 + local1356 * local1458 + local1466 * local1364);
						local1209 = (local1450 * local1397 + local1458 * local1406 + local1466 * local1415) * local1480;
						local1205 = local1480 * (local1466 * local1389 + local1450 * local1373 + local1381 * local1458);
						@Pc(1531) float local1531 = local1312 * local1424 - local1295 * local1442;
						@Pc(1539) float local1539 = local1295 * local1433 - local1424 * local1303;
						@Pc(1548) float local1548 = local1303 * local1442 - local1312 * local1433;
						@Pc(1562) float local1562 = 1.0F / (local1338 * local1539 + local1548 * local1321 + local1329 * local1531);
						local1211 = local1562 * (local1548 * local1397 + local1531 * local1406 + local1415 * local1539);
						local1207 = local1562 * (local1548 * local1373 + local1531 * local1381 + local1389 * local1539);
						local1203 = local1562 * (local1539 * local1364 + local1356 * local1531 + local1548 * local1347);
					} else {
						local1243 = arg1.aShortArray9[local1136];
						local1248 = arg1.aShortArray17[local1136];
						local1253 = arg1.aShortArray18[local1136];
						@Pc(1626) int local1626 = local810.anIntArray124[local843];
						@Pc(1631) int local1631 = local810.anIntArray122[local843];
						@Pc(1636) int local1636 = local810.anIntArray125[local843];
						@Pc(1641) float[] local1641 = local810.aFloatArrayArray5[local843];
						@Pc(1646) byte local1646 = arg1.aByteArray8[local843];
						local1286 = (float) arg1.anIntArray21[local843] / 256.0F;
						if (local1233 == 1) {
							local1295 = (float) arg1.anIntArray19[local843] / 1024.0F;
							Static232.method3876(arg1.anIntArray16[local1243], local1286, local1646, local1626, arg1.anIntArray17[local1243], local1636, arg1.anIntArray22[local1243], local1631, local1295, local1641, Static313.aFloatArray41);
							local1203 = Static313.aFloatArray41[1];
							local1201 = Static313.aFloatArray41[0];
							Static232.method3876(arg1.anIntArray16[local1248], local1286, local1646, local1626, arg1.anIntArray17[local1248], local1636, arg1.anIntArray22[local1248], local1631, local1295, local1641, Static313.aFloatArray41);
							local1207 = Static313.aFloatArray41[1];
							local1205 = Static313.aFloatArray41[0];
							Static232.method3876(arg1.anIntArray16[local1253], local1286, local1646, local1626, arg1.anIntArray17[local1253], local1636, arg1.anIntArray22[local1253], local1631, local1295, local1641, Static313.aFloatArray41);
							local1211 = Static313.aFloatArray41[1];
							local1209 = Static313.aFloatArray41[0];
							local1303 = local1295 / 2.0F;
							if ((local1646 & 0x1) == 0) {
								if (local1303 < local1209 - local1201) {
									local1215 = 1;
									local1209 -= local1295;
								} else if (local1201 - local1209 > local1303) {
									local1215 = 2;
									local1209 += local1295;
								}
								if (local1205 - local1201 > local1303) {
									local1213 = 1;
									local1205 -= local1295;
								} else if (local1303 < local1201 - local1205) {
									local1205 += local1295;
									local1213 = 2;
								}
							} else {
								if (local1207 - local1203 > local1303) {
									local1213 = 1;
									local1207 -= local1295;
								} else if (local1203 - local1207 > local1303) {
									local1207 += local1295;
									local1213 = 2;
								}
								if (local1303 < local1211 - local1203) {
									local1211 -= local1295;
									local1215 = 1;
								} else if (local1203 - local1211 > local1303) {
									local1215 = 2;
									local1211 += local1295;
								}
							}
						} else if (local1233 == 2) {
							local1295 = (float) arg1.anIntArray15[local843] / 256.0F;
							local1303 = (float) arg1.anIntArray18[local843] / 256.0F;
							@Pc(1897) int local1897 = arg1.anIntArray16[local1248] - arg1.anIntArray16[local1243];
							@Pc(1907) int local1907 = arg1.anIntArray22[local1248] - arg1.anIntArray22[local1243];
							@Pc(1918) int local1918 = arg1.anIntArray17[local1248] - arg1.anIntArray17[local1243];
							@Pc(1929) int local1929 = arg1.anIntArray16[local1253] - arg1.anIntArray16[local1243];
							@Pc(1940) int local1940 = arg1.anIntArray22[local1253] - arg1.anIntArray22[local1243];
							@Pc(1950) int local1950 = arg1.anIntArray17[local1253] - arg1.anIntArray17[local1243];
							@Pc(1959) int local1959 = local1907 * local1950 - local1940 * local1918;
							@Pc(1967) int local1967 = local1929 * local1918 - local1950 * local1897;
							@Pc(1975) int local1975 = local1897 * local1940 - local1929 * local1907;
							local1389 = 64.0F / (float) arg1.anIntArray24[local843];
							local1397 = 64.0F / (float) arg1.anIntArray25[local843];
							local1406 = 64.0F / (float) arg1.anIntArray19[local843];
							local1415 = ((float) local1975 * local1641[2] + (float) local1967 * local1641[1] + (float) local1959 * local1641[0]) / local1389;
							local1424 = (local1641[5] * (float) local1975 + local1641[4] * (float) local1967 + (float) local1959 * local1641[3]) / local1397;
							local1433 = ((float) local1959 * local1641[6] + local1641[7] * (float) local1967 + (float) local1975 * local1641[8]) / local1406;
							local1217 = Static413.method8725(local1424, local1415, local1433);
							Static246.method4088(arg1.anIntArray16[local1243], local1295, local1646, local1641, arg1.anIntArray17[local1243], Static313.aFloatArray41, local1217, local1636, local1286, local1631, local1303, local1626, arg1.anIntArray22[local1243]);
							local1203 = Static313.aFloatArray41[1];
							local1201 = Static313.aFloatArray41[0];
							Static246.method4088(arg1.anIntArray16[local1248], local1295, local1646, local1641, arg1.anIntArray17[local1248], Static313.aFloatArray41, local1217, local1636, local1286, local1631, local1303, local1626, arg1.anIntArray22[local1248]);
							local1207 = Static313.aFloatArray41[1];
							local1205 = Static313.aFloatArray41[0];
							Static246.method4088(arg1.anIntArray16[local1253], local1295, local1646, local1641, arg1.anIntArray17[local1253], Static313.aFloatArray41, local1217, local1636, local1286, local1631, local1303, local1626, arg1.anIntArray22[local1253]);
							local1209 = Static313.aFloatArray41[0];
							local1211 = Static313.aFloatArray41[1];
						} else if (local1233 == 3) {
							Static580.method8387(Static313.aFloatArray41, local1286, local1636, arg1.anIntArray22[local1243], local1631, local1646, arg1.anIntArray17[local1243], arg1.anIntArray16[local1243], local1641, local1626);
							local1203 = Static313.aFloatArray41[1];
							local1201 = Static313.aFloatArray41[0];
							Static580.method8387(Static313.aFloatArray41, local1286, local1636, arg1.anIntArray22[local1248], local1631, local1646, arg1.anIntArray17[local1248], arg1.anIntArray16[local1248], local1641, local1626);
							local1205 = Static313.aFloatArray41[0];
							local1207 = Static313.aFloatArray41[1];
							Static580.method8387(Static313.aFloatArray41, local1286, local1636, arg1.anIntArray22[local1253], local1631, local1646, arg1.anIntArray17[local1253], arg1.anIntArray16[local1253], local1641, local1626);
							local1209 = Static313.aFloatArray41[0];
							local1211 = Static313.aFloatArray41[1];
							if ((local1646 & 0x1) == 0) {
								if (local1209 - local1201 > 0.5F) {
									local1215 = 1;
									local1209--;
								} else if (local1201 - local1209 > 0.5F) {
									local1209++;
									local1215 = 2;
								}
								if (local1205 - local1201 > 0.5F) {
									local1205--;
									local1213 = 1;
								} else if (local1201 - local1205 > 0.5F) {
									local1213 = 2;
									local1205++;
								}
							} else {
								if (local1207 - local1203 > 0.5F) {
									local1207--;
									local1213 = 1;
								} else if (local1203 - local1207 > 0.5F) {
									local1207++;
									local1213 = 2;
								}
								if (local1211 - local1203 > 0.5F) {
									local1211--;
									local1215 = 1;
								} else if (local1203 - local1211 > 0.5F) {
									local1215 = 2;
									local1211++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray7 == null) {
				local1233 = 0;
			} else {
				local1233 = arg1.aByteArray7[local1136];
			}
			if (local1233 == 0) {
				@Pc(2449) long local2449 = ((long) (local1143 << 8) + (long) (local1217 << 24) + (long) local854 << 32) + (long) (local843 << 2);
				local1253 = arg1.aShortArray9[local1136];
				local1258 = arg1.aShortArray17[local1136];
				local1263 = arg1.aShortArray18[local1136];
				@Pc(2468) Class327 local2468 = local526[local1253];
				this.aShortArray143[local258] = this.method8667(local1253, local2468.anInt9104, local1201, local2468.anInt9106, local2468.anInt9105, local2449, local2468.anInt9102, local1203, arg1);
				@Pc(2492) Class327 local2492 = local526[local1258];
				this.aShortArray145[local258] = this.method8667(local1258, local2492.anInt9104, local1205, local2492.anInt9106, local2492.anInt9105, local2449 + (long) local1213, local2492.anInt9102, local1207, arg1);
				@Pc(2519) Class327 local2519 = local526[local1263];
				this.aShortArray142[local258] = this.method8667(local1263, local2519.anInt9104, local1209, local2519.anInt9106, local2519.anInt9105, local2449 + (long) local1215, local2519.anInt9102, local1211, arg1);
			} else if (local1233 == 1) {
				@Pc(2551) Class218 local2551 = local814[local1136];
				@Pc(2592) long local2592 = (long) ((local2551.anInt5452 > 0 ? 1024 : 2048) + (local843 << 2) + (local2551.anInt5450 + 256 << 12) + (local2551.anInt5451 - -256 << 22)) + ((long) local854 + (long) (local1143 << 8) + (long) (local1217 << 24) << 32);
				this.aShortArray143[local258] = this.method8667(arg1.aShortArray9[local1136], local2551.anInt5452, local1201, 0, local2551.anInt5450, local2592, local2551.anInt5451, local1203, arg1);
				this.aShortArray145[local258] = this.method8667(arg1.aShortArray17[local1136], local2551.anInt5452, local1205, 0, local2551.anInt5450, local2592 + (long) local1213, local2551.anInt5451, local1207, arg1);
				this.aShortArray142[local258] = this.method8667(arg1.aShortArray18[local1136], local2551.anInt5452, local1209, 0, local2551.anInt5450, (long) local1215 + local2592, local2551.anInt5451, local1211, arg1);
			}
			if (arg1.aByteArray10 != null) {
				this.aByteArray106[local258] = arg1.aByteArray10[local1136];
			}
			if (arg1.aShortArray11 != null) {
				this.aShortArray148[local258] = arg1.aShortArray11[local1136];
			}
			this.aShortArray152[local258] = arg1.aShortArray15[local1136];
			this.aShortArray146[local258] = local1179;
		}
		local1136 = 0;
		local833 = -10000;
		for (local843 = 0; local843 < this.anInt10175; local843++) {
			@Pc(2717) short local2717 = this.aShortArray146[local843];
			if (local833 != local2717) {
				local1136++;
				local833 = local2717;
			}
		}
		this.anIntArray581 = new int[local1136 + 1];
		local1136 = 0;
		local833 = -10000;
		for (local854 = 0; local854 < this.anInt10175; local854++) {
			local1179 = this.aShortArray146[local854];
			if (local1179 != local833) {
				local833 = local1179;
				this.anIntArray581[local1136++] = local854;
			}
		}
		this.anIntArray581[local1136] = this.anInt10175;
		Static199.aLongArray2 = null;
		this.aShortArray150 = Static84.method1392(this.aShortArray150, this.anInt10143);
		this.aShortArray147 = Static84.method1392(this.aShortArray147, this.anInt10143);
		this.aShortArray144 = Static84.method1392(this.aShortArray144, this.anInt10143);
		this.aByteArray107 = Static432.method6587(this.aByteArray107, this.anInt10143);
		this.aFloatArray76 = Static627.method8868(this.anInt10143, this.aFloatArray76);
		this.aFloatArray77 = Static627.method8868(this.anInt10143, this.aFloatArray77);
		if (arg1.anIntArray26 != null && Static419.method6380(arg2, this.anInt10178)) {
			this.anIntArrayArray73 = arg1.method340(false);
		}
		if (arg1.aClass257Array1 != null && Static646.method9055(arg2, this.anInt10178)) {
			this.anIntArrayArray74 = arg1.method345();
		}
		if (arg1.anIntArray23 != null && Static199.method3522(this.anInt10178, arg2)) {
			local865 = 0;
			@Pc(2862) int[] local2862 = new int[256];
			for (local887 = 0; local887 < this.lb; local887++) {
				local898 = arg1.anIntArray23[local112[local887]];
				if (local898 >= 0) {
					if (local898 > local865) {
						local865 = local898;
					}
					@Pc(2887) int local2887 = local2862[local898]++;
				}
			}
			this.anIntArrayArray75 = new int[local865 + 1][];
			for (local898 = 0; local898 <= local865; local898++) {
				this.anIntArrayArray75[local898] = new int[local2862[local898]];
				local2862[local898] = 0;
			}
			for (local907 = 0; local907 < this.lb; local907++) {
				local916 = arg1.anIntArray23[local112[local907]];
				if (local916 >= 0) {
					this.anIntArrayArray75[local916][local2862[local916]++] = local907;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort124;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.lb; local7++) {
			local16 = this.aShortArray152[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray152[local7] = (short) (local22 << 10 | local28 << 7 | local32);
		}
		if (this.aClass254Array1 != null) {
			for (local16 = 0; local16 < this.anInt10161; local16++) {
				@Pc(111) Class254 local111 = this.aClass254Array1[local16];
				@Pc(116) Class241 local116 = this.aClass241Array1[local16];
				local116.anInt6071 = local116.anInt6071 & 0xFF000000 | Static349.anIntArray330[this.aShortArray152[local111.anInt6373] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10133; local3++) {
			if (arg0 != 128) {
				this.anIntArray580[local3] = arg0 * this.anIntArray580[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray582[local3] = this.anIntArray582[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray583[local3] = this.anIntArray583[local3] * arg2 >> 7;
			}
		}
		this.aBoolean729 = false;
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort128;
	}

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "()V")
	@Override
	protected void method8653() {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!tc;IZIII)Z")
	private boolean method8660(@OriginalArg(0) int arg0, @OriginalArg(1) Class113 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class113_Sub2 local8 = (Class113_Sub2) arg1;
		@Pc(20) Class113_Sub2 local20 = this.aClass133_Sub3_37.aClass113_Sub2_3;
		@Pc(41) float local41 = local8.aFloat106 * local20.aFloat103 + local20.aFloat107 * local8.aFloat110 + local8.aFloat105 * local20.aFloat101 + local20.aFloat106;
		@Pc(62) float local62 = local8.aFloat105 * local20.aFloat112 + local8.aFloat110 * local20.aFloat104 + local8.aFloat106 * local20.aFloat111 + local20.aFloat110;
		Static193.aFloat148 = local20.aFloat111 * local8.aFloat103 + local20.aFloat104 * local8.aFloat111 + local8.aFloat108 * local20.aFloat112;
		Static566.aFloat183 = local20.aFloat101 * local8.aFloat109 + local20.aFloat107 * local8.aFloat104 + local8.aFloat107 * local20.aFloat103;
		Static257.aFloat91 = local20.aFloat109 * local8.aFloat111 + local20.aFloat108 * local8.aFloat103 + local20.aFloat102 * local8.aFloat108;
		Static587.aFloat198 = local20.aFloat111 * local8.aFloat101 + local8.aFloat112 * local20.aFloat104 + local8.aFloat102 * local20.aFloat112;
		Static17.aFloat4 = local8.aFloat104 * local20.aFloat104 + local20.aFloat111 * local8.aFloat107 + local8.aFloat109 * local20.aFloat112;
		Static2.aFloat1 = local20.aFloat109 * local8.aFloat104 + local20.aFloat108 * local8.aFloat107 + local20.aFloat102 * local8.aFloat109;
		@Pc(191) float local191 = local8.aFloat110 * local20.aFloat109 + local20.aFloat108 * local8.aFloat106 + local20.aFloat102 * local8.aFloat105 + local20.aFloat105;
		Static558.aFloat179 = local20.aFloat107 * local8.aFloat112 + local8.aFloat101 * local20.aFloat103 + local8.aFloat102 * local20.aFloat101;
		Static454.aFloat141 = local8.aFloat101 * local20.aFloat108 + local8.aFloat112 * local20.aFloat109 + local20.aFloat102 * local8.aFloat102;
		Static208.aFloat86 = local8.aFloat103 * local20.aFloat103 + local20.aFloat107 * local8.aFloat111 + local8.aFloat108 * local20.aFloat101;
		@Pc(247) boolean local247 = false;
		@Pc(249) float local249 = Float.MAX_VALUE;
		@Pc(251) float local251 = -3.4028235E38F;
		@Pc(253) float local253 = Float.MAX_VALUE;
		@Pc(255) float local255 = -3.4028235E38F;
		@Pc(259) int local259 = this.aClass133_Sub3_37.anInt8564;
		@Pc(263) int local263 = this.aClass133_Sub3_37.anInt8550;
		if (!this.aBoolean729) {
			this.method8673();
		}
		@Pc(278) int local278 = this.aShort125 - this.aShort126 >> 1;
		@Pc(286) int local286 = this.aShort122 - this.aShort129 >> 1;
		@Pc(295) int local295 = this.aShort123 - this.aShort124 >> 1;
		@Pc(300) int local300 = local278 + this.aShort126;
		@Pc(305) int local305 = this.aShort129 + local286;
		@Pc(311) int local311 = this.aShort124 + local295;
		@Pc(318) int local318 = local300 - (local278 << arg5);
		@Pc(325) int local325 = local305 - (local286 << arg5);
		@Pc(332) int local332 = local311 - (local295 << arg5);
		@Pc(339) int local339 = local300 + (local278 << arg5);
		@Pc(345) int local345 = (local286 << arg5) + local305;
		@Pc(351) int local351 = (local295 << arg5) + local311;
		Static621.anIntArray589[0] = local318;
		Static5.anIntArray2[0] = local325;
		Static621.anIntArray589[1] = local339;
		Static20.anIntArray11[0] = local332;
		Static5.anIntArray2[1] = local325;
		Static621.anIntArray589[2] = local318;
		Static20.anIntArray11[1] = local332;
		Static5.anIntArray2[2] = local345;
		Static621.anIntArray589[3] = local339;
		Static20.anIntArray11[2] = local332;
		Static5.anIntArray2[3] = local345;
		Static20.anIntArray11[3] = local332;
		Static621.anIntArray589[4] = local318;
		Static5.anIntArray2[4] = local325;
		Static20.anIntArray11[4] = local351;
		Static621.anIntArray589[5] = local339;
		Static5.anIntArray2[5] = local325;
		Static20.anIntArray11[5] = local351;
		Static621.anIntArray589[6] = local318;
		Static5.anIntArray2[6] = local345;
		Static20.anIntArray11[6] = local351;
		Static621.anIntArray589[7] = local339;
		Static5.anIntArray2[7] = local345;
		Static20.anIntArray11[7] = local351;
		@Pc(494) float local494;
		@Pc(480) float local480;
		@Pc(508) float local508;
		@Pc(466) float local466;
		@Pc(461) float local461;
		@Pc(456) float local456;
		for (@Pc(449) int local449 = 0; local449 < 8; local449++) {
			local456 = Static20.anIntArray11[local449];
			local461 = Static5.anIntArray2[local449];
			local466 = Static621.anIntArray589[local449];
			local480 = local62 + Static193.aFloat148 * local466 + Static17.aFloat4 * local461 + Static587.aFloat198 * local456;
			local494 = local41 + Static566.aFloat183 * local461 + local466 * Static208.aFloat86 + local456 * Static558.aFloat179;
			local508 = Static454.aFloat141 * local456 + Static257.aFloat91 * local466 + Static2.aFloat1 * local461 + local191;
			if (local508 >= (float) this.aClass133_Sub3_37.anInt8545) {
				if (arg2 > 0) {
					local508 = arg2;
				}
				@Pc(532) float local532 = (float) local259 * local494 / local508 + (float) this.aClass133_Sub3_37.anInt8544;
				if (local532 > local251) {
					local251 = local532;
				}
				if (local249 > local532) {
					local249 = local532;
				}
				@Pc(556) float local556 = (float) local263 * local480 / local508 + (float) this.aClass133_Sub3_37.anInt8549;
				if (local556 < local253) {
					local253 = local556;
				}
				local247 = true;
				if (local255 < local556) {
					local255 = local556;
				}
			}
		}
		if (local247 && local249 < (float) arg4 && (float) arg4 < local251 && (float) arg0 > local253 && (float) arg0 < local255) {
			if (arg3) {
				return true;
			}
			if (this.aClass133_Sub3_37.anIntArray480.length < this.anInt10143) {
				this.aClass133_Sub3_37.anIntArray479 = new int[this.anInt10143];
				this.aClass133_Sub3_37.anIntArray480 = new int[this.anInt10143];
			}
			@Pc(623) int[] local623 = this.aClass133_Sub3_37.anIntArray480;
			@Pc(627) int[] local627 = this.aClass133_Sub3_37.anIntArray479;
			@Pc(719) int local719;
			for (@Pc(629) int local629 = 0; local629 < this.anInt10133; local629++) {
				local466 = this.anIntArray580[local629];
				local456 = this.anIntArray583[local629];
				local461 = this.anIntArray582[local629];
				local508 = local191 + Static454.aFloat141 * local456 + Static2.aFloat1 * local461 + Static257.aFloat91 * local466;
				local494 = local41 + Static558.aFloat179 * local456 + local461 * Static566.aFloat183 + Static208.aFloat86 * local466;
				local480 = local62 + local461 * Static17.aFloat4 + Static193.aFloat148 * local466 + local456 * Static587.aFloat198;
				@Pc(732) int local732;
				@Pc(737) int local737;
				@Pc(744) int local744;
				if ((float) this.aClass133_Sub3_37.anInt8545 <= local508) {
					if (arg2 > 0) {
						local508 = arg2;
					}
					local719 = (int) ((float) this.aClass133_Sub3_37.anInt8544 + local494 * (float) local259 / local508);
					local732 = (int) ((float) this.aClass133_Sub3_37.anInt8549 + local480 * (float) local263 / local508);
					local737 = this.anIntArray585[local629];
					local744 = this.anIntArray585[local629 + 1];
					for (@Pc(746) int local746 = local737; local746 < local744; local746++) {
						@Pc(755) int local755 = this.aShortArray151[local746] - 1;
						if (local755 == -1) {
							break;
						}
						local623[local755] = local719;
						local627[local755] = local732;
					}
				} else {
					local719 = this.anIntArray585[local629];
					local732 = this.anIntArray585[local629 + 1];
					for (local737 = local719; local737 < local732; local737++) {
						local744 = this.aShortArray151[local737] - 1;
						if (local744 == -1) {
							break;
						}
						local623[this.aShortArray151[local737] - 1] = -999999;
					}
				}
			}
			for (local719 = 0; local719 < this.lb; local719++) {
				if (local623[this.aShortArray143[local719]] != -999999 && local623[this.aShortArray145[local719]] != -999999 && local623[this.aShortArray142[local719]] != -999999 && this.method8661(local627[this.aShortArray143[local719]], local627[this.aShortArray145[local719]], arg4, local623[this.aShortArray142[local719]], local623[this.aShortArray145[local719]], local623[this.aShortArray143[local719]], arg0, local627[this.aShortArray142[local719]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "()V")
	@Override
	public void method8651() {
		if (this.anInt10143 <= 0 || this.anInt10175 <= 0) {
			return;
		}
		this.method8663(false);
		if ((this.aByte130 & 0x10) == 0 && this.aClass159_1.anInterface21_1 == null) {
			this.method8675(false);
		}
		this.method8662();
	}

	@OriginalMember(owner = "client!vo", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort123;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method8661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg0 && arg6 < arg1 && arg6 < arg7) {
			return false;
		} else if (arg6 > arg0 && arg6 > arg1 && arg6 > arg7) {
			return false;
		} else if (arg2 < arg5 && arg4 > arg2 && arg3 > arg2) {
			return false;
		} else {
			return arg5 >= arg2 || arg2 <= arg4 || arg2 <= arg3;
		}
	}

	@OriginalMember(owner = "client!vo", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort122;
	}

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
		}
		this.aShort121 = (short) arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tc;Lclient!qw;I)V")
	@Override
	public void method8645(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10143 == 0) {
			return;
		}
		@Pc(16) Class113_Sub2 local16 = this.aClass133_Sub3_37.aClass113_Sub2_3;
		@Pc(19) Class113_Sub2 local19 = (Class113_Sub2) arg0;
		if (!this.aBoolean729) {
			this.method8673();
		}
		Static2.aFloat1 = local16.aFloat102 * local19.aFloat109 + local19.aFloat107 * local16.aFloat108 + local19.aFloat104 * local16.aFloat109;
		Static506.aFloat172 = local16.aFloat102 * local19.aFloat105 + local16.aFloat108 * local19.aFloat106 + local16.aFloat109 * local19.aFloat110 + local16.aFloat105;
		@Pc(72) float local72 = Static2.aFloat1 * (float) this.aShort129 + Static506.aFloat172;
		@Pc(80) float local80 = Static2.aFloat1 * (float) this.aShort122 + Static506.aFloat172;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort128 + local72;
			local97 = (float) -this.aShort128 + local80;
		} else {
			local97 = local72 - (float) this.aShort128;
			local90 = (float) this.aShort128 + local80;
		}
		if (this.aClass133_Sub3_37.aFloat152 <= local97 || (float) this.aClass133_Sub3_37.anInt8545 >= local90) {
			return;
		}
		Static566.aFloat183 = local19.aFloat107 * local16.aFloat103 + local19.aFloat104 * local16.aFloat107 + local16.aFloat101 * local19.aFloat109;
		Static186.aFloat48 = local16.aFloat101 * local19.aFloat105 + local19.aFloat110 * local16.aFloat107 + local19.aFloat106 * local16.aFloat103 + local16.aFloat106;
		@Pc(173) float local173 = Static186.aFloat48 + (float) this.aShort129 * Static566.aFloat183;
		@Pc(181) float local181 = Static186.aFloat48 + (float) this.aShort122 * Static566.aFloat183;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local197 = ((float) -this.aShort128 + local181) * (float) this.aClass133_Sub3_37.anInt8564;
			local208 = ((float) this.aShort128 + local173) * (float) this.aClass133_Sub3_37.anInt8564;
		} else {
			local197 = ((float) -this.aShort128 + local173) * (float) this.aClass133_Sub3_37.anInt8564;
			local208 = (float) this.aClass133_Sub3_37.anInt8564 * (local181 + (float) this.aShort128);
		}
		if (local197 / local90 >= this.aClass133_Sub3_37.aFloat160 || local208 / local90 <= this.aClass133_Sub3_37.aFloat167) {
			return;
		}
		Static15.aFloat3 = local16.aFloat110 + local16.aFloat112 * local19.aFloat105 + local16.aFloat111 * local19.aFloat106 + local19.aFloat110 * local16.aFloat104;
		Static17.aFloat4 = local19.aFloat107 * local16.aFloat111 + local16.aFloat104 * local19.aFloat104 + local16.aFloat112 * local19.aFloat109;
		@Pc(298) float local298 = Static15.aFloat3 + Static17.aFloat4 * (float) this.aShort129;
		@Pc(306) float local306 = Static17.aFloat4 * (float) this.aShort122 + Static15.aFloat3;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = (float) this.aClass133_Sub3_37.anInt8550 * (local306 - (float) this.aShort128);
			local332 = (float) this.aClass133_Sub3_37.anInt8550 * (local298 + (float) this.aShort128);
		} else {
			local321 = (float) this.aClass133_Sub3_37.anInt8550 * (local298 - (float) this.aShort128);
			local332 = (local306 + (float) this.aShort128) * (float) this.aClass133_Sub3_37.anInt8550;
		}
		if (this.aClass133_Sub3_37.aFloat156 <= local321 / local90 || local332 / local90 <= this.aClass133_Sub3_37.aFloat169) {
			return;
		}
		if (arg1 != null || this.aClass254Array1 != null) {
			Static558.aFloat179 = local19.aFloat102 * local16.aFloat101 + local19.aFloat101 * local16.aFloat103 + local16.aFloat107 * local19.aFloat112;
			Static193.aFloat148 = local19.aFloat111 * local16.aFloat104 + local19.aFloat103 * local16.aFloat111 + local19.aFloat108 * local16.aFloat112;
			Static454.aFloat141 = local19.aFloat112 * local16.aFloat109 + local19.aFloat101 * local16.aFloat108 + local16.aFloat102 * local19.aFloat102;
			Static587.aFloat198 = local19.aFloat102 * local16.aFloat112 + local16.aFloat104 * local19.aFloat112 + local19.aFloat101 * local16.aFloat111;
			Static257.aFloat91 = local16.aFloat102 * local19.aFloat108 + local16.aFloat108 * local19.aFloat103 + local16.aFloat109 * local19.aFloat111;
			Static208.aFloat86 = local16.aFloat101 * local19.aFloat108 + local19.aFloat103 * local16.aFloat103 + local19.aFloat111 * local16.aFloat107;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort125 + this.aShort126 >> 1;
			@Pc(510) int local510 = this.aShort124 + this.aShort123 >> 1;
			@Pc(529) int local529 = (int) (Static558.aFloat179 * (float) local510 + (float) local501 * Static208.aFloat86 + Static186.aFloat48 + (float) this.aShort129 * Static566.aFloat183);
			@Pc(548) int local548 = (int) ((float) local510 * Static587.aFloat198 + (float) this.aShort129 * Static17.aFloat4 + (float) local501 * Static193.aFloat148 + Static15.aFloat3);
			@Pc(567) int local567 = (int) ((float) local510 * Static454.aFloat141 + Static257.aFloat91 * (float) local501 + Static506.aFloat172 + Static2.aFloat1 * (float) this.aShort129);
			if (local567 < this.aClass133_Sub3_37.anInt8545) {
				local491 = true;
			} else {
				arg1.anInt7890 = this.aClass133_Sub3_37.anInt8544 + local529 * this.aClass133_Sub3_37.anInt8564 / local567;
				arg1.anInt7892 = this.aClass133_Sub3_37.anInt8549 + this.aClass133_Sub3_37.anInt8550 * local548 / local567;
			}
			@Pc(627) int local627 = (int) (Static186.aFloat48 + (float) local501 * Static208.aFloat86 + Static566.aFloat183 * (float) this.aShort122 + (float) local510 * Static558.aFloat179);
			@Pc(646) int local646 = (int) ((float) this.aShort122 * Static17.aFloat4 + Static15.aFloat3 + Static193.aFloat148 * (float) local501 + Static587.aFloat198 * (float) local510);
			@Pc(665) int local665 = (int) ((float) local501 * Static257.aFloat91 + Static506.aFloat172 + Static2.aFloat1 * (float) this.aShort122 + (float) local510 * Static454.aFloat141);
			if (local665 >= this.aClass133_Sub3_37.anInt8545) {
				arg1.anInt7891 = this.aClass133_Sub3_37.anInt8549 + this.aClass133_Sub3_37.anInt8550 * local646 / local665;
				arg1.anInt7893 = this.aClass133_Sub3_37.anInt8544 + this.aClass133_Sub3_37.anInt8564 * local627 / local665;
			} else {
				local491 = true;
			}
			if (local491) {
				if (this.aClass133_Sub3_37.anInt8545 > local567 && local665 < this.aClass133_Sub3_37.anInt8545) {
					local493 = false;
				} else {
					@Pc(748) int local748;
					@Pc(758) int local758;
					@Pc(785) int local785;
					if (local567 < this.aClass133_Sub3_37.anInt8545) {
						local748 = (local665 - this.aClass133_Sub3_37.anInt8545 << 16) / (local665 - local567);
						local758 = ((local627 - local529) * local748 >> 16) + local627;
						arg1.anInt7890 = local758 * this.aClass133_Sub3_37.anInt8564 / this.aClass133_Sub3_37.anInt8545 + this.aClass133_Sub3_37.anInt8544;
						local785 = local646 + ((local646 - local548) * local748 >> 16);
						arg1.anInt7892 = this.aClass133_Sub3_37.anInt8549 + this.aClass133_Sub3_37.anInt8550 * local785 / this.aClass133_Sub3_37.anInt8545;
					} else if (local665 < this.aClass133_Sub3_37.anInt8545) {
						local748 = (local567 - this.aClass133_Sub3_37.anInt8545 << 16) / (local567 - local665);
						local758 = (local748 * (local529 - local627) >> 16) + local529;
						arg1.anInt7890 = this.aClass133_Sub3_37.anInt8544 + local758 * this.aClass133_Sub3_37.anInt8564 / this.aClass133_Sub3_37.anInt8545;
						local785 = local548 + (local748 * (local548 - local646) >> 16);
						arg1.anInt7892 = this.aClass133_Sub3_37.anInt8550 * local785 / this.aClass133_Sub3_37.anInt8545 + this.aClass133_Sub3_37.anInt8549;
					}
				}
			}
			if (local493) {
				if (local665 >= local567) {
					arg1.anInt7894 = this.aClass133_Sub3_37.anInt8544 + (local627 - -this.aShort128) * this.aClass133_Sub3_37.anInt8564 / local665 - arg1.anInt7893;
				} else {
					arg1.anInt7894 = (this.aShort128 + local529) * this.aClass133_Sub3_37.anInt8564 / local567 + this.aClass133_Sub3_37.anInt8544 - arg1.anInt7890;
				}
				arg1.aBoolean558 = true;
			}
		}
		this.aClass133_Sub3_37.method7398();
		this.aClass133_Sub3_37.method7364(local19);
		this.method8666();
		this.aClass133_Sub3_37.method7331();
		this.method8672();
	}

	@OriginalMember(owner = "client!vo", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort126;
	}

	@OriginalMember(owner = "client!vo", name = "I", descriptor = "(I[IIIIZI[I)V")
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
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static215.anInt4073 = 0;
			Static91.anInt1869 = 0;
			Static220.anInt4131 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray73.length > local38) {
					local52 = this.anIntArrayArray73[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray149 == null || (this.aShortArray149[local60] & arg6) != 0) {
							Static215.anInt4073 += this.anIntArray580[local60];
							Static91.anInt1869 += this.anIntArray582[local60];
							Static220.anInt4131 += this.anIntArray583[local60];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static91.anInt1869 = arg3;
				Static215.anInt4073 = arg2;
				Static220.anInt4131 = arg4;
			} else {
				Static91.anInt1869 = Static91.anInt1869 / local30 + arg3;
				Static215.anInt4073 = Static215.anInt4073 / local30 + arg2;
				Static220.anInt4131 = Static220.anInt4131 / local30 + arg4;
				Static393.aBoolean748 = true;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg4 * arg7[2] + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[4] * arg3 + arg2 * arg7[3] + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg3 = local32;
				arg2 = local30;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray73.length > local32) {
					local247 = this.anIntArrayArray73[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local54 = local247[local249];
						if (this.aShortArray149 == null || (this.aShortArray149[local54] & arg6) != 0) {
							this.anIntArray580[local54] += arg2;
							this.anIntArray582[local54] += arg3;
							this.anIntArray583[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(391) int local391;
		@Pc(409) int local409;
		@Pc(641) int local641;
		@Pc(650) int local650;
		@Pc(663) int local663;
		@Pc(667) int local667;
		@Pc(685) int local685;
		@Pc(1030) int local1030;
		@Pc(1038) int local1038;
		@Pc(1193) int local1193;
		@Pc(1219) int local1219;
		@Pc(1223) int local1223;
		@Pc(1231) int local1231;
		@Pc(1236) int local1236;
		@Pc(1240) int local1240;
		@Pc(1244) int local1244;
		@Pc(1246) int local1246;
		@Pc(1377) int[] local1377;
		@Pc(1379) int local1379;
		@Pc(1383) int local1383;
		@Pc(1387) int local1387;
		@Pc(1389) int local1389;
		@Pc(1519) int local1519;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray73.length) {
						local247 = this.anIntArrayArray73[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local54 = local247[local249];
							if (this.aShortArray149 == null || (this.aShortArray149[local54] & arg6) != 0) {
								this.anIntArray580[local54] -= Static215.anInt4073;
								this.anIntArray582[local54] -= Static91.anInt1869;
								this.anIntArray583[local54] -= Static220.anInt4131;
								if (arg4 != 0) {
									local60 = Class377.anIntArray600[arg4];
									local391 = Class377.anIntArray601[arg4];
									local409 = local60 * this.anIntArray582[local54] + this.anIntArray580[local54] * local391 + 16383 >> 14;
									this.anIntArray582[local54] = this.anIntArray582[local54] * local391 + 16383 - local60 * this.anIntArray580[local54] >> 14;
									this.anIntArray580[local54] = local409;
								}
								if (arg2 != 0) {
									local60 = Class377.anIntArray600[arg2];
									local391 = Class377.anIntArray601[arg2];
									local409 = local391 * this.anIntArray582[local54] + 16383 - this.anIntArray583[local54] * local60 >> 14;
									this.anIntArray583[local54] = local391 * this.anIntArray583[local54] + this.anIntArray582[local54] * local60 + 16383 >> 14;
									this.anIntArray582[local54] = local409;
								}
								if (arg3 != 0) {
									local60 = Class377.anIntArray600[arg3];
									local391 = Class377.anIntArray601[arg3];
									local409 = this.anIntArray580[local54] * local391 + local60 * this.anIntArray583[local54] + 16383 >> 14;
									this.anIntArray583[local54] = this.anIntArray583[local54] * local391 + 16383 - local60 * this.anIntArray580[local54] >> 14;
									this.anIntArray580[local54] = local409;
								}
								this.anIntArray580[local54] += Static215.anInt4073;
								this.anIntArray582[local54] += Static91.anInt1869;
								this.anIntArray583[local54] += Static220.anInt4131;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray73.length > local38) {
							local52 = this.anIntArrayArray73[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray149 == null || (arg6 & this.aShortArray149[local60]) != 0) {
									local391 = this.anIntArray585[local60];
									local409 = this.anIntArray585[local60 + 1];
									for (local641 = local391; local641 < local409; local641++) {
										local650 = this.aShortArray151[local641] - 1;
										if (local650 == -1) {
											break;
										}
										if (arg4 != 0) {
											local663 = Class377.anIntArray600[arg4];
											local667 = Class377.anIntArray601[arg4];
											local685 = local667 * this.aShortArray150[local650] + this.aShortArray147[local650] * local663 + 16383 >> 14;
											this.aShortArray147[local650] = (short) (this.aShortArray147[local650] * local667 + 16383 - this.aShortArray150[local650] * local663 >> 14);
											this.aShortArray150[local650] = (short) local685;
										}
										if (arg2 != 0) {
											local663 = Class377.anIntArray600[arg2];
											local667 = Class377.anIntArray601[arg2];
											local685 = local667 * this.aShortArray147[local650] + 16383 - this.aShortArray144[local650] * local663 >> 14;
											this.aShortArray144[local650] = (short) (this.aShortArray144[local650] * local667 + local663 * this.aShortArray147[local650] + 16383 >> 14);
											this.aShortArray147[local650] = (short) local685;
										}
										if (arg3 != 0) {
											local663 = Class377.anIntArray600[arg3];
											local667 = Class377.anIntArray601[arg3];
											local685 = this.aShortArray144[local650] * local663 + local667 * this.aShortArray150[local650] + 16383 >> 14;
											this.aShortArray144[local650] = (short) (local667 * this.aShortArray144[local650] + 16383 - local663 * this.aShortArray150[local650] >> 14);
											this.aShortArray150[local650] = (short) local685;
										}
									}
								}
							}
						}
					}
					if (this.aClass18_15 == null && this.aClass18_13 != null) {
						this.aClass18_13.anInterface10_1 = null;
					}
					if (this.aClass18_15 != null) {
						this.aClass18_15.anInterface10_1 = null;
						return;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static393.aBoolean748) {
					local391 = Static91.anInt1869 * arg7[3] + Static215.anInt4073 * arg7[0] + Static220.anInt4131 * arg7[6] + 8192 >> 14;
					local409 = Static220.anInt4131 * arg7[7] + Static91.anInt1869 * arg7[4] + arg7[1] * Static215.anInt4073 + 8192 >> 14;
					local641 = Static91.anInt1869 * arg7[5] + arg7[2] * Static215.anInt4073 + Static220.anInt4131 * arg7[8] + 8192 >> 14;
					local409 += local54;
					local391 += local249;
					local641 += local60;
					Static215.anInt4073 = local391;
					Static91.anInt1869 = local409;
					Static220.anInt4131 = local641;
					Static393.aBoolean748 = false;
				}
				@Pc(998) int[] local998 = new int[9];
				local409 = Class377.anIntArray601[arg2];
				local641 = Class377.anIntArray600[arg2];
				local650 = Class377.anIntArray601[arg3];
				local663 = Class377.anIntArray600[arg3];
				local667 = Class377.anIntArray601[arg4];
				local685 = Class377.anIntArray600[arg4];
				local1030 = local667 * local641 + 8192 >> 14;
				local1038 = local641 * local685 + 8192 >> 14;
				local998[3] = local685 * local409 + 8192 >> 14;
				local998[2] = local409 * local663 + 8192 >> 14;
				local998[4] = local409 * local667 + 8192 >> 14;
				local998[0] = local650 * local667 + local1038 * local663 + 8192 >> 14;
				local998[6] = -local663 * local667 + local650 * local1038 + 8192 >> 14;
				local998[7] = local685 * local663 + local1030 * local650 + 8192 >> 14;
				local998[5] = -local641;
				local998[1] = local1030 * local663 + local685 * -local650 + 8192 >> 14;
				local998[8] = local650 * local409 + 8192 >> 14;
				@Pc(1168) int local1168 = local998[2] * -Static220.anInt4131 + -Static215.anInt4073 * local998[0] + -Static91.anInt1869 * local998[1] + 8192 >> 14;
				local1193 = local998[5] * -Static220.anInt4131 + -Static215.anInt4073 * local998[3] + -Static91.anInt1869 * local998[4] + 8192 >> 14;
				local1219 = -Static91.anInt1869 * local998[7] + local998[6] * -Static215.anInt4073 + -Static220.anInt4131 * local998[8] + 8192 >> 14;
				local1223 = local1168 + Static215.anInt4073;
				@Pc(1227) int local1227 = Static91.anInt1869 + local1193;
				local1231 = Static220.anInt4131 + local1219;
				@Pc(1234) int[] local1234 = new int[9];
				for (local1236 = 0; local1236 < 3; local1236++) {
					for (local1240 = 0; local1240 < 3; local1240++) {
						local1244 = 0;
						for (local1246 = 0; local1246 < 3; local1246++) {
							local1244 += local998[local1236 * 3 + local1246] * arg7[local1246 + local1240 * 3];
						}
						local1234[local1240 + local1236 * 3] = local1244 + 8192 >> 14;
					}
				}
				local1240 = local998[2] * local60 + local54 * local998[1] + local998[0] * local249 + 8192 >> 14;
				local1244 = local998[5] * local60 + local54 * local998[4] + local998[3] * local249 + 8192 >> 14;
				local1246 = local998[6] * local249 + local54 * local998[7] + local998[8] * local60 + 8192 >> 14;
				local1244 += local1227;
				local1240 += local1223;
				local1246 += local1231;
				local1377 = new int[9];
				for (local1379 = 0; local1379 < 3; local1379++) {
					for (local1383 = 0; local1383 < 3; local1383++) {
						local1387 = 0;
						for (local1389 = 0; local1389 < 3; local1389++) {
							local1387 += local1234[local1389 * 3 + local1383] * arg7[local1379 * 3 + local1389];
						}
						local1377[local1379 * 3 + local1383] = local1387 + 8192 >> 14;
					}
				}
				local1383 = arg7[0] * local1240 + local1244 * arg7[1] + local1246 * arg7[2] + 8192 >> 14;
				local1387 = arg7[3] * local1240 + arg7[4] * local1244 + local1246 * arg7[5] + 8192 >> 14;
				local1389 = arg7[6] * local1240 + arg7[7] * local1244 + arg7[8] * local1246 + 8192 >> 14;
				local1387 += local32;
				local1383 += local30;
				local1389 += local38;
				for (local1519 = 0; local1519 < local8; local1519++) {
					@Pc(1525) int local1525 = arg1[local1519];
					if (this.anIntArrayArray73.length > local1525) {
						@Pc(1539) int[] local1539 = this.anIntArrayArray73[local1525];
						for (@Pc(1541) int local1541 = 0; local1541 < local1539.length; local1541++) {
							@Pc(1547) int local1547 = local1539[local1541];
							if (this.aShortArray149 == null || (this.aShortArray149[local1547] & arg6) != 0) {
								@Pc(1588) int local1588 = local1377[1] * this.anIntArray582[local1547] + this.anIntArray580[local1547] * local1377[0] + this.anIntArray583[local1547] * local1377[2] + 8192 >> 14;
								@Pc(1619) int local1619 = local1377[4] * this.anIntArray582[local1547] + this.anIntArray580[local1547] * local1377[3] + local1377[5] * this.anIntArray583[local1547] + 8192 >> 14;
								@Pc(1651) int local1651 = this.anIntArray583[local1547] * local1377[8] + local1377[6] * this.anIntArray580[local1547] + local1377[7] * this.anIntArray582[local1547] + 8192 >> 14;
								@Pc(1655) int local1655 = local1619 + local1387;
								@Pc(1659) int local1659 = local1588 + local1383;
								this.anIntArray580[local1547] = local1659;
								@Pc(1668) int local1668 = local1651 + local1389;
								this.anIntArray582[local1547] = local1655;
								this.anIntArray583[local1547] = local1668;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2592) Class254 local2592;
			@Pc(2597) Class241 local2597;
			if (arg0 == 5) {
				if (this.anIntArrayArray75 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray75.length) {
							local247 = this.anIntArrayArray75[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local54 = local247[local249];
								if (this.aShortArray148 == null || (arg6 & this.aShortArray148[local54]) != 0) {
									local60 = arg2 * 8 + (this.aByteArray106[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray106[local54] = (byte) local60;
									if (this.aClass18_13 != null) {
										this.aClass18_13.anInterface10_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass254Array1 != null) {
						for (local32 = 0; local32 < this.anInt10161; local32++) {
							local2592 = this.aClass254Array1[local32];
							local2597 = this.aClass241Array1[local32];
							local2597.anInt6071 = local2597.anInt6071 & 0xFFFFFF | 255 - (this.aByteArray106[local2592.anInt6373] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2857) Class241 local2857;
				if (arg0 == 8) {
					if (this.anIntArrayArray74 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray74.length) {
								local247 = this.anIntArrayArray74[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2857 = this.aClass241Array1[local247[local249]];
									local2857.anInt6075 += arg3;
									local2857.anInt6073 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray74 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (this.anIntArrayArray74.length > local32) {
								local247 = this.anIntArrayArray74[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2857 = this.aClass241Array1[local247[local249]];
									local2857.anInt6072 = local2857.anInt6072 * arg2 >> 7;
									local2857.anInt6074 = arg3 * local2857.anInt6074 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray74 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray74.length > local32) {
							local247 = this.anIntArrayArray74[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2857 = this.aClass241Array1[local247[local249]];
								local2857.anInt6069 = arg2 + local2857.anInt6069 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray75 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray75.length > local32) {
						local247 = this.anIntArrayArray75[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local54 = local247[local249];
							if (this.aShortArray148 == null || (arg6 & this.aShortArray148[local54]) != 0) {
								local60 = this.aShortArray152[local54] & 0xFFFF;
								local391 = local60 >> 10 & 0x3F;
								local409 = local60 >> 7 & 0x7;
								local409 += arg3 / 4;
								@Pc(2702) int local2702 = arg2 + local391 & 0x3F;
								local641 = local60 & 0x7F;
								local641 += arg4;
								if (local409 < 0) {
									local409 = 0;
								} else if (local409 > 7) {
									local409 = 7;
								}
								if (local641 < 0) {
									local641 = 0;
								} else if (local641 > 127) {
									local641 = 127;
								}
								this.aShortArray152[local54] = (short) (local641 | local2702 << 10 | local409 << 7);
								if (this.aClass18_13 != null) {
									this.aClass18_13.anInterface10_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass254Array1 != null) {
					for (local32 = 0; local32 < this.anInt10161; local32++) {
						local2592 = this.aClass254Array1[local32];
						local2597 = this.aClass241Array1[local32];
						local2597.anInt6071 = local2597.anInt6071 & 0xFF000000 | Static349.anIntArray330[this.aShortArray152[local2592.anInt6373] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray73.length > local32) {
					local247 = this.anIntArrayArray73[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local54 = local247[local249];
						if (this.aShortArray149 == null || (arg6 & this.aShortArray149[local54]) != 0) {
							this.anIntArray580[local54] -= Static215.anInt4073;
							this.anIntArray582[local54] -= Static91.anInt1869;
							this.anIntArray583[local54] -= Static220.anInt4131;
							this.anIntArray580[local54] = arg2 * this.anIntArray580[local54] >> 7;
							this.anIntArray582[local54] = this.anIntArray582[local54] * arg3 >> 7;
							this.anIntArray583[local54] = this.anIntArray583[local54] * arg4 >> 7;
							this.anIntArray580[local54] += Static215.anInt4073;
							this.anIntArray582[local54] += Static91.anInt1869;
							this.anIntArray583[local54] += Static220.anInt4131;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static393.aBoolean748) {
				local391 = Static220.anInt4131 * arg7[6] + Static91.anInt1869 * arg7[3] + Static215.anInt4073 * arg7[0] + 8192 >> 14;
				local409 = Static220.anInt4131 * arg7[7] + Static91.anInt1869 * arg7[4] + Static215.anInt4073 * arg7[1] + 8192 >> 14;
				local409 += local54;
				local391 += local249;
				local641 = Static220.anInt4131 * arg7[8] + Static215.anInt4073 * arg7[2] + arg7[5] * Static91.anInt1869 + 8192 >> 14;
				Static215.anInt4073 = local391;
				local641 += local60;
				Static91.anInt1869 = local409;
				Static220.anInt4131 = local641;
				Static393.aBoolean748 = false;
			}
			local391 = arg2 << 15 >> 7;
			local409 = arg3 << 15 >> 7;
			local641 = arg4 << 15 >> 7;
			local650 = -Static215.anInt4073 * local391 + 8192 >> 14;
			local663 = -Static91.anInt1869 * local409 + 8192 >> 14;
			local667 = -Static220.anInt4131 * local641 + 8192 >> 14;
			local685 = local650 + Static215.anInt4073;
			local1030 = Static91.anInt1869 + local663;
			local1038 = Static220.anInt4131 + local667;
			@Pc(2018) int[] local2018 = new int[] { arg7[0] * local391 + 8192 >> 14, local391 * arg7[3] + 8192 >> 14, arg7[6] * local391 + 8192 >> 14, arg7[1] * local409 + 8192 >> 14, arg7[4] * local409 + 8192 >> 14, arg7[7] * local409 + 8192 >> 14, arg7[2] * local641 + 8192 >> 14, local641 * arg7[5] + 8192 >> 14, local641 * arg7[8] + 8192 >> 14 };
			local1193 = local249 * local391 + 8192 >> 14;
			local1219 = local54 * local409 + 8192 >> 14;
			@Pc(2146) int local2146 = local1219 + local1030;
			@Pc(2150) int local2150 = local1193 + local685;
			local1223 = local60 * local641 + 8192 >> 14;
			@Pc(2162) int local2162 = local1223 + local1038;
			@Pc(2165) int[] local2165 = new int[9];
			@Pc(2171) int local2171;
			for (local1231 = 0; local1231 < 3; local1231++) {
				for (local2171 = 0; local2171 < 3; local2171++) {
					local1236 = 0;
					for (local1240 = 0; local1240 < 3; local1240++) {
						local1236 += local2018[local2171 + local1240 * 3] * arg7[local1231 * 3 + local1240];
					}
					local2165[local1231 * 3 + local2171] = local1236 + 8192 >> 14;
				}
			}
			local2171 = local2162 * arg7[2] + local2150 * arg7[0] + arg7[1] * local2146 + 8192 >> 14;
			local1236 = local2162 * arg7[5] + local2150 * arg7[3] + local2146 * arg7[4] + 8192 >> 14;
			local1240 = local2150 * arg7[6] + arg7[7] * local2146 + arg7[8] * local2162 + 8192 >> 14;
			local2171 += local30;
			local1236 += local32;
			local1240 += local38;
			for (local1244 = 0; local1244 < local8; local1244++) {
				local1246 = arg1[local1244];
				if (local1246 < this.anIntArrayArray73.length) {
					local1377 = this.anIntArrayArray73[local1246];
					for (local1379 = 0; local1379 < local1377.length; local1379++) {
						local1383 = local1377[local1379];
						if (this.aShortArray149 == null || (arg6 & this.aShortArray149[local1383]) != 0) {
							local1387 = local2165[0] * this.anIntArray580[local1383] + local2165[1] * this.anIntArray582[local1383] + local2165[2] * this.anIntArray583[local1383] + 8192 >> 14;
							local1389 = this.anIntArray583[local1383] * local2165[5] + this.anIntArray580[local1383] * local2165[3] + local2165[4] * this.anIntArray582[local1383] + 8192 >> 14;
							local1519 = local2165[6] * this.anIntArray580[local1383] + local2165[7] * this.anIntArray582[local1383] + this.anIntArray583[local1383] * local2165[8] + 8192 >> 14;
							@Pc(2444) int local2444 = local1389 + local1236;
							@Pc(2448) int local2448 = local1387 + local2171;
							this.anIntArray580[local1383] = local2448;
							@Pc(2457) int local2457 = local1519 + local1240;
							this.anIntArray582[local1383] = local2444;
							this.anIntArray583[local1383] = local2457;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!tc;ZI)Z")
	@Override
	public boolean method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method8660(arg1, arg2, -1, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			local24 = 0;
			Static220.anInt4131 = 0;
			Static215.anInt4073 = 0;
			Static91.anInt1869 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray73.length) {
					local48 = this.anIntArrayArray73[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static215.anInt4073 += this.anIntArray580[local56];
						Static91.anInt1869 += this.anIntArray582[local56];
						local24++;
						Static220.anInt4131 += this.anIntArray583[local56];
					}
				}
			}
			if (local24 > 0) {
				Static91.anInt1869 = local22 + Static91.anInt1869 / local24;
				Static220.anInt4131 = local18 + Static220.anInt4131 / local24;
				Static215.anInt4073 = local14 + Static215.anInt4073 / local24;
			} else {
				Static91.anInt1869 = local22;
				Static215.anInt4073 = local14;
				Static220.anInt4131 = local18;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local18 = arg4 << 4;
			local14 = arg2 << 4;
			local22 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray73.length) {
					local165 = this.anIntArrayArray73[local32];
					for (local167 = 0; local167 < local165.length; local167++) {
						local50 = local165[local167];
						this.anIntArray580[local50] += local14;
						this.anIntArray582[local50] += local22;
						this.anIntArray583[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(280) int local280;
		@Pc(298) int local298;
		@Pc(755) int local755;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray73.length > local32) {
					local165 = this.anIntArrayArray73[local32];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local50 = local165[local167];
							this.anIntArray580[local50] -= Static215.anInt4073;
							this.anIntArray582[local50] -= Static91.anInt1869;
							this.anIntArray583[local50] -= Static220.anInt4131;
							if (arg4 != 0) {
								local56 = Class377.anIntArray600[arg4];
								local280 = Class377.anIntArray601[arg4];
								local298 = local280 * this.anIntArray580[local50] + local56 * this.anIntArray582[local50] + 16383 >> 14;
								this.anIntArray582[local50] = local280 * this.anIntArray582[local50] + 16383 - local56 * this.anIntArray580[local50] >> 14;
								this.anIntArray580[local50] = local298;
							}
							if (arg2 != 0) {
								local56 = Class377.anIntArray600[arg2];
								local280 = Class377.anIntArray601[arg2];
								local298 = this.anIntArray582[local50] * local280 + 16383 - this.anIntArray583[local50] * local56 >> 14;
								this.anIntArray583[local50] = this.anIntArray583[local50] * local280 + this.anIntArray582[local50] * local56 + 16383 >> 14;
								this.anIntArray582[local50] = local298;
							}
							if (arg3 != 0) {
								local56 = Class377.anIntArray600[arg3];
								local280 = Class377.anIntArray601[arg3];
								local298 = local56 * this.anIntArray583[local50] + this.anIntArray580[local50] * local280 + 16383 >> 14;
								this.anIntArray583[local50] = local280 * this.anIntArray583[local50] + 16383 - this.anIntArray580[local50] * local56 >> 14;
								this.anIntArray580[local50] = local298;
							}
							this.anIntArray580[local50] += Static215.anInt4073;
							this.anIntArray582[local50] += Static91.anInt1869;
							this.anIntArray583[local50] += Static220.anInt4131;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local50 = local165[local167];
							this.anIntArray580[local50] -= Static215.anInt4073;
							this.anIntArray582[local50] -= Static91.anInt1869;
							this.anIntArray583[local50] -= Static220.anInt4131;
							if (arg2 != 0) {
								local56 = Class377.anIntArray600[arg2];
								local280 = Class377.anIntArray601[arg2];
								local298 = local280 * this.anIntArray582[local50] + 16383 - local56 * this.anIntArray583[local50] >> 14;
								this.anIntArray583[local50] = this.anIntArray582[local50] * local56 + this.anIntArray583[local50] * local280 + 16383 >> 14;
								this.anIntArray582[local50] = local298;
							}
							if (arg4 != 0) {
								local56 = Class377.anIntArray600[arg4];
								local280 = Class377.anIntArray601[arg4];
								local298 = local280 * this.anIntArray580[local50] + this.anIntArray582[local50] * local56 + 16383 >> 14;
								this.anIntArray582[local50] = local280 * this.anIntArray582[local50] + 16383 - this.anIntArray580[local50] * local56 >> 14;
								this.anIntArray580[local50] = local298;
							}
							if (arg3 != 0) {
								local56 = Class377.anIntArray600[arg3];
								local280 = Class377.anIntArray601[arg3];
								local298 = local280 * this.anIntArray580[local50] + local56 * this.anIntArray583[local50] + 16383 >> 14;
								this.anIntArray583[local50] = this.anIntArray583[local50] * local280 + 16383 - this.anIntArray580[local50] * local56 >> 14;
								this.anIntArray580[local50] = local298;
							}
							this.anIntArray580[local50] += Static215.anInt4073;
							this.anIntArray582[local50] += Static91.anInt1869;
							this.anIntArray583[local50] += Static220.anInt4131;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray73.length > local38) {
						local48 = this.anIntArrayArray73[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local280 = this.anIntArray585[local56];
							local298 = this.anIntArray585[local56 + 1];
							for (local755 = local280; local755 < local298; local755++) {
								@Pc(764) int local764 = this.aShortArray151[local755] - 1;
								if (local764 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class377.anIntArray600[arg4];
									local780 = Class377.anIntArray601[arg4];
									local798 = local780 * this.aShortArray150[local764] + local776 * this.aShortArray147[local764] + 16383 >> 14;
									this.aShortArray147[local764] = (short) (local780 * this.aShortArray147[local764] + 16383 - local776 * this.aShortArray150[local764] >> 14);
									this.aShortArray150[local764] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class377.anIntArray600[arg2];
									local780 = Class377.anIntArray601[arg2];
									local798 = local780 * this.aShortArray147[local764] + 16383 - this.aShortArray144[local764] * local776 >> 14;
									this.aShortArray144[local764] = (short) (this.aShortArray147[local764] * local776 + this.aShortArray144[local764] * local780 + 16383 >> 14);
									this.aShortArray147[local764] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class377.anIntArray600[arg3];
									local780 = Class377.anIntArray601[arg3];
									local798 = this.aShortArray144[local764] * local776 + local780 * this.aShortArray150[local764] + 16383 >> 14;
									this.aShortArray144[local764] = (short) (this.aShortArray144[local764] * local780 + 16383 - this.aShortArray150[local764] * local776 >> 14);
									this.aShortArray150[local764] = (short) local798;
								}
							}
						}
					}
				}
				if (this.aClass18_15 == null && this.aClass18_13 != null) {
					this.aClass18_13.anInterface10_1 = null;
				}
				if (this.aClass18_15 != null) {
					this.aClass18_15.anInterface10_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray73.length) {
					local165 = this.anIntArrayArray73[local32];
					for (local167 = 0; local167 < local165.length; local167++) {
						local50 = local165[local167];
						this.anIntArray580[local50] -= Static215.anInt4073;
						this.anIntArray582[local50] -= Static91.anInt1869;
						this.anIntArray583[local50] -= Static220.anInt4131;
						this.anIntArray580[local50] = this.anIntArray580[local50] * arg2 >> 7;
						this.anIntArray582[local50] = this.anIntArray582[local50] * arg3 >> 7;
						this.anIntArray583[local50] = this.anIntArray583[local50] * arg4 >> 7;
						this.anIntArray580[local50] += Static215.anInt4073;
						this.anIntArray582[local50] += Static91.anInt1869;
						this.anIntArray583[local50] += Static220.anInt4131;
					}
				}
			}
		} else {
			@Pc(1208) Class254 local1208;
			@Pc(1213) Class241 local1213;
			if (arg0 == 5) {
				if (this.anIntArrayArray75 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray75.length > local32) {
							local165 = this.anIntArrayArray75[local32];
							for (local167 = 0; local167 < local165.length; local167++) {
								local50 = local165[local167];
								local56 = (this.aByteArray106[local50] & 0xFF) + arg2 * 8;
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray106[local50] = (byte) local56;
							}
							if (local165.length > 0 && this.aClass18_13 != null) {
								this.aClass18_13.anInterface10_1 = null;
							}
						}
					}
					if (this.aClass254Array1 != null) {
						for (local32 = 0; local32 < this.anInt10161; local32++) {
							local1208 = this.aClass254Array1[local32];
							local1213 = this.aClass241Array1[local32];
							local1213.anInt6071 = local1213.anInt6071 & 0xFFFFFF | 255 - (this.aByteArray106[local1208.anInt6373] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1465) Class241 local1465;
				if (arg0 == 8) {
					if (this.anIntArrayArray74 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray74.length) {
								local165 = this.anIntArrayArray74[local32];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1465 = this.aClass241Array1[local165[local167]];
									local1465.anInt6073 += arg2;
									local1465.anInt6075 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray74 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray74.length) {
								local165 = this.anIntArrayArray74[local32];
								for (local167 = 0; local167 < local165.length; local167++) {
									local1465 = this.aClass241Array1[local165[local167]];
									local1465.anInt6072 = arg2 * local1465.anInt6072 >> 7;
									local1465.anInt6074 = arg3 * local1465.anInt6074 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray74 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray74.length > local32) {
							local165 = this.anIntArrayArray74[local32];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1465 = this.aClass241Array1[local165[local167]];
								local1465.anInt6069 = local1465.anInt6069 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray75 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray75.length > local32) {
						local165 = this.anIntArrayArray75[local32];
						for (local167 = 0; local167 < local165.length; local167++) {
							local50 = local165[local167];
							local56 = this.aShortArray152[local50] & 0xFFFF;
							local280 = local56 >> 10 & 0x3F;
							local298 = local56 >> 7 & 0x7;
							local298 += arg3 / 4;
							@Pc(1307) int local1307 = arg2 + local280 & 0x3F;
							local755 = local56 & 0x7F;
							local755 += arg4;
							if (local298 < 0) {
								local298 = 0;
							} else if (local298 > 7) {
								local298 = 7;
							}
							if (local755 < 0) {
								local755 = 0;
							} else if (local755 > 127) {
								local755 = 127;
							}
							this.aShortArray152[local50] = (short) (local1307 << 10 | local298 << 7 | local755);
						}
						if (local165.length > 0 && this.aClass18_13 != null) {
							this.aClass18_13.anInterface10_1 = null;
						}
					}
				}
				if (this.aClass254Array1 != null) {
					for (local32 = 0; local32 < this.anInt10161; local32++) {
						local1208 = this.aClass254Array1[local32];
						local1213 = this.aClass241Array1[local32];
						local1213.anInt6071 = Static349.anIntArray330[this.aShortArray152[local1208.anInt6373] & 0xFFFF] & 0xFFFFFF | local1213.anInt6071 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)V")
	private void method8662() {
		if (!this.aBoolean728) {
			return;
		}
		this.aBoolean728 = false;
		if (this.aClass261Array5 == null && this.aClass320Array4 == null && this.aClass254Array1 == null) {
			if (this.anIntArray580 != null && !Static315.method6058(this.anInt10152, this.anInt10178)) {
				if (this.aClass18_12 != null && this.aClass18_12.anInterface10_1 == null) {
					this.aBoolean728 = true;
				} else {
					if (!this.aBoolean729) {
						this.method8673();
					}
					this.anIntArray580 = null;
				}
			}
			if (this.anIntArray582 != null && !Static610.method8699(this.anInt10152, this.anInt10178)) {
				if (this.aClass18_12 != null && this.aClass18_12.anInterface10_1 == null) {
					this.aBoolean728 = true;
				} else {
					if (!this.aBoolean729) {
						this.method8673();
					}
					this.anIntArray582 = null;
				}
			}
			if (this.anIntArray583 != null && !Static251.method4164(this.anInt10152, this.anInt10178)) {
				if (this.aClass18_12 != null && this.aClass18_12.anInterface10_1 == null) {
					this.aBoolean728 = true;
				} else {
					if (!this.aBoolean729) {
						this.method8673();
					}
					this.anIntArray583 = null;
				}
			}
		}
		if (this.aShortArray151 != null && this.anIntArray580 == null && this.anIntArray582 == null && this.anIntArray583 == null) {
			this.anIntArray585 = null;
			this.aShortArray151 = null;
		}
		if (this.aByteArray107 != null && !Static564.method8212(this.anInt10178, this.anInt10152)) {
			if (this.aClass18_15 == null) {
				if (this.aClass18_13 != null && this.aClass18_13.anInterface10_1 == null) {
					this.aBoolean728 = true;
				} else {
					this.aByteArray107 = null;
					this.aShortArray150 = this.aShortArray147 = this.aShortArray144 = null;
				}
			} else if (this.aClass18_15.anInterface10_1 == null) {
				this.aBoolean728 = true;
			} else {
				this.aByteArray107 = null;
				this.aShortArray150 = this.aShortArray147 = this.aShortArray144 = null;
			}
		}
		if (this.aShortArray152 != null && !Static446.method6736(this.anInt10178, this.anInt10152)) {
			if (this.aClass18_13 != null && this.aClass18_13.anInterface10_1 == null) {
				this.aBoolean728 = true;
			} else {
				this.aShortArray152 = null;
			}
		}
		if (this.aByteArray106 != null && !Static600.method8610(this.anInt10152, this.anInt10178)) {
			if (this.aClass18_13 != null && this.aClass18_13.anInterface10_1 == null) {
				this.aBoolean728 = true;
			} else {
				this.aByteArray106 = null;
			}
		}
		if (this.aFloatArray76 != null && !Static570.method8258(this.anInt10178, this.anInt10152)) {
			if (this.aClass18_14 != null && this.aClass18_14.anInterface10_1 == null) {
				this.aBoolean728 = true;
			} else {
				this.aFloatArray76 = this.aFloatArray77 = null;
			}
		}
		if (this.aShortArray146 != null && !Static318.method4862(this.anInt10178, this.anInt10152)) {
			if (this.aClass18_13 != null && this.aClass18_13.anInterface10_1 == null) {
				this.aBoolean728 = true;
			} else {
				this.aShortArray146 = null;
			}
		}
		if (this.aShortArray143 != null && !Static123.method4143(this.anInt10178, this.anInt10152)) {
			if ((this.aClass159_1 == null || this.aClass159_1.anInterface21_1 != null) && (this.aClass18_13 == null || this.aClass18_13.anInterface10_1 != null)) {
				this.aShortArray143 = this.aShortArray145 = this.aShortArray142 = null;
			} else {
				this.aBoolean728 = true;
			}
		}
		if (this.anIntArrayArray75 != null && !Static199.method3522(this.anInt10178, this.anInt10152)) {
			this.anIntArrayArray75 = null;
			this.aShortArray148 = null;
		}
		if (this.anIntArrayArray73 != null && !Static419.method6380(this.anInt10152, this.anInt10178)) {
			this.anIntArrayArray73 = null;
			this.aShortArray149 = null;
		}
		if (this.anIntArrayArray74 != null && !Static646.method9055(this.anInt10152, this.anInt10178)) {
			this.anIntArrayArray74 = null;
		}
		if (this.anIntArray581 != null && (this.anInt10152 & 0x800) == 0 && (this.anInt10152 & 0x40000) == 0) {
			this.anIntArray581 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort120;
	}

	@OriginalMember(owner = "client!vo", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt10152 = arg0;
		this.aBoolean728 = true;
		if (this.aClass315_1 != null && (this.anInt10152 & 0x10000) == 0) {
			this.aShortArray147 = this.aClass315_1.aShortArray128;
			this.aShortArray150 = this.aClass315_1.aShortArray126;
			this.aByteArray107 = this.aClass315_1.aByteArray92;
			this.aShortArray144 = this.aClass315_1.aShortArray127;
			this.aClass315_1 = null;
		}
		this.method8662();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZI)V")
	private void method8663(@OriginalArg(0) boolean arg0) {
		@Pc(20) boolean local20 = this.aClass18_13 != null && this.aClass18_13.anInterface10_1 == null;
		@Pc(31) boolean local31 = this.aClass18_15 != null && this.aClass18_15.anInterface10_1 == null;
		@Pc(42) boolean local42 = this.aClass18_12 != null && this.aClass18_12.anInterface10_1 == null;
		@Pc(53) boolean local53 = this.aClass18_14 != null && this.aClass18_14.anInterface10_1 == null;
		if (arg0) {
			local53 &= (this.aByte130 & 0x8) != 0;
			local20 &= (this.aByte130 & 0x2) != 0;
			local42 &= (this.aByte130 & 0x1) != 0;
			local31 &= (this.aByte130 & 0x4) != 0;
		}
		@Pc(101) byte local101 = 0;
		@Pc(105) byte local105 = 0;
		@Pc(107) byte local107 = 0;
		@Pc(109) byte local109 = 0;
		if (local42) {
			local101 = 12;
		}
		if (local20) {
			local105 = local101;
			local101 = (byte) (local101 + 4);
		}
		if (local31) {
			local107 = local101;
			local101 = (byte) (local101 + 12);
		}
		if (local53) {
			local109 = local101;
			local101 = (byte) (local101 + 8);
		}
		if (local101 == 0) {
			return;
		}
		if (this.anInt10143 * local101 <= this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3.aByteArray71.length) {
			this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3.anInt6629 = 0;
		} else {
			this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3 = new Class5_Sub22_Sub2(local101 * (this.anInt10143 + 100));
		}
		@Pc(185) Class5_Sub22_Sub2 local185 = this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3;
		@Pc(193) int local193;
		@Pc(202) int local202;
		@Pc(230) int local230;
		@Pc(239) int local239;
		if (local42) {
			@Pc(209) int local209;
			@Pc(216) int local216;
			@Pc(221) int local221;
			@Pc(228) int local228;
			if (this.aClass133_Sub3_37.aBoolean611) {
				for (local193 = 0; local193 < this.anInt10133; local193++) {
					local202 = Stream.floatToRawIntBits((float) this.anIntArray580[local193]);
					local209 = Stream.floatToRawIntBits((float) this.anIntArray582[local193]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray583[local193]);
					local221 = this.anIntArray585[local193];
					local228 = this.anIntArray585[local193 + 1];
					for (local230 = local221; local230 < local228; local230++) {
						local239 = this.aShortArray151[local230] - 1;
						if (local239 == -1) {
							break;
						}
						local185.anInt6629 = local239 * local101;
						local185.method5949(local202);
						local185.method5949(local209);
						local185.method5949(local216);
					}
				}
			} else {
				for (local193 = 0; local193 < this.anInt10133; local193++) {
					local202 = Stream.floatToRawIntBits((float) this.anIntArray580[local193]);
					local209 = Stream.floatToRawIntBits((float) this.anIntArray582[local193]);
					local216 = Stream.floatToRawIntBits((float) this.anIntArray583[local193]);
					local221 = this.anIntArray585[local193];
					local228 = this.anIntArray585[local193 + 1];
					for (local230 = local221; local230 < local228; local230++) {
						local239 = this.aShortArray151[local230] - 1;
						if (local239 == -1) {
							break;
						}
						local185.anInt6629 = local239 * local101;
						local185.method5954(local202);
						local185.method5954(local209);
						local185.method5954(local216);
					}
				}
			}
		}
		@Pc(483) float local483;
		@Pc(383) short[] local383;
		@Pc(375) short[] local375;
		@Pc(379) short[] local379;
		@Pc(371) byte[] local371;
		@Pc(530) float local530;
		if (local20) {
			if (this.aClass18_15 == null) {
				if (this.aClass315_1 == null) {
					local375 = this.aShortArray147;
					local379 = this.aShortArray144;
					local383 = this.aShortArray150;
					local371 = this.aByteArray107;
				} else {
					local371 = this.aClass315_1.aByteArray92;
					local375 = this.aClass315_1.aShortArray128;
					local379 = this.aClass315_1.aShortArray127;
					local383 = this.aClass315_1.aShortArray126;
				}
				@Pc(403) float local403 = this.aClass133_Sub3_37.aFloatArray67[0];
				@Pc(409) float local409 = this.aClass133_Sub3_37.aFloatArray67[1];
				@Pc(415) float local415 = this.aClass133_Sub3_37.aFloatArray67[2];
				@Pc(419) float local419 = this.aClass133_Sub3_37.aFloat150;
				@Pc(429) float local429 = this.aClass133_Sub3_37.aFloat149 * 768.0F / (float) this.aShort127;
				@Pc(439) float local439 = this.aClass133_Sub3_37.aFloat163 * 768.0F / (float) this.aShort127;
				for (@Pc(441) int local441 = 0; local441 < this.lb; local441++) {
					@Pc(461) int local461 = this.method8669(this.aShortArray152[local441], this.aShortArray146[local441], this.aByteArray106[local441], this.aShort121);
					@Pc(472) float local472 = this.aClass133_Sub3_37.aFloat159 * (float) (local461 >> 8 & 0xFF);
					local483 = (float) (local461 >> 16 & 0xFF) * this.aClass133_Sub3_37.aFloat151;
					@Pc(492) float local492 = (float) (local461 >>> 24) * this.aClass133_Sub3_37.aFloat153;
					@Pc(497) short local497 = this.aShortArray143[local441];
					@Pc(502) short local502 = (short) local371[local497];
					if (local502 == 0) {
						local530 = (local415 * (float) local379[local497] + (float) local383[local497] * local403 + (float) local375[local497] * local409) * 0.0026041667F;
					} else {
						local530 = ((float) local383[local497] * local403 + local409 * (float) local375[local497] + (float) local379[local497] * local415) / (float) (local502 * 256);
					}
					@Pc(570) float local570 = (local530 < 0.0F ? local439 : local429) * local530 + local419;
					@Pc(575) int local575 = (int) (local492 * local570);
					@Pc(580) int local580 = (int) (local570 * local483);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					@Pc(607) int local607 = (int) (local570 * local472);
					local185.anInt6629 = local101 * local497 + local105;
					if (local607 < 0) {
						local607 = 0;
					} else if (local607 > 255) {
						local607 = 255;
					}
					local185.method5905(local575);
					local185.method5905(local580);
					local185.method5905(local607);
					local185.method5905(255 - (this.aByteArray106[local441] & 0xFF));
					local497 = this.aShortArray145[local441];
					local502 = local371[local497];
					if (local502 == 0) {
						local530 = ((float) local379[local497] * local415 + local403 * (float) local383[local497] + (float) local375[local497] * local409) * 0.0026041667F;
					} else {
						local530 = ((float) local375[local497] * local409 + (float) local383[local497] * local403 + local415 * (float) local379[local497]) / (float) (local502 * 256);
					}
					local570 = local419 + local530 * (local530 < 0.0F ? local439 : local429);
					local575 = (int) (local570 * local492);
					local580 = (int) (local570 * local483);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local607 = (int) (local472 * local570);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					if (local607 < 0) {
						local607 = 0;
					} else if (local607 > 255) {
						local607 = 255;
					}
					local185.anInt6629 = local105 + local101 * local497;
					local185.method5905(local575);
					local185.method5905(local580);
					local185.method5905(local607);
					local185.method5905(255 - (this.aByteArray106[local441] & 0xFF));
					local497 = this.aShortArray142[local441];
					local502 = local371[local497];
					if (local502 == 0) {
						local530 = ((float) local379[local497] * local415 + local403 * (float) local383[local497] + local409 * (float) local375[local497]) * 0.0026041667F;
					} else {
						local530 = ((float) local379[local497] * local415 + (float) local375[local497] * local409 + local403 * (float) local383[local497]) / (float) (local502 * 256);
					}
					local570 = (local530 < 0.0F ? local439 : local429) * local530 + local419;
					local575 = (int) (local492 * local570);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local580 = (int) (local570 * local483);
					local607 = (int) (local472 * local570);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					if (local607 < 0) {
						local607 = 0;
					} else if (local607 > 255) {
						local607 = 255;
					}
					local185.anInt6629 = local105 + local497 * local101;
					local185.method5905(local575);
					local185.method5905(local580);
					local185.method5905(local607);
					local185.method5905(255 - (this.aByteArray106[local441] & 0xFF));
				}
			} else {
				for (local193 = 0; local193 < this.lb; local193++) {
					local202 = this.method8669(this.aShortArray152[local193], this.aShortArray146[local193], this.aByteArray106[local193], this.aShort121);
					local185.anInt6629 = local101 * this.aShortArray143[local193] + local105;
					local185.method5949(local202);
					local185.anInt6629 = local105 + this.aShortArray145[local193] * local101;
					local185.method5949(local202);
					local185.anInt6629 = local101 * this.aShortArray142[local193] + local105;
					local185.method5949(local202);
				}
			}
		}
		if (local31) {
			if (this.aClass315_1 == null) {
				local379 = this.aShortArray144;
				local383 = this.aShortArray150;
				local371 = this.aByteArray107;
				local375 = this.aShortArray147;
			} else {
				local375 = this.aClass315_1.aShortArray128;
				local383 = this.aClass315_1.aShortArray126;
				local379 = this.aClass315_1.aShortArray127;
				local371 = this.aClass315_1.aByteArray92;
			}
			@Pc(1093) float local1093 = 3.0F / (float) this.aShort127;
			local530 = 3.0F / (float) (this.aShort127 / 2 + this.aShort127);
			local185.anInt6629 = local107;
			if (this.aClass133_Sub3_37.aBoolean611) {
				for (local230 = 0; local230 < this.anInt10143; local230++) {
					local239 = local371[local230] & 0xFF;
					if (local239 == 0) {
						local185.method5969((float) local383[local230] * local530);
						local185.method5969((float) local375[local230] * local530);
						local185.method5969(local530 * (float) local379[local230]);
					} else {
						local483 = local1093 / (float) local239;
						local185.method5969((float) local383[local230] * local483);
						local185.method5969((float) local375[local230] * local483);
						local185.method5969((float) local379[local230] * local483);
					}
					local185.anInt6629 += local101 - 12;
				}
			} else {
				for (local230 = 0; local230 < this.anInt10143; local230++) {
					local239 = local371[local230] & 0xFF;
					if (local239 == 0) {
						local185.method5970((float) local383[local230] * local530);
						local185.method5970(local530 * (float) local375[local230]);
						local185.method5970((float) local379[local230] * local530);
					} else {
						local483 = local1093 / (float) local239;
						local185.method5970((float) local383[local230] * local483);
						local185.method5970((float) local375[local230] * local483);
						local185.method5970((float) local379[local230] * local483);
					}
					local185.anInt6629 += local101 - 12;
				}
			}
		}
		if (local53) {
			local185.anInt6629 = local109;
			if (this.aClass133_Sub3_37.aBoolean611) {
				for (local193 = 0; local193 < this.anInt10143; local193++) {
					local185.method5969(this.aFloatArray76[local193]);
					local185.method5969(this.aFloatArray77[local193]);
					local185.anInt6629 += local101 - 8;
				}
			} else {
				for (local193 = 0; local193 < this.anInt10143; local193++) {
					local185.method5970(this.aFloatArray76[local193]);
					local185.method5970(this.aFloatArray77[local193]);
					local185.anInt6629 += local101 - 8;
				}
			}
		}
		local185.anInt6629 = local101 * this.anInt10143;
		@Pc(1402) Interface10 local1402;
		if (arg0) {
			if (this.anInterface10_7 == null) {
				this.anInterface10_7 = this.aClass133_Sub3_37.method7341(true, local185.anInt6629, local185.aByteArray71, local101);
			} else {
				this.anInterface10_7.method8855(local185.aByteArray71, local101, local185.anInt6629);
			}
			local1402 = this.anInterface10_7;
			this.aByte130 = 0;
		} else {
			local1402 = this.aClass133_Sub3_37.method7341(false, local185.anInt6629, local185.aByteArray71, local101);
			this.aBoolean728 = true;
		}
		if (local42) {
			this.aClass18_12.anInterface10_1 = local1402;
			this.aClass18_12.aByte3 = 0;
		}
		if (local53) {
			this.aClass18_14.aByte3 = local109;
			this.aClass18_14.anInterface10_1 = local1402;
		}
		if (local20) {
			this.aClass18_13.aByte3 = local105;
			this.aClass18_13.anInterface10_1 = local1402;
		}
		if (local31) {
			this.aClass18_15.anInterface10_1 = local1402;
			this.aClass18_15.aByte3 = local107;
		}
	}

	@OriginalMember(owner = "client!vo", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10133; local3++) {
			this.anIntArray583[local3] = -this.anIntArray583[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt10143; local25++) {
			this.aShortArray144[local25] = (short) -this.aShortArray144[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.lb; local48++) {
			@Pc(55) short local55 = this.aShortArray143[local48];
			this.aShortArray143[local48] = this.aShortArray142[local48];
			this.aShortArray142[local48] = local55;
		}
		if (this.aClass18_15 == null && this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
		}
		if (this.aClass18_15 != null) {
			this.aClass18_15.anInterface10_1 = null;
		}
		this.aBoolean729 = false;
		if (this.aClass159_1 != null) {
			this.aClass159_1.anInterface21_1 = null;
		}
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!vo;ZIZLclient!vo;)Lclient!ka;")
	private Class187 method8664(@OriginalArg(1) Class187_Sub3 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class187_Sub3 arg4) {
		if ((arg2 & 0x100) == 0) {
			arg4.aBoolean727 = this.aBoolean727;
		} else {
			arg4.aBoolean727 = true;
		}
		arg4.anInt10133 = this.anInt10133;
		arg4.lb = this.lb;
		arg4.anInt10121 = this.anInt10121;
		arg4.aBoolean730 = this.aBoolean730;
		arg4.aShort127 = this.aShort127;
		arg4.anInt10161 = this.anInt10161;
		arg4.anInt10143 = this.anInt10143;
		arg4.anInt10152 = arg2;
		arg4.anInt10178 = this.anInt10178;
		arg4.aShort121 = this.aShort121;
		arg4.aByte130 = 0;
		arg4.anInt10175 = this.anInt10175;
		@Pc(73) boolean local73 = Static586.method8462(this.anInt10178, arg2);
		@Pc(81) boolean local81 = Static206.method3569(arg2, this.anInt10178);
		@Pc(87) boolean local87 = Static390.method5791(arg2, this.anInt10178);
		@Pc(93) boolean local93 = local87 | local73 | local81;
		@Pc(204) int local204;
		if (local93) {
			if (!local73) {
				arg4.anIntArray580 = this.anIntArray580;
			} else if (arg0.anIntArray580 == null || arg0.anIntArray580.length < this.anInt10121) {
				arg4.anIntArray580 = arg0.anIntArray580 = new int[this.anInt10121];
			} else {
				arg4.anIntArray580 = arg0.anIntArray580;
			}
			if (!local81) {
				arg4.anIntArray582 = this.anIntArray582;
			} else if (arg0.anIntArray582 == null || this.anInt10121 > arg0.anIntArray582.length) {
				arg4.anIntArray582 = arg0.anIntArray582 = new int[this.anInt10121];
			} else {
				arg4.anIntArray582 = arg0.anIntArray582;
			}
			if (!local87) {
				arg4.anIntArray583 = this.anIntArray583;
			} else if (arg0.anIntArray583 == null || arg0.anIntArray583.length < this.anInt10121) {
				arg4.anIntArray583 = arg0.anIntArray583 = new int[this.anInt10121];
			} else {
				arg4.anIntArray583 = arg0.anIntArray583;
			}
			for (local204 = 0; local204 < this.anInt10121; local204++) {
				if (local73) {
					arg4.anIntArray580[local204] = this.anIntArray580[local204];
				}
				if (local81) {
					arg4.anIntArray582[local204] = this.anIntArray582[local204];
				}
				if (local87) {
					arg4.anIntArray583[local204] = this.anIntArray583[local204];
				}
			}
		} else {
			arg4.anIntArray582 = this.anIntArray582;
			arg4.anIntArray580 = this.anIntArray580;
			arg4.anIntArray583 = this.anIntArray583;
		}
		if (Static62.method1043(arg2, this.anInt10178)) {
			if (arg1) {
				arg4.aByte130 = (byte) (arg4.aByte130 | 0x1);
			}
			arg4.aClass18_12 = arg0.aClass18_12;
			arg4.aClass18_12.aByte3 = this.aClass18_12.aByte3;
			arg4.aClass18_12.anInterface10_1 = this.aClass18_12.anInterface10_1;
		} else if (Static549.method8015(this.anInt10178, arg2)) {
			arg4.aClass18_12 = this.aClass18_12;
		} else {
			arg4.aClass18_12 = null;
		}
		if (Static66.method1097(arg2, this.anInt10178)) {
			if (arg0.aShortArray152 == null || this.lb > arg0.aShortArray152.length) {
				arg4.aShortArray152 = arg0.aShortArray152 = new short[this.lb];
			} else {
				arg4.aShortArray152 = arg0.aShortArray152;
			}
			for (local204 = 0; local204 < this.lb; local204++) {
				arg4.aShortArray152[local204] = this.aShortArray152[local204];
			}
		} else {
			arg4.aShortArray152 = this.aShortArray152;
		}
		if (Static42.method751(this.anInt10178, arg2)) {
			if (arg0.aByteArray106 == null || arg0.aByteArray106.length < this.lb) {
				arg4.aByteArray106 = arg0.aByteArray106 = new byte[this.lb];
			} else {
				arg4.aByteArray106 = arg0.aByteArray106;
			}
			for (local204 = 0; local204 < this.lb; local204++) {
				arg4.aByteArray106[local204] = this.aByteArray106[local204];
			}
		} else {
			arg4.aByteArray106 = this.aByteArray106;
		}
		if (Static180.method2777(this.anInt10178, arg2)) {
			if (arg1) {
				arg4.aByte130 = (byte) (arg4.aByte130 | 0x2);
			}
			arg4.aClass18_13 = arg0.aClass18_13;
			arg4.aClass18_13.aByte3 = this.aClass18_13.aByte3;
			arg4.aClass18_13.anInterface10_1 = this.aClass18_13.anInterface10_1;
		} else if (Static165.method9035(arg2, this.anInt10178)) {
			arg4.aClass18_13 = this.aClass18_13;
		} else {
			arg4.aClass18_13 = null;
		}
		@Pc(541) int local541;
		if (Static553.method8062(arg2, this.anInt10178)) {
			if (arg0.aShortArray150 == null || arg0.aShortArray150.length < this.anInt10143) {
				local204 = this.anInt10143;
				arg4.aShortArray147 = arg0.aShortArray147 = new short[local204];
				arg4.aShortArray144 = arg0.aShortArray144 = new short[local204];
				arg4.aShortArray150 = arg0.aShortArray150 = new short[local204];
			} else {
				arg4.aShortArray150 = arg0.aShortArray150;
				arg4.aShortArray144 = arg0.aShortArray144;
				arg4.aShortArray147 = arg0.aShortArray147;
			}
			if (this.aClass315_1 == null) {
				for (local204 = 0; local204 < this.anInt10143; local204++) {
					arg4.aShortArray150[local204] = this.aShortArray150[local204];
					arg4.aShortArray147[local204] = this.aShortArray147[local204];
					arg4.aShortArray144[local204] = this.aShortArray144[local204];
				}
			} else {
				if (arg0.aClass315_1 == null) {
					arg0.aClass315_1 = new Class315();
				}
				@Pc(525) Class315 local525 = arg4.aClass315_1 = arg0.aClass315_1;
				if (local525.aShortArray126 == null || local525.aShortArray126.length < this.anInt10143) {
					local541 = this.anInt10143;
					local525.aShortArray127 = new short[local541];
					local525.aByteArray92 = new byte[local541];
					local525.aShortArray126 = new short[local541];
					local525.aShortArray128 = new short[local541];
				}
				for (local541 = 0; local541 < this.anInt10143; local541++) {
					arg4.aShortArray150[local541] = this.aShortArray150[local541];
					arg4.aShortArray147[local541] = this.aShortArray147[local541];
					arg4.aShortArray144[local541] = this.aShortArray144[local541];
					local525.aShortArray126[local541] = this.aClass315_1.aShortArray126[local541];
					local525.aShortArray128[local541] = this.aClass315_1.aShortArray128[local541];
					local525.aShortArray127[local541] = this.aClass315_1.aShortArray127[local541];
					local525.aByteArray92[local541] = this.aClass315_1.aByteArray92[local541];
				}
			}
			arg4.aByteArray107 = this.aByteArray107;
		} else {
			arg4.aShortArray147 = this.aShortArray147;
			arg4.aByteArray107 = this.aByteArray107;
			arg4.aShortArray144 = this.aShortArray144;
			arg4.aShortArray150 = this.aShortArray150;
			arg4.aClass315_1 = this.aClass315_1;
		}
		if (Static551.method8045(arg2, this.anInt10178)) {
			arg4.aClass18_15 = arg0.aClass18_15;
			if (arg1) {
				arg4.aByte130 = (byte) (arg4.aByte130 | 0x4);
			}
			arg4.aClass18_15.anInterface10_1 = this.aClass18_15.anInterface10_1;
			arg4.aClass18_15.aByte3 = this.aClass18_15.aByte3;
		} else if (Static378.method5551(this.anInt10178, arg2)) {
			arg4.aClass18_15 = this.aClass18_15;
		} else {
			arg4.aClass18_15 = null;
		}
		if (Static303.method4733(arg2, this.anInt10178)) {
			if (arg0.aFloatArray76 == null || this.lb > arg0.aFloatArray76.length) {
				local204 = this.anInt10143;
				arg4.aFloatArray77 = arg0.aFloatArray77 = new float[local204];
				arg4.aFloatArray76 = arg0.aFloatArray76 = new float[local204];
			} else {
				arg4.aFloatArray76 = arg0.aFloatArray76;
				arg4.aFloatArray77 = arg0.aFloatArray77;
			}
			for (local204 = 0; local204 < this.anInt10143; local204++) {
				arg4.aFloatArray76[local204] = this.aFloatArray76[local204];
				arg4.aFloatArray77[local204] = this.aFloatArray77[local204];
			}
		} else {
			arg4.aFloatArray76 = this.aFloatArray76;
			arg4.aFloatArray77 = this.aFloatArray77;
		}
		if (Static553.method8054(arg2, this.anInt10178)) {
			if (arg1) {
				arg4.aByte130 = (byte) (arg4.aByte130 | 0x8);
			}
			arg4.aClass18_14 = arg0.aClass18_14;
			arg4.aClass18_14.anInterface10_1 = this.aClass18_14.anInterface10_1;
			arg4.aClass18_14.aByte3 = this.aClass18_14.aByte3;
		} else if (Static214.method3666(arg2, this.anInt10178)) {
			arg4.aClass18_14 = this.aClass18_14;
		} else {
			arg4.aClass18_14 = null;
		}
		if (Static599.method8607(arg2, this.anInt10178)) {
			if (arg0.aShortArray143 == null || this.lb > arg0.aShortArray143.length) {
				local204 = this.lb;
				arg4.aShortArray145 = arg0.aShortArray145 = new short[local204];
				arg4.aShortArray142 = arg0.aShortArray142 = new short[local204];
				arg4.aShortArray143 = arg0.aShortArray143 = new short[local204];
			} else {
				arg4.aShortArray142 = arg0.aShortArray142;
				arg4.aShortArray145 = arg0.aShortArray145;
				arg4.aShortArray143 = arg0.aShortArray143;
			}
			for (local204 = 0; local204 < this.lb; local204++) {
				arg4.aShortArray143[local204] = this.aShortArray143[local204];
				arg4.aShortArray145[local204] = this.aShortArray145[local204];
				arg4.aShortArray142[local204] = this.aShortArray142[local204];
			}
		} else {
			arg4.aShortArray145 = this.aShortArray145;
			arg4.aShortArray143 = this.aShortArray143;
			arg4.aShortArray142 = this.aShortArray142;
		}
		if (Static431.method5477(arg2, this.anInt10178)) {
			if (arg1) {
				arg4.aByte130 = (byte) (arg4.aByte130 | 0x10);
			}
			arg4.aClass159_1 = arg0.aClass159_1;
			arg4.aClass159_1.anInterface21_1 = this.aClass159_1.anInterface21_1;
		} else if (Static173.method2686(this.anInt10178, arg2)) {
			arg4.aClass159_1 = this.aClass159_1;
		} else {
			arg4.aClass159_1 = null;
		}
		if (Static499.method8587(arg2, this.anInt10178)) {
			if (arg0.aShortArray146 == null || arg0.aShortArray146.length < this.lb) {
				local204 = this.lb;
				arg4.aShortArray146 = arg0.aShortArray146 = new short[local204];
			} else {
				arg4.aShortArray146 = arg0.aShortArray146;
			}
			for (local204 = 0; local204 < this.lb; local204++) {
				arg4.aShortArray146[local204] = this.aShortArray146[local204];
			}
		} else {
			arg4.aShortArray146 = this.aShortArray146;
		}
		if (!Static188.method8113(this.anInt10178, arg2)) {
			arg4.aClass241Array1 = this.aClass241Array1;
		} else if (arg0.aClass241Array1 == null || this.anInt10161 > arg0.aClass241Array1.length) {
			local204 = this.anInt10161;
			arg4.aClass241Array1 = arg0.aClass241Array1 = new Class241[local204];
			for (local541 = 0; local541 < this.anInt10161; local541++) {
				arg4.aClass241Array1[local541] = this.aClass241Array1[local541].method5389();
			}
		} else {
			arg4.aClass241Array1 = arg0.aClass241Array1;
			for (local204 = 0; local204 < this.anInt10161; local204++) {
				arg4.aClass241Array1[local204].method5390(this.aClass241Array1[local204]);
			}
		}
		arg4.anIntArray581 = this.anIntArray581;
		arg4.aShortArray149 = this.aShortArray149;
		arg4.anIntArrayArray74 = this.anIntArrayArray74;
		arg4.aClass261Array5 = this.aClass261Array5;
		arg4.aClass254Array1 = this.aClass254Array1;
		arg4.anIntArrayArray73 = this.anIntArrayArray73;
		arg4.aClass320Array4 = this.aClass320Array4;
		arg4.anIntArray585 = this.anIntArray585;
		if (this.aBoolean729) {
			arg4.aShort123 = this.aShort123;
			arg4.aShort128 = this.aShort128;
			arg4.aShort129 = this.aShort129;
			arg4.aShort124 = this.aShort124;
			arg4.aShort125 = this.aShort125;
			arg4.aShort122 = this.aShort122;
			arg4.aBoolean729 = true;
			arg4.aShort126 = this.aShort126;
			arg4.aShort120 = this.aShort120;
		} else {
			arg4.aBoolean729 = false;
		}
		arg4.aShortArray151 = this.aShortArray151;
		arg4.aShortArray148 = this.aShortArray148;
		arg4.anIntArrayArray75 = this.anIntArrayArray75;
		return arg4;
	}

	@OriginalMember(owner = "client!vo", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.lb; local7++) {
			if (arg0 == this.aShortArray152[local7]) {
				this.aShortArray152[local7] = arg1;
			}
		}
		if (this.aClass254Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt10161; local38++) {
				@Pc(45) Class254 local45 = this.aClass254Array1[local38];
				@Pc(50) Class241 local50 = this.aClass241Array1[local38];
				local50.anInt6071 = local50.anInt6071 & 0xFF000000 | Static349.anIntArray330[this.aShortArray152[local45.anInt6373] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10133; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray580[local15] + local9 * this.anIntArray583[local15] >> 14;
			this.anIntArray583[local15] = local13 * this.anIntArray583[local15] - local9 * this.anIntArray580[local15] >> 14;
			this.anIntArray580[local15] = local33;
		}
		this.aBoolean729 = false;
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "()[Lclient!ou;")
	@Override
	public Class261[] method8650() {
		return this.aClass261Array5;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!nj;)V")
	private void method8665(@OriginalArg(1) Class5_Sub5_Sub14_Sub1 arg0) {
		if (this.anInt10143 > this.aClass133_Sub3_37.anIntArray480.length) {
			this.aClass133_Sub3_37.anIntArray480 = new int[this.anInt10143];
			this.aClass133_Sub3_37.anIntArray479 = new int[this.anInt10143];
		}
		@Pc(28) int[] local28 = this.aClass133_Sub3_37.anIntArray480;
		@Pc(32) int[] local32 = this.aClass133_Sub3_37.anIntArray479;
		@Pc(60) int local60;
		@Pc(98) int local98;
		@Pc(107) int local107;
		for (@Pc(34) int local34 = 0; local34 < this.anInt10133; local34++) {
			local60 = (this.anIntArray580[local34] - (this.aClass133_Sub3_37.anInt8568 * this.anIntArray582[local34] >> 8) >> this.aClass133_Sub3_37.anInt8529) - arg0.anInt6232;
			@Pc(84) int local84 = (this.anIntArray583[local34] - (this.anIntArray582[local34] * this.aClass133_Sub3_37.anInt8548 >> 8) >> this.aClass133_Sub3_37.anInt8529) - arg0.anInt6223;
			@Pc(89) int local89 = this.anIntArray585[local34];
			@Pc(96) int local96 = this.anIntArray585[local34 + 1];
			for (local98 = local89; local98 < local96; local98++) {
				local107 = this.aShortArray151[local98] - 1;
				if (local107 == -1) {
					break;
				}
				local28[local107] = local60;
				local32[local107] = local84;
			}
		}
		for (local60 = 0; local60 < this.anInt10175; local60++) {
			if (this.aByteArray106 == null || this.aByteArray106[local60] <= 128) {
				@Pc(155) short local155 = this.aShortArray143[local60];
				@Pc(160) short local160 = this.aShortArray145[local60];
				@Pc(165) short local165 = this.aShortArray142[local60];
				local98 = local28[local155];
				local107 = local28[local160];
				@Pc(177) int local177 = local28[local165];
				@Pc(181) int local181 = local32[local155];
				@Pc(185) int local185 = local32[local160];
				@Pc(189) int local189 = local32[local165];
				if ((local185 - local189) * (local98 - local107) - (local177 - local107) * (local185 + -local181) > 0) {
					arg0.method5521(local181, local189, local107, local177, local185, local98);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "()V")
	@Override
	protected void method8658() {
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IILclient!tc;ZII)Z")
	@Override
	public boolean method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method8660(arg1, arg2, arg5, arg3, arg0, arg4);
	}

	@OriginalMember(owner = "client!vo", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort125;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class187 method8656(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class187_Sub3 local16;
		@Pc(12) Class187_Sub3 local12;
		if (arg0 == 1) {
			local12 = this.aClass133_Sub3_37.aClass187_Sub3_5;
			local16 = this.aClass133_Sub3_37.aClass187_Sub3_3;
		} else if (arg0 == 2) {
			local16 = this.aClass133_Sub3_37.aClass187_Sub3_4;
			local12 = this.aClass133_Sub3_37.aClass187_Sub3_9;
		} else if (arg0 == 3) {
			local16 = this.aClass133_Sub3_37.aClass187_Sub3_1;
			local12 = this.aClass133_Sub3_37.aClass187_Sub3_7;
		} else if (arg0 == 4) {
			local12 = this.aClass133_Sub3_37.aClass187_Sub3_8;
			local16 = this.aClass133_Sub3_37.aClass187_Sub3_2;
		} else if (arg0 == 5) {
			local16 = this.aClass133_Sub3_37.aClass187_Sub3_10;
			local12 = this.aClass133_Sub3_37.aClass187_Sub3_6;
		} else {
			local16 = local12 = new Class187_Sub3(this.aClass133_Sub3_37);
		}
		return this.method8664(local12, arg0 != 0, arg1, arg2, local16);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tc;Lclient!qw;II)V")
	@Override
	public void method8654(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10143 == 0) {
			return;
		}
		@Pc(16) Class113_Sub2 local16 = this.aClass133_Sub3_37.aClass113_Sub2_3;
		@Pc(19) Class113_Sub2 local19 = (Class113_Sub2) arg0;
		if (!this.aBoolean729) {
			this.method8673();
		}
		Static2.aFloat1 = local16.aFloat109 * local19.aFloat104 + local16.aFloat108 * local19.aFloat107 + local19.aFloat109 * local16.aFloat102;
		Static506.aFloat172 = local16.aFloat105 + local19.aFloat106 * local16.aFloat108 + local19.aFloat110 * local16.aFloat109 + local19.aFloat105 * local16.aFloat102;
		@Pc(72) float local72 = Static506.aFloat172 + (float) this.aShort129 * Static2.aFloat1;
		@Pc(80) float local80 = (float) this.aShort122 * Static2.aFloat1 + Static506.aFloat172;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = local72 + (float) this.aShort128;
			local96 = local80 - (float) this.aShort128;
		} else {
			local96 = (float) -this.aShort128 + local72;
			local90 = local80 + (float) this.aShort128;
		}
		if (local96 >= this.aClass133_Sub3_37.aFloat165 || (float) this.aClass133_Sub3_37.anInt8545 >= local90) {
			return;
		}
		Static186.aFloat48 = local16.aFloat106 + local19.aFloat106 * local16.aFloat103 + local19.aFloat110 * local16.aFloat107 + local19.aFloat105 * local16.aFloat101;
		Static566.aFloat183 = local19.aFloat107 * local16.aFloat103 + local16.aFloat107 * local19.aFloat104 + local19.aFloat109 * local16.aFloat101;
		@Pc(173) float local173 = Static186.aFloat48 + (float) this.aShort129 * Static566.aFloat183;
		@Pc(181) float local181 = Static186.aFloat48 + (float) this.aShort122 * Static566.aFloat183;
		@Pc(196) float local196;
		@Pc(207) float local207;
		if (local173 > local181) {
			local196 = (float) this.aClass133_Sub3_37.anInt8564 * ((float) -this.aShort128 + local181);
			local207 = ((float) this.aShort128 + local173) * (float) this.aClass133_Sub3_37.anInt8564;
		} else {
			local196 = (local173 - (float) this.aShort128) * (float) this.aClass133_Sub3_37.anInt8564;
			local207 = (float) this.aClass133_Sub3_37.anInt8564 * (local181 + (float) this.aShort128);
		}
		if (this.aClass133_Sub3_37.aFloat160 <= local196 / (float) arg2 || local207 / (float) arg2 <= this.aClass133_Sub3_37.aFloat167) {
			return;
		}
		Static15.aFloat3 = local16.aFloat110 + local19.aFloat105 * local16.aFloat112 + local16.aFloat111 * local19.aFloat106 + local19.aFloat110 * local16.aFloat104;
		Static17.aFloat4 = local16.aFloat112 * local19.aFloat109 + local16.aFloat111 * local19.aFloat107 + local19.aFloat104 * local16.aFloat104;
		@Pc(299) float local299 = Static15.aFloat3 + Static17.aFloat4 * (float) this.aShort129;
		@Pc(307) float local307 = (float) this.aShort122 * Static17.aFloat4 + Static15.aFloat3;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local307 < local299) {
			local333 = (float) this.aClass133_Sub3_37.anInt8550 * (local299 + (float) this.aShort128);
			local322 = (float) this.aClass133_Sub3_37.anInt8550 * (local307 - (float) this.aShort128);
		} else {
			local322 = (float) this.aClass133_Sub3_37.anInt8550 * (local299 - (float) this.aShort128);
			local333 = ((float) this.aShort128 + local307) * (float) this.aClass133_Sub3_37.anInt8550;
		}
		if (local322 / (float) arg2 >= this.aClass133_Sub3_37.aFloat156 || this.aClass133_Sub3_37.aFloat169 >= local333 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass254Array1 != null) {
			Static558.aFloat179 = local16.aFloat101 * local19.aFloat102 + local19.aFloat101 * local16.aFloat103 + local19.aFloat112 * local16.aFloat107;
			Static193.aFloat148 = local19.aFloat108 * local16.aFloat112 + local19.aFloat103 * local16.aFloat111 + local16.aFloat104 * local19.aFloat111;
			Static208.aFloat86 = local16.aFloat103 * local19.aFloat103 + local16.aFloat107 * local19.aFloat111 + local16.aFloat101 * local19.aFloat108;
			Static587.aFloat198 = local19.aFloat112 * local16.aFloat104 + local19.aFloat101 * local16.aFloat111 + local19.aFloat102 * local16.aFloat112;
			Static454.aFloat141 = local16.aFloat109 * local19.aFloat112 + local16.aFloat108 * local19.aFloat101 + local19.aFloat102 * local16.aFloat102;
			Static257.aFloat91 = local19.aFloat103 * local16.aFloat108 + local19.aFloat111 * local16.aFloat109 + local16.aFloat102 * local19.aFloat108;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort126 + this.aShort125 >> 1;
			@Pc(508) int local508 = this.aShort123 + this.aShort124 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static558.aFloat179 + Static186.aFloat48 + Static208.aFloat86 * (float) local500 + (float) this.aShort129 * Static566.aFloat183);
			@Pc(546) int local546 = (int) (Static17.aFloat4 * (float) this.aShort129 + (float) local500 * Static193.aFloat148 + Static15.aFloat3 + Static587.aFloat198 * (float) local508);
			@Pc(565) int local565 = (int) (Static506.aFloat172 + (float) local500 * Static257.aFloat91 + (float) this.aShort129 * Static2.aFloat1 + Static454.aFloat141 * (float) local508);
			@Pc(584) int local584 = (int) (Static558.aFloat179 * (float) local508 + Static208.aFloat86 * (float) local500 + Static186.aFloat48 + Static566.aFloat183 * (float) this.aShort122);
			@Pc(603) int local603 = (int) ((float) this.aShort122 * Static17.aFloat4 + (float) local500 * Static193.aFloat148 + Static15.aFloat3 + (float) local508 * Static587.aFloat198);
			arg1.anInt7890 = local527 * this.aClass133_Sub3_37.anInt8564 / arg2 + this.aClass133_Sub3_37.anInt8544;
			arg1.anInt7892 = local546 * this.aClass133_Sub3_37.anInt8550 / arg2 + this.aClass133_Sub3_37.anInt8549;
			arg1.anInt7891 = local603 * this.aClass133_Sub3_37.anInt8550 / arg2 + this.aClass133_Sub3_37.anInt8549;
			@Pc(661) int local661 = (int) ((float) this.aShort122 * Static2.aFloat1 + Static257.aFloat91 * (float) local500 + Static506.aFloat172 + (float) local508 * Static454.aFloat141);
			arg1.anInt7893 = this.aClass133_Sub3_37.anInt8564 * local584 / arg2 + this.aClass133_Sub3_37.anInt8544;
			if (local565 >= this.aClass133_Sub3_37.anInt8545 || this.aClass133_Sub3_37.anInt8545 <= local661) {
				arg1.anInt7894 = (this.aShort128 + local527) * this.aClass133_Sub3_37.anInt8564 / arg2 + this.aClass133_Sub3_37.anInt8544 - arg1.anInt7890;
				arg1.aBoolean558 = true;
			}
		}
		this.aClass133_Sub3_37.method7384((float) arg2);
		this.aClass133_Sub3_37.method7377();
		this.aClass133_Sub3_37.method7364(local19);
		this.method8666();
		this.aClass133_Sub3_37.method7331();
		this.method8672();
	}

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt10133; local15++) {
			local33 = local13 * this.anIntArray580[local15] + this.anIntArray583[local15] * local9 >> 14;
			this.anIntArray583[local15] = local13 * this.anIntArray583[local15] - local9 * this.anIntArray580[local15] >> 14;
			this.anIntArray580[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt10143; local33++) {
			@Pc(83) int local83 = local9 * this.aShortArray144[local33] + local13 * this.aShortArray150[local33] >> 14;
			this.aShortArray144[local33] = (short) (this.aShortArray144[local33] * local13 - this.aShortArray150[local33] * local9 >> 14);
			this.aShortArray150[local33] = (short) local83;
		}
		if (this.aClass18_15 == null && this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
		}
		if (this.aClass18_15 != null) {
			this.aClass18_15.anInterface10_1 = null;
		}
		this.aBoolean729 = false;
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method8638(@OriginalArg(0) Class113 arg0) {
		@Pc(8) Class113_Sub2 local8 = (Class113_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass261Array5 != null) {
			for (local13 = 0; local13 < this.aClass261Array5.length; local13++) {
				@Pc(20) Class261 local20 = this.aClass261Array5[local13];
				@Pc(22) Class261 local22 = local20;
				if (local20.aClass261_2 != null) {
					local22 = local20.aClass261_2;
				}
				local22.anInt7176 = (int) (local8.aFloat106 + (float) this.anIntArray583[local20.anInt7181] * local8.aFloat101 + local8.aFloat103 * (float) this.anIntArray580[local20.anInt7181] + (float) this.anIntArray582[local20.anInt7181] * local8.aFloat107);
				local22.anInt7169 = (int) ((float) this.anIntArray582[local20.anInt7181] * local8.aFloat104 + local8.aFloat111 * (float) this.anIntArray580[local20.anInt7181] + (float) this.anIntArray583[local20.anInt7181] * local8.aFloat112 + local8.aFloat110);
				local22.anInt7182 = (int) (local8.aFloat105 + local8.aFloat109 * (float) this.anIntArray582[local20.anInt7181] + (float) this.anIntArray580[local20.anInt7181] * local8.aFloat108 + local8.aFloat102 * (float) this.anIntArray583[local20.anInt7181]);
				local22.anInt7180 = (int) (local8.aFloat106 + local8.aFloat101 * (float) this.anIntArray583[local20.anInt7170] + (float) this.anIntArray582[local20.anInt7170] * local8.aFloat107 + local8.aFloat103 * (float) this.anIntArray580[local20.anInt7170]);
				local22.anInt7173 = (int) ((float) this.anIntArray583[local20.anInt7170] * local8.aFloat112 + local8.aFloat104 * (float) this.anIntArray582[local20.anInt7170] + local8.aFloat111 * (float) this.anIntArray580[local20.anInt7170] + local8.aFloat110);
				local22.anInt7166 = (int) ((float) this.anIntArray583[local20.anInt7170] * local8.aFloat102 + local8.aFloat109 * (float) this.anIntArray582[local20.anInt7170] + local8.aFloat108 * (float) this.anIntArray580[local20.anInt7170] + local8.aFloat105);
				local22.anInt7177 = (int) (local8.aFloat106 + local8.aFloat101 * (float) this.anIntArray583[local20.anInt7167] + (float) this.anIntArray582[local20.anInt7167] * local8.aFloat107 + local8.aFloat103 * (float) this.anIntArray580[local20.anInt7167]);
				local22.anInt7168 = (int) (local8.aFloat104 * (float) this.anIntArray582[local20.anInt7167] + local8.aFloat111 * (float) this.anIntArray580[local20.anInt7167] + (float) this.anIntArray583[local20.anInt7167] * local8.aFloat112 + local8.aFloat110);
				local22.anInt7174 = (int) (local8.aFloat105 + local8.aFloat102 * (float) this.anIntArray583[local20.anInt7167] + local8.aFloat108 * (float) this.anIntArray580[local20.anInt7167] + local8.aFloat109 * (float) this.anIntArray582[local20.anInt7167]);
			}
		}
		if (this.aClass320Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass320Array4.length; local13++) {
			@Pc(361) Class320 local361 = this.aClass320Array4[local13];
			@Pc(363) Class320 local363 = local361;
			if (local361.aClass320_2 != null) {
				local363 = local361.aClass320_2;
			}
			if (local361.aClass113_8 == null) {
				local361.aClass113_8 = local8.method8446();
			} else {
				local361.aClass113_8.method8456(local8);
			}
			local363.anInt8926 = (int) (local8.aFloat106 + (float) this.anIntArray582[local361.anInt8924] * local8.aFloat107 + (float) this.anIntArray580[local361.anInt8924] * local8.aFloat103 + local8.aFloat101 * (float) this.anIntArray583[local361.anInt8924]);
			local363.anInt8923 = (int) (local8.aFloat104 * (float) this.anIntArray582[local361.anInt8924] + (float) this.anIntArray580[local361.anInt8924] * local8.aFloat111 + local8.aFloat112 * (float) this.anIntArray583[local361.anInt8924] + local8.aFloat110);
			local363.anInt8925 = (int) (local8.aFloat105 + local8.aFloat102 * (float) this.anIntArray583[local361.anInt8924] + (float) this.anIntArray582[local361.anInt8924] * local8.aFloat109 + local8.aFloat108 * (float) this.anIntArray580[local361.anInt8924]);
		}
	}

	@OriginalMember(owner = "client!vo", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass133_Sub3_37.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.lb; local11++) {
			if (this.aShortArray146[local11] == arg0) {
				this.aShortArray146[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class145 local51 = local9.method4656(arg0 & 0xFFFF);
			local41 = local51.aByte67;
			local39 = local51.aByte66;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class145 local72 = local9.method4656(arg1 & 0xFFFF);
			if (local72.aByte62 != 0 || local72.aByte65 != 0) {
				this.aBoolean730 = true;
			}
			local59 = local72.aByte66;
			local61 = local72.aByte67;
		}
		if (!(local61 != local41 | local39 != local59)) {
			return;
		}
		if (this.aClass254Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt10161; local113++) {
				@Pc(120) Class254 local120 = this.aClass254Array1[local113];
				@Pc(125) Class241 local125 = this.aClass241Array1[local113];
				local125.anInt6071 = Static349.anIntArray330[this.aShortArray152[local120.anInt6373] & 0xFFFF] & 0xFFFFFF | local125.anInt6071 & 0xFF000000;
			}
		}
		if (this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean729) {
			this.method8673();
		}
		@Pc(16) int local16 = this.aShort126 + arg4;
		@Pc(21) int local21 = this.aShort125 + arg4;
		@Pc(26) int local26 = this.aShort124 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort123;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10026 <= arg2.anInt10027 + local21 >> arg2.anInt10031 || local26 < 0 || arg2.anInt10027 + local32 >> arg2.anInt10031 >= arg2.anInt10029)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt10027 >> arg3.anInt10031 >= arg3.anInt10026 || local26 < 0 || arg3.anInt10029 <= local32 + arg3.anInt10027 >> arg3.anInt10031) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10031;
			local21 = local21 + arg2.anInt10027 - 1 >> arg2.anInt10031;
			local26 >>= arg2.anInt10031;
			local32 = arg2.anInt10027 + local32 - 1 >> arg2.anInt10031;
			if (arg2.method8580(local26, local16) == arg5 && arg2.method8580(local26, local21) == arg5 && arg2.method8580(local32, local16) == arg5 && arg2.method8580(local32, local21) == arg5) {
				return;
			}
		}
		@Pc(291) int local291;
		if (arg0 == 1) {
			for (local291 = 0; local291 < this.anInt10133; local291++) {
				this.anIntArray582[local291] = this.anIntArray582[local291] + arg2.method8584(this.anIntArray583[local291] - -arg6, this.anIntArray580[local291] + arg4) - arg5;
			}
		} else {
			@Pc(213) int local213;
			@Pc(224) int local224;
			if (arg0 == 2) {
				@Pc(208) short local208 = this.aShort129;
				if (local208 == 0) {
					return;
				}
				for (local213 = 0; local213 < this.anInt10133; local213++) {
					local224 = (this.anIntArray582[local213] << 16) / local208;
					if (local224 < arg1) {
						this.anIntArray582[local213] -= -((arg2.method8584(this.anIntArray583[local213] + arg6, this.anIntArray580[local213] - -arg4) - arg5) * (-local224 + arg1) / arg1);
					}
				}
			} else {
				@Pc(309) int local309;
				if (arg0 == 3) {
					local291 = (arg1 & 0xFF) * 4;
					local213 = (arg1 >> 8 & 0xFF) * 4;
					local224 = (arg1 >> 16 & 0xFF) << 6;
					local309 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local291 >> 1) < 0 || (local291 >> 1) + arg4 + arg2.anInt10027 >= arg2.anInt10026 << arg2.anInt10031 || arg6 - (local213 >> 1) < 0 || arg2.anInt10029 << arg2.anInt10031 <= arg2.anInt10027 + arg6 + (local213 >> 1)) {
						return;
					}
					this.method8643(arg2, arg5, local213, local224, arg4, local291, arg6, local309);
				} else if (arg0 == 4) {
					local291 = this.aShort122 - this.aShort129;
					for (local213 = 0; local213 < this.anInt10133; local213++) {
						this.anIntArray582[local213] = this.anIntArray582[local213] + arg3.method8584(this.anIntArray583[local213] + arg6, this.anIntArray580[local213] - -arg4) + local291 - arg5;
					}
				} else if (arg0 == 5) {
					local291 = this.aShort122 - this.aShort129;
					for (local213 = 0; local213 < this.anInt10133; local213++) {
						local224 = this.anIntArray580[local213] + arg4;
						local309 = arg6 + this.anIntArray583[local213];
						@Pc(315) int local315 = arg2.method8584(local309, local224);
						@Pc(321) int local321 = arg3.method8584(local309, local224);
						@Pc(328) int local328 = local315 - arg1 - local321;
						this.anIntArray582[local213] = local315 + (local328 * ((this.anIntArray582[local213] << 8) / local291) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
		this.aBoolean729 = false;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8657(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class187_Sub3 local8 = (Class187_Sub3) arg0;
		if (this.lb == 0 || local8.lb == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt10133;
		@Pc(24) int[] local24 = local8.anIntArray580;
		@Pc(27) int[] local27 = local8.anIntArray582;
		@Pc(30) int[] local30 = local8.anIntArray583;
		@Pc(33) short[] local33 = local8.aShortArray150;
		@Pc(36) short[] local36 = local8.aShortArray147;
		@Pc(39) short[] local39 = local8.aShortArray144;
		@Pc(42) byte[] local42 = local8.aByteArray107;
		@Pc(49) short[] local49;
		@Pc(51) short[] local51;
		@Pc(53) short[] local53;
		@Pc(47) byte[] local47;
		if (this.aClass315_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local53 = this.aClass315_1.aShortArray127;
			local51 = this.aClass315_1.aShortArray128;
			local47 = this.aClass315_1.aByteArray92;
			local49 = this.aClass315_1.aShortArray126;
		}
		@Pc(82) short[] local82;
		@Pc(80) short[] local80;
		@Pc(76) short[] local76;
		@Pc(78) byte[] local78;
		if (local8.aClass315_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass315_1.aShortArray128;
			local82 = local8.aClass315_1.aShortArray126;
			local78 = local8.aClass315_1.aByteArray92;
			local76 = local8.aClass315_1.aShortArray127;
		}
		@Pc(103) int[] local103 = local8.anIntArray585;
		@Pc(106) short[] local106 = local8.aShortArray151;
		if (!local8.aBoolean729) {
			local8.method8673();
		}
		@Pc(115) short local115 = local8.aShort129;
		@Pc(118) short local118 = local8.aShort122;
		@Pc(121) short local121 = local8.aShort126;
		@Pc(124) short local124 = local8.aShort125;
		@Pc(127) short local127 = local8.aShort124;
		@Pc(130) short local130 = local8.aShort123;
		for (@Pc(132) int local132 = 0; local132 < this.anInt10133; local132++) {
			@Pc(142) int local142 = this.anIntArray582[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray580[local132] - arg1;
				if (local121 <= local162 && local124 >= local162) {
					@Pc(178) int local178 = this.anIntArray583[local132] - arg3;
					if (local127 <= local178 && local178 <= local130) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray585[local132];
						@Pc(204) int local204 = this.anIntArray585[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray151[local206] - 1;
							if (local192 == -1 || this.aByteArray107[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(236) int local236 = 0; local236 < local21; local236++) {
								if (local24[local236] == local162 && local178 == local30[local236] && local27[local236] == local142) {
									local204 = local103[local236 + 1];
									@Pc(269) int local269 = -1;
									local197 = local103[local236];
									for (@Pc(275) int local275 = local197; local275 < local204; local275++) {
										local269 = local106[local275] - 1;
										if (local269 == -1 || local42[local269] != 0) {
											break;
										}
									}
									if (local269 != -1) {
										if (local49 == null) {
											this.aClass315_1 = new Class315();
											local49 = this.aClass315_1.aShortArray126 = Static448.method6754(this.aShortArray150);
											local51 = this.aClass315_1.aShortArray128 = Static448.method6754(this.aShortArray147);
											local53 = this.aClass315_1.aShortArray127 = Static448.method6754(this.aShortArray144);
											local47 = this.aClass315_1.aByteArray92 = Static484.method7188(this.aByteArray107);
										}
										if (local82 == null) {
											@Pc(357) Class315 local357 = local8.aClass315_1 = new Class315();
											local82 = local357.aShortArray126 = Static448.method6754(local33);
											local80 = local357.aShortArray128 = Static448.method6754(local36);
											local76 = local357.aShortArray127 = Static448.method6754(local39);
											local78 = local357.aByteArray92 = Static484.method7188(local42);
										}
										@Pc(390) short local390 = this.aShortArray150[local192];
										@Pc(395) short local395 = this.aShortArray147[local192];
										@Pc(400) short local400 = this.aShortArray144[local192];
										local204 = local103[local236 + 1];
										@Pc(411) byte local411 = this.aByteArray107[local192];
										local197 = local103[local236];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local197; local417 < local204; local417++) {
											local425 = local106[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local78[local425] != 0) {
												local82[local425] += local390;
												local80[local425] += local395;
												local76[local425] += local400;
												local78[local425] += local411;
											}
										}
										local400 = local39[local269];
										local197 = this.anIntArray585[local132];
										local395 = local36[local269];
										local390 = local33[local269];
										local204 = this.anIntArray585[local132 + 1];
										local411 = local42[local269];
										for (local425 = local197; local425 < local204; local425++) {
											@Pc(510) int local510 = this.aShortArray151[local425] - 1;
											if (local510 == -1) {
												break;
											}
											if (local47[local510] != 0) {
												local49[local510] += local390;
												local51[local510] += local395;
												local53[local510] += local400;
												local47[local510] += local411;
											}
										}
										if (this.aClass18_15 == null && this.aClass18_13 != null) {
											this.aClass18_13.anInterface10_1 = null;
										}
										if (this.aClass18_15 != null) {
											this.aClass18_15.anInterface10_1 = null;
										}
										if (local8.aClass18_15 == null && local8.aClass18_13 != null) {
											local8.aClass18_13.anInterface10_1 = null;
										}
										if (local8.aClass18_15 != null) {
											local8.aClass18_15.anInterface10_1 = null;
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

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!tc;IZ)V")
	@Override
	public void method8659(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray149 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10133; local14++) {
			if ((arg1 & this.aShortArray149[local14]) != 0) {
				if (arg2) {
					arg0.method8445(this.anIntArray580[local14], this.anIntArray582[local14], this.anIntArray583[local14], local12);
				} else {
					arg0.method8448(this.anIntArray580[local14], this.anIntArray582[local14], this.anIntArray583[local14], local12);
				}
				this.anIntArray580[local14] = local12[0];
				this.anIntArray582[local14] = local12[1];
				this.anIntArray583[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean729) {
			this.method8673();
		}
		return this.aShort129;
	}

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "(I)V")
	private void method8666() {
		if (this.anInt10175 == 0) {
			return;
		}
		if (this.aByte130 != 0) {
			this.method8663(true);
		}
		this.method8663(false);
		if (this.aClass159_1 != null) {
			if (this.aClass159_1.anInterface21_1 == null) {
				this.method8675((this.aByte130 & 0x10) != 0);
			}
			if (this.aClass159_1.anInterface21_1 != null) {
				this.aClass133_Sub3_37.method7359(this.aClass18_15 != null);
				this.aClass133_Sub3_37.method7396(this.aClass18_15, this.aClass18_13, this.aClass18_14, this.aClass18_12);
				@Pc(82) int local82 = this.anIntArray581.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray581[local84];
					@Pc(98) int local98 = this.anIntArray581[local84 + 1];
					@Pc(105) int local105 = this.aShortArray146[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass133_Sub3_37.method7380(local105, this.aClass18_15 != null);
					this.aClass133_Sub3_37.method7383(local91 * 3, (local98 - local91) * 3, this.aClass159_1.anInterface21_1);
				}
			}
		}
		this.method8662();
	}

	@OriginalMember(owner = "client!vo", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort121;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "()[Lclient!sn;")
	@Override
	public Class320[] method8636() {
		return this.aClass320Array4;
	}

	@OriginalMember(owner = "client!vo", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10121; local3++) {
			this.anIntArray580[local3] = this.anIntArray580[local3] + 7 >> 4;
			this.anIntArray582[local3] = this.anIntArray582[local3] + 7 >> 4;
			this.anIntArray583[local3] = this.anIntArray583[local3] + 7 >> 4;
		}
		this.aBoolean729 = false;
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIFZIIJIFLclient!b;)S")
	private short method8667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) long arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) Class26 arg8) {
		@Pc(10) int local10 = this.anIntArray585[arg0];
		@Pc(17) int local17 = this.anIntArray585[arg0 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray151[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg5 == Static199.aLongArray2[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray151[local19] = (short) (this.anInt10143 + 1);
		Static199.aLongArray2[local19] = arg5;
		this.aShortArray150[this.anInt10143] = (short) arg1;
		this.aShortArray147[this.anInt10143] = (short) arg4;
		this.aShortArray144[this.anInt10143] = (short) arg6;
		this.aByteArray107[this.anInt10143] = (byte) arg3;
		this.aFloatArray76[this.anInt10143] = arg2;
		this.aFloatArray77[this.anInt10143] = arg7;
		return (short) this.anInt10143++;
	}

	@OriginalMember(owner = "client!vo", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static220.anInt4131 = 0;
			Static215.anInt4073 = 0;
			Static91.anInt1869 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt10133; local17++) {
				Static215.anInt4073 += this.anIntArray580[local17];
				Static91.anInt1869 += this.anIntArray582[local17];
				local15++;
				Static220.anInt4131 += this.anIntArray583[local17];
			}
			if (local15 <= 0) {
				Static91.anInt1869 = arg2;
				Static220.anInt4131 = arg3;
				Static215.anInt4073 = arg1;
			} else {
				Static91.anInt1869 = Static91.anInt1869 / local15 + arg2;
				Static220.anInt4131 = Static220.anInt4131 / local15 + arg3;
				Static215.anInt4073 = Static215.anInt4073 / local15 + arg1;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt10133; local15++) {
				this.anIntArray580[local15] += arg1;
				this.anIntArray582[local15] += arg2;
				this.anIntArray583[local15] += arg3;
			}
		} else {
			@Pc(153) int local153;
			@Pc(171) int local171;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt10133; local15++) {
					this.anIntArray580[local15] -= Static215.anInt4073;
					this.anIntArray582[local15] -= Static91.anInt1869;
					this.anIntArray583[local15] -= Static220.anInt4131;
					if (arg3 != 0) {
						local17 = Class377.anIntArray600[arg3];
						local153 = Class377.anIntArray601[arg3];
						local171 = local153 * this.anIntArray580[local15] + this.anIntArray582[local15] * local17 + 16383 >> 14;
						this.anIntArray582[local15] = this.anIntArray582[local15] * local153 + 16383 - this.anIntArray580[local15] * local17 >> 14;
						this.anIntArray580[local15] = local171;
					}
					if (arg1 != 0) {
						local17 = Class377.anIntArray600[arg1];
						local153 = Class377.anIntArray601[arg1];
						local171 = local153 * this.anIntArray582[local15] + 16383 - local17 * this.anIntArray583[local15] >> 14;
						this.anIntArray583[local15] = this.anIntArray583[local15] * local153 + this.anIntArray582[local15] * local17 + 16383 >> 14;
						this.anIntArray582[local15] = local171;
					}
					if (arg2 != 0) {
						local17 = Class377.anIntArray600[arg2];
						local153 = Class377.anIntArray601[arg2];
						local171 = this.anIntArray583[local15] * local17 + this.anIntArray580[local15] * local153 + 16383 >> 14;
						this.anIntArray583[local15] = local153 * this.anIntArray583[local15] + 16383 - this.anIntArray580[local15] * local17 >> 14;
						this.anIntArray580[local15] = local171;
					}
					this.anIntArray580[local15] += Static215.anInt4073;
					this.anIntArray582[local15] += Static91.anInt1869;
					this.anIntArray583[local15] += Static220.anInt4131;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt10133; local15++) {
					this.anIntArray580[local15] -= Static215.anInt4073;
					this.anIntArray582[local15] -= Static91.anInt1869;
					this.anIntArray583[local15] -= Static220.anInt4131;
					this.anIntArray580[local15] = this.anIntArray580[local15] * arg1 / 128;
					this.anIntArray582[local15] = this.anIntArray582[local15] * arg2 / 128;
					this.anIntArray583[local15] = this.anIntArray583[local15] * arg3 / 128;
					this.anIntArray580[local15] += Static215.anInt4073;
					this.anIntArray582[local15] += Static91.anInt1869;
					this.anIntArray583[local15] += Static220.anInt4131;
				}
			} else {
				@Pc(502) Class254 local502;
				@Pc(507) Class241 local507;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.lb; local15++) {
						local17 = (this.aByteArray106[local15] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray106[local15] = (byte) local17;
					}
					if (this.aClass18_13 != null) {
						this.aClass18_13.anInterface10_1 = null;
					}
					if (this.aClass254Array1 != null) {
						for (local17 = 0; local17 < this.anInt10161; local17++) {
							local502 = this.aClass254Array1[local17];
							local507 = this.aClass241Array1[local17];
							local507.anInt6071 = 255 - (this.aByteArray106[local502.anInt6373] & 0xFF) << 24 | local507.anInt6071 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.lb; local15++) {
						local17 = this.aShortArray152[local15] & 0xFFFF;
						local153 = local17 >> 10 & 0x3F;
						local171 = local17 >> 7 & 0x7;
						local171 += arg2 / 4;
						@Pc(570) int local570 = local17 & 0x7F;
						@Pc(577) int local577 = local153 + arg1 & 0x3F;
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
						this.aShortArray152[local15] = (short) (local171 << 7 | local577 << 10 | local570);
					}
					if (this.aClass18_13 != null) {
						this.aClass18_13.anInterface10_1 = null;
					}
					if (this.aClass254Array1 != null) {
						for (local17 = 0; local17 < this.anInt10161; local17++) {
							local502 = this.aClass254Array1[local17];
							local507 = this.aClass241Array1[local17];
							local507.anInt6071 = Static349.anIntArray330[this.aShortArray152[local502.anInt6373] & 0xFFFF] & 0xFFFFFF | local507.anInt6071 & 0xFF000000;
						}
					}
				} else {
					@Pc(695) Class241 local695;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt10161; local15++) {
							local695 = this.aClass241Array1[local15];
							local695.anInt6073 += arg1;
							local695.anInt6075 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt10161; local15++) {
							local695 = this.aClass241Array1[local15];
							local695.anInt6074 = local695.anInt6074 * arg2 >> 7;
							local695.anInt6072 = local695.anInt6072 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt10161; local15++) {
							local695 = this.aClass241Array1[local15];
							local695.anInt6069 = local695.anInt6069 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ISBBI)I")
	private int method8669(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18 = Static349.anIntArray330[Static361.method8009(arg3, arg0)];
		if (arg1 != -1) {
			@Pc(31) Class145 local31 = this.aClass133_Sub3_37.anInterface3_12.method4656(arg1 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte66 & 0xFF;
			@Pc(50) int local50;
			@Pc(72) int local72;
			if (local36 != 0) {
				if (arg3 < 0) {
					local50 = 0;
				} else if (arg3 <= 127) {
					local50 = arg3 * 131586;
				} else {
					local50 = 16777215;
				}
				if (local36 == 256) {
					local18 = local50;
				} else {
					local72 = 256 - local36;
					local18 = (local36 * (local50 & 0xFF00) + (local18 & 0xFF00) * local72 & 0xFF0000) + (local36 * (local50 & 0xFF00FF) + (local18 & 0xFF00FF) * local72 & 0xFF00FF00) >> 8;
				}
			}
			local50 = local31.aByte67 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(118) int local118 = local50 * (local18 >> 16 & 0xFF);
				if (local118 > 65535) {
					local118 = 65535;
				}
				local72 = (local18 >> 8 & 0xFF) * local50;
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(146) int local146 = local50 * (local18 & 0xFF);
				if (local146 > 65535) {
					local146 = 65535;
				}
				local18 = ((local118 & 0xA00FF00) << 8) + ((local72 & 0xFF00) + (local146 >> 8));
			}
		}
		return (local18 << 8) + 255 - (arg2 & 0xFF);
	}

	@OriginalMember(owner = "client!vo", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10133; local15++) {
			@Pc(34) int local34 = this.anIntArray582[local15] * local13 - this.anIntArray583[local15] * local9 >> 14;
			this.anIntArray583[local15] = local9 * this.anIntArray582[local15] + this.anIntArray583[local15] * local13 >> 14;
			this.anIntArray582[local15] = local34;
		}
		this.aBoolean729 = false;
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt10152;
	}

	@OriginalMember(owner = "client!vo", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort127 = (short) arg0;
		if (this.aClass18_13 != null) {
			this.aClass18_13.anInterface10_1 = null;
		}
		if (this.aClass18_15 != null) {
			this.aClass18_15.anInterface10_1 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10133; local3++) {
			if (arg0 != 0) {
				this.anIntArray580[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray582[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray583[local3] += arg2;
			}
		}
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
		this.aBoolean729 = false;
	}

	@OriginalMember(owner = "client!vo", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean727;
	}

	@OriginalMember(owner = "client!vo", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10133; local15++) {
			@Pc(33) int local33 = this.anIntArray580[local15] * local13 + local9 * this.anIntArray582[local15] >> 14;
			this.anIntArray582[local15] = this.anIntArray582[local15] * local13 - local9 * this.anIntArray580[local15] >> 14;
			this.anIntArray580[local15] = local33;
		}
		if (this.aClass18_12 != null) {
			this.aClass18_12.anInterface10_1 = null;
		}
		this.aBoolean729 = false;
	}

	@OriginalMember(owner = "client!vo", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray73 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt10121; local12++) {
			this.anIntArray580[local12] <<= 0x4;
			this.anIntArray582[local12] <<= 0x4;
			this.anIntArray583[local12] <<= 0x4;
		}
		Static215.anInt4073 = 0;
		Static220.anInt4131 = 0;
		Static91.anInt1869 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "()Z")
	@Override
	public boolean method8649() {
		if (this.aShortArray146 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray146.length; local12++) {
			if (this.aShortArray146[local12] != -1 && !this.aClass133_Sub3_37.anInterface3_12.method4654(this.aShortArray146[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub14 ba(@OriginalArg(0) Class5_Sub5_Sub14 arg0) {
		if (this.anInt10143 == 0) {
			return null;
		}
		if (!this.aBoolean729) {
			this.method8673();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass133_Sub3_37.anInt8568 <= 0) {
			local40 = this.aShort126 - (this.aShort129 * this.aClass133_Sub3_37.anInt8568 >> 8) >> this.aClass133_Sub3_37.anInt8529;
			local56 = this.aShort125 - (this.aClass133_Sub3_37.anInt8568 * this.aShort122 >> 8) >> this.aClass133_Sub3_37.anInt8529;
		} else {
			local40 = this.aShort126 - (this.aShort122 * this.aClass133_Sub3_37.anInt8568 >> 8) >> this.aClass133_Sub3_37.anInt8529;
			local56 = this.aShort125 - (this.aClass133_Sub3_37.anInt8568 * this.aShort129 >> 8) >> this.aClass133_Sub3_37.anInt8529;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass133_Sub3_37.anInt8548 > 0) {
			local116 = this.aShort124 - (this.aShort122 * this.aClass133_Sub3_37.anInt8548 >> 8) >> this.aClass133_Sub3_37.anInt8529;
			local133 = this.aShort123 - (this.aShort129 * this.aClass133_Sub3_37.anInt8548 >> 8) >> this.aClass133_Sub3_37.anInt8529;
		} else {
			local116 = this.aShort124 - (this.aShort129 * this.aClass133_Sub3_37.anInt8548 >> 8) >> this.aClass133_Sub3_37.anInt8529;
			local133 = this.aShort123 - (this.aShort122 * this.aClass133_Sub3_37.anInt8548 >> 8) >> this.aClass133_Sub3_37.anInt8529;
		}
		@Pc(175) int local175 = local56 + 1 - local40;
		@Pc(182) int local182 = local133 + 1 - local116;
		@Pc(185) Class5_Sub5_Sub14_Sub1 local185 = (Class5_Sub5_Sub14_Sub1) arg0;
		@Pc(195) Class5_Sub5_Sub14_Sub1 local195;
		if (local185 != null && local185.method5526(local182, local175)) {
			local195 = local185;
			local185.method5522();
		} else {
			local195 = new Class5_Sub5_Sub14_Sub1(this.aClass133_Sub3_37, local175, local182);
		}
		local195.method5524(local116, local133, local40, local56);
		this.method8665(local195);
		return local195;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
	private void method8672() {
		if (this.aClass254Array1 == null) {
			return;
		}
		@Pc(12) Class113_Sub2 local12 = this.aClass133_Sub3_37.aClass113_Sub2_2;
		this.aClass133_Sub3_37.method7329();
		this.aClass133_Sub3_37.C(!this.aBoolean727);
		this.aClass133_Sub3_37.method7359(false);
		this.aClass133_Sub3_37.method7396(null, null, this.aClass133_Sub3_37.aClass18_8, this.aClass133_Sub3_37.aClass18_7);
		for (@Pc(44) int local44 = 0; local44 < this.anInt10161; local44++) {
			@Pc(51) Class254 local51 = this.aClass254Array1[local44];
			@Pc(56) Class241 local56 = this.aClass241Array1[local44];
			if (!local51.aBoolean457 || !this.aClass133_Sub3_37.method7319()) {
				@Pc(84) float local84 = (float) (this.anIntArray580[local51.anInt6372] + this.anIntArray580[local51.anInt6366] + this.anIntArray580[local51.anInt6370]) * 0.3333333F;
				@Pc(105) float local105 = (float) (this.anIntArray582[local51.anInt6372] + this.anIntArray582[local51.anInt6366] + this.anIntArray582[local51.anInt6370]) * 0.3333333F;
				@Pc(126) float local126 = (float) (this.anIntArray583[local51.anInt6372] + this.anIntArray583[local51.anInt6366] + this.anIntArray583[local51.anInt6370]) * 0.3333333F;
				@Pc(140) float local140 = Static186.aFloat48 + Static558.aFloat179 * local126 + local84 * Static208.aFloat86 + local105 * Static566.aFloat183;
				@Pc(154) float local154 = Static15.aFloat3 + local105 * Static17.aFloat4 + Static193.aFloat148 * local84 + Static587.aFloat198 * local126;
				@Pc(168) float local168 = Static454.aFloat141 * local126 + Static257.aFloat91 * local84 + Static2.aFloat1 * local105 + Static506.aFloat172;
				@Pc(189) float local189 = (float) (1.0D / Math.sqrt((double) (local168 * local168 + local140 * local140 + local154 * local154))) * (float) local51.anInt6374;
				local12.method5672(local168 * local189 - local168, local51.aShort91 * local56.anInt6074 >> 7, (float) local56.anInt6073 + local140 - local189 * local140, local56.anInt6069, local56.anInt6072 * local51.aShort90 >> 7, local154 * local189 + (float) local56.anInt6075 - local154);
				this.aClass133_Sub3_37.method7343(local12);
				@Pc(242) int local242 = local56.anInt6071;
				OpenGL.glColor4ub((byte) (local242 >> 16), (byte) (local242 >> 8), (byte) local242, (byte) (local242 >> 24));
				this.aClass133_Sub3_37.method7395(local51.aShort92);
				this.aClass133_Sub3_37.method7388(local51.aByte99);
				this.aClass133_Sub3_37.method7338(4);
			}
		}
		this.aClass133_Sub3_37.C(true);
		this.aClass133_Sub3_37.method7331();
	}

	@OriginalMember(owner = "client!vo", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean730;
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
	private void method8673() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt10133; local23++) {
			@Pc(30) int local30 = this.anIntArray580[local23];
			@Pc(35) int local35 = this.anIntArray582[local23];
			if (local30 < local7) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local30 > local13) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			@Pc(68) int local68 = this.anIntArray583[local23];
			if (local68 > local17) {
				local17 = local68;
			}
			if (local11 > local68) {
				local11 = local68;
			}
			@Pc(94) int local94 = local68 * local68 + local30 * local30;
			if (local19 < local94) {
				local19 = local94;
			}
			local94 = local30 * local30 + local68 * local68 + local35 * local35;
			if (local21 < local94) {
				local21 = local94;
			}
		}
		this.aShort129 = (short) local9;
		this.aShort125 = (short) local13;
		this.aShort126 = (short) local7;
		this.aShort123 = (short) local17;
		this.aShort124 = (short) local11;
		this.aShort122 = (short) local15;
		this.aShort128 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort120 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean729 = true;
	}

	@OriginalMember(owner = "client!vo", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort127;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZB)V")
	private void method8675(@OriginalArg(0) boolean arg0) {
		if (this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3.aByteArray71.length >= this.anInt10175 * 6) {
			this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3.anInt6629 = 0;
		} else {
			this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3 = new Class5_Sub22_Sub2(this.anInt10175 * 6 + 600);
		}
		@Pc(42) Class5_Sub22_Sub2 local42 = this.aClass133_Sub3_37.aClass5_Sub22_Sub2_3;
		@Pc(48) int local48;
		if (this.aClass133_Sub3_37.aBoolean611) {
			for (local48 = 0; local48 < this.anInt10175; local48++) {
				local42.method5918(this.aShortArray143[local48]);
				local42.method5918(this.aShortArray145[local48]);
				local42.method5918(this.aShortArray142[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt10175; local48++) {
				local42.method5948(this.aShortArray143[local48]);
				local42.method5948(this.aShortArray145[local48]);
				local42.method5948(this.aShortArray142[local48]);
			}
		}
		if (local42.anInt6629 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface21_5 == null) {
				this.anInterface21_5 = this.aClass133_Sub3_37.method7371(local42.aByteArray71, true, local42.anInt6629);
			} else {
				this.anInterface21_5.method8974(local42.aByteArray71, local42.anInt6629);
			}
			this.aClass159_1.anInterface21_1 = this.anInterface21_5;
		} else {
			this.aClass159_1.anInterface21_1 = this.aClass133_Sub3_37.method7371(local42.aByteArray71, false, local42.anInt6629);
		}
		if (!arg0) {
			this.aBoolean728 = true;
		}
	}
}
