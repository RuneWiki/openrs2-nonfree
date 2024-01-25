import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class14_Sub3 extends Class14 {

	@OriginalMember(owner = "client!te", name = "r", descriptor = "Lclient!ps;")
	private Class288 aClass288_1;

	@OriginalMember(owner = "client!te", name = "A", descriptor = "I")
	private int anInt9866;

	@OriginalMember(owner = "client!te", name = "H", descriptor = "I")
	private int anInt9871;

	@OriginalMember(owner = "client!te", name = "M", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "client!te", name = "X", descriptor = "Lclient!ps;")
	private Class288 aClass288_2;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "I")
	private int anInt9885;

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Lclient!ps;")
	private Class288 aClass288_3;

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
	private int lb;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	private int anInt9892;

	@OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
	private int anInt9893;

	@OriginalMember(owner = "client!te", name = "ub", descriptor = "Lclient!hh;")
	private Class142 aClass142_1;

	@OriginalMember(owner = "client!te", name = "Bb", descriptor = "Z")
	private boolean aBoolean726;

	@OriginalMember(owner = "client!te", name = "Rb", descriptor = "I")
	private int anInt9910;

	@OriginalMember(owner = "client!te", name = "cc", descriptor = "Lclient!waa;")
	private Class383 aClass383_1;

	@OriginalMember(owner = "client!te", name = "jc", descriptor = "I")
	private int anInt9922;

	@OriginalMember(owner = "client!te", name = "nc", descriptor = "I")
	private int anInt9925;

	@OriginalMember(owner = "client!te", name = "wc", descriptor = "I")
	private int anInt9931;

	@OriginalMember(owner = "client!te", name = "Dc", descriptor = "I")
	private int anInt9937;

	@OriginalMember(owner = "client!te", name = "Fc", descriptor = "Z")
	private boolean aBoolean728;

	@OriginalMember(owner = "client!te", name = "Jc", descriptor = "Lclient!ps;")
	private Class288 aClass288_4;

	@OriginalMember(owner = "client!te", name = "Kc", descriptor = "Lclient!mj;")
	private final Class101_Sub1 aClass101_Sub1_23;

	@OriginalMember(owner = "client!te", name = "Hc", descriptor = "[I")
	private int[] anIntArray501;

	@OriginalMember(owner = "client!te", name = "Mb", descriptor = "I")
	private int anInt9907;

	@OriginalMember(owner = "client!te", name = "pc", descriptor = "I")
	private int anInt9926;

	@OriginalMember(owner = "client!te", name = "oc", descriptor = "Z")
	private boolean aBoolean727;

	@OriginalMember(owner = "client!te", name = "T", descriptor = "Z")
	private boolean aBoolean725;

	@OriginalMember(owner = "client!te", name = "Wb", descriptor = "[I")
	private int[] anIntArray500;

	@OriginalMember(owner = "client!te", name = "ec", descriptor = "I")
	private int anInt9917;

	@OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
	private int anInt9898;

	@OriginalMember(owner = "client!te", name = "B", descriptor = "[I")
	private int[] anIntArray495;

	@OriginalMember(owner = "client!te", name = "L", descriptor = "[S")
	private short[] aShortArray132;

	@OriginalMember(owner = "client!te", name = "Ic", descriptor = "[I")
	private int[] anIntArray502;

	@OriginalMember(owner = "client!te", name = "G", descriptor = "[Lclient!gfa;")
	private Class123[] aClass123Array5;

	@OriginalMember(owner = "client!te", name = "Gc", descriptor = "[Lclient!pi;")
	private Class283[] aClass283Array5;

	@OriginalMember(owner = "client!te", name = "Sb", descriptor = "I")
	private int anInt9911;

	@OriginalMember(owner = "client!te", name = "Db", descriptor = "[Lclient!uw;")
	private Class365[] aClass365Array1;

	@OriginalMember(owner = "client!te", name = "Pb", descriptor = "[Lclient!wr;")
	private Class393[] aClass393Array1;

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "[S")
	private short[] aShortArray136;

	@OriginalMember(owner = "client!te", name = "Yb", descriptor = "[S")
	private short[] aShortArray141;

	@OriginalMember(owner = "client!te", name = "Vb", descriptor = "[F")
	private float[] aFloatArray71;

	@OriginalMember(owner = "client!te", name = "N", descriptor = "[S")
	private short[] aShortArray133;

	@OriginalMember(owner = "client!te", name = "Ob", descriptor = "[S")
	private short[] aShortArray139;

	@OriginalMember(owner = "client!te", name = "zb", descriptor = "[S")
	private short[] aShortArray137;

	@OriginalMember(owner = "client!te", name = "t", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!te", name = "vc", descriptor = "[S")
	private short[] aShortArray142;

	@OriginalMember(owner = "client!te", name = "Tb", descriptor = "[S")
	private short[] aShortArray140;

	@OriginalMember(owner = "client!te", name = "v", descriptor = "[S")
	private short[] aShortArray131;

	@OriginalMember(owner = "client!te", name = "Kb", descriptor = "S")
	private short aShort112;

	@OriginalMember(owner = "client!te", name = "q", descriptor = "[F")
	private float[] aFloatArray70;

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!te", name = "Lb", descriptor = "[S")
	private short[] aShortArray138;

	@OriginalMember(owner = "client!te", name = "o", descriptor = "[S")
	private short[] aShortArray130;

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "[S")
	private short[] aShortArray134;

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "[S")
	private short[] aShortArray135;

	@OriginalMember(owner = "client!te", name = "y", descriptor = "S")
	private short aShort111;

	@OriginalMember(owner = "client!te", name = "Ub", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!te", name = "Ib", descriptor = "[I")
	private int[] anIntArray498;

	@OriginalMember(owner = "client!te", name = "wb", descriptor = "[I")
	private int[] anIntArray496;

	@OriginalMember(owner = "client!te", name = "Ec", descriptor = "[[I")
	private int[][] anIntArrayArray54;

	@OriginalMember(owner = "client!te", name = "rc", descriptor = "[[I")
	private int[][] anIntArrayArray52;

	@OriginalMember(owner = "client!te", name = "xc", descriptor = "[[I")
	private int[][] anIntArrayArray53;

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!mj;Lclient!ida;IIII)V")
	public Class14_Sub3(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface3 local11 = arg0.anInterface3_12;
		this.anIntArray501 = new int[arg1.anInt4817 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt4810];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt4810; local24++) {
			if (arg1.aByteArray38 == null || arg1.aByteArray38[local24] != 2) {
				if (arg1.aShortArray66 != null && arg1.aShortArray66[local24] != -1) {
					@Pc(57) Class136 local57 = local11.method1941(arg1.aShortArray66[local24] & 0xFFFF);
					if (((this.anInt9910 & 0x40) == 0 || !local57.aBoolean329) && local57.aBoolean332) {
						continue;
					}
				}
				local22[this.anInt9907++] = local24;
				this.anIntArray501[arg1.aShortArray68[local24]]++;
				this.anIntArray501[arg1.aShortArray69[local24]]++;
				this.anIntArray501[arg1.aShortArray64[local24]]++;
			}
		}
		this.anInt9926 = this.anInt9907;
		@Pc(129) long[] local129 = new long[this.anInt9907];
		@Pc(138) boolean local138 = (this.lb & 0x100) != 0;
		@Pc(150) int local150;
		@Pc(163) int local163;
		@Pc(327) int local327;
		for (@Pc(140) int local140 = 0; local140 < this.anInt9907; local140++) {
			@Pc(146) int local146 = local22[local140];
			@Pc(148) Class136 local148 = null;
			local150 = 0;
			@Pc(152) byte local152 = 0;
			@Pc(154) byte local154 = 0;
			@Pc(156) byte local156 = 0;
			if (arg1.aClass161Array1 != null) {
				@Pc(161) boolean local161 = false;
				for (local163 = 0; local163 < arg1.aClass161Array1.length; local163++) {
					@Pc(170) Class161 local170 = arg1.aClass161Array1[local163];
					if (local146 == local170.anInt4867) {
						@Pc(183) Class250 local183 = Static346.method5998(local170.anInt4866);
						if (local183.aBoolean561) {
							local161 = true;
						}
						if (local183.anInt7541 != -1) {
							@Pc(198) Class136 local198 = local11.method1941(local183.anInt7541);
							if (local198.anInt4370 == 2) {
								this.aBoolean727 = true;
							}
						}
					}
				}
				if (local161) {
					local129[local140] = Long.MAX_VALUE;
					this.anInt9926--;
					continue;
				}
			}
			@Pc(231) short local231 = -1;
			if (arg1.aShortArray66 != null) {
				local231 = arg1.aShortArray66[local146];
				if (local231 != -1) {
					local148 = local11.method1941(local231 & 0xFFFF);
					if ((this.anInt9910 & 0x40) != 0 && local148.aBoolean329) {
						local148 = null;
						local231 = -1;
					} else {
						local154 = local148.aByte62;
						local156 = local148.aByte64;
					}
				}
			}
			@Pc(289) boolean local289 = arg1.aByteArray42 != null && arg1.aByteArray42[local146] != 0 || local148 != null && local148.anInt4370 != 0;
			if ((local138 || local289) && arg1.aByteArray43 != null) {
				local150 += arg1.aByteArray43[local146] << 17;
			}
			if (local289) {
				local150 += 65536;
			}
			local150 += (local154 & 0xFF) << 8;
			local327 = local152 + ((local231 & 0xFFFF) << 16);
			local150 += local156 & 0xFF;
			@Pc(339) int local339 = local327 + (local140 & 0xFFFF);
			local129[local140] = ((long) local150 << 32) + (long) local339;
			this.aBoolean727 |= local289;
			this.aBoolean725 |= local148 != null && (local148.aByte61 != 0 || local148.aByte65 != 0);
		}
		Static552.method8466(local129, local22);
		this.anIntArray500 = arg1.anIntArray234;
		this.anInt9917 = arg1.anInt4804;
		this.anInt9898 = arg1.anInt4817;
		this.anIntArray495 = arg1.anIntArray229;
		this.aShortArray132 = arg1.aShortArray65;
		this.anIntArray502 = arg1.anIntArray235;
		this.aClass123Array5 = arg1.aClass123Array3;
		this.aClass283Array5 = arg1.aClass283Array3;
		@Pc(422) Class195[] local422 = new Class195[this.anInt9898];
		@Pc(442) int local442;
		@Pc(456) int local456;
		@Pc(499) int local499;
		if (arg1.aClass161Array1 != null) {
			this.anInt9911 = arg1.aClass161Array1.length;
			this.aClass365Array1 = new Class365[this.anInt9911];
			this.aClass393Array1 = new Class393[this.anInt9911];
			for (local442 = 0; local442 < this.anInt9911; local442++) {
				@Pc(449) Class161 local449 = arg1.aClass161Array1[local442];
				@Pc(454) Class250 local454 = Static346.method5998(local449.anInt4866);
				local456 = -1;
				for (@Pc(458) int local458 = 0; local458 < this.anInt9907; local458++) {
					if (local449.anInt4867 == local22[local458]) {
						local456 = local458;
						break;
					}
				}
				if (local456 == -1) {
					throw new RuntimeException();
				}
				local499 = Static101.anIntArray92[arg1.aShortArray67[local449.anInt4867] & 0xFFFF] & 0xFFFFFF;
				@Pc(517) int local517 = local499 | 255 - (arg1.aByteArray42 == null ? 0 : arg1.aByteArray42[local449.anInt4867]) << 24;
				this.aClass393Array1[local442] = new Class393(local456, arg1.aShortArray68[local449.anInt4867], arg1.aShortArray69[local449.anInt4867], arg1.aShortArray64[local449.anInt4867], local454.anInt7543, local454.anInt7544, local454.anInt7541, local454.anInt7542, local454.anInt7547, local454.aBoolean561, local454.aBoolean562, local449.anInt4868);
				this.aClass365Array1[local442] = new Class365(local517);
			}
		}
		local442 = this.anInt9907 * 3;
		this.aShortArray136 = new short[local442];
		this.aShortArray141 = new short[this.anInt9907];
		this.aFloatArray71 = new float[local442];
		this.aShortArray133 = new short[local442];
		if (arg1.aShortArray70 != null) {
			this.aShortArray139 = new short[this.anInt9907];
		}
		this.aShortArray137 = new short[this.anInt9907];
		this.aByteArray88 = new byte[local442];
		this.aShortArray142 = new short[local442];
		this.aShortArray140 = new short[this.anInt9907];
		this.aShortArray131 = new short[local442];
		this.aShort112 = (short) arg4;
		this.aFloatArray70 = new float[local442];
		this.aByteArray89 = new byte[this.anInt9907];
		this.aShortArray138 = new short[this.anInt9907];
		this.aShortArray130 = new short[local442];
		Static21.aLongArray1 = new long[local442];
		this.aShortArray134 = new short[this.anInt9907];
		this.aShortArray135 = new short[local442];
		this.aShort111 = (short) arg3;
		local150 = 0;
		for (local327 = 0; local327 < arg1.anInt4817; local327++) {
			local456 = this.anIntArray501[local327];
			this.anIntArray501[local327] = local150;
			local150 += local456;
			local422[local327] = new Class195();
		}
		this.anIntArray501[arg1.anInt4817] = local150;
		@Pc(703) Class306 local703 = Static156.method3185(this.anInt9907, arg1, local22);
		@Pc(707) Class212[] local707 = new Class212[arg1.anInt4810];
		@Pc(748) int local748;
		@Pc(759) int local759;
		@Pc(770) int local770;
		@Pc(726) short local726;
		@Pc(737) int local737;
		for (local499 = 0; local499 < arg1.anInt4810; local499++) {
			@Pc(716) short local716 = arg1.aShortArray68[local499];
			@Pc(721) short local721 = arg1.aShortArray69[local499];
			local726 = arg1.aShortArray64[local499];
			local737 = this.anIntArray495[local721] - this.anIntArray495[local716];
			local748 = this.anIntArray500[local721] - this.anIntArray500[local716];
			local759 = this.anIntArray502[local721] - this.anIntArray502[local716];
			local770 = this.anIntArray495[local726] - this.anIntArray495[local716];
			@Pc(781) int local781 = this.anIntArray500[local726] - this.anIntArray500[local716];
			@Pc(792) int local792 = this.anIntArray502[local726] - this.anIntArray502[local716];
			@Pc(801) int local801 = local748 * local792 - local781 * local759;
			@Pc(810) int local810 = local770 * local759 - local737 * local792;
			@Pc(818) int local818 = local737 * local781 - local748 * local770;
			while (local801 > 8192 || local810 > 8192 || local818 > 8192 || local801 < -8192 || local810 < -8192 || local818 < -8192) {
				local818 >>= 0x1;
				local801 >>= 0x1;
				local810 >>= 0x1;
			}
			@Pc(867) int local867 = (int) Math.sqrt((double) (local801 * local801 + local810 * local810 + local818 * local818));
			if (local867 <= 0) {
				local867 = 1;
			}
			local810 = local810 * 256 / local867;
			local801 = local801 * 256 / local867;
			local818 = local818 * 256 / local867;
			@Pc(902) byte local902 = arg1.aByteArray38 == null ? 0 : arg1.aByteArray38[local499];
			if (local902 == 0) {
				@Pc(908) Class195 local908 = local422[local716];
				local908.anInt5556 += local818;
				local908.anInt5553 += local810;
				local908.anInt5552++;
				local908.anInt5550 += local801;
				@Pc(936) Class195 local936 = local422[local721];
				local936.anInt5552++;
				local936.anInt5550 += local801;
				local936.anInt5553 += local810;
				local936.anInt5556 += local818;
				@Pc(964) Class195 local964 = local422[local726];
				local964.anInt5552++;
				local964.anInt5553 += local810;
				local964.anInt5556 += local818;
				local964.anInt5550 += local801;
			} else if (local902 == 1) {
				@Pc(1001) Class212 local1001 = local707[local499] = new Class212();
				local1001.anInt6361 = local810;
				local1001.anInt6362 = local801;
				local1001.anInt6363 = local818;
			}
		}
		@Pc(1027) int local1027;
		@Pc(1070) short local1070;
		for (local163 = 0; local163 < this.anInt9907; local163++) {
			local1027 = local22[local163];
			@Pc(1034) int local1034 = arg1.aShortArray67[local1027] & 0xFFFF;
			if (arg1.aByteArray44 == null) {
				local737 = -1;
			} else {
				local737 = arg1.aByteArray44[local1027];
			}
			if (arg1.aByteArray42 == null) {
				local748 = 0;
			} else {
				local748 = arg1.aByteArray42[local1027] & 0xFF;
			}
			local1070 = arg1.aShortArray66 == null ? -1 : arg1.aShortArray66[local1027];
			if (local1070 != -1 && (this.anInt9910 & 0x40) != 0) {
				@Pc(1089) Class136 local1089 = local11.method1941(local1070 & 0xFFFF);
				if (local1089.aBoolean329) {
					local1070 = -1;
				}
			}
			@Pc(1096) float local1096 = 0.0F;
			@Pc(1098) float local1098 = 0.0F;
			@Pc(1100) float local1100 = 0.0F;
			@Pc(1102) float local1102 = 0.0F;
			@Pc(1104) float local1104 = 0.0F;
			@Pc(1106) float local1106 = 0.0F;
			@Pc(1108) byte local1108 = 0;
			@Pc(1110) byte local1110 = 0;
			@Pc(1112) int local1112 = 0;
			@Pc(1147) byte local1147;
			@Pc(1167) short local1167;
			@Pc(1954) short local1954;
			@Pc(1959) short local1959;
			if (local1070 != -1) {
				if (local737 == -1) {
					local1108 = 1;
					local1110 = 2;
					local1100 = 1.0F;
					local1098 = 1.0F;
					local1104 = 0.0F;
					local1102 = 1.0F;
					local1106 = 0.0F;
					local1096 = 0.0F;
				} else {
					local737 &= 0xFF;
					local1147 = arg1.aByteArray40[local737];
					@Pc(1157) short local1157;
					@Pc(1162) short local1162;
					@Pc(1200) float local1200;
					@Pc(1418) float local1418;
					@Pc(1426) float local1426;
					@Pc(1525) float local1525;
					@Pc(1533) float local1533;
					@Pc(1541) float local1541;
					@Pc(1564) float local1564;
					@Pc(1587) float local1587;
					@Pc(1610) float local1610;
					if (local1147 == 0) {
						local1157 = arg1.aShortArray68[local1027];
						local1162 = arg1.aShortArray69[local1027];
						local1167 = arg1.aShortArray64[local1027];
						local1954 = arg1.aShortArray63[local737];
						local1959 = arg1.aShortArray61[local737];
						@Pc(1964) short local1964 = arg1.aShortArray62[local737];
						@Pc(1970) float local1970 = (float) arg1.anIntArray229[local1954];
						@Pc(1976) float local1976 = (float) arg1.anIntArray234[local1954];
						local1200 = (float) arg1.anIntArray235[local1954];
						local1418 = (float) arg1.anIntArray229[local1959] - local1970;
						local1426 = (float) arg1.anIntArray234[local1959] - local1976;
						@Pc(2007) float local2007 = (float) arg1.anIntArray235[local1959] - local1200;
						@Pc(2016) float local2016 = (float) arg1.anIntArray229[local1964] - local1970;
						@Pc(2025) float local2025 = (float) arg1.anIntArray234[local1964] - local1976;
						@Pc(2033) float local2033 = (float) arg1.anIntArray235[local1964] - local1200;
						@Pc(2042) float local2042 = (float) arg1.anIntArray229[local1157] - local1970;
						@Pc(2051) float local2051 = (float) arg1.anIntArray234[local1157] - local1976;
						@Pc(2059) float local2059 = (float) arg1.anIntArray235[local1157] - local1200;
						@Pc(2067) float local2067 = (float) arg1.anIntArray229[local1162] - local1970;
						@Pc(2075) float local2075 = (float) arg1.anIntArray234[local1162] - local1976;
						local1525 = (float) arg1.anIntArray235[local1162] - local1200;
						local1533 = (float) arg1.anIntArray229[local1167] - local1970;
						local1541 = (float) arg1.anIntArray234[local1167] - local1976;
						local1564 = (float) arg1.anIntArray235[local1167] - local1200;
						local1587 = local1426 * local2033 - local2007 * local2025;
						local1610 = local2007 * local2016 - local2033 * local1418;
						@Pc(2134) float local2134 = local2025 * local1418 - local2016 * local1426;
						@Pc(2142) float local2142 = local2025 * local2134 - local2033 * local1610;
						@Pc(2151) float local2151 = local2033 * local1587 - local2016 * local2134;
						@Pc(2159) float local2159 = local2016 * local1610 - local1587 * local2025;
						@Pc(2173) float local2173 = 1.0F / (local1418 * local2142 + local2151 * local1426 + local2159 * local2007);
						local1100 = local2173 * (local2159 * local1525 + local2075 * local2151 + local2142 * local2067);
						local1096 = (local2051 * local2151 + local2042 * local2142 + local2059 * local2159) * local2173;
						local1104 = (local1564 * local2159 + local1533 * local2142 + local2151 * local1541) * local2173;
						@Pc(2224) float local2224 = local1426 * local2134 - local1610 * local2007;
						@Pc(2233) float local2233 = local1587 * local2007 - local1418 * local2134;
						@Pc(2242) float local2242 = local1418 * local1610 - local1587 * local1426;
						@Pc(2256) float local2256 = 1.0F / (local2233 * local2025 + local2224 * local2016 + local2033 * local2242);
						local1102 = local2256 * (local2242 * local1525 + local2224 * local2067 + local2233 * local2075);
						local1106 = local2256 * (local2224 * local1533 + local2233 * local1541 + local2242 * local1564);
						local1098 = (local2233 * local2051 + local2224 * local2042 + local2242 * local2059) * local2256;
					} else {
						local1157 = arg1.aShortArray68[local1027];
						local1162 = arg1.aShortArray69[local1027];
						local1167 = arg1.aShortArray64[local1027];
						@Pc(1172) int local1172 = local703.anIntArray444[local737];
						@Pc(1177) int local1177 = local703.anIntArray445[local737];
						@Pc(1182) int local1182 = local703.anIntArray447[local737];
						@Pc(1187) float[] local1187 = local703.aFloatArrayArray14[local737];
						@Pc(1192) byte local1192 = arg1.aByteArray41[local737];
						local1200 = (float) arg1.anIntArray227[local737] / 256.0F;
						if (local1147 == 1) {
							local1418 = (float) arg1.anIntArray228[local737] / 1024.0F;
							Static350.method6051(arg1.anIntArray234[local1157], arg1.anIntArray229[local1157], arg1.anIntArray235[local1157], Static249.aFloatArray26, local1177, local1200, local1192, local1187, local1182, local1418, local1172);
							local1096 = Static249.aFloatArray26[0];
							local1098 = Static249.aFloatArray26[1];
							Static350.method6051(arg1.anIntArray234[local1162], arg1.anIntArray229[local1162], arg1.anIntArray235[local1162], Static249.aFloatArray26, local1177, local1200, local1192, local1187, local1182, local1418, local1172);
							local1100 = Static249.aFloatArray26[0];
							local1102 = Static249.aFloatArray26[1];
							Static350.method6051(arg1.anIntArray234[local1167], arg1.anIntArray229[local1167], arg1.anIntArray235[local1167], Static249.aFloatArray26, local1177, local1200, local1192, local1187, local1182, local1418, local1172);
							local1106 = Static249.aFloatArray26[1];
							local1104 = Static249.aFloatArray26[0];
							local1426 = local1418 / 2.0F;
							if ((local1192 & 0x1) == 0) {
								if (local1426 < local1104 - local1096) {
									local1110 = 1;
									local1104 -= local1418;
								} else if (local1426 < local1096 - local1104) {
									local1110 = 2;
									local1104 += local1418;
								}
								if (local1426 < local1100 - local1096) {
									local1108 = 1;
									local1100 -= local1418;
								} else if (local1096 - local1100 > local1426) {
									local1108 = 2;
									local1100 += local1418;
								}
							} else {
								if (local1106 - local1098 > local1426) {
									local1106 -= local1418;
									local1110 = 1;
								} else if (local1426 < local1098 - local1106) {
									local1110 = 2;
									local1106 += local1418;
								}
								if (local1102 - local1098 > local1426) {
									local1102 -= local1418;
									local1108 = 1;
								} else if (local1426 < local1098 - local1102) {
									local1102 += local1418;
									local1108 = 2;
								}
							}
						} else if (local1147 == 2) {
							local1418 = (float) arg1.anIntArray233[local737] / 256.0F;
							local1426 = (float) arg1.anIntArray230[local737] / 256.0F;
							@Pc(1437) int local1437 = arg1.anIntArray229[local1162] - arg1.anIntArray229[local1157];
							@Pc(1448) int local1448 = arg1.anIntArray234[local1162] - arg1.anIntArray234[local1157];
							@Pc(1459) int local1459 = arg1.anIntArray235[local1162] - arg1.anIntArray235[local1157];
							@Pc(1470) int local1470 = arg1.anIntArray229[local1167] - arg1.anIntArray229[local1157];
							@Pc(1481) int local1481 = arg1.anIntArray234[local1167] - arg1.anIntArray234[local1157];
							@Pc(1492) int local1492 = arg1.anIntArray235[local1167] - arg1.anIntArray235[local1157];
							@Pc(1501) int local1501 = local1492 * local1448 - local1481 * local1459;
							@Pc(1509) int local1509 = local1470 * local1459 - local1492 * local1437;
							@Pc(1517) int local1517 = local1481 * local1437 - local1448 * local1470;
							local1525 = 64.0F / (float) arg1.anIntArray231[local737];
							local1533 = 64.0F / (float) arg1.anIntArray236[local737];
							local1541 = 64.0F / (float) arg1.anIntArray228[local737];
							local1564 = ((float) local1517 * local1187[2] + local1187[0] * (float) local1501 + local1187[1] * (float) local1509) / local1525;
							local1587 = ((float) local1517 * local1187[5] + local1187[3] * (float) local1501 + local1187[4] * (float) local1509) / local1533;
							local1610 = ((float) local1517 * local1187[8] + local1187[7] * (float) local1509 + (float) local1501 * local1187[6]) / local1541;
							local1112 = Static625.method9290(local1587, local1610, local1564);
							Static621.method9242(arg1.anIntArray229[local1157], local1187, local1182, arg1.anIntArray235[local1157], local1200, local1177, local1192, local1426, local1112, local1172, local1418, Static249.aFloatArray26, arg1.anIntArray234[local1157]);
							local1098 = Static249.aFloatArray26[1];
							local1096 = Static249.aFloatArray26[0];
							Static621.method9242(arg1.anIntArray229[local1162], local1187, local1182, arg1.anIntArray235[local1162], local1200, local1177, local1192, local1426, local1112, local1172, local1418, Static249.aFloatArray26, arg1.anIntArray234[local1162]);
							local1102 = Static249.aFloatArray26[1];
							local1100 = Static249.aFloatArray26[0];
							Static621.method9242(arg1.anIntArray229[local1167], local1187, local1182, arg1.anIntArray235[local1167], local1200, local1177, local1192, local1426, local1112, local1172, local1418, Static249.aFloatArray26, arg1.anIntArray234[local1167]);
							local1104 = Static249.aFloatArray26[0];
							local1106 = Static249.aFloatArray26[1];
						} else if (local1147 == 3) {
							Static652.method9569(local1192, local1200, arg1.anIntArray235[local1157], Static249.aFloatArray26, arg1.anIntArray234[local1157], local1177, arg1.anIntArray229[local1157], local1187, local1182, local1172);
							local1098 = Static249.aFloatArray26[1];
							local1096 = Static249.aFloatArray26[0];
							Static652.method9569(local1192, local1200, arg1.anIntArray235[local1162], Static249.aFloatArray26, arg1.anIntArray234[local1162], local1177, arg1.anIntArray229[local1162], local1187, local1182, local1172);
							local1102 = Static249.aFloatArray26[1];
							local1100 = Static249.aFloatArray26[0];
							Static652.method9569(local1192, local1200, arg1.anIntArray235[local1167], Static249.aFloatArray26, arg1.anIntArray234[local1167], local1177, arg1.anIntArray229[local1167], local1187, local1182, local1172);
							local1104 = Static249.aFloatArray26[0];
							local1106 = Static249.aFloatArray26[1];
							if ((local1192 & 0x1) == 0) {
								if (local1100 - local1096 > 0.5F) {
									local1100--;
									local1108 = 1;
								} else if (local1096 - local1100 > 0.5F) {
									local1108 = 2;
									local1100++;
								}
								if (local1104 - local1096 > 0.5F) {
									local1110 = 1;
									local1104--;
								} else if (local1096 - local1104 > 0.5F) {
									local1110 = 2;
									local1104++;
								}
							} else {
								if (local1102 - local1098 > 0.5F) {
									local1108 = 1;
									local1102--;
								} else if (local1098 - local1102 > 0.5F) {
									local1102++;
									local1108 = 2;
								}
								if (local1106 - local1098 > 0.5F) {
									local1106--;
									local1110 = 1;
								} else if (local1098 - local1106 > 0.5F) {
									local1106++;
									local1110 = 2;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray38 == null) {
				local1147 = 0;
			} else {
				local1147 = arg1.aByteArray38[local1027];
			}
			if (local1147 == 0) {
				@Pc(2332) long local2332 = ((long) local748 + (long) (local1034 << 8) + (long) (local1112 << 24) << 32) + (long) (local737 << 2);
				local1167 = arg1.aShortArray68[local1027];
				local1954 = arg1.aShortArray69[local1027];
				local1959 = arg1.aShortArray64[local1027];
				@Pc(2351) Class195 local2351 = local422[local1167];
				this.aShortArray140[local163] = this.method8648(local2351.anInt5556, arg1, local1098, local1167, local2351.anInt5552, local2351.anInt5553, local1096, local2351.anInt5550, local2332, local163);
				@Pc(2376) Class195 local2376 = local422[local1954];
				this.aShortArray137[local163] = this.method8648(local2376.anInt5556, arg1, local1102, local1954, local2376.anInt5552, local2376.anInt5553, local1100, local2376.anInt5550, (long) local1108 + local2332, local163);
				@Pc(2404) Class195 local2404 = local422[local1959];
				this.aShortArray134[local163] = this.method8648(local2404.anInt5556, arg1, local1106, local1959, local2404.anInt5552, local2404.anInt5553, local1104, local2404.anInt5550, local2332 + (long) local1110, local163);
			} else if (local1147 == 1) {
				@Pc(2439) Class212 local2439 = local707[local1027];
				@Pc(2484) long local2484 = ((long) (local1112 << 24) + (long) (local1034 << 8) + (long) local748 << 32) + (long) ((local2439.anInt6363 + 256 << 22) + (local2439.anInt6361 + 256 << 12) + (local2439.anInt6362 > 0 ? 1024 : 2048) + (local737 << 2));
				this.aShortArray140[local163] = this.method8648(local2439.anInt6363, arg1, local1098, arg1.aShortArray68[local1027], 0, local2439.anInt6361, local1096, local2439.anInt6362, local2484, local163);
				this.aShortArray137[local163] = this.method8648(local2439.anInt6363, arg1, local1102, arg1.aShortArray69[local1027], 0, local2439.anInt6361, local1100, local2439.anInt6362, (long) local1108 + local2484, local163);
				this.aShortArray134[local163] = this.method8648(local2439.anInt6363, arg1, local1106, arg1.aShortArray64[local1027], 0, local2439.anInt6361, local1104, local2439.anInt6362, local2484 + (long) local1110, local163);
			}
			if (arg1.aByteArray42 != null) {
				this.aByteArray89[local163] = arg1.aByteArray42[local1027];
			}
			if (arg1.aShortArray70 != null) {
				this.aShortArray139[local163] = arg1.aShortArray70[local1027];
			}
			this.aShortArray138[local163] = arg1.aShortArray67[local1027];
			this.aShortArray141[local163] = local1070;
		}
		if (this.anInt9926 > 0) {
			local1027 = 1;
			local726 = this.aShortArray141[0];
			for (local737 = 0; local737 < this.anInt9926; local737++) {
				@Pc(2621) short local2621 = this.aShortArray141[local737];
				if (local2621 != local726) {
					local1027++;
					local726 = local2621;
				}
			}
			this.anIntArray499 = new int[local1027 + 1];
			this.anIntArray498 = new int[local1027];
			this.anIntArray496 = new int[local1027];
			this.anIntArray499[0] = 0;
			local748 = this.anInt9931;
			local726 = this.aShortArray141[0];
			local1070 = 0;
			local1027 = 0;
			for (local770 = 0; local770 < this.anInt9926; local770++) {
				@Pc(2676) short local2676 = this.aShortArray141[local770];
				if (local2676 != local726) {
					this.anIntArray496[local1027] = local748;
					this.anIntArray498[local1027] = local1070 + 1 - local748;
					local1027++;
					this.anIntArray499[local1027] = local770;
					local748 = this.anInt9931;
					local1070 = 0;
					local726 = local2676;
				}
				@Pc(2716) short local2716 = this.aShortArray140[local770];
				if (local1070 < local2716) {
					local1070 = local2716;
				}
				if (local2716 < local748) {
					local748 = local2716;
				}
				local2716 = this.aShortArray137[local770];
				if (local2716 < local748) {
					local748 = local2716;
				}
				if (local2716 > local1070) {
					local1070 = local2716;
				}
				local2716 = this.aShortArray134[local770];
				if (local2716 < local748) {
					local748 = local2716;
				}
				if (local2716 > local1070) {
					local1070 = local2716;
				}
			}
			this.anIntArray496[local1027] = local748;
			this.anIntArray498[local1027] = local1070 + 1 - local748;
			local1027++;
			this.anIntArray499[local1027] = this.anInt9926;
		}
		Static21.aLongArray1 = null;
		this.aShortArray133 = Static377.method6406(this.anInt9931, this.aShortArray133);
		this.aShortArray130 = Static377.method6406(this.anInt9931, this.aShortArray130);
		this.aShortArray142 = Static377.method6406(this.anInt9931, this.aShortArray142);
		this.aShortArray131 = Static377.method6406(this.anInt9931, this.aShortArray131);
		this.aShortArray135 = Static377.method6406(this.anInt9931, this.aShortArray135);
		this.aByteArray88 = Static547.method8376(this.aByteArray88, this.anInt9931);
		this.aFloatArray70 = Static440.method7154(this.aFloatArray70, this.anInt9931);
		this.aFloatArray71 = Static440.method7154(this.aFloatArray71, this.anInt9931);
		if (arg1.anIntArray226 != null && Static662.method8954(this.anInt9910, arg2)) {
			this.anIntArrayArray54 = arg1.method4365(false);
		}
		if (arg1.aClass161Array1 != null && Static266.method4572(arg2, this.anInt9910)) {
			this.anIntArrayArray52 = arg1.method4353();
		}
		if (arg1.anIntArray232 != null && Static354.method6090(arg2, this.anInt9910)) {
			local1027 = 0;
			@Pc(2908) int[] local2908 = new int[256];
			for (local737 = 0; local737 < this.anInt9907; local737++) {
				local748 = arg1.anIntArray232[local22[local737]];
				if (local748 >= 0) {
					@Pc(2925) int local2925 = local2908[local748]++;
					if (local748 > local1027) {
						local1027 = local748;
					}
				}
			}
			this.anIntArrayArray53 = new int[local1027 + 1][];
			for (local748 = 0; local748 <= local1027; local748++) {
				this.anIntArrayArray53[local748] = new int[local2908[local748]];
				local2908[local748] = 0;
			}
			for (local759 = 0; local759 < this.anInt9907; local759++) {
				local770 = arg1.anIntArray232[local22[local759]];
				if (local770 >= 0) {
					this.anIntArrayArray53[local770][local2908[local770]++] = local759;
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lclient!mj;IIZZ)V")
	public Class14_Sub3(@OriginalArg(0) Class101_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.aBoolean724 = true;
		this.aBoolean725 = false;
		this.anInt9898 = 0;
		this.aBoolean726 = false;
		this.anInt9931 = 0;
		this.aBoolean727 = false;
		this.anInt9907 = 0;
		this.anInt9926 = 0;
		this.aBoolean728 = false;
		this.anInt9917 = 0;
		this.aBoolean728 = arg4;
		this.lb = arg1;
		this.aClass101_Sub1_23 = arg0;
		this.anInt9910 = arg2;
		if (arg3 || Static59.method1119(this.lb, this.anInt9910)) {
			this.aClass288_1 = new Class288(Static318.method5254(this.lb, this.anInt9910));
		}
		if (arg3 || Static175.method3430(this.lb, this.anInt9910)) {
			this.aClass288_4 = new Class288(Static256.method9212(this.anInt9910, this.lb));
		}
		if (arg3 || Static388.method6540(this.anInt9910, this.lb)) {
			this.aClass288_2 = new Class288(Static39.method9318(this.anInt9910, this.lb));
		}
		if (arg3 || Static390.method6562(this.lb, this.anInt9910)) {
			this.aClass288_3 = new Class288(Static293.method6715(this.anInt9910, this.lb));
		}
		if (arg3 || Static461.method7372(this.anInt9910, this.lb)) {
			this.aClass142_1 = new Class142(Static189.method3618(this.lb, this.anInt9910));
		}
	}

	@OriginalMember(owner = "client!te", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (arg0 == 0) {
			Static457.anInt8214 = 0;
			Static262.anInt5000 = 0;
			local13 = 0;
			Static241.anInt4779 = 0;
			for (local17 = 0; local17 < this.anInt9898; local17++) {
				Static457.anInt8214 += this.anIntArray495[local17];
				Static241.anInt4779 += this.anIntArray500[local17];
				local13++;
				Static262.anInt5000 += this.anIntArray502[local17];
			}
			if (local13 <= 0) {
				Static241.anInt4779 = arg2;
				Static457.anInt8214 = arg1;
				Static262.anInt5000 = arg3;
			} else {
				Static262.anInt5000 = Static262.anInt5000 / local13 + arg3;
				Static241.anInt4779 = Static241.anInt4779 / local13 + arg2;
				Static457.anInt8214 = arg1 + Static457.anInt8214 / local13;
			}
		} else if (arg0 == 1) {
			for (local13 = 0; local13 < this.anInt9898; local13++) {
				this.anIntArray495[local13] += arg1;
				this.anIntArray500[local13] += arg2;
				this.anIntArray502[local13] += arg3;
			}
		} else {
			@Pc(163) int local163;
			@Pc(181) int local181;
			if (arg0 == 2) {
				for (local13 = 0; local13 < this.anInt9898; local13++) {
					this.anIntArray495[local13] -= Static457.anInt8214;
					this.anIntArray500[local13] -= Static241.anInt4779;
					this.anIntArray502[local13] -= Static262.anInt5000;
					if (arg3 != 0) {
						local17 = Class12_Sub2.anIntArray204[arg3];
						local163 = Class12_Sub2.anIntArray203[arg3];
						local181 = this.anIntArray495[local13] * local163 + this.anIntArray500[local13] * local17 + 16383 >> 14;
						this.anIntArray500[local13] = this.anIntArray500[local13] * local163 + 16383 - local17 * this.anIntArray495[local13] >> 14;
						this.anIntArray495[local13] = local181;
					}
					if (arg1 != 0) {
						local17 = Class12_Sub2.anIntArray204[arg1];
						local163 = Class12_Sub2.anIntArray203[arg1];
						local181 = this.anIntArray500[local13] * local163 + 16383 - local17 * this.anIntArray502[local13] >> 14;
						this.anIntArray502[local13] = this.anIntArray502[local13] * local163 + local17 * this.anIntArray500[local13] + 16383 >> 14;
						this.anIntArray500[local13] = local181;
					}
					if (arg2 != 0) {
						local17 = Class12_Sub2.anIntArray204[arg2];
						local163 = Class12_Sub2.anIntArray203[arg2];
						local181 = local17 * this.anIntArray502[local13] + this.anIntArray495[local13] * local163 + 16383 >> 14;
						this.anIntArray502[local13] = this.anIntArray502[local13] * local163 + 16383 - this.anIntArray495[local13] * local17 >> 14;
						this.anIntArray495[local13] = local181;
					}
					this.anIntArray495[local13] += Static457.anInt8214;
					this.anIntArray500[local13] += Static241.anInt4779;
					this.anIntArray502[local13] += Static262.anInt5000;
				}
			} else if (arg0 == 3) {
				for (local13 = 0; local13 < this.anInt9898; local13++) {
					this.anIntArray495[local13] -= Static457.anInt8214;
					this.anIntArray500[local13] -= Static241.anInt4779;
					this.anIntArray502[local13] -= Static262.anInt5000;
					this.anIntArray495[local13] = arg1 * this.anIntArray495[local13] / 128;
					this.anIntArray500[local13] = arg2 * this.anIntArray500[local13] / 128;
					this.anIntArray502[local13] = this.anIntArray502[local13] * arg3 / 128;
					this.anIntArray495[local13] += Static457.anInt8214;
					this.anIntArray500[local13] += Static241.anInt4779;
					this.anIntArray502[local13] += Static262.anInt5000;
				}
			} else {
				@Pc(507) Class393 local507;
				@Pc(512) Class365 local512;
				if (arg0 == 5) {
					for (local13 = 0; local13 < this.anInt9907; local13++) {
						local17 = arg1 * 8 + (this.aByteArray89[local13] & 0xFF);
						if (local17 < 0) {
							local17 = 0;
						} else if (local17 > 255) {
							local17 = 255;
						}
						this.aByteArray89[local13] = (byte) local17;
					}
					if (this.aClass393Array1 != null) {
						for (local17 = 0; local17 < this.anInt9911; local17++) {
							local507 = this.aClass393Array1[local17];
							local512 = this.aClass365Array1[local17];
							local512.anInt10800 = local512.anInt10800 & 0xFFFFFF | 255 - (this.aByteArray89[local507.anInt11381] & 0xFF) << 24;
						}
					}
					this.method8655();
				} else if (arg0 == 7) {
					for (local13 = 0; local13 < this.anInt9907; local13++) {
						local17 = this.aShortArray138[local13] & 0xFFFF;
						local163 = local17 >> 10 & 0x3F;
						local181 = local17 >> 7 & 0x7;
						@Pc(571) int local571 = local163 + arg1 & 0x3F;
						local181 += arg2 / 4;
						@Pc(581) int local581 = local17 & 0x7F;
						local581 += arg3;
						if (local181 < 0) {
							local181 = 0;
						} else if (local181 > 7) {
							local181 = 7;
						}
						if (local581 < 0) {
							local581 = 0;
						} else if (local581 > 127) {
							local581 = 127;
						}
						this.aShortArray138[local13] = (short) (local181 << 7 | local571 << 10 | local581);
					}
					if (this.aClass393Array1 != null) {
						for (local17 = 0; local17 < this.anInt9911; local17++) {
							local507 = this.aClass393Array1[local17];
							local512 = this.aClass365Array1[local17];
							local512.anInt10800 = local512.anInt10800 & 0xFF000000 | Static101.anIntArray92[this.aShortArray138[local507.anInt11381] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method8655();
				} else {
					@Pc(682) Class365 local682;
					if (arg0 == 8) {
						for (local13 = 0; local13 < this.anInt9911; local13++) {
							local682 = this.aClass365Array1[local13];
							local682.anInt10802 += arg1;
							local682.anInt10805 += arg2;
						}
					} else if (arg0 == 10) {
						for (local13 = 0; local13 < this.anInt9911; local13++) {
							local682 = this.aClass365Array1[local13];
							local682.anInt10807 = arg1 * local682.anInt10807 >> 7;
							local682.anInt10799 = arg2 * local682.anInt10799 >> 7;
						}
					} else if (arg0 == 9) {
						for (local13 = 0; local13 < this.anInt9911; local13++) {
							local682 = this.aClass365Array1[local13];
							local682.anInt10804 = local682.anInt10804 + arg1 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9898; local7++) {
			if (arg0 != 0) {
				this.anIntArray495[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray500[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray502[local7] += arg2;
			}
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIIIII)Z")
	private boolean method8645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg4 && arg5 > arg6 && arg6 < arg2) {
			return false;
		} else if (arg4 < arg6 && arg6 > arg5 && arg6 > arg2) {
			return false;
		} else if (arg1 > arg3 && arg3 < arg7 && arg3 < arg0) {
			return false;
		} else {
			return arg3 <= arg1 || arg3 <= arg7 || arg3 <= arg0;
		}
	}

	@OriginalMember(owner = "client!te", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class18 arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean726) {
			this.method8660();
		}
		@Pc(16) int local16 = arg4 + this.anInt9925;
		@Pc(21) int local21 = this.anInt9893 + arg4;
		@Pc(26) int local26 = this.anInt9892 + arg6;
		@Pc(32) int local32 = arg6 + this.anInt9866;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9741 <= local21 + arg2.anInt9739 >> arg2.anInt9740 || local26 < 0 || arg2.anInt9742 <= arg2.anInt9739 + local32 >> arg2.anInt9740)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9741 <= arg3.anInt9739 + local21 >> arg3.anInt9740 || local26 < 0 || arg3.anInt9742 <= local32 + arg3.anInt9739 >> arg3.anInt9740) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9740;
			local21 = local21 + arg2.anInt9739 - 1 >> arg2.anInt9740;
			local26 >>= arg2.anInt9740;
			local32 = arg2.anInt9739 + local32 - 1 >> arg2.anInt9740;
			if (arg5 == arg2.method8537(local26, local16) && arg5 == arg2.method8537(local26, local21) && arg2.method8537(local32, local16) == arg5 && arg5 == arg2.method8537(local32, local21)) {
				return;
			}
		}
		@Pc(201) int local201;
		if (arg0 == 1) {
			for (local201 = 0; local201 < this.anInt9898; local201++) {
				this.anIntArray500[local201] = this.anIntArray500[local201] + arg2.method8542(arg6 + this.anIntArray502[local201], arg4 + this.anIntArray495[local201]) - arg5;
			}
		} else {
			@Pc(209) int local209;
			@Pc(217) int local217;
			if (arg0 == 2) {
				local201 = this.anInt9871;
				if (local201 == 0) {
					return;
				}
				for (local209 = 0; local209 < this.anInt9898; local209++) {
					local217 = (this.anIntArray500[local209] << 16) / local201;
					if (local217 < arg1) {
						this.anIntArray500[local209] += (arg1 - local217) * (-arg5 + arg2.method8542(arg6 + this.anIntArray502[local209], arg4 + this.anIntArray495[local209])) / arg1;
					}
				}
			} else {
				@Pc(225) int local225;
				if (arg0 == 3) {
					local201 = (arg1 & 0xFF) * 4;
					local209 = (arg1 >> 8 & 0xFF) * 4;
					local217 = (arg1 >> 16 & 0xFF) << 6;
					local225 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local201 >> 1) < 0 || arg2.anInt9739 + (local201 >> 1) + arg4 >= arg2.anInt9741 << arg2.anInt9740 || arg6 - (local209 >> 1) < 0 || arg6 + (local209 >> 1) + arg2.anInt9739 >= arg2.anInt9742 << arg2.anInt9740) {
						return;
					}
					this.method8637(local225, arg5, local201, local209, local217, arg4, arg6, arg2);
				} else if (arg0 == 4) {
					local201 = this.anInt9937 - this.anInt9871;
					for (local209 = 0; local209 < this.anInt9898; local209++) {
						this.anIntArray500[local209] = local201 + this.anIntArray500[local209] + arg3.method8542(arg6 + this.anIntArray502[local209], arg4 + this.anIntArray495[local209]) - arg5;
					}
				} else if (arg0 == 5) {
					local201 = this.anInt9937 - this.anInt9871;
					for (local209 = 0; local209 < this.anInt9898; local209++) {
						local217 = this.anIntArray495[local209] + arg4;
						local225 = arg6 + this.anIntArray502[local209];
						@Pc(385) int local385 = arg2.method8542(local225, local217);
						@Pc(391) int local391 = arg3.method8542(local225, local217);
						@Pc(398) int local398 = local385 - arg1 - local391;
						this.anIntArray500[local209] = local385 + (local398 * ((this.anIntArray500[local209] << 8) / local201) >> 8) - arg5;
					}
				}
			}
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9871;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(I)V")
	private void method8646() {
		if (this.aClass142_1 != null) {
			this.aClass142_1.aBoolean354 = false;
		}
	}

	@OriginalMember(owner = "client!te", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9922;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!ida;FZIIIFIJI)S")
	private short method8648(@OriginalArg(0) int arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) float arg6, @OriginalArg(8) int arg7, @OriginalArg(9) long arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray501[arg3];
		@Pc(24) int local24 = this.anIntArray501[arg3 + 1];
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = local10; local28 < local24; local28++) {
			@Pc(35) short local35 = this.aShortArray136[local28];
			if (local35 == 0) {
				local26 = local28;
				break;
			}
			if (Static21.aLongArray1[local28] == arg8) {
				return (short) (local35 - 1);
			}
		}
		this.aShortArray136[local26] = (short) (this.anInt9931 + 1);
		Static21.aLongArray1[local26] = arg8;
		this.aShortArray130[this.anInt9931] = (short) arg9;
		this.aShortArray133[this.anInt9931] = (short) arg3;
		this.aShortArray142[this.anInt9931] = (short) arg7;
		this.aShortArray131[this.anInt9931] = (short) arg5;
		this.aShortArray135[this.anInt9931] = (short) arg0;
		this.aByteArray88[this.anInt9931] = (byte) arg4;
		this.aFloatArray70[this.anInt9931] = arg6;
		this.aFloatArray71[this.anInt9931] = arg2;
		return (short) this.anInt9931++;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)V")
	@Override
	public void method8638(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt9907; local3++) {
			local12 = this.aShortArray138[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg0 != -1) {
				local18 -= -((arg0 - local18) * arg3 >> 7);
			}
			@Pc(43) int local43 = local12 & 0x7F;
			if (arg1 != -1) {
				local24 -= -(arg3 * (arg1 - local24) >> 7);
			}
			if (arg2 != -1) {
				local43 += arg3 * (arg2 - local43) >> 7;
			}
			this.aShortArray138[local3] = (short) (local43 | local18 << 10 | local24 << 7);
		}
		if (this.aClass393Array1 != null) {
			for (local12 = 0; local12 < this.anInt9911; local12++) {
				@Pc(107) Class393 local107 = this.aClass393Array1[local12];
				@Pc(112) Class365 local112 = this.aClass365Array1[local12];
				local112.anInt10800 = local112.anInt10800 & 0xFF000000 | Static101.anIntArray92[this.aShortArray138[local107.anInt11381] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method8655();
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "()Z")
	@Override
	public boolean method8635() {
		if (this.aShortArray141 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray141.length; local12++) {
			if (this.aShortArray141[local12] != -1 && !this.aClass101_Sub1_23.anInterface3_12.method1940(this.aShortArray141[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!te", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean727;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!dm;Lclient!et;II)V")
	@Override
	public void method8623(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt9931 == 0) {
			return;
		}
		@Pc(16) Class76_Sub2 local16 = this.aClass101_Sub1_23.aClass76_Sub2_16;
		if (!this.aBoolean726) {
			this.method8660();
		}
		@Pc(25) Class76_Sub2 local25 = (Class76_Sub2) arg0;
		Static295.aFloat110 = local25.aFloat166 * local16.aFloat175 + local16.aFloat174 * local25.aFloat173 + local25.aFloat165 * local16.aFloat166;
		Static105.aFloat30 = local16.aFloat169 + local25.aFloat169 * local16.aFloat175 + local16.aFloat174 * local25.aFloat176 + local16.aFloat166 * local25.aFloat170;
		@Pc(72) float local72 = (float) this.anInt9871 * Static295.aFloat110 + Static105.aFloat30;
		@Pc(80) float local80 = Static105.aFloat30 + (float) this.anInt9937 * Static295.aFloat110;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local80 < local72) {
			local96 = (float) this.anInt9922 + local72;
			local90 = local80 - (float) this.anInt9922;
		} else {
			local90 = local72 - (float) this.anInt9922;
			local96 = (float) this.anInt9922 + local80;
		}
		if (this.aClass101_Sub1_23.aFloat160 <= local90 || (float) this.aClass101_Sub1_23.anInt6637 >= local96) {
			return;
		}
		Static256.aFloat192 = local16.aFloat176 + local25.aFloat176 * local16.aFloat167 + local25.aFloat170 * local16.aFloat173 + local16.aFloat171 * local25.aFloat169;
		Static135.aFloat40 = local25.aFloat166 * local16.aFloat171 + local25.aFloat165 * local16.aFloat173 + local16.aFloat167 * local25.aFloat173;
		@Pc(172) float local172 = Static256.aFloat192 + (float) this.anInt9871 * Static135.aFloat40;
		@Pc(180) float local180 = Static135.aFloat40 * (float) this.anInt9937 + Static256.aFloat192;
		@Pc(207) float local207;
		@Pc(195) float local195;
		if (local172 > local180) {
			local207 = ((float) -this.anInt9922 + local180) * (float) this.aClass101_Sub1_23.anInt6615;
			local195 = (float) this.aClass101_Sub1_23.anInt6615 * ((float) this.anInt9922 + local172);
		} else {
			local195 = ((float) this.anInt9922 + local180) * (float) this.aClass101_Sub1_23.anInt6615;
			local207 = (float) this.aClass101_Sub1_23.anInt6615 * ((float) -this.anInt9922 + local172);
		}
		if (local207 / (float) arg2 >= this.aClass101_Sub1_23.aFloat155 || this.aClass101_Sub1_23.aFloat144 >= local195 / (float) arg2) {
			return;
		}
		Static318.aFloat116 = local25.aFloat166 * local16.aFloat172 + local16.aFloat168 * local25.aFloat173 + local25.aFloat165 * local16.aFloat165;
		Static232.aFloat201 = local25.aFloat170 * local16.aFloat165 + local16.aFloat168 * local25.aFloat176 + local25.aFloat169 * local16.aFloat172 + local16.aFloat170;
		@Pc(299) float local299 = Static232.aFloat201 + (float) this.anInt9871 * Static318.aFloat116;
		@Pc(307) float local307 = Static232.aFloat201 + (float) this.anInt9937 * Static318.aFloat116;
		@Pc(322) float local322;
		@Pc(333) float local333;
		if (local307 < local299) {
			local322 = (local307 - (float) this.anInt9922) * (float) this.aClass101_Sub1_23.anInt6639;
			local333 = (float) this.aClass101_Sub1_23.anInt6639 * (local299 + (float) this.anInt9922);
		} else {
			local322 = (float) this.aClass101_Sub1_23.anInt6639 * (local299 - (float) this.anInt9922);
			local333 = ((float) this.anInt9922 + local307) * (float) this.aClass101_Sub1_23.anInt6639;
		}
		if (this.aClass101_Sub1_23.aFloat147 <= local322 / (float) arg2 || local333 / (float) arg2 <= this.aClass101_Sub1_23.aFloat154) {
			return;
		}
		if (arg1 != null || this.aClass393Array1 != null) {
			Static295.aFloat109 = local16.aFloat175 * local25.aFloat175 + local16.aFloat166 * local25.aFloat172 + local16.aFloat174 * local25.aFloat171;
			Static342.aFloat143 = local25.aFloat174 * local16.aFloat175 + local25.aFloat168 * local16.aFloat166 + local16.aFloat174 * local25.aFloat167;
			Static180.aFloat79 = local16.aFloat168 * local25.aFloat167 + local16.aFloat165 * local25.aFloat168 + local25.aFloat174 * local16.aFloat172;
			Static73.aFloat13 = local25.aFloat167 * local16.aFloat167 + local25.aFloat168 * local16.aFloat173 + local25.aFloat174 * local16.aFloat171;
			Static201.aFloat84 = local16.aFloat165 * local25.aFloat172 + local16.aFloat168 * local25.aFloat171 + local25.aFloat175 * local16.aFloat172;
			Static167.aFloat76 = local16.aFloat171 * local25.aFloat175 + local25.aFloat171 * local16.aFloat167 + local16.aFloat173 * local25.aFloat172;
		}
		if (arg1 != null) {
			@Pc(501) int local501 = this.anInt9925 + this.anInt9893 >> 1;
			@Pc(509) int local509 = this.anInt9866 + this.anInt9892 >> 1;
			@Pc(528) int local528 = (int) (Static73.aFloat13 * (float) local501 + Static256.aFloat192 + Static135.aFloat40 * (float) this.anInt9871 + Static167.aFloat76 * (float) local509);
			@Pc(547) int local547 = (int) (Static232.aFloat201 + (float) local501 * Static180.aFloat79 + Static318.aFloat116 * (float) this.anInt9871 + Static201.aFloat84 * (float) local509);
			@Pc(566) int local566 = (int) ((float) local509 * Static295.aFloat109 + (float) this.anInt9871 * Static295.aFloat110 + Static105.aFloat30 + Static342.aFloat143 * (float) local501);
			@Pc(585) int local585 = (int) ((float) this.anInt9937 * Static135.aFloat40 + (float) local501 * Static73.aFloat13 + Static256.aFloat192 + (float) local509 * Static167.aFloat76);
			@Pc(604) int local604 = (int) ((float) local509 * Static201.aFloat84 + Static232.aFloat201 + Static180.aFloat79 * (float) local501 + Static318.aFloat116 * (float) this.anInt9937);
			arg1.anInt2725 = this.aClass101_Sub1_23.anInt6635 + local604 * this.aClass101_Sub1_23.anInt6639 / arg2;
			@Pc(636) int local636 = (int) ((float) local501 * Static342.aFloat143 + Static105.aFloat30 + (float) this.anInt9937 * Static295.aFloat110 + Static295.aFloat109 * (float) local509);
			arg1.anInt2727 = this.aClass101_Sub1_23.anInt6617 + this.aClass101_Sub1_23.anInt6615 * local528 / arg2;
			arg1.anInt2728 = this.aClass101_Sub1_23.anInt6635 + local547 * this.aClass101_Sub1_23.anInt6639 / arg2;
			arg1.anInt2726 = local585 * this.aClass101_Sub1_23.anInt6615 / arg2 + this.aClass101_Sub1_23.anInt6617;
			if (this.aClass101_Sub1_23.anInt6637 <= local566 || this.aClass101_Sub1_23.anInt6637 <= local636) {
				arg1.aBoolean200 = true;
				arg1.anInt2724 = this.aClass101_Sub1_23.anInt6617 + this.aClass101_Sub1_23.anInt6615 * (this.anInt9922 + local528) / arg2 - arg1.anInt2727;
			}
		}
		this.aClass101_Sub1_23.method5879((float) arg2);
		this.aClass101_Sub1_23.method5852();
		this.aClass101_Sub1_23.method5893(local25);
		this.method8662();
		this.method8658();
	}

	@OriginalMember(owner = "client!te", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort111 = (short) arg0;
		this.method8655();
	}

	@OriginalMember(owner = "client!te", name = "I", descriptor = "(I[IIIIZI[I)V")
	@Override
	protected void I(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7) {
		@Pc(8) int local8 = arg1.length;
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			Static457.anInt8214 = 0;
			Static262.anInt5000 = 0;
			local28 = 0;
			Static241.anInt4779 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray54.length > local38) {
					local48 = this.anIntArrayArray54[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray132 == null || (this.aShortArray132[local56] & arg6) != 0) {
							Static457.anInt8214 += this.anIntArray495[local56];
							Static241.anInt4779 += this.anIntArray500[local56];
							Static262.anInt5000 += this.anIntArray502[local56];
							local28++;
						}
					}
				}
			}
			if (local28 > 0) {
				Static457.anInt8214 = Static457.anInt8214 / local28 + arg2;
				Static266.aBoolean379 = true;
				Static241.anInt4779 = arg3 + Static241.anInt4779 / local28;
				Static262.anInt5000 = Static262.anInt5000 / local28 + arg4;
			} else {
				Static457.anInt8214 = arg2;
				Static262.anInt5000 = arg4;
				Static241.anInt4779 = arg3;
			}
			return;
		}
		@Pc(247) int[] local247;
		@Pc(249) int local249;
		if (arg0 == 1) {
			if (arg7 != null) {
				local28 = arg4 * arg7[2] + arg7[0] * arg2 + arg7[1] * arg3 + 8192 >> 14;
				local32 = arg3 * arg7[4] + arg7[3] * arg2 + arg4 * arg7[5] + 8192 >> 14;
				local38 = arg7[6] * arg2 + arg3 * arg7[7] + arg4 * arg7[8] + 8192 >> 14;
				arg4 = local38;
				arg2 = local28;
				arg3 = local32;
			}
			arg3 <<= 0x4;
			arg4 <<= 0x4;
			arg2 <<= 0x4;
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray54.length) {
					local247 = this.anIntArrayArray54[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray132 == null || (arg6 & this.aShortArray132[local50]) != 0) {
							this.anIntArray495[local50] += arg2;
							this.anIntArray500[local50] += arg3;
							this.anIntArray502[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(380) int local380;
		@Pc(398) int local398;
		@Pc(635) int local635;
		@Pc(644) int local644;
		@Pc(657) int local657;
		@Pc(661) int local661;
		@Pc(679) int local679;
		@Pc(1000) int local1000;
		@Pc(1008) int local1008;
		@Pc(1163) int local1163;
		@Pc(1188) int local1188;
		@Pc(1192) int local1192;
		@Pc(1202) int local1202;
		@Pc(1207) int local1207;
		@Pc(1211) int local1211;
		@Pc(1215) int local1215;
		@Pc(1217) int local1217;
		@Pc(1345) int[] local1345;
		@Pc(1347) int local1347;
		@Pc(1351) int local1351;
		@Pc(1355) int local1355;
		@Pc(1357) int local1357;
		@Pc(1488) int local1488;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (local32 < this.anIntArrayArray54.length) {
						local247 = this.anIntArrayArray54[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local50 = local247[local249];
							if (this.aShortArray132 == null || (arg6 & this.aShortArray132[local50]) != 0) {
								this.anIntArray495[local50] -= Static457.anInt8214;
								this.anIntArray500[local50] -= Static241.anInt4779;
								this.anIntArray502[local50] -= Static262.anInt5000;
								if (arg4 != 0) {
									local56 = Class12_Sub2.anIntArray204[arg4];
									local380 = Class12_Sub2.anIntArray203[arg4];
									local398 = local380 * this.anIntArray495[local50] + local56 * this.anIntArray500[local50] + 16383 >> 14;
									this.anIntArray500[local50] = this.anIntArray500[local50] * local380 + 16383 - local56 * this.anIntArray495[local50] >> 14;
									this.anIntArray495[local50] = local398;
								}
								if (arg2 != 0) {
									local56 = Class12_Sub2.anIntArray204[arg2];
									local380 = Class12_Sub2.anIntArray203[arg2];
									local398 = this.anIntArray500[local50] * local380 + 16383 - this.anIntArray502[local50] * local56 >> 14;
									this.anIntArray502[local50] = local56 * this.anIntArray500[local50] + this.anIntArray502[local50] * local380 + 16383 >> 14;
									this.anIntArray500[local50] = local398;
								}
								if (arg3 != 0) {
									local56 = Class12_Sub2.anIntArray204[arg3];
									local380 = Class12_Sub2.anIntArray203[arg3];
									local398 = local56 * this.anIntArray502[local50] + this.anIntArray495[local50] * local380 + 16383 >> 14;
									this.anIntArray502[local50] = local380 * this.anIntArray502[local50] + 16383 - this.anIntArray495[local50] * local56 >> 14;
									this.anIntArray495[local50] = local398;
								}
								this.anIntArray495[local50] += Static457.anInt8214;
								this.anIntArray500[local50] += Static241.anInt4779;
								this.anIntArray502[local50] += Static262.anInt5000;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray54.length > local38) {
							local48 = this.anIntArrayArray54[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray132 == null || (this.aShortArray132[local56] & arg6) != 0) {
									local380 = this.anIntArray501[local56];
									local398 = this.anIntArray501[local56 + 1];
									for (local635 = local380; local635 < local398; local635++) {
										local644 = this.aShortArray136[local635] - 1;
										if (local644 == -1) {
											break;
										}
										if (arg4 != 0) {
											local657 = Class12_Sub2.anIntArray204[arg4];
											local661 = Class12_Sub2.anIntArray203[arg4];
											local679 = local661 * this.aShortArray142[local644] + this.aShortArray131[local644] * local657 + 16383 >> 14;
											this.aShortArray131[local644] = (short) (local661 * this.aShortArray131[local644] + 16383 - local657 * this.aShortArray142[local644] >> 14);
											this.aShortArray142[local644] = (short) local679;
										}
										if (arg2 != 0) {
											local657 = Class12_Sub2.anIntArray204[arg2];
											local661 = Class12_Sub2.anIntArray203[arg2];
											local679 = this.aShortArray131[local644] * local661 + 16383 - this.aShortArray135[local644] * local657 >> 14;
											this.aShortArray135[local644] = (short) (this.aShortArray135[local644] * local661 + this.aShortArray131[local644] * local657 + 16383 >> 14);
											this.aShortArray131[local644] = (short) local679;
										}
										if (arg3 != 0) {
											local657 = Class12_Sub2.anIntArray204[arg3];
											local661 = Class12_Sub2.anIntArray203[arg3];
											local679 = this.aShortArray135[local644] * local657 + this.aShortArray142[local644] * local661 + 16383 >> 14;
											this.aShortArray135[local644] = (short) (this.aShortArray135[local644] * local661 + 16383 - this.aShortArray142[local644] * local657 >> 14);
											this.aShortArray142[local644] = (short) local679;
										}
									}
								}
							}
						}
					}
					this.method8656();
					return;
				}
			} else {
				local28 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local249 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static266.aBoolean379) {
					local380 = arg7[6] * Static262.anInt5000 + arg7[0] * Static457.anInt8214 + Static241.anInt4779 * arg7[3] + 8192 >> 14;
					local398 = arg7[4] * Static241.anInt4779 + Static457.anInt8214 * arg7[1] + arg7[7] * Static262.anInt5000 + 8192 >> 14;
					local398 += local50;
					local380 += local249;
					local635 = arg7[2] * Static457.anInt8214 + arg7[5] * Static241.anInt4779 + arg7[8] * Static262.anInt5000 + 8192 >> 14;
					Static457.anInt8214 = local380;
					local635 += local56;
					Static241.anInt4779 = local398;
					Static262.anInt5000 = local635;
					Static266.aBoolean379 = false;
				}
				@Pc(968) int[] local968 = new int[9];
				local398 = Class12_Sub2.anIntArray203[arg2];
				local635 = Class12_Sub2.anIntArray204[arg2];
				local644 = Class12_Sub2.anIntArray203[arg3];
				local657 = Class12_Sub2.anIntArray204[arg3];
				local661 = Class12_Sub2.anIntArray203[arg4];
				local679 = Class12_Sub2.anIntArray204[arg4];
				local1000 = local661 * local635 + 8192 >> 14;
				local1008 = local635 * local679 + 8192 >> 14;
				local968[7] = local679 * local657 + local644 * local1000 + 8192 >> 14;
				local968[6] = local644 * local1008 + local661 * -local657 + 8192 >> 14;
				local968[3] = local679 * local398 + 8192 >> 14;
				local968[1] = local657 * local1000 + -local644 * local679 + 8192 >> 14;
				local968[5] = -local635;
				local968[8] = local644 * local398 + 8192 >> 14;
				local968[0] = local1008 * local657 + local644 * local661 + 8192 >> 14;
				local968[4] = local661 * local398 + 8192 >> 14;
				local968[2] = local657 * local398 + 8192 >> 14;
				@Pc(1138) int local1138 = -Static262.anInt5000 * local968[2] + local968[0] * -Static457.anInt8214 + -Static241.anInt4779 * local968[1] + 8192 >> 14;
				local1163 = -Static262.anInt5000 * local968[5] + -Static457.anInt8214 * local968[3] + -Static241.anInt4779 * local968[4] + 8192 >> 14;
				local1188 = local968[8] * -Static262.anInt5000 + local968[7] * -Static241.anInt4779 + local968[6] * -Static457.anInt8214 + 8192 >> 14;
				local1192 = Static457.anInt8214 + local1138;
				@Pc(1197) int local1197 = local1163 + Static241.anInt4779;
				local1202 = local1188 + Static262.anInt5000;
				@Pc(1205) int[] local1205 = new int[9];
				for (local1207 = 0; local1207 < 3; local1207++) {
					for (local1211 = 0; local1211 < 3; local1211++) {
						local1215 = 0;
						for (local1217 = 0; local1217 < 3; local1217++) {
							local1215 += local968[local1207 * 3 + local1217] * arg7[local1211 * 3 + local1217];
						}
						local1205[local1211 + local1207 * 3] = local1215 + 8192 >> 14;
					}
				}
				local1211 = local968[2] * local56 + local50 * local968[1] + local249 * local968[0] + 8192 >> 14;
				local1215 = local968[3] * local249 + local50 * local968[4] + local56 * local968[5] + 8192 >> 14;
				local1215 += local1197;
				local1211 += local1192;
				local1217 = local56 * local968[8] + local50 * local968[7] + local249 * local968[6] + 8192 >> 14;
				local1217 += local1202;
				local1345 = new int[9];
				for (local1347 = 0; local1347 < 3; local1347++) {
					for (local1351 = 0; local1351 < 3; local1351++) {
						local1355 = 0;
						for (local1357 = 0; local1357 < 3; local1357++) {
							local1355 += arg7[local1347 * 3 + local1357] * local1205[local1351 + local1357 * 3];
						}
						local1345[local1347 * 3 + local1351] = local1355 + 8192 >> 14;
					}
				}
				local1351 = arg7[1] * local1215 + arg7[0] * local1211 + arg7[2] * local1217 + 8192 >> 14;
				local1355 = local1217 * arg7[5] + local1211 * arg7[3] + arg7[4] * local1215 + 8192 >> 14;
				local1357 = arg7[8] * local1217 + local1211 * arg7[6] + local1215 * arg7[7] + 8192 >> 14;
				local1355 += local32;
				local1351 += local28;
				local1357 += local38;
				for (local1488 = 0; local1488 < local8; local1488++) {
					@Pc(1494) int local1494 = arg1[local1488];
					if (local1494 < this.anIntArrayArray54.length) {
						@Pc(1504) int[] local1504 = this.anIntArrayArray54[local1494];
						for (@Pc(1506) int local1506 = 0; local1506 < local1504.length; local1506++) {
							@Pc(1512) int local1512 = local1504[local1506];
							if (this.aShortArray132 == null || (this.aShortArray132[local1512] & arg6) != 0) {
								@Pc(1553) int local1553 = local1345[1] * this.anIntArray500[local1512] + this.anIntArray495[local1512] * local1345[0] + this.anIntArray502[local1512] * local1345[2] + 8192 >> 14;
								@Pc(1584) int local1584 = this.anIntArray502[local1512] * local1345[5] + this.anIntArray500[local1512] * local1345[4] + local1345[3] * this.anIntArray495[local1512] + 8192 >> 14;
								@Pc(1616) int local1616 = local1345[8] * this.anIntArray502[local1512] + local1345[6] * this.anIntArray495[local1512] + local1345[7] * this.anIntArray500[local1512] + 8192 >> 14;
								@Pc(1620) int local1620 = local1584 + local1355;
								@Pc(1624) int local1624 = local1553 + local1351;
								this.anIntArray495[local1512] = local1624;
								@Pc(1633) int local1633 = local1616 + local1357;
								this.anIntArray500[local1512] = local1620;
								this.anIntArray502[local1512] = local1633;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2563) Class365 local2563;
			@Pc(2446) boolean local2446;
			@Pc(2558) Class393 local2558;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					local2446 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray53.length > local38) {
							local48 = this.anIntArrayArray53[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray139 == null || (arg6 & this.aShortArray139[local56]) != 0) {
									local380 = arg2 * 8 + (this.aByteArray89[local56] & 0xFF);
									if (local380 < 0) {
										local380 = 0;
									} else if (local380 > 255) {
										local380 = 255;
									}
									this.aByteArray89[local56] = (byte) local380;
								}
							}
							local2446 |= local48.length > 0;
						}
					}
					if (local2446) {
						if (this.aClass393Array1 != null) {
							for (local38 = 0; local38 < this.anInt9911; local38++) {
								local2558 = this.aClass393Array1[local38];
								local2563 = this.aClass365Array1[local38];
								local2563.anInt10800 = 255 - (this.aByteArray89[local2558.anInt11381] & 0xFF) << 24 | local2563.anInt10800 & 0xFFFFFF;
							}
						}
						this.method8655();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray53 != null) {
					local2446 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray53.length > local38) {
							local48 = this.anIntArrayArray53[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray139 == null || (this.aShortArray139[local56] & arg6) != 0) {
									local380 = this.aShortArray138[local56] & 0xFFFF;
									local398 = local380 >> 10 & 0x3F;
									local635 = local380 >> 7 & 0x7;
									@Pc(2669) int local2669 = local398 + arg2 & 0x3F;
									local644 = local380 & 0x7F;
									local635 += arg3 / 4;
									if (local635 < 0) {
										local635 = 0;
									} else if (local635 > 7) {
										local635 = 7;
									}
									local644 += arg4;
									if (local644 < 0) {
										local644 = 0;
									} else if (local644 > 127) {
										local644 = 127;
									}
									this.aShortArray138[local56] = (short) (local644 | local2669 << 10 | local635 << 7);
								}
							}
							local2446 |= local48.length > 0;
						}
					}
					if (local2446) {
						if (this.aClass393Array1 != null) {
							for (local38 = 0; local38 < this.anInt9911; local38++) {
								local2558 = this.aClass393Array1[local38];
								local2563 = this.aClass365Array1[local38];
								local2563.anInt10800 = local2563.anInt10800 & 0xFF000000 | Static101.anIntArray92[this.aShortArray138[local2558.anInt11381] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method8655();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray52 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (local32 < this.anIntArrayArray52.length) {
							local247 = this.anIntArrayArray52[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2563 = this.aClass365Array1[local247[local249]];
								local2563.anInt10802 += arg2;
								local2563.anInt10805 += arg3;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray52 != null) {
					for (local28 = 0; local28 < local8; local28++) {
						local32 = arg1[local28];
						if (this.anIntArrayArray52.length > local32) {
							local247 = this.anIntArrayArray52[local32];
							for (local249 = 0; local249 < local247.length; local249++) {
								local2563 = this.aClass365Array1[local247[local249]];
								local2563.anInt10799 = arg3 * local2563.anInt10799 >> 7;
								local2563.anInt10807 = arg2 * local2563.anInt10807 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray52 != null) {
				for (local28 = 0; local28 < local8; local28++) {
					local32 = arg1[local28];
					if (this.anIntArrayArray52.length > local32) {
						local247 = this.anIntArrayArray52[local32];
						for (local249 = 0; local249 < local247.length; local249++) {
							local2563 = this.aClass365Array1[local247[local249]];
							local2563.anInt10804 = local2563.anInt10804 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local28 = 0; local28 < local8; local28++) {
				local32 = arg1[local28];
				if (local32 < this.anIntArrayArray54.length) {
					local247 = this.anIntArrayArray54[local32];
					for (local249 = 0; local249 < local247.length; local249++) {
						local50 = local247[local249];
						if (this.aShortArray132 == null || (this.aShortArray132[local50] & arg6) != 0) {
							this.anIntArray495[local50] -= Static457.anInt8214;
							this.anIntArray500[local50] -= Static241.anInt4779;
							this.anIntArray502[local50] -= Static262.anInt5000;
							this.anIntArray495[local50] = this.anIntArray495[local50] * arg2 >> 7;
							this.anIntArray500[local50] = this.anIntArray500[local50] * arg3 >> 7;
							this.anIntArray502[local50] = arg4 * this.anIntArray502[local50] >> 7;
							this.anIntArray495[local50] += Static457.anInt8214;
							this.anIntArray500[local50] += Static241.anInt4779;
							this.anIntArray502[local50] += Static262.anInt5000;
						}
					}
				}
			}
		} else {
			local28 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local249 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static266.aBoolean379) {
				local380 = Static457.anInt8214 * arg7[0] + arg7[3] * Static241.anInt4779 + arg7[6] * Static262.anInt5000 + 8192 >> 14;
				local398 = Static262.anInt5000 * arg7[7] + Static457.anInt8214 * arg7[1] + Static241.anInt4779 * arg7[4] + 8192 >> 14;
				local380 += local249;
				local635 = arg7[5] * Static241.anInt4779 + arg7[2] * Static457.anInt8214 + Static262.anInt5000 * arg7[8] + 8192 >> 14;
				local398 += local50;
				Static241.anInt4779 = local398;
				Static457.anInt8214 = local380;
				local635 += local56;
				Static266.aBoolean379 = false;
				Static262.anInt5000 = local635;
			}
			local380 = arg2 << 15 >> 7;
			local398 = arg3 << 15 >> 7;
			local635 = arg4 << 15 >> 7;
			local644 = local380 * -Static457.anInt8214 + 8192 >> 14;
			local657 = local398 * -Static241.anInt4779 + 8192 >> 14;
			local661 = local635 * -Static262.anInt5000 + 8192 >> 14;
			local679 = Static457.anInt8214 + local644;
			local1000 = local657 + Static241.anInt4779;
			local1008 = local661 + Static262.anInt5000;
			@Pc(1975) int[] local1975 = new int[] { local380 * arg7[0] + 8192 >> 14, local380 * arg7[3] + 8192 >> 14, local380 * arg7[6] + 8192 >> 14, arg7[1] * local398 + 8192 >> 14, local398 * arg7[4] + 8192 >> 14, local398 * arg7[7] + 8192 >> 14, local635 * arg7[2] + 8192 >> 14, arg7[5] * local635 + 8192 >> 14, arg7[8] * local635 + 8192 >> 14 };
			local1163 = local249 * local380 + 8192 >> 14;
			local1188 = local50 * local398 + 8192 >> 14;
			@Pc(2103) int local2103 = local1188 + local1000;
			@Pc(2107) int local2107 = local1163 + local679;
			local1192 = local56 * local635 + 8192 >> 14;
			@Pc(2119) int local2119 = local1192 + local1008;
			@Pc(2122) int[] local2122 = new int[9];
			@Pc(2128) int local2128;
			for (local1202 = 0; local1202 < 3; local1202++) {
				for (local2128 = 0; local2128 < 3; local2128++) {
					local1207 = 0;
					for (local1211 = 0; local1211 < 3; local1211++) {
						local1207 += local1975[local2128 + local1211 * 3] * arg7[local1202 * 3 + local1211];
					}
					local2122[local2128 + local1202 * 3] = local1207 + 8192 >> 14;
				}
			}
			local2128 = local2107 * arg7[0] + local2103 * arg7[1] + local2119 * arg7[2] + 8192 >> 14;
			local1207 = local2103 * arg7[4] + arg7[3] * local2107 + arg7[5] * local2119 + 8192 >> 14;
			local1211 = arg7[8] * local2119 + local2107 * arg7[6] + local2103 * arg7[7] + 8192 >> 14;
			local2128 += local28;
			local1207 += local32;
			local1211 += local38;
			for (local1215 = 0; local1215 < local8; local1215++) {
				local1217 = arg1[local1215];
				if (local1217 < this.anIntArrayArray54.length) {
					local1345 = this.anIntArrayArray54[local1217];
					for (local1347 = 0; local1347 < local1345.length; local1347++) {
						local1351 = local1345[local1347];
						if (this.aShortArray132 == null || (this.aShortArray132[local1351] & arg6) != 0) {
							local1355 = local2122[2] * this.anIntArray502[local1351] + local2122[1] * this.anIntArray500[local1351] + this.anIntArray495[local1351] * local2122[0] + 8192 >> 14;
							local1357 = local2122[4] * this.anIntArray500[local1351] + this.anIntArray495[local1351] * local2122[3] + this.anIntArray502[local1351] * local2122[5] + 8192 >> 14;
							@Pc(2364) int local2364 = local1357 + local1207;
							local1488 = local2122[6] * this.anIntArray495[local1351] + local2122[7] * this.anIntArray500[local1351] + local2122[8] * this.anIntArray502[local1351] + 8192 >> 14;
							@Pc(2401) int local2401 = local1355 + local2128;
							@Pc(2405) int local2405 = local1488 + local1211;
							this.anIntArray495[local1351] = local2401;
							this.anIntArray500[local1351] = local2364;
							this.anIntArray502[local1351] = local2405;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9898; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray500[local15] - local9 * this.anIntArray502[local15] >> 14;
			this.anIntArray502[local15] = local13 * this.anIntArray502[local15] + this.anIntArray500[local15] * local9 >> 14;
			this.anIntArray500[local15] = local34;
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class14 method8622(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(17) Class14_Sub3 local17;
		@Pc(21) Class14_Sub3 local21;
		if (arg0 == 1) {
			local17 = this.aClass101_Sub1_23.aClass14_Sub3_24;
			local21 = this.aClass101_Sub1_23.aClass14_Sub3_25;
		} else if (arg0 == 2) {
			local17 = this.aClass101_Sub1_23.aClass14_Sub3_28;
			local21 = this.aClass101_Sub1_23.aClass14_Sub3_21;
		} else if (arg0 == 3) {
			local21 = this.aClass101_Sub1_23.aClass14_Sub3_23;
			local17 = this.aClass101_Sub1_23.aClass14_Sub3_29;
		} else if (arg0 == 4) {
			local17 = this.aClass101_Sub1_23.aClass14_Sub3_27;
			local21 = this.aClass101_Sub1_23.aClass14_Sub3_26;
		} else if (arg0 == 5) {
			local17 = this.aClass101_Sub1_23.aClass14_Sub3_22;
			local21 = this.aClass101_Sub1_23.aClass14_Sub3_30;
		} else {
			local17 = local21 = new Class14_Sub3(this.aClass101_Sub1_23, 0, 0, true, false);
		}
		return this.method8659(local21, arg0 != 0, local17, arg2, arg1);
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
	private void method8649() {
		if (this.aClass288_1 != null) {
			this.aClass288_1.aBoolean614 = false;
		}
	}

	@OriginalMember(owner = "client!te", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort112;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)Z")
	private boolean method8650() {
		if (this.aClass142_1.aBoolean354) {
			return true;
		}
		if (this.aClass142_1.anInterface24_5 == null) {
			this.aClass142_1.anInterface24_5 = this.aClass101_Sub1_23.method5941(this.aBoolean728);
		}
		@Pc(28) Interface24 local28 = this.aClass142_1.anInterface24_5;
		local28.method9031(this.anInt9926 * 6);
		@Pc(40) Buffer local40 = local28.method6460();
		if (local40 != null) {
			@Pc(48) Stream local48 = this.aClass101_Sub1_23.method5942(local40);
			@Pc(52) int local52;
			if (Stream.c()) {
				for (local52 = 0; local52 < this.anInt9926; local52++) {
					local48.c(this.aShortArray140[local52]);
					local48.c(this.aShortArray137[local52]);
					local48.c(this.aShortArray134[local52]);
				}
			} else {
				for (local52 = 0; local52 < this.anInt9926; local52++) {
					local48.a(this.aShortArray140[local52]);
					local48.a(this.aShortArray137[local52]);
					local48.a(this.aShortArray134[local52]);
				}
			}
			local48.a();
			if (local28.method6459()) {
				this.aClass142_1.aBoolean354 = true;
				this.aBoolean724 = true;
				this.aClass142_1.anInterface24_4 = local28;
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!te", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9907; local3++) {
			if (this.aShortArray138[local3] == arg0) {
				this.aShortArray138[local3] = arg1;
			}
		}
		if (this.aClass393Array1 != null) {
			for (@Pc(38) int local38 = 0; local38 < this.anInt9911; local38++) {
				@Pc(45) Class393 local45 = this.aClass393Array1[local38];
				@Pc(50) Class365 local50 = this.aClass365Array1[local38];
				local50.anInt10800 = local50.anInt10800 & 0xFF000000 | Static101.anIntArray92[this.aShortArray138[local45.anInt11381] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method8655();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method8631(@OriginalArg(0) Class14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class14_Sub3 local8 = (Class14_Sub3) arg0;
		if (this.anInt9907 == 0 || local8.anInt9907 == 0) {
			return;
		}
		@Pc(18) int local18 = local8.anInt9898;
		@Pc(21) int[] local21 = local8.anIntArray495;
		@Pc(24) int[] local24 = local8.anIntArray500;
		@Pc(27) int[] local27 = local8.anIntArray502;
		@Pc(30) short[] local30 = local8.aShortArray142;
		@Pc(33) short[] local33 = local8.aShortArray131;
		@Pc(36) short[] local36 = local8.aShortArray135;
		@Pc(39) byte[] local39 = local8.aByteArray88;
		@Pc(50) short[] local50;
		@Pc(44) short[] local44;
		@Pc(46) short[] local46;
		@Pc(48) byte[] local48;
		if (this.aClass383_1 == null) {
			local44 = null;
			local46 = null;
			local48 = null;
			local50 = null;
		} else {
			local46 = this.aClass383_1.aShortArray166;
			local44 = this.aClass383_1.aShortArray167;
			local48 = this.aClass383_1.aByteArray101;
			local50 = this.aClass383_1.aShortArray165;
		}
		@Pc(87) short[] local87;
		@Pc(79) short[] local79;
		@Pc(83) short[] local83;
		@Pc(75) byte[] local75;
		if (local8.aClass383_1 == null) {
			local83 = null;
			local75 = null;
			local79 = null;
			local87 = null;
		} else {
			local75 = local8.aClass383_1.aByteArray101;
			local79 = local8.aClass383_1.aShortArray167;
			local83 = local8.aClass383_1.aShortArray166;
			local87 = local8.aClass383_1.aShortArray165;
		}
		@Pc(100) int[] local100 = local8.anIntArray501;
		@Pc(103) short[] local103 = local8.aShortArray136;
		if (!local8.aBoolean726) {
			local8.method8660();
		}
		@Pc(112) int local112 = local8.anInt9871;
		@Pc(115) int local115 = local8.anInt9937;
		@Pc(118) int local118 = local8.anInt9925;
		@Pc(121) int local121 = local8.anInt9893;
		@Pc(124) int local124 = local8.anInt9892;
		@Pc(127) int local127 = local8.anInt9866;
		for (@Pc(129) int local129 = 0; local129 < this.anInt9898; local129++) {
			@Pc(139) int local139 = this.anIntArray500[local129] - arg2;
			if (local139 >= local112 && local139 <= local115) {
				@Pc(155) int local155 = this.anIntArray495[local129] - arg1;
				if (local118 <= local155 && local121 >= local155) {
					@Pc(175) int local175 = this.anIntArray502[local129] - arg3;
					if (local175 >= local124 && local175 <= local127) {
						@Pc(189) int local189 = -1;
						@Pc(194) int local194 = this.anIntArray501[local129];
						@Pc(201) int local201 = this.anIntArray501[local129 + 1];
						for (@Pc(203) int local203 = local194; local203 < local201; local203++) {
							local189 = this.aShortArray136[local203] - 1;
							if (local189 == -1 || this.aByteArray88[local189] != 0) {
								break;
							}
						}
						if (local189 != -1) {
							for (@Pc(232) int local232 = 0; local232 < local18; local232++) {
								if (local155 == local21[local232] && local27[local232] == local175 && local139 == local24[local232]) {
									local194 = local100[local232];
									local201 = local100[local232 + 1];
									@Pc(269) int local269 = -1;
									for (@Pc(271) int local271 = local194; local271 < local201; local271++) {
										local269 = local103[local271] - 1;
										if (local269 == -1 || local39[local269] != 0) {
											break;
										}
									}
									if (local269 != -1) {
										if (local50 == null) {
											this.aClass383_1 = new Class383();
											local50 = this.aClass383_1.aShortArray165 = Static102.method1767(this.aShortArray142);
											local44 = this.aClass383_1.aShortArray167 = Static102.method1767(this.aShortArray131);
											local46 = this.aClass383_1.aShortArray166 = Static102.method1767(this.aShortArray135);
											local48 = this.aClass383_1.aByteArray101 = Static491.method7784(this.aByteArray88);
										}
										if (local87 == null) {
											@Pc(347) Class383 local347 = local8.aClass383_1 = new Class383();
											local87 = local347.aShortArray165 = Static102.method1767(local30);
											local79 = local347.aShortArray167 = Static102.method1767(local33);
											local83 = local347.aShortArray166 = Static102.method1767(local36);
											local75 = local347.aByteArray101 = Static491.method7784(local39);
										}
										@Pc(380) short local380 = this.aShortArray142[local189];
										@Pc(385) short local385 = this.aShortArray131[local189];
										@Pc(390) short local390 = this.aShortArray135[local189];
										@Pc(395) byte local395 = this.aByteArray88[local189];
										local194 = local100[local232];
										local201 = local100[local232 + 1];
										@Pc(415) int local415;
										for (@Pc(407) int local407 = local194; local407 < local201; local407++) {
											local415 = local103[local407] - 1;
											if (local415 == -1) {
												break;
											}
											if (local75[local415] != 0) {
												local87[local415] += local380;
												local79[local415] += local385;
												local83[local415] += local390;
												local75[local415] += local395;
											}
										}
										local380 = local30[local269];
										local194 = this.anIntArray501[local129];
										local201 = this.anIntArray501[local129 + 1];
										local395 = local39[local269];
										local390 = local36[local269];
										local385 = local33[local269];
										for (local415 = local194; local415 < local201; local415++) {
											@Pc(501) int local501 = this.aShortArray136[local415] - 1;
											if (local501 == -1) {
												break;
											}
											if (local48[local501] != 0) {
												local50[local501] += local380;
												local44[local501] += local385;
												local46[local501] += local390;
												local48[local501] += local395;
											}
										}
										local8.method8656();
										this.method8656();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BLclient!sb;)V")
	private void method8652(@OriginalArg(1) Class2_Sub1_Sub11_Sub2 arg0) {
		if (Static581.anIntArray514.length < this.anInt9931) {
			Static581.anIntArray514 = new int[this.anInt9931];
			Static658.anIntArray591 = new int[this.anInt9931];
		}
		@Pc(51) int local51;
		@Pc(90) int local90;
		@Pc(99) int local99;
		for (@Pc(24) int local24 = 0; local24 < this.anInt9898; local24++) {
			local51 = (this.anIntArray495[local24] - (this.aClass101_Sub1_23.anInt6616 * this.anIntArray500[local24] >> 8) >> this.aClass101_Sub1_23.anInt6632) - arg0.anInt9362;
			@Pc(76) int local76 = (this.anIntArray502[local24] - (this.aClass101_Sub1_23.anInt6626 * this.anIntArray500[local24] >> 8) >> this.aClass101_Sub1_23.anInt6632) - arg0.anInt9352;
			@Pc(81) int local81 = this.anIntArray501[local24];
			@Pc(88) int local88 = this.anIntArray501[local24 + 1];
			for (local90 = local81; local90 < local88; local90++) {
				local99 = this.aShortArray136[local90] - 1;
				if (local99 == -1) {
					break;
				}
				Static581.anIntArray514[local99] = local51;
				Static658.anIntArray591[local99] = local76;
			}
		}
		for (local51 = 0; local51 < this.anInt9926; local51++) {
			if (this.aByteArray89 == null || this.aByteArray89[local51] <= 128) {
				@Pc(156) short local156 = this.aShortArray140[local51];
				@Pc(161) short local161 = this.aShortArray137[local51];
				@Pc(166) short local166 = this.aShortArray134[local51];
				local90 = Static581.anIntArray514[local156];
				local99 = Static581.anIntArray514[local161];
				@Pc(178) int local178 = Static581.anIntArray514[local166];
				@Pc(182) int local182 = Static658.anIntArray591[local156];
				@Pc(186) int local186 = Static658.anIntArray591[local161];
				@Pc(190) int local190 = Static658.anIntArray591[local166];
				if ((local90 - local99) * (-local190 + local186) - (local178 - local99) * (-local182 + local186) > 0) {
					arg0.method8247(local182, local178, local99, local190, local90, local186);
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	private void method8653() {
		if (!this.aBoolean724) {
			return;
		}
		this.aBoolean724 = false;
		if (this.aClass283Array5 == null && this.aClass123Array5 == null && this.aClass393Array1 == null) {
			if (this.anIntArray495 != null && !Static600.method9007(this.lb, this.anInt9910)) {
				if (this.aClass288_1 == null || this.aClass288_1.method7498()) {
					if (!this.aBoolean726) {
						this.method8660();
					}
					this.anIntArray495 = null;
				} else {
					this.aBoolean724 = true;
				}
			}
			if (this.anIntArray500 != null && !Static484.method7672(this.anInt9910, this.lb)) {
				if (this.aClass288_1 == null || this.aClass288_1.method7498()) {
					if (!this.aBoolean726) {
						this.method8660();
					}
					this.anIntArray500 = null;
				} else {
					this.aBoolean724 = true;
				}
			}
			if (this.anIntArray502 != null && !Static32.method534(this.lb, this.anInt9910)) {
				if (this.aClass288_1 == null || this.aClass288_1.method7498()) {
					if (!this.aBoolean726) {
						this.method8660();
					}
					this.anIntArray502 = null;
				} else {
					this.aBoolean724 = true;
				}
			}
		}
		if (this.aShortArray136 != null && this.anIntArray495 == null && this.anIntArray500 == null && this.anIntArray502 == null) {
			this.anIntArray501 = null;
			this.aShortArray136 = null;
		}
		if (this.aByteArray88 != null && !Static222.method4086(this.lb, this.anInt9910)) {
			label197: {
				label196: {
					@Pc(159) boolean local159;
					if ((this.anInt9910 & 0x37) == 0) {
						if (this.aClass288_2 == null || this.aClass288_2.method7498()) {
							break label196;
						}
						local159 = false;
					} else {
						if (this.aClass288_3 == null || this.aClass288_3.method7498()) {
							break label196;
						}
						local159 = false;
					}
					if (!local159) {
						this.aBoolean724 = true;
						break label197;
					}
				}
				this.aShortArray142 = this.aShortArray131 = this.aShortArray135 = null;
				this.aByteArray88 = null;
			}
		}
		if (this.aShortArray138 != null && !Static280.method4709(this.anInt9910, this.lb)) {
			if (this.aClass288_2 == null || this.aClass288_2.method7498()) {
				this.aShortArray138 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.aByteArray89 != null && !Static581.method8768(this.lb, this.anInt9910)) {
			if (this.aClass288_2 == null || this.aClass288_2.method7498()) {
				this.aByteArray89 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.aFloatArray70 != null && !Static441.method7161(this.lb, this.anInt9910)) {
			if (this.aClass288_4 == null || this.aClass288_4.method7498()) {
				this.aFloatArray70 = this.aFloatArray71 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.aShortArray141 != null && !Static218.method4048(this.anInt9910, this.lb)) {
			if (this.aClass288_2 == null || this.aClass288_2.method7498()) {
				this.aShortArray141 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.aShortArray140 != null && !Static222.method4088(this.anInt9910, this.lb)) {
			if ((this.aClass142_1 == null || this.aClass142_1.method4084()) && (this.aClass288_2 == null || this.aClass288_2.method7498())) {
				this.aShortArray140 = this.aShortArray137 = this.aShortArray134 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.aShortArray133 != null) {
			if (this.aClass288_1 == null || this.aClass288_1.method7498()) {
				this.aShortArray133 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.aShortArray130 != null) {
			if (this.aClass288_2 == null || this.aClass288_2.method7498()) {
				this.aShortArray130 = null;
			} else {
				this.aBoolean724 = true;
			}
		}
		if (this.anIntArrayArray53 != null && !Static354.method6090(this.lb, this.anInt9910)) {
			this.aShortArray139 = null;
			this.anIntArrayArray53 = null;
		}
		if (this.anIntArrayArray54 != null && !Static662.method8954(this.anInt9910, this.lb)) {
			this.aShortArray132 = null;
			this.anIntArrayArray54 = null;
		}
		if (this.anIntArrayArray52 != null && !Static266.method4572(this.lb, this.anInt9910)) {
			this.anIntArrayArray52 = null;
		}
		if (this.anIntArray499 != null && (this.lb & 0x800) == 0 && (this.lb & 0x40000) == 0) {
			this.anIntArray496 = null;
			this.anIntArray499 = null;
			this.anIntArray498 = null;
		}
	}

	@OriginalMember(owner = "client!te", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray54 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt9917; local12++) {
			this.anIntArray495[local12] <<= 0x4;
			this.anIntArray500[local12] <<= 0x4;
			this.anIntArray502[local12] <<= 0x4;
		}
		Static457.anInt8214 = 0;
		Static241.anInt4779 = 0;
		Static262.anInt5000 = 0;
		return true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!dm;IZ)V")
	@Override
	public void method8621(@OriginalArg(0) Class76 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray132 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt9898; local14++) {
			if ((this.aShortArray132[local14] & arg1) != 0) {
				if (arg2) {
					arg0.method9644(this.anIntArray495[local14], this.anIntArray500[local14], this.anIntArray502[local14], local12);
				} else {
					arg0.method9642(this.anIntArray495[local14], this.anIntArray500[local14], this.anIntArray502[local14], local12);
				}
				this.anIntArray495[local14] = local12[0];
				this.anIntArray500[local14] = local12[1];
				this.anIntArray502[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	private void method8655() {
		if (this.aClass288_2 != null) {
			this.aClass288_2.aBoolean614 = false;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "()V")
	@Override
	protected void method8618() {
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!dm;ZII)Z")
	@Override
	public boolean method8625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method8663(arg0, arg1, arg4, arg5, arg3, arg2);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9898; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray495[local15] + local9 * this.anIntArray502[local15] >> 14;
			this.anIntArray502[local15] = this.anIntArray502[local15] * local13 - local9 * this.anIntArray495[local15] >> 14;
			this.anIntArray495[local15] = local33;
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V")
	private void method8656() {
		if ((this.anInt9910 & 0x37) == 0) {
			if (this.aClass288_2 != null) {
				this.aClass288_2.aBoolean614 = false;
			}
		} else if (this.aClass288_3 != null) {
			this.aClass288_3.aBoolean614 = false;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(B)V")
	public void method8657() {
		if (this.aClass288_1 != null) {
			this.aClass288_1.method7499();
		}
		if (this.aClass288_4 != null) {
			this.aClass288_4.method7499();
		}
		if (this.aClass288_2 != null) {
			this.aClass288_2.method7499();
		}
		if (this.aClass288_3 != null) {
			this.aClass288_3.method7499();
		}
		if (this.aClass142_1 != null) {
			this.aClass142_1.method4085();
		}
	}

	@OriginalMember(owner = "client!te", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt9898; local15++) {
			@Pc(33) int local33 = this.anIntArray495[local15] * local13 + this.anIntArray500[local15] * local9 >> 14;
			this.anIntArray500[local15] = local13 * this.anIntArray500[local15] - local9 * this.anIntArray495[local15] >> 14;
			this.anIntArray495[local15] = local33;
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(B)V")
	private void method8658() {
		if (this.aClass393Array1 == null) {
			return;
		}
		this.aClass101_Sub1_23.C(!this.aBoolean727);
		this.aClass101_Sub1_23.method5836(false);
		this.aClass101_Sub1_23.method5954(1, Static660.aClass118_5);
		this.aClass101_Sub1_23.method5890(1, Static660.aClass118_5);
		for (@Pc(40) int local40 = 0; local40 < this.anInt9911; local40++) {
			@Pc(47) Class393 local47 = this.aClass393Array1[local40];
			@Pc(52) Class365 local52 = this.aClass365Array1[local40];
			if (!local47.aBoolean804 || !this.aClass101_Sub1_23.method8101()) {
				@Pc(81) float local81 = (float) (this.anIntArray495[local47.anInt11384] + this.anIntArray495[local47.anInt11383] + this.anIntArray495[local47.anInt11385]) * 0.3333333F;
				@Pc(103) float local103 = (float) (this.anIntArray500[local47.anInt11384] + this.anIntArray500[local47.anInt11383] + this.anIntArray500[local47.anInt11385]) * 0.3333333F;
				@Pc(125) float local125 = (float) (this.anIntArray502[local47.anInt11385] + this.anIntArray502[local47.anInt11383] + this.anIntArray502[local47.anInt11384]) * 0.3333333F;
				@Pc(139) float local139 = Static167.aFloat76 * local125 + local81 * Static73.aFloat13 + Static135.aFloat40 * local103 + Static256.aFloat192;
				@Pc(153) float local153 = Static232.aFloat201 + local125 * Static201.aFloat84 + Static318.aFloat116 * local103 + Static180.aFloat79 * local81;
				@Pc(167) float local167 = Static295.aFloat110 * local103 + Static342.aFloat143 * local81 + Static295.aFloat109 * local125 + Static105.aFloat30;
				@Pc(188) float local188 = (float) (1.0D / Math.sqrt((double) (local167 * local167 + local139 * local139 + local153 * local153))) * (float) local47.anInt11382;
				@Pc(193) Class76_Sub2 local193 = this.aClass101_Sub1_23.method5829();
				local193.method7342(local153 + (float) local52.anInt10805 - local153 * local188, -(local167 * local188) + local167, local139 + (float) local52.anInt10802 - local139 * local188, local47.aShort130 * local52.anInt10807 >> 7, local52.anInt10804, local52.anInt10799 * local47.aShort128 >> 7);
				local193.method7328(this.aClass101_Sub1_23.aClass76_Sub2_17);
				this.aClass101_Sub1_23.method5944();
				@Pc(251) int local251 = local52.anInt10800;
				this.aClass101_Sub1_23.method5873(local47.aShort129, false, false);
				this.aClass101_Sub1_23.method5963(local47.aByte150);
				this.aClass101_Sub1_23.method5933(local251);
				this.aClass101_Sub1_23.method5918();
			}
		}
		this.aClass101_Sub1_23.method5890(1, Static175.aClass118_2);
		this.aClass101_Sub1_23.method5954(1, Static175.aClass118_2);
		this.aClass101_Sub1_23.C(true);
	}

	@OriginalMember(owner = "client!te", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9898; local3++) {
			if (arg0 != 128) {
				this.anIntArray495[local3] = this.anIntArray495[local3] * arg0 >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray500[local3] = this.anIntArray500[local3] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray502[local3] = arg2 * this.anIntArray502[local3] >> 7;
			}
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "b", descriptor = "()V")
	@Override
	public void method8620() {
		if (this.anInt9931 > 0 && this.anInt9926 > 0) {
			this.method8661();
			this.method8650();
			this.method8653();
		}
	}

	@OriginalMember(owner = "client!te", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9892;
	}

	@OriginalMember(owner = "client!te", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort112 = (short) arg0;
		this.method8649();
		this.method8656();
	}

	@OriginalMember(owner = "client!te", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort111;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!te;ZLclient!te;ZZI)Lclient!ka;")
	private Class14 method8659(@OriginalArg(0) Class14_Sub3 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class14_Sub3 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) int arg4) {
		arg2.anInt9907 = this.anInt9907;
		arg2.anInt9910 = this.anInt9910;
		arg2.anInt9917 = this.anInt9917;
		if ((arg4 & 0x100) == 0) {
			arg2.aBoolean727 = this.aBoolean727;
		} else {
			arg2.aBoolean727 = true;
		}
		arg2.aShort112 = this.aShort112;
		arg2.aBoolean725 = this.aBoolean725;
		arg2.aShort111 = this.aShort111;
		arg2.anInt9926 = this.anInt9926;
		arg2.anInt9898 = this.anInt9898;
		arg2.anInt9911 = this.anInt9911;
		arg2.anInt9931 = this.anInt9931;
		arg2.lb = arg4;
		@Pc(70) boolean local70 = Static350.method6055(this.anInt9910, arg4);
		@Pc(76) boolean local76 = Static89.method1569(this.anInt9910, arg4);
		@Pc(82) boolean local82 = Static194.method3765(arg4, this.anInt9910);
		@Pc(88) boolean local88 = local82 | local70 | local76;
		@Pc(189) int local189;
		if (local88) {
			if (!local70) {
				arg2.anIntArray495 = this.anIntArray495;
			} else if (arg0.anIntArray495 == null || this.anInt9917 > arg0.anIntArray495.length) {
				arg2.anIntArray495 = arg0.anIntArray495 = new int[this.anInt9917];
			} else {
				arg2.anIntArray495 = arg0.anIntArray495;
			}
			if (!local76) {
				arg2.anIntArray500 = this.anIntArray500;
			} else if (arg0.anIntArray500 == null || this.anInt9917 > arg0.anIntArray500.length) {
				arg2.anIntArray500 = arg0.anIntArray500 = new int[this.anInt9917];
			} else {
				arg2.anIntArray500 = arg0.anIntArray500;
			}
			if (!local82) {
				arg2.anIntArray502 = this.anIntArray502;
			} else if (arg0.anIntArray502 == null || this.anInt9917 > arg0.anIntArray502.length) {
				arg2.anIntArray502 = arg0.anIntArray502 = new int[this.anInt9917];
			} else {
				arg2.anIntArray502 = arg0.anIntArray502;
			}
			for (local189 = 0; local189 < this.anInt9917; local189++) {
				if (local70) {
					arg2.anIntArray495[local189] = this.anIntArray495[local189];
				}
				if (local76) {
					arg2.anIntArray500[local189] = this.anIntArray500[local189];
				}
				if (local82) {
					arg2.anIntArray502[local189] = this.anIntArray502[local189];
				}
			}
		} else {
			arg2.anIntArray502 = this.anIntArray502;
			arg2.anIntArray500 = this.anIntArray500;
			arg2.anIntArray495 = this.anIntArray495;
		}
		if (Static318.method5254(arg4, this.anInt9910)) {
			arg2.aClass288_1 = arg0.aClass288_1;
			arg2.aClass288_1.anInterface25_16 = this.aClass288_1.anInterface25_16;
			arg2.aClass288_1.aBoolean613 = true;
			arg2.aClass288_1.aBoolean614 = this.aClass288_1.aBoolean614;
		} else if (Static59.method1119(arg4, this.anInt9910)) {
			arg2.aClass288_1 = this.aClass288_1;
		} else {
			arg2.aClass288_1 = null;
		}
		if (Static144.method2525(this.anInt9910, arg4)) {
			if (arg0.aShortArray138 == null || this.anInt9907 > arg0.aShortArray138.length) {
				arg2.aShortArray138 = arg0.aShortArray138 = new short[this.anInt9907];
			} else {
				arg2.aShortArray138 = arg0.aShortArray138;
			}
			for (local189 = 0; local189 < this.anInt9907; local189++) {
				arg2.aShortArray138[local189] = this.aShortArray138[local189];
			}
		} else {
			arg2.aShortArray138 = this.aShortArray138;
		}
		if (Static84.method1423(this.anInt9910, arg4)) {
			if (arg0.aByteArray89 == null || this.anInt9907 > arg0.aByteArray89.length) {
				arg2.aByteArray89 = arg0.aByteArray89 = new byte[this.anInt9907];
			} else {
				arg2.aByteArray89 = arg0.aByteArray89;
			}
			for (local189 = 0; local189 < this.anInt9907; local189++) {
				arg2.aByteArray89[local189] = this.aByteArray89[local189];
			}
		} else {
			arg2.aByteArray89 = this.aByteArray89;
		}
		if (Static39.method9318(this.anInt9910, arg4)) {
			arg2.aClass288_2 = arg0.aClass288_2;
			arg2.aClass288_2.aBoolean614 = this.aClass288_2.aBoolean614;
			arg2.aClass288_2.aBoolean613 = true;
			arg2.aClass288_2.anInterface25_16 = this.aClass288_2.anInterface25_16;
		} else if (Static388.method6540(this.anInt9910, arg4)) {
			arg2.aClass288_2 = this.aClass288_2;
		} else {
			arg2.aClass288_2 = null;
		}
		@Pc(512) int local512;
		if (Static340.method5708(arg4, this.anInt9910)) {
			if (arg0.aShortArray142 == null || arg0.aShortArray142.length < this.anInt9931) {
				local189 = this.anInt9931;
				arg2.aShortArray135 = arg0.aShortArray135 = new short[local189];
				arg2.aShortArray142 = arg0.aShortArray142 = new short[local189];
				arg2.aShortArray131 = arg0.aShortArray131 = new short[local189];
			} else {
				arg2.aShortArray135 = arg0.aShortArray135;
				arg2.aShortArray131 = arg0.aShortArray131;
				arg2.aShortArray142 = arg0.aShortArray142;
			}
			if (this.aClass383_1 == null) {
				arg2.aClass383_1 = null;
				for (local189 = 0; local189 < this.anInt9931; local189++) {
					arg2.aShortArray142[local189] = this.aShortArray142[local189];
					arg2.aShortArray131[local189] = this.aShortArray131[local189];
					arg2.aShortArray135[local189] = this.aShortArray135[local189];
				}
			} else {
				if (arg0.aClass383_1 == null) {
					arg0.aClass383_1 = new Class383();
				}
				@Pc(500) Class383 local500 = arg2.aClass383_1 = arg0.aClass383_1;
				if (local500.aShortArray165 == null || local500.aShortArray165.length < this.anInt9931) {
					local512 = this.anInt9931;
					local500.aShortArray165 = new short[local512];
					local500.aShortArray167 = new short[local512];
					local500.aShortArray166 = new short[local512];
					local500.aByteArray101 = new byte[local512];
				}
				for (local512 = 0; local512 < this.anInt9931; local512++) {
					arg2.aShortArray142[local512] = this.aShortArray142[local512];
					arg2.aShortArray131[local512] = this.aShortArray131[local512];
					arg2.aShortArray135[local512] = this.aShortArray135[local512];
					local500.aShortArray165[local512] = this.aClass383_1.aShortArray165[local512];
					local500.aShortArray167[local512] = this.aClass383_1.aShortArray167[local512];
					local500.aShortArray166[local512] = this.aClass383_1.aShortArray166[local512];
					local500.aByteArray101[local512] = this.aClass383_1.aByteArray101[local512];
				}
			}
			arg2.aByteArray88 = this.aByteArray88;
		} else {
			arg2.aClass383_1 = this.aClass383_1;
			arg2.aShortArray142 = this.aShortArray142;
			arg2.aShortArray131 = this.aShortArray131;
			arg2.aShortArray135 = this.aShortArray135;
			arg2.aByteArray88 = this.aByteArray88;
		}
		if (Static293.method6715(this.anInt9910, arg4)) {
			arg2.aClass288_3 = arg0.aClass288_3;
			arg2.aClass288_3.aBoolean613 = true;
			arg2.aClass288_3.aBoolean614 = this.aClass288_3.aBoolean614;
			arg2.aClass288_3.anInterface25_16 = this.aClass288_3.anInterface25_16;
		} else if (Static390.method6562(arg4, this.anInt9910)) {
			arg2.aClass288_3 = this.aClass288_3;
		} else {
			arg2.aClass288_3 = null;
		}
		if (Static530.method8539(this.anInt9910, arg4)) {
			if (arg0.aFloatArray70 == null || this.anInt9907 > arg0.aFloatArray70.length) {
				local189 = this.anInt9931;
				arg2.aFloatArray71 = arg0.aFloatArray71 = new float[local189];
				arg2.aFloatArray70 = arg0.aFloatArray70 = new float[local189];
			} else {
				arg2.aFloatArray71 = arg0.aFloatArray71;
				arg2.aFloatArray70 = arg0.aFloatArray70;
			}
			for (local189 = 0; local189 < this.anInt9931; local189++) {
				arg2.aFloatArray70[local189] = this.aFloatArray70[local189];
				arg2.aFloatArray71[local189] = this.aFloatArray71[local189];
			}
		} else {
			arg2.aFloatArray71 = this.aFloatArray71;
			arg2.aFloatArray70 = this.aFloatArray70;
		}
		if (Static256.method9212(this.anInt9910, arg4)) {
			arg2.aClass288_4 = arg0.aClass288_4;
			arg2.aClass288_4.aBoolean614 = this.aClass288_4.aBoolean614;
			arg2.aClass288_4.aBoolean613 = true;
			arg2.aClass288_4.anInterface25_16 = this.aClass288_4.anInterface25_16;
		} else if (Static175.method3430(arg4, this.anInt9910)) {
			arg2.aClass288_4 = this.aClass288_4;
		} else {
			arg2.aClass288_4 = null;
		}
		if (Static29.method500(arg4, this.anInt9910)) {
			if (arg0.aShortArray140 == null || arg0.aShortArray140.length < this.anInt9907) {
				local189 = this.anInt9907;
				arg2.aShortArray137 = arg0.aShortArray137 = new short[local189];
				arg2.aShortArray134 = arg0.aShortArray134 = new short[local189];
				arg2.aShortArray140 = arg0.aShortArray140 = new short[local189];
			} else {
				arg2.aShortArray140 = arg0.aShortArray140;
				arg2.aShortArray137 = arg0.aShortArray137;
				arg2.aShortArray134 = arg0.aShortArray134;
			}
			for (local189 = 0; local189 < this.anInt9907; local189++) {
				arg2.aShortArray140[local189] = this.aShortArray140[local189];
				arg2.aShortArray137[local189] = this.aShortArray137[local189];
				arg2.aShortArray134[local189] = this.aShortArray134[local189];
			}
		} else {
			arg2.aShortArray140 = this.aShortArray140;
			arg2.aShortArray137 = this.aShortArray137;
			arg2.aShortArray134 = this.aShortArray134;
		}
		if (Static189.method3618(arg4, this.anInt9910)) {
			arg2.aClass142_1 = arg0.aClass142_1;
			arg2.aClass142_1.aBoolean354 = this.aClass142_1.aBoolean354;
			arg2.aClass142_1.anInterface24_4 = this.aClass142_1.anInterface24_4;
			arg2.aClass142_1.aBoolean355 = true;
		} else if (Static461.method7372(this.anInt9910, arg4)) {
			arg2.aClass142_1 = this.aClass142_1;
		} else {
			arg2.aClass142_1 = null;
		}
		if (Static267.method9821(this.anInt9910, arg4)) {
			if (arg0.aShortArray141 == null || arg0.aShortArray141.length < this.anInt9907) {
				local189 = this.anInt9907;
				arg2.aShortArray141 = arg0.aShortArray141 = new short[local189];
			} else {
				arg2.aShortArray141 = arg0.aShortArray141;
			}
			for (local189 = 0; local189 < this.anInt9907; local189++) {
				arg2.aShortArray141[local189] = this.aShortArray141[local189];
			}
		} else {
			arg2.aShortArray141 = this.aShortArray141;
		}
		if (!Static415.method2395(arg4, this.anInt9910)) {
			arg2.aClass365Array1 = this.aClass365Array1;
		} else if (arg0.aClass365Array1 == null || arg0.aClass365Array1.length < this.anInt9911) {
			local189 = this.anInt9911;
			arg2.aClass365Array1 = arg0.aClass365Array1 = new Class365[local189];
			for (local512 = 0; local512 < this.anInt9911; local512++) {
				arg2.aClass365Array1[local512] = this.aClass365Array1[local512].method9237();
			}
		} else {
			arg2.aClass365Array1 = arg0.aClass365Array1;
			for (local189 = 0; local189 < this.anInt9911; local189++) {
				arg2.aClass365Array1[local189].method9239(this.aClass365Array1[local189]);
			}
		}
		arg2.anIntArray496 = this.anIntArray496;
		arg2.aClass283Array5 = this.aClass283Array5;
		arg2.anIntArrayArray53 = this.anIntArrayArray53;
		arg2.aShortArray136 = this.aShortArray136;
		arg2.anIntArrayArray54 = this.anIntArrayArray54;
		arg2.aShortArray130 = this.aShortArray130;
		arg2.anIntArrayArray52 = this.anIntArrayArray52;
		arg2.aShortArray139 = this.aShortArray139;
		arg2.anIntArray501 = this.anIntArray501;
		arg2.anIntArray499 = this.anIntArray499;
		arg2.anIntArray498 = this.anIntArray498;
		arg2.aShortArray133 = this.aShortArray133;
		arg2.aClass393Array1 = this.aClass393Array1;
		if (this.aBoolean726) {
			arg2.anInt9871 = this.anInt9871;
			arg2.anInt9922 = this.anInt9922;
			arg2.anInt9885 = this.anInt9885;
			arg2.anInt9925 = this.anInt9925;
			arg2.anInt9892 = this.anInt9892;
			arg2.anInt9937 = this.anInt9937;
			arg2.anInt9866 = this.anInt9866;
			arg2.aBoolean726 = true;
			arg2.anInt9893 = this.anInt9893;
		} else {
			arg2.aBoolean726 = false;
		}
		arg2.aClass123Array5 = this.aClass123Array5;
		arg2.aShortArray132 = this.aShortArray132;
		return arg2;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "()V")
	@Override
	protected void method8639() {
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
	private void method8660() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(29) int local29 = 0; local29 < this.anInt9898; local29++) {
			@Pc(36) int local36 = this.anIntArray495[local29];
			@Pc(41) int local41 = this.anIntArray500[local29];
			if (local7 > local36) {
				local7 = local36;
			}
			if (local41 > local15) {
				local15 = local41;
			}
			if (local41 < local9) {
				local9 = local41;
			}
			if (local36 > local13) {
				local13 = local36;
			}
			@Pc(74) int local74 = this.anIntArray502[local29];
			if (local74 > local17) {
				local17 = local74;
			}
			if (local74 < local11) {
				local11 = local74;
			}
			@Pc(96) int local96 = local74 * local74 + local36 * local36;
			if (local96 > local19) {
				local19 = local96;
			}
			local96 = local41 * local41 + local36 * local36 + local74 * local74;
			if (local96 > local21) {
				local21 = local96;
			}
		}
		this.anInt9892 = local11;
		this.anInt9925 = local7;
		this.anInt9893 = local13;
		this.anInt9937 = local15;
		this.anInt9866 = local17;
		this.anInt9871 = local9;
		this.anInt9922 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt9885 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean726 = true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!dm;ZI)Z")
	@Override
	public boolean method8624(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class76 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method8663(arg0, arg1, arg4, -1, arg3, arg2);
	}

	@OriginalMember(owner = "client!te", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9917; local3++) {
			this.anIntArray495[local3] = this.anIntArray495[local3] + 7 >> 4;
			this.anIntArray500[local3] = this.anIntArray500[local3] + 7 >> 4;
			this.anIntArray502[local3] = this.anIntArray502[local3] + 7 >> 4;
		}
		this.method8649();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "h", descriptor = "(I)Z")
	private boolean method8661() {
		@Pc(13) boolean local13 = !this.aClass288_2.aBoolean614;
		@Pc(26) boolean local26 = (this.anInt9910 & 0x37) != 0 && !this.aClass288_3.aBoolean614;
		@Pc(34) boolean local34 = !this.aClass288_1.aBoolean614;
		@Pc(42) boolean local42 = !this.aClass288_4.aBoolean614;
		if (!local34 && !local13 && !local26 && !local42) {
			return true;
		}
		@Pc(66) boolean local66 = true;
		@Pc(85) Interface25 local85;
		@Pc(99) Buffer local99;
		if (local34) {
			if (this.aClass288_1.anInterface25_15 == null) {
				this.aClass288_1.anInterface25_15 = this.aClass101_Sub1_23.method5856(this.aBoolean728);
			}
			local85 = this.aClass288_1.anInterface25_15;
			local85.method9040(this.anInt9931 * 12, 12);
			local99 = local85.method9043();
			if (local99 == null) {
				local66 = false;
			} else {
				this.aClass101_Sub1_23.aNativeInterface3.copyPositions(this.anIntArray495, this.anIntArray500, this.anIntArray502, this.aShortArray133, 0, 12, this.anInt9931, local99.getAddress());
				if (local85.method9041()) {
					this.aClass288_1.anInterface25_16 = local85;
					this.aClass288_1.aBoolean614 = true;
				} else {
					local66 = false;
				}
			}
		}
		@Pc(212) short[] local212;
		@Pc(220) short[] local220;
		@Pc(224) short[] local224;
		@Pc(216) byte[] local216;
		if (local13) {
			if (this.aClass288_2.anInterface25_15 == null) {
				this.aClass288_2.anInterface25_15 = this.aClass101_Sub1_23.method5856(this.aBoolean728);
			}
			local85 = this.aClass288_2.anInterface25_15;
			local85.method9040(this.anInt9931 * 4, 4);
			local99 = local85.method9043();
			if (local99 == null) {
				local66 = false;
			} else {
				if ((this.anInt9910 & 0x37) == 0) {
					if (this.aClass383_1 == null) {
						local216 = this.aByteArray88;
						local212 = this.aShortArray142;
						local220 = this.aShortArray131;
						local224 = this.aShortArray135;
					} else {
						local212 = this.aClass383_1.aShortArray165;
						local216 = this.aClass383_1.aByteArray101;
						local220 = this.aClass383_1.aShortArray167;
						local224 = this.aClass383_1.aShortArray166;
					}
					this.aClass101_Sub1_23.aNativeInterface3.copyLighting(this.aShortArray138, this.aByteArray89, this.aShortArray141, local212, local220, local224, local216, this.aShort111, this.aShort112, this.aShortArray130, 0, 4, this.anInt9931, local99.getAddress());
				} else {
					this.aClass101_Sub1_23.aNativeInterface3.copyColours(this.aShortArray138, this.aByteArray89, this.aShortArray141, this.aShort111, this.aShortArray130, 0, 4, this.anInt9931, local99.getAddress());
				}
				if (local85.method9041()) {
					this.aClass288_2.aBoolean614 = true;
					this.aClass288_2.anInterface25_16 = local85;
				} else {
					local66 = false;
				}
			}
		}
		if (local26) {
			if (this.aClass288_3.anInterface25_15 == null) {
				this.aClass288_3.anInterface25_15 = this.aClass101_Sub1_23.method5856(this.aBoolean728);
			}
			local85 = this.aClass288_3.anInterface25_15;
			local85.method9040(this.anInt9931 * 12, 12);
			local99 = local85.method9043();
			if (local99 == null) {
				local66 = false;
			} else {
				if (this.aClass383_1 == null) {
					local216 = this.aByteArray88;
					local224 = this.aShortArray135;
					local220 = this.aShortArray131;
					local212 = this.aShortArray142;
				} else {
					local212 = this.aClass383_1.aShortArray165;
					local220 = this.aClass383_1.aShortArray167;
					local216 = this.aClass383_1.aByteArray101;
					local224 = this.aClass383_1.aShortArray166;
				}
				this.aClass101_Sub1_23.aNativeInterface3.copyNormals(local212, local220, local224, local216, 3.0F / (float) this.aShort112, 3.0F / (float) (this.aShort112 + this.aShort112 / 2), 0, 12, this.anInt9931, local99.getAddress());
				if (local85.method9041()) {
					this.aClass288_3.aBoolean614 = true;
					this.aClass288_3.anInterface25_16 = local85;
				} else {
					local66 = false;
				}
			}
		}
		if (local42) {
			if (this.aClass288_4.anInterface25_15 == null) {
				this.aClass288_4.anInterface25_15 = this.aClass101_Sub1_23.method5856(this.aBoolean728);
			}
			local85 = this.aClass288_4.anInterface25_15;
			local85.method9040(this.anInt9931 * 8, 8);
			local99 = local85.method9043();
			if (local99 == null) {
				local66 = false;
			} else {
				this.aClass101_Sub1_23.aNativeInterface3.copyTexCoords(this.aFloatArray70, this.aFloatArray71, 0, 8, this.anInt9931, local99.getAddress());
				if (local85.method9041()) {
					this.aClass288_4.aBoolean614 = true;
					this.aClass288_4.anInterface25_16 = local85;
				} else {
					local66 = false;
				}
			}
		}
		return local66;
	}

	@OriginalMember(owner = "client!te", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9898; local3++) {
			this.anIntArray502[local3] = -this.anIntArray502[local3];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt9931; local29++) {
			this.aShortArray135[local29] = (short) -this.aShortArray135[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt9907; local48++) {
			@Pc(55) short local55 = this.aShortArray140[local48];
			this.aShortArray140[local48] = this.aShortArray134[local48];
			this.aShortArray134[local48] = local55;
		}
		this.method8649();
		this.method8656();
		this.method8646();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(B)V")
	private void method8662() {
		if (this.anInt9926 == 0) {
			return;
		}
		if (this.method8661() && this.method8650()) {
			this.aClass101_Sub1_23.method5953(0, this.aClass288_1.anInterface25_16);
			this.aClass101_Sub1_23.method5953(1, this.aClass288_2.anInterface25_16);
			this.aClass101_Sub1_23.method5953(2, this.aClass288_4.anInterface25_16);
			@Pc(63) boolean local63;
			if ((this.anInt9910 & 0x37) == 0) {
				this.aClass101_Sub1_23.method5836(false);
				local63 = false;
				this.aClass101_Sub1_23.method5938(this.aClass101_Sub1_23.aClass167_16);
			} else {
				this.aClass101_Sub1_23.method5836(true);
				local63 = true;
				this.aClass101_Sub1_23.method5953(3, this.aClass288_3.anInterface25_16);
				this.aClass101_Sub1_23.method5938(this.aClass101_Sub1_23.aClass167_21);
			}
			for (@Pc(98) int local98 = 0; local98 < this.anIntArray496.length; local98++) {
				@Pc(105) int local105 = this.anIntArray499[local98];
				@Pc(112) int local112 = this.anIntArray499[local98 + 1];
				@Pc(119) int local119 = this.aShortArray141[local105] & 0xFFFF;
				if (local119 == 65535) {
					local119 = -1;
				}
				this.aClass101_Sub1_23.method5873(local119, local63, true);
				this.aClass101_Sub1_23.method5947(this.anIntArray496[local98], this.anIntArray498[local98], this.aClass142_1.anInterface24_4, Static627.aClass320_6, local105 * 3, local112 - local105);
			}
		}
		this.method8653();
	}

	@OriginalMember(owner = "client!te", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9866;
	}

	@OriginalMember(owner = "client!te", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class12_Sub2.anIntArray204[arg0];
		@Pc(13) int local13 = Class12_Sub2.anIntArray203[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt9898; local15++) {
			local33 = this.anIntArray495[local15] * local13 + this.anIntArray502[local15] * local9 >> 14;
			this.anIntArray502[local15] = this.anIntArray502[local15] * local13 - local9 * this.anIntArray495[local15] >> 14;
			this.anIntArray495[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt9931; local33++) {
			@Pc(83) int local83 = this.aShortArray135[local33] * local9 + this.aShortArray142[local33] * local13 >> 14;
			this.aShortArray135[local33] = (short) (this.aShortArray135[local33] * local13 - local9 * this.aShortArray142[local33] >> 14);
			this.aShortArray142[local33] = (short) local83;
		}
		this.method8649();
		this.method8656();
		this.aBoolean726 = false;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "()[Lclient!pi;")
	@Override
	public Class283[] method8630() {
		return this.aClass283Array5;
	}

	@OriginalMember(owner = "client!te", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9893;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method8619(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
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
			Static262.anInt5000 = 0;
			Static457.anInt8214 = 0;
			Static241.anInt4779 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray54.length) {
					local48 = this.anIntArrayArray54[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static457.anInt8214 += this.anIntArray495[local56];
						Static241.anInt4779 += this.anIntArray500[local56];
						Static262.anInt5000 += this.anIntArray502[local56];
						local24++;
					}
				}
			}
			if (local24 <= 0) {
				Static241.anInt4779 = local22;
				Static262.anInt5000 = local18;
				Static457.anInt8214 = local14;
			} else {
				Static241.anInt4779 = Static241.anInt4779 / local24 + local22;
				Static457.anInt8214 = Static457.anInt8214 / local24 + local14;
				Static262.anInt5000 = Static262.anInt5000 / local24 + local18;
			}
			return;
		}
		@Pc(158) int[] local158;
		@Pc(160) int local160;
		if (arg0 == 1) {
			local14 = arg2 << 4;
			local18 = arg4 << 4;
			local22 = arg3 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray54.length > local32) {
					local158 = this.anIntArrayArray54[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray495[local50] += local14;
						this.anIntArray500[local50] += local22;
						this.anIntArray502[local50] += local18;
					}
				}
			}
			return;
		}
		@Pc(279) int local279;
		@Pc(298) int local298;
		@Pc(748) int local748;
		@Pc(757) int local757;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray54.length > local32) {
					local158 = this.anIntArrayArray54[local32];
					if ((arg5 & 0x1) == 0) {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray495[local50] -= Static457.anInt8214;
							this.anIntArray500[local50] -= Static241.anInt4779;
							this.anIntArray502[local50] -= Static262.anInt5000;
							if (arg4 != 0) {
								local56 = Class12_Sub2.anIntArray204[arg4];
								local279 = Class12_Sub2.anIntArray203[arg4];
								local298 = local56 * this.anIntArray500[local50] + this.anIntArray495[local50] * local279 + 16383 >> 14;
								this.anIntArray500[local50] = local279 * this.anIntArray500[local50] + 16383 - local56 * this.anIntArray495[local50] >> 14;
								this.anIntArray495[local50] = local298;
							}
							if (arg2 != 0) {
								local56 = Class12_Sub2.anIntArray204[arg2];
								local279 = Class12_Sub2.anIntArray203[arg2];
								local298 = this.anIntArray500[local50] * local279 + 16383 - local56 * this.anIntArray502[local50] >> 14;
								this.anIntArray502[local50] = this.anIntArray502[local50] * local279 + local56 * this.anIntArray500[local50] + 16383 >> 14;
								this.anIntArray500[local50] = local298;
							}
							if (arg3 != 0) {
								local56 = Class12_Sub2.anIntArray204[arg3];
								local279 = Class12_Sub2.anIntArray203[arg3];
								local298 = this.anIntArray495[local50] * local279 + this.anIntArray502[local50] * local56 + 16383 >> 14;
								this.anIntArray502[local50] = local279 * this.anIntArray502[local50] + 16383 - this.anIntArray495[local50] * local56 >> 14;
								this.anIntArray495[local50] = local298;
							}
							this.anIntArray495[local50] += Static457.anInt8214;
							this.anIntArray500[local50] += Static241.anInt4779;
							this.anIntArray502[local50] += Static262.anInt5000;
						}
					} else {
						for (local160 = 0; local160 < local158.length; local160++) {
							local50 = local158[local160];
							this.anIntArray495[local50] -= Static457.anInt8214;
							this.anIntArray500[local50] -= Static241.anInt4779;
							this.anIntArray502[local50] -= Static262.anInt5000;
							if (arg2 != 0) {
								local56 = Class12_Sub2.anIntArray204[arg2];
								local279 = Class12_Sub2.anIntArray203[arg2];
								local298 = this.anIntArray500[local50] * local279 + 16383 - local56 * this.anIntArray502[local50] >> 14;
								this.anIntArray502[local50] = local56 * this.anIntArray500[local50] + this.anIntArray502[local50] * local279 + 16383 >> 14;
								this.anIntArray500[local50] = local298;
							}
							if (arg4 != 0) {
								local56 = Class12_Sub2.anIntArray204[arg4];
								local279 = Class12_Sub2.anIntArray203[arg4];
								local298 = this.anIntArray500[local50] * local56 + this.anIntArray495[local50] * local279 + 16383 >> 14;
								this.anIntArray500[local50] = this.anIntArray500[local50] * local279 + 16383 - local56 * this.anIntArray495[local50] >> 14;
								this.anIntArray495[local50] = local298;
							}
							if (arg3 != 0) {
								local56 = Class12_Sub2.anIntArray204[arg3];
								local279 = Class12_Sub2.anIntArray203[arg3];
								local298 = this.anIntArray495[local50] * local279 + this.anIntArray502[local50] * local56 + 16383 >> 14;
								this.anIntArray502[local50] = local279 * this.anIntArray502[local50] + 16383 - local56 * this.anIntArray495[local50] >> 14;
								this.anIntArray495[local50] = local298;
							}
							this.anIntArray495[local50] += Static457.anInt8214;
							this.anIntArray500[local50] += Static241.anInt4779;
							this.anIntArray502[local50] += Static262.anInt5000;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (local38 < this.anIntArrayArray54.length) {
						local48 = this.anIntArrayArray54[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local279 = this.anIntArray501[local56];
							local298 = this.anIntArray501[local56 + 1];
							for (local748 = local279; local748 < local298; local748++) {
								local757 = this.aShortArray136[local748] - 1;
								if (local757 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class12_Sub2.anIntArray204[arg4];
									local774 = Class12_Sub2.anIntArray203[arg4];
									local792 = this.aShortArray142[local757] * local774 + this.aShortArray131[local757] * local770 + 16383 >> 14;
									this.aShortArray131[local757] = (short) (this.aShortArray131[local757] * local774 + 16383 - this.aShortArray142[local757] * local770 >> 14);
									this.aShortArray142[local757] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class12_Sub2.anIntArray204[arg2];
									local774 = Class12_Sub2.anIntArray203[arg2];
									local792 = local774 * this.aShortArray131[local757] + 16383 - local770 * this.aShortArray135[local757] >> 14;
									this.aShortArray135[local757] = (short) (local770 * this.aShortArray131[local757] + this.aShortArray135[local757] * local774 + 16383 >> 14);
									this.aShortArray131[local757] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class12_Sub2.anIntArray204[arg3];
									local774 = Class12_Sub2.anIntArray203[arg3];
									local792 = local774 * this.aShortArray142[local757] + this.aShortArray135[local757] * local770 + 16383 >> 14;
									this.aShortArray135[local757] = (short) (this.aShortArray135[local757] * local774 + 16383 - local770 * this.aShortArray142[local757] >> 14);
									this.aShortArray142[local757] = (short) local792;
								}
							}
						}
					}
				}
				this.method8656();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray54.length) {
					local158 = this.anIntArrayArray54[local32];
					for (local160 = 0; local160 < local158.length; local160++) {
						local50 = local158[local160];
						this.anIntArray495[local50] -= Static457.anInt8214;
						this.anIntArray500[local50] -= Static241.anInt4779;
						this.anIntArray502[local50] -= Static262.anInt5000;
						this.anIntArray495[local50] = this.anIntArray495[local50] * arg2 >> 7;
						this.anIntArray500[local50] = this.anIntArray500[local50] * arg3 >> 7;
						this.anIntArray502[local50] = arg4 * this.anIntArray502[local50] >> 7;
						this.anIntArray495[local50] += Static457.anInt8214;
						this.anIntArray500[local50] += Static241.anInt4779;
						this.anIntArray502[local50] += Static262.anInt5000;
					}
				}
			}
		} else {
			@Pc(1203) Class365 local1203;
			@Pc(1096) boolean local1096;
			@Pc(1198) Class393 local1198;
			if (arg0 == 5) {
				if (this.anIntArrayArray53 != null) {
					local1096 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray53.length) {
							local48 = this.anIntArrayArray53[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local279 = (this.aByteArray89[local56] & 0xFF) + (arg2 * 8);
								if (local279 < 0) {
									local279 = 0;
								} else if (local279 > 255) {
									local279 = 255;
								}
								this.aByteArray89[local56] = (byte) local279;
							}
							local1096 |= local48.length > 0;
						}
					}
					if (local1096) {
						if (this.aClass393Array1 != null) {
							for (local38 = 0; local38 < this.anInt9911; local38++) {
								local1198 = this.aClass393Array1[local38];
								local1203 = this.aClass365Array1[local38];
								local1203.anInt10800 = local1203.anInt10800 & 0xFFFFFF | 255 - (this.aByteArray89[local1198.anInt11381] & 0xFF) << 24;
							}
						}
						this.method8655();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray53 != null) {
					local1096 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray53.length) {
							local48 = this.anIntArrayArray53[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local279 = this.aShortArray138[local56] & 0xFFFF;
								local298 = local279 >> 10 & 0x3F;
								local748 = local279 >> 7 & 0x7;
								local757 = local279 & 0x7F;
								local748 += arg3 / 4;
								@Pc(1306) int local1306 = arg2 + local298 & 0x3F;
								local757 += arg4;
								if (local748 < 0) {
									local748 = 0;
								} else if (local748 > 7) {
									local748 = 7;
								}
								if (local757 < 0) {
									local757 = 0;
								} else if (local757 > 127) {
									local757 = 127;
								}
								this.aShortArray138[local56] = (short) (local748 << 7 | local1306 << 10 | local757);
							}
							local1096 |= local48.length > 0;
						}
					}
					if (local1096) {
						if (this.aClass393Array1 != null) {
							for (local38 = 0; local38 < this.anInt9911; local38++) {
								local1198 = this.aClass393Array1[local38];
								local1203 = this.aClass365Array1[local38];
								local1203.anInt10800 = Static101.anIntArray92[this.aShortArray138[local1198.anInt11381] & 0xFFFF] & 0xFFFFFF | local1203.anInt10800 & 0xFF000000;
							}
						}
						this.method8655();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray52 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray52.length > local32) {
							local158 = this.anIntArrayArray52[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1203 = this.aClass365Array1[local158[local160]];
								local1203.anInt10805 += arg3;
								local1203.anInt10802 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray52 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray52.length > local32) {
							local158 = this.anIntArrayArray52[local32];
							for (local160 = 0; local160 < local158.length; local160++) {
								local1203 = this.aClass365Array1[local158[local160]];
								local1203.anInt10799 = arg3 * local1203.anInt10799 >> 7;
								local1203.anInt10807 = local1203.anInt10807 * arg2 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray52 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray52.length > local32) {
						local158 = this.anIntArrayArray52[local32];
						for (local160 = 0; local160 < local158.length; local160++) {
							local1203 = this.aClass365Array1[local158[local160]];
							local1203.anInt10804 = arg2 + local1203.anInt10804 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9937;
	}

	@OriginalMember(owner = "client!te", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface3 local9 = this.aClass101_Sub1_23.anInterface3_12;
		for (@Pc(11) int local11 = 0; local11 < this.anInt9907; local11++) {
			if (arg0 == this.aShortArray141[local11]) {
				this.aShortArray141[local11] = arg1;
			}
		}
		@Pc(35) byte local35 = 0;
		@Pc(37) byte local37 = 0;
		if (arg0 != -1) {
			@Pc(47) Class136 local47 = local9.method1941(arg0 & 0xFFFF);
			local35 = local47.aByte67;
			local37 = local47.aByte66;
		}
		@Pc(55) byte local55 = 0;
		@Pc(57) byte local57 = 0;
		if (arg1 != -1) {
			@Pc(68) Class136 local68 = local9.method1941(arg1 & 0xFFFF);
			if (local68.aByte61 != 0 || local68.aByte65 != 0) {
				this.aBoolean725 = true;
			}
			local55 = local68.aByte67;
			local57 = local68.aByte66;
		}
		if (!(local57 != local37 | local55 != local35)) {
			return;
		}
		if (this.aClass393Array1 != null) {
			for (@Pc(113) int local113 = 0; local113 < this.anInt9911; local113++) {
				@Pc(120) Class393 local120 = this.aClass393Array1[local113];
				@Pc(125) Class365 local125 = this.aClass365Array1[local113];
				local125.anInt10800 = local125.anInt10800 & 0xFF000000 | Static101.anIntArray92[this.aShortArray138[local120.anInt11381] & 0xFFFF] & 0xFFFFFF;
			}
		}
		this.method8655();
	}

	@OriginalMember(owner = "client!te", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean725;
	}

	@OriginalMember(owner = "client!te", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.lb;
	}

	@OriginalMember(owner = "client!te", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass288_1 != null) {
			this.aClass288_1.aBoolean613 = Static318.method5254(arg0, this.anInt9910);
		}
		if (this.aClass288_4 != null) {
			this.aClass288_4.aBoolean613 = Static256.method9212(this.anInt9910, arg0);
		}
		if (this.aClass288_2 != null) {
			this.aClass288_2.aBoolean613 = Static39.method9318(this.anInt9910, arg0);
		}
		if (this.aClass288_3 != null) {
			this.aClass288_3.aBoolean613 = Static293.method6715(this.anInt9910, arg0);
		}
		this.lb = arg0;
		this.aBoolean724 = true;
		if (this.aClass383_1 != null && (this.lb & 0x10000) == 0) {
			this.aByteArray88 = this.aClass383_1.aByteArray101;
			this.aShortArray142 = this.aClass383_1.aShortArray165;
			this.aShortArray131 = this.aClass383_1.aShortArray167;
			this.aShortArray135 = this.aClass383_1.aShortArray166;
			this.aClass383_1 = null;
		}
		this.method8653();
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!dm;)V")
	@Override
	public void method8632(@OriginalArg(0) Class76 arg0) {
		@Pc(8) Class76_Sub2 local8 = (Class76_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass283Array5 != null) {
			for (local13 = 0; local13 < this.aClass283Array5.length; local13++) {
				@Pc(20) Class283 local20 = this.aClass283Array5[local13];
				@Pc(22) Class283 local22 = local20;
				if (local20.aClass283_1 != null) {
					local22 = local20.aClass283_1;
				}
				local22.anInt8255 = (int) ((float) this.anIntArray500[local20.anInt8258] * local8.aFloat173 + local8.aFloat167 * (float) this.anIntArray495[local20.anInt8258] + local8.aFloat171 * (float) this.anIntArray502[local20.anInt8258] + local8.aFloat176);
				local22.anInt8249 = (int) ((float) this.anIntArray500[local20.anInt8258] * local8.aFloat165 + (float) this.anIntArray495[local20.anInt8258] * local8.aFloat168 + (float) this.anIntArray502[local20.anInt8258] * local8.aFloat172 + local8.aFloat170);
				local22.anInt8246 = (int) ((float) this.anIntArray495[local20.anInt8258] * local8.aFloat174 + local8.aFloat166 * (float) this.anIntArray500[local20.anInt8258] + local8.aFloat175 * (float) this.anIntArray502[local20.anInt8258] + local8.aFloat169);
				local22.anInt8245 = (int) ((float) this.anIntArray502[local20.anInt8262] * local8.aFloat171 + local8.aFloat173 * (float) this.anIntArray500[local20.anInt8262] + local8.aFloat167 * (float) this.anIntArray495[local20.anInt8262] + local8.aFloat176);
				local22.anInt8254 = (int) (local8.aFloat170 + local8.aFloat172 * (float) this.anIntArray502[local20.anInt8262] + (float) this.anIntArray500[local20.anInt8262] * local8.aFloat165 + local8.aFloat168 * (float) this.anIntArray495[local20.anInt8262]);
				local22.anInt8263 = (int) (local8.aFloat175 * (float) this.anIntArray502[local20.anInt8262] + local8.aFloat174 * (float) this.anIntArray495[local20.anInt8262] + local8.aFloat166 * (float) this.anIntArray500[local20.anInt8262] + local8.aFloat169);
				local22.anInt8251 = (int) (local8.aFloat176 + local8.aFloat173 * (float) this.anIntArray500[local20.anInt8247] + (float) this.anIntArray495[local20.anInt8247] * local8.aFloat167 + local8.aFloat171 * (float) this.anIntArray502[local20.anInt8247]);
				local22.anInt8257 = (int) ((float) this.anIntArray495[local20.anInt8247] * local8.aFloat168 + local8.aFloat165 * (float) this.anIntArray500[local20.anInt8247] + (float) this.anIntArray502[local20.anInt8247] * local8.aFloat172 + local8.aFloat170);
				local22.anInt8244 = (int) (local8.aFloat169 + local8.aFloat175 * (float) this.anIntArray502[local20.anInt8247] + (float) this.anIntArray495[local20.anInt8247] * local8.aFloat174 + local8.aFloat166 * (float) this.anIntArray500[local20.anInt8247]);
			}
		}
		if (this.aClass123Array5 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass123Array5.length; local13++) {
			@Pc(361) Class123 local361 = this.aClass123Array5[local13];
			@Pc(363) Class123 local363 = local361;
			if (local361.aClass123_2 != null) {
				local363 = local361.aClass123_2;
			}
			if (local361.aClass76_6 == null) {
				local361.aClass76_6 = local8.method9643();
			} else {
				local361.aClass76_6.method9629(local8);
			}
			local363.anInt3874 = (int) ((float) this.anIntArray502[local361.anInt3872] * local8.aFloat171 + (float) this.anIntArray495[local361.anInt3872] * local8.aFloat167 + (float) this.anIntArray500[local361.anInt3872] * local8.aFloat173 + local8.aFloat176);
			local363.anInt3870 = (int) (local8.aFloat172 * (float) this.anIntArray502[local361.anInt3872] + (float) this.anIntArray495[local361.anInt3872] * local8.aFloat168 + local8.aFloat165 * (float) this.anIntArray500[local361.anInt3872] + local8.aFloat170);
			local363.anInt3869 = (int) (local8.aFloat169 + local8.aFloat175 * (float) this.anIntArray502[local361.anInt3872] + local8.aFloat166 * (float) this.anIntArray500[local361.anInt3872] + local8.aFloat174 * (float) this.anIntArray495[local361.anInt3872]);
		}
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "()[Lclient!gfa;")
	@Override
	public Class123[] method8634() {
		return this.aClass123Array5;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIZILclient!dm;)Z")
	private boolean method8663(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) Class76 arg5) {
		@Pc(8) Class76_Sub2 local8 = (Class76_Sub2) arg5;
		@Pc(12) Class76_Sub2 local12 = this.aClass101_Sub1_23.aClass76_Sub2_16;
		@Pc(33) float local33 = local8.aFloat176 * local12.aFloat167 + local8.aFloat170 * local12.aFloat173 + local8.aFloat169 * local12.aFloat171 + local12.aFloat176;
		@Pc(54) float local54 = local12.aFloat172 * local8.aFloat169 + local8.aFloat170 * local12.aFloat165 + local8.aFloat176 * local12.aFloat168 + local12.aFloat170;
		Static295.aFloat109 = local8.aFloat171 * local12.aFloat174 + local12.aFloat166 * local8.aFloat172 + local8.aFloat175 * local12.aFloat175;
		Static180.aFloat79 = local8.aFloat174 * local12.aFloat172 + local8.aFloat168 * local12.aFloat165 + local12.aFloat168 * local8.aFloat167;
		Static201.aFloat84 = local12.aFloat172 * local8.aFloat175 + local8.aFloat171 * local12.aFloat168 + local8.aFloat172 * local12.aFloat165;
		Static135.aFloat40 = local12.aFloat167 * local8.aFloat173 + local12.aFloat173 * local8.aFloat165 + local8.aFloat166 * local12.aFloat171;
		Static73.aFloat13 = local12.aFloat171 * local8.aFloat174 + local8.aFloat168 * local12.aFloat173 + local12.aFloat167 * local8.aFloat167;
		Static167.aFloat76 = local12.aFloat173 * local8.aFloat172 + local12.aFloat167 * local8.aFloat171 + local8.aFloat175 * local12.aFloat171;
		Static342.aFloat143 = local12.aFloat175 * local8.aFloat174 + local12.aFloat166 * local8.aFloat168 + local12.aFloat174 * local8.aFloat167;
		Static318.aFloat116 = local12.aFloat165 * local8.aFloat165 + local8.aFloat173 * local12.aFloat168 + local12.aFloat172 * local8.aFloat166;
		@Pc(219) float local219 = local12.aFloat169 + local12.aFloat175 * local8.aFloat169 + local12.aFloat174 * local8.aFloat176 + local12.aFloat166 * local8.aFloat170;
		Static295.aFloat110 = local12.aFloat175 * local8.aFloat166 + local8.aFloat165 * local12.aFloat166 + local8.aFloat173 * local12.aFloat174;
		@Pc(239) boolean local239 = false;
		@Pc(247) float local247 = Float.MAX_VALUE;
		@Pc(249) float local249 = -3.4028235E38F;
		@Pc(251) float local251 = Float.MAX_VALUE;
		@Pc(253) float local253 = -3.4028235E38F;
		@Pc(257) int local257 = this.aClass101_Sub1_23.anInt6615;
		@Pc(261) int local261 = this.aClass101_Sub1_23.anInt6639;
		if (!this.aBoolean726) {
			this.method8660();
		}
		@Pc(276) int local276 = this.anInt9893 - this.anInt9925 >> 1;
		@Pc(285) int local285 = this.anInt9937 - this.anInt9871 >> 1;
		@Pc(293) int local293 = this.anInt9866 - this.anInt9892 >> 1;
		@Pc(298) int local298 = local276 + this.anInt9925;
		@Pc(304) int local304 = this.anInt9871 + local285;
		@Pc(310) int local310 = this.anInt9892 + local293;
		@Pc(317) int local317 = local298 - (local276 << arg2);
		@Pc(324) int local324 = local304 - (local285 << arg2);
		@Pc(330) int local330 = local310 - (local293 << arg2);
		@Pc(336) int local336 = (local276 << arg2) + local298;
		@Pc(342) int local342 = local304 + (local285 << arg2);
		Static520.anIntArray469[0] = local317;
		@Pc(352) int local352 = local310 + (local293 << arg2);
		Static569.anIntArray504[0] = local324;
		Static520.anIntArray469[1] = local336;
		Static509.anIntArray456[0] = local330;
		Static569.anIntArray504[1] = local324;
		Static520.anIntArray469[2] = local317;
		Static509.anIntArray456[1] = local330;
		Static569.anIntArray504[2] = local342;
		Static509.anIntArray456[2] = local330;
		Static520.anIntArray469[3] = local336;
		Static569.anIntArray504[3] = local342;
		Static520.anIntArray469[4] = local317;
		Static509.anIntArray456[3] = local330;
		Static569.anIntArray504[4] = local324;
		Static509.anIntArray456[4] = local352;
		Static520.anIntArray469[5] = local336;
		Static569.anIntArray504[5] = local324;
		Static520.anIntArray469[6] = local317;
		Static509.anIntArray456[5] = local352;
		Static569.anIntArray504[6] = local342;
		Static520.anIntArray469[7] = local336;
		Static509.anIntArray456[6] = local352;
		Static569.anIntArray504[7] = local342;
		Static509.anIntArray456[7] = local352;
		@Pc(477) float local477;
		@Pc(505) float local505;
		@Pc(491) float local491;
		@Pc(458) float local458;
		@Pc(453) float local453;
		@Pc(463) float local463;
		for (@Pc(446) int local446 = 0; local446 < 8; local446++) {
			local453 = (float) Static569.anIntArray504[local446];
			local458 = (float) Static520.anIntArray469[local446];
			local463 = (float) Static509.anIntArray456[local446];
			local477 = local33 + local463 * Static167.aFloat76 + local458 * Static73.aFloat13 + local453 * Static135.aFloat40;
			local491 = Static295.aFloat109 * local463 + local458 * Static342.aFloat143 + Static295.aFloat110 * local453 + local219;
			local505 = local54 + Static318.aFloat116 * local453 + local458 * Static180.aFloat79 + local463 * Static201.aFloat84;
			if ((float) this.aClass101_Sub1_23.anInt6637 <= local491) {
				if (arg3 > 0) {
					local491 = (float) arg3;
				}
				@Pc(532) float local532 = (float) this.aClass101_Sub1_23.anInt6617 + local477 * (float) local257 / local491;
				if (local247 > local532) {
					local247 = local532;
				}
				@Pc(550) float local550 = (float) this.aClass101_Sub1_23.anInt6635 + (float) local261 * local505 / local491;
				if (local249 < local532) {
					local249 = local532;
				}
				local239 = true;
				if (local550 < local251) {
					local251 = local550;
				}
				if (local253 < local550) {
					local253 = local550;
				}
			}
		}
		if (local239 && (float) arg0 > local247 && local249 > (float) arg0 && (float) arg1 > local251 && (float) arg1 < local253) {
			if (arg4) {
				return true;
			}
			if (Static581.anIntArray514.length < this.anInt9931) {
				Static581.anIntArray514 = new int[this.anInt9931];
				Static658.anIntArray591 = new int[this.anInt9931];
			}
			@Pc(707) int local707;
			for (@Pc(617) int local617 = 0; local617 < this.anInt9898; local617++) {
				local458 = (float) this.anIntArray495[local617];
				local453 = (float) this.anIntArray500[local617];
				local463 = (float) this.anIntArray502[local617];
				local477 = local463 * Static167.aFloat76 + local458 * Static73.aFloat13 + Static135.aFloat40 * local453 + local33;
				local491 = local219 + Static295.aFloat109 * local463 + Static342.aFloat143 * local458 + local453 * Static295.aFloat110;
				local505 = Static201.aFloat84 * local463 + Static318.aFloat116 * local453 + local458 * Static180.aFloat79 + local54;
				@Pc(720) int local720;
				@Pc(725) int local725;
				@Pc(732) int local732;
				if ((float) this.aClass101_Sub1_23.anInt6637 <= local491) {
					if (arg3 > 0) {
						local491 = (float) arg3;
					}
					local707 = (int) ((float) local257 * local477 / local491 + (float) this.aClass101_Sub1_23.anInt6617);
					local720 = (int) (local505 * (float) local261 / local491 + (float) this.aClass101_Sub1_23.anInt6635);
					local725 = this.anIntArray501[local617];
					local732 = this.anIntArray501[local617 + 1];
					for (@Pc(734) int local734 = local725; local734 < local732; local734++) {
						@Pc(743) int local743 = this.aShortArray136[local734] - 1;
						if (local743 == -1) {
							break;
						}
						Static581.anIntArray514[local743] = local707;
						Static658.anIntArray591[local743] = local720;
					}
				} else {
					local707 = this.anIntArray501[local617];
					local720 = this.anIntArray501[local617 + 1];
					for (local725 = local707; local725 < local720; local725++) {
						local732 = this.aShortArray136[local725] - 1;
						if (local732 == -1) {
							break;
						}
						Static581.anIntArray514[this.aShortArray136[local725] - 1] = -999999;
					}
				}
			}
			for (local707 = 0; local707 < this.anInt9907; local707++) {
				if (Static581.anIntArray514[this.aShortArray140[local707]] != -999999 && Static581.anIntArray514[this.aShortArray137[local707]] != -999999 && Static581.anIntArray514[this.aShortArray134[local707]] != -999999 && this.method8645(Static581.anIntArray514[this.aShortArray134[local707]], Static581.anIntArray514[this.aShortArray140[local707]], Static658.anIntArray591[this.aShortArray134[local707]], arg0, Static658.anIntArray591[this.aShortArray140[local707]], Static658.anIntArray591[this.aShortArray137[local707]], arg1, Static581.anIntArray514[this.aShortArray137[local707]])) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!te", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9885;
	}

	@OriginalMember(owner = "client!te", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class2_Sub1_Sub11 ba(@OriginalArg(0) Class2_Sub1_Sub11 arg0) {
		if (this.anInt9931 == 0) {
			return null;
		}
		if (!this.aBoolean726) {
			this.method8660();
		}
		@Pc(37) int local37;
		@Pc(54) int local54;
		if (this.aClass101_Sub1_23.anInt6616 <= 0) {
			local37 = this.anInt9925 - (this.aClass101_Sub1_23.anInt6616 * this.anInt9871 >> 8) >> this.aClass101_Sub1_23.anInt6632;
			local54 = this.anInt9893 - (this.aClass101_Sub1_23.anInt6616 * this.anInt9937 >> 8) >> this.aClass101_Sub1_23.anInt6632;
		} else {
			local37 = this.anInt9925 - (this.aClass101_Sub1_23.anInt6616 * this.anInt9937 >> 8) >> this.aClass101_Sub1_23.anInt6632;
			local54 = this.anInt9893 - (this.anInt9871 * this.aClass101_Sub1_23.anInt6616 >> 8) >> this.aClass101_Sub1_23.anInt6632;
		}
		@Pc(113) int local113;
		@Pc(130) int local130;
		if (this.aClass101_Sub1_23.anInt6626 <= 0) {
			local113 = this.anInt9892 - (this.anInt9871 * this.aClass101_Sub1_23.anInt6626 >> 8) >> this.aClass101_Sub1_23.anInt6632;
			local130 = this.anInt9866 - (this.aClass101_Sub1_23.anInt6626 * this.anInt9937 >> 8) >> this.aClass101_Sub1_23.anInt6632;
		} else {
			local113 = this.anInt9892 - (this.anInt9937 * this.aClass101_Sub1_23.anInt6626 >> 8) >> this.aClass101_Sub1_23.anInt6632;
			local130 = this.anInt9866 - (this.aClass101_Sub1_23.anInt6626 * this.anInt9871 >> 8) >> this.aClass101_Sub1_23.anInt6632;
		}
		@Pc(173) int local173 = local54 + 1 - local37;
		@Pc(179) int local179 = local130 + 1 - local113;
		@Pc(182) Class2_Sub1_Sub11_Sub2 local182 = (Class2_Sub1_Sub11_Sub2) arg0;
		@Pc(192) Class2_Sub1_Sub11_Sub2 local192;
		if (local182 != null && local182.method8250(local173, local179)) {
			local192 = local182;
			local182.method8246();
		} else {
			local192 = new Class2_Sub1_Sub11_Sub2(this.aClass101_Sub1_23, local173, local179);
		}
		local192.method8248(local130, local54, local37, local113);
		this.method8652(local192);
		return local192;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!dm;Lclient!et;I)V")
	@Override
	public void method8641(@OriginalArg(0) Class76 arg0, @OriginalArg(1) Class15_Sub6 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt9931 == 0) {
			return;
		}
		@Pc(13) Class76_Sub2 local13 = this.aClass101_Sub1_23.aClass76_Sub2_16;
		@Pc(16) Class76_Sub2 local16 = (Class76_Sub2) arg0;
		if (!this.aBoolean726) {
			this.method8660();
		}
		Static295.aFloat110 = local13.aFloat175 * local16.aFloat166 + local13.aFloat174 * local16.aFloat173 + local13.aFloat166 * local16.aFloat165;
		Static105.aFloat30 = local16.aFloat176 * local13.aFloat174 + local16.aFloat170 * local13.aFloat166 + local13.aFloat175 * local16.aFloat169 + local13.aFloat169;
		@Pc(69) float local69 = Static295.aFloat110 * (float) this.anInt9871 + Static105.aFloat30;
		@Pc(77) float local77 = Static105.aFloat30 + Static295.aFloat110 * (float) this.anInt9937;
		@Pc(88) float local88;
		@Pc(94) float local94;
		if (local77 < local69) {
			local88 = (float) -this.anInt9922 + local77;
			local94 = (float) this.anInt9922 + local69;
		} else {
			local94 = (float) this.anInt9922 + local77;
			local88 = local69 - (float) this.anInt9922;
		}
		if (this.aClass101_Sub1_23.aFloat159 <= local88 || local94 <= (float) this.aClass101_Sub1_23.anInt6637) {
			return;
		}
		Static135.aFloat40 = local16.aFloat166 * local13.aFloat171 + local13.aFloat167 * local16.aFloat173 + local13.aFloat173 * local16.aFloat165;
		Static256.aFloat192 = local13.aFloat167 * local16.aFloat176 + local16.aFloat170 * local13.aFloat173 + local16.aFloat169 * local13.aFloat171 + local13.aFloat176;
		@Pc(170) float local170 = Static135.aFloat40 * (float) this.anInt9871 + Static256.aFloat192;
		@Pc(178) float local178 = Static256.aFloat192 + (float) this.anInt9937 * Static135.aFloat40;
		@Pc(204) float local204;
		@Pc(193) float local193;
		if (local170 > local178) {
			local204 = ((float) -this.anInt9922 + local178) * (float) this.aClass101_Sub1_23.anInt6615;
			local193 = ((float) this.anInt9922 + local170) * (float) this.aClass101_Sub1_23.anInt6615;
		} else {
			local193 = ((float) this.anInt9922 + local178) * (float) this.aClass101_Sub1_23.anInt6615;
			local204 = (float) this.aClass101_Sub1_23.anInt6615 * (local170 - (float) this.anInt9922);
		}
		if (local204 / local94 >= this.aClass101_Sub1_23.aFloat155 || this.aClass101_Sub1_23.aFloat144 >= local193 / local94) {
			return;
		}
		Static232.aFloat201 = local13.aFloat170 + local16.aFloat169 * local13.aFloat172 + local16.aFloat170 * local13.aFloat165 + local13.aFloat168 * local16.aFloat176;
		Static318.aFloat116 = local16.aFloat166 * local13.aFloat172 + local13.aFloat168 * local16.aFloat173 + local16.aFloat165 * local13.aFloat165;
		@Pc(294) float local294 = Static318.aFloat116 * (float) this.anInt9871 + Static232.aFloat201;
		@Pc(302) float local302 = Static232.aFloat201 + Static318.aFloat116 * (float) this.anInt9937;
		@Pc(329) float local329;
		@Pc(317) float local317;
		if (local302 < local294) {
			local329 = (float) this.aClass101_Sub1_23.anInt6639 * (local302 - (float) this.anInt9922);
			local317 = (float) this.aClass101_Sub1_23.anInt6639 * ((float) this.anInt9922 + local294);
		} else {
			local317 = (local302 + (float) this.anInt9922) * (float) this.aClass101_Sub1_23.anInt6639;
			local329 = (float) this.aClass101_Sub1_23.anInt6639 * ((float) -this.anInt9922 + local294);
		}
		if (local329 / local94 >= this.aClass101_Sub1_23.aFloat147 || local317 / local94 <= this.aClass101_Sub1_23.aFloat154) {
			return;
		}
		if (arg1 != null || this.aClass393Array1 != null) {
			Static167.aFloat76 = local13.aFloat167 * local16.aFloat171 + local13.aFloat173 * local16.aFloat172 + local16.aFloat175 * local13.aFloat171;
			Static180.aFloat79 = local13.aFloat172 * local16.aFloat174 + local16.aFloat168 * local13.aFloat165 + local16.aFloat167 * local13.aFloat168;
			Static201.aFloat84 = local13.aFloat172 * local16.aFloat175 + local13.aFloat165 * local16.aFloat172 + local16.aFloat171 * local13.aFloat168;
			Static73.aFloat13 = local13.aFloat171 * local16.aFloat174 + local13.aFloat173 * local16.aFloat168 + local16.aFloat167 * local13.aFloat167;
			Static342.aFloat143 = local16.aFloat174 * local13.aFloat175 + local16.aFloat168 * local13.aFloat166 + local16.aFloat167 * local13.aFloat174;
			Static295.aFloat109 = local16.aFloat172 * local13.aFloat166 + local16.aFloat171 * local13.aFloat174 + local13.aFloat175 * local16.aFloat175;
		}
		if (arg1 != null) {
			@Pc(488) boolean local488 = false;
			@Pc(490) boolean local490 = true;
			@Pc(499) int local499 = this.anInt9925 + this.anInt9893 >> 1;
			@Pc(507) int local507 = this.anInt9892 + this.anInt9866 >> 1;
			@Pc(526) int local526 = (int) (Static256.aFloat192 + Static73.aFloat13 * (float) local499 + (float) this.anInt9871 * Static135.aFloat40 + Static167.aFloat76 * (float) local507);
			@Pc(545) int local545 = (int) (Static232.aFloat201 + (float) local499 * Static180.aFloat79 + Static318.aFloat116 * (float) this.anInt9871 + Static201.aFloat84 * (float) local507);
			@Pc(564) int local564 = (int) ((float) local507 * Static295.aFloat109 + Static105.aFloat30 + Static342.aFloat143 * (float) local499 + (float) this.anInt9871 * Static295.aFloat110);
			if (this.aClass101_Sub1_23.anInt6637 > local564) {
				local488 = true;
			} else {
				arg1.anInt2727 = this.aClass101_Sub1_23.anInt6615 * local526 / local564 + this.aClass101_Sub1_23.anInt6617;
				arg1.anInt2728 = this.aClass101_Sub1_23.anInt6635 + this.aClass101_Sub1_23.anInt6639 * local545 / local564;
			}
			@Pc(622) int local622 = (int) (Static256.aFloat192 + Static73.aFloat13 * (float) local499 + (float) this.anInt9937 * Static135.aFloat40 + (float) local507 * Static167.aFloat76);
			@Pc(641) int local641 = (int) ((float) local507 * Static201.aFloat84 + (float) this.anInt9937 * Static318.aFloat116 + (float) local499 * Static180.aFloat79 + Static232.aFloat201);
			@Pc(660) int local660 = (int) (Static295.aFloat109 * (float) local507 + (float) local499 * Static342.aFloat143 + Static105.aFloat30 + (float) this.anInt9937 * Static295.aFloat110);
			if (this.aClass101_Sub1_23.anInt6637 > local660) {
				local488 = true;
			} else {
				arg1.anInt2726 = this.aClass101_Sub1_23.anInt6615 * local622 / local660 + this.aClass101_Sub1_23.anInt6617;
				arg1.anInt2725 = this.aClass101_Sub1_23.anInt6635 + this.aClass101_Sub1_23.anInt6639 * local641 / local660;
			}
			if (local488) {
				if (this.aClass101_Sub1_23.anInt6637 > local564 && local660 < this.aClass101_Sub1_23.anInt6637) {
					local490 = false;
				} else {
					@Pc(739) int local739;
					@Pc(750) int local750;
					@Pc(761) int local761;
					if (this.aClass101_Sub1_23.anInt6637 > local564) {
						local739 = (local660 - this.aClass101_Sub1_23.anInt6637 << 16) / (local660 - local564);
						local750 = ((local622 - local526) * local739 >> 16) + local622;
						local761 = (local739 * (local641 - local545) >> 16) + local641;
						arg1.anInt2727 = local750 * this.aClass101_Sub1_23.anInt6615 / this.aClass101_Sub1_23.anInt6637 + this.aClass101_Sub1_23.anInt6617;
						arg1.anInt2728 = this.aClass101_Sub1_23.anInt6635 + this.aClass101_Sub1_23.anInt6639 * local761 / this.aClass101_Sub1_23.anInt6637;
					} else if (this.aClass101_Sub1_23.anInt6637 > local660) {
						local739 = (local564 - this.aClass101_Sub1_23.anInt6637 << 16) / (local564 - local660);
						local750 = local526 + ((local526 - local622) * local739 >> 16);
						local761 = ((local545 - local641) * local739 >> 16) + local545;
						arg1.anInt2727 = this.aClass101_Sub1_23.anInt6617 + local750 * this.aClass101_Sub1_23.anInt6615 / this.aClass101_Sub1_23.anInt6637;
						arg1.anInt2728 = this.aClass101_Sub1_23.anInt6635 + this.aClass101_Sub1_23.anInt6639 * local761 / this.aClass101_Sub1_23.anInt6637;
					}
				}
			}
			if (local490) {
				arg1.aBoolean200 = true;
				if (local660 >= local564) {
					arg1.anInt2724 = this.aClass101_Sub1_23.anInt6617 + this.aClass101_Sub1_23.anInt6615 * (this.anInt9922 + local622) / local660 - arg1.anInt2726;
				} else {
					arg1.anInt2724 = this.aClass101_Sub1_23.anInt6617 + (local526 + this.anInt9922) * this.aClass101_Sub1_23.anInt6615 / local564 - arg1.anInt2727;
				}
			}
		}
		this.aClass101_Sub1_23.method5911();
		this.aClass101_Sub1_23.method5893(local16);
		this.method8662();
		this.method8658();
	}

	@OriginalMember(owner = "client!te", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean726) {
			this.method8660();
		}
		return this.anInt9925;
	}
}
