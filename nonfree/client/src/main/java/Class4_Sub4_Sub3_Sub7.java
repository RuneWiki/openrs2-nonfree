import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class4_Sub4_Sub3_Sub7 extends Class4_Sub4_Sub3 {

	@OriginalMember(owner = "client!u", name = "Y", descriptor = "[I")
	public int[] anIntArray352;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!u", name = "ab", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!u", name = "bb", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!u", name = "cb", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!u", name = "db", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!u", name = "eb", descriptor = "[S")
	public short[] aShortArray38;

	@OriginalMember(owner = "client!u", name = "fb", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!u", name = "ib", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!u", name = "jb", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!u", name = "kb", descriptor = "[B")
	public byte[] aByteArray64;

	@OriginalMember(owner = "client!u", name = "lb", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!u", name = "mb", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!u", name = "nb", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!u", name = "ob", descriptor = "I")
	private int anInt2521;

	@OriginalMember(owner = "client!u", name = "pb", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!u", name = "sb", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!u", name = "ub", descriptor = "I")
	private int anInt2524;

	@OriginalMember(owner = "client!u", name = "vb", descriptor = "[[I")
	public int[][] anIntArrayArray22;

	@OriginalMember(owner = "client!u", name = "xb", descriptor = "I")
	private int anInt2525;

	@OriginalMember(owner = "client!u", name = "zb", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!u", name = "Ab", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!u", name = "Bb", descriptor = "[[I")
	public int[][] anIntArrayArray23;

	@OriginalMember(owner = "client!u", name = "gb", descriptor = "Z")
	public boolean aBoolean147 = false;

	@OriginalMember(owner = "client!u", name = "rb", descriptor = "I")
	public int anInt2522 = 0;

	@OriginalMember(owner = "client!u", name = "qb", descriptor = "B")
	public byte aByte7 = 0;

	@OriginalMember(owner = "client!u", name = "yb", descriptor = "I")
	public int anInt2526 = 0;

	@OriginalMember(owner = "client!u", name = "tb", descriptor = "I")
	public int anInt2523 = 0;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub3_Sub7() {
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "([Lclient!u;I)V")
	public Class4_Sub4_Sub3_Sub7(@OriginalArg(0) Class4_Sub4_Sub3_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		this.anInt2522 = 0;
		this.anInt2526 = 0;
		this.anInt2523 = 0;
		this.aByte7 = -1;
		for (@Pc(38) int local38 = 0; local38 < arg1; local38++) {
			@Pc(43) Class4_Sub4_Sub3_Sub7 local43 = arg0[local38];
			if (local43 != null) {
				this.anInt2522 += local43.anInt2522;
				this.anInt2526 += local43.anInt2526;
				this.anInt2523 += local43.anInt2523;
				if (local43.aByteArray64 == null) {
					if (this.aByte7 == -1) {
						this.aByte7 = local43.aByte7;
					}
					if (this.aByte7 != local43.aByte7) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local43.aByteArray62 != null;
				local22 |= local43.aShortArray38 != null;
				local24 |= local43.aByteArray63 != null;
			}
		}
		this.anIntArray359 = new int[this.anInt2522];
		this.anIntArray362 = new int[this.anInt2522];
		this.anIntArray356 = new int[this.anInt2522];
		this.anIntArray355 = new int[this.anInt2526];
		this.anIntArray361 = new int[this.anInt2526];
		this.anIntArray358 = new int[this.anInt2526];
		this.anIntArray363 = new int[this.anInt2526];
		this.anIntArray360 = new int[this.anInt2526];
		this.anIntArray352 = new int[this.anInt2526];
		if (local18) {
			this.aByteArray64 = new byte[this.anInt2526];
		}
		if (local20) {
			this.aByteArray62 = new byte[this.anInt2526];
		}
		if (local22) {
			this.aShortArray38 = new short[this.anInt2526];
		}
		if (local24) {
			this.aByteArray63 = new byte[this.anInt2526];
		}
		if (this.anInt2523 > 0) {
			this.anIntArray353 = new int[this.anInt2523];
			this.anIntArray357 = new int[this.anInt2523];
			this.anIntArray354 = new int[this.anInt2523];
		}
		this.anInt2522 = 0;
		this.anInt2526 = 0;
		this.anInt2523 = 0;
		for (@Pc(220) int local220 = 0; local220 < arg1; local220++) {
			@Pc(225) Class4_Sub4_Sub3_Sub7 local225 = arg0[local220];
			if (local225 != null) {
				for (@Pc(229) int local229 = 0; local229 < local225.anInt2526; local229++) {
					this.anIntArray355[this.anInt2526] = local225.anIntArray355[local229] + this.anInt2522;
					this.anIntArray361[this.anInt2526] = local225.anIntArray361[local229] + this.anInt2522;
					this.anIntArray358[this.anInt2526] = local225.anIntArray358[local229] + this.anInt2522;
					this.anIntArray363[this.anInt2526] = local225.anIntArray363[local229];
					this.anIntArray360[this.anInt2526] = local225.anIntArray360[local229];
					this.anIntArray352[this.anInt2526] = local225.anIntArray352[local229];
					if (local18) {
						if (local225.aByteArray64 == null) {
							this.aByteArray64[this.anInt2526] = local225.aByte7;
						} else {
							this.aByteArray64[this.anInt2526] = local225.aByteArray64[local229];
						}
					}
					if (local20 && local225.aByteArray62 != null) {
						this.aByteArray62[this.anInt2526] = local225.aByteArray62[local229];
					}
					if (local22) {
						if (local225.aShortArray38 == null) {
							this.aShortArray38[this.anInt2526] = -1;
						} else {
							this.aShortArray38[this.anInt2526] = local225.aShortArray38[local229];
						}
					}
					if (local24) {
						if (local225.aByteArray63 == null || local225.aByteArray63[local229] == -1) {
							this.aByteArray63[this.anInt2526] = -1;
						} else {
							this.aByteArray63[this.anInt2526] = (byte) (local225.aByteArray63[local229] + this.anInt2523);
						}
					}
					this.anInt2526++;
				}
				for (@Pc(394) int local394 = 0; local394 < local225.anInt2523; local394++) {
					this.anIntArray353[this.anInt2523] = local225.anIntArray353[local394] + this.anInt2522;
					this.anIntArray357[this.anInt2523] = local225.anIntArray357[local394] + this.anInt2522;
					this.anIntArray354[this.anInt2523] = local225.anIntArray354[local394] + this.anInt2522;
					this.anInt2523++;
				}
				for (@Pc(444) int local444 = 0; local444 < local225.anInt2522; local444++) {
					this.anIntArray359[this.anInt2522] = local225.anIntArray359[local444];
					this.anIntArray362[this.anInt2522] = local225.anIntArray362[local444];
					this.anIntArray356[this.anInt2522] = local225.anIntArray356[local444];
					this.anInt2522++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IIII)V")
	private void method1757(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static116.anInt2529 = 0;
			Static116.anInt2532 = 0;
			Static116.anInt2530 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray22.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray22[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static116.anInt2529 += this.anIntArray359[local36];
						Static116.anInt2532 += this.anIntArray362[local36];
						Static116.anInt2530 += this.anIntArray356[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static116.anInt2529 = Static116.anInt2529 / local6 + arg2;
				Static116.anInt2532 = Static116.anInt2532 / local6 + arg3;
				Static116.anInt2530 = Static116.anInt2530 / local6 + arg4;
			} else {
				Static116.anInt2529 = arg2;
				Static116.anInt2532 = arg3;
				Static116.anInt2530 = arg4;
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
						this.anIntArray359[local31] += arg2;
						this.anIntArray362[local31] += arg3;
						this.anIntArray356[local31] += arg4;
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
						this.anIntArray359[local31] -= Static116.anInt2529;
						this.anIntArray362[local31] -= Static116.anInt2532;
						this.anIntArray356[local31] -= Static116.anInt2530;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static116.anIntArray382[local225];
							local235 = Static116.anIntArray369[local225];
							local251 = this.anIntArray362[local31] * local231 + this.anIntArray359[local31] * local235 >> 16;
							this.anIntArray362[local31] = this.anIntArray362[local31] * local235 - this.anIntArray359[local31] * local231 >> 16;
							this.anIntArray359[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static116.anIntArray382[local36];
							local235 = Static116.anIntArray369[local36];
							local251 = this.anIntArray362[local31] * local235 - this.anIntArray356[local31] * local231 >> 16;
							this.anIntArray356[local31] = this.anIntArray362[local31] * local231 + this.anIntArray356[local31] * local235 >> 16;
							this.anIntArray362[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static116.anIntArray382[local219];
							local235 = Static116.anIntArray369[local219];
							local251 = this.anIntArray356[local31] * local231 + this.anIntArray359[local31] * local235 >> 16;
							this.anIntArray356[local31] = this.anIntArray356[local31] * local235 - this.anIntArray359[local31] * local231 >> 16;
							this.anIntArray359[local31] = local251;
						}
						this.anIntArray359[local31] += Static116.anInt2529;
						this.anIntArray362[local31] += Static116.anInt2532;
						this.anIntArray356[local31] += Static116.anInt2530;
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
						this.anIntArray359[local31] -= Static116.anInt2529;
						this.anIntArray362[local31] -= Static116.anInt2532;
						this.anIntArray356[local31] -= Static116.anInt2530;
						this.anIntArray359[local31] = this.anIntArray359[local31] * arg2 / 128;
						this.anIntArray362[local31] = this.anIntArray362[local31] * arg3 / 128;
						this.anIntArray356[local31] = this.anIntArray356[local31] * arg4 / 128;
						this.anIntArray359[local31] += Static116.anInt2529;
						this.anIntArray362[local31] += Static116.anInt2532;
						this.anIntArray356[local31] += Static116.anInt2530;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray23 != null && this.aByteArray62 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray23.length) {
					local115 = this.anIntArrayArray23[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray62[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray62[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIII)Z")
	private boolean method1758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
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

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZLclient!u;[B)Lclient!u;")
	private Class4_Sub4_Sub3_Sub7 method1759(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class4_Sub4_Sub3_Sub7 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt2522 = this.anInt2522;
		arg1.anInt2526 = this.anInt2526;
		arg1.anInt2523 = this.anInt2523;
		if (arg1.anIntArray359 == null || arg1.anIntArray359.length < this.anInt2522) {
			arg1.anIntArray359 = new int[this.anInt2522 + 100];
			arg1.anIntArray362 = new int[this.anInt2522 + 100];
			arg1.anIntArray356 = new int[this.anInt2522 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt2522; local43++) {
			arg1.anIntArray359[local43] = this.anIntArray359[local43];
			arg1.anIntArray362[local43] = this.anIntArray362[local43];
			arg1.anIntArray356[local43] = this.anIntArray356[local43];
		}
		if (arg0) {
			arg1.aByteArray62 = this.aByteArray62;
		} else {
			arg1.aByteArray62 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray62 == null) {
				for (local88 = 0; local88 < this.anInt2526; local88++) {
					arg1.aByteArray62[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt2526; local88++) {
					arg1.aByteArray62[local88] = this.aByteArray62[local88];
				}
			}
		}
		arg1.anIntArray355 = this.anIntArray355;
		arg1.anIntArray361 = this.anIntArray361;
		arg1.anIntArray358 = this.anIntArray358;
		arg1.anIntArray363 = this.anIntArray363;
		arg1.anIntArray360 = this.anIntArray360;
		arg1.anIntArray352 = this.anIntArray352;
		arg1.aByteArray64 = this.aByteArray64;
		arg1.aByteArray63 = this.aByteArray63;
		arg1.aShortArray38 = this.aShortArray38;
		arg1.aByte7 = this.aByte7;
		arg1.anIntArray353 = this.anIntArray353;
		arg1.anIntArray357 = this.anIntArray357;
		arg1.anIntArray354 = this.anIntArray354;
		arg1.anIntArrayArray22 = this.anIntArrayArray22;
		arg1.anIntArrayArray23 = this.anIntArrayArray23;
		arg1.aBoolean147 = this.aBoolean147;
		arg1.anInt2520 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
	private void method1760(@OriginalArg(0) int arg0) {
		if (Static116.aBooleanArray16[arg0]) {
			this.method1768(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray355[arg0];
		@Pc(17) int local17 = this.anIntArray361[arg0];
		@Pc(22) int local22 = this.anIntArray358[arg0];
		Static37.aBoolean64 = Static116.aBooleanArray17[arg0];
		if (this.aByteArray62 == null) {
			Static37.anInt1075 = 0;
		} else {
			Static37.anInt1075 = this.aByteArray62[arg0] & 0xFF;
		}
		if (this.aShortArray38 != null && this.aShortArray38[arg0] != -1) {
			@Pc(133) int local133;
			@Pc(138) int local138;
			@Pc(143) int local143;
			if (this.aByteArray63 == null || this.aByteArray63[arg0] == -1) {
				local133 = local12;
				local138 = local17;
				local143 = local22;
			} else {
				@Pc(128) int local128 = this.aByteArray63[arg0] & 0xFF;
				local133 = this.anIntArray353[local128];
				local138 = this.anIntArray357[local128];
				local143 = this.anIntArray354[local128];
			}
			if (this.anIntArray352[arg0] == -1) {
				Static37.method715(Static116.anIntArray370[local12], Static116.anIntArray370[local17], Static116.anIntArray370[local22], Static116.anIntArray374[local12], Static116.anIntArray374[local17], Static116.anIntArray374[local22], this.anIntArray363[arg0], this.anIntArray363[arg0], this.anIntArray363[arg0], Static116.anIntArray366[local133], Static116.anIntArray366[local138], Static116.anIntArray366[local143], Static116.anIntArray368[local133], Static116.anIntArray368[local138], Static116.anIntArray368[local143], Static116.anIntArray372[local133], Static116.anIntArray372[local138], Static116.anIntArray372[local143], this.aShortArray38[arg0]);
			} else {
				Static37.method715(Static116.anIntArray370[local12], Static116.anIntArray370[local17], Static116.anIntArray370[local22], Static116.anIntArray374[local12], Static116.anIntArray374[local17], Static116.anIntArray374[local22], this.anIntArray363[arg0], this.anIntArray360[arg0], this.anIntArray352[arg0], Static116.anIntArray366[local133], Static116.anIntArray366[local138], Static116.anIntArray366[local143], Static116.anIntArray368[local133], Static116.anIntArray368[local138], Static116.anIntArray368[local143], Static116.anIntArray372[local133], Static116.anIntArray372[local138], Static116.anIntArray372[local143], this.aShortArray38[arg0]);
			}
		} else if (this.anIntArray352[arg0] == -1) {
			Static37.method729(Static116.anIntArray370[local12], Static116.anIntArray370[local17], Static116.anIntArray370[local22], Static116.anIntArray374[local12], Static116.anIntArray374[local17], Static116.anIntArray374[local22], Static116.anIntArray379[this.anIntArray363[arg0]]);
		} else {
			Static37.method721(Static116.anIntArray370[local12], Static116.anIntArray370[local17], Static116.anIntArray370[local22], Static116.anIntArray374[local12], Static116.anIntArray374[local17], Static116.anIntArray374[local22], this.anIntArray363[arg0], this.anIntArray360[arg0], this.anIntArray352[arg0]);
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "()V")
	public void method1761() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2522; local1++) {
			this.anIntArray359[local1] = -this.anIntArray359[local1];
			this.anIntArray356[local1] = -this.anIntArray356[local1];
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "()V")
	public void method1762() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2522; local1++) {
			@Pc(7) int local7 = this.anIntArray356[local1];
			this.anIntArray356[local1] = this.anIntArray359[local1];
			this.anIntArray359[local1] = -local7;
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ZZI)V")
	private void method1763(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt2521 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt2521; local6++) {
			Static116.anIntArray373[local6] = 0;
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
		for (@Pc(18) int local18 = 0; local18 < this.anInt2526; local18++) {
			if (this.anIntArray352[local18] != -2) {
				local30 = this.anIntArray355[local18];
				local35 = this.anIntArray361[local18];
				local40 = this.anIntArray358[local18];
				local44 = Static116.anIntArray374[local30];
				local48 = Static116.anIntArray374[local35];
				local52 = Static116.anIntArray374[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static116.anIntArray366[local30];
					local71 = Static116.anIntArray366[local35];
					@Pc(75) int local75 = Static116.anIntArray366[local40];
					@Pc(79) int local79 = Static116.anIntArray368[local30];
					local83 = Static116.anIntArray368[local35];
					local87 = Static116.anIntArray368[local40];
					@Pc(91) int local91 = Static116.anIntArray372[local30];
					local95 = Static116.anIntArray372[local35];
					@Pc(99) int local99 = Static116.anIntArray372[local40];
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
						Static116.aBooleanArray16[local18] = true;
						@Pc(180) int local180 = (Static116.anIntArray376[local30] + Static116.anIntArray376[local35] + Static116.anIntArray376[local40]) / 3 + this.anInt2524;
						Static116.anIntArrayArray25[local180][Static116.anIntArray373[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method1758(Static116.anInt2528, Static116.anInt2531, Static116.anIntArray370[local30], Static116.anIntArray370[local35], Static116.anIntArray370[local40], local44, local48, local52)) {
						Static116.anIntArray378[Static116.anInt2527++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static116.anIntArray370[local40] - Static116.anIntArray370[local35]) - (Static116.anIntArray370[local30] - Static116.anIntArray370[local35]) * (local52 - local48) > 0) {
						Static116.aBooleanArray16[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static37.anInt1073 && local48 <= Static37.anInt1073 && local52 <= Static37.anInt1073) {
							Static116.aBooleanArray17[local18] = false;
						} else {
							Static116.aBooleanArray17[local18] = true;
						}
						local67 = (Static116.anIntArray376[local30] + Static116.anIntArray376[local35] + Static116.anIntArray376[local40]) / 3 + this.anInt2524;
						Static116.anIntArrayArray25[local67][Static116.anIntArray373[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray64 == null) {
			for (local30 = this.anInt2521 - 1; local30 >= 0; local30--) {
				local35 = Static116.anIntArray373[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static116.anIntArrayArray25[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method1760(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static116.anIntArray365[local30] = 0;
			Static116.anIntArray380[local30] = 0;
		}
		for (local35 = this.anInt2521 - 1; local35 >= 0; local35--) {
			local40 = Static116.anIntArray373[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static116.anIntArrayArray25[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray64[local52];
					local71 = Static116.anIntArray365[local388]++;
					Static116.anIntArrayArray24[local388][local71] = local52;
					if (local388 < 10) {
						Static116.anIntArray380[local388] += local35;
					} else if (local388 == 10) {
						Static116.anIntArray381[local71] = local35;
					} else {
						Static116.anIntArray377[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static116.anIntArray365[1] > 0 || Static116.anIntArray365[2] > 0) {
			local40 = (Static116.anIntArray380[1] + Static116.anIntArray380[2]) / (Static116.anIntArray365[1] + Static116.anIntArray365[2]);
		}
		local44 = 0;
		if (Static116.anIntArray365[3] > 0 || Static116.anIntArray365[4] > 0) {
			local44 = (Static116.anIntArray380[3] + Static116.anIntArray380[4]) / (Static116.anIntArray365[3] + Static116.anIntArray365[4]);
		}
		local48 = 0;
		if (Static116.anIntArray365[6] > 0 || Static116.anIntArray365[8] > 0) {
			local48 = (Static116.anIntArray380[6] + Static116.anIntArray380[8]) / (Static116.anIntArray365[6] + Static116.anIntArray365[8]);
		}
		local67 = 0;
		local71 = Static116.anIntArray365[10];
		@Pc(521) int[] local521 = Static116.anIntArrayArray24[10];
		@Pc(523) int[] local523 = Static116.anIntArray381;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static116.anIntArray365[11];
			local521 = Static116.anIntArrayArray24[11];
			local523 = Static116.anIntArray377;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method1760(local521[local67++]);
				if (local67 == local71 && local521 != Static116.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static116.anIntArray365[11];
					local521 = Static116.anIntArrayArray24[11];
					local523 = Static116.anIntArray377;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method1760(local521[local67++]);
				if (local67 == local71 && local521 != Static116.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static116.anIntArray365[11];
					local521 = Static116.anIntArrayArray24[11];
					local523 = Static116.anIntArray377;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method1760(local521[local67++]);
				if (local67 == local71 && local521 != Static116.anIntArrayArray24[11]) {
					local67 = 0;
					local71 = Static116.anIntArray365[11];
					local521 = Static116.anIntArrayArray24[11];
					local523 = Static116.anIntArray377;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static116.anIntArray365[local83];
			@Pc(686) int[] local686 = Static116.anIntArrayArray24[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method1760(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method1760(local521[local67++]);
			if (local67 == local71 && local521 != Static116.anIntArrayArray24[11]) {
				local67 = 0;
				local521 = Static116.anIntArrayArray24[11];
				local71 = Static116.anIntArray365[11];
				local523 = Static116.anIntArray377;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(IIIIIIII)V")
	public void method1764(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static116.anIntArray373[0] = -1;
		if (this.anInt2520 != 2 && this.anInt2520 != 1) {
			this.method1769();
		}
		@Pc(15) int local15 = Static37.anInt1076;
		@Pc(17) int local17 = Static37.anInt1077;
		@Pc(21) int local21 = Static116.anIntArray382[0];
		@Pc(25) int local25 = Static116.anIntArray369[0];
		@Pc(29) int local29 = Static116.anIntArray382[arg0];
		@Pc(33) int local33 = Static116.anIntArray369[arg0];
		@Pc(37) int local37 = Static116.anIntArray382[arg1];
		@Pc(41) int local41 = Static116.anIntArray369[arg1];
		@Pc(45) int local45 = Static116.anIntArray382[arg2];
		@Pc(49) int local49 = Static116.anIntArray369[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2522; local61++) {
			@Pc(67) int local67 = this.anIntArray359[local61];
			@Pc(72) int local72 = this.anIntArray362[local61];
			@Pc(77) int local77 = this.anIntArray356[local61];
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
			Static116.anIntArray376[local61] = local77 - local59;
			Static116.anIntArray374[local61] = local15 + (local67 << 9) / arg6;
			Static116.anIntArray370[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt2523 > 0) {
				Static116.anIntArray366[local61] = local67;
				Static116.anIntArray368[local61] = local89;
				Static116.anIntArray372[local61] = local77;
			}
		}
		try {
			this.method1763(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "()V")
	public void method1765() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2522; local1++) {
			@Pc(7) int local7 = this.anIntArray359[local1];
			this.anIntArray359[local1] = this.anIntArray356[local1];
			this.anIntArray356[local1] = -local7;
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "e", descriptor = "()V")
	public void method1767() {
		if (this.anInt2520 == 1) {
			return;
		}
		this.anInt2520 = 1;
		super.anInt2514 = 0;
		this.anInt2519 = 0;
		this.anInt2525 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt2522; local18++) {
			@Pc(24) int local24 = this.anIntArray359[local18];
			@Pc(29) int local29 = this.anIntArray362[local18];
			@Pc(34) int local34 = this.anIntArray356[local18];
			if (-local29 > super.anInt2514) {
				super.anInt2514 = -local29;
			}
			if (local29 > this.anInt2519) {
				this.anInt2519 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt2525) {
				this.anInt2525 = local58;
			}
		}
		this.anInt2525 = (int) (Math.sqrt((double) this.anInt2525) + 0.99D);
		this.anInt2524 = (int) (Math.sqrt((double) (this.anInt2525 * this.anInt2525 + super.anInt2514 * super.anInt2514)) + 0.99D);
		this.anInt2521 = this.anInt2524 + (int) (Math.sqrt((double) (this.anInt2525 * this.anInt2525 + this.anInt2519 * this.anInt2519)) + 0.99D);
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
	private void method1768(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static37.anInt1076;
		@Pc(3) int local3 = Static37.anInt1077;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray355[arg0];
		@Pc(15) int local15 = this.anIntArray361[arg0];
		@Pc(20) int local20 = this.anIntArray358[arg0];
		@Pc(24) int local24 = Static116.anIntArray372[local10];
		@Pc(28) int local28 = Static116.anIntArray372[local15];
		@Pc(32) int local32 = Static116.anIntArray372[local20];
		if (this.aByteArray62 == null) {
			Static37.anInt1075 = 0;
		} else {
			Static37.anInt1075 = this.aByteArray62[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static116.anIntArray371[0] = Static116.anIntArray374[local10];
			Static116.anIntArray367[0] = Static116.anIntArray370[local10];
			local5++;
			Static116.anIntArray375[0] = this.anIntArray363[arg0];
		} else {
			local73 = Static116.anIntArray366[local10];
			local77 = Static116.anIntArray368[local10];
			local82 = this.anIntArray363[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static116.anIntArray364[local32 - local24];
				Static116.anIntArray371[0] = local1 + (local73 + ((Static116.anIntArray366[local20] - local73) * local95 >> 16) << 9) / 50;
				Static116.anIntArray367[0] = local3 + (local77 + ((Static116.anIntArray368[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static116.anIntArray375[0] = local82 + ((this.anIntArray352[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static116.anIntArray364[local28 - local24];
				Static116.anIntArray371[local5] = local1 + (local73 + ((Static116.anIntArray366[local15] - local73) * local95 >> 16) << 9) / 50;
				Static116.anIntArray367[local5] = local3 + (local77 + ((Static116.anIntArray368[local15] - local77) * local95 >> 16) << 9) / 50;
				Static116.anIntArray375[local5++] = local82 + ((this.anIntArray360[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static116.anIntArray371[local5] = Static116.anIntArray374[local15];
			Static116.anIntArray367[local5] = Static116.anIntArray370[local15];
			Static116.anIntArray375[local5++] = this.anIntArray360[arg0];
		} else {
			local73 = Static116.anIntArray366[local15];
			local77 = Static116.anIntArray368[local15];
			local82 = this.anIntArray360[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static116.anIntArray364[local24 - local28];
				Static116.anIntArray371[local5] = local1 + (local73 + ((Static116.anIntArray366[local10] - local73) * local95 >> 16) << 9) / 50;
				Static116.anIntArray367[local5] = local3 + (local77 + ((Static116.anIntArray368[local10] - local77) * local95 >> 16) << 9) / 50;
				Static116.anIntArray375[local5++] = local82 + ((this.anIntArray363[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static116.anIntArray364[local32 - local28];
				Static116.anIntArray371[local5] = local1 + (local73 + ((Static116.anIntArray366[local20] - local73) * local95 >> 16) << 9) / 50;
				Static116.anIntArray367[local5] = local3 + (local77 + ((Static116.anIntArray368[local20] - local77) * local95 >> 16) << 9) / 50;
				Static116.anIntArray375[local5++] = local82 + ((this.anIntArray352[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static116.anIntArray371[local5] = Static116.anIntArray374[local20];
			Static116.anIntArray367[local5] = Static116.anIntArray370[local20];
			Static116.anIntArray375[local5++] = this.anIntArray352[arg0];
		} else {
			local73 = Static116.anIntArray366[local20];
			local77 = Static116.anIntArray368[local20];
			local82 = this.anIntArray352[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static116.anIntArray364[local28 - local32];
				Static116.anIntArray371[local5] = local1 + (local73 + ((Static116.anIntArray366[local15] - local73) * local95 >> 16) << 9) / 50;
				Static116.anIntArray367[local5] = local3 + (local77 + ((Static116.anIntArray368[local15] - local77) * local95 >> 16) << 9) / 50;
				Static116.anIntArray375[local5++] = local82 + ((this.anIntArray360[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static116.anIntArray364[local24 - local32];
				Static116.anIntArray371[local5] = local1 + (local73 + ((Static116.anIntArray366[local10] - local73) * local95 >> 16) << 9) / 50;
				Static116.anIntArray367[local5] = local3 + (local77 + ((Static116.anIntArray368[local10] - local77) * local95 >> 16) << 9) / 50;
				Static116.anIntArray375[local5++] = local82 + ((this.anIntArray363[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static116.anIntArray371[0];
		local77 = Static116.anIntArray371[1];
		local82 = Static116.anIntArray371[2];
		local95 = Static116.anIntArray367[0];
		@Pc(590) int local590 = Static116.anIntArray367[1];
		@Pc(594) int local594 = Static116.anIntArray367[2];
		Static37.aBoolean64 = false;
		@Pc(683) int local683;
		@Pc(688) int local688;
		@Pc(693) int local693;
		@Pc(678) int local678;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static37.anInt1073 || local77 > Static37.anInt1073 || local82 > Static37.anInt1073) {
				Static37.aBoolean64 = true;
			}
			if (this.aShortArray38 != null && this.aShortArray38[arg0] != -1) {
				if (this.aByteArray63 == null || this.aByteArray63[arg0] == -1) {
					local683 = local10;
					local688 = local15;
					local693 = local20;
				} else {
					local678 = this.aByteArray63[arg0] & 0xFF;
					local683 = this.anIntArray353[local678];
					local688 = this.anIntArray357[local678];
					local693 = this.anIntArray354[local678];
				}
				if (this.anIntArray352[arg0] == -1) {
					Static37.method715(local95, local590, local594, local73, local77, local82, this.anIntArray363[arg0], this.anIntArray363[arg0], this.anIntArray363[arg0], Static116.anIntArray366[local683], Static116.anIntArray366[local688], Static116.anIntArray366[local693], Static116.anIntArray368[local683], Static116.anIntArray368[local688], Static116.anIntArray368[local693], Static116.anIntArray372[local683], Static116.anIntArray372[local688], Static116.anIntArray372[local693], this.aShortArray38[arg0]);
				} else {
					Static37.method715(local95, local590, local594, local73, local77, local82, Static116.anIntArray375[0], Static116.anIntArray375[1], Static116.anIntArray375[2], Static116.anIntArray366[local683], Static116.anIntArray366[local688], Static116.anIntArray366[local693], Static116.anIntArray368[local683], Static116.anIntArray368[local688], Static116.anIntArray368[local693], Static116.anIntArray372[local683], Static116.anIntArray372[local688], Static116.anIntArray372[local693], this.aShortArray38[arg0]);
				}
			} else if (this.anIntArray352[arg0] == -1) {
				Static37.method729(local95, local590, local594, local73, local77, local82, Static116.anIntArray379[this.anIntArray363[arg0]]);
			} else {
				Static37.method721(local95, local590, local594, local73, local77, local82, Static116.anIntArray375[0], Static116.anIntArray375[1], Static116.anIntArray375[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static37.anInt1073 || local77 > Static37.anInt1073 || local82 > Static37.anInt1073 || Static116.anIntArray371[3] < 0 || Static116.anIntArray371[3] > Static37.anInt1073) {
			Static37.aBoolean64 = true;
		}
		if (this.aShortArray38 == null || this.aShortArray38[arg0] == -1) {
			if (this.anIntArray352[arg0] == -1) {
				local683 = Static116.anIntArray379[this.anIntArray363[arg0]];
				Static37.method729(local95, local590, local594, local73, local77, local82, local683);
				Static37.method729(local95, local594, Static116.anIntArray367[3], local73, local82, Static116.anIntArray371[3], local683);
				return;
			}
			Static37.method721(local95, local590, local594, local73, local77, local82, Static116.anIntArray375[0], Static116.anIntArray375[1], Static116.anIntArray375[2]);
			Static37.method721(local95, local594, Static116.anIntArray367[3], local73, local82, Static116.anIntArray371[3], Static116.anIntArray375[0], Static116.anIntArray375[2], Static116.anIntArray375[3]);
			return;
		}
		if (this.aByteArray63 == null || this.aByteArray63[arg0] == -1) {
			local683 = local10;
			local688 = local15;
			local693 = local20;
		} else {
			local678 = this.aByteArray63[arg0] & 0xFF;
			local683 = this.anIntArray353[local678];
			local688 = this.anIntArray357[local678];
			local693 = this.anIntArray354[local678];
		}
		@Pc(956) short local956 = this.aShortArray38[arg0];
		if (this.anIntArray352[arg0] == -1) {
			Static37.method715(local95, local590, local594, local73, local77, local82, this.anIntArray363[arg0], this.anIntArray363[arg0], this.anIntArray363[arg0], Static116.anIntArray366[local683], Static116.anIntArray366[local688], Static116.anIntArray366[local693], Static116.anIntArray368[local683], Static116.anIntArray368[local688], Static116.anIntArray368[local693], Static116.anIntArray372[local683], Static116.anIntArray372[local688], Static116.anIntArray372[local693], local956);
			Static37.method715(local95, local594, Static116.anIntArray367[3], local73, local82, Static116.anIntArray371[3], this.anIntArray363[arg0], this.anIntArray363[arg0], this.anIntArray363[arg0], Static116.anIntArray366[local683], Static116.anIntArray366[local688], Static116.anIntArray366[local693], Static116.anIntArray368[local683], Static116.anIntArray368[local688], Static116.anIntArray368[local693], Static116.anIntArray372[local683], Static116.anIntArray372[local688], Static116.anIntArray372[local693], local956);
			return;
		}
		Static37.method715(local95, local590, local594, local73, local77, local82, Static116.anIntArray375[0], Static116.anIntArray375[1], Static116.anIntArray375[2], Static116.anIntArray366[local683], Static116.anIntArray366[local688], Static116.anIntArray366[local693], Static116.anIntArray368[local683], Static116.anIntArray368[local688], Static116.anIntArray368[local693], Static116.anIntArray372[local683], Static116.anIntArray372[local688], Static116.anIntArray372[local693], local956);
		Static37.method715(local95, local594, Static116.anIntArray367[3], local73, local82, Static116.anIntArray371[3], Static116.anIntArray375[0], Static116.anIntArray375[2], Static116.anIntArray375[3], Static116.anIntArray366[local683], Static116.anIntArray366[local688], Static116.anIntArray366[local693], Static116.anIntArray368[local683], Static116.anIntArray368[local688], Static116.anIntArray368[local693], Static116.anIntArray372[local683], Static116.anIntArray372[local688], Static116.anIntArray372[local693], local956);
	}

	@OriginalMember(owner = "client!u", name = "f", descriptor = "()V")
	private void method1769() {
		if (this.anInt2520 == 2) {
			return;
		}
		this.anInt2520 = 2;
		this.anInt2525 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt2522; local12++) {
			@Pc(18) int local18 = this.anIntArray359[local12];
			@Pc(23) int local23 = this.anIntArray362[local12];
			@Pc(28) int local28 = this.anIntArray356[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt2525) {
				this.anInt2525 = local40;
			}
		}
		this.anInt2525 = (int) (Math.sqrt((double) this.anInt2525) + 0.99D);
		this.anInt2524 = this.anInt2525;
		this.anInt2521 = this.anInt2525 + this.anInt2525;
	}

	@OriginalMember(owner = "client!u", name = "h", descriptor = "(I)V")
	public void method1770(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static116.anIntArray382[arg0];
		@Pc(7) int local7 = Static116.anIntArray369[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2522; local9++) {
			@Pc(26) int local26 = this.anIntArray362[local9] * local7 - this.anIntArray356[local9] * local3 >> 16;
			this.anIntArray356[local9] = this.anIntArray362[local9] * local3 + this.anIntArray356[local9] * local7 >> 16;
			this.anIntArray362[local9] = local26;
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1771(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static116.aByteArray65.length < this.anInt2526) {
			Static116.aByteArray65 = new byte[this.anInt2526 + 100];
		}
		return this.method1759(arg0, Static116.aClass4_Sub4_Sub3_Sub7_2, Static116.aByteArray65);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIII)V")
	public void method1772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static116.anIntArray373[0] = -1;
		if (this.anInt2520 != 2 && this.anInt2520 != 1) {
			this.method1769();
		}
		@Pc(15) int local15 = Static37.anInt1076;
		@Pc(17) int local17 = Static37.anInt1077;
		@Pc(21) int local21 = Static116.anIntArray382[0];
		@Pc(25) int local25 = Static116.anIntArray369[0];
		@Pc(29) int local29 = Static116.anIntArray382[arg0];
		@Pc(33) int local33 = Static116.anIntArray369[arg0];
		@Pc(37) int local37 = Static116.anIntArray382[arg1];
		@Pc(41) int local41 = Static116.anIntArray369[arg1];
		@Pc(45) int local45 = Static116.anIntArray382[arg2];
		@Pc(49) int local49 = Static116.anIntArray369[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt2522; local61++) {
			@Pc(67) int local67 = this.anIntArray359[local61];
			@Pc(72) int local72 = this.anIntArray362[local61];
			@Pc(77) int local77 = this.anIntArray356[local61];
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
			Static116.anIntArray376[local61] = local77 - local59;
			Static116.anIntArray374[local61] = local15 + (local67 << 9) / local77;
			Static116.anIntArray370[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt2523 > 0) {
				Static116.anIntArray366[local61] = local67;
				Static116.anIntArray368[local61] = local89;
				Static116.anIntArray372[local61] = local77;
			}
		}
		try {
			this.method1763(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(III)V")
	public void method1773(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2522; local1++) {
			this.anIntArray359[local1] += arg0;
			this.anIntArray362[local1] += arg1;
			this.anIntArray356[local1] += arg2;
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(III)V")
	public void method1774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2522; local1++) {
			this.anIntArray359[local1] = this.anIntArray359[local1] * arg0 / 128;
			this.anIntArray362[local1] = this.anIntArray362[local1] * arg1 / 128;
			this.anIntArray356[local1] = this.anIntArray356[local1] * arg2 / 128;
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([[IIIIZI)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1775(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5) {
		this.method1767();
		@Pc(6) int local6 = arg1 - this.anInt2525;
		@Pc(11) int local11 = arg1 + this.anInt2525;
		@Pc(16) int local16 = arg3 - this.anInt2525;
		@Pc(21) int local21 = arg3 + this.anInt2525;
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
		@Pc(101) Class4_Sub4_Sub3_Sub7 local101;
		if (arg4) {
			local101 = new Class4_Sub4_Sub3_Sub7();
			local101.anInt2522 = this.anInt2522;
			local101.anInt2526 = this.anInt2526;
			local101.anInt2523 = this.anInt2523;
			local101.anIntArray359 = this.anIntArray359;
			local101.anIntArray356 = this.anIntArray356;
			local101.anIntArray355 = this.anIntArray355;
			local101.anIntArray361 = this.anIntArray361;
			local101.anIntArray358 = this.anIntArray358;
			local101.anIntArray363 = this.anIntArray363;
			local101.anIntArray360 = this.anIntArray360;
			local101.anIntArray352 = this.anIntArray352;
			local101.aByteArray64 = this.aByteArray64;
			local101.aByteArray62 = this.aByteArray62;
			local101.aByteArray63 = this.aByteArray63;
			local101.aShortArray38 = this.aShortArray38;
			local101.aByte7 = this.aByte7;
			local101.anIntArray353 = this.anIntArray353;
			local101.anIntArray357 = this.anIntArray357;
			local101.anIntArray354 = this.anIntArray354;
			local101.anIntArrayArray22 = this.anIntArrayArray22;
			local101.anIntArrayArray23 = this.anIntArrayArray23;
			local101.aBoolean147 = this.aBoolean147;
			local101.anIntArray362 = new int[local101.anInt2522];
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
			for (local201 = 0; local201 < local101.anInt2522; local201++) {
				local209 = this.anIntArray359[local201] + arg1;
				local216 = this.anIntArray356[local201] + arg3;
				local220 = local209 & 0x7F;
				local224 = local216 & 0x7F;
				local228 = local209 >> 7;
				local232 = local216 >> 7;
				local254 = arg0[local228][local232] * (128 - local220) + arg0[local228 + 1][local232] * local220 >> 7;
				local280 = arg0[local228][local232 + 1] * (128 - local220) + arg0[local228 + 1][local232 + 1] * local220 >> 7;
				local292 = local254 * (128 - local224) + local280 * local224 >> 7;
				local101.anIntArray362[local201] = this.anIntArray362[local201] + local292 - arg2;
			}
		} else {
			for (local201 = 0; local201 < local101.anInt2522; local201++) {
				local209 = (-this.anIntArray362[local201] << 16) / super.anInt2514;
				if (local209 < arg5) {
					local216 = this.anIntArray359[local201] + arg1;
					local220 = this.anIntArray356[local201] + arg3;
					local224 = local216 & 0x7F;
					local228 = local220 & 0x7F;
					local232 = local216 >> 7;
					local254 = local220 >> 7;
					local280 = arg0[local232][local254] * (128 - local224) + arg0[local232 + 1][local254] * local224 >> 7;
					local292 = arg0[local232][local254 + 1] * (128 - local224) + arg0[local232 + 1][local254 + 1] * local224 >> 7;
					@Pc(417) int local417 = local280 * (128 - local228) + local292 * local228 >> 7;
					local101.anIntArray362[local201] = this.anIntArray362[local201] + (local417 - arg2) * (arg5 - local209) / arg5;
				}
			}
		}
		local101.anInt2520 = 0;
		return local101;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!wb;I)V")
	public void method1776(@OriginalArg(0) Class4_Sub4_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray22 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class52 local12 = arg0.aClass52Array1[arg1];
		@Pc(15) Class4_Sub11 local15 = local12.aClass4_Sub11_1;
		Static116.anInt2529 = 0;
		Static116.anInt2532 = 0;
		Static116.anInt2530 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1990; local23++) {
			@Pc(29) int local29 = local12.anIntArray275[local23];
			this.method1757(local15.anIntArray125[local29], local15.anIntArrayArray8[local29], local12.anIntArray270[local23], local12.anIntArray268[local23], local12.anIntArray273[local23]);
		}
		this.anInt2520 = 0;
	}

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(Z)Lclient!u;")
	public Class4_Sub4_Sub3_Sub7 method1777(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static116.aByteArray66.length < this.anInt2526) {
			Static116.aByteArray66 = new byte[this.anInt2526 + 100];
		}
		return this.method1759(arg0, Static116.aClass4_Sub4_Sub3_Sub7_3, Static116.aByteArray66);
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static116.anIntArray373[0] = -1;
		if (this.anInt2520 != 1) {
			this.method1767();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt2525 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt2525 << 9;
		if (local64 / local40 >= Static37.anInt1071) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt2525 << 9;
		if (local77 / local40 <= Static37.anInt1074) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt2525 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static37.anInt1072) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2514 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static37.anInt1079) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2514 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt2523 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static116.aBoolean148) {
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
			local219 = Static116.anInt2528 - Static37.anInt1076;
			local223 = Static116.anInt2531 - Static37.anInt1077;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean147) {
					Static116.anIntArray378[Static116.anInt2527++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static37.anInt1076;
		local219 = Static37.anInt1077;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static116.anIntArray382[arg0];
			local257 = Static116.anIntArray369[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt2522; local269++) {
			@Pc(275) int local275 = this.anIntArray359[local269];
			@Pc(280) int local280 = this.anIntArray362[local269];
			@Pc(285) int local285 = this.anIntArray356[local269];
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
			Static116.anIntArray376[local269] = local285 - local29;
			if (local285 >= 50) {
				Static116.anIntArray374[local269] = local172 + (local275 << 9) / local285;
				Static116.anIntArray370[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static116.anIntArray374[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static116.anIntArray366[local269] = local275;
				Static116.anIntArray368[local269] = local297;
				Static116.anIntArray372[local269] = local285;
			}
		}
		try {
			this.method1763(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!u", name = "g", descriptor = "()I")
	public int method1778() {
		this.method1767();
		return this.anInt2525;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(Lclient!wb;ILclient!wb;I[I)V")
	public void method1779(@OriginalArg(0) Class4_Sub4_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub4_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method1776(arg0, arg1);
			return;
		}
		@Pc(18) Class52 local18 = arg0.aClass52Array1[arg1];
		@Pc(23) Class52 local23 = arg2.aClass52Array1[arg3];
		@Pc(26) Class4_Sub11 local26 = local18.aClass4_Sub11_1;
		Static116.anInt2529 = 0;
		Static116.anInt2532 = 0;
		Static116.anInt2530 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1990; local41++) {
			local47 = local18.anIntArray275[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray125[local47] == 0) {
				this.method1757(local26.anIntArray125[local47], local26.anIntArrayArray8[local47], local18.anIntArray270[local41], local18.anIntArray268[local41], local18.anIntArray273[local41]);
			}
		}
		Static116.anInt2529 = 0;
		Static116.anInt2532 = 0;
		Static116.anInt2530 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1990; local47++) {
			@Pc(112) int local112 = local23.anIntArray275[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray125[local112] == 0) {
				this.method1757(local26.anIntArray125[local112], local26.anIntArrayArray8[local112], local23.anIntArray270[local47], local23.anIntArray268[local47], local23.anIntArray273[local47]);
			}
		}
		this.anInt2520 = 0;
	}
}
