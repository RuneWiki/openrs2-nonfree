import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class4_Sub1_Sub3_Sub3 extends Class4_Sub1_Sub3 {

	@OriginalMember(owner = "client!od", name = "T", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "I")
	private int anInt2232;

	@OriginalMember(owner = "client!od", name = "W", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!od", name = "X", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "I")
	private int anInt2233;

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!od", name = "eb", descriptor = "[S")
	public short[] aShortArray24;

	@OriginalMember(owner = "client!od", name = "fb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!od", name = "ib", descriptor = "[B")
	public byte[] aByteArray30;

	@OriginalMember(owner = "client!od", name = "jb", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!od", name = "lb", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!od", name = "mb", descriptor = "I")
	private int anInt2235;

	@OriginalMember(owner = "client!od", name = "nb", descriptor = "I")
	private int anInt2236;

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "I")
	private int anInt2237;

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!od", name = "rb", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!od", name = "sb", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!od", name = "wb", descriptor = "[I")
	public int[] anIntArray237;

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "B")
	public byte aByte4 = 0;

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "I")
	public int anInt2234 = 0;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "Z")
	public boolean aBoolean199 = false;

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "I")
	public int anInt2238 = 0;

	@OriginalMember(owner = "client!od", name = "ub", descriptor = "I")
	public int anInt2239 = 0;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub3_Sub3() {
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "([Lclient!od;I)V")
	public Class4_Sub1_Sub3_Sub3(@OriginalArg(0) Class4_Sub1_Sub3_Sub3[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2238 = 0;
		this.anInt2239 = 0;
		this.anInt2234 = 0;
		this.aByte4 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class4_Sub1_Sub3_Sub3 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2238 += local43.anInt2238;
				this.anInt2239 += local43.anInt2239;
				this.anInt2234 += local43.anInt2234;
				if (local43.aByteArray33 == null) {
					if (this.aByte4 == -1) {
						this.aByte4 = local43.aByte4;
					}
					if (this.aByte4 != local43.aByte4) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray30 != null;
				local22 |= local43.aShortArray24 != null;
				local24 |= local43.aByteArray31 != null;
			}
		}
		this.anIntArray233 = new int[this.anInt2238];
		this.anIntArray226 = new int[this.anInt2238];
		this.anIntArray230 = new int[this.anInt2238];
		this.anIntArray234 = new int[this.anInt2239];
		this.anIntArray231 = new int[this.anInt2239];
		this.anIntArray236 = new int[this.anInt2239];
		this.anIntArray235 = new int[this.anInt2239];
		this.anIntArray229 = new int[this.anInt2239];
		this.anIntArray227 = new int[this.anInt2239];
		if (local18) {
			this.aByteArray33 = new byte[this.anInt2239];
		}
		if (local20) {
			this.aByteArray30 = new byte[this.anInt2239];
		}
		if (local22) {
			this.aShortArray24 = new short[this.anInt2239];
		}
		if (local24) {
			this.aByteArray31 = new byte[this.anInt2239];
		}
		if (this.anInt2234 > 0) {
			this.anIntArray237 = new int[this.anInt2234];
			this.anIntArray232 = new int[this.anInt2234];
			this.anIntArray228 = new int[this.anInt2234];
		}
		this.anInt2238 = 0;
		this.anInt2239 = 0;
		this.anInt2234 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class4_Sub1_Sub3_Sub3 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2239; local229++) {
					this.anIntArray234[this.anInt2239] = local225.anIntArray234[local229] + this.anInt2238;
					this.anIntArray231[this.anInt2239] = local225.anIntArray231[local229] + this.anInt2238;
					this.anIntArray236[this.anInt2239] = local225.anIntArray236[local229] + this.anInt2238;
					this.anIntArray235[this.anInt2239] = local225.anIntArray235[local229];
					this.anIntArray229[this.anInt2239] = local225.anIntArray229[local229];
					this.anIntArray227[this.anInt2239] = local225.anIntArray227[local229];
					if (local18) {
						if (local225.aByteArray33 == null) {
							this.aByteArray33[this.anInt2239] = local225.aByte4;
						} else {
							this.aByteArray33[this.anInt2239] = local225.aByteArray33[local229];
						}
					}
					if (local20 && local225.aByteArray30 != null) {
						this.aByteArray30[this.anInt2239] = local225.aByteArray30[local229];
					}
					if (local22) {
						if (local225.aShortArray24 == null) {
							this.aShortArray24[this.anInt2239] = -1;
						} else {
							this.aShortArray24[this.anInt2239] = local225.aShortArray24[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray31 == null || local225.aByteArray31[local229] == -1) {
							this.aByteArray31[this.anInt2239] = -1;
						} else {
							this.aByteArray31[this.anInt2239] = (byte) (local225.aByteArray31[local229] + this.anInt2234);
						}
					}
					this.anInt2239++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2234; local394++) {
					this.anIntArray237[this.anInt2234] = local225.anIntArray237[local394] + this.anInt2238;
					this.anIntArray232[this.anInt2234] = local225.anIntArray232[local394] + this.anInt2238;
					this.anIntArray228[this.anInt2234] = local225.anIntArray228[local394] + this.anInt2238;
					this.anInt2234++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2238; local444++) {
					this.anIntArray233[this.anInt2238] = local225.anIntArray233[local444];
					this.anIntArray226[this.anInt2238] = local225.anIntArray226[local444];
					this.anIntArray230[this.anInt2238] = local225.anIntArray230[local444];
					this.anInt2238++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V")
	private void method1468(@OriginalArg(0) int arg0) {
		if (Static83.aBooleanArray16[arg0]) {
			this.method1488(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray234[arg0];
		@Pc(17) int local17 = this.anIntArray231[arg0];
		@Pc(22) int local22 = this.anIntArray236[arg0];
		Static6.aBoolean18 = Static83.aBooleanArray17[arg0];
		if (this.aByteArray30 == null) {
			Static6.anInt152 = 0;
		} else {
			Static6.anInt152 = this.aByteArray30[arg0] & 0xFF;
		}
		if (this.aShortArray24 != null && this.aShortArray24[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray31[arg0] & 0xFF;
				local133 = this.anIntArray237[local128];
				local138 = this.anIntArray232[local128];
				local143 = this.anIntArray228[local128];
			}
			if (this.anIntArray227[arg0] == -1) {
				Static6.method123(Static83.anIntArray247[local12], Static83.anIntArray247[local17], Static83.anIntArray247[local22], Static83.anIntArray253[local12], Static83.anIntArray253[local17], Static83.anIntArray253[local22], this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static83.anIntArray252[local133], Static83.anIntArray252[local138], Static83.anIntArray252[local143], Static83.anIntArray242[local133], Static83.anIntArray242[local138], Static83.anIntArray242[local143], Static83.anIntArray254[local133], Static83.anIntArray254[local138], Static83.anIntArray254[local143], this.aShortArray24[arg0]);
			} else {
				Static6.method123(Static83.anIntArray247[local12], Static83.anIntArray247[local17], Static83.anIntArray247[local22], Static83.anIntArray253[local12], Static83.anIntArray253[local17], Static83.anIntArray253[local22], this.anIntArray235[arg0], this.anIntArray229[arg0], this.anIntArray227[arg0], Static83.anIntArray252[local133], Static83.anIntArray252[local138], Static83.anIntArray252[local143], Static83.anIntArray242[local133], Static83.anIntArray242[local138], Static83.anIntArray242[local143], Static83.anIntArray254[local133], Static83.anIntArray254[local138], Static83.anIntArray254[local143], this.aShortArray24[arg0]);
			}
		} else if (this.anIntArray227[arg0] == -1) {
			Static6.method122(Static83.anIntArray247[local12], Static83.anIntArray247[local17], Static83.anIntArray247[local22], Static83.anIntArray253[local12], Static83.anIntArray253[local17], Static83.anIntArray253[local22], Static83.anIntArray251[this.anIntArray235[arg0]]);
		} else {
			Static6.method117(Static83.anIntArray247[local12], Static83.anIntArray247[local17], Static83.anIntArray247[local22], Static83.anIntArray253[local12], Static83.anIntArray253[local17], Static83.anIntArray253[local22], this.anIntArray235[arg0], this.anIntArray229[arg0], this.anIntArray227[arg0]);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Z)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1469(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static83.aByteArray32.length < this.anInt2239) {
			Static83.aByteArray32 = new byte[this.anInt2239 + 100];
		}
		return this.method1470(arg0, Static83.aClass4_Sub1_Sub3_Sub3_2, Static83.aByteArray32);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static83.anIntArray241[0] = -1;
		if (this.anInt2235 != 1) {
			this.method1474();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2233 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2233 << 9;
		if (local64 / local40 >= Static6.anInt149) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2233 << 9;
		if (local77 / local40 <= Static6.anInt150) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2233 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static6.anInt151) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2808 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static6.anInt147) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2808 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2234 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static83.aBoolean200) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static83.anInt2241 - Static6.anInt148;
			local223 = Static83.anInt2242 - Static6.anInt153;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean199) {
					Static83.anIntArray249[Static83.anInt2245++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static6.anInt148;
		local219 = Static6.anInt153;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static83.anIntArray246[arg0];
			local257 = Static83.anIntArray256[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2238; local269++) {
			@Pc(275) int local275 = this.anIntArray233[local269];
			@Pc(280) int local280 = this.anIntArray226[local269];
			@Pc(285) int local285 = this.anIntArray230[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static83.anIntArray244[local269] = local285 - local29;
			if (local285 >= 50) {
				Static83.anIntArray253[local269] = local172 + (local275 << 9) / local285;
				Static83.anIntArray247[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static83.anIntArray253[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static83.anIntArray252[local269] = local275;
				Static83.anIntArray242[local269] = local297;
				Static83.anIntArray254[local269] = local285;
			}
		}
		try {
			this.method1476(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!od;[B)Lclient!od;")
	private Class4_Sub1_Sub3_Sub3 method1470(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub1_Sub3_Sub3 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2238 = this.anInt2238;
		arg1.anInt2239 = this.anInt2239;
		arg1.anInt2234 = this.anInt2234;
		if (arg1.anIntArray233 == null || arg1.anIntArray233.length < this.anInt2238) {
			arg1.anIntArray233 = new int[this.anInt2238 + 100];
			arg1.anIntArray226 = new int[this.anInt2238 + 100];
			arg1.anIntArray230 = new int[this.anInt2238 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2238; local43++) {
			arg1.anIntArray233[local43] = this.anIntArray233[local43];
			arg1.anIntArray226[local43] = this.anIntArray226[local43];
			arg1.anIntArray230[local43] = this.anIntArray230[local43];
		}
		if (arg0) {
			arg1.aByteArray30 = this.aByteArray30;
		} else {
			arg1.aByteArray30 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray30 == null) {
				for (local88 = 0; local88 < this.anInt2239; local88++) {
					arg1.aByteArray30[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2239; local88++) {
					arg1.aByteArray30[local88] = this.aByteArray30[local88];
				}
			}
		}
		arg1.anIntArray234 = this.anIntArray234;
		arg1.anIntArray231 = this.anIntArray231;
		arg1.anIntArray236 = this.anIntArray236;
		arg1.anIntArray235 = this.anIntArray235;
		arg1.anIntArray229 = this.anIntArray229;
		arg1.anIntArray227 = this.anIntArray227;
		arg1.aByteArray33 = this.aByteArray33;
		arg1.aByteArray31 = this.aByteArray31;
		arg1.aShortArray24 = this.aShortArray24;
		arg1.aByte4 = this.aByte4;
		arg1.anIntArray237 = this.anIntArray237;
		arg1.anIntArray232 = this.anIntArray232;
		arg1.anIntArray228 = this.anIntArray228;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArrayArray21 = this.anIntArrayArray21;
		arg1.aBoolean199 = this.aBoolean199;
		arg1.anInt2235 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()V")
	public void method1471() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2238; local1++) {
			@Pc(7) int local7 = this.anIntArray233[local1];
			this.anIntArray233[local1] = this.anIntArray230[local1];
			this.anIntArray230[local1] = -local7;
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)V")
	public void method1472(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static83.anIntArray246[arg0];
		@Pc(7) int local7 = Static83.anIntArray256[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2238; local9++) {
			@Pc(26) int local26 = this.anIntArray226[local9] * local7 - this.anIntArray230[local9] * local3 >> 16;
			this.anIntArray230[local9] = this.anIntArray226[local9] * local3 + this.anIntArray230[local9] * local7 >> 16;
			this.anIntArray226[local9] = local26;
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "()V")
	public void method1473() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2238; local1++) {
			this.anIntArray233[local1] = -this.anIntArray233[local1];
			this.anIntArray230[local1] = -this.anIntArray230[local1];
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()V")
	public void method1474() {
		if (this.anInt2235 == 1) {
			return;
		}
		this.anInt2235 = 1;
		super.anInt2808 = 0;
		this.anInt2237 = 0;
		this.anInt2233 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2238; local18++) {
			@Pc(24) int local24 = this.anIntArray233[local18];
			@Pc(29) int local29 = this.anIntArray226[local18];
			@Pc(34) int local34 = this.anIntArray230[local18];
			if (-local29 > super.anInt2808) {
				super.anInt2808 = -local29;
			}
			if (local29 > this.anInt2237) {
				this.anInt2237 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2233) {
				this.anInt2233 = local58;
			}
		}
		this.anInt2233 = (int) (Math.sqrt((double) this.anInt2233) + 0.99D);
		this.anInt2232 = (int) (Math.sqrt((double) (this.anInt2233 * this.anInt2233 + super.anInt2808 * super.anInt2808)) + 0.99D);
		this.anInt2236 = this.anInt2232 + (int) (Math.sqrt((double) (this.anInt2233 * this.anInt2233 + this.anInt2237 * this.anInt2237)) + 0.99D);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V")
	public void method1475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2238; local1++) {
			this.anIntArray233[local1] = this.anIntArray233[local1] * arg0 / 128;
			this.anIntArray226[local1] = this.anIntArray226[local1] * arg1 / 128;
			this.anIntArray230[local1] = this.anIntArray230[local1] * arg2 / 128;
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZZI)V")
	private void method1476(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2236 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2236; local6++) {
			Static83.anIntArray241[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2239; local18++) {
			if (this.anIntArray227[local18] != -2) {
				local30 = this.anIntArray234[local18];
				local35 = this.anIntArray231[local18];
				local40 = this.anIntArray236[local18];
				local44 = Static83.anIntArray253[local30];
				local48 = Static83.anIntArray253[local35];
				local52 = Static83.anIntArray253[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static83.anIntArray252[local30];
					local71 = Static83.anIntArray252[local35];
					@Pc(75) int local75 = Static83.anIntArray252[local40];
					@Pc(79) int local79 = Static83.anIntArray242[local30];
					local83 = Static83.anIntArray242[local35];
					local87 = Static83.anIntArray242[local40];
					@Pc(91) int local91 = Static83.anIntArray254[local30];
					local95 = Static83.anIntArray254[local35];
					@Pc(99) int local99 = Static83.anIntArray254[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static83.aBooleanArray16[local18] = true;
						@Pc(180) int local180 = (Static83.anIntArray244[local30] + Static83.anIntArray244[local35] + Static83.anIntArray244[local40]) / 3 + this.anInt2232;
						Static83.anIntArrayArray23[local180][Static83.anIntArray241[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1481(Static83.anInt2241, Static83.anInt2242, Static83.anIntArray247[local30], Static83.anIntArray247[local35], Static83.anIntArray247[local40], local44, local48, local52)) {
						Static83.anIntArray249[Static83.anInt2245++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static83.anIntArray247[local40] - Static83.anIntArray247[local35]) - (Static83.anIntArray247[local30] - Static83.anIntArray247[local35]) * (local52 - local48) > 0) {
						Static83.aBooleanArray16[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static6.anInt154 && local48 <= Static6.anInt154 && local52 <= Static6.anInt154) {
							Static83.aBooleanArray17[local18] = false;
						} else {
							Static83.aBooleanArray17[local18] = true;
						}
						local67 = (Static83.anIntArray244[local30] + Static83.anIntArray244[local35] + Static83.anIntArray244[local40]) / 3 + this.anInt2232;
						Static83.anIntArrayArray23[local67][Static83.anIntArray241[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray33 == null) {
			for (local30 = this.anInt2236 - 1; local30 >= 0; local30--) {
				local35 = Static83.anIntArray241[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static83.anIntArrayArray23[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1468(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static83.anIntArray255[local30] = 0;
			Static83.anIntArray239[local30] = 0;
		}
		for (local35 = this.anInt2236 - 1; local35 >= 0; local35--) {
			local40 = Static83.anIntArray241[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static83.anIntArrayArray23[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray33[local52];
					local71 = Static83.anIntArray255[local388]++;
					Static83.anIntArrayArray24[local388][local71] = local52;
					if (local388 < 10) {
						Static83.anIntArray239[local388] += local35;
					} else if (local388 == 10) {
						Static83.anIntArray250[local71] = local35;
					} else {
						Static83.anIntArray243[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static83.anIntArray255[1] > 0 || Static83.anIntArray255[2] > 0) {
			local40 = (Static83.anIntArray239[1] + Static83.anIntArray239[2]) / (Static83.anIntArray255[1] + Static83.anIntArray255[2]);
		}
		local44 = 0;
		if (Static83.anIntArray255[3] > 0 || Static83.anIntArray255[4] > 0) {
			local44 = (Static83.anIntArray239[3] + Static83.anIntArray239[4]) / (Static83.anIntArray255[3] + Static83.anIntArray255[4]);
		}
		local48 = 0;
		if (Static83.anIntArray255[6] > 0 || Static83.anIntArray255[8] > 0) {
			local48 = (Static83.anIntArray239[6] + Static83.anIntArray239[8]) / (Static83.anIntArray255[6] + Static83.anIntArray255[8]);
		}
		local67 = 0;
		local71 = Static83.anIntArray255[10];
		@Pc(521) int[] local521 = Static83.anIntArrayArray24[10];
		@Pc(523) int[] local523 = Static83.anIntArray250;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static83.anIntArray255[11];
			local521 = Static83.anIntArrayArray24[11];
			local523 = Static83.anIntArray243;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1468(local521[local67++]);
				if (local67 == local71 && local521 != Static83.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static83.anIntArray255[11];
					local521 = Static83.anIntArrayArray24[11];
					local523 = Static83.anIntArray243;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1468(local521[local67++]);
				if (local67 == local71 && local521 != Static83.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static83.anIntArray255[11];
					local521 = Static83.anIntArrayArray24[11];
					local523 = Static83.anIntArray243;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1468(local521[local67++]);
				if (local67 == local71 && local521 != Static83.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static83.anIntArray255[11];
					local521 = Static83.anIntArrayArray24[11];
					local523 = Static83.anIntArray243;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static83.anIntArray255[local83];
			@Pc(686) int[] local686 = Static83.anIntArrayArray24[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1468(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1468(local521[local67++]);
			if (local67 == local71 && local521 != Static83.anIntArrayArray24[11]) {
				local67 = 0;
				local521 = Static83.anIntArrayArray24[11];
				local71 = Static83.anIntArray255[11];
				local523 = Static83.anIntArray243;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()V")
	private void method1477() {
		if (this.anInt2235 == 2) {
			return;
		}
		this.anInt2235 = 2;
		this.anInt2233 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2238; local12++) {
			@Pc(18) int local18 = this.anIntArray233[local12];
			@Pc(23) int local23 = this.anIntArray226[local12];
			@Pc(28) int local28 = this.anIntArray230[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2233) {
				this.anInt2233 = local40;
			}
		}
		this.anInt2233 = (int) (Math.sqrt((double) this.anInt2233) + 0.99D);
		this.anInt2232 = this.anInt2233;
		this.anInt2236 = this.anInt2233 + this.anInt2233;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([[IIIIZI)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1478(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1474();
		@Pc(6) int local6 = arg1 - this.anInt2233;
		@Pc(11) int local11 = arg1 + this.anInt2233;
		@Pc(16) int local16 = arg3 - this.anInt2233;
		@Pc(21) int local21 = arg3 + this.anInt2233;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class4_Sub1_Sub3_Sub3 local101;
		if (arg4) {
			local101 = new Class4_Sub1_Sub3_Sub3();
			local101.anInt2238 = this.anInt2238;
			local101.anInt2239 = this.anInt2239;
			local101.anInt2234 = this.anInt2234;
			local101.anIntArray233 = this.anIntArray233;
			local101.anIntArray230 = this.anIntArray230;
			local101.anIntArray234 = this.anIntArray234;
			local101.anIntArray231 = this.anIntArray231;
			local101.anIntArray236 = this.anIntArray236;
			local101.anIntArray235 = this.anIntArray235;
			local101.anIntArray229 = this.anIntArray229;
			local101.anIntArray227 = this.anIntArray227;
			local101.aByteArray33 = this.aByteArray33;
			local101.aByteArray30 = this.aByteArray30;
			local101.aByteArray31 = this.aByteArray31;
			local101.aShortArray24 = this.aShortArray24;
			local101.aByte4 = this.aByte4;
			local101.anIntArray237 = this.anIntArray237;
			local101.anIntArray232 = this.anIntArray232;
			local101.anIntArray228 = this.anIntArray228;
			local101.anIntArrayArray22 = this.anIntArrayArray22;
			local101.anIntArrayArray21 = this.anIntArrayArray21;
			local101.aBoolean199 = this.aBoolean199;
			local101.anIntArray226 = new int[local101.anInt2238];
		} else {
			local101 = this;
		}
		@Pc(201) int local201;
		@Pc(209) int local209;
		@Pc(216) int local216;
		@Pc(220) int local220;
		@Pc(224) int local224;
		@Pc(228) int local228;
		@Pc(232) int local232;
		@Pc(254) int local254;
		@Pc(280) int local280;
		@Pc(292) int local292;
		if (arg5 == 0) {
			for (local201 = 0; local201 < local101.anInt2238; local201++) {
				local209 = this.anIntArray233[local201] + arg1;
				local216 = this.anIntArray230[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray226[local201] = this.anIntArray226[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2238; local201++) {
				local209 = (-this.anIntArray226[local201] << 16) / super.anInt2808;
				if (local209 < arg5) {
					local216 = this.anIntArray233[local201] + arg1;
					local220 = this.anIntArray230[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray226[local201] = this.anIntArray226[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt2235 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIII)V")
	public void method1479(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static83.anIntArray241[0] = -1;
		if (this.anInt2235 != 2 && this.anInt2235 != 1) {
			this.method1477();
		}
		@Pc(15) int local15 = Static6.anInt148;
		@Pc(17) int local17 = Static6.anInt153;
		@Pc(21) int local21 = Static83.anIntArray246[0];
		@Pc(25) int local25 = Static83.anIntArray256[0];
		@Pc(29) int local29 = Static83.anIntArray246[arg0];
		@Pc(33) int local33 = Static83.anIntArray256[arg0];
		@Pc(37) int local37 = Static83.anIntArray246[arg1];
		@Pc(41) int local41 = Static83.anIntArray256[arg1];
		@Pc(45) int local45 = Static83.anIntArray246[arg2];
		@Pc(49) int local49 = Static83.anIntArray256[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2238; local61++) {
			@Pc(67) int local67 = this.anIntArray233[local61];
			@Pc(72) int local72 = this.anIntArray226[local61];
			@Pc(77) int local77 = this.anIntArray230[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static83.anIntArray244[local61] = local77 - local59;
			Static83.anIntArray253[local61] = local15 + (local67 << 9) / arg6;
			Static83.anIntArray247[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2234 > 0) {
				Static83.anIntArray252[local61] = local67;
				Static83.anIntArray242[local61] = local89;
				Static83.anIntArray254[local61] = local77;
			}
		}
		try {
			this.method1476(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!rc;I)V")
	public void method1480(@OriginalArg(0) Class4_Sub1_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class25 local12 = arg0.aClass25Array1[arg1];
		@Pc(15) Class4_Sub16 local15 = local12.aClass4_Sub16_1;
		Static83.anInt2243 = 0;
		Static83.anInt2240 = 0;
		Static83.anInt2244 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt881; local23++) {
			@Pc(29) int local29 = local12.anIntArray102[local23];
			this.method1489(local15.anIntArray200[local29], local15.anIntArrayArray19[local29], local12.anIntArray100[local23], local12.anIntArray103[local23], local12.anIntArray98[local23]);
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method1481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "()V")
	public void method1482() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2238; local1++) {
			@Pc(7) int local7 = this.anIntArray230[local1];
			this.anIntArray230[local1] = this.anIntArray233[local1];
			this.anIntArray233[local1] = -local7;
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIII)V")
	public void method1483(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static83.anIntArray241[0] = -1;
		if (this.anInt2235 != 2 && this.anInt2235 != 1) {
			this.method1477();
		}
		@Pc(15) int local15 = Static6.anInt148;
		@Pc(17) int local17 = Static6.anInt153;
		@Pc(21) int local21 = Static83.anIntArray246[0];
		@Pc(25) int local25 = Static83.anIntArray256[0];
		@Pc(29) int local29 = Static83.anIntArray246[arg0];
		@Pc(33) int local33 = Static83.anIntArray256[arg0];
		@Pc(37) int local37 = Static83.anIntArray246[arg1];
		@Pc(41) int local41 = Static83.anIntArray256[arg1];
		@Pc(45) int local45 = Static83.anIntArray246[arg2];
		@Pc(49) int local49 = Static83.anIntArray256[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2238; local61++) {
			@Pc(67) int local67 = this.anIntArray233[local61];
			@Pc(72) int local72 = this.anIntArray226[local61];
			@Pc(77) int local77 = this.anIntArray230[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static83.anIntArray244[local61] = local77 - local59;
			Static83.anIntArray253[local61] = local15 + (local67 << 9) / local77;
			Static83.anIntArray247[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2234 > 0) {
				Static83.anIntArray252[local61] = local67;
				Static83.anIntArray242[local61] = local89;
				Static83.anIntArray254[local61] = local77;
			}
		}
		try {
			this.method1476(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!rc;ILclient!rc;I[I)V")
	public void method1484(@OriginalArg(0) Class4_Sub1_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub1_Sub12 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1480(arg0, arg1);
			return;
		}
		@Pc(18) Class25 local18 = arg0.aClass25Array1[arg1];
		@Pc(23) Class25 local23 = arg2.aClass25Array1[arg3];
		@Pc(26) Class4_Sub16 local26 = local18.aClass4_Sub16_1;
		Static83.anInt2243 = 0;
		Static83.anInt2240 = 0;
		Static83.anInt2244 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt881; local41++) {
			local47 = local18.anIntArray102[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray200[local47] == 0) {
				this.method1489(local26.anIntArray200[local47], local26.anIntArrayArray19[local47], local18.anIntArray100[local41], local18.anIntArray103[local41], local18.anIntArray98[local41]);
			}
		}
		Static83.anInt2243 = 0;
		Static83.anInt2240 = 0;
		Static83.anInt2244 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt881; local47++) {
			@Pc(112) int local112 = local23.anIntArray102[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray200[local112] == 0) {
				this.method1489(local26.anIntArray200[local112], local26.anIntArrayArray19[local112], local23.anIntArray100[local47], local23.anIntArray103[local47], local23.anIntArray98[local47]);
			}
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "()I")
	public int method1486() {
		this.method1474();
		return this.anInt2233;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V")
	public void method1487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2238; local1++) {
			this.anIntArray233[local1] += arg0;
			this.anIntArray226[local1] += arg1;
			this.anIntArray230[local1] += arg2;
		}
		this.anInt2235 = 0;
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)V")
	private void method1488(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static6.anInt148;
		@Pc(3) int local3 = Static6.anInt153;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray234[arg0];
		@Pc(15) int local15 = this.anIntArray231[arg0];
		@Pc(20) int local20 = this.anIntArray236[arg0];
		@Pc(24) int local24 = Static83.anIntArray254[local10];
		@Pc(28) int local28 = Static83.anIntArray254[local15];
		@Pc(32) int local32 = Static83.anIntArray254[local20];
		if (this.aByteArray30 == null) {
			Static6.anInt152 = 0;
		} else {
			Static6.anInt152 = this.aByteArray30[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static83.anIntArray245[0] = Static83.anIntArray253[local10];
			Static83.anIntArray240[0] = Static83.anIntArray247[local10];
			local5++;
			Static83.anIntArray248[0] = this.anIntArray235[arg0];
		} else {
			local73 = Static83.anIntArray252[local10];
			local77 = Static83.anIntArray242[local10];
			local82 = this.anIntArray235[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static83.anIntArray238[local32 - local24];
				Static83.anIntArray245[0] = local1 + (local73 + ((Static83.anIntArray252[local20] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray240[0] = local3 + (local77 + ((Static83.anIntArray242[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static83.anIntArray248[0] = local82 + ((this.anIntArray227[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static83.anIntArray238[local28 - local24];
				Static83.anIntArray245[local5] = local1 + (local73 + ((Static83.anIntArray252[local15] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray240[local5] = local3 + (local77 + ((Static83.anIntArray242[local15] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray248[local5++] = local82 + ((this.anIntArray229[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static83.anIntArray245[local5] = Static83.anIntArray253[local15];
			Static83.anIntArray240[local5] = Static83.anIntArray247[local15];
			Static83.anIntArray248[local5++] = this.anIntArray229[arg0];
		} else {
			local73 = Static83.anIntArray252[local15];
			local77 = Static83.anIntArray242[local15];
			local82 = this.anIntArray229[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static83.anIntArray238[local24 - local28];
				Static83.anIntArray245[local5] = local1 + (local73 + ((Static83.anIntArray252[local10] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray240[local5] = local3 + (local77 + ((Static83.anIntArray242[local10] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray248[local5++] = local82 + ((this.anIntArray235[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static83.anIntArray238[local32 - local28];
				Static83.anIntArray245[local5] = local1 + (local73 + ((Static83.anIntArray252[local20] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray240[local5] = local3 + (local77 + ((Static83.anIntArray242[local20] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray248[local5++] = local82 + ((this.anIntArray227[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static83.anIntArray245[local5] = Static83.anIntArray253[local20];
			Static83.anIntArray240[local5] = Static83.anIntArray247[local20];
			Static83.anIntArray248[local5++] = this.anIntArray227[arg0];
		} else {
			local73 = Static83.anIntArray252[local20];
			local77 = Static83.anIntArray242[local20];
			local82 = this.anIntArray227[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static83.anIntArray238[local28 - local32];
				Static83.anIntArray245[local5] = local1 + (local73 + ((Static83.anIntArray252[local15] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray240[local5] = local3 + (local77 + ((Static83.anIntArray242[local15] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray248[local5++] = local82 + ((this.anIntArray229[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static83.anIntArray238[local24 - local32];
				Static83.anIntArray245[local5] = local1 + (local73 + ((Static83.anIntArray252[local10] - local73) * local95 >> 16) << 9) / 50;
				Static83.anIntArray240[local5] = local3 + (local77 + ((Static83.anIntArray242[local10] - local77) * local95 >> 16) << 9) / 50;
				Static83.anIntArray248[local5++] = local82 + ((this.anIntArray235[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static83.anIntArray245[0];
		local77 = Static83.anIntArray245[1];
		local82 = Static83.anIntArray245[2];
		local95 = Static83.anIntArray240[0];
		@Pc(590) int local590 = Static83.anIntArray240[1];
		@Pc(594) int local594 = Static83.anIntArray240[2];
		Static6.aBoolean18 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static6.anInt154 || local77 > Static6.anInt154 || local82 > Static6.anInt154) {
				Static6.aBoolean18 = true;
			}
			if (this.aShortArray24 != null && this.aShortArray24[arg0] != -1) {
				if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray31[arg0] & 0xFF;
					local683 = this.anIntArray237[local678];
					local688 = this.anIntArray232[local678];
					local693 = this.anIntArray228[local678];
				}
				if (this.anIntArray227[arg0] == -1) {
					Static6.method123(local95, local590, local594, local73, local77, local82, this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static83.anIntArray252[local683], Static83.anIntArray252[local688], Static83.anIntArray252[local693], Static83.anIntArray242[local683], Static83.anIntArray242[local688], Static83.anIntArray242[local693], Static83.anIntArray254[local683], Static83.anIntArray254[local688], Static83.anIntArray254[local693], this.aShortArray24[arg0]);
				} else {
					Static6.method123(local95, local590, local594, local73, local77, local82, Static83.anIntArray248[0], Static83.anIntArray248[1], Static83.anIntArray248[2], Static83.anIntArray252[local683], Static83.anIntArray252[local688], Static83.anIntArray252[local693], Static83.anIntArray242[local683], Static83.anIntArray242[local688], Static83.anIntArray242[local693], Static83.anIntArray254[local683], Static83.anIntArray254[local688], Static83.anIntArray254[local693], this.aShortArray24[arg0]);
				}
			} else if (this.anIntArray227[arg0] == -1) {
				Static6.method122(local95, local590, local594, local73, local77, local82, Static83.anIntArray251[this.anIntArray235[arg0]]);
			} else {
				Static6.method117(local95, local590, local594, local73, local77, local82, Static83.anIntArray248[0], Static83.anIntArray248[1], Static83.anIntArray248[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static6.anInt154 || local77 > Static6.anInt154 || local82 > Static6.anInt154 || Static83.anIntArray245[3] < 0 || Static83.anIntArray245[3] > Static6.anInt154) {
			Static6.aBoolean18 = true;
		}
		if (this.aShortArray24 == null || this.aShortArray24[arg0] == -1) {
			if (this.anIntArray227[arg0] == -1) {
				local683 = Static83.anIntArray251[this.anIntArray235[arg0]];
				Static6.method122(local95, local590, local594, local73, local77, local82, local683);
				Static6.method122(local95, local594, Static83.anIntArray240[3], local73, local82, Static83.anIntArray245[3], local683);
				return;
			}
			Static6.method117(local95, local590, local594, local73, local77, local82, Static83.anIntArray248[0], Static83.anIntArray248[1], Static83.anIntArray248[2]);
			Static6.method117(local95, local594, Static83.anIntArray240[3], local73, local82, Static83.anIntArray245[3], Static83.anIntArray248[0], Static83.anIntArray248[2], Static83.anIntArray248[3]);
			return;
		}
		if (this.aByteArray31 == null || this.aByteArray31[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray31[arg0] & 0xFF;
			local683 = this.anIntArray237[local678];
			local688 = this.anIntArray232[local678];
			local693 = this.anIntArray228[local678];
		}
		@Pc(956) short local956 = this.aShortArray24[arg0];
		if (this.anIntArray227[arg0] == -1) {
			Static6.method123(local95, local590, local594, local73, local77, local82, this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static83.anIntArray252[local683], Static83.anIntArray252[local688], Static83.anIntArray252[local693], Static83.anIntArray242[local683], Static83.anIntArray242[local688], Static83.anIntArray242[local693], Static83.anIntArray254[local683], Static83.anIntArray254[local688], Static83.anIntArray254[local693], local956);
			Static6.method123(local95, local594, Static83.anIntArray240[3], local73, local82, Static83.anIntArray245[3], this.anIntArray235[arg0], this.anIntArray235[arg0], this.anIntArray235[arg0], Static83.anIntArray252[local683], Static83.anIntArray252[local688], Static83.anIntArray252[local693], Static83.anIntArray242[local683], Static83.anIntArray242[local688], Static83.anIntArray242[local693], Static83.anIntArray254[local683], Static83.anIntArray254[local688], Static83.anIntArray254[local693], local956);
			return;
		}
		Static6.method123(local95, local590, local594, local73, local77, local82, Static83.anIntArray248[0], Static83.anIntArray248[1], Static83.anIntArray248[2], Static83.anIntArray252[local683], Static83.anIntArray252[local688], Static83.anIntArray252[local693], Static83.anIntArray242[local683], Static83.anIntArray242[local688], Static83.anIntArray242[local693], Static83.anIntArray254[local683], Static83.anIntArray254[local688], Static83.anIntArray254[local693], local956);
		Static6.method123(local95, local594, Static83.anIntArray240[3], local73, local82, Static83.anIntArray245[3], Static83.anIntArray248[0], Static83.anIntArray248[2], Static83.anIntArray248[3], Static83.anIntArray252[local683], Static83.anIntArray252[local688], Static83.anIntArray252[local693], Static83.anIntArray242[local683], Static83.anIntArray242[local688], Static83.anIntArray242[local693], Static83.anIntArray254[local683], Static83.anIntArray254[local688], Static83.anIntArray254[local693], local956);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I[IIII)V")
	private void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static83.anInt2243 = 0;
			Static83.anInt2240 = 0;
			Static83.anInt2244 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray22.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray22[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static83.anInt2243 += this.anIntArray233[local36];
						Static83.anInt2240 += this.anIntArray226[local36];
						Static83.anInt2244 += this.anIntArray230[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static83.anInt2243 = Static83.anInt2243 / local6 + arg2;
				Static83.anInt2240 = Static83.anInt2240 / local6 + arg3;
				Static83.anInt2244 = Static83.anInt2244 / local6 + arg4;
			} else {
				Static83.anInt2243 = arg2;
				Static83.anInt2240 = arg3;
				Static83.anInt2244 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray233[local31] += arg2;
						this.anIntArray226[local31] += arg3;
						this.anIntArray230[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray233[local31] -= Static83.anInt2243;
						this.anIntArray226[local31] -= Static83.anInt2240;
						this.anIntArray230[local31] -= Static83.anInt2244;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static83.anIntArray246[local225];
							local235 = Static83.anIntArray256[local225];
							local251 = this.anIntArray226[local31] * local231 + this.anIntArray233[local31] * local235 >> 16;
							this.anIntArray226[local31] = this.anIntArray226[local31] * local235 - this.anIntArray233[local31] * local231 >> 16;
							this.anIntArray233[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static83.anIntArray246[local36];
							local235 = Static83.anIntArray256[local36];
							local251 = this.anIntArray226[local31] * local235 - this.anIntArray230[local31] * local231 >> 16;
							this.anIntArray230[local31] = this.anIntArray226[local31] * local231 + this.anIntArray230[local31] * local235 >> 16;
							this.anIntArray226[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static83.anIntArray246[local219];
							local235 = Static83.anIntArray256[local219];
							local251 = this.anIntArray230[local31] * local231 + this.anIntArray233[local31] * local235 >> 16;
							this.anIntArray230[local31] = this.anIntArray230[local31] * local235 - this.anIntArray233[local31] * local231 >> 16;
							this.anIntArray233[local31] = local251;
						}
						this.anIntArray233[local31] += Static83.anInt2243;
						this.anIntArray226[local31] += Static83.anInt2240;
						this.anIntArray230[local31] += Static83.anInt2244;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray22.length) {
					local115 = this.anIntArrayArray22[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray233[local31] -= Static83.anInt2243;
						this.anIntArray226[local31] -= Static83.anInt2240;
						this.anIntArray230[local31] -= Static83.anInt2244;
						this.anIntArray233[local31] = this.anIntArray233[local31] * arg2 / 128;
						this.anIntArray226[local31] = this.anIntArray226[local31] * arg3 / 128;
						this.anIntArray230[local31] = this.anIntArray230[local31] * arg4 / 128;
						this.anIntArray233[local31] += Static83.anInt2243;
						this.anIntArray226[local31] += Static83.anInt2240;
						this.anIntArray230[local31] += Static83.anInt2244;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray21 != null && this.aByteArray30 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray21.length) {
					local115 = this.anIntArrayArray21[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray30[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray30[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(Z)Lclient!od;")
	public Class4_Sub1_Sub3_Sub3 method1490(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static83.aByteArray34.length < this.anInt2239) {
			Static83.aByteArray34 = new byte[this.anInt2239 + 100];
		}
		return this.method1470(arg0, Static83.aClass4_Sub1_Sub3_Sub3_3, Static83.aByteArray34);
	}
}
