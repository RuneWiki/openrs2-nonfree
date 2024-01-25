import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vea")
public final class Class184_Sub3 extends Class184 {

	@OriginalMember(owner = "client!vea", name = "z", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!vea", name = "C", descriptor = "I")
	private int anInt10227;

	@OriginalMember(owner = "client!vea", name = "H", descriptor = "Z")
	private boolean aBoolean719;

	@OriginalMember(owner = "client!vea", name = "J", descriptor = "Lclient!jr;")
	private Class181 aClass181_1;

	@OriginalMember(owner = "client!vea", name = "O", descriptor = "Lclient!jr;")
	private Class181 aClass181_2;

	@OriginalMember(owner = "client!vea", name = "Q", descriptor = "Lclient!jr;")
	private Class181 aClass181_3;

	@OriginalMember(owner = "client!vea", name = "R", descriptor = "Z")
	private boolean aBoolean720;

	@OriginalMember(owner = "client!vea", name = "Z", descriptor = "I")
	private int anInt10239;

	@OriginalMember(owner = "client!vea", name = "fb", descriptor = "I")
	private int anInt10243;

	@OriginalMember(owner = "client!vea", name = "lb", descriptor = "Lclient!dca;")
	private Class62 lb;

	@OriginalMember(owner = "client!vea", name = "mb", descriptor = "I")
	private int anInt10247;

	@OriginalMember(owner = "client!vea", name = "wb", descriptor = "I")
	private int anInt10255;

	@OriginalMember(owner = "client!vea", name = "Cb", descriptor = "I")
	private int anInt10259;

	@OriginalMember(owner = "client!vea", name = "Eb", descriptor = "Lclient!jr;")
	private Class181 aClass181_4;

	@OriginalMember(owner = "client!vea", name = "Hb", descriptor = "I")
	private int anInt10262;

	@OriginalMember(owner = "client!vea", name = "Ob", descriptor = "Lclient!et;")
	private Class95 aClass95_1;

	@OriginalMember(owner = "client!vea", name = "dc", descriptor = "I")
	private int anInt10278;

	@OriginalMember(owner = "client!vea", name = "hc", descriptor = "I")
	private int anInt10281;

	@OriginalMember(owner = "client!vea", name = "mc", descriptor = "Lclient!lba;")
	private final Class132_Sub1 aClass132_Sub1_23;

	@OriginalMember(owner = "client!vea", name = "oc", descriptor = "I")
	private int anInt10285;

	@OriginalMember(owner = "client!vea", name = "sc", descriptor = "I")
	private int anInt10288;

	@OriginalMember(owner = "client!vea", name = "Bb", descriptor = "[I")
	private int[] anIntArray676;

	@OriginalMember(owner = "client!vea", name = "yc", descriptor = "I")
	private int anInt10291;

	@OriginalMember(owner = "client!vea", name = "sb", descriptor = "I")
	private int anInt10252;

	@OriginalMember(owner = "client!vea", name = "U", descriptor = "Z")
	private boolean aBoolean721;

	@OriginalMember(owner = "client!vea", name = "B", descriptor = "Z")
	private boolean aBoolean718;

	@OriginalMember(owner = "client!vea", name = "gc", descriptor = "[I")
	private int[] anIntArray679;

	@OriginalMember(owner = "client!vea", name = "x", descriptor = "[S")
	private short[] aShortArray144;

	@OriginalMember(owner = "client!vea", name = "q", descriptor = "[I")
	private int[] anIntArray674;

	@OriginalMember(owner = "client!vea", name = "Y", descriptor = "I")
	private int anInt10238;

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "[I")
	private int[] anIntArray673;

	@OriginalMember(owner = "client!vea", name = "ib", descriptor = "I")
	private int anInt10245;

	@OriginalMember(owner = "client!vea", name = "ab", descriptor = "[Lclient!mb;")
	private Class218[] aClass218Array5;

	@OriginalMember(owner = "client!vea", name = "Ic", descriptor = "[Lclient!fba;")
	private Class100[] aClass100Array5;

	@OriginalMember(owner = "client!vea", name = "Kb", descriptor = "I")
	private int anInt10264;

	@OriginalMember(owner = "client!vea", name = "Gb", descriptor = "[Lclient!kga;")
	private Class192[] aClass192Array1;

	@OriginalMember(owner = "client!vea", name = "wc", descriptor = "[Lclient!ow;")
	private Class264[] aClass264Array1;

	@OriginalMember(owner = "client!vea", name = "pb", descriptor = "[S")
	private short[] aShortArray149;

	@OriginalMember(owner = "client!vea", name = "W", descriptor = "[F")
	private float[] aFloatArray75;

	@OriginalMember(owner = "client!vea", name = "Qb", descriptor = "[S")
	private short[] aShortArray152;

	@OriginalMember(owner = "client!vea", name = "o", descriptor = "[F")
	private float[] aFloatArray74;

	@OriginalMember(owner = "client!vea", name = "lc", descriptor = "[B")
	private byte[] aByteArray103;

	@OriginalMember(owner = "client!vea", name = "xc", descriptor = "S")
	private short aShort124;

	@OriginalMember(owner = "client!vea", name = "K", descriptor = "[S")
	private short[] aShortArray145;

	@OriginalMember(owner = "client!vea", name = "jc", descriptor = "[S")
	private short[] aShortArray153;

	@OriginalMember(owner = "client!vea", name = "Gc", descriptor = "[S")
	private short[] aShortArray156;

	@OriginalMember(owner = "client!vea", name = "vb", descriptor = "[S")
	private short[] aShortArray150;

	@OriginalMember(owner = "client!vea", name = "N", descriptor = "[S")
	private short[] aShortArray146;

