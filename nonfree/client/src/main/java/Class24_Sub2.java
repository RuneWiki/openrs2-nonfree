import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class24_Sub2 extends Class24 {

	@OriginalMember(owner = "client!ic", name = "E", descriptor = "Lclient!wn;")
	private Class378 aClass378_1;

	@OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
	private int anInt4501;

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "Z")
	private boolean aBoolean319;

	@OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
	private int anInt4517;

	@OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
	private int anInt4520;

	@OriginalMember(owner = "client!ic", name = "ob", descriptor = "Z")
	private boolean aBoolean321;

	@OriginalMember(owner = "client!ic", name = "vb", descriptor = "Lclient!wu;")
	private final Class100_Sub1 aClass100_Sub1_11;

	@OriginalMember(owner = "client!ic", name = "wb", descriptor = "I")
	private int anInt4525;

	@OriginalMember(owner = "client!ic", name = "xb", descriptor = "Lclient!mg;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "client!ic", name = "zb", descriptor = "I")
	private int anInt4527;

	@OriginalMember(owner = "client!ic", name = "Ib", descriptor = "I")
	private int anInt4532;

	@OriginalMember(owner = "client!ic", name = "Kb", descriptor = "I")
	private int anInt4533;

	@OriginalMember(owner = "client!ic", name = "Lb", descriptor = "Lclient!hh;")
	private Class132 aClass132_1;

	@OriginalMember(owner = "client!ic", name = "Wb", descriptor = "Lclient!hh;")
	private Class132 aClass132_2;

	@OriginalMember(owner = "client!ic", name = "bc", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!ic", name = "gc", descriptor = "I")
	private int anInt4545;

	@OriginalMember(owner = "client!ic", name = "hc", descriptor = "Lclient!hh;")
	private Class132 aClass132_3;

	@OriginalMember(owner = "client!ic", name = "nc", descriptor = "I")
	private int anInt4550;

	@OriginalMember(owner = "client!ic", name = "xc", descriptor = "I")
	private int anInt4556;

	@OriginalMember(owner = "client!ic", name = "Ic", descriptor = "Lclient!hh;")
	private Class132 aClass132_4;

	@OriginalMember(owner = "client!ic", name = "Kc", descriptor = "I")
	private int anInt4564;

	@OriginalMember(owner = "client!ic", name = "Jb", descriptor = "[I")
	private int[] anIntArray257;

	@OriginalMember(owner = "client!ic", name = "cc", descriptor = "I")
	private int anInt4543;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	private int anInt4488;

	@OriginalMember(owner = "client!ic", name = "Z", descriptor = "Z")
	private boolean aBoolean320;

	@OriginalMember(owner = "client!ic", name = "Mb", descriptor = "Z")
	private boolean aBoolean322;

	@OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
	private int anInt4496;

	@OriginalMember(owner = "client!ic", name = "D", descriptor = "[I")
	private int[] anIntArray255;

	@OriginalMember(owner = "client!ic", name = "Db", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!ic", name = "S", descriptor = "[I")
	private int[] anIntArray256;

	@OriginalMember(owner = "client!ic", name = "Ac", descriptor = "[I")
	private int[] anIntArray259;

	@OriginalMember(owner = "client!ic", name = "Fb", descriptor = "I")
	private int anInt4531;

	@OriginalMember(owner = "client!ic", name = "sb", descriptor = "[Lclient!ol;")
	private Class243[] aClass243Array4;

	@OriginalMember(owner = "client!ic", name = "qc", descriptor = "[Lclient!wr;")
	private Class382[] aClass382Array4;

	@OriginalMember(owner = "client!ic", name = "Zb", descriptor = "I")
	private int anInt4542;

	@OriginalMember(owner = "client!ic", name = "Ab", descriptor = "[Lclient!rt;")
	private Class299[] aClass299Array1;

	@OriginalMember(owner = "client!ic", name = "eb", descriptor = "[Lclient!lba;")
	private Class181[] aClass181Array1;

	@OriginalMember(owner = "client!ic", name = "mc", descriptor = "[F")
	private float[] aFloatArray42;

	@OriginalMember(owner = "client!ic", name = "pb", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!ic", name = "Gb", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!ic", name = "ub", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!ic", name = "Jc", descriptor = "[F")
	private float[] aFloatArray43;

	@OriginalMember(owner = "client!ic", name = "X", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!ic", name = "dc", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!ic", name = "hb", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!ic", name = "uc", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!ic", name = "Tb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!ic", name = "ac", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!ic", name = "w", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!ic", name = "ec", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!ic", name = "Vb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!ic", name = "mb", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!ic", name = "Hb", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!ic", name = "qb", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!ic", name = "Hc", descriptor = "[I")
	private int[] anIntArray260;

	@OriginalMember(owner = "client!ic", name = "rc", descriptor = "[I")
	private int[] anIntArray258;

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "[I")
	private int[] anIntArray254;

	@OriginalMember(owner = "client!ic", name = "Ec", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!ic", name = "wc", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!wu;Lclient!dh;IIII)V")
	public Class24_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class64 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_12;
		@Pc(15) int[] local15 = new int[arg1.anInt2002];
		this.anIntArray257 = new int[arg1.anInt1989 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt2002; local24++) {
			if (arg1.aByteArray32 == null || arg1.aByteArray32[local24] != 2) {
				if (arg1.aShortArray42 != null && arg1.aShortArray42[local24] != -1) {
					@Pc(55) Class325 local55 = local11.method895(arg1.aShortArray42[local24] & 0xFFFF);
					if (((this.anInt4545 & 0x40) == 0 || !local55.aBoolean636) && local55.aBoolean638) {
						continue;
					}
				}
				local15[this.anInt4543++] = local24;
				this.anIntArray257[arg1.aShortArray38[local24]]++;
				this.anIntArray257[arg1.aShortArray37[local24]]++;
				this.anIntArray257[arg1.aShortArray39[local24]]++;
			}
		}
		this.anInt4488 = this.anInt4543;
		@Pc(131) long[] local131 = new long[this.anInt4543];
		@Pc(140) boolean local140 = (this.anInt4564 & 0x100) != 0;
		@Pc(152) int local152;
		@Pc(165) int local165;
		@Pc(339) int local339;
		for (@Pc(142) int local142 = 0; local142 < this.anInt4543; local142++) {
			@Pc(148) int local148 = local15[local142];
			@Pc(150) Class325 local150 = null;
			local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			@Pc(158) byte local158 = 0;
			if (arg1.aClass5Array1 != null) {
				@Pc(163) boolean local163 = false;
				for (local165 = 0; local165 < arg1.aClass5Array1.length; local165++) {
					@Pc(172) Class5 local172 = arg1.aClass5Array1[local165];
					if (local148 == local172.anInt67) {
						@Pc(185) Class148 local185 = Static250.method4484(local172.anInt66);
						if (local185.aBoolean333) {
							local163 = true;
						}
						if (local185.anInt4702 != -1) {
							@Pc(201) Class325 local201 = local11.method895(local185.anInt4702);
							if (local201.anInt9371 == 2) {
								this.aBoolean320 = true;
							}
						}
					}
				}
				if (local163) {
					local131[local142] = Long.MAX_VALUE;
					this.anInt4488--;
					continue;
				}
			}
			@Pc(234) short local234 = -1;
			if (arg1.aShortArray42 != null) {
				local234 = arg1.aShortArray42[local148];
				if (local234 != -1) {
					local150 = local11.method895(local234 & 0xFFFF);
					if ((this.anInt4545 & 0x40) != 0 && local150.aBoolean636) {
						local150 = null;
						local234 = -1;
					} else {
						local156 = local150.aByte115;
						local158 = local150.aByte112;
					}
				}
			}
			@Pc(295) boolean local295 = arg1.aByteArray29 != null && arg1.aByteArray29[local148] != 0 || local150 != null && local150.anInt9371 != 0;
			if ((local140 || local295) && arg1.aByteArray33 != null) {
				local152 += arg1.aByteArray33[local148] << 17;
			}
			if (local295) {
				local152 += 65536;
			}
			local152 += (local156 & 0xFF) << 8;
			local152 += local158 & 0xFF;
			local339 = local154 + ((local234 & 0xFFFF) << 16);
			@Pc(345) int local345 = local339 + (local142 & 0xFFFF);
			local131[local142] = ((long) local152 << 32) + ((long) local345);
			this.aBoolean322 |= local150 != null && (local150.aByte116 != 0 || local150.aByte111 != 0);
			this.aBoolean320 |= local295;
		}
		Static33.method602(local15, local131);
		this.anInt4496 = arg1.anInt1989;
		this.anIntArray255 = arg1.anIntArray132;
		this.aShortArray66 = arg1.aShortArray41;
		this.anIntArray256 = arg1.anIntArray130;
		this.anIntArray259 = arg1.anIntArray133;
		this.anInt4531 = arg1.anInt2001;
		this.aClass243Array4 = arg1.aClass243Array2;
		this.aClass382Array4 = arg1.aClass382Array2;
		@Pc(426) Class320[] local426 = new Class320[this.anInt4496];
		@Pc(446) int local446;
		@Pc(460) int local460;
		@Pc(498) int local498;
		if (arg1.aClass5Array1 != null) {
			this.anInt4542 = arg1.aClass5Array1.length;
			this.aClass299Array1 = new Class299[this.anInt4542];
			this.aClass181Array1 = new Class181[this.anInt4542];
			for (local446 = 0; local446 < this.anInt4542; local446++) {
				@Pc(453) Class5 local453 = arg1.aClass5Array1[local446];
				@Pc(458) Class148 local458 = Static250.method4484(local453.anInt66);
				local460 = -1;
				for (@Pc(462) int local462 = 0; local462 < this.anInt4543; local462++) {
					if (local15[local462] == local453.anInt67) {
						local460 = local462;
						break;
					}
				}
				if (local460 == -1) {
					throw new RuntimeException();
				}
				local498 = Static91.anIntArray99[arg1.aShortArray46[local453.anInt67] & 0xFFFF] & 0xFFFFFF;
				@Pc(516) int local516 = local498 | 255 - (arg1.aByteArray29 == null ? 0 : arg1.aByteArray29[local453.anInt67]) << 24;
				this.aClass299Array1[local446] = new Class299(local460, arg1.aShortArray38[local453.anInt67], arg1.aShortArray37[local453.anInt67], arg1.aShortArray39[local453.anInt67], local458.anInt4706, local458.anInt4705, local458.anInt4702, local458.anInt4700, local458.anInt4704, local458.aBoolean333, local458.aBoolean334, local453.anInt69);
				this.aClass181Array1[local446] = new Class181(local516);
			}
		}
		local446 = this.anInt4543 * 3;
		this.aFloatArray42 = new float[local446];
		this.aShort53 = (short) arg3;
		this.aShortArray67 = new short[this.anInt4543];
		this.aShortArray65 = new short[this.anInt4543];
		this.aFloatArray43 = new float[local446];
		this.aShortArray62 = new short[local446];
		this.aShortArray71 = new short[local446];
		Static135.aLongArray1 = new long[local446];
		if (arg1.aShortArray44 != null) {
			this.aShortArray63 = new short[this.anInt4543];
		}
		this.aShort54 = (short) arg4;
		this.aShortArray68 = new short[local446];
		this.aShortArray70 = new short[local446];
		this.aShortArray60 = new short[local446];
		this.aShortArray72 = new short[this.anInt4543];
		this.aShortArray69 = new short[local446];
		this.aShortArray64 = new short[this.anInt4543];
		this.aByteArray52 = new byte[this.anInt4543];
		this.aShortArray61 = new short[this.anInt4543];
		this.aByteArray51 = new byte[local446];
		local152 = 0;
		for (local339 = 0; local339 < arg1.anInt1989; local339++) {
			local460 = this.anIntArray257[local339];
			this.anIntArray257[local339] = local152;
			local152 += local460;
			local426[local339] = new Class320();
		}
		this.anIntArray257[arg1.anInt1989] = local152;
		@Pc(706) Class38 local706 = Static343.method5562(this.anInt4543, arg1, local15);
		@Pc(710) Class350[] local710 = new Class350[arg1.anInt2002];
		@Pc(751) int local751;
		@Pc(762) int local762;
		@Pc(772) int local772;
		@Pc(729) short local729;
		@Pc(740) int local740;
		for (local498 = 0; local498 < arg1.anInt2002; local498++) {
			@Pc(719) short local719 = arg1.aShortArray38[local498];
			@Pc(724) short local724 = arg1.aShortArray37[local498];
			local729 = arg1.aShortArray39[local498];
			local740 = this.anIntArray255[local724] - this.anIntArray255[local719];
			local751 = this.anIntArray259[local724] - this.anIntArray259[local719];
			local762 = this.anIntArray256[local724] - this.anIntArray256[local719];
			local772 = this.anIntArray255[local729] - this.anIntArray255[local719];
			@Pc(783) int local783 = this.anIntArray259[local729] - this.anIntArray259[local719];
			@Pc(794) int local794 = this.anIntArray256[local729] - this.anIntArray256[local719];
			@Pc(803) int local803 = local751 * local794 - local783 * local762;
			@Pc(812) int local812 = local772 * local762 - local740 * local794;
			@Pc(821) int local821;
			for (local821 = local783 * local740 - local772 * local751; local803 > 8192 || local812 > 8192 || local821 > 8192 || local803 < -8192 || local812 < -8192 || local821 < -8192; local821 >>= 0x1) {
				local812 >>= 0x1;
				local803 >>= 0x1;
			}
			@Pc(880) int local880 = (int) Math.sqrt((double) (local821 * local821 + local812 * local812 + local803 * local803));
			if (local880 <= 0) {
				local880 = 1;
			}
			local812 = local812 * 256 / local880;
			local803 = local803 * 256 / local880;
			local821 = local821 * 256 / local880;
			@Pc(915) byte local915 = arg1.aByteArray32 == null ? 0 : arg1.aByteArray32[local498];
			if (local915 == 0) {
				@Pc(946) Class320 local946 = local426[local719];
				local946.anInt9349++;
				local946.anInt9348 += local803;
				local946.anInt9344 += local812;
				local946.anInt9346 += local821;
				@Pc(974) Class320 local974 = local426[local724];
				local974.anInt9346 += local821;
				local974.anInt9344 += local812;
				local974.anInt9348 += local803;
				local974.anInt9349++;
				@Pc(1002) Class320 local1002 = local426[local729];
				local1002.anInt9344 += local812;
				local1002.anInt9346 += local821;
				local1002.anInt9349++;
				local1002.anInt9348 += local803;
			} else if (local915 == 1) {
				@Pc(931) Class350 local931 = local710[local498] = new Class350();
				local931.anInt9873 = local803;
				local931.anInt9871 = local821;
				local931.anInt9872 = local812;
			}
		}
		@Pc(1039) int local1039;
		@Pc(1082) short local1082;
		for (local165 = 0; local165 < this.anInt4543; local165++) {
			local1039 = local15[local165];
			@Pc(1046) int local1046 = arg1.aShortArray46[local1039] & 0xFFFF;
			if (arg1.aByteArray34 == null) {
				local740 = -1;
			} else {
				local740 = arg1.aByteArray34[local1039];
			}
			if (arg1.aByteArray29 == null) {
				local751 = 0;
			} else {
				local751 = arg1.aByteArray29[local1039] & 0xFF;
			}
			local1082 = arg1.aShortArray42 == null ? -1 : arg1.aShortArray42[local1039];
			if (local1082 != -1 && (this.anInt4545 & 0x40) != 0) {
				@Pc(1100) Class325 local1100 = local11.method895(local1082 & 0xFFFF);
				if (local1100.aBoolean636) {
					local1082 = -1;
				}
			}
			@Pc(1107) float local1107 = 0.0F;
			@Pc(1109) float local1109 = 0.0F;
			@Pc(1111) float local1111 = 0.0F;
			@Pc(1113) float local1113 = 0.0F;
			@Pc(1115) float local1115 = 0.0F;
			@Pc(1117) float local1117 = 0.0F;
			@Pc(1119) byte local1119 = 0;
			@Pc(1121) byte local1121 = 0;
			@Pc(1123) int local1123 = 0;
			@Pc(1158) byte local1158;
			@Pc(1178) short local1178;
			@Pc(1183) short local1183;
			@Pc(1188) short local1188;
			if (local1082 != -1) {
				if (local740 == -1) {
					local1115 = 0.0F;
					local1113 = 1.0F;
					local1121 = 2;
					local1119 = 1;
					local1117 = 0.0F;
					local1107 = 0.0F;
					local1109 = 1.0F;
					local1111 = 1.0F;
				} else {
					local740 &= 0xFF;
					local1158 = arg1.aByteArray31[local740];
					@Pc(1168) short local1168;
					@Pc(1173) short local1173;
					@Pc(1211) float local1211;
					@Pc(1219) float local1219;
					@Pc(1228) float local1228;
					@Pc(1312) float local1312;
					@Pc(1320) float local1320;
					@Pc(1329) float local1329;
					@Pc(1337) float local1337;
					@Pc(1345) float local1345;
					@Pc(1353) float local1353;
					if (local1158 == 0) {
						local1168 = arg1.aShortArray38[local1039];
						local1173 = arg1.aShortArray37[local1039];
						local1178 = arg1.aShortArray39[local1039];
						local1183 = arg1.aShortArray40[local740];
						local1188 = arg1.aShortArray45[local740];
						@Pc(1193) short local1193 = arg1.aShortArray43[local740];
						@Pc(1199) float local1199 = (float) arg1.anIntArray132[local1183];
						@Pc(1205) float local1205 = (float) arg1.anIntArray133[local1183];
						local1211 = (float) arg1.anIntArray130[local1183];
						local1219 = (float) arg1.anIntArray132[local1188] - local1199;
						local1228 = (float) arg1.anIntArray133[local1188] - local1205;
						@Pc(1237) float local1237 = (float) arg1.anIntArray130[local1188] - local1211;
						@Pc(1245) float local1245 = (float) arg1.anIntArray132[local1193] - local1199;
						@Pc(1253) float local1253 = (float) arg1.anIntArray133[local1193] - local1205;
						@Pc(1261) float local1261 = (float) arg1.anIntArray130[local1193] - local1211;
						@Pc(1270) float local1270 = (float) arg1.anIntArray132[local1168] - local1199;
						@Pc(1278) float local1278 = (float) arg1.anIntArray133[local1168] - local1205;
						@Pc(1286) float local1286 = (float) arg1.anIntArray130[local1168] - local1211;
						@Pc(1295) float local1295 = (float) arg1.anIntArray132[local1173] - local1199;
						@Pc(1303) float local1303 = (float) arg1.anIntArray133[local1173] - local1205;
						local1312 = (float) arg1.anIntArray130[local1173] - local1211;
						local1320 = (float) arg1.anIntArray132[local1178] - local1199;
						local1329 = (float) arg1.anIntArray133[local1178] - local1205;
						local1337 = (float) arg1.anIntArray130[local1178] - local1211;
						local1345 = local1228 * local1261 - local1237 * local1253;
						local1353 = local1237 * local1245 - local1219 * local1261;
						@Pc(1362) float local1362 = local1219 * local1253 - local1245 * local1228;
						@Pc(1371) float local1371 = local1362 * local1253 - local1353 * local1261;
						@Pc(1380) float local1380 = local1345 * local1261 - local1362 * local1245;
						@Pc(1389) float local1389 = local1245 * local1353 - local1345 * local1253;
						@Pc(1403) float local1403 = 1.0F / (local1389 * local1237 + local1380 * local1228 + local1219 * local1371);
						local1111 = (local1371 * local1295 + local1380 * local1303 + local1389 * local1312) * local1403;
						local1107 = local1403 * (local1371 * local1270 + local1380 * local1278 + local1286 * local1389);
						local1115 = (local1389 * local1337 + local1371 * local1320 + local1380 * local1329) * local1403;
						@Pc(1454) float local1454 = local1228 * local1362 - local1353 * local1237;
						@Pc(1463) float local1463 = local1219 * local1353 - local1228 * local1345;
						@Pc(1471) float local1471 = local1237 * local1345 - local1362 * local1219;
						@Pc(1485) float local1485 = 1.0F / (local1463 * local1261 + local1253 * local1471 + local1454 * local1245);
						local1117 = (local1320 * local1454 + local1329 * local1471 + local1337 * local1463) * local1485;
						local1113 = (local1312 * local1463 + local1471 * local1303 + local1454 * local1295) * local1485;
						local1109 = (local1286 * local1463 + local1278 * local1471 + local1454 * local1270) * local1485;
					} else {
						local1168 = arg1.aShortArray38[local1039];
						local1173 = arg1.aShortArray37[local1039];
						local1178 = arg1.aShortArray39[local1039];
						@Pc(1549) int local1549 = local706.anIntArray62[local740];
						@Pc(1554) int local1554 = local706.anIntArray60[local740];
						@Pc(1559) int local1559 = local706.anIntArray61[local740];
						@Pc(1564) float[] local1564 = local706.aFloatArrayArray1[local740];
						@Pc(1569) byte local1569 = arg1.aByteArray35[local740];
						local1211 = (float) arg1.anIntArray140[local740] / 256.0F;
						if (local1158 == 1) {
							local1219 = (float) arg1.anIntArray138[local740] / 1024.0F;
							Static349.method5627(arg1.anIntArray133[local1168], local1554, local1569, local1219, local1564, Static198.aFloatArray40, local1559, arg1.anIntArray130[local1168], arg1.anIntArray132[local1168], local1549, local1211);
							local1109 = Static198.aFloatArray40[1];
							local1107 = Static198.aFloatArray40[0];
							Static349.method5627(arg1.anIntArray133[local1173], local1554, local1569, local1219, local1564, Static198.aFloatArray40, local1559, arg1.anIntArray130[local1173], arg1.anIntArray132[local1173], local1549, local1211);
							local1113 = Static198.aFloatArray40[1];
							local1111 = Static198.aFloatArray40[0];
							Static349.method5627(arg1.anIntArray133[local1178], local1554, local1569, local1219, local1564, Static198.aFloatArray40, local1559, arg1.anIntArray130[local1178], arg1.anIntArray132[local1178], local1549, local1211);
							local1115 = Static198.aFloatArray40[0];
							local1117 = Static198.aFloatArray40[1];
							local1228 = local1219 / 2.0F;
							if ((local1569 & 0x1) == 0) {
								if (local1228 < local1115 - local1107) {
									local1121 = 1;
									local1115 -= local1219;
								} else if (local1228 < local1107 - local1115) {
									local1121 = 2;
									local1115 += local1219;
								}
								if (local1228 < local1111 - local1107) {
									local1119 = 1;
									local1111 -= local1219;
								} else if (local1228 < local1107 - local1111) {
									local1111 += local1219;
									local1119 = 2;
								}
							} else {
								if (local1228 < local1117 - local1109) {
									local1121 = 1;
									local1117 -= local1219;
								} else if (local1109 - local1117 > local1228) {
									local1121 = 2;
									local1117 += local1219;
								}
								if (local1228 < local1113 - local1109) {
									local1113 -= local1219;
									local1119 = 1;
								} else if (local1228 < local1109 - local1113) {
									local1113 += local1219;
									local1119 = 2;
								}
							}
						} else if (local1158 == 2) {
							local1219 = (float) arg1.anIntArray139[local740] / 256.0F;
							local1228 = (float) arg1.anIntArray135[local740] / 256.0F;
							@Pc(2036) int local2036 = arg1.anIntArray132[local1173] - arg1.anIntArray132[local1168];
							@Pc(2047) int local2047 = arg1.anIntArray133[local1173] - arg1.anIntArray133[local1168];
							@Pc(2058) int local2058 = arg1.anIntArray130[local1173] - arg1.anIntArray130[local1168];
							@Pc(2069) int local2069 = arg1.anIntArray132[local1178] - arg1.anIntArray132[local1168];
							@Pc(2080) int local2080 = arg1.anIntArray133[local1178] - arg1.anIntArray133[local1168];
							@Pc(2091) int local2091 = arg1.anIntArray130[local1178] - arg1.anIntArray130[local1168];
							@Pc(2100) int local2100 = local2091 * local2047 - local2080 * local2058;
							@Pc(2109) int local2109 = local2069 * local2058 - local2036 * local2091;
							@Pc(2118) int local2118 = local2080 * local2036 - local2047 * local2069;
							local1312 = 64.0F / (float) arg1.anIntArray131[local740];
							local1320 = 64.0F / (float) arg1.anIntArray134[local740];
							local1329 = 64.0F / (float) arg1.anIntArray138[local740];
							local1337 = ((float) local2109 * local1564[1] + (float) local2100 * local1564[0] + local1564[2] * (float) local2118) / local1312;
							local1345 = ((float) local2118 * local1564[5] + local1564[3] * (float) local2100 + (float) local2109 * local1564[4]) / local1320;
							local1353 = ((float) local2118 * local1564[8] + (float) local2109 * local1564[7] + (float) local2100 * local1564[6]) / local1329;
							local1123 = Static332.method7833(local1337, local1345, local1353);
							Static7.method142(Static198.aFloatArray40, arg1.anIntArray133[local1168], local1549, local1554, local1559, arg1.anIntArray132[local1168], local1123, local1228, arg1.anIntArray130[local1168], local1211, local1564, local1219, local1569);
							local1107 = Static198.aFloatArray40[0];
							local1109 = Static198.aFloatArray40[1];
							Static7.method142(Static198.aFloatArray40, arg1.anIntArray133[local1173], local1549, local1554, local1559, arg1.anIntArray132[local1173], local1123, local1228, arg1.anIntArray130[local1173], local1211, local1564, local1219, local1569);
							local1111 = Static198.aFloatArray40[0];
							local1113 = Static198.aFloatArray40[1];
							Static7.method142(Static198.aFloatArray40, arg1.anIntArray133[local1178], local1549, local1554, local1559, arg1.anIntArray132[local1178], local1123, local1228, arg1.anIntArray130[local1178], local1211, local1564, local1219, local1569);
							local1117 = Static198.aFloatArray40[1];
							local1115 = Static198.aFloatArray40[0];
						} else if (local1158 == 3) {
							Static278.method4871(local1559, local1569, arg1.anIntArray130[local1168], arg1.anIntArray132[local1168], arg1.anIntArray133[local1168], local1554, local1564, Static198.aFloatArray40, local1211, local1549);
							local1109 = Static198.aFloatArray40[1];
							local1107 = Static198.aFloatArray40[0];
							Static278.method4871(local1559, local1569, arg1.anIntArray130[local1173], arg1.anIntArray132[local1173], arg1.anIntArray133[local1173], local1554, local1564, Static198.aFloatArray40, local1211, local1549);
							local1111 = Static198.aFloatArray40[0];
							local1113 = Static198.aFloatArray40[1];
							Static278.method4871(local1559, local1569, arg1.anIntArray130[local1178], arg1.anIntArray132[local1178], arg1.anIntArray133[local1178], local1554, local1564, Static198.aFloatArray40, local1211, local1549);
							local1117 = Static198.aFloatArray40[1];
							local1115 = Static198.aFloatArray40[0];
							if ((local1569 & 0x1) == 0) {
								if (local1115 - local1107 > 0.5F) {
									local1115--;
									local1121 = 1;
								} else if (local1107 - local1115 > 0.5F) {
									local1121 = 2;
									local1115++;
								}
								if (local1111 - local1107 > 0.5F) {
									local1119 = 1;
									local1111--;
								} else if (local1107 - local1111 > 0.5F) {
									local1119 = 2;
									local1111++;
								}
							} else {
								if (local1113 - local1109 > 0.5F) {
									local1119 = 1;
									local1113--;
								} else if (local1109 - local1113 > 0.5F) {
									local1113++;
									local1119 = 2;
								}
								if (local1117 - local1109 > 0.5F) {
									local1117--;
									local1121 = 1;
								} else if (local1109 - local1117 > 0.5F) {
									local1121 = 2;
									local1117++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray32 == null) {
				local1158 = 0;
			} else {
				local1158 = arg1.aByteArray32[local1039];
			}
			if (local1158 == 0) {
				@Pc(2477) long local2477 = (long) (local740 << 2) + ((long) local751 + (long) (local1123 << 24) + (long) (local1046 << 8) << 32);
				local1178 = arg1.aShortArray38[local1039];
				local1183 = arg1.aShortArray37[local1039];
				local1188 = arg1.aShortArray39[local1039];
				@Pc(2496) Class320 local2496 = local426[local1178];
				this.aShortArray61[local165] = this.method3946(local1107, local2496.anInt9344, local2477, local1109, local1178, local2496.anInt9346, local2496.anInt9349, local165, local2496.anInt9348, arg1);
				@Pc(2521) Class320 local2521 = local426[local1183];
				this.aShortArray65[local165] = this.method3946(local1111, local2521.anInt9344, (long) local1119 + local2477, local1113, local1183, local2521.anInt9346, local2521.anInt9349, local165, local2521.anInt9348, arg1);
				@Pc(2549) Class320 local2549 = local426[local1188];
				this.aShortArray67[local165] = this.method3946(local1115, local2549.anInt9344, local2477 + (long) local1121, local1117, local1188, local2549.anInt9346, local2549.anInt9349, local165, local2549.anInt9348, arg1);
			} else if (local1158 == 1) {
				@Pc(2337) Class350 local2337 = local710[local1039];
				@Pc(2379) long local2379 = ((long) (local1046 << 8) + (long) (local1123 << 24) + (long) local751 << 32) + (long) ((local2337.anInt9871 + 256 << 22) + (local2337.anInt9872 + 256 << 12) + (local740 << 2) + (local2337.anInt9873 <= 0 ? 2048 : 1024));
				this.aShortArray61[local165] = this.method3946(local1107, local2337.anInt9872, local2379, local1109, arg1.aShortArray38[local1039], local2337.anInt9871, 0, local165, local2337.anInt9873, arg1);
				this.aShortArray65[local165] = this.method3946(local1111, local2337.anInt9872, (long) local1119 + local2379, local1113, arg1.aShortArray37[local1039], local2337.anInt9871, 0, local165, local2337.anInt9873, arg1);
				this.aShortArray67[local165] = this.method3946(local1115, local2337.anInt9872, local2379 + (long) local1121, local1117, arg1.aShortArray39[local1039], local2337.anInt9871, 0, local165, local2337.anInt9873, arg1);
			}
			if (arg1.aByteArray29 != null) {
				this.aByteArray52[local165] = arg1.aByteArray29[local1039];
			}
			if (arg1.aShortArray44 != null) {
				this.aShortArray63[local165] = arg1.aShortArray44[local1039];
			}
			this.aShortArray64[local165] = arg1.aShortArray46[local1039];
			this.aShortArray72[local165] = local1082;
		}
		if (this.anInt4488 > 0) {
			local1039 = 1;
			local729 = this.aShortArray72[0];
			for (local740 = 0; local740 < this.anInt4488; local740++) {
				@Pc(2632) short local2632 = this.aShortArray72[local740];
				if (local2632 != local729) {
					local1039++;
					local729 = local2632;
				}
			}
			this.anIntArray260 = new int[local1039];
			this.anIntArray258 = new int[local1039 + 1];
			this.anIntArray254 = new int[local1039];
			this.anIntArray258[0] = 0;
			local751 = this.anInt4520;
			local1082 = 0;
			local1039 = 0;
			local729 = this.aShortArray72[0];
			for (local772 = 0; local772 < this.anInt4488; local772++) {
				@Pc(2687) short local2687 = this.aShortArray72[local772];
				if (local729 != local2687) {
					this.anIntArray260[local1039] = local751;
					this.anIntArray254[local1039] = local1082 + 1 - local751;
					local1039++;
					this.anIntArray258[local1039] = local772;
					local751 = this.anInt4520;
					local729 = local2687;
					local1082 = 0;
				}
				@Pc(2726) short local2726 = this.aShortArray61[local772];
				if (local1082 < local2726) {
					local1082 = local2726;
				}
				if (local2726 < local751) {
					local751 = local2726;
				}
				local2726 = this.aShortArray65[local772];
				if (local1082 < local2726) {
					local1082 = local2726;
				}
				if (local2726 < local751) {
					local751 = local2726;
				}
				local2726 = this.aShortArray67[local772];
				if (local2726 < local751) {
					local751 = local2726;
				}
				if (local1082 < local2726) {
					local1082 = local2726;
				}
			}
			this.anIntArray260[local1039] = local751;
			this.anIntArray254[local1039] = local1082 + 1 - local751;
			local1039++;
			this.anIntArray258[local1039] = this.anInt4488;
		}
		Static135.aLongArray1 = null;
		this.aShortArray70 = Static94.method1531(this.aShortArray70, this.anInt4520);
		this.aShortArray71 = Static94.method1531(this.aShortArray71, this.anInt4520);
		this.aShortArray62 = Static94.method1531(this.aShortArray62, this.anInt4520);
		this.aShortArray69 = Static94.method1531(this.aShortArray69, this.anInt4520);
		this.aShortArray68 = Static94.method1531(this.aShortArray68, this.anInt4520);
		this.aByteArray51 = Static308.method5206(this.anInt4520, this.aByteArray51);
		this.aFloatArray42 = Static1.method7118(this.anInt4520, this.aFloatArray42);
		this.aFloatArray43 = Static1.method7118(this.anInt4520, this.aFloatArray43);
		if (arg1.anIntArray137 != null && Static399.method6443(arg2, this.anInt4545)) {
			this.anIntArrayArray17 = arg1.method1646(false);
		}
		if (arg1.aClass5Array1 != null && Static571.method8296(this.anInt4545, arg2)) {
			this.anIntArrayArray15 = arg1.method1651();
		}
		if (arg1.anIntArray136 != null && Static366.method5795(arg2, this.anInt4545)) {
			local1039 = 0;
			@Pc(2918) int[] local2918 = new int[256];
			for (local740 = 0; local740 < this.anInt4543; local740++) {
				local751 = arg1.anIntArray136[local15[local740]];
				if (local751 >= 0) {
					@Pc(2935) int local2935 = local2918[local751]++;
					if (local751 > local1039) {
						local1039 = local751;
					}
				}
			}
			this.anIntArrayArray16 = new int[local1039 + 1][];
			for (local751 = 0; local751 <= local1039; local751++) {
				this.anIntArrayArray16[local751] = new int[local2918[local751]];
				local2918[local751] = 0;
			}
			for (local762 = 0; local762 < this.anInt4543; local762++) {
				local772 = arg1.anIntArray136[local15[local762]];
				if (local772 >= 0) {
					this.anIntArrayArray16[local772][local2918[local772]++] = local762;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!wu;IIZZ)V")
	public Class24_Sub2(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4496 = 0;
		this.aBoolean319 = false;
		this.aBoolean320 = false;
		this.anInt4488 = 0;
		this.aBoolean322 = false;
		this.aBoolean321 = false;
		this.anInt4531 = 0;
		this.anInt4520 = 0;
		this.anInt4543 = 0;
		this.aBoolean324 = true;
		this.anInt4545 = arg2;
		this.aClass100_Sub1_11 = arg0;
		this.anInt4564 = arg1;
		this.aBoolean319 = arg4;
		if (arg3 || Static161.method3024(this.anInt4564, this.anInt4545)) {
			this.aClass132_2 = new Class132(Static216.method3671(this.anInt4545, this.anInt4564));
		}
		if (arg3 || Static399.method6445(this.anInt4545, this.anInt4564)) {
			this.aClass132_1 = new Class132(Static494.method7392(this.anInt4545, this.anInt4564));
		}
		if (arg3 || Static289.method5032(this.anInt4564, this.anInt4545)) {
			this.aClass132_3 = new Class132(Static420.method6612(this.anInt4564, this.anInt4545));
		}
		if (arg3 || Static581.method6717(this.anInt4564, this.anInt4545)) {
			this.aClass132_4 = new Class132(Static482.method7212(this.anInt4545, this.anInt4564));
		}
		if (arg3 || Static582.method8191(this.anInt4545, this.anInt4564)) {
			this.aClass205_1 = new Class205(Static437.method6779(this.anInt4564, this.anInt4545));
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class24 method6850(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class24_Sub2 local14;
		@Pc(18) Class24_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass100_Sub1_11.aClass24_Sub2_23;
			local18 = this.aClass100_Sub1_11.aClass24_Sub2_22;
		} else if (arg0 == 2) {
			local14 = this.aClass100_Sub1_11.aClass24_Sub2_27;
			local18 = this.aClass100_Sub1_11.aClass24_Sub2_30;
		} else if (arg0 == 3) {
			local18 = this.aClass100_Sub1_11.aClass24_Sub2_24;
			local14 = this.aClass100_Sub1_11.aClass24_Sub2_29;
		} else if (arg0 == 4) {
			local18 = this.aClass100_Sub1_11.aClass24_Sub2_25;
			local14 = this.aClass100_Sub1_11.aClass24_Sub2_26;
		} else if (arg0 == 5) {
			local18 = this.aClass100_Sub1_11.aClass24_Sub2_28;
			local14 = this.aClass100_Sub1_11.aClass24_Sub2_21;
		} else {
			local14 = local18 = new Class24_Sub2(this.aClass100_Sub1_11, 0, 0, true, false);
		}
		return this.method3935(local18, arg1, arg0 != 0, local14, arg2);
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ql;)V")
	@Override
	public void method6861(@OriginalArg(0) Class154 arg0) {
		@Pc(8) Class154_Sub2 local8 = (Class154_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass382Array4 != null) {
			for (local13 = 0; local13 < this.aClass382Array4.length; local13++) {
				@Pc(20) Class382 local20 = this.aClass382Array4[local13];
				@Pc(22) Class382 local22 = local20;
				if (local20.aClass382_2 != null) {
					local22 = local20.aClass382_2;
				}
				local22.anInt10689 = (int) (local8.aFloat104 + (float) this.anIntArray256[local20.anInt10680] * local8.aFloat99 + local8.aFloat95 * (float) this.anIntArray259[local20.anInt10680] + local8.aFloat98 * (float) this.anIntArray255[local20.anInt10680]);
				local22.anInt10678 = (int) (local8.aFloat96 + local8.aFloat103 * (float) this.anIntArray256[local20.anInt10680] + local8.aFloat100 * (float) this.anIntArray259[local20.anInt10680] + (float) this.anIntArray255[local20.anInt10680] * local8.aFloat101);
				local22.anInt10687 = (int) (local8.aFloat102 * (float) this.anIntArray256[local20.anInt10680] + local8.aFloat105 * (float) this.anIntArray255[local20.anInt10680] + (float) this.anIntArray259[local20.anInt10680] * local8.aFloat97 + local8.aFloat94);
				local22.anInt10675 = (int) (local8.aFloat104 + (float) this.anIntArray255[local20.anInt10683] * local8.aFloat98 + (float) this.anIntArray259[local20.anInt10683] * local8.aFloat95 + local8.aFloat99 * (float) this.anIntArray256[local20.anInt10683]);
				local22.anInt10679 = (int) (local8.aFloat96 + (float) this.anIntArray256[local20.anInt10683] * local8.aFloat103 + local8.aFloat100 * (float) this.anIntArray259[local20.anInt10683] + (float) this.anIntArray255[local20.anInt10683] * local8.aFloat101);
				local22.anInt10681 = (int) (local8.aFloat94 + (float) this.anIntArray256[local20.anInt10683] * local8.aFloat102 + local8.aFloat97 * (float) this.anIntArray259[local20.anInt10683] + local8.aFloat105 * (float) this.anIntArray255[local20.anInt10683]);
				local22.anInt10685 = (int) (local8.aFloat98 * (float) this.anIntArray255[local20.anInt10673] + local8.aFloat95 * (float) this.anIntArray259[local20.anInt10673] + local8.aFloat99 * (float) this.anIntArray256[local20.anInt10673] + local8.aFloat104);
				local22.anInt10674 = (int) ((float) this.anIntArray256[local20.anInt10673] * local8.aFloat103 + local8.aFloat101 * (float) this.anIntArray255[local20.anInt10673] + local8.aFloat100 * (float) this.anIntArray259[local20.anInt10673] + local8.aFloat96);
				local22.anInt10676 = (int) (local8.aFloat94 + local8.aFloat102 * (float) this.anIntArray256[local20.anInt10673] + local8.aFloat105 * (float) this.anIntArray255[local20.anInt10673] + (float) this.anIntArray259[local20.anInt10673] * local8.aFloat97);
			}
		}
		if (this.aClass243Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass243Array4.length; local13++) {
			@Pc(365) Class243 local365 = this.aClass243Array4[local13];
			@Pc(367) Class243 local367 = local365;
			if (local365.aClass243_2 != null) {
				local367 = local365.aClass243_2;
			}
			if (local365.aClass154_7 == null) {
				local365.aClass154_7 = local8.method6574();
			} else {
				local365.aClass154_7.method6563(local8);
			}
			local367.anInt7533 = (int) (local8.aFloat104 + local8.aFloat95 * (float) this.anIntArray259[local365.anInt7539] + (float) this.anIntArray255[local365.anInt7539] * local8.aFloat98 + (float) this.anIntArray256[local365.anInt7539] * local8.aFloat99);
			local367.anInt7531 = (int) (local8.aFloat96 + (float) this.anIntArray256[local365.anInt7539] * local8.aFloat103 + local8.aFloat101 * (float) this.anIntArray255[local365.anInt7539] + local8.aFloat100 * (float) this.anIntArray259[local365.anInt7539]);
			local367.anInt7534 = (int) (local8.aFloat94 + (float) this.anIntArray256[local365.anInt7539] * local8.aFloat102 + (float) this.anIntArray259[local365.anInt7539] * local8.aFloat97 + (float) this.anIntArray255[local365.anInt7539] * local8.aFloat105);
		}
	}

	@OriginalMember(owner = "client!ic", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort54 = (short) arg0;
		this.method3945();
		this.method3941();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ql;IZ)V")
	@Override
	public void method6848(@OriginalArg(0) Class154 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray66 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4496; local14++) {
			if ((arg1 & this.aShortArray66[local14]) != 0) {
				if (arg2) {
					arg0.method6561(this.anIntArray255[local14], this.anIntArray259[local14], this.anIntArray256[local14], local12);
				} else {
					arg0.method6573(this.anIntArray255[local14], this.anIntArray259[local14], this.anIntArray256[local14], local12);
				}
				this.anIntArray255[local14] = local12[0];
				this.anIntArray259[local14] = local12[1];
				this.anIntArray256[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "()V")
	@Override
	protected void method6856() {
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "()[Lclient!ol;")
	@Override
	public Class243[] method6865() {
		return this.aClass243Array4;
	}

	@OriginalMember(owner = "client!ic", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort53 = (short) arg0;
		this.method3943();
	}

	@OriginalMember(owner = "client!ic", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4496; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray255[local15] + local9 * this.anIntArray259[local15] >> 14;
			this.anIntArray259[local15] = local13 * this.anIntArray259[local15] - local9 * this.anIntArray255[local15] >> 14;
			this.anIntArray255[local15] = local33;
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4496; local7++) {
			if (arg0 != 0) {
				this.anIntArray255[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray259[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray256[local7] += arg2;
			}
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass132_2 != null) {
			this.aClass132_2.aBoolean293 = Static216.method3671(this.anInt4545, arg0);
		}
		if (this.aClass132_1 != null) {
			this.aClass132_1.aBoolean293 = Static494.method7392(this.anInt4545, arg0);
		}
		if (this.aClass132_3 != null) {
			this.aClass132_3.aBoolean293 = Static420.method6612(arg0, this.anInt4545);
		}
		if (this.aClass132_4 != null) {
			this.aClass132_4.aBoolean293 = Static482.method7212(this.anInt4545, arg0);
		}
		this.anInt4564 = arg0;
		if (this.aClass378_1 != null && (this.anInt4564 & 0x10000) == 0) {
			this.aShortArray69 = this.aClass378_1.aShortArray150;
			this.aByteArray51 = this.aClass378_1.aByteArray125;
			this.aShortArray68 = this.aClass378_1.aShortArray151;
			this.aShortArray62 = this.aClass378_1.aShortArray152;
			this.aClass378_1 = null;
		}
		this.aBoolean324 = true;
		this.method3939();
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
	private void method3934() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt4496; local29++) {
			@Pc(36) int local36 = this.anIntArray255[local29];
			@Pc(41) int local41 = this.anIntArray259[local29];
			if (local41 < local9) {
				local9 = local41;
			}
			if (local15 < local41) {
				local15 = local41;
			}
			if (local7 > local36) {
				local7 = local36;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			@Pc(70) int local70 = this.anIntArray256[local29];
			if (local70 > local17) {
				local17 = local70;
			}
			if (local70 < local11) {
				local11 = local70;
			}
			@Pc(92) int local92 = local36 * local36 + local70 * local70;
			if (local19 < local92) {
				local19 = local92;
			}
			local92 = local36 * local36 + local70 * local70 + local41 * local41;
			if (local27 < local92) {
				local27 = local92;
			}
		}
		this.anInt4517 = local17;
		this.anInt4525 = local11;
		this.anInt4556 = local13;
		this.anInt4501 = local9;
		this.anInt4550 = local7;
		this.anInt4532 = local15;
		this.anInt4527 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt4533 = (int) (Math.sqrt((double) local27) + 0.99D);
		this.aBoolean321 = true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method6858(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			local24 = 0;
			Static334.anInt6351 = 0;
			Static86.anInt2081 = 0;
			Static557.anInt9471 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray17.length) {
					local48 = this.anIntArrayArray17[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static557.anInt9471 += this.anIntArray255[local56];
						Static334.anInt6351 += this.anIntArray259[local56];
						local24++;
						Static86.anInt2081 += this.anIntArray256[local56];
					}
				}
			}
			if (local24 <= 0) {
				Static334.anInt6351 = local22;
				Static86.anInt2081 = local18;
				Static557.anInt9471 = local14;
			} else {
				Static86.anInt2081 = local18 + Static86.anInt2081 / local24;
				Static557.anInt9471 = local14 + Static557.anInt9471 / local24;
				Static334.anInt6351 = local22 + Static334.anInt6351 / local24;
			}
			return;
		}
		@Pc(156) int[] local156;
		@Pc(158) int local158;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local22 = arg3 << 4;
			local18 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray17.length > local32) {
					local156 = this.anIntArrayArray17[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray255[local50] += local14;
						this.anIntArray259[local50] += local22;
						this.anIntArray256[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(282) int local282;
		@Pc(300) int local300;
		@Pc(757) int local757;
		@Pc(766) int local766;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray17.length) {
					local156 = this.anIntArrayArray17[local32];
					if ((arg5 & 0x1) == 0) {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray255[local50] -= Static557.anInt9471;
							this.anIntArray259[local50] -= Static334.anInt6351;
							this.anIntArray256[local50] -= Static86.anInt2081;
							if (arg4 != 0) {
								local56 = Class100_Sub1.anIntArray428[arg4];
								local282 = Class100_Sub1.anIntArray429[arg4];
								local300 = this.anIntArray255[local50] * local282 + local56 * this.anIntArray259[local50] + 16383 >> 14;
								this.anIntArray259[local50] = local282 * this.anIntArray259[local50] + 16383 - local56 * this.anIntArray255[local50] >> 14;
								this.anIntArray255[local50] = local300;
							}
							if (arg2 != 0) {
								local56 = Class100_Sub1.anIntArray428[arg2];
								local282 = Class100_Sub1.anIntArray429[arg2];
								local300 = local282 * this.anIntArray259[local50] + 16383 - local56 * this.anIntArray256[local50] >> 14;
								this.anIntArray256[local50] = this.anIntArray259[local50] * local56 + this.anIntArray256[local50] * local282 + 16383 >> 14;
								this.anIntArray259[local50] = local300;
							}
							if (arg3 != 0) {
								local56 = Class100_Sub1.anIntArray428[arg3];
								local282 = Class100_Sub1.anIntArray429[arg3];
								local300 = this.anIntArray255[local50] * local282 + local56 * this.anIntArray256[local50] + 16383 >> 14;
								this.anIntArray256[local50] = this.anIntArray256[local50] * local282 + 16383 - this.anIntArray255[local50] * local56 >> 14;
								this.anIntArray255[local50] = local300;
							}
							this.anIntArray255[local50] += Static557.anInt9471;
							this.anIntArray259[local50] += Static334.anInt6351;
							this.anIntArray256[local50] += Static86.anInt2081;
						}
					} else {
						for (local158 = 0; local158 < local156.length; local158++) {
							local50 = local156[local158];
							this.anIntArray255[local50] -= Static557.anInt9471;
							this.anIntArray259[local50] -= Static334.anInt6351;
							this.anIntArray256[local50] -= Static86.anInt2081;
							if (arg2 != 0) {
								local56 = Class100_Sub1.anIntArray428[arg2];
								local282 = Class100_Sub1.anIntArray429[arg2];
								local300 = this.anIntArray259[local50] * local282 + 16383 - local56 * this.anIntArray256[local50] >> 14;
								this.anIntArray256[local50] = local282 * this.anIntArray256[local50] + local56 * this.anIntArray259[local50] + 16383 >> 14;
								this.anIntArray259[local50] = local300;
							}
							if (arg4 != 0) {
								local56 = Class100_Sub1.anIntArray428[arg4];
								local282 = Class100_Sub1.anIntArray429[arg4];
								local300 = this.anIntArray255[local50] * local282 + this.anIntArray259[local50] * local56 + 16383 >> 14;
								this.anIntArray259[local50] = this.anIntArray259[local50] * local282 + 16383 - this.anIntArray255[local50] * local56 >> 14;
								this.anIntArray255[local50] = local300;
							}
							if (arg3 != 0) {
								local56 = Class100_Sub1.anIntArray428[arg3];
								local282 = Class100_Sub1.anIntArray429[arg3];
								local300 = this.anIntArray256[local50] * local56 + local282 * this.anIntArray255[local50] + 16383 >> 14;
								this.anIntArray256[local50] = local282 * this.anIntArray256[local50] + 16383 - local56 * this.anIntArray255[local50] >> 14;
								this.anIntArray255[local50] = local300;
							}
							this.anIntArray255[local50] += Static557.anInt9471;
							this.anIntArray259[local50] += Static334.anInt6351;
							this.anIntArray256[local50] += Static86.anInt2081;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray17.length) {
						local48 = this.anIntArrayArray17[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local282 = this.anIntArray257[local56];
							local300 = this.anIntArray257[local56 + 1];
							for (local757 = local282; local757 < local300; local757++) {
								local766 = this.aShortArray60[local757] - 1;
								if (local766 == -1) {
									break;
								}
								@Pc(778) int local778;
								@Pc(782) int local782;
								@Pc(800) int local800;
								if (arg4 != 0) {
									local778 = Class100_Sub1.anIntArray428[arg4];
									local782 = Class100_Sub1.anIntArray429[arg4];
									local800 = local782 * this.aShortArray62[local766] + this.aShortArray69[local766] * local778 + 16383 >> 14;
									this.aShortArray69[local766] = (short) (this.aShortArray69[local766] * local782 + 16383 - this.aShortArray62[local766] * local778 >> 14);
									this.aShortArray62[local766] = (short) local800;
								}
								if (arg2 != 0) {
									local778 = Class100_Sub1.anIntArray428[arg2];
									local782 = Class100_Sub1.anIntArray429[arg2];
									local800 = this.aShortArray69[local766] * local782 + 16383 - this.aShortArray68[local766] * local778 >> 14;
									this.aShortArray68[local766] = (short) (this.aShortArray68[local766] * local782 + this.aShortArray69[local766] * local778 + 16383 >> 14);
									this.aShortArray69[local766] = (short) local800;
								}
								if (arg3 != 0) {
									local778 = Class100_Sub1.anIntArray428[arg3];
									local782 = Class100_Sub1.anIntArray429[arg3];
									local800 = local782 * this.aShortArray62[local766] + local778 * this.aShortArray68[local766] + 16383 >> 14;
									this.aShortArray68[local766] = (short) (this.aShortArray68[local766] * local782 + 16383 - local778 * this.aShortArray62[local766] >> 14);
									this.aShortArray62[local766] = (short) local800;
								}
							}
						}
					}
				}
				this.method3941();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray17.length > local32) {
					local156 = this.anIntArrayArray17[local32];
					for (local158 = 0; local158 < local156.length; local158++) {
						local50 = local156[local158];
						this.anIntArray255[local50] -= Static557.anInt9471;
						this.anIntArray259[local50] -= Static334.anInt6351;
						this.anIntArray256[local50] -= Static86.anInt2081;
						this.anIntArray255[local50] = arg2 * this.anIntArray255[local50] >> 7;
						this.anIntArray259[local50] = arg3 * this.anIntArray259[local50] >> 7;
						this.anIntArray256[local50] = arg4 * this.anIntArray256[local50] >> 7;
						this.anIntArray255[local50] += Static557.anInt9471;
						this.anIntArray259[local50] += Static334.anInt6351;
						this.anIntArray256[local50] += Static86.anInt2081;
					}
				}
			}
		} else {
			@Pc(1218) Class181 local1218;
			@Pc(1113) boolean local1113;
			@Pc(1213) Class299 local1213;
			if (arg0 == 5) {
				if (this.anIntArrayArray16 != null) {
					local1113 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray16.length > local38) {
							local48 = this.anIntArrayArray16[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local282 = (this.aByteArray52[local56] & 0xFF) + (arg2 * 8);
								if (local282 < 0) {
									local282 = 0;
								} else if (local282 > 255) {
									local282 = 255;
								}
								this.aByteArray52[local56] = (byte) local282;
							}
							local1113 |= local48.length > 0;
						}
					}
					if (local1113) {
						if (this.aClass299Array1 != null) {
							for (local38 = 0; local38 < this.anInt4542; local38++) {
								local1213 = this.aClass299Array1[local38];
								local1218 = this.aClass181Array1[local38];
								local1218.anInt5909 = 255 - (this.aByteArray52[local1213.anInt8674] & 0xFF) << 24 | local1218.anInt5909 & 0xFFFFFF;
							}
						}
						this.method3943();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray16 != null) {
					local1113 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray16.length) {
							local48 = this.anIntArrayArray16[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local282 = this.aShortArray64[local56] & 0xFFFF;
								local300 = local282 >> 10 & 0x3F;
								local757 = local282 >> 7 & 0x7;
								local766 = local282 & 0x7F;
								@Pc(1317) int local1317 = local300 + arg2 & 0x3F;
								local757 += arg3 / 4;
								local766 += arg4;
								if (local757 < 0) {
									local757 = 0;
								} else if (local757 > 7) {
									local757 = 7;
								}
								if (local766 < 0) {
									local766 = 0;
								} else if (local766 > 127) {
									local766 = 127;
								}
								this.aShortArray64[local56] = (short) (local766 | local1317 << 10 | local757 << 7);
							}
							local1113 |= local48.length > 0;
						}
					}
					if (local1113) {
						if (this.aClass299Array1 != null) {
							for (local38 = 0; local38 < this.anInt4542; local38++) {
								local1213 = this.aClass299Array1[local38];
								local1218 = this.aClass181Array1[local38];
								local1218.anInt5909 = Static91.anIntArray99[this.aShortArray64[local1213.anInt8674] & 0xFFFF] & 0xFFFFFF | local1218.anInt5909 & 0xFF000000;
							}
						}
						this.method3943();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray15 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray15.length > local32) {
							local156 = this.anIntArrayArray15[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1218 = this.aClass181Array1[local156[local158]];
								local1218.anInt5908 += arg2;
								local1218.anInt5914 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray15 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray15.length) {
							local156 = this.anIntArrayArray15[local32];
							for (local158 = 0; local158 < local156.length; local158++) {
								local1218 = this.aClass181Array1[local156[local158]];
								local1218.anInt5907 = arg3 * local1218.anInt5907 >> 7;
								local1218.anInt5911 = arg2 * local1218.anInt5911 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray15 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray15.length) {
						local156 = this.anIntArrayArray15[local32];
						for (local158 = 0; local158 < local156.length; local158++) {
							local1218 = this.aClass181Array1[local156[local158]];
							local1218.anInt5913 = local1218.anInt5913 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ic;IZZLclient!ic;Z)Lclient!ka;")
	private Class24 method3935(@OriginalArg(0) Class24_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) Class24_Sub2 arg3, @OriginalArg(5) boolean arg4) {
		arg3.anInt4542 = this.anInt4542;
		arg3.anInt4531 = this.anInt4531;
		arg3.aShort53 = this.aShort53;
		arg3.anInt4564 = arg1;
		if ((arg1 & 0x100) == 0) {
			arg3.aBoolean320 = this.aBoolean320;
		} else {
			arg3.aBoolean320 = true;
		}
		arg3.aBoolean322 = this.aBoolean322;
		arg3.anInt4520 = this.anInt4520;
		arg3.anInt4488 = this.anInt4488;
		arg3.anInt4545 = this.anInt4545;
		arg3.aShort54 = this.aShort54;
		arg3.anInt4496 = this.anInt4496;
		arg3.anInt4543 = this.anInt4543;
		@Pc(67) boolean local67 = Static395.method6364(this.anInt4545, arg1);
		@Pc(73) boolean local73 = Static413.method6509(this.anInt4545, arg1);
		@Pc(79) boolean local79 = Static495.method7405(this.anInt4545, arg1);
		@Pc(85) boolean local85 = local67 | local73 | local79;
		@Pc(196) int local196;
		if (local85) {
			if (!local67) {
				arg3.anIntArray255 = this.anIntArray255;
			} else if (arg0.anIntArray255 == null || this.anInt4531 > arg0.anIntArray255.length) {
				arg3.anIntArray255 = arg0.anIntArray255 = new int[this.anInt4531];
			} else {
				arg3.anIntArray255 = arg0.anIntArray255;
			}
			if (!local73) {
				arg3.anIntArray259 = this.anIntArray259;
			} else if (arg0.anIntArray259 == null || this.anInt4531 > arg0.anIntArray259.length) {
				arg3.anIntArray259 = arg0.anIntArray259 = new int[this.anInt4531];
			} else {
				arg3.anIntArray259 = arg0.anIntArray259;
			}
			if (!local79) {
				arg3.anIntArray256 = this.anIntArray256;
			} else if (arg0.anIntArray256 == null || arg0.anIntArray256.length < this.anInt4531) {
				arg3.anIntArray256 = arg0.anIntArray256 = new int[this.anInt4531];
			} else {
				arg3.anIntArray256 = arg0.anIntArray256;
			}
			for (local196 = 0; local196 < this.anInt4531; local196++) {
				if (local67) {
					arg3.anIntArray255[local196] = this.anIntArray255[local196];
				}
				if (local73) {
					arg3.anIntArray259[local196] = this.anIntArray259[local196];
				}
				if (local79) {
					arg3.anIntArray256[local196] = this.anIntArray256[local196];
				}
			}
		} else {
			arg3.anIntArray256 = this.anIntArray256;
			arg3.anIntArray255 = this.anIntArray255;
			arg3.anIntArray259 = this.anIntArray259;
		}
		if (Static216.method3671(this.anInt4545, arg1)) {
			arg3.aClass132_2 = arg0.aClass132_2;
			arg3.aClass132_2.aBoolean294 = this.aClass132_2.aBoolean294;
			arg3.aClass132_2.anInterface17_10 = this.aClass132_2.anInterface17_10;
			arg3.aClass132_2.aBoolean293 = true;
		} else if (Static161.method3024(arg1, this.anInt4545)) {
			arg3.aClass132_2 = this.aClass132_2;
		} else {
			arg3.aClass132_2 = null;
		}
		if (Static605.method8489(this.anInt4545, arg1)) {
			if (arg0.aShortArray64 == null || this.anInt4543 > arg0.aShortArray64.length) {
				arg3.aShortArray64 = arg0.aShortArray64 = new short[this.anInt4543];
			} else {
				arg3.aShortArray64 = arg0.aShortArray64;
			}
			for (local196 = 0; local196 < this.anInt4543; local196++) {
				arg3.aShortArray64[local196] = this.aShortArray64[local196];
			}
		} else {
			arg3.aShortArray64 = this.aShortArray64;
		}
		if (Static239.method4149(arg1, this.anInt4545)) {
			if (arg0.aByteArray52 == null || this.anInt4543 > arg0.aByteArray52.length) {
				arg3.aByteArray52 = arg0.aByteArray52 = new byte[this.anInt4543];
			} else {
				arg3.aByteArray52 = arg0.aByteArray52;
			}
			for (local196 = 0; local196 < this.anInt4543; local196++) {
				arg3.aByteArray52[local196] = this.aByteArray52[local196];
			}
		} else {
			arg3.aByteArray52 = this.aByteArray52;
		}
		if (Static420.method6612(arg1, this.anInt4545)) {
			arg3.aClass132_3 = arg0.aClass132_3;
			arg3.aClass132_3.aBoolean293 = true;
			arg3.aClass132_3.anInterface17_10 = this.aClass132_3.anInterface17_10;
			arg3.aClass132_3.aBoolean294 = this.aClass132_3.aBoolean294;
		} else if (Static289.method5032(arg1, this.anInt4545)) {
			arg3.aClass132_3 = this.aClass132_3;
		} else {
			arg3.aClass132_3 = null;
		}
		@Pc(547) int local547;
		if (Static494.method7399(this.anInt4545, arg1)) {
			if (arg0.aShortArray62 == null || this.anInt4520 > arg0.aShortArray62.length) {
				local196 = this.anInt4520;
				arg3.aShortArray68 = arg0.aShortArray68 = new short[local196];
				arg3.aShortArray62 = arg0.aShortArray62 = new short[local196];
				arg3.aShortArray69 = arg0.aShortArray69 = new short[local196];
			} else {
				arg3.aShortArray62 = arg0.aShortArray62;
				arg3.aShortArray69 = arg0.aShortArray69;
				arg3.aShortArray68 = arg0.aShortArray68;
			}
			if (this.aClass378_1 == null) {
				arg3.aClass378_1 = null;
				for (local196 = 0; local196 < this.anInt4520; local196++) {
					arg3.aShortArray62[local196] = this.aShortArray62[local196];
					arg3.aShortArray69[local196] = this.aShortArray69[local196];
					arg3.aShortArray68[local196] = this.aShortArray68[local196];
				}
			} else {
				if (arg0.aClass378_1 == null) {
					arg0.aClass378_1 = new Class378();
				}
				@Pc(535) Class378 local535 = arg3.aClass378_1 = arg0.aClass378_1;
				if (local535.aShortArray152 == null || this.anInt4520 > local535.aShortArray152.length) {
					local547 = this.anInt4520;
					local535.aByteArray125 = new byte[local547];
					local535.aShortArray151 = new short[local547];
					local535.aShortArray152 = new short[local547];
					local535.aShortArray150 = new short[local547];
				}
				for (local547 = 0; local547 < this.anInt4520; local547++) {
					arg3.aShortArray62[local547] = this.aShortArray62[local547];
					arg3.aShortArray69[local547] = this.aShortArray69[local547];
					arg3.aShortArray68[local547] = this.aShortArray68[local547];
					local535.aShortArray152[local547] = this.aClass378_1.aShortArray152[local547];
					local535.aShortArray150[local547] = this.aClass378_1.aShortArray150[local547];
					local535.aShortArray151[local547] = this.aClass378_1.aShortArray151[local547];
					local535.aByteArray125[local547] = this.aClass378_1.aByteArray125[local547];
				}
			}
			arg3.aByteArray51 = this.aByteArray51;
		} else {
			arg3.aShortArray69 = this.aShortArray69;
			arg3.aClass378_1 = this.aClass378_1;
			arg3.aByteArray51 = this.aByteArray51;
			arg3.aShortArray62 = this.aShortArray62;
			arg3.aShortArray68 = this.aShortArray68;
		}
		if (Static482.method7212(this.anInt4545, arg1)) {
			arg3.aClass132_4 = arg0.aClass132_4;
			arg3.aClass132_4.aBoolean294 = this.aClass132_4.aBoolean294;
			arg3.aClass132_4.anInterface17_10 = this.aClass132_4.anInterface17_10;
			arg3.aClass132_4.aBoolean293 = true;
		} else if (Static581.method6717(arg1, this.anInt4545)) {
			arg3.aClass132_4 = this.aClass132_4;
		} else {
			arg3.aClass132_4 = null;
		}
		if (Static262.method4656(arg1, this.anInt4545)) {
			if (arg0.aFloatArray42 == null || this.anInt4543 > arg0.aFloatArray42.length) {
				local196 = this.anInt4520;
				arg3.aFloatArray43 = arg0.aFloatArray43 = new float[local196];
				arg3.aFloatArray42 = arg0.aFloatArray42 = new float[local196];
			} else {
				arg3.aFloatArray43 = arg0.aFloatArray43;
				arg3.aFloatArray42 = arg0.aFloatArray42;
			}
			for (local196 = 0; local196 < this.anInt4520; local196++) {
				arg3.aFloatArray42[local196] = this.aFloatArray42[local196];
				arg3.aFloatArray43[local196] = this.aFloatArray43[local196];
			}
		} else {
			arg3.aFloatArray43 = this.aFloatArray43;
			arg3.aFloatArray42 = this.aFloatArray42;
		}
		if (Static494.method7392(this.anInt4545, arg1)) {
			arg3.aClass132_1 = arg0.aClass132_1;
			arg3.aClass132_1.aBoolean294 = this.aClass132_1.aBoolean294;
			arg3.aClass132_1.anInterface17_10 = this.aClass132_1.anInterface17_10;
			arg3.aClass132_1.aBoolean293 = true;
		} else if (Static399.method6445(this.anInt4545, arg1)) {
			arg3.aClass132_1 = this.aClass132_1;
		} else {
			arg3.aClass132_1 = null;
		}
		if (Static516.method7740(this.anInt4545, arg1)) {
			if (arg0.aShortArray61 == null || arg0.aShortArray61.length < this.anInt4543) {
				local196 = this.anInt4543;
				arg3.aShortArray65 = arg0.aShortArray65 = new short[local196];
				arg3.aShortArray67 = arg0.aShortArray67 = new short[local196];
				arg3.aShortArray61 = arg0.aShortArray61 = new short[local196];
			} else {
				arg3.aShortArray65 = arg0.aShortArray65;
				arg3.aShortArray61 = arg0.aShortArray61;
				arg3.aShortArray67 = arg0.aShortArray67;
			}
			for (local196 = 0; local196 < this.anInt4543; local196++) {
				arg3.aShortArray61[local196] = this.aShortArray61[local196];
				arg3.aShortArray65[local196] = this.aShortArray65[local196];
				arg3.aShortArray67[local196] = this.aShortArray67[local196];
			}
		} else {
			arg3.aShortArray65 = this.aShortArray65;
			arg3.aShortArray61 = this.aShortArray61;
			arg3.aShortArray67 = this.aShortArray67;
		}
		if (Static437.method6779(arg1, this.anInt4545)) {
			arg3.aClass205_1 = arg0.aClass205_1;
			arg3.aClass205_1.aBoolean425 = this.aClass205_1.aBoolean425;
			arg3.aClass205_1.aBoolean426 = true;
			arg3.aClass205_1.anInterface11_6 = this.aClass205_1.anInterface11_6;
		} else if (Static582.method8191(this.anInt4545, arg1)) {
			arg3.aClass205_1 = this.aClass205_1;
		} else {
			arg3.aClass205_1 = null;
		}
		if (Static67.method1172(this.anInt4545, arg1)) {
			if (arg0.aShortArray72 == null || this.anInt4543 > arg0.aShortArray72.length) {
				local196 = this.anInt4543;
				arg3.aShortArray72 = arg0.aShortArray72 = new short[local196];
			} else {
				arg3.aShortArray72 = arg0.aShortArray72;
			}
			for (local196 = 0; local196 < this.anInt4543; local196++) {
				arg3.aShortArray72[local196] = this.aShortArray72[local196];
			}
		} else {
			arg3.aShortArray72 = this.aShortArray72;
		}
		if (!Static387.method6209(this.anInt4545, arg1)) {
			arg3.aClass181Array1 = this.aClass181Array1;
		} else if (arg0.aClass181Array1 == null || arg0.aClass181Array1.length < this.anInt4542) {
			local196 = this.anInt4542;
			arg3.aClass181Array1 = arg0.aClass181Array1 = new Class181[local196];
			for (local547 = 0; local547 < this.anInt4542; local547++) {
				arg3.aClass181Array1[local547] = this.aClass181Array1[local547].method5185();
			}
		} else {
			arg3.aClass181Array1 = arg0.aClass181Array1;
			for (local196 = 0; local196 < this.anInt4542; local196++) {
				arg3.aClass181Array1[local196].method5184(this.aClass181Array1[local196]);
			}
		}
		arg3.aShortArray63 = this.aShortArray63;
		arg3.aShortArray70 = this.aShortArray70;
		arg3.anIntArrayArray16 = this.anIntArrayArray16;
		arg3.anIntArrayArray17 = this.anIntArrayArray17;
		arg3.anIntArrayArray15 = this.anIntArrayArray15;
		if (this.aBoolean321) {
			arg3.anInt4532 = this.anInt4532;
			arg3.anInt4550 = this.anInt4550;
			arg3.anInt4501 = this.anInt4501;
			arg3.anInt4525 = this.anInt4525;
			arg3.anInt4556 = this.anInt4556;
			arg3.anInt4533 = this.anInt4533;
			arg3.anInt4517 = this.anInt4517;
			arg3.anInt4527 = this.anInt4527;
			arg3.aBoolean321 = true;
		} else {
			arg3.aBoolean321 = false;
		}
		arg3.aShortArray66 = this.aShortArray66;
		arg3.anIntArray258 = this.anIntArray258;
		arg3.aClass299Array1 = this.aClass299Array1;
		arg3.anIntArray260 = this.anIntArray260;
		arg3.anIntArray257 = this.anIntArray257;
		arg3.aShortArray71 = this.aShortArray71;
		arg3.anIntArray254 = this.anIntArray254;
		arg3.aShortArray60 = this.aShortArray60;
		arg3.aClass382Array4 = this.aClass382Array4;
		arg3.aClass243Array4 = this.aClass243Array4;
		return arg3;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Z")
	private boolean method3936() {
		if (this.aClass205_1.aBoolean425) {
			return true;
		}
		if (this.aClass205_1.anInterface11_5 == null) {
			this.aClass205_1.anInterface11_5 = this.aClass100_Sub1_11.method6101(this.aBoolean319);
		}
		@Pc(28) Interface11 local28 = this.aClass205_1.anInterface11_5;
		local28.method8437(this.anInt4488 * 6);
		@Pc(40) Buffer local40 = local28.method3077();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass100_Sub1_11.method6131(local40);
			@Pc(52) int local52;
			if (Stream.b()) {
				for (local52 = 0; local52 < this.anInt4488; local52++) {
					local48.d(this.aShortArray61[local52]);
					local48.d(this.aShortArray65[local52]);
					local48.d(this.aShortArray67[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt4488; local52++) {
					local48.a(this.aShortArray61[local52]);
					local48.a(this.aShortArray65[local52]);
					local48.a(this.aShortArray67[local52]);
				}
			}
			local48.c();
			if (local28.method3078()) {
				this.aClass205_1.aBoolean425 = true;
				this.aBoolean324 = true;
				this.aClass205_1.anInterface11_6 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIBLclient!ql;ZII)Z")
	private boolean method3937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class154 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class154_Sub2 local8 = (Class154_Sub2) arg2;
		@Pc(12) Class154_Sub2 local12 = this.aClass100_Sub1_11.aClass154_Sub2_16;
		@Pc(33) float local33 = local12.aFloat104 + local12.aFloat99 * local8.aFloat94 + local8.aFloat96 * local12.aFloat95 + local12.aFloat98 * local8.aFloat104;
		@Pc(54) float local54 = local12.aFloat96 + local12.aFloat103 * local8.aFloat94 + local12.aFloat100 * local8.aFloat96 + local12.aFloat101 * local8.aFloat104;
		Static553.aFloat189 = local12.aFloat103 * local8.aFloat102 + local12.aFloat101 * local8.aFloat99 + local8.aFloat103 * local12.aFloat100;
		Static5.aFloat2 = local12.aFloat103 * local8.aFloat105 + local8.aFloat98 * local12.aFloat101 + local12.aFloat100 * local8.aFloat101;
		Static234.aFloat77 = local8.aFloat95 * local12.aFloat105 + local12.aFloat97 * local8.aFloat100 + local8.aFloat97 * local12.aFloat102;
		Static306.aFloat115 = local8.aFloat105 * local12.aFloat102 + local12.aFloat97 * local8.aFloat101 + local12.aFloat105 * local8.aFloat98;
		Static214.aFloat71 = local12.aFloat102 * local8.aFloat102 + local12.aFloat97 * local8.aFloat103 + local8.aFloat99 * local12.aFloat105;
		Static568.aFloat192 = local8.aFloat97 * local12.aFloat99 + local8.aFloat95 * local12.aFloat98 + local12.aFloat95 * local8.aFloat100;
		Static408.aFloat146 = local12.aFloat103 * local8.aFloat97 + local8.aFloat95 * local12.aFloat101 + local12.aFloat100 * local8.aFloat100;
		Static473.aFloat178 = local12.aFloat99 * local8.aFloat102 + local12.aFloat98 * local8.aFloat99 + local8.aFloat103 * local12.aFloat95;
		Static447.aFloat166 = local8.aFloat98 * local12.aFloat98 + local12.aFloat95 * local8.aFloat101 + local12.aFloat99 * local8.aFloat105;
		@Pc(237) float local237 = local12.aFloat94 + local8.aFloat96 * local12.aFloat97 + local8.aFloat104 * local12.aFloat105 + local8.aFloat94 * local12.aFloat102;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass100_Sub1_11.anInt7132;
		@Pc(255) int local255 = this.aClass100_Sub1_11.anInt7129;
		if (!this.aBoolean321) {
			this.method3934();
		}
		@Pc(272) int local272 = this.anInt4556 - this.anInt4550 >> 1;
		@Pc(281) int local281 = this.anInt4532 - this.anInt4501 >> 1;
		@Pc(289) int local289 = this.anInt4517 - this.anInt4525 >> 1;
		@Pc(294) int local294 = this.anInt4550 + local272;
		@Pc(300) int local300 = this.anInt4501 + local281;
		@Pc(305) int local305 = this.anInt4525 + local289;
		@Pc(312) int local312 = local294 - (local272 << arg5);
		@Pc(318) int local318 = local300 - (local281 << arg5);
		@Pc(325) int local325 = local305 - (local289 << arg5);
		@Pc(331) int local331 = local294 + (local272 << arg5);
		@Pc(337) int local337 = (local281 << arg5) + local300;
		@Pc(344) int local344 = local305 + (local289 << arg5);
		Static513.anIntArray553[0] = local312;
		Static537.anIntArray568[0] = local318;
		Static513.anIntArray553[1] = local331;
		Static324.anIntArray365[0] = local325;
		Static537.anIntArray568[1] = local318;
		Static324.anIntArray365[1] = local325;
		Static513.anIntArray553[2] = local312;
		Static537.anIntArray568[2] = local337;
		Static513.anIntArray553[3] = local331;
		Static324.anIntArray365[2] = local325;
		Static537.anIntArray568[3] = local337;
		Static513.anIntArray553[4] = local312;
		Static324.anIntArray365[3] = local325;
		Static537.anIntArray568[4] = local318;
		Static324.anIntArray365[4] = local344;
		Static513.anIntArray553[5] = local331;
		Static537.anIntArray568[5] = local318;
		Static513.anIntArray553[6] = local312;
		Static324.anIntArray365[5] = local344;
		Static537.anIntArray568[6] = local337;
		Static513.anIntArray553[7] = local331;
		Static324.anIntArray365[6] = local344;
		Static537.anIntArray568[7] = local337;
		Static324.anIntArray365[7] = local344;
		@Pc(478) float local478;
		@Pc(506) float local506;
		@Pc(492) float local492;
		@Pc(459) float local459;
		@Pc(454) float local454;
		@Pc(464) float local464;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = (float) Static537.anIntArray568[local447];
			local459 = (float) Static513.anIntArray553[local447];
			local464 = (float) Static324.anIntArray365[local447];
			local478 = local33 + local459 * Static447.aFloat166 + Static568.aFloat192 * local454 + Static473.aFloat178 * local464;
			local492 = Static214.aFloat71 * local464 + Static306.aFloat115 * local459 + local454 * Static234.aFloat77 + local237;
			local506 = local54 + local459 * Static5.aFloat2 + Static408.aFloat146 * local454 + local464 * Static553.aFloat189;
			if ((float) this.aClass100_Sub1_11.anInt7142 <= local492) {
				if (arg4 > 0) {
					local492 = (float) arg4;
				}
				@Pc(530) float local530 = (float) local251 * local478 / local492 + (float) this.aClass100_Sub1_11.anInt7133;
				@Pc(542) float local542 = (float) this.aClass100_Sub1_11.bf + local506 * (float) local255 / local492;
				if (local241 > local530) {
					local241 = local530;
				}
				if (local530 > local243) {
					local243 = local530;
				}
				if (local542 < local245) {
					local245 = local542;
				}
				local239 = true;
				if (local247 < local542) {
					local247 = local542;
				}
			}
		}
		if (local239 && local241 < (float) arg1 && local243 > (float) arg1 && local245 < (float) arg0 && local247 > (float) arg0) {
			if (arg3) {
				return true;
			}
			if (this.anInt4520 > Static281.anIntArray338.length) {
				Static625.anIntArray630 = new int[this.anInt4520];
				Static281.anIntArray338 = new int[this.anInt4520];
			}
			@Pc(706) int local706;
			for (@Pc(619) int local619 = 0; local619 < this.anInt4496; local619++) {
				local454 = (float) this.anIntArray259[local619];
				local464 = (float) this.anIntArray256[local619];
				local459 = (float) this.anIntArray255[local619];
				local478 = Static473.aFloat178 * local464 + Static447.aFloat166 * local459 + local454 * Static568.aFloat192 + local33;
				local492 = local237 + local464 * Static214.aFloat71 + Static306.aFloat115 * local459 + local454 * Static234.aFloat77;
				local506 = local454 * Static408.aFloat146 + Static5.aFloat2 * local459 + Static553.aFloat189 * local464 + local54;
				@Pc(719) int local719;
				@Pc(724) int local724;
				@Pc(731) int local731;
				if ((float) this.aClass100_Sub1_11.anInt7142 <= local492) {
					if (arg4 > 0) {
						local492 = (float) arg4;
					}
					local706 = (int) ((float) local251 * local478 / local492 + (float) this.aClass100_Sub1_11.anInt7133);
					local719 = (int) ((float) this.aClass100_Sub1_11.bf + (float) local255 * local506 / local492);
					local724 = this.anIntArray257[local619];
					local731 = this.anIntArray257[local619 + 1];
					for (@Pc(733) int local733 = local724; local733 < local731; local733++) {
						@Pc(742) int local742 = this.aShortArray60[local733] - 1;
						if (local742 == -1) {
							break;
						}
						Static281.anIntArray338[local742] = local706;
						Static625.anIntArray630[local742] = local719;
					}
				} else {
					local706 = this.anIntArray257[local619];
					local719 = this.anIntArray257[local619 + 1];
					for (local724 = local706; local724 < local719; local724++) {
						local731 = this.aShortArray60[local724] - 1;
						if (local731 == -1) {
							break;
						}
						Static281.anIntArray338[this.aShortArray60[local724] - 1] = -999999;
					}
				}
			}
			for (local706 = 0; local706 < this.anInt4543; local706++) {
				if (Static281.anIntArray338[this.aShortArray61[local706]] != -999999 && Static281.anIntArray338[this.aShortArray65[local706]] != -999999 && Static281.anIntArray338[this.aShortArray67[local706]] != -999999 && this.method3944(arg1, Static281.anIntArray338[this.aShortArray67[local706]], Static625.anIntArray630[this.aShortArray65[local706]], arg0, Static281.anIntArray338[this.aShortArray65[local706]], Static281.anIntArray338[this.aShortArray61[local706]], Static625.anIntArray630[this.aShortArray61[local706]], Static625.anIntArray630[this.aShortArray67[local706]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ic", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass100_Sub1_11.anInterface4_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4543; local11++) {
			if (this.aShortArray72[local11] == arg0) {
				this.aShortArray72[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class325 local47 = local9.method895(arg0 & 0xFFFF);
			local37 = local47.aByte117;
			local35 = local47.aByte113;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class325 local68 = local9.method895(arg1 & 0xFFFF);
			if (local68.aByte116 != 0 || local68.aByte111 != 0) {
				this.aBoolean322 = true;
			}
			local55 = local68.aByte113;
			local57 = local68.aByte117;
		}
		if (!(local35 != local55 | local37 != local57)) {
			return;
		}
		if (this.aClass299Array1 != null) {
			for (@Pc(102) int local102 = 0; local102 < this.anInt4542; local102++) {
				@Pc(109) Class299 local109 = this.aClass299Array1[local102];
				@Pc(114) Class181 local114 = this.aClass181Array1[local102];
				local114.anInt5909 = Static91.anIntArray99[this.aShortArray64[local109.anInt8674] & 0xFFFF] & 0xFFFFFF | local114.anInt5909 & 0xFF000000;
			}
		}
		this.method3943();
	}

	@OriginalMember(owner = "client!ic", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class199 arg2, @OriginalArg(3) Class199 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean321) {
			this.method3934();
		}
		@Pc(16) int local16 = arg4 + this.anInt4550;
		@Pc(21) int local21 = this.anInt4556 + arg4;
		@Pc(26) int local26 = this.anInt4525 + arg6;
		@Pc(31) int local31 = this.anInt4517 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt10111 <= arg2.anInt10112 + local21 >> arg2.anInt10104 || local26 < 0 || arg2.anInt10112 + local31 >> arg2.anInt10104 >= arg2.anInt10110)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt10112 + local21 >> arg3.anInt10104 >= arg3.anInt10111 || local26 < 0 || arg3.anInt10110 <= arg3.anInt10112 + local31 >> arg3.anInt10104) {
				return;
			}
		} else {
			local16 >>= arg2.anInt10104;
			local21 = local21 + arg2.anInt10112 - 1 >> arg2.anInt10104;
			local26 >>= arg2.anInt10104;
			local31 = local31 + arg2.anInt10112 - 1 >> arg2.anInt10104;
			if (arg2.method8532(local16, local26) == arg5 && arg2.method8532(local21, local26) == arg5 && arg2.method8532(local16, local31) == arg5 && arg5 == arg2.method8532(local21, local31)) {
				return;
			}
		}
		@Pc(205) int local205;
		if (arg0 == 1) {
			for (local205 = 0; local205 < this.anInt4496; local205++) {
				this.anIntArray259[local205] -= arg5 - arg2.method8531(this.anIntArray256[local205] + arg6, this.anIntArray255[local205] - -arg4);
			}
		} else {
			@Pc(213) int local213;
			@Pc(221) int local221;
			if (arg0 == 2) {
				local205 = this.anInt4501;
				if (local205 == 0) {
					return;
				}
				for (local213 = 0; local213 < this.anInt4496; local213++) {
					local221 = (this.anIntArray259[local213] << 16) / local205;
					if (local221 < arg1) {
						this.anIntArray259[local213] -= -((arg2.method8531(arg6 + this.anIntArray256[local213], this.anIntArray255[local213] - -arg4) - arg5) * (-local221 + arg1) / arg1);
					}
				}
			} else {
				@Pc(229) int local229;
				if (arg0 == 3) {
					local205 = (arg1 & 0xFF) * 4;
					local213 = (arg1 >> 8 & 0xFF) * 4;
					local221 = (arg1 >> 16 & 0xFF) << 6;
					local229 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local205 >> 1) < 0 || arg2.anInt10111 << arg2.anInt10104 <= arg2.anInt10112 + arg4 + (local205 >> 1) || arg6 - (local213 >> 1) < 0 || (local213 >> 1) + arg6 + arg2.anInt10112 >= arg2.anInt10110 << arg2.anInt10104) {
						return;
					}
					this.method6851(local205, local213, local229, local221, arg5, arg2, arg4, arg6);
				} else if (arg0 == 4) {
					local205 = this.anInt4532 - this.anInt4501;
					for (local213 = 0; local213 < this.anInt4496; local213++) {
						this.anIntArray259[local213] = this.anIntArray259[local213] + arg3.method8531(this.anIntArray256[local213] + arg6, this.anIntArray255[local213] - -arg4) + local205 - arg5;
					}
				} else if (arg0 == 5) {
					local205 = this.anInt4532 - this.anInt4501;
					for (local213 = 0; local213 < this.anInt4496; local213++) {
						local221 = arg4 + this.anIntArray255[local213];
						local229 = this.anIntArray256[local213] + arg6;
						@Pc(381) int local381 = arg2.method8531(local229, local221);
						@Pc(387) int local387 = arg3.method8531(local229, local221);
						@Pc(395) int local395 = local381 - arg1 - local387;
						this.anIntArray259[local213] = (local395 * ((this.anIntArray259[local213] << 8) / local205) >> 8) + local381 - arg5;
					}
				}
			}
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class6_Sub2_Sub16 ba(@OriginalArg(0) Class6_Sub2_Sub16 arg0) {
		if (this.anInt4520 == 0) {
			return null;
		}
		if (!this.aBoolean321) {
			this.method3934();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass100_Sub1_11.anInt7153 > 0) {
			local43 = this.anInt4550 - (this.aClass100_Sub1_11.anInt7153 * this.anInt4532 >> 8) >> this.aClass100_Sub1_11.anInt7124;
			local60 = this.anInt4556 - (this.anInt4501 * this.aClass100_Sub1_11.anInt7153 >> 8) >> this.aClass100_Sub1_11.anInt7124;
		} else {
			local43 = this.anInt4550 - (this.aClass100_Sub1_11.anInt7153 * this.anInt4501 >> 8) >> this.aClass100_Sub1_11.anInt7124;
			local60 = this.anInt4556 - (this.aClass100_Sub1_11.anInt7153 * this.anInt4532 >> 8) >> this.aClass100_Sub1_11.anInt7124;
		}
		@Pc(120) int local120;
		@Pc(136) int local136;
		if (this.aClass100_Sub1_11.anInt7145 > 0) {
			local120 = this.anInt4525 - (this.anInt4532 * this.aClass100_Sub1_11.anInt7145 >> 8) >> this.aClass100_Sub1_11.anInt7124;
			local136 = this.anInt4517 - (this.anInt4501 * this.aClass100_Sub1_11.anInt7145 >> 8) >> this.aClass100_Sub1_11.anInt7124;
		} else {
			local120 = this.anInt4525 - (this.anInt4501 * this.aClass100_Sub1_11.anInt7145 >> 8) >> this.aClass100_Sub1_11.anInt7124;
			local136 = this.anInt4517 - (this.anInt4532 * this.aClass100_Sub1_11.anInt7145 >> 8) >> this.aClass100_Sub1_11.anInt7124;
		}
		@Pc(177) int local177 = local60 + 1 - local43;
		@Pc(184) int local184 = local136 + 1 - local120;
		@Pc(187) Class6_Sub2_Sub16_Sub2 local187 = (Class6_Sub2_Sub16_Sub2) arg0;
		@Pc(197) Class6_Sub2_Sub16_Sub2 local197;
		if (local187 != null && local187.method8763(local177, local184)) {
			local197 = local187;
			local187.method8766();
		} else {
			local197 = new Class6_Sub2_Sub16_Sub2(this.aClass100_Sub1_11, local177, local184);
		}
		local197.method8767(local43, local60, local120, local136);
		this.method3942(local197);
		return local197;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4543; local7++) {
			local16 = this.aShortArray64[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			@Pc(46) int local46 = local16 & 0x7F;
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local46 += (arg2 - local46) * arg3 >> 7;
			}
			this.aShortArray64[local7] = (short) (local22 << 10 | local28 << 7 | local46);
		}
		if (this.aClass299Array1 != null) {
			for (local16 = 0; local16 < this.anInt4542; local16++) {
				@Pc(109) Class299 local109 = this.aClass299Array1[local16];
				@Pc(114) Class181 local114 = this.aClass181Array1[local16];
				local114.anInt5909 = Static91.anIntArray99[this.aShortArray64[local109.anInt8674] & 0xFFFF] & 0xFFFFFF | local114.anInt5909 & 0xFF000000;
			}
		}
		this.method3943();
	}

	@OriginalMember(owner = "client!ic", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4550;
	}

	@OriginalMember(owner = "client!ic", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		@Pc(20) int local20;
		if (arg0 == 0) {
			local12 = 0;
			Static557.anInt9471 = 0;
			Static334.anInt6351 = 0;
			Static86.anInt2081 = 0;
			for (local20 = 0; local20 < this.anInt4496; local20++) {
				Static557.anInt9471 += this.anIntArray255[local20];
				Static334.anInt6351 += this.anIntArray259[local20];
				local12++;
				Static86.anInt2081 += this.anIntArray256[local20];
			}
			if (local12 <= 0) {
				Static557.anInt9471 = arg1;
				Static86.anInt2081 = arg3;
				Static334.anInt6351 = arg2;
			} else {
				Static334.anInt6351 = Static334.anInt6351 / local12 + arg2;
				Static86.anInt2081 = Static86.anInt2081 / local12 + arg3;
				Static557.anInt9471 = arg1 + Static557.anInt9471 / local12;
			}
		} else if (arg0 == 1) {
			for (local12 = 0; local12 < this.anInt4496; local12++) {
				this.anIntArray255[local12] += arg1;
				this.anIntArray259[local12] += arg2;
				this.anIntArray256[local12] += arg3;
			}
		} else {
			@Pc(165) int local165;
			@Pc(183) int local183;
			if (arg0 == 2) {
				for (local12 = 0; local12 < this.anInt4496; local12++) {
					this.anIntArray255[local12] -= Static557.anInt9471;
					this.anIntArray259[local12] -= Static334.anInt6351;
					this.anIntArray256[local12] -= Static86.anInt2081;
					if (arg3 != 0) {
						local20 = Class100_Sub1.anIntArray428[arg3];
						local165 = Class100_Sub1.anIntArray429[arg3];
						local183 = this.anIntArray255[local12] * local165 + local20 * this.anIntArray259[local12] + 16383 >> 14;
						this.anIntArray259[local12] = this.anIntArray259[local12] * local165 + 16383 - local20 * this.anIntArray255[local12] >> 14;
						this.anIntArray255[local12] = local183;
					}
					if (arg1 != 0) {
						local20 = Class100_Sub1.anIntArray428[arg1];
						local165 = Class100_Sub1.anIntArray429[arg1];
						local183 = this.anIntArray259[local12] * local165 + 16383 - this.anIntArray256[local12] * local20 >> 14;
						this.anIntArray256[local12] = local20 * this.anIntArray259[local12] + local165 * this.anIntArray256[local12] + 16383 >> 14;
						this.anIntArray259[local12] = local183;
					}
					if (arg2 != 0) {
						local20 = Class100_Sub1.anIntArray428[arg2];
						local165 = Class100_Sub1.anIntArray429[arg2];
						local183 = this.anIntArray256[local12] * local20 + local165 * this.anIntArray255[local12] + 16383 >> 14;
						this.anIntArray256[local12] = this.anIntArray256[local12] * local165 + 16383 - this.anIntArray255[local12] * local20 >> 14;
						this.anIntArray255[local12] = local183;
					}
					this.anIntArray255[local12] += Static557.anInt9471;
					this.anIntArray259[local12] += Static334.anInt6351;
					this.anIntArray256[local12] += Static86.anInt2081;
				}
			} else if (arg0 == 3) {
				for (local12 = 0; local12 < this.anInt4496; local12++) {
					this.anIntArray255[local12] -= Static557.anInt9471;
					this.anIntArray259[local12] -= Static334.anInt6351;
					this.anIntArray256[local12] -= Static86.anInt2081;
					this.anIntArray255[local12] = arg1 * this.anIntArray255[local12] / 128;
					this.anIntArray259[local12] = arg2 * this.anIntArray259[local12] / 128;
					this.anIntArray256[local12] = arg3 * this.anIntArray256[local12] / 128;
					this.anIntArray255[local12] += Static557.anInt9471;
					this.anIntArray259[local12] += Static334.anInt6351;
					this.anIntArray256[local12] += Static86.anInt2081;
				}
			} else {
				@Pc(515) Class299 local515;
				@Pc(520) Class181 local520;
				if (arg0 == 5) {
					for (local12 = 0; local12 < this.anInt4543; local12++) {
						local20 = (this.aByteArray52[local12] & 0xFF) + (arg1 * 8);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray52[local12] = (byte) local20;
					}
					if (this.aClass299Array1 != null) {
						for (local20 = 0; local20 < this.anInt4542; local20++) {
							local515 = this.aClass299Array1[local20];
							local520 = this.aClass181Array1[local20];
							local520.anInt5909 = 255 - (this.aByteArray52[local515.anInt8674] & 0xFF) << 24 | local520.anInt5909 & 0xFFFFFF;
						}
					}
					this.method3943();
				} else if (arg0 == 7) {
					for (local12 = 0; local12 < this.anInt4543; local12++) {
						local20 = this.aShortArray64[local12] & 0xFFFF;
						local165 = local20 >> 10 & 0x3F;
						local183 = local20 >> 7 & 0x7;
						@Pc(581) int local581 = local20 & 0x7F;
						local183 += arg2 / 4;
						@Pc(594) int local594 = local165 + arg1 & 0x3F;
						local581 += arg3;
						if (local183 < 0) {
							local183 = 0;
						} else if (local183 > 7) {
							local183 = 7;
						}
						if (local581 < 0) {
							local581 = 0;
						} else if (local581 > 127) {
							local581 = 127;
						}
						this.aShortArray64[local12] = (short) (local581 | local183 << 7 | local594 << 10);
					}
					if (this.aClass299Array1 != null) {
						for (local20 = 0; local20 < this.anInt4542; local20++) {
							local515 = this.aClass299Array1[local20];
							local520 = this.aClass181Array1[local20];
							local520.anInt5909 = Static91.anIntArray99[this.aShortArray64[local515.anInt8674] & 0xFFFF] & 0xFFFFFF | local520.anInt5909 & 0xFF000000;
						}
					}
					this.method3943();
				} else {
					@Pc(703) Class181 local703;
					if (arg0 == 8) {
						for (local12 = 0; local12 < this.anInt4542; local12++) {
							local703 = this.aClass181Array1[local12];
							local703.anInt5914 += arg2;
							local703.anInt5908 += arg1;
						}
					} else if (arg0 == 10) {
						for (local12 = 0; local12 < this.anInt4542; local12++) {
							local703 = this.aClass181Array1[local12];
							local703.anInt5907 = arg2 * local703.anInt5907 >> 7;
							local703.anInt5911 = arg1 * local703.anInt5911 >> 7;
						}
					} else if (arg0 == 9) {
						for (local12 = 0; local12 < this.anInt4542; local12++) {
							local703 = this.aClass181Array1[local12];
							local703.anInt5913 = local703.anInt5913 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4496; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray259[local15] - local9 * this.anIntArray256[local15] >> 14;
			this.anIntArray256[local15] = this.anIntArray256[local15] * local13 + this.anIntArray259[local15] * local9 >> 14;
			this.anIntArray259[local15] = local34;
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4496; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray255[local15] + local9 * this.anIntArray256[local15] >> 14;
			this.anIntArray256[local15] = local13 * this.anIntArray256[local15] - local9 * this.anIntArray255[local15] >> 14;
			this.anIntArray255[local15] = local33;
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	private void method3938() {
		if (this.aClass299Array1 == null) {
			return;
		}
		this.aClass100_Sub1_11.C(!this.aBoolean320);
		this.aClass100_Sub1_11.method6075(false);
		this.aClass100_Sub1_11.method6068(1, Static456.aClass187_2);
		this.aClass100_Sub1_11.method6146(1, Static456.aClass187_2);
		for (@Pc(32) int local32 = 0; local32 < this.anInt4542; local32++) {
			@Pc(39) Class299 local39 = this.aClass299Array1[local32];
			@Pc(44) Class181 local44 = this.aClass181Array1[local32];
			if (!local39.aBoolean580 || !this.aClass100_Sub1_11.method8784()) {
				@Pc(72) float local72 = (float) (this.anIntArray255[local39.anInt8670] + this.anIntArray255[local39.anInt8667] + this.anIntArray255[local39.anInt8673]) * 0.3333333F;
				@Pc(93) float local93 = (float) (this.anIntArray259[local39.anInt8673] + this.anIntArray259[local39.anInt8667] + this.anIntArray259[local39.anInt8670]) * 0.3333333F;
				@Pc(114) float local114 = (float) (this.anIntArray256[local39.anInt8667] + this.anIntArray256[local39.anInt8670] + this.anIntArray256[local39.anInt8673]) * 0.3333333F;
				@Pc(128) float local128 = local114 * Static473.aFloat178 + local72 * Static447.aFloat166 + Static568.aFloat192 * local93 + Static53.aFloat17;
				@Pc(142) float local142 = Static317.aFloat117 + Static553.aFloat189 * local114 + local72 * Static5.aFloat2 + local93 * Static408.aFloat146;
				@Pc(156) float local156 = Static15.aFloat114 + local93 * Static234.aFloat77 + Static306.aFloat115 * local72 + Static214.aFloat71 * local114;
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local142 * local142 + local128 * local128))) * (float) local39.anInt8672;
				@Pc(182) Class154_Sub2 local182 = this.aClass100_Sub1_11.method6073();
				local182.method4534((float) local44.anInt5914 + local142 - local177 * local142, local156 - local156 * local177, local39.aShort108 * local44.anInt5911 >> 7, local44.anInt5913, local128 + (float) local44.anInt5908 - local177 * local128, local39.aShort109 * local44.anInt5907 >> 7);
				local182.method4515(this.aClass100_Sub1_11.aClass154_Sub2_17);
				this.aClass100_Sub1_11.method6145();
				@Pc(237) int local237 = local44.anInt5909;
				this.aClass100_Sub1_11.method6137(false, false, local39.aShort107);
				this.aClass100_Sub1_11.method6144(local39.aByte101);
				this.aClass100_Sub1_11.method6154(local237);
				this.aClass100_Sub1_11.method6161();
			}
		}
		this.aClass100_Sub1_11.method6146(1, Static506.aClass187_3);
		this.aClass100_Sub1_11.method6068(1, Static506.aClass187_3);
		this.aClass100_Sub1_11.C(true);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
	private void method3939() {
		if (!this.aBoolean324) {
			return;
		}
		this.aBoolean324 = false;
		if (this.aClass382Array4 == null && this.aClass243Array4 == null && this.aClass299Array1 == null) {
			if (this.anIntArray255 != null && !Static470.method7120(this.anInt4564, this.anInt4545)) {
				if (this.aClass132_2 == null || this.aClass132_2.method3607()) {
					if (!this.aBoolean321) {
						this.method3934();
					}
					this.anIntArray255 = null;
				} else {
					this.aBoolean324 = true;
				}
			}
			if (this.anIntArray259 != null && !Static29.method525(this.anInt4545, this.anInt4564)) {
				if (this.aClass132_2 == null || this.aClass132_2.method3607()) {
					if (!this.aBoolean321) {
						this.method3934();
					}
					this.anIntArray259 = null;
				} else {
					this.aBoolean324 = true;
				}
			}
			if (this.anIntArray256 != null && !Static522.method7781(this.anInt4564, this.anInt4545)) {
				if (this.aClass132_2 == null || this.aClass132_2.method3607()) {
					if (!this.aBoolean321) {
						this.method3934();
					}
					this.anIntArray256 = null;
				} else {
					this.aBoolean324 = true;
				}
			}
		}
		if (this.aShortArray60 != null && this.anIntArray255 == null && this.anIntArray259 == null && this.anIntArray256 == null) {
			this.aShortArray60 = null;
			this.anIntArray257 = null;
		}
		if (this.aByteArray51 != null && !Static569.method8135(this.anInt4545, this.anInt4564)) {
			label197: {
				label196: {
					@Pc(165) boolean local165;
					if ((this.anInt4545 & 0x37) == 0) {
						if (this.aClass132_3 == null || this.aClass132_3.method3607()) {
							break label196;
						}
						local165 = false;
					} else {
						if (this.aClass132_4 == null || this.aClass132_4.method3607()) {
							break label196;
						}
						local165 = false;
					}
					if (!local165) {
						this.aBoolean324 = true;
						break label197;
					}
				}
				this.aByteArray51 = null;
				this.aShortArray62 = this.aShortArray69 = this.aShortArray68 = null;
			}
		}
		if (this.aShortArray64 != null && !Static158.method2997(this.anInt4564, this.anInt4545)) {
			if (this.aClass132_3 == null || this.aClass132_3.method3607()) {
				this.aShortArray64 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.aByteArray52 != null && !Static403.method6476(this.anInt4545, this.anInt4564)) {
			if (this.aClass132_3 == null || this.aClass132_3.method3607()) {
				this.aByteArray52 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.aFloatArray42 != null && !Static321.method5342(this.anInt4564, this.anInt4545)) {
			if (this.aClass132_1 == null || this.aClass132_1.method3607()) {
				this.aFloatArray42 = this.aFloatArray43 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.aShortArray72 != null && !Static249.method4329(this.anInt4564, this.anInt4545)) {
			if (this.aClass132_3 == null || this.aClass132_3.method3607()) {
				this.aShortArray72 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.aShortArray61 != null && !Static637.method8953(this.anInt4564, this.anInt4545)) {
			if ((this.aClass205_1 == null || this.aClass205_1.method5557()) && (this.aClass132_3 == null || this.aClass132_3.method3607())) {
				this.aShortArray61 = this.aShortArray65 = this.aShortArray67 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.aShortArray70 != null) {
			if (this.aClass132_2 == null || this.aClass132_2.method3607()) {
				this.aShortArray70 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.aShortArray71 != null) {
			if (this.aClass132_3 == null || this.aClass132_3.method3607()) {
				this.aShortArray71 = null;
			} else {
				this.aBoolean324 = true;
			}
		}
		if (this.anIntArrayArray16 != null && !Static366.method5795(this.anInt4564, this.anInt4545)) {
			this.anIntArrayArray16 = null;
			this.aShortArray63 = null;
		}
		if (this.anIntArrayArray17 != null && !Static399.method6443(this.anInt4564, this.anInt4545)) {
			this.anIntArrayArray17 = null;
			this.aShortArray66 = null;
		}
		if (this.anIntArrayArray15 != null && !Static571.method8296(this.anInt4545, this.anInt4564)) {
			this.anIntArrayArray15 = null;
		}
		if (this.anIntArray258 != null && (this.anInt4564 & 0x800) == 0 && (this.anInt4564 & 0x40000) == 0) {
			this.anIntArray260 = null;
			this.anIntArray254 = null;
			this.anIntArray258 = null;
		}
	}

	@OriginalMember(owner = "client!ic", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4532;
	}

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V")
	private void method3940() {
		if (this.aClass205_1 != null) {
			this.aClass205_1.aBoolean425 = false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4531; local3++) {
			this.anIntArray255[local3] = this.anIntArray255[local3] + 7 >> 4;
			this.anIntArray259[local3] = this.anIntArray259[local3] + 7 >> 4;
			this.anIntArray256[local3] = this.anIntArray256[local3] + 7 >> 4;
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method6854(@OriginalArg(0) Class24 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class24_Sub2 local8 = (Class24_Sub2) arg0;
		if (this.anInt4543 == 0 || local8.anInt4543 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt4496;
		@Pc(21) int[] local21 = local8.anIntArray255;
		@Pc(24) int[] local24 = local8.anIntArray259;
		@Pc(27) int[] local27 = local8.anIntArray256;
		@Pc(30) short[] local30 = local8.aShortArray62;
		@Pc(33) short[] local33 = local8.aShortArray69;
		@Pc(36) short[] local36 = local8.aShortArray68;
		@Pc(39) byte[] local39 = local8.aByteArray51;
		@Pc(48) short[] local48;
		@Pc(44) short[] local44;
		@Pc(46) short[] local46;
		@Pc(50) byte[] local50;
		if (this.aClass378_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local50 = this.aClass378_1.aByteArray125;
			local44 = this.aClass378_1.aShortArray150;
			local48 = this.aClass378_1.aShortArray152;
			local46 = this.aClass378_1.aShortArray151;
		}
		@Pc(73) short[] local73;
		@Pc(77) short[] local77;
		@Pc(75) short[] local75;
		@Pc(79) byte[] local79;
		if (local8.aClass378_1 == null) {
			local73 = null;
			local75 = null;
			local77 = null;
			local79 = null;
		} else {
			local77 = local8.aClass378_1.aShortArray150;
			local75 = local8.aClass378_1.aShortArray151;
			local73 = local8.aClass378_1.aShortArray152;
			local79 = local8.aClass378_1.aByteArray125;
		}
		@Pc(100) int[] local100 = local8.anIntArray257;
		@Pc(103) short[] local103 = local8.aShortArray60;
		if (!local8.aBoolean321) {
			local8.method3934();
		}
		@Pc(112) int local112 = local8.anInt4501;
		@Pc(115) int local115 = local8.anInt4532;
		@Pc(118) int local118 = local8.anInt4550;
		@Pc(121) int local121 = local8.anInt4556;
		@Pc(124) int local124 = local8.anInt4525;
		@Pc(127) int local127 = local8.anInt4517;
		for (@Pc(129) int local129 = 0; local129 < this.anInt4496; local129++) {
			@Pc(138) int local138 = this.anIntArray259[local129] - arg2;
			if (local112 <= local138 && local115 >= local138) {
				@Pc(154) int local154 = this.anIntArray255[local129] - arg1;
				if (local154 >= local118 && local154 <= local121) {
					@Pc(173) int local173 = this.anIntArray256[local129] - arg3;
					if (local124 <= local173 && local173 <= local127) {
						@Pc(187) int local187 = -1;
						@Pc(192) int local192 = this.anIntArray257[local129];
						@Pc(199) int local199 = this.anIntArray257[local129 + 1];
						for (@Pc(201) int local201 = local192; local201 < local199; local201++) {
							local187 = this.aShortArray60[local201] - 1;
							if (local187 == -1 || this.aByteArray51[local187] != 0) {
								break;
							}
						}
						if (local187 != -1) {
							for (@Pc(234) int local234 = 0; local234 < local18; local234++) {
								if (local21[local234] == local154 && local27[local234] == local173 && local138 == local24[local234]) {
									local199 = local100[local234 + 1];
									local192 = local100[local234];
									@Pc(271) int local271 = -1;
									for (@Pc(273) int local273 = local192; local273 < local199; local273++) {
										local271 = local103[local273] - 1;
										if (local271 == -1 || local39[local271] != 0) {
											break;
										}
									}
									if (local271 != -1) {
										if (local48 == null) {
											this.aClass378_1 = new Class378();
											local48 = this.aClass378_1.aShortArray152 = Static617.method8623(this.aShortArray62);
											local44 = this.aClass378_1.aShortArray150 = Static617.method8623(this.aShortArray69);
											local46 = this.aClass378_1.aShortArray151 = Static617.method8623(this.aShortArray68);
											local50 = this.aClass378_1.aByteArray125 = Static356.method5694(this.aByteArray51);
										}
										if (local73 == null) {
											@Pc(357) Class378 local357 = local8.aClass378_1 = new Class378();
											local73 = local357.aShortArray152 = Static617.method8623(local30);
											local77 = local357.aShortArray150 = Static617.method8623(local33);
											local75 = local357.aShortArray151 = Static617.method8623(local36);
											local79 = local357.aByteArray125 = Static356.method5694(local39);
										}
										@Pc(390) short local390 = this.aShortArray62[local187];
										@Pc(395) short local395 = this.aShortArray69[local187];
										@Pc(400) short local400 = this.aShortArray68[local187];
										local192 = local100[local234];
										local199 = local100[local234 + 1];
										@Pc(415) byte local415 = this.aByteArray51[local187];
										@Pc(425) int local425;
										for (@Pc(417) int local417 = local192; local417 < local199; local417++) {
											local425 = local103[local417] - 1;
											if (local425 == -1) {
												break;
											}
											if (local79[local425] != 0) {
												local73[local425] += local390;
												local77[local425] += local395;
												local75[local425] += local400;
												local79[local425] += local415;
											}
										}
										local400 = local36[local271];
										local192 = this.anIntArray257[local129];
										local199 = this.anIntArray257[local129 + 1];
										local390 = local30[local271];
										local395 = local33[local271];
										local415 = local39[local271];
										for (local425 = local192; local425 < local199; local425++) {
											@Pc(512) int local512 = this.aShortArray60[local425] - 1;
											if (local512 == -1) {
												break;
											}
											if (local50[local512] != 0) {
												local48[local512] += local390;
												local44[local512] += local395;
												local46[local512] += local400;
												local50[local512] += local415;
											}
										}
										local8.method3941();
										this.method3941();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4517;
	}

	@OriginalMember(owner = "client!ic", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4496; local3++) {
			if (arg0 != 128) {
				this.anIntArray255[local3] = arg0 * this.anIntArray255[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray259[local3] = this.anIntArray259[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray256[local3] = this.anIntArray256[local3] * arg2 >> 7;
			}
		}
		this.method3945();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ql;ZI)Z")
	@Override
	public boolean method6855(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3937(arg1, arg0, arg2, arg3, -1, arg4);
	}

	@OriginalMember(owner = "client!ic", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4501;
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
	private void method3941() {
		if ((this.anInt4545 & 0x37) == 0) {
			if (this.aClass132_3 != null) {
				this.aClass132_3.aBoolean294 = false;
			}
		} else if (this.aClass132_4 != null) {
			this.aClass132_4.aBoolean294 = false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort54;
	}

	@OriginalMember(owner = "client!ic", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt4564;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "()[Lclient!wr;")
	@Override
	public Class382[] method6853() {
		return this.aClass382Array4;
	}

	@OriginalMember(owner = "client!ic", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray17 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4531; local12++) {
			this.anIntArray255[local12] <<= 0x4;
			this.anIntArray259[local12] <<= 0x4;
			this.anIntArray256[local12] <<= 0x4;
		}
		Static557.anInt9471 = 0;
		Static86.anInt2081 = 0;
		Static334.anInt6351 = 0;
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!wga;)V")
	private void method3942(@OriginalArg(1) Class6_Sub2_Sub16_Sub2 arg0) {
		if (this.anInt4520 > Static281.anIntArray338.length) {
			Static281.anIntArray338 = new int[this.anInt4520];
			Static625.anIntArray630 = new int[this.anInt4520];
		}
		@Pc(71) int local71;
		@Pc(94) int local94;
		for (@Pc(20) int local20 = 0; local20 < this.anInt4496; local20++) {
			@Pc(46) int local46 = (this.anIntArray255[local20] - (this.aClass100_Sub1_11.anInt7153 * this.anIntArray259[local20] >> 8) >> this.aClass100_Sub1_11.anInt7124) - arg0.anInt10364;
			local71 = (this.anIntArray256[local20] - (this.aClass100_Sub1_11.anInt7145 * this.anIntArray259[local20] >> 8) >> this.aClass100_Sub1_11.anInt7124) - arg0.anInt10369;
			@Pc(76) int local76 = this.anIntArray257[local20];
			@Pc(83) int local83 = this.anIntArray257[local20 + 1];
			for (@Pc(85) int local85 = local76; local85 < local83; local85++) {
				local94 = this.aShortArray60[local85] - 1;
				if (local94 == -1) {
					break;
				}
				Static281.anIntArray338[local94] = local46;
				Static625.anIntArray630[local94] = local71;
			}
		}
		for (local71 = 0; local71 < this.anInt4488; local71++) {
			if (this.aByteArray52 == null || this.aByteArray52[local71] <= 128) {
				@Pc(147) short local147 = this.aShortArray61[local71];
				@Pc(152) short local152 = this.aShortArray65[local71];
				@Pc(157) short local157 = this.aShortArray67[local71];
				local94 = Static281.anIntArray338[local147];
				@Pc(165) int local165 = Static281.anIntArray338[local152];
				@Pc(169) int local169 = Static281.anIntArray338[local157];
				@Pc(173) int local173 = Static625.anIntArray630[local147];
				@Pc(177) int local177 = Static625.anIntArray630[local152];
				@Pc(181) int local181 = Static625.anIntArray630[local157];
				if ((local177 - local181) * (-local165 + local94) - (local169 - local165) * (local177 + -local173) > 0) {
					arg0.method8768(local94, local181, local177, local173, local169, local165);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "()V")
	@Override
	protected void method6870() {
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V")
	private void method3943() {
		if (this.aClass132_3 != null) {
			this.aClass132_3.aBoolean294 = false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4543; local7++) {
			if (this.aShortArray64[local7] == arg0) {
				this.aShortArray64[local7] = arg1;
			}
		}
		if (this.aClass299Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt4542; local38++) {
				@Pc(45) Class299 local45 = this.aClass299Array1[local38];
				@Pc(50) Class181 local50 = this.aClass181Array1[local38];
				local50.anInt5909 = local50.anInt5909 & 0xFF000000 | Static91.anIntArray99[this.aShortArray64[local45.anInt8674] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3943();
	}

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "()Z")
	@Override
	public boolean method6866() {
		if (this.aShortArray72 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray72.length; local12++) {
			if (this.aShortArray72[local12] != -1 && !this.aClass100_Sub1_11.anInterface4_12.method892(this.aShortArray72[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 > arg3 && arg2 > arg3 && arg3 < arg7) {
			return false;
		} else if (arg6 < arg3 && arg2 < arg3 && arg7 < arg3) {
			return false;
		} else if (arg0 < arg5 && arg4 > arg0 && arg1 > arg0) {
			return false;
		} else {
			return arg5 >= arg0 || arg4 >= arg0 || arg0 <= arg1;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IILclient!ql;ZII)Z")
	@Override
	public boolean method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class154 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3937(arg1, arg0, arg2, arg3, arg5, arg4);
	}

	@OriginalMember(owner = "client!ic", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class100_Sub1.anIntArray428[arg0];
		@Pc(13) int local13 = Class100_Sub1.anIntArray429[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4496; local15++) {
			local34 = local9 * this.anIntArray256[local15] + local13 * this.anIntArray255[local15] >> 14;
			this.anIntArray256[local15] = local13 * this.anIntArray256[local15] - this.anIntArray255[local15] * local9 >> 14;
			this.anIntArray255[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt4520; local34++) {
			@Pc(85) int local85 = this.aShortArray68[local34] * local9 + this.aShortArray62[local34] * local13 >> 14;
			this.aShortArray68[local34] = (short) (local13 * this.aShortArray68[local34] - local9 * this.aShortArray62[local34] >> 14);
			this.aShortArray62[local34] = (short) local85;
		}
		this.method3945();
		this.method3941();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
	private void method3945() {
		if (this.aClass132_2 != null) {
			this.aClass132_2.aBoolean294 = false;
		}
	}

	@OriginalMember(owner = "client!ic", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4525;
	}

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "(I[IIIIZI[I)V")
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
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			local24 = 0;
			Static557.anInt9471 = 0;
			Static334.anInt6351 = 0;
			Static86.anInt2081 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray17.length) {
					local48 = this.anIntArrayArray17[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local56]) != 0) {
							Static557.anInt9471 += this.anIntArray255[local56];
							Static334.anInt6351 += this.anIntArray259[local56];
							local24++;
							Static86.anInt2081 += this.anIntArray256[local56];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static557.anInt9471 = arg2;
				Static334.anInt6351 = arg3;
				Static86.anInt2081 = arg4;
			} else {
				Static565.aBoolean660 = true;
				Static334.anInt6351 = Static334.anInt6351 / local24 + arg3;
				Static86.anInt2081 = arg4 + Static86.anInt2081 / local24;
				Static557.anInt9471 = Static557.anInt9471 / local24 + arg2;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg2 * arg7[0] + arg3 * arg7[1] + arg4 * arg7[2] + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg7[4] * arg3 + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg3 = local32;
				arg2 = local24;
			}
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray17.length) {
					local249 = this.anIntArrayArray17[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local50 = local249[local251];
						if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local50]) != 0) {
							this.anIntArray255[local50] += arg2;
							this.anIntArray259[local50] += arg3;
							this.anIntArray256[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(372) int local372;
		@Pc(394) int local394;
		@Pc(417) int local417;
		@Pc(452) int local452;
		@Pc(456) int local456;
		@Pc(460) int local460;
		@Pc(464) int local464;
		@Pc(472) int local472;
		@Pc(480) int local480;
		@Pc(633) int local633;
		@Pc(659) int local659;
		@Pc(663) int local663;
		@Pc(672) int local672;
		@Pc(677) int local677;
		@Pc(681) int local681;
		@Pc(685) int local685;
		@Pc(687) int local687;
		@Pc(817) int[] local817;
		@Pc(819) int local819;
		@Pc(823) int local823;
		@Pc(827) int local827;
		@Pc(829) int local829;
		@Pc(955) int local955;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray17.length > local32) {
						local249 = this.anIntArrayArray17[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local50 = local249[local251];
							if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local50]) != 0) {
								this.anIntArray255[local50] -= Static557.anInt9471;
								this.anIntArray259[local50] -= Static334.anInt6351;
								this.anIntArray256[local50] -= Static86.anInt2081;
								if (arg4 != 0) {
									local56 = Class100_Sub1.anIntArray428[arg4];
									local372 = Class100_Sub1.anIntArray429[arg4];
									local394 = this.anIntArray259[local50] * local56 + local372 * this.anIntArray255[local50] + 16383 >> 14;
									this.anIntArray259[local50] = local372 * this.anIntArray259[local50] + 16383 - local56 * this.anIntArray255[local50] >> 14;
									this.anIntArray255[local50] = local394;
								}
								if (arg2 != 0) {
									local56 = Class100_Sub1.anIntArray428[arg2];
									local372 = Class100_Sub1.anIntArray429[arg2];
									local394 = this.anIntArray259[local50] * local372 + 16383 - local56 * this.anIntArray256[local50] >> 14;
									this.anIntArray256[local50] = local372 * this.anIntArray256[local50] + this.anIntArray259[local50] * local56 + 16383 >> 14;
									this.anIntArray259[local50] = local394;
								}
								if (arg3 != 0) {
									local56 = Class100_Sub1.anIntArray428[arg3];
									local372 = Class100_Sub1.anIntArray429[arg3];
									local394 = this.anIntArray256[local50] * local56 + this.anIntArray255[local50] * local372 + 16383 >> 14;
									this.anIntArray256[local50] = this.anIntArray256[local50] * local372 + 16383 - this.anIntArray255[local50] * local56 >> 14;
									this.anIntArray255[local50] = local394;
								}
								this.anIntArray255[local50] += Static557.anInt9471;
								this.anIntArray259[local50] += Static334.anInt6351;
								this.anIntArray256[local50] += Static86.anInt2081;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray17.length) {
							local48 = this.anIntArrayArray17[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray66 == null || (this.aShortArray66[local56] & arg6) != 0) {
									local372 = this.anIntArray257[local56];
									local394 = this.anIntArray257[local56 + 1];
									for (local417 = local372; local417 < local394; local417++) {
										local452 = this.aShortArray60[local417] - 1;
										if (local452 == -1) {
											break;
										}
										if (arg4 != 0) {
											local456 = Class100_Sub1.anIntArray428[arg4];
											local460 = Class100_Sub1.anIntArray429[arg4];
											local464 = local456 * this.aShortArray69[local452] + this.aShortArray62[local452] * local460 + 16383 >> 14;
											this.aShortArray69[local452] = (short) (local460 * this.aShortArray69[local452] + 16383 - local456 * this.aShortArray62[local452] >> 14);
											this.aShortArray62[local452] = (short) local464;
										}
										if (arg2 != 0) {
											local456 = Class100_Sub1.anIntArray428[arg2];
											local460 = Class100_Sub1.anIntArray429[arg2];
											local464 = this.aShortArray69[local452] * local460 + 16383 - this.aShortArray68[local452] * local456 >> 14;
											this.aShortArray68[local452] = (short) (this.aShortArray69[local452] * local456 + local460 * this.aShortArray68[local452] + 16383 >> 14);
											this.aShortArray69[local452] = (short) local464;
										}
										if (arg3 != 0) {
											local456 = Class100_Sub1.anIntArray428[arg3];
											local460 = Class100_Sub1.anIntArray429[arg3];
											local464 = local460 * this.aShortArray62[local452] + this.aShortArray68[local452] * local456 + 16383 >> 14;
											this.aShortArray68[local452] = (short) (this.aShortArray68[local452] * local460 + 16383 - local456 * this.aShortArray62[local452] >> 14);
											this.aShortArray62[local452] = (short) local464;
										}
									}
								}
							}
						}
					}
					this.method3941();
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static565.aBoolean660) {
					local372 = arg7[6] * Static86.anInt2081 + arg7[3] * Static334.anInt6351 + Static557.anInt9471 * arg7[0] + 8192 >> 14;
					local394 = Static86.anInt2081 * arg7[7] + arg7[4] * Static334.anInt6351 + Static557.anInt9471 * arg7[1] + 8192 >> 14;
					local417 = Static86.anInt2081 * arg7[8] + Static557.anInt9471 * arg7[2] + arg7[5] * Static334.anInt6351 + 8192 >> 14;
					local372 += local251;
					local394 += local50;
					local417 += local56;
					Static557.anInt9471 = local372;
					Static334.anInt6351 = local394;
					Static86.anInt2081 = local417;
					Static565.aBoolean660 = false;
				}
				@Pc(440) int[] local440 = new int[9];
				local394 = Class100_Sub1.anIntArray429[arg2];
				local417 = Class100_Sub1.anIntArray428[arg2];
				local452 = Class100_Sub1.anIntArray429[arg3];
				local456 = Class100_Sub1.anIntArray428[arg3];
				local460 = Class100_Sub1.anIntArray429[arg4];
				local464 = Class100_Sub1.anIntArray428[arg4];
				local472 = local417 * local460 + 8192 >> 14;
				local480 = local417 * local464 + 8192 >> 14;
				local440[3] = local464 * local394 + 8192 >> 14;
				local440[7] = local452 * local472 + local464 * local456 + 8192 >> 14;
				local440[2] = local456 * local394 + 8192 >> 14;
				local440[5] = -local417;
				local440[6] = local460 * -local456 + local480 * local452 + 8192 >> 14;
				local440[0] = local480 * local456 + local452 * local460 + 8192 >> 14;
				local440[1] = local472 * local456 + -local452 * local464 + 8192 >> 14;
				local440[4] = local460 * local394 + 8192 >> 14;
				local440[8] = local394 * local452 + 8192 >> 14;
				@Pc(608) int local608 = -Static86.anInt2081 * local440[2] + -Static334.anInt6351 * local440[1] + local440[0] * -Static557.anInt9471 + 8192 >> 14;
				local633 = local440[4] * -Static334.anInt6351 + local440[3] * -Static557.anInt9471 + -Static86.anInt2081 * local440[5] + 8192 >> 14;
				local659 = local440[7] * -Static334.anInt6351 + local440[6] * -Static557.anInt9471 + -Static86.anInt2081 * local440[8] + 8192 >> 14;
				local663 = local608 + Static557.anInt9471;
				@Pc(667) int local667 = local633 + Static334.anInt6351;
				local672 = local659 + Static86.anInt2081;
				@Pc(675) int[] local675 = new int[9];
				for (local677 = 0; local677 < 3; local677++) {
					for (local681 = 0; local681 < 3; local681++) {
						local685 = 0;
						for (local687 = 0; local687 < 3; local687++) {
							local685 += arg7[local687 + local681 * 3] * local440[local677 * 3 + local687];
						}
						local675[local677 * 3 + local681] = local685 + 8192 >> 14;
					}
				}
				local681 = local440[0] * local251 + local50 * local440[1] + local56 * local440[2] + 8192 >> 14;
				local685 = local440[3] * local251 + local440[4] * local50 + local440[5] * local56 + 8192 >> 14;
				local681 += local663;
				local685 += local667;
				local687 = local251 * local440[6] + local440[7] * local50 + local56 * local440[8] + 8192 >> 14;
				local687 += local672;
				local817 = new int[9];
				for (local819 = 0; local819 < 3; local819++) {
					for (local823 = 0; local823 < 3; local823++) {
						local827 = 0;
						for (local829 = 0; local829 < 3; local829++) {
							local827 += arg7[local819 * 3 + local829] * local675[local823 + local829 * 3];
						}
						local817[local823 + local819 * 3] = local827 + 8192 >> 14;
					}
				}
				local823 = arg7[2] * local687 + local681 * arg7[0] + local685 * arg7[1] + 8192 >> 14;
				local827 = local685 * arg7[4] + local681 * arg7[3] + local687 * arg7[5] + 8192 >> 14;
				local827 += local32;
				local823 += local24;
				local829 = arg7[8] * local687 + arg7[6] * local681 + arg7[7] * local685 + 8192 >> 14;
				local829 += local38;
				for (local955 = 0; local955 < local8; local955++) {
					@Pc(961) int local961 = arg1[local955];
					if (local961 < this.anIntArrayArray17.length) {
						@Pc(975) int[] local975 = this.anIntArrayArray17[local961];
						for (@Pc(977) int local977 = 0; local977 < local975.length; local977++) {
							@Pc(983) int local983 = local975[local977];
							if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local983]) != 0) {
								@Pc(1027) int local1027 = this.anIntArray259[local983] * local817[1] + this.anIntArray255[local983] * local817[0] + this.anIntArray256[local983] * local817[2] + 8192 >> 14;
								@Pc(1059) int local1059 = local817[3] * this.anIntArray255[local983] + local817[4] * this.anIntArray259[local983] + this.anIntArray256[local983] * local817[5] + 8192 >> 14;
								@Pc(1063) int local1063 = local1027 + local823;
								@Pc(1095) int local1095 = this.anIntArray256[local983] * local817[8] + local817[6] * this.anIntArray255[local983] + local817[7] * this.anIntArray259[local983] + 8192 >> 14;
								@Pc(1099) int local1099 = local1059 + local827;
								this.anIntArray255[local983] = local1063;
								@Pc(1108) int local1108 = local1095 + local829;
								this.anIntArray259[local983] = local1099;
								this.anIntArray256[local983] = local1108;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2573) Class181 local2573;
			@Pc(2461) boolean local2461;
			@Pc(2568) Class299 local2568;
			if (arg0 == 5) {
				if (this.anIntArrayArray16 != null) {
					local2461 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray16.length > local38) {
							local48 = this.anIntArrayArray16[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray63 == null || (arg6 & this.aShortArray63[local56]) != 0) {
									local372 = (this.aByteArray52[local56] & 0xFF) + (arg2 * 8);
									if (local372 < 0) {
										local372 = 0;
									} else if (local372 > 255) {
										local372 = 255;
									}
									this.aByteArray52[local56] = (byte) local372;
								}
							}
							local2461 |= local48.length > 0;
						}
					}
					if (local2461) {
						if (this.aClass299Array1 != null) {
							for (local38 = 0; local38 < this.anInt4542; local38++) {
								local2568 = this.aClass299Array1[local38];
								local2573 = this.aClass181Array1[local38];
								local2573.anInt5909 = local2573.anInt5909 & 0xFFFFFF | 255 - (this.aByteArray52[local2568.anInt8674] & 0xFF) << 24;
							}
						}
						this.method3943();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray16 != null) {
					local2461 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray16.length) {
							local48 = this.anIntArrayArray16[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray63 == null || (this.aShortArray63[local56] & arg6) != 0) {
									local372 = this.aShortArray64[local56] & 0xFFFF;
									local394 = local372 >> 10 & 0x3F;
									local417 = local372 >> 7 & 0x7;
									@Pc(2677) int local2677 = local394 + arg2 & 0x3F;
									local417 += arg3 / 4;
									local452 = local372 & 0x7F;
									local452 += arg4;
									if (local417 < 0) {
										local417 = 0;
									} else if (local417 > 7) {
										local417 = 7;
									}
									if (local452 < 0) {
										local452 = 0;
									} else if (local452 > 127) {
										local452 = 127;
									}
									this.aShortArray64[local56] = (short) (local417 << 7 | local2677 << 10 | local452);
								}
							}
							local2461 |= local48.length > 0;
						}
					}
					if (local2461) {
						if (this.aClass299Array1 != null) {
							for (local38 = 0; local38 < this.anInt4542; local38++) {
								local2568 = this.aClass299Array1[local38];
								local2573 = this.aClass181Array1[local38];
								local2573.anInt5909 = Static91.anIntArray99[this.aShortArray64[local2568.anInt8674] & 0xFFFF] & 0xFFFFFF | local2573.anInt5909 & 0xFF000000;
							}
						}
						this.method3943();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray15 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray15.length) {
							local249 = this.anIntArrayArray15[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2573 = this.aClass181Array1[local249[local251]];
								local2573.anInt5908 += arg2;
								local2573.anInt5914 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray15 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray15.length > local32) {
							local249 = this.anIntArrayArray15[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2573 = this.aClass181Array1[local249[local251]];
								local2573.anInt5911 = arg2 * local2573.anInt5911 >> 7;
								local2573.anInt5907 = arg3 * local2573.anInt5907 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray15 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray15.length > local32) {
						local249 = this.anIntArrayArray15[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local2573 = this.aClass181Array1[local249[local251]];
							local2573.anInt5913 = arg2 + local2573.anInt5913 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray17.length > local32) {
					local249 = this.anIntArrayArray17[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local50 = local249[local251];
						if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local50]) != 0) {
							this.anIntArray255[local50] -= Static557.anInt9471;
							this.anIntArray259[local50] -= Static334.anInt6351;
							this.anIntArray256[local50] -= Static86.anInt2081;
							this.anIntArray255[local50] = this.anIntArray255[local50] * arg2 >> 7;
							this.anIntArray259[local50] = arg3 * this.anIntArray259[local50] >> 7;
							this.anIntArray256[local50] = this.anIntArray256[local50] * arg4 >> 7;
							this.anIntArray255[local50] += Static557.anInt9471;
							this.anIntArray259[local50] += Static334.anInt6351;
							this.anIntArray256[local50] += Static86.anInt2081;
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
			if (Static565.aBoolean660) {
				local372 = arg7[6] * Static86.anInt2081 + Static557.anInt9471 * arg7[0] + arg7[3] * Static334.anInt6351 + 8192 >> 14;
				local394 = Static86.anInt2081 * arg7[7] + Static334.anInt6351 * arg7[4] + Static557.anInt9471 * arg7[1] + 8192 >> 14;
				local394 += local50;
				local372 += local251;
				local417 = arg7[8] * Static86.anInt2081 + Static334.anInt6351 * arg7[5] + Static557.anInt9471 * arg7[2] + 8192 >> 14;
				Static557.anInt9471 = local372;
				local417 += local56;
				Static334.anInt6351 = local394;
				Static86.anInt2081 = local417;
				Static565.aBoolean660 = false;
			}
			local372 = arg2 << 15 >> 7;
			local394 = arg3 << 15 >> 7;
			local417 = arg4 << 15 >> 7;
			local452 = -Static557.anInt9471 * local372 + 8192 >> 14;
			local456 = local394 * -Static334.anInt6351 + 8192 >> 14;
			local460 = -Static86.anInt2081 * local417 + 8192 >> 14;
			local464 = Static557.anInt9471 + local452;
			local472 = local456 + Static334.anInt6351;
			local480 = Static86.anInt2081 + local460;
			@Pc(1862) int[] local1862 = new int[] { local372 * arg7[0] + 8192 >> 14, local372 * arg7[3] + 8192 >> 14, arg7[6] * local372 + 8192 >> 14, arg7[1] * local394 + 8192 >> 14, local394 * arg7[4] + 8192 >> 14, local394 * arg7[7] + 8192 >> 14, local417 * arg7[2] + 8192 >> 14, arg7[5] * local417 + 8192 >> 14, local417 * arg7[8] + 8192 >> 14 };
			local633 = local372 * local251 + 8192 >> 14;
			local659 = local50 * local394 + 8192 >> 14;
			local663 = local56 * local417 + 8192 >> 14;
			@Pc(1998) int local1998 = local659 + local472;
			@Pc(2002) int local2002 = local633 + local464;
			@Pc(2006) int local2006 = local663 + local480;
			@Pc(2009) int[] local2009 = new int[9];
			@Pc(2015) int local2015;
			for (local672 = 0; local672 < 3; local672++) {
				for (local2015 = 0; local2015 < 3; local2015++) {
					local677 = 0;
					for (local681 = 0; local681 < 3; local681++) {
						local677 += local1862[local681 * 3 + local2015] * arg7[local681 + local672 * 3];
					}
					local2009[local672 * 3 + local2015] = local677 + 8192 >> 14;
				}
			}
			local2015 = local2006 * arg7[2] + arg7[0] * local2002 + local1998 * arg7[1] + 8192 >> 14;
			local677 = arg7[5] * local2006 + arg7[4] * local1998 + arg7[3] * local2002 + 8192 >> 14;
			local677 += local32;
			local681 = arg7[7] * local1998 + local2002 * arg7[6] + local2006 * arg7[8] + 8192 >> 14;
			local2015 += local24;
			local681 += local38;
			for (local685 = 0; local685 < local8; local685++) {
				local687 = arg1[local685];
				if (this.anIntArrayArray17.length > local687) {
					local817 = this.anIntArrayArray17[local687];
					for (local819 = 0; local819 < local817.length; local819++) {
						local823 = local817[local819];
						if (this.aShortArray66 == null || (arg6 & this.aShortArray66[local823]) != 0) {
							local827 = local2009[1] * this.anIntArray259[local823] + local2009[0] * this.anIntArray255[local823] + local2009[2] * this.anIntArray256[local823] + 8192 >> 14;
							local829 = local2009[5] * this.anIntArray256[local823] + local2009[3] * this.anIntArray255[local823] + local2009[4] * this.anIntArray259[local823] + 8192 >> 14;
							@Pc(2252) int local2252 = local827 + local2015;
							@Pc(2256) int local2256 = local829 + local677;
							local955 = this.anIntArray259[local823] * local2009[7] + local2009[6] * this.anIntArray255[local823] + local2009[8] * this.anIntArray256[local823] + 8192 >> 14;
							@Pc(2292) int local2292 = local955 + local681;
							this.anIntArray255[local823] = local2252;
							this.anIntArray259[local823] = local2256;
							this.anIntArray256[local823] = local2292;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean322;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "()V")
	@Override
	public void method6859() {
		if (this.anInt4520 > 0 && this.anInt4488 > 0) {
			this.method3948();
			this.method3936();
			this.method3939();
		}
	}

	@OriginalMember(owner = "client!ic", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort53;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(FIJFIIIIIILclient!dh;)S")
	private short method3946(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class64 arg9) {
		@Pc(10) int local10 = this.anIntArray257[arg4];
		@Pc(17) int local17 = this.anIntArray257[arg4 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray60[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static135.aLongArray1[local21] == arg2) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray60[local19] = (short) (this.anInt4520 + 1);
		Static135.aLongArray1[local19] = arg2;
		this.aShortArray71[this.anInt4520] = (short) arg7;
		this.aShortArray70[this.anInt4520] = (short) arg4;
		this.aShortArray62[this.anInt4520] = (short) arg8;
		this.aShortArray69[this.anInt4520] = (short) arg1;
		this.aShortArray68[this.anInt4520] = (short) arg5;
		this.aByteArray51[this.anInt4520] = (byte) arg6;
		this.aFloatArray42[this.anInt4520] = arg0;
		this.aFloatArray43[this.anInt4520] = arg3;
		return (short) this.anInt4520++;
	}

	@OriginalMember(owner = "client!ic", name = "g", descriptor = "(I)V")
	private void method3947() {
		if (this.anInt4488 == 0) {
			return;
		}
		if (this.method3948() && this.method3936()) {
			this.aClass100_Sub1_11.method6128(0, this.aClass132_2.anInterface17_10);
			this.aClass100_Sub1_11.method6128(1, this.aClass132_3.anInterface17_10);
			this.aClass100_Sub1_11.method6128(2, this.aClass132_1.anInterface17_10);
			@Pc(51) boolean local51;
			if ((this.anInt4545 & 0x37) == 0) {
				local51 = false;
				this.aClass100_Sub1_11.method6075(false);
				this.aClass100_Sub1_11.method6107(this.aClass100_Sub1_11.aClass293_19);
			} else {
				local51 = true;
				this.aClass100_Sub1_11.method6075(true);
				this.aClass100_Sub1_11.method6128(3, this.aClass132_4.anInterface17_10);
				this.aClass100_Sub1_11.method6107(this.aClass100_Sub1_11.aClass293_17);
			}
			for (@Pc(91) int local91 = 0; local91 < this.anIntArray260.length; local91++) {
				@Pc(98) int local98 = this.anIntArray258[local91];
				@Pc(105) int local105 = this.anIntArray258[local91 + 1];
				@Pc(112) int local112 = this.aShortArray72[local98] & 0xFFFF;
				if (local112 == 65535) {
					local112 = -1;
				}
				this.aClass100_Sub1_11.method6137(true, local51, local112);
				this.aClass100_Sub1_11.method6064(local105 - local98, local98 * 3, this.anIntArray254[local91], this.anIntArray260[local91], this.aClass205_1.anInterface11_6, Static295.aClass77_2);
			}
		}
		this.method3939();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ql;Lclient!eda;II)V")
	@Override
	public void method6845(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4520 == 0) {
			return;
		}
		@Pc(13) Class154_Sub2 local13 = this.aClass100_Sub1_11.aClass154_Sub2_16;
		if (!this.aBoolean321) {
			this.method3934();
		}
		@Pc(22) Class154_Sub2 local22 = (Class154_Sub2) arg0;
		Static15.aFloat114 = local13.aFloat97 * local22.aFloat96 + local13.aFloat105 * local22.aFloat104 + local13.aFloat102 * local22.aFloat94 + local13.aFloat94;
		Static234.aFloat77 = local22.aFloat97 * local13.aFloat102 + local22.aFloat95 * local13.aFloat105 + local13.aFloat97 * local22.aFloat100;
		@Pc(69) float local69 = Static15.aFloat114 + Static234.aFloat77 * (float) this.anInt4501;
		@Pc(77) float local77 = (float) this.anInt4532 * Static234.aFloat77 + Static15.aFloat114;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local69 > local77) {
			local88 = (float) -this.anInt4527 + local77;
			local94 = local69 + (float) this.anInt4527;
		} else {
			local88 = (float) -this.anInt4527 + local69;
			local94 = local77 + (float) this.anInt4527;
		}
		if (this.aClass100_Sub1_11.aFloat124 <= local88 || local94 <= (float) this.aClass100_Sub1_11.anInt7142) {
			return;
		}
		Static53.aFloat17 = local13.aFloat104 + local22.aFloat94 * local13.aFloat99 + local22.aFloat104 * local13.aFloat98 + local13.aFloat95 * local22.aFloat96;
		Static568.aFloat192 = local22.aFloat97 * local13.aFloat99 + local13.aFloat95 * local22.aFloat100 + local22.aFloat95 * local13.aFloat98;
		@Pc(171) float local171 = (float) this.anInt4501 * Static568.aFloat192 + Static53.aFloat17;
		@Pc(179) float local179 = Static53.aFloat17 + (float) this.anInt4532 * Static568.aFloat192;
		@Pc(206) float local206;
		@Pc(194) float local194;
		if (local171 > local179) {
			local194 = (float) this.aClass100_Sub1_11.anInt7132 * (local171 + (float) this.anInt4527);
			local206 = (local179 - (float) this.anInt4527) * (float) this.aClass100_Sub1_11.anInt7132;
		} else {
			local194 = (local179 + (float) this.anInt4527) * (float) this.aClass100_Sub1_11.anInt7132;
			local206 = (float) this.aClass100_Sub1_11.anInt7132 * ((float) -this.anInt4527 + local171);
		}
		if (this.aClass100_Sub1_11.aFloat134 <= local206 / (float) arg2 || this.aClass100_Sub1_11.aFloat136 >= local194 / (float) arg2) {
			return;
		}
		Static317.aFloat117 = local22.aFloat94 * local13.aFloat103 + local22.aFloat96 * local13.aFloat100 + local22.aFloat104 * local13.aFloat101 + local13.aFloat96;
		Static408.aFloat146 = local22.aFloat97 * local13.aFloat103 + local13.aFloat100 * local22.aFloat100 + local22.aFloat95 * local13.aFloat101;
		@Pc(297) float local297 = Static317.aFloat117 + (float) this.anInt4501 * Static408.aFloat146;
		@Pc(305) float local305 = Static317.aFloat117 + Static408.aFloat146 * (float) this.anInt4532;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local297 > local305) {
			local332 = (float) this.aClass100_Sub1_11.anInt7129 * ((float) this.anInt4527 + local297);
			local321 = (local305 - (float) this.anInt4527) * (float) this.aClass100_Sub1_11.anInt7129;
		} else {
			local321 = ((float) -this.anInt4527 + local297) * (float) this.aClass100_Sub1_11.anInt7129;
			local332 = (float) this.aClass100_Sub1_11.anInt7129 * ((float) this.anInt4527 + local305);
		}
		if (local321 / (float) arg2 >= this.aClass100_Sub1_11.aFloat133 || local332 / (float) arg2 <= this.aClass100_Sub1_11.aFloat125) {
			return;
		}
		if (arg1 != null || this.aClass299Array1 != null) {
			Static214.aFloat71 = local13.aFloat102 * local22.aFloat102 + local13.aFloat97 * local22.aFloat103 + local13.aFloat105 * local22.aFloat99;
			Static553.aFloat189 = local22.aFloat102 * local13.aFloat103 + local13.aFloat101 * local22.aFloat99 + local22.aFloat103 * local13.aFloat100;
			Static306.aFloat115 = local13.aFloat105 * local22.aFloat98 + local13.aFloat97 * local22.aFloat101 + local13.aFloat102 * local22.aFloat105;
			Static447.aFloat166 = local22.aFloat105 * local13.aFloat99 + local13.aFloat98 * local22.aFloat98 + local22.aFloat101 * local13.aFloat95;
			Static5.aFloat2 = local13.aFloat103 * local22.aFloat105 + local13.aFloat100 * local22.aFloat101 + local13.aFloat101 * local22.aFloat98;
			Static473.aFloat178 = local13.aFloat95 * local22.aFloat103 + local13.aFloat98 * local22.aFloat99 + local22.aFloat102 * local13.aFloat99;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt4550 + this.anInt4556 >> 1;
			@Pc(509) int local509 = this.anInt4525 + this.anInt4517 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static473.aFloat178 + Static568.aFloat192 * (float) this.anInt4501 + Static447.aFloat166 * (float) local500 + Static53.aFloat17);
			@Pc(547) int local547 = (int) (Static408.aFloat146 * (float) this.anInt4501 + Static317.aFloat117 + (float) local500 * Static5.aFloat2 + (float) local509 * Static553.aFloat189);
			@Pc(566) int local566 = (int) (Static15.aFloat114 + (float) local500 * Static306.aFloat115 + (float) this.anInt4501 * Static234.aFloat77 + (float) local509 * Static214.aFloat71);
			@Pc(585) int local585 = (int) (Static53.aFloat17 + Static447.aFloat166 * (float) local500 + Static568.aFloat192 * (float) this.anInt4532 + Static473.aFloat178 * (float) local509);
			@Pc(604) int local604 = (int) ((float) local500 * Static5.aFloat2 + Static317.aFloat117 + Static408.aFloat146 * (float) this.anInt4532 + Static553.aFloat189 * (float) local509);
			@Pc(623) int local623 = (int) (Static214.aFloat71 * (float) local509 + (float) this.anInt4532 * Static234.aFloat77 + Static15.aFloat114 + Static306.aFloat115 * (float) local500);
			arg1.anInt2371 = this.aClass100_Sub1_11.bf + this.aClass100_Sub1_11.anInt7129 * local604 / arg2;
			arg1.anInt2369 = this.aClass100_Sub1_11.anInt7133 + local528 * this.aClass100_Sub1_11.anInt7132 / arg2;
			arg1.anInt2370 = local585 * this.aClass100_Sub1_11.anInt7132 / arg2 + this.aClass100_Sub1_11.anInt7133;
			arg1.anInt2368 = this.aClass100_Sub1_11.bf + local547 * this.aClass100_Sub1_11.anInt7129 / arg2;
			if (local566 >= this.aClass100_Sub1_11.anInt7142 || this.aClass100_Sub1_11.anInt7142 <= local623) {
				arg1.aBoolean175 = true;
				arg1.anInt2367 = this.aClass100_Sub1_11.anInt7132 * (this.anInt4527 + local528) / arg2 + this.aClass100_Sub1_11.anInt7133 - arg1.anInt2369;
			}
		}
		this.aClass100_Sub1_11.method6032((float) arg2);
		this.aClass100_Sub1_11.method6121();
		this.aClass100_Sub1_11.method6067(local22);
		this.method3947();
		this.method3938();
	}

	@OriginalMember(owner = "client!ic", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4533;
	}

	@OriginalMember(owner = "client!ic", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4496; local3++) {
			this.anIntArray256[local3] = -this.anIntArray256[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt4520; local25++) {
			this.aShortArray68[local25] = (short) -this.aShortArray68[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt4543; local44++) {
			@Pc(51) short local51 = this.aShortArray61[local44];
			this.aShortArray61[local44] = this.aShortArray67[local44];
			this.aShortArray67[local44] = local51;
		}
		this.method3945();
		this.method3941();
		this.method3940();
		this.aBoolean321 = false;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ql;Lclient!eda;I)V")
	@Override
	public void method6862(@OriginalArg(0) Class154 arg0, @OriginalArg(1) Class20_Sub4 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4520 == 0) {
			return;
		}
		@Pc(16) Class154_Sub2 local16 = this.aClass100_Sub1_11.aClass154_Sub2_16;
		if (!this.aBoolean321) {
			this.method3934();
		}
		@Pc(25) Class154_Sub2 local25 = (Class154_Sub2) arg0;
		Static234.aFloat77 = local16.aFloat97 * local25.aFloat100 + local25.aFloat95 * local16.aFloat105 + local16.aFloat102 * local25.aFloat97;
		Static15.aFloat114 = local16.aFloat94 + local25.aFloat94 * local16.aFloat102 + local16.aFloat105 * local25.aFloat104 + local25.aFloat96 * local16.aFloat97;
		@Pc(72) float local72 = Static15.aFloat114 + (float) this.anInt4501 * Static234.aFloat77;
		@Pc(80) float local80 = (float) this.anInt4532 * Static234.aFloat77 + Static15.aFloat114;
		@Pc(97) float local97;
		@Pc(90) float local90;
		if (local72 > local80) {
			local90 = (float) this.anInt4527 + local72;
			local97 = (float) -this.anInt4527 + local80;
		} else {
			local90 = (float) this.anInt4527 + local80;
			local97 = (float) -this.anInt4527 + local72;
		}
		if (local97 >= this.aClass100_Sub1_11.aFloat131 || local90 <= (float) this.aClass100_Sub1_11.anInt7142) {
			return;
		}
		Static53.aFloat17 = local16.aFloat104 + local25.aFloat94 * local16.aFloat99 + local25.aFloat104 * local16.aFloat98 + local25.aFloat96 * local16.aFloat95;
		Static568.aFloat192 = local16.aFloat98 * local25.aFloat95 + local25.aFloat100 * local16.aFloat95 + local25.aFloat97 * local16.aFloat99;
		@Pc(174) float local174 = (float) this.anInt4501 * Static568.aFloat192 + Static53.aFloat17;
		@Pc(182) float local182 = Static53.aFloat17 + Static568.aFloat192 * (float) this.anInt4532;
		@Pc(198) float local198;
		@Pc(209) float local209;
		if (local174 > local182) {
			local198 = (float) this.aClass100_Sub1_11.anInt7132 * ((float) -this.anInt4527 + local182);
			local209 = (local174 + (float) this.anInt4527) * (float) this.aClass100_Sub1_11.anInt7132;
		} else {
			local209 = (float) this.aClass100_Sub1_11.anInt7132 * ((float) this.anInt4527 + local182);
			local198 = (float) this.aClass100_Sub1_11.anInt7132 * (local174 - (float) this.anInt4527);
		}
		if (this.aClass100_Sub1_11.aFloat134 <= local198 / local90 || this.aClass100_Sub1_11.aFloat136 >= local209 / local90) {
			return;
		}
		Static408.aFloat146 = local25.aFloat97 * local16.aFloat103 + local16.aFloat100 * local25.aFloat100 + local16.aFloat101 * local25.aFloat95;
		Static317.aFloat117 = local16.aFloat96 + local25.aFloat96 * local16.aFloat100 + local16.aFloat101 * local25.aFloat104 + local16.aFloat103 * local25.aFloat94;
		@Pc(298) float local298 = (float) this.anInt4501 * Static408.aFloat146 + Static317.aFloat117;
		@Pc(306) float local306 = Static408.aFloat146 * (float) this.anInt4532 + Static317.aFloat117;
		@Pc(332) float local332;
		@Pc(321) float local321;
		if (local298 > local306) {
			local321 = ((float) this.anInt4527 + local298) * (float) this.aClass100_Sub1_11.anInt7129;
			local332 = (float) this.aClass100_Sub1_11.anInt7129 * (local306 - (float) this.anInt4527);
		} else {
			local332 = ((float) -this.anInt4527 + local298) * (float) this.aClass100_Sub1_11.anInt7129;
			local321 = (float) this.aClass100_Sub1_11.anInt7129 * (local306 + (float) this.anInt4527);
		}
		if (local332 / local90 >= this.aClass100_Sub1_11.aFloat133 || this.aClass100_Sub1_11.aFloat125 >= local321 / local90) {
			return;
		}
		if (arg1 != null || this.aClass299Array1 != null) {
			Static447.aFloat166 = local25.aFloat98 * local16.aFloat98 + local25.aFloat101 * local16.aFloat95 + local16.aFloat99 * local25.aFloat105;
			Static553.aFloat189 = local16.aFloat103 * local25.aFloat102 + local16.aFloat101 * local25.aFloat99 + local25.aFloat103 * local16.aFloat100;
			Static473.aFloat178 = local16.aFloat99 * local25.aFloat102 + local16.aFloat98 * local25.aFloat99 + local25.aFloat103 * local16.aFloat95;
			Static5.aFloat2 = local25.aFloat101 * local16.aFloat100 + local16.aFloat101 * local25.aFloat98 + local25.aFloat105 * local16.aFloat103;
			Static214.aFloat71 = local16.aFloat102 * local25.aFloat102 + local16.aFloat105 * local25.aFloat99 + local25.aFloat103 * local16.aFloat97;
			Static306.aFloat115 = local16.aFloat105 * local25.aFloat98 + local16.aFloat97 * local25.aFloat101 + local25.aFloat105 * local16.aFloat102;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(503) int local503 = this.anInt4550 + this.anInt4556 >> 1;
			@Pc(512) int local512 = this.anInt4525 + this.anInt4517 >> 1;
			@Pc(531) int local531 = (int) (Static473.aFloat178 * (float) local512 + Static568.aFloat192 * (float) this.anInt4501 + Static53.aFloat17 + (float) local503 * Static447.aFloat166);
			@Pc(550) int local550 = (int) (Static317.aFloat117 + Static5.aFloat2 * (float) local503 + (float) this.anInt4501 * Static408.aFloat146 + (float) local512 * Static553.aFloat189);
			@Pc(569) int local569 = (int) (Static214.aFloat71 * (float) local512 + Static15.aFloat114 + Static306.aFloat115 * (float) local503 + Static234.aFloat77 * (float) this.anInt4501);
			if (local569 < this.aClass100_Sub1_11.anInt7142) {
				local492 = true;
			} else {
				arg1.anInt2369 = local531 * this.aClass100_Sub1_11.anInt7132 / local569 + this.aClass100_Sub1_11.anInt7133;
				arg1.anInt2368 = this.aClass100_Sub1_11.bf + local550 * this.aClass100_Sub1_11.anInt7129 / local569;
			}
			@Pc(627) int local627 = (int) ((float) this.anInt4532 * Static568.aFloat192 + Static53.aFloat17 + Static447.aFloat166 * (float) local503 + (float) local512 * Static473.aFloat178);
			@Pc(646) int local646 = (int) ((float) local512 * Static553.aFloat189 + (float) local503 * Static5.aFloat2 + Static317.aFloat117 + Static408.aFloat146 * (float) this.anInt4532);
			@Pc(665) int local665 = (int) ((float) local512 * Static214.aFloat71 + (float) this.anInt4532 * Static234.aFloat77 + Static306.aFloat115 * (float) local503 + Static15.aFloat114);
			if (local665 < this.aClass100_Sub1_11.anInt7142) {
				local492 = true;
			} else {
				arg1.anInt2370 = this.aClass100_Sub1_11.anInt7132 * local627 / local665 + this.aClass100_Sub1_11.anInt7133;
				arg1.anInt2371 = this.aClass100_Sub1_11.bf + local646 * this.aClass100_Sub1_11.anInt7129 / local665;
			}
			if (local492) {
				if (this.aClass100_Sub1_11.anInt7142 > local569 && local665 < this.aClass100_Sub1_11.anInt7142) {
					local494 = false;
				} else {
					@Pc(749) int local749;
					@Pc(760) int local760;
					@Pc(787) int local787;
					if (this.aClass100_Sub1_11.anInt7142 > local569) {
						local749 = (local665 - this.aClass100_Sub1_11.anInt7142 << 16) / (local665 - local569);
						local760 = ((local627 - local531) * local749 >> 16) + local627;
						arg1.anInt2369 = this.aClass100_Sub1_11.anInt7133 + local760 * this.aClass100_Sub1_11.anInt7132 / this.aClass100_Sub1_11.anInt7142;
						local787 = local646 + ((local646 - local550) * local749 >> 16);
						arg1.anInt2368 = this.aClass100_Sub1_11.anInt7129 * local787 / this.aClass100_Sub1_11.anInt7142 + this.aClass100_Sub1_11.bf;
					} else if (this.aClass100_Sub1_11.anInt7142 > local665) {
						local749 = (local569 - this.aClass100_Sub1_11.anInt7142 << 16) / (local569 - local665);
						local760 = local531 + ((local531 - local627) * local749 >> 16);
						local787 = local550 + ((local550 - local646) * local749 >> 16);
						arg1.anInt2369 = this.aClass100_Sub1_11.anInt7133 + local760 * this.aClass100_Sub1_11.anInt7132 / this.aClass100_Sub1_11.anInt7142;
						arg1.anInt2368 = this.aClass100_Sub1_11.bf + this.aClass100_Sub1_11.anInt7129 * local787 / this.aClass100_Sub1_11.anInt7142;
					}
				}
			}
			if (local494) {
				if (local569 > local665) {
					arg1.anInt2367 = this.aClass100_Sub1_11.anInt7133 + (local531 + this.anInt4527) * this.aClass100_Sub1_11.anInt7132 / local569 - arg1.anInt2369;
				} else {
					arg1.anInt2367 = (this.anInt4527 + local627) * this.aClass100_Sub1_11.anInt7132 / local665 + this.aClass100_Sub1_11.anInt7133 - arg1.anInt2370;
				}
				arg1.aBoolean175 = true;
			}
		}
		this.aClass100_Sub1_11.method6150();
		this.aClass100_Sub1_11.method6067(local25);
		this.method3947();
		this.method3938();
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)Z")
	private boolean method3948() {
		@Pc(17) boolean local17 = !this.aClass132_3.aBoolean294;
		@Pc(33) boolean local33 = (this.anInt4545 & 0x37) != 0 && !this.aClass132_4.aBoolean294;
		@Pc(41) boolean local41 = !this.aClass132_2.aBoolean294;
		@Pc(49) boolean local49 = !this.aClass132_1.aBoolean294;
		if (!local41 && !local17 && !local33 && !local49) {
			return true;
		}
		@Pc(61) boolean local61 = true;
		@Pc(80) Interface17 local80;
		@Pc(94) Buffer local94;
		if (local41) {
			if (this.aClass132_2.anInterface17_11 == null) {
				this.aClass132_2.anInterface17_11 = this.aClass100_Sub1_11.method6123(this.aBoolean319);
			}
			local80 = this.aClass132_2.anInterface17_11;
			local80.method8440(12, this.anInt4520 * 12);
			local94 = local80.method8438();
			if (local94 == null) {
				local61 = false;
			} else {
				this.aClass100_Sub1_11.aNativeInterface3.copyPositions(this.anIntArray255, this.anIntArray259, this.anIntArray256, this.aShortArray70, 0, 12, this.anInt4520, local94.getAddress());
				if (local80.method8439()) {
					this.aClass132_2.anInterface17_10 = local80;
					this.aClass132_2.aBoolean294 = true;
				} else {
					local61 = false;
				}
			}
		}
		@Pc(186) short[] local186;
		@Pc(192) short[] local192;
		@Pc(189) short[] local189;
		@Pc(183) byte[] local183;
		if (local17) {
			if (this.aClass132_3.anInterface17_11 == null) {
				this.aClass132_3.anInterface17_11 = this.aClass100_Sub1_11.method6123(this.aBoolean319);
			}
			local80 = this.aClass132_3.anInterface17_11;
			local80.method8440(4, this.anInt4520 * 4);
			local94 = local80.method8438();
			if (local94 == null) {
				local61 = false;
			} else {
				if ((this.anInt4545 & 0x37) == 0) {
					if (this.aClass378_1 == null) {
						local183 = this.aByteArray51;
						local186 = this.aShortArray62;
						local189 = this.aShortArray68;
						local192 = this.aShortArray69;
					} else {
						local192 = this.aClass378_1.aShortArray150;
						local189 = this.aClass378_1.aShortArray151;
						local186 = this.aClass378_1.aShortArray152;
						local183 = this.aClass378_1.aByteArray125;
					}
					this.aClass100_Sub1_11.aNativeInterface3.copyLighting(this.aShortArray64, this.aByteArray52, this.aShortArray72, local186, local192, local189, local183, this.aShort53, this.aShort54, this.aShortArray71, 0, 4, this.anInt4520, local94.getAddress());
				} else {
					this.aClass100_Sub1_11.aNativeInterface3.copyColours(this.aShortArray64, this.aByteArray52, this.aShortArray72, this.aShort53, this.aShortArray71, 0, 4, this.anInt4520, local94.getAddress());
				}
				if (local80.method8439()) {
					this.aClass132_3.aBoolean294 = true;
					this.aClass132_3.anInterface17_10 = local80;
				} else {
					local61 = false;
				}
			}
		}
		if (local33) {
			if (this.aClass132_4.anInterface17_11 == null) {
				this.aClass132_4.anInterface17_11 = this.aClass100_Sub1_11.method6123(this.aBoolean319);
			}
			local80 = this.aClass132_4.anInterface17_11;
			local80.method8440(12, this.anInt4520 * 12);
			local94 = local80.method8438();
			if (local94 == null) {
				local61 = false;
			} else {
				if (this.aClass378_1 == null) {
					local189 = this.aShortArray68;
					local192 = this.aShortArray69;
					local183 = this.aByteArray51;
					local186 = this.aShortArray62;
				} else {
					local186 = this.aClass378_1.aShortArray152;
					local192 = this.aClass378_1.aShortArray150;
					local183 = this.aClass378_1.aByteArray125;
					local189 = this.aClass378_1.aShortArray151;
				}
				this.aClass100_Sub1_11.aNativeInterface3.copyNormals(local186, local192, local189, local183, 3.0F / (float) this.aShort54, 3.0F / (float) (this.aShort54 / 2 + this.aShort54), 0, 12, this.anInt4520, local94.getAddress());
				if (local80.method8439()) {
					this.aClass132_4.anInterface17_10 = local80;
					this.aClass132_4.aBoolean294 = true;
				} else {
					local61 = false;
				}
			}
		}
		if (local49) {
			if (this.aClass132_1.anInterface17_11 == null) {
				this.aClass132_1.anInterface17_11 = this.aClass100_Sub1_11.method6123(this.aBoolean319);
			}
			local80 = this.aClass132_1.anInterface17_11;
			local80.method8440(8, this.anInt4520 * 8);
			local94 = local80.method8438();
			if (local94 == null) {
				local61 = false;
			} else {
				this.aClass100_Sub1_11.aNativeInterface3.copyTexCoords(this.aFloatArray42, this.aFloatArray43, 0, 8, this.anInt4520, local94.getAddress());
				if (local80.method8439()) {
					this.aClass132_1.aBoolean294 = true;
					this.aClass132_1.anInterface17_10 = local80;
				} else {
					local61 = false;
				}
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
	public void method3949() {
		if (this.aClass132_2 != null) {
			this.aClass132_2.method3606();
		}
		if (this.aClass132_1 != null) {
			this.aClass132_1.method3606();
		}
		if (this.aClass132_3 != null) {
			this.aClass132_3.method3606();
		}
		if (this.aClass132_4 != null) {
			this.aClass132_4.method3606();
		}
		if (this.aClass205_1 != null) {
			this.aClass205_1.method5560();
		}
	}

	@OriginalMember(owner = "client!ic", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4556;
	}

	@OriginalMember(owner = "client!ic", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean321) {
			this.method3934();
		}
		return this.anInt4527;
	}

	@OriginalMember(owner = "client!ic", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean320;
	}
}
