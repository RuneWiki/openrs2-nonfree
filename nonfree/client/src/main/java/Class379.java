import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ww")
public final class Class379 {

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "[S")
	public short[] aShortArray152;

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "[S")
	public short[] aShortArray153;

	@OriginalMember(owner = "client!ww", name = "d", descriptor = "[I")
	public int[] anIntArray743;

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "[Lclient!uga;")
	public Class337[] aClass337Array5;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "[S")
	public short[] aShortArray154;

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "[S")
	public short[] aShortArray155;

	@OriginalMember(owner = "client!ww", name = "o", descriptor = "[B")
	public byte[] aByteArray101;

	@OriginalMember(owner = "client!ww", name = "p", descriptor = "[Lclient!gi;")
	public Class130[] aClass130Array5;

	@OriginalMember(owner = "client!ww", name = "q", descriptor = "[B")
	public byte[] aByteArray102;

	@OriginalMember(owner = "client!ww", name = "r", descriptor = "[I")
	public int[] anIntArray744;

	@OriginalMember(owner = "client!ww", name = "w", descriptor = "[Lclient!ph;")
	public Class259[] aClass259Array1;

	@OriginalMember(owner = "client!ww", name = "z", descriptor = "[I")
	public int[] anIntArray745;

	@OriginalMember(owner = "client!ww", name = "B", descriptor = "[B")
	public byte[] aByteArray103;

	@OriginalMember(owner = "client!ww", name = "C", descriptor = "[B")
	public byte[] aByteArray104;

	@OriginalMember(owner = "client!ww", name = "D", descriptor = "[S")
	public short[] aShortArray156;

	@OriginalMember(owner = "client!ww", name = "H", descriptor = "[B")
	public byte[] aByteArray105;

	@OriginalMember(owner = "client!ww", name = "I", descriptor = "[I")
	public int[] anIntArray746;

	@OriginalMember(owner = "client!ww", name = "J", descriptor = "[I")
	public int[] anIntArray747;

	@OriginalMember(owner = "client!ww", name = "K", descriptor = "[S")
	public short[] aShortArray157;

	@OriginalMember(owner = "client!ww", name = "L", descriptor = "[I")
	public int[] anIntArray748;

	@OriginalMember(owner = "client!ww", name = "M", descriptor = "[S")
	public short[] aShortArray158;

	@OriginalMember(owner = "client!ww", name = "N", descriptor = "[I")
	public int[] anIntArray749;

	@OriginalMember(owner = "client!ww", name = "S", descriptor = "[S")
	public short[] aShortArray159;

	@OriginalMember(owner = "client!ww", name = "T", descriptor = "[S")
	public short[] aShortArray160;

	@OriginalMember(owner = "client!ww", name = "U", descriptor = "[B")
	public byte[] aByteArray106;

	@OriginalMember(owner = "client!ww", name = "W", descriptor = "[S")
	public short[] aShortArray161;

	@OriginalMember(owner = "client!ww", name = "X", descriptor = "[B")
	public byte[] aByteArray107;

	@OriginalMember(owner = "client!ww", name = "Y", descriptor = "[I")
	public int[] anIntArray751;

	@OriginalMember(owner = "client!ww", name = "Z", descriptor = "[I")
	public int[] anIntArray752;

	@OriginalMember(owner = "client!ww", name = "ab", descriptor = "[I")
	public int[] anIntArray753;

	@OriginalMember(owner = "client!ww", name = "bb", descriptor = "[I")
	public int[] anIntArray754;

	@OriginalMember(owner = "client!ww", name = "e", descriptor = "B")
	public byte aByte129 = 0;

	@OriginalMember(owner = "client!ww", name = "k", descriptor = "I")
	public int anInt10276 = 0;

	@OriginalMember(owner = "client!ww", name = "A", descriptor = "I")
	public int anInt10284 = 12;

	@OriginalMember(owner = "client!ww", name = "O", descriptor = "I")
	public int anInt10288 = 0;

	@OriginalMember(owner = "client!ww", name = "t", descriptor = "I")
	public int anInt10279 = 0;

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
	public int anInt10272 = 0;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "()V")
	private Class379() {
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "([B)V")
	public Class379(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method8597(arg0);
		} else {
			this.method8594(arg0);
		}
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(III)V")
	public Class379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray754 = new int[arg1];
		this.aShortArray154 = new short[arg1];
		this.aShortArray153 = new short[arg1];
		this.anIntArray751 = new int[arg0];
		this.aShortArray161 = new short[arg1];
		this.aByteArray106 = new byte[arg1];
		this.aByteArray104 = new byte[arg1];
		this.aShortArray152 = new short[arg1];
		this.aByteArray105 = new byte[arg1];
		this.anIntArray752 = new int[arg0];
		this.aByteArray103 = new byte[arg1];
		this.aShortArray158 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray746 = new int[arg2];
			this.anIntArray747 = new int[arg2];
			this.anIntArray745 = new int[arg2];
			this.aShortArray160 = new short[arg2];
			this.anIntArray748 = new int[arg2];
			this.aByteArray101 = new byte[arg2];
			this.anIntArray749 = new int[arg2];
			this.aShortArray157 = new short[arg2];
			this.aShortArray156 = new short[arg2];
			this.anIntArray744 = new int[arg2];
			this.aByteArray107 = new byte[arg2];
			this.aByteArray102 = new byte[arg2];
		}
		this.anIntArray753 = new int[arg0];
		this.anIntArray743 = new int[arg0];
	}

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "([Lclient!ww;I)V")
	public Class379(@OriginalArg(0) Class379[] arg0, @OriginalArg(1) int arg1) {
		this.anInt10279 = 0;
		this.anInt10272 = 0;
		this.anInt10288 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		this.aByte129 = -1;
		@Pc(49) boolean local49 = false;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class379 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt10279 += local56.anInt10279;
				this.anInt10288 += local56.anInt10288;
				this.anInt10272 += local56.anInt10272;
				local36 |= local56.aByteArray103 != null;
				if (local56.aClass259Array1 != null) {
					local34 += local56.aClass259Array1.length;
				}
				if (local56.aClass337Array5 != null) {
					local32 += local56.aClass337Array5.length;
				}
				if (local56.aClass130Array5 != null) {
					local30 += local56.aClass130Array5.length;
				}
				local44 |= local56.aShortArray153 != null;
				if (local56.aByteArray105 == null) {
					if (this.aByte129 == -1) {
						this.aByte129 = local56.aByte129;
					}
					if (local56.aByte129 != this.aByte129) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local42 |= local56.aByteArray106 != null;
				local40 |= local56.aByteArray104 != null;
				local49 |= local56.anIntArray754 != null;
			}
		}
		if (local40) {
			this.aByteArray104 = new byte[this.anInt10272];
		}
		this.aShortArray152 = new short[this.anInt10272];
		this.aShortArray161 = new short[this.anInt10272];
		this.anIntArray753 = new int[this.anInt10288];
		this.aShortArray154 = new short[this.anInt10272];
		if (local49) {
			this.anIntArray754 = new int[this.anInt10272];
		}
		if (this.anInt10279 > 0) {
			this.aByteArray102 = new byte[this.anInt10279];
			this.aShortArray157 = new short[this.anInt10279];
			this.aShortArray160 = new short[this.anInt10279];
			this.aByteArray101 = new byte[this.anInt10279];
			this.anIntArray747 = new int[this.anInt10279];
			this.aByteArray107 = new byte[this.anInt10279];
			this.anIntArray746 = new int[this.anInt10279];
			this.anIntArray745 = new int[this.anInt10279];
			this.anIntArray748 = new int[this.anInt10279];
			this.anIntArray749 = new int[this.anInt10279];
			this.anIntArray744 = new int[this.anInt10279];
			this.aShortArray156 = new short[this.anInt10279];
		}
		if (local34 > 0) {
			this.aClass259Array1 = new Class259[local34];
		}
		if (local42) {
			this.aByteArray106 = new byte[this.anInt10272];
		}
		if (local38) {
			this.aByteArray105 = new byte[this.anInt10272];
		}
		if (local36) {
			this.aByteArray103 = new byte[this.anInt10272];
		}
		this.aShortArray158 = new short[this.anInt10272];
		this.anIntArray743 = new int[this.anInt10288];
		this.anIntArray751 = new int[this.anInt10288];
		this.aShortArray159 = new short[this.anInt10288];
		this.anIntArray752 = new int[this.anInt10288];
		if (local44) {
			this.aShortArray153 = new short[this.anInt10272];
		}
		if (local32 > 0) {
			this.aClass337Array5 = new Class337[local32];
		}
		if (local30 > 0) {
			this.aClass130Array5 = new Class130[local30];
		}
		this.aShortArray155 = new short[this.anInt10272];
		this.anInt10272 = 0;
		local32 = 0;
		this.anInt10279 = 0;
		local34 = 0;
		this.anInt10288 = 0;
		local30 = 0;
		@Pc(600) int local600;
		@Pc(611) int local611;
		for (@Pc(375) int local375 = 0; local375 < arg1; local375++) {
			@Pc(381) short local381 = (short) (0x1 << local375);
			@Pc(385) Class379 local385 = arg0[local375];
			if (local385 != null) {
				@Pc(392) int local392;
				if (local385.aClass259Array1 != null) {
					for (local392 = 0; local392 < local385.aClass259Array1.length; local392++) {
						@Pc(398) Class259 local398 = local385.aClass259Array1[local392];
						this.aClass259Array1[local34++] = local398.method6449(local398.anInt7713 + this.anInt10272);
					}
				}
				for (local392 = 0; local392 < local385.anInt10272; local392++) {
					if (local36 && local385.aByteArray103 != null) {
						this.aByteArray103[this.anInt10272] = local385.aByteArray103[local392];
					}
					if (local38) {
						if (local385.aByteArray105 == null) {
							this.aByteArray105[this.anInt10272] = local385.aByte129;
						} else {
							this.aByteArray105[this.anInt10272] = local385.aByteArray105[local392];
						}
					}
					if (local40 && local385.aByteArray104 != null) {
						this.aByteArray104[this.anInt10272] = local385.aByteArray104[local392];
					}
					if (local44) {
						if (local385.aShortArray153 == null) {
							this.aShortArray153[this.anInt10272] = -1;
						} else {
							this.aShortArray153[this.anInt10272] = local385.aShortArray153[local392];
						}
					}
					if (local49) {
						if (local385.anIntArray754 == null) {
							this.anIntArray754[this.anInt10272] = -1;
						} else {
							this.anIntArray754[this.anInt10272] = local385.anIntArray754[local392];
						}
					}
					this.aShortArray158[this.anInt10272] = (short) this.method8595(local381, local385, local385.aShortArray158[local392]);
					this.aShortArray152[this.anInt10272] = (short) this.method8595(local381, local385, local385.aShortArray152[local392]);
					this.aShortArray161[this.anInt10272] = (short) this.method8595(local381, local385, local385.aShortArray161[local392]);
					this.aShortArray155[this.anInt10272] = local381;
					this.aShortArray154[this.anInt10272] = local385.aShortArray154[local392];
					this.anInt10272++;
				}
				@Pc(588) int local588;
				if (local385.aClass130Array5 != null) {
					for (local588 = 0; local588 < local385.aClass130Array5.length; local588++) {
						local600 = this.method8595(local381, local385, local385.aClass130Array5[local588].anInt4011);
						local611 = this.method8595(local381, local385, local385.aClass130Array5[local588].anInt4017);
						@Pc(622) int local622 = this.method8595(local381, local385, local385.aClass130Array5[local588].anInt4029);
						this.aClass130Array5[local30] = local385.aClass130Array5[local588].method3299(local611, local622, local600);
						local30++;
					}
				}
				if (local385.aClass337Array5 != null) {
					for (local588 = 0; local588 < local385.aClass337Array5.length; local588++) {
						local600 = this.method8595(local381, local385, local385.aClass337Array5[local588].anInt9398);
						this.aClass337Array5[local32] = local385.aClass337Array5[local588].method7846(local600);
						local32++;
					}
				}
			}
		}
		@Pc(687) int local687 = 0;
		this.anInt10276 = this.anInt10288;
		for (@Pc(693) int local693 = 0; local693 < arg1; local693++) {
			@Pc(699) short local699 = (short) (0x1 << local693);
			@Pc(703) Class379 local703 = arg0[local693];
			if (local703 != null) {
				for (local600 = 0; local600 < local703.anInt10272; local600++) {
					if (local42) {
						this.aByteArray106[local687++] = (byte) (local703.aByteArray106 == null || local703.aByteArray106[local600] == -1 ? -1 : this.anInt10279 + local703.aByteArray106[local600]);
					}
				}
				for (local611 = 0; local611 < local703.anInt10279; local611++) {
					@Pc(757) byte local757 = this.aByteArray107[this.anInt10279] = local703.aByteArray107[local611];
					if (local757 == 0) {
						this.aShortArray160[this.anInt10279] = (short) this.method8595(local699, local703, local703.aShortArray160[local611]);
						this.aShortArray157[this.anInt10279] = (short) this.method8595(local699, local703, local703.aShortArray157[local611]);
						this.aShortArray156[this.anInt10279] = (short) this.method8595(local699, local703, local703.aShortArray156[local611]);
					}
					if (local757 >= 1 && local757 <= 3) {
						this.aShortArray160[this.anInt10279] = local703.aShortArray160[local611];
						this.aShortArray157[this.anInt10279] = local703.aShortArray157[local611];
						this.aShortArray156[this.anInt10279] = local703.aShortArray156[local611];
						this.anIntArray747[this.anInt10279] = local703.anIntArray747[local611];
						this.anIntArray749[this.anInt10279] = local703.anIntArray749[local611];
						this.anIntArray745[this.anInt10279] = local703.anIntArray745[local611];
						this.aByteArray101[this.anInt10279] = local703.aByteArray101[local611];
						this.aByteArray102[this.anInt10279] = local703.aByteArray102[local611];
						this.anIntArray748[this.anInt10279] = local703.anIntArray748[local611];
					}
					if (local757 == 2) {
						this.anIntArray744[this.anInt10279] = local703.anIntArray744[local611];
						this.anIntArray746[this.anInt10279] = local703.anIntArray746[local611];
					}
					this.anInt10279++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)[[I")
	public int[][] method8583(@OriginalArg(1) boolean arg0) {
		@Pc(6) int[] local6 = new int[256];
		@Pc(8) int local8 = 0;
		@Pc(16) int local16 = arg0 ? this.anInt10288 : this.anInt10276;
		for (@Pc(18) int local18 = 0; local18 < local16; local18++) {
			@Pc(24) int local24 = this.anIntArray753[local18];
			if (local24 >= 0) {
				if (local24 > local8) {
					local8 = local24;
				}
				@Pc(42) int local42 = local6[local24]++;
			}
		}
		@Pc(54) int[][] local54 = new int[local8 + 1][];
		for (@Pc(56) int local56 = 0; local56 <= local8; local56++) {
			local54[local56] = new int[local6[local56]];
			local6[local56] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < local16; local81++) {
			@Pc(87) int local87 = this.anIntArray753[local81];
			if (local87 >= 0) {
				local54[local87][local6[local87]++] = local81;
			}
		}
		return local54;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIII)V")
	public void method8584(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt10288; local5++) {
			this.anIntArray743[local5] += arg2;
			this.anIntArray752[local5] += arg1;
			this.anIntArray751[local5] += arg0;
		}
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(IIII)V")
	public void method8585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5;
		@Pc(9) int local9;
		@Pc(11) int local11;
		@Pc(28) int local28;
		if (arg0 != 0) {
			local5 = Class353.anIntArray681[arg0];
			local9 = Class353.anIntArray682[arg0];
			for (local11 = 0; local11 < this.anInt10288; local11++) {
				local28 = this.anIntArray743[local11] * local9 + local5 * this.anIntArray752[local11] >> 14;
				this.anIntArray752[local11] = local9 * this.anIntArray752[local11] - local5 * this.anIntArray743[local11] >> 14;
				this.anIntArray743[local11] = local28;
			}
		}
		if (arg1 != 0) {
			local5 = Class353.anIntArray681[arg1];
			local9 = Class353.anIntArray682[arg1];
			for (local11 = 0; local11 < this.anInt10288; local11++) {
				local28 = this.anIntArray752[local11] * local9 - local5 * this.anIntArray751[local11] >> 14;
				this.anIntArray751[local11] = this.anIntArray752[local11] * local5 + local9 * this.anIntArray751[local11] >> 14;
				this.anIntArray752[local11] = local28;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local5 = Class353.anIntArray681[arg2];
		local9 = Class353.anIntArray682[arg2];
		for (local11 = 0; local11 < this.anInt10288; local11++) {
			local28 = this.anIntArray743[local11] * local9 + local5 * this.anIntArray751[local11] >> 14;
			this.anIntArray751[local11] = this.anIntArray751[local11] * local9 - this.anIntArray743[local11] * local5 >> 14;
			this.anIntArray743[local11] = local28;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)V")
	public void method8586() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt10288; local1++) {
			this.anIntArray743[local1] <<= 0x2;
			this.anIntArray752[local1] <<= 0x2;
			this.anIntArray751[local1] <<= 0x2;
		}
		if (this.anInt10279 <= 0 || this.anIntArray747 == null) {
			return;
		}
		for (@Pc(50) int local50 = 0; local50 < this.anIntArray747.length; local50++) {
			this.anIntArray747[local50] <<= 0x2;
			this.anIntArray749[local50] <<= 0x2;
			if (this.aByteArray107[local50] != 1) {
				this.anIntArray745[local50] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BSS)V")
	public void method8588(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray153 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt10272; local9++) {
			if (this.aShortArray153[local9] == arg1) {
				this.aShortArray153[local9] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IIZI)I")
	public int method8589(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt10288; local7++) {
			if (this.anIntArray743[local7] == arg0 && this.anIntArray752[local7] == arg1 && this.anIntArray751[local7] == arg2) {
				return local7;
			}
		}
		this.anIntArray743[this.anInt10288] = arg0;
		this.anIntArray752[this.anInt10288] = arg1;
		this.anIntArray751[this.anInt10288] = arg2;
		this.anInt10276 = this.anInt10288 + 1;
		return this.anInt10288++;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ISS)V")
	public void method8590(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt10272; local13++) {
			if (this.aShortArray154[local13] == arg0) {
				this.aShortArray154[local13] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(Z)[[I")
	public int[][] method8591() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt10272; local17++) {
			@Pc(24) int local24 = this.anIntArray754[local17];
			if (local24 >= 0) {
				if (local24 > local15) {
					local15 = local24;
				}
				@Pc(39) int local39 = local13[local24]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local15 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local15; local54++) {
			local52[local54] = new int[local13[local54]];
			local13[local54] = 0;
		}
		for (@Pc(73) int local73 = 0; local73 < this.anInt10272; local73++) {
			@Pc(80) int local80 = this.anIntArray754[local73];
			if (local80 >= 0) {
				local52[local80][local13[local80]++] = local73;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IISBSIBZB)I")
	public int method8592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) short arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray158[this.anInt10272] = (short) arg1;
		this.aShortArray152[this.anInt10272] = (short) arg5;
		this.aShortArray161[this.anInt10272] = (short) arg0;
		this.aByteArray103[this.anInt10272] = arg6;
		this.aByteArray106[this.anInt10272] = arg3;
		this.aShortArray154[this.anInt10272] = arg4;
		this.aByteArray104[this.anInt10272] = arg7;
		this.aShortArray153[this.anInt10272] = arg2;
		return this.anInt10272++;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BSSSBSSBIS)B")
	public byte method8593() {
		if (this.anInt10279 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray107[this.anInt10279] = 3;
		this.aShortArray160[this.anInt10279] = 0;
		this.aShortArray157[this.anInt10279] = 32767;
		this.aShortArray156[this.anInt10279] = 0;
		this.anIntArray747[this.anInt10279] = 1024;
		this.anIntArray749[this.anInt10279] = 1024;
		this.anIntArray745[this.anInt10279] = 1024;
		this.aByteArray101[this.anInt10279] = 0;
		this.aByteArray102[this.anInt10279] = 0;
		this.anIntArray748[this.anInt10279] = 0;
		return (byte) this.anInt10279++;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(I[B)V")
	private void method8594(@OriginalArg(1) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class2_Sub34 local12 = new Class2_Sub34(arg0);
		@Pc(17) Class2_Sub34 local17 = new Class2_Sub34(arg0);
		@Pc(22) Class2_Sub34 local22 = new Class2_Sub34(arg0);
		@Pc(27) Class2_Sub34 local27 = new Class2_Sub34(arg0);
		@Pc(32) Class2_Sub34 local32 = new Class2_Sub34(arg0);
		local12.anInt8188 = arg0.length - 18;
		this.anInt10288 = local12.method6884();
		this.anInt10272 = local12.method6884();
		this.anInt10279 = local12.method6904();
		@Pc(57) int local57 = local12.method6904();
		@Pc(61) int local61 = local12.method6904();
		@Pc(65) int local65 = local12.method6904();
		@Pc(69) int local69 = local12.method6904();
		@Pc(73) int local73 = local12.method6904();
		@Pc(77) int local77 = local12.method6884();
		@Pc(81) int local81 = local12.method6884();
		@Pc(85) int local85 = local12.method6884();
		@Pc(89) int local89 = local12.method6884();
		@Pc(98) int local98 = this.anInt10288;
		@Pc(100) int local100 = local98;
		local98 += this.anInt10272;
		@Pc(107) int local107 = local98;
		if (local61 == 255) {
			local98 += this.anInt10272;
		}
		@Pc(119) int local119 = local98;
		if (local69 == 1) {
			local98 += this.anInt10272;
		}
		@Pc(131) int local131 = local98;
		if (local57 == 1) {
			local98 += this.anInt10272;
		}
		@Pc(141) int local141 = local98;
		if (local73 == 1) {
			local98 += this.anInt10288;
		}
		@Pc(153) int local153 = local98;
		if (local65 == 1) {
			local98 += this.anInt10272;
		}
		@Pc(165) int local165 = local98;
		local98 += local89;
		@Pc(171) int local171 = local98;
		local98 += this.anInt10272 * 2;
		@Pc(180) int local180 = local98;
		local98 += this.anInt10279 * 6;
		@Pc(189) int local189 = local98;
		local98 += local77;
		@Pc(195) int local195 = local98;
		local98 += local81;
		if (this.anInt10279 > 0) {
			this.aShortArray156 = new short[this.anInt10279];
			this.aShortArray157 = new short[this.anInt10279];
			this.aShortArray160 = new short[this.anInt10279];
			this.aByteArray107 = new byte[this.anInt10279];
		}
		this.aShortArray152 = new short[this.anInt10272];
		this.anIntArray752 = new int[this.anInt10288];
		if (local57 == 1) {
			this.aByteArray106 = new byte[this.anInt10272];
			this.aByteArray103 = new byte[this.anInt10272];
			this.aShortArray153 = new short[this.anInt10272];
		}
		this.aShortArray158 = new short[this.anInt10272];
		if (local61 == 255) {
			this.aByteArray105 = new byte[this.anInt10272];
		} else {
			this.aByte129 = (byte) local61;
		}
		this.aShortArray161 = new short[this.anInt10272];
		if (local73 == 1) {
			this.anIntArray753 = new int[this.anInt10288];
		}
		this.anIntArray751 = new int[this.anInt10288];
		this.anIntArray743 = new int[this.anInt10288];
		if (local65 == 1) {
			this.aByteArray104 = new byte[this.anInt10272];
		}
		this.aShortArray154 = new short[this.anInt10272];
		local12.anInt8188 = 0;
		if (local69 == 1) {
			this.anIntArray754 = new int[this.anInt10272];
		}
		local17.anInt8188 = local189;
		local22.anInt8188 = local195;
		local27.anInt8188 = local98;
		local32.anInt8188 = local141;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(358) int local358;
		@Pc(360) int local360;
		for (@Pc(353) int local353 = 0; local353 < this.anInt10288; local353++) {
			local358 = local12.method6904();
			local360 = 0;
			if ((local358 & 0x1) != 0) {
				local360 = local17.method6901();
			}
			@Pc(373) int local373 = 0;
			if ((local358 & 0x2) != 0) {
				local373 = local22.method6901();
			}
			@Pc(383) int local383 = 0;
			if ((local358 & 0x4) != 0) {
				local383 = local27.method6901();
			}
			this.anIntArray743[local353] = local360 + local347;
			this.anIntArray752[local353] = local373 + local349;
			this.anIntArray751[local353] = local383 + local351;
			local351 = this.anIntArray751[local353];
			local349 = this.anIntArray752[local353];
			local347 = this.anIntArray743[local353];
			if (local73 == 1) {
				this.anIntArray753[local353] = local32.method6904();
			}
		}
		local12.anInt8188 = local171;
		local17.anInt8188 = local131;
		local22.anInt8188 = local107;
		local27.anInt8188 = local153;
		local32.anInt8188 = local119;
		for (local358 = 0; local358 < this.anInt10272; local358++) {
			this.aShortArray154[local358] = (short) local12.method6884();
			if (local57 == 1) {
				local360 = local17.method6904();
				if ((local360 & 0x1) == 1) {
					local5 = true;
					this.aByteArray103[local358] = 1;
				} else {
					this.aByteArray103[local358] = 0;
				}
				if ((local360 & 0x2) == 2) {
					this.aByteArray106[local358] = (byte) (local360 >> 2);
					this.aShortArray153[local358] = this.aShortArray154[local358];
					this.aShortArray154[local358] = 127;
					if (this.aShortArray153[local358] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray106[local358] = -1;
					this.aShortArray153[local358] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray105[local358] = local22.method6908();
			}
			if (local65 == 1) {
				this.aByteArray104[local358] = local27.method6908();
			}
			if (local69 == 1) {
				this.anIntArray754[local358] = local32.method6904();
			}
		}
		this.anInt10276 = -1;
		local12.anInt8188 = local165;
		local17.anInt8188 = local100;
		@Pc(596) short local596 = 0;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(609) int local609;
		for (@Pc(604) int local604 = 0; local604 < this.anInt10272; local604++) {
			local609 = local17.method6904();
			if (local609 == 1) {
				local596 = (short) (local602 + local12.method6901());
				local598 = (short) (local12.method6901() + local596);
				local600 = (short) (local598 + local12.method6901());
				this.aShortArray158[local604] = local596;
				local602 = local600;
				this.aShortArray152[local604] = local598;
				this.aShortArray161[local604] = local600;
				if (this.anInt10276 < local596) {
					this.anInt10276 = local596;
				}
				if (local598 > this.anInt10276) {
					this.anInt10276 = local598;
				}
				if (local600 > this.anInt10276) {
					this.anInt10276 = local600;
				}
			}
			if (local609 == 2) {
				local598 = local600;
				local600 = (short) (local602 + local12.method6901());
				local602 = local600;
				this.aShortArray158[local604] = local596;
				this.aShortArray152[local604] = local598;
				this.aShortArray161[local604] = local600;
				if (this.anInt10276 < local600) {
					this.anInt10276 = local600;
				}
			}
			if (local609 == 3) {
				local596 = local600;
				local600 = (short) (local12.method6901() + local602);
				this.aShortArray158[local604] = local596;
				local602 = local600;
				this.aShortArray152[local604] = local598;
				this.aShortArray161[local604] = local600;
				if (local600 > this.anInt10276) {
					this.anInt10276 = local600;
				}
			}
			if (local609 == 4) {
				@Pc(770) short local770 = local596;
				local596 = local598;
				local598 = local770;
				local600 = (short) (local12.method6901() + local602);
				local602 = local600;
				this.aShortArray158[local604] = local596;
				this.aShortArray152[local604] = local770;
				this.aShortArray161[local604] = local600;
				if (local600 > this.anInt10276) {
					this.anInt10276 = local600;
				}
			}
		}
		local12.anInt8188 = local180;
		this.anInt10276++;
		for (local609 = 0; local609 < this.anInt10279; local609++) {
			this.aByteArray107[local609] = 0;
			this.aShortArray160[local609] = (short) local12.method6884();
			this.aShortArray157[local609] = (short) local12.method6884();
			this.aShortArray156[local609] = (short) local12.method6884();
		}
		if (this.aByteArray106 != null) {
			@Pc(869) boolean local869 = false;
			for (@Pc(871) int local871 = 0; local871 < this.anInt10272; local871++) {
				@Pc(879) int local879 = this.aByteArray106[local871] & 0xFF;
				if (local879 != 255) {
					if ((this.aShortArray160[local879] & 0xFFFF) == this.aShortArray158[local871] && (this.aShortArray157[local879] & 0xFFFF) == this.aShortArray152[local871] && (this.aShortArray156[local879] & 0xFFFF) == this.aShortArray161[local871]) {
						this.aByteArray106[local871] = -1;
					} else {
						local869 = true;
					}
				}
			}
			if (!local869) {
				this.aByteArray106 = null;
			}
		}
		if (!local5) {
			this.aByteArray103 = null;
		}
		if (!local7) {
			this.aShortArray153 = null;
		}
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(SILclient!ww;I)I")
	private int method8595(@OriginalArg(0) short arg0, @OriginalArg(2) Class379 arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1.anIntArray743[arg2];
		@Pc(13) int local13 = arg1.anIntArray752[arg2];
		@Pc(18) int local18 = arg1.anIntArray751[arg2];
		for (@Pc(26) int local26 = 0; local26 < this.anInt10288; local26++) {
			if (local8 == this.anIntArray743[local26] && local13 == this.anIntArray752[local26] && this.anIntArray751[local26] == local18) {
				this.aShortArray159[local26] |= arg0;
				return local26;
			}
		}
		this.anIntArray743[this.anInt10288] = local8;
		this.anIntArray752[this.anInt10288] = local13;
		this.anIntArray751[this.anInt10288] = local18;
		this.aShortArray159[this.anInt10288] = arg0;
		this.anIntArray753[this.anInt10288] = arg1.anIntArray753 == null ? -1 : arg1.anIntArray753[arg2];
		return this.anInt10288++;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "([BI)V")
	private void method8597(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class2_Sub34 local8 = new Class2_Sub34(arg0);
		@Pc(13) Class2_Sub34 local13 = new Class2_Sub34(arg0);
		@Pc(18) Class2_Sub34 local18 = new Class2_Sub34(arg0);
		@Pc(23) Class2_Sub34 local23 = new Class2_Sub34(arg0);
		@Pc(28) Class2_Sub34 local28 = new Class2_Sub34(arg0);
		@Pc(33) Class2_Sub34 local33 = new Class2_Sub34(arg0);
		@Pc(38) Class2_Sub34 local38 = new Class2_Sub34(arg0);
		local8.anInt8188 = arg0.length - 23;
		this.anInt10288 = local8.method6884();
		this.anInt10272 = local8.method6884();
		this.anInt10279 = local8.method6904();
		@Pc(63) int local63 = local8.method6904();
		@Pc(74) boolean local74 = (local63 & 0x1) == 1;
		@Pc(83) boolean local83 = (local63 & 0x2) == 2;
		@Pc(92) boolean local92 = (local63 & 0x4) == 4;
		@Pc(101) boolean local101 = (local63 & 0x8) == 8;
		if (local101) {
			local8.anInt8188 -= 7;
			this.anInt10284 = local8.method6904();
			local8.anInt8188 += 6;
		}
		@Pc(124) int local124 = local8.method6904();
		@Pc(128) int local128 = local8.method6904();
		@Pc(132) int local132 = local8.method6904();
		@Pc(136) int local136 = local8.method6904();
		@Pc(140) int local140 = local8.method6904();
		@Pc(144) int local144 = local8.method6884();
		@Pc(148) int local148 = local8.method6884();
		@Pc(152) int local152 = local8.method6884();
		@Pc(156) int local156 = local8.method6884();
		@Pc(160) int local160 = local8.method6884();
		@Pc(162) int local162 = 0;
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(179) int local179;
		if (this.anInt10279 > 0) {
			local8.anInt8188 = 0;
			this.aByteArray107 = new byte[this.anInt10279];
			for (local179 = 0; local179 < this.anInt10279; local179++) {
				@Pc(189) byte local189 = this.aByteArray107[local179] = local8.method6908();
				if (local189 == 2) {
					local166++;
				}
				if (local189 >= 1 && local189 <= 3) {
					local164++;
				}
				if (local189 == 0) {
					local162++;
				}
			}
		}
		local179 = this.anInt10279;
		@Pc(219) int local219 = local179;
		local179 += this.anInt10288;
		@Pc(226) int local226 = local179;
		if (local74) {
			local179 += this.anInt10272;
		}
		@Pc(235) int local235 = local179;
		local179 += this.anInt10272;
		@Pc(242) int local242 = local179;
		if (local124 == 255) {
			local179 += this.anInt10272;
		}
		@Pc(254) int local254 = local179;
		if (local132 == 1) {
			local179 += this.anInt10272;
		}
		@Pc(266) int local266 = local179;
		if (local140 == 1) {
			local179 += this.anInt10288;
		}
		@Pc(278) int local278 = local179;
		if (local128 == 1) {
			local179 += this.anInt10272;
		}
		@Pc(290) int local290 = local179;
		local179 += local156;
		@Pc(296) int local296 = local179;
		if (local136 == 1) {
			local179 += this.anInt10272 * 2;
		}
		@Pc(310) int local310 = local179;
		local179 += local160;
		@Pc(316) int local316 = local179;
		local179 += this.anInt10272 * 2;
		@Pc(325) int local325 = local179;
		local179 += local144;
		@Pc(331) int local331 = local179;
		local179 += local148;
		@Pc(337) int local337 = local179;
		local179 += local152;
		@Pc(343) int local343 = local179;
		local179 += local162 * 6;
		@Pc(351) int local351 = local179;
		local179 += local164 * 6;
		@Pc(359) byte local359 = 6;
		if (this.anInt10284 == 14) {
			local359 = 7;
		} else if (this.anInt10284 >= 15) {
			local359 = 9;
		}
		@Pc(376) int local376 = local179;
		local179 += local359 * local164;
		@Pc(384) int local384 = local179;
		local179 += local164;
		@Pc(390) int local390 = local179;
		local179 += local164;
		@Pc(396) int local396 = local179;
		local179 += local166 * 2 + local164;
		this.anIntArray752 = new int[this.anInt10288];
		this.aShortArray154 = new short[this.anInt10272];
		if (local136 == 1) {
			this.aShortArray153 = new short[this.anInt10272];
		}
		if (local136 == 1 && this.anInt10279 > 0) {
			this.aByteArray106 = new byte[this.anInt10272];
		}
		if (local132 == 1) {
			this.anIntArray754 = new int[this.anInt10272];
		}
		if (local124 == 255) {
			this.aByteArray105 = new byte[this.anInt10272];
		} else {
			this.aByte129 = (byte) local124;
		}
		this.anIntArray743 = new int[this.anInt10288];
		if (local128 == 1) {
			this.aByteArray104 = new byte[this.anInt10272];
		}
		if (local140 == 1) {
			this.anIntArray753 = new int[this.anInt10288];
		}
		this.aShortArray158 = new short[this.anInt10272];
		if (this.anInt10279 > 0) {
			this.aShortArray156 = new short[this.anInt10279];
			if (local166 > 0) {
				this.anIntArray746 = new int[local166];
				this.anIntArray744 = new int[local166];
			}
			this.aShortArray157 = new short[this.anInt10279];
			if (local164 > 0) {
				this.anIntArray748 = new int[local164];
				this.anIntArray745 = new int[local164];
				this.anIntArray747 = new int[local164];
				this.aByteArray101 = new byte[local164];
				this.anIntArray749 = new int[local164];
				this.aByteArray102 = new byte[local164];
			}
			this.aShortArray160 = new short[this.anInt10279];
		}
		this.aShortArray161 = new short[this.anInt10272];
		local8.anInt8188 = local219;
		if (local74) {
			this.aByteArray103 = new byte[this.anInt10272];
		}
		this.anIntArray751 = new int[this.anInt10288];
		this.aShortArray152 = new short[this.anInt10272];
		local13.anInt8188 = local325;
		local18.anInt8188 = local331;
		local23.anInt8188 = local337;
		local28.anInt8188 = local266;
		@Pc(584) int local584 = 0;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(597) int local597;
		for (@Pc(590) int local590 = 0; local590 < this.anInt10288; local590++) {
			@Pc(595) int local595 = local8.method6904();
			local597 = 0;
			if ((local595 & 0x1) != 0) {
				local597 = local13.method6901();
			}
			@Pc(607) int local607 = 0;
			if ((local595 & 0x2) != 0) {
				local607 = local18.method6901();
			}
			@Pc(617) int local617 = 0;
			if ((local595 & 0x4) != 0) {
				local617 = local23.method6901();
			}
			this.anIntArray743[local590] = local597 + local584;
			this.anIntArray752[local590] = local607 + local586;
			this.anIntArray751[local590] = local588 + local617;
			local588 = this.anIntArray751[local590];
			local586 = this.anIntArray752[local590];
			local584 = this.anIntArray743[local590];
			if (local140 == 1) {
				this.anIntArray753[local590] = local28.method6904();
			}
		}
		local8.anInt8188 = local316;
		local13.anInt8188 = local226;
		local18.anInt8188 = local242;
		local23.anInt8188 = local278;
		local28.anInt8188 = local254;
		local33.anInt8188 = local296;
		local38.anInt8188 = local310;
		for (local597 = 0; local597 < this.anInt10272; local597++) {
			this.aShortArray154[local597] = (short) local8.method6884();
			if (local74) {
				this.aByteArray103[local597] = local13.method6908();
			}
			if (local124 == 255) {
				this.aByteArray105[local597] = local18.method6908();
			}
			if (local128 == 1) {
				this.aByteArray104[local597] = local23.method6908();
			}
			if (local132 == 1) {
				this.anIntArray754[local597] = local28.method6904();
			}
			if (local136 == 1) {
				this.aShortArray153[local597] = (short) (local33.method6884() - 1);
			}
			if (this.aByteArray106 != null) {
				if (this.aShortArray153[local597] == -1) {
					this.aByteArray106[local597] = -1;
				} else {
					this.aByteArray106[local597] = (byte) (local38.method6904() - 1);
				}
			}
		}
		local8.anInt8188 = local290;
		this.anInt10276 = -1;
		local13.anInt8188 = local235;
		@Pc(821) short local821 = 0;
		@Pc(823) short local823 = 0;
		@Pc(825) short local825 = 0;
		@Pc(827) short local827 = 0;
		@Pc(834) int local834;
		for (@Pc(829) int local829 = 0; local829 < this.anInt10272; local829++) {
			local834 = local13.method6904();
			if (local834 == 1) {
				local821 = (short) (local827 + local8.method6901());
				local823 = (short) (local8.method6901() + local821);
				local825 = (short) (local823 + local8.method6901());
				this.aShortArray158[local829] = local821;
				local827 = local825;
				this.aShortArray152[local829] = local823;
				this.aShortArray161[local829] = local825;
				if (this.anInt10276 < local821) {
					this.anInt10276 = local821;
				}
				if (this.anInt10276 < local823) {
					this.anInt10276 = local823;
				}
				if (this.anInt10276 < local825) {
					this.anInt10276 = local825;
				}
			}
			if (local834 == 2) {
				local823 = local825;
				local825 = (short) (local8.method6901() + local827);
				this.aShortArray158[local829] = local821;
				local827 = local825;
				this.aShortArray152[local829] = local823;
				this.aShortArray161[local829] = local825;
				if (this.anInt10276 < local825) {
					this.anInt10276 = local825;
				}
			}
			if (local834 == 3) {
				local821 = local825;
				local825 = (short) (local8.method6901() + local827);
				local827 = local825;
				this.aShortArray158[local829] = local821;
				this.aShortArray152[local829] = local823;
				this.aShortArray161[local829] = local825;
				if (this.anInt10276 < local825) {
					this.anInt10276 = local825;
				}
			}
			if (local834 == 4) {
				@Pc(987) short local987 = local821;
				local821 = local823;
				local825 = (short) (local8.method6901() + local827);
				local823 = local987;
				local827 = local825;
				this.aShortArray158[local829] = local821;
				this.aShortArray152[local829] = local987;
				this.aShortArray161[local829] = local825;
				if (this.anInt10276 < local825) {
					this.anInt10276 = local825;
				}
			}
		}
		local8.anInt8188 = local343;
		this.anInt10276++;
		local13.anInt8188 = local351;
		local18.anInt8188 = local376;
		local23.anInt8188 = local384;
		local28.anInt8188 = local390;
		local33.anInt8188 = local396;
		@Pc(1061) int local1061;
		for (local834 = 0; local834 < this.anInt10279; local834++) {
			local1061 = this.aByteArray107[local834] & 0xFF;
			if (local1061 == 0) {
				this.aShortArray160[local834] = (short) local8.method6884();
				this.aShortArray157[local834] = (short) local8.method6884();
				this.aShortArray156[local834] = (short) local8.method6884();
			}
			if (local1061 == 1) {
				this.aShortArray160[local834] = (short) local13.method6884();
				this.aShortArray157[local834] = (short) local13.method6884();
				this.aShortArray156[local834] = (short) local13.method6884();
				if (this.anInt10284 < 15) {
					this.anIntArray747[local834] = local18.method6884();
					if (this.anInt10284 < 14) {
						this.anIntArray749[local834] = local18.method6884();
					} else {
						this.anIntArray749[local834] = local18.method6870();
					}
					this.anIntArray745[local834] = local18.method6884();
				} else {
					this.anIntArray747[local834] = local18.method6870();
					this.anIntArray749[local834] = local18.method6870();
					this.anIntArray745[local834] = local18.method6870();
				}
				this.aByteArray101[local834] = local23.method6908();
				this.aByteArray102[local834] = local28.method6908();
				this.anIntArray748[local834] = local33.method6908();
			}
			if (local1061 == 2) {
				this.aShortArray160[local834] = (short) local13.method6884();
				this.aShortArray157[local834] = (short) local13.method6884();
				this.aShortArray156[local834] = (short) local13.method6884();
				if (this.anInt10284 < 15) {
					this.anIntArray747[local834] = local18.method6884();
					if (this.anInt10284 < 14) {
						this.anIntArray749[local834] = local18.method6884();
					} else {
						this.anIntArray749[local834] = local18.method6870();
					}
					this.anIntArray745[local834] = local18.method6884();
				} else {
					this.anIntArray747[local834] = local18.method6870();
					this.anIntArray749[local834] = local18.method6870();
					this.anIntArray745[local834] = local18.method6870();
				}
				this.aByteArray101[local834] = local23.method6908();
				this.aByteArray102[local834] = local28.method6908();
				this.anIntArray748[local834] = local33.method6908();
				this.anIntArray744[local834] = local33.method6908();
				this.anIntArray746[local834] = local33.method6908();
			}
			if (local1061 == 3) {
				this.aShortArray160[local834] = (short) local13.method6884();
				this.aShortArray157[local834] = (short) local13.method6884();
				this.aShortArray156[local834] = (short) local13.method6884();
				if (this.anInt10284 >= 15) {
					this.anIntArray747[local834] = local18.method6870();
					this.anIntArray749[local834] = local18.method6870();
					this.anIntArray745[local834] = local18.method6870();
				} else {
					this.anIntArray747[local834] = local18.method6884();
					if (this.anInt10284 < 14) {
						this.anIntArray749[local834] = local18.method6884();
					} else {
						this.anIntArray749[local834] = local18.method6870();
					}
					this.anIntArray745[local834] = local18.method6884();
				}
				this.aByteArray101[local834] = local23.method6908();
				this.aByteArray102[local834] = local28.method6908();
				this.anIntArray748[local834] = local33.method6908();
			}
		}
		local8.anInt8188 = local179;
		@Pc(1461) int local1461;
		@Pc(1466) int local1466;
		@Pc(1470) int local1470;
		@Pc(1534) int local1534;
		if (local83) {
			local1061 = local8.method6904();
			if (local1061 > 0) {
				this.aClass130Array5 = new Class130[local1061];
				for (local1461 = 0; local1461 < local1061; local1461++) {
					local1466 = local8.method6884();
					local1470 = local8.method6884();
					@Pc(1480) byte local1480;
					if (local124 == 255) {
						local1480 = this.aByteArray105[local1470];
					} else {
						local1480 = (byte) local124;
					}
					this.aClass130Array5[local1461] = new Class130(local1466, this.aShortArray158[local1470], this.aShortArray152[local1470], this.aShortArray161[local1470], local1480);
				}
			}
			local1461 = local8.method6904();
			if (local1461 > 0) {
				this.aClass337Array5 = new Class337[local1461];
				for (local1466 = 0; local1466 < local1461; local1466++) {
					local1470 = local8.method6884();
					local1534 = local8.method6884();
					this.aClass337Array5[local1466] = new Class337(local1470, local1534);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1061 = local8.method6904();
		if (local1061 <= 0) {
			return;
		}
		this.aClass259Array1 = new Class259[local1061];
		for (local1461 = 0; local1461 < local1061; local1461++) {
			local1466 = local8.method6884();
			local1470 = local8.method6884();
			local1534 = local8.method6904();
			@Pc(1582) byte local1582 = local8.method6908();
			this.aClass259Array1[local1461] = new Class259(local1466, local1470, local1534, local1582);
		}
		return;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(Z)[[I")
	public int[][] method8598() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass259Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass259Array1[local12].anInt7711;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(34) int local34 = local8[local20]++;
			}
		}
		@Pc(48) int[][] local48 = new int[local10 + 1][];
		for (@Pc(50) int local50 = 0; local50 <= local10; local50++) {
			local48[local50] = new int[local8[local50]];
			local8[local50] = 0;
		}
		for (@Pc(75) int local75 = 0; local75 < this.aClass259Array1.length; local75++) {
			@Pc(83) int local83 = this.aClass259Array1[local75].anInt7711;
			if (local83 >= 0) {
				local48[local83][local8[local83]++] = local75;
			}
		}
		return local48;
	}
}
