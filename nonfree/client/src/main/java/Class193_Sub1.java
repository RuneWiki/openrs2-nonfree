import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lw")
public final class Class193_Sub1 extends Class193 {

	@OriginalMember(owner = "client!lw", name = "q", descriptor = "[I")
	private int[] anIntArray389;

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!lw", name = "w", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!lw", name = "z", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!lw", name = "G", descriptor = "[F")
	private float[] aFloatArray47;

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray68;

	@OriginalMember(owner = "client!lw", name = "K", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!lw", name = "M", descriptor = "[[I")
	private int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!lw", name = "S", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!lw", name = "U", descriptor = "Lclient!sha;")
	private Class315 aClass315_1;

	@OriginalMember(owner = "client!lw", name = "W", descriptor = "I")
	private int anInt5916;

	@OriginalMember(owner = "client!lw", name = "X", descriptor = "[I")
	private int[] anIntArray390;

	@OriginalMember(owner = "client!lw", name = "cb", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!lw", name = "db", descriptor = "I")
	private int anInt5921;

	@OriginalMember(owner = "client!lw", name = "ib", descriptor = "[[I")
	private int[][] anIntArrayArray70;

	@OriginalMember(owner = "client!lw", name = "nb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!lw", name = "pb", descriptor = "S")
	private short aShort77;

	@OriginalMember(owner = "client!lw", name = "rb", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!lw", name = "tb", descriptor = "[F")
	private float[] aFloatArray48;

	@OriginalMember(owner = "client!lw", name = "vb", descriptor = "S")
	private short aShort78;

	@OriginalMember(owner = "client!lw", name = "xb", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!lw", name = "Ab", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!lw", name = "Cb", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!lw", name = "Db", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!lw", name = "Eb", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!lw", name = "Gb", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!lw", name = "Jb", descriptor = "[I")
	private int[] anIntArray391;

	@OriginalMember(owner = "client!lw", name = "Ob", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!lw", name = "Rb", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!lw", name = "Tb", descriptor = "[I")
	private int[] anIntArray392;

	@OriginalMember(owner = "client!lw", name = "Ub", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!lw", name = "Vb", descriptor = "B")
	private byte aByte80;

	@OriginalMember(owner = "client!lw", name = "Yb", descriptor = "[Lclient!ik;")
	private Class162[] aClass162Array1;

	@OriginalMember(owner = "client!lw", name = "Zb", descriptor = "S")
	private short aShort81;

	@OriginalMember(owner = "client!lw", name = "dc", descriptor = "[I")
	private int[] anIntArray393;

	@OriginalMember(owner = "client!lw", name = "ec", descriptor = "Lclient!ju;")
	private Interface14 anInterface14_4;

	@OriginalMember(owner = "client!lw", name = "fc", descriptor = "Lclient!g;")
	private Interface7 anInterface7_4;

	@OriginalMember(owner = "client!lw", name = "gc", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!lw", name = "ic", descriptor = "I")
	private int anInt5947;

	@OriginalMember(owner = "client!lw", name = "mc", descriptor = "[Lclient!af;")
	private Class9[] aClass9Array1;

	@OriginalMember(owner = "client!lw", name = "xc", descriptor = "[Lclient!hv;")
	private Class156[] aClass156Array3;

	@OriginalMember(owner = "client!lw", name = "Cc", descriptor = "[Lclient!qi;")
	private Class287[] aClass287Array3;

	@OriginalMember(owner = "client!lw", name = "Gc", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!lw", name = "Hc", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!lw", name = "V", descriptor = "I")
	private int anInt5915 = 0;

	@OriginalMember(owner = "client!lw", name = "ob", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "client!lw", name = "Ib", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!lw", name = "wb", descriptor = "I")
	private int anInt5931 = 0;

	@OriginalMember(owner = "client!lw", name = "Q", descriptor = "I")
	private int anInt5912 = 0;

	@OriginalMember(owner = "client!lw", name = "ac", descriptor = "I")
	private int anInt5943 = 0;

	@OriginalMember(owner = "client!lw", name = "vc", descriptor = "Z")
	private boolean aBoolean422 = true;

	@OriginalMember(owner = "client!lw", name = "t", descriptor = "I")
	private int anInt5898 = 0;

	@OriginalMember(owner = "client!lw", name = "Lc", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!lw", name = "J", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_28;

	@OriginalMember(owner = "client!lw", name = "hb", descriptor = "Lclient!uo;")
	private Class352 aClass352_9;

	@OriginalMember(owner = "client!lw", name = "Fb", descriptor = "Lclient!uo;")
	private Class352 aClass352_10;

	@OriginalMember(owner = "client!lw", name = "Ic", descriptor = "Lclient!uo;")
	private Class352 aClass352_11;

	@OriginalMember(owner = "client!lw", name = "o", descriptor = "Lclient!uo;")
	private Class352 aClass352_8;

	@OriginalMember(owner = "client!lw", name = "Ec", descriptor = "Lclient!bb;")
	private Class28 aClass28_1;

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class193_Sub1(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_28 = arg0;
		this.aClass352_9 = new Class352((Interface14) null, 5126, 3, 0);
		this.aClass352_10 = new Class352((Interface14) null, 5126, 2, 0);
		this.aClass352_11 = new Class352((Interface14) null, 5126, 3, 0);
		this.aClass352_8 = new Class352((Interface14) null, 5121, 4, 0);
		this.aClass28_1 = new Class28();
	}

	@OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lclient!bi;Lclient!lga;IIII)V")
	public Class193_Sub1(@OriginalArg(0) Class13_Sub2 arg0, @OriginalArg(1) Class212 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5947 = arg5;
		this.anInt5921 = arg2;
		this.aClass13_Sub2_28 = arg0;
		if (Static501.method6955(arg5, arg2)) {
			this.aClass352_9 = new Class352((Interface14) null, 5126, 3, 0);
		}
		if (Static414.method6056(arg2, arg5)) {
			this.aClass352_10 = new Class352((Interface14) null, 5126, 2, 0);
		}
		if (Static241.method4097(arg2, arg5)) {
			this.aClass352_11 = new Class352((Interface14) null, 5126, 3, 0);
		}
		if (Static590.method8336(arg2, arg5)) {
			this.aClass352_8 = new Class352((Interface14) null, 5121, 4, 0);
		}
		if (Static153.method2686(arg5, arg2)) {
			this.aClass28_1 = new Class28();
		}
		@Pc(108) Interface2 local108 = arg0.anInterface2_12;
		this.anIntArray391 = new int[arg1.anInt5665 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt5661];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt5661; local121++) {
			if (arg1.aByteArray46 == null || arg1.aByteArray46[local121] != 2) {
				if (arg1.aShortArray61 != null && arg1.aShortArray61[local121] != -1) {
					@Pc(151) Class271 local151 = local108.method6027(arg1.aShortArray61[local121] & 0xFFFF);
					if (((this.anInt5947 & 0x40) == 0 || !local151.aBoolean514) && local151.aBoolean515) {
						continue;
					}
				}
				local119[this.anInt5915++] = local121;
				this.anIntArray391[arg1.aShortArray63[local121]]++;
				this.anIntArray391[arg1.aShortArray69[local121]]++;
				this.anIntArray391[arg1.aShortArray65[local121]]++;
			}
		}
		this.anInt5912 = this.anInt5915;
		@Pc(220) long[] local220 = new long[this.anInt5915];
		@Pc(229) boolean local229 = (this.anInt5921 & 0x100) != 0;
		@Pc(241) int local241;
		@Pc(254) int local254;
		@Pc(435) int local435;
		for (@Pc(231) int local231 = 0; local231 < this.anInt5915; local231++) {
			@Pc(237) int local237 = local119[local231];
			@Pc(239) Class271 local239 = null;
			local241 = 0;
			@Pc(243) byte local243 = 0;
			@Pc(245) byte local245 = 0;
			@Pc(247) byte local247 = 0;
			if (arg1.aClass149Array1 != null) {
				@Pc(252) boolean local252 = false;
				for (local254 = 0; local254 < arg1.aClass149Array1.length; local254++) {
					@Pc(261) Class149 local261 = arg1.aClass149Array1[local254];
					if (local261.anInt4079 == local237) {
						@Pc(270) Class108 local270 = Static173.method2997(local261.anInt4081);
						if (local270.aBoolean243) {
							local252 = true;
						}
						if (local270.anInt3070 != -1) {
							@Pc(285) Class271 local285 = local108.method6027(local270.anInt3070);
							if (local285.anInt7162 == 2) {
								this.aBoolean420 = true;
							}
						}
					}
				}
				if (local252) {
					local220[local231] = Long.MAX_VALUE;
					this.anInt5912--;
					continue;
				}
			}
			@Pc(320) short local320 = -1;
			if (arg1.aShortArray61 != null) {
				local320 = arg1.aShortArray61[local237];
				if (local320 != -1) {
					local239 = local108.method6027(local320 & 0xFFFF);
					if ((this.anInt5947 & 0x40) != 0 && local239.aBoolean514) {
						local239 = null;
						local320 = -1;
					} else {
						local245 = local239.aByte94;
						local247 = local239.aByte97;
						if (local239.aByte93 != 0 || local239.aByte95 != 0) {
							this.aBoolean423 = true;
						}
					}
				}
			}
			@Pc(391) boolean local391 = arg1.aByteArray52 != null && arg1.aByteArray52[local237] != 0 || local239 != null && local239.anInt7162 != 0;
			if ((local229 || local391) && arg1.aByteArray50 != null) {
				local241 += arg1.aByteArray50[local237] << 17;
			}
			if (local391) {
				local241 += 65536;
			}
			local241 += (local245 & 0xFF) << 8;
			local241 += local247 & 0xFF;
			local435 = local243 + ((local320 & 0xFFFF) << 16);
			@Pc(441) int local441 = local435 + (local231 & 0xFFFF);
			local220[local231] = (long) local441 + ((long) local241 << 32);
			this.aBoolean423 |= local239 != null && (local239.aByte93 != 0 || local239.aByte95 != 0);
			this.aBoolean420 |= local391;
		}
		Static480.method6806(local220, local119);
		this.anIntArray392 = arg1.anIntArray353;
		this.anIntArray389 = arg1.anIntArray355;
		this.anInt5943 = arg1.anInt5665;
		this.anIntArray390 = arg1.anIntArray360;
		this.anInt5898 = arg1.anInt5669;
		this.aShortArray82 = arg1.aShortArray64;
		this.aClass287Array3 = arg1.aClass287Array2;
		@Pc(517) Class339[] local517 = new Class339[this.anInt5943];
		this.aClass156Array3 = arg1.aClass156Array2;
		@Pc(541) int local541;
		@Pc(555) int local555;
		@Pc(601) int local601;
		if (arg1.aClass149Array1 != null) {
			this.anInt5916 = arg1.aClass149Array1.length;
			this.aClass9Array1 = new Class9[this.anInt5916];
			this.aClass162Array1 = new Class162[this.anInt5916];
			for (local541 = 0; local541 < this.anInt5916; local541++) {
				@Pc(548) Class149 local548 = arg1.aClass149Array1[local541];
				@Pc(553) Class108 local553 = Static173.method2997(local548.anInt4081);
				local555 = -1;
				for (@Pc(557) int local557 = 0; local557 < this.anInt5915; local557++) {
					if (local548.anInt4079 == local119[local557]) {
						local555 = local557;
						break;
					}
				}
				if (local555 == -1) {
					throw new RuntimeException();
				}
				local601 = Static347.anIntArray701[arg1.aShortArray68[local548.anInt4079] & 0xFFFF] & 0xFFFFFF;
				@Pc(619) int local619 = local601 | 255 - (arg1.aByteArray52 == null ? 0 : arg1.aByteArray52[local548.anInt4079]) << 24;
				this.aClass9Array1[local541] = new Class9(local555, arg1.aShortArray63[local548.anInt4079], arg1.aShortArray69[local548.anInt4079], arg1.aShortArray65[local548.anInt4079], local553.anInt3075, local553.anInt3079, local553.anInt3070, local553.anInt3068, local553.anInt3071, local553.aBoolean243, local553.aBoolean242, local548.anInt4076);
				this.aClass162Array1[local541] = new Class162(local619);
			}
		}
		local541 = this.anInt5915 * 3;
		this.aShortArray74 = new short[local541];
		this.aShortArray72 = new short[local541];
		this.aShortArray81 = new short[this.anInt5915];
		this.aShortArray78 = new short[local541];
		this.aByteArray54 = new byte[this.anInt5915];
		this.aShort73 = (short) arg3;
		this.aFloatArray47 = new float[local541];
		this.aByteArray55 = new byte[local541];
		this.aFloatArray48 = new float[local541];
		this.aShortArray73 = new short[this.anInt5915];
		this.aShort75 = (short) arg4;
		this.aShortArray76 = new short[this.anInt5915];
		if (arg1.aShortArray66 != null) {
			this.aShortArray80 = new short[this.anInt5915];
		}
		this.aShortArray79 = new short[this.anInt5915];
		Static599.aLongArray15 = new long[local541];
		this.aShortArray77 = new short[this.anInt5915];
		this.aShortArray75 = new short[local541];
		local241 = 0;
		for (local435 = 0; local435 < arg1.anInt5665; local435++) {
			local555 = this.anIntArray391[local435];
			this.anIntArray391[local435] = local241;
			local241 += local555;
			local517[local435] = new Class339();
		}
		this.anIntArray391[arg1.anInt5665] = local241;
		@Pc(805) Class215 local805 = Static159.method2761(this.anInt5915, local119, arg1);
		@Pc(809) Class294[] local809 = new Class294[arg1.anInt5661];
		@Pc(849) int local849;
		@Pc(860) int local860;
		@Pc(882) int local882;
		@Pc(893) int local893;
		@Pc(902) int local902;
		@Pc(911) int local911;
		@Pc(828) short local828;
		@Pc(839) int local839;
		for (local601 = 0; local601 < arg1.anInt5661; local601++) {
			@Pc(818) short local818 = arg1.aShortArray63[local601];
			@Pc(823) short local823 = arg1.aShortArray69[local601];
			local828 = arg1.aShortArray65[local601];
			local839 = this.anIntArray389[local823] - this.anIntArray389[local818];
			local849 = this.anIntArray390[local823] - this.anIntArray390[local818];
			local860 = this.anIntArray392[local823] - this.anIntArray392[local818];
			@Pc(871) int local871 = this.anIntArray389[local828] - this.anIntArray389[local818];
			local882 = this.anIntArray390[local828] - this.anIntArray390[local818];
			local893 = this.anIntArray392[local828] - this.anIntArray392[local818];
			local902 = local849 * local893 - local882 * local860;
			local911 = local860 * local871 - local839 * local893;
			@Pc(919) int local919 = local839 * local882 - local871 * local849;
			while (local902 > 8192 || local911 > 8192 || local919 > 8192 || local902 < -8192 || local911 < -8192 || local919 < -8192) {
				local919 >>= 0x1;
				local902 >>= 0x1;
				local911 >>= 0x1;
			}
			@Pc(976) int local976 = (int) Math.sqrt((double) (local902 * local902 + local911 * local911 + local919 * local919));
			if (local976 <= 0) {
				local976 = 1;
			}
			local911 = local911 * 256 / local976;
			local919 = local919 * 256 / local976;
			local902 = local902 * 256 / local976;
			@Pc(1008) byte local1008 = arg1.aByteArray46 == null ? 0 : arg1.aByteArray46[local601];
			if (local1008 == 0) {
				@Pc(1014) Class339 local1014 = local517[local818];
				local1014.anInt9241 += local919;
				local1014.anInt9239 += local911;
				local1014.anInt9237 += local902;
				local1014.anInt9243++;
				@Pc(1042) Class339 local1042 = local517[local823];
				local1042.anInt9241 += local919;
				local1042.anInt9239 += local911;
				local1042.anInt9237 += local902;
				local1042.anInt9243++;
				@Pc(1070) Class339 local1070 = local517[local828];
				local1070.anInt9243++;
				local1070.anInt9239 += local911;
				local1070.anInt9237 += local902;
				local1070.anInt9241 += local919;
			} else if (local1008 == 1) {
				@Pc(1109) Class294 local1109 = local809[local601] = new Class294();
				local1109.anInt7787 = local902;
				local1109.anInt7783 = local911;
				local1109.anInt7785 = local919;
			}
		}
		@Pc(1135) int local1135;
		@Pc(1178) short local1178;
		for (local254 = 0; local254 < this.anInt5915; local254++) {
			local1135 = local119[local254];
			@Pc(1142) int local1142 = arg1.aShortArray68[local1135] & 0xFFFF;
			if (arg1.aByteArray51 == null) {
				local839 = -1;
			} else {
				local839 = arg1.aByteArray51[local1135];
			}
			if (arg1.aByteArray52 == null) {
				local849 = 0;
			} else {
				local849 = arg1.aByteArray52[local1135] & 0xFF;
			}
			local1178 = arg1.aShortArray61 == null ? -1 : arg1.aShortArray61[local1135];
			if (local1178 != -1 && (this.anInt5947 & 0x40) != 0) {
				@Pc(1196) Class271 local1196 = local108.method6027(local1178 & 0xFFFF);
				if (local1196.aBoolean514) {
					local1178 = -1;
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
			@Pc(1254) byte local1254;
			@Pc(1274) short local1274;
			@Pc(2070) short local2070;
			@Pc(2075) short local2075;
			if (local1178 != -1) {
				if (local839 == -1) {
					local1209 = 1.0F;
					local1207 = 1.0F;
					local1203 = 0.0F;
					local1205 = 1.0F;
					local1213 = 0.0F;
					local1215 = 1;
					local1211 = 0.0F;
					local1217 = 2;
				} else {
					local839 &= 0xFF;
					local1254 = arg1.aByteArray49[local839];
					@Pc(1264) short local1264;
					@Pc(1269) short local1269;
					@Pc(1307) float local1307;
					@Pc(1325) float local1325;
					@Pc(1333) float local1333;
					@Pc(1429) float local1429;
					@Pc(1437) float local1437;
					@Pc(1445) float local1445;
					@Pc(1468) float local1468;
					@Pc(1491) float local1491;
					@Pc(1514) float local1514;
					if (local1254 == 0) {
						local1264 = arg1.aShortArray63[local1135];
						local1269 = arg1.aShortArray69[local1135];
						local1274 = arg1.aShortArray65[local1135];
						local2070 = arg1.aShortArray70[local839];
						local2075 = arg1.aShortArray62[local839];
						@Pc(2080) short local2080 = arg1.aShortArray67[local839];
						@Pc(2086) float local2086 = (float) arg1.anIntArray355[local2070];
						@Pc(2092) float local2092 = (float) arg1.anIntArray360[local2070];
						local1307 = (float) arg1.anIntArray353[local2070];
						local1325 = (float) arg1.anIntArray355[local2075] - local2086;
						local1333 = (float) arg1.anIntArray360[local2075] - local2092;
						@Pc(2123) float local2123 = (float) arg1.anIntArray353[local2075] - local1307;
						@Pc(2131) float local2131 = (float) arg1.anIntArray355[local2080] - local2086;
						@Pc(2139) float local2139 = (float) arg1.anIntArray360[local2080] - local2092;
						@Pc(2147) float local2147 = (float) arg1.anIntArray353[local2080] - local1307;
						@Pc(2156) float local2156 = (float) arg1.anIntArray355[local1264] - local2086;
						@Pc(2165) float local2165 = (float) arg1.anIntArray360[local1264] - local2092;
						@Pc(2173) float local2173 = (float) arg1.anIntArray353[local1264] - local1307;
						@Pc(2181) float local2181 = (float) arg1.anIntArray355[local1269] - local2086;
						@Pc(2190) float local2190 = (float) arg1.anIntArray360[local1269] - local2092;
						local1429 = (float) arg1.anIntArray353[local1269] - local1307;
						local1437 = (float) arg1.anIntArray355[local1274] - local2086;
						local1445 = (float) arg1.anIntArray360[local1274] - local2092;
						local1468 = (float) arg1.anIntArray353[local1274] - local1307;
						local1491 = local1333 * local2147 - local2139 * local2123;
						local1514 = local2131 * local2123 - local1325 * local2147;
						@Pc(2251) float local2251 = local1325 * local2139 - local1333 * local2131;
						@Pc(2260) float local2260 = local2139 * local2251 - local2147 * local1514;
						@Pc(2268) float local2268 = local1491 * local2147 - local2251 * local2131;
						@Pc(2277) float local2277 = local2131 * local1514 - local1491 * local2139;
						@Pc(2291) float local2291 = 1.0F / (local2277 * local2123 + local2268 * local1333 + local1325 * local2260);
						local1211 = (local1468 * local2277 + local2268 * local1445 + local2260 * local1437) * local2291;
						local1207 = (local1429 * local2277 + local2260 * local2181 + local2268 * local2190) * local2291;
						local1203 = (local2260 * local2156 + local2165 * local2268 + local2277 * local2173) * local2291;
						@Pc(2341) float local2341 = local1491 * local2123 - local1325 * local2251;
						@Pc(2349) float local2349 = local1325 * local1514 - local1333 * local1491;
						@Pc(2357) float local2357 = local2251 * local1333 - local1514 * local2123;
						@Pc(2371) float local2371 = 1.0F / (local2131 * local2357 + local2139 * local2341 + local2147 * local2349);
						local1209 = local2371 * (local1429 * local2349 + local2357 * local2181 + local2190 * local2341);
						local1205 = (local2349 * local2173 + local2165 * local2341 + local2357 * local2156) * local2371;
						local1213 = (local2341 * local1445 + local2357 * local1437 + local2349 * local1468) * local2371;
					} else {
						local1264 = arg1.aShortArray63[local1135];
						local1269 = arg1.aShortArray69[local1135];
						local1274 = arg1.aShortArray65[local1135];
						@Pc(1279) int local1279 = local805.anIntArray375[local839];
						@Pc(1284) int local1284 = local805.anIntArray377[local839];
						@Pc(1289) int local1289 = local805.anIntArray376[local839];
						@Pc(1294) float[] local1294 = local805.aFloatArrayArray7[local839];
						@Pc(1299) byte local1299 = arg1.aByteArray48[local839];
						local1307 = (float) arg1.anIntArray358[local839] / 256.0F;
						if (local1254 == 1) {
							local1325 = (float) arg1.anIntArray356[local839] / 1024.0F;
							Static553.method7821(local1284, local1325, local1294, Static414.aFloatArray60, arg1.anIntArray355[local1264], arg1.anIntArray360[local1264], local1289, local1279, arg1.anIntArray353[local1264], local1299, local1307);
							local1205 = Static414.aFloatArray60[1];
							local1203 = Static414.aFloatArray60[0];
							Static553.method7821(local1284, local1325, local1294, Static414.aFloatArray60, arg1.anIntArray355[local1269], arg1.anIntArray360[local1269], local1289, local1279, arg1.anIntArray353[local1269], local1299, local1307);
							local1209 = Static414.aFloatArray60[1];
							local1207 = Static414.aFloatArray60[0];
							Static553.method7821(local1284, local1325, local1294, Static414.aFloatArray60, arg1.anIntArray355[local1274], arg1.anIntArray360[local1274], local1289, local1279, arg1.anIntArray353[local1274], local1299, local1307);
							local1211 = Static414.aFloatArray60[0];
							local1213 = Static414.aFloatArray60[1];
							local1333 = local1325 / 2.0F;
							if ((local1299 & 0x1) == 0) {
								if (local1333 < local1207 - local1203) {
									local1215 = 1;
									local1207 -= local1325;
								} else if (local1333 < local1203 - local1207) {
									local1215 = 2;
									local1207 += local1325;
								}
								if (local1333 < local1211 - local1203) {
									local1211 -= local1325;
									local1217 = 1;
								} else if (local1203 - local1211 > local1333) {
									local1217 = 2;
									local1211 += local1325;
								}
							} else {
								if (local1333 < local1209 - local1205) {
									local1215 = 1;
									local1209 -= local1325;
								} else if (local1205 - local1209 > local1333) {
									local1209 += local1325;
									local1215 = 2;
								}
								if (local1333 < local1213 - local1205) {
									local1213 -= local1325;
									local1217 = 1;
								} else if (local1333 < local1205 - local1213) {
									local1217 = 2;
									local1213 += local1325;
								}
							}
						} else if (local1254 == 2) {
							local1325 = (float) arg1.anIntArray361[local839] / 256.0F;
							local1333 = (float) arg1.anIntArray357[local839] / 256.0F;
							@Pc(1343) int local1343 = arg1.anIntArray355[local1269] - arg1.anIntArray355[local1264];
							@Pc(1354) int local1354 = arg1.anIntArray360[local1269] - arg1.anIntArray360[local1264];
							@Pc(1365) int local1365 = arg1.anIntArray353[local1269] - arg1.anIntArray353[local1264];
							@Pc(1376) int local1376 = arg1.anIntArray355[local1274] - arg1.anIntArray355[local1264];
							@Pc(1386) int local1386 = arg1.anIntArray360[local1274] - arg1.anIntArray360[local1264];
							@Pc(1397) int local1397 = arg1.anIntArray353[local1274] - arg1.anIntArray353[local1264];
							@Pc(1405) int local1405 = local1397 * local1354 - local1365 * local1386;
							@Pc(1413) int local1413 = local1376 * local1365 - local1397 * local1343;
							@Pc(1421) int local1421 = local1386 * local1343 - local1376 * local1354;
							local1429 = 64.0F / (float) arg1.anIntArray359[local839];
							local1437 = 64.0F / (float) arg1.anIntArray363[local839];
							local1445 = 64.0F / (float) arg1.anIntArray356[local839];
							local1468 = ((float) local1413 * local1294[1] + local1294[0] * (float) local1405 + (float) local1421 * local1294[2]) / local1429;
							local1491 = (local1294[5] * (float) local1421 + local1294[3] * (float) local1405 + local1294[4] * (float) local1413) / local1437;
							local1514 = ((float) local1421 * local1294[8] + (float) local1413 * local1294[7] + local1294[6] * (float) local1405) / local1445;
							local1219 = Static330.method5041(local1514, local1491, local1468);
							Static375.method5564(local1279, local1284, local1307, local1299, arg1.anIntArray353[local1264], arg1.anIntArray355[local1264], local1325, local1289, local1294, arg1.anIntArray360[local1264], local1333, local1219, Static414.aFloatArray60);
							local1203 = Static414.aFloatArray60[0];
							local1205 = Static414.aFloatArray60[1];
							Static375.method5564(local1279, local1284, local1307, local1299, arg1.anIntArray353[local1269], arg1.anIntArray355[local1269], local1325, local1289, local1294, arg1.anIntArray360[local1269], local1333, local1219, Static414.aFloatArray60);
							local1209 = Static414.aFloatArray60[1];
							local1207 = Static414.aFloatArray60[0];
							Static375.method5564(local1279, local1284, local1307, local1299, arg1.anIntArray353[local1274], arg1.anIntArray355[local1274], local1325, local1289, local1294, arg1.anIntArray360[local1274], local1333, local1219, Static414.aFloatArray60);
							local1211 = Static414.aFloatArray60[0];
							local1213 = Static414.aFloatArray60[1];
						} else if (local1254 == 3) {
							Static178.method8646(arg1.anIntArray353[local1264], local1299, local1294, arg1.anIntArray360[local1264], local1289, local1307, Static414.aFloatArray60, arg1.anIntArray355[local1264], local1284, local1279);
							local1205 = Static414.aFloatArray60[1];
							local1203 = Static414.aFloatArray60[0];
							Static178.method8646(arg1.anIntArray353[local1269], local1299, local1294, arg1.anIntArray360[local1269], local1289, local1307, Static414.aFloatArray60, arg1.anIntArray355[local1269], local1284, local1279);
							local1209 = Static414.aFloatArray60[1];
							local1207 = Static414.aFloatArray60[0];
							Static178.method8646(arg1.anIntArray353[local1274], local1299, local1294, arg1.anIntArray360[local1274], local1289, local1307, Static414.aFloatArray60, arg1.anIntArray355[local1274], local1284, local1279);
							local1211 = Static414.aFloatArray60[0];
							local1213 = Static414.aFloatArray60[1];
							if ((local1299 & 0x1) == 0) {
								if (local1211 - local1203 > 0.5F) {
									local1211--;
									local1217 = 1;
								} else if (local1203 - local1211 > 0.5F) {
									local1217 = 2;
									local1211++;
								}
								if (local1207 - local1203 > 0.5F) {
									local1207--;
									local1215 = 1;
								} else if (local1203 - local1207 > 0.5F) {
									local1215 = 2;
									local1207++;
								}
							} else {
								if (local1213 - local1205 > 0.5F) {
									local1217 = 1;
									local1213--;
								} else if (local1205 - local1213 > 0.5F) {
									local1213++;
									local1217 = 2;
								}
								if (local1209 - local1205 > 0.5F) {
									local1209--;
									local1215 = 1;
								} else if (local1205 - local1209 > 0.5F) {
									local1215 = 2;
									local1209++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray46 == null) {
				local1254 = 0;
			} else {
				local1254 = arg1.aByteArray46[local1135];
			}
			if (local1254 == 0) {
				@Pc(2575) long local2575 = (long) (local839 << 2) + ((long) (local1142 << 8) + (long) (local1219 << 24) + (long) local849 << 32);
				local1274 = arg1.aShortArray63[local1135];
				local2070 = arg1.aShortArray69[local1135];
				local2075 = arg1.aShortArray65[local1135];
				@Pc(2594) Class339 local2594 = local517[local1274];
				this.aShortArray76[local254] = this.method5141(local2594.anInt9243, local2575, arg1, local2594.anInt9239, local1205, local1203, local2594.anInt9241, local2594.anInt9237, local1274);
				@Pc(2618) Class339 local2618 = local517[local2070];
				this.aShortArray81[local254] = this.method5141(local2618.anInt9243, local2575 + (long) local1215, arg1, local2618.anInt9239, local1209, local1207, local2618.anInt9241, local2618.anInt9237, local2070);
				@Pc(2645) Class339 local2645 = local517[local2075];
				this.aShortArray77[local254] = this.method5141(local2645.anInt9243, local2575 + (long) local1217, arg1, local2645.anInt9239, local1213, local1211, local2645.anInt9241, local2645.anInt9237, local2075);
			} else if (local1254 == 1) {
				@Pc(2436) Class294 local2436 = local809[local1135];
				@Pc(2481) long local2481 = ((long) local849 + (long) (local1219 << 24) + (long) (local1142 << 8) << 32) + (long) ((local2436.anInt7785 + 256 << 22) + (local2436.anInt7783 + 256 << 12) + (local2436.anInt7787 <= 0 ? 2048 : 1024) + (local839 << 2));
				this.aShortArray76[local254] = this.method5141(0, local2481, arg1, local2436.anInt7783, local1205, local1203, local2436.anInt7785, local2436.anInt7787, arg1.aShortArray63[local1135]);
				this.aShortArray81[local254] = this.method5141(0, local2481 + (long) local1215, arg1, local2436.anInt7783, local1209, local1207, local2436.anInt7785, local2436.anInt7787, arg1.aShortArray69[local1135]);
				this.aShortArray77[local254] = this.method5141(0, (long) local1217 + local2481, arg1, local2436.anInt7783, local1213, local1211, local2436.anInt7785, local2436.anInt7787, arg1.aShortArray65[local1135]);
			}
			if (arg1.aByteArray52 != null) {
				this.aByteArray54[local254] = arg1.aByteArray52[local1135];
			}
			if (arg1.aShortArray66 != null) {
				this.aShortArray80[local254] = arg1.aShortArray66[local1135];
			}
			this.aShortArray79[local254] = arg1.aShortArray68[local1135];
			this.aShortArray73[local254] = local1178;
		}
		local1135 = 0;
		local828 = -10000;
		for (local839 = 0; local839 < this.anInt5912; local839++) {
			@Pc(2721) short local2721 = this.aShortArray73[local839];
			if (local828 != local2721) {
				local828 = local2721;
				local1135++;
			}
		}
		this.anIntArray393 = new int[local1135 + 1];
		local828 = -10000;
		local1135 = 0;
		for (local849 = 0; local849 < this.anInt5912; local849++) {
			local1178 = this.aShortArray73[local849];
			if (local1178 != local828) {
				this.anIntArray393[local1135++] = local849;
				local828 = local1178;
			}
		}
		this.anIntArray393[local1135] = this.anInt5912;
		Static599.aLongArray15 = null;
		this.aShortArray72 = Static433.method6270(this.aShortArray72, this.anInt5931);
		this.aShortArray74 = Static433.method6270(this.aShortArray74, this.anInt5931);
		this.aShortArray78 = Static433.method6270(this.aShortArray78, this.anInt5931);
		this.aByteArray55 = Static49.method1206(this.anInt5931, this.aByteArray55);
		this.aFloatArray48 = Static335.method5093(this.aFloatArray48, this.anInt5931);
		this.aFloatArray47 = Static335.method5093(this.aFloatArray47, this.anInt5931);
		if (arg1.anIntArray354 != null && Static171.method2970(this.anInt5947, arg2)) {
			this.anIntArrayArray70 = arg1.method4927(false);
		}
		if (arg1.aClass149Array1 != null && Static216.method3555(this.anInt5947, arg2)) {
			this.anIntArrayArray68 = arg1.method4924();
		}
		if (arg1.anIntArray362 != null && Static259.method4299(this.anInt5947, arg2)) {
			local860 = 0;
			@Pc(2874) int[] local2874 = new int[256];
			for (local882 = 0; local882 < this.anInt5915; local882++) {
				local893 = arg1.anIntArray362[local119[local882]];
				if (local893 >= 0) {
					if (local860 < local893) {
						local860 = local893;
					}
					@Pc(2899) int local2899 = local2874[local893]++;
				}
			}
			this.anIntArrayArray69 = new int[local860 + 1][];
			for (local893 = 0; local893 <= local860; local893++) {
				this.anIntArrayArray69[local893] = new int[local2874[local893]];
				local2874[local893] = 0;
			}
			for (local902 = 0; local902 < this.anInt5915; local902++) {
				local911 = arg1.anIntArray362[local119[local902]];
				if (local911 >= 0) {
					this.anIntArrayArray69[local911][local2874[local911]++] = local902;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "()[Lclient!qi;")
	@Override
	public Class287[] method6621() {
		return this.aClass287Array3;
	}

	@OriginalMember(owner = "client!lw", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface2 local9 = this.aClass13_Sub2_28.anInterface2_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5915; local11++) {
			if (arg0 == this.aShortArray73[local11]) {
				this.aShortArray73[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class271 local51 = local9.method6027(arg0 & 0xFFFF);
			local39 = local51.aByte92;
			local41 = local51.aByte91;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class271 local72 = local9.method6027(arg1 & 0xFFFF);
			local59 = local72.aByte92;
			local61 = local72.aByte91;
			if (local72.aByte93 != 0 || local72.aByte95 != 0) {
				this.aBoolean423 = true;
			}
		}
		if (!(local59 != local39 | local41 != local61)) {
			return;
		}
		if (this.aClass9Array1 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.anInt5916; local116++) {
				@Pc(123) Class9 local123 = this.aClass9Array1[local116];
				@Pc(128) Class162 local128 = this.aClass162Array1[local116];
				local128.anInt4674 = Static347.anIntArray701[this.aShortArray79[local123.anInt148] & 0xFFFF] & 0xFFFFFF | local128.anInt4674 & 0xFF000000;
			}
		}
		if (this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZI)V")
	private void method5137(@OriginalArg(0) boolean arg0) {
		if (this.anInt5912 * 6 <= this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1.aByteArray26.length) {
			this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1.anInt3378 = 0;
		} else {
			this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(this.anInt5912 * 6 + 600);
		}
		@Pc(42) Class2_Sub17_Sub2 local42 = this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1;
		@Pc(48) int local48;
		if (this.aClass13_Sub2_28.aBoolean102) {
			for (local48 = 0; local48 < this.anInt5912; local48++) {
				local42.method2879(this.aShortArray76[local48]);
				local42.method2879(this.aShortArray81[local48]);
				local42.method2879(this.aShortArray77[local48]);
			}
		} else {
			for (local48 = 0; local48 < this.anInt5912; local48++) {
				local42.method2878(this.aShortArray76[local48]);
				local42.method2878(this.aShortArray81[local48]);
				local42.method2878(this.aShortArray77[local48]);
			}
		}
		if (local42.anInt3378 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface7_4 == null) {
				this.anInterface7_4 = this.aClass13_Sub2_28.method1020(local42.anInt3378, true, local42.aByteArray26);
			} else {
				this.anInterface7_4.method4615(local42.aByteArray26, local42.anInt3378);
			}
			this.aClass28_1.anInterface7_1 = this.anInterface7_4;
		} else {
			this.aClass28_1.anInterface7_1 = this.aClass13_Sub2_28.method1020(local42.anInt3378, false, local42.aByteArray26);
		}
		if (!arg0) {
			this.aBoolean422 = true;
		}
	}

	@OriginalMember(owner = "client!lw", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean423;
	}

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "()Z")
	@Override
	public boolean method6618() {
		if (this.aShortArray73 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray73.length; local12++) {
			if (this.aShortArray73[local12] != -1 && !this.aClass13_Sub2_28.anInterface2_12.method6026(this.aShortArray73[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5943; local15++) {
			local34 = local9 * this.anIntArray392[local15] + this.anIntArray389[local15] * local13 >> 14;
			this.anIntArray392[local15] = local13 * this.anIntArray392[local15] - this.anIntArray389[local15] * local9 >> 14;
			this.anIntArray389[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5931; local34++) {
			@Pc(88) int local88 = this.aShortArray72[local34] * local13 + this.aShortArray78[local34] * local9 >> 14;
			this.aShortArray78[local34] = (short) (this.aShortArray78[local34] * local13 - this.aShortArray72[local34] * local9 >> 14);
			this.aShortArray72[local34] = (short) local88;
		}
		if (this.aClass352_11 == null && this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
		}
		if (this.aClass352_11 != null) {
			this.aClass352_11.anInterface14_7 = null;
		}
		this.aBoolean421 = false;
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5943; local3++) {
			this.anIntArray392[local3] = -this.anIntArray392[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5931; local25++) {
			this.aShortArray78[local25] = (short) -this.aShortArray78[local25];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5915; local48++) {
			@Pc(55) short local55 = this.aShortArray76[local48];
			this.aShortArray76[local48] = this.aShortArray77[local48];
			this.aShortArray77[local48] = local55;
		}
		if (this.aClass352_11 == null && this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
		}
		if (this.aClass352_11 != null) {
			this.aClass352_11.anInterface14_7 = null;
		}
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
		this.aBoolean421 = false;
		if (this.aClass28_1 != null) {
			this.aClass28_1.anInterface7_1 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ISIIB)I")
	private int method5138(@OriginalArg(1) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(18) int local18 = Static347.anIntArray701[Static122.method2204(arg2, arg1)];
		if (arg0 != -1) {
			@Pc(31) Class271 local31 = this.aClass13_Sub2_28.anInterface2_12.method6027(arg0 & 0xFFFF);
			@Pc(36) int local36 = local31.aByte92 & 0xFF;
			@Pc(48) int local48;
			@Pc(73) int local73;
			if (local36 != 0) {
				if (arg1 < 0) {
					local48 = 0;
				} else if (arg1 > 127) {
					local48 = 16777215;
				} else {
					local48 = arg1 * 131586;
				}
				if (local36 == 256) {
					local18 = local48;
				} else {
					local73 = 256 - local36;
					local18 = ((local18 & 0xFF00) * local73 + (local48 & 0xFF00) * local36 & 0xFF0000) + ((local18 & 0xFF00FF) * local73 + local36 * (local48 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local48 = local31.aByte91 & 0xFF;
			if (local48 != 0) {
				local48 += 256;
				@Pc(122) int local122 = local48 * (local18 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local73 = local48 * (local18 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(150) int local150 = (local18 & 0xFF) * local48;
				if (local150 > 65535) {
					local150 = 65535;
				}
				local18 = ((local122 & 0x5800FF00) << 8) + (local73 & 0xFF00) + (local150 >> 8);
			}
		}
		return (local18 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5943; local15++) {
			@Pc(33) int local33 = this.anIntArray389[local15] * local13 + local9 * this.anIntArray392[local15] >> 14;
			this.anIntArray392[local15] = local13 * this.anIntArray392[local15] - this.anIntArray389[local15] * local9 >> 14;
			this.anIntArray389[local15] = local33;
		}
		this.aBoolean421 = false;
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort76;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IZ)V")
	private void method5139(@OriginalArg(1) boolean arg0) {
		@Pc(22) boolean local22 = this.aClass352_8 != null && this.aClass352_8.anInterface14_7 == null;
		@Pc(33) boolean local33 = this.aClass352_11 != null && this.aClass352_11.anInterface14_7 == null;
		@Pc(44) boolean local44 = this.aClass352_9 != null && this.aClass352_9.anInterface14_7 == null;
		@Pc(55) boolean local55 = this.aClass352_10 != null && this.aClass352_10.anInterface14_7 == null;
		if (arg0) {
			local22 &= (this.aByte80 & 0x2) != 0;
			local33 &= (this.aByte80 & 0x4) != 0;
			local55 &= (this.aByte80 & 0x8) != 0;
			local44 &= (this.aByte80 & 0x1) != 0;
		}
		@Pc(106) byte local106 = 0;
		@Pc(110) byte local110 = 0;
		@Pc(112) byte local112 = 0;
		if (local44) {
			local106 = 12;
		}
		@Pc(123) byte local123 = 0;
		if (local22) {
			local110 = local106;
			local106 = (byte) (local106 + 4);
		}
		if (local33) {
			local112 = local106;
			local106 = (byte) (local106 + 12);
		}
		if (local55) {
			local123 = local106;
			local106 = (byte) (local106 + 8);
		}
		if (local106 == 0) {
			return;
		}
		if (local106 * this.anInt5931 <= this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1.aByteArray26.length) {
			this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1.anInt3378 = 0;
		} else {
			this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1 = new Class2_Sub17_Sub2(local106 * (this.anInt5931 + 100));
		}
		@Pc(189) Class2_Sub17_Sub2 local189 = this.aClass13_Sub2_28.aClass2_Sub17_Sub2_1;
		@Pc(197) int local197;
		@Pc(206) int local206;
		@Pc(234) int local234;
		@Pc(243) int local243;
		if (local44) {
			@Pc(213) int local213;
			@Pc(220) int local220;
			@Pc(225) int local225;
			@Pc(232) int local232;
			if (this.aClass13_Sub2_28.aBoolean102) {
				for (local197 = 0; local197 < this.anInt5943; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray389[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray390[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray392[local197]);
					local225 = this.anIntArray391[local197];
					local232 = this.anIntArray391[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray75[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt3378 = local243 * local106;
						local189.method2827(local206);
						local189.method2827(local213);
						local189.method2827(local220);
					}
				}
			} else {
				for (local197 = 0; local197 < this.anInt5943; local197++) {
					local206 = Stream.floatToRawIntBits((float) this.anIntArray389[local197]);
					local213 = Stream.floatToRawIntBits((float) this.anIntArray390[local197]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray392[local197]);
					local225 = this.anIntArray391[local197];
					local232 = this.anIntArray391[local197 + 1];
					for (local234 = local225; local234 < local232; local234++) {
						local243 = this.aShortArray75[local234] - 1;
						if (local243 == -1) {
							break;
						}
						local189.anInt3378 = local106 * local243;
						local189.method2875(local206);
						local189.method2875(local213);
						local189.method2875(local220);
					}
				}
			}
		}
		@Pc(498) float local498;
		@Pc(374) short[] local374;
		@Pc(380) short[] local380;
		@Pc(371) short[] local371;
		@Pc(377) byte[] local377;
		@Pc(531) float local531;
		if (local22) {
			if (this.aClass352_11 == null) {
				if (this.aClass315_1 == null) {
					local371 = this.aShortArray78;
					local374 = this.aShortArray72;
					local377 = this.aByteArray55;
					local380 = this.aShortArray74;
				} else {
					local380 = this.aClass315_1.aShortArray129;
					local374 = this.aClass315_1.aShortArray128;
					local371 = this.aClass315_1.aShortArray127;
					local377 = this.aClass315_1.aByteArray88;
				}
				@Pc(404) float local404 = this.aClass13_Sub2_28.aFloatArray10[0];
				@Pc(410) float local410 = this.aClass13_Sub2_28.aFloatArray10[1];
				@Pc(416) float local416 = this.aClass13_Sub2_28.aFloatArray10[2];
				@Pc(420) float local420 = this.aClass13_Sub2_28.aFloat13;
				@Pc(430) float local430 = this.aClass13_Sub2_28.aFloat28 * 768.0F / (float) this.aShort75;
				@Pc(440) float local440 = this.aClass13_Sub2_28.aFloat17 * 768.0F / (float) this.aShort75;
				for (@Pc(442) int local442 = 0; local442 < this.anInt5915; local442++) {
					@Pc(462) int local462 = this.method5138(this.aShortArray73[local442], this.aShort73, this.aShortArray79[local442], this.aByteArray54[local442]);
					@Pc(471) float local471 = (float) (local462 >>> 24) * this.aClass13_Sub2_28.aFloat22;
					@Pc(482) float local482 = (float) (local462 >> 8 & 0xFF) * this.aClass13_Sub2_28.aFloat10;
					@Pc(487) short local487 = this.aShortArray76[local442];
					local498 = this.aClass13_Sub2_28.aFloat23 * (float) (local462 >> 16 & 0xFF);
					@Pc(503) short local503 = (short) local377[local487];
					if (local503 == 0) {
						local531 = (local404 * (float) local374[local487] + local410 * (float) local380[local487] + (float) local371[local487] * local416) * 0.0026041667F;
					} else {
						local531 = ((float) local374[local487] * local404 + (float) local380[local487] * local410 + local416 * (float) local371[local487]) / (float) (local503 * 256);
					}
					@Pc(571) float local571 = (local531 < 0.0F ? local440 : local430) * local531 + local420;
					@Pc(576) int local576 = (int) (local571 * local471);
					@Pc(581) int local581 = (int) (local498 * local571);
					if (local576 < 0) {
						local576 = 0;
					} else if (local576 > 255) {
						local576 = 255;
					}
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					@Pc(615) int local615 = (int) (local571 * local482);
					local189.anInt3378 = local106 * local487 + local110;
					if (local615 < 0) {
						local615 = 0;
					} else if (local615 > 255) {
						local615 = 255;
					}
					local189.method2837(local576);
					local189.method2837(local581);
					local189.method2837(local615);
					local189.method2837(255 - (this.aByteArray54[local442] & 0xFF));
					local487 = this.aShortArray81[local442];
					local503 = (short) local377[local487];
					if (local503 == 0) {
						local531 = (local404 * (float) local374[local487] + (float) local380[local487] * local410 + (float) local371[local487] * local416) * 0.0026041667F;
					} else {
						local531 = (local416 * (float) local371[local487] + local404 * (float) local374[local487] + (float) local380[local487] * local410) / (float) (local503 * 256);
					}
					local571 = (local531 < 0.0F ? local440 : local430) * local531 + local420;
					local576 = (int) (local471 * local571);
					if (local576 < 0) {
						local576 = 0;
					} else if (local576 > 255) {
						local576 = 255;
					}
					local581 = (int) (local498 * local571);
					local615 = (int) (local482 * local571);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					if (local615 < 0) {
						local615 = 0;
					} else if (local615 > 255) {
						local615 = 255;
					}
					local189.anInt3378 = local110 + local106 * local487;
					local189.method2837(local576);
					local189.method2837(local581);
					local189.method2837(local615);
					local189.method2837(255 - (this.aByteArray54[local442] & 0xFF));
					local487 = this.aShortArray77[local442];
					local503 = (short) local377[local487];
					if (local503 == 0) {
						local531 = ((float) local374[local487] * local404 + local410 * (float) local380[local487] + (float) local371[local487] * local416) * 0.0026041667F;
					} else {
						local531 = (local404 * (float) local374[local487] + local410 * (float) local380[local487] + (float) local371[local487] * local416) / (float) (local503 * 256);
					}
					local571 = local531 * (local531 < 0.0F ? local440 : local430) + local420;
					local576 = (int) (local471 * local571);
					local581 = (int) (local571 * local498);
					if (local576 < 0) {
						local576 = 0;
					} else if (local576 > 255) {
						local576 = 255;
					}
					local615 = (int) (local571 * local482);
					if (local581 < 0) {
						local581 = 0;
					} else if (local581 > 255) {
						local581 = 255;
					}
					local189.anInt3378 = local110 + local487 * local106;
					if (local615 < 0) {
						local615 = 0;
					} else if (local615 > 255) {
						local615 = 255;
					}
					local189.method2837(local576);
					local189.method2837(local581);
					local189.method2837(local615);
					local189.method2837(255 - (this.aByteArray54[local442] & 0xFF));
				}
			} else {
				for (local197 = 0; local197 < this.anInt5915; local197++) {
					local206 = this.method5138(this.aShortArray73[local197], this.aShort73, this.aShortArray79[local197], this.aByteArray54[local197]);
					local189.anInt3378 = this.aShortArray76[local197] * local106 + local110;
					local189.method2827(local206);
					local189.anInt3378 = local106 * this.aShortArray81[local197] + local110;
					local189.method2827(local206);
					local189.anInt3378 = local106 * this.aShortArray77[local197] + local110;
					local189.method2827(local206);
				}
			}
		}
		if (local33) {
			if (this.aClass315_1 == null) {
				local374 = this.aShortArray72;
				local380 = this.aShortArray74;
				local371 = this.aShortArray78;
				local377 = this.aByteArray55;
			} else {
				local380 = this.aClass315_1.aShortArray129;
				local371 = this.aClass315_1.aShortArray127;
				local374 = this.aClass315_1.aShortArray128;
				local377 = this.aClass315_1.aByteArray88;
			}
			@Pc(1123) float local1123 = 3.0F / (float) this.aShort75;
			local531 = 3.0F / (float) (this.aShort75 / 2 + this.aShort75);
			local189.anInt3378 = local112;
			if (this.aClass13_Sub2_28.aBoolean102) {
				for (local234 = 0; local234 < this.anInt5931; local234++) {
					local243 = local377[local234] & 0xFF;
					if (local243 == 0) {
						local189.method2890(local531 * (float) local374[local234]);
						local189.method2890(local531 * (float) local380[local234]);
						local189.method2890((float) local371[local234] * local531);
					} else {
						local498 = local1123 / (float) local243;
						local189.method2890(local498 * (float) local374[local234]);
						local189.method2890((float) local380[local234] * local498);
						local189.method2890(local498 * (float) local371[local234]);
					}
					local189.anInt3378 += local106 - 12;
				}
			} else {
				for (local234 = 0; local234 < this.anInt5931; local234++) {
					local243 = local377[local234] & 0xFF;
					if (local243 == 0) {
						local189.method2892(local531 * (float) local374[local234]);
						local189.method2892(local531 * (float) local380[local234]);
						local189.method2892(local531 * (float) local371[local234]);
					} else {
						local498 = local1123 / (float) local243;
						local189.method2892(local498 * (float) local374[local234]);
						local189.method2892(local498 * (float) local380[local234]);
						local189.method2892((float) local371[local234] * local498);
					}
					local189.anInt3378 += local106 - 12;
				}
			}
		}
		if (local55) {
			local189.anInt3378 = local123;
			if (this.aClass13_Sub2_28.aBoolean102) {
				for (local197 = 0; local197 < this.anInt5931; local197++) {
					local189.method2890(this.aFloatArray48[local197]);
					local189.method2890(this.aFloatArray47[local197]);
					local189.anInt3378 += local106 - 8;
				}
			} else {
				for (local197 = 0; local197 < this.anInt5931; local197++) {
					local189.method2892(this.aFloatArray48[local197]);
					local189.method2892(this.aFloatArray47[local197]);
					local189.anInt3378 += local106 - 8;
				}
			}
		}
		local189.anInt3378 = local106 * this.anInt5931;
		@Pc(1428) Interface14 local1428;
		if (arg0) {
			if (this.anInterface14_4 == null) {
				this.anInterface14_4 = this.aClass13_Sub2_28.method1060(local189.aByteArray26, true, local189.anInt3378, local106);
			} else {
				this.anInterface14_4.method4793(local106, local189.anInt3378, local189.aByteArray26);
			}
			this.aByte80 = 0;
			local1428 = this.anInterface14_4;
		} else {
			local1428 = this.aClass13_Sub2_28.method1060(local189.aByteArray26, false, local189.anInt3378, local106);
			this.aBoolean422 = true;
		}
		if (local44) {
			this.aClass352_9.anInterface14_7 = local1428;
			this.aClass352_9.aByte128 = 0;
		}
		if (local55) {
			this.aClass352_10.anInterface14_7 = local1428;
			this.aClass352_10.aByte128 = local123;
		}
		if (local22) {
			this.aClass352_8.aByte128 = local110;
			this.aClass352_8.anInterface14_7 = local1428;
		}
		if (local33) {
			this.aClass352_11.aByte128 = local112;
			this.aClass352_11.anInterface14_7 = local1428;
		}
	}

	@OriginalMember(owner = "client!lw", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort77;
	}

	@OriginalMember(owner = "client!lw", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) Class91 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean421) {
			this.method5145();
		}
		@Pc(16) int local16 = this.aShort78 + arg4;
		@Pc(22) int local22 = arg4 + this.aShort76;
		@Pc(27) int local27 = arg6 + this.aShort81;
		@Pc(32) int local32 = this.aShort82 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8647 + local22 >> arg2.anInt8641 >= arg2.anInt8650 || local27 < 0 || local32 + arg2.anInt8647 >> arg2.anInt8641 >= arg2.anInt8645)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8650 <= arg3.anInt8647 + local22 >> arg3.anInt8641 || local27 < 0 || arg3.anInt8647 + local32 >> arg3.anInt8641 >= arg3.anInt8645) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8641;
			local22 = arg2.anInt8647 + local22 - 1 >> arg2.anInt8641;
			local27 >>= arg2.anInt8641;
			local32 = arg2.anInt8647 + local32 - 1 >> arg2.anInt8641;
			if (arg2.method7447(local27, local16) == arg5 && arg2.method7447(local27, local22) == arg5 && arg5 == arg2.method7447(local32, local16) && arg2.method7447(local32, local22) == arg5) {
				return;
			}
		}
		@Pc(209) int local209;
		if (arg0 == 1) {
			for (local209 = 0; local209 < this.anInt5943; local209++) {
				this.anIntArray390[local209] = this.anIntArray390[local209] + arg2.method7446(this.anIntArray389[local209] + arg4, this.anIntArray392[local209] - -arg6) - arg5;
			}
		} else {
			@Pc(211) int local211;
			@Pc(221) int local221;
			if (arg0 == 2) {
				@Pc(419) short local419 = this.aShort79;
				if (local419 == 0) {
					return;
				}
				for (local211 = 0; local211 < this.anInt5943; local211++) {
					local221 = (this.anIntArray390[local211] << 16) / local419;
					if (arg1 > local221) {
						this.anIntArray390[local211] -= -((arg1 - local221) * (-arg5 + arg2.method7446(arg4 + this.anIntArray389[local211], this.anIntArray392[local211] + arg6)) / arg1);
					}
				}
			} else {
				@Pc(228) int local228;
				if (arg0 == 3) {
					local209 = (arg1 & 0xFF) * 4;
					local211 = (arg1 >> 8 & 0xFF) * 4;
					local221 = (arg1 >> 16 & 0xFF) << 6;
					local228 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local209 >> 1) < 0 || arg2.anInt8650 << arg2.anInt8641 <= arg2.anInt8647 + (local209 >> 1) + arg4 || arg6 - (local211 >> 1) < 0 || arg2.anInt8645 << arg2.anInt8641 <= arg6 + (local211 >> 1) + arg2.anInt8647) {
						return;
					}
					this.method6619(arg2, arg4, local228, local211, local209, local221, arg6, arg5);
				} else if (arg0 == 4) {
					local209 = this.aShort74 - this.aShort79;
					for (local211 = 0; local211 < this.anInt5943; local211++) {
						this.anIntArray390[local211] = this.anIntArray390[local211] + arg3.method7446(arg4 + this.anIntArray389[local211], this.anIntArray392[local211] + arg6) + local209 - arg5;
					}
				} else if (arg0 == 5) {
					local209 = this.aShort74 - this.aShort79;
					for (local211 = 0; local211 < this.anInt5943; local211++) {
						local221 = this.anIntArray389[local211] + arg4;
						local228 = this.anIntArray392[local211] + arg6;
						@Pc(234) int local234 = arg2.method7446(local221, local228);
						@Pc(240) int local240 = arg3.method7446(local221, local228);
						@Pc(247) int local247 = local234 - arg1 - local240;
						this.anIntArray390[local211] = (local247 * ((this.anIntArray390[local211] << 8) / local209) >> 8) - (arg5 - local234);
					}
				}
			}
		}
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
		this.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!lw", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5921;
	}

	@OriginalMember(owner = "client!lw", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort82;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!pda;Lclient!wt;II)V")
	@Override
	public void method6622(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5931 == 0) {
			return;
		}
		@Pc(16) Class51_Sub3 local16 = this.aClass13_Sub2_28.aClass51_Sub3_3;
		if (!this.aBoolean421) {
			this.method5145();
		}
		@Pc(25) Class51_Sub3 local25 = (Class51_Sub3) arg0;
		Static219.aFloat84 = local25.aFloat141 * local16.aFloat134 + local16.aFloat141 * local25.aFloat139 + local16.aFloat132 * local25.aFloat142;
		Static217.aFloat83 = local25.aFloat140 * local16.aFloat134 + local16.aFloat132 * local25.aFloat135 + local25.aFloat138 * local16.aFloat141 + local16.aFloat140;
		@Pc(72) float local72 = (float) this.aShort79 * Static219.aFloat84 + Static217.aFloat83;
		@Pc(80) float local80 = Static217.aFloat83 + Static219.aFloat84 * (float) this.aShort74;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local96 = (float) this.aShort77 + local72;
			local90 = local80 - (float) this.aShort77;
		} else {
			local90 = local72 - (float) this.aShort77;
			local96 = (float) this.aShort77 + local80;
		}
		if (this.aClass13_Sub2_28.aFloat18 <= local90 || local96 <= (float) this.aClass13_Sub2_28.anInt1099) {
			return;
		}
		Static526.aFloat164 = local16.aFloat135 + local16.aFloat142 * local25.aFloat138 + local25.aFloat135 * local16.aFloat136 + local16.aFloat137 * local25.aFloat140;
		Static257.aFloat107 = local25.aFloat142 * local16.aFloat136 + local16.aFloat142 * local25.aFloat139 + local16.aFloat137 * local25.aFloat141;
		@Pc(172) float local172 = Static526.aFloat164 + Static257.aFloat107 * (float) this.aShort79;
		@Pc(180) float local180 = Static257.aFloat107 * (float) this.aShort74 + Static526.aFloat164;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local172 > local180) {
			local195 = (float) this.aClass13_Sub2_28.anInt1089 * (local172 + (float) this.aShort77);
			local207 = (float) this.aClass13_Sub2_28.anInt1089 * (local180 - (float) this.aShort77);
		} else {
			local195 = (local180 + (float) this.aShort77) * (float) this.aClass13_Sub2_28.anInt1089;
			local207 = ((float) -this.aShort77 + local172) * (float) this.aClass13_Sub2_28.anInt1089;
		}
		if (this.aClass13_Sub2_28.aFloat24 <= local207 / (float) arg2 || local195 / (float) arg2 <= this.aClass13_Sub2_28.aFloat26) {
			return;
		}
		Static163.aFloat65 = local16.aFloat138 + local25.aFloat138 * local16.aFloat139 + local16.aFloat143 * local25.aFloat135 + local16.aFloat133 * local25.aFloat140;
		Static89.aFloat125 = local16.aFloat133 * local25.aFloat141 + local25.aFloat139 * local16.aFloat139 + local16.aFloat143 * local25.aFloat142;
		@Pc(298) float local298 = (float) this.aShort79 * Static89.aFloat125 + Static163.aFloat65;
		@Pc(306) float local306 = Static89.aFloat125 * (float) this.aShort74 + Static163.aFloat65;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local298 > local306) {
			local321 = (float) this.aClass13_Sub2_28.anInt1101 * ((float) this.aShort77 + local298);
			local333 = (local306 - (float) this.aShort77) * (float) this.aClass13_Sub2_28.anInt1101;
		} else {
			local321 = (local306 + (float) this.aShort77) * (float) this.aClass13_Sub2_28.anInt1101;
			local333 = ((float) -this.aShort77 + local298) * (float) this.aClass13_Sub2_28.anInt1101;
		}
		if (local333 / (float) arg2 >= this.aClass13_Sub2_28.aFloat27 || this.aClass13_Sub2_28.aFloat11 >= local321 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass9Array1 != null) {
			Static100.aFloat55 = local16.aFloat133 * local25.aFloat134 + local25.aFloat137 * local16.aFloat143 + local25.aFloat133 * local16.aFloat139;
			Static133.aFloat58 = local16.aFloat141 * local25.aFloat143 + local25.aFloat136 * local16.aFloat132 + local25.aFloat132 * local16.aFloat134;
			Static268.aFloat108 = local16.aFloat134 * local25.aFloat134 + local16.aFloat141 * local25.aFloat133 + local25.aFloat137 * local16.aFloat132;
			Static82.aFloat52 = local16.aFloat139 * local25.aFloat143 + local25.aFloat136 * local16.aFloat143 + local25.aFloat132 * local16.aFloat133;
			Static68.aFloat50 = local25.aFloat143 * local16.aFloat142 + local16.aFloat136 * local25.aFloat136 + local16.aFloat137 * local25.aFloat132;
			Static144.aFloat61 = local25.aFloat134 * local16.aFloat137 + local16.aFloat136 * local25.aFloat137 + local25.aFloat133 * local16.aFloat142;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.aShort76 + this.aShort78 >> 1;
			@Pc(508) int local508 = this.aShort82 + this.aShort81 >> 1;
			@Pc(527) int local527 = (int) ((float) this.aShort79 * Static257.aFloat107 + (float) local500 * Static68.aFloat50 + Static526.aFloat164 + (float) local508 * Static144.aFloat61);
			@Pc(546) int local546 = (int) ((float) this.aShort79 * Static89.aFloat125 + Static163.aFloat65 + Static82.aFloat52 * (float) local500 + Static100.aFloat55 * (float) local508);
			@Pc(565) int local565 = (int) ((float) this.aShort79 * Static219.aFloat84 + Static217.aFloat83 + (float) local500 * Static133.aFloat58 + (float) local508 * Static268.aFloat108);
			@Pc(584) int local584 = (int) (Static144.aFloat61 * (float) local508 + Static68.aFloat50 * (float) local500 + Static526.aFloat164 + Static257.aFloat107 * (float) this.aShort74);
			@Pc(603) int local603 = (int) ((float) local508 * Static100.aFloat55 + (float) local500 * Static82.aFloat52 + Static163.aFloat65 + (float) this.aShort74 * Static89.aFloat125);
			arg1.anInt10440 = this.aClass13_Sub2_28.anInt1119 + local584 * this.aClass13_Sub2_28.anInt1089 / arg2;
			arg1.anInt10439 = this.aClass13_Sub2_28.anInt1109 + local603 * this.aClass13_Sub2_28.anInt1101 / arg2;
			arg1.anInt10438 = this.aClass13_Sub2_28.anInt1109 + this.aClass13_Sub2_28.anInt1101 * local546 / arg2;
			arg1.anInt10441 = this.aClass13_Sub2_28.anInt1119 + local527 * this.aClass13_Sub2_28.anInt1089 / arg2;
			@Pc(676) int local676 = (int) ((float) local508 * Static268.aFloat108 + (float) this.aShort74 * Static219.aFloat84 + Static217.aFloat83 + (float) local500 * Static133.aFloat58);
			if (this.aClass13_Sub2_28.anInt1099 <= local565 || local676 >= this.aClass13_Sub2_28.anInt1099) {
				arg1.aBoolean758 = true;
				arg1.anInt10442 = this.aClass13_Sub2_28.anInt1119 + (local527 + this.aShort77) * this.aClass13_Sub2_28.anInt1089 / arg2 - arg1.anInt10441;
			}
		}
		this.aClass13_Sub2_28.method1054((float) arg2);
		this.aClass13_Sub2_28.method1043();
		this.aClass13_Sub2_28.method1072(local25);
		this.method5150();
		this.aClass13_Sub2_28.method1085();
		this.method5152();
	}

	@OriginalMember(owner = "client!lw", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort78;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!pda;Lclient!wt;I)V")
	@Override
	public void method6612(@OriginalArg(0) Class51 arg0, @OriginalArg(1) Class16_Sub10 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5931 == 0) {
			return;
		}
		@Pc(13) Class51_Sub3 local13 = this.aClass13_Sub2_28.aClass51_Sub3_3;
		@Pc(16) Class51_Sub3 local16 = (Class51_Sub3) arg0;
		if (!this.aBoolean421) {
			this.method5145();
		}
		Static219.aFloat84 = local13.aFloat134 * local16.aFloat141 + local16.aFloat139 * local13.aFloat141 + local13.aFloat132 * local16.aFloat142;
		Static217.aFloat83 = local13.aFloat140 + local16.aFloat138 * local13.aFloat141 + local16.aFloat135 * local13.aFloat132 + local13.aFloat134 * local16.aFloat140;
		@Pc(69) float local69 = Static217.aFloat83 + Static219.aFloat84 * (float) this.aShort79;
		@Pc(77) float local77 = Static217.aFloat83 + Static219.aFloat84 * (float) this.aShort74;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.aShort77 + local77;
			local94 = (float) this.aShort77 + local69;
		} else {
			local94 = (float) this.aShort77 + local77;
			local88 = local69 - (float) this.aShort77;
		}
		if (local88 >= this.aClass13_Sub2_28.aFloat29 || local94 <= (float) this.aClass13_Sub2_28.anInt1099) {
			return;
		}
		Static526.aFloat164 = local13.aFloat135 + local13.aFloat137 * local16.aFloat140 + local13.aFloat142 * local16.aFloat138 + local13.aFloat136 * local16.aFloat135;
		Static257.aFloat107 = local13.aFloat142 * local16.aFloat139 + local16.aFloat142 * local13.aFloat136 + local16.aFloat141 * local13.aFloat137;
		@Pc(170) float local170 = Static526.aFloat164 + Static257.aFloat107 * (float) this.aShort79;
		@Pc(178) float local178 = Static526.aFloat164 + Static257.aFloat107 * (float) this.aShort74;
		@Pc(194) float local194;
		@Pc(205) float local205;
		if (local178 < local170) {
			local205 = (float) this.aClass13_Sub2_28.anInt1089 * (local170 + (float) this.aShort77);
			local194 = (float) this.aClass13_Sub2_28.anInt1089 * ((float) -this.aShort77 + local178);
		} else {
			local194 = (float) this.aClass13_Sub2_28.anInt1089 * ((float) -this.aShort77 + local170);
			local205 = (float) this.aClass13_Sub2_28.anInt1089 * (local178 + (float) this.aShort77);
		}
		if (this.aClass13_Sub2_28.aFloat24 <= local194 / local94 || local205 / local94 <= this.aClass13_Sub2_28.aFloat26) {
			return;
		}
		Static89.aFloat125 = local13.aFloat133 * local16.aFloat141 + local13.aFloat143 * local16.aFloat142 + local16.aFloat139 * local13.aFloat139;
		Static163.aFloat65 = local13.aFloat138 + local13.aFloat133 * local16.aFloat140 + local13.aFloat139 * local16.aFloat138 + local13.aFloat143 * local16.aFloat135;
		@Pc(295) float local295 = Static89.aFloat125 * (float) this.aShort79 + Static163.aFloat65;
		@Pc(303) float local303 = (float) this.aShort74 * Static89.aFloat125 + Static163.aFloat65;
		@Pc(318) float local318;
		@Pc(329) float local329;
		if (local295 > local303) {
			local329 = ((float) this.aShort77 + local295) * (float) this.aClass13_Sub2_28.anInt1101;
			local318 = ((float) -this.aShort77 + local303) * (float) this.aClass13_Sub2_28.anInt1101;
		} else {
			local318 = (local295 - (float) this.aShort77) * (float) this.aClass13_Sub2_28.anInt1101;
			local329 = ((float) this.aShort77 + local303) * (float) this.aClass13_Sub2_28.anInt1101;
		}
		if (local318 / local94 >= this.aClass13_Sub2_28.aFloat27 || this.aClass13_Sub2_28.aFloat11 >= local329 / local94) {
			return;
		}
		if (arg1 != null || this.aClass9Array1 != null) {
			Static100.aFloat55 = local16.aFloat137 * local13.aFloat143 + local13.aFloat139 * local16.aFloat133 + local13.aFloat133 * local16.aFloat134;
			Static133.aFloat58 = local16.aFloat143 * local13.aFloat141 + local13.aFloat132 * local16.aFloat136 + local13.aFloat134 * local16.aFloat132;
			Static144.aFloat61 = local16.aFloat137 * local13.aFloat136 + local16.aFloat133 * local13.aFloat142 + local13.aFloat137 * local16.aFloat134;
			Static268.aFloat108 = local13.aFloat134 * local16.aFloat134 + local16.aFloat137 * local13.aFloat132 + local16.aFloat133 * local13.aFloat141;
			Static68.aFloat50 = local13.aFloat137 * local16.aFloat132 + local16.aFloat143 * local13.aFloat142 + local16.aFloat136 * local13.aFloat136;
			Static82.aFloat52 = local13.aFloat143 * local16.aFloat136 + local13.aFloat139 * local16.aFloat143 + local13.aFloat133 * local16.aFloat132;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.aShort76 + this.aShort78 >> 1;
			@Pc(508) int local508 = this.aShort81 + this.aShort82 >> 1;
			@Pc(527) int local527 = (int) ((float) local508 * Static144.aFloat61 + (float) local499 * Static68.aFloat50 + Static526.aFloat164 + Static257.aFloat107 * (float) this.aShort79);
			@Pc(546) int local546 = (int) (Static163.aFloat65 + (float) local499 * Static82.aFloat52 + (float) this.aShort79 * Static89.aFloat125 + (float) local508 * Static100.aFloat55);
			@Pc(565) int local565 = (int) ((float) local508 * Static268.aFloat108 + Static217.aFloat83 + (float) local499 * Static133.aFloat58 + Static219.aFloat84 * (float) this.aShort79);
			if (this.aClass13_Sub2_28.anInt1099 > local565) {
				local489 = true;
			} else {
				arg1.anInt10438 = this.aClass13_Sub2_28.anInt1109 + local546 * this.aClass13_Sub2_28.anInt1101 / local565;
				arg1.anInt10441 = this.aClass13_Sub2_28.anInt1119 + this.aClass13_Sub2_28.anInt1089 * local527 / local565;
			}
			@Pc(619) int local619 = (int) ((float) this.aShort74 * Static257.aFloat107 + (float) local499 * Static68.aFloat50 + Static526.aFloat164 + (float) local508 * Static144.aFloat61);
			@Pc(638) int local638 = (int) ((float) local508 * Static100.aFloat55 + Static163.aFloat65 + (float) local499 * Static82.aFloat52 + Static89.aFloat125 * (float) this.aShort74);
			@Pc(657) int local657 = (int) (Static268.aFloat108 * (float) local508 + (float) this.aShort74 * Static219.aFloat84 + Static133.aFloat58 * (float) local499 + Static217.aFloat83);
			if (local657 < this.aClass13_Sub2_28.anInt1099) {
				local489 = true;
			} else {
				arg1.anInt10440 = this.aClass13_Sub2_28.anInt1119 + this.aClass13_Sub2_28.anInt1089 * local619 / local657;
				arg1.anInt10439 = local638 * this.aClass13_Sub2_28.anInt1101 / local657 + this.aClass13_Sub2_28.anInt1109;
			}
			if (local489) {
				if (local565 < this.aClass13_Sub2_28.anInt1099 && local657 < this.aClass13_Sub2_28.anInt1099) {
					local491 = false;
				} else {
					@Pc(727) int local727;
					@Pc(739) int local739;
					@Pc(766) int local766;
					if (local565 < this.aClass13_Sub2_28.anInt1099) {
						local727 = (local657 - this.aClass13_Sub2_28.anInt1099 << 16) / (local657 - local565);
						local739 = local619 + (local727 * (local619 - local527) >> 16);
						arg1.anInt10441 = this.aClass13_Sub2_28.anInt1119 + local739 * this.aClass13_Sub2_28.anInt1089 / this.aClass13_Sub2_28.anInt1099;
						local766 = local638 + ((local638 - local546) * local727 >> 16);
						arg1.anInt10438 = this.aClass13_Sub2_28.anInt1109 + local766 * this.aClass13_Sub2_28.anInt1101 / this.aClass13_Sub2_28.anInt1099;
					} else if (local657 < this.aClass13_Sub2_28.anInt1099) {
						local727 = (local565 - this.aClass13_Sub2_28.anInt1099 << 16) / (local565 - local657);
						local739 = (local727 * (local527 - local619) >> 16) + local527;
						arg1.anInt10441 = this.aClass13_Sub2_28.anInt1119 + local739 * this.aClass13_Sub2_28.anInt1089 / this.aClass13_Sub2_28.anInt1099;
						local766 = (local727 * (local546 - local638) >> 16) + local546;
						arg1.anInt10438 = this.aClass13_Sub2_28.anInt1109 + this.aClass13_Sub2_28.anInt1101 * local766 / this.aClass13_Sub2_28.anInt1099;
					}
				}
			}
			if (local491) {
				if (local565 > local657) {
					arg1.anInt10442 = (this.aShort77 + local527) * this.aClass13_Sub2_28.anInt1089 / local565 + this.aClass13_Sub2_28.anInt1119 - arg1.anInt10441;
				} else {
					arg1.anInt10442 = this.aClass13_Sub2_28.anInt1089 * (local619 + this.aShort77) / local657 + this.aClass13_Sub2_28.anInt1119 - arg1.anInt10440;
				}
				arg1.aBoolean758 = true;
			}
		}
		this.aClass13_Sub2_28.method1030();
		this.aClass13_Sub2_28.method1072(local16);
		this.method5150();
		this.aClass13_Sub2_28.method1085();
		this.method5152();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6629(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static31.anInt646 = 0;
			Static219.anInt4126 = 0;
			Static334.anInt5863 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray70.length > local38) {
					local48 = this.anIntArrayArray70[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static334.anInt5863 += this.anIntArray389[local56];
						Static219.anInt4126 += this.anIntArray390[local56];
						local24++;
						Static31.anInt646 += this.anIntArray392[local56];
					}
				}
			}
			if (local24 <= 0) {
				Static31.anInt646 = local22;
				Static219.anInt4126 = local14;
				Static334.anInt5863 = local18;
			} else {
				Static334.anInt5863 = Static334.anInt5863 / local24 + local18;
				Static219.anInt4126 = Static219.anInt4126 / local24 + local14;
				Static31.anInt646 = Static31.anInt646 / local24 + local22;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local22 = arg4 << 4;
			local18 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray70.length) {
					local157 = this.anIntArrayArray70[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local50 = local157[local159];
						this.anIntArray389[local50] += local18;
						this.anIntArray390[local50] += local14;
						this.anIntArray392[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(270) int local270;
		@Pc(288) int local288;
		@Pc(746) int local746;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray70.length > local32) {
					local157 = this.anIntArrayArray70[local32];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							this.anIntArray389[local50] -= Static334.anInt5863;
							this.anIntArray390[local50] -= Static219.anInt4126;
							this.anIntArray392[local50] -= Static31.anInt646;
							if (arg4 != 0) {
								local56 = Class290.anIntArray546[arg4];
								local270 = Class290.anIntArray547[arg4];
								local288 = this.anIntArray389[local50] * local270 + local56 * this.anIntArray390[local50] + 16383 >> 14;
								this.anIntArray390[local50] = local270 * this.anIntArray390[local50] + 16383 - this.anIntArray389[local50] * local56 >> 14;
								this.anIntArray389[local50] = local288;
							}
							if (arg2 != 0) {
								local56 = Class290.anIntArray546[arg2];
								local270 = Class290.anIntArray547[arg2];
								local288 = this.anIntArray390[local50] * local270 + 16383 - this.anIntArray392[local50] * local56 >> 14;
								this.anIntArray392[local50] = local56 * this.anIntArray390[local50] + this.anIntArray392[local50] * local270 + 16383 >> 14;
								this.anIntArray390[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class290.anIntArray546[arg3];
								local270 = Class290.anIntArray547[arg3];
								local288 = local270 * this.anIntArray389[local50] + this.anIntArray392[local50] * local56 + 16383 >> 14;
								this.anIntArray392[local50] = local270 * this.anIntArray392[local50] + 16383 - this.anIntArray389[local50] * local56 >> 14;
								this.anIntArray389[local50] = local288;
							}
							this.anIntArray389[local50] += Static334.anInt5863;
							this.anIntArray390[local50] += Static219.anInt4126;
							this.anIntArray392[local50] += Static31.anInt646;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							this.anIntArray389[local50] -= Static334.anInt5863;
							this.anIntArray390[local50] -= Static219.anInt4126;
							this.anIntArray392[local50] -= Static31.anInt646;
							if (arg2 != 0) {
								local56 = Class290.anIntArray546[arg2];
								local270 = Class290.anIntArray547[arg2];
								local288 = local270 * this.anIntArray390[local50] + 16383 - local56 * this.anIntArray392[local50] >> 14;
								this.anIntArray392[local50] = local56 * this.anIntArray390[local50] + this.anIntArray392[local50] * local270 + 16383 >> 14;
								this.anIntArray390[local50] = local288;
							}
							if (arg4 != 0) {
								local56 = Class290.anIntArray546[arg4];
								local270 = Class290.anIntArray547[arg4];
								local288 = this.anIntArray389[local50] * local270 + local56 * this.anIntArray390[local50] + 16383 >> 14;
								this.anIntArray390[local50] = local270 * this.anIntArray390[local50] + 16383 - this.anIntArray389[local50] * local56 >> 14;
								this.anIntArray389[local50] = local288;
							}
							if (arg3 != 0) {
								local56 = Class290.anIntArray546[arg3];
								local270 = Class290.anIntArray547[arg3];
								local288 = local56 * this.anIntArray392[local50] + local270 * this.anIntArray389[local50] + 16383 >> 14;
								this.anIntArray392[local50] = local270 * this.anIntArray392[local50] + 16383 - this.anIntArray389[local50] * local56 >> 14;
								this.anIntArray389[local50] = local288;
							}
							this.anIntArray389[local50] += Static334.anInt5863;
							this.anIntArray390[local50] += Static219.anInt4126;
							this.anIntArray392[local50] += Static31.anInt646;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray70.length > local38) {
						local48 = this.anIntArrayArray70[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local270 = this.anIntArray391[local56];
							local288 = this.anIntArray391[local56 + 1];
							for (local746 = local270; local746 < local288; local746++) {
								@Pc(755) int local755 = this.aShortArray75[local746] - 1;
								if (local755 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local768 = Class290.anIntArray546[arg4];
									local772 = Class290.anIntArray547[arg4];
									local791 = local768 * this.aShortArray74[local755] + this.aShortArray72[local755] * local772 + 16383 >> 14;
									this.aShortArray74[local755] = (short) (this.aShortArray74[local755] * local772 + 16383 - this.aShortArray72[local755] * local768 >> 14);
									this.aShortArray72[local755] = (short) local791;
								}
								if (arg2 != 0) {
									local768 = Class290.anIntArray546[arg2];
									local772 = Class290.anIntArray547[arg2];
									local791 = local772 * this.aShortArray74[local755] + 16383 - this.aShortArray78[local755] * local768 >> 14;
									this.aShortArray78[local755] = (short) (local768 * this.aShortArray74[local755] + local772 * this.aShortArray78[local755] + 16383 >> 14);
									this.aShortArray74[local755] = (short) local791;
								}
								if (arg3 != 0) {
									local768 = Class290.anIntArray546[arg3];
									local772 = Class290.anIntArray547[arg3];
									local791 = this.aShortArray78[local755] * local768 + this.aShortArray72[local755] * local772 + 16383 >> 14;
									this.aShortArray78[local755] = (short) (this.aShortArray78[local755] * local772 + 16383 - local768 * this.aShortArray72[local755] >> 14);
									this.aShortArray72[local755] = (short) local791;
								}
							}
						}
					}
				}
				if (this.aClass352_11 == null && this.aClass352_8 != null) {
					this.aClass352_8.anInterface14_7 = null;
				}
				if (this.aClass352_11 != null) {
					this.aClass352_11.anInterface14_7 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray70.length > local32) {
					local157 = this.anIntArrayArray70[local32];
					for (local159 = 0; local159 < local157.length; local159++) {
						local50 = local157[local159];
						this.anIntArray389[local50] -= Static334.anInt5863;
						this.anIntArray390[local50] -= Static219.anInt4126;
						this.anIntArray392[local50] -= Static31.anInt646;
						this.anIntArray389[local50] = arg2 * this.anIntArray389[local50] >> 7;
						this.anIntArray390[local50] = arg3 * this.anIntArray390[local50] >> 7;
						this.anIntArray392[local50] = arg4 * this.anIntArray392[local50] >> 7;
						this.anIntArray389[local50] += Static334.anInt5863;
						this.anIntArray390[local50] += Static219.anInt4126;
						this.anIntArray392[local50] += Static31.anInt646;
					}
				}
			}
		} else {
			@Pc(1213) Class9 local1213;
			@Pc(1218) Class162 local1218;
			if (arg0 == 5) {
				if (this.anIntArrayArray69 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray69.length > local32) {
							local157 = this.anIntArrayArray69[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local50 = local157[local159];
								local56 = (this.aByteArray54[local50] & 0xFF) + arg2 * 8;
								if (local56 < 0) {
									local56 = 0;
								} else if (local56 > 255) {
									local56 = 255;
								}
								this.aByteArray54[local50] = (byte) local56;
							}
							if (local157.length > 0 && this.aClass352_8 != null) {
								this.aClass352_8.anInterface14_7 = null;
							}
						}
					}
					if (this.aClass9Array1 != null) {
						for (local32 = 0; local32 < this.anInt5916; local32++) {
							local1213 = this.aClass9Array1[local32];
							local1218 = this.aClass162Array1[local32];
							local1218.anInt4674 = 255 - (this.aByteArray54[local1213.anInt148] & 0xFF) << 24 | local1218.anInt4674 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1471) Class162 local1471;
				if (arg0 == 8) {
					if (this.anIntArrayArray68 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (this.anIntArrayArray68.length > local32) {
								local157 = this.anIntArrayArray68[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1471 = this.aClass162Array1[local157[local159]];
									local1471.anInt4676 += arg2;
									local1471.anInt4684 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray68 != null) {
						for (local24 = 0; local24 < local8; local24++) {
							local32 = arg1[local24];
							if (local32 < this.anIntArrayArray68.length) {
								local157 = this.anIntArrayArray68[local32];
								for (local159 = 0; local159 < local157.length; local159++) {
									local1471 = this.aClass162Array1[local157[local159]];
									local1471.anInt4679 = local1471.anInt4679 * arg2 >> 7;
									local1471.anInt4675 = local1471.anInt4675 * arg3 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray68 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray68.length) {
							local157 = this.anIntArrayArray68[local32];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1471 = this.aClass162Array1[local157[local159]];
								local1471.anInt4680 = arg2 + local1471.anInt4680 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray69 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray69.length > local32) {
						local157 = this.anIntArrayArray69[local32];
						for (local159 = 0; local159 < local157.length; local159++) {
							local50 = local157[local159];
							local56 = this.aShortArray79[local50] & 0xFFFF;
							local270 = local56 >> 10 & 0x3F;
							local288 = local56 >> 7 & 0x7;
							local746 = local56 & 0x7F;
							local288 += arg3 / 4;
							@Pc(1315) int local1315 = arg2 + local270 & 0x3F;
							local746 += arg4;
							if (local288 < 0) {
								local288 = 0;
							} else if (local288 > 7) {
								local288 = 7;
							}
							if (local746 < 0) {
								local746 = 0;
							} else if (local746 > 127) {
								local746 = 127;
							}
							this.aShortArray79[local50] = (short) (local1315 << 10 | local288 << 7 | local746);
						}
						if (local157.length > 0 && this.aClass352_8 != null) {
							this.aClass352_8.anInterface14_7 = null;
						}
					}
				}
				if (this.aClass9Array1 != null) {
					for (local32 = 0; local32 < this.anInt5916; local32++) {
						local1213 = this.aClass9Array1[local32];
						local1218 = this.aClass162Array1[local32];
						local1218.anInt4674 = Static347.anIntArray701[this.aShortArray79[local1213.anInt148] & 0xFFFF] & 0xFFFFFF | local1218.anInt4674 & 0xFF000000;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean420;
	}

	@OriginalMember(owner = "client!lw", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort75;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IJLclient!lga;IFZFIII)S")
	private short method5141(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class212 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) int local10 = this.anIntArray391[arg8];
		@Pc(17) int local17 = this.anIntArray391[arg8 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray75[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static599.aLongArray15[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray75[local19] = (short) (this.anInt5931 + 1);
		Static599.aLongArray15[local19] = arg1;
		this.aShortArray72[this.anInt5931] = (short) arg7;
		this.aShortArray74[this.anInt5931] = (short) arg3;
		this.aShortArray78[this.anInt5931] = (short) arg6;
		this.aByteArray55[this.anInt5931] = (byte) arg0;
		this.aFloatArray48[this.anInt5931] = arg5;
		this.aFloatArray47[this.anInt5931] = arg4;
		return (short) this.anInt5931++;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class193 method6609(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class193_Sub1 local12;
		@Pc(16) Class193_Sub1 local16;
		if (arg0 == 1) {
			local12 = this.aClass13_Sub2_28.aClass193_Sub1_9;
			local16 = this.aClass13_Sub2_28.aClass193_Sub1_7;
		} else if (arg0 == 2) {
			local12 = this.aClass13_Sub2_28.aClass193_Sub1_2;
			local16 = this.aClass13_Sub2_28.aClass193_Sub1_4;
		} else if (arg0 == 3) {
			local12 = this.aClass13_Sub2_28.aClass193_Sub1_5;
			local16 = this.aClass13_Sub2_28.aClass193_Sub1_10;
		} else if (arg0 == 4) {
			local12 = this.aClass13_Sub2_28.aClass193_Sub1_1;
			local16 = this.aClass13_Sub2_28.aClass193_Sub1_3;
		} else if (arg0 == 5) {
			local12 = this.aClass13_Sub2_28.aClass193_Sub1_6;
			local16 = this.aClass13_Sub2_28.aClass193_Sub1_8;
		} else {
			local12 = local16 = new Class193_Sub1(this.aClass13_Sub2_28);
		}
		return this.method5153(local12, local16, arg0 != 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6611(@OriginalArg(0) Class193 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class193_Sub1 local8 = (Class193_Sub1) arg0;
		if (this.anInt5915 == 0 || local8.anInt5915 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt5943;
		@Pc(21) int[] local21 = local8.anIntArray389;
		@Pc(24) int[] local24 = local8.anIntArray390;
		@Pc(27) int[] local27 = local8.anIntArray392;
		@Pc(30) short[] local30 = local8.aShortArray72;
		@Pc(33) short[] local33 = local8.aShortArray74;
		@Pc(36) short[] local36 = local8.aShortArray78;
		@Pc(39) byte[] local39 = local8.aByteArray55;
		@Pc(54) short[] local54;
		@Pc(46) short[] local46;
		@Pc(50) short[] local50;
		@Pc(58) byte[] local58;
		if (this.aClass315_1 == null) {
			local50 = null;
			local54 = null;
			local58 = null;
			local46 = null;
		} else {
			local46 = this.aClass315_1.aShortArray129;
			local50 = this.aClass315_1.aShortArray127;
			local54 = this.aClass315_1.aShortArray128;
			local58 = this.aClass315_1.aByteArray88;
		}
		@Pc(73) short[] local73;
		@Pc(79) short[] local79;
		@Pc(75) short[] local75;
		@Pc(77) byte[] local77;
		if (local8.aClass315_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local73 = local8.aClass315_1.aShortArray128;
			local79 = local8.aClass315_1.aShortArray129;
			local77 = local8.aClass315_1.aByteArray88;
			local75 = local8.aClass315_1.aShortArray127;
		}
		@Pc(100) int[] local100 = local8.anIntArray391;
		@Pc(103) short[] local103 = local8.aShortArray75;
		if (!local8.aBoolean421) {
			local8.method5145();
		}
		@Pc(112) short local112 = local8.aShort79;
		@Pc(115) short local115 = local8.aShort74;
		@Pc(118) short local118 = local8.aShort78;
		@Pc(121) short local121 = local8.aShort76;
		@Pc(124) short local124 = local8.aShort81;
		@Pc(127) short local127 = local8.aShort82;
		for (@Pc(129) int local129 = 0; local129 < this.anInt5943; local129++) {
			@Pc(139) int local139 = this.anIntArray390[local129] - arg2;
			if (local112 <= local139 && local139 <= local115) {
				@Pc(159) int local159 = this.anIntArray389[local129] - arg1;
				if (local118 <= local159 && local121 >= local159) {
					@Pc(179) int local179 = this.anIntArray392[local129] - arg3;
					if (local179 >= local124 && local179 <= local127) {
						@Pc(193) int local193 = -1;
						@Pc(198) int local198 = this.anIntArray391[local129];
						@Pc(205) int local205 = this.anIntArray391[local129 + 1];
						for (@Pc(207) int local207 = local198; local207 < local205; local207++) {
							local193 = this.aShortArray75[local207] - 1;
							if (local193 == -1 || this.aByteArray55[local193] != 0) {
								break;
							}
						}
						if (local193 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local18; local241++) {
								if (local159 == local21[local241] && local179 == local27[local241] && local24[local241] == local139) {
									@Pc(264) int local264 = -1;
									local205 = local100[local241 + 1];
									local198 = local100[local241];
									for (@Pc(276) int local276 = local198; local276 < local205; local276++) {
										local264 = local103[local276] - 1;
										if (local264 == -1 || local39[local264] != 0) {
											break;
										}
									}
									if (local264 != -1) {
										if (local54 == null) {
											this.aClass315_1 = new Class315();
											local54 = this.aClass315_1.aShortArray128 = Static58.method1307(this.aShortArray72);
											local46 = this.aClass315_1.aShortArray129 = Static58.method1307(this.aShortArray74);
											local50 = this.aClass315_1.aShortArray127 = Static58.method1307(this.aShortArray78);
											local58 = this.aClass315_1.aByteArray88 = Static522.method7264(this.aByteArray55);
										}
										if (local73 == null) {
											@Pc(355) Class315 local355 = local8.aClass315_1 = new Class315();
											local73 = local355.aShortArray128 = Static58.method1307(local30);
											local79 = local355.aShortArray129 = Static58.method1307(local33);
											local75 = local355.aShortArray127 = Static58.method1307(local36);
											local77 = local355.aByteArray88 = Static522.method7264(local39);
										}
										@Pc(388) short local388 = this.aShortArray72[local193];
										@Pc(393) short local393 = this.aShortArray74[local193];
										@Pc(398) short local398 = this.aShortArray78[local193];
										@Pc(403) byte local403 = this.aByteArray55[local193];
										local198 = local100[local241];
										local205 = local100[local241 + 1];
										@Pc(423) int local423;
										for (@Pc(415) int local415 = local198; local415 < local205; local415++) {
											local423 = local103[local415] - 1;
											if (local423 == -1) {
												break;
											}
											if (local77[local423] != 0) {
												local73[local423] += local388;
												local79[local423] += local393;
												local75[local423] += local398;
												local77[local423] += local403;
											}
										}
										local205 = this.anIntArray391[local129 + 1];
										local403 = local39[local264];
										local198 = this.anIntArray391[local129];
										local393 = local33[local264];
										local398 = local36[local264];
										local388 = local30[local264];
										for (local423 = local198; local423 < local205; local423++) {
											@Pc(512) int local512 = this.aShortArray75[local423] - 1;
											if (local512 == -1) {
												break;
											}
											if (local58[local512] != 0) {
												local54[local512] += local388;
												local46[local512] += local393;
												local50[local512] += local398;
												local58[local512] += local403;
											}
										}
										if (this.aClass352_11 == null && this.aClass352_8 != null) {
											this.aClass352_8.anInterface14_7 = null;
										}
										if (this.aClass352_11 != null) {
											this.aClass352_11.anInterface14_7 = null;
										}
										if (local8.aClass352_11 == null && local8.aClass352_8 != null) {
											local8.aClass352_8.anInterface14_7 = null;
										}
										if (local8.aClass352_11 != null) {
											local8.aClass352_11.anInterface14_7 = null;
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

	@OriginalMember(owner = "client!lw", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5943; local7++) {
			if (arg0 != 0) {
				this.anIntArray389[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray390[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray392[local7] += arg2;
			}
		}
		this.aBoolean421 = false;
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!pda;IZ)V")
	@Override
	public void method6627(@OriginalArg(0) Class51 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray82 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5943; local14++) {
			if ((this.aShortArray82[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method6713(this.anIntArray389[local14], this.anIntArray390[local14], this.anIntArray392[local14], local12);
				} else {
					arg0.method6706(this.anIntArray389[local14], this.anIntArray390[local14], this.anIntArray392[local14], local12);
				}
				this.anIntArray389[local14] = local12[0];
				this.anIntArray390[local14] = local12[1];
				this.anIntArray392[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort73;
	}

	@OriginalMember(owner = "client!lw", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
		}
		this.aShort75 = (short) arg0;
		if (this.aClass352_11 != null) {
			this.aClass352_11.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5943; local15++) {
			@Pc(34) int local34 = this.anIntArray390[local15] * local13 - this.anIntArray392[local15] * local9 >> 14;
			this.anIntArray392[local15] = this.anIntArray392[local15] * local13 + this.anIntArray390[local15] * local9 >> 14;
			this.anIntArray390[local15] = local34;
		}
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
		this.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!lw", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort79;
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "()V")
	@Override
	protected void method6620() {
	}

	@OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
	private void method5143() {
		if (!this.aBoolean422) {
			return;
		}
		this.aBoolean422 = false;
		if (this.aClass287Array3 == null && this.aClass156Array3 == null && this.aClass9Array1 == null) {
			if (this.anIntArray389 != null && !Static632.method7092(this.anInt5947, this.anInt5921)) {
				if (this.aClass352_9 != null && this.aClass352_9.anInterface14_7 == null) {
					this.aBoolean422 = true;
				} else {
					if (!this.aBoolean421) {
						this.method5145();
					}
					this.anIntArray389 = null;
				}
			}
			if (this.anIntArray390 != null && !Static89.method6068(this.anInt5947, this.anInt5921)) {
				if (this.aClass352_9 != null && this.aClass352_9.anInterface14_7 == null) {
					this.aBoolean422 = true;
				} else {
					if (!this.aBoolean421) {
						this.method5145();
					}
					this.anIntArray390 = null;
				}
			}
			if (this.anIntArray392 != null && !Static551.method7587(this.anInt5921, this.anInt5947)) {
				if (this.aClass352_9 != null && this.aClass352_9.anInterface14_7 == null) {
					this.aBoolean422 = true;
				} else {
					if (!this.aBoolean421) {
						this.method5145();
					}
					this.anIntArray392 = null;
				}
			}
		}
		if (this.aShortArray75 != null && this.anIntArray389 == null && this.anIntArray390 == null && this.anIntArray392 == null) {
			this.anIntArray391 = null;
			this.aShortArray75 = null;
		}
		if (this.aByteArray55 != null && !Static87.method1820(this.anInt5921, this.anInt5947)) {
			if (this.aClass352_11 == null) {
				if (this.aClass352_8 != null && this.aClass352_8.anInterface14_7 == null) {
					this.aBoolean422 = true;
				} else {
					this.aShortArray72 = this.aShortArray74 = this.aShortArray78 = null;
					this.aByteArray55 = null;
				}
			} else if (this.aClass352_11.anInterface14_7 == null) {
				this.aBoolean422 = true;
			} else {
				this.aShortArray72 = this.aShortArray74 = this.aShortArray78 = null;
				this.aByteArray55 = null;
			}
		}
		if (this.aShortArray79 != null && !Static151.method2657(this.anInt5921, this.anInt5947)) {
			if (this.aClass352_8 != null && this.aClass352_8.anInterface14_7 == null) {
				this.aBoolean422 = true;
			} else {
				this.aShortArray79 = null;
			}
		}
		if (this.aByteArray54 != null && !Static301.method4749(this.anInt5921, this.anInt5947)) {
			if (this.aClass352_8 != null && this.aClass352_8.anInterface14_7 == null) {
				this.aBoolean422 = true;
			} else {
				this.aByteArray54 = null;
			}
		}
		if (this.aFloatArray48 != null && !Static393.method5807(this.anInt5921, this.anInt5947)) {
			if (this.aClass352_10 != null && this.aClass352_10.anInterface14_7 == null) {
				this.aBoolean422 = true;
			} else {
				this.aFloatArray48 = this.aFloatArray47 = null;
			}
		}
		if (this.aShortArray73 != null && !Static78.method1682(this.anInt5947, this.anInt5921)) {
			if (this.aClass352_8 != null && this.aClass352_8.anInterface14_7 == null) {
				this.aBoolean422 = true;
			} else {
				this.aShortArray73 = null;
			}
		}
		if (this.aShortArray76 != null && !Static588.method8332(this.anInt5947, this.anInt5921)) {
			if ((this.aClass28_1 == null || this.aClass28_1.anInterface7_1 != null) && (this.aClass352_8 == null || this.aClass352_8.anInterface14_7 != null)) {
				this.aShortArray76 = this.aShortArray81 = this.aShortArray77 = null;
			} else {
				this.aBoolean422 = true;
			}
		}
		if (this.anIntArrayArray69 != null && !Static259.method4299(this.anInt5947, this.anInt5921)) {
			this.anIntArrayArray69 = null;
			this.aShortArray80 = null;
		}
		if (this.anIntArrayArray70 != null && !Static171.method2970(this.anInt5947, this.anInt5921)) {
			this.aShortArray82 = null;
			this.anIntArrayArray70 = null;
		}
		if (this.anIntArrayArray68 != null && !Static216.method3555(this.anInt5947, this.anInt5921)) {
			this.anIntArrayArray68 = null;
		}
		if (this.anIntArray393 != null && (this.anInt5921 & 0x800) == 0 && (this.anInt5921 & 0x40000) == 0) {
			this.anIntArray393 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5915; local3++) {
			if (arg0 == this.aShortArray79[local3]) {
				this.aShortArray79[local3] = arg1;
			}
		}
		if (this.aClass9Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5916; local34++) {
				@Pc(41) Class9 local41 = this.aClass9Array1[local34];
				@Pc(46) Class162 local46 = this.aClass162Array1[local34];
				local46.anInt4674 = Static347.anIntArray701[this.aShortArray79[local41.anInt148] & 0xFFFF] & 0xFFFFFF | local46.anInt4674 & 0xFF000000;
			}
		}
		if (this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort80;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZLclient!uu;)V")
	private void method5144(@OriginalArg(1) Class2_Sub7_Sub17_Sub1 arg0) {
		if (this.anInt5931 > this.aClass13_Sub2_28.anIntArray65.length) {
			this.aClass13_Sub2_28.anIntArray66 = new int[this.anInt5931];
			this.aClass13_Sub2_28.anIntArray65 = new int[this.anInt5931];
		}
		@Pc(34) int[] local34 = this.aClass13_Sub2_28.anIntArray65;
		@Pc(38) int[] local38 = this.aClass13_Sub2_28.anIntArray66;
		@Pc(67) int local67;
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (@Pc(40) int local40 = 0; local40 < this.anInt5943; local40++) {
			local67 = (this.anIntArray389[local40] - (this.aClass13_Sub2_28.anInt1112 * this.anIntArray390[local40] >> 8) >> this.aClass13_Sub2_28.anInt1075) - arg0.anInt9888;
			@Pc(90) int local90 = (this.anIntArray392[local40] - (this.aClass13_Sub2_28.anInt1092 * this.anIntArray390[local40] >> 8) >> this.aClass13_Sub2_28.anInt1075) - arg0.anInt9887;
			@Pc(95) int local95 = this.anIntArray391[local40];
			@Pc(102) int local102 = this.anIntArray391[local40 + 1];
			for (local104 = local95; local104 < local102; local104++) {
				local113 = this.aShortArray75[local104] - 1;
				if (local113 == -1) {
					break;
				}
				local34[local113] = local67;
				local38[local113] = local90;
			}
		}
		for (local67 = 0; local67 < this.anInt5912; local67++) {
			if (this.aByteArray54 == null || this.aByteArray54[local67] <= 128) {
				@Pc(156) short local156 = this.aShortArray76[local67];
				@Pc(161) short local161 = this.aShortArray81[local67];
				@Pc(166) short local166 = this.aShortArray77[local67];
				local104 = local34[local156];
				local113 = local34[local161];
				@Pc(178) int local178 = local34[local166];
				@Pc(182) int local182 = local38[local156];
				@Pc(186) int local186 = local38[local161];
				@Pc(190) int local190 = local38[local166];
				if ((local104 - local113) * (local186 - local190) - (local178 - local113) * (local186 + -local182) > 0) {
					arg0.method8388(local113, local178, local186, local190, local104, local182);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub7_Sub17 ba(@OriginalArg(0) Class2_Sub7_Sub17 arg0) {
		if (this.anInt5931 == 0) {
			return null;
		}
		if (!this.aBoolean421) {
			this.method5145();
		}
		@Pc(40) int local40;
		@Pc(56) int local56;
		if (this.aClass13_Sub2_28.anInt1112 <= 0) {
			local40 = this.aShort78 - (this.aClass13_Sub2_28.anInt1112 * this.aShort79 >> 8) >> this.aClass13_Sub2_28.anInt1075;
			local56 = this.aShort76 - (this.aShort74 * this.aClass13_Sub2_28.anInt1112 >> 8) >> this.aClass13_Sub2_28.anInt1075;
		} else {
			local40 = this.aShort78 - (this.aShort74 * this.aClass13_Sub2_28.anInt1112 >> 8) >> this.aClass13_Sub2_28.anInt1075;
			local56 = this.aShort76 - (this.aShort79 * this.aClass13_Sub2_28.anInt1112 >> 8) >> this.aClass13_Sub2_28.anInt1075;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass13_Sub2_28.anInt1092 > 0) {
			local116 = this.aShort81 - (this.aShort74 * this.aClass13_Sub2_28.anInt1092 >> 8) >> this.aClass13_Sub2_28.anInt1075;
			local133 = this.aShort82 - (this.aClass13_Sub2_28.anInt1092 * this.aShort79 >> 8) >> this.aClass13_Sub2_28.anInt1075;
		} else {
			local116 = this.aShort81 - (this.aShort79 * this.aClass13_Sub2_28.anInt1092 >> 8) >> this.aClass13_Sub2_28.anInt1075;
			local133 = this.aShort82 - (this.aClass13_Sub2_28.anInt1092 * this.aShort74 >> 8) >> this.aClass13_Sub2_28.anInt1075;
		}
		@Pc(175) int local175 = local56 + 1 - local40;
		@Pc(181) int local181 = local133 + 1 - local116;
		@Pc(184) Class2_Sub7_Sub17_Sub1 local184 = (Class2_Sub7_Sub17_Sub1) arg0;
		@Pc(200) Class2_Sub7_Sub17_Sub1 local200;
		if (local184 != null && local184.method8391(local175, local181)) {
			local200 = local184;
			local184.method8389();
		} else {
			local200 = new Class2_Sub7_Sub17_Sub1(this.aClass13_Sub2_28, local175, local181);
		}
		local200.method8392(local56, local116, local40, local133);
		this.method5144(local200);
		return local200;
	}

	@OriginalMember(owner = "client!lw", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort73 = (short) arg0;
		if (this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static334.anInt5863 = 0;
			Static31.anInt646 = 0;
			Static219.anInt4126 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt5943; local17++) {
				Static334.anInt5863 += this.anIntArray389[local17];
				Static219.anInt4126 += this.anIntArray390[local17];
				Static31.anInt646 += this.anIntArray392[local17];
				local15++;
			}
			if (local15 <= 0) {
				Static31.anInt646 = arg3;
				Static334.anInt5863 = arg1;
				Static219.anInt4126 = arg2;
			} else {
				Static219.anInt4126 = Static219.anInt4126 / local15 + arg2;
				Static334.anInt5863 = arg1 + Static334.anInt5863 / local15;
				Static31.anInt646 = arg3 + Static31.anInt646 / local15;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt5943; local15++) {
				this.anIntArray389[local15] += arg1;
				this.anIntArray390[local15] += arg2;
				this.anIntArray392[local15] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(188) int local188;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt5943; local15++) {
					this.anIntArray389[local15] -= Static334.anInt5863;
					this.anIntArray390[local15] -= Static219.anInt4126;
					this.anIntArray392[local15] -= Static31.anInt646;
					if (arg3 != 0) {
						local17 = Class290.anIntArray546[arg3];
						local170 = Class290.anIntArray547[arg3];
						local188 = local17 * this.anIntArray390[local15] + local170 * this.anIntArray389[local15] + 16383 >> 14;
						this.anIntArray390[local15] = local170 * this.anIntArray390[local15] + 16383 - this.anIntArray389[local15] * local17 >> 14;
						this.anIntArray389[local15] = local188;
					}
					if (arg1 != 0) {
						local17 = Class290.anIntArray546[arg1];
						local170 = Class290.anIntArray547[arg1];
						local188 = local170 * this.anIntArray390[local15] + 16383 - this.anIntArray392[local15] * local17 >> 14;
						this.anIntArray392[local15] = local17 * this.anIntArray390[local15] + this.anIntArray392[local15] * local170 + 16383 >> 14;
						this.anIntArray390[local15] = local188;
					}
					if (arg2 != 0) {
						local17 = Class290.anIntArray546[arg2];
						local170 = Class290.anIntArray547[arg2];
						local188 = this.anIntArray389[local15] * local170 + local17 * this.anIntArray392[local15] + 16383 >> 14;
						this.anIntArray392[local15] = this.anIntArray392[local15] * local170 + 16383 - this.anIntArray389[local15] * local17 >> 14;
						this.anIntArray389[local15] = local188;
					}
					this.anIntArray389[local15] += Static334.anInt5863;
					this.anIntArray390[local15] += Static219.anInt4126;
					this.anIntArray392[local15] += Static31.anInt646;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt5943; local15++) {
					this.anIntArray389[local15] -= Static334.anInt5863;
					this.anIntArray390[local15] -= Static219.anInt4126;
					this.anIntArray392[local15] -= Static31.anInt646;
					this.anIntArray389[local15] = this.anIntArray389[local15] * arg1 / 128;
					this.anIntArray390[local15] = arg2 * this.anIntArray390[local15] / 128;
					this.anIntArray392[local15] = this.anIntArray392[local15] * arg3 / 128;
					this.anIntArray389[local15] += Static334.anInt5863;
					this.anIntArray390[local15] += Static219.anInt4126;
					this.anIntArray392[local15] += Static31.anInt646;
				}
			} else {
				@Pc(522) Class9 local522;
				@Pc(527) Class162 local527;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt5915; local15++) {
						local17 = arg1 * 8 + (this.aByteArray54[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray54[local15] = (byte) local17;
					}
					if (this.aClass352_8 != null) {
						this.aClass352_8.anInterface14_7 = null;
					}
					if (this.aClass9Array1 != null) {
						for (local17 = 0; local17 < this.anInt5916; local17++) {
							local522 = this.aClass9Array1[local17];
							local527 = this.aClass162Array1[local17];
							local527.anInt4674 = local527.anInt4674 & 0xFFFFFF | 255 - (this.aByteArray54[local522.anInt148] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt5915; local15++) {
						local17 = this.aShortArray79[local15] & 0xFFFF;
						local170 = local17 >> 10 & 0x3F;
						local188 = local17 >> 7 & 0x7;
						@Pc(588) int local588 = arg1 + local170 & 0x3F;
						@Pc(592) int local592 = local17 & 0x7F;
						local188 += arg2 / 4;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 > 7) {
							local188 = 7;
						}
						local592 += arg3;
						if (local592 < 0) {
							local592 = 0;
						} else if (local592 > 127) {
							local592 = 127;
						}
						this.aShortArray79[local15] = (short) (local592 | local188 << 7 | local588 << 10);
					}
					if (this.aClass352_8 != null) {
						this.aClass352_8.anInterface14_7 = null;
					}
					if (this.aClass9Array1 != null) {
						for (local17 = 0; local17 < this.anInt5916; local17++) {
							local522 = this.aClass9Array1[local17];
							local527 = this.aClass162Array1[local17];
							local527.anInt4674 = local527.anInt4674 & 0xFF000000 | Static347.anIntArray701[this.aShortArray79[local522.anInt148] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(716) Class162 local716;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt5916; local15++) {
							local716 = this.aClass162Array1[local15];
							local716.anInt4676 += arg1;
							local716.anInt4684 += arg2;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt5916; local15++) {
							local716 = this.aClass162Array1[local15];
							local716.anInt4679 = arg1 * local716.anInt4679 >> 7;
							local716.anInt4675 = arg2 * local716.anInt4675 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt5916; local15++) {
							local716 = this.aClass162Array1[local15];
							local716.anInt4680 = arg1 + local716.anInt4680 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static31.anInt646 = 0;
			Static219.anInt4126 = 0;
			Static334.anInt5863 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray70.length > local41) {
					local51 = this.anIntArrayArray70[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local59]) != 0) {
							Static334.anInt5863 += this.anIntArray389[local59];
							Static219.anInt4126 += this.anIntArray390[local59];
							local33++;
							Static31.anInt646 += this.anIntArray392[local59];
						}
					}
				}
			}
			if (local33 > 0) {
				Static334.anInt5863 = arg2 + Static334.anInt5863 / local33;
				Static219.anInt4126 = arg3 + Static219.anInt4126 / local33;
				Static497.aBoolean562 = true;
				Static31.anInt646 = Static31.anInt646 / local33 + arg4;
			} else {
				Static334.anInt5863 = arg2;
				Static219.anInt4126 = arg3;
				Static31.anInt646 = arg4;
			}
			return;
		}
		@Pc(245) int[] local245;
		@Pc(247) int local247;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg7[5] * arg4 + arg3 * arg7[4] + arg7[3] * arg2 + 8192 >> 14;
				local41 = arg7[7] * arg3 + arg2 * arg7[6] + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local35;
				arg2 = local33;
				arg4 = local41;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray70.length > local35) {
					local245 = this.anIntArrayArray70[local35];
					for (local247 = 0; local247 < local245.length; local247++) {
						local53 = local245[local247];
						if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local53]) != 0) {
							this.anIntArray389[local53] += arg2;
							this.anIntArray390[local53] += arg3;
							this.anIntArray392[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(370) int local370;
		@Pc(392) int local392;
		@Pc(418) int local418;
		@Pc(449) int local449;
		@Pc(453) int local453;
		@Pc(457) int local457;
		@Pc(461) int local461;
		@Pc(469) int local469;
		@Pc(477) int local477;
		@Pc(630) int local630;
		@Pc(655) int local655;
		@Pc(659) int local659;
		@Pc(668) int local668;
		@Pc(673) int local673;
		@Pc(677) int local677;
		@Pc(681) int local681;
		@Pc(683) int local683;
		@Pc(814) int[] local814;
		@Pc(816) int local816;
		@Pc(820) int local820;
		@Pc(824) int local824;
		@Pc(826) int local826;
		@Pc(954) int local954;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray70.length > local35) {
						local245 = this.anIntArrayArray70[local35];
						for (local247 = 0; local247 < local245.length; local247++) {
							local53 = local245[local247];
							if (this.aShortArray82 == null || (this.aShortArray82[local53] & arg6) != 0) {
								this.anIntArray389[local53] -= Static334.anInt5863;
								this.anIntArray390[local53] -= Static219.anInt4126;
								this.anIntArray392[local53] -= Static31.anInt646;
								if (arg4 != 0) {
									local59 = Class290.anIntArray546[arg4];
									local370 = Class290.anIntArray547[arg4];
									local392 = this.anIntArray390[local53] * local59 + local370 * this.anIntArray389[local53] + 16383 >> 14;
									this.anIntArray390[local53] = this.anIntArray390[local53] * local370 + 16383 - this.anIntArray389[local53] * local59 >> 14;
									this.anIntArray389[local53] = local392;
								}
								if (arg2 != 0) {
									local59 = Class290.anIntArray546[arg2];
									local370 = Class290.anIntArray547[arg2];
									local392 = this.anIntArray390[local53] * local370 + 16383 - local59 * this.anIntArray392[local53] >> 14;
									this.anIntArray392[local53] = this.anIntArray392[local53] * local370 + this.anIntArray390[local53] * local59 + 16383 >> 14;
									this.anIntArray390[local53] = local392;
								}
								if (arg3 != 0) {
									local59 = Class290.anIntArray546[arg3];
									local370 = Class290.anIntArray547[arg3];
									local392 = this.anIntArray392[local53] * local59 + this.anIntArray389[local53] * local370 + 16383 >> 14;
									this.anIntArray392[local53] = this.anIntArray392[local53] * local370 + 16383 - local59 * this.anIntArray389[local53] >> 14;
									this.anIntArray389[local53] = local392;
								}
								this.anIntArray389[local53] += Static334.anInt5863;
								this.anIntArray390[local53] += Static219.anInt4126;
								this.anIntArray392[local53] += Static31.anInt646;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray70.length > local41) {
							local51 = this.anIntArrayArray70[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray82 == null || (arg6 & this.aShortArray82[local59]) != 0) {
									local370 = this.anIntArray391[local59];
									local392 = this.anIntArray391[local59 + 1];
									for (local418 = local370; local418 < local392; local418++) {
										local449 = this.aShortArray75[local418] - 1;
										if (local449 == -1) {
											break;
										}
										if (arg4 != 0) {
											local453 = Class290.anIntArray546[arg4];
											local457 = Class290.anIntArray547[arg4];
											local461 = this.aShortArray74[local449] * local453 + local457 * this.aShortArray72[local449] + 16383 >> 14;
											this.aShortArray74[local449] = (short) (local457 * this.aShortArray74[local449] + 16383 - this.aShortArray72[local449] * local453 >> 14);
											this.aShortArray72[local449] = (short) local461;
										}
										if (arg2 != 0) {
											local453 = Class290.anIntArray546[arg2];
											local457 = Class290.anIntArray547[arg2];
											local461 = local457 * this.aShortArray74[local449] + 16383 - local453 * this.aShortArray78[local449] >> 14;
											this.aShortArray78[local449] = (short) (local453 * this.aShortArray74[local449] + local457 * this.aShortArray78[local449] + 16383 >> 14);
											this.aShortArray74[local449] = (short) local461;
										}
										if (arg3 != 0) {
											local453 = Class290.anIntArray546[arg3];
											local457 = Class290.anIntArray547[arg3];
											local461 = local457 * this.aShortArray72[local449] + local453 * this.aShortArray78[local449] + 16383 >> 14;
											this.aShortArray78[local449] = (short) (this.aShortArray78[local449] * local457 + 16383 - local453 * this.aShortArray72[local449] >> 14);
											this.aShortArray72[local449] = (short) local461;
										}
									}
								}
							}
						}
					}
					if (this.aClass352_11 == null && this.aClass352_8 != null) {
						this.aClass352_8.anInterface14_7 = null;
					}
					if (this.aClass352_11 != null) {
						this.aClass352_11.anInterface14_7 = null;
					}
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local247 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static497.aBoolean562) {
					local370 = Static334.anInt5863 * arg7[0] + Static219.anInt4126 * arg7[3] + Static31.anInt646 * arg7[6] + 8192 >> 14;
					local392 = arg7[7] * Static31.anInt646 + arg7[1] * Static334.anInt5863 + Static219.anInt4126 * arg7[4] + 8192 >> 14;
					local370 += local247;
					local418 = Static219.anInt4126 * arg7[5] + Static334.anInt5863 * arg7[2] + arg7[8] * Static31.anInt646 + 8192 >> 14;
					local392 += local53;
					Static334.anInt5863 = local370;
					local418 += local59;
					Static219.anInt4126 = local392;
					Static31.anInt646 = local418;
					Static497.aBoolean562 = false;
				}
				@Pc(437) int[] local437 = new int[9];
				local392 = Class290.anIntArray547[arg2];
				local418 = Class290.anIntArray546[arg2];
				local449 = Class290.anIntArray547[arg3];
				local453 = Class290.anIntArray546[arg3];
				local457 = Class290.anIntArray547[arg4];
				local461 = Class290.anIntArray546[arg4];
				local469 = local457 * local418 + 8192 >> 14;
				local477 = local418 * local461 + 8192 >> 14;
				local437[6] = local477 * local449 + -local453 * local457 + 8192 >> 14;
				local437[1] = local469 * local453 + local461 * -local449 + 8192 >> 14;
				local437[7] = local453 * local461 + local449 * local469 + 8192 >> 14;
				local437[2] = local392 * local453 + 8192 >> 14;
				local437[4] = local457 * local392 + 8192 >> 14;
				local437[5] = -local418;
				local437[3] = local392 * local461 + 8192 >> 14;
				local437[0] = local453 * local477 + local457 * local449 + 8192 >> 14;
				local437[8] = local449 * local392 + 8192 >> 14;
				@Pc(605) int local605 = local437[2] * -Static31.anInt646 + -Static219.anInt4126 * local437[1] + local437[0] * -Static334.anInt5863 + 8192 >> 14;
				local630 = -Static31.anInt646 * local437[5] + -Static334.anInt5863 * local437[3] + local437[4] * -Static219.anInt4126 + 8192 >> 14;
				local655 = -Static334.anInt5863 * local437[6] + local437[7] * -Static219.anInt4126 + local437[8] * -Static31.anInt646 + 8192 >> 14;
				local659 = Static334.anInt5863 + local605;
				@Pc(664) int local664 = local630 + Static219.anInt4126;
				local668 = Static31.anInt646 + local655;
				@Pc(671) int[] local671 = new int[9];
				for (local673 = 0; local673 < 3; local673++) {
					for (local677 = 0; local677 < 3; local677++) {
						local681 = 0;
						for (local683 = 0; local683 < 3; local683++) {
							local681 += local437[local673 * 3 + local683] * arg7[local677 * 3 + local683];
						}
						local671[local673 * 3 + local677] = local681 + 8192 >> 14;
					}
				}
				local677 = local53 * local437[1] + local247 * local437[0] + local59 * local437[2] + 8192 >> 14;
				local681 = local59 * local437[5] + local437[4] * local53 + local247 * local437[3] + 8192 >> 14;
				local681 += local664;
				local677 += local659;
				local683 = local59 * local437[8] + local247 * local437[6] + local437[7] * local53 + 8192 >> 14;
				local683 += local668;
				local814 = new int[9];
				for (local816 = 0; local816 < 3; local816++) {
					for (local820 = 0; local820 < 3; local820++) {
						local824 = 0;
						for (local826 = 0; local826 < 3; local826++) {
							local824 += arg7[local816 * 3 + local826] * local671[local820 + local826 * 3];
						}
						local814[local820 + local816 * 3] = local824 + 8192 >> 14;
					}
				}
				local820 = arg7[0] * local677 + arg7[1] * local681 + arg7[2] * local683 + 8192 >> 14;
				local824 = arg7[3] * local677 + arg7[4] * local681 + arg7[5] * local683 + 8192 >> 14;
				local824 += local35;
				local826 = local683 * arg7[8] + local681 * arg7[7] + arg7[6] * local677 + 8192 >> 14;
				local820 += local33;
				local826 += local41;
				for (local954 = 0; local954 < local8; local954++) {
					@Pc(960) int local960 = arg1[local954];
					if (this.anIntArrayArray70.length > local960) {
						@Pc(970) int[] local970 = this.anIntArrayArray70[local960];
						for (@Pc(972) int local972 = 0; local972 < local970.length; local972++) {
							@Pc(978) int local978 = local970[local972];
							if (this.aShortArray82 == null || (this.aShortArray82[local978] & arg6) != 0) {
								@Pc(1022) int local1022 = this.anIntArray389[local978] * local814[0] + this.anIntArray390[local978] * local814[1] + this.anIntArray392[local978] * local814[2] + 8192 >> 14;
								@Pc(1053) int local1053 = this.anIntArray392[local978] * local814[5] + local814[3] * this.anIntArray389[local978] + local814[4] * this.anIntArray390[local978] + 8192 >> 14;
								@Pc(1057) int local1057 = local1053 + local824;
								@Pc(1061) int local1061 = local1022 + local820;
								@Pc(1092) int local1092 = local814[8] * this.anIntArray392[local978] + this.anIntArray390[local978] * local814[7] + this.anIntArray389[local978] * local814[6] + 8192 >> 14;
								this.anIntArray389[local978] = local1061;
								@Pc(1101) int local1101 = local1092 + local826;
								this.anIntArray390[local978] = local1057;
								this.anIntArray392[local978] = local1101;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2575) Class9 local2575;
			@Pc(2580) Class162 local2580;
			if (arg0 == 5) {
				if (this.anIntArrayArray69 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray69.length > local35) {
							local245 = this.anIntArrayArray69[local35];
							for (local247 = 0; local247 < local245.length; local247++) {
								local53 = local245[local247];
								if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local53]) != 0) {
									local59 = arg2 * 8 + (this.aByteArray54[local53] & 0xFF);
									if (local59 < 0) {
										local59 = 0;
									} else if (local59 > 255) {
										local59 = 255;
									}
									this.aByteArray54[local53] = (byte) local59;
									if (this.aClass352_8 != null) {
										this.aClass352_8.anInterface14_7 = null;
									}
								}
							}
						}
					}
					if (this.aClass9Array1 != null) {
						for (local35 = 0; local35 < this.anInt5916; local35++) {
							local2575 = this.aClass9Array1[local35];
							local2580 = this.aClass162Array1[local35];
							local2580.anInt4674 = 255 - (this.aByteArray54[local2575.anInt148] & 0xFF) << 24 | local2580.anInt4674 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2833) Class162 local2833;
				if (arg0 == 8) {
					if (this.anIntArrayArray68 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray68.length) {
								local245 = this.anIntArrayArray68[local35];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2833 = this.aClass162Array1[local245[local247]];
									local2833.anInt4684 += arg3;
									local2833.anInt4676 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray68 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray68.length > local35) {
								local245 = this.anIntArrayArray68[local35];
								for (local247 = 0; local247 < local245.length; local247++) {
									local2833 = this.aClass162Array1[local245[local247]];
									local2833.anInt4675 = arg3 * local2833.anInt4675 >> 7;
									local2833.anInt4679 = local2833.anInt4679 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray68 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray68.length) {
							local245 = this.anIntArrayArray68[local35];
							for (local247 = 0; local247 < local245.length; local247++) {
								local2833 = this.aClass162Array1[local245[local247]];
								local2833.anInt4680 = local2833.anInt4680 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray69 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray69.length > local35) {
						local245 = this.anIntArrayArray69[local35];
						for (local247 = 0; local247 < local245.length; local247++) {
							local53 = local245[local247];
							if (this.aShortArray80 == null || (this.aShortArray80[local53] & arg6) != 0) {
								local59 = this.aShortArray79[local53] & 0xFFFF;
								local370 = local59 >> 10 & 0x3F;
								local392 = local59 >> 7 & 0x7;
								@Pc(2682) int local2682 = local370 + arg2 & 0x3F;
								local392 += arg3 / 4;
								local418 = local59 & 0x7F;
								if (local392 < 0) {
									local392 = 0;
								} else if (local392 > 7) {
									local392 = 7;
								}
								local418 += arg4;
								if (local418 < 0) {
									local418 = 0;
								} else if (local418 > 127) {
									local418 = 127;
								}
								this.aShortArray79[local53] = (short) (local392 << 7 | local2682 << 10 | local418);
								if (this.aClass352_8 != null) {
									this.aClass352_8.anInterface14_7 = null;
								}
							}
						}
					}
				}
				if (this.aClass9Array1 != null) {
					for (local35 = 0; local35 < this.anInt5916; local35++) {
						local2575 = this.aClass9Array1[local35];
						local2580 = this.aClass162Array1[local35];
						local2580.anInt4674 = local2580.anInt4674 & 0xFF000000 | Static347.anIntArray701[this.aShortArray79[local2575.anInt148] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray70.length) {
					local245 = this.anIntArrayArray70[local35];
					for (local247 = 0; local247 < local245.length; local247++) {
						local53 = local245[local247];
						if (this.aShortArray82 == null || (this.aShortArray82[local53] & arg6) != 0) {
							this.anIntArray389[local53] -= Static334.anInt5863;
							this.anIntArray390[local53] -= Static219.anInt4126;
							this.anIntArray392[local53] -= Static31.anInt646;
							this.anIntArray389[local53] = arg2 * this.anIntArray389[local53] >> 7;
							this.anIntArray390[local53] = this.anIntArray390[local53] * arg3 >> 7;
							this.anIntArray392[local53] = arg4 * this.anIntArray392[local53] >> 7;
							this.anIntArray389[local53] += Static334.anInt5863;
							this.anIntArray390[local53] += Static219.anInt4126;
							this.anIntArray392[local53] += Static31.anInt646;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local247 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static497.aBoolean562) {
				local370 = Static334.anInt5863 * arg7[0] + Static219.anInt4126 * arg7[3] + arg7[6] * Static31.anInt646 + 8192 >> 14;
				local392 = Static219.anInt4126 * arg7[4] + arg7[1] * Static334.anInt5863 + Static31.anInt646 * arg7[7] + 8192 >> 14;
				local370 += local247;
				local418 = arg7[2] * Static334.anInt5863 + Static219.anInt4126 * arg7[5] + Static31.anInt646 * arg7[8] + 8192 >> 14;
				local392 += local53;
				local418 += local59;
				Static334.anInt5863 = local370;
				Static219.anInt4126 = local392;
				Static31.anInt646 = local418;
				Static497.aBoolean562 = false;
			}
			local370 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local418 = arg4 << 15 >> 7;
			local449 = local370 * -Static334.anInt5863 + 8192 >> 14;
			local453 = -Static219.anInt4126 * local392 + 8192 >> 14;
			local457 = local418 * -Static31.anInt646 + 8192 >> 14;
			local461 = Static334.anInt5863 + local449;
			local469 = local453 + Static219.anInt4126;
			local477 = local457 + Static31.anInt646;
			@Pc(1999) int[] local1999 = new int[] { local370 * arg7[0] + 8192 >> 14, local370 * arg7[3] + 8192 >> 14, arg7[6] * local370 + 8192 >> 14, arg7[1] * local392 + 8192 >> 14, arg7[4] * local392 + 8192 >> 14, arg7[7] * local392 + 8192 >> 14, local418 * arg7[2] + 8192 >> 14, arg7[5] * local418 + 8192 >> 14, local418 * arg7[8] + 8192 >> 14 };
			local630 = local247 * local370 + 8192 >> 14;
			local655 = local392 * local53 + 8192 >> 14;
			@Pc(2127) int local2127 = local655 + local469;
			local659 = local59 * local418 + 8192 >> 14;
			@Pc(2139) int local2139 = local630 + local461;
			@Pc(2143) int local2143 = local659 + local477;
			@Pc(2146) int[] local2146 = new int[9];
			@Pc(2152) int local2152;
			for (local668 = 0; local668 < 3; local668++) {
				for (local2152 = 0; local2152 < 3; local2152++) {
					local673 = 0;
					for (local677 = 0; local677 < 3; local677++) {
						local673 += arg7[local668 * 3 + local677] * local1999[local677 * 3 + local2152];
					}
					local2146[local668 * 3 + local2152] = local673 + 8192 >> 14;
				}
			}
			local2152 = arg7[0] * local2139 + arg7[1] * local2127 + arg7[2] * local2143 + 8192 >> 14;
			local673 = arg7[5] * local2143 + arg7[3] * local2139 + local2127 * arg7[4] + 8192 >> 14;
			local673 += local35;
			local2152 += local33;
			local677 = local2139 * arg7[6] + arg7[7] * local2127 + local2143 * arg7[8] + 8192 >> 14;
			local677 += local41;
			for (local681 = 0; local681 < local8; local681++) {
				local683 = arg1[local681];
				if (local683 < this.anIntArrayArray70.length) {
					local814 = this.anIntArrayArray70[local683];
					for (local816 = 0; local816 < local814.length; local816++) {
						local820 = local814[local816];
						if (this.aShortArray82 == null || (this.aShortArray82[local820] & arg6) != 0) {
							local824 = this.anIntArray390[local820] * local2146[1] + local2146[0] * this.anIntArray389[local820] + local2146[2] * this.anIntArray392[local820] + 8192 >> 14;
							local826 = this.anIntArray392[local820] * local2146[5] + local2146[4] * this.anIntArray390[local820] + local2146[3] * this.anIntArray389[local820] + 8192 >> 14;
							local954 = this.anIntArray389[local820] * local2146[6] + local2146[7] * this.anIntArray390[local820] + local2146[8] * this.anIntArray392[local820] + 8192 >> 14;
							@Pc(2424) int local2424 = local824 + local2152;
							@Pc(2428) int local2428 = local826 + local673;
							@Pc(2432) int local2432 = local954 + local677;
							this.anIntArray389[local820] = local2424;
							this.anIntArray390[local820] = local2428;
							this.anIntArray392[local820] = local2432;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lw", name = "f", descriptor = "()[Lclient!hv;")
	@Override
	public Class156[] method6625() {
		return this.aClass156Array3;
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(I)V")
	private void method5145() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(30) int local30 = 0; local30 < this.anInt5943; local30++) {
			@Pc(37) int local37 = this.anIntArray389[local30];
			@Pc(42) int local42 = this.anIntArray390[local30];
			if (local9 > local42) {
				local9 = local42;
			}
			if (local42 > local15) {
				local15 = local42;
			}
			if (local13 < local37) {
				local13 = local37;
			}
			if (local7 > local37) {
				local7 = local37;
			}
			@Pc(71) int local71 = this.anIntArray392[local30];
			if (local17 < local71) {
				local17 = local71;
			}
			if (local71 < local11) {
				local11 = local71;
			}
			@Pc(93) int local93 = local71 * local71 + local37 * local37;
			if (local93 > local19) {
				local19 = local93;
			}
			local93 = local42 * local42 + local71 * local71 + local37 * local37;
			if (local21 < local93) {
				local21 = local93;
			}
		}
		this.aShort79 = (short) local9;
		this.aShort74 = (short) local15;
		this.aShort82 = (short) local17;
		this.aShort78 = (short) local7;
		this.aShort81 = (short) local11;
		this.aShort76 = (short) local13;
		this.aShort77 = (short) (int) (Math.sqrt((double) local19) + 0.99D);
		this.aShort80 = (short) (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean421 = true;
	}

	@OriginalMember(owner = "client!lw", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "()V")
	@Override
	public void method6624() {
		if (this.anInt5931 <= 0 || this.anInt5912 <= 0) {
			return;
		}
		this.method5139(false);
		if ((this.aByte80 & 0x10) == 0 && this.aClass28_1.anInterface7_1 == null) {
			this.method5137(false);
		}
		this.method5143();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!pda;)V")
	@Override
	public void method6608(@OriginalArg(0) Class51 arg0) {
		@Pc(8) Class51_Sub3 local8 = (Class51_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass287Array3 != null) {
			for (local13 = 0; local13 < this.aClass287Array3.length; local13++) {
				@Pc(20) Class287 local20 = this.aClass287Array3[local13];
				@Pc(22) Class287 local22 = local20;
				if (local20.aClass287_2 != null) {
					local22 = local20.aClass287_2;
				}
				local22.anInt7580 = (int) (local8.aFloat135 + (float) this.anIntArray392[local20.anInt7576] * local8.aFloat137 + (float) this.anIntArray389[local20.anInt7576] * local8.aFloat136 + (float) this.anIntArray390[local20.anInt7576] * local8.aFloat142);
				local22.anInt7579 = (int) (local8.aFloat133 * (float) this.anIntArray392[local20.anInt7576] + local8.aFloat143 * (float) this.anIntArray389[local20.anInt7576] + (float) this.anIntArray390[local20.anInt7576] * local8.aFloat139 + local8.aFloat138);
				local22.anInt7578 = (int) (local8.aFloat132 * (float) this.anIntArray389[local20.anInt7576] + (float) this.anIntArray390[local20.anInt7576] * local8.aFloat141 + local8.aFloat134 * (float) this.anIntArray392[local20.anInt7576] + local8.aFloat140);
				local22.anInt7586 = (int) (local8.aFloat135 + (float) this.anIntArray392[local20.anInt7583] * local8.aFloat137 + local8.aFloat142 * (float) this.anIntArray390[local20.anInt7583] + local8.aFloat136 * (float) this.anIntArray389[local20.anInt7583]);
				local22.anInt7581 = (int) ((float) this.anIntArray390[local20.anInt7583] * local8.aFloat139 + (float) this.anIntArray389[local20.anInt7583] * local8.aFloat143 + local8.aFloat133 * (float) this.anIntArray392[local20.anInt7583] + local8.aFloat138);
				local22.anInt7571 = (int) ((float) this.anIntArray392[local20.anInt7583] * local8.aFloat134 + local8.aFloat132 * (float) this.anIntArray389[local20.anInt7583] + local8.aFloat141 * (float) this.anIntArray390[local20.anInt7583] + local8.aFloat140);
				local22.anInt7584 = (int) ((float) this.anIntArray392[local20.anInt7574] * local8.aFloat137 + local8.aFloat136 * (float) this.anIntArray389[local20.anInt7574] + local8.aFloat142 * (float) this.anIntArray390[local20.anInt7574] + local8.aFloat135);
				local22.anInt7585 = (int) (local8.aFloat139 * (float) this.anIntArray390[local20.anInt7574] + local8.aFloat143 * (float) this.anIntArray389[local20.anInt7574] + local8.aFloat133 * (float) this.anIntArray392[local20.anInt7574] + local8.aFloat138);
				local22.anInt7575 = (int) (local8.aFloat132 * (float) this.anIntArray389[local20.anInt7574] + local8.aFloat141 * (float) this.anIntArray390[local20.anInt7574] + (float) this.anIntArray392[local20.anInt7574] * local8.aFloat134 + local8.aFloat140);
			}
		}
		if (this.aClass156Array3 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass156Array3.length; local13++) {
			@Pc(361) Class156 local361 = this.aClass156Array3[local13];
			@Pc(363) Class156 local363 = local361;
			if (local361.aClass156_1 != null) {
				local363 = local361.aClass156_1;
			}
			if (local361.aClass51_4 == null) {
				local361.aClass51_4 = local8.method6712();
			} else {
				local361.aClass51_4.method6704(local8);
			}
			local363.anInt4165 = (int) (local8.aFloat135 + local8.aFloat137 * (float) this.anIntArray392[local361.anInt4163] + local8.aFloat142 * (float) this.anIntArray390[local361.anInt4163] + local8.aFloat136 * (float) this.anIntArray389[local361.anInt4163]);
			local363.anInt4166 = (int) (local8.aFloat133 * (float) this.anIntArray392[local361.anInt4163] + local8.aFloat139 * (float) this.anIntArray390[local361.anInt4163] + (float) this.anIntArray389[local361.anInt4163] * local8.aFloat143 + local8.aFloat138);
			local363.anInt4160 = (int) (local8.aFloat140 + (float) this.anIntArray389[local361.anInt4163] * local8.aFloat132 + local8.aFloat141 * (float) this.anIntArray390[local361.anInt4163] + local8.aFloat134 * (float) this.anIntArray392[local361.anInt4163]);
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5915; local3++) {
			local12 = this.aShortArray79[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 += (arg0 - local18) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local24 += arg3 * (arg1 - local24) >> 7;
			}
			@Pc(57) int local57 = local12 & 0x7F;
			if (arg2 != -1) {
				local57 += (arg2 - local57) * arg3 >> 7;
			}
			this.aShortArray79[local3] = (short) (local57 | local24 << 7 | local18 << 10);
		}
		if (this.aClass9Array1 != null) {
			for (local12 = 0; local12 < this.anInt5916; local12++) {
				@Pc(105) Class9 local105 = this.aClass9Array1[local12];
				@Pc(110) Class162 local110 = this.aClass162Array1[local12];
				local110.anInt4674 = Static347.anIntArray701[this.aShortArray79[local105.anInt148] & 0xFFFF] & 0xFFFFFF | local110.anInt4674 & 0xFF000000;
			}
		}
		if (this.aClass352_8 != null) {
			this.aClass352_8.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!pda;ZI)Z")
	@Override
	public boolean method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5149(arg3, arg4, -1, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(BZIILclient!pda;II)Z")
	private boolean method5149(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class51_Sub3 local8 = (Class51_Sub3) arg3;
		@Pc(12) Class51_Sub3 local12 = this.aClass13_Sub2_28.aClass51_Sub3_3;
		@Pc(33) float local33 = local8.aFloat138 * local12.aFloat142 + local12.aFloat136 * local8.aFloat135 + local12.aFloat137 * local8.aFloat140 + local12.aFloat135;
		@Pc(54) float local54 = local12.aFloat138 + local8.aFloat135 * local12.aFloat143 + local8.aFloat138 * local12.aFloat139 + local8.aFloat140 * local12.aFloat133;
		Static268.aFloat108 = local12.aFloat134 * local8.aFloat134 + local12.aFloat132 * local8.aFloat137 + local8.aFloat133 * local12.aFloat141;
		Static219.aFloat84 = local8.aFloat141 * local12.aFloat134 + local8.aFloat142 * local12.aFloat132 + local8.aFloat139 * local12.aFloat141;
		Static144.aFloat61 = local8.aFloat133 * local12.aFloat142 + local12.aFloat136 * local8.aFloat137 + local12.aFloat137 * local8.aFloat134;
		Static133.aFloat58 = local12.aFloat141 * local8.aFloat143 + local12.aFloat132 * local8.aFloat136 + local8.aFloat132 * local12.aFloat134;
		Static68.aFloat50 = local8.aFloat132 * local12.aFloat137 + local8.aFloat136 * local12.aFloat136 + local12.aFloat142 * local8.aFloat143;
		Static257.aFloat107 = local8.aFloat141 * local12.aFloat137 + local8.aFloat142 * local12.aFloat136 + local12.aFloat142 * local8.aFloat139;
		@Pc(183) float local183 = local12.aFloat140 + local8.aFloat138 * local12.aFloat141 + local12.aFloat132 * local8.aFloat135 + local12.aFloat134 * local8.aFloat140;
		Static89.aFloat125 = local8.aFloat141 * local12.aFloat133 + local8.aFloat142 * local12.aFloat143 + local8.aFloat139 * local12.aFloat139;
		Static82.aFloat52 = local8.aFloat132 * local12.aFloat133 + local12.aFloat139 * local8.aFloat143 + local8.aFloat136 * local12.aFloat143;
		Static100.aFloat55 = local12.aFloat133 * local8.aFloat134 + local8.aFloat137 * local12.aFloat143 + local12.aFloat139 * local8.aFloat133;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass13_Sub2_28.anInt1089;
		@Pc(255) int local255 = this.aClass13_Sub2_28.anInt1101;
		if (!this.aBoolean421) {
			this.method5145();
		}
		@Pc(270) int local270 = this.aShort76 - this.aShort78 >> 1;
		@Pc(278) int local278 = this.aShort74 - this.aShort79 >> 1;
		@Pc(292) int local292 = this.aShort82 - this.aShort81 >> 1;
		@Pc(297) int local297 = local270 + this.aShort78;
		@Pc(302) int local302 = local278 + this.aShort79;
		@Pc(307) int local307 = local292 + this.aShort81;
		@Pc(314) int local314 = local297 - (local270 << arg1);
		@Pc(320) int local320 = local302 - (local278 << arg1);
		@Pc(326) int local326 = local307 - (local292 << arg1);
		@Pc(333) int local333 = local297 + (local270 << arg1);
		@Pc(339) int local339 = local302 + (local278 << arg1);
		Static575.anIntArray678[0] = local314;
		@Pc(349) int local349 = local307 + (local292 << arg1);
		Static185.anIntArray239[0] = local320;
		Static575.anIntArray678[1] = local333;
		Static477.anIntArray556[0] = local326;
		Static185.anIntArray239[1] = local320;
		Static575.anIntArray678[2] = local314;
		Static477.anIntArray556[1] = local326;
		Static185.anIntArray239[2] = local339;
		Static477.anIntArray556[2] = local326;
		Static575.anIntArray678[3] = local333;
		Static185.anIntArray239[3] = local339;
		Static575.anIntArray678[4] = local314;
		Static477.anIntArray556[3] = local326;
		Static185.anIntArray239[4] = local320;
		Static575.anIntArray678[5] = local333;
		Static477.anIntArray556[4] = local349;
		Static185.anIntArray239[5] = local320;
		Static477.anIntArray556[5] = local349;
		Static575.anIntArray678[6] = local314;
		Static185.anIntArray239[6] = local339;
		Static575.anIntArray678[7] = local333;
		Static477.anIntArray556[6] = local349;
		Static185.anIntArray239[7] = local339;
		Static477.anIntArray556[7] = local349;
		@Pc(502) float local502;
		@Pc(488) float local488;
		@Pc(474) float local474;
		@Pc(450) float local450;
		@Pc(460) float local460;
		@Pc(455) float local455;
		for (@Pc(443) int local443 = 0; local443 < 8; local443++) {
			local450 = (float) Static575.anIntArray678[local443];
			local455 = (float) Static477.anIntArray556[local443];
			local460 = (float) Static185.anIntArray239[local443];
			local474 = local183 + local460 * Static219.aFloat84 + Static133.aFloat58 * local450 + local455 * Static268.aFloat108;
			local488 = local455 * Static100.aFloat55 + local450 * Static82.aFloat52 + local460 * Static89.aFloat125 + local54;
			local502 = local33 + Static144.aFloat61 * local455 + Static68.aFloat50 * local450 + Static257.aFloat107 * local460;
			if (local474 >= (float) this.aClass13_Sub2_28.anInt1099) {
				if (arg2 > 0) {
					local474 = (float) arg2;
				}
				@Pc(529) float local529 = (float) this.aClass13_Sub2_28.anInt1119 + local502 * (float) local251 / local474;
				if (local241 > local529) {
					local241 = local529;
				}
				if (local243 < local529) {
					local243 = local529;
				}
				@Pc(553) float local553 = (float) this.aClass13_Sub2_28.anInt1109 + local488 * (float) local255 / local474;
				if (local553 < local245) {
					local245 = local553;
				}
				local239 = true;
				if (local553 > local247) {
					local247 = local553;
				}
			}
		}
		if (local239 && (float) arg4 > local241 && local243 > (float) arg4 && local245 < (float) arg5 && local247 > (float) arg5) {
			if (arg0) {
				return true;
			}
			if (this.anInt5931 > this.aClass13_Sub2_28.anIntArray65.length) {
				this.aClass13_Sub2_28.anIntArray66 = new int[this.anInt5931];
				this.aClass13_Sub2_28.anIntArray65 = new int[this.anInt5931];
			}
			@Pc(626) int[] local626 = this.aClass13_Sub2_28.anIntArray65;
			@Pc(630) int[] local630 = this.aClass13_Sub2_28.anIntArray66;
			@Pc(706) int local706;
			for (@Pc(632) int local632 = 0; local632 < this.anInt5943; local632++) {
				local460 = (float) this.anIntArray390[local632];
				local450 = (float) this.anIntArray389[local632];
				local455 = (float) this.anIntArray392[local632];
				local488 = local54 + Static100.aFloat55 * local455 + Static82.aFloat52 * local450 + Static89.aFloat125 * local460;
				local474 = local455 * Static268.aFloat108 + Static219.aFloat84 * local460 + Static133.aFloat58 * local450 + local183;
				local502 = local33 + local450 * Static68.aFloat50 + Static257.aFloat107 * local460 + Static144.aFloat61 * local455;
				@Pc(713) int local713;
				@Pc(715) int local715;
				@Pc(724) int local724;
				if (local474 >= (float) this.aClass13_Sub2_28.anInt1099) {
					if (arg2 > 0) {
						local474 = (float) arg2;
					}
					local706 = (int) ((float) this.aClass13_Sub2_28.anInt1119 + local502 * (float) local251 / local474);
					local713 = (int) ((float) this.aClass13_Sub2_28.anInt1109 + local488 * (float) local255 / local474);
					local715 = this.anIntArray391[local632];
					local724 = this.anIntArray391[local632 + 1];
					for (@Pc(787) int local787 = local715; local787 < local724; local787++) {
						@Pc(796) int local796 = this.aShortArray75[local787] - 1;
						if (local796 == -1) {
							break;
						}
						local626[local796] = local706;
						local630[local796] = local713;
					}
				} else {
					local706 = this.anIntArray391[local632];
					local713 = this.anIntArray391[local632 + 1];
					for (local715 = local706; local715 < local713; local715++) {
						local724 = this.aShortArray75[local715] - 1;
						if (local724 == -1) {
							break;
						}
						local626[this.aShortArray75[local715] - 1] = -999999;
					}
				}
			}
			for (local706 = 0; local706 < this.anInt5915; local706++) {
				if (local626[this.aShortArray76[local706]] != -999999 && local626[this.aShortArray81[local706]] != -999999 && local626[this.aShortArray77[local706]] != -999999 && this.method5151(local630[this.aShortArray81[local706]], local630[this.aShortArray77[local706]], arg5, arg4, local630[this.aShortArray76[local706]], local626[this.aShortArray77[local706]], local626[this.aShortArray76[local706]], local626[this.aShortArray81[local706]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IILclient!pda;ZII)Z")
	@Override
	public boolean method6617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5149(arg3, arg4, arg5, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!lw", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5898; local3++) {
			this.anIntArray389[local3] = this.anIntArray389[local3] + 7 >> 4;
			this.anIntArray390[local3] = this.anIntArray390[local3] + 7 >> 4;
			this.anIntArray392[local3] = this.anIntArray392[local3] + 7 >> 4;
		}
		this.aBoolean421 = false;
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)V")
	private void method5150() {
		if (this.anInt5912 == 0) {
			return;
		}
		if (this.aByte80 != 0) {
			this.method5139(true);
		}
		this.method5139(false);
		if (this.aClass28_1 != null) {
			if (this.aClass28_1.anInterface7_1 == null) {
				this.method5137((this.aByte80 & 0x10) != 0);
			}
			if (this.aClass28_1.anInterface7_1 != null) {
				this.aClass13_Sub2_28.method1022(this.aClass352_11 != null);
				this.aClass13_Sub2_28.method1067(this.aClass352_11, this.aClass352_9, this.aClass352_8, this.aClass352_10);
				@Pc(76) int local76 = this.anIntArray393.length - 1;
				for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
					@Pc(85) int local85 = this.anIntArray393[local78];
					@Pc(92) int local92 = this.anIntArray393[local78 + 1];
					@Pc(99) int local99 = this.aShortArray73[local85] & 0xFFFF;
					if (local99 == 65535) {
						local99 = -1;
					}
					this.aClass13_Sub2_28.method1058(local99, this.aClass352_11 != null);
					this.aClass13_Sub2_28.method1100(local85 * 3, (local92 - local85) * 3, this.aClass28_1.anInterface7_1);
				}
			}
		}
		this.method5143();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5151(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg2 < arg4 && arg0 > arg2 && arg2 < arg1) {
			return false;
		} else if (arg4 < arg2 && arg0 < arg2 && arg2 > arg1) {
			return false;
		} else if (arg3 < arg6 && arg3 < arg7 && arg5 > arg3) {
			return false;
		} else {
			return arg3 <= arg6 || arg7 >= arg3 || arg5 >= arg3;
		}
	}

	@OriginalMember(owner = "client!lw", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class290.anIntArray546[arg0];
		@Pc(13) int local13 = Class290.anIntArray547[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5943; local15++) {
			@Pc(33) int local33 = this.anIntArray390[local15] * local9 + this.anIntArray389[local15] * local13 >> 14;
			this.anIntArray390[local15] = local13 * this.anIntArray390[local15] - local9 * this.anIntArray389[local15] >> 14;
			this.anIntArray389[local15] = local33;
		}
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
		this.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!lw", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt5921 = arg0;
		this.aBoolean422 = true;
		if (this.aClass315_1 != null && (this.anInt5921 & 0x10000) == 0) {
			this.aShortArray72 = this.aClass315_1.aShortArray128;
			this.aShortArray74 = this.aClass315_1.aShortArray129;
			this.aShortArray78 = this.aClass315_1.aShortArray127;
			this.aByteArray55 = this.aClass315_1.aByteArray88;
			this.aClass315_1 = null;
		}
		this.method5143();
	}

	@OriginalMember(owner = "client!lw", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray70 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5898; local12++) {
			this.anIntArray389[local12] <<= 0x4;
			this.anIntArray390[local12] <<= 0x4;
			this.anIntArray392[local12] <<= 0x4;
		}
		Static334.anInt5863 = 0;
		Static219.anInt4126 = 0;
		Static31.anInt646 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lw", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean421) {
			this.method5145();
		}
		return this.aShort81;
	}

	@OriginalMember(owner = "client!lw", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5943; local7++) {
			if (arg0 != 128) {
				this.anIntArray389[local7] = arg0 * this.anIntArray389[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray390[local7] = arg1 * this.anIntArray390[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray392[local7] = arg2 * this.anIntArray392[local7] >> 7;
			}
		}
		this.aBoolean421 = false;
		if (this.aClass352_9 != null) {
			this.aClass352_9.anInterface14_7 = null;
		}
	}

	@OriginalMember(owner = "client!lw", name = "e", descriptor = "(I)V")
	private void method5152() {
		if (this.aClass9Array1 == null) {
			return;
		}
		@Pc(20) Class51_Sub3 local20 = this.aClass13_Sub2_28.aClass51_Sub3_2;
		this.aClass13_Sub2_28.method1065();
		this.aClass13_Sub2_28.C(!this.aBoolean420);
		this.aClass13_Sub2_28.method1022(false);
		this.aClass13_Sub2_28.method1067((Class352) null, this.aClass13_Sub2_28.aClass352_1, (Class352) null, this.aClass13_Sub2_28.aClass352_2);
		for (@Pc(52) int local52 = 0; local52 < this.anInt5916; local52++) {
			@Pc(59) Class9 local59 = this.aClass9Array1[local52];
			@Pc(64) Class162 local64 = this.aClass162Array1[local52];
			if (!local59.aBoolean21 || !this.aClass13_Sub2_28.method8093()) {
				@Pc(94) float local94 = (float) (this.anIntArray389[local59.anInt146] + this.anIntArray389[local59.anInt145] + this.anIntArray389[local59.anInt147]) * 0.3333333F;
				@Pc(117) float local117 = (float) (this.anIntArray390[local59.anInt146] + this.anIntArray390[local59.anInt145] + this.anIntArray390[local59.anInt147]) * 0.3333333F;
				@Pc(138) float local138 = (float) (this.anIntArray392[local59.anInt147] + this.anIntArray392[local59.anInt146] + this.anIntArray392[local59.anInt145]) * 0.3333333F;
				@Pc(152) float local152 = local94 * Static68.aFloat50 + local117 * Static257.aFloat107 + local138 * Static144.aFloat61 + Static526.aFloat164;
				@Pc(166) float local166 = Static163.aFloat65 + local94 * Static82.aFloat52 + Static89.aFloat125 * local117 + Static100.aFloat55 * local138;
				@Pc(180) float local180 = Static268.aFloat108 * local138 + local94 * Static133.aFloat58 + Static219.aFloat84 * local117 + Static217.aFloat83;
				@Pc(201) float local201 = (float) (1.0D / Math.sqrt((double) (local180 * local180 + local152 * local152 + local166 * local166))) * (float) local59.anInt144;
				local20.method6722(local180 * local201 - local180, local64.anInt4680, (float) local64.anInt4684 + local201 * local166 - local166, local59.aShort4 * local64.anInt4679 >> 7, local59.aShort3 * local64.anInt4675 >> 7, local152 + (float) local64.anInt4676 - local201 * local152);
				this.aClass13_Sub2_28.method1070(local20);
				@Pc(252) int local252 = local64.anInt4674;
				OpenGL.glColor4ub((byte) (local252 >> 16), (byte) (local252 >> 8), (byte) local252, (byte) (local252 >> 24));
				this.aClass13_Sub2_28.method1023(local59.aShort5);
				this.aClass13_Sub2_28.method1090(local59.aByte6);
				this.aClass13_Sub2_28.method1089(4);
			}
		}
		this.aClass13_Sub2_28.C(true);
		this.aClass13_Sub2_28.method1085();
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!lw;Lclient!lw;ZIIZ)Lclient!ka;")
	private Class193 method5153(@OriginalArg(0) Class193_Sub1 arg0, @OriginalArg(1) Class193_Sub1 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.anInt5915 = this.anInt5915;
		arg0.anInt5916 = this.anInt5916;
		if ((arg3 & 0x100) == 0) {
			arg0.aBoolean420 = this.aBoolean420;
		} else {
			arg0.aBoolean420 = true;
		}
		arg0.anInt5898 = this.anInt5898;
		arg0.aShort75 = this.aShort75;
		arg0.anInt5921 = arg3;
		arg0.aByte80 = 0;
		arg0.anInt5912 = this.anInt5912;
		arg0.aShort73 = this.aShort73;
		arg0.anInt5931 = this.anInt5931;
		arg0.aBoolean423 = this.aBoolean423;
		arg0.anInt5947 = this.anInt5947;
		arg0.anInt5943 = this.anInt5943;
		@Pc(73) boolean local73 = Static66.method1533(arg3, this.anInt5947);
		@Pc(87) boolean local87 = Static487.method6855(arg3, this.anInt5947);
		@Pc(93) boolean local93 = Static493.method6911(arg3, this.anInt5947);
		@Pc(99) boolean local99 = local93 | local87 | local73;
		@Pc(200) int local200;
		if (local99) {
			if (!local73) {
				arg0.anIntArray389 = this.anIntArray389;
			} else if (arg1.anIntArray389 == null || arg1.anIntArray389.length < this.anInt5898) {
				arg0.anIntArray389 = arg1.anIntArray389 = new int[this.anInt5898];
			} else {
				arg0.anIntArray389 = arg1.anIntArray389;
			}
			if (!local87) {
				arg0.anIntArray390 = this.anIntArray390;
			} else if (arg1.anIntArray390 == null || arg1.anIntArray390.length < this.anInt5898) {
				arg0.anIntArray390 = arg1.anIntArray390 = new int[this.anInt5898];
			} else {
				arg0.anIntArray390 = arg1.anIntArray390;
			}
			if (!local93) {
				arg0.anIntArray392 = this.anIntArray392;
			} else if (arg1.anIntArray392 == null || arg1.anIntArray392.length < this.anInt5898) {
				arg0.anIntArray392 = arg1.anIntArray392 = new int[this.anInt5898];
			} else {
				arg0.anIntArray392 = arg1.anIntArray392;
			}
			for (local200 = 0; local200 < this.anInt5898; local200++) {
				if (local73) {
					arg0.anIntArray389[local200] = this.anIntArray389[local200];
				}
				if (local87) {
					arg0.anIntArray390[local200] = this.anIntArray390[local200];
				}
				if (local93) {
					arg0.anIntArray392[local200] = this.anIntArray392[local200];
				}
			}
		} else {
			arg0.anIntArray390 = this.anIntArray390;
			arg0.anIntArray392 = this.anIntArray392;
			arg0.anIntArray389 = this.anIntArray389;
		}
		if (Static244.method4141(arg3, this.anInt5947)) {
			if (arg2) {
				arg0.aByte80 = (byte) (arg0.aByte80 | 0x1);
			}
			arg0.aClass352_9 = arg1.aClass352_9;
			arg0.aClass352_9.anInterface14_7 = this.aClass352_9.anInterface14_7;
			arg0.aClass352_9.aByte128 = this.aClass352_9.aByte128;
		} else if (Static501.method6955(this.anInt5947, arg3)) {
			arg0.aClass352_9 = this.aClass352_9;
		} else {
			arg0.aClass352_9 = null;
		}
		if (Static193.method8832(arg3, this.anInt5947)) {
			if (arg1.aShortArray79 == null || this.anInt5915 > arg1.aShortArray79.length) {
				arg0.aShortArray79 = arg1.aShortArray79 = new short[this.anInt5915];
			} else {
				arg0.aShortArray79 = arg1.aShortArray79;
			}
			for (local200 = 0; local200 < this.anInt5915; local200++) {
				arg0.aShortArray79[local200] = this.aShortArray79[local200];
			}
		} else {
			arg0.aShortArray79 = this.aShortArray79;
		}
		if (Static524.method7273(this.anInt5947, arg3)) {
			if (arg1.aByteArray54 == null || this.anInt5915 > arg1.aByteArray54.length) {
				arg0.aByteArray54 = arg1.aByteArray54 = new byte[this.anInt5915];
			} else {
				arg0.aByteArray54 = arg1.aByteArray54;
			}
			for (local200 = 0; local200 < this.anInt5915; local200++) {
				arg0.aByteArray54[local200] = this.aByteArray54[local200];
			}
		} else {
			arg0.aByteArray54 = this.aByteArray54;
		}
		if (Static617.method8585(arg3, this.anInt5947)) {
			if (arg2) {
				arg0.aByte80 = (byte) (arg0.aByte80 | 0x2);
			}
			arg0.aClass352_8 = arg1.aClass352_8;
			arg0.aClass352_8.anInterface14_7 = this.aClass352_8.anInterface14_7;
			arg0.aClass352_8.aByte128 = this.aClass352_8.aByte128;
		} else if (Static590.method8336(arg3, this.anInt5947)) {
			arg0.aClass352_8 = this.aClass352_8;
		} else {
			arg0.aClass352_8 = null;
		}
		@Pc(563) int local563;
		if (Static205.method5785(arg3, this.anInt5947)) {
			if (arg1.aShortArray72 == null || this.anInt5931 > arg1.aShortArray72.length) {
				local200 = this.anInt5931;
				arg0.aShortArray74 = arg1.aShortArray74 = new short[local200];
				arg0.aShortArray78 = arg1.aShortArray78 = new short[local200];
				arg0.aShortArray72 = arg1.aShortArray72 = new short[local200];
			} else {
				arg0.aShortArray78 = arg1.aShortArray78;
				arg0.aShortArray74 = arg1.aShortArray74;
				arg0.aShortArray72 = arg1.aShortArray72;
			}
			if (this.aClass315_1 == null) {
				for (local200 = 0; local200 < this.anInt5931; local200++) {
					arg0.aShortArray72[local200] = this.aShortArray72[local200];
					arg0.aShortArray74[local200] = this.aShortArray74[local200];
					arg0.aShortArray78[local200] = this.aShortArray78[local200];
				}
			} else {
				if (arg1.aClass315_1 == null) {
					arg1.aClass315_1 = new Class315();
				}
				@Pc(551) Class315 local551 = arg0.aClass315_1 = arg1.aClass315_1;
				if (local551.aShortArray128 == null || this.anInt5931 > local551.aShortArray128.length) {
					local563 = this.anInt5931;
					local551.aShortArray127 = new short[local563];
					local551.aShortArray129 = new short[local563];
					local551.aShortArray128 = new short[local563];
					local551.aByteArray88 = new byte[local563];
				}
				for (local563 = 0; local563 < this.anInt5931; local563++) {
					arg0.aShortArray72[local563] = this.aShortArray72[local563];
					arg0.aShortArray74[local563] = this.aShortArray74[local563];
					arg0.aShortArray78[local563] = this.aShortArray78[local563];
					local551.aShortArray128[local563] = this.aClass315_1.aShortArray128[local563];
					local551.aShortArray129[local563] = this.aClass315_1.aShortArray129[local563];
					local551.aShortArray127[local563] = this.aClass315_1.aShortArray127[local563];
					local551.aByteArray88[local563] = this.aClass315_1.aByteArray88[local563];
				}
			}
			arg0.aByteArray55 = this.aByteArray55;
		} else {
			arg0.aByteArray55 = this.aByteArray55;
			arg0.aClass315_1 = this.aClass315_1;
			arg0.aShortArray74 = this.aShortArray74;
			arg0.aShortArray78 = this.aShortArray78;
			arg0.aShortArray72 = this.aShortArray72;
		}
		if (Static528.method2882(this.anInt5947, arg3)) {
			arg0.aClass352_11 = arg1.aClass352_11;
			if (arg2) {
				arg0.aByte80 = (byte) (arg0.aByte80 | 0x4);
			}
			arg0.aClass352_11.aByte128 = this.aClass352_11.aByte128;
			arg0.aClass352_11.anInterface14_7 = this.aClass352_11.anInterface14_7;
		} else if (Static241.method4097(arg3, this.anInt5947)) {
			arg0.aClass352_11 = this.aClass352_11;
		} else {
			arg0.aClass352_11 = null;
		}
		if (Static38.method888(arg3, this.anInt5947)) {
			if (arg1.aFloatArray48 == null || this.anInt5915 > arg1.aFloatArray48.length) {
				local200 = this.anInt5931;
				arg0.aFloatArray47 = arg1.aFloatArray47 = new float[local200];
				arg0.aFloatArray48 = arg1.aFloatArray48 = new float[local200];
			} else {
				arg0.aFloatArray47 = arg1.aFloatArray47;
				arg0.aFloatArray48 = arg1.aFloatArray48;
			}
			for (local200 = 0; local200 < this.anInt5931; local200++) {
				arg0.aFloatArray48[local200] = this.aFloatArray48[local200];
				arg0.aFloatArray47[local200] = this.aFloatArray47[local200];
			}
		} else {
			arg0.aFloatArray48 = this.aFloatArray48;
			arg0.aFloatArray47 = this.aFloatArray47;
		}
		if (Static357.method5331(this.anInt5947, arg3)) {
			if (arg2) {
				arg0.aByte80 = (byte) (arg0.aByte80 | 0x8);
			}
			arg0.aClass352_10 = arg1.aClass352_10;
			arg0.aClass352_10.anInterface14_7 = this.aClass352_10.anInterface14_7;
			arg0.aClass352_10.aByte128 = this.aClass352_10.aByte128;
		} else if (Static414.method6056(arg3, this.anInt5947)) {
			arg0.aClass352_10 = this.aClass352_10;
		} else {
			arg0.aClass352_10 = null;
		}
		if (Static57.method1305(arg3, this.anInt5947)) {
			if (arg1.aShortArray76 == null || this.anInt5915 > arg1.aShortArray76.length) {
				local200 = this.anInt5915;
				arg0.aShortArray81 = arg1.aShortArray81 = new short[local200];
				arg0.aShortArray76 = arg1.aShortArray76 = new short[local200];
				arg0.aShortArray77 = arg1.aShortArray77 = new short[local200];
			} else {
				arg0.aShortArray76 = arg1.aShortArray76;
				arg0.aShortArray77 = arg1.aShortArray77;
				arg0.aShortArray81 = arg1.aShortArray81;
			}
			for (local200 = 0; local200 < this.anInt5915; local200++) {
				arg0.aShortArray76[local200] = this.aShortArray76[local200];
				arg0.aShortArray81[local200] = this.aShortArray81[local200];
				arg0.aShortArray77[local200] = this.aShortArray77[local200];
			}
		} else {
			arg0.aShortArray81 = this.aShortArray81;
			arg0.aShortArray76 = this.aShortArray76;
			arg0.aShortArray77 = this.aShortArray77;
		}
		if (Static253.method4193(arg3, this.anInt5947)) {
			arg0.aClass28_1 = arg1.aClass28_1;
			if (arg2) {
				arg0.aByte80 = (byte) (arg0.aByte80 | 0x10);
			}
			arg0.aClass28_1.anInterface7_1 = this.aClass28_1.anInterface7_1;
		} else if (Static153.method2686(this.anInt5947, arg3)) {
			arg0.aClass28_1 = this.aClass28_1;
		} else {
			arg0.aClass28_1 = null;
		}
		if (Static202.method3468(this.anInt5947, arg3)) {
			if (arg1.aShortArray73 == null || arg1.aShortArray73.length < this.anInt5915) {
				local200 = this.anInt5915;
				arg0.aShortArray73 = arg1.aShortArray73 = new short[local200];
			} else {
				arg0.aShortArray73 = arg1.aShortArray73;
			}
			for (local200 = 0; local200 < this.anInt5915; local200++) {
				arg0.aShortArray73[local200] = this.aShortArray73[local200];
			}
		} else {
			arg0.aShortArray73 = this.aShortArray73;
		}
		if (!Static381.method8586(arg3, this.anInt5947)) {
			arg0.aClass162Array1 = this.aClass162Array1;
		} else if (arg1.aClass162Array1 == null || this.anInt5916 > arg1.aClass162Array1.length) {
			local200 = this.anInt5916;
			arg0.aClass162Array1 = arg1.aClass162Array1 = new Class162[local200];
			for (local563 = 0; local563 < this.anInt5916; local563++) {
				arg0.aClass162Array1[local563] = this.aClass162Array1[local563].method4103();
			}
		} else {
			arg0.aClass162Array1 = arg1.aClass162Array1;
			for (local200 = 0; local200 < this.anInt5916; local200++) {
				arg0.aClass162Array1[local200].method4100(this.aClass162Array1[local200]);
			}
		}
		if (this.aBoolean421) {
			arg0.aShort76 = this.aShort76;
			arg0.aShort74 = this.aShort74;
			arg0.aShort81 = this.aShort81;
			arg0.aShort80 = this.aShort80;
			arg0.aBoolean421 = true;
			arg0.aShort79 = this.aShort79;
			arg0.aShort77 = this.aShort77;
			arg0.aShort78 = this.aShort78;
			arg0.aShort82 = this.aShort82;
		} else {
			arg0.aBoolean421 = false;
		}
		arg0.anIntArrayArray68 = this.anIntArrayArray68;
		arg0.anIntArrayArray70 = this.anIntArrayArray70;
		arg0.aShortArray80 = this.aShortArray80;
		arg0.aClass156Array3 = this.aClass156Array3;
		arg0.aShortArray75 = this.aShortArray75;
		arg0.anIntArray393 = this.anIntArray393;
		arg0.aClass287Array3 = this.aClass287Array3;
		arg0.anIntArray391 = this.anIntArray391;
		arg0.anIntArrayArray69 = this.anIntArrayArray69;
		arg0.aClass9Array1 = this.aClass9Array1;
		arg0.aShortArray82 = this.aShortArray82;
		return arg0;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "()V")
	@Override
	protected void method6613() {
	}
}
