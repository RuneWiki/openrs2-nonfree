import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class83_Sub2 extends Class83 {

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "[F")
	private float[] aFloatArray56;

	@OriginalMember(owner = "client!lea", name = "t", descriptor = "[I")
	private int[] anIntArray355;

	@OriginalMember(owner = "client!lea", name = "x", descriptor = "[I")
	private int[] anIntArray356;

	@OriginalMember(owner = "client!lea", name = "y", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!lea", name = "E", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "I")
	private int anInt6106;

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "[F")
	private float[] aFloatArray57;

	@OriginalMember(owner = "client!lea", name = "T", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!lea", name = "X", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!lea", name = "cb", descriptor = "[Lclient!oia;")
	private Class238[] aClass238Array3;

	@OriginalMember(owner = "client!lea", name = "db", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!lea", name = "gb", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!lea", name = "hb", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!lea", name = "ib", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!lea", name = "jb", descriptor = "I")
	private int anInt6122;

	@OriginalMember(owner = "client!lea", name = "lb", descriptor = "[Lclient!bl;")
	private Class39[] lb;

	@OriginalMember(owner = "client!lea", name = "nb", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!lea", name = "rb", descriptor = "Lclient!ae;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!lea", name = "ub", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!lea", name = "vb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!lea", name = "Bb", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!lea", name = "Gb", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!lea", name = "Ib", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!lea", name = "Nb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!lea", name = "Qb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!lea", name = "Xb", descriptor = "Lclient!id;")
	private Interface9 anInterface9_3;

	@OriginalMember(owner = "client!lea", name = "Yb", descriptor = "[Lclient!nda;")
	private Class219[] aClass219Array3;

	@OriginalMember(owner = "client!lea", name = "Zb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!lea", name = "bc", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!lea", name = "cc", descriptor = "[I")
	private int[] anIntArray357;

	@OriginalMember(owner = "client!lea", name = "ec", descriptor = "[I")
	private int[] anIntArray358;

	@OriginalMember(owner = "client!lea", name = "gc", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!lea", name = "hc", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!lea", name = "lc", descriptor = "I")
	private int anInt6152;

	@OriginalMember(owner = "client!lea", name = "mc", descriptor = "[I")
	private int[] anIntArray359;

	@OriginalMember(owner = "client!lea", name = "nc", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!lea", name = "pc", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!lea", name = "qc", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!lea", name = "tc", descriptor = "B")
	private byte aByte61;

	@OriginalMember(owner = "client!lea", name = "uc", descriptor = "Lclient!tv;")
	private Interface23 anInterface23_2;

	@OriginalMember(owner = "client!lea", name = "yc", descriptor = "[Lclient!gs;")
	private Class122[] aClass122Array1;

	@OriginalMember(owner = "client!lea", name = "D", descriptor = "I")
	private int anInt6105 = 0;

	@OriginalMember(owner = "client!lea", name = "K", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "I")
	private int anInt6100 = 0;

	@OriginalMember(owner = "client!lea", name = "V", descriptor = "Z")
	private boolean aBoolean438 = true;

	@OriginalMember(owner = "client!lea", name = "Eb", descriptor = "I")
	private int anInt6136 = 0;

	@OriginalMember(owner = "client!lea", name = "kc", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "client!lea", name = "qb", descriptor = "I")
	private int anInt6126 = 0;

	@OriginalMember(owner = "client!lea", name = "w", descriptor = "I")
	private int anInt6101 = 0;

	@OriginalMember(owner = "client!lea", name = "oc", descriptor = "Z")
	private boolean aBoolean440 = false;

	@OriginalMember(owner = "client!lea", name = "dc", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_26;

	@OriginalMember(owner = "client!lea", name = "Kb", descriptor = "Lclient!pw;")
	private Class268 aClass268_9;

	@OriginalMember(owner = "client!lea", name = "ac", descriptor = "Lclient!pw;")
	private Class268 aClass268_10;

	@OriginalMember(owner = "client!lea", name = "N", descriptor = "Lclient!pw;")
	private Class268 aClass268_7;

	@OriginalMember(owner = "client!lea", name = "Fb", descriptor = "Lclient!pw;")
	private Class268 aClass268_8;

	@OriginalMember(owner = "client!lea", name = "ob", descriptor = "Lclient!ta;")
	private Class320 aClass320_1;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class83_Sub2(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aClass16_Sub3_26 = arg0;
		this.aClass268_9 = new Class268(null, 5126, 3, 0);
		this.aClass268_10 = new Class268(null, 5126, 2, 0);
		this.aClass268_7 = new Class268(null, 5126, 3, 0);
		this.aClass268_8 = new Class268(null, 5121, 4, 0);
		this.aClass320_1 = new Class320();
	}

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!nv;Lclient!uk;IIII)V")
	public Class83_Sub2(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) Class344 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6122 = arg2;
		this.aClass16_Sub3_26 = arg0;
		this.anInt6106 = arg5;
		if (Static598.method1720(arg2, arg5)) {
			this.aClass268_9 = new Class268(null, 5126, 3, 0);
		}
		if (Static107.method2393(arg2, arg5)) {
			this.aClass268_10 = new Class268(null, 5126, 2, 0);
		}
		if (Static284.method4804(arg2, arg5)) {
			this.aClass268_7 = new Class268(null, 5126, 3, 0);
		}
		if (Static537.method7584(arg5, arg2)) {
			this.aClass268_8 = new Class268(null, 5121, 4, 0);
		}
		if (Static136.method2946(arg5, arg2)) {
			this.aClass320_1 = new Class320();
		}
		@Pc(108) Interface2 local108 = arg0.anInterface2_12;
		this.anIntArray355 = new int[arg1.anInt9923 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt9930];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt9930; local121++) {
			if (arg1.aByteArray100 == null || arg1.aByteArray100[local121] != 2) {
				if (arg1.aShortArray135 != null && arg1.aShortArray135[local121] != -1) {
					@Pc(154) Class218 local154 = local108.method4027(arg1.aShortArray135[local121] & 0xFFFF);
					if (((this.anInt6106 & 0x40) == 0 || !local154.aBoolean471) && local154.aBoolean475) {
						continue;
					}
				}
				local119[this.anInt6136++] = local121;
				this.anIntArray355[arg1.aShortArray131[local121]]++;
				this.anIntArray355[arg1.aShortArray128[local121]]++;
				this.anIntArray355[arg1.aShortArray134[local121]]++;
			}
		}
		this.anInt6126 = this.anInt6136;
		@Pc(227) long[] local227 = new long[this.anInt6136];
		@Pc(236) boolean local236 = (this.anInt6122 & 0x100) != 0;
		@Pc(248) int local248;
		@Pc(261) int local261;
		@Pc(438) int local438;
		for (@Pc(238) int local238 = 0; local238 < this.anInt6136; local238++) {
			@Pc(244) int local244 = local119[local238];
			@Pc(246) Class218 local246 = null;
			local248 = 0;
			@Pc(250) byte local250 = 0;
			@Pc(252) byte local252 = 0;
			@Pc(254) byte local254 = 0;
			if (arg1.aClass156Array1 != null) {
				@Pc(259) boolean local259 = false;
				for (local261 = 0; local261 < arg1.aClass156Array1.length; local261++) {
					@Pc(268) Class156 local268 = arg1.aClass156Array1[local261];
					if (local244 == local268.anInt5531) {
						@Pc(277) Class101 local277 = Static635.method8514(local268.anInt5528);
						if (local277.aBoolean274) {
							local259 = true;
						}
						if (local277.anInt3716 != -1) {
							@Pc(293) Class218 local293 = local108.method4027(local277.anInt3716);
							if (local293.anInt6842 == 2) {
								this.aBoolean439 = true;
							}
						}
					}
				}
				if (local259) {
					local227[local238] = Long.MAX_VALUE;
					this.anInt6126--;
					continue;
				}
			}
			@Pc(324) short local324 = -1;
			if (arg1.aShortArray135 != null) {
				local324 = arg1.aShortArray135[local244];
				if (local324 != -1) {
					local246 = local108.method4027(local324 & 0xFFFF);
					if ((this.anInt6106 & 0x40) != 0 && local246.aBoolean471) {
						local246 = null;
						local324 = -1;
					} else {
						if (local246.aByte67 != 0 || local246.aByte64 != 0) {
							this.aBoolean440 = true;
						}
						local252 = local246.aByte66;
						local254 = local246.aByte62;
					}
				}
			}
			@Pc(394) boolean local394 = arg1.aByteArray96 != null && arg1.aByteArray96[local244] != 0 || local246 != null && local246.anInt6842 != 0;
			if ((local236 || local394) && arg1.aByteArray98 != null) {
				local248 += arg1.aByteArray98[local244] << 17;
			}
			if (local394) {
				local248 += 65536;
			}
			local248 += (local252 & 0xFF) << 8;
			local248 += local254 & 0xFF;
			local438 = local250 + ((local324 & 0xFFFF) << 16);
			@Pc(444) int local444 = local438 + (local238 & 0xFFFF);
			local227[local238] = (long) local444 + ((long) local248 << 32);
			this.aBoolean440 |= local246 != null && (local246.aByte67 != 0 || local246.aByte64 != 0);
			this.aBoolean439 |= local394;
		}
		Static420.method6584(local119, local227);
		this.aShortArray64 = arg1.aShortArray136;
		this.anInt6105 = arg1.anInt9920;
		this.anInt6101 = arg1.anInt9923;
		this.anIntArray358 = arg1.anIntArray576;
		this.anIntArray359 = arg1.anIntArray570;
		this.anIntArray357 = arg1.anIntArray573;
		this.aClass238Array3 = arg1.aClass238Array5;
		@Pc(517) Class310[] local517 = new Class310[this.anInt6101];
		this.aClass219Array3 = arg1.aClass219Array5;
		@Pc(541) int local541;
		@Pc(555) int local555;
		@Pc(597) int local597;
		if (arg1.aClass156Array1 != null) {
			this.anInt6152 = arg1.aClass156Array1.length;
			this.aClass122Array1 = new Class122[this.anInt6152];
			this.lb = new Class39[this.anInt6152];
			for (local541 = 0; local541 < this.anInt6152; local541++) {
				@Pc(548) Class156 local548 = arg1.aClass156Array1[local541];
				@Pc(553) Class101 local553 = Static635.method8514(local548.anInt5528);
				local555 = -1;
				for (@Pc(557) int local557 = 0; local557 < this.anInt6136; local557++) {
					if (local548.anInt5531 == local119[local557]) {
						local555 = local557;
						break;
					}
				}
				if (local555 == -1) {
					throw new RuntimeException();
				}
				local597 = Static77.anIntArray92[arg1.aShortArray132[local548.anInt5531] & 0xFFFF] & 0xFFFFFF;
				@Pc(614) int local614 = local597 | 255 - (arg1.aByteArray96 == null ? 0 : arg1.aByteArray96[local548.anInt5531]) << 24;
				this.lb[local541] = new Class39(local555, arg1.aShortArray131[local548.anInt5531], arg1.aShortArray128[local548.anInt5531], arg1.aShortArray134[local548.anInt5531], local553.anInt3711, local553.anInt3715, local553.anInt3716, local553.anInt3718, local553.anInt3717, local553.aBoolean274, local553.aBoolean275, local548.anInt5527);
				this.aClass122Array1[local541] = new Class122(local614);
			}
		}
		local541 = this.anInt6136 * 3;
		this.aByteArray44 = new byte[local541];
		if (arg1.aShortArray133 != null) {
			this.aShortArray62 = new short[this.anInt6136];
		}
		this.aShort63 = (short) arg4;
		this.aShort68 = (short) arg3;
		this.aShortArray65 = new short[this.anInt6136];
		this.aShortArray70 = new short[this.anInt6136];
		this.aShortArray71 = new short[this.anInt6136];
		Static439.aLongArray11 = new long[local541];
		this.aShortArray68 = new short[local541];
		this.aShortArray63 = new short[local541];
		this.aShortArray67 = new short[this.anInt6136];
		this.aShortArray69 = new short[this.anInt6136];
		this.aShortArray66 = new short[local541];
		this.aFloatArray56 = new float[local541];
		this.aShortArray61 = new short[local541];
		this.aFloatArray57 = new float[local541];
		this.aByteArray45 = new byte[this.anInt6136];
		local248 = 0;
		for (local438 = 0; local438 < arg1.anInt9923; local438++) {
			local555 = this.anIntArray355[local438];
			this.anIntArray355[local438] = local248;
			local517[local438] = new Class310();
			local248 += local555;
		}
		this.anIntArray355[arg1.anInt9923] = local248;
		@Pc(796) Class114 local796 = Static346.method5514(arg1, local119, this.anInt6136);
		@Pc(800) Class332[] local800 = new Class332[arg1.anInt9930];
		@Pc(841) int local841;
		@Pc(851) int local851;
		@Pc(872) int local872;
		@Pc(883) int local883;
		@Pc(892) int local892;
		@Pc(901) int local901;
		@Pc(819) short local819;
		@Pc(830) int local830;
		for (local597 = 0; local597 < arg1.anInt9930; local597++) {
			@Pc(809) short local809 = arg1.aShortArray131[local597];
			@Pc(814) short local814 = arg1.aShortArray128[local597];
			local819 = arg1.aShortArray134[local597];
			local830 = this.anIntArray358[local814] - this.anIntArray358[local809];
			local841 = this.anIntArray359[local814] - this.anIntArray359[local809];
			local851 = this.anIntArray357[local814] - this.anIntArray357[local809];
			@Pc(862) int local862 = this.anIntArray358[local819] - this.anIntArray358[local809];
			local872 = this.anIntArray359[local819] - this.anIntArray359[local809];
			local883 = this.anIntArray357[local819] - this.anIntArray357[local809];
			local892 = local883 * local841 - local872 * local851;
			local901 = local851 * local862 - local883 * local830;
			@Pc(910) int local910 = local830 * local872 - local862 * local841;
			while (local892 > 8192 || local901 > 8192 || local910 > 8192 || local892 < -8192 || local901 < -8192 || local910 < -8192) {
				local901 >>= 0x1;
				local910 >>= 0x1;
				local892 >>= 0x1;
			}
			@Pc(963) int local963 = (int) Math.sqrt((double) (local910 * local910 + local901 * local901 + local892 * local892));
			if (local963 <= 0) {
				local963 = 1;
			}
			local892 = local892 * 256 / local963;
			local910 = local910 * 256 / local963;
			local901 = local901 * 256 / local963;
			@Pc(998) byte local998 = arg1.aByteArray100 == null ? 0 : arg1.aByteArray100[local597];
			if (local998 == 0) {
				@Pc(1004) Class310 local1004 = local517[local809];
				local1004.anInt9057 += local910;
				local1004.anInt9055 += local901;
				local1004.anInt9052 += local892;
				local1004.anInt9053++;
				@Pc(1032) Class310 local1032 = local517[local814];
				local1032.anInt9052 += local892;
				local1032.anInt9057 += local910;
				local1032.anInt9055 += local901;
				local1032.anInt9053++;
				@Pc(1060) Class310 local1060 = local517[local819];
				local1060.anInt9057 += local910;
				local1060.anInt9055 += local901;
				local1060.anInt9053++;
				local1060.anInt9052 += local892;
			} else if (local998 == 1) {
				@Pc(1099) Class332 local1099 = local800[local597] = new Class332();
				local1099.anInt9673 = local910;
				local1099.anInt9672 = local901;
				local1099.anInt9671 = local892;
			}
		}
		@Pc(1125) int local1125;
		@Pc(1168) short local1168;
		for (local261 = 0; local261 < this.anInt6136; local261++) {
			local1125 = local119[local261];
			@Pc(1132) int local1132 = arg1.aShortArray132[local1125] & 0xFFFF;
			if (arg1.aByteArray95 == null) {
				local830 = -1;
			} else {
				local830 = arg1.aByteArray95[local1125];
			}
			if (arg1.aByteArray96 == null) {
				local841 = 0;
			} else {
				local841 = arg1.aByteArray96[local1125] & 0xFF;
			}
			local1168 = arg1.aShortArray135 == null ? -1 : arg1.aShortArray135[local1125];
			if (local1168 != -1 && (this.anInt6106 & 0x40) != 0) {
				@Pc(1186) Class218 local1186 = local108.method4027(local1168 & 0xFFFF);
				if (local1186.aBoolean471) {
					local1168 = -1;
				}
			}
			@Pc(1193) float local1193 = 0.0F;
			@Pc(1195) float local1195 = 0.0F;
			@Pc(1197) float local1197 = 0.0F;
			@Pc(1199) float local1199 = 0.0F;
			@Pc(1201) float local1201 = 0.0F;
			@Pc(1203) float local1203 = 0.0F;
			@Pc(1205) byte local1205 = 0;
			@Pc(1207) byte local1207 = 0;
			@Pc(1209) int local1209 = 0;
			@Pc(1242) byte local1242;
			@Pc(1259) short local1259;
			@Pc(2052) short local2052;
			@Pc(2057) short local2057;
			if (local1168 != -1) {
				if (local830 == -1) {
					local1205 = 1;
					local1195 = 1.0F;
					local1199 = 1.0F;
					local1207 = 2;
					local1193 = 0.0F;
					local1197 = 1.0F;
					local1203 = 0.0F;
					local1201 = 0.0F;
				} else {
					local830 &= 0xFF;
					local1242 = arg1.aByteArray101[local830];
					@Pc(1249) short local1249;
					@Pc(1254) short local1254;
					@Pc(1292) float local1292;
					@Pc(1303) float local1303;
					@Pc(1397) float local1397;
					@Pc(1843) float local1843;
					@Pc(1851) float local1851;
					@Pc(1859) float local1859;
					@Pc(1882) float local1882;
					@Pc(1905) float local1905;
					@Pc(1928) float local1928;
					if (local1242 == 0) {
						local1249 = arg1.aShortArray131[local1125];
						local1254 = arg1.aShortArray128[local1125];
						local1259 = arg1.aShortArray134[local1125];
						local2052 = arg1.aShortArray127[local830];
						local2057 = arg1.aShortArray129[local830];
						@Pc(2062) short local2062 = arg1.aShortArray130[local830];
						@Pc(2068) float local2068 = (float) arg1.anIntArray576[local2052];
						@Pc(2074) float local2074 = (float) arg1.anIntArray570[local2052];
						local1292 = arg1.anIntArray573[local2052];
						local1303 = (float) arg1.anIntArray576[local2057] - local2068;
						local1397 = (float) arg1.anIntArray570[local2057] - local2074;
						@Pc(2106) float local2106 = (float) arg1.anIntArray573[local2057] - local1292;
						@Pc(2115) float local2115 = (float) arg1.anIntArray576[local2062] - local2068;
						@Pc(2124) float local2124 = (float) arg1.anIntArray570[local2062] - local2074;
						@Pc(2132) float local2132 = (float) arg1.anIntArray573[local2062] - local1292;
						@Pc(2141) float local2141 = (float) arg1.anIntArray576[local1249] - local2068;
						@Pc(2149) float local2149 = (float) arg1.anIntArray570[local1249] - local2074;
						@Pc(2158) float local2158 = (float) arg1.anIntArray573[local1249] - local1292;
						@Pc(2166) float local2166 = (float) arg1.anIntArray576[local1254] - local2068;
						@Pc(2175) float local2175 = (float) arg1.anIntArray570[local1254] - local2074;
						local1843 = (float) arg1.anIntArray573[local1254] - local1292;
						local1851 = (float) arg1.anIntArray576[local1259] - local2068;
						local1859 = (float) arg1.anIntArray570[local1259] - local2074;
						local1882 = (float) arg1.anIntArray573[local1259] - local1292;
						local1905 = local2132 * local1397 - local2106 * local2124;
						local1928 = local2106 * local2115 - local2132 * local1303;
						@Pc(2236) float local2236 = local1303 * local2124 - local1397 * local2115;
						@Pc(2244) float local2244 = local2236 * local2124 - local2132 * local1928;
						@Pc(2253) float local2253 = local1905 * local2132 - local2115 * local2236;
						@Pc(2262) float local2262 = local2115 * local1928 - local2124 * local1905;
						@Pc(2276) float local2276 = 1.0F / (local2106 * local2262 + local1397 * local2253 + local2244 * local1303);
						local1201 = (local1851 * local2244 + local2253 * local1859 + local1882 * local2262) * local2276;
						local1193 = local2276 * (local2141 * local2244 + local2149 * local2253 + local2262 * local2158);
						local1197 = local2276 * (local2244 * local2166 + local2253 * local2175 + local2262 * local1843);
						@Pc(2327) float local2327 = local1928 * local1303 - local1397 * local1905;
						@Pc(2336) float local2336 = local2236 * local1397 - local1928 * local2106;
						@Pc(2345) float local2345 = local2106 * local1905 - local2236 * local1303;
						@Pc(2359) float local2359 = 1.0F / (local2132 * local2327 + local2345 * local2124 + local2336 * local2115);
						local1203 = local2359 * (local1851 * local2336 + local2345 * local1859 + local1882 * local2327);
						local1199 = local2359 * (local1843 * local2327 + local2166 * local2336 + local2175 * local2345);
						local1195 = (local2336 * local2141 + local2345 * local2149 + local2158 * local2327) * local2359;
					} else {
						local1249 = arg1.aShortArray131[local1125];
						local1254 = arg1.aShortArray128[local1125];
						local1259 = arg1.aShortArray134[local1125];
						@Pc(1264) int local1264 = local796.anIntArray224[local830];
						@Pc(1269) int local1269 = local796.anIntArray227[local830];
						@Pc(1274) int local1274 = local796.anIntArray226[local830];
						@Pc(1279) float[] local1279 = local796.aFloatArrayArray10[local830];
						@Pc(1284) byte local1284 = arg1.aByteArray97[local830];
						local1292 = (float) arg1.anIntArray568[local830] / 256.0F;
						if (local1242 == 1) {
							local1303 = (float) arg1.anIntArray577[local830] / 1024.0F;
							Static635.method8513(local1269, local1303, local1264, arg1.anIntArray570[local1249], arg1.anIntArray576[local1249], local1292, local1274, Static196.aFloatArray42, local1279, arg1.anIntArray573[local1249], local1284);
							local1195 = Static196.aFloatArray42[1];
							local1193 = Static196.aFloatArray42[0];
							Static635.method8513(local1269, local1303, local1264, arg1.anIntArray570[local1254], arg1.anIntArray576[local1254], local1292, local1274, Static196.aFloatArray42, local1279, arg1.anIntArray573[local1254], local1284);
							local1197 = Static196.aFloatArray42[0];
							local1199 = Static196.aFloatArray42[1];
							Static635.method8513(local1269, local1303, local1264, arg1.anIntArray570[local1259], arg1.anIntArray576[local1259], local1292, local1274, Static196.aFloatArray42, local1279, arg1.anIntArray573[local1259], local1284);
							local1203 = Static196.aFloatArray42[1];
							local1201 = Static196.aFloatArray42[0];
							local1397 = local1303 / 2.0F;
							if ((local1284 & 0x1) == 0) {
								if (local1197 - local1193 > local1397) {
									local1197 -= local1303;
									local1205 = 1;
								} else if (local1397 < local1193 - local1197) {
									local1205 = 2;
									local1197 += local1303;
								}
								if (local1201 - local1193 > local1397) {
									local1207 = 1;
									local1201 -= local1303;
								} else if (local1397 < local1193 - local1201) {
									local1207 = 2;
									local1201 += local1303;
								}
							} else {
								if (local1397 < local1199 - local1195) {
									local1205 = 1;
									local1199 -= local1303;
								} else if (local1195 - local1199 > local1397) {
									local1205 = 2;
									local1199 += local1303;
								}
								if (local1203 - local1195 > local1397) {
									local1203 -= local1303;
									local1207 = 1;
								} else if (local1397 < local1195 - local1203) {
									local1203 += local1303;
									local1207 = 2;
								}
							}
						} else if (local1242 == 2) {
							local1303 = (float) arg1.anIntArray575[local830] / 256.0F;
							local1397 = (float) arg1.anIntArray571[local830] / 256.0F;
							@Pc(1756) int local1756 = arg1.anIntArray576[local1254] - arg1.anIntArray576[local1249];
							@Pc(1766) int local1766 = arg1.anIntArray570[local1254] - arg1.anIntArray570[local1249];
							@Pc(1777) int local1777 = arg1.anIntArray573[local1254] - arg1.anIntArray573[local1249];
							@Pc(1788) int local1788 = arg1.anIntArray576[local1259] - arg1.anIntArray576[local1249];
							@Pc(1798) int local1798 = arg1.anIntArray570[local1259] - arg1.anIntArray570[local1249];
							@Pc(1808) int local1808 = arg1.anIntArray573[local1259] - arg1.anIntArray573[local1249];
							@Pc(1817) int local1817 = local1808 * local1766 - local1798 * local1777;
							@Pc(1826) int local1826 = local1788 * local1777 - local1756 * local1808;
							@Pc(1835) int local1835 = local1798 * local1756 - local1788 * local1766;
							local1843 = 64.0F / (float) arg1.anIntArray574[local830];
							local1851 = 64.0F / (float) arg1.anIntArray572[local830];
							local1859 = 64.0F / (float) arg1.anIntArray577[local830];
							local1882 = (local1279[2] * (float) local1835 + (float) local1826 * local1279[1] + (float) local1817 * local1279[0]) / local1843;
							local1905 = ((float) local1835 * local1279[5] + local1279[3] * (float) local1817 + (float) local1826 * local1279[4]) / local1851;
							local1928 = ((float) local1835 * local1279[8] + (float) local1817 * local1279[6] + (float) local1826 * local1279[7]) / local1859;
							local1209 = Static378.method5985(local1905, local1882, local1928);
							Static479.method7073(local1397, arg1.anIntArray573[local1249], local1303, Static196.aFloatArray42, local1264, arg1.anIntArray576[local1249], local1209, arg1.anIntArray570[local1249], local1284, local1274, local1292, local1269, local1279);
							local1193 = Static196.aFloatArray42[0];
							local1195 = Static196.aFloatArray42[1];
							Static479.method7073(local1397, arg1.anIntArray573[local1254], local1303, Static196.aFloatArray42, local1264, arg1.anIntArray576[local1254], local1209, arg1.anIntArray570[local1254], local1284, local1274, local1292, local1269, local1279);
							local1199 = Static196.aFloatArray42[1];
							local1197 = Static196.aFloatArray42[0];
							Static479.method7073(local1397, arg1.anIntArray573[local1259], local1303, Static196.aFloatArray42, local1264, arg1.anIntArray576[local1259], local1209, arg1.anIntArray570[local1259], local1284, local1274, local1292, local1269, local1279);
							local1201 = Static196.aFloatArray42[0];
							local1203 = Static196.aFloatArray42[1];
						} else if (local1242 == 3) {
							Static558.method7824(arg1.anIntArray576[local1249], local1284, local1269, local1279, arg1.anIntArray570[local1249], Static196.aFloatArray42, local1292, local1274, local1264, arg1.anIntArray573[local1249]);
							local1193 = Static196.aFloatArray42[0];
							local1195 = Static196.aFloatArray42[1];
							Static558.method7824(arg1.anIntArray576[local1254], local1284, local1269, local1279, arg1.anIntArray570[local1254], Static196.aFloatArray42, local1292, local1274, local1264, arg1.anIntArray573[local1254]);
							local1197 = Static196.aFloatArray42[0];
							local1199 = Static196.aFloatArray42[1];
							Static558.method7824(arg1.anIntArray576[local1259], local1284, local1269, local1279, arg1.anIntArray570[local1259], Static196.aFloatArray42, local1292, local1274, local1264, arg1.anIntArray573[local1259]);
							local1203 = Static196.aFloatArray42[1];
							local1201 = Static196.aFloatArray42[0];
							if ((local1284 & 0x1) == 0) {
								if (local1197 - local1193 > 0.5F) {
									local1197--;
									local1205 = 1;
								} else if (local1193 - local1197 > 0.5F) {
									local1197++;
									local1205 = 2;
								}
								if (local1201 - local1193 > 0.5F) {
									local1207 = 1;
									local1201--;
								} else if (local1193 - local1201 > 0.5F) {
									local1201++;
									local1207 = 2;
								}
							} else {
								if (local1203 - local1195 > 0.5F) {
									local1207 = 1;
									local1203--;
								} else if (local1195 - local1203 > 0.5F) {
									local1207 = 2;
									local1203++;
								}
								if (local1199 - local1195 > 0.5F) {
									local1199--;
									local1205 = 1;
								} else if (local1195 - local1199 > 0.5F) {
									local1199++;
									local1205 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray100 == null) {
				local1242 = 0;
			} else {
				local1242 = arg1.aByteArray100[local1125];
			}
			if (local1242 == 0) {
				@Pc(2563) long local2563 = (long) (local830 << 2) + ((long) local841 + (long) (local1209 << 24) + (long) (local1132 << 8) << 32);
				local1259 = arg1.aShortArray131[local1125];
				local2052 = arg1.aShortArray128[local1125];
				local2057 = arg1.aShortArray134[local1125];
				@Pc(2582) Class310 local2582 = local517[local1259];
				this.aShortArray69[local261] = this.method5023(local2582.anInt9052, local2582.anInt9053, local1195, local2582.anInt9057, local2563, local2582.anInt9055, local1259, local1193, arg1);
				@Pc(2606) Class310 local2606 = local517[local2052];
				this.aShortArray70[local261] = this.method5023(local2606.anInt9052, local2606.anInt9053, local1199, local2606.anInt9057, (long) local1205 + local2563, local2606.anInt9055, local2052, local1197, arg1);
				@Pc(2633) Class310 local2633 = local517[local2057];
				this.aShortArray65[local261] = this.method5023(local2633.anInt9052, local2633.anInt9053, local1203, local2633.anInt9057, (long) local1207 + local2563, local2633.anInt9055, local2057, local1201, arg1);
			} else if (local1242 == 1) {
				@Pc(2424) Class332 local2424 = local800[local1125];
				@Pc(2469) long local2469 = (long) ((local2424.anInt9672 + 256 << 12) + (local830 << 2) + (local2424.anInt9671 <= 0 ? 2048 : 1024) + (local2424.anInt9673 + 256 << 22)) + ((long) local841 + (long) (local1132 << 8) + (long) (local1209 << 24) << 32);
				this.aShortArray69[local261] = this.method5023(local2424.anInt9671, 0, local1195, local2424.anInt9673, local2469, local2424.anInt9672, arg1.aShortArray131[local1125], local1193, arg1);
				this.aShortArray70[local261] = this.method5023(local2424.anInt9671, 0, local1199, local2424.anInt9673, local2469 + (long) local1205, local2424.anInt9672, arg1.aShortArray128[local1125], local1197, arg1);
				this.aShortArray65[local261] = this.method5023(local2424.anInt9671, 0, local1203, local2424.anInt9673, local2469 + (long) local1207, local2424.anInt9672, arg1.aShortArray134[local1125], local1201, arg1);
			}
			if (arg1.aByteArray96 != null) {
				this.aByteArray45[local261] = arg1.aByteArray96[local1125];
			}
			if (arg1.aShortArray133 != null) {
				this.aShortArray62[local261] = arg1.aShortArray133[local1125];
			}
			this.aShortArray67[local261] = arg1.aShortArray132[local1125];
			this.aShortArray71[local261] = local1168;
		}
		local1125 = 0;
		local819 = -10000;
		for (local830 = 0; local830 < this.anInt6126; local830++) {
			@Pc(2713) short local2713 = this.aShortArray71[local830];
			if (local819 != local2713) {
				local819 = local2713;
				local1125++;
			}
		}
		this.anIntArray356 = new int[local1125 + 1];
		local819 = -10000;
		local1125 = 0;
		for (local841 = 0; local841 < this.anInt6126; local841++) {
			local1168 = this.aShortArray71[local841];
			if (local819 != local1168) {
				this.anIntArray356[local1125++] = local841;
				local819 = local1168;
			}
		}
		this.anIntArray356[local1125] = this.anInt6126;
		Static439.aLongArray11 = null;
		this.aShortArray61 = Static36.method1261(this.aShortArray61, this.anInt6100);
		this.aShortArray63 = Static36.method1261(this.aShortArray63, this.anInt6100);
		this.aShortArray68 = Static36.method1261(this.aShortArray68, this.anInt6100);
		this.aByteArray44 = Static38.method1273(this.anInt6100, this.aByteArray44);
		this.aFloatArray56 = Static336.method5428(this.anInt6100, this.aFloatArray56);
		this.aFloatArray57 = Static336.method5428(this.anInt6100, this.aFloatArray57);
		if (arg1.anIntArray567 != null && Static634.method7628(arg2, this.anInt6106)) {
			this.anIntArrayArray32 = arg1.method8047(false);
		}
		if (arg1.aClass156Array1 != null && Static51.method1425(this.anInt6106, arg2)) {
			this.anIntArrayArray33 = arg1.method8052();
		}
		if (arg1.anIntArray569 != null && Static360.method5659(this.anInt6106, arg2)) {
			local851 = 0;
			@Pc(2870) int[] local2870 = new int[256];
			for (local872 = 0; local872 < this.anInt6136; local872++) {
				local883 = arg1.anIntArray569[local119[local872]];
				if (local883 >= 0) {
					@Pc(2887) int local2887 = local2870[local883]++;
					if (local851 < local883) {
						local851 = local883;
					}
				}
			}
			this.anIntArrayArray34 = new int[local851 + 1][];
			for (local883 = 0; local883 <= local851; local883++) {
				this.anIntArrayArray34[local883] = new int[local2870[local883]];
				local2870[local883] = 0;
			}
			for (local892 = 0; local892 < this.anInt6136; local892++) {
				local901 = arg1.anIntArray569[local119[local892]];
				if (local901 >= 0) {
					this.anIntArrayArray34[local901][local2870[local901]++] = local892;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(IZ)V")
	private void method5019(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass268_8 != null && this.aClass268_8.anInterface9_6 == null;
		@Pc(27) boolean local27 = this.aClass268_7 != null && this.aClass268_7.anInterface9_6 == null;
		@Pc(38) boolean local38 = this.aClass268_9 != null && this.aClass268_9.anInterface9_6 == null;
		@Pc(49) boolean local49 = this.aClass268_10 != null && this.aClass268_10.anInterface9_6 == null;
		if (arg0) {
			local49 &= (this.aByte61 & 0x8) != 0;
			local16 &= (this.aByte61 & 0x2) != 0;
			local27 &= (this.aByte61 & 0x4) != 0;
			local38 &= (this.aByte61 & 0x1) != 0;
		}
		@Pc(109) byte local109 = 0;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (local38) {
			local109 = 12;
		}
		@Pc(126) byte local126 = 0;
		if (local16) {
			local113 = local109;
			local109 = (byte) (local109 + 4);
		}
		if (local27) {
			local115 = local109;
			local109 = (byte) (local109 + 12);
		}
		if (local49) {
			local126 = local109;
			local109 = (byte) (local109 + 8);
		}
		if (local109 == 0) {
			return;
		}
		if (local109 * this.anInt6100 > this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2.aByteArray107.length) {
			this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2 = new Class8_Sub8_Sub1(local109 * (this.anInt6100 + 100));
		} else {
			this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2.anInt10588 = 0;
		}
		@Pc(200) Class8_Sub8_Sub1 local200 = this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2;
		@Pc(208) int local208;
		@Pc(217) int local217;
		@Pc(245) int local245;
		@Pc(254) int local254;
		if (local38) {
			@Pc(224) int local224;
			@Pc(231) int local231;
			@Pc(236) int local236;
			@Pc(243) int local243;
			if (this.aClass16_Sub3_26.aBoolean519) {
				for (local208 = 0; local208 < this.anInt6101; local208++) {
					local217 = Stream.floatToRawIntBits((float) this.anIntArray358[local208]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray359[local208]);
					local231 = Stream.floatToRawIntBits((float) this.anIntArray357[local208]);
					local236 = this.anIntArray355[local208];
					local243 = this.anIntArray355[local208 + 1];
					for (local245 = local236; local245 < local243; local245++) {
						local254 = this.aShortArray66[local245] - 1;
						if (local254 == -1) {
							break;
						}
						local200.anInt10588 = local254 * local109;
						local200.method8523(local217);
						local200.method8523(local224);
						local200.method8523(local231);
					}
				}
			} else {
				for (local208 = 0; local208 < this.anInt6101; local208++) {
					local217 = Stream.floatToRawIntBits((float) this.anIntArray358[local208]);
					local224 = Stream.floatToRawIntBits((float) this.anIntArray359[local208]);
					local231 = Stream.floatToRawIntBits((float) this.anIntArray357[local208]);
					local236 = this.anIntArray355[local208];
					local243 = this.anIntArray355[local208 + 1];
					for (local245 = local236; local245 < local243; local245++) {
						local254 = this.aShortArray66[local245] - 1;
						if (local254 == -1) {
							break;
						}
						local200.anInt10588 = local254 * local109;
						local200.method8566(local217);
						local200.method8566(local224);
						local200.method8566(local231);
					}
				}
			}
		}
		@Pc(576) float local576;
		@Pc(461) short[] local461;
		@Pc(467) short[] local467;
		@Pc(458) short[] local458;
		@Pc(464) byte[] local464;
		@Pc(618) float local618;
		if (local16) {
			if (this.aClass268_7 == null) {
				if (this.aClass9_1 == null) {
					local458 = this.aShortArray68;
					local461 = this.aShortArray63;
					local464 = this.aByteArray44;
					local467 = this.aShortArray61;
				} else {
					local461 = this.aClass9_1.aShortArray1;
					local458 = this.aClass9_1.aShortArray3;
					local464 = this.aClass9_1.aByteArray2;
					local467 = this.aClass9_1.aShortArray2;
				}
				@Pc(491) float local491 = this.aClass16_Sub3_26.aFloatArray64[0];
				@Pc(497) float local497 = this.aClass16_Sub3_26.aFloatArray64[1];
				@Pc(503) float local503 = this.aClass16_Sub3_26.aFloatArray64[2];
				@Pc(507) float local507 = this.aClass16_Sub3_26.aFloat169;
				@Pc(517) float local517 = this.aClass16_Sub3_26.aFloat163 * 768.0F / (float) this.aShort63;
				@Pc(527) float local527 = this.aClass16_Sub3_26.aFloat165 * 768.0F / (float) this.aShort63;
				for (@Pc(529) int local529 = 0; local529 < this.anInt6136; local529++) {
					@Pc(549) int local549 = this.method5024(this.aShortArray67[local529], this.aShortArray71[local529], this.aShort68, this.aByteArray45[local529]);
					@Pc(560) float local560 = (float) (local549 >> 8 & 0xFF) * this.aClass16_Sub3_26.aFloat153;
					@Pc(565) short local565 = this.aShortArray69[local529];
					local576 = this.aClass16_Sub3_26.aFloat167 * (float) (local549 >> 16 & 0xFF);
					@Pc(585) float local585 = (float) (local549 >>> 24) * this.aClass16_Sub3_26.aFloat150;
					@Pc(590) short local590 = (short) local464[local565];
					if (local590 == 0) {
						local618 = (local491 * (float) local467[local565] + local497 * (float) local461[local565] + local503 * (float) local458[local565]) * 0.0026041667F;
					} else {
						local618 = ((float) local458[local565] * local503 + (float) local467[local565] * local491 + (float) local461[local565] * local497) / (float) (local590 * 256);
					}
					@Pc(658) float local658 = local507 + (local618 < 0.0F ? local527 : local517) * local618;
					@Pc(663) int local663 = (int) (local658 * local585);
					@Pc(668) int local668 = (int) (local576 * local658);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					if (local668 < 0) {
						local668 = 0;
					} else if (local668 > 255) {
						local668 = 255;
					}
					@Pc(698) int local698 = (int) (local658 * local560);
					if (local698 < 0) {
						local698 = 0;
					} else if (local698 > 255) {
						local698 = 255;
					}
					local200.anInt10588 = local565 * local109 + local113;
					local200.method8562(local663);
					local200.method8562(local668);
					local200.method8562(local698);
					local200.method8562(255 - (this.aByteArray45[local529] & 0xFF));
					local565 = this.aShortArray70[local529];
					local590 = local464[local565];
					if (local590 == 0) {
						local618 = (local503 * (float) local458[local565] + local491 * (float) local467[local565] + (float) local461[local565] * local497) * 0.0026041667F;
					} else {
						local618 = ((float) local458[local565] * local503 + (float) local467[local565] * local491 + (float) local461[local565] * local497) / (float) (local590 * 256);
					}
					local658 = (local618 < 0.0F ? local527 : local517) * local618 + local507;
					local663 = (int) (local658 * local585);
					local668 = (int) (local658 * local576);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					local698 = (int) (local658 * local560);
					if (local668 < 0) {
						local668 = 0;
					} else if (local668 > 255) {
						local668 = 255;
					}
					if (local698 < 0) {
						local698 = 0;
					} else if (local698 > 255) {
						local698 = 255;
					}
					local200.anInt10588 = local113 + local565 * local109;
					local200.method8562(local663);
					local200.method8562(local668);
					local200.method8562(local698);
					local200.method8562(255 - (this.aByteArray45[local529] & 0xFF));
					local565 = this.aShortArray65[local529];
					local590 = local464[local565];
					if (local590 == 0) {
						local618 = ((float) local461[local565] * local497 + (float) local467[local565] * local491 + (float) local458[local565] * local503) * 0.0026041667F;
					} else {
						local618 = (local491 * (float) local467[local565] + local497 * (float) local461[local565] + local503 * (float) local458[local565]) / (float) (local590 * 256);
					}
					local658 = (local618 < 0.0F ? local527 : local517) * local618 + local507;
					local663 = (int) (local658 * local585);
					if (local663 < 0) {
						local663 = 0;
					} else if (local663 > 255) {
						local663 = 255;
					}
					local668 = (int) (local658 * local576);
					if (local668 < 0) {
						local668 = 0;
					} else if (local668 > 255) {
						local668 = 255;
					}
					local698 = (int) (local658 * local560);
					local200.anInt10588 = local113 + local565 * local109;
					if (local698 < 0) {
						local698 = 0;
					} else if (local698 > 255) {
						local698 = 255;
					}
					local200.method8562(local663);
					local200.method8562(local668);
					local200.method8562(local698);
					local200.method8562(255 - (this.aByteArray45[local529] & 0xFF));
				}
			} else {
				for (local208 = 0; local208 < this.anInt6136; local208++) {
					local217 = this.method5024(this.aShortArray67[local208], this.aShortArray71[local208], this.aShort68, this.aByteArray45[local208]);
					local200.anInt10588 = this.aShortArray69[local208] * local109 + local113;
					local200.method8523(local217);
					local200.anInt10588 = local109 * this.aShortArray70[local208] + local113;
					local200.method8523(local217);
					local200.anInt10588 = local113 + local109 * this.aShortArray65[local208];
					local200.method8523(local217);
				}
			}
		}
		if (local27) {
			if (this.aClass9_1 == null) {
				local458 = this.aShortArray68;
				local461 = this.aShortArray63;
				local467 = this.aShortArray61;
				local464 = this.aByteArray44;
			} else {
				local458 = this.aClass9_1.aShortArray3;
				local461 = this.aClass9_1.aShortArray1;
				local464 = this.aClass9_1.aByteArray2;
				local467 = this.aClass9_1.aShortArray2;
			}
			@Pc(1122) float local1122 = 3.0F / (float) this.aShort63;
			local618 = 3.0F / (float) (this.aShort63 / 2 + this.aShort63);
			local200.anInt10588 = local115;
			if (this.aClass16_Sub3_26.aBoolean519) {
				for (local245 = 0; local245 < this.anInt6100; local245++) {
					local254 = local464[local245] & 0xFF;
					if (local254 == 0) {
						local200.method1576((float) local467[local245] * local618);
						local200.method1576(local618 * (float) local461[local245]);
						local200.method1576((float) local458[local245] * local618);
					} else {
						local576 = local1122 / (float) local254;
						local200.method1576(local576 * (float) local467[local245]);
						local200.method1576((float) local461[local245] * local576);
						local200.method1576((float) local458[local245] * local576);
					}
					local200.anInt10588 += local109 - 12;
				}
			} else {
				for (local245 = 0; local245 < this.anInt6100; local245++) {
					local254 = local464[local245] & 0xFF;
					if (local254 == 0) {
						local200.method1578(local618 * (float) local467[local245]);
						local200.method1578((float) local461[local245] * local618);
						local200.method1578((float) local458[local245] * local618);
					} else {
						local576 = local1122 / (float) local254;
						local200.method1578(local576 * (float) local467[local245]);
						local200.method1578(local576 * (float) local461[local245]);
						local200.method1578(local576 * (float) local458[local245]);
					}
					local200.anInt10588 += local109 - 12;
				}
			}
		}
		if (local49) {
			local200.anInt10588 = local126;
			if (this.aClass16_Sub3_26.aBoolean519) {
				for (local208 = 0; local208 < this.anInt6100; local208++) {
					local200.method1576(this.aFloatArray56[local208]);
					local200.method1576(this.aFloatArray57[local208]);
					local200.anInt10588 += local109 - 8;
				}
			} else {
				for (local208 = 0; local208 < this.anInt6100; local208++) {
					local200.method1578(this.aFloatArray56[local208]);
					local200.method1578(this.aFloatArray57[local208]);
					local200.anInt10588 += local109 - 8;
				}
			}
		}
		local200.anInt10588 = local109 * this.anInt6100;
		@Pc(1427) Interface9 local1427;
		if (arg0) {
			if (this.anInterface9_3 == null) {
				this.anInterface9_3 = this.aClass16_Sub3_26.method5997(local200.aByteArray107, true, local200.anInt10588, local109);
			} else {
				this.anInterface9_3.method6286(local109, local200.aByteArray107, local200.anInt10588);
			}
			this.aByte61 = 0;
			local1427 = this.anInterface9_3;
		} else {
			local1427 = this.aClass16_Sub3_26.method5997(local200.aByteArray107, false, local200.anInt10588, local109);
			this.aBoolean438 = true;
		}
		if (local38) {
			this.aClass268_9.anInterface9_6 = local1427;
			this.aClass268_9.aByte88 = 0;
		}
		if (local49) {
			this.aClass268_10.anInterface9_6 = local1427;
			this.aClass268_10.aByte88 = local126;
		}
		if (local16) {
			this.aClass268_8.aByte88 = local113;
			this.aClass268_8.anInterface9_6 = local1427;
		}
		if (local27) {
			this.aClass268_7.aByte88 = local115;
			this.aClass268_7.anInterface9_6 = local1427;
		}
	}

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean440;
	}

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class86 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean437) {
			this.method5021();
		}
		@Pc(16) int local16 = this.aShort67 + arg4;
		@Pc(21) int local21 = this.aShort66 + arg4;
		@Pc(26) int local26 = this.aShort65 + arg6;
		@Pc(31) int local31 = this.aShort70 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9958 >> arg2.anInt9954 >= arg2.anInt9955 || local26 < 0 || arg2.anInt9953 <= arg2.anInt9958 + local31 >> arg2.anInt9954)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9958 + local21 >> arg3.anInt9954 >= arg3.anInt9955 || local26 < 0 || arg3.anInt9958 + local31 >> arg3.anInt9954 >= arg3.anInt9953) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9954;
			local21 = local21 + arg2.anInt9958 - 1 >> arg2.anInt9954;
			local26 >>= arg2.anInt9954;
			local31 = local31 + arg2.anInt9958 - 1 >> arg2.anInt9954;
			if (arg5 == arg2.method8086(local26, local16) && arg5 == arg2.method8086(local26, local21) && arg5 == arg2.method8086(local31, local16) && arg2.method8086(local31, local21) == arg5) {
				return;
			}
		}
		@Pc(193) int local193;
		if (arg0 == 1) {
			for (local193 = 0; local193 < this.anInt6101; local193++) {
				this.anIntArray359[local193] = this.anIntArray359[local193] + arg2.method8088(arg6 + this.anIntArray357[local193], this.anIntArray358[local193] + arg4) - arg5;
			}
		} else {
			@Pc(244) int local244;
			@Pc(255) int local255;
			if (arg0 == 2) {
				@Pc(239) short local239 = this.aShort72;
				if (local239 == 0) {
					return;
				}
				for (local244 = 0; local244 < this.anInt6101; local244++) {
					local255 = (this.anIntArray359[local244] << 16) / local239;
					if (local255 < arg1) {
						this.anIntArray359[local244] -= -((arg2.method8088(this.anIntArray357[local244] + arg6, arg4 + this.anIntArray358[local244]) - arg5) * (-local255 + arg1) / arg1);
					}
				}
			} else {
				@Pc(338) int local338;
				if (arg0 == 3) {
					local193 = (arg1 & 0xFF) * 4;
					local244 = (arg1 >> 8 & 0xFF) * 4;
					local255 = (arg1 >> 16 & 0xFF) << 6;
					local338 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local193 >> 1) < 0 || arg2.anInt9955 << arg2.anInt9954 <= arg2.anInt9958 + (local193 >> 1) + arg4 || arg6 - (local244 >> 1) < 0 || arg2.anInt9953 << arg2.anInt9954 <= arg6 + (local244 >> 1) + arg2.anInt9958) {
						return;
					}
					this.method8001(arg4, arg6, local338, arg2, local193, local244, local255, arg5);
				} else if (arg0 == 4) {
					local193 = this.aShort64 - this.aShort72;
					for (local244 = 0; local244 < this.anInt6101; local244++) {
						this.anIntArray359[local244] = local193 + this.anIntArray359[local244] + arg3.method8088(this.anIntArray357[local244] - -arg6, arg4 + this.anIntArray358[local244]) - arg5;
					}
				} else if (arg0 == 5) {
					local193 = this.aShort64 - this.aShort72;
					for (local244 = 0; local244 < this.anInt6101; local244++) {
						local255 = arg4 + this.anIntArray358[local244];
						local338 = arg6 + this.anIntArray357[local244];
						@Pc(439) int local439 = arg2.method8088(local338, local255);
						@Pc(445) int local445 = arg3.method8088(local338, local255);
						@Pc(452) int local452 = local439 - arg1 - local445;
						this.anIntArray359[local244] = local439 + (local452 * ((this.anIntArray359[local244] << 8) / local193) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	private void method5020() {
		if (!this.aBoolean438) {
			return;
		}
		this.aBoolean438 = false;
		if (this.aClass219Array3 == null && this.aClass238Array3 == null && this.lb == null) {
			if (this.anIntArray358 != null && !Static516.method7401(this.anInt6122, this.anInt6106)) {
				if (this.aClass268_9 != null && this.aClass268_9.anInterface9_6 == null) {
					this.aBoolean438 = true;
				} else {
					if (!this.aBoolean437) {
						this.method5021();
					}
					this.anIntArray358 = null;
				}
			}
			if (this.anIntArray359 != null && !Static496.method7231(this.anInt6106, this.anInt6122)) {
				if (this.aClass268_9 != null && this.aClass268_9.anInterface9_6 == null) {
					this.aBoolean438 = true;
				} else {
					if (!this.aBoolean437) {
						this.method5021();
					}
					this.anIntArray359 = null;
				}
			}
			if (this.anIntArray357 != null && !Static562.method7836(this.anInt6122, this.anInt6106)) {
				if (this.aClass268_9 != null && this.aClass268_9.anInterface9_6 == null) {
					this.aBoolean438 = true;
				} else {
					if (!this.aBoolean437) {
						this.method5021();
					}
					this.anIntArray357 = null;
				}
			}
		}
		if (this.aShortArray66 != null && this.anIntArray358 == null && this.anIntArray359 == null && this.anIntArray357 == null) {
			this.anIntArray355 = null;
			this.aShortArray66 = null;
		}
		if (this.aByteArray44 != null && !Static593.method8192(this.anInt6122, this.anInt6106)) {
			if (this.aClass268_7 == null) {
				if (this.aClass268_8 != null && this.aClass268_8.anInterface9_6 == null) {
					this.aBoolean438 = true;
				} else {
					this.aByteArray44 = null;
					this.aShortArray61 = this.aShortArray63 = this.aShortArray68 = null;
				}
			} else if (this.aClass268_7.anInterface9_6 == null) {
				this.aBoolean438 = true;
			} else {
				this.aByteArray44 = null;
				this.aShortArray61 = this.aShortArray63 = this.aShortArray68 = null;
			}
		}
		if (this.aShortArray67 != null && !Static612.method8346(this.anInt6122, this.anInt6106)) {
			if (this.aClass268_8 != null && this.aClass268_8.anInterface9_6 == null) {
				this.aBoolean438 = true;
			} else {
				this.aShortArray67 = null;
			}
		}
		if (this.aByteArray45 != null && !Static443.method6813(this.anInt6122, this.anInt6106)) {
			if (this.aClass268_8 != null && this.aClass268_8.anInterface9_6 == null) {
				this.aBoolean438 = true;
			} else {
				this.aByteArray45 = null;
			}
		}
		if (this.aFloatArray56 != null && !Static251.method7786(this.anInt6106, this.anInt6122)) {
			if (this.aClass268_10 != null && this.aClass268_10.anInterface9_6 == null) {
				this.aBoolean438 = true;
			} else {
				this.aFloatArray56 = this.aFloatArray57 = null;
			}
		}
		if (this.aShortArray71 != null && !Static614.method5484(this.anInt6106, this.anInt6122)) {
			if (this.aClass268_8 != null && this.aClass268_8.anInterface9_6 == null) {
				this.aBoolean438 = true;
			} else {
				this.aShortArray71 = null;
			}
		}
		if (this.aShortArray69 != null && !Static317.method7576(this.anInt6106, this.anInt6122)) {
			if ((this.aClass320_1 == null || this.aClass320_1.anInterface23_5 != null) && (this.aClass268_8 == null || this.aClass268_8.anInterface9_6 != null)) {
				this.aShortArray69 = this.aShortArray70 = this.aShortArray65 = null;
			} else {
				this.aBoolean438 = true;
			}
		}
		if (this.anIntArrayArray34 != null && !Static360.method5659(this.anInt6106, this.anInt6122)) {
			this.anIntArrayArray34 = null;
			this.aShortArray62 = null;
		}
		if (this.anIntArrayArray32 != null && !Static634.method7628(this.anInt6122, this.anInt6106)) {
			this.aShortArray64 = null;
			this.anIntArrayArray32 = null;
		}
		if (this.anIntArrayArray33 != null && !Static51.method1425(this.anInt6106, this.anInt6122)) {
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArray356 != null && (this.anInt6122 & 0x800) == 0 && (this.anInt6122 & 0x40000) == 0) {
			this.anIntArray356 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
		}
		this.aShort63 = (short) arg0;
		if (this.aClass268_7 != null) {
			this.aClass268_7.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort68;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6101; local15++) {
			@Pc(33) int local33 = this.anIntArray358[local15] * local13 + local9 * this.anIntArray357[local15] >> 14;
			this.anIntArray357[local15] = local13 * this.anIntArray357[local15] - this.anIntArray358[local15] * local9 >> 14;
			this.anIntArray358[local15] = local33;
		}
		this.aBoolean437 = false;
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6122;
	}

	@OriginalMember(owner = "client!lea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt6122 = arg0;
		this.aBoolean438 = true;
		if (this.aClass9_1 != null && (this.anInt6122 & 0x10000) == 0) {
			this.aShortArray68 = this.aClass9_1.aShortArray3;
			this.aShortArray61 = this.aClass9_1.aShortArray2;
			this.aShortArray63 = this.aClass9_1.aShortArray1;
			this.aByteArray44 = this.aClass9_1.aByteArray2;
			this.aClass9_1 = null;
		}
		this.method5020();
	}

	@OriginalMember(owner = "client!lea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!lea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
		}
		this.aShort68 = (short) arg0;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dfa;Lclient!im;I)V")
	@Override
	public void method8003(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6100 == 0) {
			return;
		}
		@Pc(13) Class54_Sub2 local13 = this.aClass16_Sub3_26.aClass54_Sub2_3;
		if (!this.aBoolean437) {
			this.method5021();
		}
		@Pc(22) Class54_Sub2 local22 = (Class54_Sub2) arg0;
		Static23.aFloat38 = local13.aFloat69 + local22.aFloat63 * local13.aFloat71 + local22.aFloat66 * local13.aFloat64 + local13.aFloat73 * local22.aFloat69;
		Static607.aFloat175 = local13.aFloat73 * local22.aFloat64 + local13.aFloat71 * local22.aFloat67 + local22.aFloat74 * local13.aFloat64;
		@Pc(69) float local69 = Static23.aFloat38 + (float) this.aShort72 * Static607.aFloat175;
		@Pc(77) float local77 = Static23.aFloat38 + (float) this.aShort64 * Static607.aFloat175;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local94 = local77 - (float) this.aShort71;
			local87 = local69 + (float) this.aShort71;
		} else {
			local87 = local77 + (float) this.aShort71;
			local94 = (float) -this.aShort71 + local69;
		}
		if (this.aClass16_Sub3_26.aFloat152 <= local94 || local87 <= (float) this.aClass16_Sub3_26.anInt7377) {
			return;
		}
		Static526.aFloat187 = local13.aFloat67 * local22.aFloat66 + local22.aFloat63 * local13.aFloat68 + local13.aFloat72 * local22.aFloat69 + local13.aFloat63;
		Static382.aFloat171 = local22.aFloat64 * local13.aFloat72 + local22.aFloat74 * local13.aFloat67 + local22.aFloat67 * local13.aFloat68;
		@Pc(170) float local170 = (float) this.aShort72 * Static382.aFloat171 + Static526.aFloat187;
		@Pc(178) float local178 = Static526.aFloat187 + Static382.aFloat171 * (float) this.aShort64;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local178 < local170) {
			local194 = ((float) -this.aShort71 + local178) * (float) this.aClass16_Sub3_26.anInt7358;
			local205 = (local170 + (float) this.aShort71) * (float) this.aClass16_Sub3_26.anInt7358;
		} else {
			local205 = (local178 + (float) this.aShort71) * (float) this.aClass16_Sub3_26.anInt7358;
			local194 = ((float) -this.aShort71 + local170) * (float) this.aClass16_Sub3_26.anInt7358;
		}
		if (local194 / local87 >= this.aClass16_Sub3_26.aFloat155 || local205 / local87 <= this.aClass16_Sub3_26.aFloat166) {
			return;
		}
		Static249.aFloat105 = local22.aFloat67 * local13.aFloat70 + local13.aFloat74 * local22.aFloat74 + local22.aFloat64 * local13.aFloat65;
		Static453.aFloat181 = local13.aFloat66 + local13.aFloat65 * local22.aFloat69 + local22.aFloat63 * local13.aFloat70 + local22.aFloat66 * local13.aFloat74;
		@Pc(295) float local295 = Static249.aFloat105 * (float) this.aShort72 + Static453.aFloat181;
		@Pc(303) float local303 = Static249.aFloat105 * (float) this.aShort64 + Static453.aFloat181;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local295 > local303) {
			local318 = (float) this.aClass16_Sub3_26.anInt7362 * (local303 - (float) this.aShort71);
			local329 = (local295 + (float) this.aShort71) * (float) this.aClass16_Sub3_26.anInt7362;
		} else {
			local318 = (float) this.aClass16_Sub3_26.anInt7362 * ((float) -this.aShort71 + local295);
			local329 = ((float) this.aShort71 + local303) * (float) this.aClass16_Sub3_26.anInt7362;
		}
		if (local318 / local87 >= this.aClass16_Sub3_26.aFloat158 || local329 / local87 <= this.aClass16_Sub3_26.aFloat157) {
			return;
		}
		if (arg1 != null || this.lb != null) {
			Static291.aFloat110 = local13.aFloat73 * local22.aFloat73 + local22.aFloat65 * local13.aFloat64 + local13.aFloat71 * local22.aFloat72;
			Static104.aFloat59 = local13.aFloat68 * local22.aFloat68 + local13.aFloat67 * local22.aFloat70 + local13.aFloat72 * local22.aFloat71;
			Static194.aFloat80 = local22.aFloat70 * local13.aFloat74 + local13.aFloat70 * local22.aFloat68 + local13.aFloat65 * local22.aFloat71;
			Static439.aFloat179 = local13.aFloat74 * local22.aFloat65 + local13.aFloat70 * local22.aFloat72 + local22.aFloat73 * local13.aFloat65;
			Static249.aFloat106 = local22.aFloat71 * local13.aFloat73 + local13.aFloat71 * local22.aFloat68 + local22.aFloat70 * local13.aFloat64;
			Static223.aFloat193 = local22.aFloat65 * local13.aFloat67 + local22.aFloat72 * local13.aFloat68 + local13.aFloat72 * local22.aFloat73;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.aShort66 + this.aShort67 >> 1;
			@Pc(507) int local507 = this.aShort70 + this.aShort65 >> 1;
			@Pc(526) int local526 = (int) (Static526.aFloat187 + Static104.aFloat59 * (float) local499 + (float) this.aShort72 * Static382.aFloat171 + (float) local507 * Static223.aFloat193);
			@Pc(545) int local545 = (int) ((float) this.aShort72 * Static249.aFloat105 + (float) local499 * Static194.aFloat80 + Static453.aFloat181 + Static439.aFloat179 * (float) local507);
			@Pc(564) int local564 = (int) (Static249.aFloat106 * (float) local499 + Static23.aFloat38 + (float) this.aShort72 * Static607.aFloat175 + Static291.aFloat110 * (float) local507);
			if (this.aClass16_Sub3_26.anInt7377 > local564) {
				local489 = true;
			} else {
				arg1.anInt5263 = this.aClass16_Sub3_26.anInt7363 + local526 * this.aClass16_Sub3_26.anInt7358 / local564;
				arg1.anInt5265 = this.aClass16_Sub3_26.anInt7379 + local545 * this.aClass16_Sub3_26.anInt7362 / local564;
			}
			@Pc(622) int local622 = (int) (Static223.aFloat193 * (float) local507 + Static526.aFloat187 + (float) local499 * Static104.aFloat59 + (float) this.aShort64 * Static382.aFloat171);
			@Pc(641) int local641 = (int) ((float) local507 * Static439.aFloat179 + Static249.aFloat105 * (float) this.aShort64 + Static453.aFloat181 + (float) local499 * Static194.aFloat80);
			@Pc(660) int local660 = (int) (Static23.aFloat38 + (float) local499 * Static249.aFloat106 + Static607.aFloat175 * (float) this.aShort64 + Static291.aFloat110 * (float) local507);
			if (this.aClass16_Sub3_26.anInt7377 > local660) {
				local489 = true;
			} else {
				arg1.anInt5262 = this.aClass16_Sub3_26.anInt7358 * local622 / local660 + this.aClass16_Sub3_26.anInt7363;
				arg1.anInt5266 = this.aClass16_Sub3_26.anInt7362 * local641 / local660 + this.aClass16_Sub3_26.anInt7379;
			}
			if (local489) {
				if (this.aClass16_Sub3_26.anInt7377 > local564 && this.aClass16_Sub3_26.anInt7377 > local660) {
					local491 = false;
				} else {
					@Pc(743) int local743;
					@Pc(754) int local754;
					@Pc(765) int local765;
					if (this.aClass16_Sub3_26.anInt7377 > local564) {
						local743 = (local660 - this.aClass16_Sub3_26.anInt7377 << 16) / (local660 - local564);
						local754 = local622 + ((local622 - local526) * local743 >> 16);
						arg1.anInt5263 = local754 * this.aClass16_Sub3_26.anInt7358 / this.aClass16_Sub3_26.anInt7377 + this.aClass16_Sub3_26.anInt7363;
						local765 = local641 + (local743 * (local641 - local545) >> 16);
						arg1.anInt5265 = this.aClass16_Sub3_26.anInt7379 + local765 * this.aClass16_Sub3_26.anInt7362 / this.aClass16_Sub3_26.anInt7377;
					} else if (local660 < this.aClass16_Sub3_26.anInt7377) {
						local743 = (local564 - this.aClass16_Sub3_26.anInt7377 << 16) / (local564 - local660);
						local754 = (local743 * (local526 - local622) >> 16) + local526;
						local765 = (local743 * (local545 - local641) >> 16) + local545;
						arg1.anInt5263 = this.aClass16_Sub3_26.anInt7358 * local754 / this.aClass16_Sub3_26.anInt7377 + this.aClass16_Sub3_26.anInt7363;
						arg1.anInt5265 = this.aClass16_Sub3_26.anInt7362 * local765 / this.aClass16_Sub3_26.anInt7377 + this.aClass16_Sub3_26.anInt7379;
					}
				}
			}
			if (local491) {
				arg1.aBoolean394 = true;
				if (local564 > local660) {
					arg1.anInt5264 = this.aClass16_Sub3_26.anInt7358 * (local526 + this.aShort71) / local564 + this.aClass16_Sub3_26.anInt7363 - arg1.anInt5263;
				} else {
					arg1.anInt5264 = this.aClass16_Sub3_26.anInt7358 * (local622 + this.aShort71) / local660 + this.aClass16_Sub3_26.anInt7363 - arg1.anInt5262;
				}
			}
		}
		this.aClass16_Sub3_26.method5965();
		this.aClass16_Sub3_26.method6027(local22);
		this.method5029();
		this.aClass16_Sub3_26.method5960();
		this.method5027();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7995(@OriginalArg(0) Class83 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class83_Sub2 local8 = (Class83_Sub2) arg0;
		if (this.anInt6136 == 0 || local8.anInt6136 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6101;
		@Pc(24) int[] local24 = local8.anIntArray358;
		@Pc(27) int[] local27 = local8.anIntArray359;
		@Pc(30) int[] local30 = local8.anIntArray357;
		@Pc(33) short[] local33 = local8.aShortArray61;
		@Pc(36) short[] local36 = local8.aShortArray63;
		@Pc(39) short[] local39 = local8.aShortArray68;
		@Pc(42) byte[] local42 = local8.aByteArray44;
		@Pc(47) short[] local47;
		@Pc(49) short[] local49;
		@Pc(51) short[] local51;
		@Pc(53) byte[] local53;
		if (this.aClass9_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local53 = this.aClass9_1.aByteArray2;
			local51 = this.aClass9_1.aShortArray3;
			local49 = this.aClass9_1.aShortArray1;
			local47 = this.aClass9_1.aShortArray2;
		}
		@Pc(90) short[] local90;
		@Pc(82) short[] local82;
		@Pc(86) short[] local86;
		@Pc(78) byte[] local78;
		if (local8.aClass9_1 == null) {
			local82 = null;
			local90 = null;
			local78 = null;
			local86 = null;
		} else {
			local78 = local8.aClass9_1.aByteArray2;
			local82 = local8.aClass9_1.aShortArray1;
			local86 = local8.aClass9_1.aShortArray3;
			local90 = local8.aClass9_1.aShortArray2;
		}
		@Pc(103) int[] local103 = local8.anIntArray355;
		@Pc(106) short[] local106 = local8.aShortArray66;
		if (!local8.aBoolean437) {
			local8.method5021();
		}
		@Pc(115) short local115 = local8.aShort72;
		@Pc(118) short local118 = local8.aShort64;
		@Pc(121) short local121 = local8.aShort67;
		@Pc(124) short local124 = local8.aShort66;
		@Pc(127) short local127 = local8.aShort65;
		@Pc(130) short local130 = local8.aShort70;
		for (@Pc(132) int local132 = 0; local132 < this.anInt6101; local132++) {
			@Pc(142) int local142 = this.anIntArray359[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(162) int local162 = this.anIntArray358[local132] - arg1;
				if (local121 <= local162 && local162 <= local124) {
					@Pc(182) int local182 = this.anIntArray357[local132] - arg3;
					if (local127 <= local182 && local182 <= local130) {
						@Pc(200) int local200 = -1;
						@Pc(205) int local205 = this.anIntArray355[local132];
						@Pc(212) int local212 = this.anIntArray355[local132 + 1];
						for (@Pc(214) int local214 = local205; local214 < local212; local214++) {
							local200 = this.aShortArray66[local214] - 1;
							if (local200 == -1 || this.aByteArray44[local200] != 0) {
								break;
							}
						}
						if (local200 != -1) {
							for (@Pc(249) int local249 = 0; local249 < local21; local249++) {
								if (local162 == local24[local249] && local182 == local30[local249] && local27[local249] == local142) {
									local212 = local103[local249 + 1];
									local205 = local103[local249];
									@Pc(286) int local286 = -1;
									for (@Pc(288) int local288 = local205; local288 < local212; local288++) {
										local286 = local106[local288] - 1;
										if (local286 == -1 || local42[local286] != 0) {
											break;
										}
									}
									if (local286 != -1) {
										if (local47 == null) {
											this.aClass9_1 = new Class9();
											local47 = this.aClass9_1.aShortArray2 = Static292.method4864(this.aShortArray61);
											local49 = this.aClass9_1.aShortArray1 = Static292.method4864(this.aShortArray63);
											local51 = this.aClass9_1.aShortArray3 = Static292.method4864(this.aShortArray68);
											local53 = this.aClass9_1.aByteArray2 = Static202.method3730(this.aByteArray44);
										}
										if (local90 == null) {
											@Pc(372) Class9 local372 = local8.aClass9_1 = new Class9();
											local90 = local372.aShortArray2 = Static292.method4864(local33);
											local82 = local372.aShortArray1 = Static292.method4864(local36);
											local86 = local372.aShortArray3 = Static292.method4864(local39);
											local78 = local372.aByteArray2 = Static202.method3730(local42);
										}
										@Pc(405) short local405 = this.aShortArray61[local200];
										@Pc(410) short local410 = this.aShortArray63[local200];
										@Pc(415) short local415 = this.aShortArray68[local200];
										@Pc(420) byte local420 = this.aByteArray44[local200];
										local205 = local103[local249];
										local212 = local103[local249 + 1];
										@Pc(440) int local440;
										for (@Pc(432) int local432 = local205; local432 < local212; local432++) {
											local440 = local106[local432] - 1;
											if (local440 == -1) {
												break;
											}
											if (local78[local440] != 0) {
												local90[local440] += local405;
												local82[local440] += local410;
												local86[local440] += local415;
												local78[local440] += local420;
											}
										}
										local410 = local36[local286];
										local415 = local39[local286];
										local212 = this.anIntArray355[local132 + 1];
										local205 = this.anIntArray355[local132];
										local420 = local42[local286];
										local405 = local33[local286];
										for (local440 = local205; local440 < local212; local440++) {
											@Pc(525) int local525 = this.aShortArray66[local440] - 1;
											if (local525 == -1) {
												break;
											}
											if (local53[local525] != 0) {
												local47[local525] += local405;
												local49[local525] += local410;
												local51[local525] += local415;
												local53[local525] += local420;
											}
										}
										if (this.aClass268_7 == null && this.aClass268_8 != null) {
											this.aClass268_8.anInterface9_6 = null;
										}
										if (this.aClass268_7 != null) {
											this.aClass268_7.anInterface9_6 = null;
										}
										if (local8.aClass268_7 == null && local8.aClass268_8 != null) {
											local8.aClass268_8.anInterface9_6 = null;
										}
										if (local8.aClass268_7 != null) {
											local8.aClass268_7.anInterface9_6 = null;
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

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
	private void method5021() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt6101; local23++) {
			@Pc(30) int local30 = this.anIntArray358[local23];
			@Pc(35) int local35 = this.anIntArray359[local23];
			@Pc(40) int local40 = this.anIntArray357[local23];
			if (local35 < local9) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local40 < local11) {
				local11 = local40;
			}
			if (local17 < local40) {
				local17 = local40;
			}
			@Pc(86) int local86 = local40 * local40 + local30 * local30;
			if (local86 > local19) {
				local19 = local86;
			}
			local86 = local40 * local40 + local30 * local30 + local35 * local35;
			if (local86 > local21) {
				local21 = local86;
			}
		}
		this.aShort64 = (short) local15;
		this.aShort72 = (short) local9;
		this.aShort67 = (short) local7;
		this.aShort65 = (short) local11;
		this.aShort70 = (short) local17;
		this.aShort66 = (short) local13;
		this.aShort71 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort69 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean437 = true;
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "()[Lclient!nda;")
	@Override
	public Class219[] method8010() {
		return this.aClass219Array3;
	}

	@OriginalMember(owner = "client!lea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6101; local15++) {
			local33 = this.anIntArray357[local15] * local9 + this.anIntArray358[local15] * local13 >> 14;
			this.anIntArray357[local15] = local13 * this.anIntArray357[local15] - this.anIntArray358[local15] * local9 >> 14;
			this.anIntArray358[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6100; local33++) {
			@Pc(83) int local83 = local13 * this.aShortArray61[local33] + local9 * this.aShortArray68[local33] >> 14;
			this.aShortArray68[local33] = (short) (local13 * this.aShortArray68[local33] - this.aShortArray61[local33] * local9 >> 14);
			this.aShortArray61[local33] = (short) local83;
		}
		if (this.aClass268_7 == null && this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
		}
		if (this.aClass268_7 != null) {
			this.aClass268_7.anInterface9_6 = null;
		}
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!lea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!lea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6136; local7++) {
			if (this.aShortArray67[local7] == arg0) {
				this.aShortArray67[local7] = arg1;
			}
		}
		if (this.lb != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt6152; local38++) {
				@Pc(45) Class39 local45 = this.lb[local38];
				@Pc(50) Class122 local50 = this.aClass122Array1[local38];
				local50.anInt4361 = local50.anInt4361 & 0xFF000000 | Static77.anIntArray92[this.aShortArray67[local45.anInt1578] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray32 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6105; local12++) {
			this.anIntArray358[local12] <<= 0x4;
			this.anIntArray359[local12] <<= 0x4;
			this.anIntArray357[local12] <<= 0x4;
		}
		Static32.anInt1305 = 0;
		Static135.anInt3565 = 0;
		Static152.anInt3764 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILclient!dfa;ZII)Z")
	@Override
	public boolean method7994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5025(arg2, arg3, arg5, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dfa;Lclient!im;II)V")
	@Override
	public void method8009(@OriginalArg(0) Class54 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6100 == 0) {
			return;
		}
		@Pc(16) Class54_Sub2 local16 = this.aClass16_Sub3_26.aClass54_Sub2_3;
		@Pc(19) Class54_Sub2 local19 = (Class54_Sub2) arg0;
		if (!this.aBoolean437) {
			this.method5021();
		}
		Static607.aFloat175 = local19.aFloat74 * local16.aFloat64 + local16.aFloat71 * local19.aFloat67 + local16.aFloat73 * local19.aFloat64;
		Static23.aFloat38 = local19.aFloat66 * local16.aFloat64 + local19.aFloat63 * local16.aFloat71 + local19.aFloat69 * local16.aFloat73 + local16.aFloat69;
		@Pc(72) float local72 = Static23.aFloat38 + (float) this.aShort72 * Static607.aFloat175;
		@Pc(80) float local80 = Static607.aFloat175 * (float) this.aShort64 + Static23.aFloat38;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.aShort71 + local80;
			local97 = (float) this.aShort71 + local72;
		} else {
			local97 = (float) this.aShort71 + local80;
			local91 = local72 - (float) this.aShort71;
		}
		if (local91 >= this.aClass16_Sub3_26.aFloat168 || local97 <= (float) this.aClass16_Sub3_26.anInt7377) {
			return;
		}
		Static526.aFloat187 = local19.aFloat69 * local16.aFloat72 + local19.aFloat63 * local16.aFloat68 + local19.aFloat66 * local16.aFloat67 + local16.aFloat63;
		Static382.aFloat171 = local16.aFloat72 * local19.aFloat64 + local19.aFloat67 * local16.aFloat68 + local19.aFloat74 * local16.aFloat67;
		@Pc(173) float local173 = Static526.aFloat187 + (float) this.aShort72 * Static382.aFloat171;
		@Pc(181) float local181 = (float) this.aShort64 * Static382.aFloat171 + Static526.aFloat187;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local173 > local181) {
			local208 = (local173 + (float) this.aShort71) * (float) this.aClass16_Sub3_26.anInt7358;
			local197 = (float) this.aClass16_Sub3_26.anInt7358 * (local181 - (float) this.aShort71);
		} else {
			local197 = ((float) -this.aShort71 + local173) * (float) this.aClass16_Sub3_26.anInt7358;
			local208 = (float) this.aClass16_Sub3_26.anInt7358 * ((float) this.aShort71 + local181);
		}
		if (local197 / (float) arg2 >= this.aClass16_Sub3_26.aFloat155 || local208 / (float) arg2 <= this.aClass16_Sub3_26.aFloat166) {
			return;
		}
		Static249.aFloat105 = local19.aFloat74 * local16.aFloat74 + local16.aFloat70 * local19.aFloat67 + local16.aFloat65 * local19.aFloat64;
		Static453.aFloat181 = local16.aFloat66 + local16.aFloat70 * local19.aFloat63 + local19.aFloat66 * local16.aFloat74 + local16.aFloat65 * local19.aFloat69;
		@Pc(299) float local299 = Static249.aFloat105 * (float) this.aShort72 + Static453.aFloat181;
		@Pc(307) float local307 = Static453.aFloat181 + (float) this.aShort64 * Static249.aFloat105;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local299 > local307) {
			local322 = (float) this.aClass16_Sub3_26.anInt7362 * (local299 + (float) this.aShort71);
			local333 = (float) this.aClass16_Sub3_26.anInt7362 * (local307 - (float) this.aShort71);
		} else {
			local322 = (local307 + (float) this.aShort71) * (float) this.aClass16_Sub3_26.anInt7362;
			local333 = (float) this.aClass16_Sub3_26.anInt7362 * ((float) -this.aShort71 + local299);
		}
		if (local333 / (float) arg2 >= this.aClass16_Sub3_26.aFloat158 || this.aClass16_Sub3_26.aFloat157 >= local322 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.lb != null) {
			Static104.aFloat59 = local19.aFloat71 * local16.aFloat72 + local19.aFloat68 * local16.aFloat68 + local16.aFloat67 * local19.aFloat70;
			Static439.aFloat179 = local19.aFloat72 * local16.aFloat70 + local16.aFloat74 * local19.aFloat65 + local16.aFloat65 * local19.aFloat73;
			Static291.aFloat110 = local19.aFloat72 * local16.aFloat71 + local19.aFloat65 * local16.aFloat64 + local19.aFloat73 * local16.aFloat73;
			Static194.aFloat80 = local19.aFloat68 * local16.aFloat70 + local16.aFloat74 * local19.aFloat70 + local19.aFloat71 * local16.aFloat65;
			Static249.aFloat106 = local19.aFloat71 * local16.aFloat73 + local19.aFloat70 * local16.aFloat64 + local19.aFloat68 * local16.aFloat71;
			Static223.aFloat193 = local19.aFloat73 * local16.aFloat72 + local16.aFloat68 * local19.aFloat72 + local16.aFloat67 * local19.aFloat65;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort67 + this.aShort66 >> 1;
			@Pc(510) int local510 = this.aShort65 + this.aShort70 >> 1;
			@Pc(529) int local529 = (int) ((float) this.aShort72 * Static382.aFloat171 + Static104.aFloat59 * (float) local502 + Static526.aFloat187 + (float) local510 * Static223.aFloat193);
			@Pc(548) int local548 = (int) (Static439.aFloat179 * (float) local510 + Static194.aFloat80 * (float) local502 + Static453.aFloat181 + Static249.aFloat105 * (float) this.aShort72);
			@Pc(567) int local567 = (int) (Static607.aFloat175 * (float) this.aShort72 + Static249.aFloat106 * (float) local502 + Static23.aFloat38 + (float) local510 * Static291.aFloat110);
			@Pc(586) int local586 = (int) ((float) this.aShort64 * Static382.aFloat171 + (float) local502 * Static104.aFloat59 + Static526.aFloat187 + (float) local510 * Static223.aFloat193);
			@Pc(605) int local605 = (int) ((float) this.aShort64 * Static249.aFloat105 + Static453.aFloat181 + (float) local502 * Static194.aFloat80 + Static439.aFloat179 * (float) local510);
			arg1.anInt5263 = this.aClass16_Sub3_26.anInt7363 + this.aClass16_Sub3_26.anInt7358 * local529 / arg2;
			@Pc(637) int local637 = (int) ((float) local510 * Static291.aFloat110 + Static249.aFloat106 * (float) local502 + Static23.aFloat38 + (float) this.aShort64 * Static607.aFloat175);
			arg1.anInt5266 = this.aClass16_Sub3_26.anInt7379 + this.aClass16_Sub3_26.anInt7362 * local605 / arg2;
			arg1.anInt5262 = local586 * this.aClass16_Sub3_26.anInt7358 / arg2 + this.aClass16_Sub3_26.anInt7363;
			arg1.anInt5265 = local548 * this.aClass16_Sub3_26.anInt7362 / arg2 + this.aClass16_Sub3_26.anInt7379;
			if (local567 >= this.aClass16_Sub3_26.anInt7377 || this.aClass16_Sub3_26.anInt7377 <= local637) {
				arg1.aBoolean394 = true;
				arg1.anInt5264 = this.aClass16_Sub3_26.anInt7358 * (local529 + this.aShort71) / arg2 + this.aClass16_Sub3_26.anInt7363 - arg1.anInt5263;
			}
		}
		this.aClass16_Sub3_26.method5973((float) arg2);
		this.aClass16_Sub3_26.method5956();
		this.aClass16_Sub3_26.method6027(local19);
		this.method5029();
		this.aClass16_Sub3_26.method5960();
		this.method5027();
	}

	@OriginalMember(owner = "client!lea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6101; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray359[local15] - this.anIntArray357[local15] * local9 >> 14;
			this.anIntArray357[local15] = local13 * this.anIntArray357[local15] + local9 * this.anIntArray359[local15] >> 14;
			this.anIntArray359[local15] = local34;
		}
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!lea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6101; local3++) {
			if (arg0 != 0) {
				this.anIntArray358[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray359[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray357[local3] += arg2;
			}
		}
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
		this.aBoolean437 = false;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(IZ)V")
	private void method5022(@OriginalArg(1) boolean arg0) {
		if (this.anInt6126 * 6 <= this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2.aByteArray107.length) {
			this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2.anInt10588 = 0;
		} else {
			this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2 = new Class8_Sub8_Sub1((this.anInt6126 + 100) * 6);
		}
		@Pc(38) Class8_Sub8_Sub1 local38 = this.aClass16_Sub3_26.aClass8_Sub8_Sub1_2;
		@Pc(44) int local44;
		if (this.aClass16_Sub3_26.aBoolean519) {
			for (local44 = 0; local44 < this.anInt6126; local44++) {
				local38.method8548(this.aShortArray69[local44]);
				local38.method8548(this.aShortArray70[local44]);
				local38.method8548(this.aShortArray65[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt6126; local44++) {
				local38.method8534(this.aShortArray69[local44]);
				local38.method8534(this.aShortArray70[local44]);
				local38.method8534(this.aShortArray65[local44]);
			}
		}
		if (local38.anInt10588 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface23_2 == null) {
				this.anInterface23_2 = this.aClass16_Sub3_26.method6007(local38.anInt10588, true, local38.aByteArray107);
			} else {
				this.anInterface23_2.method5438(local38.aByteArray107, local38.anInt10588);
			}
			this.aClass320_1.anInterface23_5 = this.anInterface23_2;
		} else {
			this.aClass320_1.anInterface23_5 = this.aClass16_Sub3_26.method6007(local38.anInt10588, false, local38.aByteArray107);
		}
		if (!arg0) {
			this.aBoolean438 = true;
		}
	}

	@OriginalMember(owner = "client!lea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			local27 = 0;
			Static32.anInt1305 = 0;
			Static152.anInt3764 = 0;
			Static135.anInt3565 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray32.length > local41) {
					local55 = this.anIntArrayArray32[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray64 == null || (this.aShortArray64[local63] & arg6) != 0) {
							Static152.anInt3764 += this.anIntArray358[local63];
							Static135.anInt3565 += this.anIntArray359[local63];
							local27++;
							Static32.anInt1305 += this.anIntArray357[local63];
						}
					}
				}
			}
			if (local27 > 0) {
				Static32.anInt1305 = arg4 + Static32.anInt1305 / local27;
				Static135.anInt3565 = arg3 + Static135.anInt3565 / local27;
				Static152.anInt3764 = arg2 + Static152.anInt3764 / local27;
				Static552.aBoolean679 = true;
			} else {
				Static32.anInt1305 = arg4;
				Static135.anInt3565 = arg3;
				Static152.anInt3764 = arg2;
			}
			return;
		}
		@Pc(255) int[] local255;
		@Pc(257) int local257;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg7[0] * arg2 + arg3 * arg7[1] + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg3 = local35;
				arg2 = local27;
				arg4 = local41;
			}
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray32.length > local35) {
					local255 = this.anIntArrayArray32[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray64 == null || (this.aShortArray64[local57] & arg6) != 0) {
							this.anIntArray358[local57] += arg2;
							this.anIntArray359[local57] += arg3;
							this.anIntArray357[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(402) int local402;
		@Pc(424) int local424;
		@Pc(459) int local459;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(471) int local471;
		@Pc(479) int local479;
		@Pc(487) int local487;
		@Pc(640) int local640;
		@Pc(667) int local667;
		@Pc(671) int local671;
		@Pc(679) int local679;
		@Pc(684) int local684;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(694) int local694;
		@Pc(820) int[] local820;
		@Pc(822) int local822;
		@Pc(826) int local826;
		@Pc(830) int local830;
		@Pc(832) int local832;
		@Pc(964) int local964;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray32.length) {
						local255 = this.anIntArrayArray32[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray64 == null || (this.aShortArray64[local57] & arg6) != 0) {
								this.anIntArray358[local57] -= Static152.anInt3764;
								this.anIntArray359[local57] -= Static135.anInt3565;
								this.anIntArray357[local57] -= Static32.anInt1305;
								if (arg4 != 0) {
									local63 = Class344.anIntArray579[arg4];
									local380 = Class344.anIntArray578[arg4];
									local402 = this.anIntArray359[local57] * local63 + local380 * this.anIntArray358[local57] + 16383 >> 14;
									this.anIntArray359[local57] = this.anIntArray359[local57] * local380 + 16383 - this.anIntArray358[local57] * local63 >> 14;
									this.anIntArray358[local57] = local402;
								}
								if (arg2 != 0) {
									local63 = Class344.anIntArray579[arg2];
									local380 = Class344.anIntArray578[arg2];
									local402 = local380 * this.anIntArray359[local57] + 16383 - local63 * this.anIntArray357[local57] >> 14;
									this.anIntArray357[local57] = local380 * this.anIntArray357[local57] + local63 * this.anIntArray359[local57] + 16383 >> 14;
									this.anIntArray359[local57] = local402;
								}
								if (arg3 != 0) {
									local63 = Class344.anIntArray579[arg3];
									local380 = Class344.anIntArray578[arg3];
									local402 = local63 * this.anIntArray357[local57] + this.anIntArray358[local57] * local380 + 16383 >> 14;
									this.anIntArray357[local57] = local380 * this.anIntArray357[local57] + 16383 - local63 * this.anIntArray358[local57] >> 14;
									this.anIntArray358[local57] = local402;
								}
								this.anIntArray358[local57] += Static152.anInt3764;
								this.anIntArray359[local57] += Static135.anInt3565;
								this.anIntArray357[local57] += Static32.anInt1305;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray32.length > local41) {
							local55 = this.anIntArrayArray32[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray64 == null || (this.aShortArray64[local63] & arg6) != 0) {
									local380 = this.anIntArray355[local63];
									local402 = this.anIntArray355[local63 + 1];
									for (local424 = local380; local424 < local402; local424++) {
										local459 = this.aShortArray66[local424] - 1;
										if (local459 == -1) {
											break;
										}
										if (arg4 != 0) {
											local463 = Class344.anIntArray579[arg4];
											local467 = Class344.anIntArray578[arg4];
											local471 = this.aShortArray61[local459] * local467 + local463 * this.aShortArray63[local459] + 16383 >> 14;
											this.aShortArray63[local459] = (short) (this.aShortArray63[local459] * local467 + 16383 - local463 * this.aShortArray61[local459] >> 14);
											this.aShortArray61[local459] = (short) local471;
										}
										if (arg2 != 0) {
											local463 = Class344.anIntArray579[arg2];
											local467 = Class344.anIntArray578[arg2];
											local471 = this.aShortArray63[local459] * local467 + 16383 - this.aShortArray68[local459] * local463 >> 14;
											this.aShortArray68[local459] = (short) (local463 * this.aShortArray63[local459] + this.aShortArray68[local459] * local467 + 16383 >> 14);
											this.aShortArray63[local459] = (short) local471;
										}
										if (arg3 != 0) {
											local463 = Class344.anIntArray579[arg3];
											local467 = Class344.anIntArray578[arg3];
											local471 = this.aShortArray68[local459] * local463 + this.aShortArray61[local459] * local467 + 16383 >> 14;
											this.aShortArray68[local459] = (short) (local467 * this.aShortArray68[local459] + 16383 - this.aShortArray61[local459] * local463 >> 14);
											this.aShortArray61[local459] = (short) local471;
										}
									}
								}
							}
						}
					}
					if (this.aClass268_7 == null && this.aClass268_8 != null) {
						this.aClass268_8.anInterface9_6 = null;
					}
					if (this.aClass268_7 != null) {
						this.aClass268_7.anInterface9_6 = null;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local257 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static552.aBoolean679) {
					local380 = Static135.anInt3565 * arg7[3] + arg7[0] * Static152.anInt3764 + Static32.anInt1305 * arg7[6] + 8192 >> 14;
					local402 = arg7[1] * Static152.anInt3764 + Static135.anInt3565 * arg7[4] + Static32.anInt1305 * arg7[7] + 8192 >> 14;
					local424 = arg7[5] * Static135.anInt3565 + arg7[2] * Static152.anInt3764 + Static32.anInt1305 * arg7[8] + 8192 >> 14;
					local402 += local57;
					local380 += local257;
					local424 += local63;
					Static152.anInt3764 = local380;
					Static135.anInt3565 = local402;
					Static552.aBoolean679 = false;
					Static32.anInt1305 = local424;
				}
				@Pc(447) int[] local447 = new int[9];
				local402 = Class344.anIntArray578[arg2];
				local424 = Class344.anIntArray579[arg2];
				local459 = Class344.anIntArray578[arg3];
				local463 = Class344.anIntArray579[arg3];
				local467 = Class344.anIntArray578[arg4];
				local471 = Class344.anIntArray579[arg4];
				local479 = local424 * local467 + 8192 >> 14;
				local487 = local424 * local471 + 8192 >> 14;
				local447[3] = local402 * local471 + 8192 >> 14;
				local447[8] = local459 * local402 + 8192 >> 14;
				local447[1] = -local459 * local471 + local463 * local479 + 8192 >> 14;
				local447[0] = local467 * local459 + local463 * local487 + 8192 >> 14;
				local447[2] = local402 * local463 + 8192 >> 14;
				local447[4] = local467 * local402 + 8192 >> 14;
				local447[5] = -local424;
				local447[7] = local463 * local471 + local459 * local479 + 8192 >> 14;
				local447[6] = local487 * local459 + -local463 * local467 + 8192 >> 14;
				@Pc(615) int local615 = -Static32.anInt1305 * local447[2] + local447[0] * -Static152.anInt3764 + -Static135.anInt3565 * local447[1] + 8192 >> 14;
				local640 = local447[5] * -Static32.anInt1305 + local447[4] * -Static135.anInt3565 + local447[3] * -Static152.anInt3764 + 8192 >> 14;
				local667 = -Static152.anInt3764 * local447[6] + -Static135.anInt3565 * local447[7] + -Static32.anInt1305 * local447[8] + 8192 >> 14;
				local671 = Static152.anInt3764 + local615;
				@Pc(675) int local675 = local640 + Static135.anInt3565;
				local679 = Static32.anInt1305 + local667;
				@Pc(682) int[] local682 = new int[9];
				for (local684 = 0; local684 < 3; local684++) {
					for (local688 = 0; local688 < 3; local688++) {
						local692 = 0;
						for (local694 = 0; local694 < 3; local694++) {
							local692 += local447[local694 + local684 * 3] * arg7[local688 * 3 + local694];
						}
						local682[local684 * 3 + local688] = local692 + 8192 >> 14;
					}
				}
				local688 = local447[2] * local63 + local447[1] * local57 + local257 * local447[0] + 8192 >> 14;
				local692 = local257 * local447[3] + local57 * local447[4] + local447[5] * local63 + 8192 >> 14;
				local688 += local671;
				local694 = local257 * local447[6] + local447[7] * local57 + local447[8] * local63 + 8192 >> 14;
				local692 += local675;
				local694 += local679;
				local820 = new int[9];
				for (local822 = 0; local822 < 3; local822++) {
					for (local826 = 0; local826 < 3; local826++) {
						local830 = 0;
						for (local832 = 0; local832 < 3; local832++) {
							local830 += arg7[local822 * 3 + local832] * local682[local832 * 3 + local826];
						}
						local820[local826 + local822 * 3] = local830 + 8192 >> 14;
					}
				}
				local826 = local694 * arg7[2] + local688 * arg7[0] + local692 * arg7[1] + 8192 >> 14;
				local830 = local688 * arg7[3] + arg7[4] * local692 + arg7[5] * local694 + 8192 >> 14;
				local832 = arg7[8] * local694 + local692 * arg7[7] + arg7[6] * local688 + 8192 >> 14;
				local830 += local35;
				local826 += local27;
				local832 += local41;
				for (local964 = 0; local964 < local8; local964++) {
					@Pc(970) int local970 = arg1[local964];
					if (this.anIntArrayArray32.length > local970) {
						@Pc(984) int[] local984 = this.anIntArrayArray32[local970];
						for (@Pc(986) int local986 = 0; local986 < local984.length; local986++) {
							@Pc(992) int local992 = local984[local986];
							if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local992]) != 0) {
								@Pc(1036) int local1036 = this.anIntArray357[local992] * local820[2] + local820[1] * this.anIntArray359[local992] + this.anIntArray358[local992] * local820[0] + 8192 >> 14;
								@Pc(1068) int local1068 = this.anIntArray357[local992] * local820[5] + local820[3] * this.anIntArray358[local992] + this.anIntArray359[local992] * local820[4] + 8192 >> 14;
								@Pc(1072) int local1072 = local1036 + local826;
								@Pc(1103) int local1103 = this.anIntArray359[local992] * local820[7] + local820[6] * this.anIntArray358[local992] + this.anIntArray357[local992] * local820[8] + 8192 >> 14;
								@Pc(1107) int local1107 = local1068 + local830;
								this.anIntArray358[local992] = local1072;
								@Pc(1116) int local1116 = local1103 + local832;
								this.anIntArray359[local992] = local1107;
								this.anIntArray357[local992] = local1116;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2594) Class39 local2594;
			@Pc(2599) Class122 local2599;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray34.length) {
							local255 = this.anIntArrayArray34[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local57 = local255[local257];
								if (this.aShortArray62 == null || (this.aShortArray62[local57] & arg6) != 0) {
									local63 = arg2 * 8 + (this.aByteArray45[local57] & 0xFF);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray45[local57] = (byte) local63;
									if (this.aClass268_8 != null) {
										this.aClass268_8.anInterface9_6 = null;
									}
								}
							}
						}
					}
					if (this.lb != null) {
						for (local35 = 0; local35 < this.anInt6152; local35++) {
							local2594 = this.lb[local35];
							local2599 = this.aClass122Array1[local35];
							local2599.anInt4361 = local2599.anInt4361 & 0xFFFFFF | 255 - (this.aByteArray45[local2594.anInt1578] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2849) Class122 local2849;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray33.length > local35) {
								local255 = this.anIntArrayArray33[local35];
								for (local257 = 0; local257 < local255.length; local257++) {
									local2849 = this.aClass122Array1[local255[local257]];
									local2849.anInt4357 += arg2;
									local2849.anInt4353 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray33.length > local35) {
								local255 = this.anIntArrayArray33[local35];
								for (local257 = 0; local257 < local255.length; local257++) {
									local2849 = this.aClass122Array1[local255[local257]];
									local2849.anInt4358 = local2849.anInt4358 * arg2 >> 7;
									local2849.anInt4352 = local2849.anInt4352 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray33.length) {
							local255 = this.anIntArrayArray33[local35];
							for (local257 = 0; local257 < local255.length; local257++) {
								local2849 = this.aClass122Array1[local255[local257]];
								local2849.anInt4355 = local2849.anInt4355 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray34 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray34.length) {
						local255 = this.anIntArrayArray34[local35];
						for (local257 = 0; local257 < local255.length; local257++) {
							local57 = local255[local257];
							if (this.aShortArray62 == null || (arg6 & this.aShortArray62[local57]) != 0) {
								local63 = this.aShortArray67[local57] & 0xFFFF;
								local380 = local63 >> 10 & 0x3F;
								local402 = local63 >> 7 & 0x7;
								local424 = local63 & 0x7F;
								@Pc(2699) int local2699 = arg2 + local380 & 0x3F;
								local402 += arg3 / 4;
								if (local402 < 0) {
									local402 = 0;
								} else if (local402 > 7) {
									local402 = 7;
								}
								local424 += arg4;
								if (local424 < 0) {
									local424 = 0;
								} else if (local424 > 127) {
									local424 = 127;
								}
								this.aShortArray67[local57] = (short) (local2699 << 10 | local402 << 7 | local424);
								if (this.aClass268_8 != null) {
									this.aClass268_8.anInterface9_6 = null;
								}
							}
						}
					}
				}
				if (this.lb != null) {
					for (local35 = 0; local35 < this.anInt6152; local35++) {
						local2594 = this.lb[local35];
						local2599 = this.aClass122Array1[local35];
						local2599.anInt4361 = Static77.anIntArray92[this.aShortArray67[local2594.anInt1578] & 0xFFFF] & 0xFFFFFF | local2599.anInt4361 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray32.length) {
					local255 = this.anIntArrayArray32[local35];
					for (local257 = 0; local257 < local255.length; local257++) {
						local57 = local255[local257];
						if (this.aShortArray64 == null || (arg6 & this.aShortArray64[local57]) != 0) {
							this.anIntArray358[local57] -= Static152.anInt3764;
							this.anIntArray359[local57] -= Static135.anInt3565;
							this.anIntArray357[local57] -= Static32.anInt1305;
							this.anIntArray358[local57] = arg2 * this.anIntArray358[local57] >> 7;
							this.anIntArray359[local57] = this.anIntArray359[local57] * arg3 >> 7;
							this.anIntArray357[local57] = this.anIntArray357[local57] * arg4 >> 7;
							this.anIntArray358[local57] += Static152.anInt3764;
							this.anIntArray359[local57] += Static135.anInt3565;
							this.anIntArray357[local57] += Static32.anInt1305;
						}
					}
				}
			}
		} else {
			local27 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local257 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static552.aBoolean679) {
				local380 = Static32.anInt1305 * arg7[6] + Static152.anInt3764 * arg7[0] + arg7[3] * Static135.anInt3565 + 8192 >> 14;
				local402 = Static152.anInt3764 * arg7[1] + Static135.anInt3565 * arg7[4] + Static32.anInt1305 * arg7[7] + 8192 >> 14;
				local424 = arg7[8] * Static32.anInt1305 + arg7[2] * Static152.anInt3764 + arg7[5] * Static135.anInt3565 + 8192 >> 14;
				local380 += local257;
				local402 += local57;
				local424 += local63;
				Static135.anInt3565 = local402;
				Static152.anInt3764 = local380;
				Static32.anInt1305 = local424;
				Static552.aBoolean679 = false;
			}
			local380 = arg2 << 15 >> 7;
			local402 = arg3 << 15 >> 7;
			local424 = arg4 << 15 >> 7;
			local459 = -Static152.anInt3764 * local380 + 8192 >> 14;
			local463 = -Static135.anInt3565 * local402 + 8192 >> 14;
			local467 = local424 * -Static32.anInt1305 + 8192 >> 14;
			local471 = local459 + Static152.anInt3764;
			local479 = local463 + Static135.anInt3565;
			local487 = local467 + Static32.anInt1305;
			@Pc(1888) int[] local1888 = new int[] { arg7[0] * local380 + 8192 >> 14, local380 * arg7[3] + 8192 >> 14, local380 * arg7[6] + 8192 >> 14, arg7[1] * local402 + 8192 >> 14, local402 * arg7[4] + 8192 >> 14, arg7[7] * local402 + 8192 >> 14, arg7[2] * local424 + 8192 >> 14, local424 * arg7[5] + 8192 >> 14, local424 * arg7[8] + 8192 >> 14 };
			local640 = local257 * local380 + 8192 >> 14;
			local667 = local402 * local57 + 8192 >> 14;
			local671 = local424 * local63 + 8192 >> 14;
			@Pc(2024) int local2024 = local640 + local471;
			@Pc(2028) int local2028 = local667 + local479;
			@Pc(2032) int local2032 = local671 + local487;
			@Pc(2035) int[] local2035 = new int[9];
			@Pc(2041) int local2041;
			for (local679 = 0; local679 < 3; local679++) {
				for (local2041 = 0; local2041 < 3; local2041++) {
					local684 = 0;
					for (local688 = 0; local688 < 3; local688++) {
						local684 += arg7[local688 + local679 * 3] * local1888[local2041 + local688 * 3];
					}
					local2035[local679 * 3 + local2041] = local684 + 8192 >> 14;
				}
			}
			local2041 = local2032 * arg7[2] + arg7[1] * local2028 + local2024 * arg7[0] + 8192 >> 14;
			local684 = arg7[5] * local2032 + arg7[3] * local2024 + arg7[4] * local2028 + 8192 >> 14;
			local688 = arg7[7] * local2028 + arg7[6] * local2024 + arg7[8] * local2032 + 8192 >> 14;
			local2041 += local27;
			local684 += local35;
			local688 += local41;
			for (local692 = 0; local692 < local8; local692++) {
				local694 = arg1[local692];
				if (local694 < this.anIntArrayArray32.length) {
					local820 = this.anIntArrayArray32[local694];
					for (local822 = 0; local822 < local820.length; local822++) {
						local826 = local820[local822];
						if (this.aShortArray64 == null || (this.aShortArray64[local826] & arg6) != 0) {
							local830 = local2035[2] * this.anIntArray357[local826] + local2035[0] * this.anIntArray358[local826] + local2035[1] * this.anIntArray359[local826] + 8192 >> 14;
							local832 = this.anIntArray357[local826] * local2035[5] + this.anIntArray358[local826] * local2035[3] + this.anIntArray359[local826] * local2035[4] + 8192 >> 14;
							@Pc(2277) int local2277 = local832 + local684;
							local964 = this.anIntArray359[local826] * local2035[7] + local2035[6] * this.anIntArray358[local826] + this.anIntArray357[local826] * local2035[8] + 8192 >> 14;
							@Pc(2312) int local2312 = local830 + local2041;
							this.anIntArray358[local826] = local2312;
							@Pc(2321) int local2321 = local964 + local688;
							this.anIntArray359[local826] = local2277;
							this.anIntArray357[local826] = local2321;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "f", descriptor = "()Z")
	@Override
	public boolean method8012() {
		if (this.aShortArray71 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray71.length; local12++) {
			if (this.aShortArray71[local12] != -1 && !this.aClass16_Sub3_26.anInterface2_12.method4025(this.aShortArray71[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dfa;IZ)V")
	@Override
	public void method7996(@OriginalArg(0) Class54 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray64 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6101; local14++) {
			if ((arg1 & this.aShortArray64[local14]) != 0) {
				if (arg2) {
					arg0.method5129(this.anIntArray358[local14], this.anIntArray359[local14], this.anIntArray357[local14], local12);
				} else {
					arg0.method5139(this.anIntArray358[local14], this.anIntArray359[local14], this.anIntArray357[local14], local12);
				}
				this.anIntArray358[local14] = local12[0];
				this.anIntArray359[local14] = local12[1];
				this.anIntArray357[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIFIJIIFLclient!uk;)S")
	private short method5023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) Class344 arg8) {
		@Pc(16) int local16 = this.anIntArray355[arg6];
		@Pc(23) int local23 = this.anIntArray355[arg6 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(34) short local34 = this.aShortArray66[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (Static439.aLongArray11[local27] == arg4) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray66[local25] = (short) (this.anInt6100 + 1);
		Static439.aLongArray11[local25] = arg4;
		this.aShortArray61[this.anInt6100] = (short) arg0;
		this.aShortArray63[this.anInt6100] = (short) arg5;
		this.aShortArray68[this.anInt6100] = (short) arg3;
		this.aByteArray44[this.anInt6100] = (byte) arg1;
		this.aFloatArray56[this.anInt6100] = arg7;
		this.aFloatArray57[this.anInt6100] = arg2;
		return (short) this.anInt6100++;
	}

	@OriginalMember(owner = "client!lea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort65;
	}

	@OriginalMember(owner = "client!lea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "()[Lclient!oia;")
	@Override
	public Class238[] method8005() {
		return this.aClass238Array3;
	}

	@OriginalMember(owner = "client!lea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass16_Sub3_26.anInterface2_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6136; local11++) {
			if (arg0 == this.aShortArray71[local11]) {
				this.aShortArray71[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class218 local43 = local9.method4027(arg0 & 0xFFFF);
			local31 = local43.aByte63;
			local33 = local43.aByte68;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(64) Class218 local64 = local9.method4027(arg1 & 0xFFFF);
			local51 = local64.aByte63;
			if (local64.aByte67 != 0 || local64.aByte64 != 0) {
				this.aBoolean440 = true;
			}
			local53 = local64.aByte68;
		}
		if (!(local33 != local53 | local51 != local31)) {
			return;
		}
		if (this.lb != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt6152; local101++) {
				@Pc(108) Class39 local108 = this.lb[local101];
				@Pc(113) Class122 local113 = this.aClass122Array1[local101];
				local113.anInt4361 = local113.anInt4361 & 0xFF000000 | Static77.anIntArray92[this.aShortArray67[local108.anInt1578] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class83 method7993(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class83_Sub2 local23;
		@Pc(19) Class83_Sub2 local19;
		if (arg0 == 1) {
			local19 = this.aClass16_Sub3_26.aClass83_Sub2_10;
			local23 = this.aClass16_Sub3_26.aClass83_Sub2_3;
		} else if (arg0 == 2) {
			local19 = this.aClass16_Sub3_26.aClass83_Sub2_5;
			local23 = this.aClass16_Sub3_26.aClass83_Sub2_7;
		} else if (arg0 == 3) {
			local23 = this.aClass16_Sub3_26.aClass83_Sub2_6;
			local19 = this.aClass16_Sub3_26.aClass83_Sub2_8;
		} else if (arg0 == 4) {
			local23 = this.aClass16_Sub3_26.aClass83_Sub2_9;
			local19 = this.aClass16_Sub3_26.aClass83_Sub2_4;
		} else if (arg0 == 5) {
			local19 = this.aClass16_Sub3_26.aClass83_Sub2_2;
			local23 = this.aClass16_Sub3_26.aClass83_Sub2_1;
		} else {
			local23 = local19 = new Class83_Sub2(this.aClass16_Sub3_26);
		}
		return this.method5031(arg1, arg2, arg0 != 0, local23, local19);
	}

	@OriginalMember(owner = "client!lea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class344.anIntArray579[arg0];
		@Pc(13) int local13 = Class344.anIntArray578[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6101; local15++) {
			@Pc(33) int local33 = this.anIntArray359[local15] * local9 + local13 * this.anIntArray358[local15] >> 14;
			this.anIntArray359[local15] = local13 * this.anIntArray359[local15] - local9 * this.anIntArray358[local15] >> 14;
			this.anIntArray358[local15] = local33;
		}
		this.aBoolean437 = false;
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6101; local3++) {
			this.anIntArray357[local3] = -this.anIntArray357[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt6100; local25++) {
			this.aShortArray68[local25] = (short) -this.aShortArray68[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt6136; local44++) {
			@Pc(51) short local51 = this.aShortArray69[local44];
			this.aShortArray69[local44] = this.aShortArray65[local44];
			this.aShortArray65[local44] = local51;
		}
		if (this.aClass268_7 == null && this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
		}
		if (this.aClass268_7 != null) {
			this.aClass268_7.anInterface9_6 = null;
		}
		this.aBoolean437 = false;
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
		if (this.aClass320_1 != null) {
			this.aClass320_1.anInterface23_5 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!lea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort72;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IISIB)I")
	private int method5024(@OriginalArg(1) int arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(18) int local18 = Static77.anIntArray92[Static440.method6801(arg2, arg0)];
		if (arg1 != -1) {
			@Pc(31) Class218 local31 = this.aClass16_Sub3_26.anInterface2_12.method4027(arg1 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte63 & 0xFF;
			@Pc(45) int local45;
			@Pc(72) int local72;
			if (local36 != 0) {
				if (arg2 < 0) {
					local45 = 0;
				} else if (arg2 > 127) {
					local45 = 16777215;
				} else {
					local45 = arg2 * 131586;
				}
				if (local36 == 256) {
					local18 = local45;
				} else {
					local72 = 256 - local36;
					local18 = (local72 * (local18 & 0xFF00FF) + (local45 & 0xFF00FF) * local36 & 0xFF00FF00) + (local72 * (local18 & 0xFF00) + (local45 & 0xFF00) * local36 & 0xFF0000) >> 8;
				}
			}
			local45 = local31.aByte68 & 0xFF;
			if (local45 != 0) {
				local45 += 256;
				@Pc(122) int local122 = local45 * (local18 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local72 = (local18 >> 8 & 0xFF) * local45;
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(148) int local148 = local45 * (local18 & 0xFF);
				if (local148 > 65535) {
					local148 = 65535;
				}
				local18 = (local148 >> 8) + (local72 & 0xFF00) + ((local122 & 0xC700FF00) << 8);
			}
		}
		return (local18 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!lea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean439;
	}

	@OriginalMember(owner = "client!lea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6101; local7++) {
			if (arg0 != 128) {
				this.anIntArray358[local7] = this.anIntArray358[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray359[local7] = this.anIntArray359[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray357[local7] = arg2 * this.anIntArray357[local7] >> 7;
			}
		}
		this.aBoolean437 = false;
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dfa;ZIIIII)Z")
	private boolean method5025(@OriginalArg(0) Class54 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class54_Sub2 local8 = (Class54_Sub2) arg0;
		@Pc(12) Class54_Sub2 local12 = this.aClass16_Sub3_26.aClass54_Sub2_3;
		@Pc(33) float local33 = local8.aFloat63 * local12.aFloat68 + local8.aFloat66 * local12.aFloat67 + local8.aFloat69 * local12.aFloat72 + local12.aFloat63;
		@Pc(54) float local54 = local12.aFloat65 * local8.aFloat69 + local12.aFloat70 * local8.aFloat63 + local8.aFloat66 * local12.aFloat74 + local12.aFloat66;
		Static439.aFloat179 = local12.aFloat74 * local8.aFloat65 + local8.aFloat72 * local12.aFloat70 + local8.aFloat73 * local12.aFloat65;
		Static194.aFloat80 = local8.aFloat71 * local12.aFloat65 + local12.aFloat70 * local8.aFloat68 + local12.aFloat74 * local8.aFloat70;
		Static223.aFloat193 = local12.aFloat68 * local8.aFloat72 + local8.aFloat65 * local12.aFloat67 + local12.aFloat72 * local8.aFloat73;
		Static291.aFloat110 = local12.aFloat64 * local8.aFloat65 + local12.aFloat71 * local8.aFloat72 + local8.aFloat73 * local12.aFloat73;
		Static249.aFloat106 = local8.aFloat68 * local12.aFloat71 + local8.aFloat70 * local12.aFloat64 + local12.aFloat73 * local8.aFloat71;
		Static607.aFloat175 = local12.aFloat73 * local8.aFloat64 + local12.aFloat71 * local8.aFloat67 + local8.aFloat74 * local12.aFloat64;
		Static104.aFloat59 = local12.aFloat68 * local8.aFloat68 + local12.aFloat67 * local8.aFloat70 + local12.aFloat72 * local8.aFloat71;
		@Pc(201) float local201 = local8.aFloat69 * local12.aFloat73 + local8.aFloat63 * local12.aFloat71 + local8.aFloat66 * local12.aFloat64 + local12.aFloat69;
		Static249.aFloat105 = local12.aFloat74 * local8.aFloat74 + local8.aFloat67 * local12.aFloat70 + local12.aFloat65 * local8.aFloat64;
		Static382.aFloat171 = local8.aFloat64 * local12.aFloat72 + local8.aFloat67 * local12.aFloat68 + local8.aFloat74 * local12.aFloat67;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass16_Sub3_26.anInt7358;
		@Pc(261) int local261 = this.aClass16_Sub3_26.anInt7362;
		if (!this.aBoolean437) {
			this.method5021();
		}
		@Pc(278) int local278 = this.aShort66 - this.aShort67 >> 1;
		@Pc(286) int local286 = this.aShort64 - this.aShort72 >> 1;
		@Pc(294) int local294 = this.aShort70 - this.aShort65 >> 1;
		@Pc(300) int local300 = this.aShort67 + local278;
		@Pc(305) int local305 = local286 + this.aShort72;
		@Pc(310) int local310 = this.aShort65 + local294;
		@Pc(317) int local317 = local300 - (local278 << arg4);
		@Pc(324) int local324 = local305 - (local286 << arg4);
		@Pc(331) int local331 = local310 - (local294 << arg4);
		@Pc(337) int local337 = (local278 << arg4) + local300;
		@Pc(344) int local344 = local305 + (local286 << arg4);
		@Pc(351) int local351 = local310 + (local294 << arg4);
		Static100.anIntArray129[0] = local317;
		Static480.anIntArray468[0] = local324;
		Static100.anIntArray129[1] = local337;
		Static173.anIntArray230[0] = local331;
		Static480.anIntArray468[1] = local324;
		Static100.anIntArray129[2] = local317;
		Static173.anIntArray230[1] = local331;
		Static480.anIntArray468[2] = local344;
		Static100.anIntArray129[3] = local337;
		Static173.anIntArray230[2] = local331;
		Static480.anIntArray468[3] = local344;
		Static100.anIntArray129[4] = local317;
		Static173.anIntArray230[3] = local331;
		Static480.anIntArray468[4] = local324;
		Static100.anIntArray129[5] = local337;
		Static173.anIntArray230[4] = local351;
		Static480.anIntArray468[5] = local324;
		Static173.anIntArray230[5] = local351;
		Static100.anIntArray129[6] = local317;
		Static480.anIntArray468[6] = local344;
		Static100.anIntArray129[7] = local337;
		Static173.anIntArray230[6] = local351;
		Static480.anIntArray468[7] = local344;
		Static173.anIntArray230[7] = local351;
		@Pc(508) float local508;
		@Pc(494) float local494;
		@Pc(480) float local480;
		@Pc(456) float local456;
		@Pc(466) float local466;
		@Pc(461) float local461;
		for (@Pc(449) int local449 = 0; local449 < 8; local449++) {
			local456 = Static100.anIntArray129[local449];
			local461 = Static173.anIntArray230[local449];
			local466 = Static480.anIntArray468[local449];
			local480 = local466 * Static607.aFloat175 + local456 * Static249.aFloat106 + local461 * Static291.aFloat110 + local201;
			local494 = local54 + Static439.aFloat179 * local461 + local456 * Static194.aFloat80 + local466 * Static249.aFloat105;
			local508 = local33 + Static223.aFloat193 * local461 + local456 * Static104.aFloat59 + local466 * Static382.aFloat171;
			if (local480 >= (float) this.aClass16_Sub3_26.anInt7377) {
				if (arg2 > 0) {
					local480 = arg2;
				}
				@Pc(535) float local535 = (float) this.aClass16_Sub3_26.anInt7363 + (float) local251 * local508 / local480;
				@Pc(547) float local547 = (float) local261 * local494 / local480 + (float) this.aClass16_Sub3_26.anInt7379;
				if (local535 < local241) {
					local241 = local535;
				}
				if (local535 > local243) {
					local243 = local535;
				}
				local239 = true;
				if (local547 > local247) {
					local247 = local547;
				}
				if (local245 > local547) {
					local245 = local547;
				}
			}
		}
		if (local239 && local241 < (float) arg3 && (float) arg3 < local243 && local245 < (float) arg5 && (float) arg5 < local247) {
			if (arg1) {
				return true;
			}
			if (this.anInt6100 > this.aClass16_Sub3_26.anIntArray397.length) {
				this.aClass16_Sub3_26.anIntArray397 = new int[this.anInt6100];
				this.aClass16_Sub3_26.anIntArray396 = new int[this.anInt6100];
			}
			@Pc(630) int[] local630 = this.aClass16_Sub3_26.anIntArray397;
			@Pc(634) int[] local634 = this.aClass16_Sub3_26.anIntArray396;
			@Pc(726) int local726;
			for (@Pc(636) int local636 = 0; local636 < this.anInt6101; local636++) {
				local466 = this.anIntArray359[local636];
				local456 = this.anIntArray358[local636];
				local461 = this.anIntArray357[local636];
				local508 = local461 * Static223.aFloat193 + Static382.aFloat171 * local466 + local456 * Static104.aFloat59 + local33;
				local480 = local456 * Static249.aFloat106 + Static607.aFloat175 * local466 + local461 * Static291.aFloat110 + local201;
				local494 = Static249.aFloat105 * local466 + local456 * Static194.aFloat80 + local461 * Static439.aFloat179 + local54;
				@Pc(739) int local739;
				@Pc(744) int local744;
				@Pc(751) int local751;
				if (local480 >= (float) this.aClass16_Sub3_26.anInt7377) {
					if (arg2 > 0) {
						local480 = arg2;
					}
					local726 = (int) (local508 * (float) local251 / local480 + (float) this.aClass16_Sub3_26.anInt7363);
					local739 = (int) (local494 * (float) local261 / local480 + (float) this.aClass16_Sub3_26.anInt7379);
					local744 = this.anIntArray355[local636];
					local751 = this.anIntArray355[local636 + 1];
					for (@Pc(753) int local753 = local744; local753 < local751; local753++) {
						@Pc(762) int local762 = this.aShortArray66[local753] - 1;
						if (local762 == -1) {
							break;
						}
						local630[local762] = local726;
						local634[local762] = local739;
					}
				} else {
					local726 = this.anIntArray355[local636];
					local739 = this.anIntArray355[local636 + 1];
					for (local744 = local726; local744 < local739; local744++) {
						local751 = this.aShortArray66[local744] - 1;
						if (local751 == -1) {
							break;
						}
						local630[this.aShortArray66[local744] - 1] = -999999;
					}
				}
			}
			for (local726 = 0; local726 < this.anInt6136; local726++) {
				if (local630[this.aShortArray69[local726]] != -999999 && local630[this.aShortArray70[local726]] != -999999 && local630[this.aShortArray65[local726]] != -999999 && this.method5028(local634[this.aShortArray70[local726]], local634[this.aShortArray65[local726]], arg5, local630[this.aShortArray70[local726]], arg3, local630[this.aShortArray65[local726]], local630[this.aShortArray69[local726]], local634[this.aShortArray69[local726]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "()V")
	@Override
	protected void method8000() {
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "()V")
	@Override
	protected void method8011() {
	}

	@OriginalMember(owner = "client!lea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static135.anInt3565 = 0;
			Static32.anInt1305 = 0;
			Static152.anInt3764 = 0;
			for (local17 = 0; local17 < this.anInt6101; local17++) {
				Static152.anInt3764 += this.anIntArray358[local17];
				Static135.anInt3565 += this.anIntArray359[local17];
				local9++;
				Static32.anInt1305 += this.anIntArray357[local17];
			}
			if (local9 > 0) {
				Static135.anInt3565 = Static135.anInt3565 / local9 + arg2;
				Static32.anInt1305 = Static32.anInt1305 / local9 + arg3;
				Static152.anInt3764 = Static152.anInt3764 / local9 + arg1;
			} else {
				Static135.anInt3565 = arg2;
				Static32.anInt1305 = arg3;
				Static152.anInt3764 = arg1;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt6101; local9++) {
				this.anIntArray358[local9] += arg1;
				this.anIntArray359[local9] += arg2;
				this.anIntArray357[local9] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(184) int local184;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt6101; local9++) {
					this.anIntArray358[local9] -= Static152.anInt3764;
					this.anIntArray359[local9] -= Static135.anInt3565;
					this.anIntArray357[local9] -= Static32.anInt1305;
					if (arg3 != 0) {
						local17 = Class344.anIntArray579[arg3];
						local165 = Class344.anIntArray578[arg3];
						local184 = local17 * this.anIntArray359[local9] + local165 * this.anIntArray358[local9] + 16383 >> 14;
						this.anIntArray359[local9] = this.anIntArray359[local9] * local165 + 16383 - local17 * this.anIntArray358[local9] >> 14;
						this.anIntArray358[local9] = local184;
					}
					if (arg1 != 0) {
						local17 = Class344.anIntArray579[arg1];
						local165 = Class344.anIntArray578[arg1];
						local184 = local165 * this.anIntArray359[local9] + 16383 - local17 * this.anIntArray357[local9] >> 14;
						this.anIntArray357[local9] = local17 * this.anIntArray359[local9] + this.anIntArray357[local9] * local165 + 16383 >> 14;
						this.anIntArray359[local9] = local184;
					}
					if (arg2 != 0) {
						local17 = Class344.anIntArray579[arg2];
						local165 = Class344.anIntArray578[arg2];
						local184 = local17 * this.anIntArray357[local9] + this.anIntArray358[local9] * local165 + 16383 >> 14;
						this.anIntArray357[local9] = local165 * this.anIntArray357[local9] + 16383 - this.anIntArray358[local9] * local17 >> 14;
						this.anIntArray358[local9] = local184;
					}
					this.anIntArray358[local9] += Static152.anInt3764;
					this.anIntArray359[local9] += Static135.anInt3565;
					this.anIntArray357[local9] += Static32.anInt1305;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt6101; local9++) {
					this.anIntArray358[local9] -= Static152.anInt3764;
					this.anIntArray359[local9] -= Static135.anInt3565;
					this.anIntArray357[local9] -= Static32.anInt1305;
					this.anIntArray358[local9] = arg1 * this.anIntArray358[local9] / 128;
					this.anIntArray359[local9] = arg2 * this.anIntArray359[local9] / 128;
					this.anIntArray357[local9] = arg3 * this.anIntArray357[local9] / 128;
					this.anIntArray358[local9] += Static152.anInt3764;
					this.anIntArray359[local9] += Static135.anInt3565;
					this.anIntArray357[local9] += Static32.anInt1305;
				}
			} else {
				@Pc(518) Class39 local518;
				@Pc(523) Class122 local523;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt6136; local9++) {
						local17 = (this.aByteArray45[local9] & 0xFF) + arg1 * 8;
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray45[local9] = (byte) local17;
					}
					if (this.aClass268_8 != null) {
						this.aClass268_8.anInterface9_6 = null;
					}
					if (this.lb != null) {
						for (local17 = 0; local17 < this.anInt6152; local17++) {
							local518 = this.lb[local17];
							local523 = this.aClass122Array1[local17];
							local523.anInt4361 = 255 - (this.aByteArray45[local518.anInt1578] & 0xFF) << 24 | local523.anInt4361 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt6136; local9++) {
						local17 = this.aShortArray67[local9] & 0xFFFF;
						local165 = local17 >> 10 & 0x3F;
						local184 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = local165 + arg1 & 0x3F;
						@Pc(584) int local584 = local17 & 0x7F;
						local184 += arg2 / 4;
						local584 += arg3;
						if (local184 < 0) {
							local184 = 0;
						} else if (local184 > 7) {
							local184 = 7;
						}
						if (local584 < 0) {
							local584 = 0;
						} else if (local584 > 127) {
							local584 = 127;
						}
						this.aShortArray67[local9] = (short) (local584 | local184 << 7 | local580 << 10);
					}
					if (this.aClass268_8 != null) {
						this.aClass268_8.anInterface9_6 = null;
					}
					if (this.lb != null) {
						for (local17 = 0; local17 < this.anInt6152; local17++) {
							local518 = this.lb[local17];
							local523 = this.aClass122Array1[local17];
							local523.anInt4361 = Static77.anIntArray92[this.aShortArray67[local518.anInt1578] & 0xFFFF] & 0xFFFFFF | local523.anInt4361 & 0xFF000000;
						}
					}
				} else {
					@Pc(704) Class122 local704;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt6152; local9++) {
							local704 = this.aClass122Array1[local9];
							local704.anInt4357 += arg1;
							local704.anInt4353 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt6152; local9++) {
							local704 = this.aClass122Array1[local9];
							local704.anInt4358 = arg1 * local704.anInt4358 >> 7;
							local704.anInt4352 = arg2 * local704.anInt4352 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt6152; local9++) {
							local704 = this.aClass122Array1[local9];
							local704.anInt4355 = local704.anInt4355 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IILclient!dfa;ZI)Z")
	@Override
	public boolean method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class54 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5025(arg2, arg3, -1, arg0, arg4, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Z)V")
	private void method5027() {
		if (this.lb == null) {
			return;
		}
		@Pc(8) Class54_Sub2 local8 = this.aClass16_Sub3_26.aClass54_Sub2_2;
		this.aClass16_Sub3_26.method6000();
		this.aClass16_Sub3_26.C(!this.aBoolean439);
		this.aClass16_Sub3_26.method6024(false);
		this.aClass16_Sub3_26.method5988(null, null, this.aClass16_Sub3_26.aClass268_12, this.aClass16_Sub3_26.aClass268_13);
		for (@Pc(40) int local40 = 0; local40 < this.anInt6152; local40++) {
			@Pc(47) Class39 local47 = this.lb[local40];
			@Pc(52) Class122 local52 = this.aClass122Array1[local40];
			if (!local47.aBoolean121 || !this.aClass16_Sub3_26.method6079()) {
				@Pc(81) float local81 = (float) (this.anIntArray358[local47.anInt1574] + this.anIntArray358[local47.anInt1572] + this.anIntArray358[local47.anInt1570]) * 0.3333333F;
				@Pc(102) float local102 = (float) (this.anIntArray359[local47.anInt1572] + this.anIntArray359[local47.anInt1574] + this.anIntArray359[local47.anInt1570]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray357[local47.anInt1574] + this.anIntArray357[local47.anInt1572] + this.anIntArray357[local47.anInt1570]) * 0.3333333F;
				@Pc(139) float local139 = Static526.aFloat187 + Static104.aFloat59 * local81 + local102 * Static382.aFloat171 + Static223.aFloat193 * local125;
				@Pc(153) float local153 = Static453.aFloat181 + Static249.aFloat105 * local102 + local81 * Static194.aFloat80 + Static439.aFloat179 * local125;
				@Pc(167) float local167 = local102 * Static607.aFloat175 + Static249.aFloat106 * local81 + Static291.aFloat110 * local125 + Static23.aFloat38;
				@Pc(188) float local188 = (float) (1.0D / Math.sqrt((double) (local167 * local167 + local153 * local153 + local139 * local139))) * (float) local47.anInt1575;
				local8.method2592((float) local52.anInt4353 + local153 * local188 - local153, local139 + (float) local52.anInt4357 - local188 * local139, local52.anInt4355, local47.aShort15 * local52.anInt4352 >> 7, local167 * local188 - local167, local52.anInt4358 * local47.aShort13 >> 7);
				this.aClass16_Sub3_26.method5978(local8);
				@Pc(240) int local240 = local52.anInt4361;
				OpenGL.glColor4ub((byte) (local240 >> 16), (byte) (local240 >> 8), (byte) local240, (byte) (local240 >> 24));
				this.aClass16_Sub3_26.method6023(local47.aShort14);
				this.aClass16_Sub3_26.method6005(local47.aByte19);
				this.aClass16_Sub3_26.method5971(4);
			}
		}
		this.aClass16_Sub3_26.C(true);
		this.aClass16_Sub3_26.method5960();
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "()V")
	@Override
	public void method8002() {
		if (this.anInt6100 <= 0 || this.anInt6126 <= 0) {
			return;
		}
		this.method5019(false);
		if ((this.aByte61 & 0x10) == 0 && this.aClass320_1.anInterface23_5 == null) {
			this.method5022(false);
		}
		this.method5020();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg7 && arg0 > arg2 && arg2 < arg1) {
			return false;
		} else if (arg2 > arg7 && arg2 > arg0 && arg2 > arg1) {
			return false;
		} else if (arg6 > arg4 && arg3 > arg4 && arg4 < arg5) {
			return false;
		} else {
			return arg4 <= arg6 || arg4 <= arg3 || arg5 >= arg4;
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(Z)V")
	private void method5029() {
		if (this.anInt6126 == 0) {
			return;
		}
		if (this.aByte61 != 0) {
			this.method5019(true);
		}
		this.method5019(false);
		if (this.aClass320_1 != null) {
			if (this.aClass320_1.anInterface23_5 == null) {
				this.method5022((this.aByte61 & 0x10) != 0);
			}
			if (this.aClass320_1.anInterface23_5 != null) {
				this.aClass16_Sub3_26.method6024(this.aClass268_7 != null);
				this.aClass16_Sub3_26.method5988(this.aClass268_8, this.aClass268_7, this.aClass268_10, this.aClass268_9);
				@Pc(84) int local84 = this.anIntArray356.length - 1;
				for (@Pc(86) int local86 = 0; local86 < local84; local86++) {
					@Pc(93) int local93 = this.anIntArray356[local86];
					@Pc(100) int local100 = this.anIntArray356[local86 + 1];
					@Pc(107) int local107 = this.aShortArray71[local93] & 0xFFFF;
					if (local107 == 65535) {
						local107 = -1;
					}
					this.aClass16_Sub3_26.method5964(this.aClass268_7 != null, local107);
					this.aClass16_Sub3_26.method5992((local100 - local93) * 3, this.aClass320_1.anInterface23_5, local93 * 3);
				}
			}
		}
		this.method5020();
	}

	@OriginalMember(owner = "client!lea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean437) {
			this.method5021();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7992(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt6136; local3++) {
			local12 = this.aShortArray67[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			@Pc(56) int local56 = local12 & 0x7F;
			if (arg2 != -1) {
				local56 += arg3 * (arg2 - local56) >> 7;
			}
			this.aShortArray67[local3] = (short) (local24 << 7 | local18 << 10 | local56);
		}
		if (this.lb != null) {
			for (local12 = 0; local12 < this.anInt6152; local12++) {
				@Pc(109) Class39 local109 = this.lb[local12];
				@Pc(114) Class122 local114 = this.aClass122Array1[local12];
				local114.anInt4361 = Static77.anIntArray92[this.aShortArray67[local109.anInt1578] & 0xFFFF] & 0xFFFFFF | local114.anInt4361 & 0xFF000000;
			}
		}
		if (this.aClass268_8 != null) {
			this.aClass268_8.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dfa;)V")
	@Override
	public void method7999(@OriginalArg(0) Class54 arg0) {
		@Pc(8) Class54_Sub2 local8 = (Class54_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass219Array3 != null) {
			for (local13 = 0; local13 < this.aClass219Array3.length; local13++) {
				@Pc(20) Class219 local20 = this.aClass219Array3[local13];
				@Pc(22) Class219 local22 = local20;
				if (local20.aClass219_2 != null) {
					local22 = local20.aClass219_2;
				}
				local22.anInt6908 = (int) (local8.aFloat63 + (float) this.anIntArray357[local20.anInt6898] * local8.aFloat72 + local8.aFloat68 * (float) this.anIntArray358[local20.anInt6898] + local8.aFloat67 * (float) this.anIntArray359[local20.anInt6898]);
				local22.anInt6902 = (int) (local8.aFloat66 + (float) this.anIntArray359[local20.anInt6898] * local8.aFloat74 + local8.aFloat70 * (float) this.anIntArray358[local20.anInt6898] + local8.aFloat65 * (float) this.anIntArray357[local20.anInt6898]);
				local22.anInt6900 = (int) (local8.aFloat71 * (float) this.anIntArray358[local20.anInt6898] + local8.aFloat64 * (float) this.anIntArray359[local20.anInt6898] + (float) this.anIntArray357[local20.anInt6898] * local8.aFloat73 + local8.aFloat69);
				local22.anInt6913 = (int) (local8.aFloat67 * (float) this.anIntArray359[local20.anInt6899] + local8.aFloat68 * (float) this.anIntArray358[local20.anInt6899] + local8.aFloat72 * (float) this.anIntArray357[local20.anInt6899] + local8.aFloat63);
				local22.anInt6911 = (int) (local8.aFloat66 + (float) this.anIntArray358[local20.anInt6899] * local8.aFloat70 + (float) this.anIntArray359[local20.anInt6899] * local8.aFloat74 + (float) this.anIntArray357[local20.anInt6899] * local8.aFloat65);
				local22.anInt6916 = (int) (local8.aFloat69 + local8.aFloat64 * (float) this.anIntArray359[local20.anInt6899] + (float) this.anIntArray358[local20.anInt6899] * local8.aFloat71 + (float) this.anIntArray357[local20.anInt6899] * local8.aFloat73);
				local22.anInt6904 = (int) (local8.aFloat63 + (float) this.anIntArray357[local20.anInt6906] * local8.aFloat72 + (float) this.anIntArray359[local20.anInt6906] * local8.aFloat67 + local8.aFloat68 * (float) this.anIntArray358[local20.anInt6906]);
				local22.anInt6903 = (int) (local8.aFloat66 + (float) this.anIntArray359[local20.anInt6906] * local8.aFloat74 + local8.aFloat70 * (float) this.anIntArray358[local20.anInt6906] + (float) this.anIntArray357[local20.anInt6906] * local8.aFloat65);
				local22.anInt6905 = (int) (local8.aFloat73 * (float) this.anIntArray357[local20.anInt6906] + local8.aFloat71 * (float) this.anIntArray358[local20.anInt6906] + local8.aFloat64 * (float) this.anIntArray359[local20.anInt6906] + local8.aFloat69);
			}
		}
		if (this.aClass238Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass238Array3.length; local13++) {
			@Pc(365) Class238 local365 = this.aClass238Array3[local13];
			@Pc(367) Class238 local367 = local365;
			if (local365.aClass238_1 != null) {
				local367 = local365.aClass238_1;
			}
			if (local365.aClass54_8 == null) {
				local365.aClass54_8 = local8.method5133();
			} else {
				local365.aClass54_8.method5137(local8);
			}
			local367.anInt7656 = (int) (local8.aFloat63 + (float) this.anIntArray357[local365.anInt7661] * local8.aFloat72 + (float) this.anIntArray358[local365.anInt7661] * local8.aFloat68 + local8.aFloat67 * (float) this.anIntArray359[local365.anInt7661]);
			local367.anInt7662 = (int) ((float) this.anIntArray357[local365.anInt7661] * local8.aFloat65 + local8.aFloat70 * (float) this.anIntArray358[local365.anInt7661] + (float) this.anIntArray359[local365.anInt7661] * local8.aFloat74 + local8.aFloat66);
			local367.anInt7657 = (int) (local8.aFloat64 * (float) this.anIntArray359[local365.anInt7661] + local8.aFloat71 * (float) this.anIntArray358[local365.anInt7661] + local8.aFloat73 * (float) this.anIntArray357[local365.anInt7661] + local8.aFloat69);
		}
	}

	@OriginalMember(owner = "client!lea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class8_Sub5_Sub11 ba(@OriginalArg(0) Class8_Sub5_Sub11 arg0) {
		if (this.anInt6100 == 0) {
			return null;
		}
		if (!this.aBoolean437) {
			this.method5021();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass16_Sub3_26.anInt7351 <= 0) {
			local37 = this.aShort67 - (this.aClass16_Sub3_26.anInt7351 * this.aShort72 >> 8) >> this.aClass16_Sub3_26.anInt7339;
			local54 = this.aShort66 - (this.aClass16_Sub3_26.anInt7351 * this.aShort64 >> 8) >> this.aClass16_Sub3_26.anInt7339;
		} else {
			local37 = this.aShort67 - (this.aClass16_Sub3_26.anInt7351 * this.aShort64 >> 8) >> this.aClass16_Sub3_26.anInt7339;
			local54 = this.aShort66 - (this.aClass16_Sub3_26.anInt7351 * this.aShort72 >> 8) >> this.aClass16_Sub3_26.anInt7339;
		}
		@Pc(111) int local111;
		@Pc(128) int local128;
		if (this.aClass16_Sub3_26.anInt7375 > 0) {
			local111 = this.aShort65 - (this.aShort64 * this.aClass16_Sub3_26.anInt7375 >> 8) >> this.aClass16_Sub3_26.anInt7339;
			local128 = this.aShort70 - (this.aClass16_Sub3_26.anInt7375 * this.aShort72 >> 8) >> this.aClass16_Sub3_26.anInt7339;
		} else {
			local111 = this.aShort65 - (this.aShort72 * this.aClass16_Sub3_26.anInt7375 >> 8) >> this.aClass16_Sub3_26.anInt7339;
			local128 = this.aShort70 - (this.aShort64 * this.aClass16_Sub3_26.anInt7375 >> 8) >> this.aClass16_Sub3_26.anInt7339;
		}
		@Pc(171) int local171 = local54 + 1 - local37;
		@Pc(178) int local178 = local128 + 1 - local111;
		@Pc(181) Class8_Sub5_Sub11_Sub1 local181 = (Class8_Sub5_Sub11_Sub1) arg0;
		@Pc(197) Class8_Sub5_Sub11_Sub1 local197;
		if (local181 != null && local181.method5552(local171, local178)) {
			local197 = local181;
			local181.method5555();
		} else {
			local197 = new Class8_Sub5_Sub11_Sub1(this.aClass16_Sub3_26, local171, local178);
		}
		local197.method5553(local54, local111, local128, local37);
		this.method5030(local197);
		return local197;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8014(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg3 << 4;
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			Static32.anInt1305 = 0;
			Static135.anInt3565 = 0;
			local31 = 0;
			Static152.anInt3764 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray32.length > local41) {
					local55 = this.anIntArrayArray32[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static152.anInt3764 += this.anIntArray358[local63];
						Static135.anInt3565 += this.anIntArray359[local63];
						local31++;
						Static32.anInt1305 += this.anIntArray357[local63];
					}
				}
			}
			if (local31 <= 0) {
				Static152.anInt3764 = local25;
				Static32.anInt1305 = local21;
				Static135.anInt3565 = local17;
			} else {
				Static135.anInt3565 = Static135.anInt3565 / local31 + local17;
				Static32.anInt1305 = local21 + Static32.anInt1305 / local31;
				Static152.anInt3764 = Static152.anInt3764 / local31 + local25;
			}
			return;
		}
		@Pc(164) int[] local164;
		@Pc(166) int local166;
		if (arg0 == 1) {
			local21 = arg4 << 4;
			local25 = arg2 << 4;
			local17 = arg3 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray32.length > local35) {
					local164 = this.anIntArrayArray32[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray358[local57] += local25;
						this.anIntArray359[local57] += local17;
						this.anIntArray357[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(286) int local286;
		@Pc(304) int local304;
		@Pc(756) int local756;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray32.length) {
					local164 = this.anIntArrayArray32[local35];
					if ((arg5 & 0x1) == 0) {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray358[local57] -= Static152.anInt3764;
							this.anIntArray359[local57] -= Static135.anInt3565;
							this.anIntArray357[local57] -= Static32.anInt1305;
							if (arg4 != 0) {
								local63 = Class344.anIntArray579[arg4];
								local286 = Class344.anIntArray578[arg4];
								local304 = local63 * this.anIntArray359[local57] + local286 * this.anIntArray358[local57] + 16383 >> 14;
								this.anIntArray359[local57] = local286 * this.anIntArray359[local57] + 16383 - this.anIntArray358[local57] * local63 >> 14;
								this.anIntArray358[local57] = local304;
							}
							if (arg2 != 0) {
								local63 = Class344.anIntArray579[arg2];
								local286 = Class344.anIntArray578[arg2];
								local304 = local286 * this.anIntArray359[local57] + 16383 - local63 * this.anIntArray357[local57] >> 14;
								this.anIntArray357[local57] = this.anIntArray359[local57] * local63 + this.anIntArray357[local57] * local286 + 16383 >> 14;
								this.anIntArray359[local57] = local304;
							}
							if (arg3 != 0) {
								local63 = Class344.anIntArray579[arg3];
								local286 = Class344.anIntArray578[arg3];
								local304 = this.anIntArray357[local57] * local63 + local286 * this.anIntArray358[local57] + 16383 >> 14;
								this.anIntArray357[local57] = this.anIntArray357[local57] * local286 + 16383 - local63 * this.anIntArray358[local57] >> 14;
								this.anIntArray358[local57] = local304;
							}
							this.anIntArray358[local57] += Static152.anInt3764;
							this.anIntArray359[local57] += Static135.anInt3565;
							this.anIntArray357[local57] += Static32.anInt1305;
						}
					} else {
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							this.anIntArray358[local57] -= Static152.anInt3764;
							this.anIntArray359[local57] -= Static135.anInt3565;
							this.anIntArray357[local57] -= Static32.anInt1305;
							if (arg2 != 0) {
								local63 = Class344.anIntArray579[arg2];
								local286 = Class344.anIntArray578[arg2];
								local304 = this.anIntArray359[local57] * local286 + 16383 - local63 * this.anIntArray357[local57] >> 14;
								this.anIntArray357[local57] = local286 * this.anIntArray357[local57] + local63 * this.anIntArray359[local57] + 16383 >> 14;
								this.anIntArray359[local57] = local304;
							}
							if (arg4 != 0) {
								local63 = Class344.anIntArray579[arg4];
								local286 = Class344.anIntArray578[arg4];
								local304 = local63 * this.anIntArray359[local57] + local286 * this.anIntArray358[local57] + 16383 >> 14;
								this.anIntArray359[local57] = local286 * this.anIntArray359[local57] + 16383 - local63 * this.anIntArray358[local57] >> 14;
								this.anIntArray358[local57] = local304;
							}
							if (arg3 != 0) {
								local63 = Class344.anIntArray579[arg3];
								local286 = Class344.anIntArray578[arg3];
								local304 = this.anIntArray357[local57] * local63 + local286 * this.anIntArray358[local57] + 16383 >> 14;
								this.anIntArray357[local57] = local286 * this.anIntArray357[local57] + 16383 - local63 * this.anIntArray358[local57] >> 14;
								this.anIntArray358[local57] = local304;
							}
							this.anIntArray358[local57] += Static152.anInt3764;
							this.anIntArray359[local57] += Static135.anInt3565;
							this.anIntArray357[local57] += Static32.anInt1305;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray32.length) {
						local55 = this.anIntArrayArray32[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local286 = this.anIntArray355[local63];
							local304 = this.anIntArray355[local63 + 1];
							for (local756 = local286; local756 < local304; local756++) {
								@Pc(765) int local765 = this.aShortArray66[local756] - 1;
								if (local765 == -1) {
									break;
								}
								@Pc(775) int local775;
								@Pc(779) int local779;
								@Pc(797) int local797;
								if (arg4 != 0) {
									local775 = Class344.anIntArray579[arg4];
									local779 = Class344.anIntArray578[arg4];
									local797 = this.aShortArray61[local765] * local779 + this.aShortArray63[local765] * local775 + 16383 >> 14;
									this.aShortArray63[local765] = (short) (this.aShortArray63[local765] * local779 + 16383 - local775 * this.aShortArray61[local765] >> 14);
									this.aShortArray61[local765] = (short) local797;
								}
								if (arg2 != 0) {
									local775 = Class344.anIntArray579[arg2];
									local779 = Class344.anIntArray578[arg2];
									local797 = local779 * this.aShortArray63[local765] + 16383 - this.aShortArray68[local765] * local775 >> 14;
									this.aShortArray68[local765] = (short) (this.aShortArray63[local765] * local775 + this.aShortArray68[local765] * local779 + 16383 >> 14);
									this.aShortArray63[local765] = (short) local797;
								}
								if (arg3 != 0) {
									local775 = Class344.anIntArray579[arg3];
									local779 = Class344.anIntArray578[arg3];
									local797 = local779 * this.aShortArray61[local765] + local775 * this.aShortArray68[local765] + 16383 >> 14;
									this.aShortArray68[local765] = (short) (local779 * this.aShortArray68[local765] + 16383 - local775 * this.aShortArray61[local765] >> 14);
									this.aShortArray61[local765] = (short) local797;
								}
							}
						}
					}
				}
				if (this.aClass268_7 == null && this.aClass268_8 != null) {
					this.aClass268_8.anInterface9_6 = null;
				}
				if (this.aClass268_7 != null) {
					this.aClass268_7.anInterface9_6 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray32.length) {
					local164 = this.anIntArrayArray32[local35];
					for (local166 = 0; local166 < local164.length; local166++) {
						local57 = local164[local166];
						this.anIntArray358[local57] -= Static152.anInt3764;
						this.anIntArray359[local57] -= Static135.anInt3565;
						this.anIntArray357[local57] -= Static32.anInt1305;
						this.anIntArray358[local57] = arg2 * this.anIntArray358[local57] >> 7;
						this.anIntArray359[local57] = this.anIntArray359[local57] * arg3 >> 7;
						this.anIntArray357[local57] = this.anIntArray357[local57] * arg4 >> 7;
						this.anIntArray358[local57] += Static152.anInt3764;
						this.anIntArray359[local57] += Static135.anInt3565;
						this.anIntArray357[local57] += Static32.anInt1305;
					}
				}
			}
		} else {
			@Pc(1217) Class39 local1217;
			@Pc(1222) Class122 local1222;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray34.length) {
							local164 = this.anIntArrayArray34[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local57 = local164[local166];
								local63 = arg2 * 8 + (this.aByteArray45[local57] & 0xFF);
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray45[local57] = (byte) local63;
							}
							if (local164.length > 0 && this.aClass268_8 != null) {
								this.aClass268_8.anInterface9_6 = null;
							}
						}
					}
					if (this.lb != null) {
						for (local35 = 0; local35 < this.anInt6152; local35++) {
							local1217 = this.lb[local35];
							local1222 = this.aClass122Array1[local35];
							local1222.anInt4361 = local1222.anInt4361 & 0xFFFFFF | 255 - (this.aByteArray45[local1217.anInt1578] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1472) Class122 local1472;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray33.length > local35) {
								local164 = this.anIntArrayArray33[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1472 = this.aClass122Array1[local164[local166]];
									local1472.anInt4353 += arg3;
									local1472.anInt4357 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray33.length > local35) {
								local164 = this.anIntArrayArray33[local35];
								for (local166 = 0; local166 < local164.length; local166++) {
									local1472 = this.aClass122Array1[local164[local166]];
									local1472.anInt4352 = arg3 * local1472.anInt4352 >> 7;
									local1472.anInt4358 = local1472.anInt4358 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray33.length) {
							local164 = this.anIntArrayArray33[local35];
							for (local166 = 0; local166 < local164.length; local166++) {
								local1472 = this.aClass122Array1[local164[local166]];
								local1472.anInt4355 = local1472.anInt4355 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray34 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray34.length > local35) {
						local164 = this.anIntArrayArray34[local35];
						for (local166 = 0; local166 < local164.length; local166++) {
							local57 = local164[local166];
							local63 = this.aShortArray67[local57] & 0xFFFF;
							local286 = local63 >> 10 & 0x3F;
							local304 = local63 >> 7 & 0x7;
							@Pc(1310) int local1310 = local286 + arg2 & 0x3F;
							local304 += arg3 / 4;
							local756 = local63 & 0x7F;
							local756 += arg4;
							if (local304 < 0) {
								local304 = 0;
							} else if (local304 > 7) {
								local304 = 7;
							}
							if (local756 < 0) {
								local756 = 0;
							} else if (local756 > 127) {
								local756 = 127;
							}
							this.aShortArray67[local57] = (short) (local756 | local304 << 7 | local1310 << 10);
						}
						if (local164.length > 0 && this.aClass268_8 != null) {
							this.aClass268_8.anInterface9_6 = null;
						}
					}
				}
				if (this.lb != null) {
					for (local35 = 0; local35 < this.anInt6152; local35++) {
						local1217 = this.lb[local35];
						local1222 = this.aClass122Array1[local35];
						local1222.anInt4361 = local1222.anInt4361 & 0xFF000000 | Static77.anIntArray92[this.aShortArray67[local1217.anInt1578] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!mt;Z)V")
	private void method5030(@OriginalArg(0) Class8_Sub5_Sub11_Sub1 arg0) {
		if (this.anInt6100 > this.aClass16_Sub3_26.anIntArray397.length) {
			this.aClass16_Sub3_26.anIntArray396 = new int[this.anInt6100];
			this.aClass16_Sub3_26.anIntArray397 = new int[this.anInt6100];
		}
		@Pc(32) int[] local32 = this.aClass16_Sub3_26.anIntArray397;
		@Pc(36) int[] local36 = this.aClass16_Sub3_26.anIntArray396;
		@Pc(64) int local64;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt6101; local38++) {
			local64 = (this.anIntArray358[local38] - (this.aClass16_Sub3_26.anInt7351 * this.anIntArray359[local38] >> 8) >> this.aClass16_Sub3_26.anInt7339) - arg0.anInt6760;
			@Pc(89) int local89 = (this.anIntArray357[local38] - (this.aClass16_Sub3_26.anInt7375 * this.anIntArray359[local38] >> 8) >> this.aClass16_Sub3_26.anInt7339) - arg0.anInt6762;
			@Pc(94) int local94 = this.anIntArray355[local38];
			@Pc(101) int local101 = this.anIntArray355[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray66[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local64;
				local36[local112] = local89;
			}
		}
		for (local64 = 0; local64 < this.anInt6126; local64++) {
			if (this.aByteArray45 == null || this.aByteArray45[local64] <= 128) {
				@Pc(160) short local160 = this.aShortArray69[local64];
				@Pc(165) short local165 = this.aShortArray70[local64];
				@Pc(170) short local170 = this.aShortArray65[local64];
				local103 = local32[local160];
				local112 = local32[local165];
				@Pc(182) int local182 = local32[local170];
				@Pc(186) int local186 = local36[local160];
				@Pc(190) int local190 = local36[local165];
				@Pc(194) int local194 = local36[local170];
				if ((local190 - local194) * (-local112 + local103) - (local182 - local112) * (-local186 + local190) > 0) {
					arg0.method5554(local182, local194, local186, local112, local103, local190);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6105; local3++) {
			this.anIntArray358[local3] = this.anIntArray358[local3] + 7 >> 4;
			this.anIntArray359[local3] = this.anIntArray359[local3] + 7 >> 4;
			this.anIntArray357[local3] = this.anIntArray357[local3] + 7 >> 4;
		}
		this.aBoolean437 = false;
		if (this.aClass268_9 != null) {
			this.aClass268_9.anInterface9_6 = null;
		}
	}

	@OriginalMember(owner = "client!lea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort63;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IZZLclient!lea;Lclient!lea;I)Lclient!ka;")
	private Class83 method5031(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class83_Sub2 arg3, @OriginalArg(4) Class83_Sub2 arg4) {
		arg3.aBoolean440 = this.aBoolean440;
		arg3.anInt6101 = this.anInt6101;
		arg3.anInt6105 = this.anInt6105;
		arg3.anInt6106 = this.anInt6106;
		arg3.aByte61 = 0;
		if ((arg0 & 0x100) == 0) {
			arg3.aBoolean439 = this.aBoolean439;
		} else {
			arg3.aBoolean439 = true;
		}
		arg3.anInt6136 = this.anInt6136;
		arg3.anInt6126 = this.anInt6126;
		arg3.anInt6152 = this.anInt6152;
		arg3.aShort68 = this.aShort68;
		arg3.anInt6122 = arg0;
		arg3.aShort63 = this.aShort63;
		arg3.anInt6100 = this.anInt6100;
		@Pc(70) boolean local70 = Static629.method8467(arg0, this.anInt6106);
		@Pc(76) boolean local76 = Static343.method5469(this.anInt6106, arg0);
		@Pc(82) boolean local82 = Static390.method6237(this.anInt6106, arg0);
		@Pc(88) boolean local88 = local70 | local76 | local82;
		@Pc(207) int local207;
		if (local88) {
			if (!local70) {
				arg3.anIntArray358 = this.anIntArray358;
			} else if (arg4.anIntArray358 == null || arg4.anIntArray358.length < this.anInt6105) {
				arg3.anIntArray358 = arg4.anIntArray358 = new int[this.anInt6105];
			} else {
				arg3.anIntArray358 = arg4.anIntArray358;
			}
			if (!local76) {
				arg3.anIntArray359 = this.anIntArray359;
			} else if (arg4.anIntArray359 == null || arg4.anIntArray359.length < this.anInt6105) {
				arg3.anIntArray359 = arg4.anIntArray359 = new int[this.anInt6105];
			} else {
				arg3.anIntArray359 = arg4.anIntArray359;
			}
			if (!local82) {
				arg3.anIntArray357 = this.anIntArray357;
			} else if (arg4.anIntArray357 == null || this.anInt6105 > arg4.anIntArray357.length) {
				arg3.anIntArray357 = arg4.anIntArray357 = new int[this.anInt6105];
			} else {
				arg3.anIntArray357 = arg4.anIntArray357;
			}
			for (local207 = 0; local207 < this.anInt6105; local207++) {
				if (local70) {
					arg3.anIntArray358[local207] = this.anIntArray358[local207];
				}
				if (local76) {
					arg3.anIntArray359[local207] = this.anIntArray359[local207];
				}
				if (local82) {
					arg3.anIntArray357[local207] = this.anIntArray357[local207];
				}
			}
		} else {
			arg3.anIntArray357 = this.anIntArray357;
			arg3.anIntArray358 = this.anIntArray358;
			arg3.anIntArray359 = this.anIntArray359;
		}
		if (Static416.method6524(arg0, this.anInt6106)) {
			arg3.aClass268_9 = arg4.aClass268_9;
			if (arg2) {
				arg3.aByte61 = (byte) (arg3.aByte61 | 0x1);
			}
			arg3.aClass268_9.aByte88 = this.aClass268_9.aByte88;
			arg3.aClass268_9.anInterface9_6 = this.aClass268_9.anInterface9_6;
		} else if (Static598.method1720(arg0, this.anInt6106)) {
			arg3.aClass268_9 = this.aClass268_9;
		} else {
			arg3.aClass268_9 = null;
		}
		if (Static228.method4246(this.anInt6106, arg0)) {
			if (arg4.aShortArray67 == null || arg4.aShortArray67.length < this.anInt6136) {
				arg3.aShortArray67 = arg4.aShortArray67 = new short[this.anInt6136];
			} else {
				arg3.aShortArray67 = arg4.aShortArray67;
			}
			for (local207 = 0; local207 < this.anInt6136; local207++) {
				arg3.aShortArray67[local207] = this.aShortArray67[local207];
			}
		} else {
			arg3.aShortArray67 = this.aShortArray67;
		}
		if (Static270.method8004(arg0, this.anInt6106)) {
			if (arg4.aByteArray45 == null || arg4.aByteArray45.length < this.anInt6136) {
				arg3.aByteArray45 = arg4.aByteArray45 = new byte[this.anInt6136];
			} else {
				arg3.aByteArray45 = arg4.aByteArray45;
			}
			for (local207 = 0; local207 < this.anInt6136; local207++) {
				arg3.aByteArray45[local207] = this.aByteArray45[local207];
			}
		} else {
			arg3.aByteArray45 = this.aByteArray45;
		}
		if (Static481.method7140(arg0, this.anInt6106)) {
			if (arg2) {
				arg3.aByte61 = (byte) (arg3.aByte61 | 0x2);
			}
			arg3.aClass268_8 = arg4.aClass268_8;
			arg3.aClass268_8.anInterface9_6 = this.aClass268_8.anInterface9_6;
			arg3.aClass268_8.aByte88 = this.aClass268_8.aByte88;
		} else if (Static537.method7584(this.anInt6106, arg0)) {
			arg3.aClass268_8 = this.aClass268_8;
		} else {
			arg3.aClass268_8 = null;
		}
		@Pc(560) int local560;
		if (Static627.method8456(this.anInt6106, arg0)) {
			if (arg4.aShortArray61 == null || arg4.aShortArray61.length < this.anInt6100) {
				local207 = this.anInt6100;
				arg3.aShortArray63 = arg4.aShortArray63 = new short[local207];
				arg3.aShortArray68 = arg4.aShortArray68 = new short[local207];
				arg3.aShortArray61 = arg4.aShortArray61 = new short[local207];
			} else {
				arg3.aShortArray61 = arg4.aShortArray61;
				arg3.aShortArray63 = arg4.aShortArray63;
				arg3.aShortArray68 = arg4.aShortArray68;
			}
			if (this.aClass9_1 == null) {
				for (local207 = 0; local207 < this.anInt6100; local207++) {
					arg3.aShortArray61[local207] = this.aShortArray61[local207];
					arg3.aShortArray63[local207] = this.aShortArray63[local207];
					arg3.aShortArray68[local207] = this.aShortArray68[local207];
				}
			} else {
				if (arg4.aClass9_1 == null) {
					arg4.aClass9_1 = new Class9();
				}
				@Pc(548) Class9 local548 = arg3.aClass9_1 = arg4.aClass9_1;
				if (local548.aShortArray2 == null || local548.aShortArray2.length < this.anInt6100) {
					local560 = this.anInt6100;
					local548.aShortArray1 = new short[local560];
					local548.aShortArray3 = new short[local560];
					local548.aByteArray2 = new byte[local560];
					local548.aShortArray2 = new short[local560];
				}
				for (local560 = 0; local560 < this.anInt6100; local560++) {
					arg3.aShortArray61[local560] = this.aShortArray61[local560];
					arg3.aShortArray63[local560] = this.aShortArray63[local560];
					arg3.aShortArray68[local560] = this.aShortArray68[local560];
					local548.aShortArray2[local560] = this.aClass9_1.aShortArray2[local560];
					local548.aShortArray1[local560] = this.aClass9_1.aShortArray1[local560];
					local548.aShortArray3[local560] = this.aClass9_1.aShortArray3[local560];
					local548.aByteArray2[local560] = this.aClass9_1.aByteArray2[local560];
				}
			}
			arg3.aByteArray44 = this.aByteArray44;
		} else {
			arg3.aShortArray61 = this.aShortArray61;
			arg3.aClass9_1 = this.aClass9_1;
			arg3.aByteArray44 = this.aByteArray44;
			arg3.aShortArray63 = this.aShortArray63;
			arg3.aShortArray68 = this.aShortArray68;
		}
		if (Static14.method6446(this.anInt6106, arg0)) {
			if (arg2) {
				arg3.aByte61 = (byte) (arg3.aByte61 | 0x4);
			}
			arg3.aClass268_7 = arg4.aClass268_7;
			arg3.aClass268_7.anInterface9_6 = this.aClass268_7.anInterface9_6;
			arg3.aClass268_7.aByte88 = this.aClass268_7.aByte88;
		} else if (Static284.method4804(arg0, this.anInt6106)) {
			arg3.aClass268_7 = this.aClass268_7;
		} else {
			arg3.aClass268_7 = null;
		}
		if (Static335.method5420(this.anInt6106, arg0)) {
			if (arg4.aFloatArray56 == null || arg4.aFloatArray56.length < this.anInt6136) {
				local207 = this.anInt6100;
				arg3.aFloatArray57 = arg4.aFloatArray57 = new float[local207];
				arg3.aFloatArray56 = arg4.aFloatArray56 = new float[local207];
			} else {
				arg3.aFloatArray57 = arg4.aFloatArray57;
				arg3.aFloatArray56 = arg4.aFloatArray56;
			}
			for (local207 = 0; local207 < this.anInt6100; local207++) {
				arg3.aFloatArray56[local207] = this.aFloatArray56[local207];
				arg3.aFloatArray57[local207] = this.aFloatArray57[local207];
			}
		} else {
			arg3.aFloatArray57 = this.aFloatArray57;
			arg3.aFloatArray56 = this.aFloatArray56;
		}
		if (Static279.method4730(this.anInt6106, arg0)) {
			if (arg2) {
				arg3.aByte61 = (byte) (arg3.aByte61 | 0x8);
			}
			arg3.aClass268_10 = arg4.aClass268_10;
			arg3.aClass268_10.aByte88 = this.aClass268_10.aByte88;
			arg3.aClass268_10.anInterface9_6 = this.aClass268_10.anInterface9_6;
		} else if (Static107.method2393(arg0, this.anInt6106)) {
			arg3.aClass268_10 = this.aClass268_10;
		} else {
			arg3.aClass268_10 = null;
		}
		if (Static359.method5652(this.anInt6106, arg0)) {
			if (arg4.aShortArray69 == null || this.anInt6136 > arg4.aShortArray69.length) {
				local207 = this.anInt6136;
				arg3.aShortArray65 = arg4.aShortArray65 = new short[local207];
				arg3.aShortArray69 = arg4.aShortArray69 = new short[local207];
				arg3.aShortArray70 = arg4.aShortArray70 = new short[local207];
			} else {
				arg3.aShortArray65 = arg4.aShortArray65;
				arg3.aShortArray70 = arg4.aShortArray70;
				arg3.aShortArray69 = arg4.aShortArray69;
			}
			for (local207 = 0; local207 < this.anInt6136; local207++) {
				arg3.aShortArray69[local207] = this.aShortArray69[local207];
				arg3.aShortArray70[local207] = this.aShortArray70[local207];
				arg3.aShortArray65[local207] = this.aShortArray65[local207];
			}
		} else {
			arg3.aShortArray69 = this.aShortArray69;
			arg3.aShortArray65 = this.aShortArray65;
			arg3.aShortArray70 = this.aShortArray70;
		}
		if (Static289.method4832(this.anInt6106, arg0)) {
			if (arg2) {
				arg3.aByte61 = (byte) (arg3.aByte61 | 0x10);
			}
			arg3.aClass320_1 = arg4.aClass320_1;
			arg3.aClass320_1.anInterface23_5 = this.aClass320_1.anInterface23_5;
		} else if (Static136.method2946(this.anInt6106, arg0)) {
			arg3.aClass320_1 = this.aClass320_1;
		} else {
			arg3.aClass320_1 = null;
		}
		if (Static569.method7901(arg0, this.anInt6106)) {
			if (arg4.aShortArray71 == null || this.anInt6136 > arg4.aShortArray71.length) {
				local207 = this.anInt6136;
				arg3.aShortArray71 = arg4.aShortArray71 = new short[local207];
			} else {
				arg3.aShortArray71 = arg4.aShortArray71;
			}
			for (local207 = 0; local207 < this.anInt6136; local207++) {
				arg3.aShortArray71[local207] = this.aShortArray71[local207];
			}
		} else {
			arg3.aShortArray71 = this.aShortArray71;
		}
		if (!Static307.method5074(arg0, this.anInt6106)) {
			arg3.aClass122Array1 = this.aClass122Array1;
		} else if (arg4.aClass122Array1 == null || arg4.aClass122Array1.length < this.anInt6152) {
			local207 = this.anInt6152;
			arg3.aClass122Array1 = arg4.aClass122Array1 = new Class122[local207];
			for (local560 = 0; local560 < this.anInt6152; local560++) {
				arg3.aClass122Array1[local560] = this.aClass122Array1[local560].method3531();
			}
		} else {
			arg3.aClass122Array1 = arg4.aClass122Array1;
			for (local207 = 0; local207 < this.anInt6152; local207++) {
				arg3.aClass122Array1[local207].method3530(this.aClass122Array1[local207]);
			}
		}
		if (this.aBoolean437) {
			arg3.aShort66 = this.aShort66;
			arg3.aShort72 = this.aShort72;
			arg3.aShort71 = this.aShort71;
			arg3.aShort67 = this.aShort67;
			arg3.aShort69 = this.aShort69;
			arg3.aShort65 = this.aShort65;
			arg3.aShort64 = this.aShort64;
			arg3.aBoolean437 = true;
			arg3.aShort70 = this.aShort70;
		} else {
			arg3.aBoolean437 = false;
		}
		arg3.anIntArrayArray34 = this.anIntArrayArray34;
		arg3.anIntArrayArray32 = this.anIntArrayArray32;
		arg3.lb = this.lb;
		arg3.aClass238Array3 = this.aClass238Array3;
		arg3.aShortArray62 = this.aShortArray62;
		arg3.aClass219Array3 = this.aClass219Array3;
		arg3.aShortArray64 = this.aShortArray64;
		arg3.anIntArray356 = this.anIntArray356;
		arg3.anIntArrayArray33 = this.anIntArrayArray33;
		arg3.aShortArray66 = this.aShortArray66;
		arg3.anIntArray355 = this.anIntArray355;
		return arg3;
	}
}
