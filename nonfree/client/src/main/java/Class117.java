import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!io")
public final class Class117 {

	@OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!io", name = "c", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!io", name = "h", descriptor = "[I")
	public int[] anIntArray277;

	@OriginalMember(owner = "client!io", name = "i", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!io", name = "l", descriptor = "[I")
	public int[] anIntArray278;

	@OriginalMember(owner = "client!io", name = "n", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!io", name = "o", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!io", name = "s", descriptor = "[Lclient!dh;")
	public Class52[] aClass52Array2;

	@OriginalMember(owner = "client!io", name = "t", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!io", name = "u", descriptor = "[I")
	public int[] anIntArray280;

	@OriginalMember(owner = "client!io", name = "v", descriptor = "[Lclient!pm;")
	public Class194[] aClass194Array1;

	@OriginalMember(owner = "client!io", name = "x", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!io", name = "z", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!io", name = "C", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!io", name = "E", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!io", name = "F", descriptor = "[I")
	public int[] anIntArray281;

	@OriginalMember(owner = "client!io", name = "J", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!io", name = "K", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!io", name = "L", descriptor = "[I")
	public int[] anIntArray282;

	@OriginalMember(owner = "client!io", name = "M", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!io", name = "N", descriptor = "[I")
	public int[] anIntArray283;

	@OriginalMember(owner = "client!io", name = "P", descriptor = "[I")
	public int[] anIntArray284;

	@OriginalMember(owner = "client!io", name = "Q", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!io", name = "T", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!io", name = "W", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!io", name = "X", descriptor = "[I")
	public int[] anIntArray285;

	@OriginalMember(owner = "client!io", name = "Y", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!io", name = "Z", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!io", name = "ab", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!io", name = "bb", descriptor = "[Lclient!ng;")
	public Class167[] aClass167Array2;

	@OriginalMember(owner = "client!io", name = "r", descriptor = "I")
	public int anInt3204 = 12;

	@OriginalMember(owner = "client!io", name = "G", descriptor = "I")
	public int anInt3210 = 0;

	@OriginalMember(owner = "client!io", name = "p", descriptor = "I")
	public int anInt3202 = 0;

	@OriginalMember(owner = "client!io", name = "R", descriptor = "I")
	public int anInt3213 = 0;

	@OriginalMember(owner = "client!io", name = "U", descriptor = "I")
	public int anInt3214 = 0;

	@OriginalMember(owner = "client!io", name = "S", descriptor = "B")
	public byte aByte29 = 0;

	static {
		new Class55("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "([B)V")
	public Class117(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2599(arg0);
		} else {
			this.method2601(arg0);
		}
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "(III)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray275 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray52 = new byte[arg2];
			this.aShortArray62 = new short[arg2];
			this.aByteArray50 = new byte[arg2];
			this.aByteArray48 = new byte[arg2];
			this.aShortArray60 = new short[arg2];
			this.anIntArray285 = new int[arg2];
			this.anIntArray280 = new int[arg2];
			this.anIntArray281 = new int[arg2];
			this.aShortArray61 = new short[arg2];
			this.anIntArray279 = new int[arg2];
			this.anIntArray276 = new int[arg2];
			this.anIntArray278 = new int[arg2];
		}
		this.aShortArray58 = new short[arg1];
		this.anIntArray282 = new int[arg0];
		this.aShortArray59 = new short[arg1];
		this.aShortArray57 = new short[arg1];
		this.anIntArray277 = new int[arg1];
		this.aShortArray55 = new short[arg1];
		this.aByteArray51 = new byte[arg1];
		this.anIntArray283 = new int[arg0];
		this.aByteArray53 = new byte[arg1];
		this.aShortArray53 = new short[arg1];
		this.aByteArray49 = new byte[arg1];
		this.aByteArray47 = new byte[arg1];
		this.anIntArray284 = new int[arg0];
	}

	@OriginalMember(owner = "client!io", name = "<init>", descriptor = "([Lclient!io;I)V")
	public Class117(@OriginalArg(0) Class117[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3214 = 0;
		this.anInt3202 = 0;
		this.anInt3213 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte29 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class117 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3214 += local59.anInt3214;
				this.anInt3213 += local59.anInt3213;
				this.anInt3202 += local59.anInt3202;
				if (local59.aClass52Array2 != null) {
					local34 += local59.aClass52Array2.length;
				}
				if (local59.aClass194Array1 != null) {
					local36 += local59.aClass194Array1.length;
				}
				if (local59.aClass167Array2 != null) {
					local32 += local59.aClass167Array2.length;
				}
				local38 |= local59.aByteArray51 != null;
				if (local59.aByteArray53 == null) {
					if (this.aByte29 == -1) {
						this.aByte29 = local59.aByte29;
					}
					if (this.aByte29 != local59.aByte29) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local48 |= local59.anIntArray277 != null;
				local44 |= local59.aByteArray47 != null;
				local42 |= local59.aByteArray49 != null;
				local46 |= local59.aShortArray58 != null;
			}
		}
		this.anIntArray282 = new int[this.anInt3213];
		if (local40) {
			this.aByteArray53 = new byte[this.anInt3202];
		}
		if (local32 > 0) {
			this.aClass167Array2 = new Class167[local32];
		}
		this.aShortArray54 = new short[this.anInt3213];
		this.aShortArray56 = new short[this.anInt3202];
		if (local48) {
			this.anIntArray277 = new int[this.anInt3202];
		}
		this.anIntArray283 = new int[this.anInt3213];
		if (local44) {
			this.aByteArray47 = new byte[this.anInt3202];
		}
		this.aShortArray55 = new short[this.anInt3202];
		if (local34 > 0) {
			this.aClass52Array2 = new Class52[local34];
		}
		if (this.anInt3214 > 0) {
			this.aByteArray50 = new byte[this.anInt3214];
			this.aShortArray60 = new short[this.anInt3214];
			this.anIntArray276 = new int[this.anInt3214];
			this.aByteArray48 = new byte[this.anInt3214];
			this.anIntArray278 = new int[this.anInt3214];
			this.anIntArray281 = new int[this.anInt3214];
			this.anIntArray279 = new int[this.anInt3214];
			this.aShortArray61 = new short[this.anInt3214];
			this.aByteArray52 = new byte[this.anInt3214];
			this.anIntArray280 = new int[this.anInt3214];
			this.anIntArray285 = new int[this.anInt3214];
			this.aShortArray62 = new short[this.anInt3214];
		}
		this.aShortArray57 = new short[this.anInt3202];
		this.anIntArray284 = new int[this.anInt3213];
		this.aShortArray59 = new short[this.anInt3202];
		this.aShortArray53 = new short[this.anInt3202];
		if (local42) {
			this.aByteArray49 = new byte[this.anInt3202];
		}
		if (local36 > 0) {
			this.aClass194Array1 = new Class194[local36];
		}
		this.anIntArray275 = new int[this.anInt3213];
		if (local46) {
			this.aShortArray58 = new short[this.anInt3202];
		}
		if (local38) {
			this.aByteArray51 = new byte[this.anInt3202];
		}
		local34 = 0;
		this.anInt3202 = 0;
		local32 = 0;
		this.anInt3214 = 0;
		this.anInt3213 = 0;
		local36 = 0;
		@Pc(613) int local613;
		@Pc(624) int local624;
		for (@Pc(381) int local381 = 0; local381 < arg1; local381++) {
			@Pc(388) short local388 = (short) (0x1 << local381);
			@Pc(392) Class117 local392 = arg0[local381];
			if (local392 != null) {
				@Pc(399) int local399;
				if (local392.aClass194Array1 != null) {
					for (local399 = 0; local399 < local392.aClass194Array1.length; local399++) {
						@Pc(406) Class194 local406 = local392.aClass194Array1[local399];
						this.aClass194Array1[local36++] = local406.method4076(this.anInt3202 + local406.anInt5148);
					}
				}
				for (local399 = 0; local399 < local392.anInt3202; local399++) {
					if (local38 && local392.aByteArray51 != null) {
						this.aByteArray51[this.anInt3202] = local392.aByteArray51[local399];
					}
					if (local40) {
						if (local392.aByteArray53 == null) {
							this.aByteArray53[this.anInt3202] = local392.aByte29;
						} else {
							this.aByteArray53[this.anInt3202] = local392.aByteArray53[local399];
						}
					}
					if (local42 && local392.aByteArray49 != null) {
						this.aByteArray49[this.anInt3202] = local392.aByteArray49[local399];
					}
					if (local46) {
						if (local392.aShortArray58 == null) {
							this.aShortArray58[this.anInt3202] = -1;
						} else {
							this.aShortArray58[this.anInt3202] = local392.aShortArray58[local399];
						}
					}
					if (local48) {
						if (local392.anIntArray277 == null) {
							this.anIntArray277[this.anInt3202] = -1;
						} else {
							this.anIntArray277[this.anInt3202] = local392.anIntArray277[local399];
						}
					}
					this.aShortArray55[this.anInt3202] = (short) this.method2589(local392, local388, local392.aShortArray55[local399]);
					this.aShortArray53[this.anInt3202] = (short) this.method2589(local392, local388, local392.aShortArray53[local399]);
					this.aShortArray57[this.anInt3202] = (short) this.method2589(local392, local388, local392.aShortArray57[local399]);
					this.aShortArray56[this.anInt3202] = local388;
					this.aShortArray59[this.anInt3202] = local392.aShortArray59[local399];
					this.anInt3202++;
				}
				@Pc(600) int local600;
				if (local392.aClass167Array2 != null) {
					for (local600 = 0; local600 < local392.aClass167Array2.length; local600++) {
						local613 = this.method2589(local392, local388, local392.aClass167Array2[local600].anInt4523);
						local624 = this.method2589(local392, local388, local392.aClass167Array2[local600].anInt4520);
						@Pc(635) int local635 = this.method2589(local392, local388, local392.aClass167Array2[local600].anInt4521);
						this.aClass167Array2[local32] = local392.aClass167Array2[local600].method3587(local613, local635, local624);
						local32++;
					}
				}
				if (local392.aClass52Array2 != null) {
					for (local600 = 0; local600 < local392.aClass52Array2.length; local600++) {
						local613 = this.method2589(local392, local388, local392.aClass52Array2[local600].anInt1309);
						this.aClass52Array2[local34] = local392.aClass52Array2[local600].method1138(local613);
						local34++;
					}
				}
			}
		}
		this.anInt3210 = this.anInt3213;
		@Pc(701) int local701 = 0;
		for (@Pc(703) int local703 = 0; local703 < arg1; local703++) {
			@Pc(710) short local710 = (short) (0x1 << local703);
			@Pc(714) Class117 local714 = arg0[local703];
			if (local714 != null) {
				for (local613 = 0; local613 < local714.anInt3202; local613++) {
					if (local44) {
						this.aByteArray47[local701++] = (byte) (local714.aByteArray47 == null || local714.aByteArray47[local613] == -1 ? -1 : local714.aByteArray47[local613] + this.anInt3214);
					}
				}
				for (local624 = 0; local624 < local714.anInt3214; local624++) {
					@Pc(770) byte local770 = this.aByteArray52[this.anInt3214] = local714.aByteArray52[local624];
					if (local770 == 0) {
						this.aShortArray62[this.anInt3214] = (short) this.method2589(local714, local710, local714.aShortArray62[local624]);
						this.aShortArray61[this.anInt3214] = (short) this.method2589(local714, local710, local714.aShortArray61[local624]);
						this.aShortArray60[this.anInt3214] = (short) this.method2589(local714, local710, local714.aShortArray60[local624]);
					}
					if (local770 >= 1 && local770 <= 3) {
						this.aShortArray62[this.anInt3214] = local714.aShortArray62[local624];
						this.aShortArray61[this.anInt3214] = local714.aShortArray61[local624];
						this.aShortArray60[this.anInt3214] = local714.aShortArray60[local624];
						this.anIntArray276[this.anInt3214] = local714.anIntArray276[local624];
						this.anIntArray281[this.anInt3214] = local714.anIntArray281[local624];
						this.anIntArray279[this.anInt3214] = local714.anIntArray279[local624];
						this.aByteArray48[this.anInt3214] = local714.aByteArray48[local624];
						this.aByteArray50[this.anInt3214] = local714.aByteArray50[local624];
						this.anIntArray280[this.anInt3214] = local714.anIntArray280[local624];
					}
					if (local770 == 2) {
						this.anIntArray285[this.anInt3214] = local714.anIntArray285[local624];
						this.anIntArray278[this.anInt3214] = local714.anIntArray278[local624];
					}
					this.anInt3214++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(II)V")
	public void method2587() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3213; local7++) {
			this.anIntArray275[local7] <<= 0x0;
			this.anIntArray284[local7] <<= 0x0;
			this.anIntArray283[local7] <<= 0x0;
		}
		if (this.anInt3214 <= 0 || this.anIntArray276 == null) {
			return;
		}
		for (@Pc(55) int local55 = 0; local55 < this.anIntArray276.length; local55++) {
			this.anIntArray276[local55] <<= 0x0;
			this.anIntArray281[local55] <<= 0x0;
			if (this.aByteArray52[local55] != 1) {
				this.anIntArray279[local55] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIII)I")
	public int method2588(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt3213; local15++) {
			if (arg2 == this.anIntArray275[local15] && arg0 == this.anIntArray284[local15] && this.anIntArray283[local15] == arg1) {
				return local15;
			}
		}
		this.anIntArray275[this.anInt3213] = arg2;
		this.anIntArray284[this.anInt3213] = arg0;
		this.anIntArray283[this.anInt3213] = arg1;
		this.anInt3210 = this.anInt3213 + 1;
		return this.anInt3213++;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!io;SII)I")
	private int method2589(@OriginalArg(0) Class117 arg0, @OriginalArg(1) short arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg0.anIntArray275[arg2];
		@Pc(15) int local15 = arg0.anIntArray284[arg2];
		@Pc(20) int local20 = arg0.anIntArray283[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt3213; local22++) {
			if (this.anIntArray275[local22] == local10 && this.anIntArray284[local22] == local15 && this.anIntArray283[local22] == local20) {
				this.aShortArray54[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray275[this.anInt3213] = local10;
		this.anIntArray284[this.anInt3213] = local15;
		this.anIntArray283[this.anInt3213] = local20;
		this.aShortArray54[this.anInt3213] = arg1;
		this.anIntArray282[this.anInt3213] = arg0.anIntArray282 == null ? -1 : arg0.anIntArray282[arg2];
		return this.anInt3213++;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(ISBSIBBII)I")
	public int method2590(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int arg7) {
		this.aShortArray55[this.anInt3202] = (short) arg4;
		this.aShortArray53[this.anInt3202] = (short) arg7;
		this.aShortArray57[this.anInt3202] = (short) arg0;
		this.aByteArray51[this.anInt3202] = arg2;
		this.aByteArray47[this.anInt3202] = arg6;
		this.aShortArray59[this.anInt3202] = arg3;
		this.aByteArray49[this.anInt3202] = arg5;
		this.aShortArray58[this.anInt3202] = arg1;
		return this.anInt3202++;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)[[I")
	public int[][] method2591() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass194Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass194Array1[local12].anInt5147;
			if (local20 >= 0) {
				if (local20 > local10) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local56[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.aClass194Array1.length; local77++) {
			@Pc(85) int local85 = this.aClass194Array1[local77].anInt5147;
			if (local85 >= 0) {
				local56[local85][local8[local85]++] = local77;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(SIS)V")
	public void method2593(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray58 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3202; local17++) {
			if (this.aShortArray58[local17] == arg1) {
				this.aShortArray58[local17] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIB)V")
	public void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3213; local1++) {
			this.anIntArray275[local1] += arg2;
			this.anIntArray284[local1] += arg0;
			this.anIntArray283[local1] += arg1;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(SBBSSBSSSZ)B")
	public byte method2595() {
		if (this.anInt3214 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray52[this.anInt3214] = 3;
		this.aShortArray62[this.anInt3214] = 0;
		this.aShortArray61[this.anInt3214] = 32767;
		this.aShortArray60[this.anInt3214] = 0;
		this.anIntArray276[this.anInt3214] = 1024;
		this.anIntArray281[this.anInt3214] = 1024;
		this.anIntArray279[this.anInt3214] = 1024;
		this.aByteArray48[this.anInt3214] = 0;
		this.aByteArray50[this.anInt3214] = 0;
		this.anIntArray280[this.anInt3214] = 0;
		return (byte) this.anInt3214++;
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(IIII)V")
	public void method2598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(42) int local42;
		if (arg1 != 0) {
			local18 = Class22_Sub7.anIntArray411[arg1];
			local22 = Class22_Sub7.anIntArray410[arg1];
			for (local24 = 0; local24 < this.anInt3213; local24++) {
				local42 = this.anIntArray275[local24] * local22 + this.anIntArray284[local24] * local18 >> 15;
				this.anIntArray284[local24] = local22 * this.anIntArray284[local24] - this.anIntArray275[local24] * local18 >> 15;
				this.anIntArray275[local24] = local42;
			}
		}
		if (arg2 != 0) {
			local18 = Class22_Sub7.anIntArray411[arg2];
			local22 = Class22_Sub7.anIntArray410[arg2];
			for (local24 = 0; local24 < this.anInt3213; local24++) {
				local42 = this.anIntArray284[local24] * local22 - local18 * this.anIntArray283[local24] >> 15;
				this.anIntArray283[local24] = this.anIntArray283[local24] * local22 + local18 * this.anIntArray284[local24] >> 15;
				this.anIntArray284[local24] = local42;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local18 = Class22_Sub7.anIntArray411[arg0];
		local22 = Class22_Sub7.anIntArray410[arg0];
		for (local24 = 0; local24 < this.anInt3213; local24++) {
			local42 = local18 * this.anIntArray283[local24] + local22 * this.anIntArray275[local24] >> 15;
			this.anIntArray283[local24] = this.anIntArray283[local24] * local22 - local18 * this.anIntArray275[local24] >> 15;
			this.anIntArray275[local24] = local42;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "([BI)V")
	private void method2599(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class7_Sub14 local10 = new Class7_Sub14(arg0);
		@Pc(15) Class7_Sub14 local15 = new Class7_Sub14(arg0);
		@Pc(20) Class7_Sub14 local20 = new Class7_Sub14(arg0);
		@Pc(25) Class7_Sub14 local25 = new Class7_Sub14(arg0);
		@Pc(30) Class7_Sub14 local30 = new Class7_Sub14(arg0);
		@Pc(35) Class7_Sub14 local35 = new Class7_Sub14(arg0);
		@Pc(40) Class7_Sub14 local40 = new Class7_Sub14(arg0);
		local10.anInt4989 = arg0.length - 23;
		this.anInt3213 = local10.method3943();
		this.anInt3202 = local10.method3943();
		this.anInt3214 = local10.method3981();
		@Pc(65) int local65 = local10.method3981();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(96) boolean local96 = (local65 & 0x4) == 4;
		@Pc(107) boolean local107 = (local65 & 0x8) == 8;
		if (local107) {
			local10.anInt4989 -= 7;
			this.anInt3204 = local10.method3981();
			local10.anInt4989 += 6;
		}
		@Pc(130) int local130 = local10.method3981();
		@Pc(134) int local134 = local10.method3981();
		@Pc(138) int local138 = local10.method3981();
		@Pc(142) int local142 = local10.method3981();
		@Pc(146) int local146 = local10.method3981();
		@Pc(150) int local150 = local10.method3943();
		@Pc(154) int local154 = local10.method3943();
		@Pc(158) int local158 = local10.method3943();
		@Pc(162) int local162 = local10.method3943();
		@Pc(166) int local166 = local10.method3943();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(185) int local185;
		if (this.anInt3214 > 0) {
			this.aByteArray52 = new byte[this.anInt3214];
			local10.anInt4989 = 0;
			for (local185 = 0; local185 < this.anInt3214; local185++) {
				@Pc(196) byte local196 = this.aByteArray52[local185] = local10.method3930();
				if (local196 == 2) {
					local172++;
				}
				if (local196 >= 1 && local196 <= 3) {
					local170++;
				}
				if (local196 == 0) {
					local168++;
				}
			}
		}
		local185 = this.anInt3214;
		@Pc(224) int local224 = local185;
		local185 += this.anInt3213;
		@Pc(231) int local231 = local185;
		if (local76) {
			local185 += this.anInt3202;
		}
		@Pc(240) int local240 = local185;
		local185 += this.anInt3202;
		@Pc(247) int local247 = local185;
		if (local130 == 255) {
			local185 += this.anInt3202;
		}
		@Pc(257) int local257 = local185;
		if (local138 == 1) {
			local185 += this.anInt3202;
		}
		@Pc(269) int local269 = local185;
		if (local146 == 1) {
			local185 += this.anInt3213;
		}
		@Pc(279) int local279 = local185;
		if (local134 == 1) {
			local185 += this.anInt3202;
		}
		@Pc(289) int local289 = local185;
		local185 += local162;
		@Pc(295) int local295 = local185;
		if (local142 == 1) {
			local185 += this.anInt3202 * 2;
		}
		@Pc(309) int local309 = local185;
		local185 += local166;
		@Pc(315) int local315 = local185;
		local185 += this.anInt3202 * 2;
		@Pc(324) int local324 = local185;
		local185 += local150;
		@Pc(335) int local335 = local185;
		local185 += local154;
		@Pc(341) int local341 = local185;
		local185 += local158;
		@Pc(347) int local347 = local185;
		local185 += local168 * 6;
		@Pc(355) int local355 = local185;
		local185 += local170 * 6;
		@Pc(369) int local369 = this.anInt3204 >= 14 ? 7 : 6;
		@Pc(371) int local371 = local185;
		local185 += local369 * local170;
		@Pc(379) int local379 = local185;
		local185 += local170;
		@Pc(385) int local385 = local185;
		local185 += local170;
		@Pc(391) int local391 = local185;
		local185 += local172 * 2 + local170;
		if (local138 == 1) {
			this.anIntArray277 = new int[this.anInt3202];
		}
		this.aShortArray55 = new short[this.anInt3202];
		local10.anInt4989 = local224;
		if (local134 == 1) {
			this.aByteArray49 = new byte[this.anInt3202];
		}
		this.anIntArray283 = new int[this.anInt3213];
		if (local130 == 255) {
			this.aByteArray53 = new byte[this.anInt3202];
		} else {
			this.aByte29 = (byte) local130;
		}
		if (local142 == 1) {
			this.aShortArray58 = new short[this.anInt3202];
		}
		if (local146 == 1) {
			this.anIntArray282 = new int[this.anInt3213];
		}
		this.anIntArray284 = new int[this.anInt3213];
		this.anIntArray275 = new int[this.anInt3213];
		if (local142 == 1 && this.anInt3214 > 0) {
			this.aByteArray47 = new byte[this.anInt3202];
		}
		if (local76) {
			this.aByteArray51 = new byte[this.anInt3202];
		}
		if (this.anInt3214 > 0) {
			if (local170 > 0) {
				this.anIntArray280 = new int[local170];
				this.aByteArray48 = new byte[local170];
				this.anIntArray276 = new int[local170];
				this.anIntArray281 = new int[local170];
				this.aByteArray50 = new byte[local170];
				this.anIntArray279 = new int[local170];
			}
			this.aShortArray62 = new short[this.anInt3214];
			if (local172 > 0) {
				this.anIntArray278 = new int[local172];
				this.anIntArray285 = new int[local172];
			}
			this.aShortArray60 = new short[this.anInt3214];
			this.aShortArray61 = new short[this.anInt3214];
		}
		this.aShortArray59 = new short[this.anInt3202];
		this.aShortArray57 = new short[this.anInt3202];
		this.aShortArray53 = new short[this.anInt3202];
		local15.anInt4989 = local324;
		local20.anInt4989 = local335;
		local25.anInt4989 = local341;
		local30.anInt4989 = local269;
		@Pc(587) int local587 = 0;
		@Pc(589) int local589 = 0;
		@Pc(591) int local591 = 0;
		@Pc(599) int local599;
		for (@Pc(593) int local593 = 0; local593 < this.anInt3213; local593++) {
			local599 = local10.method3981();
			@Pc(601) int local601 = 0;
			if ((local599 & 0x1) != 0) {
				local601 = local15.method3974();
			}
			@Pc(614) int local614 = 0;
			if ((local599 & 0x2) != 0) {
				local614 = local20.method3974();
			}
			@Pc(624) int local624 = 0;
			if ((local599 & 0x4) != 0) {
				local624 = local25.method3974();
			}
			this.anIntArray275[local593] = local587 + local601;
			this.anIntArray284[local593] = local589 + local614;
			this.anIntArray283[local593] = local591 + local624;
			local587 = this.anIntArray275[local593];
			local591 = this.anIntArray283[local593];
			local589 = this.anIntArray284[local593];
			if (local146 == 1) {
				this.anIntArray282[local593] = local30.method3981();
			}
		}
		local10.anInt4989 = local315;
		local15.anInt4989 = local231;
		local20.anInt4989 = local247;
		local25.anInt4989 = local279;
		local30.anInt4989 = local257;
		local35.anInt4989 = local295;
		local40.anInt4989 = local309;
		for (local599 = 0; local599 < this.anInt3202; local599++) {
			this.aShortArray59[local599] = (short) local10.method3943();
			if (local76) {
				this.aByteArray51[local599] = local15.method3930();
			}
			if (local130 == 255) {
				this.aByteArray53[local599] = local20.method3930();
			}
			if (local134 == 1) {
				this.aByteArray49[local599] = local25.method3930();
			}
			if (local138 == 1) {
				this.anIntArray277[local599] = local30.method3981();
			}
			if (local142 == 1) {
				this.aShortArray58[local599] = (short) (local35.method3943() - 1);
			}
			if (this.aByteArray47 != null) {
				if (this.aShortArray58[local599] == -1) {
					this.aByteArray47[local599] = -1;
				} else {
					this.aByteArray47[local599] = (byte) (local40.method3981() - 1);
				}
			}
		}
		this.anInt3210 = -1;
		local10.anInt4989 = local289;
		local15.anInt4989 = local240;
		@Pc(824) short local824 = 0;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(830) short local830 = 0;
		@Pc(838) int local838;
		for (@Pc(832) int local832 = 0; local832 < this.anInt3202; local832++) {
			local838 = local15.method3981();
			if (local838 == 1) {
				local824 = (short) (local830 + local10.method3974());
				local826 = (short) (local10.method3974() + local824);
				local828 = (short) (local10.method3974() + local826);
				this.aShortArray55[local832] = local824;
				local830 = local828;
				this.aShortArray53[local832] = local826;
				this.aShortArray57[local832] = local828;
				if (this.anInt3210 < local824) {
					this.anInt3210 = local824;
				}
				if (local826 > this.anInt3210) {
					this.anInt3210 = local826;
				}
				if (this.anInt3210 < local828) {
					this.anInt3210 = local828;
				}
			}
			if (local838 == 2) {
				local826 = local828;
				local828 = (short) (local830 + local10.method3974());
				local830 = local828;
				this.aShortArray55[local832] = local824;
				this.aShortArray53[local832] = local826;
				this.aShortArray57[local832] = local828;
				if (local828 > this.anInt3210) {
					this.anInt3210 = local828;
				}
			}
			if (local838 == 3) {
				local824 = local828;
				local828 = (short) (local830 + local10.method3974());
				local830 = local828;
				this.aShortArray55[local832] = local824;
				this.aShortArray53[local832] = local826;
				this.aShortArray57[local832] = local828;
				if (local828 > this.anInt3210) {
					this.anInt3210 = local828;
				}
			}
			if (local838 == 4) {
				@Pc(997) short local997 = local824;
				local824 = local826;
				local828 = (short) (local10.method3974() + local830);
				local826 = local997;
				this.aShortArray55[local832] = local824;
				local830 = local828;
				this.aShortArray53[local832] = local997;
				this.aShortArray57[local832] = local828;
				if (this.anInt3210 < local828) {
					this.anInt3210 = local828;
				}
			}
		}
		this.anInt3210++;
		local10.anInt4989 = local347;
		local15.anInt4989 = local355;
		local20.anInt4989 = local371;
		local25.anInt4989 = local379;
		local30.anInt4989 = local385;
		local35.anInt4989 = local391;
		@Pc(1076) int local1076;
		for (local838 = 0; local838 < this.anInt3214; local838++) {
			local1076 = this.aByteArray52[local838] & 0xFF;
			if (local1076 == 0) {
				this.aShortArray62[local838] = (short) local10.method3943();
				this.aShortArray61[local838] = (short) local10.method3943();
				this.aShortArray60[local838] = (short) local10.method3943();
			}
			if (local1076 == 1) {
				this.aShortArray62[local838] = (short) local15.method3943();
				this.aShortArray61[local838] = (short) local15.method3943();
				this.aShortArray60[local838] = (short) local15.method3943();
				this.anIntArray276[local838] = local20.method3943();
				if (this.anInt3204 >= 14) {
					this.anIntArray281[local838] = local20.method3975();
				} else {
					this.anIntArray281[local838] = local20.method3943();
				}
				this.anIntArray279[local838] = local20.method3943();
				this.aByteArray48[local838] = local25.method3930();
				this.aByteArray50[local838] = local30.method3930();
				this.anIntArray280[local838] = local35.method3930();
			}
			if (local1076 == 2) {
				this.aShortArray62[local838] = (short) local15.method3943();
				this.aShortArray61[local838] = (short) local15.method3943();
				this.aShortArray60[local838] = (short) local15.method3943();
				this.anIntArray276[local838] = local20.method3943();
				if (this.anInt3204 >= 14) {
					this.anIntArray281[local838] = local20.method3975();
				} else {
					this.anIntArray281[local838] = local20.method3943();
				}
				this.anIntArray279[local838] = local20.method3943();
				this.aByteArray48[local838] = local25.method3930();
				this.aByteArray50[local838] = local30.method3930();
				this.anIntArray280[local838] = local35.method3930();
				this.anIntArray285[local838] = local35.method3930();
				this.anIntArray278[local838] = local35.method3930();
			}
			if (local1076 == 3) {
				this.aShortArray62[local838] = (short) local15.method3943();
				this.aShortArray61[local838] = (short) local15.method3943();
				this.aShortArray60[local838] = (short) local15.method3943();
				this.anIntArray276[local838] = local20.method3943();
				if (this.anInt3204 < 14) {
					this.anIntArray281[local838] = local20.method3943();
				} else {
					this.anIntArray281[local838] = local20.method3975();
				}
				this.anIntArray279[local838] = local20.method3943();
				this.aByteArray48[local838] = local25.method3930();
				this.aByteArray50[local838] = local30.method3930();
				this.anIntArray280[local838] = local35.method3930();
			}
		}
		local10.anInt4989 = local185;
		@Pc(1396) int local1396;
		@Pc(1402) int local1402;
		@Pc(1406) int local1406;
		@Pc(1475) int local1475;
		if (local85) {
			local1076 = local10.method3981();
			if (local1076 > 0) {
				this.aClass167Array2 = new Class167[local1076];
				for (local1396 = 0; local1396 < local1076; local1396++) {
					local1402 = local10.method3943();
					local1406 = local10.method3943();
					@Pc(1416) byte local1416;
					if (local130 == 255) {
						local1416 = this.aByteArray53[local1406];
					} else {
						local1416 = (byte) local130;
					}
					this.aClass167Array2[local1396] = new Class167(local1402, this.aShortArray55[local1406], this.aShortArray53[local1406], this.aShortArray57[local1406], local1416);
				}
			}
			local1396 = local10.method3981();
			if (local1396 > 0) {
				this.aClass52Array2 = new Class52[local1396];
				for (local1402 = 0; local1402 < local1396; local1402++) {
					local1406 = local10.method3943();
					local1475 = local10.method3943();
					this.aClass52Array2[local1402] = new Class52(local1406, local1475);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1076 = local10.method3981();
		if (local1076 <= 0) {
			return;
		}
		this.aClass194Array1 = new Class194[local1076];
		for (local1396 = 0; local1396 < local1076; local1396++) {
			local1402 = local10.method3943();
			local1406 = local10.method3943();
			local1475 = local10.method3981();
			@Pc(1520) byte local1520 = local10.method3930();
			this.aClass194Array1[local1396] = new Class194(local1402, local1406, local1475, local1520);
		}
		return;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B)[[I")
	public int[][] method2600() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3202; local12++) {
			@Pc(19) int local19 = this.anIntArray277[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(30) int local30 = local8[local19]++;
			}
		}
		@Pc(53) int[][] local53 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local53[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(74) int local74 = 0; local74 < this.anInt3202; local74++) {
			@Pc(81) int local81 = this.anIntArray277[local74];
			if (local81 >= 0) {
				local53[local81][local8[local81]++] = local74;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(B[B)V")
	private void method2601(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class7_Sub14 local14 = new Class7_Sub14(arg0);
		@Pc(19) Class7_Sub14 local19 = new Class7_Sub14(arg0);
		@Pc(24) Class7_Sub14 local24 = new Class7_Sub14(arg0);
		@Pc(29) Class7_Sub14 local29 = new Class7_Sub14(arg0);
		@Pc(34) Class7_Sub14 local34 = new Class7_Sub14(arg0);
		local14.anInt4989 = arg0.length - 18;
		this.anInt3213 = local14.method3943();
		this.anInt3202 = local14.method3943();
		this.anInt3214 = local14.method3981();
		@Pc(61) int local61 = local14.method3981();
		@Pc(65) int local65 = local14.method3981();
		@Pc(69) int local69 = local14.method3981();
		@Pc(73) int local73 = local14.method3981();
		@Pc(77) int local77 = local14.method3981();
		@Pc(81) int local81 = local14.method3943();
		@Pc(85) int local85 = local14.method3943();
		@Pc(89) int local89 = local14.method3943();
		@Pc(93) int local93 = local14.method3943();
		@Pc(107) int local107 = this.anInt3213;
		@Pc(109) int local109 = local107;
		local107 += this.anInt3202;
		@Pc(116) int local116 = local107;
		if (local65 == 255) {
			local107 += this.anInt3202;
		}
		@Pc(126) int local126 = local107;
		if (local73 == 1) {
			local107 += this.anInt3202;
		}
		@Pc(136) int local136 = local107;
		if (local61 == 1) {
			local107 += this.anInt3202;
		}
		@Pc(146) int local146 = local107;
		if (local77 == 1) {
			local107 += this.anInt3213;
		}
		@Pc(156) int local156 = local107;
		if (local69 == 1) {
			local107 += this.anInt3202;
		}
		@Pc(168) int local168 = local107;
		local107 += local93;
		@Pc(174) int local174 = local107;
		local107 += this.anInt3202 * 2;
		@Pc(183) int local183 = local107;
		local107 += this.anInt3214 * 6;
		@Pc(192) int local192 = local107;
		local107 += local81;
		@Pc(198) int local198 = local107;
		local107 += local85;
		this.aShortArray59 = new short[this.anInt3202];
		if (local65 == 255) {
			this.aByteArray53 = new byte[this.anInt3202];
		} else {
			this.aByte29 = (byte) local65;
		}
		this.aShortArray53 = new short[this.anInt3202];
		if (local61 == 1) {
			this.aByteArray47 = new byte[this.anInt3202];
			this.aByteArray51 = new byte[this.anInt3202];
			this.aShortArray58 = new short[this.anInt3202];
		}
		if (local77 == 1) {
			this.anIntArray282 = new int[this.anInt3213];
		}
		this.aShortArray57 = new short[this.anInt3202];
		if (this.anInt3214 > 0) {
			this.aByteArray52 = new byte[this.anInt3214];
			this.aShortArray60 = new short[this.anInt3214];
			this.aShortArray62 = new short[this.anInt3214];
			this.aShortArray61 = new short[this.anInt3214];
		}
		this.anIntArray275 = new int[this.anInt3213];
		this.anIntArray283 = new int[this.anInt3213];
		local14.anInt4989 = 0;
		this.aShortArray55 = new short[this.anInt3202];
		if (local69 == 1) {
			this.aByteArray49 = new byte[this.anInt3202];
		}
		if (local73 == 1) {
			this.anIntArray277 = new int[this.anInt3202];
		}
		this.anIntArray284 = new int[this.anInt3213];
		local19.anInt4989 = local192;
		local24.anInt4989 = local198;
		local29.anInt4989 = local107;
		local34.anInt4989 = local146;
		@Pc(348) int local348 = 0;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(362) int local362;
		@Pc(364) int local364;
		for (@Pc(354) int local354 = 0; local354 < this.anInt3213; local354++) {
			local362 = local14.method3981();
			local364 = 0;
			if ((local362 & 0x1) != 0) {
				local364 = local19.method3974();
			}
			@Pc(374) int local374 = 0;
			if ((local362 & 0x2) != 0) {
				local374 = local24.method3974();
			}
			@Pc(387) int local387 = 0;
			if ((local362 & 0x4) != 0) {
				local387 = local29.method3974();
			}
			this.anIntArray275[local354] = local364 + local348;
			this.anIntArray284[local354] = local350 + local374;
			this.anIntArray283[local354] = local352 + local387;
			local348 = this.anIntArray275[local354];
			local350 = this.anIntArray284[local354];
			local352 = this.anIntArray283[local354];
			if (local77 == 1) {
				this.anIntArray282[local354] = local34.method3981();
			}
		}
		local14.anInt4989 = local174;
		local19.anInt4989 = local136;
		local24.anInt4989 = local116;
		local29.anInt4989 = local156;
		local34.anInt4989 = local126;
		for (local362 = 0; local362 < this.anInt3202; local362++) {
			this.aShortArray59[local362] = (short) local14.method3943();
			if (local61 == 1) {
				local364 = local19.method3981();
				if ((local364 & 0x1) == 1) {
					local7 = true;
					this.aByteArray51[local362] = 1;
				} else {
					this.aByteArray51[local362] = 0;
				}
				if ((local364 & 0x2) == 2) {
					this.aByteArray47[local362] = (byte) (local364 >> 2);
					this.aShortArray58[local362] = this.aShortArray59[local362];
					this.aShortArray59[local362] = 127;
					if (this.aShortArray58[local362] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray47[local362] = -1;
					this.aShortArray58[local362] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray53[local362] = local24.method3930();
			}
			if (local69 == 1) {
				this.aByteArray49[local362] = local29.method3930();
			}
			if (local73 == 1) {
				this.anIntArray277[local362] = local34.method3981();
			}
		}
		local14.anInt4989 = local168;
		this.anInt3210 = -1;
		local19.anInt4989 = local109;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(616) short local616 = 0;
		@Pc(618) short local618 = 0;
		@Pc(626) int local626;
		for (@Pc(620) int local620 = 0; local620 < this.anInt3202; local620++) {
			local626 = local19.method3981();
			if (local626 == 1) {
				local612 = (short) (local618 + local14.method3974());
				local614 = (short) (local14.method3974() + local612);
				local616 = (short) (local614 + local14.method3974());
				local618 = local616;
				this.aShortArray55[local620] = local612;
				this.aShortArray53[local620] = local614;
				this.aShortArray57[local620] = local616;
				if (local612 > this.anInt3210) {
					this.anInt3210 = local612;
				}
				if (this.anInt3210 < local614) {
					this.anInt3210 = local614;
				}
				if (this.anInt3210 < local616) {
					this.anInt3210 = local616;
				}
			}
			if (local626 == 2) {
				local614 = local616;
				local616 = (short) (local14.method3974() + local618);
				this.aShortArray55[local620] = local612;
				local618 = local616;
				this.aShortArray53[local620] = local614;
				this.aShortArray57[local620] = local616;
				if (this.anInt3210 < local616) {
					this.anInt3210 = local616;
				}
			}
			if (local626 == 3) {
				local612 = local616;
				local616 = (short) (local14.method3974() + local618);
				this.aShortArray55[local620] = local612;
				local618 = local616;
				this.aShortArray53[local620] = local614;
				this.aShortArray57[local620] = local616;
				if (this.anInt3210 < local616) {
					this.anInt3210 = local616;
				}
			}
			if (local626 == 4) {
				@Pc(785) short local785 = local612;
				local612 = local614;
				local614 = local785;
				local616 = (short) (local14.method3974() + local618);
				this.aShortArray55[local620] = local612;
				local618 = local616;
				this.aShortArray53[local620] = local785;
				this.aShortArray57[local620] = local616;
				if (this.anInt3210 < local616) {
					this.anInt3210 = local616;
				}
			}
		}
		local14.anInt4989 = local183;
		this.anInt3210++;
		for (local626 = 0; local626 < this.anInt3214; local626++) {
			this.aByteArray52[local626] = 0;
			this.aShortArray62[local626] = (short) local14.method3943();
			this.aShortArray61[local626] = (short) local14.method3943();
			this.aShortArray60[local626] = (short) local14.method3943();
		}
		if (this.aByteArray47 != null) {
			@Pc(885) boolean local885 = false;
			for (@Pc(887) int local887 = 0; local887 < this.anInt3202; local887++) {
				@Pc(896) int local896 = this.aByteArray47[local887] & 0xFF;
				if (local896 != 255) {
					if (this.aShortArray55[local887] == (this.aShortArray62[local896] & 0xFFFF) && this.aShortArray53[local887] == (this.aShortArray61[local896] & 0xFFFF) && this.aShortArray57[local887] == (this.aShortArray60[local896] & 0xFFFF)) {
						this.aByteArray47[local887] = -1;
					} else {
						local885 = true;
					}
				}
			}
			if (!local885) {
				this.aByteArray47 = null;
			}
		}
		if (!local9) {
			this.aShortArray58 = null;
		}
		if (!local7) {
			this.aByteArray51 = null;
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(SSZ)V")
	public void method2602(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt3202; local13++) {
			if (this.aShortArray59[local13] == arg0) {
				this.aShortArray59[local13] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)[[I")
	public int[][] method2603() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3210; local12++) {
			@Pc(19) int local19 = this.anIntArray282[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(68) int local68 = 0; local68 < this.anInt3210; local68++) {
			@Pc(83) int local83 = this.anIntArray282[local68];
			if (local83 >= 0) {
				local47[local83][local8[local83]++] = local68;
			}
		}
		return local47;
	}
}
