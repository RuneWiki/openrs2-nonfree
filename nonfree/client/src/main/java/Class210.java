import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lm")
public final class Class210 {

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "[B")
	public byte[] aByteArray57;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "[I")
	public int[] anIntArray402;

	@OriginalMember(owner = "client!lm", name = "f", descriptor = "[S")
	public short[] aShortArray84;

	@OriginalMember(owner = "client!lm", name = "i", descriptor = "[B")
	public byte[] aByteArray59;

	@OriginalMember(owner = "client!lm", name = "k", descriptor = "[B")
	public byte[] aByteArray60;

	@OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
	public int[] anIntArray403;

	@OriginalMember(owner = "client!lm", name = "m", descriptor = "[S")
	public short[] aShortArray85;

	@OriginalMember(owner = "client!lm", name = "p", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!lm", name = "q", descriptor = "[B")
	public byte[] aByteArray61;

	@OriginalMember(owner = "client!lm", name = "r", descriptor = "[I")
	public int[] anIntArray405;

	@OriginalMember(owner = "client!lm", name = "s", descriptor = "[I")
	public int[] anIntArray406;

	@OriginalMember(owner = "client!lm", name = "u", descriptor = "[S")
	public short[] aShortArray86;

	@OriginalMember(owner = "client!lm", name = "w", descriptor = "[Lclient!pn;")
	public Class264[] aClass264Array1;

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!lm", name = "z", descriptor = "[Lclient!lea;")
	public Class206[] aClass206Array3;

	@OriginalMember(owner = "client!lm", name = "A", descriptor = "[I")
	public int[] anIntArray407;

	@OriginalMember(owner = "client!lm", name = "B", descriptor = "[B")
	public byte[] aByteArray62;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "[I")
	public int[] anIntArray408;

	@OriginalMember(owner = "client!lm", name = "D", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "[I")
	public int[] anIntArray409;

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!lm", name = "K", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!lm", name = "M", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!lm", name = "N", descriptor = "[I")
	public int[] anIntArray411;

	@OriginalMember(owner = "client!lm", name = "O", descriptor = "[B")
	public byte[] aByteArray63;

	@OriginalMember(owner = "client!lm", name = "Q", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!lm", name = "R", descriptor = "[Lclient!in;")
	public Class158[] aClass158Array3;

	@OriginalMember(owner = "client!lm", name = "T", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!lm", name = "W", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!lm", name = "ab", descriptor = "[I")
	public int[] anIntArray412;

	@OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
	public int anInt5245 = 0;

	@OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
	public int anInt5244 = 0;

	@OriginalMember(owner = "client!lm", name = "F", descriptor = "B")
	public byte aByte81 = 0;

	@OriginalMember(owner = "client!lm", name = "P", descriptor = "I")
	public int anInt5254 = 0;

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public int anInt5242 = 0;

	@OriginalMember(owner = "client!lm", name = "G", descriptor = "I")
	public int anInt5251 = 12;

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "()V")
	private Class210() {
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([B)V")
	public Class210(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4263(arg0);
		} else {
			this.method4271(arg0);
		}
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(III)V")
	public Class210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray89 = new short[arg1];
		this.anIntArray405 = new int[arg0];
		this.aByteArray57 = new byte[arg1];
		this.aShortArray87 = new short[arg1];
		this.aByteArray60 = new byte[arg1];
		this.aShortArray84 = new short[arg1];
		this.anIntArray408 = new int[arg0];
		this.anIntArray409 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray63 = new byte[arg2];
			this.aByteArray62 = new byte[arg2];
			this.anIntArray412 = new int[arg2];
			this.anIntArray404 = new int[arg2];
			this.anIntArray411 = new int[arg2];
			this.aShortArray92 = new short[arg2];
			this.anIntArray406 = new int[arg2];
			this.aShortArray91 = new short[arg2];
			this.anIntArray402 = new int[arg2];
			this.anIntArray403 = new int[arg2];
			this.aShortArray85 = new short[arg2];
			this.aByteArray59 = new byte[arg2];
		}
		this.anIntArray410 = new int[arg1];
		this.aByteArray61 = new byte[arg1];
		this.aShortArray88 = new short[arg1];
		this.aShortArray93 = new short[arg1];
		this.aByteArray58 = new byte[arg1];
		this.anIntArray407 = new int[arg0];
	}

	@OriginalMember(owner = "client!lm", name = "<init>", descriptor = "([Lclient!lm;I)V")
	public Class210(@OriginalArg(0) Class210[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5245 = 0;
		this.anInt5244 = 0;
		this.anInt5254 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte81 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class210 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5254 += local59.anInt5254;
				this.anInt5245 += local59.anInt5245;
				this.anInt5244 += local59.anInt5244;
				local38 |= local59.aByteArray57 != null;
				if (local59.aClass206Array3 != null) {
					local32 += local59.aClass206Array3.length;
				}
				if (local59.aClass264Array1 != null) {
					local36 += local59.aClass264Array1.length;
				}
				if (local59.aClass158Array3 != null) {
					local34 += local59.aClass158Array3.length;
				}
				local46 |= local59.aShortArray88 != null;
				local42 |= local59.aByteArray61 != null;
				local51 |= local59.anIntArray410 != null;
				if (local59.aByteArray60 == null) {
					if (this.aByte81 == -1) {
						this.aByte81 = local59.aByte81;
					}
					if (local59.aByte81 != this.aByte81) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray58 != null;
			}
		}
		this.aShortArray89 = new short[this.anInt5254];
		if (local46) {
			this.aShortArray88 = new short[this.anInt5254];
		}
		if (local38) {
			this.aByteArray57 = new byte[this.anInt5254];
		}
		if (local32 > 0) {
			this.aClass206Array3 = new Class206[local32];
		}
		if (this.anInt5245 > 0) {
			this.anIntArray404 = new int[this.anInt5245];
			this.anIntArray402 = new int[this.anInt5245];
			this.aByteArray63 = new byte[this.anInt5245];
			this.aByteArray59 = new byte[this.anInt5245];
			this.aShortArray92 = new short[this.anInt5245];
			this.aShortArray85 = new short[this.anInt5245];
			this.aShortArray91 = new short[this.anInt5245];
			this.aByteArray62 = new byte[this.anInt5245];
			this.anIntArray403 = new int[this.anInt5245];
			this.anIntArray406 = new int[this.anInt5245];
			this.anIntArray412 = new int[this.anInt5245];
			this.anIntArray411 = new int[this.anInt5245];
		}
		if (local36 > 0) {
			this.aClass264Array1 = new Class264[local36];
		}
		this.aShortArray93 = new short[this.anInt5254];
		this.aShortArray90 = new short[this.anInt5254];
		this.aShortArray87 = new short[this.anInt5254];
		this.anIntArray409 = new int[this.anInt5244];
		this.anIntArray408 = new int[this.anInt5244];
		this.aShortArray86 = new short[this.anInt5244];
		if (local42) {
			this.aByteArray61 = new byte[this.anInt5254];
		}
		this.aShortArray84 = new short[this.anInt5254];
		this.anIntArray407 = new int[this.anInt5244];
		if (local44) {
			this.aByteArray58 = new byte[this.anInt5254];
		}
		if (local34 > 0) {
			this.aClass158Array3 = new Class158[local34];
		}
		if (local40) {
			this.aByteArray60 = new byte[this.anInt5254];
		}
		this.anIntArray405 = new int[this.anInt5244];
		if (local51) {
			this.anIntArray410 = new int[this.anInt5254];
		}
		local32 = 0;
		this.anInt5244 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt5254 = 0;
		this.anInt5245 = 0;
		@Pc(622) int local622;
		@Pc(633) int local633;
		for (@Pc(382) int local382 = 0; local382 < arg1; local382++) {
			@Pc(389) short local389 = (short) (0x1 << local382);
			@Pc(393) Class210 local393 = arg0[local382];
			if (local393 != null) {
				@Pc(400) int local400;
				if (local393.aClass264Array1 != null) {
					for (local400 = 0; local400 < local393.aClass264Array1.length; local400++) {
						@Pc(407) Class264 local407 = local393.aClass264Array1[local400];
						this.aClass264Array1[local36++] = local407.method5645(local407.anInt7109 + this.anInt5254);
					}
				}
				for (local400 = 0; local400 < local393.anInt5254; local400++) {
					if (local38 && local393.aByteArray57 != null) {
						this.aByteArray57[this.anInt5254] = local393.aByteArray57[local400];
					}
					if (local40) {
						if (local393.aByteArray60 == null) {
							this.aByteArray60[this.anInt5254] = local393.aByte81;
						} else {
							this.aByteArray60[this.anInt5254] = local393.aByteArray60[local400];
						}
					}
					if (local42 && local393.aByteArray61 != null) {
						this.aByteArray61[this.anInt5254] = local393.aByteArray61[local400];
					}
					if (local46) {
						if (local393.aShortArray88 == null) {
							this.aShortArray88[this.anInt5254] = -1;
						} else {
							this.aShortArray88[this.anInt5254] = local393.aShortArray88[local400];
						}
					}
					if (local51) {
						if (local393.anIntArray410 == null) {
							this.anIntArray410[this.anInt5254] = -1;
						} else {
							this.anIntArray410[this.anInt5254] = local393.anIntArray410[local400];
						}
					}
					this.aShortArray89[this.anInt5254] = (short) this.method4270(local389, local393.aShortArray89[local400], local393);
					this.aShortArray93[this.anInt5254] = (short) this.method4270(local389, local393.aShortArray93[local400], local393);
					this.aShortArray84[this.anInt5254] = (short) this.method4270(local389, local393.aShortArray84[local400], local393);
					this.aShortArray90[this.anInt5254] = local389;
					this.aShortArray87[this.anInt5254] = local393.aShortArray87[local400];
					this.anInt5254++;
				}
				@Pc(609) int local609;
				if (local393.aClass206Array3 != null) {
					for (local609 = 0; local609 < local393.aClass206Array3.length; local609++) {
						local622 = this.method4270(local389, local393.aClass206Array3[local609].anInt5078, local393);
						local633 = this.method4270(local389, local393.aClass206Array3[local609].anInt5079, local393);
						@Pc(644) int local644 = this.method4270(local389, local393.aClass206Array3[local609].anInt5080, local393);
						this.aClass206Array3[local32] = local393.aClass206Array3[local609].method4131(local633, local622, local644);
						local32++;
					}
				}
				if (local393.aClass158Array3 != null) {
					for (local609 = 0; local609 < local393.aClass158Array3.length; local609++) {
						local622 = this.method4270(local389, local393.aClass158Array3[local609].anInt4248, local393);
						this.aClass158Array3[local34] = local393.aClass158Array3[local609].method3424(local622);
						local34++;
					}
				}
			}
		}
		this.anInt5242 = this.anInt5244;
		@Pc(714) int local714 = 0;
		for (@Pc(716) int local716 = 0; local716 < arg1; local716++) {
			@Pc(723) short local723 = (short) (0x1 << local716);
			@Pc(727) Class210 local727 = arg0[local716];
			if (local727 != null) {
				for (local622 = 0; local622 < local727.anInt5254; local622++) {
					if (local44) {
						this.aByteArray58[local714++] = (byte) (local727.aByteArray58 == null || local727.aByteArray58[local622] == -1 ? -1 : this.anInt5245 + local727.aByteArray58[local622]);
					}
				}
				for (local633 = 0; local633 < local727.anInt5245; local633++) {
					@Pc(783) byte local783 = this.aByteArray62[this.anInt5245] = local727.aByteArray62[local633];
					if (local783 == 0) {
						this.aShortArray85[this.anInt5245] = (short) this.method4270(local723, local727.aShortArray85[local633], local727);
						this.aShortArray92[this.anInt5245] = (short) this.method4270(local723, local727.aShortArray92[local633], local727);
						this.aShortArray91[this.anInt5245] = (short) this.method4270(local723, local727.aShortArray91[local633], local727);
					}
					if (local783 >= 1 && local783 <= 3) {
						this.aShortArray85[this.anInt5245] = local727.aShortArray85[local633];
						this.aShortArray92[this.anInt5245] = local727.aShortArray92[local633];
						this.aShortArray91[this.anInt5245] = local727.aShortArray91[local633];
						this.anIntArray402[this.anInt5245] = local727.anIntArray402[local633];
						this.anIntArray404[this.anInt5245] = local727.anIntArray404[local633];
						this.anIntArray412[this.anInt5245] = local727.anIntArray412[local633];
						this.aByteArray59[this.anInt5245] = local727.aByteArray59[local633];
						this.aByteArray63[this.anInt5245] = local727.aByteArray63[local633];
						this.anIntArray406[this.anInt5245] = local727.anIntArray406[local633];
					}
					if (local783 == 2) {
						this.anIntArray403[this.anInt5245] = local727.anIntArray403[local633];
						this.anIntArray411[this.anInt5245] = local727.anIntArray411[local633];
					}
					this.anInt5245++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(SBS)V")
	public void method4256(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray88 == null) {
			return;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt5254; local18++) {
			if (this.aShortArray88[local18] == arg0) {
				this.aShortArray88[local18] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)[[I")
	public int[][] method4257() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt5254; local17++) {
			@Pc(24) int local24 = this.anIntArray410[local17];
			if (local24 >= 0) {
				if (local24 > local15) {
					local15 = local24;
				}
				@Pc(42) int local42 = local13[local24]++;
			}
		}
		@Pc(55) int[][] local55 = new int[local15 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local15; local57++) {
			local55[local57] = new int[local13[local57]];
			local13[local57] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt5254; local76++) {
			@Pc(83) int local83 = this.anIntArray410[local76];
			if (local83 >= 0) {
				local55[local83][local13[local83]++] = local76;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(SSI)V")
	public void method4258(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt5254; local3++) {
			if (arg0 == this.aShortArray87[local3]) {
				this.aShortArray87[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public void method4260() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5244; local11++) {
			this.anIntArray407[local11] <<= 0x2;
			this.anIntArray409[local11] <<= 0x2;
			this.anIntArray405[local11] <<= 0x2;
		}
		if (this.anInt5245 <= 0 || this.anIntArray402 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray402.length; local54++) {
			this.anIntArray402[local54] <<= 0x2;
			this.anIntArray404[local54] <<= 0x2;
			if (this.aByteArray62[local54] != 1) {
				this.anIntArray412[local54] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(SIBIBSBIB)I")
	public int method4261(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) short arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray89[this.anInt5254] = (short) arg6;
		this.aShortArray93[this.anInt5254] = (short) arg1;
		this.aShortArray84[this.anInt5254] = (short) arg3;
		this.aByteArray57[this.anInt5254] = arg7;
		this.aByteArray58[this.anInt5254] = arg2;
		this.aShortArray87[this.anInt5254] = arg4;
		this.aByteArray61[this.anInt5254] = arg5;
		this.aShortArray88[this.anInt5254] = arg0;
		return this.anInt5254++;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IIII)V")
	public void method4262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(13) int local13;
		@Pc(32) int local32;
		if (arg1 != 0) {
			local7 = Class1_Sub6_Sub2.anIntArray675[arg1];
			local11 = Class1_Sub6_Sub2.anIntArray676[arg1];
			for (local13 = 0; local13 < this.anInt5244; local13++) {
				local32 = this.anIntArray409[local13] * local7 + this.anIntArray407[local13] * local11 >> 14;
				this.anIntArray409[local13] = this.anIntArray409[local13] * local11 - this.anIntArray407[local13] * local7 >> 14;
				this.anIntArray407[local13] = local32;
			}
		}
		if (arg0 != 0) {
			local7 = Class1_Sub6_Sub2.anIntArray675[arg0];
			local11 = Class1_Sub6_Sub2.anIntArray676[arg0];
			for (local13 = 0; local13 < this.anInt5244; local13++) {
				local32 = this.anIntArray409[local13] * local11 - local7 * this.anIntArray405[local13] >> 14;
				this.anIntArray405[local13] = this.anIntArray405[local13] * local11 + this.anIntArray409[local13] * local7 >> 14;
				this.anIntArray409[local13] = local32;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local7 = Class1_Sub6_Sub2.anIntArray675[arg2];
		local11 = Class1_Sub6_Sub2.anIntArray676[arg2];
		for (local13 = 0; local13 < this.anInt5244; local13++) {
			local32 = local7 * this.anIntArray405[local13] + local11 * this.anIntArray407[local13] >> 14;
			this.anIntArray405[local13] = local11 * this.anIntArray405[local13] - local7 * this.anIntArray407[local13] >> 14;
			this.anIntArray407[local13] = local32;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "([BI)V")
	private void method4263(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub35 local10 = new Class1_Sub35(arg0);
		@Pc(15) Class1_Sub35 local15 = new Class1_Sub35(arg0);
		@Pc(20) Class1_Sub35 local20 = new Class1_Sub35(arg0);
		@Pc(25) Class1_Sub35 local25 = new Class1_Sub35(arg0);
		@Pc(36) Class1_Sub35 local36 = new Class1_Sub35(arg0);
		@Pc(41) Class1_Sub35 local41 = new Class1_Sub35(arg0);
		@Pc(46) Class1_Sub35 local46 = new Class1_Sub35(arg0);
		local10.anInt7214 = arg0.length - 23;
		this.anInt5244 = local10.method5771();
		this.anInt5254 = local10.method5771();
		this.anInt5245 = local10.method5750();
		@Pc(71) int local71 = local10.method5750();
		@Pc(82) boolean local82 = (local71 & 0x1) == 1;
		@Pc(93) boolean local93 = (local71 & 0x2) == 2;
		@Pc(102) boolean local102 = (local71 & 0x4) == 4;
		@Pc(113) boolean local113 = (local71 & 0x8) == 8;
		if (local113) {
			local10.anInt7214 -= 7;
			this.anInt5251 = local10.method5750();
			local10.anInt7214 += 6;
		}
		@Pc(136) int local136 = local10.method5750();
		@Pc(140) int local140 = local10.method5750();
		@Pc(144) int local144 = local10.method5750();
		@Pc(148) int local148 = local10.method5750();
		@Pc(152) int local152 = local10.method5750();
		@Pc(156) int local156 = local10.method5771();
		@Pc(160) int local160 = local10.method5771();
		@Pc(164) int local164 = local10.method5771();
		@Pc(168) int local168 = local10.method5771();
		@Pc(172) int local172 = local10.method5771();
		@Pc(174) int local174 = 0;
		@Pc(176) int local176 = 0;
		@Pc(178) int local178 = 0;
		@Pc(191) int local191;
		if (this.anInt5245 > 0) {
			this.aByteArray62 = new byte[this.anInt5245];
			local10.anInt7214 = 0;
			for (local191 = 0; local191 < this.anInt5245; local191++) {
				@Pc(202) byte local202 = this.aByteArray62[local191] = local10.method5751();
				if (local202 == 2) {
					local178++;
				}
				if (local202 >= 1 && local202 <= 3) {
					local176++;
				}
				if (local202 == 0) {
					local174++;
				}
			}
		}
		local191 = this.anInt5245;
		@Pc(235) int local235 = local191;
		local191 += this.anInt5244;
		@Pc(242) int local242 = local191;
		if (local82) {
			local191 += this.anInt5254;
		}
		@Pc(251) int local251 = local191;
		local191 += this.anInt5254;
		@Pc(258) int local258 = local191;
		if (local136 == 255) {
			local191 += this.anInt5254;
		}
		@Pc(270) int local270 = local191;
		if (local144 == 1) {
			local191 += this.anInt5254;
		}
		@Pc(280) int local280 = local191;
		if (local152 == 1) {
			local191 += this.anInt5244;
		}
		@Pc(290) int local290 = local191;
		if (local140 == 1) {
			local191 += this.anInt5254;
		}
		@Pc(300) int local300 = local191;
		local191 += local168;
		@Pc(306) int local306 = local191;
		if (local148 == 1) {
			local191 += this.anInt5254 * 2;
		}
		@Pc(320) int local320 = local191;
		local191 += local172;
		@Pc(326) int local326 = local191;
		local191 += this.anInt5254 * 2;
		@Pc(335) int local335 = local191;
		local191 += local156;
		@Pc(341) int local341 = local191;
		local191 += local160;
		@Pc(347) int local347 = local191;
		local191 += local164;
		@Pc(353) int local353 = local191;
		local191 += local174 * 6;
		@Pc(361) int local361 = local191;
		local191 += local176 * 6;
		@Pc(369) byte local369 = 6;
		if (this.anInt5251 == 14) {
			local369 = 7;
		} else if (this.anInt5251 >= 15) {
			local369 = 9;
		}
		@Pc(387) int local387 = local191;
		local191 += local369 * local176;
		@Pc(395) int local395 = local191;
		local191 += local176;
		@Pc(401) int local401 = local191;
		local191 += local176;
		@Pc(407) int local407 = local191;
		local191 += local176 + local178 * 2;
		this.aShortArray84 = new short[this.anInt5254];
		if (this.anInt5245 > 0) {
			if (local176 > 0) {
				this.anIntArray404 = new int[local176];
				this.anIntArray402 = new int[local176];
				this.aByteArray63 = new byte[local176];
				this.aByteArray59 = new byte[local176];
				this.anIntArray412 = new int[local176];
				this.anIntArray406 = new int[local176];
			}
			if (local178 > 0) {
				this.anIntArray411 = new int[local178];
				this.anIntArray403 = new int[local178];
			}
			this.aShortArray92 = new short[this.anInt5245];
			this.aShortArray91 = new short[this.anInt5245];
			this.aShortArray85 = new short[this.anInt5245];
		}
		if (local136 == 255) {
			this.aByteArray60 = new byte[this.anInt5254];
		} else {
			this.aByte81 = (byte) local136;
		}
		this.anIntArray407 = new int[this.anInt5244];
		this.anIntArray409 = new int[this.anInt5244];
		this.anIntArray405 = new int[this.anInt5244];
		if (local148 == 1 && this.anInt5245 > 0) {
			this.aByteArray58 = new byte[this.anInt5254];
		}
		if (local82) {
			this.aByteArray57 = new byte[this.anInt5254];
		}
		this.aShortArray89 = new short[this.anInt5254];
		this.aShortArray93 = new short[this.anInt5254];
		if (local140 == 1) {
			this.aByteArray61 = new byte[this.anInt5254];
		}
		if (local152 == 1) {
			this.anIntArray408 = new int[this.anInt5244];
		}
		local10.anInt7214 = local235;
		if (local148 == 1) {
			this.aShortArray88 = new short[this.anInt5254];
		}
		if (local144 == 1) {
			this.anIntArray410 = new int[this.anInt5254];
		}
		this.aShortArray87 = new short[this.anInt5254];
		local15.anInt7214 = local335;
		local20.anInt7214 = local341;
		local25.anInt7214 = local347;
		local36.anInt7214 = local280;
		@Pc(607) int local607 = 0;
		@Pc(609) int local609 = 0;
		@Pc(611) int local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt5244; local613++) {
			local619 = local10.method5750();
			@Pc(621) int local621 = 0;
			if ((local619 & 0x1) != 0) {
				local621 = local15.method5752();
			}
			@Pc(631) int local631 = 0;
			if ((local619 & 0x2) != 0) {
				local631 = local20.method5752();
			}
			@Pc(646) int local646 = 0;
			if ((local619 & 0x4) != 0) {
				local646 = local25.method5752();
			}
			this.anIntArray407[local613] = local621 + local607;
			this.anIntArray409[local613] = local631 + local609;
			this.anIntArray405[local613] = local611 + local646;
			local607 = this.anIntArray407[local613];
			local609 = this.anIntArray409[local613];
			local611 = this.anIntArray405[local613];
			if (local152 == 1) {
				this.anIntArray408[local613] = local36.method5750();
			}
		}
		local10.anInt7214 = local326;
		local15.anInt7214 = local242;
		local20.anInt7214 = local258;
		local25.anInt7214 = local290;
		local36.anInt7214 = local270;
		local41.anInt7214 = local306;
		local46.anInt7214 = local320;
		for (local619 = 0; local619 < this.anInt5254; local619++) {
			this.aShortArray87[local619] = (short) local10.method5771();
			if (local82) {
				this.aByteArray57[local619] = local15.method5751();
			}
			if (local136 == 255) {
				this.aByteArray60[local619] = local20.method5751();
			}
			if (local140 == 1) {
				this.aByteArray61[local619] = local25.method5751();
			}
			if (local144 == 1) {
				this.anIntArray410[local619] = local36.method5750();
			}
			if (local148 == 1) {
				this.aShortArray88[local619] = (short) (local41.method5771() - 1);
			}
			if (this.aByteArray58 != null) {
				if (this.aShortArray88[local619] == -1) {
					this.aByteArray58[local619] = -1;
				} else {
					this.aByteArray58[local619] = (byte) (local46.method5750() - 1);
				}
			}
		}
		this.anInt5242 = -1;
		local10.anInt7214 = local300;
		local15.anInt7214 = local251;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(844) short local844 = 0;
		@Pc(846) short local846 = 0;
		@Pc(854) int local854;
		for (@Pc(848) int local848 = 0; local848 < this.anInt5254; local848++) {
			local854 = local15.method5750();
			if (local854 == 1) {
				local840 = (short) (local10.method5752() + local846);
				local842 = (short) (local10.method5752() + local840);
				local844 = (short) (local842 + local10.method5752());
				local846 = local844;
				this.aShortArray89[local848] = local840;
				this.aShortArray93[local848] = local842;
				this.aShortArray84[local848] = local844;
				if (this.anInt5242 < local840) {
					this.anInt5242 = local840;
				}
				if (local842 > this.anInt5242) {
					this.anInt5242 = local842;
				}
				if (local844 > this.anInt5242) {
					this.anInt5242 = local844;
				}
			}
			if (local854 == 2) {
				local842 = local844;
				local844 = (short) (local846 + local10.method5752());
				this.aShortArray89[local848] = local840;
				local846 = local844;
				this.aShortArray93[local848] = local842;
				this.aShortArray84[local848] = local844;
				if (this.anInt5242 < local844) {
					this.anInt5242 = local844;
				}
			}
			if (local854 == 3) {
				local840 = local844;
				local844 = (short) (local10.method5752() + local846);
				this.aShortArray89[local848] = local840;
				local846 = local844;
				this.aShortArray93[local848] = local842;
				this.aShortArray84[local848] = local844;
				if (local844 > this.anInt5242) {
					this.anInt5242 = local844;
				}
			}
			if (local854 == 4) {
				@Pc(1007) short local1007 = local840;
				local840 = local842;
				local844 = (short) (local846 + local10.method5752());
				local842 = local1007;
				this.aShortArray89[local848] = local840;
				local846 = local844;
				this.aShortArray93[local848] = local1007;
				this.aShortArray84[local848] = local844;
				if (local844 > this.anInt5242) {
					this.anInt5242 = local844;
				}
			}
		}
		this.anInt5242++;
		local10.anInt7214 = local353;
		local15.anInt7214 = local361;
		local20.anInt7214 = local387;
		local25.anInt7214 = local395;
		local36.anInt7214 = local401;
		local41.anInt7214 = local407;
		@Pc(1088) int local1088;
		for (local854 = 0; local854 < this.anInt5245; local854++) {
			local1088 = this.aByteArray62[local854] & 0xFF;
			if (local1088 == 0) {
				this.aShortArray85[local854] = (short) local10.method5771();
				this.aShortArray92[local854] = (short) local10.method5771();
				this.aShortArray91[local854] = (short) local10.method5771();
			}
			if (local1088 == 1) {
				this.aShortArray85[local854] = (short) local15.method5771();
				this.aShortArray92[local854] = (short) local15.method5771();
				this.aShortArray91[local854] = (short) local15.method5771();
				if (this.anInt5251 < 15) {
					this.anIntArray402[local854] = local20.method5771();
					if (this.anInt5251 >= 14) {
						this.anIntArray404[local854] = local20.method5797();
					} else {
						this.anIntArray404[local854] = local20.method5771();
					}
					this.anIntArray412[local854] = local20.method5771();
				} else {
					this.anIntArray402[local854] = local20.method5797();
					this.anIntArray404[local854] = local20.method5797();
					this.anIntArray412[local854] = local20.method5797();
				}
				this.aByteArray59[local854] = local25.method5751();
				this.aByteArray63[local854] = local36.method5751();
				this.anIntArray406[local854] = local41.method5751();
			}
			if (local1088 == 2) {
				this.aShortArray85[local854] = (short) local15.method5771();
				this.aShortArray92[local854] = (short) local15.method5771();
				this.aShortArray91[local854] = (short) local15.method5771();
				if (this.anInt5251 >= 15) {
					this.anIntArray402[local854] = local20.method5797();
					this.anIntArray404[local854] = local20.method5797();
					this.anIntArray412[local854] = local20.method5797();
				} else {
					this.anIntArray402[local854] = local20.method5771();
					if (this.anInt5251 >= 14) {
						this.anIntArray404[local854] = local20.method5797();
					} else {
						this.anIntArray404[local854] = local20.method5771();
					}
					this.anIntArray412[local854] = local20.method5771();
				}
				this.aByteArray59[local854] = local25.method5751();
				this.aByteArray63[local854] = local36.method5751();
				this.anIntArray406[local854] = local41.method5751();
				this.anIntArray403[local854] = local41.method5751();
				this.anIntArray411[local854] = local41.method5751();
			}
			if (local1088 == 3) {
				this.aShortArray85[local854] = (short) local15.method5771();
				this.aShortArray92[local854] = (short) local15.method5771();
				this.aShortArray91[local854] = (short) local15.method5771();
				if (this.anInt5251 >= 15) {
					this.anIntArray402[local854] = local20.method5797();
					this.anIntArray404[local854] = local20.method5797();
					this.anIntArray412[local854] = local20.method5797();
				} else {
					this.anIntArray402[local854] = local20.method5771();
					if (this.anInt5251 < 14) {
						this.anIntArray404[local854] = local20.method5771();
					} else {
						this.anIntArray404[local854] = local20.method5797();
					}
					this.anIntArray412[local854] = local20.method5771();
				}
				this.aByteArray59[local854] = local25.method5751();
				this.aByteArray63[local854] = local36.method5751();
				this.anIntArray406[local854] = local41.method5751();
			}
		}
		local10.anInt7214 = local191;
		@Pc(1494) int local1494;
		@Pc(1500) int local1500;
		@Pc(1504) int local1504;
		@Pc(1564) int local1564;
		if (local93) {
			local1088 = local10.method5750();
			if (local1088 > 0) {
				this.aClass206Array3 = new Class206[local1088];
				for (local1494 = 0; local1494 < local1088; local1494++) {
					local1500 = local10.method5771();
					local1504 = local10.method5771();
					@Pc(1512) byte local1512;
					if (local136 == 255) {
						local1512 = this.aByteArray60[local1504];
					} else {
						local1512 = (byte) local136;
					}
					this.aClass206Array3[local1494] = new Class206(local1500, this.aShortArray89[local1504], this.aShortArray93[local1504], this.aShortArray84[local1504], local1512);
				}
			}
			local1494 = local10.method5750();
			if (local1494 > 0) {
				this.aClass158Array3 = new Class158[local1494];
				for (local1500 = 0; local1500 < local1494; local1500++) {
					local1504 = local10.method5771();
					local1564 = local10.method5771();
					this.aClass158Array3[local1500] = new Class158(local1504, local1564);
				}
			}
		}
		if (!local102) {
			return;
		}
		local1088 = local10.method5750();
		if (local1088 <= 0) {
			return;
		}
		this.aClass264Array1 = new Class264[local1088];
		for (local1494 = 0; local1494 < local1088; local1494++) {
			local1500 = local10.method5771();
			local1504 = local10.method5771();
			local1564 = local10.method5750();
			@Pc(1616) byte local1616 = local10.method5751();
			this.aClass264Array1[local1494] = new Class264(local1500, local1504, local1564, local1616);
		}
		return;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(SSISBSBSBS)B")
	public byte method4264() {
		if (this.anInt5245 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray62[this.anInt5245] = 3;
		this.aShortArray85[this.anInt5245] = 0;
		this.aShortArray92[this.anInt5245] = 32767;
		this.aShortArray91[this.anInt5245] = 0;
		this.anIntArray402[this.anInt5245] = 1024;
		this.anIntArray404[this.anInt5245] = 1024;
		this.anIntArray412[this.anInt5245] = 1024;
		this.aByteArray59[this.anInt5245] = 0;
		this.aByteArray63[this.anInt5245] = 0;
		this.anIntArray406[this.anInt5245] = 0;
		return (byte) this.anInt5245++;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(IZ)[[I")
	public int[][] method4265(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt5244 : this.anInt5242;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray408[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(42) int local42 = local8[local27]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local10 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local10; local56++) {
			local54[local56] = new int[local8[local56]];
			local8[local56] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < local18; local80++) {
			@Pc(87) int local87 = this.anIntArray408[local80];
			if (local87 >= 0) {
				local54[local87][local8[local87]++] = local80;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(I)[[I")
	public int[][] method4266() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass264Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass264Array1[local12].anInt7104;
			if (local20 >= 0) {
				@Pc(29) int local29 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local56[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.aClass264Array1.length; local81++) {
			@Pc(89) int local89 = this.aClass264Array1[local81].anInt7104;
			if (local89 >= 0) {
				local56[local89][local8[local89]++] = local81;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIII)I")
	public int method4267(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(16) int local16 = 0; local16 < this.anInt5244; local16++) {
			if (this.anIntArray407[local16] == arg0 && arg1 == this.anIntArray409[local16] && arg2 == this.anIntArray405[local16]) {
				return local16;
			}
		}
		this.anIntArray407[this.anInt5244] = arg0;
		this.anIntArray409[this.anInt5244] = arg1;
		this.anIntArray405[this.anInt5244] = arg2;
		this.anInt5242 = this.anInt5244 + 1;
		return this.anInt5244++;
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(IIII)V")
	public void method4268(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5244; local7++) {
			this.anIntArray407[local7] += arg2;
			this.anIntArray409[local7] += arg0;
			this.anIntArray405[local7] += arg1;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(SIILclient!lm;)I")
	private int method4270(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class210 arg2) {
		@Pc(10) int local10 = arg2.anIntArray407[arg1];
		@Pc(23) int local23 = arg2.anIntArray409[arg1];
		@Pc(28) int local28 = arg2.anIntArray405[arg1];
		for (@Pc(30) int local30 = 0; local30 < this.anInt5244; local30++) {
			if (local10 == this.anIntArray407[local30] && this.anIntArray409[local30] == local23 && this.anIntArray405[local30] == local28) {
				this.aShortArray86[local30] |= arg0;
				return local30;
			}
		}
		this.anIntArray407[this.anInt5244] = local10;
		this.anIntArray409[this.anInt5244] = local23;
		this.anIntArray405[this.anInt5244] = local28;
		this.aShortArray86[this.anInt5244] = arg0;
		this.anIntArray408[this.anInt5244] = arg2.anIntArray408 == null ? -1 : arg2.anIntArray408[arg1];
		return this.anInt5244++;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I[B)V")
	private void method4271(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub35 local14 = new Class1_Sub35(arg0);
		@Pc(19) Class1_Sub35 local19 = new Class1_Sub35(arg0);
		@Pc(24) Class1_Sub35 local24 = new Class1_Sub35(arg0);
		@Pc(29) Class1_Sub35 local29 = new Class1_Sub35(arg0);
		@Pc(34) Class1_Sub35 local34 = new Class1_Sub35(arg0);
		local14.anInt7214 = arg0.length - 18;
		this.anInt5244 = local14.method5771();
		this.anInt5254 = local14.method5771();
		this.anInt5245 = local14.method5750();
		@Pc(59) int local59 = local14.method5750();
		@Pc(63) int local63 = local14.method5750();
		@Pc(67) int local67 = local14.method5750();
		@Pc(71) int local71 = local14.method5750();
		@Pc(75) int local75 = local14.method5750();
		@Pc(79) int local79 = local14.method5771();
		@Pc(83) int local83 = local14.method5771();
		@Pc(87) int local87 = local14.method5771();
		@Pc(91) int local91 = local14.method5771();
		@Pc(100) int local100 = this.anInt5244;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5254;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt5254;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt5254;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt5254;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt5244;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt5254;
		}
		@Pc(161) int local161 = local100;
		local100 += local91;
		@Pc(167) int local167 = local100;
		local100 += this.anInt5254 * 2;
		@Pc(176) int local176 = local100;
		local100 += this.anInt5245 * 6;
		@Pc(185) int local185 = local100;
		local100 += local79;
		@Pc(191) int local191 = local100;
		local100 += local83;
		this.aShortArray84 = new short[this.anInt5254];
		if (local63 == 255) {
			this.aByteArray60 = new byte[this.anInt5254];
		} else {
			this.aByte81 = (byte) local63;
		}
		this.aShortArray87 = new short[this.anInt5254];
		this.aShortArray89 = new short[this.anInt5254];
		if (this.anInt5245 > 0) {
			this.aShortArray91 = new short[this.anInt5245];
			this.aShortArray92 = new short[this.anInt5245];
			this.aByteArray62 = new byte[this.anInt5245];
			this.aShortArray85 = new short[this.anInt5245];
		}
		if (local71 == 1) {
			this.anIntArray410 = new int[this.anInt5254];
		}
		this.anIntArray405 = new int[this.anInt5244];
		if (local67 == 1) {
			this.aByteArray61 = new byte[this.anInt5254];
		}
		local14.anInt7214 = 0;
		if (local59 == 1) {
			this.aByteArray58 = new byte[this.anInt5254];
			this.aByteArray57 = new byte[this.anInt5254];
			this.aShortArray88 = new short[this.anInt5254];
		}
		this.aShortArray93 = new short[this.anInt5254];
		this.anIntArray407 = new int[this.anInt5244];
		this.anIntArray409 = new int[this.anInt5244];
		if (local75 == 1) {
			this.anIntArray408 = new int[this.anInt5244];
		}
		local19.anInt7214 = local185;
		local24.anInt7214 = local191;
		local29.anInt7214 = local100;
		local34.anInt7214 = local141;
		@Pc(339) int local339 = 0;
		@Pc(341) int local341 = 0;
		@Pc(343) int local343 = 0;
		@Pc(351) int local351;
		@Pc(353) int local353;
		for (@Pc(345) int local345 = 0; local345 < this.anInt5244; local345++) {
			local351 = local14.method5750();
			local353 = 0;
			if ((local351 & 0x1) != 0) {
				local353 = local19.method5752();
			}
			@Pc(368) int local368 = 0;
			if ((local351 & 0x2) != 0) {
				local368 = local24.method5752();
			}
			@Pc(378) int local378 = 0;
			if ((local351 & 0x4) != 0) {
				local378 = local29.method5752();
			}
			this.anIntArray407[local345] = local353 + local339;
			this.anIntArray409[local345] = local368 + local341;
			this.anIntArray405[local345] = local378 + local343;
			local339 = this.anIntArray407[local345];
			local343 = this.anIntArray405[local345];
			local341 = this.anIntArray409[local345];
			if (local75 == 1) {
				this.anIntArray408[local345] = local34.method5750();
			}
		}
		local14.anInt7214 = local167;
		local19.anInt7214 = local131;
		local24.anInt7214 = local109;
		local29.anInt7214 = local151;
		local34.anInt7214 = local121;
		for (local351 = 0; local351 < this.anInt5254; local351++) {
			this.aShortArray87[local351] = (short) local14.method5771();
			if (local59 == 1) {
				local353 = local19.method5750();
				if ((local353 & 0x1) == 1) {
					local7 = true;
					this.aByteArray57[local351] = 1;
				} else {
					this.aByteArray57[local351] = 0;
				}
				if ((local353 & 0x2) == 2) {
					this.aByteArray58[local351] = (byte) (local353 >> 2);
					this.aShortArray88[local351] = this.aShortArray87[local351];
					this.aShortArray87[local351] = 127;
					if (this.aShortArray88[local351] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray58[local351] = -1;
					this.aShortArray88[local351] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray60[local351] = local24.method5751();
			}
			if (local67 == 1) {
				this.aByteArray61[local351] = local29.method5751();
			}
			if (local71 == 1) {
				this.anIntArray410[local351] = local34.method5750();
			}
		}
		this.anInt5242 = -1;
		local14.anInt7214 = local161;
		local19.anInt7214 = local102;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(620) int local620;
		for (@Pc(614) int local614 = 0; local614 < this.anInt5254; local614++) {
			local620 = local19.method5750();
			if (local620 == 1) {
				local606 = (short) (local14.method5752() + local612);
				local608 = (short) (local606 + local14.method5752());
				local610 = (short) (local14.method5752() + local608);
				this.aShortArray89[local614] = local606;
				local612 = local610;
				this.aShortArray93[local614] = local608;
				this.aShortArray84[local614] = local610;
				if (this.anInt5242 < local606) {
					this.anInt5242 = local606;
				}
				if (local608 > this.anInt5242) {
					this.anInt5242 = local608;
				}
				if (this.anInt5242 < local610) {
					this.anInt5242 = local610;
				}
			}
			if (local620 == 2) {
				local608 = local610;
				local610 = (short) (local612 + local14.method5752());
				local612 = local610;
				this.aShortArray89[local614] = local606;
				this.aShortArray93[local614] = local608;
				this.aShortArray84[local614] = local610;
				if (local610 > this.anInt5242) {
					this.anInt5242 = local610;
				}
			}
			if (local620 == 3) {
				local606 = local610;
				local610 = (short) (local612 + local14.method5752());
				local612 = local610;
				this.aShortArray89[local614] = local606;
				this.aShortArray93[local614] = local608;
				this.aShortArray84[local614] = local610;
				if (this.anInt5242 < local610) {
					this.anInt5242 = local610;
				}
			}
			if (local620 == 4) {
				@Pc(787) short local787 = local606;
				local606 = local608;
				local610 = (short) (local14.method5752() + local612);
				local608 = local787;
				local612 = local610;
				this.aShortArray89[local614] = local606;
				this.aShortArray93[local614] = local787;
				this.aShortArray84[local614] = local610;
				if (this.anInt5242 < local610) {
					this.anInt5242 = local610;
				}
			}
		}
		this.anInt5242++;
		local14.anInt7214 = local176;
		for (local620 = 0; local620 < this.anInt5245; local620++) {
			this.aByteArray62[local620] = 0;
			this.aShortArray85[local620] = (short) local14.method5771();
			this.aShortArray92[local620] = (short) local14.method5771();
			this.aShortArray91[local620] = (short) local14.method5771();
		}
		if (this.aByteArray58 != null) {
			@Pc(891) boolean local891 = false;
			for (@Pc(893) int local893 = 0; local893 < this.anInt5254; local893++) {
				@Pc(902) int local902 = this.aByteArray58[local893] & 0xFF;
				if (local902 != 255) {
					if (this.aShortArray89[local893] == (this.aShortArray85[local902] & 0xFFFF) && this.aShortArray93[local893] == (this.aShortArray92[local902] & 0xFFFF) && this.aShortArray84[local893] == (this.aShortArray91[local902] & 0xFFFF)) {
						this.aByteArray58[local893] = -1;
					} else {
						local891 = true;
					}
				}
			}
			if (!local891) {
				this.aByteArray58 = null;
			}
		}
		if (!local9) {
			this.aShortArray88 = null;
		}
		if (!local7) {
			this.aByteArray57 = null;
		}
	}
}
