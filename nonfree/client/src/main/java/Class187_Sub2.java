import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class187_Sub2 extends Class187 {

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
	private int anInt5521;

	@OriginalMember(owner = "client!lu", name = "m", descriptor = "Lclient!vk;")
	private Class366 aClass366_1;

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "Lclient!pj;")
	private final Class133_Sub1 aClass133_Sub1_8;

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "Lclient!ef;")
	private Class89 aClass89_1;

	@OriginalMember(owner = "client!lu", name = "w", descriptor = "I")
	private int anInt5528;

	@OriginalMember(owner = "client!lu", name = "M", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!lu", name = "R", descriptor = "I")
	private int anInt5542;

	@OriginalMember(owner = "client!lu", name = "W", descriptor = "I")
	private int anInt5546;

	@OriginalMember(owner = "client!lu", name = "cb", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!lu", name = "jb", descriptor = "I")
	private int anInt5554;

	@OriginalMember(owner = "client!lu", name = "kb", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!lu", name = "sb", descriptor = "Lclient!vk;")
	private Class366 aClass366_2;

	@OriginalMember(owner = "client!lu", name = "tb", descriptor = "Lclient!vk;")
	private Class366 aClass366_3;

	@OriginalMember(owner = "client!lu", name = "zb", descriptor = "I")
	private int anInt5563;

	@OriginalMember(owner = "client!lu", name = "Bb", descriptor = "I")
	private int anInt5565;

	@OriginalMember(owner = "client!lu", name = "Db", descriptor = "I")
	private int anInt5567;

	@OriginalMember(owner = "client!lu", name = "Ob", descriptor = "I")
	private int anInt5575;

	@OriginalMember(owner = "client!lu", name = "Vb", descriptor = "I")
	private int anInt5579;

	@OriginalMember(owner = "client!lu", name = "cc", descriptor = "I")
	private int anInt5583;

	@OriginalMember(owner = "client!lu", name = "fc", descriptor = "Lclient!hq;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!lu", name = "qc", descriptor = "Lclient!vk;")
	private Class366 aClass366_4;

	@OriginalMember(owner = "client!lu", name = "bc", descriptor = "[I")
	private int[] anIntArray299;

	@OriginalMember(owner = "client!lu", name = "U", descriptor = "I")
	private int anInt5545;

	@OriginalMember(owner = "client!lu", name = "X", descriptor = "I")
	private int anInt5547;

	@OriginalMember(owner = "client!lu", name = "N", descriptor = "Z")
	private boolean aBoolean399;

	@OriginalMember(owner = "client!lu", name = "pb", descriptor = "Z")
	private boolean aBoolean402;

	@OriginalMember(owner = "client!lu", name = "sc", descriptor = "I")
	private int anInt5592;

	@OriginalMember(owner = "client!lu", name = "dc", descriptor = "[S")
	private short[] aShortArray86;

	@OriginalMember(owner = "client!lu", name = "tc", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!lu", name = "Ec", descriptor = "I")
	private int anInt5599;

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "[I")
	private int[] anIntArray295;

	@OriginalMember(owner = "client!lu", name = "Bc", descriptor = "[I")
	private int[] anIntArray301;

	@OriginalMember(owner = "client!lu", name = "lb", descriptor = "[Lclient!sn;")
	private Class320[] lb;

	@OriginalMember(owner = "client!lu", name = "qb", descriptor = "[Lclient!ou;")
	private Class261[] aClass261Array4;

	@OriginalMember(owner = "client!lu", name = "S", descriptor = "I")
	private int anInt5543;

	@OriginalMember(owner = "client!lu", name = "Sb", descriptor = "[Lclient!jk;")
	private Class180[] aClass180Array1;

	@OriginalMember(owner = "client!lu", name = "ab", descriptor = "[Lclient!dga;")
	private Class72[] aClass72Array1;

	@OriginalMember(owner = "client!lu", name = "Wb", descriptor = "[S")
	private short[] aShortArray84;

	@OriginalMember(owner = "client!lu", name = "Q", descriptor = "[S")
	private short[] aShortArray79;

	@OriginalMember(owner = "client!lu", name = "Ub", descriptor = "[S")
	private short[] aShortArray83;

	@OriginalMember(owner = "client!lu", name = "Gb", descriptor = "[S")
	private short[] aShortArray81;

	@OriginalMember(owner = "client!lu", name = "wc", descriptor = "[S")
	private short[] aShortArray88;

	@OriginalMember(owner = "client!lu", name = "db", descriptor = "[S")
	private short[] aShortArray80;

	@OriginalMember(owner = "client!lu", name = "gc", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!lu", name = "hc", descriptor = "S")
	private short aShort83;

	@OriginalMember(owner = "client!lu", name = "Z", descriptor = "[F")
	private float[] aFloatArray44;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "[S")
	private short[] aShortArray77;

	@OriginalMember(owner = "client!lu", name = "z", descriptor = "S")
	private short aShort82;

	@OriginalMember(owner = "client!lu", name = "Yb", descriptor = "[S")
	private short[] aShortArray85;

	@OriginalMember(owner = "client!lu", name = "Ib", descriptor = "[S")
	private short[] aShortArray82;

	@OriginalMember(owner = "client!lu", name = "oc", descriptor = "[F")
	private float[] aFloatArray45;

	@OriginalMember(owner = "client!lu", name = "Cc", descriptor = "[S")
	private short[] aShortArray89;

	@OriginalMember(owner = "client!lu", name = "y", descriptor = "[S")
	private short[] aShortArray78;

	@OriginalMember(owner = "client!lu", name = "vc", descriptor = "[S")
	private short[] aShortArray87;

	@OriginalMember(owner = "client!lu", name = "V", descriptor = "[B")
	private byte[] aByteArray53;

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "[I")
	private int[] anIntArray296;

	@OriginalMember(owner = "client!lu", name = "yb", descriptor = "[I")
	private int[] anIntArray298;

	@OriginalMember(owner = "client!lu", name = "bb", descriptor = "[I")
	private int[] anIntArray297;

	@OriginalMember(owner = "client!lu", name = "jc", descriptor = "[[I")
	private int[][] anIntArrayArray37;

	@OriginalMember(owner = "client!lu", name = "Kb", descriptor = "[[I")
	private int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!lu", name = "Rb", descriptor = "[[I")
	private int[][] anIntArrayArray36;

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!pj;Lclient!b;IIII)V")
	public Class187_Sub2(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) Class26 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_12;
		@Pc(15) int[] local15 = new int[arg1.anInt390];
		this.anIntArray299 = new int[arg1.anInt377 + 1];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt390; local24++) {
			if (arg1.aByteArray7 == null || arg1.aByteArray7[local24] != 2) {
				if (arg1.aShortArray16 != null && arg1.aShortArray16[local24] != -1) {
					@Pc(55) Class145 local55 = local11.method4656(arg1.aShortArray16[local24] & 0xFFFF);
					if (((this.anInt5546 & 0x40) == 0 || !local55.aBoolean291) && local55.aBoolean294) {
						continue;
					}
				}
				local15[this.anInt5545++] = local24;
				this.anIntArray299[arg1.aShortArray9[local24]]++;
				this.anIntArray299[arg1.aShortArray17[local24]]++;
				this.anIntArray299[arg1.aShortArray18[local24]]++;
			}
		}
		this.anInt5547 = this.anInt5545;
		@Pc(124) long[] local124 = new long[this.anInt5545];
		@Pc(133) boolean local133 = (this.anInt5563 & 0x100) != 0;
		@Pc(145) int local145;
		@Pc(158) int local158;
		@Pc(326) int local326;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5545; local135++) {
			@Pc(141) int local141 = local15[local135];
			@Pc(143) Class145 local143 = null;
			local145 = 0;
			@Pc(147) byte local147 = 0;
			@Pc(149) byte local149 = 0;
			@Pc(151) byte local151 = 0;
			if (arg1.aClass257Array1 != null) {
				@Pc(156) boolean local156 = false;
				for (local158 = 0; local158 < arg1.aClass257Array1.length; local158++) {
					@Pc(165) Class257 local165 = arg1.aClass257Array1[local158];
					if (local141 == local165.anInt6698) {
						@Pc(178) Class70 local178 = Static128.method59(local165.anInt6691);
						if (local178.aBoolean138) {
							local156 = true;
						}
						if (local178.anInt1880 != -1) {
							@Pc(193) Class145 local193 = local11.method4656(local178.anInt1880);
							if (local193.anInt3988 == 2) {
								this.aBoolean399 = true;
							}
						}
					}
				}
				if (local156) {
					local124[local135] = Long.MAX_VALUE;
					this.anInt5547--;
					continue;
				}
			}
			@Pc(228) short local228 = -1;
			if (arg1.aShortArray16 != null) {
				local228 = arg1.aShortArray16[local141];
				if (local228 != -1) {
					local143 = local11.method4656(local228 & 0xFFFF);
					if ((this.anInt5546 & 0x40) != 0 && local143.aBoolean291) {
						local228 = -1;
						local143 = null;
					} else {
						local151 = local143.aByte64;
						local149 = local143.aByte68;
					}
				}
			}
			@Pc(288) boolean local288 = arg1.aByteArray10 != null && arg1.aByteArray10[local141] != 0 || local143 != null && local143.anInt3988 != 0;
			if ((local133 || local288) && arg1.aByteArray4 != null) {
				local145 += arg1.aByteArray4[local141] << 17;
			}
			if (local288) {
				local145 += 65536;
			}
			local145 += (local149 & 0xFF) << 8;
			local326 = local147 + ((local228 & 0xFFFF) << 16);
			local145 += local151 & 0xFF;
			@Pc(338) int local338 = local326 + (local135 & 0xFFFF);
			local124[local135] = (long) local338 + ((long) local145 << 32);
			this.aBoolean402 |= local143 != null && (local143.aByte62 != 0 || local143.aByte65 != 0);
			this.aBoolean399 |= local288;
		}
		Static126.method1894(local15, local124);
		this.anInt5592 = arg1.anInt386;
		this.aShortArray86 = arg1.aShortArray14;
		this.anIntArray300 = arg1.anIntArray17;
		this.anInt5599 = arg1.anInt377;
		this.anIntArray295 = arg1.anIntArray22;
		this.anIntArray301 = arg1.anIntArray16;
		@Pc(410) Class158[] local410 = new Class158[this.anInt5599];
		this.lb = arg1.aClass320Array1;
		this.aClass261Array4 = arg1.aClass261Array1;
		@Pc(438) int local438;
		@Pc(452) int local452;
		@Pc(499) int local499;
		if (arg1.aClass257Array1 != null) {
			this.anInt5543 = arg1.aClass257Array1.length;
			this.aClass180Array1 = new Class180[this.anInt5543];
			this.aClass72Array1 = new Class72[this.anInt5543];
			for (local438 = 0; local438 < this.anInt5543; local438++) {
				@Pc(445) Class257 local445 = arg1.aClass257Array1[local438];
				@Pc(450) Class70 local450 = Static128.method59(local445.anInt6691);
				local452 = -1;
				for (@Pc(454) int local454 = 0; local454 < this.anInt5545; local454++) {
					if (local445.anInt6698 == local15[local454]) {
						local452 = local454;
						break;
					}
				}
				if (local452 == -1) {
					throw new RuntimeException();
				}
				local499 = Static349.anIntArray330[arg1.aShortArray15[local445.anInt6698] & 0xFFFF] & 0xFFFFFF;
				@Pc(517) int local517 = local499 | 255 - (arg1.aByteArray10 == null ? 0 : arg1.aByteArray10[local445.anInt6698]) << 24;
				this.aClass72Array1[local438] = new Class72(local452, arg1.aShortArray9[local445.anInt6698], arg1.aShortArray17[local445.anInt6698], arg1.aShortArray18[local445.anInt6698], local450.anInt1882, local450.anInt1884, local450.anInt1880, local450.anInt1883, local450.anInt1881, local450.aBoolean138, local450.aBoolean139, local445.anInt6695);
				this.aClass180Array1[local438] = new Class180(local517);
			}
		}
		local438 = this.anInt5545 * 3;
		Static243.aLongArray3 = new long[local438];
		this.aShortArray84 = new short[local438];
		this.aShortArray79 = new short[local438];
		this.aShortArray83 = new short[this.anInt5545];
		this.aShortArray81 = new short[local438];
		this.aShortArray88 = new short[local438];
		if (arg1.aShortArray11 != null) {
			this.aShortArray80 = new short[this.anInt5545];
		}
		this.aByteArray54 = new byte[local438];
		this.aShort83 = (short) arg4;
		this.aFloatArray44 = new float[local438];
		this.aShortArray77 = new short[this.anInt5545];
		this.aShort82 = (short) arg3;
		this.aShortArray85 = new short[this.anInt5545];
		this.aShortArray82 = new short[this.anInt5545];
		this.aFloatArray45 = new float[local438];
		this.aShortArray89 = new short[local438];
		this.aShortArray78 = new short[local438];
		this.aShortArray87 = new short[this.anInt5545];
		this.aByteArray53 = new byte[this.anInt5545];
		local145 = 0;
		for (local326 = 0; local326 < arg1.anInt377; local326++) {
			local452 = this.anIntArray299[local326];
			this.anIntArray299[local326] = local145;
			local145 += local452;
			local410[local326] = new Class158();
		}
		this.anIntArray299[arg1.anInt377] = local145;
		@Pc(707) Class76 local707 = Static415.method6353(local15, arg1, this.anInt5545);
		@Pc(711) Class307[] local711 = new Class307[arg1.anInt390];
		@Pc(752) int local752;
		@Pc(763) int local763;
		@Pc(773) int local773;
		@Pc(730) short local730;
		@Pc(741) int local741;
		for (local499 = 0; local499 < arg1.anInt390; local499++) {
			@Pc(720) short local720 = arg1.aShortArray9[local499];
			@Pc(725) short local725 = arg1.aShortArray17[local499];
			local730 = arg1.aShortArray18[local499];
			local741 = this.anIntArray301[local725] - this.anIntArray301[local720];
			local752 = this.anIntArray295[local725] - this.anIntArray295[local720];
			local763 = this.anIntArray300[local725] - this.anIntArray300[local720];
			local773 = this.anIntArray301[local730] - this.anIntArray301[local720];
			@Pc(784) int local784 = this.anIntArray295[local730] - this.anIntArray295[local720];
			@Pc(795) int local795 = this.anIntArray300[local730] - this.anIntArray300[local720];
			@Pc(804) int local804 = local795 * local752 - local763 * local784;
			@Pc(812) int local812 = local773 * local763 - local741 * local795;
			@Pc(821) int local821 = local784 * local741 - local752 * local773;
			while (local804 > 8192 || local812 > 8192 || local821 > 8192 || local804 < -8192 || local812 < -8192 || local821 < -8192) {
				local812 >>= 0x1;
				local821 >>= 0x1;
				local804 >>= 0x1;
			}
			@Pc(874) int local874 = (int) Math.sqrt((double) (local812 * local812 + local804 * local804 + local821 * local821));
			if (local874 <= 0) {
				local874 = 1;
			}
			local812 = local812 * 256 / local874;
			local804 = local804 * 256 / local874;
			local821 = local821 * 256 / local874;
			@Pc(906) byte local906 = arg1.aByteArray7 == null ? 0 : arg1.aByteArray7[local499];
			if (local906 == 0) {
				@Pc(939) Class158 local939 = local410[local720];
				local939.anInt4202 += local821;
				local939.anInt4203++;
				local939.anInt4206 += local804;
				local939.anInt4204 += local812;
				@Pc(967) Class158 local967 = local410[local725];
				local967.anInt4206 += local804;
				local967.anInt4202 += local821;
				local967.anInt4204 += local812;
				local967.anInt4203++;
				@Pc(995) Class158 local995 = local410[local730];
				local995.anInt4202 += local821;
				local995.anInt4206 += local804;
				local995.anInt4204 += local812;
				local995.anInt4203++;
			} else if (local906 == 1) {
				@Pc(924) Class307 local924 = local711[local499] = new Class307();
				local924.anInt8304 = local821;
				local924.anInt8305 = local812;
				local924.anInt8302 = local804;
			}
		}
		@Pc(1032) int local1032;
		@Pc(1075) short local1075;
		for (local158 = 0; local158 < this.anInt5545; local158++) {
			local1032 = local15[local158];
			@Pc(1039) int local1039 = arg1.aShortArray15[local1032] & 0xFFFF;
			if (arg1.aByteArray9 == null) {
				local741 = -1;
			} else {
				local741 = arg1.aByteArray9[local1032];
			}
			if (arg1.aByteArray10 == null) {
				local752 = 0;
			} else {
				local752 = arg1.aByteArray10[local1032] & 0xFF;
			}
			local1075 = arg1.aShortArray16 == null ? -1 : arg1.aShortArray16[local1032];
			if (local1075 != -1 && (this.anInt5546 & 0x40) != 0) {
				@Pc(1094) Class145 local1094 = local11.method4656(local1075 & 0xFFFF);
				if (local1094.aBoolean291) {
					local1075 = -1;
				}
			}
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) float local1105 = 0.0F;
			@Pc(1107) float local1107 = 0.0F;
			@Pc(1109) float local1109 = 0.0F;
			@Pc(1111) float local1111 = 0.0F;
			@Pc(1113) byte local1113 = 0;
			@Pc(1115) byte local1115 = 0;
			@Pc(1117) int local1117 = 0;
			@Pc(1134) byte local1134;
			@Pc(1151) short local1151;
			@Pc(1942) short local1942;
			@Pc(1947) short local1947;
			if (local1075 != -1) {
				if (local741 == -1) {
					local1113 = 1;
					local1109 = 0.0F;
					local1103 = 1.0F;
					local1107 = 1.0F;
					local1101 = 0.0F;
					local1105 = 1.0F;
					local1115 = 2;
					local1111 = 0.0F;
				} else {
					local741 &= 0xFF;
					local1134 = arg1.aByteArray5[local741];
					@Pc(1141) short local1141;
					@Pc(1146) short local1146;
					@Pc(1184) float local1184;
					@Pc(1195) float local1195;
					@Pc(1289) float local1289;
					@Pc(1524) float local1524;
					@Pc(1532) float local1532;
					@Pc(1540) float local1540;
					@Pc(1563) float local1563;
					@Pc(1586) float local1586;
					@Pc(1609) float local1609;
					if (local1134 == 0) {
						local1141 = arg1.aShortArray9[local1032];
						local1146 = arg1.aShortArray17[local1032];
						local1151 = arg1.aShortArray18[local1032];
						local1942 = arg1.aShortArray13[local741];
						local1947 = arg1.aShortArray12[local741];
						@Pc(1952) short local1952 = arg1.aShortArray10[local741];
						@Pc(1958) float local1958 = (float) arg1.anIntArray16[local1942];
						@Pc(1964) float local1964 = (float) arg1.anIntArray22[local1942];
						local1184 = arg1.anIntArray17[local1942];
						local1195 = (float) arg1.anIntArray16[local1947] - local1958;
						local1289 = (float) arg1.anIntArray22[local1947] - local1964;
						@Pc(1995) float local1995 = (float) arg1.anIntArray17[local1947] - local1184;
						@Pc(2004) float local2004 = (float) arg1.anIntArray16[local1952] - local1958;
						@Pc(2013) float local2013 = (float) arg1.anIntArray22[local1952] - local1964;
						@Pc(2021) float local2021 = (float) arg1.anIntArray17[local1952] - local1184;
						@Pc(2030) float local2030 = (float) arg1.anIntArray16[local1141] - local1958;
						@Pc(2039) float local2039 = (float) arg1.anIntArray22[local1141] - local1964;
						@Pc(2048) float local2048 = (float) arg1.anIntArray17[local1141] - local1184;
						@Pc(2056) float local2056 = (float) arg1.anIntArray16[local1146] - local1958;
						@Pc(2065) float local2065 = (float) arg1.anIntArray22[local1146] - local1964;
						local1524 = (float) arg1.anIntArray17[local1146] - local1184;
						local1532 = (float) arg1.anIntArray16[local1151] - local1958;
						local1540 = (float) arg1.anIntArray22[local1151] - local1964;
						local1563 = (float) arg1.anIntArray17[local1151] - local1184;
						local1586 = local2021 * local1289 - local2013 * local1995;
						local1609 = local1995 * local2004 - local2021 * local1195;
						@Pc(2127) float local2127 = local2013 * local1195 - local2004 * local1289;
						@Pc(2135) float local2135 = local2013 * local2127 - local2021 * local1609;
						@Pc(2144) float local2144 = local1586 * local2021 - local2004 * local2127;
						@Pc(2152) float local2152 = local2004 * local1609 - local1586 * local2013;
						@Pc(2166) float local2166 = 1.0F / (local1995 * local2152 + local1195 * local2135 + local1289 * local2144);
						local1101 = (local2152 * local2048 + local2039 * local2144 + local2030 * local2135) * local2166;
						local1105 = (local1524 * local2152 + local2065 * local2144 + local2135 * local2056) * local2166;
						local1109 = local2166 * (local2152 * local1563 + local2135 * local1532 + local1540 * local2144);
						@Pc(2216) float local2216 = local1586 * local1995 - local1195 * local2127;
						@Pc(2225) float local2225 = local2127 * local1289 - local1995 * local1609;
						@Pc(2233) float local2233 = local1609 * local1195 - local1289 * local1586;
						@Pc(2247) float local2247 = 1.0F / (local2233 * local2021 + local2216 * local2013 + local2004 * local2225);
						local1107 = (local2233 * local1524 + local2056 * local2225 + local2216 * local2065) * local2247;
						local1103 = (local2030 * local2225 + local2039 * local2216 + local2233 * local2048) * local2247;
						local1111 = local2247 * (local2225 * local1532 + local1540 * local2216 + local2233 * local1563);
					} else {
						local1141 = arg1.aShortArray9[local1032];
						local1146 = arg1.aShortArray17[local1032];
						local1151 = arg1.aShortArray18[local1032];
						@Pc(1156) int local1156 = local707.anIntArray124[local741];
						@Pc(1161) int local1161 = local707.anIntArray122[local741];
						@Pc(1166) int local1166 = local707.anIntArray125[local741];
						@Pc(1171) float[] local1171 = local707.aFloatArrayArray5[local741];
						@Pc(1176) byte local1176 = arg1.aByteArray8[local741];
						local1184 = (float) arg1.anIntArray21[local741] / 256.0F;
						if (local1134 == 1) {
							local1195 = (float) arg1.anIntArray19[local741] / 1024.0F;
							Static232.method3876(arg1.anIntArray16[local1141], local1184, local1176, local1156, arg1.anIntArray17[local1141], local1166, arg1.anIntArray22[local1141], local1161, local1195, local1171, Static240.aFloatArray28);
							local1101 = Static240.aFloatArray28[0];
							local1103 = Static240.aFloatArray28[1];
							Static232.method3876(arg1.anIntArray16[local1146], local1184, local1176, local1156, arg1.anIntArray17[local1146], local1166, arg1.anIntArray22[local1146], local1161, local1195, local1171, Static240.aFloatArray28);
							local1107 = Static240.aFloatArray28[1];
							local1105 = Static240.aFloatArray28[0];
							Static232.method3876(arg1.anIntArray16[local1151], local1184, local1176, local1156, arg1.anIntArray17[local1151], local1166, arg1.anIntArray22[local1151], local1161, local1195, local1171, Static240.aFloatArray28);
							local1109 = Static240.aFloatArray28[0];
							local1111 = Static240.aFloatArray28[1];
							local1289 = local1195 / 2.0F;
							if ((local1176 & 0x1) == 0) {
								if (local1105 - local1101 > local1289) {
									local1105 -= local1195;
									local1113 = 1;
								} else if (local1289 < local1101 - local1105) {
									local1105 += local1195;
									local1113 = 2;
								}
								if (local1289 < local1109 - local1101) {
									local1115 = 1;
									local1109 -= local1195;
								} else if (local1289 < local1101 - local1109) {
									local1115 = 2;
									local1109 += local1195;
								}
							} else {
								if (local1289 < local1107 - local1103) {
									local1107 -= local1195;
									local1113 = 1;
								} else if (local1289 < local1103 - local1107) {
									local1113 = 2;
									local1107 += local1195;
								}
								if (local1111 - local1103 > local1289) {
									local1111 -= local1195;
									local1115 = 1;
								} else if (local1103 - local1111 > local1289) {
									local1115 = 2;
									local1111 += local1195;
								}
							}
						} else if (local1134 == 2) {
							local1195 = (float) arg1.anIntArray15[local741] / 256.0F;
							local1289 = (float) arg1.anIntArray18[local741] / 256.0F;
							@Pc(1436) int local1436 = arg1.anIntArray16[local1146] - arg1.anIntArray16[local1141];
							@Pc(1447) int local1447 = arg1.anIntArray22[local1146] - arg1.anIntArray22[local1141];
							@Pc(1458) int local1458 = arg1.anIntArray17[local1146] - arg1.anIntArray17[local1141];
							@Pc(1468) int local1468 = arg1.anIntArray16[local1151] - arg1.anIntArray16[local1141];
							@Pc(1479) int local1479 = arg1.anIntArray22[local1151] - arg1.anIntArray22[local1141];
							@Pc(1490) int local1490 = arg1.anIntArray17[local1151] - arg1.anIntArray17[local1141];
							@Pc(1499) int local1499 = local1490 * local1447 - local1479 * local1458;
							@Pc(1507) int local1507 = local1468 * local1458 - local1490 * local1436;
							@Pc(1516) int local1516 = local1479 * local1436 - local1468 * local1447;
							local1524 = 64.0F / (float) arg1.anIntArray24[local741];
							local1532 = 64.0F / (float) arg1.anIntArray25[local741];
							local1540 = 64.0F / (float) arg1.anIntArray19[local741];
							local1563 = ((float) local1499 * local1171[0] + local1171[1] * (float) local1507 + local1171[2] * (float) local1516) / local1524;
							local1586 = ((float) local1499 * local1171[3] + (float) local1507 * local1171[4] + (float) local1516 * local1171[5]) / local1532;
							local1609 = (local1171[8] * (float) local1516 + (float) local1499 * local1171[6] + local1171[7] * (float) local1507) / local1540;
							local1117 = Static413.method8725(local1586, local1563, local1609);
							Static246.method4088(arg1.anIntArray16[local1141], local1195, local1176, local1171, arg1.anIntArray17[local1141], Static240.aFloatArray28, local1117, local1166, local1184, local1161, local1289, local1156, arg1.anIntArray22[local1141]);
							local1103 = Static240.aFloatArray28[1];
							local1101 = Static240.aFloatArray28[0];
							Static246.method4088(arg1.anIntArray16[local1146], local1195, local1176, local1171, arg1.anIntArray17[local1146], Static240.aFloatArray28, local1117, local1166, local1184, local1161, local1289, local1156, arg1.anIntArray22[local1146]);
							local1105 = Static240.aFloatArray28[0];
							local1107 = Static240.aFloatArray28[1];
							Static246.method4088(arg1.anIntArray16[local1151], local1195, local1176, local1171, arg1.anIntArray17[local1151], Static240.aFloatArray28, local1117, local1166, local1184, local1161, local1289, local1156, arg1.anIntArray22[local1151]);
							local1109 = Static240.aFloatArray28[0];
							local1111 = Static240.aFloatArray28[1];
						} else if (local1134 == 3) {
							Static580.method8387(Static240.aFloatArray28, local1184, local1166, arg1.anIntArray22[local1141], local1161, local1176, arg1.anIntArray17[local1141], arg1.anIntArray16[local1141], local1171, local1156);
							local1101 = Static240.aFloatArray28[0];
							local1103 = Static240.aFloatArray28[1];
							Static580.method8387(Static240.aFloatArray28, local1184, local1166, arg1.anIntArray22[local1146], local1161, local1176, arg1.anIntArray17[local1146], arg1.anIntArray16[local1146], local1171, local1156);
							local1105 = Static240.aFloatArray28[0];
							local1107 = Static240.aFloatArray28[1];
							Static580.method8387(Static240.aFloatArray28, local1184, local1166, arg1.anIntArray22[local1151], local1161, local1176, arg1.anIntArray17[local1151], arg1.anIntArray16[local1151], local1171, local1156);
							local1109 = Static240.aFloatArray28[0];
							local1111 = Static240.aFloatArray28[1];
							if ((local1176 & 0x1) == 0) {
								if (local1105 - local1101 > 0.5F) {
									local1113 = 1;
									local1105--;
								} else if (local1101 - local1105 > 0.5F) {
									local1113 = 2;
									local1105++;
								}
								if (local1109 - local1101 > 0.5F) {
									local1115 = 1;
									local1109--;
								} else if (local1101 - local1109 > 0.5F) {
									local1109++;
									local1115 = 2;
								}
							} else {
								if (local1107 - local1103 > 0.5F) {
									local1113 = 1;
									local1107--;
								} else if (local1103 - local1107 > 0.5F) {
									local1113 = 2;
									local1107++;
								}
								if (local1111 - local1103 > 0.5F) {
									local1111--;
									local1115 = 1;
								} else if (local1103 - local1111 > 0.5F) {
									local1111++;
									local1115 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray7 == null) {
				local1134 = 0;
			} else {
				local1134 = arg1.aByteArray7[local1032];
			}
			if (local1134 == 0) {
				@Pc(2343) long local2343 = (long) (local741 << 2) + ((long) (local1039 << 8) + (long) (local1117 << 24) + (long) local752 << 32);
				local1151 = arg1.aShortArray9[local1032];
				local1942 = arg1.aShortArray17[local1032];
				local1947 = arg1.aShortArray18[local1032];
				@Pc(2362) Class158 local2362 = local410[local1151];
				this.aShortArray87[local158] = this.method4963(local2362.anInt4204, local1103, local1151, local2362.anInt4202, local2343, arg1, local2362.anInt4203, local1101, local2362.anInt4206, local158);
				@Pc(2387) Class158 local2387 = local410[local1942];
				this.aShortArray77[local158] = this.method4963(local2387.anInt4204, local1107, local1942, local2387.anInt4202, (long) local1113 + local2343, arg1, local2387.anInt4203, local1105, local2387.anInt4206, local158);
				@Pc(2415) Class158 local2415 = local410[local1947];
				this.aShortArray85[local158] = this.method4963(local2415.anInt4204, local1111, local1947, local2415.anInt4202, (long) local1115 + local2343, arg1, local2415.anInt4203, local1109, local2415.anInt4206, local158);
			} else if (local1134 == 1) {
				@Pc(2448) Class307 local2448 = local711[local1032];
				@Pc(2493) long local2493 = (long) ((local2448.anInt8304 + 256 << 22) + (local2448.anInt8305 + 256 << 12) + (local741 << 2) + (local2448.anInt8302 <= 0 ? 2048 : 1024)) + ((long) local752 + (long) (local1117 << 24) + (long) (local1039 << 8) << 32);
				this.aShortArray87[local158] = this.method4963(local2448.anInt8305, local1103, arg1.aShortArray9[local1032], local2448.anInt8304, local2493, arg1, 0, local1101, local2448.anInt8302, local158);
				this.aShortArray77[local158] = this.method4963(local2448.anInt8305, local1107, arg1.aShortArray17[local1032], local2448.anInt8304, local2493 + (long) local1113, arg1, 0, local1105, local2448.anInt8302, local158);
				this.aShortArray85[local158] = this.method4963(local2448.anInt8305, local1111, arg1.aShortArray18[local1032], local2448.anInt8304, (long) local1115 + local2493, arg1, 0, local1109, local2448.anInt8302, local158);
			}
			if (arg1.aByteArray10 != null) {
				this.aByteArray53[local158] = arg1.aByteArray10[local1032];
			}
			if (arg1.aShortArray11 != null) {
				this.aShortArray80[local158] = arg1.aShortArray11[local1032];
			}
			this.aShortArray82[local158] = arg1.aShortArray15[local1032];
			this.aShortArray83[local158] = local1075;
		}
		if (this.anInt5547 > 0) {
			local1032 = 1;
			local730 = this.aShortArray83[0];
			for (local741 = 0; local741 < this.anInt5547; local741++) {
				@Pc(2627) short local2627 = this.aShortArray83[local741];
				if (local730 != local2627) {
					local1032++;
					local730 = local2627;
				}
			}
			this.anIntArray296 = new int[local1032];
			this.anIntArray298 = new int[local1032 + 1];
			this.anIntArray297 = new int[local1032];
			this.anIntArray298[0] = 0;
			local752 = this.anInt5583;
			local1075 = 0;
			local1032 = 0;
			local730 = this.aShortArray83[0];
			for (local773 = 0; local773 < this.anInt5547; local773++) {
				@Pc(2686) short local2686 = this.aShortArray83[local773];
				if (local730 != local2686) {
					this.anIntArray296[local1032] = local752;
					this.anIntArray297[local1032] = local1075 + 1 - local752;
					local1032++;
					this.anIntArray298[local1032] = local773;
					local730 = local2686;
					local752 = this.anInt5583;
					local1075 = 0;
				}
				@Pc(2726) short local2726 = this.aShortArray87[local773];
				if (local2726 > local1075) {
					local1075 = local2726;
				}
				if (local752 > local2726) {
					local752 = local2726;
				}
				local2726 = this.aShortArray77[local773];
				if (local2726 > local1075) {
					local1075 = local2726;
				}
				if (local752 > local2726) {
					local752 = local2726;
				}
				local2726 = this.aShortArray85[local773];
				if (local1075 < local2726) {
					local1075 = local2726;
				}
				if (local752 > local2726) {
					local752 = local2726;
				}
			}
			this.anIntArray296[local1032] = local752;
			this.anIntArray297[local1032] = local1075 + 1 - local752;
			local1032++;
			this.anIntArray298[local1032] = this.anInt5547;
		}
		Static243.aLongArray3 = null;
		this.aShortArray88 = Static196.method3498(this.aShortArray88, this.anInt5583);
		this.aShortArray89 = Static196.method3498(this.aShortArray89, this.anInt5583);
		this.aShortArray79 = Static196.method3498(this.aShortArray79, this.anInt5583);
		this.aShortArray84 = Static196.method3498(this.aShortArray84, this.anInt5583);
		this.aShortArray78 = Static196.method3498(this.aShortArray78, this.anInt5583);
		this.aByteArray54 = Static596.method8557(this.aByteArray54, this.anInt5583);
		this.aFloatArray44 = Static193.method7301(this.anInt5583, this.aFloatArray44);
		this.aFloatArray45 = Static193.method7301(this.anInt5583, this.aFloatArray45);
		if (arg1.anIntArray26 != null && Static299.method4660(arg2, this.anInt5546)) {
			this.anIntArrayArray37 = arg1.method340(false);
		}
		if (arg1.aClass257Array1 != null && Static249.method4130(arg2, this.anInt5546)) {
			this.anIntArrayArray35 = arg1.method345();
		}
		if (arg1.anIntArray23 != null && Static592.method8533(arg2, this.anInt5546)) {
			local1032 = 0;
			@Pc(2918) int[] local2918 = new int[256];
			for (local741 = 0; local741 < this.anInt5545; local741++) {
				local752 = arg1.anIntArray23[local15[local741]];
				if (local752 >= 0) {
					@Pc(2938) int local2938 = local2918[local752]++;
					if (local752 > local1032) {
						local1032 = local752;
					}
				}
			}
			this.anIntArrayArray36 = new int[local1032 + 1][];
			for (local752 = 0; local752 <= local1032; local752++) {
				this.anIntArrayArray36[local752] = new int[local2918[local752]];
				local2918[local752] = 0;
			}
			for (local763 = 0; local763 < this.anInt5545; local763++) {
				local773 = arg1.anIntArray23[local15[local763]];
				if (local773 >= 0) {
					this.anIntArrayArray36[local773][local2918[local773]++] = local763;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lclient!pj;IIZZ)V")
	public Class187_Sub2(@OriginalArg(0) Class133_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean399 = false;
		this.anInt5545 = 0;
		this.anInt5547 = 0;
		this.aBoolean400 = true;
		this.aBoolean401 = false;
		this.aBoolean402 = false;
		this.anInt5583 = 0;
		this.aBoolean398 = false;
		this.anInt5592 = 0;
		this.anInt5599 = 0;
		this.aBoolean401 = arg4;
		this.anInt5546 = arg2;
		this.anInt5563 = arg1;
		this.aClass133_Sub1_8 = arg0;
		if (arg3 || Static122.method1869(this.anInt5563, this.anInt5546)) {
			this.aClass366_2 = new Class366(Static40.method5453(this.anInt5563, this.anInt5546));
		}
		if (arg3 || Static6.method112(this.anInt5546, this.anInt5563)) {
			this.aClass366_4 = new Class366(Static247.method4091(this.anInt5563, this.anInt5546));
		}
		if (arg3 || Static208.method3590(this.anInt5546, this.anInt5563)) {
			this.aClass366_1 = new Class366(Static532.method7864(this.anInt5563, this.anInt5546));
		}
		if (arg3 || Static448.method6753(this.anInt5546, this.anInt5563)) {
			this.aClass366_3 = new Class366(Static16.method230(this.anInt5546, this.anInt5563));
		}
		if (arg3 || Static301.method4667(this.anInt5546, this.anInt5563)) {
			this.aClass89_1 = new Class89(Static476.method7031(this.anInt5563, this.anInt5546));
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Z)Z")
	private boolean method4958() {
		if (this.aClass89_1.aBoolean162) {
			return true;
		}
		if (this.aClass89_1.anInterface14_2 == null) {
			this.aClass89_1.anInterface14_2 = this.aClass133_Sub1_8.method6281(this.aBoolean401);
		}
		@Pc(28) Interface14 local28 = this.aClass89_1.anInterface14_2;
		local28.method6764(this.anInt5547 * 6);
		@Pc(40) Buffer local40 = local28.method6770();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass133_Sub1_8.method6242(local40);
			@Pc(52) int local52;
			if (Stream.a()) {
				for (local52 = 0; local52 < this.anInt5547; local52++) {
					local48.f(this.aShortArray87[local52]);
					local48.f(this.aShortArray77[local52]);
					local48.f(this.aShortArray85[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt5547; local52++) {
					local48.e(this.aShortArray87[local52]);
					local48.e(this.aShortArray77[local52]);
					local48.e(this.aShortArray85[local52]);
				}
			}
			local48.b();
			if (local28.method6769()) {
				this.aClass89_1.aBoolean162 = true;
				this.aBoolean400 = true;
				this.aClass89_1.anInterface14_3 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(I)V")
	private void method4959() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anInt5599; local23++) {
			@Pc(30) int local30 = this.anIntArray301[local23];
			@Pc(35) int local35 = this.anIntArray295[local23];
			if (local7 > local30) {
				local7 = local30;
			}
			if (local15 < local35) {
				local15 = local35;
			}
			@Pc(54) int local54 = this.anIntArray300[local23];
			if (local9 > local35) {
				local9 = local35;
			}
			if (local13 < local30) {
				local13 = local30;
			}
			if (local54 > local17) {
				local17 = local54;
			}
			if (local11 > local54) {
				local11 = local54;
			}
			@Pc(90) int local90 = local54 * local54 + local30 * local30;
			if (local90 > local19) {
				local19 = local90;
			}
			local90 = local30 * local30 + local54 * local54 + local35 * local35;
			if (local90 > local21) {
				local21 = local90;
			}
		}
		this.anInt5579 = local9;
		this.anInt5528 = local7;
		this.anInt5565 = local17;
		this.anInt5521 = local11;
		this.anInt5554 = local13;
		this.anInt5542 = local15;
		this.anInt5567 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt5575 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean398 = true;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "()V")
	@Override
	protected void method8658() {
	}

	@OriginalMember(owner = "client!lu", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub5_Sub14 ba(@OriginalArg(0) Class5_Sub5_Sub14 arg0) {
		if (this.anInt5583 == 0) {
			return null;
		}
		if (!this.aBoolean398) {
			this.method4959();
		}
		@Pc(39) int local39;
		@Pc(55) int local55;
		if (this.aClass133_Sub1_8.anInt6981 > 0) {
			local39 = this.anInt5528 - (this.aClass133_Sub1_8.anInt6981 * this.anInt5542 >> 8) >> this.aClass133_Sub1_8.anInt7012;
			local55 = this.anInt5554 - (this.aClass133_Sub1_8.anInt6981 * this.anInt5579 >> 8) >> this.aClass133_Sub1_8.anInt7012;
		} else {
			local39 = this.anInt5528 - (this.anInt5579 * this.aClass133_Sub1_8.anInt6981 >> 8) >> this.aClass133_Sub1_8.anInt7012;
			local55 = this.anInt5554 - (this.anInt5542 * this.aClass133_Sub1_8.anInt6981 >> 8) >> this.aClass133_Sub1_8.anInt7012;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass133_Sub1_8.anInt7017 <= 0) {
			local115 = this.anInt5521 - (this.aClass133_Sub1_8.anInt7017 * this.anInt5579 >> 8) >> this.aClass133_Sub1_8.anInt7012;
			local132 = this.anInt5565 - (this.anInt5542 * this.aClass133_Sub1_8.anInt7017 >> 8) >> this.aClass133_Sub1_8.anInt7012;
		} else {
			local115 = this.anInt5521 - (this.aClass133_Sub1_8.anInt7017 * this.anInt5542 >> 8) >> this.aClass133_Sub1_8.anInt7012;
			local132 = this.anInt5565 - (this.aClass133_Sub1_8.anInt7017 * this.anInt5579 >> 8) >> this.aClass133_Sub1_8.anInt7012;
		}
		@Pc(174) int local174 = local55 + 1 - local39;
		@Pc(180) int local180 = local132 + 1 - local115;
		@Pc(183) Class5_Sub5_Sub14_Sub2 local183 = (Class5_Sub5_Sub14_Sub2) arg0;
		@Pc(193) Class5_Sub5_Sub14_Sub2 local193;
		if (local183 != null && local183.method7965(local174, local180)) {
			local193 = local183;
			local183.method7960();
		} else {
			local193 = new Class5_Sub5_Sub14_Sub2(this.aClass133_Sub1_8, local174, local180);
		}
		local193.method7962(local55, local39, local132, local115);
		this.method4961(local193);
		return local193;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class187 method8656(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) Class187_Sub2 local14;
		@Pc(18) Class187_Sub2 local18;
		if (arg0 == 1) {
			local14 = this.aClass133_Sub1_8.aClass187_Sub2_28;
			local18 = this.aClass133_Sub1_8.aClass187_Sub2_29;
		} else if (arg0 == 2) {
			local18 = this.aClass133_Sub1_8.aClass187_Sub2_21;
			local14 = this.aClass133_Sub1_8.aClass187_Sub2_23;
		} else if (arg0 == 3) {
			local14 = this.aClass133_Sub1_8.aClass187_Sub2_27;
			local18 = this.aClass133_Sub1_8.aClass187_Sub2_22;
		} else if (arg0 == 4) {
			local18 = this.aClass133_Sub1_8.aClass187_Sub2_26;
			local14 = this.aClass133_Sub1_8.aClass187_Sub2_30;
		} else if (arg0 == 5) {
			local18 = this.aClass133_Sub1_8.aClass187_Sub2_24;
			local14 = this.aClass133_Sub1_8.aClass187_Sub2_25;
		} else {
			local14 = local18 = new Class187_Sub2(this.aClass133_Sub1_8, 0, 0, true, false);
		}
		return this.method4965(local14, arg1, arg0 != 0, local18, arg2);
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "(B)V")
	public void method4960() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method8616();
		}
		if (this.aClass366_4 != null) {
			this.aClass366_4.method8616();
		}
		if (this.aClass366_1 != null) {
			this.aClass366_1.method8616();
		}
		if (this.aClass366_3 != null) {
			this.aClass366_3.method8616();
		}
		if (this.aClass89_1 != null) {
			this.aClass89_1.method1845();
		}
	}

	@OriginalMember(owner = "client!lu", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5599; local7++) {
			if (arg0 != 0) {
				this.anIntArray301[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray295[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray300[local7] += arg2;
			}
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort83 = (short) arg0;
		this.method4966();
		this.method4964();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8647(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(18) int local18;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg3 << 4;
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static118.anInt2181 = 0;
			Static446.anInt7615 = 0;
			Static230.anInt4255 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray37.length) {
					local48 = this.anIntArrayArray37[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static230.anInt4255 += this.anIntArray301[local56];
						Static118.anInt2181 += this.anIntArray295[local56];
						local24++;
						Static446.anInt7615 += this.anIntArray300[local56];
					}
				}
			}
			if (local24 <= 0) {
				Static230.anInt4255 = local18;
				Static118.anInt2181 = local14;
				Static446.anInt7615 = local22;
			} else {
				Static118.anInt2181 = local14 + Static118.anInt2181 / local24;
				Static230.anInt4255 = local18 + Static230.anInt4255 / local24;
				Static446.anInt7615 = local22 + Static446.anInt7615 / local24;
			}
			return;
		}
		@Pc(161) int[] local161;
		@Pc(163) int local163;
		if (arg0 == 1) {
			local18 = arg2 << 4;
			local22 = arg4 << 4;
			local14 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray37.length) {
					local161 = this.anIntArrayArray37[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local50 = local161[local163];
						this.anIntArray301[local50] += local18;
						this.anIntArray295[local50] += local14;
						this.anIntArray300[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(274) int local274;
		@Pc(292) int local292;
		@Pc(736) int local736;
		@Pc(745) int local745;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray37.length > local32) {
					local161 = this.anIntArrayArray37[local32];
					if ((arg5 & 0x1) == 0) {
						for (local163 = 0; local163 < local161.length; local163++) {
							local50 = local161[local163];
							this.anIntArray301[local50] -= Static230.anInt4255;
							this.anIntArray295[local50] -= Static118.anInt2181;
							this.anIntArray300[local50] -= Static446.anInt7615;
							if (arg4 != 0) {
								local56 = Class377.anIntArray600[arg4];
								local274 = Class377.anIntArray601[arg4];
								local292 = local56 * this.anIntArray295[local50] + this.anIntArray301[local50] * local274 + 16383 >> 14;
								this.anIntArray295[local50] = this.anIntArray295[local50] * local274 + 16383 - local56 * this.anIntArray301[local50] >> 14;
								this.anIntArray301[local50] = local292;
							}
							if (arg2 != 0) {
								local56 = Class377.anIntArray600[arg2];
								local274 = Class377.anIntArray601[arg2];
								local292 = this.anIntArray295[local50] * local274 + 16383 - local56 * this.anIntArray300[local50] >> 14;
								this.anIntArray300[local50] = this.anIntArray300[local50] * local274 + local56 * this.anIntArray295[local50] + 16383 >> 14;
								this.anIntArray295[local50] = local292;
							}
							if (arg3 != 0) {
								local56 = Class377.anIntArray600[arg3];
								local274 = Class377.anIntArray601[arg3];
								local292 = local274 * this.anIntArray301[local50] + local56 * this.anIntArray300[local50] + 16383 >> 14;
								this.anIntArray300[local50] = this.anIntArray300[local50] * local274 + 16383 - this.anIntArray301[local50] * local56 >> 14;
								this.anIntArray301[local50] = local292;
							}
							this.anIntArray301[local50] += Static230.anInt4255;
							this.anIntArray295[local50] += Static118.anInt2181;
							this.anIntArray300[local50] += Static446.anInt7615;
						}
					} else {
						for (local163 = 0; local163 < local161.length; local163++) {
							local50 = local161[local163];
							this.anIntArray301[local50] -= Static230.anInt4255;
							this.anIntArray295[local50] -= Static118.anInt2181;
							this.anIntArray300[local50] -= Static446.anInt7615;
							if (arg2 != 0) {
								local56 = Class377.anIntArray600[arg2];
								local274 = Class377.anIntArray601[arg2];
								local292 = this.anIntArray295[local50] * local274 + 16383 - this.anIntArray300[local50] * local56 >> 14;
								this.anIntArray300[local50] = this.anIntArray300[local50] * local274 + this.anIntArray295[local50] * local56 + 16383 >> 14;
								this.anIntArray295[local50] = local292;
							}
							if (arg4 != 0) {
								local56 = Class377.anIntArray600[arg4];
								local274 = Class377.anIntArray601[arg4];
								local292 = local56 * this.anIntArray295[local50] + this.anIntArray301[local50] * local274 + 16383 >> 14;
								this.anIntArray295[local50] = local274 * this.anIntArray295[local50] + 16383 - this.anIntArray301[local50] * local56 >> 14;
								this.anIntArray301[local50] = local292;
							}
							if (arg3 != 0) {
								local56 = Class377.anIntArray600[arg3];
								local274 = Class377.anIntArray601[arg3];
								local292 = this.anIntArray301[local50] * local274 + this.anIntArray300[local50] * local56 + 16383 >> 14;
								this.anIntArray300[local50] = local274 * this.anIntArray300[local50] + 16383 - local56 * this.anIntArray301[local50] >> 14;
								this.anIntArray301[local50] = local292;
							}
							this.anIntArray301[local50] += Static230.anInt4255;
							this.anIntArray295[local50] += Static118.anInt2181;
							this.anIntArray300[local50] += Static446.anInt7615;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray37.length) {
						local48 = this.anIntArrayArray37[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local274 = this.anIntArray299[local56];
							local292 = this.anIntArray299[local56 + 1];
							for (local736 = local274; local736 < local292; local736++) {
								local745 = this.aShortArray81[local736] - 1;
								if (local745 == -1) {
									break;
								}
								@Pc(758) int local758;
								@Pc(762) int local762;
								@Pc(780) int local780;
								if (arg4 != 0) {
									local758 = Class377.anIntArray600[arg4];
									local762 = Class377.anIntArray601[arg4];
									local780 = local762 * this.aShortArray79[local745] + local758 * this.aShortArray84[local745] + 16383 >> 14;
									this.aShortArray84[local745] = (short) (this.aShortArray84[local745] * local762 + 16383 - local758 * this.aShortArray79[local745] >> 14);
									this.aShortArray79[local745] = (short) local780;
								}
								if (arg2 != 0) {
									local758 = Class377.anIntArray600[arg2];
									local762 = Class377.anIntArray601[arg2];
									local780 = this.aShortArray84[local745] * local762 + 16383 - this.aShortArray78[local745] * local758 >> 14;
									this.aShortArray78[local745] = (short) (local758 * this.aShortArray84[local745] + this.aShortArray78[local745] * local762 + 16383 >> 14);
									this.aShortArray84[local745] = (short) local780;
								}
								if (arg3 != 0) {
									local758 = Class377.anIntArray600[arg3];
									local762 = Class377.anIntArray601[arg3];
									local780 = local758 * this.aShortArray78[local745] + this.aShortArray79[local745] * local762 + 16383 >> 14;
									this.aShortArray78[local745] = (short) (local762 * this.aShortArray78[local745] + 16383 - this.aShortArray79[local745] * local758 >> 14);
									this.aShortArray79[local745] = (short) local780;
								}
							}
						}
					}
				}
				this.method4964();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray37.length) {
					local161 = this.anIntArrayArray37[local32];
					for (local163 = 0; local163 < local161.length; local163++) {
						local50 = local161[local163];
						this.anIntArray301[local50] -= Static230.anInt4255;
						this.anIntArray295[local50] -= Static118.anInt2181;
						this.anIntArray300[local50] -= Static446.anInt7615;
						this.anIntArray301[local50] = this.anIntArray301[local50] * arg2 >> 7;
						this.anIntArray295[local50] = arg3 * this.anIntArray295[local50] >> 7;
						this.anIntArray300[local50] = arg4 * this.anIntArray300[local50] >> 7;
						this.anIntArray301[local50] += Static230.anInt4255;
						this.anIntArray295[local50] += Static118.anInt2181;
						this.anIntArray300[local50] += Static446.anInt7615;
					}
				}
			}
		} else {
			@Pc(1186) Class180 local1186;
			@Pc(1086) boolean local1086;
			@Pc(1181) Class72 local1181;
			if (arg0 == 5) {
				if (this.anIntArrayArray36 != null) {
					local1086 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray36.length) {
							local48 = this.anIntArrayArray36[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local274 = (this.aByteArray53[local56] & 0xFF) + arg2 * 8;
								if (local274 < 0) {
									local274 = 0;
								} else if (local274 > 255) {
									local274 = 255;
								}
								this.aByteArray53[local56] = (byte) local274;
							}
							local1086 |= local48.length > 0;
						}
					}
					if (local1086) {
						if (this.aClass72Array1 != null) {
							for (local38 = 0; local38 < this.anInt5543; local38++) {
								local1181 = this.aClass72Array1[local38];
								local1186 = this.aClass180Array1[local38];
								local1186.anInt4726 = 255 - (this.aByteArray53[local1181.anInt1927] & 0xFF) << 24 | local1186.anInt4726 & 0xFFFFFF;
							}
						}
						this.method4972();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray36 != null) {
					local1086 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray36.length > local38) {
							local48 = this.anIntArrayArray36[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local274 = this.aShortArray82[local56] & 0xFFFF;
								local292 = local274 >> 10 & 0x3F;
								local736 = local274 >> 7 & 0x7;
								@Pc(1277) int local1277 = arg2 + local292 & 0x3F;
								local736 += arg3 / 4;
								local745 = local274 & 0x7F;
								local745 += arg4;
								if (local736 < 0) {
									local736 = 0;
								} else if (local736 > 7) {
									local736 = 7;
								}
								if (local745 < 0) {
									local745 = 0;
								} else if (local745 > 127) {
									local745 = 127;
								}
								this.aShortArray82[local56] = (short) (local736 << 7 | local1277 << 10 | local745);
							}
							local1086 |= local48.length > 0;
						}
					}
					if (local1086) {
						if (this.aClass72Array1 != null) {
							for (local38 = 0; local38 < this.anInt5543; local38++) {
								local1181 = this.aClass72Array1[local38];
								local1186 = this.aClass180Array1[local38];
								local1186.anInt4726 = Static349.anIntArray330[this.aShortArray82[local1181.anInt1927] & 0xFFFF] & 0xFFFFFF | local1186.anInt4726 & 0xFF000000;
							}
						}
						this.method4972();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray35 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray35.length) {
							local161 = this.anIntArrayArray35[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1186 = this.aClass180Array1[local161[local163]];
								local1186.anInt4724 += arg2;
								local1186.anInt4723 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray35 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray35.length) {
							local161 = this.anIntArrayArray35[local32];
							for (local163 = 0; local163 < local161.length; local163++) {
								local1186 = this.aClass180Array1[local161[local163]];
								local1186.anInt4721 = arg3 * local1186.anInt4721 >> 7;
								local1186.anInt4728 = local1186.anInt4728 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray35 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray35.length) {
						local161 = this.anIntArrayArray35[local32];
						for (local163 = 0; local163 < local161.length; local163++) {
							local1186 = this.aClass180Array1[local161[local163]];
							local1186.anInt4722 = local1186.anInt4722 + arg2 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!tj;B)V")
	private void method4961(@OriginalArg(0) Class5_Sub5_Sub14_Sub2 arg0) {
		if (Static546.anIntArray507.length < this.anInt5583) {
			Static630.anIntArray595 = new int[this.anInt5583];
			Static546.anIntArray507 = new int[this.anInt5583];
		}
		@Pc(52) int local52;
		@Pc(91) int local91;
		@Pc(100) int local100;
		for (@Pc(26) int local26 = 0; local26 < this.anInt5599; local26++) {
			local52 = (this.anIntArray301[local26] - (this.aClass133_Sub1_8.anInt6981 * this.anIntArray295[local26] >> 8) >> this.aClass133_Sub1_8.anInt7012) - arg0.anInt9224;
			@Pc(77) int local77 = (this.anIntArray300[local26] - (this.anIntArray295[local26] * this.aClass133_Sub1_8.anInt7017 >> 8) >> this.aClass133_Sub1_8.anInt7012) - arg0.anInt9228;
			@Pc(82) int local82 = this.anIntArray299[local26];
			@Pc(89) int local89 = this.anIntArray299[local26 + 1];
			for (local91 = local82; local91 < local89; local91++) {
				local100 = this.aShortArray81[local91] - 1;
				if (local100 == -1) {
					break;
				}
				Static546.anIntArray507[local100] = local52;
				Static630.anIntArray595[local100] = local77;
			}
		}
		for (local52 = 0; local52 < this.anInt5547; local52++) {
			if (this.aByteArray53 == null || this.aByteArray53[local52] <= 128) {
				@Pc(144) short local144 = this.aShortArray87[local52];
				@Pc(149) short local149 = this.aShortArray77[local52];
				@Pc(154) short local154 = this.aShortArray85[local52];
				local91 = Static546.anIntArray507[local144];
				local100 = Static546.anIntArray507[local149];
				@Pc(166) int local166 = Static546.anIntArray507[local154];
				@Pc(170) int local170 = Static630.anIntArray595[local144];
				@Pc(174) int local174 = Static630.anIntArray595[local149];
				@Pc(178) int local178 = Static630.anIntArray595[local154];
				if ((local174 - local178) * (local91 - local100) - (local174 - local170) * (local166 - local100) > 0) {
					arg0.method7964(local166, local170, local178, local174, local100, local91);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(B)V")
	private void method4962() {
		if (this.aClass72Array1 == null) {
			return;
		}
		this.aClass133_Sub1_8.C(!this.aBoolean399);
		this.aClass133_Sub1_8.method6252(false);
		this.aClass133_Sub1_8.method6211(Static105.aClass236_1, 1);
		this.aClass133_Sub1_8.method6159(1, Static105.aClass236_1);
		for (@Pc(32) int local32 = 0; local32 < this.anInt5543; local32++) {
			@Pc(39) Class72 local39 = this.aClass72Array1[local32];
			@Pc(44) Class180 local44 = this.aClass180Array1[local32];
			if (!local39.aBoolean144 || !this.aClass133_Sub1_8.method7319()) {
				@Pc(73) float local73 = (float) (this.anIntArray301[local39.anInt1929] + this.anIntArray301[local39.anInt1931] + this.anIntArray301[local39.anInt1926]) * 0.3333333F;
				@Pc(95) float local95 = (float) (this.anIntArray295[local39.anInt1931] + this.anIntArray295[local39.anInt1929] + this.anIntArray295[local39.anInt1926]) * 0.3333333F;
				@Pc(116) float local116 = (float) (this.anIntArray300[local39.anInt1929] + this.anIntArray300[local39.anInt1931] + this.anIntArray300[local39.anInt1926]) * 0.3333333F;
				@Pc(130) float local130 = Static217.aFloat89 + local73 * Static19.aFloat5 + Static411.aFloat134 * local95 + Static223.aFloat90 * local116;
				@Pc(144) float local144 = Static583.aFloat185 + local116 * Static315.aFloat115 + Static513.aFloat8 * local73 + Static299.aFloat94 * local95;
				@Pc(158) float local158 = Static467.aFloat142 + local73 * Static217.aFloat88 + Static569.aFloat184 * local95 + Static382.aFloat99 * local116;
				@Pc(179) float local179 = (float) (1.0D / Math.sqrt((double) (local158 * local158 + local130 * local130 + local144 * local144))) * (float) local39.anInt1928;
				@Pc(184) Class113_Sub1 local184 = this.aClass133_Sub1_8.method6284();
				local184.method2466(local158 - local179 * local158, local44.anInt4722, local144 + (float) local44.anInt4723 - local144 * local179, local39.aShort41 * local44.anInt4721 >> 7, local130 + (float) local44.anInt4724 - local130 * local179, local39.aShort42 * local44.anInt4728 >> 7);
				local184.method2470(this.aClass133_Sub1_8.aClass113_Sub1_17);
				this.aClass133_Sub1_8.method6204();
				@Pc(243) int local243 = local44.anInt4726;
				this.aClass133_Sub1_8.method6277(false, local39.aShort40, false);
				this.aClass133_Sub1_8.method6208(local39.aByte48);
				this.aClass133_Sub1_8.method6160(local243);
				this.aClass133_Sub1_8.method6163();
			}
		}
		this.aClass133_Sub1_8.method6159(1, Static229.aClass236_2);
		this.aClass133_Sub1_8.method6211(Static229.aClass236_2, 1);
		this.aClass133_Sub1_8.C(true);
	}

	@OriginalMember(owner = "client!lu", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass133_Sub1_8.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5545; local11++) {
			if (this.aShortArray83[local11] == arg0) {
				this.aShortArray83[local11] = arg1;
			}
		}
		@Pc(39) byte local39 = 0;
		@Pc(41) byte local41 = 0;
		if (arg0 != -1) {
			@Pc(51) Class145 local51 = local9.method4656(arg0 & 0xFFFF);
			local41 = local51.aByte67;
			local39 = local51.aByte66;
		}
		@Pc(59) byte local59 = 0;
		@Pc(61) byte local61 = 0;
		if (arg1 != -1) {
			@Pc(71) Class145 local71 = local9.method4656(arg1 & 0xFFFF);
			if (local71.aByte62 != 0 || local71.aByte65 != 0) {
				this.aBoolean402 = true;
			}
			local61 = local71.aByte67;
			local59 = local71.aByte66;
		}
		if (!(local59 != local39 | local41 != local61)) {
			return;
		}
		if (this.aClass72Array1 != null) {
			for (@Pc(112) int local112 = 0; local112 < this.anInt5543; local112++) {
				@Pc(119) Class72 local119 = this.aClass72Array1[local112];
				@Pc(124) Class180 local124 = this.aClass180Array1[local112];
				local124.anInt4726 = local124.anInt4726 & 0xFF000000 | Static349.anIntArray330[this.aShortArray82[local119.anInt1927] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4972();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IFIIJLclient!b;IFIBI)S")
	private short method4963(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) long arg4, @OriginalArg(5) Class26 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray299[arg2];
		@Pc(17) int local17 = this.anIntArray299[arg2 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray81[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (Static243.aLongArray3[local21] == arg4) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray81[local19] = (short) (this.anInt5583 + 1);
		Static243.aLongArray3[local19] = arg4;
		this.aShortArray89[this.anInt5583] = (short) arg9;
		this.aShortArray88[this.anInt5583] = (short) arg2;
		this.aShortArray79[this.anInt5583] = (short) arg8;
		this.aShortArray84[this.anInt5583] = (short) arg0;
		this.aShortArray78[this.anInt5583] = (short) arg3;
		this.aByteArray54[this.anInt5583] = (byte) arg6;
		this.aFloatArray44[this.anInt5583] = arg7;
		this.aFloatArray45[this.anInt5583] = arg1;
		return (short) this.anInt5583++;
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "()[Lclient!ou;")
	@Override
	public Class261[] method8650() {
		return this.aClass261Array4;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(B)V")
	private void method4964() {
		if ((this.anInt5546 & 0x37) == 0) {
			if (this.aClass366_1 != null) {
				this.aClass366_1.aBoolean723 = false;
			}
		} else if (this.aClass366_3 != null) {
			this.aClass366_3.aBoolean723 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!tc;ZII)Z")
	@Override
	public boolean method8641(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method4974(arg0, arg4, arg2, arg3, arg1, arg5);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!lu;IZLclient!lu;ZB)Lclient!ka;")
	private Class187 method4965(@OriginalArg(0) Class187_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class187_Sub2 arg3, @OriginalArg(4) boolean arg4) {
		arg0.anInt5546 = this.anInt5546;
		arg0.anInt5563 = arg1;
		arg0.aShort83 = this.aShort83;
		arg0.anInt5599 = this.anInt5599;
		arg0.anInt5583 = this.anInt5583;
		arg0.anInt5592 = this.anInt5592;
		arg0.anInt5545 = this.anInt5545;
		if ((arg1 & 0x100) == 0) {
			arg0.aBoolean399 = this.aBoolean399;
		} else {
			arg0.aBoolean399 = true;
		}
		arg0.anInt5547 = this.anInt5547;
		arg0.anInt5543 = this.anInt5543;
		arg0.aBoolean402 = this.aBoolean402;
		arg0.aShort82 = this.aShort82;
		@Pc(70) boolean local70 = Static493.method7228(this.anInt5546, arg1);
		@Pc(76) boolean local76 = Static227.method3519(this.anInt5546, arg1);
		@Pc(82) boolean local82 = Static628.method8886(arg1, this.anInt5546);
		@Pc(88) boolean local88 = local82 | local70 | local76;
		@Pc(189) int local189;
		if (local88) {
			if (!local70) {
				arg0.anIntArray301 = this.anIntArray301;
			} else if (arg3.anIntArray301 == null || arg3.anIntArray301.length < this.anInt5592) {
				arg0.anIntArray301 = arg3.anIntArray301 = new int[this.anInt5592];
			} else {
				arg0.anIntArray301 = arg3.anIntArray301;
			}
			if (!local76) {
				arg0.anIntArray295 = this.anIntArray295;
			} else if (arg3.anIntArray295 == null || arg3.anIntArray295.length < this.anInt5592) {
				arg0.anIntArray295 = arg3.anIntArray295 = new int[this.anInt5592];
			} else {
				arg0.anIntArray295 = arg3.anIntArray295;
			}
			if (!local82) {
				arg0.anIntArray300 = this.anIntArray300;
			} else if (arg3.anIntArray300 == null || arg3.anIntArray300.length < this.anInt5592) {
				arg0.anIntArray300 = arg3.anIntArray300 = new int[this.anInt5592];
			} else {
				arg0.anIntArray300 = arg3.anIntArray300;
			}
			for (local189 = 0; local189 < this.anInt5592; local189++) {
				if (local70) {
					arg0.anIntArray301[local189] = this.anIntArray301[local189];
				}
				if (local76) {
					arg0.anIntArray295[local189] = this.anIntArray295[local189];
				}
				if (local82) {
					arg0.anIntArray300[local189] = this.anIntArray300[local189];
				}
			}
		} else {
			arg0.anIntArray301 = this.anIntArray301;
			arg0.anIntArray295 = this.anIntArray295;
			arg0.anIntArray300 = this.anIntArray300;
		}
		if (Static40.method5453(arg1, this.anInt5546)) {
			arg0.aClass366_2 = arg3.aClass366_2;
			arg0.aClass366_2.aBoolean723 = this.aClass366_2.aBoolean723;
			arg0.aClass366_2.anInterface6_18 = this.aClass366_2.anInterface6_18;
			arg0.aClass366_2.aBoolean724 = true;
		} else if (Static122.method1869(arg1, this.anInt5546)) {
			arg0.aClass366_2 = this.aClass366_2;
		} else {
			arg0.aClass366_2 = null;
		}
		if (Static12.method218(this.anInt5546, arg1)) {
			if (arg3.aShortArray82 == null || arg3.aShortArray82.length < this.anInt5545) {
				arg0.aShortArray82 = arg3.aShortArray82 = new short[this.anInt5545];
			} else {
				arg0.aShortArray82 = arg3.aShortArray82;
			}
			for (local189 = 0; local189 < this.anInt5545; local189++) {
				arg0.aShortArray82[local189] = this.aShortArray82[local189];
			}
		} else {
			arg0.aShortArray82 = this.aShortArray82;
		}
		if (Static130.method1948(arg1, this.anInt5546)) {
			if (arg3.aByteArray53 == null || arg3.aByteArray53.length < this.anInt5545) {
				arg0.aByteArray53 = arg3.aByteArray53 = new byte[this.anInt5545];
			} else {
				arg0.aByteArray53 = arg3.aByteArray53;
			}
			for (local189 = 0; local189 < this.anInt5545; local189++) {
				arg0.aByteArray53[local189] = this.aByteArray53[local189];
			}
		} else {
			arg0.aByteArray53 = this.aByteArray53;
		}
		if (Static532.method7864(arg1, this.anInt5546)) {
			arg0.aClass366_1 = arg3.aClass366_1;
			arg0.aClass366_1.anInterface6_18 = this.aClass366_1.anInterface6_18;
			arg0.aClass366_1.aBoolean723 = this.aClass366_1.aBoolean723;
			arg0.aClass366_1.aBoolean724 = true;
		} else if (Static208.method3590(this.anInt5546, arg1)) {
			arg0.aClass366_1 = this.aClass366_1;
		} else {
			arg0.aClass366_1 = null;
		}
		@Pc(592) int local592;
		if (Static351.method5255(arg1, this.anInt5546)) {
			if (arg3.aShortArray79 == null || arg3.aShortArray79.length < this.anInt5583) {
				local189 = this.anInt5583;
				arg0.aShortArray79 = arg3.aShortArray79 = new short[local189];
				arg0.aShortArray78 = arg3.aShortArray78 = new short[local189];
				arg0.aShortArray84 = arg3.aShortArray84 = new short[local189];
			} else {
				arg0.aShortArray84 = arg3.aShortArray84;
				arg0.aShortArray78 = arg3.aShortArray78;
				arg0.aShortArray79 = arg3.aShortArray79;
			}
			if (this.aClass150_1 == null) {
				arg0.aClass150_1 = null;
				for (local189 = 0; local189 < this.anInt5583; local189++) {
					arg0.aShortArray79[local189] = this.aShortArray79[local189];
					arg0.aShortArray84[local189] = this.aShortArray84[local189];
					arg0.aShortArray78[local189] = this.aShortArray78[local189];
				}
			} else {
				if (arg3.aClass150_1 == null) {
					arg3.aClass150_1 = new Class150();
				}
				@Pc(580) Class150 local580 = arg0.aClass150_1 = arg3.aClass150_1;
				if (local580.aShortArray59 == null || this.anInt5583 > local580.aShortArray59.length) {
					local592 = this.anInt5583;
					local580.aShortArray58 = new short[local592];
					local580.aShortArray59 = new short[local592];
					local580.aByteArray32 = new byte[local592];
					local580.aShortArray57 = new short[local592];
				}
				for (local592 = 0; local592 < this.anInt5583; local592++) {
					arg0.aShortArray79[local592] = this.aShortArray79[local592];
					arg0.aShortArray84[local592] = this.aShortArray84[local592];
					arg0.aShortArray78[local592] = this.aShortArray78[local592];
					local580.aShortArray59[local592] = this.aClass150_1.aShortArray59[local592];
					local580.aShortArray58[local592] = this.aClass150_1.aShortArray58[local592];
					local580.aShortArray57[local592] = this.aClass150_1.aShortArray57[local592];
					local580.aByteArray32[local592] = this.aClass150_1.aByteArray32[local592];
				}
			}
			arg0.aByteArray54 = this.aByteArray54;
		} else {
			arg0.aShortArray84 = this.aShortArray84;
			arg0.aClass150_1 = this.aClass150_1;
			arg0.aShortArray79 = this.aShortArray79;
			arg0.aByteArray54 = this.aByteArray54;
			arg0.aShortArray78 = this.aShortArray78;
		}
		if (Static16.method230(this.anInt5546, arg1)) {
			arg0.aClass366_3 = arg3.aClass366_3;
			arg0.aClass366_3.aBoolean724 = true;
			arg0.aClass366_3.aBoolean723 = this.aClass366_3.aBoolean723;
			arg0.aClass366_3.anInterface6_18 = this.aClass366_3.anInterface6_18;
		} else if (Static448.method6753(this.anInt5546, arg1)) {
			arg0.aClass366_3 = this.aClass366_3;
		} else {
			arg0.aClass366_3 = null;
		}
		if (Static18.method242(arg1, this.anInt5546)) {
			if (arg3.aFloatArray44 == null || arg3.aFloatArray44.length < this.anInt5545) {
				local189 = this.anInt5583;
				arg0.aFloatArray45 = arg3.aFloatArray45 = new float[local189];
				arg0.aFloatArray44 = arg3.aFloatArray44 = new float[local189];
			} else {
				arg0.aFloatArray45 = arg3.aFloatArray45;
				arg0.aFloatArray44 = arg3.aFloatArray44;
			}
			for (local189 = 0; local189 < this.anInt5583; local189++) {
				arg0.aFloatArray44[local189] = this.aFloatArray44[local189];
				arg0.aFloatArray45[local189] = this.aFloatArray45[local189];
			}
		} else {
			arg0.aFloatArray45 = this.aFloatArray45;
			arg0.aFloatArray44 = this.aFloatArray44;
		}
		if (Static247.method4091(arg1, this.anInt5546)) {
			arg0.aClass366_4 = arg3.aClass366_4;
			arg0.aClass366_4.anInterface6_18 = this.aClass366_4.anInterface6_18;
			arg0.aClass366_4.aBoolean723 = this.aClass366_4.aBoolean723;
			arg0.aClass366_4.aBoolean724 = true;
		} else if (Static6.method112(this.anInt5546, arg1)) {
			arg0.aClass366_4 = this.aClass366_4;
		} else {
			arg0.aClass366_4 = null;
		}
		if (Static523.method7738(arg1, this.anInt5546)) {
			if (arg3.aShortArray87 == null || this.anInt5545 > arg3.aShortArray87.length) {
				local189 = this.anInt5545;
				arg0.aShortArray87 = arg3.aShortArray87 = new short[local189];
				arg0.aShortArray85 = arg3.aShortArray85 = new short[local189];
				arg0.aShortArray77 = arg3.aShortArray77 = new short[local189];
			} else {
				arg0.aShortArray87 = arg3.aShortArray87;
				arg0.aShortArray77 = arg3.aShortArray77;
				arg0.aShortArray85 = arg3.aShortArray85;
			}
			for (local189 = 0; local189 < this.anInt5545; local189++) {
				arg0.aShortArray87[local189] = this.aShortArray87[local189];
				arg0.aShortArray77[local189] = this.aShortArray77[local189];
				arg0.aShortArray85[local189] = this.aShortArray85[local189];
			}
		} else {
			arg0.aShortArray87 = this.aShortArray87;
			arg0.aShortArray85 = this.aShortArray85;
			arg0.aShortArray77 = this.aShortArray77;
		}
		if (Static476.method7031(arg1, this.anInt5546)) {
			arg0.aClass89_1 = arg3.aClass89_1;
			arg0.aClass89_1.anInterface14_3 = this.aClass89_1.anInterface14_3;
			arg0.aClass89_1.aBoolean162 = this.aClass89_1.aBoolean162;
			arg0.aClass89_1.aBoolean163 = true;
		} else if (Static301.method4667(this.anInt5546, arg1)) {
			arg0.aClass89_1 = this.aClass89_1;
		} else {
			arg0.aClass89_1 = null;
		}
		if (Static523.method7739(this.anInt5546, arg1)) {
			if (arg3.aShortArray83 == null || this.anInt5545 > arg3.aShortArray83.length) {
				local189 = this.anInt5545;
				arg0.aShortArray83 = arg3.aShortArray83 = new short[local189];
			} else {
				arg0.aShortArray83 = arg3.aShortArray83;
			}
			for (local189 = 0; local189 < this.anInt5545; local189++) {
				arg0.aShortArray83[local189] = this.aShortArray83[local189];
			}
		} else {
			arg0.aShortArray83 = this.aShortArray83;
		}
		if (!Static636.method8977(this.anInt5546, arg1)) {
			arg0.aClass180Array1 = this.aClass180Array1;
		} else if (arg3.aClass180Array1 == null || arg3.aClass180Array1.length < this.anInt5543) {
			local189 = this.anInt5543;
			arg0.aClass180Array1 = arg3.aClass180Array1 = new Class180[local189];
			for (local592 = 0; local592 < this.anInt5543; local592++) {
				arg0.aClass180Array1[local592] = this.aClass180Array1[local592].method4265();
			}
		} else {
			arg0.aClass180Array1 = arg3.aClass180Array1;
			for (local189 = 0; local189 < this.anInt5543; local189++) {
				arg0.aClass180Array1[local189].method4266(this.aClass180Array1[local189]);
			}
		}
		arg0.lb = this.lb;
		if (this.aBoolean398) {
			arg0.anInt5575 = this.anInt5575;
			arg0.anInt5565 = this.anInt5565;
			arg0.anInt5542 = this.anInt5542;
			arg0.aBoolean398 = true;
			arg0.anInt5567 = this.anInt5567;
			arg0.anInt5521 = this.anInt5521;
			arg0.anInt5554 = this.anInt5554;
			arg0.anInt5528 = this.anInt5528;
			arg0.anInt5579 = this.anInt5579;
		} else {
			arg0.aBoolean398 = false;
		}
		arg0.anIntArrayArray35 = this.anIntArrayArray35;
		arg0.anIntArrayArray36 = this.anIntArrayArray36;
		arg0.anIntArray297 = this.anIntArray297;
		arg0.aShortArray89 = this.aShortArray89;
		arg0.aShortArray81 = this.aShortArray81;
		arg0.aShortArray80 = this.aShortArray80;
		arg0.aShortArray86 = this.aShortArray86;
		arg0.aShortArray88 = this.aShortArray88;
		arg0.anIntArray296 = this.anIntArray296;
		arg0.anIntArray299 = this.anIntArray299;
		arg0.anIntArray298 = this.anIntArray298;
		arg0.aClass72Array1 = this.aClass72Array1;
		arg0.anIntArrayArray37 = this.anIntArrayArray37;
		arg0.aClass261Array4 = this.aClass261Array4;
		return arg0;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(B)V")
	private void method4966() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.aBoolean723 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8646(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = 0; local7 < this.anInt5545; local7++) {
			local16 = this.aShortArray82[local7] & 0xFFFF;
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
				local61 -= -((arg2 - local61) * arg3 >> 7);
			}
			this.aShortArray82[local7] = (short) (local22 << 10 | local28 << 7 | local61);
		}
		if (this.aClass72Array1 != null) {
			for (local16 = 0; local16 < this.anInt5543; local16++) {
				@Pc(107) Class72 local107 = this.aClass72Array1[local16];
				@Pc(112) Class180 local112 = this.aClass180Array1[local16];
				local112.anInt4726 = local112.anInt4726 & 0xFF000000 | Static349.anIntArray330[this.aShortArray82[local107.anInt1927] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method4972();
	}

	@OriginalMember(owner = "client!lu", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5599; local15++) {
			@Pc(34) int local34 = this.anIntArray295[local15] * local9 + local13 * this.anIntArray301[local15] >> 14;
			this.anIntArray295[local15] = this.anIntArray295[local15] * local13 - this.anIntArray301[local15] * local9 >> 14;
			this.anIntArray301[local15] = local34;
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!tc;ZI)Z")
	@Override
	public boolean method8642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method4974(arg0, arg4, arg2, arg3, arg1, -1);
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8657(@OriginalArg(0) Class187 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class187_Sub2 local8 = (Class187_Sub2) arg0;
		if (this.anInt5545 == 0 || local8.anInt5545 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5599;
		@Pc(27) int[] local27 = local8.anIntArray301;
		@Pc(30) int[] local30 = local8.anIntArray295;
		@Pc(33) int[] local33 = local8.anIntArray300;
		@Pc(36) short[] local36 = local8.aShortArray79;
		@Pc(39) short[] local39 = local8.aShortArray84;
		@Pc(42) short[] local42 = local8.aShortArray78;
		@Pc(45) byte[] local45 = local8.aByteArray54;
		@Pc(52) short[] local52;
		@Pc(56) short[] local56;
		@Pc(54) short[] local54;
		@Pc(50) byte[] local50;
		if (this.aClass150_1 == null) {
			local50 = null;
			local52 = null;
			local54 = null;
			local56 = null;
		} else {
			local56 = this.aClass150_1.aShortArray58;
			local52 = this.aClass150_1.aShortArray59;
			local54 = this.aClass150_1.aShortArray57;
			local50 = this.aClass150_1.aByteArray32;
		}
		@Pc(85) short[] local85;
		@Pc(83) short[] local83;
		@Pc(81) short[] local81;
		@Pc(79) byte[] local79;
		if (local8.aClass150_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local85 = local8.aClass150_1.aShortArray59;
			local83 = local8.aClass150_1.aShortArray58;
			local79 = local8.aClass150_1.aByteArray32;
			local81 = local8.aClass150_1.aShortArray57;
		}
		@Pc(106) int[] local106 = local8.anIntArray299;
		@Pc(109) short[] local109 = local8.aShortArray81;
		if (!local8.aBoolean398) {
			local8.method4959();
		}
		@Pc(118) int local118 = local8.anInt5579;
		@Pc(121) int local121 = local8.anInt5542;
		@Pc(124) int local124 = local8.anInt5528;
		@Pc(127) int local127 = local8.anInt5554;
		@Pc(130) int local130 = local8.anInt5521;
		@Pc(133) int local133 = local8.anInt5565;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5599; local135++) {
			@Pc(145) int local145 = this.anIntArray295[local135] - arg2;
			if (local118 <= local145 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray301[local135] - arg1;
				if (local165 >= local124 && local165 <= local127) {
					@Pc(185) int local185 = this.anIntArray300[local135] - arg3;
					if (local185 >= local130 && local133 >= local185) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray299[local135];
						@Pc(211) int local211 = this.anIntArray299[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray81[local213] - 1;
							if (local199 == -1 || this.aByteArray54[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(242) int local242 = 0; local242 < local24; local242++) {
								if (local165 == local27[local242] && local185 == local33[local242] && local30[local242] == local145) {
									local211 = local106[local242 + 1];
									local204 = local106[local242];
									@Pc(279) int local279 = -1;
									for (@Pc(281) int local281 = local204; local281 < local211; local281++) {
										local279 = local109[local281] - 1;
										if (local279 == -1 || local45[local279] != 0) {
											break;
										}
									}
									if (local279 != -1) {
										if (local52 == null) {
											this.aClass150_1 = new Class150();
											local52 = this.aClass150_1.aShortArray59 = Static448.method6754(this.aShortArray79);
											local56 = this.aClass150_1.aShortArray58 = Static448.method6754(this.aShortArray84);
											local54 = this.aClass150_1.aShortArray57 = Static448.method6754(this.aShortArray78);
											local50 = this.aClass150_1.aByteArray32 = Static484.method7188(this.aByteArray54);
										}
										if (local85 == null) {
											@Pc(362) Class150 local362 = local8.aClass150_1 = new Class150();
											local85 = local362.aShortArray59 = Static448.method6754(local36);
											local83 = local362.aShortArray58 = Static448.method6754(local39);
											local81 = local362.aShortArray57 = Static448.method6754(local42);
											local79 = local362.aByteArray32 = Static484.method7188(local45);
										}
										@Pc(395) short local395 = this.aShortArray79[local199];
										@Pc(400) short local400 = this.aShortArray84[local199];
										@Pc(405) short local405 = this.aShortArray78[local199];
										local211 = local106[local242 + 1];
										@Pc(416) byte local416 = this.aByteArray54[local199];
										local204 = local106[local242];
										@Pc(430) int local430;
										for (@Pc(422) int local422 = local204; local422 < local211; local422++) {
											local430 = local109[local422] - 1;
											if (local430 == -1) {
												break;
											}
											if (local79[local430] != 0) {
												local85[local430] += local395;
												local83[local430] += local400;
												local81[local430] += local405;
												local79[local430] += local416;
											}
										}
										local211 = this.anIntArray299[local135 + 1];
										local416 = local45[local279];
										local400 = local39[local279];
										local395 = local36[local279];
										local204 = this.anIntArray299[local135];
										local405 = local42[local279];
										for (local430 = local204; local430 < local211; local430++) {
											@Pc(519) int local519 = this.aShortArray81[local430] - 1;
											if (local519 == -1) {
												break;
											}
											if (local50[local519] != 0) {
												local52[local519] += local395;
												local56[local519] += local400;
												local54[local519] += local405;
												local50[local519] += local416;
											}
										}
										local8.method4964();
										this.method4964();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		@Pc(34) int local34;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5599; local15++) {
			local34 = local9 * this.anIntArray300[local15] + local13 * this.anIntArray301[local15] >> 14;
			this.anIntArray300[local15] = local13 * this.anIntArray300[local15] - local9 * this.anIntArray301[local15] >> 14;
			this.anIntArray301[local15] = local34;
		}
		for (local34 = 0; local34 < this.anInt5583; local34++) {
			@Pc(85) int local85 = local9 * this.aShortArray78[local34] + this.aShortArray79[local34] * local13 >> 14;
			this.aShortArray78[local34] = (short) (this.aShortArray78[local34] * local13 - local9 * this.aShortArray79[local34] >> 14);
			this.aShortArray79[local34] = (short) local85;
		}
		this.method4966();
		this.method4964();
		this.aBoolean398 = false;
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
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			local24 = 0;
			Static230.anInt4255 = 0;
			Static446.anInt7615 = 0;
			Static118.anInt2181 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray37.length) {
					local48 = this.anIntArrayArray37[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local56]) != 0) {
							Static230.anInt4255 += this.anIntArray301[local56];
							Static118.anInt2181 += this.anIntArray295[local56];
							local24++;
							Static446.anInt7615 += this.anIntArray300[local56];
						}
					}
				}
			}
			if (local24 <= 0) {
				Static230.anInt4255 = arg2;
				Static118.anInt2181 = arg3;
				Static446.anInt7615 = arg4;
			} else {
				Static230.anInt4255 = arg2 + Static230.anInt4255 / local24;
				Static446.anInt7615 = Static446.anInt7615 / local24 + arg4;
				Static118.anInt2181 = Static118.anInt2181 / local24 + arg3;
				Static241.aBoolean323 = true;
			}
			return;
		}
		@Pc(249) int[] local249;
		@Pc(251) int local251;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg3 * arg7[1] + arg7[0] * arg2 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg7[5] * arg4 + arg3 * arg7[4] + arg2 * arg7[3] + 8192 >> 14;
				local38 = arg7[8] * arg4 + arg3 * arg7[7] + arg7[6] * arg2 + 8192 >> 14;
				arg2 = local24;
				arg4 = local38;
				arg3 = local32;
			}
			arg2 <<= 0x4;
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray37.length > local32) {
					local249 = this.anIntArrayArray37[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local50 = local249[local251];
						if (this.aShortArray86 == null || (this.aShortArray86[local50] & arg6) != 0) {
							this.anIntArray301[local50] += arg2;
							this.anIntArray295[local50] += arg3;
							this.anIntArray300[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(392) int local392;
		@Pc(410) int local410;
		@Pc(640) int local640;
		@Pc(649) int local649;
		@Pc(658) int local658;
		@Pc(662) int local662;
		@Pc(680) int local680;
		@Pc(1004) int local1004;
		@Pc(1012) int local1012;
		@Pc(1167) int local1167;
		@Pc(1193) int local1193;
		@Pc(1198) int local1198;
		@Pc(1206) int local1206;
		@Pc(1211) int local1211;
		@Pc(1215) int local1215;
		@Pc(1219) int local1219;
		@Pc(1221) int local1221;
		@Pc(1352) int[] local1352;
		@Pc(1354) int local1354;
		@Pc(1358) int local1358;
		@Pc(1362) int local1362;
		@Pc(1364) int local1364;
		@Pc(1490) int local1490;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray37.length) {
						local249 = this.anIntArrayArray37[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local50 = local249[local251];
							if (this.aShortArray86 == null || (this.aShortArray86[local50] & arg6) != 0) {
								this.anIntArray301[local50] -= Static230.anInt4255;
								this.anIntArray295[local50] -= Static118.anInt2181;
								this.anIntArray300[local50] -= Static446.anInt7615;
								if (arg4 != 0) {
									local56 = Class377.anIntArray600[arg4];
									local392 = Class377.anIntArray601[arg4];
									local410 = local392 * this.anIntArray301[local50] + this.anIntArray295[local50] * local56 + 16383 >> 14;
									this.anIntArray295[local50] = this.anIntArray295[local50] * local392 + 16383 - this.anIntArray301[local50] * local56 >> 14;
									this.anIntArray301[local50] = local410;
								}
								if (arg2 != 0) {
									local56 = Class377.anIntArray600[arg2];
									local392 = Class377.anIntArray601[arg2];
									local410 = local392 * this.anIntArray295[local50] + 16383 - local56 * this.anIntArray300[local50] >> 14;
									this.anIntArray300[local50] = local56 * this.anIntArray295[local50] + local392 * this.anIntArray300[local50] + 16383 >> 14;
									this.anIntArray295[local50] = local410;
								}
								if (arg3 != 0) {
									local56 = Class377.anIntArray600[arg3];
									local392 = Class377.anIntArray601[arg3];
									local410 = local56 * this.anIntArray300[local50] + this.anIntArray301[local50] * local392 + 16383 >> 14;
									this.anIntArray300[local50] = local392 * this.anIntArray300[local50] + 16383 - this.anIntArray301[local50] * local56 >> 14;
									this.anIntArray301[local50] = local410;
								}
								this.anIntArray301[local50] += Static230.anInt4255;
								this.anIntArray295[local50] += Static118.anInt2181;
								this.anIntArray300[local50] += Static446.anInt7615;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray37.length) {
							local48 = this.anIntArrayArray37[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local56]) != 0) {
									local392 = this.anIntArray299[local56];
									local410 = this.anIntArray299[local56 + 1];
									for (local640 = local392; local640 < local410; local640++) {
										local649 = this.aShortArray81[local640] - 1;
										if (local649 == -1) {
											break;
										}
										if (arg4 != 0) {
											local658 = Class377.anIntArray600[arg4];
											local662 = Class377.anIntArray601[arg4];
											local680 = local662 * this.aShortArray79[local649] + this.aShortArray84[local649] * local658 + 16383 >> 14;
											this.aShortArray84[local649] = (short) (local662 * this.aShortArray84[local649] + 16383 - this.aShortArray79[local649] * local658 >> 14);
											this.aShortArray79[local649] = (short) local680;
										}
										if (arg2 != 0) {
											local658 = Class377.anIntArray600[arg2];
											local662 = Class377.anIntArray601[arg2];
											local680 = local662 * this.aShortArray84[local649] + 16383 - this.aShortArray78[local649] * local658 >> 14;
											this.aShortArray78[local649] = (short) (this.aShortArray78[local649] * local662 + local658 * this.aShortArray84[local649] + 16383 >> 14);
											this.aShortArray84[local649] = (short) local680;
										}
										if (arg3 != 0) {
											local658 = Class377.anIntArray600[arg3];
											local662 = Class377.anIntArray601[arg3];
											local680 = this.aShortArray78[local649] * local658 + this.aShortArray79[local649] * local662 + 16383 >> 14;
											this.aShortArray78[local649] = (short) (local662 * this.aShortArray78[local649] + 16383 - this.aShortArray79[local649] * local658 >> 14);
											this.aShortArray79[local649] = (short) local680;
										}
									}
								}
							}
						}
					}
					this.method4964();
					return;
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local251 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static241.aBoolean323) {
					local392 = Static118.anInt2181 * arg7[3] + Static230.anInt4255 * arg7[0] + Static446.anInt7615 * arg7[6] + 8192 >> 14;
					local410 = arg7[4] * Static118.anInt2181 + arg7[1] * Static230.anInt4255 + arg7[7] * Static446.anInt7615 + 8192 >> 14;
					local410 += local50;
					local392 += local251;
					local640 = Static446.anInt7615 * arg7[8] + Static230.anInt4255 * arg7[2] + arg7[5] * Static118.anInt2181 + 8192 >> 14;
					Static230.anInt4255 = local392;
					Static118.anInt2181 = local410;
					local640 += local56;
					Static241.aBoolean323 = false;
					Static446.anInt7615 = local640;
				}
				@Pc(972) int[] local972 = new int[9];
				local410 = Class377.anIntArray601[arg2];
				local640 = Class377.anIntArray600[arg2];
				local649 = Class377.anIntArray601[arg3];
				local658 = Class377.anIntArray600[arg3];
				local662 = Class377.anIntArray601[arg4];
				local680 = Class377.anIntArray600[arg4];
				local1004 = local640 * local662 + 8192 >> 14;
				local1012 = local640 * local680 + 8192 >> 14;
				local972[1] = -local649 * local680 + local658 * local1004 + 8192 >> 14;
				local972[5] = -local640;
				local972[4] = local662 * local410 + 8192 >> 14;
				local972[0] = local1012 * local658 + local649 * local662 + 8192 >> 14;
				local972[3] = local410 * local680 + 8192 >> 14;
				local972[8] = local410 * local649 + 8192 >> 14;
				local972[7] = local680 * local658 + local649 * local1004 + 8192 >> 14;
				local972[2] = local658 * local410 + 8192 >> 14;
				local972[6] = -local658 * local662 + local1012 * local649 + 8192 >> 14;
				@Pc(1142) int local1142 = -Static446.anInt7615 * local972[2] + -Static230.anInt4255 * local972[0] + local972[1] * -Static118.anInt2181 + 8192 >> 14;
				local1167 = local972[4] * -Static118.anInt2181 + -Static230.anInt4255 * local972[3] + local972[5] * -Static446.anInt7615 + 8192 >> 14;
				local1193 = -Static118.anInt2181 * local972[7] + local972[6] * -Static230.anInt4255 + -Static446.anInt7615 * local972[8] + 8192 >> 14;
				local1198 = local1142 + Static230.anInt4255;
				@Pc(1202) int local1202 = Static118.anInt2181 + local1167;
				local1206 = Static446.anInt7615 + local1193;
				@Pc(1209) int[] local1209 = new int[9];
				for (local1211 = 0; local1211 < 3; local1211++) {
					for (local1215 = 0; local1215 < 3; local1215++) {
						local1219 = 0;
						for (local1221 = 0; local1221 < 3; local1221++) {
							local1219 += arg7[local1221 + local1215 * 3] * local972[local1211 * 3 + local1221];
						}
						local1209[local1211 * 3 + local1215] = local1219 + 8192 >> 14;
					}
				}
				local1215 = local972[2] * local56 + local972[1] * local50 + local251 * local972[0] + 8192 >> 14;
				local1219 = local56 * local972[5] + local972[4] * local50 + local972[3] * local251 + 8192 >> 14;
				local1221 = local972[7] * local50 + local251 * local972[6] + local972[8] * local56 + 8192 >> 14;
				local1219 += local1202;
				local1215 += local1198;
				local1221 += local1206;
				local1352 = new int[9];
				for (local1354 = 0; local1354 < 3; local1354++) {
					for (local1358 = 0; local1358 < 3; local1358++) {
						local1362 = 0;
						for (local1364 = 0; local1364 < 3; local1364++) {
							local1362 += local1209[local1358 + local1364 * 3] * arg7[local1364 + local1354 * 3];
						}
						local1352[local1358 + local1354 * 3] = local1362 + 8192 >> 14;
					}
				}
				local1358 = arg7[0] * local1215 + arg7[1] * local1219 + arg7[2] * local1221 + 8192 >> 14;
				local1362 = local1221 * arg7[5] + arg7[4] * local1219 + arg7[3] * local1215 + 8192 >> 14;
				local1364 = arg7[8] * local1221 + arg7[6] * local1215 + arg7[7] * local1219 + 8192 >> 14;
				local1362 += local32;
				local1358 += local24;
				local1364 += local38;
				for (local1490 = 0; local1490 < local8; local1490++) {
					@Pc(1496) int local1496 = arg1[local1490];
					if (this.anIntArrayArray37.length > local1496) {
						@Pc(1510) int[] local1510 = this.anIntArrayArray37[local1496];
						for (@Pc(1512) int local1512 = 0; local1512 < local1510.length; local1512++) {
							@Pc(1518) int local1518 = local1510[local1512];
							if (this.aShortArray86 == null || (this.aShortArray86[local1518] & arg6) != 0) {
								@Pc(1559) int local1559 = local1352[1] * this.anIntArray295[local1518] + this.anIntArray301[local1518] * local1352[0] + this.anIntArray300[local1518] * local1352[2] + 8192 >> 14;
								@Pc(1590) int local1590 = this.anIntArray301[local1518] * local1352[3] + local1352[4] * this.anIntArray295[local1518] + local1352[5] * this.anIntArray300[local1518] + 8192 >> 14;
								@Pc(1594) int local1594 = local1590 + local1362;
								@Pc(1598) int local1598 = local1559 + local1358;
								@Pc(1631) int local1631 = local1352[6] * this.anIntArray301[local1518] + local1352[7] * this.anIntArray295[local1518] + this.anIntArray300[local1518] * local1352[8] + 8192 >> 14;
								this.anIntArray301[local1518] = local1598;
								@Pc(1640) int local1640 = local1631 + local1364;
								this.anIntArray295[local1518] = local1594;
								this.anIntArray300[local1518] = local1640;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2581) Class180 local2581;
			@Pc(2468) boolean local2468;
			@Pc(2576) Class72 local2576;
			if (arg0 == 5) {
				if (this.anIntArrayArray36 != null) {
					local2468 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray36.length > local38) {
							local48 = this.anIntArrayArray36[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local56]) != 0) {
									local392 = arg2 * 8 + (this.aByteArray53[local56] & 0xFF);
									if (local392 < 0) {
										local392 = 0;
									} else if (local392 > 255) {
										local392 = 255;
									}
									this.aByteArray53[local56] = (byte) local392;
								}
							}
							local2468 |= local48.length > 0;
						}
					}
					if (local2468) {
						if (this.aClass72Array1 != null) {
							for (local38 = 0; local38 < this.anInt5543; local38++) {
								local2576 = this.aClass72Array1[local38];
								local2581 = this.aClass180Array1[local38];
								local2581.anInt4726 = 255 - (this.aByteArray53[local2576.anInt1927] & 0xFF) << 24 | local2581.anInt4726 & 0xFFFFFF;
							}
						}
						this.method4972();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray36 != null) {
					local2468 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray36.length) {
							local48 = this.anIntArrayArray36[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray80 == null || (arg6 & this.aShortArray80[local56]) != 0) {
									local392 = this.aShortArray82[local56] & 0xFFFF;
									local410 = local392 >> 10 & 0x3F;
									local640 = local392 >> 7 & 0x7;
									local649 = local392 & 0x7F;
									local640 += arg3 / 4;
									@Pc(2696) int local2696 = arg2 + local410 & 0x3F;
									local649 += arg4;
									if (local640 < 0) {
										local640 = 0;
									} else if (local640 > 7) {
										local640 = 7;
									}
									if (local649 < 0) {
										local649 = 0;
									} else if (local649 > 127) {
										local649 = 127;
									}
									this.aShortArray82[local56] = (short) (local649 | local2696 << 10 | local640 << 7);
								}
							}
							local2468 |= local48.length > 0;
						}
					}
					if (local2468) {
						if (this.aClass72Array1 != null) {
							for (local38 = 0; local38 < this.anInt5543; local38++) {
								local2576 = this.aClass72Array1[local38];
								local2581 = this.aClass180Array1[local38];
								local2581.anInt4726 = Static349.anIntArray330[this.aShortArray82[local2576.anInt1927] & 0xFFFF] & 0xFFFFFF | local2581.anInt4726 & 0xFF000000;
							}
						}
						this.method4972();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray35 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray35.length) {
							local249 = this.anIntArrayArray35[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2581 = this.aClass180Array1[local249[local251]];
								local2581.anInt4723 += arg3;
								local2581.anInt4724 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray35 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray35.length > local32) {
							local249 = this.anIntArrayArray35[local32];
							for (local251 = 0; local251 < local249.length; local251++) {
								local2581 = this.aClass180Array1[local249[local251]];
								local2581.anInt4721 = local2581.anInt4721 * arg3 >> 7;
								local2581.anInt4728 = local2581.anInt4728 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray35 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray35.length > local32) {
						local249 = this.anIntArrayArray35[local32];
						for (local251 = 0; local251 < local249.length; local251++) {
							local2581 = this.aClass180Array1[local249[local251]];
							local2581.anInt4722 = arg2 + local2581.anInt4722 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray37.length) {
					local249 = this.anIntArrayArray37[local32];
					for (local251 = 0; local251 < local249.length; local251++) {
						local50 = local249[local251];
						if (this.aShortArray86 == null || (arg6 & this.aShortArray86[local50]) != 0) {
							this.anIntArray301[local50] -= Static230.anInt4255;
							this.anIntArray295[local50] -= Static118.anInt2181;
							this.anIntArray300[local50] -= Static446.anInt7615;
							this.anIntArray301[local50] = arg2 * this.anIntArray301[local50] >> 7;
							this.anIntArray295[local50] = arg3 * this.anIntArray295[local50] >> 7;
							this.anIntArray300[local50] = arg4 * this.anIntArray300[local50] >> 7;
							this.anIntArray301[local50] += Static230.anInt4255;
							this.anIntArray295[local50] += Static118.anInt2181;
							this.anIntArray300[local50] += Static446.anInt7615;
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
			if (Static241.aBoolean323) {
				local392 = arg7[3] * Static118.anInt2181 + Static230.anInt4255 * arg7[0] + Static446.anInt7615 * arg7[6] + 8192 >> 14;
				local410 = Static230.anInt4255 * arg7[1] + Static118.anInt2181 * arg7[4] + arg7[7] * Static446.anInt7615 + 8192 >> 14;
				local410 += local50;
				local640 = arg7[8] * Static446.anInt7615 + arg7[5] * Static118.anInt2181 + arg7[2] * Static230.anInt4255 + 8192 >> 14;
				local392 += local251;
				Static230.anInt4255 = local392;
				Static118.anInt2181 = local410;
				local640 += local56;
				Static241.aBoolean323 = false;
				Static446.anInt7615 = local640;
			}
			local392 = arg2 << 15 >> 7;
			local410 = arg3 << 15 >> 7;
			local640 = arg4 << 15 >> 7;
			local649 = -Static230.anInt4255 * local392 + 8192 >> 14;
			local658 = local410 * -Static118.anInt2181 + 8192 >> 14;
			local662 = -Static446.anInt7615 * local640 + 8192 >> 14;
			local680 = Static230.anInt4255 + local649;
			local1004 = Static118.anInt2181 + local658;
			local1012 = local662 + Static446.anInt7615;
			@Pc(1992) int[] local1992 = new int[] { local392 * arg7[0] + 8192 >> 14, local392 * arg7[3] + 8192 >> 14, local392 * arg7[6] + 8192 >> 14, arg7[1] * local410 + 8192 >> 14, arg7[4] * local410 + 8192 >> 14, local410 * arg7[7] + 8192 >> 14, arg7[2] * local640 + 8192 >> 14, arg7[5] * local640 + 8192 >> 14, arg7[8] * local640 + 8192 >> 14 };
			local1167 = local251 * local392 + 8192 >> 14;
			local1193 = local50 * local410 + 8192 >> 14;
			@Pc(2120) int local2120 = local1193 + local1004;
			@Pc(2124) int local2124 = local1167 + local680;
			local1198 = local56 * local640 + 8192 >> 14;
			@Pc(2136) int local2136 = local1198 + local1012;
			@Pc(2139) int[] local2139 = new int[9];
			@Pc(2145) int local2145;
			for (local1206 = 0; local1206 < 3; local1206++) {
				for (local2145 = 0; local2145 < 3; local2145++) {
					local1211 = 0;
					for (local1215 = 0; local1215 < 3; local1215++) {
						local1211 += local1992[local2145 + local1215 * 3] * arg7[local1206 * 3 + local1215];
					}
					local2139[local1206 * 3 + local2145] = local1211 + 8192 >> 14;
				}
			}
			local2145 = local2120 * arg7[1] + arg7[0] * local2124 + local2136 * arg7[2] + 8192 >> 14;
			local1211 = arg7[5] * local2136 + local2120 * arg7[4] + local2124 * arg7[3] + 8192 >> 14;
			local1211 += local32;
			local2145 += local24;
			local1215 = arg7[7] * local2120 + local2124 * arg7[6] + arg7[8] * local2136 + 8192 >> 14;
			local1215 += local38;
			for (local1219 = 0; local1219 < local8; local1219++) {
				local1221 = arg1[local1219];
				if (this.anIntArrayArray37.length > local1221) {
					local1352 = this.anIntArrayArray37[local1221];
					for (local1354 = 0; local1354 < local1352.length; local1354++) {
						local1358 = local1352[local1354];
						if (this.aShortArray86 == null || (this.aShortArray86[local1358] & arg6) != 0) {
							local1362 = this.anIntArray300[local1358] * local2139[2] + local2139[1] * this.anIntArray295[local1358] + this.anIntArray301[local1358] * local2139[0] + 8192 >> 14;
							local1364 = local2139[3] * this.anIntArray301[local1358] + local2139[4] * this.anIntArray295[local1358] + local2139[5] * this.anIntArray300[local1358] + 8192 >> 14;
							local1490 = this.anIntArray300[local1358] * local2139[8] + this.anIntArray301[local1358] * local2139[6] + local2139[7] * this.anIntArray295[local1358] + 8192 >> 14;
							@Pc(2417) int local2417 = local1362 + local2145;
							@Pc(2421) int local2421 = local1364 + local1211;
							this.anIntArray301[local1358] = local2417;
							@Pc(2430) int local2430 = local1490 + local1215;
							this.anIntArray295[local1358] = local2421;
							this.anIntArray300[local1358] = local2430;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5599; local15++) {
			@Pc(33) int local33 = this.anIntArray295[local15] * local13 - local9 * this.anIntArray300[local15] >> 14;
			this.anIntArray300[local15] = local13 * this.anIntArray300[local15] + local9 * this.anIntArray295[local15] >> 14;
			this.anIntArray295[local15] = local33;
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean402;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!tc;)V")
	@Override
	public void method8638(@OriginalArg(0) Class113 arg0) {
		@Pc(8) Class113_Sub1 local8 = (Class113_Sub1) arg0;
		@Pc(13) int local13;
		if (this.aClass261Array4 != null) {
			for (local13 = 0; local13 < this.aClass261Array4.length; local13++) {
				@Pc(20) Class261 local20 = this.aClass261Array4[local13];
				@Pc(22) Class261 local22 = local20;
				if (local20.aClass261_2 != null) {
					local22 = local20.aClass261_2;
				}
				local22.anInt7176 = (int) (local8.aFloat37 + local8.aFloat38 * (float) this.anIntArray300[local20.anInt7181] + local8.aFloat39 * (float) this.anIntArray301[local20.anInt7181] + local8.aFloat46 * (float) this.anIntArray295[local20.anInt7181]);
				local22.anInt7169 = (int) (local8.aFloat36 + local8.aFloat44 * (float) this.anIntArray295[local20.anInt7181] + (float) this.anIntArray301[local20.anInt7181] * local8.aFloat40 + local8.aFloat41 * (float) this.anIntArray300[local20.anInt7181]);
				local22.anInt7182 = (int) (local8.aFloat45 * (float) this.anIntArray300[local20.anInt7181] + (float) this.anIntArray301[local20.anInt7181] * local8.aFloat43 + (float) this.anIntArray295[local20.anInt7181] * local8.aFloat42 + local8.aFloat47);
				local22.anInt7180 = (int) (local8.aFloat37 + local8.aFloat38 * (float) this.anIntArray300[local20.anInt7170] + local8.aFloat39 * (float) this.anIntArray301[local20.anInt7170] + local8.aFloat46 * (float) this.anIntArray295[local20.anInt7170]);
				local22.anInt7173 = (int) (local8.aFloat44 * (float) this.anIntArray295[local20.anInt7170] + (float) this.anIntArray301[local20.anInt7170] * local8.aFloat40 + local8.aFloat41 * (float) this.anIntArray300[local20.anInt7170] + local8.aFloat36);
				local22.anInt7166 = (int) (local8.aFloat43 * (float) this.anIntArray301[local20.anInt7170] + local8.aFloat42 * (float) this.anIntArray295[local20.anInt7170] + local8.aFloat45 * (float) this.anIntArray300[local20.anInt7170] + local8.aFloat47);
				local22.anInt7177 = (int) (local8.aFloat39 * (float) this.anIntArray301[local20.anInt7167] + (float) this.anIntArray295[local20.anInt7167] * local8.aFloat46 + local8.aFloat38 * (float) this.anIntArray300[local20.anInt7167] + local8.aFloat37);
				local22.anInt7168 = (int) ((float) this.anIntArray301[local20.anInt7167] * local8.aFloat40 + local8.aFloat44 * (float) this.anIntArray295[local20.anInt7167] + local8.aFloat41 * (float) this.anIntArray300[local20.anInt7167] + local8.aFloat36);
				local22.anInt7174 = (int) ((float) this.anIntArray300[local20.anInt7167] * local8.aFloat45 + local8.aFloat42 * (float) this.anIntArray295[local20.anInt7167] + (float) this.anIntArray301[local20.anInt7167] * local8.aFloat43 + local8.aFloat47);
			}
		}
		if (this.lb == null) {
			return;
		}
		for (local13 = 0; local13 < this.lb.length; local13++) {
			@Pc(361) Class320 local361 = this.lb[local13];
			@Pc(363) Class320 local363 = local361;
			if (local361.aClass320_2 != null) {
				local363 = local361.aClass320_2;
			}
			if (local361.aClass113_8 == null) {
				local361.aClass113_8 = local8.method8446();
			} else {
				local361.aClass113_8.method8456(local8);
			}
			local363.anInt8926 = (int) (local8.aFloat37 + (float) this.anIntArray300[local361.anInt8924] * local8.aFloat38 + (float) this.anIntArray301[local361.anInt8924] * local8.aFloat39 + local8.aFloat46 * (float) this.anIntArray295[local361.anInt8924]);
			local363.anInt8923 = (int) (local8.aFloat36 + local8.aFloat41 * (float) this.anIntArray300[local361.anInt8924] + (float) this.anIntArray301[local361.anInt8924] * local8.aFloat40 + (float) this.anIntArray295[local361.anInt8924] * local8.aFloat44);
			local363.anInt8925 = (int) (local8.aFloat47 + (float) this.anIntArray300[local361.anInt8924] * local8.aFloat45 + local8.aFloat43 * (float) this.anIntArray301[local361.anInt8924] + local8.aFloat42 * (float) this.anIntArray295[local361.anInt8924]);
		}
	}

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "(I)Z")
	private boolean method4968() {
		@Pc(13) boolean local13 = !this.aClass366_1.aBoolean723;
		@Pc(26) boolean local26 = (this.anInt5546 & 0x37) != 0 && !this.aClass366_3.aBoolean723;
		@Pc(34) boolean local34 = !this.aClass366_2.aBoolean723;
		@Pc(42) boolean local42 = !this.aClass366_4.aBoolean723;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(54) boolean local54 = true;
		@Pc(73) Interface6 local73;
		@Pc(87) Buffer local87;
		if (local34) {
			if (this.aClass366_2.anInterface6_17 == null) {
				this.aClass366_2.anInterface6_17 = this.aClass133_Sub1_8.method6196(this.aBoolean401);
			}
			local73 = this.aClass366_2.anInterface6_17;
			local73.method4124(this.anInt5583 * 12, 12);
			local87 = local73.method4126();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass133_Sub1_8.aNativeInterface3.copyPositions(this.anIntArray301, this.anIntArray295, this.anIntArray300, this.aShortArray88, 0, 12, this.anInt5583, local87.getAddress());
				if (local73.method4123()) {
					this.aClass366_2.aBoolean723 = true;
					this.aClass366_2.anInterface6_18 = local73;
				} else {
					local54 = false;
				}
			}
		}
		@Pc(186) short[] local186;
		@Pc(183) short[] local183;
		@Pc(177) short[] local177;
		@Pc(180) byte[] local180;
		if (local13) {
			if (this.aClass366_1.anInterface6_17 == null) {
				this.aClass366_1.anInterface6_17 = this.aClass133_Sub1_8.method6196(this.aBoolean401);
			}
			local73 = this.aClass366_1.anInterface6_17;
			local73.method4124(this.anInt5583 * 4, 4);
			local87 = local73.method4126();
			if (local87 == null) {
				local54 = false;
			} else {
				if ((this.anInt5546 & 0x37) == 0) {
					if (this.aClass150_1 == null) {
						local177 = this.aShortArray78;
						local180 = this.aByteArray54;
						local183 = this.aShortArray84;
						local186 = this.aShortArray79;
					} else {
						local183 = this.aClass150_1.aShortArray58;
						local180 = this.aClass150_1.aByteArray32;
						local186 = this.aClass150_1.aShortArray59;
						local177 = this.aClass150_1.aShortArray57;
					}
					this.aClass133_Sub1_8.aNativeInterface3.copyLighting(this.aShortArray82, this.aByteArray53, this.aShortArray83, local186, local183, local177, local180, this.aShort82, this.aShort83, this.aShortArray89, 0, 4, this.anInt5583, local87.getAddress());
				} else {
					this.aClass133_Sub1_8.aNativeInterface3.copyColours(this.aShortArray82, this.aByteArray53, this.aShortArray83, this.aShort82, this.aShortArray89, 0, 4, this.anInt5583, local87.getAddress());
				}
				if (local73.method4123()) {
					this.aClass366_1.aBoolean723 = true;
					this.aClass366_1.anInterface6_18 = local73;
				} else {
					local54 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass366_3.anInterface6_17 == null) {
				this.aClass366_3.anInterface6_17 = this.aClass133_Sub1_8.method6196(this.aBoolean401);
			}
			local73 = this.aClass366_3.anInterface6_17;
			local73.method4124(this.anInt5583 * 12, 12);
			local87 = local73.method4126();
			if (local87 == null) {
				local54 = false;
			} else {
				if (this.aClass150_1 == null) {
					local177 = this.aShortArray78;
					local180 = this.aByteArray54;
					local183 = this.aShortArray84;
					local186 = this.aShortArray79;
				} else {
					local180 = this.aClass150_1.aByteArray32;
					local183 = this.aClass150_1.aShortArray58;
					local177 = this.aClass150_1.aShortArray57;
					local186 = this.aClass150_1.aShortArray59;
				}
				this.aClass133_Sub1_8.aNativeInterface3.copyNormals(local186, local183, local177, local180, 3.0F / (float) this.aShort83, 3.0F / (float) (this.aShort83 + this.aShort83 / 2), 0, 12, this.anInt5583, local87.getAddress());
				if (local73.method4123()) {
					this.aClass366_3.anInterface6_18 = local73;
					this.aClass366_3.aBoolean723 = true;
				} else {
					local54 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass366_4.anInterface6_17 == null) {
				this.aClass366_4.anInterface6_17 = this.aClass133_Sub1_8.method6196(this.aBoolean401);
			}
			local73 = this.aClass366_4.anInterface6_17;
			local73.method4124(this.anInt5583 * 8, 8);
			local87 = local73.method4126();
			if (local87 == null) {
				local54 = false;
			} else {
				this.aClass133_Sub1_8.aNativeInterface3.copyTexCoords(this.aFloatArray44, this.aFloatArray45, 0, 8, this.anInt5583, local87.getAddress());
				if (local73.method4123()) {
					this.aClass366_4.aBoolean723 = true;
					this.aClass366_4.anInterface6_18 = local73;
				} else {
					local54 = false;
				}
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!lu", name = "b", descriptor = "()Z")
	@Override
	public boolean method8649() {
		if (this.aShortArray83 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray83.length; local12++) {
			if (this.aShortArray83[local12] != -1 && !this.aClass133_Sub1_8.anInterface3_12.method4654(this.aShortArray83[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "f", descriptor = "(B)V")
	private void method4969() {
		if (this.aClass89_1 != null) {
			this.aClass89_1.aBoolean162 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIZIII)Z")
	private boolean method4970(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg7 > arg0 && arg0 < arg2 && arg4 > arg0) {
			return false;
		} else if (arg0 > arg7 && arg0 > arg2 && arg4 < arg0) {
			return false;
		} else if (arg3 > arg6 && arg6 < arg5 && arg1 > arg6) {
			return false;
		} else {
			return arg3 >= arg6 || arg5 >= arg6 || arg1 >= arg6;
		}
	}

	@OriginalMember(owner = "client!lu", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5567;
	}

	@OriginalMember(owner = "client!lu", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5563;
	}

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "(B)V")
	private void method4971() {
		if (this.anInt5547 == 0) {
			return;
		}
		if (this.method4968() && this.method4958()) {
			this.aClass133_Sub1_8.method6215(this.aClass366_2.anInterface6_18, 0);
			this.aClass133_Sub1_8.method6215(this.aClass366_1.anInterface6_18, 1);
			this.aClass133_Sub1_8.method6215(this.aClass366_4.anInterface6_18, 2);
			@Pc(56) boolean local56;
			if ((this.anInt5546 & 0x37) == 0) {
				local56 = false;
				this.aClass133_Sub1_8.method6252(false);
				this.aClass133_Sub1_8.method6217(this.aClass133_Sub1_8.aClass90_18);
			} else {
				this.aClass133_Sub1_8.method6252(true);
				local56 = true;
				this.aClass133_Sub1_8.method6215(this.aClass366_3.anInterface6_18, 3);
				this.aClass133_Sub1_8.method6217(this.aClass133_Sub1_8.aClass90_16);
			}
			for (@Pc(89) int local89 = 0; local89 < this.anIntArray296.length; local89++) {
				@Pc(96) int local96 = this.anIntArray298[local89];
				@Pc(103) int local103 = this.anIntArray298[local89 + 1];
				@Pc(110) int local110 = this.aShortArray83[local96] & 0xFFFF;
				if (local110 == 65535) {
					local110 = -1;
				}
				this.aClass133_Sub1_8.method6277(true, local110, local56);
				this.aClass133_Sub1_8.method6194(local103 - local96, this.anIntArray297[local89], this.anIntArray296[local89], this.aClass89_1.anInterface14_3, local96 * 3, Static68.aClass303_2);
			}
		}
		this.method4975();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!tc;IZ)V")
	@Override
	public void method8659(@OriginalArg(0) Class113 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray86 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5599; local14++) {
			if ((this.aShortArray86[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method8445(this.anIntArray301[local14], this.anIntArray295[local14], this.anIntArray300[local14], local12);
				} else {
					arg0.method8448(this.anIntArray301[local14], this.anIntArray295[local14], this.anIntArray300[local14], local12);
				}
				this.anIntArray301[local14] = local12[0];
				this.anIntArray295[local14] = local12[1];
				this.anIntArray300[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort83;
	}

	@OriginalMember(owner = "client!lu", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5528;
	}

	@OriginalMember(owner = "client!lu", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5599; local3++) {
			this.anIntArray300[local3] = -this.anIntArray300[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt5583; local29++) {
			this.aShortArray78[local29] = (short) -this.aShortArray78[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5545; local48++) {
			@Pc(55) short local55 = this.aShortArray87[local48];
			this.aShortArray87[local48] = this.aShortArray85[local48];
			this.aShortArray85[local48] = local55;
		}
		this.method4966();
		this.method4964();
		this.method4969();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!tc;Lclient!qw;II)V")
	@Override
	public void method8654(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5583 == 0) {
			return;
		}
		@Pc(16) Class113_Sub1 local16 = this.aClass133_Sub1_8.aClass113_Sub1_16;
		@Pc(19) Class113_Sub1 local19 = (Class113_Sub1) arg0;
		if (!this.aBoolean398) {
			this.method4959();
		}
		Static467.aFloat142 = local16.aFloat47 + local16.aFloat43 * local19.aFloat37 + local16.aFloat42 * local19.aFloat36 + local16.aFloat45 * local19.aFloat47;
		Static569.aFloat184 = local16.aFloat45 * local19.aFloat42 + local16.aFloat43 * local19.aFloat46 + local16.aFloat42 * local19.aFloat44;
		@Pc(72) float local72 = (float) this.anInt5579 * Static569.aFloat184 + Static467.aFloat142;
		@Pc(80) float local80 = Static467.aFloat142 + (float) this.anInt5542 * Static569.aFloat184;
		@Pc(96) float local96;
		@Pc(90) float local90;
		if (local80 < local72) {
			local90 = local72 + (float) this.anInt5567;
			local96 = local80 - (float) this.anInt5567;
		} else {
			local96 = (float) -this.anInt5567 + local72;
			local90 = (float) this.anInt5567 + local80;
		}
		if (this.aClass133_Sub1_8.aFloat123 <= local96 || (float) this.aClass133_Sub1_8.anInt7002 >= local90) {
			return;
		}
		Static217.aFloat89 = local19.aFloat37 * local16.aFloat39 + local16.aFloat46 * local19.aFloat36 + local19.aFloat47 * local16.aFloat38 + local16.aFloat37;
		Static411.aFloat134 = local19.aFloat42 * local16.aFloat38 + local16.aFloat46 * local19.aFloat44 + local16.aFloat39 * local19.aFloat46;
		@Pc(173) float local173 = Static217.aFloat89 + (float) this.anInt5579 * Static411.aFloat134;
		@Pc(181) float local181 = Static411.aFloat134 * (float) this.anInt5542 + Static217.aFloat89;
		@Pc(208) float local208;
		@Pc(196) float local196;
		if (local181 < local173) {
			local196 = (float) this.aClass133_Sub1_8.anInt7008 * (local173 + (float) this.anInt5567);
			local208 = ((float) -this.anInt5567 + local181) * (float) this.aClass133_Sub1_8.anInt7008;
		} else {
			local208 = (float) this.aClass133_Sub1_8.anInt7008 * (local173 - (float) this.anInt5567);
			local196 = (local181 + (float) this.anInt5567) * (float) this.aClass133_Sub1_8.anInt7008;
		}
		if (local208 / (float) arg2 >= this.aClass133_Sub1_8.aFloat133 || local196 / (float) arg2 <= this.aClass133_Sub1_8.aFloat121) {
			return;
		}
		Static583.aFloat185 = local16.aFloat41 * local19.aFloat47 + local16.aFloat40 * local19.aFloat37 + local16.aFloat44 * local19.aFloat36 + local16.aFloat36;
		Static299.aFloat94 = local19.aFloat46 * local16.aFloat40 + local19.aFloat44 * local16.aFloat44 + local16.aFloat41 * local19.aFloat42;
		@Pc(299) float local299 = Static583.aFloat185 + (float) this.anInt5579 * Static299.aFloat94;
		@Pc(307) float local307 = Static583.aFloat185 + (float) this.anInt5542 * Static299.aFloat94;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local307 < local299) {
			local322 = (float) this.aClass133_Sub1_8.anInt7013 * (local307 - (float) this.anInt5567);
			local333 = (local299 + (float) this.anInt5567) * (float) this.aClass133_Sub1_8.anInt7013;
		} else {
			local322 = (local299 - (float) this.anInt5567) * (float) this.aClass133_Sub1_8.anInt7013;
			local333 = (local307 + (float) this.anInt5567) * (float) this.aClass133_Sub1_8.anInt7013;
		}
		if (local322 / (float) arg2 >= this.aClass133_Sub1_8.aFloat118 || local333 / (float) arg2 <= this.aClass133_Sub1_8.aFloat117) {
			return;
		}
		if (arg1 != null || this.aClass72Array1 != null) {
			Static315.aFloat115 = local16.aFloat40 * local19.aFloat38 + local16.aFloat44 * local19.aFloat41 + local19.aFloat45 * local16.aFloat41;
			Static19.aFloat5 = local19.aFloat39 * local16.aFloat39 + local16.aFloat46 * local19.aFloat40 + local19.aFloat43 * local16.aFloat38;
			Static217.aFloat88 = local16.aFloat42 * local19.aFloat40 + local19.aFloat39 * local16.aFloat43 + local19.aFloat43 * local16.aFloat45;
			Static223.aFloat90 = local19.aFloat41 * local16.aFloat46 + local16.aFloat39 * local19.aFloat38 + local19.aFloat45 * local16.aFloat38;
			Static382.aFloat99 = local16.aFloat43 * local19.aFloat38 + local16.aFloat42 * local19.aFloat41 + local16.aFloat45 * local19.aFloat45;
			Static513.aFloat8 = local16.aFloat41 * local19.aFloat43 + local19.aFloat39 * local16.aFloat40 + local19.aFloat40 * local16.aFloat44;
		}
		if (arg1 != null) {
			@Pc(500) int local500 = this.anInt5554 + this.anInt5528 >> 1;
			@Pc(509) int local509 = this.anInt5521 + this.anInt5565 >> 1;
			@Pc(528) int local528 = (int) (Static223.aFloat90 * (float) local509 + Static217.aFloat89 + (float) local500 * Static19.aFloat5 + Static411.aFloat134 * (float) this.anInt5579);
			@Pc(547) int local547 = (int) ((float) this.anInt5579 * Static299.aFloat94 + Static513.aFloat8 * (float) local500 + Static583.aFloat185 + Static315.aFloat115 * (float) local509);
			@Pc(566) int local566 = (int) (Static382.aFloat99 * (float) local509 + Static569.aFloat184 * (float) this.anInt5579 + Static467.aFloat142 + Static217.aFloat88 * (float) local500);
			@Pc(585) int local585 = (int) ((float) local509 * Static223.aFloat90 + (float) this.anInt5542 * Static411.aFloat134 + Static19.aFloat5 * (float) local500 + Static217.aFloat89);
			@Pc(604) int local604 = (int) (Static513.aFloat8 * (float) local500 + Static583.aFloat185 + Static299.aFloat94 * (float) this.anInt5542 + (float) local509 * Static315.aFloat115);
			arg1.anInt7892 = local547 * this.aClass133_Sub1_8.anInt7013 / arg2 + this.aClass133_Sub1_8.anInt7007;
			arg1.anInt7890 = this.aClass133_Sub1_8.anInt6980 + this.aClass133_Sub1_8.anInt7008 * local528 / arg2;
			@Pc(650) int local650 = (int) (Static382.aFloat99 * (float) local509 + Static217.aFloat88 * (float) local500 + Static467.aFloat142 + Static569.aFloat184 * (float) this.anInt5542);
			arg1.anInt7891 = this.aClass133_Sub1_8.anInt7007 + local604 * this.aClass133_Sub1_8.anInt7013 / arg2;
			arg1.anInt7893 = this.aClass133_Sub1_8.anInt6980 + local585 * this.aClass133_Sub1_8.anInt7008 / arg2;
			if (this.aClass133_Sub1_8.anInt7002 <= local566 || this.aClass133_Sub1_8.anInt7002 <= local650) {
				arg1.aBoolean558 = true;
				arg1.anInt7894 = (local528 + this.anInt5567) * this.aClass133_Sub1_8.anInt7008 / arg2 + this.aClass133_Sub1_8.anInt6980 - arg1.anInt7890;
			}
		}
		this.aClass133_Sub1_8.method6254((float) arg2);
		this.aClass133_Sub1_8.method6199();
		this.aClass133_Sub1_8.method6200(local19);
		this.method4971();
		this.method4962();
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "()V")
	@Override
	public void method8651() {
		if (this.anInt5583 > 0 && this.anInt5547 > 0) {
			this.method4968();
			this.method4958();
			this.method4975();
		}
	}

	@OriginalMember(owner = "client!lu", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class61 arg2, @OriginalArg(3) Class61 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean398) {
			this.method4959();
		}
		@Pc(17) int local17 = arg4 + this.anInt5528;
		@Pc(22) int local22 = arg4 + this.anInt5554;
		@Pc(27) int local27 = arg6 + this.anInt5521;
		@Pc(33) int local33 = arg6 + this.anInt5565;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local17 < 0 || arg2.anInt10027 + local22 >> arg2.anInt10031 >= arg2.anInt10026 || local27 < 0 || arg2.anInt10029 <= local33 + arg2.anInt10027 >> arg2.anInt10031)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local17 < 0 || arg3.anInt10027 + local22 >> arg3.anInt10031 >= arg3.anInt10026 || local27 < 0 || local33 + arg3.anInt10027 >> arg3.anInt10031 >= arg3.anInt10029) {
				return;
			}
		} else {
			local17 >>= arg2.anInt10031;
			local22 = arg2.anInt10027 + local22 - 1 >> arg2.anInt10031;
			local27 >>= arg2.anInt10031;
			local33 = local33 + arg2.anInt10027 - 1 >> arg2.anInt10031;
			if (arg5 == arg2.method8580(local27, local17) && arg5 == arg2.method8580(local27, local22) && arg5 == arg2.method8580(local33, local17) && arg5 == arg2.method8580(local33, local22)) {
				return;
			}
		}
		@Pc(196) int local196;
		if (arg0 == 1) {
			for (local196 = 0; local196 < this.anInt5599; local196++) {
				this.anIntArray295[local196] = this.anIntArray295[local196] + arg2.method8584(this.anIntArray300[local196] + arg6, arg4 + this.anIntArray301[local196]) - arg5;
			}
		} else {
			@Pc(204) int local204;
			@Pc(212) int local212;
			if (arg0 == 2) {
				local196 = this.anInt5579;
				if (local196 == 0) {
					return;
				}
				for (local204 = 0; local204 < this.anInt5599; local204++) {
					local212 = (this.anIntArray295[local204] << 16) / local196;
					if (local212 < arg1) {
						this.anIntArray295[local204] -= -((arg2.method8584(arg6 + this.anIntArray300[local204], arg4 + this.anIntArray301[local204]) - arg5) * (-local212 + arg1) / arg1);
					}
				}
			} else {
				@Pc(220) int local220;
				if (arg0 == 3) {
					local196 = (arg1 & 0xFF) * 4;
					local204 = (arg1 >> 8 & 0xFF) * 4;
					local212 = (arg1 >> 16 & 0xFF) << 6;
					local220 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local196 >> 1) < 0 || arg2.anInt10026 << arg2.anInt10031 <= (local196 >> 1) + arg4 + arg2.anInt10027 || arg6 - (local204 >> 1) < 0 || arg2.anInt10029 << arg2.anInt10031 <= (local204 >> 1) + (arg6 + arg2.anInt10027)) {
						return;
					}
					this.method8643(arg2, arg5, local204, local212, arg4, local196, arg6, local220);
				} else if (arg0 == 4) {
					local196 = this.anInt5542 - this.anInt5579;
					for (local204 = 0; local204 < this.anInt5599; local204++) {
						this.anIntArray295[local204] -= arg5 - arg3.method8584(this.anIntArray300[local204] + arg6, this.anIntArray301[local204] + arg4) - local196;
					}
				} else if (arg0 == 5) {
					local196 = this.anInt5542 - this.anInt5579;
					for (local204 = 0; local204 < this.anInt5599; local204++) {
						local212 = this.anIntArray301[local204] + arg4;
						local220 = arg6 + this.anIntArray300[local204];
						@Pc(372) int local372 = arg2.method8584(local220, local212);
						@Pc(378) int local378 = arg3.method8584(local220, local212);
						@Pc(385) int local385 = local372 - local378 - arg1;
						this.anIntArray295[local204] = local372 + (local385 * ((this.anIntArray295[local204] << 8) / local196) >> 8) - arg5;
					}
				}
			}
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "()V")
	@Override
	protected void method8653() {
	}

	@OriginalMember(owner = "client!lu", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5565;
	}

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "(I)V")
	private void method4972() {
		if (this.aClass366_1 != null) {
			this.aClass366_1.aBoolean723 = false;
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class377.anIntArray600[arg0];
		@Pc(13) int local13 = Class377.anIntArray601[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5599; local15++) {
			@Pc(33) int local33 = this.anIntArray301[local15] * local13 + this.anIntArray300[local15] * local9 >> 14;
			this.anIntArray300[local15] = local13 * this.anIntArray300[local15] - this.anIntArray301[local15] * local9 >> 14;
			this.anIntArray301[local15] = local33;
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5579;
	}

	@OriginalMember(owner = "client!lu", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(15) int local15;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static118.anInt2181 = 0;
			Static230.anInt4255 = 0;
			Static446.anInt7615 = 0;
			local15 = 0;
			for (local17 = 0; local17 < this.anInt5599; local17++) {
				Static230.anInt4255 += this.anIntArray301[local17];
				Static118.anInt2181 += this.anIntArray295[local17];
				local15++;
				Static446.anInt7615 += this.anIntArray300[local17];
			}
			if (local15 > 0) {
				Static230.anInt4255 = arg1 + Static230.anInt4255 / local15;
				Static118.anInt2181 = Static118.anInt2181 / local15 + arg2;
				Static446.anInt7615 = Static446.anInt7615 / local15 + arg3;
			} else {
				Static446.anInt7615 = arg3;
				Static118.anInt2181 = arg2;
				Static230.anInt4255 = arg1;
			}
		} else if (arg0 == 1) {
			for (local15 = 0; local15 < this.anInt5599; local15++) {
				this.anIntArray301[local15] += arg1;
				this.anIntArray295[local15] += arg2;
				this.anIntArray300[local15] += arg3;
			}
		} else {
			@Pc(162) int local162;
			@Pc(180) int local180;
			if (arg0 == 2) {
				for (local15 = 0; local15 < this.anInt5599; local15++) {
					this.anIntArray301[local15] -= Static230.anInt4255;
					this.anIntArray295[local15] -= Static118.anInt2181;
					this.anIntArray300[local15] -= Static446.anInt7615;
					if (arg3 != 0) {
						local17 = Class377.anIntArray600[arg3];
						local162 = Class377.anIntArray601[arg3];
						local180 = local162 * this.anIntArray301[local15] + this.anIntArray295[local15] * local17 + 16383 >> 14;
						this.anIntArray295[local15] = this.anIntArray295[local15] * local162 + 16383 - this.anIntArray301[local15] * local17 >> 14;
						this.anIntArray301[local15] = local180;
					}
					if (arg1 != 0) {
						local17 = Class377.anIntArray600[arg1];
						local162 = Class377.anIntArray601[arg1];
						local180 = local162 * this.anIntArray295[local15] + 16383 - this.anIntArray300[local15] * local17 >> 14;
						this.anIntArray300[local15] = local17 * this.anIntArray295[local15] + local162 * this.anIntArray300[local15] + 16383 >> 14;
						this.anIntArray295[local15] = local180;
					}
					if (arg2 != 0) {
						local17 = Class377.anIntArray600[arg2];
						local162 = Class377.anIntArray601[arg2];
						local180 = local17 * this.anIntArray300[local15] + local162 * this.anIntArray301[local15] + 16383 >> 14;
						this.anIntArray300[local15] = this.anIntArray300[local15] * local162 + 16383 - local17 * this.anIntArray301[local15] >> 14;
						this.anIntArray301[local15] = local180;
					}
					this.anIntArray301[local15] += Static230.anInt4255;
					this.anIntArray295[local15] += Static118.anInt2181;
					this.anIntArray300[local15] += Static446.anInt7615;
				}
			} else if (arg0 == 3) {
				for (local15 = 0; local15 < this.anInt5599; local15++) {
					this.anIntArray301[local15] -= Static230.anInt4255;
					this.anIntArray295[local15] -= Static118.anInt2181;
					this.anIntArray300[local15] -= Static446.anInt7615;
					this.anIntArray301[local15] = this.anIntArray301[local15] * arg1 / 128;
					this.anIntArray295[local15] = arg2 * this.anIntArray295[local15] / 128;
					this.anIntArray300[local15] = arg3 * this.anIntArray300[local15] / 128;
					this.anIntArray301[local15] += Static230.anInt4255;
					this.anIntArray295[local15] += Static118.anInt2181;
					this.anIntArray300[local15] += Static446.anInt7615;
				}
			} else {
				@Pc(507) Class72 local507;
				@Pc(512) Class180 local512;
				if (arg0 == 5) {
					for (local15 = 0; local15 < this.anInt5545; local15++) {
						local17 = arg1 * 8 + (this.aByteArray53[local15] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray53[local15] = (byte) local17;
					}
					if (this.aClass72Array1 != null) {
						for (local17 = 0; local17 < this.anInt5543; local17++) {
							local507 = this.aClass72Array1[local17];
							local512 = this.aClass180Array1[local17];
							local512.anInt4726 = local512.anInt4726 & 0xFFFFFF | 255 - (this.aByteArray53[local507.anInt1927] & 0xFF) << 24;
						}
					}
					this.method4972();
				} else if (arg0 == 7) {
					for (local15 = 0; local15 < this.anInt5545; local15++) {
						local17 = this.aShortArray82[local15] & 0xFFFF;
						local162 = local17 >> 10 & 0x3F;
						local180 = local17 >> 7 & 0x7;
						local180 += arg2 / 4;
						@Pc(579) int local579 = local17 & 0x7F;
						@Pc(586) int local586 = local162 + arg1 & 0x3F;
						local579 += arg3;
						if (local180 < 0) {
							local180 = 0;
						} else if (local180 > 7) {
							local180 = 7;
						}
						if (local579 < 0) {
							local579 = 0;
						} else if (local579 > 127) {
							local579 = 127;
						}
						this.aShortArray82[local15] = (short) (local180 << 7 | local586 << 10 | local579);
					}
					if (this.aClass72Array1 != null) {
						for (local17 = 0; local17 < this.anInt5543; local17++) {
							local507 = this.aClass72Array1[local17];
							local512 = this.aClass180Array1[local17];
							local512.anInt4726 = Static349.anIntArray330[this.aShortArray82[local507.anInt1927] & 0xFFFF] & 0xFFFFFF | local512.anInt4726 & 0xFF000000;
						}
					}
					this.method4972();
				} else {
					@Pc(689) Class180 local689;
					if (arg0 == 8) {
						for (local15 = 0; local15 < this.anInt5543; local15++) {
							local689 = this.aClass180Array1[local15];
							local689.anInt4723 += arg2;
							local689.anInt4724 += arg1;
						}
					} else if (arg0 == 10) {
						for (local15 = 0; local15 < this.anInt5543; local15++) {
							local689 = this.aClass180Array1[local15];
							local689.anInt4721 = arg2 * local689.anInt4721 >> 7;
							local689.anInt4728 = arg1 * local689.anInt4728 >> 7;
						}
					} else if (arg0 == 9) {
						for (local15 = 0; local15 < this.anInt5543; local15++) {
							local689 = this.aClass180Array1[local15];
							local689.anInt4722 = local689.anInt4722 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lu", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean399;
	}

	@OriginalMember(owner = "client!lu", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass366_2 != null) {
			this.aClass366_2.aBoolean724 = Static40.method5453(arg0, this.anInt5546);
		}
		if (this.aClass366_4 != null) {
			this.aClass366_4.aBoolean724 = Static247.method4091(arg0, this.anInt5546);
		}
		if (this.aClass366_1 != null) {
			this.aClass366_1.aBoolean724 = Static532.method7864(arg0, this.anInt5546);
		}
		if (this.aClass366_3 != null) {
			this.aClass366_3.aBoolean724 = Static16.method230(this.anInt5546, arg0);
		}
		this.anInt5563 = arg0;
		if (this.aClass150_1 != null && (this.anInt5563 & 0x10000) == 0) {
			this.aShortArray84 = this.aClass150_1.aShortArray58;
			this.aByteArray54 = this.aClass150_1.aByteArray32;
			this.aShortArray78 = this.aClass150_1.aShortArray57;
			this.aShortArray79 = this.aClass150_1.aShortArray59;
			this.aClass150_1 = null;
		}
		this.aBoolean400 = true;
		this.method4975();
	}

	@OriginalMember(owner = "client!lu", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray37 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5592; local12++) {
			this.anIntArray301[local12] <<= 0x4;
			this.anIntArray295[local12] <<= 0x4;
			this.anIntArray300[local12] <<= 0x4;
		}
		Static230.anInt4255 = 0;
		Static446.anInt7615 = 0;
		Static118.anInt2181 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lu", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort82;
	}

	@OriginalMember(owner = "client!lu", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5575;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "()[Lclient!sn;")
	@Override
	public Class320[] method8636() {
		return this.lb;
	}

	@OriginalMember(owner = "client!lu", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5592; local7++) {
			this.anIntArray301[local7] = this.anIntArray301[local7] + 7 >> 4;
			this.anIntArray295[local7] = this.anIntArray295[local7] + 7 >> 4;
			this.anIntArray300[local7] = this.anIntArray300[local7] + 7 >> 4;
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5521;
	}

	@OriginalMember(owner = "client!lu", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5554;
	}

	@OriginalMember(owner = "client!lu", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean398) {
			this.method4959();
		}
		return this.anInt5542;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!tc;ZIBI)Z")
	private boolean method4974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class113 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class113_Sub1 local8 = (Class113_Sub1) arg2;
		@Pc(12) Class113_Sub1 local12 = this.aClass133_Sub1_8.aClass113_Sub1_16;
		@Pc(33) float local33 = local12.aFloat37 + local8.aFloat47 * local12.aFloat38 + local12.aFloat46 * local8.aFloat36 + local8.aFloat37 * local12.aFloat39;
		@Pc(54) float local54 = local8.aFloat37 * local12.aFloat40 + local12.aFloat44 * local8.aFloat36 + local12.aFloat41 * local8.aFloat47 + local12.aFloat36;
		Static299.aFloat94 = local12.aFloat41 * local8.aFloat42 + local8.aFloat46 * local12.aFloat40 + local8.aFloat44 * local12.aFloat44;
		Static382.aFloat99 = local12.aFloat42 * local8.aFloat41 + local8.aFloat38 * local12.aFloat43 + local12.aFloat45 * local8.aFloat45;
		Static569.aFloat184 = local12.aFloat45 * local8.aFloat42 + local12.aFloat42 * local8.aFloat44 + local8.aFloat46 * local12.aFloat43;
		@Pc(129) float local129 = local12.aFloat47 + local12.aFloat43 * local8.aFloat37 + local12.aFloat42 * local8.aFloat36 + local8.aFloat47 * local12.aFloat45;
		Static217.aFloat88 = local8.aFloat43 * local12.aFloat45 + local12.aFloat42 * local8.aFloat40 + local8.aFloat39 * local12.aFloat43;
		Static315.aFloat115 = local12.aFloat41 * local8.aFloat45 + local8.aFloat38 * local12.aFloat40 + local8.aFloat41 * local12.aFloat44;
		Static513.aFloat8 = local12.aFloat44 * local8.aFloat40 + local8.aFloat39 * local12.aFloat40 + local12.aFloat41 * local8.aFloat43;
		Static19.aFloat5 = local12.aFloat38 * local8.aFloat43 + local8.aFloat40 * local12.aFloat46 + local8.aFloat39 * local12.aFloat39;
		Static223.aFloat90 = local12.aFloat38 * local8.aFloat45 + local12.aFloat46 * local8.aFloat41 + local12.aFloat39 * local8.aFloat38;
		Static411.aFloat134 = local8.aFloat44 * local12.aFloat46 + local8.aFloat46 * local12.aFloat39 + local12.aFloat38 * local8.aFloat42;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass133_Sub1_8.anInt7008;
		@Pc(255) int local255 = this.aClass133_Sub1_8.anInt7013;
		if (!this.aBoolean398) {
			this.method4959();
		}
		@Pc(269) int local269 = this.anInt5554 - this.anInt5528 >> 1;
		@Pc(277) int local277 = this.anInt5542 - this.anInt5579 >> 1;
		@Pc(286) int local286 = this.anInt5565 - this.anInt5521 >> 1;
		@Pc(291) int local291 = local269 + this.anInt5528;
		@Pc(297) int local297 = this.anInt5579 + local277;
		@Pc(302) int local302 = this.anInt5521 + local286;
		@Pc(309) int local309 = local291 - (local269 << arg1);
		@Pc(315) int local315 = local297 - (local277 << arg1);
		@Pc(322) int local322 = local302 - (local286 << arg1);
		@Pc(328) int local328 = (local269 << arg1) + local291;
		@Pc(334) int local334 = local297 + (local277 << arg1);
		@Pc(340) int local340 = (local286 << arg1) + local302;
		Static217.anIntArray209[0] = local309;
		Static197.anIntArray591[0] = local315;
		Static158.anIntArray160[0] = local322;
		Static217.anIntArray209[1] = local328;
		Static197.anIntArray591[1] = local315;
		Static217.anIntArray209[2] = local309;
		Static158.anIntArray160[1] = local322;
		Static197.anIntArray591[2] = local334;
		Static217.anIntArray209[3] = local328;
		Static158.anIntArray160[2] = local322;
		Static197.anIntArray591[3] = local334;
		Static217.anIntArray209[4] = local309;
		Static158.anIntArray160[3] = local322;
		Static197.anIntArray591[4] = local315;
		Static158.anIntArray160[4] = local340;
		Static217.anIntArray209[5] = local328;
		Static197.anIntArray591[5] = local315;
		Static217.anIntArray209[6] = local309;
		Static158.anIntArray160[5] = local340;
		Static197.anIntArray591[6] = local334;
		Static158.anIntArray160[6] = local340;
		Static217.anIntArray209[7] = local328;
		Static197.anIntArray591[7] = local334;
		Static158.anIntArray160[7] = local340;
		@Pc(475) float local475;
		@Pc(503) float local503;
		@Pc(489) float local489;
		@Pc(456) float local456;
		@Pc(451) float local451;
		@Pc(461) float local461;
		for (@Pc(444) int local444 = 0; local444 < 8; local444++) {
			local451 = Static197.anIntArray591[local444];
			local456 = Static217.anIntArray209[local444];
			local461 = Static158.anIntArray160[local444];
			local475 = local33 + Static19.aFloat5 * local456 + local451 * Static411.aFloat134 + Static223.aFloat90 * local461;
			local489 = local129 + local461 * Static382.aFloat99 + local451 * Static569.aFloat184 + Static217.aFloat88 * local456;
			local503 = local461 * Static315.aFloat115 + Static299.aFloat94 * local451 + local456 * Static513.aFloat8 + local54;
			if (local489 >= (float) this.aClass133_Sub1_8.anInt7002) {
				if (arg5 > 0) {
					local489 = arg5;
				}
				@Pc(527) float local527 = (float) this.aClass133_Sub1_8.anInt6980 + local475 * (float) local251 / local489;
				@Pc(539) float local539 = (float) this.aClass133_Sub1_8.anInt7007 + local503 * (float) local255 / local489;
				if (local241 > local527) {
					local241 = local527;
				}
				if (local527 > local243) {
					local243 = local527;
				}
				if (local245 > local539) {
					local245 = local539;
				}
				local239 = true;
				if (local539 > local247) {
					local247 = local539;
				}
			}
		}
		if (local239 && local241 < (float) arg0 && (float) arg0 < local243 && (float) arg4 > local245 && (float) arg4 < local247) {
			if (arg3) {
				return true;
			}
			if (Static546.anIntArray507.length < this.anInt5583) {
				Static630.anIntArray595 = new int[this.anInt5583];
				Static546.anIntArray507 = new int[this.anInt5583];
			}
			@Pc(706) int local706;
			for (@Pc(616) int local616 = 0; local616 < this.anInt5599; local616++) {
				local451 = this.anIntArray295[local616];
				local456 = this.anIntArray301[local616];
				local461 = this.anIntArray300[local616];
				local489 = Static217.aFloat88 * local456 + local451 * Static569.aFloat184 + Static382.aFloat99 * local461 + local129;
				local475 = local33 + local451 * Static411.aFloat134 + local456 * Static19.aFloat5 + Static223.aFloat90 * local461;
				local503 = local54 + local461 * Static315.aFloat115 + Static299.aFloat94 * local451 + local456 * Static513.aFloat8;
				@Pc(719) int local719;
				@Pc(724) int local724;
				@Pc(731) int local731;
				if (local489 >= (float) this.aClass133_Sub1_8.anInt7002) {
					if (arg5 > 0) {
						local489 = arg5;
					}
					local706 = (int) (local475 * (float) local251 / local489 + (float) this.aClass133_Sub1_8.anInt6980);
					local719 = (int) ((float) this.aClass133_Sub1_8.anInt7007 + (float) local255 * local503 / local489);
					local724 = this.anIntArray299[local616];
					local731 = this.anIntArray299[local616 + 1];
					for (@Pc(733) int local733 = local724; local733 < local731; local733++) {
						@Pc(742) int local742 = this.aShortArray81[local733] - 1;
						if (local742 == -1) {
							break;
						}
						Static546.anIntArray507[local742] = local706;
						Static630.anIntArray595[local742] = local719;
					}
				} else {
					local706 = this.anIntArray299[local616];
					local719 = this.anIntArray299[local616 + 1];
					for (local724 = local706; local724 < local719; local724++) {
						local731 = this.aShortArray81[local724] - 1;
						if (local731 == -1) {
							break;
						}
						Static546.anIntArray507[this.aShortArray81[local724] - 1] = -999999;
					}
				}
			}
			for (local706 = 0; local706 < this.anInt5545; local706++) {
				if (Static546.anIntArray507[this.aShortArray87[local706]] != -999999 && Static546.anIntArray507[this.aShortArray77[local706]] != -999999 && Static546.anIntArray507[this.aShortArray85[local706]] != -999999 && this.method4970(arg4, Static546.anIntArray507[this.aShortArray85[local706]], Static630.anIntArray595[this.aShortArray77[local706]], Static546.anIntArray507[this.aShortArray87[local706]], Static630.anIntArray595[this.aShortArray85[local706]], Static546.anIntArray507[this.aShortArray77[local706]], arg0, Static630.anIntArray595[this.aShortArray87[local706]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lu", name = "e", descriptor = "(I)V")
	private void method4975() {
		if (!this.aBoolean400) {
			return;
		}
		this.aBoolean400 = false;
		if (this.aClass261Array4 == null && this.lb == null && this.aClass72Array1 == null) {
			if (this.anIntArray301 != null && !Static192.method2917(this.anInt5546, this.anInt5563)) {
				if (this.aClass366_2 == null || this.aClass366_2.method8618()) {
					if (!this.aBoolean398) {
						this.method4959();
					}
					this.anIntArray301 = null;
				} else {
					this.aBoolean400 = true;
				}
			}
			if (this.anIntArray295 != null && !Static376.method5539(this.anInt5546, this.anInt5563)) {
				if (this.aClass366_2 == null || this.aClass366_2.method8618()) {
					if (!this.aBoolean398) {
						this.method4959();
					}
					this.anIntArray295 = null;
				} else {
					this.aBoolean400 = true;
				}
			}
			if (this.anIntArray300 != null && !Static213.method3649(this.anInt5546, this.anInt5563)) {
				if (this.aClass366_2 == null || this.aClass366_2.method8618()) {
					if (!this.aBoolean398) {
						this.method4959();
					}
					this.anIntArray300 = null;
				} else {
					this.aBoolean400 = true;
				}
			}
		}
		if (this.aShortArray81 != null && this.anIntArray301 == null && this.anIntArray295 == null && this.anIntArray300 == null) {
			this.anIntArray299 = null;
			this.aShortArray81 = null;
		}
		if (this.aByteArray54 != null && !Static171.method2660(this.anInt5546, this.anInt5563)) {
			label197: {
				label196: {
					@Pc(166) boolean local166;
					if ((this.anInt5546 & 0x37) == 0) {
						if (this.aClass366_1 == null || this.aClass366_1.method8618()) {
							break label196;
						}
						local166 = false;
					} else {
						if (this.aClass366_3 == null || this.aClass366_3.method8618()) {
							break label196;
						}
						local166 = false;
					}
					if (!local166) {
						this.aBoolean400 = true;
						break label197;
					}
				}
				this.aByteArray54 = null;
				this.aShortArray79 = this.aShortArray84 = this.aShortArray78 = null;
			}
		}
		if (this.aShortArray82 != null && !Static497.method7436(this.anInt5563, this.anInt5546)) {
			if (this.aClass366_1 == null || this.aClass366_1.method8618()) {
				this.aShortArray82 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.aByteArray53 != null && !Static158.method2279(this.anInt5563, this.anInt5546)) {
			if (this.aClass366_1 == null || this.aClass366_1.method8618()) {
				this.aByteArray53 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.aFloatArray44 != null && !Static377.method5547(this.anInt5546, this.anInt5563)) {
			if (this.aClass366_4 == null || this.aClass366_4.method8618()) {
				this.aFloatArray44 = this.aFloatArray45 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.aShortArray83 != null && !Static391.method5807(this.anInt5546, this.anInt5563)) {
			if (this.aClass366_1 == null || this.aClass366_1.method8618()) {
				this.aShortArray83 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.aShortArray87 != null && !Static173.method2685(this.anInt5546, this.anInt5563)) {
			if ((this.aClass89_1 == null || this.aClass89_1.method1846()) && (this.aClass366_1 == null || this.aClass366_1.method8618())) {
				this.aShortArray87 = this.aShortArray77 = this.aShortArray85 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.aShortArray88 != null) {
			if (this.aClass366_2 == null || this.aClass366_2.method8618()) {
				this.aShortArray88 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.aShortArray89 != null) {
			if (this.aClass366_1 == null || this.aClass366_1.method8618()) {
				this.aShortArray89 = null;
			} else {
				this.aBoolean400 = true;
			}
		}
		if (this.anIntArrayArray36 != null && !Static592.method8533(this.anInt5563, this.anInt5546)) {
			this.anIntArrayArray36 = null;
			this.aShortArray80 = null;
		}
		if (this.anIntArrayArray37 != null && !Static299.method4660(this.anInt5563, this.anInt5546)) {
			this.aShortArray86 = null;
			this.anIntArrayArray37 = null;
		}
		if (this.anIntArrayArray35 != null && !Static249.method4130(this.anInt5563, this.anInt5546)) {
			this.anIntArrayArray35 = null;
		}
		if (this.anIntArray298 != null && (this.anInt5563 & 0x800) == 0 && (this.anInt5563 & 0x40000) == 0) {
			this.anIntArray298 = null;
			this.anIntArray297 = null;
			this.anIntArray296 = null;
		}
	}

	@OriginalMember(owner = "client!lu", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort82 = (short) arg0;
		this.method4972();
	}

	@OriginalMember(owner = "client!lu", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5545; local3++) {
			if (arg0 == this.aShortArray82[local3]) {
				this.aShortArray82[local3] = arg1;
			}
		}
		if (this.aClass72Array1 != null) {
			for (@Pc(34) int local34 = 0; local34 < this.anInt5543; local34++) {
				@Pc(41) Class72 local41 = this.aClass72Array1[local34];
				@Pc(46) Class180 local46 = this.aClass180Array1[local34];
				local46.anInt4726 = Static349.anIntArray330[this.aShortArray82[local41.anInt1927] & 0xFFFF] & 0xFFFFFF | local46.anInt4726 & 0xFF000000;
			}
		}
		this.method4972();
	}

	@OriginalMember(owner = "client!lu", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5599; local7++) {
			if (arg0 != 128) {
				this.anIntArray301[local7] = arg0 * this.anIntArray301[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray295[local7] = this.anIntArray295[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray300[local7] = this.anIntArray300[local7] * arg2 >> 7;
			}
		}
		this.method4966();
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!tc;Lclient!qw;I)V")
	@Override
	public void method8645(@OriginalArg(0) Class113 arg0, @OriginalArg(1) Class4_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5583 == 0) {
			return;
		}
		@Pc(16) Class113_Sub1 local16 = this.aClass133_Sub1_8.aClass113_Sub1_16;
		@Pc(19) Class113_Sub1 local19 = (Class113_Sub1) arg0;
		if (!this.aBoolean398) {
			this.method4959();
		}
		Static467.aFloat142 = local16.aFloat47 + local16.aFloat43 * local19.aFloat37 + local19.aFloat36 * local16.aFloat42 + local16.aFloat45 * local19.aFloat47;
		Static569.aFloat184 = local16.aFloat45 * local19.aFloat42 + local19.aFloat44 * local16.aFloat42 + local19.aFloat46 * local16.aFloat43;
		@Pc(72) float local72 = Static467.aFloat142 + Static569.aFloat184 * (float) this.anInt5579;
		@Pc(80) float local80 = Static467.aFloat142 + Static569.aFloat184 * (float) this.anInt5542;
		@Pc(91) float local91;
		@Pc(97) float local97;
		if (local80 < local72) {
			local91 = (float) -this.anInt5567 + local80;
			local97 = local72 + (float) this.anInt5567;
		} else {
			local91 = (float) -this.anInt5567 + local72;
			local97 = local80 + (float) this.anInt5567;
		}
		if (this.aClass133_Sub1_8.aFloat122 <= local91 || (float) this.aClass133_Sub1_8.anInt7002 >= local97) {
			return;
		}
		Static217.aFloat89 = local16.aFloat37 + local19.aFloat47 * local16.aFloat38 + local19.aFloat37 * local16.aFloat39 + local19.aFloat36 * local16.aFloat46;
		Static411.aFloat134 = local16.aFloat38 * local19.aFloat42 + local19.aFloat46 * local16.aFloat39 + local16.aFloat46 * local19.aFloat44;
		@Pc(174) float local174 = Static411.aFloat134 * (float) this.anInt5579 + Static217.aFloat89;
		@Pc(182) float local182 = (float) this.anInt5542 * Static411.aFloat134 + Static217.aFloat89;
		@Pc(208) float local208;
		@Pc(197) float local197;
		if (local174 > local182) {
			local197 = (float) this.aClass133_Sub1_8.anInt7008 * ((float) this.anInt5567 + local174);
			local208 = (local182 - (float) this.anInt5567) * (float) this.aClass133_Sub1_8.anInt7008;
		} else {
			local208 = (float) this.aClass133_Sub1_8.anInt7008 * ((float) -this.anInt5567 + local174);
			local197 = (float) this.aClass133_Sub1_8.anInt7008 * ((float) this.anInt5567 + local182);
		}
		if (local208 / local97 >= this.aClass133_Sub1_8.aFloat133 || local197 / local97 <= this.aClass133_Sub1_8.aFloat121) {
			return;
		}
		Static583.aFloat185 = local19.aFloat37 * local16.aFloat40 + local19.aFloat36 * local16.aFloat44 + local19.aFloat47 * local16.aFloat41 + local16.aFloat36;
		Static299.aFloat94 = local16.aFloat41 * local19.aFloat42 + local16.aFloat44 * local19.aFloat44 + local19.aFloat46 * local16.aFloat40;
		@Pc(298) float local298 = Static299.aFloat94 * (float) this.anInt5579 + Static583.aFloat185;
		@Pc(306) float local306 = (float) this.anInt5542 * Static299.aFloat94 + Static583.aFloat185;
		@Pc(332) float local332;
		@Pc(321) float local321;
		if (local306 < local298) {
			local321 = ((float) this.anInt5567 + local298) * (float) this.aClass133_Sub1_8.anInt7013;
			local332 = (float) this.aClass133_Sub1_8.anInt7013 * (local306 - (float) this.anInt5567);
		} else {
			local321 = (float) this.aClass133_Sub1_8.anInt7013 * (local306 + (float) this.anInt5567);
			local332 = (float) this.aClass133_Sub1_8.anInt7013 * (local298 - (float) this.anInt5567);
		}
		if (local332 / local97 >= this.aClass133_Sub1_8.aFloat118 || this.aClass133_Sub1_8.aFloat117 >= local321 / local97) {
			return;
		}
		if (arg1 != null || this.aClass72Array1 != null) {
			Static223.aFloat90 = local16.aFloat39 * local19.aFloat38 + local19.aFloat41 * local16.aFloat46 + local16.aFloat38 * local19.aFloat45;
			Static382.aFloat99 = local16.aFloat43 * local19.aFloat38 + local16.aFloat42 * local19.aFloat41 + local19.aFloat45 * local16.aFloat45;
			Static19.aFloat5 = local16.aFloat46 * local19.aFloat40 + local19.aFloat39 * local16.aFloat39 + local16.aFloat38 * local19.aFloat43;
			Static315.aFloat115 = local16.aFloat40 * local19.aFloat38 + local19.aFloat41 * local16.aFloat44 + local16.aFloat41 * local19.aFloat45;
			Static217.aFloat88 = local19.aFloat43 * local16.aFloat45 + local19.aFloat39 * local16.aFloat43 + local19.aFloat40 * local16.aFloat42;
			Static513.aFloat8 = local16.aFloat44 * local19.aFloat40 + local16.aFloat40 * local19.aFloat39 + local19.aFloat43 * local16.aFloat41;
		}
		if (arg1 != null) {
			@Pc(491) boolean local491 = false;
			@Pc(493) boolean local493 = true;
			@Pc(501) int local501 = this.anInt5554 + this.anInt5528 >> 1;
			@Pc(509) int local509 = this.anInt5521 + this.anInt5565 >> 1;
			@Pc(528) int local528 = (int) ((float) local509 * Static223.aFloat90 + Static217.aFloat89 + (float) local501 * Static19.aFloat5 + (float) this.anInt5579 * Static411.aFloat134);
			@Pc(547) int local547 = (int) (Static315.aFloat115 * (float) local509 + Static299.aFloat94 * (float) this.anInt5579 + Static513.aFloat8 * (float) local501 + Static583.aFloat185);
			@Pc(566) int local566 = (int) (Static382.aFloat99 * (float) local509 + Static467.aFloat142 + Static217.aFloat88 * (float) local501 + (float) this.anInt5579 * Static569.aFloat184);
			if (local566 >= this.aClass133_Sub1_8.anInt7002) {
				arg1.anInt7890 = this.aClass133_Sub1_8.anInt7008 * local528 / local566 + this.aClass133_Sub1_8.anInt6980;
				arg1.anInt7892 = this.aClass133_Sub1_8.anInt7007 + this.aClass133_Sub1_8.anInt7013 * local547 / local566;
			} else {
				local491 = true;
			}
			@Pc(625) int local625 = (int) (Static223.aFloat90 * (float) local509 + Static217.aFloat89 + Static19.aFloat5 * (float) local501 + Static411.aFloat134 * (float) this.anInt5542);
			@Pc(644) int local644 = (int) (Static583.aFloat185 + (float) local501 * Static513.aFloat8 + (float) this.anInt5542 * Static299.aFloat94 + Static315.aFloat115 * (float) local509);
			@Pc(663) int local663 = (int) (Static467.aFloat142 + Static217.aFloat88 * (float) local501 + (float) this.anInt5542 * Static569.aFloat184 + Static382.aFloat99 * (float) local509);
			if (this.aClass133_Sub1_8.anInt7002 > local663) {
				local491 = true;
			} else {
				arg1.anInt7891 = this.aClass133_Sub1_8.anInt7007 + this.aClass133_Sub1_8.anInt7013 * local644 / local663;
				arg1.anInt7893 = this.aClass133_Sub1_8.anInt7008 * local625 / local663 + this.aClass133_Sub1_8.anInt6980;
			}
			if (local491) {
				if (local566 < this.aClass133_Sub1_8.anInt7002 && local663 < this.aClass133_Sub1_8.anInt7002) {
					local493 = false;
				} else {
					@Pc(748) int local748;
					@Pc(759) int local759;
					@Pc(786) int local786;
					if (local566 < this.aClass133_Sub1_8.anInt7002) {
						local748 = (local663 - this.aClass133_Sub1_8.anInt7002 << 16) / (local663 - local566);
						local759 = local625 + (local748 * (local625 - local528) >> 16);
						local786 = ((local644 - local547) * local748 >> 16) + local644;
						arg1.anInt7890 = local759 * this.aClass133_Sub1_8.anInt7008 / this.aClass133_Sub1_8.anInt7002 + this.aClass133_Sub1_8.anInt6980;
						arg1.anInt7892 = this.aClass133_Sub1_8.anInt7007 + local786 * this.aClass133_Sub1_8.anInt7013 / this.aClass133_Sub1_8.anInt7002;
					} else if (local663 < this.aClass133_Sub1_8.anInt7002) {
						local748 = (local566 - this.aClass133_Sub1_8.anInt7002 << 16) / (local566 - local663);
						local759 = ((local528 - local625) * local748 >> 16) + local528;
						arg1.anInt7890 = this.aClass133_Sub1_8.anInt6980 + local759 * this.aClass133_Sub1_8.anInt7008 / this.aClass133_Sub1_8.anInt7002;
						local786 = (local748 * (local547 - local644) >> 16) + local547;
						arg1.anInt7892 = this.aClass133_Sub1_8.anInt7013 * local786 / this.aClass133_Sub1_8.anInt7002 + this.aClass133_Sub1_8.anInt7007;
					}
				}
			}
			if (local493) {
				if (local663 < local566) {
					arg1.anInt7894 = this.aClass133_Sub1_8.anInt6980 + this.aClass133_Sub1_8.anInt7008 * (local528 + this.anInt5567) / local566 - arg1.anInt7890;
				} else {
					arg1.anInt7894 = (local625 + this.anInt5567) * this.aClass133_Sub1_8.anInt7008 / local663 + this.aClass133_Sub1_8.anInt6980 - arg1.anInt7893;
				}
				arg1.aBoolean558 = true;
			}
		}
		this.aClass133_Sub1_8.method6221();
		this.aClass133_Sub1_8.method6200(local19);
		this.method4971();
		this.method4962();
	}
}
