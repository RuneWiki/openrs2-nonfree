import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ida")
public final class Class159 {

	@OriginalMember(owner = "client!ida", name = "d", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!ida", name = "e", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!ida", name = "g", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!ida", name = "o", descriptor = "[Lclient!gfa;")
	public Class123[] aClass123Array3;

	@OriginalMember(owner = "client!ida", name = "p", descriptor = "[B")
	public byte[] aByteArray40;

	@OriginalMember(owner = "client!ida", name = "q", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!ida", name = "r", descriptor = "[Lclient!pi;")
	public Class283[] aClass283Array3;

	@OriginalMember(owner = "client!ida", name = "s", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!ida", name = "t", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!ida", name = "u", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!ida", name = "w", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!ida", name = "x", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!ida", name = "y", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!ida", name = "D", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!ida", name = "F", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!ida", name = "I", descriptor = "[I")
	public int[] anIntArray232;

	@OriginalMember(owner = "client!ida", name = "K", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!ida", name = "L", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!ida", name = "N", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!ida", name = "P", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!ida", name = "Q", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!ida", name = "R", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!ida", name = "S", descriptor = "[Lclient!ig;")
	public Class161[] aClass161Array1;

	@OriginalMember(owner = "client!ida", name = "T", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!ida", name = "V", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!ida", name = "Y", descriptor = "[I")
	public int[] anIntArray236;

	@OriginalMember(owner = "client!ida", name = "Z", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!ida", name = "E", descriptor = "I")
	public int anInt4810 = 0;

	@OriginalMember(owner = "client!ida", name = "C", descriptor = "I")
	public int anInt4809 = 12;

	@OriginalMember(owner = "client!ida", name = "f", descriptor = "B")
	public byte aByte75 = 0;

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
	public int anInt4804 = 0;

	@OriginalMember(owner = "client!ida", name = "W", descriptor = "I")
	public int anInt4817 = 0;

	@OriginalMember(owner = "client!ida", name = "cb", descriptor = "I")
	public int anInt4821 = 0;

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "()V")
	private Class159() {
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "([B)V")
	public Class159(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4369(arg0);
		} else {
			this.method4361(arg0);
		}
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(III)V")
	public Class159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray67 = new short[arg1];
		this.anIntArray234 = new int[arg0];
		this.aShortArray66 = new short[arg1];
		this.aByteArray42 = new byte[arg1];
		this.anIntArray235 = new int[arg0];
		this.aShortArray68 = new short[arg1];
		this.aByteArray38 = new byte[arg1];
		this.aByteArray43 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray61 = new short[arg2];
			this.aByteArray40 = new byte[arg2];
			this.anIntArray228 = new int[arg2];
			this.anIntArray227 = new int[arg2];
			this.aByteArray39 = new byte[arg2];
			this.anIntArray230 = new int[arg2];
			this.anIntArray236 = new int[arg2];
			this.aShortArray63 = new short[arg2];
			this.aByteArray41 = new byte[arg2];
			this.aShortArray62 = new short[arg2];
			this.anIntArray231 = new int[arg2];
			this.anIntArray233 = new int[arg2];
		}
		this.aByteArray44 = new byte[arg1];
		this.anIntArray232 = new int[arg1];
		this.anIntArray229 = new int[arg0];
		this.aShortArray64 = new short[arg1];
		this.aShortArray69 = new short[arg1];
		this.anIntArray226 = new int[arg0];
	}

	@OriginalMember(owner = "client!ida", name = "<init>", descriptor = "([Lclient!ida;I)V")
	public Class159(@OriginalArg(0) Class159[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4804 = 0;
		this.anInt4810 = 0;
		this.anInt4821 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte75 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class159 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4810 += local59.anInt4810;
				this.anInt4804 += local59.anInt4804;
				this.anInt4821 += local59.anInt4821;
				if (local59.aClass123Array3 != null) {
					local34 += local59.aClass123Array3.length;
				}
				local38 |= local59.aByteArray38 != null;
				if (local59.aClass283Array3 != null) {
					local32 += local59.aClass283Array3.length;
				}
				if (local59.aClass161Array1 != null) {
					local36 += local59.aClass161Array1.length;
				}
				local46 |= local59.aShortArray66 != null;
				if (local59.aByteArray43 == null) {
					if (this.aByte75 == -1) {
						this.aByte75 = local59.aByte75;
					}
					if (local59.aByte75 != this.aByte75) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray44 != null;
				local42 |= local59.aByteArray42 != null;
				local48 |= local59.anIntArray232 != null;
			}
		}
		if (local44) {
			this.aByteArray44 = new byte[this.anInt4810];
		}
		this.aShortArray65 = new short[this.anInt4804];
		if (local34 > 0) {
			this.aClass123Array3 = new Class123[local34];
		}
		this.aShortArray64 = new short[this.anInt4810];
		if (local38) {
			this.aByteArray38 = new byte[this.anInt4810];
		}
		this.aShortArray70 = new short[this.anInt4810];
		if (local48) {
			this.anIntArray232 = new int[this.anInt4810];
		}
		if (local42) {
			this.aByteArray42 = new byte[this.anInt4810];
		}
		if (local36 > 0) {
			this.aClass161Array1 = new Class161[local36];
		}
		this.anIntArray226 = new int[this.anInt4804];
		this.aShortArray69 = new short[this.anInt4810];
		if (this.anInt4821 > 0) {
			this.aShortArray61 = new short[this.anInt4821];
			this.aByteArray40 = new byte[this.anInt4821];
			this.anIntArray227 = new int[this.anInt4821];
			this.anIntArray231 = new int[this.anInt4821];
			this.anIntArray228 = new int[this.anInt4821];
			this.aByteArray39 = new byte[this.anInt4821];
			this.anIntArray230 = new int[this.anInt4821];
			this.aShortArray62 = new short[this.anInt4821];
			this.aShortArray63 = new short[this.anInt4821];
			this.aByteArray41 = new byte[this.anInt4821];
			this.anIntArray236 = new int[this.anInt4821];
			this.anIntArray233 = new int[this.anInt4821];
		}
		if (local32 > 0) {
			this.aClass283Array3 = new Class283[local32];
		}
		this.aShortArray68 = new short[this.anInt4810];
		if (local40) {
			this.aByteArray43 = new byte[this.anInt4810];
		}
		this.anIntArray229 = new int[this.anInt4804];
		this.anIntArray235 = new int[this.anInt4804];
		this.aShortArray67 = new short[this.anInt4810];
		this.anIntArray234 = new int[this.anInt4804];
		if (local46) {
			this.aShortArray66 = new short[this.anInt4810];
		}
		local32 = 0;
		local34 = 0;
		this.anInt4810 = 0;
		local36 = 0;
		this.anInt4821 = 0;
		this.anInt4804 = 0;
		@Pc(614) int local614;
		@Pc(625) int local625;
		for (@Pc(378) int local378 = 0; local378 < arg1; local378++) {
			@Pc(385) short local385 = (short) (0x1 << local378);
			@Pc(389) Class159 local389 = arg0[local378];
			if (local389 != null) {
				@Pc(396) int local396;
				if (local389.aClass161Array1 != null) {
					for (local396 = 0; local396 < local389.aClass161Array1.length; local396++) {
						@Pc(403) Class161 local403 = local389.aClass161Array1[local396];
						this.aClass161Array1[local36++] = local403.method4413(this.anInt4810 + local403.anInt4867);
					}
				}
				for (local396 = 0; local396 < local389.anInt4810; local396++) {
					if (local38 && local389.aByteArray38 != null) {
						this.aByteArray38[this.anInt4810] = local389.aByteArray38[local396];
					}
					if (local40) {
						if (local389.aByteArray43 == null) {
							this.aByteArray43[this.anInt4810] = local389.aByte75;
						} else {
							this.aByteArray43[this.anInt4810] = local389.aByteArray43[local396];
						}
					}
					if (local42 && local389.aByteArray42 != null) {
						this.aByteArray42[this.anInt4810] = local389.aByteArray42[local396];
					}
					if (local46) {
						if (local389.aShortArray66 == null) {
							this.aShortArray66[this.anInt4810] = -1;
						} else {
							this.aShortArray66[this.anInt4810] = local389.aShortArray66[local396];
						}
					}
					if (local48) {
						if (local389.anIntArray232 == null) {
							this.anIntArray232[this.anInt4810] = -1;
						} else {
							this.anIntArray232[this.anInt4810] = local389.anIntArray232[local396];
						}
					}
					this.aShortArray68[this.anInt4810] = (short) this.method4363(local385, local389, local389.aShortArray68[local396]);
					this.aShortArray69[this.anInt4810] = (short) this.method4363(local385, local389, local389.aShortArray69[local396]);
					this.aShortArray64[this.anInt4810] = (short) this.method4363(local385, local389, local389.aShortArray64[local396]);
					this.aShortArray70[this.anInt4810] = local385;
					this.aShortArray67[this.anInt4810] = local389.aShortArray67[local396];
					this.anInt4810++;
				}
				@Pc(601) int local601;
				if (local389.aClass283Array3 != null) {
					for (local601 = 0; local601 < local389.aClass283Array3.length; local601++) {
						local614 = this.method4363(local385, local389, local389.aClass283Array3[local601].anInt8258);
						local625 = this.method4363(local385, local389, local389.aClass283Array3[local601].anInt8262);
						@Pc(636) int local636 = this.method4363(local385, local389, local389.aClass283Array3[local601].anInt8247);
						this.aClass283Array3[local32] = local389.aClass283Array3[local601].method7370(local636, local625, local614);
						local32++;
					}
				}
				if (local389.aClass123Array3 != null) {
					for (local601 = 0; local601 < local389.aClass123Array3.length; local601++) {
						local614 = this.method4363(local385, local389, local389.aClass123Array3[local601].anInt3872);
						this.aClass123Array3[local34] = local389.aClass123Array3[local601].method3577(local614);
						local34++;
					}
				}
			}
		}
		this.anInt4817 = this.anInt4804;
		@Pc(706) int local706 = 0;
		for (@Pc(708) int local708 = 0; local708 < arg1; local708++) {
			@Pc(715) short local715 = (short) (0x1 << local708);
			@Pc(719) Class159 local719 = arg0[local708];
			if (local719 != null) {
				for (local614 = 0; local614 < local719.anInt4810; local614++) {
					if (local44) {
						this.aByteArray44[local706++] = (byte) (local719.aByteArray44 == null || local719.aByteArray44[local614] == -1 ? -1 : this.anInt4821 + local719.aByteArray44[local614]);
					}
				}
				for (local625 = 0; local625 < local719.anInt4821; local625++) {
					@Pc(771) byte local771 = this.aByteArray40[this.anInt4821] = local719.aByteArray40[local625];
					if (local771 == 0) {
						this.aShortArray63[this.anInt4821] = (short) this.method4363(local715, local719, local719.aShortArray63[local625]);
						this.aShortArray61[this.anInt4821] = (short) this.method4363(local715, local719, local719.aShortArray61[local625]);
						this.aShortArray62[this.anInt4821] = (short) this.method4363(local715, local719, local719.aShortArray62[local625]);
					}
					if (local771 >= 1 && local771 <= 3) {
						this.aShortArray63[this.anInt4821] = local719.aShortArray63[local625];
						this.aShortArray61[this.anInt4821] = local719.aShortArray61[local625];
						this.aShortArray62[this.anInt4821] = local719.aShortArray62[local625];
						this.anIntArray231[this.anInt4821] = local719.anIntArray231[local625];
						this.anIntArray236[this.anInt4821] = local719.anIntArray236[local625];
						this.anIntArray228[this.anInt4821] = local719.anIntArray228[local625];
						this.aByteArray39[this.anInt4821] = local719.aByteArray39[local625];
						this.aByteArray41[this.anInt4821] = local719.aByteArray41[local625];
						this.anIntArray227[this.anInt4821] = local719.anIntArray227[local625];
					}
					if (local771 == 2) {
						this.anIntArray233[this.anInt4821] = local719.anIntArray233[local625];
						this.anIntArray230[this.anInt4821] = local719.anIntArray230[local625];
					}
					this.anInt4821++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)[[I")
	public int[][] method4353() {
		@Pc(16) int[] local16 = new int[256];
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.aClass161Array1.length; local20++) {
			@Pc(28) int local28 = this.aClass161Array1[local20].anInt4865;
			if (local28 >= 0) {
				if (local18 < local28) {
					local18 = local28;
				}
				@Pc(42) int local42 = local16[local28]++;
			}
		}
		@Pc(56) int[][] local56 = new int[local18 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local18; local58++) {
			local56[local58] = new int[local16[local58]];
			local16[local58] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < this.aClass161Array1.length; local77++) {
			@Pc(85) int local85 = this.aClass161Array1[local77].anInt4865;
			if (local85 >= 0) {
				local56[local85][local16[local85]++] = local77;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BBSSSBZSSS)B")
	public byte method4355() {
		if (this.anInt4821 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray40[this.anInt4821] = 3;
		this.aShortArray63[this.anInt4821] = 0;
		this.aShortArray61[this.anInt4821] = 32767;
		this.aShortArray62[this.anInt4821] = 0;
		this.anIntArray231[this.anInt4821] = 1024;
		this.anIntArray236[this.anInt4821] = 1024;
		this.anIntArray228[this.anInt4821] = 1024;
		this.aByteArray39[this.anInt4821] = 0;
		this.aByteArray41[this.anInt4821] = 0;
		this.anIntArray227[this.anInt4821] = 0;
		return (byte) this.anInt4821++;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIII)V")
	public void method4357(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4804; local7++) {
			this.anIntArray229[local7] += arg1;
			this.anIntArray234[local7] += arg0;
			this.anIntArray235[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(II)V")
	public void method4358() {
		for (@Pc(11) int local11 = 0; local11 < this.anInt4804; local11++) {
			this.anIntArray229[local11] <<= 0x2;
			this.anIntArray234[local11] <<= 0x2;
			this.anIntArray235[local11] <<= 0x2;
		}
		if (this.anInt4821 <= 0 || this.anIntArray231 == null) {
			return;
		}
		for (@Pc(57) int local57 = 0; local57 < this.anIntArray231.length; local57++) {
			this.anIntArray231[local57] <<= 0x2;
			this.anIntArray236[local57] <<= 0x2;
			if (this.aByteArray40[local57] != 1) {
				this.anIntArray228[local57] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)[[I")
	public int[][] method4359() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt4810; local12++) {
			@Pc(19) int local19 = this.anIntArray232[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt4810; local76++) {
			@Pc(83) int local83 = this.anIntArray232[local76];
			if (local83 >= 0) {
				local51[local83][local8[local83]++] = local76;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(SSB)V")
	public void method4360(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray66 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anInt4810; local15++) {
			if (arg1 == this.aShortArray66[local15]) {
				this.aShortArray66[local15] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "([BI)V")
	private void method4361(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub8 local14 = new Class2_Sub8(arg0);
		@Pc(19) Class2_Sub8 local19 = new Class2_Sub8(arg0);
		@Pc(24) Class2_Sub8 local24 = new Class2_Sub8(arg0);
		@Pc(29) Class2_Sub8 local29 = new Class2_Sub8(arg0);
		@Pc(34) Class2_Sub8 local34 = new Class2_Sub8(arg0);
		local14.anInt5725 = arg0.length - 18;
		this.anInt4804 = local14.method5211();
		this.anInt4810 = local14.method5211();
		this.anInt4821 = local14.method5203();
		@Pc(59) int local59 = local14.method5203();
		@Pc(63) int local63 = local14.method5203();
		@Pc(67) int local67 = local14.method5203();
		@Pc(71) int local71 = local14.method5203();
		@Pc(75) int local75 = local14.method5203();
		@Pc(79) int local79 = local14.method5211();
		@Pc(83) int local83 = local14.method5211();
		@Pc(87) int local87 = local14.method5211();
		@Pc(91) int local91 = local14.method5211();
		@Pc(100) int local100 = this.anInt4804;
		@Pc(102) int local102 = local100;
		local100 += this.anInt4810;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt4810;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt4810;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt4810;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt4804;
		}
		@Pc(155) int local155 = local100;
		if (local67 == 1) {
			local100 += this.anInt4810;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt4810 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt4821 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		this.anIntArray229 = new int[this.anInt4804];
		if (local71 == 1) {
			this.anIntArray232 = new int[this.anInt4810];
		}
		if (local75 == 1) {
			this.anIntArray226 = new int[this.anInt4804];
		}
		this.aShortArray69 = new short[this.anInt4810];
		if (local59 == 1) {
			this.aByteArray38 = new byte[this.anInt4810];
			this.aByteArray44 = new byte[this.anInt4810];
			this.aShortArray66 = new short[this.anInt4810];
		}
		if (local67 == 1) {
			this.aByteArray42 = new byte[this.anInt4810];
		}
		this.aShortArray64 = new short[this.anInt4810];
		this.aShortArray68 = new short[this.anInt4810];
		if (local63 == 255) {
			this.aByteArray43 = new byte[this.anInt4810];
		} else {
			this.aByte75 = (byte) local63;
		}
		this.anIntArray234 = new int[this.anInt4804];
		this.anIntArray235 = new int[this.anInt4804];
		this.aShortArray67 = new short[this.anInt4810];
		if (this.anInt4821 > 0) {
			this.aByteArray40 = new byte[this.anInt4821];
			this.aShortArray62 = new short[this.anInt4821];
			this.aShortArray63 = new short[this.anInt4821];
			this.aShortArray61 = new short[this.anInt4821];
		}
		local14.anInt5725 = 0;
		local19.anInt5725 = local189;
		local24.anInt5725 = local195;
		local29.anInt5725 = local100;
		local34.anInt5725 = local143;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(357) int local357;
		@Pc(359) int local359;
		for (@Pc(351) int local351 = 0; local351 < this.anInt4804; local351++) {
			local357 = local14.method5203();
			local359 = 0;
			if ((local357 & 0x1) != 0) {
				local359 = local19.method5219();
			}
			@Pc(369) int local369 = 0;
			if ((local357 & 0x2) != 0) {
				local369 = local24.method5219();
			}
			@Pc(382) int local382 = 0;
			if ((local357 & 0x4) != 0) {
				local382 = local29.method5219();
			}
			this.anIntArray229[local351] = local359 + local345;
			this.anIntArray234[local351] = local347 + local369;
			this.anIntArray235[local351] = local349 + local382;
			local345 = this.anIntArray229[local351];
			local349 = this.anIntArray235[local351];
			local347 = this.anIntArray234[local351];
			if (local75 == 1) {
				this.anIntArray226[local351] = local34.method5203();
			}
		}
		local14.anInt5725 = local171;
		local19.anInt5725 = local133;
		local24.anInt5725 = local109;
		local29.anInt5725 = local155;
		local34.anInt5725 = local121;
		for (local357 = 0; local357 < this.anInt4810; local357++) {
			this.aShortArray67[local357] = (short) local14.method5211();
			if (local59 == 1) {
				local359 = local19.method5203();
				if ((local359 & 0x1) == 1) {
					local7 = true;
					this.aByteArray38[local357] = 1;
				} else {
					this.aByteArray38[local357] = 0;
				}
				if ((local359 & 0x2) == 2) {
					this.aByteArray44[local357] = (byte) (local359 >> 2);
					this.aShortArray66[local357] = this.aShortArray67[local357];
					this.aShortArray67[local357] = 127;
					if (this.aShortArray66[local357] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray44[local357] = -1;
					this.aShortArray66[local357] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray43[local357] = local24.method5175();
			}
			if (local67 == 1) {
				this.aByteArray42[local357] = local29.method5175();
			}
			if (local71 == 1) {
				this.anIntArray232[local357] = local34.method5203();
			}
		}
		this.anInt4817 = -1;
		local14.anInt5725 = local165;
		local19.anInt5725 = local102;
		@Pc(601) short local601 = 0;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(615) int local615;
		for (@Pc(609) int local609 = 0; local609 < this.anInt4810; local609++) {
			local615 = local19.method5203();
			if (local615 == 1) {
				local601 = (short) (local607 + local14.method5219());
				local603 = (short) (local601 + local14.method5219());
				local605 = (short) (local603 + local14.method5219());
				this.aShortArray68[local609] = local601;
				local607 = local605;
				this.aShortArray69[local609] = local603;
				this.aShortArray64[local609] = local605;
				if (local601 > this.anInt4817) {
					this.anInt4817 = local601;
				}
				if (this.anInt4817 < local603) {
					this.anInt4817 = local603;
				}
				if (local605 > this.anInt4817) {
					this.anInt4817 = local605;
				}
			}
			if (local615 == 2) {
				local603 = local605;
				local605 = (short) (local14.method5219() + local607);
				this.aShortArray68[local609] = local601;
				local607 = local605;
				this.aShortArray69[local609] = local603;
				this.aShortArray64[local609] = local605;
				if (local605 > this.anInt4817) {
					this.anInt4817 = local605;
				}
			}
			if (local615 == 3) {
				local601 = local605;
				local605 = (short) (local607 + local14.method5219());
				local607 = local605;
				this.aShortArray68[local609] = local601;
				this.aShortArray69[local609] = local603;
				this.aShortArray64[local609] = local605;
				if (this.anInt4817 < local605) {
					this.anInt4817 = local605;
				}
			}
			if (local615 == 4) {
				@Pc(776) short local776 = local601;
				local601 = local603;
				local605 = (short) (local607 + local14.method5219());
				local603 = local776;
				this.aShortArray68[local609] = local601;
				local607 = local605;
				this.aShortArray69[local609] = local776;
				this.aShortArray64[local609] = local605;
				if (this.anInt4817 < local605) {
					this.anInt4817 = local605;
				}
			}
		}
		this.anInt4817++;
		local14.anInt5725 = local180;
		for (local615 = 0; local615 < this.anInt4821; local615++) {
			this.aByteArray40[local615] = 0;
			this.aShortArray63[local615] = (short) local14.method5211();
			this.aShortArray61[local615] = (short) local14.method5211();
			this.aShortArray62[local615] = (short) local14.method5211();
		}
		if (this.aByteArray44 != null) {
			@Pc(876) boolean local876 = false;
			for (@Pc(878) int local878 = 0; local878 < this.anInt4810; local878++) {
				@Pc(887) int local887 = this.aByteArray44[local878] & 0xFF;
				if (local887 != 255) {
					if (this.aShortArray68[local878] == (this.aShortArray63[local887] & 0xFFFF) && this.aShortArray69[local878] == (this.aShortArray61[local887] & 0xFFFF) && (this.aShortArray62[local887] & 0xFFFF) == this.aShortArray64[local878]) {
						this.aByteArray44[local878] = -1;
					} else {
						local876 = true;
					}
				}
			}
			if (!local876) {
				this.aByteArray44 = null;
			}
		}
		if (!local9) {
			this.aShortArray66 = null;
		}
		if (!local7) {
			this.aByteArray38 = null;
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(SLclient!ida;BI)I")
	private int method4363(@OriginalArg(0) short arg0, @OriginalArg(1) Class159 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray229[arg2];
		@Pc(15) int local15 = arg1.anIntArray234[arg2];
		@Pc(28) int local28 = arg1.anIntArray235[arg2];
		for (@Pc(30) int local30 = 0; local30 < this.anInt4804; local30++) {
			if (this.anIntArray229[local30] == local10 && this.anIntArray234[local30] == local15 && local28 == this.anIntArray235[local30]) {
				this.aShortArray65[local30] |= arg0;
				return local30;
			}
		}
		this.anIntArray229[this.anInt4804] = local10;
		this.anIntArray234[this.anInt4804] = local15;
		this.anIntArray235[this.anInt4804] = local28;
		this.aShortArray65[this.anInt4804] = arg0;
		this.anIntArray226[this.anInt4804] = arg1.anIntArray226 == null ? -1 : arg1.anIntArray226[arg2];
		return this.anInt4804++;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ISS)V")
	public void method4364(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4810; local7++) {
			if (arg0 == this.aShortArray67[local7]) {
				this.aShortArray67[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(ZB)[[I")
	public int[][] method4365(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt4804 : this.anInt4817;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray226[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local27 > local10) {
					local10 = local27;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < local18; local76++) {
			@Pc(83) int local83 = this.anIntArray226[local76];
			if (local83 >= 0) {
				local50[local83][local8[local83]++] = local76;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(IIII)V")
	public void method4366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(20) int local20;
		@Pc(38) int local38;
		if (arg1 != 0) {
			local14 = Class12_Sub2.anIntArray204[arg1];
			local18 = Class12_Sub2.anIntArray203[arg1];
			for (local20 = 0; local20 < this.anInt4804; local20++) {
				local38 = local18 * this.anIntArray229[local20] + this.anIntArray234[local20] * local14 >> 14;
				this.anIntArray234[local20] = local18 * this.anIntArray234[local20] - this.anIntArray229[local20] * local14 >> 14;
				this.anIntArray229[local20] = local38;
			}
		}
		if (arg2 != 0) {
			local14 = Class12_Sub2.anIntArray204[arg2];
			local18 = Class12_Sub2.anIntArray203[arg2];
			for (local20 = 0; local20 < this.anInt4804; local20++) {
				local38 = local18 * this.anIntArray234[local20] - local14 * this.anIntArray235[local20] >> 14;
				this.anIntArray235[local20] = this.anIntArray235[local20] * local18 + this.anIntArray234[local20] * local14 >> 14;
				this.anIntArray234[local20] = local38;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local14 = Class12_Sub2.anIntArray204[arg0];
		local18 = Class12_Sub2.anIntArray203[arg0];
		for (local20 = 0; local20 < this.anInt4804; local20++) {
			local38 = local14 * this.anIntArray235[local20] + local18 * this.anIntArray229[local20] >> 14;
			this.anIntArray235[local20] = local18 * this.anIntArray235[local20] - this.anIntArray229[local20] * local14 >> 14;
			this.anIntArray229[local20] = local38;
		}
	}

	@OriginalMember(owner = "client!ida", name = "c", descriptor = "(IIII)I")
	public int method4367(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4804; local7++) {
			if (arg2 == this.anIntArray229[local7] && this.anIntArray234[local7] == arg1 && this.anIntArray235[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray229[this.anInt4804] = arg2;
		this.anIntArray234[this.anInt4804] = arg1;
		this.anIntArray235[this.anInt4804] = arg0;
		this.anInt4817 = this.anInt4804 + 1;
		return this.anInt4804++;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIBBZISSB)I")
	public int method4368(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray68[this.anInt4810] = (short) arg0;
		this.aShortArray69[this.anInt4810] = (short) arg1;
		this.aShortArray64[this.anInt4810] = (short) arg4;
		this.aByteArray38[this.anInt4810] = arg2;
		this.aByteArray44[this.anInt4810] = arg3;
		this.aShortArray67[this.anInt4810] = arg6;
		this.aByteArray42[this.anInt4810] = arg7;
		this.aShortArray66[this.anInt4810] = arg5;
		return this.anInt4810++;
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(I[B)V")
	private void method4369(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class2_Sub8 local10 = new Class2_Sub8(arg0);
		@Pc(15) Class2_Sub8 local15 = new Class2_Sub8(arg0);
		@Pc(20) Class2_Sub8 local20 = new Class2_Sub8(arg0);
		@Pc(25) Class2_Sub8 local25 = new Class2_Sub8(arg0);
		@Pc(30) Class2_Sub8 local30 = new Class2_Sub8(arg0);
		@Pc(35) Class2_Sub8 local35 = new Class2_Sub8(arg0);
		@Pc(40) Class2_Sub8 local40 = new Class2_Sub8(arg0);
		local10.anInt5725 = arg0.length - 23;
		this.anInt4804 = local10.method5211();
		this.anInt4810 = local10.method5211();
		this.anInt4821 = local10.method5203();
		@Pc(65) int local65 = local10.method5203();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(92) boolean local92 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt5725 -= 7;
			this.anInt4809 = local10.method5203();
			local10.anInt5725 += 6;
		}
		@Pc(126) int local126 = local10.method5203();
		@Pc(130) int local130 = local10.method5203();
		@Pc(134) int local134 = local10.method5203();
		@Pc(138) int local138 = local10.method5203();
		@Pc(142) int local142 = local10.method5203();
		@Pc(146) int local146 = local10.method5211();
		@Pc(150) int local150 = local10.method5211();
		@Pc(154) int local154 = local10.method5211();
		@Pc(158) int local158 = local10.method5211();
		@Pc(162) int local162 = local10.method5211();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(181) int local181;
		if (this.anInt4821 > 0) {
			local10.anInt5725 = 0;
			this.aByteArray40 = new byte[this.anInt4821];
			for (local181 = 0; local181 < this.anInt4821; local181++) {
				@Pc(192) byte local192 = this.aByteArray40[local181] = local10.method5175();
				if (local192 >= 1 && local192 <= 3) {
					local166++;
				}
				if (local192 == 2) {
					local168++;
				}
				if (local192 == 0) {
					local164++;
				}
			}
		}
		local181 = this.anInt4821;
		@Pc(220) int local220 = local181;
		local181 += this.anInt4804;
		@Pc(227) int local227 = local181;
		if (local74) {
			local181 += this.anInt4810;
		}
		@Pc(236) int local236 = local181;
		local181 += this.anInt4810;
		@Pc(243) int local243 = local181;
		if (local126 == 255) {
			local181 += this.anInt4810;
		}
		@Pc(253) int local253 = local181;
		if (local134 == 1) {
			local181 += this.anInt4810;
		}
		@Pc(265) int local265 = local181;
		if (local142 == 1) {
			local181 += this.anInt4804;
		}
		@Pc(275) int local275 = local181;
		if (local130 == 1) {
			local181 += this.anInt4810;
		}
		@Pc(285) int local285 = local181;
		local181 += local158;
		@Pc(291) int local291 = local181;
		if (local138 == 1) {
			local181 += this.anInt4810 * 2;
		}
		@Pc(305) int local305 = local181;
		local181 += local162;
		@Pc(311) int local311 = local181;
		local181 += this.anInt4810 * 2;
		@Pc(320) int local320 = local181;
		local181 += local146;
		@Pc(326) int local326 = local181;
		local181 += local150;
		@Pc(332) int local332 = local181;
		local181 += local154;
		@Pc(338) int local338 = local181;
		local181 += local164 * 6;
		@Pc(346) int local346 = local181;
		local181 += local166 * 6;
		@Pc(354) byte local354 = 6;
		if (this.anInt4809 == 14) {
			local354 = 7;
		} else if (this.anInt4809 >= 15) {
			local354 = 9;
		}
		@Pc(372) int local372 = local181;
		local181 += local166 * local354;
		@Pc(380) int local380 = local181;
		local181 += local166;
		@Pc(386) int local386 = local181;
		local181 += local166;
		@Pc(392) int local392 = local181;
		local181 += local168 * 2 + local166;
		this.anIntArray234 = new int[this.anInt4804];
		this.aShortArray69 = new short[this.anInt4810];
		if (local134 == 1) {
			this.anIntArray232 = new int[this.anInt4810];
		}
		if (local138 == 1) {
			this.aShortArray66 = new short[this.anInt4810];
		}
		if (local74) {
			this.aByteArray38 = new byte[this.anInt4810];
		}
		this.anIntArray229 = new int[this.anInt4804];
		this.anIntArray235 = new int[this.anInt4804];
		local10.anInt5725 = local220;
		if (local130 == 1) {
			this.aByteArray42 = new byte[this.anInt4810];
		}
		if (this.anInt4821 > 0) {
			this.aShortArray62 = new short[this.anInt4821];
			this.aShortArray63 = new short[this.anInt4821];
			if (local168 > 0) {
				this.anIntArray233 = new int[local168];
				this.anIntArray230 = new int[local168];
			}
			this.aShortArray61 = new short[this.anInt4821];
			if (local166 > 0) {
				this.anIntArray228 = new int[local166];
				this.anIntArray236 = new int[local166];
				this.aByteArray41 = new byte[local166];
				this.aByteArray39 = new byte[local166];
				this.anIntArray231 = new int[local166];
				this.anIntArray227 = new int[local166];
			}
		}
		if (local142 == 1) {
			this.anIntArray226 = new int[this.anInt4804];
		}
		this.aShortArray64 = new short[this.anInt4810];
		this.aShortArray68 = new short[this.anInt4810];
		if (local126 == 255) {
			this.aByteArray43 = new byte[this.anInt4810];
		} else {
			this.aByte75 = (byte) local126;
		}
		this.aShortArray67 = new short[this.anInt4810];
		if (local138 == 1 && this.anInt4821 > 0) {
			this.aByteArray44 = new byte[this.anInt4810];
		}
		local15.anInt5725 = local320;
		local20.anInt5725 = local326;
		local25.anInt5725 = local332;
		local30.anInt5725 = local265;
		@Pc(583) int local583 = 0;
		@Pc(585) int local585 = 0;
		@Pc(587) int local587 = 0;
		@Pc(595) int local595;
		for (@Pc(589) int local589 = 0; local589 < this.anInt4804; local589++) {
			local595 = local10.method5203();
			@Pc(597) int local597 = 0;
			if ((local595 & 0x1) != 0) {
				local597 = local15.method5219();
			}
			@Pc(610) int local610 = 0;
			if ((local595 & 0x2) != 0) {
				local610 = local20.method5219();
			}
			@Pc(620) int local620 = 0;
			if ((local595 & 0x4) != 0) {
				local620 = local25.method5219();
			}
			this.anIntArray229[local589] = local597 + local583;
			this.anIntArray234[local589] = local585 + local610;
			this.anIntArray235[local589] = local620 + local587;
			local583 = this.anIntArray229[local589];
			local587 = this.anIntArray235[local589];
			local585 = this.anIntArray234[local589];
			if (local142 == 1) {
				this.anIntArray226[local589] = local30.method5203();
			}
		}
		local10.anInt5725 = local311;
		local15.anInt5725 = local227;
		local20.anInt5725 = local243;
		local25.anInt5725 = local275;
		local30.anInt5725 = local253;
		local35.anInt5725 = local291;
		local40.anInt5725 = local305;
		for (local595 = 0; local595 < this.anInt4810; local595++) {
			this.aShortArray67[local595] = (short) local10.method5211();
			if (local74) {
				this.aByteArray38[local595] = local15.method5175();
			}
			if (local126 == 255) {
				this.aByteArray43[local595] = local20.method5175();
			}
			if (local130 == 1) {
				this.aByteArray42[local595] = local25.method5175();
			}
			if (local134 == 1) {
				this.anIntArray232[local595] = local30.method5203();
			}
			if (local138 == 1) {
				this.aShortArray66[local595] = (short) (local35.method5211() - 1);
			}
			if (this.aByteArray44 != null) {
				if (this.aShortArray66[local595] == -1) {
					this.aByteArray44[local595] = -1;
				} else {
					this.aByteArray44[local595] = (byte) (local40.method5203() - 1);
				}
			}
		}
		this.anInt4817 = -1;
		local10.anInt5725 = local285;
		local15.anInt5725 = local236;
		@Pc(822) short local822 = 0;
		@Pc(824) short local824 = 0;
		@Pc(826) short local826 = 0;
		@Pc(828) short local828 = 0;
		@Pc(836) int local836;
		for (@Pc(830) int local830 = 0; local830 < this.anInt4810; local830++) {
			local836 = local15.method5203();
			if (local836 == 1) {
				local822 = (short) (local10.method5219() + local828);
				local824 = (short) (local10.method5219() + local822);
				local826 = (short) (local824 + local10.method5219());
				this.aShortArray68[local830] = local822;
				local828 = local826;
				this.aShortArray69[local830] = local824;
				this.aShortArray64[local830] = local826;
				if (this.anInt4817 < local822) {
					this.anInt4817 = local822;
				}
				if (this.anInt4817 < local824) {
					this.anInt4817 = local824;
				}
				if (this.anInt4817 < local826) {
					this.anInt4817 = local826;
				}
			}
			if (local836 == 2) {
				local824 = local826;
				local826 = (short) (local10.method5219() + local828);
				local828 = local826;
				this.aShortArray68[local830] = local822;
				this.aShortArray69[local830] = local824;
				this.aShortArray64[local830] = local826;
				if (local826 > this.anInt4817) {
					this.anInt4817 = local826;
				}
			}
			if (local836 == 3) {
				local822 = local826;
				local826 = (short) (local10.method5219() + local828);
				this.aShortArray68[local830] = local822;
				local828 = local826;
				this.aShortArray69[local830] = local824;
				this.aShortArray64[local830] = local826;
				if (this.anInt4817 < local826) {
					this.anInt4817 = local826;
				}
			}
			if (local836 == 4) {
				@Pc(989) short local989 = local822;
				local822 = local824;
				local824 = local989;
				local826 = (short) (local10.method5219() + local828);
				local828 = local826;
				this.aShortArray68[local830] = local822;
				this.aShortArray69[local830] = local989;
				this.aShortArray64[local830] = local826;
				if (local826 > this.anInt4817) {
					this.anInt4817 = local826;
				}
			}
		}
		this.anInt4817++;
		local10.anInt5725 = local338;
		local15.anInt5725 = local346;
		local20.anInt5725 = local372;
		local25.anInt5725 = local380;
		local30.anInt5725 = local386;
		local35.anInt5725 = local392;
		@Pc(1064) int local1064;
		for (local836 = 0; local836 < this.anInt4821; local836++) {
			local1064 = this.aByteArray40[local836] & 0xFF;
			if (local1064 == 0) {
				this.aShortArray63[local836] = (short) local10.method5211();
				this.aShortArray61[local836] = (short) local10.method5211();
				this.aShortArray62[local836] = (short) local10.method5211();
			}
			if (local1064 == 1) {
				this.aShortArray63[local836] = (short) local15.method5211();
				this.aShortArray61[local836] = (short) local15.method5211();
				this.aShortArray62[local836] = (short) local15.method5211();
				if (this.anInt4809 < 15) {
					this.anIntArray231[local836] = local20.method5211();
					if (this.anInt4809 >= 14) {
						this.anIntArray236[local836] = local20.method5161();
					} else {
						this.anIntArray236[local836] = local20.method5211();
					}
					this.anIntArray228[local836] = local20.method5211();
				} else {
					this.anIntArray231[local836] = local20.method5161();
					this.anIntArray236[local836] = local20.method5161();
					this.anIntArray228[local836] = local20.method5161();
				}
				this.aByteArray39[local836] = local25.method5175();
				this.aByteArray41[local836] = local30.method5175();
				this.anIntArray227[local836] = local35.method5175();
			}
			if (local1064 == 2) {
				this.aShortArray63[local836] = (short) local15.method5211();
				this.aShortArray61[local836] = (short) local15.method5211();
				this.aShortArray62[local836] = (short) local15.method5211();
				if (this.anInt4809 < 15) {
					this.anIntArray231[local836] = local20.method5211();
					if (this.anInt4809 < 14) {
						this.anIntArray236[local836] = local20.method5211();
					} else {
						this.anIntArray236[local836] = local20.method5161();
					}
					this.anIntArray228[local836] = local20.method5211();
				} else {
					this.anIntArray231[local836] = local20.method5161();
					this.anIntArray236[local836] = local20.method5161();
					this.anIntArray228[local836] = local20.method5161();
				}
				this.aByteArray39[local836] = local25.method5175();
				this.aByteArray41[local836] = local30.method5175();
				this.anIntArray227[local836] = local35.method5175();
				this.anIntArray233[local836] = local35.method5175();
				this.anIntArray230[local836] = local35.method5175();
			}
			if (local1064 == 3) {
				this.aShortArray63[local836] = (short) local15.method5211();
				this.aShortArray61[local836] = (short) local15.method5211();
				this.aShortArray62[local836] = (short) local15.method5211();
				if (this.anInt4809 >= 15) {
					this.anIntArray231[local836] = local20.method5161();
					this.anIntArray236[local836] = local20.method5161();
					this.anIntArray228[local836] = local20.method5161();
				} else {
					this.anIntArray231[local836] = local20.method5211();
					if (this.anInt4809 >= 14) {
						this.anIntArray236[local836] = local20.method5161();
					} else {
						this.anIntArray236[local836] = local20.method5211();
					}
					this.anIntArray228[local836] = local20.method5211();
				}
				this.aByteArray39[local836] = local25.method5175();
				this.aByteArray41[local836] = local30.method5175();
				this.anIntArray227[local836] = local35.method5175();
			}
		}
		local10.anInt5725 = local181;
		@Pc(1472) int local1472;
		@Pc(1478) int local1478;
		@Pc(1482) int local1482;
		@Pc(1545) int local1545;
		if (local83) {
			local1064 = local10.method5203();
			if (local1064 > 0) {
				this.aClass283Array3 = new Class283[local1064];
				for (local1472 = 0; local1472 < local1064; local1472++) {
					local1478 = local10.method5211();
					local1482 = local10.method5211();
					@Pc(1490) byte local1490;
					if (local126 == 255) {
						local1490 = this.aByteArray43[local1482];
					} else {
						local1490 = (byte) local126;
					}
					this.aClass283Array3[local1472] = new Class283(local1478, this.aShortArray68[local1482], this.aShortArray69[local1482], this.aShortArray64[local1482], local1490);
				}
			}
			local1472 = local10.method5203();
			if (local1472 > 0) {
				this.aClass123Array3 = new Class123[local1472];
				for (local1478 = 0; local1478 < local1472; local1478++) {
					local1482 = local10.method5211();
					local1545 = local10.method5211();
					this.aClass123Array3[local1478] = new Class123(local1482, local1545);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1064 = local10.method5203();
		if (local1064 <= 0) {
			return;
		}
		this.aClass161Array1 = new Class161[local1064];
		for (local1472 = 0; local1472 < local1064; local1472++) {
			local1478 = local10.method5211();
			local1482 = local10.method5211();
			local1545 = local10.method5203();
			@Pc(1593) byte local1593 = local10.method5175();
			this.aClass161Array1[local1472] = new Class161(local1478, local1482, local1545, local1593);
		}
		return;
	}
}
