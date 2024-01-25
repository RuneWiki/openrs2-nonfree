import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class17_Sub3 extends Class17 {

	@OriginalMember(owner = "client!lu", name = "q", descriptor = "Lclient!wt;")
	private Class378 aClass378_1;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Z")
	private boolean aBoolean444;

	@OriginalMember(owner = "client!lu", name = "t", descriptor = "I")
	private int anInt6197;

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "Lclient!pga;")
	private Class260 aClass260_1;

	@OriginalMember(owner = "client!lu", name = "K", descriptor = "I")
	private int anInt6209;

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "Lclient!ch;")
	private final Class5_Sub1 aClass5_Sub1_16;

	@OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
	private int anInt6218;

	@OriginalMember(owner = "client!lu", name = "eb", descriptor = "Lclient!pga;")
	private Class260 aClass260_2;

	@OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
	private int anInt6225;

	@OriginalMember(owner = "client!lu", name = "kb", descriptor = "I")
	private int anInt6226;

	@OriginalMember(owner = "client!lu", name = "wb", descriptor = "Lclient!tea;")
	private Class318 aClass318_1;

	@OriginalMember(owner = "client!lu", name = "Cb", descriptor = "Lclient!pga;")
	private Class260 aClass260_3;

	@OriginalMember(owner = "client!lu", name = "Jb", descriptor = "I")
	private int anInt6239;

	@OriginalMember(owner = "client!lu", name = "Sb", descriptor = "Z")
	private boolean aBoolean446;

	@OriginalMember(owner = "client!lu", name = "Ub", descriptor = "I")
	private int anInt6244;

	@OriginalMember(owner = "client!lu", name = "ac", descriptor = "I")
	private int anInt6247;

	@OriginalMember(owner = "client!lu", name = "ec", descriptor = "Lclient!pga;")
	private Class260 aClass260_4;

	@OriginalMember(owner = "client!lu", name = "jc", descriptor = "I")
	private int anInt6252;

	@OriginalMember(owner = "client!lu", name = "wc", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!lu", name = "Bc", descriptor = "I")
	private int anInt6267;

	@OriginalMember(owner = "client!lu", name = "Hc", descriptor = "I")
	private int anInt6271;

	@OriginalMember(owner = "client!lu", name = "Lb", descriptor = "[I")
	private int[] anIntArray381;

	@OriginalMember(owner = "client!lu", name = "Bb", descriptor = "I")
	private int anInt6234;

	@OriginalMember(owner = "client!lu", name = "Q", descriptor = "I")
	private int anInt6214;

	@OriginalMember(owner = "client!lu", name = "Tb", descriptor = "Z")
	private boolean aBoolean447;

	@OriginalMember(owner = "client!lu", name = "E", descriptor = "Z")
	private boolean aBoolean445;

	@OriginalMember(owner = "client!lu", name = "yb", descriptor = "[I")
	private int[] anIntArray379;

	@OriginalMember(owner = "client!lu", name = "Ib", descriptor = "[I")
	private int[] anIntArray380;

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "I")
	private int anInt6201;

	@OriginalMember(owner = "client!lu", name = "Ob", descriptor = "I")
	private int anInt6242;

	@OriginalMember(owner = "client!lu", name = "pb", descriptor = "[I")
	private int[] anIntArray376;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "[Lclient!vea;")
	private Class353[] aClass353Array5;

	@OriginalMember(owner = "client!lu", name = "bc", descriptor = "[Lclient!qv;")
	private Class284[] aClass284Array5;

	@OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
	private int anInt6195;

	@OriginalMember(owner = "client!lu", name = "T", descriptor = "[Lclient!op;")
	private Class252[] aClass252Array1;

	@OriginalMember(owner = "client!lu", name = "ob", descriptor = "[Lclient!an;")
	private Class18[] aClass18Array1;

	@OriginalMember(owner = "client!lu", name = "Gb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!lu", name = "Vb", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!lu", name = "Ic", descriptor = "[S")
	private short[] aShortArray105;

	@OriginalMember(owner = "client!lu", name = "Qb", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!lu", name = "Z", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!lu", name = "Kb", descriptor = "S")
	private short aShort99;

	@OriginalMember(owner = "client!lu", name = "Xb", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!lu", name = "hc", descriptor = "S")
	private short aShort100;

	@OriginalMember(owner = "client!lu", name = "rc", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!lu", name = "ab", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!lu", name = "Ec", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!lu", name = "qb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "[F")
	private float[] aFloatArray43;

	@OriginalMember(owner = "client!lu", name = "Pb", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!lu", name = "Ab", descriptor = "[B")
	private byte[] aByteArray68;

	@OriginalMember(owner = "client!lu", name = "Y", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!lu", name = "Yb", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!lu", name = "db", descriptor = "[I")
	private int[] anIntArray375;

	@OriginalMember(owner = "client!lu", name = "vb", descriptor = "[I")
	private int[] anIntArray378;

	@OriginalMember(owner = "client!lu", name = "tb", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!lu", name = "ic", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!lu", name = "tc", descriptor = "[[I")
	private int[][] anIntArrayArray46;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ch;Lclient!fu;IIII)V")
	public Class17_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Class118 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface7 local11 = arg0.anInterface7_15;
		@Pc(15) int[] local15 = new int[arg1.anInt3252];
		this.anIntArray381 = new int[arg1.anInt3251 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3252; local24++) {
			if (arg1.aByteArray40 == null || arg1.aByteArray40[local24] != 2) {
				if (arg1.aShortArray62 != null && arg1.aShortArray62[local24] != -1) {
					@Pc(56) Class195 local56 = local11.method8118(arg1.aShortArray62[local24] & 0xFFFF);
					if (((this.anInt6197 & 0x40) == 0 || !local56.aBoolean365) && local56.aBoolean369) {
						continue;
					}
				}
				local15[this.anInt6234++] = local24;
				this.anIntArray381[arg1.aShortArray60[local24]]++;
				this.anIntArray381[arg1.aShortArray61[local24]]++;
				this.anIntArray381[arg1.aShortArray63[local24]]++;
			}
		}
		this.anInt6214 = this.anInt6234;
		@Pc(128) long[] local128 = new long[this.anInt6234];
		@Pc(140) boolean local140 = (this.anInt6226 & 0x100) != 0;
		@Pc(152) int local152;
		@Pc(165) int local165;
		@Pc(321) int local321;
		for (@Pc(142) int local142 = 0; local142 < this.anInt6234; local142++) {
			@Pc(148) int local148 = local15[local142];
			@Pc(150) Class195 local150 = null;
			local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			@Pc(158) byte local158 = 0;
			if (arg1.aClass66Array1 != null) {
				@Pc(163) boolean local163 = false;
				for (local165 = 0; local165 < arg1.aClass66Array1.length; local165++) {
					@Pc(172) Class66 local172 = arg1.aClass66Array1[local165];
					if (local148 == local172.anInt2184) {
						@Pc(181) Class159 local181 = Static269.method4430(local172.anInt2189);
						if (local181.aBoolean305) {
							local163 = true;
						}
						if (local181.anInt4548 != -1) {
							@Pc(196) Class195 local196 = local11.method8118(local181.anInt4548);
							if (local196.anInt5424 == 2) {
								this.aBoolean447 = true;
							}
						}
					}
				}
				if (local163) {
					local128[local142] = Long.MAX_VALUE;
					this.anInt6214--;
					continue;
				}
			}
			@Pc(225) short local225 = -1;
			if (arg1.aShortArray62 != null) {
				local225 = arg1.aShortArray62[local148];
				if (local225 != -1) {
					local150 = local11.method8118(local225 & 0xFFFF);
					if ((this.anInt6197 & 0x40) != 0 && local150.aBoolean365) {
						local150 = null;
						local225 = -1;
					} else {
						local158 = local150.aByte82;
						local156 = local150.aByte83;
					}
				}
			}
			@Pc(283) boolean local283 = arg1.aByteArray44 != null && arg1.aByteArray44[local148] != 0 || local150 != null && local150.anInt5424 != 0;
			if ((local140 || local283) && arg1.aByteArray43 != null) {
				local152 += arg1.aByteArray43[local148] << 17;
			}
			if (local283) {
				local152 += 65536;
			}
			local152 += (local156 & 0xFF) << 8;
			local321 = local154 + ((local225 & 0xFFFF) << 16);
			local152 += local158 & 0xFF;
			@Pc(333) int local333 = local321 + (local142 & 0xFFFF);
			local128[local142] = (long) local333 + ((long) local152 << 32);
			this.aBoolean445 |= local150 != null && (local150.aByte80 != 0 || local150.aByte81 != 0);
			this.aBoolean447 |= local283;
		}
		Static311.method6195(local15, local128);
		this.anIntArray379 = arg1.anIntArray166;
		this.anIntArray380 = arg1.anIntArray168;
		this.aShortArray94 = arg1.aShortArray56;
		this.anInt6201 = arg1.anInt3256;
		this.anInt6242 = arg1.anInt3251;
		this.anIntArray376 = arg1.anIntArray169;
		@Pc(405) Class338[] local405 = new Class338[this.anInt6242];
		this.aClass353Array5 = arg1.aClass353Array2;
		this.aClass284Array5 = arg1.aClass284Array2;
		@Pc(433) int local433;
		@Pc(447) int local447;
		@Pc(485) int local485;
		if (arg1.aClass66Array1 != null) {
			this.anInt6195 = arg1.aClass66Array1.length;
			this.aClass252Array1 = new Class252[this.anInt6195];
			this.aClass18Array1 = new Class18[this.anInt6195];
			for (local433 = 0; local433 < this.anInt6195; local433++) {
				@Pc(440) Class66 local440 = arg1.aClass66Array1[local433];
				@Pc(445) Class159 local445 = Static269.method4430(local440.anInt2189);
				local447 = -1;
				for (@Pc(449) int local449 = 0; local449 < this.anInt6234; local449++) {
					if (local15[local449] == local440.anInt2184) {
						local447 = local449;
						break;
					}
				}
				if (local447 == -1) {
					throw new RuntimeException();
				}
				local485 = Static159.anIntArray159[arg1.aShortArray57[local440.anInt2184] & 0xFFFF] & 0xFFFFFF;
				@Pc(503) int local503 = local485 | 255 - (arg1.aByteArray44 == null ? 0 : arg1.aByteArray44[local440.anInt2184]) << 24;
				this.aClass18Array1[local433] = new Class18(local447, arg1.aShortArray60[local440.anInt2184], arg1.aShortArray61[local440.anInt2184], arg1.aShortArray63[local440.anInt2184], local445.anInt4553, local445.anInt4550, local445.anInt4548, local445.anInt4549, local445.anInt4551, local445.aBoolean305, local445.aBoolean304, local440.anInt2185);
				this.aClass252Array1[local433] = new Class252(local503);
			}
		}
		local433 = this.anInt6234 * 3;
		this.aShortArray99 = new short[this.anInt6234];
		this.aByteArray69 = new byte[local433];
		this.aShortArray105 = new short[local433];
		this.aShortArray101 = new short[local433];
		this.aShortArray96 = new short[local433];
		this.aShort99 = (short) arg4;
		this.aShortArray102 = new short[this.anInt6234];
		this.aShort100 = (short) arg3;
		this.aFloatArray44 = new float[local433];
		this.aShortArray93 = new short[this.anInt6234];
		this.aShortArray97 = new short[this.anInt6234];
		this.aShortArray104 = new short[local433];
		this.aShortArray98 = new short[this.anInt6234];
		this.aFloatArray43 = new float[local433];
		if (arg1.aShortArray58 != null) {
			this.aShortArray100 = new short[this.anInt6234];
		}
		this.aByteArray68 = new byte[this.anInt6234];
		Static310.aLongArray15 = new long[local433];
		this.aShortArray95 = new short[local433];
		this.aShortArray103 = new short[local433];
		local152 = 0;
		for (local321 = 0; local321 < arg1.anInt3251; local321++) {
			local447 = this.anIntArray381[local321];
			this.anIntArray381[local321] = local152;
			local152 += local447;
			local405[local321] = new Class338();
		}
		this.anIntArray381[arg1.anInt3251] = local152;
		@Pc(693) Class168 local693 = Static545.method8459(this.anInt6234, arg1, local15);
		@Pc(697) Class236[] local697 = new Class236[arg1.anInt3252];
		@Pc(738) int local738;
		@Pc(749) int local749;
		@Pc(760) int local760;
		@Pc(716) short local716;
		@Pc(727) int local727;
		for (local485 = 0; local485 < arg1.anInt3252; local485++) {
			@Pc(706) short local706 = arg1.aShortArray60[local485];
			@Pc(711) short local711 = arg1.aShortArray61[local485];
			local716 = arg1.aShortArray63[local485];
			local727 = this.anIntArray379[local711] - this.anIntArray379[local706];
			local738 = this.anIntArray376[local711] - this.anIntArray376[local706];
			local749 = this.anIntArray380[local711] - this.anIntArray380[local706];
			local760 = this.anIntArray379[local716] - this.anIntArray379[local706];
			@Pc(770) int local770 = this.anIntArray376[local716] - this.anIntArray376[local706];
			@Pc(781) int local781 = this.anIntArray380[local716] - this.anIntArray380[local706];
			@Pc(790) int local790 = local781 * local738 - local749 * local770;
			@Pc(799) int local799 = local760 * local749 - local781 * local727;
			@Pc(808) int local808 = local770 * local727 - local760 * local738;
			while (local790 > 8192 || local799 > 8192 || local808 > 8192 || local790 < -8192 || local799 < -8192 || local808 < -8192) {
				local808 >>= 0x1;
				local799 >>= 0x1;
				local790 >>= 0x1;
			}
			@Pc(864) int local864 = (int) Math.sqrt((double) (local790 * local790 + local799 * local799 + local808 * local808));
			if (local864 <= 0) {
				local864 = 1;
			}
			local790 = local790 * 256 / local864;
			local799 = local799 * 256 / local864;
			local808 = local808 * 256 / local864;
			@Pc(896) byte local896 = arg1.aByteArray40 == null ? 0 : arg1.aByteArray40[local485];
			if (local896 == 0) {
				@Pc(929) Class338 local929 = local405[local706];
				local929.anInt9451 += local808;
				local929.anInt9452 += local790;
				local929.anInt9455 += local799;
				local929.anInt9456++;
				@Pc(957) Class338 local957 = local405[local711];
				local957.anInt9451 += local808;
				local957.anInt9455 += local799;
				local957.anInt9452 += local790;
				local957.anInt9456++;
				@Pc(985) Class338 local985 = local405[local716];
				local985.anInt9452 += local790;
				local985.anInt9456++;
				local985.anInt9451 += local808;
				local985.anInt9455 += local799;
			} else if (local896 == 1) {
				@Pc(914) Class236 local914 = local697[local485] = new Class236();
				local914.anInt7181 = local790;
				local914.anInt7184 = local799;
				local914.anInt7179 = local808;
			}
		}
		@Pc(1022) int local1022;
		@Pc(1065) short local1065;
		for (local165 = 0; local165 < this.anInt6234; local165++) {
			local1022 = local15[local165];
			@Pc(1029) int local1029 = arg1.aShortArray57[local1022] & 0xFFFF;
			if (arg1.aByteArray45 == null) {
				local727 = -1;
			} else {
				local727 = arg1.aByteArray45[local1022];
			}
			if (arg1.aByteArray44 == null) {
				local738 = 0;
			} else {
				local738 = arg1.aByteArray44[local1022] & 0xFF;
			}
			local1065 = arg1.aShortArray62 == null ? -1 : arg1.aShortArray62[local1022];
			if (local1065 != -1 && (this.anInt6197 & 0x40) != 0) {
				@Pc(1083) Class195 local1083 = local11.method8118(local1065 & 0xFFFF);
				if (local1083.aBoolean365) {
					local1065 = -1;
				}
			}
			@Pc(1090) float local1090 = 0.0F;
			@Pc(1092) float local1092 = 0.0F;
			@Pc(1094) float local1094 = 0.0F;
			@Pc(1096) float local1096 = 0.0F;
			@Pc(1098) float local1098 = 0.0F;
			@Pc(1100) float local1100 = 0.0F;
			@Pc(1102) byte local1102 = 0;
			@Pc(1104) byte local1104 = 0;
			@Pc(1106) int local1106 = 0;
			@Pc(1122) byte local1122;
			@Pc(1139) short local1139;
			@Pc(1144) short local1144;
			@Pc(1149) short local1149;
			if (local1065 != -1) {
				if (local727 == -1) {
					local1102 = 1;
					local1100 = 0.0F;
					local1104 = 2;
					local1094 = 1.0F;
					local1098 = 0.0F;
					local1096 = 1.0F;
					local1090 = 0.0F;
					local1092 = 1.0F;
				} else {
					local727 &= 0xFF;
					local1122 = arg1.aByteArray46[local727];
					@Pc(1129) short local1129;
					@Pc(1134) short local1134;
					@Pc(1172) float local1172;
					@Pc(1181) float local1181;
					@Pc(1189) float local1189;
					@Pc(1273) float local1273;
					@Pc(1281) float local1281;
					@Pc(1289) float local1289;
					@Pc(1297) float local1297;
					@Pc(1305) float local1305;
					@Pc(1313) float local1313;
					if (local1122 == 0) {
						local1129 = arg1.aShortArray60[local1022];
						local1134 = arg1.aShortArray61[local1022];
						local1139 = arg1.aShortArray63[local1022];
						local1144 = arg1.aShortArray64[local727];
						local1149 = arg1.aShortArray59[local727];
						@Pc(1154) short local1154 = arg1.aShortArray55[local727];
						@Pc(1160) float local1160 = (float) arg1.anIntArray166[local1144];
						@Pc(1166) float local1166 = (float) arg1.anIntArray169[local1144];
						local1172 = arg1.anIntArray168[local1144];
						local1181 = (float) arg1.anIntArray166[local1149] - local1160;
						local1189 = (float) arg1.anIntArray169[local1149] - local1166;
						@Pc(1198) float local1198 = (float) arg1.anIntArray168[local1149] - local1172;
						@Pc(1206) float local1206 = (float) arg1.anIntArray166[local1154] - local1160;
						@Pc(1214) float local1214 = (float) arg1.anIntArray169[local1154] - local1166;
						@Pc(1222) float local1222 = (float) arg1.anIntArray168[local1154] - local1172;
						@Pc(1230) float local1230 = (float) arg1.anIntArray166[local1129] - local1160;
						@Pc(1239) float local1239 = (float) arg1.anIntArray169[local1129] - local1166;
						@Pc(1248) float local1248 = (float) arg1.anIntArray168[local1129] - local1172;
						@Pc(1256) float local1256 = (float) arg1.anIntArray166[local1134] - local1160;
						@Pc(1264) float local1264 = (float) arg1.anIntArray169[local1134] - local1166;
						local1273 = (float) arg1.anIntArray168[local1134] - local1172;
						local1281 = (float) arg1.anIntArray166[local1139] - local1160;
						local1289 = (float) arg1.anIntArray169[local1139] - local1166;
						local1297 = (float) arg1.anIntArray168[local1139] - local1172;
						local1305 = local1189 * local1222 - local1198 * local1214;
						local1313 = local1206 * local1198 - local1181 * local1222;
						@Pc(1322) float local1322 = local1214 * local1181 - local1206 * local1189;
						@Pc(1331) float local1331 = local1214 * local1322 - local1313 * local1222;
						@Pc(1339) float local1339 = local1222 * local1305 - local1206 * local1322;
						@Pc(1347) float local1347 = local1313 * local1206 - local1305 * local1214;
						@Pc(1361) float local1361 = 1.0F / (local1339 * local1189 + local1331 * local1181 + local1198 * local1347);
						local1090 = local1361 * (local1230 * local1331 + local1239 * local1339 + local1347 * local1248);
						local1094 = local1361 * (local1273 * local1347 + local1331 * local1256 + local1264 * local1339);
						local1098 = local1361 * (local1297 * local1347 + local1289 * local1339 + local1331 * local1281);
						@Pc(1411) float local1411 = local1305 * local1198 - local1181 * local1322;
						@Pc(1419) float local1419 = local1322 * local1189 - local1313 * local1198;
						@Pc(1428) float local1428 = local1313 * local1181 - local1305 * local1189;
						@Pc(1442) float local1442 = 1.0F / (local1222 * local1428 + local1411 * local1214 + local1206 * local1419);
						local1100 = local1442 * (local1297 * local1428 + local1289 * local1411 + local1281 * local1419);
						local1096 = (local1428 * local1273 + local1419 * local1256 + local1411 * local1264) * local1442;
						local1092 = local1442 * (local1239 * local1411 + local1419 * local1230 + local1248 * local1428);
					} else {
						local1129 = arg1.aShortArray60[local1022];
						local1134 = arg1.aShortArray61[local1022];
						local1139 = arg1.aShortArray63[local1022];
						@Pc(1506) int local1506 = local693.anIntArray250[local727];
						@Pc(1511) int local1511 = local693.anIntArray249[local727];
						@Pc(1516) int local1516 = local693.anIntArray248[local727];
						@Pc(1521) float[] local1521 = local693.aFloatArrayArray10[local727];
						@Pc(1526) byte local1526 = arg1.aByteArray42[local727];
						local1172 = (float) arg1.anIntArray171[local727] / 256.0F;
						if (local1122 == 1) {
							local1181 = (float) arg1.anIntArray174[local727] / 1024.0F;
							Static185.method4675(arg1.anIntArray169[local1129], Static261.aFloatArray32, local1516, local1526, local1506, local1172, local1181, arg1.anIntArray168[local1129], arg1.anIntArray166[local1129], local1521, local1511);
							local1090 = Static261.aFloatArray32[0];
							local1092 = Static261.aFloatArray32[1];
							Static185.method4675(arg1.anIntArray169[local1134], Static261.aFloatArray32, local1516, local1526, local1506, local1172, local1181, arg1.anIntArray168[local1134], arg1.anIntArray166[local1134], local1521, local1511);
							local1096 = Static261.aFloatArray32[1];
							local1094 = Static261.aFloatArray32[0];
							Static185.method4675(arg1.anIntArray169[local1139], Static261.aFloatArray32, local1516, local1526, local1506, local1172, local1181, arg1.anIntArray168[local1139], arg1.anIntArray166[local1139], local1521, local1511);
							local1100 = Static261.aFloatArray32[1];
							local1098 = Static261.aFloatArray32[0];
							local1189 = local1181 / 2.0F;
							if ((local1526 & 0x1) == 0) {
								if (local1094 - local1090 > local1189) {
									local1094 -= local1181;
									local1102 = 1;
								} else if (local1189 < local1090 - local1094) {
									local1094 += local1181;
									local1102 = 2;
								}
								if (local1098 - local1090 > local1189) {
									local1104 = 1;
									local1098 -= local1181;
								} else if (local1189 < local1090 - local1098) {
									local1098 += local1181;
									local1104 = 2;
								}
							} else {
								if (local1100 - local1092 > local1189) {
									local1104 = 1;
									local1100 -= local1181;
								} else if (local1092 - local1100 > local1189) {
									local1100 += local1181;
									local1104 = 2;
								}
								if (local1096 - local1092 > local1189) {
									local1102 = 1;
									local1096 -= local1181;
								} else if (local1189 < local1092 - local1096) {
									local1096 += local1181;
									local1102 = 2;
								}
							}
						} else if (local1122 == 2) {
							local1181 = (float) arg1.anIntArray172[local727] / 256.0F;
							local1189 = (float) arg1.anIntArray167[local727] / 256.0F;
							@Pc(1782) int local1782 = arg1.anIntArray166[local1134] - arg1.anIntArray166[local1129];
							@Pc(1793) int local1793 = arg1.anIntArray169[local1134] - arg1.anIntArray169[local1129];
							@Pc(1803) int local1803 = arg1.anIntArray168[local1134] - arg1.anIntArray168[local1129];
							@Pc(1813) int local1813 = arg1.anIntArray166[local1139] - arg1.anIntArray166[local1129];
							@Pc(1824) int local1824 = arg1.anIntArray169[local1139] - arg1.anIntArray169[local1129];
							@Pc(1835) int local1835 = arg1.anIntArray168[local1139] - arg1.anIntArray168[local1129];
							@Pc(1844) int local1844 = local1793 * local1835 - local1824 * local1803;
							@Pc(1852) int local1852 = local1813 * local1803 - local1782 * local1835;
							@Pc(1860) int local1860 = local1824 * local1782 - local1813 * local1793;
							local1273 = 64.0F / (float) arg1.anIntArray173[local727];
							local1281 = 64.0F / (float) arg1.anIntArray170[local727];
							local1289 = 64.0F / (float) arg1.anIntArray174[local727];
							local1297 = (local1521[0] * (float) local1844 + local1521[1] * (float) local1852 + (float) local1860 * local1521[2]) / local1273;
							local1305 = ((float) local1860 * local1521[5] + local1521[4] * (float) local1852 + local1521[3] * (float) local1844) / local1281;
							local1313 = (local1521[6] * (float) local1844 + local1521[7] * (float) local1852 + local1521[8] * (float) local1860) / local1289;
							local1106 = Static263.method4331(local1313, local1297, local1305);
							Static567.method8637(arg1.anIntArray166[local1129], Static261.aFloatArray32, local1181, local1521, local1506, local1516, local1106, arg1.anIntArray169[local1129], local1526, arg1.anIntArray168[local1129], local1511, local1189, local1172);
							local1090 = Static261.aFloatArray32[0];
							local1092 = Static261.aFloatArray32[1];
							Static567.method8637(arg1.anIntArray166[local1134], Static261.aFloatArray32, local1181, local1521, local1506, local1516, local1106, arg1.anIntArray169[local1134], local1526, arg1.anIntArray168[local1134], local1511, local1189, local1172);
							local1094 = Static261.aFloatArray32[0];
							local1096 = Static261.aFloatArray32[1];
							Static567.method8637(arg1.anIntArray166[local1139], Static261.aFloatArray32, local1181, local1521, local1506, local1516, local1106, arg1.anIntArray169[local1139], local1526, arg1.anIntArray168[local1139], local1511, local1189, local1172);
							local1100 = Static261.aFloatArray32[1];
							local1098 = Static261.aFloatArray32[0];
						} else if (local1122 == 3) {
							Static322.method5266(local1172, local1511, Static261.aFloatArray32, arg1.anIntArray168[local1129], local1506, arg1.anIntArray169[local1129], local1516, local1526, arg1.anIntArray166[local1129], local1521);
							local1090 = Static261.aFloatArray32[0];
							local1092 = Static261.aFloatArray32[1];
							Static322.method5266(local1172, local1511, Static261.aFloatArray32, arg1.anIntArray168[local1134], local1506, arg1.anIntArray169[local1134], local1516, local1526, arg1.anIntArray166[local1134], local1521);
							local1096 = Static261.aFloatArray32[1];
							local1094 = Static261.aFloatArray32[0];
							Static322.method5266(local1172, local1511, Static261.aFloatArray32, arg1.anIntArray168[local1139], local1506, arg1.anIntArray169[local1139], local1516, local1526, arg1.anIntArray166[local1139], local1521);
							local1100 = Static261.aFloatArray32[1];
							local1098 = Static261.aFloatArray32[0];
							if ((local1526 & 0x1) == 0) {
								if (local1098 - local1090 > 0.5F) {
									local1098--;
									local1104 = 1;
								} else if (local1090 - local1098 > 0.5F) {
									local1104 = 2;
									local1098++;
								}
								if (local1094 - local1090 > 0.5F) {
									local1102 = 1;
									local1094--;
								} else if (local1090 - local1094 > 0.5F) {
									local1094++;
									local1102 = 2;
								}
							} else {
								if (local1100 - local1092 > 0.5F) {
									local1104 = 1;
									local1100--;
								} else if (local1092 - local1100 > 0.5F) {
									local1104 = 2;
									local1100++;
								}
								if (local1096 - local1092 > 0.5F) {
									local1102 = 1;
									local1096--;
								} else if (local1092 - local1096 > 0.5F) {
									local1096++;
									local1102 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray40 == null) {
				local1122 = 0;
			} else {
				local1122 = arg1.aByteArray40[local1022];
			}
			if (local1122 == 0) {
				@Pc(2460) long local2460 = ((long) (local1106 << 24) + (long) (local1029 << 8) + (long) local738 << 32) + (long) (local727 << 2);
				local1139 = arg1.aShortArray60[local1022];
				local1144 = arg1.aShortArray61[local1022];
				local1149 = arg1.aShortArray63[local1022];
				@Pc(2479) Class338 local2479 = local405[local1139];
				this.aShortArray98[local165] = this.method5440(local2479.anInt9451, local1092, local2479.anInt9452, local165, arg1, local1090, local1139, local2479.anInt9455, local2460, local2479.anInt9456);
				@Pc(2504) Class338 local2504 = local405[local1144];
				this.aShortArray99[local165] = this.method5440(local2504.anInt9451, local1096, local2504.anInt9452, local165, arg1, local1094, local1144, local2504.anInt9455, (long) local1102 + local2460, local2504.anInt9456);
				@Pc(2532) Class338 local2532 = local405[local1149];
				this.aShortArray97[local165] = this.method5440(local2532.anInt9451, local1100, local2532.anInt9452, local165, arg1, local1098, local1149, local2532.anInt9455, local2460 + (long) local1104, local2532.anInt9456);
			} else if (local1122 == 1) {
				@Pc(2316) Class236 local2316 = local697[local1022];
				@Pc(2361) long local2361 = ((long) (local1029 << 8) + (long) (local1106 << 24) + (long) local738 << 32) + (long) ((local2316.anInt7179 + 256 << 22) + ((local727 << 2) + (local2316.anInt7181 <= 0 ? 2048 : 1024) + (local2316.anInt7184 + 256 << 12)));
				this.aShortArray98[local165] = this.method5440(local2316.anInt7179, local1092, local2316.anInt7181, local165, arg1, local1090, arg1.aShortArray60[local1022], local2316.anInt7184, local2361, 0);
				this.aShortArray99[local165] = this.method5440(local2316.anInt7179, local1096, local2316.anInt7181, local165, arg1, local1094, arg1.aShortArray61[local1022], local2316.anInt7184, (long) local1102 + local2361, 0);
				this.aShortArray97[local165] = this.method5440(local2316.anInt7179, local1100, local2316.anInt7181, local165, arg1, local1098, arg1.aShortArray63[local1022], local2316.anInt7184, local2361 + (long) local1104, 0);
			}
			if (arg1.aByteArray44 != null) {
				this.aByteArray68[local165] = arg1.aByteArray44[local1022];
			}
			if (arg1.aShortArray58 != null) {
				this.aShortArray100[local165] = arg1.aShortArray58[local1022];
			}
			this.aShortArray102[local165] = arg1.aShortArray57[local1022];
			this.aShortArray93[local165] = local1065;
		}
		if (this.anInt6214 > 0) {
			local1022 = 1;
			local716 = this.aShortArray93[0];
			for (local727 = 0; local727 < this.anInt6214; local727++) {
				@Pc(2619) short local2619 = this.aShortArray93[local727];
				if (local2619 != local716) {
					local716 = local2619;
					local1022++;
				}
			}
			this.anIntArray375 = new int[local1022 + 1];
			this.anIntArray378 = new int[local1022];
			this.anIntArray377 = new int[local1022];
			this.anIntArray375[0] = 0;
			local738 = this.anInt6271;
			local716 = this.aShortArray93[0];
			local1022 = 0;
			local1065 = 0;
			for (local760 = 0; local760 < this.anInt6214; local760++) {
				@Pc(2670) short local2670 = this.aShortArray93[local760];
				if (local716 != local2670) {
					this.anIntArray378[local1022] = local738;
					this.anIntArray377[local1022] = local1065 + 1 - local738;
					local1022++;
					this.anIntArray375[local1022] = local760;
					local716 = local2670;
					local1065 = 0;
					local738 = this.anInt6271;
				}
				@Pc(2710) short local2710 = this.aShortArray98[local760];
				if (local2710 < local738) {
					local738 = local2710;
				}
				if (local2710 > local1065) {
					local1065 = local2710;
				}
				local2710 = this.aShortArray99[local760];
				if (local2710 > local1065) {
					local1065 = local2710;
				}
				if (local2710 < local738) {
					local738 = local2710;
				}
				local2710 = this.aShortArray97[local760];
				if (local738 > local2710) {
					local738 = local2710;
				}
				if (local2710 > local1065) {
					local1065 = local2710;
				}
			}
			this.anIntArray378[local1022] = local738;
			this.anIntArray377[local1022] = local1065 + 1 - local738;
			local1022++;
			this.anIntArray375[local1022] = this.anInt6214;
		}
		Static310.aLongArray15 = null;
		this.aShortArray96 = Static534.method7809(this.aShortArray96, this.anInt6271);
		this.aShortArray104 = Static534.method7809(this.aShortArray104, this.anInt6271);
		this.aShortArray95 = Static534.method7809(this.aShortArray95, this.anInt6271);
		this.aShortArray103 = Static534.method7809(this.aShortArray103, this.anInt6271);
		this.aShortArray101 = Static534.method7809(this.aShortArray101, this.anInt6271);
		this.aByteArray69 = Static176.method3077(this.anInt6271, this.aByteArray69);
		this.aFloatArray44 = Static10.method674(this.anInt6271, this.aFloatArray44);
		this.aFloatArray43 = Static10.method674(this.anInt6271, this.aFloatArray43);
		if (arg1.anIntArray164 != null && Static503.method7427(arg2, this.anInt6197)) {
			this.anIntArrayArray44 = arg1.method2928(false);
		}
		if (arg1.aClass66Array1 != null && Static596.method8354(this.anInt6197, arg2)) {
			this.anIntArrayArray45 = arg1.method2938();
		}
		if (arg1.anIntArray165 != null && Static546.method7960(arg2, this.anInt6197)) {
			local1022 = 0;
			@Pc(2898) int[] local2898 = new int[256];
			for (local727 = 0; local727 < this.anInt6234; local727++) {
				local738 = arg1.anIntArray165[local15[local727]];
				if (local738 >= 0) {
					@Pc(2918) int local2918 = local2898[local738]++;
					if (local738 > local1022) {
						local1022 = local738;
					}
				}
			}
			this.anIntArrayArray46 = new int[local1022 + 1][];
			for (local738 = 0; local738 <= local1022; local738++) {
				this.anIntArrayArray46[local738] = new int[local2898[local738]];
				local2898[local738] = 0;
			}
			for (local749 = 0; local749 < this.anInt6234; local749++) {
				local760 = arg1.anIntArray165[local15[local749]];
				if (local760 >= 0) {
					this.anIntArrayArray46[local760][local2898[local760]++] = local749;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!ch;IIZZ)V")
	public Class17_Sub3(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt6201 = 0;
		this.aBoolean445 = false;
		this.anInt6234 = 0;
		this.aBoolean444 = true;
		this.aBoolean447 = false;
		this.anInt6242 = 0;
		this.aBoolean446 = false;
		this.anInt6271 = 0;
		this.aBoolean448 = false;
		this.anInt6214 = 0;
		this.aBoolean448 = arg4;
		this.anInt6197 = arg2;
		this.aClass5_Sub1_16 = arg0;
		this.anInt6226 = arg1;
		if (arg3 || Static291.method4635(this.anInt6197, this.anInt6226)) {
			this.aClass260_4 = new Class260(Static136.method2563(this.anInt6226, this.anInt6197));
		}
		if (arg3 || Static119.method2415(this.anInt6197, this.anInt6226)) {
			this.aClass260_2 = new Class260(Static296.method4677(this.anInt6226, this.anInt6197));
		}
		if (arg3 || Static312.method5143(this.anInt6226, this.anInt6197)) {
			this.aClass260_3 = new Class260(Static603.method8432(this.anInt6226, this.anInt6197));
		}
		if (arg3 || Static335.method5468(this.anInt6226, this.anInt6197)) {
			this.aClass260_1 = new Class260(Static9.method667(this.anInt6197, this.anInt6226));
		}
		if (arg3 || Static332.method5434(this.anInt6197, this.anInt6226)) {
			this.aClass378_1 = new Class378(Static113.method2321(this.anInt6197, this.anInt6226));
		}
	}

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt6242; local15++) {
			local33 = this.anIntArray379[local15] * local13 + local9 * this.anIntArray380[local15] >> 14;
			this.anIntArray380[local15] = local13 * this.anIntArray380[local15] - this.anIntArray379[local15] * local9 >> 14;
			this.anIntArray379[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt6271; local33++) {
			@Pc(83) int local83 = local13 * this.aShortArray95[local33] + this.aShortArray101[local33] * local9 >> 14;
			this.aShortArray101[local33] = (short) (this.aShortArray101[local33] * local13 - this.aShortArray95[local33] * local9 >> 14);
			this.aShortArray95[local33] = (short) local83;
		}
		this.method5451();
		this.method5448();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZIILclient!lu;Lclient!lu;Z)Lclient!ka;")
	private Class17 method5435(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class17_Sub3 arg2, @OriginalArg(4) Class17_Sub3 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt6197 = this.anInt6197;
		arg3.aBoolean445 = this.aBoolean445;
		arg3.aShort99 = this.aShort99;
		arg3.anInt6195 = this.anInt6195;
		arg3.anInt6271 = this.anInt6271;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean447 = this.aBoolean447;
		} else {
			arg3.aBoolean447 = true;
		}
		arg3.anInt6214 = this.anInt6214;
		arg3.anInt6242 = this.anInt6242;
		arg3.anInt6234 = this.anInt6234;
		arg3.anInt6226 = arg1;
		arg3.anInt6201 = this.anInt6201;
		arg3.aShort100 = this.aShort100;
		@Pc(87) boolean local87 = Static315.method5167(arg1, this.anInt6197);
		@Pc(93) boolean local93 = Static108.method2180(arg1, this.anInt6197);
		@Pc(99) boolean local99 = Static368.method5984(arg1, this.anInt6197);
		@Pc(105) boolean local105 = local93 | local87 | local99;
		@Pc(206) int local206;
		if (local105) {
			if (!local87) {
				arg3.anIntArray379 = this.anIntArray379;
			} else if (arg2.anIntArray379 == null || arg2.anIntArray379.length < this.anInt6201) {
				arg3.anIntArray379 = arg2.anIntArray379 = new int[this.anInt6201];
			} else {
				arg3.anIntArray379 = arg2.anIntArray379;
			}
			if (!local93) {
				arg3.anIntArray376 = this.anIntArray376;
			} else if (arg2.anIntArray376 == null || this.anInt6201 > arg2.anIntArray376.length) {
				arg3.anIntArray376 = arg2.anIntArray376 = new int[this.anInt6201];
			} else {
				arg3.anIntArray376 = arg2.anIntArray376;
			}
			if (!local99) {
				arg3.anIntArray380 = this.anIntArray380;
			} else if (arg2.anIntArray380 == null || this.anInt6201 > arg2.anIntArray380.length) {
				arg3.anIntArray380 = arg2.anIntArray380 = new int[this.anInt6201];
			} else {
				arg3.anIntArray380 = arg2.anIntArray380;
			}
			for (local206 = 0; local206 < this.anInt6201; local206++) {
				if (local87) {
					arg3.anIntArray379[local206] = this.anIntArray379[local206];
				}
				if (local93) {
					arg3.anIntArray376[local206] = this.anIntArray376[local206];
				}
				if (local99) {
					arg3.anIntArray380[local206] = this.anIntArray380[local206];
				}
			}
		} else {
			arg3.anIntArray380 = this.anIntArray380;
			arg3.anIntArray379 = this.anIntArray379;
			arg3.anIntArray376 = this.anIntArray376;
		}
		if (Static136.method2563(arg1, this.anInt6197)) {
			arg3.aClass260_4 = arg2.aClass260_4;
			arg3.aClass260_4.aBoolean542 = true;
			arg3.aClass260_4.aBoolean543 = this.aClass260_4.aBoolean543;
			arg3.aClass260_4.anInterface11_17 = this.aClass260_4.anInterface11_17;
		} else if (Static291.method4635(this.anInt6197, arg1)) {
			arg3.aClass260_4 = this.aClass260_4;
		} else {
			arg3.aClass260_4 = null;
		}
		if (Static306.method4861(arg1, this.anInt6197)) {
			if (arg2.aShortArray102 == null || this.anInt6234 > arg2.aShortArray102.length) {
				arg3.aShortArray102 = arg2.aShortArray102 = new short[this.anInt6234];
			} else {
				arg3.aShortArray102 = arg2.aShortArray102;
			}
			for (local206 = 0; local206 < this.anInt6234; local206++) {
				arg3.aShortArray102[local206] = this.aShortArray102[local206];
			}
		} else {
			arg3.aShortArray102 = this.aShortArray102;
		}
		if (Static481.method7184(this.anInt6197, arg1)) {
			if (arg2.aByteArray68 == null || this.anInt6234 > arg2.aByteArray68.length) {
				arg3.aByteArray68 = arg2.aByteArray68 = new byte[this.anInt6234];
			} else {
				arg3.aByteArray68 = arg2.aByteArray68;
			}
			for (local206 = 0; local206 < this.anInt6234; local206++) {
				arg3.aByteArray68[local206] = this.aByteArray68[local206];
			}
		} else {
			arg3.aByteArray68 = this.aByteArray68;
		}
		if (Static603.method8432(arg1, this.anInt6197)) {
			arg3.aClass260_3 = arg2.aClass260_3;
			arg3.aClass260_3.aBoolean542 = true;
			arg3.aClass260_3.aBoolean543 = this.aClass260_3.aBoolean543;
			arg3.aClass260_3.anInterface11_17 = this.aClass260_3.anInterface11_17;
		} else if (Static312.method5143(arg1, this.anInt6197)) {
			arg3.aClass260_3 = this.aClass260_3;
		} else {
			arg3.aClass260_3 = null;
		}
		@Pc(551) int local551;
		if (Static395.method6381(this.anInt6197, arg1)) {
			if (arg2.aShortArray95 == null || arg2.aShortArray95.length < this.anInt6271) {
				local206 = this.anInt6271;
				arg3.aShortArray95 = arg2.aShortArray95 = new short[local206];
				arg3.aShortArray103 = arg2.aShortArray103 = new short[local206];
				arg3.aShortArray101 = arg2.aShortArray101 = new short[local206];
			} else {
				arg3.aShortArray95 = arg2.aShortArray95;
				arg3.aShortArray101 = arg2.aShortArray101;
				arg3.aShortArray103 = arg2.aShortArray103;
			}
			if (this.aClass318_1 == null) {
				arg3.aClass318_1 = null;
				for (local206 = 0; local206 < this.anInt6271; local206++) {
					arg3.aShortArray95[local206] = this.aShortArray95[local206];
					arg3.aShortArray103[local206] = this.aShortArray103[local206];
					arg3.aShortArray101[local206] = this.aShortArray101[local206];
				}
			} else {
				if (arg2.aClass318_1 == null) {
					arg2.aClass318_1 = new Class318();
				}
				@Pc(539) Class318 local539 = arg3.aClass318_1 = arg2.aClass318_1;
				if (local539.aShortArray142 == null || local539.aShortArray142.length < this.anInt6271) {
					local551 = this.anInt6271;
					local539.aShortArray143 = new short[local551];
					local539.aByteArray104 = new byte[local551];
					local539.aShortArray141 = new short[local551];
					local539.aShortArray142 = new short[local551];
				}
				for (local551 = 0; local551 < this.anInt6271; local551++) {
					arg3.aShortArray95[local551] = this.aShortArray95[local551];
					arg3.aShortArray103[local551] = this.aShortArray103[local551];
					arg3.aShortArray101[local551] = this.aShortArray101[local551];
					local539.aShortArray142[local551] = this.aClass318_1.aShortArray142[local551];
					local539.aShortArray141[local551] = this.aClass318_1.aShortArray141[local551];
					local539.aShortArray143[local551] = this.aClass318_1.aShortArray143[local551];
					local539.aByteArray104[local551] = this.aClass318_1.aByteArray104[local551];
				}
			}
			arg3.aByteArray69 = this.aByteArray69;
		} else {
			arg3.aShortArray101 = this.aShortArray101;
			arg3.aShortArray103 = this.aShortArray103;
			arg3.aByteArray69 = this.aByteArray69;
			arg3.aClass318_1 = this.aClass318_1;
			arg3.aShortArray95 = this.aShortArray95;
		}
		if (Static9.method667(this.anInt6197, arg1)) {
			arg3.aClass260_1 = arg2.aClass260_1;
			arg3.aClass260_1.aBoolean543 = this.aClass260_1.aBoolean543;
			arg3.aClass260_1.aBoolean542 = true;
			arg3.aClass260_1.anInterface11_17 = this.aClass260_1.anInterface11_17;
		} else if (Static335.method5468(arg1, this.anInt6197)) {
			arg3.aClass260_1 = this.aClass260_1;
		} else {
			arg3.aClass260_1 = null;
		}
		if (Static347.method5788(arg1, this.anInt6197)) {
			if (arg2.aFloatArray44 == null || this.anInt6234 > arg2.aFloatArray44.length) {
				local206 = this.anInt6271;
				arg3.aFloatArray43 = arg2.aFloatArray43 = new float[local206];
				arg3.aFloatArray44 = arg2.aFloatArray44 = new float[local206];
			} else {
				arg3.aFloatArray44 = arg2.aFloatArray44;
				arg3.aFloatArray43 = arg2.aFloatArray43;
			}
			for (local206 = 0; local206 < this.anInt6271; local206++) {
				arg3.aFloatArray44[local206] = this.aFloatArray44[local206];
				arg3.aFloatArray43[local206] = this.aFloatArray43[local206];
			}
		} else {
			arg3.aFloatArray44 = this.aFloatArray44;
			arg3.aFloatArray43 = this.aFloatArray43;
		}
		if (Static296.method4677(arg1, this.anInt6197)) {
			arg3.aClass260_2 = arg2.aClass260_2;
			arg3.aClass260_2.aBoolean542 = true;
			arg3.aClass260_2.aBoolean543 = this.aClass260_2.aBoolean543;
			arg3.aClass260_2.anInterface11_17 = this.aClass260_2.anInterface11_17;
		} else if (Static119.method2415(this.anInt6197, arg1)) {
			arg3.aClass260_2 = this.aClass260_2;
		} else {
			arg3.aClass260_2 = null;
		}
		if (Static394.method6369(this.anInt6197, arg1)) {
			if (arg2.aShortArray98 == null || this.anInt6234 > arg2.aShortArray98.length) {
				local206 = this.anInt6234;
				arg3.aShortArray99 = arg2.aShortArray99 = new short[local206];
				arg3.aShortArray97 = arg2.aShortArray97 = new short[local206];
				arg3.aShortArray98 = arg2.aShortArray98 = new short[local206];
			} else {
				arg3.aShortArray99 = arg2.aShortArray99;
				arg3.aShortArray98 = arg2.aShortArray98;
				arg3.aShortArray97 = arg2.aShortArray97;
			}
			for (local206 = 0; local206 < this.anInt6234; local206++) {
				arg3.aShortArray98[local206] = this.aShortArray98[local206];
				arg3.aShortArray99[local206] = this.aShortArray99[local206];
				arg3.aShortArray97[local206] = this.aShortArray97[local206];
			}
		} else {
			arg3.aShortArray98 = this.aShortArray98;
			arg3.aShortArray97 = this.aShortArray97;
			arg3.aShortArray99 = this.aShortArray99;
		}
		if (Static113.method2321(this.anInt6197, arg1)) {
			arg3.aClass378_1 = arg2.aClass378_1;
			arg3.aClass378_1.aBoolean730 = true;
			arg3.aClass378_1.aBoolean731 = this.aClass378_1.aBoolean731;
			arg3.aClass378_1.anInterface19_8 = this.aClass378_1.anInterface19_8;
		} else if (Static332.method5434(this.anInt6197, arg1)) {
			arg3.aClass378_1 = this.aClass378_1;
		} else {
			arg3.aClass378_1 = null;
		}
		if (Static258.method4296(this.anInt6197, arg1)) {
			if (arg2.aShortArray93 == null || this.anInt6234 > arg2.aShortArray93.length) {
				local206 = this.anInt6234;
				arg3.aShortArray93 = arg2.aShortArray93 = new short[local206];
			} else {
				arg3.aShortArray93 = arg2.aShortArray93;
			}
			for (local206 = 0; local206 < this.anInt6234; local206++) {
				arg3.aShortArray93[local206] = this.aShortArray93[local206];
			}
		} else {
			arg3.aShortArray93 = this.aShortArray93;
		}
		if (!Static118.method2411(this.anInt6197, arg1)) {
			arg3.aClass252Array1 = this.aClass252Array1;
		} else if (arg2.aClass252Array1 == null || this.anInt6195 > arg2.aClass252Array1.length) {
			local206 = this.anInt6195;
			arg3.aClass252Array1 = arg2.aClass252Array1 = new Class252[local206];
			for (local551 = 0; local551 < this.anInt6195; local551++) {
				arg3.aClass252Array1[local551] = this.aClass252Array1[local551].method6510();
			}
		} else {
			arg3.aClass252Array1 = arg2.aClass252Array1;
			for (local206 = 0; local206 < this.anInt6195; local206++) {
				arg3.aClass252Array1[local206].method6512(this.aClass252Array1[local206]);
			}
		}
		arg3.anIntArray375 = this.anIntArray375;
		arg3.anIntArrayArray45 = this.anIntArrayArray45;
		arg3.aShortArray94 = this.aShortArray94;
		arg3.anIntArrayArray46 = this.anIntArrayArray46;
		if (this.aBoolean446) {
			arg3.anInt6218 = this.anInt6218;
			arg3.anInt6239 = this.anInt6239;
			arg3.anInt6267 = this.anInt6267;
			arg3.anInt6244 = this.anInt6244;
			arg3.anInt6209 = this.anInt6209;
			arg3.anInt6252 = this.anInt6252;
			arg3.anInt6247 = this.anInt6247;
			arg3.anInt6225 = this.anInt6225;
			arg3.aBoolean446 = true;
		} else {
			arg3.aBoolean446 = false;
		}
		arg3.anIntArray377 = this.anIntArray377;
		arg3.anIntArrayArray44 = this.anIntArrayArray44;
		arg3.aShortArray104 = this.aShortArray104;
		arg3.anIntArray378 = this.anIntArray378;
		arg3.aShortArray105 = this.aShortArray105;
		arg3.aClass18Array1 = this.aClass18Array1;
		arg3.anIntArray381 = this.anIntArray381;
		arg3.aClass284Array5 = this.aClass284Array5;
		arg3.aShortArray96 = this.aShortArray96;
		arg3.aShortArray100 = this.aShortArray100;
		arg3.aClass353Array5 = this.aClass353Array5;
		return arg3;
	}

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean445;
	}

	@OriginalMember(owner = "client!lu", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort99;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!sk;ZI)Z")
	@Override
	public boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5441(arg2, arg0, arg4, -1, arg1, arg3);
	}

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51 arg2, @OriginalArg(3) Class51 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean446) {
			this.method5437();
		}
		@Pc(17) int local17 = arg4 + this.anInt6218;
		@Pc(23) int local23 = arg4 + this.anInt6267;
		@Pc(29) int local29 = arg6 + this.anInt6225;
		@Pc(34) int local34 = arg6 + this.anInt6239;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || local23 + arg2.anInt9118 >> arg2.anInt9117 >= arg2.anInt9121 || local29 < 0 || arg2.anInt9115 <= arg2.anInt9118 + local34 >> arg2.anInt9117)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt9118 + local23 >> arg3.anInt9117 >= arg3.anInt9121 || local29 < 0 || arg3.anInt9115 <= local34 + arg3.anInt9118 >> arg3.anInt9117) {
				return;
			}
		} else {
			local17 >>= arg2.anInt9117;
			local23 = local23 + arg2.anInt9118 - 1 >> arg2.anInt9117;
			local29 >>= arg2.anInt9117;
			local34 = local34 + arg2.anInt9118 - 1 >> arg2.anInt9117;
			if (arg5 == arg2.method7835(local17, local29) && arg2.method7835(local23, local29) == arg5 && arg5 == arg2.method7835(local17, local34) && arg2.method7835(local23, local34) == arg5) {
				return;
			}
		}
		@Pc(193) int local193;
		if (arg0 == 1) {
			for (local193 = 0; local193 < this.anInt6242; local193++) {
				this.anIntArray376[local193] = this.anIntArray376[local193] + arg2.method7839(arg4 + this.anIntArray379[local193], arg6 + this.anIntArray380[local193]) - arg5;
			}
		} else {
			@Pc(248) int local248;
			@Pc(259) int local259;
			if (arg0 == 2) {
				local193 = this.anInt6247;
				if (local193 == 0) {
					return;
				}
				for (local248 = 0; local248 < this.anInt6242; local248++) {
					local259 = (this.anIntArray376[local248] << 16) / local193;
					if (local259 < arg1) {
						this.anIntArray376[local248] -= -((arg2.method7839(this.anIntArray379[local248] + arg4, arg6 + this.anIntArray380[local248]) - arg5) * (-local259 + arg1) / arg1);
					}
				}
			} else {
				@Pc(393) int local393;
				if (arg0 == 3) {
					local193 = (arg1 & 0xFF) * 4;
					local248 = (arg1 >> 8 & 0xFF) * 4;
					local259 = (arg1 >> 16 & 0xFF) << 6;
					local393 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local193 >> 1) < 0 || arg2.anInt9121 << arg2.anInt9117 <= arg2.anInt9118 + arg4 + (local193 >> 1) || arg6 - (local248 >> 1) < 0 || arg2.anInt9115 << arg2.anInt9117 <= arg2.anInt9118 + (local248 >> 1) + arg6) {
						return;
					}
					this.method5412(arg6, arg5, arg2, arg4, local393, local248, local259, local193);
				} else if (arg0 == 4) {
					local193 = this.anInt6209 - this.anInt6247;
					for (local248 = 0; local248 < this.anInt6242; local248++) {
						this.anIntArray376[local248] = local193 + this.anIntArray376[local248] + arg3.method7839(this.anIntArray379[local248] + arg4, arg6 + this.anIntArray380[local248]) - arg5;
					}
				} else if (arg0 == 5) {
					local193 = this.anInt6209 - this.anInt6247;
					for (local248 = 0; local248 < this.anInt6242; local248++) {
						local259 = arg4 + this.anIntArray379[local248];
						local393 = arg6 + this.anIntArray380[local248];
						@Pc(399) int local399 = arg2.method7839(local259, local393);
						@Pc(405) int local405 = arg3.method7839(local259, local393);
						@Pc(413) int local413 = local399 - arg1 - local405;
						this.anIntArray376[local248] = local399 + ((this.anIntArray376[local248] << 8) / local193 * local413 >> 8) - arg5;
					}
				}
			}
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "()V")
	@Override
	public void method5426() {
		if (this.anInt6271 > 0 && this.anInt6214 > 0) {
			this.method5445();
			this.method5452();
			this.method5438();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class17 method5409(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class17_Sub3 local17;
		@Pc(21) Class17_Sub3 local21;
		if (arg0 == 1) {
			local21 = this.aClass5_Sub1_16.aClass17_Sub3_28;
			local17 = this.aClass5_Sub1_16.aClass17_Sub3_27;
		} else if (arg0 == 2) {
			local17 = this.aClass5_Sub1_16.aClass17_Sub3_29;
			local21 = this.aClass5_Sub1_16.aClass17_Sub3_23;
		} else if (arg0 == 3) {
			local21 = this.aClass5_Sub1_16.aClass17_Sub3_25;
			local17 = this.aClass5_Sub1_16.aClass17_Sub3_26;
		} else if (arg0 == 4) {
			local21 = this.aClass5_Sub1_16.aClass17_Sub3_21;
			local17 = this.aClass5_Sub1_16.aClass17_Sub3_22;
		} else if (arg0 == 5) {
			local17 = this.aClass5_Sub1_16.aClass17_Sub3_24;
			local21 = this.aClass5_Sub1_16.aClass17_Sub3_30;
		} else {
			local17 = local21 = new Class17_Sub3(this.aClass5_Sub1_16, 0, 0, true, false);
		}
		return this.method5435(arg2, arg1, local21, local17, arg0 != 0);
	}

	@OriginalMember(owner = "client!lu", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6225;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6242; local15++) {
			@Pc(33) int local33 = this.anIntArray379[local15] * local13 + this.anIntArray380[local15] * local9 >> 14;
			this.anIntArray380[local15] = local13 * this.anIntArray380[local15] - local9 * this.anIntArray379[local15] >> 14;
			this.anIntArray379[local15] = local33;
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	private void method5436() {
		if (this.aClass260_3 != null) {
			this.aClass260_3.aBoolean543 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static239.anInt4466 = 0;
			Static587.anInt9602 = 0;
			Static562.anInt9399 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray44.length) {
					local48 = this.anIntArrayArray44[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray94 == null || (this.aShortArray94[local56] & arg6) != 0) {
							Static562.anInt9399 += this.anIntArray379[local56];
							Static239.anInt4466 += this.anIntArray376[local56];
							local24++;
							Static587.anInt9602 += this.anIntArray380[local56];
						}
					}
				}
			}
			if (local24 > 0) {
				Static514.aBoolean633 = true;
				Static587.anInt9602 = arg4 + Static587.anInt9602 / local24;
				Static239.anInt4466 = arg3 + Static239.anInt4466 / local24;
				Static562.anInt9399 = Static562.anInt9399 / local24 + arg2;
			} else {
				Static239.anInt4466 = arg3;
				Static587.anInt9602 = arg4;
				Static562.anInt9399 = arg2;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg4 * arg7[2] + arg7[1] * arg3 + arg2 * arg7[0] + 8192 >> 14;
				local32 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg7[7] * arg3 + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local38;
				arg2 = local24;
				arg3 = local32;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray44.length) {
					local249 = this.anIntArrayArray44[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local50 = local249[local251];
						if (this.aShortArray94 == null || (this.aShortArray94[local50] & arg6) != 0) {
							this.anIntArray379[local50] += arg2;
							this.anIntArray376[local50] += arg3;
							this.anIntArray380[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(396) int local396;
		@Pc(414) int local414;
		@Pc(641) int local641;
		@Pc(650) int local650;
		@Pc(662) int local662;
		@Pc(666) int local666;
		@Pc(684) int local684;
		@Pc(1019) int local1019;
		@Pc(1027) int local1027;
		@Pc(1180) int local1180;
		@Pc(1205) int local1205;
		@Pc(1210) int local1210;
		@Pc(1219) int local1219;
		@Pc(1224) int local1224;
		@Pc(1228) int local1228;
		@Pc(1232) int local1232;
		@Pc(1234) int local1234;
		@Pc(1366) int[] local1366;
		@Pc(1368) int local1368;
		@Pc(1372) int local1372;
		@Pc(1376) int local1376;
		@Pc(1378) int local1378;
		@Pc(1503) int local1503;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray44.length) {
						local249 = this.anIntArrayArray44[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local50 = local249[local251];
							if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local50]) != 0) {
								this.anIntArray379[local50] -= Static562.anInt9399;
								this.anIntArray376[local50] -= Static239.anInt4466;
								this.anIntArray380[local50] -= Static587.anInt9602;
								if (arg4 != 0) {
									local56 = Class21.anIntArray656[arg4];
									local396 = Class21.anIntArray655[arg4];
									local414 = this.anIntArray376[local50] * local56 + local396 * this.anIntArray379[local50] + 16383 >> 14;
									this.anIntArray376[local50] = this.anIntArray376[local50] * local396 + 16383 - local56 * this.anIntArray379[local50] >> 14;
									this.anIntArray379[local50] = local414;
								}
								if (arg2 != 0) {
									local56 = Class21.anIntArray656[arg2];
									local396 = Class21.anIntArray655[arg2];
									local414 = this.anIntArray376[local50] * local396 + 16383 - this.anIntArray380[local50] * local56 >> 14;
									this.anIntArray380[local50] = this.anIntArray376[local50] * local56 + local396 * this.anIntArray380[local50] + 16383 >> 14;
									this.anIntArray376[local50] = local414;
								}
								if (arg3 != 0) {
									local56 = Class21.anIntArray656[arg3];
									local396 = Class21.anIntArray655[arg3];
									local414 = local56 * this.anIntArray380[local50] + this.anIntArray379[local50] * local396 + 16383 >> 14;
									this.anIntArray380[local50] = this.anIntArray380[local50] * local396 + 16383 - this.anIntArray379[local50] * local56 >> 14;
									this.anIntArray379[local50] = local414;
								}
								this.anIntArray379[local50] += Static562.anInt9399;
								this.anIntArray376[local50] += Static239.anInt4466;
								this.anIntArray380[local50] += Static587.anInt9602;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray44.length) {
							local48 = this.anIntArrayArray44[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local56]) != 0) {
									local396 = this.anIntArray381[local56];
									local414 = this.anIntArray381[local56 + 1];
									for (local641 = local396; local641 < local414; local641++) {
										local650 = this.aShortArray105[local641] - 1;
										if (local650 == -1) {
											break;
										}
										if (arg4 != 0) {
											local662 = Class21.anIntArray656[arg4];
											local666 = Class21.anIntArray655[arg4];
											local684 = this.aShortArray103[local650] * local662 + this.aShortArray95[local650] * local666 + 16383 >> 14;
											this.aShortArray103[local650] = (short) (this.aShortArray103[local650] * local666 + 16383 - this.aShortArray95[local650] * local662 >> 14);
											this.aShortArray95[local650] = (short) local684;
										}
										if (arg2 != 0) {
											local662 = Class21.anIntArray656[arg2];
											local666 = Class21.anIntArray655[arg2];
											local684 = this.aShortArray103[local650] * local666 + 16383 - this.aShortArray101[local650] * local662 >> 14;
											this.aShortArray101[local650] = (short) (local666 * this.aShortArray101[local650] + local662 * this.aShortArray103[local650] + 16383 >> 14);
											this.aShortArray103[local650] = (short) local684;
										}
										if (arg3 != 0) {
											local662 = Class21.anIntArray656[arg3];
											local666 = Class21.anIntArray655[arg3];
											local684 = local662 * this.aShortArray101[local650] + local666 * this.aShortArray95[local650] + 16383 >> 14;
											this.aShortArray101[local650] = (short) (local666 * this.aShortArray101[local650] + 16383 - local662 * this.aShortArray95[local650] >> 14);
											this.aShortArray95[local650] = (short) local684;
										}
									}
								}
							}
						}
					}
					this.method5448();
					return;
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static514.aBoolean633) {
					local396 = Static587.anInt9602 * arg7[6] + arg7[0] * Static562.anInt9399 + arg7[3] * Static239.anInt4466 + 8192 >> 14;
					local414 = Static587.anInt9602 * arg7[7] + Static562.anInt9399 * arg7[1] + Static239.anInt4466 * arg7[4] + 8192 >> 14;
					local396 += local251;
					local414 += local50;
					local641 = Static239.anInt4466 * arg7[5] + arg7[2] * Static562.anInt9399 + Static587.anInt9602 * arg7[8] + 8192 >> 14;
					Static562.anInt9399 = local396;
					Static239.anInt4466 = local414;
					local641 += local56;
					Static514.aBoolean633 = false;
					Static587.anInt9602 = local641;
				}
				@Pc(987) int[] local987 = new int[9];
				local414 = Class21.anIntArray655[arg2];
				local641 = Class21.anIntArray656[arg2];
				local650 = Class21.anIntArray655[arg3];
				local662 = Class21.anIntArray656[arg3];
				local666 = Class21.anIntArray655[arg4];
				local684 = Class21.anIntArray656[arg4];
				local1019 = local641 * local666 + 8192 >> 14;
				local1027 = local684 * local641 + 8192 >> 14;
				local987[3] = local684 * local414 + 8192 >> 14;
				local987[1] = local1019 * local662 + local684 * -local650 + 8192 >> 14;
				local987[4] = local414 * local666 + 8192 >> 14;
				local987[5] = -local641;
				local987[0] = local666 * local650 + local662 * local1027 + 8192 >> 14;
				local987[7] = local662 * local684 + local1019 * local650 + 8192 >> 14;
				local987[8] = local414 * local650 + 8192 >> 14;
				local987[6] = -local662 * local666 + local650 * local1027 + 8192 >> 14;
				local987[2] = local662 * local414 + 8192 >> 14;
				@Pc(1155) int local1155 = local987[2] * -Static587.anInt9602 + -Static239.anInt4466 * local987[1] + local987[0] * -Static562.anInt9399 + 8192 >> 14;
				local1180 = -Static239.anInt4466 * local987[4] + -Static562.anInt9399 * local987[3] + local987[5] * -Static587.anInt9602 + 8192 >> 14;
				local1205 = local987[7] * -Static239.anInt4466 + local987[6] * -Static562.anInt9399 + local987[8] * -Static587.anInt9602 + 8192 >> 14;
				local1210 = local1155 + Static562.anInt9399;
				@Pc(1215) int local1215 = local1180 + Static239.anInt4466;
				local1219 = Static587.anInt9602 + local1205;
				@Pc(1222) int[] local1222 = new int[9];
				for (local1224 = 0; local1224 < 3; local1224++) {
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1232 = 0;
						for (local1234 = 0; local1234 < 3; local1234++) {
							local1232 += local987[local1234 + local1224 * 3] * arg7[local1228 * 3 + local1234];
						}
						local1222[local1228 + local1224 * 3] = local1232 + 8192 >> 14;
					}
				}
				local1228 = local987[0] * local251 + local987[1] * local50 + local56 * local987[2] + 8192 >> 14;
				local1232 = local50 * local987[4] + local251 * local987[3] + local56 * local987[5] + 8192 >> 14;
				local1232 += local1215;
				local1228 += local1210;
				local1234 = local251 * local987[6] + local50 * local987[7] + local987[8] * local56 + 8192 >> 14;
				local1234 += local1219;
				local1366 = new int[9];
				for (local1368 = 0; local1368 < 3; local1368++) {
					for (local1372 = 0; local1372 < 3; local1372++) {
						local1376 = 0;
						for (local1378 = 0; local1378 < 3; local1378++) {
							local1376 += local1222[local1378 * 3 + local1372] * arg7[local1378 + local1368 * 3];
						}
						local1366[local1372 + local1368 * 3] = local1376 + 8192 >> 14;
					}
				}
				local1372 = arg7[2] * local1234 + local1228 * arg7[0] + local1232 * arg7[1] + 8192 >> 14;
				local1376 = local1234 * arg7[5] + arg7[3] * local1228 + arg7[4] * local1232 + 8192 >> 14;
				local1378 = arg7[8] * local1234 + arg7[6] * local1228 + arg7[7] * local1232 + 8192 >> 14;
				local1376 += local32;
				local1372 += local24;
				local1378 += local38;
				for (local1503 = 0; local1503 < local8; local1503++) {
					@Pc(1509) int local1509 = arg1[local1503];
					if (this.anIntArrayArray44.length > local1509) {
						@Pc(1519) int[] local1519 = this.anIntArrayArray44[local1509];
						for (@Pc(1521) int local1521 = 0; local1521 < local1519.length; local1521++) {
							@Pc(1527) int local1527 = local1519[local1521];
							if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local1527]) != 0) {
								@Pc(1573) int local1573 = this.anIntArray379[local1527] * local1366[0] + local1366[1] * this.anIntArray376[local1527] + this.anIntArray380[local1527] * local1366[2] + 8192 >> 14;
								@Pc(1606) int local1606 = this.anIntArray379[local1527] * local1366[3] + local1366[4] * this.anIntArray376[local1527] + this.anIntArray380[local1527] * local1366[5] + 8192 >> 14;
								@Pc(1638) int local1638 = this.anIntArray376[local1527] * local1366[7] + local1366[6] * this.anIntArray379[local1527] + this.anIntArray380[local1527] * local1366[8] + 8192 >> 14;
								@Pc(1642) int local1642 = local1606 + local1376;
								@Pc(1646) int local1646 = local1573 + local1372;
								this.anIntArray379[local1527] = local1646;
								@Pc(1655) int local1655 = local1638 + local1378;
								this.anIntArray376[local1527] = local1642;
								this.anIntArray380[local1527] = local1655;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2599) Class252 local2599;
			@Pc(2489) boolean local2489;
			@Pc(2594) Class18 local2594;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					local2489 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray46.length) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray100 == null || (this.aShortArray100[local56] & arg6) != 0) {
									local396 = arg2 * 8 + (this.aByteArray68[local56] & 0xFF);
									if (local396 < 0) {
										local396 = 0;
									} else if (local396 > 255) {
										local396 = 255;
									}
									this.aByteArray68[local56] = (byte) local396;
								}
							}
							local2489 |= local48.length > 0;
						}
					}
					if (local2489) {
						if (this.aClass18Array1 != null) {
							for (local38 = 0; local38 < this.anInt6195; local38++) {
								local2594 = this.aClass18Array1[local38];
								local2599 = this.aClass252Array1[local38];
								local2599.anInt7514 = local2599.anInt7514 & 0xFFFFFF | 255 - (this.aByteArray68[local2594.anInt917] & 0xFF) << 24;
							}
						}
						this.method5436();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray46 != null) {
					local2489 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray46.length > local38) {
							local48 = this.anIntArrayArray46[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray100 == null || (arg6 & this.aShortArray100[local56]) != 0) {
									local396 = this.aShortArray102[local56] & 0xFFFF;
									local414 = local396 >> 10 & 0x3F;
									local641 = local396 >> 7 & 0x7;
									@Pc(2702) int local2702 = arg2 + local414 & 0x3F;
									local641 += arg3 / 4;
									local650 = local396 & 0x7F;
									if (local641 < 0) {
										local641 = 0;
									} else if (local641 > 7) {
										local641 = 7;
									}
									local650 += arg4;
									if (local650 < 0) {
										local650 = 0;
									} else if (local650 > 127) {
										local650 = 127;
									}
									this.aShortArray102[local56] = (short) (local650 | local641 << 7 | local2702 << 10);
								}
							}
							local2489 |= local48.length > 0;
						}
					}
					if (local2489) {
						if (this.aClass18Array1 != null) {
							for (local38 = 0; local38 < this.anInt6195; local38++) {
								local2594 = this.aClass18Array1[local38];
								local2599 = this.aClass252Array1[local38];
								local2599.anInt7514 = local2599.anInt7514 & 0xFF000000 | Static159.anIntArray159[this.aShortArray102[local2594.anInt917] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5436();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray45.length > local32) {
							local249 = this.anIntArrayArray45[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2599 = this.aClass252Array1[local249[local251]];
								local2599.anInt7511 += arg3;
								local2599.anInt7517 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray45.length) {
							local249 = this.anIntArrayArray45[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2599 = this.aClass252Array1[local249[local251]];
								local2599.anInt7512 = arg2 * local2599.anInt7512 >> 7;
								local2599.anInt7513 = local2599.anInt7513 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray45.length) {
						local249 = this.anIntArrayArray45[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local2599 = this.aClass252Array1[local249[local251]];
							local2599.anInt7510 = local2599.anInt7510 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray44.length > local32) {
					local249 = this.anIntArrayArray44[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local50 = local249[local251];
						if (this.aShortArray94 == null || (this.aShortArray94[local50] & arg6) != 0) {
							this.anIntArray379[local50] -= Static562.anInt9399;
							this.anIntArray376[local50] -= Static239.anInt4466;
							this.anIntArray380[local50] -= Static587.anInt9602;
							this.anIntArray379[local50] = this.anIntArray379[local50] * arg2 >> 7;
							this.anIntArray376[local50] = arg3 * this.anIntArray376[local50] >> 7;
							this.anIntArray380[local50] = this.anIntArray380[local50] * arg4 >> 7;
							this.anIntArray379[local50] += Static562.anInt9399;
							this.anIntArray376[local50] += Static239.anInt4466;
							this.anIntArray380[local50] += Static587.anInt9602;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local251 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static514.aBoolean633) {
				local396 = Static239.anInt4466 * arg7[3] + Static562.anInt9399 * arg7[0] + arg7[6] * Static587.anInt9602 + 8192 >> 14;
				local414 = arg7[4] * Static239.anInt4466 + Static562.anInt9399 * arg7[1] + arg7[7] * Static587.anInt9602 + 8192 >> 14;
				local396 += local251;
				local641 = arg7[8] * Static587.anInt9602 + arg7[2] * Static562.anInt9399 + Static239.anInt4466 * arg7[5] + 8192 >> 14;
				local414 += local50;
				Static239.anInt4466 = local414;
				Static562.anInt9399 = local396;
				local641 += local56;
				Static587.anInt9602 = local641;
				Static514.aBoolean633 = false;
			}
			local396 = arg2 << 15 >> 7;
			local414 = arg3 << 15 >> 7;
			local641 = arg4 << 15 >> 7;
			local650 = -Static562.anInt9399 * local396 + 8192 >> 14;
			local662 = -Static239.anInt4466 * local414 + 8192 >> 14;
			local666 = local641 * -Static587.anInt9602 + 8192 >> 14;
			local684 = Static562.anInt9399 + local650;
			local1019 = Static239.anInt4466 + local662;
			local1027 = local666 + Static587.anInt9602;
			@Pc(2015) int[] local2015 = new int[] { local396 * arg7[0] + 8192 >> 14, arg7[3] * local396 + 8192 >> 14, local396 * arg7[6] + 8192 >> 14, arg7[1] * local414 + 8192 >> 14, arg7[4] * local414 + 8192 >> 14, local414 * arg7[7] + 8192 >> 14, local641 * arg7[2] + 8192 >> 14, local641 * arg7[5] + 8192 >> 14, local641 * arg7[8] + 8192 >> 14 };
			local1180 = local251 * local396 + 8192 >> 14;
			local1205 = local414 * local50 + 8192 >> 14;
			@Pc(2143) int local2143 = local1205 + local1019;
			@Pc(2147) int local2147 = local1180 + local684;
			local1210 = local641 * local56 + 8192 >> 14;
			@Pc(2159) int local2159 = local1210 + local1027;
			@Pc(2162) int[] local2162 = new int[9];
			@Pc(2168) int local2168;
			for (local1219 = 0; local1219 < 3; local1219++) {
				for (local2168 = 0; local2168 < 3; local2168++) {
					local1224 = 0;
					for (local1228 = 0; local1228 < 3; local1228++) {
						local1224 += arg7[local1219 * 3 + local1228] * local2015[local1228 * 3 + local2168];
					}
					local2162[local1219 * 3 + local2168] = local1224 + 8192 >> 14;
				}
			}
			local2168 = local2143 * arg7[1] + local2147 * arg7[0] + local2159 * arg7[2] + 8192 >> 14;
			local1224 = local2159 * arg7[5] + local2147 * arg7[3] + local2143 * arg7[4] + 8192 >> 14;
			local1228 = local2147 * arg7[6] + local2143 * arg7[7] + arg7[8] * local2159 + 8192 >> 14;
			local1224 += local32;
			local2168 += local24;
			local1228 += local38;
			for (local1232 = 0; local1232 < local8; local1232++) {
				local1234 = arg1[local1232];
				if (this.anIntArrayArray44.length > local1234) {
					local1366 = this.anIntArrayArray44[local1234];
					for (local1368 = 0; local1368 < local1366.length; local1368++) {
						local1372 = local1366[local1368];
						if (this.aShortArray94 == null || (arg6 & this.aShortArray94[local1372]) != 0) {
							local1376 = this.anIntArray379[local1372] * local2162[0] + this.anIntArray376[local1372] * local2162[1] + this.anIntArray380[local1372] * local2162[2] + 8192 >> 14;
							local1378 = this.anIntArray376[local1372] * local2162[4] + this.anIntArray379[local1372] * local2162[3] + this.anIntArray380[local1372] * local2162[5] + 8192 >> 14;
							local1503 = this.anIntArray376[local1372] * local2162[7] + local2162[6] * this.anIntArray379[local1372] + local2162[8] * this.anIntArray380[local1372] + 8192 >> 14;
							@Pc(2442) int local2442 = local1376 + local2168;
							@Pc(2446) int local2446 = local1378 + local1224;
							@Pc(2450) int local2450 = local1503 + local1228;
							this.anIntArray379[local1372] = local2442;
							this.anIntArray376[local1372] = local2446;
							this.anIntArray380[local1372] = local2450;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass5_Sub1_16.anInterface7_15;
		for (@Pc(11) int local11 = 0; local11 < this.anInt6234; local11++) {
			if (this.aShortArray93[local11] == arg0) {
				this.aShortArray93[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class195 local51 = local9.method8118(arg0 & 0xFFFF);
			local41 = local51.aByte84;
			local39 = local51.aByte79;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(72) Class195 local72 = local9.method8118(arg1 & 0xFFFF);
			if (local72.aByte80 != 0 || local72.aByte81 != 0) {
				this.aBoolean445 = true;
			}
			local61 = local72.aByte84;
			local59 = local72.aByte79;
		}
		if (!(local39 != local59 | local41 != local61)) {
			return;
		}
		if (this.aClass18Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt6195; local109++) {
				@Pc(116) Class18 local116 = this.aClass18Array1[local109];
				@Pc(121) Class252 local121 = this.aClass252Array1[local109];
				local121.anInt7514 = local121.anInt7514 & 0xFF000000 | Static159.anIntArray159[this.aShortArray102[local116.anInt917] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5436();
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)V")
	private void method5437() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt6242; local29++) {
			@Pc(36) int local36 = this.anIntArray379[local29];
			@Pc(41) int local41 = this.anIntArray376[local29];
			@Pc(46) int local46 = this.anIntArray380[local29];
			if (local9 > local41) {
				local9 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local41 > local15) {
				local15 = local41;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			if (local46 > local17) {
				local17 = local46;
			}
			if (local11 > local46) {
				local11 = local46;
			}
			@Pc(104) int local104 = local46 * local46 + local36 * local36;
			if (local25 < local104) {
				local25 = local104;
			}
			local104 = local41 * local41 + local46 * local46 + local36 * local36;
			if (local104 > local27) {
				local27 = local104;
			}
		}
		this.anInt6239 = local17;
		this.anInt6247 = local9;
		this.anInt6267 = local13;
		this.anInt6209 = local15;
		this.anInt6225 = local11;
		this.anInt6218 = local7;
		this.anInt6244 = (int) (Math.sqrt((double) local25) + 0.99D);
		this.anInt6252 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean446 = true;
	}

	@OriginalMember(owner = "client!lu", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6242; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray379[local15] + local9 * this.anIntArray376[local15] >> 14;
			this.anIntArray376[local15] = local13 * this.anIntArray376[local15] - this.anIntArray379[local15] * local9 >> 14;
			this.anIntArray379[local15] = local33;
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5424(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(17) int local17;
		@Pc(25) int local25;
		@Pc(21) int local21;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			local25 = arg3 << 4;
			Static587.anInt9602 = 0;
			Static239.anInt4466 = 0;
			Static562.anInt9399 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray44.length > local41) {
					local55 = this.anIntArrayArray44[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static562.anInt9399 += this.anIntArray379[local63];
						Static239.anInt4466 += this.anIntArray376[local63];
						Static587.anInt9602 += this.anIntArray380[local63];
						local33++;
					}
				}
			}
			if (local33 <= 0) {
				Static239.anInt4466 = local25;
				Static562.anInt9399 = local17;
				Static587.anInt9602 = local21;
			} else {
				Static562.anInt9399 = Static562.anInt9399 / local33 + local17;
				Static587.anInt9602 = Static587.anInt9602 / local33 + local21;
				Static239.anInt4466 = Static239.anInt4466 / local33 + local25;
			}
			return;
		}
		@Pc(165) int[] local165;
		@Pc(167) int local167;
		if (arg0 == 1) {
			local25 = arg3 << 4;
			local17 = arg2 << 4;
			local21 = arg4 << 4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray44.length > local35) {
					local165 = this.anIntArrayArray44[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray379[local57] += local17;
						this.anIntArray376[local57] += local25;
						this.anIntArray380[local57] += local21;
					}
				}
			}
			return;
		}
		@Pc(283) int local283;
		@Pc(302) int local302;
		@Pc(758) int local758;
		@Pc(767) int local767;
		if (arg0 == 2) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray44.length) {
					local165 = this.anIntArrayArray44[local35];
					if ((arg5 & 0x1) == 0) {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray379[local57] -= Static562.anInt9399;
							this.anIntArray376[local57] -= Static239.anInt4466;
							this.anIntArray380[local57] -= Static587.anInt9602;
							if (arg4 != 0) {
								local63 = Class21.anIntArray656[arg4];
								local283 = Class21.anIntArray655[arg4];
								local302 = local63 * this.anIntArray376[local57] + this.anIntArray379[local57] * local283 + 16383 >> 14;
								this.anIntArray376[local57] = local283 * this.anIntArray376[local57] + 16383 - this.anIntArray379[local57] * local63 >> 14;
								this.anIntArray379[local57] = local302;
							}
							if (arg2 != 0) {
								local63 = Class21.anIntArray656[arg2];
								local283 = Class21.anIntArray655[arg2];
								local302 = this.anIntArray376[local57] * local283 + 16383 - local63 * this.anIntArray380[local57] >> 14;
								this.anIntArray380[local57] = local283 * this.anIntArray380[local57] + this.anIntArray376[local57] * local63 + 16383 >> 14;
								this.anIntArray376[local57] = local302;
							}
							if (arg3 != 0) {
								local63 = Class21.anIntArray656[arg3];
								local283 = Class21.anIntArray655[arg3];
								local302 = local283 * this.anIntArray379[local57] + this.anIntArray380[local57] * local63 + 16383 >> 14;
								this.anIntArray380[local57] = local283 * this.anIntArray380[local57] + 16383 - local63 * this.anIntArray379[local57] >> 14;
								this.anIntArray379[local57] = local302;
							}
							this.anIntArray379[local57] += Static562.anInt9399;
							this.anIntArray376[local57] += Static239.anInt4466;
							this.anIntArray380[local57] += Static587.anInt9602;
						}
					} else {
						for (local167 = 0; local167 < local165.length; local167++) {
							local57 = local165[local167];
							this.anIntArray379[local57] -= Static562.anInt9399;
							this.anIntArray376[local57] -= Static239.anInt4466;
							this.anIntArray380[local57] -= Static587.anInt9602;
							if (arg2 != 0) {
								local63 = Class21.anIntArray656[arg2];
								local283 = Class21.anIntArray655[arg2];
								local302 = this.anIntArray376[local57] * local283 + 16383 - this.anIntArray380[local57] * local63 >> 14;
								this.anIntArray380[local57] = this.anIntArray380[local57] * local283 + this.anIntArray376[local57] * local63 + 16383 >> 14;
								this.anIntArray376[local57] = local302;
							}
							if (arg4 != 0) {
								local63 = Class21.anIntArray656[arg4];
								local283 = Class21.anIntArray655[arg4];
								local302 = this.anIntArray376[local57] * local63 + local283 * this.anIntArray379[local57] + 16383 >> 14;
								this.anIntArray376[local57] = local283 * this.anIntArray376[local57] + 16383 - local63 * this.anIntArray379[local57] >> 14;
								this.anIntArray379[local57] = local302;
							}
							if (arg3 != 0) {
								local63 = Class21.anIntArray656[arg3];
								local283 = Class21.anIntArray655[arg3];
								local302 = this.anIntArray380[local57] * local63 + local283 * this.anIntArray379[local57] + 16383 >> 14;
								this.anIntArray380[local57] = this.anIntArray380[local57] * local283 + 16383 - local63 * this.anIntArray379[local57] >> 14;
								this.anIntArray379[local57] = local302;
							}
							this.anIntArray379[local57] += Static562.anInt9399;
							this.anIntArray376[local57] += Static239.anInt4466;
							this.anIntArray380[local57] += Static587.anInt9602;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray44.length > local41) {
						local55 = this.anIntArrayArray44[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local283 = this.anIntArray381[local63];
							local302 = this.anIntArray381[local63 + 1];
							for (local758 = local283; local758 < local302; local758++) {
								local767 = this.aShortArray105[local758] - 1;
								if (local767 == -1) {
									break;
								}
								@Pc(777) int local777;
								@Pc(781) int local781;
								@Pc(799) int local799;
								if (arg4 != 0) {
									local777 = Class21.anIntArray656[arg4];
									local781 = Class21.anIntArray655[arg4];
									local799 = local781 * this.aShortArray95[local767] + local777 * this.aShortArray103[local767] + 16383 >> 14;
									this.aShortArray103[local767] = (short) (this.aShortArray103[local767] * local781 + 16383 - local777 * this.aShortArray95[local767] >> 14);
									this.aShortArray95[local767] = (short) local799;
								}
								if (arg2 != 0) {
									local777 = Class21.anIntArray656[arg2];
									local781 = Class21.anIntArray655[arg2];
									local799 = local781 * this.aShortArray103[local767] + 16383 - this.aShortArray101[local767] * local777 >> 14;
									this.aShortArray101[local767] = (short) (this.aShortArray101[local767] * local781 + local777 * this.aShortArray103[local767] + 16383 >> 14);
									this.aShortArray103[local767] = (short) local799;
								}
								if (arg3 != 0) {
									local777 = Class21.anIntArray656[arg3];
									local781 = Class21.anIntArray655[arg3];
									local799 = local777 * this.aShortArray101[local767] + local781 * this.aShortArray95[local767] + 16383 >> 14;
									this.aShortArray101[local767] = (short) (this.aShortArray101[local767] * local781 + 16383 - this.aShortArray95[local767] * local777 >> 14);
									this.aShortArray95[local767] = (short) local799;
								}
							}
						}
					}
				}
				this.method5448();
			}
		} else if (arg0 == 3) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray44.length) {
					local165 = this.anIntArrayArray44[local35];
					for (local167 = 0; local167 < local165.length; local167++) {
						local57 = local165[local167];
						this.anIntArray379[local57] -= Static562.anInt9399;
						this.anIntArray376[local57] -= Static239.anInt4466;
						this.anIntArray380[local57] -= Static587.anInt9602;
						this.anIntArray379[local57] = arg2 * this.anIntArray379[local57] >> 7;
						this.anIntArray376[local57] = arg3 * this.anIntArray376[local57] >> 7;
						this.anIntArray380[local57] = this.anIntArray380[local57] * arg4 >> 7;
						this.anIntArray379[local57] += Static562.anInt9399;
						this.anIntArray376[local57] += Static239.anInt4466;
						this.anIntArray380[local57] += Static587.anInt9602;
					}
				}
			}
		} else {
			@Pc(1209) Class252 local1209;
			@Pc(1107) boolean local1107;
			@Pc(1204) Class18 local1204;
			if (arg0 == 5) {
				if (this.anIntArrayArray46 != null) {
					local1107 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray46.length > local41) {
							local55 = this.anIntArrayArray46[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local283 = arg2 * 8 + (this.aByteArray68[local63] & 0xFF);
								if (local283 < 0) {
									local283 = 0;
								} else if (local283 > 255) {
									local283 = 255;
								}
								this.aByteArray68[local63] = (byte) local283;
							}
							local1107 |= local55.length > 0;
						}
					}
					if (local1107) {
						if (this.aClass18Array1 != null) {
							for (local41 = 0; local41 < this.anInt6195; local41++) {
								local1204 = this.aClass18Array1[local41];
								local1209 = this.aClass252Array1[local41];
								local1209.anInt7514 = 255 - (this.aByteArray68[local1204.anInt917] & 0xFF) << 24 | local1209.anInt7514 & 0xFFFFFF;
							}
						}
						this.method5436();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray46 != null) {
					local1107 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray46.length) {
							local55 = this.anIntArrayArray46[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local283 = this.aShortArray102[local63] & 0xFFFF;
								local302 = local283 >> 10 & 0x3F;
								local758 = local283 >> 7 & 0x7;
								local767 = local283 & 0x7F;
								local758 += arg3 / 4;
								@Pc(1310) int local1310 = local302 + arg2 & 0x3F;
								local767 += arg4;
								if (local758 < 0) {
									local758 = 0;
								} else if (local758 > 7) {
									local758 = 7;
								}
								if (local767 < 0) {
									local767 = 0;
								} else if (local767 > 127) {
									local767 = 127;
								}
								this.aShortArray102[local63] = (short) (local767 | local758 << 7 | local1310 << 10);
							}
							local1107 |= local55.length > 0;
						}
					}
					if (local1107) {
						if (this.aClass18Array1 != null) {
							for (local41 = 0; local41 < this.anInt6195; local41++) {
								local1204 = this.aClass18Array1[local41];
								local1209 = this.aClass252Array1[local41];
								local1209.anInt7514 = Static159.anIntArray159[this.aShortArray102[local1204.anInt917] & 0xFFFF] & 0xFFFFFF | local1209.anInt7514 & 0xFF000000;
							}
						}
						this.method5436();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray45.length > local35) {
							local165 = this.anIntArrayArray45[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1209 = this.aClass252Array1[local165[local167]];
								local1209.anInt7517 += arg2;
								local1209.anInt7511 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray45 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray45.length) {
							local165 = this.anIntArrayArray45[local35];
							for (local167 = 0; local167 < local165.length; local167++) {
								local1209 = this.aClass252Array1[local165[local167]];
								local1209.anInt7512 = local1209.anInt7512 * arg2 >> 7;
								local1209.anInt7513 = arg3 * local1209.anInt7513 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray45 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray45.length) {
						local165 = this.anIntArrayArray45[local35];
						for (local167 = 0; local167 < local165.length; local167++) {
							local1209 = this.aClass252Array1[local165[local167]];
							local1209.anInt7510 = arg2 + local1209.anInt7510 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
	private void method5438() {
		if (!this.aBoolean444) {
			return;
		}
		this.aBoolean444 = false;
		if (this.aClass284Array5 == null && this.aClass353Array5 == null && this.aClass18Array1 == null) {
			if (this.anIntArray379 != null && !Static10.method671(this.anInt6197, this.anInt6226)) {
				if (this.aClass260_4 == null || this.aClass260_4.method6703()) {
					if (!this.aBoolean446) {
						this.method5437();
					}
					this.anIntArray379 = null;
				} else {
					this.aBoolean444 = true;
				}
			}
			if (this.anIntArray376 != null && !Static76.method1835(this.anInt6226, this.anInt6197)) {
				if (this.aClass260_4 == null || this.aClass260_4.method6703()) {
					if (!this.aBoolean446) {
						this.method5437();
					}
					this.anIntArray376 = null;
				} else {
					this.aBoolean444 = true;
				}
			}
			if (this.anIntArray380 != null && !Static48.method1417(this.anInt6197, this.anInt6226)) {
				if (this.aClass260_4 == null || this.aClass260_4.method6703()) {
					if (!this.aBoolean446) {
						this.method5437();
					}
					this.anIntArray380 = null;
				} else {
					this.aBoolean444 = true;
				}
			}
		}
		if (this.aShortArray105 != null && this.anIntArray379 == null && this.anIntArray376 == null && this.anIntArray380 == null) {
			this.anIntArray381 = null;
			this.aShortArray105 = null;
		}
		if (this.aByteArray69 != null && !Static321.method5259(this.anInt6197, this.anInt6226)) {
			label197: {
				label196: {
					@Pc(159) boolean local159;
					if ((this.anInt6197 & 0x37) == 0) {
						if (this.aClass260_3 == null || this.aClass260_3.method6703()) {
							break label196;
						}
						local159 = false;
					} else {
						if (this.aClass260_1 == null || this.aClass260_1.method6703()) {
							break label196;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean444 = true;
						break label197;
					}
				}
				this.aByteArray69 = null;
				this.aShortArray95 = this.aShortArray103 = this.aShortArray101 = null;
			}
		}
		if (this.aShortArray102 != null && !Static311.method6193(this.anInt6226, this.anInt6197)) {
			if (this.aClass260_3 == null || this.aClass260_3.method6703()) {
				this.aShortArray102 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.aByteArray68 != null && !Static337.method5475(this.anInt6226, this.anInt6197)) {
			if (this.aClass260_3 == null || this.aClass260_3.method6703()) {
				this.aByteArray68 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.aFloatArray44 != null && !Static457.method7002(this.anInt6197, this.anInt6226)) {
			if (this.aClass260_2 == null || this.aClass260_2.method6703()) {
				this.aFloatArray44 = this.aFloatArray43 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.aShortArray93 != null && !Static138.method2571(this.anInt6197, this.anInt6226)) {
			if (this.aClass260_3 == null || this.aClass260_3.method6703()) {
				this.aShortArray93 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.aShortArray98 != null && !Static505.method7460(this.anInt6226, this.anInt6197)) {
			if ((this.aClass378_1 == null || this.aClass378_1.method8726()) && (this.aClass260_3 == null || this.aClass260_3.method6703())) {
				this.aShortArray98 = this.aShortArray99 = this.aShortArray97 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.aShortArray96 != null) {
			if (this.aClass260_4 == null || this.aClass260_4.method6703()) {
				this.aShortArray96 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.aShortArray104 != null) {
			if (this.aClass260_3 == null || this.aClass260_3.method6703()) {
				this.aShortArray104 = null;
			} else {
				this.aBoolean444 = true;
			}
		}
		if (this.anIntArrayArray46 != null && !Static546.method7960(this.anInt6226, this.anInt6197)) {
			this.anIntArrayArray46 = null;
			this.aShortArray100 = null;
		}
		if (this.anIntArrayArray44 != null && !Static503.method7427(this.anInt6226, this.anInt6197)) {
			this.anIntArrayArray44 = null;
			this.aShortArray94 = null;
		}
		if (this.anIntArrayArray45 != null && !Static596.method8354(this.anInt6197, this.anInt6226)) {
			this.anIntArrayArray45 = null;
		}
		if (this.anIntArray375 != null && (this.anInt6226 & 0x800) == 0 && (this.anInt6226 & 0x40000) == 0) {
			this.anIntArray377 = null;
			this.anIntArray375 = null;
			this.anIntArray378 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V")
	public void method5439() {
		if (this.aClass260_4 != null) {
			this.aClass260_4.method6705();
		}
		if (this.aClass260_2 != null) {
			this.aClass260_2.method6705();
		}
		if (this.aClass260_3 != null) {
			this.aClass260_3.method6705();
		}
		if (this.aClass260_1 != null) {
			this.aClass260_1.method6705();
		}
		if (this.aClass378_1 != null) {
			this.aClass378_1.method8723();
		}
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "()V")
	@Override
	protected void method5427() {
	}

	@OriginalMember(owner = "client!lu", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class21.anIntArray656[arg0];
		@Pc(13) int local13 = Class21.anIntArray655[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt6242; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray376[local15] - this.anIntArray380[local15] * local9 >> 14;
			this.anIntArray380[local15] = local9 * this.anIntArray376[local15] + local13 * this.anIntArray380[local15] >> 14;
			this.anIntArray376[local15] = local34;
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort100 = (short) arg0;
		this.method5436();
	}

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean447;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "()[Lclient!qv;")
	@Override
	public Class284[] method5417() {
		return this.aClass284Array5;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IFIILclient!fu;ZFIIJI)S")
	private short method5440(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class118 arg4, @OriginalArg(6) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray381[arg6];
		@Pc(17) int local17 = this.anIntArray381[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray105[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg8 == Static310.aLongArray15[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray105[local19] = (short) (this.anInt6271 + 1);
		Static310.aLongArray15[local19] = arg8;
		this.aShortArray104[this.anInt6271] = (short) arg3;
		this.aShortArray96[this.anInt6271] = (short) arg6;
		this.aShortArray95[this.anInt6271] = (short) arg2;
		this.aShortArray103[this.anInt6271] = (short) arg7;
		this.aShortArray101[this.anInt6271] = (short) arg0;
		this.aByteArray69[this.anInt6271] = (byte) arg9;
		this.aFloatArray44[this.anInt6271] = arg5;
		this.aFloatArray43[this.anInt6271] = arg1;
		return (short) this.anInt6271++;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!sk;IIIIIZ)Z")
	private boolean method5441(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class39_Sub1 local8 = (Class39_Sub1) arg0;
		@Pc(12) Class39_Sub1 local12 = this.aClass5_Sub1_16.aClass39_Sub1_16;
		@Pc(33) float local33 = local12.aFloat58 + local8.aFloat59 * local12.aFloat50 + local8.aFloat58 * local12.aFloat57 + local8.aFloat55 * local12.aFloat51;
		@Pc(54) float local54 = local8.aFloat59 * local12.aFloat54 + local8.aFloat58 * local12.aFloat56 + local8.aFloat55 * local12.aFloat52 + local12.aFloat59;
		Static156.aFloat103 = local8.aFloat57 * local12.aFloat56 + local12.aFloat54 * local8.aFloat56 + local8.aFloat53 * local12.aFloat52;
		@Pc(93) float local93 = local12.aFloat61 * local8.aFloat59 + local12.aFloat53 * local8.aFloat58 + local8.aFloat55 * local12.aFloat60 + local12.aFloat55;
		Static440.aFloat182 = local12.aFloat57 * local8.aFloat51 + local8.aFloat52 * local12.aFloat50 + local8.aFloat60 * local12.aFloat51;
		Static337.aFloat134 = local12.aFloat60 * local8.aFloat61 + local12.aFloat53 * local8.aFloat50 + local12.aFloat61 * local8.aFloat54;
		Static340.aFloat153 = local8.aFloat57 * local12.aFloat53 + local8.aFloat56 * local12.aFloat61 + local8.aFloat53 * local12.aFloat60;
		Static4.aFloat1 = local12.aFloat57 * local8.aFloat50 + local8.aFloat54 * local12.aFloat50 + local12.aFloat51 * local8.aFloat61;
		Static99.aFloat72 = local12.aFloat56 * local8.aFloat50 + local12.aFloat54 * local8.aFloat54 + local12.aFloat52 * local8.aFloat61;
		Static49.aFloat49 = local12.aFloat53 * local8.aFloat51 + local12.aFloat61 * local8.aFloat52 + local12.aFloat60 * local8.aFloat60;
		Static303.aFloat109 = local12.aFloat50 * local8.aFloat56 + local8.aFloat57 * local12.aFloat57 + local8.aFloat53 * local12.aFloat51;
		Static560.aFloat202 = local8.aFloat60 * local12.aFloat52 + local8.aFloat51 * local12.aFloat56 + local8.aFloat52 * local12.aFloat54;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass5_Sub1_16.anInt6530;
		@Pc(255) int local255 = this.aClass5_Sub1_16.anInt6514;
		if (!this.aBoolean446) {
			this.method5437();
		}
		@Pc(269) int local269 = this.anInt6267 - this.anInt6218 >> 1;
		@Pc(278) int local278 = this.anInt6209 - this.anInt6247 >> 1;
		@Pc(287) int local287 = this.anInt6239 - this.anInt6225 >> 1;
		@Pc(292) int local292 = local269 + this.anInt6218;
		@Pc(297) int local297 = this.anInt6247 + local278;
		@Pc(302) int local302 = local287 + this.anInt6225;
		@Pc(309) int local309 = local292 - (local269 << arg2);
		@Pc(316) int local316 = local297 - (local278 << arg2);
		@Pc(322) int local322 = local302 - (local287 << arg2);
		@Pc(328) int local328 = (local269 << arg2) + local292;
		@Pc(335) int local335 = local297 + (local278 << arg2);
		@Pc(342) int local342 = local302 + (local287 << arg2);
		Static477.anIntArray525[0] = local309;
		Static195.anIntArray205[0] = local316;
		Static477.anIntArray525[1] = local328;
		Static591.anIntArray629[0] = local322;
		Static195.anIntArray205[1] = local316;
		Static477.anIntArray525[2] = local309;
		Static591.anIntArray629[1] = local322;
		Static195.anIntArray205[2] = local335;
		Static477.anIntArray525[3] = local328;
		Static591.anIntArray629[2] = local322;
		Static195.anIntArray205[3] = local335;
		Static477.anIntArray525[4] = local309;
		Static591.anIntArray629[3] = local322;
		Static195.anIntArray205[4] = local316;
		Static477.anIntArray525[5] = local328;
		Static591.anIntArray629[4] = local342;
		Static195.anIntArray205[5] = local316;
		Static477.anIntArray525[6] = local309;
		Static591.anIntArray629[5] = local342;
		Static195.anIntArray205[6] = local335;
		Static477.anIntArray525[7] = local328;
		Static591.anIntArray629[6] = local342;
		Static195.anIntArray205[7] = local335;
		Static591.anIntArray629[7] = local342;
		@Pc(505) float local505;
		@Pc(477) float local477;
		@Pc(491) float local491;
		@Pc(463) float local463;
		@Pc(458) float local458;
		@Pc(453) float local453;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = Static591.anIntArray629[local446];
			local458 = Static195.anIntArray205[local446];
			local463 = Static477.anIntArray525[local446];
			local477 = local54 + Static156.aFloat103 * local463 + local458 * Static99.aFloat72 + Static560.aFloat202 * local453;
			local491 = local93 + Static49.aFloat49 * local453 + Static337.aFloat134 * local458 + local463 * Static340.aFloat153;
			local505 = Static440.aFloat182 * local453 + Static4.aFloat1 * local458 + local463 * Static303.aFloat109 + local33;
			if ((float) this.aClass5_Sub1_16.anInt6510 <= local491) {
				if (arg3 > 0) {
					local491 = arg3;
				}
				@Pc(529) float local529 = local505 * (float) local251 / local491 + (float) this.aClass5_Sub1_16.anInt6540;
				if (local243 < local529) {
					local243 = local529;
				}
				if (local529 < local241) {
					local241 = local529;
				}
				@Pc(553) float local553 = (float) local255 * local477 / local491 + (float) this.aClass5_Sub1_16.anInt6527;
				local239 = true;
				if (local245 > local553) {
					local245 = local553;
				}
				if (local553 > local247) {
					local247 = local553;
				}
			}
		}
		if (local239 && local241 < (float) arg1 && local243 > (float) arg1 && (float) arg4 > local245 && local247 > (float) arg4) {
			if (arg5) {
				return true;
			}
			if (this.anInt6271 > Static323.anIntArray344.length) {
				Static565.anIntArray390 = new int[this.anInt6271];
				Static323.anIntArray344 = new int[this.anInt6271];
			}
			@Pc(686) int local686;
			for (@Pc(612) int local612 = 0; local612 < this.anInt6242; local612++) {
				local453 = this.anIntArray380[local612];
				local463 = this.anIntArray379[local612];
				local458 = this.anIntArray376[local612];
				local491 = Static337.aFloat134 * local458 + local463 * Static340.aFloat153 + local453 * Static49.aFloat49 + local93;
				local477 = local463 * Static156.aFloat103 + local458 * Static99.aFloat72 + local453 * Static560.aFloat202 + local54;
				local505 = local33 + Static440.aFloat182 * local453 + Static303.aFloat109 * local463 + Static4.aFloat1 * local458;
				@Pc(693) int local693;
				@Pc(695) int local695;
				@Pc(704) int local704;
				if (local491 >= (float) this.aClass5_Sub1_16.anInt6510) {
					if (arg3 > 0) {
						local491 = arg3;
					}
					local686 = (int) ((float) this.aClass5_Sub1_16.anInt6540 + (float) local251 * local505 / local491);
					local693 = (int) ((float) local255 * local477 / local491 + (float) this.aClass5_Sub1_16.anInt6527);
					local695 = this.anIntArray381[local612];
					local704 = this.anIntArray381[local612 + 1];
					for (@Pc(771) int local771 = local695; local771 < local704; local771++) {
						@Pc(780) int local780 = this.aShortArray105[local771] - 1;
						if (local780 == -1) {
							break;
						}
						Static323.anIntArray344[local780] = local686;
						Static565.anIntArray390[local780] = local693;
					}
				} else {
					local686 = this.anIntArray381[local612];
					local693 = this.anIntArray381[local612 + 1];
					for (local695 = local686; local695 < local693; local695++) {
						local704 = this.aShortArray105[local695] - 1;
						if (local704 == -1) {
							break;
						}
						Static323.anIntArray344[this.aShortArray105[local695] - 1] = -999999;
					}
				}
			}
			for (local686 = 0; local686 < this.anInt6234; local686++) {
				if (Static323.anIntArray344[this.aShortArray98[local686]] != -999999 && Static323.anIntArray344[this.aShortArray99[local686]] != -999999 && Static323.anIntArray344[this.aShortArray97[local686]] != -999999 && this.method5450(Static565.anIntArray390[this.aShortArray98[local686]], Static565.anIntArray390[this.aShortArray99[local686]], Static323.anIntArray344[this.aShortArray97[local686]], Static565.anIntArray390[this.aShortArray97[local686]], arg4, Static323.anIntArray344[this.aShortArray99[local686]], arg1, Static323.anIntArray344[this.aShortArray98[local686]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!hm;B)V")
	private void method5442(@OriginalArg(0) Class3_Sub4_Sub5_Sub2 arg0) {
		if (Static323.anIntArray344.length < this.anInt6271) {
			Static323.anIntArray344 = new int[this.anInt6271];
			Static565.anIntArray390 = new int[this.anInt6271];
		}
		@Pc(52) int local52;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(26) int local26 = 0; local26 < this.anInt6242; local26++) {
			local52 = (this.anIntArray379[local26] - (this.anIntArray376[local26] * this.aClass5_Sub1_16.anInt6547 >> 8) >> this.aClass5_Sub1_16.anInt6526) - arg0.anInt4141;
			@Pc(76) int local76 = (this.anIntArray380[local26] - (this.aClass5_Sub1_16.anInt6511 * this.anIntArray376[local26] >> 8) >> this.aClass5_Sub1_16.anInt6526) - arg0.anInt4146;
			@Pc(81) int local81 = this.anIntArray381[local26];
			@Pc(88) int local88 = this.anIntArray381[local26 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray105[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static323.anIntArray344[local99] = local52;
				Static565.anIntArray390[local99] = local76;
			}
		}
		for (local52 = 0; local52 < this.anInt6214; local52++) {
			if (this.aByteArray68 == null || this.aByteArray68[local52] <= 128) {
				@Pc(141) short local141 = this.aShortArray98[local52];
				@Pc(146) short local146 = this.aShortArray99[local52];
				@Pc(151) short local151 = this.aShortArray97[local52];
				local90 = Static323.anIntArray344[local141];
				local99 = Static323.anIntArray344[local146];
				@Pc(163) int local163 = Static323.anIntArray344[local151];
				@Pc(167) int local167 = Static565.anIntArray390[local141];
				@Pc(171) int local171 = Static565.anIntArray390[local146];
				@Pc(175) int local175 = Static565.anIntArray390[local151];
				if (-((local163 - local99) * (-local167 + local171)) + (local171 - local175) * (local90 - local99) > 0) {
					arg0.method3678(local90, local99, local167, local171, local175, local163);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6244;
	}

	@OriginalMember(owner = "client!lu", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6209;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "()Z")
	@Override
	public boolean method5422() {
		if (this.aShortArray93 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray93.length; local12++) {
			if (this.aShortArray93[local12] != -1 && !this.aClass5_Sub1_16.anInterface7_15.method8115(this.aShortArray93[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6239;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)Z")
	private boolean method5445() {
		@Pc(13) boolean local13 = !this.aClass260_3.aBoolean543;
		@Pc(26) boolean local26 = (this.anInt6197 & 0x37) != 0 && !this.aClass260_1.aBoolean543;
		@Pc(34) boolean local34 = !this.aClass260_4.aBoolean543;
		@Pc(42) boolean local42 = !this.aClass260_2.aBoolean543;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface11 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass260_4.anInterface11_18 == null) {
				this.aClass260_4.anInterface11_18 = this.aClass5_Sub1_16.method5649(this.aBoolean448);
			}
			local73 = this.aClass260_4.anInterface11_18;
			local73.method6373(12, this.anInt6271 * 12);
			local87 = local73.method6374();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass5_Sub1_16.aNativeInterface3.copyPositions(this.anIntArray379, this.anIntArray376, this.anIntArray380, this.aShortArray96, 0, 12, this.anInt6271, local87.getAddress());
				if (local73.method6375()) {
					this.aClass260_4.anInterface11_17 = local73;
					this.aClass260_4.aBoolean543 = true;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(204) short[] local204;
		@Pc(195) short[] local195;
		@Pc(198) short[] local198;
		@Pc(201) byte[] local201;
		if (local13) {
			if (this.aClass260_3.anInterface11_18 == null) {
				this.aClass260_3.anInterface11_18 = this.aClass5_Sub1_16.method5649(this.aBoolean448);
			}
			local73 = this.aClass260_3.anInterface11_18;
			local73.method6373(4, this.anInt6271 * 4);
			local87 = local73.method6374();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt6197 & 0x37) == 0) {
					if (this.aClass318_1 == null) {
						local195 = this.aShortArray103;
						local198 = this.aShortArray101;
						local201 = this.aByteArray69;
						local204 = this.aShortArray95;
					} else {
						local198 = this.aClass318_1.aShortArray143;
						local201 = this.aClass318_1.aByteArray104;
						local204 = this.aClass318_1.aShortArray142;
						local195 = this.aClass318_1.aShortArray141;
					}
					this.aClass5_Sub1_16.aNativeInterface3.copyLighting(this.aShortArray102, this.aByteArray68, this.aShortArray93, local204, local195, local198, local201, this.aShort100, this.aShort99, this.aShortArray104, 0, 4, this.anInt6271, local87.getAddress());
				} else {
					this.aClass5_Sub1_16.aNativeInterface3.copyColours(this.aShortArray102, this.aByteArray68, this.aShortArray93, this.aShort100, this.aShortArray104, 0, 4, this.anInt6271, local87.getAddress());
				}
				if (local73.method6375()) {
					this.aClass260_3.aBoolean543 = true;
					this.aClass260_3.anInterface11_17 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass260_1.anInterface11_18 == null) {
				this.aClass260_1.anInterface11_18 = this.aClass5_Sub1_16.method5649(this.aBoolean448);
			}
			local73 = this.aClass260_1.anInterface11_18;
			local73.method6373(12, this.anInt6271 * 12);
			local87 = local73.method6374();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass318_1 == null) {
					local195 = this.aShortArray103;
					local204 = this.aShortArray95;
					local198 = this.aShortArray101;
					local201 = this.aByteArray69;
				} else {
					local204 = this.aClass318_1.aShortArray142;
					local195 = this.aClass318_1.aShortArray141;
					local201 = this.aClass318_1.aByteArray104;
					local198 = this.aClass318_1.aShortArray143;
				}
				this.aClass5_Sub1_16.aNativeInterface3.copyNormals(local204, local195, local198, local201, 3.0F / (float) this.aShort99, 3.0F / (float) (this.aShort99 / 2 + this.aShort99), 0, 12, this.anInt6271, local87.getAddress());
				if (local73.method6375()) {
					this.aClass260_1.anInterface11_17 = local73;
					this.aClass260_1.aBoolean543 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass260_2.anInterface11_18 == null) {
				this.aClass260_2.anInterface11_18 = this.aClass5_Sub1_16.method5649(this.aBoolean448);
			}
			local73 = this.aClass260_2.anInterface11_18;
			local73.method6373(8, this.anInt6271 * 8);
			local87 = local73.method6374();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass5_Sub1_16.aNativeInterface3.copyTexCoords(this.aFloatArray44, this.aFloatArray43, 0, 8, this.anInt6271, local87.getAddress());
				if (local73.method6375()) {
					this.aClass260_2.anInterface11_17 = local73;
					this.aClass260_2.aBoolean543 = true;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5429(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class17_Sub3 local8 = (Class17_Sub3) arg0;
		if (this.anInt6234 == 0 || local8.anInt6234 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt6242;
		@Pc(24) int[] local24 = local8.anIntArray379;
		@Pc(27) int[] local27 = local8.anIntArray376;
		@Pc(30) int[] local30 = local8.anIntArray380;
		@Pc(33) short[] local33 = local8.aShortArray95;
		@Pc(36) short[] local36 = local8.aShortArray103;
		@Pc(39) short[] local39 = local8.aShortArray101;
		@Pc(42) byte[] local42 = local8.aByteArray69;
		@Pc(57) short[] local57;
		@Pc(61) short[] local61;
		@Pc(49) short[] local49;
		@Pc(53) byte[] local53;
		if (this.aClass318_1 == null) {
			local53 = null;
			local57 = null;
			local49 = null;
			local61 = null;
		} else {
			local49 = this.aClass318_1.aShortArray143;
			local53 = this.aClass318_1.aByteArray104;
			local57 = this.aClass318_1.aShortArray142;
			local61 = this.aClass318_1.aShortArray141;
		}
		@Pc(80) short[] local80;
		@Pc(82) short[] local82;
		@Pc(78) short[] local78;
		@Pc(76) byte[] local76;
		if (local8.aClass318_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local82 = local8.aClass318_1.aShortArray141;
			local76 = local8.aClass318_1.aByteArray104;
			local80 = local8.aClass318_1.aShortArray142;
			local78 = local8.aClass318_1.aShortArray143;
		}
		@Pc(103) int[] local103 = local8.anIntArray381;
		@Pc(106) short[] local106 = local8.aShortArray105;
		if (!local8.aBoolean446) {
			local8.method5437();
		}
		@Pc(115) int local115 = local8.anInt6247;
		@Pc(118) int local118 = local8.anInt6209;
		@Pc(121) int local121 = local8.anInt6218;
		@Pc(124) int local124 = local8.anInt6267;
		@Pc(127) int local127 = local8.anInt6225;
		@Pc(130) int local130 = local8.anInt6239;
		for (@Pc(132) int local132 = 0; local132 < this.anInt6242; local132++) {
			@Pc(142) int local142 = this.anIntArray376[local132] - arg2;
			if (local115 <= local142 && local118 >= local142) {
				@Pc(166) int local166 = this.anIntArray379[local132] - arg1;
				if (local166 >= local121 && local124 >= local166) {
					@Pc(182) int local182 = this.anIntArray380[local132] - arg3;
					if (local182 >= local127 && local130 >= local182) {
						@Pc(196) int local196 = -1;
						@Pc(201) int local201 = this.anIntArray381[local132];
						@Pc(208) int local208 = this.anIntArray381[local132 + 1];
						for (@Pc(210) int local210 = local201; local210 < local208; local210++) {
							local196 = this.aShortArray105[local210] - 1;
							if (local196 == -1 || this.aByteArray69[local196] != 0) {
								break;
							}
						}
						if (local196 != -1) {
							for (@Pc(241) int local241 = 0; local241 < local21; local241++) {
								if (local24[local241] == local166 && local30[local241] == local182 && local142 == local27[local241]) {
									@Pc(268) int local268 = -1;
									local201 = local103[local241];
									local208 = local103[local241 + 1];
									for (@Pc(280) int local280 = local201; local280 < local208; local280++) {
										local268 = local106[local280] - 1;
										if (local268 == -1 || local42[local268] != 0) {
											break;
										}
									}
									if (local268 != -1) {
										if (local57 == null) {
											this.aClass318_1 = new Class318();
											local57 = this.aClass318_1.aShortArray142 = Static221.method3708(this.aShortArray95);
											local61 = this.aClass318_1.aShortArray141 = Static221.method3708(this.aShortArray103);
											local49 = this.aClass318_1.aShortArray143 = Static221.method3708(this.aShortArray101);
											local53 = this.aClass318_1.aByteArray104 = Static163.method2898(this.aByteArray69);
										}
										if (local80 == null) {
											@Pc(364) Class318 local364 = local8.aClass318_1 = new Class318();
											local80 = local364.aShortArray142 = Static221.method3708(local33);
											local82 = local364.aShortArray141 = Static221.method3708(local36);
											local78 = local364.aShortArray143 = Static221.method3708(local39);
											local76 = local364.aByteArray104 = Static163.method2898(local42);
										}
										@Pc(397) short local397 = this.aShortArray95[local196];
										@Pc(402) short local402 = this.aShortArray103[local196];
										@Pc(407) short local407 = this.aShortArray101[local196];
										local208 = local103[local241 + 1];
										local201 = local103[local241];
										@Pc(422) byte local422 = this.aByteArray69[local196];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local201; local424 < local208; local424++) {
											local432 = local106[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local76[local432] != 0) {
												local80[local432] += local397;
												local82[local432] += local402;
												local78[local432] += local407;
												local76[local432] += local422;
											}
										}
										local208 = this.anIntArray381[local132 + 1];
										local407 = local39[local268];
										local402 = local36[local268];
										local201 = this.anIntArray381[local132];
										local397 = local33[local268];
										local422 = local42[local268];
										for (local432 = local201; local432 < local208; local432++) {
											@Pc(514) int local514 = this.aShortArray105[local432] - 1;
											if (local514 == -1) {
												break;
											}
											if (local53[local514] != 0) {
												local57[local514] += local397;
												local61[local514] += local402;
												local49[local514] += local407;
												local53[local514] += local422;
											}
										}
										local8.method5448();
										this.method5448();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort99 = (short) arg0;
		this.method5451();
		this.method5448();
	}

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "(I)V")
	private void method5446() {
		if (this.anInt6214 == 0) {
			return;
		}
		if (this.method5445() && this.method5452()) {
			this.aClass5_Sub1_16.method5692(this.aClass260_4.anInterface11_17, 0);
			this.aClass5_Sub1_16.method5692(this.aClass260_3.anInterface11_17, 1);
			this.aClass5_Sub1_16.method5692(this.aClass260_2.anInterface11_17, 2);
			@Pc(65) boolean local65;
			if ((this.anInt6197 & 0x37) == 0) {
				this.aClass5_Sub1_16.method5630(false);
				local65 = false;
				this.aClass5_Sub1_16.method5610(this.aClass5_Sub1_16.aClass46_22);
			} else {
				this.aClass5_Sub1_16.method5630(true);
				local65 = true;
				this.aClass5_Sub1_16.method5692(this.aClass260_1.anInterface11_17, 3);
				this.aClass5_Sub1_16.method5610(this.aClass5_Sub1_16.aClass46_20);
			}
			for (@Pc(98) int local98 = 0; local98 < this.anIntArray378.length; local98++) {
				@Pc(105) int local105 = this.anIntArray375[local98];
				@Pc(112) int local112 = this.anIntArray375[local98 + 1];
				@Pc(119) int local119 = this.aShortArray93[local105] & 0xFFFF;
				if (local119 == 65535) {
					local119 = -1;
				}
				this.aClass5_Sub1_16.method5579(true, local65, local119);
				this.aClass5_Sub1_16.method5665(Static67.aClass292_2, this.anIntArray378[local98], this.anIntArray377[local98], this.aClass378_1.anInterface19_8, local112 - local105, local105 * 3);
			}
		}
		this.method5438();
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
	private void method5447() {
		if (this.aClass378_1 != null) {
			this.aClass378_1.aBoolean731 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass260_4 != null) {
			this.aClass260_4.aBoolean542 = Static136.method2563(arg0, this.anInt6197);
		}
		if (this.aClass260_2 != null) {
			this.aClass260_2.aBoolean542 = Static296.method4677(arg0, this.anInt6197);
		}
		if (this.aClass260_3 != null) {
			this.aClass260_3.aBoolean542 = Static603.method8432(arg0, this.anInt6197);
		}
		if (this.aClass260_1 != null) {
			this.aClass260_1.aBoolean542 = Static9.method667(this.anInt6197, arg0);
		}
		this.anInt6226 = arg0;
		if (this.aClass318_1 != null && (this.anInt6226 & 0x10000) == 0) {
			this.aShortArray101 = this.aClass318_1.aShortArray143;
			this.aShortArray95 = this.aClass318_1.aShortArray142;
			this.aByteArray69 = this.aClass318_1.aByteArray104;
			this.aShortArray103 = this.aClass318_1.aShortArray141;
			this.aClass318_1 = null;
		}
		this.aBoolean444 = true;
		this.method5438();
	}

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6242; local3++) {
			this.anIntArray380[local3] = -this.anIntArray380[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt6271; local29++) {
			this.aShortArray101[local29] = (short) -this.aShortArray101[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt6234; local52++) {
			@Pc(59) short local59 = this.aShortArray98[local52];
			this.aShortArray98[local52] = this.aShortArray97[local52];
			this.aShortArray97[local52] = local59;
		}
		this.method5451();
		this.method5448();
		this.method5447();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "(I)V")
	private void method5448() {
		if ((this.anInt6197 & 0x37) == 0) {
			if (this.aClass260_3 == null) {
				return;
			}
			this.aClass260_3.aBoolean543 = false;
		} else if (this.aClass260_1 != null) {
			this.aClass260_1.aBoolean543 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6242; local7++) {
			if (arg0 != 128) {
				this.anIntArray379[local7] = arg0 * this.anIntArray379[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray376[local7] = this.anIntArray376[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray380[local7] = this.anIntArray380[local7] * arg2 >> 7;
			}
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6218;
	}

	@OriginalMember(owner = "client!lu", name = "j", descriptor = "(I)V")
	private void method5449() {
		if (this.aClass18Array1 == null) {
			return;
		}
		this.aClass5_Sub1_16.C(!this.aBoolean447);
		this.aClass5_Sub1_16.method5630(false);
		this.aClass5_Sub1_16.method5583(Static161.aClass9_3, 1);
		this.aClass5_Sub1_16.method5592(Static161.aClass9_3, 1);
		for (@Pc(40) int local40 = 0; local40 < this.anInt6195; local40++) {
			@Pc(47) Class18 local47 = this.aClass18Array1[local40];
			@Pc(52) Class252 local52 = this.aClass252Array1[local40];
			if (!local47.aBoolean69 || !this.aClass5_Sub1_16.method7516()) {
				@Pc(80) float local80 = (float) (this.anIntArray379[local47.anInt920] + this.anIntArray379[local47.anInt915] + this.anIntArray379[local47.anInt922]) * 0.3333333F;
				@Pc(101) float local101 = (float) (this.anIntArray376[local47.anInt915] + this.anIntArray376[local47.anInt922] + this.anIntArray376[local47.anInt920]) * 0.3333333F;
				@Pc(122) float local122 = (float) (this.anIntArray380[local47.anInt920] + this.anIntArray380[local47.anInt915] + this.anIntArray380[local47.anInt922]) * 0.3333333F;
				@Pc(136) float local136 = local122 * Static440.aFloat182 + local80 * Static303.aFloat109 + Static4.aFloat1 * local101 + Static43.aFloat48;
				@Pc(150) float local150 = Static277.aFloat102 + Static99.aFloat72 * local101 + Static156.aFloat103 * local80 + Static560.aFloat202 * local122;
				@Pc(164) float local164 = local101 * Static337.aFloat134 + Static340.aFloat153 * local80 + local122 * Static49.aFloat49 + Static419.aFloat179;
				@Pc(185) float local185 = (float) (1.0D / Math.sqrt((double) (local150 * local150 + local136 * local136 + local164 * local164))) * (float) local47.anInt916;
				@Pc(190) Class39_Sub1 local190 = this.aClass5_Sub1_16.method5658();
				local190.method1564((float) local52.anInt7511 + local150 - local185 * local150, -(local185 * local136) + (float) local52.anInt7517 + local136, local52.anInt7510, local52.anInt7513 * local47.aShort14 >> 7, local164 - local185 * local164, local52.anInt7512 * local47.aShort12 >> 7);
				local190.method1558(this.aClass5_Sub1_16.aClass39_Sub1_17);
				this.aClass5_Sub1_16.method5680();
				@Pc(248) int local248 = local52.anInt7514;
				this.aClass5_Sub1_16.method5579(false, false, local47.aShort13);
				this.aClass5_Sub1_16.method5666(local47.aByte6);
				this.aClass5_Sub1_16.method5574(local248);
				this.aClass5_Sub1_16.method5654();
			}
		}
		this.aClass5_Sub1_16.method5592(Static482.aClass9_4, 1);
		this.aClass5_Sub1_16.method5583(Static482.aClass9_4, 1);
		this.aClass5_Sub1_16.C(true);
	}

	@OriginalMember(owner = "client!lu", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt6226;
	}

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static562.anInt9399 = 0;
			Static587.anInt9602 = 0;
			Static239.anInt4466 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt6242; local20++) {
				Static562.anInt9399 += this.anIntArray379[local20];
				Static239.anInt4466 += this.anIntArray376[local20];
				Static587.anInt9602 += this.anIntArray380[local20];
				local18++;
			}
			if (local18 > 0) {
				Static239.anInt4466 = Static239.anInt4466 / local18 + arg2;
				Static587.anInt9602 = arg3 + Static587.anInt9602 / local18;
				Static562.anInt9399 = arg1 + Static562.anInt9399 / local18;
			} else {
				Static239.anInt4466 = arg2;
				Static587.anInt9602 = arg3;
				Static562.anInt9399 = arg1;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt6242; local18++) {
				this.anIntArray379[local18] += arg1;
				this.anIntArray376[local18] += arg2;
				this.anIntArray380[local18] += arg3;
			}
		} else {
			@Pc(166) int local166;
			@Pc(185) int local185;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt6242; local18++) {
					this.anIntArray379[local18] -= Static562.anInt9399;
					this.anIntArray376[local18] -= Static239.anInt4466;
					this.anIntArray380[local18] -= Static587.anInt9602;
					if (arg3 != 0) {
						local20 = Class21.anIntArray656[arg3];
						local166 = Class21.anIntArray655[arg3];
						local185 = this.anIntArray376[local18] * local20 + local166 * this.anIntArray379[local18] + 16383 >> 14;
						this.anIntArray376[local18] = this.anIntArray376[local18] * local166 + 16383 - this.anIntArray379[local18] * local20 >> 14;
						this.anIntArray379[local18] = local185;
					}
					if (arg1 != 0) {
						local20 = Class21.anIntArray656[arg1];
						local166 = Class21.anIntArray655[arg1];
						local185 = this.anIntArray376[local18] * local166 + 16383 - this.anIntArray380[local18] * local20 >> 14;
						this.anIntArray380[local18] = this.anIntArray380[local18] * local166 + this.anIntArray376[local18] * local20 + 16383 >> 14;
						this.anIntArray376[local18] = local185;
					}
					if (arg2 != 0) {
						local20 = Class21.anIntArray656[arg2];
						local166 = Class21.anIntArray655[arg2];
						local185 = this.anIntArray379[local18] * local166 + local20 * this.anIntArray380[local18] + 16383 >> 14;
						this.anIntArray380[local18] = local166 * this.anIntArray380[local18] + 16383 - this.anIntArray379[local18] * local20 >> 14;
						this.anIntArray379[local18] = local185;
					}
					this.anIntArray379[local18] += Static562.anInt9399;
					this.anIntArray376[local18] += Static239.anInt4466;
					this.anIntArray380[local18] += Static587.anInt9602;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt6242; local18++) {
					this.anIntArray379[local18] -= Static562.anInt9399;
					this.anIntArray376[local18] -= Static239.anInt4466;
					this.anIntArray380[local18] -= Static587.anInt9602;
					this.anIntArray379[local18] = arg1 * this.anIntArray379[local18] / 128;
					this.anIntArray376[local18] = this.anIntArray376[local18] * arg2 / 128;
					this.anIntArray380[local18] = arg3 * this.anIntArray380[local18] / 128;
					this.anIntArray379[local18] += Static562.anInt9399;
					this.anIntArray376[local18] += Static239.anInt4466;
					this.anIntArray380[local18] += Static587.anInt9602;
				}
			} else {
				@Pc(517) Class18 local517;
				@Pc(522) Class252 local522;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt6234; local18++) {
						local20 = arg1 * 8 + (this.aByteArray68[local18] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray68[local18] = (byte) local20;
					}
					if (this.aClass18Array1 != null) {
						for (local20 = 0; local20 < this.anInt6195; local20++) {
							local517 = this.aClass18Array1[local20];
							local522 = this.aClass252Array1[local20];
							local522.anInt7514 = local522.anInt7514 & 0xFFFFFF | 255 - (this.aByteArray68[local517.anInt917] & 0xFF) << 24;
						}
					}
					this.method5436();
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt6234; local18++) {
						local20 = this.aShortArray102[local18] & 0xFFFF;
						local166 = local20 >> 10 & 0x3F;
						local185 = local20 >> 7 & 0x7;
						@Pc(580) int local580 = local20 & 0x7F;
						@Pc(586) int local586 = arg1 + local166 & 0x3F;
						local185 += arg2 / 4;
						local580 += arg3;
						if (local185 < 0) {
							local185 = 0;
						} else if (local185 > 7) {
							local185 = 7;
						}
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray102[local18] = (short) (local185 << 7 | local586 << 10 | local580);
					}
					if (this.aClass18Array1 != null) {
						for (local20 = 0; local20 < this.anInt6195; local20++) {
							local517 = this.aClass18Array1[local20];
							local522 = this.aClass252Array1[local20];
							local522.anInt7514 = local522.anInt7514 & 0xFF000000 | Static159.anIntArray159[this.aShortArray102[local517.anInt917] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5436();
				} else {
					@Pc(708) Class252 local708;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt6195; local18++) {
							local708 = this.aClass252Array1[local18];
							local708.anInt7511 += arg2;
							local708.anInt7517 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt6195; local18++) {
							local708 = this.aClass252Array1[local18];
							local708.anInt7513 = local708.anInt7513 * arg2 >> 7;
							local708.anInt7512 = local708.anInt7512 * arg1 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt6195; local18++) {
							local708 = this.aClass252Array1[local18];
							local708.anInt7510 = arg1 + local708.anInt7510 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method5450(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg4 < arg0 && arg4 < arg1 && arg4 < arg3) {
			return false;
		} else if (arg0 < arg4 && arg1 < arg4 && arg3 < arg4) {
			return false;
		} else if (arg6 < arg7 && arg6 < arg5 && arg6 < arg2) {
			return false;
		} else {
			return arg6 <= arg7 || arg5 >= arg6 || arg2 >= arg6;
		}
	}

	@OriginalMember(owner = "client!lu", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub4_Sub5 ba(@OriginalArg(0) Class3_Sub4_Sub5 arg0) {
		if (this.anInt6271 == 0) {
			return null;
		}
		if (!this.aBoolean446) {
			this.method5437();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass5_Sub1_16.anInt6547 <= 0) {
			local37 = this.anInt6218 - (this.aClass5_Sub1_16.anInt6547 * this.anInt6247 >> 8) >> this.aClass5_Sub1_16.anInt6526;
			local54 = this.anInt6267 - (this.aClass5_Sub1_16.anInt6547 * this.anInt6209 >> 8) >> this.aClass5_Sub1_16.anInt6526;
		} else {
			local37 = this.anInt6218 - (this.aClass5_Sub1_16.anInt6547 * this.anInt6209 >> 8) >> this.aClass5_Sub1_16.anInt6526;
			local54 = this.anInt6267 - (this.aClass5_Sub1_16.anInt6547 * this.anInt6247 >> 8) >> this.aClass5_Sub1_16.anInt6526;
		}
		@Pc(110) int local110;
		@Pc(126) int local126;
		if (this.aClass5_Sub1_16.anInt6511 > 0) {
			local110 = this.anInt6225 - (this.anInt6209 * this.aClass5_Sub1_16.anInt6511 >> 8) >> this.aClass5_Sub1_16.anInt6526;
			local126 = this.anInt6239 - (this.anInt6247 * this.aClass5_Sub1_16.anInt6511 >> 8) >> this.aClass5_Sub1_16.anInt6526;
		} else {
			local110 = this.anInt6225 - (this.aClass5_Sub1_16.anInt6511 * this.anInt6247 >> 8) >> this.aClass5_Sub1_16.anInt6526;
			local126 = this.anInt6239 - (this.aClass5_Sub1_16.anInt6511 * this.anInt6209 >> 8) >> this.aClass5_Sub1_16.anInt6526;
		}
		@Pc(169) int local169 = local54 + 1 - local37;
		@Pc(176) int local176 = local126 + 1 - local110;
		@Pc(179) Class3_Sub4_Sub5_Sub2 local179 = (Class3_Sub4_Sub5_Sub2) arg0;
		@Pc(195) Class3_Sub4_Sub5_Sub2 local195;
		if (local179 != null && local179.method3676(local176, local169)) {
			local195 = local179;
			local179.method3675();
		} else {
			local195 = new Class3_Sub4_Sub5_Sub2(this.aClass5_Sub1_16, local169, local176);
		}
		local195.method3679(local126, local110, local54, local37);
		this.method5442(local195);
		return local195;
	}

	@OriginalMember(owner = "client!lu", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6247;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!sk;)V")
	@Override
	public void method5425(@OriginalArg(0) Class39 arg0) {
		@Pc(8) Class39_Sub1 local8 = (Class39_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass284Array5 != null) {
			for (local13 = 0; local13 < this.aClass284Array5.length; local13++) {
				@Pc(20) Class284 local20 = this.aClass284Array5[local13];
				@Pc(22) Class284 local22 = local20;
				if (local20.aClass284_2 != null) {
					local22 = local20.aClass284_2;
				}
				local22.anInt8331 = (int) (local8.aFloat58 + (float) this.anIntArray376[local20.anInt8333] * local8.aFloat50 + (float) this.anIntArray379[local20.anInt8333] * local8.aFloat57 + local8.aFloat51 * (float) this.anIntArray380[local20.anInt8333]);
				local22.anInt8328 = (int) (local8.aFloat59 + (float) this.anIntArray380[local20.anInt8333] * local8.aFloat52 + (float) this.anIntArray376[local20.anInt8333] * local8.aFloat54 + (float) this.anIntArray379[local20.anInt8333] * local8.aFloat56);
				local22.anInt8322 = (int) (local8.aFloat55 + local8.aFloat60 * (float) this.anIntArray380[local20.anInt8333] + local8.aFloat61 * (float) this.anIntArray376[local20.anInt8333] + (float) this.anIntArray379[local20.anInt8333] * local8.aFloat53);
				local22.anInt8320 = (int) (local8.aFloat51 * (float) this.anIntArray380[local20.anInt8326] + (float) this.anIntArray379[local20.anInt8326] * local8.aFloat57 + local8.aFloat50 * (float) this.anIntArray376[local20.anInt8326] + local8.aFloat58);
				local22.anInt8319 = (int) (local8.aFloat59 + local8.aFloat56 * (float) this.anIntArray379[local20.anInt8326] + (float) this.anIntArray376[local20.anInt8326] * local8.aFloat54 + (float) this.anIntArray380[local20.anInt8326] * local8.aFloat52);
				local22.anInt8316 = (int) (local8.aFloat60 * (float) this.anIntArray380[local20.anInt8326] + (float) this.anIntArray379[local20.anInt8326] * local8.aFloat53 + local8.aFloat61 * (float) this.anIntArray376[local20.anInt8326] + local8.aFloat55);
				local22.anInt8329 = (int) (local8.aFloat58 + local8.aFloat50 * (float) this.anIntArray376[local20.anInt8323] + (float) this.anIntArray379[local20.anInt8323] * local8.aFloat57 + (float) this.anIntArray380[local20.anInt8323] * local8.aFloat51);
				local22.anInt8325 = (int) (local8.aFloat56 * (float) this.anIntArray379[local20.anInt8323] + (float) this.anIntArray376[local20.anInt8323] * local8.aFloat54 + (float) this.anIntArray380[local20.anInt8323] * local8.aFloat52 + local8.aFloat59);
				local22.anInt8324 = (int) (local8.aFloat60 * (float) this.anIntArray380[local20.anInt8323] + (float) this.anIntArray376[local20.anInt8323] * local8.aFloat61 + local8.aFloat53 * (float) this.anIntArray379[local20.anInt8323] + local8.aFloat55);
			}
		}
		if (this.aClass353Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass353Array5.length; local13++) {
			@Pc(361) Class353 local361 = this.aClass353Array5[local13];
			@Pc(363) Class353 local363 = local361;
			if (local361.aClass353_2 != null) {
				local363 = local361.aClass353_2;
			}
			if (local361.aClass39_13 == null) {
				local361.aClass39_13 = local8.method7248();
			} else {
				local361.aClass39_13.method7236(local8);
			}
			local363.anInt9744 = (int) (local8.aFloat51 * (float) this.anIntArray380[local361.anInt9752] + local8.aFloat57 * (float) this.anIntArray379[local361.anInt9752] + (float) this.anIntArray376[local361.anInt9752] * local8.aFloat50 + local8.aFloat58);
			local363.anInt9747 = (int) (local8.aFloat56 * (float) this.anIntArray379[local361.anInt9752] + local8.aFloat54 * (float) this.anIntArray376[local361.anInt9752] + local8.aFloat52 * (float) this.anIntArray380[local361.anInt9752] + local8.aFloat59);
			local363.anInt9742 = (int) ((float) this.anIntArray380[local361.anInt9752] * local8.aFloat60 + (float) this.anIntArray376[local361.anInt9752] * local8.aFloat61 + local8.aFloat53 * (float) this.anIntArray379[local361.anInt9752] + local8.aFloat55);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!sk;Lclient!nl;I)V")
	@Override
	public void method5411(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt6271 == 0) {
			return;
		}
		@Pc(16) Class39_Sub1 local16 = this.aClass5_Sub1_16.aClass39_Sub1_16;
		if (!this.aBoolean446) {
			this.method5437();
		}
		@Pc(25) Class39_Sub1 local25 = (Class39_Sub1) arg0;
		Static337.aFloat134 = local25.aFloat54 * local16.aFloat61 + local16.aFloat53 * local25.aFloat50 + local25.aFloat61 * local16.aFloat60;
		Static419.aFloat179 = local16.aFloat55 + local16.aFloat60 * local25.aFloat55 + local25.aFloat58 * local16.aFloat53 + local25.aFloat59 * local16.aFloat61;
		@Pc(72) float local72 = Static337.aFloat134 * (float) this.anInt6247 + Static419.aFloat179;
		@Pc(80) float local80 = Static419.aFloat179 + (float) this.anInt6209 * Static337.aFloat134;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt6244 + local72;
			local97 = (float) -this.anInt6244 + local80;
		} else {
			local90 = (float) this.anInt6244 + local80;
			local97 = (float) -this.anInt6244 + local72;
		}
		if (local97 >= this.aClass5_Sub1_16.aFloat151 || local90 <= (float) this.aClass5_Sub1_16.anInt6510) {
			return;
		}
		Static4.aFloat1 = local25.aFloat61 * local16.aFloat51 + local16.aFloat50 * local25.aFloat54 + local25.aFloat50 * local16.aFloat57;
		Static43.aFloat48 = local16.aFloat50 * local25.aFloat59 + local25.aFloat58 * local16.aFloat57 + local16.aFloat51 * local25.aFloat55 + local16.aFloat58;
		@Pc(174) float local174 = (float) this.anInt6247 * Static4.aFloat1 + Static43.aFloat48;
		@Pc(182) float local182 = Static4.aFloat1 * (float) this.anInt6209 + Static43.aFloat48;
		@Pc(209) float local209;
		@Pc(197) float local197;
		if (local182 < local174) {
			local197 = ((float) this.anInt6244 + local174) * (float) this.aClass5_Sub1_16.anInt6530;
			local209 = ((float) -this.anInt6244 + local182) * (float) this.aClass5_Sub1_16.anInt6530;
		} else {
			local197 = (float) this.aClass5_Sub1_16.anInt6530 * ((float) this.anInt6244 + local182);
			local209 = (float) this.aClass5_Sub1_16.anInt6530 * (local174 - (float) this.anInt6244);
		}
		if (local209 / local90 >= this.aClass5_Sub1_16.aFloat149 || this.aClass5_Sub1_16.aFloat143 >= local197 / local90) {
			return;
		}
		Static277.aFloat102 = local16.aFloat59 + local25.aFloat58 * local16.aFloat56 + local16.aFloat54 * local25.aFloat59 + local16.aFloat52 * local25.aFloat55;
		Static99.aFloat72 = local16.aFloat54 * local25.aFloat54 + local16.aFloat56 * local25.aFloat50 + local16.aFloat52 * local25.aFloat61;
		@Pc(298) float local298 = Static99.aFloat72 * (float) this.anInt6247 + Static277.aFloat102;
		@Pc(306) float local306 = Static277.aFloat102 + (float) this.anInt6209 * Static99.aFloat72;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local298 > local306) {
			local321 = (float) this.aClass5_Sub1_16.anInt6514 * ((float) this.anInt6244 + local298);
			local333 = ((float) -this.anInt6244 + local306) * (float) this.aClass5_Sub1_16.anInt6514;
		} else {
			local333 = (float) this.aClass5_Sub1_16.anInt6514 * (local298 - (float) this.anInt6244);
			local321 = (float) this.aClass5_Sub1_16.anInt6514 * (local306 + (float) this.anInt6244);
		}
		if (local333 / local90 >= this.aClass5_Sub1_16.aFloat150 || local321 / local90 <= this.aClass5_Sub1_16.aFloat137) {
			return;
		}
		if (arg1 != null || this.aClass18Array1 != null) {
			Static49.aFloat49 = local16.aFloat53 * local25.aFloat51 + local25.aFloat52 * local16.aFloat61 + local25.aFloat60 * local16.aFloat60;
			Static303.aFloat109 = local25.aFloat57 * local16.aFloat57 + local25.aFloat56 * local16.aFloat50 + local16.aFloat51 * local25.aFloat53;
			Static340.aFloat153 = local25.aFloat53 * local16.aFloat60 + local25.aFloat56 * local16.aFloat61 + local16.aFloat53 * local25.aFloat57;
			Static560.aFloat202 = local16.aFloat54 * local25.aFloat52 + local25.aFloat51 * local16.aFloat56 + local25.aFloat60 * local16.aFloat52;
			Static156.aFloat103 = local25.aFloat57 * local16.aFloat56 + local16.aFloat54 * local25.aFloat56 + local16.aFloat52 * local25.aFloat53;
			Static440.aFloat182 = local25.aFloat60 * local16.aFloat51 + local25.aFloat51 * local16.aFloat57 + local16.aFloat50 * local25.aFloat52;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(503) int local503 = this.anInt6218 + this.anInt6267 >> 1;
			@Pc(511) int local511 = this.anInt6225 + this.anInt6239 >> 1;
			@Pc(530) int local530 = (int) ((float) local511 * Static440.aFloat182 + (float) this.anInt6247 * Static4.aFloat1 + (float) local503 * Static303.aFloat109 + Static43.aFloat48);
			@Pc(549) int local549 = (int) (Static560.aFloat202 * (float) local511 + Static277.aFloat102 + (float) local503 * Static156.aFloat103 + (float) this.anInt6247 * Static99.aFloat72);
			@Pc(568) int local568 = (int) (Static337.aFloat134 * (float) this.anInt6247 + Static419.aFloat179 + (float) local503 * Static340.aFloat153 + (float) local511 * Static49.aFloat49);
			if (this.aClass5_Sub1_16.anInt6510 <= local568) {
				arg1.anInt7144 = this.aClass5_Sub1_16.anInt6514 * local549 / local568 + this.aClass5_Sub1_16.anInt6527;
				arg1.anInt7142 = this.aClass5_Sub1_16.anInt6540 + local530 * this.aClass5_Sub1_16.anInt6530 / local568;
			} else {
				local492 = true;
			}
			@Pc(626) int local626 = (int) (Static4.aFloat1 * (float) this.anInt6209 + Static303.aFloat109 * (float) local503 + Static43.aFloat48 + Static440.aFloat182 * (float) local511);
			@Pc(645) int local645 = (int) (Static99.aFloat72 * (float) this.anInt6209 + Static156.aFloat103 * (float) local503 + Static277.aFloat102 + (float) local511 * Static560.aFloat202);
			@Pc(664) int local664 = (int) (Static49.aFloat49 * (float) local511 + (float) local503 * Static340.aFloat153 + Static419.aFloat179 + (float) this.anInt6209 * Static337.aFloat134);
			if (this.aClass5_Sub1_16.anInt6510 > local664) {
				local492 = true;
			} else {
				arg1.anInt7143 = local626 * this.aClass5_Sub1_16.anInt6530 / local664 + this.aClass5_Sub1_16.anInt6540;
				arg1.anInt7145 = this.aClass5_Sub1_16.anInt6527 + local645 * this.aClass5_Sub1_16.anInt6514 / local664;
			}
			if (local492) {
				if (local568 < this.aClass5_Sub1_16.anInt6510 && this.aClass5_Sub1_16.anInt6510 > local664) {
					local494 = false;
				} else {
					@Pc(746) int local746;
					@Pc(756) int local756;
					@Pc(767) int local767;
					if (local568 < this.aClass5_Sub1_16.anInt6510) {
						local746 = (local664 - this.aClass5_Sub1_16.anInt6510 << 16) / (local664 - local568);
						local756 = local626 + (local746 * (local626 - local530) >> 16);
						arg1.anInt7142 = this.aClass5_Sub1_16.anInt6530 * local756 / this.aClass5_Sub1_16.anInt6510 + this.aClass5_Sub1_16.anInt6540;
						local767 = local645 + (local746 * (local645 - local549) >> 16);
						arg1.anInt7144 = this.aClass5_Sub1_16.anInt6514 * local767 / this.aClass5_Sub1_16.anInt6510 + this.aClass5_Sub1_16.anInt6527;
					} else if (this.aClass5_Sub1_16.anInt6510 > local664) {
						local746 = (local568 - this.aClass5_Sub1_16.anInt6510 << 16) / (local568 - local664);
						local756 = (local746 * (local530 - local626) >> 16) + local530;
						local767 = ((local549 - local645) * local746 >> 16) + local549;
						arg1.anInt7142 = local756 * this.aClass5_Sub1_16.anInt6530 / this.aClass5_Sub1_16.anInt6510 + this.aClass5_Sub1_16.anInt6540;
						arg1.anInt7144 = this.aClass5_Sub1_16.anInt6527 + this.aClass5_Sub1_16.anInt6514 * local767 / this.aClass5_Sub1_16.anInt6510;
					}
				}
			}
			if (local494) {
				if (local568 > local664) {
					arg1.anInt7146 = this.aClass5_Sub1_16.anInt6540 + (this.anInt6244 + local530) * this.aClass5_Sub1_16.anInt6530 / local568 - arg1.anInt7142;
				} else {
					arg1.anInt7146 = this.aClass5_Sub1_16.anInt6540 + this.aClass5_Sub1_16.anInt6530 * (this.anInt6244 + local626) / local664 - arg1.anInt7143;
				}
				arg1.aBoolean514 = true;
			}
		}
		this.aClass5_Sub1_16.method5597();
		this.aClass5_Sub1_16.method5651(local25);
		this.method5446();
		this.method5449();
	}

	@OriginalMember(owner = "client!lu", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6267;
	}

	@OriginalMember(owner = "client!lu", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6234; local3++) {
			if (this.aShortArray102[local3] == arg0) {
				this.aShortArray102[local3] = arg1;
			}
		}
		if (this.aClass18Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt6195; local38++) {
				@Pc(45) Class18 local45 = this.aClass18Array1[local38];
				@Pc(50) Class252 local50 = this.aClass252Array1[local38];
				local50.anInt7514 = Static159.anIntArray159[this.aShortArray102[local45.anInt917] & 0xFFFF] & 0xFFFFFF | local50.anInt7514 & 0xFF000000;
			}
		}
		this.method5436();
	}

	@OriginalMember(owner = "client!lu", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6201; local3++) {
			this.anIntArray379[local3] = this.anIntArray379[local3] + 7 >> 4;
			this.anIntArray376[local3] = this.anIntArray376[local3] + 7 >> 4;
			this.anIntArray380[local3] = this.anIntArray380[local3] + 7 >> 4;
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Lclient!vea;")
	@Override
	public Class353[] method5415() {
		return this.aClass353Array5;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!sk;IZ)V")
	@Override
	public void method5410(@OriginalArg(0) Class39 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray94 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt6242; local14++) {
			if ((arg1 & this.aShortArray94[local14]) != 0) {
				if (arg2) {
					arg0.method7250(this.anIntArray379[local14], this.anIntArray376[local14], this.anIntArray380[local14], local12);
				} else {
					arg0.method7254(this.anIntArray379[local14], this.anIntArray376[local14], this.anIntArray380[local14], local12);
				}
				this.anIntArray379[local14] = local12[0];
				this.anIntArray376[local14] = local12[1];
				this.anIntArray380[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean446) {
			this.method5437();
		}
		return this.anInt6252;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "()V")
	@Override
	protected void method5423() {
	}

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6242; local7++) {
			if (arg0 != 0) {
				this.anIntArray379[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray376[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray380[local7] += arg2;
			}
		}
		this.method5451();
		this.aBoolean446 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!sk;ZII)Z")
	@Override
	public boolean method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5441(arg2, arg0, arg4, arg5, arg1, arg3);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt6234; local7++) {
			local16 = this.aShortArray102[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg2 != -1) {
				local32 -= -(arg3 * (arg2 - local32) >> 7);
			}
			this.aShortArray102[local7] = (short) (local32 | local22 << 10 | local28 << 7);
		}
		if (this.aClass18Array1 != null) {
			for (local16 = 0; local16 < this.anInt6195; local16++) {
				@Pc(108) Class18 local108 = this.aClass18Array1[local16];
				@Pc(113) Class252 local113 = this.aClass252Array1[local16];
				local113.anInt7514 = local113.anInt7514 & 0xFF000000 | Static159.anIntArray159[this.aShortArray102[local108.anInt917] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method5436();
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)V")
	private void method5451() {
		if (this.aClass260_4 != null) {
			this.aClass260_4.aBoolean543 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!sk;Lclient!nl;II)V")
	@Override
	public void method5413(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class4_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt6271 == 0) {
			return;
		}
		@Pc(16) Class39_Sub1 local16 = this.aClass5_Sub1_16.aClass39_Sub1_16;
		if (!this.aBoolean446) {
			this.method5437();
		}
		@Pc(25) Class39_Sub1 local25 = (Class39_Sub1) arg0;
		Static419.aFloat179 = local16.aFloat55 + local25.aFloat59 * local16.aFloat61 + local25.aFloat58 * local16.aFloat53 + local25.aFloat55 * local16.aFloat60;
		Static337.aFloat134 = local25.aFloat50 * local16.aFloat53 + local25.aFloat54 * local16.aFloat61 + local25.aFloat61 * local16.aFloat60;
		@Pc(72) float local72 = Static419.aFloat179 + Static337.aFloat134 * (float) this.anInt6247;
		@Pc(80) float local80 = Static337.aFloat134 * (float) this.anInt6209 + Static419.aFloat179;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local80 < local72) {
			local97 = (float) -this.anInt6244 + local80;
			local90 = (float) this.anInt6244 + local72;
		} else {
			local90 = local80 + (float) this.anInt6244;
			local97 = (float) -this.anInt6244 + local72;
		}
		if (local97 >= this.aClass5_Sub1_16.aFloat146 || local90 <= (float) this.aClass5_Sub1_16.anInt6510) {
			return;
		}
		Static4.aFloat1 = local16.aFloat57 * local25.aFloat50 + local25.aFloat54 * local16.aFloat50 + local25.aFloat61 * local16.aFloat51;
		Static43.aFloat48 = local16.aFloat58 + local25.aFloat59 * local16.aFloat50 + local16.aFloat57 * local25.aFloat58 + local16.aFloat51 * local25.aFloat55;
		@Pc(174) float local174 = Static43.aFloat48 + Static4.aFloat1 * (float) this.anInt6247;
		@Pc(182) float local182 = Static43.aFloat48 + Static4.aFloat1 * (float) this.anInt6209;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local174 > local182) {
			local208 = (local174 + (float) this.anInt6244) * (float) this.aClass5_Sub1_16.anInt6530;
			local197 = (local182 - (float) this.anInt6244) * (float) this.aClass5_Sub1_16.anInt6530;
		} else {
			local197 = (float) this.aClass5_Sub1_16.anInt6530 * (local174 - (float) this.anInt6244);
			local208 = (float) this.aClass5_Sub1_16.anInt6530 * ((float) this.anInt6244 + local182);
		}
		if (this.aClass5_Sub1_16.aFloat149 <= local197 / (float) arg2 || this.aClass5_Sub1_16.aFloat143 >= local208 / (float) arg2) {
			return;
		}
		Static99.aFloat72 = local25.aFloat61 * local16.aFloat52 + local25.aFloat54 * local16.aFloat54 + local16.aFloat56 * local25.aFloat50;
		Static277.aFloat102 = local16.aFloat59 + local25.aFloat55 * local16.aFloat52 + local25.aFloat58 * local16.aFloat56 + local25.aFloat59 * local16.aFloat54;
		@Pc(299) float local299 = (float) this.anInt6247 * Static99.aFloat72 + Static277.aFloat102;
		@Pc(307) float local307 = (float) this.anInt6209 * Static99.aFloat72 + Static277.aFloat102;
		@Pc(333) float local333;
		@Pc(322) float local322;
		if (local307 < local299) {
			local322 = (float) this.aClass5_Sub1_16.anInt6514 * (local299 + (float) this.anInt6244);
			local333 = (local307 - (float) this.anInt6244) * (float) this.aClass5_Sub1_16.anInt6514;
		} else {
			local333 = (float) this.aClass5_Sub1_16.anInt6514 * (local299 - (float) this.anInt6244);
			local322 = ((float) this.anInt6244 + local307) * (float) this.aClass5_Sub1_16.anInt6514;
		}
		if (this.aClass5_Sub1_16.aFloat150 <= local333 / (float) arg2 || this.aClass5_Sub1_16.aFloat137 >= local322 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass18Array1 != null) {
			Static560.aFloat202 = local16.aFloat52 * local25.aFloat60 + local25.aFloat52 * local16.aFloat54 + local25.aFloat51 * local16.aFloat56;
			Static440.aFloat182 = local16.aFloat51 * local25.aFloat60 + local16.aFloat50 * local25.aFloat52 + local16.aFloat57 * local25.aFloat51;
			Static303.aFloat109 = local25.aFloat53 * local16.aFloat51 + local16.aFloat50 * local25.aFloat56 + local25.aFloat57 * local16.aFloat57;
			Static340.aFloat153 = local16.aFloat60 * local25.aFloat53 + local16.aFloat61 * local25.aFloat56 + local25.aFloat57 * local16.aFloat53;
			Static156.aFloat103 = local16.aFloat52 * local25.aFloat53 + local16.aFloat54 * local25.aFloat56 + local25.aFloat57 * local16.aFloat56;
			Static49.aFloat49 = local16.aFloat60 * local25.aFloat60 + local25.aFloat52 * local16.aFloat61 + local25.aFloat51 * local16.aFloat53;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt6267 + this.anInt6218 >> 1;
			@Pc(508) int local508 = this.anInt6239 + this.anInt6225 >> 1;
			@Pc(527) int local527 = (int) (Static4.aFloat1 * (float) this.anInt6247 + Static303.aFloat109 * (float) local500 + Static43.aFloat48 + (float) local508 * Static440.aFloat182);
			@Pc(546) int local546 = (int) (Static277.aFloat102 + Static156.aFloat103 * (float) local500 + Static99.aFloat72 * (float) this.anInt6247 + Static560.aFloat202 * (float) local508);
			@Pc(565) int local565 = (int) ((float) local508 * Static49.aFloat49 + (float) this.anInt6247 * Static337.aFloat134 + Static419.aFloat179 + (float) local500 * Static340.aFloat153);
			@Pc(584) int local584 = (int) (Static440.aFloat182 * (float) local508 + Static43.aFloat48 + Static303.aFloat109 * (float) local500 + (float) this.anInt6209 * Static4.aFloat1);
			@Pc(603) int local603 = (int) (Static99.aFloat72 * (float) this.anInt6209 + Static156.aFloat103 * (float) local500 + Static277.aFloat102 + Static560.aFloat202 * (float) local508);
			arg1.anInt7144 = this.aClass5_Sub1_16.anInt6527 + this.aClass5_Sub1_16.anInt6514 * local546 / arg2;
			@Pc(636) int local636 = (int) (Static337.aFloat134 * (float) this.anInt6209 + (float) local500 * Static340.aFloat153 + Static419.aFloat179 + (float) local508 * Static49.aFloat49);
			arg1.anInt7142 = this.aClass5_Sub1_16.anInt6530 * local527 / arg2 + this.aClass5_Sub1_16.anInt6540;
			arg1.anInt7143 = this.aClass5_Sub1_16.anInt6540 + local584 * this.aClass5_Sub1_16.anInt6530 / arg2;
			arg1.anInt7145 = this.aClass5_Sub1_16.anInt6527 + local603 * this.aClass5_Sub1_16.anInt6514 / arg2;
			if (this.aClass5_Sub1_16.anInt6510 <= local565 || this.aClass5_Sub1_16.anInt6510 <= local636) {
				arg1.aBoolean514 = true;
				arg1.anInt7146 = this.aClass5_Sub1_16.anInt6540 + this.aClass5_Sub1_16.anInt6530 * (this.anInt6244 + local527) / arg2 - arg1.anInt7142;
			}
		}
		this.aClass5_Sub1_16.method5638((float) arg2);
		this.aClass5_Sub1_16.method5593();
		this.aClass5_Sub1_16.method5651(local25);
		this.method5446();
		this.method5449();
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)Z")
	private boolean method5452() {
		if (this.aClass378_1.aBoolean731) {
			return true;
		}
		if (this.aClass378_1.anInterface19_7 == null) {
			this.aClass378_1.anInterface19_7 = this.aClass5_Sub1_16.method5671(this.aBoolean448);
		}
		@Pc(28) Interface19 local28 = this.aClass378_1.anInterface19_7;
		local28.method7981(this.anInt6214 * 6);
		@Pc(40) Buffer local40 = local28.method7984();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass5_Sub1_16.method5647(local40);
			@Pc(52) int local52;
			if (Stream.a()) {
				for (local52 = 0; local52 < this.anInt6214; local52++) {
					local48.e(this.aShortArray98[local52]);
					local48.e(this.aShortArray99[local52]);
					local48.e(this.aShortArray97[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt6214; local52++) {
					local48.d(this.aShortArray98[local52]);
					local48.d(this.aShortArray99[local52]);
					local48.d(this.aShortArray97[local52]);
				}
			}
			local48.b();
			if (local28.method7985()) {
				this.aClass378_1.anInterface19_8 = local28;
				this.aBoolean444 = true;
				this.aClass378_1.aBoolean731 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray44 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt6201; local12++) {
			this.anIntArray379[local12] <<= 0x4;
			this.anIntArray376[local12] <<= 0x4;
			this.anIntArray380[local12] <<= 0x4;
		}
		Static562.anInt9399 = 0;
		Static239.anInt4466 = 0;
		Static587.anInt9602 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort100;
	}
}
