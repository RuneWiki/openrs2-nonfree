import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class153_Sub1 extends Class153 {

	@OriginalMember(owner = "client!hq", name = "D", descriptor = "Lclient!dda;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "Lclient!dda;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
	private int anInt4348;

	@OriginalMember(owner = "client!hq", name = "U", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!hq", name = "bb", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!hq", name = "eb", descriptor = "Lclient!gd;")
	private final Class65_Sub2 aClass65_Sub2_8;

	@OriginalMember(owner = "client!hq", name = "kb", descriptor = "I")
	private int anInt4360;

	@OriginalMember(owner = "client!hq", name = "ob", descriptor = "I")
	private int anInt4363;

	@OriginalMember(owner = "client!hq", name = "xb", descriptor = "I")
	private int anInt4367;

	@OriginalMember(owner = "client!hq", name = "Cb", descriptor = "I")
	private int anInt4370;

	@OriginalMember(owner = "client!hq", name = "Eb", descriptor = "Lclient!dda;")
	private Class78 aClass78_3;

	@OriginalMember(owner = "client!hq", name = "Gb", descriptor = "Lclient!dda;")
	private Class78 aClass78_4;

	@OriginalMember(owner = "client!hq", name = "Kb", descriptor = "I")
	private int anInt4375;

	@OriginalMember(owner = "client!hq", name = "Rb", descriptor = "Lclient!nm;")
	private Class253 aClass253_1;

	@OriginalMember(owner = "client!hq", name = "Tb", descriptor = "I")
	private int anInt4380;

	@OriginalMember(owner = "client!hq", name = "Xb", descriptor = "I")
	private int anInt4384;

	@OriginalMember(owner = "client!hq", name = "jc", descriptor = "I")
	private int anInt4393;

	@OriginalMember(owner = "client!hq", name = "kc", descriptor = "I")
	private int anInt4394;

	@OriginalMember(owner = "client!hq", name = "nc", descriptor = "I")
	private int anInt4396;

	@OriginalMember(owner = "client!hq", name = "xc", descriptor = "Z")
	private boolean aBoolean360;

	@OriginalMember(owner = "client!hq", name = "Nc", descriptor = "Lclient!hha;")
	private Class148 aClass148_1;

	@OriginalMember(owner = "client!hq", name = "pb", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!hq", name = "Mb", descriptor = "I")
	private int anInt4376;

	@OriginalMember(owner = "client!hq", name = "mb", descriptor = "I")
	private int anInt4361;

	@OriginalMember(owner = "client!hq", name = "Nb", descriptor = "Z")
	private boolean aBoolean359;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "Z")
	private boolean aBoolean356;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "[I")
	private int[] anIntArray224;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!hq", name = "jb", descriptor = "I")
	private int anInt4359;

	@OriginalMember(owner = "client!hq", name = "bc", descriptor = "I")
	private int anInt4387;

	@OriginalMember(owner = "client!hq", name = "Ab", descriptor = "[I")
	private int[] anIntArray226;

	@OriginalMember(owner = "client!hq", name = "cc", descriptor = "[S")
	private short[] aShortArray61;

	@OriginalMember(owner = "client!hq", name = "Lb", descriptor = "[Lclient!ld;")
	private Class209[] aClass209Array1;

	@OriginalMember(owner = "client!hq", name = "yb", descriptor = "[Lclient!sba;")
	private Class313[] aClass313Array1;

	@OriginalMember(owner = "client!hq", name = "Yb", descriptor = "I")
	private int anInt4385;

	@OriginalMember(owner = "client!hq", name = "B", descriptor = "[Lclient!kba;")
	private Class189[] aClass189Array1;

	@OriginalMember(owner = "client!hq", name = "P", descriptor = "[Lclient!gr;")
	private Class141[] aClass141Array1;

	@OriginalMember(owner = "client!hq", name = "M", descriptor = "[B")
	private byte[] aByteArray38;

	@OriginalMember(owner = "client!hq", name = "Jc", descriptor = "[F")
	private float[] aFloatArray36;

	@OriginalMember(owner = "client!hq", name = "cb", descriptor = "[B")
	private byte[] aByteArray39;

	@OriginalMember(owner = "client!hq", name = "lc", descriptor = "[S")
	private short[] aShortArray63;

	@OriginalMember(owner = "client!hq", name = "Fc", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!hq", name = "ub", descriptor = "S")
	private short aShort38;

	@OriginalMember(owner = "client!hq", name = "Z", descriptor = "[S")
	private short[] aShortArray54;

	@OriginalMember(owner = "client!hq", name = "Qb", descriptor = "[S")
	private short[] aShortArray59;

	@OriginalMember(owner = "client!hq", name = "rc", descriptor = "S")
	private short aShort39;

	@OriginalMember(owner = "client!hq", name = "ab", descriptor = "[S")
	private short[] aShortArray55;

	@OriginalMember(owner = "client!hq", name = "sb", descriptor = "[S")
	private short[] aShortArray57;

	@OriginalMember(owner = "client!hq", name = "dc", descriptor = "[S")
	private short[] aShortArray62;

	@OriginalMember(owner = "client!hq", name = "Fb", descriptor = "[S")
	private short[] aShortArray58;

	@OriginalMember(owner = "client!hq", name = "ac", descriptor = "[S")
	private short[] aShortArray60;

	@OriginalMember(owner = "client!hq", name = "wc", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!hq", name = "qb", descriptor = "[S")
	private short[] aShortArray56;

	@OriginalMember(owner = "client!hq", name = "W", descriptor = "[S")
	private short[] aShortArray53;

	@OriginalMember(owner = "client!hq", name = "vb", descriptor = "[F")
	private float[] aFloatArray35;

	@OriginalMember(owner = "client!hq", name = "t", descriptor = "[I")
	private int[] anIntArray222;

	@OriginalMember(owner = "client!hq", name = "lb", descriptor = "[I")
	private int[] lb;

	@OriginalMember(owner = "client!hq", name = "sc", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!hq", name = "hb", descriptor = "[[I")
	private int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!hq", name = "X", descriptor = "[[I")
	private int[][] anIntArrayArray18;

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray17;

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!gd;Lclient!su;IIII)V")
	public Class153_Sub1(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) Class329 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_11;
		@Pc(15) int[] local15 = new int[arg1.anInt9034];
		this.anIntArray225 = new int[arg1.anInt9031 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt9034; local24++) {
			if (arg1.aByteArray90 == null || arg1.aByteArray90[local24] != 2) {
				if (arg1.aShortArray118 != null && arg1.aShortArray118[local24] != -1) {
					@Pc(55) Class136 local55 = local11.method358(arg1.aShortArray118[local24] & 0xFFFF);
					if (((this.anInt4360 & 0x40) == 0 || !local55.aBoolean315) && local55.aBoolean311) {
						continue;
					}
				}
				local15[this.anInt4376++] = local24;
				this.anIntArray225[arg1.aShortArray115[local24]]++;
				this.anIntArray225[arg1.aShortArray116[local24]]++;
				this.anIntArray225[arg1.aShortArray113[local24]]++;
			}
		}
		this.anInt4361 = this.anInt4376;
		@Pc(128) long[] local128 = new long[this.anInt4376];
		@Pc(137) boolean local137 = (this.anInt4348 & 0x100) != 0;
		@Pc(149) int local149;
		@Pc(162) int local162;
		@Pc(326) int local326;
		for (@Pc(139) int local139 = 0; local139 < this.anInt4376; local139++) {
			@Pc(145) int local145 = local15[local139];
			@Pc(147) Class136 local147 = null;
			local149 = 0;
			@Pc(151) byte local151 = 0;
			@Pc(153) byte local153 = 0;
			@Pc(155) byte local155 = 0;
			if (arg1.aClass356Array1 != null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < arg1.aClass356Array1.length; local162++) {
					@Pc(169) Class356 local169 = arg1.aClass356Array1[local162];
					if (local169.anInt9980 == local145) {
						@Pc(178) Class353 local178 = Static580.method8010(local169.anInt9985);
						if (local178.aBoolean841) {
							local160 = true;
						}
						if (local178.anInt9931 != -1) {
							@Pc(193) Class136 local193 = local11.method358(local178.anInt9931);
							if (local193.anInt3869 == 2) {
								this.aBoolean359 = true;
							}
						}
					}
				}
				if (local160) {
					local128[local139] = Long.MAX_VALUE;
					this.anInt4361--;
					continue;
				}
			}
			@Pc(224) short local224 = -1;
			if (arg1.aShortArray118 != null) {
				local224 = arg1.aShortArray118[local145];
				if (local224 != -1) {
					local147 = local11.method358(local224 & 0xFFFF);
					if ((this.anInt4360 & 0x40) != 0 && local147.aBoolean315) {
						local224 = -1;
						local147 = null;
					} else {
						local155 = local147.aByte57;
						local153 = local147.aByte56;
					}
				}
			}
			@Pc(282) boolean local282 = arg1.aByteArray87 != null && arg1.aByteArray87[local145] != 0 || local147 != null && local147.anInt3869 != 0;
			if ((local137 || local282) && arg1.aByteArray91 != null) {
				local149 += arg1.aByteArray91[local145] << 17;
			}
			if (local282) {
				local149 += 65536;
			}
			local149 += (local153 & 0xFF) << 8;
			local149 += local155 & 0xFF;
			local326 = local151 + ((local224 & 0xFFFF) << 16);
			@Pc(332) int local332 = local326 + (local139 & 0xFFFF);
			local128[local139] = ((long) local149 << 32) + ((long) local332);
			this.aBoolean359 |= local282;
			this.aBoolean356 |= local147 != null && (local147.aByte52 != 0 || local147.aByte53 != 0);
		}
		Static427.method6308(local15, local128);
		this.anIntArray224 = arg1.anIntArray506;
		this.anIntArray223 = arg1.anIntArray503;
		this.anInt4359 = arg1.anInt9041;
		this.anInt4387 = arg1.anInt9031;
		this.anIntArray226 = arg1.anIntArray508;
		this.aShortArray61 = arg1.aShortArray110;
		this.aClass209Array1 = arg1.aClass209Array3;
		@Pc(409) Class146[] local409 = new Class146[this.anInt4387];
		this.aClass313Array1 = arg1.aClass313Array3;
		@Pc(433) int local433;
		@Pc(447) int local447;
		@Pc(485) int local485;
		if (arg1.aClass356Array1 != null) {
			this.anInt4385 = arg1.aClass356Array1.length;
			this.aClass189Array1 = new Class189[this.anInt4385];
			this.aClass141Array1 = new Class141[this.anInt4385];
			for (local433 = 0; local433 < this.anInt4385; local433++) {
				@Pc(440) Class356 local440 = arg1.aClass356Array1[local433];
				@Pc(445) Class353 local445 = Static580.method8010(local440.anInt9985);
				local447 = -1;
				for (@Pc(449) int local449 = 0; local449 < this.anInt4376; local449++) {
					if (local440.anInt9980 == local15[local449]) {
						local447 = local449;
						break;
					}
				}
				if (local447 == -1) {
					throw new RuntimeException();
				}
				local485 = Static336.anIntArray357[arg1.aShortArray112[local440.anInt9980] & 0xFFFF] & 0xFFFFFF;
				@Pc(502) int local502 = local485 | 255 - (arg1.aByteArray87 == null ? 0 : arg1.aByteArray87[local440.anInt9980]) << 24;
				this.aClass189Array1[local433] = new Class189(local447, arg1.aShortArray115[local440.anInt9980], arg1.aShortArray116[local440.anInt9980], arg1.aShortArray113[local440.anInt9980], local445.anInt9935, local445.anInt9939, local445.anInt9931, local445.anInt9936, local445.anInt9937, local445.aBoolean841, local445.aBoolean842, local440.anInt9979);
				this.aClass141Array1[local433] = new Class141(local502);
			}
		}
		local433 = this.anInt4376 * 3;
		this.aByteArray38 = new byte[local433];
		this.aFloatArray36 = new float[local433];
		this.aByteArray39 = new byte[this.anInt4376];
		this.aShortArray63 = new short[this.anInt4376];
		this.aShortArray65 = new short[local433];
		this.aShort38 = (short) arg3;
		this.aShortArray54 = new short[local433];
		this.aShortArray59 = new short[this.anInt4376];
		this.aShort39 = (short) arg4;
		this.aShortArray55 = new short[local433];
		this.aShortArray57 = new short[local433];
		Static407.aLongArray21 = new long[local433];
		this.aShortArray62 = new short[local433];
		this.aShortArray58 = new short[this.anInt4376];
		this.aShortArray60 = new short[this.anInt4376];
		this.aShortArray64 = new short[local433];
		if (arg1.aShortArray114 != null) {
			this.aShortArray56 = new short[this.anInt4376];
		}
		this.aShortArray53 = new short[this.anInt4376];
		this.aFloatArray35 = new float[local433];
		local149 = 0;
		for (local326 = 0; local326 < arg1.anInt9031; local326++) {
			local447 = this.anIntArray225[local326];
			this.anIntArray225[local326] = local149;
			local149 += local447;
			local409[local326] = new Class146();
		}
		this.anIntArray225[arg1.anInt9031] = local149;
		@Pc(692) Class292 local692 = Static23.method293(local15, this.anInt4376, arg1);
		@Pc(696) Class40[] local696 = new Class40[arg1.anInt9034];
		@Pc(736) int local736;
		@Pc(747) int local747;
		@Pc(758) int local758;
		@Pc(715) short local715;
		@Pc(726) int local726;
		for (local485 = 0; local485 < arg1.anInt9034; local485++) {
			@Pc(705) short local705 = arg1.aShortArray115[local485];
			@Pc(710) short local710 = arg1.aShortArray116[local485];
			local715 = arg1.aShortArray113[local485];
			local726 = this.anIntArray226[local710] - this.anIntArray226[local705];
			local736 = this.anIntArray223[local710] - this.anIntArray223[local705];
			local747 = this.anIntArray224[local710] - this.anIntArray224[local705];
			local758 = this.anIntArray226[local715] - this.anIntArray226[local705];
			@Pc(769) int local769 = this.anIntArray223[local715] - this.anIntArray223[local705];
			@Pc(780) int local780 = this.anIntArray224[local715] - this.anIntArray224[local705];
			@Pc(789) int local789 = local780 * local736 - local769 * local747;
			@Pc(798) int local798 = local747 * local758 - local780 * local726;
			@Pc(807) int local807;
			for (local807 = local726 * local769 - local758 * local736; local789 > 8192 || local798 > 8192 || local807 > 8192 || local789 < -8192 || local798 < -8192 || local807 < -8192; local807 >>= 0x1) {
				local798 >>= 0x1;
				local789 >>= 0x1;
			}
			@Pc(858) int local858 = (int) Math.sqrt((double) (local807 * local807 + local798 * local798 + local789 * local789));
			if (local858 <= 0) {
				local858 = 1;
			}
			local789 = local789 * 256 / local858;
			local807 = local807 * 256 / local858;
			local798 = local798 * 256 / local858;
			@Pc(890) byte local890 = arg1.aByteArray90 == null ? 0 : arg1.aByteArray90[local485];
			if (local890 == 0) {
				@Pc(918) Class146 local918 = local409[local705];
				local918.anInt4124++;
				local918.anInt4126 += local789;
				local918.anInt4122 += local807;
				local918.anInt4125 += local798;
				@Pc(946) Class146 local946 = local409[local710];
				local946.anInt4126 += local789;
				local946.anInt4124++;
				local946.anInt4122 += local807;
				local946.anInt4125 += local798;
				@Pc(974) Class146 local974 = local409[local715];
				local974.anInt4122 += local807;
				local974.anInt4125 += local798;
				local974.anInt4126 += local789;
				local974.anInt4124++;
			} else if (local890 == 1) {
				@Pc(903) Class40 local903 = local696[local485] = new Class40();
				local903.anInt689 = local789;
				local903.anInt688 = local807;
				local903.anInt686 = local798;
			}
		}
		@Pc(1011) int local1011;
		@Pc(1054) short local1054;
		for (local162 = 0; local162 < this.anInt4376; local162++) {
			local1011 = local15[local162];
			@Pc(1018) int local1018 = arg1.aShortArray112[local1011] & 0xFFFF;
			if (arg1.aByteArray86 == null) {
				local726 = -1;
			} else {
				local726 = arg1.aByteArray86[local1011];
			}
			if (arg1.aByteArray87 == null) {
				local736 = 0;
			} else {
				local736 = arg1.aByteArray87[local1011] & 0xFF;
			}
			local1054 = arg1.aShortArray118 == null ? -1 : arg1.aShortArray118[local1011];
			if (local1054 != -1 && (this.anInt4360 & 0x40) != 0) {
				@Pc(1070) Class136 local1070 = local11.method358(local1054 & 0xFFFF);
				if (local1070.aBoolean315) {
					local1054 = -1;
				}
			}
			@Pc(1077) float local1077 = 0.0F;
			@Pc(1079) float local1079 = 0.0F;
			@Pc(1081) float local1081 = 0.0F;
			@Pc(1083) float local1083 = 0.0F;
			@Pc(1085) float local1085 = 0.0F;
			@Pc(1087) float local1087 = 0.0F;
			@Pc(1089) byte local1089 = 0;
			@Pc(1091) byte local1091 = 0;
			@Pc(1093) int local1093 = 0;
			@Pc(1127) byte local1127;
			@Pc(1147) short local1147;
			@Pc(1152) short local1152;
			@Pc(1157) short local1157;
			if (local1054 != -1) {
				if (local726 == -1) {
					local1089 = 1;
					local1083 = 1.0F;
					local1087 = 0.0F;
					local1085 = 0.0F;
					local1079 = 1.0F;
					local1081 = 1.0F;
					local1077 = 0.0F;
					local1091 = 2;
				} else {
					local726 &= 0xFF;
					local1127 = arg1.aByteArray92[local726];
					@Pc(1137) short local1137;
					@Pc(1142) short local1142;
					@Pc(1180) float local1180;
					@Pc(1188) float local1188;
					@Pc(1197) float local1197;
					@Pc(1279) float local1279;
					@Pc(1287) float local1287;
					@Pc(1296) float local1296;
					@Pc(1304) float local1304;
					@Pc(1313) float local1313;
					@Pc(1322) float local1322;
					if (local1127 == 0) {
						local1137 = arg1.aShortArray115[local1011];
						local1142 = arg1.aShortArray116[local1011];
						local1147 = arg1.aShortArray113[local1011];
						local1152 = arg1.aShortArray117[local726];
						local1157 = arg1.aShortArray111[local726];
						@Pc(1162) short local1162 = arg1.aShortArray119[local726];
						@Pc(1168) float local1168 = (float) arg1.anIntArray508[local1152];
						@Pc(1174) float local1174 = (float) arg1.anIntArray503[local1152];
						local1180 = (float) arg1.anIntArray506[local1152];
						local1188 = (float) arg1.anIntArray508[local1157] - local1168;
						local1197 = (float) arg1.anIntArray503[local1157] - local1174;
						@Pc(1205) float local1205 = (float) arg1.anIntArray506[local1157] - local1180;
						@Pc(1213) float local1213 = (float) arg1.anIntArray508[local1162] - local1168;
						@Pc(1221) float local1221 = (float) arg1.anIntArray503[local1162] - local1174;
						@Pc(1229) float local1229 = (float) arg1.anIntArray506[local1162] - local1180;
						@Pc(1238) float local1238 = (float) arg1.anIntArray508[local1137] - local1168;
						@Pc(1246) float local1246 = (float) arg1.anIntArray503[local1137] - local1174;
						@Pc(1255) float local1255 = (float) arg1.anIntArray506[local1137] - local1180;
						@Pc(1263) float local1263 = (float) arg1.anIntArray508[local1142] - local1168;
						@Pc(1271) float local1271 = (float) arg1.anIntArray503[local1142] - local1174;
						local1279 = (float) arg1.anIntArray506[local1142] - local1180;
						local1287 = (float) arg1.anIntArray508[local1147] - local1168;
						local1296 = (float) arg1.anIntArray503[local1147] - local1174;
						local1304 = (float) arg1.anIntArray506[local1147] - local1180;
						local1313 = local1229 * local1197 - local1221 * local1205;
						local1322 = local1205 * local1213 - local1188 * local1229;
						@Pc(1330) float local1330 = local1221 * local1188 - local1197 * local1213;
						@Pc(1338) float local1338 = local1330 * local1221 - local1322 * local1229;
						@Pc(1347) float local1347 = local1313 * local1229 - local1330 * local1213;
						@Pc(1355) float local1355 = local1213 * local1322 - local1313 * local1221;
						@Pc(1369) float local1369 = 1.0F / (local1197 * local1347 + local1338 * local1188 + local1355 * local1205);
						local1077 = (local1255 * local1355 + local1238 * local1338 + local1246 * local1347) * local1369;
						local1081 = (local1279 * local1355 + local1338 * local1263 + local1347 * local1271) * local1369;
						local1085 = (local1287 * local1338 + local1296 * local1347 + local1355 * local1304) * local1369;
						@Pc(1420) float local1420 = local1197 * local1330 - local1205 * local1322;
						@Pc(1429) float local1429 = local1188 * local1322 - local1313 * local1197;
						@Pc(1437) float local1437 = local1313 * local1205 - local1330 * local1188;
						@Pc(1451) float local1451 = 1.0F / (local1429 * local1229 + local1420 * local1213 + local1221 * local1437);
						local1079 = local1451 * (local1255 * local1429 + local1238 * local1420 + local1437 * local1246);
						local1087 = (local1296 * local1437 + local1287 * local1420 + local1304 * local1429) * local1451;
						local1083 = local1451 * (local1420 * local1263 + local1271 * local1437 + local1279 * local1429);
					} else {
						local1137 = arg1.aShortArray115[local1011];
						local1142 = arg1.aShortArray116[local1011];
						local1147 = arg1.aShortArray113[local1011];
						@Pc(1515) int local1515 = local692.anIntArray453[local726];
						@Pc(1520) int local1520 = local692.anIntArray454[local726];
						@Pc(1525) int local1525 = local692.anIntArray452[local726];
						@Pc(1530) float[] local1530 = local692.aFloatArrayArray9[local726];
						@Pc(1535) byte local1535 = arg1.aByteArray88[local726];
						local1180 = (float) arg1.anIntArray500[local726] / 256.0F;
						if (local1127 == 1) {
							local1188 = (float) arg1.anIntArray505[local726] / 1024.0F;
							Static296.method4760(local1535, local1530, Static433.aFloatArray75, arg1.anIntArray506[local1137], local1188, local1515, local1520, arg1.anIntArray508[local1137], local1180, local1525, arg1.anIntArray503[local1137]);
							local1079 = Static433.aFloatArray75[1];
							local1077 = Static433.aFloatArray75[0];
							Static296.method4760(local1535, local1530, Static433.aFloatArray75, arg1.anIntArray506[local1142], local1188, local1515, local1520, arg1.anIntArray508[local1142], local1180, local1525, arg1.anIntArray503[local1142]);
							local1081 = Static433.aFloatArray75[0];
							local1083 = Static433.aFloatArray75[1];
							Static296.method4760(local1535, local1530, Static433.aFloatArray75, arg1.anIntArray506[local1147], local1188, local1515, local1520, arg1.anIntArray508[local1147], local1180, local1525, arg1.anIntArray503[local1147]);
							local1087 = Static433.aFloatArray75[1];
							local1085 = Static433.aFloatArray75[0];
							local1197 = local1188 / 2.0F;
							if ((local1535 & 0x1) == 0) {
								if (local1085 - local1077 > local1197) {
									local1091 = 1;
									local1085 -= local1188;
								} else if (local1197 < local1077 - local1085) {
									local1091 = 2;
									local1085 += local1188;
								}
								if (local1197 < local1081 - local1077) {
									local1081 -= local1188;
									local1089 = 1;
								} else if (local1077 - local1081 > local1197) {
									local1089 = 2;
									local1081 += local1188;
								}
							} else {
								if (local1087 - local1079 > local1197) {
									local1091 = 1;
									local1087 -= local1188;
								} else if (local1197 < local1079 - local1087) {
									local1087 += local1188;
									local1091 = 2;
								}
								if (local1083 - local1079 > local1197) {
									local1083 -= local1188;
									local1089 = 1;
								} else if (local1079 - local1083 > local1197) {
									local1083 += local1188;
									local1089 = 2;
								}
							}
						} else if (local1127 == 2) {
							local1188 = (float) arg1.anIntArray499[local726] / 256.0F;
							local1197 = (float) arg1.anIntArray509[local726] / 256.0F;
							@Pc(1783) int local1783 = arg1.anIntArray508[local1142] - arg1.anIntArray508[local1137];
							@Pc(1794) int local1794 = arg1.anIntArray503[local1142] - arg1.anIntArray503[local1137];
							@Pc(1805) int local1805 = arg1.anIntArray506[local1142] - arg1.anIntArray506[local1137];
							@Pc(1815) int local1815 = arg1.anIntArray508[local1147] - arg1.anIntArray508[local1137];
							@Pc(1826) int local1826 = arg1.anIntArray503[local1147] - arg1.anIntArray503[local1137];
							@Pc(1837) int local1837 = arg1.anIntArray506[local1147] - arg1.anIntArray506[local1137];
							@Pc(1846) int local1846 = local1794 * local1837 - local1826 * local1805;
							@Pc(1855) int local1855 = local1805 * local1815 - local1783 * local1837;
							@Pc(1864) int local1864 = local1783 * local1826 - local1815 * local1794;
							local1279 = 64.0F / (float) arg1.anIntArray504[local726];
							local1287 = 64.0F / (float) arg1.anIntArray501[local726];
							local1296 = 64.0F / (float) arg1.anIntArray505[local726];
							local1304 = ((float) local1864 * local1530[2] + local1530[0] * (float) local1846 + local1530[1] * (float) local1855) / local1279;
							local1313 = ((float) local1864 * local1530[5] + local1530[3] * (float) local1846 + local1530[4] * (float) local1855) / local1287;
							local1322 = ((float) local1855 * local1530[7] + local1530[6] * (float) local1846 + (float) local1864 * local1530[8]) / local1296;
							local1093 = Static426.method6301(local1304, local1313, local1322);
							Static231.method3570(local1525, local1180, local1520, arg1.anIntArray508[local1137], local1530, local1093, arg1.anIntArray503[local1137], local1535, local1197, Static433.aFloatArray75, local1515, local1188, arg1.anIntArray506[local1137]);
							local1077 = Static433.aFloatArray75[0];
							local1079 = Static433.aFloatArray75[1];
							Static231.method3570(local1525, local1180, local1520, arg1.anIntArray508[local1142], local1530, local1093, arg1.anIntArray503[local1142], local1535, local1197, Static433.aFloatArray75, local1515, local1188, arg1.anIntArray506[local1142]);
							local1081 = Static433.aFloatArray75[0];
							local1083 = Static433.aFloatArray75[1];
							Static231.method3570(local1525, local1180, local1520, arg1.anIntArray508[local1147], local1530, local1093, arg1.anIntArray503[local1147], local1535, local1197, Static433.aFloatArray75, local1515, local1188, arg1.anIntArray506[local1147]);
							local1087 = Static433.aFloatArray75[1];
							local1085 = Static433.aFloatArray75[0];
						} else if (local1127 == 3) {
							Static215.method6906(local1535, local1180, local1520, local1525, arg1.anIntArray506[local1137], Static433.aFloatArray75, arg1.anIntArray508[local1137], local1515, arg1.anIntArray503[local1137], local1530);
							local1077 = Static433.aFloatArray75[0];
							local1079 = Static433.aFloatArray75[1];
							Static215.method6906(local1535, local1180, local1520, local1525, arg1.anIntArray506[local1142], Static433.aFloatArray75, arg1.anIntArray508[local1142], local1515, arg1.anIntArray503[local1142], local1530);
							local1083 = Static433.aFloatArray75[1];
							local1081 = Static433.aFloatArray75[0];
							Static215.method6906(local1535, local1180, local1520, local1525, arg1.anIntArray506[local1147], Static433.aFloatArray75, arg1.anIntArray508[local1147], local1515, arg1.anIntArray503[local1147], local1530);
							local1085 = Static433.aFloatArray75[0];
							local1087 = Static433.aFloatArray75[1];
							if ((local1535 & 0x1) == 0) {
								if (local1081 - local1077 > 0.5F) {
									local1081--;
									local1089 = 1;
								} else if (local1077 - local1081 > 0.5F) {
									local1081++;
									local1089 = 2;
								}
								if (local1085 - local1077 > 0.5F) {
									local1091 = 1;
									local1085--;
								} else if (local1077 - local1085 > 0.5F) {
									local1091 = 2;
									local1085++;
								}
							} else {
								if (local1083 - local1079 > 0.5F) {
									local1089 = 1;
									local1083--;
								} else if (local1079 - local1083 > 0.5F) {
									local1083++;
									local1089 = 2;
								}
								if (local1087 - local1079 > 0.5F) {
									local1091 = 1;
									local1087--;
								} else if (local1079 - local1087 > 0.5F) {
									local1087++;
									local1091 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray90 == null) {
				local1127 = 0;
			} else {
				local1127 = arg1.aByteArray90[local1011];
			}
			if (local1127 == 0) {
				@Pc(2322) long local2322 = (long) (local726 << 2) + ((long) (local1018 << 8) + (long) (local1093 << 24) + (long) local736 << 32);
				local1147 = arg1.aShortArray115[local1011];
				local1152 = arg1.aShortArray116[local1011];
				local1157 = arg1.aShortArray113[local1011];
				@Pc(2341) Class146 local2341 = local409[local1147];
				this.aShortArray63[local162] = this.method3730(local2341.anInt4125, arg1, local2341.anInt4122, local2341.anInt4124, local1079, local1077, local1147, local2341.anInt4126, local162, local2322);
				@Pc(2366) Class146 local2366 = local409[local1152];
				this.aShortArray59[local162] = this.method3730(local2366.anInt4125, arg1, local2366.anInt4122, local2366.anInt4124, local1083, local1081, local1152, local2366.anInt4126, local162, (long) local1089 + local2322);
				@Pc(2394) Class146 local2394 = local409[local1157];
				this.aShortArray53[local162] = this.method3730(local2394.anInt4125, arg1, local2394.anInt4122, local2394.anInt4124, local1087, local1085, local1157, local2394.anInt4126, local162, (long) local1091 + local2322);
			} else if (local1127 == 1) {
				@Pc(2427) Class40 local2427 = local696[local1011];
				@Pc(2473) long local2473 = (long) ((local2427.anInt686 + 256 << 12) + (local2427.anInt689 <= 0 ? 2048 : 1024) + (local726 << 2) + (local2427.anInt688 - -256 << 22)) + ((long) local736 + (long) (local1093 << 24) + (long) (local1018 << 8) << 32);
				this.aShortArray63[local162] = this.method3730(local2427.anInt686, arg1, local2427.anInt688, 0, local1079, local1077, arg1.aShortArray115[local1011], local2427.anInt689, local162, local2473);
				this.aShortArray59[local162] = this.method3730(local2427.anInt686, arg1, local2427.anInt688, 0, local1083, local1081, arg1.aShortArray116[local1011], local2427.anInt689, local162, local2473 + (long) local1089);
				this.aShortArray53[local162] = this.method3730(local2427.anInt686, arg1, local2427.anInt688, 0, local1087, local1085, arg1.aShortArray113[local1011], local2427.anInt689, local162, (long) local1091 + local2473);
			}
			if (arg1.aByteArray87 != null) {
				this.aByteArray39[local162] = arg1.aByteArray87[local1011];
			}
			if (arg1.aShortArray114 != null) {
				this.aShortArray56[local162] = arg1.aShortArray114[local1011];
			}
			this.aShortArray60[local162] = arg1.aShortArray112[local1011];
			this.aShortArray58[local162] = local1054;
		}
		if (this.anInt4361 > 0) {
			local1011 = 1;
			local715 = this.aShortArray58[0];
			for (local726 = 0; local726 < this.anInt4361; local726++) {
				@Pc(2614) short local2614 = this.aShortArray58[local726];
				if (local2614 != local715) {
					local1011++;
					local715 = local2614;
				}
			}
			this.anIntArray222 = new int[local1011];
			this.lb = new int[local1011 + 1];
			this.anIntArray227 = new int[local1011];
			this.lb[0] = 0;
			local736 = this.anInt4375;
			local1011 = 0;
			local1054 = 0;
			local715 = this.aShortArray58[0];
			for (local758 = 0; local758 < this.anInt4361; local758++) {
				@Pc(2669) short local2669 = this.aShortArray58[local758];
				if (local715 != local2669) {
					this.anIntArray222[local1011] = local736;
					this.anIntArray227[local1011] = local1054 + 1 - local736;
					local1011++;
					this.lb[local1011] = local758;
					local736 = this.anInt4375;
					local715 = local2669;
					local1054 = 0;
				}
				@Pc(2704) short local2704 = this.aShortArray63[local758];
				if (local1054 < local2704) {
					local1054 = local2704;
				}
				if (local736 > local2704) {
					local736 = local2704;
				}
				local2704 = this.aShortArray59[local758];
				if (local1054 < local2704) {
					local1054 = local2704;
				}
				if (local2704 < local736) {
					local736 = local2704;
				}
				local2704 = this.aShortArray53[local758];
				if (local1054 < local2704) {
					local1054 = local2704;
				}
				if (local736 > local2704) {
					local736 = local2704;
				}
			}
			this.anIntArray222[local1011] = local736;
			this.anIntArray227[local1011] = local1054 + 1 - local736;
			local1011++;
			this.lb[local1011] = this.anInt4361;
		}
		Static407.aLongArray21 = null;
		this.aShortArray62 = Static381.method9024(this.anInt4375, this.aShortArray62);
		this.aShortArray57 = Static381.method9024(this.anInt4375, this.aShortArray57);
		this.aShortArray65 = Static381.method9024(this.anInt4375, this.aShortArray65);
		this.aShortArray55 = Static381.method9024(this.anInt4375, this.aShortArray55);
		this.aShortArray64 = Static381.method9024(this.anInt4375, this.aShortArray64);
		this.aByteArray38 = Static460.method6585(this.aByteArray38, this.anInt4375);
		this.aFloatArray35 = Static211.method3349(this.aFloatArray35, this.anInt4375);
		this.aFloatArray36 = Static211.method3349(this.aFloatArray36, this.anInt4375);
		if (arg1.anIntArray502 != null && Static443.method6450(this.anInt4360, arg2)) {
			this.anIntArrayArray19 = arg1.method7681(false);
		}
		if (arg1.aClass356Array1 != null && Static678.method9038(arg2, this.anInt4360)) {
			this.anIntArrayArray18 = arg1.method7678();
		}
		if (arg1.anIntArray507 != null && Static301.method4798(arg2, this.anInt4360)) {
			local1011 = 0;
			@Pc(2891) int[] local2891 = new int[256];
			for (local726 = 0; local726 < this.anInt4376; local726++) {
				local736 = arg1.anIntArray507[local15[local726]];
				if (local736 >= 0) {
					@Pc(2911) int local2911 = local2891[local736]++;
					if (local736 > local1011) {
						local1011 = local736;
					}
				}
			}
			this.anIntArrayArray17 = new int[local1011 + 1][];
			for (local736 = 0; local736 <= local1011; local736++) {
				this.anIntArrayArray17[local736] = new int[local2891[local736]];
				local2891[local736] = 0;
			}
			for (local747 = 0; local747 < this.anInt4376; local747++) {
				local758 = arg1.anIntArray507[local15[local747]];
				if (local758 >= 0) {
					this.anIntArrayArray17[local758][local2891[local758]++] = local747;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(Lclient!gd;IIZZ)V")
	public Class153_Sub1(@OriginalArg(0) Class65_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean356 = false;
		this.aBoolean357 = true;
		this.anInt4361 = 0;
		this.aBoolean358 = false;
		this.anInt4376 = 0;
		this.anInt4375 = 0;
		this.aBoolean359 = false;
		this.anInt4387 = 0;
		this.aBoolean360 = false;
		this.anInt4359 = 0;
		this.anInt4348 = arg1;
		this.aBoolean358 = arg4;
		this.aClass65_Sub2_8 = arg0;
		this.anInt4360 = arg2;
		if (arg3 || Static195.method3231(this.anInt4348, this.anInt4360)) {
			this.aClass78_2 = new Class78(Static399.method5900(this.anInt4348, this.anInt4360));
		}
		if (arg3 || Static616.method8392(this.anInt4348, this.anInt4360)) {
			this.aClass78_3 = new Class78(Static528.method7441(this.anInt4360, this.anInt4348));
		}
		if (arg3 || Static439.method6410(this.anInt4348, this.anInt4360)) {
			this.aClass78_4 = new Class78(Static135.method2404(this.anInt4348, this.anInt4360));
		}
		if (arg3 || Static228.method3553(this.anInt4348, this.anInt4360)) {
			this.aClass78_1 = new Class78(Static189.method3159(this.anInt4360, this.anInt4348));
		}
		if (arg3 || Static591.method8112(this.anInt4360, this.anInt4348)) {
			this.aClass253_1 = new Class253(Static313.method8688(this.anInt4360, this.anInt4348));
		}
	}

	@OriginalMember(owner = "client!hq", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt4348;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
	private void method3716() {
		if ((this.anInt4360 & 0x37) == 0) {
			if (this.aClass78_4 != null) {
				this.aClass78_4.aBoolean205 = false;
			}
		} else if (this.aClass78_1 != null) {
			this.aClass78_1.aBoolean205 = false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4393;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "()V")
	@Override
	protected void method8592() {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class153 method8580(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(23) Class153_Sub1 local23;
		@Pc(19) Class153_Sub1 local19;
		if (arg0 == 1) {
			local23 = this.aClass65_Sub2_8.aClass153_Sub1_22;
			local19 = this.aClass65_Sub2_8.aClass153_Sub1_29;
		} else if (arg0 == 2) {
			local19 = this.aClass65_Sub2_8.aClass153_Sub1_23;
			local23 = this.aClass65_Sub2_8.aClass153_Sub1_24;
		} else if (arg0 == 3) {
			local19 = this.aClass65_Sub2_8.aClass153_Sub1_27;
			local23 = this.aClass65_Sub2_8.aClass153_Sub1_26;
		} else if (arg0 == 4) {
			local23 = this.aClass65_Sub2_8.aClass153_Sub1_30;
			local19 = this.aClass65_Sub2_8.aClass153_Sub1_25;
		} else if (arg0 == 5) {
			local19 = this.aClass65_Sub2_8.aClass153_Sub1_21;
			local23 = this.aClass65_Sub2_8.aClass153_Sub1_28;
		} else {
			local23 = local19 = new Class153_Sub1(this.aClass65_Sub2_8, 0, 0, true, false);
		}
		return this.method3734(arg0 != 0, arg2, arg1, local19, local23);
	}

	@OriginalMember(owner = "client!hq", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray19 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt4359; local12++) {
			this.anIntArray226[local12] <<= 0x4;
			this.anIntArray223[local12] <<= 0x4;
			this.anIntArray224[local12] <<= 0x4;
		}
		Static670.anInt10763 = 0;
		Static578.anInt9489 = 0;
		Static87.anInt6205 = 0;
		return true;
	}

	@OriginalMember(owner = "client!hq", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort39 = (short) arg0;
		this.method3725();
		this.method3716();
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "()V")
	@Override
	protected void method8602() {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!oha;IZ)V")
	@Override
	public void method8578(@OriginalArg(0) Class254 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray61 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt4387; local14++) {
			if ((arg1 & this.aShortArray61[local14]) != 0) {
				if (arg2) {
					arg0.method7349(this.anIntArray226[local14], this.anIntArray223[local14], this.anIntArray224[local14], local12);
				} else {
					arg0.method7355(this.anIntArray226[local14], this.anIntArray223[local14], this.anIntArray224[local14], local12);
				}
				this.anIntArray226[local14] = local12[0];
				this.anIntArray223[local14] = local12[1];
				this.anIntArray224[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method3717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 < arg4 && arg6 > arg5 && arg7 > arg5) {
			return false;
		} else if (arg4 < arg5 && arg5 > arg6 && arg7 < arg5) {
			return false;
		} else if (arg1 < arg3 && arg2 > arg1 && arg1 < arg0) {
			return false;
		} else {
			return arg1 <= arg3 || arg2 >= arg1 || arg0 >= arg1;
		}
	}

	@OriginalMember(owner = "client!hq", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4387; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray226[local15] + this.anIntArray223[local15] * local9 >> 14;
			this.anIntArray223[local15] = this.anIntArray223[local15] * local13 - this.anIntArray226[local15] * local9 >> 14;
			this.anIntArray226[local15] = local33;
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!oha;IIIIZ)Z")
	private boolean method3718(@OriginalArg(1) Class254 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(8) Class254_Sub2 local8 = (Class254_Sub2) arg0;
		@Pc(12) Class254_Sub2 local12 = this.aClass65_Sub2_8.aClass254_Sub2_16;
		@Pc(33) float local33 = local12.aFloat146 + local8.aFloat152 * local12.aFloat144 + local12.aFloat153 * local8.aFloat146 + local8.aFloat147 * local12.aFloat151;
		@Pc(54) float local54 = local12.aFloat152 + local8.aFloat152 * local12.aFloat145 + local8.aFloat146 * local12.aFloat149 + local8.aFloat147 * local12.aFloat150;
		Static166.aFloat85 = local12.aFloat153 * local8.aFloat144 + local8.aFloat145 * local12.aFloat144 + local8.aFloat154 * local12.aFloat151;
		Static626.aFloat208 = local12.aFloat154 * local8.aFloat145 + local8.aFloat144 * local12.aFloat155 + local12.aFloat148 * local8.aFloat154;
		Static256.aFloat96 = local8.aFloat149 * local12.aFloat144 + local8.aFloat153 * local12.aFloat153 + local8.aFloat155 * local12.aFloat151;
		Static105.aFloat66 = local12.aFloat149 * local8.aFloat144 + local12.aFloat145 * local8.aFloat145 + local12.aFloat150 * local8.aFloat154;
		@Pc(147) float local147 = local12.aFloat148 * local8.aFloat147 + local8.aFloat152 * local12.aFloat154 + local12.aFloat155 * local8.aFloat146 + local12.aFloat147;
		Static483.aFloat166 = local12.aFloat148 * local8.aFloat148 + local12.aFloat154 * local8.aFloat150 + local8.aFloat151 * local12.aFloat155;
		Static643.aFloat211 = local12.aFloat154 * local8.aFloat149 + local12.aFloat155 * local8.aFloat153 + local12.aFloat148 * local8.aFloat155;
		Static191.aFloat87 = local12.aFloat151 * local8.aFloat148 + local12.aFloat144 * local8.aFloat150 + local12.aFloat153 * local8.aFloat151;
		Static363.aFloat192 = local8.aFloat155 * local12.aFloat150 + local8.aFloat149 * local12.aFloat145 + local12.aFloat149 * local8.aFloat153;
		Static209.aFloat173 = local8.aFloat151 * local12.aFloat149 + local12.aFloat145 * local8.aFloat150 + local8.aFloat148 * local12.aFloat150;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass65_Sub2_8.anInt5258;
		@Pc(255) int local255 = this.aClass65_Sub2_8.anInt5259;
		if (!this.aBoolean360) {
			this.method3719();
		}
		@Pc(270) int local270 = this.anInt4393 - this.anInt4394 >> 1;
		@Pc(279) int local279 = this.anInt4396 - this.anInt4370 >> 1;
		@Pc(287) int local287 = this.anInt4380 - this.anInt4363 >> 1;
		@Pc(293) int local293 = this.anInt4394 + local270;
		@Pc(299) int local299 = this.anInt4370 + local279;
		@Pc(305) int local305 = this.anInt4363 + local287;
		@Pc(312) int local312 = local293 - (local270 << arg4);
		@Pc(319) int local319 = local299 - (local279 << arg4);
		@Pc(326) int local326 = local305 - (local287 << arg4);
		@Pc(332) int local332 = (local270 << arg4) + local293;
		@Pc(339) int local339 = local299 + (local279 << arg4);
		@Pc(345) int local345 = local305 + (local287 << arg4);
		Static240.anIntArray235[0] = local312;
		Static668.anIntArray608[0] = local319;
		Static240.anIntArray235[1] = local332;
		Static143.anIntArray120[0] = local326;
		Static668.anIntArray608[1] = local319;
		Static240.anIntArray235[2] = local312;
		Static143.anIntArray120[1] = local326;
		Static668.anIntArray608[2] = local339;
		Static240.anIntArray235[3] = local332;
		Static143.anIntArray120[2] = local326;
		Static668.anIntArray608[3] = local339;
		Static240.anIntArray235[4] = local312;
		Static143.anIntArray120[3] = local326;
		Static668.anIntArray608[4] = local319;
		Static143.anIntArray120[4] = local345;
		Static240.anIntArray235[5] = local332;
		Static668.anIntArray608[5] = local319;
		Static240.anIntArray235[6] = local312;
		Static143.anIntArray120[5] = local345;
		Static668.anIntArray608[6] = local339;
		Static143.anIntArray120[6] = local345;
		Static240.anIntArray235[7] = local332;
		Static668.anIntArray608[7] = local339;
		Static143.anIntArray120[7] = local345;
		@Pc(482) float local482;
		@Pc(496) float local496;
		@Pc(510) float local510;
		@Pc(463) float local463;
		@Pc(458) float local458;
		@Pc(468) float local468;
		for (@Pc(451) int local451 = 0; local451 < 8; local451++) {
			local458 = (float) Static668.anIntArray608[local451];
			local463 = (float) Static240.anIntArray235[local451];
			local468 = (float) Static143.anIntArray120[local451];
			local482 = local33 + Static191.aFloat87 * local468 + local463 * Static256.aFloat96 + Static166.aFloat85 * local458;
			local496 = local54 + Static209.aFloat173 * local468 + local463 * Static363.aFloat192 + Static105.aFloat66 * local458;
			local510 = Static483.aFloat166 * local468 + local463 * Static643.aFloat211 + local458 * Static626.aFloat208 + local147;
			if ((float) this.aClass65_Sub2_8.anInt5242 <= local510) {
				if (arg1 > 0) {
					local510 = (float) arg1;
				}
				@Pc(537) float local537 = (float) this.aClass65_Sub2_8.anInt5238 + (float) local251 * local482 / local510;
				if (local537 < local241) {
					local241 = local537;
				}
				@Pc(555) float local555 = local496 * (float) local255 / local510 + (float) this.aClass65_Sub2_8.anInt5262;
				if (local243 < local537) {
					local243 = local537;
				}
				if (local247 < local555) {
					local247 = local555;
				}
				local239 = true;
				if (local245 > local555) {
					local245 = local555;
				}
			}
		}
		if (local239 && (float) arg2 > local241 && local243 > (float) arg2 && local245 < (float) arg3 && (float) arg3 < local247) {
			if (arg5) {
				return true;
			}
			if (Static331.anIntArray346.length < this.anInt4375) {
				Static465.anIntArray444 = new int[this.anInt4375];
				Static331.anIntArray346 = new int[this.anInt4375];
			}
			@Pc(694) int local694;
			for (@Pc(620) int local620 = 0; local620 < this.anInt4387; local620++) {
				local468 = (float) this.anIntArray224[local620];
				local458 = (float) this.anIntArray223[local620];
				local463 = (float) this.anIntArray226[local620];
				local482 = Static191.aFloat87 * local468 + local463 * Static256.aFloat96 + local458 * Static166.aFloat85 + local33;
				local510 = local468 * Static483.aFloat166 + Static643.aFloat211 * local463 + local458 * Static626.aFloat208 + local147;
				local496 = Static209.aFloat173 * local468 + Static105.aFloat66 * local458 + Static363.aFloat192 * local463 + local54;
				@Pc(701) int local701;
				@Pc(703) int local703;
				@Pc(712) int local712;
				if ((float) this.aClass65_Sub2_8.anInt5242 <= local510) {
					if (arg1 > 0) {
						local510 = (float) arg1;
					}
					local694 = (int) ((float) this.aClass65_Sub2_8.anInt5238 + (float) local251 * local482 / local510);
					local701 = (int) ((float) this.aClass65_Sub2_8.anInt5262 + local496 * (float) local255 / local510);
					local703 = this.anIntArray225[local620];
					local712 = this.anIntArray225[local620 + 1];
					for (@Pc(783) int local783 = local703; local783 < local712; local783++) {
						@Pc(792) int local792 = this.aShortArray54[local783] - 1;
						if (local792 == -1) {
							break;
						}
						Static331.anIntArray346[local792] = local694;
						Static465.anIntArray444[local792] = local701;
					}
				} else {
					local694 = this.anIntArray225[local620];
					local701 = this.anIntArray225[local620 + 1];
					for (local703 = local694; local703 < local701; local703++) {
						local712 = this.aShortArray54[local703] - 1;
						if (local712 == -1) {
							break;
						}
						Static331.anIntArray346[this.aShortArray54[local703] - 1] = -999999;
					}
				}
			}
			for (local694 = 0; local694 < this.anInt4376; local694++) {
				if (Static331.anIntArray346[this.aShortArray63[local694]] != -999999 && Static331.anIntArray346[this.aShortArray59[local694]] != -999999 && Static331.anIntArray346[this.aShortArray53[local694]] != -999999 && this.method3717(Static331.anIntArray346[this.aShortArray53[local694]], arg2, Static331.anIntArray346[this.aShortArray59[local694]], Static331.anIntArray346[this.aShortArray63[local694]], Static465.anIntArray444[this.aShortArray63[local694]], arg3, Static465.anIntArray444[this.aShortArray59[local694]], Static465.anIntArray444[this.aShortArray53[local694]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!oha;Lclient!vu;II)V")
	@Override
	public void method8594(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt4375 == 0) {
			return;
		}
		@Pc(13) Class254_Sub2 local13 = this.aClass65_Sub2_8.aClass254_Sub2_16;
		@Pc(16) Class254_Sub2 local16 = (Class254_Sub2) arg0;
		if (!this.aBoolean360) {
			this.method3719();
		}
		Static626.aFloat208 = local13.aFloat148 * local16.aFloat154 + local16.aFloat145 * local13.aFloat154 + local16.aFloat144 * local13.aFloat155;
		Static50.aFloat5 = local13.aFloat147 + local13.aFloat148 * local16.aFloat147 + local16.aFloat152 * local13.aFloat154 + local13.aFloat155 * local16.aFloat146;
		@Pc(69) float local69 = Static50.aFloat5 + (float) this.anInt4370 * Static626.aFloat208;
		@Pc(77) float local77 = Static626.aFloat208 * (float) this.anInt4396 + Static50.aFloat5;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.anInt4367 + local77;
			local94 = (float) this.anInt4367 + local69;
		} else {
			local94 = local77 + (float) this.anInt4367;
			local88 = local69 - (float) this.anInt4367;
		}
		if (local88 >= this.aClass65_Sub2_8.aFloat98 || local94 <= (float) this.aClass65_Sub2_8.anInt5242) {
			return;
		}
		Static166.aFloat85 = local16.aFloat145 * local13.aFloat144 + local16.aFloat144 * local13.aFloat153 + local13.aFloat151 * local16.aFloat154;
		Static365.aFloat125 = local13.aFloat146 + local13.aFloat153 * local16.aFloat146 + local13.aFloat144 * local16.aFloat152 + local13.aFloat151 * local16.aFloat147;
		@Pc(170) float local170 = Static166.aFloat85 * (float) this.anInt4370 + Static365.aFloat125;
		@Pc(178) float local178 = Static365.aFloat125 + (float) this.anInt4396 * Static166.aFloat85;
		@Pc(205) float local205;
		@Pc(193) float local193;
		if (local170 > local178) {
			local193 = (local170 + (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5258;
			local205 = (float) this.aClass65_Sub2_8.anInt5258 * ((float) -this.anInt4367 + local178);
		} else {
			local205 = (float) this.aClass65_Sub2_8.anInt5258 * ((float) -this.anInt4367 + local170);
			local193 = (local178 + (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5258;
		}
		if (this.aClass65_Sub2_8.aFloat109 <= local205 / (float) arg2 || local193 / (float) arg2 <= this.aClass65_Sub2_8.aFloat105) {
			return;
		}
		Static348.aFloat120 = local13.aFloat152 + local13.aFloat145 * local16.aFloat152 + local16.aFloat146 * local13.aFloat149 + local16.aFloat147 * local13.aFloat150;
		Static105.aFloat66 = local13.aFloat149 * local16.aFloat144 + local13.aFloat145 * local16.aFloat145 + local16.aFloat154 * local13.aFloat150;
		@Pc(297) float local297 = Static348.aFloat120 + (float) this.anInt4370 * Static105.aFloat66;
		@Pc(305) float local305 = Static348.aFloat120 + Static105.aFloat66 * (float) this.anInt4396;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local305 < local297) {
			local332 = (local297 + (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5259;
			local321 = (local305 - (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5259;
		} else {
			local321 = ((float) -this.anInt4367 + local297) * (float) this.aClass65_Sub2_8.anInt5259;
			local332 = (float) this.aClass65_Sub2_8.anInt5259 * ((float) this.anInt4367 + local305);
		}
		if (this.aClass65_Sub2_8.bf <= local321 / (float) arg2 || this.aClass65_Sub2_8.aFloat110 >= local332 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass189Array1 != null) {
			Static483.aFloat166 = local13.aFloat148 * local16.aFloat148 + local13.aFloat154 * local16.aFloat150 + local16.aFloat151 * local13.aFloat155;
			Static256.aFloat96 = local16.aFloat155 * local13.aFloat151 + local16.aFloat149 * local13.aFloat144 + local16.aFloat153 * local13.aFloat153;
			Static191.aFloat87 = local13.aFloat151 * local16.aFloat148 + local16.aFloat150 * local13.aFloat144 + local13.aFloat153 * local16.aFloat151;
			Static643.aFloat211 = local13.aFloat148 * local16.aFloat155 + local13.aFloat155 * local16.aFloat153 + local16.aFloat149 * local13.aFloat154;
			Static363.aFloat192 = local13.aFloat149 * local16.aFloat153 + local16.aFloat149 * local13.aFloat145 + local16.aFloat155 * local13.aFloat150;
			Static209.aFloat173 = local13.aFloat145 * local16.aFloat150 + local16.aFloat151 * local13.aFloat149 + local16.aFloat148 * local13.aFloat150;
		}
		if (arg1 != null) {
			@Pc(499) int local499 = this.anInt4394 + this.anInt4393 >> 1;
			@Pc(507) int local507 = this.anInt4363 + this.anInt4380 >> 1;
			@Pc(526) int local526 = (int) ((float) local507 * Static191.aFloat87 + Static166.aFloat85 * (float) this.anInt4370 + Static365.aFloat125 + Static256.aFloat96 * (float) local499);
			@Pc(545) int local545 = (int) (Static209.aFloat173 * (float) local507 + Static363.aFloat192 * (float) local499 + Static348.aFloat120 + (float) this.anInt4370 * Static105.aFloat66);
			@Pc(564) int local564 = (int) (Static50.aFloat5 + Static643.aFloat211 * (float) local499 + Static626.aFloat208 * (float) this.anInt4370 + (float) local507 * Static483.aFloat166);
			@Pc(583) int local583 = (int) (Static256.aFloat96 * (float) local499 + Static365.aFloat125 + (float) this.anInt4396 * Static166.aFloat85 + Static191.aFloat87 * (float) local507);
			@Pc(602) int local602 = (int) ((float) local499 * Static363.aFloat192 + Static348.aFloat120 + Static105.aFloat66 * (float) this.anInt4396 + (float) local507 * Static209.aFloat173);
			arg1.anInt10430 = local602 * this.aClass65_Sub2_8.anInt5259 / arg2 + this.aClass65_Sub2_8.anInt5262;
			arg1.anInt10431 = local526 * this.aClass65_Sub2_8.anInt5258 / arg2 + this.aClass65_Sub2_8.anInt5238;
			arg1.anInt10432 = this.aClass65_Sub2_8.anInt5238 + this.aClass65_Sub2_8.anInt5258 * local583 / arg2;
			arg1.anInt10433 = this.aClass65_Sub2_8.anInt5259 * local545 / arg2 + this.aClass65_Sub2_8.anInt5262;
			@Pc(673) int local673 = (int) (Static483.aFloat166 * (float) local507 + (float) local499 * Static643.aFloat211 + Static50.aFloat5 + Static626.aFloat208 * (float) this.anInt4396);
			if (local564 >= this.aClass65_Sub2_8.anInt5242 || local673 >= this.aClass65_Sub2_8.anInt5242) {
				arg1.aBoolean890 = true;
				arg1.anInt10434 = this.aClass65_Sub2_8.anInt5258 * (this.anInt4367 + local526) / arg2 + this.aClass65_Sub2_8.anInt5238 - arg1.anInt10431;
			}
		}
		this.aClass65_Sub2_8.method4352((float) arg2);
		this.aClass65_Sub2_8.method4367();
		this.aClass65_Sub2_8.method4460(local16);
		this.method3731();
		this.method3728();
	}

	@OriginalMember(owner = "client!hq", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean356;
	}

	@OriginalMember(owner = "client!hq", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109 arg2, @OriginalArg(3) Class109 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean360) {
			this.method3719();
		}
		@Pc(16) int local16 = this.anInt4394 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt4393;
		@Pc(26) int local26 = this.anInt4363 + arg6;
		@Pc(31) int local31 = arg6 + this.anInt4380;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9061 <= local21 + arg2.anInt9063 >> arg2.anInt9066 || local26 < 0 || arg2.anInt9063 + local31 >> arg2.anInt9066 >= arg2.anInt9065)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9061 <= arg3.anInt9063 + local21 >> arg3.anInt9066 || local26 < 0 || arg3.anInt9065 <= local31 + arg3.anInt9063 >> arg3.anInt9066) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9066;
			local21 = local21 + arg2.anInt9063 - 1 >> arg2.anInt9066;
			local26 >>= arg2.anInt9066;
			local31 = arg2.anInt9063 + local31 - 1 >> arg2.anInt9066;
			if (arg5 == arg2.method7695(local26, local16) && arg5 == arg2.method7695(local26, local21) && arg2.method7695(local31, local16) == arg5 && arg5 == arg2.method7695(local31, local21)) {
				return;
			}
		}
		@Pc(188) int local188;
		if (arg0 == 1) {
			for (local188 = 0; local188 < this.anInt4387; local188++) {
				this.anIntArray223[local188] = this.anIntArray223[local188] + arg2.method7702(arg4 + this.anIntArray226[local188], this.anIntArray224[local188] + arg6) - arg5;
			}
		} else {
			@Pc(196) int local196;
			@Pc(207) int local207;
			if (arg0 == 2) {
				local188 = this.anInt4370;
				if (local188 == 0) {
					return;
				}
				for (local196 = 0; local196 < this.anInt4387; local196++) {
					local207 = (this.anIntArray223[local196] << 16) / local188;
					if (arg1 > local207) {
						this.anIntArray223[local196] -= -((arg1 - local207) * (arg2.method7702(arg4 + this.anIntArray226[local196], this.anIntArray224[local196] + arg6) + -arg5) / arg1);
					}
				}
			} else {
				@Pc(291) int local291;
				if (arg0 == 3) {
					local188 = (arg1 & 0xFF) * 4;
					local196 = (arg1 >> 8 & 0xFF) * 4;
					local207 = (arg1 >> 16 & 0xFF) << 6;
					local291 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local188 >> 1) < 0 || arg2.anInt9063 + arg4 + (local188 >> 1) >= arg2.anInt9061 << arg2.anInt9066 || arg6 - (local196 >> 1) < 0 || (local196 >> 1) + arg6 + arg2.anInt9063 >= arg2.anInt9065 << arg2.anInt9066) {
						return;
					}
					this.method8595(local207, arg5, arg2, local291, local196, arg4, local188, arg6);
				} else if (arg0 == 4) {
					local188 = this.anInt4396 - this.anInt4370;
					for (local196 = 0; local196 < this.anInt4387; local196++) {
						this.anIntArray223[local196] = local188 + this.anIntArray223[local196] + arg3.method7702(arg4 + this.anIntArray226[local196], this.anIntArray224[local196] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local188 = this.anInt4396 - this.anInt4370;
					for (local196 = 0; local196 < this.anInt4387; local196++) {
						local207 = arg4 + this.anIntArray226[local196];
						local291 = this.anIntArray224[local196] + arg6;
						@Pc(395) int local395 = arg2.method7702(local207, local291);
						@Pc(401) int local401 = arg3.method7702(local207, local291);
						@Pc(409) int local409 = local395 - arg1 - local401;
						this.anIntArray223[local196] = ((this.anIntArray223[local196] << 8) / local188 * local409 >> 8) + (local395 - arg5);
					}
				}
			}
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4387; local3++) {
			this.anIntArray224[local3] = -this.anIntArray224[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt4375; local29++) {
			this.aShortArray64[local29] = (short) -this.aShortArray64[local29];
		}
		for (@Pc(52) int local52 = 0; local52 < this.anInt4376; local52++) {
			@Pc(59) short local59 = this.aShortArray63[local52];
			this.aShortArray63[local52] = this.aShortArray53[local52];
			this.aShortArray53[local52] = local59;
		}
		this.method3725();
		this.method3716();
		this.method3735();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8582(@OriginalArg(0) Class153 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class153_Sub1 local8 = (Class153_Sub1) arg0;
		if (this.anInt4376 == 0 || local8.anInt4376 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt4387;
		@Pc(27) int[] local27 = local8.anIntArray226;
		@Pc(30) int[] local30 = local8.anIntArray223;
		@Pc(33) int[] local33 = local8.anIntArray224;
		@Pc(36) short[] local36 = local8.aShortArray65;
		@Pc(39) short[] local39 = local8.aShortArray55;
		@Pc(42) short[] local42 = local8.aShortArray64;
		@Pc(45) byte[] local45 = local8.aByteArray38;
		@Pc(52) short[] local52;
		@Pc(56) short[] local56;
		@Pc(54) short[] local54;
		@Pc(50) byte[] local50;
		if (this.aClass148_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local52 = this.aClass148_1.aShortArray50;
			local56 = this.aClass148_1.aShortArray49;
			local50 = this.aClass148_1.aByteArray34;
			local54 = this.aClass148_1.aShortArray51;
		}
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(85) short[] local85;
		@Pc(83) byte[] local83;
		if (local8.aClass148_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local85 = local8.aClass148_1.aShortArray51;
			local83 = local8.aClass148_1.aByteArray34;
			local79 = local8.aClass148_1.aShortArray50;
			local81 = local8.aClass148_1.aShortArray49;
		}
		@Pc(106) int[] local106 = local8.anIntArray225;
		@Pc(109) short[] local109 = local8.aShortArray54;
		if (!local8.aBoolean360) {
			local8.method3719();
		}
		@Pc(118) int local118 = local8.anInt4370;
		@Pc(121) int local121 = local8.anInt4396;
		@Pc(124) int local124 = local8.anInt4394;
		@Pc(127) int local127 = local8.anInt4393;
		@Pc(130) int local130 = local8.anInt4363;
		@Pc(133) int local133 = local8.anInt4380;
		for (@Pc(135) int local135 = 0; local135 < this.anInt4387; local135++) {
			@Pc(144) int local144 = this.anIntArray223[local135] - arg2;
			if (local118 <= local144 && local121 >= local144) {
				@Pc(168) int local168 = this.anIntArray226[local135] - arg1;
				if (local168 >= local124 && local127 >= local168) {
					@Pc(188) int local188 = this.anIntArray224[local135] - arg3;
					if (local130 <= local188 && local133 >= local188) {
						@Pc(206) int local206 = -1;
						@Pc(211) int local211 = this.anIntArray225[local135];
						@Pc(218) int local218 = this.anIntArray225[local135 + 1];
						for (@Pc(220) int local220 = local211; local220 < local218; local220++) {
							local206 = this.aShortArray54[local220] - 1;
							if (local206 == -1 || this.aByteArray38[local206] != 0) {
								break;
							}
						}
						if (local206 != -1) {
							for (@Pc(249) int local249 = 0; local249 < local24; local249++) {
								if (local168 == local27[local249] && local33[local249] == local188 && local30[local249] == local144) {
									@Pc(272) int local272 = -1;
									local218 = local106[local249 + 1];
									local211 = local106[local249];
									for (@Pc(284) int local284 = local211; local284 < local218; local284++) {
										local272 = local109[local284] - 1;
										if (local272 == -1 || local45[local272] != 0) {
											break;
										}
									}
									if (local272 != -1) {
										if (local52 == null) {
											this.aClass148_1 = new Class148();
											local52 = this.aClass148_1.aShortArray50 = Static599.method8201(this.aShortArray65);
											local56 = this.aClass148_1.aShortArray49 = Static599.method8201(this.aShortArray55);
											local54 = this.aClass148_1.aShortArray51 = Static599.method8201(this.aShortArray64);
											local50 = this.aClass148_1.aByteArray34 = Static540.method7551(this.aByteArray38);
										}
										if (local79 == null) {
											@Pc(361) Class148 local361 = local8.aClass148_1 = new Class148();
											local79 = local361.aShortArray50 = Static599.method8201(local36);
											local81 = local361.aShortArray49 = Static599.method8201(local39);
											local85 = local361.aShortArray51 = Static599.method8201(local42);
											local83 = local361.aByteArray34 = Static540.method7551(local45);
										}
										@Pc(394) short local394 = this.aShortArray65[local206];
										@Pc(399) short local399 = this.aShortArray55[local206];
										@Pc(404) short local404 = this.aShortArray64[local206];
										local211 = local106[local249];
										@Pc(413) byte local413 = this.aByteArray38[local206];
										local218 = local106[local249 + 1];
										@Pc(429) int local429;
										for (@Pc(421) int local421 = local211; local421 < local218; local421++) {
											local429 = local109[local421] - 1;
											if (local429 == -1) {
												break;
											}
											if (local83[local429] != 0) {
												local79[local429] += local394;
												local81[local429] += local399;
												local85[local429] += local404;
												local83[local429] += local413;
											}
										}
										local218 = this.anIntArray225[local135 + 1];
										local394 = local36[local272];
										local399 = local39[local272];
										local413 = local45[local272];
										local211 = this.anIntArray225[local135];
										local404 = local42[local272];
										for (local429 = local211; local429 < local218; local429++) {
											@Pc(511) int local511 = this.aShortArray54[local429] - 1;
											if (local511 == -1) {
												break;
											}
											if (local50[local511] != 0) {
												local52[local511] += local394;
												local56[local511] += local399;
												local54[local511] += local404;
												local50[local511] += local413;
											}
										}
										local8.method3716();
										this.method3716();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort38 = (short) arg0;
		this.method3721();
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
	private void method3719() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt4387; local23++) {
			@Pc(30) int local30 = this.anIntArray226[local23];
			@Pc(35) int local35 = this.anIntArray223[local23];
			if (local35 > local15) {
				local15 = local35;
			}
			@Pc(45) int local45 = this.anIntArray224[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local9 > local35) {
				local9 = local35;
			}
			if (local30 < local7) {
				local7 = local30;
			}
			if (local45 > local17) {
				local17 = local45;
			}
			if (local45 < local11) {
				local11 = local45;
			}
			@Pc(90) int local90 = local30 * local30 + local45 * local45;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local30 * local30 + local45 * local45 + local35 * local35;
			if (local21 < local90) {
				local21 = local90;
			}
		}
		this.anInt4396 = local15;
		this.anInt4393 = local13;
		this.anInt4380 = local17;
		this.anInt4363 = local11;
		this.anInt4370 = local9;
		this.anInt4394 = local7;
		this.anInt4367 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt4384 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean360 = true;
	}

	@OriginalMember(owner = "client!hq", name = "e", descriptor = "(I)V")
	public void method3720() {
		if (this.aClass78_2 != null) {
			this.aClass78_2.method1976();
		}
		if (this.aClass78_3 != null) {
			this.aClass78_3.method1976();
		}
		if (this.aClass78_4 != null) {
			this.aClass78_4.method1976();
		}
		if (this.aClass78_1 != null) {
			this.aClass78_1.method1976();
		}
		if (this.aClass253_1 != null) {
			this.aClass253_1.method5907();
		}
	}

	@OriginalMember(owner = "client!hq", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4387; local3++) {
			if (arg0 != 128) {
				this.anIntArray226[local3] = arg0 * this.anIntArray226[local3] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray223[local3] = arg1 * this.anIntArray223[local3] >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray224[local3] = this.anIntArray224[local3] * arg2 >> 7;
			}
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "()V")
	@Override
	public void method8584() {
		if (this.anInt4375 > 0 && this.anInt4361 > 0) {
			this.method3733();
			this.method3723();
			this.method3732();
		}
	}

	@OriginalMember(owner = "client!hq", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub3_Sub7 ba(@OriginalArg(0) Class5_Sub3_Sub7 arg0) {
		if (this.anInt4375 == 0) {
			return null;
		}
		if (!this.aBoolean360) {
			this.method3719();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass65_Sub2_8.anInt5265 <= 0) {
			local40 = this.anInt4394 - (this.anInt4370 * this.aClass65_Sub2_8.anInt5265 >> 8) >> this.aClass65_Sub2_8.anInt5270;
			local57 = this.anInt4393 - (this.aClass65_Sub2_8.anInt5265 * this.anInt4396 >> 8) >> this.aClass65_Sub2_8.anInt5270;
		} else {
			local40 = this.anInt4394 - (this.aClass65_Sub2_8.anInt5265 * this.anInt4396 >> 8) >> this.aClass65_Sub2_8.anInt5270;
			local57 = this.anInt4393 - (this.anInt4370 * this.aClass65_Sub2_8.anInt5265 >> 8) >> this.aClass65_Sub2_8.anInt5270;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass65_Sub2_8.anInt5237 <= 0) {
			local113 = this.anInt4363 - (this.aClass65_Sub2_8.anInt5237 * this.anInt4370 >> 8) >> this.aClass65_Sub2_8.anInt5270;
			local130 = this.anInt4380 - (this.aClass65_Sub2_8.anInt5237 * this.anInt4396 >> 8) >> this.aClass65_Sub2_8.anInt5270;
		} else {
			local113 = this.anInt4363 - (this.aClass65_Sub2_8.anInt5237 * this.anInt4396 >> 8) >> this.aClass65_Sub2_8.anInt5270;
			local130 = this.anInt4380 - (this.anInt4370 * this.aClass65_Sub2_8.anInt5237 >> 8) >> this.aClass65_Sub2_8.anInt5270;
		}
		@Pc(173) int local173 = local57 + 1 - local40;
		@Pc(180) int local180 = local130 + 1 - local113;
		@Pc(183) Class5_Sub3_Sub7_Sub1 local183 = (Class5_Sub3_Sub7_Sub1) arg0;
		@Pc(193) Class5_Sub3_Sub7_Sub1 local193;
		if (local183 != null && local183.method3898(local173, local180)) {
			local193 = local183;
			local183.method3892();
		} else {
			local193 = new Class5_Sub3_Sub7_Sub1(this.aClass65_Sub2_8, local173, local180);
		}
		local193.method3895(local57, local130, local113, local40);
		this.method3727(local193);
		return local193;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!oha;ZII)Z")
	@Override
	public boolean method8590(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method3718(arg2, arg5, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!hq", name = "f", descriptor = "(I)V")
	private void method3721() {
		if (this.aClass78_4 != null) {
			this.aClass78_4.aBoolean205 = false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4387; local7++) {
			if (arg0 != 0) {
				this.anIntArray226[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray223[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray224[local7] += arg2;
			}
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!oha;Lclient!vu;I)V")
	@Override
	public void method8585(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class28_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt4375 == 0) {
			return;
		}
		@Pc(16) Class254_Sub2 local16 = this.aClass65_Sub2_8.aClass254_Sub2_16;
		if (!this.aBoolean360) {
			this.method3719();
		}
		@Pc(25) Class254_Sub2 local25 = (Class254_Sub2) arg0;
		Static50.aFloat5 = local16.aFloat147 + local25.aFloat147 * local16.aFloat148 + local16.aFloat154 * local25.aFloat152 + local25.aFloat146 * local16.aFloat155;
		Static626.aFloat208 = local25.aFloat144 * local16.aFloat155 + local25.aFloat145 * local16.aFloat154 + local25.aFloat154 * local16.aFloat148;
		@Pc(72) float local72 = Static50.aFloat5 + Static626.aFloat208 * (float) this.anInt4370;
		@Pc(80) float local80 = Static50.aFloat5 + Static626.aFloat208 * (float) this.anInt4396;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local91 = local80 - (float) this.anInt4367;
			local97 = local72 + (float) this.anInt4367;
		} else {
			local91 = (float) -this.anInt4367 + local72;
			local97 = (float) this.anInt4367 + local80;
		}
		if (this.aClass65_Sub2_8.aFloat103 <= local91 || (float) this.aClass65_Sub2_8.anInt5242 >= local97) {
			return;
		}
		Static166.aFloat85 = local25.aFloat145 * local16.aFloat144 + local16.aFloat153 * local25.aFloat144 + local25.aFloat154 * local16.aFloat151;
		Static365.aFloat125 = local16.aFloat146 + local16.aFloat153 * local25.aFloat146 + local16.aFloat144 * local25.aFloat152 + local25.aFloat147 * local16.aFloat151;
		@Pc(173) float local173 = Static365.aFloat125 + (float) this.anInt4370 * Static166.aFloat85;
		@Pc(181) float local181 = Static365.aFloat125 + (float) this.anInt4396 * Static166.aFloat85;
		@Pc(197) float local197;
		@Pc(208) float local208;
		if (local181 < local173) {
			local197 = ((float) -this.anInt4367 + local181) * (float) this.aClass65_Sub2_8.anInt5258;
			local208 = (local173 + (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5258;
		} else {
			local208 = ((float) this.anInt4367 + local181) * (float) this.aClass65_Sub2_8.anInt5258;
			local197 = (local173 - (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5258;
		}
		if (this.aClass65_Sub2_8.aFloat109 <= local197 / local97 || this.aClass65_Sub2_8.aFloat105 >= local208 / local97) {
			return;
		}
		Static348.aFloat120 = local16.aFloat152 + local16.aFloat150 * local25.aFloat147 + local25.aFloat146 * local16.aFloat149 + local16.aFloat145 * local25.aFloat152;
		Static105.aFloat66 = local16.aFloat150 * local25.aFloat154 + local25.aFloat144 * local16.aFloat149 + local16.aFloat145 * local25.aFloat145;
		@Pc(297) float local297 = Static348.aFloat120 + Static105.aFloat66 * (float) this.anInt4370;
		@Pc(305) float local305 = (float) this.anInt4396 * Static105.aFloat66 + Static348.aFloat120;
		@Pc(332) float local332;
		@Pc(320) float local320;
		if (local305 < local297) {
			local320 = ((float) this.anInt4367 + local297) * (float) this.aClass65_Sub2_8.anInt5259;
			local332 = ((float) -this.anInt4367 + local305) * (float) this.aClass65_Sub2_8.anInt5259;
		} else {
			local320 = (local305 + (float) this.anInt4367) * (float) this.aClass65_Sub2_8.anInt5259;
			local332 = (float) this.aClass65_Sub2_8.anInt5259 * ((float) -this.anInt4367 + local297);
		}
		if (local332 / local97 >= this.aClass65_Sub2_8.bf || this.aClass65_Sub2_8.aFloat110 >= local320 / local97) {
			return;
		}
		if (arg1 != null || this.aClass189Array1 != null) {
			Static363.aFloat192 = local25.aFloat153 * local16.aFloat149 + local25.aFloat149 * local16.aFloat145 + local25.aFloat155 * local16.aFloat150;
			Static643.aFloat211 = local16.aFloat148 * local25.aFloat155 + local25.aFloat153 * local16.aFloat155 + local16.aFloat154 * local25.aFloat149;
			Static483.aFloat166 = local25.aFloat148 * local16.aFloat148 + local25.aFloat150 * local16.aFloat154 + local25.aFloat151 * local16.aFloat155;
			Static256.aFloat96 = local16.aFloat151 * local25.aFloat155 + local25.aFloat153 * local16.aFloat153 + local25.aFloat149 * local16.aFloat144;
			Static209.aFloat173 = local16.aFloat150 * local25.aFloat148 + local25.aFloat150 * local16.aFloat145 + local25.aFloat151 * local16.aFloat149;
			Static191.aFloat87 = local16.aFloat151 * local25.aFloat148 + local16.aFloat144 * local25.aFloat150 + local16.aFloat153 * local25.aFloat151;
		}
		if (arg1 != null) {
			@Pc(492) boolean local492 = false;
			@Pc(494) boolean local494 = true;
			@Pc(502) int local502 = this.anInt4394 + this.anInt4393 >> 1;
			@Pc(510) int local510 = this.anInt4380 + this.anInt4363 >> 1;
			@Pc(529) int local529 = (int) (Static256.aFloat96 * (float) local502 + Static365.aFloat125 + (float) this.anInt4370 * Static166.aFloat85 + Static191.aFloat87 * (float) local510);
			@Pc(548) int local548 = (int) (Static209.aFloat173 * (float) local510 + (float) local502 * Static363.aFloat192 + Static348.aFloat120 + Static105.aFloat66 * (float) this.anInt4370);
			@Pc(567) int local567 = (int) (Static626.aFloat208 * (float) this.anInt4370 + (float) local502 * Static643.aFloat211 + Static50.aFloat5 + Static483.aFloat166 * (float) local510);
			if (this.aClass65_Sub2_8.anInt5242 <= local567) {
				arg1.anInt10431 = this.aClass65_Sub2_8.anInt5238 + this.aClass65_Sub2_8.anInt5258 * local529 / local567;
				arg1.anInt10433 = local548 * this.aClass65_Sub2_8.anInt5259 / local567 + this.aClass65_Sub2_8.anInt5262;
			} else {
				local492 = true;
			}
			@Pc(621) int local621 = (int) (Static191.aFloat87 * (float) local510 + Static365.aFloat125 + Static256.aFloat96 * (float) local502 + (float) this.anInt4396 * Static166.aFloat85);
			@Pc(640) int local640 = (int) (Static105.aFloat66 * (float) this.anInt4396 + Static348.aFloat120 + Static363.aFloat192 * (float) local502 + Static209.aFloat173 * (float) local510);
			@Pc(659) int local659 = (int) ((float) local510 * Static483.aFloat166 + (float) this.anInt4396 * Static626.aFloat208 + (float) local502 * Static643.aFloat211 + Static50.aFloat5);
			if (local659 < this.aClass65_Sub2_8.anInt5242) {
				local492 = true;
			} else {
				arg1.anInt10432 = this.aClass65_Sub2_8.anInt5238 + this.aClass65_Sub2_8.anInt5258 * local621 / local659;
				arg1.anInt10430 = this.aClass65_Sub2_8.anInt5262 + this.aClass65_Sub2_8.anInt5259 * local640 / local659;
			}
			if (local492) {
				if (local567 < this.aClass65_Sub2_8.anInt5242 && this.aClass65_Sub2_8.anInt5242 > local659) {
					local494 = false;
				} else {
					@Pc(744) int local744;
					@Pc(755) int local755;
					@Pc(766) int local766;
					if (this.aClass65_Sub2_8.anInt5242 > local567) {
						local744 = (local659 - this.aClass65_Sub2_8.anInt5242 << 16) / (local659 - local567);
						local755 = local621 + (local744 * (local621 - local529) >> 16);
						local766 = ((local640 - local548) * local744 >> 16) + local640;
						arg1.anInt10431 = local755 * this.aClass65_Sub2_8.anInt5258 / this.aClass65_Sub2_8.anInt5242 + this.aClass65_Sub2_8.anInt5238;
						arg1.anInt10433 = this.aClass65_Sub2_8.anInt5259 * local766 / this.aClass65_Sub2_8.anInt5242 + this.aClass65_Sub2_8.anInt5262;
					} else if (local659 < this.aClass65_Sub2_8.anInt5242) {
						local744 = (local567 - this.aClass65_Sub2_8.anInt5242 << 16) / (local567 - local659);
						local755 = (local744 * (local529 - local621) >> 16) + local529;
						local766 = local548 + ((local548 - local640) * local744 >> 16);
						arg1.anInt10431 = local755 * this.aClass65_Sub2_8.anInt5258 / this.aClass65_Sub2_8.anInt5242 + this.aClass65_Sub2_8.anInt5238;
						arg1.anInt10433 = this.aClass65_Sub2_8.anInt5262 + this.aClass65_Sub2_8.anInt5259 * local766 / this.aClass65_Sub2_8.anInt5242;
					}
				}
			}
			if (local494) {
				if (local659 < local567) {
					arg1.anInt10434 = this.aClass65_Sub2_8.anInt5258 * (local529 + this.anInt4367) / local567 + this.aClass65_Sub2_8.anInt5238 - arg1.anInt10431;
				} else {
					arg1.anInt10434 = this.aClass65_Sub2_8.anInt5238 + (this.anInt4367 + local621) * this.aClass65_Sub2_8.anInt5258 / local659 - arg1.anInt10432;
				}
				arg1.aBoolean890 = true;
			}
		}
		this.aClass65_Sub2_8.method4412();
		this.aClass65_Sub2_8.method4460(local25);
		this.method3731();
		this.method3728();
	}

	@OriginalMember(owner = "client!hq", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4380;
	}

	@OriginalMember(owner = "client!hq", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort38;
	}

	@OriginalMember(owner = "client!hq", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static87.anInt6205 = 0;
			Static670.anInt10763 = 0;
			Static578.anInt9489 = 0;
			local30 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray19.length) {
					local48 = this.anIntArrayArray19[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray61 == null || (this.aShortArray61[local56] & arg6) != 0) {
							Static578.anInt9489 += this.anIntArray226[local56];
							Static87.anInt6205 += this.anIntArray223[local56];
							Static670.anInt10763 += this.anIntArray224[local56];
							local30++;
						}
					}
				}
			}
			if (local30 <= 0) {
				Static578.anInt9489 = arg2;
				Static87.anInt6205 = arg3;
				Static670.anInt10763 = arg4;
			} else {
				Static321.aBoolean533 = true;
				Static87.anInt6205 = arg3 + Static87.anInt6205 / local30;
				Static578.anInt9489 = arg2 + Static578.anInt9489 / local30;
				Static670.anInt10763 = arg4 + Static670.anInt10763 / local30;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local30 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg2 * arg7[3] + arg7[4] * arg3 + 8192 >> 14;
				local38 = arg3 * arg7[7] + arg7[6] * arg2 + arg7[8] * arg4 + 8192 >> 14;
				arg3 = local32;
				arg2 = local30;
				arg4 = local38;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray19.length > local32) {
					local247 = this.anIntArrayArray19[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray61 == null || (this.aShortArray61[local50] & arg6) != 0) {
							this.anIntArray226[local50] += arg2;
							this.anIntArray223[local50] += arg3;
							this.anIntArray224[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(381) int local381;
		@Pc(399) int local399;
		@Pc(623) int local623;
		@Pc(632) int local632;
		@Pc(645) int local645;
		@Pc(649) int local649;
		@Pc(667) int local667;
		@Pc(1000) int local1000;
		@Pc(1008) int local1008;
		@Pc(1162) int local1162;
		@Pc(1188) int local1188;
		@Pc(1192) int local1192;
		@Pc(1201) int local1201;
		@Pc(1206) int local1206;
		@Pc(1210) int local1210;
		@Pc(1214) int local1214;
		@Pc(1216) int local1216;
		@Pc(1345) int[] local1345;
		@Pc(1347) int local1347;
		@Pc(1351) int local1351;
		@Pc(1355) int local1355;
		@Pc(1357) int local1357;
		@Pc(1489) int local1489;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray19.length > local32) {
						local247 = this.anIntArrayArray19[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray61 == null || (this.aShortArray61[local50] & arg6) != 0) {
								this.anIntArray226[local50] -= Static578.anInt9489;
								this.anIntArray223[local50] -= Static87.anInt6205;
								this.anIntArray224[local50] -= Static670.anInt10763;
								if (arg4 != 0) {
									local56 = Class200.anIntArray337[arg4];
									local381 = Class200.anIntArray338[arg4];
									local399 = this.anIntArray223[local50] * local56 + local381 * this.anIntArray226[local50] + 16383 >> 14;
									this.anIntArray223[local50] = local381 * this.anIntArray223[local50] + 16383 - this.anIntArray226[local50] * local56 >> 14;
									this.anIntArray226[local50] = local399;
								}
								if (arg2 != 0) {
									local56 = Class200.anIntArray337[arg2];
									local381 = Class200.anIntArray338[arg2];
									local399 = local381 * this.anIntArray223[local50] + 16383 - this.anIntArray224[local50] * local56 >> 14;
									this.anIntArray224[local50] = local381 * this.anIntArray224[local50] + local56 * this.anIntArray223[local50] + 16383 >> 14;
									this.anIntArray223[local50] = local399;
								}
								if (arg3 != 0) {
									local56 = Class200.anIntArray337[arg3];
									local381 = Class200.anIntArray338[arg3];
									local399 = local56 * this.anIntArray224[local50] + local381 * this.anIntArray226[local50] + 16383 >> 14;
									this.anIntArray224[local50] = local381 * this.anIntArray224[local50] + 16383 - local56 * this.anIntArray226[local50] >> 14;
									this.anIntArray226[local50] = local399;
								}
								this.anIntArray226[local50] += Static578.anInt9489;
								this.anIntArray223[local50] += Static87.anInt6205;
								this.anIntArray224[local50] += Static670.anInt10763;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray19.length > local38) {
							local48 = this.anIntArrayArray19[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local56]) != 0) {
									local381 = this.anIntArray225[local56];
									local399 = this.anIntArray225[local56 + 1];
									for (local623 = local381; local623 < local399; local623++) {
										local632 = this.aShortArray54[local623] - 1;
										if (local632 == -1) {
											break;
										}
										if (arg4 != 0) {
											local645 = Class200.anIntArray337[arg4];
											local649 = Class200.anIntArray338[arg4];
											local667 = local649 * this.aShortArray65[local632] + this.aShortArray55[local632] * local645 + 16383 >> 14;
											this.aShortArray55[local632] = (short) (this.aShortArray55[local632] * local649 + 16383 - local645 * this.aShortArray65[local632] >> 14);
											this.aShortArray65[local632] = (short) local667;
										}
										if (arg2 != 0) {
											local645 = Class200.anIntArray337[arg2];
											local649 = Class200.anIntArray338[arg2];
											local667 = local649 * this.aShortArray55[local632] + 16383 - local645 * this.aShortArray64[local632] >> 14;
											this.aShortArray64[local632] = (short) (local645 * this.aShortArray55[local632] + local649 * this.aShortArray64[local632] + 16383 >> 14);
											this.aShortArray55[local632] = (short) local667;
										}
										if (arg3 != 0) {
											local645 = Class200.anIntArray337[arg3];
											local649 = Class200.anIntArray338[arg3];
											local667 = this.aShortArray64[local632] * local645 + local649 * this.aShortArray65[local632] + 16383 >> 14;
											this.aShortArray64[local632] = (short) (local649 * this.aShortArray64[local632] + 16383 - local645 * this.aShortArray65[local632] >> 14);
											this.aShortArray65[local632] = (short) local667;
										}
									}
								}
							}
						}
					}
					this.method3716();
					return;
				}
			} else {
				local30 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static321.aBoolean533) {
					local381 = Static670.anInt10763 * arg7[6] + arg7[0] * Static578.anInt9489 + arg7[3] * Static87.anInt6205 + 8192 >> 14;
					local399 = arg7[1] * Static578.anInt9489 + Static87.anInt6205 * arg7[4] + Static670.anInt10763 * arg7[7] + 8192 >> 14;
					local381 += local249;
					local399 += local50;
					local623 = arg7[2] * Static578.anInt9489 + arg7[5] * Static87.anInt6205 + Static670.anInt10763 * arg7[8] + 8192 >> 14;
					Static87.anInt6205 = local399;
					Static578.anInt9489 = local381;
					local623 += local56;
					Static670.anInt10763 = local623;
					Static321.aBoolean533 = false;
				}
				@Pc(968) int[] local968 = new int[9];
				local399 = Class200.anIntArray338[arg2];
				local623 = Class200.anIntArray337[arg2];
				local632 = Class200.anIntArray338[arg3];
				local645 = Class200.anIntArray337[arg3];
				local649 = Class200.anIntArray338[arg4];
				local667 = Class200.anIntArray337[arg4];
				local1000 = local623 * local649 + 8192 >> 14;
				local1008 = local667 * local623 + 8192 >> 14;
				local968[0] = local649 * local632 + local645 * local1008 + 8192 >> 14;
				local968[8] = local399 * local632 + 8192 >> 14;
				local968[4] = local649 * local399 + 8192 >> 14;
				local968[2] = local399 * local645 + 8192 >> 14;
				local968[5] = -local623;
				local968[1] = local645 * local1000 + local667 * -local632 + 8192 >> 14;
				local968[7] = local632 * local1000 + local667 * local645 + 8192 >> 14;
				local968[6] = local632 * local1008 + -local645 * local649 + 8192 >> 14;
				local968[3] = local399 * local667 + 8192 >> 14;
				@Pc(1137) int local1137 = local968[2] * -Static670.anInt10763 + -Static578.anInt9489 * local968[0] + -Static87.anInt6205 * local968[1] + 8192 >> 14;
				local1162 = local968[5] * -Static670.anInt10763 + -Static87.anInt6205 * local968[4] + -Static578.anInt9489 * local968[3] + 8192 >> 14;
				local1188 = local968[6] * -Static578.anInt9489 + local968[7] * -Static87.anInt6205 + local968[8] * -Static670.anInt10763 + 8192 >> 14;
				local1192 = Static578.anInt9489 + local1137;
				@Pc(1197) int local1197 = local1162 + Static87.anInt6205;
				local1201 = Static670.anInt10763 + local1188;
				@Pc(1204) int[] local1204 = new int[9];
				for (local1206 = 0; local1206 < 3; local1206++) {
					for (local1210 = 0; local1210 < 3; local1210++) {
						local1214 = 0;
						for (local1216 = 0; local1216 < 3; local1216++) {
							local1214 += local968[local1206 * 3 + local1216] * arg7[local1216 + local1210 * 3];
						}
						local1204[local1210 + local1206 * 3] = local1214 + 8192 >> 14;
					}
				}
				local1210 = local249 * local968[0] + local50 * local968[1] + local56 * local968[2] + 8192 >> 14;
				local1214 = local50 * local968[4] + local249 * local968[3] + local968[5] * local56 + 8192 >> 14;
				local1214 += local1197;
				local1216 = local968[6] * local249 + local968[7] * local50 + local968[8] * local56 + 8192 >> 14;
				local1210 += local1192;
				local1216 += local1201;
				local1345 = new int[9];
				for (local1347 = 0; local1347 < 3; local1347++) {
					for (local1351 = 0; local1351 < 3; local1351++) {
						local1355 = 0;
						for (local1357 = 0; local1357 < 3; local1357++) {
							local1355 += arg7[local1357 + local1347 * 3] * local1204[local1351 + local1357 * 3];
						}
						local1345[local1347 * 3 + local1351] = local1355 + 8192 >> 14;
					}
				}
				local1351 = arg7[0] * local1210 + arg7[1] * local1214 + local1216 * arg7[2] + 8192 >> 14;
				local1355 = arg7[3] * local1210 + local1214 * arg7[4] + arg7[5] * local1216 + 8192 >> 14;
				local1351 += local30;
				local1357 = arg7[8] * local1216 + local1210 * arg7[6] + arg7[7] * local1214 + 8192 >> 14;
				local1355 += local32;
				local1357 += local38;
				for (local1489 = 0; local1489 < local8; local1489++) {
					@Pc(1495) int local1495 = arg1[local1489];
					if (this.anIntArrayArray19.length > local1495) {
						@Pc(1505) int[] local1505 = this.anIntArrayArray19[local1495];
						for (@Pc(1507) int local1507 = 0; local1507 < local1505.length; local1507++) {
							@Pc(1513) int local1513 = local1505[local1507];
							if (this.aShortArray61 == null || (this.aShortArray61[local1513] & arg6) != 0) {
								@Pc(1558) int local1558 = local1345[0] * this.anIntArray226[local1513] + this.anIntArray223[local1513] * local1345[1] + local1345[2] * this.anIntArray224[local1513] + 8192 >> 14;
								@Pc(1589) int local1589 = this.anIntArray224[local1513] * local1345[5] + local1345[4] * this.anIntArray223[local1513] + local1345[3] * this.anIntArray226[local1513] + 8192 >> 14;
								@Pc(1593) int local1593 = local1589 + local1355;
								@Pc(1597) int local1597 = local1558 + local1351;
								@Pc(1629) int local1629 = this.anIntArray223[local1513] * local1345[7] + this.anIntArray226[local1513] * local1345[6] + local1345[8] * this.anIntArray224[local1513] + 8192 >> 14;
								this.anIntArray226[local1513] = local1597;
								@Pc(1638) int local1638 = local1629 + local1357;
								this.anIntArray223[local1513] = local1593;
								this.anIntArray224[local1513] = local1638;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2557) Class141 local2557;
			@Pc(2450) boolean local2450;
			@Pc(2552) Class189 local2552;
			if (arg0 == 5) {
				if (this.anIntArrayArray17 != null) {
					local2450 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray17.length > local38) {
							local48 = this.anIntArrayArray17[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray56 == null || (this.aShortArray56[local56] & arg6) != 0) {
									local381 = (this.aByteArray39[local56] & 0xFF) + arg2 * 8;
									if (local381 < 0) {
										local381 = 0;
									} else if (local381 > 255) {
										local381 = 255;
									}
									this.aByteArray39[local56] = (byte) local381;
								}
							}
							local2450 |= local48.length > 0;
						}
					}
					if (local2450) {
						if (this.aClass189Array1 != null) {
							for (local38 = 0; local38 < this.anInt4385; local38++) {
								local2552 = this.aClass189Array1[local38];
								local2557 = this.aClass141Array1[local38];
								local2557.anInt3915 = 255 - (this.aByteArray39[local2552.anInt5808] & 0xFF) << 24 | local2557.anInt3915 & 0xFFFFFF;
							}
						}
						this.method3721();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray17 != null) {
					local2450 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray17.length > local38) {
							local48 = this.anIntArrayArray17[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray56 == null || (arg6 & this.aShortArray56[local56]) != 0) {
									local381 = this.aShortArray60[local56] & 0xFFFF;
									local399 = local381 >> 10 & 0x3F;
									local623 = local381 >> 7 & 0x7;
									@Pc(2664) int local2664 = arg2 + local399 & 0x3F;
									local623 += arg3 / 4;
									local632 = local381 & 0x7F;
									local632 += arg4;
									if (local623 < 0) {
										local623 = 0;
									} else if (local623 > 7) {
										local623 = 7;
									}
									if (local632 < 0) {
										local632 = 0;
									} else if (local632 > 127) {
										local632 = 127;
									}
									this.aShortArray60[local56] = (short) (local632 | local2664 << 10 | local623 << 7);
								}
							}
							local2450 |= local48.length > 0;
						}
					}
					if (local2450) {
						if (this.aClass189Array1 != null) {
							for (local38 = 0; local38 < this.anInt4385; local38++) {
								local2552 = this.aClass189Array1[local38];
								local2557 = this.aClass141Array1[local38];
								local2557.anInt3915 = local2557.anInt3915 & 0xFF000000 | Static336.anIntArray357[this.aShortArray60[local2552.anInt5808] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method3721();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray18 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (this.anIntArrayArray18.length > local32) {
							local247 = this.anIntArrayArray18[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2557 = this.aClass141Array1[local247[local249]];
								local2557.anInt3914 += arg3;
								local2557.anInt3909 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray18 != null) {
					for (local30 = 0; local30 < local8; local30++) {
						local32 = arg1[local30];
						if (local32 < this.anIntArrayArray18.length) {
							local247 = this.anIntArrayArray18[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2557 = this.aClass141Array1[local247[local249]];
								local2557.anInt3912 = local2557.anInt3912 * arg3 >> 7;
								local2557.anInt3911 = local2557.anInt3911 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray18 != null) {
				for (local30 = 0; local30 < local8; local30++) {
					local32 = arg1[local30];
					if (this.anIntArrayArray18.length > local32) {
						local247 = this.anIntArrayArray18[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local2557 = this.aClass141Array1[local247[local249]];
							local2557.anInt3908 = local2557.anInt3908 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local30 = 0; local30 < local8; local30++) {
				local32 = arg1[local30];
				if (this.anIntArrayArray19.length > local32) {
					local247 = this.anIntArrayArray19[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray61 == null || (arg6 & this.aShortArray61[local50]) != 0) {
							this.anIntArray226[local50] -= Static578.anInt9489;
							this.anIntArray223[local50] -= Static87.anInt6205;
							this.anIntArray224[local50] -= Static670.anInt10763;
							this.anIntArray226[local50] = arg2 * this.anIntArray226[local50] >> 7;
							this.anIntArray223[local50] = arg3 * this.anIntArray223[local50] >> 7;
							this.anIntArray224[local50] = arg4 * this.anIntArray224[local50] >> 7;
							this.anIntArray226[local50] += Static578.anInt9489;
							this.anIntArray223[local50] += Static87.anInt6205;
							this.anIntArray224[local50] += Static670.anInt10763;
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
			if (Static321.aBoolean533) {
				local381 = arg7[6] * Static670.anInt10763 + arg7[3] * Static87.anInt6205 + arg7[0] * Static578.anInt9489 + 8192 >> 14;
				local399 = arg7[4] * Static87.anInt6205 + arg7[1] * Static578.anInt9489 + arg7[7] * Static670.anInt10763 + 8192 >> 14;
				local623 = Static578.anInt9489 * arg7[2] + Static87.anInt6205 * arg7[5] + arg7[8] * Static670.anInt10763 + 8192 >> 14;
				local381 += local249;
				local399 += local50;
				Static87.anInt6205 = local399;
				Static578.anInt9489 = local381;
				local623 += local56;
				Static670.anInt10763 = local623;
				Static321.aBoolean533 = false;
			}
			local381 = arg2 << 15 >> 7;
			local399 = arg3 << 15 >> 7;
			local623 = arg4 << 15 >> 7;
			local632 = -Static578.anInt9489 * local381 + 8192 >> 14;
			local645 = local399 * -Static87.anInt6205 + 8192 >> 14;
			local649 = local623 * -Static670.anInt10763 + 8192 >> 14;
			local667 = local632 + Static578.anInt9489;
			local1000 = Static87.anInt6205 + local645;
			local1008 = local649 + Static670.anInt10763;
			@Pc(1980) int[] local1980 = new int[] { arg7[0] * local381 + 8192 >> 14, arg7[3] * local381 + 8192 >> 14, local381 * arg7[6] + 8192 >> 14, local399 * arg7[1] + 8192 >> 14, local399 * arg7[4] + 8192 >> 14, arg7[7] * local399 + 8192 >> 14, arg7[2] * local623 + 8192 >> 14, local623 * arg7[5] + 8192 >> 14, local623 * arg7[8] + 8192 >> 14 };
			local1162 = local381 * local249 + 8192 >> 14;
			local1188 = local50 * local399 + 8192 >> 14;
			@Pc(2108) int local2108 = local1188 + local1000;
			@Pc(2112) int local2112 = local1162 + local667;
			local1192 = local56 * local623 + 8192 >> 14;
			@Pc(2124) int local2124 = local1192 + local1008;
			@Pc(2127) int[] local2127 = new int[9];
			@Pc(2133) int local2133;
			for (local1201 = 0; local1201 < 3; local1201++) {
				for (local2133 = 0; local2133 < 3; local2133++) {
					local1206 = 0;
					for (local1210 = 0; local1210 < 3; local1210++) {
						local1206 += arg7[local1201 * 3 + local1210] * local1980[local2133 + local1210 * 3];
					}
					local2127[local1201 * 3 + local2133] = local1206 + 8192 >> 14;
				}
			}
			local2133 = local2124 * arg7[2] + arg7[1] * local2108 + arg7[0] * local2112 + 8192 >> 14;
			local1206 = local2124 * arg7[5] + arg7[3] * local2112 + arg7[4] * local2108 + 8192 >> 14;
			local2133 += local30;
			local1210 = arg7[7] * local2108 + local2112 * arg7[6] + arg7[8] * local2124 + 8192 >> 14;
			local1206 += local32;
			local1210 += local38;
			for (local1214 = 0; local1214 < local8; local1214++) {
				local1216 = arg1[local1214];
				if (local1216 < this.anIntArrayArray19.length) {
					local1345 = this.anIntArrayArray19[local1216];
					for (local1347 = 0; local1347 < local1345.length; local1347++) {
						local1351 = local1345[local1347];
						if (this.aShortArray61 == null || (this.aShortArray61[local1351] & arg6) != 0) {
							local1355 = local2127[2] * this.anIntArray224[local1351] + this.anIntArray223[local1351] * local2127[1] + local2127[0] * this.anIntArray226[local1351] + 8192 >> 14;
							local1357 = local2127[3] * this.anIntArray226[local1351] + local2127[4] * this.anIntArray223[local1351] + local2127[5] * this.anIntArray224[local1351] + 8192 >> 14;
							@Pc(2372) int local2372 = local1355 + local2133;
							local1489 = local2127[8] * this.anIntArray224[local1351] + this.anIntArray223[local1351] * local2127[7] + this.anIntArray226[local1351] * local2127[6] + 8192 >> 14;
							@Pc(2407) int local2407 = local1357 + local1206;
							@Pc(2411) int local2411 = local1489 + local1210;
							this.anIntArray226[local1351] = local2372;
							this.anIntArray223[local1351] = local2407;
							this.anIntArray224[local1351] = local2411;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4387; local15++) {
			@Pc(34) int local34 = this.anIntArray223[local15] * local13 - this.anIntArray224[local15] * local9 >> 14;
			this.anIntArray224[local15] = local9 * this.anIntArray223[local15] + this.anIntArray224[local15] * local13 >> 14;
			this.anIntArray223[local15] = local34;
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4367;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "()Z")
	@Override
	public boolean method8576() {
		if (this.aShortArray58 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray58.length; local12++) {
			if (this.aShortArray58[local12] != -1 && !this.aClass65_Sub2_8.anInterface4_11.method359(this.aShortArray58[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)Z")
	private boolean method3723() {
		if (this.aClass253_1.aBoolean618) {
			return true;
		}
		if (this.aClass253_1.anInterface12_5 == null) {
			this.aClass253_1.anInterface12_5 = this.aClass65_Sub2_8.method4364(this.aBoolean358);
		}
		@Pc(28) Interface12 local28 = this.aClass253_1.anInterface12_5;
		local28.method8239(this.anInt4361 * 6);
		@Pc(48) Buffer local48 = local28.method900();
		if (local48 != null) {
			@Pc(56) Stream local56 = this.aClass65_Sub2_8.method4457(local48);
			@Pc(60) int local60;
			if (Stream.c()) {
				for (local60 = 0; local60 < this.anInt4361; local60++) {
					local56.e(this.aShortArray63[local60]);
					local56.e(this.aShortArray59[local60]);
					local56.e(this.aShortArray53[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt4361; local60++) {
					local56.b(this.aShortArray63[local60]);
					local56.b(this.aShortArray59[local60]);
					local56.b(this.aShortArray53[local60]);
				}
			}
			local56.a();
			if (local28.method903()) {
				this.aClass253_1.anInterface12_4 = local28;
				this.aBoolean357 = true;
				this.aClass253_1.aBoolean618 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hq", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4396;
	}

	@OriginalMember(owner = "client!hq", name = "b", descriptor = "(B)V")
	private void method3725() {
		if (this.aClass78_2 != null) {
			this.aClass78_2.aBoolean205 = false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4370;
	}

	@OriginalMember(owner = "client!hq", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort39;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!oha;)V")
	@Override
	public void method8589(@OriginalArg(0) Class254 arg0) {
		@Pc(8) Class254_Sub2 local8 = (Class254_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass313Array1 != null) {
			for (local13 = 0; local13 < this.aClass313Array1.length; local13++) {
				@Pc(20) Class313 local20 = this.aClass313Array1[local13];
				@Pc(22) Class313 local22 = local20;
				if (local20.aClass313_1 != null) {
					local22 = local20.aClass313_1;
				}
				local22.anInt8778 = (int) (local8.aFloat146 + (float) this.anIntArray223[local20.anInt8781] * local8.aFloat144 + local8.aFloat153 * (float) this.anIntArray226[local20.anInt8781] + (float) this.anIntArray224[local20.anInt8781] * local8.aFloat151);
				local22.anInt8790 = (int) (local8.aFloat150 * (float) this.anIntArray224[local20.anInt8781] + local8.aFloat149 * (float) this.anIntArray226[local20.anInt8781] + (float) this.anIntArray223[local20.anInt8781] * local8.aFloat145 + local8.aFloat152);
				local22.anInt8779 = (int) (local8.aFloat148 * (float) this.anIntArray224[local20.anInt8781] + (float) this.anIntArray223[local20.anInt8781] * local8.aFloat154 + local8.aFloat155 * (float) this.anIntArray226[local20.anInt8781] + local8.aFloat147);
				local22.anInt8788 = (int) ((float) this.anIntArray224[local20.anInt8793] * local8.aFloat151 + (float) this.anIntArray226[local20.anInt8793] * local8.aFloat153 + (float) this.anIntArray223[local20.anInt8793] * local8.aFloat144 + local8.aFloat146);
				local22.anInt8777 = (int) ((float) this.anIntArray224[local20.anInt8793] * local8.aFloat150 + local8.aFloat149 * (float) this.anIntArray226[local20.anInt8793] + local8.aFloat145 * (float) this.anIntArray223[local20.anInt8793] + local8.aFloat152);
				local22.anInt8783 = (int) (local8.aFloat154 * (float) this.anIntArray223[local20.anInt8793] + local8.aFloat155 * (float) this.anIntArray226[local20.anInt8793] + local8.aFloat148 * (float) this.anIntArray224[local20.anInt8793] + local8.aFloat147);
				local22.anInt8784 = (int) (local8.aFloat151 * (float) this.anIntArray224[local20.anInt8786] + (float) this.anIntArray223[local20.anInt8786] * local8.aFloat144 + local8.aFloat153 * (float) this.anIntArray226[local20.anInt8786] + local8.aFloat146);
				local22.anInt8789 = (int) ((float) this.anIntArray224[local20.anInt8786] * local8.aFloat150 + (float) this.anIntArray223[local20.anInt8786] * local8.aFloat145 + local8.aFloat149 * (float) this.anIntArray226[local20.anInt8786] + local8.aFloat152);
				local22.anInt8780 = (int) (local8.aFloat155 * (float) this.anIntArray226[local20.anInt8786] + (float) this.anIntArray223[local20.anInt8786] * local8.aFloat154 + (float) this.anIntArray224[local20.anInt8786] * local8.aFloat148 + local8.aFloat147);
			}
		}
		if (this.aClass209Array1 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass209Array1.length; local13++) {
			@Pc(365) Class209 local365 = this.aClass209Array1[local13];
			@Pc(367) Class209 local367 = local365;
			if (local365.aClass209_1 != null) {
				local367 = local365.aClass209_1;
			}
			if (local365.aClass254_4 == null) {
				local365.aClass254_4 = local8.method7353();
			} else {
				local365.aClass254_4.method7356(local8);
			}
			local367.anInt6176 = (int) (local8.aFloat146 + local8.aFloat144 * (float) this.anIntArray223[local365.anInt6178] + local8.aFloat153 * (float) this.anIntArray226[local365.anInt6178] + (float) this.anIntArray224[local365.anInt6178] * local8.aFloat151);
			local367.anInt6174 = (int) (local8.aFloat145 * (float) this.anIntArray223[local365.anInt6178] + (float) this.anIntArray226[local365.anInt6178] * local8.aFloat149 + (float) this.anIntArray224[local365.anInt6178] * local8.aFloat150 + local8.aFloat152);
			local367.anInt6182 = (int) ((float) this.anIntArray223[local365.anInt6178] * local8.aFloat154 + local8.aFloat155 * (float) this.anIntArray226[local365.anInt6178] + (float) this.anIntArray224[local365.anInt6178] * local8.aFloat148 + local8.aFloat147);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILclient!oha;ZI)Z")
	@Override
	public boolean method8593(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class254 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method3718(arg2, -1, arg0, arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass78_2 != null) {
			this.aClass78_2.aBoolean206 = Static399.method5900(arg0, this.anInt4360);
		}
		if (this.aClass78_3 != null) {
			this.aClass78_3.aBoolean206 = Static528.method7441(this.anInt4360, arg0);
		}
		if (this.aClass78_4 != null) {
			this.aClass78_4.aBoolean206 = Static135.method2404(arg0, this.anInt4360);
		}
		if (this.aClass78_1 != null) {
			this.aClass78_1.aBoolean206 = Static189.method3159(this.anInt4360, arg0);
		}
		this.anInt4348 = arg0;
		this.aBoolean357 = true;
		if (this.aClass148_1 != null && (this.anInt4348 & 0x10000) == 0) {
			this.aByteArray38 = this.aClass148_1.aByteArray34;
			this.aShortArray64 = this.aClass148_1.aShortArray51;
			this.aShortArray65 = this.aClass148_1.aShortArray50;
			this.aShortArray55 = this.aClass148_1.aShortArray49;
			this.aClass148_1 = null;
		}
		this.method3732();
	}

	@OriginalMember(owner = "client!hq", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4363;
	}

	@OriginalMember(owner = "client!hq", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4376; local7++) {
			if (this.aShortArray60[local7] == arg0) {
				this.aShortArray60[local7] = arg1;
			}
		}
		if (this.aClass189Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt4385; local30++) {
				@Pc(37) Class189 local37 = this.aClass189Array1[local30];
				@Pc(42) Class141 local42 = this.aClass141Array1[local30];
				local42.anInt3915 = Static336.anIntArray357[this.aShortArray60[local37.anInt5808] & 0xFFFF] & 0xFFFFFF | local42.anInt3915 & 0xFF000000;
			}
		}
		this.method3721();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!ig;Z)V")
	private void method3727(@OriginalArg(0) Class5_Sub3_Sub7_Sub1 arg0) {
		if (this.anInt4375 > Static331.anIntArray346.length) {
			Static465.anIntArray444 = new int[this.anInt4375];
			Static331.anIntArray346 = new int[this.anInt4375];
		}
		@Pc(58) int local58;
		@Pc(97) int local97;
		@Pc(106) int local106;
		for (@Pc(32) int local32 = 0; local32 < this.anInt4387; local32++) {
			local58 = (this.anIntArray226[local32] - (this.anIntArray223[local32] * this.aClass65_Sub2_8.anInt5265 >> 8) >> this.aClass65_Sub2_8.anInt5270) - arg0.anInt4611;
			@Pc(83) int local83 = (this.anIntArray224[local32] - (this.anIntArray223[local32] * this.aClass65_Sub2_8.anInt5237 >> 8) >> this.aClass65_Sub2_8.anInt5270) - arg0.anInt4613;
			@Pc(88) int local88 = this.anIntArray225[local32];
			@Pc(95) int local95 = this.anIntArray225[local32 + 1];
			for (local97 = local88; local97 < local95; local97++) {
				local106 = this.aShortArray54[local97] - 1;
				if (local106 == -1) {
					break;
				}
				Static331.anIntArray346[local106] = local58;
				Static465.anIntArray444[local106] = local83;
			}
		}
		for (local58 = 0; local58 < this.anInt4361; local58++) {
			if (this.aByteArray39 == null || this.aByteArray39[local58] <= 128) {
				@Pc(149) short local149 = this.aShortArray63[local58];
				@Pc(154) short local154 = this.aShortArray59[local58];
				@Pc(159) short local159 = this.aShortArray53[local58];
				local97 = Static331.anIntArray346[local149];
				local106 = Static331.anIntArray346[local154];
				@Pc(171) int local171 = Static331.anIntArray346[local159];
				@Pc(175) int local175 = Static465.anIntArray444[local149];
				@Pc(179) int local179 = Static465.anIntArray444[local154];
				@Pc(183) int local183 = Static465.anIntArray444[local159];
				if (-((local179 - local175) * (-local106 + local171)) + (local97 - local106) * (local179 - local183) > 0) {
					arg0.method3896(local179, local171, local175, local183, local106, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(B)V")
	private void method3728() {
		if (this.aClass189Array1 == null) {
			return;
		}
		this.aClass65_Sub2_8.C(!this.aBoolean359);
		this.aClass65_Sub2_8.method4372(false);
		this.aClass65_Sub2_8.method4400(Static413.aClass64_3, 1);
		this.aClass65_Sub2_8.method4369(1, Static413.aClass64_3);
		for (@Pc(32) int local32 = 0; local32 < this.anInt4385; local32++) {
			@Pc(39) Class189 local39 = this.aClass189Array1[local32];
			@Pc(44) Class141 local44 = this.aClass141Array1[local32];
			if (!local39.aBoolean505 || !this.aClass65_Sub2_8.method6934()) {
				@Pc(72) float local72 = (float) (this.anIntArray226[local39.anInt5806] + this.anIntArray226[local39.anInt5807] + this.anIntArray226[local39.anInt5804]) * 0.3333333F;
				@Pc(93) float local93 = (float) (this.anIntArray223[local39.anInt5806] + this.anIntArray223[local39.anInt5807] + this.anIntArray223[local39.anInt5804]) * 0.3333333F;
				@Pc(114) float local114 = (float) (this.anIntArray224[local39.anInt5806] + this.anIntArray224[local39.anInt5804] + this.anIntArray224[local39.anInt5807]) * 0.3333333F;
				@Pc(128) float local128 = Static365.aFloat125 + local93 * Static166.aFloat85 + Static256.aFloat96 * local72 + local114 * Static191.aFloat87;
				@Pc(142) float local142 = local114 * Static209.aFloat173 + Static105.aFloat66 * local93 + local72 * Static363.aFloat192 + Static348.aFloat120;
				@Pc(156) float local156 = Static50.aFloat5 + Static483.aFloat166 * local114 + Static626.aFloat208 * local93 + local72 * Static643.aFloat211;
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local142 * local142 + local128 * local128 + local156 * local156))) * (float) local39.anInt5805;
				@Pc(182) Class254_Sub2 local182 = this.aClass65_Sub2_8.method4471();
				local182.method6241(local142 + (float) local44.anInt3914 - local177 * local142, local39.aShort51 * local44.anInt3911 >> 7, local39.aShort52 * local44.anInt3912 >> 7, (float) local44.anInt3909 + local128 - local128 * local177, local44.anInt3908, local156 - local156 * local177);
				local182.method6229(this.aClass65_Sub2_8.aClass254_Sub2_17);
				this.aClass65_Sub2_8.method4434();
				@Pc(243) int local243 = local44.anInt3915;
				this.aClass65_Sub2_8.method4446(false, local39.aShort53, false);
				this.aClass65_Sub2_8.method4419(local39.aByte86);
				this.aClass65_Sub2_8.method4455(local243);
				this.aClass65_Sub2_8.method4394();
			}
		}
		this.aClass65_Sub2_8.method4369(1, Static169.aClass64_1);
		this.aClass65_Sub2_8.method4400(Static169.aClass64_1, 1);
		this.aClass65_Sub2_8.C(true);
	}

	@OriginalMember(owner = "client!hq", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean359;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!su;IIFFIBIIJ)S")
	private short method3730(@OriginalArg(0) int arg0, @OriginalArg(1) Class329 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) long arg9) {
		@Pc(10) int local10 = this.anIntArray225[arg6];
		@Pc(17) int local17 = this.anIntArray225[arg6 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray54[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg9 == Static407.aLongArray21[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray54[local19] = (short) (this.anInt4375 + 1);
		Static407.aLongArray21[local19] = arg9;
		this.aShortArray57[this.anInt4375] = (short) arg8;
		this.aShortArray62[this.anInt4375] = (short) arg6;
		this.aShortArray65[this.anInt4375] = (short) arg7;
		this.aShortArray55[this.anInt4375] = (short) arg0;
		this.aShortArray64[this.anInt4375] = (short) arg2;
		this.aByteArray38[this.anInt4375] = (byte) arg3;
		this.aFloatArray35[this.anInt4375] = arg5;
		this.aFloatArray36[this.anInt4375] = arg4;
		return (short) this.anInt4375++;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt4387; local15++) {
			@Pc(34) int local34 = this.anIntArray224[local15] * local9 + local13 * this.anIntArray226[local15] >> 14;
			this.anIntArray224[local15] = this.anIntArray224[local15] * local13 - local9 * this.anIntArray226[local15] >> 14;
			this.anIntArray226[local15] = local34;
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "h", descriptor = "(I)V")
	private void method3731() {
		if (this.anInt4361 == 0) {
			return;
		}
		if (this.method3733() && this.method3723()) {
			this.aClass65_Sub2_8.method4427(0, this.aClass78_2.anInterface3_8);
			this.aClass65_Sub2_8.method4427(1, this.aClass78_4.anInterface3_8);
			this.aClass65_Sub2_8.method4427(2, this.aClass78_3.anInterface3_8);
			@Pc(61) boolean local61;
			if ((this.anInt4360 & 0x37) == 0) {
				this.aClass65_Sub2_8.method4372(false);
				local61 = false;
				this.aClass65_Sub2_8.method4447(this.aClass65_Sub2_8.aClass69_16);
			} else {
				local61 = true;
				this.aClass65_Sub2_8.method4372(true);
				this.aClass65_Sub2_8.method4427(3, this.aClass78_1.anInterface3_8);
				this.aClass65_Sub2_8.method4447(this.aClass65_Sub2_8.aClass69_15);
			}
			for (@Pc(94) int local94 = 0; local94 < this.anIntArray222.length; local94++) {
				@Pc(101) int local101 = this.lb[local94];
				@Pc(108) int local108 = this.lb[local94 + 1];
				@Pc(115) int local115 = this.aShortArray58[local101] & 0xFFFF;
				if (local115 == 65535) {
					local115 = -1;
				}
				this.aClass65_Sub2_8.method4446(true, local115, local61);
				this.aClass65_Sub2_8.method4398(local101 * 3, this.anIntArray227[local94], this.anIntArray222[local94], Static72.aClass155_1, this.aClass253_1.anInterface12_4, local108 - local101);
			}
		}
		this.method3732();
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "()[Lclient!ld;")
	@Override
	public Class209[] method8587() {
		return this.aClass209Array1;
	}

	@OriginalMember(owner = "client!hq", name = "i", descriptor = "(I)V")
	private void method3732() {
		if (!this.aBoolean357) {
			return;
		}
		this.aBoolean357 = false;
		if (this.aClass313Array1 == null && this.aClass209Array1 == null && this.aClass189Array1 == null && !Static458.method6571(this.anInt4360, this.anInt4348)) {
			@Pc(32) boolean local32 = false;
			@Pc(34) boolean local34 = false;
			@Pc(36) boolean local36 = false;
			if (this.anIntArray226 != null && !Static288.method4660(this.anInt4348, this.anInt4360)) {
				if (this.aClass78_2 == null || this.aClass78_2.method1977()) {
					if (!this.aBoolean360) {
						this.method3719();
					}
					local32 = true;
				} else {
					this.aBoolean357 = true;
				}
			}
			if (this.anIntArray223 != null && !Static614.method8352(this.anInt4360, this.anInt4348)) {
				if (this.aClass78_2 == null || this.aClass78_2.method1977()) {
					if (!this.aBoolean360) {
						this.method3719();
					}
					local34 = true;
				} else {
					this.aBoolean357 = true;
				}
			}
			if (this.anIntArray224 != null && !Static557.method7719(this.anInt4348, this.anInt4360)) {
				if (this.aClass78_2 == null || this.aClass78_2.method1977()) {
					if (!this.aBoolean360) {
						this.method3719();
					}
					local36 = true;
				} else {
					this.aBoolean357 = true;
				}
			}
			if (local32) {
				this.anIntArray226 = null;
			}
			if (local34) {
				this.anIntArray223 = null;
			}
			if (local36) {
				this.anIntArray224 = null;
			}
		}
		if (this.aShortArray54 != null && this.anIntArray226 == null && this.anIntArray223 == null && this.anIntArray224 == null) {
			this.aShortArray54 = null;
			this.anIntArray225 = null;
		}
		if (this.aByteArray38 != null && !Static478.method6829(this.anInt4360, this.anInt4348)) {
			label209: {
				label208: {
					@Pc(196) boolean local196;
					if ((this.anInt4360 & 0x37) == 0) {
						if (this.aClass78_4 == null || this.aClass78_4.method1977()) {
							break label208;
						}
						local196 = false;
					} else {
						if (this.aClass78_1 == null || this.aClass78_1.method1977()) {
							break label208;
						}
						local196 = false;
					}
					if (!local196) {
						this.aBoolean357 = true;
						break label209;
					}
				}
				this.aShortArray65 = this.aShortArray55 = this.aShortArray64 = null;
				this.aByteArray38 = null;
			}
		}
		if (this.aShortArray60 != null && !Static458.method6568(this.anInt4348, this.anInt4360)) {
			if (this.aClass78_4 == null || this.aClass78_4.method1977()) {
				this.aShortArray60 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.aByteArray39 != null && !Static220.method3766(this.anInt4360, this.anInt4348)) {
			if (this.aClass78_4 == null || this.aClass78_4.method1977()) {
				this.aByteArray39 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.aFloatArray35 != null && !Static419.method6247(this.anInt4360, this.anInt4348)) {
			if (this.aClass78_3 == null || this.aClass78_3.method1977()) {
				this.aFloatArray35 = this.aFloatArray36 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.aShortArray58 != null && !Static334.method5126(this.anInt4348, this.anInt4360)) {
			if (this.aClass78_4 == null || this.aClass78_4.method1977()) {
				this.aShortArray58 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.aShortArray63 != null && !Static474.method6794(this.anInt4360, this.anInt4348)) {
			if ((this.aClass253_1 == null || this.aClass253_1.method5909()) && (this.aClass78_4 == null || this.aClass78_4.method1977())) {
				this.aShortArray63 = this.aShortArray59 = this.aShortArray53 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.aShortArray62 != null) {
			if (this.aClass78_2 == null || this.aClass78_2.method1977()) {
				this.aShortArray62 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.aShortArray57 != null) {
			if (this.aClass78_4 == null || this.aClass78_4.method1977()) {
				this.aShortArray57 = null;
			} else {
				this.aBoolean357 = true;
			}
		}
		if (this.anIntArrayArray17 != null && !Static301.method4798(this.anInt4348, this.anInt4360)) {
			this.anIntArrayArray17 = null;
			this.aShortArray56 = null;
		}
		if (this.anIntArrayArray19 != null && !Static443.method6450(this.anInt4360, this.anInt4348)) {
			this.anIntArrayArray19 = null;
			this.aShortArray61 = null;
		}
		if (this.anIntArrayArray18 != null && !Static678.method9038(this.anInt4348, this.anInt4360)) {
			this.anIntArrayArray18 = null;
		}
		if (this.lb != null && (this.anInt4348 & 0x800) == 0 && (this.anInt4348 & 0x40000) == 0) {
			this.lb = null;
			this.anIntArray222 = null;
			this.anIntArray227 = null;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8596(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(22) int local22;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			local22 = arg2 << 4;
			local24 = 0;
			Static87.anInt6205 = 0;
			Static670.anInt10763 = 0;
			Static578.anInt9489 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray19.length > local38) {
					local48 = this.anIntArrayArray19[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static578.anInt9489 += this.anIntArray226[local56];
						Static87.anInt6205 += this.anIntArray223[local56];
						Static670.anInt10763 += this.anIntArray224[local56];
						local24++;
					}
				}
			}
			if (local24 > 0) {
				Static87.anInt6205 = local14 + Static87.anInt6205 / local24;
				Static578.anInt9489 = local22 + Static578.anInt9489 / local24;
				Static670.anInt10763 = Static670.anInt10763 / local24 + local18;
			} else {
				Static87.anInt6205 = local14;
				Static670.anInt10763 = local18;
				Static578.anInt9489 = local22;
			}
			return;
		}
		@Pc(154) int[] local154;
		@Pc(156) int local156;
		if (arg0 == 1) {
			local22 = arg2 << 4;
			local14 = arg3 << 4;
			local18 = arg4 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray19.length) {
					local154 = this.anIntArrayArray19[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray226[local50] += local22;
						this.anIntArray223[local50] += local14;
						this.anIntArray224[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(750) int local750;
		@Pc(759) int local759;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray19.length) {
					local154 = this.anIntArrayArray19[local32];
					if ((arg5 & 0x1) == 0) {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray226[local50] -= Static578.anInt9489;
							this.anIntArray223[local50] -= Static87.anInt6205;
							this.anIntArray224[local50] -= Static670.anInt10763;
							if (arg4 != 0) {
								local56 = Class200.anIntArray337[arg4];
								local274 = Class200.anIntArray338[arg4];
								local292 = local56 * this.anIntArray223[local50] + this.anIntArray226[local50] * local274 + 16383 >> 14;
								this.anIntArray223[local50] = this.anIntArray223[local50] * local274 + 16383 - this.anIntArray226[local50] * local56 >> 14;
								this.anIntArray226[local50] = local292;
							}
							if (arg2 != 0) {
								local56 = Class200.anIntArray337[arg2];
								local274 = Class200.anIntArray338[arg2];
								local292 = this.anIntArray223[local50] * local274 + 16383 - local56 * this.anIntArray224[local50] >> 14;
								this.anIntArray224[local50] = this.anIntArray223[local50] * local56 + local274 * this.anIntArray224[local50] + 16383 >> 14;
								this.anIntArray223[local50] = local292;
							}
							if (arg3 != 0) {
								local56 = Class200.anIntArray337[arg3];
								local274 = Class200.anIntArray338[arg3];
								local292 = local274 * this.anIntArray226[local50] + this.anIntArray224[local50] * local56 + 16383 >> 14;
								this.anIntArray224[local50] = this.anIntArray224[local50] * local274 + 16383 - local56 * this.anIntArray226[local50] >> 14;
								this.anIntArray226[local50] = local292;
							}
							this.anIntArray226[local50] += Static578.anInt9489;
							this.anIntArray223[local50] += Static87.anInt6205;
							this.anIntArray224[local50] += Static670.anInt10763;
						}
					} else {
						for (local156 = 0; local156 < local154.length; local156++) {
							local50 = local154[local156];
							this.anIntArray226[local50] -= Static578.anInt9489;
							this.anIntArray223[local50] -= Static87.anInt6205;
							this.anIntArray224[local50] -= Static670.anInt10763;
							if (arg2 != 0) {
								local56 = Class200.anIntArray337[arg2];
								local274 = Class200.anIntArray338[arg2];
								local292 = this.anIntArray223[local50] * local274 + 16383 - local56 * this.anIntArray224[local50] >> 14;
								this.anIntArray224[local50] = this.anIntArray223[local50] * local56 + local274 * this.anIntArray224[local50] + 16383 >> 14;
								this.anIntArray223[local50] = local292;
							}
							if (arg4 != 0) {
								local56 = Class200.anIntArray337[arg4];
								local274 = Class200.anIntArray338[arg4];
								local292 = local56 * this.anIntArray223[local50] + local274 * this.anIntArray226[local50] + 16383 >> 14;
								this.anIntArray223[local50] = local274 * this.anIntArray223[local50] + 16383 - local56 * this.anIntArray226[local50] >> 14;
								this.anIntArray226[local50] = local292;
							}
							if (arg3 != 0) {
								local56 = Class200.anIntArray337[arg3];
								local274 = Class200.anIntArray338[arg3];
								local292 = local274 * this.anIntArray226[local50] + local56 * this.anIntArray224[local50] + 16383 >> 14;
								this.anIntArray224[local50] = local274 * this.anIntArray224[local50] + 16383 - this.anIntArray226[local50] * local56 >> 14;
								this.anIntArray226[local50] = local292;
							}
							this.anIntArray226[local50] += Static578.anInt9489;
							this.anIntArray223[local50] += Static87.anInt6205;
							this.anIntArray224[local50] += Static670.anInt10763;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray19.length > local38) {
						local48 = this.anIntArrayArray19[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local274 = this.anIntArray225[local56];
							local292 = this.anIntArray225[local56 + 1];
							for (local750 = local274; local750 < local292; local750++) {
								local759 = this.aShortArray54[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(790) int local790;
								if (arg4 != 0) {
									local768 = Class200.anIntArray337[arg4];
									local772 = Class200.anIntArray338[arg4];
									local790 = local772 * this.aShortArray65[local759] + this.aShortArray55[local759] * local768 + 16383 >> 14;
									this.aShortArray55[local759] = (short) (this.aShortArray55[local759] * local772 + 16383 - local768 * this.aShortArray65[local759] >> 14);
									this.aShortArray65[local759] = (short) local790;
								}
								if (arg2 != 0) {
									local768 = Class200.anIntArray337[arg2];
									local772 = Class200.anIntArray338[arg2];
									local790 = local772 * this.aShortArray55[local759] + 16383 - this.aShortArray64[local759] * local768 >> 14;
									this.aShortArray64[local759] = (short) (local772 * this.aShortArray64[local759] + local768 * this.aShortArray55[local759] + 16383 >> 14);
									this.aShortArray55[local759] = (short) local790;
								}
								if (arg3 != 0) {
									local768 = Class200.anIntArray337[arg3];
									local772 = Class200.anIntArray338[arg3];
									local790 = local772 * this.aShortArray65[local759] + local768 * this.aShortArray64[local759] + 16383 >> 14;
									this.aShortArray64[local759] = (short) (this.aShortArray64[local759] * local772 + 16383 - local768 * this.aShortArray65[local759] >> 14);
									this.aShortArray65[local759] = (short) local790;
								}
							}
						}
					}
				}
				this.method3716();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray19.length) {
					local154 = this.anIntArrayArray19[local32];
					for (local156 = 0; local156 < local154.length; local156++) {
						local50 = local154[local156];
						this.anIntArray226[local50] -= Static578.anInt9489;
						this.anIntArray223[local50] -= Static87.anInt6205;
						this.anIntArray224[local50] -= Static670.anInt10763;
						this.anIntArray226[local50] = arg2 * this.anIntArray226[local50] >> 7;
						this.anIntArray223[local50] = arg3 * this.anIntArray223[local50] >> 7;
						this.anIntArray224[local50] = this.anIntArray224[local50] * arg4 >> 7;
						this.anIntArray226[local50] += Static578.anInt9489;
						this.anIntArray223[local50] += Static87.anInt6205;
						this.anIntArray224[local50] += Static670.anInt10763;
					}
				}
			}
		} else {
			@Pc(1206) Class141 local1206;
			@Pc(1098) boolean local1098;
			@Pc(1201) Class189 local1201;
			if (arg0 == 5) {
				if (this.anIntArrayArray17 != null) {
					local1098 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray17.length > local38) {
							local48 = this.anIntArrayArray17[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local274 = (this.aByteArray39[local56] & 0xFF) + (arg2 * 8);
								if (local274 < 0) {
									local274 = 0;
								} else if (local274 > 255) {
									local274 = 255;
								}
								this.aByteArray39[local56] = (byte) local274;
							}
							local1098 |= local48.length > 0;
						}
					}
					if (local1098) {
						if (this.aClass189Array1 != null) {
							for (local38 = 0; local38 < this.anInt4385; local38++) {
								local1201 = this.aClass189Array1[local38];
								local1206 = this.aClass141Array1[local38];
								local1206.anInt3915 = local1206.anInt3915 & 0xFFFFFF | 255 - (this.aByteArray39[local1201.anInt5808] & 0xFF) << 24;
							}
						}
						this.method3721();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray17 != null) {
					local1098 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray17.length > local38) {
							local48 = this.anIntArrayArray17[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local274 = this.aShortArray60[local56] & 0xFFFF;
								local292 = local274 >> 10 & 0x3F;
								local750 = local274 >> 7 & 0x7;
								local750 += arg3 / 4;
								local759 = local274 & 0x7F;
								@Pc(1311) int local1311 = local292 + arg2 & 0x3F;
								if (local750 < 0) {
									local750 = 0;
								} else if (local750 > 7) {
									local750 = 7;
								}
								local759 += arg4;
								if (local759 < 0) {
									local759 = 0;
								} else if (local759 > 127) {
									local759 = 127;
								}
								this.aShortArray60[local56] = (short) (local1311 << 10 | local750 << 7 | local759);
							}
							local1098 |= local48.length > 0;
						}
					}
					if (local1098) {
						if (this.aClass189Array1 != null) {
							for (local38 = 0; local38 < this.anInt4385; local38++) {
								local1201 = this.aClass189Array1[local38];
								local1206 = this.aClass141Array1[local38];
								local1206.anInt3915 = Static336.anIntArray357[this.aShortArray60[local1201.anInt5808] & 0xFFFF] & 0xFFFFFF | local1206.anInt3915 & 0xFF000000;
							}
						}
						this.method3721();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray18 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray18.length > local32) {
							local154 = this.anIntArrayArray18[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1206 = this.aClass141Array1[local154[local156]];
								local1206.anInt3909 += arg2;
								local1206.anInt3914 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray18 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray18.length) {
							local154 = this.anIntArrayArray18[local32];
							for (local156 = 0; local156 < local154.length; local156++) {
								local1206 = this.aClass141Array1[local154[local156]];
								local1206.anInt3911 = arg2 * local1206.anInt3911 >> 7;
								local1206.anInt3912 = local1206.anInt3912 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray18 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray18.length > local32) {
						local154 = this.anIntArrayArray18[local32];
						for (local156 = 0; local156 < local154.length; local156++) {
							local1206 = this.aClass141Array1[local154[local156]];
							local1206.anInt3908 = arg2 + local1206.anInt3908 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass65_Sub2_8.anInterface4_11;
		for (@Pc(11) int local11 = 0; local11 < this.anInt4376; local11++) {
			if (arg0 == this.aShortArray58[local11]) {
				this.aShortArray58[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class136 local47 = local9.method358(arg0 & 0xFFFF);
			local35 = local47.aByte55;
			local37 = local47.aByte51;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class136 local68 = local9.method358(arg1 & 0xFFFF);
			local57 = local68.aByte51;
			if (local68.aByte52 != 0 || local68.aByte53 != 0) {
				this.aBoolean356 = true;
			}
			local55 = local68.aByte55;
		}
		if (!(local37 != local57 | local35 != local55)) {
			return;
		}
		if (this.aClass189Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt4385; local109++) {
				@Pc(116) Class189 local116 = this.aClass189Array1[local109];
				@Pc(121) Class141 local121 = this.aClass141Array1[local109];
				local121.anInt3915 = Static336.anIntArray357[this.aShortArray60[local116.anInt5808] & 0xFFFF] & 0xFFFFFF | local121.anInt3915 & 0xFF000000;
			}
		}
		this.method3721();
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt4376; local7++) {
			local16 = this.aShortArray60[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			@Pc(32) int local32 = local16 & 0x7F;
			if (arg1 != -1) {
				local28 += arg3 * (arg1 - local28) >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			if (arg2 != -1) {
				local32 += arg3 * (arg2 - local32) >> 7;
			}
			this.aShortArray60[local7] = (short) (local28 << 7 | local22 << 10 | local32);
		}
		if (this.aClass189Array1 != null) {
			for (local16 = 0; local16 < this.anInt4385; local16++) {
				@Pc(106) Class189 local106 = this.aClass189Array1[local16];
				@Pc(111) Class141 local111 = this.aClass141Array1[local16];
				local111.anInt3915 = local111.anInt3915 & 0xFF000000 | Static336.anIntArray357[this.aShortArray60[local106.anInt5808] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method3721();
	}

	@OriginalMember(owner = "client!hq", name = "j", descriptor = "(I)Z")
	private boolean method3733() {
		@Pc(13) boolean local13 = !this.aClass78_4.aBoolean205;
		@Pc(26) boolean local26 = (this.anInt4360 & 0x37) != 0 && !this.aClass78_1.aBoolean205;
		@Pc(34) boolean local34 = !this.aClass78_2.aBoolean205;
		@Pc(48) boolean local48 = !this.aClass78_3.aBoolean205;
		if (!local34 && !local13 && !local26 && !local48) {
			return true;
		}
		@Pc(60) boolean local60 = true;
		@Pc(79) Interface3 local79;
		@Pc(93) Buffer local93;
		if (local34) {
			if (this.aClass78_2.anInterface3_7 == null) {
				this.aClass78_2.anInterface3_7 = this.aClass65_Sub2_8.method4374(this.aBoolean358);
			}
			local79 = this.aClass78_2.anInterface3_7;
			local79.method8244(this.anInt4375 * 12, 12);
			local93 = local79.method8245();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass65_Sub2_8.aNativeInterface3.copyPositions(this.anIntArray226, this.anIntArray223, this.anIntArray224, this.aShortArray62, 0, 12, this.anInt4375, local93.getAddress());
				if (local79.method8243()) {
					this.aClass78_2.aBoolean205 = true;
					this.aClass78_2.anInterface3_8 = local79;
				} else {
					local60 = false;
				}
			}
		}
		@Pc(182) short[] local182;
		@Pc(188) short[] local188;
		@Pc(185) short[] local185;
		@Pc(191) byte[] local191;
		if (local13) {
			if (this.aClass78_4.anInterface3_7 == null) {
				this.aClass78_4.anInterface3_7 = this.aClass65_Sub2_8.method4374(this.aBoolean358);
			}
			local79 = this.aClass78_4.anInterface3_7;
			local79.method8244(this.anInt4375 * 4, 4);
			local93 = local79.method8245();
			if (local93 == null) {
				local60 = false;
			} else {
				if ((this.anInt4360 & 0x37) == 0) {
					if (this.aClass148_1 == null) {
						local182 = this.aShortArray65;
						local185 = this.aShortArray64;
						local188 = this.aShortArray55;
						local191 = this.aByteArray38;
					} else {
						local182 = this.aClass148_1.aShortArray50;
						local188 = this.aClass148_1.aShortArray49;
						local185 = this.aClass148_1.aShortArray51;
						local191 = this.aClass148_1.aByteArray34;
					}
					this.aClass65_Sub2_8.aNativeInterface3.copyLighting(this.aShortArray60, this.aByteArray39, this.aShortArray58, local182, local188, local185, local191, this.aShort38, this.aShort39, this.aShortArray57, 0, 4, this.anInt4375, local93.getAddress());
				} else {
					this.aClass65_Sub2_8.aNativeInterface3.copyColours(this.aShortArray60, this.aByteArray39, this.aShortArray58, this.aShort38, this.aShortArray57, 0, 4, this.anInt4375, local93.getAddress());
				}
				if (local79.method8243()) {
					this.aClass78_4.aBoolean205 = true;
					this.aClass78_4.anInterface3_8 = local79;
				} else {
					local60 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass78_1.anInterface3_7 == null) {
				this.aClass78_1.anInterface3_7 = this.aClass65_Sub2_8.method4374(this.aBoolean358);
			}
			local79 = this.aClass78_1.anInterface3_7;
			local79.method8244(this.anInt4375 * 12, 12);
			local93 = local79.method8245();
			if (local93 == null) {
				local60 = false;
			} else {
				if (this.aClass148_1 == null) {
					local185 = this.aShortArray64;
					local191 = this.aByteArray38;
					local182 = this.aShortArray65;
					local188 = this.aShortArray55;
				} else {
					local182 = this.aClass148_1.aShortArray50;
					local191 = this.aClass148_1.aByteArray34;
					local185 = this.aClass148_1.aShortArray51;
					local188 = this.aClass148_1.aShortArray49;
				}
				this.aClass65_Sub2_8.aNativeInterface3.copyNormals(local182, local188, local185, local191, 3.0F / (float) this.aShort39, 3.0F / (float) (this.aShort39 + this.aShort39 / 2), 0, 12, this.anInt4375, local93.getAddress());
				if (local79.method8243()) {
					this.aClass78_1.anInterface3_8 = local79;
					this.aClass78_1.aBoolean205 = true;
				} else {
					local60 = false;
				}
			}
		}
		if (local48) {
			if (this.aClass78_3.anInterface3_7 == null) {
				this.aClass78_3.anInterface3_7 = this.aClass65_Sub2_8.method4374(this.aBoolean358);
			}
			local79 = this.aClass78_3.anInterface3_7;
			local79.method8244(this.anInt4375 * 8, 8);
			local93 = local79.method8245();
			if (local93 == null) {
				local60 = false;
			} else {
				this.aClass65_Sub2_8.aNativeInterface3.copyTexCoords(this.aFloatArray35, this.aFloatArray36, 0, 8, this.anInt4375, local93.getAddress());
				if (local79.method8243()) {
					this.aClass78_3.anInterface3_8 = local79;
					this.aClass78_3.aBoolean205 = true;
				} else {
					local60 = false;
				}
			}
		}
		return local60;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ZZILclient!hq;Lclient!hq;B)Lclient!ka;")
	private Class153 method3734(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class153_Sub1 arg3, @OriginalArg(4) Class153_Sub1 arg4) {
		arg4.anInt4360 = this.anInt4360;
		arg4.anInt4361 = this.anInt4361;
		arg4.anInt4375 = this.anInt4375;
		arg4.anInt4359 = this.anInt4359;
		arg4.aShort38 = this.aShort38;
		if ((arg2 & 0x100) == 0) {
			arg4.aBoolean359 = this.aBoolean359;
		} else {
			arg4.aBoolean359 = true;
		}
		arg4.anInt4385 = this.anInt4385;
		arg4.anInt4387 = this.anInt4387;
		arg4.aShort39 = this.aShort39;
		arg4.aBoolean356 = this.aBoolean356;
		arg4.anInt4348 = arg2;
		arg4.anInt4376 = this.anInt4376;
		@Pc(70) boolean local70 = Static169.method2949(arg2, this.anInt4360);
		@Pc(76) boolean local76 = Static378.method5638(arg2, this.anInt4360);
		@Pc(82) boolean local82 = Static270.method4167(this.anInt4360, arg2);
		@Pc(88) boolean local88 = local70 | local76 | local82;
		@Pc(193) int local193;
		if (local88) {
			if (!local70) {
				arg4.anIntArray226 = this.anIntArray226;
			} else if (arg3.anIntArray226 == null || arg3.anIntArray226.length < this.anInt4359) {
				arg4.anIntArray226 = arg3.anIntArray226 = new int[this.anInt4359];
			} else {
				arg4.anIntArray226 = arg3.anIntArray226;
			}
			if (!local76) {
				arg4.anIntArray223 = this.anIntArray223;
			} else if (arg3.anIntArray223 == null || arg3.anIntArray223.length < this.anInt4359) {
				arg4.anIntArray223 = arg3.anIntArray223 = new int[this.anInt4359];
			} else {
				arg4.anIntArray223 = arg3.anIntArray223;
			}
			if (!local82) {
				arg4.anIntArray224 = this.anIntArray224;
			} else if (arg3.anIntArray224 == null || this.anInt4359 > arg3.anIntArray224.length) {
				arg4.anIntArray224 = arg3.anIntArray224 = new int[this.anInt4359];
			} else {
				arg4.anIntArray224 = arg3.anIntArray224;
			}
			for (local193 = 0; local193 < this.anInt4359; local193++) {
				if (local70) {
					arg4.anIntArray226[local193] = this.anIntArray226[local193];
				}
				if (local76) {
					arg4.anIntArray223[local193] = this.anIntArray223[local193];
				}
				if (local82) {
					arg4.anIntArray224[local193] = this.anIntArray224[local193];
				}
			}
		} else {
			arg4.anIntArray224 = this.anIntArray224;
			arg4.anIntArray223 = this.anIntArray223;
			arg4.anIntArray226 = this.anIntArray226;
		}
		if (Static399.method5900(arg2, this.anInt4360)) {
			arg4.aClass78_2 = arg3.aClass78_2;
			arg4.aClass78_2.aBoolean205 = this.aClass78_2.aBoolean205;
			arg4.aClass78_2.anInterface3_8 = this.aClass78_2.anInterface3_8;
			arg4.aClass78_2.aBoolean206 = true;
		} else if (Static195.method3231(arg2, this.anInt4360)) {
			arg4.aClass78_2 = this.aClass78_2;
		} else {
			arg4.aClass78_2 = null;
		}
		if (Static297.method4773(arg2, this.anInt4360)) {
			if (arg3.aShortArray60 == null || this.anInt4376 > arg3.aShortArray60.length) {
				arg4.aShortArray60 = arg3.aShortArray60 = new short[this.anInt4376];
			} else {
				arg4.aShortArray60 = arg3.aShortArray60;
			}
			for (local193 = 0; local193 < this.anInt4376; local193++) {
				arg4.aShortArray60[local193] = this.aShortArray60[local193];
			}
		} else {
			arg4.aShortArray60 = this.aShortArray60;
		}
		if (Static438.method6518(this.anInt4360, arg2)) {
			if (arg3.aByteArray39 == null || arg3.aByteArray39.length < this.anInt4376) {
				arg4.aByteArray39 = arg3.aByteArray39 = new byte[this.anInt4376];
			} else {
				arg4.aByteArray39 = arg3.aByteArray39;
			}
			for (local193 = 0; local193 < this.anInt4376; local193++) {
				arg4.aByteArray39[local193] = this.aByteArray39[local193];
			}
		} else {
			arg4.aByteArray39 = this.aByteArray39;
		}
		if (Static135.method2404(arg2, this.anInt4360)) {
			arg4.aClass78_4 = arg3.aClass78_4;
			arg4.aClass78_4.aBoolean206 = true;
			arg4.aClass78_4.aBoolean205 = this.aClass78_4.aBoolean205;
			arg4.aClass78_4.anInterface3_8 = this.aClass78_4.anInterface3_8;
		} else if (Static439.method6410(arg2, this.anInt4360)) {
			arg4.aClass78_4 = this.aClass78_4;
		} else {
			arg4.aClass78_4 = null;
		}
		@Pc(558) int local558;
		if (Static97.method1947(this.anInt4360, arg2)) {
			if (arg3.aShortArray65 == null || this.anInt4375 > arg3.aShortArray65.length) {
				local193 = this.anInt4375;
				arg4.aShortArray55 = arg3.aShortArray55 = new short[local193];
				arg4.aShortArray65 = arg3.aShortArray65 = new short[local193];
				arg4.aShortArray64 = arg3.aShortArray64 = new short[local193];
			} else {
				arg4.aShortArray64 = arg3.aShortArray64;
				arg4.aShortArray65 = arg3.aShortArray65;
				arg4.aShortArray55 = arg3.aShortArray55;
			}
			if (this.aClass148_1 == null) {
				arg4.aClass148_1 = null;
				for (local193 = 0; local193 < this.anInt4375; local193++) {
					arg4.aShortArray65[local193] = this.aShortArray65[local193];
					arg4.aShortArray55[local193] = this.aShortArray55[local193];
					arg4.aShortArray64[local193] = this.aShortArray64[local193];
				}
			} else {
				if (arg3.aClass148_1 == null) {
					arg3.aClass148_1 = new Class148();
				}
				@Pc(546) Class148 local546 = arg4.aClass148_1 = arg3.aClass148_1;
				if (local546.aShortArray50 == null || this.anInt4375 > local546.aShortArray50.length) {
					local558 = this.anInt4375;
					local546.aShortArray50 = new short[local558];
					local546.aByteArray34 = new byte[local558];
					local546.aShortArray49 = new short[local558];
					local546.aShortArray51 = new short[local558];
				}
				for (local558 = 0; local558 < this.anInt4375; local558++) {
					arg4.aShortArray65[local558] = this.aShortArray65[local558];
					arg4.aShortArray55[local558] = this.aShortArray55[local558];
					arg4.aShortArray64[local558] = this.aShortArray64[local558];
					local546.aShortArray50[local558] = this.aClass148_1.aShortArray50[local558];
					local546.aShortArray49[local558] = this.aClass148_1.aShortArray49[local558];
					local546.aShortArray51[local558] = this.aClass148_1.aShortArray51[local558];
					local546.aByteArray34[local558] = this.aClass148_1.aByteArray34[local558];
				}
			}
			arg4.aByteArray38 = this.aByteArray38;
		} else {
			arg4.aShortArray55 = this.aShortArray55;
			arg4.aShortArray64 = this.aShortArray64;
			arg4.aShortArray65 = this.aShortArray65;
			arg4.aByteArray38 = this.aByteArray38;
			arg4.aClass148_1 = this.aClass148_1;
		}
		if (Static189.method3159(this.anInt4360, arg2)) {
			arg4.aClass78_1 = arg3.aClass78_1;
			arg4.aClass78_1.aBoolean206 = true;
			arg4.aClass78_1.aBoolean205 = this.aClass78_1.aBoolean205;
			arg4.aClass78_1.anInterface3_8 = this.aClass78_1.anInterface3_8;
		} else if (Static228.method3553(arg2, this.anInt4360)) {
			arg4.aClass78_1 = this.aClass78_1;
		} else {
			arg4.aClass78_1 = null;
		}
		if (Static141.method2482(this.anInt4360, arg2)) {
			if (arg3.aFloatArray35 == null || this.anInt4376 > arg3.aFloatArray35.length) {
				local193 = this.anInt4375;
				arg4.aFloatArray35 = arg3.aFloatArray35 = new float[local193];
				arg4.aFloatArray36 = arg3.aFloatArray36 = new float[local193];
			} else {
				arg4.aFloatArray36 = arg3.aFloatArray36;
				arg4.aFloatArray35 = arg3.aFloatArray35;
			}
			for (local193 = 0; local193 < this.anInt4375; local193++) {
				arg4.aFloatArray35[local193] = this.aFloatArray35[local193];
				arg4.aFloatArray36[local193] = this.aFloatArray36[local193];
			}
		} else {
			arg4.aFloatArray36 = this.aFloatArray36;
			arg4.aFloatArray35 = this.aFloatArray35;
		}
		if (Static528.method7441(this.anInt4360, arg2)) {
			arg4.aClass78_3 = arg3.aClass78_3;
			arg4.aClass78_3.anInterface3_8 = this.aClass78_3.anInterface3_8;
			arg4.aClass78_3.aBoolean205 = this.aClass78_3.aBoolean205;
			arg4.aClass78_3.aBoolean206 = true;
		} else if (Static616.method8392(arg2, this.anInt4360)) {
			arg4.aClass78_3 = this.aClass78_3;
		} else {
			arg4.aClass78_3 = null;
		}
		if (Static161.method4592(arg2, this.anInt4360)) {
			if (arg3.aShortArray63 == null || this.anInt4376 > arg3.aShortArray63.length) {
				local193 = this.anInt4376;
				arg4.aShortArray59 = arg3.aShortArray59 = new short[local193];
				arg4.aShortArray53 = arg3.aShortArray53 = new short[local193];
				arg4.aShortArray63 = arg3.aShortArray63 = new short[local193];
			} else {
				arg4.aShortArray63 = arg3.aShortArray63;
				arg4.aShortArray59 = arg3.aShortArray59;
				arg4.aShortArray53 = arg3.aShortArray53;
			}
			for (local193 = 0; local193 < this.anInt4376; local193++) {
				arg4.aShortArray63[local193] = this.aShortArray63[local193];
				arg4.aShortArray59[local193] = this.aShortArray59[local193];
				arg4.aShortArray53[local193] = this.aShortArray53[local193];
			}
		} else {
			arg4.aShortArray59 = this.aShortArray59;
			arg4.aShortArray53 = this.aShortArray53;
			arg4.aShortArray63 = this.aShortArray63;
		}
		if (Static313.method8688(this.anInt4360, arg2)) {
			arg4.aClass253_1 = arg3.aClass253_1;
			arg4.aClass253_1.aBoolean618 = this.aClass253_1.aBoolean618;
			arg4.aClass253_1.anInterface12_4 = this.aClass253_1.anInterface12_4;
			arg4.aClass253_1.aBoolean619 = true;
		} else if (Static591.method8112(this.anInt4360, arg2)) {
			arg4.aClass253_1 = this.aClass253_1;
		} else {
			arg4.aClass253_1 = null;
		}
		if (Static68.method928(this.anInt4360, arg2)) {
			if (arg3.aShortArray58 == null || arg3.aShortArray58.length < this.anInt4376) {
				local193 = this.anInt4376;
				arg4.aShortArray58 = arg3.aShortArray58 = new short[local193];
			} else {
				arg4.aShortArray58 = arg3.aShortArray58;
			}
			for (local193 = 0; local193 < this.anInt4376; local193++) {
				arg4.aShortArray58[local193] = this.aShortArray58[local193];
			}
		} else {
			arg4.aShortArray58 = this.aShortArray58;
		}
		if (!Static589.method8095(arg2, this.anInt4360)) {
			arg4.aClass141Array1 = this.aClass141Array1;
		} else if (arg3.aClass141Array1 == null || this.anInt4385 > arg3.aClass141Array1.length) {
			local193 = this.anInt4385;
			arg4.aClass141Array1 = arg3.aClass141Array1 = new Class141[local193];
			for (local558 = 0; local558 < this.anInt4385; local558++) {
				arg4.aClass141Array1[local558] = this.aClass141Array1[local558].method3327();
			}
		} else {
			arg4.aClass141Array1 = arg3.aClass141Array1;
			for (local193 = 0; local193 < this.anInt4385; local193++) {
				arg4.aClass141Array1[local193].method3328(this.aClass141Array1[local193]);
			}
		}
		arg4.aClass313Array1 = this.aClass313Array1;
		arg4.anIntArrayArray17 = this.anIntArrayArray17;
		arg4.anIntArray225 = this.anIntArray225;
		arg4.aShortArray57 = this.aShortArray57;
		arg4.aClass189Array1 = this.aClass189Array1;
		arg4.anIntArray222 = this.anIntArray222;
		arg4.anIntArray227 = this.anIntArray227;
		arg4.aShortArray62 = this.aShortArray62;
		arg4.lb = this.lb;
		arg4.aShortArray54 = this.aShortArray54;
		arg4.aShortArray61 = this.aShortArray61;
		if (this.aBoolean360) {
			arg4.anInt4370 = this.anInt4370;
			arg4.anInt4384 = this.anInt4384;
			arg4.anInt4363 = this.anInt4363;
			arg4.anInt4367 = this.anInt4367;
			arg4.anInt4396 = this.anInt4396;
			arg4.anInt4380 = this.anInt4380;
			arg4.anInt4394 = this.anInt4394;
			arg4.anInt4393 = this.anInt4393;
			arg4.aBoolean360 = true;
		} else {
			arg4.aBoolean360 = false;
		}
		arg4.aShortArray56 = this.aShortArray56;
		arg4.anIntArrayArray19 = this.anIntArrayArray19;
		arg4.anIntArrayArray18 = this.anIntArrayArray18;
		arg4.aClass209Array1 = this.aClass209Array1;
		return arg4;
	}

	@OriginalMember(owner = "client!hq", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class200.anIntArray337[arg0];
		@Pc(13) int local13 = Class200.anIntArray338[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt4387; local15++) {
			local33 = this.anIntArray224[local15] * local9 + local13 * this.anIntArray226[local15] >> 14;
			this.anIntArray224[local15] = this.anIntArray224[local15] * local13 - local9 * this.anIntArray226[local15] >> 14;
			this.anIntArray226[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt4375; local33++) {
			@Pc(87) int local87 = local9 * this.aShortArray64[local33] + this.aShortArray65[local33] * local13 >> 14;
			this.aShortArray64[local33] = (short) (this.aShortArray64[local33] * local13 - local9 * this.aShortArray65[local33] >> 14);
			this.aShortArray65[local33] = (short) local87;
		}
		this.method3725();
		this.method3716();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "()[Lclient!sba;")
	@Override
	public Class313[] method8575() {
		return this.aClass313Array1;
	}

	@OriginalMember(owner = "client!hq", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4359; local7++) {
			this.anIntArray226[local7] = this.anIntArray226[local7] + 7 >> 4;
			this.anIntArray223[local7] = this.anIntArray223[local7] + 7 >> 4;
			this.anIntArray224[local7] = this.anIntArray224[local7] + 7 >> 4;
		}
		this.method3725();
		this.aBoolean360 = false;
	}

	@OriginalMember(owner = "client!hq", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(9) int local9;
		@Pc(17) int local17;
		if (arg0 == 0) {
			local9 = 0;
			Static670.anInt10763 = 0;
			Static87.anInt6205 = 0;
			Static578.anInt9489 = 0;
			for (local17 = 0; local17 < this.anInt4387; local17++) {
				Static578.anInt9489 += this.anIntArray226[local17];
				Static87.anInt6205 += this.anIntArray223[local17];
				local9++;
				Static670.anInt10763 += this.anIntArray224[local17];
			}
			if (local9 > 0) {
				Static578.anInt9489 = arg1 + Static578.anInt9489 / local9;
				Static670.anInt10763 = arg3 + Static670.anInt10763 / local9;
				Static87.anInt6205 = Static87.anInt6205 / local9 + arg2;
			} else {
				Static670.anInt10763 = arg3;
				Static578.anInt9489 = arg1;
				Static87.anInt6205 = arg2;
			}
		} else if (arg0 == 1) {
			for (local9 = 0; local9 < this.anInt4387; local9++) {
				this.anIntArray226[local9] += arg1;
				this.anIntArray223[local9] += arg2;
				this.anIntArray224[local9] += arg3;
			}
		} else {
			@Pc(160) int local160;
			@Pc(178) int local178;
			if (arg0 == 2) {
				for (local9 = 0; local9 < this.anInt4387; local9++) {
					this.anIntArray226[local9] -= Static578.anInt9489;
					this.anIntArray223[local9] -= Static87.anInt6205;
					this.anIntArray224[local9] -= Static670.anInt10763;
					if (arg3 != 0) {
						local17 = Class200.anIntArray337[arg3];
						local160 = Class200.anIntArray338[arg3];
						local178 = this.anIntArray226[local9] * local160 + local17 * this.anIntArray223[local9] + 16383 >> 14;
						this.anIntArray223[local9] = this.anIntArray223[local9] * local160 + 16383 - this.anIntArray226[local9] * local17 >> 14;
						this.anIntArray226[local9] = local178;
					}
					if (arg1 != 0) {
						local17 = Class200.anIntArray337[arg1];
						local160 = Class200.anIntArray338[arg1];
						local178 = local160 * this.anIntArray223[local9] + 16383 - this.anIntArray224[local9] * local17 >> 14;
						this.anIntArray224[local9] = local17 * this.anIntArray223[local9] + this.anIntArray224[local9] * local160 + 16383 >> 14;
						this.anIntArray223[local9] = local178;
					}
					if (arg2 != 0) {
						local17 = Class200.anIntArray337[arg2];
						local160 = Class200.anIntArray338[arg2];
						local178 = local160 * this.anIntArray226[local9] + local17 * this.anIntArray224[local9] + 16383 >> 14;
						this.anIntArray224[local9] = local160 * this.anIntArray224[local9] + 16383 - this.anIntArray226[local9] * local17 >> 14;
						this.anIntArray226[local9] = local178;
					}
					this.anIntArray226[local9] += Static578.anInt9489;
					this.anIntArray223[local9] += Static87.anInt6205;
					this.anIntArray224[local9] += Static670.anInt10763;
				}
			} else if (arg0 == 3) {
				for (local9 = 0; local9 < this.anInt4387; local9++) {
					this.anIntArray226[local9] -= Static578.anInt9489;
					this.anIntArray223[local9] -= Static87.anInt6205;
					this.anIntArray224[local9] -= Static670.anInt10763;
					this.anIntArray226[local9] = arg1 * this.anIntArray226[local9] / 128;
					this.anIntArray223[local9] = arg2 * this.anIntArray223[local9] / 128;
					this.anIntArray224[local9] = this.anIntArray224[local9] * arg3 / 128;
					this.anIntArray226[local9] += Static578.anInt9489;
					this.anIntArray223[local9] += Static87.anInt6205;
					this.anIntArray224[local9] += Static670.anInt10763;
				}
			} else {
				@Pc(505) Class189 local505;
				@Pc(510) Class141 local510;
				if (arg0 == 5) {
					for (local9 = 0; local9 < this.anInt4376; local9++) {
						local17 = arg1 * 8 + (this.aByteArray39[local9] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray39[local9] = (byte) local17;
					}
					if (this.aClass189Array1 != null) {
						for (local17 = 0; local17 < this.anInt4385; local17++) {
							local505 = this.aClass189Array1[local17];
							local510 = this.aClass141Array1[local17];
							local510.anInt3915 = 255 - (this.aByteArray39[local505.anInt5808] & 0xFF) << 24 | local510.anInt3915 & 0xFFFFFF;
						}
					}
					this.method3721();
				} else if (arg0 == 7) {
					for (local9 = 0; local9 < this.anInt4376; local9++) {
						local17 = this.aShortArray60[local9] & 0xFFFF;
						local160 = local17 >> 10 & 0x3F;
						local178 = local17 >> 7 & 0x7;
						local178 += arg2 / 4;
						@Pc(576) int local576 = arg1 + local160 & 0x3F;
						@Pc(580) int local580 = local17 & 0x7F;
						if (local178 < 0) {
							local178 = 0;
						} else if (local178 > 7) {
							local178 = 7;
						}
						local580 += arg3;
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.aShortArray60[local9] = (short) (local576 << 10 | local178 << 7 | local580);
					}
					if (this.aClass189Array1 != null) {
						for (local17 = 0; local17 < this.anInt4385; local17++) {
							local505 = this.aClass189Array1[local17];
							local510 = this.aClass141Array1[local17];
							local510.anInt3915 = local510.anInt3915 & 0xFF000000 | Static336.anIntArray357[this.aShortArray60[local505.anInt5808] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method3721();
				} else {
					@Pc(687) Class141 local687;
					if (arg0 == 8) {
						for (local9 = 0; local9 < this.anInt4385; local9++) {
							local687 = this.aClass141Array1[local9];
							local687.anInt3909 += arg1;
							local687.anInt3914 += arg2;
						}
					} else if (arg0 == 10) {
						for (local9 = 0; local9 < this.anInt4385; local9++) {
							local687 = this.aClass141Array1[local9];
							local687.anInt3911 = local687.anInt3911 * arg1 >> 7;
							local687.anInt3912 = local687.anInt3912 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local9 = 0; local9 < this.anInt4385; local9++) {
							local687 = this.aClass141Array1[local9];
							local687.anInt3908 = local687.anInt3908 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4384;
	}

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(B)V")
	private void method3735() {
		if (this.aClass253_1 != null) {
			this.aClass253_1.aBoolean618 = false;
		}
	}

	@OriginalMember(owner = "client!hq", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean360) {
			this.method3719();
		}
		return this.anInt4394;
	}
}
