import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class156 {

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "[I")
	public int[] anIntArray220;

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "[Lclient!ol;")
	public Class261[] aClass261Array1;

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "[S")
	public short[] aShortArray50;

	@OriginalMember(owner = "client!hm", name = "g", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!hm", name = "h", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!hm", name = "i", descriptor = "[B")
	public byte[] aByteArray32;

	@OriginalMember(owner = "client!hm", name = "m", descriptor = "[I")
	public int[] anIntArray223;

	@OriginalMember(owner = "client!hm", name = "o", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!hm", name = "p", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!hm", name = "q", descriptor = "[I")
	public int[] anIntArray224;

	@OriginalMember(owner = "client!hm", name = "t", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!hm", name = "v", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!hm", name = "A", descriptor = "[I")
	public int[] anIntArray225;

	@OriginalMember(owner = "client!hm", name = "D", descriptor = "[I")
	public int[] anIntArray226;

	@OriginalMember(owner = "client!hm", name = "F", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!hm", name = "I", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "[Lclient!nha;")
	public Class244[] aClass244Array3;

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "[B")
	public byte[] aByteArray37;

	@OriginalMember(owner = "client!hm", name = "T", descriptor = "[I")
	public int[] anIntArray227;

	@OriginalMember(owner = "client!hm", name = "U", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!hm", name = "V", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!hm", name = "W", descriptor = "[I")
	public int[] anIntArray228;

	@OriginalMember(owner = "client!hm", name = "X", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!hm", name = "Y", descriptor = "[I")
	public int[] anIntArray229;

	@OriginalMember(owner = "client!hm", name = "Z", descriptor = "[I")
	public int[] anIntArray230;

	@OriginalMember(owner = "client!hm", name = "ab", descriptor = "[Lclient!rf;")
	public Class303[] aClass303Array3;

	@OriginalMember(owner = "client!hm", name = "bb", descriptor = "[I")
	public int[] anIntArray231;

	@OriginalMember(owner = "client!hm", name = "cb", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!hm", name = "db", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!hm", name = "C", descriptor = "B")
	public byte aByte45 = 0;

	@OriginalMember(owner = "client!hm", name = "x", descriptor = "I")
	public int anInt3700 = 0;

	@OriginalMember(owner = "client!hm", name = "r", descriptor = "I")
	public int anInt3696 = 12;

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
	public int anInt3708 = 0;

	@OriginalMember(owner = "client!hm", name = "J", descriptor = "I")
	public int anInt3706 = 0;

	@OriginalMember(owner = "client!hm", name = "K", descriptor = "I")
	public int anInt3707 = 0;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
	private Class156() {
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([B)V")
	public Class156(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3282(arg0);
		} else {
			this.method3284(arg0);
		}
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(III)V")
	public Class156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray57 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray32 = new byte[arg2];
			this.anIntArray229 = new int[arg2];
			this.aByteArray33 = new byte[arg2];
			this.anIntArray230 = new int[arg2];
			this.anIntArray224 = new int[arg2];
			this.anIntArray228 = new int[arg2];
			this.aByteArray38 = new byte[arg2];
			this.aShortArray53 = new short[arg2];
			this.anIntArray220 = new int[arg2];
			this.aShortArray50 = new short[arg2];
			this.anIntArray221 = new int[arg2];
			this.aShortArray54 = new short[arg2];
		}
		this.anIntArray226 = new int[arg0];
		this.aByteArray34 = new byte[arg1];
		this.anIntArray227 = new int[arg0];
		this.aByteArray36 = new byte[arg1];
		this.anIntArray225 = new int[arg1];
		this.aByteArray35 = new byte[arg1];
		this.anIntArray231 = new int[arg0];
		this.aByteArray37 = new byte[arg1];
		this.aShortArray51 = new short[arg1];
		this.aShortArray58 = new short[arg1];
		this.aShortArray56 = new short[arg1];
		this.aShortArray55 = new short[arg1];
		this.anIntArray223 = new int[arg0];
	}

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "([Lclient!hm;I)V")
	public Class156(@OriginalArg(0) Class156[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3708 = 0;
		this.anInt3700 = 0;
		this.anInt3706 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte45 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class156 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt3708 += local56.anInt3708;
				this.anInt3700 += local56.anInt3700;
				this.anInt3706 += local56.anInt3706;
				if (local56.aClass244Array3 != null) {
					local30 += local56.aClass244Array3.length;
				}
				if (local56.aClass303Array3 != null) {
					local32 += local56.aClass303Array3.length;
				}
				if (local56.aClass261Array1 != null) {
					local34 += local56.aClass261Array1.length;
				}
				local36 |= local56.aByteArray37 != null;
				local40 |= local56.aByteArray34 != null;
				if (local56.aByteArray35 == null) {
					if (this.aByte45 == -1) {
						this.aByte45 = local56.aByte45;
					}
					if (this.aByte45 != local56.aByte45) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local42 |= local56.aByteArray36 != null;
				local46 |= local56.anIntArray225 != null;
				local44 |= local56.aShortArray58 != null;
			}
		}
		this.aShortArray56 = new short[this.anInt3706];
		this.aShortArray57 = new short[this.anInt3706];
		if (local36) {
			this.aByteArray37 = new byte[this.anInt3706];
		}
		if (this.anInt3700 > 0) {
			this.anIntArray228 = new int[this.anInt3700];
			this.anIntArray230 = new int[this.anInt3700];
			this.aShortArray54 = new short[this.anInt3700];
			this.anIntArray221 = new int[this.anInt3700];
			this.anIntArray224 = new int[this.anInt3700];
			this.anIntArray229 = new int[this.anInt3700];
			this.anIntArray220 = new int[this.anInt3700];
			this.aByteArray38 = new byte[this.anInt3700];
			this.aByteArray32 = new byte[this.anInt3700];
			this.aShortArray53 = new short[this.anInt3700];
			this.aByteArray33 = new byte[this.anInt3700];
			this.aShortArray50 = new short[this.anInt3700];
		}
		if (local44) {
			this.aShortArray58 = new short[this.anInt3706];
		}
		this.anIntArray227 = new int[this.anInt3708];
		if (local40) {
			this.aByteArray34 = new byte[this.anInt3706];
		}
		this.anIntArray231 = new int[this.anInt3708];
		this.aShortArray52 = new short[this.anInt3708];
		this.aShortArray55 = new short[this.anInt3706];
		if (local38) {
			this.aByteArray35 = new byte[this.anInt3706];
		}
		if (local46) {
			this.anIntArray225 = new int[this.anInt3706];
		}
		if (local30 > 0) {
			this.aClass244Array3 = new Class244[local30];
		}
		this.aShortArray49 = new short[this.anInt3706];
		this.anIntArray226 = new int[this.anInt3708];
		if (local42) {
			this.aByteArray36 = new byte[this.anInt3706];
		}
		if (local32 > 0) {
			this.aClass303Array3 = new Class303[local32];
		}
		this.aShortArray51 = new short[this.anInt3706];
		if (local34 > 0) {
			this.aClass261Array1 = new Class261[local34];
		}
		this.anIntArray223 = new int[this.anInt3708];
		local34 = 0;
		local30 = 0;
		local32 = 0;
		this.anInt3700 = 0;
		this.anInt3708 = 0;
		this.anInt3706 = 0;
		@Pc(612) int local612;
		@Pc(623) int local623;
		for (@Pc(383) int local383 = 0; local383 < arg1; local383++) {
			@Pc(389) short local389 = (short) (0x1 << local383);
			@Pc(393) Class156 local393 = arg0[local383];
			if (local393 != null) {
				@Pc(400) int local400;
				if (local393.aClass261Array1 != null) {
					for (local400 = 0; local400 < local393.aClass261Array1.length; local400++) {
						@Pc(406) Class261 local406 = local393.aClass261Array1[local400];
						this.aClass261Array1[local34++] = local406.method6454(this.anInt3706 + local406.anInt7575);
					}
				}
				for (local400 = 0; local400 < local393.anInt3706; local400++) {
					if (local36 && local393.aByteArray37 != null) {
						this.aByteArray37[this.anInt3706] = local393.aByteArray37[local400];
					}
					if (local38) {
						if (local393.aByteArray35 == null) {
							this.aByteArray35[this.anInt3706] = local393.aByte45;
						} else {
							this.aByteArray35[this.anInt3706] = local393.aByteArray35[local400];
						}
					}
					if (local40 && local393.aByteArray34 != null) {
						this.aByteArray34[this.anInt3706] = local393.aByteArray34[local400];
					}
					if (local44) {
						if (local393.aShortArray58 == null) {
							this.aShortArray58[this.anInt3706] = -1;
						} else {
							this.aShortArray58[this.anInt3706] = local393.aShortArray58[local400];
						}
					}
					if (local46) {
						if (local393.anIntArray225 == null) {
							this.anIntArray225[this.anInt3706] = -1;
						} else {
							this.anIntArray225[this.anInt3706] = local393.anIntArray225[local400];
						}
					}
					this.aShortArray56[this.anInt3706] = (short) this.method3287(local389, local393.aShortArray56[local400], local393);
					this.aShortArray57[this.anInt3706] = (short) this.method3287(local389, local393.aShortArray57[local400], local393);
					this.aShortArray51[this.anInt3706] = (short) this.method3287(local389, local393.aShortArray51[local400], local393);
					this.aShortArray49[this.anInt3706] = local389;
					this.aShortArray55[this.anInt3706] = local393.aShortArray55[local400];
					this.anInt3706++;
				}
				@Pc(600) int local600;
				if (local393.aClass244Array3 != null) {
					for (local600 = 0; local600 < local393.aClass244Array3.length; local600++) {
						local612 = this.method3287(local389, local393.aClass244Array3[local600].anInt6819, local393);
						local623 = this.method3287(local389, local393.aClass244Array3[local600].anInt6816, local393);
						@Pc(634) int local634 = this.method3287(local389, local393.aClass244Array3[local600].anInt6817, local393);
						this.aClass244Array3[local30] = local393.aClass244Array3[local600].method5737(local634, local612, local623);
						local30++;
					}
				}
				if (local393.aClass303Array3 != null) {
					for (local600 = 0; local600 < local393.aClass303Array3.length; local600++) {
						local612 = this.method3287(local389, local393.aClass303Array3[local600].anInt8513, local393);
						this.aClass303Array3[local32] = local393.aClass303Array3[local600].method7245(local612);
						local32++;
					}
				}
			}
		}
		this.anInt3707 = this.anInt3708;
		@Pc(707) int local707 = 0;
		for (@Pc(709) int local709 = 0; local709 < arg1; local709++) {
			@Pc(715) short local715 = (short) (0x1 << local709);
			@Pc(719) Class156 local719 = arg0[local709];
			if (local719 != null) {
				for (local612 = 0; local612 < local719.anInt3706; local612++) {
					if (local42) {
						this.aByteArray36[local707++] = (byte) (local719.aByteArray36 == null || local719.aByteArray36[local612] == -1 ? -1 : local719.aByteArray36[local612] + this.anInt3700);
					}
				}
				for (local623 = 0; local623 < local719.anInt3700; local623++) {
					@Pc(769) byte local769 = this.aByteArray33[this.anInt3700] = local719.aByteArray33[local623];
					if (local769 == 0) {
						this.aShortArray50[this.anInt3700] = (short) this.method3287(local715, local719.aShortArray50[local623], local719);
						this.aShortArray53[this.anInt3700] = (short) this.method3287(local715, local719.aShortArray53[local623], local719);
						this.aShortArray54[this.anInt3700] = (short) this.method3287(local715, local719.aShortArray54[local623], local719);
					}
					if (local769 >= 1 && local769 <= 3) {
						this.aShortArray50[this.anInt3700] = local719.aShortArray50[local623];
						this.aShortArray53[this.anInt3700] = local719.aShortArray53[local623];
						this.aShortArray54[this.anInt3700] = local719.aShortArray54[local623];
						this.anIntArray229[this.anInt3700] = local719.anIntArray229[local623];
						this.anIntArray230[this.anInt3700] = local719.anIntArray230[local623];
						this.anIntArray224[this.anInt3700] = local719.anIntArray224[local623];
						this.aByteArray38[this.anInt3700] = local719.aByteArray38[local623];
						this.aByteArray32[this.anInt3700] = local719.aByteArray32[local623];
						this.anIntArray221[this.anInt3700] = local719.anIntArray221[local623];
					}
					if (local769 == 2) {
						this.anIntArray228[this.anInt3700] = local719.anIntArray228[local623];
						this.anIntArray220[this.anInt3700] = local719.anIntArray220[local623];
					}
					this.anInt3700++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BSS)V")
	public void method3271(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3706; local1++) {
			if (this.aShortArray55[local1] == arg1) {
				this.aShortArray55[local1] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(SSBBSBSSSI)B")
	public byte method3272() {
		if (this.anInt3700 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray33[this.anInt3700] = 3;
		this.aShortArray50[this.anInt3700] = 0;
		this.aShortArray53[this.anInt3700] = 32767;
		this.aShortArray54[this.anInt3700] = 0;
		this.anIntArray229[this.anInt3700] = 1024;
		this.anIntArray230[this.anInt3700] = 1024;
		this.anIntArray224[this.anInt3700] = 1024;
		this.aByteArray38[this.anInt3700] = 0;
		this.aByteArray32[this.anInt3700] = 0;
		this.anIntArray221[this.anInt3700] = 0;
		return (byte) this.anInt3700++;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)[[I")
	public int[][] method3273() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3706; local12++) {
			@Pc(19) int local19 = this.anIntArray225[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(37) int local37 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(76) int local76 = 0; local76 < this.anInt3706; local76++) {
			@Pc(83) int local83 = this.anIntArray225[local76];
			if (local83 >= 0) {
				local50[local83][local8[local83]++] = local76;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIII)V")
	public void method3274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3708; local1++) {
			this.anIntArray227[local1] += arg2;
			this.anIntArray231[local1] += arg1;
			this.anIntArray223[local1] += arg0;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public void method3275() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt3708; local9++) {
			this.anIntArray227[local9] <<= 0x2;
			this.anIntArray231[local9] <<= 0x2;
			this.anIntArray223[local9] <<= 0x2;
		}
		if (this.anInt3700 <= 0 || this.anIntArray229 == null) {
			return;
		}
		for (@Pc(54) int local54 = 0; local54 < this.anIntArray229.length; local54++) {
			this.anIntArray229[local54] <<= 0x2;
			this.anIntArray230[local54] <<= 0x2;
			if (this.aByteArray33[local54] != 1) {
				this.anIntArray224[local54] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(IIII)V")
	public void method3278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(15) int local15;
		@Pc(32) int local32;
		if (arg0 != 0) {
			local9 = Class242.anIntArray384[arg0];
			local13 = Class242.anIntArray383[arg0];
			for (local15 = 0; local15 < this.anInt3708; local15++) {
				local32 = this.anIntArray227[local15] * local13 + local9 * this.anIntArray231[local15] >> 14;
				this.anIntArray231[local15] = local13 * this.anIntArray231[local15] - this.anIntArray227[local15] * local9 >> 14;
				this.anIntArray227[local15] = local32;
			}
		}
		if (arg1 != 0) {
			local9 = Class242.anIntArray384[arg1];
			local13 = Class242.anIntArray383[arg1];
			for (local15 = 0; local15 < this.anInt3708; local15++) {
				local32 = local13 * this.anIntArray231[local15] - local9 * this.anIntArray223[local15] >> 14;
				this.anIntArray223[local15] = this.anIntArray231[local15] * local9 + this.anIntArray223[local15] * local13 >> 14;
				this.anIntArray231[local15] = local32;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local9 = Class242.anIntArray384[arg2];
		local13 = Class242.anIntArray383[arg2];
		for (local15 = 0; local15 < this.anInt3708; local15++) {
			local32 = this.anIntArray227[local15] * local13 + local9 * this.anIntArray223[local15] >> 14;
			this.anIntArray223[local15] = local13 * this.anIntArray223[local15] - local9 * this.anIntArray227[local15] >> 14;
			this.anIntArray227[local15] = local32;
		}
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(B)[[I")
	public int[][] method3279() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass261Array1.length; local12++) {
			@Pc(28) int local28 = this.aClass261Array1[local12].anInt7578;
			if (local28 >= 0) {
				if (local28 > local10) {
					local10 = local28;
				}
				@Pc(43) int local43 = local8[local28]++;
			}
		}
		@Pc(61) int[][] local61 = new int[local10 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local10; local63++) {
			local61[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.aClass261Array1.length; local82++) {
			@Pc(90) int local90 = this.aClass261Array1[local82].anInt7578;
			if (local90 >= 0) {
				local61[local90][local8[local90]++] = local82;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZI)[[I")
	public int[][] method3281(@OriginalArg(0) boolean arg0) {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		@Pc(24) int local24 = arg0 ? this.anInt3708 : this.anInt3707;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(33) int local33 = this.anIntArray226[local26];
			if (local33 >= 0) {
				if (local33 > local16) {
					local16 = local33;
				}
				@Pc(44) int local44 = local14[local33]++;
			}
		}
		@Pc(56) int[][] local56 = new int[local16 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local16; local58++) {
			local56[local58] = new int[local14[local58]];
			local14[local58] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < local24; local81++) {
			@Pc(88) int local88 = this.anIntArray226[local81];
			if (local88 >= 0) {
				local56[local88][local14[local88]++] = local81;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([BB)V")
	private void method3282(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class5_Sub15 local8 = new Class5_Sub15(arg0);
		@Pc(13) Class5_Sub15 local13 = new Class5_Sub15(arg0);
		@Pc(18) Class5_Sub15 local18 = new Class5_Sub15(arg0);
		@Pc(23) Class5_Sub15 local23 = new Class5_Sub15(arg0);
		@Pc(28) Class5_Sub15 local28 = new Class5_Sub15(arg0);
		@Pc(33) Class5_Sub15 local33 = new Class5_Sub15(arg0);
		@Pc(38) Class5_Sub15 local38 = new Class5_Sub15(arg0);
		local8.anInt4144 = arg0.length - 23;
		this.anInt3708 = local8.method3698();
		this.anInt3706 = local8.method3698();
		this.anInt3700 = local8.method3642();
		@Pc(63) int local63 = local8.method3642();
		@Pc(74) boolean local74 = (local63 & 0x1) == 1;
		@Pc(83) boolean local83 = (local63 & 0x2) == 2;
		@Pc(92) boolean local92 = (local63 & 0x4) == 4;
		@Pc(103) boolean local103 = (local63 & 0x8) == 8;
		if (local103) {
			local8.anInt4144 -= 7;
			this.anInt3696 = local8.method3642();
			local8.anInt4144 += 6;
		}
		@Pc(126) int local126 = local8.method3642();
		@Pc(130) int local130 = local8.method3642();
		@Pc(134) int local134 = local8.method3642();
		@Pc(138) int local138 = local8.method3642();
		@Pc(142) int local142 = local8.method3642();
		@Pc(146) int local146 = local8.method3698();
		@Pc(150) int local150 = local8.method3698();
		@Pc(154) int local154 = local8.method3698();
		@Pc(158) int local158 = local8.method3698();
		@Pc(162) int local162 = local8.method3698();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(184) int local184;
		if (this.anInt3700 > 0) {
			this.aByteArray33 = new byte[this.anInt3700];
			local8.anInt4144 = 0;
			for (local184 = 0; local184 < this.anInt3700; local184++) {
				@Pc(194) byte local194 = this.aByteArray33[local184] = local8.method3677();
				if (local194 >= 1 && local194 <= 3) {
					local166++;
				}
				if (local194 == 0) {
					local164++;
				}
				if (local194 == 2) {
					local168++;
				}
			}
		}
		local184 = this.anInt3700;
		@Pc(223) int local223 = local184;
		local184 += this.anInt3708;
		@Pc(230) int local230 = local184;
		if (local74) {
			local184 += this.anInt3706;
		}
		@Pc(239) int local239 = local184;
		local184 += this.anInt3706;
		@Pc(246) int local246 = local184;
		if (local126 == 255) {
			local184 += this.anInt3706;
		}
		@Pc(258) int local258 = local184;
		if (local134 == 1) {
			local184 += this.anInt3706;
		}
		@Pc(270) int local270 = local184;
		if (local142 == 1) {
			local184 += this.anInt3708;
		}
		@Pc(280) int local280 = local184;
		if (local130 == 1) {
			local184 += this.anInt3706;
		}
		@Pc(290) int local290 = local184;
		local184 += local158;
		@Pc(296) int local296 = local184;
		if (local138 == 1) {
			local184 += this.anInt3706 * 2;
		}
		@Pc(310) int local310 = local184;
		local184 += local162;
		@Pc(316) int local316 = local184;
		local184 += this.anInt3706 * 2;
		@Pc(325) int local325 = local184;
		local184 += local146;
		@Pc(331) int local331 = local184;
		local184 += local150;
		@Pc(337) int local337 = local184;
		local184 += local154;
		@Pc(343) int local343 = local184;
		local184 += local164 * 6;
		@Pc(351) int local351 = local184;
		local184 += local166 * 6;
		@Pc(359) byte local359 = 6;
		if (this.anInt3696 == 14) {
			local359 = 7;
		} else if (this.anInt3696 >= 15) {
			local359 = 9;
		}
		@Pc(378) int local378 = local184;
		local184 += local166 * local359;
		@Pc(386) int local386 = local184;
		local184 += local166;
		@Pc(392) int local392 = local184;
		local184 += local166;
		@Pc(398) int local398 = local184;
		local184 += local168 * 2 + local166;
		this.aShortArray55 = new short[this.anInt3706];
		this.aShortArray57 = new short[this.anInt3706];
		if (local130 == 1) {
			this.aByteArray34 = new byte[this.anInt3706];
		}
		if (local142 == 1) {
			this.anIntArray226 = new int[this.anInt3708];
		}
		if (local138 == 1) {
			this.aShortArray58 = new short[this.anInt3706];
		}
		if (this.anInt3700 > 0) {
			this.aShortArray54 = new short[this.anInt3700];
			if (local168 > 0) {
				this.anIntArray228 = new int[local168];
				this.anIntArray220 = new int[local168];
			}
			this.aShortArray50 = new short[this.anInt3700];
			if (local166 > 0) {
				this.aByteArray38 = new byte[local166];
				this.anIntArray221 = new int[local166];
				this.anIntArray224 = new int[local166];
				this.anIntArray229 = new int[local166];
				this.anIntArray230 = new int[local166];
				this.aByteArray32 = new byte[local166];
			}
			this.aShortArray53 = new short[this.anInt3700];
		}
		this.anIntArray227 = new int[this.anInt3708];
		this.aShortArray56 = new short[this.anInt3706];
		if (local138 == 1 && this.anInt3700 > 0) {
			this.aByteArray36 = new byte[this.anInt3706];
		}
		this.aShortArray51 = new short[this.anInt3706];
		if (local134 == 1) {
			this.anIntArray225 = new int[this.anInt3706];
		}
		this.anIntArray223 = new int[this.anInt3708];
		this.anIntArray231 = new int[this.anInt3708];
		if (local126 == 255) {
			this.aByteArray35 = new byte[this.anInt3706];
		} else {
			this.aByte45 = (byte) local126;
		}
		if (local74) {
			this.aByteArray37 = new byte[this.anInt3706];
		}
		local8.anInt4144 = local223;
		local13.anInt4144 = local325;
		local18.anInt4144 = local331;
		local23.anInt4144 = local337;
		local28.anInt4144 = local270;
		@Pc(586) int local586 = 0;
		@Pc(588) int local588 = 0;
		@Pc(590) int local590 = 0;
		@Pc(597) int local597;
		for (@Pc(592) int local592 = 0; local592 < this.anInt3708; local592++) {
			local597 = local8.method3642();
			@Pc(599) int local599 = 0;
			if ((local597 & 0x1) != 0) {
				local599 = local13.method3657();
			}
			@Pc(612) int local612 = 0;
			if ((local597 & 0x2) != 0) {
				local612 = local18.method3657();
			}
			@Pc(622) int local622 = 0;
			if ((local597 & 0x4) != 0) {
				local622 = local23.method3657();
			}
			this.anIntArray227[local592] = local599 + local586;
			this.anIntArray231[local592] = local612 + local588;
			this.anIntArray223[local592] = local622 + local590;
			local588 = this.anIntArray231[local592];
			local586 = this.anIntArray227[local592];
			local590 = this.anIntArray223[local592];
			if (local142 == 1) {
				this.anIntArray226[local592] = local28.method3642();
			}
		}
		local8.anInt4144 = local316;
		local13.anInt4144 = local230;
		local18.anInt4144 = local246;
		local23.anInt4144 = local280;
		local28.anInt4144 = local258;
		local33.anInt4144 = local296;
		local38.anInt4144 = local310;
		for (local597 = 0; local597 < this.anInt3706; local597++) {
			this.aShortArray55[local597] = (short) local8.method3698();
			if (local74) {
				this.aByteArray37[local597] = local13.method3677();
			}
			if (local126 == 255) {
				this.aByteArray35[local597] = local18.method3677();
			}
			if (local130 == 1) {
				this.aByteArray34[local597] = local23.method3677();
			}
			if (local134 == 1) {
				this.anIntArray225[local597] = local28.method3642();
			}
			if (local138 == 1) {
				this.aShortArray58[local597] = (short) (local33.method3698() - 1);
			}
			if (this.aByteArray36 != null) {
				if (this.aShortArray58[local597] == -1) {
					this.aByteArray36[local597] = -1;
				} else {
					this.aByteArray36[local597] = (byte) (local38.method3642() - 1);
				}
			}
		}
		this.anInt3707 = -1;
		local8.anInt4144 = local290;
		local13.anInt4144 = local239;
		@Pc(818) short local818 = 0;
		@Pc(820) short local820 = 0;
		@Pc(822) short local822 = 0;
		@Pc(824) short local824 = 0;
		@Pc(831) int local831;
		for (@Pc(826) int local826 = 0; local826 < this.anInt3706; local826++) {
			local831 = local13.method3642();
			if (local831 == 1) {
				local818 = (short) (local8.method3657() + local824);
				local820 = (short) (local818 + local8.method3657());
				local822 = (short) (local8.method3657() + local820);
				local824 = local822;
				this.aShortArray56[local826] = local818;
				this.aShortArray57[local826] = local820;
				this.aShortArray51[local826] = local822;
				if (this.anInt3707 < local818) {
					this.anInt3707 = local818;
				}
				if (this.anInt3707 < local820) {
					this.anInt3707 = local820;
				}
				if (this.anInt3707 < local822) {
					this.anInt3707 = local822;
				}
			}
			if (local831 == 2) {
				local820 = local822;
				local822 = (short) (local824 + local8.method3657());
				this.aShortArray56[local826] = local818;
				local824 = local822;
				this.aShortArray57[local826] = local820;
				this.aShortArray51[local826] = local822;
				if (local822 > this.anInt3707) {
					this.anInt3707 = local822;
				}
			}
			if (local831 == 3) {
				local818 = local822;
				local822 = (short) (local8.method3657() + local824);
				local824 = local822;
				this.aShortArray56[local826] = local818;
				this.aShortArray57[local826] = local820;
				this.aShortArray51[local826] = local822;
				if (local822 > this.anInt3707) {
					this.anInt3707 = local822;
				}
			}
			if (local831 == 4) {
				@Pc(990) short local990 = local818;
				local818 = local820;
				local822 = (short) (local8.method3657() + local824);
				local820 = local990;
				local824 = local822;
				this.aShortArray56[local826] = local818;
				this.aShortArray57[local826] = local990;
				this.aShortArray51[local826] = local822;
				if (this.anInt3707 < local822) {
					this.anInt3707 = local822;
				}
			}
		}
		this.anInt3707++;
		local8.anInt4144 = local343;
		local13.anInt4144 = local351;
		local18.anInt4144 = local378;
		local23.anInt4144 = local386;
		local28.anInt4144 = local392;
		local33.anInt4144 = local398;
		@Pc(1068) int local1068;
		for (local831 = 0; local831 < this.anInt3700; local831++) {
			local1068 = this.aByteArray33[local831] & 0xFF;
			if (local1068 == 0) {
				this.aShortArray50[local831] = (short) local8.method3698();
				this.aShortArray53[local831] = (short) local8.method3698();
				this.aShortArray54[local831] = (short) local8.method3698();
			}
			if (local1068 == 1) {
				this.aShortArray50[local831] = (short) local13.method3698();
				this.aShortArray53[local831] = (short) local13.method3698();
				this.aShortArray54[local831] = (short) local13.method3698();
				if (this.anInt3696 >= 15) {
					this.anIntArray229[local831] = local18.method3633();
					this.anIntArray230[local831] = local18.method3633();
					this.anIntArray224[local831] = local18.method3633();
				} else {
					this.anIntArray229[local831] = local18.method3698();
					if (this.anInt3696 < 14) {
						this.anIntArray230[local831] = local18.method3698();
					} else {
						this.anIntArray230[local831] = local18.method3633();
					}
					this.anIntArray224[local831] = local18.method3698();
				}
				this.aByteArray38[local831] = local23.method3677();
				this.aByteArray32[local831] = local28.method3677();
				this.anIntArray221[local831] = local33.method3677();
			}
			if (local1068 == 2) {
				this.aShortArray50[local831] = (short) local13.method3698();
				this.aShortArray53[local831] = (short) local13.method3698();
				this.aShortArray54[local831] = (short) local13.method3698();
				if (this.anInt3696 < 15) {
					this.anIntArray229[local831] = local18.method3698();
					if (this.anInt3696 >= 14) {
						this.anIntArray230[local831] = local18.method3633();
					} else {
						this.anIntArray230[local831] = local18.method3698();
					}
					this.anIntArray224[local831] = local18.method3698();
				} else {
					this.anIntArray229[local831] = local18.method3633();
					this.anIntArray230[local831] = local18.method3633();
					this.anIntArray224[local831] = local18.method3633();
				}
				this.aByteArray38[local831] = local23.method3677();
				this.aByteArray32[local831] = local28.method3677();
				this.anIntArray221[local831] = local33.method3677();
				this.anIntArray228[local831] = local33.method3677();
				this.anIntArray220[local831] = local33.method3677();
			}
			if (local1068 == 3) {
				this.aShortArray50[local831] = (short) local13.method3698();
				this.aShortArray53[local831] = (short) local13.method3698();
				this.aShortArray54[local831] = (short) local13.method3698();
				if (this.anInt3696 < 15) {
					this.anIntArray229[local831] = local18.method3698();
					if (this.anInt3696 >= 14) {
						this.anIntArray230[local831] = local18.method3633();
					} else {
						this.anIntArray230[local831] = local18.method3698();
					}
					this.anIntArray224[local831] = local18.method3698();
				} else {
					this.anIntArray229[local831] = local18.method3633();
					this.anIntArray230[local831] = local18.method3633();
					this.anIntArray224[local831] = local18.method3633();
				}
				this.aByteArray38[local831] = local23.method3677();
				this.aByteArray32[local831] = local28.method3677();
				this.anIntArray221[local831] = local33.method3677();
			}
		}
		local8.anInt4144 = local184;
		@Pc(1462) int local1462;
		@Pc(1467) int local1467;
		@Pc(1471) int local1471;
		@Pc(1536) int local1536;
		if (local83) {
			local1068 = local8.method3642();
			if (local1068 > 0) {
				this.aClass244Array3 = new Class244[local1068];
				for (local1462 = 0; local1462 < local1068; local1462++) {
					local1467 = local8.method3698();
					local1471 = local8.method3698();
					@Pc(1477) byte local1477;
					if (local126 == 255) {
						local1477 = this.aByteArray35[local1471];
					} else {
						local1477 = (byte) local126;
					}
					this.aClass244Array3[local1462] = new Class244(local1467, this.aShortArray56[local1471], this.aShortArray57[local1471], this.aShortArray51[local1471], local1477);
				}
			}
			local1462 = local8.method3642();
			if (local1462 > 0) {
				this.aClass303Array3 = new Class303[local1462];
				for (local1467 = 0; local1467 < local1462; local1467++) {
					local1471 = local8.method3698();
					local1536 = local8.method3698();
					this.aClass303Array3[local1467] = new Class303(local1471, local1536);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1068 = local8.method3642();
		if (local1068 <= 0) {
			return;
		}
		this.aClass261Array1 = new Class261[local1068];
		for (local1462 = 0; local1462 < local1068; local1462++) {
			local1467 = local8.method3698();
			local1471 = local8.method3698();
			local1536 = local8.method3642();
			@Pc(1584) byte local1584 = local8.method3677();
			this.aClass261Array1[local1462] = new Class261(local1467, local1471, local1536, local1584);
		}
		return;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(BBSIBISIB)I")
	public int method3283(@OriginalArg(1) byte arg0, @OriginalArg(2) short arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray56[this.anInt3706] = (short) arg2;
		this.aShortArray57[this.anInt3706] = (short) arg4;
		this.aShortArray51[this.anInt3706] = (short) arg6;
		this.aByteArray37[this.anInt3706] = arg7;
		this.aByteArray36[this.anInt3706] = arg3;
		this.aShortArray55[this.anInt3706] = arg5;
		this.aByteArray34[this.anInt3706] = arg0;
		this.aShortArray58[this.anInt3706] = arg1;
		return this.anInt3706++;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "([BI)V")
	private void method3284(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class5_Sub15 local12 = new Class5_Sub15(arg0);
		@Pc(17) Class5_Sub15 local17 = new Class5_Sub15(arg0);
		@Pc(22) Class5_Sub15 local22 = new Class5_Sub15(arg0);
		@Pc(27) Class5_Sub15 local27 = new Class5_Sub15(arg0);
		@Pc(32) Class5_Sub15 local32 = new Class5_Sub15(arg0);
		local12.anInt4144 = arg0.length - 18;
		this.anInt3708 = local12.method3698();
		this.anInt3706 = local12.method3698();
		this.anInt3700 = local12.method3642();
		@Pc(61) int local61 = local12.method3642();
		@Pc(65) int local65 = local12.method3642();
		@Pc(71) int local71 = local12.method3642();
		@Pc(75) int local75 = local12.method3642();
		@Pc(79) int local79 = local12.method3642();
		@Pc(83) int local83 = local12.method3698();
		@Pc(87) int local87 = local12.method3698();
		@Pc(91) int local91 = local12.method3698();
		@Pc(95) int local95 = local12.method3698();
		@Pc(104) int local104 = this.anInt3708;
		@Pc(106) int local106 = local104;
		local104 += this.anInt3706;
		@Pc(113) int local113 = local104;
		if (local65 == 255) {
			local104 += this.anInt3706;
		}
		@Pc(125) int local125 = local104;
		if (local75 == 1) {
			local104 += this.anInt3706;
		}
		@Pc(137) int local137 = local104;
		if (local61 == 1) {
			local104 += this.anInt3706;
		}
		@Pc(149) int local149 = local104;
		if (local79 == 1) {
			local104 += this.anInt3708;
		}
		@Pc(161) int local161 = local104;
		if (local71 == 1) {
			local104 += this.anInt3706;
		}
		@Pc(173) int local173 = local104;
		local104 += local95;
		@Pc(179) int local179 = local104;
		local104 += this.anInt3706 * 2;
		@Pc(188) int local188 = local104;
		local104 += this.anInt3700 * 6;
		@Pc(197) int local197 = local104;
		local104 += local83;
		@Pc(203) int local203 = local104;
		local104 += local87;
		if (local79 == 1) {
			this.anIntArray226 = new int[this.anInt3708];
		}
		if (local75 == 1) {
			this.anIntArray225 = new int[this.anInt3706];
		}
		this.aShortArray57 = new short[this.anInt3706];
		this.aShortArray55 = new short[this.anInt3706];
		this.anIntArray223 = new int[this.anInt3708];
		local12.anInt4144 = 0;
		if (this.anInt3700 > 0) {
			this.aShortArray53 = new short[this.anInt3700];
			this.aByteArray33 = new byte[this.anInt3700];
			this.aShortArray50 = new short[this.anInt3700];
			this.aShortArray54 = new short[this.anInt3700];
		}
		if (local71 == 1) {
			this.aByteArray34 = new byte[this.anInt3706];
		}
		if (local65 == 255) {
			this.aByteArray35 = new byte[this.anInt3706];
		} else {
			this.aByte45 = (byte) local65;
		}
		if (local61 == 1) {
			this.aShortArray58 = new short[this.anInt3706];
			this.aByteArray36 = new byte[this.anInt3706];
			this.aByteArray37 = new byte[this.anInt3706];
		}
		this.anIntArray227 = new int[this.anInt3708];
		this.anIntArray231 = new int[this.anInt3708];
		this.aShortArray51 = new short[this.anInt3706];
		this.aShortArray56 = new short[this.anInt3706];
		local17.anInt4144 = local197;
		local22.anInt4144 = local203;
		local27.anInt4144 = local104;
		local32.anInt4144 = local149;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(356) int local356 = 0;
		@Pc(363) int local363;
		@Pc(365) int local365;
		for (@Pc(358) int local358 = 0; local358 < this.anInt3708; local358++) {
			local363 = local12.method3642();
			local365 = 0;
			if ((local363 & 0x1) != 0) {
				local365 = local17.method3657();
			}
			@Pc(375) int local375 = 0;
			if ((local363 & 0x2) != 0) {
				local375 = local22.method3657();
			}
			@Pc(387) int local387 = 0;
			if ((local363 & 0x4) != 0) {
				local387 = local27.method3657();
			}
			this.anIntArray227[local358] = local352 + local365;
			this.anIntArray231[local358] = local354 + local375;
			this.anIntArray223[local358] = local387 + local356;
			local352 = this.anIntArray227[local358];
			local356 = this.anIntArray223[local358];
			local354 = this.anIntArray231[local358];
			if (local79 == 1) {
				this.anIntArray226[local358] = local32.method3642();
			}
		}
		local12.anInt4144 = local179;
		local17.anInt4144 = local137;
		local22.anInt4144 = local113;
		local27.anInt4144 = local161;
		local32.anInt4144 = local125;
		for (local363 = 0; local363 < this.anInt3706; local363++) {
			this.aShortArray55[local363] = (short) local12.method3698();
			if (local61 == 1) {
				local365 = local17.method3642();
				if ((local365 & 0x1) == 1) {
					local5 = true;
					this.aByteArray37[local363] = 1;
				} else {
					this.aByteArray37[local363] = 0;
				}
				if ((local365 & 0x2) == 2) {
					this.aByteArray36[local363] = (byte) (local365 >> 2);
					this.aShortArray58[local363] = this.aShortArray55[local363];
					this.aShortArray55[local363] = 127;
					if (this.aShortArray58[local363] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray36[local363] = -1;
					this.aShortArray58[local363] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray35[local363] = local22.method3677();
			}
			if (local71 == 1) {
				this.aByteArray34[local363] = local27.method3677();
			}
			if (local75 == 1) {
				this.anIntArray225[local363] = local32.method3642();
			}
		}
		this.anInt3707 = -1;
		local12.anInt4144 = local173;
		local17.anInt4144 = local106;
		@Pc(603) short local603 = 0;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(618) int local618;
		for (@Pc(611) int local611 = 0; local611 < this.anInt3706; local611++) {
			local618 = local17.method3642();
			if (local618 == 1) {
				local603 = (short) (local609 + local12.method3657());
				local605 = (short) (local12.method3657() + local603);
				local607 = (short) (local12.method3657() + local605);
				this.aShortArray56[local611] = local603;
				local609 = local607;
				this.aShortArray57[local611] = local605;
				this.aShortArray51[local611] = local607;
				if (this.anInt3707 < local603) {
					this.anInt3707 = local603;
				}
				if (local605 > this.anInt3707) {
					this.anInt3707 = local605;
				}
				if (local607 > this.anInt3707) {
					this.anInt3707 = local607;
				}
			}
			if (local618 == 2) {
				local605 = local607;
				local607 = (short) (local609 + local12.method3657());
				local609 = local607;
				this.aShortArray56[local611] = local603;
				this.aShortArray57[local611] = local605;
				this.aShortArray51[local611] = local607;
				if (local607 > this.anInt3707) {
					this.anInt3707 = local607;
				}
			}
			if (local618 == 3) {
				local603 = local607;
				local607 = (short) (local609 + local12.method3657());
				this.aShortArray56[local611] = local603;
				local609 = local607;
				this.aShortArray57[local611] = local605;
				this.aShortArray51[local611] = local607;
				if (this.anInt3707 < local607) {
					this.anInt3707 = local607;
				}
			}
			if (local618 == 4) {
				@Pc(775) short local775 = local603;
				local603 = local605;
				local605 = local775;
				local607 = (short) (local12.method3657() + local609);
				local609 = local607;
				this.aShortArray56[local611] = local603;
				this.aShortArray57[local611] = local775;
				this.aShortArray51[local611] = local607;
				if (local607 > this.anInt3707) {
					this.anInt3707 = local607;
				}
			}
		}
		local12.anInt4144 = local188;
		this.anInt3707++;
		for (local618 = 0; local618 < this.anInt3700; local618++) {
			this.aByteArray33[local618] = 0;
			this.aShortArray50[local618] = (short) local12.method3698();
			this.aShortArray53[local618] = (short) local12.method3698();
			this.aShortArray54[local618] = (short) local12.method3698();
		}
		if (this.aByteArray36 != null) {
			@Pc(870) boolean local870 = false;
			for (@Pc(872) int local872 = 0; local872 < this.anInt3706; local872++) {
				@Pc(880) int local880 = this.aByteArray36[local872] & 0xFF;
				if (local880 != 255) {
					if (this.aShortArray56[local872] == (this.aShortArray50[local880] & 0xFFFF) && (this.aShortArray53[local880] & 0xFFFF) == this.aShortArray57[local872] && this.aShortArray51[local872] == (this.aShortArray54[local880] & 0xFFFF)) {
						this.aByteArray36[local872] = -1;
					} else {
						local870 = true;
					}
				}
			}
			if (!local870) {
				this.aByteArray36 = null;
			}
		}
		if (!local5) {
			this.aByteArray37 = null;
		}
		if (!local7) {
			this.aShortArray58 = null;
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "(IIII)I")
	public int method3285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt3708; local5++) {
			if (arg1 == this.anIntArray227[local5] && arg2 == this.anIntArray231[local5] && this.anIntArray223[local5] == arg0) {
				return local5;
			}
		}
		this.anIntArray227[this.anInt3708] = arg1;
		this.anIntArray231[this.anInt3708] = arg2;
		this.anIntArray223[this.anInt3708] = arg0;
		this.anInt3707 = this.anInt3708 + 1;
		return this.anInt3708++;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(SIS)V")
	public void method3286(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray58 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt3706; local17++) {
			if (this.aShortArray58[local17] == arg1) {
				this.aShortArray58[local17] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(SBILclient!hm;)I")
	private int method3287(@OriginalArg(0) short arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class156 arg2) {
		@Pc(8) int local8 = arg2.anIntArray227[arg1];
		@Pc(13) int local13 = arg2.anIntArray231[arg1];
		@Pc(18) int local18 = arg2.anIntArray223[arg1];
		for (@Pc(25) int local25 = 0; local25 < this.anInt3708; local25++) {
			if (local8 == this.anIntArray227[local25] && local13 == this.anIntArray231[local25] && local18 == this.anIntArray223[local25]) {
				this.aShortArray52[local25] |= arg0;
				return local25;
			}
		}
		this.anIntArray227[this.anInt3708] = local8;
		this.anIntArray231[this.anInt3708] = local13;
		this.anIntArray223[this.anInt3708] = local18;
		this.aShortArray52[this.anInt3708] = arg0;
		this.anIntArray226[this.anInt3708] = arg2.anIntArray226 == null ? -1 : arg2.anIntArray226[arg1];
		return this.anInt3708++;
	}
}
