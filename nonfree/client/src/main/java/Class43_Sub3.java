import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public final class Class43_Sub3 extends Class43 {

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "Z")
	private boolean aBoolean750;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	private int anInt10439;

	@OriginalMember(owner = "client!vm", name = "Wb", descriptor = "I")
	private int anInt10440;

	@OriginalMember(owner = "client!vm", name = "sc", descriptor = "Lclient!daa;")
	private Class71 aClass71_1;

	@OriginalMember(owner = "client!vm", name = "vb", descriptor = "I")
	private int anInt10445;

	@OriginalMember(owner = "client!vm", name = "o", descriptor = "I")
	private int anInt10446;

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "Z")
	private boolean aBoolean751;

	@OriginalMember(owner = "client!vm", name = "Db", descriptor = "Lclient!daa;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "I")
	private int anInt10471;

	@OriginalMember(owner = "client!vm", name = "Ec", descriptor = "Lclient!td;")
	private Class345 aClass345_1;

	@OriginalMember(owner = "client!vm", name = "ob", descriptor = "I")
	private int anInt10476;

	@OriginalMember(owner = "client!vm", name = "mb", descriptor = "I")
	private int anInt10482;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	private int anInt10483;

	@OriginalMember(owner = "client!vm", name = "Hb", descriptor = "I")
	private int anInt10487;

	@OriginalMember(owner = "client!vm", name = "Zb", descriptor = "Lclient!daa;")
	private Class71 aClass71_3;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "Lclient!jea;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!vm", name = "N", descriptor = "Lclient!daa;")
	private Class71 aClass71_4;

	@OriginalMember(owner = "client!vm", name = "Fb", descriptor = "I")
	private int anInt10503;

	@OriginalMember(owner = "client!vm", name = "rc", descriptor = "Z")
	private boolean aBoolean753;

	@OriginalMember(owner = "client!vm", name = "ac", descriptor = "I")
	private int anInt10513;

	@OriginalMember(owner = "client!vm", name = "sb", descriptor = "Lclient!gca;")
	private final Class100_Sub1 aClass100_Sub1_21;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "[I")
	private int[] anIntArray597;

	@OriginalMember(owner = "client!vm", name = "rb", descriptor = "I")
	private int anInt10436;

	@OriginalMember(owner = "client!vm", name = "wc", descriptor = "I")
	private int anInt10473;

	@OriginalMember(owner = "client!vm", name = "T", descriptor = "Z")
	private boolean aBoolean754;

	@OriginalMember(owner = "client!vm", name = "qc", descriptor = "Z")
	private boolean aBoolean752;

	@OriginalMember(owner = "client!vm", name = "Nb", descriptor = "I")
	private int anInt10490;

	@OriginalMember(owner = "client!vm", name = "Z", descriptor = "[S")
	private short[] aShortArray162;

	@OriginalMember(owner = "client!vm", name = "fb", descriptor = "[I")
	private int[] anIntArray593;

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "[I")
	private int[] anIntArray592;

	@OriginalMember(owner = "client!vm", name = "Gc", descriptor = "[I")
	private int[] anIntArray594;

	@OriginalMember(owner = "client!vm", name = "ab", descriptor = "I")
	private int anInt10512;

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "[Lclient!ui;")
	private Class363[] aClass363Array5;

	@OriginalMember(owner = "client!vm", name = "hc", descriptor = "[Lclient!ok;")
	private Class270[] aClass270Array5;

	@OriginalMember(owner = "client!vm", name = "xc", descriptor = "I")
	private int anInt10447;

	@OriginalMember(owner = "client!vm", name = "cb", descriptor = "[Lclient!nj;")
	private Class252[] aClass252Array1;

	@OriginalMember(owner = "client!vm", name = "J", descriptor = "[Lclient!aq;")
	private Class19[] aClass19Array1;

	@OriginalMember(owner = "client!vm", name = "ib", descriptor = "[S")
	private short[] aShortArray165;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "[S")
	private short[] aShortArray161;

	@OriginalMember(owner = "client!vm", name = "jc", descriptor = "[B")
	private byte[] aByteArray107;

	@OriginalMember(owner = "client!vm", name = "hb", descriptor = "[S")
	private short[] aShortArray167;

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "[S")
	private short[] aShortArray168;

	@OriginalMember(owner = "client!vm", name = "nb", descriptor = "[S")
	private short[] aShortArray169;

	@OriginalMember(owner = "client!vm", name = "Hc", descriptor = "[S")
	private short[] aShortArray172;

	@OriginalMember(owner = "client!vm", name = "nc", descriptor = "[F")
	private float[] aFloatArray77;

	@OriginalMember(owner = "client!vm", name = "lb", descriptor = "[F")
	private float[] lb;

	@OriginalMember(owner = "client!vm", name = "Eb", descriptor = "[S")
	private short[] aShortArray166;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "[S")
	private short[] aShortArray160;

	@OriginalMember(owner = "client!vm", name = "n", descriptor = "S")
	private short aShort121;

	@OriginalMember(owner = "client!vm", name = "uc", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!vm", name = "Ac", descriptor = "[S")
	private short[] aShortArray164;

	@OriginalMember(owner = "client!vm", name = "M", descriptor = "[S")
	private short[] aShortArray171;

	@OriginalMember(owner = "client!vm", name = "gc", descriptor = "S")
	private short aShort120;

	@OriginalMember(owner = "client!vm", name = "Ub", descriptor = "[S")
	private short[] aShortArray170;

	@OriginalMember(owner = "client!vm", name = "Y", descriptor = "[S")
	private short[] aShortArray163;

	@OriginalMember(owner = "client!vm", name = "mc", descriptor = "[I")
	private int[] anIntArray598;

	@OriginalMember(owner = "client!vm", name = "W", descriptor = "[I")
	private int[] anIntArray591;

	@OriginalMember(owner = "client!vm", name = "Xb", descriptor = "[I")
	private int[] anIntArray599;

	@OriginalMember(owner = "client!vm", name = "pc", descriptor = "[[I")
	private int[][] anIntArrayArray64;

	@OriginalMember(owner = "client!vm", name = "ec", descriptor = "[[I")
	private int[][] anIntArrayArray66;

	@OriginalMember(owner = "client!vm", name = "Cb", descriptor = "[[I")
	private int[][] anIntArrayArray65;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!gca;Lclient!kc;IIII)V")
	public Class43_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) Class197 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface7 local11 = arg0.anInterface7_12;
		@Pc(15) int[] local15 = new int[arg1.anInt5115];
		this.anIntArray597 = new int[arg1.anInt5124 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt5115; local24++) {
			if (arg1.aByteArray50 == null || arg1.aByteArray50[local24] != 2) {
				if (arg1.aShortArray66 != null && arg1.aShortArray66[local24] != -1) {
					@Pc(63) Class44 local63 = local11.method7423(arg1.aShortArray66[local24] & 0xFFFF);
					if (((this.anInt10471 & 0x40) == 0 || !local63.aBoolean56) && local63.aBoolean58) {
						continue;
					}
				}
				local15[this.anInt10436++] = local24;
				this.anIntArray597[arg1.aShortArray67[local24]]++;
				this.anIntArray597[arg1.aShortArray71[local24]]++;
				this.anIntArray597[arg1.aShortArray64[local24]]++;
			}
		}
		this.anInt10473 = this.anInt10436;
		@Pc(144) long[] local144 = new long[this.anInt10436];
		@Pc(159) boolean local159 = (this.anInt10483 & 0x100) != 0;
		@Pc(173) int local173;
		@Pc(186) int local186;
		@Pc(375) int local375;
		for (@Pc(161) int local161 = 0; local161 < this.anInt10436; local161++) {
			@Pc(169) int local169 = local15[local161];
			@Pc(171) Class44 local171 = null;
			local173 = 0;
			@Pc(175) byte local175 = 0;
			@Pc(177) byte local177 = 0;
			@Pc(179) byte local179 = 0;
			if (arg1.aClass129Array1 != null) {
				@Pc(184) boolean local184 = false;
				for (local186 = 0; local186 < arg1.aClass129Array1.length; local186++) {
					@Pc(193) Class129 local193 = arg1.aClass129Array1[local186];
					if (local169 == local193.anInt3394) {
						@Pc(206) Class335 local206 = Static357.method5233(local193.anInt3390);
						if (local206.aBoolean577) {
							local184 = true;
						}
						if (local206.anInt8737 != -1) {
							@Pc(222) Class44 local222 = local11.method7423(local206.anInt8737);
							if (local222.anInt809 == 2) {
								this.aBoolean754 = true;
							}
						}
					}
				}
				if (local184) {
					local144[local161] = Long.MAX_VALUE;
					this.anInt10473--;
					continue;
				}
			}
			@Pc(259) short local259 = -1;
			if (arg1.aShortArray66 != null) {
				local259 = arg1.aShortArray66[local169];
				if (local259 != -1) {
					local171 = local11.method7423(local259 & 0xFFFF);
					if ((this.anInt10471 & 0x40) != 0 && local171.aBoolean56) {
						local259 = -1;
						local171 = null;
					} else {
						local179 = local171.aByte19;
						local177 = local171.aByte23;
					}
				}
			}
			@Pc(333) boolean local333 = arg1.aByteArray55 != null && arg1.aByteArray55[local169] != 0 || local171 != null && local171.anInt809 != 0;
			if ((local159 || local333) && arg1.aByteArray49 != null) {
				local173 += arg1.aByteArray49[local169] << 17;
			}
			if (local333) {
				local173 += 65536;
			}
			local173 += (local177 & 0xFF) << 8;
			local375 = local175 + ((local259 & 0xFFFF) << 16);
			local173 += local179 & 0xFF;
			@Pc(387) int local387 = local375 + (local161 & 0xFFFF);
			local144[local161] = ((long) local173 << 32) + ((long) local387);
			this.aBoolean752 |= local171 != null && (local171.aByte18 != 0 || local171.aByte20 != 0);
			this.aBoolean754 |= local333;
		}
		Static347.method5132(local144, local15);
		this.anInt10490 = arg1.anInt5130;
		this.aShortArray162 = arg1.aShortArray72;
		this.anIntArray593 = arg1.anIntArray302;
		this.anIntArray592 = arg1.anIntArray299;
		this.anIntArray594 = arg1.anIntArray307;
		this.anInt10512 = arg1.anInt5124;
		@Pc(466) Class130[] local466 = new Class130[this.anInt10512];
		this.aClass363Array5 = arg1.aClass363Array3;
		this.aClass270Array5 = arg1.aClass270Array3;
		@Pc(494) int local494;
		@Pc(510) int local510;
		@Pc(557) int local557;
		if (arg1.aClass129Array1 != null) {
			this.anInt10447 = arg1.aClass129Array1.length;
			this.aClass252Array1 = new Class252[this.anInt10447];
			this.aClass19Array1 = new Class19[this.anInt10447];
			for (local494 = 0; local494 < this.anInt10447; local494++) {
				@Pc(503) Class129 local503 = arg1.aClass129Array1[local494];
				@Pc(508) Class335 local508 = Static357.method5233(local503.anInt3390);
				local510 = -1;
				for (@Pc(512) int local512 = 0; local512 < this.anInt10436; local512++) {
					if (local503.anInt3394 == local15[local512]) {
						local510 = local512;
						break;
					}
				}
				if (local510 == -1) {
					throw new RuntimeException();
				}
				local557 = Static408.anIntArray407[arg1.aShortArray68[local503.anInt3394] & 0xFFFF] & 0xFFFFFF;
				@Pc(576) int local576 = local557 | 255 - (arg1.aByteArray55 == null ? 0 : arg1.aByteArray55[local503.anInt3394]) << 24;
				this.aClass19Array1[local494] = new Class19(local510, arg1.aShortArray67[local503.anInt3394], arg1.aShortArray71[local503.anInt3394], arg1.aShortArray64[local503.anInt3394], local508.anInt8745, local508.anInt8747, local508.anInt8737, local508.anInt8742, local508.anInt8743, local508.aBoolean577, local508.aBoolean578, local503.anInt3388);
				this.aClass252Array1[local494] = new Class252(local576);
			}
		}
		local494 = this.anInt10436 * 3;
		this.aShortArray165 = new short[this.anInt10436];
		this.aShortArray161 = new short[this.anInt10436];
		this.aByteArray107 = new byte[local494];
		this.aShortArray167 = new short[this.anInt10436];
		this.aShortArray168 = new short[local494];
		this.aShortArray169 = new short[local494];
		this.aShortArray172 = new short[local494];
		this.aFloatArray77 = new float[local494];
		this.lb = new float[local494];
		this.aShortArray166 = new short[local494];
		this.aShortArray160 = new short[local494];
		Static140.aLongArray10 = new long[local494];
		this.aShort121 = (short) arg4;
		this.aByteArray108 = new byte[this.anInt10436];
		this.aShortArray164 = new short[local494];
		this.aShortArray171 = new short[this.anInt10436];
		this.aShort120 = (short) arg3;
		if (arg1.aShortArray70 != null) {
			this.aShortArray170 = new short[this.anInt10436];
		}
		this.aShortArray163 = new short[this.anInt10436];
		local173 = 0;
		for (local375 = 0; local375 < arg1.anInt5124; local375++) {
			local510 = this.anIntArray597[local375];
			this.anIntArray597[local375] = local173;
			local173 += local510;
			local466[local375] = new Class130();
		}
		this.anIntArray597[arg1.anInt5124] = local173;
		@Pc(770) Class256 local770 = Static65.method1081(this.anInt10436, arg1, local15);
		@Pc(774) Class47[] local774 = new Class47[arg1.anInt5115];
		@Pc(816) int local816;
		@Pc(826) int local826;
		@Pc(837) int local837;
		@Pc(795) short local795;
		@Pc(806) int local806;
		for (local557 = 0; local557 < arg1.anInt5115; local557++) {
			@Pc(785) short local785 = arg1.aShortArray67[local557];
			@Pc(790) short local790 = arg1.aShortArray71[local557];
			local795 = arg1.aShortArray64[local557];
			local806 = this.anIntArray594[local790] - this.anIntArray594[local785];
			local816 = this.anIntArray592[local790] - this.anIntArray592[local785];
			local826 = this.anIntArray593[local790] - this.anIntArray593[local785];
			local837 = this.anIntArray594[local795] - this.anIntArray594[local785];
			@Pc(847) int local847 = this.anIntArray592[local795] - this.anIntArray592[local785];
			@Pc(857) int local857 = this.anIntArray593[local795] - this.anIntArray593[local785];
			@Pc(865) int local865 = local816 * local857 - local826 * local847;
			@Pc(874) int local874 = local826 * local837 - local806 * local857;
			@Pc(883) int local883 = local847 * local806 - local816 * local837;
			while (local865 > 8192 || local874 > 8192 || local883 > 8192 || local865 < -8192 || local874 < -8192 || local883 < -8192) {
				local865 >>= 0x1;
				local883 >>= 0x1;
				local874 >>= 0x1;
			}
			@Pc(938) int local938 = (int) Math.sqrt((double) (local874 * local874 + local865 * local865 + local883 * local883));
			if (local938 <= 0) {
				local938 = 1;
			}
			local883 = local883 * 256 / local938;
			local865 = local865 * 256 / local938;
			local874 = local874 * 256 / local938;
			@Pc(974) byte local974 = arg1.aByteArray50 == null ? 0 : arg1.aByteArray50[local557];
			if (local974 == 0) {
				@Pc(1007) Class130 local1007 = local466[local785];
				local1007.anInt3400 += local883;
				local1007.anInt3399 += local874;
				local1007.anInt3397 += local865;
				local1007.anInt3398++;
				@Pc(1035) Class130 local1035 = local466[local790];
				local1035.anInt3400 += local883;
				local1035.anInt3399 += local874;
				local1035.anInt3398++;
				local1035.anInt3397 += local865;
				@Pc(1063) Class130 local1063 = local466[local795];
				local1063.anInt3400 += local883;
				local1063.anInt3397 += local865;
				local1063.anInt3399 += local874;
				local1063.anInt3398++;
			} else if (local974 == 1) {
				@Pc(992) Class47 local992 = local774[local557] = new Class47();
				local992.anInt928 = local874;
				local992.anInt932 = local883;
				local992.anInt927 = local865;
			}
		}
		@Pc(1108) int local1108;
		@Pc(1152) short local1152;
		for (local186 = 0; local186 < this.anInt10436; local186++) {
			local1108 = local15[local186];
			@Pc(1115) int local1115 = arg1.aShortArray68[local1108] & 0xFFFF;
			if (arg1.aByteArray53 == null) {
				local806 = -1;
			} else {
				local806 = arg1.aByteArray53[local1108];
			}
			if (arg1.aByteArray55 == null) {
				local816 = 0;
			} else {
				local816 = arg1.aByteArray55[local1108] & 0xFF;
			}
			local1152 = arg1.aShortArray66 == null ? -1 : arg1.aShortArray66[local1108];
			if (local1152 != -1 && (this.anInt10471 & 0x40) != 0) {
				@Pc(1169) Class44 local1169 = local11.method7423(local1152 & 0xFFFF);
				if (local1169.aBoolean56) {
					local1152 = -1;
				}
			}
			@Pc(1176) float local1176 = 0.0F;
			@Pc(1178) float local1178 = 0.0F;
			@Pc(1180) float local1180 = 0.0F;
			@Pc(1182) float local1182 = 0.0F;
			@Pc(1184) float local1184 = 0.0F;
			@Pc(1186) float local1186 = 0.0F;
			@Pc(1188) byte local1188 = 0;
			@Pc(1190) byte local1190 = 0;
			@Pc(1192) int local1192 = 0;
			@Pc(1229) byte local1229;
			@Pc(1246) short local1246;
			@Pc(2069) short local2069;
			@Pc(2074) short local2074;
			if (local1152 != -1) {
				if (local806 == -1) {
					local1176 = 0.0F;
					local1190 = 2;
					local1178 = 1.0F;
					local1184 = 0.0F;
					local1186 = 0.0F;
					local1180 = 1.0F;
					local1182 = 1.0F;
					local1188 = 1;
				} else {
					local806 &= 0xFF;
					local1229 = arg1.aByteArray54[local806];
					@Pc(1236) short local1236;
					@Pc(1241) short local1241;
					@Pc(1279) float local1279;
					@Pc(1290) float local1290;
					@Pc(1384) float local1384;
					@Pc(1634) float local1634;
					@Pc(1642) float local1642;
					@Pc(1650) float local1650;
					@Pc(1673) float local1673;
					@Pc(1696) float local1696;
					@Pc(1719) float local1719;
					if (local1229 == 0) {
						local1236 = arg1.aShortArray67[local1108];
						local1241 = arg1.aShortArray71[local1108];
						local1246 = arg1.aShortArray64[local1108];
						local2069 = arg1.aShortArray63[local806];
						local2074 = arg1.aShortArray65[local806];
						@Pc(2079) short local2079 = arg1.aShortArray69[local806];
						@Pc(2085) float local2085 = (float) arg1.anIntArray307[local2069];
						@Pc(2091) float local2091 = (float) arg1.anIntArray299[local2069];
						local1279 = (float) arg1.anIntArray302[local2069];
						local1290 = (float) arg1.anIntArray307[local2074] - local2085;
						local1384 = (float) arg1.anIntArray299[local2074] - local2091;
						@Pc(2124) float local2124 = (float) arg1.anIntArray302[local2074] - local1279;
						@Pc(2133) float local2133 = (float) arg1.anIntArray307[local2079] - local2085;
						@Pc(2142) float local2142 = (float) arg1.anIntArray299[local2079] - local2091;
						@Pc(2150) float local2150 = (float) arg1.anIntArray302[local2079] - local1279;
						@Pc(2159) float local2159 = (float) arg1.anIntArray307[local1236] - local2085;
						@Pc(2168) float local2168 = (float) arg1.anIntArray299[local1236] - local2091;
						@Pc(2177) float local2177 = (float) arg1.anIntArray302[local1236] - local1279;
						@Pc(2185) float local2185 = (float) arg1.anIntArray307[local1241] - local2085;
						@Pc(2194) float local2194 = (float) arg1.anIntArray299[local1241] - local2091;
						local1634 = (float) arg1.anIntArray302[local1241] - local1279;
						local1642 = (float) arg1.anIntArray307[local1246] - local2085;
						local1650 = (float) arg1.anIntArray299[local1246] - local2091;
						local1673 = (float) arg1.anIntArray302[local1246] - local1279;
						local1696 = local1384 * local2150 - local2142 * local2124;
						local1719 = local2124 * local2133 - local2150 * local1290;
						@Pc(2254) float local2254 = local2142 * local1290 - local2133 * local1384;
						@Pc(2263) float local2263 = local2142 * local2254 - local2150 * local1719;
						@Pc(2271) float local2271 = local1696 * local2150 - local2133 * local2254;
						@Pc(2280) float local2280 = local1719 * local2133 - local1696 * local2142;
						@Pc(2294) float local2294 = 1.0F / (local2280 * local2124 + local2271 * local1384 + local2263 * local1290);
						local1184 = (local2271 * local1650 + local1642 * local2263 + local1673 * local2280) * local2294;
						local1180 = (local2194 * local2271 + local2185 * local2263 + local1634 * local2280) * local2294;
						local1176 = local2294 * (local2168 * local2271 + local2263 * local2159 + local2280 * local2177);
						@Pc(2345) float local2345 = local2124 * local1696 - local1290 * local2254;
						@Pc(2354) float local2354 = local2254 * local1384 - local2124 * local1719;
						@Pc(2363) float local2363 = local1719 * local1290 - local1384 * local1696;
						@Pc(2377) float local2377 = 1.0F / (local2363 * local2150 + local2142 * local2345 + local2133 * local2354);
						local1186 = (local1642 * local2354 + local1650 * local2345 + local2363 * local1673) * local2377;
						local1182 = local2377 * (local2345 * local2194 + local2185 * local2354 + local2363 * local1634);
						local1178 = local2377 * (local2363 * local2177 + local2345 * local2168 + local2354 * local2159);
					} else {
						local1236 = arg1.aShortArray67[local1108];
						local1241 = arg1.aShortArray71[local1108];
						local1246 = arg1.aShortArray64[local1108];
						@Pc(1251) int local1251 = local770.anIntArray388[local806];
						@Pc(1256) int local1256 = local770.anIntArray387[local806];
						@Pc(1261) int local1261 = local770.anIntArray386[local806];
						@Pc(1266) float[] local1266 = local770.aFloatArrayArray12[local806];
						@Pc(1271) byte local1271 = arg1.aByteArray52[local806];
						local1279 = (float) arg1.anIntArray300[local806] / 256.0F;
						if (local1229 == 1) {
							local1290 = (float) arg1.anIntArray297[local806] / 1024.0F;
							Static205.method3371(arg1.anIntArray307[local1236], local1271, local1251, arg1.anIntArray302[local1236], local1266, local1256, Static332.aFloatArray46, local1290, arg1.anIntArray299[local1236], local1279, local1261);
							local1176 = Static332.aFloatArray46[0];
							local1178 = Static332.aFloatArray46[1];
							Static205.method3371(arg1.anIntArray307[local1241], local1271, local1251, arg1.anIntArray302[local1241], local1266, local1256, Static332.aFloatArray46, local1290, arg1.anIntArray299[local1241], local1279, local1261);
							local1182 = Static332.aFloatArray46[1];
							local1180 = Static332.aFloatArray46[0];
							Static205.method3371(arg1.anIntArray307[local1246], local1271, local1251, arg1.anIntArray302[local1246], local1266, local1256, Static332.aFloatArray46, local1290, arg1.anIntArray299[local1246], local1279, local1261);
							local1184 = Static332.aFloatArray46[0];
							local1186 = Static332.aFloatArray46[1];
							local1384 = local1290 / 2.0F;
							if ((local1271 & 0x1) == 0) {
								if (local1384 < local1180 - local1176) {
									local1188 = 1;
									local1180 -= local1290;
								} else if (local1176 - local1180 > local1384) {
									local1180 += local1290;
									local1188 = 2;
								}
								if (local1384 < local1184 - local1176) {
									local1184 -= local1290;
									local1190 = 1;
								} else if (local1176 - local1184 > local1384) {
									local1190 = 2;
									local1184 += local1290;
								}
							} else {
								if (local1384 < local1182 - local1178) {
									local1188 = 1;
									local1182 -= local1290;
								} else if (local1178 - local1182 > local1384) {
									local1182 += local1290;
									local1188 = 2;
								}
								if (local1186 - local1178 > local1384) {
									local1190 = 1;
									local1186 -= local1290;
								} else if (local1384 < local1178 - local1186) {
									local1190 = 2;
									local1186 += local1290;
								}
							}
						} else if (local1229 == 2) {
							local1290 = (float) arg1.anIntArray298[local806] / 256.0F;
							local1384 = (float) arg1.anIntArray301[local806] / 256.0F;
							@Pc(1546) int local1546 = arg1.anIntArray307[local1241] - arg1.anIntArray307[local1236];
							@Pc(1557) int local1557 = arg1.anIntArray299[local1241] - arg1.anIntArray299[local1236];
							@Pc(1568) int local1568 = arg1.anIntArray302[local1241] - arg1.anIntArray302[local1236];
							@Pc(1579) int local1579 = arg1.anIntArray307[local1246] - arg1.anIntArray307[local1236];
							@Pc(1590) int local1590 = arg1.anIntArray299[local1246] - arg1.anIntArray299[local1236];
							@Pc(1600) int local1600 = arg1.anIntArray302[local1246] - arg1.anIntArray302[local1236];
							@Pc(1608) int local1608 = local1600 * local1557 - local1568 * local1590;
							@Pc(1617) int local1617 = local1579 * local1568 - local1600 * local1546;
							@Pc(1626) int local1626 = local1590 * local1546 - local1579 * local1557;
							local1634 = 64.0F / (float) arg1.anIntArray304[local806];
							local1642 = 64.0F / (float) arg1.anIntArray306[local806];
							local1650 = 64.0F / (float) arg1.anIntArray297[local806];
							local1673 = (local1266[1] * (float) local1617 + local1266[0] * (float) local1608 + (float) local1626 * local1266[2]) / local1634;
							local1696 = ((float) local1608 * local1266[3] + local1266[4] * (float) local1617 + (float) local1626 * local1266[5]) / local1642;
							local1719 = ((float) local1608 * local1266[6] + (float) local1617 * local1266[7] + (float) local1626 * local1266[8]) / local1650;
							local1192 = Static414.method6093(local1696, local1719, local1673);
							Static261.method4254(local1261, local1256, local1251, arg1.anIntArray302[local1236], arg1.anIntArray299[local1236], local1290, Static332.aFloatArray46, arg1.anIntArray307[local1236], local1279, local1266, local1271, local1192, local1384);
							local1178 = Static332.aFloatArray46[1];
							local1176 = Static332.aFloatArray46[0];
							Static261.method4254(local1261, local1256, local1251, arg1.anIntArray302[local1241], arg1.anIntArray299[local1241], local1290, Static332.aFloatArray46, arg1.anIntArray307[local1241], local1279, local1266, local1271, local1192, local1384);
							local1182 = Static332.aFloatArray46[1];
							local1180 = Static332.aFloatArray46[0];
							Static261.method4254(local1261, local1256, local1251, arg1.anIntArray302[local1246], arg1.anIntArray299[local1246], local1290, Static332.aFloatArray46, arg1.anIntArray307[local1246], local1279, local1266, local1271, local1192, local1384);
							local1186 = Static332.aFloatArray46[1];
							local1184 = Static332.aFloatArray46[0];
						} else if (local1229 == 3) {
							Static370.method5513(local1251, arg1.anIntArray299[local1236], local1279, arg1.anIntArray307[local1236], local1266, local1261, local1271, local1256, arg1.anIntArray302[local1236], Static332.aFloatArray46);
							local1176 = Static332.aFloatArray46[0];
							local1178 = Static332.aFloatArray46[1];
							Static370.method5513(local1251, arg1.anIntArray299[local1241], local1279, arg1.anIntArray307[local1241], local1266, local1261, local1271, local1256, arg1.anIntArray302[local1241], Static332.aFloatArray46);
							local1182 = Static332.aFloatArray46[1];
							local1180 = Static332.aFloatArray46[0];
							Static370.method5513(local1251, arg1.anIntArray299[local1246], local1279, arg1.anIntArray307[local1246], local1266, local1261, local1271, local1256, arg1.anIntArray302[local1246], Static332.aFloatArray46);
							local1184 = Static332.aFloatArray46[0];
							local1186 = Static332.aFloatArray46[1];
							if ((local1271 & 0x1) == 0) {
								if (local1184 - local1176 > 0.5F) {
									local1184--;
									local1190 = 1;
								} else if (local1176 - local1184 > 0.5F) {
									local1184++;
									local1190 = 2;
								}
								if (local1180 - local1176 > 0.5F) {
									local1188 = 1;
									local1180--;
								} else if (local1176 - local1180 > 0.5F) {
									local1180++;
									local1188 = 2;
								}
							} else {
								if (local1186 - local1178 > 0.5F) {
									local1186--;
									local1190 = 1;
								} else if (local1178 - local1186 > 0.5F) {
									local1190 = 2;
									local1186++;
								}
								if (local1182 - local1178 > 0.5F) {
									local1182--;
									local1188 = 1;
								} else if (local1178 - local1182 > 0.5F) {
									local1182++;
									local1188 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray50 == null) {
				local1229 = 0;
			} else {
				local1229 = arg1.aByteArray50[local1108];
			}
			if (local1229 == 0) {
				@Pc(2453) long local2453 = ((long) local816 + (long) (local1192 << 24) + (long) (local1115 << 8) << 32) + (long) (local806 << 2);
				local1246 = arg1.aShortArray67[local1108];
				local2069 = arg1.aShortArray71[local1108];
				local2074 = arg1.aShortArray64[local1108];
				@Pc(2472) Class130 local2472 = local466[local1246];
				this.aShortArray171[local186] = this.method8869(local2472.anInt3400, local2453, arg1, local1246, local1176, local2472.anInt3399, local2472.anInt3398, local2472.anInt3397, local186, local1178, (byte) 88);
				@Pc(2497) Class130 local2497 = local466[local2069];
				this.aShortArray165[local186] = this.method8869(local2497.anInt3400, (long) local1188 + local2453, arg1, local2069, local1180, local2497.anInt3399, local2497.anInt3398, local2497.anInt3397, local186, local1182, (byte) 107);
				@Pc(2525) Class130 local2525 = local466[local2074];
				this.aShortArray163[local186] = this.method8869(local2525.anInt3400, (long) local1190 + local2453, arg1, local2074, local1184, local2525.anInt3399, local2525.anInt3398, local2525.anInt3397, local186, local1186, (byte) 94);
			} else if (local1229 == 1) {
				@Pc(2560) Class47 local2560 = local774[local1108];
				@Pc(2607) long local2607 = (long) ((local2560.anInt932 + 256 << 22) + (local2560.anInt927 <= 0 ? 2048 : 1024) + (local806 << 2) + (local2560.anInt928 + 256 << 12)) + ((long) (local1115 << 8) + (long) (local1192 << 24) + (long) local816 << 32);
				this.aShortArray171[local186] = this.method8869(local2560.anInt932, local2607, arg1, arg1.aShortArray67[local1108], local1176, local2560.anInt928, 0, local2560.anInt927, local186, local1178, (byte) 102);
				this.aShortArray165[local186] = this.method8869(local2560.anInt932, local2607 + (long) local1188, arg1, arg1.aShortArray71[local1108], local1180, local2560.anInt928, 0, local2560.anInt927, local186, local1182, (byte) 65);
				this.aShortArray163[local186] = this.method8869(local2560.anInt932, local2607 + (long) local1190, arg1, arg1.aShortArray64[local1108], local1184, local2560.anInt928, 0, local2560.anInt927, local186, local1186, (byte) 98);
			}
			if (arg1.aByteArray55 != null) {
				this.aByteArray108[local186] = arg1.aByteArray55[local1108];
			}
			if (arg1.aShortArray70 != null) {
				this.aShortArray170[local186] = arg1.aShortArray70[local1108];
			}
			this.aShortArray161[local186] = arg1.aShortArray68[local1108];
			this.aShortArray167[local186] = local1152;
		}
		if (this.anInt10473 > 0) {
			local1108 = 1;
			local795 = this.aShortArray167[0];
			for (local806 = 0; local806 < this.anInt10473; local806++) {
				@Pc(2753) short local2753 = this.aShortArray167[local806];
				if (local2753 != local795) {
					local795 = local2753;
					local1108++;
				}
			}
			this.anIntArray598 = new int[local1108];
			this.anIntArray591 = new int[local1108 + 1];
			this.anIntArray599 = new int[local1108];
			this.anIntArray591[0] = 0;
			local816 = this.anInt10440;
			local1152 = 0;
			local1108 = 0;
			local795 = this.aShortArray167[0];
			for (local837 = 0; local837 < this.anInt10473; local837++) {
				@Pc(2812) short local2812 = this.aShortArray167[local837];
				if (local2812 != local795) {
					this.anIntArray598[local1108] = local816;
					this.anIntArray599[local1108] = local1152 + 1 - local816;
					local1108++;
					this.anIntArray591[local1108] = local837;
					local816 = this.anInt10440;
					local795 = local2812;
					local1152 = 0;
				}
				@Pc(2852) short local2852 = this.aShortArray171[local837];
				if (local816 > local2852) {
					local816 = local2852;
				}
				if (local1152 < local2852) {
					local1152 = local2852;
				}
				local2852 = this.aShortArray165[local837];
				if (local2852 > local1152) {
					local1152 = local2852;
				}
				if (local2852 < local816) {
					local816 = local2852;
				}
				local2852 = this.aShortArray163[local837];
				if (local2852 < local816) {
					local816 = local2852;
				}
				if (local2852 > local1152) {
					local1152 = local2852;
				}
			}
			this.anIntArray598[local1108] = local816;
			this.anIntArray599[local1108] = local1152 + 1 - local816;
			local1108++;
			this.anIntArray591[local1108] = this.anInt10473;
		}
		Static140.aLongArray10 = null;
		this.aShortArray168 = Static533.method7628(this.anInt10440, this.aShortArray168);
		this.aShortArray169 = Static533.method7628(this.anInt10440, this.aShortArray169);
		this.aShortArray172 = Static533.method7628(this.anInt10440, this.aShortArray172);
		this.aShortArray164 = Static533.method7628(this.anInt10440, this.aShortArray164);
		this.aShortArray166 = Static533.method7628(this.anInt10440, this.aShortArray166);
		this.aByteArray107 = Static511.method8340(this.anInt10440, this.aByteArray107);
		this.lb = Static144.method2623(this.lb, this.anInt10440);
		this.aFloatArray77 = Static144.method2623(this.aFloatArray77, this.anInt10440);
		if (arg1.anIntArray305 != null && Static456.method6428(this.anInt10471, arg2)) {
			this.anIntArrayArray64 = arg1.method4606(false, 0);
		}
		if (arg1.aClass129Array1 != null && Static356.method5224(arg2, this.anInt10471)) {
			this.anIntArrayArray66 = arg1.method4603();
		}
		if (arg1.anIntArray303 != null && Static228.method3610(this.anInt10471, arg2)) {
			local1108 = 0;
			@Pc(3058) int[] local3058 = new int[256];
			for (local806 = 0; local806 < this.anInt10436; local806++) {
				local816 = arg1.anIntArray303[local15[local806]];
				if (local816 >= 0) {
					@Pc(3075) int local3075 = local3058[local816]++;
					if (local816 > local1108) {
						local1108 = local816;
					}
				}
			}
			this.anIntArrayArray65 = new int[local1108 + 1][];
			for (local816 = 0; local816 <= local1108; local816++) {
				this.anIntArrayArray65[local816] = new int[local3058[local816]];
				local3058[local816] = 0;
			}
			for (local826 = 0; local826 < this.anInt10436; local826++) {
				local837 = arg1.anIntArray303[local15[local826]];
				if (local837 >= 0) {
					this.anIntArrayArray65[local837][local3058[local837]++] = local826;
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Lclient!gca;IIZZ)V")
	public Class43_Sub3(@OriginalArg(0) Class100_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt10436 = 0;
		this.aBoolean751 = false;
		this.anInt10440 = 0;
		this.anInt10473 = 0;
		this.aBoolean752 = false;
		this.aBoolean753 = false;
		this.anInt10490 = 0;
		this.aBoolean750 = true;
		this.aBoolean754 = false;
		this.anInt10512 = 0;
		this.anInt10483 = arg1;
		this.anInt10471 = arg2;
		this.aBoolean751 = arg4;
		this.aClass100_Sub1_21 = arg0;
		if (arg3 || Static306.method4764(this.anInt10471, this.anInt10483)) {
			this.aClass71_2 = new Class71(Static90.method1399(this.anInt10471, this.anInt10483));
		}
		if (arg3 || Static81.method1329(this.anInt10471, this.anInt10483)) {
			this.aClass71_1 = new Class71(Static497.method6942(this.anInt10483, this.anInt10471));
		}
		if (arg3 || Static414.method6096(this.anInt10471, this.anInt10483)) {
			this.aClass71_4 = new Class71(Static223.method3547(this.anInt10483, this.anInt10471));
		}
		if (arg3 || Static407.method5958(this.anInt10471, this.anInt10483)) {
			this.aClass71_3 = new Class71(Static273.method4462(this.anInt10483, this.anInt10471));
		}
		if (arg3 || Static388.method5740(this.anInt10483, this.anInt10471)) {
			this.aClass345_1 = new Class345(Static628.method8567(this.anInt10483, this.anInt10471));
		}
	}

	@OriginalMember(owner = "client!vm", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort120;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "()[Lclient!ok;")
	@Override
	public Class270[] method8863() {
		return this.aClass270Array5;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBIIIIIII)Z")
	private boolean method8865(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < arg4 && arg0 < arg7 && arg6 > arg0) {
			return false;
		} else if (arg0 > arg4 && arg0 > arg7 && arg0 > arg6) {
			return false;
		} else if (arg5 < arg3 && arg5 < arg2 && arg1 > arg5) {
			return false;
		} else {
			return arg5 <= arg3 || arg2 >= arg5 || arg1 >= arg5;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!sj;ZI)Z")
	@Override
	public boolean method8852(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method8870(arg0, arg4, arg1, arg3, arg2, -1);
	}

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "(I)V")
	private void method8866() {
		if (this.aClass71_4 != null) {
			this.aClass71_4.aBoolean123 = false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class84 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean753) {
			this.method8878();
		}
		@Pc(18) int local18 = arg4 + this.anInt10513;
		@Pc(23) int local23 = this.anInt10446 + arg4;
		@Pc(29) int local29 = arg6 + this.anInt10439;
		@Pc(34) int local34 = arg6 + this.anInt10487;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local18 < 0 || local23 + arg2.anInt8881 >> arg2.anInt8885 >= arg2.anInt8883 || local29 < 0 || arg2.anInt8878 <= local34 + arg2.anInt8881 >> arg2.anInt8885)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local18 < 0 || arg3.anInt8881 + local23 >> arg3.anInt8885 >= arg3.anInt8883 || local29 < 0 || local34 + arg3.anInt8881 >> arg3.anInt8885 >= arg3.anInt8878) {
				return;
			}
		} else {
			local18 >>= arg2.anInt8885;
			local23 = arg2.anInt8881 + local23 - 1 >> arg2.anInt8885;
			local29 >>= arg2.anInt8885;
			local34 = arg2.anInt8881 + local34 - 1 >> arg2.anInt8885;
			if (arg2.method7620(local29, local18) == arg5 && arg5 == arg2.method7620(local29, local23) && arg5 == arg2.method7620(local34, local18) && arg2.method7620(local34, local23) == arg5) {
				return;
			}
		}
		@Pc(245) int local245;
		if (arg0 == 1) {
			for (local245 = 0; local245 < this.anInt10512; local245++) {
				this.anIntArray592[local245] = this.anIntArray592[local245] + arg2.method7625(this.anIntArray594[local245] + arg4, this.anIntArray593[local245] - -arg6) - arg5;
			}
		} else {
			@Pc(254) int local254;
			@Pc(265) int local265;
			if (arg0 == 2) {
				local245 = this.anInt10476;
				if (local245 == 0) {
					return;
				}
				for (local254 = 0; local254 < this.anInt10512; local254++) {
					local265 = (this.anIntArray592[local254] << 16) / local245;
					if (local265 < arg1) {
						this.anIntArray592[local254] += (arg1 - local265) * (-arg5 + arg2.method7625(this.anIntArray594[local254] + arg4, this.anIntArray593[local254] - -arg6)) / arg1;
					}
				}
			} else {
				@Pc(424) int local424;
				if (arg0 == 3) {
					local245 = (arg1 & 0xFF) * 4;
					local254 = (arg1 >> 8 & 0xFF) * 4;
					local265 = (arg1 >> 16 & 0xFF) << 6;
					local424 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local245 >> 1) < 0 || arg2.anInt8881 + arg4 + (local245 >> 1) >= arg2.anInt8883 << arg2.anInt8885 || arg6 - (local254 >> 1) < 0 || arg2.anInt8881 + (local254 >> 1) + arg6 >= arg2.anInt8878 << arg2.anInt8885) {
						return;
					}
					this.method8862(local424, local245, arg4, local265, arg5, arg6, local254, arg2);
				} else if (arg0 == 4) {
					local245 = this.anInt10482 - this.anInt10476;
					for (local254 = 0; local254 < this.anInt10512; local254++) {
						this.anIntArray592[local254] = local245 + this.anIntArray592[local254] + arg3.method7625(this.anIntArray594[local254] + arg4, this.anIntArray593[local254] - -arg6) - arg5;
					}
				} else if (arg0 == 5) {
					local245 = this.anInt10482 - this.anInt10476;
					for (local254 = 0; local254 < this.anInt10512; local254++) {
						local265 = this.anIntArray594[local254] + arg4;
						local424 = arg6 + this.anIntArray593[local254];
						@Pc(430) int local430 = arg2.method7625(local265, local424);
						@Pc(436) int local436 = arg3.method7625(local265, local424);
						@Pc(443) int local443 = local430 - local436 - arg1;
						this.anIntArray592[local254] = ((this.anIntArray592[local254] << 8) / local245 * local443 >> 8) + (local430 - arg5);
					}
				}
			}
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10439;
	}

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort120 = (short) arg0;
		this.method8866();
	}

	@OriginalMember(owner = "client!vm", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface7 local9 = this.aClass100_Sub1_21.anInterface7_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt10436; local11++) {
			if (arg0 == this.aShortArray167[local11]) {
				this.aShortArray167[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(50) Class44 local50 = local9.method7423(arg0 & 0xFFFF);
			local35 = local50.aByte17;
			local37 = local50.aByte22;
		}
		@Pc(58) byte local58 = 0;
		@Pc(60) byte local60 = 0;
		if (arg1 != -1) {
			@Pc(71) Class44 local71 = local9.method7423(arg1 & 0xFFFF);
			local58 = local71.aByte17;
			if (local71.aByte18 != 0 || local71.aByte20 != 0) {
				this.aBoolean752 = true;
			}
			local60 = local71.aByte22;
		}
		if (!(local35 != local58 | local37 != local60)) {
			return;
		}
		if (this.aClass19Array1 != null) {
			for (@Pc(116) int local116 = 0; local116 < this.anInt10447; local116++) {
				@Pc(123) Class19 local123 = this.aClass19Array1[local116];
				@Pc(128) Class252 local128 = this.aClass252Array1[local116];
				local128.anInt6637 = Static408.anIntArray407[this.aShortArray161[local123.anInt293] & 0xFFFF] & 0xFFFFFF | local128.anInt6637 & 0xFF000000;
			}
		}
		this.method8866();
	}

	@OriginalMember(owner = "client!vm", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10446;
	}

	@OriginalMember(owner = "client!vm", name = "l", descriptor = "(I)V")
	public void method8867() {
		if (this.aClass71_2 != null) {
			this.aClass71_2.method1371();
		}
		if (this.aClass71_1 != null) {
			this.aClass71_1.method1371();
		}
		if (this.aClass71_4 != null) {
			this.aClass71_4.method1371();
		}
		if (this.aClass71_3 != null) {
			this.aClass71_3.method1371();
		}
		if (this.aClass345_1 != null) {
			this.aClass345_1.method7686();
		}
	}

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "(I)V")
	private void method8868() {
		if (this.anInt10473 == 0) {
			return;
		}
		if (this.method8877() && this.method8884()) {
			this.aClass100_Sub1_21.method7868(this.aClass71_2.anInterface15_5, 0);
			this.aClass100_Sub1_21.method7868(this.aClass71_4.anInterface15_5, 1);
			this.aClass100_Sub1_21.method7868(this.aClass71_1.anInterface15_5, 2);
			@Pc(68) boolean local68;
			if ((this.anInt10471 & 0x37) == 0) {
				this.aClass100_Sub1_21.method7935(false);
				local68 = false;
				this.aClass100_Sub1_21.method7921(this.aClass100_Sub1_21.aClass124_23);
			} else {
				local68 = true;
				this.aClass100_Sub1_21.method7935(true);
				this.aClass100_Sub1_21.method7868(this.aClass71_3.anInterface15_5, 3);
				this.aClass100_Sub1_21.method7921(this.aClass100_Sub1_21.aClass124_19);
			}
			for (@Pc(108) int local108 = 0; local108 < this.anIntArray598.length; local108++) {
				@Pc(115) int local115 = this.anIntArray591[local108];
				@Pc(122) int local122 = this.anIntArray591[local108 + 1];
				@Pc(129) int local129 = this.aShortArray167[local115] & 0xFFFF;
				if (local129 == 65535) {
					local129 = -1;
				}
				this.aClass100_Sub1_21.method7971(true, local129, local68);
				this.aClass100_Sub1_21.method7948(this.anIntArray599[local108], this.anIntArray598[local108], local115 * 3, Static649.aClass187_6, this.aClass345_1.anInterface20_6, local122 - local115);
			}
		}
		this.method8880();
	}

	@OriginalMember(owner = "client!vm", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10512; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray592[local15] - local9 * this.anIntArray593[local15] >> 14;
			this.anIntArray593[local15] = this.anIntArray592[local15] * local9 + this.anIntArray593[local15] * local13 >> 14;
			this.anIntArray592[local15] = local34;
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10512; local7++) {
			if (arg0 != 0) {
				this.anIntArray594[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray592[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray593[local7] += arg2;
			}
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "()V")
	@Override
	public void method8864() {
		if (this.anInt10440 > 0 && this.anInt10473 > 0) {
			this.method8877();
			this.method8884();
			this.method8880();
		}
	}

	@OriginalMember(owner = "client!vm", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt10490; local3++) {
			this.anIntArray594[local3] = this.anIntArray594[local3] + 7 >> 4;
			this.anIntArray592[local3] = this.anIntArray592[local3] + 7 >> 4;
			this.anIntArray593[local3] = this.anIntArray593[local3] + 7 >> 4;
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(33) int local33;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			Static322.anInt5496 = 0;
			Static670.anInt6252 = 0;
			Static589.anInt9523 = 0;
			local33 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (local43 < this.anIntArrayArray64.length) {
					local53 = this.anIntArrayArray64[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						if (this.aShortArray162 == null || (arg6 & this.aShortArray162[local61]) != 0) {
							Static589.anInt9523 += this.anIntArray594[local61];
							Static670.anInt6252 += this.anIntArray592[local61];
							Static322.anInt5496 += this.anIntArray593[local61];
							local33++;
						}
					}
				}
			}
			if (local33 > 0) {
				Static322.anInt5496 = Static322.anInt5496 / local33 + arg4;
				Static407.aBoolean461 = true;
				Static589.anInt9523 = arg2 + Static589.anInt9523 / local33;
				Static670.anInt6252 = Static670.anInt6252 / local33 + arg3;
			} else {
				Static322.anInt5496 = arg4;
				Static589.anInt9523 = arg2;
				Static670.anInt6252 = arg3;
			}
			return;
		}
		@Pc(269) int[] local269;
		@Pc(271) int local271;
		if (arg0 == 1) {
			if (arg7 != null) {
				local33 = arg7[1] * arg3 + arg2 * arg7[0] + arg7[2] * arg4 + 8192 >> 14;
				local35 = arg7[4] * arg3 + arg2 * arg7[3] + arg7[5] * arg4 + 8192 >> 14;
				local43 = arg7[7] * arg3 + arg2 * arg7[6] + arg7[8] * arg4 + 8192 >> 14;
				arg4 = local43;
				arg2 = local33;
				arg3 = local35;
			}
			arg2 <<= 0x4;
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (local35 < this.anIntArrayArray64.length) {
					local269 = this.anIntArrayArray64[local35];
					for (local271 = 0; local271 < local269.length; local271++) {
						local55 = local269[local271];
						if (this.aShortArray162 == null || (this.aShortArray162[local55] & arg6) != 0) {
							this.anIntArray594[local55] += arg2;
							this.anIntArray592[local55] += arg3;
							this.anIntArray593[local55] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(406) int local406;
		@Pc(429) int local429;
		@Pc(455) int local455;
		@Pc(486) int local486;
		@Pc(490) int local490;
		@Pc(494) int local494;
		@Pc(498) int local498;
		@Pc(506) int local506;
		@Pc(514) int local514;
		@Pc(668) int local668;
		@Pc(693) int local693;
		@Pc(697) int local697;
		@Pc(706) int local706;
		@Pc(711) int local711;
		@Pc(715) int local715;
		@Pc(719) int local719;
		@Pc(721) int local721;
		@Pc(855) int[] local855;
		@Pc(857) int local857;
		@Pc(863) int local863;
		@Pc(867) int local867;
		@Pc(869) int local869;
		@Pc(1002) int local1002;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (this.anIntArrayArray64.length > local35) {
						local269 = this.anIntArrayArray64[local35];
						for (local271 = 0; local271 < local269.length; local271++) {
							local55 = local269[local271];
							if (this.aShortArray162 == null || (this.aShortArray162[local55] & arg6) != 0) {
								this.anIntArray594[local55] -= Static589.anInt9523;
								this.anIntArray592[local55] -= Static670.anInt6252;
								this.anIntArray593[local55] -= Static322.anInt5496;
								if (arg4 != 0) {
									local61 = Class42.anIntArray51[arg4];
									local406 = Class42.anIntArray52[arg4];
									local429 = this.anIntArray594[local55] * local406 + this.anIntArray592[local55] * local61 + 16383 >> 14;
									this.anIntArray592[local55] = this.anIntArray592[local55] * local406 + 16383 - local61 * this.anIntArray594[local55] >> 14;
									this.anIntArray594[local55] = local429;
								}
								if (arg2 != 0) {
									local61 = Class42.anIntArray51[arg2];
									local406 = Class42.anIntArray52[arg2];
									local429 = local406 * this.anIntArray592[local55] + 16383 - this.anIntArray593[local55] * local61 >> 14;
									this.anIntArray593[local55] = local61 * this.anIntArray592[local55] + this.anIntArray593[local55] * local406 + 16383 >> 14;
									this.anIntArray592[local55] = local429;
								}
								if (arg3 != 0) {
									local61 = Class42.anIntArray51[arg3];
									local406 = Class42.anIntArray52[arg3];
									local429 = local406 * this.anIntArray594[local55] + this.anIntArray593[local55] * local61 + 16383 >> 14;
									this.anIntArray593[local55] = local406 * this.anIntArray593[local55] + 16383 - this.anIntArray594[local55] * local61 >> 14;
									this.anIntArray594[local55] = local429;
								}
								this.anIntArray594[local55] += Static589.anInt9523;
								this.anIntArray592[local55] += Static670.anInt6252;
								this.anIntArray593[local55] += Static322.anInt5496;
							}
						}
					}
				}
				if (arg5) {
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray64.length > local43) {
							local53 = this.anIntArrayArray64[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray162 == null || (arg6 & this.aShortArray162[local61]) != 0) {
									local406 = this.anIntArray597[local61];
									local429 = this.anIntArray597[local61 + 1];
									for (local455 = local406; local455 < local429; local455++) {
										local486 = this.aShortArray160[local455] - 1;
										if (local486 == -1) {
											break;
										}
										if (arg4 != 0) {
											local490 = Class42.anIntArray51[arg4];
											local494 = Class42.anIntArray52[arg4];
											local498 = local490 * this.aShortArray164[local486] + this.aShortArray172[local486] * local494 + 16383 >> 14;
											this.aShortArray164[local486] = (short) (this.aShortArray164[local486] * local494 + 16383 - local490 * this.aShortArray172[local486] >> 14);
											this.aShortArray172[local486] = (short) local498;
										}
										if (arg2 != 0) {
											local490 = Class42.anIntArray51[arg2];
											local494 = Class42.anIntArray52[arg2];
											local498 = this.aShortArray164[local486] * local494 + 16383 - local490 * this.aShortArray166[local486] >> 14;
											this.aShortArray166[local486] = (short) (this.aShortArray164[local486] * local490 + this.aShortArray166[local486] * local494 + 16383 >> 14);
											this.aShortArray164[local486] = (short) local498;
										}
										if (arg3 != 0) {
											local490 = Class42.anIntArray51[arg3];
											local494 = Class42.anIntArray52[arg3];
											local498 = local494 * this.aShortArray172[local486] + this.aShortArray166[local486] * local490 + 16383 >> 14;
											this.aShortArray166[local486] = (short) (local494 * this.aShortArray166[local486] + 16383 - local490 * this.aShortArray172[local486] >> 14);
											this.aShortArray172[local486] = (short) local498;
										}
									}
								}
							}
						}
					}
					this.method8876();
				}
			} else {
				local33 = arg7[9] << 4;
				local35 = arg7[10] << 4;
				local43 = arg7[11] << 4;
				local271 = arg7[12] << 4;
				local55 = arg7[13] << 4;
				local61 = arg7[14] << 4;
				if (Static407.aBoolean461) {
					local406 = Static322.anInt5496 * arg7[6] + Static589.anInt9523 * arg7[0] + Static670.anInt6252 * arg7[3] + 8192 >> 14;
					local429 = arg7[4] * Static670.anInt6252 + arg7[1] * Static589.anInt9523 + Static322.anInt5496 * arg7[7] + 8192 >> 14;
					local429 += local55;
					local455 = Static589.anInt9523 * arg7[2] + Static670.anInt6252 * arg7[5] + arg7[8] * Static322.anInt5496 + 8192 >> 14;
					local406 += local271;
					Static670.anInt6252 = local429;
					local455 += local61;
					Static589.anInt9523 = local406;
					Static322.anInt5496 = local455;
					Static407.aBoolean461 = false;
				}
				@Pc(474) int[] local474 = new int[9];
				local429 = Class42.anIntArray52[arg2];
				local455 = Class42.anIntArray51[arg2];
				local486 = Class42.anIntArray52[arg3];
				local490 = Class42.anIntArray51[arg3];
				local494 = Class42.anIntArray52[arg4];
				local498 = Class42.anIntArray51[arg4];
				local506 = local455 * local494 + 8192 >> 14;
				local514 = local498 * local455 + 8192 >> 14;
				local474[2] = local429 * local490 + 8192 >> 14;
				local474[5] = -local455;
				local474[4] = local429 * local494 + 8192 >> 14;
				local474[3] = local429 * local498 + 8192 >> 14;
				local474[7] = local490 * local498 + local486 * local506 + 8192 >> 14;
				local474[1] = local490 * local506 + local498 * -local486 + 8192 >> 14;
				local474[8] = local429 * local486 + 8192 >> 14;
				local474[6] = local514 * local486 + local494 * -local490 + 8192 >> 14;
				local474[0] = local494 * local486 + local514 * local490 + 8192 >> 14;
				@Pc(643) int local643 = -Static322.anInt5496 * local474[2] + local474[1] * -Static670.anInt6252 + -Static589.anInt9523 * local474[0] + 8192 >> 14;
				local668 = local474[5] * -Static322.anInt5496 + local474[3] * -Static589.anInt9523 + local474[4] * -Static670.anInt6252 + 8192 >> 14;
				local693 = -Static322.anInt5496 * local474[8] + local474[6] * -Static589.anInt9523 + -Static670.anInt6252 * local474[7] + 8192 >> 14;
				local697 = local643 + Static589.anInt9523;
				@Pc(701) int local701 = Static670.anInt6252 + local668;
				local706 = local693 + Static322.anInt5496;
				@Pc(709) int[] local709 = new int[9];
				for (local711 = 0; local711 < 3; local711++) {
					for (local715 = 0; local715 < 3; local715++) {
						local719 = 0;
						for (local721 = 0; local721 < 3; local721++) {
							local719 += arg7[local715 * 3 + local721] * local474[local711 * 3 + local721];
						}
						local709[local715 + local711 * 3] = local719 + 8192 >> 14;
					}
				}
				local715 = local474[0] * local271 + local474[1] * local55 + local474[2] * local61 + 8192 >> 14;
				local719 = local55 * local474[4] + local271 * local474[3] + local61 * local474[5] + 8192 >> 14;
				local721 = local61 * local474[8] + local55 * local474[7] + local474[6] * local271 + 8192 >> 14;
				local719 += local701;
				local715 += local697;
				local721 += local706;
				local855 = new int[9];
				for (local857 = 0; local857 < 3; local857++) {
					for (local863 = 0; local863 < 3; local863++) {
						local867 = 0;
						for (local869 = 0; local869 < 3; local869++) {
							local867 += arg7[local869 + local857 * 3] * local709[local869 * 3 + local863];
						}
						local855[local863 + local857 * 3] = local867 + 8192 >> 14;
					}
				}
				local863 = arg7[2] * local721 + arg7[1] * local719 + arg7[0] * local715 + 8192 >> 14;
				local867 = local719 * arg7[4] + local715 * arg7[3] + arg7[5] * local721 + 8192 >> 14;
				local863 += local33;
				local867 += local35;
				local869 = local721 * arg7[8] + local719 * arg7[7] + arg7[6] * local715 + 8192 >> 14;
				local869 += local43;
				for (local1002 = 0; local1002 < local8; local1002++) {
					@Pc(1010) int local1010 = arg1[local1002];
					if (this.anIntArrayArray64.length > local1010) {
						@Pc(1020) int[] local1020 = this.anIntArrayArray64[local1010];
						for (@Pc(1022) int local1022 = 0; local1022 < local1020.length; local1022++) {
							@Pc(1028) int local1028 = local1020[local1022];
							if (this.aShortArray162 == null || (this.aShortArray162[local1028] & arg6) != 0) {
								@Pc(1072) int local1072 = local855[0] * this.anIntArray594[local1028] + this.anIntArray592[local1028] * local855[1] + local855[2] * this.anIntArray593[local1028] + 8192 >> 14;
								@Pc(1104) int local1104 = local855[5] * this.anIntArray593[local1028] + this.anIntArray594[local1028] * local855[3] + this.anIntArray592[local1028] * local855[4] + 8192 >> 14;
								@Pc(1108) int local1108 = local1104 + local867;
								@Pc(1139) int local1139 = local855[8] * this.anIntArray593[local1028] + local855[7] * this.anIntArray592[local1028] + local855[6] * this.anIntArray594[local1028] + 8192 >> 14;
								@Pc(1143) int local1143 = local1072 + local863;
								@Pc(1147) int local1147 = local1139 + local869;
								this.anIntArray594[local1028] = local1143;
								this.anIntArray592[local1028] = local1108;
								this.anIntArray593[local1028] = local1147;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2694) Class252 local2694;
			@Pc(2559) boolean local2559;
			@Pc(2689) Class19 local2689;
			if (arg0 == 5) {
				if (this.anIntArrayArray65 != null) {
					local2559 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray65.length > local43) {
							local53 = this.anIntArrayArray65[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray170 == null || (this.aShortArray170[local61] & arg6) != 0) {
									local406 = (this.aByteArray108[local61] & 0xFF) + (arg2 * 8);
									if (local406 < 0) {
										local406 = 0;
									} else if (local406 > 255) {
										local406 = 255;
									}
									this.aByteArray108[local61] = (byte) local406;
								}
							}
							local2559 |= local53.length > 0;
						}
					}
					if (local2559) {
						if (this.aClass19Array1 != null) {
							for (local43 = 0; local43 < this.anInt10447; local43++) {
								local2689 = this.aClass19Array1[local43];
								local2694 = this.aClass252Array1[local43];
								local2694.anInt6637 = 255 - (this.aByteArray108[local2689.anInt293] & 0xFF) << 24 | local2694.anInt6637 & 0xFFFFFF;
							}
						}
						this.method8866();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray65 != null) {
					local2559 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (local43 < this.anIntArrayArray65.length) {
							local53 = this.anIntArrayArray65[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								if (this.aShortArray170 == null || (this.aShortArray170[local61] & arg6) != 0) {
									local406 = this.aShortArray161[local61] & 0xFFFF;
									local429 = local406 >> 10 & 0x3F;
									local455 = local406 >> 7 & 0x7;
									local455 += arg3 / 4;
									local486 = local406 & 0x7F;
									@Pc(2818) int local2818 = local429 + arg2 & 0x3F;
									if (local455 < 0) {
										local455 = 0;
									} else if (local455 > 7) {
										local455 = 7;
									}
									local486 += arg4;
									if (local486 < 0) {
										local486 = 0;
									} else if (local486 > 127) {
										local486 = 127;
									}
									this.aShortArray161[local61] = (short) (local486 | local455 << 7 | local2818 << 10);
								}
							}
							local2559 |= local53.length > 0;
						}
					}
					if (local2559) {
						if (this.aClass19Array1 != null) {
							for (local43 = 0; local43 < this.anInt10447; local43++) {
								local2689 = this.aClass19Array1[local43];
								local2694 = this.aClass252Array1[local43];
								local2694.anInt6637 = local2694.anInt6637 & 0xFF000000 | Static408.anIntArray407[this.aShortArray161[local2689.anInt293] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method8866();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray66 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (local35 < this.anIntArrayArray66.length) {
							local269 = this.anIntArrayArray66[local35];
							for (local271 = 0; local271 < local269.length; local271++) {
								local2694 = this.aClass252Array1[local269[local271]];
								local2694.anInt6642 += arg2;
								local2694.anInt6635 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray66 != null) {
					for (local33 = 0; local33 < local8; local33++) {
						local35 = arg1[local33];
						if (this.anIntArrayArray66.length > local35) {
							local269 = this.anIntArrayArray66[local35];
							for (local271 = 0; local271 < local269.length; local271++) {
								local2694 = this.aClass252Array1[local269[local271]];
								local2694.anInt6639 = local2694.anInt6639 * arg3 >> 7;
								local2694.anInt6643 = arg2 * local2694.anInt6643 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray66 != null) {
				for (local33 = 0; local33 < local8; local33++) {
					local35 = arg1[local33];
					if (local35 < this.anIntArrayArray66.length) {
						local269 = this.anIntArrayArray66[local35];
						for (local271 = 0; local271 < local269.length; local271++) {
							local2694 = this.aClass252Array1[local269[local271]];
							local2694.anInt6638 = local2694.anInt6638 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local33 = 0; local33 < local8; local33++) {
				local35 = arg1[local33];
				if (this.anIntArrayArray64.length > local35) {
					local269 = this.anIntArrayArray64[local35];
					for (local271 = 0; local271 < local269.length; local271++) {
						local55 = local269[local271];
						if (this.aShortArray162 == null || (arg6 & this.aShortArray162[local55]) != 0) {
							this.anIntArray594[local55] -= Static589.anInt9523;
							this.anIntArray592[local55] -= Static670.anInt6252;
							this.anIntArray593[local55] -= Static322.anInt5496;
							this.anIntArray594[local55] = arg2 * this.anIntArray594[local55] >> 7;
							this.anIntArray592[local55] = this.anIntArray592[local55] * arg3 >> 7;
							this.anIntArray593[local55] = this.anIntArray593[local55] * arg4 >> 7;
							this.anIntArray594[local55] += Static589.anInt9523;
							this.anIntArray592[local55] += Static670.anInt6252;
							this.anIntArray593[local55] += Static322.anInt5496;
						}
					}
				}
			}
		} else {
			local33 = arg7[9] << 4;
			local35 = arg7[10] << 4;
			local43 = arg7[11] << 4;
			local271 = arg7[12] << 4;
			local55 = arg7[13] << 4;
			local61 = arg7[14] << 4;
			if (Static407.aBoolean461) {
				local406 = Static322.anInt5496 * arg7[6] + Static670.anInt6252 * arg7[3] + arg7[0] * Static589.anInt9523 + 8192 >> 14;
				local429 = arg7[4] * Static670.anInt6252 + arg7[1] * Static589.anInt9523 + arg7[7] * Static322.anInt5496 + 8192 >> 14;
				local429 += local55;
				local455 = arg7[5] * Static670.anInt6252 + Static589.anInt9523 * arg7[2] + Static322.anInt5496 * arg7[8] + 8192 >> 14;
				local406 += local271;
				local455 += local61;
				Static670.anInt6252 = local429;
				Static589.anInt9523 = local406;
				Static407.aBoolean461 = false;
				Static322.anInt5496 = local455;
			}
			local406 = arg2 << 15 >> 7;
			local429 = arg3 << 15 >> 7;
			local455 = arg4 << 15 >> 7;
			local486 = local406 * -Static589.anInt9523 + 8192 >> 14;
			local490 = -Static670.anInt6252 * local429 + 8192 >> 14;
			local494 = -Static322.anInt5496 * local455 + 8192 >> 14;
			local498 = Static589.anInt9523 + local486;
			local506 = Static670.anInt6252 + local490;
			local514 = local494 + Static322.anInt5496;
			@Pc(1925) int[] local1925 = new int[] { arg7[0] * local406 + 8192 >> 14, arg7[3] * local406 + 8192 >> 14, arg7[6] * local406 + 8192 >> 14, arg7[1] * local429 + 8192 >> 14, arg7[4] * local429 + 8192 >> 14, local429 * arg7[7] + 8192 >> 14, local455 * arg7[2] + 8192 >> 14, local455 * arg7[5] + 8192 >> 14, local455 * arg7[8] + 8192 >> 14 };
			local668 = local406 * local271 + 8192 >> 14;
			local693 = local429 * local55 + 8192 >> 14;
			local697 = local455 * local61 + 8192 >> 14;
			@Pc(2061) int local2061 = local693 + local506;
			@Pc(2065) int local2065 = local668 + local498;
			@Pc(2069) int local2069 = local697 + local514;
			@Pc(2072) int[] local2072 = new int[9];
			@Pc(2078) int local2078;
			for (local706 = 0; local706 < 3; local706++) {
				for (local2078 = 0; local2078 < 3; local2078++) {
					local711 = 0;
					for (local715 = 0; local715 < 3; local715++) {
						local711 += arg7[local706 * 3 + local715] * local1925[local715 * 3 + local2078];
					}
					local2072[local2078 + local706 * 3] = local711 + 8192 >> 14;
				}
			}
			local2078 = arg7[2] * local2069 + local2061 * arg7[1] + arg7[0] * local2065 + 8192 >> 14;
			local711 = local2065 * arg7[3] + local2061 * arg7[4] + local2069 * arg7[5] + 8192 >> 14;
			local2078 += local33;
			local715 = arg7[7] * local2061 + arg7[6] * local2065 + local2069 * arg7[8] + 8192 >> 14;
			local711 += local35;
			local715 += local43;
			for (local719 = 0; local719 < local8; local719++) {
				local721 = arg1[local719];
				if (this.anIntArrayArray64.length > local721) {
					local855 = this.anIntArrayArray64[local721];
					for (local857 = 0; local857 < local855.length; local857++) {
						local863 = local855[local857];
						if (this.aShortArray162 == null || (this.aShortArray162[local863] & arg6) != 0) {
							local867 = this.anIntArray594[local863] * local2072[0] + local2072[1] * this.anIntArray592[local863] + local2072[2] * this.anIntArray593[local863] + 8192 >> 14;
							local869 = this.anIntArray593[local863] * local2072[5] + this.anIntArray592[local863] * local2072[4] + this.anIntArray594[local863] * local2072[3] + 8192 >> 14;
							@Pc(2328) int local2328 = local869 + local711;
							@Pc(2332) int local2332 = local867 + local2078;
							local1002 = this.anIntArray594[local863] * local2072[6] + this.anIntArray592[local863] * local2072[7] + local2072[8] * this.anIntArray593[local863] + 8192 >> 14;
							this.anIntArray594[local863] = local2332;
							@Pc(2373) int local2373 = local1002 + local715;
							this.anIntArray592[local863] = local2328;
							this.anIntArray593[local863] = local2373;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub1_Sub15 ba(@OriginalArg(0) Class5_Sub1_Sub15 arg0) {
		if (this.anInt10440 == 0) {
			return null;
		}
		if (!this.aBoolean753) {
			this.method8878();
		}
		@Pc(43) int local43;
		@Pc(59) int local59;
		if (this.aClass100_Sub1_21.anInt9254 <= 0) {
			local43 = this.anInt10513 - (this.aClass100_Sub1_21.anInt9254 * this.anInt10476 >> 8) >> this.aClass100_Sub1_21.anInt9257;
			local59 = this.anInt10446 - (this.anInt10482 * this.aClass100_Sub1_21.anInt9254 >> 8) >> this.aClass100_Sub1_21.anInt9257;
		} else {
			local43 = this.anInt10513 - (this.anInt10482 * this.aClass100_Sub1_21.anInt9254 >> 8) >> this.aClass100_Sub1_21.anInt9257;
			local59 = this.anInt10446 - (this.anInt10476 * this.aClass100_Sub1_21.anInt9254 >> 8) >> this.aClass100_Sub1_21.anInt9257;
		}
		@Pc(118) int local118;
		@Pc(134) int local134;
		if (this.aClass100_Sub1_21.anInt9238 > 0) {
			local118 = this.anInt10439 - (this.anInt10482 * this.aClass100_Sub1_21.anInt9238 >> 8) >> this.aClass100_Sub1_21.anInt9257;
			local134 = this.anInt10487 - (this.anInt10476 * this.aClass100_Sub1_21.anInt9238 >> 8) >> this.aClass100_Sub1_21.anInt9257;
		} else {
			local118 = this.anInt10439 - (this.anInt10476 * this.aClass100_Sub1_21.anInt9238 >> 8) >> this.aClass100_Sub1_21.anInt9257;
			local134 = this.anInt10487 - (this.aClass100_Sub1_21.anInt9238 * this.anInt10482 >> 8) >> this.aClass100_Sub1_21.anInt9257;
		}
		@Pc(176) int local176 = local59 + 1 - local43;
		@Pc(182) int local182 = local134 + 1 - local118;
		@Pc(185) Class5_Sub1_Sub15_Sub2 local185 = (Class5_Sub1_Sub15_Sub2) arg0;
		@Pc(197) Class5_Sub1_Sub15_Sub2 local197;
		if (local185 != null && local185.method8296(local182, local176)) {
			local197 = local185;
			local185.method8297();
		} else {
			local197 = new Class5_Sub1_Sub15_Sub2(this.aClass100_Sub1_21, local176, local182);
		}
		local197.method8295(local43, local59, local118, local134);
		this.method8879(local197);
		return local197;
	}

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean752;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IJLclient!kc;IFIIIIFB)S")
	private short method8869(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class197 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) byte arg10) {
		@Pc(10) int local10 = this.anIntArray597[arg3];
		@Pc(17) int local17 = this.anIntArray597[arg3 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(30) short local30 = this.aShortArray160[local21];
			if (local30 == 0) {
				local19 = local21;
				break;
			}
			if (arg1 == Static140.aLongArray10[local21]) {
				return (short) (local30 - 1);
			}
		}
		this.aShortArray160[local19] = (short) (this.anInt10440 + 1);
		Static140.aLongArray10[local19] = arg1;
		this.aShortArray169[this.anInt10440] = (short) arg8;
		this.aShortArray168[this.anInt10440] = (short) arg3;
		this.aShortArray172[this.anInt10440] = (short) arg7;
		if (arg10 < 60) {
			this.anInt10440 = -84;
		}
		this.aShortArray164[this.anInt10440] = (short) arg5;
		this.aShortArray166[this.anInt10440] = (short) arg0;
		this.aByteArray107[this.anInt10440] = (byte) arg6;
		this.lb[this.anInt10440] = arg4;
		this.aFloatArray77[this.anInt10440] = arg9;
		return (short) this.anInt10440++;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(61) int local61;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(17) int local17;
		@Pc(43) int local43;
		@Pc(53) int[] local53;
		@Pc(55) int local55;
		if (arg0 == 0) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			Static322.anInt5496 = 0;
			Static670.anInt6252 = 0;
			local31 = 0;
			Static589.anInt9523 = 0;
			for (local35 = 0; local35 < local8; local35++) {
				local43 = arg1[local35];
				if (this.anIntArrayArray64.length > local43) {
					local53 = this.anIntArrayArray64[local43];
					for (local55 = 0; local55 < local53.length; local55++) {
						local61 = local53[local55];
						Static589.anInt9523 += this.anIntArray594[local61];
						Static670.anInt6252 += this.anIntArray592[local61];
						Static322.anInt5496 += this.anIntArray593[local61];
						local31++;
					}
				}
			}
			if (local31 <= 0) {
				Static589.anInt9523 = local21;
				Static322.anInt5496 = local17;
				Static670.anInt6252 = local25;
			} else {
				Static589.anInt9523 = Static589.anInt9523 / local31 + local21;
				Static322.anInt5496 = local17 + Static322.anInt5496 / local31;
				Static670.anInt6252 = local25 + Static670.anInt6252 / local31;
			}
			return;
		}
		@Pc(160) int[] local160;
		@Pc(162) int local162;
		if (arg0 == 1) {
			local17 = arg4 << 4;
			local21 = arg2 << 4;
			local25 = arg3 << 4;
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray64.length) {
					local160 = this.anIntArrayArray64[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local55 = local160[local162];
						this.anIntArray594[local55] += local21;
						this.anIntArray592[local55] += local25;
						this.anIntArray593[local55] += local17;
					}
				}
			}
			return;
		}
		@Pc(278) int local278;
		@Pc(296) int local296;
		@Pc(759) int local759;
		@Pc(768) int local768;
		if (arg0 == 2) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (local35 < this.anIntArrayArray64.length) {
					local160 = this.anIntArrayArray64[local35];
					if ((arg5 & 0x1) == 0) {
						for (local162 = 0; local162 < local160.length; local162++) {
							local55 = local160[local162];
							this.anIntArray594[local55] -= Static589.anInt9523;
							this.anIntArray592[local55] -= Static670.anInt6252;
							this.anIntArray593[local55] -= Static322.anInt5496;
							if (arg4 != 0) {
								local61 = Class42.anIntArray51[arg4];
								local278 = Class42.anIntArray52[arg4];
								local296 = this.anIntArray592[local55] * local61 + local278 * this.anIntArray594[local55] + 16383 >> 14;
								this.anIntArray592[local55] = this.anIntArray592[local55] * local278 + 16383 - local61 * this.anIntArray594[local55] >> 14;
								this.anIntArray594[local55] = local296;
							}
							if (arg2 != 0) {
								local61 = Class42.anIntArray51[arg2];
								local278 = Class42.anIntArray52[arg2];
								local296 = this.anIntArray592[local55] * local278 + 16383 - this.anIntArray593[local55] * local61 >> 14;
								this.anIntArray593[local55] = this.anIntArray592[local55] * local61 + this.anIntArray593[local55] * local278 + 16383 >> 14;
								this.anIntArray592[local55] = local296;
							}
							if (arg3 != 0) {
								local61 = Class42.anIntArray51[arg3];
								local278 = Class42.anIntArray52[arg3];
								local296 = local61 * this.anIntArray593[local55] + local278 * this.anIntArray594[local55] + 16383 >> 14;
								this.anIntArray593[local55] = this.anIntArray593[local55] * local278 + 16383 - this.anIntArray594[local55] * local61 >> 14;
								this.anIntArray594[local55] = local296;
							}
							this.anIntArray594[local55] += Static589.anInt9523;
							this.anIntArray592[local55] += Static670.anInt6252;
							this.anIntArray593[local55] += Static322.anInt5496;
						}
					} else {
						for (local162 = 0; local162 < local160.length; local162++) {
							local55 = local160[local162];
							this.anIntArray594[local55] -= Static589.anInt9523;
							this.anIntArray592[local55] -= Static670.anInt6252;
							this.anIntArray593[local55] -= Static322.anInt5496;
							if (arg2 != 0) {
								local61 = Class42.anIntArray51[arg2];
								local278 = Class42.anIntArray52[arg2];
								local296 = local278 * this.anIntArray592[local55] + 16383 - local61 * this.anIntArray593[local55] >> 14;
								this.anIntArray593[local55] = local61 * this.anIntArray592[local55] + local278 * this.anIntArray593[local55] + 16383 >> 14;
								this.anIntArray592[local55] = local296;
							}
							if (arg4 != 0) {
								local61 = Class42.anIntArray51[arg4];
								local278 = Class42.anIntArray52[arg4];
								local296 = this.anIntArray594[local55] * local278 + local61 * this.anIntArray592[local55] + 16383 >> 14;
								this.anIntArray592[local55] = this.anIntArray592[local55] * local278 + 16383 - this.anIntArray594[local55] * local61 >> 14;
								this.anIntArray594[local55] = local296;
							}
							if (arg3 != 0) {
								local61 = Class42.anIntArray51[arg3];
								local278 = Class42.anIntArray52[arg3];
								local296 = this.anIntArray593[local55] * local61 + local278 * this.anIntArray594[local55] + 16383 >> 14;
								this.anIntArray593[local55] = this.anIntArray593[local55] * local278 + 16383 - this.anIntArray594[local55] * local61 >> 14;
								this.anIntArray594[local55] = local296;
							}
							this.anIntArray594[local55] += Static589.anInt9523;
							this.anIntArray592[local55] += Static670.anInt6252;
							this.anIntArray593[local55] += Static322.anInt5496;
						}
					}
				}
			}
			if (arg6) {
				for (local35 = 0; local35 < local8; local35++) {
					local43 = arg1[local35];
					if (local43 < this.anIntArrayArray64.length) {
						local53 = this.anIntArrayArray64[local43];
						for (local55 = 0; local55 < local53.length; local55++) {
							local61 = local53[local55];
							local278 = this.anIntArray597[local61];
							local296 = this.anIntArray597[local61 + 1];
							for (local759 = local278; local759 < local296; local759++) {
								local768 = this.aShortArray160[local759] - 1;
								if (local768 == -1) {
									break;
								}
								@Pc(782) int local782;
								@Pc(786) int local786;
								@Pc(804) int local804;
								if (arg4 != 0) {
									local782 = Class42.anIntArray51[arg4];
									local786 = Class42.anIntArray52[arg4];
									local804 = local782 * this.aShortArray164[local768] + local786 * this.aShortArray172[local768] + 16383 >> 14;
									this.aShortArray164[local768] = (short) (this.aShortArray164[local768] * local786 + 16383 - local782 * this.aShortArray172[local768] >> 14);
									this.aShortArray172[local768] = (short) local804;
								}
								if (arg2 != 0) {
									local782 = Class42.anIntArray51[arg2];
									local786 = Class42.anIntArray52[arg2];
									local804 = this.aShortArray164[local768] * local786 + 16383 - local782 * this.aShortArray166[local768] >> 14;
									this.aShortArray166[local768] = (short) (this.aShortArray166[local768] * local786 + this.aShortArray164[local768] * local782 + 16383 >> 14);
									this.aShortArray164[local768] = (short) local804;
								}
								if (arg3 != 0) {
									local782 = Class42.anIntArray51[arg3];
									local786 = Class42.anIntArray52[arg3];
									local804 = this.aShortArray166[local768] * local782 + this.aShortArray172[local768] * local786 + 16383 >> 14;
									this.aShortArray166[local768] = (short) (local786 * this.aShortArray166[local768] + 16383 - this.aShortArray172[local768] * local782 >> 14);
									this.aShortArray172[local768] = (short) local804;
								}
							}
						}
					}
				}
				this.method8876();
			}
		} else if (arg0 == 3) {
			for (local31 = 0; local31 < local8; local31++) {
				local35 = arg1[local31];
				if (this.anIntArrayArray64.length > local35) {
					local160 = this.anIntArrayArray64[local35];
					for (local162 = 0; local162 < local160.length; local162++) {
						local55 = local160[local162];
						this.anIntArray594[local55] -= Static589.anInt9523;
						this.anIntArray592[local55] -= Static670.anInt6252;
						this.anIntArray593[local55] -= Static322.anInt5496;
						this.anIntArray594[local55] = this.anIntArray594[local55] * arg2 >> 7;
						this.anIntArray592[local55] = this.anIntArray592[local55] * arg3 >> 7;
						this.anIntArray593[local55] = arg4 * this.anIntArray593[local55] >> 7;
						this.anIntArray594[local55] += Static589.anInt9523;
						this.anIntArray592[local55] += Static670.anInt6252;
						this.anIntArray593[local55] += Static322.anInt5496;
					}
				}
			}
		} else {
			@Pc(1231) Class252 local1231;
			@Pc(1120) boolean local1120;
			@Pc(1226) Class19 local1226;
			if (arg0 == 5) {
				if (this.anIntArrayArray65 != null) {
					local1120 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray65.length > local43) {
							local53 = this.anIntArrayArray65[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local278 = (this.aByteArray108[local61] & 0xFF) + arg2 * 8;
								if (local278 < 0) {
									local278 = 0;
								} else if (local278 > 255) {
									local278 = 255;
								}
								this.aByteArray108[local61] = (byte) local278;
							}
							local1120 |= local53.length > 0;
						}
					}
					if (local1120) {
						if (this.aClass19Array1 != null) {
							for (local43 = 0; local43 < this.anInt10447; local43++) {
								local1226 = this.aClass19Array1[local43];
								local1231 = this.aClass252Array1[local43];
								local1231.anInt6637 = 255 - (this.aByteArray108[local1226.anInt293] & 0xFF) << 24 | local1231.anInt6637 & 0xFFFFFF;
							}
						}
						this.method8866();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray65 != null) {
					local1120 = false;
					for (local35 = 0; local35 < local8; local35++) {
						local43 = arg1[local35];
						if (this.anIntArrayArray65.length > local43) {
							local53 = this.anIntArrayArray65[local43];
							for (local55 = 0; local55 < local53.length; local55++) {
								local61 = local53[local55];
								local278 = this.aShortArray161[local61] & 0xFFFF;
								local296 = local278 >> 10 & 0x3F;
								local759 = local278 >> 7 & 0x7;
								local768 = local278 & 0x7F;
								@Pc(1335) int local1335 = arg2 + local296 & 0x3F;
								local759 += arg3 / 4;
								if (local759 < 0) {
									local759 = 0;
								} else if (local759 > 7) {
									local759 = 7;
								}
								local768 += arg4;
								if (local768 < 0) {
									local768 = 0;
								} else if (local768 > 127) {
									local768 = 127;
								}
								this.aShortArray161[local61] = (short) (local768 | local1335 << 10 | local759 << 7);
							}
							local1120 |= local53.length > 0;
						}
					}
					if (local1120) {
						if (this.aClass19Array1 != null) {
							for (local43 = 0; local43 < this.anInt10447; local43++) {
								local1226 = this.aClass19Array1[local43];
								local1231 = this.aClass252Array1[local43];
								local1231.anInt6637 = Static408.anIntArray407[this.aShortArray161[local1226.anInt293] & 0xFFFF] & 0xFFFFFF | local1231.anInt6637 & 0xFF000000;
							}
						}
						this.method8866();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray66 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray66.length) {
							local160 = this.anIntArrayArray66[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1231 = this.aClass252Array1[local160[local162]];
								local1231.anInt6635 += arg3;
								local1231.anInt6642 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray66 != null) {
					for (local31 = 0; local31 < local8; local31++) {
						local35 = arg1[local31];
						if (local35 < this.anIntArrayArray66.length) {
							local160 = this.anIntArrayArray66[local35];
							for (local162 = 0; local162 < local160.length; local162++) {
								local1231 = this.aClass252Array1[local160[local162]];
								local1231.anInt6639 = local1231.anInt6639 * arg3 >> 7;
								local1231.anInt6643 = local1231.anInt6643 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray66 != null) {
				for (local31 = 0; local31 < local8; local31++) {
					local35 = arg1[local31];
					if (local35 < this.anIntArrayArray66.length) {
						local160 = this.anIntArrayArray66[local35];
						for (local162 = 0; local162 < local160.length; local162++) {
							local1231 = this.aClass252Array1[local160[local162]];
							local1231.anInt6638 = local1231.anInt6638 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10503;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIZLclient!sj;IZ)Z")
	private boolean method8870(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) int arg5) {
		@Pc(8) Class10_Sub2 local8 = (Class10_Sub2) arg4;
		@Pc(12) Class10_Sub2 local12 = this.aClass100_Sub1_21.aClass10_Sub2_16;
		@Pc(33) float local33 = local12.aFloat54 * local8.aFloat49 + local8.aFloat55 * local12.aFloat45 + local8.aFloat53 * local12.aFloat50 + local12.aFloat49;
		@Pc(54) float local54 = local12.aFloat55 + local12.aFloat46 * local8.aFloat53 + local8.aFloat55 * local12.aFloat47 + local8.aFloat49 * local12.aFloat51;
		Static98.aFloat41 = local12.aFloat46 * local8.aFloat52 + local12.aFloat51 * local8.aFloat50 + local8.aFloat46 * local12.aFloat47;
		Static116.aFloat166 = local8.aFloat54 * local12.aFloat51 + local12.aFloat47 * local8.aFloat51 + local12.aFloat46 * local8.aFloat48;
		Static293.aFloat137 = local8.aFloat47 * local12.aFloat44 + local8.aFloat45 * local12.aFloat48 + local8.aFloat44 * local12.aFloat52;
		Static579.aFloat167 = local12.aFloat50 * local8.aFloat52 + local8.aFloat46 * local12.aFloat45 + local12.aFloat54 * local8.aFloat50;
		Static675.aFloat218 = local8.aFloat48 * local12.aFloat50 + local8.aFloat51 * local12.aFloat45 + local12.aFloat54 * local8.aFloat54;
		Static658.aFloat217 = local12.aFloat46 * local8.aFloat44 + local8.aFloat45 * local12.aFloat51 + local12.aFloat47 * local8.aFloat47;
		@Pc(183) float local183 = local12.aFloat53 + local8.aFloat55 * local12.aFloat44 + local8.aFloat49 * local12.aFloat48 + local8.aFloat53 * local12.aFloat52;
		Static676.aFloat219 = local8.aFloat54 * local12.aFloat48 + local8.aFloat51 * local12.aFloat44 + local12.aFloat52 * local8.aFloat48;
		Static652.aFloat216 = local12.aFloat50 * local8.aFloat44 + local8.aFloat47 * local12.aFloat45 + local12.aFloat54 * local8.aFloat45;
		Static638.aFloat211 = local8.aFloat52 * local12.aFloat52 + local12.aFloat48 * local8.aFloat50 + local8.aFloat46 * local12.aFloat44;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass100_Sub1_21.anInt9249;
		@Pc(255) int local255 = this.aClass100_Sub1_21.anInt9258;
		if (!this.aBoolean753) {
			this.method8878();
		}
		@Pc(272) int local272 = this.anInt10446 - this.anInt10513 >> 1;
		@Pc(281) int local281 = this.anInt10482 - this.anInt10476 >> 1;
		@Pc(290) int local290 = this.anInt10487 - this.anInt10439 >> 1;
		@Pc(295) int local295 = local272 + this.anInt10513;
		@Pc(300) int local300 = local281 + this.anInt10476;
		@Pc(305) int local305 = this.anInt10439 + local290;
		@Pc(312) int local312 = local295 - (local272 << arg1);
		@Pc(319) int local319 = local300 - (local281 << arg1);
		@Pc(326) int local326 = local305 - (local290 << arg1);
		@Pc(333) int local333 = local295 + (local272 << arg1);
		@Pc(339) int local339 = local300 + (local281 << arg1);
		Static660.anIntArray614[0] = local312;
		@Pc(350) int local350 = local305 + (local290 << arg1);
		Static304.anIntArray312[0] = local319;
		Static579.anIntArray521[0] = local326;
		Static660.anIntArray614[1] = local333;
		Static304.anIntArray312[1] = local319;
		Static579.anIntArray521[1] = local326;
		Static660.anIntArray614[2] = local312;
		Static304.anIntArray312[2] = local339;
		Static660.anIntArray614[3] = local333;
		Static579.anIntArray521[2] = local326;
		Static304.anIntArray312[3] = local339;
		Static579.anIntArray521[3] = local326;
		Static660.anIntArray614[4] = local312;
		Static304.anIntArray312[4] = local319;
		Static660.anIntArray614[5] = local333;
		Static579.anIntArray521[4] = local350;
		Static304.anIntArray312[5] = local319;
		Static579.anIntArray521[5] = local350;
		Static660.anIntArray614[6] = local312;
		Static304.anIntArray312[6] = local339;
		Static579.anIntArray521[6] = local350;
		Static660.anIntArray614[7] = local333;
		Static304.anIntArray312[7] = local339;
		Static579.anIntArray521[7] = local350;
		@Pc(505) float local505;
		@Pc(491) float local491;
		@Pc(477) float local477;
		@Pc(453) float local453;
		@Pc(458) float local458;
		@Pc(463) float local463;
		for (@Pc(444) int local444 = 0; local444 < 8; local444++) {
			local453 = (float) Static660.anIntArray614[local444];
			local458 = (float) Static304.anIntArray312[local444];
			local463 = (float) Static579.anIntArray521[local444];
			local477 = local183 + Static638.aFloat211 * local463 + Static676.aFloat219 * local453 + local458 * Static293.aFloat137;
			local491 = local453 * Static116.aFloat166 + local458 * Static658.aFloat217 + Static98.aFloat41 * local463 + local54;
			local505 = Static675.aFloat218 * local453 + Static652.aFloat216 * local458 + local463 * Static579.aFloat167 + local33;
			if ((float) this.aClass100_Sub1_21.anInt9231 <= local477) {
				if (arg5 > 0) {
					local477 = (float) arg5;
				}
				@Pc(534) float local534 = local505 * (float) local251 / local477 + (float) this.aClass100_Sub1_21.anInt9233;
				if (local241 > local534) {
					local241 = local534;
				}
				if (local243 < local534) {
					local243 = local534;
				}
				@Pc(558) float local558 = (float) this.aClass100_Sub1_21.anInt9246 + local491 * (float) local255 / local477;
				if (local558 < local245) {
					local245 = local558;
				}
				if (local558 > local247) {
					local247 = local558;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg2 > local245 && (float) arg2 < local247) {
			if (arg3) {
				return true;
			}
			if (Static433.anIntArray431.length < this.anInt10440) {
				Static433.anIntArray431 = new int[this.anInt10440];
				Static540.anIntArray493 = new int[this.anInt10440];
			}
			@Pc(732) int local732;
			for (@Pc(638) int local638 = 0; local638 < this.anInt10512; local638++) {
				local458 = (float) this.anIntArray592[local638];
				local453 = (float) this.anIntArray594[local638];
				local463 = (float) this.anIntArray593[local638];
				local505 = local33 + Static652.aFloat216 * local458 + local453 * Static675.aFloat218 + local463 * Static579.aFloat167;
				local477 = local453 * Static676.aFloat219 + local458 * Static293.aFloat137 + Static638.aFloat211 * local463 + local183;
				local491 = local54 + local463 * Static98.aFloat41 + local453 * Static116.aFloat166 + Static658.aFloat217 * local458;
				@Pc(745) int local745;
				@Pc(750) int local750;
				@Pc(757) int local757;
				if (local477 >= (float) this.aClass100_Sub1_21.anInt9231) {
					if (arg5 > 0) {
						local477 = (float) arg5;
					}
					local732 = (int) ((float) this.aClass100_Sub1_21.anInt9233 + (float) local251 * local505 / local477);
					local745 = (int) ((float) local255 * local491 / local477 + (float) this.aClass100_Sub1_21.anInt9246);
					local750 = this.anIntArray597[local638];
					local757 = this.anIntArray597[local638 + 1];
					for (@Pc(759) int local759 = local750; local759 < local757; local759++) {
						@Pc(768) int local768 = this.aShortArray160[local759] - 1;
						if (local768 == -1) {
							break;
						}
						Static433.anIntArray431[local768] = local732;
						Static540.anIntArray493[local768] = local745;
					}
				} else {
					local732 = this.anIntArray597[local638];
					local745 = this.anIntArray597[local638 + 1];
					for (local750 = local732; local750 < local745; local750++) {
						local757 = this.aShortArray160[local750] - 1;
						if (local757 == -1) {
							break;
						}
						Static433.anIntArray431[this.aShortArray160[local750] - 1] = -999999;
					}
				}
			}
			for (local732 = 0; local732 < this.anInt10436; local732++) {
				if (Static433.anIntArray431[this.aShortArray171[local732]] != -999999 && Static433.anIntArray431[this.aShortArray165[local732]] != -999999 && Static433.anIntArray431[this.aShortArray163[local732]] != -999999 && this.method8865(arg2, Static433.anIntArray431[this.aShortArray163[local732]], Static433.anIntArray431[this.aShortArray165[local732]], Static433.anIntArray431[this.aShortArray171[local732]], Static540.anIntArray493[this.aShortArray171[local732]], arg0, Static540.anIntArray493[this.aShortArray163[local732]], Static540.anIntArray493[this.aShortArray165[local732]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
	private void method8871() {
		if (this.aClass345_1 != null) {
			this.aClass345_1.aBoolean594 = false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "f", descriptor = "()[Lclient!ui;")
	@Override
	public Class363[] method8853() {
		return this.aClass363Array5;
	}

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10487;
	}

	@OriginalMember(owner = "client!vm", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10436; local7++) {
			if (this.aShortArray161[local7] == arg0) {
				this.aShortArray161[local7] = arg1;
			}
		}
		if (this.aClass19Array1 != null) {
			for (@Pc(42) int local42 = 0; local42 < this.anInt10447; local42++) {
				@Pc(49) Class19 local49 = this.aClass19Array1[local42];
				@Pc(54) Class252 local54 = this.aClass252Array1[local42];
				local54.anInt6637 = local54.anInt6637 & 0xFF000000 | Static408.anIntArray407[this.aShortArray161[local49.anInt293] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method8866();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8845(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) int local14;
		for (@Pc(3) int local3 = 0; local3 < this.anInt10436; local3++) {
			local14 = this.aShortArray161[local3] & 0xFFFF;
			@Pc(20) int local20 = local14 >> 10 & 0x3F;
			@Pc(26) int local26 = local14 >> 7 & 0x7;
			if (arg1 != -1) {
				local26 += (arg1 - local26) * arg3 >> 7;
			}
			@Pc(44) int local44 = local14 & 0x7F;
			if (arg0 != -1) {
				local20 -= -(arg3 * (arg0 - local20) >> 7);
			}
			if (arg2 != -1) {
				local44 -= -((arg2 - local44) * arg3 >> 7);
			}
			this.aShortArray161[local3] = (short) (local44 | local26 << 7 | local20 << 10);
		}
		Static642.anInt10461++;
		if (this.aClass19Array1 != null) {
			for (local14 = 0; local14 < this.anInt10447; local14++) {
				@Pc(113) Class19 local113 = this.aClass19Array1[local14];
				@Pc(118) Class252 local118 = this.aClass252Array1[local14];
				local118.anInt6637 = Static408.anIntArray407[this.aShortArray161[local113.anInt293] & 0xFFFF] & 0xFFFFFF | local118.anInt6637 & 0xFF000000;
			}
		}
		this.method8866();
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "()Z")
	@Override
	public boolean method8858() {
		if (this.aShortArray167 == null) {
			return true;
		}
		for (@Pc(13) int local13 = 0; local13 < this.aShortArray167.length; local13++) {
			if (this.aShortArray167[local13] != -1 && !this.aClass100_Sub1_21.anInterface7_12.method7421(this.aShortArray167[local13])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!vm;Lclient!vm;ZIZ)Lclient!ka;")
	private Class43 method8873(@OriginalArg(1) Class43_Sub3 arg0, @OriginalArg(2) Class43_Sub3 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4) {
		arg0.aShort121 = this.aShort121;
		arg0.anInt10471 = this.anInt10471;
		arg0.anInt10447 = this.anInt10447;
		arg0.aBoolean752 = this.aBoolean752;
		arg0.aShort120 = this.aShort120;
		arg0.anInt10490 = this.anInt10490;
		arg0.anInt10512 = this.anInt10512;
		arg0.anInt10440 = this.anInt10440;
		arg0.anInt10436 = this.anInt10436;
		arg0.anInt10483 = arg3;
		arg0.anInt10473 = this.anInt10473;
		if ((arg3 & 0x100) == 0) {
			arg0.aBoolean754 = this.aBoolean754;
		} else {
			arg0.aBoolean754 = true;
		}
		@Pc(71) boolean local71 = Static157.method2868(this.anInt10471, arg3);
		@Pc(77) boolean local77 = Static499.method6950(arg3, this.anInt10471);
		@Pc(83) boolean local83 = Static113.method3806(arg3, this.anInt10471);
		@Pc(89) boolean local89 = local77 | local71 | local83;
		@Pc(222) int local222;
		if (local89) {
			if (!local71) {
				arg0.anIntArray594 = this.anIntArray594;
			} else if (arg1.anIntArray594 == null || this.anInt10490 > arg1.anIntArray594.length) {
				arg0.anIntArray594 = arg1.anIntArray594 = new int[this.anInt10490];
			} else {
				arg0.anIntArray594 = arg1.anIntArray594;
			}
			if (!local77) {
				arg0.anIntArray592 = this.anIntArray592;
			} else if (arg1.anIntArray592 == null || arg1.anIntArray592.length < this.anInt10490) {
				arg0.anIntArray592 = arg1.anIntArray592 = new int[this.anInt10490];
			} else {
				arg0.anIntArray592 = arg1.anIntArray592;
			}
			if (!local83) {
				arg0.anIntArray593 = this.anIntArray593;
			} else if (arg1.anIntArray593 == null || arg1.anIntArray593.length < this.anInt10490) {
				arg0.anIntArray593 = arg1.anIntArray593 = new int[this.anInt10490];
			} else {
				arg0.anIntArray593 = arg1.anIntArray593;
			}
			for (local222 = 0; local222 < this.anInt10490; local222++) {
				if (local71) {
					arg0.anIntArray594[local222] = this.anIntArray594[local222];
				}
				if (local77) {
					arg0.anIntArray592[local222] = this.anIntArray592[local222];
				}
				if (local83) {
					arg0.anIntArray593[local222] = this.anIntArray593[local222];
				}
			}
		} else {
			arg0.anIntArray594 = this.anIntArray594;
			arg0.anIntArray593 = this.anIntArray593;
			arg0.anIntArray592 = this.anIntArray592;
		}
		if (Static90.method1399(this.anInt10471, arg3)) {
			arg0.aClass71_2 = arg1.aClass71_2;
			arg0.aClass71_2.aBoolean124 = true;
			arg0.aClass71_2.aBoolean123 = this.aClass71_2.aBoolean123;
			arg0.aClass71_2.anInterface15_5 = this.aClass71_2.anInterface15_5;
		} else if (Static306.method4764(this.anInt10471, arg3)) {
			arg0.aClass71_2 = this.aClass71_2;
		} else {
			arg0.aClass71_2 = null;
		}
		if (Static575.method7727(arg3, this.anInt10471)) {
			if (arg1.aShortArray161 == null || arg1.aShortArray161.length < this.anInt10436) {
				arg0.aShortArray161 = arg1.aShortArray161 = new short[this.anInt10436];
			} else {
				arg0.aShortArray161 = arg1.aShortArray161;
			}
			for (local222 = 0; local222 < this.anInt10436; local222++) {
				arg0.aShortArray161[local222] = this.aShortArray161[local222];
			}
		} else {
			arg0.aShortArray161 = this.aShortArray161;
		}
		if (Static207.method3390(this.anInt10471, arg3)) {
			if (arg1.aByteArray108 == null || this.anInt10436 > arg1.aByteArray108.length) {
				arg0.aByteArray108 = arg1.aByteArray108 = new byte[this.anInt10436];
			} else {
				arg0.aByteArray108 = arg1.aByteArray108;
			}
			for (local222 = 0; local222 < this.anInt10436; local222++) {
				arg0.aByteArray108[local222] = this.aByteArray108[local222];
			}
		} else {
			arg0.aByteArray108 = this.aByteArray108;
		}
		if (Static223.method3547(arg3, this.anInt10471)) {
			arg0.aClass71_4 = arg1.aClass71_4;
			arg0.aClass71_4.aBoolean124 = true;
			arg0.aClass71_4.anInterface15_5 = this.aClass71_4.anInterface15_5;
			arg0.aClass71_4.aBoolean123 = this.aClass71_4.aBoolean123;
		} else if (Static414.method6096(this.anInt10471, arg3)) {
			arg0.aClass71_4 = this.aClass71_4;
		} else {
			arg0.aClass71_4 = null;
		}
		@Pc(679) int local679;
		if (Static368.method5497(this.anInt10471, arg3)) {
			if (arg1.aShortArray172 == null || this.anInt10440 > arg1.aShortArray172.length) {
				local222 = this.anInt10440;
				arg0.aShortArray166 = arg1.aShortArray166 = new short[local222];
				arg0.aShortArray172 = arg1.aShortArray172 = new short[local222];
				arg0.aShortArray164 = arg1.aShortArray164 = new short[local222];
			} else {
				arg0.aShortArray166 = arg1.aShortArray166;
				arg0.aShortArray164 = arg1.aShortArray164;
				arg0.aShortArray172 = arg1.aShortArray172;
			}
			if (this.aClass184_1 == null) {
				arg0.aClass184_1 = null;
				for (local222 = 0; local222 < this.anInt10440; local222++) {
					arg0.aShortArray172[local222] = this.aShortArray172[local222];
					arg0.aShortArray164[local222] = this.aShortArray164[local222];
					arg0.aShortArray166[local222] = this.aShortArray166[local222];
				}
			} else {
				if (arg1.aClass184_1 == null) {
					arg1.aClass184_1 = new Class184();
				}
				@Pc(665) Class184 local665 = arg0.aClass184_1 = arg1.aClass184_1;
				if (local665.aShortArray58 == null || this.anInt10440 > local665.aShortArray58.length) {
					local679 = this.anInt10440;
					local665.aShortArray58 = new short[local679];
					local665.aShortArray59 = new short[local679];
					local665.aByteArray45 = new byte[local679];
					local665.aShortArray57 = new short[local679];
				}
				for (local679 = 0; local679 < this.anInt10440; local679++) {
					arg0.aShortArray172[local679] = this.aShortArray172[local679];
					arg0.aShortArray164[local679] = this.aShortArray164[local679];
					arg0.aShortArray166[local679] = this.aShortArray166[local679];
					local665.aShortArray58[local679] = this.aClass184_1.aShortArray58[local679];
					local665.aShortArray57[local679] = this.aClass184_1.aShortArray57[local679];
					local665.aShortArray59[local679] = this.aClass184_1.aShortArray59[local679];
					local665.aByteArray45[local679] = this.aClass184_1.aByteArray45[local679];
				}
			}
			arg0.aByteArray107 = this.aByteArray107;
		} else {
			arg0.aShortArray172 = this.aShortArray172;
			arg0.aShortArray164 = this.aShortArray164;
			arg0.aClass184_1 = this.aClass184_1;
			arg0.aShortArray166 = this.aShortArray166;
			arg0.aByteArray107 = this.aByteArray107;
		}
		if (Static273.method4462(arg3, this.anInt10471)) {
			arg0.aClass71_3 = arg1.aClass71_3;
			arg0.aClass71_3.anInterface15_5 = this.aClass71_3.anInterface15_5;
			arg0.aClass71_3.aBoolean124 = true;
			arg0.aClass71_3.aBoolean123 = this.aClass71_3.aBoolean123;
		} else if (Static407.method5958(this.anInt10471, arg3)) {
			arg0.aClass71_3 = this.aClass71_3;
		} else {
			arg0.aClass71_3 = null;
		}
		if (Static397.method5823(arg3, this.anInt10471)) {
			if (arg1.lb == null || this.anInt10436 > arg1.lb.length) {
				local222 = this.anInt10440;
				arg0.aFloatArray77 = arg1.aFloatArray77 = new float[local222];
				arg0.lb = arg1.lb = new float[local222];
			} else {
				arg0.lb = arg1.lb;
				arg0.aFloatArray77 = arg1.aFloatArray77;
			}
			for (local222 = 0; local222 < this.anInt10440; local222++) {
				arg0.lb[local222] = this.lb[local222];
				arg0.aFloatArray77[local222] = this.aFloatArray77[local222];
			}
		} else {
			arg0.lb = this.lb;
			arg0.aFloatArray77 = this.aFloatArray77;
		}
		if (Static497.method6942(arg3, this.anInt10471)) {
			arg0.aClass71_1 = arg1.aClass71_1;
			arg0.aClass71_1.aBoolean123 = this.aClass71_1.aBoolean123;
			arg0.aClass71_1.anInterface15_5 = this.aClass71_1.anInterface15_5;
			arg0.aClass71_1.aBoolean124 = true;
		} else if (Static81.method1329(this.anInt10471, arg3)) {
			arg0.aClass71_1 = this.aClass71_1;
		} else {
			arg0.aClass71_1 = null;
		}
		if (Static59.method3611(arg3, this.anInt10471)) {
			if (arg1.aShortArray171 == null || this.anInt10436 > arg1.aShortArray171.length) {
				local222 = this.anInt10436;
				arg0.aShortArray163 = arg1.aShortArray163 = new short[local222];
				arg0.aShortArray171 = arg1.aShortArray171 = new short[local222];
				arg0.aShortArray165 = arg1.aShortArray165 = new short[local222];
			} else {
				arg0.aShortArray163 = arg1.aShortArray163;
				arg0.aShortArray165 = arg1.aShortArray165;
				arg0.aShortArray171 = arg1.aShortArray171;
			}
			for (local222 = 0; local222 < this.anInt10436; local222++) {
				arg0.aShortArray171[local222] = this.aShortArray171[local222];
				arg0.aShortArray165[local222] = this.aShortArray165[local222];
				arg0.aShortArray163[local222] = this.aShortArray163[local222];
			}
		} else {
			arg0.aShortArray171 = this.aShortArray171;
			arg0.aShortArray165 = this.aShortArray165;
			arg0.aShortArray163 = this.aShortArray163;
		}
		if (Static628.method8567(arg3, this.anInt10471)) {
			arg0.aClass345_1 = arg1.aClass345_1;
			arg0.aClass345_1.anInterface20_6 = this.aClass345_1.anInterface20_6;
			arg0.aClass345_1.aBoolean595 = true;
			arg0.aClass345_1.aBoolean594 = this.aClass345_1.aBoolean594;
		} else if (Static388.method5740(arg3, this.anInt10471)) {
			arg0.aClass345_1 = this.aClass345_1;
		} else {
			arg0.aClass345_1 = null;
		}
		if (Static11.method151(arg3, this.anInt10471)) {
			if (arg1.aShortArray167 == null || arg1.aShortArray167.length < this.anInt10436) {
				local222 = this.anInt10436;
				arg0.aShortArray167 = arg1.aShortArray167 = new short[local222];
			} else {
				arg0.aShortArray167 = arg1.aShortArray167;
			}
			for (local222 = 0; local222 < this.anInt10436; local222++) {
				arg0.aShortArray167[local222] = this.aShortArray167[local222];
			}
		} else {
			arg0.aShortArray167 = this.aShortArray167;
		}
		if (!Static13.method204(arg3, this.anInt10471)) {
			arg0.aClass252Array1 = this.aClass252Array1;
		} else if (arg1.aClass252Array1 == null || this.anInt10447 > arg1.aClass252Array1.length) {
			local222 = this.anInt10447;
			arg0.aClass252Array1 = arg1.aClass252Array1 = new Class252[local222];
			for (local679 = 0; local679 < this.anInt10447; local679++) {
				arg0.aClass252Array1[local679] = this.aClass252Array1[local679].method5794();
			}
		} else {
			arg0.aClass252Array1 = arg1.aClass252Array1;
			for (local222 = 0; local222 < this.anInt10447; local222++) {
				arg0.aClass252Array1[local222].method5797(this.aClass252Array1[local222]);
			}
		}
		arg0.anIntArray591 = this.anIntArray591;
		arg0.anIntArrayArray65 = this.anIntArrayArray65;
		arg0.anIntArray598 = this.anIntArray598;
		arg0.aShortArray160 = this.aShortArray160;
		if (this.aBoolean753) {
			arg0.anInt10487 = this.anInt10487;
			arg0.anInt10439 = this.anInt10439;
			arg0.anInt10482 = this.anInt10482;
			arg0.anInt10513 = this.anInt10513;
			arg0.anInt10476 = this.anInt10476;
			arg0.anInt10503 = this.anInt10503;
			arg0.aBoolean753 = true;
			arg0.anInt10445 = this.anInt10445;
			arg0.anInt10446 = this.anInt10446;
		} else {
			arg0.aBoolean753 = false;
		}
		arg0.aClass270Array5 = this.aClass270Array5;
		arg0.aClass363Array5 = this.aClass363Array5;
		arg0.aShortArray170 = this.aShortArray170;
		arg0.aShortArray162 = this.aShortArray162;
		arg0.anIntArray597 = this.anIntArray597;
		arg0.aShortArray168 = this.aShortArray168;
		arg0.aShortArray169 = this.aShortArray169;
		arg0.anIntArrayArray64 = this.anIntArrayArray64;
		arg0.aClass19Array1 = this.aClass19Array1;
		arg0.anIntArray599 = this.anIntArray599;
		arg0.anIntArrayArray66 = this.anIntArrayArray66;
		return arg0;
	}

	@OriginalMember(owner = "client!vm", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10513;
	}

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean754;
	}

	@OriginalMember(owner = "client!vm", name = "m", descriptor = "(I)V")
	private void method8874() {
		if (this.aClass19Array1 == null) {
			return;
		}
		this.aClass100_Sub1_21.C(!this.aBoolean754);
		this.aClass100_Sub1_21.method7935(false);
		this.aClass100_Sub1_21.method7970(Static520.aClass93_4, 1);
		this.aClass100_Sub1_21.method7947(Static520.aClass93_4, 1);
		for (@Pc(46) int local46 = 0; local46 < this.anInt10447; local46++) {
			@Pc(55) Class19 local55 = this.aClass19Array1[local46];
			@Pc(60) Class252 local60 = this.aClass252Array1[local46];
			if (!local55.aBoolean16 || !this.aClass100_Sub1_21.method8656()) {
				@Pc(90) float local90 = (float) (this.anIntArray594[local55.anInt295] + this.anIntArray594[local55.anInt294] + this.anIntArray594[local55.anInt297]) * 0.3333333F;
				@Pc(111) float local111 = (float) (this.anIntArray592[local55.anInt295] + this.anIntArray592[local55.anInt297] + this.anIntArray592[local55.anInt294]) * 0.3333333F;
				@Pc(132) float local132 = (float) (this.anIntArray593[local55.anInt295] + this.anIntArray593[local55.anInt294] + this.anIntArray593[local55.anInt297]) * 0.3333333F;
				@Pc(146) float local146 = Static652.aFloat216 * local111 + Static675.aFloat218 * local90 + local132 * Static579.aFloat167 + Static539.aFloat165;
				@Pc(160) float local160 = local132 * Static98.aFloat41 + local90 * Static116.aFloat166 + local111 * Static658.aFloat217 + Static603.aFloat188;
				@Pc(174) float local174 = Static344.aFloat133 + Static293.aFloat137 * local111 + local90 * Static676.aFloat219 + local132 * Static638.aFloat211;
				@Pc(195) float local195 = (float) (1.0D / Math.sqrt((double) (local174 * local174 + local146 * local146 + local160 * local160))) * (float) local55.anInt296;
				@Pc(200) Class10_Sub2 local200 = this.aClass100_Sub1_21.method7956();
				local200.method1708(local55.aShort11 * local60.anInt6639 >> 7, local174 - local195 * local174, local160 + (float) local60.anInt6635 - local195 * local160, local60.anInt6638, local60.anInt6643 * local55.aShort10 >> 7, (float) local60.anInt6642 + local146 - local146 * local195);
				local200.method1696(this.aClass100_Sub1_21.aClass10_Sub2_17);
				this.aClass100_Sub1_21.method7992();
				@Pc(260) int local260 = local60.anInt6637;
				this.aClass100_Sub1_21.method7971(false, local55.aShort12, false);
				this.aClass100_Sub1_21.method7957(local55.aByte7);
				this.aClass100_Sub1_21.method7873(local260);
				this.aClass100_Sub1_21.method7972();
			}
		}
		this.aClass100_Sub1_21.method7947(Static237.aClass93_3, 1);
		this.aClass100_Sub1_21.method7970(Static237.aClass93_3, 1);
		this.aClass100_Sub1_21.C(true);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!sj;Lclient!rp;I)V")
	@Override
	public void method8849(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt10440 == 0) {
			return;
		}
		@Pc(17) Class10_Sub2 local17 = this.aClass100_Sub1_21.aClass10_Sub2_16;
		if (!this.aBoolean753) {
			this.method8878();
		}
		@Pc(28) Class10_Sub2 local28 = (Class10_Sub2) arg0;
		Static344.aFloat133 = local28.aFloat53 * local17.aFloat52 + local28.aFloat49 * local17.aFloat48 + local17.aFloat44 * local28.aFloat55 + local17.aFloat53;
		Static293.aFloat137 = local28.aFloat44 * local17.aFloat52 + local28.aFloat45 * local17.aFloat48 + local28.aFloat47 * local17.aFloat44;
		@Pc(75) float local75 = (float) this.anInt10476 * Static293.aFloat137 + Static344.aFloat133;
		@Pc(83) float local83 = (float) this.anInt10482 * Static293.aFloat137 + Static344.aFloat133;
		@Pc(93) float local93;
		@Pc(99) float local99;
		if (local83 < local75) {
			local93 = local83 - (float) this.anInt10503;
			local99 = local75 + (float) this.anInt10503;
		} else {
			local99 = (float) this.anInt10503 + local83;
			local93 = (float) -this.anInt10503 + local75;
		}
		if (this.aClass100_Sub1_21.aFloat171 <= local93 || (float) this.aClass100_Sub1_21.anInt9231 >= local99) {
			return;
		}
		Static652.aFloat216 = local28.aFloat44 * local17.aFloat50 + local17.aFloat45 * local28.aFloat47 + local17.aFloat54 * local28.aFloat45;
		Static539.aFloat165 = local28.aFloat53 * local17.aFloat50 + local17.aFloat45 * local28.aFloat55 + local28.aFloat49 * local17.aFloat54 + local17.aFloat49;
		@Pc(178) float local178 = Static652.aFloat216 * (float) this.anInt10476 + Static539.aFloat165;
		@Pc(186) float local186 = (float) this.anInt10482 * Static652.aFloat216 + Static539.aFloat165;
		@Pc(212) float local212;
		@Pc(201) float local201;
		if (local186 < local178) {
			local201 = (float) this.aClass100_Sub1_21.anInt9249 * (local178 + (float) this.anInt10503);
			local212 = (local186 - (float) this.anInt10503) * (float) this.aClass100_Sub1_21.anInt9249;
		} else {
			local201 = (float) this.aClass100_Sub1_21.anInt9249 * (local186 + (float) this.anInt10503);
			local212 = (local178 - (float) this.anInt10503) * (float) this.aClass100_Sub1_21.anInt9249;
		}
		if (local212 / local99 >= this.aClass100_Sub1_21.aFloat181 || this.aClass100_Sub1_21.aFloat180 >= local201 / local99) {
			return;
		}
		Static603.aFloat188 = local17.aFloat46 * local28.aFloat53 + local17.aFloat51 * local28.aFloat49 + local17.aFloat47 * local28.aFloat55 + local17.aFloat55;
		Static658.aFloat217 = local17.aFloat46 * local28.aFloat44 + local28.aFloat47 * local17.aFloat47 + local28.aFloat45 * local17.aFloat51;
		@Pc(303) float local303 = Static603.aFloat188 + (float) this.anInt10476 * Static658.aFloat217;
		@Pc(311) float local311 = Static658.aFloat217 * (float) this.anInt10482 + Static603.aFloat188;
		@Pc(338) float local338;
		@Pc(326) float local326;
		if (local303 > local311) {
			local338 = (float) this.aClass100_Sub1_21.anInt9258 * (local311 - (float) this.anInt10503);
			local326 = (float) this.aClass100_Sub1_21.anInt9258 * (local303 + (float) this.anInt10503);
		} else {
			local326 = (local311 + (float) this.anInt10503) * (float) this.aClass100_Sub1_21.anInt9258;
			local338 = ((float) -this.anInt10503 + local303) * (float) this.aClass100_Sub1_21.anInt9258;
		}
		if (this.aClass100_Sub1_21.aFloat182 <= local338 / local99 || this.aClass100_Sub1_21.aFloat172 >= local326 / local99) {
			return;
		}
		if (arg1 != null || this.aClass19Array1 != null) {
			Static579.aFloat167 = local17.aFloat54 * local28.aFloat50 + local28.aFloat46 * local17.aFloat45 + local28.aFloat52 * local17.aFloat50;
			Static638.aFloat211 = local28.aFloat50 * local17.aFloat48 + local28.aFloat46 * local17.aFloat44 + local17.aFloat52 * local28.aFloat52;
			Static98.aFloat41 = local17.aFloat51 * local28.aFloat50 + local17.aFloat47 * local28.aFloat46 + local28.aFloat52 * local17.aFloat46;
			Static675.aFloat218 = local28.aFloat54 * local17.aFloat54 + local17.aFloat45 * local28.aFloat51 + local17.aFloat50 * local28.aFloat48;
			Static676.aFloat219 = local17.aFloat44 * local28.aFloat51 + local17.aFloat48 * local28.aFloat54 + local17.aFloat52 * local28.aFloat48;
			Static116.aFloat166 = local28.aFloat51 * local17.aFloat47 + local28.aFloat54 * local17.aFloat51 + local28.aFloat48 * local17.aFloat46;
		}
		if (arg1 != null) {
			@Pc(503) boolean local503 = false;
			@Pc(505) boolean local505 = true;
			@Pc(513) int local513 = this.anInt10513 + this.anInt10446 >> 1;
			@Pc(521) int local521 = this.anInt10439 + this.anInt10487 >> 1;
			@Pc(540) int local540 = (int) ((float) local513 * Static675.aFloat218 + Static539.aFloat165 + (float) this.anInt10476 * Static652.aFloat216 + Static579.aFloat167 * (float) local521);
			@Pc(559) int local559 = (int) (Static98.aFloat41 * (float) local521 + Static603.aFloat188 + Static116.aFloat166 * (float) local513 + (float) this.anInt10476 * Static658.aFloat217);
			@Pc(578) int local578 = (int) ((float) local521 * Static638.aFloat211 + Static344.aFloat133 + (float) local513 * Static676.aFloat219 + (float) this.anInt10476 * Static293.aFloat137);
			if (local578 >= this.aClass100_Sub1_21.anInt9231) {
				arg1.anInt8408 = local540 * this.aClass100_Sub1_21.anInt9249 / local578 + this.aClass100_Sub1_21.anInt9233;
				arg1.anInt8405 = this.aClass100_Sub1_21.anInt9246 + this.aClass100_Sub1_21.anInt9258 * local559 / local578;
			} else {
				local503 = true;
			}
			@Pc(635) int local635 = (int) (Static652.aFloat216 * (float) this.anInt10482 + Static539.aFloat165 + (float) local513 * Static675.aFloat218 + (float) local521 * Static579.aFloat167);
			@Pc(654) int local654 = (int) (Static98.aFloat41 * (float) local521 + Static603.aFloat188 + (float) local513 * Static116.aFloat166 + (float) this.anInt10482 * Static658.aFloat217);
			@Pc(673) int local673 = (int) ((float) this.anInt10482 * Static293.aFloat137 + Static676.aFloat219 * (float) local513 + Static344.aFloat133 + Static638.aFloat211 * (float) local521);
			if (local673 >= this.aClass100_Sub1_21.anInt9231) {
				arg1.anInt8404 = this.aClass100_Sub1_21.anInt9258 * local654 / local673 + this.aClass100_Sub1_21.anInt9246;
				arg1.anInt8406 = this.aClass100_Sub1_21.anInt9249 * local635 / local673 + this.aClass100_Sub1_21.anInt9233;
			} else {
				local503 = true;
			}
			if (local503) {
				if (local578 < this.aClass100_Sub1_21.anInt9231 && this.aClass100_Sub1_21.anInt9231 > local673) {
					local505 = false;
				} else {
					@Pc(762) int local762;
					@Pc(774) int local774;
					@Pc(785) int local785;
					if (local578 < this.aClass100_Sub1_21.anInt9231) {
						local762 = (local673 - this.aClass100_Sub1_21.anInt9231 << 16) / (local673 - local578);
						local774 = local635 + (local762 * (local635 - local540) >> 16);
						local785 = local654 + (local762 * (local654 - local559) >> 16);
						arg1.anInt8408 = this.aClass100_Sub1_21.anInt9233 + this.aClass100_Sub1_21.anInt9249 * local774 / this.aClass100_Sub1_21.anInt9231;
						arg1.anInt8405 = this.aClass100_Sub1_21.anInt9258 * local785 / this.aClass100_Sub1_21.anInt9231 + this.aClass100_Sub1_21.anInt9246;
					} else if (local673 < this.aClass100_Sub1_21.anInt9231) {
						local762 = (local578 - this.aClass100_Sub1_21.anInt9231 << 16) / (local578 - local673);
						local774 = (local762 * (local540 - local635) >> 16) + local540;
						local785 = ((local559 - local654) * local762 >> 16) + local559;
						arg1.anInt8408 = this.aClass100_Sub1_21.anInt9233 + local774 * this.aClass100_Sub1_21.anInt9249 / this.aClass100_Sub1_21.anInt9231;
						arg1.anInt8405 = this.aClass100_Sub1_21.anInt9258 * local785 / this.aClass100_Sub1_21.anInt9231 + this.aClass100_Sub1_21.anInt9246;
					}
				}
			}
			if (local505) {
				if (local673 < local578) {
					arg1.anInt8407 = this.aClass100_Sub1_21.anInt9249 * (local540 + this.anInt10503) / local578 + this.aClass100_Sub1_21.anInt9233 - arg1.anInt8408;
				} else {
					arg1.anInt8407 = this.aClass100_Sub1_21.anInt9233 + this.aClass100_Sub1_21.anInt9249 * (local635 - -this.anInt10503) / local673 - arg1.anInt8406;
				}
				arg1.aBoolean558 = true;
			}
		}
		this.aClass100_Sub1_21.method7901();
		this.aClass100_Sub1_21.method7959(local28);
		this.method8868();
		this.method8874();
	}

	@OriginalMember(owner = "client!vm", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10445;
	}

	@OriginalMember(owner = "client!vm", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10512; local15++) {
			@Pc(35) int local35 = this.anIntArray592[local15] * local9 + local13 * this.anIntArray594[local15] >> 14;
			this.anIntArray592[local15] = this.anIntArray592[local15] * local13 - this.anIntArray594[local15] * local9 >> 14;
			this.anIntArray594[local15] = local35;
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10512; local15++) {
			@Pc(35) int local35 = this.anIntArray594[local15] * local13 + local9 * this.anIntArray593[local15] >> 14;
			this.anIntArray593[local15] = this.anIntArray593[local15] * local13 - this.anIntArray594[local15] * local9 >> 14;
			this.anIntArray594[local15] = local35;
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V")
	private void method8876() {
		if ((this.anInt10471 & 0x37) == 0) {
			if (this.aClass71_4 != null) {
				this.aClass71_4.aBoolean123 = false;
			}
		} else if (this.aClass71_3 != null) {
			this.aClass71_3.aBoolean123 = false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)Z")
	private boolean method8877() {
		@Pc(22) boolean local22 = !this.aClass71_4.aBoolean123;
		@Pc(41) boolean local41 = (this.anInt10471 & 0x37) != 0 && !this.aClass71_3.aBoolean123;
		@Pc(50) boolean local50 = !this.aClass71_2.aBoolean123;
		@Pc(59) boolean local59 = !this.aClass71_1.aBoolean123;
		if (!local50 && !local22 && !local41 && !local59) {
			return true;
		}
		@Pc(78) boolean local78 = true;
		@Pc(107) Interface15 local107;
		@Pc(121) Buffer local121;
		if (local50) {
			if (this.aShortArray168 == null) {
				return true;
			}
			if (this.aClass71_2.anInterface15_6 == null) {
				this.aClass71_2.anInterface15_6 = this.aClass100_Sub1_21.method7920(this.aBoolean751);
			}
			local107 = this.aClass71_2.anInterface15_6;
			local107.method5733(this.anInt10440 * 12, 12);
			local121 = local107.method5735();
			if (local121 == null) {
				local78 = false;
			} else {
				this.aClass100_Sub1_21.aNativeInterface3.copyPositions(this.anIntArray594, this.anIntArray592, this.anIntArray593, this.aShortArray168, 0, 12, this.anInt10440, local121.getAddress());
				if (local107.method5734()) {
					this.aClass71_2.anInterface15_5 = local107;
					this.aClass71_2.aBoolean123 = true;
				} else {
					local78 = false;
				}
			}
		}
		@Pc(253) short[] local253;
		@Pc(247) short[] local247;
		@Pc(250) short[] local250;
		@Pc(256) byte[] local256;
		if (local22) {
			if (this.aClass71_4.anInterface15_6 == null) {
				this.aClass71_4.anInterface15_6 = this.aClass100_Sub1_21.method7920(this.aBoolean751);
			}
			local107 = this.aClass71_4.anInterface15_6;
			local107.method5733(this.anInt10440 * 4, 4);
			local121 = local107.method5735();
			if (local121 == null) {
				local78 = false;
			} else {
				if ((this.anInt10471 & 0x37) == 0) {
					if (this.aClass184_1 == null) {
						local247 = this.aShortArray164;
						local250 = this.aShortArray166;
						local253 = this.aShortArray172;
						local256 = this.aByteArray107;
					} else {
						local247 = this.aClass184_1.aShortArray57;
						local256 = this.aClass184_1.aByteArray45;
						local250 = this.aClass184_1.aShortArray59;
						local253 = this.aClass184_1.aShortArray58;
					}
					this.aClass100_Sub1_21.aNativeInterface3.copyLighting(this.aShortArray161, this.aByteArray108, this.aShortArray167, local253, local247, local250, local256, this.aShort120, this.aShort121, this.aShortArray169, 0, 4, this.anInt10440, local121.getAddress());
				} else {
					this.aClass100_Sub1_21.aNativeInterface3.copyColours(this.aShortArray161, this.aByteArray108, this.aShortArray167, this.aShort120, this.aShortArray169, 0, 4, this.anInt10440, local121.getAddress());
				}
				if (local107.method5734()) {
					this.aClass71_4.anInterface15_5 = local107;
					this.aClass71_4.aBoolean123 = true;
				} else {
					local78 = false;
				}
			}
		}
		if (local41) {
			if (this.aClass71_3.anInterface15_6 == null) {
				this.aClass71_3.anInterface15_6 = this.aClass100_Sub1_21.method7920(this.aBoolean751);
			}
			local107 = this.aClass71_3.anInterface15_6;
			local107.method5733(this.anInt10440 * 12, 12);
			local121 = local107.method5735();
			if (local121 == null) {
				local78 = false;
			} else {
				if (this.aClass184_1 == null) {
					local253 = this.aShortArray172;
					local256 = this.aByteArray107;
					local250 = this.aShortArray166;
					local247 = this.aShortArray164;
				} else {
					local256 = this.aClass184_1.aByteArray45;
					local250 = this.aClass184_1.aShortArray59;
					local247 = this.aClass184_1.aShortArray57;
					local253 = this.aClass184_1.aShortArray58;
				}
				this.aClass100_Sub1_21.aNativeInterface3.copyNormals(local253, local247, local250, local256, 3.0F / (float) this.aShort121, 3.0F / (float) (this.aShort121 + this.aShort121 / 2), 0, 12, this.anInt10440, local121.getAddress());
				if (local107.method5734()) {
					this.aClass71_3.anInterface15_5 = local107;
					this.aClass71_3.aBoolean123 = true;
				} else {
					local78 = false;
				}
			}
		}
		if (local59) {
			if (this.aClass71_1.anInterface15_6 == null) {
				this.aClass71_1.anInterface15_6 = this.aClass100_Sub1_21.method7920(this.aBoolean751);
			}
			local107 = this.aClass71_1.anInterface15_6;
			local107.method5733(this.anInt10440 * 8, 8);
			local121 = local107.method5735();
			if (local121 == null) {
				local78 = false;
			} else {
				this.aClass100_Sub1_21.aNativeInterface3.copyTexCoords(this.lb, this.aFloatArray77, 0, 8, this.anInt10440, local121.getAddress());
				if (local107.method5734()) {
					this.aClass71_1.aBoolean123 = true;
					this.aClass71_1.anInterface15_5 = local107;
				} else {
					local78 = false;
				}
			}
		}
		return local78;
	}

	@OriginalMember(owner = "client!vm", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10512; local7++) {
			if (arg0 != 128) {
				this.anIntArray594[local7] = this.anIntArray594[local7] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray592[local7] = this.anIntArray592[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray593[local7] = this.anIntArray593[local7] * arg2 >> 7;
			}
		}
		this.method8883();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10482;
	}

	@OriginalMember(owner = "client!vm", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class42.anIntArray51[arg0];
		@Pc(13) int local13 = Class42.anIntArray52[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt10512; local15++) {
			local33 = local13 * this.anIntArray594[local15] + this.anIntArray593[local15] * local9 >> 14;
			this.anIntArray593[local15] = local13 * this.anIntArray593[local15] - this.anIntArray594[local15] * local9 >> 14;
			this.anIntArray594[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt10440; local33++) {
			@Pc(88) int local88 = this.aShortArray166[local33] * local9 + local13 * this.aShortArray172[local33] >> 14;
			this.aShortArray166[local33] = (short) (local13 * this.aShortArray166[local33] - this.aShortArray172[local33] * local9 >> 14);
			this.aShortArray172[local33] = (short) local88;
		}
		this.method8883();
		this.method8876();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort121;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	private void method8878() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt10512; local23++) {
			@Pc(32) int local32 = this.anIntArray594[local23];
			@Pc(37) int local37 = this.anIntArray592[local23];
			if (local9 > local37) {
				local9 = local37;
			}
			if (local13 < local32) {
				local13 = local32;
			}
			if (local15 < local37) {
				local15 = local37;
			}
			@Pc(61) int local61 = this.anIntArray593[local23];
			if (local32 < local7) {
				local7 = local32;
			}
			if (local17 < local61) {
				local17 = local61;
			}
			if (local11 > local61) {
				local11 = local61;
			}
			@Pc(85) int local85 = local32 * local32 + local61 * local61;
			if (local85 > local19) {
				local19 = local85;
			}
			local85 = local37 * local37 + local32 * local32 + local61 * local61;
			if (local85 > local21) {
				local21 = local85;
			}
		}
		this.anInt10513 = local7;
		if (-25 != -25) {
			this.method8877();
		}
		this.anInt10487 = local17;
		this.anInt10446 = local13;
		this.anInt10482 = local15;
		this.anInt10439 = local11;
		this.anInt10476 = local9;
		this.anInt10503 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt10445 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean753 = true;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class43 method8840(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(19) Class43_Sub3 local19;
		@Pc(23) Class43_Sub3 local23;
		if (arg0 == 1) {
			local19 = this.aClass100_Sub1_21.aClass43_Sub3_29;
			local23 = this.aClass100_Sub1_21.aClass43_Sub3_27;
		} else if (arg0 == 2) {
			local19 = this.aClass100_Sub1_21.aClass43_Sub3_24;
			local23 = this.aClass100_Sub1_21.aClass43_Sub3_21;
		} else if (arg0 == 3) {
			local23 = this.aClass100_Sub1_21.aClass43_Sub3_28;
			local19 = this.aClass100_Sub1_21.aClass43_Sub3_30;
		} else if (arg0 == 4) {
			local23 = this.aClass100_Sub1_21.aClass43_Sub3_23;
			local19 = this.aClass100_Sub1_21.aClass43_Sub3_22;
		} else if (arg0 == 5) {
			local19 = this.aClass100_Sub1_21.aClass43_Sub3_26;
			local23 = this.aClass100_Sub1_21.aClass43_Sub3_25;
		} else {
			local19 = local23 = new Class43_Sub3(this.aClass100_Sub1_21, 0, 0, true, false);
		}
		return this.method8873(local19, local23, arg2, arg1, arg0 != 0);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	@Override
	protected void method8843() {
	}

	@OriginalMember(owner = "client!vm", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass71_2 != null) {
			this.aClass71_2.aBoolean124 = Static90.method1399(this.anInt10471, arg0);
		}
		if (this.aClass71_1 != null) {
			this.aClass71_1.aBoolean124 = Static497.method6942(arg0, this.anInt10471);
		}
		if (this.aClass71_4 != null) {
			this.aClass71_4.aBoolean124 = Static223.method3547(arg0, this.anInt10471);
		}
		if (this.aClass71_3 != null) {
			this.aClass71_3.aBoolean124 = Static273.method4462(arg0, this.anInt10471);
		}
		this.anInt10483 = arg0;
		this.aBoolean750 = true;
		if (this.aClass184_1 != null && (this.anInt10483 & 0x10000) == 0) {
			this.aByteArray107 = this.aClass184_1.aByteArray45;
			this.aShortArray166 = this.aClass184_1.aShortArray59;
			this.aShortArray164 = this.aClass184_1.aShortArray57;
			this.aShortArray172 = this.aClass184_1.aShortArray58;
			this.aClass184_1 = null;
		}
		this.method8880();
	}

	@OriginalMember(owner = "client!vm", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean753) {
			this.method8878();
		}
		return this.anInt10476;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!uha;I)V")
	private void method8879(@OriginalArg(0) Class5_Sub1_Sub15_Sub2 arg0) {
		if (Static433.anIntArray431.length < this.anInt10440) {
			Static433.anIntArray431 = new int[this.anInt10440];
			Static540.anIntArray493 = new int[this.anInt10440];
		}
		@Pc(57) int local57;
		@Pc(96) int local96;
		@Pc(105) int local105;
		for (@Pc(31) int local31 = 0; local31 < this.anInt10512; local31++) {
			local57 = (this.anIntArray594[local31] - (this.aClass100_Sub1_21.anInt9254 * this.anIntArray592[local31] >> 8) >> this.aClass100_Sub1_21.anInt9257) - arg0.anInt9746;
			@Pc(82) int local82 = (this.anIntArray593[local31] - (this.aClass100_Sub1_21.anInt9238 * this.anIntArray592[local31] >> 8) >> this.aClass100_Sub1_21.anInt9257) - arg0.anInt9739;
			@Pc(87) int local87 = this.anIntArray597[local31];
			@Pc(94) int local94 = this.anIntArray597[local31 + 1];
			for (local96 = local87; local96 < local94; local96++) {
				local105 = this.aShortArray160[local96] - 1;
				if (local105 == -1) {
					break;
				}
				Static433.anIntArray431[local105] = local57;
				Static540.anIntArray493[local105] = local82;
			}
		}
		for (local57 = 0; local57 < this.anInt10473; local57++) {
			if (this.aByteArray108 == null || this.aByteArray108[local57] <= 128) {
				@Pc(163) short local163 = this.aShortArray171[local57];
				@Pc(168) short local168 = this.aShortArray165[local57];
				@Pc(173) short local173 = this.aShortArray163[local57];
				local96 = Static433.anIntArray431[local163];
				local105 = Static433.anIntArray431[local168];
				@Pc(185) int local185 = Static433.anIntArray431[local173];
				@Pc(189) int local189 = Static540.anIntArray493[local163];
				@Pc(193) int local193 = Static540.anIntArray493[local168];
				@Pc(197) int local197 = Static540.anIntArray493[local173];
				if (-((local185 - local105) * (local193 + -local189)) + (local96 - local105) * (-local197 + local193) > 0) {
					arg0.method8298(local197, local105, local193, local189, local96, local185);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IILclient!sj;ZII)Z")
	@Override
	public boolean method8844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class10 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method8870(arg0, arg4, arg1, arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(I)V")
	private void method8880() {
		if (!this.aBoolean750) {
			return;
		}
		this.aBoolean750 = false;
		if (this.aClass363Array5 == null && this.aClass270Array5 == null && this.aClass19Array1 == null && !Static22.method359(this.anInt10483, this.anInt10471)) {
			@Pc(37) boolean local37 = false;
			@Pc(39) boolean local39 = false;
			@Pc(41) boolean local41 = false;
			if (this.anIntArray594 != null && !Static111.method1656(this.anInt10483, this.anInt10471)) {
				if (this.aClass71_2 == null || this.aClass71_2.method1372()) {
					local37 = true;
					if (!this.aBoolean753) {
						this.method8878();
					}
				} else {
					this.aBoolean750 = true;
				}
			}
			if (this.anIntArray592 != null && !Static299.method4690(this.anInt10471, this.anInt10483)) {
				if (this.aClass71_2 == null || this.aClass71_2.method1372()) {
					local39 = true;
					if (!this.aBoolean753) {
						this.method8878();
					}
				} else {
					this.aBoolean750 = true;
				}
			}
			if (this.anIntArray593 != null && !Static485.method8978(this.anInt10483, this.anInt10471)) {
				if (this.aClass71_2 == null || this.aClass71_2.method1372()) {
					local41 = true;
					if (!this.aBoolean753) {
						this.method8878();
					}
				} else {
					this.aBoolean750 = true;
				}
			}
			if (local37) {
				this.anIntArray594 = null;
			}
			if (local39) {
				this.anIntArray592 = null;
			}
			if (local41) {
				this.anIntArray593 = null;
			}
		}
		if (this.aShortArray160 != null && this.anIntArray594 == null && this.anIntArray592 == null && this.anIntArray593 == null) {
			this.aShortArray160 = null;
			this.anIntArray597 = null;
		}
		if (this.aByteArray107 != null && !Static379.method5606(this.anInt10471, this.anInt10483)) {
			label203: {
				label202: {
					@Pc(251) boolean local251;
					if ((this.anInt10471 & 0x37) == 0) {
						if (this.aClass71_4 == null || this.aClass71_4.method1372()) {
							break label202;
						}
						local251 = false;
					} else {
						if (this.aClass71_3 == null || this.aClass71_3.method1372()) {
							break label202;
						}
						local251 = false;
					}
					if (!local251) {
						this.aBoolean750 = true;
						break label203;
					}
				}
				this.aByteArray107 = null;
				this.aShortArray172 = this.aShortArray164 = this.aShortArray166 = null;
			}
		}
		if (this.aShortArray161 != null && !Static276.method4997(this.anInt10471, this.anInt10483)) {
			if (this.aClass71_4 == null || this.aClass71_4.method1372()) {
				this.aShortArray161 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.aByteArray108 != null && !Static120.method1766(this.anInt10483, this.anInt10471)) {
			if (this.aClass71_4 == null || this.aClass71_4.method1372()) {
				this.aByteArray108 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.lb != null && !Static437.method6283(this.anInt10471, this.anInt10483)) {
			if (this.aClass71_1 == null || this.aClass71_1.method1372()) {
				this.lb = this.aFloatArray77 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.aShortArray167 != null && !Static627.method8559(this.anInt10471, this.anInt10483)) {
			if (this.aClass71_4 == null || this.aClass71_4.method1372()) {
				this.aShortArray167 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.aShortArray171 != null && !Static216.method1138(this.anInt10483, this.anInt10471)) {
			if ((this.aClass345_1 == null || this.aClass345_1.method7682()) && (this.aClass71_4 == null || this.aClass71_4.method1372())) {
				this.aShortArray171 = this.aShortArray165 = this.aShortArray163 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.aShortArray168 != null) {
			if (this.aClass71_2 == null || this.aClass71_2.method1372()) {
				this.aShortArray168 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.aShortArray169 != null) {
			if (this.aClass71_4 == null || this.aClass71_4.method1372()) {
				this.aShortArray169 = null;
			} else {
				this.aBoolean750 = true;
			}
		}
		if (this.anIntArrayArray65 != null && !Static228.method3610(this.anInt10471, this.anInt10483)) {
			this.anIntArrayArray65 = null;
			this.aShortArray170 = null;
		}
		if (this.anIntArrayArray64 != null && !Static456.method6428(this.anInt10471, this.anInt10483)) {
			this.aShortArray162 = null;
			this.anIntArrayArray64 = null;
		}
		if (this.anIntArrayArray66 != null && !Static356.method5224(this.anInt10483, this.anInt10471)) {
			this.anIntArrayArray66 = null;
		}
		if (this.anIntArray591 != null && (this.anInt10483 & 0x800) == 0 && (this.anInt10483 & 0x40000) == 0) {
			this.anIntArray591 = null;
			this.anIntArray598 = null;
			this.anIntArray599 = null;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!sj;IZ)V")
	@Override
	public void method8856(@OriginalArg(0) Class10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray162 == null) {
			return;
		}
		@Pc(13) int[] local13 = new int[3];
		for (@Pc(15) int local15 = 0; local15 < this.anInt10512; local15++) {
			if ((arg1 & this.aShortArray162[local15]) != 0) {
				if (arg2) {
					arg0.method4223(this.anIntArray594[local15], this.anIntArray592[local15], this.anIntArray593[local15], local13);
				} else {
					arg0.method4216(this.anIntArray594[local15], this.anIntArray592[local15], this.anIntArray593[local15], local13);
				}
				this.anIntArray594[local15] = local13[0];
				this.anIntArray592[local15] = local13[1];
				this.anIntArray593[local15] = local13[2];
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt10483;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!sj;)V")
	@Override
	public void method8847(@OriginalArg(0) Class10 arg0) {
		@Pc(8) Class10_Sub2 local8 = (Class10_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass363Array5 != null) {
			for (local13 = 0; local13 < this.aClass363Array5.length; local13++) {
				@Pc(20) Class363 local20 = this.aClass363Array5[local13];
				@Pc(22) Class363 local22 = local20;
				if (local20.aClass363_2 != null) {
					local22 = local20.aClass363_2;
				}
				local22.anInt9755 = (int) (local8.aFloat45 * (float) this.anIntArray592[local20.anInt9749] + local8.aFloat54 * (float) this.anIntArray594[local20.anInt9749] + (float) this.anIntArray593[local20.anInt9749] * local8.aFloat50 + local8.aFloat49);
				local22.anInt9751 = (int) (local8.aFloat55 + local8.aFloat47 * (float) this.anIntArray592[local20.anInt9749] + (float) this.anIntArray594[local20.anInt9749] * local8.aFloat51 + (float) this.anIntArray593[local20.anInt9749] * local8.aFloat46);
				local22.anInt9758 = (int) ((float) this.anIntArray592[local20.anInt9749] * local8.aFloat44 + local8.aFloat48 * (float) this.anIntArray594[local20.anInt9749] + (float) this.anIntArray593[local20.anInt9749] * local8.aFloat52 + local8.aFloat53);
				local22.anInt9762 = (int) ((float) this.anIntArray593[local20.anInt9754] * local8.aFloat50 + (float) this.anIntArray592[local20.anInt9754] * local8.aFloat45 + local8.aFloat54 * (float) this.anIntArray594[local20.anInt9754] + local8.aFloat49);
				local22.anInt9760 = (int) (local8.aFloat51 * (float) this.anIntArray594[local20.anInt9754] + local8.aFloat47 * (float) this.anIntArray592[local20.anInt9754] + local8.aFloat46 * (float) this.anIntArray593[local20.anInt9754] + local8.aFloat55);
				local22.anInt9748 = (int) (local8.aFloat53 + local8.aFloat44 * (float) this.anIntArray592[local20.anInt9754] + local8.aFloat48 * (float) this.anIntArray594[local20.anInt9754] + local8.aFloat52 * (float) this.anIntArray593[local20.anInt9754]);
				local22.anInt9750 = (int) (local8.aFloat50 * (float) this.anIntArray593[local20.anInt9753] + (float) this.anIntArray594[local20.anInt9753] * local8.aFloat54 + (float) this.anIntArray592[local20.anInt9753] * local8.aFloat45 + local8.aFloat49);
				local22.anInt9761 = (int) (local8.aFloat47 * (float) this.anIntArray592[local20.anInt9753] + (float) this.anIntArray594[local20.anInt9753] * local8.aFloat51 + local8.aFloat46 * (float) this.anIntArray593[local20.anInt9753] + local8.aFloat55);
				local22.anInt9759 = (int) (local8.aFloat53 + (float) this.anIntArray592[local20.anInt9753] * local8.aFloat44 + local8.aFloat48 * (float) this.anIntArray594[local20.anInt9753] + local8.aFloat52 * (float) this.anIntArray593[local20.anInt9753]);
			}
		}
		if (this.aClass270Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass270Array5.length; local13++) {
			@Pc(367) Class270 local367 = this.aClass270Array5[local13];
			@Pc(369) Class270 local369 = local367;
			if (local367.aClass270_2 != null) {
				local369 = local367.aClass270_2;
			}
			if (local367.aClass10_7 == null) {
				local367.aClass10_7 = local8.method4222();
			} else {
				local367.aClass10_7.method4212(local8);
			}
			local369.anInt7124 = (int) (local8.aFloat49 + local8.aFloat54 * (float) this.anIntArray594[local367.anInt7122] + local8.aFloat45 * (float) this.anIntArray592[local367.anInt7122] + local8.aFloat50 * (float) this.anIntArray593[local367.anInt7122]);
			local369.anInt7120 = (int) (local8.aFloat55 + local8.aFloat46 * (float) this.anIntArray593[local367.anInt7122] + local8.aFloat51 * (float) this.anIntArray594[local367.anInt7122] + (float) this.anIntArray592[local367.anInt7122] * local8.aFloat47);
			local369.anInt7119 = (int) (local8.aFloat53 + (float) this.anIntArray593[local367.anInt7122] * local8.aFloat52 + local8.aFloat44 * (float) this.anIntArray592[local367.anInt7122] + (float) this.anIntArray594[local367.anInt7122] * local8.aFloat48);
		}
	}

	@OriginalMember(owner = "client!vm", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray64 == null) {
			return false;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anInt10490; local13++) {
			this.anIntArray594[local13] <<= 0x4;
			this.anIntArray592[local13] <<= 0x4;
			this.anIntArray593[local13] <<= 0x4;
		}
		Static322.anInt5496 = 0;
		Static589.anInt9523 = 0;
		Static670.anInt6252 = 0;
		return true;
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "()V")
	@Override
	protected void method8850() {
	}

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10512; local7++) {
			this.anIntArray593[local7] = -this.anIntArray593[local7];
		}
		for (@Pc(31) int local31 = 0; local31 < this.anInt10440; local31++) {
			this.aShortArray166[local31] = (short) -this.aShortArray166[local31];
		}
		for (@Pc(54) int local54 = 0; local54 < this.anInt10436; local54++) {
			@Pc(65) short local65 = this.aShortArray171[local54];
			this.aShortArray171[local54] = this.aShortArray163[local54];
			this.aShortArray163[local54] = local65;
		}
		this.method8883();
		this.method8876();
		this.method8871();
		this.aBoolean753 = false;
	}

	@OriginalMember(owner = "client!vm", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static322.anInt5496 = 0;
			Static670.anInt6252 = 0;
			local13 = 0;
			Static589.anInt9523 = 0;
			for (local17 = 0; local17 < this.anInt10512; local17++) {
				Static589.anInt9523 += this.anIntArray594[local17];
				Static670.anInt6252 += this.anIntArray592[local17];
				local13++;
				Static322.anInt5496 += this.anIntArray593[local17];
			}
			if (local13 > 0) {
				Static670.anInt6252 = arg2 + Static670.anInt6252 / local13;
				Static589.anInt9523 = arg1 + Static589.anInt9523 / local13;
				Static322.anInt5496 = arg3 + Static322.anInt5496 / local13;
			} else {
				Static670.anInt6252 = arg2;
				Static322.anInt5496 = arg3;
				Static589.anInt9523 = arg1;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt10512; local13++) {
				this.anIntArray594[local13] += arg1;
				this.anIntArray592[local13] += arg2;
				this.anIntArray593[local13] += arg3;
			}
		} else {
			@Pc(177) int local177;
			@Pc(195) int local195;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt10512; local13++) {
					this.anIntArray594[local13] -= Static589.anInt9523;
					this.anIntArray592[local13] -= Static670.anInt6252;
					this.anIntArray593[local13] -= Static322.anInt5496;
					if (arg3 != 0) {
						local17 = Class42.anIntArray51[arg3];
						local177 = Class42.anIntArray52[arg3];
						local195 = local17 * this.anIntArray592[local13] + local177 * this.anIntArray594[local13] + 16383 >> 14;
						this.anIntArray592[local13] = local177 * this.anIntArray592[local13] + 16383 - local17 * this.anIntArray594[local13] >> 14;
						this.anIntArray594[local13] = local195;
					}
					if (arg1 != 0) {
						local17 = Class42.anIntArray51[arg1];
						local177 = Class42.anIntArray52[arg1];
						local195 = local177 * this.anIntArray592[local13] + 16383 - this.anIntArray593[local13] * local17 >> 14;
						this.anIntArray593[local13] = local177 * this.anIntArray593[local13] + this.anIntArray592[local13] * local17 + 16383 >> 14;
						this.anIntArray592[local13] = local195;
					}
					if (arg2 != 0) {
						local17 = Class42.anIntArray51[arg2];
						local177 = Class42.anIntArray52[arg2];
						local195 = local17 * this.anIntArray593[local13] + local177 * this.anIntArray594[local13] + 16383 >> 14;
						this.anIntArray593[local13] = local177 * this.anIntArray593[local13] + 16383 - this.anIntArray594[local13] * local17 >> 14;
						this.anIntArray594[local13] = local195;
					}
					this.anIntArray594[local13] += Static589.anInt9523;
					this.anIntArray592[local13] += Static670.anInt6252;
					this.anIntArray593[local13] += Static322.anInt5496;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt10512; local13++) {
					this.anIntArray594[local13] -= Static589.anInt9523;
					this.anIntArray592[local13] -= Static670.anInt6252;
					this.anIntArray593[local13] -= Static322.anInt5496;
					this.anIntArray594[local13] = arg1 * this.anIntArray594[local13] / 128;
					this.anIntArray592[local13] = this.anIntArray592[local13] * arg2 / 128;
					this.anIntArray593[local13] = arg3 * this.anIntArray593[local13] / 128;
					this.anIntArray594[local13] += Static589.anInt9523;
					this.anIntArray592[local13] += Static670.anInt6252;
					this.anIntArray593[local13] += Static322.anInt5496;
				}
			} else {
				@Pc(548) Class19 local548;
				@Pc(553) Class252 local553;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt10436; local13++) {
						local17 = (this.aByteArray108[local13] & 0xFF) + (arg1 * 8);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray108[local13] = (byte) local17;
					}
					if (this.aClass19Array1 != null) {
						for (local17 = 0; local17 < this.anInt10447; local17++) {
							local548 = this.aClass19Array1[local17];
							local553 = this.aClass252Array1[local17];
							local553.anInt6637 = local553.anInt6637 & 0xFFFFFF | 255 - (this.aByteArray108[local548.anInt293] & 0xFF) << 24;
						}
					}
					this.method8866();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt10436; local13++) {
						local17 = this.aShortArray161[local13] & 0xFFFF;
						local177 = local17 >> 10 & 0x3F;
						local195 = local17 >> 7 & 0x7;
						@Pc(620) int local620 = local17 & 0x7F;
						@Pc(626) int local626 = arg1 + local177 & 0x3F;
						local195 += arg2 / 4;
						if (local195 < 0) {
							local195 = 0;
						} else if (local195 > 7) {
							local195 = 7;
						}
						local620 += arg3;
						if (local620 < 0) {
							local620 = 0;
						} else if (local620 > 127) {
							local620 = 127;
						}
						this.aShortArray161[local13] = (short) (local620 | local195 << 7 | local626 << 10);
					}
					if (this.aClass19Array1 != null) {
						for (local17 = 0; local17 < this.anInt10447; local17++) {
							local548 = this.aClass19Array1[local17];
							local553 = this.aClass252Array1[local17];
							local553.anInt6637 = local553.anInt6637 & 0xFF000000 | Static408.anIntArray407[this.aShortArray161[local548.anInt293] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method8866();
				} else {
					@Pc(751) Class252 local751;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt10447; local13++) {
							local751 = this.aClass252Array1[local13];
							local751.anInt6635 += arg2;
							local751.anInt6642 += arg1;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt10447; local13++) {
							local751 = this.aClass252Array1[local13];
							local751.anInt6643 = local751.anInt6643 * arg1 >> 7;
							local751.anInt6639 = arg2 * local751.anInt6639 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt10447; local13++) {
							local751 = this.aClass252Array1[local13];
							local751.anInt6638 = local751.anInt6638 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!sj;Lclient!rp;II)V")
	@Override
	public void method8846(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class4_Sub8 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt10440 == 0) {
			return;
		}
		@Pc(14) Class10_Sub2 local14 = this.aClass100_Sub1_21.aClass10_Sub2_16;
		@Pc(17) Class10_Sub2 local17 = (Class10_Sub2) arg0;
		if (!this.aBoolean753) {
			this.method8878();
		}
		Static293.aFloat137 = local17.aFloat44 * local14.aFloat52 + local14.aFloat44 * local17.aFloat47 + local14.aFloat48 * local17.aFloat45;
		Static344.aFloat133 = local14.aFloat48 * local17.aFloat49 + local14.aFloat44 * local17.aFloat55 + local14.aFloat52 * local17.aFloat53 + local14.aFloat53;
		@Pc(72) float local72 = Static344.aFloat133 + Static293.aFloat137 * (float) this.anInt10476;
		@Pc(80) float local80 = Static344.aFloat133 + (float) this.anInt10482 * Static293.aFloat137;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local72 > local80) {
			local97 = (float) this.anInt10503 + local72;
			local91 = (float) -this.anInt10503 + local80;
		} else {
			local91 = (float) -this.anInt10503 + local72;
			local97 = (float) this.anInt10503 + local80;
		}
		if (local91 >= this.aClass100_Sub1_21.aFloat184 || (float) this.aClass100_Sub1_21.anInt9231 >= local97) {
			return;
		}
		Static539.aFloat165 = local14.aFloat49 + local14.aFloat50 * local17.aFloat53 + local14.aFloat45 * local17.aFloat55 + local17.aFloat49 * local14.aFloat54;
		Static652.aFloat216 = local14.aFloat45 * local17.aFloat47 + local14.aFloat54 * local17.aFloat45 + local14.aFloat50 * local17.aFloat44;
		@Pc(176) float local176 = Static539.aFloat165 + (float) this.anInt10476 * Static652.aFloat216;
		@Pc(184) float local184 = Static539.aFloat165 + (float) this.anInt10482 * Static652.aFloat216;
		@Pc(199) float local199;
		@Pc(210) float local210;
		if (local176 > local184) {
			local199 = (local184 - (float) this.anInt10503) * (float) this.aClass100_Sub1_21.anInt9249;
			local210 = (local176 + (float) this.anInt10503) * (float) this.aClass100_Sub1_21.anInt9249;
		} else {
			local199 = (float) this.aClass100_Sub1_21.anInt9249 * (local176 - (float) this.anInt10503);
			local210 = (local184 + (float) this.anInt10503) * (float) this.aClass100_Sub1_21.anInt9249;
		}
		if (this.aClass100_Sub1_21.aFloat181 <= local199 / (float) arg2 || this.aClass100_Sub1_21.aFloat180 >= local210 / (float) arg2) {
			return;
		}
		Static658.aFloat217 = local14.aFloat46 * local17.aFloat44 + local17.aFloat47 * local14.aFloat47 + local14.aFloat51 * local17.aFloat45;
		Static603.aFloat188 = local14.aFloat55 + local17.aFloat53 * local14.aFloat46 + local17.aFloat55 * local14.aFloat47 + local14.aFloat51 * local17.aFloat49;
		@Pc(303) float local303 = Static658.aFloat217 * (float) this.anInt10476 + Static603.aFloat188;
		@Pc(311) float local311 = Static603.aFloat188 + (float) this.anInt10482 * Static658.aFloat217;
		@Pc(327) float local327;
		@Pc(338) float local338;
		if (local303 > local311) {
			local338 = (float) this.aClass100_Sub1_21.anInt9258 * (local303 + (float) this.anInt10503);
			local327 = (float) this.aClass100_Sub1_21.anInt9258 * (local311 - (float) this.anInt10503);
		} else {
			local327 = ((float) -this.anInt10503 + local303) * (float) this.aClass100_Sub1_21.anInt9258;
			local338 = (float) this.aClass100_Sub1_21.anInt9258 * (local311 + (float) this.anInt10503);
		}
		if (local327 / (float) arg2 >= this.aClass100_Sub1_21.aFloat182 || local338 / (float) arg2 <= this.aClass100_Sub1_21.aFloat172) {
			return;
		}
		if (arg1 != null || this.aClass19Array1 != null) {
			Static676.aFloat219 = local14.aFloat52 * local17.aFloat48 + local17.aFloat51 * local14.aFloat44 + local17.aFloat54 * local14.aFloat48;
			Static638.aFloat211 = local17.aFloat52 * local14.aFloat52 + local17.aFloat50 * local14.aFloat48 + local17.aFloat46 * local14.aFloat44;
			Static98.aFloat41 = local17.aFloat50 * local14.aFloat51 + local17.aFloat46 * local14.aFloat47 + local17.aFloat52 * local14.aFloat46;
			Static675.aFloat218 = local17.aFloat51 * local14.aFloat45 + local17.aFloat54 * local14.aFloat54 + local14.aFloat50 * local17.aFloat48;
			Static116.aFloat166 = local14.aFloat47 * local17.aFloat51 + local17.aFloat54 * local14.aFloat51 + local14.aFloat46 * local17.aFloat48;
			Static579.aFloat167 = local14.aFloat50 * local17.aFloat52 + local17.aFloat50 * local14.aFloat54 + local14.aFloat45 * local17.aFloat46;
		}
		if (arg1 != null) {
			@Pc(511) int local511 = this.anInt10513 + this.anInt10446 >> 1;
			@Pc(520) int local520 = this.anInt10439 + this.anInt10487 >> 1;
			@Pc(539) int local539 = (int) (Static539.aFloat165 + Static675.aFloat218 * (float) local511 + (float) this.anInt10476 * Static652.aFloat216 + Static579.aFloat167 * (float) local520);
			@Pc(558) int local558 = (int) ((float) this.anInt10476 * Static658.aFloat217 + Static116.aFloat166 * (float) local511 + Static603.aFloat188 + Static98.aFloat41 * (float) local520);
			@Pc(577) int local577 = (int) ((float) local520 * Static638.aFloat211 + (float) local511 * Static676.aFloat219 + Static344.aFloat133 + (float) this.anInt10476 * Static293.aFloat137);
			@Pc(596) int local596 = (int) (Static579.aFloat167 * (float) local520 + Static539.aFloat165 + (float) local511 * Static675.aFloat218 + (float) this.anInt10482 * Static652.aFloat216);
			@Pc(615) int local615 = (int) ((float) local511 * Static116.aFloat166 + Static603.aFloat188 + (float) this.anInt10482 * Static658.aFloat217 + (float) local520 * Static98.aFloat41);
			arg1.anInt8408 = this.aClass100_Sub1_21.anInt9233 + local539 * this.aClass100_Sub1_21.anInt9249 / arg2;
			arg1.anInt8406 = local596 * this.aClass100_Sub1_21.anInt9249 / arg2 + this.aClass100_Sub1_21.anInt9233;
			arg1.anInt8404 = this.aClass100_Sub1_21.anInt9246 + this.aClass100_Sub1_21.anInt9258 * local615 / arg2;
			arg1.anInt8405 = this.aClass100_Sub1_21.anInt9246 + local558 * this.aClass100_Sub1_21.anInt9258 / arg2;
			@Pc(689) int local689 = (int) ((float) this.anInt10482 * Static293.aFloat137 + Static344.aFloat133 + (float) local511 * Static676.aFloat219 + (float) local520 * Static638.aFloat211);
			if (local577 >= this.aClass100_Sub1_21.anInt9231 || this.aClass100_Sub1_21.anInt9231 <= local689) {
				arg1.aBoolean558 = true;
				arg1.anInt8407 = (this.anInt10503 + local539) * this.aClass100_Sub1_21.anInt9249 / arg2 + this.aClass100_Sub1_21.anInt9233 - arg1.anInt8408;
			}
		}
		this.aClass100_Sub1_21.method7964((float) arg2);
		this.aClass100_Sub1_21.method7953();
		this.aClass100_Sub1_21.method7959(local17);
		this.method8868();
		this.method8874();
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(Z)V")
	private void method8883() {
		if (this.aClass71_2 != null) {
			this.aClass71_2.aBoolean123 = false;
		}
	}

	@OriginalMember(owner = "client!vm", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort121 = (short) arg0;
		this.method8883();
		this.method8876();
	}

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "(I)Z")
	private boolean method8884() {
		if (this.aClass345_1.aBoolean594) {
			return true;
		}
		if (this.aClass345_1.anInterface20_7 == null) {
			this.aClass345_1.anInterface20_7 = this.aClass100_Sub1_21.method7882(this.aBoolean751);
		}
		@Pc(38) Interface20 local38 = this.aClass345_1.anInterface20_7;
		local38.method7350(this.anInt10473 * 6);
		@Pc(50) Buffer local50 = local38.method7347();
		if (local50 != null) {
			@Pc(58) Stream local58 = this.aClass100_Sub1_21.method7910(local50);
			@Pc(62) int local62;
			if (Stream.c()) {
				for (local62 = 0; local62 < this.anInt10473; local62++) {
					local58.c(this.aShortArray171[local62]);
					local58.c(this.aShortArray165[local62]);
					local58.c(this.aShortArray163[local62]);
				}
			} else {
				for (local62 = 0; local62 < this.anInt10473; local62++) {
					local58.f(this.aShortArray171[local62]);
					local58.f(this.aShortArray165[local62]);
					local58.f(this.aShortArray163[local62]);
				}
			}
			local58.b();
			if (local38.method7349()) {
				this.aBoolean750 = true;
				this.aClass345_1.anInterface20_6 = local38;
				this.aClass345_1.aBoolean594 = true;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8861(@OriginalArg(0) Class43 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class43_Sub3 local8 = (Class43_Sub3) arg0;
		if (this.anInt10436 == 0 || local8.anInt10436 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt10512;
		@Pc(27) int[] local27 = local8.anIntArray594;
		@Pc(30) int[] local30 = local8.anIntArray592;
		@Pc(33) int[] local33 = local8.anIntArray593;
		@Pc(36) short[] local36 = local8.aShortArray172;
		@Pc(39) short[] local39 = local8.aShortArray164;
		@Pc(42) short[] local42 = local8.aShortArray166;
		@Pc(45) byte[] local45 = local8.aByteArray107;
		@Pc(56) short[] local56;
		@Pc(52) short[] local52;
		@Pc(50) short[] local50;
		@Pc(54) byte[] local54;
		if (this.aClass184_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local54 = this.aClass184_1.aByteArray45;
			local50 = this.aClass184_1.aShortArray59;
			local52 = this.aClass184_1.aShortArray57;
			local56 = this.aClass184_1.aShortArray58;
		}
		@Pc(83) short[] local83;
		@Pc(85) short[] local85;
		@Pc(81) short[] local81;
		@Pc(79) byte[] local79;
		if (local8.aClass184_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local79 = local8.aClass184_1.aByteArray45;
			local81 = local8.aClass184_1.aShortArray59;
			local83 = local8.aClass184_1.aShortArray58;
			local85 = local8.aClass184_1.aShortArray57;
		}
		@Pc(106) int[] local106 = local8.anIntArray597;
		@Pc(109) short[] local109 = local8.aShortArray160;
		if (!local8.aBoolean753) {
			local8.method8878();
		}
		@Pc(120) int local120 = local8.anInt10476;
		@Pc(123) int local123 = local8.anInt10482;
		@Pc(126) int local126 = local8.anInt10513;
		@Pc(129) int local129 = local8.anInt10446;
		@Pc(132) int local132 = local8.anInt10439;
		@Pc(135) int local135 = local8.anInt10487;
		for (@Pc(137) int local137 = 0; local137 < this.anInt10512; local137++) {
			@Pc(147) int local147 = this.anIntArray592[local137] - arg2;
			if (local147 >= local120 && local123 >= local147) {
				@Pc(170) int local170 = this.anIntArray594[local137] - arg1;
				if (local170 >= local126 && local170 <= local129) {
					@Pc(193) int local193 = this.anIntArray593[local137] - arg3;
					if (local132 <= local193 && local135 >= local193) {
						@Pc(215) int local215 = -1;
						@Pc(220) int local220 = this.anIntArray597[local137];
						@Pc(227) int local227 = this.anIntArray597[local137 + 1];
						for (@Pc(229) int local229 = local220; local229 < local227; local229++) {
							local215 = this.aShortArray160[local229] - 1;
							if (local215 == -1 || this.aByteArray107[local215] != 0) {
								break;
							}
						}
						if (local215 != -1) {
							for (@Pc(273) int local273 = 0; local273 < local24; local273++) {
								if (local27[local273] == local170 && local193 == local33[local273] && local147 == local30[local273]) {
									@Pc(306) int local306 = -1;
									local227 = local106[local273 + 1];
									local220 = local106[local273];
									for (@Pc(318) int local318 = local220; local318 < local227; local318++) {
										local306 = local109[local318] - 1;
										if (local306 == -1 || local45[local306] != 0) {
											break;
										}
									}
									if (local306 != -1) {
										if (local56 == null) {
											this.aClass184_1 = new Class184();
											local56 = this.aClass184_1.aShortArray58 = Static163.method3001(this.aShortArray172);
											local52 = this.aClass184_1.aShortArray57 = Static163.method3001(this.aShortArray164);
											local50 = this.aClass184_1.aShortArray59 = Static163.method3001(this.aShortArray166);
											local54 = this.aClass184_1.aByteArray45 = Static448.method6383(this.aByteArray107);
										}
										if (local83 == null) {
											@Pc(410) Class184 local410 = local8.aClass184_1 = new Class184();
											local83 = local410.aShortArray58 = Static163.method3001(local36);
											local85 = local410.aShortArray57 = Static163.method3001(local39);
											local81 = local410.aShortArray59 = Static163.method3001(local42);
											local79 = local410.aByteArray45 = Static448.method6383(local45);
										}
										@Pc(443) short local443 = this.aShortArray172[local215];
										@Pc(448) short local448 = this.aShortArray164[local215];
										@Pc(453) short local453 = this.aShortArray166[local215];
										local227 = local106[local273 + 1];
										@Pc(464) byte local464 = this.aByteArray107[local215];
										local220 = local106[local273];
										@Pc(478) int local478;
										for (@Pc(470) int local470 = local220; local470 < local227; local470++) {
											local478 = local109[local470] - 1;
											if (local478 == -1) {
												break;
											}
											if (local79[local478] != 0) {
												local83[local478] += local443;
												local85[local478] += local448;
												local81[local478] += local453;
												local79[local478] += local464;
											}
										}
										local448 = local39[local306];
										local443 = local36[local306];
										local453 = local42[local306];
										local220 = this.anIntArray597[local137];
										local464 = local45[local306];
										local227 = this.anIntArray597[local137 + 1];
										for (local478 = local220; local478 < local227; local478++) {
											@Pc(571) int local571 = this.aShortArray160[local478] - 1;
											if (local571 == -1) {
												break;
											}
											if (local54[local571] != 0) {
												local56[local571] += local443;
												local52[local571] += local448;
												local50[local571] += local453;
												local54[local571] += local464;
											}
										}
										local8.method8876();
										this.method8876();
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
