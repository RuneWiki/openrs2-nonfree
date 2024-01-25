import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class182_Sub3 extends Class182 {

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
	private int anInt7284;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "Lclient!ao;")
	private Class15 aClass15_1;

	@OriginalMember(owner = "client!qd", name = "J", descriptor = "Lclient!ao;")
	private Class15 aClass15_2;

	@OriginalMember(owner = "client!qd", name = "U", descriptor = "Lclient!hga;")
	private Class138 aClass138_1;

	@OriginalMember(owner = "client!qd", name = "W", descriptor = "I")
	private int anInt7305;

	@OriginalMember(owner = "client!qd", name = "ab", descriptor = "Z")
	private boolean aBoolean548;

	@OriginalMember(owner = "client!qd", name = "eb", descriptor = "Z")
	private boolean aBoolean549;

	@OriginalMember(owner = "client!qd", name = "fb", descriptor = "Lclient!ao;")
	private Class15 aClass15_3;

	@OriginalMember(owner = "client!qd", name = "qb", descriptor = "I")
	private int anInt7317;

	@OriginalMember(owner = "client!qd", name = "rb", descriptor = "I")
	private int anInt7318;

	@OriginalMember(owner = "client!qd", name = "Qb", descriptor = "I")
	private int anInt7335;

	@OriginalMember(owner = "client!qd", name = "Sb", descriptor = "I")
	private int anInt7336;

	@OriginalMember(owner = "client!qd", name = "cc", descriptor = "I")
	private int anInt7343;

	@OriginalMember(owner = "client!qd", name = "jc", descriptor = "Lclient!ao;")
	private Class15 aClass15_4;

	@OriginalMember(owner = "client!qd", name = "lc", descriptor = "Lclient!pga;")
	private final Class95_Sub3 aClass95_Sub3_18;

	@OriginalMember(owner = "client!qd", name = "nc", descriptor = "I")
	private int anInt7348;

	@OriginalMember(owner = "client!qd", name = "vc", descriptor = "Z")
	private boolean aBoolean551;

	@OriginalMember(owner = "client!qd", name = "Ac", descriptor = "I")
	private int anInt7355;

	@OriginalMember(owner = "client!qd", name = "Bc", descriptor = "I")
	private int anInt7356;

	@OriginalMember(owner = "client!qd", name = "Cc", descriptor = "Lclient!qda;")
	private Class278 aClass278_1;

	@OriginalMember(owner = "client!qd", name = "Ic", descriptor = "I")
	private int anInt7359;

	@OriginalMember(owner = "client!qd", name = "T", descriptor = "[I")
	private int[] anIntArray529;

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "I")
	private int anInt7301;

	@OriginalMember(owner = "client!qd", name = "mb", descriptor = "I")
	private int anInt7315;

	@OriginalMember(owner = "client!qd", name = "Tb", descriptor = "Z")
	private boolean aBoolean550;

	@OriginalMember(owner = "client!qd", name = "zc", descriptor = "Z")
	private boolean aBoolean552;

	@OriginalMember(owner = "client!qd", name = "Mb", descriptor = "[S")
	private short[] aShortArray98;

	@OriginalMember(owner = "client!qd", name = "hb", descriptor = "I")
	private int anInt7312;

	@OriginalMember(owner = "client!qd", name = "sb", descriptor = "[I")
	private int[] anIntArray532;

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "I")
	private int anInt7296;

	@OriginalMember(owner = "client!qd", name = "vb", descriptor = "[I")
	private int[] anIntArray533;

	@OriginalMember(owner = "client!qd", name = "gc", descriptor = "[I")
	private int[] anIntArray535;

	@OriginalMember(owner = "client!qd", name = "Vb", descriptor = "[Lclient!hr;")
	private Class143[] aClass143Array5;

	@OriginalMember(owner = "client!qd", name = "wb", descriptor = "[Lclient!oo;")
	private Class255[] aClass255Array5;

	@OriginalMember(owner = "client!qd", name = "hc", descriptor = "I")
	private int anInt7346;

	@OriginalMember(owner = "client!qd", name = "ic", descriptor = "[Lclient!es;")
	private Class97[] aClass97Array1;

	@OriginalMember(owner = "client!qd", name = "Lb", descriptor = "[Lclient!ke;")
	private Class187[] aClass187Array1;

	@OriginalMember(owner = "client!qd", name = "t", descriptor = "[S")
	private short[] aShortArray93;

	@OriginalMember(owner = "client!qd", name = "mc", descriptor = "[S")
	private short[] aShortArray101;

	@OriginalMember(owner = "client!qd", name = "Fc", descriptor = "[S")
	private short[] aShortArray104;

	@OriginalMember(owner = "client!qd", name = "dc", descriptor = "[S")
	private short[] aShortArray100;

	@OriginalMember(owner = "client!qd", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!qd", name = "Q", descriptor = "S")
	private short aShort101;

	@OriginalMember(owner = "client!qd", name = "oc", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!qd", name = "xb", descriptor = "[S")
	private short[] aShortArray97;

	@OriginalMember(owner = "client!qd", name = "jb", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!qd", name = "nb", descriptor = "[S")
	private short[] aShortArray96;

	@OriginalMember(owner = "client!qd", name = "Rb", descriptor = "[S")
	private short[] aShortArray99;

	@OriginalMember(owner = "client!qd", name = "Ib", descriptor = "[F")
	private float[] aFloatArray43;

	@OriginalMember(owner = "client!qd", name = "Ec", descriptor = "[S")
	private short[] aShortArray103;

	@OriginalMember(owner = "client!qd", name = "S", descriptor = "[S")
	private short[] aShortArray95;

	@OriginalMember(owner = "client!qd", name = "wc", descriptor = "[S")
	private short[] aShortArray102;

	@OriginalMember(owner = "client!qd", name = "Dc", descriptor = "S")
	private short aShort102;

	@OriginalMember(owner = "client!qd", name = "rc", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!qd", name = "u", descriptor = "[S")
	private short[] aShortArray94;

	@OriginalMember(owner = "client!qd", name = "pb", descriptor = "[I")
	private int[] anIntArray531;

	@OriginalMember(owner = "client!qd", name = "bc", descriptor = "[I")
	private int[] anIntArray534;

	@OriginalMember(owner = "client!qd", name = "X", descriptor = "[I")
	private int[] anIntArray530;

	@OriginalMember(owner = "client!qd", name = "yc", descriptor = "[[I")
	private int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!qd", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray43;

	@OriginalMember(owner = "client!qd", name = "Gb", descriptor = "[[I")
	private int[][] anIntArrayArray44;

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!pga;Lclient!kda;IIII)V")
	public Class182_Sub3(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface6 local11 = arg0.anInterface6_27;
		@Pc(15) int[] local15 = new int[arg1.anInt4696];
		this.anIntArray529 = new int[arg1.anInt4703 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt4696; local24++) {
			if (arg1.aByteArray54 == null || arg1.aByteArray54[local24] != 2) {
				if (arg1.aShortArray51 != null && arg1.aShortArray51[local24] != -1) {
					@Pc(56) Class175 local56 = local11.method1492(arg1.aShortArray51[local24] & 0xFFFF);
					if (((this.anInt7336 & 0x40) == 0 || !local56.aBoolean308) && local56.aBoolean305) {
						continue;
					}
				}
				local15[this.anInt7301++] = local24;
				this.anIntArray529[arg1.aShortArray53[local24]]++;
				this.anIntArray529[arg1.aShortArray54[local24]]++;
				this.anIntArray529[arg1.aShortArray50[local24]]++;
			}
		}
		this.anInt7315 = this.anInt7301;
		@Pc(129) long[] local129 = new long[this.anInt7301];
		@Pc(141) boolean local141 = (this.anInt7317 & 0x100) != 0;
		@Pc(153) int local153;
		@Pc(166) int local166;
		@Pc(325) int local325;
		for (@Pc(143) int local143 = 0; local143 < this.anInt7301; local143++) {
			@Pc(149) int local149 = local15[local143];
			@Pc(151) Class175 local151 = null;
			local153 = 0;
			@Pc(155) byte local155 = 0;
			@Pc(157) byte local157 = 0;
			@Pc(159) byte local159 = 0;
			if (arg1.aClass245Array1 != null) {
				@Pc(164) boolean local164 = false;
				for (local166 = 0; local166 < arg1.aClass245Array1.length; local166++) {
					@Pc(173) Class245 local173 = arg1.aClass245Array1[local166];
					if (local173.anInt6287 == local149) {
						@Pc(182) Class302 local182 = Static382.method5115(local173.anInt6289);
						if (local182.aBoolean610) {
							local164 = true;
						}
						if (local182.anInt8082 != -1) {
							@Pc(198) Class175 local198 = local11.method1492(local182.anInt8082);
							if (local198.anInt4384 == 2) {
								this.aBoolean550 = true;
							}
						}
					}
				}
				if (local164) {
					local129[local143] = Long.MAX_VALUE;
					this.anInt7315--;
					continue;
				}
			}
			@Pc(227) short local227 = -1;
			if (arg1.aShortArray51 != null) {
				local227 = arg1.aShortArray51[local149];
				if (local227 != -1) {
					local151 = local11.method1492(local227 & 0xFFFF);
					if ((this.anInt7336 & 0x40) != 0 && local151.aBoolean308) {
						local151 = null;
						local227 = -1;
					} else {
						local159 = local151.aByte56;
						local157 = local151.aByte52;
					}
				}
			}
			@Pc(281) boolean local281 = arg1.aByteArray56 != null && arg1.aByteArray56[local149] != 0 || local151 != null && local151.anInt4384 != 0;
			if ((local141 || local281) && arg1.aByteArray55 != null) {
				local153 += arg1.aByteArray55[local149] << 17;
			}
			if (local281) {
				local153 += 65536;
			}
			local153 += (local157 & 0xFF) << 8;
			local153 += local159 & 0xFF;
			local325 = local155 + ((local227 & 0xFFFF) << 16);
			@Pc(331) int local331 = local325 + (local143 & 0xFFFF);
			local129[local143] = (long) local331 + ((long) local153 << 32);
			this.aBoolean552 |= local151 != null && (local151.aByte53 != 0 || local151.aByte54 != 0);
			this.aBoolean550 |= local281;
		}
		Static8.method126(local129, local15);
		this.aShortArray98 = arg1.aShortArray52;
		this.anInt7312 = arg1.anInt4703;
		this.anIntArray532 = arg1.anIntArray317;
		this.anInt7296 = arg1.anInt4698;
		this.anIntArray533 = arg1.anIntArray312;
		this.anIntArray535 = arg1.anIntArray315;
		this.aClass143Array5 = arg1.aClass143Array2;
		@Pc(411) Class133[] local411 = new Class133[this.anInt7312];
		this.aClass255Array5 = arg1.aClass255Array2;
		@Pc(435) int local435;
		@Pc(449) int local449;
		@Pc(487) int local487;
		if (arg1.aClass245Array1 != null) {
			this.anInt7346 = arg1.aClass245Array1.length;
			this.aClass97Array1 = new Class97[this.anInt7346];
			this.aClass187Array1 = new Class187[this.anInt7346];
			for (local435 = 0; local435 < this.anInt7346; local435++) {
				@Pc(442) Class245 local442 = arg1.aClass245Array1[local435];
				@Pc(447) Class302 local447 = Static382.method5115(local442.anInt6289);
				local449 = -1;
				for (@Pc(451) int local451 = 0; local451 < this.anInt7301; local451++) {
					if (local442.anInt6287 == local15[local451]) {
						local449 = local451;
						break;
					}
				}
				if (local449 == -1) {
					throw new RuntimeException();
				}
				local487 = Static343.anIntArray359[arg1.aShortArray55[local442.anInt6287] & 0xFFFF] & 0xFFFFFF;
				@Pc(505) int local505 = local487 | 255 - (arg1.aByteArray56 == null ? 0 : arg1.aByteArray56[local442.anInt6287]) << 24;
				this.aClass97Array1[local435] = new Class97(local449, arg1.aShortArray53[local442.anInt6287], arg1.aShortArray54[local442.anInt6287], arg1.aShortArray50[local442.anInt6287], local447.anInt8086, local447.anInt8091, local447.anInt8082, local447.anInt8085, local447.anInt8084, local447.aBoolean610, local447.aBoolean609, local442.anInt6290);
				this.aClass187Array1[local435] = new Class187(local505);
			}
		}
		local435 = this.anInt7301 * 3;
		this.aShortArray93 = new short[local435];
		this.aShortArray101 = new short[this.anInt7301];
		this.aShortArray104 = new short[this.anInt7301];
		this.aShortArray100 = new short[this.anInt7301];
		this.lb = new short[local435];
		this.aShort101 = (short) arg4;
		this.aByteArray86 = new byte[this.anInt7301];
		this.aShortArray97 = new short[local435];
		this.aByteArray85 = new byte[local435];
		this.aShortArray96 = new short[this.anInt7301];
		Static260.aLongArray20 = new long[local435];
		if (arg1.aShortArray56 != null) {
			this.aShortArray99 = new short[this.anInt7301];
		}
		this.aFloatArray43 = new float[local435];
		this.aShortArray103 = new short[local435];
		this.aShortArray95 = new short[local435];
		this.aShortArray102 = new short[local435];
		this.aShort102 = (short) arg3;
		this.aFloatArray44 = new float[local435];
		this.aShortArray94 = new short[this.anInt7301];
		local153 = 0;
		for (local325 = 0; local325 < arg1.anInt4703; local325++) {
			local449 = this.anIntArray529[local325];
			this.anIntArray529[local325] = local153;
			local411[local325] = new Class133();
			local153 += local449;
		}
		this.anIntArray529[arg1.anInt4703] = local153;
		@Pc(695) Class152 local695 = Static554.method7607(local15, this.anInt7301, arg1);
		@Pc(699) Class277[] local699 = new Class277[arg1.anInt4696];
		@Pc(740) int local740;
		@Pc(751) int local751;
		@Pc(761) int local761;
		@Pc(718) short local718;
		@Pc(729) int local729;
		for (local487 = 0; local487 < arg1.anInt4696; local487++) {
			@Pc(708) short local708 = arg1.aShortArray53[local487];
			@Pc(713) short local713 = arg1.aShortArray54[local487];
			local718 = arg1.aShortArray50[local487];
			local729 = this.anIntArray533[local713] - this.anIntArray533[local708];
			local740 = this.anIntArray532[local713] - this.anIntArray532[local708];
			local751 = this.anIntArray535[local713] - this.anIntArray535[local708];
			local761 = this.anIntArray533[local718] - this.anIntArray533[local708];
			@Pc(772) int local772 = this.anIntArray532[local718] - this.anIntArray532[local708];
			@Pc(783) int local783 = this.anIntArray535[local718] - this.anIntArray535[local708];
			@Pc(792) int local792 = local783 * local740 - local772 * local751;
			@Pc(801) int local801 = local761 * local751 - local729 * local783;
			@Pc(810) int local810 = local729 * local772 - local740 * local761;
			while (local792 > 8192 || local801 > 8192 || local810 > 8192 || local792 < -8192 || local801 < -8192 || local810 < -8192) {
				local801 >>= 0x1;
				local810 >>= 0x1;
				local792 >>= 0x1;
			}
			@Pc(865) int local865 = (int) Math.sqrt((double) (local810 * local810 + local801 * local801 + local792 * local792));
			if (local865 <= 0) {
				local865 = 1;
			}
			local792 = local792 * 256 / local865;
			local801 = local801 * 256 / local865;
			local810 = local810 * 256 / local865;
			@Pc(897) byte local897 = arg1.aByteArray54 == null ? 0 : arg1.aByteArray54[local487];
			if (local897 == 0) {
				@Pc(903) Class133 local903 = local411[local708];
				local903.anInt3402 += local792;
				local903.anInt3407++;
				local903.anInt3401 += local810;
				local903.anInt3405 += local801;
				@Pc(931) Class133 local931 = local411[local713];
				local931.anInt3405 += local801;
				local931.anInt3401 += local810;
				local931.anInt3407++;
				local931.anInt3402 += local792;
				@Pc(959) Class133 local959 = local411[local718];
				local959.anInt3401 += local810;
				local959.anInt3407++;
				local959.anInt3402 += local792;
				local959.anInt3405 += local801;
			} else if (local897 == 1) {
				@Pc(996) Class277 local996 = local699[local487] = new Class277();
				local996.anInt7170 = local801;
				local996.anInt7167 = local810;
				local996.anInt7171 = local792;
			}
		}
		@Pc(1022) int local1022;
		@Pc(1065) short local1065;
		for (local166 = 0; local166 < this.anInt7301; local166++) {
			local1022 = local15[local166];
			@Pc(1029) int local1029 = arg1.aShortArray55[local1022] & 0xFFFF;
			if (arg1.aByteArray59 == null) {
				local729 = -1;
			} else {
				local729 = arg1.aByteArray59[local1022];
			}
			if (arg1.aByteArray56 == null) {
				local740 = 0;
			} else {
				local740 = arg1.aByteArray56[local1022] & 0xFF;
			}
			local1065 = arg1.aShortArray51 == null ? -1 : arg1.aShortArray51[local1022];
			if (local1065 != -1 && (this.anInt7336 & 0x40) != 0) {
				@Pc(1080) Class175 local1080 = local11.method1492(local1065 & 0xFFFF);
				if (local1080.aBoolean308) {
					local1065 = -1;
				}
			}
			@Pc(1087) float local1087 = 0.0F;
			@Pc(1089) float local1089 = 0.0F;
			@Pc(1091) float local1091 = 0.0F;
			@Pc(1093) float local1093 = 0.0F;
			@Pc(1095) float local1095 = 0.0F;
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) byte local1099 = 0;
			@Pc(1101) byte local1101 = 0;
			@Pc(1103) int local1103 = 0;
			@Pc(1137) byte local1137;
			@Pc(1157) short local1157;
			@Pc(1162) short local1162;
			@Pc(1167) short local1167;
			if (local1065 != -1) {
				if (local729 == -1) {
					local1099 = 1;
					local1093 = 1.0F;
					local1097 = 0.0F;
					local1095 = 0.0F;
					local1101 = 2;
					local1089 = 1.0F;
					local1091 = 1.0F;
					local1087 = 0.0F;
				} else {
					local729 &= 0xFF;
					local1137 = arg1.aByteArray57[local729];
					@Pc(1147) short local1147;
					@Pc(1152) short local1152;
					@Pc(1190) float local1190;
					@Pc(1198) float local1198;
					@Pc(1206) float local1206;
					@Pc(1291) float local1291;
					@Pc(1300) float local1300;
					@Pc(1308) float local1308;
					@Pc(1316) float local1316;
					@Pc(1325) float local1325;
					@Pc(1334) float local1334;
					if (local1137 == 0) {
						local1147 = arg1.aShortArray53[local1022];
						local1152 = arg1.aShortArray54[local1022];
						local1157 = arg1.aShortArray50[local1022];
						local1162 = arg1.aShortArray49[local729];
						local1167 = arg1.aShortArray58[local729];
						@Pc(1172) short local1172 = arg1.aShortArray57[local729];
						@Pc(1178) float local1178 = (float) arg1.anIntArray312[local1162];
						@Pc(1184) float local1184 = (float) arg1.anIntArray317[local1162];
						local1190 = arg1.anIntArray315[local1162];
						local1198 = (float) arg1.anIntArray312[local1167] - local1178;
						local1206 = (float) arg1.anIntArray317[local1167] - local1184;
						@Pc(1214) float local1214 = (float) arg1.anIntArray315[local1167] - local1190;
						@Pc(1222) float local1222 = (float) arg1.anIntArray312[local1172] - local1178;
						@Pc(1230) float local1230 = (float) arg1.anIntArray317[local1172] - local1184;
						@Pc(1239) float local1239 = (float) arg1.anIntArray315[local1172] - local1190;
						@Pc(1247) float local1247 = (float) arg1.anIntArray312[local1147] - local1178;
						@Pc(1256) float local1256 = (float) arg1.anIntArray317[local1147] - local1184;
						@Pc(1264) float local1264 = (float) arg1.anIntArray315[local1147] - local1190;
						@Pc(1273) float local1273 = (float) arg1.anIntArray312[local1152] - local1178;
						@Pc(1282) float local1282 = (float) arg1.anIntArray317[local1152] - local1184;
						local1291 = (float) arg1.anIntArray315[local1152] - local1190;
						local1300 = (float) arg1.anIntArray312[local1157] - local1178;
						local1308 = (float) arg1.anIntArray317[local1157] - local1184;
						local1316 = (float) arg1.anIntArray315[local1157] - local1190;
						local1325 = local1239 * local1206 - local1230 * local1214;
						local1334 = local1214 * local1222 - local1198 * local1239;
						@Pc(1342) float local1342 = local1230 * local1198 - local1222 * local1206;
						@Pc(1350) float local1350 = local1230 * local1342 - local1239 * local1334;
						@Pc(1358) float local1358 = local1325 * local1239 - local1222 * local1342;
						@Pc(1367) float local1367 = local1222 * local1334 - local1230 * local1325;
						@Pc(1381) float local1381 = 1.0F / (local1350 * local1198 + local1358 * local1206 + local1214 * local1367);
						local1095 = (local1316 * local1367 + local1308 * local1358 + local1300 * local1350) * local1381;
						local1087 = local1381 * (local1264 * local1367 + local1256 * local1358 + local1247 * local1350);
						local1091 = local1381 * (local1291 * local1367 + local1350 * local1273 + local1358 * local1282);
						@Pc(1431) float local1431 = local1325 * local1214 - local1198 * local1342;
						@Pc(1439) float local1439 = local1198 * local1334 - local1325 * local1206;
						@Pc(1448) float local1448 = local1206 * local1342 - local1214 * local1334;
						@Pc(1462) float local1462 = 1.0F / (local1439 * local1239 + local1448 * local1222 + local1431 * local1230);
						local1097 = (local1448 * local1300 + local1431 * local1308 + local1439 * local1316) * local1462;
						local1089 = (local1256 * local1431 + local1247 * local1448 + local1439 * local1264) * local1462;
						local1093 = local1462 * (local1448 * local1273 + local1282 * local1431 + local1439 * local1291);
					} else {
						local1147 = arg1.aShortArray53[local1022];
						local1152 = arg1.aShortArray54[local1022];
						local1157 = arg1.aShortArray50[local1022];
						@Pc(1526) int local1526 = local695.anIntArray268[local729];
						@Pc(1531) int local1531 = local695.anIntArray266[local729];
						@Pc(1536) int local1536 = local695.anIntArray265[local729];
						@Pc(1541) float[] local1541 = local695.aFloatArrayArray12[local729];
						@Pc(1546) byte local1546 = arg1.aByteArray53[local729];
						local1190 = (float) arg1.anIntArray316[local729] / 256.0F;
						if (local1137 == 1) {
							local1198 = (float) arg1.anIntArray309[local729] / 1024.0F;
							Static277.method3848(arg1.anIntArray317[local1147], local1526, arg1.anIntArray312[local1147], arg1.anIntArray315[local1147], local1546, local1531, local1190, local1198, local1541, Static641.aFloatArray85, local1536);
							local1089 = Static641.aFloatArray85[1];
							local1087 = Static641.aFloatArray85[0];
							Static277.method3848(arg1.anIntArray317[local1152], local1526, arg1.anIntArray312[local1152], arg1.anIntArray315[local1152], local1546, local1531, local1190, local1198, local1541, Static641.aFloatArray85, local1536);
							local1091 = Static641.aFloatArray85[0];
							local1093 = Static641.aFloatArray85[1];
							Static277.method3848(arg1.anIntArray317[local1157], local1526, arg1.anIntArray312[local1157], arg1.anIntArray315[local1157], local1546, local1531, local1190, local1198, local1541, Static641.aFloatArray85, local1536);
							local1095 = Static641.aFloatArray85[0];
							local1097 = Static641.aFloatArray85[1];
							local1206 = local1198 / 2.0F;
							if ((local1546 & 0x1) == 0) {
								if (local1206 < local1091 - local1087) {
									local1099 = 1;
									local1091 -= local1198;
								} else if (local1206 < local1087 - local1091) {
									local1099 = 2;
									local1091 += local1198;
								}
								if (local1206 < local1095 - local1087) {
									local1095 -= local1198;
									local1101 = 1;
								} else if (local1206 < local1087 - local1095) {
									local1101 = 2;
									local1095 += local1198;
								}
							} else {
								if (local1206 < local1097 - local1089) {
									local1097 -= local1198;
									local1101 = 1;
								} else if (local1089 - local1097 > local1206) {
									local1101 = 2;
									local1097 += local1198;
								}
								if (local1093 - local1089 > local1206) {
									local1093 -= local1198;
									local1099 = 1;
								} else if (local1089 - local1093 > local1206) {
									local1099 = 2;
									local1093 += local1198;
								}
							}
						} else if (local1137 == 2) {
							local1198 = (float) arg1.anIntArray311[local729] / 256.0F;
							local1206 = (float) arg1.anIntArray314[local729] / 256.0F;
							@Pc(1590) int local1590 = arg1.anIntArray312[local1152] - arg1.anIntArray312[local1147];
							@Pc(1601) int local1601 = arg1.anIntArray317[local1152] - arg1.anIntArray317[local1147];
							@Pc(1611) int local1611 = arg1.anIntArray315[local1152] - arg1.anIntArray315[local1147];
							@Pc(1622) int local1622 = arg1.anIntArray312[local1157] - arg1.anIntArray312[local1147];
							@Pc(1632) int local1632 = arg1.anIntArray317[local1157] - arg1.anIntArray317[local1147];
							@Pc(1643) int local1643 = arg1.anIntArray315[local1157] - arg1.anIntArray315[local1147];
							@Pc(1652) int local1652 = local1643 * local1601 - local1611 * local1632;
							@Pc(1661) int local1661 = local1622 * local1611 - local1590 * local1643;
							@Pc(1669) int local1669 = local1590 * local1632 - local1601 * local1622;
							local1291 = 64.0F / (float) arg1.anIntArray310[local729];
							local1300 = 64.0F / (float) arg1.anIntArray318[local729];
							local1308 = 64.0F / (float) arg1.anIntArray309[local729];
							local1316 = ((float) local1669 * local1541[2] + (float) local1652 * local1541[0] + (float) local1661 * local1541[1]) / local1291;
							local1325 = ((float) local1661 * local1541[4] + (float) local1652 * local1541[3] + (float) local1669 * local1541[5]) / local1300;
							local1334 = ((float) local1661 * local1541[7] + (float) local1652 * local1541[6] + local1541[8] * (float) local1669) / local1308;
							local1103 = Static558.method7645(local1334, local1316, local1325);
							Static557.method7637(local1103, local1190, local1531, Static641.aFloatArray85, local1526, local1541, local1206, arg1.anIntArray315[local1147], local1536, local1546, arg1.anIntArray317[local1147], arg1.anIntArray312[local1147], local1198);
							local1087 = Static641.aFloatArray85[0];
							local1089 = Static641.aFloatArray85[1];
							Static557.method7637(local1103, local1190, local1531, Static641.aFloatArray85, local1526, local1541, local1206, arg1.anIntArray315[local1152], local1536, local1546, arg1.anIntArray317[local1152], arg1.anIntArray312[local1152], local1198);
							local1093 = Static641.aFloatArray85[1];
							local1091 = Static641.aFloatArray85[0];
							Static557.method7637(local1103, local1190, local1531, Static641.aFloatArray85, local1526, local1541, local1206, arg1.anIntArray315[local1157], local1536, local1546, arg1.anIntArray317[local1157], arg1.anIntArray312[local1157], local1198);
							local1097 = Static641.aFloatArray85[1];
							local1095 = Static641.aFloatArray85[0];
						} else if (local1137 == 3) {
							Static94.method1469(Static641.aFloatArray85, arg1.anIntArray312[local1147], local1526, local1531, local1541, local1190, arg1.anIntArray315[local1147], local1536, arg1.anIntArray317[local1147], local1546);
							local1089 = Static641.aFloatArray85[1];
							local1087 = Static641.aFloatArray85[0];
							Static94.method1469(Static641.aFloatArray85, arg1.anIntArray312[local1152], local1526, local1531, local1541, local1190, arg1.anIntArray315[local1152], local1536, arg1.anIntArray317[local1152], local1546);
							local1093 = Static641.aFloatArray85[1];
							local1091 = Static641.aFloatArray85[0];
							Static94.method1469(Static641.aFloatArray85, arg1.anIntArray312[local1157], local1526, local1531, local1541, local1190, arg1.anIntArray315[local1157], local1536, arg1.anIntArray317[local1157], local1546);
							local1095 = Static641.aFloatArray85[0];
							local1097 = Static641.aFloatArray85[1];
							if ((local1546 & 0x1) == 0) {
								if (local1091 - local1087 > 0.5F) {
									local1099 = 1;
									local1091--;
								} else if (local1087 - local1091 > 0.5F) {
									local1091++;
									local1099 = 2;
								}
								if (local1095 - local1087 > 0.5F) {
									local1095--;
									local1101 = 1;
								} else if (local1087 - local1095 > 0.5F) {
									local1095++;
									local1101 = 2;
								}
							} else {
								if (local1097 - local1089 > 0.5F) {
									local1101 = 1;
									local1097--;
								} else if (local1089 - local1097 > 0.5F) {
									local1101 = 2;
									local1097++;
								}
								if (local1093 - local1089 > 0.5F) {
									local1093--;
									local1099 = 1;
								} else if (local1089 - local1093 > 0.5F) {
									local1093++;
									local1099 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray54 == null) {
				local1137 = 0;
			} else {
				local1137 = arg1.aByteArray54[local1022];
			}
			if (local1137 == 0) {
				@Pc(2324) long local2324 = (long) (local729 << 2) + ((long) local740 + (long) (local1029 << 8) + (long) (local1103 << 24) << 32);
				local1157 = arg1.aShortArray53[local1022];
				local1162 = arg1.aShortArray54[local1022];
				local1167 = arg1.aShortArray50[local1022];
				@Pc(2343) Class133 local2343 = local411[local1157];
				this.aShortArray101[local166] = this.method6233(local2343.anInt3402, local2324, local2343.anInt3405, local2343.anInt3407, arg1, local2343.anInt3401, local1157, local1087, local166, local1089);
				@Pc(2368) Class133 local2368 = local411[local1162];
				this.aShortArray94[local166] = this.method6233(local2368.anInt3402, local2324 + (long) local1099, local2368.anInt3405, local2368.anInt3407, arg1, local2368.anInt3401, local1162, local1091, local166, local1093);
				@Pc(2396) Class133 local2396 = local411[local1167];
				this.aShortArray96[local166] = this.method6233(local2396.anInt3402, local2324 + (long) local1101, local2396.anInt3405, local2396.anInt3407, arg1, local2396.anInt3401, local1167, local1095, local166, local1097);
			} else if (local1137 == 1) {
				@Pc(2431) Class277 local2431 = local699[local1022];
				@Pc(2476) long local2476 = (long) ((local2431.anInt7171 > 0 ? 1024 : 2048) + (local729 << 2) + (local2431.anInt7170 + 256 << 12) + (local2431.anInt7167 + 256 << 22)) + ((long) local740 + (long) (local1103 << 24) + (long) (local1029 << 8) << 32);
				this.aShortArray101[local166] = this.method6233(local2431.anInt7171, local2476, local2431.anInt7170, 0, arg1, local2431.anInt7167, arg1.aShortArray53[local1022], local1087, local166, local1089);
				this.aShortArray94[local166] = this.method6233(local2431.anInt7171, (long) local1099 + local2476, local2431.anInt7170, 0, arg1, local2431.anInt7167, arg1.aShortArray54[local1022], local1091, local166, local1093);
				this.aShortArray96[local166] = this.method6233(local2431.anInt7171, local2476 + (long) local1101, local2431.anInt7170, 0, arg1, local2431.anInt7167, arg1.aShortArray50[local1022], local1095, local166, local1097);
			}
			if (arg1.aByteArray56 != null) {
				this.aByteArray86[local166] = arg1.aByteArray56[local1022];
			}
			if (arg1.aShortArray56 != null) {
				this.aShortArray99[local166] = arg1.aShortArray56[local1022];
			}
			this.aShortArray100[local166] = arg1.aShortArray55[local1022];
			this.aShortArray104[local166] = local1065;
		}
		if (this.anInt7315 > 0) {
			local1022 = 1;
			local718 = this.aShortArray104[0];
			for (local729 = 0; local729 < this.anInt7315; local729++) {
				@Pc(2610) short local2610 = this.aShortArray104[local729];
				if (local718 != local2610) {
					local718 = local2610;
					local1022++;
				}
			}
			this.anIntArray531 = new int[local1022 + 1];
			this.anIntArray534 = new int[local1022];
			this.anIntArray530 = new int[local1022];
			this.anIntArray531[0] = 0;
			local740 = this.anInt7318;
			local1022 = 0;
			local718 = this.aShortArray104[0];
			local1065 = 0;
			for (local761 = 0; local761 < this.anInt7315; local761++) {
				@Pc(2669) short local2669 = this.aShortArray104[local761];
				if (local2669 != local718) {
					this.anIntArray534[local1022] = local740;
					this.anIntArray530[local1022] = local1065 + 1 - local740;
					local1022++;
					this.anIntArray531[local1022] = local761;
					local740 = this.anInt7318;
					local718 = local2669;
					local1065 = 0;
				}
				@Pc(2709) short local2709 = this.aShortArray101[local761];
				if (local1065 < local2709) {
					local1065 = local2709;
				}
				if (local740 > local2709) {
					local740 = local2709;
				}
				local2709 = this.aShortArray94[local761];
				if (local1065 < local2709) {
					local1065 = local2709;
				}
				if (local740 > local2709) {
					local740 = local2709;
				}
				local2709 = this.aShortArray96[local761];
				if (local2709 > local1065) {
					local1065 = local2709;
				}
				if (local2709 < local740) {
					local740 = local2709;
				}
			}
			this.anIntArray534[local1022] = local740;
			this.anIntArray530[local1022] = local1065 + 1 - local740;
			local1022++;
			this.anIntArray531[local1022] = this.anInt7315;
		}
		Static260.aLongArray20 = null;
		this.aShortArray97 = Static327.method4395(this.anInt7318, this.aShortArray97);
		this.aShortArray95 = Static327.method4395(this.anInt7318, this.aShortArray95);
		this.aShortArray102 = Static327.method4395(this.anInt7318, this.aShortArray102);
		this.aShortArray103 = Static327.method4395(this.anInt7318, this.aShortArray103);
		this.aShortArray93 = Static327.method4395(this.anInt7318, this.aShortArray93);
		this.aByteArray85 = Static352.method4713(this.aByteArray85, this.anInt7318);
		this.aFloatArray44 = Static234.method8396(this.anInt7318, this.aFloatArray44);
		this.aFloatArray43 = Static234.method8396(this.anInt7318, this.aFloatArray43);
		if (arg1.anIntArray308 != null && Static362.method4886(this.anInt7336, arg2)) {
			this.anIntArrayArray45 = arg1.method4004(false);
		}
		if (arg1.aClass245Array1 != null && Static56.method4534(this.anInt7336, arg2)) {
			this.anIntArrayArray43 = arg1.method3991();
		}
		if (arg1.anIntArray313 != null && Static182.method7787(arg2, this.anInt7336)) {
			local1022 = 0;
			@Pc(2897) int[] local2897 = new int[256];
			for (local729 = 0; local729 < this.anInt7301; local729++) {
				local740 = arg1.anIntArray313[local15[local729]];
				if (local740 >= 0) {
					@Pc(2917) int local2917 = local2897[local740]++;
					if (local1022 < local740) {
						local1022 = local740;
					}
				}
			}
			this.anIntArrayArray44 = new int[local1022 + 1][];
			for (local740 = 0; local740 <= local1022; local740++) {
				this.anIntArrayArray44[local740] = new int[local2897[local740]];
				local2897[local740] = 0;
			}
			for (local751 = 0; local751 < this.anInt7301; local751++) {
				local761 = arg1.anIntArray313[local15[local751]];
				if (local761 >= 0) {
					this.anIntArrayArray44[local761][local2897[local761]++] = local751;
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "<init>", descriptor = "(Lclient!pga;IIZZ)V")
	public Class182_Sub3(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean548 = false;
		this.anInt7301 = 0;
		this.anInt7296 = 0;
		this.anInt7315 = 0;
		this.aBoolean549 = false;
		this.anInt7312 = 0;
		this.anInt7318 = 0;
		this.aBoolean550 = false;
		this.aBoolean552 = false;
		this.aBoolean551 = true;
		this.anInt7336 = arg2;
		this.aBoolean548 = arg4;
		this.aClass95_Sub3_18 = arg0;
		this.anInt7317 = arg1;
		if (arg3 || Static137.method1858(this.anInt7336, this.anInt7317)) {
			this.aClass15_1 = new Class15(Static102.method1050(this.anInt7336, this.anInt7317));
		}
		if (arg3 || Static144.method2181(this.anInt7317, this.anInt7336)) {
			this.aClass15_3 = new Class15(Static520.method7260(this.anInt7336, this.anInt7317));
		}
		if (arg3 || Static551.method7578(this.anInt7336, this.anInt7317)) {
			this.aClass15_2 = new Class15(Static279.method3860(this.anInt7336, this.anInt7317));
		}
		if (arg3 || Static616.method8283(this.anInt7317, this.anInt7336)) {
			this.aClass15_4 = new Class15(Static412.method5531(this.anInt7317, this.anInt7336));
		}
		if (arg3 || Static470.method6341(this.anInt7336, this.anInt7317)) {
			this.aClass138_1 = new Class138(Static421.method5623(this.anInt7336, this.anInt7317));
		}
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "()[Lclient!hr;")
	@Override
	public Class143[] method6217() {
		return this.aClass143Array5;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
	private void method6218() {
		if (this.aClass97Array1 == null) {
			return;
		}
		this.aClass95_Sub3_18.C(!this.aBoolean550);
		this.aClass95_Sub3_18.method7076(false);
		this.aClass95_Sub3_18.method7139(1, Static185.aClass291_3);
		this.aClass95_Sub3_18.method7095(1, Static185.aClass291_3);
		for (@Pc(36) int local36 = 0; local36 < this.anInt7346; local36++) {
			@Pc(43) Class97 local43 = this.aClass97Array1[local36];
			@Pc(48) Class187 local48 = this.aClass187Array1[local36];
			if (!local43.aBoolean201 || !this.aClass95_Sub3_18.method6951()) {
				@Pc(76) float local76 = (float) (this.anIntArray533[local43.anInt2573] + this.anIntArray533[local43.anInt2572] + this.anIntArray533[local43.anInt2574]) * 0.3333333F;
				@Pc(97) float local97 = (float) (this.anIntArray532[local43.anInt2574] + this.anIntArray532[local43.anInt2572] + this.anIntArray532[local43.anInt2573]) * 0.3333333F;
				@Pc(119) float local119 = (float) (this.anIntArray535[local43.anInt2572] + this.anIntArray535[local43.anInt2573] + this.anIntArray535[local43.anInt2574]) * 0.3333333F;
				@Pc(133) float local133 = Static184.aFloat50 * local97 + Static108.aFloat20 * local76 + local119 * Static429.aFloat122 + Static326.aFloat96;
				@Pc(147) float local147 = Static139.aFloat46 * local119 + Static84.aFloat12 * local97 + local76 * Static338.aFloat99 + Static569.aFloat194;
				@Pc(161) float local161 = Static194.aFloat193 * local97 + local76 * Static185.aFloat52 + local119 * Static456.aFloat146 + Static406.aFloat86;
				@Pc(182) float local182 = (float) (1.0D / Math.sqrt((double) (local161 * local161 + local133 * local133 + local147 * local147))) * (float) local43.anInt2577;
				@Pc(187) Class177_Sub1 local187 = this.aClass95_Sub3_18.method7041();
				local187.method3831(local48.anInt4723, (float) local48.anInt4719 + local133 - local182 * local133, local48.anInt4713 * local43.aShort30 >> 7, local147 + (float) local48.anInt4714 - local147 * local182, local48.anInt4722 * local43.aShort28 >> 7, local161 - local182 * local161);
				local187.method3832(this.aClass95_Sub3_18.aClass177_Sub1_17);
				this.aClass95_Sub3_18.method7062();
				@Pc(246) int local246 = local48.anInt4715;
				this.aClass95_Sub3_18.method7148(false, false, local43.aShort29);
				this.aClass95_Sub3_18.method7137(local43.aByte32);
				this.aClass95_Sub3_18.method7079(local246);
				this.aClass95_Sub3_18.method7024();
			}
		}
		this.aClass95_Sub3_18.method7095(1, Static10.aClass291_1);
		this.aClass95_Sub3_18.method7139(1, Static10.aClass291_1);
		this.aClass95_Sub3_18.C(true);
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!uha;ZI)Z")
	@Override
	public boolean method6205(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method6222(arg1, -1, arg0, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	private void method6219() {
		if (!this.aBoolean551) {
			return;
		}
		this.aBoolean551 = false;
		if (this.aClass143Array5 == null && this.aClass255Array5 == null && this.aClass97Array1 == null) {
			if (this.anIntArray533 != null && !Static497.method6883(this.anInt7336, this.anInt7317)) {
				if (this.aClass15_1 == null || this.aClass15_1.method422()) {
					if (!this.aBoolean549) {
						this.method6227();
					}
					this.anIntArray533 = null;
				} else {
					this.aBoolean551 = true;
				}
			}
			if (this.anIntArray532 != null && !Static304.method8574(this.anInt7336, this.anInt7317)) {
				if (this.aClass15_1 == null || this.aClass15_1.method422()) {
					if (!this.aBoolean549) {
						this.method6227();
					}
					this.anIntArray532 = null;
				} else {
					this.aBoolean551 = true;
				}
			}
			if (this.anIntArray535 != null && !Static634.method8475(this.anInt7336, this.anInt7317)) {
				if (this.aClass15_1 == null || this.aClass15_1.method422()) {
					if (!this.aBoolean549) {
						this.method6227();
					}
					this.anIntArray535 = null;
				} else {
					this.aBoolean551 = true;
				}
			}
		}
		if (this.lb != null && this.anIntArray533 == null && this.anIntArray532 == null && this.anIntArray535 == null) {
			this.lb = null;
			this.anIntArray529 = null;
		}
		if (this.aByteArray85 != null && !Static142.method2163(this.anInt7336, this.anInt7317)) {
			label197: {
				label196: {
					@Pc(164) boolean local164;
					if ((this.anInt7336 & 0x37) == 0) {
						if (this.aClass15_2 == null || this.aClass15_2.method422()) {
							break label196;
						}
						local164 = false;
					} else {
						if (this.aClass15_4 == null || this.aClass15_4.method422()) {
							break label196;
						}
						local164 = false;
					}
					if (!local164) {
						this.aBoolean551 = true;
						break label197;
					}
				}
				this.aShortArray102 = this.aShortArray103 = this.aShortArray93 = null;
				this.aByteArray85 = null;
			}
		}
		if (this.aShortArray100 != null && !Static87.method1306(this.anInt7317, this.anInt7336)) {
			if (this.aClass15_2 == null || this.aClass15_2.method422()) {
				this.aShortArray100 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.aByteArray86 != null && !Static528.method7292(this.anInt7336, this.anInt7317)) {
			if (this.aClass15_2 == null || this.aClass15_2.method422()) {
				this.aByteArray86 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.aFloatArray44 != null && !Static158.method2366(this.anInt7317, this.anInt7336)) {
			if (this.aClass15_3 == null || this.aClass15_3.method422()) {
				this.aFloatArray44 = this.aFloatArray43 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.aShortArray104 != null && !Static632.method8447(this.anInt7336, this.anInt7317)) {
			if (this.aClass15_2 == null || this.aClass15_2.method422()) {
				this.aShortArray104 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.aShortArray101 != null && !Static69.method964(this.anInt7317, this.anInt7336)) {
			if ((this.aClass138_1 == null || this.aClass138_1.method2943()) && (this.aClass15_2 == null || this.aClass15_2.method422())) {
				this.aShortArray101 = this.aShortArray94 = this.aShortArray96 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.aShortArray97 != null) {
			if (this.aClass15_1 == null || this.aClass15_1.method422()) {
				this.aShortArray97 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.aShortArray95 != null) {
			if (this.aClass15_2 == null || this.aClass15_2.method422()) {
				this.aShortArray95 = null;
			} else {
				this.aBoolean551 = true;
			}
		}
		if (this.anIntArrayArray44 != null && !Static182.method7787(this.anInt7317, this.anInt7336)) {
			this.anIntArrayArray44 = null;
			this.aShortArray99 = null;
		}
		if (this.anIntArrayArray45 != null && !Static362.method4886(this.anInt7336, this.anInt7317)) {
			this.anIntArrayArray45 = null;
			this.aShortArray98 = null;
		}
		if (this.anIntArrayArray43 != null && !Static56.method4534(this.anInt7336, this.anInt7317)) {
			this.anIntArrayArray43 = null;
		}
		if (this.anIntArray531 != null && (this.anInt7317 & 0x800) == 0 && (this.anInt7317 & 0x40000) == 0) {
			this.anIntArray534 = null;
			this.anIntArray530 = null;
			this.anIntArray531 = null;
		}
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(I)V")
	private void method6220() {
		if (this.aClass15_1 != null) {
			this.aClass15_1.aBoolean39 = false;
		}
	}

	@OriginalMember(owner = "client!qd", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7355;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "()[Lclient!oo;")
	@Override
	public Class255[] method6196() {
		return this.aClass255Array5;
	}

	@OriginalMember(owner = "client!qd", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7284;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt7301; local7++) {
			local16 = this.aShortArray100[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += arg3 * (arg0 - local22) >> 7;
			}
			@Pc(61) int local61 = local16 & 0x7F;
			if (arg2 != -1) {
				local61 += arg3 * (arg2 - local61) >> 7;
			}
			this.aShortArray100[local7] = (short) (local22 << 10 | local28 << 7 | local61);
		}
		if (this.aClass97Array1 != null) {
			for (local16 = 0; local16 < this.anInt7346; local16++) {
				@Pc(107) Class97 local107 = this.aClass97Array1[local16];
				@Pc(112) Class187 local112 = this.aClass187Array1[local16];
				local112.anInt4715 = Static343.anIntArray359[this.aShortArray100[local107.anInt2571] & 0xFFFF] & 0xFFFFFF | local112.anInt4715 & 0xFF000000;
			}
		}
		this.method6223();
	}

	@OriginalMember(owner = "client!qd", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7356;
	}

	@OriginalMember(owner = "client!qd", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static218.anInt10033 = 0;
			local14 = 0;
			Static364.anInt5767 = 0;
			Static164.anInt2940 = 0;
			for (local20 = 0; local20 < this.anInt7312; local20++) {
				Static218.anInt10033 += this.anIntArray533[local20];
				Static364.anInt5767 += this.anIntArray532[local20];
				Static164.anInt2940 += this.anIntArray535[local20];
				local14++;
			}
			if (local14 <= 0) {
				Static364.anInt5767 = arg2;
				Static164.anInt2940 = arg3;
				Static218.anInt10033 = arg1;
			} else {
				Static364.anInt5767 = Static364.anInt5767 / local14 + arg2;
				Static218.anInt10033 = Static218.anInt10033 / local14 + arg1;
				Static164.anInt2940 = arg3 + Static164.anInt2940 / local14;
			}
		} else if (arg0 == 1) {
			for (local14 = 0; local14 < this.anInt7312; local14++) {
				this.anIntArray533[local14] += arg1;
				this.anIntArray532[local14] += arg2;
				this.anIntArray535[local14] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local14 = 0; local14 < this.anInt7312; local14++) {
					this.anIntArray533[local14] -= Static218.anInt10033;
					this.anIntArray532[local14] -= Static364.anInt5767;
					this.anIntArray535[local14] -= Static164.anInt2940;
					if (arg3 != 0) {
						local20 = Canvas_Sub1.anIntArray497[arg3];
						local163 = Canvas_Sub1.anIntArray498[arg3];
						local181 = local163 * this.anIntArray533[local14] + local20 * this.anIntArray532[local14] + 16383 >> 14;
						this.anIntArray532[local14] = local163 * this.anIntArray532[local14] + 16383 - this.anIntArray533[local14] * local20 >> 14;
						this.anIntArray533[local14] = local181;
					}
					if (arg1 != 0) {
						local20 = Canvas_Sub1.anIntArray497[arg1];
						local163 = Canvas_Sub1.anIntArray498[arg1];
						local181 = local163 * this.anIntArray532[local14] + 16383 - this.anIntArray535[local14] * local20 >> 14;
						this.anIntArray535[local14] = this.anIntArray535[local14] * local163 + this.anIntArray532[local14] * local20 + 16383 >> 14;
						this.anIntArray532[local14] = local181;
					}
					if (arg2 != 0) {
						local20 = Canvas_Sub1.anIntArray497[arg2];
						local163 = Canvas_Sub1.anIntArray498[arg2];
						local181 = local163 * this.anIntArray533[local14] + this.anIntArray535[local14] * local20 + 16383 >> 14;
						this.anIntArray535[local14] = this.anIntArray535[local14] * local163 + 16383 - local20 * this.anIntArray533[local14] >> 14;
						this.anIntArray533[local14] = local181;
					}
					this.anIntArray533[local14] += Static218.anInt10033;
					this.anIntArray532[local14] += Static364.anInt5767;
					this.anIntArray535[local14] += Static164.anInt2940;
				}
			} else if (arg0 == 3) {
				for (local14 = 0; local14 < this.anInt7312; local14++) {
					this.anIntArray533[local14] -= Static218.anInt10033;
					this.anIntArray532[local14] -= Static364.anInt5767;
					this.anIntArray535[local14] -= Static164.anInt2940;
					this.anIntArray533[local14] = arg1 * this.anIntArray533[local14] / 128;
					this.anIntArray532[local14] = arg2 * this.anIntArray532[local14] / 128;
					this.anIntArray535[local14] = this.anIntArray535[local14] * arg3 / 128;
					this.anIntArray533[local14] += Static218.anInt10033;
					this.anIntArray532[local14] += Static364.anInt5767;
					this.anIntArray535[local14] += Static164.anInt2940;
				}
			} else {
				@Pc(514) Class97 local514;
				@Pc(519) Class187 local519;
				if (arg0 == 5) {
					for (local14 = 0; local14 < this.anInt7301; local14++) {
						local20 = (this.aByteArray86[local14] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray86[local14] = (byte) local20;
					}
					if (this.aClass97Array1 != null) {
						for (local20 = 0; local20 < this.anInt7346; local20++) {
							local514 = this.aClass97Array1[local20];
							local519 = this.aClass187Array1[local20];
							local519.anInt4715 = 255 - (this.aByteArray86[local514.anInt2571] & 0xFF) << 24 | local519.anInt4715 & 0xFFFFFF;
						}
					}
					this.method6223();
				} else if (arg0 == 7) {
					for (local14 = 0; local14 < this.anInt7301; local14++) {
						local20 = this.aShortArray100[local14] & 0xFFFF;
						local163 = local20 >> 10 & 0x3F;
						local181 = local20 >> 7 & 0x7;
						local181 += arg2 / 4;
						@Pc(589) int local589 = local20 & 0x7F;
						@Pc(595) int local595 = local163 + arg1 & 0x3F;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						local589 += arg3;
						if (local589 < 0) {
							local589 = 0;
						} else if (local589 > 127) {
							local589 = 127;
						}
						this.aShortArray100[local14] = (short) (local589 | local181 << 7 | local595 << 10);
					}
					if (this.aClass97Array1 != null) {
						for (local20 = 0; local20 < this.anInt7346; local20++) {
							local514 = this.aClass97Array1[local20];
							local519 = this.aClass187Array1[local20];
							local519.anInt4715 = local519.anInt4715 & 0xFF000000 | Static343.anIntArray359[this.aShortArray100[local514.anInt2571] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method6223();
				} else {
					@Pc(710) Class187 local710;
					if (arg0 == 8) {
						for (local14 = 0; local14 < this.anInt7346; local14++) {
							local710 = this.aClass187Array1[local14];
							local710.anInt4719 += arg1;
							local710.anInt4714 += arg2;
						}
					} else if (arg0 == 10) {
						for (local14 = 0; local14 < this.anInt7346; local14++) {
							local710 = this.aClass187Array1[local14];
							local710.anInt4722 = arg2 * local710.anInt4722 >> 7;
							local710.anInt4713 = arg1 * local710.anInt4713 >> 7;
						}
					} else if (arg0 == 9) {
						for (local14 = 0; local14 < this.anInt7346; local14++) {
							local710 = this.aClass187Array1[local14];
							local710.anInt4723 = local710.anInt4723 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILclient!uha;ZII)Z")
	@Override
	public boolean method6203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class177 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method6222(arg1, arg5, arg0, arg2, arg4, arg3);
	}

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7312; local7++) {
			this.anIntArray535[local7] = -this.anIntArray535[local7];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt7318; local25++) {
			this.aShortArray93[local25] = (short) -this.aShortArray93[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt7301; local44++) {
			@Pc(51) short local51 = this.aShortArray101[local44];
			this.aShortArray101[local44] = this.aShortArray96[local44];
			this.aShortArray96[local44] = local51;
		}
		this.method6220();
		this.method6221();
		this.method6234();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7312; local7++) {
			if (arg0 != 128) {
				this.anIntArray533[local7] = arg0 * this.anIntArray533[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray532[local7] = this.anIntArray532[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray535[local7] = this.anIntArray535[local7] * arg2 >> 7;
			}
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort102;
	}

	@OriginalMember(owner = "client!qd", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean552;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!uha;Lclient!au;II)V")
	@Override
	public void method6194(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt7318 == 0) {
			return;
		}
		@Pc(16) Class177_Sub1 local16 = this.aClass95_Sub3_18.aClass177_Sub1_16;
		if (!this.aBoolean549) {
			this.method6227();
		}
		@Pc(25) Class177_Sub1 local25 = (Class177_Sub1) arg0;
		Static194.aFloat193 = local25.aFloat77 * local16.aFloat74 + local16.aFloat75 * local25.aFloat80 + local25.aFloat81 * local16.aFloat77;
		Static406.aFloat86 = local16.aFloat73 + local16.aFloat75 * local25.aFloat79 + local25.aFloat78 * local16.aFloat77 + local25.aFloat73 * local16.aFloat74;
		@Pc(72) float local72 = (float) this.anInt7335 * Static194.aFloat193 + Static406.aFloat86;
		@Pc(80) float local80 = (float) this.anInt7355 * Static194.aFloat193 + Static406.aFloat86;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = local72 + (float) this.anInt7359;
			local96 = local80 - (float) this.anInt7359;
		} else {
			local90 = local80 + (float) this.anInt7359;
			local96 = local72 - (float) this.anInt7359;
		}
		if (this.aClass95_Sub3_18.aFloat177 <= local96 || local90 <= (float) this.aClass95_Sub3_18.anInt8377) {
			return;
		}
		Static326.aFloat96 = local16.aFloat79 + local25.aFloat73 * local16.aFloat82 + local16.aFloat83 * local25.aFloat79 + local25.aFloat78 * local16.aFloat80;
		Static184.aFloat50 = local16.aFloat80 * local25.aFloat81 + local16.aFloat83 * local25.aFloat80 + local16.aFloat82 * local25.aFloat77;
		@Pc(172) float local172 = (float) this.anInt7335 * Static184.aFloat50 + Static326.aFloat96;
		@Pc(180) float local180 = (float) this.anInt7355 * Static184.aFloat50 + Static326.aFloat96;
		@Pc(195) float local195;
		@Pc(206) float local206;
		if (local172 > local180) {
			local195 = (local180 - (float) this.anInt7359) * (float) this.aClass95_Sub3_18.anInt8354;
			local206 = (local172 + (float) this.anInt7359) * (float) this.aClass95_Sub3_18.anInt8354;
		} else {
			local206 = (float) this.aClass95_Sub3_18.anInt8354 * (local180 + (float) this.anInt7359);
			local195 = ((float) -this.anInt7359 + local172) * (float) this.aClass95_Sub3_18.anInt8354;
		}
		if (this.aClass95_Sub3_18.aFloat173 <= local195 / (float) arg2 || local206 / (float) arg2 <= this.aClass95_Sub3_18.aFloat185) {
			return;
		}
		Static84.aFloat12 = local16.aFloat76 * local25.aFloat77 + local25.aFloat80 * local16.aFloat84 + local25.aFloat81 * local16.aFloat81;
		Static569.aFloat194 = local16.aFloat78 + local16.aFloat76 * local25.aFloat73 + local25.aFloat79 * local16.aFloat84 + local25.aFloat78 * local16.aFloat81;
		@Pc(298) float local298 = Static84.aFloat12 * (float) this.anInt7335 + Static569.aFloat194;
		@Pc(306) float local306 = Static569.aFloat194 + (float) this.anInt7355 * Static84.aFloat12;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local306 < local298) {
			local321 = (local306 - (float) this.anInt7359) * (float) this.aClass95_Sub3_18.anInt8379;
			local332 = (float) this.aClass95_Sub3_18.anInt8379 * ((float) this.anInt7359 + local298);
		} else {
			local321 = (local298 - (float) this.anInt7359) * (float) this.aClass95_Sub3_18.anInt8379;
			local332 = ((float) this.anInt7359 + local306) * (float) this.aClass95_Sub3_18.anInt8379;
		}
		if (this.aClass95_Sub3_18.aFloat184 <= local321 / (float) arg2 || this.aClass95_Sub3_18.aFloat186 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass97Array1 != null) {
			Static456.aFloat146 = local25.aFloat76 * local16.aFloat77 + local25.aFloat82 * local16.aFloat75 + local16.aFloat74 * local25.aFloat74;
			Static139.aFloat46 = local16.aFloat84 * local25.aFloat82 + local16.aFloat81 * local25.aFloat76 + local16.aFloat76 * local25.aFloat74;
			Static185.aFloat52 = local25.aFloat75 * local16.aFloat74 + local25.aFloat84 * local16.aFloat77 + local16.aFloat75 * local25.aFloat83;
			Static429.aFloat122 = local25.aFloat74 * local16.aFloat82 + local25.aFloat76 * local16.aFloat80 + local16.aFloat83 * local25.aFloat82;
			Static338.aFloat99 = local16.aFloat76 * local25.aFloat75 + local25.aFloat83 * local16.aFloat84 + local25.aFloat84 * local16.aFloat81;
			Static108.aFloat20 = local16.aFloat80 * local25.aFloat84 + local25.aFloat83 * local16.aFloat83 + local25.aFloat75 * local16.aFloat82;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt7343 + this.anInt7356 >> 1;
			@Pc(507) int local507 = this.anInt7348 + this.anInt7305 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static429.aFloat122 + Static108.aFloat20 * (float) local499 + Static326.aFloat96 + (float) this.anInt7335 * Static184.aFloat50);
			@Pc(545) int local545 = (int) (Static338.aFloat99 * (float) local499 + Static569.aFloat194 + Static84.aFloat12 * (float) this.anInt7335 + (float) local507 * Static139.aFloat46);
			@Pc(564) int local564 = (int) (Static406.aFloat86 + (float) local499 * Static185.aFloat52 + (float) this.anInt7335 * Static194.aFloat193 + Static456.aFloat146 * (float) local507);
			@Pc(583) int local583 = (int) (Static326.aFloat96 + (float) local499 * Static108.aFloat20 + Static184.aFloat50 * (float) this.anInt7355 + Static429.aFloat122 * (float) local507);
			@Pc(602) int local602 = (int) (Static84.aFloat12 * (float) this.anInt7355 + (float) local499 * Static338.aFloat99 + Static569.aFloat194 + Static139.aFloat46 * (float) local507);
			arg1.anInt604 = local545 * this.aClass95_Sub3_18.anInt8379 / arg2 + this.aClass95_Sub3_18.anInt8386;
			arg1.anInt607 = this.aClass95_Sub3_18.anInt8386 + this.aClass95_Sub3_18.anInt8379 * local602 / arg2;
			arg1.anInt603 = this.aClass95_Sub3_18.anInt8358 + this.aClass95_Sub3_18.anInt8354 * local526 / arg2;
			arg1.anInt605 = this.aClass95_Sub3_18.anInt8358 + local583 * this.aClass95_Sub3_18.anInt8354 / arg2;
			@Pc(674) int local674 = (int) (Static456.aFloat146 * (float) local507 + Static406.aFloat86 + Static185.aFloat52 * (float) local499 + (float) this.anInt7355 * Static194.aFloat193);
			if (this.aClass95_Sub3_18.anInt8377 <= local564 || this.aClass95_Sub3_18.anInt8377 <= local674) {
				arg1.aBoolean48 = true;
				arg1.anInt606 = this.aClass95_Sub3_18.anInt8358 + this.aClass95_Sub3_18.anInt8354 * (this.anInt7359 + local526) / arg2 - arg1.anInt603;
			}
		}
		this.aClass95_Sub3_18.method7111((float) arg2);
		this.aClass95_Sub3_18.method7149();
		this.aClass95_Sub3_18.method7018(local25);
		this.method6229();
		this.method6218();
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "(I)V")
	private void method6221() {
		if ((this.anInt7336 & 0x37) == 0) {
			if (this.aClass15_2 == null) {
				return;
			}
			this.aClass15_2.aBoolean39 = false;
		} else if (this.aClass15_4 != null) {
			this.aClass15_4.aBoolean39 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIBILclient!uha;IZ)Z")
	private boolean method6222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class177 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class177_Sub1 local8 = (Class177_Sub1) arg3;
		@Pc(12) Class177_Sub1 local12 = this.aClass95_Sub3_18.aClass177_Sub1_16;
		@Pc(33) float local33 = local12.aFloat79 + local12.aFloat82 * local8.aFloat73 + local12.aFloat83 * local8.aFloat79 + local8.aFloat78 * local12.aFloat80;
		@Pc(54) float local54 = local12.aFloat78 + local8.aFloat78 * local12.aFloat81 + local8.aFloat79 * local12.aFloat84 + local8.aFloat73 * local12.aFloat76;
		Static184.aFloat50 = local8.aFloat81 * local12.aFloat80 + local8.aFloat80 * local12.aFloat83 + local8.aFloat77 * local12.aFloat82;
		@Pc(93) float local93 = local12.aFloat73 + local8.aFloat73 * local12.aFloat74 + local12.aFloat75 * local8.aFloat79 + local12.aFloat77 * local8.aFloat78;
		Static456.aFloat146 = local8.aFloat74 * local12.aFloat74 + local8.aFloat76 * local12.aFloat77 + local8.aFloat82 * local12.aFloat75;
		Static429.aFloat122 = local12.aFloat83 * local8.aFloat82 + local8.aFloat76 * local12.aFloat80 + local8.aFloat74 * local12.aFloat82;
		Static84.aFloat12 = local12.aFloat81 * local8.aFloat81 + local12.aFloat84 * local8.aFloat80 + local12.aFloat76 * local8.aFloat77;
		Static139.aFloat46 = local8.aFloat82 * local12.aFloat84 + local8.aFloat76 * local12.aFloat81 + local12.aFloat76 * local8.aFloat74;
		Static185.aFloat52 = local8.aFloat84 * local12.aFloat77 + local12.aFloat75 * local8.aFloat83 + local12.aFloat74 * local8.aFloat75;
		Static194.aFloat193 = local8.aFloat77 * local12.aFloat74 + local8.aFloat80 * local12.aFloat75 + local8.aFloat81 * local12.aFloat77;
		Static108.aFloat20 = local8.aFloat75 * local12.aFloat82 + local12.aFloat83 * local8.aFloat83 + local12.aFloat80 * local8.aFloat84;
		Static338.aFloat99 = local12.aFloat76 * local8.aFloat75 + local8.aFloat83 * local12.aFloat84 + local12.aFloat81 * local8.aFloat84;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass95_Sub3_18.anInt8354;
		@Pc(255) int local255 = this.aClass95_Sub3_18.anInt8379;
		if (!this.aBoolean549) {
			this.method6227();
		}
		@Pc(270) int local270 = this.anInt7343 - this.anInt7356 >> 1;
		@Pc(278) int local278 = this.anInt7355 - this.anInt7335 >> 1;
		@Pc(287) int local287 = this.anInt7305 - this.anInt7348 >> 1;
		@Pc(293) int local293 = this.anInt7356 + local270;
		@Pc(298) int local298 = local278 + this.anInt7335;
		@Pc(304) int local304 = this.anInt7348 + local287;
		@Pc(310) int local310 = local293 - (local270 << arg4);
		@Pc(317) int local317 = local298 - (local278 << arg4);
		@Pc(323) int local323 = local304 - (local287 << arg4);
		@Pc(329) int local329 = (local270 << arg4) + local293;
		@Pc(335) int local335 = local298 + (local278 << arg4);
		Static540.anIntArray601[0] = local310;
		@Pc(346) int local346 = local304 + (local287 << arg4);
		Static134.anIntArray163[0] = local317;
		Static337.anIntArray576[0] = local323;
		Static540.anIntArray601[1] = local329;
		Static134.anIntArray163[1] = local317;
		Static540.anIntArray601[2] = local310;
		Static337.anIntArray576[1] = local323;
		Static134.anIntArray163[2] = local335;
		Static540.anIntArray601[3] = local329;
		Static337.anIntArray576[2] = local323;
		Static134.anIntArray163[3] = local335;
		Static540.anIntArray601[4] = local310;
		Static337.anIntArray576[3] = local323;
		Static134.anIntArray163[4] = local317;
		Static337.anIntArray576[4] = local346;
		Static540.anIntArray601[5] = local329;
		Static134.anIntArray163[5] = local317;
		Static540.anIntArray601[6] = local310;
		Static337.anIntArray576[5] = local346;
		Static134.anIntArray163[6] = local335;
		Static337.anIntArray576[6] = local346;
		Static540.anIntArray601[7] = local329;
		Static134.anIntArray163[7] = local335;
		Static337.anIntArray576[7] = local346;
		@Pc(477) float local477;
		@Pc(505) float local505;
		@Pc(491) float local491;
		@Pc(463) float local463;
		@Pc(458) float local458;
		@Pc(453) float local453;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = Static337.anIntArray576[local446];
			local458 = Static134.anIntArray163[local446];
			local463 = Static540.anIntArray601[local446];
			local477 = local453 * Static429.aFloat122 + local458 * Static184.aFloat50 + Static108.aFloat20 * local463 + local33;
			local491 = Static456.aFloat146 * local453 + Static194.aFloat193 * local458 + local463 * Static185.aFloat52 + local93;
			local505 = Static139.aFloat46 * local453 + Static84.aFloat12 * local458 + Static338.aFloat99 * local463 + local54;
			if ((float) this.aClass95_Sub3_18.anInt8377 <= local491) {
				if (arg1 > 0) {
					local491 = arg1;
				}
				@Pc(532) float local532 = (float) this.aClass95_Sub3_18.anInt8358 + (float) local251 * local477 / local491;
				if (local532 > local243) {
					local243 = local532;
				}
				@Pc(550) float local550 = (float) local255 * local505 / local491 + (float) this.aClass95_Sub3_18.anInt8386;
				if (local532 < local241) {
					local241 = local532;
				}
				if (local550 < local245) {
					local245 = local550;
				}
				local239 = true;
				if (local247 < local550) {
					local247 = local550;
				}
			}
		}
		if (local239 && (float) arg2 > local241 && (float) arg2 < local243 && (float) arg0 > local245 && (float) arg0 < local247) {
			if (arg5) {
				return true;
			}
			if (Static287.anIntArray319.length < this.anInt7318) {
				Static595.anIntArray660 = new int[this.anInt7318];
				Static287.anIntArray319 = new int[this.anInt7318];
			}
			@Pc(705) int local705;
			for (@Pc(615) int local615 = 0; local615 < this.anInt7312; local615++) {
				local463 = this.anIntArray533[local615];
				local458 = this.anIntArray532[local615];
				local453 = this.anIntArray535[local615];
				local505 = local54 + local453 * Static139.aFloat46 + local463 * Static338.aFloat99 + Static84.aFloat12 * local458;
				local477 = local453 * Static429.aFloat122 + local463 * Static108.aFloat20 + Static184.aFloat50 * local458 + local33;
				local491 = Static456.aFloat146 * local453 + local463 * Static185.aFloat52 + Static194.aFloat193 * local458 + local93;
				@Pc(718) int local718;
				@Pc(723) int local723;
				@Pc(730) int local730;
				if ((float) this.aClass95_Sub3_18.anInt8377 <= local491) {
					if (arg1 > 0) {
						local491 = arg1;
					}
					local705 = (int) ((float) local251 * local477 / local491 + (float) this.aClass95_Sub3_18.anInt8358);
					local718 = (int) ((float) local255 * local505 / local491 + (float) this.aClass95_Sub3_18.anInt8386);
					local723 = this.anIntArray529[local615];
					local730 = this.anIntArray529[local615 + 1];
					for (@Pc(732) int local732 = local723; local732 < local730; local732++) {
						@Pc(741) int local741 = this.lb[local732] - 1;
						if (local741 == -1) {
							break;
						}
						Static287.anIntArray319[local741] = local705;
						Static595.anIntArray660[local741] = local718;
					}
				} else {
					local705 = this.anIntArray529[local615];
					local718 = this.anIntArray529[local615 + 1];
					for (local723 = local705; local723 < local718; local723++) {
						local730 = this.lb[local723] - 1;
						if (local730 == -1) {
							break;
						}
						Static287.anIntArray319[this.lb[local723] - 1] = -999999;
					}
				}
			}
			for (local705 = 0; local705 < this.anInt7301; local705++) {
				if (Static287.anIntArray319[this.aShortArray101[local705]] != -999999 && Static287.anIntArray319[this.aShortArray94[local705]] != -999999 && Static287.anIntArray319[this.aShortArray96[local705]] != -999999 && this.method6230(Static595.anIntArray660[this.aShortArray101[local705]], arg2, Static595.anIntArray660[this.aShortArray96[local705]], arg0, Static287.anIntArray319[this.aShortArray96[local705]], Static287.anIntArray319[this.aShortArray101[local705]], Static287.anIntArray319[this.aShortArray94[local705]], Static595.anIntArray660[this.aShortArray94[local705]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "f", descriptor = "(I)V")
	private void method6223() {
		if (this.aClass15_2 != null) {
			this.aClass15_2.aBoolean39 = false;
		}
	}

	@OriginalMember(owner = "client!qd", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) Class76 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean549) {
			this.method6227();
		}
		@Pc(16) int local16 = this.anInt7356 + arg4;
		@Pc(21) int local21 = this.anInt7343 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt7348;
		@Pc(32) int local32 = this.anInt7305 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt8791 <= local21 + arg2.anInt8792 >> arg2.anInt8795 || local27 < 0 || local32 + arg2.anInt8792 >> arg2.anInt8795 >= arg2.anInt8794)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt8791 <= arg3.anInt8792 + local21 >> arg3.anInt8795 || local27 < 0 || arg3.anInt8792 + local32 >> arg3.anInt8795 >= arg3.anInt8794) {
				return;
			}
		} else {
			local16 >>= arg2.anInt8795;
			local21 = local21 + arg2.anInt8792 - 1 >> arg2.anInt8795;
			local27 >>= arg2.anInt8795;
			local32 = arg2.anInt8792 + local32 - 1 >> arg2.anInt8795;
			if (arg2.method7396(local27, local16) == arg5 && arg2.method7396(local27, local21) == arg5 && arg2.method7396(local32, local16) == arg5 && arg5 == arg2.method7396(local32, local21)) {
				return;
			}
		}
		@Pc(211) int local211;
		if (arg0 == 1) {
			for (local211 = 0; local211 < this.anInt7312; local211++) {
				this.anIntArray532[local211] += arg2.method7398(this.anIntArray533[local211] + arg4, arg6 + this.anIntArray535[local211]) - arg5;
			}
		} else {
			@Pc(216) int local216;
			@Pc(227) int local227;
			if (arg0 == 2) {
				local211 = this.anInt7335;
				if (local211 == 0) {
					return;
				}
				for (local216 = 0; local216 < this.anInt7312; local216++) {
					local227 = (this.anIntArray532[local216] << 16) / local211;
					if (arg1 > local227) {
						this.anIntArray532[local216] += (arg1 - local227) * (arg2.method7398(this.anIntArray533[local216] - -arg4, this.anIntArray535[local216] - -arg6) + -arg5) / arg1;
					}
				}
			} else {
				@Pc(309) int local309;
				if (arg0 == 3) {
					local211 = (arg1 & 0xFF) * 4;
					local216 = (arg1 >> 8 & 0xFF) * 4;
					local227 = (arg1 >> 16 & 0xFF) << 6;
					local309 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local211 >> 1) < 0 || (local211 >> 1) + arg4 + arg2.anInt8792 >= arg2.anInt8791 << arg2.anInt8795 || arg6 - (local216 >> 1) < 0 || arg2.anInt8794 << arg2.anInt8795 <= (local216 >> 1) + arg6 + arg2.anInt8792) {
						return;
					}
					this.method6211(arg6, local309, local227, arg2, arg5, local216, arg4, local211);
				} else if (arg0 == 4) {
					local211 = this.anInt7355 - this.anInt7335;
					for (local216 = 0; local216 < this.anInt7312; local216++) {
						this.anIntArray532[local216] = this.anIntArray532[local216] + arg3.method7398(arg4 + this.anIntArray533[local216], this.anIntArray535[local216] - -arg6) + local211 - arg5;
					}
				} else if (arg0 == 5) {
					local211 = this.anInt7355 - this.anInt7335;
					for (local216 = 0; local216 < this.anInt7312; local216++) {
						local227 = this.anIntArray533[local216] + arg4;
						local309 = this.anIntArray535[local216] + arg6;
						@Pc(315) int local315 = arg2.method7398(local227, local309);
						@Pc(321) int local321 = arg3.method7398(local227, local309);
						@Pc(329) int local329 = local315 - arg1 - local321;
						this.anIntArray532[local216] = (local329 * ((this.anIntArray532[local216] << 8) / local211) >> 8) + local315 - arg5;
					}
				}
			}
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray45 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt7296; local12++) {
			this.anIntArray533[local12] <<= 0x4;
			this.anIntArray532[local12] <<= 0x4;
			this.anIntArray535[local12] <<= 0x4;
		}
		Static218.anInt10033 = 0;
		Static164.anInt2940 = 0;
		Static364.anInt5767 = 0;
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6214(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(60) int local60;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(52) int[] local52;
		@Pc(54) int local54;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			Static218.anInt10033 = 0;
			Static164.anInt2940 = 0;
			local28 = 0;
			Static364.anInt5767 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray45.length > local38) {
					local52 = this.anIntArrayArray45[local38];
					for (local54 = 0; local54 < local52.length; local54++) {
						local60 = local52[local54];
						Static218.anInt10033 += this.anIntArray533[local60];
						Static364.anInt5767 += this.anIntArray532[local60];
						Static164.anInt2940 += this.anIntArray535[local60];
						local28++;
					}
				}
			}
			if (local28 > 0) {
				Static218.anInt10033 = local22 + Static218.anInt10033 / local28;
				Static164.anInt2940 = Static164.anInt2940 / local28 + local18;
				Static364.anInt5767 = local14 + Static364.anInt5767 / local28;
			} else {
				Static218.anInt10033 = local22;
				Static364.anInt5767 = local14;
				Static164.anInt2940 = local18;
			}
			return;
		}
		@Pc(159) int[] local159;
		@Pc(161) int local161;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local18 = arg4 << 4;
			local14 = arg3 << 4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray45.length > local32) {
					local159 = this.anIntArrayArray45[local32];
					for (local161 = 0; local161 < local159.length; local161++) {
						local54 = local159[local161];
						this.anIntArray533[local54] += local22;
						this.anIntArray532[local54] += local14;
						this.anIntArray535[local54] += local18;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(751) int local751;
		@Pc(760) int local760;
		if (arg0 == 2) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray45.length) {
					local159 = this.anIntArrayArray45[local32];
					if ((arg5 & 0x1) == 0) {
						for (local161 = 0; local161 < local159.length; local161++) {
							local54 = local159[local161];
							this.anIntArray533[local54] -= Static218.anInt10033;
							this.anIntArray532[local54] -= Static364.anInt5767;
							this.anIntArray535[local54] -= Static164.anInt2940;
							if (arg4 != 0) {
								local60 = Canvas_Sub1.anIntArray497[arg4];
								local274 = Canvas_Sub1.anIntArray498[arg4];
								local292 = local274 * this.anIntArray533[local54] + this.anIntArray532[local54] * local60 + 16383 >> 14;
								this.anIntArray532[local54] = local274 * this.anIntArray532[local54] + 16383 - local60 * this.anIntArray533[local54] >> 14;
								this.anIntArray533[local54] = local292;
							}
							if (arg2 != 0) {
								local60 = Canvas_Sub1.anIntArray497[arg2];
								local274 = Canvas_Sub1.anIntArray498[arg2];
								local292 = this.anIntArray532[local54] * local274 + 16383 - this.anIntArray535[local54] * local60 >> 14;
								this.anIntArray535[local54] = this.anIntArray535[local54] * local274 + local60 * this.anIntArray532[local54] + 16383 >> 14;
								this.anIntArray532[local54] = local292;
							}
							if (arg3 != 0) {
								local60 = Canvas_Sub1.anIntArray497[arg3];
								local274 = Canvas_Sub1.anIntArray498[arg3];
								local292 = this.anIntArray535[local54] * local60 + local274 * this.anIntArray533[local54] + 16383 >> 14;
								this.anIntArray535[local54] = local274 * this.anIntArray535[local54] + 16383 - local60 * this.anIntArray533[local54] >> 14;
								this.anIntArray533[local54] = local292;
							}
							this.anIntArray533[local54] += Static218.anInt10033;
							this.anIntArray532[local54] += Static364.anInt5767;
							this.anIntArray535[local54] += Static164.anInt2940;
						}
					} else {
						for (local161 = 0; local161 < local159.length; local161++) {
							local54 = local159[local161];
							this.anIntArray533[local54] -= Static218.anInt10033;
							this.anIntArray532[local54] -= Static364.anInt5767;
							this.anIntArray535[local54] -= Static164.anInt2940;
							if (arg2 != 0) {
								local60 = Canvas_Sub1.anIntArray497[arg2];
								local274 = Canvas_Sub1.anIntArray498[arg2];
								local292 = local274 * this.anIntArray532[local54] + 16383 - this.anIntArray535[local54] * local60 >> 14;
								this.anIntArray535[local54] = this.anIntArray535[local54] * local274 + this.anIntArray532[local54] * local60 + 16383 >> 14;
								this.anIntArray532[local54] = local292;
							}
							if (arg4 != 0) {
								local60 = Canvas_Sub1.anIntArray497[arg4];
								local274 = Canvas_Sub1.anIntArray498[arg4];
								local292 = this.anIntArray533[local54] * local274 + local60 * this.anIntArray532[local54] + 16383 >> 14;
								this.anIntArray532[local54] = this.anIntArray532[local54] * local274 + 16383 - this.anIntArray533[local54] * local60 >> 14;
								this.anIntArray533[local54] = local292;
							}
							if (arg3 != 0) {
								local60 = Canvas_Sub1.anIntArray497[arg3];
								local274 = Canvas_Sub1.anIntArray498[arg3];
								local292 = this.anIntArray535[local54] * local60 + this.anIntArray533[local54] * local274 + 16383 >> 14;
								this.anIntArray535[local54] = local274 * this.anIntArray535[local54] + 16383 - this.anIntArray533[local54] * local60 >> 14;
								this.anIntArray533[local54] = local292;
							}
							this.anIntArray533[local54] += Static218.anInt10033;
							this.anIntArray532[local54] += Static364.anInt5767;
							this.anIntArray535[local54] += Static164.anInt2940;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray45.length > local38) {
						local52 = this.anIntArrayArray45[local38];
						for (local54 = 0; local54 < local52.length; local54++) {
							local60 = local52[local54];
							local274 = this.anIntArray529[local60];
							local292 = this.anIntArray529[local60 + 1];
							for (local751 = local274; local751 < local292; local751++) {
								local760 = this.lb[local751] - 1;
								if (local760 == -1) {
									break;
								}
								@Pc(772) int local772;
								@Pc(776) int local776;
								@Pc(794) int local794;
								if (arg4 != 0) {
									local772 = Canvas_Sub1.anIntArray497[arg4];
									local776 = Canvas_Sub1.anIntArray498[arg4];
									local794 = this.aShortArray102[local760] * local776 + this.aShortArray103[local760] * local772 + 16383 >> 14;
									this.aShortArray103[local760] = (short) (local776 * this.aShortArray103[local760] + 16383 - local772 * this.aShortArray102[local760] >> 14);
									this.aShortArray102[local760] = (short) local794;
								}
								if (arg2 != 0) {
									local772 = Canvas_Sub1.anIntArray497[arg2];
									local776 = Canvas_Sub1.anIntArray498[arg2];
									local794 = local776 * this.aShortArray103[local760] + 16383 - local772 * this.aShortArray93[local760] >> 14;
									this.aShortArray93[local760] = (short) (this.aShortArray93[local760] * local776 + this.aShortArray103[local760] * local772 + 16383 >> 14);
									this.aShortArray103[local760] = (short) local794;
								}
								if (arg3 != 0) {
									local772 = Canvas_Sub1.anIntArray497[arg3];
									local776 = Canvas_Sub1.anIntArray498[arg3];
									local794 = local772 * this.aShortArray93[local760] + local776 * this.aShortArray102[local760] + 16383 >> 14;
									this.aShortArray93[local760] = (short) (this.aShortArray93[local760] * local776 + 16383 - local772 * this.aShortArray102[local760] >> 14);
									this.aShortArray102[local760] = (short) local794;
								}
							}
						}
					}
				}
				this.method6221();
			}
		} else if (arg0 == 3) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (this.anIntArrayArray45.length > local32) {
					local159 = this.anIntArrayArray45[local32];
					for (local161 = 0; local161 < local159.length; local161++) {
						local54 = local159[local161];
						this.anIntArray533[local54] -= Static218.anInt10033;
						this.anIntArray532[local54] -= Static364.anInt5767;
						this.anIntArray535[local54] -= Static164.anInt2940;
						this.anIntArray533[local54] = this.anIntArray533[local54] * arg2 >> 7;
						this.anIntArray532[local54] = arg3 * this.anIntArray532[local54] >> 7;
						this.anIntArray535[local54] = arg4 * this.anIntArray535[local54] >> 7;
						this.anIntArray533[local54] += Static218.anInt10033;
						this.anIntArray532[local54] += Static364.anInt5767;
						this.anIntArray535[local54] += Static164.anInt2940;
					}
				}
			}
		} else {
			@Pc(1202) Class187 local1202;
			@Pc(1104) boolean local1104;
			@Pc(1197) Class97 local1197;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local1104 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray44.length) {
							local52 = this.anIntArrayArray44[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local274 = arg2 * 8 + (this.aByteArray86[local60] & 0xFF);
								if (local274 < 0) {
									local274 = 0;
								} else if (local274 > 255) {
									local274 = 255;
								}
								this.aByteArray86[local60] = (byte) local274;
							}
							local1104 |= local52.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass97Array1 != null) {
							for (local38 = 0; local38 < this.anInt7346; local38++) {
								local1197 = this.aClass97Array1[local38];
								local1202 = this.aClass187Array1[local38];
								local1202.anInt4715 = local1202.anInt4715 & 0xFFFFFF | 255 - (this.aByteArray86[local1197.anInt2571] & 0xFF) << 24;
							}
						}
						this.method6223();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local1104 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray44.length) {
							local52 = this.anIntArrayArray44[local38];
							for (local54 = 0; local54 < local52.length; local54++) {
								local60 = local52[local54];
								local274 = this.aShortArray100[local60] & 0xFFFF;
								local292 = local274 >> 10 & 0x3F;
								local751 = local274 >> 7 & 0x7;
								local751 += arg3 / 4;
								@Pc(1301) int local1301 = arg2 + local292 & 0x3F;
								local760 = local274 & 0x7F;
								local760 += arg4;
								if (local751 < 0) {
									local751 = 0;
								} else if (local751 > 7) {
									local751 = 7;
								}
								if (local760 < 0) {
									local760 = 0;
								} else if (local760 > 127) {
									local760 = 127;
								}
								this.aShortArray100[local60] = (short) (local1301 << 10 | local751 << 7 | local760);
							}
							local1104 |= local52.length > 0;
						}
					}
					if (local1104) {
						if (this.aClass97Array1 != null) {
							for (local38 = 0; local38 < this.anInt7346; local38++) {
								local1197 = this.aClass97Array1[local38];
								local1202 = this.aClass187Array1[local38];
								local1202.anInt4715 = Static343.anIntArray359[this.aShortArray100[local1197.anInt2571] & 0xFFFF] & 0xFFFFFF | local1202.anInt4715 & 0xFF000000;
							}
						}
						this.method6223();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray43 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray43.length) {
							local159 = this.anIntArrayArray43[local32];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1202 = this.aClass187Array1[local159[local161]];
								local1202.anInt4714 += arg3;
								local1202.anInt4719 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray43 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray43.length) {
							local159 = this.anIntArrayArray43[local32];
							for (local161 = 0; local161 < local159.length; local161++) {
								local1202 = this.aClass187Array1[local159[local161]];
								local1202.anInt4722 = arg3 * local1202.anInt4722 >> 7;
								local1202.anInt4713 = arg2 * local1202.anInt4713 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray43 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray43.length) {
						local159 = this.anIntArrayArray43[local32];
						for (local161 = 0; local161 < local159.length; local161++) {
							local1202 = this.aClass187Array1[local159[local161]];
							local1202.anInt4723 = local1202.anInt4723 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!uha;Lclient!au;I)V")
	@Override
	public void method6206(@OriginalArg(0) Class177 arg0, @OriginalArg(1) Class13_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt7318 == 0) {
			return;
		}
		@Pc(13) Class177_Sub1 local13 = this.aClass95_Sub3_18.aClass177_Sub1_16;
		if (!this.aBoolean549) {
			this.method6227();
		}
		@Pc(22) Class177_Sub1 local22 = (Class177_Sub1) arg0;
		Static406.aFloat86 = local22.aFloat78 * local13.aFloat77 + local13.aFloat75 * local22.aFloat79 + local22.aFloat73 * local13.aFloat74 + local13.aFloat73;
		Static194.aFloat193 = local22.aFloat80 * local13.aFloat75 + local22.aFloat81 * local13.aFloat77 + local22.aFloat77 * local13.aFloat74;
		@Pc(69) float local69 = (float) this.anInt7335 * Static194.aFloat193 + Static406.aFloat86;
		@Pc(77) float local77 = Static194.aFloat193 * (float) this.anInt7355 + Static406.aFloat86;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.anInt7359;
			local93 = (float) this.anInt7359 + local69;
		} else {
			local87 = (float) -this.anInt7359 + local69;
			local93 = local77 + (float) this.anInt7359;
		}
		if (this.aClass95_Sub3_18.aFloat180 <= local87 || local93 <= (float) this.aClass95_Sub3_18.anInt8377) {
			return;
		}
		Static326.aFloat96 = local13.aFloat83 * local22.aFloat79 + local13.aFloat80 * local22.aFloat78 + local22.aFloat73 * local13.aFloat82 + local13.aFloat79;
		Static184.aFloat50 = local22.aFloat77 * local13.aFloat82 + local22.aFloat81 * local13.aFloat80 + local13.aFloat83 * local22.aFloat80;
		@Pc(170) float local170 = Static326.aFloat96 + (float) this.anInt7335 * Static184.aFloat50;
		@Pc(178) float local178 = Static326.aFloat96 + Static184.aFloat50 * (float) this.anInt7355;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local178 < local170) {
			local193 = (float) this.aClass95_Sub3_18.anInt8354 * (local170 + (float) this.anInt7359);
			local204 = (local178 - (float) this.anInt7359) * (float) this.aClass95_Sub3_18.anInt8354;
		} else {
			local204 = (float) this.aClass95_Sub3_18.anInt8354 * (local170 - (float) this.anInt7359);
			local193 = (local178 + (float) this.anInt7359) * (float) this.aClass95_Sub3_18.anInt8354;
		}
		if (local204 / local93 >= this.aClass95_Sub3_18.aFloat173 || this.aClass95_Sub3_18.aFloat185 >= local193 / local93) {
			return;
		}
		Static569.aFloat194 = local22.aFloat73 * local13.aFloat76 + local22.aFloat78 * local13.aFloat81 + local22.aFloat79 * local13.aFloat84 + local13.aFloat78;
		Static84.aFloat12 = local22.aFloat77 * local13.aFloat76 + local13.aFloat84 * local22.aFloat80 + local22.aFloat81 * local13.aFloat81;
		@Pc(293) float local293 = Static84.aFloat12 * (float) this.anInt7335 + Static569.aFloat194;
		@Pc(301) float local301 = Static569.aFloat194 + (float) this.anInt7355 * Static84.aFloat12;
		@Pc(328) float local328;
		@Pc(316) float local316;
		if (local301 < local293) {
			local316 = (float) this.aClass95_Sub3_18.anInt8379 * ((float) this.anInt7359 + local293);
			local328 = ((float) -this.anInt7359 + local301) * (float) this.aClass95_Sub3_18.anInt8379;
		} else {
			local316 = ((float) this.anInt7359 + local301) * (float) this.aClass95_Sub3_18.anInt8379;
			local328 = ((float) -this.anInt7359 + local293) * (float) this.aClass95_Sub3_18.anInt8379;
		}
		if (this.aClass95_Sub3_18.aFloat184 <= local328 / local93 || local316 / local93 <= this.aClass95_Sub3_18.aFloat186) {
			return;
		}
		if (arg1 != null || this.aClass97Array1 != null) {
			Static338.aFloat99 = local22.aFloat75 * local13.aFloat76 + local22.aFloat83 * local13.aFloat84 + local13.aFloat81 * local22.aFloat84;
			Static456.aFloat146 = local13.aFloat74 * local22.aFloat74 + local13.aFloat77 * local22.aFloat76 + local22.aFloat82 * local13.aFloat75;
			Static429.aFloat122 = local13.aFloat83 * local22.aFloat82 + local13.aFloat80 * local22.aFloat76 + local22.aFloat74 * local13.aFloat82;
			Static185.aFloat52 = local22.aFloat83 * local13.aFloat75 + local22.aFloat84 * local13.aFloat77 + local13.aFloat74 * local22.aFloat75;
			Static108.aFloat20 = local22.aFloat84 * local13.aFloat80 + local13.aFloat83 * local22.aFloat83 + local22.aFloat75 * local13.aFloat82;
			Static139.aFloat46 = local22.aFloat76 * local13.aFloat81 + local13.aFloat84 * local22.aFloat82 + local13.aFloat76 * local22.aFloat74;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(499) int local499 = this.anInt7356 + this.anInt7343 >> 1;
			@Pc(508) int local508 = this.anInt7348 + this.anInt7305 >> 1;
			@Pc(527) int local527 = (int) ((float) local499 * Static108.aFloat20 + Static326.aFloat96 + Static184.aFloat50 * (float) this.anInt7335 + Static429.aFloat122 * (float) local508);
			@Pc(546) int local546 = (int) (Static84.aFloat12 * (float) this.anInt7335 + Static569.aFloat194 + Static338.aFloat99 * (float) local499 + Static139.aFloat46 * (float) local508);
			@Pc(565) int local565 = (int) (Static194.aFloat193 * (float) this.anInt7335 + Static406.aFloat86 + Static185.aFloat52 * (float) local499 + (float) local508 * Static456.aFloat146);
			if (this.aClass95_Sub3_18.anInt8377 > local565) {
				local488 = true;
			} else {
				arg1.anInt604 = this.aClass95_Sub3_18.anInt8386 + local546 * this.aClass95_Sub3_18.anInt8379 / local565;
				arg1.anInt603 = this.aClass95_Sub3_18.anInt8358 + local527 * this.aClass95_Sub3_18.anInt8354 / local565;
			}
			@Pc(620) int local620 = (int) ((float) local508 * Static429.aFloat122 + (float) this.anInt7355 * Static184.aFloat50 + Static108.aFloat20 * (float) local499 + Static326.aFloat96);
			@Pc(639) int local639 = (int) ((float) this.anInt7355 * Static84.aFloat12 + (float) local499 * Static338.aFloat99 + Static569.aFloat194 + Static139.aFloat46 * (float) local508);
			@Pc(658) int local658 = (int) ((float) local508 * Static456.aFloat146 + (float) local499 * Static185.aFloat52 + Static406.aFloat86 + Static194.aFloat193 * (float) this.anInt7355);
			if (local658 >= this.aClass95_Sub3_18.anInt8377) {
				arg1.anInt605 = this.aClass95_Sub3_18.anInt8354 * local620 / local658 + this.aClass95_Sub3_18.anInt8358;
				arg1.anInt607 = this.aClass95_Sub3_18.anInt8386 + this.aClass95_Sub3_18.anInt8379 * local639 / local658;
			} else {
				local488 = true;
			}
			if (local488) {
				if (this.aClass95_Sub3_18.anInt8377 > local565 && local658 < this.aClass95_Sub3_18.anInt8377) {
					local490 = false;
				} else {
					@Pc(733) int local733;
					@Pc(744) int local744;
					@Pc(771) int local771;
					if (this.aClass95_Sub3_18.anInt8377 > local565) {
						local733 = (local658 - this.aClass95_Sub3_18.anInt8377 << 16) / (local658 - local565);
						local744 = ((local620 - local527) * local733 >> 16) + local620;
						arg1.anInt603 = local744 * this.aClass95_Sub3_18.anInt8354 / this.aClass95_Sub3_18.anInt8377 + this.aClass95_Sub3_18.anInt8358;
						local771 = local639 + ((local639 - local546) * local733 >> 16);
						arg1.anInt604 = this.aClass95_Sub3_18.anInt8386 + local771 * this.aClass95_Sub3_18.anInt8379 / this.aClass95_Sub3_18.anInt8377;
					} else if (local658 < this.aClass95_Sub3_18.anInt8377) {
						local733 = (local565 - this.aClass95_Sub3_18.anInt8377 << 16) / (local565 - local658);
						local744 = (local733 * (local527 - local620) >> 16) + local527;
						local771 = local546 + ((local546 - local639) * local733 >> 16);
						arg1.anInt603 = this.aClass95_Sub3_18.anInt8358 + local744 * this.aClass95_Sub3_18.anInt8354 / this.aClass95_Sub3_18.anInt8377;
						arg1.anInt604 = local771 * this.aClass95_Sub3_18.anInt8379 / this.aClass95_Sub3_18.anInt8377 + this.aClass95_Sub3_18.anInt8386;
					}
				}
			}
			if (local490) {
				if (local658 < local565) {
					arg1.anInt606 = (this.anInt7359 + local527) * this.aClass95_Sub3_18.anInt8354 / local565 + this.aClass95_Sub3_18.anInt8358 - arg1.anInt603;
				} else {
					arg1.anInt606 = this.aClass95_Sub3_18.anInt8358 + this.aClass95_Sub3_18.anInt8354 * (local620 + this.anInt7359) / local658 - arg1.anInt605;
				}
				arg1.aBoolean48 = true;
			}
		}
		this.aClass95_Sub3_18.method7083();
		this.aClass95_Sub3_18.method7018(local22);
		this.method6229();
		this.method6218();
	}

	@OriginalMember(owner = "client!qd", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7348;
	}

	@OriginalMember(owner = "client!qd", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7312; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray532[local15] - this.anIntArray535[local15] * local9 >> 14;
			this.anIntArray535[local15] = local13 * this.anIntArray535[local15] + this.anIntArray532[local15] * local9 >> 14;
			this.anIntArray532[local15] = local34;
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLclient!w;)V")
	private void method6224(@OriginalArg(1) Class2_Sub2_Sub19_Sub2 arg0) {
		if (Static287.anIntArray319.length < this.anInt7318) {
			Static287.anIntArray319 = new int[this.anInt7318];
			Static595.anIntArray660 = new int[this.anInt7318];
		}
		@Pc(46) int local46;
		@Pc(84) int local84;
		@Pc(93) int local93;
		for (@Pc(20) int local20 = 0; local20 < this.anInt7312; local20++) {
			local46 = (this.anIntArray533[local20] - (this.aClass95_Sub3_18.anInt8384 * this.anIntArray532[local20] >> 8) >> this.aClass95_Sub3_18.anInt8351) - arg0.anInt9925;
			@Pc(70) int local70 = (this.anIntArray535[local20] - (this.aClass95_Sub3_18.anInt8370 * this.anIntArray532[local20] >> 8) >> this.aClass95_Sub3_18.anInt8351) - arg0.anInt9932;
			@Pc(75) int local75 = this.anIntArray529[local20];
			@Pc(82) int local82 = this.anIntArray529[local20 + 1];
			for (local84 = local75; local84 < local82; local84++) {
				local93 = this.lb[local84] - 1;
				if (local93 == -1) {
					break;
				}
				Static287.anIntArray319[local93] = local46;
				Static595.anIntArray660[local93] = local70;
			}
		}
		for (local46 = 0; local46 < this.anInt7315; local46++) {
			if (this.aByteArray86 == null || this.aByteArray86[local46] <= 128) {
				@Pc(139) short local139 = this.aShortArray101[local46];
				@Pc(144) short local144 = this.aShortArray94[local46];
				@Pc(149) short local149 = this.aShortArray96[local46];
				local84 = Static287.anIntArray319[local139];
				local93 = Static287.anIntArray319[local144];
				@Pc(161) int local161 = Static287.anIntArray319[local149];
				@Pc(165) int local165 = Static595.anIntArray660[local139];
				@Pc(169) int local169 = Static595.anIntArray660[local144];
				@Pc(173) int local173 = Static595.anIntArray660[local149];
				if ((local169 - local173) * (local84 - local93) - (local169 - local165) * (local161 - local93) > 0) {
					arg0.method8279(local161, local165, local169, local84, local93, local173);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort102 = (short) arg0;
		this.method6223();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7312; local15++) {
			@Pc(33) int local33 = this.anIntArray533[local15] * local13 + this.anIntArray535[local15] * local9 >> 14;
			this.anIntArray535[local15] = local13 * this.anIntArray535[local15] - local9 * this.anIntArray533[local15] >> 14;
			this.anIntArray533[local15] = local33;
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt7317;
	}

	@OriginalMember(owner = "client!qd", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass15_1 != null) {
			this.aClass15_1.aBoolean40 = Static102.method1050(this.anInt7336, arg0);
		}
		if (this.aClass15_3 != null) {
			this.aClass15_3.aBoolean40 = Static520.method7260(this.anInt7336, arg0);
		}
		if (this.aClass15_2 != null) {
			this.aClass15_2.aBoolean40 = Static279.method3860(this.anInt7336, arg0);
		}
		if (this.aClass15_4 != null) {
			this.aClass15_4.aBoolean40 = Static412.method5531(arg0, this.anInt7336);
		}
		this.anInt7317 = arg0;
		if (this.aClass278_1 != null && (this.anInt7317 & 0x10000) == 0) {
			this.aShortArray102 = this.aClass278_1.aShortArray105;
			this.aShortArray103 = this.aClass278_1.aShortArray107;
			this.aShortArray93 = this.aClass278_1.aShortArray106;
			this.aByteArray85 = this.aClass278_1.aByteArray87;
			this.aClass278_1 = null;
		}
		this.aBoolean551 = true;
		this.method6219();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!uha;)V")
	@Override
	public void method6197(@OriginalArg(0) Class177 arg0) {
		@Pc(8) Class177_Sub1 local8 = (Class177_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass143Array5 != null) {
			for (local13 = 0; local13 < this.aClass143Array5.length; local13++) {
				@Pc(20) Class143 local20 = this.aClass143Array5[local13];
				@Pc(22) Class143 local22 = local20;
				if (local20.aClass143_1 != null) {
					local22 = local20.aClass143_1;
				}
				local22.anInt3602 = (int) (local8.aFloat79 + (float) this.anIntArray535[local20.anInt3607] * local8.aFloat82 + local8.aFloat80 * (float) this.anIntArray532[local20.anInt3607] + (float) this.anIntArray533[local20.anInt3607] * local8.aFloat83);
				local22.anInt3596 = (int) (local8.aFloat78 + local8.aFloat76 * (float) this.anIntArray535[local20.anInt3607] + (float) this.anIntArray532[local20.anInt3607] * local8.aFloat81 + local8.aFloat84 * (float) this.anIntArray533[local20.anInt3607]);
				local22.anInt3600 = (int) (local8.aFloat73 + local8.aFloat74 * (float) this.anIntArray535[local20.anInt3607] + local8.aFloat77 * (float) this.anIntArray532[local20.anInt3607] + (float) this.anIntArray533[local20.anInt3607] * local8.aFloat75);
				local22.anInt3603 = (int) ((float) this.anIntArray535[local20.anInt3594] * local8.aFloat82 + local8.aFloat83 * (float) this.anIntArray533[local20.anInt3594] + local8.aFloat80 * (float) this.anIntArray532[local20.anInt3594] + local8.aFloat79);
				local22.anInt3606 = (int) ((float) this.anIntArray535[local20.anInt3594] * local8.aFloat76 + local8.aFloat81 * (float) this.anIntArray532[local20.anInt3594] + local8.aFloat84 * (float) this.anIntArray533[local20.anInt3594] + local8.aFloat78);
				local22.anInt3610 = (int) (local8.aFloat73 + local8.aFloat74 * (float) this.anIntArray535[local20.anInt3594] + local8.aFloat77 * (float) this.anIntArray532[local20.anInt3594] + local8.aFloat75 * (float) this.anIntArray533[local20.anInt3594]);
				local22.anInt3601 = (int) (local8.aFloat79 + local8.aFloat82 * (float) this.anIntArray535[local20.anInt3598] + (float) this.anIntArray533[local20.anInt3598] * local8.aFloat83 + local8.aFloat80 * (float) this.anIntArray532[local20.anInt3598]);
				local22.anInt3604 = (int) (local8.aFloat78 + (float) this.anIntArray535[local20.anInt3598] * local8.aFloat76 + (float) this.anIntArray532[local20.anInt3598] * local8.aFloat81 + (float) this.anIntArray533[local20.anInt3598] * local8.aFloat84);
				local22.anInt3608 = (int) (local8.aFloat73 + local8.aFloat77 * (float) this.anIntArray532[local20.anInt3598] + local8.aFloat75 * (float) this.anIntArray533[local20.anInt3598] + local8.aFloat74 * (float) this.anIntArray535[local20.anInt3598]);
			}
		}
		if (this.aClass255Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass255Array5.length; local13++) {
			@Pc(365) Class255 local365 = this.aClass255Array5[local13];
			@Pc(367) Class255 local367 = local365;
			if (local365.aClass255_2 != null) {
				local367 = local365.aClass255_2;
			}
			if (local365.aClass177_8 == null) {
				local365.aClass177_8 = local8.method7868();
			} else {
				local365.aClass177_8.method7879(local8);
			}
			local367.anInt6389 = (int) (local8.aFloat82 * (float) this.anIntArray535[local365.anInt6388] + local8.aFloat83 * (float) this.anIntArray533[local365.anInt6388] + (float) this.anIntArray532[local365.anInt6388] * local8.aFloat80 + local8.aFloat79);
			local367.anInt6390 = (int) (local8.aFloat78 + (float) this.anIntArray535[local365.anInt6388] * local8.aFloat76 + (float) this.anIntArray533[local365.anInt6388] * local8.aFloat84 + local8.aFloat81 * (float) this.anIntArray532[local365.anInt6388]);
			local367.anInt6392 = (int) (local8.aFloat73 + (float) this.anIntArray533[local365.anInt6388] * local8.aFloat75 + local8.aFloat77 * (float) this.anIntArray532[local365.anInt6388] + local8.aFloat74 * (float) this.anIntArray535[local365.anInt6388]);
		}
	}

	@OriginalMember(owner = "client!qd", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface6 local9 = this.aClass95_Sub3_18.anInterface6_27;
		for (@Pc(11) int local11 = 0; local11 < this.anInt7301; local11++) {
			if (arg0 == this.aShortArray104[local11]) {
				this.aShortArray104[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(44) Class175 local44 = local9.method1492(arg0 & 0xFFFF);
			local31 = local44.aByte51;
			local33 = local44.aByte57;
		}
		@Pc(52) byte local52 = 0;
		@Pc(54) byte local54 = 0;
		if (arg1 != -1) {
			@Pc(64) Class175 local64 = local9.method1492(arg1 & 0xFFFF);
			local54 = local64.aByte57;
			if (local64.aByte53 != 0 || local64.aByte54 != 0) {
				this.aBoolean552 = true;
			}
			local52 = local64.aByte51;
		}
		if (!(local31 != local52 | local54 != local33)) {
			return;
		}
		if (this.aClass97Array1 != null) {
			for (@Pc(106) int local106 = 0; local106 < this.anInt7346; local106++) {
				@Pc(113) Class97 local113 = this.aClass97Array1[local106];
				@Pc(118) Class187 local118 = this.aClass187Array1[local106];
				local118.anInt4715 = Static343.anIntArray359[this.aShortArray100[local113.anInt2571] & 0xFFFF] & 0xFFFFFF | local118.anInt4715 & 0xFF000000;
			}
		}
		this.method6223();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZLclient!qd;IZLclient!qd;I)Lclient!ka;")
	private Class182 method6226(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class182_Sub3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class182_Sub3 arg3, @OriginalArg(5) int arg4) {
		arg3.aBoolean552 = this.aBoolean552;
		arg3.anInt7317 = arg4;
		arg3.aShort101 = this.aShort101;
		arg3.anInt7315 = this.anInt7315;
		arg3.anInt7301 = this.anInt7301;
		arg3.anInt7346 = this.anInt7346;
		arg3.anInt7312 = this.anInt7312;
		arg3.anInt7336 = this.anInt7336;
		arg3.anInt7318 = this.anInt7318;
		arg3.aShort102 = this.aShort102;
		if ((arg4 & 0x100) == 0) {
			arg3.aBoolean550 = this.aBoolean550;
		} else {
			arg3.aBoolean550 = true;
		}
		arg3.anInt7296 = this.anInt7296;
		@Pc(70) boolean local70 = Static451.method2189(arg4, this.anInt7336);
		@Pc(76) boolean local76 = Static489.method1463(this.anInt7336, arg4);
		@Pc(82) boolean local82 = Static392.method5361(arg4, this.anInt7336);
		@Pc(88) boolean local88 = local76 | local70 | local82;
		@Pc(193) int local193;
		if (local88) {
			if (!local70) {
				arg3.anIntArray533 = this.anIntArray533;
			} else if (arg1.anIntArray533 == null || this.anInt7296 > arg1.anIntArray533.length) {
				arg3.anIntArray533 = arg1.anIntArray533 = new int[this.anInt7296];
			} else {
				arg3.anIntArray533 = arg1.anIntArray533;
			}
			if (!local76) {
				arg3.anIntArray532 = this.anIntArray532;
			} else if (arg1.anIntArray532 == null || arg1.anIntArray532.length < this.anInt7296) {
				arg3.anIntArray532 = arg1.anIntArray532 = new int[this.anInt7296];
			} else {
				arg3.anIntArray532 = arg1.anIntArray532;
			}
			if (!local82) {
				arg3.anIntArray535 = this.anIntArray535;
			} else if (arg1.anIntArray535 == null || arg1.anIntArray535.length < this.anInt7296) {
				arg3.anIntArray535 = arg1.anIntArray535 = new int[this.anInt7296];
			} else {
				arg3.anIntArray535 = arg1.anIntArray535;
			}
			for (local193 = 0; local193 < this.anInt7296; local193++) {
				if (local70) {
					arg3.anIntArray533[local193] = this.anIntArray533[local193];
				}
				if (local76) {
					arg3.anIntArray532[local193] = this.anIntArray532[local193];
				}
				if (local82) {
					arg3.anIntArray535[local193] = this.anIntArray535[local193];
				}
			}
		} else {
			arg3.anIntArray535 = this.anIntArray535;
			arg3.anIntArray533 = this.anIntArray533;
			arg3.anIntArray532 = this.anIntArray532;
		}
		if (Static102.method1050(this.anInt7336, arg4)) {
			arg3.aClass15_1 = arg1.aClass15_1;
			arg3.aClass15_1.anInterface16_2 = this.aClass15_1.anInterface16_2;
			arg3.aClass15_1.aBoolean40 = true;
			arg3.aClass15_1.aBoolean39 = this.aClass15_1.aBoolean39;
		} else if (Static137.method1858(this.anInt7336, arg4)) {
			arg3.aClass15_1 = this.aClass15_1;
		} else {
			arg3.aClass15_1 = null;
		}
		if (Static173.method8449(this.anInt7336, arg4)) {
			if (arg1.aShortArray100 == null || this.anInt7301 > arg1.aShortArray100.length) {
				arg3.aShortArray100 = arg1.aShortArray100 = new short[this.anInt7301];
			} else {
				arg3.aShortArray100 = arg1.aShortArray100;
			}
			for (local193 = 0; local193 < this.anInt7301; local193++) {
				arg3.aShortArray100[local193] = this.aShortArray100[local193];
			}
		} else {
			arg3.aShortArray100 = this.aShortArray100;
		}
		if (Static24.method446(arg4, this.anInt7336)) {
			if (arg1.aByteArray86 == null || this.anInt7301 > arg1.aByteArray86.length) {
				arg3.aByteArray86 = arg1.aByteArray86 = new byte[this.anInt7301];
			} else {
				arg3.aByteArray86 = arg1.aByteArray86;
			}
			for (local193 = 0; local193 < this.anInt7301; local193++) {
				arg3.aByteArray86[local193] = this.aByteArray86[local193];
			}
		} else {
			arg3.aByteArray86 = this.aByteArray86;
		}
		if (Static279.method3860(this.anInt7336, arg4)) {
			arg3.aClass15_2 = arg1.aClass15_2;
			arg3.aClass15_2.aBoolean39 = this.aClass15_2.aBoolean39;
			arg3.aClass15_2.anInterface16_2 = this.aClass15_2.anInterface16_2;
			arg3.aClass15_2.aBoolean40 = true;
		} else if (Static551.method7578(this.anInt7336, arg4)) {
			arg3.aClass15_2 = this.aClass15_2;
		} else {
			arg3.aClass15_2 = null;
		}
		@Pc(582) int local582;
		if (Static256.method3530(arg4, this.anInt7336)) {
			if (arg1.aShortArray102 == null || arg1.aShortArray102.length < this.anInt7318) {
				local193 = this.anInt7318;
				arg3.aShortArray102 = arg1.aShortArray102 = new short[local193];
				arg3.aShortArray103 = arg1.aShortArray103 = new short[local193];
				arg3.aShortArray93 = arg1.aShortArray93 = new short[local193];
			} else {
				arg3.aShortArray103 = arg1.aShortArray103;
				arg3.aShortArray93 = arg1.aShortArray93;
				arg3.aShortArray102 = arg1.aShortArray102;
			}
			if (this.aClass278_1 == null) {
				arg3.aClass278_1 = null;
				for (local193 = 0; local193 < this.anInt7318; local193++) {
					arg3.aShortArray102[local193] = this.aShortArray102[local193];
					arg3.aShortArray103[local193] = this.aShortArray103[local193];
					arg3.aShortArray93[local193] = this.aShortArray93[local193];
				}
			} else {
				if (arg1.aClass278_1 == null) {
					arg1.aClass278_1 = new Class278();
				}
				@Pc(570) Class278 local570 = arg3.aClass278_1 = arg1.aClass278_1;
				if (local570.aShortArray105 == null || local570.aShortArray105.length < this.anInt7318) {
					local582 = this.anInt7318;
					local570.aByteArray87 = new byte[local582];
					local570.aShortArray107 = new short[local582];
					local570.aShortArray105 = new short[local582];
					local570.aShortArray106 = new short[local582];
				}
				for (local582 = 0; local582 < this.anInt7318; local582++) {
					arg3.aShortArray102[local582] = this.aShortArray102[local582];
					arg3.aShortArray103[local582] = this.aShortArray103[local582];
					arg3.aShortArray93[local582] = this.aShortArray93[local582];
					local570.aShortArray105[local582] = this.aClass278_1.aShortArray105[local582];
					local570.aShortArray107[local582] = this.aClass278_1.aShortArray107[local582];
					local570.aShortArray106[local582] = this.aClass278_1.aShortArray106[local582];
					local570.aByteArray87[local582] = this.aClass278_1.aByteArray87[local582];
				}
			}
			arg3.aByteArray85 = this.aByteArray85;
		} else {
			arg3.aByteArray85 = this.aByteArray85;
			arg3.aShortArray102 = this.aShortArray102;
			arg3.aShortArray93 = this.aShortArray93;
			arg3.aShortArray103 = this.aShortArray103;
			arg3.aClass278_1 = this.aClass278_1;
		}
		if (Static412.method5531(arg4, this.anInt7336)) {
			arg3.aClass15_4 = arg1.aClass15_4;
			arg3.aClass15_4.aBoolean40 = true;
			arg3.aClass15_4.anInterface16_2 = this.aClass15_4.anInterface16_2;
			arg3.aClass15_4.aBoolean39 = this.aClass15_4.aBoolean39;
		} else if (Static616.method8283(arg4, this.anInt7336)) {
			arg3.aClass15_4 = this.aClass15_4;
		} else {
			arg3.aClass15_4 = null;
		}
		if (Static403.method5468(this.anInt7336, arg4)) {
			if (arg1.aFloatArray44 == null || arg1.aFloatArray44.length < this.anInt7301) {
				local193 = this.anInt7318;
				arg3.aFloatArray44 = arg1.aFloatArray44 = new float[local193];
				arg3.aFloatArray43 = arg1.aFloatArray43 = new float[local193];
			} else {
				arg3.aFloatArray43 = arg1.aFloatArray43;
				arg3.aFloatArray44 = arg1.aFloatArray44;
			}
			for (local193 = 0; local193 < this.anInt7318; local193++) {
				arg3.aFloatArray44[local193] = this.aFloatArray44[local193];
				arg3.aFloatArray43[local193] = this.aFloatArray43[local193];
			}
		} else {
			arg3.aFloatArray43 = this.aFloatArray43;
			arg3.aFloatArray44 = this.aFloatArray44;
		}
		if (Static520.method7260(this.anInt7336, arg4)) {
			arg3.aClass15_3 = arg1.aClass15_3;
			arg3.aClass15_3.anInterface16_2 = this.aClass15_3.anInterface16_2;
			arg3.aClass15_3.aBoolean39 = this.aClass15_3.aBoolean39;
			arg3.aClass15_3.aBoolean40 = true;
		} else if (Static144.method2181(arg4, this.anInt7336)) {
			arg3.aClass15_3 = this.aClass15_3;
		} else {
			arg3.aClass15_3 = null;
		}
		if (Static191.method2770(arg4, this.anInt7336)) {
			if (arg1.aShortArray101 == null || this.anInt7301 > arg1.aShortArray101.length) {
				local193 = this.anInt7301;
				arg3.aShortArray101 = arg1.aShortArray101 = new short[local193];
				arg3.aShortArray94 = arg1.aShortArray94 = new short[local193];
				arg3.aShortArray96 = arg1.aShortArray96 = new short[local193];
			} else {
				arg3.aShortArray96 = arg1.aShortArray96;
				arg3.aShortArray94 = arg1.aShortArray94;
				arg3.aShortArray101 = arg1.aShortArray101;
			}
			for (local193 = 0; local193 < this.anInt7301; local193++) {
				arg3.aShortArray101[local193] = this.aShortArray101[local193];
				arg3.aShortArray94[local193] = this.aShortArray94[local193];
				arg3.aShortArray96[local193] = this.aShortArray96[local193];
			}
		} else {
			arg3.aShortArray101 = this.aShortArray101;
			arg3.aShortArray96 = this.aShortArray96;
			arg3.aShortArray94 = this.aShortArray94;
		}
		if (Static421.method5623(this.anInt7336, arg4)) {
			arg3.aClass138_1 = arg1.aClass138_1;
			arg3.aClass138_1.aBoolean253 = true;
			arg3.aClass138_1.aBoolean254 = this.aClass138_1.aBoolean254;
			arg3.aClass138_1.anInterface10_3 = this.aClass138_1.anInterface10_3;
		} else if (Static470.method6341(this.anInt7336, arg4)) {
			arg3.aClass138_1 = this.aClass138_1;
		} else {
			arg3.aClass138_1 = null;
		}
		if (Static244.method8151(arg4, this.anInt7336)) {
			if (arg1.aShortArray104 == null || this.anInt7301 > arg1.aShortArray104.length) {
				local193 = this.anInt7301;
				arg3.aShortArray104 = arg1.aShortArray104 = new short[local193];
			} else {
				arg3.aShortArray104 = arg1.aShortArray104;
			}
			for (local193 = 0; local193 < this.anInt7301; local193++) {
				arg3.aShortArray104[local193] = this.aShortArray104[local193];
			}
		} else {
			arg3.aShortArray104 = this.aShortArray104;
		}
		if (!Static11.method164(arg4, this.anInt7336)) {
			arg3.aClass187Array1 = this.aClass187Array1;
		} else if (arg1.aClass187Array1 == null || this.anInt7346 > arg1.aClass187Array1.length) {
			local193 = this.anInt7346;
			arg3.aClass187Array1 = arg1.aClass187Array1 = new Class187[local193];
			for (local582 = 0; local582 < this.anInt7346; local582++) {
				arg3.aClass187Array1[local582] = this.aClass187Array1[local582].method4006();
			}
		} else {
			arg3.aClass187Array1 = arg1.aClass187Array1;
			for (local193 = 0; local193 < this.anInt7346; local193++) {
				arg3.aClass187Array1[local193].method4010(this.aClass187Array1[local193]);
			}
		}
		arg3.anIntArray534 = this.anIntArray534;
		arg3.anIntArrayArray43 = this.anIntArrayArray43;
		arg3.lb = this.lb;
		arg3.aClass255Array5 = this.aClass255Array5;
		arg3.aShortArray97 = this.aShortArray97;
		arg3.aClass97Array1 = this.aClass97Array1;
		arg3.anIntArray531 = this.anIntArray531;
		arg3.anIntArrayArray45 = this.anIntArrayArray45;
		arg3.anIntArrayArray44 = this.anIntArrayArray44;
		arg3.aShortArray95 = this.aShortArray95;
		arg3.anIntArray530 = this.anIntArray530;
		arg3.aShortArray98 = this.aShortArray98;
		arg3.anIntArray529 = this.anIntArray529;
		arg3.aShortArray99 = this.aShortArray99;
		if (this.aBoolean549) {
			arg3.anInt7348 = this.anInt7348;
			arg3.anInt7305 = this.anInt7305;
			arg3.anInt7355 = this.anInt7355;
			arg3.anInt7356 = this.anInt7356;
			arg3.anInt7359 = this.anInt7359;
			arg3.anInt7284 = this.anInt7284;
			arg3.anInt7335 = this.anInt7335;
			arg3.aBoolean549 = true;
			arg3.anInt7343 = this.anInt7343;
		} else {
			arg3.aBoolean549 = false;
		}
		arg3.aClass143Array5 = this.aClass143Array5;
		return arg3;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(B)V")
	private void method6227() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(19) int local19 = -32768;
		@Pc(21) int local21 = -32768;
		@Pc(23) int local23 = -32768;
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt7312; local29++) {
			@Pc(36) int local36 = this.anIntArray533[local29];
			@Pc(41) int local41 = this.anIntArray532[local29];
			if (local19 < local36) {
				local19 = local36;
			}
			if (local9 > local41) {
				local9 = local41;
			}
			if (local36 < local7) {
				local7 = local36;
			}
			@Pc(69) int local69 = this.anIntArray535[local29];
			if (local21 < local41) {
				local21 = local41;
			}
			if (local69 < local11) {
				local11 = local69;
			}
			if (local23 < local69) {
				local23 = local69;
			}
			@Pc(100) int local100 = local36 * local36 + local69 * local69;
			if (local100 > local25) {
				local25 = local100;
			}
			local100 = local41 * local41 + local69 * local69 + local36 * local36;
			if (local100 > local27) {
				local27 = local100;
			}
		}
		this.anInt7305 = local23;
		this.anInt7356 = local7;
		this.anInt7348 = local11;
		this.anInt7343 = local19;
		this.anInt7335 = local9;
		this.anInt7355 = local21;
		this.anInt7359 = (int) (Math.sqrt((double) local25) + 0.99D);
		this.anInt7284 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean549 = true;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class182 method6208(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) Class182_Sub3 local22;
		@Pc(26) Class182_Sub3 local26;
		if (arg0 == 1) {
			local26 = this.aClass95_Sub3_18.aClass182_Sub3_21;
			local22 = this.aClass95_Sub3_18.aClass182_Sub3_23;
		} else if (arg0 == 2) {
			local22 = this.aClass95_Sub3_18.aClass182_Sub3_27;
			local26 = this.aClass95_Sub3_18.aClass182_Sub3_24;
		} else if (arg0 == 3) {
			local22 = this.aClass95_Sub3_18.aClass182_Sub3_28;
			local26 = this.aClass95_Sub3_18.aClass182_Sub3_26;
		} else if (arg0 == 4) {
			local22 = this.aClass95_Sub3_18.aClass182_Sub3_30;
			local26 = this.aClass95_Sub3_18.aClass182_Sub3_25;
		} else if (arg0 == 5) {
			local22 = this.aClass95_Sub3_18.aClass182_Sub3_29;
			local26 = this.aClass95_Sub3_18.aClass182_Sub3_22;
		} else {
			local22 = local26 = new Class182_Sub3(this.aClass95_Sub3_18, 0, 0, true, false);
		}
		return this.method6226(arg2, local26, arg0 != 0, local22, arg1);
	}

	@OriginalMember(owner = "client!qd", name = "g", descriptor = "(I)V")
	public void method6228() {
		if (this.aClass15_1 != null) {
			this.aClass15_1.method423();
		}
		if (this.aClass15_3 != null) {
			this.aClass15_3.method423();
		}
		if (this.aClass15_2 != null) {
			this.aClass15_2.method423();
		}
		if (this.aClass15_4 != null) {
			this.aClass15_4.method423();
		}
		if (this.aClass138_1 != null) {
			this.aClass138_1.method2940();
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!uha;IZ)V")
	@Override
	public void method6204(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray98 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt7312; local14++) {
			if ((this.aShortArray98[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method7882(this.anIntArray533[local14], this.anIntArray532[local14], this.anIntArray535[local14], local12);
				} else {
					arg0.method7866(this.anIntArray533[local14], this.anIntArray532[local14], this.anIntArray535[local14], local12);
				}
				this.anIntArray533[local14] = local12[0];
				this.anIntArray532[local14] = local12[1];
				this.anIntArray535[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7296; local7++) {
			this.anIntArray533[local7] = this.anIntArray533[local7] + 7 >> 4;
			this.anIntArray532[local7] = this.anIntArray532[local7] + 7 >> 4;
			this.anIntArray535[local7] = this.anIntArray535[local7] + 7 >> 4;
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(B)V")
	private void method6229() {
		if (this.anInt7315 == 0) {
			return;
		}
		if (this.method6231() && this.method6232()) {
			this.aClass95_Sub3_18.method7054(0, this.aClass15_1.anInterface16_2);
			this.aClass95_Sub3_18.method7054(1, this.aClass15_2.anInterface16_2);
			this.aClass95_Sub3_18.method7054(2, this.aClass15_3.anInterface16_2);
			@Pc(60) boolean local60;
			if ((this.anInt7336 & 0x37) == 0) {
				this.aClass95_Sub3_18.method7076(false);
				local60 = false;
				this.aClass95_Sub3_18.method7059(this.aClass95_Sub3_18.aClass72_22);
			} else {
				this.aClass95_Sub3_18.method7076(true);
				local60 = true;
				this.aClass95_Sub3_18.method7054(3, this.aClass15_4.anInterface16_2);
				this.aClass95_Sub3_18.method7059(this.aClass95_Sub3_18.aClass72_17);
			}
			for (@Pc(93) int local93 = 0; local93 < this.anIntArray534.length; local93++) {
				@Pc(100) int local100 = this.anIntArray531[local93];
				@Pc(107) int local107 = this.anIntArray531[local93 + 1];
				@Pc(114) int local114 = this.aShortArray104[local100] & 0xFFFF;
				if (local114 == 65535) {
					local114 = -1;
				}
				this.aClass95_Sub3_18.method7148(local60, true, local114);
				this.aClass95_Sub3_18.method7060(Static286.aClass30_3, local100 * 3, this.anIntArray534[local93], this.anIntArray530[local93], this.aClass138_1.anInterface10_3, local107 - local100);
			}
		}
		this.method6219();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6195(@OriginalArg(0) Class182 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class182_Sub3 local8 = (Class182_Sub3) arg0;
		if (this.anInt7301 == 0 || local8.anInt7301 == 0) {
			return;
		}
		@Pc(21) int local21 = local8.anInt7312;
		@Pc(24) int[] local24 = local8.anIntArray533;
		@Pc(27) int[] local27 = local8.anIntArray532;
		@Pc(30) int[] local30 = local8.anIntArray535;
		@Pc(33) short[] local33 = local8.aShortArray102;
		@Pc(36) short[] local36 = local8.aShortArray103;
		@Pc(39) short[] local39 = local8.aShortArray93;
		@Pc(42) byte[] local42 = local8.aByteArray85;
		@Pc(53) short[] local53;
		@Pc(51) short[] local51;
		@Pc(49) short[] local49;
		@Pc(47) byte[] local47;
		if (this.aClass278_1 == null) {
			local47 = null;
			local49 = null;
			local51 = null;
			local53 = null;
		} else {
			local51 = this.aClass278_1.aShortArray107;
			local47 = this.aClass278_1.aByteArray87;
			local49 = this.aClass278_1.aShortArray106;
			local53 = this.aClass278_1.aShortArray105;
		}
		@Pc(76) short[] local76;
		@Pc(78) short[] local78;
		@Pc(80) short[] local80;
		@Pc(82) byte[] local82;
		if (local8.aClass278_1 == null) {
			local76 = null;
			local78 = null;
			local80 = null;
			local82 = null;
		} else {
			local76 = local8.aClass278_1.aShortArray105;
			local78 = local8.aClass278_1.aShortArray107;
			local82 = local8.aClass278_1.aByteArray87;
			local80 = local8.aClass278_1.aShortArray106;
		}
		@Pc(103) int[] local103 = local8.anIntArray529;
		@Pc(106) short[] local106 = local8.lb;
		if (!local8.aBoolean549) {
			local8.method6227();
		}
		@Pc(115) int local115 = local8.anInt7335;
		@Pc(118) int local118 = local8.anInt7355;
		@Pc(121) int local121 = local8.anInt7356;
		@Pc(124) int local124 = local8.anInt7343;
		@Pc(127) int local127 = local8.anInt7348;
		@Pc(130) int local130 = local8.anInt7305;
		for (@Pc(132) int local132 = 0; local132 < this.anInt7312; local132++) {
			@Pc(142) int local142 = this.anIntArray532[local132] - arg2;
			if (local142 >= local115 && local118 >= local142) {
				@Pc(158) int local158 = this.anIntArray533[local132] - arg1;
				if (local121 <= local158 && local158 <= local124) {
					@Pc(182) int local182 = this.anIntArray535[local132] - arg3;
					if (local127 <= local182 && local130 >= local182) {
						@Pc(200) int local200 = -1;
						@Pc(205) int local205 = this.anIntArray529[local132];
						@Pc(212) int local212 = this.anIntArray529[local132 + 1];
						for (@Pc(214) int local214 = local205; local214 < local212; local214++) {
							local200 = this.lb[local214] - 1;
							if (local200 == -1 || this.aByteArray85[local200] != 0) {
								break;
							}
						}
						if (local200 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local21; local247++) {
								if (local158 == local24[local247] && local182 == local30[local247] && local142 == local27[local247]) {
									local212 = local103[local247 + 1];
									local205 = local103[local247];
									@Pc(276) int local276 = -1;
									for (@Pc(278) int local278 = local205; local278 < local212; local278++) {
										local276 = local106[local278] - 1;
										if (local276 == -1 || local42[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local53 == null) {
											this.aClass278_1 = new Class278();
											local53 = this.aClass278_1.aShortArray105 = Static142.method2161(this.aShortArray102);
											local51 = this.aClass278_1.aShortArray107 = Static142.method2161(this.aShortArray103);
											local49 = this.aClass278_1.aShortArray106 = Static142.method2161(this.aShortArray93);
											local47 = this.aClass278_1.aByteArray87 = Static565.method7737(this.aByteArray85);
										}
										if (local76 == null) {
											@Pc(361) Class278 local361 = local8.aClass278_1 = new Class278();
											local76 = local361.aShortArray105 = Static142.method2161(local33);
											local78 = local361.aShortArray107 = Static142.method2161(local36);
											local80 = local361.aShortArray106 = Static142.method2161(local39);
											local82 = local361.aByteArray87 = Static565.method7737(local42);
										}
										@Pc(394) short local394 = this.aShortArray102[local200];
										@Pc(399) short local399 = this.aShortArray103[local200];
										@Pc(404) short local404 = this.aShortArray93[local200];
										local205 = local103[local247];
										@Pc(413) byte local413 = this.aByteArray85[local200];
										local212 = local103[local247 + 1];
										@Pc(429) int local429;
										for (@Pc(421) int local421 = local205; local421 < local212; local421++) {
											local429 = local106[local421] - 1;
											if (local429 == -1) {
												break;
											}
											if (local82[local429] != 0) {
												local76[local429] += local394;
												local78[local429] += local399;
												local80[local429] += local404;
												local82[local429] += local413;
											}
										}
										local404 = local39[local276];
										local205 = this.anIntArray529[local132];
										local394 = local33[local276];
										local413 = local42[local276];
										local399 = local36[local276];
										local212 = this.anIntArray529[local132 + 1];
										for (local429 = local205; local429 < local212; local429++) {
											@Pc(519) int local519 = this.lb[local429] - 1;
											if (local519 == -1) {
												break;
											}
											if (local47[local519] != 0) {
												local53[local519] += local394;
												local51[local519] += local399;
												local49[local519] += local404;
												local47[local519] += local413;
											}
										}
										local8.method6221();
										this.method6221();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "()V")
	@Override
	protected void method6209() {
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method6230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 < arg0 && arg3 < arg7 && arg2 > arg3) {
			return false;
		} else if (arg0 < arg3 && arg3 > arg7 && arg2 < arg3) {
			return false;
		} else if (arg5 > arg1 && arg6 > arg1 && arg1 < arg4) {
			return false;
		} else {
			return arg1 <= arg5 || arg1 <= arg6 || arg1 <= arg4;
		}
	}

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "()V")
	@Override
	public void method6212() {
		if (this.anInt7318 > 0 && this.anInt7315 > 0) {
			this.method6231();
			this.method6232();
			this.method6219();
		}
	}

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean550;
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)Z")
	private boolean method6231() {
		@Pc(13) boolean local13 = !this.aClass15_2.aBoolean39;
		@Pc(35) boolean local35 = (this.anInt7336 & 0x37) != 0 && !this.aClass15_4.aBoolean39;
		@Pc(43) boolean local43 = !this.aClass15_1.aBoolean39;
		@Pc(51) boolean local51 = !this.aClass15_3.aBoolean39;
		if (!local43 && !local13 && !local35 && !local51) {
			return true;
		}
		@Pc(63) boolean local63 = true;
		@Pc(82) Interface16 local82;
		@Pc(96) Buffer local96;
		if (local43) {
			if (this.aClass15_1.anInterface16_1 == null) {
				this.aClass15_1.anInterface16_1 = this.aClass95_Sub3_18.method7122(this.aBoolean548);
			}
			local82 = this.aClass15_1.anInterface16_1;
			local82.method7457(this.anInt7318 * 12, 12);
			local96 = local82.method7456();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass95_Sub3_18.aNativeInterface3.copyPositions(this.anIntArray533, this.anIntArray532, this.anIntArray535, this.aShortArray97, 0, 12, this.anInt7318, local96.getAddress());
				if (local82.method7458()) {
					this.aClass15_1.anInterface16_2 = local82;
					this.aClass15_1.aBoolean39 = true;
				} else {
					local63 = false;
				}
			}
		}
		@Pc(204) short[] local204;
		@Pc(207) short[] local207;
		@Pc(210) short[] local210;
		@Pc(213) byte[] local213;
		if (local13) {
			if (this.aClass15_2.anInterface16_1 == null) {
				this.aClass15_2.anInterface16_1 = this.aClass95_Sub3_18.method7122(this.aBoolean548);
			}
			local82 = this.aClass15_2.anInterface16_1;
			local82.method7457(this.anInt7318 * 4, 4);
			local96 = local82.method7456();
			if (local96 == null) {
				local63 = false;
			} else {
				if ((this.anInt7336 & 0x37) == 0) {
					if (this.aClass278_1 == null) {
						local204 = this.aShortArray102;
						local207 = this.aShortArray103;
						local210 = this.aShortArray93;
						local213 = this.aByteArray85;
					} else {
						local210 = this.aClass278_1.aShortArray106;
						local213 = this.aClass278_1.aByteArray87;
						local207 = this.aClass278_1.aShortArray107;
						local204 = this.aClass278_1.aShortArray105;
					}
					this.aClass95_Sub3_18.aNativeInterface3.copyLighting(this.aShortArray100, this.aByteArray86, this.aShortArray104, local204, local207, local210, local213, this.aShort102, this.aShort101, this.aShortArray95, 0, 4, this.anInt7318, local96.getAddress());
				} else {
					this.aClass95_Sub3_18.aNativeInterface3.copyColours(this.aShortArray100, this.aByteArray86, this.aShortArray104, this.aShort102, this.aShortArray95, 0, 4, this.anInt7318, local96.getAddress());
				}
				if (local82.method7458()) {
					this.aClass15_2.aBoolean39 = true;
					this.aClass15_2.anInterface16_2 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local35) {
			if (this.aClass15_4.anInterface16_1 == null) {
				this.aClass15_4.anInterface16_1 = this.aClass95_Sub3_18.method7122(this.aBoolean548);
			}
			local82 = this.aClass15_4.anInterface16_1;
			local82.method7457(this.anInt7318 * 12, 12);
			local96 = local82.method7456();
			if (local96 == null) {
				local63 = false;
			} else {
				if (this.aClass278_1 == null) {
					local210 = this.aShortArray93;
					local207 = this.aShortArray103;
					local204 = this.aShortArray102;
					local213 = this.aByteArray85;
				} else {
					local207 = this.aClass278_1.aShortArray107;
					local204 = this.aClass278_1.aShortArray105;
					local210 = this.aClass278_1.aShortArray106;
					local213 = this.aClass278_1.aByteArray87;
				}
				this.aClass95_Sub3_18.aNativeInterface3.copyNormals(local204, local207, local210, local213, 3.0F / (float) this.aShort101, 3.0F / (float) (this.aShort101 + this.aShort101 / 2), 0, 12, this.anInt7318, local96.getAddress());
				if (local82.method7458()) {
					this.aClass15_4.aBoolean39 = true;
					this.aClass15_4.anInterface16_2 = local82;
				} else {
					local63 = false;
				}
			}
		}
		if (local51) {
			if (this.aClass15_3.anInterface16_1 == null) {
				this.aClass15_3.anInterface16_1 = this.aClass95_Sub3_18.method7122(this.aBoolean548);
			}
			local82 = this.aClass15_3.anInterface16_1;
			local82.method7457(this.anInt7318 * 8, 8);
			local96 = local82.method7456();
			if (local96 == null) {
				local63 = false;
			} else {
				this.aClass95_Sub3_18.aNativeInterface3.copyTexCoords(this.aFloatArray44, this.aFloatArray43, 0, 8, this.anInt7318, local96.getAddress());
				if (local82.method7458()) {
					this.aClass15_3.aBoolean39 = true;
					this.aClass15_3.anInterface16_2 = local82;
				} else {
					local63 = false;
				}
			}
		}
		return local63;
	}

	@OriginalMember(owner = "client!qd", name = "h", descriptor = "(I)Z")
	private boolean method6232() {
		if (this.aClass138_1.aBoolean254) {
			return true;
		}
		if (this.aClass138_1.anInterface10_2 == null) {
			this.aClass138_1.anInterface10_2 = this.aClass95_Sub3_18.method7119(this.aBoolean548);
		}
		@Pc(28) Interface10 local28 = this.aClass138_1.anInterface10_2;
		local28.method7382(this.anInt7315 * 6);
		@Pc(45) Buffer local45 = local28.method7385();
		if (local45 != null) {
			@Pc(53) Stream local53 = this.aClass95_Sub3_18.method7086(local45);
			@Pc(57) int local57;
			if (Stream.a()) {
				for (local57 = 0; local57 < this.anInt7315; local57++) {
					local53.e(this.aShortArray101[local57]);
					local53.e(this.aShortArray94[local57]);
					local53.e(this.aShortArray96[local57]);
				}
			} else {
				for (local57 = 0; local57 < this.anInt7315; local57++) {
					local53.b(this.aShortArray101[local57]);
					local53.b(this.aShortArray94[local57]);
					local53.b(this.aShortArray96[local57]);
				}
			}
			local53.c();
			if (local28.method7384()) {
				this.aClass138_1.aBoolean254 = true;
				this.aBoolean551 = true;
				this.aClass138_1.anInterface10_3 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7301; local3++) {
			if (arg0 == this.aShortArray100[local3]) {
				this.aShortArray100[local3] = arg1;
			}
		}
		if (this.aClass97Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt7346; local34++) {
				@Pc(41) Class97 local41 = this.aClass97Array1[local34];
				@Pc(46) Class187 local46 = this.aClass187Array1[local34];
				local46.anInt4715 = local46.anInt4715 & 0xFF000000 | Static343.anIntArray359[this.aShortArray100[local41.anInt2571] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method6223();
	}

	@OriginalMember(owner = "client!qd", name = "d", descriptor = "()V")
	@Override
	protected void method6210() {
	}

	@OriginalMember(owner = "client!qd", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7343;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IJIIILclient!kda;IIFIF)S")
	private short method6233(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class186 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9) {
		@Pc(10) int local10 = this.anIntArray529[arg6];
		@Pc(17) int local17 = this.anIntArray529[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.lb[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static260.aLongArray20[local21] == arg1) {
				return (short) (local28 - 1);
			}
		}
		this.lb[local19] = (short) (this.anInt7318 + 1);
		Static260.aLongArray20[local19] = arg1;
		this.aShortArray95[this.anInt7318] = (short) arg8;
		this.aShortArray97[this.anInt7318] = (short) arg6;
		this.aShortArray102[this.anInt7318] = (short) arg0;
		this.aShortArray103[this.anInt7318] = (short) arg2;
		this.aShortArray93[this.anInt7318] = (short) arg5;
		this.aByteArray85[this.anInt7318] = (byte) arg3;
		this.aFloatArray44[this.anInt7318] = arg7;
		this.aFloatArray43[this.anInt7318] = arg9;
		return (short) this.anInt7318++;
	}

	@OriginalMember(owner = "client!qd", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort101;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	private void method6234() {
		if (this.aClass138_1 != null) {
			this.aClass138_1.aBoolean254 = false;
		}
	}

	@OriginalMember(owner = "client!qd", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7359;
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "()Z")
	@Override
	public boolean method6207() {
		if (this.aShortArray104 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray104.length; local12++) {
			if (this.aShortArray104[local12] != -1 && !this.aClass95_Sub3_18.anInterface6_27.method1493(this.aShortArray104[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qd", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7312; local3++) {
			if (arg0 != 0) {
				this.anIntArray533[local3] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray532[local3] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray535[local3] += arg2;
			}
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7335;
	}

	@OriginalMember(owner = "client!qd", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub2_Sub19 ba(@OriginalArg(0) Class2_Sub2_Sub19 arg0) {
		if (this.anInt7318 == 0) {
			return null;
		}
		if (!this.aBoolean549) {
			this.method6227();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass95_Sub3_18.anInt8384 <= 0) {
			local43 = this.anInt7356 - (this.aClass95_Sub3_18.anInt8384 * this.anInt7335 >> 8) >> this.aClass95_Sub3_18.anInt8351;
			local60 = this.anInt7343 - (this.aClass95_Sub3_18.anInt8384 * this.anInt7355 >> 8) >> this.aClass95_Sub3_18.anInt8351;
		} else {
			local43 = this.anInt7356 - (this.anInt7355 * this.aClass95_Sub3_18.anInt8384 >> 8) >> this.aClass95_Sub3_18.anInt8351;
			local60 = this.anInt7343 - (this.aClass95_Sub3_18.anInt8384 * this.anInt7335 >> 8) >> this.aClass95_Sub3_18.anInt8351;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass95_Sub3_18.anInt8370 > 0) {
			local116 = this.anInt7348 - (this.aClass95_Sub3_18.anInt8370 * this.anInt7355 >> 8) >> this.aClass95_Sub3_18.anInt8351;
			local133 = this.anInt7305 - (this.anInt7335 * this.aClass95_Sub3_18.anInt8370 >> 8) >> this.aClass95_Sub3_18.anInt8351;
		} else {
			local116 = this.anInt7348 - (this.aClass95_Sub3_18.anInt8370 * this.anInt7335 >> 8) >> this.aClass95_Sub3_18.anInt8351;
			local133 = this.anInt7305 - (this.aClass95_Sub3_18.anInt8370 * this.anInt7355 >> 8) >> this.aClass95_Sub3_18.anInt8351;
		}
		@Pc(176) int local176 = local60 + 1 - local43;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class2_Sub2_Sub19_Sub2 local186 = (Class2_Sub2_Sub19_Sub2) arg0;
		@Pc(196) Class2_Sub2_Sub19_Sub2 local196;
		if (local186 != null && local186.method8284(local176, local183)) {
			local196 = local186;
			local186.method8277();
		} else {
			local196 = new Class2_Sub2_Sub19_Sub2(this.aClass95_Sub3_18, local176, local183);
		}
		local196.method8280(local133, local116, local43, local60);
		this.method6224(local196);
		return local196;
	}

	@OriginalMember(owner = "client!qd", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			Static364.anInt5767 = 0;
			local26 = 0;
			Static218.anInt10033 = 0;
			Static164.anInt2940 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray45.length) {
					local48 = this.anIntArrayArray45[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local56]) != 0) {
							Static218.anInt10033 += this.anIntArray533[local56];
							Static364.anInt5767 += this.anIntArray532[local56];
							Static164.anInt2940 += this.anIntArray535[local56];
							local26++;
						}
					}
				}
			}
			if (local26 > 0) {
				Static218.anInt10033 = arg2 + Static218.anInt10033 / local26;
				Static164.anInt2940 = Static164.anInt2940 / local26 + arg4;
				Static364.anInt5767 = arg3 + Static364.anInt5767 / local26;
				Static332.aBoolean372 = true;
			} else {
				Static364.anInt5767 = arg3;
				Static218.anInt10033 = arg2;
				Static164.anInt2940 = arg4;
			}
			return;
		}
		@Pc(251) int[] local251;
		@Pc(253) int local253;
		if (arg0 == 1) {
			if (arg7 != null) {
				local26 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg4 * arg7[8] + arg7[7] * arg3 + arg2 * arg7[6] + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local26;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (this.anIntArrayArray45.length > local32) {
					local251 = this.anIntArrayArray45[local32];
					for (local253 = 0; local253 < local251.length; local253++) {
						local50 = local251[local253];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local50]) != 0) {
							this.anIntArray533[local50] += arg2;
							this.anIntArray532[local50] += arg3;
							this.anIntArray535[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(392) int local392;
		@Pc(410) int local410;
		@Pc(632) int local632;
		@Pc(641) int local641;
		@Pc(651) int local651;
		@Pc(655) int local655;
		@Pc(674) int local674;
		@Pc(995) int local995;
		@Pc(1003) int local1003;
		@Pc(1158) int local1158;
		@Pc(1185) int local1185;
		@Pc(1189) int local1189;
		@Pc(1199) int local1199;
		@Pc(1204) int local1204;
		@Pc(1208) int local1208;
		@Pc(1212) int local1212;
		@Pc(1214) int local1214;
		@Pc(1346) int[] local1346;
		@Pc(1348) int local1348;
		@Pc(1352) int local1352;
		@Pc(1356) int local1356;
		@Pc(1358) int local1358;
		@Pc(1486) int local1486;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray45.length) {
						local251 = this.anIntArrayArray45[local32];
						for (local253 = 0; local253 < local251.length; local253++) {
							local50 = local251[local253];
							if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local50]) != 0) {
								this.anIntArray533[local50] -= Static218.anInt10033;
								this.anIntArray532[local50] -= Static364.anInt5767;
								this.anIntArray535[local50] -= Static164.anInt2940;
								if (arg4 != 0) {
									local56 = Canvas_Sub1.anIntArray497[arg4];
									local392 = Canvas_Sub1.anIntArray498[arg4];
									local410 = this.anIntArray532[local50] * local56 + this.anIntArray533[local50] * local392 + 16383 >> 14;
									this.anIntArray532[local50] = local392 * this.anIntArray532[local50] + 16383 - this.anIntArray533[local50] * local56 >> 14;
									this.anIntArray533[local50] = local410;
								}
								if (arg2 != 0) {
									local56 = Canvas_Sub1.anIntArray497[arg2];
									local392 = Canvas_Sub1.anIntArray498[arg2];
									local410 = local392 * this.anIntArray532[local50] + 16383 - this.anIntArray535[local50] * local56 >> 14;
									this.anIntArray535[local50] = local392 * this.anIntArray535[local50] + local56 * this.anIntArray532[local50] + 16383 >> 14;
									this.anIntArray532[local50] = local410;
								}
								if (arg3 != 0) {
									local56 = Canvas_Sub1.anIntArray497[arg3];
									local392 = Canvas_Sub1.anIntArray498[arg3];
									local410 = this.anIntArray533[local50] * local392 + local56 * this.anIntArray535[local50] + 16383 >> 14;
									this.anIntArray535[local50] = local392 * this.anIntArray535[local50] + 16383 - this.anIntArray533[local50] * local56 >> 14;
									this.anIntArray533[local50] = local410;
								}
								this.anIntArray533[local50] += Static218.anInt10033;
								this.anIntArray532[local50] += Static364.anInt5767;
								this.anIntArray535[local50] += Static164.anInt2940;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray45.length > local38) {
							local48 = this.anIntArrayArray45[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray98 == null || (this.aShortArray98[local56] & arg6) != 0) {
									local392 = this.anIntArray529[local56];
									local410 = this.anIntArray529[local56 + 1];
									for (local632 = local392; local632 < local410; local632++) {
										local641 = this.lb[local632] - 1;
										if (local641 == -1) {
											break;
										}
										if (arg4 != 0) {
											local651 = Canvas_Sub1.anIntArray497[arg4];
											local655 = Canvas_Sub1.anIntArray498[arg4];
											local674 = this.aShortArray103[local641] * local651 + local655 * this.aShortArray102[local641] + 16383 >> 14;
											this.aShortArray103[local641] = (short) (local655 * this.aShortArray103[local641] + 16383 - local651 * this.aShortArray102[local641] >> 14);
											this.aShortArray102[local641] = (short) local674;
										}
										if (arg2 != 0) {
											local651 = Canvas_Sub1.anIntArray497[arg2];
											local655 = Canvas_Sub1.anIntArray498[arg2];
											local674 = local655 * this.aShortArray103[local641] + 16383 - this.aShortArray93[local641] * local651 >> 14;
											this.aShortArray93[local641] = (short) (this.aShortArray103[local641] * local651 + this.aShortArray93[local641] * local655 + 16383 >> 14);
											this.aShortArray103[local641] = (short) local674;
										}
										if (arg3 != 0) {
											local651 = Canvas_Sub1.anIntArray497[arg3];
											local655 = Canvas_Sub1.anIntArray498[arg3];
											local674 = local655 * this.aShortArray102[local641] + this.aShortArray93[local641] * local651 + 16383 >> 14;
											this.aShortArray93[local641] = (short) (local655 * this.aShortArray93[local641] + 16383 - local651 * this.aShortArray102[local641] >> 14);
											this.aShortArray102[local641] = (short) local674;
										}
									}
								}
							}
						}
					}
					this.method6221();
					return;
				}
			} else {
				local26 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local253 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static332.aBoolean372) {
					local392 = arg7[6] * Static164.anInt2940 + Static218.anInt10033 * arg7[0] + arg7[3] * Static364.anInt5767 + 8192 >> 14;
					local410 = arg7[4] * Static364.anInt5767 + arg7[1] * Static218.anInt10033 + Static164.anInt2940 * arg7[7] + 8192 >> 14;
					local410 += local50;
					local392 += local253;
					local632 = arg7[2] * Static218.anInt10033 + arg7[5] * Static364.anInt5767 + arg7[8] * Static164.anInt2940 + 8192 >> 14;
					Static218.anInt10033 = local392;
					local632 += local56;
					Static364.anInt5767 = local410;
					Static332.aBoolean372 = false;
					Static164.anInt2940 = local632;
				}
				@Pc(963) int[] local963 = new int[9];
				local410 = Canvas_Sub1.anIntArray498[arg2];
				local632 = Canvas_Sub1.anIntArray497[arg2];
				local641 = Canvas_Sub1.anIntArray498[arg3];
				local651 = Canvas_Sub1.anIntArray497[arg3];
				local655 = Canvas_Sub1.anIntArray498[arg4];
				local674 = Canvas_Sub1.anIntArray497[arg4];
				local995 = local632 * local655 + 8192 >> 14;
				local1003 = local632 * local674 + 8192 >> 14;
				local963[4] = local655 * local410 + 8192 >> 14;
				local963[3] = local674 * local410 + 8192 >> 14;
				local963[1] = local674 * -local641 + local995 * local651 + 8192 >> 14;
				local963[0] = local651 * local1003 + local641 * local655 + 8192 >> 14;
				local963[2] = local651 * local410 + 8192 >> 14;
				local963[8] = local410 * local641 + 8192 >> 14;
				local963[5] = -local632;
				local963[7] = local651 * local674 + local641 * local995 + 8192 >> 14;
				local963[6] = local655 * -local651 + local641 * local1003 + 8192 >> 14;
				@Pc(1133) int local1133 = -Static364.anInt5767 * local963[1] + -Static218.anInt10033 * local963[0] + local963[2] * -Static164.anInt2940 + 8192 >> 14;
				local1158 = -Static364.anInt5767 * local963[4] + local963[3] * -Static218.anInt10033 + -Static164.anInt2940 * local963[5] + 8192 >> 14;
				local1185 = local963[6] * -Static218.anInt10033 + local963[7] * -Static364.anInt5767 + -Static164.anInt2940 * local963[8] + 8192 >> 14;
				local1189 = local1133 + Static218.anInt10033;
				@Pc(1194) int local1194 = local1158 + Static364.anInt5767;
				local1199 = local1185 + Static164.anInt2940;
				@Pc(1202) int[] local1202 = new int[9];
				for (local1204 = 0; local1204 < 3; local1204++) {
					for (local1208 = 0; local1208 < 3; local1208++) {
						local1212 = 0;
						for (local1214 = 0; local1214 < 3; local1214++) {
							local1212 += arg7[local1214 + local1208 * 3] * local963[local1214 + local1204 * 3];
						}
						local1202[local1208 + local1204 * 3] = local1212 + 8192 >> 14;
					}
				}
				local1208 = local50 * local963[1] + local253 * local963[0] + local963[2] * local56 + 8192 >> 14;
				local1212 = local253 * local963[3] + local963[4] * local50 + local963[5] * local56 + 8192 >> 14;
				local1208 += local1189;
				local1214 = local963[6] * local253 + local963[7] * local50 + local963[8] * local56 + 8192 >> 14;
				local1212 += local1194;
				local1214 += local1199;
				local1346 = new int[9];
				for (local1348 = 0; local1348 < 3; local1348++) {
					for (local1352 = 0; local1352 < 3; local1352++) {
						local1356 = 0;
						for (local1358 = 0; local1358 < 3; local1358++) {
							local1356 += local1202[local1352 + local1358 * 3] * arg7[local1358 + local1348 * 3];
						}
						local1346[local1348 * 3 + local1352] = local1356 + 8192 >> 14;
					}
				}
				local1352 = local1214 * arg7[2] + arg7[1] * local1212 + arg7[0] * local1208 + 8192 >> 14;
				local1356 = local1214 * arg7[5] + local1212 * arg7[4] + arg7[3] * local1208 + 8192 >> 14;
				local1358 = arg7[6] * local1208 + local1212 * arg7[7] + local1214 * arg7[8] + 8192 >> 14;
				local1356 += local32;
				local1352 += local26;
				local1358 += local38;
				for (local1486 = 0; local1486 < local8; local1486++) {
					@Pc(1492) int local1492 = arg1[local1486];
					if (local1492 < this.anIntArrayArray45.length) {
						@Pc(1506) int[] local1506 = this.anIntArrayArray45[local1492];
						for (@Pc(1508) int local1508 = 0; local1508 < local1506.length; local1508++) {
							@Pc(1514) int local1514 = local1506[local1508];
							if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local1514]) != 0) {
								@Pc(1557) int local1557 = local1346[0] * this.anIntArray533[local1514] + this.anIntArray532[local1514] * local1346[1] + this.anIntArray535[local1514] * local1346[2] + 8192 >> 14;
								@Pc(1588) int local1588 = this.anIntArray535[local1514] * local1346[5] + local1346[4] * this.anIntArray532[local1514] + local1346[3] * this.anIntArray533[local1514] + 8192 >> 14;
								@Pc(1592) int local1592 = local1557 + local1352;
								@Pc(1624) int local1624 = local1346[7] * this.anIntArray532[local1514] + local1346[6] * this.anIntArray533[local1514] + local1346[8] * this.anIntArray535[local1514] + 8192 >> 14;
								@Pc(1628) int local1628 = local1588 + local1356;
								this.anIntArray533[local1514] = local1592;
								@Pc(1637) int local1637 = local1624 + local1358;
								this.anIntArray532[local1514] = local1628;
								this.anIntArray535[local1514] = local1637;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2561) Class187 local2561;
			@Pc(2450) boolean local2450;
			@Pc(2556) Class97 local2556;
			if (arg0 == 5) {
				if (this.anIntArrayArray44 != null) {
					local2450 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray44.length) {
							local48 = this.anIntArrayArray44[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray99 == null || (this.aShortArray99[local56] & arg6) != 0) {
									local392 = arg2 * 8 + (this.aByteArray86[local56] & 0xFF);
									if (local392 < 0) {
										local392 = 0;
									} else if (local392 > 255) {
										local392 = 255;
									}
									this.aByteArray86[local56] = (byte) local392;
								}
							}
							local2450 |= local48.length > 0;
						}
					}
					if (local2450) {
						if (this.aClass97Array1 != null) {
							for (local38 = 0; local38 < this.anInt7346; local38++) {
								local2556 = this.aClass97Array1[local38];
								local2561 = this.aClass187Array1[local38];
								local2561.anInt4715 = local2561.anInt4715 & 0xFFFFFF | 255 - (this.aByteArray86[local2556.anInt2571] & 0xFF) << 24;
							}
						}
						this.method6223();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray44 != null) {
					local2450 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray44.length > local38) {
							local48 = this.anIntArrayArray44[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray99 == null || (this.aShortArray99[local56] & arg6) != 0) {
									local392 = this.aShortArray100[local56] & 0xFFFF;
									local410 = local392 >> 10 & 0x3F;
									local632 = local392 >> 7 & 0x7;
									local632 += arg3 / 4;
									local641 = local392 & 0x7F;
									@Pc(2676) int local2676 = arg2 + local410 & 0x3F;
									if (local632 < 0) {
										local632 = 0;
									} else if (local632 > 7) {
										local632 = 7;
									}
									local641 += arg4;
									if (local641 < 0) {
										local641 = 0;
									} else if (local641 > 127) {
										local641 = 127;
									}
									this.aShortArray100[local56] = (short) (local641 | local2676 << 10 | local632 << 7);
								}
							}
							local2450 |= local48.length > 0;
						}
					}
					if (local2450) {
						if (this.aClass97Array1 != null) {
							for (local38 = 0; local38 < this.anInt7346; local38++) {
								local2556 = this.aClass97Array1[local38];
								local2561 = this.aClass187Array1[local38];
								local2561.anInt4715 = local2561.anInt4715 & 0xFF000000 | Static343.anIntArray359[this.aShortArray100[local2556.anInt2571] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method6223();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray43 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (this.anIntArrayArray43.length > local32) {
							local251 = this.anIntArrayArray43[local32];
							for (local253 = 0; local253 < local251.length; local253++) {
								local2561 = this.aClass187Array1[local251[local253]];
								local2561.anInt4719 += arg2;
								local2561.anInt4714 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray43 != null) {
					for (local26 = 0; local26 < local8; local26++) {
						local32 = arg1[local26];
						if (local32 < this.anIntArrayArray43.length) {
							local251 = this.anIntArrayArray43[local32];
							for (local253 = 0; local253 < local251.length; local253++) {
								local2561 = this.aClass187Array1[local251[local253]];
								local2561.anInt4722 = arg3 * local2561.anInt4722 >> 7;
								local2561.anInt4713 = local2561.anInt4713 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray43 != null) {
				for (local26 = 0; local26 < local8; local26++) {
					local32 = arg1[local26];
					if (local32 < this.anIntArrayArray43.length) {
						local251 = this.anIntArrayArray43[local32];
						for (local253 = 0; local253 < local251.length; local253++) {
							local2561 = this.aClass187Array1[local251[local253]];
							local2561.anInt4723 = arg2 + local2561.anInt4723 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local26 = 0; local26 < local8; local26++) {
				local32 = arg1[local26];
				if (local32 < this.anIntArrayArray45.length) {
					local251 = this.anIntArrayArray45[local32];
					for (local253 = 0; local253 < local251.length; local253++) {
						local50 = local251[local253];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local50]) != 0) {
							this.anIntArray533[local50] -= Static218.anInt10033;
							this.anIntArray532[local50] -= Static364.anInt5767;
							this.anIntArray535[local50] -= Static164.anInt2940;
							this.anIntArray533[local50] = this.anIntArray533[local50] * arg2 >> 7;
							this.anIntArray532[local50] = arg3 * this.anIntArray532[local50] >> 7;
							this.anIntArray535[local50] = this.anIntArray535[local50] * arg4 >> 7;
							this.anIntArray533[local50] += Static218.anInt10033;
							this.anIntArray532[local50] += Static364.anInt5767;
							this.anIntArray535[local50] += Static164.anInt2940;
						}
					}
				}
			}
		} else {
			local26 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local253 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static332.aBoolean372) {
				local392 = arg7[6] * Static164.anInt2940 + Static218.anInt10033 * arg7[0] + Static364.anInt5767 * arg7[3] + 8192 >> 14;
				local410 = Static164.anInt2940 * arg7[7] + Static364.anInt5767 * arg7[4] + Static218.anInt10033 * arg7[1] + 8192 >> 14;
				local392 += local253;
				local632 = Static164.anInt2940 * arg7[8] + Static218.anInt10033 * arg7[2] + arg7[5] * Static364.anInt5767 + 8192 >> 14;
				local410 += local50;
				Static364.anInt5767 = local410;
				local632 += local56;
				Static218.anInt10033 = local392;
				Static164.anInt2940 = local632;
				Static332.aBoolean372 = false;
			}
			local392 = arg2 << 15 >> 7;
			local410 = arg3 << 15 >> 7;
			local632 = arg4 << 15 >> 7;
			local641 = -Static218.anInt10033 * local392 + 8192 >> 14;
			local651 = -Static364.anInt5767 * local410 + 8192 >> 14;
			local655 = -Static164.anInt2940 * local632 + 8192 >> 14;
			local674 = Static218.anInt10033 + local641;
			local995 = Static364.anInt5767 + local651;
			local1003 = Static164.anInt2940 + local655;
			@Pc(1986) int[] local1986 = new int[] { arg7[0] * local392 + 8192 >> 14, local392 * arg7[3] + 8192 >> 14, arg7[6] * local392 + 8192 >> 14, local410 * arg7[1] + 8192 >> 14, arg7[4] * local410 + 8192 >> 14, local410 * arg7[7] + 8192 >> 14, arg7[2] * local632 + 8192 >> 14, arg7[5] * local632 + 8192 >> 14, arg7[8] * local632 + 8192 >> 14 };
			local1158 = local392 * local253 + 8192 >> 14;
			local1185 = local410 * local50 + 8192 >> 14;
			@Pc(2114) int local2114 = local1158 + local674;
			local1189 = local56 * local632 + 8192 >> 14;
			@Pc(2126) int local2126 = local1185 + local995;
			@Pc(2130) int local2130 = local1189 + local1003;
			@Pc(2133) int[] local2133 = new int[9];
			@Pc(2139) int local2139;
			for (local1199 = 0; local1199 < 3; local1199++) {
				for (local2139 = 0; local2139 < 3; local2139++) {
					local1204 = 0;
					for (local1208 = 0; local1208 < 3; local1208++) {
						local1204 += arg7[local1208 + local1199 * 3] * local1986[local2139 + local1208 * 3];
					}
					local2133[local1199 * 3 + local2139] = local1204 + 8192 >> 14;
				}
			}
			local2139 = arg7[2] * local2130 + local2126 * arg7[1] + arg7[0] * local2114 + 8192 >> 14;
			local1204 = local2126 * arg7[4] + local2114 * arg7[3] + local2130 * arg7[5] + 8192 >> 14;
			local1208 = arg7[7] * local2126 + arg7[6] * local2114 + arg7[8] * local2130 + 8192 >> 14;
			local2139 += local26;
			local1204 += local32;
			local1208 += local38;
			for (local1212 = 0; local1212 < local8; local1212++) {
				local1214 = arg1[local1212];
				if (this.anIntArrayArray45.length > local1214) {
					local1346 = this.anIntArrayArray45[local1214];
					for (local1348 = 0; local1348 < local1346.length; local1348++) {
						local1352 = local1346[local1348];
						if (this.aShortArray98 == null || (arg6 & this.aShortArray98[local1352]) != 0) {
							local1356 = local2133[2] * this.anIntArray535[local1352] + local2133[1] * this.anIntArray532[local1352] + this.anIntArray533[local1352] * local2133[0] + 8192 >> 14;
							local1358 = this.anIntArray535[local1352] * local2133[5] + this.anIntArray532[local1352] * local2133[4] + this.anIntArray533[local1352] * local2133[3] + 8192 >> 14;
							@Pc(2376) int local2376 = local1358 + local1204;
							local1486 = this.anIntArray535[local1352] * local2133[8] + this.anIntArray532[local1352] * local2133[7] + this.anIntArray533[local1352] * local2133[6] + 8192 >> 14;
							@Pc(2411) int local2411 = local1356 + local2139;
							this.anIntArray533[local1352] = local2411;
							@Pc(2420) int local2420 = local1486 + local1208;
							this.anIntArray532[local1352] = local2376;
							this.anIntArray535[local1352] = local2420;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qd", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt7312; local15++) {
			local33 = this.anIntArray533[local15] * local13 + this.anIntArray535[local15] * local9 >> 14;
			this.anIntArray535[local15] = this.anIntArray535[local15] * local13 - this.anIntArray533[local15] * local9 >> 14;
			this.anIntArray533[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt7318; local33++) {
			@Pc(84) int local84 = this.aShortArray93[local33] * local9 + this.aShortArray102[local33] * local13 >> 14;
			this.aShortArray93[local33] = (short) (local13 * this.aShortArray93[local33] - this.aShortArray102[local33] * local9 >> 14);
			this.aShortArray102[local33] = (short) local84;
		}
		this.method6220();
		this.method6221();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean549) {
			this.method6227();
		}
		return this.anInt7305;
	}

	@OriginalMember(owner = "client!qd", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Canvas_Sub1.anIntArray497[arg0];
		@Pc(13) int local13 = Canvas_Sub1.anIntArray498[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt7312; local15++) {
			@Pc(33) int local33 = this.anIntArray532[local15] * local9 + local13 * this.anIntArray533[local15] >> 14;
			this.anIntArray532[local15] = local13 * this.anIntArray532[local15] - this.anIntArray533[local15] * local9 >> 14;
			this.anIntArray533[local15] = local33;
		}
		this.method6220();
		this.aBoolean549 = false;
	}

	@OriginalMember(owner = "client!qd", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort101 = (short) arg0;
		this.method6220();
		this.method6221();
	}
}
