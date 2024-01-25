import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class134 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "[I")
	public int[] anIntArray326;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "[S")
	public short[] aShortArray51;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "[I")
	public int[] anIntArray327;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "[B")
	public byte[] aByteArray45;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[S")
	public short[] aShortArray52;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "[S")
	public short[] aShortArray53;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "[Lclient!vp;")
	public Class335[] aClass335Array3;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "[S")
	public short[] aShortArray54;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "[S")
	public short[] aShortArray55;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "[I")
	public int[] anIntArray328;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "[I")
	public int[] anIntArray329;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "[Lclient!bh;")
	public Class33[] aClass33Array3;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "[I")
	public int[] anIntArray330;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "[S")
	public short[] aShortArray56;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "[I")
	public int[] anIntArray331;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "[S")
	public short[] aShortArray57;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "[I")
	public int[] anIntArray332;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!hn", name = "I", descriptor = "[I")
	public int[] anIntArray333;

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "[S")
	public short[] aShortArray58;

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!hn", name = "N", descriptor = "[I")
	public int[] anIntArray334;

	@OriginalMember(owner = "client!hn", name = "O", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!hn", name = "Q", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!hn", name = "S", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!hn", name = "V", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!hn", name = "W", descriptor = "[Lclient!ih;")
	public Class143[] aClass143Array1;

	@OriginalMember(owner = "client!hn", name = "X", descriptor = "[I")
	public int[] anIntArray336;

	@OriginalMember(owner = "client!hn", name = "Z", descriptor = "[S")
	public short[] aShortArray59;

	@OriginalMember(owner = "client!hn", name = "bb", descriptor = "[S")
	public short[] aShortArray60;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public int anInt3853 = 0;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
	public int anInt3857 = 0;

	@OriginalMember(owner = "client!hn", name = "M", descriptor = "I")
	public int anInt3867 = 0;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	public int anInt3860 = 0;

	@OriginalMember(owner = "client!hn", name = "R", descriptor = "I")
	public int anInt3869 = 12;

	@OriginalMember(owner = "client!hn", name = "Y", descriptor = "B")
	public byte aByte51 = 0;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "([B)V")
	public Class134(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method3343(arg0);
		} else {
			this.method3344(arg0);
		}
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(III)V")
	public Class134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray55 = new short[arg1];
		this.aByteArray47 = new byte[arg1];
		this.anIntArray326 = new int[arg0];
		this.aShortArray58 = new short[arg1];
		this.aByteArray46 = new byte[arg1];
		this.anIntArray329 = new int[arg0];
		this.aShortArray52 = new short[arg1];
		this.aShortArray60 = new short[arg1];
		this.aByteArray49 = new byte[arg1];
		this.anIntArray330 = new int[arg1];
		this.anIntArray336 = new int[arg0];
		if (arg2 > 0) {
			this.anIntArray335 = new int[arg2];
			this.anIntArray333 = new int[arg2];
			this.aShortArray57 = new short[arg2];
			this.aShortArray56 = new short[arg2];
			this.anIntArray332 = new int[arg2];
			this.aByteArray51 = new byte[arg2];
			this.aByteArray50 = new byte[arg2];
			this.anIntArray327 = new int[arg2];
			this.anIntArray334 = new int[arg2];
			this.aByteArray45 = new byte[arg2];
			this.aShortArray54 = new short[arg2];
			this.anIntArray331 = new int[arg2];
		}
		this.anIntArray328 = new int[arg0];
		this.aByteArray48 = new byte[arg1];
		this.aShortArray51 = new short[arg1];
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "([Lclient!hn;I)V")
	public Class134(@OriginalArg(0) Class134[] arg0, @OriginalArg(1) int arg1) {
		this.anInt3853 = 0;
		this.anInt3860 = 0;
		this.anInt3857 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte51 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class134 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt3857 += local59.anInt3857;
				this.anInt3853 += local59.anInt3853;
				this.anInt3860 += local59.anInt3860;
				local38 |= local59.aByteArray46 != null;
				if (local59.aClass33Array3 != null) {
					local32 += local59.aClass33Array3.length;
				}
				if (local59.aClass335Array3 != null) {
					local34 += local59.aClass335Array3.length;
				}
				if (local59.aClass143Array1 != null) {
					local36 += local59.aClass143Array1.length;
				}
				local42 |= local59.aByteArray48 != null;
				local46 |= local59.aShortArray58 != null;
				local51 |= local59.anIntArray330 != null;
				if (local59.aByteArray49 == null) {
					if (this.aByte51 == -1) {
						this.aByte51 = local59.aByte51;
					}
					if (this.aByte51 != local59.aByte51) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local44 |= local59.aByteArray47 != null;
			}
		}
		this.anIntArray328 = new int[this.anInt3857];
		if (local36 > 0) {
			this.aClass143Array1 = new Class143[local36];
		}
		if (local38) {
			this.aByteArray46 = new byte[this.anInt3853];
		}
		this.aShortArray60 = new short[this.anInt3853];
		if (local40) {
			this.aByteArray49 = new byte[this.anInt3853];
		}
		this.anIntArray336 = new int[this.anInt3857];
		this.aShortArray52 = new short[this.anInt3853];
		if (local32 > 0) {
			this.aClass33Array3 = new Class33[local32];
		}
		this.aShortArray51 = new short[this.anInt3853];
		if (local51) {
			this.anIntArray330 = new int[this.anInt3853];
		}
		if (local34 > 0) {
			this.aClass335Array3 = new Class335[local34];
		}
		this.aShortArray55 = new short[this.anInt3853];
		this.anIntArray329 = new int[this.anInt3857];
		if (local44) {
			this.aByteArray47 = new byte[this.anInt3853];
		}
		this.aShortArray59 = new short[this.anInt3853];
		this.aShortArray53 = new short[this.anInt3857];
		if (local46) {
			this.aShortArray58 = new short[this.anInt3853];
		}
		this.anIntArray326 = new int[this.anInt3857];
		if (this.anInt3860 > 0) {
			this.aShortArray57 = new short[this.anInt3860];
			this.anIntArray333 = new int[this.anInt3860];
			this.anIntArray335 = new int[this.anInt3860];
			this.aShortArray54 = new short[this.anInt3860];
			this.aByteArray51 = new byte[this.anInt3860];
			this.aByteArray50 = new byte[this.anInt3860];
			this.aByteArray45 = new byte[this.anInt3860];
			this.anIntArray334 = new int[this.anInt3860];
			this.aShortArray56 = new short[this.anInt3860];
			this.anIntArray327 = new int[this.anInt3860];
			this.anIntArray331 = new int[this.anInt3860];
			this.anIntArray332 = new int[this.anInt3860];
		}
		if (local42) {
			this.aByteArray48 = new byte[this.anInt3853];
		}
		local36 = 0;
		this.anInt3860 = 0;
		local32 = 0;
		local34 = 0;
		this.anInt3853 = 0;
		this.anInt3857 = 0;
		@Pc(615) int local615;
		@Pc(626) int local626;
		for (@Pc(382) int local382 = 0; local382 < arg1; local382++) {
			@Pc(389) short local389 = (short) (0x1 << local382);
			@Pc(393) Class134 local393 = arg0[local382];
			if (local393 != null) {
				@Pc(400) int local400;
				if (local393.aClass143Array1 != null) {
					for (local400 = 0; local400 < local393.aClass143Array1.length; local400++) {
						@Pc(407) Class143 local407 = local393.aClass143Array1[local400];
						this.aClass143Array1[local36++] = local407.method3513(local407.anInt4099 + this.anInt3853);
					}
				}
				for (local400 = 0; local400 < local393.anInt3853; local400++) {
					if (local38 && local393.aByteArray46 != null) {
						this.aByteArray46[this.anInt3853] = local393.aByteArray46[local400];
					}
					if (local40) {
						if (local393.aByteArray49 == null) {
							this.aByteArray49[this.anInt3853] = local393.aByte51;
						} else {
							this.aByteArray49[this.anInt3853] = local393.aByteArray49[local400];
						}
					}
					if (local42 && local393.aByteArray48 != null) {
						this.aByteArray48[this.anInt3853] = local393.aByteArray48[local400];
					}
					if (local46) {
						if (local393.aShortArray58 == null) {
							this.aShortArray58[this.anInt3853] = -1;
						} else {
							this.aShortArray58[this.anInt3853] = local393.aShortArray58[local400];
						}
					}
					if (local51) {
						if (local393.anIntArray330 == null) {
							this.anIntArray330[this.anInt3853] = -1;
						} else {
							this.anIntArray330[this.anInt3853] = local393.anIntArray330[local400];
						}
					}
					this.aShortArray52[this.anInt3853] = (short) this.method3342(local393.aShortArray52[local400], local389, local393);
					this.aShortArray55[this.anInt3853] = (short) this.method3342(local393.aShortArray55[local400], local389, local393);
					this.aShortArray60[this.anInt3853] = (short) this.method3342(local393.aShortArray60[local400], local389, local393);
					this.aShortArray59[this.anInt3853] = local389;
					this.aShortArray51[this.anInt3853] = local393.aShortArray51[local400];
					this.anInt3853++;
				}
				@Pc(602) int local602;
				if (local393.aClass33Array3 != null) {
					for (local602 = 0; local602 < local393.aClass33Array3.length; local602++) {
						local615 = this.method3342(local393.aClass33Array3[local602].anInt768, local389, local393);
						local626 = this.method3342(local393.aClass33Array3[local602].anInt775, local389, local393);
						@Pc(637) int local637 = this.method3342(local393.aClass33Array3[local602].anInt774, local389, local393);
						this.aClass33Array3[local32] = local393.aClass33Array3[local602].method669(local637, local626, local615);
						local32++;
					}
				}
				if (local393.aClass335Array3 != null) {
					for (local602 = 0; local602 < local393.aClass335Array3.length; local602++) {
						local615 = this.method3342(local393.aClass335Array3[local602].anInt9662, local389, local393);
						this.aClass335Array3[local34] = local393.aClass335Array3[local602].method7727(local615);
						local34++;
					}
				}
			}
		}
		this.anInt3867 = this.anInt3857;
		@Pc(711) int local711 = 0;
		for (@Pc(713) int local713 = 0; local713 < arg1; local713++) {
			@Pc(720) short local720 = (short) (0x1 << local713);
			@Pc(724) Class134 local724 = arg0[local713];
			if (local724 != null) {
				for (local615 = 0; local615 < local724.anInt3853; local615++) {
					if (local44) {
						this.aByteArray47[local711++] = (byte) (local724.aByteArray47 == null || local724.aByteArray47[local615] == -1 ? -1 : local724.aByteArray47[local615] + this.anInt3860);
					}
				}
				for (local626 = 0; local626 < local724.anInt3860; local626++) {
					@Pc(780) byte local780 = this.aByteArray45[this.anInt3860] = local724.aByteArray45[local626];
					if (local780 == 0) {
						this.aShortArray56[this.anInt3860] = (short) this.method3342(local724.aShortArray56[local626], local720, local724);
						this.aShortArray57[this.anInt3860] = (short) this.method3342(local724.aShortArray57[local626], local720, local724);
						this.aShortArray54[this.anInt3860] = (short) this.method3342(local724.aShortArray54[local626], local720, local724);
					}
					if (local780 >= 1 && local780 <= 3) {
						this.aShortArray56[this.anInt3860] = local724.aShortArray56[local626];
						this.aShortArray57[this.anInt3860] = local724.aShortArray57[local626];
						this.aShortArray54[this.anInt3860] = local724.aShortArray54[local626];
						this.anIntArray331[this.anInt3860] = local724.anIntArray331[local626];
						this.anIntArray327[this.anInt3860] = local724.anIntArray327[local626];
						this.anIntArray333[this.anInt3860] = local724.anIntArray333[local626];
						this.aByteArray51[this.anInt3860] = local724.aByteArray51[local626];
						this.aByteArray50[this.anInt3860] = local724.aByteArray50[local626];
						this.anIntArray335[this.anInt3860] = local724.anIntArray335[local626];
					}
					if (local780 == 2) {
						this.anIntArray334[this.anInt3860] = local724.anIntArray334[local626];
						this.anIntArray332[this.anInt3860] = local724.anIntArray332[local626];
					}
					this.anInt3860++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BSSISSBSSB)B")
	public byte method3339() {
		if (this.anInt3860 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray45[this.anInt3860] = 3;
		this.aShortArray56[this.anInt3860] = 0;
		this.aShortArray57[this.anInt3860] = 32767;
		this.aShortArray54[this.anInt3860] = 0;
		this.anIntArray331[this.anInt3860] = 1024;
		this.anIntArray327[this.anInt3860] = 1024;
		this.anIntArray333[this.anInt3860] = 1024;
		this.aByteArray51[this.anInt3860] = 0;
		this.aByteArray50[this.anInt3860] = 0;
		this.anIntArray335[this.anInt3860] = 0;
		return (byte) this.anInt3860++;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)[[I")
	public int[][] method3340() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt3853; local12++) {
			@Pc(19) int local19 = this.anIntArray330[local12];
			if (local19 >= 0) {
				@Pc(28) int local28 = local8[local19]++;
				if (local19 > local10) {
					local10 = local19;
				}
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(81) int local81 = 0; local81 < this.anInt3853; local81++) {
			@Pc(88) int local88 = this.anIntArray330[local81];
			if (local88 >= 0) {
				local50[local88][local8[local88]++] = local81;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIII)I")
	public int method3341(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3857; local7++) {
			if (arg2 == this.anIntArray326[local7] && this.anIntArray328[local7] == arg1 && arg0 == this.anIntArray336[local7]) {
				return local7;
			}
		}
		this.anIntArray326[this.anInt3857] = arg2;
		this.anIntArray328[this.anInt3857] = arg1;
		this.anIntArray336[this.anInt3857] = arg0;
		this.anInt3867 = this.anInt3857 + 1;
		return this.anInt3857++;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ISLclient!hn;I)I")
	private int method3342(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) Class134 arg2) {
		@Pc(10) int local10 = arg2.anIntArray326[arg0];
		@Pc(15) int local15 = arg2.anIntArray328[arg0];
		@Pc(20) int local20 = arg2.anIntArray336[arg0];
		for (@Pc(30) int local30 = 0; local30 < this.anInt3857; local30++) {
			if (local10 == this.anIntArray326[local30] && this.anIntArray328[local30] == local15 && this.anIntArray336[local30] == local20) {
				this.aShortArray53[local30] |= arg1;
				return local30;
			}
		}
		this.anIntArray326[this.anInt3857] = local10;
		this.anIntArray328[this.anInt3857] = local15;
		this.anIntArray336[this.anInt3857] = local20;
		this.aShortArray53[this.anInt3857] = arg1;
		this.anIntArray329[this.anInt3857] = arg2.anIntArray329 == null ? -1 : arg2.anIntArray329[arg0];
		return this.anInt3857++;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([BZ)V")
	private void method3343(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class6_Sub12 local10 = new Class6_Sub12(arg0);
		@Pc(15) Class6_Sub12 local15 = new Class6_Sub12(arg0);
		@Pc(20) Class6_Sub12 local20 = new Class6_Sub12(arg0);
		@Pc(25) Class6_Sub12 local25 = new Class6_Sub12(arg0);
		@Pc(30) Class6_Sub12 local30 = new Class6_Sub12(arg0);
		@Pc(35) Class6_Sub12 local35 = new Class6_Sub12(arg0);
		@Pc(40) Class6_Sub12 local40 = new Class6_Sub12(arg0);
		local10.anInt7556 = arg0.length - 23;
		this.anInt3857 = local10.method6044();
		this.anInt3853 = local10.method6044();
		this.anInt3860 = local10.method6019();
		@Pc(65) int local65 = local10.method6019();
		@Pc(74) boolean local74 = (local65 & 0x1) == 1;
		@Pc(83) boolean local83 = (local65 & 0x2) == 2;
		@Pc(94) boolean local94 = (local65 & 0x4) == 4;
		@Pc(103) boolean local103 = (local65 & 0x8) == 8;
		if (local103) {
			local10.anInt7556 -= 7;
			this.anInt3869 = local10.method6019();
			local10.anInt7556 += 6;
		}
		@Pc(126) int local126 = local10.method6019();
		@Pc(130) int local130 = local10.method6019();
		@Pc(134) int local134 = local10.method6019();
		@Pc(138) int local138 = local10.method6019();
		@Pc(142) int local142 = local10.method6019();
		@Pc(146) int local146 = local10.method6044();
		@Pc(150) int local150 = local10.method6044();
		@Pc(154) int local154 = local10.method6044();
		@Pc(158) int local158 = local10.method6044();
		@Pc(162) int local162 = local10.method6044();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(184) int local184;
		if (this.anInt3860 > 0) {
			this.aByteArray45 = new byte[this.anInt3860];
			local10.anInt7556 = 0;
			for (local184 = 0; local184 < this.anInt3860; local184++) {
				@Pc(195) byte local195 = this.aByteArray45[local184] = local10.method6049();
				if (local195 == 0) {
					local164++;
				}
				if (local195 == 2) {
					local168++;
				}
				if (local195 >= 1 && local195 <= 3) {
					local166++;
				}
			}
		}
		local184 = this.anInt3860;
		@Pc(230) int local230 = local184;
		local184 += this.anInt3857;
		@Pc(237) int local237 = local184;
		if (local74) {
			local184 += this.anInt3853;
		}
		@Pc(250) int local250 = local184;
		local184 += this.anInt3853;
		@Pc(257) int local257 = local184;
		if (local126 == 255) {
			local184 += this.anInt3853;
		}
		@Pc(267) int local267 = local184;
		if (local134 == 1) {
			local184 += this.anInt3853;
		}
		@Pc(277) int local277 = local184;
		if (local142 == 1) {
			local184 += this.anInt3857;
		}
		@Pc(289) int local289 = local184;
		if (local130 == 1) {
			local184 += this.anInt3853;
		}
		@Pc(301) int local301 = local184;
		local184 += local158;
		@Pc(307) int local307 = local184;
		if (local138 == 1) {
			local184 += this.anInt3853 * 2;
		}
		@Pc(321) int local321 = local184;
		local184 += local162;
		@Pc(327) int local327 = local184;
		local184 += this.anInt3853 * 2;
		@Pc(336) int local336 = local184;
		local184 += local146;
		@Pc(342) int local342 = local184;
		local184 += local150;
		@Pc(348) int local348 = local184;
		local184 += local154;
		@Pc(354) int local354 = local184;
		local184 += local164 * 6;
		@Pc(362) int local362 = local184;
		local184 += local166 * 6;
		@Pc(370) byte local370 = 6;
		if (this.anInt3869 == 14) {
			local370 = 7;
		} else if (this.anInt3869 >= 15) {
			local370 = 9;
		}
		@Pc(388) int local388 = local184;
		local184 += local370 * local166;
		@Pc(396) int local396 = local184;
		local184 += local166;
		@Pc(402) int local402 = local184;
		local184 += local166;
		@Pc(408) int local408 = local184;
		local184 += local168 * 2 + local166;
		this.aShortArray52 = new short[this.anInt3853];
		if (local126 == 255) {
			this.aByteArray49 = new byte[this.anInt3853];
		} else {
			this.aByte51 = (byte) local126;
		}
		this.anIntArray336 = new int[this.anInt3857];
		this.anIntArray326 = new int[this.anInt3857];
		if (this.anInt3860 > 0) {
			this.aShortArray54 = new short[this.anInt3860];
			if (local166 > 0) {
				this.aByteArray50 = new byte[local166];
				this.anIntArray327 = new int[local166];
				this.anIntArray335 = new int[local166];
				this.anIntArray331 = new int[local166];
				this.aByteArray51 = new byte[local166];
				this.anIntArray333 = new int[local166];
			}
			this.aShortArray56 = new short[this.anInt3860];
			if (local168 > 0) {
				this.anIntArray334 = new int[local168];
				this.anIntArray332 = new int[local168];
			}
			this.aShortArray57 = new short[this.anInt3860];
		}
		this.aShortArray51 = new short[this.anInt3853];
		if (local74) {
			this.aByteArray46 = new byte[this.anInt3853];
		}
		this.aShortArray60 = new short[this.anInt3853];
		if (local138 == 1 && this.anInt3860 > 0) {
			this.aByteArray47 = new byte[this.anInt3853];
		}
		this.anIntArray328 = new int[this.anInt3857];
		this.aShortArray55 = new short[this.anInt3853];
		if (local138 == 1) {
			this.aShortArray58 = new short[this.anInt3853];
		}
		local10.anInt7556 = local230;
		if (local130 == 1) {
			this.aByteArray48 = new byte[this.anInt3853];
		}
		if (local134 == 1) {
			this.anIntArray330 = new int[this.anInt3853];
		}
		if (local142 == 1) {
			this.anIntArray329 = new int[this.anInt3857];
		}
		local15.anInt7556 = local336;
		local20.anInt7556 = local342;
		local25.anInt7556 = local348;
		local30.anInt7556 = local277;
		@Pc(601) int local601 = 0;
		@Pc(603) int local603 = 0;
		@Pc(605) int local605 = 0;
		@Pc(613) int local613;
		for (@Pc(607) int local607 = 0; local607 < this.anInt3857; local607++) {
			local613 = local10.method6019();
			@Pc(615) int local615 = 0;
			if ((local613 & 0x1) != 0) {
				local615 = local15.method6010();
			}
			@Pc(625) int local625 = 0;
			if ((local613 & 0x2) != 0) {
				local625 = local20.method6010();
			}
			@Pc(635) int local635 = 0;
			if ((local613 & 0x4) != 0) {
				local635 = local25.method6010();
			}
			this.anIntArray326[local607] = local615 + local601;
			this.anIntArray328[local607] = local625 + local603;
			this.anIntArray336[local607] = local635 + local605;
			local605 = this.anIntArray336[local607];
			local603 = this.anIntArray328[local607];
			local601 = this.anIntArray326[local607];
			if (local142 == 1) {
				this.anIntArray329[local607] = local30.method6019();
			}
		}
		local10.anInt7556 = local327;
		local15.anInt7556 = local237;
		local20.anInt7556 = local257;
		local25.anInt7556 = local289;
		local30.anInt7556 = local267;
		local35.anInt7556 = local307;
		local40.anInt7556 = local321;
		for (local613 = 0; local613 < this.anInt3853; local613++) {
			this.aShortArray51[local613] = (short) local10.method6044();
			if (local74) {
				this.aByteArray46[local613] = local15.method6049();
			}
			if (local126 == 255) {
				this.aByteArray49[local613] = local20.method6049();
			}
			if (local130 == 1) {
				this.aByteArray48[local613] = local25.method6049();
			}
			if (local134 == 1) {
				this.anIntArray330[local613] = local30.method6019();
			}
			if (local138 == 1) {
				this.aShortArray58[local613] = (short) (local35.method6044() - 1);
			}
			if (this.aByteArray47 != null) {
				if (this.aShortArray58[local613] == -1) {
					this.aByteArray47[local613] = -1;
				} else {
					this.aByteArray47[local613] = (byte) (local40.method6019() - 1);
				}
			}
		}
		this.anInt3867 = -1;
		local10.anInt7556 = local301;
		local15.anInt7556 = local250;
		@Pc(833) short local833 = 0;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(847) int local847;
		for (@Pc(841) int local841 = 0; local841 < this.anInt3853; local841++) {
			local847 = local15.method6019();
			if (local847 == 1) {
				local833 = (short) (local839 + local10.method6010());
				local835 = (short) (local833 + local10.method6010());
				local837 = (short) (local835 + local10.method6010());
				local839 = local837;
				this.aShortArray52[local841] = local833;
				this.aShortArray55[local841] = local835;
				this.aShortArray60[local841] = local837;
				if (this.anInt3867 < local833) {
					this.anInt3867 = local833;
				}
				if (this.anInt3867 < local835) {
					this.anInt3867 = local835;
				}
				if (this.anInt3867 < local837) {
					this.anInt3867 = local837;
				}
			}
			if (local847 == 2) {
				local835 = local837;
				local837 = (short) (local839 + local10.method6010());
				this.aShortArray52[local841] = local833;
				local839 = local837;
				this.aShortArray55[local841] = local835;
				this.aShortArray60[local841] = local837;
				if (local837 > this.anInt3867) {
					this.anInt3867 = local837;
				}
			}
			if (local847 == 3) {
				local833 = local837;
				local837 = (short) (local839 + local10.method6010());
				this.aShortArray52[local841] = local833;
				local839 = local837;
				this.aShortArray55[local841] = local835;
				this.aShortArray60[local841] = local837;
				if (local837 > this.anInt3867) {
					this.anInt3867 = local837;
				}
			}
			if (local847 == 4) {
				@Pc(1000) short local1000 = local833;
				local833 = local835;
				local837 = (short) (local839 + local10.method6010());
				local835 = local1000;
				local839 = local837;
				this.aShortArray52[local841] = local833;
				this.aShortArray55[local841] = local1000;
				this.aShortArray60[local841] = local837;
				if (this.anInt3867 < local837) {
					this.anInt3867 = local837;
				}
			}
		}
		local10.anInt7556 = local354;
		this.anInt3867++;
		local15.anInt7556 = local362;
		local20.anInt7556 = local388;
		local25.anInt7556 = local396;
		local30.anInt7556 = local402;
		local35.anInt7556 = local408;
		@Pc(1079) int local1079;
		for (local847 = 0; local847 < this.anInt3860; local847++) {
			local1079 = this.aByteArray45[local847] & 0xFF;
			if (local1079 == 0) {
				this.aShortArray56[local847] = (short) local10.method6044();
				this.aShortArray57[local847] = (short) local10.method6044();
				this.aShortArray54[local847] = (short) local10.method6044();
			}
			if (local1079 == 1) {
				this.aShortArray56[local847] = (short) local15.method6044();
				this.aShortArray57[local847] = (short) local15.method6044();
				this.aShortArray54[local847] = (short) local15.method6044();
				if (this.anInt3869 >= 15) {
					this.anIntArray331[local847] = local20.method6037();
					this.anIntArray327[local847] = local20.method6037();
					this.anIntArray333[local847] = local20.method6037();
				} else {
					this.anIntArray331[local847] = local20.method6044();
					if (this.anInt3869 < 14) {
						this.anIntArray327[local847] = local20.method6044();
					} else {
						this.anIntArray327[local847] = local20.method6037();
					}
					this.anIntArray333[local847] = local20.method6044();
				}
				this.aByteArray51[local847] = local25.method6049();
				this.aByteArray50[local847] = local30.method6049();
				this.anIntArray335[local847] = local35.method6049();
			}
			if (local1079 == 2) {
				this.aShortArray56[local847] = (short) local15.method6044();
				this.aShortArray57[local847] = (short) local15.method6044();
				this.aShortArray54[local847] = (short) local15.method6044();
				if (this.anInt3869 >= 15) {
					this.anIntArray331[local847] = local20.method6037();
					this.anIntArray327[local847] = local20.method6037();
					this.anIntArray333[local847] = local20.method6037();
				} else {
					this.anIntArray331[local847] = local20.method6044();
					if (this.anInt3869 >= 14) {
						this.anIntArray327[local847] = local20.method6037();
					} else {
						this.anIntArray327[local847] = local20.method6044();
					}
					this.anIntArray333[local847] = local20.method6044();
				}
				this.aByteArray51[local847] = local25.method6049();
				this.aByteArray50[local847] = local30.method6049();
				this.anIntArray335[local847] = local35.method6049();
				this.anIntArray334[local847] = local35.method6049();
				this.anIntArray332[local847] = local35.method6049();
			}
			if (local1079 == 3) {
				this.aShortArray56[local847] = (short) local15.method6044();
				this.aShortArray57[local847] = (short) local15.method6044();
				this.aShortArray54[local847] = (short) local15.method6044();
				if (this.anInt3869 < 15) {
					this.anIntArray331[local847] = local20.method6044();
					if (this.anInt3869 >= 14) {
						this.anIntArray327[local847] = local20.method6037();
					} else {
						this.anIntArray327[local847] = local20.method6044();
					}
					this.anIntArray333[local847] = local20.method6044();
				} else {
					this.anIntArray331[local847] = local20.method6037();
					this.anIntArray327[local847] = local20.method6037();
					this.anIntArray333[local847] = local20.method6037();
				}
				this.aByteArray51[local847] = local25.method6049();
				this.aByteArray50[local847] = local30.method6049();
				this.anIntArray335[local847] = local35.method6049();
			}
		}
		local10.anInt7556 = local184;
		@Pc(1485) int local1485;
		@Pc(1491) int local1491;
		@Pc(1495) int local1495;
		@Pc(1561) int local1561;
		if (local83) {
			local1079 = local10.method6019();
			if (local1079 > 0) {
				this.aClass33Array3 = new Class33[local1079];
				for (local1485 = 0; local1485 < local1079; local1485++) {
					local1491 = local10.method6044();
					local1495 = local10.method6044();
					@Pc(1505) byte local1505;
					if (local126 == 255) {
						local1505 = this.aByteArray49[local1495];
					} else {
						local1505 = (byte) local126;
					}
					this.aClass33Array3[local1485] = new Class33(local1491, this.aShortArray52[local1495], this.aShortArray55[local1495], this.aShortArray60[local1495], local1505);
				}
			}
			local1485 = local10.method6019();
			if (local1485 > 0) {
				this.aClass335Array3 = new Class335[local1485];
				for (local1491 = 0; local1491 < local1485; local1491++) {
					local1495 = local10.method6044();
					local1561 = local10.method6044();
					this.aClass335Array3[local1491] = new Class335(local1495, local1561);
				}
			}
		}
		if (!local94) {
			return;
		}
		local1079 = local10.method6019();
		if (local1079 <= 0) {
			return;
		}
		this.aClass143Array1 = new Class143[local1079];
		for (local1485 = 0; local1485 < local1079; local1485++) {
			local1491 = local10.method6044();
			local1495 = local10.method6044();
			local1561 = local10.method6019();
			@Pc(1609) byte local1609 = local10.method6049();
			this.aClass143Array1[local1485] = new Class143(local1491, local1495, local1561, local1609);
		}
		return;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([BI)V")
	private void method3344(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class6_Sub12 local14 = new Class6_Sub12(arg0);
		@Pc(19) Class6_Sub12 local19 = new Class6_Sub12(arg0);
		@Pc(24) Class6_Sub12 local24 = new Class6_Sub12(arg0);
		@Pc(29) Class6_Sub12 local29 = new Class6_Sub12(arg0);
		@Pc(34) Class6_Sub12 local34 = new Class6_Sub12(arg0);
		local14.anInt7556 = arg0.length - 18;
		this.anInt3857 = local14.method6044();
		this.anInt3853 = local14.method6044();
		this.anInt3860 = local14.method6019();
		@Pc(59) int local59 = local14.method6019();
		@Pc(63) int local63 = local14.method6019();
		@Pc(67) int local67 = local14.method6019();
		@Pc(71) int local71 = local14.method6019();
		@Pc(75) int local75 = local14.method6019();
		@Pc(79) int local79 = local14.method6044();
		@Pc(83) int local83 = local14.method6044();
		@Pc(87) int local87 = local14.method6044();
		@Pc(91) int local91 = local14.method6044();
		@Pc(100) int local100 = this.anInt3857;
		@Pc(102) int local102 = local100;
		local100 += this.anInt3853;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt3853;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt3853;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt3853;
		}
		@Pc(139) int local139 = local100;
		if (local75 == 1) {
			local100 += this.anInt3857;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt3853;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt3853 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt3860 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		this.aShortArray52 = new short[this.anInt3853];
		this.aShortArray60 = new short[this.anInt3853];
		this.anIntArray328 = new int[this.anInt3857];
		if (local63 == 255) {
			this.aByteArray49 = new byte[this.anInt3853];
		} else {
			this.aByte51 = (byte) local63;
		}
		if (local75 == 1) {
			this.anIntArray329 = new int[this.anInt3857];
		}
		this.anIntArray336 = new int[this.anInt3857];
		if (local71 == 1) {
			this.anIntArray330 = new int[this.anInt3853];
		}
		local14.anInt7556 = 0;
		if (this.anInt3860 > 0) {
			this.aShortArray57 = new short[this.anInt3860];
			this.aShortArray56 = new short[this.anInt3860];
			this.aByteArray45 = new byte[this.anInt3860];
			this.aShortArray54 = new short[this.anInt3860];
		}
		if (local59 == 1) {
			this.aByteArray47 = new byte[this.anInt3853];
			this.aShortArray58 = new short[this.anInt3853];
			this.aByteArray46 = new byte[this.anInt3853];
		}
		this.aShortArray51 = new short[this.anInt3853];
		this.aShortArray55 = new short[this.anInt3853];
		this.anIntArray326 = new int[this.anInt3857];
		if (local67 == 1) {
			this.aByteArray48 = new byte[this.anInt3853];
		}
		local19.anInt7556 = local189;
		local24.anInt7556 = local195;
		local29.anInt7556 = local100;
		local34.anInt7556 = local139;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(354) int local354;
		@Pc(356) int local356;
		for (@Pc(346) int local346 = 0; local346 < this.anInt3857; local346++) {
			local354 = local14.method6019();
			local356 = 0;
			if ((local354 & 0x1) != 0) {
				local356 = local19.method6010();
			}
			@Pc(366) int local366 = 0;
			if ((local354 & 0x2) != 0) {
				local366 = local24.method6010();
			}
			@Pc(376) int local376 = 0;
			if ((local354 & 0x4) != 0) {
				local376 = local29.method6010();
			}
			this.anIntArray326[local346] = local340 + local356;
			this.anIntArray328[local346] = local366 + local342;
			this.anIntArray336[local346] = local376 + local344;
			local342 = this.anIntArray328[local346];
			local344 = this.anIntArray336[local346];
			local340 = this.anIntArray326[local346];
			if (local75 == 1) {
				this.anIntArray329[local346] = local34.method6019();
			}
		}
		local14.anInt7556 = local171;
		local19.anInt7556 = local129;
		local24.anInt7556 = local109;
		local29.anInt7556 = local151;
		local34.anInt7556 = local119;
		for (local354 = 0; local354 < this.anInt3853; local354++) {
			this.aShortArray51[local354] = (short) local14.method6044();
			if (local59 == 1) {
				local356 = local19.method6019();
				if ((local356 & 0x1) == 1) {
					this.aByteArray46[local354] = 1;
					local7 = true;
				} else {
					this.aByteArray46[local354] = 0;
				}
				if ((local356 & 0x2) == 2) {
					this.aByteArray47[local354] = (byte) (local356 >> 2);
					this.aShortArray58[local354] = this.aShortArray51[local354];
					this.aShortArray51[local354] = 127;
					if (this.aShortArray58[local354] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray47[local354] = -1;
					this.aShortArray58[local354] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray49[local354] = local24.method6049();
			}
			if (local67 == 1) {
				this.aByteArray48[local354] = local29.method6049();
			}
			if (local71 == 1) {
				this.anIntArray330[local354] = local34.method6019();
			}
		}
		this.anInt3867 = -1;
		local14.anInt7556 = local165;
		local19.anInt7556 = local102;
		@Pc(592) short local592 = 0;
		@Pc(594) short local594 = 0;
		@Pc(596) short local596 = 0;
		@Pc(598) short local598 = 0;
		@Pc(608) int local608;
		for (@Pc(600) int local600 = 0; local600 < this.anInt3853; local600++) {
			local608 = local19.method6019();
			if (local608 == 1) {
				local592 = (short) (local14.method6010() + local598);
				local594 = (short) (local14.method6010() + local592);
				local596 = (short) (local14.method6010() + local594);
				this.aShortArray52[local600] = local592;
				local598 = local596;
				this.aShortArray55[local600] = local594;
				this.aShortArray60[local600] = local596;
				if (local592 > this.anInt3867) {
					this.anInt3867 = local592;
				}
				if (this.anInt3867 < local594) {
					this.anInt3867 = local594;
				}
				if (this.anInt3867 < local596) {
					this.anInt3867 = local596;
				}
			}
			if (local608 == 2) {
				local594 = local596;
				local596 = (short) (local14.method6010() + local598);
				this.aShortArray52[local600] = local592;
				local598 = local596;
				this.aShortArray55[local600] = local594;
				this.aShortArray60[local600] = local596;
				if (this.anInt3867 < local596) {
					this.anInt3867 = local596;
				}
			}
			if (local608 == 3) {
				local592 = local596;
				local596 = (short) (local598 + local14.method6010());
				local598 = local596;
				this.aShortArray52[local600] = local592;
				this.aShortArray55[local600] = local594;
				this.aShortArray60[local600] = local596;
				if (local596 > this.anInt3867) {
					this.anInt3867 = local596;
				}
			}
			if (local608 == 4) {
				@Pc(763) short local763 = local592;
				local592 = local594;
				local594 = local763;
				local596 = (short) (local14.method6010() + local598);
				local598 = local596;
				this.aShortArray52[local600] = local592;
				this.aShortArray55[local600] = local763;
				this.aShortArray60[local600] = local596;
				if (local596 > this.anInt3867) {
					this.anInt3867 = local596;
				}
			}
		}
		this.anInt3867++;
		local14.anInt7556 = local180;
		for (local608 = 0; local608 < this.anInt3860; local608++) {
			this.aByteArray45[local608] = 0;
			this.aShortArray56[local608] = (short) local14.method6044();
			this.aShortArray57[local608] = (short) local14.method6044();
			this.aShortArray54[local608] = (short) local14.method6044();
		}
		if (this.aByteArray47 != null) {
			@Pc(863) boolean local863 = false;
			for (@Pc(865) int local865 = 0; local865 < this.anInt3853; local865++) {
				@Pc(874) int local874 = this.aByteArray47[local865] & 0xFF;
				if (local874 != 255) {
					if (this.aShortArray52[local865] == (this.aShortArray56[local874] & 0xFFFF) && this.aShortArray55[local865] == (this.aShortArray57[local874] & 0xFFFF) && (this.aShortArray54[local874] & 0xFFFF) == this.aShortArray60[local865]) {
						this.aByteArray47[local865] = -1;
					} else {
						local863 = true;
					}
				}
			}
			if (!local863) {
				this.aByteArray47 = null;
			}
		}
		if (!local7) {
			this.aByteArray46 = null;
		}
		if (!local9) {
			this.aShortArray58 = null;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V")
	public void method3345() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3857; local3++) {
			this.anIntArray326[local3] <<= 0x2;
			this.anIntArray328[local3] <<= 0x2;
			this.anIntArray336[local3] <<= 0x2;
		}
		if (this.anInt3860 <= 0 || this.anIntArray331 == null) {
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < this.anIntArray331.length; local61++) {
			this.anIntArray331[local61] <<= 0x2;
			this.anIntArray327[local61] <<= 0x2;
			if (this.aByteArray45[local61] != 1) {
				this.anIntArray333[local61] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BIII)V")
	public void method3347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(15) int local15 = 0; local15 < this.anInt3857; local15++) {
			this.anIntArray326[local15] += arg2;
			this.anIntArray328[local15] += arg0;
			this.anIntArray336[local15] += arg1;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(BIII)V")
	public void method3348(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local10 = Class22.anIntArray20[arg1];
			local14 = Class22.anIntArray19[arg1];
			for (local16 = 0; local16 < this.anInt3857; local16++) {
				local34 = this.anIntArray326[local16] * local14 + this.anIntArray328[local16] * local10 >> 14;
				this.anIntArray328[local16] = this.anIntArray328[local16] * local14 - local10 * this.anIntArray326[local16] >> 14;
				this.anIntArray326[local16] = local34;
			}
		}
		if (arg2 != 0) {
			local10 = Class22.anIntArray20[arg2];
			local14 = Class22.anIntArray19[arg2];
			for (local16 = 0; local16 < this.anInt3857; local16++) {
				local34 = this.anIntArray328[local16] * local14 - local10 * this.anIntArray336[local16] >> 14;
				this.anIntArray336[local16] = local14 * this.anIntArray336[local16] + local10 * this.anIntArray328[local16] >> 14;
				this.anIntArray328[local16] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local10 = Class22.anIntArray20[arg0];
		local14 = Class22.anIntArray19[arg0];
		for (local16 = 0; local16 < this.anInt3857; local16++) {
			local34 = local14 * this.anIntArray326[local16] + this.anIntArray336[local16] * local10 >> 14;
			this.anIntArray336[local16] = this.anIntArray336[local16] * local14 - local10 * this.anIntArray326[local16] >> 14;
			this.anIntArray326[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BZ)[[I")
	public int[][] method3349(@OriginalArg(1) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt3857 : this.anInt3867;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray329[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(38) int local38 = local8[local27]++;
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < local18; local80++) {
			@Pc(87) int local87 = this.anIntArray329[local80];
			if (local87 >= 0) {
				local55[local87][local8[local87]++] = local80;
			}
		}
		return local55;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)[[I")
	public int[][] method3350() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass143Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass143Array1[local12].anInt4094;
			if (local20 >= 0) {
				@Pc(26) int local26 = local8[local20]++;
				if (local10 < local20) {
					local10 = local20;
				}
			}
		}
		@Pc(45) int[][] local45 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local45[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.aClass143Array1.length; local78++) {
			@Pc(86) int local86 = this.aClass143Array1[local78].anInt4094;
			if (local86 >= 0) {
				local45[local86][local8[local86]++] = local78;
			}
		}
		return local45;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(SZS)V")
	public void method3351(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt3853; local7++) {
			if (arg0 == this.aShortArray51[local7]) {
				this.aShortArray51[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ISS)V")
	public void method3352(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray58 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt3853; local11++) {
			if (this.aShortArray58[local11] == arg1) {
				this.aShortArray58[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BISISIIBB)I")
	public int method3353(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short arg2, @OriginalArg(3) int arg3, @OriginalArg(4) short arg4, @OriginalArg(5) int arg5, @OriginalArg(7) byte arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray52[this.anInt3853] = (short) arg1;
		this.aShortArray55[this.anInt3853] = (short) arg3;
		this.aShortArray60[this.anInt3853] = (short) arg5;
		this.aByteArray46[this.anInt3853] = arg7;
		this.aByteArray47[this.anInt3853] = arg0;
		this.aShortArray51[this.anInt3853] = arg2;
		this.aByteArray48[this.anInt3853] = arg6;
		this.aShortArray58[this.anInt3853] = arg4;
		return this.anInt3853++;
	}
}
