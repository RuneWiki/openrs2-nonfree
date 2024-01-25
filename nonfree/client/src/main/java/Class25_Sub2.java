import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gea")
public final class Class25_Sub2 extends Class25 {

	@OriginalMember(owner = "client!gea", name = "j", descriptor = "[I")
	private int[] anIntArray268;

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "[S")
	private short[] aShortArray46;

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!gea", name = "t", descriptor = "B")
	private byte aByte72;

	@OriginalMember(owner = "client!gea", name = "x", descriptor = "[Lclient!uga;")
	private Class337[] aClass337Array2;

	@OriginalMember(owner = "client!gea", name = "y", descriptor = "[I")
	private int[] anIntArray269;

	@OriginalMember(owner = "client!gea", name = "A", descriptor = "S")
	private short aShort62;

	@OriginalMember(owner = "client!gea", name = "B", descriptor = "[[I")
	private int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "[F")
	private float[] aFloatArray34;

	@OriginalMember(owner = "client!gea", name = "D", descriptor = "[[I")
	private int[][] anIntArrayArray28;

	@OriginalMember(owner = "client!gea", name = "E", descriptor = "S")
	private short aShort63;

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
	private int anInt3904;

	@OriginalMember(owner = "client!gea", name = "K", descriptor = "[S")
	private short[] aShortArray48;

	@OriginalMember(owner = "client!gea", name = "R", descriptor = "S")
	private short aShort64;

	@OriginalMember(owner = "client!gea", name = "Y", descriptor = "S")
	private short aShort65;

	@OriginalMember(owner = "client!gea", name = "ab", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!gea", name = "eb", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!gea", name = "gb", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!gea", name = "jb", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!gea", name = "ob", descriptor = "[S")
	private short[] aShortArray49;

	@OriginalMember(owner = "client!gea", name = "sb", descriptor = "[[I")
	private int[][] anIntArrayArray29;

	@OriginalMember(owner = "client!gea", name = "ub", descriptor = "[Lclient!jv;")
	private Class183[] aClass183Array1;

	@OriginalMember(owner = "client!gea", name = "vb", descriptor = "[F")
	private float[] aFloatArray35;

	@OriginalMember(owner = "client!gea", name = "yb", descriptor = "I")
	private int anInt3930;

	@OriginalMember(owner = "client!gea", name = "Ab", descriptor = "[I")
	private int[] anIntArray270;

	@OriginalMember(owner = "client!gea", name = "Gb", descriptor = "Lclient!tda;")
	private Interface23 anInterface23_3;

	@OriginalMember(owner = "client!gea", name = "Hb", descriptor = "[S")
	private short[] aShortArray50;

	@OriginalMember(owner = "client!gea", name = "Kb", descriptor = "[I")
	private int[] anIntArray271;

	@OriginalMember(owner = "client!gea", name = "Mb", descriptor = "[S")
	private short[] aShortArray51;

	@OriginalMember(owner = "client!gea", name = "Pb", descriptor = "[S")
	private short[] aShortArray52;

	@OriginalMember(owner = "client!gea", name = "Sb", descriptor = "I")
	private int anInt3944;

	@OriginalMember(owner = "client!gea", name = "Ub", descriptor = "[I")
	private int[] anIntArray272;

	@OriginalMember(owner = "client!gea", name = "Vb", descriptor = "Lclient!eh;")
	private Class90 aClass90_1;

	@OriginalMember(owner = "client!gea", name = "Zb", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!gea", name = "ec", descriptor = "[Lclient!pe;")
	private Class254[] aClass254Array1;

	@OriginalMember(owner = "client!gea", name = "ic", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!gea", name = "nc", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!gea", name = "pc", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!gea", name = "rc", descriptor = "[Lclient!gi;")
	private Class130[] aClass130Array2;

	@OriginalMember(owner = "client!gea", name = "sc", descriptor = "Lclient!ff;")
	private Interface9 anInterface9_2;

	@OriginalMember(owner = "client!gea", name = "uc", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!gea", name = "vc", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!gea", name = "wc", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!gea", name = "z", descriptor = "I")
	private int anInt3903 = 0;

	@OriginalMember(owner = "client!gea", name = "X", descriptor = "Z")
	private boolean aBoolean332 = false;

	@OriginalMember(owner = "client!gea", name = "qb", descriptor = "I")
	private int anInt3925 = 0;

	@OriginalMember(owner = "client!gea", name = "fb", descriptor = "I")
	private int anInt3918 = 0;

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
	private int anInt3906 = 0;

	@OriginalMember(owner = "client!gea", name = "U", descriptor = "Z")
	private boolean aBoolean331 = false;

	@OriginalMember(owner = "client!gea", name = "Ob", descriptor = "I")
	private int anInt3941 = 0;

	@OriginalMember(owner = "client!gea", name = "Tb", descriptor = "Z")
	private boolean aBoolean333 = true;

	@OriginalMember(owner = "client!gea", name = "oc", descriptor = "Z")
	private boolean aBoolean334 = false;

	@OriginalMember(owner = "client!gea", name = "db", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_8;

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "Lclient!dda;")
	private Class66 aClass66_3;

	@OriginalMember(owner = "client!gea", name = "lc", descriptor = "Lclient!dda;")
	private Class66 aClass66_6;

	@OriginalMember(owner = "client!gea", name = "J", descriptor = "Lclient!dda;")
	private Class66 aClass66_4;

	@OriginalMember(owner = "client!gea", name = "bb", descriptor = "Lclient!dda;")
	private Class66 aClass66_5;

	@OriginalMember(owner = "client!gea", name = "L", descriptor = "Lclient!ie;")
	private Class157 aClass157_1;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class25_Sub2(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aClass87_Sub2_8 = arg0;
		this.aClass66_3 = new Class66(null, 5126, 3, 0);
		this.aClass66_6 = new Class66(null, 5126, 2, 0);
		this.aClass66_4 = new Class66(null, 5126, 3, 0);
		this.aClass66_5 = new Class66(null, 5121, 4, 0);
		this.aClass157_1 = new Class157();
	}

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!oea;Lclient!ww;IIII)V")
	public Class25_Sub2(@OriginalArg(0) Class87_Sub2 arg0, @OriginalArg(1) Class379 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass87_Sub2_8 = arg0;
		this.anInt3904 = arg2;
		this.anInt3944 = arg5;
		if (Static486.method6974(arg2, arg5)) {
			this.aClass66_3 = new Class66(null, 5126, 3, 0);
		}
		if (Static486.method6977(arg5, arg2)) {
			this.aClass66_6 = new Class66(null, 5126, 2, 0);
		}
		if (Static305.method4707(arg5, arg2)) {
			this.aClass66_4 = new Class66(null, 5126, 3, 0);
		}
		if (Static158.method2968(arg2, arg5)) {
			this.aClass66_5 = new Class66(null, 5121, 4, 0);
		}
		if (Static321.method8560(arg2, arg5)) {
			this.aClass157_1 = new Class157();
		}
		@Pc(108) Interface6 local108 = arg0.anInterface6_11;
		@Pc(112) int[] local112 = new int[arg1.anInt10272];
		this.anIntArray271 = new int[arg1.anInt10276 + 1];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt10272; local121++) {
			if (arg1.aByteArray103 == null || arg1.aByteArray103[local121] != 2) {
				if (arg1.aShortArray153 != null && arg1.aShortArray153[local121] != -1) {
					@Pc(151) Class199 local151 = local108.method6357(arg1.aShortArray153[local121] & 0xFFFF);
					if (((this.anInt3944 & 0x40) == 0 || !local151.aBoolean427) && local151.aBoolean429) {
						continue;
					}
				}
				local112[this.anInt3918++] = local121;
				this.anIntArray271[arg1.aShortArray158[local121]]++;
				this.anIntArray271[arg1.aShortArray152[local121]]++;
				this.anIntArray271[arg1.aShortArray161[local121]]++;
			}
		}
		this.anInt3906 = this.anInt3918;
		@Pc(227) long[] local227 = new long[this.anInt3918];
		@Pc(236) boolean local236 = (this.anInt3904 & 0x100) != 0;
		@Pc(248) int local248;
		@Pc(261) int local261;
		@Pc(437) int local437;
		for (@Pc(238) int local238 = 0; local238 < this.anInt3918; local238++) {
			@Pc(244) int local244 = local112[local238];
			@Pc(246) Class199 local246 = null;
			local248 = 0;
			@Pc(250) byte local250 = 0;
			@Pc(252) byte local252 = 0;
			@Pc(254) byte local254 = 0;
			if (arg1.aClass259Array1 != null) {
				@Pc(259) boolean local259 = false;
				for (local261 = 0; local261 < arg1.aClass259Array1.length; local261++) {
					@Pc(268) Class259 local268 = arg1.aClass259Array1[local261];
					if (local268.anInt7713 == local244) {
						@Pc(277) Class291 local277 = Static283.method4472(local268.anInt7712);
						if (local277.aBoolean617) {
							local259 = true;
						}
						if (local277.anInt8275 != -1) {
							@Pc(292) Class199 local292 = local108.method6357(local277.anInt8275);
							if (local292.anInt5691 == 2) {
								this.aBoolean332 = true;
							}
						}
					}
				}
				if (local259) {
					local227[local238] = Long.MAX_VALUE;
					this.anInt3906--;
					continue;
				}
			}
			@Pc(323) short local323 = -1;
			if (arg1.aShortArray153 != null) {
				local323 = arg1.aShortArray153[local244];
				if (local323 != -1) {
					local246 = local108.method6357(local323 & 0xFFFF);
					if ((this.anInt3944 & 0x40) != 0 && local246.aBoolean427) {
						local323 = -1;
						local246 = null;
					} else {
						local252 = local246.aByte86;
						local254 = local246.aByte82;
						if (local246.aByte88 != 0 || local246.aByte87 != 0) {
							this.aBoolean334 = true;
						}
					}
				}
			}
			@Pc(393) boolean local393 = arg1.aByteArray104 != null && arg1.aByteArray104[local244] != 0 || local246 != null && local246.anInt5691 != 0;
			if ((local236 || local393) && arg1.aByteArray105 != null) {
				local248 += arg1.aByteArray105[local244] << 17;
			}
			if (local393) {
				local248 += 65536;
			}
			local248 += (local252 & 0xFF) << 8;
			local248 += local254 & 0xFF;
			local437 = local250 + ((local323 & 0xFFFF) << 16);
			@Pc(443) int local443 = local437 + (local238 & 0xFFFF);
			local227[local238] = ((long) local248 << 32) + (long) local443;
			this.aBoolean334 |= local246 != null && (local246.aByte88 != 0 || local246.aByte87 != 0);
			this.aBoolean332 |= local393;
		}
		Static315.method5515(local112, local227);
		this.anInt3903 = arg1.anInt10288;
		this.anIntArray269 = arg1.anIntArray752;
		this.anIntArray272 = arg1.anIntArray743;
		this.aShortArray52 = arg1.aShortArray159;
		this.anIntArray268 = arg1.anIntArray751;
		this.anInt3925 = arg1.anInt10276;
		@Pc(522) Class47[] local522 = new Class47[this.anInt3925];
		this.aClass130Array2 = arg1.aClass130Array5;
		this.aClass337Array2 = arg1.aClass337Array5;
		@Pc(550) int local550;
		@Pc(564) int local564;
		@Pc(606) int local606;
		if (arg1.aClass259Array1 != null) {
			this.anInt3930 = arg1.aClass259Array1.length;
			this.aClass254Array1 = new Class254[this.anInt3930];
			this.aClass183Array1 = new Class183[this.anInt3930];
			for (local550 = 0; local550 < this.anInt3930; local550++) {
				@Pc(557) Class259 local557 = arg1.aClass259Array1[local550];
				@Pc(562) Class291 local562 = Static283.method4472(local557.anInt7712);
				local564 = -1;
				for (@Pc(566) int local566 = 0; local566 < this.anInt3918; local566++) {
					if (local112[local566] == local557.anInt7713) {
						local564 = local566;
						break;
					}
				}
				if (local564 == -1) {
					throw new RuntimeException();
				}
				local606 = Static349.anIntArray394[arg1.aShortArray154[local557.anInt7713] & 0xFFFF] & 0xFFFFFF;
				@Pc(624) int local624 = local606 | 255 - (arg1.aByteArray104 == null ? 0 : arg1.aByteArray104[local557.anInt7713]) << 24;
				this.aClass183Array1[local550] = new Class183(local564, arg1.aShortArray158[local557.anInt7713], arg1.aShortArray152[local557.anInt7713], arg1.aShortArray161[local557.anInt7713], local562.anInt8273, local562.anInt8269, local562.anInt8275, local562.anInt8278, local562.anInt8276, local562.aBoolean617, local562.aBoolean616, local557.anInt7714);
				this.aClass254Array1[local550] = new Class254(local624);
			}
		}
		local550 = this.anInt3918 * 3;
		this.aShortArray45 = new short[local550];
		this.aShortArray49 = new short[local550];
		this.aFloatArray34 = new float[local550];
		this.aShortArray47 = new short[this.anInt3918];
		this.aShortArray46 = new short[this.anInt3918];
		if (arg1.aShortArray155 != null) {
			this.aShortArray50 = new short[this.anInt3918];
		}
		this.aShort65 = (short) arg4;
		Static54.aLongArray8 = new long[local550];
		this.aShort71 = (short) arg3;
		this.aShortArray48 = new short[this.anInt3918];
		this.aByteArray38 = new byte[local550];
		this.aShortArray55 = new short[local550];
		this.aFloatArray35 = new float[local550];
		this.aShortArray54 = new short[local550];
		this.aByteArray37 = new byte[this.anInt3918];
		this.aShortArray51 = new short[this.anInt3918];
		this.aShortArray53 = new short[this.anInt3918];
		local248 = 0;
		for (local437 = 0; local437 < arg1.anInt10276; local437++) {
			local564 = this.anIntArray271[local437];
			this.anIntArray271[local437] = local248;
			local522[local437] = new Class47();
			local248 += local564;
		}
		this.anIntArray271[arg1.anInt10276] = local248;
		@Pc(806) Class240 local806 = Static209.method3629(local112, this.anInt3918, arg1);
		@Pc(810) Class137[] local810 = new Class137[arg1.anInt10272];
		@Pc(850) int local850;
		@Pc(861) int local861;
		@Pc(883) int local883;
		@Pc(894) int local894;
		@Pc(903) int local903;
		@Pc(912) int local912;
		@Pc(829) short local829;
		@Pc(839) int local839;
		for (local606 = 0; local606 < arg1.anInt10272; local606++) {
			@Pc(819) short local819 = arg1.aShortArray158[local606];
			@Pc(824) short local824 = arg1.aShortArray152[local606];
			local829 = arg1.aShortArray161[local606];
			local839 = this.anIntArray272[local824] - this.anIntArray272[local819];
			local850 = this.anIntArray269[local824] - this.anIntArray269[local819];
			local861 = this.anIntArray268[local824] - this.anIntArray268[local819];
			@Pc(872) int local872 = this.anIntArray272[local829] - this.anIntArray272[local819];
			local883 = this.anIntArray269[local829] - this.anIntArray269[local819];
			local894 = this.anIntArray268[local829] - this.anIntArray268[local819];
			local903 = local894 * local850 - local861 * local883;
			local912 = local872 * local861 - local894 * local839;
			@Pc(921) int local921;
			for (local921 = local839 * local883 - local872 * local850; local903 > 8192 || local912 > 8192 || local921 > 8192 || local903 < -8192 || local912 < -8192 || local921 < -8192; local921 >>= 0x1) {
				local903 >>= 0x1;
				local912 >>= 0x1;
			}
			@Pc(974) int local974 = (int) Math.sqrt((double) (local921 * local921 + local912 * local912 + local903 * local903));
			if (local974 <= 0) {
				local974 = 1;
			}
			local912 = local912 * 256 / local974;
			local921 = local921 * 256 / local974;
			local903 = local903 * 256 / local974;
			@Pc(1009) byte local1009 = arg1.aByteArray103 == null ? 0 : arg1.aByteArray103[local606];
			if (local1009 == 0) {
				@Pc(1040) Class47 local1040 = local522[local819];
				local1040.anInt1156 += local903;
				local1040.anInt1157 += local912;
				local1040.anInt1158 += local921;
				local1040.anInt1159++;
				@Pc(1068) Class47 local1068 = local522[local824];
				local1068.anInt1159++;
				local1068.anInt1158 += local921;
				local1068.anInt1156 += local903;
				local1068.anInt1157 += local912;
				@Pc(1096) Class47 local1096 = local522[local829];
				local1096.anInt1156 += local903;
				local1096.anInt1159++;
				local1096.anInt1158 += local921;
				local1096.anInt1157 += local912;
			} else if (local1009 == 1) {
				@Pc(1025) Class137 local1025 = local810[local606] = new Class137();
				local1025.anInt4152 = local921;
				local1025.anInt4148 = local912;
				local1025.anInt4151 = local903;
			}
		}
		@Pc(1137) int local1137;
		@Pc(1180) short local1180;
		for (local261 = 0; local261 < this.anInt3918; local261++) {
			local1137 = local112[local261];
			@Pc(1144) int local1144 = arg1.aShortArray154[local1137] & 0xFFFF;
			if (arg1.aByteArray106 == null) {
				local839 = -1;
			} else {
				local839 = arg1.aByteArray106[local1137];
			}
			if (arg1.aByteArray104 == null) {
				local850 = 0;
			} else {
				local850 = arg1.aByteArray104[local1137] & 0xFF;
			}
			local1180 = arg1.aShortArray153 == null ? -1 : arg1.aShortArray153[local1137];
			if (local1180 != -1 && (this.anInt3944 & 0x40) != 0) {
				@Pc(1199) Class199 local1199 = local108.method6357(local1180 & 0xFFFF);
				if (local1199.aBoolean427) {
					local1180 = -1;
				}
			}
			@Pc(1206) float local1206 = 0.0F;
			@Pc(1208) float local1208 = 0.0F;
			@Pc(1210) float local1210 = 0.0F;
			@Pc(1212) float local1212 = 0.0F;
			@Pc(1214) float local1214 = 0.0F;
			@Pc(1216) float local1216 = 0.0F;
			@Pc(1218) byte local1218 = 0;
			@Pc(1220) byte local1220 = 0;
			@Pc(1222) int local1222 = 0;
			@Pc(1257) byte local1257;
			@Pc(1277) short local1277;
			@Pc(2068) short local2068;
			@Pc(2073) short local2073;
			if (local1180 != -1) {
				if (local839 == -1) {
					local1218 = 1;
					local1216 = 0.0F;
					local1206 = 0.0F;
					local1210 = 1.0F;
					local1212 = 1.0F;
					local1208 = 1.0F;
					local1214 = 0.0F;
					local1220 = 2;
				} else {
					local839 &= 0xFF;
					local1257 = arg1.aByteArray107[local839];
					@Pc(1267) short local1267;
					@Pc(1272) short local1272;
					@Pc(1310) float local1310;
					@Pc(1323) float local1323;
					@Pc(1417) float local1417;
					@Pc(1859) float local1859;
					@Pc(1867) float local1867;
					@Pc(1875) float local1875;
					@Pc(1898) float local1898;
					@Pc(1921) float local1921;
					@Pc(1944) float local1944;
					if (local1257 == 0) {
						local1267 = arg1.aShortArray158[local1137];
						local1272 = arg1.aShortArray152[local1137];
						local1277 = arg1.aShortArray161[local1137];
						local2068 = arg1.aShortArray160[local839];
						local2073 = arg1.aShortArray157[local839];
						@Pc(2078) short local2078 = arg1.aShortArray156[local839];
						@Pc(2084) float local2084 = (float) arg1.anIntArray743[local2068];
						@Pc(2090) float local2090 = (float) arg1.anIntArray752[local2068];
						local1310 = arg1.anIntArray751[local2068];
						local1323 = (float) arg1.anIntArray743[local2073] - local2084;
						local1417 = (float) arg1.anIntArray752[local2073] - local2090;
						@Pc(2121) float local2121 = (float) arg1.anIntArray751[local2073] - local1310;
						@Pc(2130) float local2130 = (float) arg1.anIntArray743[local2078] - local2084;
						@Pc(2138) float local2138 = (float) arg1.anIntArray752[local2078] - local2090;
						@Pc(2147) float local2147 = (float) arg1.anIntArray751[local2078] - local1310;
						@Pc(2156) float local2156 = (float) arg1.anIntArray743[local1267] - local2084;
						@Pc(2164) float local2164 = (float) arg1.anIntArray752[local1267] - local2090;
						@Pc(2173) float local2173 = (float) arg1.anIntArray751[local1267] - local1310;
						@Pc(2181) float local2181 = (float) arg1.anIntArray743[local1272] - local2084;
						@Pc(2190) float local2190 = (float) arg1.anIntArray752[local1272] - local2090;
						local1859 = (float) arg1.anIntArray751[local1272] - local1310;
						local1867 = (float) arg1.anIntArray743[local1277] - local2084;
						local1875 = (float) arg1.anIntArray752[local1277] - local2090;
						local1898 = (float) arg1.anIntArray751[local1277] - local1310;
						local1921 = local2147 * local1417 - local2121 * local2138;
						local1944 = local2130 * local2121 - local1323 * local2147;
						@Pc(2248) float local2248 = local2138 * local1323 - local1417 * local2130;
						@Pc(2256) float local2256 = local2248 * local2138 - local2147 * local1944;
						@Pc(2265) float local2265 = local2147 * local1921 - local2130 * local2248;
						@Pc(2273) float local2273 = local2130 * local1944 - local2138 * local1921;
						@Pc(2287) float local2287 = 1.0F / (local1417 * local2265 + local2256 * local1323 + local2121 * local2273);
						local1206 = (local2156 * local2256 + local2265 * local2164 + local2173 * local2273) * local2287;
						local1210 = (local2273 * local1859 + local2190 * local2265 + local2181 * local2256) * local2287;
						local1214 = local2287 * (local1898 * local2273 + local1867 * local2256 + local1875 * local2265);
						@Pc(2338) float local2338 = local1921 * local2121 - local1323 * local2248;
						@Pc(2346) float local2346 = local2248 * local1417 - local1944 * local2121;
						@Pc(2354) float local2354 = local1323 * local1944 - local1417 * local1921;
						@Pc(2368) float local2368 = 1.0F / (local2147 * local2354 + local2338 * local2138 + local2130 * local2346);
						local1216 = local2368 * (local2354 * local1898 + local1875 * local2338 + local2346 * local1867);
						local1208 = local2368 * (local2156 * local2346 + local2338 * local2164 + local2354 * local2173);
						local1212 = (local2338 * local2190 + local2181 * local2346 + local1859 * local2354) * local2368;
					} else {
						local1267 = arg1.aShortArray158[local1137];
						local1272 = arg1.aShortArray152[local1137];
						local1277 = arg1.aShortArray161[local1137];
						@Pc(1282) int local1282 = local806.anIntArray490[local839];
						@Pc(1287) int local1287 = local806.anIntArray489[local839];
						@Pc(1292) int local1292 = local806.anIntArray491[local839];
						@Pc(1297) float[] local1297 = local806.aFloatArrayArray10[local839];
						@Pc(1302) byte local1302 = arg1.aByteArray102[local839];
						local1310 = (float) arg1.anIntArray748[local839] / 256.0F;
						if (local1257 == 1) {
							local1323 = (float) arg1.anIntArray745[local839] / 1024.0F;
							Static581.method8032(local1302, local1292, local1297, local1287, Static259.aFloatArray42, local1323, arg1.anIntArray751[local1267], local1310, arg1.anIntArray752[local1267], arg1.anIntArray743[local1267], local1282);
							local1206 = Static259.aFloatArray42[0];
							local1208 = Static259.aFloatArray42[1];
							Static581.method8032(local1302, local1292, local1297, local1287, Static259.aFloatArray42, local1323, arg1.anIntArray751[local1272], local1310, arg1.anIntArray752[local1272], arg1.anIntArray743[local1272], local1282);
							local1210 = Static259.aFloatArray42[0];
							local1212 = Static259.aFloatArray42[1];
							Static581.method8032(local1302, local1292, local1297, local1287, Static259.aFloatArray42, local1323, arg1.anIntArray751[local1277], local1310, arg1.anIntArray752[local1277], arg1.anIntArray743[local1277], local1282);
							local1214 = Static259.aFloatArray42[0];
							local1216 = Static259.aFloatArray42[1];
							local1417 = local1323 / 2.0F;
							if ((local1302 & 0x1) == 0) {
								if (local1210 - local1206 > local1417) {
									local1210 -= local1323;
									local1218 = 1;
								} else if (local1206 - local1210 > local1417) {
									local1218 = 2;
									local1210 += local1323;
								}
								if (local1417 < local1214 - local1206) {
									local1220 = 1;
									local1214 -= local1323;
								} else if (local1417 < local1206 - local1214) {
									local1220 = 2;
									local1214 += local1323;
								}
							} else {
								if (local1417 < local1212 - local1208) {
									local1218 = 1;
									local1212 -= local1323;
								} else if (local1208 - local1212 > local1417) {
									local1218 = 2;
									local1212 += local1323;
								}
								if (local1417 < local1216 - local1208) {
									local1216 -= local1323;
									local1220 = 1;
								} else if (local1417 < local1208 - local1216) {
									local1216 += local1323;
									local1220 = 2;
								}
							}
						} else if (local1257 == 2) {
							local1323 = (float) arg1.anIntArray744[local839] / 256.0F;
							local1417 = (float) arg1.anIntArray746[local839] / 256.0F;
							@Pc(1771) int local1771 = arg1.anIntArray743[local1272] - arg1.anIntArray743[local1267];
							@Pc(1782) int local1782 = arg1.anIntArray752[local1272] - arg1.anIntArray752[local1267];
							@Pc(1793) int local1793 = arg1.anIntArray751[local1272] - arg1.anIntArray751[local1267];
							@Pc(1803) int local1803 = arg1.anIntArray743[local1277] - arg1.anIntArray743[local1267];
							@Pc(1813) int local1813 = arg1.anIntArray752[local1277] - arg1.anIntArray752[local1267];
							@Pc(1824) int local1824 = arg1.anIntArray751[local1277] - arg1.anIntArray751[local1267];
							@Pc(1833) int local1833 = local1782 * local1824 - local1793 * local1813;
							@Pc(1842) int local1842 = local1803 * local1793 - local1824 * local1771;
							@Pc(1851) int local1851 = local1813 * local1771 - local1803 * local1782;
							local1859 = 64.0F / (float) arg1.anIntArray747[local839];
							local1867 = 64.0F / (float) arg1.anIntArray749[local839];
							local1875 = 64.0F / (float) arg1.anIntArray745[local839];
							local1898 = ((float) local1833 * local1297[0] + local1297[1] * (float) local1842 + local1297[2] * (float) local1851) / local1859;
							local1921 = (local1297[5] * (float) local1851 + (float) local1842 * local1297[4] + (float) local1833 * local1297[3]) / local1867;
							local1944 = ((float) local1851 * local1297[8] + (float) local1842 * local1297[7] + (float) local1833 * local1297[6]) / local1875;
							local1222 = Static324.method4894(local1921, local1898, local1944);
							Static384.method5782(local1292, local1302, local1297, arg1.anIntArray743[local1267], local1323, local1282, local1417, Static259.aFloatArray42, arg1.anIntArray752[local1267], arg1.anIntArray751[local1267], local1310, local1287, local1222);
							local1206 = Static259.aFloatArray42[0];
							local1208 = Static259.aFloatArray42[1];
							Static384.method5782(local1292, local1302, local1297, arg1.anIntArray743[local1272], local1323, local1282, local1417, Static259.aFloatArray42, arg1.anIntArray752[local1272], arg1.anIntArray751[local1272], local1310, local1287, local1222);
							local1212 = Static259.aFloatArray42[1];
							local1210 = Static259.aFloatArray42[0];
							Static384.method5782(local1292, local1302, local1297, arg1.anIntArray743[local1277], local1323, local1282, local1417, Static259.aFloatArray42, arg1.anIntArray752[local1277], arg1.anIntArray751[local1277], local1310, local1287, local1222);
							local1216 = Static259.aFloatArray42[1];
							local1214 = Static259.aFloatArray42[0];
						} else if (local1257 == 3) {
							Static286.method6704(arg1.anIntArray752[local1267], local1292, arg1.anIntArray743[local1267], Static259.aFloatArray42, local1297, local1302, arg1.anIntArray751[local1267], local1282, local1310, local1287);
							local1206 = Static259.aFloatArray42[0];
							local1208 = Static259.aFloatArray42[1];
							Static286.method6704(arg1.anIntArray752[local1272], local1292, arg1.anIntArray743[local1272], Static259.aFloatArray42, local1297, local1302, arg1.anIntArray751[local1272], local1282, local1310, local1287);
							local1212 = Static259.aFloatArray42[1];
							local1210 = Static259.aFloatArray42[0];
							Static286.method6704(arg1.anIntArray752[local1277], local1292, arg1.anIntArray743[local1277], Static259.aFloatArray42, local1297, local1302, arg1.anIntArray751[local1277], local1282, local1310, local1287);
							local1216 = Static259.aFloatArray42[1];
							local1214 = Static259.aFloatArray42[0];
							if ((local1302 & 0x1) == 0) {
								if (local1214 - local1206 > 0.5F) {
									local1214--;
									local1220 = 1;
								} else if (local1206 - local1214 > 0.5F) {
									local1214++;
									local1220 = 2;
								}
								if (local1210 - local1206 > 0.5F) {
									local1218 = 1;
									local1210--;
								} else if (local1206 - local1210 > 0.5F) {
									local1218 = 2;
									local1210++;
								}
							} else {
								if (local1212 - local1208 > 0.5F) {
									local1212--;
									local1218 = 1;
								} else if (local1208 - local1212 > 0.5F) {
									local1218 = 2;
									local1212++;
								}
								if (local1216 - local1208 > 0.5F) {
									local1220 = 1;
									local1216--;
								} else if (local1208 - local1216 > 0.5F) {
									local1216++;
									local1220 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray103 == null) {
				local1257 = 0;
			} else {
				local1257 = arg1.aByteArray103[local1137];
			}
			if (local1257 == 0) {
				@Pc(2567) long local2567 = (long) (local839 << 2) + ((long) local850 + (long) (local1222 << 24) + (long) (local1144 << 8) << 32);
				local1277 = arg1.aShortArray158[local1137];
				local2068 = arg1.aShortArray152[local1137];
				local2073 = arg1.aShortArray161[local1137];
				@Pc(2586) Class47 local2586 = local522[local1277];
				this.aShortArray53[local261] = this.method3258(local2586.anInt1159, local2567, local2586.anInt1156, local2586.anInt1157, local1206, arg1, local1208, local2586.anInt1158, local1277);
				@Pc(2610) Class47 local2610 = local522[local2068];
				this.aShortArray48[local261] = this.method3258(local2610.anInt1159, (long) local1218 + local2567, local2610.anInt1156, local2610.anInt1157, local1210, arg1, local1212, local2610.anInt1158, local2068);
				@Pc(2637) Class47 local2637 = local522[local2073];
				this.aShortArray51[local261] = this.method3258(local2637.anInt1159, local2567 + (long) local1220, local2637.anInt1156, local2637.anInt1157, local1214, arg1, local1216, local2637.anInt1158, local2073);
			} else if (local1257 == 1) {
				@Pc(2431) Class137 local2431 = local810[local1137];
				@Pc(2472) long local2472 = ((long) local850 + (long) (local1144 << 8) + (long) (local1222 << 24) << 32) + (long) ((local2431.anInt4152 + 256 << 22) + (local2431.anInt4148 + 256 << 12) + (local839 << 2) + (local2431.anInt4151 > 0 ? 1024 : 2048));
				this.aShortArray53[local261] = this.method3258(0, local2472, local2431.anInt4151, local2431.anInt4148, local1206, arg1, local1208, local2431.anInt4152, arg1.aShortArray158[local1137]);
				this.aShortArray48[local261] = this.method3258(0, (long) local1218 + local2472, local2431.anInt4151, local2431.anInt4148, local1210, arg1, local1212, local2431.anInt4152, arg1.aShortArray152[local1137]);
				this.aShortArray51[local261] = this.method3258(0, local2472 + (long) local1220, local2431.anInt4151, local2431.anInt4148, local1214, arg1, local1216, local2431.anInt4152, arg1.aShortArray161[local1137]);
			}
			if (arg1.aByteArray104 != null) {
				this.aByteArray37[local261] = arg1.aByteArray104[local1137];
			}
			if (arg1.aShortArray155 != null) {
				this.aShortArray50[local261] = arg1.aShortArray155[local1137];
			}
			this.aShortArray46[local261] = arg1.aShortArray154[local1137];
			this.aShortArray47[local261] = local1180;
		}
		local1137 = 0;
		local829 = -10000;
		for (local839 = 0; local839 < this.anInt3906; local839++) {
			@Pc(2713) short local2713 = this.aShortArray47[local839];
			if (local829 != local2713) {
				local829 = local2713;
				local1137++;
			}
		}
		this.anIntArray270 = new int[local1137 + 1];
		local1137 = 0;
		local829 = -10000;
		for (local850 = 0; local850 < this.anInt3906; local850++) {
			local1180 = this.aShortArray47[local850];
			if (local1180 != local829) {
				local829 = local1180;
				this.anIntArray270[local1137++] = local850;
			}
		}
		this.anIntArray270[local1137] = this.anInt3906;
		Static54.aLongArray8 = null;
		this.aShortArray49 = Static95.method1658(this.aShortArray49, this.anInt3941);
		this.aShortArray55 = Static95.method1658(this.aShortArray55, this.anInt3941);
		this.aShortArray45 = Static95.method1658(this.aShortArray45, this.anInt3941);
		this.aByteArray38 = Static194.method3443(this.anInt3941, this.aByteArray38);
		this.aFloatArray35 = Static348.method6549(this.anInt3941, this.aFloatArray35);
		this.aFloatArray34 = Static348.method6549(this.anInt3941, this.aFloatArray34);
		if (arg1.anIntArray753 != null && Static163.method3043(this.anInt3944, arg2)) {
			this.anIntArrayArray28 = arg1.method8583(false);
		}
		if (arg1.aClass259Array1 != null && Static211.method6033(this.anInt3944, arg2)) {
			this.anIntArrayArray27 = arg1.method8598();
		}
		if (arg1.anIntArray754 != null && Static437.method6512(this.anInt3944, arg2)) {
			local861 = 0;
			@Pc(2862) int[] local2862 = new int[256];
			for (local883 = 0; local883 < this.anInt3918; local883++) {
				local894 = arg1.anIntArray754[local112[local883]];
				if (local894 >= 0) {
					if (local861 < local894) {
						local861 = local894;
					}
					@Pc(2891) int local2891 = local2862[local894]++;
				}
			}
			this.anIntArrayArray29 = new int[local861 + 1][];
			for (local894 = 0; local894 <= local861; local894++) {
				this.anIntArrayArray29[local894] = new int[local2862[local894]];
				local2862[local894] = 0;
			}
			for (local903 = 0; local903 < this.anInt3918; local903++) {
				local912 = arg1.anIntArray754[local112[local903]];
				if (local912 >= 0) {
					this.anIntArrayArray29[local912][local2862[local912]++] = local903;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7714(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static224.anInt4607 = 0;
			local29 = 0;
			Static394.anInt7089 = 0;
			Static259.anInt5080 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray28.length) {
					local55 = this.anIntArrayArray28[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static224.anInt4607 += this.anIntArray272[local63];
						Static394.anInt7089 += this.anIntArray269[local63];
						Static259.anInt5080 += this.anIntArray268[local63];
						local29++;
					}
				}
			}
			if (local29 <= 0) {
				Static259.anInt5080 = local17;
				Static394.anInt7089 = local25;
				Static224.anInt4607 = local21;
			} else {
				Static394.anInt7089 = local25 + Static394.anInt7089 / local29;
				Static259.anInt5080 = local17 + Static259.anInt5080 / local29;
				Static224.anInt4607 = local21 + Static224.anInt4607 / local29;
			}
			return;
		}
		@Pc(163) int[] local163;
		@Pc(165) int local165;
		if (arg0 == 1) {
			local21 = arg2 << 4;
			local17 = arg4 << 4;
			local25 = arg3 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray28.length > local35) {
					local163 = this.anIntArrayArray28[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local57 = local163[local165];
						this.anIntArray272[local57] += local21;
						this.anIntArray269[local57] += local25;
						this.anIntArray268[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(297) int local297;
		@Pc(744) int local744;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray28.length) {
					local163 = this.anIntArrayArray28[local35];
					if ((arg5 & 0x1) == 0) {
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							this.anIntArray272[local57] -= Static224.anInt4607;
							this.anIntArray269[local57] -= Static394.anInt7089;
							this.anIntArray268[local57] -= Static259.anInt5080;
							if (arg4 != 0) {
								local63 = Class353.anIntArray681[arg4];
								local278 = Class353.anIntArray682[arg4];
								local297 = this.anIntArray269[local57] * local63 + local278 * this.anIntArray272[local57] + 16383 >> 14;
								this.anIntArray269[local57] = this.anIntArray269[local57] * local278 + 16383 - this.anIntArray272[local57] * local63 >> 14;
								this.anIntArray272[local57] = local297;
							}
							if (arg2 != 0) {
								local63 = Class353.anIntArray681[arg2];
								local278 = Class353.anIntArray682[arg2];
								local297 = local278 * this.anIntArray269[local57] + 16383 - local63 * this.anIntArray268[local57] >> 14;
								this.anIntArray268[local57] = local278 * this.anIntArray268[local57] + local63 * this.anIntArray269[local57] + 16383 >> 14;
								this.anIntArray269[local57] = local297;
							}
							if (arg3 != 0) {
								local63 = Class353.anIntArray681[arg3];
								local278 = Class353.anIntArray682[arg3];
								local297 = this.anIntArray272[local57] * local278 + this.anIntArray268[local57] * local63 + 16383 >> 14;
								this.anIntArray268[local57] = this.anIntArray268[local57] * local278 + 16383 - this.anIntArray272[local57] * local63 >> 14;
								this.anIntArray272[local57] = local297;
							}
							this.anIntArray272[local57] += Static224.anInt4607;
							this.anIntArray269[local57] += Static394.anInt7089;
							this.anIntArray268[local57] += Static259.anInt5080;
						}
					} else {
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							this.anIntArray272[local57] -= Static224.anInt4607;
							this.anIntArray269[local57] -= Static394.anInt7089;
							this.anIntArray268[local57] -= Static259.anInt5080;
							if (arg2 != 0) {
								local63 = Class353.anIntArray681[arg2];
								local278 = Class353.anIntArray682[arg2];
								local297 = local278 * this.anIntArray269[local57] + 16383 - local63 * this.anIntArray268[local57] >> 14;
								this.anIntArray268[local57] = local63 * this.anIntArray269[local57] + this.anIntArray268[local57] * local278 + 16383 >> 14;
								this.anIntArray269[local57] = local297;
							}
							if (arg4 != 0) {
								local63 = Class353.anIntArray681[arg4];
								local278 = Class353.anIntArray682[arg4];
								local297 = this.anIntArray269[local57] * local63 + local278 * this.anIntArray272[local57] + 16383 >> 14;
								this.anIntArray269[local57] = local278 * this.anIntArray269[local57] + 16383 - this.anIntArray272[local57] * local63 >> 14;
								this.anIntArray272[local57] = local297;
							}
							if (arg3 != 0) {
								local63 = Class353.anIntArray681[arg3];
								local278 = Class353.anIntArray682[arg3];
								local297 = this.anIntArray268[local57] * local63 + this.anIntArray272[local57] * local278 + 16383 >> 14;
								this.anIntArray268[local57] = this.anIntArray268[local57] * local278 + 16383 - local63 * this.anIntArray272[local57] >> 14;
								this.anIntArray272[local57] = local297;
							}
							this.anIntArray272[local57] += Static224.anInt4607;
							this.anIntArray269[local57] += Static394.anInt7089;
							this.anIntArray268[local57] += Static259.anInt5080;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray28.length > local41) {
						local55 = this.anIntArrayArray28[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local278 = this.anIntArray271[local63];
							local297 = this.anIntArray271[local63 + 1];
							for (local744 = local278; local744 < local297; local744++) {
								@Pc(753) int local753 = this.aShortArray54[local744] - 1;
								if (local753 == -1) {
									break;
								}
								@Pc(763) int local763;
								@Pc(767) int local767;
								@Pc(785) int local785;
								if (arg4 != 0) {
									local763 = Class353.anIntArray681[arg4];
									local767 = Class353.anIntArray682[arg4];
									local785 = local767 * this.aShortArray49[local753] + local763 * this.aShortArray55[local753] + 16383 >> 14;
									this.aShortArray55[local753] = (short) (local767 * this.aShortArray55[local753] + 16383 - this.aShortArray49[local753] * local763 >> 14);
									this.aShortArray49[local753] = (short) local785;
								}
								if (arg2 != 0) {
									local763 = Class353.anIntArray681[arg2];
									local767 = Class353.anIntArray682[arg2];
									local785 = this.aShortArray55[local753] * local767 + 16383 - this.aShortArray45[local753] * local763 >> 14;
									this.aShortArray45[local753] = (short) (local767 * this.aShortArray45[local753] + this.aShortArray55[local753] * local763 + 16383 >> 14);
									this.aShortArray55[local753] = (short) local785;
								}
								if (arg3 != 0) {
									local763 = Class353.anIntArray681[arg3];
									local767 = Class353.anIntArray682[arg3];
									local785 = this.aShortArray45[local753] * local763 + this.aShortArray49[local753] * local767 + 16383 >> 14;
									this.aShortArray45[local753] = (short) (this.aShortArray45[local753] * local767 + 16383 - local763 * this.aShortArray49[local753] >> 14);
									this.aShortArray49[local753] = (short) local785;
								}
							}
						}
					}
				}
				if (this.aClass66_4 == null && this.aClass66_5 != null) {
					this.aClass66_5.anInterface23_1 = null;
				}
				if (this.aClass66_4 != null) {
					this.aClass66_4.anInterface23_1 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray28.length > local35) {
					local163 = this.anIntArrayArray28[local35];
					for (local165 = 0; local165 < local163.length; local165++) {
						local57 = local163[local165];
						this.anIntArray272[local57] -= Static224.anInt4607;
						this.anIntArray269[local57] -= Static394.anInt7089;
						this.anIntArray268[local57] -= Static259.anInt5080;
						this.anIntArray272[local57] = arg2 * this.anIntArray272[local57] >> 7;
						this.anIntArray269[local57] = this.anIntArray269[local57] * arg3 >> 7;
						this.anIntArray268[local57] = arg4 * this.anIntArray268[local57] >> 7;
						this.anIntArray272[local57] += Static224.anInt4607;
						this.anIntArray269[local57] += Static394.anInt7089;
						this.anIntArray268[local57] += Static259.anInt5080;
					}
				}
			}
		} else {
			@Pc(1197) Class183 local1197;
			@Pc(1202) Class254 local1202;
			if (arg0 == 5) {
				if (this.anIntArrayArray29 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray29.length) {
							local163 = this.anIntArrayArray29[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local57 = local163[local165];
								local63 = (this.aByteArray37[local57] & 0xFF) + arg2 * 8;
								if (local63 < 0) {
									local63 = 0;
								} else if (local63 > 255) {
									local63 = 255;
								}
								this.aByteArray37[local57] = (byte) local63;
							}
							if (local163.length > 0 && this.aClass66_5 != null) {
								this.aClass66_5.anInterface23_1 = null;
							}
						}
					}
					if (this.aClass183Array1 != null) {
						for (local35 = 0; local35 < this.anInt3930; local35++) {
							local1197 = this.aClass183Array1[local35];
							local1202 = this.aClass254Array1[local35];
							local1202.anInt7683 = local1202.anInt7683 & 0xFFFFFF | 255 - (this.aByteArray37[local1197.anInt5316] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1451) Class254 local1451;
				if (arg0 == 8) {
					if (this.anIntArrayArray27 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray27.length) {
								local163 = this.anIntArrayArray27[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1451 = this.aClass254Array1[local163[local165]];
									local1451.anInt7686 += arg2;
									local1451.anInt7690 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray27 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray27.length > local35) {
								local163 = this.anIntArrayArray27[local35];
								for (local165 = 0; local165 < local163.length; local165++) {
									local1451 = this.aClass254Array1[local163[local165]];
									local1451.anInt7680 = local1451.anInt7680 * arg3 >> 7;
									local1451.anInt7688 = arg2 * local1451.anInt7688 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray27 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray27.length) {
							local163 = this.anIntArrayArray27[local35];
							for (local165 = 0; local165 < local163.length; local165++) {
								local1451 = this.aClass254Array1[local163[local165]];
								local1451.anInt7684 = local1451.anInt7684 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray29 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray29.length > local35) {
						local163 = this.anIntArrayArray29[local35];
						for (local165 = 0; local165 < local163.length; local165++) {
							local57 = local163[local165];
							local63 = this.aShortArray46[local57] & 0xFFFF;
							local278 = local63 >> 10 & 0x3F;
							local297 = local63 >> 7 & 0x7;
							@Pc(1286) int local1286 = arg2 + local278 & 0x3F;
							local297 += arg3 / 4;
							local744 = local63 & 0x7F;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 > 7) {
								local297 = 7;
							}
							local744 += arg4;
							if (local744 < 0) {
								local744 = 0;
							} else if (local744 > 127) {
								local744 = 127;
							}
							this.aShortArray46[local57] = (short) (local744 | local297 << 7 | local1286 << 10);
						}
						if (local163.length > 0 && this.aClass66_5 != null) {
							this.aClass66_5.anInterface23_1 = null;
						}
					}
				}
				if (this.aClass183Array1 != null) {
					for (local35 = 0; local35 < this.anInt3930; local35++) {
						local1197 = this.aClass183Array1[local35];
						local1202 = this.aClass254Array1[local35];
						local1202.anInt7683 = local1202.anInt7683 & 0xFF000000 | Static349.anIntArray394[this.aShortArray46[local1197.anInt5316] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "e", descriptor = "()V")
	@Override
	protected void method7729() {
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IBISI)I")
	private int method3248(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = Static349.anIntArray394[Static461.method6716(arg3, arg1)];
		if (arg2 != -1) {
			@Pc(25) Class199 local25 = this.aClass87_Sub2_8.anInterface6_11.method6357(arg2 & 0xFFFF);
			@Pc(30) int local30 = local25.aByte84 & 0xFF;
			@Pc(47) int local47;
			@Pc(67) int local67;
			if (local30 != 0) {
				if (arg3 < 0) {
					local47 = 0;
				} else if (arg3 <= 127) {
					local47 = arg3 * 131586;
				} else {
					local47 = 16777215;
				}
				if (local30 == 256) {
					local12 = local47;
				} else {
					local67 = 256 - local30;
					local12 = ((local47 & 0xFF00FF) * local30 + local67 * (local12 & 0xFF00FF) & 0xFF00FF00) + (local67 * (local12 & 0xFF00) + local30 * (local47 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local47 = local25.aByte83 & 0xFF;
			if (local47 != 0) {
				local47 += 256;
				@Pc(119) int local119 = local47 * (local12 >> 16 & 0xFF);
				if (local119 > 65535) {
					local119 = 65535;
				}
				local67 = local47 * (local12 >> 8 & 0xFF);
				if (local67 > 65535) {
					local67 = 65535;
				}
				@Pc(145) int local145 = local47 * (local12 & 0xFF);
				if (local145 > 65535) {
					local145 = 65535;
				}
				local12 = (local119 << 8 & 0xFF001D) - (-(local67 & 0xFF00) - (local145 >> 8));
			}
		}
		return (local12 << 8) + 255 - (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!gea", name = "c", descriptor = "()[Lclient!uga;")
	@Override
	public Class337[] method7724() {
		return this.aClass337Array2;
	}

	@OriginalMember(owner = "client!gea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Z)V")
	private void method3249() {
		if (this.anInt3906 == 0) {
			return;
		}
		if (this.aByte72 != 0) {
			this.method3257(true);
		}
		this.method3257(false);
		if (this.aClass157_1 != null) {
			if (this.aClass157_1.anInterface9_3 == null) {
				this.method3254((this.aByte72 & 0x10) != 0);
			}
			if (this.aClass157_1.anInterface9_3 != null) {
				this.aClass87_Sub2_8.method6205(this.aClass66_4 != null);
				this.aClass87_Sub2_8.method6151(this.aClass66_3, this.aClass66_4, this.aClass66_5, this.aClass66_6);
				@Pc(80) int local80 = this.anIntArray270.length - 1;
				for (@Pc(82) int local82 = 0; local82 < local80; local82++) {
					@Pc(89) int local89 = this.anIntArray270[local82];
					@Pc(96) int local96 = this.anIntArray270[local82 + 1];
					@Pc(103) int local103 = this.aShortArray47[local89] & 0xFFFF;
					if (local103 == 65535) {
						local103 = -1;
					}
					this.aClass87_Sub2_8.method6193(local103, this.aClass66_4 != null);
					this.aClass87_Sub2_8.method6162((local96 - local89) * 3, this.aClass157_1.anInterface9_3, local89 * 3);
				}
			}
		}
		this.method3253();
	}

	@OriginalMember(owner = "client!gea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort62;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!kd;ZII)Z")
	@Override
	public boolean method7730(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3259(arg4, arg0, arg1, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!gea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean332;
	}

	@OriginalMember(owner = "client!gea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3925; local3++) {
			if (arg0 != 0) {
				this.anIntArray272[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray269[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray268[local3] += arg2;
			}
		}
		this.aBoolean331 = false;
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "()V")
	@Override
	protected void method7718() {
	}

	@OriginalMember(owner = "client!gea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		if (this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
		}
		this.aShort65 = (short) arg0;
		if (this.aClass66_4 != null) {
			this.aClass66_4.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZZLclient!gea;ILclient!gea;)Lclient!ka;")
	private Class25 method3250(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class25_Sub2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class25_Sub2 arg4) {
		arg4.aShort71 = this.aShort71;
		arg4.aByte72 = 0;
		arg4.anInt3906 = this.anInt3906;
		arg4.anInt3918 = this.anInt3918;
		arg4.aShort65 = this.aShort65;
		arg4.anInt3944 = this.anInt3944;
		arg4.anInt3925 = this.anInt3925;
		arg4.anInt3941 = this.anInt3941;
		arg4.anInt3930 = this.anInt3930;
		arg4.anInt3903 = this.anInt3903;
		if ((arg3 & 0x100) == 0) {
			arg4.aBoolean332 = this.aBoolean332;
		} else {
			arg4.aBoolean332 = true;
		}
		arg4.aBoolean334 = this.aBoolean334;
		arg4.anInt3904 = arg3;
		@Pc(70) boolean local70 = Static588.method8115(this.anInt3944, arg3);
		@Pc(76) boolean local76 = Static571.method7845(arg3, this.anInt3944);
		@Pc(82) boolean local82 = Static491.method7021(arg3, this.anInt3944);
		@Pc(88) boolean local88 = local82 | local76 | local70;
		@Pc(193) int local193;
		if (local88) {
			if (!local70) {
				arg4.anIntArray272 = this.anIntArray272;
			} else if (arg2.anIntArray272 == null || arg2.anIntArray272.length < this.anInt3903) {
				arg4.anIntArray272 = arg2.anIntArray272 = new int[this.anInt3903];
			} else {
				arg4.anIntArray272 = arg2.anIntArray272;
			}
			if (!local76) {
				arg4.anIntArray269 = this.anIntArray269;
			} else if (arg2.anIntArray269 == null || arg2.anIntArray269.length < this.anInt3903) {
				arg4.anIntArray269 = arg2.anIntArray269 = new int[this.anInt3903];
			} else {
				arg4.anIntArray269 = arg2.anIntArray269;
			}
			if (!local82) {
				arg4.anIntArray268 = this.anIntArray268;
			} else if (arg2.anIntArray268 == null || arg2.anIntArray268.length < this.anInt3903) {
				arg4.anIntArray268 = arg2.anIntArray268 = new int[this.anInt3903];
			} else {
				arg4.anIntArray268 = arg2.anIntArray268;
			}
			for (local193 = 0; local193 < this.anInt3903; local193++) {
				if (local70) {
					arg4.anIntArray272[local193] = this.anIntArray272[local193];
				}
				if (local76) {
					arg4.anIntArray269[local193] = this.anIntArray269[local193];
				}
				if (local82) {
					arg4.anIntArray268[local193] = this.anIntArray268[local193];
				}
			}
		} else {
			arg4.anIntArray269 = this.anIntArray269;
			arg4.anIntArray268 = this.anIntArray268;
			arg4.anIntArray272 = this.anIntArray272;
		}
		if (Static395.method2908(this.anInt3944, arg3)) {
			arg4.aClass66_3 = arg2.aClass66_3;
			if (arg1) {
				arg4.aByte72 = (byte) (arg4.aByte72 | 0x1);
			}
			arg4.aClass66_3.anInterface23_1 = this.aClass66_3.anInterface23_1;
			arg4.aClass66_3.aByte43 = this.aClass66_3.aByte43;
		} else if (Static486.method6974(arg3, this.anInt3944)) {
			arg4.aClass66_3 = this.aClass66_3;
		} else {
			arg4.aClass66_3 = null;
		}
		if (Static451.method6640(arg3, this.anInt3944)) {
			if (arg2.aShortArray46 == null || this.anInt3918 > arg2.aShortArray46.length) {
				arg4.aShortArray46 = arg2.aShortArray46 = new short[this.anInt3918];
			} else {
				arg4.aShortArray46 = arg2.aShortArray46;
			}
			for (local193 = 0; local193 < this.anInt3918; local193++) {
				arg4.aShortArray46[local193] = this.aShortArray46[local193];
			}
		} else {
			arg4.aShortArray46 = this.aShortArray46;
		}
		if (Static318.method4821(arg3, this.anInt3944)) {
			if (arg2.aByteArray37 == null || this.anInt3918 > arg2.aByteArray37.length) {
				arg4.aByteArray37 = arg2.aByteArray37 = new byte[this.anInt3918];
			} else {
				arg4.aByteArray37 = arg2.aByteArray37;
			}
			for (local193 = 0; local193 < this.anInt3918; local193++) {
				arg4.aByteArray37[local193] = this.aByteArray37[local193];
			}
		} else {
			arg4.aByteArray37 = this.aByteArray37;
		}
		if (Static370.method5584(this.anInt3944, arg3)) {
			if (arg1) {
				arg4.aByte72 = (byte) (arg4.aByte72 | 0x2);
			}
			arg4.aClass66_5 = arg2.aClass66_5;
			arg4.aClass66_5.aByte43 = this.aClass66_5.aByte43;
			arg4.aClass66_5.anInterface23_1 = this.aClass66_5.anInterface23_1;
		} else if (Static158.method2968(arg3, this.anInt3944)) {
			arg4.aClass66_5 = this.aClass66_5;
		} else {
			arg4.aClass66_5 = null;
		}
		@Pc(603) int local603;
		if (Static296.method4637(this.anInt3944, arg3)) {
			if (arg2.aShortArray49 == null || arg2.aShortArray49.length < this.anInt3941) {
				local193 = this.anInt3941;
				arg4.aShortArray55 = arg2.aShortArray55 = new short[local193];
				arg4.aShortArray49 = arg2.aShortArray49 = new short[local193];
				arg4.aShortArray45 = arg2.aShortArray45 = new short[local193];
			} else {
				arg4.aShortArray55 = arg2.aShortArray55;
				arg4.aShortArray49 = arg2.aShortArray49;
				arg4.aShortArray45 = arg2.aShortArray45;
			}
			if (this.aClass90_1 == null) {
				for (local193 = 0; local193 < this.anInt3941; local193++) {
					arg4.aShortArray49[local193] = this.aShortArray49[local193];
					arg4.aShortArray55[local193] = this.aShortArray55[local193];
					arg4.aShortArray45[local193] = this.aShortArray45[local193];
				}
			} else {
				if (arg2.aClass90_1 == null) {
					arg2.aClass90_1 = new Class90();
				}
				@Pc(591) Class90 local591 = arg4.aClass90_1 = arg2.aClass90_1;
				if (local591.aShortArray36 == null || local591.aShortArray36.length < this.anInt3941) {
					local603 = this.anInt3941;
					local591.aShortArray36 = new short[local603];
					local591.aShortArray34 = new short[local603];
					local591.aByteArray28 = new byte[local603];
					local591.aShortArray35 = new short[local603];
				}
				for (local603 = 0; local603 < this.anInt3941; local603++) {
					arg4.aShortArray49[local603] = this.aShortArray49[local603];
					arg4.aShortArray55[local603] = this.aShortArray55[local603];
					arg4.aShortArray45[local603] = this.aShortArray45[local603];
					local591.aShortArray36[local603] = this.aClass90_1.aShortArray36[local603];
					local591.aShortArray35[local603] = this.aClass90_1.aShortArray35[local603];
					local591.aShortArray34[local603] = this.aClass90_1.aShortArray34[local603];
					local591.aByteArray28[local603] = this.aClass90_1.aByteArray28[local603];
				}
			}
			arg4.aByteArray38 = this.aByteArray38;
		} else {
			arg4.aByteArray38 = this.aByteArray38;
			arg4.aShortArray45 = this.aShortArray45;
			arg4.aShortArray49 = this.aShortArray49;
			arg4.aClass90_1 = this.aClass90_1;
			arg4.aShortArray55 = this.aShortArray55;
		}
		if (Static480.method6933(arg3, this.anInt3944)) {
			arg4.aClass66_4 = arg2.aClass66_4;
			if (arg1) {
				arg4.aByte72 = (byte) (arg4.aByte72 | 0x4);
			}
			arg4.aClass66_4.aByte43 = this.aClass66_4.aByte43;
			arg4.aClass66_4.anInterface23_1 = this.aClass66_4.anInterface23_1;
		} else if (Static305.method4707(this.anInt3944, arg3)) {
			arg4.aClass66_4 = this.aClass66_4;
		} else {
			arg4.aClass66_4 = null;
		}
		if (Static248.method4049(arg3, this.anInt3944)) {
			if (arg2.aFloatArray35 == null || arg2.aFloatArray35.length < this.anInt3918) {
				local193 = this.anInt3941;
				arg4.aFloatArray34 = arg2.aFloatArray34 = new float[local193];
				arg4.aFloatArray35 = arg2.aFloatArray35 = new float[local193];
			} else {
				arg4.aFloatArray34 = arg2.aFloatArray34;
				arg4.aFloatArray35 = arg2.aFloatArray35;
			}
			for (local193 = 0; local193 < this.anInt3941; local193++) {
				arg4.aFloatArray35[local193] = this.aFloatArray35[local193];
				arg4.aFloatArray34[local193] = this.aFloatArray34[local193];
			}
		} else {
			arg4.aFloatArray35 = this.aFloatArray35;
			arg4.aFloatArray34 = this.aFloatArray34;
		}
		if (Static518.method7273(arg3, this.anInt3944)) {
			if (arg1) {
				arg4.aByte72 = (byte) (arg4.aByte72 | 0x8);
			}
			arg4.aClass66_6 = arg2.aClass66_6;
			arg4.aClass66_6.anInterface23_1 = this.aClass66_6.anInterface23_1;
			arg4.aClass66_6.aByte43 = this.aClass66_6.aByte43;
		} else if (Static486.method6977(this.anInt3944, arg3)) {
			arg4.aClass66_6 = this.aClass66_6;
		} else {
			arg4.aClass66_6 = null;
		}
		if (Static556.method7709(arg3, this.anInt3944)) {
			if (arg2.aShortArray53 == null || this.anInt3918 > arg2.aShortArray53.length) {
				local193 = this.anInt3918;
				arg4.aShortArray53 = arg2.aShortArray53 = new short[local193];
				arg4.aShortArray51 = arg2.aShortArray51 = new short[local193];
				arg4.aShortArray48 = arg2.aShortArray48 = new short[local193];
			} else {
				arg4.aShortArray51 = arg2.aShortArray51;
				arg4.aShortArray53 = arg2.aShortArray53;
				arg4.aShortArray48 = arg2.aShortArray48;
			}
			for (local193 = 0; local193 < this.anInt3918; local193++) {
				arg4.aShortArray53[local193] = this.aShortArray53[local193];
				arg4.aShortArray48[local193] = this.aShortArray48[local193];
				arg4.aShortArray51[local193] = this.aShortArray51[local193];
			}
		} else {
			arg4.aShortArray53 = this.aShortArray53;
			arg4.aShortArray51 = this.aShortArray51;
			arg4.aShortArray48 = this.aShortArray48;
		}
		if (Static161.method3020(arg3, this.anInt3944)) {
			arg4.aClass157_1 = arg2.aClass157_1;
			if (arg1) {
				arg4.aByte72 = (byte) (arg4.aByte72 | 0x10);
			}
			arg4.aClass157_1.anInterface9_3 = this.aClass157_1.anInterface9_3;
		} else if (Static321.method8560(arg3, this.anInt3944)) {
			arg4.aClass157_1 = this.aClass157_1;
		} else {
			arg4.aClass157_1 = null;
		}
		if (Static58.method1085(arg3, this.anInt3944)) {
			if (arg2.aShortArray47 == null || arg2.aShortArray47.length < this.anInt3918) {
				local193 = this.anInt3918;
				arg4.aShortArray47 = arg2.aShortArray47 = new short[local193];
			} else {
				arg4.aShortArray47 = arg2.aShortArray47;
			}
			for (local193 = 0; local193 < this.anInt3918; local193++) {
				arg4.aShortArray47[local193] = this.aShortArray47[local193];
			}
		} else {
			arg4.aShortArray47 = this.aShortArray47;
		}
		if (!Static40.method837(arg3, this.anInt3944)) {
			arg4.aClass254Array1 = this.aClass254Array1;
		} else if (arg2.aClass254Array1 == null || this.anInt3930 > arg2.aClass254Array1.length) {
			local193 = this.anInt3930;
			arg4.aClass254Array1 = arg2.aClass254Array1 = new Class254[local193];
			for (local603 = 0; local603 < this.anInt3930; local603++) {
				arg4.aClass254Array1[local603] = this.aClass254Array1[local603].method6422();
			}
		} else {
			arg4.aClass254Array1 = arg2.aClass254Array1;
			for (local193 = 0; local193 < this.anInt3930; local193++) {
				arg4.aClass254Array1[local193].method6424(this.aClass254Array1[local193]);
			}
		}
		arg4.aShortArray52 = this.aShortArray52;
		arg4.aClass183Array1 = this.aClass183Array1;
		arg4.aClass337Array2 = this.aClass337Array2;
		arg4.anIntArrayArray28 = this.anIntArrayArray28;
		arg4.aShortArray54 = this.aShortArray54;
		arg4.anIntArrayArray27 = this.anIntArrayArray27;
		arg4.aShortArray50 = this.aShortArray50;
		arg4.anIntArray270 = this.anIntArray270;
		arg4.anIntArrayArray29 = this.anIntArrayArray29;
		arg4.aClass130Array2 = this.aClass130Array2;
		arg4.anIntArray271 = this.anIntArray271;
		if (this.aBoolean331) {
			arg4.aShort63 = this.aShort63;
			arg4.aShort62 = this.aShort62;
			arg4.aBoolean331 = true;
			arg4.aShort69 = this.aShort69;
			arg4.aShort67 = this.aShort67;
			arg4.aShort68 = this.aShort68;
			arg4.aShort64 = this.aShort64;
			arg4.aShort66 = this.aShort66;
			arg4.aShort70 = this.aShort70;
		} else {
			arg4.aBoolean331 = false;
		}
		return arg4;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
	private void method3251() {
		if (this.aClass183Array1 == null) {
			return;
		}
		@Pc(16) Class6_Sub1 local16 = this.aClass87_Sub2_8.aClass6_Sub1_2;
		this.aClass87_Sub2_8.method6186();
		this.aClass87_Sub2_8.C(!this.aBoolean332);
		this.aClass87_Sub2_8.method6205(false);
		this.aClass87_Sub2_8.method6151(this.aClass87_Sub2_8.aClass66_12, null, null, this.aClass87_Sub2_8.aClass66_11);
		for (@Pc(48) int local48 = 0; local48 < this.anInt3930; local48++) {
			@Pc(55) Class183 local55 = this.aClass183Array1[local48];
			@Pc(60) Class254 local60 = this.aClass254Array1[local48];
			if (!local55.aBoolean409 || !this.aClass87_Sub2_8.method7914()) {
				@Pc(88) float local88 = (float) (this.anIntArray272[local55.anInt5323] + this.anIntArray272[local55.anInt5324] + this.anIntArray272[local55.anInt5320]) * 0.3333333F;
				@Pc(110) float local110 = (float) (this.anIntArray269[local55.anInt5324] + this.anIntArray269[local55.anInt5320] + this.anIntArray269[local55.anInt5323]) * 0.3333333F;
				@Pc(133) float local133 = (float) (this.anIntArray268[local55.anInt5320] + this.anIntArray268[local55.anInt5324] + this.anIntArray268[local55.anInt5323]) * 0.3333333F;
				@Pc(147) float local147 = local110 * Static68.aFloat31 + local88 * Static532.aFloat217 + local133 * Static259.aFloat119 + Static416.aFloat187;
				@Pc(161) float local161 = Static299.aFloat129 + local133 * Static603.aFloat222 + Static251.aFloat116 * local88 + Static8.aFloat14 * local110;
				@Pc(175) float local175 = Static257.aFloat118 * local133 + local110 * Static128.aFloat69 + Static408.aFloat185 * local88 + Static58.aFloat26;
				@Pc(196) float local196 = (float) (1.0D / Math.sqrt((double) (local175 * local175 + local147 * local147 + local161 * local161))) * (float) local55.anInt5325;
				local16.method111((float) local60.anInt7686 + local147 - local196 * local147, local60.anInt7680 * local55.aShort81 >> 7, local60.anInt7688 * local55.aShort80 >> 7, local196 * local175 - local175, local60.anInt7684, local196 * local161 + (float) local60.anInt7690 - local161);
				this.aClass87_Sub2_8.method6153(local16);
				@Pc(249) int local249 = local60.anInt7683;
				OpenGL.glColor4ub((byte) (local249 >> 16), (byte) (local249 >> 8), (byte) local249, (byte) (local249 >> 24));
				this.aClass87_Sub2_8.method6228(local55.aShort79);
				this.aClass87_Sub2_8.method6196(local55.aByte80);
				this.aClass87_Sub2_8.method6212(4);
			}
		}
		this.aClass87_Sub2_8.C(true);
		this.aClass87_Sub2_8.method6149();
	}

	@OriginalMember(owner = "client!gea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3918; local7++) {
			if (arg0 == this.aShortArray46[local7]) {
				this.aShortArray46[local7] = arg1;
			}
		}
		if (this.aClass183Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt3930; local30++) {
				@Pc(37) Class183 local37 = this.aClass183Array1[local30];
				@Pc(42) Class254 local42 = this.aClass254Array1[local30];
				local42.anInt7683 = local42.anInt7683 & 0xFF000000 | Static349.anIntArray394[this.aShortArray46[local37.anInt5316] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!kd;IZ)V")
	@Override
	public void method7734(@OriginalArg(0) Class6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray52 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt3925; local14++) {
			if ((this.aShortArray52[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method6713(this.anIntArray272[local14], this.anIntArray269[local14], this.anIntArray268[local14], local12);
				} else {
					arg0.method6702(this.anIntArray272[local14], this.anIntArray269[local14], this.anIntArray268[local14], local12);
				}
				this.anIntArray272[local14] = local12[0];
				this.anIntArray269[local14] = local12[1];
				this.anIntArray268[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3925; local15++) {
			@Pc(34) int local34 = this.anIntArray269[local15] * local13 - this.anIntArray268[local15] * local9 >> 14;
			this.anIntArray268[local15] = local9 * this.anIntArray269[local15] + local13 * this.anIntArray268[local15] >> 14;
			this.anIntArray269[local15] = local34;
		}
		this.aBoolean331 = false;
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!kd;Lclient!ig;II)V")
	@Override
	public void method7725(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt3941 == 0) {
			return;
		}
		@Pc(16) Class6_Sub1 local16 = this.aClass87_Sub2_8.aClass6_Sub1_3;
		@Pc(19) Class6_Sub1 local19 = (Class6_Sub1) arg0;
		if (!this.aBoolean331) {
			this.method3260();
		}
		Static128.aFloat69 = local16.aFloat2 * local19.aFloat6 + local19.aFloat5 * local16.aFloat6 + local16.aFloat3 * local19.aFloat7;
		Static58.aFloat26 = local16.aFloat12 + local19.aFloat11 * local16.aFloat3 + local19.aFloat9 * local16.aFloat6 + local19.aFloat12 * local16.aFloat2;
		@Pc(72) float local72 = Static128.aFloat69 * (float) this.aShort63 + Static58.aFloat26;
		@Pc(80) float local80 = Static58.aFloat26 + (float) this.aShort62 * Static128.aFloat69;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = local72 + (float) this.aShort69;
			local97 = (float) -this.aShort69 + local80;
		} else {
			local90 = local80 + (float) this.aShort69;
			local97 = local72 - (float) this.aShort69;
		}
		if (this.aClass87_Sub2_8.aFloat172 <= local97 || (float) this.aClass87_Sub2_8.anInt7397 >= local90) {
			return;
		}
		Static416.aFloat187 = local16.aFloat7 * local19.aFloat9 + local19.aFloat11 * local16.aFloat4 + local19.aFloat12 * local16.aFloat8 + local16.aFloat11;
		Static68.aFloat31 = local19.aFloat6 * local16.aFloat8 + local16.aFloat7 * local19.aFloat5 + local16.aFloat4 * local19.aFloat7;
		@Pc(173) float local173 = (float) this.aShort63 * Static68.aFloat31 + Static416.aFloat187;
		@Pc(181) float local181 = Static416.aFloat187 + (float) this.aShort62 * Static68.aFloat31;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (local173 + (float) this.aShort69) * (float) this.aClass87_Sub2_8.anInt7409;
			local207 = (float) this.aClass87_Sub2_8.anInt7409 * ((float) -this.aShort69 + local181);
		} else {
			local196 = (float) this.aClass87_Sub2_8.anInt7409 * ((float) this.aShort69 + local181);
			local207 = (float) this.aClass87_Sub2_8.anInt7409 * (local173 - (float) this.aShort69);
		}
		if (local207 / (float) arg2 >= this.aClass87_Sub2_8.aFloat171 || local196 / (float) arg2 <= this.aClass87_Sub2_8.aFloat181) {
			return;
		}
		Static299.aFloat129 = local16.aFloat13 * local19.aFloat12 + local19.aFloat9 * local16.aFloat5 + local19.aFloat11 * local16.aFloat10 + local16.aFloat9;
		Static8.aFloat14 = local16.aFloat5 * local19.aFloat5 + local16.aFloat10 * local19.aFloat7 + local16.aFloat13 * local19.aFloat6;
		@Pc(299) float local299 = Static8.aFloat14 * (float) this.aShort63 + Static299.aFloat129;
		@Pc(307) float local307 = Static8.aFloat14 * (float) this.aShort62 + Static299.aFloat129;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = (local299 + (float) this.aShort69) * (float) this.aClass87_Sub2_8.anInt7384;
			local333 = (local307 - (float) this.aShort69) * (float) this.aClass87_Sub2_8.anInt7384;
		} else {
			local333 = ((float) -this.aShort69 + local299) * (float) this.aClass87_Sub2_8.anInt7384;
			local322 = (local307 + (float) this.aShort69) * (float) this.aClass87_Sub2_8.anInt7384;
		}
		if (this.aClass87_Sub2_8.aFloat170 <= local333 / (float) arg2 || this.aClass87_Sub2_8.aFloat167 >= local322 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass183Array1 != null) {
			Static532.aFloat217 = local16.aFloat8 * local19.aFloat3 + local19.aFloat4 * local16.aFloat4 + local19.aFloat10 * local16.aFloat7;
			Static257.aFloat118 = local19.aFloat13 * local16.aFloat6 + local19.aFloat8 * local16.aFloat3 + local19.aFloat2 * local16.aFloat2;
			Static251.aFloat116 = local16.aFloat5 * local19.aFloat10 + local16.aFloat10 * local19.aFloat4 + local19.aFloat3 * local16.aFloat13;
			Static408.aFloat185 = local16.aFloat6 * local19.aFloat10 + local16.aFloat3 * local19.aFloat4 + local16.aFloat2 * local19.aFloat3;
			Static259.aFloat119 = local19.aFloat2 * local16.aFloat8 + local16.aFloat7 * local19.aFloat13 + local19.aFloat8 * local16.aFloat4;
			Static603.aFloat222 = local16.aFloat13 * local19.aFloat2 + local16.aFloat5 * local19.aFloat13 + local19.aFloat8 * local16.aFloat10;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.aShort64 + this.aShort70 >> 1;
			@Pc(509) int local509 = this.aShort68 + this.aShort67 >> 1;
			@Pc(528) int local528 = (int) (Static416.aFloat187 + (float) local501 * Static532.aFloat217 + Static68.aFloat31 * (float) this.aShort63 + (float) local509 * Static259.aFloat119);
			@Pc(547) int local547 = (int) ((float) local501 * Static251.aFloat116 + Static299.aFloat129 + (float) this.aShort63 * Static8.aFloat14 + Static603.aFloat222 * (float) local509);
			@Pc(566) int local566 = (int) ((float) this.aShort63 * Static128.aFloat69 + Static58.aFloat26 + Static408.aFloat185 * (float) local501 + Static257.aFloat118 * (float) local509);
			@Pc(585) int local585 = (int) ((float) local509 * Static259.aFloat119 + Static68.aFloat31 * (float) this.aShort62 + Static532.aFloat217 * (float) local501 + Static416.aFloat187);
			@Pc(604) int local604 = (int) (Static603.aFloat222 * (float) local509 + (float) this.aShort62 * Static8.aFloat14 + (float) local501 * Static251.aFloat116 + Static299.aFloat129);
			@Pc(623) int local623 = (int) (Static58.aFloat26 + (float) local501 * Static408.aFloat185 + (float) this.aShort62 * Static128.aFloat69 + Static257.aFloat118 * (float) local509);
			arg1.anInt4697 = this.aClass87_Sub2_8.anInt7379 + this.aClass87_Sub2_8.anInt7384 * local604 / arg2;
			arg1.anInt4698 = this.aClass87_Sub2_8.anInt7408 + this.aClass87_Sub2_8.anInt7409 * local528 / arg2;
			arg1.anInt4696 = this.aClass87_Sub2_8.anInt7384 * local547 / arg2 + this.aClass87_Sub2_8.anInt7379;
			arg1.anInt4699 = this.aClass87_Sub2_8.anInt7408 + local585 * this.aClass87_Sub2_8.anInt7409 / arg2;
			if (local566 >= this.aClass87_Sub2_8.anInt7397 || local623 >= this.aClass87_Sub2_8.anInt7397) {
				arg1.anInt4700 = this.aClass87_Sub2_8.anInt7408 + this.aClass87_Sub2_8.anInt7409 * (this.aShort69 + local528) / arg2 - arg1.anInt4698;
				arg1.aBoolean391 = true;
			}
		}
		this.aClass87_Sub2_8.method6166((float) arg2);
		this.aClass87_Sub2_8.method6169();
		this.aClass87_Sub2_8.method6187(local19);
		this.method3249();
		this.aClass87_Sub2_8.method6149();
		this.method3251();
	}

	@OriginalMember(owner = "client!gea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static394.anInt7089 = 0;
			Static224.anInt4607 = 0;
			local13 = 0;
			Static259.anInt5080 = 0;
			for (local17 = 0; local17 < this.anInt3925; local17++) {
				Static224.anInt4607 += this.anIntArray272[local17];
				Static394.anInt7089 += this.anIntArray269[local17];
				Static259.anInt5080 += this.anIntArray268[local17];
				local13++;
			}
			if (local13 <= 0) {
				Static224.anInt4607 = arg1;
				Static259.anInt5080 = arg3;
				Static394.anInt7089 = arg2;
			} else {
				Static259.anInt5080 = Static259.anInt5080 / local13 + arg3;
				Static224.anInt4607 = arg1 + Static224.anInt4607 / local13;
				Static394.anInt7089 = Static394.anInt7089 / local13 + arg2;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt3925; local13++) {
				this.anIntArray272[local13] += arg1;
				this.anIntArray269[local13] += arg2;
				this.anIntArray268[local13] += arg3;
			}
		} else {
			@Pc(158) int local158;
			@Pc(176) int local176;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt3925; local13++) {
					this.anIntArray272[local13] -= Static224.anInt4607;
					this.anIntArray269[local13] -= Static394.anInt7089;
					this.anIntArray268[local13] -= Static259.anInt5080;
					if (arg3 != 0) {
						local17 = Class353.anIntArray681[arg3];
						local158 = Class353.anIntArray682[arg3];
						local176 = this.anIntArray269[local13] * local17 + this.anIntArray272[local13] * local158 + 16383 >> 14;
						this.anIntArray269[local13] = local158 * this.anIntArray269[local13] + 16383 - local17 * this.anIntArray272[local13] >> 14;
						this.anIntArray272[local13] = local176;
					}
					if (arg1 != 0) {
						local17 = Class353.anIntArray681[arg1];
						local158 = Class353.anIntArray682[arg1];
						local176 = local158 * this.anIntArray269[local13] + 16383 - local17 * this.anIntArray268[local13] >> 14;
						this.anIntArray268[local13] = this.anIntArray269[local13] * local17 + this.anIntArray268[local13] * local158 + 16383 >> 14;
						this.anIntArray269[local13] = local176;
					}
					if (arg2 != 0) {
						local17 = Class353.anIntArray681[arg2];
						local158 = Class353.anIntArray682[arg2];
						local176 = this.anIntArray268[local13] * local17 + local158 * this.anIntArray272[local13] + 16383 >> 14;
						this.anIntArray268[local13] = local158 * this.anIntArray268[local13] + 16383 - this.anIntArray272[local13] * local17 >> 14;
						this.anIntArray272[local13] = local176;
					}
					this.anIntArray272[local13] += Static224.anInt4607;
					this.anIntArray269[local13] += Static394.anInt7089;
					this.anIntArray268[local13] += Static259.anInt5080;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt3925; local13++) {
					this.anIntArray272[local13] -= Static224.anInt4607;
					this.anIntArray269[local13] -= Static394.anInt7089;
					this.anIntArray268[local13] -= Static259.anInt5080;
					this.anIntArray272[local13] = arg1 * this.anIntArray272[local13] / 128;
					this.anIntArray269[local13] = arg2 * this.anIntArray269[local13] / 128;
					this.anIntArray268[local13] = this.anIntArray268[local13] * arg3 / 128;
					this.anIntArray272[local13] += Static224.anInt4607;
					this.anIntArray269[local13] += Static394.anInt7089;
					this.anIntArray268[local13] += Static259.anInt5080;
				}
			} else {
				@Pc(514) Class183 local514;
				@Pc(519) Class254 local519;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt3918; local13++) {
						local17 = (this.aByteArray37[local13] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray37[local13] = (byte) local17;
					}
					if (this.aClass66_5 != null) {
						this.aClass66_5.anInterface23_1 = null;
					}
					if (this.aClass183Array1 != null) {
						for (local17 = 0; local17 < this.anInt3930; local17++) {
							local514 = this.aClass183Array1[local17];
							local519 = this.aClass254Array1[local17];
							local519.anInt7683 = 255 - (this.aByteArray37[local514.anInt5316] & 0xFF) << 24 | local519.anInt7683 & 0xFFFFFF;
						}
					}
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt3918; local13++) {
						local17 = this.aShortArray46[local13] & 0xFFFF;
						local158 = local17 >> 10 & 0x3F;
						local176 = local17 >> 7 & 0x7;
						@Pc(580) int local580 = arg1 + local158 & 0x3F;
						@Pc(584) int local584 = local17 & 0x7F;
						local176 += arg2 / 4;
						local584 += arg3;
						if (local176 < 0) {
							local176 = 0;
						} else if (local176 > 7) {
							local176 = 7;
						}
						if (local584 < 0) {
							local584 = 0;
						} else if (local584 > 127) {
							local584 = 127;
						}
						this.aShortArray46[local13] = (short) (local584 | local176 << 7 | local580 << 10);
					}
					if (this.aClass66_5 != null) {
						this.aClass66_5.anInterface23_1 = null;
					}
					if (this.aClass183Array1 != null) {
						for (local17 = 0; local17 < this.anInt3930; local17++) {
							local514 = this.aClass183Array1[local17];
							local519 = this.aClass254Array1[local17];
							local519.anInt7683 = local519.anInt7683 & 0xFF000000 | Static349.anIntArray394[this.aShortArray46[local514.anInt5316] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(705) Class254 local705;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt3930; local13++) {
							local705 = this.aClass254Array1[local13];
							local705.anInt7686 += arg1;
							local705.anInt7690 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt3930; local13++) {
							local705 = this.aClass254Array1[local13];
							local705.anInt7688 = local705.anInt7688 * arg1 >> 7;
							local705.anInt7680 = local705.anInt7680 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt3930; local13++) {
							local705 = this.aClass254Array1[local13];
							local705.anInt7684 = local705.anInt7684 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILclient!ss;)V")
	private void method3252(@OriginalArg(1) Class2_Sub5_Sub12_Sub2 arg0) {
		if (this.aClass87_Sub2_8.anIntArray497.length < this.anInt3941) {
			this.aClass87_Sub2_8.anIntArray499 = new int[this.anInt3941];
			this.aClass87_Sub2_8.anIntArray497 = new int[this.anInt3941];
		}
		@Pc(48) int[] local48 = this.aClass87_Sub2_8.anIntArray497;
		@Pc(52) int[] local52 = this.aClass87_Sub2_8.anIntArray499;
		@Pc(81) int local81;
		@Pc(119) int local119;
		@Pc(128) int local128;
		for (@Pc(54) int local54 = 0; local54 < this.anInt3925; local54++) {
			local81 = (this.anIntArray272[local54] - (this.aClass87_Sub2_8.anInt7392 * this.anIntArray269[local54] >> 8) >> this.aClass87_Sub2_8.anInt7367) - arg0.anInt8819;
			@Pc(105) int local105 = (this.anIntArray268[local54] - (this.aClass87_Sub2_8.anInt7381 * this.anIntArray269[local54] >> 8) >> this.aClass87_Sub2_8.anInt7367) - arg0.anInt8815;
			@Pc(110) int local110 = this.anIntArray271[local54];
			@Pc(117) int local117 = this.anIntArray271[local54 + 1];
			for (local119 = local110; local119 < local117; local119++) {
				local128 = this.aShortArray54[local119] - 1;
				if (local128 == -1) {
					break;
				}
				local48[local128] = local81;
				local52[local128] = local105;
			}
		}
		for (local81 = 0; local81 < this.anInt3906; local81++) {
			if (this.aByteArray37 == null || this.aByteArray37[local81] <= 128) {
				@Pc(172) short local172 = this.aShortArray53[local81];
				@Pc(177) short local177 = this.aShortArray48[local81];
				@Pc(182) short local182 = this.aShortArray51[local81];
				local119 = local48[local172];
				local128 = local48[local177];
				@Pc(194) int local194 = local48[local182];
				@Pc(198) int local198 = local52[local172];
				@Pc(202) int local202 = local52[local177];
				@Pc(206) int local206 = local52[local182];
				if (-((local194 - local128) * (-local198 + local202)) + (local202 - local206) * (local119 - local128) > 0) {
					arg0.method7393(local198, local206, local194, local202, local128, local119);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(I)V")
	private void method3253() {
		if (!this.aBoolean333) {
			return;
		}
		this.aBoolean333 = false;
		if (this.aClass130Array2 == null && this.aClass337Array2 == null && this.aClass183Array1 == null) {
			if (this.anIntArray272 != null && !Static67.method1258(this.anInt3904, this.anInt3944)) {
				if (this.aClass66_3 != null && this.aClass66_3.anInterface23_1 == null) {
					this.aBoolean333 = true;
				} else {
					if (!this.aBoolean331) {
						this.method3260();
					}
					this.anIntArray272 = null;
				}
			}
			if (this.anIntArray269 != null && !Static524.method7326(this.anInt3944, this.anInt3904)) {
				if (this.aClass66_3 != null && this.aClass66_3.anInterface23_1 == null) {
					this.aBoolean333 = true;
				} else {
					if (!this.aBoolean331) {
						this.method3260();
					}
					this.anIntArray269 = null;
				}
			}
			if (this.anIntArray268 != null && !Static382.method5749(this.anInt3944, this.anInt3904)) {
				if (this.aClass66_3 != null && this.aClass66_3.anInterface23_1 == null) {
					this.aBoolean333 = true;
				} else {
					if (!this.aBoolean331) {
						this.method3260();
					}
					this.anIntArray268 = null;
				}
			}
		}
		if (this.aShortArray54 != null && this.anIntArray272 == null && this.anIntArray269 == null && this.anIntArray268 == null) {
			this.aShortArray54 = null;
			this.anIntArray271 = null;
		}
		if (this.aByteArray38 != null && !Static624.method8450(this.anInt3904, this.anInt3944)) {
			if (this.aClass66_4 == null) {
				if (this.aClass66_5 != null && this.aClass66_5.anInterface23_1 == null) {
					this.aBoolean333 = true;
				} else {
					this.aByteArray38 = null;
					this.aShortArray49 = this.aShortArray55 = this.aShortArray45 = null;
				}
			} else if (this.aClass66_4.anInterface23_1 == null) {
				this.aBoolean333 = true;
			} else {
				this.aShortArray49 = this.aShortArray55 = this.aShortArray45 = null;
				this.aByteArray38 = null;
			}
		}
		if (this.aShortArray46 != null && !Static530.method7411(this.anInt3944, this.anInt3904)) {
			if (this.aClass66_5 != null && this.aClass66_5.anInterface23_1 == null) {
				this.aBoolean333 = true;
			} else {
				this.aShortArray46 = null;
			}
		}
		if (this.aByteArray37 != null && !Static50.method953(this.anInt3944, this.anInt3904)) {
			if (this.aClass66_5 != null && this.aClass66_5.anInterface23_1 == null) {
				this.aBoolean333 = true;
			} else {
				this.aByteArray37 = null;
			}
		}
		if (this.aFloatArray35 != null && !Static215.method3731(this.anInt3904, this.anInt3944)) {
			if (this.aClass66_6 != null && this.aClass66_6.anInterface23_1 == null) {
				this.aBoolean333 = true;
			} else {
				this.aFloatArray35 = this.aFloatArray34 = null;
			}
		}
		if (this.aShortArray47 != null && !Static161.method3027(this.anInt3904, this.anInt3944)) {
			if (this.aClass66_5 != null && this.aClass66_5.anInterface23_1 == null) {
				this.aBoolean333 = true;
			} else {
				this.aShortArray47 = null;
			}
		}
		if (this.aShortArray53 != null && !Static447.method6630(this.anInt3944, this.anInt3904)) {
			if (this.aClass157_1 != null && this.aClass157_1.anInterface9_3 == null || this.aClass66_5 != null && this.aClass66_5.anInterface23_1 == null) {
				this.aBoolean333 = true;
			} else {
				this.aShortArray53 = this.aShortArray48 = this.aShortArray51 = null;
			}
		}
		if (this.anIntArrayArray29 != null && !Static437.method6512(this.anInt3944, this.anInt3904)) {
			this.anIntArrayArray29 = null;
			this.aShortArray50 = null;
		}
		if (this.anIntArrayArray28 != null && !Static163.method3043(this.anInt3944, this.anInt3904)) {
			this.aShortArray52 = null;
			this.anIntArrayArray28 = null;
		}
		if (this.anIntArrayArray27 != null && !Static211.method6033(this.anInt3944, this.anInt3904)) {
			this.anIntArrayArray27 = null;
		}
		if (this.anIntArray270 != null && (this.anInt3904 & 0x800) == 0 && (this.anInt3904 & 0x40000) == 0) {
			this.anIntArray270 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort71;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(ZZ)V")
	private void method3254(@OriginalArg(0) boolean arg0) {
		if (this.anInt3906 * 6 <= this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3.aByteArray77.length) {
			this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3.anInt8188 = 0;
		} else {
			this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3 = new Class2_Sub34_Sub1(this.anInt3906 * 6 + 600);
		}
		@Pc(38) Class2_Sub34_Sub1 local38 = this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3;
		@Pc(44) int local44;
		if (this.aClass87_Sub2_8.aBoolean559) {
			for (local44 = 0; local44 < this.anInt3906; local44++) {
				local38.method6854(this.aShortArray53[local44]);
				local38.method6854(this.aShortArray48[local44]);
				local38.method6854(this.aShortArray51[local44]);
			}
		} else {
			for (local44 = 0; local44 < this.anInt3906; local44++) {
				local38.method6868(this.aShortArray53[local44]);
				local38.method6868(this.aShortArray48[local44]);
				local38.method6868(this.aShortArray51[local44]);
			}
		}
		if (local38.anInt8188 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface9_2 == null) {
				this.anInterface9_2 = this.aClass87_Sub2_8.method6157(local38.anInt8188, true, local38.aByteArray77);
			} else {
				this.anInterface9_2.method6318(local38.anInt8188, local38.aByteArray77);
			}
			this.aClass157_1.anInterface9_3 = this.anInterface9_2;
		} else {
			this.aClass157_1.anInterface9_3 = this.aClass87_Sub2_8.method6157(local38.anInt8188, false, local38.aByteArray77);
		}
		if (!arg0) {
			this.aBoolean333 = true;
		}
	}

	@OriginalMember(owner = "client!gea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!gea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort63;
	}

	@OriginalMember(owner = "client!gea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!gea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt3904 = arg0;
		this.aBoolean333 = true;
		if (this.aClass90_1 != null && (this.anInt3904 & 0x10000) == 0) {
			this.aShortArray55 = this.aClass90_1.aShortArray35;
			this.aByteArray38 = this.aClass90_1.aByteArray28;
			this.aShortArray49 = this.aClass90_1.aShortArray36;
			this.aShortArray45 = this.aClass90_1.aShortArray34;
			this.aClass90_1 = null;
		}
		this.method3253();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg4 > arg5 && arg5 < arg3 && arg5 < arg6) {
			return false;
		} else if (arg5 > arg4 && arg5 > arg3 && arg5 > arg6) {
			return false;
		} else if (arg0 < arg1 && arg2 > arg0 && arg7 > arg0) {
			return false;
		} else {
			return arg1 >= arg0 || arg0 <= arg2 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!gea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean334;
	}

	@OriginalMember(owner = "client!gea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort64;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3925; local15++) {
			@Pc(34) int local34 = this.anIntArray268[local15] * local9 + local13 * this.anIntArray272[local15] >> 14;
			this.anIntArray268[local15] = local13 * this.anIntArray268[local15] - this.anIntArray272[local15] * local9 >> 14;
			this.anIntArray272[local15] = local34;
		}
		this.aBoolean331 = false;
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!kd;Lclient!ig;I)V")
	@Override
	public void method7735(@OriginalArg(0) Class6 arg0, @OriginalArg(1) Class11_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt3941 == 0) {
			return;
		}
		@Pc(13) Class6_Sub1 local13 = this.aClass87_Sub2_8.aClass6_Sub1_3;
		@Pc(16) Class6_Sub1 local16 = (Class6_Sub1) arg0;
		if (!this.aBoolean331) {
			this.method3260();
		}
		Static58.aFloat26 = local16.aFloat12 * local13.aFloat2 + local13.aFloat3 * local16.aFloat11 + local16.aFloat9 * local13.aFloat6 + local13.aFloat12;
		Static128.aFloat69 = local13.aFloat3 * local16.aFloat7 + local13.aFloat6 * local16.aFloat5 + local13.aFloat2 * local16.aFloat6;
		@Pc(69) float local69 = (float) this.aShort63 * Static128.aFloat69 + Static58.aFloat26;
		@Pc(77) float local77 = Static58.aFloat26 + (float) this.aShort62 * Static128.aFloat69;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.aShort69 + local77;
			local94 = (float) this.aShort69 + local69;
		} else {
			local88 = (float) -this.aShort69 + local69;
			local94 = local77 + (float) this.aShort69;
		}
		if (this.aClass87_Sub2_8.aFloat169 <= local88 || (float) this.aClass87_Sub2_8.anInt7397 >= local94) {
			return;
		}
		Static416.aFloat187 = local13.aFloat8 * local16.aFloat12 + local13.aFloat4 * local16.aFloat11 + local16.aFloat9 * local13.aFloat7 + local13.aFloat11;
		Static68.aFloat31 = local13.aFloat4 * local16.aFloat7 + local16.aFloat5 * local13.aFloat7 + local13.aFloat8 * local16.aFloat6;
		@Pc(171) float local171 = Static416.aFloat187 + (float) this.aShort63 * Static68.aFloat31;
		@Pc(179) float local179 = Static416.aFloat187 + Static68.aFloat31 * (float) this.aShort62;
		@Pc(205) float local205;
		@Pc(194) float local194;
		if (local179 < local171) {
			local194 = (float) this.aClass87_Sub2_8.anInt7409 * (local171 + (float) this.aShort69);
			local205 = (local179 - (float) this.aShort69) * (float) this.aClass87_Sub2_8.anInt7409;
		} else {
			local194 = (float) this.aClass87_Sub2_8.anInt7409 * ((float) this.aShort69 + local179);
			local205 = (float) this.aClass87_Sub2_8.anInt7409 * (local171 - (float) this.aShort69);
		}
		if (local205 / local94 >= this.aClass87_Sub2_8.aFloat171 || local194 / local94 <= this.aClass87_Sub2_8.aFloat181) {
			return;
		}
		Static8.aFloat14 = local13.aFloat10 * local16.aFloat7 + local16.aFloat5 * local13.aFloat5 + local16.aFloat6 * local13.aFloat13;
		Static299.aFloat129 = local13.aFloat9 + local16.aFloat12 * local13.aFloat13 + local16.aFloat11 * local13.aFloat10 + local16.aFloat9 * local13.aFloat5;
		@Pc(294) float local294 = Static299.aFloat129 + Static8.aFloat14 * (float) this.aShort63;
		@Pc(302) float local302 = (float) this.aShort62 * Static8.aFloat14 + Static299.aFloat129;
		@Pc(329) float local329;
		@Pc(317) float local317;
		if (local302 < local294) {
			local317 = (float) this.aClass87_Sub2_8.anInt7384 * (local294 + (float) this.aShort69);
			local329 = (float) this.aClass87_Sub2_8.anInt7384 * ((float) -this.aShort69 + local302);
		} else {
			local329 = (float) this.aClass87_Sub2_8.anInt7384 * ((float) -this.aShort69 + local294);
			local317 = (local302 + (float) this.aShort69) * (float) this.aClass87_Sub2_8.anInt7384;
		}
		if (local329 / local94 >= this.aClass87_Sub2_8.aFloat170 || this.aClass87_Sub2_8.aFloat167 >= local317 / local94) {
			return;
		}
		if (arg1 != null || this.aClass183Array1 != null) {
			Static603.aFloat222 = local16.aFloat8 * local13.aFloat10 + local16.aFloat13 * local13.aFloat5 + local13.aFloat13 * local16.aFloat2;
			Static251.aFloat116 = local13.aFloat10 * local16.aFloat4 + local13.aFloat5 * local16.aFloat10 + local13.aFloat13 * local16.aFloat3;
			Static259.aFloat119 = local16.aFloat8 * local13.aFloat4 + local16.aFloat13 * local13.aFloat7 + local13.aFloat8 * local16.aFloat2;
			Static257.aFloat118 = local13.aFloat6 * local16.aFloat13 + local16.aFloat8 * local13.aFloat3 + local13.aFloat2 * local16.aFloat2;
			Static532.aFloat217 = local16.aFloat4 * local13.aFloat4 + local13.aFloat7 * local16.aFloat10 + local13.aFloat8 * local16.aFloat3;
			Static408.aFloat185 = local16.aFloat3 * local13.aFloat2 + local13.aFloat6 * local16.aFloat10 + local13.aFloat3 * local16.aFloat4;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(500) int local500 = this.aShort70 + this.aShort64 >> 1;
			@Pc(508) int local508 = this.aShort67 + this.aShort68 >> 1;
			@Pc(527) int local527 = (int) ((float) this.aShort63 * Static68.aFloat31 + Static416.aFloat187 + (float) local500 * Static532.aFloat217 + Static259.aFloat119 * (float) local508);
			@Pc(546) int local546 = (int) ((float) local508 * Static603.aFloat222 + (float) local500 * Static251.aFloat116 + Static299.aFloat129 + (float) this.aShort63 * Static8.aFloat14);
			@Pc(565) int local565 = (int) ((float) local508 * Static257.aFloat118 + Static128.aFloat69 * (float) this.aShort63 + Static408.aFloat185 * (float) local500 + Static58.aFloat26);
			if (this.aClass87_Sub2_8.anInt7397 > local565) {
				local489 = true;
			} else {
				arg1.anInt4698 = this.aClass87_Sub2_8.anInt7408 + this.aClass87_Sub2_8.anInt7409 * local527 / local565;
				arg1.anInt4696 = local546 * this.aClass87_Sub2_8.anInt7384 / local565 + this.aClass87_Sub2_8.anInt7379;
			}
			@Pc(619) int local619 = (int) (Static259.aFloat119 * (float) local508 + Static416.aFloat187 + (float) local500 * Static532.aFloat217 + Static68.aFloat31 * (float) this.aShort62);
			@Pc(638) int local638 = (int) (Static8.aFloat14 * (float) this.aShort62 + Static251.aFloat116 * (float) local500 + Static299.aFloat129 + Static603.aFloat222 * (float) local508);
			@Pc(657) int local657 = (int) (Static257.aFloat118 * (float) local508 + Static58.aFloat26 + (float) local500 * Static408.aFloat185 + (float) this.aShort62 * Static128.aFloat69);
			if (this.aClass87_Sub2_8.anInt7397 > local657) {
				local489 = true;
			} else {
				arg1.anInt4699 = local619 * this.aClass87_Sub2_8.anInt7409 / local657 + this.aClass87_Sub2_8.anInt7408;
				arg1.anInt4697 = local638 * this.aClass87_Sub2_8.anInt7384 / local657 + this.aClass87_Sub2_8.anInt7379;
			}
			if (local489) {
				if (this.aClass87_Sub2_8.anInt7397 > local565 && local657 < this.aClass87_Sub2_8.anInt7397) {
					local491 = false;
				} else {
					@Pc(736) int local736;
					@Pc(747) int local747;
					@Pc(757) int local757;
					if (this.aClass87_Sub2_8.anInt7397 > local565) {
						local736 = (local657 - this.aClass87_Sub2_8.anInt7397 << 16) / (local657 - local565);
						local747 = ((local619 - local527) * local736 >> 16) + local619;
						arg1.anInt4698 = this.aClass87_Sub2_8.anInt7408 + local747 * this.aClass87_Sub2_8.anInt7409 / this.aClass87_Sub2_8.anInt7397;
						local757 = local638 + ((local638 - local546) * local736 >> 16);
						arg1.anInt4696 = local757 * this.aClass87_Sub2_8.anInt7384 / this.aClass87_Sub2_8.anInt7397 + this.aClass87_Sub2_8.anInt7379;
					} else if (local657 < this.aClass87_Sub2_8.anInt7397) {
						local736 = (local565 - this.aClass87_Sub2_8.anInt7397 << 16) / (local565 - local657);
						local747 = local527 + (local736 * (local527 - local619) >> 16);
						local757 = ((local546 - local638) * local736 >> 16) + local546;
						arg1.anInt4698 = this.aClass87_Sub2_8.anInt7409 * local747 / this.aClass87_Sub2_8.anInt7397 + this.aClass87_Sub2_8.anInt7408;
						arg1.anInt4696 = this.aClass87_Sub2_8.anInt7384 * local757 / this.aClass87_Sub2_8.anInt7397 + this.aClass87_Sub2_8.anInt7379;
					}
				}
			}
			if (local491) {
				arg1.aBoolean391 = true;
				if (local657 < local565) {
					arg1.anInt4700 = (this.aShort69 + local527) * this.aClass87_Sub2_8.anInt7409 / local565 + this.aClass87_Sub2_8.anInt7408 - arg1.anInt4698;
				} else {
					arg1.anInt4700 = this.aClass87_Sub2_8.anInt7409 * (local619 + this.aShort69) / local657 + this.aClass87_Sub2_8.anInt7408 - arg1.anInt4699;
				}
			}
		}
		this.aClass87_Sub2_8.method6146();
		this.aClass87_Sub2_8.method6187(local16);
		this.method3249();
		this.aClass87_Sub2_8.method6149();
		this.method3251();
	}

	@OriginalMember(owner = "client!gea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3903; local3++) {
			this.anIntArray272[local3] = this.anIntArray272[local3] + 7 >> 4;
			this.anIntArray269[local3] = this.anIntArray269[local3] + 7 >> 4;
			this.anIntArray268[local3] = this.anIntArray268[local3] + 7 >> 4;
		}
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
		this.aBoolean331 = false;
	}

	@OriginalMember(owner = "client!gea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3925; local3++) {
			this.anIntArray268[local3] = -this.anIntArray268[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3941; local25++) {
			this.aShortArray45[local25] = (short) -this.aShortArray45[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt3918; local44++) {
			@Pc(51) short local51 = this.aShortArray53[local44];
			this.aShortArray53[local44] = this.aShortArray51[local44];
			this.aShortArray51[local44] = local51;
		}
		if (this.aClass66_4 == null && this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
		}
		if (this.aClass66_4 != null) {
			this.aClass66_4.anInterface23_1 = null;
		}
		if (this.aClass157_1 != null) {
			this.aClass157_1.anInterface9_3 = null;
		}
		this.aBoolean331 = false;
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3925; local3++) {
			if (arg0 != 128) {
				this.anIntArray272[local3] = this.anIntArray272[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray269[local3] = this.anIntArray269[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray268[local3] = arg2 * this.anIntArray268[local3] >> 7;
			}
		}
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
		this.aBoolean331 = false;
	}

	@OriginalMember(owner = "client!gea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass87_Sub2_8.anInterface6_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt3918; local11++) {
			if (arg0 == this.aShortArray47[local11]) {
				this.aShortArray47[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class199 local47 = local9.method6357(arg0 & 0xFFFF);
			local37 = local47.aByte83;
			local35 = local47.aByte84;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class199 local68 = local9.method6357(arg1 & 0xFFFF);
			local55 = local68.aByte84;
			if (local68.aByte88 != 0 || local68.aByte87 != 0) {
				this.aBoolean334 = true;
			}
			local57 = local68.aByte83;
		}
		if (!(local35 != local55 | local37 != local57)) {
			return;
		}
		if (this.aClass183Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt3930; local113++) {
				@Pc(120) Class183 local120 = this.aClass183Array1[local113];
				@Pc(125) Class254 local125 = this.aClass254Array1[local113];
				local125.anInt7683 = Static349.anIntArray394[this.aShortArray46[local120.anInt5316] & 0xFFFF] & 0xFFFFFF | local125.anInt7683 & 0xFF000000;
			}
		}
		if (this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!gea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub5_Sub12 ba(@OriginalArg(0) Class2_Sub5_Sub12 arg0) {
		if (this.anInt3941 == 0) {
			return null;
		}
		if (!this.aBoolean331) {
			this.method3260();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass87_Sub2_8.anInt7392 > 0) {
			local43 = this.aShort70 - (this.aShort62 * this.aClass87_Sub2_8.anInt7392 >> 8) >> this.aClass87_Sub2_8.anInt7367;
			local60 = this.aShort64 - (this.aClass87_Sub2_8.anInt7392 * this.aShort63 >> 8) >> this.aClass87_Sub2_8.anInt7367;
		} else {
			local43 = this.aShort70 - (this.aShort63 * this.aClass87_Sub2_8.anInt7392 >> 8) >> this.aClass87_Sub2_8.anInt7367;
			local60 = this.aShort64 - (this.aClass87_Sub2_8.anInt7392 * this.aShort62 >> 8) >> this.aClass87_Sub2_8.anInt7367;
		}
		@Pc(120) int local120;
		@Pc(137) int local137;
		if (this.aClass87_Sub2_8.anInt7381 > 0) {
			local120 = this.aShort68 - (this.aClass87_Sub2_8.anInt7381 * this.aShort62 >> 8) >> this.aClass87_Sub2_8.anInt7367;
			local137 = this.aShort67 - (this.aShort63 * this.aClass87_Sub2_8.anInt7381 >> 8) >> this.aClass87_Sub2_8.anInt7367;
		} else {
			local120 = this.aShort68 - (this.aShort63 * this.aClass87_Sub2_8.anInt7381 >> 8) >> this.aClass87_Sub2_8.anInt7367;
			local137 = this.aShort67 - (this.aShort62 * this.aClass87_Sub2_8.anInt7381 >> 8) >> this.aClass87_Sub2_8.anInt7367;
		}
		@Pc(178) int local178 = local60 + 1 - local43;
		@Pc(185) int local185 = local137 + 1 - local120;
		@Pc(188) Class2_Sub5_Sub12_Sub2 local188 = (Class2_Sub5_Sub12_Sub2) arg0;
		@Pc(204) Class2_Sub5_Sub12_Sub2 local204;
		if (local188 != null && local188.method7388(local178, local185)) {
			local204 = local188;
			local188.method7389();
		} else {
			local204 = new Class2_Sub5_Sub12_Sub2(this.aClass87_Sub2_8, local178, local185);
		}
		local204.method7392(local120, local60, local43, local137);
		this.method3252(local204);
		return local204;
	}

	@OriginalMember(owner = "client!gea", name = "d", descriptor = "()V")
	@Override
	public void method7727() {
		if (this.anInt3941 <= 0 || this.anInt3906 <= 0) {
			return;
		}
		this.method3257(false);
		if ((this.aByte72 & 0x10) == 0 && this.aClass157_1.anInterface9_3 == null) {
			this.method3254(false);
		}
		this.method3253();
	}

	@OriginalMember(owner = "client!gea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort65;
	}

	@OriginalMember(owner = "client!gea", name = "f", descriptor = "()[Lclient!gi;")
	@Override
	public Class130[] method7731() {
		return this.aClass130Array2;
	}

	@OriginalMember(owner = "client!gea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(41) int local41;
		@Pc(57) int local57;
		@Pc(55) int[] local55;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static259.anInt5080 = 0;
			Static394.anInt7089 = 0;
			Static224.anInt4607 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray28.length) {
					local55 = this.anIntArrayArray28[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						if (this.aShortArray52 == null || (arg6 & this.aShortArray52[local63]) != 0) {
							Static224.anInt4607 += this.anIntArray272[local63];
							Static394.anInt7089 += this.anIntArray269[local63];
							local33++;
							Static259.anInt5080 += this.anIntArray268[local63];
						}
					}
				}
			}
			if (local33 > 0) {
				Static259.anInt5080 = Static259.anInt5080 / local33 + arg4;
				Static394.anInt7089 = arg3 + Static394.anInt7089 / local33;
				Static224.anInt4607 = arg2 + Static224.anInt4607 / local33;
				Static367.aBoolean487 = true;
			} else {
				Static394.anInt7089 = arg3;
				Static259.anInt5080 = arg4;
				Static224.anInt4607 = arg2;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[3] * arg2 + arg3 * arg7[4] + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg2 * arg7[6] + arg7[7] * arg3 + 8192 >> 14;
				arg3 = local35;
				arg2 = local33;
				arg4 = local41;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray28.length > local35) {
					local250 = this.anIntArrayArray28[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray52 == null || (arg6 & this.aShortArray52[local57]) != 0) {
							this.anIntArray272[local57] += arg2;
							this.anIntArray269[local57] += arg3;
							this.anIntArray268[local57] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(404) int local404;
		@Pc(427) int local427;
		@Pc(462) int local462;
		@Pc(466) int local466;
		@Pc(470) int local470;
		@Pc(474) int local474;
		@Pc(482) int local482;
		@Pc(490) int local490;
		@Pc(646) int local646;
		@Pc(671) int local671;
		@Pc(675) int local675;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(692) int local692;
		@Pc(696) int local696;
		@Pc(698) int local698;
		@Pc(830) int[] local830;
		@Pc(832) int local832;
		@Pc(836) int local836;
		@Pc(840) int local840;
		@Pc(842) int local842;
		@Pc(972) int local972;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray28.length > local35) {
						local250 = this.anIntArrayArray28[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray52 == null || (arg6 & this.aShortArray52[local57]) != 0) {
								this.anIntArray272[local57] -= Static224.anInt4607;
								this.anIntArray269[local57] -= Static394.anInt7089;
								this.anIntArray268[local57] -= Static259.anInt5080;
								if (arg4 != 0) {
									local63 = Class353.anIntArray681[arg4];
									local380 = Class353.anIntArray682[arg4];
									local404 = local63 * this.anIntArray269[local57] + this.anIntArray272[local57] * local380 + 16383 >> 14;
									this.anIntArray269[local57] = this.anIntArray269[local57] * local380 + 16383 - local63 * this.anIntArray272[local57] >> 14;
									this.anIntArray272[local57] = local404;
								}
								if (arg2 != 0) {
									local63 = Class353.anIntArray681[arg2];
									local380 = Class353.anIntArray682[arg2];
									local404 = local380 * this.anIntArray269[local57] + 16383 - local63 * this.anIntArray268[local57] >> 14;
									this.anIntArray268[local57] = this.anIntArray268[local57] * local380 + local63 * this.anIntArray269[local57] + 16383 >> 14;
									this.anIntArray269[local57] = local404;
								}
								if (arg3 != 0) {
									local63 = Class353.anIntArray681[arg3];
									local380 = Class353.anIntArray682[arg3];
									local404 = local63 * this.anIntArray268[local57] + this.anIntArray272[local57] * local380 + 16383 >> 14;
									this.anIntArray268[local57] = this.anIntArray268[local57] * local380 + 16383 - local63 * this.anIntArray272[local57] >> 14;
									this.anIntArray272[local57] = local404;
								}
								this.anIntArray272[local57] += Static224.anInt4607;
								this.anIntArray269[local57] += Static394.anInt7089;
								this.anIntArray268[local57] += Static259.anInt5080;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray28.length > local41) {
							local55 = this.anIntArrayArray28[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								if (this.aShortArray52 == null || (this.aShortArray52[local63] & arg6) != 0) {
									local380 = this.anIntArray271[local63];
									local404 = this.anIntArray271[local63 + 1];
									for (local427 = local380; local427 < local404; local427++) {
										local462 = this.aShortArray54[local427] - 1;
										if (local462 == -1) {
											break;
										}
										if (arg4 != 0) {
											local466 = Class353.anIntArray681[arg4];
											local470 = Class353.anIntArray682[arg4];
											local474 = this.aShortArray55[local462] * local466 + this.aShortArray49[local462] * local470 + 16383 >> 14;
											this.aShortArray55[local462] = (short) (this.aShortArray55[local462] * local470 + 16383 - local466 * this.aShortArray49[local462] >> 14);
											this.aShortArray49[local462] = (short) local474;
										}
										if (arg2 != 0) {
											local466 = Class353.anIntArray681[arg2];
											local470 = Class353.anIntArray682[arg2];
											local474 = this.aShortArray55[local462] * local470 + 16383 - this.aShortArray45[local462] * local466 >> 14;
											this.aShortArray45[local462] = (short) (this.aShortArray45[local462] * local470 + local466 * this.aShortArray55[local462] + 16383 >> 14);
											this.aShortArray55[local462] = (short) local474;
										}
										if (arg3 != 0) {
											local466 = Class353.anIntArray681[arg3];
											local470 = Class353.anIntArray682[arg3];
											local474 = this.aShortArray45[local462] * local466 + local470 * this.aShortArray49[local462] + 16383 >> 14;
											this.aShortArray45[local462] = (short) (local470 * this.aShortArray45[local462] + 16383 - local466 * this.aShortArray49[local462] >> 14);
											this.aShortArray49[local462] = (short) local474;
										}
									}
								}
							}
						}
					}
					if (this.aClass66_4 == null && this.aClass66_5 != null) {
						this.aClass66_5.anInterface23_1 = null;
					}
					if (this.aClass66_4 != null) {
						this.aClass66_4.anInterface23_1 = null;
					}
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local57 = arg7[13] << 4;
				local63 = arg7[14] << 4;
				if (Static367.aBoolean487) {
					local380 = arg7[6] * Static259.anInt5080 + arg7[3] * Static394.anInt7089 + arg7[0] * Static224.anInt4607 + 8192 >> 14;
					local404 = Static224.anInt4607 * arg7[1] + arg7[4] * Static394.anInt7089 + Static259.anInt5080 * arg7[7] + 8192 >> 14;
					local427 = arg7[8] * Static259.anInt5080 + Static224.anInt4607 * arg7[2] + Static394.anInt7089 * arg7[5] + 8192 >> 14;
					local404 += local57;
					local380 += local252;
					local427 += local63;
					Static394.anInt7089 = local404;
					Static224.anInt4607 = local380;
					Static367.aBoolean487 = false;
					Static259.anInt5080 = local427;
				}
				@Pc(450) int[] local450 = new int[9];
				local404 = Class353.anIntArray682[arg2];
				local427 = Class353.anIntArray681[arg2];
				local462 = Class353.anIntArray682[arg3];
				local466 = Class353.anIntArray681[arg3];
				local470 = Class353.anIntArray682[arg4];
				local474 = Class353.anIntArray681[arg4];
				local482 = local470 * local427 + 8192 >> 14;
				local490 = local474 * local427 + 8192 >> 14;
				local450[4] = local404 * local470 + 8192 >> 14;
				local450[0] = local466 * local490 + local470 * local462 + 8192 >> 14;
				local450[8] = local404 * local462 + 8192 >> 14;
				local450[2] = local404 * local466 + 8192 >> 14;
				local450[1] = local482 * local466 + local474 * -local462 + 8192 >> 14;
				local450[3] = local404 * local474 + 8192 >> 14;
				local450[7] = local474 * local466 + local462 * local482 + 8192 >> 14;
				local450[5] = -local427;
				local450[6] = -local466 * local470 + local462 * local490 + 8192 >> 14;
				@Pc(621) int local621 = local450[2] * -Static259.anInt5080 + local450[0] * -Static224.anInt4607 + -Static394.anInt7089 * local450[1] + 8192 >> 14;
				local646 = -Static394.anInt7089 * local450[4] + local450[3] * -Static224.anInt4607 + -Static259.anInt5080 * local450[5] + 8192 >> 14;
				local671 = -Static224.anInt4607 * local450[6] + local450[7] * -Static394.anInt7089 + local450[8] * -Static259.anInt5080 + 8192 >> 14;
				local675 = Static224.anInt4607 + local621;
				@Pc(679) int local679 = Static394.anInt7089 + local646;
				local683 = Static259.anInt5080 + local671;
				@Pc(686) int[] local686 = new int[9];
				for (local688 = 0; local688 < 3; local688++) {
					for (local692 = 0; local692 < 3; local692++) {
						local696 = 0;
						for (local698 = 0; local698 < 3; local698++) {
							local696 += local450[local688 * 3 + local698] * arg7[local698 + local692 * 3];
						}
						local686[local688 * 3 + local692] = local696 + 8192 >> 14;
					}
				}
				local692 = local63 * local450[2] + local450[1] * local57 + local450[0] * local252 + 8192 >> 14;
				local696 = local450[5] * local63 + local57 * local450[4] + local450[3] * local252 + 8192 >> 14;
				local698 = local450[6] * local252 + local57 * local450[7] + local63 * local450[8] + 8192 >> 14;
				local696 += local679;
				local692 += local675;
				local698 += local683;
				local830 = new int[9];
				for (local832 = 0; local832 < 3; local832++) {
					for (local836 = 0; local836 < 3; local836++) {
						local840 = 0;
						for (local842 = 0; local842 < 3; local842++) {
							local840 += arg7[local842 + local832 * 3] * local686[local842 * 3 + local836];
						}
						local830[local836 + local832 * 3] = local840 + 8192 >> 14;
					}
				}
				local836 = arg7[2] * local698 + local696 * arg7[1] + local692 * arg7[0] + 8192 >> 14;
				local840 = arg7[5] * local698 + local692 * arg7[3] + arg7[4] * local696 + 8192 >> 14;
				local840 += local35;
				local836 += local33;
				local842 = arg7[6] * local692 + local696 * arg7[7] + arg7[8] * local698 + 8192 >> 14;
				local842 += local41;
				for (local972 = 0; local972 < local8; local972++) {
					@Pc(978) int local978 = arg1[local972];
					if (this.anIntArrayArray28.length > local978) {
						@Pc(988) int[] local988 = this.anIntArrayArray28[local978];
						for (@Pc(990) int local990 = 0; local990 < local988.length; local990++) {
							@Pc(996) int local996 = local988[local990];
							if (this.aShortArray52 == null || (this.aShortArray52[local996] & arg6) != 0) {
								@Pc(1040) int local1040 = this.anIntArray268[local996] * local830[2] + local830[1] * this.anIntArray269[local996] + local830[0] * this.anIntArray272[local996] + 8192 >> 14;
								@Pc(1072) int local1072 = this.anIntArray272[local996] * local830[3] + this.anIntArray269[local996] * local830[4] + local830[5] * this.anIntArray268[local996] + 8192 >> 14;
								@Pc(1076) int local1076 = local1040 + local836;
								@Pc(1108) int local1108 = local830[8] * this.anIntArray268[local996] + this.anIntArray272[local996] * local830[6] + local830[7] * this.anIntArray269[local996] + 8192 >> 14;
								@Pc(1112) int local1112 = local1072 + local840;
								this.anIntArray272[local996] = local1076;
								@Pc(1121) int local1121 = local1108 + local842;
								this.anIntArray269[local996] = local1112;
								this.anIntArray268[local996] = local1121;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2574) Class183 local2574;
			@Pc(2579) Class254 local2579;
			if (arg0 == 5) {
				if (this.anIntArrayArray29 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray29.length > local35) {
							local250 = this.anIntArrayArray29[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local57 = local250[local252];
								if (this.aShortArray50 == null || (arg6 & this.aShortArray50[local57]) != 0) {
									local63 = (this.aByteArray37[local57] & 0xFF) + (arg2 * 8);
									if (local63 < 0) {
										local63 = 0;
									} else if (local63 > 255) {
										local63 = 255;
									}
									this.aByteArray37[local57] = (byte) local63;
									if (this.aClass66_5 != null) {
										this.aClass66_5.anInterface23_1 = null;
									}
								}
							}
						}
					}
					if (this.aClass183Array1 != null) {
						for (local35 = 0; local35 < this.anInt3930; local35++) {
							local2574 = this.aClass183Array1[local35];
							local2579 = this.aClass254Array1[local35];
							local2579.anInt7683 = local2579.anInt7683 & 0xFFFFFF | 255 - (this.aByteArray37[local2574.anInt5316] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2829) Class254 local2829;
				if (arg0 == 8) {
					if (this.anIntArrayArray27 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (this.anIntArrayArray27.length > local35) {
								local250 = this.anIntArrayArray27[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2829 = this.aClass254Array1[local250[local252]];
									local2829.anInt7690 += arg3;
									local2829.anInt7686 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray27 != null) {
						for (local33 = 0; local33 < local8; local33++) {
							local35 = arg1[local33];
							if (local35 < this.anIntArrayArray27.length) {
								local250 = this.anIntArrayArray27[local35];
								for (local252 = 0; local252 < local250.length; local252++) {
									local2829 = this.aClass254Array1[local250[local252]];
									local2829.anInt7688 = arg2 * local2829.anInt7688 >> 7;
									local2829.anInt7680 = arg3 * local2829.anInt7680 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray27 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray27.length > local35) {
							local250 = this.anIntArrayArray27[local35];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2829 = this.aClass254Array1[local250[local252]];
								local2829.anInt7684 = local2829.anInt7684 + arg2 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray29 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray29.length) {
						local250 = this.anIntArrayArray29[local35];
						for (local252 = 0; local252 < local250.length; local252++) {
							local57 = local250[local252];
							if (this.aShortArray50 == null || (this.aShortArray50[local57] & arg6) != 0) {
								local63 = this.aShortArray46[local57] & 0xFFFF;
								local380 = local63 >> 10 & 0x3F;
								local404 = local63 >> 7 & 0x7;
								local427 = local63 & 0x7F;
								@Pc(2683) int local2683 = arg2 + local380 & 0x3F;
								local404 += arg3 / 4;
								if (local404 < 0) {
									local404 = 0;
								} else if (local404 > 7) {
									local404 = 7;
								}
								local427 += arg4;
								if (local427 < 0) {
									local427 = 0;
								} else if (local427 > 127) {
									local427 = 127;
								}
								this.aShortArray46[local57] = (short) (local427 | local404 << 7 | local2683 << 10);
								if (this.aClass66_5 != null) {
									this.aClass66_5.anInterface23_1 = null;
								}
							}
						}
					}
				}
				if (this.aClass183Array1 != null) {
					for (local35 = 0; local35 < this.anInt3930; local35++) {
						local2574 = this.aClass183Array1[local35];
						local2579 = this.aClass254Array1[local35];
						local2579.anInt7683 = Static349.anIntArray394[this.aShortArray46[local2574.anInt5316] & 0xFFFF] & 0xFFFFFF | local2579.anInt7683 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray28.length > local35) {
					local250 = this.anIntArrayArray28[local35];
					for (local252 = 0; local252 < local250.length; local252++) {
						local57 = local250[local252];
						if (this.aShortArray52 == null || (this.aShortArray52[local57] & arg6) != 0) {
							this.anIntArray272[local57] -= Static224.anInt4607;
							this.anIntArray269[local57] -= Static394.anInt7089;
							this.anIntArray268[local57] -= Static259.anInt5080;
							this.anIntArray272[local57] = this.anIntArray272[local57] * arg2 >> 7;
							this.anIntArray269[local57] = this.anIntArray269[local57] * arg3 >> 7;
							this.anIntArray268[local57] = this.anIntArray268[local57] * arg4 >> 7;
							this.anIntArray272[local57] += Static224.anInt4607;
							this.anIntArray269[local57] += Static394.anInt7089;
							this.anIntArray268[local57] += Static259.anInt5080;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local57 = arg7[13] << 4;
			local63 = arg7[14] << 4;
			if (Static367.aBoolean487) {
				local380 = arg7[6] * Static259.anInt5080 + Static394.anInt7089 * arg7[3] + Static224.anInt4607 * arg7[0] + 8192 >> 14;
				local404 = Static259.anInt5080 * arg7[7] + arg7[4] * Static394.anInt7089 + arg7[1] * Static224.anInt4607 + 8192 >> 14;
				local404 += local57;
				local427 = arg7[8] * Static259.anInt5080 + Static224.anInt4607 * arg7[2] + Static394.anInt7089 * arg7[5] + 8192 >> 14;
				local380 += local252;
				local427 += local63;
				Static224.anInt4607 = local380;
				Static394.anInt7089 = local404;
				Static367.aBoolean487 = false;
				Static259.anInt5080 = local427;
			}
			local380 = arg2 << 15 >> 7;
			local404 = arg3 << 15 >> 7;
			local427 = arg4 << 15 >> 7;
			local462 = -Static224.anInt4607 * local380 + 8192 >> 14;
			local466 = -Static394.anInt7089 * local404 + 8192 >> 14;
			local470 = local427 * -Static259.anInt5080 + 8192 >> 14;
			local474 = Static224.anInt4607 + local462;
			local482 = Static394.anInt7089 + local466;
			local490 = Static259.anInt5080 + local470;
			@Pc(2013) int[] local2013 = new int[] { local380 * arg7[0] + 8192 >> 14, arg7[3] * local380 + 8192 >> 14, arg7[6] * local380 + 8192 >> 14, arg7[1] * local404 + 8192 >> 14, local404 * arg7[4] + 8192 >> 14, local404 * arg7[7] + 8192 >> 14, local427 * arg7[2] + 8192 >> 14, arg7[5] * local427 + 8192 >> 14, arg7[8] * local427 + 8192 >> 14 };
			local646 = local252 * local380 + 8192 >> 14;
			local671 = local404 * local57 + 8192 >> 14;
			@Pc(2141) int local2141 = local671 + local482;
			local675 = local63 * local427 + 8192 >> 14;
			@Pc(2153) int local2153 = local646 + local474;
			@Pc(2157) int local2157 = local675 + local490;
			@Pc(2160) int[] local2160 = new int[9];
			@Pc(2166) int local2166;
			for (local683 = 0; local683 < 3; local683++) {
				for (local2166 = 0; local2166 < 3; local2166++) {
					local688 = 0;
					for (local692 = 0; local692 < 3; local692++) {
						local688 += arg7[local683 * 3 + local692] * local2013[local2166 + local692 * 3];
					}
					local2160[local2166 + local683 * 3] = local688 + 8192 >> 14;
				}
			}
			local2166 = arg7[2] * local2157 + local2153 * arg7[0] + arg7[1] * local2141 + 8192 >> 14;
			local688 = arg7[5] * local2157 + local2141 * arg7[4] + local2153 * arg7[3] + 8192 >> 14;
			local692 = arg7[8] * local2157 + arg7[7] * local2141 + local2153 * arg7[6] + 8192 >> 14;
			local2166 += local33;
			local688 += local35;
			local692 += local41;
			for (local696 = 0; local696 < local8; local696++) {
				local698 = arg1[local696];
				if (local698 < this.anIntArrayArray28.length) {
					local830 = this.anIntArrayArray28[local698];
					for (local832 = 0; local832 < local830.length; local832++) {
						local836 = local830[local832];
						if (this.aShortArray52 == null || (this.aShortArray52[local836] & arg6) != 0) {
							local840 = local2160[2] * this.anIntArray268[local836] + this.anIntArray269[local836] * local2160[1] + this.anIntArray272[local836] * local2160[0] + 8192 >> 14;
							local842 = this.anIntArray269[local836] * local2160[4] + this.anIntArray272[local836] * local2160[3] + local2160[5] * this.anIntArray268[local836] + 8192 >> 14;
							@Pc(2406) int local2406 = local842 + local688;
							local972 = this.anIntArray268[local836] * local2160[8] + this.anIntArray269[local836] * local2160[7] + this.anIntArray272[local836] * local2160[6] + 8192 >> 14;
							@Pc(2441) int local2441 = local840 + local2166;
							this.anIntArray272[local836] = local2441;
							@Pc(2450) int local2450 = local972 + local692;
							this.anIntArray269[local836] = local2406;
							this.anIntArray268[local836] = local2450;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt3925; local15++) {
			@Pc(34) int local34 = this.anIntArray269[local15] * local9 + local13 * this.anIntArray272[local15] >> 14;
			this.anIntArray269[local15] = local13 * this.anIntArray269[local15] - this.anIntArray272[local15] * local9 >> 14;
			this.anIntArray272[local15] = local34;
		}
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
		this.aBoolean331 = false;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IILclient!kd;ZI)Z")
	@Override
	public boolean method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3259(arg4, arg0, arg1, -1, arg3, arg2);
	}

	@OriginalMember(owner = "client!gea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt3904;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!kd;)V")
	@Override
	public void method7723(@OriginalArg(0) Class6 arg0) {
		@Pc(8) Class6_Sub1 local8 = (Class6_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass130Array2 != null) {
			for (local13 = 0; local13 < this.aClass130Array2.length; local13++) {
				@Pc(20) Class130 local20 = this.aClass130Array2[local13];
				@Pc(22) Class130 local22 = local20;
				if (local20.aClass130_1 != null) {
					local22 = local20.aClass130_1;
				}
				local22.anInt4019 = (int) (local8.aFloat11 + (float) this.anIntArray268[local20.anInt4011] * local8.aFloat8 + local8.aFloat4 * (float) this.anIntArray272[local20.anInt4011] + local8.aFloat7 * (float) this.anIntArray269[local20.anInt4011]);
				local22.anInt4023 = (int) (local8.aFloat10 * (float) this.anIntArray272[local20.anInt4011] + local8.aFloat5 * (float) this.anIntArray269[local20.anInt4011] + local8.aFloat13 * (float) this.anIntArray268[local20.anInt4011] + local8.aFloat9);
				local22.anInt4018 = (int) (local8.aFloat12 + (float) this.anIntArray269[local20.anInt4011] * local8.aFloat6 + local8.aFloat3 * (float) this.anIntArray272[local20.anInt4011] + (float) this.anIntArray268[local20.anInt4011] * local8.aFloat2);
				local22.anInt4012 = (int) ((float) this.anIntArray268[local20.anInt4017] * local8.aFloat8 + (float) this.anIntArray269[local20.anInt4017] * local8.aFloat7 + local8.aFloat4 * (float) this.anIntArray272[local20.anInt4017] + local8.aFloat11);
				local22.anInt4025 = (int) ((float) this.anIntArray269[local20.anInt4017] * local8.aFloat5 + (float) this.anIntArray272[local20.anInt4017] * local8.aFloat10 + local8.aFloat13 * (float) this.anIntArray268[local20.anInt4017] + local8.aFloat9);
				local22.anInt4024 = (int) (local8.aFloat12 + (float) this.anIntArray268[local20.anInt4017] * local8.aFloat2 + (float) this.anIntArray269[local20.anInt4017] * local8.aFloat6 + local8.aFloat3 * (float) this.anIntArray272[local20.anInt4017]);
				local22.anInt4028 = (int) (local8.aFloat4 * (float) this.anIntArray272[local20.anInt4029] + (float) this.anIntArray269[local20.anInt4029] * local8.aFloat7 + local8.aFloat8 * (float) this.anIntArray268[local20.anInt4029] + local8.aFloat11);
				local22.anInt4014 = (int) (local8.aFloat10 * (float) this.anIntArray272[local20.anInt4029] + local8.aFloat5 * (float) this.anIntArray269[local20.anInt4029] + local8.aFloat13 * (float) this.anIntArray268[local20.anInt4029] + local8.aFloat9);
				local22.anInt4016 = (int) (local8.aFloat12 + local8.aFloat2 * (float) this.anIntArray268[local20.anInt4029] + (float) this.anIntArray272[local20.anInt4029] * local8.aFloat3 + (float) this.anIntArray269[local20.anInt4029] * local8.aFloat6);
			}
		}
		if (this.aClass337Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass337Array2.length; local13++) {
			@Pc(361) Class337 local361 = this.aClass337Array2[local13];
			@Pc(363) Class337 local363 = local361;
			if (local361.aClass337_2 != null) {
				local363 = local361.aClass337_2;
			}
			if (local361.aClass6_35 == null) {
				local361.aClass6_35 = local8.method6709();
			} else {
				local361.aClass6_35.method6695(local8);
			}
			local363.anInt9397 = (int) (local8.aFloat11 + (float) this.anIntArray268[local361.anInt9398] * local8.aFloat8 + (float) this.anIntArray269[local361.anInt9398] * local8.aFloat7 + local8.aFloat4 * (float) this.anIntArray272[local361.anInt9398]);
			local363.anInt9394 = (int) ((float) this.anIntArray268[local361.anInt9398] * local8.aFloat13 + (float) this.anIntArray269[local361.anInt9398] * local8.aFloat5 + (float) this.anIntArray272[local361.anInt9398] * local8.aFloat10 + local8.aFloat9);
			local363.anInt9393 = (int) (local8.aFloat12 + (float) this.anIntArray268[local361.anInt9398] * local8.aFloat2 + local8.aFloat6 * (float) this.anIntArray269[local361.anInt9398] + (float) this.anIntArray272[local361.anInt9398] * local8.aFloat3);
		}
	}

	@OriginalMember(owner = "client!gea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean331) {
			this.method3260();
		}
		return this.aShort66;
	}

	@OriginalMember(owner = "client!gea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class112 arg2, @OriginalArg(3) Class112 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean331) {
			this.method3260();
		}
		@Pc(16) int local16 = this.aShort70 + arg4;
		@Pc(21) int local21 = this.aShort64 + arg4;
		@Pc(26) int local26 = arg6 + this.aShort68;
		@Pc(31) int local31 = this.aShort67 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9344 + local21 >> arg2.anInt9341 >= arg2.anInt9348 || local26 < 0 || arg2.anInt9344 + local31 >> arg2.anInt9341 >= arg2.anInt9340)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt9344 >> arg3.anInt9341 >= arg3.anInt9348 || local26 < 0 || arg3.anInt9340 <= arg3.anInt9344 + local31 >> arg3.anInt9341) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9341;
			local21 = local21 + arg2.anInt9344 - 1 >> arg2.anInt9341;
			local26 >>= arg2.anInt9341;
			local31 = arg2.anInt9344 + local31 - 1 >> arg2.anInt9341;
			if (arg5 == arg2.method7819(local26, local16) && arg2.method7819(local26, local21) == arg5 && arg5 == arg2.method7819(local31, local16) && arg5 == arg2.method7819(local31, local21)) {
				return;
			}
		}
		@Pc(273) int local273;
		if (arg0 == 1) {
			for (local273 = 0; local273 < this.anInt3925; local273++) {
				this.anIntArray269[local273] = this.anIntArray269[local273] + arg2.method7826(this.anIntArray272[local273] - -arg4, arg6 + this.anIntArray268[local273]) - arg5;
			}
		} else {
			@Pc(202) int local202;
			@Pc(213) int local213;
			if (arg0 == 2) {
				@Pc(194) short local194 = this.aShort63;
				if (local194 == 0) {
					return;
				}
				for (local202 = 0; local202 < this.anInt3925; local202++) {
					local213 = (this.anIntArray269[local202] << 16) / local194;
					if (arg1 > local213) {
						this.anIntArray269[local202] += (arg2.method7826(this.anIntArray272[local202] + arg4, this.anIntArray268[local202] + arg6) - arg5) * (arg1 + -local213) / arg1;
					}
				}
			} else {
				@Pc(344) int local344;
				if (arg0 == 3) {
					local273 = (arg1 & 0xFF) * 4;
					local202 = (arg1 >> 8 & 0xFF) * 4;
					local213 = (arg1 >> 16 & 0xFF) << 6;
					local344 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local273 >> 1) < 0 || arg2.anInt9348 << arg2.anInt9341 <= arg2.anInt9344 + (local273 >> 1) + arg4 || arg6 - (local202 >> 1) < 0 || (local202 >> 1) + (arg6 + arg2.anInt9344) >= arg2.anInt9340 << arg2.anInt9341) {
						return;
					}
					this.method7728(local213, local202, arg2, local344, arg6, local273, arg5, arg4);
				} else if (arg0 == 4) {
					local273 = this.aShort62 - this.aShort63;
					for (local202 = 0; local202 < this.anInt3925; local202++) {
						this.anIntArray269[local202] = this.anIntArray269[local202] + arg3.method7826(arg4 + this.anIntArray272[local202], this.anIntArray268[local202] + arg6) + local273 - arg5;
					}
				} else if (arg0 == 5) {
					local273 = this.aShort62 - this.aShort63;
					for (local202 = 0; local202 < this.anInt3925; local202++) {
						local213 = this.anIntArray272[local202] + arg4;
						local344 = arg6 + this.anIntArray268[local202];
						@Pc(350) int local350 = arg2.method7826(local213, local344);
						@Pc(356) int local356 = arg3.method7826(local213, local344);
						@Pc(364) int local364 = local350 - arg1 - local356;
						this.anIntArray269[local202] = local350 + (local364 * ((this.anIntArray269[local202] << 8) / local273) >> 8) - arg5;
					}
				}
			}
		}
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
		this.aBoolean331 = false;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class25 method7732(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class25_Sub2 local16;
		@Pc(12) Class25_Sub2 local12;
		if (arg0 == 1) {
			local12 = this.aClass87_Sub2_8.aClass25_Sub2_10;
			local16 = this.aClass87_Sub2_8.aClass25_Sub2_2;
		} else if (arg0 == 2) {
			local16 = this.aClass87_Sub2_8.aClass25_Sub2_9;
			local12 = this.aClass87_Sub2_8.aClass25_Sub2_7;
		} else if (arg0 == 3) {
			local16 = this.aClass87_Sub2_8.aClass25_Sub2_3;
			local12 = this.aClass87_Sub2_8.aClass25_Sub2_1;
		} else if (arg0 == 4) {
			local16 = this.aClass87_Sub2_8.aClass25_Sub2_5;
			local12 = this.aClass87_Sub2_8.aClass25_Sub2_4;
		} else if (arg0 == 5) {
			local16 = this.aClass87_Sub2_8.aClass25_Sub2_6;
			local12 = this.aClass87_Sub2_8.aClass25_Sub2_8;
		} else {
			local16 = local12 = new Class25_Sub2(this.aClass87_Sub2_8);
		}
		return this.method3250(arg2, arg0 != 0, local12, arg1, local16);
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(ZZ)V")
	private void method3257(@OriginalArg(0) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass66_5 != null && this.aClass66_5.anInterface23_1 == null;
		@Pc(27) boolean local27 = this.aClass66_4 != null && this.aClass66_4.anInterface23_1 == null;
		@Pc(38) boolean local38 = this.aClass66_3 != null && this.aClass66_3.anInterface23_1 == null;
		@Pc(49) boolean local49 = this.aClass66_6 != null && this.aClass66_6.anInterface23_1 == null;
		if (arg0) {
			local49 &= (this.aByte72 & 0x8) != 0;
			local38 &= (this.aByte72 & 0x1) != 0;
			local27 &= (this.aByte72 & 0x4) != 0;
			local16 &= (this.aByte72 & 0x2) != 0;
		}
		@Pc(103) byte local103 = 0;
		@Pc(113) byte local113 = 0;
		@Pc(115) byte local115 = 0;
		if (local38) {
			local103 = 12;
		}
		@Pc(126) byte local126 = 0;
		if (local16) {
			local113 = local103;
			local103 = (byte) (local103 + 4);
		}
		if (local27) {
			local115 = local103;
			local103 = (byte) (local103 + 12);
		}
		if (local49) {
			local126 = local103;
			local103 = (byte) (local103 + 8);
		}
		if (local103 == 0) {
			return;
		}
		if (this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3.aByteArray77.length >= this.anInt3941 * local103) {
			this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3.anInt8188 = 0;
		} else {
			this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3 = new Class2_Sub34_Sub1((this.anInt3941 + 100) * local103);
		}
		@Pc(196) Class2_Sub34_Sub1 local196 = this.aClass87_Sub2_8.aClass2_Sub34_Sub1_3;
		@Pc(204) int local204;
		@Pc(213) int local213;
		@Pc(241) int local241;
		@Pc(250) int local250;
		if (local38) {
			@Pc(220) int local220;
			@Pc(227) int local227;
			@Pc(232) int local232;
			@Pc(239) int local239;
			if (this.aClass87_Sub2_8.aBoolean559) {
				for (local204 = 0; local204 < this.anInt3925; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray272[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray269[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray268[local204]);
					local232 = this.anIntArray271[local204];
					local239 = this.anIntArray271[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray54[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt8188 = local103 * local250;
						local196.method6864(local213);
						local196.method6864(local220);
						local196.method6864(local227);
					}
				}
			} else {
				for (local204 = 0; local204 < this.anInt3925; local204++) {
					local213 = Stream.floatToRawIntBits((float) this.anIntArray272[local204]);
					local220 = Stream.floatToRawIntBits((float) this.anIntArray269[local204]);
					local227 = Stream.floatToRawIntBits((float) this.anIntArray268[local204]);
					local232 = this.anIntArray271[local204];
					local239 = this.anIntArray271[local204 + 1];
					for (local241 = local232; local241 < local239; local241++) {
						local250 = this.aShortArray54[local241] - 1;
						if (local250 == -1) {
							break;
						}
						local196.anInt8188 = local250 * local103;
						local196.method6858(local213);
						local196.method6858(local220);
						local196.method6858(local227);
					}
				}
			}
		}
		@Pc(559) float local559;
		@Pc(466) short[] local466;
		@Pc(462) short[] local462;
		@Pc(470) short[] local470;
		@Pc(458) byte[] local458;
		@Pc(614) float local614;
		if (local16) {
			if (this.aClass66_4 == null) {
				if (this.aClass90_1 == null) {
					local458 = this.aByteArray38;
					local466 = this.aShortArray55;
					local462 = this.aShortArray49;
					local470 = this.aShortArray45;
				} else {
					local458 = this.aClass90_1.aByteArray28;
					local462 = this.aClass90_1.aShortArray36;
					local466 = this.aClass90_1.aShortArray35;
					local470 = this.aClass90_1.aShortArray34;
				}
				@Pc(490) float local490 = this.aClass87_Sub2_8.aFloatArray62[0];
				@Pc(496) float local496 = this.aClass87_Sub2_8.aFloatArray62[1];
				@Pc(502) float local502 = this.aClass87_Sub2_8.aFloatArray62[2];
				@Pc(506) float local506 = this.aClass87_Sub2_8.aFloat174;
				@Pc(516) float local516 = this.aClass87_Sub2_8.aFloat177 * 768.0F / (float) this.aShort65;
				@Pc(526) float local526 = this.aClass87_Sub2_8.aFloat165 * 768.0F / (float) this.aShort65;
				for (@Pc(528) int local528 = 0; local528 < this.anInt3918; local528++) {
					@Pc(548) int local548 = this.method3248(this.aByteArray37[local528], this.aShortArray46[local528], this.aShortArray47[local528], this.aShort71);
					local559 = (float) (local548 >> 16 & 0xFF) * this.aClass87_Sub2_8.aFloat180;
					@Pc(568) float local568 = (float) (local548 >>> 24) * this.aClass87_Sub2_8.aFloat176;
					@Pc(573) short local573 = this.aShortArray53[local528];
					@Pc(584) float local584 = this.aClass87_Sub2_8.aFloat179 * (float) (local548 >> 8 & 0xFF);
					@Pc(589) short local589 = (short) local458[local573];
					if (local589 == 0) {
						local614 = ((float) local466[local573] * local496 + (float) local462[local573] * local490 + local502 * (float) local470[local573]) * 0.0026041667F;
					} else {
						local614 = ((float) local466[local573] * local496 + local490 * (float) local462[local573] + (float) local470[local573] * local502) / (float) (local589 * 256);
					}
					@Pc(654) float local654 = (local614 < 0.0F ? local526 : local516) * local614 + local506;
					@Pc(659) int local659 = (int) (local568 * local654);
					@Pc(664) int local664 = (int) (local654 * local559);
					if (local659 < 0) {
						local659 = 0;
					} else if (local659 > 255) {
						local659 = 255;
					}
					@Pc(682) int local682 = (int) (local584 * local654);
					if (local664 < 0) {
						local664 = 0;
					} else if (local664 > 255) {
						local664 = 255;
					}
					local196.anInt8188 = local103 * local573 + local113;
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local196.method6894(local659);
					local196.method6894(local664);
					local196.method6894(local682);
					local196.method6894(255 - (this.aByteArray37[local528] & 0xFF));
					local573 = this.aShortArray48[local528];
					local589 = local458[local573];
					if (local589 == 0) {
						local614 = ((float) local470[local573] * local502 + local490 * (float) local462[local573] + (float) local466[local573] * local496) * 0.0026041667F;
					} else {
						local614 = (local502 * (float) local470[local573] + local496 * (float) local466[local573] + local490 * (float) local462[local573]) / (float) (local589 * 256);
					}
					local654 = local506 + (local614 < 0.0F ? local526 : local516) * local614;
					local659 = (int) (local568 * local654);
					if (local659 < 0) {
						local659 = 0;
					} else if (local659 > 255) {
						local659 = 255;
					}
					local664 = (int) (local654 * local559);
					if (local664 < 0) {
						local664 = 0;
					} else if (local664 > 255) {
						local664 = 255;
					}
					local682 = (int) (local584 * local654);
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local196.anInt8188 = local113 + local103 * local573;
					local196.method6894(local659);
					local196.method6894(local664);
					local196.method6894(local682);
					local196.method6894(255 - (this.aByteArray37[local528] & 0xFF));
					local573 = this.aShortArray51[local528];
					local589 = local458[local573];
					if (local589 == 0) {
						local614 = ((float) local470[local573] * local502 + local496 * (float) local466[local573] + (float) local462[local573] * local490) * 0.0026041667F;
					} else {
						local614 = (local502 * (float) local470[local573] + local490 * (float) local462[local573] + local496 * (float) local466[local573]) / (float) (local589 * 256);
					}
					local654 = local614 * (local614 < 0.0F ? local526 : local516) + local506;
					local659 = (int) (local654 * local568);
					if (local659 < 0) {
						local659 = 0;
					} else if (local659 > 255) {
						local659 = 255;
					}
					local664 = (int) (local654 * local559);
					local682 = (int) (local654 * local584);
					if (local664 < 0) {
						local664 = 0;
					} else if (local664 > 255) {
						local664 = 255;
					}
					if (local682 < 0) {
						local682 = 0;
					} else if (local682 > 255) {
						local682 = 255;
					}
					local196.anInt8188 = local113 + local103 * local573;
					local196.method6894(local659);
					local196.method6894(local664);
					local196.method6894(local682);
					local196.method6894(255 - (this.aByteArray37[local528] & 0xFF));
				}
			} else {
				for (local204 = 0; local204 < this.anInt3918; local204++) {
					local213 = this.method3248(this.aByteArray37[local204], this.aShortArray46[local204], this.aShortArray47[local204], this.aShort71);
					local196.anInt8188 = local113 + local103 * this.aShortArray53[local204];
					local196.method6864(local213);
					local196.anInt8188 = local113 + local103 * this.aShortArray48[local204];
					local196.method6864(local213);
					local196.anInt8188 = local113 + this.aShortArray51[local204] * local103;
					local196.method6864(local213);
				}
			}
		}
		if (local27) {
			if (this.aClass90_1 == null) {
				local470 = this.aShortArray45;
				local466 = this.aShortArray55;
				local458 = this.aByteArray38;
				local462 = this.aShortArray49;
			} else {
				local458 = this.aClass90_1.aByteArray28;
				local470 = this.aClass90_1.aShortArray34;
				local466 = this.aClass90_1.aShortArray35;
				local462 = this.aClass90_1.aShortArray36;
			}
			@Pc(1113) float local1113 = 3.0F / (float) this.aShort65;
			local196.anInt8188 = local115;
			local614 = 3.0F / (float) (this.aShort65 + this.aShort65 / 2);
			if (this.aClass87_Sub2_8.aBoolean559) {
				for (local241 = 0; local241 < this.anInt3941; local241++) {
					local250 = local458[local241] & 0xFF;
					if (local250 == 0) {
						local196.method5393((float) local462[local241] * local614);
						local196.method5393(local614 * (float) local466[local241]);
						local196.method5393((float) local470[local241] * local614);
					} else {
						local559 = local1113 / (float) local250;
						local196.method5393(local559 * (float) local462[local241]);
						local196.method5393((float) local466[local241] * local559);
						local196.method5393((float) local470[local241] * local559);
					}
					local196.anInt8188 += local103 - 12;
				}
			} else {
				for (local241 = 0; local241 < this.anInt3941; local241++) {
					local250 = local458[local241] & 0xFF;
					if (local250 == 0) {
						local196.method5392((float) local462[local241] * local614);
						local196.method5392(local614 * (float) local466[local241]);
						local196.method5392(local614 * (float) local470[local241]);
					} else {
						local559 = local1113 / (float) local250;
						local196.method5392(local559 * (float) local462[local241]);
						local196.method5392(local559 * (float) local466[local241]);
						local196.method5392((float) local470[local241] * local559);
					}
					local196.anInt8188 += local103 - 12;
				}
			}
		}
		if (local49) {
			local196.anInt8188 = local126;
			if (this.aClass87_Sub2_8.aBoolean559) {
				for (local204 = 0; local204 < this.anInt3941; local204++) {
					local196.method5393(this.aFloatArray35[local204]);
					local196.method5393(this.aFloatArray34[local204]);
					local196.anInt8188 += local103 - 8;
				}
			} else {
				for (local204 = 0; local204 < this.anInt3941; local204++) {
					local196.method5392(this.aFloatArray35[local204]);
					local196.method5392(this.aFloatArray34[local204]);
					local196.anInt8188 += local103 - 8;
				}
			}
		}
		local196.anInt8188 = local103 * this.anInt3941;
		@Pc(1430) Interface23 local1430;
		if (arg0) {
			if (this.anInterface23_3 == null) {
				this.anInterface23_3 = this.aClass87_Sub2_8.method6160(true, local196.aByteArray77, local103, local196.anInt8188);
			} else {
				this.anInterface23_3.method5652(local103, local196.anInt8188, local196.aByteArray77);
			}
			this.aByte72 = 0;
			local1430 = this.anInterface23_3;
		} else {
			local1430 = this.aClass87_Sub2_8.method6160(false, local196.aByteArray77, local103, local196.anInt8188);
			this.aBoolean333 = true;
		}
		if (local38) {
			this.aClass66_3.aByte43 = 0;
			this.aClass66_3.anInterface23_1 = local1430;
		}
		if (local49) {
			this.aClass66_6.anInterface23_1 = local1430;
			this.aClass66_6.aByte43 = local126;
		}
		if (local16) {
			this.aClass66_5.aByte43 = local113;
			this.aClass66_5.anInterface23_1 = local1430;
		}
		if (local27) {
			this.aClass66_4.anInterface23_1 = local1430;
			this.aClass66_4.aByte43 = local115;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IJIIFILclient!ww;FII)S")
	private short method3258(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(6) Class379 arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) int local15 = this.anIntArray271[arg8];
		@Pc(22) int local22 = this.anIntArray271[arg8 + 1];
		@Pc(24) int local24 = 0;
		for (@Pc(26) int local26 = local15; local26 < local22; local26++) {
			@Pc(33) short local33 = this.aShortArray54[local26];
			if (local33 == 0) {
				local24 = local26;
				break;
			}
			if (Static54.aLongArray8[local26] == arg1) {
				return (short) (local33 - 1);
			}
		}
		this.aShortArray54[local24] = (short) (this.anInt3941 + 1);
		Static54.aLongArray8[local24] = arg1;
		this.aShortArray49[this.anInt3941] = (short) arg2;
		this.aShortArray55[this.anInt3941] = (short) arg3;
		this.aShortArray45[this.anInt3941] = (short) arg7;
		this.aByteArray38[this.anInt3941] = (byte) arg0;
		this.aFloatArray35[this.anInt3941] = arg4;
		this.aFloatArray34[this.anInt3941] = arg6;
		return (short) this.anInt3941++;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIIIBZLclient!kd;)Z")
	private boolean method3259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class6 arg5) {
		@Pc(8) Class6_Sub1 local8 = (Class6_Sub1) arg5;
		@Pc(12) Class6_Sub1 local12 = this.aClass87_Sub2_8.aClass6_Sub1_3;
		@Pc(33) float local33 = local12.aFloat11 + local12.aFloat4 * local8.aFloat11 + local12.aFloat7 * local8.aFloat9 + local12.aFloat8 * local8.aFloat12;
		@Pc(54) float local54 = local12.aFloat13 * local8.aFloat12 + local8.aFloat9 * local12.aFloat5 + local12.aFloat10 * local8.aFloat11 + local12.aFloat9;
		Static257.aFloat118 = local12.aFloat3 * local8.aFloat8 + local8.aFloat13 * local12.aFloat6 + local12.aFloat2 * local8.aFloat2;
		Static8.aFloat14 = local8.aFloat5 * local12.aFloat5 + local12.aFloat10 * local8.aFloat7 + local12.aFloat13 * local8.aFloat6;
		Static408.aFloat185 = local8.aFloat4 * local12.aFloat3 + local8.aFloat10 * local12.aFloat6 + local12.aFloat2 * local8.aFloat3;
		Static251.aFloat116 = local8.aFloat4 * local12.aFloat10 + local8.aFloat10 * local12.aFloat5 + local8.aFloat3 * local12.aFloat13;
		Static603.aFloat222 = local12.aFloat10 * local8.aFloat8 + local12.aFloat5 * local8.aFloat13 + local12.aFloat13 * local8.aFloat2;
		Static68.aFloat31 = local8.aFloat7 * local12.aFloat4 + local12.aFloat7 * local8.aFloat5 + local8.aFloat6 * local12.aFloat8;
		Static259.aFloat119 = local8.aFloat8 * local12.aFloat4 + local12.aFloat7 * local8.aFloat13 + local12.aFloat8 * local8.aFloat2;
		@Pc(201) float local201 = local12.aFloat12 + local8.aFloat9 * local12.aFloat6 + local8.aFloat11 * local12.aFloat3 + local8.aFloat12 * local12.aFloat2;
		Static532.aFloat217 = local8.aFloat4 * local12.aFloat4 + local12.aFloat7 * local8.aFloat10 + local12.aFloat8 * local8.aFloat3;
		Static128.aFloat69 = local12.aFloat6 * local8.aFloat5 + local12.aFloat3 * local8.aFloat7 + local8.aFloat6 * local12.aFloat2;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass87_Sub2_8.anInt7409;
		@Pc(255) int local255 = this.aClass87_Sub2_8.anInt7384;
		if (!this.aBoolean331) {
			this.method3260();
		}
		@Pc(270) int local270 = this.aShort64 - this.aShort70 >> 1;
		@Pc(278) int local278 = this.aShort62 - this.aShort63 >> 1;
		@Pc(287) int local287 = this.aShort67 - this.aShort68 >> 1;
		@Pc(292) int local292 = local270 + this.aShort70;
		@Pc(297) int local297 = this.aShort63 + local278;
		@Pc(302) int local302 = local287 + this.aShort68;
		@Pc(309) int local309 = local292 - (local270 << arg0);
		@Pc(316) int local316 = local297 - (local278 << arg0);
		@Pc(322) int local322 = local302 - (local287 << arg0);
		@Pc(328) int local328 = (local270 << arg0) + local292;
		@Pc(342) int local342 = local297 + (local278 << arg0);
		Static283.anIntArray363[0] = local309;
		@Pc(352) int local352 = local302 + (local287 << arg0);
		Static444.anIntArray536[0] = local316;
		Static81.anIntArray153[0] = local322;
		Static283.anIntArray363[1] = local328;
		Static444.anIntArray536[1] = local316;
		Static81.anIntArray153[1] = local322;
		Static283.anIntArray363[2] = local309;
		Static444.anIntArray536[2] = local342;
		Static283.anIntArray363[3] = local328;
		Static81.anIntArray153[2] = local322;
		Static444.anIntArray536[3] = local342;
		Static81.anIntArray153[3] = local322;
		Static283.anIntArray363[4] = local309;
		Static444.anIntArray536[4] = local316;
		Static283.anIntArray363[5] = local328;
		Static81.anIntArray153[4] = local352;
		Static444.anIntArray536[5] = local316;
		Static283.anIntArray363[6] = local309;
		Static81.anIntArray153[5] = local352;
		Static444.anIntArray536[6] = local342;
		Static81.anIntArray153[6] = local352;
		Static283.anIntArray363[7] = local328;
		Static444.anIntArray536[7] = local342;
		Static81.anIntArray153[7] = local352;
		@Pc(477) float local477;
		@Pc(505) float local505;
		@Pc(491) float local491;
		@Pc(458) float local458;
		@Pc(463) float local463;
		@Pc(453) float local453;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = Static81.anIntArray153[local446];
			local458 = Static283.anIntArray363[local446];
			local463 = Static444.anIntArray536[local446];
			local477 = local453 * Static259.aFloat119 + Static68.aFloat31 * local463 + local458 * Static532.aFloat217 + local33;
			local491 = local463 * Static128.aFloat69 + Static408.aFloat185 * local458 + local453 * Static257.aFloat118 + local201;
			local505 = local463 * Static8.aFloat14 + Static251.aFloat116 * local458 + Static603.aFloat222 * local453 + local54;
			if ((float) this.aClass87_Sub2_8.anInt7397 <= local491) {
				if (arg3 > 0) {
					local491 = arg3;
				}
				@Pc(532) float local532 = (float) this.aClass87_Sub2_8.anInt7408 + local477 * (float) local251 / local491;
				if (local241 > local532) {
					local241 = local532;
				}
				if (local532 > local243) {
					local243 = local532;
				}
				@Pc(556) float local556 = (float) this.aClass87_Sub2_8.anInt7379 + (float) local255 * local505 / local491;
				if (local245 > local556) {
					local245 = local556;
				}
				if (local247 < local556) {
					local247 = local556;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg1 && (float) arg1 < local243 && (float) arg2 > local245 && local247 > (float) arg2) {
			if (arg4) {
				return true;
			}
			if (this.anInt3941 > this.aClass87_Sub2_8.anIntArray497.length) {
				this.aClass87_Sub2_8.anIntArray497 = new int[this.anInt3941];
				this.aClass87_Sub2_8.anIntArray499 = new int[this.anInt3941];
			}
			@Pc(625) int[] local625 = this.aClass87_Sub2_8.anIntArray497;
			@Pc(629) int[] local629 = this.aClass87_Sub2_8.anIntArray499;
			@Pc(718) int local718;
			for (@Pc(631) int local631 = 0; local631 < this.anInt3925; local631++) {
				local463 = this.anIntArray269[local631];
				local453 = this.anIntArray268[local631];
				local458 = this.anIntArray272[local631];
				local491 = local201 + local453 * Static257.aFloat118 + local463 * Static128.aFloat69 + local458 * Static408.aFloat185;
				local505 = local453 * Static603.aFloat222 + Static8.aFloat14 * local463 + local458 * Static251.aFloat116 + local54;
				local477 = local33 + local453 * Static259.aFloat119 + Static68.aFloat31 * local463 + Static532.aFloat217 * local458;
				@Pc(731) int local731;
				@Pc(736) int local736;
				@Pc(743) int local743;
				if ((float) this.aClass87_Sub2_8.anInt7397 <= local491) {
					if (arg3 > 0) {
						local491 = arg3;
					}
					local718 = (int) ((float) this.aClass87_Sub2_8.anInt7408 + (float) local251 * local477 / local491);
					local731 = (int) ((float) this.aClass87_Sub2_8.anInt7379 + local505 * (float) local255 / local491);
					local736 = this.anIntArray271[local631];
					local743 = this.anIntArray271[local631 + 1];
					for (@Pc(745) int local745 = local736; local745 < local743; local745++) {
						@Pc(754) int local754 = this.aShortArray54[local745] - 1;
						if (local754 == -1) {
							break;
						}
						local625[local754] = local718;
						local629[local754] = local731;
					}
				} else {
					local718 = this.anIntArray271[local631];
					local731 = this.anIntArray271[local631 + 1];
					for (local736 = local718; local736 < local731; local736++) {
						local743 = this.aShortArray54[local736] - 1;
						if (local743 == -1) {
							break;
						}
						local625[this.aShortArray54[local736] - 1] = -999999;
					}
				}
			}
			for (local718 = 0; local718 < this.anInt3918; local718++) {
				if (local625[this.aShortArray53[local718]] != -999999 && local625[this.aShortArray48[local718]] != -999999 && local625[this.aShortArray51[local718]] != -999999 && this.method3255(arg1, local625[this.aShortArray53[local718]], local625[this.aShortArray48[local718]], local629[this.aShortArray48[local718]], local629[this.aShortArray53[local718]], arg2, local629[this.aShortArray51[local718]], local625[this.aShortArray51[local718]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class353.anIntArray681[arg0];
		@Pc(13) int local13 = Class353.anIntArray682[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt3925; local15++) {
			local33 = this.anIntArray268[local15] * local9 + this.anIntArray272[local15] * local13 >> 14;
			this.anIntArray268[local15] = local13 * this.anIntArray268[local15] - local9 * this.anIntArray272[local15] >> 14;
			this.anIntArray272[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt3941; local33++) {
			@Pc(83) int local83 = this.aShortArray45[local33] * local9 + local13 * this.aShortArray49[local33] >> 14;
			this.aShortArray45[local33] = (short) (local13 * this.aShortArray45[local33] - local9 * this.aShortArray49[local33] >> 14);
			this.aShortArray49[local33] = (short) local83;
		}
		if (this.aClass66_4 == null && this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
		}
		if (this.aClass66_4 != null) {
			this.aClass66_4.anInterface23_1 = null;
		}
		this.aBoolean331 = false;
		if (this.aClass66_3 != null) {
			this.aClass66_3.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "()Z")
	@Override
	public boolean method7713() {
		if (this.aShortArray47 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray47.length; local12++) {
			if (this.aShortArray47[local12] != -1 && !this.aClass87_Sub2_8.anInterface6_11.method6355(this.aShortArray47[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!gea", name = "b", descriptor = "(B)V")
	private void method3260() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt3925; local23++) {
			@Pc(30) int local30 = this.anIntArray272[local23];
			@Pc(35) int local35 = this.anIntArray269[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			@Pc(45) int local45 = this.anIntArray268[local23];
			if (local15 < local35) {
				local15 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local11 > local45) {
				local11 = local45;
			}
			if (local45 > local17) {
				local17 = local45;
			}
			@Pc(94) int local94 = local45 * local45 + local30 * local30;
			if (local19 < local94) {
				local19 = local94;
			}
			local94 = local30 * local30 + local45 * local45 + local35 * local35;
			if (local21 < local94) {
				local21 = local94;
			}
		}
		this.aShort70 = (short) local7;
		this.aShort68 = (short) local11;
		this.aShort63 = (short) local9;
		this.aShort64 = (short) local13;
		this.aShort67 = (short) local17;
		this.aShort62 = (short) local15;
		this.aShort69 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort66 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean331 = true;
	}

	@OriginalMember(owner = "client!gea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort71 = (short) arg0;
		if (this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
		}
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7726(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class25_Sub2 local8 = (Class25_Sub2) arg0;
		if (this.anInt3918 == 0 || local8.anInt3918 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt3925;
		@Pc(24) int[] local24 = local8.anIntArray272;
		@Pc(27) int[] local27 = local8.anIntArray269;
		@Pc(30) int[] local30 = local8.anIntArray268;
		@Pc(33) short[] local33 = local8.aShortArray49;
		@Pc(36) short[] local36 = local8.aShortArray55;
		@Pc(39) short[] local39 = local8.aShortArray45;
		@Pc(42) byte[] local42 = local8.aByteArray38;
		@Pc(57) short[] local57;
		@Pc(49) short[] local49;
		@Pc(61) short[] local61;
		@Pc(53) byte[] local53;
		if (this.aClass90_1 == null) {
			local53 = null;
			local61 = null;
			local57 = null;
			local49 = null;
		} else {
			local49 = this.aClass90_1.aShortArray35;
			local53 = this.aClass90_1.aByteArray28;
			local57 = this.aClass90_1.aShortArray36;
			local61 = this.aClass90_1.aShortArray34;
		}
		@Pc(78) short[] local78;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		@Pc(82) byte[] local82;
		if (local8.aClass90_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass90_1.aShortArray36;
			local80 = local8.aClass90_1.aShortArray34;
			local82 = local8.aClass90_1.aByteArray28;
			local76 = local8.aClass90_1.aShortArray35;
		}
		@Pc(103) int[] local103 = local8.anIntArray271;
		@Pc(106) short[] local106 = local8.aShortArray54;
		if (!local8.aBoolean331) {
			local8.method3260();
		}
		@Pc(115) short local115 = local8.aShort63;
		@Pc(118) short local118 = local8.aShort62;
		@Pc(121) short local121 = local8.aShort70;
		@Pc(124) short local124 = local8.aShort64;
		@Pc(127) short local127 = local8.aShort68;
		@Pc(130) short local130 = local8.aShort67;
		for (@Pc(132) int local132 = 0; local132 < this.anInt3925; local132++) {
			@Pc(141) int local141 = this.anIntArray269[local132] - arg2;
			if (local141 >= local115 && local141 <= local118) {
				@Pc(157) int local157 = this.anIntArray272[local132] - arg1;
				if (local121 <= local157 && local124 >= local157) {
					@Pc(181) int local181 = this.anIntArray268[local132] - arg3;
					if (local181 >= local127 && local130 >= local181) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray271[local132];
						@Pc(207) int local207 = this.anIntArray271[local132 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray54[local209] - 1;
							if (local195 == -1 || this.aByteArray38[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local21; local241++) {
								if (local24[local241] == local157 && local181 == local30[local241] && local27[local241] == local141) {
									@Pc(268) int local268 = -1;
									local207 = local103[local241 + 1];
									local200 = local103[local241];
									for (@Pc(280) int local280 = local200; local280 < local207; local280++) {
										local268 = local106[local280] - 1;
										if (local268 == -1 || local42[local268] != 0) {
											break;
										}
									}
									if (local268 != -1) {
										if (local57 == null) {
											this.aClass90_1 = new Class90();
											local57 = this.aClass90_1.aShortArray36 = Static491.method7029(this.aShortArray49);
											local49 = this.aClass90_1.aShortArray35 = Static491.method7029(this.aShortArray55);
											local61 = this.aClass90_1.aShortArray34 = Static491.method7029(this.aShortArray45);
											local53 = this.aClass90_1.aByteArray28 = Static43.method860(this.aByteArray38);
										}
										if (local78 == null) {
											@Pc(357) Class90 local357 = local8.aClass90_1 = new Class90();
											local78 = local357.aShortArray36 = Static491.method7029(local33);
											local76 = local357.aShortArray35 = Static491.method7029(local36);
											local80 = local357.aShortArray34 = Static491.method7029(local39);
											local82 = local357.aByteArray28 = Static43.method860(local42);
										}
										@Pc(390) short local390 = this.aShortArray49[local195];
										@Pc(395) short local395 = this.aShortArray55[local195];
										@Pc(400) short local400 = this.aShortArray45[local195];
										local200 = local103[local241];
										@Pc(409) byte local409 = this.aByteArray38[local195];
										local207 = local103[local241 + 1];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local200; local417 < local207; local417++) {
											local425 = local106[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local82[local425] != 0) {
												local78[local425] += local390;
												local76[local425] += local395;
												local80[local425] += local400;
												local82[local425] += local409;
											}
										}
										local200 = this.anIntArray271[local132];
										local400 = local39[local268];
										local409 = local42[local268];
										local390 = local33[local268];
										local395 = local36[local268];
										local207 = this.anIntArray271[local132 + 1];
										for (local425 = local200; local425 < local207; local425++) {
											@Pc(507) int local507 = this.aShortArray54[local425] - 1;
											if (local507 == -1) {
												break;
											}
											if (local53[local507] != 0) {
												local57[local507] += local390;
												local49[local507] += local395;
												local61[local507] += local400;
												local53[local507] += local409;
											}
										}
										if (this.aClass66_4 == null && this.aClass66_5 != null) {
											this.aClass66_5.anInterface23_1 = null;
										}
										if (this.aClass66_4 != null) {
											this.aClass66_4.anInterface23_1 = null;
										}
										if (local8.aClass66_4 == null && local8.aClass66_5 != null) {
											local8.aClass66_5.anInterface23_1 = null;
										}
										if (local8.aClass66_4 != null) {
											local8.aClass66_4.anInterface23_1 = null;
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

	@OriginalMember(owner = "client!gea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray28 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt3903; local12++) {
			this.anIntArray272[local12] <<= 0x4;
			this.anIntArray269[local12] <<= 0x4;
			this.anIntArray268[local12] <<= 0x4;
		}
		Static259.anInt5080 = 0;
		Static224.anInt4607 = 0;
		Static394.anInt7089 = 0;
		return true;
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt3918; local7++) {
			local16 = this.aShortArray46[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 -= -(arg3 * (arg2 - local61) >> 7);
			}
			this.aShortArray46[local7] = (short) (local61 | local22 << 10 | local28 << 7);
		}
		if (this.aClass183Array1 != null) {
			for (local16 = 0; local16 < this.anInt3930; local16++) {
				@Pc(106) Class183 local106 = this.aClass183Array1[local16];
				@Pc(111) Class254 local111 = this.aClass254Array1[local16];
				local111.anInt7683 = local111.anInt7683 & 0xFF000000 | Static349.anIntArray394[this.aShortArray46[local106.anInt5316] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass66_5 != null) {
			this.aClass66_5.anInterface23_1 = null;
		}
	}
}
