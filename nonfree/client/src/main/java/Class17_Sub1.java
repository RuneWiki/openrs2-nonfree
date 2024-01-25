import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!am", name = "q", descriptor = "[I")
	private int[] anIntArray10;

	@OriginalMember(owner = "client!am", name = "s", descriptor = "Lclient!lo;")
	private Interface15 anInterface15_2;

	@OriginalMember(owner = "client!am", name = "w", descriptor = "[I")
	private int[] anIntArray11;

	@OriginalMember(owner = "client!am", name = "x", descriptor = "[I")
	private int[] anIntArray12;

	@OriginalMember(owner = "client!am", name = "y", descriptor = "[S")
	private short[] aShortArray1;

	@OriginalMember(owner = "client!am", name = "C", descriptor = "[Lclient!hg;")
	private Class137[] aClass137Array1;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "S")
	private short aShort2;

	@OriginalMember(owner = "client!am", name = "G", descriptor = "I")
	private int anInt856;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "[S")
	private short[] aShortArray2;

	@OriginalMember(owner = "client!am", name = "J", descriptor = "[Lclient!fs;")
	private Class116[] aClass116Array1;

	@OriginalMember(owner = "client!am", name = "O", descriptor = "S")
	private short aShort3;

	@OriginalMember(owner = "client!am", name = "R", descriptor = "[F")
	private float[] aFloatArray20;

	@OriginalMember(owner = "client!am", name = "S", descriptor = "S")
	private short aShort4;

	@OriginalMember(owner = "client!am", name = "gb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!am", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!am", name = "nb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!am", name = "pb", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!am", name = "qb", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!am", name = "tb", descriptor = "[I")
	private int[] anIntArray13;

	@OriginalMember(owner = "client!am", name = "vb", descriptor = "Lclient!ju;")
	private Class179 aClass179_1;

	@OriginalMember(owner = "client!am", name = "Ab", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!am", name = "Fb", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!am", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray3;

	@OriginalMember(owner = "client!am", name = "Jb", descriptor = "S")
	private short aShort7;

	@OriginalMember(owner = "client!am", name = "Mb", descriptor = "[F")
	private float[] aFloatArray21;

	@OriginalMember(owner = "client!am", name = "Nb", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!am", name = "Ob", descriptor = "[Lclient!vea;")
	private Class353[] aClass353Array1;

	@OriginalMember(owner = "client!am", name = "Pb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!am", name = "Qb", descriptor = "[Lclient!qv;")
	private Class284[] aClass284Array1;

	@OriginalMember(owner = "client!am", name = "Rb", descriptor = "[S")
	private short[] aShortArray7;

	@OriginalMember(owner = "client!am", name = "Tb", descriptor = "Lclient!lca;")
	private Interface14 anInterface14_1;

	@OriginalMember(owner = "client!am", name = "Vb", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!am", name = "Wb", descriptor = "[S")
	private short[] aShortArray8;

	@OriginalMember(owner = "client!am", name = "Zb", descriptor = "[I")
	private int[] anIntArray14;

	@OriginalMember(owner = "client!am", name = "ac", descriptor = "[S")
	private short[] aShortArray9;

	@OriginalMember(owner = "client!am", name = "cc", descriptor = "B")
	private byte aByte5;

	@OriginalMember(owner = "client!am", name = "ec", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!am", name = "fc", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!am", name = "kc", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!am", name = "lc", descriptor = "[[I")
	private int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!am", name = "mc", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!am", name = "qc", descriptor = "[S")
	private short[] aShortArray10;

	@OriginalMember(owner = "client!am", name = "sc", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!am", name = "Bc", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!am", name = "db", descriptor = "I")
	private int anInt872 = 0;

	@OriginalMember(owner = "client!am", name = "cb", descriptor = "I")
	private int anInt871 = 0;

	@OriginalMember(owner = "client!am", name = "p", descriptor = "Z")
	private boolean aBoolean65 = false;

	@OriginalMember(owner = "client!am", name = "fb", descriptor = "I")
	private int anInt874 = 0;

	@OriginalMember(owner = "client!am", name = "Ub", descriptor = "I")
	private int anInt896 = 0;

	@OriginalMember(owner = "client!am", name = "D", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!am", name = "t", descriptor = "I")
	private int anInt849 = 0;

	@OriginalMember(owner = "client!am", name = "M", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!am", name = "dc", descriptor = "Z")
	private boolean aBoolean68 = true;

	@OriginalMember(owner = "client!am", name = "rc", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_1;

	@OriginalMember(owner = "client!am", name = "Ac", descriptor = "Lclient!jaa;")
	private Class164 aClass164_4;

	@OriginalMember(owner = "client!am", name = "X", descriptor = "Lclient!jaa;")
	private Class164 aClass164_1;

	@OriginalMember(owner = "client!am", name = "Sb", descriptor = "Lclient!jaa;")
	private Class164 aClass164_2;

	@OriginalMember(owner = "client!am", name = "gc", descriptor = "Lclient!jaa;")
	private Class164 aClass164_3;

	@OriginalMember(owner = "client!am", name = "zc", descriptor = "Lclient!aaa;")
	private Class2 aClass2_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class17_Sub1(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_1 = arg0;
		this.aClass164_4 = new Class164(null, 5126, 3, 0);
		this.aClass164_1 = new Class164(null, 5126, 2, 0);
		this.aClass164_2 = new Class164(null, 5126, 3, 0);
		this.aClass164_3 = new Class164(null, 5121, 4, 0);
		this.aClass2_1 = new Class2();
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!kw;Lclient!fu;IIII)V")
	public Class17_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass5_Sub2_1 = arg0;
		this.anInt897 = arg2;
		this.anInt856 = arg5;
		if (Static488.method7261(arg2, arg5)) {
			this.aClass164_4 = new Class164(null, 5126, 3, 0);
		}
		if (Static192.method3266(arg2, arg5)) {
			this.aClass164_1 = new Class164(null, 5126, 2, 0);
		}
		if (Static43.method1368(arg5, arg2)) {
			this.aClass164_2 = new Class164(null, 5126, 3, 0);
		}
		if (Static356.method5860(arg5, arg2)) {
			this.aClass164_3 = new Class164(null, 5121, 4, 0);
		}
		if (Static369.method5998(arg2, arg5)) {
			this.aClass2_1 = new Class2();
		}
		@Pc(108) Interface7 local108 = arg0.anInterface7_15;
		@Pc(112) int[] local112 = new int[arg1.anInt3252];
		this.anIntArray11 = new int[arg1.anInt3251 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt3252; local121++) {
			if (arg1.aByteArray40 == null || arg1.aByteArray40[local121] != 2) {
				if (arg1.aShortArray62 != null && arg1.aShortArray62[local121] != -1) {
					@Pc(153) Class195 local153 = local108.method8118(arg1.aShortArray62[local121] & 0xFFFF);
					if (((this.anInt856 & 0x40) == 0 || !local153.aBoolean365) && local153.aBoolean369) {
						continue;
					}
				}
				local112[this.anInt874++] = local121;
				this.anIntArray11[arg1.aShortArray60[local121]]++;
				this.anIntArray11[arg1.aShortArray61[local121]]++;
				this.anIntArray11[arg1.aShortArray63[local121]]++;
			}
		}
		this.anInt849 = this.anInt874;
		@Pc(226) long[] local226 = new long[this.anInt874];
		@Pc(235) boolean local235 = (this.anInt897 & 0x100) != 0;
		@Pc(247) int local247;
		@Pc(260) int local260;
		@Pc(443) int local443;
		for (@Pc(237) int local237 = 0; local237 < this.anInt874; local237++) {
			@Pc(243) int local243 = local112[local237];
			@Pc(245) Class195 local245 = null;
			local247 = 0;
			@Pc(249) byte local249 = 0;
			@Pc(251) byte local251 = 0;
			@Pc(253) byte local253 = 0;
			if (arg1.aClass66Array1 != null) {
				@Pc(258) boolean local258 = false;
				for (local260 = 0; local260 < arg1.aClass66Array1.length; local260++) {
					@Pc(267) Class66 local267 = arg1.aClass66Array1[local260];
					if (local243 == local267.anInt2184) {
						@Pc(280) Class159 local280 = Static269.method4430(local267.anInt2189);
						if (local280.aBoolean305) {
							local258 = true;
						}
						if (local280.anInt4548 != -1) {
							@Pc(295) Class195 local295 = local108.method8118(local280.anInt4548);
							if (local295.anInt5424 == 2) {
								this.aBoolean67 = true;
							}
						}
					}
				}
				if (local258) {
					local226[local237] = Long.MAX_VALUE;
					this.anInt849--;
					continue;
				}
			}
			@Pc(326) short local326 = -1;
			if (arg1.aShortArray62 != null) {
				local326 = arg1.aShortArray62[local243];
				if (local326 != -1) {
					local245 = local108.method8118(local326 & 0xFFFF);
					if ((this.anInt856 & 0x40) != 0 && local245.aBoolean365) {
						local326 = -1;
						local245 = null;
					} else {
						if (local245.aByte80 != 0 || local245.aByte81 != 0) {
							this.aBoolean66 = true;
						}
						local251 = local245.aByte83;
						local253 = local245.aByte82;
					}
				}
			}
			@Pc(399) boolean local399 = arg1.aByteArray44 != null && arg1.aByteArray44[local243] != 0 || local245 != null && local245.anInt5424 != 0;
			if ((local235 || local399) && arg1.aByteArray43 != null) {
				local247 += arg1.aByteArray43[local243] << 17;
			}
			if (local399) {
				local247 += 65536;
			}
			local247 += (local251 & 0xFF) << 8;
			local247 += local253 & 0xFF;
			local443 = local249 + ((local326 & 0xFFFF) << 16);
			@Pc(449) int local449 = local443 + (local237 & 0xFFFF);
			local226[local237] = ((long) local247 << 32) + ((long) local449);
			this.aBoolean67 |= local399;
			this.aBoolean66 |= local245 != null && (local245.aByte80 != 0 || local245.aByte81 != 0);
		}
		Static311.method6195(local112, local226);
		this.anIntArray13 = arg1.anIntArray166;
		this.anInt896 = arg1.anInt3256;
		this.aShortArray8 = arg1.aShortArray56;
		this.anIntArray12 = arg1.anIntArray169;
		this.anIntArray14 = arg1.anIntArray168;
		this.anInt871 = arg1.anInt3251;
		@Pc(526) Class144[] local526 = new Class144[this.anInt871];
		this.aClass353Array1 = arg1.aClass353Array2;
		this.aClass284Array1 = arg1.aClass284Array2;
		@Pc(554) int local554;
		@Pc(568) int local568;
		@Pc(610) int local610;
		if (arg1.aClass66Array1 != null) {
			this.anInt913 = arg1.aClass66Array1.length;
			this.aClass116Array1 = new Class116[this.anInt913];
			this.aClass137Array1 = new Class137[this.anInt913];
			for (local554 = 0; local554 < this.anInt913; local554++) {
				@Pc(561) Class66 local561 = arg1.aClass66Array1[local554];
				@Pc(566) Class159 local566 = Static269.method4430(local561.anInt2189);
				local568 = -1;
				for (@Pc(570) int local570 = 0; local570 < this.anInt874; local570++) {
					if (local561.anInt2184 == local112[local570]) {
						local568 = local570;
						break;
					}
				}
				if (local568 == -1) {
					throw new RuntimeException();
				}
				local610 = Static159.anIntArray159[arg1.aShortArray57[local561.anInt2184] & 0xFFFF] & 0xFFFFFF;
				@Pc(628) int local628 = local610 | 255 - (arg1.aByteArray44 == null ? 0 : arg1.aByteArray44[local561.anInt2184]) << 24;
				this.aClass137Array1[local554] = new Class137(local568, arg1.aShortArray60[local561.anInt2184], arg1.aShortArray61[local561.anInt2184], arg1.aShortArray63[local561.anInt2184], local566.anInt4553, local566.anInt4550, local566.anInt4548, local566.anInt4549, local566.anInt4551, local566.aBoolean305, local566.aBoolean304, local561.anInt2185);
				this.aClass116Array1[local554] = new Class116(local628);
			}
		}
		local554 = this.anInt874 * 3;
		this.aFloatArray21 = new float[local554];
		this.aByteArray3 = new byte[local554];
		this.aShortArray9 = new short[this.anInt874];
		this.aShortArray6 = new short[local554];
		this.aShortArray2 = new short[this.anInt874];
		this.aShortArray5 = new short[local554];
		if (arg1.aShortArray58 != null) {
			this.aShortArray10 = new short[this.anInt874];
		}
		this.aShort4 = (short) arg3;
		Static381.aLongArray16 = new long[local554];
		this.aShortArray1 = new short[this.anInt874];
		this.aShort10 = (short) arg4;
		this.aShortArray3 = new short[this.anInt874];
		this.aShortArray4 = new short[local554];
		this.lb = new short[local554];
		this.aShortArray7 = new short[this.anInt874];
		this.aByteArray4 = new byte[this.anInt874];
		this.aFloatArray20 = new float[local554];
		local247 = 0;
		for (local443 = 0; local443 < arg1.anInt3251; local443++) {
			local568 = this.anIntArray11[local443];
			this.anIntArray11[local443] = local247;
			local247 += local568;
			local526[local443] = new Class144();
		}
		this.anIntArray11[arg1.anInt3251] = local247;
		@Pc(810) Class168 local810 = Static545.method8459(this.anInt874, arg1, local112);
		@Pc(814) Class313[] local814 = new Class313[arg1.anInt3252];
		@Pc(855) int local855;
		@Pc(866) int local866;
		@Pc(887) int local887;
		@Pc(898) int local898;
		@Pc(906) int local906;
		@Pc(915) int local915;
		@Pc(833) short local833;
		@Pc(844) int local844;
		for (local610 = 0; local610 < arg1.anInt3252; local610++) {
			@Pc(823) short local823 = arg1.aShortArray60[local610];
			@Pc(828) short local828 = arg1.aShortArray61[local610];
			local833 = arg1.aShortArray63[local610];
			local844 = this.anIntArray13[local828] - this.anIntArray13[local823];
			local855 = this.anIntArray12[local828] - this.anIntArray12[local823];
			local866 = this.anIntArray14[local828] - this.anIntArray14[local823];
			@Pc(877) int local877 = this.anIntArray13[local833] - this.anIntArray13[local823];
			local887 = this.anIntArray12[local833] - this.anIntArray12[local823];
			local898 = this.anIntArray14[local833] - this.anIntArray14[local823];
			local906 = local855 * local898 - local866 * local887;
			local915 = local877 * local866 - local898 * local844;
			@Pc(924) int local924 = local887 * local844 - local855 * local877;
			while (local906 > 8192 || local915 > 8192 || local924 > 8192 || local906 < -8192 || local915 < -8192 || local924 < -8192) {
				local915 >>= 0x1;
				local924 >>= 0x1;
				local906 >>= 0x1;
			}
			@Pc(979) int local979 = (int) Math.sqrt((double) (local924 * local924 + local915 * local915 + local906 * local906));
			if (local979 <= 0) {
				local979 = 1;
			}
			local906 = local906 * 256 / local979;
			local915 = local915 * 256 / local979;
			local924 = local924 * 256 / local979;
			@Pc(1011) byte local1011 = arg1.aByteArray40 == null ? 0 : arg1.aByteArray40[local610];
			if (local1011 == 0) {
				@Pc(1041) Class144 local1041 = local526[local823];
				local1041.anInt4219++;
				local1041.anInt4216 += local906;
				local1041.anInt4215 += local924;
				local1041.anInt4217 += local915;
				@Pc(1069) Class144 local1069 = local526[local828];
				local1069.anInt4219++;
				local1069.anInt4217 += local915;
				local1069.anInt4216 += local906;
				local1069.anInt4215 += local924;
				@Pc(1097) Class144 local1097 = local526[local833];
				local1097.anInt4219++;
				local1097.anInt4217 += local915;
				local1097.anInt4216 += local906;
				local1097.anInt4215 += local924;
			} else if (local1011 == 1) {
				@Pc(1026) Class313 local1026 = local814[local610] = new Class313();
				local1026.anInt9077 = local915;
				local1026.anInt9079 = local924;
				local1026.anInt9078 = local906;
			}
		}
		@Pc(1134) int local1134;
		@Pc(1177) short local1177;
		for (local260 = 0; local260 < this.anInt874; local260++) {
			local1134 = local112[local260];
			@Pc(1141) int local1141 = arg1.aShortArray57[local1134] & 0xFFFF;
			if (arg1.aByteArray45 == null) {
				local844 = -1;
			} else {
				local844 = arg1.aByteArray45[local1134];
			}
			if (arg1.aByteArray44 == null) {
				local855 = 0;
			} else {
				local855 = arg1.aByteArray44[local1134] & 0xFF;
			}
			local1177 = arg1.aShortArray62 == null ? -1 : arg1.aShortArray62[local1134];
			if (local1177 != -1 && (this.anInt856 & 0x40) != 0) {
				@Pc(1196) Class195 local1196 = local108.method8118(local1177 & 0xFFFF);
				if (local1196.aBoolean365) {
					local1177 = -1;
				}
			}
			@Pc(1203) float local1203 = 0.0F;
			@Pc(1205) float local1205 = 0.0F;
			@Pc(1207) float local1207 = 0.0F;
			@Pc(1209) float local1209 = 0.0F;
			@Pc(1211) float local1211 = 0.0F;
			@Pc(1213) float local1213 = 0.0F;
			@Pc(1215) byte local1215 = 0;
			@Pc(1217) byte local1217 = 0;
			@Pc(1219) int local1219 = 0;
			@Pc(1252) byte local1252;
			@Pc(1269) short local1269;
			@Pc(2059) short local2059;
			@Pc(2064) short local2064;
			if (local1177 != -1) {
				if (local844 == -1) {
					local1215 = 1;
					local1207 = 1.0F;
					local1211 = 0.0F;
					local1213 = 0.0F;
					local1209 = 1.0F;
					local1217 = 2;
					local1205 = 1.0F;
					local1203 = 0.0F;
				} else {
					local844 &= 0xFF;
					local1252 = arg1.aByteArray46[local844];
					@Pc(1259) short local1259;
					@Pc(1264) short local1264;
					@Pc(1302) float local1302;
					@Pc(1528) float local1528;
					@Pc(1536) float local1536;
					@Pc(1632) float local1632;
					@Pc(1640) float local1640;
					@Pc(1648) float local1648;
					@Pc(1671) float local1671;
					@Pc(1694) float local1694;
					@Pc(1717) float local1717;
					if (local1252 == 0) {
						local1259 = arg1.aShortArray60[local1134];
						local1264 = arg1.aShortArray61[local1134];
						local1269 = arg1.aShortArray63[local1134];
						local2059 = arg1.aShortArray64[local844];
						local2064 = arg1.aShortArray59[local844];
						@Pc(2069) short local2069 = arg1.aShortArray55[local844];
						@Pc(2075) float local2075 = (float) arg1.anIntArray166[local2059];
						@Pc(2081) float local2081 = (float) arg1.anIntArray169[local2059];
						local1302 = arg1.anIntArray168[local2059];
						local1528 = (float) arg1.anIntArray166[local2064] - local2075;
						local1536 = (float) arg1.anIntArray169[local2064] - local2081;
						@Pc(2112) float local2112 = (float) arg1.anIntArray168[local2064] - local1302;
						@Pc(2121) float local2121 = (float) arg1.anIntArray166[local2069] - local2075;
						@Pc(2130) float local2130 = (float) arg1.anIntArray169[local2069] - local2081;
						@Pc(2139) float local2139 = (float) arg1.anIntArray168[local2069] - local1302;
						@Pc(2148) float local2148 = (float) arg1.anIntArray166[local1259] - local2075;
						@Pc(2156) float local2156 = (float) arg1.anIntArray169[local1259] - local2081;
						@Pc(2165) float local2165 = (float) arg1.anIntArray168[local1259] - local1302;
						@Pc(2174) float local2174 = (float) arg1.anIntArray166[local1264] - local2075;
						@Pc(2182) float local2182 = (float) arg1.anIntArray169[local1264] - local2081;
						local1632 = (float) arg1.anIntArray168[local1264] - local1302;
						local1640 = (float) arg1.anIntArray166[local1269] - local2075;
						local1648 = (float) arg1.anIntArray169[local1269] - local2081;
						local1671 = (float) arg1.anIntArray168[local1269] - local1302;
						local1694 = local1536 * local2139 - local2130 * local2112;
						local1717 = local2112 * local2121 - local2139 * local1528;
						@Pc(2240) float local2240 = local1528 * local2130 - local2121 * local1536;
						@Pc(2249) float local2249 = local2240 * local2130 - local1717 * local2139;
						@Pc(2257) float local2257 = local1694 * local2139 - local2240 * local2121;
						@Pc(2266) float local2266 = local2121 * local1717 - local2130 * local1694;
						@Pc(2280) float local2280 = 1.0F / (local1536 * local2257 + local2249 * local1528 + local2112 * local2266);
						local1211 = local2280 * (local2249 * local1640 + local2257 * local1648 + local1671 * local2266);
						local1203 = local2280 * (local2165 * local2266 + local2156 * local2257 + local2148 * local2249);
						local1207 = (local2174 * local2249 + local2257 * local2182 + local1632 * local2266) * local2280;
						@Pc(2330) float local2330 = local1694 * local2112 - local2240 * local1528;
						@Pc(2338) float local2338 = local2240 * local1536 - local2112 * local1717;
						@Pc(2347) float local2347 = local1528 * local1717 - local1536 * local1694;
						@Pc(2361) float local2361 = 1.0F / (local2347 * local2139 + local2330 * local2130 + local2338 * local2121);
						local1213 = (local1671 * local2347 + local2338 * local1640 + local2330 * local1648) * local2361;
						local1205 = local2361 * (local2330 * local2156 + local2148 * local2338 + local2165 * local2347);
						local1209 = local2361 * (local2330 * local2182 + local2174 * local2338 + local1632 * local2347);
					} else {
						local1259 = arg1.aShortArray60[local1134];
						local1264 = arg1.aShortArray61[local1134];
						local1269 = arg1.aShortArray63[local1134];
						@Pc(1274) int local1274 = local810.anIntArray250[local844];
						@Pc(1279) int local1279 = local810.anIntArray249[local844];
						@Pc(1284) int local1284 = local810.anIntArray248[local844];
						@Pc(1289) float[] local1289 = local810.aFloatArrayArray10[local844];
						@Pc(1294) byte local1294 = arg1.aByteArray42[local844];
						local1302 = (float) arg1.anIntArray171[local844] / 256.0F;
						if (local1252 == 1) {
							local1528 = (float) arg1.anIntArray174[local844] / 1024.0F;
							Static185.method4675(arg1.anIntArray169[local1259], Static210.aFloatArray27, local1284, local1294, local1274, local1302, local1528, arg1.anIntArray168[local1259], arg1.anIntArray166[local1259], local1289, local1279);
							local1203 = Static210.aFloatArray27[0];
							local1205 = Static210.aFloatArray27[1];
							Static185.method4675(arg1.anIntArray169[local1264], Static210.aFloatArray27, local1284, local1294, local1274, local1302, local1528, arg1.anIntArray168[local1264], arg1.anIntArray166[local1264], local1289, local1279);
							local1209 = Static210.aFloatArray27[1];
							local1207 = Static210.aFloatArray27[0];
							Static185.method4675(arg1.anIntArray169[local1269], Static210.aFloatArray27, local1284, local1294, local1274, local1302, local1528, arg1.anIntArray168[local1269], arg1.anIntArray166[local1269], local1289, local1279);
							local1211 = Static210.aFloatArray27[0];
							local1213 = Static210.aFloatArray27[1];
							local1536 = local1528 / 2.0F;
							if ((local1294 & 0x1) == 0) {
								if (local1211 - local1203 > local1536) {
									local1211 -= local1528;
									local1217 = 1;
								} else if (local1203 - local1211 > local1536) {
									local1211 += local1528;
									local1217 = 2;
								}
								if (local1207 - local1203 > local1536) {
									local1215 = 1;
									local1207 -= local1528;
								} else if (local1203 - local1207 > local1536) {
									local1207 += local1528;
									local1215 = 2;
								}
							} else {
								if (local1209 - local1205 > local1536) {
									local1209 -= local1528;
									local1215 = 1;
								} else if (local1205 - local1209 > local1536) {
									local1215 = 2;
									local1209 += local1528;
								}
								if (local1536 < local1213 - local1205) {
									local1217 = 1;
									local1213 -= local1528;
								} else if (local1205 - local1213 > local1536) {
									local1217 = 2;
									local1213 += local1528;
								}
							}
						} else if (local1252 == 2) {
							local1528 = (float) arg1.anIntArray172[local844] / 256.0F;
							local1536 = (float) arg1.anIntArray167[local844] / 256.0F;
							@Pc(1546) int local1546 = arg1.anIntArray166[local1264] - arg1.anIntArray166[local1259];
							@Pc(1556) int local1556 = arg1.anIntArray169[local1264] - arg1.anIntArray169[local1259];
							@Pc(1566) int local1566 = arg1.anIntArray168[local1264] - arg1.anIntArray168[local1259];
							@Pc(1576) int local1576 = arg1.anIntArray166[local1269] - arg1.anIntArray166[local1259];
							@Pc(1587) int local1587 = arg1.anIntArray169[local1269] - arg1.anIntArray169[local1259];
							@Pc(1598) int local1598 = arg1.anIntArray168[local1269] - arg1.anIntArray168[local1259];
							@Pc(1607) int local1607 = local1556 * local1598 - local1587 * local1566;
							@Pc(1616) int local1616 = local1576 * local1566 - local1598 * local1546;
							@Pc(1624) int local1624 = local1546 * local1587 - local1556 * local1576;
							local1632 = 64.0F / (float) arg1.anIntArray173[local844];
							local1640 = 64.0F / (float) arg1.anIntArray170[local844];
							local1648 = 64.0F / (float) arg1.anIntArray174[local844];
							local1671 = ((float) local1624 * local1289[2] + local1289[0] * (float) local1607 + local1289[1] * (float) local1616) / local1632;
							local1694 = (local1289[3] * (float) local1607 + (float) local1616 * local1289[4] + (float) local1624 * local1289[5]) / local1640;
							local1717 = ((float) local1616 * local1289[7] + local1289[6] * (float) local1607 + (float) local1624 * local1289[8]) / local1648;
							local1219 = Static263.method4331(local1717, local1671, local1694);
							Static567.method8637(arg1.anIntArray166[local1259], Static210.aFloatArray27, local1528, local1289, local1274, local1284, local1219, arg1.anIntArray169[local1259], local1294, arg1.anIntArray168[local1259], local1279, local1536, local1302);
							local1205 = Static210.aFloatArray27[1];
							local1203 = Static210.aFloatArray27[0];
							Static567.method8637(arg1.anIntArray166[local1264], Static210.aFloatArray27, local1528, local1289, local1274, local1284, local1219, arg1.anIntArray169[local1264], local1294, arg1.anIntArray168[local1264], local1279, local1536, local1302);
							local1209 = Static210.aFloatArray27[1];
							local1207 = Static210.aFloatArray27[0];
							Static567.method8637(arg1.anIntArray166[local1269], Static210.aFloatArray27, local1528, local1289, local1274, local1284, local1219, arg1.anIntArray169[local1269], local1294, arg1.anIntArray168[local1269], local1279, local1536, local1302);
							local1211 = Static210.aFloatArray27[0];
							local1213 = Static210.aFloatArray27[1];
						} else if (local1252 == 3) {
							Static322.method5266(local1302, local1279, Static210.aFloatArray27, arg1.anIntArray168[local1259], local1274, arg1.anIntArray169[local1259], local1284, local1294, arg1.anIntArray166[local1259], local1289);
							local1205 = Static210.aFloatArray27[1];
							local1203 = Static210.aFloatArray27[0];
							Static322.method5266(local1302, local1279, Static210.aFloatArray27, arg1.anIntArray168[local1264], local1274, arg1.anIntArray169[local1264], local1284, local1294, arg1.anIntArray166[local1264], local1289);
							local1207 = Static210.aFloatArray27[0];
							local1209 = Static210.aFloatArray27[1];
							Static322.method5266(local1302, local1279, Static210.aFloatArray27, arg1.anIntArray168[local1269], local1274, arg1.anIntArray169[local1269], local1284, local1294, arg1.anIntArray166[local1269], local1289);
							local1211 = Static210.aFloatArray27[0];
							local1213 = Static210.aFloatArray27[1];
							if ((local1294 & 0x1) == 0) {
								if (local1207 - local1203 > 0.5F) {
									local1207--;
									local1215 = 1;
								} else if (local1203 - local1207 > 0.5F) {
									local1207++;
									local1215 = 2;
								}
								if (local1211 - local1203 > 0.5F) {
									local1211--;
									local1217 = 1;
								} else if (local1203 - local1211 > 0.5F) {
									local1217 = 2;
									local1211++;
								}
							} else {
								if (local1213 - local1205 > 0.5F) {
									local1213--;
									local1217 = 1;
								} else if (local1205 - local1213 > 0.5F) {
									local1217 = 2;
									local1213++;
								}
								if (local1209 - local1205 > 0.5F) {
									local1215 = 1;
									local1209--;
								} else if (local1205 - local1209 > 0.5F) {
									local1215 = 2;
									local1209++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray40 == null) {
				local1252 = 0;
			} else {
				local1252 = arg1.aByteArray40[local1134];
			}
			if (local1252 == 0) {
				@Pc(2441) long local2441 = (long) (local844 << 2) + ((long) local855 + (long) (local1219 << 24) + (long) (local1141 << 8) << 32);
				local1269 = arg1.aShortArray60[local1134];
				local2059 = arg1.aShortArray61[local1134];
				local2064 = arg1.aShortArray63[local1134];
				@Pc(2460) Class144 local2460 = local526[local1269];
				this.aShortArray3[local260] = this.method964(local2460.anInt4215, local1203, local2460.anInt4217, local2460.anInt4219, local2460.anInt4216, local2441, local1205, arg1, local1269);
				@Pc(2484) Class144 local2484 = local526[local2059];
				this.aShortArray7[local260] = this.method964(local2484.anInt4215, local1207, local2484.anInt4217, local2484.anInt4219, local2484.anInt4216, (long) local1215 + local2441, local1209, arg1, local2059);
				@Pc(2511) Class144 local2511 = local526[local2064];
				this.aShortArray1[local260] = this.method964(local2511.anInt4215, local1211, local2511.anInt4217, local2511.anInt4219, local2511.anInt4216, local2441 + (long) local1217, local1213, arg1, local2064);
			} else if (local1252 == 1) {
				@Pc(2543) Class313 local2543 = local814[local1134];
				@Pc(2585) long local2585 = ((long) local855 + (long) (local1219 << 24) + (long) (local1141 << 8) << 32) + (long) ((local2543.anInt9078 > 0 ? 1024 : 2048) + (local844 << 2) + (local2543.anInt9077 - -256 << 12) + (local2543.anInt9079 - -256 << 22));
				this.aShortArray3[local260] = this.method964(local2543.anInt9079, local1203, local2543.anInt9077, 0, local2543.anInt9078, local2585, local1205, arg1, arg1.aShortArray60[local1134]);
				this.aShortArray7[local260] = this.method964(local2543.anInt9079, local1207, local2543.anInt9077, 0, local2543.anInt9078, (long) local1215 + local2585, local1209, arg1, arg1.aShortArray61[local1134]);
				this.aShortArray1[local260] = this.method964(local2543.anInt9079, local1211, local2543.anInt9077, 0, local2543.anInt9078, local2585 + (long) local1217, local1213, arg1, arg1.aShortArray63[local1134]);
			}
			if (arg1.aByteArray44 != null) {
				this.aByteArray4[local260] = arg1.aByteArray44[local1134];
			}
			if (arg1.aShortArray58 != null) {
				this.aShortArray10[local260] = arg1.aShortArray58[local1134];
			}
			this.aShortArray9[local260] = arg1.aShortArray57[local1134];
			this.aShortArray2[local260] = local1177;
		}
		local1134 = 0;
		local833 = -10000;
		for (local844 = 0; local844 < this.anInt849; local844++) {
			@Pc(2710) short local2710 = this.aShortArray2[local844];
			if (local833 != local2710) {
				local833 = local2710;
				local1134++;
			}
		}
		this.anIntArray10 = new int[local1134 + 1];
		local1134 = 0;
		local833 = -10000;
		for (local855 = 0; local855 < this.anInt849; local855++) {
			local1177 = this.aShortArray2[local855];
			if (local833 != local1177) {
				local833 = local1177;
				this.anIntArray10[local1134++] = local855;
			}
		}
		this.anIntArray10[local1134] = this.anInt849;
		Static381.aLongArray16 = null;
		this.lb = Static263.method4332(this.lb, this.anInt872);
		this.aShortArray5 = Static263.method4332(this.aShortArray5, this.anInt872);
		this.aShortArray4 = Static263.method4332(this.aShortArray4, this.anInt872);
		this.aByteArray3 = Static456.method6997(this.aByteArray3, this.anInt872);
		this.aFloatArray21 = Static409.method6494(this.aFloatArray21, this.anInt872);
		this.aFloatArray20 = Static409.method6494(this.aFloatArray20, this.anInt872);
		if (arg1.anIntArray164 != null && Static632.method8661(arg2, this.anInt856)) {
			this.anIntArrayArray3 = arg1.method2928(false);
		}
		if (arg1.aClass66Array1 != null && Static594.method8339(this.anInt856, arg2)) {
			this.anIntArrayArray4 = arg1.method2938();
		}
		if (arg1.anIntArray165 != null && Static493.method7317(arg2, this.anInt856)) {
			local866 = 0;
			@Pc(2859) int[] local2859 = new int[256];
			for (local887 = 0; local887 < this.anInt874; local887++) {
				local898 = arg1.anIntArray165[local112[local887]];
				if (local898 >= 0) {
					@Pc(2879) int local2879 = local2859[local898]++;
					if (local898 > local866) {
						local866 = local898;
					}
				}
			}
			this.anIntArrayArray5 = new int[local866 + 1][];
			for (local898 = 0; local898 <= local866; local898++) {
				this.anIntArrayArray5[local898] = new int[local2859[local898]];
				local2859[local898] = 0;
			}
			for (local906 = 0; local906 < this.anInt874; local906++) {
				local915 = arg1.anIntArray165[local112[local906]];
				if (local915 >= 0) {
					this.anIntArrayArray5[local915][local2859[local915]++] = local906;
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "()V")
	@Override
	protected void method5427() {
	}

	@OriginalMember(owner = "client!am", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		if (this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
		}
		this.aShort4 = (short) arg0;
	}

	@OriginalMember(owner = "client!am", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static513.anInt8871 = 0;
			local26 = 0;
			Static515.anInt8904 = 0;
			Static411.anInt7519 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray3.length > local38) {
					local52 = this.anIntArrayArray3[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local60]) != 0) {
							Static411.anInt7519 += this.anIntArray13[local60];
							Static513.anInt8871 += this.anIntArray12[local60];
							Static515.anInt8904 += this.anIntArray14[local60];
							local26++;
						}
					}
				}
			}
			if (local26 <= 0) {
				Static513.anInt8871 = arg3;
				Static411.anInt7519 = arg2;
				Static515.anInt8904 = arg4;
			} else {
				Static147.aBoolean190 = true;
				Static513.anInt8871 = arg3 + Static513.anInt8871 / local26;
				Static411.anInt7519 = Static411.anInt7519 / local26 + arg2;
				Static515.anInt8904 = Static515.anInt8904 / local26 + arg4;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg4 * arg7[2] + arg3 * arg7[1] + arg7[0] * arg2 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg7[7] * arg3 + arg7[6] * arg2 + 8192 >> 14;
				arg2 = local26;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray3.length > local32) {
					local250 = this.anIntArrayArray3[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local54]) != 0) {
							this.anIntArray13[local54] += arg2;
							this.anIntArray12[local54] += arg3;
							this.anIntArray14[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(370) int local370;
		@Pc(392) int local392;
		@Pc(419) int local419;
		@Pc(450) int local450;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(633) int local633;
		@Pc(658) int local658;
		@Pc(662) int local662;
		@Pc(670) int local670;
		@Pc(675) int local675;
		@Pc(679) int local679;
		@Pc(683) int local683;
		@Pc(685) int local685;
		@Pc(818) int[] local818;
		@Pc(820) int local820;
		@Pc(824) int local824;
		@Pc(828) int local828;
		@Pc(830) int local830;
		@Pc(956) int local956;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray3.length) {
						local250 = this.anIntArrayArray3[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray8 == null || (this.aShortArray8[local54] & arg6) != 0) {
								this.anIntArray13[local54] -= Static411.anInt7519;
								this.anIntArray12[local54] -= Static513.anInt8871;
								this.anIntArray14[local54] -= Static515.anInt8904;
								if (arg4 != 0) {
									local60 = Class21.anIntArray656[arg4];
									local370 = Class21.anIntArray655[arg4];
									local392 = local370 * this.anIntArray13[local54] + local60 * this.anIntArray12[local54] + 16383 >> 14;
									this.anIntArray12[local54] = local370 * this.anIntArray12[local54] + 16383 - this.anIntArray13[local54] * local60 >> 14;
									this.anIntArray13[local54] = local392;
								}
								if (arg2 != 0) {
									local60 = Class21.anIntArray656[arg2];
									local370 = Class21.anIntArray655[arg2];
									local392 = local370 * this.anIntArray12[local54] + 16383 - this.anIntArray14[local54] * local60 >> 14;
									this.anIntArray14[local54] = local60 * this.anIntArray12[local54] + this.anIntArray14[local54] * local370 + 16383 >> 14;
									this.anIntArray12[local54] = local392;
								}
								if (arg3 != 0) {
									local60 = Class21.anIntArray656[arg3];
									local370 = Class21.anIntArray655[arg3];
									local392 = local370 * this.anIntArray13[local54] + this.anIntArray14[local54] * local60 + 16383 >> 14;
									this.anIntArray14[local54] = local370 * this.anIntArray14[local54] + 16383 - local60 * this.anIntArray13[local54] >> 14;
									this.anIntArray13[local54] = local392;
								}
								this.anIntArray13[local54] += Static411.anInt7519;
								this.anIntArray12[local54] += Static513.anInt8871;
								this.anIntArray14[local54] += Static515.anInt8904;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray3.length > local38) {
							local52 = this.anIntArrayArray3[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray8 == null || (this.aShortArray8[local60] & arg6) != 0) {
									local370 = this.anIntArray11[local60];
									local392 = this.anIntArray11[local60 + 1];
									for (local419 = local370; local419 < local392; local419++) {
										local450 = this.aShortArray6[local419] - 1;
										if (local450 == -1) {
											break;
										}
										if (arg4 != 0) {
											local454 = Class21.anIntArray656[arg4];
											local458 = Class21.anIntArray655[arg4];
											local462 = local458 * this.lb[local450] + local454 * this.aShortArray5[local450] + 16383 >> 14;
											this.aShortArray5[local450] = (short) (this.aShortArray5[local450] * local458 + 16383 - this.lb[local450] * local454 >> 14);
											this.lb[local450] = (short) local462;
										}
										if (arg2 != 0) {
											local454 = Class21.anIntArray656[arg2];
											local458 = Class21.anIntArray655[arg2];
											local462 = local458 * this.aShortArray5[local450] + 16383 - local454 * this.aShortArray4[local450] >> 14;
											this.aShortArray4[local450] = (short) (this.aShortArray4[local450] * local458 + this.aShortArray5[local450] * local454 + 16383 >> 14);
											this.aShortArray5[local450] = (short) local462;
										}
										if (arg3 != 0) {
											local454 = Class21.anIntArray656[arg3];
											local458 = Class21.anIntArray655[arg3];
											local462 = this.aShortArray4[local450] * local454 + this.lb[local450] * local458 + 16383 >> 14;
											this.aShortArray4[local450] = (short) (this.aShortArray4[local450] * local458 + 16383 - this.lb[local450] * local454 >> 14);
											this.lb[local450] = (short) local462;
										}
									}
								}
							}
						}
					}
					if (this.aClass164_2 == null && this.aClass164_3 != null) {
						this.aClass164_3.anInterface14_4 = null;
					}
					if (this.aClass164_2 != null) {
						this.aClass164_2.anInterface14_4 = null;
					}
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static147.aBoolean190) {
					local370 = arg7[6] * Static515.anInt8904 + arg7[0] * Static411.anInt7519 + Static513.anInt8871 * arg7[3] + 8192 >> 14;
					local392 = Static515.anInt8904 * arg7[7] + Static411.anInt7519 * arg7[1] + Static513.anInt8871 * arg7[4] + 8192 >> 14;
					local370 += local252;
					local419 = arg7[2] * Static411.anInt7519 + Static513.anInt8871 * arg7[5] + arg7[8] * Static515.anInt8904 + 8192 >> 14;
					local392 += local54;
					local419 += local60;
					Static513.anInt8871 = local392;
					Static411.anInt7519 = local370;
					Static147.aBoolean190 = false;
					Static515.anInt8904 = local419;
				}
				@Pc(438) int[] local438 = new int[9];
				local392 = Class21.anIntArray655[arg2];
				local419 = Class21.anIntArray656[arg2];
				local450 = Class21.anIntArray655[arg3];
				local454 = Class21.anIntArray656[arg3];
				local458 = Class21.anIntArray655[arg4];
				local462 = Class21.anIntArray656[arg4];
				local470 = local419 * local458 + 8192 >> 14;
				local478 = local462 * local419 + 8192 >> 14;
				local438[6] = -local454 * local458 + local478 * local450 + 8192 >> 14;
				local438[0] = local450 * local458 + local454 * local478 + 8192 >> 14;
				local438[2] = local392 * local454 + 8192 >> 14;
				local438[7] = local450 * local470 + local454 * local462 + 8192 >> 14;
				local438[8] = local392 * local450 + 8192 >> 14;
				local438[5] = -local419;
				local438[3] = local462 * local392 + 8192 >> 14;
				local438[4] = local392 * local458 + 8192 >> 14;
				local438[1] = local462 * -local450 + local470 * local454 + 8192 >> 14;
				@Pc(608) int local608 = -Static411.anInt7519 * local438[0] + local438[1] * -Static513.anInt8871 + -Static515.anInt8904 * local438[2] + 8192 >> 14;
				local633 = local438[5] * -Static515.anInt8904 + local438[4] * -Static513.anInt8871 + local438[3] * -Static411.anInt7519 + 8192 >> 14;
				local658 = -Static515.anInt8904 * local438[8] + local438[7] * -Static513.anInt8871 + local438[6] * -Static411.anInt7519 + 8192 >> 14;
				local662 = Static411.anInt7519 + local608;
				@Pc(666) int local666 = local633 + Static513.anInt8871;
				local670 = Static515.anInt8904 + local658;
				@Pc(673) int[] local673 = new int[9];
				for (local675 = 0; local675 < 3; local675++) {
					for (local679 = 0; local679 < 3; local679++) {
						local683 = 0;
						for (local685 = 0; local685 < 3; local685++) {
							local683 += local438[local675 * 3 + local685] * arg7[local679 * 3 + local685];
						}
						local673[local675 * 3 + local679] = local683 + 8192 >> 14;
					}
				}
				local679 = local60 * local438[2] + local438[1] * local54 + local438[0] * local252 + 8192 >> 14;
				local683 = local60 * local438[5] + local438[4] * local54 + local252 * local438[3] + 8192 >> 14;
				local679 += local662;
				local685 = local60 * local438[8] + local252 * local438[6] + local438[7] * local54 + 8192 >> 14;
				local683 += local666;
				local685 += local670;
				local818 = new int[9];
				for (local820 = 0; local820 < 3; local820++) {
					for (local824 = 0; local824 < 3; local824++) {
						local828 = 0;
						for (local830 = 0; local830 < 3; local830++) {
							local828 += arg7[local830 + local820 * 3] * local673[local830 * 3 + local824];
						}
						local818[local820 * 3 + local824] = local828 + 8192 >> 14;
					}
				}
				local824 = local685 * arg7[2] + arg7[0] * local679 + local683 * arg7[1] + 8192 >> 14;
				local828 = local685 * arg7[5] + arg7[3] * local679 + arg7[4] * local683 + 8192 >> 14;
				local830 = local685 * arg7[8] + local679 * arg7[6] + local683 * arg7[7] + 8192 >> 14;
				local828 += local32;
				local824 += local26;
				local830 += local38;
				for (local956 = 0; local956 < local8; local956++) {
					@Pc(962) int local962 = arg1[local956];
					if (this.anIntArrayArray3.length > local962) {
						@Pc(976) int[] local976 = this.anIntArrayArray3[local962];
						for (@Pc(978) int local978 = 0; local978 < local976.length; local978++) {
							@Pc(984) int local984 = local976[local978];
							if (this.aShortArray8 == null || (this.aShortArray8[local984] & arg6) != 0) {
								@Pc(1025) int local1025 = this.anIntArray14[local984] * local818[2] + this.anIntArray12[local984] * local818[1] + local818[0] * this.anIntArray13[local984] + 8192 >> 14;
								@Pc(1056) int local1056 = local818[4] * this.anIntArray12[local984] + this.anIntArray13[local984] * local818[3] + this.anIntArray14[local984] * local818[5] + 8192 >> 14;
								@Pc(1089) int local1089 = local818[6] * this.anIntArray13[local984] + this.anIntArray12[local984] * local818[7] + this.anIntArray14[local984] * local818[8] + 8192 >> 14;
								@Pc(1093) int local1093 = local1025 + local824;
								@Pc(1097) int local1097 = local1056 + local828;
								this.anIntArray13[local984] = local1093;
								@Pc(1106) int local1106 = local1089 + local830;
								this.anIntArray12[local984] = local1097;
								this.anIntArray14[local984] = local1106;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2583) Class137 local2583;
			@Pc(2588) Class116 local2588;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray5.length) {
							local250 = this.anIntArrayArray5[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local54 = local250[local252];
								if (this.aShortArray10 == null || (this.aShortArray10[local54] & arg6) != 0) {
									local60 = arg2 * 8 + (this.aByteArray4[local54] & 0xFF);
									if (local60 < 0) {
										local60 = 0;
									} else if (local60 > 255) {
										local60 = 255;
									}
									this.aByteArray4[local54] = (byte) local60;
									if (this.aClass164_3 != null) {
										this.aClass164_3.anInterface14_4 = null;
									}
								}
							}
						}
					}
					if (this.aClass137Array1 != null) {
						for (local32 = 0; local32 < this.anInt913; local32++) {
							local2583 = this.aClass137Array1[local32];
							local2588 = this.aClass116Array1[local32];
							local2588.anInt3225 = local2588.anInt3225 & 0xFFFFFF | 255 - (this.aByteArray4[local2583.anInt4038] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2845) Class116 local2845;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray4.length > local32) {
								local250 = this.anIntArrayArray4[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2845 = this.aClass116Array1[local250[local252]];
									local2845.anInt3232 += arg3;
									local2845.anInt3229 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local26 = 0; local26 < local8; local26++) {
							local32 = arg1[local26];
							if (this.anIntArrayArray4.length > local32) {
								local250 = this.anIntArrayArray4[local32];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2845 = this.aClass116Array1[local250[local252]];
									local2845.anInt3227 = local2845.anInt3227 * arg2 >> 7;
									local2845.anInt3236 = local2845.anInt3236 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray4.length > local32) {
							local250 = this.anIntArrayArray4[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2845 = this.aClass116Array1[local250[local252]];
								local2845.anInt3231 = arg2 + local2845.anInt3231 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (this.anIntArrayArray5.length > local32) {
						local250 = this.anIntArrayArray5[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local54 = local250[local252];
							if (this.aShortArray10 == null || (arg6 & this.aShortArray10[local54]) != 0) {
								local60 = this.aShortArray9[local54] & 0xFFFF;
								local370 = local60 >> 10 & 0x3F;
								local392 = local60 >> 7 & 0x7;
								local419 = local60 & 0x7F;
								@Pc(2691) int local2691 = arg2 + local370 & 0x3F;
								local392 += arg3 / 4;
								if (local392 < 0) {
									local392 = 0;
								} else if (local392 > 7) {
									local392 = 7;
								}
								local419 += arg4;
								if (local419 < 0) {
									local419 = 0;
								} else if (local419 > 127) {
									local419 = 127;
								}
								this.aShortArray9[local54] = (short) (local419 | local392 << 7 | local2691 << 10);
								if (this.aClass164_3 != null) {
									this.aClass164_3.anInterface14_4 = null;
								}
							}
						}
					}
				}
				if (this.aClass137Array1 != null) {
					for (local32 = 0; local32 < this.anInt913; local32++) {
						local2583 = this.aClass137Array1[local32];
						local2588 = this.aClass116Array1[local32];
						local2588.anInt3225 = Static159.anIntArray159[this.aShortArray9[local2583.anInt4038] & 0xFFFF] & 0xFFFFFF | local2588.anInt3225 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray3.length > local32) {
					local250 = this.anIntArrayArray3[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local54 = local250[local252];
						if (this.aShortArray8 == null || (arg6 & this.aShortArray8[local54]) != 0) {
							this.anIntArray13[local54] -= Static411.anInt7519;
							this.anIntArray12[local54] -= Static513.anInt8871;
							this.anIntArray14[local54] -= Static515.anInt8904;
							this.anIntArray13[local54] = this.anIntArray13[local54] * arg2 >> 7;
							this.anIntArray12[local54] = this.anIntArray12[local54] * arg3 >> 7;
							this.anIntArray14[local54] = arg4 * this.anIntArray14[local54] >> 7;
							this.anIntArray13[local54] += Static411.anInt7519;
							this.anIntArray12[local54] += Static513.anInt8871;
							this.anIntArray14[local54] += Static515.anInt8904;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static147.aBoolean190) {
				local370 = arg7[6] * Static515.anInt8904 + arg7[3] * Static513.anInt8871 + Static411.anInt7519 * arg7[0] + 8192 >> 14;
				local392 = arg7[7] * Static515.anInt8904 + arg7[1] * Static411.anInt7519 + arg7[4] * Static513.anInt8871 + 8192 >> 14;
				local392 += local54;
				local419 = arg7[5] * Static513.anInt8871 + arg7[2] * Static411.anInt7519 + arg7[8] * Static515.anInt8904 + 8192 >> 14;
				local370 += local252;
				Static513.anInt8871 = local392;
				Static411.anInt7519 = local370;
				local419 += local60;
				Static147.aBoolean190 = false;
				Static515.anInt8904 = local419;
			}
			local370 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local419 = arg4 << 15 >> 7;
			local450 = local370 * -Static411.anInt7519 + 8192 >> 14;
			local454 = -Static513.anInt8871 * local392 + 8192 >> 14;
			local458 = -Static515.anInt8904 * local419 + 8192 >> 14;
			local462 = local450 + Static411.anInt7519;
			local470 = Static513.anInt8871 + local454;
			local478 = Static515.anInt8904 + local458;
			@Pc(1870) int[] local1870 = new int[] { arg7[0] * local370 + 8192 >> 14, arg7[3] * local370 + 8192 >> 14, local370 * arg7[6] + 8192 >> 14, local392 * arg7[1] + 8192 >> 14, local392 * arg7[4] + 8192 >> 14, arg7[7] * local392 + 8192 >> 14, arg7[2] * local419 + 8192 >> 14, local419 * arg7[5] + 8192 >> 14, local419 * arg7[8] + 8192 >> 14 };
			local633 = local252 * local370 + 8192 >> 14;
			local658 = local54 * local392 + 8192 >> 14;
			local662 = local419 * local60 + 8192 >> 14;
			@Pc(2006) int local2006 = local658 + local470;
			@Pc(2010) int local2010 = local633 + local462;
			@Pc(2014) int local2014 = local662 + local478;
			@Pc(2017) int[] local2017 = new int[9];
			@Pc(2023) int local2023;
			for (local670 = 0; local670 < 3; local670++) {
				for (local2023 = 0; local2023 < 3; local2023++) {
					local675 = 0;
					for (local679 = 0; local679 < 3; local679++) {
						local675 += local1870[local679 * 3 + local2023] * arg7[local679 + local670 * 3];
					}
					local2017[local2023 + local670 * 3] = local675 + 8192 >> 14;
				}
			}
			local2023 = arg7[2] * local2014 + local2010 * arg7[0] + local2006 * arg7[1] + 8192 >> 14;
			local675 = arg7[4] * local2006 + arg7[3] * local2010 + arg7[5] * local2014 + 8192 >> 14;
			local679 = local2010 * arg7[6] + arg7[7] * local2006 + arg7[8] * local2014 + 8192 >> 14;
			local2023 += local26;
			local675 += local32;
			local679 += local38;
			for (local683 = 0; local683 < local8; local683++) {
				local685 = arg1[local683];
				if (this.anIntArrayArray3.length > local685) {
					local818 = this.anIntArrayArray3[local685];
					for (local820 = 0; local820 < local818.length; local820++) {
						local824 = local818[local820];
						if (this.aShortArray8 == null || (this.aShortArray8[local824] & arg6) != 0) {
							local828 = local2017[2] * this.anIntArray14[local824] + local2017[1] * this.anIntArray12[local824] + this.anIntArray13[local824] * local2017[0] + 8192 >> 14;
							local830 = this.anIntArray13[local824] * local2017[3] + this.anIntArray12[local824] * local2017[4] + local2017[5] * this.anIntArray14[local824] + 8192 >> 14;
							local956 = local2017[8] * this.anIntArray14[local824] + this.anIntArray13[local824] * local2017[6] + local2017[7] * this.anIntArray12[local824] + 8192 >> 14;
							@Pc(2297) int local2297 = local830 + local675;
							@Pc(2301) int local2301 = local828 + local2023;
							@Pc(2305) int local2305 = local956 + local679;
							this.anIntArray13[local824] = local2301;
							this.anIntArray12[local824] = local2297;
							this.anIntArray14[local824] = local2305;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt874; local7++) {
			if (arg0 == this.aShortArray9[local7]) {
				this.aShortArray9[local7] = arg1;
			}
		}
		if (this.aClass137Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt913; local30++) {
				@Pc(37) Class137 local37 = this.aClass137Array1[local30];
				@Pc(42) Class116 local42 = this.aClass116Array1[local30];
				local42.anInt3225 = local42.anInt3225 & 0xFF000000 | Static159.anIntArray159[this.aShortArray9[local37.anInt4038] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt897 = arg0;
		this.aBoolean68 = true;
		if (this.aClass179_1 != null && (this.anInt897 & 0x10000) == 0) {
			this.aByteArray3 = this.aClass179_1.aByteArray58;
			this.aShortArray4 = this.aClass179_1.aShortArray72;
			this.lb = this.aClass179_1.aShortArray74;
			this.aShortArray5 = this.aClass179_1.aShortArray73;
			this.aClass179_1 = null;
		}
		this.method966();
	}

	@OriginalMember(owner = "client!am", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt871; local15++) {
			@Pc(34) int local34 = this.anIntArray12[local15] * local9 + local13 * this.anIntArray13[local15] >> 14;
			this.anIntArray12[local15] = this.anIntArray12[local15] * local13 - this.anIntArray13[local15] * local9 >> 14;
			this.anIntArray13[local15] = local34;
		}
		this.aBoolean65 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "()V")
	@Override
	protected void method5423() {
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)V")
	private void method961() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(27) int local27 = 0; local27 < this.anInt871; local27++) {
			@Pc(34) int local34 = this.anIntArray13[local27];
			@Pc(39) int local39 = this.anIntArray12[local27];
			if (local7 > local34) {
				local7 = local34;
			}
			@Pc(49) int local49 = this.anIntArray14[local27];
			if (local39 > local15) {
				local15 = local39;
			}
			if (local9 > local39) {
				local9 = local39;
			}
			if (local13 < local34) {
				local13 = local34;
			}
			if (local11 > local49) {
				local11 = local49;
			}
			if (local17 < local49) {
				local17 = local49;
			}
			@Pc(86) int local86 = local49 * local49 + local34 * local34;
			if (local19 < local86) {
				local19 = local86;
			}
			local86 = local49 * local49 + local34 * local34 + local39 * local39;
			if (local21 < local86) {
				local21 = local86;
			}
		}
		this.aShort3 = (short) local15;
		this.aShort8 = (short) local11;
		this.aShort11 = (short) local9;
		this.aShort6 = (short) local7;
		this.aShort7 = (short) local17;
		this.aShort2 = (short) local13;
		this.aShort9 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort5 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean65 = true;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method5425(@OriginalArg(0) Class39 arg0) {
		@Pc(8) Class39_Sub2 local8 = (Class39_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass284Array1 != null) {
			for (local13 = 0; local13 < this.aClass284Array1.length; local13++) {
				@Pc(20) Class284 local20 = this.aClass284Array1[local13];
				@Pc(22) Class284 local22 = local20;
				if (local20.aClass284_2 != null) {
					local22 = local20.aClass284_2;
				}
				local22.anInt8331 = (int) (local8.aFloat175 + (float) this.anIntArray12[local20.anInt8333] * local8.aFloat168 + (float) this.anIntArray13[local20.anInt8333] * local8.aFloat167 + local8.aFloat173 * (float) this.anIntArray14[local20.anInt8333]);
				local22.anInt8328 = (int) (local8.aFloat178 + (float) this.anIntArray14[local20.anInt8333] * local8.aFloat170 + local8.aFloat169 * (float) this.anIntArray13[local20.anInt8333] + (float) this.anIntArray12[local20.anInt8333] * local8.aFloat177);
				local22.anInt8322 = (int) (local8.aFloat172 * (float) this.anIntArray13[local20.anInt8333] + local8.aFloat171 * (float) this.anIntArray12[local20.anInt8333] + local8.aFloat176 * (float) this.anIntArray14[local20.anInt8333] + local8.aFloat174);
				local22.anInt8320 = (int) (local8.aFloat175 + local8.aFloat167 * (float) this.anIntArray13[local20.anInt8326] + (float) this.anIntArray12[local20.anInt8326] * local8.aFloat168 + (float) this.anIntArray14[local20.anInt8326] * local8.aFloat173);
				local22.anInt8319 = (int) ((float) this.anIntArray14[local20.anInt8326] * local8.aFloat170 + local8.aFloat177 * (float) this.anIntArray12[local20.anInt8326] + local8.aFloat169 * (float) this.anIntArray13[local20.anInt8326] + local8.aFloat178);
				local22.anInt8316 = (int) (local8.aFloat174 + (float) this.anIntArray14[local20.anInt8326] * local8.aFloat176 + local8.aFloat172 * (float) this.anIntArray13[local20.anInt8326] + local8.aFloat171 * (float) this.anIntArray12[local20.anInt8326]);
				local22.anInt8329 = (int) ((float) this.anIntArray12[local20.anInt8323] * local8.aFloat168 + (float) this.anIntArray13[local20.anInt8323] * local8.aFloat167 + local8.aFloat173 * (float) this.anIntArray14[local20.anInt8323] + local8.aFloat175);
				local22.anInt8325 = (int) ((float) this.anIntArray14[local20.anInt8323] * local8.aFloat170 + (float) this.anIntArray13[local20.anInt8323] * local8.aFloat169 + local8.aFloat177 * (float) this.anIntArray12[local20.anInt8323] + local8.aFloat178);
				local22.anInt8324 = (int) (local8.aFloat174 + (float) this.anIntArray14[local20.anInt8323] * local8.aFloat176 + local8.aFloat172 * (float) this.anIntArray13[local20.anInt8323] + (float) this.anIntArray12[local20.anInt8323] * local8.aFloat171);
			}
		}
		if (this.aClass353Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass353Array1.length; local13++) {
			@Pc(365) Class353 local365 = this.aClass353Array1[local13];
			@Pc(367) Class353 local367 = local365;
			if (local365.aClass353_2 != null) {
				local367 = local365.aClass353_2;
			}
			if (local365.aClass39_13 == null) {
				local365.aClass39_13 = local8.method7248();
			} else {
				local365.aClass39_13.method7236(local8);
			}
			local367.anInt9744 = (int) (local8.aFloat175 + local8.aFloat168 * (float) this.anIntArray12[local365.anInt9752] + local8.aFloat167 * (float) this.anIntArray13[local365.anInt9752] + local8.aFloat173 * (float) this.anIntArray14[local365.anInt9752]);
			local367.anInt9747 = (int) (local8.aFloat170 * (float) this.anIntArray14[local365.anInt9752] + local8.aFloat169 * (float) this.anIntArray13[local365.anInt9752] + local8.aFloat177 * (float) this.anIntArray12[local365.anInt9752] + local8.aFloat178);
			local367.anInt9742 = (int) (local8.aFloat172 * (float) this.anIntArray13[local365.anInt9752] + local8.aFloat171 * (float) this.anIntArray12[local365.anInt9752] + local8.aFloat176 * (float) this.anIntArray14[local365.anInt9752] + local8.aFloat174);
		}
	}

	@OriginalMember(owner = "client!am", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass5_Sub2_1.anInterface7_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt874; local11++) {
			if (arg0 == this.aShortArray2[local11]) {
				this.aShortArray2[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(52) Class195 local52 = local9.method8118(arg0 & 0xFFFF);
			local39 = local52.aByte79;
			local41 = local52.aByte84;
		}
		@Pc(60) byte local60 = 0;
		@Pc(62) byte local62 = 0;
		if (arg1 != -1) {
			@Pc(72) Class195 local72 = local9.method8118(arg1 & 0xFFFF);
			if (local72.aByte80 != 0 || local72.aByte81 != 0) {
				this.aBoolean66 = true;
			}
			local60 = local72.aByte79;
			local62 = local72.aByte84;
		}
		if (!(local60 != local39 | local41 != local62)) {
			return;
		}
		if (this.aClass137Array1 != null) {
			for (@Pc(120) int local120 = 0; local120 < this.anInt913; local120++) {
				@Pc(127) Class137 local127 = this.aClass137Array1[local120];
				@Pc(132) Class116 local132 = this.aClass116Array1[local120];
				local132.anInt3225 = Static159.anIntArray159[this.aShortArray9[local127.anInt4038] & 0xFFFF] & 0xFFFFFF | local132.anInt3225 & 0xFF000000;
			}
		}
		if (this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method962(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg2 && arg0 < arg7 && arg0 < arg6) {
			return false;
		} else if (arg0 > arg2 && arg0 > arg7 && arg0 > arg6) {
			return false;
		} else if (arg4 > arg5 && arg5 < arg1 && arg3 > arg5) {
			return false;
		} else {
			return arg4 >= arg5 || arg1 >= arg5 || arg5 <= arg3;
		}
	}

	@OriginalMember(owner = "client!am", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort10;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	@Override
	public boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method968(-1, arg3, arg1, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!am", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean67;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IFIIIJBFLclient!fu;I)S")
	private short method964(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) long arg5, @OriginalArg(7) float arg6, @OriginalArg(8) Class118 arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray11[arg8];
		@Pc(17) int local17 = this.anIntArray11[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray6[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg5 == Static381.aLongArray16[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray6[local19] = (short) (this.anInt872 + 1);
		Static381.aLongArray16[local19] = arg5;
		this.lb[this.anInt872] = (short) arg4;
		this.aShortArray5[this.anInt872] = (short) arg2;
		this.aShortArray4[this.anInt872] = (short) arg0;
		this.aByteArray3[this.anInt872] = (byte) arg3;
		this.aFloatArray21[this.anInt872] = arg1;
		this.aFloatArray20[this.anInt872] = arg6;
		return (short) this.anInt872++;
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "()V")
	@Override
	public void method5426() {
		if (this.anInt872 <= 0 || this.anInt849 <= 0) {
			return;
		}
		this.method971(false);
		if ((this.aByte5 & 0x10) == 0 && this.aClass2_1.anInterface15_1 == null) {
			this.method969(false);
		}
		this.method966();
	}

	@OriginalMember(owner = "client!am", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt871; local15++) {
			@Pc(34) int local34 = this.anIntArray12[local15] * local13 - this.anIntArray14[local15] * local9 >> 14;
			this.anIntArray14[local15] = local9 * this.anIntArray12[local15] + local13 * this.anIntArray14[local15] >> 14;
			this.anIntArray12[local15] = local34;
		}
		this.aBoolean65 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)V")
	private void method965() {
		if (this.aClass137Array1 == null) {
			return;
		}
		@Pc(8) Class39_Sub2 local8 = this.aClass5_Sub2_1.aClass39_Sub2_2;
		this.aClass5_Sub2_1.method4961();
		this.aClass5_Sub2_1.C(!this.aBoolean67);
		this.aClass5_Sub2_1.method4975(false);
		this.aClass5_Sub2_1.method4967(this.aClass5_Sub2_1.aClass164_12, null, this.aClass5_Sub2_1.aClass164_11, null);
		for (@Pc(40) int local40 = 0; local40 < this.anInt913; local40++) {
			@Pc(47) Class137 local47 = this.aClass137Array1[local40];
			@Pc(52) Class116 local52 = this.aClass116Array1[local40];
			if (!local47.aBoolean275 || !this.aClass5_Sub2_1.method7516()) {
				@Pc(80) float local80 = (float) (this.anIntArray13[local47.anInt4036] + this.anIntArray13[local47.anInt4039] + this.anIntArray13[local47.anInt4037]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray12[local47.anInt4036] + this.anIntArray12[local47.anInt4039] + this.anIntArray12[local47.anInt4037]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray14[local47.anInt4036] + this.anIntArray14[local47.anInt4039] + this.anIntArray14[local47.anInt4037]) * 0.3333333F;
				@Pc(136) float local136 = Static260.aFloat200 + Static610.aFloat207 * local122 + Static347.aFloat157 * local101 + Static111.aFloat75 * local80;
				@Pc(150) float local150 = local80 * Static319.aFloat132 + Static70.aFloat135 * local101 + local122 * Static342.aFloat154 + Static347.aFloat156;
				@Pc(164) float local164 = local80 * Static624.aFloat212 + Static346.aFloat155 * local101 + Static362.aFloat160 * local122 + Static178.aFloat213;
				@Pc(185) float local185 = (float) (1.0D / Math.sqrt((double) (local164 * local164 + local150 * local150 + local136 * local136))) * (float) local47.anInt4040;
				local8.method6552(local52.anInt3227 * local47.aShort57 >> 7, local52.anInt3231, local136 + (float) local52.anInt3229 - local136 * local185, local164 * local185 + -local164, (float) local52.anInt3232 + local185 * local150 - local150, local47.aShort55 * local52.anInt3236 >> 7);
				this.aClass5_Sub2_1.method5030(local8);
				@Pc(237) int local237 = local52.anInt3225;
				OpenGL.glColor4ub((byte) (local237 >> 16), (byte) (local237 >> 8), (byte) local237, (byte) (local237 >> 24));
				this.aClass5_Sub2_1.method5009(local47.aShort56);
				this.aClass5_Sub2_1.method4971(local47.aByte62);
				this.aClass5_Sub2_1.method4995(4);
			}
		}
		this.aClass5_Sub2_1.C(true);
		this.aClass5_Sub2_1.method4963();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "()[Lclient!vea;")
	@Override
	public Class353[] method5415() {
		return this.aClass353Array1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!sk;Lclient!nl;II)V")
	@Override
	public void method5413(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt872 == 0) {
			return;
		}
		@Pc(13) Class39_Sub2 local13 = this.aClass5_Sub2_1.aClass39_Sub2_3;
		if (!this.aBoolean65) {
			this.method961();
		}
		@Pc(22) Class39_Sub2 local22 = (Class39_Sub2) arg0;
		Static178.aFloat213 = local13.aFloat174 + local13.aFloat176 * local22.aFloat174 + local13.aFloat172 * local22.aFloat175 + local22.aFloat178 * local13.aFloat171;
		Static346.aFloat155 = local22.aFloat171 * local13.aFloat176 + local13.aFloat171 * local22.aFloat177 + local13.aFloat172 * local22.aFloat168;
		@Pc(69) float local69 = (float) this.aShort11 * Static346.aFloat155 + Static178.aFloat213;
		@Pc(77) float local77 = Static178.aFloat213 + (float) this.aShort3 * Static346.aFloat155;
		@Pc(93) float local93;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = (float) this.aShort9 + local69;
			local93 = local77 - (float) this.aShort9;
		} else {
			local87 = local77 + (float) this.aShort9;
			local93 = (float) -this.aShort9 + local69;
		}
		if (local93 >= this.aClass5_Sub2_1.aFloat117 || local87 <= (float) this.aClass5_Sub2_1.anInt5665) {
			return;
		}
		Static260.aFloat200 = local13.aFloat175 + local13.aFloat168 * local22.aFloat178 + local22.aFloat175 * local13.aFloat167 + local22.aFloat174 * local13.aFloat173;
		Static347.aFloat157 = local13.aFloat167 * local22.aFloat168 + local22.aFloat177 * local13.aFloat168 + local13.aFloat173 * local22.aFloat171;
		@Pc(170) float local170 = Static260.aFloat200 + (float) this.aShort11 * Static347.aFloat157;
		@Pc(178) float local178 = (float) this.aShort3 * Static347.aFloat157 + Static260.aFloat200;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (float) this.aClass5_Sub2_1.anInt5676 * ((float) this.aShort9 + local170);
			local205 = ((float) -this.aShort9 + local178) * (float) this.aClass5_Sub2_1.anInt5676;
		} else {
			local205 = ((float) -this.aShort9 + local170) * (float) this.aClass5_Sub2_1.anInt5676;
			local193 = ((float) this.aShort9 + local178) * (float) this.aClass5_Sub2_1.anInt5676;
		}
		if (this.aClass5_Sub2_1.aFloat130 <= local205 / (float) arg2 || local193 / (float) arg2 <= this.aClass5_Sub2_1.aFloat127) {
			return;
		}
		Static70.aFloat135 = local22.aFloat171 * local13.aFloat170 + local13.aFloat169 * local22.aFloat168 + local13.aFloat177 * local22.aFloat177;
		Static347.aFloat156 = local22.aFloat175 * local13.aFloat169 + local13.aFloat177 * local22.aFloat178 + local22.aFloat174 * local13.aFloat170 + local13.aFloat178;
		@Pc(297) float local297 = Static347.aFloat156 + Static70.aFloat135 * (float) this.aShort11;
		@Pc(305) float local305 = Static347.aFloat156 + (float) this.aShort3 * Static70.aFloat135;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local297 > local305) {
			local331 = (float) this.aClass5_Sub2_1.anInt5664 * (local297 + (float) this.aShort9);
			local320 = (float) this.aClass5_Sub2_1.anInt5664 * ((float) -this.aShort9 + local305);
		} else {
			local320 = (local297 - (float) this.aShort9) * (float) this.aClass5_Sub2_1.anInt5664;
			local331 = (float) this.aClass5_Sub2_1.anInt5664 * ((float) this.aShort9 + local305);
		}
		if (local320 / (float) arg2 >= this.aClass5_Sub2_1.aFloat115 || local331 / (float) arg2 <= this.aClass5_Sub2_1.aFloat116) {
			return;
		}
		if (arg1 != null || this.aClass137Array1 != null) {
			Static362.aFloat160 = local22.aFloat176 * local13.aFloat176 + local13.aFloat172 * local22.aFloat173 + local22.aFloat170 * local13.aFloat171;
			Static624.aFloat212 = local22.aFloat167 * local13.aFloat172 + local13.aFloat171 * local22.aFloat169 + local13.aFloat176 * local22.aFloat172;
			Static319.aFloat132 = local13.aFloat170 * local22.aFloat172 + local22.aFloat169 * local13.aFloat177 + local13.aFloat169 * local22.aFloat167;
			Static342.aFloat154 = local13.aFloat177 * local22.aFloat170 + local22.aFloat173 * local13.aFloat169 + local22.aFloat176 * local13.aFloat170;
			Static610.aFloat207 = local22.aFloat170 * local13.aFloat168 + local13.aFloat167 * local22.aFloat173 + local22.aFloat176 * local13.aFloat173;
			Static111.aFloat75 = local13.aFloat167 * local22.aFloat167 + local22.aFloat169 * local13.aFloat168 + local22.aFloat172 * local13.aFloat173;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.aShort2 + this.aShort6 >> 1;
			@Pc(507) int local507 = this.aShort7 + this.aShort8 >> 1;
			@Pc(526) int local526 = (int) (Static260.aFloat200 + (float) local499 * Static111.aFloat75 + Static347.aFloat157 * (float) this.aShort11 + Static610.aFloat207 * (float) local507);
			@Pc(545) int local545 = (int) (Static70.aFloat135 * (float) this.aShort11 + Static347.aFloat156 + Static319.aFloat132 * (float) local499 + Static342.aFloat154 * (float) local507);
			@Pc(564) int local564 = (int) (Static346.aFloat155 * (float) this.aShort11 + Static178.aFloat213 + Static624.aFloat212 * (float) local499 + Static362.aFloat160 * (float) local507);
			@Pc(583) int local583 = (int) (Static347.aFloat157 * (float) this.aShort3 + Static260.aFloat200 + (float) local499 * Static111.aFloat75 + Static610.aFloat207 * (float) local507);
			@Pc(602) int local602 = (int) ((float) local499 * Static319.aFloat132 + Static347.aFloat156 + (float) this.aShort3 * Static70.aFloat135 + (float) local507 * Static342.aFloat154);
			arg1.anInt7143 = local583 * this.aClass5_Sub2_1.anInt5676 / arg2 + this.aClass5_Sub2_1.anInt5659;
			arg1.anInt7144 = this.aClass5_Sub2_1.anInt5689 + this.aClass5_Sub2_1.anInt5664 * local545 / arg2;
			arg1.anInt7142 = this.aClass5_Sub2_1.anInt5659 + local526 * this.aClass5_Sub2_1.anInt5676 / arg2;
			@Pc(662) int local662 = (int) (Static624.aFloat212 * (float) local499 + Static178.aFloat213 + Static346.aFloat155 * (float) this.aShort3 + Static362.aFloat160 * (float) local507);
			arg1.anInt7145 = local602 * this.aClass5_Sub2_1.anInt5664 / arg2 + this.aClass5_Sub2_1.anInt5689;
			if (this.aClass5_Sub2_1.anInt5665 <= local564 || this.aClass5_Sub2_1.anInt5665 <= local662) {
				arg1.anInt7146 = (local526 + this.aShort9) * this.aClass5_Sub2_1.anInt5676 / arg2 + this.aClass5_Sub2_1.anInt5659 - arg1.anInt7142;
				arg1.aBoolean514 = true;
			}
		}
		this.aClass5_Sub2_1.method5022((float) arg2);
		this.aClass5_Sub2_1.method5020();
		this.aClass5_Sub2_1.method4952(local22);
		this.method967();
		this.aClass5_Sub2_1.method4963();
		this.method965();
	}

	@OriginalMember(owner = "client!am", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean66;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
	private void method966() {
		if (!this.aBoolean68) {
			return;
		}
		this.aBoolean68 = false;
		if (this.aClass284Array1 == null && this.aClass353Array1 == null && this.aClass137Array1 == null) {
			if (this.anIntArray13 != null && !Static489.method7286(this.anInt897, this.anInt856)) {
				if (this.aClass164_4 != null && this.aClass164_4.anInterface14_4 == null) {
					this.aBoolean68 = true;
				} else {
					if (!this.aBoolean65) {
						this.method961();
					}
					this.anIntArray13 = null;
				}
			}
			if (this.anIntArray12 != null && !Static291.method4633(this.anInt897, this.anInt856)) {
				if (this.aClass164_4 != null && this.aClass164_4.anInterface14_4 == null) {
					this.aBoolean68 = true;
				} else {
					if (!this.aBoolean65) {
						this.method961();
					}
					this.anIntArray12 = null;
				}
			}
			if (this.anIntArray14 != null && !Static566.method8110(this.anInt856, this.anInt897)) {
				if (this.aClass164_4 != null && this.aClass164_4.anInterface14_4 == null) {
					this.aBoolean68 = true;
				} else {
					if (!this.aBoolean65) {
						this.method961();
					}
					this.anIntArray14 = null;
				}
			}
		}
		if (this.aShortArray6 != null && this.anIntArray13 == null && this.anIntArray12 == null && this.anIntArray14 == null) {
			this.anIntArray11 = null;
			this.aShortArray6 = null;
		}
		if (this.aByteArray3 != null && !Static82.method1943(this.anInt856, this.anInt897)) {
			if (this.aClass164_2 == null) {
				if (this.aClass164_3 != null && this.aClass164_3.anInterface14_4 == null) {
					this.aBoolean68 = true;
				} else {
					this.lb = this.aShortArray5 = this.aShortArray4 = null;
					this.aByteArray3 = null;
				}
			} else if (this.aClass164_2.anInterface14_4 == null) {
				this.aBoolean68 = true;
			} else {
				this.aByteArray3 = null;
				this.lb = this.aShortArray5 = this.aShortArray4 = null;
			}
		}
		if (this.aShortArray9 != null && !Static82.method1942(this.anInt856, this.anInt897)) {
			if (this.aClass164_3 != null && this.aClass164_3.anInterface14_4 == null) {
				this.aBoolean68 = true;
			} else {
				this.aShortArray9 = null;
			}
		}
		if (this.aByteArray4 != null && !Static229.method3809(this.anInt897, this.anInt856)) {
			if (this.aClass164_3 != null && this.aClass164_3.anInterface14_4 == null) {
				this.aBoolean68 = true;
			} else {
				this.aByteArray4 = null;
			}
		}
		if (this.aFloatArray21 != null && !Static274.method4472(this.anInt897, this.anInt856)) {
			if (this.aClass164_1 != null && this.aClass164_1.anInterface14_4 == null) {
				this.aBoolean68 = true;
			} else {
				this.aFloatArray21 = this.aFloatArray20 = null;
			}
		}
		if (this.aShortArray2 != null && !Static432.method6766(this.anInt897, this.anInt856)) {
			if (this.aClass164_3 != null && this.aClass164_3.anInterface14_4 == null) {
				this.aBoolean68 = true;
			} else {
				this.aShortArray2 = null;
			}
		}
		if (this.aShortArray3 != null && !Static287.method4604(this.anInt897, this.anInt856)) {
			if (this.aClass2_1 != null && this.aClass2_1.anInterface15_1 == null || this.aClass164_3 != null && this.aClass164_3.anInterface14_4 == null) {
				this.aBoolean68 = true;
			} else {
				this.aShortArray3 = this.aShortArray7 = this.aShortArray1 = null;
			}
		}
		if (this.anIntArrayArray5 != null && !Static493.method7317(this.anInt897, this.anInt856)) {
			this.aShortArray10 = null;
			this.anIntArrayArray5 = null;
		}
		if (this.anIntArrayArray3 != null && !Static632.method8661(this.anInt897, this.anInt856)) {
			this.anIntArrayArray3 = null;
			this.aShortArray8 = null;
		}
		if (this.anIntArrayArray4 != null && !Static594.method8339(this.anInt856, this.anInt897)) {
			this.anIntArrayArray4 = null;
		}
		if (this.anIntArray10 != null && (this.anInt897 & 0x800) == 0 && (this.anInt897 & 0x40000) == 0) {
			this.anIntArray10 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt871; local3++) {
			this.anIntArray14[local3] = -this.anIntArray14[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt872; local25++) {
			this.aShortArray4[local25] = (short) -this.aShortArray4[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt874; local44++) {
			@Pc(51) short local51 = this.aShortArray3[local44];
			this.aShortArray3[local44] = this.aShortArray1[local44];
			this.aShortArray1[local44] = local51;
		}
		if (this.aClass164_2 == null && this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
		}
		if (this.aClass164_2 != null) {
			this.aClass164_2.anInterface14_4 = null;
		}
		if (this.aClass2_1 != null) {
			this.aClass2_1.anInterface15_1 = null;
		}
		this.aBoolean65 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort5;
	}

	@OriginalMember(owner = "client!am", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static513.anInt8871 = 0;
			local14 = 0;
			Static515.anInt8904 = 0;
			Static411.anInt7519 = 0;
			for (local20 = 0; local20 < this.anInt871; local20++) {
				Static411.anInt7519 += this.anIntArray13[local20];
				Static513.anInt8871 += this.anIntArray12[local20];
				local14++;
				Static515.anInt8904 += this.anIntArray14[local20];
			}
			if (local14 > 0) {
				Static411.anInt7519 = arg1 + Static411.anInt7519 / local14;
				Static513.anInt8871 = arg2 + Static513.anInt8871 / local14;
				Static515.anInt8904 = Static515.anInt8904 / local14 + arg3;
			} else {
				Static513.anInt8871 = arg2;
				Static515.anInt8904 = arg3;
				Static411.anInt7519 = arg1;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt871; local14++) {
				this.anIntArray13[local14] += arg1;
				this.anIntArray12[local14] += arg2;
				this.anIntArray14[local14] += arg3;
			}
		} else {
			@Pc(168) int local168;
			@Pc(187) int local187;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt871; local14++) {
					this.anIntArray13[local14] -= Static411.anInt7519;
					this.anIntArray12[local14] -= Static513.anInt8871;
					this.anIntArray14[local14] -= Static515.anInt8904;
					if (arg3 != 0) {
						local20 = Class21.anIntArray656[arg3];
						local168 = Class21.anIntArray655[arg3];
						local187 = this.anIntArray12[local14] * local20 + local168 * this.anIntArray13[local14] + 16383 >> 14;
						this.anIntArray12[local14] = local168 * this.anIntArray12[local14] + 16383 - local20 * this.anIntArray13[local14] >> 14;
						this.anIntArray13[local14] = local187;
					}
					if (arg1 != 0) {
						local20 = Class21.anIntArray656[arg1];
						local168 = Class21.anIntArray655[arg1];
						local187 = this.anIntArray12[local14] * local168 + 16383 - this.anIntArray14[local14] * local20 >> 14;
						this.anIntArray14[local14] = local20 * this.anIntArray12[local14] + this.anIntArray14[local14] * local168 + 16383 >> 14;
						this.anIntArray12[local14] = local187;
					}
					if (arg2 != 0) {
						local20 = Class21.anIntArray656[arg2];
						local168 = Class21.anIntArray655[arg2];
						local187 = local168 * this.anIntArray13[local14] + this.anIntArray14[local14] * local20 + 16383 >> 14;
						this.anIntArray14[local14] = local168 * this.anIntArray14[local14] + 16383 - local20 * this.anIntArray13[local14] >> 14;
						this.anIntArray13[local14] = local187;
					}
					this.anIntArray13[local14] += Static411.anInt7519;
					this.anIntArray12[local14] += Static513.anInt8871;
					this.anIntArray14[local14] += Static515.anInt8904;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt871; local14++) {
					this.anIntArray13[local14] -= Static411.anInt7519;
					this.anIntArray12[local14] -= Static513.anInt8871;
					this.anIntArray14[local14] -= Static515.anInt8904;
					this.anIntArray13[local14] = arg1 * this.anIntArray13[local14] / 128;
					this.anIntArray12[local14] = this.anIntArray12[local14] * arg2 / 128;
					this.anIntArray14[local14] = this.anIntArray14[local14] * arg3 / 128;
					this.anIntArray13[local14] += Static411.anInt7519;
					this.anIntArray12[local14] += Static513.anInt8871;
					this.anIntArray14[local14] += Static515.anInt8904;
				}
			} else {
				@Pc(525) Class137 local525;
				@Pc(530) Class116 local530;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt874; local14++) {
						local20 = (this.aByteArray4[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray4[local14] = (byte) local20;
					}
					if (this.aClass164_3 != null) {
						this.aClass164_3.anInterface14_4 = null;
					}
					if (this.aClass137Array1 != null) {
						for (local20 = 0; local20 < this.anInt913; local20++) {
							local525 = this.aClass137Array1[local20];
							local530 = this.aClass116Array1[local20];
							local530.anInt3225 = 255 - (this.aByteArray4[local525.anInt4038] & 0xFF) << 24 | local530.anInt3225 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt874; local14++) {
						local20 = this.aShortArray9[local14] & 0xFFFF;
						local168 = local20 >> 10 & 0x3F;
						local187 = local20 >> 7 & 0x7;
						local187 += arg2 / 4;
						@Pc(595) int local595 = arg1 + local168 & 0x3F;
						@Pc(599) int local599 = local20 & 0x7F;
						local599 += arg3;
						if (local187 < 0) {
							local187 = 0;
						} else if (local187 > 7) {
							local187 = 7;
						}
						if (local599 < 0) {
							local599 = 0;
						} else if (local599 > 127) {
							local599 = 127;
						}
						this.aShortArray9[local14] = (short) (local599 | local187 << 7 | local595 << 10);
					}
					if (this.aClass164_3 != null) {
						this.aClass164_3.anInterface14_4 = null;
					}
					if (this.aClass137Array1 != null) {
						for (local20 = 0; local20 < this.anInt913; local20++) {
							local525 = this.aClass137Array1[local20];
							local530 = this.aClass116Array1[local20];
							local530.anInt3225 = Static159.anIntArray159[this.aShortArray9[local525.anInt4038] & 0xFFFF] & 0xFFFFFF | local530.anInt3225 & 0xFF000000;
						}
					}
				} else {
					@Pc(715) Class116 local715;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt913; local14++) {
							local715 = this.aClass116Array1[local14];
							local715.anInt3229 += arg1;
							local715.anInt3232 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt913; local14++) {
							local715 = this.aClass116Array1[local14];
							local715.anInt3227 = local715.anInt3227 * arg1 >> 7;
							local715.anInt3236 = local715.anInt3236 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt913; local14++) {
							local715 = this.aClass116Array1[local14];
							local715.anInt3231 = arg1 + local715.anInt3231 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class17 method5409(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class17_Sub1 local18;
		@Pc(14) Class17_Sub1 local14;
		if (arg0 == 1) {
			local14 = this.aClass5_Sub2_1.aClass17_Sub1_8;
			local18 = this.aClass5_Sub2_1.aClass17_Sub1_1;
		} else if (arg0 == 2) {
			local18 = this.aClass5_Sub2_1.aClass17_Sub1_3;
			local14 = this.aClass5_Sub2_1.aClass17_Sub1_10;
		} else if (arg0 == 3) {
			local18 = this.aClass5_Sub2_1.aClass17_Sub1_7;
			local14 = this.aClass5_Sub2_1.aClass17_Sub1_4;
		} else if (arg0 == 4) {
			local18 = this.aClass5_Sub2_1.aClass17_Sub1_5;
			local14 = this.aClass5_Sub2_1.aClass17_Sub1_9;
		} else if (arg0 == 5) {
			local18 = this.aClass5_Sub2_1.aClass17_Sub1_6;
			local14 = this.aClass5_Sub2_1.aClass17_Sub1_2;
		} else {
			local18 = local14 = new Class17_Sub1(this.aClass5_Sub2_1);
		}
		return this.method974(local14, local18, arg2, arg0 != 0, arg1);
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	private void method967() {
		if (this.anInt849 == 0) {
			return;
		}
		if (this.aByte5 != 0) {
			this.method971(true);
		}
		this.method971(false);
		if (this.aClass2_1 != null) {
			if (this.aClass2_1.anInterface15_1 == null) {
				this.method969((this.aByte5 & 0x10) != 0);
			}
			if (this.aClass2_1.anInterface15_1 != null) {
				this.aClass5_Sub2_1.method4975(this.aClass164_2 != null);
				this.aClass5_Sub2_1.method4967(this.aClass164_4, this.aClass164_3, this.aClass164_1, this.aClass164_2);
				@Pc(82) int local82 = this.anIntArray10.length - 1;
				for (@Pc(84) int local84 = 0; local84 < local82; local84++) {
					@Pc(91) int local91 = this.anIntArray10[local84];
					@Pc(98) int local98 = this.anIntArray10[local84 + 1];
					@Pc(105) int local105 = this.aShortArray2[local91] & 0xFFFF;
					if (local105 == 65535) {
						local105 = -1;
					}
					this.aClass5_Sub2_1.method4990(this.aClass164_2 != null, local105);
					this.aClass5_Sub2_1.method4968(this.aClass2_1.anInterface15_1, local91 * 3, (local98 - local91) * 3);
				}
			}
		}
		this.method966();
	}

	@OriginalMember(owner = "client!am", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort11;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5429(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class17_Sub1 local8 = (Class17_Sub1) arg0;
		if (this.anInt874 == 0 || local8.anInt874 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt871;
		@Pc(24) int[] local24 = local8.anIntArray13;
		@Pc(27) int[] local27 = local8.anIntArray12;
		@Pc(30) int[] local30 = local8.anIntArray14;
		@Pc(33) short[] local33 = local8.lb;
		@Pc(36) short[] local36 = local8.aShortArray5;
		@Pc(39) short[] local39 = local8.aShortArray4;
		@Pc(42) byte[] local42 = local8.aByteArray3;
		@Pc(49) short[] local49;
		@Pc(57) short[] local57;
		@Pc(61) short[] local61;
		@Pc(53) byte[] local53;
		if (this.aClass179_1 == null) {
			local49 = null;
			local57 = null;
			local53 = null;
			local61 = null;
		} else {
			local49 = this.aClass179_1.aShortArray74;
			local53 = this.aClass179_1.aByteArray58;
			local57 = this.aClass179_1.aShortArray73;
			local61 = this.aClass179_1.aShortArray72;
		}
		@Pc(76) short[] local76;
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(80) byte[] local80;
		if (local8.aClass179_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass179_1.aByteArray58;
			local76 = local8.aClass179_1.aShortArray74;
			local82 = local8.aClass179_1.aShortArray72;
			local78 = local8.aClass179_1.aShortArray73;
		}
		@Pc(103) int[] local103 = local8.anIntArray11;
		@Pc(106) short[] local106 = local8.aShortArray6;
		if (!local8.aBoolean65) {
			local8.method961();
		}
		@Pc(115) short local115 = local8.aShort11;
		@Pc(118) short local118 = local8.aShort3;
		@Pc(121) short local121 = local8.aShort6;
		@Pc(124) short local124 = local8.aShort2;
		@Pc(127) short local127 = local8.aShort8;
		@Pc(130) short local130 = local8.aShort7;
		for (@Pc(132) int local132 = 0; local132 < this.anInt871; local132++) {
			@Pc(142) int local142 = this.anIntArray12[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(161) int local161 = this.anIntArray13[local132] - arg1;
				if (local121 <= local161 && local124 >= local161) {
					@Pc(181) int local181 = this.anIntArray14[local132] - arg3;
					if (local181 >= local127 && local181 <= local130) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray11[local132];
						@Pc(207) int local207 = this.anIntArray11[local132 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray6[local209] - 1;
							if (local195 == -1 || this.aByteArray3[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local21; local242++) {
								if (local161 == local24[local242] && local181 == local30[local242] && local142 == local27[local242]) {
									local207 = local103[local242 + 1];
									@Pc(271) int local271 = -1;
									local200 = local103[local242];
									for (@Pc(277) int local277 = local200; local277 < local207; local277++) {
										local271 = local106[local277] - 1;
										if (local271 == -1 || local42[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local49 == null) {
											this.aClass179_1 = new Class179();
											local49 = this.aClass179_1.aShortArray74 = Static221.method3708(this.lb);
											local57 = this.aClass179_1.aShortArray73 = Static221.method3708(this.aShortArray5);
											local61 = this.aClass179_1.aShortArray72 = Static221.method3708(this.aShortArray4);
											local53 = this.aClass179_1.aByteArray58 = Static163.method2898(this.aByteArray3);
										}
										if (local76 == null) {
											@Pc(354) Class179 local354 = local8.aClass179_1 = new Class179();
											local76 = local354.aShortArray74 = Static221.method3708(local33);
											local78 = local354.aShortArray73 = Static221.method3708(local36);
											local82 = local354.aShortArray72 = Static221.method3708(local39);
											local80 = local354.aByteArray58 = Static163.method2898(local42);
										}
										@Pc(387) short local387 = this.lb[local195];
										@Pc(392) short local392 = this.aShortArray5[local195];
										@Pc(397) short local397 = this.aShortArray4[local195];
										@Pc(402) byte local402 = this.aByteArray3[local195];
										local200 = local103[local242];
										local207 = local103[local242 + 1];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local200; local414 < local207; local414++) {
											local422 = local106[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local80[local422] != 0) {
												local76[local422] += local387;
												local78[local422] += local392;
												local82[local422] += local397;
												local80[local422] += local402;
											}
										}
										local392 = local36[local271];
										local207 = this.anIntArray11[local132 + 1];
										local402 = local42[local271];
										local397 = local39[local271];
										local387 = local33[local271];
										local200 = this.anIntArray11[local132];
										for (local422 = local200; local422 < local207; local422++) {
											@Pc(504) int local504 = this.aShortArray6[local422] - 1;
											if (local504 == -1) {
												break;
											}
											if (local53[local504] != 0) {
												local49[local504] += local387;
												local57[local504] += local392;
												local61[local504] += local397;
												local53[local504] += local402;
											}
										}
										if (this.aClass164_2 == null && this.aClass164_3 != null) {
											this.aClass164_3.anInterface14_4 = null;
										}
										if (this.aClass164_2 != null) {
											this.aClass164_2.anInterface14_4 = null;
										}
										if (local8.aClass164_2 == null && local8.aClass164_3 != null) {
											local8.aClass164_3.anInterface14_4 = null;
										}
										if (local8.aClass164_2 != null) {
											local8.aClass164_2.anInterface14_4 = null;
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

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIZIILclient!sk;I)Z")
	private boolean method968(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class39 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class39_Sub2 local8 = (Class39_Sub2) arg4;
		@Pc(18) Class39_Sub2 local18 = this.aClass5_Sub2_1.aClass39_Sub2_3;
		@Pc(39) float local39 = local18.aFloat175 + local8.aFloat174 * local18.aFloat173 + local8.aFloat178 * local18.aFloat168 + local8.aFloat175 * local18.aFloat167;
		@Pc(60) float local60 = local18.aFloat178 + local18.aFloat169 * local8.aFloat175 + local8.aFloat178 * local18.aFloat177 + local8.aFloat174 * local18.aFloat170;
		Static610.aFloat207 = local18.aFloat168 * local8.aFloat170 + local18.aFloat167 * local8.aFloat173 + local18.aFloat173 * local8.aFloat176;
		Static362.aFloat160 = local8.aFloat170 * local18.aFloat171 + local8.aFloat173 * local18.aFloat172 + local8.aFloat176 * local18.aFloat176;
		Static624.aFloat212 = local8.aFloat167 * local18.aFloat172 + local8.aFloat169 * local18.aFloat171 + local8.aFloat172 * local18.aFloat176;
		Static111.aFloat75 = local8.aFloat169 * local18.aFloat168 + local18.aFloat167 * local8.aFloat167 + local8.aFloat172 * local18.aFloat173;
		Static347.aFloat157 = local18.aFloat167 * local8.aFloat168 + local18.aFloat168 * local8.aFloat177 + local18.aFloat173 * local8.aFloat171;
		@Pc(171) float local171 = local18.aFloat174 + local18.aFloat176 * local8.aFloat174 + local18.aFloat172 * local8.aFloat175 + local8.aFloat178 * local18.aFloat171;
		Static70.aFloat135 = local8.aFloat168 * local18.aFloat169 + local8.aFloat177 * local18.aFloat177 + local8.aFloat171 * local18.aFloat170;
		Static319.aFloat132 = local18.aFloat170 * local8.aFloat172 + local18.aFloat177 * local8.aFloat169 + local18.aFloat169 * local8.aFloat167;
		Static342.aFloat154 = local18.aFloat169 * local8.aFloat173 + local8.aFloat170 * local18.aFloat177 + local18.aFloat170 * local8.aFloat176;
		Static346.aFloat155 = local8.aFloat177 * local18.aFloat171 + local18.aFloat172 * local8.aFloat168 + local18.aFloat176 * local8.aFloat171;
		@Pc(245) boolean local245 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass5_Sub2_1.anInt5676;
		@Pc(261) int local261 = this.aClass5_Sub2_1.anInt5664;
		if (!this.aBoolean65) {
			this.method961();
		}
		@Pc(276) int local276 = this.aShort2 - this.aShort6 >> 1;
		@Pc(285) int local285 = this.aShort3 - this.aShort11 >> 1;
		@Pc(294) int local294 = this.aShort7 - this.aShort8 >> 1;
		@Pc(299) int local299 = this.aShort6 + local276;
		@Pc(304) int local304 = this.aShort11 + local285;
		@Pc(309) int local309 = local294 + this.aShort8;
		@Pc(316) int local316 = local299 - (local276 << arg5);
		@Pc(322) int local322 = local304 - (local285 << arg5);
		@Pc(329) int local329 = local309 - (local294 << arg5);
		@Pc(335) int local335 = (local276 << arg5) + local299;
		@Pc(341) int local341 = (local285 << arg5) + local304;
		@Pc(347) int local347 = (local294 << arg5) + local309;
		Static288.anIntArray277[0] = local316;
		Static147.anIntArray140[0] = local322;
		Static43.anIntArray36[0] = local329;
		Static288.anIntArray277[1] = local335;
		Static147.anIntArray140[1] = local322;
		Static43.anIntArray36[1] = local329;
		Static288.anIntArray277[2] = local316;
		Static147.anIntArray140[2] = local341;
		Static288.anIntArray277[3] = local335;
		Static43.anIntArray36[2] = local329;
		Static147.anIntArray140[3] = local341;
		Static288.anIntArray277[4] = local316;
		Static43.anIntArray36[3] = local329;
		Static147.anIntArray140[4] = local322;
		Static288.anIntArray277[5] = local335;
		Static43.anIntArray36[4] = local347;
		Static147.anIntArray140[5] = local322;
		Static43.anIntArray36[5] = local347;
		Static288.anIntArray277[6] = local316;
		Static147.anIntArray140[6] = local341;
		Static43.anIntArray36[6] = local347;
		Static288.anIntArray277[7] = local335;
		Static147.anIntArray140[7] = local341;
		Static43.anIntArray36[7] = local347;
		@Pc(504) float local504;
		@Pc(490) float local490;
		@Pc(476) float local476;
		@Pc(452) float local452;
		@Pc(462) float local462;
		@Pc(457) float local457;
		for (@Pc(445) int local445 = 0; local445 < 8; local445++) {
			local452 = Static288.anIntArray277[local445];
			local457 = Static43.anIntArray36[local445];
			local462 = Static147.anIntArray140[local445];
			local476 = local452 * Static624.aFloat212 + local462 * Static346.aFloat155 + local457 * Static362.aFloat160 + local171;
			local490 = local452 * Static319.aFloat132 + local462 * Static70.aFloat135 + Static342.aFloat154 * local457 + local60;
			local504 = local39 + local457 * Static610.aFloat207 + Static111.aFloat75 * local452 + local462 * Static347.aFloat157;
			if ((float) this.aClass5_Sub2_1.anInt5665 <= local476) {
				if (arg0 > 0) {
					local476 = arg0;
				}
				@Pc(528) float local528 = (float) this.aClass5_Sub2_1.anInt5659 + (float) local257 * local504 / local476;
				if (local528 > local249) {
					local249 = local528;
				}
				if (local528 < local247) {
					local247 = local528;
				}
				@Pc(552) float local552 = (float) local261 * local490 / local476 + (float) this.aClass5_Sub2_1.anInt5689;
				local245 = true;
				if (local251 > local552) {
					local251 = local552;
				}
				if (local552 > local253) {
					local253 = local552;
				}
			}
		}
		if (local245 && (float) arg3 > local247 && (float) arg3 < local249 && local251 < (float) arg2 && local253 > (float) arg2) {
			if (arg1) {
				return true;
			}
			if (this.aClass5_Sub2_1.anIntArray300.length < this.anInt872) {
				this.aClass5_Sub2_1.anIntArray301 = new int[this.anInt872];
				this.aClass5_Sub2_1.anIntArray300 = new int[this.anInt872];
			}
			@Pc(623) int[] local623 = this.aClass5_Sub2_1.anIntArray300;
			@Pc(627) int[] local627 = this.aClass5_Sub2_1.anIntArray301;
			@Pc(719) int local719;
			for (@Pc(629) int local629 = 0; local629 < this.anInt871; local629++) {
				local457 = this.anIntArray14[local629];
				local452 = this.anIntArray13[local629];
				local462 = this.anIntArray12[local629];
				local476 = Static362.aFloat160 * local457 + local462 * Static346.aFloat155 + local452 * Static624.aFloat212 + local171;
				local504 = local457 * Static610.aFloat207 + Static111.aFloat75 * local452 + local462 * Static347.aFloat157 + local39;
				local490 = local60 + local462 * Static70.aFloat135 + local452 * Static319.aFloat132 + Static342.aFloat154 * local457;
				@Pc(732) int local732;
				@Pc(737) int local737;
				@Pc(744) int local744;
				if ((float) this.aClass5_Sub2_1.anInt5665 <= local476) {
					if (arg0 > 0) {
						local476 = arg0;
					}
					local719 = (int) (local504 * (float) local257 / local476 + (float) this.aClass5_Sub2_1.anInt5659);
					local732 = (int) ((float) this.aClass5_Sub2_1.anInt5689 + (float) local261 * local490 / local476);
					local737 = this.anIntArray11[local629];
					local744 = this.anIntArray11[local629 + 1];
					for (@Pc(746) int local746 = local737; local746 < local744; local746++) {
						@Pc(755) int local755 = this.aShortArray6[local746] - 1;
						if (local755 == -1) {
							break;
						}
						local623[local755] = local719;
						local627[local755] = local732;
					}
				} else {
					local719 = this.anIntArray11[local629];
					local732 = this.anIntArray11[local629 + 1];
					for (local737 = local719; local737 < local732; local737++) {
						local744 = this.aShortArray6[local737] - 1;
						if (local744 == -1) {
							break;
						}
						local623[this.aShortArray6[local737] - 1] = -999999;
					}
				}
			}
			for (local719 = 0; local719 < this.anInt874; local719++) {
				if (local623[this.aShortArray3[local719]] != -999999 && local623[this.aShortArray7[local719]] != -999999 && local623[this.aShortArray1[local719]] != -999999 && this.method962(arg2, local623[this.aShortArray7[local719]], local627[this.aShortArray3[local719]], local623[this.aShortArray1[local719]], local623[this.aShortArray3[local719]], arg3, local627[this.aShortArray1[local719]], local627[this.aShortArray7[local719]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!am", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort9;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZB)V")
	private void method969(@OriginalArg(0) boolean arg0) {
		if (this.anInt849 * 6 > this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3.aByteArray54.length) {
			this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3 = new Class3_Sub3_Sub1((this.anInt849 + 100) * 6);
		} else {
			this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3.anInt4736 = 0;
		}
		@Pc(46) Class3_Sub3_Sub1 local46 = this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3;
		@Pc(52) int local52;
		if (this.aClass5_Sub2_1.aBoolean387) {
			for (local52 = 0; local52 < this.anInt849; local52++) {
				local46.method4201(this.aShortArray3[local52]);
				local46.method4201(this.aShortArray7[local52]);
				local46.method4201(this.aShortArray1[local52]);
			}
		} else {
			for (local52 = 0; local52 < this.anInt849; local52++) {
				local46.method4257(this.aShortArray3[local52]);
				local46.method4257(this.aShortArray7[local52]);
				local46.method4257(this.aShortArray1[local52]);
			}
		}
		if (local46.anInt4736 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_2 == null) {
				this.anInterface15_2 = this.aClass5_Sub2_1.method4972(local46.anInt4736, true, local46.aByteArray54);
			} else {
				this.anInterface15_2.method8705(local46.anInt4736, local46.aByteArray54);
			}
			this.aClass2_1.anInterface15_1 = this.anInterface15_2;
		} else {
			this.aClass2_1.anInterface15_1 = this.aClass5_Sub2_1.method4972(local46.anInt4736, false, local46.aByteArray54);
		}
		if (!arg0) {
			this.aBoolean68 = true;
		}
	}

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean65) {
			this.method961();
		}
		@Pc(16) int local16 = this.aShort6 + arg4;
		@Pc(21) int local21 = arg4 + this.aShort2;
		@Pc(26) int local26 = this.aShort8 + arg6;
		@Pc(31) int local31 = this.aShort7 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9118 + local21 >> arg2.anInt9117 >= arg2.anInt9121 || local26 < 0 || arg2.anInt9118 + local31 >> arg2.anInt9117 >= arg2.anInt9115)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9121 <= local21 + arg3.anInt9118 >> arg3.anInt9117 || local26 < 0 || local31 + arg3.anInt9118 >> arg3.anInt9117 >= arg3.anInt9115) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9117;
			local21 = local21 + arg2.anInt9118 - 1 >> arg2.anInt9117;
			local26 >>= arg2.anInt9117;
			local31 = arg2.anInt9118 + local31 - 1 >> arg2.anInt9117;
			if (arg5 == arg2.method7835(local16, local26) && arg2.method7835(local21, local26) == arg5 && arg5 == arg2.method7835(local16, local31) && arg5 == arg2.method7835(local21, local31)) {
				return;
			}
		}
		@Pc(191) int local191;
		if (arg0 == 1) {
			for (local191 = 0; local191 < this.anInt871; local191++) {
				this.anIntArray12[local191] = this.anIntArray12[local191] + arg2.method7839(arg4 + this.anIntArray13[local191], arg6 + this.anIntArray14[local191]) - arg5;
			}
		} else {
			@Pc(241) int local241;
			@Pc(252) int local252;
			if (arg0 == 2) {
				@Pc(233) short local233 = this.aShort11;
				if (local233 == 0) {
					return;
				}
				for (local241 = 0; local241 < this.anInt871; local241++) {
					local252 = (this.anIntArray12[local241] << 16) / local233;
					if (local252 < arg1) {
						this.anIntArray12[local241] += (arg2.method7839(this.anIntArray13[local241] + arg4, this.anIntArray14[local241] + arg6) - arg5) * (arg1 - local252) / arg1;
					}
				}
			} else {
				@Pc(338) int local338;
				if (arg0 == 3) {
					local191 = (arg1 & 0xFF) * 4;
					local241 = (arg1 >> 8 & 0xFF) * 4;
					local252 = (arg1 >> 16 & 0xFF) << 6;
					local338 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local191 >> 1) < 0 || (local191 >> 1) + arg4 + arg2.anInt9118 >= arg2.anInt9121 << arg2.anInt9117 || arg6 - (local241 >> 1) < 0 || arg2.anInt9115 << arg2.anInt9117 <= (local241 >> 1) + arg6 + arg2.anInt9118) {
						return;
					}
					this.method5412(arg6, arg5, arg2, arg4, local338, local241, local252, local191);
				} else if (arg0 == 4) {
					local191 = this.aShort3 - this.aShort11;
					for (local241 = 0; local241 < this.anInt871; local241++) {
						this.anIntArray12[local241] = local191 + this.anIntArray12[local241] + arg3.method7839(this.anIntArray13[local241] + arg4, this.anIntArray14[local241] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local191 = this.aShort3 - this.aShort11;
					for (local241 = 0; local241 < this.anInt871; local241++) {
						local252 = this.anIntArray13[local241] + arg4;
						local338 = this.anIntArray14[local241] + arg6;
						@Pc(344) int local344 = arg2.method7839(local252, local338);
						@Pc(350) int local350 = arg3.method7839(local252, local338);
						@Pc(358) int local358 = local344 - local350 - arg1;
						this.anIntArray12[local241] = local344 + ((this.anIntArray12[local241] << 8) / local191 * local358 >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
		this.aBoolean65 = false;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "()[Lclient!qv;")
	@Override
	public Class284[] method5417() {
		return this.aClass284Array1;
	}

	@OriginalMember(owner = "client!am", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt871; local3++) {
			if (arg0 != 128) {
				this.anIntArray13[local3] = arg0 * this.anIntArray13[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray12[local3] = arg1 * this.anIntArray12[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray14[local3] = this.anIntArray14[local3] * arg2 >> 7;
			}
		}
		this.aBoolean65 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort7;
	}

	@OriginalMember(owner = "client!am", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt871; local15++) {
			local34 = this.anIntArray14[local15] * local9 + local13 * this.anIntArray13[local15] >> 14;
			this.anIntArray14[local15] = this.anIntArray14[local15] * local13 - local9 * this.anIntArray13[local15] >> 14;
			this.anIntArray13[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt872; local34++) {
			@Pc(85) int local85 = this.aShortArray4[local34] * local9 + local13 * this.lb[local34] >> 14;
			this.aShortArray4[local34] = (short) (local13 * this.aShortArray4[local34] - local9 * this.lb[local34] >> 14);
			this.lb[local34] = (short) local85;
		}
		if (this.aClass164_2 == null && this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
		}
		if (this.aClass164_2 != null) {
			this.aClass164_2.anInterface14_4 = null;
		}
		this.aBoolean65 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort4;
	}

	@OriginalMember(owner = "client!am", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort2;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!sk;IZ)V")
	@Override
	public void method5410(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray8 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt871; local14++) {
			if ((this.aShortArray8[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method7250(this.anIntArray13[local14], this.anIntArray12[local14], this.anIntArray14[local14], local12);
				} else {
					arg0.method7254(this.anIntArray13[local14], this.anIntArray12[local14], this.anIntArray14[local14], local12);
				}
				this.anIntArray13[local14] = local12[0];
				this.anIntArray12[local14] = local12[1];
				this.anIntArray14[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt874; local3++) {
			local12 = this.aShortArray9[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			@Pc(43) int local43 = local12 & 0x7F;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			if (arg2 != -1) {
				local43 += (arg2 - local43) * arg3 >> 7;
			}
			this.aShortArray9[local3] = (short) (local43 | local24 << 7 | local18 << 10);
		}
		if (this.aClass137Array1 != null) {
			for (local12 = 0; local12 < this.anInt913; local12++) {
				@Pc(111) Class137 local111 = this.aClass137Array1[local12];
				@Pc(116) Class116 local116 = this.aClass116Array1[local12];
				local116.anInt3225 = local116.anInt3225 & 0xFF000000 | Static159.anIntArray159[this.aShortArray9[local111.anInt4038] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort10 = (short) arg0;
		if (this.aClass164_3 != null) {
			this.aClass164_3.anInterface14_4 = null;
		}
		if (this.aClass164_2 != null) {
			this.aClass164_2.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(ZB)V")
	private void method971(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass164_3 != null && this.aClass164_3.anInterface14_4 == null;
		@Pc(27) boolean local27 = this.aClass164_2 != null && this.aClass164_2.anInterface14_4 == null;
		@Pc(38) boolean local38 = this.aClass164_4 != null && this.aClass164_4.anInterface14_4 == null;
		@Pc(55) boolean local55 = this.aClass164_1 != null && this.aClass164_1.anInterface14_4 == null;
		if (arg0) {
			local27 &= (this.aByte5 & 0x4) != 0;
			local16 &= (this.aByte5 & 0x2) != 0;
			local55 &= (this.aByte5 & 0x8) != 0;
			local38 &= (this.aByte5 & 0x1) != 0;
		}
		@Pc(115) byte local115 = 0;
		@Pc(119) byte local119 = 0;
		@Pc(121) byte local121 = 0;
		if (local38) {
			local115 = 12;
		}
		@Pc(132) byte local132 = 0;
		if (local16) {
			local119 = local115;
			local115 = (byte) (local115 + 4);
		}
		if (local27) {
			local121 = local115;
			local115 = (byte) (local115 + 12);
		}
		if (local55) {
			local132 = local115;
			local115 = (byte) (local115 + 8);
		}
		if (local115 == 0) {
			return;
		}
		if (local115 * this.anInt872 > this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3.aByteArray54.length) {
			this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3 = new Class3_Sub3_Sub1(local115 * (this.anInt872 + 100));
		} else {
			this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3.anInt4736 = 0;
		}
		@Pc(195) Class3_Sub3_Sub1 local195 = this.aClass5_Sub2_1.aClass3_Sub3_Sub1_3;
		@Pc(203) int local203;
		@Pc(212) int local212;
		@Pc(240) int local240;
		@Pc(249) int local249;
		if (local38) {
			@Pc(219) int local219;
			@Pc(226) int local226;
			@Pc(231) int local231;
			@Pc(238) int local238;
			if (this.aClass5_Sub2_1.aBoolean387) {
				for (local203 = 0; local203 < this.anInt871; local203++) {
					local212 = Stream.floatToRawIntBits((float) this.anIntArray13[local203]);
					local219 = Stream.floatToRawIntBits((float) this.anIntArray12[local203]);
					local226 = Stream.floatToRawIntBits((float) this.anIntArray14[local203]);
					local231 = this.anIntArray11[local203];
					local238 = this.anIntArray11[local203 + 1];
					for (local240 = local231; local240 < local238; local240++) {
						local249 = this.aShortArray6[local240] - 1;
						if (local249 == -1) {
							break;
						}
						local195.anInt4736 = local115 * local249;
						local195.method4265(local212);
						local195.method4265(local219);
						local195.method4265(local226);
					}
				}
			} else {
				for (local203 = 0; local203 < this.anInt871; local203++) {
					local212 = Stream.floatToRawIntBits((float) this.anIntArray13[local203]);
					local219 = Stream.floatToRawIntBits((float) this.anIntArray12[local203]);
					local226 = Stream.floatToRawIntBits((float) this.anIntArray14[local203]);
					local231 = this.anIntArray11[local203];
					local238 = this.anIntArray11[local203 + 1];
					for (local240 = local231; local240 < local238; local240++) {
						local249 = this.aShortArray6[local240] - 1;
						if (local249 == -1) {
							break;
						}
						local195.anInt4736 = local249 * local115;
						local195.method4261(local212);
						local195.method4261(local219);
						local195.method4261(local226);
					}
				}
			}
		}
		@Pc(574) float local574;
		@Pc(453) short[] local453;
		@Pc(456) short[] local456;
		@Pc(450) short[] local450;
		@Pc(447) byte[] local447;
		@Pc(607) float local607;
		if (local16) {
			if (this.aClass164_2 == null) {
				if (this.aClass179_1 == null) {
					local447 = this.aByteArray3;
					local450 = this.aShortArray4;
					local453 = this.lb;
					local456 = this.aShortArray5;
				} else {
					local453 = this.aClass179_1.aShortArray74;
					local450 = this.aClass179_1.aShortArray72;
					local447 = this.aClass179_1.aByteArray58;
					local456 = this.aClass179_1.aShortArray73;
				}
				@Pc(480) float local480 = this.aClass5_Sub2_1.aFloatArray38[0];
				@Pc(486) float local486 = this.aClass5_Sub2_1.aFloatArray38[1];
				@Pc(492) float local492 = this.aClass5_Sub2_1.aFloatArray38[2];
				@Pc(496) float local496 = this.aClass5_Sub2_1.aFloat118;
				@Pc(506) float local506 = this.aClass5_Sub2_1.aFloat129 * 768.0F / (float) this.aShort10;
				@Pc(516) float local516 = this.aClass5_Sub2_1.aFloat112 * 768.0F / (float) this.aShort10;
				for (@Pc(518) int local518 = 0; local518 < this.anInt874; local518++) {
					@Pc(538) int local538 = this.method973(this.aShortArray9[local518], this.aShort4, this.aShortArray2[local518], this.aByteArray4[local518]);
					@Pc(549) float local549 = this.aClass5_Sub2_1.aFloat120 * (float) (local538 >> 8 & 0xFF);
					@Pc(554) short local554 = this.aShortArray3[local518];
					@Pc(563) float local563 = (float) (local538 >>> 24) * this.aClass5_Sub2_1.aFloat125;
					local574 = (float) (local538 >> 16 & 0xFF) * this.aClass5_Sub2_1.aFloat114;
					@Pc(579) short local579 = (short) local447[local554];
					if (local579 == 0) {
						local607 = ((float) local450[local554] * local492 + local480 * (float) local453[local554] + local486 * (float) local456[local554]) * 0.0026041667F;
					} else {
						local607 = ((float) local453[local554] * local480 + local486 * (float) local456[local554] + (float) local450[local554] * local492) / (float) (local579 * 256);
					}
					@Pc(644) float local644 = local496 + local607 * (local607 < 0.0F ? local516 : local506);
					@Pc(649) int local649 = (int) (local644 * local563);
					if (local649 < 0) {
						local649 = 0;
					} else if (local649 > 255) {
						local649 = 255;
					}
					@Pc(670) int local670 = (int) (local574 * local644);
					@Pc(675) int local675 = (int) (local549 * local644);
					if (local670 < 0) {
						local670 = 0;
					} else if (local670 > 255) {
						local670 = 255;
					}
					if (local675 < 0) {
						local675 = 0;
					} else if (local675 > 255) {
						local675 = 255;
					}
					local195.anInt4736 = local115 * local554 + local119;
					local195.method4220(local649);
					local195.method4220(local670);
					local195.method4220(local675);
					local195.method4220(255 - (this.aByteArray4[local518] & 0xFF));
					local554 = this.aShortArray7[local518];
					local579 = local447[local554];
					if (local579 == 0) {
						local607 = (local492 * (float) local450[local554] + (float) local453[local554] * local480 + local486 * (float) local456[local554]) * 0.0026041667F;
					} else {
						local607 = (local480 * (float) local453[local554] + local486 * (float) local456[local554] + local492 * (float) local450[local554]) / (float) (local579 * 256);
					}
					local644 = (local607 < 0.0F ? local516 : local506) * local607 + local496;
					local649 = (int) (local563 * local644);
					local670 = (int) (local574 * local644);
					if (local649 < 0) {
						local649 = 0;
					} else if (local649 > 255) {
						local649 = 255;
					}
					local675 = (int) (local549 * local644);
					if (local670 < 0) {
						local670 = 0;
					} else if (local670 > 255) {
						local670 = 255;
					}
					if (local675 < 0) {
						local675 = 0;
					} else if (local675 > 255) {
						local675 = 255;
					}
					local195.anInt4736 = local115 * local554 + local119;
					local195.method4220(local649);
					local195.method4220(local670);
					local195.method4220(local675);
					local195.method4220(255 - (this.aByteArray4[local518] & 0xFF));
					local554 = this.aShortArray1[local518];
					local579 = local447[local554];
					if (local579 == 0) {
						local607 = (local480 * (float) local453[local554] + (float) local456[local554] * local486 + (float) local450[local554] * local492) * 0.0026041667F;
					} else {
						local607 = (local492 * (float) local450[local554] + (float) local453[local554] * local480 + local486 * (float) local456[local554]) / (float) (local579 * 256);
					}
					local644 = local607 * (local607 < 0.0F ? local516 : local506) + local496;
					local649 = (int) (local644 * local563);
					if (local649 < 0) {
						local649 = 0;
					} else if (local649 > 255) {
						local649 = 255;
					}
					local670 = (int) (local574 * local644);
					local675 = (int) (local644 * local549);
					if (local670 < 0) {
						local670 = 0;
					} else if (local670 > 255) {
						local670 = 255;
					}
					if (local675 < 0) {
						local675 = 0;
					} else if (local675 > 255) {
						local675 = 255;
					}
					local195.anInt4736 = local119 + local554 * local115;
					local195.method4220(local649);
					local195.method4220(local670);
					local195.method4220(local675);
					local195.method4220(255 - (this.aByteArray4[local518] & 0xFF));
				}
			} else {
				for (local203 = 0; local203 < this.anInt874; local203++) {
					local212 = this.method973(this.aShortArray9[local203], this.aShort4, this.aShortArray2[local203], this.aByteArray4[local203]);
					local195.anInt4736 = local119 + local115 * this.aShortArray3[local203];
					local195.method4265(local212);
					local195.anInt4736 = local119 + this.aShortArray7[local203] * local115;
					local195.method4265(local212);
					local195.anInt4736 = local115 * this.aShortArray1[local203] + local119;
					local195.method4265(local212);
				}
			}
		}
		if (local27) {
			if (this.aClass179_1 == null) {
				local447 = this.aByteArray3;
				local456 = this.aShortArray5;
				local453 = this.lb;
				local450 = this.aShortArray4;
			} else {
				local456 = this.aClass179_1.aShortArray73;
				local450 = this.aClass179_1.aShortArray72;
				local453 = this.aClass179_1.aShortArray74;
				local447 = this.aClass179_1.aByteArray58;
			}
			@Pc(1111) float local1111 = 3.0F / (float) this.aShort10;
			local607 = 3.0F / (float) (this.aShort10 + this.aShort10 / 2);
			local195.anInt4736 = local121;
			if (this.aClass5_Sub2_1.aBoolean387) {
				for (local240 = 0; local240 < this.anInt872; local240++) {
					local249 = local447[local240] & 0xFF;
					if (local249 == 0) {
						local195.method834((float) local453[local240] * local607);
						local195.method834(local607 * (float) local456[local240]);
						local195.method834((float) local450[local240] * local607);
					} else {
						local574 = local1111 / (float) local249;
						local195.method834(local574 * (float) local453[local240]);
						local195.method834(local574 * (float) local456[local240]);
						local195.method834((float) local450[local240] * local574);
					}
					local195.anInt4736 += local115 - 12;
				}
			} else {
				for (local240 = 0; local240 < this.anInt872; local240++) {
					local249 = local447[local240] & 0xFF;
					if (local249 == 0) {
						local195.method833(local607 * (float) local453[local240]);
						local195.method833((float) local456[local240] * local607);
						local195.method833(local607 * (float) local450[local240]);
					} else {
						local574 = local1111 / (float) local249;
						local195.method833((float) local453[local240] * local574);
						local195.method833(local574 * (float) local456[local240]);
						local195.method833((float) local450[local240] * local574);
					}
					local195.anInt4736 += local115 - 12;
				}
			}
		}
		if (local55) {
			local195.anInt4736 = local132;
			if (this.aClass5_Sub2_1.aBoolean387) {
				for (local203 = 0; local203 < this.anInt872; local203++) {
					local195.method834(this.aFloatArray21[local203]);
					local195.method834(this.aFloatArray20[local203]);
					local195.anInt4736 += local115 - 8;
				}
			} else {
				for (local203 = 0; local203 < this.anInt872; local203++) {
					local195.method833(this.aFloatArray21[local203]);
					local195.method833(this.aFloatArray20[local203]);
					local195.anInt4736 += local115 - 8;
				}
			}
		}
		local195.anInt4736 = local115 * this.anInt872;
		@Pc(1403) Interface14 local1403;
		if (arg0) {
			if (this.anInterface14_1 == null) {
				this.anInterface14_1 = this.aClass5_Sub2_1.method5011(true, local195.anInt4736, local195.aByteArray54, local115);
			} else {
				this.anInterface14_1.method3805(local115, local195.anInt4736, local195.aByteArray54);
			}
			local1403 = this.anInterface14_1;
			this.aByte5 = 0;
		} else {
			local1403 = this.aClass5_Sub2_1.method5011(false, local195.anInt4736, local195.aByteArray54, local115);
			this.aBoolean68 = true;
		}
		if (local38) {
			this.aClass164_4.aByte65 = 0;
			this.aClass164_4.anInterface14_4 = local1403;
		}
		if (local55) {
			this.aClass164_1.aByte65 = local132;
			this.aClass164_1.anInterface14_4 = local1403;
		}
		if (local16) {
			this.aClass164_3.anInterface14_4 = local1403;
			this.aClass164_3.aByte65 = local119;
		}
		if (local27) {
			this.aClass164_2.anInterface14_4 = local1403;
			this.aClass164_2.aByte65 = local121;
		}
	}

	@OriginalMember(owner = "client!am", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt897;
	}

	@OriginalMember(owner = "client!am", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt871; local7++) {
			if (arg0 != 0) {
				this.anIntArray13[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray12[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray14[local7] += arg2;
			}
		}
		this.aBoolean65 = false;
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILclient!eh;)V")
	private void method972(@OriginalArg(1) Class3_Sub4_Sub5_Sub1 arg0) {
		if (this.anInt872 > this.aClass5_Sub2_1.anIntArray300.length) {
			this.aClass5_Sub2_1.anIntArray301 = new int[this.anInt872];
			this.aClass5_Sub2_1.anIntArray300 = new int[this.anInt872];
		}
		@Pc(28) int[] local28 = this.aClass5_Sub2_1.anIntArray300;
		@Pc(32) int[] local32 = this.aClass5_Sub2_1.anIntArray301;
		@Pc(59) int local59;
		@Pc(97) int local97;
		@Pc(106) int local106;
		for (@Pc(34) int local34 = 0; local34 < this.anInt871; local34++) {
			local59 = (this.anIntArray13[local34] - (this.aClass5_Sub2_1.anInt5675 * this.anIntArray12[local34] >> 8) >> this.aClass5_Sub2_1.anInt5644) - arg0.anInt2672;
			@Pc(83) int local83 = (this.anIntArray14[local34] - (this.anIntArray12[local34] * this.aClass5_Sub2_1.anInt5688 >> 8) >> this.aClass5_Sub2_1.anInt5644) - arg0.anInt2673;
			@Pc(88) int local88 = this.anIntArray11[local34];
			@Pc(95) int local95 = this.anIntArray11[local34 + 1];
			for (local97 = local88; local97 < local95; local97++) {
				local106 = this.aShortArray6[local97] - 1;
				if (local106 == -1) {
					break;
				}
				local28[local106] = local59;
				local32[local106] = local83;
			}
		}
		for (local59 = 0; local59 < this.anInt849; local59++) {
			if (this.aByteArray4 == null || this.aByteArray4[local59] <= 128) {
				@Pc(151) short local151 = this.aShortArray3[local59];
				@Pc(156) short local156 = this.aShortArray7[local59];
				@Pc(161) short local161 = this.aShortArray1[local59];
				local97 = local28[local151];
				local106 = local28[local156];
				@Pc(173) int local173 = local28[local161];
				@Pc(177) int local177 = local32[local151];
				@Pc(181) int local181 = local32[local156];
				@Pc(185) int local185 = local32[local161];
				if ((local181 - local185) * (-local106 + local97) - (local173 - local106) * (local181 + -local177) > 0) {
					arg0.method2494(local106, local173, local181, local185, local177, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(54) int local54;
		@Pc(52) int[] local52;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static515.anInt8904 = 0;
			Static411.anInt7519 = 0;
			Static513.anInt8871 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray3.length) {
					local52 = this.anIntArrayArray3[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static411.anInt7519 += this.anIntArray13[local60];
						Static513.anInt8871 += this.anIntArray12[local60];
						Static515.anInt8904 += this.anIntArray14[local60];
						local24++;
					}
				}
			}
			if (local24 > 0) {
				Static515.anInt8904 = Static515.anInt8904 / local24 + local18;
				Static513.anInt8871 = Static513.anInt8871 / local24 + local14;
				Static411.anInt7519 = local22 + Static411.anInt7519 / local24;
			} else {
				Static515.anInt8904 = local18;
				Static411.anInt7519 = local22;
				Static513.anInt8871 = local14;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray3.length) {
					local156 = this.anIntArrayArray3[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local54 = local156[local158];
						this.anIntArray13[local54] += local22;
						this.anIntArray12[local54] += local14;
						this.anIntArray14[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(277) int local277;
		@Pc(295) int local295;
		@Pc(757) int local757;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray3.length) {
					local156 = this.anIntArrayArray3[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							this.anIntArray13[local54] -= Static411.anInt7519;
							this.anIntArray12[local54] -= Static513.anInt8871;
							this.anIntArray14[local54] -= Static515.anInt8904;
							if (arg4 != 0) {
								local60 = Class21.anIntArray656[arg4];
								local277 = Class21.anIntArray655[arg4];
								local295 = local60 * this.anIntArray12[local54] + local277 * this.anIntArray13[local54] + 16383 >> 14;
								this.anIntArray12[local54] = local277 * this.anIntArray12[local54] + 16383 - this.anIntArray13[local54] * local60 >> 14;
								this.anIntArray13[local54] = local295;
							}
							if (arg2 != 0) {
								local60 = Class21.anIntArray656[arg2];
								local277 = Class21.anIntArray655[arg2];
								local295 = this.anIntArray12[local54] * local277 + 16383 - this.anIntArray14[local54] * local60 >> 14;
								this.anIntArray14[local54] = local277 * this.anIntArray14[local54] + this.anIntArray12[local54] * local60 + 16383 >> 14;
								this.anIntArray12[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class21.anIntArray656[arg3];
								local277 = Class21.anIntArray655[arg3];
								local295 = local60 * this.anIntArray14[local54] + this.anIntArray13[local54] * local277 + 16383 >> 14;
								this.anIntArray14[local54] = local277 * this.anIntArray14[local54] + 16383 - local60 * this.anIntArray13[local54] >> 14;
								this.anIntArray13[local54] = local295;
							}
							this.anIntArray13[local54] += Static411.anInt7519;
							this.anIntArray12[local54] += Static513.anInt8871;
							this.anIntArray14[local54] += Static515.anInt8904;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							this.anIntArray13[local54] -= Static411.anInt7519;
							this.anIntArray12[local54] -= Static513.anInt8871;
							this.anIntArray14[local54] -= Static515.anInt8904;
							if (arg2 != 0) {
								local60 = Class21.anIntArray656[arg2];
								local277 = Class21.anIntArray655[arg2];
								local295 = this.anIntArray12[local54] * local277 + 16383 - this.anIntArray14[local54] * local60 >> 14;
								this.anIntArray14[local54] = local60 * this.anIntArray12[local54] + this.anIntArray14[local54] * local277 + 16383 >> 14;
								this.anIntArray12[local54] = local295;
							}
							if (arg4 != 0) {
								local60 = Class21.anIntArray656[arg4];
								local277 = Class21.anIntArray655[arg4];
								local295 = local60 * this.anIntArray12[local54] + this.anIntArray13[local54] * local277 + 16383 >> 14;
								this.anIntArray12[local54] = this.anIntArray12[local54] * local277 + 16383 - this.anIntArray13[local54] * local60 >> 14;
								this.anIntArray13[local54] = local295;
							}
							if (arg3 != 0) {
								local60 = Class21.anIntArray656[arg3];
								local277 = Class21.anIntArray655[arg3];
								local295 = this.anIntArray14[local54] * local60 + this.anIntArray13[local54] * local277 + 16383 >> 14;
								this.anIntArray14[local54] = local277 * this.anIntArray14[local54] + 16383 - this.anIntArray13[local54] * local60 >> 14;
								this.anIntArray13[local54] = local295;
							}
							this.anIntArray13[local54] += Static411.anInt7519;
							this.anIntArray12[local54] += Static513.anInt8871;
							this.anIntArray14[local54] += Static515.anInt8904;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray3.length > local38) {
						local52 = this.anIntArrayArray3[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local277 = this.anIntArray11[local60];
							local295 = this.anIntArray11[local60 + 1];
							for (local757 = local277; local757 < local295; local757++) {
								@Pc(766) int local766 = this.aShortArray6[local757] - 1;
								if (local766 == -1) {
									break;
								}
								@Pc(776) int local776;
								@Pc(780) int local780;
								@Pc(798) int local798;
								if (arg4 != 0) {
									local776 = Class21.anIntArray656[arg4];
									local780 = Class21.anIntArray655[arg4];
									local798 = this.aShortArray5[local766] * local776 + this.lb[local766] * local780 + 16383 >> 14;
									this.aShortArray5[local766] = (short) (local780 * this.aShortArray5[local766] + 16383 - this.lb[local766] * local776 >> 14);
									this.lb[local766] = (short) local798;
								}
								if (arg2 != 0) {
									local776 = Class21.anIntArray656[arg2];
									local780 = Class21.anIntArray655[arg2];
									local798 = local780 * this.aShortArray5[local766] + 16383 - this.aShortArray4[local766] * local776 >> 14;
									this.aShortArray4[local766] = (short) (this.aShortArray5[local766] * local776 + local780 * this.aShortArray4[local766] + 16383 >> 14);
									this.aShortArray5[local766] = (short) local798;
								}
								if (arg3 != 0) {
									local776 = Class21.anIntArray656[arg3];
									local780 = Class21.anIntArray655[arg3];
									local798 = local776 * this.aShortArray4[local766] + local780 * this.lb[local766] + 16383 >> 14;
									this.aShortArray4[local766] = (short) (local780 * this.aShortArray4[local766] + 16383 - local776 * this.lb[local766] >> 14);
									this.lb[local766] = (short) local798;
								}
							}
						}
					}
				}
				if (this.aClass164_2 == null && this.aClass164_3 != null) {
					this.aClass164_3.anInterface14_4 = null;
				}
				if (this.aClass164_2 != null) {
					this.aClass164_2.anInterface14_4 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray3.length > local32) {
					local156 = this.anIntArrayArray3[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local54 = local156[local158];
						this.anIntArray13[local54] -= Static411.anInt7519;
						this.anIntArray12[local54] -= Static513.anInt8871;
						this.anIntArray14[local54] -= Static515.anInt8904;
						this.anIntArray13[local54] = this.anIntArray13[local54] * arg2 >> 7;
						this.anIntArray12[local54] = this.anIntArray12[local54] * arg3 >> 7;
						this.anIntArray14[local54] = arg4 * this.anIntArray14[local54] >> 7;
						this.anIntArray13[local54] += Static411.anInt7519;
						this.anIntArray12[local54] += Static513.anInt8871;
						this.anIntArray14[local54] += Static515.anInt8904;
					}
				}
			}
		} else {
			@Pc(1213) Class137 local1213;
			@Pc(1218) Class116 local1218;
			if (arg0 == 5) {
				if (this.anIntArrayArray5 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray5.length) {
							local156 = this.anIntArrayArray5[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local54 = local156[local158];
								local60 = arg2 * 8 + (this.aByteArray4[local54] & 0xFF);
								if (local60 < 0) {
									local60 = 0;
								} else if (local60 > 255) {
									local60 = 255;
								}
								this.aByteArray4[local54] = (byte) local60;
							}
							if (local156.length > 0 && this.aClass164_3 != null) {
								this.aClass164_3.anInterface14_4 = null;
							}
						}
					}
					if (this.aClass137Array1 != null) {
						for (local32 = 0; local32 < this.anInt913; local32++) {
							local1213 = this.aClass137Array1[local32];
							local1218 = this.aClass116Array1[local32];
							local1218.anInt3225 = local1218.anInt3225 & 0xFFFFFF | 255 - (this.aByteArray4[local1213.anInt4038] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1481) Class116 local1481;
				if (arg0 == 8) {
					if (this.anIntArrayArray4 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray4.length) {
								local156 = this.anIntArrayArray4[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1481 = this.aClass116Array1[local156[local158]];
									local1481.anInt3229 += arg2;
									local1481.anInt3232 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray4 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray4.length) {
								local156 = this.anIntArrayArray4[local32];
								for (local158 = 0; local158 < local156.length; local158++) {
									local1481 = this.aClass116Array1[local156[local158]];
									local1481.anInt3236 = local1481.anInt3236 * arg3 >> 7;
									local1481.anInt3227 = arg2 * local1481.anInt3227 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray4 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray4.length > local32) {
							local156 = this.anIntArrayArray4[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1481 = this.aClass116Array1[local156[local158]];
								local1481.anInt3231 = arg2 + local1481.anInt3231 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray5 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray5.length) {
						local156 = this.anIntArrayArray5[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local54 = local156[local158];
							local60 = this.aShortArray9[local54] & 0xFFFF;
							local277 = local60 >> 10 & 0x3F;
							local295 = local60 >> 7 & 0x7;
							local757 = local60 & 0x7F;
							local295 += arg3 / 4;
							@Pc(1318) int local1318 = arg2 + local277 & 0x3F;
							if (local295 < 0) {
								local295 = 0;
							} else if (local295 > 7) {
								local295 = 7;
							}
							local757 += arg4;
							if (local757 < 0) {
								local757 = 0;
							} else if (local757 > 127) {
								local757 = 127;
							}
							this.aShortArray9[local54] = (short) (local757 | local295 << 7 | local1318 << 10);
						}
						if (local156.length > 0 && this.aClass164_3 != null) {
							this.aClass164_3.anInterface14_4 = null;
						}
					}
				}
				if (this.aClass137Array1 != null) {
					for (local32 = 0; local32 < this.anInt913; local32++) {
						local1213 = this.aClass137Array1[local32];
						local1218 = this.aClass116Array1[local32];
						local1218.anInt3225 = local1218.anInt3225 & 0xFF000000 | Static159.anIntArray159[this.aShortArray9[local1213.anInt4038] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IISZB)I")
	private int method973(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(4) byte arg3) {
		@Pc(18) int local18 = Static159.anIntArray159[Static91.method2069(arg1, arg0)];
		if (arg2 != -1) {
			@Pc(31) Class195 local31 = this.aClass5_Sub2_1.anInterface7_15.method8118(arg2 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte79 & 0xFF;
			@Pc(48) int local48;
			@Pc(78) int local78;
			if (local36 != 0) {
				if (arg1 < 0) {
					local48 = 0;
				} else if (arg1 <= 127) {
					local48 = arg1 * 131586;
				} else {
					local48 = 16777215;
				}
				if (local36 == 256) {
					local18 = local48;
				} else {
					local78 = 256 - local36;
					local18 = (local78 * (local18 & 0xFF00) + (local48 & 0xFF00) * local36 & 0xFF0000) + (local78 * (local18 & 0xFF00FF) + local36 * (local48 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local48 = local31.aByte84 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(124) int local124 = (local18 >> 16 & 0xFF) * local48;
				if (local124 > 65535) {
					local124 = 65535;
				}
				local78 = (local18 >> 8 & 0xFF) * local48;
				if (local78 > 65535) {
					local78 = 65535;
				}
				@Pc(152) int local152 = (local18 & 0xFF) * local48;
				if (local152 > 65535) {
					local152 = 65535;
				}
				local18 = (local78 & 0xFF00) + (local124 << 8 & 0xFF008F) + (local152 >> 8);
			}
		}
		return (local18 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!sk;Lclient!nl;I)V")
	@Override
	public void method5411(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt872 == 0) {
			return;
		}
		@Pc(16) Class39_Sub2 local16 = this.aClass5_Sub2_1.aClass39_Sub2_3;
		@Pc(19) Class39_Sub2 local19 = (Class39_Sub2) arg0;
		if (!this.aBoolean65) {
			this.method961();
		}
		Static346.aFloat155 = local19.aFloat168 * local16.aFloat172 + local16.aFloat171 * local19.aFloat177 + local16.aFloat176 * local19.aFloat171;
		Static178.aFloat213 = local16.aFloat174 + local19.aFloat178 * local16.aFloat171 + local19.aFloat175 * local16.aFloat172 + local16.aFloat176 * local19.aFloat174;
		@Pc(72) float local72 = Static178.aFloat213 + Static346.aFloat155 * (float) this.aShort11;
		@Pc(80) float local80 = Static346.aFloat155 * (float) this.aShort3 + Static178.aFloat213;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local96 = (float) this.aShort9 + local72;
			local90 = local80 - (float) this.aShort9;
		} else {
			local90 = local72 - (float) this.aShort9;
			local96 = (float) this.aShort9 + local80;
		}
		if (local90 >= this.aClass5_Sub2_1.aFloat123 || local96 <= (float) this.aClass5_Sub2_1.anInt5665) {
			return;
		}
		Static260.aFloat200 = local19.aFloat178 * local16.aFloat168 + local19.aFloat175 * local16.aFloat167 + local19.aFloat174 * local16.aFloat173 + local16.aFloat175;
		Static347.aFloat157 = local19.aFloat171 * local16.aFloat173 + local19.aFloat168 * local16.aFloat167 + local16.aFloat168 * local19.aFloat177;
		@Pc(172) float local172 = Static260.aFloat200 + Static347.aFloat157 * (float) this.aShort11;
		@Pc(180) float local180 = Static347.aFloat157 * (float) this.aShort3 + Static260.aFloat200;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local180 < local172) {
			local195 = (local172 + (float) this.aShort9) * (float) this.aClass5_Sub2_1.anInt5676;
			local207 = (float) this.aClass5_Sub2_1.anInt5676 * ((float) -this.aShort9 + local180);
		} else {
			local195 = (float) this.aClass5_Sub2_1.anInt5676 * (local180 + (float) this.aShort9);
			local207 = ((float) -this.aShort9 + local172) * (float) this.aClass5_Sub2_1.anInt5676;
		}
		if (local207 / local96 >= this.aClass5_Sub2_1.aFloat130 || local195 / local96 <= this.aClass5_Sub2_1.aFloat127) {
			return;
		}
		Static347.aFloat156 = local19.aFloat175 * local16.aFloat169 + local19.aFloat178 * local16.aFloat177 + local16.aFloat170 * local19.aFloat174 + local16.aFloat178;
		Static70.aFloat135 = local19.aFloat168 * local16.aFloat169 + local19.aFloat177 * local16.aFloat177 + local16.aFloat170 * local19.aFloat171;
		@Pc(297) float local297 = Static347.aFloat156 + (float) this.aShort11 * Static70.aFloat135;
		@Pc(305) float local305 = (float) this.aShort3 * Static70.aFloat135 + Static347.aFloat156;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local332 = (float) this.aClass5_Sub2_1.anInt5664 * ((float) -this.aShort9 + local305);
			local320 = (local297 + (float) this.aShort9) * (float) this.aClass5_Sub2_1.anInt5664;
		} else {
			local320 = (float) this.aClass5_Sub2_1.anInt5664 * ((float) this.aShort9 + local305);
			local332 = (float) this.aClass5_Sub2_1.anInt5664 * ((float) -this.aShort9 + local297);
		}
		if (local332 / local96 >= this.aClass5_Sub2_1.aFloat115 || this.aClass5_Sub2_1.aFloat116 >= local320 / local96) {
			return;
		}
		if (arg1 != null || this.aClass137Array1 != null) {
			Static624.aFloat212 = local16.aFloat176 * local19.aFloat172 + local16.aFloat172 * local19.aFloat167 + local16.aFloat171 * local19.aFloat169;
			Static111.aFloat75 = local19.aFloat169 * local16.aFloat168 + local19.aFloat167 * local16.aFloat167 + local16.aFloat173 * local19.aFloat172;
			Static319.aFloat132 = local19.aFloat169 * local16.aFloat177 + local19.aFloat167 * local16.aFloat169 + local19.aFloat172 * local16.aFloat170;
			Static610.aFloat207 = local19.aFloat176 * local16.aFloat173 + local19.aFloat170 * local16.aFloat168 + local16.aFloat167 * local19.aFloat173;
			Static362.aFloat160 = local16.aFloat172 * local19.aFloat173 + local19.aFloat170 * local16.aFloat171 + local16.aFloat176 * local19.aFloat176;
			Static342.aFloat154 = local19.aFloat173 * local16.aFloat169 + local19.aFloat170 * local16.aFloat177 + local16.aFloat170 * local19.aFloat176;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(503) int local503 = this.aShort6 + this.aShort2 >> 1;
			@Pc(511) int local511 = this.aShort7 + this.aShort8 >> 1;
			@Pc(530) int local530 = (int) ((float) local503 * Static111.aFloat75 + Static260.aFloat200 + (float) this.aShort11 * Static347.aFloat157 + Static610.aFloat207 * (float) local511);
			@Pc(549) int local549 = (int) ((float) local511 * Static342.aFloat154 + Static70.aFloat135 * (float) this.aShort11 + Static347.aFloat156 + (float) local503 * Static319.aFloat132);
			@Pc(568) int local568 = (int) (Static362.aFloat160 * (float) local511 + Static346.aFloat155 * (float) this.aShort11 + Static178.aFloat213 + Static624.aFloat212 * (float) local503);
			if (local568 >= this.aClass5_Sub2_1.anInt5665) {
				arg1.anInt7142 = local530 * this.aClass5_Sub2_1.anInt5676 / local568 + this.aClass5_Sub2_1.anInt5659;
				arg1.anInt7144 = this.aClass5_Sub2_1.anInt5689 + local549 * this.aClass5_Sub2_1.anInt5664 / local568;
			} else {
				local492 = true;
			}
			@Pc(626) int local626 = (int) ((float) local511 * Static610.aFloat207 + Static260.aFloat200 + (float) local503 * Static111.aFloat75 + Static347.aFloat157 * (float) this.aShort3);
			@Pc(645) int local645 = (int) (Static70.aFloat135 * (float) this.aShort3 + Static347.aFloat156 + (float) local503 * Static319.aFloat132 + (float) local511 * Static342.aFloat154);
			@Pc(664) int local664 = (int) (Static178.aFloat213 + Static624.aFloat212 * (float) local503 + Static346.aFloat155 * (float) this.aShort3 + Static362.aFloat160 * (float) local511);
			if (local664 < this.aClass5_Sub2_1.anInt5665) {
				local492 = true;
			} else {
				arg1.anInt7145 = this.aClass5_Sub2_1.anInt5689 + this.aClass5_Sub2_1.anInt5664 * local645 / local664;
				arg1.anInt7143 = this.aClass5_Sub2_1.anInt5659 + local626 * this.aClass5_Sub2_1.anInt5676 / local664;
			}
			if (local492) {
				if (this.aClass5_Sub2_1.anInt5665 > local568 && this.aClass5_Sub2_1.anInt5665 > local664) {
					local494 = false;
				} else {
					@Pc(752) int local752;
					@Pc(764) int local764;
					@Pc(776) int local776;
					if (local568 < this.aClass5_Sub2_1.anInt5665) {
						local752 = (local664 - this.aClass5_Sub2_1.anInt5665 << 16) / (local664 - local568);
						local764 = (local752 * (local626 - local530) >> 16) + local626;
						local776 = (local752 * (local645 - local549) >> 16) + local645;
						arg1.anInt7142 = local764 * this.aClass5_Sub2_1.anInt5676 / this.aClass5_Sub2_1.anInt5665 + this.aClass5_Sub2_1.anInt5659;
						arg1.anInt7144 = this.aClass5_Sub2_1.anInt5689 + this.aClass5_Sub2_1.anInt5664 * local776 / this.aClass5_Sub2_1.anInt5665;
					} else if (this.aClass5_Sub2_1.anInt5665 > local664) {
						local752 = (local568 - this.aClass5_Sub2_1.anInt5665 << 16) / (local568 - local664);
						local764 = local530 + (local752 * (local530 - local626) >> 16);
						local776 = local549 + ((local549 - local645) * local752 >> 16);
						arg1.anInt7142 = this.aClass5_Sub2_1.anInt5659 + this.aClass5_Sub2_1.anInt5676 * local764 / this.aClass5_Sub2_1.anInt5665;
						arg1.anInt7144 = this.aClass5_Sub2_1.anInt5689 + this.aClass5_Sub2_1.anInt5664 * local776 / this.aClass5_Sub2_1.anInt5665;
					}
				}
			}
			if (local494) {
				arg1.aBoolean514 = true;
				if (local568 <= local664) {
					arg1.anInt7146 = this.aClass5_Sub2_1.anInt5676 * (local626 + this.aShort9) / local664 + this.aClass5_Sub2_1.anInt5659 - arg1.anInt7143;
				} else {
					arg1.anInt7146 = this.aClass5_Sub2_1.anInt5659 + (local530 + this.aShort9) * this.aClass5_Sub2_1.anInt5676 / local568 - arg1.anInt7142;
				}
			}
		}
		this.aClass5_Sub2_1.method5012();
		this.aClass5_Sub2_1.method4952(local19);
		this.method967();
		this.aClass5_Sub2_1.method4963();
		this.method965();
	}

	@OriginalMember(owner = "client!am", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort8;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Lclient!am;Lclient!am;ZZZI)Lclient!ka;")
	private Class17 method974(@OriginalArg(0) Class17_Sub1 arg0, @OriginalArg(1) Class17_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		arg1.anInt913 = this.anInt913;
		arg1.aShort10 = this.aShort10;
		arg1.aByte5 = 0;
		arg1.anInt856 = this.anInt856;
		arg1.anInt849 = this.anInt849;
		arg1.anInt897 = arg4;
		if ((arg4 & 0x100) == 0) {
			arg1.aBoolean67 = this.aBoolean67;
		} else {
			arg1.aBoolean67 = true;
		}
		arg1.aBoolean66 = this.aBoolean66;
		arg1.anInt872 = this.anInt872;
		arg1.anInt896 = this.anInt896;
		arg1.aShort4 = this.aShort4;
		arg1.anInt874 = this.anInt874;
		arg1.anInt871 = this.anInt871;
		@Pc(73) boolean local73 = Static384.method6205(this.anInt856, arg4);
		@Pc(79) boolean local79 = Static127.method2501(this.anInt856, arg4);
		@Pc(85) boolean local85 = Static242.method3966(this.anInt856, arg4);
		@Pc(91) boolean local91 = local85 | local73 | local79;
		@Pc(192) int local192;
		if (local91) {
			if (!local73) {
				arg1.anIntArray13 = this.anIntArray13;
			} else if (arg0.anIntArray13 == null || arg0.anIntArray13.length < this.anInt896) {
				arg1.anIntArray13 = arg0.anIntArray13 = new int[this.anInt896];
			} else {
				arg1.anIntArray13 = arg0.anIntArray13;
			}
			if (!local79) {
				arg1.anIntArray12 = this.anIntArray12;
			} else if (arg0.anIntArray12 == null || arg0.anIntArray12.length < this.anInt896) {
				arg1.anIntArray12 = arg0.anIntArray12 = new int[this.anInt896];
			} else {
				arg1.anIntArray12 = arg0.anIntArray12;
			}
			if (!local85) {
				arg1.anIntArray14 = this.anIntArray14;
			} else if (arg0.anIntArray14 == null || this.anInt896 > arg0.anIntArray14.length) {
				arg1.anIntArray14 = arg0.anIntArray14 = new int[this.anInt896];
			} else {
				arg1.anIntArray14 = arg0.anIntArray14;
			}
			for (local192 = 0; local192 < this.anInt896; local192++) {
				if (local73) {
					arg1.anIntArray13[local192] = this.anIntArray13[local192];
				}
				if (local79) {
					arg1.anIntArray12[local192] = this.anIntArray12[local192];
				}
				if (local85) {
					arg1.anIntArray14[local192] = this.anIntArray14[local192];
				}
			}
		} else {
			arg1.anIntArray13 = this.anIntArray13;
			arg1.anIntArray14 = this.anIntArray14;
			arg1.anIntArray12 = this.anIntArray12;
		}
		if (Static375.method6039(this.anInt856, arg4)) {
			arg1.aClass164_4 = arg0.aClass164_4;
			if (arg3) {
				arg1.aByte5 = (byte) (arg1.aByte5 | 0x1);
			}
			arg1.aClass164_4.anInterface14_4 = this.aClass164_4.anInterface14_4;
			arg1.aClass164_4.aByte65 = this.aClass164_4.aByte65;
		} else if (Static488.method7261(arg4, this.anInt856)) {
			arg1.aClass164_4 = this.aClass164_4;
		} else {
			arg1.aClass164_4 = null;
		}
		if (Static15.method837(arg4, this.anInt856)) {
			if (arg0.aShortArray9 == null || arg0.aShortArray9.length < this.anInt874) {
				arg1.aShortArray9 = arg0.aShortArray9 = new short[this.anInt874];
			} else {
				arg1.aShortArray9 = arg0.aShortArray9;
			}
			for (local192 = 0; local192 < this.anInt874; local192++) {
				arg1.aShortArray9[local192] = this.aShortArray9[local192];
			}
		} else {
			arg1.aShortArray9 = this.aShortArray9;
		}
		if (Static311.method6191(this.anInt856, arg4)) {
			if (arg0.aByteArray4 == null || this.anInt874 > arg0.aByteArray4.length) {
				arg1.aByteArray4 = arg0.aByteArray4 = new byte[this.anInt874];
			} else {
				arg1.aByteArray4 = arg0.aByteArray4;
			}
			for (local192 = 0; local192 < this.anInt874; local192++) {
				arg1.aByteArray4[local192] = this.aByteArray4[local192];
			}
		} else {
			arg1.aByteArray4 = this.aByteArray4;
		}
		if (Static200.method3474(this.anInt856, arg4)) {
			if (arg3) {
				arg1.aByte5 = (byte) (arg1.aByte5 | 0x2);
			}
			arg1.aClass164_3 = arg0.aClass164_3;
			arg1.aClass164_3.anInterface14_4 = this.aClass164_3.anInterface14_4;
			arg1.aClass164_3.aByte65 = this.aClass164_3.aByte65;
		} else if (Static356.method5860(this.anInt856, arg4)) {
			arg1.aClass164_3 = this.aClass164_3;
		} else {
			arg1.aClass164_3 = null;
		}
		@Pc(555) int local555;
		if (Static485.method7224(this.anInt856, arg4)) {
			if (arg0.lb == null || arg0.lb.length < this.anInt872) {
				local192 = this.anInt872;
				arg1.aShortArray5 = arg0.aShortArray5 = new short[local192];
				arg1.aShortArray4 = arg0.aShortArray4 = new short[local192];
				arg1.lb = arg0.lb = new short[local192];
			} else {
				arg1.lb = arg0.lb;
				arg1.aShortArray4 = arg0.aShortArray4;
				arg1.aShortArray5 = arg0.aShortArray5;
			}
			if (this.aClass179_1 == null) {
				for (local192 = 0; local192 < this.anInt872; local192++) {
					arg1.lb[local192] = this.lb[local192];
					arg1.aShortArray5[local192] = this.aShortArray5[local192];
					arg1.aShortArray4[local192] = this.aShortArray4[local192];
				}
			} else {
				if (arg0.aClass179_1 == null) {
					arg0.aClass179_1 = new Class179();
				}
				@Pc(543) Class179 local543 = arg1.aClass179_1 = arg0.aClass179_1;
				if (local543.aShortArray74 == null || this.anInt872 > local543.aShortArray74.length) {
					local555 = this.anInt872;
					local543.aShortArray72 = new short[local555];
					local543.aShortArray73 = new short[local555];
					local543.aShortArray74 = new short[local555];
					local543.aByteArray58 = new byte[local555];
				}
				for (local555 = 0; local555 < this.anInt872; local555++) {
					arg1.lb[local555] = this.lb[local555];
					arg1.aShortArray5[local555] = this.aShortArray5[local555];
					arg1.aShortArray4[local555] = this.aShortArray4[local555];
					local543.aShortArray74[local555] = this.aClass179_1.aShortArray74[local555];
					local543.aShortArray73[local555] = this.aClass179_1.aShortArray73[local555];
					local543.aShortArray72[local555] = this.aClass179_1.aShortArray72[local555];
					local543.aByteArray58[local555] = this.aClass179_1.aByteArray58[local555];
				}
			}
			arg1.aByteArray3 = this.aByteArray3;
		} else {
			arg1.aShortArray4 = this.aShortArray4;
			arg1.lb = this.lb;
			arg1.aByteArray3 = this.aByteArray3;
			arg1.aClass179_1 = this.aClass179_1;
			arg1.aShortArray5 = this.aShortArray5;
		}
		if (Static586.method8273(arg4, this.anInt856)) {
			if (arg3) {
				arg1.aByte5 = (byte) (arg1.aByte5 | 0x4);
			}
			arg1.aClass164_2 = arg0.aClass164_2;
			arg1.aClass164_2.anInterface14_4 = this.aClass164_2.anInterface14_4;
			arg1.aClass164_2.aByte65 = this.aClass164_2.aByte65;
		} else if (Static43.method1368(this.anInt856, arg4)) {
			arg1.aClass164_2 = this.aClass164_2;
		} else {
			arg1.aClass164_2 = null;
		}
		if (Static567.method8640(arg4, this.anInt856)) {
			if (arg0.aFloatArray21 == null || this.anInt874 > arg0.aFloatArray21.length) {
				local192 = this.anInt872;
				arg1.aFloatArray21 = arg0.aFloatArray21 = new float[local192];
				arg1.aFloatArray20 = arg0.aFloatArray20 = new float[local192];
			} else {
				arg1.aFloatArray20 = arg0.aFloatArray20;
				arg1.aFloatArray21 = arg0.aFloatArray21;
			}
			for (local192 = 0; local192 < this.anInt872; local192++) {
				arg1.aFloatArray21[local192] = this.aFloatArray21[local192];
				arg1.aFloatArray20[local192] = this.aFloatArray20[local192];
			}
		} else {
			arg1.aFloatArray21 = this.aFloatArray21;
			arg1.aFloatArray20 = this.aFloatArray20;
		}
		if (Static72.method1725(arg4, this.anInt856)) {
			arg1.aClass164_1 = arg0.aClass164_1;
			if (arg3) {
				arg1.aByte5 = (byte) (arg1.aByte5 | 0x8);
			}
			arg1.aClass164_1.anInterface14_4 = this.aClass164_1.anInterface14_4;
			arg1.aClass164_1.aByte65 = this.aClass164_1.aByte65;
		} else if (Static192.method3266(arg4, this.anInt856)) {
			arg1.aClass164_1 = this.aClass164_1;
		} else {
			arg1.aClass164_1 = null;
		}
		if (Static323.method5277(this.anInt856, arg4)) {
			if (arg0.aShortArray3 == null || this.anInt874 > arg0.aShortArray3.length) {
				local192 = this.anInt874;
				arg1.aShortArray3 = arg0.aShortArray3 = new short[local192];
				arg1.aShortArray1 = arg0.aShortArray1 = new short[local192];
				arg1.aShortArray7 = arg0.aShortArray7 = new short[local192];
			} else {
				arg1.aShortArray3 = arg0.aShortArray3;
				arg1.aShortArray7 = arg0.aShortArray7;
				arg1.aShortArray1 = arg0.aShortArray1;
			}
			for (local192 = 0; local192 < this.anInt874; local192++) {
				arg1.aShortArray3[local192] = this.aShortArray3[local192];
				arg1.aShortArray7[local192] = this.aShortArray7[local192];
				arg1.aShortArray1[local192] = this.aShortArray1[local192];
			}
		} else {
			arg1.aShortArray1 = this.aShortArray1;
			arg1.aShortArray7 = this.aShortArray7;
			arg1.aShortArray3 = this.aShortArray3;
		}
		if (Static206.method3538(this.anInt856, arg4)) {
			arg1.aClass2_1 = arg0.aClass2_1;
			if (arg3) {
				arg1.aByte5 = (byte) (arg1.aByte5 | 0x10);
			}
			arg1.aClass2_1.anInterface15_1 = this.aClass2_1.anInterface15_1;
		} else if (Static369.method5998(arg4, this.anInt856)) {
			arg1.aClass2_1 = this.aClass2_1;
		} else {
			arg1.aClass2_1 = null;
		}
		if (Static414.method6550(this.anInt856, arg4)) {
			if (arg0.aShortArray2 == null || arg0.aShortArray2.length < this.anInt874) {
				local192 = this.anInt874;
				arg1.aShortArray2 = arg0.aShortArray2 = new short[local192];
			} else {
				arg1.aShortArray2 = arg0.aShortArray2;
			}
			for (local192 = 0; local192 < this.anInt874; local192++) {
				arg1.aShortArray2[local192] = this.aShortArray2[local192];
			}
		} else {
			arg1.aShortArray2 = this.aShortArray2;
		}
		if (!Static605.method8441(this.anInt856, arg4)) {
			arg1.aClass116Array1 = this.aClass116Array1;
		} else if (arg0.aClass116Array1 == null || arg0.aClass116Array1.length < this.anInt913) {
			local192 = this.anInt913;
			arg1.aClass116Array1 = arg0.aClass116Array1 = new Class116[local192];
			for (local555 = 0; local555 < this.anInt913; local555++) {
				arg1.aClass116Array1[local555] = this.aClass116Array1[local555].method2916();
			}
		} else {
			arg1.aClass116Array1 = arg0.aClass116Array1;
			for (local192 = 0; local192 < this.anInt913; local192++) {
				arg1.aClass116Array1[local192].method2917(this.aClass116Array1[local192]);
			}
		}
		arg1.anIntArrayArray4 = this.anIntArrayArray4;
		arg1.aClass353Array1 = this.aClass353Array1;
		arg1.aShortArray8 = this.aShortArray8;
		arg1.aClass137Array1 = this.aClass137Array1;
		arg1.anIntArrayArray5 = this.anIntArrayArray5;
		arg1.aClass284Array1 = this.aClass284Array1;
		arg1.anIntArray11 = this.anIntArray11;
		if (this.aBoolean65) {
			arg1.aShort11 = this.aShort11;
			arg1.aShort6 = this.aShort6;
			arg1.aShort9 = this.aShort9;
			arg1.aShort7 = this.aShort7;
			arg1.aBoolean65 = true;
			arg1.aShort8 = this.aShort8;
			arg1.aShort5 = this.aShort5;
			arg1.aShort3 = this.aShort3;
			arg1.aShort2 = this.aShort2;
		} else {
			arg1.aBoolean65 = false;
		}
		arg1.anIntArray10 = this.anIntArray10;
		arg1.anIntArrayArray3 = this.anIntArrayArray3;
		arg1.aShortArray6 = this.aShortArray6;
		arg1.aShortArray10 = this.aShortArray10;
		return arg1;
	}

	@OriginalMember(owner = "client!am", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray3 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt896; local12++) {
			this.anIntArray13[local12] <<= 0x4;
			this.anIntArray12[local12] <<= 0x4;
			this.anIntArray14[local12] <<= 0x4;
		}
		Static411.anInt7519 = 0;
		Static513.anInt8871 = 0;
		Static515.anInt8904 = 0;
		return true;
	}

	@OriginalMember(owner = "client!am", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt896; local7++) {
			this.anIntArray13[local7] = this.anIntArray13[local7] + 7 >> 4;
			this.anIntArray12[local7] = this.anIntArray12[local7] + 7 >> 4;
			this.anIntArray14[local7] = this.anIntArray14[local7] + 7 >> 4;
		}
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
		this.aBoolean65 = false;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	@Override
	public boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method968(arg5, arg3, arg1, arg0, arg2, arg4);
	}

	@OriginalMember(owner = "client!am", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!am", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub5 ba(@OriginalArg(0) Class3_Sub4_Sub5 arg0) {
		if (this.anInt872 == 0) {
			return null;
		}
		if (!this.aBoolean65) {
			this.method961();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass5_Sub2_1.anInt5675 > 0) {
			local40 = this.aShort6 - (this.aShort3 * this.aClass5_Sub2_1.anInt5675 >> 8) >> this.aClass5_Sub2_1.anInt5644;
			local57 = this.aShort2 - (this.aShort11 * this.aClass5_Sub2_1.anInt5675 >> 8) >> this.aClass5_Sub2_1.anInt5644;
		} else {
			local40 = this.aShort6 - (this.aShort11 * this.aClass5_Sub2_1.anInt5675 >> 8) >> this.aClass5_Sub2_1.anInt5644;
			local57 = this.aShort2 - (this.aClass5_Sub2_1.anInt5675 * this.aShort3 >> 8) >> this.aClass5_Sub2_1.anInt5644;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass5_Sub2_1.anInt5688 <= 0) {
			local113 = this.aShort8 - (this.aShort11 * this.aClass5_Sub2_1.anInt5688 >> 8) >> this.aClass5_Sub2_1.anInt5644;
			local130 = this.aShort7 - (this.aShort3 * this.aClass5_Sub2_1.anInt5688 >> 8) >> this.aClass5_Sub2_1.anInt5644;
		} else {
			local113 = this.aShort8 - (this.aShort3 * this.aClass5_Sub2_1.anInt5688 >> 8) >> this.aClass5_Sub2_1.anInt5644;
			local130 = this.aShort7 - (this.aClass5_Sub2_1.anInt5688 * this.aShort11 >> 8) >> this.aClass5_Sub2_1.anInt5644;
		}
		@Pc(172) int local172 = local57 + 1 - local40;
		@Pc(179) int local179 = local130 + 1 - local113;
		@Pc(182) Class3_Sub4_Sub5_Sub1 local182 = (Class3_Sub4_Sub5_Sub1) arg0;
		@Pc(198) Class3_Sub4_Sub5_Sub1 local198;
		if (local182 != null && local182.method2492(local172, local179)) {
			local198 = local182;
			local182.method2493();
		} else {
			local198 = new Class3_Sub4_Sub5_Sub1(this.aClass5_Sub2_1, local172, local179);
		}
		local198.method2497(local130, local113, local40, local57);
		this.method972(local198);
		return local198;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt871; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray13[local15] + local9 * this.anIntArray14[local15] >> 14;
			this.anIntArray14[local15] = this.anIntArray14[local15] * local13 - this.anIntArray13[local15] * local9 >> 14;
			this.anIntArray13[local15] = local33;
		}
		if (this.aClass164_4 != null) {
			this.aClass164_4.anInterface14_4 = null;
		}
		this.aBoolean65 = false;
	}

	@OriginalMember(owner = "client!am", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean65) {
			this.method961();
		}
		return this.aShort3;
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "()Z")
	@Override
	public boolean method5422() {
		if (this.aShortArray2 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray2.length; local12++) {
			if (this.aShortArray2[local12] != -1 && !this.aClass5_Sub2_1.anInterface7_15.method8115(this.aShortArray2[local12])) {
				return false;
			}
		}
		return true;
	}
}
