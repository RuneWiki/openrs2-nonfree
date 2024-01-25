import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lo")
public final class Class155 {

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!lo", name = "g", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!lo", name = "j", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!lo", name = "k", descriptor = "[Lclient!qr;")
	public Class203[] aClass203Array2;

	@OriginalMember(owner = "client!lo", name = "l", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!lo", name = "m", descriptor = "[I")
	public int[] anIntArray317;

	@OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
	public int[] anIntArray318;

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "[I")
	public int[] anIntArray319;

	@OriginalMember(owner = "client!lo", name = "r", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!lo", name = "u", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!lo", name = "v", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!lo", name = "w", descriptor = "[I")
	public int[] anIntArray321;

	@OriginalMember(owner = "client!lo", name = "A", descriptor = "[I")
	public int[] anIntArray323;

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "[B")
	public byte[] aByteArray43;

	@OriginalMember(owner = "client!lo", name = "F", descriptor = "[B")
	public byte[] aByteArray44;

	@OriginalMember(owner = "client!lo", name = "J", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!lo", name = "M", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!lo", name = "N", descriptor = "[I")
	public int[] anIntArray324;

	@OriginalMember(owner = "client!lo", name = "P", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!lo", name = "Q", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!lo", name = "S", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!lo", name = "T", descriptor = "[I")
	public int[] anIntArray325;

	@OriginalMember(owner = "client!lo", name = "U", descriptor = "[Lclient!wq;")
	public Class265[] aClass265Array2;

	@OriginalMember(owner = "client!lo", name = "V", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!lo", name = "W", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!lo", name = "X", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!lo", name = "Y", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!lo", name = "ab", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!lo", name = "db", descriptor = "[Lclient!hm;")
	public Class111[] aClass111Array1;

	@OriginalMember(owner = "client!lo", name = "fb", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
	public int anInt4068 = 0;

	@OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
	public int anInt4075 = 12;

	@OriginalMember(owner = "client!lo", name = "h", descriptor = "B")
	public byte aByte58 = 0;

	@OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
	public int anInt4079 = 0;

	@OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
	public int anInt4066 = 0;

	@OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
	public int anInt4081 = 0;

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([B)V")
	public Class155(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3393(arg0);
		} else {
			this.method3403(arg0);
		}
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(III)V")
	public Class155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray44 = new byte[arg1];
		this.aByteArray47 = new byte[arg1];
		this.anIntArray327 = new int[arg0];
		this.anIntArray328 = new int[arg1];
		this.anIntArray325 = new int[arg0];
		this.aShortArray60 = new short[arg1];
		this.anIntArray323 = new int[arg0];
		this.anIntArray324 = new int[arg0];
		this.aShortArray61 = new short[arg1];
		this.aShortArray63 = new short[arg1];
		this.aByteArray43 = new byte[arg1];
		this.aShortArray69 = new short[arg1];
		if (arg2 > 0) {
			this.aByteArray42 = new byte[arg2];
			this.anIntArray318 = new int[arg2];
			this.aShortArray62 = new short[arg2];
			this.anIntArray326 = new int[arg2];
			this.anIntArray316 = new int[arg2];
			this.anIntArray319 = new int[arg2];
			this.aByteArray48 = new byte[arg2];
			this.aShortArray66 = new short[arg2];
			this.anIntArray321 = new int[arg2];
			this.anIntArray317 = new int[arg2];
			this.aByteArray46 = new byte[arg2];
			this.aShortArray64 = new short[arg2];
		}
		this.aByteArray45 = new byte[arg1];
		this.aShortArray67 = new short[arg1];
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "([Lclient!lo;I)V")
	public Class155(@OriginalArg(0) Class155[] arg0, @OriginalArg(1) int arg1) {
		this.anInt4068 = 0;
		this.anInt4079 = 0;
		this.anInt4066 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		@Pc(48) boolean local48 = false;
		this.aByte58 = -1;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class155 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt4068 += local59.anInt4068;
				this.anInt4079 += local59.anInt4079;
				this.anInt4066 += local59.anInt4066;
				if (local59.aClass265Array2 != null) {
					local34 += local59.aClass265Array2.length;
				}
				if (local59.aClass203Array2 != null) {
					local32 += local59.aClass203Array2.length;
				}
				local38 |= local59.aByteArray47 != null;
				if (local59.aClass111Array1 != null) {
					local36 += local59.aClass111Array1.length;
				}
				local48 |= local59.anIntArray328 != null;
				local44 |= local59.aByteArray44 != null;
				local42 |= local59.aByteArray45 != null;
				if (local59.aByteArray43 == null) {
					if (this.aByte58 == -1) {
						this.aByte58 = local59.aByte58;
					}
					if (this.aByte58 != local59.aByte58) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local46 |= local59.aShortArray69 != null;
			}
		}
		if (this.anInt4079 > 0) {
			this.aShortArray62 = new short[this.anInt4079];
			this.anIntArray316 = new int[this.anInt4079];
			this.anIntArray319 = new int[this.anInt4079];
			this.anIntArray326 = new int[this.anInt4079];
			this.anIntArray321 = new int[this.anInt4079];
			this.anIntArray318 = new int[this.anInt4079];
			this.anIntArray317 = new int[this.anInt4079];
			this.aByteArray48 = new byte[this.anInt4079];
			this.aByteArray42 = new byte[this.anInt4079];
			this.aShortArray66 = new short[this.anInt4079];
			this.aShortArray64 = new short[this.anInt4079];
			this.aByteArray46 = new byte[this.anInt4079];
		}
		this.aShortArray68 = new short[this.anInt4068];
		if (local48) {
			this.anIntArray328 = new int[this.anInt4066];
		}
		if (local32 > 0) {
			this.aClass203Array2 = new Class203[local32];
		}
		this.aShortArray60 = new short[this.anInt4066];
		this.aShortArray59 = new short[this.anInt4066];
		if (local34 > 0) {
			this.aClass265Array2 = new Class265[local34];
		}
		this.aShortArray67 = new short[this.anInt4066];
		this.anIntArray325 = new int[this.anInt4068];
		if (local44) {
			this.aByteArray44 = new byte[this.anInt4066];
		}
		this.anIntArray323 = new int[this.anInt4068];
		this.aShortArray63 = new short[this.anInt4066];
		if (local42) {
			this.aByteArray45 = new byte[this.anInt4066];
		}
		if (local46) {
			this.aShortArray69 = new short[this.anInt4066];
		}
		if (local40) {
			this.aByteArray43 = new byte[this.anInt4066];
		}
		if (local38) {
			this.aByteArray47 = new byte[this.anInt4066];
		}
		this.anIntArray324 = new int[this.anInt4068];
		this.anIntArray327 = new int[this.anInt4068];
		if (local36 > 0) {
			this.aClass111Array1 = new Class111[local36];
		}
		this.aShortArray61 = new short[this.anInt4066];
		local34 = 0;
		local36 = 0;
		local32 = 0;
		this.anInt4079 = 0;
		this.anInt4068 = 0;
		this.anInt4066 = 0;
		@Pc(616) int local616;
		@Pc(627) int local627;
		for (@Pc(380) int local380 = 0; local380 < arg1; local380++) {
			@Pc(387) short local387 = (short) (0x1 << local380);
			@Pc(391) Class155 local391 = arg0[local380];
			if (local391 != null) {
				@Pc(398) int local398;
				if (local391.aClass111Array1 != null) {
					for (local398 = 0; local398 < local391.aClass111Array1.length; local398++) {
						@Pc(405) Class111 local405 = local391.aClass111Array1[local398];
						this.aClass111Array1[local36++] = local405.method2382(local405.anInt2666 + this.anInt4066);
					}
				}
				for (local398 = 0; local398 < local391.anInt4066; local398++) {
					if (local38 && local391.aByteArray47 != null) {
						this.aByteArray47[this.anInt4066] = local391.aByteArray47[local398];
					}
					if (local40) {
						if (local391.aByteArray43 == null) {
							this.aByteArray43[this.anInt4066] = local391.aByte58;
						} else {
							this.aByteArray43[this.anInt4066] = local391.aByteArray43[local398];
						}
					}
					if (local42 && local391.aByteArray45 != null) {
						this.aByteArray45[this.anInt4066] = local391.aByteArray45[local398];
					}
					if (local46) {
						if (local391.aShortArray69 == null) {
							this.aShortArray69[this.anInt4066] = -1;
						} else {
							this.aShortArray69[this.anInt4066] = local391.aShortArray69[local398];
						}
					}
					if (local48) {
						if (local391.anIntArray328 == null) {
							this.anIntArray328[this.anInt4066] = -1;
						} else {
							this.anIntArray328[this.anInt4066] = local391.anIntArray328[local398];
						}
					}
					this.aShortArray63[this.anInt4066] = (short) this.method3406(local391.aShortArray63[local398], local391, local387);
					this.aShortArray61[this.anInt4066] = (short) this.method3406(local391.aShortArray61[local398], local391, local387);
					this.aShortArray67[this.anInt4066] = (short) this.method3406(local391.aShortArray67[local398], local391, local387);
					this.aShortArray59[this.anInt4066] = local387;
					this.aShortArray60[this.anInt4066] = local391.aShortArray60[local398];
					this.anInt4066++;
				}
				@Pc(603) int local603;
				if (local391.aClass203Array2 != null) {
					for (local603 = 0; local603 < local391.aClass203Array2.length; local603++) {
						local616 = this.method3406(local391.aClass203Array2[local603].anInt6042, local391, local387);
						local627 = this.method3406(local391.aClass203Array2[local603].anInt6043, local391, local387);
						@Pc(638) int local638 = this.method3406(local391.aClass203Array2[local603].anInt6048, local391, local387);
						this.aClass203Array2[local32] = local391.aClass203Array2[local603].method4787(local627, local616, local638);
						local32++;
					}
				}
				if (local391.aClass265Array2 != null) {
					for (local603 = 0; local603 < local391.aClass265Array2.length; local603++) {
						local616 = this.method3406(local391.aClass265Array2[local603].anInt7759, local391, local387);
						this.aClass265Array2[local34] = local391.aClass265Array2[local603].method5977(local616);
						local34++;
					}
				}
			}
		}
		@Pc(704) int local704 = 0;
		this.anInt4081 = this.anInt4068;
		for (@Pc(710) int local710 = 0; local710 < arg1; local710++) {
			@Pc(717) short local717 = (short) (0x1 << local710);
			@Pc(721) Class155 local721 = arg0[local710];
			if (local721 != null) {
				for (local616 = 0; local616 < local721.anInt4066; local616++) {
					if (local44) {
						this.aByteArray44[local704++] = (byte) (local721.aByteArray44 == null || local721.aByteArray44[local616] == -1 ? -1 : this.anInt4079 + local721.aByteArray44[local616]);
					}
				}
				for (local627 = 0; local627 < local721.anInt4079; local627++) {
					@Pc(774) byte local774 = this.aByteArray46[this.anInt4079] = local721.aByteArray46[local627];
					if (local774 == 0) {
						this.aShortArray64[this.anInt4079] = (short) this.method3406(local721.aShortArray64[local627], local721, local717);
						this.aShortArray62[this.anInt4079] = (short) this.method3406(local721.aShortArray62[local627], local721, local717);
						this.aShortArray66[this.anInt4079] = (short) this.method3406(local721.aShortArray66[local627], local721, local717);
					}
					if (local774 >= 1 && local774 <= 3) {
						this.aShortArray64[this.anInt4079] = local721.aShortArray64[local627];
						this.aShortArray62[this.anInt4079] = local721.aShortArray62[local627];
						this.aShortArray66[this.anInt4079] = local721.aShortArray66[local627];
						this.anIntArray319[this.anInt4079] = local721.anIntArray319[local627];
						this.anIntArray326[this.anInt4079] = local721.anIntArray326[local627];
						this.anIntArray317[this.anInt4079] = local721.anIntArray317[local627];
						this.aByteArray48[this.anInt4079] = local721.aByteArray48[local627];
						this.aByteArray42[this.anInt4079] = local721.aByteArray42[local627];
						this.anIntArray316[this.anInt4079] = local721.anIntArray316[local627];
					}
					if (local774 == 2) {
						this.anIntArray318[this.anInt4079] = local721.anIntArray318[local627];
						this.anIntArray321[this.anInt4079] = local721.anIntArray321[local627];
					}
					this.anInt4079++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(SIS)V")
	public void method3389(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray69 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt4066; local11++) {
			if (this.aShortArray69[local11] == arg0) {
				this.aShortArray69[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)[[I")
	public int[][] method3391() {
		@Pc(13) int[] local13 = new int[256];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anInt4066; local17++) {
			@Pc(24) int local24 = this.anIntArray328[local17];
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
		for (@Pc(77) int local77 = 0; local77 < this.anInt4066; local77++) {
			@Pc(84) int local84 = this.anIntArray328[local77];
			if (local84 >= 0) {
				local52[local84][local13[local84]++] = local77;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIII)I")
	public int method3392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt4068; local7++) {
			if (arg2 == this.anIntArray323[local7] && arg1 == this.anIntArray324[local7] && this.anIntArray327[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray323[this.anInt4068] = arg2;
		this.anIntArray324[this.anInt4068] = arg1;
		this.anIntArray327[this.anInt4068] = arg0;
		this.anInt4081 = this.anInt4068 + 1;
		return this.anInt4068++;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "([BB)V")
	private void method3393(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg0);
		@Pc(15) Class1_Sub14 local15 = new Class1_Sub14(arg0);
		@Pc(20) Class1_Sub14 local20 = new Class1_Sub14(arg0);
		@Pc(25) Class1_Sub14 local25 = new Class1_Sub14(arg0);
		@Pc(30) Class1_Sub14 local30 = new Class1_Sub14(arg0);
		@Pc(35) Class1_Sub14 local35 = new Class1_Sub14(arg0);
		@Pc(40) Class1_Sub14 local40 = new Class1_Sub14(arg0);
		local10.anInt5695 = arg0.length - 23;
		this.anInt4068 = local10.method4498();
		this.anInt4066 = local10.method4498();
		this.anInt4079 = local10.method4548();
		@Pc(67) int local67 = local10.method4548();
		@Pc(78) boolean local78 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(96) boolean local96 = (local67 & 0x4) == 4;
		@Pc(107) boolean local107 = (local67 & 0x8) == 8;
		if (local107) {
			local10.anInt5695 -= 7;
			this.anInt4075 = local10.method4548();
			local10.anInt5695 += 6;
		}
		@Pc(130) int local130 = local10.method4548();
		@Pc(134) int local134 = local10.method4548();
		@Pc(138) int local138 = local10.method4548();
		@Pc(142) int local142 = local10.method4548();
		@Pc(146) int local146 = local10.method4548();
		@Pc(150) int local150 = local10.method4498();
		@Pc(154) int local154 = local10.method4498();
		@Pc(158) int local158 = local10.method4498();
		@Pc(162) int local162 = local10.method4498();
		@Pc(166) int local166 = local10.method4498();
		@Pc(168) int local168 = 0;
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 0;
		@Pc(188) int local188;
		if (this.anInt4079 > 0) {
			local10.anInt5695 = 0;
			this.aByteArray46 = new byte[this.anInt4079];
			for (local188 = 0; local188 < this.anInt4079; local188++) {
				@Pc(199) byte local199 = this.aByteArray46[local188] = local10.method4529();
				if (local199 == 0) {
					local168++;
				}
				if (local199 == 2) {
					local172++;
				}
				if (local199 >= 1 && local199 <= 3) {
					local170++;
				}
			}
		}
		local188 = this.anInt4079;
		@Pc(227) int local227 = local188;
		local188 += this.anInt4068;
		@Pc(234) int local234 = local188;
		if (local78) {
			local188 += this.anInt4066;
		}
		@Pc(243) int local243 = local188;
		local188 += this.anInt4066;
		@Pc(250) int local250 = local188;
		if (local130 == 255) {
			local188 += this.anInt4066;
		}
		@Pc(260) int local260 = local188;
		if (local138 == 1) {
			local188 += this.anInt4066;
		}
		@Pc(272) int local272 = local188;
		if (local146 == 1) {
			local188 += this.anInt4068;
		}
		@Pc(282) int local282 = local188;
		if (local134 == 1) {
			local188 += this.anInt4066;
		}
		@Pc(294) int local294 = local188;
		local188 += local162;
		@Pc(300) int local300 = local188;
		if (local142 == 1) {
			local188 += this.anInt4066 * 2;
		}
		@Pc(312) int local312 = local188;
		local188 += local166;
		@Pc(318) int local318 = local188;
		local188 += this.anInt4066 * 2;
		@Pc(327) int local327 = local188;
		local188 += local150;
		@Pc(333) int local333 = local188;
		local188 += local154;
		@Pc(339) int local339 = local188;
		local188 += local158;
		@Pc(345) int local345 = local188;
		local188 += local168 * 6;
		@Pc(353) int local353 = local188;
		local188 += local170 * 6;
		@Pc(367) int local367 = this.anInt4075 >= 14 ? 7 : 6;
		@Pc(369) int local369 = local188;
		local188 += local170 * local367;
		@Pc(377) int local377 = local188;
		local188 += local170;
		@Pc(383) int local383 = local188;
		local188 += local170;
		@Pc(389) int local389 = local188;
		local188 += local170 + local172 * 2;
		if (local142 == 1) {
			this.aShortArray69 = new short[this.anInt4066];
		}
		this.aShortArray67 = new short[this.anInt4066];
		if (local134 == 1) {
			this.aByteArray45 = new byte[this.anInt4066];
		}
		this.aShortArray63 = new short[this.anInt4066];
		if (local78) {
			this.aByteArray47 = new byte[this.anInt4066];
		}
		if (local130 == 255) {
			this.aByteArray43 = new byte[this.anInt4066];
		} else {
			this.aByte58 = (byte) local130;
		}
		local10.anInt5695 = local227;
		if (local138 == 1) {
			this.anIntArray328 = new int[this.anInt4066];
		}
		if (local146 == 1) {
			this.anIntArray325 = new int[this.anInt4068];
		}
		this.anIntArray323 = new int[this.anInt4068];
		if (local142 == 1 && this.anInt4079 > 0) {
			this.aByteArray44 = new byte[this.anInt4066];
		}
		this.aShortArray61 = new short[this.anInt4066];
		this.anIntArray324 = new int[this.anInt4068];
		if (this.anInt4079 > 0) {
			this.aShortArray62 = new short[this.anInt4079];
			if (local170 > 0) {
				this.anIntArray317 = new int[local170];
				this.aByteArray48 = new byte[local170];
				this.aByteArray42 = new byte[local170];
				this.anIntArray319 = new int[local170];
				this.anIntArray326 = new int[local170];
				this.anIntArray316 = new int[local170];
			}
			if (local172 > 0) {
				this.anIntArray321 = new int[local172];
				this.anIntArray318 = new int[local172];
			}
			this.aShortArray66 = new short[this.anInt4079];
			this.aShortArray64 = new short[this.anInt4079];
		}
		this.anIntArray327 = new int[this.anInt4068];
		this.aShortArray60 = new short[this.anInt4066];
		local15.anInt5695 = local327;
		local20.anInt5695 = local333;
		local25.anInt5695 = local339;
		local30.anInt5695 = local272;
		@Pc(589) int local589 = 0;
		@Pc(591) int local591 = 0;
		@Pc(593) int local593 = 0;
		@Pc(601) int local601;
		for (@Pc(595) int local595 = 0; local595 < this.anInt4068; local595++) {
			local601 = local10.method4548();
			@Pc(603) int local603 = 0;
			if ((local601 & 0x1) != 0) {
				local603 = local15.method4525();
			}
			@Pc(616) int local616 = 0;
			if ((local601 & 0x2) != 0) {
				local616 = local20.method4525();
			}
			@Pc(629) int local629 = 0;
			if ((local601 & 0x4) != 0) {
				local629 = local25.method4525();
			}
			this.anIntArray323[local595] = local589 + local603;
			this.anIntArray324[local595] = local591 + local616;
			this.anIntArray327[local595] = local593 + local629;
			local593 = this.anIntArray327[local595];
			local591 = this.anIntArray324[local595];
			local589 = this.anIntArray323[local595];
			if (local146 == 1) {
				this.anIntArray325[local595] = local30.method4548();
			}
		}
		local10.anInt5695 = local318;
		local15.anInt5695 = local234;
		local20.anInt5695 = local250;
		local25.anInt5695 = local282;
		local30.anInt5695 = local260;
		local35.anInt5695 = local300;
		local40.anInt5695 = local312;
		for (local601 = 0; local601 < this.anInt4066; local601++) {
			this.aShortArray60[local601] = (short) local10.method4498();
			if (local78) {
				this.aByteArray47[local601] = local15.method4529();
			}
			if (local130 == 255) {
				this.aByteArray43[local601] = local20.method4529();
			}
			if (local134 == 1) {
				this.aByteArray45[local601] = local25.method4529();
			}
			if (local138 == 1) {
				this.anIntArray328[local601] = local30.method4548();
			}
			if (local142 == 1) {
				this.aShortArray69[local601] = (short) (local35.method4498() - 1);
			}
			if (this.aByteArray44 != null) {
				if (this.aShortArray69[local601] == -1) {
					this.aByteArray44[local601] = -1;
				} else {
					this.aByteArray44[local601] = (byte) (local40.method4548() - 1);
				}
			}
		}
		local10.anInt5695 = local294;
		this.anInt4081 = -1;
		local15.anInt5695 = local243;
		@Pc(827) short local827 = 0;
		@Pc(829) short local829 = 0;
		@Pc(831) short local831 = 0;
		@Pc(833) short local833 = 0;
		@Pc(841) int local841;
		for (@Pc(835) int local835 = 0; local835 < this.anInt4066; local835++) {
			local841 = local15.method4548();
			if (local841 == 1) {
				local827 = (short) (local833 + local10.method4525());
				local829 = (short) (local827 + local10.method4525());
				local831 = (short) (local10.method4525() + local829);
				this.aShortArray63[local835] = local827;
				local833 = local831;
				this.aShortArray61[local835] = local829;
				this.aShortArray67[local835] = local831;
				if (local827 > this.anInt4081) {
					this.anInt4081 = local827;
				}
				if (local829 > this.anInt4081) {
					this.anInt4081 = local829;
				}
				if (this.anInt4081 < local831) {
					this.anInt4081 = local831;
				}
			}
			if (local841 == 2) {
				local829 = local831;
				local831 = (short) (local10.method4525() + local833);
				local833 = local831;
				this.aShortArray63[local835] = local827;
				this.aShortArray61[local835] = local829;
				this.aShortArray67[local835] = local831;
				if (local831 > this.anInt4081) {
					this.anInt4081 = local831;
				}
			}
			if (local841 == 3) {
				local827 = local831;
				local831 = (short) (local10.method4525() + local833);
				this.aShortArray63[local835] = local827;
				local833 = local831;
				this.aShortArray61[local835] = local829;
				this.aShortArray67[local835] = local831;
				if (local831 > this.anInt4081) {
					this.anInt4081 = local831;
				}
			}
			if (local841 == 4) {
				@Pc(1004) short local1004 = local827;
				local827 = local829;
				local829 = local1004;
				local831 = (short) (local833 + local10.method4525());
				this.aShortArray63[local835] = local827;
				local833 = local831;
				this.aShortArray61[local835] = local1004;
				this.aShortArray67[local835] = local831;
				if (this.anInt4081 < local831) {
					this.anInt4081 = local831;
				}
			}
		}
		local10.anInt5695 = local345;
		this.anInt4081++;
		local15.anInt5695 = local353;
		local20.anInt5695 = local369;
		local25.anInt5695 = local377;
		local30.anInt5695 = local383;
		local35.anInt5695 = local389;
		@Pc(1087) int local1087;
		for (local841 = 0; local841 < this.anInt4079; local841++) {
			local1087 = this.aByteArray46[local841] & 0xFF;
			if (local1087 == 0) {
				this.aShortArray64[local841] = (short) local10.method4498();
				this.aShortArray62[local841] = (short) local10.method4498();
				this.aShortArray66[local841] = (short) local10.method4498();
			}
			if (local1087 == 1) {
				this.aShortArray64[local841] = (short) local15.method4498();
				this.aShortArray62[local841] = (short) local15.method4498();
				this.aShortArray66[local841] = (short) local15.method4498();
				this.anIntArray319[local841] = local20.method4498();
				if (this.anInt4075 < 14) {
					this.anIntArray326[local841] = local20.method4498();
				} else {
					this.anIntArray326[local841] = local20.method4496();
				}
				this.anIntArray317[local841] = local20.method4498();
				this.aByteArray48[local841] = local25.method4529();
				this.aByteArray42[local841] = local30.method4529();
				this.anIntArray316[local841] = local35.method4529();
			}
			if (local1087 == 2) {
				this.aShortArray64[local841] = (short) local15.method4498();
				this.aShortArray62[local841] = (short) local15.method4498();
				this.aShortArray66[local841] = (short) local15.method4498();
				this.anIntArray319[local841] = local20.method4498();
				if (this.anInt4075 < 14) {
					this.anIntArray326[local841] = local20.method4498();
				} else {
					this.anIntArray326[local841] = local20.method4496();
				}
				this.anIntArray317[local841] = local20.method4498();
				this.aByteArray48[local841] = local25.method4529();
				this.aByteArray42[local841] = local30.method4529();
				this.anIntArray316[local841] = local35.method4529();
				this.anIntArray318[local841] = local35.method4529();
				this.anIntArray321[local841] = local35.method4529();
			}
			if (local1087 == 3) {
				this.aShortArray64[local841] = (short) local15.method4498();
				this.aShortArray62[local841] = (short) local15.method4498();
				this.aShortArray66[local841] = (short) local15.method4498();
				this.anIntArray319[local841] = local20.method4498();
				if (this.anInt4075 < 14) {
					this.anIntArray326[local841] = local20.method4498();
				} else {
					this.anIntArray326[local841] = local20.method4496();
				}
				this.anIntArray317[local841] = local20.method4498();
				this.aByteArray48[local841] = local25.method4529();
				this.aByteArray42[local841] = local30.method4529();
				this.anIntArray316[local841] = local35.method4529();
			}
		}
		local10.anInt5695 = local188;
		@Pc(1427) int local1427;
		@Pc(1433) int local1433;
		@Pc(1439) int local1439;
		@Pc(1510) int local1510;
		if (local87) {
			local1087 = local10.method4548();
			if (local1087 > 0) {
				this.aClass203Array2 = new Class203[local1087];
				for (local1427 = 0; local1427 < local1087; local1427++) {
					local1433 = local10.method4498();
					local1439 = local10.method4498();
					@Pc(1449) byte local1449;
					if (local130 == 255) {
						local1449 = this.aByteArray43[local1439];
					} else {
						local1449 = (byte) local130;
					}
					this.aClass203Array2[local1427] = new Class203(local1433, this.aShortArray63[local1439], this.aShortArray61[local1439], this.aShortArray67[local1439], local1449);
				}
			}
			local1427 = local10.method4548();
			if (local1427 > 0) {
				this.aClass265Array2 = new Class265[local1427];
				for (local1433 = 0; local1433 < local1427; local1433++) {
					local1439 = local10.method4498();
					local1510 = local10.method4498();
					this.aClass265Array2[local1433] = new Class265(local1439, local1510);
				}
			}
		}
		if (!local96) {
			return;
		}
		local1087 = local10.method4548();
		if (local1087 <= 0) {
			return;
		}
		this.aClass111Array1 = new Class111[local1087];
		for (local1427 = 0; local1427 < local1087; local1427++) {
			local1433 = local10.method4498();
			local1439 = local10.method4498();
			local1510 = local10.method4548();
			@Pc(1555) byte local1555 = local10.method4529();
			this.aClass111Array1[local1427] = new Class111(local1433, local1439, local1510, local1555);
		}
		return;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZI)V")
	public void method3395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(8) int local8 = 0; local8 < this.anInt4068; local8++) {
			this.anIntArray323[local8] += arg1;
			this.anIntArray324[local8] += arg2;
			this.anIntArray327[local8] += arg0;
		}
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)[[I")
	public int[][] method3397() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anInt4081; local19++) {
			@Pc(26) int local26 = this.anIntArray325[local19];
			if (local26 >= 0) {
				@Pc(35) int local35 = local8[local26]++;
				if (local17 < local26) {
					local17 = local26;
				}
			}
		}
		@Pc(61) int[][] local61 = new int[local17 + 1][];
		for (@Pc(63) int local63 = 0; local63 <= local17; local63++) {
			local61[local63] = new int[local8[local63]];
			local8[local63] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt4081; local82++) {
			@Pc(89) int local89 = this.anIntArray325[local82];
			if (local89 >= 0) {
				local61[local89][local8[local89]++] = local82;
			}
		}
		return local61;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(SSSBSSIBBS)B")
	public byte method3399() {
		if (this.anInt4079 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray46[this.anInt4079] = 3;
		this.aShortArray64[this.anInt4079] = 0;
		this.aShortArray62[this.anInt4079] = 32767;
		this.aShortArray66[this.anInt4079] = 0;
		this.anIntArray319[this.anInt4079] = 1024;
		this.anIntArray326[this.anInt4079] = 1024;
		this.anIntArray317[this.anInt4079] = 1024;
		this.aByteArray48[this.anInt4079] = 0;
		this.aByteArray42[this.anInt4079] = 0;
		this.anIntArray316[this.anInt4079] = 0;
		return (byte) this.anInt4079++;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(IIII)V")
	public void method3400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(24) int local24;
		@Pc(43) int local43;
		if (arg0 != 0) {
			local18 = Class262.anIntArray575[arg0];
			local22 = Class262.anIntArray576[arg0];
			for (local24 = 0; local24 < this.anInt4068; local24++) {
				local43 = this.anIntArray324[local24] * local18 + local22 * this.anIntArray323[local24] >> 15;
				this.anIntArray324[local24] = this.anIntArray324[local24] * local22 - this.anIntArray323[local24] * local18 >> 15;
				this.anIntArray323[local24] = local43;
			}
		}
		if (arg2 != 0) {
			local18 = Class262.anIntArray575[arg2];
			local22 = Class262.anIntArray576[arg2];
			for (local24 = 0; local24 < this.anInt4068; local24++) {
				local43 = local22 * this.anIntArray324[local24] - this.anIntArray327[local24] * local18 >> 15;
				this.anIntArray327[local24] = this.anIntArray327[local24] * local22 + local18 * this.anIntArray324[local24] >> 15;
				this.anIntArray324[local24] = local43;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local18 = Class262.anIntArray575[arg1];
		local22 = Class262.anIntArray576[arg1];
		for (local24 = 0; local24 < this.anInt4068; local24++) {
			local43 = local18 * this.anIntArray327[local24] + local22 * this.anIntArray323[local24] >> 15;
			this.anIntArray327[local24] = this.anIntArray327[local24] * local22 - this.anIntArray323[local24] * local18 >> 15;
			this.anIntArray323[local24] = local43;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)[[I")
	public int[][] method3401() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass111Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass111Array1[local12].anInt2665;
			if (local20 >= 0) {
				@Pc(29) int local29 = local8[local20]++;
				if (local20 > local10) {
					local10 = local20;
				}
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local10; local64++) {
			local56[local64] = new int[local8[local64]];
			local8[local64] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.aClass111Array1.length; local83++) {
			@Pc(91) int local91 = this.aClass111Array1[local83].anInt2665;
			if (local91 >= 0) {
				local56[local91][local8[local91]++] = local83;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(SSI)V")
	public void method3402(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt4066; local3++) {
			if (arg1 == this.aShortArray60[local3]) {
				this.aShortArray60[local3] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B[B)V")
	private void method3403(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		@Pc(19) Class1_Sub14 local19 = new Class1_Sub14(arg0);
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0);
		@Pc(29) Class1_Sub14 local29 = new Class1_Sub14(arg0);
		@Pc(34) Class1_Sub14 local34 = new Class1_Sub14(arg0);
		local14.anInt5695 = arg0.length - 18;
		this.anInt4068 = local14.method4498();
		this.anInt4066 = local14.method4498();
		this.anInt4079 = local14.method4548();
		@Pc(61) int local61 = local14.method4548();
		@Pc(65) int local65 = local14.method4548();
		@Pc(69) int local69 = local14.method4548();
		@Pc(73) int local73 = local14.method4548();
		@Pc(77) int local77 = local14.method4548();
		@Pc(81) int local81 = local14.method4498();
		@Pc(85) int local85 = local14.method4498();
		@Pc(89) int local89 = local14.method4498();
		@Pc(95) int local95 = local14.method4498();
		@Pc(104) int local104 = this.anInt4068;
		@Pc(106) int local106 = local104;
		local104 += this.anInt4066;
		@Pc(113) int local113 = local104;
		if (local65 == 255) {
			local104 += this.anInt4066;
		}
		@Pc(125) int local125 = local104;
		if (local73 == 1) {
			local104 += this.anInt4066;
		}
		@Pc(135) int local135 = local104;
		if (local61 == 1) {
			local104 += this.anInt4066;
		}
		@Pc(145) int local145 = local104;
		if (local77 == 1) {
			local104 += this.anInt4068;
		}
		@Pc(157) int local157 = local104;
		if (local69 == 1) {
			local104 += this.anInt4066;
		}
		@Pc(167) int local167 = local104;
		local104 += local95;
		@Pc(173) int local173 = local104;
		local104 += this.anInt4066 * 2;
		@Pc(182) int local182 = local104;
		local104 += this.anInt4079 * 6;
		@Pc(191) int local191 = local104;
		local104 += local81;
		@Pc(201) int local201 = local104;
		local104 += local85;
		if (local77 == 1) {
			this.anIntArray325 = new int[this.anInt4068];
		}
		this.aShortArray61 = new short[this.anInt4066];
		this.aShortArray60 = new short[this.anInt4066];
		this.anIntArray327 = new int[this.anInt4068];
		this.anIntArray323 = new int[this.anInt4068];
		this.anIntArray324 = new int[this.anInt4068];
		if (local65 == 255) {
			this.aByteArray43 = new byte[this.anInt4066];
		} else {
			this.aByte58 = (byte) local65;
		}
		this.aShortArray67 = new short[this.anInt4066];
		if (local69 == 1) {
			this.aByteArray45 = new byte[this.anInt4066];
		}
		if (local61 == 1) {
			this.aShortArray69 = new short[this.anInt4066];
			this.aByteArray44 = new byte[this.anInt4066];
			this.aByteArray47 = new byte[this.anInt4066];
		}
		this.aShortArray63 = new short[this.anInt4066];
		if (this.anInt4079 > 0) {
			this.aShortArray62 = new short[this.anInt4079];
			this.aShortArray66 = new short[this.anInt4079];
			this.aByteArray46 = new byte[this.anInt4079];
			this.aShortArray64 = new short[this.anInt4079];
		}
		local14.anInt5695 = 0;
		if (local73 == 1) {
			this.anIntArray328 = new int[this.anInt4066];
		}
		local19.anInt5695 = local191;
		local24.anInt5695 = local201;
		local29.anInt5695 = local104;
		local34.anInt5695 = local145;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(353) int local353 = 0;
		@Pc(361) int local361;
		@Pc(363) int local363;
		for (@Pc(355) int local355 = 0; local355 < this.anInt4068; local355++) {
			local361 = local14.method4548();
			local363 = 0;
			if ((local361 & 0x1) != 0) {
				local363 = local19.method4525();
			}
			@Pc(376) int local376 = 0;
			if ((local361 & 0x2) != 0) {
				local376 = local24.method4525();
			}
			@Pc(386) int local386 = 0;
			if ((local361 & 0x4) != 0) {
				local386 = local29.method4525();
			}
			this.anIntArray323[local355] = local349 + local363;
			this.anIntArray324[local355] = local351 + local376;
			this.anIntArray327[local355] = local386 + local353;
			local351 = this.anIntArray324[local355];
			local353 = this.anIntArray327[local355];
			local349 = this.anIntArray323[local355];
			if (local77 == 1) {
				this.anIntArray325[local355] = local34.method4548();
			}
		}
		local14.anInt5695 = local173;
		local19.anInt5695 = local135;
		local24.anInt5695 = local113;
		local29.anInt5695 = local157;
		local34.anInt5695 = local125;
		for (local361 = 0; local361 < this.anInt4066; local361++) {
			this.aShortArray60[local361] = (short) local14.method4498();
			if (local61 == 1) {
				local363 = local19.method4548();
				if ((local363 & 0x1) == 1) {
					local7 = true;
					this.aByteArray47[local361] = 1;
				} else {
					this.aByteArray47[local361] = 0;
				}
				if ((local363 & 0x2) == 2) {
					this.aByteArray44[local361] = (byte) (local363 >> 2);
					this.aShortArray69[local361] = this.aShortArray60[local361];
					this.aShortArray60[local361] = 127;
					if (this.aShortArray69[local361] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray44[local361] = -1;
					this.aShortArray69[local361] = -1;
				}
			}
			if (local65 == 255) {
				this.aByteArray43[local361] = local24.method4529();
			}
			if (local69 == 1) {
				this.aByteArray45[local361] = local29.method4529();
			}
			if (local73 == 1) {
				this.anIntArray328[local361] = local34.method4548();
			}
		}
		this.anInt4081 = -1;
		local14.anInt5695 = local167;
		local19.anInt5695 = local106;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(612) short local612 = 0;
		@Pc(614) short local614 = 0;
		@Pc(622) int local622;
		for (@Pc(616) int local616 = 0; local616 < this.anInt4066; local616++) {
			local622 = local19.method4548();
			if (local622 == 1) {
				local608 = (short) (local614 + local14.method4525());
				local610 = (short) (local14.method4525() + local608);
				local612 = (short) (local14.method4525() + local610);
				this.aShortArray63[local616] = local608;
				local614 = local612;
				this.aShortArray61[local616] = local610;
				this.aShortArray67[local616] = local612;
				if (this.anInt4081 < local608) {
					this.anInt4081 = local608;
				}
				if (local610 > this.anInt4081) {
					this.anInt4081 = local610;
				}
				if (this.anInt4081 < local612) {
					this.anInt4081 = local612;
				}
			}
			if (local622 == 2) {
				local610 = local612;
				local612 = (short) (local614 + local14.method4525());
				local614 = local612;
				this.aShortArray63[local616] = local608;
				this.aShortArray61[local616] = local610;
				this.aShortArray67[local616] = local612;
				if (this.anInt4081 < local612) {
					this.anInt4081 = local612;
				}
			}
			if (local622 == 3) {
				local608 = local612;
				local612 = (short) (local614 + local14.method4525());
				local614 = local612;
				this.aShortArray63[local616] = local608;
				this.aShortArray61[local616] = local610;
				this.aShortArray67[local616] = local612;
				if (local612 > this.anInt4081) {
					this.anInt4081 = local612;
				}
			}
			if (local622 == 4) {
				@Pc(779) short local779 = local608;
				local608 = local610;
				local612 = (short) (local614 + local14.method4525());
				local610 = local779;
				local614 = local612;
				this.aShortArray63[local616] = local608;
				this.aShortArray61[local616] = local779;
				this.aShortArray67[local616] = local612;
				if (this.anInt4081 < local612) {
					this.anInt4081 = local612;
				}
			}
		}
		this.anInt4081++;
		local14.anInt5695 = local182;
		for (local622 = 0; local622 < this.anInt4079; local622++) {
			this.aByteArray46[local622] = 0;
			this.aShortArray64[local622] = (short) local14.method4498();
			this.aShortArray62[local622] = (short) local14.method4498();
			this.aShortArray66[local622] = (short) local14.method4498();
		}
		if (this.aByteArray44 != null) {
			@Pc(875) boolean local875 = false;
			for (@Pc(877) int local877 = 0; local877 < this.anInt4066; local877++) {
				@Pc(886) int local886 = this.aByteArray44[local877] & 0xFF;
				if (local886 != 255) {
					if (this.aShortArray63[local877] == (this.aShortArray64[local886] & 0xFFFF) && (this.aShortArray62[local886] & 0xFFFF) == this.aShortArray61[local877] && (this.aShortArray66[local886] & 0xFFFF) == this.aShortArray67[local877]) {
						this.aByteArray44[local877] = -1;
					} else {
						local875 = true;
					}
				}
			}
			if (!local875) {
				this.aByteArray44 = null;
			}
		}
		if (!local9) {
			this.aShortArray69 = null;
		}
		if (!local7) {
			this.aByteArray47 = null;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IBBSIIIBS)I")
	public int method3404(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray63[this.anInt4066] = (short) arg0;
		this.aShortArray61[this.anInt4066] = (short) arg4;
		this.aShortArray67[this.anInt4066] = (short) arg5;
		this.aByteArray47[this.anInt4066] = arg1;
		this.aByteArray44[this.anInt4066] = arg2;
		this.aShortArray60[this.anInt4066] = arg7;
		this.aByteArray45[this.anInt4066] = arg6;
		this.aShortArray69[this.anInt4066] = arg3;
		return this.anInt4066++;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IB)V")
	public void method3405() {
		for (@Pc(23) int local23 = 0; local23 < this.anInt4068; local23++) {
			this.anIntArray323[local23] <<= 0x0;
			this.anIntArray324[local23] <<= 0x0;
			this.anIntArray327[local23] <<= 0x0;
		}
		if (this.anInt4079 <= 0 || this.anIntArray319 == null) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < this.anIntArray319.length; local65++) {
			this.anIntArray319[local65] <<= 0x0;
			this.anIntArray326[local65] <<= 0x0;
			if (this.aByteArray46[local65] != 1) {
				this.anIntArray317[local65] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(IZLclient!lo;S)I")
	private int method3406(@OriginalArg(0) int arg0, @OriginalArg(2) Class155 arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg1.anIntArray323[arg0];
		@Pc(15) int local15 = arg1.anIntArray324[arg0];
		@Pc(20) int local20 = arg1.anIntArray327[arg0];
		for (@Pc(27) int local27 = 0; local27 < this.anInt4068; local27++) {
			if (this.anIntArray323[local27] == local10 && this.anIntArray324[local27] == local15 && local20 == this.anIntArray327[local27]) {
				this.aShortArray68[local27] |= arg2;
				return local27;
			}
		}
		this.anIntArray323[this.anInt4068] = local10;
		this.anIntArray324[this.anInt4068] = local15;
		this.anIntArray327[this.anInt4068] = local20;
		this.aShortArray68[this.anInt4068] = arg2;
		this.anIntArray325[this.anInt4068] = arg1.anIntArray325 == null ? -1 : arg1.anIntArray325[arg0];
		return this.anInt4068++;
	}
}
