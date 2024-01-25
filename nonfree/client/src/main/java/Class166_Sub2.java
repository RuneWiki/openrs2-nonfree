import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class166_Sub2 extends Class166 {

	@OriginalMember(owner = "client!nca", name = "o", descriptor = "I")
	private int anInt7210;

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "Z")
	private boolean aBoolean528;

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
	private int anInt7221;

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "Lclient!wga;")
	private final Class20_Sub2 aClass20_Sub2_17;

	@OriginalMember(owner = "client!nca", name = "L", descriptor = "Lclient!cd;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!nca", name = "eb", descriptor = "I")
	private int anInt7234;

	@OriginalMember(owner = "client!nca", name = "vb", descriptor = "Lclient!cd;")
	private Class51 aClass51_2;

	@OriginalMember(owner = "client!nca", name = "wb", descriptor = "I")
	private int anInt7247;

	@OriginalMember(owner = "client!nca", name = "xb", descriptor = "Z")
	private boolean aBoolean530;

	@OriginalMember(owner = "client!nca", name = "yb", descriptor = "I")
	private int anInt7248;

	@OriginalMember(owner = "client!nca", name = "Cb", descriptor = "I")
	private int anInt7252;

	@OriginalMember(owner = "client!nca", name = "Hb", descriptor = "I")
	private int anInt7256;

	@OriginalMember(owner = "client!nca", name = "Kb", descriptor = "I")
	private int anInt7257;

	@OriginalMember(owner = "client!nca", name = "Mb", descriptor = "Z")
	private boolean aBoolean531;

	@OriginalMember(owner = "client!nca", name = "Rb", descriptor = "Lclient!cd;")
	private Class51 aClass51_3;

	@OriginalMember(owner = "client!nca", name = "Ub", descriptor = "Lclient!qq;")
	private Class282 aClass282_1;

	@OriginalMember(owner = "client!nca", name = "mc", descriptor = "Lclient!ok;")
	private Class246 aClass246_1;

	@OriginalMember(owner = "client!nca", name = "qc", descriptor = "I")
	private int anInt7276;

	@OriginalMember(owner = "client!nca", name = "sc", descriptor = "I")
	private int anInt7277;

	@OriginalMember(owner = "client!nca", name = "tc", descriptor = "I")
	private int anInt7278;

	@OriginalMember(owner = "client!nca", name = "Dc", descriptor = "Lclient!cd;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!nca", name = "qb", descriptor = "[I")
	private int[] anIntArray459;

	@OriginalMember(owner = "client!nca", name = "Nb", descriptor = "I")
	private int anInt7258;

	@OriginalMember(owner = "client!nca", name = "zc", descriptor = "I")
	private int anInt7281;

	@OriginalMember(owner = "client!nca", name = "P", descriptor = "Z")
	private boolean aBoolean529;

	@OriginalMember(owner = "client!nca", name = "lc", descriptor = "Z")
	private boolean aBoolean532;

	@OriginalMember(owner = "client!nca", name = "gc", descriptor = "I")
	private int anInt7270;

	@OriginalMember(owner = "client!nca", name = "Q", descriptor = "[I")
	private int[] anIntArray458;

	@OriginalMember(owner = "client!nca", name = "Cc", descriptor = "[I")
	private int[] anIntArray462;

	@OriginalMember(owner = "client!nca", name = "dc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!nca", name = "U", descriptor = "I")
	private int anInt7228;

	@OriginalMember(owner = "client!nca", name = "uc", descriptor = "[I")
	private int[] anIntArray461;

	@OriginalMember(owner = "client!nca", name = "Jb", descriptor = "[Lclient!eca;")
	private Class87[] aClass87Array4;

	@OriginalMember(owner = "client!nca", name = "sb", descriptor = "[Lclient!nn;")
	private Class227[] aClass227Array4;

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
	private int anInt7213;

	@OriginalMember(owner = "client!nca", name = "Hc", descriptor = "[Lclient!en;")
	private Class96[] aClass96Array1;

	@OriginalMember(owner = "client!nca", name = "db", descriptor = "[Lclient!dk;")
	private Class77[] aClass77Array1;

	@OriginalMember(owner = "client!nca", name = "ab", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!nca", name = "rc", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!nca", name = "K", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!nca", name = "pc", descriptor = "[F")
	private float[] aFloatArray62;

	@OriginalMember(owner = "client!nca", name = "X", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!nca", name = "Vb", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!nca", name = "ic", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!nca", name = "vc", descriptor = "[S")
	private short[] aShortArray90;

	@OriginalMember(owner = "client!nca", name = "cc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!nca", name = "T", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!nca", name = "Fb", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!nca", name = "D", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!nca", name = "ec", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!nca", name = "nb", descriptor = "S")
	private short aShort80;

	@OriginalMember(owner = "client!nca", name = "yc", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!nca", name = "Lb", descriptor = "[F")
	private float[] aFloatArray61;

	@OriginalMember(owner = "client!nca", name = "O", descriptor = "S")
	private short aShort79;

	@OriginalMember(owner = "client!nca", name = "Z", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "[I")
	private int[] anIntArray457;

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "[I")
	private int[] anIntArray456;

	@OriginalMember(owner = "client!nca", name = "Ib", descriptor = "[I")
	private int[] anIntArray460;

	@OriginalMember(owner = "client!nca", name = "A", descriptor = "[[I")
	private int[][] anIntArrayArray38;

	@OriginalMember(owner = "client!nca", name = "z", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!nca", name = "bc", descriptor = "[[I")
	private int[][] anIntArrayArray39;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!wga;Lclient!bh;IIII)V")
	public Class166_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) Class32 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_12;
		@Pc(15) int[] local15 = new int[arg1.anInt1670];
		this.anIntArray459 = new int[arg1.anInt1673 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt1670; local24++) {
			if (arg1.aByteArray25 == null || arg1.aByteArray25[local24] != 2) {
				if (arg1.aShortArray11 != null && arg1.aShortArray11[local24] != -1) {
					@Pc(56) Class127 local56 = local11.method8048(arg1.aShortArray11[local24] & 0xFFFF);
					if (((this.anInt7256 & 0x40) == 0 || !local56.aBoolean338) && local56.aBoolean336) {
						continue;
					}
				}
				local15[this.anInt7258++] = local24;
				this.anIntArray459[arg1.aShortArray20[local24]]++;
				this.anIntArray459[arg1.aShortArray14[local24]]++;
				this.anIntArray459[arg1.aShortArray17[local24]]++;
			}
		}
		this.anInt7281 = this.anInt7258;
		@Pc(125) long[] local125 = new long[this.anInt7258];
		@Pc(137) boolean local137 = (this.anInt7248 & 0x100) != 0;
		@Pc(149) int local149;
		@Pc(162) int local162;
		@Pc(322) int local322;
		for (@Pc(139) int local139 = 0; local139 < this.anInt7258; local139++) {
			@Pc(145) int local145 = local15[local139];
			@Pc(147) Class127 local147 = null;
			local149 = 0;
			@Pc(151) byte local151 = 0;
			@Pc(153) byte local153 = 0;
			@Pc(155) byte local155 = 0;
			if (arg1.aClass256Array1 != null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < arg1.aClass256Array1.length; local162++) {
					@Pc(169) Class256 local169 = arg1.aClass256Array1[local162];
					if (local169.anInt7920 == local145) {
						@Pc(178) Class280 local178 = Static298.method5320(local169.anInt7918);
						if (local178.aBoolean606) {
							local160 = true;
						}
						if (local178.anInt8471 != -1) {
							@Pc(194) Class127 local194 = local11.method8048(local178.anInt8471);
							if (local194.anInt4659 == 2) {
								this.aBoolean529 = true;
							}
						}
					}
				}
				if (local160) {
					local125[local139] = Long.MAX_VALUE;
					this.anInt7281--;
					continue;
				}
			}
			@Pc(223) short local223 = -1;
			if (arg1.aShortArray11 != null) {
				local223 = arg1.aShortArray11[local145];
				if (local223 != -1) {
					local147 = local11.method8048(local223 & 0xFFFF);
					if ((this.anInt7256 & 0x40) != 0 && local147.aBoolean338) {
						local223 = -1;
						local147 = null;
					} else {
						local155 = local147.aByte75;
						local153 = local147.aByte78;
					}
				}
			}
			@Pc(284) boolean local284 = arg1.aByteArray23 != null && arg1.aByteArray23[local145] != 0 || local147 != null && local147.anInt4659 != 0;
			if ((local137 || local284) && arg1.aByteArray24 != null) {
				local149 += arg1.aByteArray24[local145] << 17;
			}
			if (local284) {
				local149 += 65536;
			}
			local149 += (local153 & 0xFF) << 8;
			local322 = local151 + ((local223 & 0xFFFF) << 16);
			local149 += local155 & 0xFF;
			@Pc(334) int local334 = local322 + (local139 & 0xFFFF);
			local125[local139] = ((long) local149 << 32) + (long) local334;
			this.aBoolean532 |= local147 != null && (local147.aByte73 != 0 || local147.aByte77 != 0);
			this.aBoolean529 |= local284;
		}
		Static240.method4485(local15, local125);
		this.anInt7270 = arg1.anInt1679;
		this.anIntArray458 = arg1.anIntArray67;
		this.anIntArray462 = arg1.anIntArray66;
		this.aShortArray87 = arg1.aShortArray15;
		this.anInt7228 = arg1.anInt1673;
		this.anIntArray461 = arg1.anIntArray64;
		this.aClass87Array4 = arg1.aClass87Array1;
		@Pc(414) Class112[] local414 = new Class112[this.anInt7228];
		this.aClass227Array4 = arg1.aClass227Array1;
		@Pc(438) int local438;
		@Pc(452) int local452;
		@Pc(491) int local491;
		if (arg1.aClass256Array1 != null) {
			this.anInt7213 = arg1.aClass256Array1.length;
			this.aClass96Array1 = new Class96[this.anInt7213];
			this.aClass77Array1 = new Class77[this.anInt7213];
			for (local438 = 0; local438 < this.anInt7213; local438++) {
				@Pc(445) Class256 local445 = arg1.aClass256Array1[local438];
				@Pc(450) Class280 local450 = Static298.method5320(local445.anInt7918);
				local452 = -1;
				for (@Pc(454) int local454 = 0; local454 < this.anInt7258; local454++) {
					if (local445.anInt7920 == local15[local454]) {
						local452 = local454;
						break;
					}
				}
				if (local452 == -1) {
					throw new RuntimeException();
				}
				local491 = Static195.anIntArray226[arg1.aShortArray19[local445.anInt7920] & 0xFFFF] & 0xFFFFFF;
				@Pc(509) int local509 = local491 | 255 - (arg1.aByteArray23 == null ? 0 : arg1.aByteArray23[local445.anInt7920]) << 24;
				this.aClass96Array1[local438] = new Class96(local452, arg1.aShortArray20[local445.anInt7920], arg1.aShortArray14[local445.anInt7920], arg1.aShortArray17[local445.anInt7920], local450.anInt8472, local450.anInt8474, local450.anInt8471, local450.anInt8476, local450.anInt8477, local450.aBoolean606, local450.aBoolean605, local445.anInt7922);
				this.aClass77Array1[local438] = new Class77(local509);
			}
		}
		local438 = this.anInt7258 * 3;
		this.aShortArray83 = new short[local438];
		this.aShortArray89 = new short[this.anInt7258];
		this.aShortArray79 = new short[this.anInt7258];
		this.aFloatArray62 = new float[local438];
		this.aShortArray81 = new short[local438];
		this.aShortArray85 = new short[this.anInt7258];
		this.aByteArray94 = new byte[local438];
		this.aShortArray90 = new short[this.anInt7258];
		this.aShortArray86 = new short[local438];
		if (arg1.aShortArray18 != null) {
			this.aShortArray80 = new short[this.anInt7258];
		}
		this.aShortArray84 = new short[local438];
		this.aShortArray78 = new short[local438];
		Static146.aLongArray7 = new long[local438];
		this.aShortArray88 = new short[this.anInt7258];
		this.aShort80 = (short) arg3;
		this.aByteArray95 = new byte[this.anInt7258];
		this.aFloatArray61 = new float[local438];
		this.aShort79 = (short) arg4;
		this.aShortArray82 = new short[local438];
		local149 = 0;
		for (local322 = 0; local322 < arg1.anInt1673; local322++) {
			local452 = this.anIntArray459[local322];
			this.anIntArray459[local322] = local149;
			local149 += local452;
			local414[local322] = new Class112();
		}
		this.anIntArray459[arg1.anInt1673] = local149;
		@Pc(703) Class101 local703 = Static100.method2646(this.anInt7258, arg1, local15);
		@Pc(707) Class172[] local707 = new Class172[arg1.anInt1670];
		@Pc(747) int local747;
		@Pc(757) int local757;
		@Pc(768) int local768;
		@Pc(726) short local726;
		@Pc(736) int local736;
		for (local491 = 0; local491 < arg1.anInt1670; local491++) {
			@Pc(716) short local716 = arg1.aShortArray20[local491];
			@Pc(721) short local721 = arg1.aShortArray14[local491];
			local726 = arg1.aShortArray17[local491];
			local736 = this.anIntArray461[local721] - this.anIntArray461[local716];
			local747 = this.anIntArray462[local721] - this.anIntArray462[local716];
			local757 = this.anIntArray458[local721] - this.anIntArray458[local716];
			local768 = this.anIntArray461[local726] - this.anIntArray461[local716];
			@Pc(779) int local779 = this.anIntArray462[local726] - this.anIntArray462[local716];
			@Pc(790) int local790 = this.anIntArray458[local726] - this.anIntArray458[local716];
			@Pc(799) int local799 = local747 * local790 - local779 * local757;
			@Pc(808) int local808 = local757 * local768 - local736 * local790;
			@Pc(816) int local816;
			for (local816 = local736 * local779 - local768 * local747; local799 > 8192 || local808 > 8192 || local816 > 8192 || local799 < -8192 || local808 < -8192 || local816 < -8192; local816 >>= 0x1) {
				local808 >>= 0x1;
				local799 >>= 0x1;
			}
			@Pc(870) int local870 = (int) Math.sqrt((double) (local808 * local808 + local799 * local799 + local816 * local816));
			if (local870 <= 0) {
				local870 = 1;
			}
			local816 = local816 * 256 / local870;
			local808 = local808 * 256 / local870;
			local799 = local799 * 256 / local870;
			@Pc(905) byte local905 = arg1.aByteArray25 == null ? 0 : arg1.aByteArray25[local491];
			if (local905 == 0) {
				@Pc(936) Class112 local936 = local414[local716];
				local936.anInt4020++;
				local936.anInt4023 += local808;
				local936.anInt4018 += local799;
				local936.anInt4022 += local816;
				@Pc(964) Class112 local964 = local414[local721];
				local964.anInt4018 += local799;
				local964.anInt4020++;
				local964.anInt4023 += local808;
				local964.anInt4022 += local816;
				@Pc(992) Class112 local992 = local414[local726];
				local992.anInt4020++;
				local992.anInt4018 += local799;
				local992.anInt4023 += local808;
				local992.anInt4022 += local816;
			} else if (local905 == 1) {
				@Pc(921) Class172 local921 = local707[local491] = new Class172();
				local921.anInt5906 = local799;
				local921.anInt5907 = local808;
				local921.anInt5909 = local816;
			}
		}
		@Pc(1033) int local1033;
		@Pc(1076) short local1076;
		for (local162 = 0; local162 < this.anInt7258; local162++) {
			local1033 = local15[local162];
			@Pc(1040) int local1040 = arg1.aShortArray19[local1033] & 0xFFFF;
			if (arg1.aByteArray20 == null) {
				local736 = -1;
			} else {
				local736 = arg1.aByteArray20[local1033];
			}
			if (arg1.aByteArray23 == null) {
				local747 = 0;
			} else {
				local747 = arg1.aByteArray23[local1033] & 0xFF;
			}
			local1076 = arg1.aShortArray11 == null ? -1 : arg1.aShortArray11[local1033];
			if (local1076 != -1 && (this.anInt7256 & 0x40) != 0) {
				@Pc(1095) Class127 local1095 = local11.method8048(local1076 & 0xFFFF);
				if (local1095.aBoolean338) {
					local1076 = -1;
				}
			}
			@Pc(1102) float local1102 = 0.0F;
			@Pc(1104) float local1104 = 0.0F;
			@Pc(1106) float local1106 = 0.0F;
			@Pc(1108) float local1108 = 0.0F;
			@Pc(1110) float local1110 = 0.0F;
			@Pc(1112) float local1112 = 0.0F;
			@Pc(1114) byte local1114 = 0;
			@Pc(1116) byte local1116 = 0;
			@Pc(1118) int local1118 = 0;
			@Pc(1133) byte local1133;
			@Pc(1153) short local1153;
			@Pc(1952) short local1952;
			@Pc(1957) short local1957;
			if (local1076 != -1) {
				if (local736 == -1) {
					local1106 = 1.0F;
					local1112 = 0.0F;
					local1114 = 1;
					local1116 = 2;
					local1110 = 0.0F;
					local1102 = 0.0F;
					local1108 = 1.0F;
					local1104 = 1.0F;
				} else {
					local736 &= 0xFF;
					local1133 = arg1.aByteArray21[local736];
					@Pc(1143) short local1143;
					@Pc(1148) short local1148;
					@Pc(1186) float local1186;
					@Pc(1200) float local1200;
					@Pc(1208) float local1208;
					@Pc(1308) float local1308;
					@Pc(1316) float local1316;
					@Pc(1324) float local1324;
					@Pc(1347) float local1347;
					@Pc(1370) float local1370;
					@Pc(1393) float local1393;
					if (local1133 == 0) {
						local1143 = arg1.aShortArray20[local1033];
						local1148 = arg1.aShortArray14[local1033];
						local1153 = arg1.aShortArray17[local1033];
						local1952 = arg1.aShortArray13[local736];
						local1957 = arg1.aShortArray16[local736];
						@Pc(1962) short local1962 = arg1.aShortArray12[local736];
						@Pc(1968) float local1968 = (float) arg1.anIntArray64[local1952];
						@Pc(1974) float local1974 = (float) arg1.anIntArray66[local1952];
						local1186 = arg1.anIntArray67[local1952];
						local1200 = (float) arg1.anIntArray64[local1957] - local1968;
						local1208 = (float) arg1.anIntArray66[local1957] - local1974;
						@Pc(2006) float local2006 = (float) arg1.anIntArray67[local1957] - local1186;
						@Pc(2015) float local2015 = (float) arg1.anIntArray64[local1962] - local1968;
						@Pc(2023) float local2023 = (float) arg1.anIntArray66[local1962] - local1974;
						@Pc(2032) float local2032 = (float) arg1.anIntArray67[local1962] - local1186;
						@Pc(2041) float local2041 = (float) arg1.anIntArray64[local1143] - local1968;
						@Pc(2049) float local2049 = (float) arg1.anIntArray66[local1143] - local1974;
						@Pc(2058) float local2058 = (float) arg1.anIntArray67[local1143] - local1186;
						@Pc(2067) float local2067 = (float) arg1.anIntArray64[local1148] - local1968;
						@Pc(2075) float local2075 = (float) arg1.anIntArray66[local1148] - local1974;
						local1308 = (float) arg1.anIntArray67[local1148] - local1186;
						local1316 = (float) arg1.anIntArray64[local1153] - local1968;
						local1324 = (float) arg1.anIntArray66[local1153] - local1974;
						local1347 = (float) arg1.anIntArray67[local1153] - local1186;
						local1370 = local1208 * local2032 - local2023 * local2006;
						local1393 = local2015 * local2006 - local1200 * local2032;
						@Pc(2134) float local2134 = local2023 * local1200 - local2015 * local1208;
						@Pc(2143) float local2143 = local2134 * local2023 - local1393 * local2032;
						@Pc(2152) float local2152 = local1370 * local2032 - local2134 * local2015;
						@Pc(2161) float local2161 = local1393 * local2015 - local1370 * local2023;
						@Pc(2175) float local2175 = 1.0F / (local2152 * local1208 + local2143 * local1200 + local2006 * local2161);
						local1102 = local2175 * (local2161 * local2058 + local2143 * local2041 + local2152 * local2049);
						local1110 = (local2161 * local1347 + local2143 * local1316 + local1324 * local2152) * local2175;
						local1106 = local2175 * (local1308 * local2161 + local2152 * local2075 + local2143 * local2067);
						@Pc(2225) float local2225 = local2134 * local1208 - local1393 * local2006;
						@Pc(2234) float local2234 = local2006 * local1370 - local1200 * local2134;
						@Pc(2243) float local2243 = local1393 * local1200 - local1370 * local1208;
						@Pc(2257) float local2257 = 1.0F / (local2225 * local2015 + local2023 * local2234 + local2032 * local2243);
						local1108 = (local2067 * local2225 + local2075 * local2234 + local2243 * local1308) * local2257;
						local1112 = (local2225 * local1316 + local2234 * local1324 + local2243 * local1347) * local2257;
						local1104 = local2257 * (local2058 * local2243 + local2049 * local2234 + local2041 * local2225);
					} else {
						local1143 = arg1.aShortArray20[local1033];
						local1148 = arg1.aShortArray14[local1033];
						local1153 = arg1.aShortArray17[local1033];
						@Pc(1158) int local1158 = local703.anIntArray170[local736];
						@Pc(1163) int local1163 = local703.anIntArray169[local736];
						@Pc(1168) int local1168 = local703.anIntArray168[local736];
						@Pc(1173) float[] local1173 = local703.aFloatArrayArray6[local736];
						@Pc(1178) byte local1178 = arg1.aByteArray26[local736];
						local1186 = (float) arg1.anIntArray71[local736] / 256.0F;
						if (local1133 == 1) {
							local1200 = (float) arg1.anIntArray65[local736] / 1024.0F;
							Static58.method8948(local1168, arg1.anIntArray67[local1143], local1178, arg1.anIntArray64[local1143], Static601.aFloatArray85, arg1.anIntArray66[local1143], local1186, local1163, local1158, local1200, local1173);
							local1104 = Static601.aFloatArray85[1];
							local1102 = Static601.aFloatArray85[0];
							Static58.method8948(local1168, arg1.anIntArray67[local1148], local1178, arg1.anIntArray64[local1148], Static601.aFloatArray85, arg1.anIntArray66[local1148], local1186, local1163, local1158, local1200, local1173);
							local1108 = Static601.aFloatArray85[1];
							local1106 = Static601.aFloatArray85[0];
							Static58.method8948(local1168, arg1.anIntArray67[local1153], local1178, arg1.anIntArray64[local1153], Static601.aFloatArray85, arg1.anIntArray66[local1153], local1186, local1163, local1158, local1200, local1173);
							local1110 = Static601.aFloatArray85[0];
							local1112 = Static601.aFloatArray85[1];
							local1208 = local1200 / 2.0F;
							if ((local1178 & 0x1) == 0) {
								if (local1208 < local1106 - local1102) {
									local1114 = 1;
									local1106 -= local1200;
								} else if (local1208 < local1102 - local1106) {
									local1106 += local1200;
									local1114 = 2;
								}
								if (local1208 < local1110 - local1102) {
									local1110 -= local1200;
									local1116 = 1;
								} else if (local1102 - local1110 > local1208) {
									local1116 = 2;
									local1110 += local1200;
								}
							} else {
								if (local1208 < local1112 - local1104) {
									local1112 -= local1200;
									local1116 = 1;
								} else if (local1104 - local1112 > local1208) {
									local1116 = 2;
									local1112 += local1200;
								}
								if (local1108 - local1104 > local1208) {
									local1108 -= local1200;
									local1114 = 1;
								} else if (local1104 - local1108 > local1208) {
									local1108 += local1200;
									local1114 = 2;
								}
							}
						} else if (local1133 == 2) {
							local1200 = (float) arg1.anIntArray68[local736] / 256.0F;
							local1208 = (float) arg1.anIntArray70[local736] / 256.0F;
							@Pc(1219) int local1219 = arg1.anIntArray64[local1148] - arg1.anIntArray64[local1143];
							@Pc(1230) int local1230 = arg1.anIntArray66[local1148] - arg1.anIntArray66[local1143];
							@Pc(1241) int local1241 = arg1.anIntArray67[local1148] - arg1.anIntArray67[local1143];
							@Pc(1252) int local1252 = arg1.anIntArray64[local1153] - arg1.anIntArray64[local1143];
							@Pc(1262) int local1262 = arg1.anIntArray66[local1153] - arg1.anIntArray66[local1143];
							@Pc(1273) int local1273 = arg1.anIntArray67[local1153] - arg1.anIntArray67[local1143];
							@Pc(1282) int local1282 = local1230 * local1273 - local1241 * local1262;
							@Pc(1291) int local1291 = local1252 * local1241 - local1219 * local1273;
							@Pc(1300) int local1300 = local1262 * local1219 - local1230 * local1252;
							local1308 = 64.0F / (float) arg1.anIntArray69[local736];
							local1316 = 64.0F / (float) arg1.anIntArray62[local736];
							local1324 = 64.0F / (float) arg1.anIntArray65[local736];
							local1347 = ((float) local1300 * local1173[2] + (float) local1282 * local1173[0] + (float) local1291 * local1173[1]) / local1308;
							local1370 = (local1173[5] * (float) local1300 + local1173[3] * (float) local1282 + (float) local1291 * local1173[4]) / local1316;
							local1393 = ((float) local1291 * local1173[7] + local1173[6] * (float) local1282 + local1173[8] * (float) local1300) / local1324;
							local1118 = Static102.method2662(local1370, local1393, local1347);
							Static571.method8520(local1208, local1186, local1173, arg1.anIntArray67[local1143], local1168, local1178, local1158, arg1.anIntArray64[local1143], arg1.anIntArray66[local1143], local1200, Static601.aFloatArray85, local1163, local1118);
							local1104 = Static601.aFloatArray85[1];
							local1102 = Static601.aFloatArray85[0];
							Static571.method8520(local1208, local1186, local1173, arg1.anIntArray67[local1148], local1168, local1178, local1158, arg1.anIntArray64[local1148], arg1.anIntArray66[local1148], local1200, Static601.aFloatArray85, local1163, local1118);
							local1108 = Static601.aFloatArray85[1];
							local1106 = Static601.aFloatArray85[0];
							Static571.method8520(local1208, local1186, local1173, arg1.anIntArray67[local1153], local1168, local1178, local1158, arg1.anIntArray64[local1153], arg1.anIntArray66[local1153], local1200, Static601.aFloatArray85, local1163, local1118);
							local1110 = Static601.aFloatArray85[0];
							local1112 = Static601.aFloatArray85[1];
						} else if (local1133 == 3) {
							Static446.method7026(local1168, local1178, local1186, arg1.anIntArray64[local1143], Static601.aFloatArray85, arg1.anIntArray67[local1143], local1158, arg1.anIntArray66[local1143], local1163, local1173);
							local1102 = Static601.aFloatArray85[0];
							local1104 = Static601.aFloatArray85[1];
							Static446.method7026(local1168, local1178, local1186, arg1.anIntArray64[local1148], Static601.aFloatArray85, arg1.anIntArray67[local1148], local1158, arg1.anIntArray66[local1148], local1163, local1173);
							local1106 = Static601.aFloatArray85[0];
							local1108 = Static601.aFloatArray85[1];
							Static446.method7026(local1168, local1178, local1186, arg1.anIntArray64[local1153], Static601.aFloatArray85, arg1.anIntArray67[local1153], local1158, arg1.anIntArray66[local1153], local1163, local1173);
							local1110 = Static601.aFloatArray85[0];
							local1112 = Static601.aFloatArray85[1];
							if ((local1178 & 0x1) == 0) {
								if (local1110 - local1102 > 0.5F) {
									local1110--;
									local1116 = 1;
								} else if (local1102 - local1110 > 0.5F) {
									local1110++;
									local1116 = 2;
								}
								if (local1106 - local1102 > 0.5F) {
									local1106--;
									local1114 = 1;
								} else if (local1102 - local1106 > 0.5F) {
									local1106++;
									local1114 = 2;
								}
							} else {
								if (local1112 - local1104 > 0.5F) {
									local1116 = 1;
									local1112--;
								} else if (local1104 - local1112 > 0.5F) {
									local1116 = 2;
									local1112++;
								}
								if (local1108 - local1104 > 0.5F) {
									local1108--;
									local1114 = 1;
								} else if (local1104 - local1108 > 0.5F) {
									local1114 = 2;
									local1108++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray25 == null) {
				local1133 = 0;
			} else {
				local1133 = arg1.aByteArray25[local1033];
			}
			if (local1133 == 0) {
				@Pc(2481) long local2481 = (long) (local736 << 2) + ((long) (local1040 << 8) + (long) (local1118 << 24) + (long) local747 << 32);
				local1153 = arg1.aShortArray20[local1033];
				local1952 = arg1.aShortArray14[local1033];
				local1957 = arg1.aShortArray17[local1033];
				@Pc(2500) Class112 local2500 = local414[local1153];
				this.aShortArray89[local162] = this.method6181(local2500.anInt4022, local2481, local162, local2500.anInt4020, local2500.anInt4018, local1102, local1153, local1104, arg1, local2500.anInt4023);
				@Pc(2525) Class112 local2525 = local414[local1952];
				this.aShortArray88[local162] = this.method6181(local2525.anInt4022, (long) local1114 + local2481, local162, local2525.anInt4020, local2525.anInt4018, local1106, local1952, local1108, arg1, local2525.anInt4023);
				@Pc(2553) Class112 local2553 = local414[local1957];
				this.aShortArray90[local162] = this.method6181(local2553.anInt4022, (long) local1116 + local2481, local162, local2553.anInt4020, local2553.anInt4018, local1110, local1957, local1112, arg1, local2553.anInt4023);
			} else if (local1133 == 1) {
				@Pc(2338) Class172 local2338 = local707[local1033];
				@Pc(2383) long local2383 = ((long) local747 + (long) (local1118 << 24) + (long) (local1040 << 8) << 32) + (long) ((local2338.anInt5907 + 256 << 12) + (local2338.anInt5906 > 0 ? 1024 : 2048) + (local736 << 2) + (local2338.anInt5909 - -256 << 22));
				this.aShortArray89[local162] = this.method6181(local2338.anInt5909, local2383, local162, 0, local2338.anInt5906, local1102, arg1.aShortArray20[local1033], local1104, arg1, local2338.anInt5907);
				this.aShortArray88[local162] = this.method6181(local2338.anInt5909, local2383 + (long) local1114, local162, 0, local2338.anInt5906, local1106, arg1.aShortArray14[local1033], local1108, arg1, local2338.anInt5907);
				this.aShortArray90[local162] = this.method6181(local2338.anInt5909, local2383 + (long) local1116, local162, 0, local2338.anInt5906, local1110, arg1.aShortArray17[local1033], local1112, arg1, local2338.anInt5907);
			}
			if (arg1.aByteArray23 != null) {
				this.aByteArray95[local162] = arg1.aByteArray23[local1033];
			}
			if (arg1.aShortArray18 != null) {
				this.aShortArray80[local162] = arg1.aShortArray18[local1033];
			}
			this.aShortArray85[local162] = arg1.aShortArray19[local1033];
			this.aShortArray79[local162] = local1076;
		}
		if (this.anInt7281 > 0) {
			local1033 = 1;
			local726 = this.aShortArray79[0];
			for (local736 = 0; local736 < this.anInt7281; local736++) {
				@Pc(2640) short local2640 = this.aShortArray79[local736];
				if (local726 != local2640) {
					local1033++;
					local726 = local2640;
				}
			}
			this.anIntArray457 = new int[local1033];
			this.anIntArray456 = new int[local1033 + 1];
			this.anIntArray460 = new int[local1033];
			this.anIntArray456[0] = 0;
			local747 = this.anInt7257;
			local1033 = 0;
			local1076 = 0;
			local726 = this.aShortArray79[0];
			for (local768 = 0; local768 < this.anInt7281; local768++) {
				@Pc(2699) short local2699 = this.aShortArray79[local768];
				if (local2699 != local726) {
					this.anIntArray457[local1033] = local747;
					this.anIntArray460[local1033] = local1076 + 1 - local747;
					local1033++;
					this.anIntArray456[local1033] = local768;
					local726 = local2699;
					local1076 = 0;
					local747 = this.anInt7257;
				}
				@Pc(2735) short local2735 = this.aShortArray89[local768];
				if (local1076 < local2735) {
					local1076 = local2735;
				}
				if (local747 > local2735) {
					local747 = local2735;
				}
				local2735 = this.aShortArray88[local768];
				if (local2735 > local1076) {
					local1076 = local2735;
				}
				if (local2735 < local747) {
					local747 = local2735;
				}
				local2735 = this.aShortArray90[local768];
				if (local2735 > local1076) {
					local1076 = local2735;
				}
				if (local2735 < local747) {
					local747 = local2735;
				}
			}
			this.anIntArray457[local1033] = local747;
			this.anIntArray460[local1033] = local1076 + 1 - local747;
			local1033++;
			this.anIntArray456[local1033] = this.anInt7281;
		}
		Static146.aLongArray7 = null;
		this.aShortArray84 = Static102.method2666(this.aShortArray84, this.anInt7257);
		this.aShortArray78 = Static102.method2666(this.aShortArray78, this.anInt7257);
		this.aShortArray86 = Static102.method2666(this.aShortArray86, this.anInt7257);
		this.aShortArray82 = Static102.method2666(this.aShortArray82, this.anInt7257);
		this.aShortArray81 = Static102.method2666(this.aShortArray81, this.anInt7257);
		this.aByteArray94 = Static546.method8161(this.aByteArray94, this.anInt7257);
		this.aFloatArray61 = Static150.method7143(this.anInt7257, this.aFloatArray61);
		this.aFloatArray62 = Static150.method7143(this.anInt7257, this.aFloatArray62);
		if (arg1.anIntArray72 != null && Static414.method6671(this.anInt7256, arg2)) {
			this.anIntArrayArray38 = arg1.method1600(false);
		}
		if (arg1.aClass256Array1 != null && Static306.method5419(this.anInt7256, arg2)) {
			this.anIntArrayArray37 = arg1.method1593();
		}
		if (arg1.anIntArray63 != null && Static280.method5110(this.anInt7256, arg2)) {
			local1033 = 0;
			@Pc(2927) int[] local2927 = new int[256];
			for (local736 = 0; local736 < this.anInt7258; local736++) {
				local747 = arg1.anIntArray63[local15[local736]];
				if (local747 >= 0) {
					@Pc(2947) int local2947 = local2927[local747]++;
					if (local1033 < local747) {
						local1033 = local747;
					}
				}
			}
			this.anIntArrayArray39 = new int[local1033 + 1][];
			for (local747 = 0; local747 <= local1033; local747++) {
				this.anIntArrayArray39[local747] = new int[local2927[local747]];
				local2927[local747] = 0;
			}
			for (local757 = 0; local757 < this.anInt7258; local757++) {
				local768 = arg1.anIntArray63[local15[local757]];
				if (local768 >= 0) {
					this.anIntArrayArray39[local768][local2927[local768]++] = local757;
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!wga;IIZZ)V")
	public Class166_Sub2(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean528 = true;
		this.anInt7228 = 0;
		this.aBoolean529 = false;
		this.aBoolean531 = false;
		this.anInt7258 = 0;
		this.anInt7257 = 0;
		this.anInt7281 = 0;
		this.aBoolean532 = false;
		this.anInt7270 = 0;
		this.aBoolean530 = false;
		this.anInt7248 = arg1;
		this.aBoolean530 = arg4;
		this.anInt7256 = arg2;
		this.aClass20_Sub2_17 = arg0;
		if (arg3 || Static418.method6753(this.anInt7248, this.anInt7256)) {
			this.aClass51_4 = new Class51(Static573.method8544(this.anInt7248, this.anInt7256));
		}
		if (arg3 || Static145.method3222(this.anInt7256, this.anInt7248)) {
			this.aClass51_2 = new Class51(Static452.method7103(this.anInt7256, this.anInt7248));
		}
		if (arg3 || Static622.method9059(this.anInt7248, this.anInt7256)) {
			this.aClass51_3 = new Class51(Static423.method6817(this.anInt7248, this.anInt7256));
		}
		if (arg3 || Static460.method7173(this.anInt7256, this.anInt7248)) {
			this.aClass51_1 = new Class51(Static373.method6255(this.anInt7248, this.anInt7256));
		}
		if (arg3 || Static158.method3486(this.anInt7248, this.anInt7256)) {
			this.aClass282_1 = new Class282(Static206.method4087(this.anInt7256, this.anInt7248));
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
	private void method6171() {
		if (this.aClass96Array1 == null) {
			return;
		}
		this.aClass20_Sub2_17.C(!this.aBoolean529);
		this.aClass20_Sub2_17.method1500(false);
		this.aClass20_Sub2_17.method1483(1, Static165.aClass177_3);
		this.aClass20_Sub2_17.method1519(1, Static165.aClass177_3);
		for (@Pc(32) int local32 = 0; local32 < this.anInt7213; local32++) {
			@Pc(39) Class96 local39 = this.aClass96Array1[local32];
			@Pc(44) Class77 local44 = this.aClass77Array1[local32];
			if (!local39.aBoolean253 || !this.aClass20_Sub2_17.method7269()) {
				@Pc(73) float local73 = (float) (this.anIntArray461[local39.anInt3295] + this.anIntArray461[local39.anInt3292] + this.anIntArray461[local39.anInt3290]) * 0.3333333F;
				@Pc(94) float local94 = (float) (this.anIntArray462[local39.anInt3292] + this.anIntArray462[local39.anInt3295] + this.anIntArray462[local39.anInt3290]) * 0.3333333F;
				@Pc(115) float local115 = (float) (this.anIntArray458[local39.anInt3290] + this.anIntArray458[local39.anInt3292] + this.anIntArray458[local39.anInt3295]) * 0.3333333F;
				@Pc(129) float local129 = local115 * Static329.aFloat156 + Static260.aFloat170 * local73 + local94 * Static355.aFloat161 + Static121.aFloat201;
				@Pc(143) float local143 = Static22.aFloat10 + Static464.aFloat171 * local115 + Static269.aFloat152 * local73 + local94 * Static63.aFloat78;
				@Pc(157) float local157 = Static529.aFloat202 + Static131.aFloat100 * local94 + local73 * Static492.aFloat197 + local115 * Static199.aFloat174;
				@Pc(178) float local178 = (float) (1.0D / Math.sqrt((double) (local157 * local157 + local143 * local143 + local129 * local129))) * (float) local39.anInt3294;
				@Pc(183) Class30_Sub2 local183 = this.aClass20_Sub2_17.method1568();
				local183.method4056(local44.anInt2858, local39.aShort26 * local44.anInt2868 >> 7, (float) local44.anInt2864 + local129 - local129 * local178, -(local178 * local157) + local157, (float) local44.anInt2860 + local143 - local143 * local178, local44.anInt2871 * local39.aShort27 >> 7);
				local183.method4037(this.aClass20_Sub2_17.aClass30_Sub2_17);
				this.aClass20_Sub2_17.method1549();
				@Pc(240) int local240 = local44.anInt2862;
				this.aClass20_Sub2_17.method1448(false, false, local39.aShort28);
				this.aClass20_Sub2_17.method1451(local39.aByte40);
				this.aClass20_Sub2_17.method1528(local240);
				this.aClass20_Sub2_17.method1567();
			}
		}
		this.aClass20_Sub2_17.method1519(1, Static154.aClass177_4);
		this.aClass20_Sub2_17.method1483(1, Static154.aClass177_4);
		this.aClass20_Sub2_17.C(true);
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(I)Z")
	private boolean method6172() {
		@Pc(13) boolean local13 = !this.aClass51_3.aBoolean170;
		@Pc(29) boolean local29 = (this.anInt7256 & 0x37) != 0 && !this.aClass51_1.aBoolean170;
		@Pc(37) boolean local37 = !this.aClass51_4.aBoolean170;
		@Pc(45) boolean local45 = !this.aClass51_2.aBoolean170;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(57) boolean local57 = true;
		@Pc(76) Interface22 local76;
		@Pc(90) Buffer local90;
		if (local37) {
			if (this.aClass51_4.anInterface22_10 == null) {
				this.aClass51_4.anInterface22_10 = this.aClass20_Sub2_17.method1523(this.aBoolean530);
			}
			local76 = this.aClass51_4.anInterface22_10;
			local76.method764(this.anInt7257 * 12, 12);
			local90 = local76.method763();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass20_Sub2_17.aNativeInterface3.copyPositions(this.anIntArray461, this.anIntArray462, this.anIntArray458, this.aShortArray84, 0, 12, this.anInt7257, local90.getAddress());
				if (local76.method762()) {
					this.aClass51_4.anInterface22_11 = local76;
					this.aClass51_4.aBoolean170 = true;
				} else {
					local57 = false;
				}
			}
		}
		@Pc(186) short[] local186;
		@Pc(189) short[] local189;
		@Pc(183) short[] local183;
		@Pc(180) byte[] local180;
		if (local13) {
			if (this.aClass51_3.anInterface22_10 == null) {
				this.aClass51_3.anInterface22_10 = this.aClass20_Sub2_17.method1523(this.aBoolean530);
			}
			local76 = this.aClass51_3.anInterface22_10;
			local76.method764(this.anInt7257 * 4, 4);
			local90 = local76.method763();
			if (local90 == null) {
				local57 = false;
			} else {
				if ((this.anInt7256 & 0x37) == 0) {
					if (this.aClass246_1 == null) {
						local180 = this.aByteArray94;
						local183 = this.aShortArray81;
						local186 = this.aShortArray86;
						local189 = this.aShortArray82;
					} else {
						local183 = this.aClass246_1.aShortArray102;
						local189 = this.aClass246_1.aShortArray103;
						local180 = this.aClass246_1.aByteArray101;
						local186 = this.aClass246_1.aShortArray104;
					}
					this.aClass20_Sub2_17.aNativeInterface3.copyLighting(this.aShortArray85, this.aByteArray95, this.aShortArray79, local186, local189, local183, local180, this.aShort80, this.aShort79, this.aShortArray78, 0, 4, this.anInt7257, local90.getAddress());
				} else {
					this.aClass20_Sub2_17.aNativeInterface3.copyColours(this.aShortArray85, this.aByteArray95, this.aShortArray79, this.aShort80, this.aShortArray78, 0, 4, this.anInt7257, local90.getAddress());
				}
				if (local76.method762()) {
					this.aClass51_3.aBoolean170 = true;
					this.aClass51_3.anInterface22_11 = local76;
				} else {
					local57 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass51_1.anInterface22_10 == null) {
				this.aClass51_1.anInterface22_10 = this.aClass20_Sub2_17.method1523(this.aBoolean530);
			}
			local76 = this.aClass51_1.anInterface22_10;
			local76.method764(this.anInt7257 * 12, 12);
			local90 = local76.method763();
			if (local90 == null) {
				local57 = false;
			} else {
				if (this.aClass246_1 == null) {
					local183 = this.aShortArray81;
					local186 = this.aShortArray86;
					local180 = this.aByteArray94;
					local189 = this.aShortArray82;
				} else {
					local180 = this.aClass246_1.aByteArray101;
					local183 = this.aClass246_1.aShortArray102;
					local186 = this.aClass246_1.aShortArray104;
					local189 = this.aClass246_1.aShortArray103;
				}
				this.aClass20_Sub2_17.aNativeInterface3.copyNormals(local186, local189, local183, local180, 3.0F / (float) this.aShort79, 3.0F / (float) (this.aShort79 + this.aShort79 / 2), 0, 12, this.anInt7257, local90.getAddress());
				if (local76.method762()) {
					this.aClass51_1.aBoolean170 = true;
					this.aClass51_1.anInterface22_11 = local76;
				} else {
					local57 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass51_2.anInterface22_10 == null) {
				this.aClass51_2.anInterface22_10 = this.aClass20_Sub2_17.method1523(this.aBoolean530);
			}
			local76 = this.aClass51_2.anInterface22_10;
			local76.method764(this.anInt7257 * 8, 8);
			local90 = local76.method763();
			if (local90 == null) {
				local57 = false;
			} else {
				this.aClass20_Sub2_17.aNativeInterface3.copyTexCoords(this.aFloatArray61, this.aFloatArray62, 0, 8, this.anInt7257, local90.getAddress());
				if (local76.method762()) {
					this.aClass51_2.anInterface22_11 = local76;
					this.aClass51_2.aBoolean170 = true;
				} else {
					local57 = false;
				}
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!nca", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7278;
	}

	@OriginalMember(owner = "client!nca", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray38 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7270; local12++) {
			this.anIntArray461[local12] <<= 0x4;
			this.anIntArray462[local12] <<= 0x4;
			this.anIntArray458[local12] <<= 0x4;
		}
		Static384.anInt7431 = 0;
		Static122.anInt10526 = 0;
		Static223.anInt4979 = 0;
		return true;
	}

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "()V")
	@Override
	protected void method6692() {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "()[Lclient!eca;")
	@Override
	public Class87[] method6674() {
		return this.aClass87Array4;
	}

	@OriginalMember(owner = "client!nca", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort79 = (short) arg0;
		this.method6179();
		this.method6185();
	}

	@OriginalMember(owner = "client!nca", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7228; local15++) {
			@Pc(33) int local33 = this.anIntArray461[local15] * local13 + local9 * this.anIntArray462[local15] >> 14;
			this.anIntArray462[local15] = local13 * this.anIntArray462[local15] - local9 * this.anIntArray461[local15] >> 14;
			this.anIntArray461[local15] = local33;
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!bca;ZI)Z")
	@Override
	public boolean method6698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6174(arg0, arg4, -1, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!nca", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub6_Sub7 ba(@OriginalArg(0) Class2_Sub6_Sub7 arg0) {
		if (this.anInt7257 == 0) {
			return null;
		}
		if (!this.aBoolean531) {
			this.method6187();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass20_Sub2_17.anInt1560 <= 0) {
			local43 = this.anInt7276 - (this.anInt7247 * this.aClass20_Sub2_17.anInt1560 >> 8) >> this.aClass20_Sub2_17.anInt1550;
			local59 = this.anInt7252 - (this.aClass20_Sub2_17.anInt1560 * this.anInt7277 >> 8) >> this.aClass20_Sub2_17.anInt1550;
		} else {
			local43 = this.anInt7276 - (this.anInt7277 * this.aClass20_Sub2_17.anInt1560 >> 8) >> this.aClass20_Sub2_17.anInt1550;
			local59 = this.anInt7252 - (this.anInt7247 * this.aClass20_Sub2_17.anInt1560 >> 8) >> this.aClass20_Sub2_17.anInt1550;
		}
		@Pc(114) int local114;
		@Pc(131) int local131;
		if (this.aClass20_Sub2_17.anInt1553 > 0) {
			local114 = this.anInt7221 - (this.anInt7277 * this.aClass20_Sub2_17.anInt1553 >> 8) >> this.aClass20_Sub2_17.anInt1550;
			local131 = this.anInt7234 - (this.anInt7247 * this.aClass20_Sub2_17.anInt1553 >> 8) >> this.aClass20_Sub2_17.anInt1550;
		} else {
			local114 = this.anInt7221 - (this.anInt7247 * this.aClass20_Sub2_17.anInt1553 >> 8) >> this.aClass20_Sub2_17.anInt1550;
			local131 = this.anInt7234 - (this.anInt7277 * this.aClass20_Sub2_17.anInt1553 >> 8) >> this.aClass20_Sub2_17.anInt1550;
		}
		@Pc(172) int local172 = local59 + 1 - local43;
		@Pc(179) int local179 = local131 + 1 - local114;
		@Pc(182) Class2_Sub6_Sub7_Sub1 local182 = (Class2_Sub6_Sub7_Sub1) arg0;
		@Pc(198) Class2_Sub6_Sub7_Sub1 local198;
		if (local182 != null && local182.method3207(local172, local179)) {
			local198 = local182;
			local182.method3205();
		} else {
			local198 = new Class2_Sub6_Sub7_Sub1(this.aClass20_Sub2_17, local172, local179);
		}
		local198.method3202(local59, local131, local114, local43);
		this.method6177(local198);
		return local198;
	}

	@OriginalMember(owner = "client!nca", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7270; local7++) {
			this.anIntArray461[local7] = this.anIntArray461[local7] + 7 >> 4;
			this.anIntArray462[local7] = this.anIntArray462[local7] + 7 >> 4;
			this.anIntArray458[local7] = this.anIntArray458[local7] + 7 >> 4;
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7277;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIIZLclient!bca;)Z")
	private boolean method6174(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) Class30 arg5) {
		@Pc(8) Class30_Sub2 local8 = (Class30_Sub2) arg5;
		@Pc(12) Class30_Sub2 local12 = this.aClass20_Sub2_17.aClass30_Sub2_16;
		@Pc(33) float local33 = local12.aFloat128 + local12.aFloat124 * local8.aFloat128 + local12.aFloat120 * local8.aFloat123 + local12.aFloat121 * local8.aFloat127;
		@Pc(54) float local54 = local12.aFloat129 * local8.aFloat127 + local8.aFloat123 * local12.aFloat126 + local8.aFloat128 * local12.aFloat122 + local12.aFloat123;
		Static329.aFloat156 = local12.aFloat121 * local8.aFloat125 + local8.aFloat121 * local12.aFloat124 + local8.aFloat129 * local12.aFloat120;
		Static492.aFloat197 = local8.aFloat130 * local12.aFloat125 + local12.aFloat119 * local8.aFloat122 + local8.aFloat124 * local12.aFloat130;
		Static63.aFloat78 = local8.aFloat126 * local12.aFloat126 + local12.aFloat122 * local8.aFloat120 + local12.aFloat129 * local8.aFloat119;
		Static199.aFloat174 = local8.aFloat121 * local12.aFloat130 + local12.aFloat119 * local8.aFloat129 + local8.aFloat125 * local12.aFloat125;
		Static355.aFloat161 = local8.aFloat119 * local12.aFloat121 + local12.aFloat124 * local8.aFloat120 + local12.aFloat120 * local8.aFloat126;
		Static269.aFloat152 = local12.aFloat129 * local8.aFloat130 + local8.aFloat124 * local12.aFloat122 + local8.aFloat122 * local12.aFloat126;
		Static260.aFloat170 = local12.aFloat121 * local8.aFloat130 + local12.aFloat120 * local8.aFloat122 + local8.aFloat124 * local12.aFloat124;
		@Pc(201) float local201 = local12.aFloat127 + local12.aFloat125 * local8.aFloat127 + local12.aFloat130 * local8.aFloat128 + local8.aFloat123 * local12.aFloat119;
		Static464.aFloat171 = local12.aFloat126 * local8.aFloat129 + local8.aFloat121 * local12.aFloat122 + local8.aFloat125 * local12.aFloat129;
		Static131.aFloat100 = local12.aFloat119 * local8.aFloat126 + local8.aFloat120 * local12.aFloat130 + local8.aFloat119 * local12.aFloat125;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass20_Sub2_17.anInt1558;
		@Pc(255) int local255 = this.aClass20_Sub2_17.anInt1561;
		if (!this.aBoolean531) {
			this.method6187();
		}
		@Pc(270) int local270 = this.anInt7252 - this.anInt7276 >> 1;
		@Pc(279) int local279 = this.anInt7277 - this.anInt7247 >> 1;
		@Pc(296) int local296 = this.anInt7234 - this.anInt7221 >> 1;
		@Pc(301) int local301 = local270 + this.anInt7276;
		@Pc(306) int local306 = local279 + this.anInt7247;
		@Pc(311) int local311 = local296 + this.anInt7221;
		@Pc(317) int local317 = local301 - (local270 << arg1);
		@Pc(323) int local323 = local306 - (local279 << arg1);
		@Pc(330) int local330 = local311 - (local296 << arg1);
		@Pc(336) int local336 = (local270 << arg1) + local301;
		@Pc(342) int local342 = local306 + (local279 << arg1);
		Static119.anIntArray154[0] = local317;
		@Pc(352) int local352 = (local296 << arg1) + local311;
		Static89.anIntArray126[0] = local323;
		Static119.anIntArray154[1] = local336;
		Static152.anIntArray205[0] = local330;
		Static89.anIntArray126[1] = local323;
		Static152.anIntArray205[1] = local330;
		Static119.anIntArray154[2] = local317;
		Static89.anIntArray126[2] = local342;
		Static152.anIntArray205[2] = local330;
		Static119.anIntArray154[3] = local336;
		Static89.anIntArray126[3] = local342;
		Static152.anIntArray205[3] = local330;
		Static119.anIntArray154[4] = local317;
		Static89.anIntArray126[4] = local323;
		Static152.anIntArray205[4] = local352;
		Static119.anIntArray154[5] = local336;
		Static89.anIntArray126[5] = local323;
		Static152.anIntArray205[5] = local352;
		Static119.anIntArray154[6] = local317;
		Static89.anIntArray126[6] = local342;
		Static119.anIntArray154[7] = local336;
		Static152.anIntArray205[6] = local352;
		Static89.anIntArray126[7] = local342;
		Static152.anIntArray205[7] = local352;
		@Pc(491) float local491;
		@Pc(477) float local477;
		@Pc(505) float local505;
		@Pc(453) float local453;
		@Pc(463) float local463;
		@Pc(458) float local458;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = Static119.anIntArray154[local446];
			local458 = Static152.anIntArray205[local446];
			local463 = Static89.anIntArray126[local446];
			local477 = local453 * Static269.aFloat152 + local463 * Static63.aFloat78 + Static464.aFloat171 * local458 + local54;
			local491 = Static260.aFloat170 * local453 + local463 * Static355.aFloat161 + local458 * Static329.aFloat156 + local33;
			local505 = local201 + local458 * Static199.aFloat174 + Static131.aFloat100 * local463 + Static492.aFloat197 * local453;
			if (local505 >= (float) this.aClass20_Sub2_17.anInt1543) {
				if (arg2 > 0) {
					local505 = arg2;
				}
				@Pc(532) float local532 = local491 * (float) local251 / local505 + (float) this.aClass20_Sub2_17.anInt1542;
				@Pc(544) float local544 = (float) this.aClass20_Sub2_17.anInt1559 + (float) local255 * local477 / local505;
				if (local532 < local241) {
					local241 = local532;
				}
				if (local532 > local243) {
					local243 = local532;
				}
				if (local544 < local245) {
					local245 = local544;
				}
				local239 = true;
				if (local247 < local544) {
					local247 = local544;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && local243 > (float) arg0 && local245 < (float) arg3 && local247 > (float) arg3) {
			if (arg4) {
				return true;
			}
			if (Static504.anIntArray605.length < this.anInt7257) {
				Static33.anIntArray290 = new int[this.anInt7257];
				Static504.anIntArray605 = new int[this.anInt7257];
			}
			@Pc(708) int local708;
			for (@Pc(621) int local621 = 0; local621 < this.anInt7228; local621++) {
				local458 = this.anIntArray458[local621];
				local463 = this.anIntArray462[local621];
				local453 = this.anIntArray461[local621];
				local505 = Static199.aFloat174 * local458 + local453 * Static492.aFloat197 + Static131.aFloat100 * local463 + local201;
				local491 = local33 + Static355.aFloat161 * local463 + Static260.aFloat170 * local453 + local458 * Static329.aFloat156;
				local477 = Static464.aFloat171 * local458 + local453 * Static269.aFloat152 + Static63.aFloat78 * local463 + local54;
				@Pc(721) int local721;
				@Pc(726) int local726;
				@Pc(733) int local733;
				if (local505 >= (float) this.aClass20_Sub2_17.anInt1543) {
					if (arg2 > 0) {
						local505 = arg2;
					}
					local708 = (int) ((float) local251 * local491 / local505 + (float) this.aClass20_Sub2_17.anInt1542);
					local721 = (int) ((float) this.aClass20_Sub2_17.anInt1559 + local477 * (float) local255 / local505);
					local726 = this.anIntArray459[local621];
					local733 = this.anIntArray459[local621 + 1];
					for (@Pc(735) int local735 = local726; local735 < local733; local735++) {
						@Pc(744) int local744 = this.aShortArray83[local735] - 1;
						if (local744 == -1) {
							break;
						}
						Static504.anIntArray605[local744] = local708;
						Static33.anIntArray290[local744] = local721;
					}
				} else {
					local708 = this.anIntArray459[local621];
					local721 = this.anIntArray459[local621 + 1];
					for (local726 = local708; local726 < local721; local726++) {
						local733 = this.aShortArray83[local726] - 1;
						if (local733 == -1) {
							break;
						}
						Static504.anIntArray605[this.aShortArray83[local726] - 1] = -999999;
					}
				}
			}
			for (local708 = 0; local708 < this.anInt7258; local708++) {
				if (Static504.anIntArray605[this.aShortArray89[local708]] != -999999 && Static504.anIntArray605[this.aShortArray88[local708]] != -999999 && Static504.anIntArray605[this.aShortArray90[local708]] != -999999 && this.method6183(arg0, Static504.anIntArray605[this.aShortArray90[local708]], Static504.anIntArray605[this.aShortArray88[local708]], Static33.anIntArray290[this.aShortArray90[local708]], Static33.anIntArray290[this.aShortArray89[local708]], arg3, Static504.anIntArray605[this.aShortArray89[local708]], Static33.anIntArray290[this.aShortArray88[local708]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "(I)V")
	private void method6175() {
		if (!this.aBoolean528) {
			return;
		}
		this.aBoolean528 = false;
		if (this.aClass227Array4 == null && this.aClass87Array4 == null && this.aClass96Array1 == null) {
			if (this.anIntArray461 != null && !Static429.method6866(this.anInt7256, this.anInt7248)) {
				if (this.aClass51_4 == null || this.aClass51_4.method1965()) {
					if (!this.aBoolean531) {
						this.method6187();
					}
					this.anIntArray461 = null;
				} else {
					this.aBoolean528 = true;
				}
			}
			if (this.anIntArray462 != null && !Static58.method8950(this.anInt7256, this.anInt7248)) {
				if (this.aClass51_4 == null || this.aClass51_4.method1965()) {
					if (!this.aBoolean531) {
						this.method6187();
					}
					this.anIntArray462 = null;
				} else {
					this.aBoolean528 = true;
				}
			}
			if (this.anIntArray458 != null && !Static546.method8163(this.anInt7256, this.anInt7248)) {
				if (this.aClass51_4 == null || this.aClass51_4.method1965()) {
					if (!this.aBoolean531) {
						this.method6187();
					}
					this.anIntArray458 = null;
				} else {
					this.aBoolean528 = true;
				}
			}
		}
		if (this.aShortArray83 != null && this.anIntArray461 == null && this.anIntArray462 == null && this.anIntArray458 == null) {
			this.anIntArray459 = null;
			this.aShortArray83 = null;
		}
		if (this.aByteArray94 != null && !Static306.method5415(this.anInt7256, this.anInt7248)) {
			label197: {
				label196: {
					@Pc(161) boolean local161;
					if ((this.anInt7256 & 0x37) == 0) {
						if (this.aClass51_3 == null || this.aClass51_3.method1965()) {
							break label196;
						}
						local161 = false;
					} else {
						if (this.aClass51_1 == null || this.aClass51_1.method1965()) {
							break label196;
						}
						local161 = false;
					}
					if (!local161) {
						this.aBoolean528 = true;
						break label197;
					}
				}
				this.aShortArray86 = this.aShortArray82 = this.aShortArray81 = null;
				this.aByteArray94 = null;
			}
		}
		if (this.aShortArray85 != null && !Static290.method5250(this.anInt7256, this.anInt7248)) {
			if (this.aClass51_3 == null || this.aClass51_3.method1965()) {
				this.aShortArray85 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.aByteArray95 != null && !Static597.method8778(this.anInt7256, this.anInt7248)) {
			if (this.aClass51_3 == null || this.aClass51_3.method1965()) {
				this.aByteArray95 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.aFloatArray61 != null && !Static21.method594(this.anInt7256, this.anInt7248)) {
			if (this.aClass51_2 == null || this.aClass51_2.method1965()) {
				this.aFloatArray61 = this.aFloatArray62 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.aShortArray79 != null && !Static195.method3952(this.anInt7248, this.anInt7256)) {
			if (this.aClass51_3 == null || this.aClass51_3.method1965()) {
				this.aShortArray79 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.aShortArray89 != null && !Static50.method1758(this.anInt7248, this.anInt7256)) {
			if ((this.aClass282_1 == null || this.aClass282_1.method7402()) && (this.aClass51_3 == null || this.aClass51_3.method1965())) {
				this.aShortArray89 = this.aShortArray88 = this.aShortArray90 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.aShortArray84 != null) {
			if (this.aClass51_4 == null || this.aClass51_4.method1965()) {
				this.aShortArray84 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.aShortArray78 != null) {
			if (this.aClass51_3 == null || this.aClass51_3.method1965()) {
				this.aShortArray78 = null;
			} else {
				this.aBoolean528 = true;
			}
		}
		if (this.anIntArrayArray39 != null && !Static280.method5110(this.anInt7256, this.anInt7248)) {
			this.aShortArray80 = null;
			this.anIntArrayArray39 = null;
		}
		if (this.anIntArrayArray38 != null && !Static414.method6671(this.anInt7256, this.anInt7248)) {
			this.anIntArrayArray38 = null;
			this.aShortArray87 = null;
		}
		if (this.anIntArrayArray37 != null && !Static306.method5419(this.anInt7256, this.anInt7248)) {
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArray456 != null && (this.anInt7248 & 0x800) == 0 && (this.anInt7248 & 0x40000) == 0) {
			this.anIntArray456 = null;
			this.anIntArray460 = null;
			this.anIntArray457 = null;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7228; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray461[local15] + this.anIntArray458[local15] * local9 >> 14;
			this.anIntArray458[local15] = local13 * this.anIntArray458[local15] - local9 * this.anIntArray461[local15] >> 14;
			this.anIntArray461[local15] = local33;
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7228; local15++) {
			@Pc(34) int local34 = this.anIntArray462[local15] * local13 - this.anIntArray458[local15] * local9 >> 14;
			this.anIntArray458[local15] = this.anIntArray458[local15] * local13 + this.anIntArray462[local15] * local9 >> 14;
			this.anIntArray462[local15] = local34;
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7248;
	}

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7234;
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "(I)V")
	public void method6176() {
		if (this.aClass51_4 != null) {
			this.aClass51_4.method1963();
		}
		if (this.aClass51_2 != null) {
			this.aClass51_2.method1963();
		}
		if (this.aClass51_3 != null) {
			this.aClass51_3.method1963();
		}
		if (this.aClass51_1 != null) {
			this.aClass51_1.method1963();
		}
		if (this.aClass282_1 != null) {
			this.aClass282_1.method7400();
		}
	}

	@OriginalMember(owner = "client!nca", name = "d", descriptor = "()[Lclient!nn;")
	@Override
	public Class227[] method6689() {
		return this.aClass227Array4;
	}

	@OriginalMember(owner = "client!nca", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static384.anInt7431 = 0;
			Static122.anInt10526 = 0;
			Static223.anInt4979 = 0;
			for (local17 = 0; local17 < this.anInt7228; local17++) {
				Static384.anInt7431 += this.anIntArray461[local17];
				Static223.anInt4979 += this.anIntArray462[local17];
				Static122.anInt10526 += this.anIntArray458[local17];
				local9++;
			}
			if (local9 > 0) {
				Static122.anInt10526 = arg3 + Static122.anInt10526 / local9;
				Static223.anInt4979 = arg2 + Static223.anInt4979 / local9;
				Static384.anInt7431 = arg1 + Static384.anInt7431 / local9;
			} else {
				Static223.anInt4979 = arg2;
				Static122.anInt10526 = arg3;
				Static384.anInt7431 = arg1;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt7228; local9++) {
				this.anIntArray461[local9] += arg1;
				this.anIntArray462[local9] += arg2;
				this.anIntArray458[local9] += arg3;
			}
		} else {
			@Pc(158) int local158;
			@Pc(176) int local176;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt7228; local9++) {
					this.anIntArray461[local9] -= Static384.anInt7431;
					this.anIntArray462[local9] -= Static223.anInt4979;
					this.anIntArray458[local9] -= Static122.anInt10526;
					if (arg3 != 0) {
						local17 = Class177.anIntArray361[arg3];
						local158 = Class177.anIntArray360[arg3];
						local176 = local158 * this.anIntArray461[local9] + this.anIntArray462[local9] * local17 + 16383 >> 14;
						this.anIntArray462[local9] = this.anIntArray462[local9] * local158 + 16383 - this.anIntArray461[local9] * local17 >> 14;
						this.anIntArray461[local9] = local176;
					}
					if (arg1 != 0) {
						local17 = Class177.anIntArray361[arg1];
						local158 = Class177.anIntArray360[arg1];
						local176 = this.anIntArray462[local9] * local158 + 16383 - local17 * this.anIntArray458[local9] >> 14;
						this.anIntArray458[local9] = this.anIntArray458[local9] * local158 + this.anIntArray462[local9] * local17 + 16383 >> 14;
						this.anIntArray462[local9] = local176;
					}
					if (arg2 != 0) {
						local17 = Class177.anIntArray361[arg2];
						local158 = Class177.anIntArray360[arg2];
						local176 = local158 * this.anIntArray461[local9] + this.anIntArray458[local9] * local17 + 16383 >> 14;
						this.anIntArray458[local9] = local158 * this.anIntArray458[local9] + 16383 - local17 * this.anIntArray461[local9] >> 14;
						this.anIntArray461[local9] = local176;
					}
					this.anIntArray461[local9] += Static384.anInt7431;
					this.anIntArray462[local9] += Static223.anInt4979;
					this.anIntArray458[local9] += Static122.anInt10526;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt7228; local9++) {
					this.anIntArray461[local9] -= Static384.anInt7431;
					this.anIntArray462[local9] -= Static223.anInt4979;
					this.anIntArray458[local9] -= Static122.anInt10526;
					this.anIntArray461[local9] = this.anIntArray461[local9] * arg1 / 128;
					this.anIntArray462[local9] = this.anIntArray462[local9] * arg2 / 128;
					this.anIntArray458[local9] = this.anIntArray458[local9] * arg3 / 128;
					this.anIntArray461[local9] += Static384.anInt7431;
					this.anIntArray462[local9] += Static223.anInt4979;
					this.anIntArray458[local9] += Static122.anInt10526;
				}
			} else {
				@Pc(497) Class96 local497;
				@Pc(502) Class77 local502;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt7258; local9++) {
						local17 = arg1 * 8 + (this.aByteArray95[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray95[local9] = (byte) local17;
					}
					if (this.aClass96Array1 != null) {
						for (local17 = 0; local17 < this.anInt7213; local17++) {
							local497 = this.aClass96Array1[local17];
							local502 = this.aClass77Array1[local17];
							local502.anInt2862 = local502.anInt2862 & 0xFFFFFF | 255 - (this.aByteArray95[local497.anInt3291] & 0xFF) << 24;
						}
					}
					this.method6182();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt7258; local9++) {
						local17 = this.aShortArray85[local9] & 0xFFFF;
						local158 = local17 >> 10 & 0x3F;
						local176 = local17 >> 7 & 0x7;
						local176 += arg2 / 4;
						@Pc(571) int local571 = local17 & 0x7F;
						@Pc(577) int local577 = local158 + arg1 & 0x3F;
						local571 += arg3;
						if (local176 < 0) {
							local176 = 0;
						} else if (local176 > 7) {
							local176 = 7;
						}
						if (local571 < 0) {
							local571 = 0;
						} else if (local571 > 127) {
							local571 = 127;
						}
						this.aShortArray85[local9] = (short) (local176 << 7 | local577 << 10 | local571);
					}
					if (this.aClass96Array1 != null) {
						for (local17 = 0; local17 < this.anInt7213; local17++) {
							local497 = this.aClass96Array1[local17];
							local502 = this.aClass77Array1[local17];
							local502.anInt2862 = Static195.anIntArray226[this.aShortArray85[local497.anInt3291] & 0xFFFF] & 0xFFFFFF | local502.anInt2862 & 0xFF000000;
						}
					}
					this.method6182();
				} else {
					@Pc(687) Class77 local687;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt7213; local9++) {
							local687 = this.aClass77Array1[local9];
							local687.anInt2860 += arg2;
							local687.anInt2864 += arg1;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt7213; local9++) {
							local687 = this.aClass77Array1[local9];
							local687.anInt2868 = local687.anInt2868 * arg2 >> 7;
							local687.anInt2871 = local687.anInt2871 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt7213; local9++) {
							local687 = this.aClass77Array1[local9];
							local687.anInt2858 = local687.anInt2858 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7228; local3++) {
			if (arg0 != 128) {
				this.anIntArray461[local3] = arg0 * this.anIntArray461[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray462[local3] = arg1 * this.anIntArray462[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray458[local3] = arg2 * this.anIntArray458[local3] >> 7;
			}
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILclient!fc;)V")
	private void method6177(@OriginalArg(1) Class2_Sub6_Sub7_Sub1 arg0) {
		if (this.anInt7257 > Static504.anIntArray605.length) {
			Static33.anIntArray290 = new int[this.anInt7257];
			Static504.anIntArray605 = new int[this.anInt7257];
		}
		@Pc(50) int local50;
		@Pc(89) int local89;
		@Pc(98) int local98;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7228; local23++) {
			local50 = (this.anIntArray461[local23] - (this.aClass20_Sub2_17.anInt1560 * this.anIntArray462[local23] >> 8) >> this.aClass20_Sub2_17.anInt1550) - arg0.anInt3510;
			@Pc(75) int local75 = (this.anIntArray458[local23] - (this.aClass20_Sub2_17.anInt1553 * this.anIntArray462[local23] >> 8) >> this.aClass20_Sub2_17.anInt1550) - arg0.anInt3515;
			@Pc(80) int local80 = this.anIntArray459[local23];
			@Pc(87) int local87 = this.anIntArray459[local23 + 1];
			for (local89 = local80; local89 < local87; local89++) {
				local98 = this.aShortArray83[local89] - 1;
				if (local98 == -1) {
					break;
				}
				Static504.anIntArray605[local98] = local50;
				Static33.anIntArray290[local98] = local75;
			}
		}
		for (local50 = 0; local50 < this.anInt7281; local50++) {
			if (this.aByteArray95 == null || this.aByteArray95[local50] <= 128) {
				@Pc(138) short local138 = this.aShortArray89[local50];
				@Pc(143) short local143 = this.aShortArray88[local50];
				@Pc(148) short local148 = this.aShortArray90[local50];
				local89 = Static504.anIntArray605[local138];
				local98 = Static504.anIntArray605[local143];
				@Pc(160) int local160 = Static504.anIntArray605[local148];
				@Pc(164) int local164 = Static33.anIntArray290[local138];
				@Pc(168) int local168 = Static33.anIntArray290[local143];
				@Pc(172) int local172 = Static33.anIntArray290[local148];
				if (-((local160 - local98) * (-local164 + local168)) + (local168 - local172) * (local89 - local98) > 0) {
					arg0.method3203(local164, local89, local98, local168, local172, local160);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class177.anIntArray361[arg0];
		@Pc(13) int local13 = Class177.anIntArray360[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7228; local15++) {
			local33 = this.anIntArray461[local15] * local13 + this.anIntArray458[local15] * local9 >> 14;
			this.anIntArray458[local15] = local13 * this.anIntArray458[local15] - local9 * this.anIntArray461[local15] >> 14;
			this.anIntArray461[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7257; local33++) {
			@Pc(84) int local84 = this.aShortArray81[local33] * local9 + this.aShortArray86[local33] * local13 >> 14;
			this.aShortArray81[local33] = (short) (local13 * this.aShortArray81[local33] - local9 * this.aShortArray86[local33] >> 14);
			this.aShortArray86[local33] = (short) local84;
		}
		this.method6179();
		this.method6185();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "f", descriptor = "(I)Z")
	private boolean method6178() {
		if (this.aClass282_1.aBoolean642) {
			return true;
		}
		if (this.aClass282_1.anInterface24_6 == null) {
			this.aClass282_1.anInterface24_6 = this.aClass20_Sub2_17.method1474(this.aBoolean530);
		}
		@Pc(28) Interface24 local28 = this.aClass282_1.anInterface24_6;
		local28.method6476(this.anInt7281 * 6);
		@Pc(40) Buffer local40 = local28.method6477();
		if (local40 != null) {
			@Pc(56) Stream local56 = this.aClass20_Sub2_17.method1527(local40);
			@Pc(60) int local60;
			if (Stream.c()) {
				for (local60 = 0; local60 < this.anInt7281; local60++) {
					local56.d(this.aShortArray89[local60]);
					local56.d(this.aShortArray88[local60]);
					local56.d(this.aShortArray90[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt7281; local60++) {
					local56.a(this.aShortArray89[local60]);
					local56.a(this.aShortArray88[local60]);
					local56.a(this.aShortArray90[local60]);
				}
			}
			local56.a();
			if (local28.method6474()) {
				this.aClass282_1.aBoolean642 = true;
				this.aBoolean528 = true;
				this.aClass282_1.anInterface24_5 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!bca;IZ)V")
	@Override
	public void method6680(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray87 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7228; local14++) {
			if ((arg1 & this.aShortArray87[local14]) != 0) {
				if (arg2) {
					arg0.method4647(this.anIntArray461[local14], this.anIntArray462[local14], this.anIntArray458[local14], local12);
				} else {
					arg0.method4652(this.anIntArray461[local14], this.anIntArray462[local14], this.anIntArray458[local14], local12);
				}
				this.anIntArray461[local14] = local12[0];
				this.anIntArray462[local14] = local12[1];
				this.anIntArray458[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "g", descriptor = "(I)V")
	private void method6179() {
		if (this.aClass51_4 != null) {
			this.aClass51_4.aBoolean170 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7228; local7++) {
			if (arg0 != 0) {
				this.anIntArray461[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray462[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray458[local7] += arg2;
			}
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLclient!nca;Lclient!nca;IZI)Lclient!ka;")
	private Class166 method6180(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class166_Sub2 arg1, @OriginalArg(2) Class166_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		arg2.anInt7270 = this.anInt7270;
		arg2.anInt7258 = this.anInt7258;
		arg2.anInt7257 = this.anInt7257;
		arg2.aShort79 = this.aShort79;
		arg2.anInt7228 = this.anInt7228;
		arg2.anInt7281 = this.anInt7281;
		arg2.anInt7248 = arg3;
		arg2.anInt7256 = this.anInt7256;
		arg2.anInt7213 = this.anInt7213;
		arg2.aBoolean532 = this.aBoolean532;
		if ((arg3 & 0x100) == 0) {
			arg2.aBoolean529 = this.aBoolean529;
		} else {
			arg2.aBoolean529 = true;
		}
		arg2.aShort80 = this.aShort80;
		@Pc(70) boolean local70 = Static618.method9021(this.anInt7256, arg3);
		@Pc(78) boolean local78 = Static209.method4124(arg3, this.anInt7256);
		@Pc(84) boolean local84 = Static297.method5316(this.anInt7256, arg3);
		@Pc(90) boolean local90 = local70 | local78 | local84;
		@Pc(209) int local209;
		if (local90) {
			if (!local70) {
				arg2.anIntArray461 = this.anIntArray461;
			} else if (arg1.anIntArray461 == null || arg1.anIntArray461.length < this.anInt7270) {
				arg2.anIntArray461 = arg1.anIntArray461 = new int[this.anInt7270];
			} else {
				arg2.anIntArray461 = arg1.anIntArray461;
			}
			if (!local78) {
				arg2.anIntArray462 = this.anIntArray462;
			} else if (arg1.anIntArray462 == null || this.anInt7270 > arg1.anIntArray462.length) {
				arg2.anIntArray462 = arg1.anIntArray462 = new int[this.anInt7270];
			} else {
				arg2.anIntArray462 = arg1.anIntArray462;
			}
			if (!local84) {
				arg2.anIntArray458 = this.anIntArray458;
			} else if (arg1.anIntArray458 == null || arg1.anIntArray458.length < this.anInt7270) {
				arg2.anIntArray458 = arg1.anIntArray458 = new int[this.anInt7270];
			} else {
				arg2.anIntArray458 = arg1.anIntArray458;
			}
			for (local209 = 0; local209 < this.anInt7270; local209++) {
				if (local70) {
					arg2.anIntArray461[local209] = this.anIntArray461[local209];
				}
				if (local78) {
					arg2.anIntArray462[local209] = this.anIntArray462[local209];
				}
				if (local84) {
					arg2.anIntArray458[local209] = this.anIntArray458[local209];
				}
			}
		} else {
			arg2.anIntArray461 = this.anIntArray461;
			arg2.anIntArray458 = this.anIntArray458;
			arg2.anIntArray462 = this.anIntArray462;
		}
		if (Static573.method8544(arg3, this.anInt7256)) {
			arg2.aClass51_4 = arg1.aClass51_4;
			arg2.aClass51_4.anInterface22_11 = this.aClass51_4.anInterface22_11;
			arg2.aClass51_4.aBoolean170 = this.aClass51_4.aBoolean170;
			arg2.aClass51_4.aBoolean169 = true;
		} else if (Static418.method6753(arg3, this.anInt7256)) {
			arg2.aClass51_4 = this.aClass51_4;
		} else {
			arg2.aClass51_4 = null;
		}
		if (Static145.method3218(arg3, this.anInt7256)) {
			if (arg1.aShortArray85 == null || arg1.aShortArray85.length < this.anInt7258) {
				arg2.aShortArray85 = arg1.aShortArray85 = new short[this.anInt7258];
			} else {
				arg2.aShortArray85 = arg1.aShortArray85;
			}
			for (local209 = 0; local209 < this.anInt7258; local209++) {
				arg2.aShortArray85[local209] = this.aShortArray85[local209];
			}
		} else {
			arg2.aShortArray85 = this.aShortArray85;
		}
		if (Static554.method8265(this.anInt7256, arg3)) {
			if (arg1.aByteArray95 == null || arg1.aByteArray95.length < this.anInt7258) {
				arg2.aByteArray95 = arg1.aByteArray95 = new byte[this.anInt7258];
			} else {
				arg2.aByteArray95 = arg1.aByteArray95;
			}
			for (local209 = 0; local209 < this.anInt7258; local209++) {
				arg2.aByteArray95[local209] = this.aByteArray95[local209];
			}
		} else {
			arg2.aByteArray95 = this.aByteArray95;
		}
		if (Static423.method6817(arg3, this.anInt7256)) {
			arg2.aClass51_3 = arg1.aClass51_3;
			arg2.aClass51_3.aBoolean169 = true;
			arg2.aClass51_3.aBoolean170 = this.aClass51_3.aBoolean170;
			arg2.aClass51_3.anInterface22_11 = this.aClass51_3.anInterface22_11;
		} else if (Static622.method9059(arg3, this.anInt7256)) {
			arg2.aClass51_3 = this.aClass51_3;
		} else {
			arg2.aClass51_3 = null;
		}
		@Pc(598) int local598;
		if (Static588.method8686(arg3, this.anInt7256)) {
			if (arg1.aShortArray86 == null || arg1.aShortArray86.length < this.anInt7257) {
				local209 = this.anInt7257;
				arg2.aShortArray81 = arg1.aShortArray81 = new short[local209];
				arg2.aShortArray86 = arg1.aShortArray86 = new short[local209];
				arg2.aShortArray82 = arg1.aShortArray82 = new short[local209];
			} else {
				arg2.aShortArray81 = arg1.aShortArray81;
				arg2.aShortArray86 = arg1.aShortArray86;
				arg2.aShortArray82 = arg1.aShortArray82;
			}
			if (this.aClass246_1 == null) {
				arg2.aClass246_1 = null;
				for (local209 = 0; local209 < this.anInt7257; local209++) {
					arg2.aShortArray86[local209] = this.aShortArray86[local209];
					arg2.aShortArray82[local209] = this.aShortArray82[local209];
					arg2.aShortArray81[local209] = this.aShortArray81[local209];
				}
			} else {
				if (arg1.aClass246_1 == null) {
					arg1.aClass246_1 = new Class246();
				}
				@Pc(582) Class246 local582 = arg2.aClass246_1 = arg1.aClass246_1;
				if (local582.aShortArray104 == null || this.anInt7257 > local582.aShortArray104.length) {
					local598 = this.anInt7257;
					local582.aByteArray101 = new byte[local598];
					local582.aShortArray104 = new short[local598];
					local582.aShortArray102 = new short[local598];
					local582.aShortArray103 = new short[local598];
				}
				for (local598 = 0; local598 < this.anInt7257; local598++) {
					arg2.aShortArray86[local598] = this.aShortArray86[local598];
					arg2.aShortArray82[local598] = this.aShortArray82[local598];
					arg2.aShortArray81[local598] = this.aShortArray81[local598];
					local582.aShortArray104[local598] = this.aClass246_1.aShortArray104[local598];
					local582.aShortArray103[local598] = this.aClass246_1.aShortArray103[local598];
					local582.aShortArray102[local598] = this.aClass246_1.aShortArray102[local598];
					local582.aByteArray101[local598] = this.aClass246_1.aByteArray101[local598];
				}
			}
			arg2.aByteArray94 = this.aByteArray94;
		} else {
			arg2.aByteArray94 = this.aByteArray94;
			arg2.aClass246_1 = this.aClass246_1;
			arg2.aShortArray81 = this.aShortArray81;
			arg2.aShortArray86 = this.aShortArray86;
			arg2.aShortArray82 = this.aShortArray82;
		}
		if (Static373.method6255(arg3, this.anInt7256)) {
			arg2.aClass51_1 = arg1.aClass51_1;
			arg2.aClass51_1.anInterface22_11 = this.aClass51_1.anInterface22_11;
			arg2.aClass51_1.aBoolean169 = true;
			arg2.aClass51_1.aBoolean170 = this.aClass51_1.aBoolean170;
		} else if (Static460.method7173(this.anInt7256, arg3)) {
			arg2.aClass51_1 = this.aClass51_1;
		} else {
			arg2.aClass51_1 = null;
		}
		if (Static461.method6811(arg3, this.anInt7256)) {
			if (arg1.aFloatArray61 == null || this.anInt7258 > arg1.aFloatArray61.length) {
				local209 = this.anInt7257;
				arg2.aFloatArray62 = arg1.aFloatArray62 = new float[local209];
				arg2.aFloatArray61 = arg1.aFloatArray61 = new float[local209];
			} else {
				arg2.aFloatArray61 = arg1.aFloatArray61;
				arg2.aFloatArray62 = arg1.aFloatArray62;
			}
			for (local209 = 0; local209 < this.anInt7257; local209++) {
				arg2.aFloatArray61[local209] = this.aFloatArray61[local209];
				arg2.aFloatArray62[local209] = this.aFloatArray62[local209];
			}
		} else {
			arg2.aFloatArray61 = this.aFloatArray61;
			arg2.aFloatArray62 = this.aFloatArray62;
		}
		if (Static452.method7103(this.anInt7256, arg3)) {
			arg2.aClass51_2 = arg1.aClass51_2;
			arg2.aClass51_2.anInterface22_11 = this.aClass51_2.anInterface22_11;
			arg2.aClass51_2.aBoolean170 = this.aClass51_2.aBoolean170;
			arg2.aClass51_2.aBoolean169 = true;
		} else if (Static145.method3222(this.anInt7256, arg3)) {
			arg2.aClass51_2 = this.aClass51_2;
		} else {
			arg2.aClass51_2 = null;
		}
		if (Static338.method5846(arg3, this.anInt7256)) {
			if (arg1.aShortArray89 == null || this.anInt7258 > arg1.aShortArray89.length) {
				local209 = this.anInt7258;
				arg2.aShortArray90 = arg1.aShortArray90 = new short[local209];
				arg2.aShortArray88 = arg1.aShortArray88 = new short[local209];
				arg2.aShortArray89 = arg1.aShortArray89 = new short[local209];
			} else {
				arg2.aShortArray89 = arg1.aShortArray89;
				arg2.aShortArray88 = arg1.aShortArray88;
				arg2.aShortArray90 = arg1.aShortArray90;
			}
			for (local209 = 0; local209 < this.anInt7258; local209++) {
				arg2.aShortArray89[local209] = this.aShortArray89[local209];
				arg2.aShortArray88[local209] = this.aShortArray88[local209];
				arg2.aShortArray90[local209] = this.aShortArray90[local209];
			}
		} else {
			arg2.aShortArray88 = this.aShortArray88;
			arg2.aShortArray90 = this.aShortArray90;
			arg2.aShortArray89 = this.aShortArray89;
		}
		if (Static206.method4087(this.anInt7256, arg3)) {
			arg2.aClass282_1 = arg1.aClass282_1;
			arg2.aClass282_1.aBoolean642 = this.aClass282_1.aBoolean642;
			arg2.aClass282_1.aBoolean641 = true;
			arg2.aClass282_1.anInterface24_5 = this.aClass282_1.anInterface24_5;
		} else if (Static158.method3486(arg3, this.anInt7256)) {
			arg2.aClass282_1 = this.aClass282_1;
		} else {
			arg2.aClass282_1 = null;
		}
		if (Static594.method8742(this.anInt7256, arg3)) {
			if (arg1.aShortArray79 == null || arg1.aShortArray79.length < this.anInt7258) {
				local209 = this.anInt7258;
				arg2.aShortArray79 = arg1.aShortArray79 = new short[local209];
			} else {
				arg2.aShortArray79 = arg1.aShortArray79;
			}
			for (local209 = 0; local209 < this.anInt7258; local209++) {
				arg2.aShortArray79[local209] = this.aShortArray79[local209];
			}
		} else {
			arg2.aShortArray79 = this.aShortArray79;
		}
		if (!Static567.method8485(arg3, this.anInt7256)) {
			arg2.aClass77Array1 = this.aClass77Array1;
		} else if (arg1.aClass77Array1 == null || this.anInt7213 > arg1.aClass77Array1.length) {
			local209 = this.anInt7213;
			arg2.aClass77Array1 = arg1.aClass77Array1 = new Class77[local209];
			for (local598 = 0; local598 < this.anInt7213; local598++) {
				arg2.aClass77Array1[local598] = this.aClass77Array1[local598].method2672();
			}
		} else {
			arg2.aClass77Array1 = arg1.aClass77Array1;
			for (local209 = 0; local209 < this.anInt7213; local209++) {
				arg2.aClass77Array1[local209].method2671(this.aClass77Array1[local209]);
			}
		}
		if (this.aBoolean531) {
			arg2.anInt7221 = this.anInt7221;
			arg2.anInt7278 = this.anInt7278;
			arg2.anInt7252 = this.anInt7252;
			arg2.anInt7277 = this.anInt7277;
			arg2.aBoolean531 = true;
			arg2.anInt7210 = this.anInt7210;
			arg2.anInt7247 = this.anInt7247;
			arg2.anInt7276 = this.anInt7276;
			arg2.anInt7234 = this.anInt7234;
		} else {
			arg2.aBoolean531 = false;
		}
		arg2.aClass87Array4 = this.aClass87Array4;
		arg2.aShortArray80 = this.aShortArray80;
		arg2.anIntArrayArray39 = this.anIntArrayArray39;
		arg2.anIntArray459 = this.anIntArray459;
		arg2.aShortArray78 = this.aShortArray78;
		arg2.aShortArray87 = this.aShortArray87;
		arg2.anIntArray456 = this.anIntArray456;
		arg2.aShortArray83 = this.aShortArray83;
		arg2.anIntArray460 = this.anIntArray460;
		arg2.aClass96Array1 = this.aClass96Array1;
		arg2.anIntArrayArray38 = this.anIntArrayArray38;
		arg2.anIntArray457 = this.anIntArray457;
		arg2.aClass227Array4 = this.aClass227Array4;
		arg2.anIntArrayArray37 = this.anIntArrayArray37;
		arg2.aShortArray84 = this.aShortArray84;
		return arg2;
	}

	@OriginalMember(owner = "client!nca", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7210;
	}

	@OriginalMember(owner = "client!nca", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort80;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!bca;)V")
	@Override
	public void method6690(@OriginalArg(0) Class30 arg0) {
		@Pc(8) Class30_Sub2 local8 = (Class30_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass227Array4 != null) {
			for (local13 = 0; local13 < this.aClass227Array4.length; local13++) {
				@Pc(20) Class227 local20 = this.aClass227Array4[local13];
				@Pc(22) Class227 local22 = local20;
				if (local20.aClass227_1 != null) {
					local22 = local20.aClass227_1;
				}
				local22.anInt7394 = (int) (local8.aFloat128 + (float) this.anIntArray458[local20.anInt7393] * local8.aFloat121 + (float) this.anIntArray461[local20.anInt7393] * local8.aFloat124 + local8.aFloat120 * (float) this.anIntArray462[local20.anInt7393]);
				local22.anInt7400 = (int) (local8.aFloat123 + (float) this.anIntArray458[local20.anInt7393] * local8.aFloat129 + (float) this.anIntArray461[local20.anInt7393] * local8.aFloat122 + (float) this.anIntArray462[local20.anInt7393] * local8.aFloat126);
				local22.anInt7398 = (int) ((float) this.anIntArray462[local20.anInt7393] * local8.aFloat119 + local8.aFloat130 * (float) this.anIntArray461[local20.anInt7393] + (float) this.anIntArray458[local20.anInt7393] * local8.aFloat125 + local8.aFloat127);
				local22.anInt7395 = (int) (local8.aFloat124 * (float) this.anIntArray461[local20.anInt7390] + (float) this.anIntArray462[local20.anInt7390] * local8.aFloat120 + (float) this.anIntArray458[local20.anInt7390] * local8.aFloat121 + local8.aFloat128);
				local22.anInt7399 = (int) (local8.aFloat123 + (float) this.anIntArray458[local20.anInt7390] * local8.aFloat129 + local8.aFloat122 * (float) this.anIntArray461[local20.anInt7390] + local8.aFloat126 * (float) this.anIntArray462[local20.anInt7390]);
				local22.anInt7392 = (int) (local8.aFloat127 + local8.aFloat125 * (float) this.anIntArray458[local20.anInt7390] + local8.aFloat119 * (float) this.anIntArray462[local20.anInt7390] + local8.aFloat130 * (float) this.anIntArray461[local20.anInt7390]);
				local22.anInt7389 = (int) (local8.aFloat128 + local8.aFloat120 * (float) this.anIntArray462[local20.anInt7401] + (float) this.anIntArray461[local20.anInt7401] * local8.aFloat124 + (float) this.anIntArray458[local20.anInt7401] * local8.aFloat121);
				local22.anInt7388 = (int) ((float) this.anIntArray458[local20.anInt7401] * local8.aFloat129 + (float) this.anIntArray462[local20.anInt7401] * local8.aFloat126 + local8.aFloat122 * (float) this.anIntArray461[local20.anInt7401] + local8.aFloat123);
				local22.anInt7396 = (int) (local8.aFloat130 * (float) this.anIntArray461[local20.anInt7401] + local8.aFloat119 * (float) this.anIntArray462[local20.anInt7401] + (float) this.anIntArray458[local20.anInt7401] * local8.aFloat125 + local8.aFloat127);
			}
		}
		if (this.aClass87Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass87Array4.length; local13++) {
			@Pc(365) Class87 local365 = this.aClass87Array4[local13];
			@Pc(367) Class87 local367 = local365;
			if (local365.aClass87_1 != null) {
				local367 = local365.aClass87_1;
			}
			if (local365.aClass30_4 == null) {
				local365.aClass30_4 = local8.method4662();
			} else {
				local365.aClass30_4.method4653(local8);
			}
			local367.anInt3133 = (int) ((float) this.anIntArray462[local365.anInt3139] * local8.aFloat120 + (float) this.anIntArray461[local365.anInt3139] * local8.aFloat124 + (float) this.anIntArray458[local365.anInt3139] * local8.aFloat121 + local8.aFloat128);
			local367.anInt3134 = (int) ((float) this.anIntArray458[local365.anInt3139] * local8.aFloat129 + local8.aFloat126 * (float) this.anIntArray462[local365.anInt3139] + (float) this.anIntArray461[local365.anInt3139] * local8.aFloat122 + local8.aFloat123);
			local367.anInt3135 = (int) ((float) this.anIntArray462[local365.anInt3139] * local8.aFloat119 + (float) this.anIntArray461[local365.anInt3139] * local8.aFloat130 + (float) this.anIntArray458[local365.anInt3139] * local8.aFloat125 + local8.aFloat127);
		}
	}

	@OriginalMember(owner = "client!nca", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7221;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!bca;Lclient!iw;II)V")
	@Override
	public void method6678(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7257 == 0) {
			return;
		}
		@Pc(13) Class30_Sub2 local13 = this.aClass20_Sub2_17.aClass30_Sub2_16;
		@Pc(16) Class30_Sub2 local16 = (Class30_Sub2) arg0;
		if (!this.aBoolean531) {
			this.method6187();
		}
		Static529.aFloat202 = local13.aFloat127 + local16.aFloat123 * local13.aFloat119 + local16.aFloat128 * local13.aFloat130 + local16.aFloat127 * local13.aFloat125;
		Static131.aFloat100 = local13.aFloat119 * local16.aFloat126 + local13.aFloat130 * local16.aFloat120 + local13.aFloat125 * local16.aFloat119;
		@Pc(69) float local69 = Static529.aFloat202 + (float) this.anInt7247 * Static131.aFloat100;
		@Pc(77) float local77 = Static131.aFloat100 * (float) this.anInt7277 + Static529.aFloat202;
		@Pc(94) float local94;
		@Pc(87) float local87;
		if (local77 < local69) {
			local87 = local69 + (float) this.anInt7278;
			local94 = (float) -this.anInt7278 + local77;
		} else {
			local94 = (float) -this.anInt7278 + local69;
			local87 = (float) this.anInt7278 + local77;
		}
		if (this.aClass20_Sub2_17.aFloat50 <= local94 || (float) this.aClass20_Sub2_17.anInt1543 >= local87) {
			return;
		}
		Static355.aFloat161 = local13.aFloat124 * local16.aFloat120 + local16.aFloat126 * local13.aFloat120 + local16.aFloat119 * local13.aFloat121;
		Static121.aFloat201 = local16.aFloat123 * local13.aFloat120 + local13.aFloat124 * local16.aFloat128 + local13.aFloat121 * local16.aFloat127 + local13.aFloat128;
		@Pc(171) float local171 = (float) this.anInt7247 * Static355.aFloat161 + Static121.aFloat201;
		@Pc(179) float local179 = Static355.aFloat161 * (float) this.anInt7277 + Static121.aFloat201;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local179 < local171) {
			local194 = (float) this.aClass20_Sub2_17.anInt1558 * ((float) this.anInt7278 + local171);
			local206 = (float) this.aClass20_Sub2_17.anInt1558 * (local179 - (float) this.anInt7278);
		} else {
			local194 = (float) this.aClass20_Sub2_17.anInt1558 * ((float) this.anInt7278 + local179);
			local206 = ((float) -this.anInt7278 + local171) * (float) this.aClass20_Sub2_17.anInt1558;
		}
		if (this.aClass20_Sub2_17.aFloat57 <= local206 / (float) arg2 || local194 / (float) arg2 <= this.aClass20_Sub2_17.aFloat54) {
			return;
		}
		Static63.aFloat78 = local16.aFloat119 * local13.aFloat129 + local13.aFloat126 * local16.aFloat126 + local16.aFloat120 * local13.aFloat122;
		Static22.aFloat10 = local13.aFloat123 + local13.aFloat122 * local16.aFloat128 + local16.aFloat123 * local13.aFloat126 + local16.aFloat127 * local13.aFloat129;
		@Pc(297) float local297 = Static22.aFloat10 + Static63.aFloat78 * (float) this.anInt7247;
		@Pc(305) float local305 = (float) this.anInt7277 * Static63.aFloat78 + Static22.aFloat10;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = (float) this.aClass20_Sub2_17.anInt1561 * (local297 + (float) this.anInt7278);
			local332 = ((float) -this.anInt7278 + local305) * (float) this.aClass20_Sub2_17.anInt1561;
		} else {
			local320 = (local305 + (float) this.anInt7278) * (float) this.aClass20_Sub2_17.anInt1561;
			local332 = (float) this.aClass20_Sub2_17.anInt1561 * (local297 - (float) this.anInt7278);
		}
		if (local332 / (float) arg2 >= this.aClass20_Sub2_17.aFloat64 || local320 / (float) arg2 <= this.aClass20_Sub2_17.aFloat52) {
			return;
		}
		if (arg1 != null || this.aClass96Array1 != null) {
			Static260.aFloat170 = local13.aFloat120 * local16.aFloat122 + local13.aFloat124 * local16.aFloat124 + local13.aFloat121 * local16.aFloat130;
			Static329.aFloat156 = local13.aFloat124 * local16.aFloat121 + local16.aFloat129 * local13.aFloat120 + local16.aFloat125 * local13.aFloat121;
			Static464.aFloat171 = local13.aFloat122 * local16.aFloat121 + local13.aFloat126 * local16.aFloat129 + local13.aFloat129 * local16.aFloat125;
			Static492.aFloat197 = local16.aFloat130 * local13.aFloat125 + local13.aFloat119 * local16.aFloat122 + local13.aFloat130 * local16.aFloat124;
			Static269.aFloat152 = local16.aFloat124 * local13.aFloat122 + local16.aFloat122 * local13.aFloat126 + local13.aFloat129 * local16.aFloat130;
			Static199.aFloat174 = local13.aFloat130 * local16.aFloat121 + local13.aFloat119 * local16.aFloat129 + local16.aFloat125 * local13.aFloat125;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt7252 + this.anInt7276 >> 1;
			@Pc(507) int local507 = this.anInt7221 + this.anInt7234 >> 1;
			@Pc(526) int local526 = (int) (Static121.aFloat201 + (float) local499 * Static260.aFloat170 + Static355.aFloat161 * (float) this.anInt7247 + (float) local507 * Static329.aFloat156);
			@Pc(545) int local545 = (int) (Static22.aFloat10 + Static269.aFloat152 * (float) local499 + (float) this.anInt7247 * Static63.aFloat78 + Static464.aFloat171 * (float) local507);
			@Pc(564) int local564 = (int) ((float) this.anInt7247 * Static131.aFloat100 + Static492.aFloat197 * (float) local499 + Static529.aFloat202 + (float) local507 * Static199.aFloat174);
			@Pc(583) int local583 = (int) ((float) this.anInt7277 * Static355.aFloat161 + Static121.aFloat201 + Static260.aFloat170 * (float) local499 + Static329.aFloat156 * (float) local507);
			@Pc(602) int local602 = (int) (Static464.aFloat171 * (float) local507 + Static22.aFloat10 + Static269.aFloat152 * (float) local499 + Static63.aFloat78 * (float) this.anInt7277);
			arg1.anInt5417 = local545 * this.aClass20_Sub2_17.anInt1561 / arg2 + this.aClass20_Sub2_17.anInt1559;
			arg1.anInt5420 = this.aClass20_Sub2_17.anInt1542 + local526 * this.aClass20_Sub2_17.anInt1558 / arg2;
			arg1.anInt5419 = this.aClass20_Sub2_17.anInt1559 + this.aClass20_Sub2_17.anInt1561 * local602 / arg2;
			arg1.anInt5421 = local583 * this.aClass20_Sub2_17.anInt1558 / arg2 + this.aClass20_Sub2_17.anInt1542;
			@Pc(675) int local675 = (int) (Static199.aFloat174 * (float) local507 + (float) this.anInt7277 * Static131.aFloat100 + Static492.aFloat197 * (float) local499 + Static529.aFloat202);
			if (this.aClass20_Sub2_17.anInt1543 <= local564 || local675 >= this.aClass20_Sub2_17.anInt1543) {
				arg1.anInt5418 = this.aClass20_Sub2_17.anInt1542 + (this.anInt7278 + local526) * this.aClass20_Sub2_17.anInt1558 / arg2 - arg1.anInt5420;
				arg1.aBoolean411 = true;
			}
		}
		this.aClass20_Sub2_17.method1501((float) arg2);
		this.aClass20_Sub2_17.method1491();
		this.aClass20_Sub2_17.method1449(local16);
		this.method6184();
		this.method6171();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IJIIIIFIFLclient!bh;I)S")
	private short method6181(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) Class32 arg8, @OriginalArg(10) int arg9) {
		@Pc(16) int local16 = this.anIntArray459[arg6];
		@Pc(23) int local23 = this.anIntArray459[arg6 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(34) short local34 = this.aShortArray83[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (arg1 == Static146.aLongArray7[local27]) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray83[local25] = (short) (this.anInt7257 + 1);
		Static146.aLongArray7[local25] = arg1;
		this.aShortArray78[this.anInt7257] = (short) arg2;
		this.aShortArray84[this.anInt7257] = (short) arg6;
		this.aShortArray86[this.anInt7257] = (short) arg4;
		this.aShortArray82[this.anInt7257] = (short) arg9;
		this.aShortArray81[this.anInt7257] = (short) arg0;
		this.aByteArray94[this.anInt7257] = (byte) arg3;
		this.aFloatArray61[this.anInt7257] = arg5;
		this.aFloatArray62[this.anInt7257] = arg7;
		return (short) this.anInt7257++;
	}

	@OriginalMember(owner = "client!nca", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean532;
	}

	@OriginalMember(owner = "client!nca", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort79;
	}

	@OriginalMember(owner = "client!nca", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7252;
	}

	@OriginalMember(owner = "client!nca", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7247;
	}

	@OriginalMember(owner = "client!nca", name = "h", descriptor = "(I)V")
	private void method6182() {
		if (this.aClass51_3 != null) {
			this.aClass51_3.aBoolean170 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6675(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			Static223.anInt4979 = 0;
			Static384.anInt7431 = 0;
			local28 = 0;
			Static122.anInt10526 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray38.length > local38) {
					local52 = this.anIntArrayArray38[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static384.anInt7431 += this.anIntArray461[local60];
						Static223.anInt4979 += this.anIntArray462[local60];
						Static122.anInt10526 += this.anIntArray458[local60];
						local28++;
					}
				}
			}
			if (local28 > 0) {
				Static223.anInt4979 = Static223.anInt4979 / local28 + local14;
				Static122.anInt10526 = Static122.anInt10526 / local28 + local22;
				Static384.anInt7431 = Static384.anInt7431 / local28 + local18;
			} else {
				Static223.anInt4979 = local14;
				Static122.anInt10526 = local22;
				Static384.anInt7431 = local18;
			}
			return;
		}
		@Pc(162) int[] local162;
		@Pc(164) int local164;
		if (arg0 == 1) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray38.length) {
					local162 = this.anIntArrayArray38[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray461[local54] += local18;
						this.anIntArray462[local54] += local14;
						this.anIntArray458[local54] += local22;
					}
				}
			}
			return;
		}
		@Pc(287) int local287;
		@Pc(305) int local305;
		@Pc(762) int local762;
		@Pc(771) int local771;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray38.length > local32) {
					local162 = this.anIntArrayArray38[local32];
					if ((arg5 & 0x1) == 0) {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray461[local54] -= Static384.anInt7431;
							this.anIntArray462[local54] -= Static223.anInt4979;
							this.anIntArray458[local54] -= Static122.anInt10526;
							if (arg4 != 0) {
								local60 = Class177.anIntArray361[arg4];
								local287 = Class177.anIntArray360[arg4];
								local305 = local287 * this.anIntArray461[local54] + this.anIntArray462[local54] * local60 + 16383 >> 14;
								this.anIntArray462[local54] = local287 * this.anIntArray462[local54] + 16383 - local60 * this.anIntArray461[local54] >> 14;
								this.anIntArray461[local54] = local305;
							}
							if (arg2 != 0) {
								local60 = Class177.anIntArray361[arg2];
								local287 = Class177.anIntArray360[arg2];
								local305 = local287 * this.anIntArray462[local54] + 16383 - local60 * this.anIntArray458[local54] >> 14;
								this.anIntArray458[local54] = local60 * this.anIntArray462[local54] + this.anIntArray458[local54] * local287 + 16383 >> 14;
								this.anIntArray462[local54] = local305;
							}
							if (arg3 != 0) {
								local60 = Class177.anIntArray361[arg3];
								local287 = Class177.anIntArray360[arg3];
								local305 = local60 * this.anIntArray458[local54] + local287 * this.anIntArray461[local54] + 16383 >> 14;
								this.anIntArray458[local54] = local287 * this.anIntArray458[local54] + 16383 - local60 * this.anIntArray461[local54] >> 14;
								this.anIntArray461[local54] = local305;
							}
							this.anIntArray461[local54] += Static384.anInt7431;
							this.anIntArray462[local54] += Static223.anInt4979;
							this.anIntArray458[local54] += Static122.anInt10526;
						}
					} else {
						for (local164 = 0; local164 < local162.length; local164++) {
							local54 = local162[local164];
							this.anIntArray461[local54] -= Static384.anInt7431;
							this.anIntArray462[local54] -= Static223.anInt4979;
							this.anIntArray458[local54] -= Static122.anInt10526;
							if (arg2 != 0) {
								local60 = Class177.anIntArray361[arg2];
								local287 = Class177.anIntArray360[arg2];
								local305 = this.anIntArray462[local54] * local287 + 16383 - local60 * this.anIntArray458[local54] >> 14;
								this.anIntArray458[local54] = this.anIntArray458[local54] * local287 + local60 * this.anIntArray462[local54] + 16383 >> 14;
								this.anIntArray462[local54] = local305;
							}
							if (arg4 != 0) {
								local60 = Class177.anIntArray361[arg4];
								local287 = Class177.anIntArray360[arg4];
								local305 = local287 * this.anIntArray461[local54] + local60 * this.anIntArray462[local54] + 16383 >> 14;
								this.anIntArray462[local54] = this.anIntArray462[local54] * local287 + 16383 - this.anIntArray461[local54] * local60 >> 14;
								this.anIntArray461[local54] = local305;
							}
							if (arg3 != 0) {
								local60 = Class177.anIntArray361[arg3];
								local287 = Class177.anIntArray360[arg3];
								local305 = local287 * this.anIntArray461[local54] + local60 * this.anIntArray458[local54] + 16383 >> 14;
								this.anIntArray458[local54] = this.anIntArray458[local54] * local287 + 16383 - this.anIntArray461[local54] * local60 >> 14;
								this.anIntArray461[local54] = local305;
							}
							this.anIntArray461[local54] += Static384.anInt7431;
							this.anIntArray462[local54] += Static223.anInt4979;
							this.anIntArray458[local54] += Static122.anInt10526;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray38.length) {
						local52 = this.anIntArrayArray38[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local287 = this.anIntArray459[local60];
							local305 = this.anIntArray459[local60 + 1];
							for (local762 = local287; local762 < local305; local762++) {
								local771 = this.aShortArray83[local762] - 1;
								if (local771 == -1) {
									break;
								}
								@Pc(783) int local783;
								@Pc(787) int local787;
								@Pc(805) int local805;
								if (arg4 != 0) {
									local783 = Class177.anIntArray361[arg4];
									local787 = Class177.anIntArray360[arg4];
									local805 = this.aShortArray82[local771] * local783 + this.aShortArray86[local771] * local787 + 16383 >> 14;
									this.aShortArray82[local771] = (short) (local787 * this.aShortArray82[local771] + 16383 - this.aShortArray86[local771] * local783 >> 14);
									this.aShortArray86[local771] = (short) local805;
								}
								if (arg2 != 0) {
									local783 = Class177.anIntArray361[arg2];
									local787 = Class177.anIntArray360[arg2];
									local805 = this.aShortArray82[local771] * local787 + 16383 - local783 * this.aShortArray81[local771] >> 14;
									this.aShortArray81[local771] = (short) (local787 * this.aShortArray81[local771] + this.aShortArray82[local771] * local783 + 16383 >> 14);
									this.aShortArray82[local771] = (short) local805;
								}
								if (arg3 != 0) {
									local783 = Class177.anIntArray361[arg3];
									local787 = Class177.anIntArray360[arg3];
									local805 = local787 * this.aShortArray86[local771] + local783 * this.aShortArray81[local771] + 16383 >> 14;
									this.aShortArray81[local771] = (short) (this.aShortArray81[local771] * local787 + 16383 - local783 * this.aShortArray86[local771] >> 14);
									this.aShortArray86[local771] = (short) local805;
								}
							}
						}
					}
				}
				this.method6185();
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray38.length > local32) {
					local162 = this.anIntArrayArray38[local32];
					for (local164 = 0; local164 < local162.length; local164++) {
						local54 = local162[local164];
						this.anIntArray461[local54] -= Static384.anInt7431;
						this.anIntArray462[local54] -= Static223.anInt4979;
						this.anIntArray458[local54] -= Static122.anInt10526;
						this.anIntArray461[local54] = this.anIntArray461[local54] * arg2 >> 7;
						this.anIntArray462[local54] = this.anIntArray462[local54] * arg3 >> 7;
						this.anIntArray458[local54] = arg4 * this.anIntArray458[local54] >> 7;
						this.anIntArray461[local54] += Static384.anInt7431;
						this.anIntArray462[local54] += Static223.anInt4979;
						this.anIntArray458[local54] += Static122.anInt10526;
					}
				}
			}
		} else {
			@Pc(1207) Class77 local1207;
			@Pc(1115) boolean local1115;
			@Pc(1202) Class96 local1202;
			if (arg0 == 5) {
				if (this.anIntArrayArray39 != null) {
					local1115 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray39.length > local38) {
							local52 = this.anIntArrayArray39[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local287 = (this.aByteArray95[local60] & 0xFF) + (arg2 * 8);
								if (local287 < 0) {
									local287 = 0;
								} else if (local287 > 255) {
									local287 = 255;
								}
								this.aByteArray95[local60] = (byte) local287;
							}
							local1115 |= local52.length > 0;
						}
					}
					if (local1115) {
						if (this.aClass96Array1 != null) {
							for (local38 = 0; local38 < this.anInt7213; local38++) {
								local1202 = this.aClass96Array1[local38];
								local1207 = this.aClass77Array1[local38];
								local1207.anInt2862 = local1207.anInt2862 & 0xFFFFFF | 255 - (this.aByteArray95[local1202.anInt3291] & 0xFF) << 24;
							}
						}
						this.method6182();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray39 != null) {
					local1115 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray39.length) {
							local52 = this.anIntArrayArray39[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local287 = this.aShortArray85[local60] & 0xFFFF;
								local305 = local287 >> 10 & 0x3F;
								local762 = local287 >> 7 & 0x7;
								local771 = local287 & 0x7F;
								local762 += arg3 / 4;
								@Pc(1310) int local1310 = arg2 + local305 & 0x3F;
								if (local762 < 0) {
									local762 = 0;
								} else if (local762 > 7) {
									local762 = 7;
								}
								local771 += arg4;
								if (local771 < 0) {
									local771 = 0;
								} else if (local771 > 127) {
									local771 = 127;
								}
								this.aShortArray85[local60] = (short) (local771 | local1310 << 10 | local762 << 7);
							}
							local1115 |= local52.length > 0;
						}
					}
					if (local1115) {
						if (this.aClass96Array1 != null) {
							for (local38 = 0; local38 < this.anInt7213; local38++) {
								local1202 = this.aClass96Array1[local38];
								local1207 = this.aClass77Array1[local38];
								local1207.anInt2862 = Static195.anIntArray226[this.aShortArray85[local1202.anInt3291] & 0xFFFF] & 0xFFFFFF | local1207.anInt2862 & 0xFF000000;
							}
						}
						this.method6182();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray37 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray37.length) {
							local162 = this.anIntArrayArray37[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1207 = this.aClass77Array1[local162[local164]];
								local1207.anInt2864 += arg2;
								local1207.anInt2860 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray37 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray37.length) {
							local162 = this.anIntArrayArray37[local32];
							for (local164 = 0; local164 < local162.length; local164++) {
								local1207 = this.aClass77Array1[local162[local164]];
								local1207.anInt2871 = arg2 * local1207.anInt2871 >> 7;
								local1207.anInt2868 = arg3 * local1207.anInt2868 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray37.length > local32) {
						local162 = this.anIntArrayArray37[local32];
						for (local164 = 0; local164 < local162.length; local164++) {
							local1207 = this.aClass77Array1[local162[local164]];
							local1207.anInt2858 = arg2 + local1207.anInt2858 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!bca;Lclient!iw;I)V")
	@Override
	public void method6685(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7257 == 0) {
			return;
		}
		@Pc(16) Class30_Sub2 local16 = this.aClass20_Sub2_17.aClass30_Sub2_16;
		@Pc(19) Class30_Sub2 local19 = (Class30_Sub2) arg0;
		if (!this.aBoolean531) {
			this.method6187();
		}
		Static131.aFloat100 = local16.aFloat130 * local19.aFloat120 + local16.aFloat119 * local19.aFloat126 + local19.aFloat119 * local16.aFloat125;
		Static529.aFloat202 = local19.aFloat127 * local16.aFloat125 + local16.aFloat119 * local19.aFloat123 + local19.aFloat128 * local16.aFloat130 + local16.aFloat127;
		@Pc(72) float local72 = Static131.aFloat100 * (float) this.anInt7247 + Static529.aFloat202;
		@Pc(80) float local80 = (float) this.anInt7277 * Static131.aFloat100 + Static529.aFloat202;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt7278 + local72;
			local96 = local80 - (float) this.anInt7278;
		} else {
			local90 = (float) this.anInt7278 + local80;
			local96 = local72 - (float) this.anInt7278;
		}
		if (this.aClass20_Sub2_17.aFloat60 <= local96 || local90 <= (float) this.aClass20_Sub2_17.anInt1543) {
			return;
		}
		Static121.aFloat201 = local16.aFloat128 + local16.aFloat120 * local19.aFloat123 + local16.aFloat124 * local19.aFloat128 + local16.aFloat121 * local19.aFloat127;
		Static355.aFloat161 = local16.aFloat121 * local19.aFloat119 + local19.aFloat120 * local16.aFloat124 + local16.aFloat120 * local19.aFloat126;
		@Pc(172) float local172 = (float) this.anInt7247 * Static355.aFloat161 + Static121.aFloat201;
		@Pc(180) float local180 = Static121.aFloat201 + Static355.aFloat161 * (float) this.anInt7277;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local172 > local180) {
			local195 = (local172 + (float) this.anInt7278) * (float) this.aClass20_Sub2_17.anInt1558;
			local207 = (float) this.aClass20_Sub2_17.anInt1558 * ((float) -this.anInt7278 + local180);
		} else {
			local195 = (local180 + (float) this.anInt7278) * (float) this.aClass20_Sub2_17.anInt1558;
			local207 = (float) this.aClass20_Sub2_17.anInt1558 * ((float) -this.anInt7278 + local172);
		}
		if (this.aClass20_Sub2_17.aFloat57 <= local207 / local90 || local195 / local90 <= this.aClass20_Sub2_17.aFloat54) {
			return;
		}
		Static63.aFloat78 = local19.aFloat119 * local16.aFloat129 + local16.aFloat126 * local19.aFloat126 + local16.aFloat122 * local19.aFloat120;
		Static22.aFloat10 = local19.aFloat127 * local16.aFloat129 + local19.aFloat128 * local16.aFloat122 + local19.aFloat123 * local16.aFloat126 + local16.aFloat123;
		@Pc(297) float local297 = (float) this.anInt7247 * Static63.aFloat78 + Static22.aFloat10;
		@Pc(305) float local305 = Static63.aFloat78 * (float) this.anInt7277 + Static22.aFloat10;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = (float) this.aClass20_Sub2_17.anInt1561 * ((float) this.anInt7278 + local297);
			local332 = (float) this.aClass20_Sub2_17.anInt1561 * ((float) -this.anInt7278 + local305);
		} else {
			local320 = ((float) this.anInt7278 + local305) * (float) this.aClass20_Sub2_17.anInt1561;
			local332 = (local297 - (float) this.anInt7278) * (float) this.aClass20_Sub2_17.anInt1561;
		}
		if (this.aClass20_Sub2_17.aFloat64 <= local332 / local90 || local320 / local90 <= this.aClass20_Sub2_17.aFloat52) {
			return;
		}
		if (arg1 != null || this.aClass96Array1 != null) {
			Static492.aFloat197 = local16.aFloat125 * local19.aFloat130 + local19.aFloat124 * local16.aFloat130 + local16.aFloat119 * local19.aFloat122;
			Static464.aFloat171 = local16.aFloat122 * local19.aFloat121 + local19.aFloat129 * local16.aFloat126 + local16.aFloat129 * local19.aFloat125;
			Static260.aFloat170 = local16.aFloat121 * local19.aFloat130 + local16.aFloat120 * local19.aFloat122 + local16.aFloat124 * local19.aFloat124;
			Static329.aFloat156 = local16.aFloat124 * local19.aFloat121 + local19.aFloat129 * local16.aFloat120 + local16.aFloat121 * local19.aFloat125;
			Static269.aFloat152 = local16.aFloat122 * local19.aFloat124 + local16.aFloat126 * local19.aFloat122 + local16.aFloat129 * local19.aFloat130;
			Static199.aFloat174 = local19.aFloat125 * local16.aFloat125 + local19.aFloat121 * local16.aFloat130 + local19.aFloat129 * local16.aFloat119;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(502) int local502 = this.anInt7276 + this.anInt7252 >> 1;
			@Pc(510) int local510 = this.anInt7221 + this.anInt7234 >> 1;
			@Pc(529) int local529 = (int) ((float) this.anInt7247 * Static355.aFloat161 + Static121.aFloat201 + Static260.aFloat170 * (float) local502 + Static329.aFloat156 * (float) local510);
			@Pc(548) int local548 = (int) (Static464.aFloat171 * (float) local510 + (float) local502 * Static269.aFloat152 + Static22.aFloat10 + Static63.aFloat78 * (float) this.anInt7247);
			@Pc(567) int local567 = (int) (Static529.aFloat202 + (float) local502 * Static492.aFloat197 + (float) this.anInt7247 * Static131.aFloat100 + (float) local510 * Static199.aFloat174);
			if (local567 < this.aClass20_Sub2_17.anInt1543) {
				local491 = true;
			} else {
				arg1.anInt5417 = this.aClass20_Sub2_17.anInt1559 + local548 * this.aClass20_Sub2_17.anInt1561 / local567;
				arg1.anInt5420 = this.aClass20_Sub2_17.anInt1558 * local529 / local567 + this.aClass20_Sub2_17.anInt1542;
			}
			@Pc(626) int local626 = (int) (Static355.aFloat161 * (float) this.anInt7277 + Static121.aFloat201 + Static260.aFloat170 * (float) local502 + (float) local510 * Static329.aFloat156);
			@Pc(645) int local645 = (int) (Static63.aFloat78 * (float) this.anInt7277 + Static22.aFloat10 + (float) local502 * Static269.aFloat152 + (float) local510 * Static464.aFloat171);
			@Pc(664) int local664 = (int) ((float) this.anInt7277 * Static131.aFloat100 + Static529.aFloat202 + (float) local502 * Static492.aFloat197 + Static199.aFloat174 * (float) local510);
			if (this.aClass20_Sub2_17.anInt1543 > local664) {
				local491 = true;
			} else {
				arg1.anInt5421 = this.aClass20_Sub2_17.anInt1542 + local626 * this.aClass20_Sub2_17.anInt1558 / local664;
				arg1.anInt5419 = this.aClass20_Sub2_17.anInt1559 + local645 * this.aClass20_Sub2_17.anInt1561 / local664;
			}
			if (local491) {
				if (this.aClass20_Sub2_17.anInt1543 > local567 && local664 < this.aClass20_Sub2_17.anInt1543) {
					local493 = false;
				} else {
					@Pc(748) int local748;
					@Pc(758) int local758;
					@Pc(769) int local769;
					if (this.aClass20_Sub2_17.anInt1543 > local567) {
						local748 = (local664 - this.aClass20_Sub2_17.anInt1543 << 16) / (local664 - local567);
						local758 = (local748 * (local626 - local529) >> 16) + local626;
						local769 = local645 + (local748 * (local645 - local548) >> 16);
						arg1.anInt5420 = this.aClass20_Sub2_17.anInt1542 + local758 * this.aClass20_Sub2_17.anInt1558 / this.aClass20_Sub2_17.anInt1543;
						arg1.anInt5417 = local769 * this.aClass20_Sub2_17.anInt1561 / this.aClass20_Sub2_17.anInt1543 + this.aClass20_Sub2_17.anInt1559;
					} else if (this.aClass20_Sub2_17.anInt1543 > local664) {
						local748 = (local567 - this.aClass20_Sub2_17.anInt1543 << 16) / (local567 - local664);
						local758 = local529 + ((local529 - local626) * local748 >> 16);
						local769 = ((local548 - local645) * local748 >> 16) + local548;
						arg1.anInt5420 = this.aClass20_Sub2_17.anInt1542 + this.aClass20_Sub2_17.anInt1558 * local758 / this.aClass20_Sub2_17.anInt1543;
						arg1.anInt5417 = this.aClass20_Sub2_17.anInt1559 + local769 * this.aClass20_Sub2_17.anInt1561 / this.aClass20_Sub2_17.anInt1543;
					}
				}
			}
			if (local493) {
				if (local664 >= local567) {
					arg1.anInt5418 = this.aClass20_Sub2_17.anInt1558 * (local626 + this.anInt7278) / local664 + this.aClass20_Sub2_17.anInt1542 - arg1.anInt5421;
				} else {
					arg1.anInt5418 = (local529 + this.anInt7278) * this.aClass20_Sub2_17.anInt1558 / local567 + this.aClass20_Sub2_17.anInt1542 - arg1.anInt5420;
				}
				arg1.aBoolean411 = true;
			}
		}
		this.aClass20_Sub2_17.method1459();
		this.aClass20_Sub2_17.method1449(local19);
		this.method6184();
		this.method6171();
	}

	@OriginalMember(owner = "client!nca", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass51_4 != null) {
			this.aClass51_4.aBoolean169 = Static573.method8544(arg0, this.anInt7256);
		}
		if (this.aClass51_2 != null) {
			this.aClass51_2.aBoolean169 = Static452.method7103(this.anInt7256, arg0);
		}
		if (this.aClass51_3 != null) {
			this.aClass51_3.aBoolean169 = Static423.method6817(arg0, this.anInt7256);
		}
		if (this.aClass51_1 != null) {
			this.aClass51_1.aBoolean169 = Static373.method6255(arg0, this.anInt7256);
		}
		this.anInt7248 = arg0;
		this.aBoolean528 = true;
		if (this.aClass246_1 != null && (this.anInt7248 & 0x10000) == 0) {
			this.aShortArray82 = this.aClass246_1.aShortArray103;
			this.aShortArray81 = this.aClass246_1.aShortArray102;
			this.aShortArray86 = this.aClass246_1.aShortArray104;
			this.aByteArray94 = this.aClass246_1.aByteArray101;
			this.aClass246_1 = null;
		}
		this.method6175();
	}

	@OriginalMember(owner = "client!nca", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean531) {
			this.method6187();
		}
		return this.anInt7276;
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "()Z")
	@Override
	public boolean method6688() {
		if (this.aShortArray79 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray79.length; local12++) {
			if (this.aShortArray79[local12] != -1 && !this.aClass20_Sub2_17.anInterface4_12.method8049(this.aShortArray79[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg4 && arg5 < arg7 && arg5 < arg3) {
			return false;
		} else if (arg5 > arg4 && arg7 < arg5 && arg5 > arg3) {
			return false;
		} else if (arg6 > arg0 && arg2 > arg0 && arg0 < arg1) {
			return false;
		} else {
			return arg6 >= arg0 || arg2 >= arg0 || arg0 <= arg1;
		}
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "()V")
	@Override
	public void method6682() {
		if (this.anInt7257 > 0 && this.anInt7281 > 0) {
			this.method6172();
			this.method6178();
			this.method6175();
		}
	}

	@OriginalMember(owner = "client!nca", name = "i", descriptor = "(I)V")
	private void method6184() {
		if (this.anInt7281 == 0) {
			return;
		}
		if (this.method6172() && this.method6178()) {
			this.aClass20_Sub2_17.method1559(this.aClass51_4.anInterface22_11, 0);
			this.aClass20_Sub2_17.method1559(this.aClass51_3.anInterface22_11, 1);
			this.aClass20_Sub2_17.method1559(this.aClass51_2.anInterface22_11, 2);
			@Pc(61) boolean local61;
			if ((this.anInt7256 & 0x37) == 0) {
				local61 = false;
				this.aClass20_Sub2_17.method1500(false);
				this.aClass20_Sub2_17.method1496(this.aClass20_Sub2_17.aClass22_16);
			} else {
				local61 = true;
				this.aClass20_Sub2_17.method1500(true);
				this.aClass20_Sub2_17.method1559(this.aClass51_1.anInterface22_11, 3);
				this.aClass20_Sub2_17.method1496(this.aClass20_Sub2_17.aClass22_21);
			}
			for (@Pc(101) int local101 = 0; local101 < this.anIntArray457.length; local101++) {
				@Pc(108) int local108 = this.anIntArray456[local101];
				@Pc(115) int local115 = this.anIntArray456[local101 + 1];
				@Pc(122) int local122 = this.aShortArray79[local108] & 0xFFFF;
				if (local122 == 65535) {
					local122 = -1;
				}
				this.aClass20_Sub2_17.method1448(true, local61, local122);
				this.aClass20_Sub2_17.method1572(Static539.aClass134_6, local115 - local108, this.aClass282_1.anInterface24_5, this.anIntArray457[local101], local108 * 3, this.anIntArray460[local101]);
			}
		}
		this.method6175();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILclient!bca;ZII)Z")
	@Override
	public boolean method6693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6174(arg0, arg4, arg5, arg1, arg3, arg2);
	}

	@OriginalMember(owner = "client!nca", name = "c", descriptor = "(B)V")
	private void method6185() {
		if ((this.anInt7256 & 0x37) == 0) {
			if (this.aClass51_3 != null) {
				this.aClass51_3.aBoolean170 = false;
			}
		} else if (this.aClass51_1 != null) {
			this.aClass51_1.aBoolean170 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "j", descriptor = "(I)V")
	private void method6186() {
		if (this.aClass282_1 != null) {
			this.aClass282_1.aBoolean642 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6683(@OriginalArg(0) Class166 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class166_Sub2 local8 = (Class166_Sub2) arg0;
		if (this.anInt7258 == 0 || local8.anInt7258 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt7228;
		@Pc(27) int[] local27 = local8.anIntArray461;
		@Pc(30) int[] local30 = local8.anIntArray462;
		@Pc(33) int[] local33 = local8.anIntArray458;
		@Pc(36) short[] local36 = local8.aShortArray86;
		@Pc(39) short[] local39 = local8.aShortArray82;
		@Pc(42) short[] local42 = local8.aShortArray81;
		@Pc(45) byte[] local45 = local8.aByteArray94;
		@Pc(60) short[] local60;
		@Pc(56) short[] local56;
		@Pc(64) short[] local64;
		@Pc(52) byte[] local52;
		if (this.aClass246_1 == null) {
			local56 = null;
			local60 = null;
			local52 = null;
			local64 = null;
		} else {
			local52 = this.aClass246_1.aByteArray101;
			local56 = this.aClass246_1.aShortArray103;
			local60 = this.aClass246_1.aShortArray104;
			local64 = this.aClass246_1.aShortArray102;
		}
		@Pc(93) short[] local93;
		@Pc(89) short[] local89;
		@Pc(81) short[] local81;
		@Pc(85) byte[] local85;
		if (local8.aClass246_1 == null) {
			local89 = null;
			local85 = null;
			local81 = null;
			local93 = null;
		} else {
			local81 = local8.aClass246_1.aShortArray102;
			local85 = local8.aClass246_1.aByteArray101;
			local89 = local8.aClass246_1.aShortArray103;
			local93 = local8.aClass246_1.aShortArray104;
		}
		@Pc(106) int[] local106 = local8.anIntArray459;
		@Pc(109) short[] local109 = local8.aShortArray83;
		if (!local8.aBoolean531) {
			local8.method6187();
		}
		@Pc(118) int local118 = local8.anInt7247;
		@Pc(121) int local121 = local8.anInt7277;
		@Pc(124) int local124 = local8.anInt7276;
		@Pc(127) int local127 = local8.anInt7252;
		@Pc(130) int local130 = local8.anInt7221;
		@Pc(133) int local133 = local8.anInt7234;
		for (@Pc(135) int local135 = 0; local135 < this.anInt7228; local135++) {
			@Pc(144) int local144 = this.anIntArray462[local135] - arg2;
			if (local118 <= local144 && local144 <= local121) {
				@Pc(160) int local160 = this.anIntArray461[local135] - arg1;
				if (local160 >= local124 && local160 <= local127) {
					@Pc(175) int local175 = this.anIntArray458[local135] - arg3;
					if (local130 <= local175 && local133 >= local175) {
						@Pc(189) int local189 = -1;
						@Pc(194) int local194 = this.anIntArray459[local135];
						@Pc(201) int local201 = this.anIntArray459[local135 + 1];
						for (@Pc(203) int local203 = local194; local203 < local201; local203++) {
							local189 = this.aShortArray83[local203] - 1;
							if (local189 == -1 || this.aByteArray94[local189] != 0) {
								break;
							}
						}
						if (local189 != -1) {
							for (@Pc(233) int local233 = 0; local233 < local24; local233++) {
								if (local160 == local27[local233] && local175 == local33[local233] && local30[local233] == local144) {
									@Pc(264) int local264 = -1;
									local194 = local106[local233];
									local201 = local106[local233 + 1];
									for (@Pc(276) int local276 = local194; local276 < local201; local276++) {
										local264 = local109[local276] - 1;
										if (local264 == -1 || local45[local264] != 0) {
											break;
										}
									}
									if (local264 != -1) {
										if (local60 == null) {
											this.aClass246_1 = new Class246();
											local60 = this.aClass246_1.aShortArray104 = Static202.method4069(this.aShortArray86);
											local56 = this.aClass246_1.aShortArray103 = Static202.method4069(this.aShortArray82);
											local64 = this.aClass246_1.aShortArray102 = Static202.method4069(this.aShortArray81);
											local52 = this.aClass246_1.aByteArray101 = Static67.method2077(this.aByteArray94);
										}
										if (local93 == null) {
											@Pc(352) Class246 local352 = local8.aClass246_1 = new Class246();
											local93 = local352.aShortArray104 = Static202.method4069(local36);
											local89 = local352.aShortArray103 = Static202.method4069(local39);
											local81 = local352.aShortArray102 = Static202.method4069(local42);
											local85 = local352.aByteArray101 = Static67.method2077(local45);
										}
										@Pc(385) short local385 = this.aShortArray86[local189];
										@Pc(390) short local390 = this.aShortArray82[local189];
										@Pc(395) short local395 = this.aShortArray81[local189];
										local194 = local106[local233];
										local201 = local106[local233 + 1];
										@Pc(410) byte local410 = this.aByteArray94[local189];
										@Pc(420) int local420;
										for (@Pc(412) int local412 = local194; local412 < local201; local412++) {
											local420 = local109[local412] - 1;
											if (local420 == -1) {
												break;
											}
											if (local85[local420] != 0) {
												local93[local420] += local385;
												local89[local420] += local390;
												local81[local420] += local395;
												local85[local420] += local410;
											}
										}
										local194 = this.anIntArray459[local135];
										local395 = local42[local264];
										local410 = local45[local264];
										local385 = local36[local264];
										local390 = local39[local264];
										local201 = this.anIntArray459[local135 + 1];
										for (local420 = local194; local420 < local201; local420++) {
											@Pc(506) int local506 = this.aShortArray83[local420] - 1;
											if (local506 == -1) {
												break;
											}
											if (local52[local506] != 0) {
												local60[local506] += local385;
												local56[local506] += local390;
												local64[local506] += local395;
												local52[local506] += local410;
											}
										}
										local8.method6185();
										this.method6185();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7258; local7++) {
			if (this.aShortArray85[local7] == arg0) {
				this.aShortArray85[local7] = arg1;
			}
		}
		if (this.aClass96Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7213; local34++) {
				@Pc(41) Class96 local41 = this.aClass96Array1[local34];
				@Pc(46) Class77 local46 = this.aClass77Array1[local34];
				local46.anInt2862 = Static195.anIntArray226[this.aShortArray85[local41.anInt3291] & 0xFFFF] & 0xFFFFFF | local46.anInt2862 & 0xFF000000;
			}
		}
		this.method6182();
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class166 method6684(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(32) Class166_Sub2 local32;
		@Pc(36) Class166_Sub2 local36;
		if (arg0 == 1) {
			local36 = this.aClass20_Sub2_17.aClass166_Sub2_26;
			local32 = this.aClass20_Sub2_17.aClass166_Sub2_29;
		} else if (arg0 == 2) {
			local36 = this.aClass20_Sub2_17.aClass166_Sub2_25;
			local32 = this.aClass20_Sub2_17.aClass166_Sub2_24;
		} else if (arg0 == 3) {
			local36 = this.aClass20_Sub2_17.aClass166_Sub2_21;
			local32 = this.aClass20_Sub2_17.aClass166_Sub2_28;
		} else if (arg0 == 4) {
			local36 = this.aClass20_Sub2_17.aClass166_Sub2_27;
			local32 = this.aClass20_Sub2_17.aClass166_Sub2_22;
		} else if (arg0 == 5) {
			local32 = this.aClass20_Sub2_17.aClass166_Sub2_30;
			local36 = this.aClass20_Sub2_17.aClass166_Sub2_23;
		} else {
			local32 = local36 = new Class166_Sub2(this.aClass20_Sub2_17, 0, 0, true, false);
		}
		return this.method6180(arg0 != 0, local36, local32, arg1, arg2);
	}

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class65 arg2, @OriginalArg(3) Class65 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean531) {
			this.method6187();
		}
		@Pc(17) int local17 = arg4 + this.anInt7276;
		@Pc(22) int local22 = this.anInt7252 + arg4;
		@Pc(27) int local27 = this.anInt7221 + arg6;
		@Pc(33) int local33 = arg6 + this.anInt7234;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt9615 <= local22 + arg2.anInt9620 >> arg2.anInt9616 || local27 < 0 || arg2.anInt9618 <= arg2.anInt9620 + local33 >> arg2.anInt9616)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt9615 <= arg3.anInt9620 + local22 >> arg3.anInt9616 || local27 < 0 || arg3.anInt9618 <= local33 + arg3.anInt9620 >> arg3.anInt9616) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9616;
			local22 = arg2.anInt9620 + local22 - 1 >> arg2.anInt9616;
			local27 >>= arg2.anInt9616;
			local33 = arg2.anInt9620 + local33 - 1 >> arg2.anInt9616;
			if (arg5 == arg2.method7995(local27, local17) && arg5 == arg2.method7995(local27, local22) && arg2.method7995(local33, local17) == arg5 && arg2.method7995(local33, local22) == arg5) {
				return;
			}
		}
		@Pc(192) int local192;
		if (arg0 == 1) {
			for (local192 = 0; local192 < this.anInt7228; local192++) {
				this.anIntArray462[local192] += arg2.method7999(this.anIntArray461[local192] + arg4, this.anIntArray458[local192] + arg6) - arg5;
			}
		} else {
			@Pc(197) int local197;
			@Pc(208) int local208;
			if (arg0 == 2) {
				local192 = this.anInt7247;
				if (local192 == 0) {
					return;
				}
				for (local197 = 0; local197 < this.anInt7228; local197++) {
					local208 = (this.anIntArray462[local197] << 16) / local192;
					if (local208 < arg1) {
						this.anIntArray462[local197] -= -((arg1 - local208) * (-arg5 + arg2.method7999(arg4 + this.anIntArray461[local197], this.anIntArray458[local197] - -arg6)) / arg1);
					}
				}
			} else {
				@Pc(296) int local296;
				if (arg0 == 3) {
					local192 = (arg1 & 0xFF) * 4;
					local197 = (arg1 >> 8 & 0xFF) * 4;
					local208 = (arg1 >> 16 & 0xFF) << 6;
					local296 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local192 >> 1) < 0 || arg2.anInt9615 << arg2.anInt9616 <= arg2.anInt9620 + (local192 >> 1) + arg4 || arg6 - (local197 >> 1) < 0 || arg2.anInt9618 << arg2.anInt9616 <= arg2.anInt9620 + (local197 >> 1) + arg6) {
						return;
					}
					this.method6696(local192, local296, arg4, local197, arg5, local208, arg2, arg6);
				} else if (arg0 == 4) {
					local192 = this.anInt7277 - this.anInt7247;
					for (local197 = 0; local197 < this.anInt7228; local197++) {
						this.anIntArray462[local197] = local192 + this.anIntArray462[local197] + arg3.method7999(this.anIntArray461[local197] + arg4, this.anIntArray458[local197] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local192 = this.anInt7277 - this.anInt7247;
					for (local197 = 0; local197 < this.anInt7228; local197++) {
						local208 = arg4 + this.anIntArray461[local197];
						local296 = arg6 + this.anIntArray458[local197];
						@Pc(302) int local302 = arg2.method7999(local208, local296);
						@Pc(308) int local308 = arg3.method7999(local208, local296);
						@Pc(315) int local315 = local302 - local308 - arg1;
						this.anIntArray462[local197] = (local315 * ((this.anIntArray462[local197] << 8) / local192) >> 8) + local302 - arg5;
					}
				}
			}
		}
		this.method6179();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean529;
	}

	@OriginalMember(owner = "client!nca", name = "e", descriptor = "()V")
	@Override
	protected void method6691() {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7258; local7++) {
			local16 = this.aShortArray85[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local46 += (arg2 - local46) * arg3 >> 7;
			}
			this.aShortArray85[local7] = (short) (local22 << 10 | local28 << 7 | local46);
		}
		if (this.aClass96Array1 != null) {
			for (local16 = 0; local16 < this.anInt7213; local16++) {
				@Pc(109) Class96 local109 = this.aClass96Array1[local16];
				@Pc(114) Class77 local114 = this.aClass77Array1[local16];
				local114.anInt2862 = local114.anInt2862 & 0xFF000000 | Static195.anIntArray226[this.aShortArray85[local109.anInt3291] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6182();
	}

	@OriginalMember(owner = "client!nca", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7228; local7++) {
			this.anIntArray458[local7] = -this.anIntArray458[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt7257; local29++) {
			this.aShortArray81[local29] = (short) -this.aShortArray81[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt7258; local48++) {
			@Pc(55) short local55 = this.aShortArray89[local48];
			this.aShortArray89[local48] = this.aShortArray90[local48];
			this.aShortArray90[local48] = local55;
		}
		this.method6179();
		this.method6185();
		this.method6186();
		this.aBoolean531 = false;
	}

	@OriginalMember(owner = "client!nca", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass20_Sub2_17.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7258; local11++) {
			if (this.aShortArray79[local11] == arg0) {
				this.aShortArray79[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(48) Class127 local48 = local9.method8048(arg0 & 0xFFFF);
			local37 = local48.aByte79;
			local35 = local48.aByte74;
		}
		@Pc(56) byte local56 = 0;
		@Pc(58) byte local58 = 0;
		if (arg1 != -1) {
			@Pc(68) Class127 local68 = local9.method8048(arg1 & 0xFFFF);
			local58 = local68.aByte79;
			if (local68.aByte73 != 0 || local68.aByte77 != 0) {
				this.aBoolean532 = true;
			}
			local56 = local68.aByte74;
		}
		if (!(local58 != local37 | local35 != local56)) {
			return;
		}
		if (this.aClass96Array1 != null) {
			for (@Pc(105) int local105 = 0; local105 < this.anInt7213; local105++) {
				@Pc(112) Class96 local112 = this.aClass96Array1[local105];
				@Pc(117) Class77 local117 = this.aClass77Array1[local105];
				local117.anInt2862 = local117.anInt2862 & 0xFF000000 | Static195.anIntArray226[this.aShortArray85[local112.anInt3291] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6182();
	}

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort80 = (short) arg0;
		this.method6182();
	}

	@OriginalMember(owner = "client!nca", name = "l", descriptor = "(I)V")
	private void method6187() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt7228; local23++) {
			@Pc(30) int local30 = this.anIntArray461[local23];
			@Pc(35) int local35 = this.anIntArray462[local23];
			@Pc(40) int local40 = this.anIntArray458[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local35 > local15) {
				local15 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local11 > local40) {
				local11 = local40;
			}
			if (local40 > local17) {
				local17 = local40;
			}
			@Pc(82) int local82 = local40 * local40 + local30 * local30;
			if (local82 > local19) {
				local19 = local82;
			}
			local82 = local35 * local35 + local30 * local30 + local40 * local40;
			if (local21 < local82) {
				local21 = local82;
			}
		}
		this.anInt7247 = local9;
		this.anInt7221 = local11;
		this.anInt7276 = local7;
		this.anInt7252 = local13;
		this.anInt7277 = local15;
		this.anInt7234 = local17;
		this.anInt7278 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt7210 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean531 = true;
	}

	@OriginalMember(owner = "client!nca", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			Static223.anInt4979 = 0;
			local29 = 0;
			Static122.anInt10526 = 0;
			Static384.anInt7431 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray38.length) {
					local51 = this.anIntArrayArray38[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray87 == null || (this.aShortArray87[local59] & arg6) != 0) {
							Static384.anInt7431 += this.anIntArray461[local59];
							Static223.anInt4979 += this.anIntArray462[local59];
							Static122.anInt10526 += this.anIntArray458[local59];
							local29++;
						}
					}
				}
			}
			if (local29 > 0) {
				Static122.anInt10526 = Static122.anInt10526 / local29 + arg4;
				Static415.aBoolean563 = true;
				Static223.anInt4979 = Static223.anInt4979 / local29 + arg3;
				Static384.anInt7431 = arg2 + Static384.anInt7431 / local29;
			} else {
				Static122.anInt10526 = arg4;
				Static384.anInt7431 = arg2;
				Static223.anInt4979 = arg3;
			}
			return;
		}
		@Pc(244) int[] local244;
		@Pc(246) int local246;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg7[0] * arg2 + arg7[1] * arg3 + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg7[3] * arg2 + arg7[4] * arg3 + 8192 >> 14;
				local41 = arg7[8] * arg4 + arg7[6] * arg2 + arg3 * arg7[7] + 8192 >> 14;
				arg4 = local41;
				arg3 = local35;
				arg2 = local29;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray38.length > local35) {
					local244 = this.anIntArrayArray38[local35];
					for (local246 = 0; local246 < local244.length; local246++) {
						local53 = local244[local246];
						if (this.aShortArray87 == null || (this.aShortArray87[local53] & arg6) != 0) {
							this.anIntArray461[local53] += arg2;
							this.anIntArray462[local53] += arg3;
							this.anIntArray458[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(367) int local367;
		@Pc(390) int local390;
		@Pc(416) int local416;
		@Pc(447) int local447;
		@Pc(451) int local451;
		@Pc(455) int local455;
		@Pc(459) int local459;
		@Pc(467) int local467;
		@Pc(475) int local475;
		@Pc(630) int local630;
		@Pc(655) int local655;
		@Pc(659) int local659;
		@Pc(668) int local668;
		@Pc(673) int local673;
		@Pc(677) int local677;
		@Pc(681) int local681;
		@Pc(683) int local683;
		@Pc(815) int[] local815;
		@Pc(817) int local817;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(827) int local827;
		@Pc(954) int local954;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray38.length > local35) {
						local244 = this.anIntArrayArray38[local35];
						for (local246 = 0; local246 < local244.length; local246++) {
							local53 = local244[local246];
							if (this.aShortArray87 == null || (this.aShortArray87[local53] & arg6) != 0) {
								this.anIntArray461[local53] -= Static384.anInt7431;
								this.anIntArray462[local53] -= Static223.anInt4979;
								this.anIntArray458[local53] -= Static122.anInt10526;
								if (arg4 != 0) {
									local59 = Class177.anIntArray361[arg4];
									local367 = Class177.anIntArray360[arg4];
									local390 = local59 * this.anIntArray462[local53] + local367 * this.anIntArray461[local53] + 16383 >> 14;
									this.anIntArray462[local53] = this.anIntArray462[local53] * local367 + 16383 - this.anIntArray461[local53] * local59 >> 14;
									this.anIntArray461[local53] = local390;
								}
								if (arg2 != 0) {
									local59 = Class177.anIntArray361[arg2];
									local367 = Class177.anIntArray360[arg2];
									local390 = local367 * this.anIntArray462[local53] + 16383 - local59 * this.anIntArray458[local53] >> 14;
									this.anIntArray458[local53] = local367 * this.anIntArray458[local53] + local59 * this.anIntArray462[local53] + 16383 >> 14;
									this.anIntArray462[local53] = local390;
								}
								if (arg3 != 0) {
									local59 = Class177.anIntArray361[arg3];
									local367 = Class177.anIntArray360[arg3];
									local390 = this.anIntArray458[local53] * local59 + local367 * this.anIntArray461[local53] + 16383 >> 14;
									this.anIntArray458[local53] = local367 * this.anIntArray458[local53] + 16383 - local59 * this.anIntArray461[local53] >> 14;
									this.anIntArray461[local53] = local390;
								}
								this.anIntArray461[local53] += Static384.anInt7431;
								this.anIntArray462[local53] += Static223.anInt4979;
								this.anIntArray458[local53] += Static122.anInt10526;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray38.length > local41) {
							local51 = this.anIntArrayArray38[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray87 == null || (this.aShortArray87[local59] & arg6) != 0) {
									local367 = this.anIntArray459[local59];
									local390 = this.anIntArray459[local59 + 1];
									for (local416 = local367; local416 < local390; local416++) {
										local447 = this.aShortArray83[local416] - 1;
										if (local447 == -1) {
											break;
										}
										if (arg4 != 0) {
											local451 = Class177.anIntArray361[arg4];
											local455 = Class177.anIntArray360[arg4];
											local459 = local455 * this.aShortArray86[local447] + this.aShortArray82[local447] * local451 + 16383 >> 14;
											this.aShortArray82[local447] = (short) (local455 * this.aShortArray82[local447] + 16383 - this.aShortArray86[local447] * local451 >> 14);
											this.aShortArray86[local447] = (short) local459;
										}
										if (arg2 != 0) {
											local451 = Class177.anIntArray361[arg2];
											local455 = Class177.anIntArray360[arg2];
											local459 = this.aShortArray82[local447] * local455 + 16383 - this.aShortArray81[local447] * local451 >> 14;
											this.aShortArray81[local447] = (short) (local451 * this.aShortArray82[local447] + local455 * this.aShortArray81[local447] + 16383 >> 14);
											this.aShortArray82[local447] = (short) local459;
										}
										if (arg3 != 0) {
											local451 = Class177.anIntArray361[arg3];
											local455 = Class177.anIntArray360[arg3];
											local459 = this.aShortArray81[local447] * local451 + local455 * this.aShortArray86[local447] + 16383 >> 14;
											this.aShortArray81[local447] = (short) (local455 * this.aShortArray81[local447] + 16383 - local451 * this.aShortArray86[local447] >> 14);
											this.aShortArray86[local447] = (short) local459;
										}
									}
								}
							}
						}
					}
					this.method6185();
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local246 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static415.aBoolean563) {
					local367 = arg7[6] * Static122.anInt10526 + Static384.anInt7431 * arg7[0] + Static223.anInt4979 * arg7[3] + 8192 >> 14;
					local390 = arg7[7] * Static122.anInt10526 + arg7[1] * Static384.anInt7431 + arg7[4] * Static223.anInt4979 + 8192 >> 14;
					local367 += local246;
					local416 = Static122.anInt10526 * arg7[8] + Static384.anInt7431 * arg7[2] + Static223.anInt4979 * arg7[5] + 8192 >> 14;
					local390 += local53;
					local416 += local59;
					Static384.anInt7431 = local367;
					Static223.anInt4979 = local390;
					Static415.aBoolean563 = false;
					Static122.anInt10526 = local416;
				}
				@Pc(435) int[] local435 = new int[9];
				local390 = Class177.anIntArray360[arg2];
				local416 = Class177.anIntArray361[arg2];
				local447 = Class177.anIntArray360[arg3];
				local451 = Class177.anIntArray361[arg3];
				local455 = Class177.anIntArray360[arg4];
				local459 = Class177.anIntArray361[arg4];
				local467 = local416 * local455 + 8192 >> 14;
				local475 = local416 * local459 + 8192 >> 14;
				local435[5] = -local416;
				local435[4] = local390 * local455 + 8192 >> 14;
				local435[1] = -local447 * local459 + local451 * local467 + 8192 >> 14;
				local435[6] = -local451 * local455 + local475 * local447 + 8192 >> 14;
				local435[7] = local459 * local451 + local447 * local467 + 8192 >> 14;
				local435[0] = local475 * local451 + local455 * local447 + 8192 >> 14;
				local435[2] = local390 * local451 + 8192 >> 14;
				local435[8] = local447 * local390 + 8192 >> 14;
				local435[3] = local459 * local390 + 8192 >> 14;
				@Pc(604) int local604 = -Static122.anInt10526 * local435[2] + local435[1] * -Static223.anInt4979 + local435[0] * -Static384.anInt7431 + 8192 >> 14;
				local630 = -Static122.anInt10526 * local435[5] + -Static384.anInt7431 * local435[3] + local435[4] * -Static223.anInt4979 + 8192 >> 14;
				local655 = -Static122.anInt10526 * local435[8] + -Static384.anInt7431 * local435[6] + -Static223.anInt4979 * local435[7] + 8192 >> 14;
				local659 = Static384.anInt7431 + local604;
				@Pc(663) int local663 = local630 + Static223.anInt4979;
				local668 = local655 + Static122.anInt10526;
				@Pc(671) int[] local671 = new int[9];
				for (local673 = 0; local673 < 3; local673++) {
					for (local677 = 0; local677 < 3; local677++) {
						local681 = 0;
						for (local683 = 0; local683 < 3; local683++) {
							local681 += arg7[local677 * 3 + local683] * local435[local673 * 3 + local683];
						}
						local671[local673 * 3 + local677] = local681 + 8192 >> 14;
					}
				}
				local677 = local435[2] * local59 + local435[0] * local246 + local53 * local435[1] + 8192 >> 14;
				local681 = local435[4] * local53 + local435[3] * local246 + local59 * local435[5] + 8192 >> 14;
				local677 += local659;
				local683 = local59 * local435[8] + local435[6] * local246 + local435[7] * local53 + 8192 >> 14;
				local681 += local663;
				local683 += local668;
				local815 = new int[9];
				for (local817 = 0; local817 < 3; local817++) {
					for (local821 = 0; local821 < 3; local821++) {
						local825 = 0;
						for (local827 = 0; local827 < 3; local827++) {
							local825 += arg7[local827 + local817 * 3] * local671[local827 * 3 + local821];
						}
						local815[local817 * 3 + local821] = local825 + 8192 >> 14;
					}
				}
				local821 = local681 * arg7[1] + arg7[0] * local677 + local683 * arg7[2] + 8192 >> 14;
				local825 = arg7[5] * local683 + arg7[4] * local681 + local677 * arg7[3] + 8192 >> 14;
				local827 = arg7[7] * local681 + arg7[6] * local677 + local683 * arg7[8] + 8192 >> 14;
				local821 += local29;
				local825 += local35;
				local827 += local41;
				for (local954 = 0; local954 < local8; local954++) {
					@Pc(960) int local960 = arg1[local954];
					if (local960 < this.anIntArrayArray38.length) {
						@Pc(970) int[] local970 = this.anIntArrayArray38[local960];
						for (@Pc(972) int local972 = 0; local972 < local970.length; local972++) {
							@Pc(978) int local978 = local970[local972];
							if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local978]) != 0) {
								@Pc(1023) int local1023 = this.anIntArray462[local978] * local815[1] + this.anIntArray461[local978] * local815[0] + local815[2] * this.anIntArray458[local978] + 8192 >> 14;
								@Pc(1054) int local1054 = local815[3] * this.anIntArray461[local978] + local815[4] * this.anIntArray462[local978] + this.anIntArray458[local978] * local815[5] + 8192 >> 14;
								@Pc(1058) int local1058 = local1023 + local821;
								@Pc(1089) int local1089 = local815[6] * this.anIntArray461[local978] + this.anIntArray462[local978] * local815[7] + this.anIntArray458[local978] * local815[8] + 8192 >> 14;
								@Pc(1093) int local1093 = local1054 + local825;
								@Pc(1097) int local1097 = local1089 + local827;
								this.anIntArray461[local978] = local1058;
								this.anIntArray462[local978] = local1093;
								this.anIntArray458[local978] = local1097;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2573) Class77 local2573;
			@Pc(2457) boolean local2457;
			@Pc(2568) Class96 local2568;
			if (arg0 == 5) {
				if (this.anIntArrayArray39 != null) {
					local2457 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray39.length > local41) {
							local51 = this.anIntArrayArray39[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray80 == null || (this.aShortArray80[local59] & arg6) != 0) {
									local367 = (this.aByteArray95[local59] & 0xFF) + (arg2 * 8);
									if (local367 < 0) {
										local367 = 0;
									} else if (local367 > 255) {
										local367 = 255;
									}
									this.aByteArray95[local59] = (byte) local367;
								}
							}
							local2457 |= local51.length > 0;
						}
					}
					if (local2457) {
						if (this.aClass96Array1 != null) {
							for (local41 = 0; local41 < this.anInt7213; local41++) {
								local2568 = this.aClass96Array1[local41];
								local2573 = this.aClass77Array1[local41];
								local2573.anInt2862 = 255 - (this.aByteArray95[local2568.anInt3291] & 0xFF) << 24 | local2573.anInt2862 & 0xFFFFFF;
							}
						}
						this.method6182();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray39 != null) {
					local2457 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray39.length) {
							local51 = this.anIntArrayArray39[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray80 == null || (this.aShortArray80[local59] & arg6) != 0) {
									local367 = this.aShortArray85[local59] & 0xFFFF;
									local390 = local367 >> 10 & 0x3F;
									local416 = local367 >> 7 & 0x7;
									local416 += arg3 / 4;
									@Pc(2680) int local2680 = arg2 + local390 & 0x3F;
									local447 = local367 & 0x7F;
									if (local416 < 0) {
										local416 = 0;
									} else if (local416 > 7) {
										local416 = 7;
									}
									local447 += arg4;
									if (local447 < 0) {
										local447 = 0;
									} else if (local447 > 127) {
										local447 = 127;
									}
									this.aShortArray85[local59] = (short) (local416 << 7 | local2680 << 10 | local447);
								}
							}
							local2457 |= local51.length > 0;
						}
					}
					if (local2457) {
						if (this.aClass96Array1 != null) {
							for (local41 = 0; local41 < this.anInt7213; local41++) {
								local2568 = this.aClass96Array1[local41];
								local2573 = this.aClass77Array1[local41];
								local2573.anInt2862 = local2573.anInt2862 & 0xFF000000 | Static195.anIntArray226[this.aShortArray85[local2568.anInt3291] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6182();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray37 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray37.length) {
							local244 = this.anIntArrayArray37[local35];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2573 = this.aClass77Array1[local244[local246]];
								local2573.anInt2864 += arg2;
								local2573.anInt2860 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray37 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (this.anIntArrayArray37.length > local35) {
							local244 = this.anIntArrayArray37[local35];
							for (local246 = 0; local246 < local244.length; local246++) {
								local2573 = this.aClass77Array1[local244[local246]];
								local2573.anInt2868 = arg3 * local2573.anInt2868 >> 7;
								local2573.anInt2871 = arg2 * local2573.anInt2871 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray37 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray37.length > local35) {
						local244 = this.anIntArrayArray37[local35];
						for (local246 = 0; local246 < local244.length; local246++) {
							local2573 = this.aClass77Array1[local244[local246]];
							local2573.anInt2858 = arg2 + local2573.anInt2858 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray38.length) {
					local244 = this.anIntArrayArray38[local35];
					for (local246 = 0; local246 < local244.length; local246++) {
						local53 = local244[local246];
						if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local53]) != 0) {
							this.anIntArray461[local53] -= Static384.anInt7431;
							this.anIntArray462[local53] -= Static223.anInt4979;
							this.anIntArray458[local53] -= Static122.anInt10526;
							this.anIntArray461[local53] = arg2 * this.anIntArray461[local53] >> 7;
							this.anIntArray462[local53] = this.anIntArray462[local53] * arg3 >> 7;
							this.anIntArray458[local53] = arg4 * this.anIntArray458[local53] >> 7;
							this.anIntArray461[local53] += Static384.anInt7431;
							this.anIntArray462[local53] += Static223.anInt4979;
							this.anIntArray458[local53] += Static122.anInt10526;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local246 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static415.aBoolean563) {
				local367 = Static122.anInt10526 * arg7[6] + Static384.anInt7431 * arg7[0] + arg7[3] * Static223.anInt4979 + 8192 >> 14;
				local390 = Static384.anInt7431 * arg7[1] + Static223.anInt4979 * arg7[4] + arg7[7] * Static122.anInt10526 + 8192 >> 14;
				local367 += local246;
				local390 += local53;
				local416 = arg7[2] * Static384.anInt7431 + arg7[5] * Static223.anInt4979 + Static122.anInt10526 * arg7[8] + 8192 >> 14;
				local416 += local59;
				Static384.anInt7431 = local367;
				Static223.anInt4979 = local390;
				Static415.aBoolean563 = false;
				Static122.anInt10526 = local416;
			}
			local367 = arg2 << 15 >> 7;
			local390 = arg3 << 15 >> 7;
			local416 = arg4 << 15 >> 7;
			local447 = -Static384.anInt7431 * local367 + 8192 >> 14;
			local451 = -Static223.anInt4979 * local390 + 8192 >> 14;
			local455 = -Static122.anInt10526 * local416 + 8192 >> 14;
			local459 = local447 + Static384.anInt7431;
			local467 = local451 + Static223.anInt4979;
			local475 = Static122.anInt10526 + local455;
			@Pc(1987) int[] local1987 = new int[] { local367 * arg7[0] + 8192 >> 14, arg7[3] * local367 + 8192 >> 14, arg7[6] * local367 + 8192 >> 14, local390 * arg7[1] + 8192 >> 14, local390 * arg7[4] + 8192 >> 14, local390 * arg7[7] + 8192 >> 14, local416 * arg7[2] + 8192 >> 14, local416 * arg7[5] + 8192 >> 14, local416 * arg7[8] + 8192 >> 14 };
			local630 = local246 * local367 + 8192 >> 14;
			local655 = local53 * local390 + 8192 >> 14;
			@Pc(2115) int local2115 = local630 + local459;
			local659 = local416 * local59 + 8192 >> 14;
			@Pc(2127) int local2127 = local655 + local467;
			@Pc(2131) int local2131 = local659 + local475;
			@Pc(2134) int[] local2134 = new int[9];
			@Pc(2140) int local2140;
			for (local668 = 0; local668 < 3; local668++) {
				for (local2140 = 0; local2140 < 3; local2140++) {
					local673 = 0;
					for (local677 = 0; local677 < 3; local677++) {
						local673 += local1987[local2140 + local677 * 3] * arg7[local677 + local668 * 3];
					}
					local2134[local668 * 3 + local2140] = local673 + 8192 >> 14;
				}
			}
			local2140 = local2127 * arg7[1] + local2115 * arg7[0] + arg7[2] * local2131 + 8192 >> 14;
			local673 = local2131 * arg7[5] + arg7[3] * local2115 + local2127 * arg7[4] + 8192 >> 14;
			local677 = local2115 * arg7[6] + local2127 * arg7[7] + arg7[8] * local2131 + 8192 >> 14;
			local673 += local35;
			local2140 += local29;
			local677 += local41;
			for (local681 = 0; local681 < local8; local681++) {
				local683 = arg1[local681];
				if (local683 < this.anIntArrayArray38.length) {
					local815 = this.anIntArrayArray38[local683];
					for (local817 = 0; local817 < local815.length; local817++) {
						local821 = local815[local817];
						if (this.aShortArray87 == null || (arg6 & this.aShortArray87[local821]) != 0) {
							local825 = local2134[1] * this.anIntArray462[local821] + this.anIntArray461[local821] * local2134[0] + this.anIntArray458[local821] * local2134[2] + 8192 >> 14;
							local827 = local2134[5] * this.anIntArray458[local821] + local2134[4] * this.anIntArray462[local821] + local2134[3] * this.anIntArray461[local821] + 8192 >> 14;
							@Pc(2382) int local2382 = local827 + local673;
							@Pc(2386) int local2386 = local825 + local2140;
							local954 = this.anIntArray462[local821] * local2134[7] + this.anIntArray461[local821] * local2134[6] + local2134[8] * this.anIntArray458[local821] + 8192 >> 14;
							this.anIntArray461[local821] = local2386;
							@Pc(2427) int local2427 = local954 + local677;
							this.anIntArray462[local821] = local2382;
							this.anIntArray458[local821] = local2427;
						}
					}
				}
			}
		}
	}
}
