import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class180_Sub1 extends Class180 {

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
	private int anInt5613;

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
	private int anInt5615;

	@OriginalMember(owner = "client!lj", name = "z", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
	private int anInt5624;

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
	private int anInt5628;

	@OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
	private int anInt5633;

	@OriginalMember(owner = "client!lj", name = "bb", descriptor = "Lclient!uia;")
	private Class344 aClass344_1;

	@OriginalMember(owner = "client!lj", name = "eb", descriptor = "Lclient!hfa;")
	private Class139 aClass139_1;

	@OriginalMember(owner = "client!lj", name = "jb", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "client!lj", name = "Eb", descriptor = "Lclient!uia;")
	private Class344 aClass344_2;

	@OriginalMember(owner = "client!lj", name = "Gb", descriptor = "Lclient!fm;")
	private Class113 aClass113_1;

	@OriginalMember(owner = "client!lj", name = "Lb", descriptor = "Lclient!rv;")
	private final Class126_Sub2 aClass126_Sub2_12;

	@OriginalMember(owner = "client!lj", name = "Xb", descriptor = "Lclient!uia;")
	private Class344 aClass344_3;

	@OriginalMember(owner = "client!lj", name = "cc", descriptor = "I")
	private int anInt5673;

	@OriginalMember(owner = "client!lj", name = "hc", descriptor = "I")
	private int anInt5675;

	@OriginalMember(owner = "client!lj", name = "mc", descriptor = "I")
	private int anInt5678;

	@OriginalMember(owner = "client!lj", name = "nc", descriptor = "Z")
	private boolean aBoolean480;

	@OriginalMember(owner = "client!lj", name = "Ac", descriptor = "I")
	private int anInt5685;

	@OriginalMember(owner = "client!lj", name = "Gc", descriptor = "Lclient!uia;")
	private Class344 aClass344_4;

	@OriginalMember(owner = "client!lj", name = "Hc", descriptor = "I")
	private int anInt5690;

	@OriginalMember(owner = "client!lj", name = "Mc", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "[I")
	private int[] anIntArray414;

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
	private int anInt5635;

	@OriginalMember(owner = "client!lj", name = "Jb", descriptor = "I")
	private int anInt5663;

	@OriginalMember(owner = "client!lj", name = "kc", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!lj", name = "Kb", descriptor = "Z")
	private boolean aBoolean478;

	@OriginalMember(owner = "client!lj", name = "D", descriptor = "[I")
	private int[] anIntArray418;

	@OriginalMember(owner = "client!lj", name = "wc", descriptor = "[S")
	private short[] aShortArray74;

	@OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
	private int anInt5614;

	@OriginalMember(owner = "client!lj", name = "w", descriptor = "[I")
	private int[] anIntArray415;

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "[I")
	private int[] anIntArray417;

	@OriginalMember(owner = "client!lj", name = "xb", descriptor = "I")
	private int anInt5655;

	@OriginalMember(owner = "client!lj", name = "Qb", descriptor = "[Lclient!hi;")
	private Class143[] aClass143Array2;

	@OriginalMember(owner = "client!lj", name = "Db", descriptor = "[Lclient!cm;")
	private Class57[] aClass57Array2;

	@OriginalMember(owner = "client!lj", name = "ic", descriptor = "I")
	private int anInt5676;

	@OriginalMember(owner = "client!lj", name = "N", descriptor = "[Lclient!ida;")
	private Class152[] aClass152Array1;

	@OriginalMember(owner = "client!lj", name = "sb", descriptor = "[Lclient!ra;")
	private Class297[] aClass297Array1;

	@OriginalMember(owner = "client!lj", name = "Sb", descriptor = "[S")
	private short[] aShortArray69;

	@OriginalMember(owner = "client!lj", name = "gc", descriptor = "[S")
	private short[] aShortArray72;

	@OriginalMember(owner = "client!lj", name = "K", descriptor = "S")
	private short aShort75;

	@OriginalMember(owner = "client!lj", name = "uc", descriptor = "[F")
	private float[] aFloatArray31;

	@OriginalMember(owner = "client!lj", name = "Pc", descriptor = "S")
	private short aShort76;

	@OriginalMember(owner = "client!lj", name = "Rb", descriptor = "[S")
	private short[] aShortArray68;

	@OriginalMember(owner = "client!lj", name = "X", descriptor = "[S")
	private short[] aShortArray65;

	@OriginalMember(owner = "client!lj", name = "vc", descriptor = "[S")
	private short[] aShortArray73;

	@OriginalMember(owner = "client!lj", name = "lb", descriptor = "[S")
	private short[] lb;

	@OriginalMember(owner = "client!lj", name = "Ab", descriptor = "[S")
	private short[] aShortArray67;

	@OriginalMember(owner = "client!lj", name = "Nc", descriptor = "[S")
	private short[] aShortArray75;

	@OriginalMember(owner = "client!lj", name = "Z", descriptor = "[S")
	private short[] aShortArray66;

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "[S")
	private short[] aShortArray64;

	@OriginalMember(owner = "client!lj", name = "ac", descriptor = "[S")
	private short[] aShortArray70;

	@OriginalMember(owner = "client!lj", name = "zc", descriptor = "[F")
	private float[] aFloatArray32;

	@OriginalMember(owner = "client!lj", name = "Pb", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!lj", name = "Y", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!lj", name = "fc", descriptor = "[S")
	private short[] aShortArray71;

	@OriginalMember(owner = "client!lj", name = "Ob", descriptor = "[I")
	private int[] anIntArray419;

	@OriginalMember(owner = "client!lj", name = "A", descriptor = "[I")
	private int[] anIntArray416;

	@OriginalMember(owner = "client!lj", name = "Fc", descriptor = "[I")
	private int[] anIntArray420;

	@OriginalMember(owner = "client!lj", name = "rc", descriptor = "[[I")
	private int[][] anIntArrayArray26;

	@OriginalMember(owner = "client!lj", name = "oc", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!lj", name = "jc", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!rv;Lclient!ur;IIII)V")
	public Class180_Sub1(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this(arg0, arg2, arg5, true, false);
		@Pc(11) Interface8 local11 = arg0.anInterface8_10;
		this.anIntArray414 = new int[arg1.anInt9589 + 1];
		@Pc(22) int[] local22 = new int[arg1.anInt9571];
		for (@Pc(24) int local24 = 0; local24 < arg1.anInt9571; local24++) {
			if (arg1.aByteArray97 == null || arg1.aByteArray97[local24] != 2) {
				if (arg1.aShortArray171 != null && arg1.aShortArray171[local24] != -1) {
					@Pc(54) Class321 local54 = local11.method7813(arg1.aShortArray171[local24] & 0xFFFF);
					if (((this.anInt5673 & 0x40) == 0 || !local54.aBoolean724) && local54.aBoolean726) {
						continue;
					}
				}
				local22[this.anInt5635++] = local24;
				this.anIntArray414[arg1.aShortArray167[local24]]++;
				this.anIntArray414[arg1.aShortArray165[local24]]++;
				this.anIntArray414[arg1.aShortArray174[local24]]++;
			}
		}
		this.anInt5663 = this.anInt5635;
		@Pc(127) long[] local127 = new long[this.anInt5635];
		@Pc(139) boolean local139 = (this.anInt5624 & 0x100) != 0;
		@Pc(151) int local151;
		@Pc(164) int local164;
		@Pc(332) int local332;
		for (@Pc(141) int local141 = 0; local141 < this.anInt5635; local141++) {
			@Pc(147) int local147 = local22[local141];
			@Pc(149) Class321 local149 = null;
			local151 = 0;
			@Pc(153) byte local153 = 0;
			@Pc(155) byte local155 = 0;
			@Pc(157) byte local157 = 0;
			if (arg1.aClass196Array1 != null) {
				@Pc(162) boolean local162 = false;
				for (local164 = 0; local164 < arg1.aClass196Array1.length; local164++) {
					@Pc(171) Class196 local171 = arg1.aClass196Array1[local164];
					if (local171.anInt4752 == local147) {
						@Pc(184) Class255 local184 = Static415.method6340(local171.anInt4755);
						if (local184.aBoolean571) {
							local162 = true;
						}
						if (local184.anInt6889 != -1) {
							@Pc(199) Class321 local199 = local11.method7813(local184.anInt6889);
							if (local199.anInt8901 == 2) {
								this.aBoolean479 = true;
							}
						}
					}
				}
				if (local162) {
					local127[local141] = Long.MAX_VALUE;
					this.anInt5663--;
					continue;
				}
			}
			@Pc(230) short local230 = -1;
			if (arg1.aShortArray171 != null) {
				local230 = arg1.aShortArray171[local147];
				if (local230 != -1) {
					local149 = local11.method7813(local230 & 0xFFFF);
					if ((this.anInt5673 & 0x40) != 0 && local149.aBoolean724) {
						local230 = -1;
						local149 = null;
					} else {
						local157 = local149.aByte120;
						local155 = local149.aByte115;
					}
				}
			}
			@Pc(288) boolean local288 = arg1.aByteArray95 != null && arg1.aByteArray95[local147] != 0 || local149 != null && local149.anInt8901 != 0;
			if ((local139 || local288) && arg1.aByteArray96 != null) {
				local151 += arg1.aByteArray96[local147] << 17;
			}
			if (local288) {
				local151 += 65536;
			}
			local151 += (local155 & 0xFF) << 8;
			local151 += local157 & 0xFF;
			local332 = local153 + ((local230 & 0xFFFF) << 16);
			@Pc(338) int local338 = local332 + (local141 & 0xFFFF);
			local127[local141] = (long) local338 + ((long) local151 << 32);
			this.aBoolean479 |= local288;
			this.aBoolean478 |= local149 != null && (local149.aByte119 != 0 || local149.aByte118 != 0);
		}
		Static123.method1869(local127, local22);
		this.anIntArray418 = arg1.anIntArray774;
		this.aShortArray74 = arg1.aShortArray166;
		this.anInt5614 = arg1.anInt9582;
		this.anIntArray415 = arg1.anIntArray764;
		this.anIntArray417 = arg1.anIntArray769;
		this.anInt5655 = arg1.anInt9589;
		@Pc(414) Class17[] local414 = new Class17[this.anInt5655];
		this.aClass143Array2 = arg1.aClass143Array5;
		this.aClass57Array2 = arg1.aClass57Array5;
		@Pc(442) int local442;
		@Pc(456) int local456;
		@Pc(499) int local499;
		if (arg1.aClass196Array1 != null) {
			this.anInt5676 = arg1.aClass196Array1.length;
			this.aClass152Array1 = new Class152[this.anInt5676];
			this.aClass297Array1 = new Class297[this.anInt5676];
			for (local442 = 0; local442 < this.anInt5676; local442++) {
				@Pc(449) Class196 local449 = arg1.aClass196Array1[local442];
				@Pc(454) Class255 local454 = Static415.method6340(local449.anInt4755);
				local456 = -1;
				for (@Pc(458) int local458 = 0; local458 < this.anInt5635; local458++) {
					if (local449.anInt4752 == local22[local458]) {
						local456 = local458;
						break;
					}
				}
				if (local456 == -1) {
					throw new RuntimeException();
				}
				local499 = Static643.anIntArray836[arg1.aShortArray170[local449.anInt4752] & 0xFFFF] & 0xFFFFFF;
				@Pc(516) int local516 = local499 | 255 - (arg1.aByteArray95 == null ? 0 : arg1.aByteArray95[local449.anInt4752]) << 24;
				this.aClass152Array1[local442] = new Class152(local456, arg1.aShortArray167[local449.anInt4752], arg1.aShortArray165[local449.anInt4752], arg1.aShortArray174[local449.anInt4752], local454.anInt6892, local454.anInt6891, local454.anInt6889, local454.anInt6893, local454.anInt6888, local454.aBoolean571, local454.aBoolean570, local449.anInt4754);
				this.aClass297Array1[local442] = new Class297(local516);
			}
		}
		local442 = this.anInt5635 * 3;
		this.aShortArray69 = new short[local442];
		this.aShortArray72 = new short[local442];
		this.aShort75 = (short) arg4;
		this.aFloatArray31 = new float[local442];
		this.aShort76 = (short) arg3;
		this.aShortArray68 = new short[this.anInt5635];
		this.aShortArray65 = new short[local442];
		this.aShortArray73 = new short[this.anInt5635];
		if (arg1.aShortArray172 != null) {
			this.lb = new short[this.anInt5635];
		}
		this.aShortArray67 = new short[local442];
		this.aShortArray75 = new short[local442];
		this.aShortArray66 = new short[local442];
		this.aShortArray64 = new short[this.anInt5635];
		this.aShortArray70 = new short[this.anInt5635];
		this.aFloatArray32 = new float[local442];
		this.aByteArray44 = new byte[this.anInt5635];
		this.aByteArray42 = new byte[local442];
		Static536.aLongArray14 = new long[local442];
		this.aShortArray71 = new short[this.anInt5635];
		local151 = 0;
		for (local332 = 0; local332 < arg1.anInt9589; local332++) {
			local456 = this.anIntArray414[local332];
			this.anIntArray414[local332] = local151;
			local151 += local456;
			local414[local332] = new Class17();
		}
		this.anIntArray414[arg1.anInt9589] = local151;
		@Pc(710) Class92 local710 = Static501.method8161(this.anInt5635, arg1, local22);
		@Pc(714) Class369[] local714 = new Class369[arg1.anInt9571];
		@Pc(755) int local755;
		@Pc(766) int local766;
		@Pc(777) int local777;
		@Pc(733) short local733;
		@Pc(744) int local744;
		for (local499 = 0; local499 < arg1.anInt9571; local499++) {
			@Pc(723) short local723 = arg1.aShortArray167[local499];
			@Pc(728) short local728 = arg1.aShortArray165[local499];
			local733 = arg1.aShortArray174[local499];
			local744 = this.anIntArray415[local728] - this.anIntArray415[local723];
			local755 = this.anIntArray418[local728] - this.anIntArray418[local723];
			local766 = this.anIntArray417[local728] - this.anIntArray417[local723];
			local777 = this.anIntArray415[local733] - this.anIntArray415[local723];
			@Pc(787) int local787 = this.anIntArray418[local733] - this.anIntArray418[local723];
			@Pc(797) int local797 = this.anIntArray417[local733] - this.anIntArray417[local723];
			@Pc(806) int local806 = local797 * local755 - local787 * local766;
			@Pc(815) int local815 = local777 * local766 - local797 * local744;
			@Pc(823) int local823 = local787 * local744 - local755 * local777;
			while (local806 > 8192 || local815 > 8192 || local823 > 8192 || local806 < -8192 || local815 < -8192 || local823 < -8192) {
				local806 >>= 0x1;
				local823 >>= 0x1;
				local815 >>= 0x1;
			}
			@Pc(872) int local872 = (int) Math.sqrt((double) (local823 * local823 + local815 * local815 + local806 * local806));
			if (local872 <= 0) {
				local872 = 1;
			}
			local815 = local815 * 256 / local872;
			local823 = local823 * 256 / local872;
			local806 = local806 * 256 / local872;
			@Pc(904) byte local904 = arg1.aByteArray97 == null ? 0 : arg1.aByteArray97[local499];
			if (local904 == 0) {
				@Pc(935) Class17 local935 = local414[local723];
				local935.anInt430 += local815;
				local935.anInt428 += local806;
				local935.anInt426 += local823;
				local935.anInt424++;
				@Pc(963) Class17 local963 = local414[local728];
				local963.anInt428 += local806;
				local963.anInt424++;
				local963.anInt430 += local815;
				local963.anInt426 += local823;
				@Pc(991) Class17 local991 = local414[local733];
				local991.anInt430 += local815;
				local991.anInt424++;
				local991.anInt428 += local806;
				local991.anInt426 += local823;
			} else if (local904 == 1) {
				@Pc(920) Class369 local920 = local714[local499] = new Class369();
				local920.anInt10046 = local806;
				local920.anInt10048 = local815;
				local920.anInt10047 = local823;
			}
		}
		@Pc(1028) int local1028;
		@Pc(1071) short local1071;
		for (local164 = 0; local164 < this.anInt5635; local164++) {
			local1028 = local22[local164];
			@Pc(1035) int local1035 = arg1.aShortArray170[local1028] & 0xFFFF;
			if (arg1.aByteArray91 == null) {
				local744 = -1;
			} else {
				local744 = arg1.aByteArray91[local1028];
			}
			if (arg1.aByteArray95 == null) {
				local755 = 0;
			} else {
				local755 = arg1.aByteArray95[local1028] & 0xFF;
			}
			local1071 = arg1.aShortArray171 == null ? -1 : arg1.aShortArray171[local1028];
			if (local1071 != -1 && (this.anInt5673 & 0x40) != 0) {
				@Pc(1086) Class321 local1086 = local11.method7813(local1071 & 0xFFFF);
				if (local1086.aBoolean724) {
					local1071 = -1;
				}
			}
			@Pc(1093) float local1093 = 0.0F;
			@Pc(1095) float local1095 = 0.0F;
			@Pc(1097) float local1097 = 0.0F;
			@Pc(1099) float local1099 = 0.0F;
			@Pc(1101) float local1101 = 0.0F;
			@Pc(1103) float local1103 = 0.0F;
			@Pc(1105) byte local1105 = 0;
			@Pc(1107) byte local1107 = 0;
			@Pc(1109) int local1109 = 0;
			@Pc(1125) byte local1125;
			@Pc(1145) short local1145;
			@Pc(1938) short local1938;
			@Pc(1943) short local1943;
			if (local1071 != -1) {
				if (local744 == -1) {
					local1095 = 1.0F;
					local1101 = 0.0F;
					local1103 = 0.0F;
					local1107 = 2;
					local1097 = 1.0F;
					local1105 = 1;
					local1099 = 1.0F;
					local1093 = 0.0F;
				} else {
					local744 &= 0xFF;
					local1125 = arg1.aByteArray92[local744];
					@Pc(1135) short local1135;
					@Pc(1140) short local1140;
					@Pc(1178) float local1178;
					@Pc(1402) float local1402;
					@Pc(1410) float local1410;
					@Pc(1509) float local1509;
					@Pc(1517) float local1517;
					@Pc(1525) float local1525;
					@Pc(1548) float local1548;
					@Pc(1571) float local1571;
					@Pc(1594) float local1594;
					if (local1125 == 0) {
						local1135 = arg1.aShortArray167[local1028];
						local1140 = arg1.aShortArray165[local1028];
						local1145 = arg1.aShortArray174[local1028];
						local1938 = arg1.aShortArray168[local744];
						local1943 = arg1.aShortArray169[local744];
						@Pc(1948) short local1948 = arg1.aShortArray173[local744];
						@Pc(1954) float local1954 = (float) arg1.anIntArray764[local1938];
						@Pc(1960) float local1960 = (float) arg1.anIntArray774[local1938];
						local1178 = (float) arg1.anIntArray769[local1938];
						local1402 = (float) arg1.anIntArray764[local1943] - local1954;
						local1410 = (float) arg1.anIntArray774[local1943] - local1960;
						@Pc(1990) float local1990 = (float) arg1.anIntArray769[local1943] - local1178;
						@Pc(1999) float local1999 = (float) arg1.anIntArray764[local1948] - local1954;
						@Pc(2007) float local2007 = (float) arg1.anIntArray774[local1948] - local1960;
						@Pc(2016) float local2016 = (float) arg1.anIntArray769[local1948] - local1178;
						@Pc(2024) float local2024 = (float) arg1.anIntArray764[local1135] - local1954;
						@Pc(2032) float local2032 = (float) arg1.anIntArray774[local1135] - local1960;
						@Pc(2040) float local2040 = (float) arg1.anIntArray769[local1135] - local1178;
						@Pc(2048) float local2048 = (float) arg1.anIntArray764[local1140] - local1954;
						@Pc(2057) float local2057 = (float) arg1.anIntArray774[local1140] - local1960;
						local1509 = (float) arg1.anIntArray769[local1140] - local1178;
						local1517 = (float) arg1.anIntArray764[local1145] - local1954;
						local1525 = (float) arg1.anIntArray774[local1145] - local1960;
						local1548 = (float) arg1.anIntArray769[local1145] - local1178;
						local1571 = local2016 * local1410 - local1990 * local2007;
						local1594 = local1990 * local1999 - local2016 * local1402;
						@Pc(2116) float local2116 = local1402 * local2007 - local1999 * local1410;
						@Pc(2124) float local2124 = local2007 * local2116 - local2016 * local1594;
						@Pc(2132) float local2132 = local1571 * local2016 - local2116 * local1999;
						@Pc(2140) float local2140 = local1594 * local1999 - local2007 * local1571;
						@Pc(2154) float local2154 = 1.0F / (local2140 * local1990 + local1402 * local2124 + local2132 * local1410);
						local1101 = local2154 * (local2140 * local1548 + local1525 * local2132 + local1517 * local2124);
						local1097 = (local1509 * local2140 + local2124 * local2048 + local2132 * local2057) * local2154;
						local1093 = local2154 * (local2132 * local2032 + local2024 * local2124 + local2140 * local2040);
						@Pc(2204) float local2204 = local1402 * local1594 - local1571 * local1410;
						@Pc(2212) float local2212 = local2116 * local1410 - local1990 * local1594;
						@Pc(2221) float local2221 = local1571 * local1990 - local1402 * local2116;
						@Pc(2235) float local2235 = 1.0F / (local1999 * local2212 + local2007 * local2221 + local2016 * local2204);
						local1099 = local2235 * (local2204 * local1509 + local2212 * local2048 + local2221 * local2057);
						local1103 = local2235 * (local2204 * local1548 + local1517 * local2212 + local2221 * local1525);
						local1095 = (local2212 * local2024 + local2032 * local2221 + local2040 * local2204) * local2235;
					} else {
						local1135 = arg1.aShortArray167[local1028];
						local1140 = arg1.aShortArray165[local1028];
						local1145 = arg1.aShortArray174[local1028];
						@Pc(1150) int local1150 = local710.anIntArray165[local744];
						@Pc(1155) int local1155 = local710.anIntArray164[local744];
						@Pc(1160) int local1160 = local710.anIntArray167[local744];
						@Pc(1165) float[] local1165 = local710.aFloatArrayArray1[local744];
						@Pc(1170) byte local1170 = arg1.aByteArray93[local744];
						local1178 = (float) arg1.anIntArray770[local744] / 256.0F;
						if (local1125 == 1) {
							local1402 = (float) arg1.anIntArray763[local744] / 1024.0F;
							Static20.method458(arg1.anIntArray769[local1135], Static417.aFloatArray61, local1170, arg1.anIntArray764[local1135], local1155, local1178, local1165, local1402, local1150, arg1.anIntArray774[local1135], local1160);
							local1095 = Static417.aFloatArray61[1];
							local1093 = Static417.aFloatArray61[0];
							Static20.method458(arg1.anIntArray769[local1140], Static417.aFloatArray61, local1170, arg1.anIntArray764[local1140], local1155, local1178, local1165, local1402, local1150, arg1.anIntArray774[local1140], local1160);
							local1099 = Static417.aFloatArray61[1];
							local1097 = Static417.aFloatArray61[0];
							Static20.method458(arg1.anIntArray769[local1145], Static417.aFloatArray61, local1170, arg1.anIntArray764[local1145], local1155, local1178, local1165, local1402, local1150, arg1.anIntArray774[local1145], local1160);
							local1103 = Static417.aFloatArray61[1];
							local1101 = Static417.aFloatArray61[0];
							local1410 = local1402 / 2.0F;
							if ((local1170 & 0x1) == 0) {
								if (local1097 - local1093 > local1410) {
									local1105 = 1;
									local1097 -= local1402;
								} else if (local1410 < local1093 - local1097) {
									local1105 = 2;
									local1097 += local1402;
								}
								if (local1101 - local1093 > local1410) {
									local1107 = 1;
									local1101 -= local1402;
								} else if (local1410 < local1093 - local1101) {
									local1101 += local1402;
									local1107 = 2;
								}
							} else {
								if (local1410 < local1103 - local1095) {
									local1103 -= local1402;
									local1107 = 1;
								} else if (local1410 < local1095 - local1103) {
									local1103 += local1402;
									local1107 = 2;
								}
								if (local1099 - local1095 > local1410) {
									local1099 -= local1402;
									local1105 = 1;
								} else if (local1410 < local1095 - local1099) {
									local1105 = 2;
									local1099 += local1402;
								}
							}
						} else if (local1125 == 2) {
							local1402 = (float) arg1.anIntArray767[local744] / 256.0F;
							local1410 = (float) arg1.anIntArray768[local744] / 256.0F;
							@Pc(1421) int local1421 = arg1.anIntArray764[local1140] - arg1.anIntArray764[local1135];
							@Pc(1431) int local1431 = arg1.anIntArray774[local1140] - arg1.anIntArray774[local1135];
							@Pc(1442) int local1442 = arg1.anIntArray769[local1140] - arg1.anIntArray769[local1135];
							@Pc(1453) int local1453 = arg1.anIntArray764[local1145] - arg1.anIntArray764[local1135];
							@Pc(1464) int local1464 = arg1.anIntArray774[local1145] - arg1.anIntArray774[local1135];
							@Pc(1475) int local1475 = arg1.anIntArray769[local1145] - arg1.anIntArray769[local1135];
							@Pc(1484) int local1484 = local1475 * local1431 - local1442 * local1464;
							@Pc(1492) int local1492 = local1453 * local1442 - local1475 * local1421;
							@Pc(1501) int local1501 = local1421 * local1464 - local1431 * local1453;
							local1509 = 64.0F / (float) arg1.anIntArray772[local744];
							local1517 = 64.0F / (float) arg1.anIntArray765[local744];
							local1525 = 64.0F / (float) arg1.anIntArray763[local744];
							local1548 = (local1165[2] * (float) local1501 + (float) local1492 * local1165[1] + (float) local1484 * local1165[0]) / local1509;
							local1571 = (local1165[5] * (float) local1501 + local1165[4] * (float) local1492 + local1165[3] * (float) local1484) / local1517;
							local1594 = (local1165[6] * (float) local1484 + local1165[7] * (float) local1492 + (float) local1501 * local1165[8]) / local1525;
							local1109 = Static240.method3663(local1548, local1571, local1594);
							Static144.method2154(local1410, local1150, arg1.anIntArray769[local1135], local1160, local1402, local1155, arg1.anIntArray764[local1135], arg1.anIntArray774[local1135], local1178, local1170, Static417.aFloatArray61, local1165, local1109);
							local1095 = Static417.aFloatArray61[1];
							local1093 = Static417.aFloatArray61[0];
							Static144.method2154(local1410, local1150, arg1.anIntArray769[local1140], local1160, local1402, local1155, arg1.anIntArray764[local1140], arg1.anIntArray774[local1140], local1178, local1170, Static417.aFloatArray61, local1165, local1109);
							local1099 = Static417.aFloatArray61[1];
							local1097 = Static417.aFloatArray61[0];
							Static144.method2154(local1410, local1150, arg1.anIntArray769[local1145], local1160, local1402, local1155, arg1.anIntArray764[local1145], arg1.anIntArray774[local1145], local1178, local1170, Static417.aFloatArray61, local1165, local1109);
							local1103 = Static417.aFloatArray61[1];
							local1101 = Static417.aFloatArray61[0];
						} else if (local1125 == 3) {
							Static324.method5026(local1170, arg1.anIntArray774[local1135], Static417.aFloatArray61, local1178, local1155, arg1.anIntArray769[local1135], arg1.anIntArray764[local1135], local1150, local1160, local1165);
							local1095 = Static417.aFloatArray61[1];
							local1093 = Static417.aFloatArray61[0];
							Static324.method5026(local1170, arg1.anIntArray774[local1140], Static417.aFloatArray61, local1178, local1155, arg1.anIntArray769[local1140], arg1.anIntArray764[local1140], local1150, local1160, local1165);
							local1099 = Static417.aFloatArray61[1];
							local1097 = Static417.aFloatArray61[0];
							Static324.method5026(local1170, arg1.anIntArray774[local1145], Static417.aFloatArray61, local1178, local1155, arg1.anIntArray769[local1145], arg1.anIntArray764[local1145], local1150, local1160, local1165);
							local1103 = Static417.aFloatArray61[1];
							local1101 = Static417.aFloatArray61[0];
							if ((local1170 & 0x1) == 0) {
								if (local1101 - local1093 > 0.5F) {
									local1101--;
									local1107 = 1;
								} else if (local1093 - local1101 > 0.5F) {
									local1101++;
									local1107 = 2;
								}
								if (local1097 - local1093 > 0.5F) {
									local1105 = 1;
									local1097--;
								} else if (local1093 - local1097 > 0.5F) {
									local1105 = 2;
									local1097++;
								}
							} else {
								if (local1099 - local1095 > 0.5F) {
									local1099--;
									local1105 = 1;
								} else if (local1095 - local1099 > 0.5F) {
									local1105 = 2;
									local1099++;
								}
								if (local1103 - local1095 > 0.5F) {
									local1103--;
									local1107 = 1;
								} else if (local1095 - local1103 > 0.5F) {
									local1107 = 2;
									local1103++;
								}
							}
						}
					}
				}
			}
			if (arg1.aByteArray97 == null) {
				local1125 = 0;
			} else {
				local1125 = arg1.aByteArray97[local1028];
			}
			if (local1125 == 0) {
				@Pc(2457) long local2457 = ((long) local755 + (long) (local1035 << 8) + (long) (local1109 << 24) << 32) + (long) (local744 << 2);
				local1145 = arg1.aShortArray167[local1028];
				local1938 = arg1.aShortArray165[local1028];
				local1943 = arg1.aShortArray174[local1028];
				@Pc(2476) Class17 local2476 = local414[local1145];
				this.aShortArray68[local164] = this.method5071(local2476.anInt424, arg1, local164, local2476.anInt428, local1093, local1095, local2457, local2476.anInt426, local2476.anInt430, local1145);
				@Pc(2501) Class17 local2501 = local414[local1938];
				this.aShortArray64[local164] = this.method5071(local2501.anInt424, arg1, local164, local2501.anInt428, local1097, local1099, local2457 + (long) local1105, local2501.anInt426, local2501.anInt430, local1938);
				@Pc(2529) Class17 local2529 = local414[local1943];
				this.aShortArray71[local164] = this.method5071(local2529.anInt424, arg1, local164, local2529.anInt428, local1101, local1103, (long) local1107 + local2457, local2529.anInt426, local2529.anInt430, local1943);
			} else if (local1125 == 1) {
				@Pc(2318) Class369 local2318 = local714[local1028];
				@Pc(2360) long local2360 = (long) ((local2318.anInt10047 + 256 << 22) + (local2318.anInt10048 + 256 << 12) + (local744 << 2) + (local2318.anInt10046 > 0 ? 1024 : 2048)) + ((long) local755 + (long) (local1035 << 8) + (long) (local1109 << 24) << 32);
				this.aShortArray68[local164] = this.method5071(0, arg1, local164, local2318.anInt10046, local1093, local1095, local2360, local2318.anInt10047, local2318.anInt10048, arg1.aShortArray167[local1028]);
				this.aShortArray64[local164] = this.method5071(0, arg1, local164, local2318.anInt10046, local1097, local1099, (long) local1105 + local2360, local2318.anInt10047, local2318.anInt10048, arg1.aShortArray165[local1028]);
				this.aShortArray71[local164] = this.method5071(0, arg1, local164, local2318.anInt10046, local1101, local1103, (long) local1107 + local2360, local2318.anInt10047, local2318.anInt10048, arg1.aShortArray174[local1028]);
			}
			if (arg1.aByteArray95 != null) {
				this.aByteArray44[local164] = arg1.aByteArray95[local1028];
			}
			if (arg1.aShortArray172 != null) {
				this.lb[local164] = arg1.aShortArray172[local1028];
			}
			this.aShortArray70[local164] = arg1.aShortArray170[local1028];
			this.aShortArray73[local164] = local1071;
		}
		if (this.anInt5663 > 0) {
			local1028 = 1;
			local733 = this.aShortArray73[0];
			for (local744 = 0; local744 < this.anInt5663; local744++) {
				@Pc(2612) short local2612 = this.aShortArray73[local744];
				if (local2612 != local733) {
					local1028++;
					local733 = local2612;
				}
			}
			this.anIntArray419 = new int[local1028];
			this.anIntArray416 = new int[local1028 + 1];
			this.anIntArray420 = new int[local1028];
			this.anIntArray416[0] = 0;
			local755 = this.anInt5675;
			local1071 = 0;
			local733 = this.aShortArray73[0];
			local1028 = 0;
			for (local777 = 0; local777 < this.anInt5663; local777++) {
				@Pc(2671) short local2671 = this.aShortArray73[local777];
				if (local2671 != local733) {
					this.anIntArray419[local1028] = local755;
					this.anIntArray420[local1028] = local1071 + 1 - local755;
					local1028++;
					this.anIntArray416[local1028] = local777;
					local733 = local2671;
					local1071 = 0;
					local755 = this.anInt5675;
				}
				@Pc(2706) short local2706 = this.aShortArray68[local777];
				if (local2706 < local755) {
					local755 = local2706;
				}
				if (local1071 < local2706) {
					local1071 = local2706;
				}
				local2706 = this.aShortArray64[local777];
				if (local1071 < local2706) {
					local1071 = local2706;
				}
				if (local755 > local2706) {
					local755 = local2706;
				}
				local2706 = this.aShortArray71[local777];
				if (local2706 < local755) {
					local755 = local2706;
				}
				if (local2706 > local1071) {
					local1071 = local2706;
				}
			}
			this.anIntArray419[local1028] = local755;
			this.anIntArray420[local1028] = local1071 + 1 - local755;
			local1028++;
			this.anIntArray416[local1028] = this.anInt5663;
		}
		Static536.aLongArray14 = null;
		this.aShortArray66 = Static75.method1235(this.aShortArray66, this.anInt5675);
		this.aShortArray69 = Static75.method1235(this.aShortArray69, this.anInt5675);
		this.aShortArray72 = Static75.method1235(this.aShortArray72, this.anInt5675);
		this.aShortArray65 = Static75.method1235(this.aShortArray65, this.anInt5675);
		this.aShortArray67 = Static75.method1235(this.aShortArray67, this.anInt5675);
		this.aByteArray42 = Static67.method1111(this.anInt5675, this.aByteArray42);
		this.aFloatArray32 = Static97.method1450(this.aFloatArray32, this.anInt5675);
		this.aFloatArray31 = Static97.method1450(this.aFloatArray31, this.anInt5675);
		if (arg1.anIntArray771 != null && Static1.method5725(this.anInt5673, arg2)) {
			this.anIntArrayArray26 = arg1.method8219(false);
		}
		if (arg1.aClass196Array1 != null && Static98.method3778(this.anInt5673, arg2)) {
			this.anIntArrayArray25 = arg1.method8221();
		}
		if (arg1.anIntArray766 != null && Static511.method7385(this.anInt5673, arg2)) {
			local1028 = 0;
			@Pc(2893) int[] local2893 = new int[256];
			for (local744 = 0; local744 < this.anInt5635; local744++) {
				local755 = arg1.anIntArray766[local22[local744]];
				if (local755 >= 0) {
					if (local755 > local1028) {
						local1028 = local755;
					}
					@Pc(2922) int local2922 = local2893[local755]++;
				}
			}
			this.anIntArrayArray24 = new int[local1028 + 1][];
			for (local755 = 0; local755 <= local1028; local755++) {
				this.anIntArrayArray24[local755] = new int[local2893[local755]];
				local2893[local755] = 0;
			}
			for (local766 = 0; local766 < this.anInt5635; local766++) {
				local777 = arg1.anIntArray766[local22[local766]];
				if (local777 >= 0) {
					this.anIntArrayArray24[local777][local2893[local777]++] = local766;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lclient!rv;IIZZ)V")
	public Class180_Sub1(@OriginalArg(0) Class126_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt5614 = 0;
		this.aBoolean478 = false;
		this.anInt5635 = 0;
		this.aBoolean479 = false;
		this.anInt5655 = 0;
		this.aBoolean480 = false;
		this.anInt5663 = 0;
		this.anInt5675 = 0;
		this.aBoolean481 = false;
		this.aBoolean477 = true;
		this.anInt5624 = arg1;
		this.anInt5673 = arg2;
		this.aClass126_Sub2_12 = arg0;
		this.aBoolean481 = arg4;
		if (arg3 || Static120.method8608(this.anInt5624, this.anInt5673)) {
			this.aClass344_4 = new Class344(Static89.method1391(this.anInt5624, this.anInt5673));
		}
		if (arg3 || Static420.method6383(this.anInt5673, this.anInt5624)) {
			this.aClass344_3 = new Class344(Static438.method6522(this.anInt5624, this.anInt5673));
		}
		if (arg3 || Static387.method5966(this.anInt5624, this.anInt5673)) {
			this.aClass344_2 = new Class344(Static130.method1926(this.anInt5673, this.anInt5624));
		}
		if (arg3 || Static187.method3002(this.anInt5673, this.anInt5624)) {
			this.aClass344_1 = new Class344(Static386.method5963(this.anInt5673, this.anInt5624));
		}
		if (arg3 || Static75.method1234(this.anInt5624, this.anInt5673)) {
			this.aClass113_1 = new Class113(Static153.method2232(this.anInt5673, this.anInt5624));
		}
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)V")
	private void method5059() {
		if (this.anInt5663 == 0) {
			return;
		}
		if (this.method5064() && this.method5079()) {
			this.aClass126_Sub2_12.method5451(0, this.aClass344_4.anInterface1_16);
			this.aClass126_Sub2_12.method5451(1, this.aClass344_2.anInterface1_16);
			this.aClass126_Sub2_12.method5451(2, this.aClass344_3.anInterface1_16);
			@Pc(57) boolean local57;
			if ((this.anInt5673 & 0x37) == 0) {
				this.aClass126_Sub2_12.method5443(false);
				local57 = false;
				this.aClass126_Sub2_12.method5524(this.aClass126_Sub2_12.aClass203_19);
			} else {
				this.aClass126_Sub2_12.method5443(true);
				local57 = true;
				this.aClass126_Sub2_12.method5451(3, this.aClass344_1.anInterface1_16);
				this.aClass126_Sub2_12.method5524(this.aClass126_Sub2_12.aClass203_18);
			}
			for (@Pc(90) int local90 = 0; local90 < this.anIntArray419.length; local90++) {
				@Pc(97) int local97 = this.anIntArray416[local90];
				@Pc(104) int local104 = this.anIntArray416[local90 + 1];
				@Pc(111) int local111 = this.aShortArray73[local97] & 0xFFFF;
				if (local111 == 65535) {
					local111 = -1;
				}
				this.aClass126_Sub2_12.method5482(local111, true, local57);
				this.aClass126_Sub2_12.method5526(this.aClass113_1.anInterface21_3, Static370.aClass23_7, local104 - local97, local97 * 3, this.anIntArray420[local90], this.anIntArray419[local90]);
			}
		}
		this.method5078();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BIZ)Lclient!ka;")
	@Override
	public Class180 method7945(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(20) Class180_Sub1 local20;
		@Pc(24) Class180_Sub1 local24;
		if (arg0 == 1) {
			local20 = this.aClass126_Sub2_12.aClass180_Sub1_25;
			local24 = this.aClass126_Sub2_12.aClass180_Sub1_28;
		} else if (arg0 == 2) {
			local24 = this.aClass126_Sub2_12.aClass180_Sub1_27;
			local20 = this.aClass126_Sub2_12.aClass180_Sub1_24;
		} else if (arg0 == 3) {
			local20 = this.aClass126_Sub2_12.aClass180_Sub1_30;
			local24 = this.aClass126_Sub2_12.aClass180_Sub1_22;
		} else if (arg0 == 4) {
			local20 = this.aClass126_Sub2_12.aClass180_Sub1_26;
			local24 = this.aClass126_Sub2_12.aClass180_Sub1_21;
		} else if (arg0 == 5) {
			local20 = this.aClass126_Sub2_12.aClass180_Sub1_23;
			local24 = this.aClass126_Sub2_12.aClass180_Sub1_29;
		} else {
			local20 = local24 = new Class180_Sub1(this.aClass126_Sub2_12, 0, 0, true, false);
		}
		return this.method5063(local24, arg2, arg1, arg0 != 0, local20);
	}

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "()Z")
	@Override
	public boolean F() {
		return this.aBoolean479;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;I)V")
	@Override
	public void method7949(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (this.anInt5675 == 0) {
			return;
		}
		@Pc(13) Class117_Sub2 local13 = this.aClass126_Sub2_12.aClass117_Sub2_16;
		if (!this.aBoolean480) {
			this.method5067();
		}
		@Pc(22) Class117_Sub2 local22 = (Class117_Sub2) arg0;
		Static539.aFloat191 = local22.aFloat57 * local13.aFloat58 + local13.aFloat55 * local22.aFloat59 + local13.aFloat60 * local22.aFloat58;
		Static410.aFloat145 = local13.aFloat55 * local22.aFloat56 + local22.aFloat52 * local13.aFloat58 + local22.aFloat49 * local13.aFloat60 + local13.aFloat49;
		@Pc(69) float local69 = (float) this.anInt5678 * Static539.aFloat191 + Static410.aFloat145;
		@Pc(77) float local77 = Static539.aFloat191 * (float) this.anInt5644 + Static410.aFloat145;
		@Pc(87) float local87;
		@Pc(93) float local93;
		if (local77 < local69) {
			local87 = local77 - (float) this.anInt5613;
			local93 = (float) this.anInt5613 + local69;
		} else {
			local93 = local77 + (float) this.anInt5613;
			local87 = local69 - (float) this.anInt5613;
		}
		if (this.aClass126_Sub2_12.aFloat125 <= local87 || local93 <= (float) this.aClass126_Sub2_12.anInt6259) {
			return;
		}
		Static228.aFloat46 = local22.aFloat59 * local13.aFloat50 + local22.aFloat57 * local13.aFloat59 + local22.aFloat58 * local13.aFloat54;
		Static511.aFloat189 = local13.aFloat54 * local22.aFloat49 + local22.aFloat52 * local13.aFloat59 + local13.aFloat50 * local22.aFloat56 + local13.aFloat56;
		@Pc(169) float local169 = Static228.aFloat46 * (float) this.anInt5678 + Static511.aFloat189;
		@Pc(177) float local177 = Static228.aFloat46 * (float) this.anInt5644 + Static511.aFloat189;
		@Pc(204) float local204;
		@Pc(192) float local192;
		if (local169 > local177) {
			local192 = ((float) this.anInt5613 + local169) * (float) this.aClass126_Sub2_12.anInt6268;
			local204 = (local177 - (float) this.anInt5613) * (float) this.aClass126_Sub2_12.anInt6268;
		} else {
			local192 = ((float) this.anInt5613 + local177) * (float) this.aClass126_Sub2_12.anInt6268;
			local204 = ((float) -this.anInt5613 + local169) * (float) this.aClass126_Sub2_12.anInt6268;
		}
		if (local204 / local93 >= this.aClass126_Sub2_12.aFloat124 || this.aClass126_Sub2_12.aFloat128 >= local192 / local93) {
			return;
		}
		Static18.aFloat7 = local13.aFloat52 + local13.aFloat53 * local22.aFloat49 + local22.aFloat56 * local13.aFloat51 + local22.aFloat52 * local13.aFloat57;
		Static580.aFloat204 = local13.aFloat51 * local22.aFloat59 + local22.aFloat57 * local13.aFloat57 + local22.aFloat58 * local13.aFloat53;
		@Pc(293) float local293 = (float) this.anInt5678 * Static580.aFloat204 + Static18.aFloat7;
		@Pc(301) float local301 = (float) this.anInt5644 * Static580.aFloat204 + Static18.aFloat7;
		@Pc(316) float local316;
		@Pc(327) float local327;
		if (local293 > local301) {
			local316 = (local301 - (float) this.anInt5613) * (float) this.aClass126_Sub2_12.anInt6287;
			local327 = (local293 + (float) this.anInt5613) * (float) this.aClass126_Sub2_12.anInt6287;
		} else {
			local327 = (local301 + (float) this.anInt5613) * (float) this.aClass126_Sub2_12.anInt6287;
			local316 = (float) this.aClass126_Sub2_12.anInt6287 * (local293 - (float) this.anInt5613);
		}
		if (this.aClass126_Sub2_12.aFloat118 <= local316 / local93 || local327 / local93 <= this.aClass126_Sub2_12.aFloat117) {
			return;
		}
		if (arg1 != null || this.aClass152Array1 != null) {
			Static194.aFloat42 = local22.aFloat55 * local13.aFloat60 + local22.aFloat51 * local13.aFloat58 + local22.aFloat50 * local13.aFloat55;
			Static348.aFloat114 = local22.aFloat60 * local13.aFloat53 + local13.aFloat51 * local22.aFloat54 + local22.aFloat53 * local13.aFloat57;
			Static293.aFloat71 = local22.aFloat51 * local13.aFloat59 + local22.aFloat50 * local13.aFloat50 + local22.aFloat55 * local13.aFloat54;
			Static310.aFloat110 = local13.aFloat53 * local22.aFloat55 + local13.aFloat57 * local22.aFloat51 + local13.aFloat51 * local22.aFloat50;
			Static161.aFloat25 = local13.aFloat60 * local22.aFloat60 + local22.aFloat53 * local13.aFloat58 + local22.aFloat54 * local13.aFloat55;
			Static173.aFloat39 = local13.aFloat59 * local22.aFloat53 + local13.aFloat50 * local22.aFloat54 + local22.aFloat60 * local13.aFloat54;
		}
		if (arg1 != null) {
			@Pc(486) boolean local486 = false;
			@Pc(488) boolean local488 = true;
			@Pc(496) int local496 = this.anInt5685 + this.anInt5690 >> 1;
			@Pc(504) int local504 = this.anInt5633 + this.anInt5615 >> 1;
			@Pc(523) int local523 = (int) ((float) local504 * Static173.aFloat39 + Static228.aFloat46 * (float) this.anInt5678 + (float) local496 * Static293.aFloat71 + Static511.aFloat189);
			@Pc(542) int local542 = (int) (Static18.aFloat7 + (float) local496 * Static310.aFloat110 + Static580.aFloat204 * (float) this.anInt5678 + (float) local504 * Static348.aFloat114);
			@Pc(561) int local561 = (int) ((float) local504 * Static161.aFloat25 + Static539.aFloat191 * (float) this.anInt5678 + Static410.aFloat145 + (float) local496 * Static194.aFloat42);
			if (this.aClass126_Sub2_12.anInt6259 <= local561) {
				arg1.anInt9898 = this.aClass126_Sub2_12.anInt6288 + local523 * this.aClass126_Sub2_12.anInt6268 / local561;
				arg1.anInt9897 = this.aClass126_Sub2_12.anInt6257 + local542 * this.aClass126_Sub2_12.anInt6287 / local561;
			} else {
				local486 = true;
			}
			@Pc(619) int local619 = (int) (Static511.aFloat189 + (float) local496 * Static293.aFloat71 + (float) this.anInt5644 * Static228.aFloat46 + (float) local504 * Static173.aFloat39);
			@Pc(638) int local638 = (int) ((float) this.anInt5644 * Static580.aFloat204 + Static18.aFloat7 + Static310.aFloat110 * (float) local496 + Static348.aFloat114 * (float) local504);
			@Pc(657) int local657 = (int) ((float) local504 * Static161.aFloat25 + Static194.aFloat42 * (float) local496 + Static410.aFloat145 + Static539.aFloat191 * (float) this.anInt5644);
			if (this.aClass126_Sub2_12.anInt6259 > local657) {
				local486 = true;
			} else {
				arg1.anInt9896 = this.aClass126_Sub2_12.anInt6288 + this.aClass126_Sub2_12.anInt6268 * local619 / local657;
				arg1.anInt9894 = this.aClass126_Sub2_12.anInt6287 * local638 / local657 + this.aClass126_Sub2_12.anInt6257;
			}
			if (local486) {
				if (local561 < this.aClass126_Sub2_12.anInt6259 && local657 < this.aClass126_Sub2_12.anInt6259) {
					local488 = false;
				} else {
					@Pc(744) int local744;
					@Pc(754) int local754;
					@Pc(765) int local765;
					if (local561 < this.aClass126_Sub2_12.anInt6259) {
						local744 = (local657 - this.aClass126_Sub2_12.anInt6259 << 16) / (local657 - local561);
						local754 = (local744 * (local619 - local523) >> 16) + local619;
						arg1.anInt9898 = local754 * this.aClass126_Sub2_12.anInt6268 / this.aClass126_Sub2_12.anInt6259 + this.aClass126_Sub2_12.anInt6288;
						local765 = (local744 * (local638 - local542) >> 16) + local638;
						arg1.anInt9897 = this.aClass126_Sub2_12.anInt6257 + this.aClass126_Sub2_12.anInt6287 * local765 / this.aClass126_Sub2_12.anInt6259;
					} else if (this.aClass126_Sub2_12.anInt6259 > local657) {
						local744 = (local561 - this.aClass126_Sub2_12.anInt6259 << 16) / (local561 - local657);
						local754 = ((local523 - local619) * local744 >> 16) + local523;
						local765 = ((local542 - local638) * local744 >> 16) + local542;
						arg1.anInt9898 = local754 * this.aClass126_Sub2_12.anInt6268 / this.aClass126_Sub2_12.anInt6259 + this.aClass126_Sub2_12.anInt6288;
						arg1.anInt9897 = this.aClass126_Sub2_12.anInt6287 * local765 / this.aClass126_Sub2_12.anInt6259 + this.aClass126_Sub2_12.anInt6257;
					}
				}
			}
			if (local488) {
				if (local561 <= local657) {
					arg1.anInt9895 = this.aClass126_Sub2_12.anInt6288 + this.aClass126_Sub2_12.anInt6268 * (this.anInt5613 + local619) / local657 - arg1.anInt9896;
				} else {
					arg1.anInt9895 = (local523 + this.anInt5613) * this.aClass126_Sub2_12.anInt6268 / local561 + this.aClass126_Sub2_12.anInt6288 - arg1.anInt9898;
				}
				arg1.aBoolean809 = true;
			}
		}
		this.aClass126_Sub2_12.method5570();
		this.aClass126_Sub2_12.method5465(local22);
		this.method5059();
		this.method5070();
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V")
	private void method5060() {
		if ((this.anInt5673 & 0x37) == 0) {
			if (this.aClass344_2 == null) {
				return;
			}
			this.aClass344_2.aBoolean766 = false;
		} else if (this.aClass344_1 != null) {
			this.aClass344_1.aBoolean766 = false;
			return;
		}
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V")
	private void method5061() {
		if (this.aClass344_2 != null) {
			this.aClass344_2.aBoolean766 = false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "()Z")
	@Override
	public boolean method7931() {
		if (this.aShortArray73 == null) {
			return true;
		}
		for (@Pc(12) int local12 = 0; local12 < this.aShortArray73.length; local12++) {
			if (this.aShortArray73[local12] != -1 && !this.aClass126_Sub2_12.anInterface8_10.method7811(this.aShortArray73[local12])) {
				return false;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "aa", descriptor = "(SS)V")
	@Override
	public void aa(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		@Pc(9) Interface8 local9 = this.aClass126_Sub2_12.anInterface8_10;
		for (@Pc(11) int local11 = 0; local11 < this.anInt5635; local11++) {
			if (arg0 == this.aShortArray73[local11]) {
				this.aShortArray73[local11] = arg1;
			}
		}
		@Pc(31) byte local31 = 0;
		@Pc(33) byte local33 = 0;
		if (arg0 != -1) {
			@Pc(43) Class321 local43 = local9.method7813(arg0 & 0xFFFF);
			local33 = local43.aByte116;
			local31 = local43.aByte117;
		}
		@Pc(51) byte local51 = 0;
		@Pc(53) byte local53 = 0;
		if (arg1 != -1) {
			@Pc(64) Class321 local64 = local9.method7813(arg1 & 0xFFFF);
			local51 = local64.aByte117;
			if (local64.aByte119 != 0 || local64.aByte118 != 0) {
				this.aBoolean478 = true;
			}
			local53 = local64.aByte116;
		}
		if (!(local51 != local31 | local53 != local33)) {
			return;
		}
		if (this.aClass152Array1 != null) {
			for (@Pc(101) int local101 = 0; local101 < this.anInt5676; local101++) {
				@Pc(108) Class152 local108 = this.aClass152Array1[local101];
				@Pc(113) Class297 local113 = this.aClass297Array1[local101];
				local113.anInt8027 = Static643.anIntArray836[this.aShortArray70[local108.anInt3959] & 0xFFFF] & 0xFFFFFF | local113.anInt8027 & 0xFF000000;
			}
		}
		this.method5061();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7942(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) int local12;
		for (@Pc(3) int local3 = 0; local3 < this.anInt5635; local3++) {
			local12 = this.aShortArray70[local3] & 0xFFFF;
			@Pc(18) int local18 = local12 >> 10 & 0x3F;
			@Pc(24) int local24 = local12 >> 7 & 0x7;
			if (arg1 != -1) {
				local24 += (arg1 - local24) * arg3 >> 7;
			}
			if (arg0 != -1) {
				local18 += arg3 * (arg0 - local18) >> 7;
			}
			@Pc(55) int local55 = local12 & 0x7F;
			if (arg2 != -1) {
				local55 += (arg2 - local55) * arg3 >> 7;
			}
			this.aShortArray70[local3] = (short) (local55 | local18 << 10 | local24 << 7);
		}
		if (this.aClass152Array1 != null) {
			for (local12 = 0; local12 < this.anInt5676; local12++) {
				@Pc(105) Class152 local105 = this.aClass152Array1[local12];
				@Pc(110) Class297 local110 = this.aClass297Array1[local12];
				local110.anInt8027 = Static643.anIntArray836[this.aShortArray70[local105.anInt3959] & 0xFFFF] & 0xFFFFFF | local110.anInt8027 & 0xFF000000;
			}
		}
		this.method5061();
	}

	@OriginalMember(owner = "client!lj", name = "ua", descriptor = "()I")
	@Override
	public int ua() {
		return this.anInt5624;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "()V")
	@Override
	public void method7944() {
		if (this.anInt5675 > 0 && this.anInt5663 > 0) {
			this.method5064();
			this.method5079();
			this.method5078();
		}
	}

	@OriginalMember(owner = "client!lj", name = "r", descriptor = "()Z")
	@Override
	public boolean r() {
		return this.aBoolean478;
	}

	@OriginalMember(owner = "client!lj", name = "fa", descriptor = "()I")
	@Override
	public int fa() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5678;
	}

	@OriginalMember(owner = "client!lj", name = "V", descriptor = "()I")
	@Override
	public int V() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5690;
	}

	@OriginalMember(owner = "client!lj", name = "v", descriptor = "()V")
	@Override
	public void v() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5655; local7++) {
			this.anIntArray417[local7] = -this.anIntArray417[local7];
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt5675; local29++) {
			this.aShortArray67[local29] = (short) -this.aShortArray67[local29];
		}
		for (@Pc(48) int local48 = 0; local48 < this.anInt5635; local48++) {
			@Pc(55) short local55 = this.aShortArray68[local48];
			this.aShortArray68[local48] = this.aShortArray71[local48];
			this.aShortArray71[local48] = local55;
		}
		this.method5077();
		this.method5060();
		this.method5069();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "()[Lclient!hi;")
	@Override
	public Class143[] method7935() {
		return this.aClass143Array2;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!lj;ZIBZLclient!lj;)Lclient!ka;")
	private Class180 method5063(@OriginalArg(0) Class180_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class180_Sub1 arg4) {
		arg4.anInt5624 = arg2;
		arg4.aBoolean478 = this.aBoolean478;
		arg4.anInt5676 = this.anInt5676;
		arg4.anInt5655 = this.anInt5655;
		arg4.anInt5675 = this.anInt5675;
		arg4.anInt5635 = this.anInt5635;
		if ((arg2 & 0x100) == 0) {
			arg4.aBoolean479 = this.aBoolean479;
		} else {
			arg4.aBoolean479 = true;
		}
		arg4.anInt5614 = this.anInt5614;
		arg4.aShort75 = this.aShort75;
		arg4.aShort76 = this.aShort76;
		arg4.anInt5673 = this.anInt5673;
		arg4.anInt5663 = this.anInt5663;
		@Pc(67) boolean local67 = Static334.method5163(this.anInt5673, arg2);
		@Pc(73) boolean local73 = Static191.method3042(this.anInt5673, arg2);
		@Pc(79) boolean local79 = Static402.method8007(this.anInt5673, arg2);
		@Pc(85) boolean local85 = local73 | local67 | local79;
		@Pc(186) int local186;
		if (local85) {
			if (!local67) {
				arg4.anIntArray415 = this.anIntArray415;
			} else if (arg0.anIntArray415 == null || arg0.anIntArray415.length < this.anInt5614) {
				arg4.anIntArray415 = arg0.anIntArray415 = new int[this.anInt5614];
			} else {
				arg4.anIntArray415 = arg0.anIntArray415;
			}
			if (!local73) {
				arg4.anIntArray418 = this.anIntArray418;
			} else if (arg0.anIntArray418 == null || this.anInt5614 > arg0.anIntArray418.length) {
				arg4.anIntArray418 = arg0.anIntArray418 = new int[this.anInt5614];
			} else {
				arg4.anIntArray418 = arg0.anIntArray418;
			}
			if (!local79) {
				arg4.anIntArray417 = this.anIntArray417;
			} else if (arg0.anIntArray417 == null || this.anInt5614 > arg0.anIntArray417.length) {
				arg4.anIntArray417 = arg0.anIntArray417 = new int[this.anInt5614];
			} else {
				arg4.anIntArray417 = arg0.anIntArray417;
			}
			for (local186 = 0; local186 < this.anInt5614; local186++) {
				if (local67) {
					arg4.anIntArray415[local186] = this.anIntArray415[local186];
				}
				if (local73) {
					arg4.anIntArray418[local186] = this.anIntArray418[local186];
				}
				if (local79) {
					arg4.anIntArray417[local186] = this.anIntArray417[local186];
				}
			}
		} else {
			arg4.anIntArray418 = this.anIntArray418;
			arg4.anIntArray417 = this.anIntArray417;
			arg4.anIntArray415 = this.anIntArray415;
		}
		if (Static89.method1391(arg2, this.anInt5673)) {
			arg4.aClass344_4 = arg0.aClass344_4;
			arg4.aClass344_4.aBoolean766 = this.aClass344_4.aBoolean766;
			arg4.aClass344_4.aBoolean767 = true;
			arg4.aClass344_4.anInterface1_16 = this.aClass344_4.anInterface1_16;
		} else if (Static120.method8608(arg2, this.anInt5673)) {
			arg4.aClass344_4 = this.aClass344_4;
		} else {
			arg4.aClass344_4 = null;
		}
		if (Static598.method8368(this.anInt5673, arg2)) {
			if (arg0.aShortArray70 == null || this.anInt5635 > arg0.aShortArray70.length) {
				arg4.aShortArray70 = arg0.aShortArray70 = new short[this.anInt5635];
			} else {
				arg4.aShortArray70 = arg0.aShortArray70;
			}
			for (local186 = 0; local186 < this.anInt5635; local186++) {
				arg4.aShortArray70[local186] = this.aShortArray70[local186];
			}
		} else {
			arg4.aShortArray70 = this.aShortArray70;
		}
		if (Static559.method7848(arg2, this.anInt5673)) {
			if (arg0.aByteArray44 == null || this.anInt5635 > arg0.aByteArray44.length) {
				arg4.aByteArray44 = arg0.aByteArray44 = new byte[this.anInt5635];
			} else {
				arg4.aByteArray44 = arg0.aByteArray44;
			}
			for (local186 = 0; local186 < this.anInt5635; local186++) {
				arg4.aByteArray44[local186] = this.aByteArray44[local186];
			}
		} else {
			arg4.aByteArray44 = this.aByteArray44;
		}
		if (Static130.method1926(this.anInt5673, arg2)) {
			arg4.aClass344_2 = arg0.aClass344_2;
			arg4.aClass344_2.anInterface1_16 = this.aClass344_2.anInterface1_16;
			arg4.aClass344_2.aBoolean766 = this.aClass344_2.aBoolean766;
			arg4.aClass344_2.aBoolean767 = true;
		} else if (Static387.method5966(arg2, this.anInt5673)) {
			arg4.aClass344_2 = this.aClass344_2;
		} else {
			arg4.aClass344_2 = null;
		}
		@Pc(563) int local563;
		if (Static601.method8391(arg2, this.anInt5673)) {
			if (arg0.aShortArray72 == null || this.anInt5675 > arg0.aShortArray72.length) {
				local186 = this.anInt5675;
				arg4.aShortArray67 = arg0.aShortArray67 = new short[local186];
				arg4.aShortArray65 = arg0.aShortArray65 = new short[local186];
				arg4.aShortArray72 = arg0.aShortArray72 = new short[local186];
			} else {
				arg4.aShortArray67 = arg0.aShortArray67;
				arg4.aShortArray72 = arg0.aShortArray72;
				arg4.aShortArray65 = arg0.aShortArray65;
			}
			if (this.aClass139_1 == null) {
				arg4.aClass139_1 = null;
				for (local186 = 0; local186 < this.anInt5675; local186++) {
					arg4.aShortArray72[local186] = this.aShortArray72[local186];
					arg4.aShortArray65[local186] = this.aShortArray65[local186];
					arg4.aShortArray67[local186] = this.aShortArray67[local186];
				}
			} else {
				if (arg0.aClass139_1 == null) {
					arg0.aClass139_1 = new Class139();
				}
				@Pc(547) Class139 local547 = arg4.aClass139_1 = arg0.aClass139_1;
				if (local547.aShortArray49 == null || local547.aShortArray49.length < this.anInt5675) {
					local563 = this.anInt5675;
					local547.aShortArray49 = new short[local563];
					local547.aByteArray29 = new byte[local563];
					local547.aShortArray50 = new short[local563];
					local547.aShortArray51 = new short[local563];
				}
				for (local563 = 0; local563 < this.anInt5675; local563++) {
					arg4.aShortArray72[local563] = this.aShortArray72[local563];
					arg4.aShortArray65[local563] = this.aShortArray65[local563];
					arg4.aShortArray67[local563] = this.aShortArray67[local563];
					local547.aShortArray49[local563] = this.aClass139_1.aShortArray49[local563];
					local547.aShortArray50[local563] = this.aClass139_1.aShortArray50[local563];
					local547.aShortArray51[local563] = this.aClass139_1.aShortArray51[local563];
					local547.aByteArray29[local563] = this.aClass139_1.aByteArray29[local563];
				}
			}
			arg4.aByteArray42 = this.aByteArray42;
		} else {
			arg4.aShortArray65 = this.aShortArray65;
			arg4.aShortArray67 = this.aShortArray67;
			arg4.aByteArray42 = this.aByteArray42;
			arg4.aClass139_1 = this.aClass139_1;
			arg4.aShortArray72 = this.aShortArray72;
		}
		if (Static386.method5963(this.anInt5673, arg2)) {
			arg4.aClass344_1 = arg0.aClass344_1;
			arg4.aClass344_1.anInterface1_16 = this.aClass344_1.anInterface1_16;
			arg4.aClass344_1.aBoolean766 = this.aClass344_1.aBoolean766;
			arg4.aClass344_1.aBoolean767 = true;
		} else if (Static187.method3002(this.anInt5673, arg2)) {
			arg4.aClass344_1 = this.aClass344_1;
		} else {
			arg4.aClass344_1 = null;
		}
		if (Static69.method1137(this.anInt5673, arg2)) {
			if (arg0.aFloatArray32 == null || this.anInt5635 > arg0.aFloatArray32.length) {
				local186 = this.anInt5675;
				arg4.aFloatArray32 = arg0.aFloatArray32 = new float[local186];
				arg4.aFloatArray31 = arg0.aFloatArray31 = new float[local186];
			} else {
				arg4.aFloatArray31 = arg0.aFloatArray31;
				arg4.aFloatArray32 = arg0.aFloatArray32;
			}
			for (local186 = 0; local186 < this.anInt5675; local186++) {
				arg4.aFloatArray32[local186] = this.aFloatArray32[local186];
				arg4.aFloatArray31[local186] = this.aFloatArray31[local186];
			}
		} else {
			arg4.aFloatArray32 = this.aFloatArray32;
			arg4.aFloatArray31 = this.aFloatArray31;
		}
		if (Static438.method6522(arg2, this.anInt5673)) {
			arg4.aClass344_3 = arg0.aClass344_3;
			arg4.aClass344_3.aBoolean766 = this.aClass344_3.aBoolean766;
			arg4.aClass344_3.aBoolean767 = true;
			arg4.aClass344_3.anInterface1_16 = this.aClass344_3.anInterface1_16;
		} else if (Static420.method6383(this.anInt5673, arg2)) {
			arg4.aClass344_3 = this.aClass344_3;
		} else {
			arg4.aClass344_3 = null;
		}
		if (Static20.method462(this.anInt5673, arg2)) {
			if (arg0.aShortArray68 == null || arg0.aShortArray68.length < this.anInt5635) {
				local186 = this.anInt5635;
				arg4.aShortArray71 = arg0.aShortArray71 = new short[local186];
				arg4.aShortArray64 = arg0.aShortArray64 = new short[local186];
				arg4.aShortArray68 = arg0.aShortArray68 = new short[local186];
			} else {
				arg4.aShortArray68 = arg0.aShortArray68;
				arg4.aShortArray64 = arg0.aShortArray64;
				arg4.aShortArray71 = arg0.aShortArray71;
			}
			for (local186 = 0; local186 < this.anInt5635; local186++) {
				arg4.aShortArray68[local186] = this.aShortArray68[local186];
				arg4.aShortArray64[local186] = this.aShortArray64[local186];
				arg4.aShortArray71[local186] = this.aShortArray71[local186];
			}
		} else {
			arg4.aShortArray71 = this.aShortArray71;
			arg4.aShortArray64 = this.aShortArray64;
			arg4.aShortArray68 = this.aShortArray68;
		}
		if (Static153.method2232(this.anInt5673, arg2)) {
			arg4.aClass113_1 = arg0.aClass113_1;
			arg4.aClass113_1.aBoolean246 = true;
			arg4.aClass113_1.aBoolean247 = this.aClass113_1.aBoolean247;
			arg4.aClass113_1.anInterface21_3 = this.aClass113_1.anInterface21_3;
		} else if (Static75.method1234(arg2, this.anInt5673)) {
			arg4.aClass113_1 = this.aClass113_1;
		} else {
			arg4.aClass113_1 = null;
		}
		if (Static51.method804(arg2, this.anInt5673)) {
			if (arg0.aShortArray73 == null || arg0.aShortArray73.length < this.anInt5635) {
				local186 = this.anInt5635;
				arg4.aShortArray73 = arg0.aShortArray73 = new short[local186];
			} else {
				arg4.aShortArray73 = arg0.aShortArray73;
			}
			for (local186 = 0; local186 < this.anInt5635; local186++) {
				arg4.aShortArray73[local186] = this.aShortArray73[local186];
			}
		} else {
			arg4.aShortArray73 = this.aShortArray73;
		}
		if (!Static543.method8850(arg2, this.anInt5673)) {
			arg4.aClass297Array1 = this.aClass297Array1;
		} else if (arg0.aClass297Array1 == null || arg0.aClass297Array1.length < this.anInt5676) {
			local186 = this.anInt5676;
			arg4.aClass297Array1 = arg0.aClass297Array1 = new Class297[local186];
			for (local563 = 0; local563 < this.anInt5676; local563++) {
				arg4.aClass297Array1[local563] = this.aClass297Array1[local563].method6957();
			}
		} else {
			arg4.aClass297Array1 = arg0.aClass297Array1;
			for (local186 = 0; local186 < this.anInt5676; local186++) {
				arg4.aClass297Array1[local186].method6955(this.aClass297Array1[local186]);
			}
		}
		arg4.anIntArray420 = this.anIntArray420;
		arg4.aShortArray69 = this.aShortArray69;
		arg4.anIntArray416 = this.anIntArray416;
		arg4.aClass143Array2 = this.aClass143Array2;
		arg4.aClass57Array2 = this.aClass57Array2;
		arg4.aShortArray75 = this.aShortArray75;
		arg4.anIntArrayArray26 = this.anIntArrayArray26;
		arg4.aShortArray74 = this.aShortArray74;
		arg4.lb = this.lb;
		arg4.anIntArrayArray24 = this.anIntArrayArray24;
		arg4.aShortArray66 = this.aShortArray66;
		arg4.anIntArray414 = this.anIntArray414;
		arg4.anIntArrayArray25 = this.anIntArrayArray25;
		arg4.anIntArray419 = this.anIntArray419;
		if (this.aBoolean480) {
			arg4.aBoolean480 = true;
			arg4.anInt5690 = this.anInt5690;
			arg4.anInt5644 = this.anInt5644;
			arg4.anInt5678 = this.anInt5678;
			arg4.anInt5613 = this.anInt5613;
			arg4.anInt5685 = this.anInt5685;
			arg4.anInt5628 = this.anInt5628;
			arg4.anInt5615 = this.anInt5615;
			arg4.anInt5633 = this.anInt5633;
		} else {
			arg4.aBoolean480 = false;
		}
		arg4.aClass152Array1 = this.aClass152Array1;
		return arg4;
	}

	@OriginalMember(owner = "client!lj", name = "EA", descriptor = "()I")
	@Override
	public int EA() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5644;
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)Z")
	private boolean method5064() {
		@Pc(13) boolean local13 = !this.aClass344_2.aBoolean766;
		@Pc(29) boolean local29 = (this.anInt5673 & 0x37) != 0 && !this.aClass344_1.aBoolean766;
		@Pc(37) boolean local37 = !this.aClass344_4.aBoolean766;
		@Pc(45) boolean local45 = !this.aClass344_3.aBoolean766;
		if (!local37 && !local13 && !local29 && !local45) {
			return true;
		}
		@Pc(57) boolean local57 = true;
		@Pc(81) Interface1 local81;
		@Pc(95) Buffer local95;
		if (local37) {
			if (this.aClass344_4.anInterface1_15 == null) {
				this.aClass344_4.anInterface1_15 = this.aClass126_Sub2_12.method5530(this.aBoolean481);
			}
			local81 = this.aClass344_4.anInterface1_15;
			local81.method7715(12, this.anInt5675 * 12);
			local95 = local81.method7714();
			if (local95 == null) {
				local57 = false;
			} else {
				this.aClass126_Sub2_12.aNativeInterface3.copyPositions(this.anIntArray415, this.anIntArray418, this.anIntArray417, this.aShortArray66, 0, 12, this.anInt5675, local95.getAddress());
				if (local81.method7717()) {
					this.aClass344_4.anInterface1_16 = local81;
					this.aClass344_4.aBoolean766 = true;
				} else {
					local57 = false;
				}
			}
		}
		@Pc(194) short[] local194;
		@Pc(182) short[] local182;
		@Pc(190) short[] local190;
		@Pc(186) byte[] local186;
		if (local13) {
			if (this.aClass344_2.anInterface1_15 == null) {
				this.aClass344_2.anInterface1_15 = this.aClass126_Sub2_12.method5530(this.aBoolean481);
			}
			local81 = this.aClass344_2.anInterface1_15;
			local81.method7715(4, this.anInt5675 * 4);
			local95 = local81.method7714();
			if (local95 == null) {
				local57 = false;
			} else {
				if ((this.anInt5673 & 0x37) == 0) {
					if (this.aClass139_1 == null) {
						local194 = this.aShortArray72;
						local190 = this.aShortArray67;
						local182 = this.aShortArray65;
						local186 = this.aByteArray42;
					} else {
						local182 = this.aClass139_1.aShortArray50;
						local186 = this.aClass139_1.aByteArray29;
						local190 = this.aClass139_1.aShortArray51;
						local194 = this.aClass139_1.aShortArray49;
					}
					this.aClass126_Sub2_12.aNativeInterface3.copyLighting(this.aShortArray70, this.aByteArray44, this.aShortArray73, local194, local182, local190, local186, this.aShort76, this.aShort75, this.aShortArray69, 0, 4, this.anInt5675, local95.getAddress());
				} else {
					this.aClass126_Sub2_12.aNativeInterface3.copyColours(this.aShortArray70, this.aByteArray44, this.aShortArray73, this.aShort76, this.aShortArray69, 0, 4, this.anInt5675, local95.getAddress());
				}
				if (local81.method7717()) {
					this.aClass344_2.aBoolean766 = true;
					this.aClass344_2.anInterface1_16 = local81;
				} else {
					local57 = false;
				}
			}
		}
		if (local29) {
			if (this.aClass344_1.anInterface1_15 == null) {
				this.aClass344_1.anInterface1_15 = this.aClass126_Sub2_12.method5530(this.aBoolean481);
			}
			local81 = this.aClass344_1.anInterface1_15;
			local81.method7715(12, this.anInt5675 * 12);
			local95 = local81.method7714();
			if (local95 == null) {
				local57 = false;
			} else {
				if (this.aClass139_1 == null) {
					local190 = this.aShortArray67;
					local186 = this.aByteArray42;
					local194 = this.aShortArray72;
					local182 = this.aShortArray65;
				} else {
					local182 = this.aClass139_1.aShortArray50;
					local194 = this.aClass139_1.aShortArray49;
					local190 = this.aClass139_1.aShortArray51;
					local186 = this.aClass139_1.aByteArray29;
				}
				this.aClass126_Sub2_12.aNativeInterface3.copyNormals(local194, local182, local190, local186, 3.0F / (float) this.aShort75, 3.0F / (float) (this.aShort75 + this.aShort75 / 2), 0, 12, this.anInt5675, local95.getAddress());
				if (local81.method7717()) {
					this.aClass344_1.anInterface1_16 = local81;
					this.aClass344_1.aBoolean766 = true;
				} else {
					local57 = false;
				}
			}
		}
		if (local45) {
			if (this.aClass344_3.anInterface1_15 == null) {
				this.aClass344_3.anInterface1_15 = this.aClass126_Sub2_12.method5530(this.aBoolean481);
			}
			local81 = this.aClass344_3.anInterface1_15;
			local81.method7715(8, this.anInt5675 * 8);
			local95 = local81.method7714();
			if (local95 == null) {
				local57 = false;
			} else {
				this.aClass126_Sub2_12.aNativeInterface3.copyTexCoords(this.aFloatArray32, this.aFloatArray31, 0, 8, this.anInt5675, local95.getAddress());
				if (local81.method7717()) {
					this.aClass344_3.anInterface1_16 = local81;
					this.aClass344_3.aBoolean766 = true;
				} else {
					local57 = false;
				}
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!lj", name = "WA", descriptor = "()I")
	@Override
	public int WA() {
		return this.aShort76;
	}

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "()V")
	@Override
	protected void method7936() {
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I[IIIIIZ)V")
	@Override
	protected void method7947(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(8) int local8 = arg1.length;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(56) int local56;
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(38) int local38;
		@Pc(48) int[] local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			local14 = arg2 << 4;
			local18 = arg3 << 4;
			local22 = arg4 << 4;
			local24 = 0;
			Static189.anInt3385 = 0;
			Static506.anInt3267 = 0;
			Static309.anInt5394 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (this.anIntArrayArray26.length > local38) {
					local48 = this.anIntArrayArray26[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						Static189.anInt3385 += this.anIntArray415[local56];
						Static309.anInt5394 += this.anIntArray418[local56];
						local24++;
						Static506.anInt3267 += this.anIntArray417[local56];
					}
				}
			}
			if (local24 > 0) {
				Static309.anInt5394 = local18 + Static309.anInt5394 / local24;
				Static189.anInt3385 = Static189.anInt3385 / local24 + local14;
				Static506.anInt3267 = Static506.anInt3267 / local24 + local22;
			} else {
				Static189.anInt3385 = local14;
				Static506.anInt3267 = local22;
				Static309.anInt5394 = local18;
			}
			return;
		}
		@Pc(153) int[] local153;
		@Pc(155) int local155;
		if (arg0 == 1) {
			local22 = arg4 << 4;
			local18 = arg3 << 4;
			local14 = arg2 << 4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray26.length) {
					local153 = this.anIntArrayArray26[local32];
					for (local155 = 0; local155 < local153.length; local155++) {
						local50 = local153[local155];
						this.anIntArray415[local50] += local14;
						this.anIntArray418[local50] += local18;
						this.anIntArray417[local50] += local22;
					}
				}
			}
			return;
		}
		@Pc(275) int local275;
		@Pc(294) int local294;
		@Pc(749) int local749;
		@Pc(758) int local758;
		if (arg0 == 2) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray26.length > local32) {
					local153 = this.anIntArrayArray26[local32];
					if ((arg5 & 0x1) == 0) {
						for (local155 = 0; local155 < local153.length; local155++) {
							local50 = local153[local155];
							this.anIntArray415[local50] -= Static189.anInt3385;
							this.anIntArray418[local50] -= Static309.anInt5394;
							this.anIntArray417[local50] -= Static506.anInt3267;
							if (arg4 != 0) {
								local56 = Class5_Sub12_Sub1.anIntArray748[arg4];
								local275 = Class5_Sub12_Sub1.anIntArray749[arg4];
								local294 = this.anIntArray418[local50] * local56 + local275 * this.anIntArray415[local50] + 16383 >> 14;
								this.anIntArray418[local50] = this.anIntArray418[local50] * local275 + 16383 - local56 * this.anIntArray415[local50] >> 14;
								this.anIntArray415[local50] = local294;
							}
							if (arg2 != 0) {
								local56 = Class5_Sub12_Sub1.anIntArray748[arg2];
								local275 = Class5_Sub12_Sub1.anIntArray749[arg2];
								local294 = local275 * this.anIntArray418[local50] + 16383 - local56 * this.anIntArray417[local50] >> 14;
								this.anIntArray417[local50] = this.anIntArray417[local50] * local275 + local56 * this.anIntArray418[local50] + 16383 >> 14;
								this.anIntArray418[local50] = local294;
							}
							if (arg3 != 0) {
								local56 = Class5_Sub12_Sub1.anIntArray748[arg3];
								local275 = Class5_Sub12_Sub1.anIntArray749[arg3];
								local294 = local56 * this.anIntArray417[local50] + local275 * this.anIntArray415[local50] + 16383 >> 14;
								this.anIntArray417[local50] = local275 * this.anIntArray417[local50] + 16383 - local56 * this.anIntArray415[local50] >> 14;
								this.anIntArray415[local50] = local294;
							}
							this.anIntArray415[local50] += Static189.anInt3385;
							this.anIntArray418[local50] += Static309.anInt5394;
							this.anIntArray417[local50] += Static506.anInt3267;
						}
					} else {
						for (local155 = 0; local155 < local153.length; local155++) {
							local50 = local153[local155];
							this.anIntArray415[local50] -= Static189.anInt3385;
							this.anIntArray418[local50] -= Static309.anInt5394;
							this.anIntArray417[local50] -= Static506.anInt3267;
							if (arg2 != 0) {
								local56 = Class5_Sub12_Sub1.anIntArray748[arg2];
								local275 = Class5_Sub12_Sub1.anIntArray749[arg2];
								local294 = this.anIntArray418[local50] * local275 + 16383 - this.anIntArray417[local50] * local56 >> 14;
								this.anIntArray417[local50] = this.anIntArray417[local50] * local275 + local56 * this.anIntArray418[local50] + 16383 >> 14;
								this.anIntArray418[local50] = local294;
							}
							if (arg4 != 0) {
								local56 = Class5_Sub12_Sub1.anIntArray748[arg4];
								local275 = Class5_Sub12_Sub1.anIntArray749[arg4];
								local294 = this.anIntArray418[local50] * local56 + this.anIntArray415[local50] * local275 + 16383 >> 14;
								this.anIntArray418[local50] = local275 * this.anIntArray418[local50] + 16383 - this.anIntArray415[local50] * local56 >> 14;
								this.anIntArray415[local50] = local294;
							}
							if (arg3 != 0) {
								local56 = Class5_Sub12_Sub1.anIntArray748[arg3];
								local275 = Class5_Sub12_Sub1.anIntArray749[arg3];
								local294 = this.anIntArray417[local50] * local56 + this.anIntArray415[local50] * local275 + 16383 >> 14;
								this.anIntArray417[local50] = local275 * this.anIntArray417[local50] + 16383 - this.anIntArray415[local50] * local56 >> 14;
								this.anIntArray415[local50] = local294;
							}
							this.anIntArray415[local50] += Static189.anInt3385;
							this.anIntArray418[local50] += Static309.anInt5394;
							this.anIntArray417[local50] += Static506.anInt3267;
						}
					}
				}
			}
			if (arg6) {
				for (local32 = 0; local32 < local8; local32++) {
					local38 = arg1[local32];
					if (this.anIntArrayArray26.length > local38) {
						local48 = this.anIntArrayArray26[local38];
						for (local50 = 0; local50 < local48.length; local50++) {
							local56 = local48[local50];
							local275 = this.anIntArray414[local56];
							local294 = this.anIntArray414[local56 + 1];
							for (local749 = local275; local749 < local294; local749++) {
								local758 = this.aShortArray75[local749] - 1;
								if (local758 == -1) {
									break;
								}
								@Pc(770) int local770;
								@Pc(774) int local774;
								@Pc(792) int local792;
								if (arg4 != 0) {
									local770 = Class5_Sub12_Sub1.anIntArray748[arg4];
									local774 = Class5_Sub12_Sub1.anIntArray749[arg4];
									local792 = local774 * this.aShortArray72[local758] + local770 * this.aShortArray65[local758] + 16383 >> 14;
									this.aShortArray65[local758] = (short) (this.aShortArray65[local758] * local774 + 16383 - local770 * this.aShortArray72[local758] >> 14);
									this.aShortArray72[local758] = (short) local792;
								}
								if (arg2 != 0) {
									local770 = Class5_Sub12_Sub1.anIntArray748[arg2];
									local774 = Class5_Sub12_Sub1.anIntArray749[arg2];
									local792 = this.aShortArray65[local758] * local774 + 16383 - this.aShortArray67[local758] * local770 >> 14;
									this.aShortArray67[local758] = (short) (this.aShortArray65[local758] * local770 + local774 * this.aShortArray67[local758] + 16383 >> 14);
									this.aShortArray65[local758] = (short) local792;
								}
								if (arg3 != 0) {
									local770 = Class5_Sub12_Sub1.anIntArray748[arg3];
									local774 = Class5_Sub12_Sub1.anIntArray749[arg3];
									local792 = this.aShortArray67[local758] * local770 + this.aShortArray72[local758] * local774 + 16383 >> 14;
									this.aShortArray67[local758] = (short) (local774 * this.aShortArray67[local758] + 16383 - this.aShortArray72[local758] * local770 >> 14);
									this.aShortArray72[local758] = (short) local792;
								}
							}
						}
					}
				}
				this.method5060();
			}
		} else if (arg0 == 3) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray26.length) {
					local153 = this.anIntArrayArray26[local32];
					for (local155 = 0; local155 < local153.length; local155++) {
						local50 = local153[local155];
						this.anIntArray415[local50] -= Static189.anInt3385;
						this.anIntArray418[local50] -= Static309.anInt5394;
						this.anIntArray417[local50] -= Static506.anInt3267;
						this.anIntArray415[local50] = this.anIntArray415[local50] * arg2 >> 7;
						this.anIntArray418[local50] = arg3 * this.anIntArray418[local50] >> 7;
						this.anIntArray417[local50] = arg4 * this.anIntArray417[local50] >> 7;
						this.anIntArray415[local50] += Static189.anInt3385;
						this.anIntArray418[local50] += Static309.anInt5394;
						this.anIntArray417[local50] += Static506.anInt3267;
					}
				}
			}
		} else {
			@Pc(1205) Class297 local1205;
			@Pc(1103) boolean local1103;
			@Pc(1200) Class152 local1200;
			if (arg0 == 5) {
				if (this.anIntArrayArray24 != null) {
					local1103 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray24.length > local38) {
							local48 = this.anIntArrayArray24[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local275 = arg2 * 8 + (this.aByteArray44[local56] & 0xFF);
								if (local275 < 0) {
									local275 = 0;
								} else if (local275 > 255) {
									local275 = 255;
								}
								this.aByteArray44[local56] = (byte) local275;
							}
							local1103 |= local48.length > 0;
						}
					}
					if (local1103) {
						if (this.aClass152Array1 != null) {
							for (local38 = 0; local38 < this.anInt5676; local38++) {
								local1200 = this.aClass152Array1[local38];
								local1205 = this.aClass297Array1[local38];
								local1205.anInt8027 = local1205.anInt8027 & 0xFFFFFF | 255 - (this.aByteArray44[local1200.anInt3959] & 0xFF) << 24;
							}
						}
						this.method5061();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray24 != null) {
					local1103 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray24.length > local38) {
							local48 = this.anIntArrayArray24[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								local275 = this.aShortArray70[local56] & 0xFFFF;
								local294 = local275 >> 10 & 0x3F;
								local749 = local275 >> 7 & 0x7;
								local749 += arg3 / 4;
								local758 = local275 & 0x7F;
								@Pc(1311) int local1311 = local294 + arg2 & 0x3F;
								local758 += arg4;
								if (local749 < 0) {
									local749 = 0;
								} else if (local749 > 7) {
									local749 = 7;
								}
								if (local758 < 0) {
									local758 = 0;
								} else if (local758 > 127) {
									local758 = 127;
								}
								this.aShortArray70[local56] = (short) (local1311 << 10 | local749 << 7 | local758);
							}
							local1103 |= local48.length > 0;
						}
					}
					if (local1103) {
						if (this.aClass152Array1 != null) {
							for (local38 = 0; local38 < this.anInt5676; local38++) {
								local1200 = this.aClass152Array1[local38];
								local1205 = this.aClass297Array1[local38];
								local1205.anInt8027 = Static643.anIntArray836[this.aShortArray70[local1200.anInt3959] & 0xFFFF] & 0xFFFFFF | local1205.anInt8027 & 0xFF000000;
							}
						}
						this.method5061();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray25.length > local32) {
							local153 = this.anIntArrayArray25[local32];
							for (local155 = 0; local155 < local153.length; local155++) {
								local1205 = this.aClass297Array1[local153[local155]];
								local1205.anInt8021 += arg3;
								local1205.anInt8026 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray25.length > local32) {
							local153 = this.anIntArrayArray25[local32];
							for (local155 = 0; local155 < local153.length; local155++) {
								local1205 = this.aClass297Array1[local153[local155]];
								local1205.anInt8022 = local1205.anInt8022 * arg3 >> 7;
								local1205.anInt8023 = arg2 * local1205.anInt8023 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray25.length > local32) {
						local153 = this.anIntArrayArray25[local32];
						for (local155 = 0; local155 < local153.length; local155++) {
							local1205 = this.aClass297Array1[local153[local155]];
							local1205.anInt8024 = arg2 + local1205.anInt8024 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIZIILclient!ofa;I)Z")
	private boolean method5065(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class117 arg4, @OriginalArg(6) int arg5) {
		@Pc(8) Class117_Sub2 local8 = (Class117_Sub2) arg4;
		@Pc(12) Class117_Sub2 local12 = this.aClass126_Sub2_12.aClass117_Sub2_16;
		@Pc(33) float local33 = local12.aFloat54 * local8.aFloat49 + local8.aFloat52 * local12.aFloat59 + local12.aFloat50 * local8.aFloat56 + local12.aFloat56;
		@Pc(54) float local54 = local12.aFloat52 + local8.aFloat49 * local12.aFloat53 + local12.aFloat51 * local8.aFloat56 + local12.aFloat57 * local8.aFloat52;
		Static348.aFloat114 = local12.aFloat53 * local8.aFloat60 + local12.aFloat51 * local8.aFloat54 + local8.aFloat53 * local12.aFloat57;
		Static539.aFloat191 = local8.aFloat58 * local12.aFloat60 + local8.aFloat59 * local12.aFloat55 + local8.aFloat57 * local12.aFloat58;
		Static161.aFloat25 = local8.aFloat54 * local12.aFloat55 + local8.aFloat53 * local12.aFloat58 + local12.aFloat60 * local8.aFloat60;
		Static293.aFloat71 = local8.aFloat55 * local12.aFloat54 + local8.aFloat51 * local12.aFloat59 + local8.aFloat50 * local12.aFloat50;
		Static173.aFloat39 = local12.aFloat50 * local8.aFloat54 + local8.aFloat53 * local12.aFloat59 + local8.aFloat60 * local12.aFloat54;
		Static310.aFloat110 = local12.aFloat51 * local8.aFloat50 + local8.aFloat51 * local12.aFloat57 + local8.aFloat55 * local12.aFloat53;
		Static194.aFloat42 = local8.aFloat51 * local12.aFloat58 + local8.aFloat50 * local12.aFloat55 + local8.aFloat55 * local12.aFloat60;
		Static228.aFloat46 = local12.aFloat59 * local8.aFloat57 + local8.aFloat59 * local12.aFloat50 + local8.aFloat58 * local12.aFloat54;
		@Pc(219) float local219 = local8.aFloat49 * local12.aFloat60 + local8.aFloat52 * local12.aFloat58 + local8.aFloat56 * local12.aFloat55 + local12.aFloat49;
		Static580.aFloat204 = local8.aFloat59 * local12.aFloat51 + local12.aFloat57 * local8.aFloat57 + local12.aFloat53 * local8.aFloat58;
		@Pc(239) boolean local239 = false;
		@Pc(241) float local241 = Float.MAX_VALUE;
		@Pc(243) float local243 = -3.4028235E38F;
		@Pc(245) float local245 = Float.MAX_VALUE;
		@Pc(247) float local247 = -3.4028235E38F;
		@Pc(251) int local251 = this.aClass126_Sub2_12.anInt6268;
		@Pc(255) int local255 = this.aClass126_Sub2_12.anInt6287;
		if (!this.aBoolean480) {
			this.method5067();
		}
		@Pc(269) int local269 = this.anInt5685 - this.anInt5690 >> 1;
		@Pc(278) int local278 = this.anInt5644 - this.anInt5678 >> 1;
		@Pc(287) int local287 = this.anInt5633 - this.anInt5615 >> 1;
		@Pc(298) int local298 = local269 + this.anInt5690;
		@Pc(303) int local303 = local278 + this.anInt5678;
		@Pc(308) int local308 = local287 + this.anInt5615;
		@Pc(315) int local315 = local298 - (local269 << arg2);
		@Pc(322) int local322 = local303 - (local278 << arg2);
		@Pc(329) int local329 = local308 - (local287 << arg2);
		@Pc(336) int local336 = local298 + (local269 << arg2);
		@Pc(343) int local343 = local303 + (local278 << arg2);
		@Pc(349) int local349 = local308 + (local287 << arg2);
		Static592.anIntArray843[0] = local315;
		Static164.anIntArray424[0] = local322;
		Static362.anIntArray503[0] = local329;
		Static592.anIntArray843[1] = local336;
		Static164.anIntArray424[1] = local322;
		Static362.anIntArray503[1] = local329;
		Static592.anIntArray843[2] = local315;
		Static164.anIntArray424[2] = local343;
		Static362.anIntArray503[2] = local329;
		Static592.anIntArray843[3] = local336;
		Static164.anIntArray424[3] = local343;
		Static362.anIntArray503[3] = local329;
		Static592.anIntArray843[4] = local315;
		Static164.anIntArray424[4] = local322;
		Static362.anIntArray503[4] = local349;
		Static592.anIntArray843[5] = local336;
		Static164.anIntArray424[5] = local322;
		Static362.anIntArray503[5] = local349;
		Static592.anIntArray843[6] = local315;
		Static164.anIntArray424[6] = local343;
		Static592.anIntArray843[7] = local336;
		Static362.anIntArray503[6] = local349;
		Static164.anIntArray424[7] = local343;
		Static362.anIntArray503[7] = local349;
		@Pc(478) float local478;
		@Pc(492) float local492;
		@Pc(506) float local506;
		@Pc(454) float local454;
		@Pc(459) float local459;
		@Pc(464) float local464;
		for (@Pc(447) int local447 = 0; local447 < 8; local447++) {
			local454 = (float) Static592.anIntArray843[local447];
			local459 = (float) Static164.anIntArray424[local447];
			local464 = (float) Static362.anIntArray503[local447];
			local478 = local33 + local459 * Static228.aFloat46 + local454 * Static293.aFloat71 + local464 * Static173.aFloat39;
			local492 = local54 + local459 * Static580.aFloat204 + Static310.aFloat110 * local454 + local464 * Static348.aFloat114;
			local506 = local219 + Static161.aFloat25 * local464 + local459 * Static539.aFloat191 + local454 * Static194.aFloat42;
			if (local506 >= (float) this.aClass126_Sub2_12.anInt6259) {
				if (arg3 > 0) {
					local506 = (float) arg3;
				}
				@Pc(530) float local530 = local478 * (float) local251 / local506 + (float) this.aClass126_Sub2_12.anInt6288;
				if (local530 < local241) {
					local241 = local530;
				}
				@Pc(548) float local548 = (float) local255 * local492 / local506 + (float) this.aClass126_Sub2_12.anInt6257;
				if (local530 > local243) {
					local243 = local530;
				}
				if (local245 > local548) {
					local245 = local548;
				}
				if (local548 > local247) {
					local247 = local548;
				}
				local239 = true;
			}
		}
		if (local239 && local241 < (float) arg5 && local243 > (float) arg5 && local245 < (float) arg0 && local247 > (float) arg0) {
			if (arg1) {
				return true;
			}
			if (Static275.anIntArray678.length < this.anInt5675) {
				Static556.anIntArray706 = new int[this.anInt5675];
				Static275.anIntArray678 = new int[this.anInt5675];
			}
			@Pc(704) int local704;
			for (@Pc(617) int local617 = 0; local617 < this.anInt5655; local617++) {
				local454 = (float) this.anIntArray415[local617];
				local464 = (float) this.anIntArray417[local617];
				local459 = (float) this.anIntArray418[local617];
				local506 = local454 * Static194.aFloat42 + local459 * Static539.aFloat191 + local464 * Static161.aFloat25 + local219;
				local478 = local33 + Static293.aFloat71 * local454 + Static228.aFloat46 * local459 + local464 * Static173.aFloat39;
				local492 = local464 * Static348.aFloat114 + Static310.aFloat110 * local454 + Static580.aFloat204 * local459 + local54;
				@Pc(717) int local717;
				@Pc(722) int local722;
				@Pc(729) int local729;
				if (local506 >= (float) this.aClass126_Sub2_12.anInt6259) {
					if (arg3 > 0) {
						local506 = (float) arg3;
					}
					local704 = (int) ((float) this.aClass126_Sub2_12.anInt6288 + (float) local251 * local478 / local506);
					local717 = (int) ((float) this.aClass126_Sub2_12.anInt6257 + (float) local255 * local492 / local506);
					local722 = this.anIntArray414[local617];
					local729 = this.anIntArray414[local617 + 1];
					for (@Pc(731) int local731 = local722; local731 < local729; local731++) {
						@Pc(740) int local740 = this.aShortArray75[local731] - 1;
						if (local740 == -1) {
							break;
						}
						Static275.anIntArray678[local740] = local704;
						Static556.anIntArray706[local740] = local717;
					}
				} else {
					local704 = this.anIntArray414[local617];
					local717 = this.anIntArray414[local617 + 1];
					for (local722 = local704; local722 < local717; local722++) {
						local729 = this.aShortArray75[local722] - 1;
						if (local729 == -1) {
							break;
						}
						Static275.anIntArray678[this.aShortArray75[local722] - 1] = -999999;
					}
				}
			}
			for (local704 = 0; local704 < this.anInt5635; local704++) {
				if (Static275.anIntArray678[this.aShortArray68[local704]] != -999999 && Static275.anIntArray678[this.aShortArray64[local704]] != -999999 && Static275.anIntArray678[this.aShortArray71[local704]] != -999999 && this.method5066(Static275.anIntArray678[this.aShortArray71[local704]], Static556.anIntArray706[this.aShortArray64[local704]], Static556.anIntArray706[this.aShortArray71[local704]], Static556.anIntArray706[this.aShortArray68[local704]], Static275.anIntArray678[this.aShortArray64[local704]], Static275.anIntArray678[this.aShortArray68[local704]], arg0, arg5)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!lj", name = "LA", descriptor = "(I)V")
	@Override
	public void LA(@OriginalArg(0) int arg0) {
		this.aShort75 = (short) arg0;
		this.method5077();
		this.method5060();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIIIIBI)Z")
	private boolean method5066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < arg3 && arg6 < arg1 && arg6 < arg2) {
			return false;
		} else if (arg6 > arg3 && arg1 < arg6 && arg6 > arg2) {
			return false;
		} else if (arg7 < arg5 && arg7 < arg4 && arg7 < arg0) {
			return false;
		} else {
			return arg5 >= arg7 || arg4 >= arg7 || arg7 <= arg0;
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!ofa;ZI)Z")
	@Override
	public boolean method7946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4) {
		return this.method5065(arg1, arg3, arg4, -1, arg2, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
	@Override
	public void a(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5655; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray415[local15] + this.anIntArray417[local15] * local9 >> 14;
			this.anIntArray417[local15] = local13 * this.anIntArray417[local15] - this.anIntArray415[local15] * local9 >> 14;
			this.anIntArray415[local15] = local33;
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "(I)V")
	private void method5067() {
		@Pc(7) int local7 = 32767;
		@Pc(9) int local9 = 32767;
		@Pc(11) int local11 = 32767;
		@Pc(13) int local13 = -32768;
		@Pc(15) int local15 = -32768;
		@Pc(17) int local17 = -32768;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(31) int local31 = 0; local31 < this.anInt5655; local31++) {
			@Pc(38) int local38 = this.anIntArray415[local31];
			@Pc(43) int local43 = this.anIntArray418[local31];
			if (local38 < local7) {
				local7 = local38;
			}
			@Pc(57) int local57 = this.anIntArray417[local31];
			if (local13 < local38) {
				local13 = local38;
			}
			if (local9 > local43) {
				local9 = local43;
			}
			if (local15 < local43) {
				local15 = local43;
			}
			if (local57 > local17) {
				local17 = local57;
			}
			if (local11 > local57) {
				local11 = local57;
			}
			@Pc(103) int local103 = local38 * local38 + local57 * local57;
			if (local103 > local19) {
				local19 = local103;
			}
			local103 = local43 * local43 + local38 * local38 + local57 * local57;
			if (local103 > local21) {
				local21 = local103;
			}
		}
		this.anInt5615 = local11;
		this.anInt5644 = local15;
		this.anInt5685 = local13;
		this.anInt5633 = local17;
		this.anInt5678 = local9;
		this.anInt5690 = local7;
		this.anInt5613 = (int) (Math.sqrt((double) local19) + 0.99D);
		this.anInt5628 = (int) (Math.sqrt((double) local21) + 0.99D);
		this.aBoolean480 = true;
	}

	@OriginalMember(owner = "client!lj", name = "wa", descriptor = "()V")
	@Override
	protected void wa() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5614; local3++) {
			this.anIntArray415[local3] = this.anIntArray415[local3] + 7 >> 4;
			this.anIntArray418[local3] = this.anIntArray418[local3] + 7 >> 4;
			this.anIntArray417[local3] = this.anIntArray417[local3] + 7 >> 4;
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "p", descriptor = "(IILclient!s;Lclient!s;III)V")
	@Override
	public void p(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class40 arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (!this.aBoolean480) {
			this.method5067();
		}
		@Pc(16) int local16 = arg4 + this.anInt5690;
		@Pc(21) int local21 = this.anInt5685 + arg4;
		@Pc(27) int local27 = arg6 + this.anInt5615;
		@Pc(32) int local32 = this.anInt5633 + arg6;
		if ((arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 5) && (local16 < 0 || arg2.anInt9920 <= arg2.anInt9918 + local21 >> arg2.anInt9919 || local27 < 0 || arg2.anInt9918 + local32 >> arg2.anInt9919 >= arg2.anInt9923)) {
			return;
		}
		if (arg0 == 4 || arg0 == 5) {
			if (arg3 == null) {
				return;
			}
			if (local16 < 0 || arg3.anInt9920 <= local21 + arg3.anInt9918 >> arg3.anInt9919 || local27 < 0 || arg3.anInt9923 <= local32 + arg3.anInt9918 >> arg3.anInt9919) {
				return;
			}
		} else {
			local16 >>= arg2.anInt9919;
			local21 = local21 + arg2.anInt9918 - 1 >> arg2.anInt9919;
			local27 >>= arg2.anInt9919;
			local32 = local32 + arg2.anInt9918 - 1 >> arg2.anInt9919;
			if (arg5 == arg2.method8442(local16, local27) && arg2.method8442(local21, local27) == arg5 && arg5 == arg2.method8442(local16, local32) && arg2.method8442(local21, local32) == arg5) {
				return;
			}
		}
		@Pc(214) int local214;
		if (arg0 == 1) {
			for (local214 = 0; local214 < this.anInt5655; local214++) {
				this.anIntArray418[local214] = this.anIntArray418[local214] + arg2.method8447(this.anIntArray415[local214] + arg4, arg6 + this.anIntArray417[local214]) - arg5;
			}
		} else {
			@Pc(222) int local222;
			@Pc(230) int local230;
			if (arg0 == 2) {
				local214 = this.anInt5678;
				if (local214 == 0) {
					return;
				}
				for (local222 = 0; local222 < this.anInt5655; local222++) {
					local230 = (this.anIntArray418[local222] << 16) / local214;
					if (local230 < arg1) {
						this.anIntArray418[local222] += (arg1 - local230) * (-arg5 + arg2.method8447(this.anIntArray415[local222] - -arg4, this.anIntArray417[local222] - -arg6)) / arg1;
					}
				}
			} else {
				@Pc(238) int local238;
				if (arg0 == 3) {
					local214 = (arg1 & 0xFF) * 4;
					local222 = (arg1 >> 8 & 0xFF) * 4;
					local230 = (arg1 >> 16 & 0xFF) << 6;
					local238 = (arg1 >> 24 & 0xFF) << 6;
					if (arg4 - (local214 >> 1) < 0 || arg4 + (local214 >> 1) + arg2.anInt9918 >= arg2.anInt9920 << arg2.anInt9919 || arg6 - (local222 >> 1) < 0 || arg6 + (local222 >> 1) + arg2.anInt9918 >= arg2.anInt9923 << arg2.anInt9919) {
						return;
					}
					this.method7938(arg2, local230, arg6, arg4, local214, local238, arg5, local222);
				} else if (arg0 == 4) {
					local214 = this.anInt5644 - this.anInt5678;
					for (local222 = 0; local222 < this.anInt5655; local222++) {
						this.anIntArray418[local222] += arg3.method8447(this.anIntArray415[local222] + arg4, this.anIntArray417[local222] + arg6) + local214 - arg5;
					}
				} else if (arg0 == 5) {
					local214 = this.anInt5644 - this.anInt5678;
					for (local222 = 0; local222 < this.anInt5655; local222++) {
						local230 = this.anIntArray415[local222] + arg4;
						local238 = this.anIntArray417[local222] + arg6;
						@Pc(340) int local340 = arg2.method8447(local230, local238);
						@Pc(346) int local346 = arg3.method8447(local230, local238);
						@Pc(354) int local354 = local340 - local346 - arg1;
						this.anIntArray418[local222] = local340 + (local354 * ((this.anIntArray418[local222] << 8) / local214) >> 8) - arg5;
					}
				}
			}
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "O", descriptor = "(III)V")
	@Override
	public void O(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5655; local7++) {
			if (arg0 != 128) {
				this.anIntArray415[local7] = arg0 * this.anIntArray415[local7] >> 7;
			}
			if (arg1 != 128) {
				this.anIntArray418[local7] = this.anIntArray418[local7] * arg1 >> 7;
			}
			if (arg2 != 128) {
				this.anIntArray417[local7] = this.anIntArray417[local7] * arg2 >> 7;
			}
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "HA", descriptor = "()I")
	@Override
	public int HA() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5615;
	}

	@OriginalMember(owner = "client!lj", name = "s", descriptor = "(I)V")
	@Override
	public void s(@OriginalArg(0) int arg0) {
		if (this.aClass344_4 != null) {
			this.aClass344_4.aBoolean767 = Static89.method1391(arg0, this.anInt5673);
		}
		if (this.aClass344_3 != null) {
			this.aClass344_3.aBoolean767 = Static438.method6522(arg0, this.anInt5673);
		}
		if (this.aClass344_2 != null) {
			this.aClass344_2.aBoolean767 = Static130.method1926(this.anInt5673, arg0);
		}
		if (this.aClass344_1 != null) {
			this.aClass344_1.aBoolean767 = Static386.method5963(this.anInt5673, arg0);
		}
		this.anInt5624 = arg0;
		if (this.aClass139_1 != null && (this.anInt5624 & 0x10000) == 0) {
			this.aShortArray67 = this.aClass139_1.aShortArray51;
			this.aShortArray65 = this.aClass139_1.aShortArray50;
			this.aShortArray72 = this.aClass139_1.aShortArray49;
			this.aByteArray42 = this.aClass139_1.aByteArray29;
			this.aClass139_1 = null;
		}
		this.aBoolean477 = true;
		this.method5078();
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILclient!ofa;ZII)Z")
	@Override
	public boolean method7929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class117 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		return this.method5065(arg1, arg3, arg4, arg5, arg2, arg0);
	}

	@OriginalMember(owner = "client!lj", name = "C", descriptor = "(I)V")
	@Override
	public void C(@OriginalArg(0) int arg0) {
		this.aShort76 = (short) arg0;
		this.method5061();
	}

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "(I)V")
	private void method5069() {
		if (this.aClass113_1 != null) {
			this.aClass113_1.aBoolean247 = false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "FA", descriptor = "(I)V")
	@Override
	public void FA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5655; local15++) {
			@Pc(34) int local34 = local13 * this.anIntArray418[local15] - this.anIntArray417[local15] * local9 >> 14;
			this.anIntArray417[local15] = local13 * this.anIntArray417[local15] + this.anIntArray418[local15] * local9 >> 14;
			this.anIntArray418[local15] = local34;
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ofa;)V")
	@Override
	public void method7951(@OriginalArg(0) Class117 arg0) {
		@Pc(8) Class117_Sub2 local8 = (Class117_Sub2) arg0;
		@Pc(13) int local13;
		if (this.aClass57Array2 != null) {
			for (local13 = 0; local13 < this.aClass57Array2.length; local13++) {
				@Pc(20) Class57 local20 = this.aClass57Array2[local13];
				@Pc(22) Class57 local22 = local20;
				if (local20.aClass57_1 != null) {
					local22 = local20.aClass57_1;
				}
				local22.anInt1262 = (int) (local8.aFloat56 + (float) this.anIntArray417[local20.anInt1261] * local8.aFloat54 + local8.aFloat59 * (float) this.anIntArray418[local20.anInt1261] + local8.aFloat50 * (float) this.anIntArray415[local20.anInt1261]);
				local22.anInt1272 = (int) (local8.aFloat52 + (float) this.anIntArray417[local20.anInt1261] * local8.aFloat53 + (float) this.anIntArray418[local20.anInt1261] * local8.aFloat57 + (float) this.anIntArray415[local20.anInt1261] * local8.aFloat51);
				local22.anInt1271 = (int) (local8.aFloat49 + local8.aFloat58 * (float) this.anIntArray418[local20.anInt1261] + local8.aFloat55 * (float) this.anIntArray415[local20.anInt1261] + (float) this.anIntArray417[local20.anInt1261] * local8.aFloat60);
				local22.anInt1267 = (int) (local8.aFloat56 + local8.aFloat59 * (float) this.anIntArray418[local20.anInt1265] + local8.aFloat50 * (float) this.anIntArray415[local20.anInt1265] + local8.aFloat54 * (float) this.anIntArray417[local20.anInt1265]);
				local22.anInt1266 = (int) (local8.aFloat52 + (float) this.anIntArray417[local20.anInt1265] * local8.aFloat53 + (float) this.anIntArray415[local20.anInt1265] * local8.aFloat51 + local8.aFloat57 * (float) this.anIntArray418[local20.anInt1265]);
				local22.anInt1256 = (int) (local8.aFloat49 + local8.aFloat60 * (float) this.anIntArray417[local20.anInt1265] + local8.aFloat58 * (float) this.anIntArray418[local20.anInt1265] + local8.aFloat55 * (float) this.anIntArray415[local20.anInt1265]);
				local22.anInt1255 = (int) (local8.aFloat56 + (float) this.anIntArray418[local20.anInt1270] * local8.aFloat59 + (float) this.anIntArray415[local20.anInt1270] * local8.aFloat50 + (float) this.anIntArray417[local20.anInt1270] * local8.aFloat54);
				local22.anInt1257 = (int) (local8.aFloat53 * (float) this.anIntArray417[local20.anInt1270] + (float) this.anIntArray418[local20.anInt1270] * local8.aFloat57 + local8.aFloat51 * (float) this.anIntArray415[local20.anInt1270] + local8.aFloat52);
				local22.anInt1269 = (int) (local8.aFloat49 + (float) this.anIntArray415[local20.anInt1270] * local8.aFloat55 + (float) this.anIntArray418[local20.anInt1270] * local8.aFloat58 + local8.aFloat60 * (float) this.anIntArray417[local20.anInt1270]);
			}
		}
		if (this.aClass143Array2 == null) {
			return;
		}
		for (local13 = 0; local13 < this.aClass143Array2.length; local13++) {
			@Pc(365) Class143 local365 = this.aClass143Array2[local13];
			@Pc(367) Class143 local367 = local365;
			if (local365.aClass143_1 != null) {
				local367 = local365.aClass143_1;
			}
			if (local365.aClass117_3 == null) {
				local365.aClass117_3 = local8.method7248();
			} else {
				local365.aClass117_3.method7253(local8);
			}
			local367.anInt3655 = (int) (local8.aFloat56 + local8.aFloat59 * (float) this.anIntArray418[local365.anInt3651] + local8.aFloat50 * (float) this.anIntArray415[local365.anInt3651] + local8.aFloat54 * (float) this.anIntArray417[local365.anInt3651]);
			local367.anInt3654 = (int) (local8.aFloat52 + local8.aFloat53 * (float) this.anIntArray417[local365.anInt3651] + local8.aFloat57 * (float) this.anIntArray418[local365.anInt3651] + local8.aFloat51 * (float) this.anIntArray415[local365.anInt3651]);
			local367.anInt3661 = (int) (local8.aFloat58 * (float) this.anIntArray418[local365.anInt3651] + (float) this.anIntArray415[local365.anInt3651] * local8.aFloat55 + local8.aFloat60 * (float) this.anIntArray417[local365.anInt3651] + local8.aFloat49);
		}
	}

	@OriginalMember(owner = "client!lj", name = "ia", descriptor = "(SS)V")
	@Override
	public void ia(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5635; local3++) {
			if (arg0 == this.aShortArray70[local3]) {
				this.aShortArray70[local3] = arg1;
			}
		}
		if (this.aClass152Array1 != null) {
			for (@Pc(30) int local30 = 0; local30 < this.anInt5676; local30++) {
				@Pc(37) Class152 local37 = this.aClass152Array1[local30];
				@Pc(42) Class297 local42 = this.aClass297Array1[local30];
				local42.anInt8027 = Static643.anIntArray836[this.aShortArray70[local37.anInt3959] & 0xFFFF] & 0xFFFFFF | local42.anInt8027 & 0xFF000000;
			}
		}
		this.method5061();
	}

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "(I)V")
	private void method5070() {
		if (this.aClass152Array1 == null) {
			return;
		}
		this.aClass126_Sub2_12.C(!this.aBoolean479);
		this.aClass126_Sub2_12.method5443(false);
		this.aClass126_Sub2_12.method5466(1, Static645.aClass294_5);
		this.aClass126_Sub2_12.method5471(Static645.aClass294_5, 1);
		for (@Pc(32) int local32 = 0; local32 < this.anInt5676; local32++) {
			@Pc(39) Class152 local39 = this.aClass152Array1[local32];
			@Pc(44) Class297 local44 = this.aClass297Array1[local32];
			if (!local39.aBoolean327 || !this.aClass126_Sub2_12.method7025()) {
				@Pc(72) float local72 = (float) (this.anIntArray415[local39.anInt3960] + this.anIntArray415[local39.anInt3958] + this.anIntArray415[local39.anInt3953]) * 0.3333333F;
				@Pc(93) float local93 = (float) (this.anIntArray418[local39.anInt3960] + this.anIntArray418[local39.anInt3958] + this.anIntArray418[local39.anInt3953]) * 0.3333333F;
				@Pc(114) float local114 = (float) (this.anIntArray417[local39.anInt3958] + this.anIntArray417[local39.anInt3953] + this.anIntArray417[local39.anInt3960]) * 0.3333333F;
				@Pc(128) float local128 = local93 * Static228.aFloat46 + Static293.aFloat71 * local72 + Static173.aFloat39 * local114 + Static511.aFloat189;
				@Pc(142) float local142 = Static18.aFloat7 + local72 * Static310.aFloat110 + local93 * Static580.aFloat204 + Static348.aFloat114 * local114;
				@Pc(156) float local156 = Static410.aFloat145 + Static194.aFloat42 * local72 + Static539.aFloat191 * local93 + local114 * Static161.aFloat25;
				@Pc(177) float local177 = (float) (1.0D / Math.sqrt((double) (local156 * local156 + local128 * local128 + local142 * local142))) * (float) local39.anInt3954;
				@Pc(182) Class117_Sub2 local182 = this.aClass126_Sub2_12.method5472();
				local182.method3867(local142 + (float) local44.anInt8021 - local177 * local142, -(local177 * local156) + local156, (float) local44.anInt8026 + local128 - local177 * local128, local44.anInt8024, local39.aShort56 * local44.anInt8022 >> 7, local44.anInt8023 * local39.aShort58 >> 7);
				local182.method3863(this.aClass126_Sub2_12.aClass117_Sub2_17);
				this.aClass126_Sub2_12.method5468();
				@Pc(238) int local238 = local44.anInt8027;
				this.aClass126_Sub2_12.method5482(local39.aShort57, false, false);
				this.aClass126_Sub2_12.method5462(local39.aByte77);
				this.aClass126_Sub2_12.method5496(local238);
				this.aClass126_Sub2_12.method5506();
			}
		}
		this.aClass126_Sub2_12.method5471(Static131.aClass294_2, 1);
		this.aClass126_Sub2_12.method5466(1, Static131.aClass294_2);
		this.aClass126_Sub2_12.C(true);
	}

	@OriginalMember(owner = "client!lj", name = "VA", descriptor = "(I)V")
	@Override
	public void VA(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		for (@Pc(15) int local15 = 0; local15 < this.anInt5655; local15++) {
			@Pc(33) int local33 = local13 * this.anIntArray415[local15] + this.anIntArray418[local15] * local9 >> 14;
			this.anIntArray418[local15] = this.anIntArray418[local15] * local13 - this.anIntArray415[local15] * local9 >> 14;
			this.anIntArray415[local15] = local33;
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ofa;IZ)V")
	@Override
	public void method7952(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (this.aShortArray74 == null) {
			return;
		}
		@Pc(12) int[] local12 = new int[3];
		for (@Pc(14) int local14 = 0; local14 < this.anInt5655; local14++) {
			if ((arg1 & this.aShortArray74[local14]) != 0) {
				if (arg2) {
					arg0.method7260(this.anIntArray415[local14], this.anIntArray418[local14], this.anIntArray417[local14], local12);
				} else {
					arg0.method7250(this.anIntArray415[local14], this.anIntArray418[local14], this.anIntArray417[local14], local12);
				}
				this.anIntArray415[local14] = local12[0];
				this.anIntArray418[local14] = local12[1];
				this.anIntArray417[local14] = local12[2];
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "G", descriptor = "()I")
	@Override
	public int G() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5633;
	}

	@OriginalMember(owner = "client!lj", name = "H", descriptor = "(III)V")
	@Override
	public void H(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5655; local7++) {
			if (arg0 != 0) {
				this.anIntArray415[local7] += arg0;
			}
			if (arg1 != 0) {
				this.anIntArray418[local7] += arg1;
			}
			if (arg2 != 0) {
				this.anIntArray417[local7] += arg2;
			}
		}
		this.method5077();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "ba", descriptor = "(Lclient!r;)Lclient!r;")
	@Override
	public Class5_Sub4_Sub10 ba(@OriginalArg(0) Class5_Sub4_Sub10 arg0) {
		if (this.anInt5675 == 0) {
			return null;
		}
		if (!this.aBoolean480) {
			this.method5067();
		}
		@Pc(43) int local43;
		@Pc(60) int local60;
		if (this.aClass126_Sub2_12.anInt6276 > 0) {
			local43 = this.anInt5690 - (this.aClass126_Sub2_12.anInt6276 * this.anInt5644 >> 8) >> this.aClass126_Sub2_12.anInt6254;
			local60 = this.anInt5685 - (this.aClass126_Sub2_12.anInt6276 * this.anInt5678 >> 8) >> this.aClass126_Sub2_12.anInt6254;
		} else {
			local43 = this.anInt5690 - (this.aClass126_Sub2_12.anInt6276 * this.anInt5678 >> 8) >> this.aClass126_Sub2_12.anInt6254;
			local60 = this.anInt5685 - (this.anInt5644 * this.aClass126_Sub2_12.anInt6276 >> 8) >> this.aClass126_Sub2_12.anInt6254;
		}
		@Pc(115) int local115;
		@Pc(132) int local132;
		if (this.aClass126_Sub2_12.anInt6261 > 0) {
			local115 = this.anInt5615 - (this.aClass126_Sub2_12.anInt6261 * this.anInt5644 >> 8) >> this.aClass126_Sub2_12.anInt6254;
			local132 = this.anInt5633 - (this.aClass126_Sub2_12.anInt6261 * this.anInt5678 >> 8) >> this.aClass126_Sub2_12.anInt6254;
		} else {
			local115 = this.anInt5615 - (this.anInt5678 * this.aClass126_Sub2_12.anInt6261 >> 8) >> this.aClass126_Sub2_12.anInt6254;
			local132 = this.anInt5633 - (this.anInt5644 * this.aClass126_Sub2_12.anInt6261 >> 8) >> this.aClass126_Sub2_12.anInt6254;
		}
		@Pc(175) int local175 = local60 + 1 - local43;
		@Pc(182) int local182 = local132 + 1 - local115;
		@Pc(185) Class5_Sub4_Sub10_Sub2 local185 = (Class5_Sub4_Sub10_Sub2) arg0;
		@Pc(195) Class5_Sub4_Sub10_Sub2 local195;
		if (local185 != null && local185.method3410(local182, local175)) {
			local195 = local185;
			local185.method3416();
		} else {
			local195 = new Class5_Sub4_Sub10_Sub2(this.aClass126_Sub2_12, local175, local182);
		}
		local195.method3418(local132, local115, local60, local43);
		this.method5075(local195);
		return local195;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ILclient!ur;IIFFIJIII)S")
	private short method5071(@OriginalArg(0) int arg0, @OriginalArg(1) Class349 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) int local10 = this.anIntArray414[arg9];
		@Pc(17) int local17 = this.anIntArray414[arg9 + 1];
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = local10; local21 < local17; local21++) {
			@Pc(28) short local28 = this.aShortArray75[local21];
			if (local28 == 0) {
				local19 = local21;
				break;
			}
			if (arg6 == Static536.aLongArray14[local21]) {
				return (short) (local28 - 1);
			}
		}
		this.aShortArray75[local19] = (short) (this.anInt5675 + 1);
		Static536.aLongArray14[local19] = arg6;
		this.aShortArray69[this.anInt5675] = (short) arg2;
		this.aShortArray66[this.anInt5675] = (short) arg9;
		this.aShortArray72[this.anInt5675] = (short) arg3;
		this.aShortArray65[this.anInt5675] = (short) arg8;
		this.aShortArray67[this.anInt5675] = (short) arg7;
		this.aByteArray42[this.anInt5675] = (byte) arg0;
		this.aFloatArray32[this.anInt5675] = arg4;
		this.aFloatArray31[this.anInt5675] = arg5;
		return (short) this.anInt5675++;
	}

	@OriginalMember(owner = "client!lj", name = "ma", descriptor = "()I")
	@Override
	public int ma() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5628;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ka;IIIZ)V")
	@Override
	public void method7937(@OriginalArg(0) Class180 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(8) Class180_Sub1 local8 = (Class180_Sub1) arg0;
		if (this.anInt5635 == 0 || local8.anInt5635 == 0) {
			return;
		}
		@Pc(24) int local24 = local8.anInt5655;
		@Pc(27) int[] local27 = local8.anIntArray415;
		@Pc(30) int[] local30 = local8.anIntArray418;
		@Pc(33) int[] local33 = local8.anIntArray417;
		@Pc(36) short[] local36 = local8.aShortArray72;
		@Pc(39) short[] local39 = local8.aShortArray65;
		@Pc(42) short[] local42 = local8.aShortArray67;
		@Pc(45) byte[] local45 = local8.aByteArray42;
		@Pc(52) short[] local52;
		@Pc(64) short[] local64;
		@Pc(56) short[] local56;
		@Pc(60) byte[] local60;
		if (this.aClass139_1 == null) {
			local60 = null;
			local56 = null;
			local64 = null;
			local52 = null;
		} else {
			local52 = this.aClass139_1.aShortArray49;
			local56 = this.aClass139_1.aShortArray51;
			local60 = this.aClass139_1.aByteArray29;
			local64 = this.aClass139_1.aShortArray50;
		}
		@Pc(79) short[] local79;
		@Pc(81) short[] local81;
		@Pc(83) short[] local83;
		@Pc(85) byte[] local85;
		if (local8.aClass139_1 == null) {
			local79 = null;
			local81 = null;
			local83 = null;
			local85 = null;
		} else {
			local83 = local8.aClass139_1.aShortArray51;
			local79 = local8.aClass139_1.aShortArray49;
			local85 = local8.aClass139_1.aByteArray29;
			local81 = local8.aClass139_1.aShortArray50;
		}
		@Pc(106) int[] local106 = local8.anIntArray414;
		@Pc(109) short[] local109 = local8.aShortArray75;
		if (!local8.aBoolean480) {
			local8.method5067();
		}
		@Pc(118) int local118 = local8.anInt5678;
		@Pc(121) int local121 = local8.anInt5644;
		@Pc(124) int local124 = local8.anInt5690;
		@Pc(127) int local127 = local8.anInt5685;
		@Pc(130) int local130 = local8.anInt5615;
		@Pc(133) int local133 = local8.anInt5633;
		for (@Pc(135) int local135 = 0; local135 < this.anInt5655; local135++) {
			@Pc(145) int local145 = this.anIntArray418[local135] - arg2;
			if (local145 >= local118 && local145 <= local121) {
				@Pc(165) int local165 = this.anIntArray415[local135] - arg1;
				if (local124 <= local165 && local127 >= local165) {
					@Pc(185) int local185 = this.anIntArray417[local135] - arg3;
					if (local185 >= local130 && local133 >= local185) {
						@Pc(199) int local199 = -1;
						@Pc(204) int local204 = this.anIntArray414[local135];
						@Pc(211) int local211 = this.anIntArray414[local135 + 1];
						for (@Pc(213) int local213 = local204; local213 < local211; local213++) {
							local199 = this.aShortArray75[local213] - 1;
							if (local199 == -1 || this.aByteArray42[local199] != 0) {
								break;
							}
						}
						if (local199 != -1) {
							for (@Pc(247) int local247 = 0; local247 < local24; local247++) {
								if (local165 == local27[local247] && local185 == local33[local247] && local145 == local30[local247]) {
									local211 = local106[local247 + 1];
									@Pc(276) int local276 = -1;
									local204 = local106[local247];
									for (@Pc(282) int local282 = local204; local282 < local211; local282++) {
										local276 = local109[local282] - 1;
										if (local276 == -1 || local45[local276] != 0) {
											break;
										}
									}
									if (local276 != -1) {
										if (local52 == null) {
											this.aClass139_1 = new Class139();
											local52 = this.aClass139_1.aShortArray49 = Static16.method432(this.aShortArray72);
											local64 = this.aClass139_1.aShortArray50 = Static16.method432(this.aShortArray65);
											local56 = this.aClass139_1.aShortArray51 = Static16.method432(this.aShortArray67);
											local60 = this.aClass139_1.aByteArray29 = Static74.method1215(this.aByteArray42);
										}
										if (local79 == null) {
											@Pc(364) Class139 local364 = local8.aClass139_1 = new Class139();
											local79 = local364.aShortArray49 = Static16.method432(local36);
											local81 = local364.aShortArray50 = Static16.method432(local39);
											local83 = local364.aShortArray51 = Static16.method432(local42);
											local85 = local364.aByteArray29 = Static74.method1215(local45);
										}
										@Pc(397) short local397 = this.aShortArray72[local199];
										@Pc(402) short local402 = this.aShortArray65[local199];
										@Pc(407) short local407 = this.aShortArray67[local199];
										local211 = local106[local247 + 1];
										local204 = local106[local247];
										@Pc(422) byte local422 = this.aByteArray42[local199];
										@Pc(432) int local432;
										for (@Pc(424) int local424 = local204; local424 < local211; local424++) {
											local432 = local109[local424] - 1;
											if (local432 == -1) {
												break;
											}
											if (local85[local432] != 0) {
												local79[local432] += local397;
												local81[local432] += local402;
												local83[local432] += local407;
												local85[local432] += local422;
											}
										}
										local422 = local45[local276];
										local397 = local36[local276];
										local402 = local39[local276];
										local407 = local42[local276];
										local204 = this.anIntArray414[local135];
										local211 = this.anIntArray414[local135 + 1];
										for (local432 = local204; local432 < local211; local432++) {
											@Pc(518) int local518 = this.aShortArray75[local432] - 1;
											if (local518 == -1) {
												break;
											}
											if (local60[local518] != 0) {
												local52[local518] += local397;
												local64[local518] += local402;
												local56[local518] += local407;
												local60[local518] += local422;
											}
										}
										local8.method5060();
										this.method5060();
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "RA", descriptor = "()I")
	@Override
	public int RA() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5685;
	}

	@OriginalMember(owner = "client!lj", name = "da", descriptor = "()I")
	@Override
	public int da() {
		return this.aShort75;
	}

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "(I)V")
	@Override
	public void k(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class5_Sub12_Sub1.anIntArray748[arg0];
		@Pc(13) int local13 = Class5_Sub12_Sub1.anIntArray749[arg0];
		@Pc(33) int local33;
		for (@Pc(15) int local15 = 0; local15 < this.anInt5655; local15++) {
			local33 = local13 * this.anIntArray415[local15] + this.anIntArray417[local15] * local9 >> 14;
			this.anIntArray417[local15] = local13 * this.anIntArray417[local15] - local9 * this.anIntArray415[local15] >> 14;
			this.anIntArray415[local15] = local33;
		}
		for (local33 = 0; local33 < this.anInt5675; local33++) {
			@Pc(83) int local83 = local13 * this.aShortArray72[local33] + this.aShortArray67[local33] * local9 >> 14;
			this.aShortArray67[local33] = (short) (this.aShortArray67[local33] * local13 - this.aShortArray72[local33] * local9 >> 14);
			this.aShortArray72[local33] = (short) local83;
		}
		this.method5077();
		this.method5060();
		this.aBoolean480 = false;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ofa;Lclient!vh;II)V")
	@Override
	public void method7950(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class14_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.anInt5675 == 0) {
			return;
		}
		@Pc(16) Class117_Sub2 local16 = this.aClass126_Sub2_12.aClass117_Sub2_16;
		@Pc(19) Class117_Sub2 local19 = (Class117_Sub2) arg0;
		if (!this.aBoolean480) {
			this.method5067();
		}
		Static539.aFloat191 = local16.aFloat60 * local19.aFloat58 + local19.aFloat59 * local16.aFloat55 + local19.aFloat57 * local16.aFloat58;
		Static410.aFloat145 = local16.aFloat49 + local16.aFloat58 * local19.aFloat52 + local19.aFloat56 * local16.aFloat55 + local16.aFloat60 * local19.aFloat49;
		@Pc(72) float local72 = Static410.aFloat145 + Static539.aFloat191 * (float) this.anInt5678;
		@Pc(80) float local80 = Static539.aFloat191 * (float) this.anInt5644 + Static410.aFloat145;
		@Pc(90) float local90;
		@Pc(96) float local96;
		if (local72 > local80) {
			local90 = local80 - (float) this.anInt5613;
			local96 = (float) this.anInt5613 + local72;
		} else {
			local90 = (float) -this.anInt5613 + local72;
			local96 = local80 + (float) this.anInt5613;
		}
		if (this.aClass126_Sub2_12.aFloat116 <= local90 || local96 <= (float) this.aClass126_Sub2_12.anInt6259) {
			return;
		}
		Static511.aFloat189 = local16.aFloat56 + local19.aFloat56 * local16.aFloat50 + local19.aFloat52 * local16.aFloat59 + local16.aFloat54 * local19.aFloat49;
		Static228.aFloat46 = local19.aFloat59 * local16.aFloat50 + local16.aFloat59 * local19.aFloat57 + local19.aFloat58 * local16.aFloat54;
		@Pc(173) float local173 = Static228.aFloat46 * (float) this.anInt5678 + Static511.aFloat189;
		@Pc(181) float local181 = Static511.aFloat189 + Static228.aFloat46 * (float) this.anInt5644;
		@Pc(207) float local207;
		@Pc(196) float local196;
		if (local173 > local181) {
			local196 = ((float) this.anInt5613 + local173) * (float) this.aClass126_Sub2_12.anInt6268;
			local207 = ((float) -this.anInt5613 + local181) * (float) this.aClass126_Sub2_12.anInt6268;
		} else {
			local196 = (local181 + (float) this.anInt5613) * (float) this.aClass126_Sub2_12.anInt6268;
			local207 = (local173 - (float) this.anInt5613) * (float) this.aClass126_Sub2_12.anInt6268;
		}
		if (local207 / (float) arg2 >= this.aClass126_Sub2_12.aFloat124 || local196 / (float) arg2 <= this.aClass126_Sub2_12.aFloat128) {
			return;
		}
		Static18.aFloat7 = local16.aFloat52 + local19.aFloat56 * local16.aFloat51 + local19.aFloat52 * local16.aFloat57 + local16.aFloat53 * local19.aFloat49;
		Static580.aFloat204 = local16.aFloat53 * local19.aFloat58 + local16.aFloat57 * local19.aFloat57 + local16.aFloat51 * local19.aFloat59;
		@Pc(299) float local299 = (float) this.anInt5678 * Static580.aFloat204 + Static18.aFloat7;
		@Pc(307) float local307 = Static580.aFloat204 * (float) this.anInt5644 + Static18.aFloat7;
		@Pc(323) float local323;
		@Pc(334) float local334;
		if (local307 < local299) {
			local323 = (float) this.aClass126_Sub2_12.anInt6287 * ((float) -this.anInt5613 + local307);
			local334 = (float) this.aClass126_Sub2_12.anInt6287 * ((float) this.anInt5613 + local299);
		} else {
			local334 = ((float) this.anInt5613 + local307) * (float) this.aClass126_Sub2_12.anInt6287;
			local323 = ((float) -this.anInt5613 + local299) * (float) this.aClass126_Sub2_12.anInt6287;
		}
		if (this.aClass126_Sub2_12.aFloat118 <= local323 / (float) arg2 || this.aClass126_Sub2_12.aFloat117 >= local334 / (float) arg2) {
			return;
		}
		if (arg1 != null || this.aClass152Array1 != null) {
			Static310.aFloat110 = local19.aFloat55 * local16.aFloat53 + local19.aFloat51 * local16.aFloat57 + local19.aFloat50 * local16.aFloat51;
			Static161.aFloat25 = local16.aFloat60 * local19.aFloat60 + local16.aFloat58 * local19.aFloat53 + local16.aFloat55 * local19.aFloat54;
			Static348.aFloat114 = local16.aFloat51 * local19.aFloat54 + local19.aFloat53 * local16.aFloat57 + local19.aFloat60 * local16.aFloat53;
			Static173.aFloat39 = local19.aFloat53 * local16.aFloat59 + local16.aFloat50 * local19.aFloat54 + local16.aFloat54 * local19.aFloat60;
			Static293.aFloat71 = local19.aFloat55 * local16.aFloat54 + local19.aFloat51 * local16.aFloat59 + local19.aFloat50 * local16.aFloat50;
			Static194.aFloat42 = local19.aFloat55 * local16.aFloat60 + local16.aFloat55 * local19.aFloat50 + local16.aFloat58 * local19.aFloat51;
		}
		if (arg1 != null) {
			@Pc(503) int local503 = this.anInt5690 + this.anInt5685 >> 1;
			@Pc(511) int local511 = this.anInt5633 + this.anInt5615 >> 1;
			@Pc(530) int local530 = (int) (Static173.aFloat39 * (float) local511 + (float) local503 * Static293.aFloat71 + Static511.aFloat189 + Static228.aFloat46 * (float) this.anInt5678);
			@Pc(549) int local549 = (int) ((float) local511 * Static348.aFloat114 + (float) local503 * Static310.aFloat110 + Static18.aFloat7 + Static580.aFloat204 * (float) this.anInt5678);
			@Pc(568) int local568 = (int) (Static161.aFloat25 * (float) local511 + (float) this.anInt5678 * Static539.aFloat191 + Static410.aFloat145 + (float) local503 * Static194.aFloat42);
			@Pc(587) int local587 = (int) (Static293.aFloat71 * (float) local503 + Static511.aFloat189 + (float) this.anInt5644 * Static228.aFloat46 + Static173.aFloat39 * (float) local511);
			@Pc(606) int local606 = (int) ((float) local503 * Static310.aFloat110 + Static18.aFloat7 + (float) this.anInt5644 * Static580.aFloat204 + (float) local511 * Static348.aFloat114);
			arg1.anInt9894 = this.aClass126_Sub2_12.anInt6257 + local606 * this.aClass126_Sub2_12.anInt6287 / arg2;
			arg1.anInt9898 = this.aClass126_Sub2_12.anInt6268 * local530 / arg2 + this.aClass126_Sub2_12.anInt6288;
			arg1.anInt9896 = this.aClass126_Sub2_12.anInt6268 * local587 / arg2 + this.aClass126_Sub2_12.anInt6288;
			arg1.anInt9897 = this.aClass126_Sub2_12.anInt6257 + local549 * this.aClass126_Sub2_12.anInt6287 / arg2;
			@Pc(678) int local678 = (int) (Static161.aFloat25 * (float) local511 + Static410.aFloat145 + (float) local503 * Static194.aFloat42 + (float) this.anInt5644 * Static539.aFloat191);
			if (this.aClass126_Sub2_12.anInt6259 <= local568 || local678 >= this.aClass126_Sub2_12.anInt6259) {
				arg1.anInt9895 = this.aClass126_Sub2_12.anInt6288 + (this.anInt5613 + local530) * this.aClass126_Sub2_12.anInt6268 / arg2 - arg1.anInt9898;
				arg1.aBoolean809 = true;
			}
		}
		this.aClass126_Sub2_12.method5497((float) arg2);
		this.aClass126_Sub2_12.method5572();
		this.aClass126_Sub2_12.method5465(local19);
		this.method5059();
		this.method5070();
	}

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "(I)V")
	public void method5073() {
		if (this.aClass344_4 != null) {
			this.aClass344_4.method8150();
		}
		if (this.aClass344_3 != null) {
			this.aClass344_3.method8150();
		}
		if (this.aClass344_2 != null) {
			this.aClass344_2.method8150();
		}
		if (this.aClass344_1 != null) {
			this.aClass344_1.method8150();
		}
		if (this.aClass113_1 != null) {
			this.aClass113_1.method2428();
		}
	}

	@OriginalMember(owner = "client!lj", name = "na", descriptor = "()I")
	@Override
	public int na() {
		if (!this.aBoolean480) {
			this.method5067();
		}
		return this.anInt5613;
	}

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "(I[IIIIZI[I)V")
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
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			local24 = 0;
			Static189.anInt3385 = 0;
			Static309.anInt5394 = 0;
			Static506.anInt3267 = 0;
			for (local32 = 0; local32 < local8; local32++) {
				local38 = arg1[local32];
				if (local38 < this.anIntArrayArray26.length) {
					local48 = this.anIntArrayArray26[local38];
					for (local50 = 0; local50 < local48.length; local50++) {
						local56 = local48[local50];
						if (this.aShortArray74 == null || (this.aShortArray74[local56] & arg6) != 0) {
							Static189.anInt3385 += this.anIntArray415[local56];
							Static309.anInt5394 += this.anIntArray418[local56];
							Static506.anInt3267 += this.anIntArray417[local56];
							local24++;
						}
					}
				}
			}
			if (local24 <= 0) {
				Static506.anInt3267 = arg4;
				Static189.anInt3385 = arg2;
				Static309.anInt5394 = arg3;
			} else {
				Static189.anInt3385 = arg2 + Static189.anInt3385 / local24;
				Static309.anInt5394 = Static309.anInt5394 / local24 + arg3;
				Static506.anInt3267 = Static506.anInt3267 / local24 + arg4;
				Static430.aBoolean605 = true;
			}
			return;
		}
		@Pc(250) int[] local250;
		@Pc(252) int local252;
		if (arg0 == 1) {
			if (arg7 != null) {
				local24 = arg2 * arg7[0] + arg7[1] * arg3 + arg7[2] * arg4 + 8192 >> 14;
				local32 = arg2 * arg7[3] + arg3 * arg7[4] + arg7[5] * arg4 + 8192 >> 14;
				local38 = arg3 * arg7[7] + arg7[6] * arg2 + arg4 * arg7[8] + 8192 >> 14;
				arg2 = local24;
				arg4 = local38;
				arg3 = local32;
			}
			arg4 <<= 0x4;
			arg3 <<= 0x4;
			arg2 <<= 0x4;
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (local32 < this.anIntArrayArray26.length) {
					local250 = this.anIntArrayArray26[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local50 = local250[local252];
						if (this.aShortArray74 == null || (this.aShortArray74[local50] & arg6) != 0) {
							this.anIntArray415[local50] += arg2;
							this.anIntArray418[local50] += arg3;
							this.anIntArray417[local50] += arg4;
						}
					}
				}
			}
			return;
		}
		@Pc(370) int local370;
		@Pc(392) int local392;
		@Pc(419) int local419;
		@Pc(450) int local450;
		@Pc(454) int local454;
		@Pc(458) int local458;
		@Pc(462) int local462;
		@Pc(470) int local470;
		@Pc(478) int local478;
		@Pc(633) int local633;
		@Pc(658) int local658;
		@Pc(663) int local663;
		@Pc(671) int local671;
		@Pc(676) int local676;
		@Pc(680) int local680;
		@Pc(684) int local684;
		@Pc(686) int local686;
		@Pc(815) int[] local815;
		@Pc(817) int local817;
		@Pc(821) int local821;
		@Pc(825) int local825;
		@Pc(827) int local827;
		@Pc(957) int local957;
		if (arg0 == 2) {
			if (arg7 == null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (this.anIntArrayArray26.length > local32) {
						local250 = this.anIntArrayArray26[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local50 = local250[local252];
							if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local50]) != 0) {
								this.anIntArray415[local50] -= Static189.anInt3385;
								this.anIntArray418[local50] -= Static309.anInt5394;
								this.anIntArray417[local50] -= Static506.anInt3267;
								if (arg4 != 0) {
									local56 = Class5_Sub12_Sub1.anIntArray748[arg4];
									local370 = Class5_Sub12_Sub1.anIntArray749[arg4];
									local392 = local370 * this.anIntArray415[local50] + this.anIntArray418[local50] * local56 + 16383 >> 14;
									this.anIntArray418[local50] = this.anIntArray418[local50] * local370 + 16383 - this.anIntArray415[local50] * local56 >> 14;
									this.anIntArray415[local50] = local392;
								}
								if (arg2 != 0) {
									local56 = Class5_Sub12_Sub1.anIntArray748[arg2];
									local370 = Class5_Sub12_Sub1.anIntArray749[arg2];
									local392 = local370 * this.anIntArray418[local50] + 16383 - this.anIntArray417[local50] * local56 >> 14;
									this.anIntArray417[local50] = this.anIntArray418[local50] * local56 + this.anIntArray417[local50] * local370 + 16383 >> 14;
									this.anIntArray418[local50] = local392;
								}
								if (arg3 != 0) {
									local56 = Class5_Sub12_Sub1.anIntArray748[arg3];
									local370 = Class5_Sub12_Sub1.anIntArray749[arg3];
									local392 = this.anIntArray415[local50] * local370 + this.anIntArray417[local50] * local56 + 16383 >> 14;
									this.anIntArray417[local50] = local370 * this.anIntArray417[local50] + 16383 - local56 * this.anIntArray415[local50] >> 14;
									this.anIntArray415[local50] = local392;
								}
								this.anIntArray415[local50] += Static189.anInt3385;
								this.anIntArray418[local50] += Static309.anInt5394;
								this.anIntArray417[local50] += Static506.anInt3267;
							}
						}
					}
				}
				if (arg5) {
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (this.anIntArrayArray26.length > local38) {
							local48 = this.anIntArrayArray26[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.aShortArray74 == null || (this.aShortArray74[local56] & arg6) != 0) {
									local370 = this.anIntArray414[local56];
									local392 = this.anIntArray414[local56 + 1];
									for (local419 = local370; local419 < local392; local419++) {
										local450 = this.aShortArray75[local419] - 1;
										if (local450 == -1) {
											break;
										}
										if (arg4 != 0) {
											local454 = Class5_Sub12_Sub1.anIntArray748[arg4];
											local458 = Class5_Sub12_Sub1.anIntArray749[arg4];
											local462 = this.aShortArray72[local450] * local458 + this.aShortArray65[local450] * local454 + 16383 >> 14;
											this.aShortArray65[local450] = (short) (this.aShortArray65[local450] * local458 + 16383 - this.aShortArray72[local450] * local454 >> 14);
											this.aShortArray72[local450] = (short) local462;
										}
										if (arg2 != 0) {
											local454 = Class5_Sub12_Sub1.anIntArray748[arg2];
											local458 = Class5_Sub12_Sub1.anIntArray749[arg2];
											local462 = this.aShortArray65[local450] * local458 + 16383 - local454 * this.aShortArray67[local450] >> 14;
											this.aShortArray67[local450] = (short) (this.aShortArray65[local450] * local454 + this.aShortArray67[local450] * local458 + 16383 >> 14);
											this.aShortArray65[local450] = (short) local462;
										}
										if (arg3 != 0) {
											local454 = Class5_Sub12_Sub1.anIntArray748[arg3];
											local458 = Class5_Sub12_Sub1.anIntArray749[arg3];
											local462 = this.aShortArray67[local450] * local454 + this.aShortArray72[local450] * local458 + 16383 >> 14;
											this.aShortArray67[local450] = (short) (this.aShortArray67[local450] * local458 + 16383 - this.aShortArray72[local450] * local454 >> 14);
											this.aShortArray72[local450] = (short) local462;
										}
									}
								}
							}
						}
					}
					this.method5060();
				}
			} else {
				local24 = arg7[9] << 4;
				local32 = arg7[10] << 4;
				local38 = arg7[11] << 4;
				local252 = arg7[12] << 4;
				local50 = arg7[13] << 4;
				local56 = arg7[14] << 4;
				if (Static430.aBoolean605) {
					local370 = Static506.anInt3267 * arg7[6] + arg7[3] * Static309.anInt5394 + arg7[0] * Static189.anInt3385 + 8192 >> 14;
					local392 = arg7[7] * Static506.anInt3267 + Static309.anInt5394 * arg7[4] + arg7[1] * Static189.anInt3385 + 8192 >> 14;
					local392 += local50;
					local419 = arg7[8] * Static506.anInt3267 + arg7[2] * Static189.anInt3385 + Static309.anInt5394 * arg7[5] + 8192 >> 14;
					local370 += local252;
					local419 += local56;
					Static309.anInt5394 = local392;
					Static189.anInt3385 = local370;
					Static430.aBoolean605 = false;
					Static506.anInt3267 = local419;
				}
				@Pc(438) int[] local438 = new int[9];
				local392 = Class5_Sub12_Sub1.anIntArray749[arg2];
				local419 = Class5_Sub12_Sub1.anIntArray748[arg2];
				local450 = Class5_Sub12_Sub1.anIntArray749[arg3];
				local454 = Class5_Sub12_Sub1.anIntArray748[arg3];
				local458 = Class5_Sub12_Sub1.anIntArray749[arg4];
				local462 = Class5_Sub12_Sub1.anIntArray748[arg4];
				local470 = local419 * local458 + 8192 >> 14;
				local478 = local462 * local419 + 8192 >> 14;
				local438[5] = -local419;
				local438[3] = local462 * local392 + 8192 >> 14;
				local438[4] = local458 * local392 + 8192 >> 14;
				local438[6] = local458 * -local454 + local450 * local478 + 8192 >> 14;
				local438[2] = local454 * local392 + 8192 >> 14;
				local438[1] = local470 * local454 + -local450 * local462 + 8192 >> 14;
				local438[8] = local450 * local392 + 8192 >> 14;
				local438[7] = local462 * local454 + local450 * local470 + 8192 >> 14;
				local438[0] = local458 * local450 + local454 * local478 + 8192 >> 14;
				@Pc(608) int local608 = local438[0] * -Static189.anInt3385 + -Static309.anInt5394 * local438[1] + -Static506.anInt3267 * local438[2] + 8192 >> 14;
				local633 = local438[5] * -Static506.anInt3267 + local438[4] * -Static309.anInt5394 + -Static189.anInt3385 * local438[3] + 8192 >> 14;
				local658 = local438[8] * -Static506.anInt3267 + local438[7] * -Static309.anInt5394 + local438[6] * -Static189.anInt3385 + 8192 >> 14;
				local663 = local608 + Static189.anInt3385;
				@Pc(667) int local667 = Static309.anInt5394 + local633;
				local671 = Static506.anInt3267 + local658;
				@Pc(674) int[] local674 = new int[9];
				for (local676 = 0; local676 < 3; local676++) {
					for (local680 = 0; local680 < 3; local680++) {
						local684 = 0;
						for (local686 = 0; local686 < 3; local686++) {
							local684 += local438[local686 + local676 * 3] * arg7[local686 + local680 * 3];
						}
						local674[local680 + local676 * 3] = local684 + 8192 >> 14;
					}
				}
				local680 = local56 * local438[2] + local438[0] * local252 + local50 * local438[1] + 8192 >> 14;
				local684 = local438[5] * local56 + local438[4] * local50 + local252 * local438[3] + 8192 >> 14;
				local680 += local663;
				local686 = local50 * local438[7] + local438[6] * local252 + local56 * local438[8] + 8192 >> 14;
				local684 += local667;
				local686 += local671;
				local815 = new int[9];
				for (local817 = 0; local817 < 3; local817++) {
					for (local821 = 0; local821 < 3; local821++) {
						local825 = 0;
						for (local827 = 0; local827 < 3; local827++) {
							local825 += local674[local821 + local827 * 3] * arg7[local817 * 3 + local827];
						}
						local815[local821 + local817 * 3] = local825 + 8192 >> 14;
					}
				}
				local821 = local684 * arg7[1] + arg7[0] * local680 + local686 * arg7[2] + 8192 >> 14;
				local825 = local686 * arg7[5] + local684 * arg7[4] + arg7[3] * local680 + 8192 >> 14;
				local827 = local684 * arg7[7] + local680 * arg7[6] + local686 * arg7[8] + 8192 >> 14;
				local821 += local24;
				local825 += local32;
				local827 += local38;
				for (local957 = 0; local957 < local8; local957++) {
					@Pc(963) int local963 = arg1[local957];
					if (local963 < this.anIntArrayArray26.length) {
						@Pc(977) int[] local977 = this.anIntArrayArray26[local963];
						for (@Pc(979) int local979 = 0; local979 < local977.length; local979++) {
							@Pc(985) int local985 = local977[local979];
							if (this.aShortArray74 == null || (this.aShortArray74[local985] & arg6) != 0) {
								@Pc(1030) int local1030 = this.anIntArray415[local985] * local815[0] + this.anIntArray418[local985] * local815[1] + this.anIntArray417[local985] * local815[2] + 8192 >> 14;
								@Pc(1061) int local1061 = this.anIntArray418[local985] * local815[4] + local815[3] * this.anIntArray415[local985] + this.anIntArray417[local985] * local815[5] + 8192 >> 14;
								@Pc(1065) int local1065 = local1061 + local825;
								@Pc(1096) int local1096 = local815[8] * this.anIntArray417[local985] + local815[6] * this.anIntArray415[local985] + local815[7] * this.anIntArray418[local985] + 8192 >> 14;
								@Pc(1100) int local1100 = local1030 + local821;
								@Pc(1104) int local1104 = local1096 + local827;
								this.anIntArray415[local985] = local1100;
								this.anIntArray418[local985] = local1065;
								this.anIntArray417[local985] = local1104;
							}
						}
					}
				}
			}
		} else if (arg0 != 3) {
			@Pc(2583) Class297 local2583;
			@Pc(2465) boolean local2465;
			@Pc(2578) Class152 local2578;
			if (arg0 == 5) {
				if (this.anIntArrayArray24 != null) {
					local2465 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray24.length) {
							local48 = this.anIntArrayArray24[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.lb == null || (arg6 & this.lb[local56]) != 0) {
									local370 = arg2 * 8 + (this.aByteArray44[local56] & 0xFF);
									if (local370 < 0) {
										local370 = 0;
									} else if (local370 > 255) {
										local370 = 255;
									}
									this.aByteArray44[local56] = (byte) local370;
								}
							}
							local2465 |= local48.length > 0;
						}
					}
					if (local2465) {
						if (this.aClass152Array1 != null) {
							for (local38 = 0; local38 < this.anInt5676; local38++) {
								local2578 = this.aClass152Array1[local38];
								local2583 = this.aClass297Array1[local38];
								local2583.anInt8027 = local2583.anInt8027 & 0xFFFFFF | 255 - (this.aByteArray44[local2578.anInt3959] & 0xFF) << 24;
							}
						}
						this.method5061();
					}
				}
			} else if (arg0 == 7) {
				if (this.anIntArrayArray24 != null) {
					local2465 = false;
					for (local32 = 0; local32 < local8; local32++) {
						local38 = arg1[local32];
						if (local38 < this.anIntArrayArray24.length) {
							local48 = this.anIntArrayArray24[local38];
							for (local50 = 0; local50 < local48.length; local50++) {
								local56 = local48[local50];
								if (this.lb == null || (this.lb[local56] & arg6) != 0) {
									local370 = this.aShortArray70[local56] & 0xFFFF;
									local392 = local370 >> 10 & 0x3F;
									local419 = local370 >> 7 & 0x7;
									local450 = local370 & 0x7F;
									@Pc(2684) int local2684 = arg2 + local392 & 0x3F;
									local419 += arg3 / 4;
									local450 += arg4;
									if (local419 < 0) {
										local419 = 0;
									} else if (local419 > 7) {
										local419 = 7;
									}
									if (local450 < 0) {
										local450 = 0;
									} else if (local450 > 127) {
										local450 = 127;
									}
									this.aShortArray70[local56] = (short) (local450 | local419 << 7 | local2684 << 10);
								}
							}
							local2465 |= local48.length > 0;
						}
					}
					if (local2465) {
						if (this.aClass152Array1 != null) {
							for (local38 = 0; local38 < this.anInt5676; local38++) {
								local2578 = this.aClass152Array1[local38];
								local2583 = this.aClass297Array1[local38];
								local2583.anInt8027 = local2583.anInt8027 & 0xFF000000 | Static643.anIntArray836[this.aShortArray70[local2578.anInt3959] & 0xFFFF] & 0xFFFFFF;
							}
						}
						this.method5061();
					}
				}
			} else if (arg0 == 8) {
				if (this.anIntArrayArray25 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (local32 < this.anIntArrayArray25.length) {
							local250 = this.anIntArrayArray25[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2583 = this.aClass297Array1[local250[local252]];
								local2583.anInt8021 += arg3;
								local2583.anInt8026 += arg2;
							}
						}
					}
				}
			} else if (arg0 == 10) {
				if (this.anIntArrayArray25 != null) {
					for (local24 = 0; local24 < local8; local24++) {
						local32 = arg1[local24];
						if (this.anIntArrayArray25.length > local32) {
							local250 = this.anIntArrayArray25[local32];
							for (local252 = 0; local252 < local250.length; local252++) {
								local2583 = this.aClass297Array1[local250[local252]];
								local2583.anInt8023 = local2583.anInt8023 * arg2 >> 7;
								local2583.anInt8022 = local2583.anInt8022 * arg3 >> 7;
							}
						}
					}
				}
			} else if (arg0 == 9 && this.anIntArrayArray25 != null) {
				for (local24 = 0; local24 < local8; local24++) {
					local32 = arg1[local24];
					if (local32 < this.anIntArrayArray25.length) {
						local250 = this.anIntArrayArray25[local32];
						for (local252 = 0; local252 < local250.length; local252++) {
							local2583 = this.aClass297Array1[local250[local252]];
							local2583.anInt8024 = local2583.anInt8024 + arg2 & 0x3FFF;
						}
					}
				}
			}
		} else if (arg7 == null) {
			for (local24 = 0; local24 < local8; local24++) {
				local32 = arg1[local24];
				if (this.anIntArrayArray26.length > local32) {
					local250 = this.anIntArrayArray26[local32];
					for (local252 = 0; local252 < local250.length; local252++) {
						local50 = local250[local252];
						if (this.aShortArray74 == null || (arg6 & this.aShortArray74[local50]) != 0) {
							this.anIntArray415[local50] -= Static189.anInt3385;
							this.anIntArray418[local50] -= Static309.anInt5394;
							this.anIntArray417[local50] -= Static506.anInt3267;
							this.anIntArray415[local50] = arg2 * this.anIntArray415[local50] >> 7;
							this.anIntArray418[local50] = this.anIntArray418[local50] * arg3 >> 7;
							this.anIntArray417[local50] = this.anIntArray417[local50] * arg4 >> 7;
							this.anIntArray415[local50] += Static189.anInt3385;
							this.anIntArray418[local50] += Static309.anInt5394;
							this.anIntArray417[local50] += Static506.anInt3267;
						}
					}
				}
			}
		} else {
			local24 = arg7[9] << 4;
			local32 = arg7[10] << 4;
			local38 = arg7[11] << 4;
			local252 = arg7[12] << 4;
			local50 = arg7[13] << 4;
			local56 = arg7[14] << 4;
			if (Static430.aBoolean605) {
				local370 = arg7[6] * Static506.anInt3267 + Static309.anInt5394 * arg7[3] + arg7[0] * Static189.anInt3385 + 8192 >> 14;
				local392 = arg7[7] * Static506.anInt3267 + Static309.anInt5394 * arg7[4] + Static189.anInt3385 * arg7[1] + 8192 >> 14;
				local392 += local50;
				local419 = Static506.anInt3267 * arg7[8] + Static309.anInt5394 * arg7[5] + Static189.anInt3385 * arg7[2] + 8192 >> 14;
				local370 += local252;
				Static309.anInt5394 = local392;
				local419 += local56;
				Static189.anInt3385 = local370;
				Static506.anInt3267 = local419;
				Static430.aBoolean605 = false;
			}
			local370 = arg2 << 15 >> 7;
			local392 = arg3 << 15 >> 7;
			local419 = arg4 << 15 >> 7;
			local450 = local370 * -Static189.anInt3385 + 8192 >> 14;
			local454 = local392 * -Static309.anInt5394 + 8192 >> 14;
			local458 = local419 * -Static506.anInt3267 + 8192 >> 14;
			local462 = Static189.anInt3385 + local450;
			local470 = Static309.anInt5394 + local454;
			local478 = local458 + Static506.anInt3267;
			@Pc(1862) int[] local1862 = new int[] { arg7[0] * local370 + 8192 >> 14, arg7[3] * local370 + 8192 >> 14, local370 * arg7[6] + 8192 >> 14, arg7[1] * local392 + 8192 >> 14, arg7[4] * local392 + 8192 >> 14, arg7[7] * local392 + 8192 >> 14, local419 * arg7[2] + 8192 >> 14, arg7[5] * local419 + 8192 >> 14, local419 * arg7[8] + 8192 >> 14 };
			local633 = local370 * local252 + 8192 >> 14;
			local658 = local392 * local50 + 8192 >> 14;
			@Pc(1990) int local1990 = local658 + local470;
			@Pc(1994) int local1994 = local633 + local462;
			local663 = local56 * local419 + 8192 >> 14;
			@Pc(2006) int local2006 = local663 + local478;
			@Pc(2009) int[] local2009 = new int[9];
			@Pc(2015) int local2015;
			for (local671 = 0; local671 < 3; local671++) {
				for (local2015 = 0; local2015 < 3; local2015++) {
					local676 = 0;
					for (local680 = 0; local680 < 3; local680++) {
						local676 += arg7[local680 + local671 * 3] * local1862[local2015 + local680 * 3];
					}
					local2009[local2015 + local671 * 3] = local676 + 8192 >> 14;
				}
			}
			local2015 = local1994 * arg7[0] + local1990 * arg7[1] + local2006 * arg7[2] + 8192 >> 14;
			local676 = local1994 * arg7[3] + arg7[4] * local1990 + local2006 * arg7[5] + 8192 >> 14;
			local676 += local32;
			local2015 += local24;
			local680 = arg7[8] * local2006 + local1994 * arg7[6] + local1990 * arg7[7] + 8192 >> 14;
			local680 += local38;
			for (local684 = 0; local684 < local8; local684++) {
				local686 = arg1[local684];
				if (this.anIntArrayArray26.length > local686) {
					local815 = this.anIntArrayArray26[local686];
					for (local817 = 0; local817 < local815.length; local817++) {
						local821 = local815[local817];
						if (this.aShortArray74 == null || (this.aShortArray74[local821] & arg6) != 0) {
							local825 = local2009[1] * this.anIntArray418[local821] + local2009[0] * this.anIntArray415[local821] + this.anIntArray417[local821] * local2009[2] + 8192 >> 14;
							local827 = this.anIntArray417[local821] * local2009[5] + local2009[4] * this.anIntArray418[local821] + local2009[3] * this.anIntArray415[local821] + 8192 >> 14;
							@Pc(2252) int local2252 = local827 + local676;
							local957 = local2009[8] * this.anIntArray417[local821] + local2009[6] * this.anIntArray415[local821] + local2009[7] * this.anIntArray418[local821] + 8192 >> 14;
							@Pc(2288) int local2288 = local825 + local2015;
							this.anIntArray415[local821] = local2288;
							@Pc(2297) int local2297 = local957 + local680;
							this.anIntArray418[local821] = local2252;
							this.anIntArray417[local821] = local2297;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLclient!hv;)V")
	private void method5075(@OriginalArg(1) Class5_Sub4_Sub10_Sub2 arg0) {
		if (Static275.anIntArray678.length < this.anInt5675) {
			Static275.anIntArray678 = new int[this.anInt5675];
			Static556.anIntArray706 = new int[this.anInt5675];
		}
		@Pc(55) int local55;
		@Pc(93) int local93;
		@Pc(102) int local102;
		for (@Pc(28) int local28 = 0; local28 < this.anInt5655; local28++) {
			local55 = (this.anIntArray415[local28] - (this.aClass126_Sub2_12.anInt6276 * this.anIntArray418[local28] >> 8) >> this.aClass126_Sub2_12.anInt6254) - arg0.anInt3820;
			@Pc(79) int local79 = (this.anIntArray417[local28] - (this.aClass126_Sub2_12.anInt6261 * this.anIntArray418[local28] >> 8) >> this.aClass126_Sub2_12.anInt6254) - arg0.anInt3819;
			@Pc(84) int local84 = this.anIntArray414[local28];
			@Pc(91) int local91 = this.anIntArray414[local28 + 1];
			for (local93 = local84; local93 < local91; local93++) {
				local102 = this.aShortArray75[local93] - 1;
				if (local102 == -1) {
					break;
				}
				Static275.anIntArray678[local102] = local55;
				Static556.anIntArray706[local102] = local79;
			}
		}
		for (local55 = 0; local55 < this.anInt5663; local55++) {
			if (this.aByteArray44 == null || this.aByteArray44[local55] <= 128) {
				@Pc(147) short local147 = this.aShortArray68[local55];
				@Pc(152) short local152 = this.aShortArray64[local55];
				@Pc(157) short local157 = this.aShortArray71[local55];
				local93 = Static275.anIntArray678[local147];
				local102 = Static275.anIntArray678[local152];
				@Pc(169) int local169 = Static275.anIntArray678[local157];
				@Pc(173) int local173 = Static556.anIntArray706[local147];
				@Pc(177) int local177 = Static556.anIntArray706[local152];
				@Pc(181) int local181 = Static556.anIntArray706[local157];
				if (-((local169 - local102) * (local177 - local173)) + (local93 - local102) * (local177 - local181) > 0) {
					arg0.method3415(local93, local102, local177, local181, local173, local169);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "e", descriptor = "()[Lclient!cm;")
	@Override
	public Class57[] method7940() {
		return this.aClass57Array2;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "()V")
	@Override
	protected void method7934() {
	}

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "(I)V")
	private void method5077() {
		if (this.aClass344_4 != null) {
			this.aClass344_4.aBoolean766 = false;
		}
	}

	@OriginalMember(owner = "client!lj", name = "P", descriptor = "(IIII)V")
	@Override
	protected void P(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg0 == 0) {
			Static189.anInt3385 = 0;
			Static309.anInt5394 = 0;
			local16 = 0;
			Static506.anInt3267 = 0;
			for (local20 = 0; local20 < this.anInt5655; local20++) {
				Static189.anInt3385 += this.anIntArray415[local20];
				Static309.anInt5394 += this.anIntArray418[local20];
				local16++;
				Static506.anInt3267 += this.anIntArray417[local20];
			}
			if (local16 > 0) {
				Static309.anInt5394 = arg2 + Static309.anInt5394 / local16;
				Static189.anInt3385 = Static189.anInt3385 / local16 + arg1;
				Static506.anInt3267 = arg3 + Static506.anInt3267 / local16;
			} else {
				Static506.anInt3267 = arg3;
				Static309.anInt5394 = arg2;
				Static189.anInt3385 = arg1;
			}
		} else if (arg0 == 1) {
			for (local16 = 0; local16 < this.anInt5655; local16++) {
				this.anIntArray415[local16] += arg1;
				this.anIntArray418[local16] += arg2;
				this.anIntArray417[local16] += arg3;
			}
		} else {
			@Pc(174) int local174;
			@Pc(192) int local192;
			if (arg0 == 2) {
				for (local16 = 0; local16 < this.anInt5655; local16++) {
					this.anIntArray415[local16] -= Static189.anInt3385;
					this.anIntArray418[local16] -= Static309.anInt5394;
					this.anIntArray417[local16] -= Static506.anInt3267;
					if (arg3 != 0) {
						local20 = Class5_Sub12_Sub1.anIntArray748[arg3];
						local174 = Class5_Sub12_Sub1.anIntArray749[arg3];
						local192 = this.anIntArray415[local16] * local174 + local20 * this.anIntArray418[local16] + 16383 >> 14;
						this.anIntArray418[local16] = this.anIntArray418[local16] * local174 + 16383 - this.anIntArray415[local16] * local20 >> 14;
						this.anIntArray415[local16] = local192;
					}
					if (arg1 != 0) {
						local20 = Class5_Sub12_Sub1.anIntArray748[arg1];
						local174 = Class5_Sub12_Sub1.anIntArray749[arg1];
						local192 = local174 * this.anIntArray418[local16] + 16383 - local20 * this.anIntArray417[local16] >> 14;
						this.anIntArray417[local16] = local20 * this.anIntArray418[local16] + this.anIntArray417[local16] * local174 + 16383 >> 14;
						this.anIntArray418[local16] = local192;
					}
					if (arg2 != 0) {
						local20 = Class5_Sub12_Sub1.anIntArray748[arg2];
						local174 = Class5_Sub12_Sub1.anIntArray749[arg2];
						local192 = local174 * this.anIntArray415[local16] + this.anIntArray417[local16] * local20 + 16383 >> 14;
						this.anIntArray417[local16] = this.anIntArray417[local16] * local174 + 16383 - this.anIntArray415[local16] * local20 >> 14;
						this.anIntArray415[local16] = local192;
					}
					this.anIntArray415[local16] += Static189.anInt3385;
					this.anIntArray418[local16] += Static309.anInt5394;
					this.anIntArray417[local16] += Static506.anInt3267;
				}
			} else if (arg0 == 3) {
				for (local16 = 0; local16 < this.anInt5655; local16++) {
					this.anIntArray415[local16] -= Static189.anInt3385;
					this.anIntArray418[local16] -= Static309.anInt5394;
					this.anIntArray417[local16] -= Static506.anInt3267;
					this.anIntArray415[local16] = this.anIntArray415[local16] * arg1 / 128;
					this.anIntArray418[local16] = this.anIntArray418[local16] * arg2 / 128;
					this.anIntArray417[local16] = arg3 * this.anIntArray417[local16] / 128;
					this.anIntArray415[local16] += Static189.anInt3385;
					this.anIntArray418[local16] += Static309.anInt5394;
					this.anIntArray417[local16] += Static506.anInt3267;
				}
			} else {
				@Pc(517) Class152 local517;
				@Pc(522) Class297 local522;
				if (arg0 == 5) {
					for (local16 = 0; local16 < this.anInt5635; local16++) {
						local20 = arg1 * 8 + (this.aByteArray44[local16] & 0xFF);
						if (local20 < 0) {
							local20 = 0;
						} else if (local20 > 255) {
							local20 = 255;
						}
						this.aByteArray44[local16] = (byte) local20;
					}
					if (this.aClass152Array1 != null) {
						for (local20 = 0; local20 < this.anInt5676; local20++) {
							local517 = this.aClass152Array1[local20];
							local522 = this.aClass297Array1[local20];
							local522.anInt8027 = local522.anInt8027 & 0xFFFFFF | 255 - (this.aByteArray44[local517.anInt3959] & 0xFF) << 24;
						}
					}
					this.method5061();
				} else if (arg0 == 7) {
					for (local16 = 0; local16 < this.anInt5635; local16++) {
						local20 = this.aShortArray70[local16] & 0xFFFF;
						local174 = local20 >> 10 & 0x3F;
						local192 = local20 >> 7 & 0x7;
						@Pc(584) int local584 = local20 & 0x7F;
						@Pc(590) int local590 = arg1 + local174 & 0x3F;
						local192 += arg2 / 4;
						local584 += arg3;
						if (local192 < 0) {
							local192 = 0;
						} else if (local192 > 7) {
							local192 = 7;
						}
						if (local584 < 0) {
							local584 = 0;
						} else if (local584 > 127) {
							local584 = 127;
						}
						this.aShortArray70[local16] = (short) (local584 | local590 << 10 | local192 << 7);
					}
					if (this.aClass152Array1 != null) {
						for (local20 = 0; local20 < this.anInt5676; local20++) {
							local517 = this.aClass152Array1[local20];
							local522 = this.aClass297Array1[local20];
							local522.anInt8027 = local522.anInt8027 & 0xFF000000 | Static643.anIntArray836[this.aShortArray70[local517.anInt3959] & 0xFFFF] & 0xFFFFFF;
						}
					}
					this.method5061();
				} else {
					@Pc(709) Class297 local709;
					if (arg0 == 8) {
						for (local16 = 0; local16 < this.anInt5676; local16++) {
							local709 = this.aClass297Array1[local16];
							local709.anInt8026 += arg1;
							local709.anInt8021 += arg2;
						}
					} else if (arg0 == 10) {
						for (local16 = 0; local16 < this.anInt5676; local16++) {
							local709 = this.aClass297Array1[local16];
							local709.anInt8022 = arg2 * local709.anInt8022 >> 7;
							local709.anInt8023 = arg1 * local709.anInt8023 >> 7;
						}
					} else if (arg0 == 9) {
						for (local16 = 0; local16 < this.anInt5676; local16++) {
							local709 = this.aClass297Array1[local16];
							local709.anInt8024 = arg1 + local709.anInt8024 & 0x3FFF;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lj", name = "NA", descriptor = "()Z")
	@Override
	protected boolean NA() {
		if (this.anIntArrayArray26 == null) {
			return false;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anInt5614; local12++) {
			this.anIntArray415[local12] <<= 0x4;
			this.anIntArray418[local12] <<= 0x4;
			this.anIntArray417[local12] <<= 0x4;
		}
		Static309.anInt5394 = 0;
		Static506.anInt3267 = 0;
		Static189.anInt3385 = 0;
		return true;
	}

	@OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
	private void method5078() {
		if (!this.aBoolean477) {
			return;
		}
		this.aBoolean477 = false;
		if (this.aClass57Array2 == null && this.aClass143Array2 == null && this.aClass152Array1 == null) {
			if (this.anIntArray415 != null && !Static459.method6821(this.anInt5624, this.anInt5673)) {
				if (this.aClass344_4 == null || this.aClass344_4.method8151()) {
					if (!this.aBoolean480) {
						this.method5067();
					}
					this.anIntArray415 = null;
				} else {
					this.aBoolean477 = true;
				}
			}
			if (this.anIntArray418 != null && !Static423.method6390(this.anInt5624, this.anInt5673)) {
				if (this.aClass344_4 == null || this.aClass344_4.method8151()) {
					if (!this.aBoolean480) {
						this.method5067();
					}
					this.anIntArray418 = null;
				} else {
					this.aBoolean477 = true;
				}
			}
			if (this.anIntArray417 != null && !Static410.method6264(this.anInt5673, this.anInt5624)) {
				if (this.aClass344_4 == null || this.aClass344_4.method8151()) {
					if (!this.aBoolean480) {
						this.method5067();
					}
					this.anIntArray417 = null;
				} else {
					this.aBoolean477 = true;
				}
			}
		}
		if (this.aShortArray75 != null && this.anIntArray415 == null && this.anIntArray418 == null && this.anIntArray417 == null) {
			this.anIntArray414 = null;
			this.aShortArray75 = null;
		}
		if (this.aByteArray42 != null && !Static523.method7489(this.anInt5673, this.anInt5624)) {
			label197: {
				label196: {
					@Pc(170) boolean local170;
					if ((this.anInt5673 & 0x37) == 0) {
						if (this.aClass344_2 == null || this.aClass344_2.method8151()) {
							break label196;
						}
						local170 = false;
					} else {
						if (this.aClass344_1 == null || this.aClass344_1.method8151()) {
							break label196;
						}
						local170 = false;
					}
					if (!local170) {
						this.aBoolean477 = true;
						break label197;
					}
				}
				this.aShortArray72 = this.aShortArray65 = this.aShortArray67 = null;
				this.aByteArray42 = null;
			}
		}
		if (this.aShortArray70 != null && !Static636.method8771(this.anInt5624, this.anInt5673)) {
			if (this.aClass344_2 == null || this.aClass344_2.method8151()) {
				this.aShortArray70 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.aByteArray44 != null && !Static322.method4991(this.anInt5624, this.anInt5673)) {
			if (this.aClass344_2 == null || this.aClass344_2.method8151()) {
				this.aByteArray44 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.aFloatArray32 != null && !Static620.method8542(this.anInt5673, this.anInt5624)) {
			if (this.aClass344_3 == null || this.aClass344_3.method8151()) {
				this.aFloatArray32 = this.aFloatArray31 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.aShortArray73 != null && !Static471.method6900(this.anInt5673, this.anInt5624)) {
			if (this.aClass344_2 == null || this.aClass344_2.method8151()) {
				this.aShortArray73 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.aShortArray68 != null && !Static353.method5595(this.anInt5624, this.anInt5673)) {
			if ((this.aClass113_1 == null || this.aClass113_1.method2426()) && (this.aClass344_2 == null || this.aClass344_2.method8151())) {
				this.aShortArray68 = this.aShortArray64 = this.aShortArray71 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.aShortArray66 != null) {
			if (this.aClass344_4 == null || this.aClass344_4.method8151()) {
				this.aShortArray66 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.aShortArray69 != null) {
			if (this.aClass344_2 == null || this.aClass344_2.method8151()) {
				this.aShortArray69 = null;
			} else {
				this.aBoolean477 = true;
			}
		}
		if (this.anIntArrayArray24 != null && !Static511.method7385(this.anInt5673, this.anInt5624)) {
			this.anIntArrayArray24 = null;
			this.lb = null;
		}
		if (this.anIntArrayArray26 != null && !Static1.method5725(this.anInt5673, this.anInt5624)) {
			this.aShortArray74 = null;
			this.anIntArrayArray26 = null;
		}
		if (this.anIntArrayArray25 != null && !Static98.method3778(this.anInt5673, this.anInt5624)) {
			this.anIntArrayArray25 = null;
		}
		if (this.anIntArray416 != null && (this.anInt5624 & 0x800) == 0 && (this.anInt5624 & 0x40000) == 0) {
			this.anIntArray419 = null;
			this.anIntArray420 = null;
			this.anIntArray416 = null;
		}
	}

	@OriginalMember(owner = "client!lj", name = "n", descriptor = "(I)Z")
	private boolean method5079() {
		if (this.aClass113_1.aBoolean247) {
			return true;
		}
		if (this.aClass113_1.anInterface21_2 == null) {
			this.aClass113_1.anInterface21_2 = this.aClass126_Sub2_12.method5444(this.aBoolean481);
		}
		@Pc(34) Interface21 local34 = this.aClass113_1.anInterface21_2;
		local34.method5732(this.anInt5663 * 6);
		@Pc(48) Buffer local48 = local34.method5730();
		if (local48 != null) {
			@Pc(56) Stream local56 = this.aClass126_Sub2_12.method5446(local48);
			@Pc(60) int local60;
			if (Stream.b()) {
				for (local60 = 0; local60 < this.anInt5663; local60++) {
					local56.b(this.aShortArray68[local60]);
					local56.b(this.aShortArray64[local60]);
					local56.b(this.aShortArray71[local60]);
				}
			} else {
				for (local60 = 0; local60 < this.anInt5663; local60++) {
					local56.d(this.aShortArray68[local60]);
					local56.d(this.aShortArray64[local60]);
					local56.d(this.aShortArray71[local60]);
				}
			}
			local56.a();
			if (local34.method5734()) {
				this.aBoolean477 = true;
				this.aClass113_1.anInterface21_3 = local34;
				this.aClass113_1.aBoolean247 = true;
				return true;
			}
		}
		return false;
	}
}
