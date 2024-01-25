import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wv")
public final class Class114_Sub3 extends Class114 {

	@OriginalMember(owner = "client!wv", name = "o", descriptor = "Lclient!vt;")
	private Class383 aClass383_1;

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "S")
	private short aShort118;

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "[Lclient!nha;")
	private Class244[] aClass244Array5;

	@OriginalMember(owner = "client!wv", name = "w", descriptor = "I")
	private int anInt10613;

	@OriginalMember(owner = "client!wv", name = "x", descriptor = "[Lclient!av;")
	private Class23[] aClass23Array1;

	@OriginalMember(owner = "client!wv", name = "y", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!wv", name = "B", descriptor = "S")
	private short aShort119;

	@OriginalMember(owner = "client!wv", name = "D", descriptor = "[I")
	private int[] anIntArray615;

	@OriginalMember(owner = "client!wv", name = "E", descriptor = "[F")
	private float[] aFloatArray82;

	@OriginalMember(owner = "client!wv", name = "K", descriptor = "[I")
	private int[] anIntArray616;

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!wv", name = "S", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!wv", name = "T", descriptor = "[F")
	private float[] aFloatArray83;

	@OriginalMember(owner = "client!wv", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray94;

	@OriginalMember(owner = "client!wv", name = "Z", descriptor = "B")
	private byte aByte155;

	@OriginalMember(owner = "client!wv", name = "eb", descriptor = "[I")
	private int[] anIntArray617;

	@OriginalMember(owner = "client!wv", name = "ib", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!wv", name = "kb", descriptor = "[S")
	private short[] aShortArray151;

	@OriginalMember(owner = "client!wv", name = "qb", descriptor = "[Lclient!hba;")
	private Class146[] aClass146Array1;

	@OriginalMember(owner = "client!wv", name = "sb", descriptor = "[S")
	private short[] aShortArray152;

	@OriginalMember(owner = "client!wv", name = "tb", descriptor = "S")
	private short aShort122;

	@OriginalMember(owner = "client!wv", name = "ub", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!wv", name = "vb", descriptor = "[S")
	private short[] aShortArray153;

	@OriginalMember(owner = "client!wv", name = "xb", descriptor = "[B")
	private byte[] aByteArray111;

	@OriginalMember(owner = "client!wv", name = "yb", descriptor = "I")
	private int anInt10643;

	@OriginalMember(owner = "client!wv", name = "Ab", descriptor = "Lclient!ic;")
	private Interface8 anInterface8_7;

	@OriginalMember(owner = "client!wv", name = "Bb", descriptor = "[[I")
	private int[][] anIntArrayArray95;

	@OriginalMember(owner = "client!wv", name = "Eb", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!wv", name = "Fb", descriptor = "[I")
	private int[] anIntArray618;

	@OriginalMember(owner = "client!wv", name = "Gb", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!wv", name = "Ib", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!wv", name = "Nb", descriptor = "[S")
	private short[] aShortArray156;

	@OriginalMember(owner = "client!wv", name = "Ob", descriptor = "[S")
	private short[] aShortArray157;

	@OriginalMember(owner = "client!wv", name = "Qb", descriptor = "[[I")
	private int[][] anIntArrayArray96;

	@OriginalMember(owner = "client!wv", name = "cc", descriptor = "I")
	private int anInt10660;

	@OriginalMember(owner = "client!wv", name = "dc", descriptor = "S")
	private short aShort125;

	@OriginalMember(owner = "client!wv", name = "gc", descriptor = "S")
	private short aShort126;

	@OriginalMember(owner = "client!wv", name = "mc", descriptor = "[B")
	private byte[] aByteArray112;

	@OriginalMember(owner = "client!wv", name = "nc", descriptor = "[S")
	private short[] aShortArray158;

	@OriginalMember(owner = "client!wv", name = "tc", descriptor = "[I")
	private int[] anIntArray619;

	@OriginalMember(owner = "client!wv", name = "uc", descriptor = "Lclient!mda;")
	private Interface15 anInterface15_5;

	@OriginalMember(owner = "client!wv", name = "wc", descriptor = "[Lclient!rf;")
	private Class303[] aClass303Array5;

	@OriginalMember(owner = "client!wv", name = "zc", descriptor = "[S")
	private short[] aShortArray159;

	@OriginalMember(owner = "client!wv", name = "Bc", descriptor = "S")
	private short aShort127;

	@OriginalMember(owner = "client!wv", name = "L", descriptor = "Z")
	private boolean aBoolean790 = false;

	@OriginalMember(owner = "client!wv", name = "mb", descriptor = "Z")
	private boolean aBoolean791 = true;

	@OriginalMember(owner = "client!wv", name = "cb", descriptor = "I")
	private int anInt10633 = 0;

	@OriginalMember(owner = "client!wv", name = "Jb", descriptor = "Z")
	private boolean aBoolean792 = false;

	@OriginalMember(owner = "client!wv", name = "t", descriptor = "I")
	private int anInt10610 = 0;

	@OriginalMember(owner = "client!wv", name = "bc", descriptor = "I")
	private int anInt10659 = 0;

	@OriginalMember(owner = "client!wv", name = "lb", descriptor = "I")
	private int lb = 0;

	@OriginalMember(owner = "client!wv", name = "Lb", descriptor = "Z")
	private boolean aBoolean793 = false;

	@OriginalMember(owner = "client!wv", name = "Hb", descriptor = "I")
	private int anInt10647 = 0;

	@OriginalMember(owner = "client!wv", name = "Dc", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_43;

	@OriginalMember(owner = "client!wv", name = "ec", descriptor = "Lclient!kb;")
	private Class194 aClass194_15;

	@OriginalMember(owner = "client!wv", name = "rb", descriptor = "Lclient!kb;")
	private Class194 aClass194_13;

	@OriginalMember(owner = "client!wv", name = "Yb", descriptor = "Lclient!kb;")
	private Class194 aClass194_14;

	@OriginalMember(owner = "client!wv", name = "Ac", descriptor = "Lclient!kb;")
	private Class194 aClass194_16;

	@OriginalMember(owner = "client!wv", name = "qc", descriptor = "Lclient!sd;")
	private Class319 aClass319_1;

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class114_Sub3(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aClass143_Sub2_43 = arg0;
		this.aClass194_15 = new Class194((Interface8) null, 5126, 3, 0);
		this.aClass194_13 = new Class194((Interface8) null, 5126, 2, 0);
		this.aClass194_14 = new Class194((Interface8) null, 5126, 3, 0);
		this.aClass194_16 = new Class194((Interface8) null, 5121, 4, 0);
		this.aClass319_1 = new Class319();
	}

	@OriginalMember(owner = "client!wv", name = "<init>", descriptor = "(Lclient!kv;Lclient!hm;IIII)V")
	public Class114_Sub3(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class156 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt10660 = arg2;
		this.anInt10613 = arg5;
		this.aClass143_Sub2_43 = arg0;
		if (Static138.method2060(arg5, arg2)) {
			this.aClass194_15 = new Class194((Interface8) null, 5126, 3, 0);
		}
		if (Static537.method8643(arg5, arg2)) {
			this.aClass194_13 = new Class194((Interface8) null, 5126, 2, 0);
		}
		if (Static636.method8433(arg5, arg2)) {
			this.aClass194_14 = new Class194((Interface8) null, 5126, 3, 0);
		}
		if (Static229.method3288(arg2, arg5)) {
			this.aClass194_16 = new Class194((Interface8) null, 5121, 4, 0);
		}
		if (Static547.method7539(arg5, arg2)) {
			this.aClass319_1 = new Class319();
		}
		@Pc(108) Interface3 local108 = arg0.anInterface3_11;
		this.anIntArray619 = new int[arg1.anInt3707 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt3706];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt3706; local121++) {
			if (arg1.aByteArray37 == null || arg1.aByteArray37[local121] != 2) {
				if (arg1.aShortArray58 != null && arg1.aShortArray58[local121] != -1) {
					@Pc(151) Class331 local151 = local108.method8501(arg1.aShortArray58[local121] & 0xFFFF);
					if (((this.anInt10613 & 0x40) == 0 || !local151.aBoolean660) && local151.aBoolean658) {
						continue;
					}
				}
				local119[this.anInt10633++] = local121;
				this.anIntArray619[arg1.aShortArray56[local121]]++;
				this.anIntArray619[arg1.aShortArray57[local121]]++;
				this.anIntArray619[arg1.aShortArray51[local121]]++;
			}
		}
		this.anInt10659 = this.anInt10633;
		@Pc(220) long[] local220 = new long[this.anInt10633];
		@Pc(229) boolean local229 = (this.anInt10660 & 0x100) != 0;
		@Pc(241) int local241;
		@Pc(254) int local254;
		@Pc(438) int local438;
		for (@Pc(231) int local231 = 0; local231 < this.anInt10633; local231++) {
			@Pc(237) int local237 = local119[local231];
			@Pc(239) Class331 local239 = null;
			local241 = 0;
			@Pc(243) byte local243 = 0;
			@Pc(245) byte local245 = 0;
			@Pc(247) byte local247 = 0;
			if (arg1.aClass261Array1 != null) {
				@Pc(252) boolean local252 = false;
				for (local254 = 0; local254 < arg1.aClass261Array1.length; local254++) {
					@Pc(261) Class261 local261 = arg1.aClass261Array1[local254];
					if (local261.anInt7575 == local237) {
						@Pc(270) Class75 local270 = Static504.method7253(local261.anInt7579);
						if (local270.aBoolean119) {
							local252 = true;
						}
						if (local270.anInt1735 != -1) {
							@Pc(285) Class331 local285 = local108.method8501(local270.anInt1735);
							if (local285.anInt9140 == 2) {
								this.aBoolean793 = true;
							}
						}
					}
				}
				if (local252) {
					local220[local231] = Long.MAX_VALUE;
					this.anInt10659--;
					continue;
				}
			}
			@Pc(316) short local316 = -1;
			if (arg1.aShortArray58 != null) {
				local316 = arg1.aShortArray58[local237];
				if (local316 != -1) {
					local239 = local108.method8501(local316 & 0xFFFF);
					if ((this.anInt10613 & 0x40) != 0 && local239.aBoolean660) {
						local239 = null;
						local316 = -1;
					} else {
						if (local239.aByte116 != 0 || local239.aByte113 != 0) {
							this.aBoolean792 = true;
						}
						local247 = local239.aByte114;
						local245 = local239.aByte117;
					}
				}
			}
			@Pc(394) boolean local394 = arg1.aByteArray34 != null && arg1.aByteArray34[local237] != 0 || local239 != null && local239.anInt9140 != 0;
			if ((local229 || local394) && arg1.aByteArray35 != null) {
				local241 += arg1.aByteArray35[local237] << 17;
			}
			if (local394) {
				local241 += 65536;
			}
			local241 += (local245 & 0xFF) << 8;
			local241 += local247 & 0xFF;
			local438 = local243 + ((local316 & 0xFFFF) << 16);
			@Pc(444) int local444 = local438 + (local231 & 0xFFFF);
			local220[local231] = ((long) local241 << 32) + ((long) local444);
			this.aBoolean793 |= local394;
			this.aBoolean792 |= local239 != null && (local239.aByte116 != 0 || local239.aByte113 != 0);
		}
		Static43.method609(local119, local220);
		this.anIntArray617 = arg1.anIntArray223;
		this.aShortArray154 = arg1.aShortArray52;
		this.anIntArray618 = arg1.anIntArray231;
		this.anInt10610 = arg1.anInt3707;
		this.anInt10647 = arg1.anInt3708;
		this.anIntArray616 = arg1.anIntArray227;
		this.aClass303Array5 = arg1.aClass303Array3;
		this.aClass244Array5 = arg1.aClass244Array3;
		@Pc(532) Class46[] local532 = new Class46[this.anInt10610];
		@Pc(552) int local552;
		@Pc(566) int local566;
		@Pc(609) int local609;
		if (arg1.aClass261Array1 != null) {
			this.anInt10643 = arg1.aClass261Array1.length;
			this.aClass23Array1 = new Class23[this.anInt10643];
			this.aClass146Array1 = new Class146[this.anInt10643];
			for (local552 = 0; local552 < this.anInt10643; local552++) {
				@Pc(559) Class261 local559 = arg1.aClass261Array1[local552];
				@Pc(564) Class75 local564 = Static504.method7253(local559.anInt7579);
				local566 = -1;
				for (@Pc(568) int local568 = 0; local568 < this.anInt10633; local568++) {
					if (local559.anInt7575 == local119[local568]) {
						local566 = local568;
						break;
					}
				}
				if (local566 == -1) {
					throw new RuntimeException();
				}
				local609 = Static6.anIntArray6[arg1.aShortArray55[local559.anInt7575] & 0xFFFF] & 0xFFFFFF;
				@Pc(627) int local627 = local609 | 255 - (arg1.aByteArray34 == null ? 0 : arg1.aByteArray34[local559.anInt7575]) << 24;
				this.aClass23Array1[local552] = new Class23(local566, arg1.aShortArray56[local559.anInt7575], arg1.aShortArray57[local559.anInt7575], arg1.aShortArray51[local559.anInt7575], local564.anInt1730, local564.anInt1728, local564.anInt1735, local564.anInt1731, local564.anInt1736, local564.aBoolean119, local564.aBoolean117, local559.anInt7577);
				this.aClass146Array1[local552] = new Class146(local627);
			}
		}
		local552 = this.anInt10633 * 3;
		this.aShortArray156 = new short[local552];
		if (arg1.aShortArray49 != null) {
			this.aShortArray157 = new short[this.anInt10633];
		}
		this.aShortArray151 = new short[this.anInt10633];
		Static280.aLongArray5 = new long[local552];
		this.aFloatArray83 = new float[local552];
		this.aShortArray152 = new short[this.anInt10633];
		this.aShortArray159 = new short[local552];
		this.aShort119 = (short) arg4;
		this.aByteArray112 = new byte[this.anInt10633];
		this.aShort120 = (short) arg3;
		this.aByteArray111 = new byte[local552];
		this.aShortArray158 = new short[this.anInt10633];
		this.aShortArray153 = new short[local552];
		this.aShortArray150 = new short[local552];
		this.aShortArray149 = new short[this.anInt10633];
		this.aShortArray155 = new short[this.anInt10633];
		this.aFloatArray82 = new float[local552];
		local241 = 0;
		for (local438 = 0; local438 < arg1.anInt3707; local438++) {
			local566 = this.anIntArray619[local438];
			this.anIntArray619[local438] = local241;
			local241 += local566;
			local532[local438] = new Class46();
		}
		this.anIntArray619[arg1.anInt3707] = local241;
		@Pc(809) Class308 local809 = Static221.method3127(this.anInt10633, local119, arg1);
		@Pc(813) Class249[] local813 = new Class249[arg1.anInt3706];
		@Pc(853) int local853;
		@Pc(864) int local864;
		@Pc(885) int local885;
		@Pc(896) int local896;
		@Pc(905) int local905;
		@Pc(914) int local914;
		@Pc(832) short local832;
		@Pc(843) int local843;
		for (local609 = 0; local609 < arg1.anInt3706; local609++) {
			@Pc(822) short local822 = arg1.aShortArray56[local609];
			@Pc(827) short local827 = arg1.aShortArray57[local609];
			local832 = arg1.aShortArray51[local609];
			local843 = this.anIntArray616[local827] - this.anIntArray616[local822];
			local853 = this.anIntArray618[local827] - this.anIntArray618[local822];
			local864 = this.anIntArray617[local827] - this.anIntArray617[local822];
			@Pc(874) int local874 = this.anIntArray616[local832] - this.anIntArray616[local822];
			local885 = this.anIntArray618[local832] - this.anIntArray618[local822];
			local896 = this.anIntArray617[local832] - this.anIntArray617[local822];
			local905 = local896 * local853 - local885 * local864;
			local914 = local874 * local864 - local843 * local896;
			@Pc(923) int local923;
			for (local923 = local885 * local843 - local853 * local874; local905 > 8192 || local914 > 8192 || local923 > 8192 || local905 < -8192 || local914 < -8192 || local923 < -8192; local923 >>= 0x1) {
				local914 >>= 0x1;
				local905 >>= 0x1;
			}
			@Pc(976) int local976 = (int) Math.sqrt((double) (local923 * local923 + local914 * local914 + local905 * local905));
			if (local976 <= 0) {
				local976 = 1;
			}
			local905 = local905 * 256 / local976;
			local914 = local914 * 256 / local976;
			local923 = local923 * 256 / local976;
			@Pc(1008) byte local1008 = arg1.aByteArray37 == null ? 0 : arg1.aByteArray37[local609];
			if (local1008 == 0) {
				@Pc(1038) Class46 local1038 = local532[local822];
				local1038.anInt893 += local914;
				local1038.anInt892 += local905;
				local1038.anInt891 += local923;
				local1038.anInt894++;
				@Pc(1066) Class46 local1066 = local532[local827];
				local1066.anInt891 += local923;
				local1066.anInt893 += local914;
				local1066.anInt892 += local905;
				local1066.anInt894++;
				@Pc(1094) Class46 local1094 = local532[local832];
				local1094.anInt892 += local905;
				local1094.anInt894++;
				local1094.anInt891 += local923;
				local1094.anInt893 += local914;
			} else if (local1008 == 1) {
				@Pc(1023) Class249 local1023 = local813[local609] = new Class249();
				local1023.anInt6943 = local914;
				local1023.anInt6940 = local923;
				local1023.anInt6944 = local905;
			}
		}
		@Pc(1131) int local1131;
		@Pc(1174) short local1174;
		for (local254 = 0; local254 < this.anInt10633; local254++) {
			local1131 = local119[local254];
			@Pc(1138) int local1138 = arg1.aShortArray55[local1131] & 0xFFFF;
			if (arg1.aByteArray36 == null) {
				local843 = -1;
			} else {
				local843 = arg1.aByteArray36[local1131];
			}
			if (arg1.aByteArray34 == null) {
				local853 = 0;
			} else {
				local853 = arg1.aByteArray34[local1131] & 0xFF;
			}
			local1174 = arg1.aShortArray58 == null ? -1 : arg1.aShortArray58[local1131];
			if (local1174 != -1 && (this.anInt10613 & 0x40) != 0) {
				@Pc(1192) Class331 local1192 = local108.method8501(local1174 & 0xFFFF);
				if (local1192.aBoolean660) {
					local1174 = -1;
				}
			}
			@Pc(1199) float local1199 = 0.0F;
			@Pc(1201) float local1201 = 0.0F;
			@Pc(1203) float local1203 = 0.0F;
			@Pc(1205) float local1205 = 0.0F;
			@Pc(1207) float local1207 = 0.0F;
			@Pc(1209) float local1209 = 0.0F;
			@Pc(1211) byte local1211 = 0;
			@Pc(1213) byte local1213 = 0;
			@Pc(1215) int local1215 = 0;
			@Pc(1231) byte local1231;
			@Pc(1251) short local1251;
			@Pc(1256) short local1256;
			@Pc(1261) short local1261;
			if (local1174 != -1) {
				if (local843 == -1) {
					local1209 = 0.0F;
					local1211 = 1;
					local1205 = 1.0F;
					local1201 = 1.0F;
					local1203 = 1.0F;
					local1199 = 0.0F;
					local1207 = 0.0F;
					local1213 = 2;
				} else {
					local843 &= 0xFF;
					local1231 = arg1.aByteArray33[local843];
					@Pc(1241) short local1241;
					@Pc(1246) short local1246;
					@Pc(1284) float local1284;
					@Pc(1293) float local1293;
					@Pc(1301) float local1301;
					@Pc(1386) float local1386;
					@Pc(1395) float local1395;
					@Pc(1404) float local1404;
					@Pc(1412) float local1412;
					@Pc(1421) float local1421;
					@Pc(1430) float local1430;
					if (local1231 == 0) {
						local1241 = arg1.aShortArray56[local1131];
						local1246 = arg1.aShortArray57[local1131];
						local1251 = arg1.aShortArray51[local1131];
						local1256 = arg1.aShortArray50[local843];
						local1261 = arg1.aShortArray53[local843];
						@Pc(1266) short local1266 = arg1.aShortArray54[local843];
						@Pc(1272) float local1272 = (float) arg1.anIntArray227[local1256];
						@Pc(1278) float local1278 = (float) arg1.anIntArray231[local1256];
						local1284 = (float) arg1.anIntArray223[local1256];
						local1293 = (float) arg1.anIntArray227[local1261] - local1272;
						local1301 = (float) arg1.anIntArray231[local1261] - local1278;
						@Pc(1310) float local1310 = (float) arg1.anIntArray223[local1261] - local1284;
						@Pc(1319) float local1319 = (float) arg1.anIntArray227[local1266] - local1272;
						@Pc(1327) float local1327 = (float) arg1.anIntArray231[local1266] - local1278;
						@Pc(1336) float local1336 = (float) arg1.anIntArray223[local1266] - local1284;
						@Pc(1344) float local1344 = (float) arg1.anIntArray227[local1241] - local1272;
						@Pc(1352) float local1352 = (float) arg1.anIntArray231[local1241] - local1278;
						@Pc(1360) float local1360 = (float) arg1.anIntArray223[local1241] - local1284;
						@Pc(1369) float local1369 = (float) arg1.anIntArray227[local1246] - local1272;
						@Pc(1378) float local1378 = (float) arg1.anIntArray231[local1246] - local1278;
						local1386 = (float) arg1.anIntArray223[local1246] - local1284;
						local1395 = (float) arg1.anIntArray227[local1251] - local1272;
						local1404 = (float) arg1.anIntArray231[local1251] - local1278;
						local1412 = (float) arg1.anIntArray223[local1251] - local1284;
						local1421 = local1336 * local1301 - local1310 * local1327;
						local1430 = local1310 * local1319 - local1293 * local1336;
						@Pc(1438) float local1438 = local1327 * local1293 - local1301 * local1319;
						@Pc(1446) float local1446 = local1327 * local1438 - local1336 * local1430;
						@Pc(1455) float local1455 = local1421 * local1336 - local1438 * local1319;
						@Pc(1464) float local1464 = local1319 * local1430 - local1421 * local1327;
						@Pc(1478) float local1478 = 1.0F / (local1310 * local1464 + local1293 * local1446 + local1301 * local1455);
						local1199 = (local1464 * local1360 + local1446 * local1344 + local1455 * local1352) * local1478;
						local1207 = (local1412 * local1464 + local1404 * local1455 + local1395 * local1446) * local1478;
						local1203 = local1478 * (local1455 * local1378 + local1369 * local1446 + local1464 * local1386);
						@Pc(1529) float local1529 = local1438 * local1301 - local1310 * local1430;
						@Pc(1537) float local1537 = local1430 * local1293 - local1301 * local1421;
						@Pc(1546) float local1546 = local1421 * local1310 - local1438 * local1293;
						@Pc(1560) float local1560 = 1.0F / (local1537 * local1336 + local1546 * local1327 + local1529 * local1319);
						local1201 = (local1352 * local1546 + local1529 * local1344 + local1537 * local1360) * local1560;
						local1209 = (local1404 * local1546 + local1529 * local1395 + local1412 * local1537) * local1560;
						local1205 = local1560 * (local1378 * local1546 + local1529 * local1369 + local1386 * local1537);
					} else {
						local1241 = arg1.aShortArray56[local1131];
						local1246 = arg1.aShortArray57[local1131];
						local1251 = arg1.aShortArray51[local1131];
						@Pc(1624) int local1624 = local809.anIntArray468[local843];
						@Pc(1629) int local1629 = local809.anIntArray469[local843];
						@Pc(1634) int local1634 = local809.anIntArray470[local843];
						@Pc(1639) float[] local1639 = local809.aFloatArrayArray14[local843];
						@Pc(1644) byte local1644 = arg1.aByteArray32[local843];
						local1284 = (float) arg1.anIntArray221[local843] / 256.0F;
						if (local1231 == 1) {
							local1293 = (float) arg1.anIntArray224[local843] / 1024.0F;
							Static538.method7457(local1293, local1644, arg1.anIntArray231[local1241], arg1.anIntArray223[local1241], local1629, local1639, arg1.anIntArray227[local1241], local1284, local1624, Static622.aFloatArray65, local1634);
							local1201 = Static622.aFloatArray65[1];
							local1199 = Static622.aFloatArray65[0];
							Static538.method7457(local1293, local1644, arg1.anIntArray231[local1246], arg1.anIntArray223[local1246], local1629, local1639, arg1.anIntArray227[local1246], local1284, local1624, Static622.aFloatArray65, local1634);
							local1205 = Static622.aFloatArray65[1];
							local1203 = Static622.aFloatArray65[0];
							Static538.method7457(local1293, local1644, arg1.anIntArray231[local1251], arg1.anIntArray223[local1251], local1629, local1639, arg1.anIntArray227[local1251], local1284, local1624, Static622.aFloatArray65, local1634);
							local1209 = Static622.aFloatArray65[1];
							local1207 = Static622.aFloatArray65[0];
							local1301 = local1293 / 2.0F;
							if ((local1644 & 0x1) == 0) {
								if (local1203 - local1199 > local1301) {
									local1203 -= local1293;
									local1211 = 1;
								} else if (local1301 < local1199 - local1203) {
									local1211 = 2;
									local1203 += local1293;
								}
								if (local1207 - local1199 > local1301) {
									local1213 = 1;
									local1207 -= local1293;
								} else if (local1199 - local1207 > local1301) {
									local1213 = 2;
									local1207 += local1293;
								}
							} else {
								if (local1209 - local1201 > local1301) {
									local1209 -= local1293;
									local1213 = 1;
								} else if (local1201 - local1209 > local1301) {
									local1213 = 2;
									local1209 += local1293;
								}
								if (local1205 - local1201 > local1301) {
									local1211 = 1;
									local1205 -= local1293;
								} else if (local1301 < local1201 - local1205) {
									local1205 += local1293;
									local1211 = 2;
								}
							}
						} else if (local1231 == 2) {
							local1293 = (float) arg1.anIntArray228[local843] / 256.0F;
							local1301 = (float) arg1.anIntArray220[local843] / 256.0F;
							@Pc(2112) int local2112 = arg1.anIntArray227[local1246] - arg1.anIntArray227[local1241];
							@Pc(2122) int local2122 = arg1.anIntArray231[local1246] - arg1.anIntArray231[local1241];
							@Pc(2133) int local2133 = arg1.anIntArray223[local1246] - arg1.anIntArray223[local1241];
							@Pc(2144) int local2144 = arg1.anIntArray227[local1251] - arg1.anIntArray227[local1241];
							@Pc(2154) int local2154 = arg1.anIntArray231[local1251] - arg1.anIntArray231[local1241];
							@Pc(2165) int local2165 = arg1.anIntArray223[local1251] - arg1.anIntArray223[local1241];
							@Pc(2174) int local2174 = local2122 * local2165 - local2154 * local2133;
							@Pc(2183) int local2183 = local2144 * local2133 - local2165 * local2112;
							@Pc(2192) int local2192 = local2154 * local2112 - local2144 * local2122;
							local1386 = 64.0F / (float) arg1.anIntArray229[local843];
							local1395 = 64.0F / (float) arg1.anIntArray230[local843];
							local1404 = 64.0F / (float) arg1.anIntArray224[local843];
							local1412 = (local1639[1] * (float) local2183 + (float) local2174 * local1639[0] + (float) local2192 * local1639[2]) / local1386;
							local1421 = (local1639[4] * (float) local2183 + local1639[3] * (float) local2174 + (float) local2192 * local1639[5]) / local1395;
							local1430 = (local1639[7] * (float) local2183 + local1639[6] * (float) local2174 + local1639[8] * (float) local2192) / local1404;
							local1215 = Static621.method8306(local1430, local1421, local1412);
							Static474.method7008(local1634, Static622.aFloatArray65, local1301, local1644, local1629, local1215, local1293, local1284, local1639, arg1.anIntArray227[local1241], arg1.anIntArray231[local1241], arg1.anIntArray223[local1241], local1624);
							local1199 = Static622.aFloatArray65[0];
							local1201 = Static622.aFloatArray65[1];
							Static474.method7008(local1634, Static622.aFloatArray65, local1301, local1644, local1629, local1215, local1293, local1284, local1639, arg1.anIntArray227[local1246], arg1.anIntArray231[local1246], arg1.anIntArray223[local1246], local1624);
							local1203 = Static622.aFloatArray65[0];
							local1205 = Static622.aFloatArray65[1];
							Static474.method7008(local1634, Static622.aFloatArray65, local1301, local1644, local1629, local1215, local1293, local1284, local1639, arg1.anIntArray227[local1251], arg1.anIntArray231[local1251], arg1.anIntArray223[local1251], local1624);
							local1207 = Static622.aFloatArray65[0];
							local1209 = Static622.aFloatArray65[1];
						} else if (local1231 == 3) {
							Static69.method985(local1629, local1284, Static622.aFloatArray65, arg1.anIntArray227[local1241], local1634, arg1.anIntArray223[local1241], local1624, arg1.anIntArray231[local1241], local1639, local1644);
							local1201 = Static622.aFloatArray65[1];
							local1199 = Static622.aFloatArray65[0];
							Static69.method985(local1629, local1284, Static622.aFloatArray65, arg1.anIntArray227[local1246], local1634, arg1.anIntArray223[local1246], local1624, arg1.anIntArray231[local1246], local1639, local1644);
							local1205 = Static622.aFloatArray65[1];
							local1203 = Static622.aFloatArray65[0];
							Static69.method985(local1629, local1284, Static622.aFloatArray65, arg1.anIntArray227[local1251], local1634, arg1.anIntArray223[local1251], local1624, arg1.anIntArray231[local1251], local1639, local1644);
							local1209 = Static622.aFloatArray65[1];
							local1207 = Static622.aFloatArray65[0];
							if ((local1644 & 0x1) == 0) {
								if (local1207 - local1199 > 0.5F) {
									local1213 = 1;
									local1207--;
								} else if (local1199 - local1207 > 0.5F) {
									local1207++;
									local1213 = 2;
								}
								if (local1203 - local1199 > 0.5F) {
									local1203--;
									local1211 = 1;
								} else if (local1199 - local1203 > 0.5F) {
									local1203++;
									local1211 = 2;
								}
							} else {
								if (local1209 - local1201 > 0.5F) {
									local1209--;
									local1213 = 1;
								} else if (local1201 - local1209 > 0.5F) {
									local1209++;
									local1213 = 2;
								}
								if (local1205 - local1201 > 0.5F) {
									local1205--;
									local1211 = 1;
								} else if (local1201 - local1205 > 0.5F) {
									local1211 = 2;
									local1205++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray37 == null) {
				local1231 = 0;
			} else {
				local1231 = arg1.aByteArray37[local1131];
			}
			if (local1231 == 0) {
				@Pc(2443) long local2443 = (long) (local843 << 2) + ((long) local853 + (long) (local1215 << 24) + (long) (local1138 << 8) << 32);
				local1251 = arg1.aShortArray56[local1131];
				local1256 = arg1.aShortArray57[local1131];
				local1261 = arg1.aShortArray51[local1131];
				@Pc(2462) Class46 local2462 = local532[local1251];
				this.aShortArray152[local254] = this.method8817(local1199, local1251, local2462.anInt894, local2462.anInt891, local2462.anInt893, local2462.anInt892, arg1, local2443, local1201);
				@Pc(2486) Class46 local2486 = local532[local1256];
				this.aShortArray158[local254] = this.method8817(local1203, local1256, local2486.anInt894, local2486.anInt891, local2486.anInt893, local2486.anInt892, arg1, (long) local1211 + local2443, local1205);
				@Pc(2513) Class46 local2513 = local532[local1261];
				this.aShortArray155[local254] = this.method8817(local1207, local1261, local2513.anInt894, local2513.anInt891, local2513.anInt893, local2513.anInt892, arg1, local2443 + (long) local1213, local1209);
			} else if (local1231 == 1) {
				@Pc(2545) Class249 local2545 = local813[local1131];
				@Pc(2587) long local2587 = ((long) local853 + (long) (local1138 << 8) + (long) (local1215 << 24) << 32) + (long) ((local2545.anInt6944 > 0 ? 1024 : 2048) + (local843 << 2) - (-(local2545.anInt6943 + 256 << 12) - (local2545.anInt6940 + 256 << 22)));
				this.aShortArray152[local254] = this.method8817(local1199, arg1.aShortArray56[local1131], 0, local2545.anInt6940, local2545.anInt6943, local2545.anInt6944, arg1, local2587, local1201);
				this.aShortArray158[local254] = this.method8817(local1203, arg1.aShortArray57[local1131], 0, local2545.anInt6940, local2545.anInt6943, local2545.anInt6944, arg1, local2587 + (long) local1211, local1205);
				this.aShortArray155[local254] = this.method8817(local1207, arg1.aShortArray51[local1131], 0, local2545.anInt6940, local2545.anInt6943, local2545.anInt6944, arg1, local2587 + (long) local1213, local1209);
			}
			if (arg1.aByteArray34 != null) {
				this.aByteArray112[local254] = arg1.aByteArray34[local1131];
			}
			if (arg1.aShortArray49 != null) {
				this.aShortArray157[local254] = arg1.aShortArray49[local1131];
			}
			this.aShortArray149[local254] = arg1.aShortArray55[local1131];
			this.aShortArray151[local254] = local1174;
		}
		local1131 = 0;
		local832 = -10000;
		for (local843 = 0; local843 < this.anInt10659; local843++) {
			@Pc(2716) short local2716 = this.aShortArray151[local843];
			if (local2716 != local832) {
				local1131++;
				local832 = local2716;
			}
		}
		this.anIntArray615 = new int[local1131 + 1];
		local832 = -10000;
		local1131 = 0;
		for (local853 = 0; local853 < this.anInt10659; local853++) {
			local1174 = this.aShortArray151[local853];
			if (local832 != local1174) {
				local832 = local1174;
				this.anIntArray615[local1131++] = local853;
			}
		}
		this.anIntArray615[local1131] = this.anInt10659;
		Static280.aLongArray5 = null;
		this.aShortArray159 = Static670.method8729(this.lb, this.aShortArray159);
		this.aShortArray156 = Static670.method8729(this.lb, this.aShortArray156);
		this.aShortArray153 = Static670.method8729(this.lb, this.aShortArray153);
		this.aByteArray111 = Static531.method7415(this.lb, this.aByteArray111);
		this.aFloatArray82 = Static539.method7466(this.lb, this.aFloatArray82);
		this.aFloatArray83 = Static539.method7466(this.lb, this.aFloatArray83);
		if (arg1.anIntArray226 != null && Static292.method4008(arg2, this.anInt10613)) {
			this.anIntArrayArray94 = arg1.method3281(false);
		}
		if (arg1.aClass261Array1 != null && Static672.method8770(arg2, this.anInt10613)) {
			this.anIntArrayArray95 = arg1.method3279();
		}
		if (arg1.anIntArray225 != null && Static146.method2196(this.anInt10613, arg2)) {
			local864 = 0;
			@Pc(2877) int[] local2877 = new int[256];
			for (local885 = 0; local885 < this.anInt10633; local885++) {
				local896 = arg1.anIntArray225[local119[local885]];
				if (local896 >= 0) {
					@Pc(2894) int local2894 = local2877[local896]++;
					if (local896 > local864) {
						local864 = local896;
					}
				}
			}
			this.anIntArrayArray96 = new int[local864 + 1][];
			for (local896 = 0; local896 <= local864; local896++) {
				this.anIntArrayArray96[local896] = new int[local2877[local896]];
				local2877[local896] = 0;
			}
			for (local905 = 0; local905 < this.anInt10633; local905++) {
				local914 = arg1.anIntArray225[local119[local905]];
				if (local914 >= 0) {
					this.anIntArrayArray96[local914][local2877[local914]++] = local905;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt10660 = arg0;
		if (this.aClass383_1 != null && (this.anInt10660 & 0x10000) == 0) {
			this.aByteArray111 = this.aClass383_1.aByteArray106;
			this.aShortArray153 = this.aClass383_1.aShortArray138;
			this.aShortArray156 = this.aClass383_1.aShortArray139;
			this.aShortArray159 = this.aClass383_1.aShortArray140;
			this.aClass383_1 = null;
		}
		this.aBoolean791 = true;
		this.method8825();
	}

	@OriginalMember(owner = "client!wv", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10610; local15++) {
			@Pc(33) int local33 = local9 * this.anIntArray618[local15] + local13 * this.anIntArray616[local15] >> 14;
			this.anIntArray618[local15] = local13 * this.anIntArray618[local15] - local9 * this.anIntArray616[local15] >> 14;
			this.anIntArray616[local15] = local33;
		}
		this.aBoolean790 = false;
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!eh;)V")
	@Override
	public void method8811(@OriginalArg(0) Class56 arg0) {
		@Pc(8) Class56_Sub3 local8 = (Class56_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass244Array5 != null) {
			for (local13 = 0; local13 < this.aClass244Array5.length; local13++) {
				@Pc(20) Class244 local20 = this.aClass244Array5[local13];
				@Pc(22) Class244 local22 = local20;
				if (local20.aClass244_1 != null) {
					local22 = local20.aClass244_1;
				}
				local22.anInt6818 = (int) ((float) this.anIntArray617[local20.anInt6819] * local8.aFloat187 + local8.aFloat177 * (float) this.anIntArray618[local20.anInt6819] + (float) this.anIntArray616[local20.anInt6819] * local8.aFloat181 + local8.aFloat185);
				local22.anInt6823 = (int) (local8.aFloat179 * (float) this.anIntArray617[local20.anInt6819] + local8.aFloat184 * (float) this.anIntArray618[local20.anInt6819] + (float) this.anIntArray616[local20.anInt6819] * local8.aFloat178 + local8.aFloat186);
				local22.anInt6820 = (int) (local8.aFloat183 + (float) this.anIntArray618[local20.anInt6819] * local8.aFloat182 + local8.aFloat180 * (float) this.anIntArray616[local20.anInt6819] + local8.aFloat188 * (float) this.anIntArray617[local20.anInt6819]);
				local22.anInt6812 = (int) (local8.aFloat185 + local8.aFloat187 * (float) this.anIntArray617[local20.anInt6816] + (float) this.anIntArray618[local20.anInt6816] * local8.aFloat177 + (float) this.anIntArray616[local20.anInt6816] * local8.aFloat181);
				local22.anInt6811 = (int) ((float) this.anIntArray616[local20.anInt6816] * local8.aFloat178 + (float) this.anIntArray618[local20.anInt6816] * local8.aFloat184 + (float) this.anIntArray617[local20.anInt6816] * local8.aFloat179 + local8.aFloat186);
				local22.anInt6809 = (int) (local8.aFloat183 + (float) this.anIntArray616[local20.anInt6816] * local8.aFloat180 + local8.aFloat182 * (float) this.anIntArray618[local20.anInt6816] + (float) this.anIntArray617[local20.anInt6816] * local8.aFloat188);
				local22.anInt6807 = (int) (local8.aFloat185 + local8.aFloat187 * (float) this.anIntArray617[local20.anInt6817] + (float) this.anIntArray618[local20.anInt6817] * local8.aFloat177 + local8.aFloat181 * (float) this.anIntArray616[local20.anInt6817]);
				local22.anInt6810 = (int) ((float) this.anIntArray617[local20.anInt6817] * local8.aFloat179 + local8.aFloat184 * (float) this.anIntArray618[local20.anInt6817] + (float) this.anIntArray616[local20.anInt6817] * local8.aFloat178 + local8.aFloat186);
				local22.anInt6813 = (int) ((float) this.anIntArray616[local20.anInt6817] * local8.aFloat180 + (float) this.anIntArray618[local20.anInt6817] * local8.aFloat182 + local8.aFloat188 * (float) this.anIntArray617[local20.anInt6817] + local8.aFloat183);
			}
		}
		if (this.aClass303Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass303Array5.length; local13++) {
			@Pc(365) Class303 local365 = this.aClass303Array5[local13];
			@Pc(367) Class303 local367 = local365;
			if (local365.aClass303_1 != null) {
				local367 = local365.aClass303_1;
			}
			if (local365.aClass56_12 == null) {
				local365.aClass56_12 = local8.method8394();
			} else {
				local365.aClass56_12.method8393(local8);
			}
			local367.anInt8518 = (int) (local8.aFloat187 * (float) this.anIntArray617[local365.anInt8513] + (float) this.anIntArray618[local365.anInt8513] * local8.aFloat177 + (float) this.anIntArray616[local365.anInt8513] * local8.aFloat181 + local8.aFloat185);
			local367.anInt8520 = (int) (local8.aFloat186 + local8.aFloat178 * (float) this.anIntArray616[local365.anInt8513] + local8.aFloat184 * (float) this.anIntArray618[local365.anInt8513] + (float) this.anIntArray617[local365.anInt8513] * local8.aFloat179);
			local367.anInt8517 = (int) ((float) this.anIntArray617[local365.anInt8513] * local8.aFloat188 + (float) this.anIntArray616[local365.anInt8513] * local8.aFloat180 + (float) this.anIntArray618[local365.anInt8513] * local8.aFloat182 + local8.aFloat183);
		}
	}

	@OriginalMember(owner = "client!wv", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort121;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "()V")
	@Override
	protected void method8793() {
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(ZI)V")
	private void method8813(@OriginalArg(0) boolean arg0) {
		if (this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3.aByteArray45.length >= this.anInt10659 * 6) {
			this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3.anInt4144 = 0;
		} else {
			this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3 = new Class5_Sub15_Sub1((this.anInt10659 + 100) * 6);
		}
		@Pc(42) Class5_Sub15_Sub1 local42 = this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3;
		@Pc(48) int local48;
		if (this.aClass143_Sub2_43.aBoolean408) {
			for (local48 = 0; local48 < this.anInt10659; local48++) {
				local42.method3660(this.aShortArray152[local48]);
				local42.method3660(this.aShortArray158[local48]);
				local42.method3660(this.aShortArray155[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt10659; local48++) {
				local42.method3668(this.aShortArray152[local48]);
				local42.method3668(this.aShortArray158[local48]);
				local42.method3668(this.aShortArray155[local48]);
			}
		}
		if (local42.anInt4144 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface15_5 == null) {
				this.anInterface15_5 = this.aClass143_Sub2_43.method4943(local42.aByteArray45, true, local42.anInt4144);
			} else {
				this.anInterface15_5.method8493(local42.anInt4144, local42.aByteArray45);
			}
			this.aClass319_1.anInterface15_4 = this.anInterface15_5;
		} else {
			this.aClass319_1.anInterface15_4 = this.aClass143_Sub2_43.method4943(local42.aByteArray45, false, local42.anInt4144);
		}
		if (!arg0) {
			this.aBoolean791 = true;
		}
	}

	@OriginalMember(owner = "client!wv", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray94 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt10647; local12++) {
			this.anIntArray616[local12] <<= 0x4;
			this.anIntArray618[local12] <<= 0x4;
			this.anIntArray617[local12] <<= 0x4;
		}
		Static383.anInt6668 = 0;
		Static668.anInt10416 = 0;
		Static640.anInt10166 = 0;
		return true;
	}

	@OriginalMember(owner = "client!wv", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort123;
	}

	@OriginalMember(owner = "client!wv", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10647; local7++) {
			this.anIntArray616[local7] = this.anIntArray616[local7] + 7 >> 4;
			this.anIntArray618[local7] = this.anIntArray618[local7] + 7 >> 4;
			this.anIntArray617[local7] = this.anIntArray617[local7] + 7 >> 4;
		}
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
		this.aBoolean790 = false;
	}

	@OriginalMember(owner = "client!wv", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort127;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt10633; local3++) {
			local12 = this.aShortArray149[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			@Pc(42) int local42 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			if (arg2 != -1) {
				local42 -= -(arg3 * (arg2 - local42) >> 7);
			}
			this.aShortArray149[local3] = (short) (local42 | local18 << 10 | local24 << 7);
		}
		if (this.aClass23Array1 != null) {
			for (local12 = 0; local12 < this.anInt10643; local12++) {
				@Pc(111) Class23 local111 = this.aClass23Array1[local12];
				@Pc(116) Class146 local116 = this.aClass146Array1[local12];
				local116.anInt3342 = local116.anInt3342 & 0xFF000000 | Static6.anIntArray6[this.aShortArray149[local111.anInt412] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILclient!eh;ZI)Z")
	@Override
	public boolean method8795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method8823(arg4, arg0, arg1, -1, arg2, arg3);
	}

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "()V")
	@Override
	public void method8799() {
		if (this.lb <= 0 || this.anInt10659 <= 0) {
			return;
		}
		this.method8818(false);
		if ((this.aByte155 & 0x10) == 0 && this.aClass319_1.anInterface15_4 == null) {
			this.method8813(false);
		}
		this.method8825();
	}

	@OriginalMember(owner = "client!wv", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10633; local7++) {
			if (this.aShortArray149[local7] == arg0) {
				this.aShortArray149[local7] = arg1;
			}
		}
		if (this.aClass23Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt10643; local34++) {
				@Pc(41) Class23 local41 = this.aClass23Array1[local34];
				@Pc(46) Class146 local46 = this.aClass146Array1[local34];
				local46.anInt3342 = Static6.anIntArray6[this.aShortArray149[local41.anInt412] & 0xFFFF] & 0xFFFFFF | local46.anInt3342 & 0xFF000000;
			}
		}
		if (this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort118;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method8814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 > arg5 && arg7 > arg5 && arg6 > arg5) {
			return false;
		} else if (arg0 < arg5 && arg7 < arg5 && arg5 > arg6) {
			return false;
		} else if (arg3 > arg1 && arg4 > arg1 && arg1 < arg2) {
			return false;
		} else {
			return arg1 <= arg3 || arg1 <= arg4 || arg1 <= arg2;
		}
	}

	@OriginalMember(owner = "client!wv", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static640.anInt10166 = 0;
			Static383.anInt6668 = 0;
			Static668.anInt10416 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt10610; local17++) {
				Static640.anInt10166 += this.anIntArray616[local17];
				Static383.anInt6668 += this.anIntArray618[local17];
				Static668.anInt10416 += this.anIntArray617[local17];
				local15++;
			}
			if (local15 > 0) {
				Static640.anInt10166 = Static640.anInt10166 / local15 + arg1;
				Static668.anInt10416 = Static668.anInt10416 / local15 + arg3;
				Static383.anInt6668 = Static383.anInt6668 / local15 + arg2;
			} else {
				Static668.anInt10416 = arg3;
				Static383.anInt6668 = arg2;
				Static640.anInt10166 = arg1;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt10610; local15++) {
				this.anIntArray616[local15] += arg1;
				this.anIntArray618[local15] += arg2;
				this.anIntArray617[local15] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(184) int local184;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt10610; local15++) {
					this.anIntArray616[local15] -= Static640.anInt10166;
					this.anIntArray618[local15] -= Static383.anInt6668;
					this.anIntArray617[local15] -= Static668.anInt10416;
					if (arg3 != 0) {
						local17 = Class242.anIntArray384[arg3];
						local165 = Class242.anIntArray383[arg3];
						local184 = local17 * this.anIntArray618[local15] + this.anIntArray616[local15] * local165 + 16383 >> 14;
						this.anIntArray618[local15] = local165 * this.anIntArray618[local15] + 16383 - local17 * this.anIntArray616[local15] >> 14;
						this.anIntArray616[local15] = local184;
					}
					if (arg1 != 0) {
						local17 = Class242.anIntArray384[arg1];
						local165 = Class242.anIntArray383[arg1];
						local184 = this.anIntArray618[local15] * local165 + 16383 - local17 * this.anIntArray617[local15] >> 14;
						this.anIntArray617[local15] = this.anIntArray617[local15] * local165 + this.anIntArray618[local15] * local17 + 16383 >> 14;
						this.anIntArray618[local15] = local184;
					}
					if (arg2 != 0) {
						local17 = Class242.anIntArray384[arg2];
						local165 = Class242.anIntArray383[arg2];
						local184 = this.anIntArray617[local15] * local17 + local165 * this.anIntArray616[local15] + 16383 >> 14;
						this.anIntArray617[local15] = this.anIntArray617[local15] * local165 + 16383 - local17 * this.anIntArray616[local15] >> 14;
						this.anIntArray616[local15] = local184;
					}
					this.anIntArray616[local15] += Static640.anInt10166;
					this.anIntArray618[local15] += Static383.anInt6668;
					this.anIntArray617[local15] += Static668.anInt10416;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt10610; local15++) {
					this.anIntArray616[local15] -= Static640.anInt10166;
					this.anIntArray618[local15] -= Static383.anInt6668;
					this.anIntArray617[local15] -= Static668.anInt10416;
					this.anIntArray616[local15] = this.anIntArray616[local15] * arg1 / 128;
					this.anIntArray618[local15] = this.anIntArray618[local15] * arg2 / 128;
					this.anIntArray617[local15] = arg3 * this.anIntArray617[local15] / 128;
					this.anIntArray616[local15] += Static640.anInt10166;
					this.anIntArray618[local15] += Static383.anInt6668;
					this.anIntArray617[local15] += Static668.anInt10416;
				}
			} else {
				@Pc(520) Class23 local520;
				@Pc(525) Class146 local525;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt10633; local15++) {
						local17 = arg1 * 8 + (this.aByteArray112[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray112[local15] = (byte) local17;
					}
					if (this.aClass194_16 != null) {
						this.aClass194_16.anInterface8_2 = null;
					}
					if (this.aClass23Array1 != null) {
						for (local17 = 0; local17 < this.anInt10643; local17++) {
							local520 = this.aClass23Array1[local17];
							local525 = this.aClass146Array1[local17];
							local525.anInt3342 = local525.anInt3342 & 0xFFFFFF | 255 - (this.aByteArray112[local520.anInt412] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt10633; local15++) {
						local17 = this.aShortArray149[local15] & 0xFFFF;
						local165 = local17 >> 10 & 0x3F;
						local184 = local17 >> 7 & 0x7;
						@Pc(584) int local584 = local17 & 0x7F;
						local184 += arg2 / 4;
						@Pc(597) int local597 = local165 + arg1 & 0x3F;
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
						this.aShortArray149[local15] = (short) (local597 << 10 | local184 << 7 | local584);
					}
					if (this.aClass194_16 != null) {
						this.aClass194_16.anInterface8_2 = null;
					}
					if (this.aClass23Array1 != null) {
						for (local17 = 0; local17 < this.anInt10643; local17++) {
							local520 = this.aClass23Array1[local17];
							local525 = this.aClass146Array1[local17];
							local525.anInt3342 = local525.anInt3342 & 0xFF000000 | Static6.anIntArray6[this.aShortArray149[local520.anInt412] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(706) Class146 local706;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt10643; local15++) {
							local706 = this.aClass146Array1[local15];
							local706.anInt3343 += arg2;
							local706.anInt3341 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt10643; local15++) {
							local706 = this.aClass146Array1[local15];
							local706.anInt3340 = arg2 * local706.anInt3340 >> 7;
							local706.anInt3347 = local706.anInt3347 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt10643; local15++) {
							local706 = this.aClass146Array1[local15];
							local706.anInt3344 = arg1 + local706.anInt3344 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "()[Lclient!nha;")
	@Override
	public Class244[] method8790() {
		return this.aClass244Array5;
	}

	@OriginalMember(owner = "client!wv", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort122;
	}

	@OriginalMember(owner = "client!wv", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort119 = (short) arg0;
		if (this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
		}
		if (this.aClass194_14 != null) {
			this.aClass194_14.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8809(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static640.anInt10166 = 0;
			Static383.anInt6668 = 0;
			local31 = 0;
			Static668.anInt10416 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray94.length > local41) {
					local51 = this.anIntArrayArray94[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static640.anInt10166 += this.anIntArray616[local59];
						Static383.anInt6668 += this.anIntArray618[local59];
						Static668.anInt10416 += this.anIntArray617[local59];
						local31++;
					}
				}
			}
			if (local31 > 0) {
				Static668.anInt10416 = local17 + Static668.anInt10416 / local31;
				Static383.anInt6668 = local25 + Static383.anInt6668 / local31;
				Static640.anInt10166 = local21 + Static640.anInt10166 / local31;
			} else {
				Static640.anInt10166 = local21;
				Static668.anInt10416 = local17;
				Static383.anInt6668 = local25;
			}
			return;
		}
		@Pc(153) int[] local153;
		@Pc(155) int local155;
		if (arg0 == 1) {
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			local17 = arg4 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray94.length > local35) {
					local153 = this.anIntArrayArray94[local35];
					for (local155 = 0; local155 < local153.length; local155++) {
						local53 = local153[local155];
						this.anIntArray616[local53] += local21;
						this.anIntArray618[local53] += local25;
						this.anIntArray617[local53] += local17;
					}
				}
			}
			return;
		}
		@Pc(273) int local273;
		@Pc(291) int local291;
		@Pc(756) int local756;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray94.length) {
					local153 = this.anIntArrayArray94[local35];
					if ((arg5 & 0x1) == 0) {
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							this.anIntArray616[local53] -= Static640.anInt10166;
							this.anIntArray618[local53] -= Static383.anInt6668;
							this.anIntArray617[local53] -= Static668.anInt10416;
							if (arg4 != 0) {
								local59 = Class242.anIntArray384[arg4];
								local273 = Class242.anIntArray383[arg4];
								local291 = local273 * this.anIntArray616[local53] + this.anIntArray618[local53] * local59 + 16383 >> 14;
								this.anIntArray618[local53] = this.anIntArray618[local53] * local273 + 16383 - local59 * this.anIntArray616[local53] >> 14;
								this.anIntArray616[local53] = local291;
							}
							if (arg2 != 0) {
								local59 = Class242.anIntArray384[arg2];
								local273 = Class242.anIntArray383[arg2];
								local291 = local273 * this.anIntArray618[local53] + 16383 - this.anIntArray617[local53] * local59 >> 14;
								this.anIntArray617[local53] = local59 * this.anIntArray618[local53] + local273 * this.anIntArray617[local53] + 16383 >> 14;
								this.anIntArray618[local53] = local291;
							}
							if (arg3 != 0) {
								local59 = Class242.anIntArray384[arg3];
								local273 = Class242.anIntArray383[arg3];
								local291 = local59 * this.anIntArray617[local53] + local273 * this.anIntArray616[local53] + 16383 >> 14;
								this.anIntArray617[local53] = local273 * this.anIntArray617[local53] + 16383 - this.anIntArray616[local53] * local59 >> 14;
								this.anIntArray616[local53] = local291;
							}
							this.anIntArray616[local53] += Static640.anInt10166;
							this.anIntArray618[local53] += Static383.anInt6668;
							this.anIntArray617[local53] += Static668.anInt10416;
						}
					} else {
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							this.anIntArray616[local53] -= Static640.anInt10166;
							this.anIntArray618[local53] -= Static383.anInt6668;
							this.anIntArray617[local53] -= Static668.anInt10416;
							if (arg2 != 0) {
								local59 = Class242.anIntArray384[arg2];
								local273 = Class242.anIntArray383[arg2];
								local291 = local273 * this.anIntArray618[local53] + 16383 - local59 * this.anIntArray617[local53] >> 14;
								this.anIntArray617[local53] = this.anIntArray617[local53] * local273 + this.anIntArray618[local53] * local59 + 16383 >> 14;
								this.anIntArray618[local53] = local291;
							}
							if (arg4 != 0) {
								local59 = Class242.anIntArray384[arg4];
								local273 = Class242.anIntArray383[arg4];
								local291 = local59 * this.anIntArray618[local53] + this.anIntArray616[local53] * local273 + 16383 >> 14;
								this.anIntArray618[local53] = this.anIntArray618[local53] * local273 + 16383 - this.anIntArray616[local53] * local59 >> 14;
								this.anIntArray616[local53] = local291;
							}
							if (arg3 != 0) {
								local59 = Class242.anIntArray384[arg3];
								local273 = Class242.anIntArray383[arg3];
								local291 = this.anIntArray616[local53] * local273 + local59 * this.anIntArray617[local53] + 16383 >> 14;
								this.anIntArray617[local53] = this.anIntArray617[local53] * local273 + 16383 - this.anIntArray616[local53] * local59 >> 14;
								this.anIntArray616[local53] = local291;
							}
							this.anIntArray616[local53] += Static640.anInt10166;
							this.anIntArray618[local53] += Static383.anInt6668;
							this.anIntArray617[local53] += Static668.anInt10416;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray94.length > local41) {
						local51 = this.anIntArrayArray94[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local273 = this.anIntArray619[local59];
							local291 = this.anIntArray619[local59 + 1];
							for (local756 = local273; local756 < local291; local756++) {
								@Pc(765) int local765 = this.aShortArray150[local756] - 1;
								if (local765 == -1) {
									break;
								}
								@Pc(775) int local775;
								@Pc(779) int local779;
								@Pc(797) int local797;
								if (arg4 != 0) {
									local775 = Class242.anIntArray384[arg4];
									local779 = Class242.anIntArray383[arg4];
									local797 = local779 * this.aShortArray159[local765] + this.aShortArray156[local765] * local775 + 16383 >> 14;
									this.aShortArray156[local765] = (short) (this.aShortArray156[local765] * local779 + 16383 - this.aShortArray159[local765] * local775 >> 14);
									this.aShortArray159[local765] = (short) local797;
								}
								if (arg2 != 0) {
									local775 = Class242.anIntArray384[arg2];
									local779 = Class242.anIntArray383[arg2];
									local797 = this.aShortArray156[local765] * local779 + 16383 - local775 * this.aShortArray153[local765] >> 14;
									this.aShortArray153[local765] = (short) (this.aShortArray156[local765] * local775 + local779 * this.aShortArray153[local765] + 16383 >> 14);
									this.aShortArray156[local765] = (short) local797;
								}
								if (arg3 != 0) {
									local775 = Class242.anIntArray384[arg3];
									local779 = Class242.anIntArray383[arg3];
									local797 = this.aShortArray159[local765] * local779 + this.aShortArray153[local765] * local775 + 16383 >> 14;
									this.aShortArray153[local765] = (short) (this.aShortArray153[local765] * local779 + 16383 - this.aShortArray159[local765] * local775 >> 14);
									this.aShortArray159[local765] = (short) local797;
								}
							}
						}
					}
				}
				if (this.aClass194_14 == null && this.aClass194_16 != null) {
					this.aClass194_16.anInterface8_2 = null;
				}
				if (this.aClass194_14 != null) {
					this.aClass194_14.anInterface8_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray94.length) {
					local153 = this.anIntArrayArray94[local35];
					for (local155 = 0; local155 < local153.length; local155++) {
						local53 = local153[local155];
						this.anIntArray616[local53] -= Static640.anInt10166;
						this.anIntArray618[local53] -= Static383.anInt6668;
						this.anIntArray617[local53] -= Static668.anInt10416;
						this.anIntArray616[local53] = arg2 * this.anIntArray616[local53] >> 7;
						this.anIntArray618[local53] = arg3 * this.anIntArray618[local53] >> 7;
						this.anIntArray617[local53] = this.anIntArray617[local53] * arg4 >> 7;
						this.anIntArray616[local53] += Static640.anInt10166;
						this.anIntArray618[local53] += Static383.anInt6668;
						this.anIntArray617[local53] += Static668.anInt10416;
					}
				}
			}
		} else {
			@Pc(1213) Class23 local1213;
			@Pc(1218) Class146 local1218;
			if (arg0 == 5) {
				if (this.anIntArrayArray96 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray96.length) {
							local153 = this.anIntArrayArray96[local35];
							for (local155 = 0; local155 < local153.length; local155++) {
								local53 = local153[local155];
								local59 = arg2 * 8 + (this.aByteArray112[local53] & 0xFF);
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray112[local53] = (byte) local59;
							}
							if (local153.length > 0 && this.aClass194_16 != null) {
								this.aClass194_16.anInterface8_2 = null;
							}
						}
					}
					if (this.aClass23Array1 != null) {
						for (local35 = 0; local35 < this.anInt10643; local35++) {
							local1213 = this.aClass23Array1[local35];
							local1218 = this.aClass146Array1[local35];
							local1218.anInt3342 = local1218.anInt3342 & 0xFFFFFF | 255 - (this.aByteArray112[local1213.anInt412] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1469) Class146 local1469;
				if (arg0 == 8) {
					if (this.anIntArrayArray95 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (this.anIntArrayArray95.length > local35) {
								local153 = this.anIntArrayArray95[local35];
								for (local155 = 0; local155 < local153.length; local155++) {
									local1469 = this.aClass146Array1[local153[local155]];
									local1469.anInt3341 += arg2;
									local1469.anInt3343 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray95 != null) {
						for (local31 = 0; local31 < local8; local31++) {
							local35 = arg1[local31];
							if (local35 < this.anIntArrayArray95.length) {
								local153 = this.anIntArrayArray95[local35];
								for (local155 = 0; local155 < local153.length; local155++) {
									local1469 = this.aClass146Array1[local153[local155]];
									local1469.anInt3347 = arg2 * local1469.anInt3347 >> 7;
									local1469.anInt3340 = arg3 * local1469.anInt3340 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray95 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray95.length) {
							local153 = this.anIntArrayArray95[local35];
							for (local155 = 0; local155 < local153.length; local155++) {
								local1469 = this.aClass146Array1[local153[local155]];
								local1469.anInt3344 = arg2 + local1469.anInt3344 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray96 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (this.anIntArrayArray96.length > local35) {
						local153 = this.anIntArrayArray96[local35];
						for (local155 = 0; local155 < local153.length; local155++) {
							local53 = local153[local155];
							local59 = this.aShortArray149[local53] & 0xFFFF;
							local273 = local59 >> 10 & 0x3F;
							local291 = local59 >> 7 & 0x7;
							@Pc(1306) int local1306 = local273 + arg2 & 0x3F;
							local291 += arg3 / 4;
							local756 = local59 & 0x7F;
							if (local291 < 0) {
								local291 = 0;
							} else if (local291 > 7) {
								local291 = 7;
							}
							local756 += arg4;
							if (local756 < 0) {
								local756 = 0;
							} else if (local756 > 127) {
								local756 = 127;
							}
							this.aShortArray149[local53] = (short) (local1306 << 10 | local291 << 7 | local756);
						}
						if (local153.length > 0 && this.aClass194_16 != null) {
							this.aClass194_16.anInterface8_2 = null;
						}
					}
				}
				if (this.aClass23Array1 != null) {
					for (local35 = 0; local35 < this.anInt10643; local35++) {
						local1213 = this.aClass23Array1[local35];
						local1218 = this.aClass146Array1[local35];
						local1218.anInt3342 = Static6.anIntArray6[this.aShortArray149[local1213.anInt412] & 0xFFFF] & 0xFFFFFF | local1218.anInt3342 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IBSIB)I")
	private int method8815(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12 = Static6.anIntArray6[Static326.method5087(arg0, arg3)];
		if (arg2 != -1) {
			@Pc(25) Class331 local25 = this.aClass143_Sub2_43.anInterface3_11.method8501(arg2 & 0xFFFF);
			@Pc(30) int local30 = local25.aByte118 & 0xFF;
			@Pc(36) int local36;
			@Pc(60) int local60;
			if (local30 != 0) {
				if (arg0 < 0) {
					local36 = 0;
				} else if (arg0 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg0 * 131586;
				}
				if (local30 == 256) {
					local12 = local36;
				} else {
					local60 = 256 - local30;
					local12 = ((local12 & 0xFF00) * local60 + local30 * (local36 & 0xFF00) & 0xFF0000) + ((local36 & 0xFF00FF) * local30 + (local12 & 0xFF00FF) * local60 & 0xFF00FF00) >> 8;
				}
			}
			local36 = local25.aByte115 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(113) int local113 = (local12 >> 16 & 0xFF) * local36;
				if (local113 > 65535) {
					local113 = 65535;
				}
				local60 = local36 * (local12 >> 8 & 0xFF);
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(141) int local141 = (local12 & 0xFF) * local36;
				if (local141 > 65535) {
					local141 = 65535;
				}
				local12 = (local113 << 8 & 0xFF0096) + (local60 & 0xFF00) + (local141 >> 8);
			}
		}
		return (local12 << 8) + 255 - (arg1 & 0xFF);
	}

	@OriginalMember(owner = "client!wv", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean793;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10610; local15++) {
			@Pc(33) int local33 = this.anIntArray617[local15] * local9 + this.anIntArray616[local15] * local13 >> 14;
			this.anIntArray617[local15] = local13 * this.anIntArray617[local15] - this.anIntArray616[local15] * local9 >> 14;
			this.anIntArray616[local15] = local33;
		}
		this.aBoolean790 = false;
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10610; local3++) {
			if (arg0 != 128) {
				this.anIntArray616[local3] = this.anIntArray616[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray618[local3] = this.anIntArray618[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray617[local3] = arg2 * this.anIntArray617[local3] >> 7;
			}
		}
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
		this.aBoolean790 = false;
	}

	@OriginalMember(owner = "client!wv", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort119;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!eh;IZ)V")
	@Override
	public void method8789(@OriginalArg(0) Class56 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray154 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10610; local14++) {
			if ((arg1 & this.aShortArray154[local14]) != 0) {
				if (arg2) {
					arg0.method8397(this.anIntArray616[local14], this.anIntArray618[local14], this.anIntArray617[local14], local12);
				} else {
					arg0.method8389(this.anIntArray616[local14], this.anIntArray618[local14], this.anIntArray617[local14], local12);
				}
				this.anIntArray616[local14] = local12[0];
				this.anIntArray618[local14] = local12[1];
				this.anIntArray617[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean790) {
			this.method8816();
		}
		@Pc(17) int local17 = arg4 + this.aShort126;
		@Pc(23) int local23 = arg4 + this.aShort122;
		@Pc(29) int local29 = arg6 + this.aShort125;
		@Pc(35) int local35 = arg6 + this.aShort127;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt10540 + local23 >> arg2.anInt10547 >= arg2.anInt10541 || local29 < 0 || arg2.anInt10545 <= local35 + arg2.anInt10540 >> arg2.anInt10547)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt10541 <= local23 + arg3.anInt10540 >> arg3.anInt10547 || local29 < 0 || local35 + arg3.anInt10540 >> arg3.anInt10547 >= arg3.anInt10545) {
				return;
			}
		} else {
			local17 >>= arg2.anInt10547;
			local23 = arg2.anInt10540 + local23 - 1 >> arg2.anInt10547;
			local29 >>= arg2.anInt10547;
			local35 = arg2.anInt10540 + local35 - 1 >> arg2.anInt10547;
			if (arg2.method8749(local17, local29) == arg5 && arg2.method8749(local23, local29) == arg5 && arg5 == arg2.method8749(local17, local35) && arg5 == arg2.method8749(local23, local35)) {
				return;
			}
		}
		@Pc(193) int local193;
		if (arg0 == 1) {
			for (local193 = 0; local193 < this.anInt10610; local193++) {
				this.anIntArray618[local193] = this.anIntArray618[local193] + arg2.method8753(this.anIntArray616[local193] - -arg4, this.anIntArray617[local193] + arg6) - arg5;
			}
		} else {
			@Pc(250) int local250;
			@Pc(261) int local261;
			if (arg0 == 2) {
				@Pc(242) short local242 = this.aShort121;
				if (local242 == 0) {
					return;
				}
				for (local250 = 0; local250 < this.anInt10610; local250++) {
					local261 = (this.anIntArray618[local250] << 16) / local242;
					if (arg1 > local261) {
						this.anIntArray618[local250] += (arg2.method8753(this.anIntArray616[local250] + arg4, arg6 + this.anIntArray617[local250]) - arg5) * (-local261 + arg1) / arg1;
					}
				}
			} else {
				@Pc(345) int local345;
				if (arg0 == 3) {
					local193 = (arg1 & 0xFF) * 4;
					local250 = (arg1 >> 8 & 0xFF) * 4;
					local261 = (arg1 >> 16 & 0xFF) << 6;
					local345 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local193 >> 1) < 0 || arg4 + (local193 >> 1) + arg2.anInt10540 >= arg2.anInt10541 << arg2.anInt10547 || arg6 - (local250 >> 1) < 0 || (local250 >> 1) + arg6 + arg2.anInt10540 >= arg2.anInt10545 << arg2.anInt10547) {
						return;
					}
					this.method8797(local261, local345, local193, arg6, arg2, arg5, local250, arg4);
				} else if (arg0 == 4) {
					local193 = this.aShort123 - this.aShort121;
					for (local250 = 0; local250 < this.anInt10610; local250++) {
						this.anIntArray618[local250] = this.anIntArray618[local250] + arg3.method8753(this.anIntArray616[local250] + arg4, arg6 + this.anIntArray617[local250]) + local193 - arg5;
					}
				} else if (arg0 == 5) {
					local193 = this.aShort123 - this.aShort121;
					for (local250 = 0; local250 < this.anInt10610; local250++) {
						local261 = this.anIntArray616[local250] + arg4;
						local345 = arg6 + this.anIntArray617[local250];
						@Pc(445) int local445 = arg2.method8753(local261, local345);
						@Pc(451) int local451 = arg3.method8753(local261, local345);
						@Pc(458) int local458 = local445 - local451 - arg1;
						this.anIntArray618[local250] = ((this.anIntArray618[local250] << 8) / local193 * local458 >> 8) + local445 - arg5;
					}
				}
			}
		}
		this.aBoolean790 = false;
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class114 method8810(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(18) Class114_Sub3 local18;
		@Pc(14) Class114_Sub3 local14;
		if (arg0 == 1) {
			local14 = this.aClass143_Sub2_43.aClass114_Sub3_9;
			local18 = this.aClass143_Sub2_43.aClass114_Sub3_1;
		} else if (arg0 == 2) {
			local14 = this.aClass143_Sub2_43.aClass114_Sub3_5;
			local18 = this.aClass143_Sub2_43.aClass114_Sub3_7;
		} else if (arg0 == 3) {
			local14 = this.aClass143_Sub2_43.aClass114_Sub3_2;
			local18 = this.aClass143_Sub2_43.aClass114_Sub3_4;
		} else if (arg0 == 4) {
			local14 = this.aClass143_Sub2_43.aClass114_Sub3_3;
			local18 = this.aClass143_Sub2_43.aClass114_Sub3_10;
		} else if (arg0 == 5) {
			local18 = this.aClass143_Sub2_43.aClass114_Sub3_6;
			local14 = this.aClass143_Sub2_43.aClass114_Sub3_8;
		} else {
			local18 = local14 = new Class114_Sub3(this.aClass143_Sub2_43);
		}
		return this.method8820(local14, arg2, arg1, local18, arg0 != 0);
	}

	@OriginalMember(owner = "client!wv", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort126;
	}

	@OriginalMember(owner = "client!wv", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10610; local3++) {
			this.anIntArray617[local3] = -this.anIntArray617[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.lb; local29++) {
			this.aShortArray153[local29] = (short) -this.aShortArray153[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt10633; local48++) {
			@Pc(55) short local55 = this.aShortArray152[local48];
			this.aShortArray152[local48] = this.aShortArray155[local48];
			this.aShortArray155[local48] = local55;
		}
		if (this.aClass194_14 == null && this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
		}
		if (this.aClass194_14 != null) {
			this.aClass194_14.anInterface8_2 = null;
		}
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
		this.aBoolean790 = false;
		if (this.aClass319_1 != null) {
			this.aClass319_1.anInterface15_4 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub2_Sub7 ba(@OriginalArg(0) Class5_Sub2_Sub7 arg0) {
		if (this.lb == 0) {
			return null;
		}
		if (!this.aBoolean790) {
			this.method8816();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass143_Sub2_43.anInt5863 <= 0) {
			local37 = this.aShort126 - (this.aShort121 * this.aClass143_Sub2_43.anInt5863 >> 8) >> this.aClass143_Sub2_43.anInt5821;
			local54 = this.aShort122 - (this.aShort123 * this.aClass143_Sub2_43.anInt5863 >> 8) >> this.aClass143_Sub2_43.anInt5821;
		} else {
			local37 = this.aShort126 - (this.aShort123 * this.aClass143_Sub2_43.anInt5863 >> 8) >> this.aClass143_Sub2_43.anInt5821;
			local54 = this.aShort122 - (this.aShort121 * this.aClass143_Sub2_43.anInt5863 >> 8) >> this.aClass143_Sub2_43.anInt5821;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass143_Sub2_43.anInt5843 > 0) {
			local114 = this.aShort125 - (this.aClass143_Sub2_43.anInt5843 * this.aShort123 >> 8) >> this.aClass143_Sub2_43.anInt5821;
			local131 = this.aShort127 - (this.aClass143_Sub2_43.anInt5843 * this.aShort121 >> 8) >> this.aClass143_Sub2_43.anInt5821;
		} else {
			local114 = this.aShort125 - (this.aShort121 * this.aClass143_Sub2_43.anInt5843 >> 8) >> this.aClass143_Sub2_43.anInt5821;
			local131 = this.aShort127 - (this.aShort123 * this.aClass143_Sub2_43.anInt5843 >> 8) >> this.aClass143_Sub2_43.anInt5821;
		}
		@Pc(173) int local173 = local54 + 1 - local37;
		@Pc(180) int local180 = local131 + 1 - local114;
		@Pc(183) Class5_Sub2_Sub7_Sub2 local183 = (Class5_Sub2_Sub7_Sub2) arg0;
		@Pc(193) Class5_Sub2_Sub7_Sub2 local193;
		if (local183 != null && local183.method5404(local173, local180)) {
			local193 = local183;
			local183.method5405();
		} else {
			local193 = new Class5_Sub2_Sub7_Sub2(this.aClass143_Sub2_43, local173, local180);
		}
		local193.method5408(local54, local131, local37, local114);
		this.method8824(local193);
		return local193;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(B)V")
	private void method8816() {
		@Pc(7) int local7 = 32767;
		@Pc(14) int local14 = 32767;
		@Pc(16) int local16 = 32767;
		@Pc(18) int local18 = -32768;
		@Pc(20) int local20 = -32768;
		@Pc(22) int local22 = -32768;
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < this.anInt10610; local28++) {
			@Pc(35) int local35 = this.anIntArray616[local28];
			@Pc(40) int local40 = this.anIntArray618[local28];
			@Pc(45) int local45 = this.anIntArray617[local28];
			if (local35 > local18) {
				local18 = local35;
			}
			if (local40 < local14) {
				local14 = local40;
			}
			if (local40 > local20) {
				local20 = local40;
			}
			if (local7 > local35) {
				local7 = local35;
			}
			if (local22 < local45) {
				local22 = local45;
			}
			if (local45 < local16) {
				local16 = local45;
			}
			@Pc(91) int local91 = local45 * local45 + local35 * local35;
			if (local24 < local91) {
				local24 = local91;
			}
			local91 = local40 * local40 + local45 * local45 + local35 * local35;
			if (local91 > local26) {
				local26 = local91;
			}
		}
		this.aShort123 = (short) local20;
		this.aShort126 = (short) local7;
		this.aShort127 = (short) local22;
		this.aShort122 = (short) local18;
		this.aShort125 = (short) local16;
		this.aShort121 = (short) local14;
		this.aShort124 = (short) (int) (Math.sqrt((double) local24) + 0.99D);
		this.aShort118 = (short) (int) (Math.sqrt((double) local26) + 0.99D);
		this.aBoolean790 = true;
	}

	@OriginalMember(owner = "client!wv", name = "I", descriptor = "(I[IIIIZI[I)V")
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
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local27 = 0;
			Static383.anInt6668 = 0;
			Static640.anInt10166 = 0;
			Static668.anInt10416 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray94.length > local41) {
					local51 = this.anIntArrayArray94[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray154 == null || (this.aShortArray154[local59] & arg6) != 0) {
							Static640.anInt10166 += this.anIntArray616[local59];
							Static383.anInt6668 += this.anIntArray618[local59];
							Static668.anInt10416 += this.anIntArray617[local59];
							local27++;
						}
					}
				}
			}
			if (local27 > 0) {
				Static188.aBoolean212 = true;
				Static668.anInt10416 = arg4 + Static668.anInt10416 / local27;
				Static640.anInt10166 = Static640.anInt10166 / local27 + arg2;
				Static383.anInt6668 = Static383.anInt6668 / local27 + arg3;
			} else {
				Static668.anInt10416 = arg4;
				Static640.anInt10166 = arg2;
				Static383.anInt6668 = arg3;
			}
			return;
		}
		@Pc(258) int[] local258;
		@Pc(260) int local260;
		if (arg0 == 1) {
			if (arg7 != null) {
				local27 = arg4 * arg7[2] + arg2 * arg7[0] + arg3 * arg7[1] + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local41 = arg4 * arg7[8] + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local27;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (local35 < this.anIntArrayArray94.length) {
					local258 = this.anIntArrayArray94[local35];
					for (local260 = 0; local260 < local258.length; local260++) {
						local53 = local258[local260];
						if (this.aShortArray154 == null || (arg6 & this.aShortArray154[local53]) != 0) {
							this.anIntArray616[local53] += arg2;
							this.anIntArray618[local53] += arg3;
							this.anIntArray617[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(382) int local382;
		@Pc(405) int local405;
		@Pc(436) int local436;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(471) int local471;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(491) int local491;
		@Pc(645) int local645;
		@Pc(671) int local671;
		@Pc(675) int local675;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(696) int local696;
		@Pc(698) int local698;
		@Pc(827) int[] local827;
		@Pc(829) int local829;
		@Pc(833) int local833;
		@Pc(837) int local837;
		@Pc(839) int local839;
		@Pc(966) int local966;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (local35 < this.anIntArrayArray94.length) {
						local258 = this.anIntArrayArray94[local35];
						for (local260 = 0; local260 < local258.length; local260++) {
							local53 = local258[local260];
							if (this.aShortArray154 == null || (this.aShortArray154[local53] & arg6) != 0) {
								this.anIntArray616[local53] -= Static640.anInt10166;
								this.anIntArray618[local53] -= Static383.anInt6668;
								this.anIntArray617[local53] -= Static668.anInt10416;
								if (arg4 != 0) {
									local59 = Class242.anIntArray384[arg4];
									local382 = Class242.anIntArray383[arg4];
									local405 = this.anIntArray616[local53] * local382 + this.anIntArray618[local53] * local59 + 16383 >> 14;
									this.anIntArray618[local53] = local382 * this.anIntArray618[local53] + 16383 - this.anIntArray616[local53] * local59 >> 14;
									this.anIntArray616[local53] = local405;
								}
								if (arg2 != 0) {
									local59 = Class242.anIntArray384[arg2];
									local382 = Class242.anIntArray383[arg2];
									local405 = local382 * this.anIntArray618[local53] + 16383 - this.anIntArray617[local53] * local59 >> 14;
									this.anIntArray617[local53] = local382 * this.anIntArray617[local53] + local59 * this.anIntArray618[local53] + 16383 >> 14;
									this.anIntArray618[local53] = local405;
								}
								if (arg3 != 0) {
									local59 = Class242.anIntArray384[arg3];
									local382 = Class242.anIntArray383[arg3];
									local405 = this.anIntArray617[local53] * local59 + this.anIntArray616[local53] * local382 + 16383 >> 14;
									this.anIntArray617[local53] = this.anIntArray617[local53] * local382 + 16383 - this.anIntArray616[local53] * local59 >> 14;
									this.anIntArray616[local53] = local405;
								}
								this.anIntArray616[local53] += Static640.anInt10166;
								this.anIntArray618[local53] += Static383.anInt6668;
								this.anIntArray617[local53] += Static668.anInt10416;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray94.length > local41) {
							local51 = this.anIntArrayArray94[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray154 == null || (arg6 & this.aShortArray154[local59]) != 0) {
									local382 = this.anIntArray619[local59];
									local405 = this.anIntArray619[local59 + 1];
									for (local436 = local382; local436 < local405; local436++) {
										local463 = this.aShortArray150[local436] - 1;
										if (local463 == -1) {
											break;
										}
										if (arg4 != 0) {
											local467 = Class242.anIntArray384[arg4];
											local471 = Class242.anIntArray383[arg4];
											local475 = local467 * this.aShortArray156[local463] + this.aShortArray159[local463] * local471 + 16383 >> 14;
											this.aShortArray156[local463] = (short) (local471 * this.aShortArray156[local463] + 16383 - local467 * this.aShortArray159[local463] >> 14);
											this.aShortArray159[local463] = (short) local475;
										}
										if (arg2 != 0) {
											local467 = Class242.anIntArray384[arg2];
											local471 = Class242.anIntArray383[arg2];
											local475 = local471 * this.aShortArray156[local463] + 16383 - this.aShortArray153[local463] * local467 >> 14;
											this.aShortArray153[local463] = (short) (local471 * this.aShortArray153[local463] + local467 * this.aShortArray156[local463] + 16383 >> 14);
											this.aShortArray156[local463] = (short) local475;
										}
										if (arg3 != 0) {
											local467 = Class242.anIntArray384[arg3];
											local471 = Class242.anIntArray383[arg3];
											local475 = this.aShortArray159[local463] * local471 + this.aShortArray153[local463] * local467 + 16383 >> 14;
											this.aShortArray153[local463] = (short) (local471 * this.aShortArray153[local463] + 16383 - local467 * this.aShortArray159[local463] >> 14);
											this.aShortArray159[local463] = (short) local475;
										}
									}
								}
							}
						}
					}
					if (this.aClass194_14 == null && this.aClass194_16 != null) {
						this.aClass194_16.anInterface8_2 = null;
					}
					if (this.aClass194_14 != null) {
						this.aClass194_14.anInterface8_2 = null;
					}
				}
			} else {
				local27 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local260 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static188.aBoolean212) {
					local382 = arg7[0] * Static640.anInt10166 + Static383.anInt6668 * arg7[3] + Static668.anInt10416 * arg7[6] + 8192 >> 14;
					local405 = arg7[4] * Static383.anInt6668 + arg7[1] * Static640.anInt10166 + Static668.anInt10416 * arg7[7] + 8192 >> 14;
					local382 += local260;
					local405 += local53;
					local436 = Static383.anInt6668 * arg7[5] + Static640.anInt10166 * arg7[2] + Static668.anInt10416 * arg7[8] + 8192 >> 14;
					Static640.anInt10166 = local382;
					local436 += local59;
					Static383.anInt6668 = local405;
					Static188.aBoolean212 = false;
					Static668.anInt10416 = local436;
				}
				@Pc(451) int[] local451 = new int[9];
				local405 = Class242.anIntArray383[arg2];
				local436 = Class242.anIntArray384[arg2];
				local463 = Class242.anIntArray383[arg3];
				local467 = Class242.anIntArray384[arg3];
				local471 = Class242.anIntArray383[arg4];
				local475 = Class242.anIntArray384[arg4];
				local483 = local471 * local436 + 8192 >> 14;
				local491 = local475 * local436 + 8192 >> 14;
				local451[6] = local463 * local491 + local471 * -local467 + 8192 >> 14;
				local451[7] = local483 * local463 + local475 * local467 + 8192 >> 14;
				local451[2] = local405 * local467 + 8192 >> 14;
				local451[0] = local467 * local491 + local463 * local471 + 8192 >> 14;
				local451[8] = local405 * local463 + 8192 >> 14;
				local451[5] = -local436;
				local451[1] = -local463 * local475 + local483 * local467 + 8192 >> 14;
				local451[3] = local405 * local475 + 8192 >> 14;
				local451[4] = local471 * local405 + 8192 >> 14;
				@Pc(619) int local619 = -Static668.anInt10416 * local451[2] + -Static383.anInt6668 * local451[1] + local451[0] * -Static640.anInt10166 + 8192 >> 14;
				local645 = -Static668.anInt10416 * local451[5] + local451[3] * -Static640.anInt10166 + local451[4] * -Static383.anInt6668 + 8192 >> 14;
				local671 = -Static383.anInt6668 * local451[7] + -Static640.anInt10166 * local451[6] + local451[8] * -Static668.anInt10416 + 8192 >> 14;
				local675 = local619 + Static640.anInt10166;
				@Pc(679) int local679 = local645 + Static383.anInt6668;
				local683 = local671 + Static668.anInt10416;
				@Pc(686) int[] local686 = new int[9];
				for (local688 = 0; local688 < 3; local688++) {
					for (local692 = 0; local692 < 3; local692++) {
						local696 = 0;
						for (local698 = 0; local698 < 3; local698++) {
							local696 += local451[local688 * 3 + local698] * arg7[local692 * 3 + local698];
						}
						local686[local688 * 3 + local692] = local696 + 8192 >> 14;
					}
				}
				local692 = local260 * local451[0] + local53 * local451[1] + local59 * local451[2] + 8192 >> 14;
				local696 = local451[3] * local260 + local451[4] * local53 + local451[5] * local59 + 8192 >> 14;
				local696 += local679;
				local692 += local675;
				local698 = local451[6] * local260 + local451[7] * local53 + local59 * local451[8] + 8192 >> 14;
				local698 += local683;
				local827 = new int[9];
				for (local829 = 0; local829 < 3; local829++) {
					for (local833 = 0; local833 < 3; local833++) {
						local837 = 0;
						for (local839 = 0; local839 < 3; local839++) {
							local837 += arg7[local829 * 3 + local839] * local686[local839 * 3 + local833];
						}
						local827[local833 + local829 * 3] = local837 + 8192 >> 14;
					}
				}
				local833 = local696 * arg7[1] + arg7[0] * local692 + arg7[2] * local698 + 8192 >> 14;
				local837 = arg7[4] * local696 + local692 * arg7[3] + local698 * arg7[5] + 8192 >> 14;
				local837 += local35;
				local833 += local27;
				local839 = arg7[6] * local692 + arg7[7] * local696 + arg7[8] * local698 + 8192 >> 14;
				local839 += local41;
				for (local966 = 0; local966 < local8; local966++) {
					@Pc(972) int local972 = arg1[local966];
					if (this.anIntArrayArray94.length > local972) {
						@Pc(982) int[] local982 = this.anIntArrayArray94[local972];
						for (@Pc(984) int local984 = 0; local984 < local982.length; local984++) {
							@Pc(990) int local990 = local982[local984];
							if (this.aShortArray154 == null || (this.aShortArray154[local990] & arg6) != 0) {
								@Pc(1031) int local1031 = local827[1] * this.anIntArray618[local990] + this.anIntArray616[local990] * local827[0] + this.anIntArray617[local990] * local827[2] + 8192 >> 14;
								@Pc(1062) int local1062 = this.anIntArray617[local990] * local827[5] + this.anIntArray618[local990] * local827[4] + this.anIntArray616[local990] * local827[3] + 8192 >> 14;
								@Pc(1066) int local1066 = local1062 + local837;
								@Pc(1097) int local1097 = local827[7] * this.anIntArray618[local990] + local827[6] * this.anIntArray616[local990] + this.anIntArray617[local990] * local827[8] + 8192 >> 14;
								@Pc(1101) int local1101 = local1031 + local833;
								this.anIntArray616[local990] = local1101;
								@Pc(1110) int local1110 = local1097 + local839;
								this.anIntArray618[local990] = local1066;
								this.anIntArray617[local990] = local1110;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2560) Class23 local2560;
			@Pc(2565) Class146 local2565;
			if (arg0 == 5) {
				if (this.anIntArrayArray96 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (local35 < this.anIntArrayArray96.length) {
							local258 = this.anIntArrayArray96[local35];
							for (local260 = 0; local260 < local258.length; local260++) {
								local53 = local258[local260];
								if (this.aShortArray157 == null || (this.aShortArray157[local53] & arg6) != 0) {
									local59 = (this.aByteArray112[local53] & 0xFF) + (arg2 * 8);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray112[local53] = (byte) local59;
									if (this.aClass194_16 != null) {
										this.aClass194_16.anInterface8_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass23Array1 != null) {
						for (local35 = 0; local35 < this.anInt10643; local35++) {
							local2560 = this.aClass23Array1[local35];
							local2565 = this.aClass146Array1[local35];
							local2565.anInt3342 = local2565.anInt3342 & 0xFFFFFF | 255 - (this.aByteArray112[local2560.anInt412] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2823) Class146 local2823;
				if (arg0 == 8) {
					if (this.anIntArrayArray95 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (this.anIntArrayArray95.length > local35) {
								local258 = this.anIntArrayArray95[local35];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2823 = this.aClass146Array1[local258[local260]];
									local2823.anInt3341 += arg2;
									local2823.anInt3343 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray95 != null) {
						for (local27 = 0; local27 < local8; local27++) {
							local35 = arg1[local27];
							if (local35 < this.anIntArrayArray95.length) {
								local258 = this.anIntArrayArray95[local35];
								for (local260 = 0; local260 < local258.length; local260++) {
									local2823 = this.aClass146Array1[local258[local260]];
									local2823.anInt3340 = local2823.anInt3340 * arg3 >> 7;
									local2823.anInt3347 = arg2 * local2823.anInt3347 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray95 != null) {
					for (local27 = 0; local27 < local8; local27++) {
						local35 = arg1[local27];
						if (this.anIntArrayArray95.length > local35) {
							local258 = this.anIntArrayArray95[local35];
							for (local260 = 0; local260 < local258.length; local260++) {
								local2823 = this.aClass146Array1[local258[local260]];
								local2823.anInt3344 = arg2 + local2823.anInt3344 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray96 != null) {
				for (local27 = 0; local27 < local8; local27++) {
					local35 = arg1[local27];
					if (this.anIntArrayArray96.length > local35) {
						local258 = this.anIntArrayArray96[local35];
						for (local260 = 0; local260 < local258.length; local260++) {
							local53 = local258[local260];
							if (this.aShortArray157 == null || (this.aShortArray157[local53] & arg6) != 0) {
								local59 = this.aShortArray149[local53] & 0xFFFF;
								local382 = local59 >> 10 & 0x3F;
								local405 = local59 >> 7 & 0x7;
								local436 = local59 & 0x7F;
								@Pc(2674) int local2674 = local382 + arg2 & 0x3F;
								local405 += arg3 / 4;
								if (local405 < 0) {
									local405 = 0;
								} else if (local405 > 7) {
									local405 = 7;
								}
								local436 += arg4;
								if (local436 < 0) {
									local436 = 0;
								} else if (local436 > 127) {
									local436 = 127;
								}
								this.aShortArray149[local53] = (short) (local2674 << 10 | local405 << 7 | local436);
								if (this.aClass194_16 != null) {
									this.aClass194_16.anInterface8_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass23Array1 != null) {
					for (local35 = 0; local35 < this.anInt10643; local35++) {
						local2560 = this.aClass23Array1[local35];
						local2565 = this.aClass146Array1[local35];
						local2565.anInt3342 = local2565.anInt3342 & 0xFF000000 | Static6.anIntArray6[this.aShortArray149[local2560.anInt412] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local27 = 0; local27 < local8; local27++) {
				local35 = arg1[local27];
				if (this.anIntArrayArray94.length > local35) {
					local258 = this.anIntArrayArray94[local35];
					for (local260 = 0; local260 < local258.length; local260++) {
						local53 = local258[local260];
						if (this.aShortArray154 == null || (arg6 & this.aShortArray154[local53]) != 0) {
							this.anIntArray616[local53] -= Static640.anInt10166;
							this.anIntArray618[local53] -= Static383.anInt6668;
							this.anIntArray617[local53] -= Static668.anInt10416;
							this.anIntArray616[local53] = arg2 * this.anIntArray616[local53] >> 7;
							this.anIntArray618[local53] = arg3 * this.anIntArray618[local53] >> 7;
							this.anIntArray617[local53] = arg4 * this.anIntArray617[local53] >> 7;
							this.anIntArray616[local53] += Static640.anInt10166;
							this.anIntArray618[local53] += Static383.anInt6668;
							this.anIntArray617[local53] += Static668.anInt10416;
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
			if (Static188.aBoolean212) {
				local382 = Static668.anInt10416 * arg7[6] + Static383.anInt6668 * arg7[3] + arg7[0] * Static640.anInt10166 + 8192 >> 14;
				local405 = arg7[1] * Static640.anInt10166 + arg7[4] * Static383.anInt6668 + Static668.anInt10416 * arg7[7] + 8192 >> 14;
				local382 += local260;
				local405 += local53;
				local436 = Static383.anInt6668 * arg7[5] + Static640.anInt10166 * arg7[2] + arg7[8] * Static668.anInt10416 + 8192 >> 14;
				Static640.anInt10166 = local382;
				local436 += local59;
				Static383.anInt6668 = local405;
				Static188.aBoolean212 = false;
				Static668.anInt10416 = local436;
			}
			local382 = arg2 << 15 >> 7;
			local405 = arg3 << 15 >> 7;
			local436 = arg4 << 15 >> 7;
			local463 = local382 * -Static640.anInt10166 + 8192 >> 14;
			local467 = -Static383.anInt6668 * local405 + 8192 >> 14;
			local471 = local436 * -Static668.anInt10416 + 8192 >> 14;
			local475 = Static640.anInt10166 + local463;
			local483 = Static383.anInt6668 + local467;
			local491 = Static668.anInt10416 + local471;
			@Pc(2000) int[] local2000 = new int[] { local382 * arg7[0] + 8192 >> 14, arg7[3] * local382 + 8192 >> 14, local382 * arg7[6] + 8192 >> 14, local405 * arg7[1] + 8192 >> 14, local405 * arg7[4] + 8192 >> 14, arg7[7] * local405 + 8192 >> 14, arg7[2] * local436 + 8192 >> 14, arg7[5] * local436 + 8192 >> 14, local436 * arg7[8] + 8192 >> 14 };
			local645 = local382 * local260 + 8192 >> 14;
			local671 = local53 * local405 + 8192 >> 14;
			local675 = local59 * local436 + 8192 >> 14;
			@Pc(2136) int local2136 = local671 + local483;
			@Pc(2140) int local2140 = local645 + local475;
			@Pc(2144) int local2144 = local675 + local491;
			@Pc(2147) int[] local2147 = new int[9];
			@Pc(2153) int local2153;
			for (local683 = 0; local683 < 3; local683++) {
				for (local2153 = 0; local2153 < 3; local2153++) {
					local688 = 0;
					for (local692 = 0; local692 < 3; local692++) {
						local688 += local2000[local2153 + local692 * 3] * arg7[local692 + local683 * 3];
					}
					local2147[local2153 + local683 * 3] = local688 + 8192 >> 14;
				}
			}
			local2153 = arg7[1] * local2136 + arg7[0] * local2140 + arg7[2] * local2144 + 8192 >> 14;
			local688 = arg7[5] * local2144 + local2140 * arg7[3] + local2136 * arg7[4] + 8192 >> 14;
			local688 += local35;
			local692 = local2144 * arg7[8] + arg7[6] * local2140 + local2136 * arg7[7] + 8192 >> 14;
			local2153 += local27;
			local692 += local41;
			for (local696 = 0; local696 < local8; local696++) {
				local698 = arg1[local696];
				if (this.anIntArrayArray94.length > local698) {
					local827 = this.anIntArrayArray94[local698];
					for (local829 = 0; local829 < local827.length; local829++) {
						local833 = local827[local829];
						if (this.aShortArray154 == null || (this.aShortArray154[local833] & arg6) != 0) {
							local837 = this.anIntArray617[local833] * local2147[2] + this.anIntArray616[local833] * local2147[0] + this.anIntArray618[local833] * local2147[1] + 8192 >> 14;
							local839 = local2147[5] * this.anIntArray617[local833] + this.anIntArray618[local833] * local2147[4] + this.anIntArray616[local833] * local2147[3] + 8192 >> 14;
							@Pc(2386) int local2386 = local837 + local2153;
							local966 = this.anIntArray617[local833] * local2147[8] + this.anIntArray616[local833] * local2147[6] + local2147[7] * this.anIntArray618[local833] + 8192 >> 14;
							@Pc(2421) int local2421 = local839 + local688;
							@Pc(2425) int local2425 = local966 + local692;
							this.anIntArray616[local833] = local2386;
							this.anIntArray618[local833] = local2421;
							this.anIntArray617[local833] = local2425;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean792;
	}

	@OriginalMember(owner = "client!wv", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort120;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(FIIIIIILclient!hm;JF)S")
	private short method8817(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class156 arg6, @OriginalArg(8) long arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray619[arg1];
		@Pc(17) int local17 = this.anIntArray619[arg1 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray150[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static280.aLongArray5[local21] == arg7) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray150[local19] = (short) (this.lb + 1);
		Static280.aLongArray5[local19] = arg7;
		this.aShortArray159[this.lb] = (short) arg5;
		this.aShortArray156[this.lb] = (short) arg4;
		this.aShortArray153[this.lb] = (short) arg3;
		this.aByteArray111[this.lb] = (byte) arg2;
		this.aFloatArray82[this.lb] = arg0;
		this.aFloatArray83[this.lb] = arg8;
		return (short) this.lb++;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILclient!eh;ZII)Z")
	@Override
	public boolean method8798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class56 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method8823(arg4, arg0, arg1, arg5, arg2, arg3);
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(ZI)V")
	private void method8818(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass194_16 != null && this.aClass194_16.anInterface8_2 == null;
		@Pc(27) boolean local27 = this.aClass194_14 != null && this.aClass194_14.anInterface8_2 == null;
		@Pc(52) boolean local52 = this.aClass194_15 != null && this.aClass194_15.anInterface8_2 == null;
		@Pc(63) boolean local63 = this.aClass194_13 != null && this.aClass194_13.anInterface8_2 == null;
		if (arg0) {
			local52 &= (this.aByte155 & 0x1) != 0;
			local63 &= (this.aByte155 & 0x8) != 0;
			local16 &= (this.aByte155 & 0x2) != 0;
			local27 &= (this.aByte155 & 0x4) != 0;
		}
		@Pc(111) byte local111 = 0;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		@Pc(119) byte local119 = 0;
		if (local52) {
			local111 = 12;
		}
		if (local16) {
			local115 = local111;
			local111 = (byte) (local111 + 4);
		}
		if (local27) {
			local117 = local111;
			local111 = (byte) (local111 + 12);
		}
		if (local63) {
			local119 = local111;
			local111 = (byte) (local111 + 8);
		}
		if (local111 == 0) {
			return;
		}
		if (this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3.aByteArray45.length >= this.lb * local111) {
			this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3.anInt4144 = 0;
		} else {
			this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3 = new Class5_Sub15_Sub1((this.lb + 100) * local111);
		}
		@Pc(198) Class5_Sub15_Sub1 local198 = this.aClass143_Sub2_43.aClass5_Sub15_Sub1_3;
		@Pc(206) int local206;
		@Pc(215) int local215;
		@Pc(243) int local243;
		@Pc(252) int local252;
		if (local52) {
			@Pc(222) int local222;
			@Pc(229) int local229;
			@Pc(234) int local234;
			@Pc(241) int local241;
			if (this.aClass143_Sub2_43.aBoolean408) {
				for (local206 = 0; local206 < this.anInt10610; local206++) {
					local215 = Stream.floatToRawIntBits((float) this.anIntArray616[local206]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray618[local206]);
					local229 = Stream.floatToRawIntBits((float) this.anIntArray617[local206]);
					local234 = this.anIntArray619[local206];
					local241 = this.anIntArray619[local206 + 1];
					for (local243 = local234; local243 < local241; local243++) {
						local252 = this.aShortArray150[local243] - 1;
						if (local252 == -1) {
							break;
						}
						local198.anInt4144 = local252 * local111;
						local198.method3679(local215);
						local198.method3679(local222);
						local198.method3679(local229);
					}
				}
			} else {
				for (local206 = 0; local206 < this.anInt10610; local206++) {
					local215 = Stream.floatToRawIntBits((float) this.anIntArray616[local206]);
					local222 = Stream.floatToRawIntBits((float) this.anIntArray618[local206]);
					local229 = Stream.floatToRawIntBits((float) this.anIntArray617[local206]);
					local234 = this.anIntArray619[local206];
					local241 = this.anIntArray619[local206 + 1];
					for (local243 = local234; local243 < local241; local243++) {
						local252 = this.aShortArray150[local243] - 1;
						if (local252 == -1) {
							break;
						}
						local198.anInt4144 = local111 * local252;
						local198.method3684(local215);
						local198.method3684(local222);
						local198.method3684(local229);
					}
				}
			}
		}
		@Pc(561) float local561;
		@Pc(459) short[] local459;
		@Pc(465) short[] local465;
		@Pc(468) short[] local468;
		@Pc(462) byte[] local462;
		@Pc(619) float local619;
		if (local16) {
			if (this.aClass194_14 == null) {
				if (this.aClass383_1 == null) {
					local459 = this.aShortArray159;
					local462 = this.aByteArray111;
					local465 = this.aShortArray156;
					local468 = this.aShortArray153;
				} else {
					local462 = this.aClass383_1.aByteArray106;
					local459 = this.aClass383_1.aShortArray140;
					local465 = this.aClass383_1.aShortArray139;
					local468 = this.aClass383_1.aShortArray138;
				}
				@Pc(492) float local492 = this.aClass143_Sub2_43.aFloatArray40[0];
				@Pc(498) float local498 = this.aClass143_Sub2_43.aFloatArray40[1];
				@Pc(504) float local504 = this.aClass143_Sub2_43.aFloatArray40[2];
				@Pc(508) float local508 = this.aClass143_Sub2_43.aFloat105;
				@Pc(518) float local518 = this.aClass143_Sub2_43.aFloat97 * 768.0F / (float) this.aShort119;
				@Pc(528) float local528 = this.aClass143_Sub2_43.aFloat108 * 768.0F / (float) this.aShort119;
				for (@Pc(530) int local530 = 0; local530 < this.anInt10633; local530++) {
					@Pc(550) int local550 = this.method8815(this.aShort120, this.aByteArray112[local530], this.aShortArray151[local530], this.aShortArray149[local530]);
					local561 = (float) (local550 >> 16 & 0xFF) * this.aClass143_Sub2_43.aFloat98;
					@Pc(572) float local572 = this.aClass143_Sub2_43.aFloat96 * (float) (local550 >> 8 & 0xFF);
					@Pc(581) float local581 = (float) (local550 >>> 24) * this.aClass143_Sub2_43.aFloat100;
					@Pc(586) short local586 = this.aShortArray152[local530];
					@Pc(591) short local591 = (short) local462[local586];
					if (local591 == 0) {
						local619 = (local498 * (float) local465[local586] + (float) local459[local586] * local492 + (float) local468[local586] * local504) * 0.0026041667F;
					} else {
						local619 = ((float) local468[local586] * local504 + local498 * (float) local465[local586] + local492 * (float) local459[local586]) / (float) (local591 * 256);
					}
					@Pc(656) float local656 = local508 + local619 * (local619 < 0.0F ? local528 : local518);
					@Pc(661) int local661 = (int) (local581 * local656);
					@Pc(666) int local666 = (int) (local561 * local656);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					@Pc(687) int local687 = (int) (local656 * local572);
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					local198.anInt4144 = local111 * local586 + local115;
					if (local687 < 0) {
						local687 = 0;
					} else if (local687 > 255) {
						local687 = 255;
					}
					local198.method3651(local661);
					local198.method3651(local666);
					local198.method3651(local687);
					local198.method3651(255 - (this.aByteArray112[local530] & 0xFF));
					local586 = this.aShortArray158[local530];
					local591 = (short) local462[local586];
					if (local591 == 0) {
						local619 = ((float) local465[local586] * local498 + local492 * (float) local459[local586] + local504 * (float) local468[local586]) * 0.0026041667F;
					} else {
						local619 = (local492 * (float) local459[local586] + local498 * (float) local465[local586] + (float) local468[local586] * local504) / (float) (local591 * 256);
					}
					local656 = local508 + local619 * (local619 < 0.0F ? local528 : local518);
					local661 = (int) (local581 * local656);
					local666 = (int) (local561 * local656);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					local687 = (int) (local572 * local656);
					local198.anInt4144 = local115 + local586 * local111;
					if (local687 < 0) {
						local687 = 0;
					} else if (local687 > 255) {
						local687 = 255;
					}
					local198.method3651(local661);
					local198.method3651(local666);
					local198.method3651(local687);
					local198.method3651(255 - (this.aByteArray112[local530] & 0xFF));
					local586 = this.aShortArray155[local530];
					local591 = (short) local462[local586];
					if (local591 == 0) {
						local619 = (local492 * (float) local459[local586] + (float) local465[local586] * local498 + (float) local468[local586] * local504) * 0.0026041667F;
					} else {
						local619 = ((float) local459[local586] * local492 + local498 * (float) local465[local586] + (float) local468[local586] * local504) / (float) (local591 * 256);
					}
					local656 = local508 + (local619 < 0.0F ? local528 : local518) * local619;
					local661 = (int) (local581 * local656);
					local666 = (int) (local561 * local656);
					if (local661 < 0) {
						local661 = 0;
					} else if (local661 > 255) {
						local661 = 255;
					}
					if (local666 < 0) {
						local666 = 0;
					} else if (local666 > 255) {
						local666 = 255;
					}
					local687 = (int) (local656 * local572);
					if (local687 < 0) {
						local687 = 0;
					} else if (local687 > 255) {
						local687 = 255;
					}
					local198.anInt4144 = local586 * local111 + local115;
					local198.method3651(local661);
					local198.method3651(local666);
					local198.method3651(local687);
					local198.method3651(255 - (this.aByteArray112[local530] & 0xFF));
				}
			} else {
				for (local206 = 0; local206 < this.anInt10633; local206++) {
					local215 = this.method8815(this.aShort120, this.aByteArray112[local206], this.aShortArray151[local206], this.aShortArray149[local206]);
					local198.anInt4144 = local115 + this.aShortArray152[local206] * local111;
					local198.method3679(local215);
					local198.anInt4144 = local111 * this.aShortArray158[local206] + local115;
					local198.method3679(local215);
					local198.anInt4144 = local115 + local111 * this.aShortArray155[local206];
					local198.method3679(local215);
				}
			}
		}
		if (local27) {
			if (this.aClass383_1 == null) {
				local465 = this.aShortArray156;
				local468 = this.aShortArray153;
				local459 = this.aShortArray159;
				local462 = this.aByteArray111;
			} else {
				local459 = this.aClass383_1.aShortArray140;
				local468 = this.aClass383_1.aShortArray138;
				local465 = this.aClass383_1.aShortArray139;
				local462 = this.aClass383_1.aByteArray106;
			}
			@Pc(1117) float local1117 = 3.0F / (float) this.aShort119;
			local619 = 3.0F / (float) (this.aShort119 + this.aShort119 / 2);
			local198.anInt4144 = local117;
			if (this.aClass143_Sub2_43.aBoolean408) {
				for (local243 = 0; local243 < this.lb; local243++) {
					local252 = local462[local243] & 0xFF;
					if (local252 == 0) {
						local198.method1614((float) local459[local243] * local619);
						local198.method1614((float) local465[local243] * local619);
						local198.method1614(local619 * (float) local468[local243]);
					} else {
						local561 = local1117 / (float) local252;
						local198.method1614((float) local459[local243] * local561);
						local198.method1614(local561 * (float) local465[local243]);
						local198.method1614((float) local468[local243] * local561);
					}
					local198.anInt4144 += local111 - 12;
				}
			} else {
				for (local243 = 0; local243 < this.lb; local243++) {
					local252 = local462[local243] & 0xFF;
					if (local252 == 0) {
						local198.method1612(local619 * (float) local459[local243]);
						local198.method1612((float) local465[local243] * local619);
						local198.method1612(local619 * (float) local468[local243]);
					} else {
						local561 = local1117 / (float) local252;
						local198.method1612((float) local459[local243] * local561);
						local198.method1612((float) local465[local243] * local561);
						local198.method1612((float) local468[local243] * local561);
					}
					local198.anInt4144 += local111 - 12;
				}
			}
		}
		if (local63) {
			local198.anInt4144 = local119;
			if (this.aClass143_Sub2_43.aBoolean408) {
				for (local206 = 0; local206 < this.lb; local206++) {
					local198.method1614(this.aFloatArray82[local206]);
					local198.method1614(this.aFloatArray83[local206]);
					local198.anInt4144 += local111 - 8;
				}
			} else {
				for (local206 = 0; local206 < this.lb; local206++) {
					local198.method1612(this.aFloatArray82[local206]);
					local198.method1612(this.aFloatArray83[local206]);
					local198.anInt4144 += local111 - 8;
				}
			}
		}
		local198.anInt4144 = this.lb * local111;
		@Pc(1411) Interface8 local1411;
		if (arg0) {
			if (this.anInterface8_7 == null) {
				this.anInterface8_7 = this.aClass143_Sub2_43.method4986(local198.anInt4144, local198.aByteArray45, local111, true);
			} else {
				this.anInterface8_7.method8688(local198.aByteArray45, local198.anInt4144, local111);
			}
			local1411 = this.anInterface8_7;
			this.aByte155 = 0;
		} else {
			local1411 = this.aClass143_Sub2_43.method4986(local198.anInt4144, local198.aByteArray45, local111, false);
			this.aBoolean791 = true;
		}
		if (local52) {
			this.aClass194_15.anInterface8_2 = local1411;
			this.aClass194_15.aByte54 = 0;
		}
		if (local63) {
			this.aClass194_13.aByte54 = local119;
			this.aClass194_13.anInterface8_2 = local1411;
		}
		if (local16) {
			this.aClass194_16.aByte54 = local115;
			this.aClass194_16.anInterface8_2 = local1411;
		}
		if (local27) {
			this.aClass194_14.anInterface8_2 = local1411;
			this.aClass194_14.aByte54 = local117;
		}
	}

	@OriginalMember(owner = "client!wv", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass143_Sub2_43.anInterface3_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt10633; local11++) {
			if (this.aShortArray151[local11] == arg0) {
				this.aShortArray151[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class331 local47 = local9.method8501(arg0 & 0xFFFF);
			local35 = local47.aByte118;
			local37 = local47.aByte115;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class331 local67 = local9.method8501(arg1 & 0xFFFF);
			local55 = local67.aByte118;
			if (local67.aByte116 != 0 || local67.aByte113 != 0) {
				this.aBoolean792 = true;
			}
			local57 = local67.aByte115;
		}
		if (!(local57 != local37 | local35 != local55)) {
			return;
		}
		if (this.aClass23Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt10643; local109++) {
				@Pc(116) Class23 local116 = this.aClass23Array1[local109];
				@Pc(121) Class146 local121 = this.aClass146Array1[local109];
				local121.anInt3342 = local121.anInt3342 & 0xFF000000 | Static6.anIntArray6[this.aShortArray149[local116.anInt412] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8791(@OriginalArg(0) Class114 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class114_Sub3 local8 = (Class114_Sub3) arg0;
		if (this.anInt10633 == 0 || local8.anInt10633 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt10610;
		@Pc(24) int[] local24 = local8.anIntArray616;
		@Pc(27) int[] local27 = local8.anIntArray618;
		@Pc(30) int[] local30 = local8.anIntArray617;
		@Pc(33) short[] local33 = local8.aShortArray159;
		@Pc(36) short[] local36 = local8.aShortArray156;
		@Pc(39) short[] local39 = local8.aShortArray153;
		@Pc(42) byte[] local42 = local8.aByteArray111;
		@Pc(47) short[] local47;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(51) byte[] local51;
		if (this.aClass383_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local47 = this.aClass383_1.aShortArray140;
			local51 = this.aClass383_1.aByteArray106;
			local53 = this.aClass383_1.aShortArray139;
			local49 = this.aClass383_1.aShortArray138;
		}
		@Pc(80) short[] local80;
		@Pc(82) short[] local82;
		@Pc(76) short[] local76;
		@Pc(78) byte[] local78;
		if (local8.aClass383_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local80 = local8.aClass383_1.aShortArray140;
			local76 = local8.aClass383_1.aShortArray138;
			local78 = local8.aClass383_1.aByteArray106;
			local82 = local8.aClass383_1.aShortArray139;
		}
		@Pc(103) int[] local103 = local8.anIntArray619;
		@Pc(106) short[] local106 = local8.aShortArray150;
		if (!local8.aBoolean790) {
			local8.method8816();
		}
		@Pc(115) short local115 = local8.aShort121;
		@Pc(118) short local118 = local8.aShort123;
		@Pc(121) short local121 = local8.aShort126;
		@Pc(124) short local124 = local8.aShort122;
		@Pc(127) short local127 = local8.aShort125;
		@Pc(130) short local130 = local8.aShort127;
		for (@Pc(132) int local132 = 0; local132 < this.anInt10610; local132++) {
			@Pc(142) int local142 = this.anIntArray618[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(161) int local161 = this.anIntArray616[local132] - arg1;
				if (local121 <= local161 && local161 <= local124) {
					@Pc(184) int local184 = this.anIntArray617[local132] - arg3;
					if (local184 >= local127 && local130 >= local184) {
						@Pc(198) int local198 = -1;
						@Pc(203) int local203 = this.anIntArray619[local132];
						@Pc(210) int local210 = this.anIntArray619[local132 + 1];
						for (@Pc(212) int local212 = local203; local212 < local210; local212++) {
							local198 = this.aShortArray150[local212] - 1;
							if (local198 == -1 || this.aByteArray111[local198] != 0) {
								break;
							}
						}
						if (local198 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local21; local247++) {
								if (local24[local247] == local161 && local30[local247] == local184 && local27[local247] == local142) {
									local203 = local103[local247];
									@Pc(278) int local278 = -1;
									local210 = local103[local247 + 1];
									for (@Pc(286) int local286 = local203; local286 < local210; local286++) {
										local278 = local106[local286] - 1;
										if (local278 == -1 || local42[local278] != 0) {
											break;
										}
									}
									if (local278 != -1) {
										if (local47 == null) {
											this.aClass383_1 = new Class383();
											local47 = this.aClass383_1.aShortArray140 = Static500.method7244(this.aShortArray159);
											local53 = this.aClass383_1.aShortArray139 = Static500.method7244(this.aShortArray156);
											local49 = this.aClass383_1.aShortArray138 = Static500.method7244(this.aShortArray153);
											local51 = this.aClass383_1.aByteArray106 = Static507.method7311(this.aByteArray111);
										}
										if (local80 == null) {
											@Pc(365) Class383 local365 = local8.aClass383_1 = new Class383();
											local80 = local365.aShortArray140 = Static500.method7244(local33);
											local82 = local365.aShortArray139 = Static500.method7244(local36);
											local76 = local365.aShortArray138 = Static500.method7244(local39);
											local78 = local365.aByteArray106 = Static507.method7311(local42);
										}
										@Pc(398) short local398 = this.aShortArray159[local198];
										@Pc(403) short local403 = this.aShortArray156[local198];
										@Pc(408) short local408 = this.aShortArray153[local198];
										@Pc(413) byte local413 = this.aByteArray111[local198];
										local210 = local103[local247 + 1];
										local203 = local103[local247];
										@Pc(433) int local433;
										for (@Pc(425) int local425 = local203; local425 < local210; local425++) {
											local433 = local106[local425] - 1;
											if (local433 == -1) {
												break;
											}
											if (local78[local433] != 0) {
												local80[local433] += local398;
												local82[local433] += local403;
												local76[local433] += local408;
												local78[local433] += local413;
											}
										}
										local203 = this.anIntArray619[local132];
										local413 = local42[local278];
										local403 = local36[local278];
										local408 = local39[local278];
										local210 = this.anIntArray619[local132 + 1];
										local398 = local33[local278];
										for (local433 = local203; local433 < local210; local433++) {
											@Pc(518) int local518 = this.aShortArray150[local433] - 1;
											if (local518 == -1) {
												break;
											}
											if (local51[local518] != 0) {
												local47[local518] += local398;
												local53[local518] += local403;
												local49[local518] += local408;
												local51[local518] += local413;
											}
										}
										if (this.aClass194_14 == null && this.aClass194_16 != null) {
											this.aClass194_16.anInterface8_2 = null;
										}
										if (this.aClass194_14 != null) {
											this.aClass194_14.anInterface8_2 = null;
										}
										if (local8.aClass194_14 == null && local8.aClass194_16 != null) {
											local8.aClass194_16.anInterface8_2 = null;
										}
										if (local8.aClass194_14 != null) {
											local8.aClass194_14.anInterface8_2 = null;
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

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "(I)V")
	private void method8819() {
		if (this.aClass23Array1 == null) {
			return;
		}
		@Pc(8) Class56_Sub3 local8 = this.aClass143_Sub2_43.aClass56_Sub3_2;
		this.aClass143_Sub2_43.method4999();
		this.aClass143_Sub2_43.C(!this.aBoolean793);
		this.aClass143_Sub2_43.method4993(false);
		this.aClass143_Sub2_43.method4970(this.aClass143_Sub2_43.aClass194_7, this.aClass143_Sub2_43.aClass194_8, (Class194) null, (Class194) null);
		for (@Pc(40) int local40 = 0; local40 < this.anInt10643; local40++) {
			@Pc(47) Class23 local47 = this.aClass23Array1[local40];
			@Pc(52) Class146 local52 = this.aClass146Array1[local40];
			if (!local47.aBoolean16 || !this.aClass143_Sub2_43.method6224()) {
				@Pc(81) float local81 = (float) (this.anIntArray616[local47.anInt415] + this.anIntArray616[local47.anInt410] + this.anIntArray616[local47.anInt408]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray618[local47.anInt408] + this.anIntArray618[local47.anInt415] + this.anIntArray618[local47.anInt410]) * 0.3333333F;
				@Pc(124) float local124 = (float) (this.anIntArray617[local47.anInt408] + this.anIntArray617[local47.anInt415] + this.anIntArray617[local47.anInt410]) * 0.3333333F;
				@Pc(138) float local138 = Static88.aFloat32 * local124 + local103 * Static25.aFloat4 + local81 * Static471.aFloat160 + Static454.aFloat147;
				@Pc(152) float local152 = Static388.aFloat127 + Static675.aFloat200 * local124 + Static177.aFloat50 * local103 + local81 * Static481.aFloat14;
				@Pc(166) float local166 = Static613.aFloat174 + local124 * Static76.aFloat29 + Static421.aFloat144 * local81 + Static646.aFloat197 * local103;
				@Pc(187) float local187 = (float) (1.0D / Math.sqrt((double) (local166 * local166 + local152 * local152 + local138 * local138))) * (float) local47.anInt414;
				local8.method8406(local187 * local166 - local166, local47.aShort1 * local52.anInt3340 >> 7, local52.anInt3344, local52.anInt3347 * local47.aShort3 >> 7, local138 + (float) local52.anInt3341 - local187 * local138, (float) local52.anInt3343 - local152 + local152 * local187);
				this.aClass143_Sub2_43.method4955(local8);
				@Pc(239) int local239 = local52.anInt3342;
				OpenGL.glColor4ub((byte) (local239 >> 16), (byte) (local239 >> 8), (byte) local239, (byte) (local239 >> 24));
				this.aClass143_Sub2_43.method4978(local47.aShort2);
				this.aClass143_Sub2_43.method4922(local47.aByte3);
				this.aClass143_Sub2_43.method4961(4);
			}
		}
		this.aClass143_Sub2_43.C(true);
		this.aClass143_Sub2_43.method4977();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!eh;Lclient!sp;II)V")
	@Override
	public void method8807(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class41_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.lb == 0) {
			return;
		}
		@Pc(16) Class56_Sub3 local16 = this.aClass143_Sub2_43.aClass56_Sub3_3;
		if (!this.aBoolean790) {
			this.method8816();
		}
		@Pc(25) Class56_Sub3 local25 = (Class56_Sub3) arg0;
		Static613.aFloat174 = local16.aFloat183 + local16.aFloat182 * local25.aFloat186 + local16.aFloat180 * local25.aFloat185 + local16.aFloat188 * local25.aFloat183;
		Static646.aFloat197 = local25.aFloat184 * local16.aFloat182 + local16.aFloat180 * local25.aFloat177 + local25.aFloat182 * local16.aFloat188;
		@Pc(72) float local72 = (float) this.aShort121 * Static646.aFloat197 + Static613.aFloat174;
		@Pc(80) float local80 = Static613.aFloat174 + (float) this.aShort123 * Static646.aFloat197;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.aShort124 + local80;
			local97 = local72 + (float) this.aShort124;
		} else {
			local91 = (float) -this.aShort124 + local72;
			local97 = local80 + (float) this.aShort124;
		}
		if (this.aClass143_Sub2_43.aFloat103 <= local91 || local97 <= (float) this.aClass143_Sub2_43.anInt5841) {
			return;
		}
		Static454.aFloat147 = local16.aFloat177 * local25.aFloat186 + local25.aFloat185 * local16.aFloat181 + local16.aFloat187 * local25.aFloat183 + local16.aFloat185;
		Static25.aFloat4 = local16.aFloat181 * local25.aFloat177 + local16.aFloat177 * local25.aFloat184 + local25.aFloat182 * local16.aFloat187;
		@Pc(174) float local174 = Static25.aFloat4 * (float) this.aShort121 + Static454.aFloat147;
		@Pc(182) float local182 = Static25.aFloat4 * (float) this.aShort123 + Static454.aFloat147;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = ((float) this.aShort124 + local174) * (float) this.aClass143_Sub2_43.anInt5858;
			local208 = (local182 - (float) this.aShort124) * (float) this.aClass143_Sub2_43.anInt5858;
		} else {
			local197 = (float) this.aClass143_Sub2_43.anInt5858 * ((float) this.aShort124 + local182);
			local208 = (float) this.aClass143_Sub2_43.anInt5858 * (local174 - (float) this.aShort124);
		}
		if (this.aClass143_Sub2_43.aFloat110 <= local208 / (float) arg2 || this.aClass143_Sub2_43.aFloat109 >= local197 / (float) arg2) {
			return;
		}
		Static388.aFloat127 = local25.aFloat185 * local16.aFloat178 + local16.aFloat184 * local25.aFloat186 + local25.aFloat183 * local16.aFloat179 + local16.aFloat186;
		Static177.aFloat50 = local25.aFloat177 * local16.aFloat178 + local16.aFloat184 * local25.aFloat184 + local16.aFloat179 * local25.aFloat182;
		@Pc(299) float local299 = (float) this.aShort121 * Static177.aFloat50 + Static388.aFloat127;
		@Pc(307) float local307 = (float) this.aShort123 * Static177.aFloat50 + Static388.aFloat127;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local307 < local299) {
			local323 = ((float) -this.aShort124 + local307) * (float) this.aClass143_Sub2_43.anInt5833;
			local334 = ((float) this.aShort124 + local299) * (float) this.aClass143_Sub2_43.anInt5833;
		} else {
			local334 = (float) this.aClass143_Sub2_43.anInt5833 * (local307 + (float) this.aShort124);
			local323 = (float) this.aClass143_Sub2_43.anInt5833 * (local299 - (float) this.aShort124);
		}
		if (local323 / (float) arg2 >= this.aClass143_Sub2_43.aFloat112 || local334 / (float) arg2 <= this.aClass143_Sub2_43.aFloat102) {
			return;
		}
		if (arg1 != null || this.aClass23Array1 != null) {
			Static76.aFloat29 = local25.aFloat179 * local16.aFloat182 + local25.aFloat187 * local16.aFloat180 + local25.aFloat188 * local16.aFloat188;
			Static421.aFloat144 = local16.aFloat188 * local25.aFloat180 + local25.aFloat181 * local16.aFloat180 + local25.aFloat178 * local16.aFloat182;
			Static88.aFloat32 = local16.aFloat177 * local25.aFloat179 + local25.aFloat187 * local16.aFloat181 + local16.aFloat187 * local25.aFloat188;
			Static675.aFloat200 = local16.aFloat184 * local25.aFloat179 + local16.aFloat178 * local25.aFloat187 + local16.aFloat179 * local25.aFloat188;
			Static471.aFloat160 = local25.aFloat180 * local16.aFloat187 + local25.aFloat178 * local16.aFloat177 + local25.aFloat181 * local16.aFloat181;
			Static481.aFloat14 = local16.aFloat179 * local25.aFloat180 + local16.aFloat178 * local25.aFloat181 + local16.aFloat184 * local25.aFloat178;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort122 + this.aShort126 >> 1;
			@Pc(509) int local509 = this.aShort127 + this.aShort125 >> 1;
			@Pc(528) int local528 = (int) ((float) this.aShort121 * Static25.aFloat4 + Static454.aFloat147 + Static471.aFloat160 * (float) local501 + (float) local509 * Static88.aFloat32);
			@Pc(547) int local547 = (int) ((float) this.aShort121 * Static177.aFloat50 + Static388.aFloat127 + (float) local501 * Static481.aFloat14 + Static675.aFloat200 * (float) local509);
			@Pc(566) int local566 = (int) ((float) local509 * Static76.aFloat29 + (float) this.aShort121 * Static646.aFloat197 + Static421.aFloat144 * (float) local501 + Static613.aFloat174);
			@Pc(585) int local585 = (int) ((float) local509 * Static88.aFloat32 + Static454.aFloat147 + Static471.aFloat160 * (float) local501 + Static25.aFloat4 * (float) this.aShort123);
			@Pc(604) int local604 = (int) ((float) local501 * Static481.aFloat14 + Static388.aFloat127 + Static177.aFloat50 * (float) this.aShort123 + (float) local509 * Static675.aFloat200);
			arg1.anInt8966 = this.aClass143_Sub2_43.anInt5866 + local547 * this.aClass143_Sub2_43.anInt5833 / arg2;
			arg1.anInt8964 = this.aClass143_Sub2_43.anInt5858 * local585 / arg2 + this.aClass143_Sub2_43.anInt5860;
			arg1.anInt8965 = this.aClass143_Sub2_43.anInt5860 + local528 * this.aClass143_Sub2_43.anInt5858 / arg2;
			arg1.anInt8963 = this.aClass143_Sub2_43.anInt5866 + this.aClass143_Sub2_43.anInt5833 * local604 / arg2;
			@Pc(676) int local676 = (int) ((float) local509 * Static76.aFloat29 + Static613.aFloat174 + (float) local501 * Static421.aFloat144 + Static646.aFloat197 * (float) this.aShort123);
			if (this.aClass143_Sub2_43.anInt5841 <= local566 || this.aClass143_Sub2_43.anInt5841 <= local676) {
				arg1.aBoolean648 = true;
				arg1.anInt8962 = this.aClass143_Sub2_43.anInt5860 + (local528 - -this.aShort124) * this.aClass143_Sub2_43.anInt5858 / arg2 - arg1.anInt8965;
			}
		}
		this.aClass143_Sub2_43.method5000((float) arg2);
		this.aClass143_Sub2_43.method5005();
		this.aClass143_Sub2_43.method4959(local25);
		this.method8821();
		this.aClass143_Sub2_43.method4977();
		this.method8819();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLclient!wv;ZILclient!wv;Z)Lclient!ka;")
	private Class114 method8820(@OriginalArg(1) Class114_Sub3 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class114_Sub3 arg3, @OriginalArg(5) boolean arg4) {
		if ((arg2 & 0x100) == 0) {
			arg3.aBoolean793 = this.aBoolean793;
		} else {
			arg3.aBoolean793 = true;
		}
		arg3.anInt10647 = this.anInt10647;
		arg3.anInt10613 = this.anInt10613;
		arg3.aShort119 = this.aShort119;
		arg3.anInt10610 = this.anInt10610;
		arg3.aShort120 = this.aShort120;
		arg3.anInt10643 = this.anInt10643;
		arg3.aByte155 = 0;
		arg3.aBoolean792 = this.aBoolean792;
		arg3.lb = this.lb;
		arg3.anInt10660 = arg2;
		arg3.anInt10659 = this.anInt10659;
		arg3.anInt10633 = this.anInt10633;
		@Pc(70) boolean local70 = Static348.method6676(this.anInt10613, arg2);
		@Pc(76) boolean local76 = Static105.method1742(arg2, this.anInt10613);
		@Pc(82) boolean local82 = Static389.method576(this.anInt10613, arg2);
		@Pc(88) boolean local88 = local70 | local76 | local82;
		@Pc(203) int local203;
		if (local88) {
			if (!local70) {
				arg3.anIntArray616 = this.anIntArray616;
			} else if (arg0.anIntArray616 == null || this.anInt10647 > arg0.anIntArray616.length) {
				arg3.anIntArray616 = arg0.anIntArray616 = new int[this.anInt10647];
			} else {
				arg3.anIntArray616 = arg0.anIntArray616;
			}
			if (!local76) {
				arg3.anIntArray618 = this.anIntArray618;
			} else if (arg0.anIntArray618 == null || arg0.anIntArray618.length < this.anInt10647) {
				arg3.anIntArray618 = arg0.anIntArray618 = new int[this.anInt10647];
			} else {
				arg3.anIntArray618 = arg0.anIntArray618;
			}
			if (!local82) {
				arg3.anIntArray617 = this.anIntArray617;
			} else if (arg0.anIntArray617 == null || this.anInt10647 > arg0.anIntArray617.length) {
				arg3.anIntArray617 = arg0.anIntArray617 = new int[this.anInt10647];
			} else {
				arg3.anIntArray617 = arg0.anIntArray617;
			}
			for (local203 = 0; local203 < this.anInt10647; local203++) {
				if (local70) {
					arg3.anIntArray616[local203] = this.anIntArray616[local203];
				}
				if (local76) {
					arg3.anIntArray618[local203] = this.anIntArray618[local203];
				}
				if (local82) {
					arg3.anIntArray617[local203] = this.anIntArray617[local203];
				}
			}
		} else {
			arg3.anIntArray617 = this.anIntArray617;
			arg3.anIntArray616 = this.anIntArray616;
			arg3.anIntArray618 = this.anIntArray618;
		}
		if (Static69.method991(this.anInt10613, arg2)) {
			arg3.aClass194_15 = arg0.aClass194_15;
			if (arg4) {
				arg3.aByte155 = (byte) (arg3.aByte155 | 0x1);
			}
			arg3.aClass194_15.anInterface8_2 = this.aClass194_15.anInterface8_2;
			arg3.aClass194_15.aByte54 = this.aClass194_15.aByte54;
		} else if (Static138.method2060(this.anInt10613, arg2)) {
			arg3.aClass194_15 = this.aClass194_15;
		} else {
			arg3.aClass194_15 = null;
		}
		if (Static239.method3443(this.anInt10613, arg2)) {
			if (arg0.aShortArray149 == null || this.anInt10633 > arg0.aShortArray149.length) {
				arg3.aShortArray149 = arg0.aShortArray149 = new short[this.anInt10633];
			} else {
				arg3.aShortArray149 = arg0.aShortArray149;
			}
			for (local203 = 0; local203 < this.anInt10633; local203++) {
				arg3.aShortArray149[local203] = this.aShortArray149[local203];
			}
		} else {
			arg3.aShortArray149 = this.aShortArray149;
		}
		if (Static416.method6123(arg2, this.anInt10613)) {
			if (arg0.aByteArray112 == null || this.anInt10633 > arg0.aByteArray112.length) {
				arg3.aByteArray112 = arg0.aByteArray112 = new byte[this.anInt10633];
			} else {
				arg3.aByteArray112 = arg0.aByteArray112;
			}
			for (local203 = 0; local203 < this.anInt10633; local203++) {
				arg3.aByteArray112[local203] = this.aByteArray112[local203];
			}
		} else {
			arg3.aByteArray112 = this.aByteArray112;
		}
		if (Static93.method1446(arg2, this.anInt10613)) {
			if (arg4) {
				arg3.aByte155 = (byte) (arg3.aByte155 | 0x2);
			}
			arg3.aClass194_16 = arg0.aClass194_16;
			arg3.aClass194_16.anInterface8_2 = this.aClass194_16.anInterface8_2;
			arg3.aClass194_16.aByte54 = this.aClass194_16.aByte54;
		} else if (Static229.method3288(arg2, this.anInt10613)) {
			arg3.aClass194_16 = this.aClass194_16;
		} else {
			arg3.aClass194_16 = null;
		}
		@Pc(552) int local552;
		if (Static488.method7146(this.anInt10613, arg2)) {
			if (arg0.aShortArray159 == null || arg0.aShortArray159.length < this.lb) {
				local203 = this.lb;
				arg3.aShortArray153 = arg0.aShortArray153 = new short[local203];
				arg3.aShortArray156 = arg0.aShortArray156 = new short[local203];
				arg3.aShortArray159 = arg0.aShortArray159 = new short[local203];
			} else {
				arg3.aShortArray159 = arg0.aShortArray159;
				arg3.aShortArray156 = arg0.aShortArray156;
				arg3.aShortArray153 = arg0.aShortArray153;
			}
			if (this.aClass383_1 == null) {
				for (local203 = 0; local203 < this.lb; local203++) {
					arg3.aShortArray159[local203] = this.aShortArray159[local203];
					arg3.aShortArray156[local203] = this.aShortArray156[local203];
					arg3.aShortArray153[local203] = this.aShortArray153[local203];
				}
			} else {
				if (arg0.aClass383_1 == null) {
					arg0.aClass383_1 = new Class383();
				}
				@Pc(540) Class383 local540 = arg3.aClass383_1 = arg0.aClass383_1;
				if (local540.aShortArray140 == null || this.lb > local540.aShortArray140.length) {
					local552 = this.lb;
					local540.aByteArray106 = new byte[local552];
					local540.aShortArray138 = new short[local552];
					local540.aShortArray140 = new short[local552];
					local540.aShortArray139 = new short[local552];
				}
				for (local552 = 0; local552 < this.lb; local552++) {
					arg3.aShortArray159[local552] = this.aShortArray159[local552];
					arg3.aShortArray156[local552] = this.aShortArray156[local552];
					arg3.aShortArray153[local552] = this.aShortArray153[local552];
					local540.aShortArray140[local552] = this.aClass383_1.aShortArray140[local552];
					local540.aShortArray139[local552] = this.aClass383_1.aShortArray139[local552];
					local540.aShortArray138[local552] = this.aClass383_1.aShortArray138[local552];
					local540.aByteArray106[local552] = this.aClass383_1.aByteArray106[local552];
				}
			}
			arg3.aByteArray111 = this.aByteArray111;
		} else {
			arg3.aShortArray156 = this.aShortArray156;
			arg3.aClass383_1 = this.aClass383_1;
			arg3.aShortArray159 = this.aShortArray159;
			arg3.aByteArray111 = this.aByteArray111;
			arg3.aShortArray153 = this.aShortArray153;
		}
		if (Static389.method575(arg2, this.anInt10613)) {
			arg3.aClass194_14 = arg0.aClass194_14;
			if (arg4) {
				arg3.aByte155 = (byte) (arg3.aByte155 | 0x4);
			}
			arg3.aClass194_14.anInterface8_2 = this.aClass194_14.anInterface8_2;
			arg3.aClass194_14.aByte54 = this.aClass194_14.aByte54;
		} else if (Static636.method8433(this.anInt10613, arg2)) {
			arg3.aClass194_14 = this.aClass194_14;
		} else {
			arg3.aClass194_14 = null;
		}
		if (Static480.method3955(arg2, this.anInt10613)) {
			if (arg0.aFloatArray82 == null || this.anInt10633 > arg0.aFloatArray82.length) {
				local203 = this.lb;
				arg3.aFloatArray83 = arg0.aFloatArray83 = new float[local203];
				arg3.aFloatArray82 = arg0.aFloatArray82 = new float[local203];
			} else {
				arg3.aFloatArray82 = arg0.aFloatArray82;
				arg3.aFloatArray83 = arg0.aFloatArray83;
			}
			for (local203 = 0; local203 < this.lb; local203++) {
				arg3.aFloatArray82[local203] = this.aFloatArray82[local203];
				arg3.aFloatArray83[local203] = this.aFloatArray83[local203];
			}
		} else {
			arg3.aFloatArray83 = this.aFloatArray83;
			arg3.aFloatArray82 = this.aFloatArray82;
		}
		if (Static620.method8303(arg2, this.anInt10613)) {
			arg3.aClass194_13 = arg0.aClass194_13;
			if (arg4) {
				arg3.aByte155 = (byte) (arg3.aByte155 | 0x8);
			}
			arg3.aClass194_13.aByte54 = this.aClass194_13.aByte54;
			arg3.aClass194_13.anInterface8_2 = this.aClass194_13.anInterface8_2;
		} else if (Static537.method8643(this.anInt10613, arg2)) {
			arg3.aClass194_13 = this.aClass194_13;
		} else {
			arg3.aClass194_13 = null;
		}
		if (Static156.method2375(arg2, this.anInt10613)) {
			if (arg0.aShortArray152 == null || this.anInt10633 > arg0.aShortArray152.length) {
				local203 = this.anInt10633;
				arg3.aShortArray158 = arg0.aShortArray158 = new short[local203];
				arg3.aShortArray152 = arg0.aShortArray152 = new short[local203];
				arg3.aShortArray155 = arg0.aShortArray155 = new short[local203];
			} else {
				arg3.aShortArray158 = arg0.aShortArray158;
				arg3.aShortArray155 = arg0.aShortArray155;
				arg3.aShortArray152 = arg0.aShortArray152;
			}
			for (local203 = 0; local203 < this.anInt10633; local203++) {
				arg3.aShortArray152[local203] = this.aShortArray152[local203];
				arg3.aShortArray158[local203] = this.aShortArray158[local203];
				arg3.aShortArray155[local203] = this.aShortArray155[local203];
			}
		} else {
			arg3.aShortArray152 = this.aShortArray152;
			arg3.aShortArray155 = this.aShortArray155;
			arg3.aShortArray158 = this.aShortArray158;
		}
		if (Static224.method3190(arg2, this.anInt10613)) {
			if (arg4) {
				arg3.aByte155 = (byte) (arg3.aByte155 | 0x10);
			}
			arg3.aClass319_1 = arg0.aClass319_1;
			arg3.aClass319_1.anInterface15_4 = this.aClass319_1.anInterface15_4;
		} else if (Static547.method7539(this.anInt10613, arg2)) {
			arg3.aClass319_1 = this.aClass319_1;
		} else {
			arg3.aClass319_1 = null;
		}
		if (Static420.method6183(this.anInt10613, arg2)) {
			if (arg0.aShortArray151 == null || this.anInt10633 > arg0.aShortArray151.length) {
				local203 = this.anInt10633;
				arg3.aShortArray151 = arg0.aShortArray151 = new short[local203];
			} else {
				arg3.aShortArray151 = arg0.aShortArray151;
			}
			for (local203 = 0; local203 < this.anInt10633; local203++) {
				arg3.aShortArray151[local203] = this.aShortArray151[local203];
			}
		} else {
			arg3.aShortArray151 = this.aShortArray151;
		}
		if (!Static361.method5316(arg2, this.anInt10613)) {
			arg3.aClass146Array1 = this.aClass146Array1;
		} else if (arg0.aClass146Array1 == null || this.anInt10643 > arg0.aClass146Array1.length) {
			local203 = this.anInt10643;
			arg3.aClass146Array1 = arg0.aClass146Array1 = new Class146[local203];
			for (local552 = 0; local552 < this.anInt10643; local552++) {
				arg3.aClass146Array1[local552] = this.aClass146Array1[local552].method2996();
			}
		} else {
			arg3.aClass146Array1 = arg0.aClass146Array1;
			for (local203 = 0; local203 < this.anInt10643; local203++) {
				arg3.aClass146Array1[local203].method2997(this.aClass146Array1[local203]);
			}
		}
		arg3.aShortArray157 = this.aShortArray157;
		if (this.aBoolean790) {
			arg3.aShort123 = this.aShort123;
			arg3.aShort121 = this.aShort121;
			arg3.aShort127 = this.aShort127;
			arg3.aShort122 = this.aShort122;
			arg3.aShort125 = this.aShort125;
			arg3.aShort124 = this.aShort124;
			arg3.aShort118 = this.aShort118;
			arg3.aShort126 = this.aShort126;
			arg3.aBoolean790 = true;
		} else {
			arg3.aBoolean790 = false;
		}
		arg3.anIntArrayArray96 = this.anIntArrayArray96;
		arg3.anIntArray615 = this.anIntArray615;
		arg3.aClass244Array5 = this.aClass244Array5;
		arg3.aClass303Array5 = this.aClass303Array5;
		arg3.anIntArrayArray95 = this.anIntArrayArray95;
		arg3.aClass23Array1 = this.aClass23Array1;
		arg3.anIntArrayArray94 = this.anIntArrayArray94;
		arg3.anIntArray619 = this.anIntArray619;
		arg3.aShortArray154 = this.aShortArray154;
		arg3.aShortArray150 = this.aShortArray150;
		return arg3;
	}

	@OriginalMember(owner = "client!wv", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10610; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray618[local15] - local9 * this.anIntArray617[local15] >> 14;
			this.anIntArray617[local15] = local13 * this.anIntArray617[local15] + this.anIntArray618[local15] * local9 >> 14;
			this.anIntArray618[local15] = local33;
		}
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
		this.aBoolean790 = false;
	}

	@OriginalMember(owner = "client!wv", name = "b", descriptor = "(B)V")
	private void method8821() {
		if (this.anInt10659 == 0) {
			return;
		}
		if (this.aByte155 != 0) {
			this.method8818(true);
		}
		this.method8818(false);
		if (this.aClass319_1 != null) {
			if (this.aClass319_1.anInterface15_4 == null) {
				this.method8813((this.aByte155 & 0x10) != 0);
			}
			if (this.aClass319_1.anInterface15_4 != null) {
				this.aClass143_Sub2_43.method4993(this.aClass194_14 != null);
				this.aClass143_Sub2_43.method4970(this.aClass194_15, this.aClass194_13, this.aClass194_16, this.aClass194_14);
				@Pc(76) int local76 = this.anIntArray615.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray615[local78];
					@Pc(92) int local92 = this.anIntArray615[local78 + 1];
					@Pc(99) int local99 = this.aShortArray151[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass143_Sub2_43.method4972(this.aClass194_14 != null, local99);
					this.aClass143_Sub2_43.method5004(this.aClass319_1.anInterface15_4, (local92 - local85) * 3, local85 * 3);
				}
			}
		}
		this.method8825();
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!eh;Lclient!sp;I)V")
	@Override
	public void method8801(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class41_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.lb == 0) {
			return;
		}
		@Pc(16) Class56_Sub3 local16 = this.aClass143_Sub2_43.aClass56_Sub3_3;
		if (!this.aBoolean790) {
			this.method8816();
		}
		@Pc(25) Class56_Sub3 local25 = (Class56_Sub3) arg0;
		Static646.aFloat197 = local16.aFloat188 * local25.aFloat182 + local16.aFloat182 * local25.aFloat184 + local16.aFloat180 * local25.aFloat177;
		Static613.aFloat174 = local16.aFloat180 * local25.aFloat185 + local16.aFloat182 * local25.aFloat186 + local16.aFloat188 * local25.aFloat183 + local16.aFloat183;
		@Pc(72) float local72 = Static613.aFloat174 + Static646.aFloat197 * (float) this.aShort121;
		@Pc(80) float local80 = Static613.aFloat174 + Static646.aFloat197 * (float) this.aShort123;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local96 = local80 - (float) this.aShort124;
			local90 = local72 + (float) this.aShort124;
		} else {
			local90 = (float) this.aShort124 + local80;
			local96 = local72 - (float) this.aShort124;
		}
		if (local96 >= this.aClass143_Sub2_43.aFloat107 || local90 <= (float) this.aClass143_Sub2_43.anInt5841) {
			return;
		}
		Static454.aFloat147 = local16.aFloat185 + local16.aFloat187 * local25.aFloat183 + local16.aFloat177 * local25.aFloat186 + local25.aFloat185 * local16.aFloat181;
		Static25.aFloat4 = local25.aFloat182 * local16.aFloat187 + local25.aFloat184 * local16.aFloat177 + local25.aFloat177 * local16.aFloat181;
		@Pc(172) float local172 = Static454.aFloat147 + Static25.aFloat4 * (float) this.aShort121;
		@Pc(180) float local180 = Static25.aFloat4 * (float) this.aShort123 + Static454.aFloat147;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local172 > local180) {
			local195 = (local180 - (float) this.aShort124) * (float) this.aClass143_Sub2_43.anInt5858;
			local206 = (local172 + (float) this.aShort124) * (float) this.aClass143_Sub2_43.anInt5858;
		} else {
			local195 = (local172 - (float) this.aShort124) * (float) this.aClass143_Sub2_43.anInt5858;
			local206 = (float) this.aClass143_Sub2_43.anInt5858 * ((float) this.aShort124 + local180);
		}
		if (local195 / local90 >= this.aClass143_Sub2_43.aFloat110 || this.aClass143_Sub2_43.aFloat109 >= local206 / local90) {
			return;
		}
		Static177.aFloat50 = local25.aFloat182 * local16.aFloat179 + local16.aFloat184 * local25.aFloat184 + local16.aFloat178 * local25.aFloat177;
		Static388.aFloat127 = local16.aFloat186 + local16.aFloat179 * local25.aFloat183 + local16.aFloat178 * local25.aFloat185 + local25.aFloat186 * local16.aFloat184;
		@Pc(295) float local295 = (float) this.aShort121 * Static177.aFloat50 + Static388.aFloat127;
		@Pc(303) float local303 = Static388.aFloat127 + (float) this.aShort123 * Static177.aFloat50;
		@Pc(329) float local329;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = ((float) this.aShort124 + local295) * (float) this.aClass143_Sub2_43.anInt5833;
			local329 = (float) this.aClass143_Sub2_43.anInt5833 * (local303 - (float) this.aShort124);
		} else {
			local318 = ((float) this.aShort124 + local303) * (float) this.aClass143_Sub2_43.anInt5833;
			local329 = (local295 - (float) this.aShort124) * (float) this.aClass143_Sub2_43.anInt5833;
		}
		if (this.aClass143_Sub2_43.aFloat112 <= local329 / local90 || this.aClass143_Sub2_43.aFloat102 >= local318 / local90) {
			return;
		}
		if (arg1 != null || this.aClass23Array1 != null) {
			Static675.aFloat200 = local16.aFloat178 * local25.aFloat187 + local25.aFloat179 * local16.aFloat184 + local25.aFloat188 * local16.aFloat179;
			Static471.aFloat160 = local16.aFloat181 * local25.aFloat181 + local25.aFloat178 * local16.aFloat177 + local16.aFloat187 * local25.aFloat180;
			Static421.aFloat144 = local25.aFloat181 * local16.aFloat180 + local16.aFloat182 * local25.aFloat178 + local25.aFloat180 * local16.aFloat188;
			Static481.aFloat14 = local25.aFloat180 * local16.aFloat179 + local16.aFloat184 * local25.aFloat178 + local25.aFloat181 * local16.aFloat178;
			Static76.aFloat29 = local16.aFloat188 * local25.aFloat188 + local16.aFloat180 * local25.aFloat187 + local16.aFloat182 * local25.aFloat179;
			Static88.aFloat32 = local25.aFloat188 * local16.aFloat187 + local16.aFloat181 * local25.aFloat187 + local16.aFloat177 * local25.aFloat179;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(498) int local498 = this.aShort122 + this.aShort126 >> 1;
			@Pc(507) int local507 = this.aShort125 + this.aShort127 >> 1;
			@Pc(526) int local526 = (int) (Static88.aFloat32 * (float) local507 + Static454.aFloat147 + Static471.aFloat160 * (float) local498 + Static25.aFloat4 * (float) this.aShort121);
			@Pc(545) int local545 = (int) ((float) local498 * Static481.aFloat14 + Static388.aFloat127 + (float) this.aShort121 * Static177.aFloat50 + (float) local507 * Static675.aFloat200);
			@Pc(564) int local564 = (int) (Static421.aFloat144 * (float) local498 + Static613.aFloat174 + Static646.aFloat197 * (float) this.aShort121 + (float) local507 * Static76.aFloat29);
			if (this.aClass143_Sub2_43.anInt5841 > local564) {
				local488 = true;
			} else {
				arg1.anInt8965 = this.aClass143_Sub2_43.anInt5860 + local526 * this.aClass143_Sub2_43.anInt5858 / local564;
				arg1.anInt8966 = this.aClass143_Sub2_43.anInt5833 * local545 / local564 + this.aClass143_Sub2_43.anInt5866;
			}
			@Pc(619) int local619 = (int) (Static25.aFloat4 * (float) this.aShort123 + Static454.aFloat147 + (float) local498 * Static471.aFloat160 + (float) local507 * Static88.aFloat32);
			@Pc(638) int local638 = (int) (Static177.aFloat50 * (float) this.aShort123 + (float) local498 * Static481.aFloat14 + Static388.aFloat127 + (float) local507 * Static675.aFloat200);
			@Pc(657) int local657 = (int) (Static613.aFloat174 + (float) local498 * Static421.aFloat144 + Static646.aFloat197 * (float) this.aShort123 + Static76.aFloat29 * (float) local507);
			if (this.aClass143_Sub2_43.anInt5841 <= local657) {
				arg1.anInt8964 = local619 * this.aClass143_Sub2_43.anInt5858 / local657 + this.aClass143_Sub2_43.anInt5860;
				arg1.anInt8963 = this.aClass143_Sub2_43.anInt5833 * local638 / local657 + this.aClass143_Sub2_43.anInt5866;
			} else {
				local488 = true;
			}
			if (local488) {
				if (this.aClass143_Sub2_43.anInt5841 > local564 && this.aClass143_Sub2_43.anInt5841 > local657) {
					local490 = false;
				} else {
					@Pc(736) int local736;
					@Pc(747) int local747;
					@Pc(757) int local757;
					if (this.aClass143_Sub2_43.anInt5841 > local564) {
						local736 = (local657 - this.aClass143_Sub2_43.anInt5841 << 16) / (local657 - local564);
						local747 = ((local619 - local526) * local736 >> 16) + local619;
						arg1.anInt8965 = this.aClass143_Sub2_43.anInt5860 + local747 * this.aClass143_Sub2_43.anInt5858 / this.aClass143_Sub2_43.anInt5841;
						local757 = ((local638 - local545) * local736 >> 16) + local638;
						arg1.anInt8966 = this.aClass143_Sub2_43.anInt5833 * local757 / this.aClass143_Sub2_43.anInt5841 + this.aClass143_Sub2_43.anInt5866;
					} else if (local657 < this.aClass143_Sub2_43.anInt5841) {
						local736 = (local564 - this.aClass143_Sub2_43.anInt5841 << 16) / (local564 - local657);
						local747 = local526 + ((local526 - local619) * local736 >> 16);
						local757 = ((local545 - local638) * local736 >> 16) + local545;
						arg1.anInt8965 = this.aClass143_Sub2_43.anInt5860 + local747 * this.aClass143_Sub2_43.anInt5858 / this.aClass143_Sub2_43.anInt5841;
						arg1.anInt8966 = this.aClass143_Sub2_43.anInt5866 + local757 * this.aClass143_Sub2_43.anInt5833 / this.aClass143_Sub2_43.anInt5841;
					}
				}
			}
			if (local490) {
				if (local657 >= local564) {
					arg1.anInt8962 = this.aClass143_Sub2_43.anInt5860 + this.aClass143_Sub2_43.anInt5858 * (local619 + this.aShort124) / local657 - arg1.anInt8964;
				} else {
					arg1.anInt8962 = this.aClass143_Sub2_43.anInt5860 + (this.aShort124 + local526) * this.aClass143_Sub2_43.anInt5858 / local564 - arg1.anInt8965;
				}
				arg1.aBoolean648 = true;
			}
		}
		this.aClass143_Sub2_43.method4932();
		this.aClass143_Sub2_43.method4959(local25);
		this.method8821();
		this.aClass143_Sub2_43.method4977();
		this.method8819();
	}

	@OriginalMember(owner = "client!wv", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class242.anIntArray384[arg0];
		@Pc(13) int local13 = Class242.anIntArray383[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt10610; local15++) {
			local33 = local9 * this.anIntArray617[local15] + local13 * this.anIntArray616[local15] >> 14;
			this.anIntArray617[local15] = this.anIntArray617[local15] * local13 - local9 * this.anIntArray616[local15] >> 14;
			this.anIntArray616[local15] = local33;
		}
		for (local33 = 0; local33 < this.lb; local33++) {
			@Pc(87) int local87 = local13 * this.aShortArray159[local33] + this.aShortArray153[local33] * local9 >> 14;
			this.aShortArray153[local33] = (short) (this.aShortArray153[local33] * local13 - local9 * this.aShortArray159[local33] >> 14);
			this.aShortArray159[local33] = (short) local87;
		}
		if (this.aClass194_14 == null && this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
		}
		if (this.aClass194_14 != null) {
			this.aClass194_14.anInterface8_2 = null;
		}
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
		this.aBoolean790 = false;
	}

	@OriginalMember(owner = "client!wv", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10610; local3++) {
			if (arg0 != 0) {
				this.anIntArray616[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray618[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray617[local3] += arg2;
			}
		}
		this.aBoolean790 = false;
		if (this.aClass194_15 != null) {
			this.aClass194_15.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(IIIIBLclient!eh;Z)Z")
	private boolean method8823(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class56 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class56_Sub3 local8 = (Class56_Sub3) arg4;
		@Pc(12) Class56_Sub3 local12 = this.aClass143_Sub2_43.aClass56_Sub3_3;
		@Pc(33) float local33 = local12.aFloat181 * local8.aFloat185 + local12.aFloat177 * local8.aFloat186 + local12.aFloat187 * local8.aFloat183 + local12.aFloat185;
		@Pc(54) float local54 = local12.aFloat186 + local12.aFloat179 * local8.aFloat183 + local12.aFloat184 * local8.aFloat186 + local12.aFloat178 * local8.aFloat185;
		Static76.aFloat29 = local12.aFloat188 * local8.aFloat188 + local8.aFloat187 * local12.aFloat180 + local12.aFloat182 * local8.aFloat179;
		Static421.aFloat144 = local8.aFloat178 * local12.aFloat182 + local8.aFloat181 * local12.aFloat180 + local8.aFloat180 * local12.aFloat188;
		Static25.aFloat4 = local8.aFloat177 * local12.aFloat181 + local12.aFloat177 * local8.aFloat184 + local12.aFloat187 * local8.aFloat182;
		@Pc(129) float local129 = local12.aFloat182 * local8.aFloat186 + local8.aFloat185 * local12.aFloat180 + local12.aFloat188 * local8.aFloat183 + local12.aFloat183;
		Static646.aFloat197 = local8.aFloat184 * local12.aFloat182 + local8.aFloat177 * local12.aFloat180 + local12.aFloat188 * local8.aFloat182;
		Static481.aFloat14 = local12.aFloat184 * local8.aFloat178 + local12.aFloat178 * local8.aFloat181 + local8.aFloat180 * local12.aFloat179;
		Static177.aFloat50 = local12.aFloat184 * local8.aFloat184 + local8.aFloat177 * local12.aFloat178 + local12.aFloat179 * local8.aFloat182;
		Static675.aFloat200 = local12.aFloat178 * local8.aFloat187 + local12.aFloat184 * local8.aFloat179 + local12.aFloat179 * local8.aFloat188;
		Static471.aFloat160 = local8.aFloat180 * local12.aFloat187 + local12.aFloat181 * local8.aFloat181 + local8.aFloat178 * local12.aFloat177;
		Static88.aFloat32 = local8.aFloat188 * local12.aFloat187 + local12.aFloat177 * local8.aFloat179 + local8.aFloat187 * local12.aFloat181;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass143_Sub2_43.anInt5858;
		@Pc(255) int local255 = this.aClass143_Sub2_43.anInt5833;
		if (!this.aBoolean790) {
			this.method8816();
		}
		@Pc(270) int local270 = this.aShort122 - this.aShort126 >> 1;
		@Pc(279) int local279 = this.aShort123 - this.aShort121 >> 1;
		@Pc(288) int local288 = this.aShort127 - this.aShort125 >> 1;
		@Pc(301) int local301 = this.aShort126 + local270;
		@Pc(306) int local306 = local279 + this.aShort121;
		@Pc(311) int local311 = local288 + this.aShort125;
		@Pc(318) int local318 = local301 - (local270 << arg0);
		@Pc(324) int local324 = local306 - (local279 << arg0);
		@Pc(330) int local330 = local311 - (local288 << arg0);
		@Pc(337) int local337 = local301 + (local270 << arg0);
		@Pc(343) int local343 = (local279 << arg0) + local306;
		Static367.anIntArray362[0] = local318;
		@Pc(353) int local353 = local311 + (local288 << arg0);
		Static499.anIntArray463[0] = local324;
		Static367.anIntArray362[1] = local337;
		Static504.anIntArray467[0] = local330;
		Static499.anIntArray463[1] = local324;
		Static504.anIntArray467[1] = local330;
		Static367.anIntArray362[2] = local318;
		Static499.anIntArray463[2] = local343;
		Static367.anIntArray362[3] = local337;
		Static504.anIntArray467[2] = local330;
		Static499.anIntArray463[3] = local343;
		Static504.anIntArray467[3] = local330;
		Static367.anIntArray362[4] = local318;
		Static499.anIntArray463[4] = local324;
		Static504.anIntArray467[4] = local353;
		Static367.anIntArray362[5] = local337;
		Static499.anIntArray463[5] = local324;
		Static504.anIntArray467[5] = local353;
		Static367.anIntArray362[6] = local318;
		Static499.anIntArray463[6] = local343;
		Static367.anIntArray362[7] = local337;
		Static504.anIntArray467[6] = local353;
		Static499.anIntArray463[7] = local343;
		Static504.anIntArray467[7] = local353;
		@Pc(506) float local506;
		@Pc(492) float local492;
		@Pc(478) float local478;
		@Pc(454) float local454;
		@Pc(464) float local464;
		@Pc(459) float local459;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = (float) Static367.anIntArray362[local447];
			local459 = (float) Static504.anIntArray467[local447];
			local464 = (float) Static499.anIntArray463[local447];
			local478 = Static646.aFloat197 * local464 + Static421.aFloat144 * local454 + Static76.aFloat29 * local459 + local129;
			local492 = local459 * Static675.aFloat200 + Static177.aFloat50 * local464 + Static481.aFloat14 * local454 + local54;
			local506 = local454 * Static471.aFloat160 + Static25.aFloat4 * local464 + local459 * Static88.aFloat32 + local33;
			if ((float) this.aClass143_Sub2_43.anInt5841 <= local478) {
				if (arg3 > 0) {
					local478 = (float) arg3;
				}
				@Pc(530) float local530 = local506 * (float) local251 / local478 + (float) this.aClass143_Sub2_43.anInt5860;
				if (local241 > local530) {
					local241 = local530;
				}
				@Pc(548) float local548 = (float) local255 * local492 / local478 + (float) this.aClass143_Sub2_43.anInt5866;
				if (local243 < local530) {
					local243 = local530;
				}
				if (local548 < local245) {
					local245 = local548;
				}
				if (local548 > local247) {
					local247 = local548;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg1 && (float) arg1 < local243 && (float) arg2 > local245 && local247 > (float) arg2) {
			if (arg5) {
				return true;
			}
			if (this.aClass143_Sub2_43.anIntArray314.length < this.lb) {
				this.aClass143_Sub2_43.anIntArray315 = new int[this.lb];
				this.aClass143_Sub2_43.anIntArray314 = new int[this.lb];
			}
			@Pc(625) int[] local625 = this.aClass143_Sub2_43.anIntArray314;
			@Pc(629) int[] local629 = this.aClass143_Sub2_43.anIntArray315;
			@Pc(721) int local721;
			for (@Pc(631) int local631 = 0; local631 < this.anInt10610; local631++) {
				local459 = (float) this.anIntArray617[local631];
				local454 = (float) this.anIntArray616[local631];
				local464 = (float) this.anIntArray618[local631];
				local478 = local459 * Static76.aFloat29 + Static646.aFloat197 * local464 + Static421.aFloat144 * local454 + local129;
				local506 = local33 + local454 * Static471.aFloat160 + local464 * Static25.aFloat4 + Static88.aFloat32 * local459;
				local492 = local54 + local454 * Static481.aFloat14 + local464 * Static177.aFloat50 + Static675.aFloat200 * local459;
				@Pc(734) int local734;
				@Pc(739) int local739;
				@Pc(746) int local746;
				if ((float) this.aClass143_Sub2_43.anInt5841 <= local478) {
					if (arg3 > 0) {
						local478 = (float) arg3;
					}
					local721 = (int) ((float) local251 * local506 / local478 + (float) this.aClass143_Sub2_43.anInt5860);
					local734 = (int) ((float) this.aClass143_Sub2_43.anInt5866 + local492 * (float) local255 / local478);
					local739 = this.anIntArray619[local631];
					local746 = this.anIntArray619[local631 + 1];
					for (@Pc(748) int local748 = local739; local748 < local746; local748++) {
						@Pc(757) int local757 = this.aShortArray150[local748] - 1;
						if (local757 == -1) {
							break;
						}
						local625[local757] = local721;
						local629[local757] = local734;
					}
				} else {
					local721 = this.anIntArray619[local631];
					local734 = this.anIntArray619[local631 + 1];
					for (local739 = local721; local739 < local734; local739++) {
						local746 = this.aShortArray150[local739] - 1;
						if (local746 == -1) {
							break;
						}
						local625[this.aShortArray150[local739] - 1] = -999999;
					}
				}
			}
			for (local721 = 0; local721 < this.anInt10633; local721++) {
				if (local625[this.aShortArray152[local721]] != -999999 && local625[this.aShortArray158[local721]] != -999999 && local625[this.aShortArray155[local721]] != -999999 && this.method8814(local629[this.aShortArray152[local721]], arg1, local625[this.aShortArray155[local721]], local625[this.aShortArray152[local721]], local625[this.aShortArray158[local721]], arg2, local629[this.aShortArray155[local721]], local629[this.aShortArray158[local721]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!wv", name = "c", descriptor = "()Z")
	@Override
	public boolean method8796() {
		if (this.aShortArray151 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray151.length; local12++) {
			if (this.aShortArray151[local12] != -1 && !this.aClass143_Sub2_43.anInterface3_11.method8500(this.aShortArray151[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wv", name = "e", descriptor = "()V")
	@Override
	protected void method8805() {
	}

	@OriginalMember(owner = "client!wv", name = "f", descriptor = "()[Lclient!rf;")
	@Override
	public Class303[] method8806() {
		return this.aClass303Array5;
	}

	@OriginalMember(owner = "client!wv", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort125;
	}

	@OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lclient!mi;I)V")
	private void method8824(@OriginalArg(0) Class5_Sub2_Sub7_Sub2 arg0) {
		if (this.aClass143_Sub2_43.anIntArray314.length < this.lb) {
			this.aClass143_Sub2_43.anIntArray314 = new int[this.lb];
			this.aClass143_Sub2_43.anIntArray315 = new int[this.lb];
		}
		@Pc(28) int[] local28 = this.aClass143_Sub2_43.anIntArray314;
		@Pc(32) int[] local32 = this.aClass143_Sub2_43.anIntArray315;
		@Pc(74) int local74;
		@Pc(113) int local113;
		@Pc(122) int local122;
		for (@Pc(47) int local47 = 0; local47 < this.anInt10610; local47++) {
			local74 = (this.anIntArray616[local47] - (this.anIntArray618[local47] * this.aClass143_Sub2_43.anInt5863 >> 8) >> this.aClass143_Sub2_43.anInt5821) - arg0.anInt6446;
			@Pc(99) int local99 = (this.anIntArray617[local47] - (this.aClass143_Sub2_43.anInt5843 * this.anIntArray618[local47] >> 8) >> this.aClass143_Sub2_43.anInt5821) - arg0.anInt6439;
			@Pc(104) int local104 = this.anIntArray619[local47];
			@Pc(111) int local111 = this.anIntArray619[local47 + 1];
			for (local113 = local104; local113 < local111; local113++) {
				local122 = this.aShortArray150[local113] - 1;
				if (local122 == -1) {
					break;
				}
				local28[local122] = local74;
				local32[local122] = local99;
			}
		}
		for (local74 = 0; local74 < this.anInt10659; local74++) {
			if (this.aByteArray112 == null || this.aByteArray112[local74] <= 128) {
				@Pc(171) short local171 = this.aShortArray152[local74];
				@Pc(176) short local176 = this.aShortArray158[local74];
				@Pc(181) short local181 = this.aShortArray155[local74];
				local113 = local28[local171];
				local122 = local28[local176];
				@Pc(193) int local193 = local28[local181];
				@Pc(197) int local197 = local32[local171];
				@Pc(201) int local201 = local32[local176];
				@Pc(205) int local205 = local32[local181];
				if (-((local193 - local122) * (local201 + -local197)) + (local201 - local205) * (-local122 + local113) > 0) {
					arg0.method5402(local113, local205, local193, local197, local122, local201);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wv", name = "d", descriptor = "(I)V")
	private void method8825() {
		if (!this.aBoolean791) {
			return;
		}
		this.aBoolean791 = false;
		if (this.aClass244Array5 == null && this.aClass303Array5 == null && this.aClass23Array1 == null) {
			if (this.anIntArray616 != null && !Static296.method4064(this.anInt10613, this.anInt10660)) {
				if (this.aClass194_15 != null && this.aClass194_15.anInterface8_2 == null) {
					this.aBoolean791 = true;
				} else {
					if (!this.aBoolean790) {
						this.method8816();
					}
					this.anIntArray616 = null;
				}
			}
			if (this.anIntArray618 != null && !Static296.method4060(this.anInt10660, this.anInt10613)) {
				if (this.aClass194_15 != null && this.aClass194_15.anInterface8_2 == null) {
					this.aBoolean791 = true;
				} else {
					if (!this.aBoolean790) {
						this.method8816();
					}
					this.anIntArray618 = null;
				}
			}
			if (this.anIntArray617 != null && !Static275.method3829(this.anInt10613, this.anInt10660)) {
				if (this.aClass194_15 != null && this.aClass194_15.anInterface8_2 == null) {
					this.aBoolean791 = true;
				} else {
					if (!this.aBoolean790) {
						this.method8816();
					}
					this.anIntArray617 = null;
				}
			}
		}
		if (this.aShortArray150 != null && this.anIntArray616 == null && this.anIntArray618 == null && this.anIntArray617 == null) {
			this.aShortArray150 = null;
			this.anIntArray619 = null;
		}
		if (this.aByteArray111 != null && !Static145.method2183(this.anInt10613, this.anInt10660)) {
			if (this.aClass194_14 == null) {
				if (this.aClass194_16 != null && this.aClass194_16.anInterface8_2 == null) {
					this.aBoolean791 = true;
				} else {
					this.aByteArray111 = null;
					this.aShortArray159 = this.aShortArray156 = this.aShortArray153 = null;
				}
			} else if (this.aClass194_14.anInterface8_2 == null) {
				this.aBoolean791 = true;
			} else {
				this.aShortArray159 = this.aShortArray156 = this.aShortArray153 = null;
				this.aByteArray111 = null;
			}
		}
		if (this.aShortArray149 != null && !Static215.method3088(this.anInt10660, this.anInt10613)) {
			if (this.aClass194_16 != null && this.aClass194_16.anInterface8_2 == null) {
				this.aBoolean791 = true;
			} else {
				this.aShortArray149 = null;
			}
		}
		if (this.aByteArray112 != null && !Static7.method148(this.anInt10660, this.anInt10613)) {
			if (this.aClass194_16 != null && this.aClass194_16.anInterface8_2 == null) {
				this.aBoolean791 = true;
			} else {
				this.aByteArray112 = null;
			}
		}
		if (this.aFloatArray82 != null && !Static523.method8747(this.anInt10613, this.anInt10660)) {
			if (this.aClass194_13 != null && this.aClass194_13.anInterface8_2 == null) {
				this.aBoolean791 = true;
			} else {
				this.aFloatArray82 = this.aFloatArray83 = null;
			}
		}
		if (this.aShortArray151 != null && !Static43.method607(this.anInt10660, this.anInt10613)) {
			if (this.aClass194_16 != null && this.aClass194_16.anInterface8_2 == null) {
				this.aBoolean791 = true;
			} else {
				this.aShortArray151 = null;
			}
		}
		if (this.aShortArray152 != null && !Static2.method38(this.anInt10613, this.anInt10660)) {
			if (this.aClass319_1 != null && this.aClass319_1.anInterface15_4 == null || this.aClass194_16 != null && this.aClass194_16.anInterface8_2 == null) {
				this.aBoolean791 = true;
			} else {
				this.aShortArray152 = this.aShortArray158 = this.aShortArray155 = null;
			}
		}
		if (this.anIntArrayArray96 != null && !Static146.method2196(this.anInt10613, this.anInt10660)) {
			this.aShortArray157 = null;
			this.anIntArrayArray96 = null;
		}
		if (this.anIntArrayArray94 != null && !Static292.method4008(this.anInt10660, this.anInt10613)) {
			this.anIntArrayArray94 = null;
			this.aShortArray154 = null;
		}
		if (this.anIntArrayArray95 != null && !Static672.method8770(this.anInt10660, this.anInt10613)) {
			this.anIntArrayArray95 = null;
		}
		if (this.anIntArray615 != null && (this.anInt10660 & 0x800) == 0 && (this.anInt10660 & 0x40000) == 0) {
			this.anIntArray615 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort120 = (short) arg0;
		if (this.aClass194_16 != null) {
			this.aClass194_16.anInterface8_2 = null;
		}
	}

	@OriginalMember(owner = "client!wv", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean790) {
			this.method8816();
		}
		return this.aShort124;
	}

	@OriginalMember(owner = "client!wv", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt10660;
	}
}
