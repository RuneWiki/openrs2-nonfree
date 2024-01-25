import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class182_Sub2 extends Class182 {

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "S")
	private short aShort66;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "[B")
	private byte[] aByteArray70;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "[I")
	private int[] anIntArray397;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
	private int[] anIntArray398;

	@OriginalMember(owner = "client!ml", name = "D", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!ml", name = "E", descriptor = "S")
	private short aShort67;

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "S")
	private short aShort68;

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
	private int anInt5527;

	@OriginalMember(owner = "client!ml", name = "J", descriptor = "[Lclient!iaa;")
	private Class146[] aClass146Array1;

	@OriginalMember(owner = "client!ml", name = "L", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
	private int anInt5530;

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "[Lclient!hr;")
	private Class143[] aClass143Array4;

	@OriginalMember(owner = "client!ml", name = "Q", descriptor = "Lclient!cq;")
	private Class58 aClass58_1;

	@OriginalMember(owner = "client!ml", name = "R", descriptor = "S")
	private short aShort69;

	@OriginalMember(owner = "client!ml", name = "T", descriptor = "[Lclient!oo;")
	private Class255[] aClass255Array4;

	@OriginalMember(owner = "client!ml", name = "U", descriptor = "[I")
	private int[] anIntArray399;

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "S")
	private short aShort70;

	@OriginalMember(owner = "client!ml", name = "Z", descriptor = "I")
	private int anInt5536;

	@OriginalMember(owner = "client!ml", name = "bb", descriptor = "S")
	private short aShort71;

	@OriginalMember(owner = "client!ml", name = "eb", descriptor = "[F")
	private float[] aFloatArray23;

	@OriginalMember(owner = "client!ml", name = "ob", descriptor = "Lclient!vi;")
	private Interface26 anInterface26_3;

	@OriginalMember(owner = "client!ml", name = "pb", descriptor = "Lclient!hu;")
	private Interface12 anInterface12_6;

	@OriginalMember(owner = "client!ml", name = "zb", descriptor = "S")
	private short aShort72;

	@OriginalMember(owner = "client!ml", name = "Bb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!ml", name = "Fb", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!ml", name = "Gb", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!ml", name = "Lb", descriptor = "[F")
	private float[] aFloatArray24;

	@OriginalMember(owner = "client!ml", name = "Qb", descriptor = "[I")
	private int[] anIntArray400;

	@OriginalMember(owner = "client!ml", name = "Tb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!ml", name = "Wb", descriptor = "[[I")
	private int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!ml", name = "Yb", descriptor = "S")
	private short aShort73;

	@OriginalMember(owner = "client!ml", name = "bc", descriptor = "S")
	private short aShort74;

	@OriginalMember(owner = "client!ml", name = "cc", descriptor = "[B")
	private byte[] aByteArray71;

	@OriginalMember(owner = "client!ml", name = "ec", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!ml", name = "ic", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!ml", name = "mc", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!ml", name = "pc", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!ml", name = "sc", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!ml", name = "tc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!ml", name = "wc", descriptor = "[Lclient!jt;")
	private Class178[] aClass178Array1;

	@OriginalMember(owner = "client!ml", name = "zc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!ml", name = "Ac", descriptor = "B")
	private byte aByte86;

	@OriginalMember(owner = "client!ml", name = "ab", descriptor = "I")
	private int anInt5537 = 0;

	@OriginalMember(owner = "client!ml", name = "gb", descriptor = "I")
	private int anInt5541 = 0;

	@OriginalMember(owner = "client!ml", name = "db", descriptor = "I")
	private int anInt5539 = 0;

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "I")
	private int anInt5531 = 0;

	@OriginalMember(owner = "client!ml", name = "Sb", descriptor = "Z")
	private boolean aBoolean405 = true;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Z")
	private boolean aBoolean402 = false;

	@OriginalMember(owner = "client!ml", name = "Ob", descriptor = "Z")
	private boolean aBoolean404 = false;

	@OriginalMember(owner = "client!ml", name = "dc", descriptor = "I")
	private int anInt5570 = 0;

	@OriginalMember(owner = "client!ml", name = "yb", descriptor = "Z")
	private boolean aBoolean403 = false;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_29;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "Lclient!eca;")
	private Class82 aClass82_10;

	@OriginalMember(owner = "client!ml", name = "xb", descriptor = "Lclient!eca;")
	private Class82 aClass82_11;

	@OriginalMember(owner = "client!ml", name = "vc", descriptor = "Lclient!eca;")
	private Class82 aClass82_13;

	@OriginalMember(owner = "client!ml", name = "Cb", descriptor = "Lclient!eca;")
	private Class82 aClass82_12;

	@OriginalMember(owner = "client!ml", name = "n", descriptor = "Lclient!qi;")
	private Class286 aClass286_1;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class182_Sub2(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_29 = arg0;
		this.aClass82_10 = new Class82(null, 5126, 3, 0);
		this.aClass82_11 = new Class82(null, 5126, 2, 0);
		this.aClass82_13 = new Class82(null, 5126, 3, 0);
		this.aClass82_12 = new Class82(null, 5121, 4, 0);
		this.aClass286_1 = new Class286();
	}

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ep;Lclient!kda;IIII)V")
	public Class182_Sub2(@OriginalArg(0) Class95_Sub1 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt5527 = arg5;
		this.anInt5536 = arg2;
		this.aClass95_Sub1_29 = arg0;
		if (Static628.method8428(arg2, arg5)) {
			this.aClass82_10 = new Class82(null, 5126, 3, 0);
		}
		if (Static201.method2851(arg5, arg2)) {
			this.aClass82_11 = new Class82(null, 5126, 2, 0);
		}
		if (Static437.method5993(arg2, arg5)) {
			this.aClass82_13 = new Class82(null, 5126, 3, 0);
		}
		if (Static311.method4221(arg2, arg5)) {
			this.aClass82_12 = new Class82(null, 5121, 4, 0);
		}
		if (Static389.method5231(arg2, arg5)) {
			this.aClass286_1 = new Class286();
		}
		@Pc(108) Interface6 local108 = arg0.anInterface6_27;
		this.anIntArray397 = new int[arg1.anInt4703 + 1];
		@Pc(119) int[] local119 = new int[arg1.anInt4696];
		for (@Pc(121) int local121 = 0; local121 < arg1.anInt4696; local121++) {
			if (arg1.aByteArray54 == null || arg1.aByteArray54[local121] != 2) {
				if (arg1.aShortArray51 != null && arg1.aShortArray51[local121] != -1) {
					@Pc(153) Class175 local153 = local108.method1492(arg1.aShortArray51[local121] & 0xFFFF);
					if (((this.anInt5527 & 0x40) == 0 || !local153.aBoolean308) && local153.aBoolean305) {
						continue;
					}
				}
				local119[this.anInt5537++] = local121;
				this.anIntArray397[arg1.aShortArray53[local121]]++;
				this.anIntArray397[arg1.aShortArray54[local121]]++;
				this.anIntArray397[arg1.aShortArray50[local121]]++;
			}
		}
		this.anInt5570 = this.anInt5537;
		@Pc(226) long[] local226 = new long[this.anInt5537];
		@Pc(235) boolean local235 = (this.anInt5536 & 0x100) != 0;
		@Pc(247) int local247;
		@Pc(260) int local260;
		@Pc(435) int local435;
		for (@Pc(237) int local237 = 0; local237 < this.anInt5537; local237++) {
			@Pc(243) int local243 = local119[local237];
			@Pc(245) Class175 local245 = null;
			local247 = 0;
			@Pc(249) byte local249 = 0;
			@Pc(251) byte local251 = 0;
			@Pc(253) byte local253 = 0;
			if (arg1.aClass245Array1 != null) {
				@Pc(258) boolean local258 = false;
				for (local260 = 0; local260 < arg1.aClass245Array1.length; local260++) {
					@Pc(267) Class245 local267 = arg1.aClass245Array1[local260];
					if (local267.anInt6287 == local243) {
						@Pc(276) Class302 local276 = Static382.method5115(local267.anInt6289);
						if (local276.aBoolean610) {
							local258 = true;
						}
						if (local276.anInt8082 != -1) {
							@Pc(291) Class175 local291 = local108.method1492(local276.anInt8082);
							if (local291.anInt4384 == 2) {
								this.aBoolean403 = true;
							}
						}
					}
				}
				if (local258) {
					local226[local237] = Long.MAX_VALUE;
					this.anInt5570--;
					continue;
				}
			}
			@Pc(326) short local326 = -1;
			if (arg1.aShortArray51 != null) {
				local326 = arg1.aShortArray51[local243];
				if (local326 != -1) {
					local245 = local108.method1492(local326 & 0xFFFF);
					if ((this.anInt5527 & 0x40) != 0 && local245.aBoolean308) {
						local326 = -1;
						local245 = null;
					} else {
						local251 = local245.aByte52;
						local253 = local245.aByte56;
						if (local245.aByte53 != 0 || local245.aByte54 != 0) {
							this.aBoolean402 = true;
						}
					}
				}
			}
			@Pc(397) boolean local397 = arg1.aByteArray56 != null && arg1.aByteArray56[local243] != 0 || local245 != null && local245.anInt4384 != 0;
			if ((local235 || local397) && arg1.aByteArray55 != null) {
				local247 += arg1.aByteArray55[local243] << 17;
			}
			if (local397) {
				local247 += 65536;
			}
			local247 += (local251 & 0xFF) << 8;
			local435 = local249 + ((local326 & 0xFFFF) << 16);
			local247 += local253 & 0xFF;
			@Pc(447) int local447 = local435 + (local237 & 0xFFFF);
			local226[local237] = (long) local447 + ((long) local247 << 32);
			this.aBoolean403 |= local397;
			this.aBoolean402 |= local245 != null && (local245.aByte53 != 0 || local245.aByte54 != 0);
		}
		Static8.method126(local226, local119);
		this.aShortArray81 = arg1.aShortArray52;
		this.anIntArray399 = arg1.anIntArray312;
		this.anIntArray401 = arg1.anIntArray315;
		this.anInt5539 = arg1.anInt4703;
		this.anInt5531 = arg1.anInt4698;
		this.anIntArray398 = arg1.anIntArray317;
		@Pc(523) Class342[] local523 = new Class342[this.anInt5539];
		this.aClass143Array4 = arg1.aClass143Array2;
		this.aClass255Array4 = arg1.aClass255Array2;
		@Pc(551) int local551;
		@Pc(565) int local565;
		@Pc(608) int local608;
		if (arg1.aClass245Array1 != null) {
			this.anInt5530 = arg1.aClass245Array1.length;
			this.aClass146Array1 = new Class146[this.anInt5530];
			this.aClass178Array1 = new Class178[this.anInt5530];
			for (local551 = 0; local551 < this.anInt5530; local551++) {
				@Pc(558) Class245 local558 = arg1.aClass245Array1[local551];
				@Pc(563) Class302 local563 = Static382.method5115(local558.anInt6289);
				local565 = -1;
				for (@Pc(567) int local567 = 0; local567 < this.anInt5537; local567++) {
					if (local119[local567] == local558.anInt6287) {
						local565 = local567;
						break;
					}
				}
				if (local565 == -1) {
					throw new RuntimeException();
				}
				local608 = Static343.anIntArray359[arg1.aShortArray55[local558.anInt6287] & 0xFFFF] & 0xFFFFFF;
				@Pc(626) int local626 = local608 | 255 - (arg1.aByteArray56 == null ? 0 : arg1.aByteArray56[local558.anInt6287]) << 24;
				this.aClass146Array1[local551] = new Class146(local565, arg1.aShortArray53[local558.anInt6287], arg1.aShortArray54[local558.anInt6287], arg1.aShortArray50[local558.anInt6287], local563.anInt8086, local563.anInt8091, local563.anInt8082, local563.anInt8085, local563.anInt8084, local563.aBoolean610, local563.aBoolean609, local558.anInt6290);
				this.aClass178Array1[local551] = new Class178(local626);
			}
		}
		local551 = this.anInt5537 * 3;
		this.aShort66 = (short) arg4;
		this.aShortArray79 = new short[this.anInt5537];
		this.aShortArray76 = new short[this.anInt5537];
		this.aFloatArray23 = new float[local551];
		this.aByteArray70 = new byte[local551];
		this.aShortArray87 = new short[this.anInt5537];
		this.aShort72 = (short) arg3;
		if (arg1.aShortArray56 != null) {
			this.aShortArray85 = new short[this.anInt5537];
		}
		this.aShortArray78 = new short[local551];
		Static107.aLongArray9 = new long[local551];
		this.aShortArray84 = new short[this.anInt5537];
		this.aShortArray77 = new short[local551];
		this.aFloatArray24 = new float[local551];
		this.aShortArray82 = new short[this.anInt5537];
		this.aShortArray86 = new short[local551];
		this.aByteArray71 = new byte[this.anInt5537];
		this.aShortArray83 = new short[local551];
		local247 = 0;
		for (local435 = 0; local435 < arg1.anInt4703; local435++) {
			local565 = this.anIntArray397[local435];
			this.anIntArray397[local435] = local247;
			local247 += local565;
			local523[local435] = new Class342();
		}
		this.anIntArray397[arg1.anInt4703] = local247;
		@Pc(812) Class152 local812 = Static554.method7607(local119, this.anInt5537, arg1);
		@Pc(816) Class68[] local816 = new Class68[arg1.anInt4696];
		@Pc(857) int local857;
		@Pc(868) int local868;
		@Pc(888) int local888;
		@Pc(899) int local899;
		@Pc(908) int local908;
		@Pc(917) int local917;
		@Pc(835) short local835;
		@Pc(846) int local846;
		for (local608 = 0; local608 < arg1.anInt4696; local608++) {
			@Pc(825) short local825 = arg1.aShortArray53[local608];
			@Pc(830) short local830 = arg1.aShortArray54[local608];
			local835 = arg1.aShortArray50[local608];
			local846 = this.anIntArray399[local830] - this.anIntArray399[local825];
			local857 = this.anIntArray398[local830] - this.anIntArray398[local825];
			local868 = this.anIntArray401[local830] - this.anIntArray401[local825];
			@Pc(878) int local878 = this.anIntArray399[local835] - this.anIntArray399[local825];
			local888 = this.anIntArray398[local835] - this.anIntArray398[local825];
			local899 = this.anIntArray401[local835] - this.anIntArray401[local825];
			local908 = local857 * local899 - local868 * local888;
			local917 = local878 * local868 - local899 * local846;
			@Pc(926) int local926;
			for (local926 = local846 * local888 - local857 * local878; local908 > 8192 || local917 > 8192 || local926 > 8192 || local908 < -8192 || local917 < -8192 || local926 < -8192; local926 >>= 0x1) {
				local917 >>= 0x1;
				local908 >>= 0x1;
			}
			@Pc(978) int local978 = (int) Math.sqrt((double) (local917 * local917 + local908 * local908 + local926 * local926));
			if (local978 <= 0) {
				local978 = 1;
			}
			local917 = local917 * 256 / local978;
			local908 = local908 * 256 / local978;
			local926 = local926 * 256 / local978;
			@Pc(1010) byte local1010 = arg1.aByteArray54 == null ? 0 : arg1.aByteArray54[local608];
			if (local1010 == 0) {
				@Pc(1038) Class342 local1038 = local523[local825];
				local1038.anInt9095 += local926;
				local1038.anInt9092++;
				local1038.anInt9097 += local917;
				local1038.anInt9093 += local908;
				@Pc(1066) Class342 local1066 = local523[local830];
				local1066.anInt9097 += local917;
				local1066.anInt9093 += local908;
				local1066.anInt9092++;
				local1066.anInt9095 += local926;
				@Pc(1094) Class342 local1094 = local523[local835];
				local1094.anInt9092++;
				local1094.anInt9093 += local908;
				local1094.anInt9097 += local917;
				local1094.anInt9095 += local926;
			} else if (local1010 == 1) {
				@Pc(1023) Class68 local1023 = local816[local608] = new Class68();
				local1023.anInt1712 = local917;
				local1023.anInt1714 = local908;
				local1023.anInt1713 = local926;
			}
		}
		@Pc(1131) int local1131;
		@Pc(1174) short local1174;
		for (local260 = 0; local260 < this.anInt5537; local260++) {
			local1131 = local119[local260];
			@Pc(1138) int local1138 = arg1.aShortArray55[local1131] & 0xFFFF;
			if (arg1.aByteArray59 == null) {
				local846 = -1;
			} else {
				local846 = arg1.aByteArray59[local1131];
			}
			if (arg1.aByteArray56 == null) {
				local857 = 0;
			} else {
				local857 = arg1.aByteArray56[local1131] & 0xFF;
			}
			local1174 = arg1.aShortArray51 == null ? -1 : arg1.aShortArray51[local1131];
			if (local1174 != -1 && (this.anInt5527 & 0x40) != 0) {
				@Pc(1192) Class175 local1192 = local108.method1492(local1174 & 0xFFFF);
				if (local1192.aBoolean308) {
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
			@Pc(1249) byte local1249;
			@Pc(1266) short local1266;
			@Pc(1271) short local1271;
			@Pc(1276) short local1276;
			if (local1174 != -1) {
				if (local846 == -1) {
					local1207 = 0.0F;
					local1205 = 1.0F;
					local1201 = 1.0F;
					local1213 = 2;
					local1211 = 1;
					local1209 = 0.0F;
					local1203 = 1.0F;
					local1199 = 0.0F;
				} else {
					local846 &= 0xFF;
					local1249 = arg1.aByteArray57[local846];
					@Pc(1256) short local1256;
					@Pc(1261) short local1261;
					@Pc(1299) float local1299;
					@Pc(1308) float local1308;
					@Pc(1316) float local1316;
					@Pc(1402) float local1402;
					@Pc(1410) float local1410;
					@Pc(1419) float local1419;
					@Pc(1427) float local1427;
					@Pc(1436) float local1436;
					@Pc(1445) float local1445;
					if (local1249 == 0) {
						local1256 = arg1.aShortArray53[local1131];
						local1261 = arg1.aShortArray54[local1131];
						local1266 = arg1.aShortArray50[local1131];
						local1271 = arg1.aShortArray49[local846];
						local1276 = arg1.aShortArray58[local846];
						@Pc(1281) short local1281 = arg1.aShortArray57[local846];
						@Pc(1287) float local1287 = (float) arg1.anIntArray312[local1271];
						@Pc(1293) float local1293 = (float) arg1.anIntArray317[local1271];
						local1299 = arg1.anIntArray315[local1271];
						local1308 = (float) arg1.anIntArray312[local1276] - local1287;
						local1316 = (float) arg1.anIntArray317[local1276] - local1293;
						@Pc(1324) float local1324 = (float) arg1.anIntArray315[local1276] - local1299;
						@Pc(1332) float local1332 = (float) arg1.anIntArray312[local1281] - local1287;
						@Pc(1341) float local1341 = (float) arg1.anIntArray317[local1281] - local1293;
						@Pc(1350) float local1350 = (float) arg1.anIntArray315[local1281] - local1299;
						@Pc(1359) float local1359 = (float) arg1.anIntArray312[local1256] - local1287;
						@Pc(1367) float local1367 = (float) arg1.anIntArray317[local1256] - local1293;
						@Pc(1376) float local1376 = (float) arg1.anIntArray315[local1256] - local1299;
						@Pc(1385) float local1385 = (float) arg1.anIntArray312[local1261] - local1287;
						@Pc(1393) float local1393 = (float) arg1.anIntArray317[local1261] - local1293;
						local1402 = (float) arg1.anIntArray315[local1261] - local1299;
						local1410 = (float) arg1.anIntArray312[local1266] - local1287;
						local1419 = (float) arg1.anIntArray317[local1266] - local1293;
						local1427 = (float) arg1.anIntArray315[local1266] - local1299;
						local1436 = local1350 * local1316 - local1341 * local1324;
						local1445 = local1324 * local1332 - local1350 * local1308;
						@Pc(1453) float local1453 = local1308 * local1341 - local1316 * local1332;
						@Pc(1462) float local1462 = local1453 * local1341 - local1445 * local1350;
						@Pc(1471) float local1471 = local1436 * local1350 - local1453 * local1332;
						@Pc(1480) float local1480 = local1445 * local1332 - local1341 * local1436;
						@Pc(1494) float local1494 = 1.0F / (local1324 * local1480 + local1471 * local1316 + local1462 * local1308);
						local1203 = (local1402 * local1480 + local1462 * local1385 + local1393 * local1471) * local1494;
						local1199 = local1494 * (local1480 * local1376 + local1462 * local1359 + local1471 * local1367);
						local1207 = (local1462 * local1410 + local1419 * local1471 + local1480 * local1427) * local1494;
						@Pc(1545) float local1545 = local1436 * local1324 - local1308 * local1453;
						@Pc(1554) float local1554 = local1308 * local1445 - local1436 * local1316;
						@Pc(1562) float local1562 = local1453 * local1316 - local1445 * local1324;
						@Pc(1576) float local1576 = 1.0F / (local1350 * local1554 + local1341 * local1545 + local1562 * local1332);
						local1201 = local1576 * (local1359 * local1562 + local1367 * local1545 + local1554 * local1376);
						local1209 = local1576 * (local1419 * local1545 + local1562 * local1410 + local1554 * local1427);
						local1205 = (local1402 * local1554 + local1545 * local1393 + local1562 * local1385) * local1576;
					} else {
						local1256 = arg1.aShortArray53[local1131];
						local1261 = arg1.aShortArray54[local1131];
						local1266 = arg1.aShortArray50[local1131];
						@Pc(1640) int local1640 = local812.anIntArray268[local846];
						@Pc(1645) int local1645 = local812.anIntArray266[local846];
						@Pc(1650) int local1650 = local812.anIntArray265[local846];
						@Pc(1655) float[] local1655 = local812.aFloatArrayArray12[local846];
						@Pc(1660) byte local1660 = arg1.aByteArray53[local846];
						local1299 = (float) arg1.anIntArray316[local846] / 256.0F;
						if (local1249 == 1) {
							local1308 = (float) arg1.anIntArray309[local846] / 1024.0F;
							Static277.method3848(arg1.anIntArray317[local1256], local1640, arg1.anIntArray312[local1256], arg1.anIntArray315[local1256], local1660, local1645, local1299, local1308, local1655, Static298.aFloatArray22, local1650);
							local1201 = Static298.aFloatArray22[1];
							local1199 = Static298.aFloatArray22[0];
							Static277.method3848(arg1.anIntArray317[local1261], local1640, arg1.anIntArray312[local1261], arg1.anIntArray315[local1261], local1660, local1645, local1299, local1308, local1655, Static298.aFloatArray22, local1650);
							local1203 = Static298.aFloatArray22[0];
							local1205 = Static298.aFloatArray22[1];
							Static277.method3848(arg1.anIntArray317[local1266], local1640, arg1.anIntArray312[local1266], arg1.anIntArray315[local1266], local1660, local1645, local1299, local1308, local1655, Static298.aFloatArray22, local1650);
							local1209 = Static298.aFloatArray22[1];
							local1207 = Static298.aFloatArray22[0];
							local1316 = local1308 / 2.0F;
							if ((local1660 & 0x1) == 0) {
								if (local1316 < local1203 - local1199) {
									local1211 = 1;
									local1203 -= local1308;
								} else if (local1199 - local1203 > local1316) {
									local1203 += local1308;
									local1211 = 2;
								}
								if (local1316 < local1207 - local1199) {
									local1207 -= local1308;
									local1213 = 1;
								} else if (local1316 < local1199 - local1207) {
									local1213 = 2;
									local1207 += local1308;
								}
							} else {
								if (local1316 < local1209 - local1201) {
									local1213 = 1;
									local1209 -= local1308;
								} else if (local1201 - local1209 > local1316) {
									local1213 = 2;
									local1209 += local1308;
								}
								if (local1316 < local1205 - local1201) {
									local1211 = 1;
									local1205 -= local1308;
								} else if (local1201 - local1205 > local1316) {
									local1211 = 2;
									local1205 += local1308;
								}
							}
						} else if (local1249 == 2) {
							local1308 = (float) arg1.anIntArray311[local846] / 256.0F;
							local1316 = (float) arg1.anIntArray314[local846] / 256.0F;
							@Pc(2133) int local2133 = arg1.anIntArray312[local1261] - arg1.anIntArray312[local1256];
							@Pc(2144) int local2144 = arg1.anIntArray317[local1261] - arg1.anIntArray317[local1256];
							@Pc(2155) int local2155 = arg1.anIntArray315[local1261] - arg1.anIntArray315[local1256];
							@Pc(2166) int local2166 = arg1.anIntArray312[local1266] - arg1.anIntArray312[local1256];
							@Pc(2177) int local2177 = arg1.anIntArray317[local1266] - arg1.anIntArray317[local1256];
							@Pc(2187) int local2187 = arg1.anIntArray315[local1266] - arg1.anIntArray315[local1256];
							@Pc(2196) int local2196 = local2144 * local2187 - local2177 * local2155;
							@Pc(2204) int local2204 = local2155 * local2166 - local2187 * local2133;
							@Pc(2213) int local2213 = local2133 * local2177 - local2144 * local2166;
							local1402 = 64.0F / (float) arg1.anIntArray310[local846];
							local1410 = 64.0F / (float) arg1.anIntArray318[local846];
							local1419 = 64.0F / (float) arg1.anIntArray309[local846];
							local1427 = (local1655[0] * (float) local2196 + (float) local2204 * local1655[1] + (float) local2213 * local1655[2]) / local1402;
							local1436 = (local1655[5] * (float) local2213 + local1655[4] * (float) local2204 + (float) local2196 * local1655[3]) / local1410;
							local1445 = ((float) local2213 * local1655[8] + (float) local2196 * local1655[6] + (float) local2204 * local1655[7]) / local1419;
							local1215 = Static558.method7645(local1445, local1427, local1436);
							Static557.method7637(local1215, local1299, local1645, Static298.aFloatArray22, local1640, local1655, local1316, arg1.anIntArray315[local1256], local1650, local1660, arg1.anIntArray317[local1256], arg1.anIntArray312[local1256], local1308);
							local1201 = Static298.aFloatArray22[1];
							local1199 = Static298.aFloatArray22[0];
							Static557.method7637(local1215, local1299, local1645, Static298.aFloatArray22, local1640, local1655, local1316, arg1.anIntArray315[local1261], local1650, local1660, arg1.anIntArray317[local1261], arg1.anIntArray312[local1261], local1308);
							local1203 = Static298.aFloatArray22[0];
							local1205 = Static298.aFloatArray22[1];
							Static557.method7637(local1215, local1299, local1645, Static298.aFloatArray22, local1640, local1655, local1316, arg1.anIntArray315[local1266], local1650, local1660, arg1.anIntArray317[local1266], arg1.anIntArray312[local1266], local1308);
							local1207 = Static298.aFloatArray22[0];
							local1209 = Static298.aFloatArray22[1];
						} else if (local1249 == 3) {
							Static94.method1469(Static298.aFloatArray22, arg1.anIntArray312[local1256], local1640, local1645, local1655, local1299, arg1.anIntArray315[local1256], local1650, arg1.anIntArray317[local1256], local1660);
							local1201 = Static298.aFloatArray22[1];
							local1199 = Static298.aFloatArray22[0];
							Static94.method1469(Static298.aFloatArray22, arg1.anIntArray312[local1261], local1640, local1645, local1655, local1299, arg1.anIntArray315[local1261], local1650, arg1.anIntArray317[local1261], local1660);
							local1205 = Static298.aFloatArray22[1];
							local1203 = Static298.aFloatArray22[0];
							Static94.method1469(Static298.aFloatArray22, arg1.anIntArray312[local1266], local1640, local1645, local1655, local1299, arg1.anIntArray315[local1266], local1650, arg1.anIntArray317[local1266], local1660);
							local1209 = Static298.aFloatArray22[1];
							local1207 = Static298.aFloatArray22[0];
							if ((local1660 & 0x1) == 0) {
								if (local1203 - local1199 > 0.5F) {
									local1211 = 1;
									local1203--;
								} else if (local1199 - local1203 > 0.5F) {
									local1203++;
									local1211 = 2;
								}
								if (local1207 - local1199 > 0.5F) {
									local1207--;
									local1213 = 1;
								} else if (local1199 - local1207 > 0.5F) {
									local1207++;
									local1213 = 2;
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
									local1211 = 1;
									local1205--;
								} else if (local1201 - local1205 > 0.5F) {
									local1205++;
									local1211 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray54 == null) {
				local1249 = 0;
			} else {
				local1249 = arg1.aByteArray54[local1131];
			}
			if (local1249 == 0) {
				@Pc(2444) long local2444 = (long) (local846 << 2) + ((long) local857 + (long) (local1215 << 24) + (long) (local1138 << 8) << 32);
				local1266 = arg1.aShortArray53[local1131];
				local1271 = arg1.aShortArray54[local1131];
				local1276 = arg1.aShortArray50[local1131];
				@Pc(2463) Class342 local2463 = local523[local1266];
				this.aShortArray84[local260] = this.method4753(local2463.anInt9093, local2444, local2463.anInt9092, local1266, arg1, local1201, local2463.anInt9097, local2463.anInt9095, local1199);
				@Pc(2487) Class342 local2487 = local523[local1271];
				this.aShortArray79[local260] = this.method4753(local2487.anInt9093, (long) local1211 + local2444, local2487.anInt9092, local1271, arg1, local1205, local2487.anInt9097, local2487.anInt9095, local1203);
				@Pc(2514) Class342 local2514 = local523[local1276];
				this.aShortArray76[local260] = this.method4753(local2514.anInt9093, local2444 + (long) local1213, local2514.anInt9092, local1276, arg1, local1209, local2514.anInt9097, local2514.anInt9095, local1207);
			} else if (local1249 == 1) {
				@Pc(2548) Class68 local2548 = local816[local1131];
				@Pc(2592) long local2592 = (long) ((local2548.anInt1713 + 256 << 22) + (local2548.anInt1712 + 256 << 12) + (local846 << 2) + (local2548.anInt1714 <= 0 ? 2048 : 1024)) + ((long) (local1215 << 24) + (long) (local1138 << 8) + (long) local857 << 32);
				this.aShortArray84[local260] = this.method4753(local2548.anInt1714, local2592, 0, arg1.aShortArray53[local1131], arg1, local1201, local2548.anInt1712, local2548.anInt1713, local1199);
				this.aShortArray79[local260] = this.method4753(local2548.anInt1714, local2592 + (long) local1211, 0, arg1.aShortArray54[local1131], arg1, local1205, local2548.anInt1712, local2548.anInt1713, local1203);
				this.aShortArray76[local260] = this.method4753(local2548.anInt1714, (long) local1213 + local2592, 0, arg1.aShortArray50[local1131], arg1, local1209, local2548.anInt1712, local2548.anInt1713, local1207);
			}
			if (arg1.aByteArray56 != null) {
				this.aByteArray71[local260] = arg1.aByteArray56[local1131];
			}
			if (arg1.aShortArray56 != null) {
				this.aShortArray85[local260] = arg1.aShortArray56[local1131];
			}
			this.aShortArray82[local260] = arg1.aShortArray55[local1131];
			this.aShortArray87[local260] = local1174;
		}
		local1131 = 0;
		local835 = -10000;
		for (local846 = 0; local846 < this.anInt5570; local846++) {
			@Pc(2721) short local2721 = this.aShortArray87[local846];
			if (local835 != local2721) {
				local1131++;
				local835 = local2721;
			}
		}
		this.anIntArray400 = new int[local1131 + 1];
		local835 = -10000;
		local1131 = 0;
		for (local857 = 0; local857 < this.anInt5570; local857++) {
			local1174 = this.aShortArray87[local857];
			if (local1174 != local835) {
				this.anIntArray400[local1131++] = local857;
				local835 = local1174;
			}
		}
		this.anIntArray400[local1131] = this.anInt5570;
		Static107.aLongArray9 = null;
		this.aShortArray83 = Static611.method8226(this.aShortArray83, this.anInt5541);
		this.aShortArray78 = Static611.method8226(this.aShortArray78, this.anInt5541);
		this.aShortArray77 = Static611.method8226(this.aShortArray77, this.anInt5541);
		this.aByteArray70 = Static89.method6487(this.aByteArray70, this.anInt5541);
		this.aFloatArray24 = Static12.method174(this.anInt5541, this.aFloatArray24);
		this.aFloatArray23 = Static12.method174(this.anInt5541, this.aFloatArray23);
		if (arg1.anIntArray308 != null && Static362.method4883(this.anInt5527, arg2)) {
			this.anIntArrayArray35 = arg1.method4004(false);
		}
		if (arg1.aClass245Array1 != null && Static23.method425(this.anInt5527, arg2)) {
			this.anIntArrayArray33 = arg1.method3991();
		}
		if (arg1.anIntArray313 != null && Static575.method7861(this.anInt5527, arg2)) {
			local868 = 0;
			@Pc(2882) int[] local2882 = new int[256];
			for (local888 = 0; local888 < this.anInt5537; local888++) {
				local899 = arg1.anIntArray313[local119[local888]];
				if (local899 >= 0) {
					if (local868 < local899) {
						local868 = local899;
					}
					@Pc(2904) int local2904 = local2882[local899]++;
				}
			}
			this.anIntArrayArray34 = new int[local868 + 1][];
			for (local899 = 0; local899 <= local868; local899++) {
				this.anIntArrayArray34[local899] = new int[local2882[local899]];
				local2882[local899] = 0;
			}
			for (local908 = 0; local908 < this.anInt5537; local908++) {
				local917 = arg1.anIntArray313[local119[local908]];
				if (local917 >= 0) {
					this.anIntArrayArray34[local917][local2882[local917]++] = local908;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "()V")
	@Override
	public void method6212() {
		if (this.anInt5541 <= 0 || this.anInt5570 <= 0) {
			return;
		}
		this.method4757(false);
		if ((this.aByte86 & 0x10) == 0 && this.aClass286_1.anInterface26_4 == null) {
			this.method4752(false);
		}
		this.method4754();
	}

	@OriginalMember(owner = "client!ml", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort69;
	}

	@OriginalMember(owner = "client!ml", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort70;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIIIIIIB)Z")
	private boolean method4747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg2 > arg6 && arg5 > arg6 && arg3 > arg6) {
			return false;
		} else if (arg2 < arg6 && arg5 < arg6 && arg6 > arg3) {
			return false;
		} else if (arg0 > arg4 && arg1 > arg4 && arg4 < arg7) {
			return false;
		} else {
			return arg4 <= arg0 || arg4 <= arg1 || arg4 <= arg7;
		}
	}

	@OriginalMember(owner = "client!ml", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5531; local3++) {
			this.anIntArray399[local3] = this.anIntArray399[local3] + 7 >> 4;
			this.anIntArray398[local3] = this.anIntArray398[local3] + 7 >> 4;
			this.anIntArray401[local3] = this.anIntArray401[local3] + 7 >> 4;
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5539; local3++) {
			if (arg0 != 0) {
				this.anIntArray399[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray398[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray401[local3] += arg2;
			}
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!ml", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		this.anInt5536 = arg0;
		if (this.aClass58_1 != null && (this.anInt5536 & 0x10000) == 0) {
			this.aShortArray78 = this.aClass58_1.aShortArray22;
			this.aShortArray77 = this.aClass58_1.aShortArray24;
			this.aShortArray83 = this.aClass58_1.aShortArray23;
			this.aByteArray70 = this.aClass58_1.aByteArray15;
			this.aClass58_1 = null;
		}
		this.aBoolean405 = true;
		this.method4754();
	}

	@OriginalMember(owner = "client!ml", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort72;
	}

	@OriginalMember(owner = "client!ml", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort74;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	private void method4748() {
		if (this.aClass146Array1 == null) {
			return;
		}
		@Pc(18) Class177_Sub3 local18 = this.aClass95_Sub1_29.aClass177_Sub3_2;
		this.aClass95_Sub1_29.method2069();
		this.aClass95_Sub1_29.C(!this.aBoolean403);
		this.aClass95_Sub1_29.method2099(false);
		this.aClass95_Sub1_29.method2086(null, this.aClass95_Sub1_29.aClass82_5, this.aClass95_Sub1_29.aClass82_6, null);
		for (@Pc(52) int local52 = 0; local52 < this.anInt5530; local52++) {
			@Pc(59) Class146 local59 = this.aClass146Array1[local52];
			@Pc(64) Class178 local64 = this.aClass178Array1[local52];
			if (!local59.aBoolean261 || !this.aClass95_Sub1_29.method6951()) {
				@Pc(93) float local93 = (float) (this.anIntArray399[local59.anInt3668] + this.anIntArray399[local59.anInt3669] + this.anIntArray399[local59.anInt3673]) * 0.3333333F;
				@Pc(114) float local114 = (float) (this.anIntArray398[local59.anInt3668] + this.anIntArray398[local59.anInt3673] + this.anIntArray398[local59.anInt3669]) * 0.3333333F;
				@Pc(136) float local136 = (float) (this.anIntArray401[local59.anInt3673] + this.anIntArray401[local59.anInt3669] + this.anIntArray401[local59.anInt3668]) * 0.3333333F;
				@Pc(150) float local150 = Static457.aFloat147 + Static307.aFloat90 * local136 + local93 * Static378.aFloat215 + Static298.aFloat89 * local114;
				@Pc(164) float local164 = Static32.aFloat9 * local114 + Static318.aFloat92 * local93 + local136 * Static179.aFloat53 + Static128.aFloat22;
				@Pc(178) float local178 = Static415.aFloat120 + Static320.aFloat93 * local136 + Static267.aFloat72 * local114 + Static579.aFloat171 * local93;
				@Pc(199) float local199 = (float) (1.0D / Math.sqrt((double) (local150 * local150 + local164 * local164 + local178 * local178))) * (float) local59.anInt3672;
				local18.method7885(local199 * local178 - local178, local199 * local164 + -local164 + (float) local64.anInt4435, local64.anInt4439, local150 + (float) local64.anInt4440 - local199 * local150, local64.anInt4438 * local59.aShort41 >> 7, local64.anInt4441 * local59.aShort40 >> 7);
				this.aClass95_Sub1_29.method2113(local18);
				@Pc(252) int local252 = local64.anInt4434;
				OpenGL.glColor4ub((byte) (local252 >> 16), (byte) (local252 >> 8), (byte) local252, (byte) (local252 >> 24));
				this.aClass95_Sub1_29.method2053(local59.aShort39);
				this.aClass95_Sub1_29.method2062(local59.aByte41);
				this.aClass95_Sub1_29.method2038(4);
			}
		}
		this.aClass95_Sub1_29.C(true);
		this.aClass95_Sub1_29.method2115();
	}

	@OriginalMember(owner = "client!ml", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray35 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5531; local12++) {
			this.anIntArray399[local12] <<= 0x4;
			this.anIntArray398[local12] <<= 0x4;
			this.anIntArray401[local12] <<= 0x4;
		}
		Static199.anInt3394 = 0;
		Static480.anInt10369 = 0;
		Static520.anInt8619 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "()V")
	@Override
	protected void method6210() {
	}

	@OriginalMember(owner = "client!ml", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub2_Sub19 ba(@OriginalArg(0) Class2_Sub2_Sub19 arg0) {
		if (this.anInt5541 == 0) {
			return null;
		}
		if (!this.aBoolean404) {
			this.method4756();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass95_Sub1_29.anInt2558 <= 0) {
			local43 = this.aShort70 - (this.aShort74 * this.aClass95_Sub1_29.anInt2558 >> 8) >> this.aClass95_Sub1_29.anInt2515;
			local59 = this.aShort67 - (this.aShort73 * this.aClass95_Sub1_29.anInt2558 >> 8) >> this.aClass95_Sub1_29.anInt2515;
		} else {
			local43 = this.aShort70 - (this.aClass95_Sub1_29.anInt2558 * this.aShort73 >> 8) >> this.aClass95_Sub1_29.anInt2515;
			local59 = this.aShort67 - (this.aShort74 * this.aClass95_Sub1_29.anInt2558 >> 8) >> this.aClass95_Sub1_29.anInt2515;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass95_Sub1_29.anInt2548 <= 0) {
			local115 = this.aShort68 - (this.aShort74 * this.aClass95_Sub1_29.anInt2548 >> 8) >> this.aClass95_Sub1_29.anInt2515;
			local132 = this.aShort71 - (this.aShort73 * this.aClass95_Sub1_29.anInt2548 >> 8) >> this.aClass95_Sub1_29.anInt2515;
		} else {
			local115 = this.aShort68 - (this.aShort73 * this.aClass95_Sub1_29.anInt2548 >> 8) >> this.aClass95_Sub1_29.anInt2515;
			local132 = this.aShort71 - (this.aShort74 * this.aClass95_Sub1_29.anInt2548 >> 8) >> this.aClass95_Sub1_29.anInt2515;
		}
		@Pc(173) int local173 = local59 + 1 - local43;
		@Pc(180) int local180 = local132 + 1 - local115;
		@Pc(183) Class2_Sub2_Sub19_Sub1 local183 = (Class2_Sub2_Sub19_Sub1) arg0;
		@Pc(193) Class2_Sub2_Sub19_Sub1 local193;
		if (local183 != null && local183.method5596(local173, local180)) {
			local193 = local183;
			local183.method5595();
		} else {
			local193 = new Class2_Sub2_Sub19_Sub1(this.aClass95_Sub1_29, local173, local180);
		}
		local193.method5597(local59, local115, local43, local132);
		this.method4750(local193);
		return local193;
	}

	@OriginalMember(owner = "client!ml", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort73;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!ov;)V")
	private void method4750(@OriginalArg(1) Class2_Sub2_Sub19_Sub1 arg0) {
		if (this.anInt5541 > this.aClass95_Sub1_29.anIntArray168.length) {
			this.aClass95_Sub1_29.anIntArray168 = new int[this.anInt5541];
			this.aClass95_Sub1_29.anIntArray167 = new int[this.anInt5541];
		}
		@Pc(32) int[] local32 = this.aClass95_Sub1_29.anIntArray168;
		@Pc(36) int[] local36 = this.aClass95_Sub1_29.anIntArray167;
		@Pc(65) int local65;
		@Pc(103) int local103;
		@Pc(112) int local112;
		for (@Pc(38) int local38 = 0; local38 < this.anInt5539; local38++) {
			local65 = (this.anIntArray399[local38] - (this.anIntArray398[local38] * this.aClass95_Sub1_29.anInt2558 >> 8) >> this.aClass95_Sub1_29.anInt2515) - arg0.anInt6550;
			@Pc(89) int local89 = (this.anIntArray401[local38] - (this.anIntArray398[local38] * this.aClass95_Sub1_29.anInt2548 >> 8) >> this.aClass95_Sub1_29.anInt2515) - arg0.anInt6551;
			@Pc(94) int local94 = this.anIntArray397[local38];
			@Pc(101) int local101 = this.anIntArray397[local38 + 1];
			for (local103 = local94; local103 < local101; local103++) {
				local112 = this.aShortArray86[local103] - 1;
				if (local112 == -1) {
					break;
				}
				local32[local112] = local65;
				local36[local112] = local89;
			}
		}
		for (local65 = 0; local65 < this.anInt5570; local65++) {
			if (this.aByteArray71 == null || this.aByteArray71[local65] <= 128) {
				@Pc(155) short local155 = this.aShortArray84[local65];
				@Pc(160) short local160 = this.aShortArray79[local65];
				@Pc(165) short local165 = this.aShortArray76[local65];
				local103 = local32[local155];
				local112 = local32[local160];
				@Pc(177) int local177 = local32[local165];
				@Pc(181) int local181 = local36[local155];
				@Pc(185) int local185 = local36[local160];
				@Pc(189) int local189 = local36[local165];
				if ((local103 - local112) * (local185 - local189) - (local185 - local181) * (local177 - local112) > 0) {
					arg0.method5594(local177, local189, local185, local181, local112, local103);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort68;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!uha;IZ)V")
	@Override
	public void method6204(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray81 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5539; local14++) {
			if ((arg1 & this.aShortArray81[local14]) != 0) {
				if (arg2) {
					arg0.method7882(this.anIntArray399[local14], this.anIntArray398[local14], this.anIntArray401[local14], local12);
				} else {
					arg0.method7866(this.anIntArray399[local14], this.anIntArray398[local14], this.anIntArray401[local14], local12);
				}
				this.anIntArray399[local14] = local12[0];
				this.anIntArray398[local14] = local12[1];
				this.anIntArray401[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean403;
	}

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5539; local15++) {
			local33 = local9 * this.anIntArray401[local15] + this.anIntArray399[local15] * local13 >> 14;
			this.anIntArray401[local15] = local13 * this.anIntArray401[local15] - this.anIntArray399[local15] * local9 >> 14;
			this.anIntArray399[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5541; local33++) {
			@Pc(87) int local87 = this.aShortArray83[local33] * local13 + local9 * this.aShortArray77[local33] >> 14;
			this.aShortArray77[local33] = (short) (this.aShortArray77[local33] * local13 - local9 * this.aShortArray83[local33] >> 14);
			this.aShortArray83[local33] = (short) local87;
		}
		if (this.aClass82_13 == null && this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
		}
		if (this.aClass82_13 != null) {
			this.aClass82_13.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort75;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5539; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray399[local15] + local9 * this.anIntArray401[local15] >> 14;
			this.anIntArray401[local15] = this.anIntArray401[local15] * local13 - local9 * this.anIntArray399[local15] >> 14;
			this.anIntArray399[local15] = local33;
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!ml", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5537; local3++) {
			if (arg0 == this.aShortArray82[local3]) {
				this.aShortArray82[local3] = arg1;
			}
		}
		if (this.aClass146Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5530; local34++) {
				@Pc(41) Class146 local41 = this.aClass146Array1[local34];
				@Pc(46) Class178 local46 = this.aClass178Array1[local34];
				local46.anInt4434 = local46.anInt4434 & 0xFF000000 | Static343.anIntArray359[this.aShortArray82[local41.anInt3671] & 0xFFFF] & 0xFFFFFF;
			}
		}
		if (this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5536;
	}

	@OriginalMember(owner = "client!ml", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort71;
	}

	@OriginalMember(owner = "client!ml", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(48) int[] local48;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static199.anInt3394 = 0;
			Static520.anInt8619 = 0;
			Static480.anInt10369 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray35.length) {
					local48 = this.anIntArrayArray35[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local56]) != 0) {
							Static199.anInt3394 += this.anIntArray399[local56];
							Static520.anInt8619 += this.anIntArray398[local56];
							Static480.anInt10369 += this.anIntArray401[local56];
							local30++;
						}
					}
				}
			}
			if (local30 > 0) {
				Static480.anInt10369 = Static480.anInt10369 / local30 + arg4;
				Static199.anInt3394 = arg2 + Static199.anInt3394 / local30;
				Static520.anInt8619 = Static520.anInt8619 / local30 + arg3;
				Static139.aBoolean199 = true;
			} else {
				Static520.anInt8619 = arg3;
				Static480.anInt10369 = arg4;
				Static199.anInt3394 = arg2;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg3 * arg7[1] + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg2 * arg7[6] + arg7[7] * arg3 + 8192 >> 14;
				arg2 = local30;
				arg3 = local32;
				arg4 = local38;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray35.length > local32) {
					local247 = this.anIntArrayArray35[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray81 == null || (this.aShortArray81[local50] & arg6) != 0) {
							this.anIntArray399[local50] += arg2;
							this.anIntArray398[local50] += arg3;
							this.anIntArray401[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(386) int local386;
		@Pc(404) int local404;
		@Pc(629) int local629;
		@Pc(638) int local638;
		@Pc(647) int local647;
		@Pc(651) int local651;
		@Pc(670) int local670;
		@Pc(1013) int local1013;
		@Pc(1021) int local1021;
		@Pc(1176) int local1176;
		@Pc(1202) int local1202;
		@Pc(1206) int local1206;
		@Pc(1214) int local1214;
		@Pc(1219) int local1219;
		@Pc(1223) int local1223;
		@Pc(1227) int local1227;
		@Pc(1229) int local1229;
		@Pc(1359) int[] local1359;
		@Pc(1361) int local1361;
		@Pc(1365) int local1365;
		@Pc(1369) int local1369;
		@Pc(1371) int local1371;
		@Pc(1502) int local1502;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray35.length) {
						local247 = this.anIntArrayArray35[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray81 == null || (arg6 & this.aShortArray81[local50]) != 0) {
								this.anIntArray399[local50] -= Static199.anInt3394;
								this.anIntArray398[local50] -= Static520.anInt8619;
								this.anIntArray401[local50] -= Static480.anInt10369;
								if (arg4 != 0) {
									local56 = Canvas_Sub1.anIntArray497[arg4];
									local386 = Canvas_Sub1.anIntArray498[arg4];
									local404 = local56 * this.anIntArray398[local50] + local386 * this.anIntArray399[local50] + 16383 >> 14;
									this.anIntArray398[local50] = this.anIntArray398[local50] * local386 + 16383 - local56 * this.anIntArray399[local50] >> 14;
									this.anIntArray399[local50] = local404;
								}
								if (arg2 != 0) {
									local56 = Canvas_Sub1.anIntArray497[arg2];
									local386 = Canvas_Sub1.anIntArray498[arg2];
									local404 = local386 * this.anIntArray398[local50] + 16383 - local56 * this.anIntArray401[local50] >> 14;
									this.anIntArray401[local50] = local56 * this.anIntArray398[local50] + local386 * this.anIntArray401[local50] + 16383 >> 14;
									this.anIntArray398[local50] = local404;
								}
								if (arg3 != 0) {
									local56 = Canvas_Sub1.anIntArray497[arg3];
									local386 = Canvas_Sub1.anIntArray498[arg3];
									local404 = this.anIntArray401[local50] * local56 + this.anIntArray399[local50] * local386 + 16383 >> 14;
									this.anIntArray401[local50] = local386 * this.anIntArray401[local50] + 16383 - this.anIntArray399[local50] * local56 >> 14;
									this.anIntArray399[local50] = local404;
								}
								this.anIntArray399[local50] += Static199.anInt3394;
								this.anIntArray398[local50] += Static520.anInt8619;
								this.anIntArray401[local50] += Static480.anInt10369;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray35.length > local38) {
							local48 = this.anIntArrayArray35[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray81 == null || (this.aShortArray81[local56] & arg6) != 0) {
									local386 = this.anIntArray397[local56];
									local404 = this.anIntArray397[local56 + 1];
									for (local629 = local386; local629 < local404; local629++) {
										local638 = this.aShortArray86[local629] - 1;
										if (local638 == -1) {
											break;
										}
										if (arg4 != 0) {
											local647 = Canvas_Sub1.anIntArray497[arg4];
											local651 = Canvas_Sub1.anIntArray498[arg4];
											local670 = local647 * this.aShortArray78[local638] + this.aShortArray83[local638] * local651 + 16383 >> 14;
											this.aShortArray78[local638] = (short) (this.aShortArray78[local638] * local651 + 16383 - this.aShortArray83[local638] * local647 >> 14);
											this.aShortArray83[local638] = (short) local670;
										}
										if (arg2 != 0) {
											local647 = Canvas_Sub1.anIntArray497[arg2];
											local651 = Canvas_Sub1.anIntArray498[arg2];
											local670 = local651 * this.aShortArray78[local638] + 16383 - local647 * this.aShortArray77[local638] >> 14;
											this.aShortArray77[local638] = (short) (this.aShortArray77[local638] * local651 + this.aShortArray78[local638] * local647 + 16383 >> 14);
											this.aShortArray78[local638] = (short) local670;
										}
										if (arg3 != 0) {
											local647 = Canvas_Sub1.anIntArray497[arg3];
											local651 = Canvas_Sub1.anIntArray498[arg3];
											local670 = this.aShortArray77[local638] * local647 + local651 * this.aShortArray83[local638] + 16383 >> 14;
											this.aShortArray77[local638] = (short) (local651 * this.aShortArray77[local638] + 16383 - this.aShortArray83[local638] * local647 >> 14);
											this.aShortArray83[local638] = (short) local670;
										}
									}
								}
							}
						}
					}
					if (this.aClass82_13 == null && this.aClass82_12 != null) {
						this.aClass82_12.anInterface12_2 = null;
					}
					if (this.aClass82_13 != null) {
						this.aClass82_13.anInterface12_2 = null;
						return;
					}
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static139.aBoolean199) {
					local386 = Static199.anInt3394 * arg7[0] + arg7[3] * Static520.anInt8619 + arg7[6] * Static480.anInt10369 + 8192 >> 14;
					local404 = Static480.anInt10369 * arg7[7] + arg7[1] * Static199.anInt3394 + Static520.anInt8619 * arg7[4] + 8192 >> 14;
					local629 = Static520.anInt8619 * arg7[5] + Static199.anInt3394 * arg7[2] + Static480.anInt10369 * arg7[8] + 8192 >> 14;
					local404 += local50;
					local386 += local249;
					Static199.anInt3394 = local386;
					local629 += local56;
					Static520.anInt8619 = local404;
					Static139.aBoolean199 = false;
					Static480.anInt10369 = local629;
				}
				@Pc(981) int[] local981 = new int[9];
				local404 = Canvas_Sub1.anIntArray498[arg2];
				local629 = Canvas_Sub1.anIntArray497[arg2];
				local638 = Canvas_Sub1.anIntArray498[arg3];
				local647 = Canvas_Sub1.anIntArray497[arg3];
				local651 = Canvas_Sub1.anIntArray498[arg4];
				local670 = Canvas_Sub1.anIntArray497[arg4];
				local1013 = local629 * local651 + 8192 >> 14;
				local1021 = local670 * local629 + 8192 >> 14;
				local981[1] = local647 * local1013 + -local638 * local670 + 8192 >> 14;
				local981[7] = local670 * local647 + local1013 * local638 + 8192 >> 14;
				local981[0] = local651 * local638 + local1021 * local647 + 8192 >> 14;
				local981[3] = local404 * local670 + 8192 >> 14;
				local981[8] = local638 * local404 + 8192 >> 14;
				local981[5] = -local629;
				local981[4] = local404 * local651 + 8192 >> 14;
				local981[6] = local1021 * local638 + local651 * -local647 + 8192 >> 14;
				local981[2] = local647 * local404 + 8192 >> 14;
				@Pc(1150) int local1150 = local981[2] * -Static480.anInt10369 + local981[0] * -Static199.anInt3394 + local981[1] * -Static520.anInt8619 + 8192 >> 14;
				local1176 = -Static520.anInt8619 * local981[4] + local981[3] * -Static199.anInt3394 + local981[5] * -Static480.anInt10369 + 8192 >> 14;
				local1202 = local981[7] * -Static520.anInt8619 + local981[6] * -Static199.anInt3394 + -Static480.anInt10369 * local981[8] + 8192 >> 14;
				local1206 = local1150 + Static199.anInt3394;
				@Pc(1210) int local1210 = local1176 + Static520.anInt8619;
				local1214 = Static480.anInt10369 + local1202;
				@Pc(1217) int[] local1217 = new int[9];
				for (local1219 = 0; local1219 < 3; local1219++) {
					for (local1223 = 0; local1223 < 3; local1223++) {
						local1227 = 0;
						for (local1229 = 0; local1229 < 3; local1229++) {
							local1227 += arg7[local1223 * 3 + local1229] * local981[local1219 * 3 + local1229];
						}
						local1217[local1219 * 3 + local1223] = local1227 + 8192 >> 14;
					}
				}
				local1223 = local981[2] * local56 + local249 * local981[0] + local981[1] * local50 + 8192 >> 14;
				local1227 = local981[5] * local56 + local981[4] * local50 + local249 * local981[3] + 8192 >> 14;
				local1227 += local1210;
				local1229 = local981[8] * local56 + local981[6] * local249 + local50 * local981[7] + 8192 >> 14;
				local1223 += local1206;
				local1229 += local1214;
				local1359 = new int[9];
				for (local1361 = 0; local1361 < 3; local1361++) {
					for (local1365 = 0; local1365 < 3; local1365++) {
						local1369 = 0;
						for (local1371 = 0; local1371 < 3; local1371++) {
							local1369 += local1217[local1371 * 3 + local1365] * arg7[local1371 + local1361 * 3];
						}
						local1359[local1365 + local1361 * 3] = local1369 + 8192 >> 14;
					}
				}
				local1365 = local1229 * arg7[2] + local1223 * arg7[0] + local1227 * arg7[1] + 8192 >> 14;
				local1369 = local1223 * arg7[3] + arg7[4] * local1227 + arg7[5] * local1229 + 8192 >> 14;
				local1369 += local32;
				local1371 = local1227 * arg7[7] + local1223 * arg7[6] + arg7[8] * local1229 + 8192 >> 14;
				local1365 += local30;
				local1371 += local38;
				for (local1502 = 0; local1502 < local8; local1502++) {
					@Pc(1508) int local1508 = arg1[local1502];
					if (this.anIntArrayArray35.length > local1508) {
						@Pc(1518) int[] local1518 = this.anIntArrayArray35[local1508];
						for (@Pc(1520) int local1520 = 0; local1520 < local1518.length; local1520++) {
							@Pc(1526) int local1526 = local1518[local1520];
							if (this.aShortArray81 == null || (this.aShortArray81[local1526] & arg6) != 0) {
								@Pc(1567) int local1567 = this.anIntArray401[local1526] * local1359[2] + this.anIntArray399[local1526] * local1359[0] + this.anIntArray398[local1526] * local1359[1] + 8192 >> 14;
								@Pc(1599) int local1599 = this.anIntArray399[local1526] * local1359[3] + this.anIntArray398[local1526] * local1359[4] + this.anIntArray401[local1526] * local1359[5] + 8192 >> 14;
								@Pc(1603) int local1603 = local1599 + local1369;
								@Pc(1607) int local1607 = local1567 + local1365;
								@Pc(1638) int local1638 = local1359[6] * this.anIntArray399[local1526] + this.anIntArray398[local1526] * local1359[7] + local1359[8] * this.anIntArray401[local1526] + 8192 >> 14;
								this.anIntArray399[local1526] = local1607;
								@Pc(1647) int local1647 = local1638 + local1371;
								this.anIntArray398[local1526] = local1603;
								this.anIntArray401[local1526] = local1647;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2570) Class146 local2570;
			@Pc(2575) Class178 local2575;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray34.length) {
							local247 = this.anIntArrayArray34[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local50 = local247[local249];
								if (this.aShortArray85 == null || (arg6 & this.aShortArray85[local50]) != 0) {
									local56 = (this.aByteArray71[local50] & 0xFF) + arg2 * 8;
									if (local56 < 0) {
										local56 = 0;
									} else if (local56 > 255) {
										local56 = 255;
									}
									this.aByteArray71[local50] = (byte) local56;
									if (this.aClass82_12 != null) {
										this.aClass82_12.anInterface12_2 = null;
									}
								}
							}
						}
					}
					if (this.aClass146Array1 != null) {
						for (local32 = 0; local32 < this.anInt5530; local32++) {
							local2570 = this.aClass146Array1[local32];
							local2575 = this.aClass178Array1[local32];
							local2575.anInt4434 = 255 - (this.aByteArray71[local2570.anInt3671] & 0xFF) << 24 | local2575.anInt4434 & 0xFFFFFF;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(2831) Class178 local2831;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray33.length) {
								local247 = this.anIntArrayArray33[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2831 = this.aClass178Array1[local247[local249]];
									local2831.anInt4440 += arg2;
									local2831.anInt4435 += arg3;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local30 = 0; local30 < local8; local30++) {
							local32 = arg1[local30];
							if (local32 < this.anIntArrayArray33.length) {
								local247 = this.anIntArrayArray33[local32];
								for (local249 = 0; local249 < local247.length; local249++) {
									local2831 = this.aClass178Array1[local247[local249]];
									local2831.anInt4438 = local2831.anInt4438 * arg2 >> 7;
									local2831.anInt4441 = arg3 * local2831.anInt4441 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray33.length) {
							local247 = this.anIntArrayArray33[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2831 = this.aClass178Array1[local247[local249]];
								local2831.anInt4439 = arg2 + local2831.anInt4439 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray34 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (local32 < this.anIntArrayArray34.length) {
						local247 = this.anIntArrayArray34[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray85 == null || (this.aShortArray85[local50] & arg6) != 0) {
								local56 = this.aShortArray82[local50] & 0xFFFF;
								local386 = local56 >> 10 & 0x3F;
								local404 = local56 >> 7 & 0x7;
								local404 += arg3 / 4;
								local629 = local56 & 0x7F;
								@Pc(2685) int local2685 = arg2 + local386 & 0x3F;
								local629 += arg4;
								if (local404 < 0) {
									local404 = 0;
								} else if (local404 > 7) {
									local404 = 7;
								}
								if (local629 < 0) {
									local629 = 0;
								} else if (local629 > 127) {
									local629 = 127;
								}
								this.aShortArray82[local50] = (short) (local2685 << 10 | local404 << 7 | local629);
								if (this.aClass82_12 != null) {
									this.aClass82_12.anInterface12_2 = null;
								}
							}
						}
					}
				}
				if (this.aClass146Array1 != null) {
					for (local32 = 0; local32 < this.anInt5530; local32++) {
						local2570 = this.aClass146Array1[local32];
						local2575 = this.aClass178Array1[local32];
						local2575.anInt4434 = Static343.anIntArray359[this.aShortArray82[local2570.anInt3671] & 0xFFFF] & 0xFFFFFF | local2575.anInt4434 & 0xFF000000;
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (local32 < this.anIntArrayArray35.length) {
					local247 = this.anIntArrayArray35[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray81 == null || (this.aShortArray81[local50] & arg6) != 0) {
							this.anIntArray399[local50] -= Static199.anInt3394;
							this.anIntArray398[local50] -= Static520.anInt8619;
							this.anIntArray401[local50] -= Static480.anInt10369;
							this.anIntArray399[local50] = arg2 * this.anIntArray399[local50] >> 7;
							this.anIntArray398[local50] = arg3 * this.anIntArray398[local50] >> 7;
							this.anIntArray401[local50] = this.anIntArray401[local50] * arg4 >> 7;
							this.anIntArray399[local50] += Static199.anInt3394;
							this.anIntArray398[local50] += Static520.anInt8619;
							this.anIntArray401[local50] += Static480.anInt10369;
						}
					}
				}
			}
		} else {
			local30 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static139.aBoolean199) {
				local386 = Static480.anInt10369 * arg7[6] + Static520.anInt8619 * arg7[3] + arg7[0] * Static199.anInt3394 + 8192 >> 14;
				local404 = Static199.anInt3394 * arg7[1] + arg7[4] * Static520.anInt8619 + Static480.anInt10369 * arg7[7] + 8192 >> 14;
				local386 += local249;
				local404 += local50;
				local629 = Static480.anInt10369 * arg7[8] + arg7[5] * Static520.anInt8619 + arg7[2] * Static199.anInt3394 + 8192 >> 14;
				Static520.anInt8619 = local404;
				local629 += local56;
				Static199.anInt3394 = local386;
				Static480.anInt10369 = local629;
				Static139.aBoolean199 = false;
			}
			local386 = arg2 << 15 >> 7;
			local404 = arg3 << 15 >> 7;
			local629 = arg4 << 15 >> 7;
			local638 = local386 * -Static199.anInt3394 + 8192 >> 14;
			local647 = local404 * -Static520.anInt8619 + 8192 >> 14;
			local651 = local629 * -Static480.anInt10369 + 8192 >> 14;
			local670 = Static199.anInt3394 + local638;
			local1013 = local647 + Static520.anInt8619;
			local1021 = local651 + Static480.anInt10369;
			@Pc(2005) int[] local2005 = new int[] { local386 * arg7[0] + 8192 >> 14, local386 * arg7[3] + 8192 >> 14, local386 * arg7[6] + 8192 >> 14, arg7[1] * local404 + 8192 >> 14, arg7[4] * local404 + 8192 >> 14, arg7[7] * local404 + 8192 >> 14, local629 * arg7[2] + 8192 >> 14, local629 * arg7[5] + 8192 >> 14, arg7[8] * local629 + 8192 >> 14 };
			local1176 = local386 * local249 + 8192 >> 14;
			local1202 = local50 * local404 + 8192 >> 14;
			local1206 = local629 * local56 + 8192 >> 14;
			@Pc(2141) int local2141 = local1176 + local670;
			@Pc(2145) int local2145 = local1202 + local1013;
			@Pc(2149) int local2149 = local1206 + local1021;
			@Pc(2152) int[] local2152 = new int[9];
			@Pc(2158) int local2158;
			for (local1214 = 0; local1214 < 3; local1214++) {
				for (local2158 = 0; local2158 < 3; local2158++) {
					local1219 = 0;
					for (local1223 = 0; local1223 < 3; local1223++) {
						local1219 += arg7[local1214 * 3 + local1223] * local2005[local2158 + local1223 * 3];
					}
					local2152[local1214 * 3 + local2158] = local1219 + 8192 >> 14;
				}
			}
			local2158 = local2145 * arg7[1] + local2141 * arg7[0] + local2149 * arg7[2] + 8192 >> 14;
			local1219 = arg7[5] * local2149 + arg7[3] * local2141 + local2145 * arg7[4] + 8192 >> 14;
			local1223 = local2149 * arg7[8] + local2145 * arg7[7] + arg7[6] * local2141 + 8192 >> 14;
			local1219 += local32;
			local2158 += local30;
			local1223 += local38;
			for (local1227 = 0; local1227 < local8; local1227++) {
				local1229 = arg1[local1227];
				if (local1229 < this.anIntArrayArray35.length) {
					local1359 = this.anIntArrayArray35[local1229];
					for (local1361 = 0; local1361 < local1359.length; local1361++) {
						local1365 = local1359[local1361];
						if (this.aShortArray81 == null || (this.aShortArray81[local1365] & arg6) != 0) {
							local1369 = local2152[1] * this.anIntArray398[local1365] + this.anIntArray399[local1365] * local2152[0] + this.anIntArray401[local1365] * local2152[2] + 8192 >> 14;
							local1371 = this.anIntArray401[local1365] * local2152[5] + this.anIntArray399[local1365] * local2152[3] + local2152[4] * this.anIntArray398[local1365] + 8192 >> 14;
							@Pc(2397) int local2397 = local1371 + local1219;
							@Pc(2401) int local2401 = local1369 + local2158;
							local1502 = local2152[8] * this.anIntArray401[local1365] + this.anIntArray399[local1365] * local2152[6] + this.anIntArray398[local1365] * local2152[7] + 8192 >> 14;
							@Pc(2436) int local2436 = local1502 + local1223;
							this.anIntArray399[local1365] = local2401;
							this.anIntArray398[local1365] = local2397;
							this.anIntArray401[local1365] = local2436;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZB)V")
	private void method4752(@OriginalArg(0) boolean arg0) {
		if (this.anInt5570 * 6 <= this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1.aByteArray115.length) {
			this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1.anInt10247 = 0;
		} else {
			this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1 = new Class2_Sub22_Sub1((this.anInt5570 + 100) * 6);
		}
		@Pc(44) Class2_Sub22_Sub1 local44 = this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1;
		@Pc(50) int local50;
		if (this.aClass95_Sub1_29.aBoolean174) {
			for (local50 = 0; local50 < this.anInt5570; local50++) {
				local44.method8500(this.aShortArray84[local50]);
				local44.method8500(this.aShortArray79[local50]);
				local44.method8500(this.aShortArray76[local50]);
			}
		} else {
			for (local50 = 0; local50 < this.anInt5570; local50++) {
				local44.method8492(this.aShortArray84[local50]);
				local44.method8492(this.aShortArray79[local50]);
				local44.method8492(this.aShortArray76[local50]);
			}
		}
		if (local44.anInt10247 == 0) {
			return;
		}
		if (arg0) {
			if (this.anInterface26_3 == null) {
				this.anInterface26_3 = this.aClass95_Sub1_29.method2107(local44.anInt10247, local44.aByteArray115, true);
			} else {
				this.anInterface26_3.method5675(local44.aByteArray115, local44.anInt10247);
			}
			this.aClass286_1.anInterface26_4 = this.anInterface26_3;
		} else {
			this.aClass286_1.anInterface26_4 = this.aClass95_Sub1_29.method2107(local44.anInt10247, local44.aByteArray115, false);
		}
		if (!arg0) {
			this.aBoolean405 = true;
		}
	}

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean402;
	}

	@OriginalMember(owner = "client!ml", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort66;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(53) int local53;
		@Pc(51) int[] local51;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static520.anInt8619 = 0;
			local29 = 0;
			Static480.anInt10369 = 0;
			Static199.anInt3394 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray35.length > local41) {
					local51 = this.anIntArrayArray35[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static199.anInt3394 += this.anIntArray399[local59];
						Static520.anInt8619 += this.anIntArray398[local59];
						Static480.anInt10369 += this.anIntArray401[local59];
						local29++;
					}
				}
			}
			if (local29 > 0) {
				Static520.anInt8619 = local21 + Static520.anInt8619 / local29;
				Static480.anInt10369 = Static480.anInt10369 / local29 + local25;
				Static199.anInt3394 = Static199.anInt3394 / local29 + local17;
			} else {
				Static199.anInt3394 = local17;
				Static520.anInt8619 = local21;
				Static480.anInt10369 = local25;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray35.length) {
					local162 = this.anIntArrayArray35[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray399[local53] += local17;
						this.anIntArray398[local53] += local21;
						this.anIntArray401[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(283) int local283;
		@Pc(302) int local302;
		@Pc(751) int local751;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray35.length > local35) {
					local162 = this.anIntArrayArray35[local35];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray399[local53] -= Static199.anInt3394;
							this.anIntArray398[local53] -= Static520.anInt8619;
							this.anIntArray401[local53] -= Static480.anInt10369;
							if (arg4 != 0) {
								local59 = Canvas_Sub1.anIntArray497[arg4];
								local283 = Canvas_Sub1.anIntArray498[arg4];
								local302 = local59 * this.anIntArray398[local53] + this.anIntArray399[local53] * local283 + 16383 >> 14;
								this.anIntArray398[local53] = this.anIntArray398[local53] * local283 + 16383 - this.anIntArray399[local53] * local59 >> 14;
								this.anIntArray399[local53] = local302;
							}
							if (arg2 != 0) {
								local59 = Canvas_Sub1.anIntArray497[arg2];
								local283 = Canvas_Sub1.anIntArray498[arg2];
								local302 = this.anIntArray398[local53] * local283 + 16383 - local59 * this.anIntArray401[local53] >> 14;
								this.anIntArray401[local53] = this.anIntArray401[local53] * local283 + this.anIntArray398[local53] * local59 + 16383 >> 14;
								this.anIntArray398[local53] = local302;
							}
							if (arg3 != 0) {
								local59 = Canvas_Sub1.anIntArray497[arg3];
								local283 = Canvas_Sub1.anIntArray498[arg3];
								local302 = local59 * this.anIntArray401[local53] + local283 * this.anIntArray399[local53] + 16383 >> 14;
								this.anIntArray401[local53] = this.anIntArray401[local53] * local283 + 16383 - local59 * this.anIntArray399[local53] >> 14;
								this.anIntArray399[local53] = local302;
							}
							this.anIntArray399[local53] += Static199.anInt3394;
							this.anIntArray398[local53] += Static520.anInt8619;
							this.anIntArray401[local53] += Static480.anInt10369;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							this.anIntArray399[local53] -= Static199.anInt3394;
							this.anIntArray398[local53] -= Static520.anInt8619;
							this.anIntArray401[local53] -= Static480.anInt10369;
							if (arg2 != 0) {
								local59 = Canvas_Sub1.anIntArray497[arg2];
								local283 = Canvas_Sub1.anIntArray498[arg2];
								local302 = local283 * this.anIntArray398[local53] + 16383 - local59 * this.anIntArray401[local53] >> 14;
								this.anIntArray401[local53] = this.anIntArray398[local53] * local59 + local283 * this.anIntArray401[local53] + 16383 >> 14;
								this.anIntArray398[local53] = local302;
							}
							if (arg4 != 0) {
								local59 = Canvas_Sub1.anIntArray497[arg4];
								local283 = Canvas_Sub1.anIntArray498[arg4];
								local302 = this.anIntArray399[local53] * local283 + local59 * this.anIntArray398[local53] + 16383 >> 14;
								this.anIntArray398[local53] = local283 * this.anIntArray398[local53] + 16383 - this.anIntArray399[local53] * local59 >> 14;
								this.anIntArray399[local53] = local302;
							}
							if (arg3 != 0) {
								local59 = Canvas_Sub1.anIntArray497[arg3];
								local283 = Canvas_Sub1.anIntArray498[arg3];
								local302 = this.anIntArray399[local53] * local283 + this.anIntArray401[local53] * local59 + 16383 >> 14;
								this.anIntArray401[local53] = this.anIntArray401[local53] * local283 + 16383 - this.anIntArray399[local53] * local59 >> 14;
								this.anIntArray399[local53] = local302;
							}
							this.anIntArray399[local53] += Static199.anInt3394;
							this.anIntArray398[local53] += Static520.anInt8619;
							this.anIntArray401[local53] += Static480.anInt10369;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray35.length) {
						local51 = this.anIntArrayArray35[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local283 = this.anIntArray397[local59];
							local302 = this.anIntArray397[local59 + 1];
							for (local751 = local283; local751 < local302; local751++) {
								@Pc(760) int local760 = this.aShortArray86[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Canvas_Sub1.anIntArray497[arg4];
									local774 = Canvas_Sub1.anIntArray498[arg4];
									local792 = this.aShortArray83[local760] * local774 + this.aShortArray78[local760] * local770 + 16383 >> 14;
									this.aShortArray78[local760] = (short) (this.aShortArray78[local760] * local774 + 16383 - this.aShortArray83[local760] * local770 >> 14);
									this.aShortArray83[local760] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Canvas_Sub1.anIntArray497[arg2];
									local774 = Canvas_Sub1.anIntArray498[arg2];
									local792 = this.aShortArray78[local760] * local774 + 16383 - local770 * this.aShortArray77[local760] >> 14;
									this.aShortArray77[local760] = (short) (local774 * this.aShortArray77[local760] + this.aShortArray78[local760] * local770 + 16383 >> 14);
									this.aShortArray78[local760] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Canvas_Sub1.anIntArray497[arg3];
									local774 = Canvas_Sub1.anIntArray498[arg3];
									local792 = local770 * this.aShortArray77[local760] + this.aShortArray83[local760] * local774 + 16383 >> 14;
									this.aShortArray77[local760] = (short) (local774 * this.aShortArray77[local760] + 16383 - local770 * this.aShortArray83[local760] >> 14);
									this.aShortArray83[local760] = (short) local792;
								}
							}
						}
					}
				}
				if (this.aClass82_13 == null && this.aClass82_12 != null) {
					this.aClass82_12.anInterface12_2 = null;
				}
				if (this.aClass82_13 != null) {
					this.aClass82_13.anInterface12_2 = null;
				}
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray35.length) {
					local162 = this.anIntArrayArray35[local35];
					for (local164 = 0; local164 < local162.length; local164++) {
						local53 = local162[local164];
						this.anIntArray399[local53] -= Static199.anInt3394;
						this.anIntArray398[local53] -= Static520.anInt8619;
						this.anIntArray401[local53] -= Static480.anInt10369;
						this.anIntArray399[local53] = this.anIntArray399[local53] * arg2 >> 7;
						this.anIntArray398[local53] = this.anIntArray398[local53] * arg3 >> 7;
						this.anIntArray401[local53] = arg4 * this.anIntArray401[local53] >> 7;
						this.anIntArray399[local53] += Static199.anInt3394;
						this.anIntArray398[local53] += Static520.anInt8619;
						this.anIntArray401[local53] += Static480.anInt10369;
					}
				}
			}
		} else {
			@Pc(1224) Class146 local1224;
			@Pc(1229) Class178 local1229;
			if (arg0 == 5) {
				if (this.anIntArrayArray34 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray34.length) {
							local162 = this.anIntArrayArray34[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local53 = local162[local164];
								local59 = (this.aByteArray71[local53] & 0xFF) + arg2 * 8;
								if (local59 < 0) {
									local59 = 0;
								} else if (local59 > 255) {
									local59 = 255;
								}
								this.aByteArray71[local53] = (byte) local59;
							}
							if (local162.length > 0 && this.aClass82_12 != null) {
								this.aClass82_12.anInterface12_2 = null;
							}
						}
					}
					if (this.aClass146Array1 != null) {
						for (local35 = 0; local35 < this.anInt5530; local35++) {
							local1224 = this.aClass146Array1[local35];
							local1229 = this.aClass178Array1[local35];
							local1229.anInt4434 = local1229.anInt4434 & 0xFFFFFF | 255 - (this.aByteArray71[local1224.anInt3671] & 0xFF) << 24;
						}
					}
				}
			} else if (arg0 != 7) {
				@Pc(1469) Class178 local1469;
				if (arg0 == 8) {
					if (this.anIntArrayArray33 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (local35 < this.anIntArrayArray33.length) {
								local162 = this.anIntArrayArray33[local35];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1469 = this.aClass178Array1[local162[local164]];
									local1469.anInt4435 += arg3;
									local1469.anInt4440 += arg2;
								}
							}
						}
					}
				} else if (arg0 == 10) {
					if (this.anIntArrayArray33 != null) {
						for (local29 = 0; local29 < local8; local29++) {
							local35 = arg1[local29];
							if (this.anIntArrayArray33.length > local35) {
								local162 = this.anIntArrayArray33[local35];
								for (local164 = 0; local164 < local162.length; local164++) {
									local1469 = this.aClass178Array1[local162[local164]];
									local1469.anInt4441 = local1469.anInt4441 * arg3 >> 7;
									local1469.anInt4438 = local1469.anInt4438 * arg2 >> 7;
								}
							}
						}
					}
				} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray33.length) {
							local162 = this.anIntArrayArray33[local35];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1469 = this.aClass178Array1[local162[local164]];
								local1469.anInt4439 = arg2 + local1469.anInt4439 & 0x3FFF;
							}
						}
					}
				}
			} else if (this.anIntArrayArray34 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray34.length) {
						local162 = this.anIntArrayArray34[local35];
						for (local164 = 0; local164 < local162.length; local164++) {
							local53 = local162[local164];
							local59 = this.aShortArray82[local53] & 0xFFFF;
							local283 = local59 >> 10 & 0x3F;
							local302 = local59 >> 7 & 0x7;
							local751 = local59 & 0x7F;
							local302 += arg3 / 4;
							@Pc(1321) int local1321 = arg2 + local283 & 0x3F;
							if (local302 < 0) {
								local302 = 0;
							} else if (local302 > 7) {
								local302 = 7;
							}
							local751 += arg4;
							if (local751 < 0) {
								local751 = 0;
							} else if (local751 > 127) {
								local751 = 127;
							}
							this.aShortArray82[local53] = (short) (local302 << 7 | local1321 << 10 | local751);
						}
						if (local162.length > 0 && this.aClass82_12 != null) {
							this.aClass82_12.anInterface12_2 = null;
						}
					}
				}
				if (this.aClass146Array1 != null) {
					for (local35 = 0; local35 < this.anInt5530; local35++) {
						local1224 = this.aClass146Array1[local35];
						local1229 = this.aClass178Array1[local35];
						local1229.anInt4434 = local1229.anInt4434 & 0xFF000000 | Static343.anIntArray359[this.aShortArray82[local1224.anInt3671] & 0xFFFF] & 0xFFFFFF;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIJIILclient!kda;FIIF)S")
	private short method4753(@OriginalArg(1) int arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class186 arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8) {
		@Pc(10) int local10 = this.anIntArray397[arg3];
		@Pc(17) int local17 = this.anIntArray397[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray86[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static107.aLongArray9[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray86[local19] = (short) (this.anInt5541 + 1);
		Static107.aLongArray9[local19] = arg1;
		this.aShortArray83[this.anInt5541] = (short) arg0;
		this.aShortArray78[this.anInt5541] = (short) arg6;
		this.aShortArray77[this.anInt5541] = (short) arg7;
		this.aByteArray70[this.anInt5541] = (byte) arg2;
		this.aFloatArray24[this.anInt5541] = arg8;
		this.aFloatArray23[this.anInt5541] = arg5;
		return (short) this.anInt5541++;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	private void method4754() {
		if (!this.aBoolean405) {
			return;
		}
		this.aBoolean405 = false;
		if (this.aClass143Array4 == null && this.aClass255Array4 == null && this.aClass146Array1 == null) {
			if (this.anIntArray399 != null && !Static487.method6819(this.anInt5527, this.anInt5536)) {
				if (this.aClass82_10 != null && this.aClass82_10.anInterface12_2 == null) {
					this.aBoolean405 = true;
				} else {
					if (!this.aBoolean404) {
						this.method4756();
					}
					this.anIntArray399 = null;
				}
			}
			if (this.anIntArray398 != null && !Static182.method7791(this.anInt5527, this.anInt5536)) {
				if (this.aClass82_10 != null && this.aClass82_10.anInterface12_2 == null) {
					this.aBoolean405 = true;
				} else {
					if (!this.aBoolean404) {
						this.method4756();
					}
					this.anIntArray398 = null;
				}
			}
			if (this.anIntArray401 != null && !Static570.method7808(this.anInt5536, this.anInt5527)) {
				if (this.aClass82_10 != null && this.aClass82_10.anInterface12_2 == null) {
					this.aBoolean405 = true;
				} else {
					if (!this.aBoolean404) {
						this.method4756();
					}
					this.anIntArray401 = null;
				}
			}
		}
		if (this.aShortArray86 != null && this.anIntArray399 == null && this.anIntArray398 == null && this.anIntArray401 == null) {
			this.anIntArray397 = null;
			this.aShortArray86 = null;
		}
		if (this.aByteArray70 != null && !Static254.method3521(this.anInt5527, this.anInt5536)) {
			if (this.aClass82_13 == null) {
				if (this.aClass82_12 != null && this.aClass82_12.anInterface12_2 == null) {
					this.aBoolean405 = true;
				} else {
					this.aByteArray70 = null;
					this.aShortArray83 = this.aShortArray78 = this.aShortArray77 = null;
				}
			} else if (this.aClass82_13.anInterface12_2 == null) {
				this.aBoolean405 = true;
			} else {
				this.aByteArray70 = null;
				this.aShortArray83 = this.aShortArray78 = this.aShortArray77 = null;
			}
		}
		if (this.aShortArray82 != null && !Static267.method3747(this.anInt5527, this.anInt5536)) {
			if (this.aClass82_12 != null && this.aClass82_12.anInterface12_2 == null) {
				this.aBoolean405 = true;
			} else {
				this.aShortArray82 = null;
			}
		}
		if (this.aByteArray71 != null && !Static623.method8331(this.anInt5536, this.anInt5527)) {
			if (this.aClass82_12 != null && this.aClass82_12.anInterface12_2 == null) {
				this.aBoolean405 = true;
			} else {
				this.aByteArray71 = null;
			}
		}
		if (this.aFloatArray24 != null && !Static317.method4263(this.anInt5536, this.anInt5527)) {
			if (this.aClass82_11 != null && this.aClass82_11.anInterface12_2 == null) {
				this.aBoolean405 = true;
			} else {
				this.aFloatArray24 = this.aFloatArray23 = null;
			}
		}
		if (this.aShortArray87 != null && !Static5.method100(this.anInt5527, this.anInt5536)) {
			if (this.aClass82_12 != null && this.aClass82_12.anInterface12_2 == null) {
				this.aBoolean405 = true;
			} else {
				this.aShortArray87 = null;
			}
		}
		if (this.aShortArray84 != null && !Static328.method4405(this.anInt5527, this.anInt5536)) {
			if ((this.aClass286_1 == null || this.aClass286_1.anInterface26_4 != null) && (this.aClass82_12 == null || this.aClass82_12.anInterface12_2 != null)) {
				this.aShortArray84 = this.aShortArray79 = this.aShortArray76 = null;
			} else {
				this.aBoolean405 = true;
			}
		}
		if (this.anIntArrayArray34 != null && !Static575.method7861(this.anInt5527, this.anInt5536)) {
			this.aShortArray85 = null;
			this.anIntArrayArray34 = null;
		}
		if (this.anIntArrayArray35 != null && !Static362.method4883(this.anInt5527, this.anInt5536)) {
			this.aShortArray81 = null;
			this.anIntArrayArray35 = null;
		}
		if (this.anIntArrayArray33 != null && !Static23.method425(this.anInt5527, this.anInt5536)) {
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArray400 != null && (this.anInt5536 & 0x800) == 0 && (this.anInt5536 & 0x40000) == 0) {
			this.anIntArray400 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "()[Lclient!oo;")
	@Override
	public Class255[] method6196() {
		return this.aClass255Array4;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	private void method4755() {
		if (this.anInt5570 == 0) {
			return;
		}
		if (this.aByte86 != 0) {
			this.method4757(true);
		}
		this.method4757(false);
		if (this.aClass286_1 != null) {
			if (this.aClass286_1.anInterface26_4 == null) {
				this.method4752((this.aByte86 & 0x10) != 0);
			}
			if (this.aClass286_1.anInterface26_4 != null) {
				this.aClass95_Sub1_29.method2099(this.aClass82_13 != null);
				this.aClass95_Sub1_29.method2086(this.aClass82_12, this.aClass82_10, this.aClass82_11, this.aClass82_13);
				@Pc(81) int local81 = this.anIntArray400.length - 1;
				for (@Pc(83) int local83 = 0; local83 < local81; local83++) {
					@Pc(90) int local90 = this.anIntArray400[local83];
					@Pc(97) int local97 = this.anIntArray400[local83 + 1];
					@Pc(104) int local104 = this.aShortArray87[local90] & 0xFFFF;
					if (local104 == 65535) {
						local104 = -1;
					}
					this.aClass95_Sub1_29.method2051(local104, this.aClass82_13 != null);
					this.aClass95_Sub1_29.method2118((local97 - local90) * 3, local90 * 3, this.aClass286_1.anInterface26_4);
				}
			}
		}
		this.method4754();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class182 method6208(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) Class182_Sub2 local12;
		@Pc(16) Class182_Sub2 local16;
		if (arg0 == 1) {
			local12 = this.aClass95_Sub1_29.aClass182_Sub2_4;
			local16 = this.aClass95_Sub1_29.aClass182_Sub2_3;
		} else if (arg0 == 2) {
			local16 = this.aClass95_Sub1_29.aClass182_Sub2_9;
			local12 = this.aClass95_Sub1_29.aClass182_Sub2_1;
		} else if (arg0 == 3) {
			local12 = this.aClass95_Sub1_29.aClass182_Sub2_10;
			local16 = this.aClass95_Sub1_29.aClass182_Sub2_8;
		} else if (arg0 == 4) {
			local12 = this.aClass95_Sub1_29.aClass182_Sub2_2;
			local16 = this.aClass95_Sub1_29.aClass182_Sub2_6;
		} else if (arg0 == 5) {
			local16 = this.aClass95_Sub1_29.aClass182_Sub2_5;
			local12 = this.aClass95_Sub1_29.aClass182_Sub2_7;
		} else {
			local12 = local16 = new Class182_Sub2(this.aClass95_Sub1_29);
		}
		return this.method4760(local16, arg1, arg0 != 0, arg2, local12);
	}

	@OriginalMember(owner = "client!ml", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass95_Sub1_29.anInterface6_27;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5537; local11++) {
			if (arg0 == this.aShortArray87[local11]) {
				this.aShortArray87[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class175 local48 = local9.method1492(arg0 & 0xFFFF);
			local37 = local48.aByte57;
			local35 = local48.aByte51;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(69) Class175 local69 = local9.method1492(arg1 & 0xFFFF);
			if (local69.aByte53 != 0 || local69.aByte54 != 0) {
				this.aBoolean402 = true;
			}
			local58 = local69.aByte57;
			local56 = local69.aByte51;
		}
		if (!(local56 != local35 | local37 != local58)) {
			return;
		}
		if (this.aClass146Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt5530; local109++) {
				@Pc(116) Class146 local116 = this.aClass146Array1[local109];
				@Pc(121) Class178 local121 = this.aClass178Array1[local109];
				local121.anInt4434 = Static343.anIntArray359[this.aShortArray82[local116.anInt3671] & 0xFFFF] & 0xFFFFFF | local121.anInt4434 & 0xFF000000;
			}
		}
		if (this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5537; local7++) {
			local16 = this.aShortArray82[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 -= -(arg3 * (arg0 - local22) >> 7);
			}
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += (arg2 - local32) * arg3 >> 7;
			}
			this.aShortArray82[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass146Array1 != null) {
			for (local16 = 0; local16 < this.anInt5530; local16++) {
				@Pc(109) Class146 local109 = this.aClass146Array1[local16];
				@Pc(114) Class178 local114 = this.aClass178Array1[local16];
				local114.anInt4434 = Static343.anIntArray359[this.aShortArray82[local109.anInt3671] & 0xFFFF] & 0xFFFFFF | local114.anInt4434 & 0xFF000000;
			}
		}
		if (this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5539; local7++) {
			this.anIntArray401[local7] = -this.anIntArray401[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5541; local25++) {
			this.aShortArray77[local25] = (short) -this.aShortArray77[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5537; local44++) {
			@Pc(51) short local51 = this.aShortArray84[local44];
			this.aShortArray84[local44] = this.aShortArray76[local44];
			this.aShortArray76[local44] = local51;
		}
		if (this.aClass82_13 == null && this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
		}
		if (this.aClass82_13 != null) {
			this.aClass82_13.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
		if (this.aClass286_1 != null) {
			this.aClass286_1.anInterface26_4 = null;
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!uha;ZII)Z")
	@Override
	public boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method4759(arg5, arg4, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6195(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class182_Sub2 local8 = (Class182_Sub2) arg0;
		if (this.anInt5537 == 0 || local8.anInt5537 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt5539;
		@Pc(24) int[] local24 = local8.anIntArray399;
		@Pc(27) int[] local27 = local8.anIntArray398;
		@Pc(30) int[] local30 = local8.anIntArray401;
		@Pc(33) short[] local33 = local8.aShortArray83;
		@Pc(36) short[] local36 = local8.aShortArray78;
		@Pc(39) short[] local39 = local8.aShortArray77;
		@Pc(42) byte[] local42 = local8.aByteArray70;
		@Pc(49) short[] local49;
		@Pc(53) short[] local53;
		@Pc(51) short[] local51;
		@Pc(47) byte[] local47;
		if (this.aClass58_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass58_1.aShortArray24;
			local47 = this.aClass58_1.aByteArray15;
			local53 = this.aClass58_1.aShortArray22;
			local49 = this.aClass58_1.aShortArray23;
		}
		@Pc(78) short[] local78;
		@Pc(76) short[] local76;
		@Pc(80) short[] local80;
		@Pc(82) byte[] local82;
		if (local8.aClass58_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local78 = local8.aClass58_1.aShortArray23;
			local80 = local8.aClass58_1.aShortArray24;
			local76 = local8.aClass58_1.aShortArray22;
			local82 = local8.aClass58_1.aByteArray15;
		}
		@Pc(103) int[] local103 = local8.anIntArray397;
		@Pc(106) short[] local106 = local8.aShortArray86;
		if (!local8.aBoolean404) {
			local8.method4756();
		}
		@Pc(115) short local115 = local8.aShort74;
		@Pc(118) short local118 = local8.aShort73;
		@Pc(121) short local121 = local8.aShort70;
		@Pc(124) short local124 = local8.aShort67;
		@Pc(127) short local127 = local8.aShort68;
		@Pc(130) short local130 = local8.aShort71;
		for (@Pc(132) int local132 = 0; local132 < this.anInt5539; local132++) {
			@Pc(141) int local141 = this.anIntArray398[local132] - arg2;
			if (local141 >= local115 && local141 <= local118) {
				@Pc(160) int local160 = this.anIntArray399[local132] - arg1;
				if (local121 <= local160 && local124 >= local160) {
					@Pc(184) int local184 = this.anIntArray401[local132] - arg3;
					if (local184 >= local127 && local130 >= local184) {
						@Pc(194) int local194 = -1;
						@Pc(199) int local199 = this.anIntArray397[local132];
						@Pc(206) int local206 = this.anIntArray397[local132 + 1];
						for (@Pc(208) int local208 = local199; local208 < local206; local208++) {
							local194 = this.aShortArray86[local208] - 1;
							if (local194 == -1 || this.aByteArray70[local194] != 0) {
								break;
							}
						}
						if (local194 != -1) {
							for (@Pc(243) int local243 = 0; local243 < local21; local243++) {
								if (local24[local243] == local160 && local184 == local30[local243] && local27[local243] == local141) {
									local199 = local103[local243];
									local206 = local103[local243 + 1];
									@Pc(280) int local280 = -1;
									for (@Pc(282) int local282 = local199; local282 < local206; local282++) {
										local280 = local106[local282] - 1;
										if (local280 == -1 || local42[local280] != 0) {
											break;
										}
									}
									if (local280 != -1) {
										if (local49 == null) {
											this.aClass58_1 = new Class58();
											local49 = this.aClass58_1.aShortArray23 = Static142.method2161(this.aShortArray83);
											local53 = this.aClass58_1.aShortArray22 = Static142.method2161(this.aShortArray78);
											local51 = this.aClass58_1.aShortArray24 = Static142.method2161(this.aShortArray77);
											local47 = this.aClass58_1.aByteArray15 = Static565.method7737(this.aByteArray70);
										}
										if (local78 == null) {
											@Pc(358) Class58 local358 = local8.aClass58_1 = new Class58();
											local78 = local358.aShortArray23 = Static142.method2161(local33);
											local76 = local358.aShortArray22 = Static142.method2161(local36);
											local80 = local358.aShortArray24 = Static142.method2161(local39);
											local82 = local358.aByteArray15 = Static565.method7737(local42);
										}
										@Pc(391) short local391 = this.aShortArray83[local194];
										@Pc(396) short local396 = this.aShortArray78[local194];
										@Pc(401) short local401 = this.aShortArray77[local194];
										local199 = local103[local243];
										local206 = local103[local243 + 1];
										@Pc(416) byte local416 = this.aByteArray70[local194];
										@Pc(426) int local426;
										for (@Pc(418) int local418 = local199; local418 < local206; local418++) {
											local426 = local106[local418] - 1;
											if (local426 == -1) {
												break;
											}
											if (local82[local426] != 0) {
												local78[local426] += local391;
												local76[local426] += local396;
												local80[local426] += local401;
												local82[local426] += local416;
											}
										}
										local206 = this.anIntArray397[local132 + 1];
										local416 = local42[local280];
										local396 = local36[local280];
										local391 = local33[local280];
										local401 = local39[local280];
										local199 = this.anIntArray397[local132];
										for (local426 = local199; local426 < local206; local426++) {
											@Pc(516) int local516 = this.aShortArray86[local426] - 1;
											if (local516 == -1) {
												break;
											}
											if (local47[local516] != 0) {
												local49[local516] += local391;
												local53[local516] += local396;
												local51[local516] += local401;
												local47[local516] += local416;
											}
										}
										if (this.aClass82_13 == null && this.aClass82_12 != null) {
											this.aClass82_12.anInterface12_2 = null;
										}
										if (this.aClass82_13 != null) {
											this.aClass82_13.anInterface12_2 = null;
										}
										if (local8.aClass82_13 == null && local8.aClass82_12 != null) {
											local8.aClass82_12.anInterface12_2 = null;
										}
										if (local8.aClass82_13 != null) {
											local8.aClass82_13.anInterface12_2 = null;
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

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "()Z")
	@Override
	public boolean method6207() {
		if (this.aShortArray87 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray87.length; local12++) {
			if (this.aShortArray87[local12] != -1 && !this.aClass95_Sub1_29.anInterface6_27.method1493(this.aShortArray87[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean404) {
			this.method4756();
		}
		@Pc(16) int local16 = arg4 + this.aShort70;
		@Pc(21) int local21 = this.aShort67 + arg4;
		@Pc(26) int local26 = this.aShort68 + arg6;
		@Pc(32) int local32 = arg6 + this.aShort71;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8792 + local21 >> arg2.anInt8795 >= arg2.anInt8791 || local26 < 0 || arg2.anInt8792 + local32 >> arg2.anInt8795 >= arg2.anInt8794)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8791 <= local21 + arg3.anInt8792 >> arg3.anInt8795 || local26 < 0 || arg3.anInt8794 <= local32 + arg3.anInt8792 >> arg3.anInt8795) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8795;
			local21 = local21 + arg2.anInt8792 - 1 >> arg2.anInt8795;
			local26 >>= arg2.anInt8795;
			local32 = local32 + arg2.anInt8792 - 1 >> arg2.anInt8795;
			if (arg5 == arg2.method7396(local26, local16) && arg5 == arg2.method7396(local26, local21) && arg2.method7396(local32, local16) == arg5 && arg5 == arg2.method7396(local32, local21)) {
				return;
			}
		}
		@Pc(187) int local187;
		if (arg0 == 1) {
			for (local187 = 0; local187 < this.anInt5539; local187++) {
				this.anIntArray398[local187] += arg2.method7398(this.anIntArray399[local187] + arg4, this.anIntArray401[local187] - -arg6) - arg5;
			}
		} else {
			@Pc(235) int local235;
			@Pc(246) int local246;
			if (arg0 == 2) {
				@Pc(230) short local230 = this.aShort74;
				if (local230 == 0) {
					return;
				}
				for (local235 = 0; local235 < this.anInt5539; local235++) {
					local246 = (this.anIntArray398[local235] << 16) / local230;
					if (arg1 > local246) {
						this.anIntArray398[local235] -= -((arg2.method7398(arg4 + this.anIntArray399[local235], this.anIntArray401[local235] - -arg6) - arg5) * (-local246 + arg1) / arg1);
					}
				}
			} else {
				@Pc(335) int local335;
				if (arg0 == 3) {
					local187 = (arg1 & 0xFF) * 4;
					local235 = (arg1 >> 8 & 0xFF) * 4;
					local246 = (arg1 >> 16 & 0xFF) << 6;
					local335 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local187 >> 1) < 0 || arg2.anInt8792 + arg4 + (local187 >> 1) >= arg2.anInt8791 << arg2.anInt8795 || arg6 - (local235 >> 1) < 0 || arg2.anInt8794 << arg2.anInt8795 <= (local235 >> 1) + arg6 + arg2.anInt8792) {
						return;
					}
					this.method6211(arg6, local335, local246, arg2, arg5, local235, arg4, local187);
				} else if (arg0 == 4) {
					local187 = this.aShort73 - this.aShort74;
					for (local235 = 0; local235 < this.anInt5539; local235++) {
						this.anIntArray398[local235] = local187 + this.anIntArray398[local235] + arg3.method7398(arg4 + this.anIntArray399[local235], arg6 + this.anIntArray401[local235]) - arg5;
					}
				} else if (arg0 == 5) {
					local187 = this.aShort73 - this.aShort74;
					for (local235 = 0; local235 < this.anInt5539; local235++) {
						local246 = this.anIntArray399[local235] + arg4;
						local335 = this.anIntArray401[local235] + arg6;
						@Pc(443) int local443 = arg2.method7398(local246, local335);
						@Pc(449) int local449 = arg3.method7398(local246, local335);
						@Pc(457) int local457 = local443 - local449 - arg1;
						this.anIntArray398[local235] = (local457 * ((this.anIntArray398[local235] << 8) / local187) >> 8) + local443 - arg5;
					}
				}
			}
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!uha;ZI)Z")
	@Override
	public boolean method6205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4759(-1, arg4, arg2, arg1, arg0, arg3);
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	private void method4756() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5539; local23++) {
			@Pc(30) int local30 = this.anIntArray399[local23];
			@Pc(35) int local35 = this.anIntArray398[local23];
			if (local30 > local13) {
				local13 = local30;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			@Pc(68) int local68 = this.anIntArray401[local23];
			if (local68 < local11) {
				local11 = local68;
			}
			if (local68 > local17) {
				local17 = local68;
			}
			@Pc(90) int local90 = local68 * local68 + local30 * local30;
			if (local90 > local19) {
				local19 = local90;
			}
			local90 = local35 * local35 + local30 * local30 + local68 * local68;
			if (local90 > local21) {
				local21 = local90;
			}
		}
		this.aShort68 = (short) local11;
		this.aShort73 = (short) local15;
		this.aShort70 = (short) local7;
		this.aShort71 = (short) local17;
		this.aShort67 = (short) local13;
		this.aShort74 = (short) local9;
		this.aShort75 = (short) (Math.sqrt((double) local19) + 0.99D);
		this.aShort69 = (short) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean404 = true;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
	private void method4757(@OriginalArg(1) boolean arg0) {
		@Pc(16) boolean local16 = this.aClass82_12 != null && this.aClass82_12.anInterface12_2 == null;
		@Pc(27) boolean local27 = this.aClass82_13 != null && this.aClass82_13.anInterface12_2 == null;
		@Pc(38) boolean local38 = this.aClass82_10 != null && this.aClass82_10.anInterface12_2 == null;
		@Pc(49) boolean local49 = this.aClass82_11 != null && this.aClass82_11.anInterface12_2 == null;
		if (arg0) {
			local27 &= (this.aByte86 & 0x4) != 0;
			local38 &= (this.aByte86 & 0x1) != 0;
			local16 &= (this.aByte86 & 0x2) != 0;
			local49 &= (this.aByte86 & 0x8) != 0;
		}
		@Pc(100) byte local100 = 0;
		@Pc(104) byte local104 = 0;
		@Pc(106) byte local106 = 0;
		@Pc(108) byte local108 = 0;
		if (local38) {
			local100 = 12;
		}
		if (local16) {
			local104 = local100;
			local100 = (byte) (local100 + 4);
		}
		if (local27) {
			local106 = local100;
			local100 = (byte) (local100 + 12);
		}
		if (local49) {
			local108 = local100;
			local100 = (byte) (local100 + 8);
		}
		if (local100 == 0) {
			return;
		}
		if (this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1.aByteArray115.length >= local100 * this.anInt5541) {
			this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1.anInt10247 = 0;
		} else {
			this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1 = new Class2_Sub22_Sub1(local100 * (this.anInt5541 + 100));
		}
		@Pc(181) Class2_Sub22_Sub1 local181 = this.aClass95_Sub1_29.aClass2_Sub22_Sub1_1;
		@Pc(189) int local189;
		@Pc(198) int local198;
		@Pc(226) int local226;
		@Pc(235) int local235;
		if (local38) {
			@Pc(205) int local205;
			@Pc(212) int local212;
			@Pc(217) int local217;
			@Pc(224) int local224;
			if (this.aClass95_Sub1_29.aBoolean174) {
				for (local189 = 0; local189 < this.anInt5539; local189++) {
					local198 = Stream.floatToRawIntBits((float) this.anIntArray399[local189]);
					local205 = Stream.floatToRawIntBits((float) this.anIntArray398[local189]);
					local212 = Stream.floatToRawIntBits((float) this.anIntArray401[local189]);
					local217 = this.anIntArray397[local189];
					local224 = this.anIntArray397[local189 + 1];
					for (local226 = local217; local226 < local224; local226++) {
						local235 = this.aShortArray86[local226] - 1;
						if (local235 == -1) {
							break;
						}
						local181.anInt10247 = local100 * local235;
						local181.method8552(local198);
						local181.method8552(local205);
						local181.method8552(local212);
					}
				}
			} else {
				for (local189 = 0; local189 < this.anInt5539; local189++) {
					local198 = Stream.floatToRawIntBits((float) this.anIntArray399[local189]);
					local205 = Stream.floatToRawIntBits((float) this.anIntArray398[local189]);
					local212 = Stream.floatToRawIntBits((float) this.anIntArray401[local189]);
					local217 = this.anIntArray397[local189];
					local224 = this.anIntArray397[local189 + 1];
					for (local226 = local217; local226 < local224; local226++) {
						local235 = this.aShortArray86[local226] - 1;
						if (local235 == -1) {
							break;
						}
						local181.anInt10247 = local235 * local100;
						local181.method8513(local198);
						local181.method8513(local205);
						local181.method8513(local212);
					}
				}
			}
		}
		@Pc(486) float local486;
		@Pc(375) short[] local375;
		@Pc(383) short[] local383;
		@Pc(379) short[] local379;
		@Pc(371) byte[] local371;
		@Pc(530) float local530;
		if (local16) {
			if (this.aClass82_13 == null) {
				if (this.aClass58_1 == null) {
					local371 = this.aByteArray70;
					local375 = this.aShortArray83;
					local379 = this.aShortArray77;
					local383 = this.aShortArray78;
				} else {
					local371 = this.aClass58_1.aByteArray15;
					local375 = this.aClass58_1.aShortArray23;
					local379 = this.aClass58_1.aShortArray24;
					local383 = this.aClass58_1.aShortArray22;
				}
				@Pc(403) float local403 = this.aClass95_Sub1_29.aFloatArray7[0];
				@Pc(409) float local409 = this.aClass95_Sub1_29.aFloatArray7[1];
				@Pc(415) float local415 = this.aClass95_Sub1_29.aFloatArray7[2];
				@Pc(419) float local419 = this.aClass95_Sub1_29.aFloat36;
				@Pc(429) float local429 = this.aClass95_Sub1_29.aFloat25 * 768.0F / (float) this.aShort66;
				@Pc(439) float local439 = this.aClass95_Sub1_29.aFloat28 * 768.0F / (float) this.aShort66;
				for (@Pc(441) int local441 = 0; local441 < this.anInt5537; local441++) {
					@Pc(461) int local461 = this.method4758(this.aShort72, this.aShortArray87[local441], this.aShortArray82[local441], this.aByteArray71[local441]);
					@Pc(466) short local466 = this.aShortArray84[local441];
					@Pc(475) float local475 = this.aClass95_Sub1_29.aFloat30 * (float) (local461 >>> 24);
					local486 = this.aClass95_Sub1_29.aFloat32 * (float) (local461 >> 16 & 0xFF);
					@Pc(497) float local497 = this.aClass95_Sub1_29.aFloat35 * (float) (local461 >> 8 & 0xFF);
					@Pc(502) short local502 = (short) local371[local466];
					if (local502 == 0) {
						local530 = (local415 * (float) local379[local466] + local409 * (float) local383[local466] + (float) local375[local466] * local403) * 0.0026041667F;
					} else {
						local530 = ((float) local383[local466] * local409 + local403 * (float) local375[local466] + local415 * (float) local379[local466]) / (float) (local502 * 256);
					}
					@Pc(570) float local570 = (local530 < 0.0F ? local439 : local429) * local530 + local419;
					@Pc(575) int local575 = (int) (local570 * local475);
					@Pc(580) int local580 = (int) (local570 * local486);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					@Pc(596) int local596 = (int) (local570 * local497);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					local181.anInt10247 = local104 + local100 * local466;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local181.method8537(local575);
					local181.method8537(local580);
					local181.method8537(local596);
					local181.method8537(255 - (this.aByteArray71[local441] & 0xFF));
					local466 = this.aShortArray79[local441];
					local502 = local371[local466];
					if (local502 == 0) {
						local530 = (local415 * (float) local379[local466] + (float) local375[local466] * local403 + local409 * (float) local383[local466]) * 0.0026041667F;
					} else {
						local530 = ((float) local379[local466] * local415 + (float) local375[local466] * local403 + local409 * (float) local383[local466]) / (float) (local502 * 256);
					}
					local570 = local419 + (local530 < 0.0F ? local439 : local429) * local530;
					local575 = (int) (local475 * local570);
					local580 = (int) (local486 * local570);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local596 = (int) (local497 * local570);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local181.anInt10247 = local104 + local466 * local100;
					local181.method8537(local575);
					local181.method8537(local580);
					local181.method8537(local596);
					local181.method8537(255 - (this.aByteArray71[local441] & 0xFF));
					local466 = this.aShortArray76[local441];
					local502 = local371[local466];
					if (local502 == 0) {
						local530 = ((float) local379[local466] * local415 + (float) local375[local466] * local403 + (float) local383[local466] * local409) * 0.0026041667F;
					} else {
						local530 = ((float) local375[local466] * local403 + local409 * (float) local383[local466] + (float) local379[local466] * local415) / (float) (local502 * 256);
					}
					local570 = local419 + local530 * (local530 < 0.0F ? local439 : local429);
					local575 = (int) (local570 * local475);
					local580 = (int) (local570 * local486);
					if (local575 < 0) {
						local575 = 0;
					} else if (local575 > 255) {
						local575 = 255;
					}
					local596 = (int) (local497 * local570);
					if (local580 < 0) {
						local580 = 0;
					} else if (local580 > 255) {
						local580 = 255;
					}
					local181.anInt10247 = local104 + local466 * local100;
					if (local596 < 0) {
						local596 = 0;
					} else if (local596 > 255) {
						local596 = 255;
					}
					local181.method8537(local575);
					local181.method8537(local580);
					local181.method8537(local596);
					local181.method8537(255 - (this.aByteArray71[local441] & 0xFF));
				}
			} else {
				for (local189 = 0; local189 < this.anInt5537; local189++) {
					local198 = this.method4758(this.aShort72, this.aShortArray87[local189], this.aShortArray82[local189], this.aByteArray71[local189]);
					local181.anInt10247 = local104 + this.aShortArray84[local189] * local100;
					local181.method8552(local198);
					local181.anInt10247 = local100 * this.aShortArray79[local189] + local104;
					local181.method8552(local198);
					local181.anInt10247 = local104 + local100 * this.aShortArray76[local189];
					local181.method8552(local198);
				}
			}
		}
		if (local27) {
			if (this.aClass58_1 == null) {
				local375 = this.aShortArray83;
				local371 = this.aByteArray70;
				local383 = this.aShortArray78;
				local379 = this.aShortArray77;
			} else {
				local375 = this.aClass58_1.aShortArray23;
				local379 = this.aClass58_1.aShortArray24;
				local371 = this.aClass58_1.aByteArray15;
				local383 = this.aClass58_1.aShortArray22;
			}
			@Pc(1105) float local1105 = 3.0F / (float) this.aShort66;
			local530 = 3.0F / (float) (this.aShort66 + this.aShort66 / 2);
			local181.anInt10247 = local106;
			if (this.aClass95_Sub1_29.aBoolean174) {
				for (local226 = 0; local226 < this.anInt5541; local226++) {
					local235 = local371[local226] & 0xFF;
					if (local235 == 0) {
						local181.method3702(local530 * (float) local375[local226]);
						local181.method3702((float) local383[local226] * local530);
						local181.method3702(local530 * (float) local379[local226]);
					} else {
						local486 = local1105 / (float) local235;
						local181.method3702(local486 * (float) local375[local226]);
						local181.method3702(local486 * (float) local383[local226]);
						local181.method3702((float) local379[local226] * local486);
					}
					local181.anInt10247 += local100 - 12;
				}
			} else {
				for (local226 = 0; local226 < this.anInt5541; local226++) {
					local235 = local371[local226] & 0xFF;
					if (local235 == 0) {
						local181.method3701((float) local375[local226] * local530);
						local181.method3701((float) local383[local226] * local530);
						local181.method3701(local530 * (float) local379[local226]);
					} else {
						local486 = local1105 / (float) local235;
						local181.method3701(local486 * (float) local375[local226]);
						local181.method3701(local486 * (float) local383[local226]);
						local181.method3701(local486 * (float) local379[local226]);
					}
					local181.anInt10247 += local100 - 12;
				}
			}
		}
		if (local49) {
			local181.anInt10247 = local108;
			if (this.aClass95_Sub1_29.aBoolean174) {
				for (local189 = 0; local189 < this.anInt5541; local189++) {
					local181.method3702(this.aFloatArray24[local189]);
					local181.method3702(this.aFloatArray23[local189]);
					local181.anInt10247 += local100 - 8;
				}
			} else {
				for (local189 = 0; local189 < this.anInt5541; local189++) {
					local181.method3701(this.aFloatArray24[local189]);
					local181.method3701(this.aFloatArray23[local189]);
					local181.anInt10247 += local100 - 8;
				}
			}
		}
		local181.anInt10247 = local100 * this.anInt5541;
		@Pc(1408) Interface12 local1408;
		if (arg0) {
			if (this.anInterface12_6 == null) {
				this.anInterface12_6 = this.aClass95_Sub1_29.method2071(local181.anInt10247, true, local181.aByteArray115, local100);
			} else {
				this.anInterface12_6.method7601(local100, local181.anInt10247, local181.aByteArray115);
			}
			local1408 = this.anInterface12_6;
			this.aByte86 = 0;
		} else {
			local1408 = this.aClass95_Sub1_29.method2071(local181.anInt10247, false, local181.aByteArray115, local100);
			this.aBoolean405 = true;
		}
		if (local38) {
			this.aClass82_10.aByte31 = 0;
			this.aClass82_10.anInterface12_2 = local1408;
		}
		if (local49) {
			this.aClass82_11.aByte31 = local108;
			this.aClass82_11.anInterface12_2 = local1408;
		}
		if (local16) {
			this.aClass82_12.aByte31 = local104;
			this.aClass82_12.anInterface12_2 = local1408;
		}
		if (local27) {
			this.aClass82_13.aByte31 = local106;
			this.aClass82_13.anInterface12_2 = local1408;
		}
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "()[Lclient!hr;")
	@Override
	public Class143[] method6217() {
		return this.aClass143Array4;
	}

	@OriginalMember(owner = "client!ml", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort72 = (short) arg0;
		if (this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "()V")
	@Override
	protected void method6209() {
	}

	@OriginalMember(owner = "client!ml", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5539; local7++) {
			if (arg0 != 128) {
				this.anIntArray399[local7] = arg0 * this.anIntArray399[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray398[local7] = arg1 * this.anIntArray398[local7] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray401[local7] = arg2 * this.anIntArray401[local7] >> 7;
			}
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!ml", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort66 = (short) arg0;
		if (this.aClass82_12 != null) {
			this.aClass82_12.anInterface12_2 = null;
		}
		if (this.aClass82_13 != null) {
			this.aClass82_13.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ISIBI)I")
	private int method4758(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(18) int local18 = Static343.anIntArray359[Static373.method5031(arg2, arg0)];
		if (arg1 != -1) {
			@Pc(32) Class175 local32 = this.aClass95_Sub1_29.anInterface6_27.method1492(arg1 & 0xFFFF);
			@Pc(37) int local37 = local32.aByte51 & 0xFF;
			@Pc(50) int local50;
			@Pc(73) int local73;
			if (local37 != 0) {
				if (arg0 < 0) {
					local50 = 0;
				} else if (arg0 <= 127) {
					local50 = arg0 * 131586;
				} else {
					local50 = 16777215;
				}
				if (local37 == 256) {
					local18 = local50;
				} else {
					local73 = 256 - local37;
					local18 = (local37 * (local50 & 0xFF00) + local73 * (local18 & 0xFF00) & 0xFF0000) + (local37 * (local50 & 0xFF00FF) + (local18 & 0xFF00FF) * local73 & 0xFF00FF00) >> 8;
				}
			}
			local50 = local32.aByte57 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(123) int local123 = local50 * (local18 >> 16 & 0xFF);
				if (local123 > 65535) {
					local123 = 65535;
				}
				local73 = local50 * (local18 >> 8 & 0xFF);
				if (local73 > 65535) {
					local73 = 65535;
				}
				@Pc(147) int local147 = (local18 & 0xFF) * local50;
				if (local147 > 65535) {
					local147 = 65535;
				}
				local18 = (local147 >> 8) + ((local123 & 0x9C00FF00) << 8) + (local73 & 0xFF00);
			}
		}
		return (local18 << 8) + 255 - (arg3 & 0xFF);
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!uha;Lclient!au;II)V")
	@Override
	public void method6194(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5541 == 0) {
			return;
		}
		@Pc(16) Class177_Sub3 local16 = this.aClass95_Sub1_29.aClass177_Sub3_3;
		@Pc(19) Class177_Sub3 local19 = (Class177_Sub3) arg0;
		if (!this.aBoolean404) {
			this.method4756();
		}
		Static415.aFloat120 = local19.aFloat200 * local16.aFloat203 + local19.aFloat206 * local16.aFloat204 + local16.aFloat201 * local19.aFloat202 + local16.aFloat202;
		Static267.aFloat72 = local16.aFloat201 * local19.aFloat204 + local19.aFloat195 * local16.aFloat203 + local19.aFloat205 * local16.aFloat204;
		@Pc(72) float local72 = Static415.aFloat120 + (float) this.aShort74 * Static267.aFloat72;
		@Pc(80) float local80 = Static267.aFloat72 * (float) this.aShort73 + Static415.aFloat120;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = (float) -this.aShort75 + local80;
			local97 = local72 + (float) this.aShort75;
		} else {
			local91 = (float) -this.aShort75 + local72;
			local97 = local80 + (float) this.aShort75;
		}
		if (local91 >= this.aClass95_Sub1_29.aFloat42 || (float) this.aClass95_Sub1_29.anInt2526 >= local97) {
			return;
		}
		Static298.aFloat89 = local19.aFloat204 * local16.aFloat199 + local16.aFloat197 * local19.aFloat195 + local19.aFloat205 * local16.aFloat195;
		Static457.aFloat147 = local16.aFloat200 + local19.aFloat202 * local16.aFloat199 + local16.aFloat195 * local19.aFloat206 + local19.aFloat200 * local16.aFloat197;
		@Pc(174) float local174 = Static457.aFloat147 + (float) this.aShort74 * Static298.aFloat89;
		@Pc(182) float local182 = Static457.aFloat147 + Static298.aFloat89 * (float) this.aShort73;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local182 < local174) {
			local198 = (float) this.aClass95_Sub1_29.anInt2536 * (local182 - (float) this.aShort75);
			local209 = ((float) this.aShort75 + local174) * (float) this.aClass95_Sub1_29.anInt2536;
		} else {
			local198 = (float) this.aClass95_Sub1_29.anInt2536 * ((float) -this.aShort75 + local174);
			local209 = (float) this.aClass95_Sub1_29.anInt2536 * (local182 + (float) this.aShort75);
		}
		if (this.aClass95_Sub1_29.aFloat31 <= local198 / (float) arg2 || this.aClass95_Sub1_29.aFloat29 >= local209 / (float) arg2) {
			return;
		}
		Static128.aFloat22 = local19.aFloat202 * local16.aFloat196 + local19.aFloat200 * local16.aFloat198 + local19.aFloat206 * local16.aFloat205 + local16.aFloat206;
		Static32.aFloat9 = local19.aFloat195 * local16.aFloat198 + local16.aFloat205 * local19.aFloat205 + local19.aFloat204 * local16.aFloat196;
		@Pc(300) float local300 = Static128.aFloat22 + (float) this.aShort74 * Static32.aFloat9;
		@Pc(308) float local308 = Static32.aFloat9 * (float) this.aShort73 + Static128.aFloat22;
		@Pc(334) float local334;
		@Pc(323) float local323;
		if (local308 < local300) {
			local323 = (float) this.aClass95_Sub1_29.anInt2533 * (local300 + (float) this.aShort75);
			local334 = (local308 - (float) this.aShort75) * (float) this.aClass95_Sub1_29.anInt2533;
		} else {
			local334 = (float) this.aClass95_Sub1_29.anInt2533 * ((float) -this.aShort75 + local300);
			local323 = (float) this.aClass95_Sub1_29.anInt2533 * ((float) this.aShort75 + local308);
		}
		if (local334 / (float) arg2 >= this.aClass95_Sub1_29.aFloat39 || local323 / (float) arg2 <= this.aClass95_Sub1_29.aFloat26) {
			return;
		}
		if (arg1 != null || this.aClass146Array1 != null) {
			Static179.aFloat53 = local16.aFloat198 * local19.aFloat199 + local19.aFloat196 * local16.aFloat205 + local16.aFloat196 * local19.aFloat201;
			Static318.aFloat92 = local19.aFloat198 * local16.aFloat205 + local19.aFloat197 * local16.aFloat198 + local19.aFloat203 * local16.aFloat196;
			Static320.aFloat93 = local16.aFloat201 * local19.aFloat201 + local19.aFloat196 * local16.aFloat204 + local19.aFloat199 * local16.aFloat203;
			Static378.aFloat215 = local16.aFloat197 * local19.aFloat197 + local19.aFloat198 * local16.aFloat195 + local16.aFloat199 * local19.aFloat203;
			Static579.aFloat171 = local19.aFloat197 * local16.aFloat203 + local16.aFloat204 * local19.aFloat198 + local19.aFloat203 * local16.aFloat201;
			Static307.aFloat90 = local19.aFloat201 * local16.aFloat199 + local16.aFloat195 * local19.aFloat196 + local19.aFloat199 * local16.aFloat197;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.aShort70 + this.aShort67 >> 1;
			@Pc(510) int local510 = this.aShort68 + this.aShort71 >> 1;
			@Pc(529) int local529 = (int) ((float) local510 * Static307.aFloat90 + Static298.aFloat89 * (float) this.aShort74 + Static457.aFloat147 + Static378.aFloat215 * (float) local502);
			@Pc(548) int local548 = (int) (Static32.aFloat9 * (float) this.aShort74 + Static128.aFloat22 + Static318.aFloat92 * (float) local502 + (float) local510 * Static179.aFloat53);
			@Pc(567) int local567 = (int) (Static415.aFloat120 + (float) local502 * Static579.aFloat171 + (float) this.aShort74 * Static267.aFloat72 + (float) local510 * Static320.aFloat93);
			@Pc(586) int local586 = (int) (Static457.aFloat147 + (float) local502 * Static378.aFloat215 + Static298.aFloat89 * (float) this.aShort73 + Static307.aFloat90 * (float) local510);
			@Pc(605) int local605 = (int) ((float) local502 * Static318.aFloat92 + Static128.aFloat22 + Static32.aFloat9 * (float) this.aShort73 + (float) local510 * Static179.aFloat53);
			arg1.anInt605 = this.aClass95_Sub1_29.anInt2547 + this.aClass95_Sub1_29.anInt2536 * local586 / arg2;
			arg1.anInt607 = this.aClass95_Sub1_29.anInt2543 + local605 * this.aClass95_Sub1_29.anInt2533 / arg2;
			arg1.anInt603 = local529 * this.aClass95_Sub1_29.anInt2536 / arg2 + this.aClass95_Sub1_29.anInt2547;
			arg1.anInt604 = this.aClass95_Sub1_29.anInt2533 * local548 / arg2 + this.aClass95_Sub1_29.anInt2543;
			@Pc(676) int local676 = (int) (Static579.aFloat171 * (float) local502 + Static415.aFloat120 + Static267.aFloat72 * (float) this.aShort73 + (float) local510 * Static320.aFloat93);
			if (local567 >= this.aClass95_Sub1_29.anInt2526 || this.aClass95_Sub1_29.anInt2526 <= local676) {
				arg1.anInt606 = (this.aShort75 + local529) * this.aClass95_Sub1_29.anInt2536 / arg2 + this.aClass95_Sub1_29.anInt2547 - arg1.anInt603;
				arg1.aBoolean48 = true;
			}
		}
		this.aClass95_Sub1_29.method2040((float) arg2);
		this.aClass95_Sub1_29.method2063();
		this.aClass95_Sub1_29.method2076(local19);
		this.method4755();
		this.aClass95_Sub1_29.method2115();
		this.method4748();
	}

	@OriginalMember(owner = "client!ml", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5539; local15++) {
			@Pc(34) int local34 = this.anIntArray398[local15] * local13 - local9 * this.anIntArray401[local15] >> 14;
			this.anIntArray401[local15] = local9 * this.anIntArray398[local15] + local13 * this.anIntArray401[local15] >> 14;
			this.anIntArray398[local15] = local34;
		}
		this.aBoolean404 = false;
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
	}

	@OriginalMember(owner = "client!ml", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static480.anInt10369 = 0;
			Static199.anInt3394 = 0;
			local16 = 0;
			Static520.anInt8619 = 0;
			for (local20 = 0; local20 < this.anInt5539; local20++) {
				Static199.anInt3394 += this.anIntArray399[local20];
				Static520.anInt8619 += this.anIntArray398[local20];
				local16++;
				Static480.anInt10369 += this.anIntArray401[local20];
			}
			if (local16 > 0) {
				Static199.anInt3394 = arg1 + Static199.anInt3394 / local16;
				Static480.anInt10369 = arg3 + Static480.anInt10369 / local16;
				Static520.anInt8619 = Static520.anInt8619 / local16 + arg2;
			} else {
				Static520.anInt8619 = arg2;
				Static480.anInt10369 = arg3;
				Static199.anInt3394 = arg1;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt5539; local16++) {
				this.anIntArray399[local16] += arg1;
				this.anIntArray398[local16] += arg2;
				this.anIntArray401[local16] += arg3;
			}
		} else {
			@Pc(170) int local170;
			@Pc(188) int local188;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt5539; local16++) {
					this.anIntArray399[local16] -= Static199.anInt3394;
					this.anIntArray398[local16] -= Static520.anInt8619;
					this.anIntArray401[local16] -= Static480.anInt10369;
					if (arg3 != 0) {
						local20 = Canvas_Sub1.anIntArray497[arg3];
						local170 = Canvas_Sub1.anIntArray498[arg3];
						local188 = this.anIntArray399[local16] * local170 + this.anIntArray398[local16] * local20 + 16383 >> 14;
						this.anIntArray398[local16] = this.anIntArray398[local16] * local170 + 16383 - this.anIntArray399[local16] * local20 >> 14;
						this.anIntArray399[local16] = local188;
					}
					if (arg1 != 0) {
						local20 = Canvas_Sub1.anIntArray497[arg1];
						local170 = Canvas_Sub1.anIntArray498[arg1];
						local188 = local170 * this.anIntArray398[local16] + 16383 - local20 * this.anIntArray401[local16] >> 14;
						this.anIntArray401[local16] = this.anIntArray398[local16] * local20 + this.anIntArray401[local16] * local170 + 16383 >> 14;
						this.anIntArray398[local16] = local188;
					}
					if (arg2 != 0) {
						local20 = Canvas_Sub1.anIntArray497[arg2];
						local170 = Canvas_Sub1.anIntArray498[arg2];
						local188 = local20 * this.anIntArray401[local16] + this.anIntArray399[local16] * local170 + 16383 >> 14;
						this.anIntArray401[local16] = this.anIntArray401[local16] * local170 + 16383 - this.anIntArray399[local16] * local20 >> 14;
						this.anIntArray399[local16] = local188;
					}
					this.anIntArray399[local16] += Static199.anInt3394;
					this.anIntArray398[local16] += Static520.anInt8619;
					this.anIntArray401[local16] += Static480.anInt10369;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt5539; local16++) {
					this.anIntArray399[local16] -= Static199.anInt3394;
					this.anIntArray398[local16] -= Static520.anInt8619;
					this.anIntArray401[local16] -= Static480.anInt10369;
					this.anIntArray399[local16] = arg1 * this.anIntArray399[local16] / 128;
					this.anIntArray398[local16] = this.anIntArray398[local16] * arg2 / 128;
					this.anIntArray401[local16] = this.anIntArray401[local16] * arg3 / 128;
					this.anIntArray399[local16] += Static199.anInt3394;
					this.anIntArray398[local16] += Static520.anInt8619;
					this.anIntArray401[local16] += Static480.anInt10369;
				}
			} else {
				@Pc(525) Class146 local525;
				@Pc(530) Class178 local530;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt5537; local16++) {
						local20 = arg1 * 8 + (this.aByteArray71[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray71[local16] = (byte) local20;
					}
					if (this.aClass82_12 != null) {
						this.aClass82_12.anInterface12_2 = null;
					}
					if (this.aClass146Array1 != null) {
						for (local20 = 0; local20 < this.anInt5530; local20++) {
							local525 = this.aClass146Array1[local20];
							local530 = this.aClass178Array1[local20];
							local530.anInt4434 = local530.anInt4434 & 0xFFFFFF | 255 - (this.aByteArray71[local525.anInt3671] & 0xFF) << 24;
						}
					}
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt5537; local16++) {
						local20 = this.aShortArray82[local16] & 0xFFFF;
						local170 = local20 >> 10 & 0x3F;
						local188 = local20 >> 7 & 0x7;
						@Pc(588) int local588 = local20 & 0x7F;
						@Pc(595) int local595 = local170 + arg1 & 0x3F;
						local188 += arg2 / 4;
						local588 += arg3;
						if (local188 < 0) {
							local188 = 0;
						} else if (local188 > 7) {
							local188 = 7;
						}
						if (local588 < 0) {
							local588 = 0;
						} else if (local588 > 127) {
							local588 = 127;
						}
						this.aShortArray82[local16] = (short) (local588 | local595 << 10 | local188 << 7);
					}
					if (this.aClass82_12 != null) {
						this.aClass82_12.anInterface12_2 = null;
					}
					if (this.aClass146Array1 != null) {
						for (local20 = 0; local20 < this.anInt5530; local20++) {
							local525 = this.aClass146Array1[local20];
							local530 = this.aClass178Array1[local20];
							local530.anInt4434 = local530.anInt4434 & 0xFF000000 | Static343.anIntArray359[this.aShortArray82[local525.anInt3671] & 0xFFFF] & 0xFFFFFF;
						}
					}
				} else {
					@Pc(710) Class178 local710;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt5530; local16++) {
							local710 = this.aClass178Array1[local16];
							local710.anInt4435 += arg2;
							local710.anInt4440 += arg1;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt5530; local16++) {
							local710 = this.aClass178Array1[local16];
							local710.anInt4438 = local710.anInt4438 * arg1 >> 7;
							local710.anInt4441 = arg2 * local710.anInt4441 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt5530; local16++) {
							local710 = this.aClass178Array1[local16];
							local710.anInt4439 = arg1 + local710.anInt4439 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ml", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5539; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray398[local15] + this.anIntArray399[local15] * local13 >> 14;
			this.anIntArray398[local15] = this.anIntArray398[local15] * local13 - this.anIntArray399[local15] * local9 >> 14;
			this.anIntArray399[local15] = local34;
		}
		if (this.aClass82_10 != null) {
			this.aClass82_10.anInterface12_2 = null;
		}
		this.aBoolean404 = false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!uha;Lclient!au;I)V")
	@Override
	public void method6206(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5541 == 0) {
			return;
		}
		@Pc(16) Class177_Sub3 local16 = this.aClass95_Sub1_29.aClass177_Sub3_3;
		@Pc(19) Class177_Sub3 local19 = (Class177_Sub3) arg0;
		if (!this.aBoolean404) {
			this.method4756();
		}
		Static267.aFloat72 = local19.aFloat204 * local16.aFloat201 + local19.aFloat195 * local16.aFloat203 + local19.aFloat205 * local16.aFloat204;
		Static415.aFloat120 = local16.aFloat202 + local19.aFloat202 * local16.aFloat201 + local16.aFloat203 * local19.aFloat200 + local16.aFloat204 * local19.aFloat206;
		@Pc(72) float local72 = Static415.aFloat120 + Static267.aFloat72 * (float) this.aShort74;
		@Pc(80) float local80 = Static415.aFloat120 + Static267.aFloat72 * (float) this.aShort73;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.aShort75 + local72;
			local97 = (float) -this.aShort75 + local80;
		} else {
			local90 = (float) this.aShort75 + local80;
			local97 = local72 - (float) this.aShort75;
		}
		if (local97 >= this.aClass95_Sub1_29.aFloat45 || local90 <= (float) this.aClass95_Sub1_29.anInt2526) {
			return;
		}
		Static457.aFloat147 = local19.aFloat202 * local16.aFloat199 + local16.aFloat197 * local19.aFloat200 + local19.aFloat206 * local16.aFloat195 + local16.aFloat200;
		Static298.aFloat89 = local19.aFloat204 * local16.aFloat199 + local19.aFloat195 * local16.aFloat197 + local16.aFloat195 * local19.aFloat205;
		@Pc(173) float local173 = Static298.aFloat89 * (float) this.aShort74 + Static457.aFloat147;
		@Pc(181) float local181 = Static457.aFloat147 + Static298.aFloat89 * (float) this.aShort73;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local181 < local173) {
			local207 = (float) this.aClass95_Sub1_29.anInt2536 * ((float) -this.aShort75 + local181);
			local196 = ((float) this.aShort75 + local173) * (float) this.aClass95_Sub1_29.anInt2536;
		} else {
			local196 = (local181 + (float) this.aShort75) * (float) this.aClass95_Sub1_29.anInt2536;
			local207 = (float) this.aClass95_Sub1_29.anInt2536 * (local173 - (float) this.aShort75);
		}
		if (this.aClass95_Sub1_29.aFloat31 <= local207 / local90 || local196 / local90 <= this.aClass95_Sub1_29.aFloat29) {
			return;
		}
		Static32.aFloat9 = local16.aFloat205 * local19.aFloat205 + local19.aFloat195 * local16.aFloat198 + local19.aFloat204 * local16.aFloat196;
		Static128.aFloat22 = local19.aFloat202 * local16.aFloat196 + local19.aFloat200 * local16.aFloat198 + local16.aFloat205 * local19.aFloat206 + local16.aFloat206;
		@Pc(297) float local297 = Static128.aFloat22 + Static32.aFloat9 * (float) this.aShort74;
		@Pc(305) float local305 = Static32.aFloat9 * (float) this.aShort73 + Static128.aFloat22;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local297 > local305) {
			local320 = (float) this.aClass95_Sub1_29.anInt2533 * ((float) this.aShort75 + local297);
			local332 = (float) this.aClass95_Sub1_29.anInt2533 * ((float) -this.aShort75 + local305);
		} else {
			local320 = (float) this.aClass95_Sub1_29.anInt2533 * ((float) this.aShort75 + local305);
			local332 = (local297 - (float) this.aShort75) * (float) this.aClass95_Sub1_29.anInt2533;
		}
		if (local332 / local90 >= this.aClass95_Sub1_29.aFloat39 || local320 / local90 <= this.aClass95_Sub1_29.aFloat26) {
			return;
		}
		if (arg1 != null || this.aClass146Array1 != null) {
			Static318.aFloat92 = local19.aFloat203 * local16.aFloat196 + local19.aFloat197 * local16.aFloat198 + local19.aFloat198 * local16.aFloat205;
			Static179.aFloat53 = local19.aFloat201 * local16.aFloat196 + local19.aFloat196 * local16.aFloat205 + local16.aFloat198 * local19.aFloat199;
			Static378.aFloat215 = local19.aFloat203 * local16.aFloat199 + local16.aFloat197 * local19.aFloat197 + local19.aFloat198 * local16.aFloat195;
			Static307.aFloat90 = local16.aFloat199 * local19.aFloat201 + local19.aFloat196 * local16.aFloat195 + local16.aFloat197 * local19.aFloat199;
			Static320.aFloat93 = local19.aFloat196 * local16.aFloat204 + local19.aFloat199 * local16.aFloat203 + local16.aFloat201 * local19.aFloat201;
			Static579.aFloat171 = local16.aFloat204 * local19.aFloat198 + local16.aFloat203 * local19.aFloat197 + local19.aFloat203 * local16.aFloat201;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.aShort67 + this.aShort70 >> 1;
			@Pc(509) int local509 = this.aShort68 + this.aShort71 >> 1;
			@Pc(528) int local528 = (int) (Static307.aFloat90 * (float) local509 + Static298.aFloat89 * (float) this.aShort74 + Static378.aFloat215 * (float) local501 + Static457.aFloat147);
			@Pc(547) int local547 = (int) ((float) local509 * Static179.aFloat53 + (float) this.aShort74 * Static32.aFloat9 + (float) local501 * Static318.aFloat92 + Static128.aFloat22);
			@Pc(566) int local566 = (int) ((float) local509 * Static320.aFloat93 + (float) this.aShort74 * Static267.aFloat72 + (float) local501 * Static579.aFloat171 + Static415.aFloat120);
			if (this.aClass95_Sub1_29.anInt2526 <= local566) {
				arg1.anInt604 = this.aClass95_Sub1_29.anInt2543 + local547 * this.aClass95_Sub1_29.anInt2533 / local566;
				arg1.anInt603 = this.aClass95_Sub1_29.anInt2547 + local528 * this.aClass95_Sub1_29.anInt2536 / local566;
			} else {
				local491 = true;
			}
			@Pc(625) int local625 = (int) (Static307.aFloat90 * (float) local509 + Static298.aFloat89 * (float) this.aShort73 + Static378.aFloat215 * (float) local501 + Static457.aFloat147);
			@Pc(644) int local644 = (int) (Static179.aFloat53 * (float) local509 + (float) local501 * Static318.aFloat92 + Static128.aFloat22 + (float) this.aShort73 * Static32.aFloat9);
			@Pc(663) int local663 = (int) (Static320.aFloat93 * (float) local509 + Static415.aFloat120 + (float) local501 * Static579.aFloat171 + (float) this.aShort73 * Static267.aFloat72);
			if (local663 >= this.aClass95_Sub1_29.anInt2526) {
				arg1.anInt605 = this.aClass95_Sub1_29.anInt2547 + this.aClass95_Sub1_29.anInt2536 * local625 / local663;
				arg1.anInt607 = local644 * this.aClass95_Sub1_29.anInt2533 / local663 + this.aClass95_Sub1_29.anInt2543;
			} else {
				local491 = true;
			}
			if (local491) {
				if (this.aClass95_Sub1_29.anInt2526 > local566 && local663 < this.aClass95_Sub1_29.anInt2526) {
					local493 = false;
				} else {
					@Pc(734) int local734;
					@Pc(745) int local745;
					@Pc(757) int local757;
					if (this.aClass95_Sub1_29.anInt2526 > local566) {
						local734 = (local663 - this.aClass95_Sub1_29.anInt2526 << 16) / (local663 - local566);
						local745 = ((local625 - local528) * local734 >> 16) + local625;
						local757 = local644 + ((local644 - local547) * local734 >> 16);
						arg1.anInt603 = this.aClass95_Sub1_29.anInt2547 + this.aClass95_Sub1_29.anInt2536 * local745 / this.aClass95_Sub1_29.anInt2526;
						arg1.anInt604 = this.aClass95_Sub1_29.anInt2543 + local757 * this.aClass95_Sub1_29.anInt2533 / this.aClass95_Sub1_29.anInt2526;
					} else if (this.aClass95_Sub1_29.anInt2526 > local663) {
						local734 = (local566 - this.aClass95_Sub1_29.anInt2526 << 16) / (local566 - local663);
						local745 = local528 + ((local528 - local625) * local734 >> 16);
						local757 = ((local547 - local644) * local734 >> 16) + local547;
						arg1.anInt603 = this.aClass95_Sub1_29.anInt2536 * local745 / this.aClass95_Sub1_29.anInt2526 + this.aClass95_Sub1_29.anInt2547;
						arg1.anInt604 = local757 * this.aClass95_Sub1_29.anInt2533 / this.aClass95_Sub1_29.anInt2526 + this.aClass95_Sub1_29.anInt2543;
					}
				}
			}
			if (local493) {
				if (local663 >= local566) {
					arg1.anInt606 = this.aClass95_Sub1_29.anInt2547 + (local625 - -this.aShort75) * this.aClass95_Sub1_29.anInt2536 / local663 - arg1.anInt605;
				} else {
					arg1.anInt606 = this.aClass95_Sub1_29.anInt2536 * (this.aShort75 + local528) / local566 + this.aClass95_Sub1_29.anInt2547 - arg1.anInt603;
				}
				arg1.aBoolean48 = true;
			}
		}
		this.aClass95_Sub1_29.method2060();
		this.aClass95_Sub1_29.method2076(local19);
		this.method4755();
		this.aClass95_Sub1_29.method2115();
		this.method4748();
	}

	@OriginalMember(owner = "client!ml", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean404) {
			this.method4756();
		}
		return this.aShort67;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BIILclient!uha;IIZ)Z")
	private boolean method4759(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class177 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class177_Sub3 local8 = (Class177_Sub3) arg2;
		@Pc(12) Class177_Sub3 local12 = this.aClass95_Sub1_29.aClass177_Sub3_3;
		@Pc(33) float local33 = local8.aFloat206 * local12.aFloat195 + local12.aFloat197 * local8.aFloat200 + local12.aFloat199 * local8.aFloat202 + local12.aFloat200;
		@Pc(54) float local54 = local12.aFloat206 + local12.aFloat196 * local8.aFloat202 + local12.aFloat198 * local8.aFloat200 + local12.aFloat205 * local8.aFloat206;
		Static579.aFloat171 = local12.aFloat201 * local8.aFloat203 + local8.aFloat197 * local12.aFloat203 + local8.aFloat198 * local12.aFloat204;
		Static307.aFloat90 = local8.aFloat196 * local12.aFloat195 + local12.aFloat197 * local8.aFloat199 + local8.aFloat201 * local12.aFloat199;
		Static267.aFloat72 = local12.aFloat201 * local8.aFloat204 + local8.aFloat195 * local12.aFloat203 + local12.aFloat204 * local8.aFloat205;
		Static318.aFloat92 = local8.aFloat203 * local12.aFloat196 + local8.aFloat197 * local12.aFloat198 + local8.aFloat198 * local12.aFloat205;
		Static320.aFloat93 = local8.aFloat201 * local12.aFloat201 + local12.aFloat204 * local8.aFloat196 + local12.aFloat203 * local8.aFloat199;
		Static378.aFloat215 = local12.aFloat199 * local8.aFloat203 + local8.aFloat198 * local12.aFloat195 + local12.aFloat197 * local8.aFloat197;
		@Pc(183) float local183 = local12.aFloat202 + local8.aFloat202 * local12.aFloat201 + local8.aFloat206 * local12.aFloat204 + local12.aFloat203 * local8.aFloat200;
		Static298.aFloat89 = local8.aFloat204 * local12.aFloat199 + local8.aFloat195 * local12.aFloat197 + local8.aFloat205 * local12.aFloat195;
		Static179.aFloat53 = local12.aFloat198 * local8.aFloat199 + local8.aFloat196 * local12.aFloat205 + local8.aFloat201 * local12.aFloat196;
		Static32.aFloat9 = local12.aFloat196 * local8.aFloat204 + local12.aFloat198 * local8.aFloat195 + local12.aFloat205 * local8.aFloat205;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass95_Sub1_29.anInt2536;
		@Pc(255) int local255 = this.aClass95_Sub1_29.anInt2533;
		if (!this.aBoolean404) {
			this.method4756();
		}
		@Pc(269) int local269 = this.aShort67 - this.aShort70 >> 1;
		@Pc(277) int local277 = this.aShort73 - this.aShort74 >> 1;
		@Pc(286) int local286 = this.aShort71 - this.aShort68 >> 1;
		@Pc(291) int local291 = local269 + this.aShort70;
		@Pc(296) int local296 = local277 + this.aShort74;
		@Pc(301) int local301 = this.aShort68 + local286;
		@Pc(308) int local308 = local291 - (local269 << arg1);
		@Pc(314) int local314 = local296 - (local277 << arg1);
		@Pc(321) int local321 = local301 - (local286 << arg1);
		@Pc(327) int local327 = (local269 << arg1) + local291;
		@Pc(334) int local334 = local296 + (local277 << arg1);
		@Pc(341) int local341 = local301 + (local286 << arg1);
		Static443.anIntArray506[0] = local308;
		Static456.anIntArray536[0] = local314;
		Static623.anIntArray683[0] = local321;
		Static443.anIntArray506[1] = local327;
		Static456.anIntArray536[1] = local314;
		Static623.anIntArray683[1] = local321;
		Static443.anIntArray506[2] = local308;
		Static456.anIntArray536[2] = local334;
		Static443.anIntArray506[3] = local327;
		Static623.anIntArray683[2] = local321;
		Static456.anIntArray536[3] = local334;
		Static443.anIntArray506[4] = local308;
		Static623.anIntArray683[3] = local321;
		Static456.anIntArray536[4] = local314;
		Static623.anIntArray683[4] = local341;
		Static443.anIntArray506[5] = local327;
		Static456.anIntArray536[5] = local314;
		Static443.anIntArray506[6] = local308;
		Static623.anIntArray683[5] = local341;
		Static456.anIntArray536[6] = local334;
		Static623.anIntArray683[6] = local341;
		Static443.anIntArray506[7] = local327;
		Static456.anIntArray536[7] = local334;
		Static623.anIntArray683[7] = local341;
		@Pc(478) float local478;
		@Pc(506) float local506;
		@Pc(492) float local492;
		@Pc(454) float local454;
		@Pc(464) float local464;
		@Pc(459) float local459;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = Static443.anIntArray506[local447];
			local459 = Static623.anIntArray683[local447];
			local464 = Static456.anIntArray536[local447];
			local478 = local464 * Static298.aFloat89 + local454 * Static378.aFloat215 + local459 * Static307.aFloat90 + local33;
			local492 = local183 + Static579.aFloat171 * local454 + local464 * Static267.aFloat72 + Static320.aFloat93 * local459;
			local506 = local459 * Static179.aFloat53 + Static32.aFloat9 * local464 + Static318.aFloat92 * local454 + local54;
			if (local492 >= (float) this.aClass95_Sub1_29.anInt2526) {
				if (arg0 > 0) {
					local492 = arg0;
				}
				@Pc(530) float local530 = (float) local251 * local478 / local492 + (float) this.aClass95_Sub1_29.anInt2547;
				if (local243 < local530) {
					local243 = local530;
				}
				if (local530 < local241) {
					local241 = local530;
				}
				@Pc(554) float local554 = (float) local255 * local506 / local492 + (float) this.aClass95_Sub1_29.anInt2543;
				local239 = true;
				if (local554 < local245) {
					local245 = local554;
				}
				if (local247 < local554) {
					local247 = local554;
				}
			}
		}
		if (local239 && (float) arg4 > local241 && local243 > (float) arg4 && local245 < (float) arg3 && local247 > (float) arg3) {
			if (arg5) {
				return true;
			}
			if (this.aClass95_Sub1_29.anIntArray168.length < this.anInt5541) {
				this.aClass95_Sub1_29.anIntArray167 = new int[this.anInt5541];
				this.aClass95_Sub1_29.anIntArray168 = new int[this.anInt5541];
			}
			@Pc(623) int[] local623 = this.aClass95_Sub1_29.anIntArray168;
			@Pc(627) int[] local627 = this.aClass95_Sub1_29.anIntArray167;
			@Pc(716) int local716;
			for (@Pc(629) int local629 = 0; local629 < this.anInt5539; local629++) {
				local464 = this.anIntArray398[local629];
				local459 = this.anIntArray401[local629];
				local454 = this.anIntArray399[local629];
				local506 = local454 * Static318.aFloat92 + Static32.aFloat9 * local464 + Static179.aFloat53 * local459 + local54;
				local492 = local464 * Static267.aFloat72 + local454 * Static579.aFloat171 + Static320.aFloat93 * local459 + local183;
				local478 = Static298.aFloat89 * local464 + Static378.aFloat215 * local454 + local459 * Static307.aFloat90 + local33;
				@Pc(729) int local729;
				@Pc(734) int local734;
				@Pc(741) int local741;
				if (local492 >= (float) this.aClass95_Sub1_29.anInt2526) {
					if (arg0 > 0) {
						local492 = arg0;
					}
					local716 = (int) ((float) this.aClass95_Sub1_29.anInt2547 + (float) local251 * local478 / local492);
					local729 = (int) ((float) this.aClass95_Sub1_29.anInt2543 + (float) local255 * local506 / local492);
					local734 = this.anIntArray397[local629];
					local741 = this.anIntArray397[local629 + 1];
					for (@Pc(743) int local743 = local734; local743 < local741; local743++) {
						@Pc(752) int local752 = this.aShortArray86[local743] - 1;
						if (local752 == -1) {
							break;
						}
						local623[local752] = local716;
						local627[local752] = local729;
					}
				} else {
					local716 = this.anIntArray397[local629];
					local729 = this.anIntArray397[local629 + 1];
					for (local734 = local716; local734 < local729; local734++) {
						local741 = this.aShortArray86[local734] - 1;
						if (local741 == -1) {
							break;
						}
						local623[this.aShortArray86[local734] - 1] = -999999;
					}
				}
			}
			for (local716 = 0; local716 < this.anInt5537; local716++) {
				if (local623[this.aShortArray84[local716]] != -999999 && local623[this.aShortArray79[local716]] != -999999 && local623[this.aShortArray76[local716]] != -999999 && this.method4747(local623[this.aShortArray84[local716]], local623[this.aShortArray79[local716]], local627[this.aShortArray84[local716]], local627[this.aShortArray76[local716]], arg4, local627[this.aShortArray79[local716]], arg3, local623[this.aShortArray76[local716]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!ml;IIZZLclient!ml;)Lclient!ka;")
	private Class182 method4760(@OriginalArg(0) Class182_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class182_Sub2 arg4) {
		if ((arg1 & 0x100) == 0) {
			arg4.aBoolean403 = this.aBoolean403;
		} else {
			arg4.aBoolean403 = true;
		}
		arg4.aByte86 = 0;
		arg4.anInt5531 = this.anInt5531;
		arg4.aShort72 = this.aShort72;
		arg4.anInt5527 = this.anInt5527;
		arg4.anInt5530 = this.anInt5530;
		arg4.anInt5537 = this.anInt5537;
		arg4.aShort66 = this.aShort66;
		arg4.anInt5536 = arg1;
		arg4.anInt5570 = this.anInt5570;
		arg4.aBoolean402 = this.aBoolean402;
		arg4.anInt5541 = this.anInt5541;
		arg4.anInt5539 = this.anInt5539;
		@Pc(70) boolean local70 = Static199.method2845(this.anInt5527, arg1);
		@Pc(76) boolean local76 = Static471.method6342(arg1, this.anInt5527);
		@Pc(82) boolean local82 = Static4.method97(arg1, this.anInt5527);
		@Pc(88) boolean local88 = local70 | local76 | local82;
		@Pc(207) int local207;
		if (local88) {
			if (!local70) {
				arg4.anIntArray399 = this.anIntArray399;
			} else if (arg0.anIntArray399 == null || this.anInt5531 > arg0.anIntArray399.length) {
				arg4.anIntArray399 = arg0.anIntArray399 = new int[this.anInt5531];
			} else {
				arg4.anIntArray399 = arg0.anIntArray399;
			}
			if (!local76) {
				arg4.anIntArray398 = this.anIntArray398;
			} else if (arg0.anIntArray398 == null || this.anInt5531 > arg0.anIntArray398.length) {
				arg4.anIntArray398 = arg0.anIntArray398 = new int[this.anInt5531];
			} else {
				arg4.anIntArray398 = arg0.anIntArray398;
			}
			if (!local82) {
				arg4.anIntArray401 = this.anIntArray401;
			} else if (arg0.anIntArray401 == null || arg0.anIntArray401.length < this.anInt5531) {
				arg4.anIntArray401 = arg0.anIntArray401 = new int[this.anInt5531];
			} else {
				arg4.anIntArray401 = arg0.anIntArray401;
			}
			for (local207 = 0; local207 < this.anInt5531; local207++) {
				if (local70) {
					arg4.anIntArray399[local207] = this.anIntArray399[local207];
				}
				if (local76) {
					arg4.anIntArray398[local207] = this.anIntArray398[local207];
				}
				if (local82) {
					arg4.anIntArray401[local207] = this.anIntArray401[local207];
				}
			}
		} else {
			arg4.anIntArray401 = this.anIntArray401;
			arg4.anIntArray399 = this.anIntArray399;
			arg4.anIntArray398 = this.anIntArray398;
		}
		if (Static147.method2209(this.anInt5527, arg1)) {
			if (arg2) {
				arg4.aByte86 = (byte) (arg4.aByte86 | 0x1);
			}
			arg4.aClass82_10 = arg0.aClass82_10;
			arg4.aClass82_10.aByte31 = this.aClass82_10.aByte31;
			arg4.aClass82_10.anInterface12_2 = this.aClass82_10.anInterface12_2;
		} else if (Static628.method8428(arg1, this.anInt5527)) {
			arg4.aClass82_10 = this.aClass82_10;
		} else {
			arg4.aClass82_10 = null;
		}
		if (Static437.method5996(this.anInt5527, arg1)) {
			if (arg0.aShortArray82 == null || arg0.aShortArray82.length < this.anInt5537) {
				arg4.aShortArray82 = arg0.aShortArray82 = new short[this.anInt5537];
			} else {
				arg4.aShortArray82 = arg0.aShortArray82;
			}
			for (local207 = 0; local207 < this.anInt5537; local207++) {
				arg4.aShortArray82[local207] = this.aShortArray82[local207];
			}
		} else {
			arg4.aShortArray82 = this.aShortArray82;
		}
		if (Static297.method4098(this.anInt5527, arg1)) {
			if (arg0.aByteArray71 == null || this.anInt5537 > arg0.aByteArray71.length) {
				arg4.aByteArray71 = arg0.aByteArray71 = new byte[this.anInt5537];
			} else {
				arg4.aByteArray71 = arg0.aByteArray71;
			}
			for (local207 = 0; local207 < this.anInt5537; local207++) {
				arg4.aByteArray71[local207] = this.aByteArray71[local207];
			}
		} else {
			arg4.aByteArray71 = this.aByteArray71;
		}
		if (Static293.method4047(this.anInt5527, arg1)) {
			if (arg2) {
				arg4.aByte86 = (byte) (arg4.aByte86 | 0x2);
			}
			arg4.aClass82_12 = arg0.aClass82_12;
			arg4.aClass82_12.aByte31 = this.aClass82_12.aByte31;
			arg4.aClass82_12.anInterface12_2 = this.aClass82_12.anInterface12_2;
		} else if (Static311.method4221(arg1, this.anInt5527)) {
			arg4.aClass82_12 = this.aClass82_12;
		} else {
			arg4.aClass82_12 = null;
		}
		@Pc(575) int local575;
		if (Static134.method1848(arg1, this.anInt5527)) {
			if (arg0.aShortArray83 == null || this.anInt5541 > arg0.aShortArray83.length) {
				local207 = this.anInt5541;
				arg4.aShortArray77 = arg0.aShortArray77 = new short[local207];
				arg4.aShortArray78 = arg0.aShortArray78 = new short[local207];
				arg4.aShortArray83 = arg0.aShortArray83 = new short[local207];
			} else {
				arg4.aShortArray77 = arg0.aShortArray77;
				arg4.aShortArray78 = arg0.aShortArray78;
				arg4.aShortArray83 = arg0.aShortArray83;
			}
			if (this.aClass58_1 == null) {
				for (local207 = 0; local207 < this.anInt5541; local207++) {
					arg4.aShortArray83[local207] = this.aShortArray83[local207];
					arg4.aShortArray78[local207] = this.aShortArray78[local207];
					arg4.aShortArray77[local207] = this.aShortArray77[local207];
				}
			} else {
				if (arg0.aClass58_1 == null) {
					arg0.aClass58_1 = new Class58();
				}
				@Pc(563) Class58 local563 = arg4.aClass58_1 = arg0.aClass58_1;
				if (local563.aShortArray23 == null || this.anInt5541 > local563.aShortArray23.length) {
					local575 = this.anInt5541;
					local563.aByteArray15 = new byte[local575];
					local563.aShortArray22 = new short[local575];
					local563.aShortArray24 = new short[local575];
					local563.aShortArray23 = new short[local575];
				}
				for (local575 = 0; local575 < this.anInt5541; local575++) {
					arg4.aShortArray83[local575] = this.aShortArray83[local575];
					arg4.aShortArray78[local575] = this.aShortArray78[local575];
					arg4.aShortArray77[local575] = this.aShortArray77[local575];
					local563.aShortArray23[local575] = this.aClass58_1.aShortArray23[local575];
					local563.aShortArray22[local575] = this.aClass58_1.aShortArray22[local575];
					local563.aShortArray24[local575] = this.aClass58_1.aShortArray24[local575];
					local563.aByteArray15[local575] = this.aClass58_1.aByteArray15[local575];
				}
			}
			arg4.aByteArray70 = this.aByteArray70;
		} else {
			arg4.aShortArray83 = this.aShortArray83;
			arg4.aClass58_1 = this.aClass58_1;
			arg4.aShortArray78 = this.aShortArray78;
			arg4.aByteArray70 = this.aByteArray70;
			arg4.aShortArray77 = this.aShortArray77;
		}
		if (Static213.method2959(arg1, this.anInt5527)) {
			if (arg2) {
				arg4.aByte86 = (byte) (arg4.aByte86 | 0x4);
			}
			arg4.aClass82_13 = arg0.aClass82_13;
			arg4.aClass82_13.anInterface12_2 = this.aClass82_13.anInterface12_2;
			arg4.aClass82_13.aByte31 = this.aClass82_13.aByte31;
		} else if (Static437.method5993(arg1, this.anInt5527)) {
			arg4.aClass82_13 = this.aClass82_13;
		} else {
			arg4.aClass82_13 = null;
		}
		if (Static528.method7294(arg1, this.anInt5527)) {
			if (arg0.aFloatArray24 == null || arg0.aFloatArray24.length < this.anInt5537) {
				local207 = this.anInt5541;
				arg4.aFloatArray23 = arg0.aFloatArray23 = new float[local207];
				arg4.aFloatArray24 = arg0.aFloatArray24 = new float[local207];
			} else {
				arg4.aFloatArray24 = arg0.aFloatArray24;
				arg4.aFloatArray23 = arg0.aFloatArray23;
			}
			for (local207 = 0; local207 < this.anInt5541; local207++) {
				arg4.aFloatArray24[local207] = this.aFloatArray24[local207];
				arg4.aFloatArray23[local207] = this.aFloatArray23[local207];
			}
		} else {
			arg4.aFloatArray24 = this.aFloatArray24;
			arg4.aFloatArray23 = this.aFloatArray23;
		}
		if (Static51.method829(arg1, this.anInt5527)) {
			if (arg2) {
				arg4.aByte86 = (byte) (arg4.aByte86 | 0x8);
			}
			arg4.aClass82_11 = arg0.aClass82_11;
			arg4.aClass82_11.aByte31 = this.aClass82_11.aByte31;
			arg4.aClass82_11.anInterface12_2 = this.aClass82_11.anInterface12_2;
		} else if (Static201.method2851(this.anInt5527, arg1)) {
			arg4.aClass82_11 = this.aClass82_11;
		} else {
			arg4.aClass82_11 = null;
		}
		if (Static515.method7209(this.anInt5527, arg1)) {
			if (arg0.aShortArray84 == null || this.anInt5537 > arg0.aShortArray84.length) {
				local207 = this.anInt5537;
				arg4.aShortArray84 = arg0.aShortArray84 = new short[local207];
				arg4.aShortArray76 = arg0.aShortArray76 = new short[local207];
				arg4.aShortArray79 = arg0.aShortArray79 = new short[local207];
			} else {
				arg4.aShortArray76 = arg0.aShortArray76;
				arg4.aShortArray79 = arg0.aShortArray79;
				arg4.aShortArray84 = arg0.aShortArray84;
			}
			for (local207 = 0; local207 < this.anInt5537; local207++) {
				arg4.aShortArray84[local207] = this.aShortArray84[local207];
				arg4.aShortArray79[local207] = this.aShortArray79[local207];
				arg4.aShortArray76[local207] = this.aShortArray76[local207];
			}
		} else {
			arg4.aShortArray84 = this.aShortArray84;
			arg4.aShortArray79 = this.aShortArray79;
			arg4.aShortArray76 = this.aShortArray76;
		}
		if (Static639.method8588(this.anInt5527, arg1)) {
			if (arg2) {
				arg4.aByte86 = (byte) (arg4.aByte86 | 0x10);
			}
			arg4.aClass286_1 = arg0.aClass286_1;
			arg4.aClass286_1.anInterface26_4 = this.aClass286_1.anInterface26_4;
		} else if (Static389.method5231(arg1, this.anInt5527)) {
			arg4.aClass286_1 = this.aClass286_1;
		} else {
			arg4.aClass286_1 = null;
		}
		if (Static482.method6499(arg1, this.anInt5527)) {
			if (arg0.aShortArray87 == null || arg0.aShortArray87.length < this.anInt5537) {
				local207 = this.anInt5537;
				arg4.aShortArray87 = arg0.aShortArray87 = new short[local207];
			} else {
				arg4.aShortArray87 = arg0.aShortArray87;
			}
			for (local207 = 0; local207 < this.anInt5537; local207++) {
				arg4.aShortArray87[local207] = this.aShortArray87[local207];
			}
		} else {
			arg4.aShortArray87 = this.aShortArray87;
		}
		if (!Static558.method7643(arg1, this.anInt5527)) {
			arg4.aClass178Array1 = this.aClass178Array1;
		} else if (arg0.aClass178Array1 == null || arg0.aClass178Array1.length < this.anInt5530) {
			local207 = this.anInt5530;
			arg4.aClass178Array1 = arg0.aClass178Array1 = new Class178[local207];
			for (local575 = 0; local575 < this.anInt5530; local575++) {
				arg4.aClass178Array1[local575] = this.aClass178Array1[local575].method3849();
			}
		} else {
			arg4.aClass178Array1 = arg0.aClass178Array1;
			for (local207 = 0; local207 < this.anInt5530; local207++) {
				arg4.aClass178Array1[local207].method3850(this.aClass178Array1[local207]);
			}
		}
		arg4.aClass146Array1 = this.aClass146Array1;
		arg4.aClass143Array4 = this.aClass143Array4;
		arg4.anIntArrayArray33 = this.anIntArrayArray33;
		arg4.anIntArrayArray34 = this.anIntArrayArray34;
		arg4.aShortArray81 = this.aShortArray81;
		if (this.aBoolean404) {
			arg4.aShort70 = this.aShort70;
			arg4.aShort67 = this.aShort67;
			arg4.aShort71 = this.aShort71;
			arg4.aShort69 = this.aShort69;
			arg4.aBoolean404 = true;
			arg4.aShort68 = this.aShort68;
			arg4.aShort73 = this.aShort73;
			arg4.aShort75 = this.aShort75;
			arg4.aShort74 = this.aShort74;
		} else {
			arg4.aBoolean404 = false;
		}
		arg4.aShortArray86 = this.aShortArray86;
		arg4.anIntArray397 = this.anIntArray397;
		arg4.anIntArray400 = this.anIntArray400;
		arg4.aShortArray85 = this.aShortArray85;
		arg4.anIntArrayArray35 = this.anIntArrayArray35;
		arg4.aClass255Array4 = this.aClass255Array4;
		return arg4;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method6197(@OriginalArg(0) Class177 arg0) {
		@Pc(8) Class177_Sub3 local8 = (Class177_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass143Array4 != null) {
			for (local13 = 0; local13 < this.aClass143Array4.length; local13++) {
				@Pc(20) Class143 local20 = this.aClass143Array4[local13];
				@Pc(22) Class143 local22 = local20;
				if (local20.aClass143_1 != null) {
					local22 = local20.aClass143_1;
				}
				local22.anInt3602 = (int) (local8.aFloat199 * (float) this.anIntArray401[local20.anInt3607] + (float) this.anIntArray398[local20.anInt3607] * local8.aFloat195 + (float) this.anIntArray399[local20.anInt3607] * local8.aFloat197 + local8.aFloat200);
				local22.anInt3596 = (int) (local8.aFloat206 + (float) this.anIntArray401[local20.anInt3607] * local8.aFloat196 + (float) this.anIntArray398[local20.anInt3607] * local8.aFloat205 + local8.aFloat198 * (float) this.anIntArray399[local20.anInt3607]);
				local22.anInt3600 = (int) (local8.aFloat204 * (float) this.anIntArray398[local20.anInt3607] + local8.aFloat203 * (float) this.anIntArray399[local20.anInt3607] + (float) this.anIntArray401[local20.anInt3607] * local8.aFloat201 + local8.aFloat202);
				local22.anInt3603 = (int) (local8.aFloat200 + (float) this.anIntArray401[local20.anInt3594] * local8.aFloat199 + (float) this.anIntArray399[local20.anInt3594] * local8.aFloat197 + (float) this.anIntArray398[local20.anInt3594] * local8.aFloat195);
				local22.anInt3606 = (int) ((float) this.anIntArray401[local20.anInt3594] * local8.aFloat196 + (float) this.anIntArray399[local20.anInt3594] * local8.aFloat198 + local8.aFloat205 * (float) this.anIntArray398[local20.anInt3594] + local8.aFloat206);
				local22.anInt3610 = (int) ((float) this.anIntArray399[local20.anInt3594] * local8.aFloat203 + local8.aFloat204 * (float) this.anIntArray398[local20.anInt3594] + local8.aFloat201 * (float) this.anIntArray401[local20.anInt3594] + local8.aFloat202);
				local22.anInt3601 = (int) (local8.aFloat200 + local8.aFloat199 * (float) this.anIntArray401[local20.anInt3598] + local8.aFloat197 * (float) this.anIntArray399[local20.anInt3598] + (float) this.anIntArray398[local20.anInt3598] * local8.aFloat195);
				local22.anInt3604 = (int) ((float) this.anIntArray399[local20.anInt3598] * local8.aFloat198 + local8.aFloat205 * (float) this.anIntArray398[local20.anInt3598] + local8.aFloat196 * (float) this.anIntArray401[local20.anInt3598] + local8.aFloat206);
				local22.anInt3608 = (int) (local8.aFloat202 + (float) this.anIntArray398[local20.anInt3598] * local8.aFloat204 + (float) this.anIntArray399[local20.anInt3598] * local8.aFloat203 + (float) this.anIntArray401[local20.anInt3598] * local8.aFloat201);
			}
		}
		if (this.aClass255Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass255Array4.length; local13++) {
			@Pc(361) Class255 local361 = this.aClass255Array4[local13];
			@Pc(363) Class255 local363 = local361;
			if (local361.aClass255_2 != null) {
				local363 = local361.aClass255_2;
			}
			if (local361.aClass177_8 == null) {
				local361.aClass177_8 = local8.method7868();
			} else {
				local361.aClass177_8.method7879(local8);
			}
			local363.anInt6389 = (int) (local8.aFloat200 + (float) this.anIntArray401[local361.anInt6388] * local8.aFloat199 + local8.aFloat195 * (float) this.anIntArray398[local361.anInt6388] + local8.aFloat197 * (float) this.anIntArray399[local361.anInt6388]);
			local363.anInt6390 = (int) (local8.aFloat196 * (float) this.anIntArray401[local361.anInt6388] + (float) this.anIntArray399[local361.anInt6388] * local8.aFloat198 + (float) this.anIntArray398[local361.anInt6388] * local8.aFloat205 + local8.aFloat206);
			local363.anInt6392 = (int) ((float) this.anIntArray399[local361.anInt6388] * local8.aFloat203 + local8.aFloat204 * (float) this.anIntArray398[local361.anInt6388] + (float) this.anIntArray401[local361.anInt6388] * local8.aFloat201 + local8.aFloat202);
		}
	}
}
