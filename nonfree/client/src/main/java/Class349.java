import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class349 {

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "[I")
	public int[] anIntArray763;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "[S")
	public short[] aShortArray165;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "[I")
	public int[] anIntArray764;

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "[I")
	public int[] anIntArray765;

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "[I")
	public int[] anIntArray766;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "[I")
	public int[] anIntArray767;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "[I")
	public int[] anIntArray768;

	@OriginalMember(owner = "client!ur", name = "r", descriptor = "[S")
	public short[] aShortArray166;

	@OriginalMember(owner = "client!ur", name = "t", descriptor = "[I")
	public int[] anIntArray769;

	@OriginalMember(owner = "client!ur", name = "u", descriptor = "[I")
	public int[] anIntArray770;

	@OriginalMember(owner = "client!ur", name = "v", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!ur", name = "y", descriptor = "[Lclient!cm;")
	public Class57[] aClass57Array5;

	@OriginalMember(owner = "client!ur", name = "z", descriptor = "[S")
	public short[] aShortArray167;

	@OriginalMember(owner = "client!ur", name = "A", descriptor = "[S")
	public short[] aShortArray168;

	@OriginalMember(owner = "client!ur", name = "B", descriptor = "[Lclient!kp;")
	public Class196[] aClass196Array1;

	@OriginalMember(owner = "client!ur", name = "C", descriptor = "[S")
	public short[] aShortArray169;

	@OriginalMember(owner = "client!ur", name = "H", descriptor = "[S")
	public short[] aShortArray170;

	@OriginalMember(owner = "client!ur", name = "I", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!ur", name = "J", descriptor = "[S")
	public short[] aShortArray171;

	@OriginalMember(owner = "client!ur", name = "K", descriptor = "[I")
	public int[] anIntArray771;

	@OriginalMember(owner = "client!ur", name = "L", descriptor = "[I")
	public int[] anIntArray772;

	@OriginalMember(owner = "client!ur", name = "N", descriptor = "[Lclient!hi;")
	public Class143[] aClass143Array5;

	@OriginalMember(owner = "client!ur", name = "O", descriptor = "[B")
	public byte[] aByteArray95;

	@OriginalMember(owner = "client!ur", name = "R", descriptor = "[S")
	public short[] aShortArray172;

	@OriginalMember(owner = "client!ur", name = "W", descriptor = "[I")
	public int[] anIntArray774;

	@OriginalMember(owner = "client!ur", name = "X", descriptor = "[S")
	public short[] aShortArray173;

	@OriginalMember(owner = "client!ur", name = "Z", descriptor = "[B")
	public byte[] aByteArray96;

	@OriginalMember(owner = "client!ur", name = "ab", descriptor = "[S")
	public short[] aShortArray174;

	@OriginalMember(owner = "client!ur", name = "db", descriptor = "[B")
	public byte[] aByteArray97;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	public int anInt9571 = 0;

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "I")
	public int anInt9574 = 0;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "B")
	public byte aByte128 = 0;

	@OriginalMember(owner = "client!ur", name = "G", descriptor = "I")
	public int anInt9580 = 12;

	@OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
	public int anInt9582 = 0;

	@OriginalMember(owner = "client!ur", name = "cb", descriptor = "I")
	public int anInt9589 = 0;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
	private Class349() {
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([B)V")
	public Class349(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method8222(arg0);
		} else {
			this.method8216(arg0);
		}
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(III)V")
	public Class349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray170 = new short[arg1];
		this.aByteArray95 = new byte[arg1];
		this.aShortArray171 = new short[arg1];
		this.aShortArray165 = new short[arg1];
		this.aByteArray97 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray173 = new short[arg2];
			this.aByteArray94 = new byte[arg2];
			this.anIntArray765 = new int[arg2];
			this.aByteArray92 = new byte[arg2];
			this.anIntArray770 = new int[arg2];
			this.anIntArray767 = new int[arg2];
			this.aByteArray93 = new byte[arg2];
			this.anIntArray772 = new int[arg2];
			this.anIntArray763 = new int[arg2];
			this.anIntArray768 = new int[arg2];
			this.aShortArray168 = new short[arg2];
			this.aShortArray169 = new short[arg2];
		}
		this.aByteArray96 = new byte[arg1];
		this.aShortArray174 = new short[arg1];
		this.anIntArray764 = new int[arg0];
		this.anIntArray766 = new int[arg1];
		this.anIntArray771 = new int[arg0];
		this.anIntArray774 = new int[arg0];
		this.aShortArray167 = new short[arg1];
		this.aByteArray91 = new byte[arg1];
		this.anIntArray769 = new int[arg0];
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "([Lclient!ur;I)V")
	public Class349(@OriginalArg(0) Class349[] arg0, @OriginalArg(1) int arg1) {
		this.anInt9582 = 0;
		this.anInt9571 = 0;
		this.anInt9574 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte128 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class349 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt9582 += local59.anInt9582;
				this.anInt9571 += local59.anInt9571;
				this.anInt9574 += local59.anInt9574;
				if (local59.aClass143Array5 != null) {
					local34 += local59.aClass143Array5.length;
				}
				if (local59.aClass196Array1 != null) {
					local36 += local59.aClass196Array1.length;
				}
				local38 |= local59.aByteArray97 != null;
				if (local59.aClass57Array5 != null) {
					local32 += local59.aClass57Array5.length;
				}
				local42 |= local59.aByteArray95 != null;
				local44 |= local59.aByteArray91 != null;
				if (local59.aByteArray96 == null) {
					if (this.aByte128 == -1) {
						this.aByte128 = local59.aByte128;
					}
					if (local59.aByte128 != this.aByte128) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray171 != null;
				local51 |= local59.anIntArray766 != null;
			}
		}
		if (local38) {
			this.aByteArray97 = new byte[this.anInt9571];
		}
		this.anIntArray774 = new int[this.anInt9582];
		this.aShortArray166 = new short[this.anInt9582];
		if (this.anInt9574 > 0) {
			this.anIntArray770 = new int[this.anInt9574];
			this.anIntArray767 = new int[this.anInt9574];
			this.aShortArray169 = new short[this.anInt9574];
			this.aByteArray93 = new byte[this.anInt9574];
			this.anIntArray763 = new int[this.anInt9574];
			this.anIntArray765 = new int[this.anInt9574];
			this.aShortArray173 = new short[this.anInt9574];
			this.anIntArray768 = new int[this.anInt9574];
			this.aByteArray94 = new byte[this.anInt9574];
			this.anIntArray772 = new int[this.anInt9574];
			this.aByteArray92 = new byte[this.anInt9574];
			this.aShortArray168 = new short[this.anInt9574];
		}
		this.aShortArray165 = new short[this.anInt9571];
		this.anIntArray764 = new int[this.anInt9582];
		this.aShortArray174 = new short[this.anInt9571];
		if (local32 > 0) {
			this.aClass57Array5 = new Class57[local32];
		}
		this.anIntArray769 = new int[this.anInt9582];
		if (local44) {
			this.aByteArray91 = new byte[this.anInt9571];
		}
		this.aShortArray172 = new short[this.anInt9571];
		if (local46) {
			this.aShortArray171 = new short[this.anInt9571];
		}
		this.aShortArray170 = new short[this.anInt9571];
		if (local34 > 0) {
			this.aClass143Array5 = new Class143[local34];
		}
		this.aShortArray167 = new short[this.anInt9571];
		if (local51) {
			this.anIntArray766 = new int[this.anInt9571];
		}
		if (local42) {
			this.aByteArray95 = new byte[this.anInt9571];
		}
		if (local36 > 0) {
			this.aClass196Array1 = new Class196[local36];
		}
		this.anIntArray771 = new int[this.anInt9582];
		if (local40) {
			this.aByteArray96 = new byte[this.anInt9571];
		}
		local32 = 0;
		this.anInt9574 = 0;
		local36 = 0;
		local34 = 0;
		this.anInt9571 = 0;
		this.anInt9582 = 0;
		@Pc(615) int local615;
		@Pc(626) int local626;
		for (@Pc(379) int local379 = 0; local379 < arg1; local379++) {
			@Pc(386) short local386 = (short) (0x1 << local379);
			@Pc(390) Class349 local390 = arg0[local379];
			if (local390 != null) {
				@Pc(397) int local397;
				if (local390.aClass196Array1 != null) {
					for (local397 = 0; local397 < local390.aClass196Array1.length; local397++) {
						@Pc(404) Class196 local404 = local390.aClass196Array1[local397];
						this.aClass196Array1[local36++] = local404.method4349(local404.anInt4752 + this.anInt9571);
					}
				}
				for (local397 = 0; local397 < local390.anInt9571; local397++) {
					if (local38 && local390.aByteArray97 != null) {
						this.aByteArray97[this.anInt9571] = local390.aByteArray97[local397];
					}
					if (local40) {
						if (local390.aByteArray96 == null) {
							this.aByteArray96[this.anInt9571] = local390.aByte128;
						} else {
							this.aByteArray96[this.anInt9571] = local390.aByteArray96[local397];
						}
					}
					if (local42 && local390.aByteArray95 != null) {
						this.aByteArray95[this.anInt9571] = local390.aByteArray95[local397];
					}
					if (local46) {
						if (local390.aShortArray171 == null) {
							this.aShortArray171[this.anInt9571] = -1;
						} else {
							this.aShortArray171[this.anInt9571] = local390.aShortArray171[local397];
						}
					}
					if (local51) {
						if (local390.anIntArray766 == null) {
							this.anIntArray766[this.anInt9571] = -1;
						} else {
							this.anIntArray766[this.anInt9571] = local390.anIntArray766[local397];
						}
					}
					this.aShortArray167[this.anInt9571] = (short) this.method8227(local386, local390.aShortArray167[local397], local390);
					this.aShortArray165[this.anInt9571] = (short) this.method8227(local386, local390.aShortArray165[local397], local390);
					this.aShortArray174[this.anInt9571] = (short) this.method8227(local386, local390.aShortArray174[local397], local390);
					this.aShortArray172[this.anInt9571] = local386;
					this.aShortArray170[this.anInt9571] = local390.aShortArray170[local397];
					this.anInt9571++;
				}
				@Pc(602) int local602;
				if (local390.aClass57Array5 != null) {
					for (local602 = 0; local602 < local390.aClass57Array5.length; local602++) {
						local615 = this.method8227(local386, local390.aClass57Array5[local602].anInt1261, local390);
						local626 = this.method8227(local386, local390.aClass57Array5[local602].anInt1265, local390);
						@Pc(637) int local637 = this.method8227(local386, local390.aClass57Array5[local602].anInt1270, local390);
						this.aClass57Array5[local32] = local390.aClass57Array5[local602].method1236(local626, local637, local615);
						local32++;
					}
				}
				if (local390.aClass143Array5 != null) {
					for (local602 = 0; local602 < local390.aClass143Array5.length; local602++) {
						local615 = this.method8227(local386, local390.aClass143Array5[local602].anInt3651, local390);
						this.aClass143Array5[local34] = local390.aClass143Array5[local602].method3228(local615);
						local34++;
					}
				}
			}
		}
		this.anInt9589 = this.anInt9582;
		@Pc(707) int local707 = 0;
		for (@Pc(709) int local709 = 0; local709 < arg1; local709++) {
			@Pc(716) short local716 = (short) (0x1 << local709);
			@Pc(720) Class349 local720 = arg0[local709];
			if (local720 != null) {
				for (local615 = 0; local615 < local720.anInt9571; local615++) {
					if (local44) {
						this.aByteArray91[local707++] = (byte) (local720.aByteArray91 == null || local720.aByteArray91[local615] == -1 ? -1 : this.anInt9574 + local720.aByteArray91[local615]);
					}
				}
				for (local626 = 0; local626 < local720.anInt9574; local626++) {
					@Pc(776) byte local776 = this.aByteArray92[this.anInt9574] = local720.aByteArray92[local626];
					if (local776 == 0) {
						this.aShortArray168[this.anInt9574] = (short) this.method8227(local716, local720.aShortArray168[local626], local720);
						this.aShortArray169[this.anInt9574] = (short) this.method8227(local716, local720.aShortArray169[local626], local720);
						this.aShortArray173[this.anInt9574] = (short) this.method8227(local716, local720.aShortArray173[local626], local720);
					}
					if (local776 >= 1 && local776 <= 3) {
						this.aShortArray168[this.anInt9574] = local720.aShortArray168[local626];
						this.aShortArray169[this.anInt9574] = local720.aShortArray169[local626];
						this.aShortArray173[this.anInt9574] = local720.aShortArray173[local626];
						this.anIntArray772[this.anInt9574] = local720.anIntArray772[local626];
						this.anIntArray765[this.anInt9574] = local720.anIntArray765[local626];
						this.anIntArray763[this.anInt9574] = local720.anIntArray763[local626];
						this.aByteArray94[this.anInt9574] = local720.aByteArray94[local626];
						this.aByteArray93[this.anInt9574] = local720.aByteArray93[local626];
						this.anIntArray770[this.anInt9574] = local720.anIntArray770[local626];
					}
					if (local776 == 2) {
						this.anIntArray767[this.anInt9574] = local720.anIntArray767[local626];
						this.anIntArray768[this.anInt9574] = local720.anIntArray768[local626];
					}
					this.anInt9574++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BBBBSISII)I")
	public int method8210(@OriginalArg(1) byte arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) short arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		this.aShortArray167[this.anInt9571] = (short) arg7;
		this.aShortArray165[this.anInt9571] = (short) arg4;
		this.aShortArray174[this.anInt9571] = (short) arg6;
		this.aByteArray97[this.anInt9571] = arg2;
		this.aByteArray91[this.anInt9571] = arg0;
		this.aShortArray170[this.anInt9571] = arg5;
		this.aByteArray95[this.anInt9571] = arg1;
		this.aShortArray171[this.anInt9571] = arg3;
		return this.anInt9571++;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)V")
	public void method8211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9582; local7++) {
			this.anIntArray764[local7] += arg0;
			this.anIntArray774[local7] += arg1;
			this.anIntArray769[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BI)V")
	public void method8212() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9582; local7++) {
			this.anIntArray764[local7] <<= 0x2;
			this.anIntArray774[local7] <<= 0x2;
			this.anIntArray769[local7] <<= 0x2;
		}
		if (this.anInt9574 <= 0 || this.anIntArray772 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray772.length; local58++) {
			this.anIntArray772[local58] <<= 0x2;
			this.anIntArray765[local58] <<= 0x2;
			if (this.aByteArray92[local58] != 1) {
				this.anIntArray763[local58] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(IIII)I")
	public int method8214(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9582; local7++) {
			if (this.anIntArray764[local7] == arg0 && arg2 == this.anIntArray774[local7] && arg1 == this.anIntArray769[local7]) {
				return local7;
			}
		}
		this.anIntArray764[this.anInt9582] = arg0;
		this.anIntArray774[this.anInt9582] = arg2;
		this.anIntArray769[this.anInt9582] = arg1;
		this.anInt9589 = this.anInt9582 + 1;
		return this.anInt9582++;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z[B)V")
	private void method8216(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class5_Sub12 local14 = new Class5_Sub12(arg0);
		@Pc(19) Class5_Sub12 local19 = new Class5_Sub12(arg0);
		@Pc(24) Class5_Sub12 local24 = new Class5_Sub12(arg0);
		@Pc(29) Class5_Sub12 local29 = new Class5_Sub12(arg0);
		@Pc(34) Class5_Sub12 local34 = new Class5_Sub12(arg0);
		local14.anInt10154 = arg0.length - 18;
		this.anInt9582 = local14.method8631();
		this.anInt9571 = local14.method8631();
		this.anInt9574 = local14.method8645();
		@Pc(59) int local59 = local14.method8645();
		@Pc(63) int local63 = local14.method8645();
		@Pc(67) int local67 = local14.method8645();
		@Pc(71) int local71 = local14.method8645();
		@Pc(75) int local75 = local14.method8645();
		@Pc(79) int local79 = local14.method8631();
		@Pc(83) int local83 = local14.method8631();
		@Pc(87) int local87 = local14.method8631();
		@Pc(91) int local91 = local14.method8631();
		@Pc(100) int local100 = this.anInt9582;
		@Pc(102) int local102 = local100;
		local100 += this.anInt9571;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt9571;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt9571;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt9571;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt9582;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt9571;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt9571 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt9574 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		local14.anInt10154 = 0;
		if (this.anInt9574 > 0) {
			this.aByteArray92 = new byte[this.anInt9574];
			this.aShortArray173 = new short[this.anInt9574];
			this.aShortArray169 = new short[this.anInt9574];
			this.aShortArray168 = new short[this.anInt9574];
		}
		if (local59 == 1) {
			this.aByteArray97 = new byte[this.anInt9571];
			this.aByteArray91 = new byte[this.anInt9571];
			this.aShortArray171 = new short[this.anInt9571];
		}
		if (local75 == 1) {
			this.anIntArray771 = new int[this.anInt9582];
		}
		this.anIntArray769 = new int[this.anInt9582];
		this.aShortArray167 = new short[this.anInt9571];
		this.aShortArray174 = new short[this.anInt9571];
		this.aShortArray165 = new short[this.anInt9571];
		this.anIntArray774 = new int[this.anInt9582];
		if (local71 == 1) {
			this.anIntArray766 = new int[this.anInt9571];
		}
		if (local67 == 1) {
			this.aByteArray95 = new byte[this.anInt9571];
		}
		this.aShortArray170 = new short[this.anInt9571];
		if (local63 == 255) {
			this.aByteArray96 = new byte[this.anInt9571];
		} else {
			this.aByte128 = (byte) local63;
		}
		this.anIntArray764 = new int[this.anInt9582];
		local19.anInt10154 = local189;
		local24.anInt10154 = local195;
		local29.anInt10154 = local100;
		local34.anInt10154 = local141;
		@Pc(344) int local344 = 0;
		@Pc(346) int local346 = 0;
		@Pc(348) int local348 = 0;
		@Pc(356) int local356;
		@Pc(358) int local358;
		for (@Pc(350) int local350 = 0; local350 < this.anInt9582; local350++) {
			local356 = local14.method8645();
			local358 = 0;
			if ((local356 & 0x1) != 0) {
				local358 = local19.method8646();
			}
			@Pc(371) int local371 = 0;
			if ((local356 & 0x2) != 0) {
				local371 = local24.method8646();
			}
			@Pc(381) int local381 = 0;
			if ((local356 & 0x4) != 0) {
				local381 = local29.method8646();
			}
			this.anIntArray764[local350] = local344 + local358;
			this.anIntArray774[local350] = local346 + local371;
			this.anIntArray769[local350] = local381 + local348;
			local346 = this.anIntArray774[local350];
			local344 = this.anIntArray764[local350];
			local348 = this.anIntArray769[local350];
			if (local75 == 1) {
				this.anIntArray771[local350] = local34.method8645();
			}
		}
		local14.anInt10154 = local171;
		local19.anInt10154 = local131;
		local24.anInt10154 = local109;
		local29.anInt10154 = local153;
		local34.anInt10154 = local119;
		for (local356 = 0; local356 < this.anInt9571; local356++) {
			this.aShortArray170[local356] = (short) local14.method8631();
			if (local59 == 1) {
				local358 = local19.method8645();
				if ((local358 & 0x1) == 1) {
					this.aByteArray97[local356] = 1;
					local7 = true;
				} else {
					this.aByteArray97[local356] = 0;
				}
				if ((local358 & 0x2) == 2) {
					this.aByteArray91[local356] = (byte) (local358 >> 2);
					this.aShortArray171[local356] = this.aShortArray170[local356];
					this.aShortArray170[local356] = 127;
					if (this.aShortArray171[local356] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray91[local356] = -1;
					this.aShortArray171[local356] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray96[local356] = local24.method8635();
			}
			if (local67 == 1) {
				this.aByteArray95[local356] = local29.method8635();
			}
			if (local71 == 1) {
				this.anIntArray766[local356] = local34.method8645();
			}
		}
		local14.anInt10154 = local165;
		this.anInt9589 = -1;
		local19.anInt10154 = local102;
		@Pc(605) short local605 = 0;
		@Pc(607) short local607 = 0;
		@Pc(609) short local609 = 0;
		@Pc(611) short local611 = 0;
		@Pc(619) int local619;
		for (@Pc(613) int local613 = 0; local613 < this.anInt9571; local613++) {
			local619 = local19.method8645();
			if (local619 == 1) {
				local605 = (short) (local611 + local14.method8646());
				local607 = (short) (local605 + local14.method8646());
				local609 = (short) (local607 + local14.method8646());
				this.aShortArray167[local613] = local605;
				local611 = local609;
				this.aShortArray165[local613] = local607;
				this.aShortArray174[local613] = local609;
				if (this.anInt9589 < local605) {
					this.anInt9589 = local605;
				}
				if (local607 > this.anInt9589) {
					this.anInt9589 = local607;
				}
				if (local609 > this.anInt9589) {
					this.anInt9589 = local609;
				}
			}
			if (local619 == 2) {
				local607 = local609;
				local609 = (short) (local14.method8646() + local611);
				this.aShortArray167[local613] = local605;
				local611 = local609;
				this.aShortArray165[local613] = local607;
				this.aShortArray174[local613] = local609;
				if (local609 > this.anInt9589) {
					this.anInt9589 = local609;
				}
			}
			if (local619 == 3) {
				local605 = local609;
				local609 = (short) (local14.method8646() + local611);
				local611 = local609;
				this.aShortArray167[local613] = local605;
				this.aShortArray165[local613] = local607;
				this.aShortArray174[local613] = local609;
				if (local609 > this.anInt9589) {
					this.anInt9589 = local609;
				}
			}
			if (local619 == 4) {
				@Pc(776) short local776 = local605;
				local605 = local607;
				local607 = local776;
				local609 = (short) (local611 + local14.method8646());
				this.aShortArray167[local613] = local605;
				local611 = local609;
				this.aShortArray165[local613] = local776;
				this.aShortArray174[local613] = local609;
				if (this.anInt9589 < local609) {
					this.anInt9589 = local609;
				}
			}
		}
		local14.anInt10154 = local180;
		this.anInt9589++;
		for (local619 = 0; local619 < this.anInt9574; local619++) {
			this.aByteArray92[local619] = 0;
			this.aShortArray168[local619] = (short) local14.method8631();
			this.aShortArray169[local619] = (short) local14.method8631();
			this.aShortArray173[local619] = (short) local14.method8631();
		}
		if (this.aByteArray91 != null) {
			@Pc(876) boolean local876 = false;
			for (@Pc(878) int local878 = 0; local878 < this.anInt9571; local878++) {
				@Pc(887) int local887 = this.aByteArray91[local878] & 0xFF;
				if (local887 != 255) {
					if (this.aShortArray167[local878] == (this.aShortArray168[local887] & 0xFFFF) && (this.aShortArray169[local887] & 0xFFFF) == this.aShortArray165[local878] && this.aShortArray174[local878] == (this.aShortArray173[local887] & 0xFFFF)) {
						this.aByteArray91[local878] = -1;
					} else {
						local876 = true;
					}
				}
			}
			if (!local876) {
				this.aByteArray91 = null;
			}
		}
		if (!local7) {
			this.aByteArray97 = null;
		}
		if (!local9) {
			this.aShortArray171 = null;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)[[I")
	public int[][] method8217() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt9571; local12++) {
			@Pc(19) int local19 = this.anIntArray766[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(49) int local49 = 0; local49 <= local10; local49++) {
			local47[local49] = new int[local8[local49]];
			local8[local49] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt9571; local78++) {
			@Pc(85) int local85 = this.anIntArray766[local78];
			if (local85 >= 0) {
				local47[local85][local8[local85]++] = local78;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(SSZBSSSSBB)B")
	public byte method8218() {
		if (this.anInt9574 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray92[this.anInt9574] = 3;
		this.aShortArray168[this.anInt9574] = 0;
		this.aShortArray169[this.anInt9574] = 32767;
		this.aShortArray173[this.anInt9574] = 0;
		this.anIntArray772[this.anInt9574] = 1024;
		this.anIntArray765[this.anInt9574] = 1024;
		this.anIntArray763[this.anInt9574] = 1024;
		this.aByteArray94[this.anInt9574] = 0;
		this.aByteArray93[this.anInt9574] = 0;
		this.anIntArray770[this.anInt9574] = 0;
		return (byte) this.anInt9574++;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ZI)[[I")
	public int[][] method8219(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(24) int local24 = arg0 ? this.anInt9582 : this.anInt9589;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			@Pc(33) int local33 = this.anIntArray771[local26];
			if (local33 >= 0) {
				@Pc(42) int local42 = local8[local33]++;
				if (local10 < local33) {
					local10 = local33;
				}
			}
		}
		@Pc(67) int[][] local67 = new int[local10 + 1][];
		for (@Pc(69) int local69 = 0; local69 <= local10; local69++) {
			local67[local69] = new int[local8[local69]];
			local8[local69] = 0;
		}
		for (@Pc(88) int local88 = 0; local88 < local24; local88++) {
			@Pc(95) int local95 = this.anIntArray771[local88];
			if (local95 >= 0) {
				local67[local95][local8[local95]++] = local88;
			}
		}
		return local67;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(IIII)V")
	public void method8220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(32) int local32;
		@Pc(50) int local50;
		if (arg0 != 0) {
			local26 = Class5_Sub12_Sub1.anIntArray748[arg0];
			local30 = Class5_Sub12_Sub1.anIntArray749[arg0];
			for (local32 = 0; local32 < this.anInt9582; local32++) {
				local50 = this.anIntArray764[local32] * local30 + this.anIntArray774[local32] * local26 >> 14;
				this.anIntArray774[local32] = this.anIntArray774[local32] * local30 - this.anIntArray764[local32] * local26 >> 14;
				this.anIntArray764[local32] = local50;
			}
		}
		if (arg2 != 0) {
			local26 = Class5_Sub12_Sub1.anIntArray748[arg2];
			local30 = Class5_Sub12_Sub1.anIntArray749[arg2];
			for (local32 = 0; local32 < this.anInt9582; local32++) {
				local50 = this.anIntArray774[local32] * local30 - local26 * this.anIntArray769[local32] >> 14;
				this.anIntArray769[local32] = local30 * this.anIntArray769[local32] + this.anIntArray774[local32] * local26 >> 14;
				this.anIntArray774[local32] = local50;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local26 = Class5_Sub12_Sub1.anIntArray748[arg1];
		local30 = Class5_Sub12_Sub1.anIntArray749[arg1];
		for (local32 = 0; local32 < this.anInt9582; local32++) {
			local50 = this.anIntArray764[local32] * local30 + this.anIntArray769[local32] * local26 >> 14;
			this.anIntArray769[local32] = this.anIntArray769[local32] * local30 - this.anIntArray764[local32] * local26 >> 14;
			this.anIntArray764[local32] = local50;
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)[[I")
	public int[][] method8221() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass196Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass196Array1[local12].anInt4756;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(47) int local47 = 0; local47 <= local10; local47++) {
			local45[local47] = new int[local8[local47]];
			local8[local47] = 0;
		}
		for (@Pc(70) int local70 = 0; local70 < this.aClass196Array1.length; local70++) {
			@Pc(78) int local78 = this.aClass196Array1[local70].anInt4756;
			if (local78 >= 0) {
				local45[local78][local8[local78]++] = local70;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I[B)V")
	private void method8222(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class5_Sub12 local10 = new Class5_Sub12(arg0);
		@Pc(15) Class5_Sub12 local15 = new Class5_Sub12(arg0);
		@Pc(20) Class5_Sub12 local20 = new Class5_Sub12(arg0);
		@Pc(25) Class5_Sub12 local25 = new Class5_Sub12(arg0);
		@Pc(30) Class5_Sub12 local30 = new Class5_Sub12(arg0);
		@Pc(35) Class5_Sub12 local35 = new Class5_Sub12(arg0);
		@Pc(40) Class5_Sub12 local40 = new Class5_Sub12(arg0);
		local10.anInt10154 = arg0.length - 23;
		this.anInt9582 = local10.method8631();
		this.anInt9571 = local10.method8631();
		this.anInt9574 = local10.method8645();
		@Pc(65) int local65 = local10.method8645();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(92) boolean local92 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt10154 -= 7;
			this.anInt9580 = local10.method8645();
			local10.anInt10154 += 6;
		}
		@Pc(126) int local126 = local10.method8645();
		@Pc(130) int local130 = local10.method8645();
		@Pc(134) int local134 = local10.method8645();
		@Pc(138) int local138 = local10.method8645();
		@Pc(142) int local142 = local10.method8645();
		@Pc(146) int local146 = local10.method8631();
		@Pc(150) int local150 = local10.method8631();
		@Pc(154) int local154 = local10.method8631();
		@Pc(158) int local158 = local10.method8631();
		@Pc(162) int local162 = local10.method8631();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(181) int local181;
		if (this.anInt9574 > 0) {
			this.aByteArray92 = new byte[this.anInt9574];
			local10.anInt10154 = 0;
			for (local181 = 0; local181 < this.anInt9574; local181++) {
				@Pc(192) byte local192 = this.aByteArray92[local181] = local10.method8635();
				if (local192 >= 1 && local192 <= 3) {
					local166++;
				}
				if (local192 == 0) {
					local164++;
				}
				if (local192 == 2) {
					local168++;
				}
			}
		}
		local181 = this.anInt9574;
		@Pc(226) int local226 = local181;
		local181 += this.anInt9582;
		@Pc(233) int local233 = local181;
		if (local74) {
			local181 += this.anInt9571;
		}
		@Pc(242) int local242 = local181;
		local181 += this.anInt9571;
		@Pc(249) int local249 = local181;
		if (local126 == 255) {
			local181 += this.anInt9571;
		}
		@Pc(261) int local261 = local181;
		if (local134 == 1) {
			local181 += this.anInt9571;
		}
		@Pc(273) int local273 = local181;
		if (local142 == 1) {
			local181 += this.anInt9582;
		}
		@Pc(283) int local283 = local181;
		if (local130 == 1) {
			local181 += this.anInt9571;
		}
		@Pc(293) int local293 = local181;
		local181 += local158;
		@Pc(299) int local299 = local181;
		if (local138 == 1) {
			local181 += this.anInt9571 * 2;
		}
		@Pc(313) int local313 = local181;
		local181 += local162;
		@Pc(319) int local319 = local181;
		local181 += this.anInt9571 * 2;
		@Pc(328) int local328 = local181;
		local181 += local146;
		@Pc(334) int local334 = local181;
		local181 += local150;
		@Pc(340) int local340 = local181;
		local181 += local154;
		@Pc(346) int local346 = local181;
		local181 += local164 * 6;
		@Pc(354) int local354 = local181;
		local181 += local166 * 6;
		@Pc(362) byte local362 = 6;
		if (this.anInt9580 == 14) {
			local362 = 7;
		} else if (this.anInt9580 >= 15) {
			local362 = 9;
		}
		@Pc(378) int local378 = local181;
		local181 += local166 * local362;
		@Pc(386) int local386 = local181;
		local181 += local166;
		@Pc(392) int local392 = local181;
		local181 += local166;
		@Pc(398) int local398 = local181;
		local181 += local168 * 2 + local166;
		this.aShortArray167 = new short[this.anInt9571];
		if (this.anInt9574 > 0) {
			if (local168 > 0) {
				this.anIntArray768 = new int[local168];
				this.anIntArray767 = new int[local168];
			}
			this.aShortArray169 = new short[this.anInt9574];
			this.aShortArray168 = new short[this.anInt9574];
			this.aShortArray173 = new short[this.anInt9574];
			if (local166 > 0) {
				this.anIntArray765 = new int[local166];
				this.aByteArray93 = new byte[local166];
				this.anIntArray772 = new int[local166];
				this.anIntArray763 = new int[local166];
				this.anIntArray770 = new int[local166];
				this.aByteArray94 = new byte[local166];
			}
		}
		if (local134 == 1) {
			this.anIntArray766 = new int[this.anInt9571];
		}
		this.aShortArray165 = new short[this.anInt9571];
		if (local142 == 1) {
			this.anIntArray771 = new int[this.anInt9582];
		}
		if (local126 == 255) {
			this.aByteArray96 = new byte[this.anInt9571];
		} else {
			this.aByte128 = (byte) local126;
		}
		this.anIntArray764 = new int[this.anInt9582];
		this.aShortArray170 = new short[this.anInt9571];
		if (local138 == 1) {
			this.aShortArray171 = new short[this.anInt9571];
		}
		local10.anInt10154 = local226;
		this.anIntArray769 = new int[this.anInt9582];
		if (local138 == 1 && this.anInt9574 > 0) {
			this.aByteArray91 = new byte[this.anInt9571];
		}
		if (local130 == 1) {
			this.aByteArray95 = new byte[this.anInt9571];
		}
		this.aShortArray174 = new short[this.anInt9571];
		this.anIntArray774 = new int[this.anInt9582];
		if (local74) {
			this.aByteArray97 = new byte[this.anInt9571];
		}
		local15.anInt10154 = local328;
		local20.anInt10154 = local334;
		local25.anInt10154 = local340;
		local30.anInt10154 = local273;
		@Pc(594) int local594 = 0;
		@Pc(596) int local596 = 0;
		@Pc(598) int local598 = 0;
		@Pc(606) int local606;
		for (@Pc(600) int local600 = 0; local600 < this.anInt9582; local600++) {
			local606 = local10.method8645();
			@Pc(608) int local608 = 0;
			if ((local606 & 0x1) != 0) {
				local608 = local15.method8646();
			}
			@Pc(621) int local621 = 0;
			if ((local606 & 0x2) != 0) {
				local621 = local20.method8646();
			}
			@Pc(634) int local634 = 0;
			if ((local606 & 0x4) != 0) {
				local634 = local25.method8646();
			}
			this.anIntArray764[local600] = local594 + local608;
			this.anIntArray774[local600] = local596 + local621;
			this.anIntArray769[local600] = local634 + local598;
			local594 = this.anIntArray764[local600];
			local598 = this.anIntArray769[local600];
			local596 = this.anIntArray774[local600];
			if (local142 == 1) {
				this.anIntArray771[local600] = local30.method8645();
			}
		}
		local10.anInt10154 = local319;
		local15.anInt10154 = local233;
		local20.anInt10154 = local249;
		local25.anInt10154 = local283;
		local30.anInt10154 = local261;
		local35.anInt10154 = local299;
		local40.anInt10154 = local313;
		for (local606 = 0; local606 < this.anInt9571; local606++) {
			this.aShortArray170[local606] = (short) local10.method8631();
			if (local74) {
				this.aByteArray97[local606] = local15.method8635();
			}
			if (local126 == 255) {
				this.aByteArray96[local606] = local20.method8635();
			}
			if (local130 == 1) {
				this.aByteArray95[local606] = local25.method8635();
			}
			if (local134 == 1) {
				this.anIntArray766[local606] = local30.method8645();
			}
			if (local138 == 1) {
				this.aShortArray171[local606] = (short) (local35.method8631() - 1);
			}
			if (this.aByteArray91 != null) {
				if (this.aShortArray171[local606] == -1) {
					this.aByteArray91[local606] = -1;
				} else {
					this.aByteArray91[local606] = (byte) (local40.method8645() - 1);
				}
			}
		}
		this.anInt9589 = -1;
		local10.anInt10154 = local293;
		local15.anInt10154 = local242;
		@Pc(838) short local838 = 0;
		@Pc(840) short local840 = 0;
		@Pc(842) short local842 = 0;
		@Pc(844) short local844 = 0;
		@Pc(852) int local852;
		for (@Pc(846) int local846 = 0; local846 < this.anInt9571; local846++) {
			local852 = local15.method8645();
			if (local852 == 1) {
				local838 = (short) (local844 + local10.method8646());
				local840 = (short) (local838 + local10.method8646());
				local842 = (short) (local840 + local10.method8646());
				local844 = local842;
				this.aShortArray167[local846] = local838;
				this.aShortArray165[local846] = local840;
				this.aShortArray174[local846] = local842;
				if (this.anInt9589 < local838) {
					this.anInt9589 = local838;
				}
				if (local840 > this.anInt9589) {
					this.anInt9589 = local840;
				}
				if (local842 > this.anInt9589) {
					this.anInt9589 = local842;
				}
			}
			if (local852 == 2) {
				local840 = local842;
				local842 = (short) (local10.method8646() + local844);
				local844 = local842;
				this.aShortArray167[local846] = local838;
				this.aShortArray165[local846] = local840;
				this.aShortArray174[local846] = local842;
				if (this.anInt9589 < local842) {
					this.anInt9589 = local842;
				}
			}
			if (local852 == 3) {
				local838 = local842;
				local842 = (short) (local10.method8646() + local844);
				local844 = local842;
				this.aShortArray167[local846] = local838;
				this.aShortArray165[local846] = local840;
				this.aShortArray174[local846] = local842;
				if (local842 > this.anInt9589) {
					this.anInt9589 = local842;
				}
			}
			if (local852 == 4) {
				@Pc(1009) short local1009 = local838;
				local838 = local840;
				local842 = (short) (local844 + local10.method8646());
				local840 = local1009;
				this.aShortArray167[local846] = local838;
				local844 = local842;
				this.aShortArray165[local846] = local1009;
				this.aShortArray174[local846] = local842;
				if (this.anInt9589 < local842) {
					this.anInt9589 = local842;
				}
			}
		}
		local10.anInt10154 = local346;
		this.anInt9589++;
		local15.anInt10154 = local354;
		local20.anInt10154 = local378;
		local25.anInt10154 = local386;
		local30.anInt10154 = local392;
		local35.anInt10154 = local398;
		@Pc(1088) int local1088;
		for (local852 = 0; local852 < this.anInt9574; local852++) {
			local1088 = this.aByteArray92[local852] & 0xFF;
			if (local1088 == 0) {
				this.aShortArray168[local852] = (short) local10.method8631();
				this.aShortArray169[local852] = (short) local10.method8631();
				this.aShortArray173[local852] = (short) local10.method8631();
			}
			if (local1088 == 1) {
				this.aShortArray168[local852] = (short) local15.method8631();
				this.aShortArray169[local852] = (short) local15.method8631();
				this.aShortArray173[local852] = (short) local15.method8631();
				if (this.anInt9580 >= 15) {
					this.anIntArray772[local852] = local20.method8657();
					this.anIntArray765[local852] = local20.method8657();
					this.anIntArray763[local852] = local20.method8657();
				} else {
					this.anIntArray772[local852] = local20.method8631();
					if (this.anInt9580 >= 14) {
						this.anIntArray765[local852] = local20.method8657();
					} else {
						this.anIntArray765[local852] = local20.method8631();
					}
					this.anIntArray763[local852] = local20.method8631();
				}
				this.aByteArray94[local852] = local25.method8635();
				this.aByteArray93[local852] = local30.method8635();
				this.anIntArray770[local852] = local35.method8635();
			}
			if (local1088 == 2) {
				this.aShortArray168[local852] = (short) local15.method8631();
				this.aShortArray169[local852] = (short) local15.method8631();
				this.aShortArray173[local852] = (short) local15.method8631();
				if (this.anInt9580 >= 15) {
					this.anIntArray772[local852] = local20.method8657();
					this.anIntArray765[local852] = local20.method8657();
					this.anIntArray763[local852] = local20.method8657();
				} else {
					this.anIntArray772[local852] = local20.method8631();
					if (this.anInt9580 >= 14) {
						this.anIntArray765[local852] = local20.method8657();
					} else {
						this.anIntArray765[local852] = local20.method8631();
					}
					this.anIntArray763[local852] = local20.method8631();
				}
				this.aByteArray94[local852] = local25.method8635();
				this.aByteArray93[local852] = local30.method8635();
				this.anIntArray770[local852] = local35.method8635();
				this.anIntArray767[local852] = local35.method8635();
				this.anIntArray768[local852] = local35.method8635();
			}
			if (local1088 == 3) {
				this.aShortArray168[local852] = (short) local15.method8631();
				this.aShortArray169[local852] = (short) local15.method8631();
				this.aShortArray173[local852] = (short) local15.method8631();
				if (this.anInt9580 < 15) {
					this.anIntArray772[local852] = local20.method8631();
					if (this.anInt9580 < 14) {
						this.anIntArray765[local852] = local20.method8631();
					} else {
						this.anIntArray765[local852] = local20.method8657();
					}
					this.anIntArray763[local852] = local20.method8631();
				} else {
					this.anIntArray772[local852] = local20.method8657();
					this.anIntArray765[local852] = local20.method8657();
					this.anIntArray763[local852] = local20.method8657();
				}
				this.aByteArray94[local852] = local25.method8635();
				this.aByteArray93[local852] = local30.method8635();
				this.anIntArray770[local852] = local35.method8635();
			}
		}
		local10.anInt10154 = local181;
		@Pc(1491) int local1491;
		@Pc(1497) int local1497;
		@Pc(1501) int local1501;
		@Pc(1564) int local1564;
		if (local83) {
			local1088 = local10.method8645();
			if (local1088 > 0) {
				this.aClass57Array5 = new Class57[local1088];
				for (local1491 = 0; local1491 < local1088; local1491++) {
					local1497 = local10.method8631();
					local1501 = local10.method8631();
					@Pc(1509) byte local1509;
					if (local126 == 255) {
						local1509 = this.aByteArray96[local1501];
					} else {
						local1509 = (byte) local126;
					}
					this.aClass57Array5[local1491] = new Class57(local1497, this.aShortArray167[local1501], this.aShortArray165[local1501], this.aShortArray174[local1501], local1509);
				}
			}
			local1491 = local10.method8645();
			if (local1491 > 0) {
				this.aClass143Array5 = new Class143[local1491];
				for (local1497 = 0; local1497 < local1491; local1497++) {
					local1501 = local10.method8631();
					local1564 = local10.method8631();
					this.aClass143Array5[local1497] = new Class143(local1501, local1564);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1088 = local10.method8645();
		if (local1088 <= 0) {
			return;
		}
		this.aClass196Array1 = new Class196[local1088];
		for (local1491 = 0; local1491 < local1088; local1491++) {
			local1497 = local10.method8631();
			local1501 = local10.method8631();
			local1564 = local10.method8645();
			@Pc(1616) byte local1616 = local10.method8635();
			this.aClass196Array1[local1491] = new Class196(local1497, local1501, local1564, local1616);
		}
		return;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(SBS)V")
	public void method8224(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt9571; local11++) {
			if (this.aShortArray170[local11] == arg1) {
				this.aShortArray170[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(BSS)V")
	public void method8226(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray171 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anInt9571; local16++) {
			if (arg0 == this.aShortArray171[local16]) {
				this.aShortArray171[local16] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(SILclient!ur;I)I")
	private int method8227(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class349 arg2) {
		@Pc(10) int local10 = arg2.anIntArray764[arg1];
		@Pc(25) int local25 = arg2.anIntArray774[arg1];
		@Pc(30) int local30 = arg2.anIntArray769[arg1];
		for (@Pc(32) int local32 = 0; local32 < this.anInt9582; local32++) {
			if (this.anIntArray764[local32] == local10 && this.anIntArray774[local32] == local25 && this.anIntArray769[local32] == local30) {
				this.aShortArray166[local32] |= arg0;
				return local32;
			}
		}
		this.anIntArray764[this.anInt9582] = local10;
		this.anIntArray774[this.anInt9582] = local25;
		this.anIntArray769[this.anInt9582] = local30;
		this.aShortArray166[this.anInt9582] = arg0;
		this.anIntArray771[this.anInt9582] = arg2.anIntArray771 == null ? -1 : arg2.anIntArray771[arg1];
		return this.anInt9582++;
	}
}
