import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wr")
public final class Class266 {

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!wr", name = "e", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!wr", name = "f", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!wr", name = "l", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!wr", name = "p", descriptor = "[Lclient!ma;")
	public Class161[] aClass161Array3;

	@OriginalMember(owner = "client!wr", name = "r", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!wr", name = "s", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!wr", name = "t", descriptor = "[I")
	public int[] anIntArray624;

	@OriginalMember(owner = "client!wr", name = "v", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!wr", name = "w", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!wr", name = "x", descriptor = "[I")
	public int[] anIntArray625;

	@OriginalMember(owner = "client!wr", name = "y", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!wr", name = "z", descriptor = "[I")
	public int[] anIntArray626;

	@OriginalMember(owner = "client!wr", name = "B", descriptor = "[Lclient!oo;")
	public Class192[] aClass192Array3;

	@OriginalMember(owner = "client!wr", name = "D", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!wr", name = "E", descriptor = "[I")
	public int[] anIntArray627;

	@OriginalMember(owner = "client!wr", name = "F", descriptor = "[I")
	public int[] anIntArray628;

	@OriginalMember(owner = "client!wr", name = "H", descriptor = "[Lclient!ar;")
	public Class15[] aClass15Array1;

	@OriginalMember(owner = "client!wr", name = "I", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!wr", name = "J", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!wr", name = "K", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!wr", name = "M", descriptor = "[I")
	public int[] anIntArray629;

	@OriginalMember(owner = "client!wr", name = "N", descriptor = "[I")
	public int[] anIntArray630;

	@OriginalMember(owner = "client!wr", name = "Q", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!wr", name = "T", descriptor = "[I")
	public int[] anIntArray631;

	@OriginalMember(owner = "client!wr", name = "V", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!wr", name = "W", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!wr", name = "X", descriptor = "[I")
	public int[] anIntArray632;

	@OriginalMember(owner = "client!wr", name = "ab", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!wr", name = "bb", descriptor = "[I")
	public int[] anIntArray633;

	@OriginalMember(owner = "client!wr", name = "db", descriptor = "[I")
	public int[] anIntArray634;

	@OriginalMember(owner = "client!wr", name = "m", descriptor = "B")
	public byte aByte102 = 0;

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
	public int anInt7237 = 12;

	@OriginalMember(owner = "client!wr", name = "u", descriptor = "I")
	public int anInt7248 = 0;

	@OriginalMember(owner = "client!wr", name = "R", descriptor = "I")
	public int anInt7253 = 0;

	@OriginalMember(owner = "client!wr", name = "Y", descriptor = "I")
	public int anInt7254 = 0;

	@OriginalMember(owner = "client!wr", name = "n", descriptor = "I")
	public int anInt7245 = 0;

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "([B)V")
	public Class266(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5964(arg0);
		} else {
			this.method5970(arg0);
		}
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "(III)V")
	public Class266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray108 = new short[arg1];
		this.anIntArray626 = new int[arg0];
		this.aByteArray94 = new byte[arg1];
		this.aShortArray111 = new short[arg1];
		this.aByteArray93 = new byte[arg1];
		this.anIntArray634 = new int[arg1];
		if (arg2 > 0) {
			this.aByteArray95 = new byte[arg2];
			this.anIntArray633 = new int[arg2];
			this.aByteArray91 = new byte[arg2];
			this.aShortArray104 = new short[arg2];
			this.anIntArray627 = new int[arg2];
			this.anIntArray632 = new int[arg2];
			this.aShortArray107 = new short[arg2];
			this.aByteArray90 = new byte[arg2];
			this.anIntArray631 = new int[arg2];
			this.aShortArray109 = new short[arg2];
			this.anIntArray628 = new int[arg2];
			this.anIntArray624 = new int[arg2];
		}
		this.anIntArray625 = new int[arg0];
		this.aByteArray89 = new byte[arg1];
		this.aShortArray105 = new short[arg1];
		this.anIntArray629 = new int[arg0];
		this.aShortArray112 = new short[arg1];
		this.aShortArray110 = new short[arg1];
		this.anIntArray630 = new int[arg0];
		this.aByteArray92 = new byte[arg1];
	}

	@OriginalMember(owner = "client!wr", name = "<init>", descriptor = "([Lclient!wr;I)V")
	public Class266(@OriginalArg(0) Class266[] arg0, @OriginalArg(1) int arg1) {
		this.anInt7248 = 0;
		this.anInt7254 = 0;
		this.anInt7245 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte102 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class266 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt7254 += local59.anInt7254;
				this.anInt7248 += local59.anInt7248;
				this.anInt7245 += local59.anInt7245;
				local38 |= local59.aByteArray93 != null;
				if (local59.aClass161Array3 != null) {
					local34 += local59.aClass161Array3.length;
				}
				if (local59.aClass192Array3 != null) {
					local32 += local59.aClass192Array3.length;
				}
				if (local59.aClass15Array1 != null) {
					local36 += local59.aClass15Array1.length;
				}
				local51 |= local59.anIntArray634 != null;
				if (local59.aByteArray94 == null) {
					if (this.aByte102 == -1) {
						this.aByte102 = local59.aByte102;
					}
					if (local59.aByte102 != this.aByte102) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray92 != null;
				local42 |= local59.aByteArray89 != null;
				local46 |= local59.aShortArray110 != null;
			}
		}
		if (local34 > 0) {
			this.aClass161Array3 = new Class161[local34];
		}
		this.anIntArray630 = new int[this.anInt7245];
		if (this.anInt7248 > 0) {
			this.aShortArray104 = new short[this.anInt7248];
			this.anIntArray624 = new int[this.anInt7248];
			this.aByteArray90 = new byte[this.anInt7248];
			this.anIntArray627 = new int[this.anInt7248];
			this.anIntArray628 = new int[this.anInt7248];
			this.anIntArray632 = new int[this.anInt7248];
			this.aByteArray95 = new byte[this.anInt7248];
			this.aByteArray91 = new byte[this.anInt7248];
			this.aShortArray107 = new short[this.anInt7248];
			this.anIntArray633 = new int[this.anInt7248];
			this.anIntArray631 = new int[this.anInt7248];
			this.aShortArray109 = new short[this.anInt7248];
		}
		if (local36 > 0) {
			this.aClass15Array1 = new Class15[local36];
		}
		this.anIntArray625 = new int[this.anInt7245];
		this.anIntArray626 = new int[this.anInt7245];
		this.aShortArray108 = new short[this.anInt7254];
		if (local42) {
			this.aByteArray89 = new byte[this.anInt7254];
		}
		if (local38) {
			this.aByteArray93 = new byte[this.anInt7254];
		}
		this.aShortArray106 = new short[this.anInt7245];
		if (local46) {
			this.aShortArray110 = new short[this.anInt7254];
		}
		if (local51) {
			this.anIntArray634 = new int[this.anInt7254];
		}
		if (local40) {
			this.aByteArray94 = new byte[this.anInt7254];
		}
		this.aShortArray103 = new short[this.anInt7254];
		if (local32 > 0) {
			this.aClass192Array3 = new Class192[local32];
		}
		this.aShortArray105 = new short[this.anInt7254];
		if (local44) {
			this.aByteArray92 = new byte[this.anInt7254];
		}
		this.aShortArray112 = new short[this.anInt7254];
		this.anIntArray629 = new int[this.anInt7245];
		this.aShortArray111 = new short[this.anInt7254];
		this.anInt7248 = 0;
		this.anInt7254 = 0;
		local32 = 0;
		this.anInt7245 = 0;
		local34 = 0;
		local36 = 0;
		@Pc(617) int local617;
		@Pc(628) int local628;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class266 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass15Array1 != null) {
					for (local398 = 0; local398 < local391.aClass15Array1.length; local398++) {
						@Pc(405) Class15 local405 = local391.aClass15Array1[local398];
						this.aClass15Array1[local36++] = local405.method273(local405.anInt315 + this.anInt7254);
					}
				}
				for (local398 = 0; local398 < local391.anInt7254; local398++) {
					if (local38 && local391.aByteArray93 != null) {
						this.aByteArray93[this.anInt7254] = local391.aByteArray93[local398];
					}
					if (local40) {
						if (local391.aByteArray94 == null) {
							this.aByteArray94[this.anInt7254] = local391.aByte102;
						} else {
							this.aByteArray94[this.anInt7254] = local391.aByteArray94[local398];
						}
					}
					if (local42 && local391.aByteArray89 != null) {
						this.aByteArray89[this.anInt7254] = local391.aByteArray89[local398];
					}
					if (local46) {
						if (local391.aShortArray110 == null) {
							this.aShortArray110[this.anInt7254] = -1;
						} else {
							this.aShortArray110[this.anInt7254] = local391.aShortArray110[local398];
						}
					}
					if (local51) {
						if (local391.anIntArray634 == null) {
							this.anIntArray634[this.anInt7254] = -1;
						} else {
							this.anIntArray634[this.anInt7254] = local391.anIntArray634[local398];
						}
					}
					this.aShortArray112[this.anInt7254] = (short) this.method5968(local391.aShortArray112[local398], local387, local391);
					this.aShortArray105[this.anInt7254] = (short) this.method5968(local391.aShortArray105[local398], local387, local391);
					this.aShortArray111[this.anInt7254] = (short) this.method5968(local391.aShortArray111[local398], local387, local391);
					this.aShortArray103[this.anInt7254] = local387;
					this.aShortArray108[this.anInt7254] = local391.aShortArray108[local398];
					this.anInt7254++;
				}
				@Pc(604) int local604;
				if (local391.aClass192Array3 != null) {
					for (local604 = 0; local604 < local391.aClass192Array3.length; local604++) {
						local617 = this.method5968(local391.aClass192Array3[local604].anInt4898, local387, local391);
						local628 = this.method5968(local391.aClass192Array3[local604].anInt4896, local387, local391);
						@Pc(639) int local639 = this.method5968(local391.aClass192Array3[local604].anInt4897, local387, local391);
						this.aClass192Array3[local32] = local391.aClass192Array3[local604].method4340(local617, local628, local639);
						local32++;
					}
				}
				if (local391.aClass161Array3 != null) {
					for (local604 = 0; local604 < local391.aClass161Array3.length; local604++) {
						local617 = this.method5968(local391.aClass161Array3[local604].anInt4068, local387, local391);
						this.aClass161Array3[local34] = local391.aClass161Array3[local604].method3712(local617);
						local34++;
					}
				}
			}
		}
		@Pc(705) int local705 = 0;
		this.anInt7253 = this.anInt7245;
		for (@Pc(711) int local711 = 0; local711 < arg1; local711++) {
			@Pc(718) short local718 = (short) (0x1 << local711);
			@Pc(722) Class266 local722 = arg0[local711];
			if (local722 != null) {
				for (local617 = 0; local617 < local722.anInt7254; local617++) {
					if (local44) {
						this.aByteArray92[local705++] = (byte) (local722.aByteArray92 == null || local722.aByteArray92[local617] == -1 ? -1 : this.anInt7248 + local722.aByteArray92[local617]);
					}
				}
				for (local628 = 0; local628 < local722.anInt7248; local628++) {
					@Pc(774) byte local774 = this.aByteArray91[this.anInt7248] = local722.aByteArray91[local628];
					if (local774 == 0) {
						this.aShortArray104[this.anInt7248] = (short) this.method5968(local722.aShortArray104[local628], local718, local722);
						this.aShortArray107[this.anInt7248] = (short) this.method5968(local722.aShortArray107[local628], local718, local722);
						this.aShortArray109[this.anInt7248] = (short) this.method5968(local722.aShortArray109[local628], local718, local722);
					}
					if (local774 >= 1 && local774 <= 3) {
						this.aShortArray104[this.anInt7248] = local722.aShortArray104[local628];
						this.aShortArray107[this.anInt7248] = local722.aShortArray107[local628];
						this.aShortArray109[this.anInt7248] = local722.aShortArray109[local628];
						this.anIntArray633[this.anInt7248] = local722.anIntArray633[local628];
						this.anIntArray627[this.anInt7248] = local722.anIntArray627[local628];
						this.anIntArray631[this.anInt7248] = local722.anIntArray631[local628];
						this.aByteArray95[this.anInt7248] = local722.aByteArray95[local628];
						this.aByteArray90[this.anInt7248] = local722.aByteArray90[local628];
						this.anIntArray624[this.anInt7248] = local722.anIntArray624[local628];
					}
					if (local774 == 2) {
						this.anIntArray628[this.anInt7248] = local722.anIntArray628[local628];
						this.anIntArray632[this.anInt7248] = local722.anIntArray632[local628];
					}
					this.anInt7248++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(BSSBBSSSBS)B")
	public byte method5958() {
		if (this.anInt7248 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray91[this.anInt7248] = 3;
		this.aShortArray104[this.anInt7248] = 0;
		this.aShortArray107[this.anInt7248] = 32767;
		this.aShortArray109[this.anInt7248] = 0;
		this.anIntArray633[this.anInt7248] = 1024;
		this.anIntArray627[this.anInt7248] = 1024;
		this.anIntArray631[this.anInt7248] = 1024;
		this.aByteArray95[this.anInt7248] = 0;
		this.aByteArray90[this.anInt7248] = 0;
		this.anIntArray624[this.anInt7248] = 0;
		return (byte) this.anInt7248++;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIII)V")
	public void method5959(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7245; local3++) {
			this.anIntArray626[local3] += arg1;
			this.anIntArray630[local3] += arg2;
			this.anIntArray629[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ISS)V")
	public void method5960(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt7254; local3++) {
			if (arg0 == this.aShortArray108[local3]) {
				this.aShortArray108[local3] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(II)V")
	public void method5961() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt7245; local7++) {
			this.anIntArray626[local7] <<= 0x0;
			this.anIntArray630[local7] <<= 0x0;
			this.anIntArray629[local7] <<= 0x0;
		}
		if (this.anInt7248 <= 0 || this.anIntArray633 == null) {
			return;
		}
		for (@Pc(52) int local52 = 0; local52 < this.anIntArray633.length; local52++) {
			this.anIntArray633[local52] <<= 0x0;
			this.anIntArray627[local52] <<= 0x0;
			if (this.aByteArray91[local52] != 1) {
				this.anIntArray631[local52] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(IIII)V")
	public void method5962(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(22) int local22;
		@Pc(26) int local26;
		@Pc(28) int local28;
		@Pc(46) int local46;
		if (arg0 != 0) {
			local22 = Class6_Sub1_Sub18.anIntArray642[arg0];
			local26 = Class6_Sub1_Sub18.anIntArray643[arg0];
			for (local28 = 0; local28 < this.anInt7245; local28++) {
				local46 = this.anIntArray630[local28] * local22 + local26 * this.anIntArray626[local28] >> 15;
				this.anIntArray630[local28] = this.anIntArray630[local28] * local26 - this.anIntArray626[local28] * local22 >> 15;
				this.anIntArray626[local28] = local46;
			}
		}
		if (arg1 != 0) {
			local22 = Class6_Sub1_Sub18.anIntArray642[arg1];
			local26 = Class6_Sub1_Sub18.anIntArray643[arg1];
			for (local28 = 0; local28 < this.anInt7245; local28++) {
				local46 = local26 * this.anIntArray630[local28] - local22 * this.anIntArray629[local28] >> 15;
				this.anIntArray629[local28] = this.anIntArray630[local28] * local22 + local26 * this.anIntArray629[local28] >> 15;
				this.anIntArray630[local28] = local46;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local22 = Class6_Sub1_Sub18.anIntArray642[arg2];
		local26 = Class6_Sub1_Sub18.anIntArray643[arg2];
		for (local28 = 0; local28 < this.anInt7245; local28++) {
			local46 = this.anIntArray626[local28] * local26 + local22 * this.anIntArray629[local28] >> 15;
			this.anIntArray629[local28] = this.anIntArray629[local28] * local26 - local22 * this.anIntArray626[local28] >> 15;
			this.anIntArray626[local28] = local46;
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(SSB)V")
	public void method5963(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray110 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt7254; local9++) {
			if (this.aShortArray110[local9] == arg0) {
				this.aShortArray110[local9] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "([BI)V")
	private void method5964(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub15 local10 = new Class6_Sub15(arg0);
		@Pc(15) Class6_Sub15 local15 = new Class6_Sub15(arg0);
		@Pc(20) Class6_Sub15 local20 = new Class6_Sub15(arg0);
		@Pc(25) Class6_Sub15 local25 = new Class6_Sub15(arg0);
		@Pc(30) Class6_Sub15 local30 = new Class6_Sub15(arg0);
		@Pc(35) Class6_Sub15 local35 = new Class6_Sub15(arg0);
		@Pc(40) Class6_Sub15 local40 = new Class6_Sub15(arg0);
		local10.anInt3487 = arg0.length - 23;
		this.anInt7245 = local10.method3108();
		this.anInt7254 = local10.method3108();
		this.anInt7248 = local10.method3111();
		@Pc(65) int local65 = local10.method3111();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt3487 -= 7;
			this.anInt7237 = local10.method3111();
			local10.anInt3487 += 6;
		}
		@Pc(126) int local126 = local10.method3111();
		@Pc(130) int local130 = local10.method3111();
		@Pc(134) int local134 = local10.method3111();
		@Pc(138) int local138 = local10.method3111();
		@Pc(142) int local142 = local10.method3111();
		@Pc(146) int local146 = local10.method3108();
		@Pc(150) int local150 = local10.method3108();
		@Pc(154) int local154 = local10.method3108();
		@Pc(158) int local158 = local10.method3108();
		@Pc(162) int local162 = local10.method3108();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(184) int local184;
		if (this.anInt7248 > 0) {
			local10.anInt3487 = 0;
			this.aByteArray91 = new byte[this.anInt7248];
			for (local184 = 0; local184 < this.anInt7248; local184++) {
				@Pc(195) byte local195 = this.aByteArray91[local184] = local10.method3116();
				if (local195 == 0) {
					local164++;
				}
				if (local195 >= 1 && local195 <= 3) {
					local166++;
				}
				if (local195 == 2) {
					local168++;
				}
			}
		}
		local184 = this.anInt7248;
		@Pc(230) int local230 = local184;
		local184 += this.anInt7245;
		@Pc(237) int local237 = local184;
		if (local76) {
			local184 += this.anInt7254;
		}
		@Pc(246) int local246 = local184;
		local184 += this.anInt7254;
		@Pc(253) int local253 = local184;
		if (local126 == 255) {
			local184 += this.anInt7254;
		}
		@Pc(265) int local265 = local184;
		if (local134 == 1) {
			local184 += this.anInt7254;
		}
		@Pc(275) int local275 = local184;
		if (local142 == 1) {
			local184 += this.anInt7245;
		}
		@Pc(287) int local287 = local184;
		if (local130 == 1) {
			local184 += this.anInt7254;
		}
		@Pc(297) int local297 = local184;
		local184 += local158;
		@Pc(303) int local303 = local184;
		if (local138 == 1) {
			local184 += this.anInt7254 * 2;
		}
		@Pc(315) int local315 = local184;
		local184 += local162;
		@Pc(321) int local321 = local184;
		local184 += this.anInt7254 * 2;
		@Pc(330) int local330 = local184;
		local184 += local146;
		@Pc(336) int local336 = local184;
		local184 += local150;
		@Pc(342) int local342 = local184;
		local184 += local154;
		@Pc(348) int local348 = local184;
		local184 += local164 * 6;
		@Pc(356) int local356 = local184;
		local184 += local166 * 6;
		@Pc(370) int local370 = this.anInt7237 >= 14 ? 7 : 6;
		@Pc(372) int local372 = local184;
		local184 += local370 * local166;
		@Pc(380) int local380 = local184;
		local184 += local166;
		@Pc(386) int local386 = local184;
		local184 += local166;
		@Pc(392) int local392 = local184;
		local184 += local166 + local168 * 2;
		if (local138 == 1) {
			this.aShortArray110 = new short[this.anInt7254];
		}
		this.aShortArray108 = new short[this.anInt7254];
		this.aShortArray111 = new short[this.anInt7254];
		this.anIntArray629 = new int[this.anInt7245];
		this.anIntArray626 = new int[this.anInt7245];
		local10.anInt3487 = local230;
		this.aShortArray105 = new short[this.anInt7254];
		this.aShortArray112 = new short[this.anInt7254];
		if (this.anInt7248 > 0) {
			this.aShortArray109 = new short[this.anInt7248];
			this.aShortArray104 = new short[this.anInt7248];
			if (local168 > 0) {
				this.anIntArray628 = new int[local168];
				this.anIntArray632 = new int[local168];
			}
			if (local166 > 0) {
				this.anIntArray624 = new int[local166];
				this.aByteArray90 = new byte[local166];
				this.anIntArray633 = new int[local166];
				this.aByteArray95 = new byte[local166];
				this.anIntArray627 = new int[local166];
				this.anIntArray631 = new int[local166];
			}
			this.aShortArray107 = new short[this.anInt7248];
		}
		this.anIntArray630 = new int[this.anInt7245];
		if (local138 == 1 && this.anInt7248 > 0) {
			this.aByteArray92 = new byte[this.anInt7254];
		}
		if (local134 == 1) {
			this.anIntArray634 = new int[this.anInt7254];
		}
		if (local142 == 1) {
			this.anIntArray625 = new int[this.anInt7245];
		}
		if (local76) {
			this.aByteArray93 = new byte[this.anInt7254];
		}
		if (local130 == 1) {
			this.aByteArray89 = new byte[this.anInt7254];
		}
		if (local126 == 255) {
			this.aByteArray94 = new byte[this.anInt7254];
		} else {
			this.aByte102 = (byte) local126;
		}
		local15.anInt3487 = local330;
		local20.anInt3487 = local336;
		local25.anInt3487 = local342;
		local30.anInt3487 = local275;
		@Pc(581) int local581 = 0;
		@Pc(583) int local583 = 0;
		@Pc(585) int local585 = 0;
		@Pc(593) int local593;
		for (@Pc(587) int local587 = 0; local587 < this.anInt7245; local587++) {
			local593 = local10.method3111();
			@Pc(595) int local595 = 0;
			if ((local593 & 0x1) != 0) {
				local595 = local15.method3125();
			}
			@Pc(607) int local607 = 0;
			if ((local593 & 0x2) != 0) {
				local607 = local20.method3125();
			}
			@Pc(617) int local617 = 0;
			if ((local593 & 0x4) != 0) {
				local617 = local25.method3125();
			}
			this.anIntArray626[local587] = local595 + local581;
			this.anIntArray630[local587] = local583 + local607;
			this.anIntArray629[local587] = local585 + local617;
			local583 = this.anIntArray630[local587];
			local585 = this.anIntArray629[local587];
			local581 = this.anIntArray626[local587];
			if (local142 == 1) {
				this.anIntArray625[local587] = local30.method3111();
			}
		}
		local10.anInt3487 = local321;
		local15.anInt3487 = local237;
		local20.anInt3487 = local253;
		local25.anInt3487 = local287;
		local30.anInt3487 = local265;
		local35.anInt3487 = local303;
		local40.anInt3487 = local315;
		for (local593 = 0; local593 < this.anInt7254; local593++) {
			this.aShortArray108[local593] = (short) local10.method3108();
			if (local76) {
				this.aByteArray93[local593] = local15.method3116();
			}
			if (local126 == 255) {
				this.aByteArray94[local593] = local20.method3116();
			}
			if (local130 == 1) {
				this.aByteArray89[local593] = local25.method3116();
			}
			if (local134 == 1) {
				this.anIntArray634[local593] = local30.method3111();
			}
			if (local138 == 1) {
				this.aShortArray110[local593] = (short) (local35.method3108() - 1);
			}
			if (this.aByteArray92 != null) {
				if (this.aShortArray110[local593] == -1) {
					this.aByteArray92[local593] = -1;
				} else {
					this.aByteArray92[local593] = (byte) (local40.method3111() - 1);
				}
			}
		}
		this.anInt7253 = -1;
		local10.anInt3487 = local297;
		local15.anInt3487 = local246;
		@Pc(816) short local816 = 0;
		@Pc(818) short local818 = 0;
		@Pc(820) short local820 = 0;
		@Pc(822) short local822 = 0;
		@Pc(830) int local830;
		for (@Pc(824) int local824 = 0; local824 < this.anInt7254; local824++) {
			local830 = local15.method3111();
			if (local830 == 1) {
				local816 = (short) (local10.method3125() + local822);
				local818 = (short) (local816 + local10.method3125());
				local820 = (short) (local818 + local10.method3125());
				local822 = local820;
				this.aShortArray112[local824] = local816;
				this.aShortArray105[local824] = local818;
				this.aShortArray111[local824] = local820;
				if (this.anInt7253 < local816) {
					this.anInt7253 = local816;
				}
				if (this.anInt7253 < local818) {
					this.anInt7253 = local818;
				}
				if (local820 > this.anInt7253) {
					this.anInt7253 = local820;
				}
			}
			if (local830 == 2) {
				local818 = local820;
				local820 = (short) (local10.method3125() + local822);
				local822 = local820;
				this.aShortArray112[local824] = local816;
				this.aShortArray105[local824] = local818;
				this.aShortArray111[local824] = local820;
				if (this.anInt7253 < local820) {
					this.anInt7253 = local820;
				}
			}
			if (local830 == 3) {
				local816 = local820;
				local820 = (short) (local10.method3125() + local822);
				this.aShortArray112[local824] = local816;
				local822 = local820;
				this.aShortArray105[local824] = local818;
				this.aShortArray111[local824] = local820;
				if (local820 > this.anInt7253) {
					this.anInt7253 = local820;
				}
			}
			if (local830 == 4) {
				@Pc(995) short local995 = local816;
				local816 = local818;
				local820 = (short) (local10.method3125() + local822);
				local818 = local995;
				local822 = local820;
				this.aShortArray112[local824] = local816;
				this.aShortArray105[local824] = local995;
				this.aShortArray111[local824] = local820;
				if (local820 > this.anInt7253) {
					this.anInt7253 = local820;
				}
			}
		}
		local10.anInt3487 = local348;
		this.anInt7253++;
		local15.anInt3487 = local356;
		local20.anInt3487 = local372;
		local25.anInt3487 = local380;
		local30.anInt3487 = local386;
		local35.anInt3487 = local392;
		@Pc(1078) int local1078;
		for (local830 = 0; local830 < this.anInt7248; local830++) {
			local1078 = this.aByteArray91[local830] & 0xFF;
			if (local1078 == 0) {
				this.aShortArray104[local830] = (short) local10.method3108();
				this.aShortArray107[local830] = (short) local10.method3108();
				this.aShortArray109[local830] = (short) local10.method3108();
			}
			if (local1078 == 1) {
				this.aShortArray104[local830] = (short) local15.method3108();
				this.aShortArray107[local830] = (short) local15.method3108();
				this.aShortArray109[local830] = (short) local15.method3108();
				this.anIntArray633[local830] = local20.method3108();
				if (this.anInt7237 < 14) {
					this.anIntArray627[local830] = local20.method3108();
				} else {
					this.anIntArray627[local830] = local20.method3078();
				}
				this.anIntArray631[local830] = local20.method3108();
				this.aByteArray95[local830] = local25.method3116();
				this.aByteArray90[local830] = local30.method3116();
				this.anIntArray624[local830] = local35.method3116();
			}
			if (local1078 == 2) {
				this.aShortArray104[local830] = (short) local15.method3108();
				this.aShortArray107[local830] = (short) local15.method3108();
				this.aShortArray109[local830] = (short) local15.method3108();
				this.anIntArray633[local830] = local20.method3108();
				if (this.anInt7237 >= 14) {
					this.anIntArray627[local830] = local20.method3078();
				} else {
					this.anIntArray627[local830] = local20.method3108();
				}
				this.anIntArray631[local830] = local20.method3108();
				this.aByteArray95[local830] = local25.method3116();
				this.aByteArray90[local830] = local30.method3116();
				this.anIntArray624[local830] = local35.method3116();
				this.anIntArray628[local830] = local35.method3116();
				this.anIntArray632[local830] = local35.method3116();
			}
			if (local1078 == 3) {
				this.aShortArray104[local830] = (short) local15.method3108();
				this.aShortArray107[local830] = (short) local15.method3108();
				this.aShortArray109[local830] = (short) local15.method3108();
				this.anIntArray633[local830] = local20.method3108();
				if (this.anInt7237 >= 14) {
					this.anIntArray627[local830] = local20.method3078();
				} else {
					this.anIntArray627[local830] = local20.method3108();
				}
				this.anIntArray631[local830] = local20.method3108();
				this.aByteArray95[local830] = local25.method3116();
				this.aByteArray90[local830] = local30.method3116();
				this.anIntArray624[local830] = local35.method3116();
			}
		}
		local10.anInt3487 = local184;
		@Pc(1421) int local1421;
		@Pc(1427) int local1427;
		@Pc(1431) int local1431;
		@Pc(1494) int local1494;
		if (local85) {
			local1078 = local10.method3111();
			if (local1078 > 0) {
				this.aClass192Array3 = new Class192[local1078];
				for (local1421 = 0; local1421 < local1078; local1421++) {
					local1427 = local10.method3108();
					local1431 = local10.method3108();
					@Pc(1437) byte local1437;
					if (local126 == 255) {
						local1437 = this.aByteArray94[local1431];
					} else {
						local1437 = (byte) local126;
					}
					this.aClass192Array3[local1421] = new Class192(local1427, this.aShortArray112[local1431], this.aShortArray105[local1431], this.aShortArray111[local1431], local1437);
				}
			}
			local1421 = local10.method3111();
			if (local1421 > 0) {
				this.aClass161Array3 = new Class161[local1421];
				for (local1427 = 0; local1427 < local1421; local1427++) {
					local1431 = local10.method3108();
					local1494 = local10.method3108();
					this.aClass161Array3[local1427] = new Class161(local1431, local1494);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1078 = local10.method3111();
		if (local1078 <= 0) {
			return;
		}
		this.aClass15Array1 = new Class15[local1078];
		for (local1421 = 0; local1421 < local1078; local1421++) {
			local1427 = local10.method3108();
			local1431 = local10.method3108();
			local1494 = local10.method3111();
			@Pc(1546) byte local1546 = local10.method3116();
			this.aClass15Array1[local1421] = new Class15(local1427, local1431, local1494, local1546);
		}
		return;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIIB)I")
	public int method5965(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(13) int local13 = 0; local13 < this.anInt7245; local13++) {
			if (arg2 == this.anIntArray626[local13] && this.anIntArray630[local13] == arg0 && arg1 == this.anIntArray629[local13]) {
				return local13;
			}
		}
		this.anIntArray626[this.anInt7245] = arg2;
		this.anIntArray630[this.anInt7245] = arg0;
		this.anIntArray629[this.anInt7245] = arg1;
		this.anInt7253 = this.anInt7245 + 1;
		return this.anInt7245++;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(SBIIBIBBS)I")
	public int method5966(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray112[this.anInt7254] = (short) arg4;
		this.aShortArray105[this.anInt7254] = (short) arg2;
		this.aShortArray111[this.anInt7254] = (short) arg3;
		this.aByteArray93[this.anInt7254] = arg5;
		this.aByteArray92[this.anInt7254] = arg6;
		this.aShortArray108[this.anInt7254] = arg0;
		this.aByteArray89[this.anInt7254] = arg1;
		this.aShortArray110[this.anInt7254] = arg7;
		return this.anInt7254++;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(Z)[[I")
	public int[][] method5967() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt7253; local12++) {
			@Pc(19) int local19 = this.anIntArray625[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(43) int[][] local43 = new int[local10 + 1][];
		for (@Pc(45) int local45 = 0; local45 <= local10; local45++) {
			local43[local45] = new int[local8[local45]];
			local8[local45] = 0;
		}
		for (@Pc(71) int local71 = 0; local71 < this.anInt7253; local71++) {
			@Pc(78) int local78 = this.anIntArray625[local71];
			if (local78 >= 0) {
				local43[local78][local8[local78]++] = local71;
			}
		}
		return local43;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(ISILclient!wr;)I")
	private int method5968(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class266 arg2) {
		@Pc(10) int local10 = arg2.anIntArray626[arg0];
		@Pc(15) int local15 = arg2.anIntArray630[arg0];
		@Pc(20) int local20 = arg2.anIntArray629[arg0];
		for (@Pc(22) int local22 = 0; local22 < this.anInt7245; local22++) {
			if (local10 == this.anIntArray626[local22] && local15 == this.anIntArray630[local22] && local20 == this.anIntArray629[local22]) {
				this.aShortArray106[local22] |= arg1;
				return local22;
			}
		}
		this.anIntArray626[this.anInt7245] = local10;
		this.anIntArray630[this.anInt7245] = local15;
		this.anIntArray629[this.anInt7245] = local20;
		this.aShortArray106[this.anInt7245] = arg1;
		this.anIntArray625[this.anInt7245] = arg2.anIntArray625 == null ? -1 : arg2.anIntArray625[arg0];
		return this.anInt7245++;
	}

	@OriginalMember(owner = "client!wr", name = "b", descriptor = "(B)[[I")
	public int[][] method5969() {
		@Pc(14) int[] local14 = new int[256];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt7254; local18++) {
			@Pc(25) int local25 = this.anIntArray634[local18];
			if (local25 >= 0) {
				@Pc(31) int local31 = local14[local25]++;
				if (local16 < local25) {
					local16 = local25;
				}
			}
		}
		@Pc(53) int[][] local53 = new int[local16 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local16; local55++) {
			local53[local55] = new int[local14[local55]];
			local14[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt7254; local78++) {
			@Pc(85) int local85 = this.anIntArray634[local78];
			if (local85 >= 0) {
				local53[local85][local14[local85]++] = local78;
			}
		}
		return local53;
	}

	@OriginalMember(owner = "client!wr", name = "a", descriptor = "(B[B)V")
	private void method5970(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub15 local14 = new Class6_Sub15(arg0);
		@Pc(19) Class6_Sub15 local19 = new Class6_Sub15(arg0);
		@Pc(24) Class6_Sub15 local24 = new Class6_Sub15(arg0);
		@Pc(29) Class6_Sub15 local29 = new Class6_Sub15(arg0);
		@Pc(34) Class6_Sub15 local34 = new Class6_Sub15(arg0);
		local14.anInt3487 = arg0.length - 18;
		this.anInt7245 = local14.method3108();
		this.anInt7254 = local14.method3108();
		this.anInt7248 = local14.method3111();
		@Pc(59) int local59 = local14.method3111();
		@Pc(63) int local63 = local14.method3111();
		@Pc(67) int local67 = local14.method3111();
		@Pc(71) int local71 = local14.method3111();
		@Pc(75) int local75 = local14.method3111();
		@Pc(79) int local79 = local14.method3108();
		@Pc(83) int local83 = local14.method3108();
		@Pc(87) int local87 = local14.method3108();
		@Pc(91) int local91 = local14.method3108();
		@Pc(100) int local100 = this.anInt7245;
		@Pc(102) int local102 = local100;
		local100 += this.anInt7254;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt7254;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt7254;
		}
		@Pc(133) int local133 = local100;
		if (local59 == 1) {
			local100 += this.anInt7254;
		}
		@Pc(143) int local143 = local100;
		if (local75 == 1) {
			local100 += this.anInt7245;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt7254;
		}
		@Pc(163) int local163 = local100;
		local100 += local91;
		@Pc(169) int local169 = local100;
		local100 += this.anInt7254 * 2;
		@Pc(178) int local178 = local100;
		local100 += this.anInt7248 * 6;
		@Pc(187) int local187 = local100;
		local100 += local79;
		@Pc(193) int local193 = local100;
		local100 += local83;
		if (local75 == 1) {
			this.anIntArray625 = new int[this.anInt7245];
		}
		if (local67 == 1) {
			this.aByteArray89 = new byte[this.anInt7254];
		}
		this.anIntArray626 = new int[this.anInt7245];
		this.aShortArray112 = new short[this.anInt7254];
		this.anIntArray629 = new int[this.anInt7245];
		this.anIntArray630 = new int[this.anInt7245];
		local14.anInt3487 = 0;
		if (local59 == 1) {
			this.aByteArray92 = new byte[this.anInt7254];
			this.aByteArray93 = new byte[this.anInt7254];
			this.aShortArray110 = new short[this.anInt7254];
		}
		if (local71 == 1) {
			this.anIntArray634 = new int[this.anInt7254];
		}
		if (this.anInt7248 > 0) {
			this.aByteArray91 = new byte[this.anInt7248];
			this.aShortArray104 = new short[this.anInt7248];
			this.aShortArray107 = new short[this.anInt7248];
			this.aShortArray109 = new short[this.anInt7248];
		}
		this.aShortArray108 = new short[this.anInt7254];
		this.aShortArray111 = new short[this.anInt7254];
		if (local63 == 255) {
			this.aByteArray94 = new byte[this.anInt7254];
		} else {
			this.aByte102 = (byte) local63;
		}
		this.aShortArray105 = new short[this.anInt7254];
		local19.anInt3487 = local187;
		local24.anInt3487 = local193;
		local29.anInt3487 = local100;
		local34.anInt3487 = local143;
		@Pc(341) int local341 = 0;
		@Pc(343) int local343 = 0;
		@Pc(345) int local345 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(347) int local347 = 0; local347 < this.anInt7245; local347++) {
			local359 = local14.method3111();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method3125();
			}
			@Pc(374) int local374 = 0;
			if ((local359 & 0x2) != 0) {
				local374 = local24.method3125();
			}
			@Pc(384) int local384 = 0;
			if ((local359 & 0x4) != 0) {
				local384 = local29.method3125();
			}
			this.anIntArray626[local347] = local341 + local361;
			this.anIntArray630[local347] = local343 + local374;
			this.anIntArray629[local347] = local345 + local384;
			local343 = this.anIntArray630[local347];
			local341 = this.anIntArray626[local347];
			local345 = this.anIntArray629[local347];
			if (local75 == 1) {
				this.anIntArray625[local347] = local34.method3111();
			}
		}
		local14.anInt3487 = local169;
		local19.anInt3487 = local133;
		local24.anInt3487 = local109;
		local29.anInt3487 = local153;
		local34.anInt3487 = local121;
		for (local359 = 0; local359 < this.anInt7254; local359++) {
			this.aShortArray108[local359] = (short) local14.method3108();
			if (local59 == 1) {
				local361 = local19.method3111();
				if ((local361 & 0x1) == 1) {
					this.aByteArray93[local359] = 1;
					local7 = true;
				} else {
					this.aByteArray93[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray92[local359] = (byte) (local361 >> 2);
					this.aShortArray110[local359] = this.aShortArray108[local359];
					this.aShortArray108[local359] = 127;
					if (this.aShortArray110[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray92[local359] = -1;
					this.aShortArray110[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray94[local359] = local24.method3116();
			}
			if (local67 == 1) {
				this.aByteArray89[local359] = local29.method3116();
			}
			if (local71 == 1) {
				this.anIntArray634[local359] = local34.method3111();
			}
		}
		local14.anInt3487 = local163;
		this.anInt7253 = -1;
		local19.anInt3487 = local102;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(622) int local622;
		for (@Pc(616) int local616 = 0; local616 < this.anInt7254; local616++) {
			local622 = local19.method3111();
			if (local622 == 1) {
				local608 = (short) (local14.method3125() + local614);
				local610 = (short) (local608 + local14.method3125());
				local612 = (short) (local610 + local14.method3125());
				local614 = local612;
				this.aShortArray112[local616] = local608;
				this.aShortArray105[local616] = local610;
				this.aShortArray111[local616] = local612;
				if (this.anInt7253 < local608) {
					this.anInt7253 = local608;
				}
				if (this.anInt7253 < local610) {
					this.anInt7253 = local610;
				}
				if (local612 > this.anInt7253) {
					this.anInt7253 = local612;
				}
			}
			if (local622 == 2) {
				local610 = local612;
				local612 = (short) (local14.method3125() + local614);
				local614 = local612;
				this.aShortArray112[local616] = local608;
				this.aShortArray105[local616] = local610;
				this.aShortArray111[local616] = local612;
				if (local612 > this.anInt7253) {
					this.anInt7253 = local612;
				}
			}
			if (local622 == 3) {
				local608 = local612;
				local612 = (short) (local614 + local14.method3125());
				local614 = local612;
				this.aShortArray112[local616] = local608;
				this.aShortArray105[local616] = local610;
				this.aShortArray111[local616] = local612;
				if (local612 > this.anInt7253) {
					this.anInt7253 = local612;
				}
			}
			if (local622 == 4) {
				@Pc(781) short local781 = local608;
				local608 = local610;
				local610 = local781;
				local612 = (short) (local14.method3125() + local614);
				local614 = local612;
				this.aShortArray112[local616] = local608;
				this.aShortArray105[local616] = local781;
				this.aShortArray111[local616] = local612;
				if (this.anInt7253 < local612) {
					this.anInt7253 = local612;
				}
			}
		}
		this.anInt7253++;
		local14.anInt3487 = local178;
		for (local622 = 0; local622 < this.anInt7248; local622++) {
			this.aByteArray91[local622] = 0;
			this.aShortArray104[local622] = (short) local14.method3108();
			this.aShortArray107[local622] = (short) local14.method3108();
			this.aShortArray109[local622] = (short) local14.method3108();
		}
		if (this.aByteArray92 != null) {
			@Pc(873) boolean local873 = false;
			for (@Pc(875) int local875 = 0; local875 < this.anInt7254; local875++) {
				@Pc(884) int local884 = this.aByteArray92[local875] & 0xFF;
				if (local884 != 255) {
					if ((this.aShortArray104[local884] & 0xFFFF) == this.aShortArray112[local875] && (this.aShortArray107[local884] & 0xFFFF) == this.aShortArray105[local875] && (this.aShortArray109[local884] & 0xFFFF) == this.aShortArray111[local875]) {
						this.aByteArray92[local875] = -1;
					} else {
						local873 = true;
					}
				}
			}
			if (!local873) {
				this.aByteArray92 = null;
			}
		}
		if (!local9) {
			this.aShortArray110 = null;
		}
		if (!local7) {
			this.aByteArray93 = null;
		}
	}

	@OriginalMember(owner = "client!wr", name = "c", descriptor = "(B)[[I")
	public int[][] method5971() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass15Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass15Array1[local12].anInt318;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass15Array1.length; local70++) {
			@Pc(86) int local86 = this.aClass15Array1[local70].anInt318;
			if (local86 >= 0) {
				local45[local86][local8[local86]++] = local70;
			}
		}
		return local45;
	}
}
