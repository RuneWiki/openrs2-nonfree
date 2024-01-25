import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class95_Sub2 extends Class95 {

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "I")
	private int anInt5163;

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
	private int anInt5169;

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
	private int anInt5176;

	@OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
	private int anInt5177;

	@OriginalMember(owner = "client!kj", name = "U", descriptor = "Z")
	private boolean aBoolean381;

	@OriginalMember(owner = "client!kj", name = "W", descriptor = "Lclient!op;")
	private Class258 aClass258_1;

	@OriginalMember(owner = "client!kj", name = "pb", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!kj", name = "sb", descriptor = "Lclient!qt;")
	private Class294 aClass294_1;

	@OriginalMember(owner = "client!kj", name = "ub", descriptor = "Lclient!mg;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!kj", name = "Cb", descriptor = "Lclient!op;")
	private Class258 aClass258_2;

	@OriginalMember(owner = "client!kj", name = "Db", descriptor = "I")
	private int anInt5197;

	@OriginalMember(owner = "client!kj", name = "Ib", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!kj", name = "Vb", descriptor = "I")
	private int anInt5212;

	@OriginalMember(owner = "client!kj", name = "Zb", descriptor = "I")
	private int anInt5214;

	@OriginalMember(owner = "client!kj", name = "dc", descriptor = "I")
	private int anInt5218;

	@OriginalMember(owner = "client!kj", name = "nc", descriptor = "Lclient!op;")
	private Class258 aClass258_3;

	@OriginalMember(owner = "client!kj", name = "yc", descriptor = "Lclient!ai;")
	private final Class13_Sub1 aClass13_Sub1_13;

	@OriginalMember(owner = "client!kj", name = "Ac", descriptor = "I")
	private int anInt5234;

	@OriginalMember(owner = "client!kj", name = "Gc", descriptor = "Lclient!op;")
	private Class258 aClass258_4;

	@OriginalMember(owner = "client!kj", name = "Jc", descriptor = "I")
	private int anInt5239;

	@OriginalMember(owner = "client!kj", name = "Nc", descriptor = "I")
	private int anInt5240;

	@OriginalMember(owner = "client!kj", name = "Kc", descriptor = "[I")
	private int[] anIntArray468;

	@OriginalMember(owner = "client!kj", name = "db", descriptor = "I")
	private int anInt5182;

	@OriginalMember(owner = "client!kj", name = "ob", descriptor = "I")
	private int anInt5189;

	@OriginalMember(owner = "client!kj", name = "L", descriptor = "Z")
	private boolean aBoolean380;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!kj", name = "bb", descriptor = "[I")
	private int[] anIntArray463;

	@OriginalMember(owner = "client!kj", name = "rc", descriptor = "I")
	private int anInt5227;

	@OriginalMember(owner = "client!kj", name = "Wb", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!kj", name = "Ic", descriptor = "I")
	private int anInt5238;

	@OriginalMember(owner = "client!kj", name = "vc", descriptor = "[I")
	private int[] anIntArray467;

	@OriginalMember(owner = "client!kj", name = "ic", descriptor = "[I")
	private int[] anIntArray466;

	@OriginalMember(owner = "client!kj", name = "Oc", descriptor = "[Lclient!kw;")
	private Class197[] aClass197Array4;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "[Lclient!cba;")
	private Class49[] aClass49Array4;

	@OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
	private int anInt5180;

	@OriginalMember(owner = "client!kj", name = "S", descriptor = "[Lclient!jt;")
	private Class177[] aClass177Array1;

	@OriginalMember(owner = "client!kj", name = "Lc", descriptor = "[Lclient!cu;")
	private Class67[] aClass67Array1;

	@OriginalMember(owner = "client!kj", name = "vb", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!kj", name = "ab", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!kj", name = "Z", descriptor = "[F")
	private float[] aFloatArray28;

	@OriginalMember(owner = "client!kj", name = "Fc", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!kj", name = "Xb", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!kj", name = "fc", descriptor = "[S")
	private short[] aShortArray76;

	@OriginalMember(owner = "client!kj", name = "kc", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!kj", name = "Y", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!kj", name = "gc", descriptor = "S")
	private short aShort53;

	@OriginalMember(owner = "client!kj", name = "Q", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!kj", name = "Dc", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!kj", name = "Bc", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!kj", name = "gb", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!kj", name = "wb", descriptor = "[F")
	private float[] aFloatArray29;

	@OriginalMember(owner = "client!kj", name = "Mc", descriptor = "S")
	private short aShort54;

	@OriginalMember(owner = "client!kj", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!kj", name = "hb", descriptor = "[I")
	private int[] anIntArray464;

	@OriginalMember(owner = "client!kj", name = "Mb", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!kj", name = "Qc", descriptor = "[I")
	private int[] anIntArray469;

	@OriginalMember(owner = "client!kj", name = "Ab", descriptor = "[[I")
	private int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!kj", name = "Eb", descriptor = "[[I")
	private int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "[[I")
	private int[][] anIntArrayArray31;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ai;Lclient!gfa;IIII)V")
	public Class95_Sub2(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) Class117 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface4 local11 = arg0.anInterface4_14;
		@Pc(15) int[] local15 = new int[arg1.anInt3811];
		this.anIntArray468 = new int[arg1.anInt3814 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt3811; local24++) {
			if (arg1.aByteArray33 == null || arg1.aByteArray33[local24] != 2) {
				if (arg1.aShortArray58 != null && arg1.aShortArray58[local24] != -1) {
					@Pc(56) Class119 local56 = local11.method4673(arg1.aShortArray58[local24] & 0xFFFF);
					if (((this.anInt5239 & 0x40) == 0 || !local56.aBoolean291) && local56.aBoolean294) {
						continue;
					}
				}
				local15[this.anInt5182++] = local24;
				this.anIntArray468[arg1.aShortArray54[local24]]++;
				this.anIntArray468[arg1.aShortArray57[local24]]++;
				this.anIntArray468[arg1.aShortArray52[local24]]++;
			}
		}
		this.anInt5189 = this.anInt5182;
		@Pc(125) long[] local125 = new long[this.anInt5182];
		@Pc(137) boolean local137 = (this.anInt5234 & 0x100) != 0;
		@Pc(149) int local149;
		@Pc(162) int local162;
		@Pc(332) int local332;
		for (@Pc(139) int local139 = 0; local139 < this.anInt5182; local139++) {
			@Pc(145) int local145 = local15[local139];
			@Pc(147) Class119 local147 = null;
			local149 = 0;
			@Pc(151) byte local151 = 0;
			@Pc(153) byte local153 = 0;
			@Pc(155) byte local155 = 0;
			if (arg1.aClass163Array1 != null) {
				@Pc(160) boolean local160 = false;
				for (local162 = 0; local162 < arg1.aClass163Array1.length; local162++) {
					@Pc(169) Class163 local169 = arg1.aClass163Array1[local162];
					if (local169.anInt4727 == local145) {
						@Pc(178) Class143 local178 = Static173.method3146(local169.anInt4729);
						if (local178.aBoolean323) {
							local160 = true;
						}
						if (local178.anInt4306 != -1) {
							@Pc(193) Class119 local193 = local11.method4673(local178.anInt4306);
							if (local193.anInt3894 == 2) {
								this.aBoolean380 = true;
							}
						}
					}
				}
				if (local160) {
					local125[local139] = Long.MAX_VALUE;
					this.anInt5189--;
					continue;
				}
			}
			@Pc(224) short local224 = -1;
			if (arg1.aShortArray58 != null) {
				local224 = arg1.aShortArray58[local145];
				if (local224 != -1) {
					local147 = local11.method4673(local224 & 0xFFFF);
					if ((this.anInt5239 & 0x40) != 0 && local147.aBoolean291) {
						local224 = -1;
						local147 = null;
					} else {
						local155 = local147.aByte56;
						local153 = local147.aByte54;
					}
				}
			}
			@Pc(288) boolean local288 = arg1.aByteArray34 != null && arg1.aByteArray34[local145] != 0 || local147 != null && local147.anInt3894 != 0;
			if ((local137 || local288) && arg1.aByteArray30 != null) {
				local149 += arg1.aByteArray30[local145] << 17;
			}
			if (local288) {
				local149 += 65536;
			}
			local149 += (local153 & 0xFF) << 8;
			local149 += local155 & 0xFF;
			local332 = local151 + ((local224 & 0xFFFF) << 16);
			@Pc(338) int local338 = local332 + (local139 & 0xFFFF);
			local125[local139] = ((long) local149 << 32) + (long) local338;
			this.aBoolean379 |= local147 != null && (local147.aByte57 != 0 || local147.aByte59 != 0);
			this.aBoolean380 |= local288;
		}
		Static254.method4155(local15, local125);
		this.anIntArray463 = arg1.anIntArray335;
		this.anInt5227 = arg1.anInt3807;
		this.aShortArray75 = arg1.aShortArray51;
		this.anInt5238 = arg1.anInt3814;
		this.anIntArray467 = arg1.anIntArray333;
		this.anIntArray466 = arg1.anIntArray325;
		this.aClass197Array4 = arg1.aClass197Array2;
		this.aClass49Array4 = arg1.aClass49Array2;
		@Pc(425) Class279[] local425 = new Class279[this.anInt5238];
		@Pc(445) int local445;
		@Pc(459) int local459;
		@Pc(505) int local505;
		if (arg1.aClass163Array1 != null) {
			this.anInt5180 = arg1.aClass163Array1.length;
			this.aClass177Array1 = new Class177[this.anInt5180];
			this.aClass67Array1 = new Class67[this.anInt5180];
			for (local445 = 0; local445 < this.anInt5180; local445++) {
				@Pc(452) Class163 local452 = arg1.aClass163Array1[local445];
				@Pc(457) Class143 local457 = Static173.method3146(local452.anInt4729);
				local459 = -1;
				for (@Pc(461) int local461 = 0; local461 < this.anInt5182; local461++) {
					if (local452.anInt4727 == local15[local461]) {
						local459 = local461;
						break;
					}
				}
				if (local459 == -1) {
					throw new RuntimeException();
				}
				local505 = Static363.anIntArray518[arg1.aShortArray50[local452.anInt4727] & 0xFFFF] & 0xFFFFFF;
				@Pc(523) int local523 = local505 | 255 - (arg1.aByteArray34 == null ? 0 : arg1.aByteArray34[local452.anInt4727]) << 24;
				this.aClass67Array1[local445] = new Class67(local459, arg1.aShortArray54[local452.anInt4727], arg1.aShortArray57[local452.anInt4727], arg1.aShortArray52[local452.anInt4727], local457.anInt4311, local457.anInt4312, local457.anInt4306, local457.anInt4308, local457.anInt4307, local457.aBoolean323, local457.aBoolean322, local452.anInt4724);
				this.aClass177Array1[local445] = new Class177(local523);
			}
		}
		local445 = this.anInt5182 * 3;
		this.aShortArray74 = new short[local445];
		this.aShortArray72 = new short[this.anInt5182];
		this.aFloatArray28 = new float[local445];
		if (arg1.aShortArray53 != null) {
			this.aShortArray80 = new short[this.anInt5182];
		}
		this.aByteArray49 = new byte[this.anInt5182];
		this.aShortArray76 = new short[local445];
		this.aShortArray77 = new short[this.anInt5182];
		this.aByteArray48 = new byte[local445];
		this.aShort53 = (short) arg4;
		this.aShortArray71 = new short[local445];
		Static155.aLongArray4 = new long[local445];
		this.aShortArray79 = new short[local445];
		this.aShortArray69 = new short[this.anInt5182];
		this.aShortArray78 = new short[this.anInt5182];
		this.aShortArray73 = new short[local445];
		this.aShortArray70 = new short[local445];
		this.aFloatArray29 = new float[local445];
		this.aShort54 = (short) arg3;
		this.lb = new short[this.anInt5182];
		local149 = 0;
		for (local332 = 0; local332 < arg1.anInt3814; local332++) {
			local459 = this.anIntArray468[local332];
			this.anIntArray468[local332] = local149;
			local149 += local459;
			local425[local332] = new Class279();
		}
		this.anIntArray468[arg1.anInt3814] = local149;
		@Pc(713) Class363 local713 = Static253.method7879(arg1, this.anInt5182, local15);
		@Pc(717) Class22[] local717 = new Class22[arg1.anInt3811];
		@Pc(757) int local757;
		@Pc(767) int local767;
		@Pc(778) int local778;
		@Pc(736) short local736;
		@Pc(746) int local746;
		for (local505 = 0; local505 < arg1.anInt3811; local505++) {
			@Pc(726) short local726 = arg1.aShortArray54[local505];
			@Pc(731) short local731 = arg1.aShortArray57[local505];
			local736 = arg1.aShortArray52[local505];
			local746 = this.anIntArray463[local731] - this.anIntArray463[local726];
			local757 = this.anIntArray467[local731] - this.anIntArray467[local726];
			local767 = this.anIntArray466[local731] - this.anIntArray466[local726];
			local778 = this.anIntArray463[local736] - this.anIntArray463[local726];
			@Pc(789) int local789 = this.anIntArray467[local736] - this.anIntArray467[local726];
			@Pc(800) int local800 = this.anIntArray466[local736] - this.anIntArray466[local726];
			@Pc(808) int local808 = local757 * local800 - local767 * local789;
			@Pc(817) int local817 = local767 * local778 - local800 * local746;
			@Pc(825) int local825 = local746 * local789 - local757 * local778;
			while (local808 > 8192 || local817 > 8192 || local825 > 8192 || local808 < -8192 || local817 < -8192 || local825 < -8192) {
				local817 >>= 0x1;
				local825 >>= 0x1;
				local808 >>= 0x1;
			}
			@Pc(878) int local878 = (int) Math.sqrt((double) (local825 * local825 + local817 * local817 + local808 * local808));
			if (local878 <= 0) {
				local878 = 1;
			}
			local825 = local825 * 256 / local878;
			local817 = local817 * 256 / local878;
			local808 = local808 * 256 / local878;
			@Pc(910) byte local910 = arg1.aByteArray33 == null ? 0 : arg1.aByteArray33[local505];
			if (local910 == 0) {
				@Pc(938) Class279 local938 = local425[local726];
				local938.anInt7807++;
				local938.anInt7808 += local817;
				local938.anInt7806 += local825;
				local938.anInt7810 += local808;
				@Pc(966) Class279 local966 = local425[local731];
				local966.anInt7807++;
				local966.anInt7806 += local825;
				local966.anInt7810 += local808;
				local966.anInt7808 += local817;
				@Pc(994) Class279 local994 = local425[local736];
				local994.anInt7806 += local825;
				local994.anInt7810 += local808;
				local994.anInt7808 += local817;
				local994.anInt7807++;
			} else if (local910 == 1) {
				@Pc(923) Class22 local923 = local717[local505] = new Class22();
				local923.anInt542 = local808;
				local923.anInt544 = local825;
				local923.anInt543 = local817;
			}
		}
		@Pc(1031) int local1031;
		@Pc(1074) short local1074;
		for (local162 = 0; local162 < this.anInt5182; local162++) {
			local1031 = local15[local162];
			@Pc(1038) int local1038 = arg1.aShortArray50[local1031] & 0xFFFF;
			if (arg1.aByteArray35 == null) {
				local746 = -1;
			} else {
				local746 = arg1.aByteArray35[local1031];
			}
			if (arg1.aByteArray34 == null) {
				local757 = 0;
			} else {
				local757 = arg1.aByteArray34[local1031] & 0xFF;
			}
			local1074 = arg1.aShortArray58 == null ? -1 : arg1.aShortArray58[local1031];
			if (local1074 != -1 && (this.anInt5239 & 0x40) != 0) {
				@Pc(1090) Class119 local1090 = local11.method4673(local1074 & 0xFFFF);
				if (local1090.aBoolean291) {
					local1074 = -1;
				}
			}
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) float local1099 = 0.0F;
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) float local1105 = 0.0F;
			@Pc(1107) float local1107 = 0.0F;
			@Pc(1109) byte local1109 = 0;
			@Pc(1111) byte local1111 = 0;
			@Pc(1113) int local1113 = 0;
			@Pc(1147) byte local1147;
			@Pc(1164) short local1164;
			@Pc(1961) short local1961;
			@Pc(1966) short local1966;
			if (local1074 != -1) {
				if (local746 == -1) {
					local1111 = 2;
					local1103 = 1.0F;
					local1105 = 0.0F;
					local1109 = 1;
					local1107 = 0.0F;
					local1099 = 1.0F;
					local1097 = 0.0F;
					local1101 = 1.0F;
				} else {
					local746 &= 0xFF;
					local1147 = arg1.aByteArray31[local746];
					@Pc(1154) short local1154;
					@Pc(1159) short local1159;
					@Pc(1197) float local1197;
					@Pc(1213) float local1213;
					@Pc(1221) float local1221;
					@Pc(1321) float local1321;
					@Pc(1329) float local1329;
					@Pc(1337) float local1337;
					@Pc(1360) float local1360;
					@Pc(1383) float local1383;
					@Pc(1406) float local1406;
					if (local1147 == 0) {
						local1154 = arg1.aShortArray54[local1031];
						local1159 = arg1.aShortArray57[local1031];
						local1164 = arg1.aShortArray52[local1031];
						local1961 = arg1.aShortArray59[local746];
						local1966 = arg1.aShortArray56[local746];
						@Pc(1971) short local1971 = arg1.aShortArray55[local746];
						@Pc(1977) float local1977 = (float) arg1.anIntArray335[local1961];
						@Pc(1983) float local1983 = (float) arg1.anIntArray333[local1961];
						local1197 = (float) arg1.anIntArray325[local1961];
						local1213 = (float) arg1.anIntArray335[local1966] - local1977;
						local1221 = (float) arg1.anIntArray333[local1966] - local1983;
						@Pc(2015) float local2015 = (float) arg1.anIntArray325[local1966] - local1197;
						@Pc(2024) float local2024 = (float) arg1.anIntArray335[local1971] - local1977;
						@Pc(2032) float local2032 = (float) arg1.anIntArray333[local1971] - local1983;
						@Pc(2040) float local2040 = (float) arg1.anIntArray325[local1971] - local1197;
						@Pc(2049) float local2049 = (float) arg1.anIntArray335[local1154] - local1977;
						@Pc(2057) float local2057 = (float) arg1.anIntArray333[local1154] - local1983;
						@Pc(2065) float local2065 = (float) arg1.anIntArray325[local1154] - local1197;
						@Pc(2073) float local2073 = (float) arg1.anIntArray335[local1159] - local1977;
						@Pc(2081) float local2081 = (float) arg1.anIntArray333[local1159] - local1983;
						local1321 = (float) arg1.anIntArray325[local1159] - local1197;
						local1329 = (float) arg1.anIntArray335[local1164] - local1977;
						local1337 = (float) arg1.anIntArray333[local1164] - local1983;
						local1360 = (float) arg1.anIntArray325[local1164] - local1197;
						local1383 = local2040 * local1221 - local2015 * local2032;
						local1406 = local2015 * local2024 - local2040 * local1213;
						@Pc(2141) float local2141 = local1213 * local2032 - local2024 * local1221;
						@Pc(2149) float local2149 = local2141 * local2032 - local1406 * local2040;
						@Pc(2158) float local2158 = local1383 * local2040 - local2024 * local2141;
						@Pc(2166) float local2166 = local1406 * local2024 - local2032 * local1383;
						@Pc(2180) float local2180 = 1.0F / (local1221 * local2158 + local2149 * local1213 + local2015 * local2166);
						local1105 = (local1337 * local2158 + local1329 * local2149 + local2166 * local1360) * local2180;
						local1101 = (local1321 * local2166 + local2158 * local2081 + local2073 * local2149) * local2180;
						local1097 = (local2166 * local2065 + local2149 * local2049 + local2158 * local2057) * local2180;
						@Pc(2230) float local2230 = local2141 * local1221 - local2015 * local1406;
						@Pc(2239) float local2239 = local1383 * local2015 - local2141 * local1213;
						@Pc(2247) float local2247 = local1213 * local1406 - local1221 * local1383;
						@Pc(2261) float local2261 = 1.0F / (local2040 * local2247 + local2230 * local2024 + local2032 * local2239);
						local1103 = local2261 * (local1321 * local2247 + local2230 * local2073 + local2081 * local2239);
						local1099 = (local2247 * local2065 + local2049 * local2230 + local2239 * local2057) * local2261;
						local1107 = local2261 * (local1360 * local2247 + local2230 * local1329 + local1337 * local2239);
					} else {
						local1154 = arg1.aShortArray54[local1031];
						local1159 = arg1.aShortArray57[local1031];
						local1164 = arg1.aShortArray52[local1031];
						@Pc(1169) int local1169 = local713.anIntArray872[local746];
						@Pc(1174) int local1174 = local713.anIntArray873[local746];
						@Pc(1179) int local1179 = local713.anIntArray870[local746];
						@Pc(1184) float[] local1184 = local713.aFloatArrayArray13[local746];
						@Pc(1189) byte local1189 = arg1.aByteArray29[local746];
						local1197 = (float) arg1.anIntArray336[local746] / 256.0F;
						if (local1147 == 1) {
							local1213 = (float) arg1.anIntArray327[local746] / 1024.0F;
							Static425.method6145(local1169, local1184, local1189, local1197, local1174, arg1.anIntArray333[local1154], local1213, local1179, arg1.anIntArray325[local1154], Static440.aFloatArray51, arg1.anIntArray335[local1154]);
							local1099 = Static440.aFloatArray51[1];
							local1097 = Static440.aFloatArray51[0];
							Static425.method6145(local1169, local1184, local1189, local1197, local1174, arg1.anIntArray333[local1159], local1213, local1179, arg1.anIntArray325[local1159], Static440.aFloatArray51, arg1.anIntArray335[local1159]);
							local1101 = Static440.aFloatArray51[0];
							local1103 = Static440.aFloatArray51[1];
							Static425.method6145(local1169, local1184, local1189, local1197, local1174, arg1.anIntArray333[local1164], local1213, local1179, arg1.anIntArray325[local1164], Static440.aFloatArray51, arg1.anIntArray335[local1164]);
							local1105 = Static440.aFloatArray51[0];
							local1107 = Static440.aFloatArray51[1];
							local1221 = local1213 / 2.0F;
							if ((local1189 & 0x1) == 0) {
								if (local1221 < local1105 - local1097) {
									local1105 -= local1213;
									local1111 = 1;
								} else if (local1097 - local1105 > local1221) {
									local1111 = 2;
									local1105 += local1213;
								}
								if (local1101 - local1097 > local1221) {
									local1101 -= local1213;
									local1109 = 1;
								} else if (local1097 - local1101 > local1221) {
									local1101 += local1213;
									local1109 = 2;
								}
							} else {
								if (local1103 - local1099 > local1221) {
									local1103 -= local1213;
									local1109 = 1;
								} else if (local1099 - local1103 > local1221) {
									local1109 = 2;
									local1103 += local1213;
								}
								if (local1221 < local1107 - local1099) {
									local1111 = 1;
									local1107 -= local1213;
								} else if (local1221 < local1099 - local1107) {
									local1111 = 2;
									local1107 += local1213;
								}
							}
						} else if (local1147 == 2) {
							local1213 = (float) arg1.anIntArray331[local746] / 256.0F;
							local1221 = (float) arg1.anIntArray329[local746] / 256.0F;
							@Pc(1232) int local1232 = arg1.anIntArray335[local1159] - arg1.anIntArray335[local1154];
							@Pc(1242) int local1242 = arg1.anIntArray333[local1159] - arg1.anIntArray333[local1154];
							@Pc(1253) int local1253 = arg1.anIntArray325[local1159] - arg1.anIntArray325[local1154];
							@Pc(1264) int local1264 = arg1.anIntArray335[local1164] - arg1.anIntArray335[local1154];
							@Pc(1275) int local1275 = arg1.anIntArray333[local1164] - arg1.anIntArray333[local1154];
							@Pc(1286) int local1286 = arg1.anIntArray325[local1164] - arg1.anIntArray325[local1154];
							@Pc(1295) int local1295 = local1286 * local1242 - local1275 * local1253;
							@Pc(1304) int local1304 = local1253 * local1264 - local1232 * local1286;
							@Pc(1313) int local1313 = local1275 * local1232 - local1242 * local1264;
							local1321 = 64.0F / (float) arg1.anIntArray330[local746];
							local1329 = 64.0F / (float) arg1.anIntArray334[local746];
							local1337 = 64.0F / (float) arg1.anIntArray327[local746];
							local1360 = (local1184[0] * (float) local1295 + (float) local1304 * local1184[1] + local1184[2] * (float) local1313) / local1321;
							local1383 = ((float) local1313 * local1184[5] + local1184[4] * (float) local1304 + (float) local1295 * local1184[3]) / local1329;
							local1406 = ((float) local1313 * local1184[8] + local1184[6] * (float) local1295 + local1184[7] * (float) local1304) / local1337;
							local1113 = Static94.method1710(local1360, local1383, local1406);
							Static174.method3151(local1113, Static440.aFloatArray51, local1189, local1174, local1179, arg1.anIntArray335[local1154], local1169, local1184, local1221, arg1.anIntArray325[local1154], arg1.anIntArray333[local1154], local1197, local1213);
							local1099 = Static440.aFloatArray51[1];
							local1097 = Static440.aFloatArray51[0];
							Static174.method3151(local1113, Static440.aFloatArray51, local1189, local1174, local1179, arg1.anIntArray335[local1159], local1169, local1184, local1221, arg1.anIntArray325[local1159], arg1.anIntArray333[local1159], local1197, local1213);
							local1101 = Static440.aFloatArray51[0];
							local1103 = Static440.aFloatArray51[1];
							Static174.method3151(local1113, Static440.aFloatArray51, local1189, local1174, local1179, arg1.anIntArray335[local1164], local1169, local1184, local1221, arg1.anIntArray325[local1164], arg1.anIntArray333[local1164], local1197, local1213);
							local1105 = Static440.aFloatArray51[0];
							local1107 = Static440.aFloatArray51[1];
						} else if (local1147 == 3) {
							Static9.method165(Static440.aFloatArray51, local1169, arg1.anIntArray335[local1154], local1174, arg1.anIntArray325[local1154], arg1.anIntArray333[local1154], local1184, local1179, local1189, local1197);
							local1099 = Static440.aFloatArray51[1];
							local1097 = Static440.aFloatArray51[0];
							Static9.method165(Static440.aFloatArray51, local1169, arg1.anIntArray335[local1159], local1174, arg1.anIntArray325[local1159], arg1.anIntArray333[local1159], local1184, local1179, local1189, local1197);
							local1103 = Static440.aFloatArray51[1];
							local1101 = Static440.aFloatArray51[0];
							Static9.method165(Static440.aFloatArray51, local1169, arg1.anIntArray335[local1164], local1174, arg1.anIntArray325[local1164], arg1.anIntArray333[local1164], local1184, local1179, local1189, local1197);
							local1105 = Static440.aFloatArray51[0];
							local1107 = Static440.aFloatArray51[1];
							if ((local1189 & 0x1) == 0) {
								if (local1105 - local1097 > 0.5F) {
									local1105--;
									local1111 = 1;
								} else if (local1097 - local1105 > 0.5F) {
									local1105++;
									local1111 = 2;
								}
								if (local1101 - local1097 > 0.5F) {
									local1101--;
									local1109 = 1;
								} else if (local1097 - local1101 > 0.5F) {
									local1109 = 2;
									local1101++;
								}
							} else {
								if (local1103 - local1099 > 0.5F) {
									local1103--;
									local1109 = 1;
								} else if (local1099 - local1103 > 0.5F) {
									local1103++;
									local1109 = 2;
								}
								if (local1107 - local1099 > 0.5F) {
									local1111 = 1;
									local1107--;
								} else if (local1099 - local1107 > 0.5F) {
									local1107++;
									local1111 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray33 == null) {
				local1147 = 0;
			} else {
				local1147 = arg1.aByteArray33[local1031];
			}
			if (local1147 == 0) {
				@Pc(2470) long local2470 = ((long) (local1113 << 24) + (long) (local1038 << 8) + (long) local757 << 32) + (long) (local746 << 2);
				local1164 = arg1.aShortArray54[local1031];
				local1961 = arg1.aShortArray57[local1031];
				local1966 = arg1.aShortArray52[local1031];
				@Pc(2489) Class279 local2489 = local425[local1164];
				this.aShortArray72[local162] = this.method4775(local2470, local1097, arg1, local1164, local2489.anInt7806, local2489.anInt7808, local1099, local2489.anInt7807, local162, local2489.anInt7810);
				@Pc(2514) Class279 local2514 = local425[local1961];
				this.aShortArray69[local162] = this.method4775((long) local1109 + local2470, local1101, arg1, local1961, local2514.anInt7806, local2514.anInt7808, local1103, local2514.anInt7807, local162, local2514.anInt7810);
				@Pc(2542) Class279 local2542 = local425[local1966];
				this.aShortArray78[local162] = this.method4775((long) local1111 + local2470, local1105, arg1, local1966, local2542.anInt7806, local2542.anInt7808, local1107, local2542.anInt7807, local162, local2542.anInt7810);
			} else if (local1147 == 1) {
				@Pc(2329) Class22 local2329 = local717[local1031];
				@Pc(2372) long local2372 = (long) ((local2329.anInt544 + 256 << 22) + (local2329.anInt542 > 0 ? 1024 : 2048) + (local746 << 2) + (local2329.anInt543 + 256 << 12)) + ((long) local757 + (long) (local1038 << 8) + (long) (local1113 << 24) << 32);
				this.aShortArray72[local162] = this.method4775(local2372, local1097, arg1, arg1.aShortArray54[local1031], local2329.anInt544, local2329.anInt543, local1099, 0, local162, local2329.anInt542);
				this.aShortArray69[local162] = this.method4775((long) local1109 + local2372, local1101, arg1, arg1.aShortArray57[local1031], local2329.anInt544, local2329.anInt543, local1103, 0, local162, local2329.anInt542);
				this.aShortArray78[local162] = this.method4775(local2372 + (long) local1111, local1105, arg1, arg1.aShortArray52[local1031], local2329.anInt544, local2329.anInt543, local1107, 0, local162, local2329.anInt542);
			}
			if (arg1.aByteArray34 != null) {
				this.aByteArray49[local162] = arg1.aByteArray34[local1031];
			}
			if (arg1.aShortArray53 != null) {
				this.aShortArray80[local162] = arg1.aShortArray53[local1031];
			}
			this.lb[local162] = arg1.aShortArray50[local1031];
			this.aShortArray77[local162] = local1074;
		}
		if (this.anInt5189 > 0) {
			local1031 = 1;
			local736 = this.aShortArray77[0];
			for (local746 = 0; local746 < this.anInt5189; local746++) {
				@Pc(2629) short local2629 = this.aShortArray77[local746];
				if (local2629 != local736) {
					local1031++;
					local736 = local2629;
				}
			}
			this.anIntArray464 = new int[local1031];
			this.anIntArray465 = new int[local1031];
			this.anIntArray469 = new int[local1031 + 1];
			this.anIntArray469[0] = 0;
			local757 = this.anInt5218;
			local736 = this.aShortArray77[0];
			local1074 = 0;
			local1031 = 0;
			for (local778 = 0; local778 < this.anInt5189; local778++) {
				@Pc(2684) short local2684 = this.aShortArray77[local778];
				if (local2684 != local736) {
					this.anIntArray465[local1031] = local757;
					this.anIntArray464[local1031] = local1074 + 1 - local757;
					local1031++;
					this.anIntArray469[local1031] = local778;
					local736 = local2684;
					local757 = this.anInt5218;
					local1074 = 0;
				}
				@Pc(2720) short local2720 = this.aShortArray72[local778];
				if (local2720 < local757) {
					local757 = local2720;
				}
				if (local1074 < local2720) {
					local1074 = local2720;
				}
				local2720 = this.aShortArray69[local778];
				if (local1074 < local2720) {
					local1074 = local2720;
				}
				if (local757 > local2720) {
					local757 = local2720;
				}
				local2720 = this.aShortArray78[local778];
				if (local2720 > local1074) {
					local1074 = local2720;
				}
				if (local757 > local2720) {
					local757 = local2720;
				}
			}
			this.anIntArray465[local1031] = local757;
			this.anIntArray464[local1031] = local1074 + 1 - local757;
			local1031++;
			this.anIntArray469[local1031] = this.anInt5189;
		}
		Static155.aLongArray4 = null;
		this.aShortArray70 = Static544.method7823(this.aShortArray70, this.anInt5218);
		this.aShortArray71 = Static544.method7823(this.aShortArray71, this.anInt5218);
		this.aShortArray73 = Static544.method7823(this.aShortArray73, this.anInt5218);
		this.aShortArray76 = Static544.method7823(this.aShortArray76, this.anInt5218);
		this.aShortArray79 = Static544.method7823(this.aShortArray79, this.anInt5218);
		this.aByteArray48 = Static264.method4360(this.aByteArray48, this.anInt5218);
		this.aFloatArray28 = Static265.method4370(this.aFloatArray28, this.anInt5218);
		this.aFloatArray29 = Static265.method4370(this.aFloatArray29, this.anInt5218);
		if (arg1.anIntArray328 != null && Static94.method1711(arg2, this.anInt5239)) {
			this.anIntArrayArray32 = arg1.method3488(false);
		}
		if (arg1.aClass163Array1 != null && Static664.method9173(arg2, this.anInt5239)) {
			this.anIntArrayArray33 = arg1.method3482();
		}
		if (arg1.anIntArray332 != null && Static647.method8982(this.anInt5239, arg2)) {
			local1031 = 0;
			@Pc(2908) int[] local2908 = new int[256];
			for (local746 = 0; local746 < this.anInt5182; local746++) {
				local757 = arg1.anIntArray332[local15[local746]];
				if (local757 >= 0) {
					if (local757 > local1031) {
						local1031 = local757;
					}
					@Pc(2930) int local2930 = local2908[local757]++;
				}
			}
			this.anIntArrayArray31 = new int[local1031 + 1][];
			for (local757 = 0; local757 <= local1031; local757++) {
				this.anIntArrayArray31[local757] = new int[local2908[local757]];
				local2908[local757] = 0;
			}
			for (local767 = 0; local767 < this.anInt5182; local767++) {
				local778 = arg1.anIntArray332[local15[local767]];
				if (local778 >= 0) {
					this.anIntArrayArray31[local778][local2908[local778]++] = local767;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!ai;IIZZ)V")
	public Class95_Sub2(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean380 = false;
		this.aBoolean382 = true;
		this.aBoolean381 = false;
		this.anInt5182 = 0;
		this.anInt5218 = 0;
		this.aBoolean379 = false;
		this.aBoolean383 = false;
		this.anInt5227 = 0;
		this.anInt5189 = 0;
		this.anInt5238 = 0;
		this.aClass13_Sub1_13 = arg0;
		this.anInt5234 = arg1;
		this.aBoolean383 = arg4;
		this.anInt5239 = arg2;
		if (arg3 || Static393.method5548(this.anInt5239, this.anInt5234)) {
			this.aClass258_4 = new Class258(Static94.method1709(this.anInt5234, this.anInt5239));
		}
		if (arg3 || Static528.method7626(this.anInt5239, this.anInt5234)) {
			this.aClass258_3 = new Class258(Static156.method2847(this.anInt5239, this.anInt5234));
		}
		if (arg3 || Static295.method4573(this.anInt5234, this.anInt5239)) {
			this.aClass258_1 = new Class258(Static581.method7252(this.anInt5234, this.anInt5239));
		}
		if (arg3 || Static419.method1507(this.anInt5234, this.anInt5239)) {
			this.aClass258_2 = new Class258(Static257.method4214(this.anInt5239, this.anInt5234));
		}
		if (arg3 || Static89.method1669(this.anInt5239, this.anInt5234)) {
			this.aClass217_1 = new Class217(Static574.method8103(this.anInt5234, this.anInt5239));
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "()V")
	@Override
	public void method5665() {
		if (this.anInt5218 > 0 && this.anInt5189 > 0) {
			this.method4765();
			this.method4779();
			this.method4778();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Z")
	private boolean method4765() {
		@Pc(13) boolean local13 = !this.aClass258_1.aBoolean493;
		@Pc(26) boolean local26 = (this.anInt5239 & 0x37) != 0 && !this.aClass258_2.aBoolean493;
		@Pc(34) boolean local34 = !this.aClass258_4.aBoolean493;
		@Pc(42) boolean local42 = !this.aClass258_3.aBoolean493;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface15 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass258_4.anInterface15_10 == null) {
				this.aClass258_4.anInterface15_10 = this.aClass13_Sub1_13.method7541(this.aBoolean383);
			}
			local73 = this.aClass258_4.anInterface15_10;
			local73.method8746(this.anInt5218 * 12, 12);
			local87 = local73.method8744();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass13_Sub1_13.aNativeInterface3.copyPositions(this.anIntArray463, this.anIntArray467, this.anIntArray466, this.aShortArray70, 0, 12, this.anInt5218, local87.getAddress());
				if (local73.method8747()) {
					this.aClass258_4.anInterface15_11 = local73;
					this.aClass258_4.aBoolean493 = true;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(210) short[] local210;
		@Pc(204) short[] local204;
		@Pc(201) short[] local201;
		@Pc(207) byte[] local207;
		if (local13) {
			if (this.aClass258_1.anInterface15_10 == null) {
				this.aClass258_1.anInterface15_10 = this.aClass13_Sub1_13.method7541(this.aBoolean383);
			}
			local73 = this.aClass258_1.anInterface15_10;
			local73.method8746(this.anInt5218 * 4, 4);
			local87 = local73.method8744();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt5239 & 0x37) == 0) {
					if (this.aClass294_1 == null) {
						local201 = this.aShortArray79;
						local204 = this.aShortArray76;
						local207 = this.aByteArray48;
						local210 = this.aShortArray73;
					} else {
						local207 = this.aClass294_1.aByteArray88;
						local204 = this.aClass294_1.aShortArray118;
						local201 = this.aClass294_1.aShortArray119;
						local210 = this.aClass294_1.aShortArray117;
					}
					this.aClass13_Sub1_13.aNativeInterface3.copyLighting(this.lb, this.aByteArray49, this.aShortArray77, local210, local204, local201, local207, this.aShort54, this.aShort53, this.aShortArray71, 0, 4, this.anInt5218, local87.getAddress());
				} else {
					this.aClass13_Sub1_13.aNativeInterface3.copyColours(this.lb, this.aByteArray49, this.aShortArray77, this.aShort54, this.aShortArray71, 0, 4, this.anInt5218, local87.getAddress());
				}
				if (local73.method8747()) {
					this.aClass258_1.aBoolean493 = true;
					this.aClass258_1.anInterface15_11 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass258_2.anInterface15_10 == null) {
				this.aClass258_2.anInterface15_10 = this.aClass13_Sub1_13.method7541(this.aBoolean383);
			}
			local73 = this.aClass258_2.anInterface15_10;
			local73.method8746(this.anInt5218 * 12, 12);
			local87 = local73.method8744();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass294_1 == null) {
					local201 = this.aShortArray79;
					local204 = this.aShortArray76;
					local210 = this.aShortArray73;
					local207 = this.aByteArray48;
				} else {
					local207 = this.aClass294_1.aByteArray88;
					local204 = this.aClass294_1.aShortArray118;
					local210 = this.aClass294_1.aShortArray117;
					local201 = this.aClass294_1.aShortArray119;
				}
				this.aClass13_Sub1_13.aNativeInterface3.copyNormals(local210, local204, local201, local207, 3.0F / (float) this.aShort53, 3.0F / (float) (this.aShort53 + this.aShort53 / 2), 0, 12, this.anInt5218, local87.getAddress());
				if (local73.method8747()) {
					this.aClass258_2.aBoolean493 = true;
					this.aClass258_2.anInterface15_11 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass258_3.anInterface15_10 == null) {
				this.aClass258_3.anInterface15_10 = this.aClass13_Sub1_13.method7541(this.aBoolean383);
			}
			local73 = this.aClass258_3.anInterface15_10;
			local73.method8746(this.anInt5218 * 8, 8);
			local87 = local73.method8744();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass13_Sub1_13.aNativeInterface3.copyTexCoords(this.aFloatArray28, this.aFloatArray29, 0, 8, this.anInt5218, local87.getAddress());
				if (local73.method8747()) {
					this.aClass258_3.aBoolean493 = true;
					this.aClass258_3.anInterface15_11 = local73;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!kj", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5214;
	}

	@OriginalMember(owner = "client!kj", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort54;
	}

	@OriginalMember(owner = "client!kj", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5238; local7++) {
			if (arg0 != 128) {
				this.anIntArray463[local7] = arg0 * this.anIntArray463[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray467[local7] = this.anIntArray467[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray466[local7] = this.anIntArray466[local7] * arg2 >> 7;
			}
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
	public void method4767() {
		if (this.aClass258_4 != null) {
			this.aClass258_4.method6233();
		}
		if (this.aClass258_3 != null) {
			this.aClass258_3.method6233();
		}
		if (this.aClass258_1 != null) {
			this.aClass258_1.method6233();
		}
		if (this.aClass258_2 != null) {
			this.aClass258_2.method6233();
		}
		if (this.aClass217_1 != null) {
			this.aClass217_1.method5389();
		}
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "()Z")
	@Override
	public boolean method5666() {
		if (this.aShortArray77 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray77.length; local12++) {
			if (this.aShortArray77[local12] != -1 && !this.aClass13_Sub1_13.anInterface4_14.method4672(this.aShortArray77[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	private void method4768() {
		if (this.aClass67Array1 == null) {
			return;
		}
		this.aClass13_Sub1_13.C(!this.aBoolean380);
		this.aClass13_Sub1_13.method7465(false);
		this.aClass13_Sub1_13.method7522(Static125.aClass326_1, 1);
		this.aClass13_Sub1_13.method7517(1, Static125.aClass326_1);
		for (@Pc(36) int local36 = 0; local36 < this.anInt5180; local36++) {
			@Pc(43) Class67 local43 = this.aClass67Array1[local36];
			@Pc(48) Class177 local48 = this.aClass177Array1[local36];
			if (!local43.aBoolean137 || !this.aClass13_Sub1_13.method8451()) {
				@Pc(76) float local76 = (float) (this.anIntArray463[local43.anInt1720] + this.anIntArray463[local43.anInt1723] + this.anIntArray463[local43.anInt1721]) * 0.3333333F;
				@Pc(97) float local97 = (float) (this.anIntArray467[local43.anInt1720] + this.anIntArray467[local43.anInt1723] + this.anIntArray467[local43.anInt1721]) * 0.3333333F;
				@Pc(118) float local118 = (float) (this.anIntArray466[local43.anInt1721] + this.anIntArray466[local43.anInt1720] + this.anIntArray466[local43.anInt1723]) * 0.3333333F;
				@Pc(132) float local132 = local118 * Static462.aFloat157 + local97 * Static318.aFloat111 + local76 * Static257.aFloat100 + Static340.aFloat117;
				@Pc(146) float local146 = Static41.aFloat35 * local118 + local76 * Static607.aFloat205 + Static231.aFloat95 * local97 + Static284.aFloat105;
				@Pc(160) float local160 = Static305.aFloat106 + local97 * Static173.aFloat86 + Static128.aFloat73 * local76 + local118 * Static541.aFloat194;
				@Pc(181) float local181 = (float) (1.0D / Math.sqrt((double) (local160 * local160 + local146 * local146 + local132 * local132))) * (float) local43.anInt1722;
				@Pc(186) Class239_Sub3 local186 = this.aClass13_Sub1_13.method7480();
				local186.method9268(local48.anInt4931, (float) local48.anInt4930 + local146 - local146 * local181, local132 + (float) local48.anInt4929 - local181 * local132, local160 - local181 * local160, local43.aShort20 * local48.anInt4933 >> 7, local48.anInt4928 * local43.aShort21 >> 7);
				local186.method9252(this.aClass13_Sub1_13.aClass239_Sub3_17);
				this.aClass13_Sub1_13.method7515();
				@Pc(241) int local241 = local48.anInt4934;
				this.aClass13_Sub1_13.method7508(false, local43.aShort19, false);
				this.aClass13_Sub1_13.method7440(local43.aByte31);
				this.aClass13_Sub1_13.method7539(local241);
				this.aClass13_Sub1_13.method7481();
			}
		}
		this.aClass13_Sub1_13.method7517(1, Static348.aClass326_4);
		this.aClass13_Sub1_13.method7522(Static348.aClass326_4, 1);
		this.aClass13_Sub1_13.C(true);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method5672(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(29) int local29;
		@Pc(35) int local35;
		@Pc(59) int local59;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(41) int local41;
		@Pc(51) int[] local51;
		@Pc(53) int local53;
		if (arg0 == 0) {
			local17 = arg2 << 4;
			local21 = arg3 << 4;
			local25 = arg4 << 4;
			Static73.anInt1385 = 0;
			local29 = 0;
			Static67.anInt1311 = 0;
			Static126.anInt2579 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (this.anIntArrayArray32.length > local41) {
					local51 = this.anIntArrayArray32[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						Static67.anInt1311 += this.anIntArray463[local59];
						Static126.anInt2579 += this.anIntArray467[local59];
						local29++;
						Static73.anInt1385 += this.anIntArray466[local59];
					}
				}
			}
			if (local29 > 0) {
				Static73.anInt1385 = local25 + Static73.anInt1385 / local29;
				Static126.anInt2579 = Static126.anInt2579 / local29 + local21;
				Static67.anInt1311 = Static67.anInt1311 / local29 + local17;
			} else {
				Static126.anInt2579 = local21;
				Static73.anInt1385 = local25;
				Static67.anInt1311 = local17;
			}
			return;
		}
		@Pc(157) int[] local157;
		@Pc(159) int local159;
		if (arg0 == 1) {
			local21 = arg3 << 4;
			local17 = arg2 << 4;
			local25 = arg4 << 4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray32.length > local35) {
					local157 = this.anIntArrayArray32[local35];
					for (local159 = 0; local159 < local157.length; local159++) {
						local53 = local157[local159];
						this.anIntArray463[local53] += local17;
						this.anIntArray467[local53] += local21;
						this.anIntArray466[local53] += local25;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(297) int local297;
		@Pc(750) int local750;
		@Pc(759) int local759;
		if (arg0 == 2) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (this.anIntArrayArray32.length > local35) {
					local157 = this.anIntArrayArray32[local35];
					if ((arg5 & 0x1) == 0) {
						for (local159 = 0; local159 < local157.length; local159++) {
							local53 = local157[local159];
							this.anIntArray463[local53] -= Static67.anInt1311;
							this.anIntArray467[local53] -= Static126.anInt2579;
							this.anIntArray466[local53] -= Static73.anInt1385;
							if (arg4 != 0) {
								local59 = Class3_Sub20.anIntArray206[arg4];
								local278 = Class3_Sub20.anIntArray204[arg4];
								local297 = local278 * this.anIntArray463[local53] + this.anIntArray467[local53] * local59 + 16383 >> 14;
								this.anIntArray467[local53] = this.anIntArray467[local53] * local278 + 16383 - local59 * this.anIntArray463[local53] >> 14;
								this.anIntArray463[local53] = local297;
							}
							if (arg2 != 0) {
								local59 = Class3_Sub20.anIntArray206[arg2];
								local278 = Class3_Sub20.anIntArray204[arg2];
								local297 = local278 * this.anIntArray467[local53] + 16383 - local59 * this.anIntArray466[local53] >> 14;
								this.anIntArray466[local53] = this.anIntArray466[local53] * local278 + local59 * this.anIntArray467[local53] + 16383 >> 14;
								this.anIntArray467[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class3_Sub20.anIntArray206[arg3];
								local278 = Class3_Sub20.anIntArray204[arg3];
								local297 = local278 * this.anIntArray463[local53] + local59 * this.anIntArray466[local53] + 16383 >> 14;
								this.anIntArray466[local53] = local278 * this.anIntArray466[local53] + 16383 - this.anIntArray463[local53] * local59 >> 14;
								this.anIntArray463[local53] = local297;
							}
							this.anIntArray463[local53] += Static67.anInt1311;
							this.anIntArray467[local53] += Static126.anInt2579;
							this.anIntArray466[local53] += Static73.anInt1385;
						}
					} else {
						for (local159 = 0; local159 < local157.length; local159++) {
							local53 = local157[local159];
							this.anIntArray463[local53] -= Static67.anInt1311;
							this.anIntArray467[local53] -= Static126.anInt2579;
							this.anIntArray466[local53] -= Static73.anInt1385;
							if (arg2 != 0) {
								local59 = Class3_Sub20.anIntArray206[arg2];
								local278 = Class3_Sub20.anIntArray204[arg2];
								local297 = this.anIntArray467[local53] * local278 + 16383 - this.anIntArray466[local53] * local59 >> 14;
								this.anIntArray466[local53] = local278 * this.anIntArray466[local53] + local59 * this.anIntArray467[local53] + 16383 >> 14;
								this.anIntArray467[local53] = local297;
							}
							if (arg4 != 0) {
								local59 = Class3_Sub20.anIntArray206[arg4];
								local278 = Class3_Sub20.anIntArray204[arg4];
								local297 = local278 * this.anIntArray463[local53] + local59 * this.anIntArray467[local53] + 16383 >> 14;
								this.anIntArray467[local53] = this.anIntArray467[local53] * local278 + 16383 - local59 * this.anIntArray463[local53] >> 14;
								this.anIntArray463[local53] = local297;
							}
							if (arg3 != 0) {
								local59 = Class3_Sub20.anIntArray206[arg3];
								local278 = Class3_Sub20.anIntArray204[arg3];
								local297 = local278 * this.anIntArray463[local53] + local59 * this.anIntArray466[local53] + 16383 >> 14;
								this.anIntArray466[local53] = this.anIntArray466[local53] * local278 + 16383 - this.anIntArray463[local53] * local59 >> 14;
								this.anIntArray463[local53] = local297;
							}
							this.anIntArray463[local53] += Static67.anInt1311;
							this.anIntArray467[local53] += Static126.anInt2579;
							this.anIntArray466[local53] += Static73.anInt1385;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local41 = arg1[local35];
					if (local41 < this.anIntArrayArray32.length) {
						local51 = this.anIntArrayArray32[local41];
						for (local53 = 0; local53 < local51.length; local53++) {
							local59 = local51[local53];
							local278 = this.anIntArray468[local59];
							local297 = this.anIntArray468[local59 + 1];
							for (local750 = local278; local750 < local297; local750++) {
								local759 = this.aShortArray74[local750] - 1;
								if (local759 == -1) {
									break;
								}
								@Pc(768) int local768;
								@Pc(772) int local772;
								@Pc(791) int local791;
								if (arg4 != 0) {
									local768 = Class3_Sub20.anIntArray206[arg4];
									local772 = Class3_Sub20.anIntArray204[arg4];
									local791 = local768 * this.aShortArray76[local759] + local772 * this.aShortArray73[local759] + 16383 >> 14;
									this.aShortArray76[local759] = (short) (this.aShortArray76[local759] * local772 + 16383 - this.aShortArray73[local759] * local768 >> 14);
									this.aShortArray73[local759] = (short) local791;
								}
								if (arg2 != 0) {
									local768 = Class3_Sub20.anIntArray206[arg2];
									local772 = Class3_Sub20.anIntArray204[arg2];
									local791 = local772 * this.aShortArray76[local759] + 16383 - local768 * this.aShortArray79[local759] >> 14;
									this.aShortArray79[local759] = (short) (local768 * this.aShortArray76[local759] + this.aShortArray79[local759] * local772 + 16383 >> 14);
									this.aShortArray76[local759] = (short) local791;
								}
								if (arg3 != 0) {
									local768 = Class3_Sub20.anIntArray206[arg3];
									local772 = Class3_Sub20.anIntArray204[arg3];
									local791 = this.aShortArray79[local759] * local768 + this.aShortArray73[local759] * local772 + 16383 >> 14;
									this.aShortArray79[local759] = (short) (this.aShortArray79[local759] * local772 + 16383 - this.aShortArray73[local759] * local768 >> 14);
									this.aShortArray73[local759] = (short) local791;
								}
							}
						}
					}
				}
				this.method4776();
			}
		} else if (arg0 == 3) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray32.length) {
					local157 = this.anIntArrayArray32[local35];
					for (local159 = 0; local159 < local157.length; local159++) {
						local53 = local157[local159];
						this.anIntArray463[local53] -= Static67.anInt1311;
						this.anIntArray467[local53] -= Static126.anInt2579;
						this.anIntArray466[local53] -= Static73.anInt1385;
						this.anIntArray463[local53] = arg2 * this.anIntArray463[local53] >> 7;
						this.anIntArray467[local53] = arg3 * this.anIntArray467[local53] >> 7;
						this.anIntArray466[local53] = arg4 * this.anIntArray466[local53] >> 7;
						this.anIntArray463[local53] += Static67.anInt1311;
						this.anIntArray467[local53] += Static126.anInt2579;
						this.anIntArray466[local53] += Static73.anInt1385;
					}
				}
			}
		} else {
			@Pc(1203) Class177 local1203;
			@Pc(1105) boolean local1105;
			@Pc(1198) Class67 local1198;
			if (arg0 == 5) {
				if (this.anIntArrayArray31 != null) {
					local1105 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray31.length) {
							local51 = this.anIntArrayArray31[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local278 = (this.aByteArray49[local59] & 0xFF) + arg2 * 8;
								if (local278 < 0) {
									local278 = 0;
								} else if (local278 > 255) {
									local278 = 255;
								}
								this.aByteArray49[local59] = (byte) local278;
							}
							local1105 |= local51.length > 0;
						}
					}
					if (local1105) {
						if (this.aClass67Array1 != null) {
							for (local41 = 0; local41 < this.anInt5180; local41++) {
								local1198 = this.aClass67Array1[local41];
								local1203 = this.aClass177Array1[local41];
								local1203.anInt4934 = 255 - (this.aByteArray49[local1198.anInt1719] & 0xFF) << 24 | local1203.anInt4934 & 0xFFFFFF;
							}
						}
						this.method4780();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray31 != null) {
					local1105 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray31.length) {
							local51 = this.anIntArrayArray31[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								local278 = this.lb[local59] & 0xFFFF;
								local297 = local278 >> 10 & 0x3F;
								local750 = local278 >> 7 & 0x7;
								local759 = local278 & 0x7F;
								@Pc(1302) int local1302 = local297 + arg2 & 0x3F;
								local750 += arg3 / 4;
								local759 += arg4;
								if (local750 < 0) {
									local750 = 0;
								} else if (local750 > 7) {
									local750 = 7;
								}
								if (local759 < 0) {
									local759 = 0;
								} else if (local759 > 127) {
									local759 = 127;
								}
								this.lb[local59] = (short) (local759 | local750 << 7 | local1302 << 10);
							}
							local1105 |= local51.length > 0;
						}
					}
					if (local1105) {
						if (this.aClass67Array1 != null) {
							for (local41 = 0; local41 < this.anInt5180; local41++) {
								local1198 = this.aClass67Array1[local41];
								local1203 = this.aClass177Array1[local41];
								local1203.anInt4934 = local1203.anInt4934 & 0xFF000000 | Static363.anIntArray518[this.lb[local1198.anInt1719] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method4780();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray33 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray33.length) {
							local157 = this.anIntArrayArray33[local35];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1203 = this.aClass177Array1[local157[local159]];
								local1203.anInt4930 += arg3;
								local1203.anInt4929 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray33 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray33.length) {
							local157 = this.anIntArrayArray33[local35];
							for (local159 = 0; local159 < local157.length; local159++) {
								local1203 = this.aClass177Array1[local157[local159]];
								local1203.anInt4928 = local1203.anInt4928 * arg3 >> 7;
								local1203.anInt4933 = arg2 * local1203.anInt4933 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray33.length) {
						local157 = this.anIntArrayArray33[local35];
						for (local159 = 0; local159 < local157.length; local159++) {
							local1203 = this.aClass177Array1[local157[local159]];
							local1203.anInt4931 = local1203.anInt4931 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!uu;Lclient!taa;II)V")
	@Override
	public void method5659(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5218 == 0) {
			return;
		}
		@Pc(16) Class239_Sub3 local16 = this.aClass13_Sub1_13.aClass239_Sub3_16;
		if (!this.aBoolean381) {
			this.method4782();
		}
		@Pc(25) Class239_Sub3 local25 = (Class239_Sub3) arg0;
		Static305.aFloat106 = local16.aFloat220 + local25.aFloat217 * local16.aFloat224 + local25.aFloat218 * local16.aFloat222 + local25.aFloat220 * local16.aFloat221;
		Static173.aFloat86 = local25.aFloat224 * local16.aFloat221 + local16.aFloat222 * local25.aFloat216 + local25.aFloat214 * local16.aFloat224;
		@Pc(72) float local72 = Static305.aFloat106 + Static173.aFloat86 * (float) this.anInt5240;
		@Pc(80) float local80 = Static173.aFloat86 * (float) this.anInt5197 + Static305.aFloat106;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt5163;
			local96 = local72 + (float) this.anInt5163;
		} else {
			local90 = (float) -this.anInt5163 + local72;
			local96 = (float) this.anInt5163 + local80;
		}
		if (this.aClass13_Sub1_13.bf <= local90 || local96 <= (float) this.aClass13_Sub1_13.anInt8608) {
			return;
		}
		Static340.aFloat117 = local16.aFloat218 + local25.aFloat218 * local16.aFloat219 + local25.aFloat217 * local16.aFloat216 + local16.aFloat225 * local25.aFloat220;
		Static318.aFloat111 = local25.aFloat216 * local16.aFloat219 + local16.aFloat216 * local25.aFloat214 + local25.aFloat224 * local16.aFloat225;
		@Pc(173) float local173 = Static340.aFloat117 + (float) this.anInt5240 * Static318.aFloat111;
		@Pc(181) float local181 = Static318.aFloat111 * (float) this.anInt5197 + Static340.aFloat117;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local173 > local181) {
			local196 = (float) this.aClass13_Sub1_13.anInt8609 * (local173 + (float) this.anInt5163);
			local207 = (float) this.aClass13_Sub1_13.anInt8609 * (local181 - (float) this.anInt5163);
		} else {
			local196 = (local181 + (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8609;
			local207 = (float) this.aClass13_Sub1_13.anInt8609 * (local173 - (float) this.anInt5163);
		}
		if (this.aClass13_Sub1_13.aFloat177 <= local207 / (float) arg2 || local196 / (float) arg2 <= this.aClass13_Sub1_13.aFloat173) {
			return;
		}
		Static284.aFloat105 = local16.aFloat217 + local16.aFloat223 * local25.aFloat218 + local25.aFloat217 * local16.aFloat214 + local16.aFloat215 * local25.aFloat220;
		Static231.aFloat95 = local16.aFloat223 * local25.aFloat216 + local25.aFloat214 * local16.aFloat214 + local25.aFloat224 * local16.aFloat215;
		@Pc(298) float local298 = Static231.aFloat95 * (float) this.anInt5240 + Static284.aFloat105;
		@Pc(306) float local306 = Static284.aFloat105 + (float) this.anInt5197 * Static231.aFloat95;
		@Pc(321) float local321;
		@Pc(332) float local332;
		if (local298 > local306) {
			local321 = (local306 - (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8632;
			local332 = (local298 + (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8632;
		} else {
			local332 = (local306 + (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8632;
			local321 = ((float) -this.anInt5163 + local298) * (float) this.aClass13_Sub1_13.anInt8632;
		}
		if (local321 / (float) arg2 >= this.aClass13_Sub1_13.aFloat185 || local332 / (float) arg2 <= this.aClass13_Sub1_13.aFloat184) {
			return;
		}
		if (arg1 != null || this.aClass67Array1 != null) {
			Static128.aFloat73 = local16.aFloat222 * local25.aFloat219 + local25.aFloat223 * local16.aFloat224 + local16.aFloat221 * local25.aFloat222;
			Static607.aFloat205 = local25.aFloat222 * local16.aFloat215 + local16.aFloat223 * local25.aFloat219 + local16.aFloat214 * local25.aFloat223;
			Static541.aFloat194 = local16.aFloat221 * local25.aFloat221 + local25.aFloat215 * local16.aFloat224 + local25.aFloat225 * local16.aFloat222;
			Static257.aFloat100 = local25.aFloat222 * local16.aFloat225 + local16.aFloat216 * local25.aFloat223 + local16.aFloat219 * local25.aFloat219;
			Static41.aFloat35 = local16.aFloat223 * local25.aFloat225 + local16.aFloat214 * local25.aFloat215 + local16.aFloat215 * local25.aFloat221;
			Static462.aFloat157 = local25.aFloat225 * local16.aFloat219 + local16.aFloat216 * local25.aFloat215 + local16.aFloat225 * local25.aFloat221;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt5176 + this.anInt5214 >> 1;
			@Pc(509) int local509 = this.anInt5177 + this.anInt5212 >> 1;
			@Pc(528) int local528 = (int) (Static462.aFloat157 * (float) local509 + Static340.aFloat117 + Static257.aFloat100 * (float) local500 + (float) this.anInt5240 * Static318.aFloat111);
			@Pc(547) int local547 = (int) (Static284.aFloat105 + (float) local500 * Static607.aFloat205 + (float) this.anInt5240 * Static231.aFloat95 + Static41.aFloat35 * (float) local509);
			@Pc(566) int local566 = (int) (Static541.aFloat194 * (float) local509 + Static128.aFloat73 * (float) local500 + Static305.aFloat106 + Static173.aFloat86 * (float) this.anInt5240);
			@Pc(585) int local585 = (int) (Static462.aFloat157 * (float) local509 + Static318.aFloat111 * (float) this.anInt5197 + Static257.aFloat100 * (float) local500 + Static340.aFloat117);
			@Pc(604) int local604 = (int) (Static41.aFloat35 * (float) local509 + Static284.aFloat105 + (float) local500 * Static607.aFloat205 + Static231.aFloat95 * (float) this.anInt5197);
			@Pc(623) int local623 = (int) ((float) local500 * Static128.aFloat73 + Static305.aFloat106 + Static173.aFloat86 * (float) this.anInt5197 + Static541.aFloat194 * (float) local509);
			arg1.anInt9153 = this.aClass13_Sub1_13.anInt8606 + this.aClass13_Sub1_13.anInt8609 * local585 / arg2;
			arg1.anInt9151 = this.aClass13_Sub1_13.anInt8606 + local528 * this.aClass13_Sub1_13.anInt8609 / arg2;
			arg1.anInt9152 = this.aClass13_Sub1_13.anInt8611 + this.aClass13_Sub1_13.anInt8632 * local547 / arg2;
			arg1.anInt9150 = this.aClass13_Sub1_13.anInt8611 + local604 * this.aClass13_Sub1_13.anInt8632 / arg2;
			if (local566 >= this.aClass13_Sub1_13.anInt8608 || this.aClass13_Sub1_13.anInt8608 <= local623) {
				arg1.anInt9149 = this.aClass13_Sub1_13.anInt8606 + (local528 + this.anInt5163) * this.aClass13_Sub1_13.anInt8609 / arg2 - arg1.anInt9151;
				arg1.aBoolean716 = true;
			}
		}
		this.aClass13_Sub1_13.method7417((float) arg2);
		this.aClass13_Sub1_13.method7519();
		this.aClass13_Sub1_13.method7413(local25);
		this.method4772();
		this.method4768();
	}

	@OriginalMember(owner = "client!kj", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5238; local15++) {
			@Pc(33) int local33 = this.anIntArray463[local15] * local13 + this.anIntArray467[local15] * local9 >> 14;
			this.anIntArray467[local15] = this.anIntArray467[local15] * local13 - this.anIntArray463[local15] * local9 >> 14;
			this.anIntArray463[local15] = local33;
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "()[Lclient!kw;")
	@Override
	public Class197[] method5668() {
		return this.aClass197Array4;
	}

	@OriginalMember(owner = "client!kj", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort53 = (short) arg0;
		this.method4773();
		this.method4776();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!uu;IZ)V")
	@Override
	public void method5656(@OriginalArg(0) Class239 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray75 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5238; local14++) {
			if ((arg1 & this.aShortArray75[local14]) != 0) {
				if (arg2) {
					arg0.method9240(this.anIntArray463[local14], this.anIntArray467[local14], this.anIntArray466[local14], local12);
				} else {
					arg0.method9238(this.anIntArray463[local14], this.anIntArray467[local14], this.anIntArray466[local14], local12);
				}
				this.anIntArray463[local14] = local12[0];
				this.anIntArray467[local14] = local12[1];
				this.anIntArray466[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5238; local15++) {
			@Pc(33) int local33 = this.anIntArray463[local15] * local13 + local9 * this.anIntArray466[local15] >> 14;
			this.anIntArray466[local15] = this.anIntArray466[local15] * local13 - local9 * this.anIntArray463[local15] >> 14;
			this.anIntArray463[local15] = local33;
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!de;I)V")
	private void method4769(@OriginalArg(0) Class3_Sub11_Sub3_Sub1 arg0) {
		if (this.anInt5218 > Static625.anIntArray867.length) {
			Static625.anIntArray867 = new int[this.anInt5218];
			Static623.anIntArray861 = new int[this.anInt5218];
		}
		@Pc(55) int local55;
		@Pc(93) int local93;
		@Pc(102) int local102;
		for (@Pc(28) int local28 = 0; local28 < this.anInt5238; local28++) {
			local55 = (this.anIntArray463[local28] - (this.anIntArray467[local28] * this.aClass13_Sub1_13.anInt8597 >> 8) >> this.aClass13_Sub1_13.anInt8595) - arg0.anInt1811;
			@Pc(79) int local79 = (this.anIntArray466[local28] - (this.aClass13_Sub1_13.anInt8596 * this.anIntArray467[local28] >> 8) >> this.aClass13_Sub1_13.anInt8595) - arg0.anInt1813;
			@Pc(84) int local84 = this.anIntArray468[local28];
			@Pc(91) int local91 = this.anIntArray468[local28 + 1];
			for (local93 = local84; local93 < local91; local93++) {
				local102 = this.aShortArray74[local93] - 1;
				if (local102 == -1) {
					break;
				}
				Static625.anIntArray867[local102] = local55;
				Static623.anIntArray861[local102] = local79;
			}
		}
		for (local55 = 0; local55 < this.anInt5189; local55++) {
			if (this.aByteArray49 == null || this.aByteArray49[local55] <= 128) {
				@Pc(140) short local140 = this.aShortArray72[local55];
				@Pc(145) short local145 = this.aShortArray69[local55];
				@Pc(150) short local150 = this.aShortArray78[local55];
				local93 = Static625.anIntArray867[local140];
				local102 = Static625.anIntArray867[local145];
				@Pc(162) int local162 = Static625.anIntArray867[local150];
				@Pc(166) int local166 = Static623.anIntArray861[local140];
				@Pc(170) int local170 = Static623.anIntArray861[local145];
				@Pc(174) int local174 = Static623.anIntArray861[local150];
				if (-((local162 - local102) * (-local166 + local170)) + (local170 - local174) * (local93 - local102) > 0) {
					arg0.method1745(local162, local93, local170, local166, local102, local174);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5169;
	}

	@OriginalMember(owner = "client!kj", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5234;
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "()V")
	@Override
	protected void method5667() {
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method4770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg3 && arg0 > arg3 && arg3 < arg4) {
			return false;
		} else if (arg3 > arg7 && arg3 > arg0 && arg3 > arg4) {
			return false;
		} else if (arg1 > arg2 && arg2 < arg6 && arg5 > arg2) {
			return false;
		} else {
			return arg1 >= arg2 || arg2 <= arg6 || arg2 <= arg5;
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
	private void method4771() {
		if (this.aClass217_1 != null) {
			this.aClass217_1.aBoolean428 = false;
		}
	}

	@OriginalMember(owner = "client!kj", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5227; local3++) {
			this.anIntArray463[local3] = this.anIntArray463[local3] + 7 >> 4;
			this.anIntArray467[local3] = this.anIntArray467[local3] + 7 >> 4;
			this.anIntArray466[local3] = this.anIntArray466[local3] + 7 >> 4;
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(I)V")
	private void method4772() {
		if (this.anInt5189 == 0) {
			return;
		}
		if (this.method4765() && this.method4779()) {
			this.aClass13_Sub1_13.method7423(this.aClass258_4.anInterface15_11, 0);
			this.aClass13_Sub1_13.method7423(this.aClass258_1.anInterface15_11, 1);
			this.aClass13_Sub1_13.method7423(this.aClass258_3.anInterface15_11, 2);
			@Pc(65) boolean local65;
			if ((this.anInt5239 & 0x37) == 0) {
				this.aClass13_Sub1_13.method7465(false);
				local65 = false;
				this.aClass13_Sub1_13.method7472(this.aClass13_Sub1_13.aClass233_19);
			} else {
				local65 = true;
				this.aClass13_Sub1_13.method7465(true);
				this.aClass13_Sub1_13.method7423(this.aClass258_2.anInterface15_11, 3);
				this.aClass13_Sub1_13.method7472(this.aClass13_Sub1_13.aClass233_20);
			}
			for (@Pc(98) int local98 = 0; local98 < this.anIntArray465.length; local98++) {
				@Pc(105) int local105 = this.anIntArray469[local98];
				@Pc(112) int local112 = this.anIntArray469[local98 + 1];
				@Pc(119) int local119 = this.aShortArray77[local105] & 0xFFFF;
				if (local119 == 65535) {
					local119 = -1;
				}
				this.aClass13_Sub1_13.method7508(true, local119, local65);
				this.aClass13_Sub1_13.method7424(local112 - local105, local105 * 3, this.aClass217_1.anInterface20_4, this.anIntArray465[local98], this.anIntArray464[local98], Static413.aClass393_4);
			}
		}
		this.method4778();
	}

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class21 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean381) {
			this.method4782();
		}
		@Pc(16) int local16 = this.anInt5214 + arg4;
		@Pc(21) int local21 = arg4 + this.anInt5176;
		@Pc(26) int local26 = this.anInt5177 + arg6;
		@Pc(31) int local31 = this.anInt5212 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9123 + local21 >> arg2.anInt9125 >= arg2.anInt9129 || local26 < 0 || local31 + arg2.anInt9123 >> arg2.anInt9125 >= arg2.anInt9128)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || local21 + arg3.anInt9123 >> arg3.anInt9125 >= arg3.anInt9129 || local26 < 0 || arg3.anInt9128 <= arg3.anInt9123 + local31 >> arg3.anInt9125) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9125;
			local21 = local21 + arg2.anInt9123 - 1 >> arg2.anInt9125;
			local26 >>= arg2.anInt9125;
			local31 = local31 + arg2.anInt9123 - 1 >> arg2.anInt9125;
			if (arg2.method7973(local16, local26) == arg5 && arg2.method7973(local21, local26) == arg5 && arg2.method7973(local16, local31) == arg5 && arg5 == arg2.method7973(local21, local31)) {
				return;
			}
		}
		@Pc(210) int local210;
		if (arg0 == 1) {
			for (local210 = 0; local210 < this.anInt5238; local210++) {
				this.anIntArray467[local210] = this.anIntArray467[local210] + arg2.method7980(this.anIntArray466[local210] - -arg6, arg4 + this.anIntArray463[local210]) - arg5;
			}
		} else {
			@Pc(215) int local215;
			@Pc(226) int local226;
			if (arg0 == 2) {
				local210 = this.anInt5240;
				if (local210 == 0) {
					return;
				}
				for (local215 = 0; local215 < this.anInt5238; local215++) {
					local226 = (this.anIntArray467[local215] << 16) / local210;
					if (arg1 > local226) {
						this.anIntArray467[local215] -= -((arg1 - local226) * (-arg5 + arg2.method7980(this.anIntArray466[local215] - -arg6, arg4 + this.anIntArray463[local215])) / arg1);
					}
				}
			} else {
				@Pc(315) int local315;
				if (arg0 == 3) {
					local210 = (arg1 & 0xFF) * 4;
					local215 = (arg1 >> 8 & 0xFF) * 4;
					local226 = (arg1 >> 16 & 0xFF) << 6;
					local315 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local210 >> 1) < 0 || arg2.anInt9129 << arg2.anInt9125 <= arg2.anInt9123 + (local210 >> 1) + arg4 || arg6 - (local215 >> 1) < 0 || arg2.anInt9128 << arg2.anInt9125 <= arg2.anInt9123 + arg6 + (local215 >> 1)) {
						return;
					}
					this.method5655(arg5, arg2, local226, local315, local210, local215, arg4, arg6);
				} else if (arg0 == 4) {
					local210 = this.anInt5197 - this.anInt5240;
					for (local215 = 0; local215 < this.anInt5238; local215++) {
						this.anIntArray467[local215] += arg3.method7980(this.anIntArray466[local215] + arg6, arg4 + this.anIntArray463[local215]) + local210 - arg5;
					}
				} else if (arg0 == 5) {
					local210 = this.anInt5197 - this.anInt5240;
					for (local215 = 0; local215 < this.anInt5238; local215++) {
						local226 = arg4 + this.anIntArray463[local215];
						local315 = this.anIntArray466[local215] + arg6;
						@Pc(321) int local321 = arg2.method7980(local315, local226);
						@Pc(327) int local327 = arg3.method7980(local315, local226);
						@Pc(333) int local333 = local321 - local327 - arg1;
						this.anIntArray467[local215] = (local333 * ((this.anIntArray467[local215] << 8) / local210) >> 8) + local321 - arg5;
					}
				}
			}
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass258_4 != null) {
			this.aClass258_4.aBoolean494 = Static94.method1709(arg0, this.anInt5239);
		}
		if (this.aClass258_3 != null) {
			this.aClass258_3.aBoolean494 = Static156.method2847(this.anInt5239, arg0);
		}
		if (this.aClass258_1 != null) {
			this.aClass258_1.aBoolean494 = Static581.method7252(arg0, this.anInt5239);
		}
		if (this.aClass258_2 != null) {
			this.aClass258_2.aBoolean494 = Static257.method4214(this.anInt5239, arg0);
		}
		this.anInt5234 = arg0;
		this.aBoolean382 = true;
		if (this.aClass294_1 != null && (this.anInt5234 & 0x10000) == 0) {
			this.aShortArray79 = this.aClass294_1.aShortArray119;
			this.aShortArray76 = this.aClass294_1.aShortArray118;
			this.aByteArray48 = this.aClass294_1.aByteArray88;
			this.aShortArray73 = this.aClass294_1.aShortArray117;
			this.aClass294_1 = null;
		}
		this.method4778();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!uu;)V")
	@Override
	public void method5669(@OriginalArg(0) Class239 arg0) {
		@Pc(8) Class239_Sub3 local8 = (Class239_Sub3) arg0;
		@Pc(13) int local13;
		if (this.aClass49Array4 != null) {
			for (local13 = 0; local13 < this.aClass49Array4.length; local13++) {
				@Pc(20) Class49 local20 = this.aClass49Array4[local13];
				@Pc(22) Class49 local22 = local20;
				if (local20.aClass49_1 != null) {
					local22 = local20.aClass49_1;
				}
				local22.anInt1238 = (int) ((float) this.anIntArray466[local20.anInt1244] * local8.aFloat225 + (float) this.anIntArray463[local20.anInt1244] * local8.aFloat219 + (float) this.anIntArray467[local20.anInt1244] * local8.aFloat216 + local8.aFloat218);
				local22.anInt1233 = (int) (local8.aFloat217 + local8.aFloat215 * (float) this.anIntArray466[local20.anInt1244] + (float) this.anIntArray467[local20.anInt1244] * local8.aFloat214 + (float) this.anIntArray463[local20.anInt1244] * local8.aFloat223);
				local22.anInt1234 = (int) (local8.aFloat220 + (float) this.anIntArray466[local20.anInt1244] * local8.aFloat221 + (float) this.anIntArray463[local20.anInt1244] * local8.aFloat222 + local8.aFloat224 * (float) this.anIntArray467[local20.anInt1244]);
				local22.anInt1239 = (int) (local8.aFloat219 * (float) this.anIntArray463[local20.anInt1241] + local8.aFloat216 * (float) this.anIntArray467[local20.anInt1241] + (float) this.anIntArray466[local20.anInt1241] * local8.aFloat225 + local8.aFloat218);
				local22.anInt1231 = (int) (local8.aFloat214 * (float) this.anIntArray467[local20.anInt1241] + local8.aFloat223 * (float) this.anIntArray463[local20.anInt1241] + local8.aFloat215 * (float) this.anIntArray466[local20.anInt1241] + local8.aFloat217);
				local22.anInt1246 = (int) (local8.aFloat221 * (float) this.anIntArray466[local20.anInt1241] + (float) this.anIntArray463[local20.anInt1241] * local8.aFloat222 + local8.aFloat224 * (float) this.anIntArray467[local20.anInt1241] + local8.aFloat220);
				local22.anInt1232 = (int) (local8.aFloat225 * (float) this.anIntArray466[local20.anInt1237] + (float) this.anIntArray467[local20.anInt1237] * local8.aFloat216 + local8.aFloat219 * (float) this.anIntArray463[local20.anInt1237] + local8.aFloat218);
				local22.anInt1245 = (int) (local8.aFloat217 + local8.aFloat215 * (float) this.anIntArray466[local20.anInt1237] + local8.aFloat223 * (float) this.anIntArray463[local20.anInt1237] + (float) this.anIntArray467[local20.anInt1237] * local8.aFloat214);
				local22.anInt1248 = (int) (local8.aFloat220 + (float) this.anIntArray466[local20.anInt1237] * local8.aFloat221 + local8.aFloat224 * (float) this.anIntArray467[local20.anInt1237] + local8.aFloat222 * (float) this.anIntArray463[local20.anInt1237]);
			}
		}
		if (this.aClass197Array4 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass197Array4.length; local13++) {
			@Pc(365) Class197 local365 = this.aClass197Array4[local13];
			@Pc(367) Class197 local367 = local365;
			if (local365.aClass197_1 != null) {
				local367 = local365.aClass197_1;
			}
			if (local365.aClass239_5 == null) {
				local365.aClass239_5 = local8.method9235();
			} else {
				local365.aClass239_5.method9247(local8);
			}
			local367.anInt5427 = (int) (local8.aFloat218 + local8.aFloat225 * (float) this.anIntArray466[local365.anInt5432] + (float) this.anIntArray467[local365.anInt5432] * local8.aFloat216 + local8.aFloat219 * (float) this.anIntArray463[local365.anInt5432]);
			local367.anInt5431 = (int) (local8.aFloat217 + (float) this.anIntArray466[local365.anInt5432] * local8.aFloat215 + local8.aFloat214 * (float) this.anIntArray467[local365.anInt5432] + local8.aFloat223 * (float) this.anIntArray463[local365.anInt5432]);
			local367.anInt5428 = (int) (local8.aFloat220 + local8.aFloat221 * (float) this.anIntArray466[local365.anInt5432] + (float) this.anIntArray463[local365.anInt5432] * local8.aFloat222 + (float) this.anIntArray467[local365.anInt5432] * local8.aFloat224);
		}
	}

	@OriginalMember(owner = "client!kj", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class3_Sub11_Sub3 ba(@OriginalArg(0) Class3_Sub11_Sub3 arg0) {
		if (this.anInt5218 == 0) {
			return null;
		}
		if (!this.aBoolean381) {
			this.method4782();
		}
		@Pc(40) int local40;
		@Pc(57) int local57;
		if (this.aClass13_Sub1_13.anInt8597 <= 0) {
			local40 = this.anInt5214 - (this.anInt5240 * this.aClass13_Sub1_13.anInt8597 >> 8) >> this.aClass13_Sub1_13.anInt8595;
			local57 = this.anInt5176 - (this.anInt5197 * this.aClass13_Sub1_13.anInt8597 >> 8) >> this.aClass13_Sub1_13.anInt8595;
		} else {
			local40 = this.anInt5214 - (this.aClass13_Sub1_13.anInt8597 * this.anInt5197 >> 8) >> this.aClass13_Sub1_13.anInt8595;
			local57 = this.anInt5176 - (this.aClass13_Sub1_13.anInt8597 * this.anInt5240 >> 8) >> this.aClass13_Sub1_13.anInt8595;
		}
		@Pc(116) int local116;
		@Pc(133) int local133;
		if (this.aClass13_Sub1_13.anInt8596 > 0) {
			local116 = this.anInt5177 - (this.anInt5197 * this.aClass13_Sub1_13.anInt8596 >> 8) >> this.aClass13_Sub1_13.anInt8595;
			local133 = this.anInt5212 - (this.anInt5240 * this.aClass13_Sub1_13.anInt8596 >> 8) >> this.aClass13_Sub1_13.anInt8595;
		} else {
			local116 = this.anInt5177 - (this.aClass13_Sub1_13.anInt8596 * this.anInt5240 >> 8) >> this.aClass13_Sub1_13.anInt8595;
			local133 = this.anInt5212 - (this.anInt5197 * this.aClass13_Sub1_13.anInt8596 >> 8) >> this.aClass13_Sub1_13.anInt8595;
		}
		@Pc(176) int local176 = local57 + 1 - local40;
		@Pc(183) int local183 = local133 + 1 - local116;
		@Pc(186) Class3_Sub11_Sub3_Sub1 local186 = (Class3_Sub11_Sub3_Sub1) arg0;
		@Pc(202) Class3_Sub11_Sub3_Sub1 local202;
		if (local186 != null && local186.method1751(local176, local183)) {
			local202 = local186;
			local186.method1748();
		} else {
			local202 = new Class3_Sub11_Sub3_Sub1(this.aClass13_Sub1_13, local176, local183);
		}
		local202.method1749(local57, local116, local40, local133);
		this.method4769(local202);
		return local202;
	}

	@OriginalMember(owner = "client!kj", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray32 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5227; local12++) {
			this.anIntArray463[local12] <<= 0x4;
			this.anIntArray467[local12] <<= 0x4;
			this.anIntArray466[local12] <<= 0x4;
		}
		Static73.anInt1385 = 0;
		Static126.anInt2579 = 0;
		Static67.anInt1311 = 0;
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!uu;ZI)Z")
	@Override
	public boolean method5658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4777(arg3, arg4, arg0, -1, arg2, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "()V")
	@Override
	protected void method5660() {
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Z)V")
	private void method4773() {
		if (this.aClass258_4 != null) {
			this.aClass258_4.aBoolean493 = false;
		}
	}

	@OriginalMember(owner = "client!kj", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort53;
	}

	@OriginalMember(owner = "client!kj", name = "I", descriptor = "(I[IIIIZI[I)V")
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
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			Static73.anInt1385 = 0;
			local29 = 0;
			Static126.anInt2579 = 0;
			Static67.anInt1311 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local41 = arg1[local35];
				if (local41 < this.anIntArrayArray32.length) {
					local51 = this.anIntArrayArray32[local41];
					for (local53 = 0; local53 < local51.length; local53++) {
						local59 = local51[local53];
						if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local59]) != 0) {
							Static67.anInt1311 += this.anIntArray463[local59];
							Static126.anInt2579 += this.anIntArray467[local59];
							Static73.anInt1385 += this.anIntArray466[local59];
							local29++;
						}
					}
				}
			}
			if (local29 <= 0) {
				Static67.anInt1311 = arg2;
				Static126.anInt2579 = arg3;
				Static73.anInt1385 = arg4;
			} else {
				Static650.aBoolean778 = true;
				Static73.anInt1385 = Static73.anInt1385 / local29 + arg4;
				Static67.anInt1311 = Static67.anInt1311 / local29 + arg2;
				Static126.anInt2579 = arg3 + Static126.anInt2579 / local29;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local29 = arg3 * arg7[1] + arg2 * arg7[0] + arg4 * arg7[2] + 8192 >> 14;
				local35 = arg4 * arg7[5] + arg2 * arg7[3] + arg3 * arg7[4] + 8192 >> 14;
				local41 = arg3 * arg7[7] + arg7[6] * arg2 + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local41;
				arg2 = local29;
				arg3 = local35;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray32.length) {
					local247 = this.anIntArrayArray32[local35];
					for (local249 = 0; local249 < local247.length; local249++) {
						local53 = local247[local249];
						if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local53]) != 0) {
							this.anIntArray463[local53] += arg2;
							this.anIntArray467[local53] += arg3;
							this.anIntArray466[local53] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(383) int local383;
		@Pc(401) int local401;
		@Pc(634) int local634;
		@Pc(643) int local643;
		@Pc(652) int local652;
		@Pc(656) int local656;
		@Pc(674) int local674;
		@Pc(1003) int local1003;
		@Pc(1011) int local1011;
		@Pc(1167) int local1167;
		@Pc(1192) int local1192;
		@Pc(1196) int local1196;
		@Pc(1204) int local1204;
		@Pc(1209) int local1209;
		@Pc(1213) int local1213;
		@Pc(1217) int local1217;
		@Pc(1219) int local1219;
		@Pc(1348) int[] local1348;
		@Pc(1350) int local1350;
		@Pc(1354) int local1354;
		@Pc(1358) int local1358;
		@Pc(1360) int local1360;
		@Pc(1493) int local1493;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (local35 < this.anIntArrayArray32.length) {
						local247 = this.anIntArrayArray32[local35];
						for (local249 = 0; local249 < local247.length; local249++) {
							local53 = local247[local249];
							if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local53]) != 0) {
								this.anIntArray463[local53] -= Static67.anInt1311;
								this.anIntArray467[local53] -= Static126.anInt2579;
								this.anIntArray466[local53] -= Static73.anInt1385;
								if (arg4 != 0) {
									local59 = Class3_Sub20.anIntArray206[arg4];
									local383 = Class3_Sub20.anIntArray204[arg4];
									local401 = local383 * this.anIntArray463[local53] + this.anIntArray467[local53] * local59 + 16383 >> 14;
									this.anIntArray467[local53] = local383 * this.anIntArray467[local53] + 16383 - this.anIntArray463[local53] * local59 >> 14;
									this.anIntArray463[local53] = local401;
								}
								if (arg2 != 0) {
									local59 = Class3_Sub20.anIntArray206[arg2];
									local383 = Class3_Sub20.anIntArray204[arg2];
									local401 = this.anIntArray467[local53] * local383 + 16383 - local59 * this.anIntArray466[local53] >> 14;
									this.anIntArray466[local53] = local59 * this.anIntArray467[local53] + this.anIntArray466[local53] * local383 + 16383 >> 14;
									this.anIntArray467[local53] = local401;
								}
								if (arg3 != 0) {
									local59 = Class3_Sub20.anIntArray206[arg3];
									local383 = Class3_Sub20.anIntArray204[arg3];
									local401 = this.anIntArray466[local53] * local59 + this.anIntArray463[local53] * local383 + 16383 >> 14;
									this.anIntArray466[local53] = this.anIntArray466[local53] * local383 + 16383 - this.anIntArray463[local53] * local59 >> 14;
									this.anIntArray463[local53] = local401;
								}
								this.anIntArray463[local53] += Static67.anInt1311;
								this.anIntArray467[local53] += Static126.anInt2579;
								this.anIntArray466[local53] += Static73.anInt1385;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (local41 < this.anIntArrayArray32.length) {
							local51 = this.anIntArrayArray32[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local59]) != 0) {
									local383 = this.anIntArray468[local59];
									local401 = this.anIntArray468[local59 + 1];
									for (local634 = local383; local634 < local401; local634++) {
										local643 = this.aShortArray74[local634] - 1;
										if (local643 == -1) {
											break;
										}
										if (arg4 != 0) {
											local652 = Class3_Sub20.anIntArray206[arg4];
											local656 = Class3_Sub20.anIntArray204[arg4];
											local674 = local652 * this.aShortArray76[local643] + this.aShortArray73[local643] * local656 + 16383 >> 14;
											this.aShortArray76[local643] = (short) (local656 * this.aShortArray76[local643] + 16383 - local652 * this.aShortArray73[local643] >> 14);
											this.aShortArray73[local643] = (short) local674;
										}
										if (arg2 != 0) {
											local652 = Class3_Sub20.anIntArray206[arg2];
											local656 = Class3_Sub20.anIntArray204[arg2];
											local674 = this.aShortArray76[local643] * local656 + 16383 - this.aShortArray79[local643] * local652 >> 14;
											this.aShortArray79[local643] = (short) (this.aShortArray79[local643] * local656 + this.aShortArray76[local643] * local652 + 16383 >> 14);
											this.aShortArray76[local643] = (short) local674;
										}
										if (arg3 != 0) {
											local652 = Class3_Sub20.anIntArray206[arg3];
											local656 = Class3_Sub20.anIntArray204[arg3];
											local674 = local656 * this.aShortArray73[local643] + this.aShortArray79[local643] * local652 + 16383 >> 14;
											this.aShortArray79[local643] = (short) (this.aShortArray79[local643] * local656 + 16383 - local652 * this.aShortArray73[local643] >> 14);
											this.aShortArray73[local643] = (short) local674;
										}
									}
								}
							}
						}
					}
					this.method4776();
					return;
				}
			} else {
				local29 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local41 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local53 = arg7[13] << 4;
				local59 = arg7[14] << 4;
				if (Static650.aBoolean778) {
					local383 = arg7[6] * Static73.anInt1385 + arg7[3] * Static126.anInt2579 + Static67.anInt1311 * arg7[0] + 8192 >> 14;
					local401 = Static73.anInt1385 * arg7[7] + Static67.anInt1311 * arg7[1] + arg7[4] * Static126.anInt2579 + 8192 >> 14;
					local401 += local53;
					local383 += local249;
					local634 = arg7[8] * Static73.anInt1385 + Static67.anInt1311 * arg7[2] + arg7[5] * Static126.anInt2579 + 8192 >> 14;
					Static67.anInt1311 = local383;
					local634 += local59;
					Static126.anInt2579 = local401;
					Static650.aBoolean778 = false;
					Static73.anInt1385 = local634;
				}
				@Pc(971) int[] local971 = new int[9];
				local401 = Class3_Sub20.anIntArray204[arg2];
				local634 = Class3_Sub20.anIntArray206[arg2];
				local643 = Class3_Sub20.anIntArray204[arg3];
				local652 = Class3_Sub20.anIntArray206[arg3];
				local656 = Class3_Sub20.anIntArray204[arg4];
				local674 = Class3_Sub20.anIntArray206[arg4];
				local1003 = local656 * local634 + 8192 >> 14;
				local1011 = local674 * local634 + 8192 >> 14;
				local971[2] = local401 * local652 + 8192 >> 14;
				local971[6] = -local652 * local656 + local643 * local1011 + 8192 >> 14;
				local971[8] = local643 * local401 + 8192 >> 14;
				local971[7] = local643 * local1003 + local652 * local674 + 8192 >> 14;
				local971[4] = local401 * local656 + 8192 >> 14;
				local971[1] = -local643 * local674 + local652 * local1003 + 8192 >> 14;
				local971[5] = -local634;
				local971[0] = local1011 * local652 + local656 * local643 + 8192 >> 14;
				local971[3] = local401 * local674 + 8192 >> 14;
				@Pc(1141) int local1141 = -Static126.anInt2579 * local971[1] + -Static67.anInt1311 * local971[0] + local971[2] * -Static73.anInt1385 + 8192 >> 14;
				local1167 = local971[5] * -Static73.anInt1385 + -Static67.anInt1311 * local971[3] + -Static126.anInt2579 * local971[4] + 8192 >> 14;
				local1192 = -Static126.anInt2579 * local971[7] + local971[6] * -Static67.anInt1311 + local971[8] * -Static73.anInt1385 + 8192 >> 14;
				local1196 = Static67.anInt1311 + local1141;
				@Pc(1200) int local1200 = Static126.anInt2579 + local1167;
				local1204 = Static73.anInt1385 + local1192;
				@Pc(1207) int[] local1207 = new int[9];
				for (local1209 = 0; local1209 < 3; local1209++) {
					for (local1213 = 0; local1213 < 3; local1213++) {
						local1217 = 0;
						for (local1219 = 0; local1219 < 3; local1219++) {
							local1217 += arg7[local1219 + local1213 * 3] * local971[local1209 * 3 + local1219];
						}
						local1207[local1209 * 3 + local1213] = local1217 + 8192 >> 14;
					}
				}
				local1213 = local59 * local971[2] + local249 * local971[0] + local53 * local971[1] + 8192 >> 14;
				local1217 = local971[4] * local53 + local971[3] * local249 + local971[5] * local59 + 8192 >> 14;
				local1213 += local1196;
				local1219 = local971[8] * local59 + local971[7] * local53 + local249 * local971[6] + 8192 >> 14;
				local1217 += local1200;
				local1219 += local1204;
				local1348 = new int[9];
				for (local1350 = 0; local1350 < 3; local1350++) {
					for (local1354 = 0; local1354 < 3; local1354++) {
						local1358 = 0;
						for (local1360 = 0; local1360 < 3; local1360++) {
							local1358 += arg7[local1360 + local1350 * 3] * local1207[local1354 + local1360 * 3];
						}
						local1348[local1350 * 3 + local1354] = local1358 + 8192 >> 14;
					}
				}
				local1354 = arg7[2] * local1219 + arg7[1] * local1217 + arg7[0] * local1213 + 8192 >> 14;
				local1358 = arg7[5] * local1219 + local1217 * arg7[4] + local1213 * arg7[3] + 8192 >> 14;
				local1354 += local29;
				local1358 += local35;
				local1360 = local1213 * arg7[6] + local1217 * arg7[7] + arg7[8] * local1219 + 8192 >> 14;
				local1360 += local41;
				for (local1493 = 0; local1493 < local8; local1493++) {
					@Pc(1499) int local1499 = arg1[local1493];
					if (this.anIntArrayArray32.length > local1499) {
						@Pc(1509) int[] local1509 = this.anIntArrayArray32[local1499];
						for (@Pc(1511) int local1511 = 0; local1511 < local1509.length; local1511++) {
							@Pc(1517) int local1517 = local1509[local1511];
							if (this.aShortArray75 == null || (arg6 & this.aShortArray75[local1517]) != 0) {
								@Pc(1559) int local1559 = this.anIntArray463[local1517] * local1348[0] + this.anIntArray467[local1517] * local1348[1] + local1348[2] * this.anIntArray466[local1517] + 8192 >> 14;
								@Pc(1590) int local1590 = local1348[5] * this.anIntArray466[local1517] + local1348[4] * this.anIntArray467[local1517] + this.anIntArray463[local1517] * local1348[3] + 8192 >> 14;
								@Pc(1594) int local1594 = local1559 + local1354;
								@Pc(1598) int local1598 = local1590 + local1358;
								@Pc(1629) int local1629 = this.anIntArray466[local1517] * local1348[8] + local1348[7] * this.anIntArray467[local1517] + local1348[6] * this.anIntArray463[local1517] + 8192 >> 14;
								this.anIntArray463[local1517] = local1594;
								@Pc(1638) int local1638 = local1629 + local1360;
								this.anIntArray467[local1517] = local1598;
								this.anIntArray466[local1517] = local1638;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2570) Class177 local2570;
			@Pc(2453) boolean local2453;
			@Pc(2565) Class67 local2565;
			if (arg0 == 5) {
				if (this.anIntArrayArray31 != null) {
					local2453 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray31.length > local41) {
							local51 = this.anIntArrayArray31[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local59]) != 0) {
									local383 = arg2 * 8 + (this.aByteArray49[local59] & 0xFF);
									if (local383 < 0) {
										local383 = 0;
									} else if (local383 > 255) {
										local383 = 255;
									}
									this.aByteArray49[local59] = (byte) local383;
								}
							}
							local2453 |= local51.length > 0;
						}
					}
					if (local2453) {
						if (this.aClass67Array1 != null) {
							for (local41 = 0; local41 < this.anInt5180; local41++) {
								local2565 = this.aClass67Array1[local41];
								local2570 = this.aClass177Array1[local41];
								local2570.anInt4934 = 255 - (this.aByteArray49[local2565.anInt1719] & 0xFF) << 24 | local2570.anInt4934 & 0xFFFFFF;
							}
						}
						this.method4780();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray31 != null) {
					local2453 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local41 = arg1[local35];
						if (this.anIntArrayArray31.length > local41) {
							local51 = this.anIntArrayArray31[local41];
							for (local53 = 0; local53 < local51.length; local53++) {
								local59 = local51[local53];
								if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local59]) != 0) {
									local383 = this.lb[local59] & 0xFFFF;
									local401 = local383 >> 10 & 0x3F;
									local634 = local383 >> 7 & 0x7;
									@Pc(2674) int local2674 = arg2 + local401 & 0x3F;
									local634 += arg3 / 4;
									local643 = local383 & 0x7F;
									if (local634 < 0) {
										local634 = 0;
									} else if (local634 > 7) {
										local634 = 7;
									}
									local643 += arg4;
									if (local643 < 0) {
										local643 = 0;
									} else if (local643 > 127) {
										local643 = 127;
									}
									this.lb[local59] = (short) (local2674 << 10 | local634 << 7 | local643);
								}
							}
							local2453 |= local51.length > 0;
						}
					}
					if (local2453) {
						if (this.aClass67Array1 != null) {
							for (local41 = 0; local41 < this.anInt5180; local41++) {
								local2565 = this.aClass67Array1[local41];
								local2570 = this.aClass177Array1[local41];
								local2570.anInt4934 = local2570.anInt4934 & 0xFF000000 | Static363.anIntArray518[this.lb[local2565.anInt1719] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method4780();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray33 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray33.length) {
							local247 = this.anIntArrayArray33[local35];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2570 = this.aClass177Array1[local247[local249]];
								local2570.anInt4929 += arg2;
								local2570.anInt4930 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray33 != null) {
					for (local29 = 0; local29 < local8; local29++) {
						local35 = arg1[local29];
						if (local35 < this.anIntArrayArray33.length) {
							local247 = this.anIntArrayArray33[local35];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2570 = this.aClass177Array1[local247[local249]];
								local2570.anInt4933 = arg2 * local2570.anInt4933 >> 7;
								local2570.anInt4928 = arg3 * local2570.anInt4928 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray33 != null) {
				for (local29 = 0; local29 < local8; local29++) {
					local35 = arg1[local29];
					if (this.anIntArrayArray33.length > local35) {
						local247 = this.anIntArrayArray33[local35];
						for (local249 = 0; local249 < local247.length; local249++) {
							local2570 = this.aClass177Array1[local247[local249]];
							local2570.anInt4931 = arg2 + local2570.anInt4931 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local29 = 0; local29 < local8; local29++) {
				local35 = arg1[local29];
				if (local35 < this.anIntArrayArray32.length) {
					local247 = this.anIntArrayArray32[local35];
					for (local249 = 0; local249 < local247.length; local249++) {
						local53 = local247[local249];
						if (this.aShortArray75 == null || (this.aShortArray75[local53] & arg6) != 0) {
							this.anIntArray463[local53] -= Static67.anInt1311;
							this.anIntArray467[local53] -= Static126.anInt2579;
							this.anIntArray466[local53] -= Static73.anInt1385;
							this.anIntArray463[local53] = this.anIntArray463[local53] * arg2 >> 7;
							this.anIntArray467[local53] = arg3 * this.anIntArray467[local53] >> 7;
							this.anIntArray466[local53] = arg4 * this.anIntArray466[local53] >> 7;
							this.anIntArray463[local53] += Static67.anInt1311;
							this.anIntArray467[local53] += Static126.anInt2579;
							this.anIntArray466[local53] += Static73.anInt1385;
						}
					}
				}
			}
		} else {
			local29 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local41 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local53 = arg7[13] << 4;
			local59 = arg7[14] << 4;
			if (Static650.aBoolean778) {
				local383 = arg7[3] * Static126.anInt2579 + Static67.anInt1311 * arg7[0] + Static73.anInt1385 * arg7[6] + 8192 >> 14;
				local401 = Static126.anInt2579 * arg7[4] + Static67.anInt1311 * arg7[1] + arg7[7] * Static73.anInt1385 + 8192 >> 14;
				local383 += local249;
				local634 = arg7[2] * Static67.anInt1311 + arg7[5] * Static126.anInt2579 + arg7[8] * Static73.anInt1385 + 8192 >> 14;
				local401 += local53;
				Static126.anInt2579 = local401;
				local634 += local59;
				Static67.anInt1311 = local383;
				Static73.anInt1385 = local634;
				Static650.aBoolean778 = false;
			}
			local383 = arg2 << 15 >> 7;
			local401 = arg3 << 15 >> 7;
			local634 = arg4 << 15 >> 7;
			local643 = local383 * -Static67.anInt1311 + 8192 >> 14;
			local652 = -Static126.anInt2579 * local401 + 8192 >> 14;
			local656 = local634 * -Static73.anInt1385 + 8192 >> 14;
			local674 = local643 + Static67.anInt1311;
			local1003 = Static126.anInt2579 + local652;
			local1011 = Static73.anInt1385 + local656;
			@Pc(1980) int[] local1980 = new int[] { local383 * arg7[0] + 8192 >> 14, arg7[3] * local383 + 8192 >> 14, arg7[6] * local383 + 8192 >> 14, arg7[1] * local401 + 8192 >> 14, arg7[4] * local401 + 8192 >> 14, arg7[7] * local401 + 8192 >> 14, arg7[2] * local634 + 8192 >> 14, local634 * arg7[5] + 8192 >> 14, arg7[8] * local634 + 8192 >> 14 };
			local1167 = local383 * local249 + 8192 >> 14;
			local1192 = local53 * local401 + 8192 >> 14;
			@Pc(2108) int local2108 = local1192 + local1003;
			local1196 = local59 * local634 + 8192 >> 14;
			@Pc(2120) int local2120 = local1167 + local674;
			@Pc(2124) int local2124 = local1196 + local1011;
			@Pc(2127) int[] local2127 = new int[9];
			@Pc(2133) int local2133;
			for (local1204 = 0; local1204 < 3; local1204++) {
				for (local2133 = 0; local2133 < 3; local2133++) {
					local1209 = 0;
					for (local1213 = 0; local1213 < 3; local1213++) {
						local1209 += local1980[local1213 * 3 + local2133] * arg7[local1204 * 3 + local1213];
					}
					local2127[local2133 + local1204 * 3] = local1209 + 8192 >> 14;
				}
			}
			local2133 = local2120 * arg7[0] + local2108 * arg7[1] + local2124 * arg7[2] + 8192 >> 14;
			local1209 = arg7[3] * local2120 + local2108 * arg7[4] + local2124 * arg7[5] + 8192 >> 14;
			local2133 += local29;
			local1209 += local35;
			local1213 = local2124 * arg7[8] + local2120 * arg7[6] + arg7[7] * local2108 + 8192 >> 14;
			local1213 += local41;
			for (local1217 = 0; local1217 < local8; local1217++) {
				local1219 = arg1[local1217];
				if (local1219 < this.anIntArrayArray32.length) {
					local1348 = this.anIntArrayArray32[local1219];
					for (local1350 = 0; local1350 < local1348.length; local1350++) {
						local1354 = local1348[local1350];
						if (this.aShortArray75 == null || (this.aShortArray75[local1354] & arg6) != 0) {
							local1358 = local2127[2] * this.anIntArray466[local1354] + local2127[0] * this.anIntArray463[local1354] + this.anIntArray467[local1354] * local2127[1] + 8192 >> 14;
							local1360 = this.anIntArray466[local1354] * local2127[5] + local2127[4] * this.anIntArray467[local1354] + this.anIntArray463[local1354] * local2127[3] + 8192 >> 14;
							local1493 = this.anIntArray466[local1354] * local2127[8] + this.anIntArray467[local1354] * local2127[7] + local2127[6] * this.anIntArray463[local1354] + 8192 >> 14;
							@Pc(2402) int local2402 = local1358 + local2133;
							@Pc(2406) int local2406 = local1360 + local1209;
							this.anIntArray463[local1354] = local2402;
							@Pc(2415) int local2415 = local1493 + local1213;
							this.anIntArray467[local1354] = local2406;
							this.anIntArray466[local1354] = local2415;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(JFLclient!gfa;IIIFIIZI)S")
	private short method4775(@OriginalArg(0) long arg0, @OriginalArg(1) float arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(16) int local16 = this.anIntArray468[arg3];
		@Pc(23) int local23 = this.anIntArray468[arg3 + 1];
		@Pc(25) int local25 = 0;
		for (@Pc(27) int local27 = local16; local27 < local23; local27++) {
			@Pc(34) short local34 = this.aShortArray74[local27];
			if (local34 == 0) {
				local25 = local27;
				break;
			}
			if (Static155.aLongArray4[local27] == arg0) {
				return (short) (local34 - 1);
			}
		}
		this.aShortArray74[local25] = (short) (this.anInt5218 + 1);
		Static155.aLongArray4[local25] = arg0;
		this.aShortArray71[this.anInt5218] = (short) arg8;
		this.aShortArray70[this.anInt5218] = (short) arg3;
		this.aShortArray73[this.anInt5218] = (short) arg9;
		this.aShortArray76[this.anInt5218] = (short) arg5;
		this.aShortArray79[this.anInt5218] = (short) arg4;
		this.aByteArray48[this.anInt5218] = (byte) arg7;
		this.aFloatArray28[this.anInt5218] = arg1;
		this.aFloatArray29[this.anInt5218] = arg6;
		return (short) this.anInt5218++;
	}

	@OriginalMember(owner = "client!kj", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5238; local7++) {
			if (arg0 != 0) {
				this.anIntArray463[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray467[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray466[local7] += arg2;
			}
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V")
	private void method4776() {
		if ((this.anInt5239 & 0x37) == 0) {
			if (this.aClass258_1 == null) {
				return;
			}
			this.aClass258_1.aBoolean493 = false;
		} else if (this.aClass258_2 != null) {
			this.aClass258_2.aBoolean493 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!kj", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static126.anInt2579 = 0;
			Static67.anInt1311 = 0;
			local16 = 0;
			Static73.anInt1385 = 0;
			for (local20 = 0; local20 < this.anInt5238; local20++) {
				Static67.anInt1311 += this.anIntArray463[local20];
				Static126.anInt2579 += this.anIntArray467[local20];
				Static73.anInt1385 += this.anIntArray466[local20];
				local16++;
			}
			if (local16 > 0) {
				Static126.anInt2579 = arg2 + Static126.anInt2579 / local16;
				Static67.anInt1311 = arg1 + Static67.anInt1311 / local16;
				Static73.anInt1385 = arg3 + Static73.anInt1385 / local16;
			} else {
				Static126.anInt2579 = arg2;
				Static67.anInt1311 = arg1;
				Static73.anInt1385 = arg3;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt5238; local16++) {
				this.anIntArray463[local16] += arg1;
				this.anIntArray467[local16] += arg2;
				this.anIntArray466[local16] += arg3;
			}
		} else {
			@Pc(161) int local161;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt5238; local16++) {
					this.anIntArray463[local16] -= Static67.anInt1311;
					this.anIntArray467[local16] -= Static126.anInt2579;
					this.anIntArray466[local16] -= Static73.anInt1385;
					if (arg3 != 0) {
						local20 = Class3_Sub20.anIntArray206[arg3];
						local161 = Class3_Sub20.anIntArray204[arg3];
						local180 = local20 * this.anIntArray467[local16] + this.anIntArray463[local16] * local161 + 16383 >> 14;
						this.anIntArray467[local16] = this.anIntArray467[local16] * local161 + 16383 - this.anIntArray463[local16] * local20 >> 14;
						this.anIntArray463[local16] = local180;
					}
					if (arg1 != 0) {
						local20 = Class3_Sub20.anIntArray206[arg1];
						local161 = Class3_Sub20.anIntArray204[arg1];
						local180 = local161 * this.anIntArray467[local16] + 16383 - this.anIntArray466[local16] * local20 >> 14;
						this.anIntArray466[local16] = this.anIntArray467[local16] * local20 + this.anIntArray466[local16] * local161 + 16383 >> 14;
						this.anIntArray467[local16] = local180;
					}
					if (arg2 != 0) {
						local20 = Class3_Sub20.anIntArray206[arg2];
						local161 = Class3_Sub20.anIntArray204[arg2];
						local180 = local20 * this.anIntArray466[local16] + this.anIntArray463[local16] * local161 + 16383 >> 14;
						this.anIntArray466[local16] = local161 * this.anIntArray466[local16] + 16383 - local20 * this.anIntArray463[local16] >> 14;
						this.anIntArray463[local16] = local180;
					}
					this.anIntArray463[local16] += Static67.anInt1311;
					this.anIntArray467[local16] += Static126.anInt2579;
					this.anIntArray466[local16] += Static73.anInt1385;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt5238; local16++) {
					this.anIntArray463[local16] -= Static67.anInt1311;
					this.anIntArray467[local16] -= Static126.anInt2579;
					this.anIntArray466[local16] -= Static73.anInt1385;
					this.anIntArray463[local16] = this.anIntArray463[local16] * arg1 / 128;
					this.anIntArray467[local16] = this.anIntArray467[local16] * arg2 / 128;
					this.anIntArray466[local16] = arg3 * this.anIntArray466[local16] / 128;
					this.anIntArray463[local16] += Static67.anInt1311;
					this.anIntArray467[local16] += Static126.anInt2579;
					this.anIntArray466[local16] += Static73.anInt1385;
				}
			} else {
				@Pc(509) Class67 local509;
				@Pc(514) Class177 local514;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt5182; local16++) {
						local20 = (this.aByteArray49[local16] & 0xFF) + arg1 * 8;
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray49[local16] = (byte) local20;
					}
					if (this.aClass67Array1 != null) {
						for (local20 = 0; local20 < this.anInt5180; local20++) {
							local509 = this.aClass67Array1[local20];
							local514 = this.aClass177Array1[local20];
							local514.anInt4934 = 255 - (this.aByteArray49[local509.anInt1719] & 0xFF) << 24 | local514.anInt4934 & 0xFFFFFF;
						}
					}
					this.method4780();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt5182; local16++) {
						local20 = this.lb[local16] & 0xFFFF;
						local161 = local20 >> 10 & 0x3F;
						local180 = local20 >> 7 & 0x7;
						@Pc(576) int local576 = local161 + arg1 & 0x3F;
						@Pc(580) int local580 = local20 & 0x7F;
						local180 += arg2 / 4;
						local580 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local580 < 0) {
							local580 = 0;
						} else if (local580 > 127) {
							local580 = 127;
						}
						this.lb[local16] = (short) (local580 | local576 << 10 | local180 << 7);
					}
					if (this.aClass67Array1 != null) {
						for (local20 = 0; local20 < this.anInt5180; local20++) {
							local509 = this.aClass67Array1[local20];
							local514 = this.aClass177Array1[local20];
							local514.anInt4934 = Static363.anIntArray518[this.lb[local509.anInt1719] & 0xFFFF] & 0xFFFFFF | local514.anInt4934 & 0xFF000000;
						}
					}
					this.method4780();
				} else {
					@Pc(698) Class177 local698;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt5180; local16++) {
							local698 = this.aClass177Array1[local16];
							local698.anInt4929 += arg1;
							local698.anInt4930 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt5180; local16++) {
							local698 = this.aClass177Array1[local16];
							local698.anInt4933 = arg1 * local698.anInt4933 >> 7;
							local698.anInt4928 = local698.anInt4928 * arg2 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt5180; local16++) {
							local698 = this.aClass177Array1[local16];
							local698.anInt4931 = local698.anInt4931 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5238; local15++) {
			@Pc(34) int local34 = this.anIntArray467[local15] * local13 - local9 * this.anIntArray466[local15] >> 14;
			this.anIntArray466[local15] = local9 * this.anIntArray467[local15] + this.anIntArray466[local15] * local13 >> 14;
			this.anIntArray467[local15] = local34;
		}
		this.method4773();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZIIIILclient!uu;I)Z")
	private boolean method4777(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class239 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class239_Sub3 local8 = (Class239_Sub3) arg4;
		@Pc(12) Class239_Sub3 local12 = this.aClass13_Sub1_13.aClass239_Sub3_16;
		@Pc(33) float local33 = local12.aFloat218 + local12.aFloat216 * local8.aFloat217 + local12.aFloat219 * local8.aFloat218 + local12.aFloat225 * local8.aFloat220;
		@Pc(54) float local54 = local12.aFloat223 * local8.aFloat218 + local12.aFloat214 * local8.aFloat217 + local12.aFloat215 * local8.aFloat220 + local12.aFloat217;
		Static318.aFloat111 = local12.aFloat216 * local8.aFloat214 + local8.aFloat216 * local12.aFloat219 + local8.aFloat224 * local12.aFloat225;
		Static257.aFloat100 = local8.aFloat222 * local12.aFloat225 + local8.aFloat223 * local12.aFloat216 + local8.aFloat219 * local12.aFloat219;
		Static231.aFloat95 = local8.aFloat214 * local12.aFloat214 + local8.aFloat216 * local12.aFloat223 + local8.aFloat224 * local12.aFloat215;
		Static173.aFloat86 = local8.aFloat224 * local12.aFloat221 + local8.aFloat214 * local12.aFloat224 + local8.aFloat216 * local12.aFloat222;
		@Pc(147) float local147 = local12.aFloat220 + local8.aFloat220 * local12.aFloat221 + local8.aFloat218 * local12.aFloat222 + local8.aFloat217 * local12.aFloat224;
		Static128.aFloat73 = local12.aFloat224 * local8.aFloat223 + local12.aFloat222 * local8.aFloat219 + local8.aFloat222 * local12.aFloat221;
		Static541.aFloat194 = local8.aFloat225 * local12.aFloat222 + local12.aFloat224 * local8.aFloat215 + local8.aFloat221 * local12.aFloat221;
		Static462.aFloat157 = local8.aFloat215 * local12.aFloat216 + local8.aFloat225 * local12.aFloat219 + local12.aFloat225 * local8.aFloat221;
		Static607.aFloat205 = local12.aFloat215 * local8.aFloat222 + local8.aFloat223 * local12.aFloat214 + local12.aFloat223 * local8.aFloat219;
		Static41.aFloat35 = local12.aFloat223 * local8.aFloat225 + local12.aFloat214 * local8.aFloat215 + local12.aFloat215 * local8.aFloat221;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass13_Sub1_13.anInt8609;
		@Pc(255) int local255 = this.aClass13_Sub1_13.anInt8632;
		if (!this.aBoolean381) {
			this.method4782();
		}
		@Pc(272) int local272 = this.anInt5176 - this.anInt5214 >> 1;
		@Pc(281) int local281 = this.anInt5197 - this.anInt5240 >> 1;
		@Pc(290) int local290 = this.anInt5212 - this.anInt5177 >> 1;
		@Pc(296) int local296 = this.anInt5214 + local272;
		@Pc(301) int local301 = this.anInt5240 + local281;
		@Pc(307) int local307 = this.anInt5177 + local290;
		@Pc(313) int local313 = local296 - (local272 << arg1);
		@Pc(320) int local320 = local301 - (local281 << arg1);
		@Pc(326) int local326 = local307 - (local290 << arg1);
		@Pc(346) int local346 = local296 + (local272 << arg1);
		@Pc(352) int local352 = (local281 << arg1) + local301;
		@Pc(358) int local358 = (local290 << arg1) + local307;
		Static93.anIntArray962[0] = local313;
		Static632.anIntArray876[0] = local320;
		Static93.anIntArray962[1] = local346;
		Static318.anIntArray477[0] = local326;
		Static632.anIntArray876[1] = local320;
		Static318.anIntArray477[1] = local326;
		Static93.anIntArray962[2] = local313;
		Static632.anIntArray876[2] = local352;
		Static93.anIntArray962[3] = local346;
		Static318.anIntArray477[2] = local326;
		Static632.anIntArray876[3] = local352;
		Static93.anIntArray962[4] = local313;
		Static318.anIntArray477[3] = local326;
		Static632.anIntArray876[4] = local320;
		Static318.anIntArray477[4] = local358;
		Static93.anIntArray962[5] = local346;
		Static632.anIntArray876[5] = local320;
		Static318.anIntArray477[5] = local358;
		Static93.anIntArray962[6] = local313;
		Static632.anIntArray876[6] = local352;
		Static93.anIntArray962[7] = local346;
		Static318.anIntArray477[6] = local358;
		Static632.anIntArray876[7] = local352;
		Static318.anIntArray477[7] = local358;
		@Pc(501) float local501;
		@Pc(487) float local487;
		@Pc(515) float local515;
		@Pc(468) float local468;
		@Pc(473) float local473;
		@Pc(463) float local463;
		for (@Pc(456) int local456 = 0; local456 < 8; local456++) {
			local463 = (float) Static318.anIntArray477[local456];
			local468 = (float) Static93.anIntArray962[local456];
			local473 = (float) Static632.anIntArray876[local456];
			local487 = local54 + Static231.aFloat95 * local473 + local468 * Static607.aFloat205 + Static41.aFloat35 * local463;
			local501 = local33 + Static462.aFloat157 * local463 + local468 * Static257.aFloat100 + local473 * Static318.aFloat111;
			local515 = local147 + Static128.aFloat73 * local468 + Static173.aFloat86 * local473 + Static541.aFloat194 * local463;
			if ((float) this.aClass13_Sub1_13.anInt8608 <= local515) {
				if (arg3 > 0) {
					local515 = (float) arg3;
				}
				@Pc(542) float local542 = (float) local251 * local501 / local515 + (float) this.aClass13_Sub1_13.anInt8606;
				@Pc(554) float local554 = (float) this.aClass13_Sub1_13.anInt8611 + local487 * (float) local255 / local515;
				if (local243 < local542) {
					local243 = local542;
				}
				if (local241 > local542) {
					local241 = local542;
				}
				local239 = true;
				if (local245 > local554) {
					local245 = local554;
				}
				if (local554 > local247) {
					local247 = local554;
				}
			}
		}
		if (local239 && local241 < (float) arg2 && local243 > (float) arg2 && (float) arg5 > local245 && local247 > (float) arg5) {
			if (arg0) {
				return true;
			}
			if (this.anInt5218 > Static625.anIntArray867.length) {
				Static625.anIntArray867 = new int[this.anInt5218];
				Static623.anIntArray861 = new int[this.anInt5218];
			}
			@Pc(699) int local699;
			for (@Pc(625) int local625 = 0; local625 < this.anInt5238; local625++) {
				local463 = (float) this.anIntArray466[local625];
				local473 = (float) this.anIntArray467[local625];
				local468 = (float) this.anIntArray463[local625];
				local515 = Static173.aFloat86 * local473 + Static128.aFloat73 * local468 + Static541.aFloat194 * local463 + local147;
				local487 = local54 + local463 * Static41.aFloat35 + Static607.aFloat205 * local468 + Static231.aFloat95 * local473;
				local501 = local468 * Static257.aFloat100 + Static318.aFloat111 * local473 + local463 * Static462.aFloat157 + local33;
				@Pc(706) int local706;
				@Pc(708) int local708;
				@Pc(717) int local717;
				if ((float) this.aClass13_Sub1_13.anInt8608 <= local515) {
					if (arg3 > 0) {
						local515 = (float) arg3;
					}
					local699 = (int) ((float) this.aClass13_Sub1_13.anInt8606 + local501 * (float) local251 / local515);
					local706 = (int) (local487 * (float) local255 / local515 + (float) this.aClass13_Sub1_13.anInt8611);
					local708 = this.anIntArray468[local625];
					local717 = this.anIntArray468[local625 + 1];
					for (@Pc(781) int local781 = local708; local781 < local717; local781++) {
						@Pc(790) int local790 = this.aShortArray74[local781] - 1;
						if (local790 == -1) {
							break;
						}
						Static625.anIntArray867[local790] = local699;
						Static623.anIntArray861[local790] = local706;
					}
				} else {
					local699 = this.anIntArray468[local625];
					local706 = this.anIntArray468[local625 + 1];
					for (local708 = local699; local708 < local706; local708++) {
						local717 = this.aShortArray74[local708] - 1;
						if (local717 == -1) {
							break;
						}
						Static625.anIntArray867[this.aShortArray74[local708] - 1] = -999999;
					}
				}
			}
			for (local699 = 0; local699 < this.anInt5182; local699++) {
				if (Static625.anIntArray867[this.aShortArray72[local699]] != -999999 && Static625.anIntArray867[this.aShortArray69[local699]] != -999999 && Static625.anIntArray867[this.aShortArray78[local699]] != -999999 && this.method4770(Static623.anIntArray861[this.aShortArray69[local699]], Static625.anIntArray867[this.aShortArray72[local699]], arg2, arg5, Static623.anIntArray861[this.aShortArray78[local699]], Static625.anIntArray867[this.aShortArray78[local699]], Static625.anIntArray867[this.aShortArray69[local699]], Static623.anIntArray861[this.aShortArray72[local699]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kj", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5240;
	}

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean379;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method5673(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class95_Sub2 local8 = (Class95_Sub2) arg0;
		if (this.anInt5182 == 0 || local8.anInt5182 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5238;
		@Pc(27) int[] local27 = local8.anIntArray463;
		@Pc(30) int[] local30 = local8.anIntArray467;
		@Pc(33) int[] local33 = local8.anIntArray466;
		@Pc(36) short[] local36 = local8.aShortArray73;
		@Pc(39) short[] local39 = local8.aShortArray76;
		@Pc(42) short[] local42 = local8.aShortArray79;
		@Pc(45) byte[] local45 = local8.aByteArray48;
		@Pc(64) short[] local64;
		@Pc(60) short[] local60;
		@Pc(52) short[] local52;
		@Pc(56) byte[] local56;
		if (this.aClass294_1 == null) {
			local56 = null;
			local60 = null;
			local64 = null;
			local52 = null;
		} else {
			local52 = this.aClass294_1.aShortArray119;
			local56 = this.aClass294_1.aByteArray88;
			local60 = this.aClass294_1.aShortArray118;
			local64 = this.aClass294_1.aShortArray117;
		}
		@Pc(85) short[] local85;
		@Pc(83) short[] local83;
		@Pc(79) short[] local79;
		@Pc(81) byte[] local81;
		if (local8.aClass294_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass294_1.aShortArray119;
			local81 = local8.aClass294_1.aByteArray88;
			local85 = local8.aClass294_1.aShortArray117;
			local83 = local8.aClass294_1.aShortArray118;
		}
		@Pc(106) int[] local106 = local8.anIntArray468;
		@Pc(109) short[] local109 = local8.aShortArray74;
		if (!local8.aBoolean381) {
			local8.method4782();
		}
		@Pc(118) int local118 = local8.anInt5240;
		@Pc(121) int local121 = local8.anInt5197;
		@Pc(124) int local124 = local8.anInt5214;
		@Pc(127) int local127 = local8.anInt5176;
		@Pc(130) int local130 = local8.anInt5177;
		@Pc(133) int local133 = local8.anInt5212;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5238; local135++) {
			@Pc(145) int local145 = this.anIntArray467[local135] - arg2;
			if (local145 >= local118 && local121 >= local145) {
				@Pc(165) int local165 = this.anIntArray463[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(181) int local181 = this.anIntArray466[local135] - arg3;
					if (local130 <= local181 && local181 <= local133) {
						@Pc(195) int local195 = -1;
						@Pc(200) int local200 = this.anIntArray468[local135];
						@Pc(207) int local207 = this.anIntArray468[local135 + 1];
						for (@Pc(209) int local209 = local200; local209 < local207; local209++) {
							local195 = this.aShortArray74[local209] - 1;
							if (local195 == -1 || this.aByteArray48[local195] != 0) {
								break;
							}
						}
						if (local195 != -1) {
							for (@Pc(238) int local238 = 0; local238 < local24; local238++) {
								if (local165 == local27[local238] && local33[local238] == local181 && local145 == local30[local238]) {
									local200 = local106[local238];
									local207 = local106[local238 + 1];
									@Pc(275) int local275 = -1;
									for (@Pc(277) int local277 = local200; local277 < local207; local277++) {
										local275 = local109[local277] - 1;
										if (local275 == -1 || local45[local275] != 0) {
											break;
										}
									}
									if (local275 != -1) {
										if (local64 == null) {
											this.aClass294_1 = new Class294();
											local64 = this.aClass294_1.aShortArray117 = Static70.method5708(this.aShortArray73);
											local60 = this.aClass294_1.aShortArray118 = Static70.method5708(this.aShortArray76);
											local52 = this.aClass294_1.aShortArray119 = Static70.method5708(this.aShortArray79);
											local56 = this.aClass294_1.aByteArray88 = Static59.method1280(this.aByteArray48);
										}
										if (local85 == null) {
											@Pc(354) Class294 local354 = local8.aClass294_1 = new Class294();
											local85 = local354.aShortArray117 = Static70.method5708(local36);
											local83 = local354.aShortArray118 = Static70.method5708(local39);
											local79 = local354.aShortArray119 = Static70.method5708(local42);
											local81 = local354.aByteArray88 = Static59.method1280(local45);
										}
										@Pc(387) short local387 = this.aShortArray73[local195];
										@Pc(392) short local392 = this.aShortArray76[local195];
										@Pc(397) short local397 = this.aShortArray79[local195];
										local207 = local106[local238 + 1];
										local200 = local106[local238];
										@Pc(412) byte local412 = this.aByteArray48[local195];
										@Pc(422) int local422;
										for (@Pc(414) int local414 = local200; local414 < local207; local414++) {
											local422 = local109[local414] - 1;
											if (local422 == -1) {
												break;
											}
											if (local81[local422] != 0) {
												local85[local422] += local387;
												local83[local422] += local392;
												local79[local422] += local397;
												local81[local422] += local412;
											}
										}
										local397 = local42[local275];
										local392 = local39[local275];
										local207 = this.anIntArray468[local135 + 1];
										local200 = this.anIntArray468[local135];
										local412 = local45[local275];
										local387 = local36[local275];
										for (local422 = local200; local422 < local207; local422++) {
											@Pc(505) int local505 = this.aShortArray74[local422] - 1;
											if (local505 == -1) {
												break;
											}
											if (local56[local505] != 0) {
												local64[local505] += local387;
												local60[local505] += local392;
												local52[local505] += local397;
												local56[local505] += local412;
											}
										}
										local8.method4776();
										this.method4776();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5197;
	}

	@OriginalMember(owner = "client!kj", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5176;
	}

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort54 = (short) arg0;
		this.method4780();
	}

	@OriginalMember(owner = "client!kj", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5182; local3++) {
			if (arg0 == this.lb[local3]) {
				this.lb[local3] = arg1;
			}
		}
		if (this.aClass67Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt5180; local38++) {
				@Pc(45) Class67 local45 = this.aClass67Array1[local38];
				@Pc(50) Class177 local50 = this.aClass177Array1[local38];
				local50.anInt4934 = Static363.anIntArray518[this.lb[local45.anInt1719] & 0xFFFF] & 0xFFFFFF | local50.anInt4934 & 0xFF000000;
			}
		}
		this.method4780();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!uu;Lclient!taa;I)V")
	@Override
	public void method5653(@OriginalArg(0) Class239 arg0, @OriginalArg(1) Class28_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5218 == 0) {
			return;
		}
		@Pc(16) Class239_Sub3 local16 = this.aClass13_Sub1_13.aClass239_Sub3_16;
		@Pc(19) Class239_Sub3 local19 = (Class239_Sub3) arg0;
		if (!this.aBoolean381) {
			this.method4782();
		}
		Static305.aFloat106 = local19.aFloat220 * local16.aFloat221 + local16.aFloat222 * local19.aFloat218 + local19.aFloat217 * local16.aFloat224 + local16.aFloat220;
		Static173.aFloat86 = local19.aFloat214 * local16.aFloat224 + local19.aFloat216 * local16.aFloat222 + local19.aFloat224 * local16.aFloat221;
		@Pc(72) float local72 = (float) this.anInt5240 * Static173.aFloat86 + Static305.aFloat106;
		@Pc(80) float local80 = Static173.aFloat86 * (float) this.anInt5197 + Static305.aFloat106;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt5163;
			local96 = local72 + (float) this.anInt5163;
		} else {
			local90 = local72 - (float) this.anInt5163;
			local96 = (float) this.anInt5163 + local80;
		}
		if (local90 >= this.aClass13_Sub1_13.aFloat182 || local96 <= (float) this.aClass13_Sub1_13.anInt8608) {
			return;
		}
		Static340.aFloat117 = local16.aFloat218 + local16.aFloat225 * local19.aFloat220 + local16.aFloat219 * local19.aFloat218 + local16.aFloat216 * local19.aFloat217;
		Static318.aFloat111 = local19.aFloat216 * local16.aFloat219 + local16.aFloat216 * local19.aFloat214 + local16.aFloat225 * local19.aFloat224;
		@Pc(172) float local172 = Static340.aFloat117 + (float) this.anInt5240 * Static318.aFloat111;
		@Pc(180) float local180 = Static318.aFloat111 * (float) this.anInt5197 + Static340.aFloat117;
		@Pc(206) float local206;
		@Pc(195) float local195;
		if (local172 > local180) {
			local195 = (local172 + (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8609;
			local206 = (local180 - (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8609;
		} else {
			local206 = (float) this.aClass13_Sub1_13.anInt8609 * (local172 - (float) this.anInt5163);
			local195 = ((float) this.anInt5163 + local180) * (float) this.aClass13_Sub1_13.anInt8609;
		}
		if (this.aClass13_Sub1_13.aFloat177 <= local206 / local96 || this.aClass13_Sub1_13.aFloat173 >= local195 / local96) {
			return;
		}
		Static284.aFloat105 = local16.aFloat214 * local19.aFloat217 + local16.aFloat223 * local19.aFloat218 + local19.aFloat220 * local16.aFloat215 + local16.aFloat217;
		Static231.aFloat95 = local16.aFloat215 * local19.aFloat224 + local16.aFloat223 * local19.aFloat216 + local19.aFloat214 * local16.aFloat214;
		@Pc(295) float local295 = (float) this.anInt5240 * Static231.aFloat95 + Static284.aFloat105;
		@Pc(303) float local303 = Static284.aFloat105 + (float) this.anInt5197 * Static231.aFloat95;
		@Pc(330) float local330;
		@Pc(318) float local318;
		if (local303 < local295) {
			local318 = (float) this.aClass13_Sub1_13.anInt8632 * ((float) this.anInt5163 + local295);
			local330 = (float) this.aClass13_Sub1_13.anInt8632 * ((float) -this.anInt5163 + local303);
		} else {
			local330 = (local295 - (float) this.anInt5163) * (float) this.aClass13_Sub1_13.anInt8632;
			local318 = ((float) this.anInt5163 + local303) * (float) this.aClass13_Sub1_13.anInt8632;
		}
		if (local330 / local96 >= this.aClass13_Sub1_13.aFloat185 || local318 / local96 <= this.aClass13_Sub1_13.aFloat184) {
			return;
		}
		if (arg1 != null || this.aClass67Array1 != null) {
			Static541.aFloat194 = local19.aFloat221 * local16.aFloat221 + local19.aFloat225 * local16.aFloat222 + local16.aFloat224 * local19.aFloat215;
			Static607.aFloat205 = local19.aFloat222 * local16.aFloat215 + local16.aFloat223 * local19.aFloat219 + local19.aFloat223 * local16.aFloat214;
			Static462.aFloat157 = local16.aFloat225 * local19.aFloat221 + local16.aFloat219 * local19.aFloat225 + local16.aFloat216 * local19.aFloat215;
			Static41.aFloat35 = local19.aFloat221 * local16.aFloat215 + local16.aFloat214 * local19.aFloat215 + local19.aFloat225 * local16.aFloat223;
			Static128.aFloat73 = local16.aFloat221 * local19.aFloat222 + local19.aFloat223 * local16.aFloat224 + local19.aFloat219 * local16.aFloat222;
			Static257.aFloat100 = local16.aFloat219 * local19.aFloat219 + local16.aFloat216 * local19.aFloat223 + local19.aFloat222 * local16.aFloat225;
		}
		if (arg1 != null) {
			@Pc(489) boolean local489 = false;
			@Pc(491) boolean local491 = true;
			@Pc(499) int local499 = this.anInt5176 + this.anInt5214 >> 1;
			@Pc(507) int local507 = this.anInt5212 + this.anInt5177 >> 1;
			@Pc(526) int local526 = (int) (Static257.aFloat100 * (float) local499 + Static340.aFloat117 + (float) this.anInt5240 * Static318.aFloat111 + Static462.aFloat157 * (float) local507);
			@Pc(545) int local545 = (int) (Static284.aFloat105 + (float) local499 * Static607.aFloat205 + Static231.aFloat95 * (float) this.anInt5240 + (float) local507 * Static41.aFloat35);
			@Pc(564) int local564 = (int) ((float) local499 * Static128.aFloat73 + Static305.aFloat106 + Static173.aFloat86 * (float) this.anInt5240 + Static541.aFloat194 * (float) local507);
			if (this.aClass13_Sub1_13.anInt8608 > local564) {
				local489 = true;
			} else {
				arg1.anInt9152 = this.aClass13_Sub1_13.anInt8611 + local545 * this.aClass13_Sub1_13.anInt8632 / local564;
				arg1.anInt9151 = this.aClass13_Sub1_13.anInt8606 + local526 * this.aClass13_Sub1_13.anInt8609 / local564;
			}
			@Pc(623) int local623 = (int) (Static462.aFloat157 * (float) local507 + (float) local499 * Static257.aFloat100 + Static340.aFloat117 + (float) this.anInt5197 * Static318.aFloat111);
			@Pc(642) int local642 = (int) (Static41.aFloat35 * (float) local507 + Static284.aFloat105 + Static607.aFloat205 * (float) local499 + (float) this.anInt5197 * Static231.aFloat95);
			@Pc(661) int local661 = (int) (Static541.aFloat194 * (float) local507 + (float) this.anInt5197 * Static173.aFloat86 + Static128.aFloat73 * (float) local499 + Static305.aFloat106);
			if (this.aClass13_Sub1_13.anInt8608 <= local661) {
				arg1.anInt9150 = this.aClass13_Sub1_13.anInt8611 + local642 * this.aClass13_Sub1_13.anInt8632 / local661;
				arg1.anInt9153 = this.aClass13_Sub1_13.anInt8606 + local623 * this.aClass13_Sub1_13.anInt8609 / local661;
			} else {
				local489 = true;
			}
			if (local489) {
				if (local564 < this.aClass13_Sub1_13.anInt8608 && local661 < this.aClass13_Sub1_13.anInt8608) {
					local491 = false;
				} else {
					@Pc(741) int local741;
					@Pc(752) int local752;
					@Pc(763) int local763;
					if (this.aClass13_Sub1_13.anInt8608 > local564) {
						local741 = (local661 - this.aClass13_Sub1_13.anInt8608 << 16) / (local661 - local564);
						local752 = local623 + (local741 * (local623 - local526) >> 16);
						local763 = (local741 * (local642 - local545) >> 16) + local642;
						arg1.anInt9151 = this.aClass13_Sub1_13.anInt8606 + local752 * this.aClass13_Sub1_13.anInt8609 / this.aClass13_Sub1_13.anInt8608;
						arg1.anInt9152 = local763 * this.aClass13_Sub1_13.anInt8632 / this.aClass13_Sub1_13.anInt8608 + this.aClass13_Sub1_13.anInt8611;
					} else if (this.aClass13_Sub1_13.anInt8608 > local661) {
						local741 = (local564 - this.aClass13_Sub1_13.anInt8608 << 16) / (local564 - local661);
						local752 = local526 + (local741 * (local526 - local623) >> 16);
						local763 = ((local545 - local642) * local741 >> 16) + local545;
						arg1.anInt9151 = this.aClass13_Sub1_13.anInt8606 + this.aClass13_Sub1_13.anInt8609 * local752 / this.aClass13_Sub1_13.anInt8608;
						arg1.anInt9152 = this.aClass13_Sub1_13.anInt8611 + this.aClass13_Sub1_13.anInt8632 * local763 / this.aClass13_Sub1_13.anInt8608;
					}
				}
			}
			if (local491) {
				if (local661 >= local564) {
					arg1.anInt9149 = (local623 + this.anInt5163) * this.aClass13_Sub1_13.anInt8609 / local661 + this.aClass13_Sub1_13.anInt8606 - arg1.anInt9153;
				} else {
					arg1.anInt9149 = this.aClass13_Sub1_13.anInt8609 * (this.anInt5163 + local526) / local564 + this.aClass13_Sub1_13.anInt8606 - arg1.anInt9151;
				}
				arg1.aBoolean716 = true;
			}
		}
		this.aClass13_Sub1_13.method7493();
		this.aClass13_Sub1_13.method7413(local19);
		this.method4772();
		this.method4768();
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)V")
	private void method4778() {
		if (!this.aBoolean382) {
			return;
		}
		this.aBoolean382 = false;
		if (this.aClass49Array4 == null && this.aClass197Array4 == null && this.aClass67Array1 == null && !Static545.method6701(this.anInt5234, this.anInt5239)) {
			@Pc(38) boolean local38 = false;
			@Pc(40) boolean local40 = false;
			if (this.anIntArray463 != null && !Static471.method6827(this.anInt5239, this.anInt5234)) {
				if (this.aClass258_4 == null || this.aClass258_4.method6236()) {
					if (!this.aBoolean381) {
						this.method4782();
					}
					local38 = true;
				} else {
					this.aBoolean382 = true;
				}
			}
			@Pc(73) boolean local73 = false;
			if (this.anIntArray467 != null && !Static242.method6993(this.anInt5239, this.anInt5234)) {
				if (this.aClass258_4 == null || this.aClass258_4.method6236()) {
					local40 = true;
					if (!this.aBoolean381) {
						this.method4782();
					}
				} else {
					this.aBoolean382 = true;
				}
			}
			if (this.anIntArray466 != null && !Static154.method2818(this.anInt5239, this.anInt5234)) {
				if (this.aClass258_4 == null || this.aClass258_4.method6236()) {
					local73 = true;
					if (!this.aBoolean381) {
						this.method4782();
					}
				} else {
					this.aBoolean382 = true;
				}
			}
			if (local73) {
				this.anIntArray466 = null;
			}
			if (local40) {
				this.anIntArray467 = null;
			}
			if (local38) {
				this.anIntArray463 = null;
			}
		}
		if (this.aShortArray74 != null && this.anIntArray463 == null && this.anIntArray467 == null && this.anIntArray466 == null) {
			this.anIntArray468 = null;
			this.aShortArray74 = null;
		}
		if (this.aByteArray48 != null && !Static514.method7238(this.anInt5239, this.anInt5234)) {
			label203: {
				label202: {
					@Pc(192) boolean local192;
					if ((this.anInt5239 & 0x37) == 0) {
						if (this.aClass258_1 == null || this.aClass258_1.method6236()) {
							break label202;
						}
						local192 = false;
					} else {
						if (this.aClass258_2 == null || this.aClass258_2.method6236()) {
							break label202;
						}
						local192 = false;
					}
					if (!local192) {
						this.aBoolean382 = true;
						break label203;
					}
				}
				this.aShortArray73 = this.aShortArray76 = this.aShortArray79 = null;
				this.aByteArray48 = null;
			}
		}
		if (this.lb != null && !Static221.method3812(this.anInt5239, this.anInt5234)) {
			if (this.aClass258_1 == null || this.aClass258_1.method6236()) {
				this.lb = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.aByteArray49 != null && !Static507.method6858(this.anInt5234, this.anInt5239)) {
			if (this.aClass258_1 == null || this.aClass258_1.method6236()) {
				this.aByteArray49 = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.aFloatArray28 != null && !Static651.method9020(this.anInt5239, this.anInt5234)) {
			if (this.aClass258_3 == null || this.aClass258_3.method6236()) {
				this.aFloatArray28 = this.aFloatArray29 = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.aShortArray77 != null && !Static607.method8573(this.anInt5239, this.anInt5234)) {
			if (this.aClass258_1 == null || this.aClass258_1.method6236()) {
				this.aShortArray77 = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.aShortArray72 != null && !Static393.method5552(this.anInt5234, this.anInt5239)) {
			if ((this.aClass217_1 == null || this.aClass217_1.method5391()) && (this.aClass258_1 == null || this.aClass258_1.method6236())) {
				this.aShortArray72 = this.aShortArray69 = this.aShortArray78 = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.aShortArray70 != null) {
			if (this.aClass258_4 == null || this.aClass258_4.method6236()) {
				this.aShortArray70 = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.aShortArray71 != null) {
			if (this.aClass258_1 == null || this.aClass258_1.method6236()) {
				this.aShortArray71 = null;
			} else {
				this.aBoolean382 = true;
			}
		}
		if (this.anIntArrayArray31 != null && !Static647.method8982(this.anInt5239, this.anInt5234)) {
			this.anIntArrayArray31 = null;
			this.aShortArray80 = null;
		}
		if (this.anIntArrayArray32 != null && !Static94.method1711(this.anInt5234, this.anInt5239)) {
			this.aShortArray75 = null;
			this.anIntArrayArray32 = null;
		}
		if (this.anIntArrayArray33 != null && !Static664.method9173(this.anInt5234, this.anInt5239)) {
			this.anIntArrayArray33 = null;
		}
		if (this.anIntArray469 != null && (this.anInt5234 & 0x800) == 0 && (this.anInt5234 & 0x40000) == 0) {
			this.anIntArray464 = null;
			this.anIntArray469 = null;
			this.anIntArray465 = null;
		}
	}

	@OriginalMember(owner = "client!kj", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class3_Sub20.anIntArray206[arg0];
		@Pc(13) int local13 = Class3_Sub20.anIntArray204[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5238; local15++) {
			local34 = local9 * this.anIntArray466[local15] + local13 * this.anIntArray463[local15] >> 14;
			this.anIntArray466[local15] = this.anIntArray466[local15] * local13 - this.anIntArray463[local15] * local9 >> 14;
			this.anIntArray463[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5218; local34++) {
			@Pc(85) int local85 = local9 * this.aShortArray79[local34] + local13 * this.aShortArray73[local34] >> 14;
			this.aShortArray79[local34] = (short) (local13 * this.aShortArray79[local34] - this.aShortArray73[local34] * local9 >> 14);
			this.aShortArray73[local34] = (short) local85;
		}
		this.method4773();
		this.method4776();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method5662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5182; local7++) {
			local16 = this.lb[local7] & 0xFFFF;
			@Pc(22) int local22 = local16 >> 10 & 0x3F;
			@Pc(28) int local28 = local16 >> 7 & 0x7;
			if (arg1 != -1) {
				local28 += (arg1 - local28) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local22 += (arg0 - local22) * arg3 >> 7;
			}
			@Pc(60) int local60 = local16 & 0x7F;
			if (arg2 != -1) {
				local60 += (arg2 - local60) * arg3 >> 7;
			}
			this.lb[local7] = (short) (local28 << 7 | local22 << 10 | local60);
		}
		if (this.aClass67Array1 != null) {
			for (local16 = 0; local16 < this.anInt5180; local16++) {
				@Pc(105) Class67 local105 = this.aClass67Array1[local16];
				@Pc(110) Class177 local110 = this.aClass177Array1[local16];
				local110.anInt4934 = Static363.anIntArray518[this.lb[local105.anInt1719] & 0xFFFF] & 0xFFFFFF | local110.anInt4934 & 0xFF000000;
			}
		}
		this.method4780();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class95 method5664(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(22) Class95_Sub2 local22;
		@Pc(26) Class95_Sub2 local26;
		if (arg0 == 1) {
			local26 = this.aClass13_Sub1_13.aClass95_Sub2_27;
			local22 = this.aClass13_Sub1_13.aClass95_Sub2_28;
		} else if (arg0 == 2) {
			local22 = this.aClass13_Sub1_13.aClass95_Sub2_26;
			local26 = this.aClass13_Sub1_13.aClass95_Sub2_29;
		} else if (arg0 == 3) {
			local22 = this.aClass13_Sub1_13.aClass95_Sub2_21;
			local26 = this.aClass13_Sub1_13.aClass95_Sub2_23;
		} else if (arg0 == 4) {
			local26 = this.aClass13_Sub1_13.aClass95_Sub2_30;
			local22 = this.aClass13_Sub1_13.aClass95_Sub2_24;
		} else if (arg0 == 5) {
			local26 = this.aClass13_Sub1_13.aClass95_Sub2_22;
			local22 = this.aClass13_Sub1_13.aClass95_Sub2_25;
		} else {
			local22 = local26 = new Class95_Sub2(this.aClass13_Sub1_13, 0, 0, true, false);
		}
		return this.method4781(arg1, local26, arg0 != 0, arg2, local22);
	}

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)Z")
	private boolean method4779() {
		if (this.aClass217_1.aBoolean428) {
			return true;
		}
		if (this.aClass217_1.anInterface20_5 == null) {
			this.aClass217_1.anInterface20_5 = this.aClass13_Sub1_13.method7435(this.aBoolean383);
		}
		@Pc(34) Interface20 local34 = this.aClass217_1.anInterface20_5;
		local34.method8740(this.anInt5189 * 6);
		@Pc(46) Buffer local46 = local34.method7828();
		if (local46 != null) {
			@Pc(54) Stream local54 = this.aClass13_Sub1_13.method7409(local46);
			@Pc(58) int local58;
			if (Stream.c()) {
				for (local58 = 0; local58 < this.anInt5189; local58++) {
					local54.b(this.aShortArray72[local58]);
					local54.b(this.aShortArray69[local58]);
					local54.b(this.aShortArray78[local58]);
				}
			} else {
				for (local58 = 0; local58 < this.anInt5189; local58++) {
					local54.c(this.aShortArray72[local58]);
					local54.c(this.aShortArray69[local58]);
					local54.c(this.aShortArray78[local58]);
				}
			}
			local54.a();
			if (local34.method7826()) {
				this.aBoolean382 = true;
				this.aClass217_1.anInterface20_4 = local34;
				this.aClass217_1.aBoolean428 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5212;
	}

	@OriginalMember(owner = "client!kj", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5177;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IILclient!uu;ZII)Z")
	@Override
	public boolean method5650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class239 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method4777(arg3, arg4, arg0, arg5, arg2, arg1);
	}

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5238; local3++) {
			this.anIntArray466[local3] = -this.anIntArray466[local3];
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt5218; local25++) {
			this.aShortArray79[local25] = (short) -this.aShortArray79[local25];
		}
		for (@Pc(44) int local44 = 0; local44 < this.anInt5182; local44++) {
			@Pc(51) short local51 = this.aShortArray72[local44];
			this.aShortArray72[local44] = this.aShortArray78[local44];
			this.aShortArray78[local44] = local51;
		}
		this.method4773();
		this.method4776();
		this.method4771();
		this.aBoolean381 = false;
	}

	@OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)V")
	private void method4780() {
		if (this.aClass258_1 != null) {
			this.aClass258_1.aBoolean493 = false;
		}
	}

	@OriginalMember(owner = "client!kj", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean381) {
			this.method4782();
		}
		return this.anInt5163;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!kj;ZZILclient!kj;)Lclient!ka;")
	private Class95 method4781(@OriginalArg(0) int arg0, @OriginalArg(1) Class95_Sub2 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) Class95_Sub2 arg4) {
		if ((arg0 & 0x100) == 0) {
			arg4.aBoolean380 = this.aBoolean380;
		} else {
			arg4.aBoolean380 = true;
		}
		arg4.anInt5239 = this.anInt5239;
		arg4.anInt5227 = this.anInt5227;
		arg4.anInt5189 = this.anInt5189;
		arg4.anInt5218 = this.anInt5218;
		arg4.anInt5238 = this.anInt5238;
		arg4.anInt5182 = this.anInt5182;
		arg4.aBoolean379 = this.aBoolean379;
		arg4.anInt5180 = this.anInt5180;
		arg4.anInt5234 = arg0;
		arg4.aShort54 = this.aShort54;
		arg4.aShort53 = this.aShort53;
		@Pc(72) boolean local72 = Static493.method7095(arg0, this.anInt5239);
		@Pc(78) boolean local78 = Static60.method1284(arg0, this.anInt5239);
		@Pc(84) boolean local84 = Static623.method8759(this.anInt5239, arg0);
		@Pc(90) boolean local90 = local84 | local78 | local72;
		@Pc(201) int local201;
		if (local90) {
			if (!local72) {
				arg4.anIntArray463 = this.anIntArray463;
			} else if (arg1.anIntArray463 == null || arg1.anIntArray463.length < this.anInt5227) {
				arg4.anIntArray463 = arg1.anIntArray463 = new int[this.anInt5227];
			} else {
				arg4.anIntArray463 = arg1.anIntArray463;
			}
			if (!local78) {
				arg4.anIntArray467 = this.anIntArray467;
			} else if (arg1.anIntArray467 == null || arg1.anIntArray467.length < this.anInt5227) {
				arg4.anIntArray467 = arg1.anIntArray467 = new int[this.anInt5227];
			} else {
				arg4.anIntArray467 = arg1.anIntArray467;
			}
			if (!local84) {
				arg4.anIntArray466 = this.anIntArray466;
			} else if (arg1.anIntArray466 == null || this.anInt5227 > arg1.anIntArray466.length) {
				arg4.anIntArray466 = arg1.anIntArray466 = new int[this.anInt5227];
			} else {
				arg4.anIntArray466 = arg1.anIntArray466;
			}
			for (local201 = 0; local201 < this.anInt5227; local201++) {
				if (local72) {
					arg4.anIntArray463[local201] = this.anIntArray463[local201];
				}
				if (local78) {
					arg4.anIntArray467[local201] = this.anIntArray467[local201];
				}
				if (local84) {
					arg4.anIntArray466[local201] = this.anIntArray466[local201];
				}
			}
		} else {
			arg4.anIntArray463 = this.anIntArray463;
			arg4.anIntArray467 = this.anIntArray467;
			arg4.anIntArray466 = this.anIntArray466;
		}
		if (Static94.method1709(arg0, this.anInt5239)) {
			arg4.aClass258_4 = arg1.aClass258_4;
			arg4.aClass258_4.anInterface15_11 = this.aClass258_4.anInterface15_11;
			arg4.aClass258_4.aBoolean494 = true;
			arg4.aClass258_4.aBoolean493 = this.aClass258_4.aBoolean493;
		} else if (Static393.method5548(this.anInt5239, arg0)) {
			arg4.aClass258_4 = this.aClass258_4;
		} else {
			arg4.aClass258_4 = null;
		}
		if (Static311.method4740(arg0, this.anInt5239)) {
			if (arg1.lb == null || this.anInt5182 > arg1.lb.length) {
				arg4.lb = arg1.lb = new short[this.anInt5182];
			} else {
				arg4.lb = arg1.lb;
			}
			for (local201 = 0; local201 < this.anInt5182; local201++) {
				arg4.lb[local201] = this.lb[local201];
			}
		} else {
			arg4.lb = this.lb;
		}
		if (Static70.method5710(this.anInt5239, arg0)) {
			if (arg1.aByteArray49 == null || arg1.aByteArray49.length < this.anInt5182) {
				arg4.aByteArray49 = arg1.aByteArray49 = new byte[this.anInt5182];
			} else {
				arg4.aByteArray49 = arg1.aByteArray49;
			}
			for (local201 = 0; local201 < this.anInt5182; local201++) {
				arg4.aByteArray49[local201] = this.aByteArray49[local201];
			}
		} else {
			arg4.aByteArray49 = this.aByteArray49;
		}
		if (Static581.method7252(arg0, this.anInt5239)) {
			arg4.aClass258_1 = arg1.aClass258_1;
			arg4.aClass258_1.aBoolean493 = this.aClass258_1.aBoolean493;
			arg4.aClass258_1.aBoolean494 = true;
			arg4.aClass258_1.anInterface15_11 = this.aClass258_1.anInterface15_11;
		} else if (Static295.method4573(arg0, this.anInt5239)) {
			arg4.aClass258_1 = this.aClass258_1;
		} else {
			arg4.aClass258_1 = null;
		}
		@Pc(514) int local514;
		if (Static154.method2816(arg0, this.anInt5239)) {
			if (arg1.aShortArray73 == null || arg1.aShortArray73.length < this.anInt5218) {
				local201 = this.anInt5218;
				arg4.aShortArray73 = arg1.aShortArray73 = new short[local201];
				arg4.aShortArray79 = arg1.aShortArray79 = new short[local201];
				arg4.aShortArray76 = arg1.aShortArray76 = new short[local201];
			} else {
				arg4.aShortArray76 = arg1.aShortArray76;
				arg4.aShortArray79 = arg1.aShortArray79;
				arg4.aShortArray73 = arg1.aShortArray73;
			}
			if (this.aClass294_1 == null) {
				arg4.aClass294_1 = null;
				for (local201 = 0; local201 < this.anInt5218; local201++) {
					arg4.aShortArray73[local201] = this.aShortArray73[local201];
					arg4.aShortArray76[local201] = this.aShortArray76[local201];
					arg4.aShortArray79[local201] = this.aShortArray79[local201];
				}
			} else {
				if (arg1.aClass294_1 == null) {
					arg1.aClass294_1 = new Class294();
				}
				@Pc(502) Class294 local502 = arg4.aClass294_1 = arg1.aClass294_1;
				if (local502.aShortArray117 == null || this.anInt5218 > local502.aShortArray117.length) {
					local514 = this.anInt5218;
					local502.aByteArray88 = new byte[local514];
					local502.aShortArray118 = new short[local514];
					local502.aShortArray117 = new short[local514];
					local502.aShortArray119 = new short[local514];
				}
				for (local514 = 0; local514 < this.anInt5218; local514++) {
					arg4.aShortArray73[local514] = this.aShortArray73[local514];
					arg4.aShortArray76[local514] = this.aShortArray76[local514];
					arg4.aShortArray79[local514] = this.aShortArray79[local514];
					local502.aShortArray117[local514] = this.aClass294_1.aShortArray117[local514];
					local502.aShortArray118[local514] = this.aClass294_1.aShortArray118[local514];
					local502.aShortArray119[local514] = this.aClass294_1.aShortArray119[local514];
					local502.aByteArray88[local514] = this.aClass294_1.aByteArray88[local514];
				}
			}
			arg4.aByteArray48 = this.aByteArray48;
		} else {
			arg4.aShortArray79 = this.aShortArray79;
			arg4.aClass294_1 = this.aClass294_1;
			arg4.aShortArray76 = this.aShortArray76;
			arg4.aShortArray73 = this.aShortArray73;
			arg4.aByteArray48 = this.aByteArray48;
		}
		if (Static257.method4214(this.anInt5239, arg0)) {
			arg4.aClass258_2 = arg1.aClass258_2;
			arg4.aClass258_2.anInterface15_11 = this.aClass258_2.anInterface15_11;
			arg4.aClass258_2.aBoolean493 = this.aClass258_2.aBoolean493;
			arg4.aClass258_2.aBoolean494 = true;
		} else if (Static419.method1507(arg0, this.anInt5239)) {
			arg4.aClass258_2 = this.aClass258_2;
		} else {
			arg4.aClass258_2 = null;
		}
		if (Static341.method5111(this.anInt5239, arg0)) {
			if (arg1.aFloatArray28 == null || this.anInt5182 > arg1.aFloatArray28.length) {
				local201 = this.anInt5218;
				arg4.aFloatArray28 = arg1.aFloatArray28 = new float[local201];
				arg4.aFloatArray29 = arg1.aFloatArray29 = new float[local201];
			} else {
				arg4.aFloatArray29 = arg1.aFloatArray29;
				arg4.aFloatArray28 = arg1.aFloatArray28;
			}
			for (local201 = 0; local201 < this.anInt5218; local201++) {
				arg4.aFloatArray28[local201] = this.aFloatArray28[local201];
				arg4.aFloatArray29[local201] = this.aFloatArray29[local201];
			}
		} else {
			arg4.aFloatArray29 = this.aFloatArray29;
			arg4.aFloatArray28 = this.aFloatArray28;
		}
		if (Static156.method2847(this.anInt5239, arg0)) {
			arg4.aClass258_3 = arg1.aClass258_3;
			arg4.aClass258_3.anInterface15_11 = this.aClass258_3.anInterface15_11;
			arg4.aClass258_3.aBoolean493 = this.aClass258_3.aBoolean493;
			arg4.aClass258_3.aBoolean494 = true;
		} else if (Static528.method7626(this.anInt5239, arg0)) {
			arg4.aClass258_3 = this.aClass258_3;
		} else {
			arg4.aClass258_3 = null;
		}
		if (Static437.method6235(arg0, this.anInt5239)) {
			if (arg1.aShortArray72 == null || arg1.aShortArray72.length < this.anInt5182) {
				local201 = this.anInt5182;
				arg4.aShortArray72 = arg1.aShortArray72 = new short[local201];
				arg4.aShortArray78 = arg1.aShortArray78 = new short[local201];
				arg4.aShortArray69 = arg1.aShortArray69 = new short[local201];
			} else {
				arg4.aShortArray69 = arg1.aShortArray69;
				arg4.aShortArray78 = arg1.aShortArray78;
				arg4.aShortArray72 = arg1.aShortArray72;
			}
			for (local201 = 0; local201 < this.anInt5182; local201++) {
				arg4.aShortArray72[local201] = this.aShortArray72[local201];
				arg4.aShortArray69[local201] = this.aShortArray69[local201];
				arg4.aShortArray78[local201] = this.aShortArray78[local201];
			}
		} else {
			arg4.aShortArray78 = this.aShortArray78;
			arg4.aShortArray69 = this.aShortArray69;
			arg4.aShortArray72 = this.aShortArray72;
		}
		if (Static574.method8103(arg0, this.anInt5239)) {
			arg4.aClass217_1 = arg1.aClass217_1;
			arg4.aClass217_1.aBoolean428 = this.aClass217_1.aBoolean428;
			arg4.aClass217_1.anInterface20_4 = this.aClass217_1.anInterface20_4;
			arg4.aClass217_1.aBoolean429 = true;
		} else if (Static89.method1669(this.anInt5239, arg0)) {
			arg4.aClass217_1 = this.aClass217_1;
		} else {
			arg4.aClass217_1 = null;
		}
		if (Static268.method4385(arg0, this.anInt5239)) {
			if (arg1.aShortArray77 == null || arg1.aShortArray77.length < this.anInt5182) {
				local201 = this.anInt5182;
				arg4.aShortArray77 = arg1.aShortArray77 = new short[local201];
			} else {
				arg4.aShortArray77 = arg1.aShortArray77;
			}
			for (local201 = 0; local201 < this.anInt5182; local201++) {
				arg4.aShortArray77[local201] = this.aShortArray77[local201];
			}
		} else {
			arg4.aShortArray77 = this.aShortArray77;
		}
		if (!Static281.method4518(this.anInt5239, arg0)) {
			arg4.aClass177Array1 = this.aClass177Array1;
		} else if (arg1.aClass177Array1 == null || arg1.aClass177Array1.length < this.anInt5180) {
			local201 = this.anInt5180;
			arg4.aClass177Array1 = arg1.aClass177Array1 = new Class177[local201];
			for (local514 = 0; local514 < this.anInt5180; local514++) {
				arg4.aClass177Array1[local514] = this.aClass177Array1[local514].method4552();
			}
		} else {
			arg4.aClass177Array1 = arg1.aClass177Array1;
			for (local201 = 0; local201 < this.anInt5180; local201++) {
				arg4.aClass177Array1[local201].method4550(this.aClass177Array1[local201]);
			}
		}
		arg4.anIntArray468 = this.anIntArray468;
		arg4.anIntArray465 = this.anIntArray465;
		arg4.anIntArrayArray33 = this.anIntArrayArray33;
		arg4.anIntArrayArray31 = this.anIntArrayArray31;
		arg4.anIntArray464 = this.anIntArray464;
		arg4.aShortArray80 = this.aShortArray80;
		if (this.aBoolean381) {
			arg4.anInt5240 = this.anInt5240;
			arg4.anInt5177 = this.anInt5177;
			arg4.anInt5214 = this.anInt5214;
			arg4.anInt5169 = this.anInt5169;
			arg4.anInt5176 = this.anInt5176;
			arg4.anInt5212 = this.anInt5212;
			arg4.anInt5163 = this.anInt5163;
			arg4.anInt5197 = this.anInt5197;
			arg4.aBoolean381 = true;
		} else {
			arg4.aBoolean381 = false;
		}
		arg4.aClass67Array1 = this.aClass67Array1;
		arg4.anIntArray469 = this.anIntArray469;
		arg4.aShortArray71 = this.aShortArray71;
		arg4.aClass49Array4 = this.aClass49Array4;
		arg4.aShortArray74 = this.aShortArray74;
		arg4.aClass197Array4 = this.aClass197Array4;
		arg4.anIntArrayArray32 = this.anIntArrayArray32;
		arg4.aShortArray75 = this.aShortArray75;
		arg4.aShortArray70 = this.aShortArray70;
		return arg4;
	}

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean380;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "()[Lclient!cba;")
	@Override
	public Class49[] method5654() {
		return this.aClass49Array4;
	}

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "(I)V")
	private void method4782() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5238; local23++) {
			@Pc(30) int local30 = this.anIntArray463[local23];
			@Pc(35) int local35 = this.anIntArray467[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			@Pc(49) int local49 = this.anIntArray466[local23];
			if (local13 < local30) {
				local13 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			if (local35 < local9) {
				local9 = local35;
			}
			if (local17 < local49) {
				local17 = local49;
			}
			if (local49 < local11) {
				local11 = local49;
			}
			@Pc(90) int local90 = local30 * local30 + local49 * local49;
			if (local19 < local90) {
				local19 = local90;
			}
			local90 = local30 * local30 + local49 * local49 + local35 * local35;
			if (local21 < local90) {
				local21 = local90;
			}
		}
		this.anInt5177 = local11;
		this.anInt5240 = local9;
		this.anInt5197 = local15;
		this.anInt5214 = local7;
		this.anInt5212 = local17;
		this.anInt5176 = local13;
		this.anInt5163 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt5169 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean381 = true;
	}

	@OriginalMember(owner = "client!kj", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface4 local9 = this.aClass13_Sub1_13.anInterface4_14;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5182; local11++) {
			if (arg0 == this.aShortArray77[local11]) {
				this.aShortArray77[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class119 local47 = local9.method4673(arg0 & 0xFFFF);
			local37 = local47.aByte53;
			local35 = local47.aByte55;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class119 local68 = local9.method4673(arg1 & 0xFFFF);
			local57 = local68.aByte53;
			local55 = local68.aByte55;
			if (local68.aByte57 != 0 || local68.aByte59 != 0) {
				this.aBoolean379 = true;
			}
		}
		if (!(local57 != local37 | local55 != local35)) {
			return;
		}
		if (this.aClass67Array1 != null) {
			for (@Pc(109) int local109 = 0; local109 < this.anInt5180; local109++) {
				@Pc(116) Class67 local116 = this.aClass67Array1[local109];
				@Pc(121) Class177 local121 = this.aClass177Array1[local109];
				local121.anInt4934 = Static363.anIntArray518[this.lb[local116.anInt1719] & 0xFFFF] & 0xFFFFFF | local121.anInt4934 & 0xFF000000;
			}
		}
		this.method4780();
	}
}
