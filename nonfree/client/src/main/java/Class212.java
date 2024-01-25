import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lga")
public final class Class212 {

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "[S")
	public short[] aShortArray61;

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "[B")
	public byte[] aByteArray46;

	@OriginalMember(owner = "client!lga", name = "f", descriptor = "[Lclient!hk;")
	public Class149[] aClass149Array1;

	@OriginalMember(owner = "client!lga", name = "h", descriptor = "[S")
	public short[] aShortArray62;

	@OriginalMember(owner = "client!lga", name = "j", descriptor = "[I")
	public int[] anIntArray353;

	@OriginalMember(owner = "client!lga", name = "k", descriptor = "[I")
	public int[] anIntArray354;

	@OriginalMember(owner = "client!lga", name = "l", descriptor = "[S")
	public short[] aShortArray63;

	@OriginalMember(owner = "client!lga", name = "m", descriptor = "[B")
	public byte[] aByteArray47;

	@OriginalMember(owner = "client!lga", name = "o", descriptor = "[S")
	public short[] aShortArray64;

	@OriginalMember(owner = "client!lga", name = "p", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!lga", name = "s", descriptor = "[I")
	public int[] anIntArray356;

	@OriginalMember(owner = "client!lga", name = "u", descriptor = "[B")
	public byte[] aByteArray48;

	@OriginalMember(owner = "client!lga", name = "y", descriptor = "[S")
	public short[] aShortArray65;

	@OriginalMember(owner = "client!lga", name = "z", descriptor = "[I")
	public int[] anIntArray357;

	@OriginalMember(owner = "client!lga", name = "A", descriptor = "[S")
	public short[] aShortArray66;

	@OriginalMember(owner = "client!lga", name = "C", descriptor = "[B")
	public byte[] aByteArray49;

	@OriginalMember(owner = "client!lga", name = "D", descriptor = "[B")
	public byte[] aByteArray50;

	@OriginalMember(owner = "client!lga", name = "E", descriptor = "[S")
	public short[] aShortArray67;

	@OriginalMember(owner = "client!lga", name = "F", descriptor = "[S")
	public short[] aShortArray68;

	@OriginalMember(owner = "client!lga", name = "H", descriptor = "[Lclient!qi;")
	public Class287[] aClass287Array2;

	@OriginalMember(owner = "client!lga", name = "I", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!lga", name = "J", descriptor = "[Lclient!hv;")
	public Class156[] aClass156Array2;

	@OriginalMember(owner = "client!lga", name = "L", descriptor = "[S")
	public short[] aShortArray69;

	@OriginalMember(owner = "client!lga", name = "N", descriptor = "[S")
	public short[] aShortArray70;

	@OriginalMember(owner = "client!lga", name = "P", descriptor = "[I")
	public int[] anIntArray359;

	@OriginalMember(owner = "client!lga", name = "Q", descriptor = "[I")
	public int[] anIntArray360;

	@OriginalMember(owner = "client!lga", name = "R", descriptor = "[B")
	public byte[] aByteArray51;

	@OriginalMember(owner = "client!lga", name = "W", descriptor = "[B")
	public byte[] aByteArray52;

	@OriginalMember(owner = "client!lga", name = "X", descriptor = "[I")
	public int[] anIntArray361;

	@OriginalMember(owner = "client!lga", name = "Z", descriptor = "[I")
	public int[] anIntArray362;

	@OriginalMember(owner = "client!lga", name = "ab", descriptor = "[I")
	public int[] anIntArray363;

	@OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
	public int anInt5662 = 12;

	@OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
	public int anInt5661 = 0;

	@OriginalMember(owner = "client!lga", name = "v", descriptor = "I")
	public int anInt5663 = 0;

	@OriginalMember(owner = "client!lga", name = "O", descriptor = "I")
	public int anInt5669 = 0;

	@OriginalMember(owner = "client!lga", name = "w", descriptor = "B")
	public byte aByte79 = 0;

	@OriginalMember(owner = "client!lga", name = "B", descriptor = "I")
	public int anInt5665 = 0;

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "()V")
	private Class212() {
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "([B)V")
	public Class212(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4921(arg0);
		} else {
			this.method4918(arg0);
		}
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(III)V")
	public Class212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray65 = new short[arg1];
		if (arg2 > 0) {
			this.anIntArray363 = new int[arg2];
			this.anIntArray359 = new int[arg2];
			this.anIntArray356 = new int[arg2];
			this.anIntArray358 = new int[arg2];
			this.aByteArray47 = new byte[arg2];
			this.aShortArray62 = new short[arg2];
			this.anIntArray361 = new int[arg2];
			this.aByteArray48 = new byte[arg2];
			this.aShortArray70 = new short[arg2];
			this.aByteArray49 = new byte[arg2];
			this.aShortArray67 = new short[arg2];
			this.anIntArray357 = new int[arg2];
		}
		this.anIntArray354 = new int[arg0];
		this.aShortArray68 = new short[arg1];
		this.anIntArray355 = new int[arg0];
		this.aShortArray61 = new short[arg1];
		this.aShortArray63 = new short[arg1];
		this.anIntArray353 = new int[arg0];
		this.anIntArray362 = new int[arg1];
		this.aByteArray46 = new byte[arg1];
		this.anIntArray360 = new int[arg0];
		this.aByteArray51 = new byte[arg1];
		this.aShortArray69 = new short[arg1];
		this.aByteArray52 = new byte[arg1];
		this.aByteArray50 = new byte[arg1];
	}

	@OriginalMember(owner = "client!lga", name = "<init>", descriptor = "([Lclient!lga;I)V")
	public Class212(@OriginalArg(0) Class212[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5663 = 0;
		this.anInt5661 = 0;
		this.anInt5669 = 0;
		@Pc(30) int local30 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) boolean local36 = false;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte79 = -1;
		for (@Pc(51) int local51 = 0; local51 < arg1; local51++) {
			@Pc(56) Class212 local56 = arg0[local51];
			if (local56 != null) {
				this.anInt5661 += local56.anInt5661;
				this.anInt5669 += local56.anInt5669;
				this.anInt5663 += local56.anInt5663;
				if (local56.aClass149Array1 != null) {
					local34 += local56.aClass149Array1.length;
				}
				if (local56.aClass287Array2 != null) {
					local30 += local56.aClass287Array2.length;
				}
				local36 |= local56.aByteArray46 != null;
				if (local56.aClass156Array2 != null) {
					local32 += local56.aClass156Array2.length;
				}
				local44 |= local56.aShortArray61 != null;
				local40 |= local56.aByteArray52 != null;
				local42 |= local56.aByteArray51 != null;
				if (local56.aByteArray50 == null) {
					if (this.aByte79 == -1) {
						this.aByte79 = local56.aByte79;
					}
					if (local56.aByte79 != this.aByte79) {
						local38 = true;
					}
				} else {
					local38 = true;
				}
				local46 |= local56.anIntArray362 != null;
			}
		}
		if (local36) {
			this.aByteArray46 = new byte[this.anInt5661];
		}
		if (local30 > 0) {
			this.aClass287Array2 = new Class287[local30];
		}
		if (local40) {
			this.aByteArray52 = new byte[this.anInt5661];
		}
		this.aShortArray65 = new short[this.anInt5661];
		this.anIntArray360 = new int[this.anInt5669];
		this.anIntArray354 = new int[this.anInt5669];
		if (local44) {
			this.aShortArray61 = new short[this.anInt5661];
		}
		if (local42) {
			this.aByteArray51 = new byte[this.anInt5661];
		}
		if (local38) {
			this.aByteArray50 = new byte[this.anInt5661];
		}
		this.aShortArray69 = new short[this.anInt5661];
		if (local46) {
			this.anIntArray362 = new int[this.anInt5661];
		}
		this.anIntArray355 = new int[this.anInt5669];
		if (local34 > 0) {
			this.aClass149Array1 = new Class149[local34];
		}
		this.aShortArray68 = new short[this.anInt5661];
		if (this.anInt5663 > 0) {
			this.aByteArray49 = new byte[this.anInt5663];
			this.anIntArray361 = new int[this.anInt5663];
			this.aShortArray67 = new short[this.anInt5663];
			this.aShortArray70 = new short[this.anInt5663];
			this.anIntArray363 = new int[this.anInt5663];
			this.anIntArray359 = new int[this.anInt5663];
			this.anIntArray356 = new int[this.anInt5663];
			this.anIntArray358 = new int[this.anInt5663];
			this.aByteArray48 = new byte[this.anInt5663];
			this.aByteArray47 = new byte[this.anInt5663];
			this.aShortArray62 = new short[this.anInt5663];
			this.anIntArray357 = new int[this.anInt5663];
		}
		this.aShortArray64 = new short[this.anInt5669];
		this.anIntArray353 = new int[this.anInt5669];
		if (local32 > 0) {
			this.aClass156Array2 = new Class156[local32];
		}
		this.aShortArray63 = new short[this.anInt5661];
		this.aShortArray66 = new short[this.anInt5661];
		local30 = 0;
		local32 = 0;
		local34 = 0;
		this.anInt5669 = 0;
		this.anInt5663 = 0;
		this.anInt5661 = 0;
		@Pc(602) int local602;
		@Pc(613) int local613;
		for (@Pc(376) int local376 = 0; local376 < arg1; local376++) {
			@Pc(382) short local382 = (short) (0x1 << local376);
			@Pc(386) Class212 local386 = arg0[local376];
			if (local386 != null) {
				@Pc(393) int local393;
				if (local386.aClass149Array1 != null) {
					for (local393 = 0; local393 < local386.aClass149Array1.length; local393++) {
						@Pc(399) Class149 local399 = local386.aClass149Array1[local393];
						this.aClass149Array1[local34++] = local399.method3549(local399.anInt4079 + this.anInt5661);
					}
				}
				for (local393 = 0; local393 < local386.anInt5661; local393++) {
					if (local36 && local386.aByteArray46 != null) {
						this.aByteArray46[this.anInt5661] = local386.aByteArray46[local393];
					}
					if (local38) {
						if (local386.aByteArray50 == null) {
							this.aByteArray50[this.anInt5661] = local386.aByte79;
						} else {
							this.aByteArray50[this.anInt5661] = local386.aByteArray50[local393];
						}
					}
					if (local40 && local386.aByteArray52 != null) {
						this.aByteArray52[this.anInt5661] = local386.aByteArray52[local393];
					}
					if (local44) {
						if (local386.aShortArray61 == null) {
							this.aShortArray61[this.anInt5661] = -1;
						} else {
							this.aShortArray61[this.anInt5661] = local386.aShortArray61[local393];
						}
					}
					if (local46) {
						if (local386.anIntArray362 == null) {
							this.anIntArray362[this.anInt5661] = -1;
						} else {
							this.anIntArray362[this.anInt5661] = local386.anIntArray362[local393];
						}
					}
					this.aShortArray63[this.anInt5661] = (short) this.method4923(local386, local382, local386.aShortArray63[local393]);
					this.aShortArray69[this.anInt5661] = (short) this.method4923(local386, local382, local386.aShortArray69[local393]);
					this.aShortArray65[this.anInt5661] = (short) this.method4923(local386, local382, local386.aShortArray65[local393]);
					this.aShortArray66[this.anInt5661] = local382;
					this.aShortArray68[this.anInt5661] = local386.aShortArray68[local393];
					this.anInt5661++;
				}
				@Pc(590) int local590;
				if (local386.aClass287Array2 != null) {
					for (local590 = 0; local590 < local386.aClass287Array2.length; local590++) {
						local602 = this.method4923(local386, local382, local386.aClass287Array2[local590].anInt7576);
						local613 = this.method4923(local386, local382, local386.aClass287Array2[local590].anInt7583);
						@Pc(624) int local624 = this.method4923(local386, local382, local386.aClass287Array2[local590].anInt7574);
						this.aClass287Array2[local30] = local386.aClass287Array2[local590].method6665(local624, local613, local602);
						local30++;
					}
				}
				if (local386.aClass156Array2 != null) {
					for (local590 = 0; local590 < local386.aClass156Array2.length; local590++) {
						local602 = this.method4923(local386, local382, local386.aClass156Array2[local590].anInt4163);
						this.aClass156Array2[local32] = local386.aClass156Array2[local590].method3620(local602);
						local32++;
					}
				}
			}
		}
		@Pc(689) int local689 = 0;
		this.anInt5665 = this.anInt5669;
		for (@Pc(695) int local695 = 0; local695 < arg1; local695++) {
			@Pc(701) short local701 = (short) (0x1 << local695);
			@Pc(705) Class212 local705 = arg0[local695];
			if (local705 != null) {
				for (local602 = 0; local602 < local705.anInt5661; local602++) {
					if (local42) {
						this.aByteArray51[local689++] = (byte) (local705.aByteArray51 == null || local705.aByteArray51[local602] == -1 ? -1 : local705.aByteArray51[local602] + this.anInt5663);
					}
				}
				for (local613 = 0; local613 < local705.anInt5663; local613++) {
					@Pc(756) byte local756 = this.aByteArray49[this.anInt5663] = local705.aByteArray49[local613];
					if (local756 == 0) {
						this.aShortArray70[this.anInt5663] = (short) this.method4923(local705, local701, local705.aShortArray70[local613]);
						this.aShortArray62[this.anInt5663] = (short) this.method4923(local705, local701, local705.aShortArray62[local613]);
						this.aShortArray67[this.anInt5663] = (short) this.method4923(local705, local701, local705.aShortArray67[local613]);
					}
					if (local756 >= 1 && local756 <= 3) {
						this.aShortArray70[this.anInt5663] = local705.aShortArray70[local613];
						this.aShortArray62[this.anInt5663] = local705.aShortArray62[local613];
						this.aShortArray67[this.anInt5663] = local705.aShortArray67[local613];
						this.anIntArray359[this.anInt5663] = local705.anIntArray359[local613];
						this.anIntArray363[this.anInt5663] = local705.anIntArray363[local613];
						this.anIntArray356[this.anInt5663] = local705.anIntArray356[local613];
						this.aByteArray47[this.anInt5663] = local705.aByteArray47[local613];
						this.aByteArray48[this.anInt5663] = local705.aByteArray48[local613];
						this.anIntArray358[this.anInt5663] = local705.anIntArray358[local613];
					}
					if (local756 == 2) {
						this.anIntArray361[this.anInt5663] = local705.anIntArray361[local613];
						this.anIntArray357[this.anInt5663] = local705.anIntArray357[local613];
					}
					this.anInt5663++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(SIS)V")
	public void method4915(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5661; local11++) {
			if (this.aShortArray68[local11] == arg1) {
				this.aShortArray68[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII)V")
	public void method4916(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(34) int local34;
		if (arg1 != 0) {
			local11 = Class290.anIntArray546[arg1];
			local15 = Class290.anIntArray547[arg1];
			for (local17 = 0; local17 < this.anInt5669; local17++) {
				local34 = local15 * this.anIntArray355[local17] + local11 * this.anIntArray360[local17] >> 14;
				this.anIntArray360[local17] = this.anIntArray360[local17] * local15 - local11 * this.anIntArray355[local17] >> 14;
				this.anIntArray355[local17] = local34;
			}
		}
		if (arg2 != 0) {
			local11 = Class290.anIntArray546[arg2];
			local15 = Class290.anIntArray547[arg2];
			for (local17 = 0; local17 < this.anInt5669; local17++) {
				local34 = this.anIntArray360[local17] * local15 - local11 * this.anIntArray353[local17] >> 14;
				this.anIntArray353[local17] = this.anIntArray353[local17] * local15 + local11 * this.anIntArray360[local17] >> 14;
				this.anIntArray360[local17] = local34;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local11 = Class290.anIntArray546[arg0];
		local15 = Class290.anIntArray547[arg0];
		for (local17 = 0; local17 < this.anInt5669; local17++) {
			local34 = this.anIntArray355[local17] * local15 + this.anIntArray353[local17] * local11 >> 14;
			this.anIntArray353[local17] = this.anIntArray353[local17] * local15 - this.anIntArray355[local17] * local11 >> 14;
			this.anIntArray355[local17] = local34;
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(IIII)V")
	public void method4917(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt5669; local1++) {
			this.anIntArray355[local1] += arg2;
			this.anIntArray360[local1] += arg1;
			this.anIntArray353[local1] += arg0;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I[B)V")
	private void method4918(@OriginalArg(1) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class2_Sub17 local12 = new Class2_Sub17(arg0);
		@Pc(17) Class2_Sub17 local17 = new Class2_Sub17(arg0);
		@Pc(22) Class2_Sub17 local22 = new Class2_Sub17(arg0);
		@Pc(27) Class2_Sub17 local27 = new Class2_Sub17(arg0);
		@Pc(32) Class2_Sub17 local32 = new Class2_Sub17(arg0);
		local12.anInt3378 = arg0.length - 18;
		this.anInt5669 = local12.method2825();
		this.anInt5661 = local12.method2825();
		this.anInt5663 = local12.method2859();
		@Pc(57) int local57 = local12.method2859();
		@Pc(61) int local61 = local12.method2859();
		@Pc(65) int local65 = local12.method2859();
		@Pc(69) int local69 = local12.method2859();
		@Pc(73) int local73 = local12.method2859();
		@Pc(77) int local77 = local12.method2825();
		@Pc(81) int local81 = local12.method2825();
		@Pc(85) int local85 = local12.method2825();
		@Pc(89) int local89 = local12.method2825();
		@Pc(98) int local98 = this.anInt5669;
		@Pc(108) int local108 = local98;
		local98 += this.anInt5661;
		@Pc(115) int local115 = local98;
		if (local61 == 255) {
			local98 += this.anInt5661;
		}
		@Pc(127) int local127 = local98;
		if (local69 == 1) {
			local98 += this.anInt5661;
		}
		@Pc(139) int local139 = local98;
		if (local57 == 1) {
			local98 += this.anInt5661;
		}
		@Pc(149) int local149 = local98;
		if (local73 == 1) {
			local98 += this.anInt5669;
		}
		@Pc(161) int local161 = local98;
		if (local65 == 1) {
			local98 += this.anInt5661;
		}
		@Pc(173) int local173 = local98;
		local98 += local89;
		@Pc(179) int local179 = local98;
		local98 += this.anInt5661 * 2;
		@Pc(188) int local188 = local98;
		local98 += this.anInt5663 * 6;
		@Pc(197) int local197 = local98;
		local98 += local77;
		@Pc(203) int local203 = local98;
		local98 += local81;
		this.anIntArray353 = new int[this.anInt5669];
		if (local73 == 1) {
			this.anIntArray354 = new int[this.anInt5669];
		}
		if (this.anInt5663 > 0) {
			this.aShortArray70 = new short[this.anInt5663];
			this.aByteArray49 = new byte[this.anInt5663];
			this.aShortArray67 = new short[this.anInt5663];
			this.aShortArray62 = new short[this.anInt5663];
		}
		local12.anInt3378 = 0;
		this.anIntArray355 = new int[this.anInt5669];
		this.anIntArray360 = new int[this.anInt5669];
		this.aShortArray65 = new short[this.anInt5661];
		if (local61 == 255) {
			this.aByteArray50 = new byte[this.anInt5661];
		} else {
			this.aByte79 = (byte) local61;
		}
		if (local65 == 1) {
			this.aByteArray52 = new byte[this.anInt5661];
		}
		this.aShortArray69 = new short[this.anInt5661];
		if (local69 == 1) {
			this.anIntArray362 = new int[this.anInt5661];
		}
		if (local57 == 1) {
			this.aByteArray51 = new byte[this.anInt5661];
			this.aShortArray61 = new short[this.anInt5661];
			this.aByteArray46 = new byte[this.anInt5661];
		}
		this.aShortArray63 = new short[this.anInt5661];
		this.aShortArray68 = new short[this.anInt5661];
		local17.anInt3378 = local197;
		local22.anInt3378 = local203;
		local27.anInt3378 = local98;
		local32.anInt3378 = local149;
		@Pc(350) int local350 = 0;
		@Pc(352) int local352 = 0;
		@Pc(354) int local354 = 0;
		@Pc(361) int local361;
		@Pc(363) int local363;
		for (@Pc(356) int local356 = 0; local356 < this.anInt5669; local356++) {
			local361 = local12.method2859();
			local363 = 0;
			if ((local361 & 0x1) != 0) {
				local363 = local17.method2823();
			}
			@Pc(373) int local373 = 0;
			if ((local361 & 0x2) != 0) {
				local373 = local22.method2823();
			}
			@Pc(383) int local383 = 0;
			if ((local361 & 0x4) != 0) {
				local383 = local27.method2823();
			}
			this.anIntArray355[local356] = local363 + local350;
			this.anIntArray360[local356] = local373 + local352;
			this.anIntArray353[local356] = local354 + local383;
			local354 = this.anIntArray353[local356];
			local350 = this.anIntArray355[local356];
			local352 = this.anIntArray360[local356];
			if (local73 == 1) {
				this.anIntArray354[local356] = local32.method2859();
			}
		}
		local12.anInt3378 = local179;
		local17.anInt3378 = local139;
		local22.anInt3378 = local115;
		local27.anInt3378 = local161;
		local32.anInt3378 = local127;
		for (local361 = 0; local361 < this.anInt5661; local361++) {
			this.aShortArray68[local361] = (short) local12.method2825();
			if (local57 == 1) {
				local363 = local17.method2859();
				if ((local363 & 0x1) == 1) {
					this.aByteArray46[local361] = 1;
					local5 = true;
				} else {
					this.aByteArray46[local361] = 0;
				}
				if ((local363 & 0x2) == 2) {
					this.aByteArray51[local361] = (byte) (local363 >> 2);
					this.aShortArray61[local361] = this.aShortArray68[local361];
					this.aShortArray68[local361] = 127;
					if (this.aShortArray61[local361] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray51[local361] = -1;
					this.aShortArray61[local361] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray50[local361] = local22.method2860();
			}
			if (local65 == 1) {
				this.aByteArray52[local361] = local27.method2860();
			}
			if (local69 == 1) {
				this.anIntArray362[local361] = local32.method2859();
			}
		}
		this.anInt5665 = -1;
		local12.anInt3378 = local173;
		local17.anInt3378 = local108;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(611) int local611;
		for (@Pc(606) int local606 = 0; local606 < this.anInt5661; local606++) {
			local611 = local17.method2859();
			if (local611 == 1) {
				local598 = (short) (local12.method2823() + local604);
				local600 = (short) (local12.method2823() + local598);
				local602 = (short) (local12.method2823() + local600);
				local604 = local602;
				this.aShortArray63[local606] = local598;
				this.aShortArray69[local606] = local600;
				this.aShortArray65[local606] = local602;
				if (this.anInt5665 < local598) {
					this.anInt5665 = local598;
				}
				if (this.anInt5665 < local600) {
					this.anInt5665 = local600;
				}
				if (this.anInt5665 < local602) {
					this.anInt5665 = local602;
				}
			}
			if (local611 == 2) {
				local600 = local602;
				local602 = (short) (local604 + local12.method2823());
				this.aShortArray63[local606] = local598;
				local604 = local602;
				this.aShortArray69[local606] = local600;
				this.aShortArray65[local606] = local602;
				if (this.anInt5665 < local602) {
					this.anInt5665 = local602;
				}
			}
			if (local611 == 3) {
				local598 = local602;
				local602 = (short) (local604 + local12.method2823());
				this.aShortArray63[local606] = local598;
				local604 = local602;
				this.aShortArray69[local606] = local600;
				this.aShortArray65[local606] = local602;
				if (this.anInt5665 < local602) {
					this.anInt5665 = local602;
				}
			}
			if (local611 == 4) {
				@Pc(772) short local772 = local598;
				local598 = local600;
				local600 = local772;
				local602 = (short) (local604 + local12.method2823());
				this.aShortArray63[local606] = local598;
				local604 = local602;
				this.aShortArray69[local606] = local772;
				this.aShortArray65[local606] = local602;
				if (local602 > this.anInt5665) {
					this.anInt5665 = local602;
				}
			}
		}
		local12.anInt3378 = local188;
		this.anInt5665++;
		for (local611 = 0; local611 < this.anInt5663; local611++) {
			this.aByteArray49[local611] = 0;
			this.aShortArray70[local611] = (short) local12.method2825();
			this.aShortArray62[local611] = (short) local12.method2825();
			this.aShortArray67[local611] = (short) local12.method2825();
		}
		if (this.aByteArray51 != null) {
			@Pc(871) boolean local871 = false;
			for (@Pc(873) int local873 = 0; local873 < this.anInt5661; local873++) {
				@Pc(881) int local881 = this.aByteArray51[local873] & 0xFF;
				if (local881 != 255) {
					if (this.aShortArray63[local873] == (this.aShortArray70[local881] & 0xFFFF) && this.aShortArray69[local873] == (this.aShortArray62[local881] & 0xFFFF) && this.aShortArray65[local873] == (this.aShortArray67[local881] & 0xFFFF)) {
						this.aByteArray51[local873] = -1;
					} else {
						local871 = true;
					}
				}
			}
			if (!local871) {
				this.aByteArray51 = null;
			}
		}
		if (!local7) {
			this.aShortArray61 = null;
		}
		if (!local5) {
			this.aByteArray46 = null;
		}
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)[[I")
	public int[][] method4919() {
		@Pc(18) int[] local18 = new int[256];
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anInt5661; local22++) {
			@Pc(29) int local29 = this.anIntArray362[local22];
			if (local29 >= 0) {
				@Pc(35) int local35 = local18[local29]++;
				if (local20 < local29) {
					local20 = local29;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local20 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local20; local59++) {
			local57[local59] = new int[local18[local59]];
			local18[local59] = 0;
		}
		for (@Pc(82) int local82 = 0; local82 < this.anInt5661; local82++) {
			@Pc(89) int local89 = this.anIntArray362[local82];
			if (local89 >= 0) {
				local57[local89][local18[local89]++] = local82;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(II)V")
	public void method4920() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt5669; local5++) {
			this.anIntArray355[local5] <<= 0x2;
			this.anIntArray360[local5] <<= 0x2;
			this.anIntArray353[local5] <<= 0x2;
		}
		if (this.anInt5663 <= 0 || this.anIntArray359 == null) {
			return;
		}
		for (@Pc(66) int local66 = 0; local66 < this.anIntArray359.length; local66++) {
			this.anIntArray359[local66] <<= 0x2;
			this.anIntArray363[local66] <<= 0x2;
			if (this.aByteArray49[local66] != 1) {
				this.anIntArray356[local66] <<= 0x2;
			}
		}
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(I[B)V")
	private void method4921(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub17 local8 = new Class2_Sub17(arg0);
		@Pc(13) Class2_Sub17 local13 = new Class2_Sub17(arg0);
		@Pc(18) Class2_Sub17 local18 = new Class2_Sub17(arg0);
		@Pc(23) Class2_Sub17 local23 = new Class2_Sub17(arg0);
		@Pc(28) Class2_Sub17 local28 = new Class2_Sub17(arg0);
		@Pc(33) Class2_Sub17 local33 = new Class2_Sub17(arg0);
		@Pc(38) Class2_Sub17 local38 = new Class2_Sub17(arg0);
		local8.anInt3378 = arg0.length - 23;
		this.anInt5669 = local8.method2825();
		this.anInt5661 = local8.method2825();
		this.anInt5663 = local8.method2859();
		@Pc(63) int local63 = local8.method2859();
		@Pc(74) boolean local74 = (local63 & 0x1) == 1;
		@Pc(83) boolean local83 = (local63 & 0x2) == 2;
		@Pc(92) boolean local92 = (local63 & 0x4) == 4;
		@Pc(103) boolean local103 = (local63 & 0x8) == 8;
		if (local103) {
			local8.anInt3378 -= 7;
			this.anInt5662 = local8.method2859();
			local8.anInt3378 += 6;
		}
		@Pc(126) int local126 = local8.method2859();
		@Pc(130) int local130 = local8.method2859();
		@Pc(134) int local134 = local8.method2859();
		@Pc(138) int local138 = local8.method2859();
		@Pc(142) int local142 = local8.method2859();
		@Pc(146) int local146 = local8.method2825();
		@Pc(150) int local150 = local8.method2825();
		@Pc(154) int local154 = local8.method2825();
		@Pc(158) int local158 = local8.method2825();
		@Pc(162) int local162 = local8.method2825();
		@Pc(164) int local164 = 0;
		@Pc(166) int local166 = 0;
		@Pc(168) int local168 = 0;
		@Pc(181) int local181;
		if (this.anInt5663 > 0) {
			local8.anInt3378 = 0;
			this.aByteArray49 = new byte[this.anInt5663];
			for (local181 = 0; local181 < this.anInt5663; local181++) {
				@Pc(191) byte local191 = this.aByteArray49[local181] = local8.method2860();
				if (local191 >= 1 && local191 <= 3) {
					local166++;
				}
				if (local191 == 0) {
					local164++;
				}
				if (local191 == 2) {
					local168++;
				}
			}
		}
		local181 = this.anInt5663;
		@Pc(221) int local221 = local181;
		local181 += this.anInt5669;
		@Pc(228) int local228 = local181;
		if (local74) {
			local181 += this.anInt5661;
		}
		@Pc(237) int local237 = local181;
		local181 += this.anInt5661;
		@Pc(244) int local244 = local181;
		if (local126 == 255) {
			local181 += this.anInt5661;
		}
		@Pc(256) int local256 = local181;
		if (local134 == 1) {
			local181 += this.anInt5661;
		}
		@Pc(266) int local266 = local181;
		if (local142 == 1) {
			local181 += this.anInt5669;
		}
		@Pc(278) int local278 = local181;
		if (local130 == 1) {
			local181 += this.anInt5661;
		}
		@Pc(290) int local290 = local181;
		local181 += local158;
		@Pc(296) int local296 = local181;
		if (local138 == 1) {
			local181 += this.anInt5661 * 2;
		}
		@Pc(310) int local310 = local181;
		local181 += local162;
		@Pc(316) int local316 = local181;
		local181 += this.anInt5661 * 2;
		@Pc(325) int local325 = local181;
		local181 += local146;
		@Pc(331) int local331 = local181;
		local181 += local150;
		@Pc(337) int local337 = local181;
		local181 += local154;
		@Pc(343) int local343 = local181;
		local181 += local164 * 6;
		@Pc(351) int local351 = local181;
		local181 += local166 * 6;
		@Pc(359) byte local359 = 6;
		if (this.anInt5662 == 14) {
			local359 = 7;
		} else if (this.anInt5662 >= 15) {
			local359 = 9;
		}
		@Pc(376) int local376 = local181;
		local181 += local359 * local166;
		@Pc(384) int local384 = local181;
		local181 += local166;
		@Pc(390) int local390 = local181;
		local181 += local166;
		@Pc(396) int local396 = local181;
		local181 += local168 * 2 + local166;
		this.anIntArray353 = new int[this.anInt5669];
		if (local126 == 255) {
			this.aByteArray50 = new byte[this.anInt5661];
		} else {
			this.aByte79 = (byte) local126;
		}
		if (local138 == 1 && this.anInt5663 > 0) {
			this.aByteArray51 = new byte[this.anInt5661];
		}
		if (local130 == 1) {
			this.aByteArray52 = new byte[this.anInt5661];
		}
		this.aShortArray68 = new short[this.anInt5661];
		if (local74) {
			this.aByteArray46 = new byte[this.anInt5661];
		}
		this.aShortArray69 = new short[this.anInt5661];
		this.aShortArray63 = new short[this.anInt5661];
		if (local134 == 1) {
			this.anIntArray362 = new int[this.anInt5661];
		}
		this.anIntArray355 = new int[this.anInt5669];
		if (local138 == 1) {
			this.aShortArray61 = new short[this.anInt5661];
		}
		if (local142 == 1) {
			this.anIntArray354 = new int[this.anInt5669];
		}
		this.anIntArray360 = new int[this.anInt5669];
		if (this.anInt5663 > 0) {
			this.aShortArray70 = new short[this.anInt5663];
			this.aShortArray67 = new short[this.anInt5663];
			if (local168 > 0) {
				this.anIntArray357 = new int[local168];
				this.anIntArray361 = new int[local168];
			}
			this.aShortArray62 = new short[this.anInt5663];
			if (local166 > 0) {
				this.anIntArray356 = new int[local166];
				this.aByteArray47 = new byte[local166];
				this.anIntArray359 = new int[local166];
				this.aByteArray48 = new byte[local166];
				this.anIntArray363 = new int[local166];
				this.anIntArray358 = new int[local166];
			}
		}
		local8.anInt3378 = local221;
		this.aShortArray65 = new short[this.anInt5661];
		local13.anInt3378 = local325;
		local18.anInt3378 = local331;
		local23.anInt3378 = local337;
		local28.anInt3378 = local266;
		@Pc(588) int local588 = 0;
		@Pc(590) int local590 = 0;
		@Pc(592) int local592 = 0;
		@Pc(599) int local599;
		for (@Pc(594) int local594 = 0; local594 < this.anInt5669; local594++) {
			local599 = local8.method2859();
			@Pc(601) int local601 = 0;
			if ((local599 & 0x1) != 0) {
				local601 = local13.method2823();
			}
			@Pc(611) int local611 = 0;
			if ((local599 & 0x2) != 0) {
				local611 = local18.method2823();
			}
			@Pc(624) int local624 = 0;
			if ((local599 & 0x4) != 0) {
				local624 = local23.method2823();
			}
			this.anIntArray355[local594] = local601 + local588;
			this.anIntArray360[local594] = local611 + local590;
			this.anIntArray353[local594] = local592 + local624;
			local588 = this.anIntArray355[local594];
			local590 = this.anIntArray360[local594];
			local592 = this.anIntArray353[local594];
			if (local142 == 1) {
				this.anIntArray354[local594] = local28.method2859();
			}
		}
		local8.anInt3378 = local316;
		local13.anInt3378 = local228;
		local18.anInt3378 = local244;
		local23.anInt3378 = local278;
		local28.anInt3378 = local256;
		local33.anInt3378 = local296;
		local38.anInt3378 = local310;
		for (local599 = 0; local599 < this.anInt5661; local599++) {
			this.aShortArray68[local599] = (short) local8.method2825();
			if (local74) {
				this.aByteArray46[local599] = local13.method2860();
			}
			if (local126 == 255) {
				this.aByteArray50[local599] = local18.method2860();
			}
			if (local130 == 1) {
				this.aByteArray52[local599] = local23.method2860();
			}
			if (local134 == 1) {
				this.anIntArray362[local599] = local28.method2859();
			}
			if (local138 == 1) {
				this.aShortArray61[local599] = (short) (local33.method2825() - 1);
			}
			if (this.aByteArray51 != null) {
				if (this.aShortArray61[local599] == -1) {
					this.aByteArray51[local599] = -1;
				} else {
					this.aByteArray51[local599] = (byte) (local38.method2859() - 1);
				}
			}
		}
		local8.anInt3378 = local290;
		this.anInt5665 = -1;
		local13.anInt3378 = local237;
		@Pc(825) short local825 = 0;
		@Pc(835) short local835 = 0;
		@Pc(837) short local837 = 0;
		@Pc(839) short local839 = 0;
		@Pc(846) int local846;
		for (@Pc(841) int local841 = 0; local841 < this.anInt5661; local841++) {
			local846 = local13.method2859();
			if (local846 == 1) {
				local825 = (short) (local839 + local8.method2823());
				local835 = (short) (local825 + local8.method2823());
				local837 = (short) (local8.method2823() + local835);
				this.aShortArray63[local841] = local825;
				local839 = local837;
				this.aShortArray69[local841] = local835;
				this.aShortArray65[local841] = local837;
				if (local825 > this.anInt5665) {
					this.anInt5665 = local825;
				}
				if (this.anInt5665 < local835) {
					this.anInt5665 = local835;
				}
				if (this.anInt5665 < local837) {
					this.anInt5665 = local837;
				}
			}
			if (local846 == 2) {
				local835 = local837;
				local837 = (short) (local839 + local8.method2823());
				this.aShortArray63[local841] = local825;
				local839 = local837;
				this.aShortArray69[local841] = local835;
				this.aShortArray65[local841] = local837;
				if (this.anInt5665 < local837) {
					this.anInt5665 = local837;
				}
			}
			if (local846 == 3) {
				local825 = local837;
				local837 = (short) (local8.method2823() + local839);
				this.aShortArray63[local841] = local825;
				local839 = local837;
				this.aShortArray69[local841] = local835;
				this.aShortArray65[local841] = local837;
				if (this.anInt5665 < local837) {
					this.anInt5665 = local837;
				}
			}
			if (local846 == 4) {
				@Pc(1003) short local1003 = local825;
				local825 = local835;
				local837 = (short) (local8.method2823() + local839);
				local835 = local1003;
				local839 = local837;
				this.aShortArray63[local841] = local825;
				this.aShortArray69[local841] = local1003;
				this.aShortArray65[local841] = local837;
				if (this.anInt5665 < local837) {
					this.anInt5665 = local837;
				}
			}
		}
		local8.anInt3378 = local343;
		this.anInt5665++;
		local13.anInt3378 = local351;
		local18.anInt3378 = local376;
		local23.anInt3378 = local384;
		local28.anInt3378 = local390;
		local33.anInt3378 = local396;
		@Pc(1081) int local1081;
		for (local846 = 0; local846 < this.anInt5663; local846++) {
			local1081 = this.aByteArray49[local846] & 0xFF;
			if (local1081 == 0) {
				this.aShortArray70[local846] = (short) local8.method2825();
				this.aShortArray62[local846] = (short) local8.method2825();
				this.aShortArray67[local846] = (short) local8.method2825();
			}
			if (local1081 == 1) {
				this.aShortArray70[local846] = (short) local13.method2825();
				this.aShortArray62[local846] = (short) local13.method2825();
				this.aShortArray67[local846] = (short) local13.method2825();
				if (this.anInt5662 < 15) {
					this.anIntArray359[local846] = local18.method2825();
					if (this.anInt5662 < 14) {
						this.anIntArray363[local846] = local18.method2825();
					} else {
						this.anIntArray363[local846] = local18.method2835();
					}
					this.anIntArray356[local846] = local18.method2825();
				} else {
					this.anIntArray359[local846] = local18.method2835();
					this.anIntArray363[local846] = local18.method2835();
					this.anIntArray356[local846] = local18.method2835();
				}
				this.aByteArray47[local846] = local23.method2860();
				this.aByteArray48[local846] = local28.method2860();
				this.anIntArray358[local846] = local33.method2860();
			}
			if (local1081 == 2) {
				this.aShortArray70[local846] = (short) local13.method2825();
				this.aShortArray62[local846] = (short) local13.method2825();
				this.aShortArray67[local846] = (short) local13.method2825();
				if (this.anInt5662 >= 15) {
					this.anIntArray359[local846] = local18.method2835();
					this.anIntArray363[local846] = local18.method2835();
					this.anIntArray356[local846] = local18.method2835();
				} else {
					this.anIntArray359[local846] = local18.method2825();
					if (this.anInt5662 >= 14) {
						this.anIntArray363[local846] = local18.method2835();
					} else {
						this.anIntArray363[local846] = local18.method2825();
					}
					this.anIntArray356[local846] = local18.method2825();
				}
				this.aByteArray47[local846] = local23.method2860();
				this.aByteArray48[local846] = local28.method2860();
				this.anIntArray358[local846] = local33.method2860();
				this.anIntArray361[local846] = local33.method2860();
				this.anIntArray357[local846] = local33.method2860();
			}
			if (local1081 == 3) {
				this.aShortArray70[local846] = (short) local13.method2825();
				this.aShortArray62[local846] = (short) local13.method2825();
				this.aShortArray67[local846] = (short) local13.method2825();
				if (this.anInt5662 >= 15) {
					this.anIntArray359[local846] = local18.method2835();
					this.anIntArray363[local846] = local18.method2835();
					this.anIntArray356[local846] = local18.method2835();
				} else {
					this.anIntArray359[local846] = local18.method2825();
					if (this.anInt5662 < 14) {
						this.anIntArray363[local846] = local18.method2825();
					} else {
						this.anIntArray363[local846] = local18.method2835();
					}
					this.anIntArray356[local846] = local18.method2825();
				}
				this.aByteArray47[local846] = local23.method2860();
				this.aByteArray48[local846] = local28.method2860();
				this.anIntArray358[local846] = local33.method2860();
			}
		}
		local8.anInt3378 = local181;
		@Pc(1481) int local1481;
		@Pc(1486) int local1486;
		@Pc(1490) int local1490;
		@Pc(1552) int local1552;
		if (local83) {
			local1081 = local8.method2859();
			if (local1081 > 0) {
				this.aClass287Array2 = new Class287[local1081];
				for (local1481 = 0; local1481 < local1081; local1481++) {
					local1486 = local8.method2825();
					local1490 = local8.method2825();
					@Pc(1496) byte local1496;
					if (local126 == 255) {
						local1496 = this.aByteArray50[local1490];
					} else {
						local1496 = (byte) local126;
					}
					this.aClass287Array2[local1481] = new Class287(local1486, this.aShortArray63[local1490], this.aShortArray69[local1490], this.aShortArray65[local1490], local1496);
				}
			}
			local1481 = local8.method2859();
			if (local1481 > 0) {
				this.aClass156Array2 = new Class156[local1481];
				for (local1486 = 0; local1486 < local1481; local1486++) {
					local1490 = local8.method2825();
					local1552 = local8.method2825();
					this.aClass156Array2[local1486] = new Class156(local1490, local1552);
				}
			}
		}
		if (!local92) {
			return;
		}
		local1081 = local8.method2859();
		if (local1081 <= 0) {
			return;
		}
		this.aClass149Array1 = new Class149[local1081];
		for (local1481 = 0; local1481 < local1081; local1481++) {
			local1486 = local8.method2825();
			local1490 = local8.method2825();
			local1552 = local8.method2859();
			@Pc(1600) byte local1600 = local8.method2860();
			this.aClass149Array1[local1481] = new Class149(local1486, local1490, local1552, local1600);
		}
		return;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(SZBSSBSSSB)B")
	public byte method4922() {
		if (this.anInt5663 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray49[this.anInt5663] = 3;
		this.aShortArray70[this.anInt5663] = 0;
		this.aShortArray62[this.anInt5663] = 32767;
		this.aShortArray67[this.anInt5663] = 0;
		this.anIntArray359[this.anInt5663] = 1024;
		this.anIntArray363[this.anInt5663] = 1024;
		this.anIntArray356[this.anInt5663] = 1024;
		this.aByteArray47[this.anInt5663] = 0;
		this.aByteArray48[this.anInt5663] = 0;
		this.anIntArray358[this.anInt5663] = 0;
		return (byte) this.anInt5663++;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!lga;SBI)I")
	private int method4923(@OriginalArg(0) Class212 arg0, @OriginalArg(1) short arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg0.anIntArray355[arg2];
		@Pc(13) int local13 = arg0.anIntArray360[arg2];
		@Pc(18) int local18 = arg0.anIntArray353[arg2];
		for (@Pc(20) int local20 = 0; local20 < this.anInt5669; local20++) {
			if (this.anIntArray355[local20] == local8 && local13 == this.anIntArray360[local20] && local18 == this.anIntArray353[local20]) {
				this.aShortArray64[local20] |= arg1;
				return local20;
			}
		}
		this.anIntArray355[this.anInt5669] = local8;
		this.anIntArray360[this.anInt5669] = local13;
		this.anIntArray353[this.anInt5669] = local18;
		this.aShortArray64[this.anInt5669] = arg1;
		this.anIntArray354[this.anInt5669] = arg0.anIntArray354 == null ? -1 : arg0.anIntArray354[arg2];
		return this.anInt5669++;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)[[I")
	public int[][] method4924() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass149Array1.length; local12++) {
			@Pc(26) int local26 = this.aClass149Array1[local12].anInt4077;
			if (local26 >= 0) {
				@Pc(35) int local35 = local8[local26]++;
				if (local26 > local10) {
					local10 = local26;
				}
			}
		}
		@Pc(62) int[][] local62 = new int[local10 + 1][];
		for (@Pc(64) int local64 = 0; local64 <= local10; local64++) {
			local62[local64] = new int[local8[local64]];
			local8[local64] = 0;
		}
		for (@Pc(87) int local87 = 0; local87 < this.aClass149Array1.length; local87++) {
			@Pc(95) int local95 = this.aClass149Array1[local87].anInt4077;
			if (local95 >= 0) {
				local62[local95][local8[local95]++] = local87;
			}
		}
		return local62;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(SIBBIIBIS)I")
	public int method4925(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) short arg7) {
		this.aShortArray63[this.anInt5661] = (short) arg4;
		this.aShortArray69[this.anInt5661] = (short) arg5;
		this.aShortArray65[this.anInt5661] = (short) arg1;
		this.aByteArray46[this.anInt5661] = arg6;
		this.aByteArray51[this.anInt5661] = arg2;
		this.aShortArray68[this.anInt5661] = arg7;
		this.aByteArray52[this.anInt5661] = arg3;
		this.aShortArray61[this.anInt5661] = arg0;
		return this.anInt5661++;
	}

	@OriginalMember(owner = "client!lga", name = "c", descriptor = "(IIII)I")
	public int method4926(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(17) int local17 = 0; local17 < this.anInt5669; local17++) {
			if (arg1 == this.anIntArray355[local17] && arg0 == this.anIntArray360[local17] && arg2 == this.anIntArray353[local17]) {
				return local17;
			}
		}
		this.anIntArray355[this.anInt5669] = arg1;
		this.anIntArray360[this.anInt5669] = arg0;
		this.anIntArray353[this.anInt5669] = arg2;
		this.anInt5665 = this.anInt5669 + 1;
		return this.anInt5669++;
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(ZI)[[I")
	public int[][] method4927(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt5669 : this.anInt5665;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray354[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(41) int local41 = local8[local27]++;
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < local18; local78++) {
			@Pc(85) int local85 = this.anIntArray354[local78];
			if (local85 >= 0) {
				local57[local85][local8[local85]++] = local78;
			}
		}
		return local57;
	}

	@OriginalMember(owner = "client!lga", name = "b", descriptor = "(SIS)V")
	public void method4928(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray61 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt5661; local9++) {
			if (arg1 == this.aShortArray61[local9]) {
				this.aShortArray61[local9] = arg0;
			}
		}
	}
}