	@OriginalMember(owner = "client!vea", name = "y", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!vea", name = "rc", descriptor = "[S")
	private short[] aShortArray154;

	@OriginalMember(owner = "client!vea", name = "kb", descriptor = "[S")
	private short[] aShortArray148;

	@OriginalMember(owner = "client!vea", name = "xb", descriptor = "[S")
	private short[] aShortArray151;

	@OriginalMember(owner = "client!vea", name = "uc", descriptor = "[S")
	private short[] aShortArray155;

	@OriginalMember(owner = "client!vea", name = "hb", descriptor = "[S")
	private short[] aShortArray147;

	@OriginalMember(owner = "client!vea", name = "X", descriptor = "S")
	private short aShort123;

	@OriginalMember(owner = "client!vea", name = "Wb", descriptor = "[I")
	private int[] anIntArray678;

	@OriginalMember(owner = "client!vea", name = "V", descriptor = "[I")
	private int[] anIntArray675;

	@OriginalMember(owner = "client!vea", name = "Mb", descriptor = "[I")
	private int[] anIntArray677;

	@OriginalMember(owner = "client!vea", name = "Ib", descriptor = "[[I")
	private int[][] anIntArrayArray57;

	@OriginalMember(owner = "client!vea", name = "cb", descriptor = "[[I")
	private int[][] anIntArrayArray56;

	@OriginalMember(owner = "client!vea", name = "Vb", descriptor = "[[I")
	private int[][] anIntArrayArray58;

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!lba;Lclient!ao;IIII)V")
	public Class184_Sub3(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface6 local11 = arg0.anInterface6_11;
		this.anIntArray676 = new int[arg1.anInt506 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt509];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt509; local24++) {
			if (arg1.aByteArray3 == null || arg1.aByteArray3[local24] != 2) {
				if (arg1.aShortArray14 != null && arg1.aShortArray14[local24] != -1) {
					@Pc(55) Class294 local55 = local11.method7088(arg1.aShortArray14[local24] & 0xFFFF);
					if (((this.anInt10281 & 0x40) == 0 || !local55.aBoolean573) && local55.aBoolean567) {
						continue;
					}
				}
				local22[this.anInt10291++] = local24;
				this.anIntArray676[arg1.aShortArray15[local24]]++;
				this.anIntArray676[arg1.aShortArray19[local24]]++;
				this.anIntArray676[arg1.aShortArray21[local24]]++;
			}
		}
		this.anInt10252 = this.anInt10291;
		@Pc(128) long[] local128 = new long[this.anInt10291];
		@Pc(137) boolean local137 = (this.anInt10262 & 0x100) != 0;
		@Pc(149) int local149;
		@Pc(162) int local162;
		@Pc(328) int local328;
		for (@Pc(139) int local139 = 0; local139 < this.anInt10291; local139++) {
			@Pc(145) int local145 = local22[local139];
			@Pc(147) Class294 local147 = null;
			local149 = 0;
			@Pc(151) byte local151 = 0;
			@Pc(153) byte local153 = 0;
			@Pc(155) byte local155 = 0;
			if (arg1.aClass319Array1 != null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < arg1.aClass319Array1.length; local162++) {
					@Pc(169) Class319 local169 = arg1.aClass319Array1[local162];
					if (local169.anInt8748 == local145) {
						@Pc(182) Class5 local182 = Static122.method1892(local169.anInt8754);
						if (local182.aBoolean8) {
							local160 = true;
						}
						if (local182.anInt76 != -1) {
							@Pc(198) Class294 local198 = local11.method7088(local182.anInt76);
							if (local198.anInt8333 == 2) {
								this.aBoolean721 = true;
							}
						}
					}
				}
				if (local160) {
					local128[local139] = Long.MAX_VALUE;
					this.anInt10252--;
					continue;
				}
			}
			@Pc(231) short local231 = -1;
			if (arg1.aShortArray14 != null) {
				local231 = arg1.aShortArray14[local145];
				if (local231 != -1) {
					local147 = local11.method7088(local231 & 0xFFFF);
					if ((this.anInt10281 & 0x40) != 0 && local147.aBoolean573) {
						local147 = null;
						local231 = -1;
					} else {
						local153 = local147.aByte120;
						local155 = local147.aByte114;
					}
				}
			}
			@Pc(290) boolean local290 = arg1.aByteArray5 != null && arg1.aByteArray5[local145] != 0 || local147 != null && local147.anInt8333 != 0;
			if ((local137 || local290) && arg1.aByteArray4 != null) {
				local149 += arg1.aByteArray4[local145] << 17;
			}
			if (local290) {
				local149 += 65536;
			}
			local149 += (local153 & 0xFF) << 8;
			local328 = local151 + ((local231 & 0xFFFF) << 16);
			local149 += local155 & 0xFF;
			@Pc(340) int local340 = local328 + (local139 & 0xFFFF);
			local128[local139] = (long) local340 + ((long) local149 << 32);
			this.aBoolean721 |= local290;
			this.aBoolean718 |= local147 != null && (local147.aByte115 != 0 || local147.aByte117 != 0);
		}
		Static408.method5845(local128, local22);
		this.anIntArray679 = arg1.anIntArray28;
		this.aShortArray144 = arg1.aShortArray22;
		this.anIntArray674 = arg1.anIntArray32;
		this.anInt10238 = arg1.anInt506;
		this.anIntArray673 = arg1.anIntArray27;
		this.anInt10245 = arg1.anInt502;
		this.aClass218Array5 = arg1.aClass218Array1;
		this.aClass100Array5 = arg1.aClass100Array1;
		@Pc(420) Class208[] local420 = new Class208[this.anInt10238];
		@Pc(440) int local440;
		@Pc(454) int local454;
		@Pc(493) int local493;
		if (arg1.aClass319Array1 != null) {
			this.anInt10264 = arg1.aClass319Array1.length;
			this.aClass192Array1 = new Class192[this.anInt10264];
			this.aClass264Array1 = new Class264[this.anInt10264];
			for (local440 = 0; local440 < this.anInt10264; local440++) {
				@Pc(447) Class319 local447 = arg1.aClass319Array1[local440];
				@Pc(452) Class5 local452 = Static122.method1892(local447.anInt8754);
				local454 = -1;
				for (@Pc(456) int local456 = 0; local456 < this.anInt10291; local456++) {
					if (local447.anInt8748 == local22[local456]) {
						local454 = local456;
						break;
					}
				}
				if (local454 == -1) {
					throw new RuntimeException();
				}
				local493 = Static70.anIntArray71[arg1.aShortArray16[local447.anInt8748] & 0xFFFF] & 0xFFFFFF;
				@Pc(510) int local510 = local493 | 255 - (arg1.aByteArray5 == null ? 0 : arg1.aByteArray5[local447.anInt8748]) << 24;
				this.aClass264Array1[local440] = new Class264(local454, arg1.aShortArray15[local447.anInt8748], arg1.aShortArray19[local447.anInt8748], arg1.aShortArray21[local447.anInt8748], local452.anInt75, local452.anInt82, local452.anInt76, local452.anInt84, local452.anInt77, local452.aBoolean8, local452.aBoolean9, local447.anInt8746);
				this.aClass192Array1[local440] = new Class192(local510);
			}
		}
		local440 = this.anInt10291 * 3;
		this.aShortArray149 = new short[this.anInt10291];
		this.aFloatArray75 = new float[local440];
		this.aShortArray152 = new short[local440];
		this.aFloatArray74 = new float[local440];
		this.aByteArray103 = new byte[this.anInt10291];
		this.aShort124 = (short) arg4;
		if (arg1.aShortArray20 != null) {
			this.aShortArray145 = new short[this.anInt10291];
		}
		this.aShortArray153 = new short[local440];
		this.aShortArray156 = new short[local440];
		this.aShortArray150 = new short[this.anInt10291];
		this.aShortArray146 = new short[this.anInt10291];
		this.aByteArray102 = new byte[local440];
		this.aShortArray154 = new short[local440];
		this.aShortArray148 = new short[this.anInt10291];
		this.aShortArray151 = new short[this.anInt10291];
		this.aShortArray155 = new short[local440];
		this.aShortArray147 = new short[local440];
		this.aShort123 = (short) arg3;
		Static33.aLongArray2 = new long[local440];
		local149 = 0;
		for (local328 = 0; local328 < arg1.anInt506; local328++) {
			local454 = this.anIntArray676[local328];
			this.anIntArray676[local328] = local149;
			local420[local328] = new Class208();
			local149 += local454;
		}
		this.anIntArray676[arg1.anInt506] = local149;
		@Pc(704) Class49 local704 = Static274.method4048(local22, arg1, this.anInt10291);
		@Pc(708) Class163[] local708 = new Class163[arg1.anInt509];
		@Pc(748) int local748;
		@Pc(759) int local759;
		@Pc(770) int local770;
		@Pc(727) short local727;
		@Pc(737) int local737;
		for (local493 = 0; local493 < arg1.anInt509; local493++) {
			@Pc(717) short local717 = arg1.aShortArray15[local493];
			@Pc(722) short local722 = arg1.aShortArray19[local493];
			local727 = arg1.aShortArray21[local493];
			local737 = this.anIntArray673[local722] - this.anIntArray673[local717];
			local748 = this.anIntArray679[local722] - this.anIntArray679[local717];
			local759 = this.anIntArray674[local722] - this.anIntArray674[local717];
			local770 = this.anIntArray673[local727] - this.anIntArray673[local717];
			@Pc(780) int local780 = this.anIntArray679[local727] - this.anIntArray679[local717];
			@Pc(791) int local791 = this.anIntArray674[local727] - this.anIntArray674[local717];
			@Pc(799) int local799 = local748 * local791 - local759 * local780;
			@Pc(808) int local808 = local759 * local770 - local791 * local737;
			@Pc(817) int local817 = local737 * local780 - local770 * local748;
			while (local799 > 8192 || local808 > 8192 || local817 > 8192 || local799 < -8192 || local808 < -8192 || local817 < -8192) {
				local817 >>= 0x1;
				local799 >>= 0x1;
				local808 >>= 0x1;
			}
			@Pc(869) int local869 = (int) Math.sqrt((double) (local817 * local817 + local799 * local799 + local808 * local808));
			if (local869 <= 0) {
				local869 = 1;
			}
			local799 = local799 * 256 / local869;
			local808 = local808 * 256 / local869;
			local817 = local817 * 256 / local869;
			@Pc(904) byte local904 = arg1.aByteArray3 == null ? 0 : arg1.aByteArray3[local493];
			if (local904 == 0) {
				@Pc(934) Class208 local934 = local420[local717];
				local934.anInt5907 += local817;
				local934.anInt5906 += local799;
				local934.anInt5905++;
				local934.anInt5900 += local808;
				@Pc(962) Class208 local962 = local420[local722];
				local962.anInt5906 += local799;
				local962.anInt5900 += local808;
				local962.anInt5905++;
				local962.anInt5907 += local817;
				@Pc(990) Class208 local990 = local420[local727];
				local990.anInt5905++;
				local990.anInt5906 += local799;
				local990.anInt5907 += local817;
				local990.anInt5900 += local808;
			} else if (local904 == 1) {
				@Pc(919) Class163 local919 = local708[local493] = new Class163();
				local919.anInt4320 = local799;
				local919.anInt4321 = local817;
				local919.anInt4322 = local808;
			}
		}
		@Pc(1031) int local1031;
		@Pc(1074) short local1074;
		for (local162 = 0; local162 < this.anInt10291; local162++) {
			local1031 = local22[local162];
			@Pc(1038) int local1038 = arg1.aShortArray16[local1031] & 0xFFFF;
			if (arg1.aByteArray8 == null) {
				local737 = -1;
			} else {
				local737 = arg1.aByteArray8[local1031];
			}
			if (arg1.aByteArray5 == null) {
				local748 = 0;
			} else {
				local748 = arg1.aByteArray5[local1031] & 0xFF;
			}
			local1074 = arg1.aShortArray14 == null ? -1 : arg1.aShortArray14[local1031];
			if (local1074 != -1 && (this.anInt10281 & 0x40) != 0) {
				@Pc(1093) Class294 local1093 = local11.method7088(local1074 & 0xFFFF);
				if (local1093.aBoolean573) {
					local1074 = -1;
				}
			}
			@Pc(1100) float local1100 = 0.0F;
			@Pc(1102) float local1102 = 0.0F;
			@Pc(1104) float local1104 = 0.0F;
			@Pc(1106) float local1106 = 0.0F;
			@Pc(1108) float local1108 = 0.0F;
			@Pc(1110) float local1110 = 0.0F;
			@Pc(1112) byte local1112 = 0;
			@Pc(1114) byte local1114 = 0;
			@Pc(1116) int local1116 = 0;
			@Pc(1149) byte local1149;
			@Pc(1169) short local1169;
			@Pc(1174) short local1174;
			@Pc(1179) short local1179;
			if (local1074 != -1) {
				if (local737 == -1) {
					local1108 = 0.0F;
					local1110 = 0.0F;
					local1104 = 1.0F;
					local1100 = 0.0F;
					local1114 = 2;
					local1106 = 1.0F;
					local1112 = 1;
					local1102 = 1.0F;
				} else {
					local737 &= 0xFF;
					local1149 = arg1.aByteArray7[local737];
					@Pc(1159) short local1159;
					@Pc(1164) short local1164;
					@Pc(1202) float local1202;
					@Pc(1210) float local1210;
					@Pc(1219) float local1219;
					@Pc(1303) float local1303;
					@Pc(1311) float local1311;
					@Pc(1320) float local1320;
					@Pc(1329) float local1329;
					@Pc(1337) float local1337;
					@Pc(1345) float local1345;
					if (local1149 == 0) {
						local1159 = arg1.aShortArray15[local1031];
						local1164 = arg1.aShortArray19[local1031];
						local1169 = arg1.aShortArray21[local1031];
						local1174 = arg1.aShortArray13[local737];
						local1179 = arg1.aShortArray18[local737];
						@Pc(1184) short local1184 = arg1.aShortArray17[local737];
						@Pc(1190) float local1190 = (float) arg1.anIntArray27[local1174];
						@Pc(1196) float local1196 = (float) arg1.anIntArray28[local1174];
						local1202 = (float) arg1.anIntArray32[local1174];
						local1210 = (float) arg1.anIntArray27[local1179] - local1190;
						local1219 = (float) arg1.anIntArray28[local1179] - local1196;
						@Pc(1227) float local1227 = (float) arg1.anIntArray32[local1179] - local1202;
						@Pc(1236) float local1236 = (float) arg1.anIntArray27[local1184] - local1190;
						@Pc(1244) float local1244 = (float) arg1.anIntArray28[local1184] - local1196;
						@Pc(1253) float local1253 = (float) arg1.anIntArray32[local1184] - local1202;
						@Pc(1261) float local1261 = (float) arg1.anIntArray27[local1159] - local1190;
						@Pc(1270) float local1270 = (float) arg1.anIntArray28[local1159] - local1196;
						@Pc(1279) float local1279 = (float) arg1.anIntArray32[local1159] - local1202;
						@Pc(1287) float local1287 = (float) arg1.anIntArray27[local1164] - local1190;
						@Pc(1295) float local1295 = (float) arg1.anIntArray28[local1164] - local1196;
						local1303 = (float) arg1.anIntArray32[local1164] - local1202;
						local1311 = (float) arg1.anIntArray27[local1169] - local1190;
						local1320 = (float) arg1.anIntArray28[local1169] - local1196;
						local1329 = (float) arg1.anIntArray32[local1169] - local1202;
						local1337 = local1253 * local1219 - local1227 * local1244;
						local1345 = local1236 * local1227 - local1253 * local1210;
						@Pc(1353) float local1353 = local1244 * local1210 - local1219 * local1236;
						@Pc(1362) float local1362 = local1244 * local1353 - local1345 * local1253;
						@Pc(1371) float local1371 = local1253 * local1337 - local1353 * local1236;
						@Pc(1380) float local1380 = local1345 * local1236 - local1337 * local1244;
						@Pc(1394) float local1394 = 1.0F / (local1362 * local1210 + local1219 * local1371 + local1227 * local1380);
						local1104 = local1394 * (local1287 * local1362 + local1371 * local1295 + local1380 * local1303);
						local1108 = (local1380 * local1329 + local1311 * local1362 + local1371 * local1320) * local1394;
						local1100 = local1394 * (local1380 * local1279 + local1270 * local1371 + local1261 * local1362);
						@Pc(1445) float local1445 = local1219 * local1353 - local1345 * local1227;
						@Pc(1454) float local1454 = local1345 * local1210 - local1337 * local1219;
						@Pc(1462) float local1462 = local1227 * local1337 - local1353 * local1210;
						@Pc(1476) float local1476 = 1.0F / (local1253 * local1454 + local1445 * local1236 + local1462 * local1244);
						local1110 = (local1454 * local1329 + local1462 * local1320 + local1311 * local1445) * local1476;
						local1106 = (local1303 * local1454 + local1287 * local1445 + local1462 * local1295) * local1476;
						local1102 = (local1462 * local1270 + local1261 * local1445 + local1279 * local1454) * local1476;
					} else {
						local1159 = arg1.aShortArray15[local1031];
						local1164 = arg1.aShortArray19[local1031];
						local1169 = arg1.aShortArray21[local1031];
						@Pc(1540) int local1540 = local704.anIntArray67[local737];
						@Pc(1545) int local1545 = local704.anIntArray66[local737];
						@Pc(1550) int local1550 = local704.anIntArray68[local737];
						@Pc(1555) float[] local1555 = local704.aFloatArrayArray7[local737];
						@Pc(1560) byte local1560 = arg1.aByteArray9[local737];
						local1202 = (float) arg1.anIntArray26[local737] / 256.0F;
						if (local1149 == 1) {
							local1210 = (float) arg1.anIntArray23[local737] / 1024.0F;
							Static539.method7684(Static200.aFloatArray9, local1210, local1550, local1202, local1540, arg1.anIntArray32[local1159], local1560, local1545, arg1.anIntArray28[local1159], arg1.anIntArray27[local1159], local1555);
							local1102 = Static200.aFloatArray9[1];
							local1100 = Static200.aFloatArray9[0];
							Static539.method7684(Static200.aFloatArray9, local1210, local1550, local1202, local1540, arg1.anIntArray32[local1164], local1560, local1545, arg1.anIntArray28[local1164], arg1.anIntArray27[local1164], local1555);
							local1106 = Static200.aFloatArray9[1];
							local1104 = Static200.aFloatArray9[0];
							Static539.method7684(Static200.aFloatArray9, local1210, local1550, local1202, local1540, arg1.anIntArray32[local1169], local1560, local1545, arg1.anIntArray28[local1169], arg1.anIntArray27[local1169], local1555);
							local1110 = Static200.aFloatArray9[1];
							local1108 = Static200.aFloatArray9[0];
							local1219 = local1210 / 2.0F;
							if ((local1560 & 0x1) == 0) {
								if (local1219 < local1104 - local1100) {
									local1112 = 1;
									local1104 -= local1210;
								} else if (local1219 < local1100 - local1104) {
									local1112 = 2;
									local1104 += local1210;
								}
								if (local1108 - local1100 > local1219) {
									local1114 = 1;
									local1108 -= local1210;
								} else if (local1219 < local1100 - local1108) {
									local1114 = 2;
									local1108 += local1210;
								}
							} else {
								if (local1106 - local1102 > local1219) {
									local1106 -= local1210;
									local1112 = 1;
								} else if (local1219 < local1102 - local1106) {
									local1106 += local1210;
									local1112 = 2;
								}
								if (local1110 - local1102 > local1219) {
									local1114 = 1;
									local1110 -= local1210;
								} else if (local1102 - local1110 > local1219) {
									local1114 = 2;
									local1110 += local1210;
								}
							}
						} else if (local1149 == 2) {
							local1210 = (float) arg1.anIntArray30[local737] / 256.0F;
							local1219 = (float) arg1.anIntArray24[local737] / 256.0F;
							@Pc(1813) int local1813 = arg1.anIntArray27[local1164] - arg1.anIntArray27[local1159];
							@Pc(1824) int local1824 = arg1.anIntArray28[local1164] - arg1.anIntArray28[local1159];
							@Pc(1835) int local1835 = arg1.anIntArray32[local1164] - arg1.anIntArray32[local1159];
							@Pc(1846) int local1846 = arg1.anIntArray27[local1169] - arg1.anIntArray27[local1159];
							@Pc(1857) int local1857 = arg1.anIntArray28[local1169] - arg1.anIntArray28[local1159];
							@Pc(1867) int local1867 = arg1.anIntArray32[local1169] - arg1.anIntArray32[local1159];
							@Pc(1876) int local1876 = local1867 * local1824 - local1835 * local1857;
							@Pc(1884) int local1884 = local1835 * local1846 - local1867 * local1813;
							@Pc(1893) int local1893 = local1813 * local1857 - local1846 * local1824;
							local1303 = 64.0F / (float) arg1.anIntArray22[local737];
							local1311 = 64.0F / (float) arg1.anIntArray29[local737];
							local1320 = 64.0F / (float) arg1.anIntArray23[local737];
							local1329 = ((float) local1893 * local1555[2] + local1555[1] * (float) local1884 + local1555[0] * (float) local1876) / local1303;
							local1337 = (local1555[4] * (float) local1884 + local1555[3] * (float) local1876 + (float) local1893 * local1555[5]) / local1311;
							local1345 = ((float) local1884 * local1555[7] + (float) local1876 * local1555[6] + (float) local1893 * local1555[8]) / local1320;
							local1116 = Static318.method4578(local1345, local1329, local1337);
							Static565.method7928(local1210, Static200.aFloatArray9, local1219, arg1.anIntArray32[local1159], local1540, local1116, local1545, local1560, local1550, arg1.anIntArray27[local1159], local1202, local1555, arg1.anIntArray28[local1159]);
							local1100 = Static200.aFloatArray9[0];
							local1102 = Static200.aFloatArray9[1];
							Static565.method7928(local1210, Static200.aFloatArray9, local1219, arg1.anIntArray32[local1164], local1540, local1116, local1545, local1560, local1550, arg1.anIntArray27[local1164], local1202, local1555, arg1.anIntArray28[local1164]);
							local1104 = Static200.aFloatArray9[0];
							local1106 = Static200.aFloatArray9[1];
							Static565.method7928(local1210, Static200.aFloatArray9, local1219, arg1.anIntArray32[local1169], local1540, local1116, local1545, local1560, local1550, arg1.anIntArray27[local1169], local1202, local1555, arg1.anIntArray28[local1169]);
							local1110 = Static200.aFloatArray9[1];
							local1108 = Static200.aFloatArray9[0];
						} else if (local1149 == 3) {
							Static463.method6860(Static200.aFloatArray9, local1545, local1550, arg1.anIntArray32[local1159], arg1.anIntArray28[local1159], local1202, local1555, local1540, arg1.anIntArray27[local1159], local1560);
							local1102 = Static200.aFloatArray9[1];
							local1100 = Static200.aFloatArray9[0];
							Static463.method6860(Static200.aFloatArray9, local1545, local1550, arg1.anIntArray32[local1164], arg1.anIntArray28[local1164], local1202, local1555, local1540, arg1.anIntArray27[local1164], local1560);
							local1104 = Static200.aFloatArray9[0];
							local1106 = Static200.aFloatArray9[1];
							Static463.method6860(Static200.aFloatArray9, local1545, local1550, arg1.anIntArray32[local1169], arg1.anIntArray28[local1169], local1202, local1555, local1540, arg1.anIntArray27[local1169], local1560);
							local1110 = Static200.aFloatArray9[1];
							local1108 = Static200.aFloatArray9[0];
							if ((local1560 & 0x1) == 0) {
								if (local1104 - local1100 > 0.5F) {
									local1112 = 1;
									local1104--;
								} else if (local1100 - local1104 > 0.5F) {
									local1112 = 2;
									local1104++;
								}
								if (local1108 - local1100 > 0.5F) {
									local1114 = 1;
									local1108--;
								} else if (local1100 - local1108 > 0.5F) {
									local1114 = 2;
									local1108++;
								}
							} else {
								if (local1106 - local1102 > 0.5F) {
									local1112 = 1;
									local1106--;
								} else if (local1102 - local1106 > 0.5F) {
									local1112 = 2;
									local1106++;
								}
								if (local1110 - local1102 > 0.5F) {
									local1114 = 1;
									local1110--;
								} else if (local1102 - local1110 > 0.5F) {
									local1114 = 2;
									local1110++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray3 == null) {
				local1149 = 0;
			} else {
				local1149 = arg1.aByteArray3[local1031];
			}
			if (local1149 == 0) {
				@Pc(2346) long local2346 = ((long) local748 + (long) (local1038 << 8) + (long) (local1116 << 24) << 32) + (long) (local737 << 2);
				local1169 = arg1.aShortArray15[local1031];
				local1174 = arg1.aShortArray19[local1031];
				local1179 = arg1.aShortArray21[local1031];
				@Pc(2365) Class208 local2365 = local420[local1169];
				this.aShortArray146[local162] = this.method8678(local1100, local2365.anInt5906, local2365.anInt5905, local2365.anInt5907, local1169, arg1, local1102, local2346, local162, local2365.anInt5900);
				@Pc(2390) Class208 local2390 = local420[local1174];
				this.aShortArray149[local162] = this.method8678(local1104, local2390.anInt5906, local2390.anInt5905, local2390.anInt5907, local1174, arg1, local1106, (long) local1112 + local2346, local162, local2390.anInt5900);
				@Pc(2418) Class208 local2418 = local420[local1179];
				this.aShortArray151[local162] = this.method8678(local1108, local2418.anInt5906, local2418.anInt5905, local2418.anInt5907, local1179, arg1, local1110, local2346 + (long) local1114, local162, local2418.anInt5900);
			} else if (local1149 == 1) {
				@Pc(2453) Class163 local2453 = local708[local1031];
				@Pc(2496) long local2496 = ((long) (local1116 << 24) + (long) (local1038 << 8) + (long) local748 << 32) + (long) ((local737 << 2) + (local2453.anInt4320 <= 0 ? 2048 : 1024) + (local2453.anInt4322 + 256 << 12) + (local2453.anInt4321 + 256 << 22));
				this.aShortArray146[local162] = this.method8678(local1100, local2453.anInt4320, 0, local2453.anInt4321, arg1.aShortArray15[local1031], arg1, local1102, local2496, local162, local2453.anInt4322);
				this.aShortArray149[local162] = this.method8678(local1104, local2453.anInt4320, 0, local2453.anInt4321, arg1.aShortArray19[local1031], arg1, local1106, local2496 + (long) local1112, local162, local2453.anInt4322);
				this.aShortArray151[local162] = this.method8678(local1108, local2453.anInt4320, 0, local2453.anInt4321, arg1.aShortArray21[local1031], arg1, local1110, local2496 + (long) local1114, local162, local2453.anInt4322);
			}
			if (arg1.aByteArray5 != null) {
				this.aByteArray103[local162] = arg1.aByteArray5[local1031];
			}
			if (arg1.aShortArray20 != null) {
				this.aShortArray145[local162] = arg1.aShortArray20[local1031];
			}
			this.aShortArray150[local162] = arg1.aShortArray16[local1031];
			this.aShortArray148[local162] = local1074;
		}
		if (this.anInt10252 > 0) {
			local1031 = 1;
			local727 = this.aShortArray148[0];
			for (local737 = 0; local737 < this.anInt10252; local737++) {
				@Pc(2633) short local2633 = this.aShortArray148[local737];
				if (local727 != local2633) {
					local1031++;
					local727 = local2633;
				}
			}
			this.anIntArray678 = new int[local1031];
			this.anIntArray675 = new int[local1031 + 1];
			this.anIntArray677 = new int[local1031];
			this.anIntArray675[0] = 0;
			local748 = this.anInt10239;
			local1074 = 0;
			local1031 = 0;
			local727 = this.aShortArray148[0];
			for (local770 = 0; local770 < this.anInt10252; local770++) {
				@Pc(2688) short local2688 = this.aShortArray148[local770];
				if (local2688 != local727) {
					this.anIntArray677[local1031] = local748;
					this.anIntArray678[local1031] = local1074 + 1 - local748;
					local1031++;
					this.anIntArray675[local1031] = local770;
					local748 = this.anInt10239;
					local727 = local2688;
					local1074 = 0;
				}
				@Pc(2728) short local2728 = this.aShortArray146[local770];
				if (local1074 < local2728) {
					local1074 = local2728;
				}
				if (local748 > local2728) {
					local748 = local2728;
				}
				local2728 = this.aShortArray149[local770];
				if (local2728 < local748) {
					local748 = local2728;
				}
				if (local1074 < local2728) {
					local1074 = local2728;
				}
				local2728 = this.aShortArray151[local770];
				if (local2728 > local1074) {
					local1074 = local2728;
				}
				if (local748 > local2728) {
					local748 = local2728;
				}
			}
			this.anIntArray677[local1031] = local748;
			this.anIntArray678[local1031] = local1074 + 1 - local748;
			local1031++;
			this.anIntArray675[local1031] = this.anInt10252;
		}
		Static33.aLongArray2 = null;
		this.aShortArray153 = Static223.method3246(this.aShortArray153, this.anInt10239);
		this.aShortArray147 = Static223.method3246(this.aShortArray147, this.anInt10239);
		this.aShortArray156 = Static223.method3246(this.aShortArray156, this.anInt10239);
		this.aShortArray155 = Static223.method3246(this.aShortArray155, this.anInt10239);
		this.aShortArray154 = Static223.method3246(this.aShortArray154, this.anInt10239);
		this.aByteArray102 = Static414.method6211(this.aByteArray102, this.anInt10239);
		this.aFloatArray75 = Static69.method1196(this.anInt10239, this.aFloatArray75);
		this.aFloatArray74 = Static69.method1196(this.anInt10239, this.aFloatArray74);
		if (arg1.anIntArray25 != null && Static22.method529(this.anInt10281, arg2)) {
			this.anIntArrayArray57 = arg1.method537(false);
		}
		if (arg1.aClass319Array1 != null && Static194.method2754(arg2, this.anInt10281)) {
			this.anIntArrayArray56 = arg1.method541();
		}
		if (arg1.anIntArray31 != null && Static584.method8078(arg2, this.anInt10281)) {
			local1031 = 0;
			@Pc(2916) int[] local2916 = new int[256];
			for (local737 = 0; local737 < this.anInt10291; local737++) {
				local748 = arg1.anIntArray31[local22[local737]];
				if (local748 >= 0) {
					if (local1031 < local748) {
						local1031 = local748;
					}
					@Pc(2945) int local2945 = local2916[local748]++;
				}
			}
			this.anIntArrayArray58 = new int[local1031 + 1][];
			for (local748 = 0; local748 <= local1031; local748++) {
				this.anIntArrayArray58[local748] = new int[local2916[local748]];
				local2916[local748] = 0;
			}
			for (local759 = 0; local759 < this.anInt10291; local759++) {
				local770 = arg1.anIntArray31[local22[local759]];
				if (local770 >= 0) {
					this.anIntArrayArray58[local770][local2916[local770]++] = local759;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "<init>", descriptor = "(Lclient!lba;IIZZ)V")
	public Class184_Sub3(@OriginalArg(0) Class132_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10239 = 0;
		this.aBoolean720 = true;
		this.aBoolean721 = false;
		this.aBoolean717 = false;
		this.anInt10245 = 0;
		this.aBoolean719 = false;
		this.aBoolean718 = false;
		this.anInt10252 = 0;
		this.anInt10238 = 0;
		this.anInt10291 = 0;
		this.aBoolean717 = arg4;
		this.anInt10262 = arg1;
		this.anInt10281 = arg2;
		this.aClass132_Sub1_23 = arg0;
		if (arg3 || Static653.method8885(this.anInt10281, this.anInt10262)) {
			this.aClass181_3 = new Class181(Static426.method6548(this.anInt10281, this.anInt10262));
		}
		if (arg3 || Static390.method5564(this.anInt10262, this.anInt10281)) {
			this.aClass181_2 = new Class181(Static233.method3521(this.anInt10262, this.anInt10281));
		}
		if (arg3 || Static479.method7014(this.anInt10281, this.anInt10262)) {
			this.aClass181_1 = new Class181(Static454.method6568(this.anInt10262, this.anInt10281));
		}
		if (arg3 || Static301.method4340(this.anInt10281, this.anInt10262)) {
			this.aClass181_4 = new Class181(Static385.method5488(this.anInt10262, this.anInt10281));
		}
		if (arg3 || Static527.method7377(this.anInt10281, this.anInt10262)) {
			this.aClass95_1 = new Class95(Static205.method3062(this.anInt10281, this.anInt10262));
		}
	}

	@OriginalMember(owner = "client!vea", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt10238; local15++) {
			local34 = this.anIntArray674[local15] * local9 + local13 * this.anIntArray673[local15] >> 14;
			this.anIntArray674[local15] = this.anIntArray674[local15] * local13 - local9 * this.anIntArray673[local15] >> 14;
			this.anIntArray673[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt10239; local34++) {
			@Pc(84) int local84 = this.aShortArray154[local34] * local9 + this.aShortArray156[local34] * local13 >> 14;
			this.aShortArray154[local34] = (short) (local13 * this.aShortArray154[local34] - this.aShortArray156[local34] * local9 >> 14);
			this.aShortArray156[local34] = (short) local84;
		}
		this.method8680();
		this.method8676();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass181_3 != null) {
			this.aClass181_3.aBoolean308 = Static426.method6548(this.anInt10281, arg0);
		}
		if (this.aClass181_2 != null) {
			this.aClass181_2.aBoolean308 = Static233.method3521(arg0, this.anInt10281);
		}
		if (this.aClass181_1 != null) {
			this.aClass181_1.aBoolean308 = Static454.method6568(arg0, this.anInt10281);
		}
		if (this.aClass181_4 != null) {
			this.aClass181_4.aBoolean308 = Static385.method5488(arg0, this.anInt10281);
		}
		this.anInt10262 = arg0;
		this.aBoolean720 = true;
		if (this.lb != null && (this.anInt10262 & 0x10000) == 0) {
			this.aShortArray154 = this.lb.aShortArray32;
			this.aShortArray156 = this.lb.aShortArray33;
			this.aByteArray102 = this.lb.aByteArray17;
			this.aShortArray155 = this.lb.aShortArray31;
			this.lb = null;
		}
		this.method8667();
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(I)V")
	private void method8666() {
		if (this.aClass95_1 != null) {
			this.aClass95_1.aBoolean154 = false;
		}
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(I)V")
	private void method8667() {
		if (!this.aBoolean720) {
			return;
		}
		this.aBoolean720 = false;
		if (this.aClass100Array5 == null && this.aClass218Array5 == null && this.aClass264Array1 == null && !Static106.method1724(this.anInt10262, this.anInt10281)) {
			@Pc(36) boolean local36 = false;
			@Pc(38) boolean local38 = false;
			@Pc(40) boolean local40 = false;
			if (this.anIntArray673 != null && !Static634.method8707(this.anInt10281, this.anInt10262)) {
				if (this.aClass181_3 == null || this.aClass181_3.method4138()) {
					if (!this.aBoolean719) {
						this.method8682();
					}
					local36 = true;
				} else {
					this.aBoolean720 = true;
				}
			}
			if (this.anIntArray679 != null && !Static343.method5018(this.anInt10281, this.anInt10262)) {
				if (this.aClass181_3 == null || this.aClass181_3.method4138()) {
					if (!this.aBoolean719) {
						this.method8682();
					}
					local38 = true;
				} else {
					this.aBoolean720 = true;
				}
			}
			if (this.anIntArray674 != null && !Static219.method3190(this.anInt10262, this.anInt10281)) {
				if (this.aClass181_3 == null || this.aClass181_3.method4138()) {
					local40 = true;
					if (!this.aBoolean719) {
						this.method8682();
					}
				} else {
					this.aBoolean720 = true;
				}
			}
			if (local40) {
				this.anIntArray674 = null;
			}
			if (local36) {
				this.anIntArray673 = null;
			}
			if (local38) {
				this.anIntArray679 = null;
			}
		}
		if (this.aShortArray152 != null && this.anIntArray673 == null && this.anIntArray679 == null && this.anIntArray674 == null) {
			this.anIntArray676 = null;
			this.aShortArray152 = null;
		}
		if (this.aByteArray102 != null && !Static5.method174(this.anInt10281, this.anInt10262)) {
			label207: {
				label206: {
					@Pc(190) boolean local190;
					if ((this.anInt10281 & 0x37) == 0) {
						if (this.aClass181_1 == null || this.aClass181_1.method4138()) {
							break label206;
						}
						local190 = false;
					} else {
						if (this.aClass181_4 == null || this.aClass181_4.method4138()) {
							break label206;
						}
						local190 = false;
					}
					if (!local190) {
						this.aBoolean720 = true;
						break label207;
					}
				}
				this.aByteArray102 = null;
				this.aShortArray156 = this.aShortArray155 = this.aShortArray154 = null;
			}
		}
		if (this.aShortArray150 != null && !Static355.method5135(this.anInt10281, this.anInt10262)) {
			if (this.aClass181_1 == null || this.aClass181_1.method4138()) {
				this.aShortArray150 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.aByteArray103 != null && !Static65.method1143(this.anInt10262, this.anInt10281)) {
			if (this.aClass181_1 == null || this.aClass181_1.method4138()) {
				this.aByteArray103 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.aFloatArray75 != null && !Static115.method1817(this.anInt10262, this.anInt10281)) {
			if (this.aClass181_2 == null || this.aClass181_2.method4138()) {
				this.aFloatArray75 = this.aFloatArray74 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.aShortArray148 != null && !Static55.method3551(this.anInt10281, this.anInt10262)) {
			if (this.aClass181_1 == null || this.aClass181_1.method4138()) {
				this.aShortArray148 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.aShortArray146 != null && !Static542.method7712(this.anInt10262, this.anInt10281)) {
			if ((this.aClass95_1 == null || this.aClass95_1.method2090()) && (this.aClass181_1 == null || this.aClass181_1.method4138())) {
				this.aShortArray146 = this.aShortArray149 = this.aShortArray151 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.aShortArray153 != null) {
			if (this.aClass181_3 == null || this.aClass181_3.method4138()) {
				this.aShortArray153 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.aShortArray147 != null) {
			if (this.aClass181_1 == null || this.aClass181_1.method4138()) {
				this.aShortArray147 = null;
			} else {
				this.aBoolean720 = true;
			}
		}
		if (this.anIntArrayArray58 != null && !Static584.method8078(this.anInt10262, this.anInt10281)) {
			this.anIntArrayArray58 = null;
			this.aShortArray145 = null;
		}
		if (this.anIntArrayArray57 != null && !Static22.method529(this.anInt10281, this.anInt10262)) {
			this.aShortArray144 = null;
			this.anIntArrayArray57 = null;
		}
		if (this.anIntArrayArray56 != null && !Static194.method2754(this.anInt10262, this.anInt10281)) {
			this.anIntArrayArray56 = null;
		}
		if (this.anIntArray675 != null && (this.anInt10262 & 0x800) == 0 && (this.anInt10262 & 0x40000) == 0) {
			this.anIntArray678 = null;
			this.anIntArray675 = null;
			this.anIntArray677 = null;
		}
	}

	@OriginalMember(owner = "client!vea", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10238; local15++) {
			@Pc(34) int local34 = local9 * this.anIntArray679[local15] + local13 * this.anIntArray673[local15] >> 14;
			this.anIntArray679[local15] = local13 * this.anIntArray679[local15] - this.anIntArray673[local15] * local9 >> 14;
			this.anIntArray673[local15] = local34;
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!oo;Lclient!ea;I)V")
	@Override
	public void method8662(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10239 == 0) {
			return;
		}
		@Pc(16) Class207_Sub3 local16 = this.aClass132_Sub1_23.aClass207_Sub3_16;
		if (!this.aBoolean719) {
			this.method8682();
		}
		@Pc(25) Class207_Sub3 local25 = (Class207_Sub3) arg0;
		Static219.aFloat22 = local16.aFloat188 + local25.aFloat188 * local16.aFloat183 + local16.aFloat191 * local25.aFloat193 + local16.aFloat192 * local25.aFloat189;
		Static187.aFloat18 = local25.aFloat187 * local16.aFloat192 + local16.aFloat191 * local25.aFloat184 + local16.aFloat183 * local25.aFloat192;
		@Pc(72) float local72 = Static219.aFloat22 + Static187.aFloat18 * (float) this.anInt10278;
		@Pc(80) float local80 = Static219.aFloat22 + (float) this.anInt10285 * Static187.aFloat18;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = (float) -this.anInt10243 + local80;
			local97 = local72 + (float) this.anInt10243;
		} else {
			local91 = (float) -this.anInt10243 + local72;
			local97 = local80 + (float) this.anInt10243;
		}
		if (local91 >= this.aClass132_Sub1_23.aFloat173 || (float) this.aClass132_Sub1_23.bf >= local97) {
			return;
		}
		Static93.aFloat113 = local16.aFloat186 * local25.aFloat192 + local25.aFloat184 * local16.aFloat194 + local16.aFloat184 * local25.aFloat187;
		Static395.aFloat77 = local25.aFloat189 * local16.aFloat184 + local25.aFloat193 * local16.aFloat194 + local25.aFloat188 * local16.aFloat186 + local16.aFloat193;
		@Pc(174) float local174 = Static395.aFloat77 + (float) this.anInt10278 * Static93.aFloat113;
		@Pc(182) float local182 = (float) this.anInt10285 * Static93.aFloat113 + Static395.aFloat77;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local174 > local182) {
			local208 = (local182 - (float) this.anInt10243) * (float) this.aClass132_Sub1_23.anInt8991;
			local197 = (float) this.aClass132_Sub1_23.anInt8991 * ((float) this.anInt10243 + local174);
		} else {
			local197 = ((float) this.anInt10243 + local182) * (float) this.aClass132_Sub1_23.anInt8991;
			local208 = (local174 - (float) this.anInt10243) * (float) this.aClass132_Sub1_23.anInt8991;
		}
		if (local208 / local97 >= this.aClass132_Sub1_23.aFloat178 || local197 / local97 <= this.aClass132_Sub1_23.aFloat167) {
			return;
		}
		Static389.aFloat76 = local16.aFloat185 * local25.aFloat192 + local16.aFloat187 * local25.aFloat187 + local25.aFloat184 * local16.aFloat190;
		Static303.aFloat34 = local16.aFloat185 * local25.aFloat188 + local25.aFloat193 * local16.aFloat190 + local25.aFloat189 * local16.aFloat187 + local16.aFloat189;
		@Pc(297) float local297 = (float) this.anInt10278 * Static389.aFloat76 + Static303.aFloat34;
		@Pc(305) float local305 = (float) this.anInt10285 * Static389.aFloat76 + Static303.aFloat34;
		@Pc(320) float local320;
		@Pc(331) float local331;
		if (local305 < local297) {
			local320 = (float) this.aClass132_Sub1_23.anInt8978 * (local305 - (float) this.anInt10243);
			local331 = (float) this.aClass132_Sub1_23.anInt8978 * ((float) this.anInt10243 + local297);
		} else {
			local320 = (float) this.aClass132_Sub1_23.anInt8978 * ((float) -this.anInt10243 + local297);
			local331 = ((float) this.anInt10243 + local305) * (float) this.aClass132_Sub1_23.anInt8978;
		}
		if (this.aClass132_Sub1_23.aFloat163 <= local320 / local97 || this.aClass132_Sub1_23.aFloat174 >= local331 / local97) {
			return;
		}
		if (arg1 != null || this.aClass264Array1 != null) {
			Static416.aFloat112 = local16.aFloat187 * local25.aFloat190 + local25.aFloat194 * local16.aFloat190 + local25.aFloat191 * local16.aFloat185;
			Static636.aFloat199 = local25.aFloat190 * local16.aFloat184 + local16.aFloat194 * local25.aFloat194 + local16.aFloat186 * local25.aFloat191;
			Static397.aFloat79 = local16.aFloat187 * local25.aFloat185 + local16.aFloat190 * local25.aFloat186 + local16.aFloat185 * local25.aFloat183;
			Static619.aFloat196 = local16.aFloat184 * local25.aFloat185 + local16.aFloat194 * local25.aFloat186 + local25.aFloat183 * local16.aFloat186;
			Static234.aFloat29 = local25.aFloat190 * local16.aFloat192 + local16.aFloat191 * local25.aFloat194 + local25.aFloat191 * local16.aFloat183;
			Static655.aFloat201 = local25.aFloat186 * local16.aFloat191 + local25.aFloat185 * local16.aFloat192 + local16.aFloat183 * local25.aFloat183;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt10259 + this.anInt10255 >> 1;
			@Pc(509) int local509 = this.anInt10288 + this.anInt10247 >> 1;
			@Pc(528) int local528 = (int) (Static619.aFloat196 * (float) local509 + Static93.aFloat113 * (float) this.anInt10278 + (float) local501 * Static636.aFloat199 + Static395.aFloat77);
			@Pc(547) int local547 = (int) (Static389.aFloat76 * (float) this.anInt10278 + Static416.aFloat112 * (float) local501 + Static303.aFloat34 + Static397.aFloat79 * (float) local509);
			@Pc(566) int local566 = (int) ((float) local509 * Static655.aFloat201 + (float) this.anInt10278 * Static187.aFloat18 + Static219.aFloat22 + Static234.aFloat29 * (float) local501);
			if (this.aClass132_Sub1_23.bf <= local566) {
				arg1.anInt2086 = local547 * this.aClass132_Sub1_23.anInt8978 / local566 + this.aClass132_Sub1_23.anInt9003;
				arg1.anInt2082 = this.aClass132_Sub1_23.anInt8975 + local528 * this.aClass132_Sub1_23.anInt8991 / local566;
			} else {
				local491 = true;
			}
			@Pc(624) int local624 = (int) ((float) local509 * Static619.aFloat196 + (float) local501 * Static636.aFloat199 + Static395.aFloat77 + (float) this.anInt10285 * Static93.aFloat113);
			@Pc(643) int local643 = (int) (Static303.aFloat34 + (float) local501 * Static416.aFloat112 + (float) this.anInt10285 * Static389.aFloat76 + Static397.aFloat79 * (float) local509);
			@Pc(662) int local662 = (int) ((float) local509 * Static655.aFloat201 + Static187.aFloat18 * (float) this.anInt10285 + Static219.aFloat22 + Static234.aFloat29 * (float) local501);
			if (this.aClass132_Sub1_23.bf <= local662) {
				arg1.anInt2083 = this.aClass132_Sub1_23.anInt8975 + local624 * this.aClass132_Sub1_23.anInt8991 / local662;
				arg1.anInt2084 = this.aClass132_Sub1_23.anInt8978 * local643 / local662 + this.aClass132_Sub1_23.anInt9003;
			} else {
				local491 = true;
			}
			if (local491) {
				if (this.aClass132_Sub1_23.bf > local566 && local662 < this.aClass132_Sub1_23.bf) {
					local493 = false;
				} else {
					@Pc(741) int local741;
					@Pc(751) int local751;
					@Pc(777) int local777;
					if (this.aClass132_Sub1_23.bf > local566) {
						local741 = (local662 - this.aClass132_Sub1_23.bf << 16) / (local662 - local566);
						local751 = ((local624 - local528) * local741 >> 16) + local624;
						local777 = local643 + (local741 * (local643 - local547) >> 16);
						arg1.anInt2082 = this.aClass132_Sub1_23.anInt8975 + local751 * this.aClass132_Sub1_23.anInt8991 / this.aClass132_Sub1_23.bf;
						arg1.anInt2086 = this.aClass132_Sub1_23.anInt8978 * local777 / this.aClass132_Sub1_23.bf + this.aClass132_Sub1_23.anInt9003;
					} else if (this.aClass132_Sub1_23.bf > local662) {
						local741 = (local566 - this.aClass132_Sub1_23.bf << 16) / (local566 - local662);
						local751 = local528 + (local741 * (local528 - local624) >> 16);
						arg1.anInt2082 = local751 * this.aClass132_Sub1_23.anInt8991 / this.aClass132_Sub1_23.bf + this.aClass132_Sub1_23.anInt8975;
						local777 = (local741 * (local547 - local643) >> 16) + local547;
						arg1.anInt2086 = this.aClass132_Sub1_23.anInt8978 * local777 / this.aClass132_Sub1_23.bf + this.aClass132_Sub1_23.anInt9003;
					}
				}
			}
			if (local493) {
				arg1.aBoolean124 = true;
				if (local566 > local662) {
					arg1.anInt2085 = this.aClass132_Sub1_23.anInt8991 * (this.anInt10243 + local528) / local566 + this.aClass132_Sub1_23.anInt8975 - arg1.anInt2082;
				} else {
					arg1.anInt2085 = this.aClass132_Sub1_23.anInt8991 * (this.anInt10243 + local624) / local662 + this.aClass132_Sub1_23.anInt8975 - arg1.anInt2083;
				}
			}
		}
		this.aClass132_Sub1_23.method7531();
		this.aClass132_Sub1_23.method7539(local25);
		this.method8669();
		this.method8672();
	}

	@OriginalMember(owner = "client!vea", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static94.anInt1716 = 0;
			Static499.anInt8441 = 0;
			Static405.anInt6805 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray57.length) {
					local52 = this.anIntArrayArray57[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local60]) != 0) {
							Static499.anInt8441 += this.anIntArray673[local60];
							Static94.anInt1716 += this.anIntArray679[local60];
							local24++;
							Static405.anInt6805 += this.anIntArray674[local60];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static499.anInt8441 = arg2;
				Static405.anInt6805 = arg4;
				Static94.anInt1716 = arg3;
			} else {
				Static67.aBoolean69 = true;
				Static94.anInt1716 = arg3 + Static94.anInt1716 / local24;
				Static405.anInt6805 = Static405.anInt6805 / local24 + arg4;
				Static499.anInt8441 = Static499.anInt8441 / local24 + arg2;
			}
			return;
		}
		@Pc(256) int[] local256;
		@Pc(258) int local258;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg7[2] * arg4 + arg7[0] * arg2 + arg3 * arg7[1] + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg2 * arg7[6] + arg7[7] * arg3 + arg4 * arg7[8] + 8192 >> 14;
				arg3 = local32;
				arg2 = local24;
				arg4 = local38;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray57.length) {
					local256 = this.anIntArrayArray57[local32];
					for (local258 = 0; local258 < local256.length; local258++) {
						local54 = local256[local258];
						if (this.aShortArray144 == null || (this.aShortArray144[local54] & arg6) != 0) {
							this.anIntArray673[local54] += arg2;
							this.anIntArray679[local54] += arg3;
							this.anIntArray674[local54] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(384) int local384;
		@Pc(406) int local406;
		@Pc(432) int local432;
		@Pc(463) int local463;
		@Pc(467) int local467;
		@Pc(471) int local471;
		@Pc(475) int local475;
		@Pc(483) int local483;
		@Pc(491) int local491;
		@Pc(647) int local647;
		@Pc(674) int local674;
		@Pc(678) int local678;
		@Pc(686) int local686;
		@Pc(691) int local691;
		@Pc(695) int local695;
		@Pc(699) int local699;
		@Pc(701) int local701;
		@Pc(833) int[] local833;
		@Pc(835) int local835;
		@Pc(839) int local839;
		@Pc(843) int local843;
		@Pc(845) int local845;
		@Pc(973) int local973;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray57.length) {
						local256 = this.anIntArrayArray57[local32];
						for (local258 = 0; local258 < local256.length; local258++) {
							local54 = local256[local258];
							if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local54]) != 0) {
								this.anIntArray673[local54] -= Static499.anInt8441;
								this.anIntArray679[local54] -= Static94.anInt1716;
								this.anIntArray674[local54] -= Static405.anInt6805;
								if (arg4 != 0) {
									local60 = Class6_Sub1_Sub3.anIntArray56[arg4];
									local384 = Class6_Sub1_Sub3.anIntArray58[arg4];
									local406 = local60 * this.anIntArray679[local54] + local384 * this.anIntArray673[local54] + 16383 >> 14;
									this.anIntArray679[local54] = this.anIntArray679[local54] * local384 + 16383 - this.anIntArray673[local54] * local60 >> 14;
									this.anIntArray673[local54] = local406;
								}
								if (arg2 != 0) {
									local60 = Class6_Sub1_Sub3.anIntArray56[arg2];
									local384 = Class6_Sub1_Sub3.anIntArray58[arg2];
									local406 = local384 * this.anIntArray679[local54] + 16383 - this.anIntArray674[local54] * local60 >> 14;
									this.anIntArray674[local54] = local384 * this.anIntArray674[local54] + local60 * this.anIntArray679[local54] + 16383 >> 14;
									this.anIntArray679[local54] = local406;
								}
								if (arg3 != 0) {
									local60 = Class6_Sub1_Sub3.anIntArray56[arg3];
									local384 = Class6_Sub1_Sub3.anIntArray58[arg3];
									local406 = this.anIntArray674[local54] * local60 + this.anIntArray673[local54] * local384 + 16383 >> 14;
									this.anIntArray674[local54] = local384 * this.anIntArray674[local54] + 16383 - this.anIntArray673[local54] * local60 >> 14;
									this.anIntArray673[local54] = local406;
								}
								this.anIntArray673[local54] += Static499.anInt8441;
								this.anIntArray679[local54] += Static94.anInt1716;
								this.anIntArray674[local54] += Static405.anInt6805;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray57.length) {
							local52 = this.anIntArrayArray57[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray144 == null || (this.aShortArray144[local60] & arg6) != 0) {
									local384 = this.anIntArray676[local60];
									local406 = this.anIntArray676[local60 + 1];
									for (local432 = local384; local432 < local406; local432++) {
										local463 = this.aShortArray152[local432] - 1;
										if (local463 == -1) {
											break;
										}
										if (arg4 != 0) {
											local467 = Class6_Sub1_Sub3.anIntArray56[arg4];
											local471 = Class6_Sub1_Sub3.anIntArray58[arg4];
											local475 = this.aShortArray156[local463] * local471 + local467 * this.aShortArray155[local463] + 16383 >> 14;
											this.aShortArray155[local463] = (short) (this.aShortArray155[local463] * local471 + 16383 - this.aShortArray156[local463] * local467 >> 14);
											this.aShortArray156[local463] = (short) local475;
										}
										if (arg2 != 0) {
											local467 = Class6_Sub1_Sub3.anIntArray56[arg2];
											local471 = Class6_Sub1_Sub3.anIntArray58[arg2];
											local475 = this.aShortArray155[local463] * local471 + 16383 - this.aShortArray154[local463] * local467 >> 14;
											this.aShortArray154[local463] = (short) (this.aShortArray154[local463] * local471 + local467 * this.aShortArray155[local463] + 16383 >> 14);
											this.aShortArray155[local463] = (short) local475;
										}
										if (arg3 != 0) {
											local467 = Class6_Sub1_Sub3.anIntArray56[arg3];
											local471 = Class6_Sub1_Sub3.anIntArray58[arg3];
											local475 = this.aShortArray156[local463] * local471 + this.aShortArray154[local463] * local467 + 16383 >> 14;
											this.aShortArray154[local463] = (short) (this.aShortArray154[local463] * local471 + 16383 - this.aShortArray156[local463] * local467 >> 14);
											this.aShortArray156[local463] = (short) local475;
										}
									}
								}
							}
						}
					}
					this.method8676();
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local258 = arg7[12] << 4;
				local54 = arg7[13] << 4;
				local60 = arg7[14] << 4;
				if (Static67.aBoolean69) {
					local384 = arg7[6] * Static405.anInt6805 + Static499.anInt8441 * arg7[0] + arg7[3] * Static94.anInt1716 + 8192 >> 14;
					local406 = Static405.anInt6805 * arg7[7] + Static499.anInt8441 * arg7[1] + arg7[4] * Static94.anInt1716 + 8192 >> 14;
					local406 += local54;
					local432 = arg7[8] * Static405.anInt6805 + Static94.anInt1716 * arg7[5] + arg7[2] * Static499.anInt8441 + 8192 >> 14;
					local384 += local258;
					Static499.anInt8441 = local384;
					Static94.anInt1716 = local406;
					local432 += local60;
					Static405.anInt6805 = local432;
					Static67.aBoolean69 = false;
				}
				@Pc(451) int[] local451 = new int[9];
				local406 = Class6_Sub1_Sub3.anIntArray58[arg2];
				local432 = Class6_Sub1_Sub3.anIntArray56[arg2];
				local463 = Class6_Sub1_Sub3.anIntArray58[arg3];
				local467 = Class6_Sub1_Sub3.anIntArray56[arg3];
				local471 = Class6_Sub1_Sub3.anIntArray58[arg4];
				local475 = Class6_Sub1_Sub3.anIntArray56[arg4];
				local483 = local432 * local471 + 8192 >> 14;
				local491 = local475 * local432 + 8192 >> 14;
				local451[4] = local471 * local406 + 8192 >> 14;
				local451[2] = local406 * local467 + 8192 >> 14;
				local451[3] = local475 * local406 + 8192 >> 14;
				local451[8] = local406 * local463 + 8192 >> 14;
				local451[6] = -local467 * local471 + local491 * local463 + 8192 >> 14;
				local451[0] = local471 * local463 + local467 * local491 + 8192 >> 14;
				local451[1] = local483 * local467 + -local463 * local475 + 8192 >> 14;
				local451[5] = -local432;
				local451[7] = local467 * local475 + local463 * local483 + 8192 >> 14;
				@Pc(621) int local621 = local451[2] * -Static405.anInt6805 + local451[0] * -Static499.anInt8441 + local451[1] * -Static94.anInt1716 + 8192 >> 14;
				local647 = -Static94.anInt1716 * local451[4] + local451[3] * -Static499.anInt8441 + -Static405.anInt6805 * local451[5] + 8192 >> 14;
				local674 = -Static499.anInt8441 * local451[6] + local451[7] * -Static94.anInt1716 + local451[8] * -Static405.anInt6805 + 8192 >> 14;
				local678 = Static499.anInt8441 + local621;
				@Pc(682) int local682 = local647 + Static94.anInt1716;
				local686 = local674 + Static405.anInt6805;
				@Pc(689) int[] local689 = new int[9];
				for (local691 = 0; local691 < 3; local691++) {
					for (local695 = 0; local695 < 3; local695++) {
						local699 = 0;
						for (local701 = 0; local701 < 3; local701++) {
							local699 += arg7[local701 + local695 * 3] * local451[local701 + local691 * 3];
						}
						local689[local691 * 3 + local695] = local699 + 8192 >> 14;
					}
				}
				local695 = local60 * local451[2] + local258 * local451[0] + local54 * local451[1] + 8192 >> 14;
				local699 = local451[5] * local60 + local451[4] * local54 + local451[3] * local258 + 8192 >> 14;
				local701 = local451[8] * local60 + local258 * local451[6] + local54 * local451[7] + 8192 >> 14;
				local695 += local678;
				local699 += local682;
				local701 += local686;
				local833 = new int[9];
				for (local835 = 0; local835 < 3; local835++) {
					for (local839 = 0; local839 < 3; local839++) {
						local843 = 0;
						for (local845 = 0; local845 < 3; local845++) {
							local843 += local689[local845 * 3 + local839] * arg7[local835 * 3 + local845];
						}
						local833[local839 + local835 * 3] = local843 + 8192 >> 14;
					}
				}
				local839 = local699 * arg7[1] + local695 * arg7[0] + arg7[2] * local701 + 8192 >> 14;
				local843 = local701 * arg7[5] + local699 * arg7[4] + local695 * arg7[3] + 8192 >> 14;
				local843 += local32;
				local845 = arg7[8] * local701 + local695 * arg7[6] + local699 * arg7[7] + 8192 >> 14;
				local839 += local24;
				local845 += local38;
				for (local973 = 0; local973 < local8; local973++) {
					@Pc(979) int local979 = arg1[local973];
					if (this.anIntArrayArray57.length > local979) {
						@Pc(989) int[] local989 = this.anIntArrayArray57[local979];
						for (@Pc(991) int local991 = 0; local991 < local989.length; local991++) {
							@Pc(997) int local997 = local989[local991];
							if (this.aShortArray144 == null || (this.aShortArray144[local997] & arg6) != 0) {
								@Pc(1041) int local1041 = this.anIntArray679[local997] * local833[1] + this.anIntArray673[local997] * local833[0] + this.anIntArray674[local997] * local833[2] + 8192 >> 14;
								@Pc(1074) int local1074 = local833[3] * this.anIntArray673[local997] + local833[4] * this.anIntArray679[local997] + this.anIntArray674[local997] * local833[5] + 8192 >> 14;
								@Pc(1078) int local1078 = local1074 + local843;
								@Pc(1082) int local1082 = local1041 + local839;
								@Pc(1113) int local1113 = this.anIntArray674[local997] * local833[8] + this.anIntArray679[local997] * local833[7] + local833[6] * this.anIntArray673[local997] + 8192 >> 14;
								this.anIntArray673[local997] = local1082;
								@Pc(1122) int local1122 = local1113 + local845;
								this.anIntArray679[local997] = local1078;
								this.anIntArray674[local997] = local1122;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2598) Class192 local2598;
			@Pc(2484) boolean local2484;
			@Pc(2593) Class264 local2593;
			if (arg0 == 5) {
				if (this.anIntArrayArray58 != null) {
					local2484 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray58.length) {
							local52 = this.anIntArrayArray58[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray145 == null || (this.aShortArray145[local60] & arg6) != 0) {
									local384 = arg2 * 8 + (this.aByteArray103[local60] & 0xFF);
									if (local384 < 0) {
										local384 = 0;
									} else if (local384 > 255) {
										local384 = 255;
									}
									this.aByteArray103[local60] = (byte) local384;
								}
							}
							local2484 |= local52.length > 0;
						}
					}
					if (local2484) {
						if (this.aClass264Array1 != null) {
							for (local38 = 0; local38 < this.anInt10264; local38++) {
								local2593 = this.aClass264Array1[local38];
								local2598 = this.aClass192Array1[local38];
								local2598.anInt5168 = local2598.anInt5168 & 0xFFFFFF | 255 - (this.aByteArray103[local2593.anInt7438] & 0xFF) << 24;
							}
						}
						this.method8673();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray58 != null) {
					local2484 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray58.length > local38) {
							local52 = this.anIntArrayArray58[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								if (this.aShortArray145 == null || (this.aShortArray145[local60] & arg6) != 0) {
									local384 = this.aShortArray150[local60] & 0xFFFF;
									local406 = local384 >> 10 & 0x3F;
									local432 = local384 >> 7 & 0x7;
									local463 = local384 & 0x7F;
									@Pc(2698) int local2698 = local406 + arg2 & 0x3F;
									local432 += arg3 / 4;
									if (local432 < 0) {
										local432 = 0;
									} else if (local432 > 7) {
										local432 = 7;
									}
									local463 += arg4;
									if (local463 < 0) {
										local463 = 0;
									} else if (local463 > 127) {
										local463 = 127;
									}
									this.aShortArray150[local60] = (short) (local463 | local2698 << 10 | local432 << 7);
								}
							}
							local2484 |= local52.length > 0;
						}
					}
					if (local2484) {
						if (this.aClass264Array1 != null) {
							for (local38 = 0; local38 < this.anInt10264; local38++) {
								local2593 = this.aClass264Array1[local38];
								local2598 = this.aClass192Array1[local38];
								local2598.anInt5168 = local2598.anInt5168 & 0xFF000000 | Static70.anIntArray71[this.aShortArray150[local2593.anInt7438] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method8673();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray56 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray56.length > local32) {
							local256 = this.anIntArrayArray56[local32];
							for (local258 = 0; local258 < local256.length; local258++) {
								local2598 = this.aClass192Array1[local256[local258]];
								local2598.anInt5170 += arg2;
								local2598.anInt5167 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray56 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray56.length > local32) {
							local256 = this.anIntArrayArray56[local32];
							for (local258 = 0; local258 < local256.length; local258++) {
								local2598 = this.aClass192Array1[local256[local258]];
								local2598.anInt5171 = arg2 * local2598.anInt5171 >> 7;
								local2598.anInt5174 = arg3 * local2598.anInt5174 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray56 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray56.length > local32) {
						local256 = this.anIntArrayArray56[local32];
						for (local258 = 0; local258 < local256.length; local258++) {
							local2598 = this.aClass192Array1[local256[local258]];
							local2598.anInt5169 = local2598.anInt5169 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray57.length > local32) {
					local256 = this.anIntArrayArray57[local32];
					for (local258 = 0; local258 < local256.length; local258++) {
						local54 = local256[local258];
						if (this.aShortArray144 == null || (arg6 & this.aShortArray144[local54]) != 0) {
							this.anIntArray673[local54] -= Static499.anInt8441;
							this.anIntArray679[local54] -= Static94.anInt1716;
							this.anIntArray674[local54] -= Static405.anInt6805;
							this.anIntArray673[local54] = arg2 * this.anIntArray673[local54] >> 7;
							this.anIntArray679[local54] = arg3 * this.anIntArray679[local54] >> 7;
							this.anIntArray674[local54] = arg4 * this.anIntArray674[local54] >> 7;
							this.anIntArray673[local54] += Static499.anInt8441;
							this.anIntArray679[local54] += Static94.anInt1716;
							this.anIntArray674[local54] += Static405.anInt6805;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local258 = arg7[12] << 4;
			local54 = arg7[13] << 4;
			local60 = arg7[14] << 4;
			if (Static67.aBoolean69) {
				local384 = arg7[3] * Static94.anInt1716 + Static499.anInt8441 * arg7[0] + Static405.anInt6805 * arg7[6] + 8192 >> 14;
				local406 = arg7[1] * Static499.anInt8441 + Static94.anInt1716 * arg7[4] + Static405.anInt6805 * arg7[7] + 8192 >> 14;
				local432 = Static499.anInt8441 * arg7[2] + arg7[5] * Static94.anInt1716 + Static405.anInt6805 * arg7[8] + 8192 >> 14;
				local406 += local54;
				local384 += local258;
				Static94.anInt1716 = local406;
				local432 += local60;
				Static499.anInt8441 = local384;
				Static67.aBoolean69 = false;
				Static405.anInt6805 = local432;
			}
			local384 = arg2 << 15 >> 7;
			local406 = arg3 << 15 >> 7;
			local432 = arg4 << 15 >> 7;
			local463 = -Static499.anInt8441 * local384 + 8192 >> 14;
			local467 = local406 * -Static94.anInt1716 + 8192 >> 14;
			local471 = local432 * -Static405.anInt6805 + 8192 >> 14;
			local475 = local463 + Static499.anInt8441;
			local483 = Static94.anInt1716 + local467;
			local491 = Static405.anInt6805 + local471;
			@Pc(2013) int[] local2013 = new int[] { local384 * arg7[0] + 8192 >> 14, local384 * arg7[3] + 8192 >> 14, arg7[6] * local384 + 8192 >> 14, arg7[1] * local406 + 8192 >> 14, local406 * arg7[4] + 8192 >> 14, local406 * arg7[7] + 8192 >> 14, arg7[2] * local432 + 8192 >> 14, local432 * arg7[5] + 8192 >> 14, arg7[8] * local432 + 8192 >> 14 };
			local647 = local258 * local384 + 8192 >> 14;
			local674 = local54 * local406 + 8192 >> 14;
			@Pc(2141) int local2141 = local647 + local475;
			local678 = local60 * local432 + 8192 >> 14;
			@Pc(2153) int local2153 = local674 + local483;
			@Pc(2157) int local2157 = local678 + local491;
			@Pc(2160) int[] local2160 = new int[9];
			@Pc(2166) int local2166;
			for (local686 = 0; local686 < 3; local686++) {
				for (local2166 = 0; local2166 < 3; local2166++) {
					local691 = 0;
					for (local695 = 0; local695 < 3; local695++) {
						local691 += arg7[local695 + local686 * 3] * local2013[local695 * 3 + local2166];
					}
					local2160[local686 * 3 + local2166] = local691 + 8192 >> 14;
				}
			}
			local2166 = local2141 * arg7[0] + arg7[1] * local2153 + local2157 * arg7[2] + 8192 >> 14;
			local691 = local2157 * arg7[5] + arg7[3] * local2141 + local2153 * arg7[4] + 8192 >> 14;
			local2166 += local24;
			local695 = arg7[6] * local2141 + local2153 * arg7[7] + local2157 * arg7[8] + 8192 >> 14;
			local691 += local32;
			local695 += local38;
			for (local699 = 0; local699 < local8; local699++) {
				local701 = arg1[local699];
				if (this.anIntArrayArray57.length > local701) {
					local833 = this.anIntArrayArray57[local701];
					for (local835 = 0; local835 < local833.length; local835++) {
						local839 = local833[local835];
						if (this.aShortArray144 == null || (this.aShortArray144[local839] & arg6) != 0) {
							local843 = local2160[0] * this.anIntArray673[local839] + local2160[1] * this.anIntArray679[local839] + this.anIntArray674[local839] * local2160[2] + 8192 >> 14;
							local845 = local2160[4] * this.anIntArray679[local839] + local2160[3] * this.anIntArray673[local839] + this.anIntArray674[local839] * local2160[5] + 8192 >> 14;
							@Pc(2406) int local2406 = local843 + local2166;
							local973 = local2160[8] * this.anIntArray674[local839] + this.anIntArray679[local839] * local2160[7] + this.anIntArray673[local839] * local2160[6] + 8192 >> 14;
							@Pc(2441) int local2441 = local845 + local691;
							this.anIntArray673[local839] = local2406;
							@Pc(2450) int local2450 = local973 + local695;
							this.anIntArray679[local839] = local2441;
							this.anIntArray674[local839] = local2450;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10238; local3++) {
			this.anIntArray674[local3] = -this.anIntArray674[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt10239; local29++) {
			this.aShortArray154[local29] = (short) -this.aShortArray154[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt10291; local48++) {
			@Pc(55) short local55 = this.aShortArray146[local48];
			this.aShortArray146[local48] = this.aShortArray151[local48];
			this.aShortArray151[local48] = local55;
		}
		this.method8680();
		this.method8676();
		this.method8666();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort123 = (short) arg0;
		this.method8673();
	}

	@OriginalMember(owner = "client!vea", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt10262;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIBIIIII)Z")
	private boolean method8668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 < arg4 && arg7 < arg3 && arg7 < arg5) {
			return false;
		} else if (arg4 < arg7 && arg3 < arg7 && arg7 > arg5) {
			return false;
		} else if (arg2 < arg0 && arg1 > arg2 && arg2 < arg6) {
			return false;
		} else {
			return arg2 <= arg0 || arg2 <= arg1 || arg2 <= arg6;
		}
	}

	@OriginalMember(owner = "client!vea", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort124 = (short) arg0;
		this.method8680();
		this.method8676();
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "(B)V")
	private void method8669() {
		if (this.anInt10252 == 0) {
			return;
		}
		if (this.method8675() && this.method8670()) {
			this.aClass132_Sub1_23.method7529(this.aClass181_3.anInterface12_5, 0);
			this.aClass132_Sub1_23.method7529(this.aClass181_1.anInterface12_5, 1);
			this.aClass132_Sub1_23.method7529(this.aClass181_2.anInterface12_5, 2);
			@Pc(62) boolean local62;
			if ((this.anInt10281 & 0x37) == 0) {
				this.aClass132_Sub1_23.method7536(false);
				local62 = false;
				this.aClass132_Sub1_23.method7628(this.aClass132_Sub1_23.aClass34_16);
			} else {
				local62 = true;
				this.aClass132_Sub1_23.method7536(true);
				this.aClass132_Sub1_23.method7529(this.aClass181_4.anInterface12_5, 3);
				this.aClass132_Sub1_23.method7628(this.aClass132_Sub1_23.aClass34_19);
			}
			for (@Pc(95) int local95 = 0; local95 < this.anIntArray677.length; local95++) {
				@Pc(102) int local102 = this.anIntArray675[local95];
				@Pc(109) int local109 = this.anIntArray675[local95 + 1];
				@Pc(116) int local116 = this.aShortArray148[local102] & 0xFFFF;
				if (local116 == 65535) {
					local116 = -1;
				}
				this.aClass132_Sub1_23.method7610(true, local62, local116);
				this.aClass132_Sub1_23.method7573(local102 * 3, Static122.aClass60_1, this.aClass95_1.anInterface21_2, local109 - local102, this.anIntArray677[local95], this.anIntArray678[local95]);
			}
		}
		this.method8667();
	}

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "(I)Z")
	private boolean method8670() {
		if (this.aClass95_1.aBoolean154) {
			return true;
		}
		if (this.aClass95_1.anInterface21_3 == null) {
			this.aClass95_1.anInterface21_3 = this.aClass132_Sub1_23.method7532(this.aBoolean717);
		}
		@Pc(28) Interface21 local28 = this.aClass95_1.anInterface21_3;
		local28.method5800(this.anInt10252 * 6);
		@Pc(46) Buffer local46 = local28.method5806();
		if (local46 != null) {
			@Pc(56) Stream local56 = this.aClass132_Sub1_23.method7592(local46);
			@Pc(60) int local60;
			if (Stream.b()) {
				for (local60 = 0; local60 < this.anInt10252; local60++) {
					local56.b(this.aShortArray146[local60]);
					local56.b(this.aShortArray149[local60]);
					local56.b(this.aShortArray151[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt10252; local60++) {
					local56.c(this.aShortArray146[local60]);
					local56.c(this.aShortArray149[local60]);
					local56.c(this.aShortArray151[local60]);
				}
			}
			local56.c();
			if (local28.method5808()) {
				this.aBoolean720 = true;
				this.aClass95_1.anInterface21_2 = local28;
				this.aClass95_1.aBoolean154 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ua;B)V")
	private void method8671(@OriginalArg(0) Class6_Sub4_Sub5_Sub2 arg0) {
		if (Static468.anIntArray530.length < this.anInt10239) {
			Static468.anIntArray530 = new int[this.anInt10239];
			Static416.anIntArray445 = new int[this.anInt10239];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(24) int local24 = 0; local24 < this.anInt10238; local24++) {
			local51 = (this.anIntArray673[local24] - (this.anIntArray679[local24] * this.aClass132_Sub1_23.anInt8968 >> 8) >> this.aClass132_Sub1_23.anInt8967) - arg0.anInt9646;
			@Pc(76) int local76 = (this.anIntArray674[local24] - (this.anIntArray679[local24] * this.aClass132_Sub1_23.anInt8979 >> 8) >> this.aClass132_Sub1_23.anInt8967) - arg0.anInt9645;
			@Pc(81) int local81 = this.anIntArray676[local24];
			@Pc(88) int local88 = this.anIntArray676[local24 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray152[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static468.anIntArray530[local99] = local51;
				Static416.anIntArray445[local99] = local76;
			}
		}
		for (local51 = 0; local51 < this.anInt10252; local51++) {
			if (this.aByteArray103 == null || this.aByteArray103[local51] <= 128) {
				@Pc(143) short local143 = this.aShortArray146[local51];
				@Pc(148) short local148 = this.aShortArray149[local51];
				@Pc(153) short local153 = this.aShortArray151[local51];
				local90 = Static468.anIntArray530[local143];
				local99 = Static468.anIntArray530[local148];
				@Pc(165) int local165 = Static468.anIntArray530[local153];
				@Pc(169) int local169 = Static416.anIntArray445[local143];
				@Pc(173) int local173 = Static416.anIntArray445[local148];
				@Pc(177) int local177 = Static416.anIntArray445[local153];
				if ((local173 - local177) * (local90 - local99) - (local165 - local99) * (-local169 + local173) > 0) {
					arg0.method8140(local99, local173, local165, local90, local169, local177);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort123;
	}

	@OriginalMember(owner = "client!vea", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10238; local15++) {
			@Pc(34) int local34 = this.anIntArray679[local15] * local13 - local9 * this.anIntArray674[local15] >> 14;
			this.anIntArray674[local15] = local9 * this.anIntArray679[local15] + local13 * this.anIntArray674[local15] >> 14;
			this.anIntArray679[local15] = local34;
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class184 method8660(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(16) Class184_Sub3 local16;
		@Pc(12) Class184_Sub3 local12;
		if (arg0 == 1) {
			local12 = this.aClass132_Sub1_23.aClass184_Sub3_30;
			local16 = this.aClass132_Sub1_23.aClass184_Sub3_22;
		} else if (arg0 == 2) {
			local16 = this.aClass132_Sub1_23.aClass184_Sub3_27;
			local12 = this.aClass132_Sub1_23.aClass184_Sub3_23;
		} else if (arg0 == 3) {
			local16 = this.aClass132_Sub1_23.aClass184_Sub3_26;
			local12 = this.aClass132_Sub1_23.aClass184_Sub3_21;
		} else if (arg0 == 4) {
			local12 = this.aClass132_Sub1_23.aClass184_Sub3_24;
			local16 = this.aClass132_Sub1_23.aClass184_Sub3_28;
		} else if (arg0 == 5) {
			local12 = this.aClass132_Sub1_23.aClass184_Sub3_29;
			local16 = this.aClass132_Sub1_23.aClass184_Sub3_25;
		} else {
			local16 = local12 = new Class184_Sub3(this.aClass132_Sub1_23, 0, 0, true, false);
		}
		return this.method8679(local12, local16, arg0 != 0, arg1, arg2);
	}

	@OriginalMember(owner = "client!vea", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10285;
	}

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "()V")
	@Override
	protected void method8665() {
	}

	@OriginalMember(owner = "client!vea", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean718;
	}

	@OriginalMember(owner = "client!vea", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray57 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt10245; local12++) {
			this.anIntArray673[local12] <<= 0x4;
			this.anIntArray679[local12] <<= 0x4;
			this.anIntArray674[local12] <<= 0x4;
		}
		Static499.anInt8441 = 0;
		Static405.anInt6805 = 0;
		Static94.anInt1716 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vea", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10278;
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "(B)V")
	private void method8672() {
		if (this.aClass264Array1 == null) {
			return;
		}
		this.aClass132_Sub1_23.C(!this.aBoolean721);
		this.aClass132_Sub1_23.method7536(false);
		this.aClass132_Sub1_23.method7552(Static583.aClass378_3, 1);
		this.aClass132_Sub1_23.method7598(1, Static583.aClass378_3);
		for (@Pc(46) int local46 = 0; local46 < this.anInt10264; local46++) {
			@Pc(53) Class264 local53 = this.aClass264Array1[local46];
			@Pc(58) Class192 local58 = this.aClass192Array1[local46];
			if (!local53.aBoolean499 || !this.aClass132_Sub1_23.method7466()) {
				@Pc(86) float local86 = (float) (this.anIntArray673[local53.anInt7434] + this.anIntArray673[local53.anInt7437] + this.anIntArray673[local53.anInt7436]) * 0.3333333F;
				@Pc(107) float local107 = (float) (this.anIntArray679[local53.anInt7437] + this.anIntArray679[local53.anInt7436] + this.anIntArray679[local53.anInt7434]) * 0.3333333F;
				@Pc(128) float local128 = (float) (this.anIntArray674[local53.anInt7437] + this.anIntArray674[local53.anInt7436] + this.anIntArray674[local53.anInt7434]) * 0.3333333F;
				@Pc(142) float local142 = Static619.aFloat196 * local128 + local86 * Static636.aFloat199 + Static93.aFloat113 * local107 + Static395.aFloat77;
				@Pc(156) float local156 = Static303.aFloat34 + local86 * Static416.aFloat112 + Static389.aFloat76 * local107 + Static397.aFloat79 * local128;
				@Pc(170) float local170 = Static219.aFloat22 + local128 * Static655.aFloat201 + Static187.aFloat18 * local107 + Static234.aFloat29 * local86;
				@Pc(191) float local191 = (float) (1.0D / Math.sqrt((double) (local142 * local142 + local156 * local156 + local170 * local170))) * (float) local53.anInt7435;
				@Pc(196) Class207_Sub3 local196 = this.aClass132_Sub1_23.method7609();
				local196.method8220(local170 - local170 * local191, local58.anInt5174 * local53.aShort93 >> 7, local58.anInt5171 * local53.aShort95 >> 7, (float) local58.anInt5170 + local142 - local191 * local142, -(local191 * local156) + local156 + (float) local58.anInt5167, local58.anInt5169);
				local196.method8237(this.aClass132_Sub1_23.aClass207_Sub3_17);
				this.aClass132_Sub1_23.method7571();
				@Pc(254) int local254 = local58.anInt5168;
				this.aClass132_Sub1_23.method7610(false, false, local53.aShort94);
				this.aClass132_Sub1_23.method7547(local53.aByte110);
				this.aClass132_Sub1_23.method7611(local254);
				this.aClass132_Sub1_23.method7543();
			}
		}
		this.aClass132_Sub1_23.method7598(1, Static648.aClass378_4);
		this.aClass132_Sub1_23.method7552(Static648.aClass378_4, 1);
		this.aClass132_Sub1_23.C(true);
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IILclient!oo;ZI)Z")
	@Override
	public boolean method8656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method8674(arg1, arg3, arg0, arg2, arg4, -1);
	}

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "(I)V")
	private void method8673() {
		if (this.aClass181_1 != null) {
			this.aClass181_1.aBoolean307 = false;
		}
	}

	@OriginalMember(owner = "client!vea", name = "c", descriptor = "()V")
	@Override
	protected void method8647() {
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IZIILclient!oo;II)Z")
	private boolean method8674(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class207 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class207_Sub3 local8 = (Class207_Sub3) arg3;
		@Pc(12) Class207_Sub3 local12 = this.aClass132_Sub1_23.aClass207_Sub3_16;
		@Pc(33) float local33 = local12.aFloat193 + local12.aFloat194 * local8.aFloat193 + local12.aFloat184 * local8.aFloat189 + local12.aFloat186 * local8.aFloat188;
		@Pc(54) float local54 = local12.aFloat189 + local8.aFloat188 * local12.aFloat185 + local12.aFloat190 * local8.aFloat193 + local8.aFloat189 * local12.aFloat187;
		Static397.aFloat79 = local12.aFloat187 * local8.aFloat185 + local12.aFloat190 * local8.aFloat186 + local8.aFloat183 * local12.aFloat185;
		Static655.aFloat201 = local12.aFloat183 * local8.aFloat183 + local12.aFloat192 * local8.aFloat185 + local8.aFloat186 * local12.aFloat191;
		Static187.aFloat18 = local8.aFloat187 * local12.aFloat192 + local12.aFloat191 * local8.aFloat184 + local8.aFloat192 * local12.aFloat183;
		Static389.aFloat76 = local12.aFloat187 * local8.aFloat187 + local12.aFloat190 * local8.aFloat184 + local12.aFloat185 * local8.aFloat192;
		Static619.aFloat196 = local8.aFloat183 * local12.aFloat186 + local12.aFloat194 * local8.aFloat186 + local12.aFloat184 * local8.aFloat185;
		Static93.aFloat113 = local8.aFloat184 * local12.aFloat194 + local12.aFloat184 * local8.aFloat187 + local8.aFloat192 * local12.aFloat186;
		Static636.aFloat199 = local12.aFloat194 * local8.aFloat194 + local12.aFloat184 * local8.aFloat190 + local12.aFloat186 * local8.aFloat191;
		Static234.aFloat29 = local8.aFloat194 * local12.aFloat191 + local8.aFloat190 * local12.aFloat192 + local12.aFloat183 * local8.aFloat191;
		Static416.aFloat112 = local12.aFloat187 * local8.aFloat190 + local12.aFloat190 * local8.aFloat194 + local12.aFloat185 * local8.aFloat191;
		@Pc(237) float local237 = local12.aFloat188 + local8.aFloat189 * local12.aFloat192 + local8.aFloat193 * local12.aFloat191 + local8.aFloat188 * local12.aFloat183;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass132_Sub1_23.anInt8991;
		@Pc(255) int local255 = this.aClass132_Sub1_23.anInt8978;
		if (!this.aBoolean719) {
			this.method8682();
		}
		@Pc(269) int local269 = this.anInt10259 - this.anInt10255 >> 1;
		@Pc(278) int local278 = this.anInt10285 - this.anInt10278 >> 1;
		@Pc(287) int local287 = this.anInt10247 - this.anInt10288 >> 1;
		@Pc(293) int local293 = this.anInt10255 + local269;
		@Pc(298) int local298 = local278 + this.anInt10278;
		@Pc(303) int local303 = local287 + this.anInt10288;
		@Pc(309) int local309 = local293 - (local269 << arg4);
		@Pc(315) int local315 = local298 - (local278 << arg4);
		@Pc(322) int local322 = local303 - (local287 << arg4);
		@Pc(328) int local328 = (local269 << arg4) + local293;
		@Pc(334) int local334 = (local278 << arg4) + local298;
		Static30.anIntArray42[0] = local309;
		@Pc(344) int local344 = (local287 << arg4) + local303;
		Static390.anIntArray415[0] = local315;
		Static30.anIntArray42[1] = local328;
		Static64.anIntArray64[0] = local322;
		Static390.anIntArray415[1] = local315;
		Static64.anIntArray64[1] = local322;
		Static30.anIntArray42[2] = local309;
		Static390.anIntArray415[2] = local334;
		Static30.anIntArray42[3] = local328;
		Static64.anIntArray64[2] = local322;
		Static390.anIntArray415[3] = local334;
		Static30.anIntArray42[4] = local309;
		Static64.anIntArray64[3] = local322;
		Static390.anIntArray415[4] = local315;
		Static64.anIntArray64[4] = local344;
		Static30.anIntArray42[5] = local328;
		Static390.anIntArray415[5] = local315;
		Static64.anIntArray64[5] = local344;
		Static30.anIntArray42[6] = local309;
		Static390.anIntArray415[6] = local334;
		Static64.anIntArray64[6] = local344;
		Static30.anIntArray42[7] = local328;
		Static390.anIntArray415[7] = local334;
		Static64.anIntArray64[7] = local344;
		@Pc(483) float local483;
		@Pc(497) float local497;
		@Pc(469) float local469;
		@Pc(450) float local450;
		@Pc(455) float local455;
		@Pc(445) float local445;
		for (@Pc(438) int local438 = 0; local438 < 8; local438++) {
			local445 = (float) Static64.anIntArray64[local438];
			local450 = (float) Static30.anIntArray42[local438];
			local455 = (float) Static390.anIntArray415[local438];
			local469 = local237 + Static655.aFloat201 * local445 + local450 * Static234.aFloat29 + Static187.aFloat18 * local455;
			local483 = Static619.aFloat196 * local445 + Static93.aFloat113 * local455 + Static636.aFloat199 * local450 + local33;
			local497 = local54 + Static397.aFloat79 * local445 + Static416.aFloat112 * local450 + local455 * Static389.aFloat76;
			if ((float) this.aClass132_Sub1_23.bf <= local469) {
				if (arg5 > 0) {
					local469 = (float) arg5;
				}
				@Pc(521) float local521 = (float) this.aClass132_Sub1_23.anInt8975 + local483 * (float) local251 / local469;
				@Pc(533) float local533 = local497 * (float) local255 / local469 + (float) this.aClass132_Sub1_23.anInt9003;
				if (local241 > local521) {
					local241 = local521;
				}
				if (local243 < local521) {
					local243 = local521;
				}
				if (local247 < local533) {
					local247 = local533;
				}
				if (local245 > local533) {
					local245 = local533;
				}
				local239 = true;
			}
		}
		if (local239 && (float) arg2 > local241 && (float) arg2 < local243 && local245 < (float) arg0 && (float) arg0 < local247) {
			if (arg1) {
				return true;
			}
			if (this.anInt10239 > Static468.anIntArray530.length) {
				Static468.anIntArray530 = new int[this.anInt10239];
				Static416.anIntArray445 = new int[this.anInt10239];
			}
			@Pc(682) int local682;
			for (@Pc(608) int local608 = 0; local608 < this.anInt10238; local608++) {
				local450 = (float) this.anIntArray673[local608];
				local445 = (float) this.anIntArray674[local608];
				local455 = (float) this.anIntArray679[local608];
				local483 = local33 + Static636.aFloat199 * local450 + Static93.aFloat113 * local455 + local445 * Static619.aFloat196;
				local469 = Static187.aFloat18 * local455 + Static234.aFloat29 * local450 + local445 * Static655.aFloat201 + local237;
				local497 = local54 + Static397.aFloat79 * local445 + local450 * Static416.aFloat112 + local455 * Static389.aFloat76;
				@Pc(689) int local689;
				@Pc(691) int local691;
				@Pc(700) int local700;
				if (local469 >= (float) this.aClass132_Sub1_23.bf) {
					if (arg5 > 0) {
						local469 = (float) arg5;
					}
					local682 = (int) ((float) this.aClass132_Sub1_23.anInt8975 + (float) local251 * local483 / local469);
					local689 = (int) ((float) local255 * local497 / local469 + (float) this.aClass132_Sub1_23.anInt9003);
					local691 = this.anIntArray676[local608];
					local700 = this.anIntArray676[local608 + 1];
					for (@Pc(766) int local766 = local691; local766 < local700; local766++) {
						@Pc(775) int local775 = this.aShortArray152[local766] - 1;
						if (local775 == -1) {
							break;
						}
						Static468.anIntArray530[local775] = local682;
						Static416.anIntArray445[local775] = local689;
					}
				} else {
					local682 = this.anIntArray676[local608];
					local689 = this.anIntArray676[local608 + 1];
					for (local691 = local682; local691 < local689; local691++) {
						local700 = this.aShortArray152[local691] - 1;
						if (local700 == -1) {
							break;
						}
						Static468.anIntArray530[this.aShortArray152[local691] - 1] = -999999;
					}
				}
			}
			for (local682 = 0; local682 < this.anInt10291; local682++) {
				if (Static468.anIntArray530[this.aShortArray146[local682]] != -999999 && Static468.anIntArray530[this.aShortArray149[local682]] != -999999 && Static468.anIntArray530[this.aShortArray151[local682]] != -999999 && this.method8668(Static468.anIntArray530[this.aShortArray146[local682]], Static468.anIntArray530[this.aShortArray149[local682]], arg2, Static416.anIntArray445[this.aShortArray149[local682]], Static416.anIntArray445[this.aShortArray146[local682]], Static416.anIntArray445[this.aShortArray151[local682]], Static468.anIntArray530[this.aShortArray151[local682]], arg0)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt10291; local7++) {
			local16 = this.aShortArray150[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 -= -(arg3 * (arg1 - local28) >> 7);
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			@Pc(63) int local63 = local16 & 0x7F;
			if (arg2 != -1) {
				local63 += (arg2 - local63) * arg3 >> 7;
			}
			this.aShortArray150[local7] = (short) (local63 | local28 << 7 | local22 << 10);
		}
		if (this.aClass264Array1 != null) {
			for (local16 = 0; local16 < this.anInt10264; local16++) {
				@Pc(112) Class264 local112 = this.aClass264Array1[local16];
				@Pc(117) Class192 local117 = this.aClass192Array1[local16];
				local117.anInt5168 = local117.anInt5168 & 0xFF000000 | Static70.anIntArray71[this.aShortArray150[local112.anInt7438] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method8673();
	}

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "(B)Z")
	private boolean method8675() {
		@Pc(13) boolean local13 = !this.aClass181_1.aBoolean307;
		@Pc(26) boolean local26 = (this.anInt10281 & 0x37) != 0 && !this.aClass181_4.aBoolean307;
		@Pc(34) boolean local34 = !this.aClass181_3.aBoolean307;
		@Pc(42) boolean local42 = !this.aClass181_2.aBoolean307;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface12 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass181_3.anInterface12_4 == null) {
				this.aClass181_3.anInterface12_4 = this.aClass132_Sub1_23.method7564(this.aBoolean717);
			}
			local73 = this.aClass181_3.anInterface12_4;
			local73.method8889(this.anInt10239 * 12, 12);
			local87 = local73.method8888();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass132_Sub1_23.aNativeInterface3.copyPositions(this.anIntArray673, this.anIntArray679, this.anIntArray674, this.aShortArray153, 0, 12, this.anInt10239, local87.getAddress());
				if (local73.method8891()) {
					this.aClass181_3.aBoolean307 = true;
					this.aClass181_3.anInterface12_5 = local73;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(182) short[] local182;
		@Pc(186) short[] local186;
		@Pc(190) short[] local190;
		@Pc(178) byte[] local178;
		if (local13) {
			if (this.aClass181_1.anInterface12_4 == null) {
				this.aClass181_1.anInterface12_4 = this.aClass132_Sub1_23.method7564(this.aBoolean717);
			}
			local73 = this.aClass181_1.anInterface12_4;
			local73.method8889(this.anInt10239 * 4, 4);
			local87 = local73.method8888();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt10281 & 0x37) == 0) {
					if (this.lb == null) {
						local190 = this.aShortArray154;
						local182 = this.aShortArray156;
						local186 = this.aShortArray155;
						local178 = this.aByteArray102;
					} else {
						local178 = this.lb.aByteArray17;
						local182 = this.lb.aShortArray33;
						local186 = this.lb.aShortArray31;
						local190 = this.lb.aShortArray32;
					}
					this.aClass132_Sub1_23.aNativeInterface3.copyLighting(this.aShortArray150, this.aByteArray103, this.aShortArray148, local182, local186, local190, local178, this.aShort123, this.aShort124, this.aShortArray147, 0, 4, this.anInt10239, local87.getAddress());
				} else {
					this.aClass132_Sub1_23.aNativeInterface3.copyColours(this.aShortArray150, this.aByteArray103, this.aShortArray148, this.aShort123, this.aShortArray147, 0, 4, this.anInt10239, local87.getAddress());
				}
				if (local73.method8891()) {
					this.aClass181_1.anInterface12_5 = local73;
					this.aClass181_1.aBoolean307 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass181_4.anInterface12_4 == null) {
				this.aClass181_4.anInterface12_4 = this.aClass132_Sub1_23.method7564(this.aBoolean717);
			}
			local73 = this.aClass181_4.anInterface12_4;
			local73.method8889(this.anInt10239 * 12, 12);
			local87 = local73.method8888();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.lb == null) {
					local190 = this.aShortArray154;
					local186 = this.aShortArray155;
					local178 = this.aByteArray102;
					local182 = this.aShortArray156;
				} else {
					local178 = this.lb.aByteArray17;
					local190 = this.lb.aShortArray32;
					local182 = this.lb.aShortArray33;
					local186 = this.lb.aShortArray31;
				}
				this.aClass132_Sub1_23.aNativeInterface3.copyNormals(local182, local186, local190, local178, 3.0F / (float) this.aShort124, 3.0F / (float) (this.aShort124 / 2 + this.aShort124), 0, 12, this.anInt10239, local87.getAddress());
				if (local73.method8891()) {
					this.aClass181_4.anInterface12_5 = local73;
					this.aClass181_4.aBoolean307 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass181_2.anInterface12_4 == null) {
				this.aClass181_2.anInterface12_4 = this.aClass132_Sub1_23.method7564(this.aBoolean717);
			}
			local73 = this.aClass181_2.anInterface12_4;
			local73.method8889(this.anInt10239 * 8, 8);
			local87 = local73.method8888();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass132_Sub1_23.aNativeInterface3.copyTexCoords(this.aFloatArray75, this.aFloatArray74, 0, 8, this.anInt10239, local87.getAddress());
				if (local73.method8891()) {
					this.aClass181_2.anInterface12_5 = local73;
					this.aClass181_2.aBoolean307 = true;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!vea", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10247;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "()[Lclient!mb;")
	@Override
	public Class218[] method8643() {
		return this.aClass218Array5;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8650(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(63) int local63;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(41) int local41;
		@Pc(55) int[] local55;
		@Pc(57) int local57;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static405.anInt6805 = 0;
			local29 = 0;
			Static94.anInt1716 = 0;
			Static499.anInt8441 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray57.length) {
					local55 = this.anIntArrayArray57[local41];
					for (local57 = 0; local57 < local55.length; local57++) {
						local63 = local55[local57];
						Static499.anInt8441 += this.anIntArray673[local63];
						Static94.anInt1716 += this.anIntArray679[local63];
						Static405.anInt6805 += this.anIntArray674[local63];
						local29++;
					}
				}
			}
			if (local29 <= 0) {
				Static499.anInt8441 = local21;
				Static405.anInt6805 = local17;
				Static94.anInt1716 = local25;
			} else {
				Static499.anInt8441 = local21 + Static499.anInt8441 / local29;
				Static405.anInt6805 = Static405.anInt6805 / local29 + local17;
				Static94.anInt1716 = Static94.anInt1716 / local29 + local25;
			}
			return;
		}
		@Pc(166) int[] local166;
		@Pc(168) int local168;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local25 = arg3 << 4;
			local21 = arg2 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray57.length > local35) {
					local166 = this.anIntArrayArray57[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local57 = local166[local168];
						this.anIntArray673[local57] += local21;
						this.anIntArray679[local57] += local25;
						this.anIntArray674[local57] += local17;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(301) int local301;
		@Pc(754) int local754;
		@Pc(763) int local763;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray57.length > local35) {
					local166 = this.anIntArrayArray57[local35];
					if ((arg5 & 0x1) == 0) {
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							this.anIntArray673[local57] -= Static499.anInt8441;
							this.anIntArray679[local57] -= Static94.anInt1716;
							this.anIntArray674[local57] -= Static405.anInt6805;
							if (arg4 != 0) {
								local63 = Class6_Sub1_Sub3.anIntArray56[arg4];
								local282 = Class6_Sub1_Sub3.anIntArray58[arg4];
								local301 = local282 * this.anIntArray673[local57] + local63 * this.anIntArray679[local57] + 16383 >> 14;
								this.anIntArray679[local57] = this.anIntArray679[local57] * local282 + 16383 - local63 * this.anIntArray673[local57] >> 14;
								this.anIntArray673[local57] = local301;
							}
							if (arg2 != 0) {
								local63 = Class6_Sub1_Sub3.anIntArray56[arg2];
								local282 = Class6_Sub1_Sub3.anIntArray58[arg2];
								local301 = this.anIntArray679[local57] * local282 + 16383 - this.anIntArray674[local57] * local63 >> 14;
								this.anIntArray674[local57] = local282 * this.anIntArray674[local57] + local63 * this.anIntArray679[local57] + 16383 >> 14;
								this.anIntArray679[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class6_Sub1_Sub3.anIntArray56[arg3];
								local282 = Class6_Sub1_Sub3.anIntArray58[arg3];
								local301 = this.anIntArray673[local57] * local282 + local63 * this.anIntArray674[local57] + 16383 >> 14;
								this.anIntArray674[local57] = this.anIntArray674[local57] * local282 + 16383 - local63 * this.anIntArray673[local57] >> 14;
								this.anIntArray673[local57] = local301;
							}
							this.anIntArray673[local57] += Static499.anInt8441;
							this.anIntArray679[local57] += Static94.anInt1716;
							this.anIntArray674[local57] += Static405.anInt6805;
						}
					} else {
						for (local168 = 0; local168 < local166.length; local168++) {
							local57 = local166[local168];
							this.anIntArray673[local57] -= Static499.anInt8441;
							this.anIntArray679[local57] -= Static94.anInt1716;
							this.anIntArray674[local57] -= Static405.anInt6805;
							if (arg2 != 0) {
								local63 = Class6_Sub1_Sub3.anIntArray56[arg2];
								local282 = Class6_Sub1_Sub3.anIntArray58[arg2];
								local301 = this.anIntArray679[local57] * local282 + 16383 - this.anIntArray674[local57] * local63 >> 14;
								this.anIntArray674[local57] = local282 * this.anIntArray674[local57] + local63 * this.anIntArray679[local57] + 16383 >> 14;
								this.anIntArray679[local57] = local301;
							}
							if (arg4 != 0) {
								local63 = Class6_Sub1_Sub3.anIntArray56[arg4];
								local282 = Class6_Sub1_Sub3.anIntArray58[arg4];
								local301 = this.anIntArray679[local57] * local63 + local282 * this.anIntArray673[local57] + 16383 >> 14;
								this.anIntArray679[local57] = this.anIntArray679[local57] * local282 + 16383 - this.anIntArray673[local57] * local63 >> 14;
								this.anIntArray673[local57] = local301;
							}
							if (arg3 != 0) {
								local63 = Class6_Sub1_Sub3.anIntArray56[arg3];
								local282 = Class6_Sub1_Sub3.anIntArray58[arg3];
								local301 = local63 * this.anIntArray674[local57] + this.anIntArray673[local57] * local282 + 16383 >> 14;
								this.anIntArray674[local57] = local282 * this.anIntArray674[local57] + 16383 - local63 * this.anIntArray673[local57] >> 14;
								this.anIntArray673[local57] = local301;
							}
							this.anIntArray673[local57] += Static499.anInt8441;
							this.anIntArray679[local57] += Static94.anInt1716;
							this.anIntArray674[local57] += Static405.anInt6805;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (this.anIntArrayArray57.length > local41) {
						local55 = this.anIntArrayArray57[local41];
						for (local57 = 0; local57 < local55.length; local57++) {
							local63 = local55[local57];
							local282 = this.anIntArray676[local63];
							local301 = this.anIntArray676[local63 + 1];
							for (local754 = local282; local754 < local301; local754++) {
								local763 = this.aShortArray152[local754] - 1;
								if (local763 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(795) int local795;
								if (arg4 != 0) {
									local772 = Class6_Sub1_Sub3.anIntArray56[arg4];
									local776 = Class6_Sub1_Sub3.anIntArray58[arg4];
									local795 = this.aShortArray155[local763] * local772 + this.aShortArray156[local763] * local776 + 16383 >> 14;
									this.aShortArray155[local763] = (short) (this.aShortArray155[local763] * local776 + 16383 - this.aShortArray156[local763] * local772 >> 14);
									this.aShortArray156[local763] = (short) local795;
								}
								if (arg2 != 0) {
									local772 = Class6_Sub1_Sub3.anIntArray56[arg2];
									local776 = Class6_Sub1_Sub3.anIntArray58[arg2];
									local795 = this.aShortArray155[local763] * local776 + 16383 - local772 * this.aShortArray154[local763] >> 14;
									this.aShortArray154[local763] = (short) (local772 * this.aShortArray155[local763] + local776 * this.aShortArray154[local763] + 16383 >> 14);
									this.aShortArray155[local763] = (short) local795;
								}
								if (arg3 != 0) {
									local772 = Class6_Sub1_Sub3.anIntArray56[arg3];
									local776 = Class6_Sub1_Sub3.anIntArray58[arg3];
									local795 = local776 * this.aShortArray156[local763] + this.aShortArray154[local763] * local772 + 16383 >> 14;
									this.aShortArray154[local763] = (short) (this.aShortArray154[local763] * local776 + 16383 - this.aShortArray156[local763] * local772 >> 14);
									this.aShortArray156[local763] = (short) local795;
								}
							}
						}
					}
				}
				this.method8676();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray57.length > local35) {
					local166 = this.anIntArrayArray57[local35];
					for (local168 = 0; local168 < local166.length; local168++) {
						local57 = local166[local168];
						this.anIntArray673[local57] -= Static499.anInt8441;
						this.anIntArray679[local57] -= Static94.anInt1716;
						this.anIntArray674[local57] -= Static405.anInt6805;
						this.anIntArray673[local57] = this.anIntArray673[local57] * arg2 >> 7;
						this.anIntArray679[local57] = arg3 * this.anIntArray679[local57] >> 7;
						this.anIntArray674[local57] = arg4 * this.anIntArray674[local57] >> 7;
						this.anIntArray673[local57] += Static499.anInt8441;
						this.anIntArray679[local57] += Static94.anInt1716;
						this.anIntArray674[local57] += Static405.anInt6805;
					}
				}
			}
		} else {
			@Pc(1202) Class192 local1202;
			@Pc(1104) boolean local1104;
			@Pc(1197) Class264 local1197;
			if (arg0 == 5) {
				if (this.anIntArrayArray58 != null) {
					local1104 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray58.length) {
							local55 = this.anIntArrayArray58[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local282 = (this.aByteArray103[local63] & 0xFF) + arg2 * 8;
								if (local282 < 0) {
									local282 = 0;
								} else if (local282 > 255) {
									local282 = 255;
								}
								this.aByteArray103[local63] = (byte) local282;
							}
							local1104 |= local55.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass264Array1 != null) {
							for (local41 = 0; local41 < this.anInt10264; local41++) {
								local1197 = this.aClass264Array1[local41];
								local1202 = this.aClass192Array1[local41];
								local1202.anInt5168 = 255 - (this.aByteArray103[local1197.anInt7438] & 0xFF) << 24 | local1202.anInt5168 & 0xFFFFFF;
							}
						}
						this.method8673();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray58 != null) {
					local1104 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray58.length > local41) {
							local55 = this.anIntArrayArray58[local41];
							for (local57 = 0; local57 < local55.length; local57++) {
								local63 = local55[local57];
								local282 = this.aShortArray150[local63] & 0xFFFF;
								local301 = local282 >> 10 & 0x3F;
								local754 = local282 >> 7 & 0x7;
								@Pc(1293) int local1293 = arg2 + local301 & 0x3F;
								local763 = local282 & 0x7F;
								local754 += arg3 / 4;
								local763 += arg4;
								if (local754 < 0) {
									local754 = 0;
								} else if (local754 > 7) {
									local754 = 7;
								}
								if (local763 < 0) {
									local763 = 0;
								} else if (local763 > 127) {
									local763 = 127;
								}
								this.aShortArray150[local63] = (short) (local763 | local1293 << 10 | local754 << 7);
							}
							local1104 |= local55.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass264Array1 != null) {
							for (local41 = 0; local41 < this.anInt10264; local41++) {
								local1197 = this.aClass264Array1[local41];
								local1202 = this.aClass192Array1[local41];
								local1202.anInt5168 = Static70.anIntArray71[this.aShortArray150[local1197.anInt7438] & 0xFFFF] & 0xFFFFFF | local1202.anInt5168 & 0xFF000000;
							}
						}
						this.method8673();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray56 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray56.length) {
							local166 = this.anIntArrayArray56[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1202 = this.aClass192Array1[local166[local168]];
								local1202.anInt5170 += arg2;
								local1202.anInt5167 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray56 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray56.length) {
							local166 = this.anIntArrayArray56[local35];
							for (local168 = 0; local168 < local166.length; local168++) {
								local1202 = this.aClass192Array1[local166[local168]];
								local1202.anInt5174 = arg3 * local1202.anInt5174 >> 7;
								local1202.anInt5171 = arg2 * local1202.anInt5171 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray56 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray56.length > local35) {
						local166 = this.anIntArrayArray56[local35];
						for (local168 = 0; local168 < local166.length; local168++) {
							local1202 = this.aClass192Array1[local166[local168]];
							local1202.anInt5169 = local1202.anInt5169 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!oo;)V")
	@Override
	public void method8659(@OriginalArg(0) Class207 arg0) {
		@Pc(8) Class207_Sub3 local8 = (Class207_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass100Array5 != null) {
			for (local13 = 0; local13 < this.aClass100Array5.length; local13++) {
				@Pc(20) Class100 local20 = this.aClass100Array5[local13];
				@Pc(22) Class100 local22 = local20;
				if (local20.aClass100_2 != null) {
					local22 = local20.aClass100_2;
				}
				local22.anInt2513 = (int) ((float) this.anIntArray679[local20.anInt2508] * local8.aFloat184 + (float) this.anIntArray673[local20.anInt2508] * local8.aFloat194 + local8.aFloat186 * (float) this.anIntArray674[local20.anInt2508] + local8.aFloat193);
				local22.anInt2512 = (int) (local8.aFloat185 * (float) this.anIntArray674[local20.anInt2508] + (float) this.anIntArray673[local20.anInt2508] * local8.aFloat190 + (float) this.anIntArray679[local20.anInt2508] * local8.aFloat187 + local8.aFloat189);
				local22.anInt2501 = (int) ((float) this.anIntArray673[local20.anInt2508] * local8.aFloat191 + local8.aFloat192 * (float) this.anIntArray679[local20.anInt2508] + local8.aFloat183 * (float) this.anIntArray674[local20.anInt2508] + local8.aFloat188);
				local22.anInt2504 = (int) (local8.aFloat193 + local8.aFloat186 * (float) this.anIntArray674[local20.anInt2511] + local8.aFloat194 * (float) this.anIntArray673[local20.anInt2511] + local8.aFloat184 * (float) this.anIntArray679[local20.anInt2511]);
				local22.anInt2502 = (int) (local8.aFloat185 * (float) this.anIntArray674[local20.anInt2511] + local8.aFloat187 * (float) this.anIntArray679[local20.anInt2511] + local8.aFloat190 * (float) this.anIntArray673[local20.anInt2511] + local8.aFloat189);
				local22.anInt2505 = (int) (local8.aFloat188 + (float) this.anIntArray679[local20.anInt2511] * local8.aFloat192 + (float) this.anIntArray673[local20.anInt2511] * local8.aFloat191 + (float) this.anIntArray674[local20.anInt2511] * local8.aFloat183);
				local22.anInt2500 = (int) ((float) this.anIntArray674[local20.anInt2499] * local8.aFloat186 + (float) this.anIntArray679[local20.anInt2499] * local8.aFloat184 + local8.aFloat194 * (float) this.anIntArray673[local20.anInt2499] + local8.aFloat193);
				local22.anInt2509 = (int) (local8.aFloat189 + (float) this.anIntArray679[local20.anInt2499] * local8.aFloat187 + (float) this.anIntArray673[local20.anInt2499] * local8.aFloat190 + local8.aFloat185 * (float) this.anIntArray674[local20.anInt2499]);
				local22.anInt2498 = (int) ((float) this.anIntArray673[local20.anInt2499] * local8.aFloat191 + (float) this.anIntArray679[local20.anInt2499] * local8.aFloat192 + local8.aFloat183 * (float) this.anIntArray674[local20.anInt2499] + local8.aFloat188);
			}
		}
		if (this.aClass218Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass218Array5.length; local13++) {
			@Pc(365) Class218 local365 = this.aClass218Array5[local13];
			@Pc(367) Class218 local367 = local365;
			if (local365.aClass218_2 != null) {
				local367 = local365.aClass218_2;
			}
			if (local365.aClass207_20 == null) {
				local365.aClass207_20 = local8.method8199();
			} else {
				local365.aClass207_20.method8211(local8);
			}
			local367.anInt6152 = (int) (local8.aFloat193 + (float) this.anIntArray674[local365.anInt6151] * local8.aFloat186 + (float) this.anIntArray679[local365.anInt6151] * local8.aFloat184 + local8.aFloat194 * (float) this.anIntArray673[local365.anInt6151]);
			local367.anInt6153 = (int) (local8.aFloat189 + local8.aFloat190 * (float) this.anIntArray673[local365.anInt6151] + local8.aFloat187 * (float) this.anIntArray679[local365.anInt6151] + (float) this.anIntArray674[local365.anInt6151] * local8.aFloat185);
			local367.anInt6150 = (int) (local8.aFloat188 + local8.aFloat191 * (float) this.anIntArray673[local365.anInt6151] + (float) this.anIntArray679[local365.anInt6151] * local8.aFloat192 + local8.aFloat183 * (float) this.anIntArray674[local365.anInt6151]);
		}
	}

	@OriginalMember(owner = "client!vea", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10255;
	}

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "(B)V")
	private void method8676() {
		if ((this.anInt10281 & 0x37) != 0) {
			if (this.aClass181_4 == null) {
				return;
			}
			this.aClass181_4.aBoolean307 = false;
		} else if (this.aClass181_1 != null) {
			this.aClass181_1.aBoolean307 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!oo;Lclient!ea;II)V")
	@Override
	public void method8658(@OriginalArg(0) Class207 arg0, @OriginalArg(1) Class2_Sub5 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10239 == 0) {
			return;
		}
		@Pc(16) Class207_Sub3 local16 = this.aClass132_Sub1_23.aClass207_Sub3_16;
		@Pc(19) Class207_Sub3 local19 = (Class207_Sub3) arg0;
		if (!this.aBoolean719) {
			this.method8682();
		}
		Static187.aFloat18 = local19.aFloat187 * local16.aFloat192 + local16.aFloat191 * local19.aFloat184 + local16.aFloat183 * local19.aFloat192;
		Static219.aFloat22 = local19.aFloat188 * local16.aFloat183 + local19.aFloat189 * local16.aFloat192 + local19.aFloat193 * local16.aFloat191 + local16.aFloat188;
		@Pc(72) float local72 = Static219.aFloat22 + (float) this.anInt10278 * Static187.aFloat18;
		@Pc(80) float local80 = Static219.aFloat22 + Static187.aFloat18 * (float) this.anInt10285;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local72 > local80) {
			local96 = local80 - (float) this.anInt10243;
			local90 = local72 + (float) this.anInt10243;
		} else {
			local90 = (float) this.anInt10243 + local80;
			local96 = local72 - (float) this.anInt10243;
		}
		if (this.aClass132_Sub1_23.aFloat175 <= local96 || (float) this.aClass132_Sub1_23.bf >= local90) {
			return;
		}
		Static93.aFloat113 = local16.aFloat186 * local19.aFloat192 + local16.aFloat194 * local19.aFloat184 + local16.aFloat184 * local19.aFloat187;
		Static395.aFloat77 = local16.aFloat193 + local16.aFloat184 * local19.aFloat189 + local19.aFloat193 * local16.aFloat194 + local16.aFloat186 * local19.aFloat188;
		@Pc(172) float local172 = (float) this.anInt10278 * Static93.aFloat113 + Static395.aFloat77;
		@Pc(180) float local180 = Static395.aFloat77 + (float) this.anInt10285 * Static93.aFloat113;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local180 < local172) {
			local207 = (local180 - (float) this.anInt10243) * (float) this.aClass132_Sub1_23.anInt8991;
			local195 = (float) this.aClass132_Sub1_23.anInt8991 * ((float) this.anInt10243 + local172);
		} else {
			local195 = ((float) this.anInt10243 + local180) * (float) this.aClass132_Sub1_23.anInt8991;
			local207 = (float) this.aClass132_Sub1_23.anInt8991 * ((float) -this.anInt10243 + local172);
		}
		if (local207 / (float) arg2 >= this.aClass132_Sub1_23.aFloat178 || this.aClass132_Sub1_23.aFloat167 >= local195 / (float) arg2) {
			return;
		}
		Static389.aFloat76 = local16.aFloat190 * local19.aFloat184 + local16.aFloat187 * local19.aFloat187 + local16.aFloat185 * local19.aFloat192;
		Static303.aFloat34 = local16.aFloat189 + local16.aFloat187 * local19.aFloat189 + local19.aFloat193 * local16.aFloat190 + local16.aFloat185 * local19.aFloat188;
		@Pc(298) float local298 = (float) this.anInt10278 * Static389.aFloat76 + Static303.aFloat34;
		@Pc(306) float local306 = Static389.aFloat76 * (float) this.anInt10285 + Static303.aFloat34;
		@Pc(333) float local333;
		@Pc(321) float local321;
		if (local298 > local306) {
			local321 = (float) this.aClass132_Sub1_23.anInt8978 * ((float) this.anInt10243 + local298);
			local333 = (float) this.aClass132_Sub1_23.anInt8978 * ((float) -this.anInt10243 + local306);
		} else {
			local333 = ((float) -this.anInt10243 + local298) * (float) this.aClass132_Sub1_23.anInt8978;
			local321 = (local306 + (float) this.anInt10243) * (float) this.aClass132_Sub1_23.anInt8978;
		}
		if (local333 / (float) arg2 >= this.aClass132_Sub1_23.aFloat163 || this.aClass132_Sub1_23.aFloat174 >= local321 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass264Array1 != null) {
			Static655.aFloat201 = local19.aFloat185 * local16.aFloat192 + local16.aFloat191 * local19.aFloat186 + local19.aFloat183 * local16.aFloat183;
			Static619.aFloat196 = local16.aFloat186 * local19.aFloat183 + local19.aFloat185 * local16.aFloat184 + local19.aFloat186 * local16.aFloat194;
			Static416.aFloat112 = local19.aFloat191 * local16.aFloat185 + local16.aFloat190 * local19.aFloat194 + local19.aFloat190 * local16.aFloat187;
			Static397.aFloat79 = local19.aFloat186 * local16.aFloat190 + local16.aFloat187 * local19.aFloat185 + local16.aFloat185 * local19.aFloat183;
			Static234.aFloat29 = local19.aFloat191 * local16.aFloat183 + local16.aFloat191 * local19.aFloat194 + local16.aFloat192 * local19.aFloat190;
			Static636.aFloat199 = local19.aFloat194 * local16.aFloat194 + local16.aFloat184 * local19.aFloat190 + local16.aFloat186 * local19.aFloat191;
		}
		if (arg1 != null) {
			@Pc(502) int local502 = this.anInt10255 + this.anInt10259 >> 1;
			@Pc(510) int local510 = this.anInt10288 + this.anInt10247 >> 1;
			@Pc(529) int local529 = (int) (Static636.aFloat199 * (float) local502 + Static395.aFloat77 + Static93.aFloat113 * (float) this.anInt10278 + Static619.aFloat196 * (float) local510);
			@Pc(548) int local548 = (int) ((float) local510 * Static397.aFloat79 + Static389.aFloat76 * (float) this.anInt10278 + Static416.aFloat112 * (float) local502 + Static303.aFloat34);
			@Pc(567) int local567 = (int) ((float) local502 * Static234.aFloat29 + Static219.aFloat22 + (float) this.anInt10278 * Static187.aFloat18 + Static655.aFloat201 * (float) local510);
			@Pc(586) int local586 = (int) ((float) local502 * Static636.aFloat199 + Static395.aFloat77 + (float) this.anInt10285 * Static93.aFloat113 + Static619.aFloat196 * (float) local510);
			@Pc(605) int local605 = (int) (Static303.aFloat34 + (float) local502 * Static416.aFloat112 + (float) this.anInt10285 * Static389.aFloat76 + Static397.aFloat79 * (float) local510);
			arg1.anInt2082 = this.aClass132_Sub1_23.anInt8991 * local529 / arg2 + this.aClass132_Sub1_23.anInt8975;
			arg1.anInt2083 = local586 * this.aClass132_Sub1_23.anInt8991 / arg2 + this.aClass132_Sub1_23.anInt8975;
			@Pc(650) int local650 = (int) (Static234.aFloat29 * (float) local502 + Static219.aFloat22 + (float) this.anInt10285 * Static187.aFloat18 + Static655.aFloat201 * (float) local510);
			arg1.anInt2086 = this.aClass132_Sub1_23.anInt9003 + local548 * this.aClass132_Sub1_23.anInt8978 / arg2;
			arg1.anInt2084 = this.aClass132_Sub1_23.anInt8978 * local605 / arg2 + this.aClass132_Sub1_23.anInt9003;
			if (this.aClass132_Sub1_23.bf <= local567 || local650 >= this.aClass132_Sub1_23.bf) {
				arg1.aBoolean124 = true;
				arg1.anInt2085 = (this.anInt10243 + local529) * this.aClass132_Sub1_23.anInt8991 / arg2 + this.aClass132_Sub1_23.anInt8975 - arg1.anInt2082;
			}
		}
		this.aClass132_Sub1_23.method7557((float) arg2);
		this.aClass132_Sub1_23.method7601();
		this.aClass132_Sub1_23.method7539(local19);
		this.method8669();
		this.method8672();
	}

	@OriginalMember(owner = "client!vea", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static94.anInt1716 = 0;
			Static499.anInt8441 = 0;
			Static405.anInt6805 = 0;
			local18 = 0;
			for (local20 = 0; local20 < this.anInt10238; local20++) {
				Static499.anInt8441 += this.anIntArray673[local20];
				Static94.anInt1716 += this.anIntArray679[local20];
				local18++;
				Static405.anInt6805 += this.anIntArray674[local20];
			}
			if (local18 > 0) {
				Static499.anInt8441 = arg1 + Static499.anInt8441 / local18;
				Static94.anInt1716 = Static94.anInt1716 / local18 + arg2;
				Static405.anInt6805 = Static405.anInt6805 / local18 + arg3;
			} else {
				Static94.anInt1716 = arg2;
				Static499.anInt8441 = arg1;
				Static405.anInt6805 = arg3;
			}
		} else if (arg0 == 1) {
			for (local18 = 0; local18 < this.anInt10238; local18++) {
				this.anIntArray673[local18] += arg1;
				this.anIntArray679[local18] += arg2;
				this.anIntArray674[local18] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local18 = 0; local18 < this.anInt10238; local18++) {
					this.anIntArray673[local18] -= Static499.anInt8441;
					this.anIntArray679[local18] -= Static94.anInt1716;
					this.anIntArray674[local18] -= Static405.anInt6805;
					if (arg3 != 0) {
						local20 = Class6_Sub1_Sub3.anIntArray56[arg3];
						local162 = Class6_Sub1_Sub3.anIntArray58[arg3];
						local180 = this.anIntArray673[local18] * local162 + local20 * this.anIntArray679[local18] + 16383 >> 14;
						this.anIntArray679[local18] = local162 * this.anIntArray679[local18] + 16383 - local20 * this.anIntArray673[local18] >> 14;
						this.anIntArray673[local18] = local180;
					}
					if (arg1 != 0) {
						local20 = Class6_Sub1_Sub3.anIntArray56[arg1];
						local162 = Class6_Sub1_Sub3.anIntArray58[arg1];
						local180 = this.anIntArray679[local18] * local162 + 16383 - this.anIntArray674[local18] * local20 >> 14;
						this.anIntArray674[local18] = local162 * this.anIntArray674[local18] + this.anIntArray679[local18] * local20 + 16383 >> 14;
						this.anIntArray679[local18] = local180;
					}
					if (arg2 != 0) {
						local20 = Class6_Sub1_Sub3.anIntArray56[arg2];
						local162 = Class6_Sub1_Sub3.anIntArray58[arg2];
						local180 = local162 * this.anIntArray673[local18] + this.anIntArray674[local18] * local20 + 16383 >> 14;
						this.anIntArray674[local18] = local162 * this.anIntArray674[local18] + 16383 - this.anIntArray673[local18] * local20 >> 14;
						this.anIntArray673[local18] = local180;
					}
					this.anIntArray673[local18] += Static499.anInt8441;
					this.anIntArray679[local18] += Static94.anInt1716;
					this.anIntArray674[local18] += Static405.anInt6805;
				}
			} else if (arg0 == 3) {
				for (local18 = 0; local18 < this.anInt10238; local18++) {
					this.anIntArray673[local18] -= Static499.anInt8441;
					this.anIntArray679[local18] -= Static94.anInt1716;
					this.anIntArray674[local18] -= Static405.anInt6805;
					this.anIntArray673[local18] = arg1 * this.anIntArray673[local18] / 128;
					this.anIntArray679[local18] = arg2 * this.anIntArray679[local18] / 128;
					this.anIntArray674[local18] = this.anIntArray674[local18] * arg3 / 128;
					this.anIntArray673[local18] += Static499.anInt8441;
					this.anIntArray679[local18] += Static94.anInt1716;
					this.anIntArray674[local18] += Static405.anInt6805;
				}
			} else {
				@Pc(505) Class264 local505;
				@Pc(510) Class192 local510;
				if (arg0 == 5) {
					for (local18 = 0; local18 < this.anInt10291; local18++) {
						local20 = arg1 * 8 + (this.aByteArray103[local18] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray103[local18] = (byte) local20;
					}
					if (this.aClass264Array1 != null) {
						for (local20 = 0; local20 < this.anInt10264; local20++) {
							local505 = this.aClass264Array1[local20];
							local510 = this.aClass192Array1[local20];
							local510.anInt5168 = 255 - (this.aByteArray103[local505.anInt7438] & 0xFF) << 24 | local510.anInt5168 & 0xFFFFFF;
						}
					}
					this.method8673();
				} else if (arg0 == 7) {
					for (local18 = 0; local18 < this.anInt10291; local18++) {
						local20 = this.aShortArray150[local18] & 0xFFFF;
						local162 = local20 >> 10 & 0x3F;
						local180 = local20 >> 7 & 0x7;
						@Pc(572) int local572 = local20 & 0x7F;
						@Pc(579) int local579 = local162 + arg1 & 0x3F;
						local180 += arg2 / 4;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						local572 += arg3;
						if (local572 < 0) {
							local572 = 0;
						} else if (local572 > 127) {
							local572 = 127;
						}
						this.aShortArray150[local18] = (short) (local572 | local180 << 7 | local579 << 10);
					}
					if (this.aClass264Array1 != null) {
						for (local20 = 0; local20 < this.anInt10264; local20++) {
							local505 = this.aClass264Array1[local20];
							local510 = this.aClass192Array1[local20];
							local510.anInt5168 = Static70.anIntArray71[this.aShortArray150[local505.anInt7438] & 0xFFFF] & 0xFFFFFF | local510.anInt5168 & 0xFF000000;
						}
					}
					this.method8673();
				} else {
					@Pc(694) Class192 local694;
					if (arg0 == 8) {
						for (local18 = 0; local18 < this.anInt10264; local18++) {
							local694 = this.aClass192Array1[local18];
							local694.anInt5167 += arg2;
							local694.anInt5170 += arg1;
						}
					} else if (arg0 == 10) {
						for (local18 = 0; local18 < this.anInt10264; local18++) {
							local694 = this.aClass192Array1[local18];
							local694.anInt5171 = local694.anInt5171 * arg1 >> 7;
							local694.anInt5174 = local694.anInt5174 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local18 = 0; local18 < this.anInt10264; local18++) {
							local694 = this.aClass192Array1[local18];
							local694.anInt5169 = arg1 + local694.anInt5169 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10238; local3++) {
			if (arg0 != 128) {
				this.anIntArray673[local3] = arg0 * this.anIntArray673[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray679[local3] = this.anIntArray679[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray674[local3] = arg2 * this.anIntArray674[local3] >> 7;
			}
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!oo;IZ)V")
	@Override
	public void method8642(@OriginalArg(0) Class207 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray144 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt10238; local14++) {
			if ((this.aShortArray144[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method8210(this.anIntArray673[local14], this.anIntArray679[local14], this.anIntArray674[local14], local12);
				} else {
					arg0.method8195(this.anIntArray673[local14], this.anIntArray679[local14], this.anIntArray674[local14], local12);
				}
				this.anIntArray673[local14] = local12[0];
				this.anIntArray679[local14] = local12[1];
				this.anIntArray674[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(FIIIILclient!ao;FBJII)S")
	private short method8678(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) float arg6, @OriginalArg(8) long arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray676[arg4];
		@Pc(17) int local17 = this.anIntArray676[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray152[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg7 == Static33.aLongArray2[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray152[local19] = (short) (this.anInt10239 + 1);
		Static33.aLongArray2[local19] = arg7;
		this.aShortArray147[this.anInt10239] = (short) arg8;
		this.aShortArray153[this.anInt10239] = (short) arg4;
		this.aShortArray156[this.anInt10239] = (short) arg1;
		this.aShortArray155[this.anInt10239] = (short) arg9;
		this.aShortArray154[this.anInt10239] = (short) arg3;
		this.aByteArray102[this.anInt10239] = (byte) arg2;
		this.aFloatArray75[this.anInt10239] = arg0;
		this.aFloatArray74[this.anInt10239] = arg6;
		return (short) this.anInt10239++;
	}

	@OriginalMember(owner = "client!vea", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort124;
	}

	@OriginalMember(owner = "client!vea", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub4_Sub5 ba(@OriginalArg(0) Class6_Sub4_Sub5 arg0) {
		if (this.anInt10239 == 0) {
			return null;
		}
		if (!this.aBoolean719) {
			this.method8682();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass132_Sub1_23.anInt8968 > 0) {
			local43 = this.anInt10255 - (this.aClass132_Sub1_23.anInt8968 * this.anInt10285 >> 8) >> this.aClass132_Sub1_23.anInt8967;
			local59 = this.anInt10259 - (this.aClass132_Sub1_23.anInt8968 * this.anInt10278 >> 8) >> this.aClass132_Sub1_23.anInt8967;
		} else {
			local43 = this.anInt10255 - (this.anInt10278 * this.aClass132_Sub1_23.anInt8968 >> 8) >> this.aClass132_Sub1_23.anInt8967;
			local59 = this.anInt10259 - (this.anInt10285 * this.aClass132_Sub1_23.anInt8968 >> 8) >> this.aClass132_Sub1_23.anInt8967;
		}
		@Pc(118) int local118;
		@Pc(135) int local135;
		if (this.aClass132_Sub1_23.anInt8979 <= 0) {
			local118 = this.anInt10288 - (this.anInt10278 * this.aClass132_Sub1_23.anInt8979 >> 8) >> this.aClass132_Sub1_23.anInt8967;
			local135 = this.anInt10247 - (this.aClass132_Sub1_23.anInt8979 * this.anInt10285 >> 8) >> this.aClass132_Sub1_23.anInt8967;
		} else {
			local118 = this.anInt10288 - (this.aClass132_Sub1_23.anInt8979 * this.anInt10285 >> 8) >> this.aClass132_Sub1_23.anInt8967;
			local135 = this.anInt10247 - (this.anInt10278 * this.aClass132_Sub1_23.anInt8979 >> 8) >> this.aClass132_Sub1_23.anInt8967;
		}
		@Pc(178) int local178 = local59 + 1 - local43;
		@Pc(185) int local185 = local135 + 1 - local118;
		@Pc(188) Class6_Sub4_Sub5_Sub2 local188 = (Class6_Sub4_Sub5_Sub2) arg0;
		@Pc(204) Class6_Sub4_Sub5_Sub2 local204;
		if (local188 != null && local188.method8139(local185, local178)) {
			local204 = local188;
			local188.method8138();
		} else {
			local204 = new Class6_Sub4_Sub5_Sub2(this.aClass132_Sub1_23, local178, local185);
		}
		local204.method8144(local118, local43, local135, local59);
		this.method8671(local204);
		return local204;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!vea;Lclient!vea;ZIIZ)Lclient!ka;")
	private Class184 method8679(@OriginalArg(0) Class184_Sub3 arg0, @OriginalArg(1) Class184_Sub3 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		arg1.aShort123 = this.aShort123;
		arg1.anInt10264 = this.anInt10264;
		arg1.anInt10245 = this.anInt10245;
		arg1.anInt10262 = arg3;
		arg1.anInt10252 = this.anInt10252;
		arg1.aShort124 = this.aShort124;
		arg1.aBoolean718 = this.aBoolean718;
		arg1.anInt10291 = this.anInt10291;
		arg1.anInt10239 = this.anInt10239;
		arg1.anInt10238 = this.anInt10238;
		if ((arg3 & 0x100) == 0) {
			arg1.aBoolean721 = this.aBoolean721;
		} else {
			arg1.aBoolean721 = true;
		}
		arg1.anInt10281 = this.anInt10281;
		@Pc(69) boolean local69 = Static14.method452(this.anInt10281, arg3);
		@Pc(77) boolean local77 = Static541.method5288(arg3, this.anInt10281);
		@Pc(83) boolean local83 = Static411.method6181(arg3, this.anInt10281);
		@Pc(89) boolean local89 = local83 | local77 | local69;
		@Pc(186) int local186;
		if (local89) {
			if (!local69) {
				arg1.anIntArray673 = this.anIntArray673;
			} else if (arg0.anIntArray673 == null || this.anInt10245 > arg0.anIntArray673.length) {
				arg1.anIntArray673 = arg0.anIntArray673 = new int[this.anInt10245];
			} else {
				arg1.anIntArray673 = arg0.anIntArray673;
			}
			if (!local77) {
				arg1.anIntArray679 = this.anIntArray679;
			} else if (arg0.anIntArray679 == null || arg0.anIntArray679.length < this.anInt10245) {
				arg1.anIntArray679 = arg0.anIntArray679 = new int[this.anInt10245];
			} else {
				arg1.anIntArray679 = arg0.anIntArray679;
			}
			if (!local83) {
				arg1.anIntArray674 = this.anIntArray674;
			} else if (arg0.anIntArray674 == null || arg0.anIntArray674.length < this.anInt10245) {
				arg1.anIntArray674 = arg0.anIntArray674 = new int[this.anInt10245];
			} else {
				arg1.anIntArray674 = arg0.anIntArray674;
			}
			for (local186 = 0; local186 < this.anInt10245; local186++) {
				if (local69) {
					arg1.anIntArray673[local186] = this.anIntArray673[local186];
				}
				if (local77) {
					arg1.anIntArray679[local186] = this.anIntArray679[local186];
				}
				if (local83) {
					arg1.anIntArray674[local186] = this.anIntArray674[local186];
				}
			}
		} else {
			arg1.anIntArray674 = this.anIntArray674;
			arg1.anIntArray673 = this.anIntArray673;
			arg1.anIntArray679 = this.anIntArray679;
		}
		if (Static426.method6548(this.anInt10281, arg3)) {
			arg1.aClass181_3 = arg0.aClass181_3;
			arg1.aClass181_3.aBoolean307 = this.aClass181_3.aBoolean307;
			arg1.aClass181_3.aBoolean308 = true;
			arg1.aClass181_3.anInterface12_5 = this.aClass181_3.anInterface12_5;
		} else if (Static653.method8885(this.anInt10281, arg3)) {
			arg1.aClass181_3 = this.aClass181_3;
		} else {
			arg1.aClass181_3 = null;
		}
		if (Static440.method6454(this.anInt10281, arg3)) {
			if (arg0.aShortArray150 == null || arg0.aShortArray150.length < this.anInt10291) {
				arg1.aShortArray150 = arg0.aShortArray150 = new short[this.anInt10291];
			} else {
				arg1.aShortArray150 = arg0.aShortArray150;
			}
			for (local186 = 0; local186 < this.anInt10291; local186++) {
				arg1.aShortArray150[local186] = this.aShortArray150[local186];
			}
		} else {
			arg1.aShortArray150 = this.aShortArray150;
		}
		if (Static153.method2167(this.anInt10281, arg3)) {
			if (arg0.aByteArray103 == null || this.anInt10291 > arg0.aByteArray103.length) {
				arg1.aByteArray103 = arg0.aByteArray103 = new byte[this.anInt10291];
			} else {
				arg1.aByteArray103 = arg0.aByteArray103;
			}
			for (local186 = 0; local186 < this.anInt10291; local186++) {
				arg1.aByteArray103[local186] = this.aByteArray103[local186];
			}
		} else {
			arg1.aByteArray103 = this.aByteArray103;
		}
		if (Static454.method6568(arg3, this.anInt10281)) {
			arg1.aClass181_1 = arg0.aClass181_1;
			arg1.aClass181_1.anInterface12_5 = this.aClass181_1.anInterface12_5;
			arg1.aClass181_1.aBoolean308 = true;
			arg1.aClass181_1.aBoolean307 = this.aClass181_1.aBoolean307;
		} else if (Static479.method7014(this.anInt10281, arg3)) {
			arg1.aClass181_1 = this.aClass181_1;
		} else {
			arg1.aClass181_1 = null;
		}
		@Pc(543) int local543;
		if (Static76.method1319(arg3, this.anInt10281)) {
			if (arg0.aShortArray156 == null || arg0.aShortArray156.length < this.anInt10239) {
				local186 = this.anInt10239;
				arg1.aShortArray154 = arg0.aShortArray154 = new short[local186];
				arg1.aShortArray155 = arg0.aShortArray155 = new short[local186];
				arg1.aShortArray156 = arg0.aShortArray156 = new short[local186];
			} else {
				arg1.aShortArray155 = arg0.aShortArray155;
				arg1.aShortArray154 = arg0.aShortArray154;
				arg1.aShortArray156 = arg0.aShortArray156;
			}
			if (this.lb == null) {
				arg1.lb = null;
				for (local186 = 0; local186 < this.anInt10239; local186++) {
					arg1.aShortArray156[local186] = this.aShortArray156[local186];
					arg1.aShortArray155[local186] = this.aShortArray155[local186];
					arg1.aShortArray154[local186] = this.aShortArray154[local186];
				}
			} else {
				if (arg0.lb == null) {
					arg0.lb = new Class62();
				}
				@Pc(531) Class62 local531 = arg1.lb = arg0.lb;
				if (local531.aShortArray33 == null || local531.aShortArray33.length < this.anInt10239) {
					local543 = this.anInt10239;
					local531.aShortArray31 = new short[local543];
					local531.aShortArray33 = new short[local543];
					local531.aByteArray17 = new byte[local543];
					local531.aShortArray32 = new short[local543];
				}
				for (local543 = 0; local543 < this.anInt10239; local543++) {
					arg1.aShortArray156[local543] = this.aShortArray156[local543];
					arg1.aShortArray155[local543] = this.aShortArray155[local543];
					arg1.aShortArray154[local543] = this.aShortArray154[local543];
					local531.aShortArray33[local543] = this.lb.aShortArray33[local543];
					local531.aShortArray31[local543] = this.lb.aShortArray31[local543];
					local531.aShortArray32[local543] = this.lb.aShortArray32[local543];
					local531.aByteArray17[local543] = this.lb.aByteArray17[local543];
				}
			}
			arg1.aByteArray102 = this.aByteArray102;
		} else {
			arg1.aShortArray155 = this.aShortArray155;
			arg1.aShortArray154 = this.aShortArray154;
			arg1.aShortArray156 = this.aShortArray156;
			arg1.lb = this.lb;
			arg1.aByteArray102 = this.aByteArray102;
		}
		if (Static385.method5488(arg3, this.anInt10281)) {
			arg1.aClass181_4 = arg0.aClass181_4;
			arg1.aClass181_4.aBoolean308 = true;
			arg1.aClass181_4.anInterface12_5 = this.aClass181_4.anInterface12_5;
			arg1.aClass181_4.aBoolean307 = this.aClass181_4.aBoolean307;
		} else if (Static301.method4340(this.anInt10281, arg3)) {
			arg1.aClass181_4 = this.aClass181_4;
		} else {
			arg1.aClass181_4 = null;
		}
		if (Static210.method3100(arg3, this.anInt10281)) {
			if (arg0.aFloatArray75 == null || arg0.aFloatArray75.length < this.anInt10291) {
				local186 = this.anInt10239;
				arg1.aFloatArray75 = arg0.aFloatArray75 = new float[local186];
				arg1.aFloatArray74 = arg0.aFloatArray74 = new float[local186];
			} else {
				arg1.aFloatArray74 = arg0.aFloatArray74;
				arg1.aFloatArray75 = arg0.aFloatArray75;
			}
			for (local186 = 0; local186 < this.anInt10239; local186++) {
				arg1.aFloatArray75[local186] = this.aFloatArray75[local186];
				arg1.aFloatArray74[local186] = this.aFloatArray74[local186];
			}
		} else {
			arg1.aFloatArray74 = this.aFloatArray74;
			arg1.aFloatArray75 = this.aFloatArray75;
		}
		if (Static233.method3521(arg3, this.anInt10281)) {
			arg1.aClass181_2 = arg0.aClass181_2;
			arg1.aClass181_2.aBoolean308 = true;
			arg1.aClass181_2.anInterface12_5 = this.aClass181_2.anInterface12_5;
			arg1.aClass181_2.aBoolean307 = this.aClass181_2.aBoolean307;
		} else if (Static390.method5564(arg3, this.anInt10281)) {
			arg1.aClass181_2 = this.aClass181_2;
		} else {
			arg1.aClass181_2 = null;
		}
		if (Static476.method6973(this.anInt10281, arg3)) {
			if (arg0.aShortArray146 == null || arg0.aShortArray146.length < this.anInt10291) {
				local186 = this.anInt10291;
				arg1.aShortArray146 = arg0.aShortArray146 = new short[local186];
				arg1.aShortArray149 = arg0.aShortArray149 = new short[local186];
				arg1.aShortArray151 = arg0.aShortArray151 = new short[local186];
			} else {
				arg1.aShortArray151 = arg0.aShortArray151;
				arg1.aShortArray149 = arg0.aShortArray149;
				arg1.aShortArray146 = arg0.aShortArray146;
			}
			for (local186 = 0; local186 < this.anInt10291; local186++) {
				arg1.aShortArray146[local186] = this.aShortArray146[local186];
				arg1.aShortArray149[local186] = this.aShortArray149[local186];
				arg1.aShortArray151[local186] = this.aShortArray151[local186];
			}
		} else {
			arg1.aShortArray151 = this.aShortArray151;
			arg1.aShortArray146 = this.aShortArray146;
			arg1.aShortArray149 = this.aShortArray149;
		}
		if (Static205.method3062(this.anInt10281, arg3)) {
			arg1.aClass95_1 = arg0.aClass95_1;
			arg1.aClass95_1.aBoolean155 = true;
			arg1.aClass95_1.anInterface21_2 = this.aClass95_1.anInterface21_2;
			arg1.aClass95_1.aBoolean154 = this.aClass95_1.aBoolean154;
		} else if (Static527.method7377(this.anInt10281, arg3)) {
			arg1.aClass95_1 = this.aClass95_1;
		} else {
			arg1.aClass95_1 = null;
		}
		if (Static164.method9055(arg3, this.anInt10281)) {
			if (arg0.aShortArray148 == null || this.anInt10291 > arg0.aShortArray148.length) {
				local186 = this.anInt10291;
				arg1.aShortArray148 = arg0.aShortArray148 = new short[local186];
			} else {
				arg1.aShortArray148 = arg0.aShortArray148;
			}
			for (local186 = 0; local186 < this.anInt10291; local186++) {
				arg1.aShortArray148[local186] = this.aShortArray148[local186];
			}
		} else {
			arg1.aShortArray148 = this.aShortArray148;
		}
		if (!Static99.method1639(this.anInt10281, arg3)) {
			arg1.aClass192Array1 = this.aClass192Array1;
		} else if (arg0.aClass192Array1 == null || arg0.aClass192Array1.length < this.anInt10264) {
			local186 = this.anInt10264;
			arg1.aClass192Array1 = arg0.aClass192Array1 = new Class192[local186];
			for (local543 = 0; local543 < this.anInt10264; local543++) {
				arg1.aClass192Array1[local543] = this.aClass192Array1[local543].method4369();
			}
		} else {
			arg1.aClass192Array1 = arg0.aClass192Array1;
			for (local186 = 0; local186 < this.anInt10264; local186++) {
				arg1.aClass192Array1[local186].method4367(this.aClass192Array1[local186]);
			}
		}
		arg1.anIntArray676 = this.anIntArray676;
		arg1.anIntArray677 = this.anIntArray677;
		arg1.anIntArrayArray58 = this.anIntArrayArray58;
		arg1.anIntArrayArray57 = this.anIntArrayArray57;
		arg1.aShortArray152 = this.aShortArray152;
		arg1.aClass100Array5 = this.aClass100Array5;
		arg1.aShortArray144 = this.aShortArray144;
		arg1.aClass218Array5 = this.aClass218Array5;
		arg1.aShortArray145 = this.aShortArray145;
		arg1.anIntArray678 = this.anIntArray678;
		arg1.anIntArray675 = this.anIntArray675;
		arg1.aClass264Array1 = this.aClass264Array1;
		arg1.aShortArray147 = this.aShortArray147;
		arg1.aShortArray153 = this.aShortArray153;
		arg1.anIntArrayArray56 = this.anIntArrayArray56;
		if (this.aBoolean719) {
			arg1.anInt10227 = this.anInt10227;
			arg1.anInt10243 = this.anInt10243;
			arg1.anInt10278 = this.anInt10278;
			arg1.anInt10259 = this.anInt10259;
			arg1.anInt10285 = this.anInt10285;
			arg1.anInt10255 = this.anInt10255;
			arg1.aBoolean719 = true;
			arg1.anInt10247 = this.anInt10247;
			arg1.anInt10288 = this.anInt10288;
		} else {
			arg1.aBoolean719 = false;
		}
		return arg1;
	}

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "()[Lclient!fba;")
	@Override
	public Class100[] method8657() {
		return this.aClass100Array5;
	}

	@OriginalMember(owner = "client!vea", name = "f", descriptor = "(I)V")
	private void method8680() {
		if (this.aClass181_3 != null) {
			this.aClass181_3.aBoolean307 = false;
		}
	}

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "()V")
	@Override
	public void method8663() {
		if (this.anInt10239 > 0 && this.anInt10252 > 0) {
			this.method8675();
			this.method8670();
			this.method8667();
		}
	}

	@OriginalMember(owner = "client!vea", name = "g", descriptor = "(I)V")
	private void method8682() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt10238; local23++) {
			@Pc(30) int local30 = this.anIntArray673[local23];
			@Pc(35) int local35 = this.anIntArray679[local23];
			@Pc(40) int local40 = this.anIntArray674[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local7 > local30) {
				local7 = local30;
			}
			if (local40 < local11) {
				local11 = local40;
			}
			if (local17 < local40) {
				local17 = local40;
			}
			@Pc(95) int local95 = local30 * local30 + local40 * local40;
			if (local95 > local19) {
				local19 = local95;
			}
			local95 = local40 * local40 + local30 * local30 + local35 * local35;
			if (local95 > local21) {
				local21 = local95;
			}
		}
		this.anInt10255 = local7;
		this.anInt10259 = local13;
		this.anInt10278 = local9;
		this.anInt10288 = local11;
		this.anInt10285 = local15;
		this.anInt10247 = local17;
		this.anInt10243 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt10227 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean719 = true;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class6_Sub1_Sub3.anIntArray56[arg0];
		@Pc(13) int local13 = Class6_Sub1_Sub3.anIntArray58[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10238; local15++) {
			@Pc(33) int local33 = this.anIntArray674[local15] * local9 + this.anIntArray673[local15] * local13 >> 14;
			this.anIntArray674[local15] = local13 * this.anIntArray674[local15] - this.anIntArray673[local15] * local9 >> 14;
			this.anIntArray673[local15] = local33;
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10245; local3++) {
			this.anIntArray673[local3] = this.anIntArray673[local3] + 7 >> 4;
			this.anIntArray679[local3] = this.anIntArray679[local3] + 7 >> 4;
			this.anIntArray674[local3] = this.anIntArray674[local3] + 7 >> 4;
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10291; local3++) {
			if (arg0 == this.aShortArray150[local3]) {
				this.aShortArray150[local3] = arg1;
			}
		}
		if (this.aClass264Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt10264; local30++) {
				@Pc(37) Class264 local37 = this.aClass264Array1[local30];
				@Pc(42) Class192 local42 = this.aClass192Array1[local30];
				local42.anInt5168 = local42.anInt5168 & 0xFF000000 | Static70.anIntArray71[this.aShortArray150[local37.anInt7438] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method8673();
	}

	@OriginalMember(owner = "client!vea", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean721;
	}

	@OriginalMember(owner = "client!vea", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10227;
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8651(@OriginalArg(0) Class184 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class184_Sub3 local8 = (Class184_Sub3) arg0;
		if (this.anInt10291 == 0 || local8.anInt10291 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt10238;
		@Pc(24) int[] local24 = local8.anIntArray673;
		@Pc(27) int[] local27 = local8.anIntArray679;
		@Pc(30) int[] local30 = local8.anIntArray674;
		@Pc(33) short[] local33 = local8.aShortArray156;
		@Pc(36) short[] local36 = local8.aShortArray155;
		@Pc(39) short[] local39 = local8.aShortArray154;
		@Pc(42) byte[] local42 = local8.aByteArray102;
		@Pc(57) short[] local57;
		@Pc(53) short[] local53;
		@Pc(49) short[] local49;
		@Pc(61) byte[] local61;
		if (this.lb == null) {
			local61 = null;
			local53 = null;
			local49 = null;
			local57 = null;
		} else {
			local49 = this.lb.aShortArray32;
			local53 = this.lb.aShortArray31;
			local57 = this.lb.aShortArray33;
			local61 = this.lb.aByteArray17;
		}
		@Pc(80) short[] local80;
		@Pc(78) short[] local78;
		@Pc(82) short[] local82;
		@Pc(76) byte[] local76;
		if (local8.lb == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local76 = local8.lb.aByteArray17;
			local80 = local8.lb.aShortArray33;
			local82 = local8.lb.aShortArray32;
			local78 = local8.lb.aShortArray31;
		}
		@Pc(103) int[] local103 = local8.anIntArray676;
		@Pc(106) short[] local106 = local8.aShortArray152;
		if (!local8.aBoolean719) {
			local8.method8682();
		}
		@Pc(115) int local115 = local8.anInt10278;
		@Pc(118) int local118 = local8.anInt10285;
		@Pc(121) int local121 = local8.anInt10255;
		@Pc(124) int local124 = local8.anInt10259;
		@Pc(127) int local127 = local8.anInt10288;
		@Pc(130) int local130 = local8.anInt10247;
		for (@Pc(132) int local132 = 0; local132 < this.anInt10238; local132++) {
			@Pc(142) int local142 = this.anIntArray679[local132] - arg2;
			if (local115 <= local142 && local142 <= local118) {
				@Pc(162) int local162 = this.anIntArray673[local132] - arg1;
				if (local121 <= local162 && local162 <= local124) {
					@Pc(182) int local182 = this.anIntArray674[local132] - arg3;
					if (local182 >= local127 && local182 <= local130) {
						@Pc(192) int local192 = -1;
						@Pc(197) int local197 = this.anIntArray676[local132];
						@Pc(204) int local204 = this.anIntArray676[local132 + 1];
						for (@Pc(206) int local206 = local197; local206 < local204; local206++) {
							local192 = this.aShortArray152[local206] - 1;
							if (local192 == -1 || this.aByteArray102[local192] != 0) {
								break;
							}
						}
						if (local192 != -1) {
							for (@Pc(237) int local237 = 0; local237 < local21; local237++) {
								if (local24[local237] == local162 && local30[local237] == local182 && local27[local237] == local142) {
									local204 = local103[local237 + 1];
									local197 = local103[local237];
									@Pc(274) int local274 = -1;
									for (@Pc(276) int local276 = local197; local276 < local204; local276++) {
										local274 = local106[local276] - 1;
										if (local274 == -1 || local42[local274] != 0) {
											break;
										}
									}
									if (local274 != -1) {
										if (local57 == null) {
											this.lb = new Class62();
											local57 = this.lb.aShortArray33 = Static195.method2797(this.aShortArray156);
											local53 = this.lb.aShortArray31 = Static195.method2797(this.aShortArray155);
											local49 = this.lb.aShortArray32 = Static195.method2797(this.aShortArray154);
											local61 = this.lb.aByteArray17 = Static251.method3638(this.aByteArray102);
										}
										if (local80 == null) {
											@Pc(353) Class62 local353 = local8.lb = new Class62();
											local80 = local353.aShortArray33 = Static195.method2797(local33);
											local78 = local353.aShortArray31 = Static195.method2797(local36);
											local82 = local353.aShortArray32 = Static195.method2797(local39);
											local76 = local353.aByteArray17 = Static251.method3638(local42);
										}
										@Pc(386) short local386 = this.aShortArray156[local192];
										@Pc(391) short local391 = this.aShortArray155[local192];
										@Pc(396) short local396 = this.aShortArray154[local192];
										local204 = local103[local237 + 1];
										@Pc(407) byte local407 = this.aByteArray102[local192];
										local197 = local103[local237];
										@Pc(421) int local421;
										for (@Pc(413) int local413 = local197; local413 < local204; local413++) {
											local421 = local106[local413] - 1;
											if (local421 == -1) {
												break;
											}
											if (local76[local421] != 0) {
												local80[local421] += local386;
												local78[local421] += local391;
												local82[local421] += local396;
												local76[local421] += local407;
											}
										}
										local396 = local39[local274];
										local391 = local36[local274];
										local197 = this.anIntArray676[local132];
										local407 = local42[local274];
										local204 = this.anIntArray676[local132 + 1];
										local386 = local33[local274];
										for (local421 = local197; local421 < local204; local421++) {
											@Pc(510) int local510 = this.aShortArray152[local421] - 1;
											if (local510 == -1) {
												break;
											}
											if (local61[local510] != 0) {
												local57[local510] += local386;
												local53[local510] += local391;
												local49[local510] += local396;
												local61[local510] += local407;
											}
										}
										local8.method8676();
										this.method8676();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IILclient!oo;ZII)Z")
	@Override
	public boolean method8653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method8674(arg1, arg3, arg0, arg2, arg4, arg5);
	}

	@OriginalMember(owner = "client!vea", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10259;
	}

	@OriginalMember(owner = "client!vea", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class12 arg2, @OriginalArg(3) Class12 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean719) {
			this.method8682();
		}
		@Pc(16) int local16 = arg4 + this.anInt10255;
		@Pc(21) int local21 = this.anInt10259 + arg4;
		@Pc(26) int local26 = arg6 + this.anInt10288;
		@Pc(31) int local31 = this.anInt10247 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || local21 + arg2.anInt9306 >> arg2.anInt9312 >= arg2.anInt9314 || local26 < 0 || arg2.anInt9313 <= local31 + arg2.anInt9306 >> arg2.anInt9312)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9314 <= local21 + arg3.anInt9306 >> arg3.anInt9312 || local26 < 0 || arg3.anInt9306 + local31 >> arg3.anInt9312 >= arg3.anInt9313) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9312;
			local21 = arg2.anInt9306 + local21 - 1 >> arg2.anInt9312;
			local26 >>= arg2.anInt9312;
			local31 = local31 + arg2.anInt9306 - 1 >> arg2.anInt9312;
			if (arg5 == arg2.method7846(local16, local26) && arg5 == arg2.method7846(local21, local26) && arg2.method7846(local16, local31) == arg5 && arg5 == arg2.method7846(local21, local31)) {
				return;
			}
		}
		@Pc(199) int local199;
		if (arg0 == 1) {
			for (local199 = 0; local199 < this.anInt10238; local199++) {
				this.anIntArray679[local199] = this.anIntArray679[local199] + arg2.method7854(arg6 + this.anIntArray674[local199], arg4 + this.anIntArray673[local199]) - arg5;
			}
		} else {
			@Pc(256) int local256;
			@Pc(267) int local267;
			if (arg0 == 2) {
				local199 = this.anInt10278;
				if (local199 == 0) {
					return;
				}
				for (local256 = 0; local256 < this.anInt10238; local256++) {
					local267 = (this.anIntArray679[local256] << 16) / local199;
					if (local267 < arg1) {
						this.anIntArray679[local256] -= -((arg2.method7854(arg6 + this.anIntArray674[local256], arg4 + this.anIntArray673[local256]) - arg5) * (-local267 + arg1) / arg1);
					}
				}
			} else {
				@Pc(401) int local401;
				if (arg0 == 3) {
					local199 = (arg1 & 0xFF) * 4;
					local256 = (arg1 >> 8 & 0xFF) * 4;
					local267 = (arg1 >> 16 & 0xFF) << 6;
					local401 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local199 >> 1) < 0 || arg2.anInt9306 + arg4 + (local199 >> 1) >= arg2.anInt9314 << arg2.anInt9312 || arg6 - (local256 >> 1) < 0 || arg2.anInt9306 + arg6 + (local256 >> 1) >= arg2.anInt9313 << arg2.anInt9312) {
						return;
					}
					this.method8661(arg4, arg5, arg2, local401, local267, arg6, local199, local256);
				} else if (arg0 == 4) {
					local199 = this.anInt10285 - this.anInt10278;
					for (local256 = 0; local256 < this.anInt10238; local256++) {
						this.anIntArray679[local256] = this.anIntArray679[local256] + arg3.method7854(this.anIntArray674[local256] + arg6, arg4 + this.anIntArray673[local256]) + local199 - arg5;
					}
				} else if (arg0 == 5) {
					local199 = this.anInt10285 - this.anInt10278;
					for (local256 = 0; local256 < this.anInt10238; local256++) {
						local267 = arg4 + this.anIntArray673[local256];
						local401 = this.anIntArray674[local256] + arg6;
						@Pc(407) int local407 = arg2.method7854(local401, local267);
						@Pc(413) int local413 = arg3.method7854(local401, local267);
						@Pc(420) int local420 = local407 - arg1 - local413;
						this.anIntArray679[local256] = (local420 * ((this.anIntArray679[local256] << 8) / local199) >> 8) - (arg5 - local407);
					}
				}
			}
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10238; local3++) {
			if (arg0 != 0) {
				this.anIntArray673[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray679[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray674[local3] += arg2;
			}
		}
		this.method8680();
		this.aBoolean719 = false;
	}

	@OriginalMember(owner = "client!vea", name = "b", descriptor = "()Z")
	@Override
	public boolean method8645() {
		if (this.aShortArray148 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray148.length; local12++) {
			if (this.aShortArray148[local12] != -1 && !this.aClass132_Sub1_23.anInterface6_11.method7090(this.aShortArray148[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "(I)V")
	public void method8683() {
		if (this.aClass181_3 != null) {
			this.aClass181_3.method4141();
		}
		if (this.aClass181_2 != null) {
			this.aClass181_2.method4141();
		}
		if (this.aClass181_1 != null) {
			this.aClass181_1.method4141();
		}
		if (this.aClass181_4 != null) {
			this.aClass181_4.method4141();
		}
		if (this.aClass95_1 != null) {
			this.aClass95_1.method2091();
		}
	}

	@OriginalMember(owner = "client!vea", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass132_Sub1_23.anInterface6_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt10291; local11++) {
			if (this.aShortArray148[local11] == arg0) {
				this.aShortArray148[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class294 local47 = local9.method7088(arg0 & 0xFFFF);
			local35 = local47.aByte118;
			local37 = local47.aByte116;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(67) Class294 local67 = local9.method7088(arg1 & 0xFFFF);
			local57 = local67.aByte116;
			local55 = local67.aByte118;
			if (local67.aByte115 != 0 || local67.aByte117 != 0) {
				this.aBoolean718 = true;
			}
		}
		if (!(local55 != local35 | local57 != local37)) {
			return;
		}
		if (this.aClass264Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt10264; local109++) {
				@Pc(116) Class264 local116 = this.aClass264Array1[local109];
				@Pc(121) Class192 local121 = this.aClass192Array1[local109];
				local121.anInt5168 = Static70.anIntArray71[this.aShortArray150[local116.anInt7438] & 0xFFFF] & 0xFFFFFF | local121.anInt5168 & 0xFF000000;
			}
		}
		this.method8673();
	}

	@OriginalMember(owner = "client!vea", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10288;
	}

	@OriginalMember(owner = "client!vea", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean719) {
			this.method8682();
		}
		return this.anInt10243;
	}
}
