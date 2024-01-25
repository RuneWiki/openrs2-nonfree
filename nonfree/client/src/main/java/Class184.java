import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class184 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "[B")
	public byte[] aByteArray72;

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "[S")
	public short[] aShortArray73;

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "[Lclient!tf;")
	public Class280[] aClass280Array4;

	@OriginalMember(owner = "client!ld", name = "h", descriptor = "[B")
	public byte[] aByteArray73;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "[S")
	public short[] aShortArray74;

	@OriginalMember(owner = "client!ld", name = "j", descriptor = "[S")
	public short[] aShortArray75;

	@OriginalMember(owner = "client!ld", name = "m", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "[S")
	public short[] aShortArray76;

	@OriginalMember(owner = "client!ld", name = "p", descriptor = "[S")
	public short[] aShortArray77;

	@OriginalMember(owner = "client!ld", name = "r", descriptor = "[Lclient!baa;")
	public Class21[] aClass21Array1;

	@OriginalMember(owner = "client!ld", name = "s", descriptor = "[Lclient!on;")
	public Class223[] aClass223Array4;

	@OriginalMember(owner = "client!ld", name = "u", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!ld", name = "v", descriptor = "[B")
	public byte[] aByteArray74;

	@OriginalMember(owner = "client!ld", name = "w", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!ld", name = "x", descriptor = "[I")
	public int[] anIntArray381;

	@OriginalMember(owner = "client!ld", name = "y", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!ld", name = "z", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "[I")
	public int[] anIntArray383;

	@OriginalMember(owner = "client!ld", name = "B", descriptor = "[S")
	public short[] aShortArray78;

	@OriginalMember(owner = "client!ld", name = "D", descriptor = "[S")
	public short[] aShortArray79;

	@OriginalMember(owner = "client!ld", name = "E", descriptor = "[S")
	public short[] aShortArray80;

	@OriginalMember(owner = "client!ld", name = "F", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!ld", name = "G", descriptor = "[S")
	public short[] aShortArray81;

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "[S")
	public short[] aShortArray82;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "[I")
	public int[] anIntArray385;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "[I")
	public int[] anIntArray386;

	@OriginalMember(owner = "client!ld", name = "V", descriptor = "[I")
	public int[] anIntArray387;

	@OriginalMember(owner = "client!ld", name = "X", descriptor = "[I")
	public int[] anIntArray388;

	@OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
	public int anInt5398 = 0;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public int anInt5399 = 0;

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "I")
	public int anInt5403 = 0;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "B")
	public byte aByte56 = 0;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	public int anInt5408 = 0;

	@OriginalMember(owner = "client!ld", name = "Y", descriptor = "I")
	public int anInt5413 = 12;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([B)V")
	public Class184(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4521(arg0);
		} else {
			this.method4523(arg0);
		}
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(III)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray73 = new byte[arg1];
		this.anIntArray382 = new int[arg1];
		this.anIntArray378 = new int[arg0];
		if (arg2 > 0) {
			this.aShortArray82 = new short[arg2];
			this.aByteArray72 = new byte[arg2];
			this.anIntArray386 = new int[arg2];
			this.anIntArray387 = new int[arg2];
			this.aShortArray77 = new short[arg2];
			this.aByteArray74 = new byte[arg2];
			this.aShortArray76 = new short[arg2];
			this.anIntArray380 = new int[arg2];
			this.aByteArray76 = new byte[arg2];
			this.anIntArray385 = new int[arg2];
			this.anIntArray384 = new int[arg2];
			this.anIntArray383 = new int[arg2];
		}
		this.aShortArray74 = new short[arg1];
		this.anIntArray388 = new int[arg0];
		this.anIntArray381 = new int[arg0];
		this.aShortArray73 = new short[arg1];
		this.aByteArray78 = new byte[arg1];
		this.aShortArray75 = new short[arg1];
		this.aByteArray75 = new byte[arg1];
		this.aByteArray77 = new byte[arg1];
		this.aShortArray78 = new short[arg1];
		this.aShortArray80 = new short[arg1];
		this.anIntArray379 = new int[arg0];
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "([Lclient!ld;I)V")
	public Class184(@OriginalArg(0) Class184[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5398 = 0;
		this.anInt5403 = 0;
		this.anInt5408 = 0;
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) boolean local38 = false;
		@Pc(40) boolean local40 = false;
		@Pc(42) boolean local42 = false;
		@Pc(44) boolean local44 = false;
		@Pc(46) boolean local46 = false;
		this.aByte56 = -1;
		@Pc(51) boolean local51 = false;
		for (@Pc(53) int local53 = 0; local53 < arg1; local53++) {
			@Pc(59) Class184 local59 = arg0[local53];
			if (local59 != null) {
				this.anInt5408 += local59.anInt5408;
				this.anInt5403 += local59.anInt5403;
				this.anInt5398 += local59.anInt5398;
				local38 |= local59.aByteArray77 != null;
				if (local59.aClass223Array4 != null) {
					local32 += local59.aClass223Array4.length;
				}
				if (local59.aClass280Array4 != null) {
					local34 += local59.aClass280Array4.length;
				}
				if (local59.aClass21Array1 != null) {
					local36 += local59.aClass21Array1.length;
				}
				local51 |= local59.anIntArray382 != null;
				if (local59.aByteArray73 == null) {
					if (this.aByte56 == -1) {
						this.aByte56 = local59.aByte56;
					}
					if (local59.aByte56 != this.aByte56) {
						local40 = true;
					}
				} else {
					local40 = true;
				}
				local42 |= local59.aByteArray78 != null;
				local44 |= local59.aByteArray75 != null;
				local46 |= local59.aShortArray80 != null;
			}
		}
		this.aShortArray74 = new short[this.anInt5403];
		this.aShortArray79 = new short[this.anInt5398];
		if (local44) {
			this.aByteArray75 = new byte[this.anInt5403];
		}
		this.aShortArray73 = new short[this.anInt5403];
		this.anIntArray388 = new int[this.anInt5398];
		if (local42) {
			this.aByteArray78 = new byte[this.anInt5403];
		}
		this.anIntArray378 = new int[this.anInt5398];
		if (this.anInt5408 > 0) {
			this.aByteArray72 = new byte[this.anInt5408];
			this.aShortArray82 = new short[this.anInt5408];
			this.anIntArray380 = new int[this.anInt5408];
			this.anIntArray383 = new int[this.anInt5408];
			this.anIntArray385 = new int[this.anInt5408];
			this.aShortArray76 = new short[this.anInt5408];
			this.aByteArray74 = new byte[this.anInt5408];
			this.anIntArray384 = new int[this.anInt5408];
			this.anIntArray387 = new int[this.anInt5408];
			this.anIntArray386 = new int[this.anInt5408];
			this.aShortArray77 = new short[this.anInt5408];
			this.aByteArray76 = new byte[this.anInt5408];
		}
		if (local40) {
			this.aByteArray73 = new byte[this.anInt5403];
		}
		this.anIntArray379 = new int[this.anInt5398];
		this.aShortArray75 = new short[this.anInt5403];
		if (local32 > 0) {
			this.aClass223Array4 = new Class223[local32];
		}
		if (local38) {
			this.aByteArray77 = new byte[this.anInt5403];
		}
		if (local46) {
			this.aShortArray80 = new short[this.anInt5403];
		}
		this.aShortArray81 = new short[this.anInt5403];
		if (local51) {
			this.anIntArray382 = new int[this.anInt5403];
		}
		if (local34 > 0) {
			this.aClass280Array4 = new Class280[local34];
		}
		if (local36 > 0) {
			this.aClass21Array1 = new Class21[local36];
		}
		this.aShortArray78 = new short[this.anInt5403];
		this.anIntArray381 = new int[this.anInt5398];
		local32 = 0;
		this.anInt5398 = 0;
		this.anInt5403 = 0;
		local34 = 0;
		this.anInt5408 = 0;
		local36 = 0;
		@Pc(628) int local628;
		@Pc(639) int local639;
		for (@Pc(391) int local391 = 0; local391 < arg1; local391++) {
			@Pc(398) short local398 = (short) (0x1 << local391);
			@Pc(402) Class184 local402 = arg0[local391];
			if (local402 != null) {
				@Pc(409) int local409;
				if (local402.aClass21Array1 != null) {
					for (local409 = 0; local409 < local402.aClass21Array1.length; local409++) {
						@Pc(416) Class21 local416 = local402.aClass21Array1[local409];
						this.aClass21Array1[local36++] = local416.method670(local416.anInt536 + this.anInt5403);
					}
				}
				for (local409 = 0; local409 < local402.anInt5403; local409++) {
					if (local38 && local402.aByteArray77 != null) {
						this.aByteArray77[this.anInt5403] = local402.aByteArray77[local409];
					}
					if (local40) {
						if (local402.aByteArray73 == null) {
							this.aByteArray73[this.anInt5403] = local402.aByte56;
						} else {
							this.aByteArray73[this.anInt5403] = local402.aByteArray73[local409];
						}
					}
					if (local42 && local402.aByteArray78 != null) {
						this.aByteArray78[this.anInt5403] = local402.aByteArray78[local409];
					}
					if (local46) {
						if (local402.aShortArray80 == null) {
							this.aShortArray80[this.anInt5403] = -1;
						} else {
							this.aShortArray80[this.anInt5403] = local402.aShortArray80[local409];
						}
					}
					if (local51) {
						if (local402.anIntArray382 == null) {
							this.anIntArray382[this.anInt5403] = -1;
						} else {
							this.anIntArray382[this.anInt5403] = local402.anIntArray382[local409];
						}
					}
					this.aShortArray78[this.anInt5403] = (short) this.method4526(local398, local402, local402.aShortArray78[local409]);
					this.aShortArray74[this.anInt5403] = (short) this.method4526(local398, local402, local402.aShortArray74[local409]);
					this.aShortArray75[this.anInt5403] = (short) this.method4526(local398, local402, local402.aShortArray75[local409]);
					this.aShortArray81[this.anInt5403] = local398;
					this.aShortArray73[this.anInt5403] = local402.aShortArray73[local409];
					this.anInt5403++;
				}
				@Pc(615) int local615;
				if (local402.aClass223Array4 != null) {
					for (local615 = 0; local615 < local402.aClass223Array4.length; local615++) {
						local628 = this.method4526(local398, local402, local402.aClass223Array4[local615].anInt6756);
						local639 = this.method4526(local398, local402, local402.aClass223Array4[local615].anInt6752);
						@Pc(650) int local650 = this.method4526(local398, local402, local402.aClass223Array4[local615].anInt6765);
						this.aClass223Array4[local32] = local402.aClass223Array4[local615].method5531(local650, local639, local628);
						local32++;
					}
				}
				if (local402.aClass280Array4 != null) {
					for (local615 = 0; local615 < local402.aClass280Array4.length; local615++) {
						local628 = this.method4526(local398, local402, local402.aClass280Array4[local615].anInt8077);
						this.aClass280Array4[local34] = local402.aClass280Array4[local615].method6572(local628);
						local34++;
					}
				}
			}
		}
		@Pc(720) int local720 = 0;
		this.anInt5399 = this.anInt5398;
		for (@Pc(726) int local726 = 0; local726 < arg1; local726++) {
			@Pc(733) short local733 = (short) (0x1 << local726);
			@Pc(737) Class184 local737 = arg0[local726];
			if (local737 != null) {
				for (local628 = 0; local628 < local737.anInt5403; local628++) {
					if (local44) {
						this.aByteArray75[local720++] = (byte) (local737.aByteArray75 == null || local737.aByteArray75[local628] == -1 ? -1 : this.anInt5408 + local737.aByteArray75[local628]);
					}
				}
				for (local639 = 0; local639 < local737.anInt5408; local639++) {
					@Pc(793) byte local793 = this.aByteArray72[this.anInt5408] = local737.aByteArray72[local639];
					if (local793 == 0) {
						this.aShortArray77[this.anInt5408] = (short) this.method4526(local733, local737, local737.aShortArray77[local639]);
						this.aShortArray76[this.anInt5408] = (short) this.method4526(local733, local737, local737.aShortArray76[local639]);
						this.aShortArray82[this.anInt5408] = (short) this.method4526(local733, local737, local737.aShortArray82[local639]);
					}
					if (local793 >= 1 && local793 <= 3) {
						this.aShortArray77[this.anInt5408] = local737.aShortArray77[local639];
						this.aShortArray76[this.anInt5408] = local737.aShortArray76[local639];
						this.aShortArray82[this.anInt5408] = local737.aShortArray82[local639];
						this.anIntArray384[this.anInt5408] = local737.anIntArray384[local639];
						this.anIntArray380[this.anInt5408] = local737.anIntArray380[local639];
						this.anIntArray387[this.anInt5408] = local737.anIntArray387[local639];
						this.aByteArray74[this.anInt5408] = local737.aByteArray74[local639];
						this.aByteArray76[this.anInt5408] = local737.aByteArray76[local639];
						this.anIntArray386[this.anInt5408] = local737.anIntArray386[local639];
					}
					if (local793 == 2) {
						this.anIntArray385[this.anInt5408] = local737.anIntArray385[local639];
						this.anIntArray383[this.anInt5408] = local737.anIntArray383[local639];
					}
					this.anInt5408++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(SSB)V")
	public void method4517(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray80 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt5403; local11++) {
			if (arg0 == this.aShortArray80[local11]) {
				this.aShortArray80[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	public void method4518() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt5398; local15++) {
			this.anIntArray381[local15] <<= 0x0;
			this.anIntArray379[local15] <<= 0x0;
			this.anIntArray388[local15] <<= 0x0;
		}
		if (this.anInt5408 <= 0 || this.anIntArray384 == null) {
			return;
		}
		for (@Pc(58) int local58 = 0; local58 < this.anIntArray384.length; local58++) {
			this.anIntArray384[local58] <<= 0x0;
			this.anIntArray380[local58] <<= 0x0;
			if (this.aByteArray72[local58] != 1) {
				this.anIntArray387[local58] <<= 0x0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIBI)I")
	public int method4520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5398; local7++) {
			if (arg1 == this.anIntArray381[local7] && arg2 == this.anIntArray379[local7] && this.anIntArray388[local7] == arg0) {
				return local7;
			}
		}
		this.anIntArray381[this.anInt5398] = arg1;
		this.anIntArray379[this.anInt5398] = arg2;
		this.anIntArray388[this.anInt5398] = arg0;
		this.anInt5399 = this.anInt5398 + 1;
		return this.anInt5398++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)V")
	private void method4521(@OriginalArg(1) byte[] arg0) {
		@Pc(10) Class5_Sub3 local10 = new Class5_Sub3(arg0);
		@Pc(15) Class5_Sub3 local15 = new Class5_Sub3(arg0);
		@Pc(20) Class5_Sub3 local20 = new Class5_Sub3(arg0);
		@Pc(25) Class5_Sub3 local25 = new Class5_Sub3(arg0);
		@Pc(30) Class5_Sub3 local30 = new Class5_Sub3(arg0);
		@Pc(35) Class5_Sub3 local35 = new Class5_Sub3(arg0);
		@Pc(40) Class5_Sub3 local40 = new Class5_Sub3(arg0);
		local10.anInt4960 = arg0.length - 23;
		this.anInt5398 = local10.method4227();
		this.anInt5403 = local10.method4227();
		this.anInt5408 = local10.method4220();
		@Pc(71) int local71 = local10.method4220();
		@Pc(80) boolean local80 = (local71 & 0x1) == 1;
		@Pc(91) boolean local91 = (local71 & 0x2) == 2;
		@Pc(102) boolean local102 = (local71 & 0x4) == 4;
		@Pc(113) boolean local113 = (local71 & 0x8) == 8;
		if (local113) {
			local10.anInt4960 -= 7;
			this.anInt5413 = local10.method4220();
			local10.anInt4960 += 6;
		}
		@Pc(136) int local136 = local10.method4220();
		@Pc(140) int local140 = local10.method4220();
		@Pc(144) int local144 = local10.method4220();
		@Pc(148) int local148 = local10.method4220();
		@Pc(152) int local152 = local10.method4220();
		@Pc(156) int local156 = local10.method4227();
		@Pc(162) int local162 = local10.method4227();
		@Pc(166) int local166 = local10.method4227();
		@Pc(170) int local170 = local10.method4227();
		@Pc(176) int local176 = local10.method4227();
		@Pc(178) int local178 = 0;
		@Pc(180) int local180 = 0;
		@Pc(182) int local182 = 0;
		@Pc(195) int local195;
		if (this.anInt5408 > 0) {
			this.aByteArray72 = new byte[this.anInt5408];
			local10.anInt4960 = 0;
			for (local195 = 0; local195 < this.anInt5408; local195++) {
				@Pc(206) byte local206 = this.aByteArray72[local195] = local10.method4196();
				if (local206 == 2) {
					local182++;
				}
				if (local206 >= 1 && local206 <= 3) {
					local180++;
				}
				if (local206 == 0) {
					local178++;
				}
			}
		}
		local195 = this.anInt5408;
		@Pc(237) int local237 = local195;
		local195 += this.anInt5398;
		@Pc(244) int local244 = local195;
		if (local80) {
			local195 += this.anInt5403;
		}
		@Pc(253) int local253 = local195;
		local195 += this.anInt5403;
		@Pc(260) int local260 = local195;
		if (local136 == 255) {
			local195 += this.anInt5403;
		}
		@Pc(272) int local272 = local195;
		if (local144 == 1) {
			local195 += this.anInt5403;
		}
		@Pc(284) int local284 = local195;
		if (local152 == 1) {
			local195 += this.anInt5398;
		}
		@Pc(296) int local296 = local195;
		if (local140 == 1) {
			local195 += this.anInt5403;
		}
		@Pc(306) int local306 = local195;
		local195 += local170;
		@Pc(312) int local312 = local195;
		if (local148 == 1) {
			local195 += this.anInt5403 * 2;
		}
		@Pc(326) int local326 = local195;
		local195 += local176;
		@Pc(332) int local332 = local195;
		local195 += this.anInt5403 * 2;
		@Pc(341) int local341 = local195;
		local195 += local156;
		@Pc(347) int local347 = local195;
		local195 += local162;
		@Pc(353) int local353 = local195;
		local195 += local166;
		@Pc(359) int local359 = local195;
		local195 += local178 * 6;
		@Pc(367) int local367 = local195;
		local195 += local180 * 6;
		@Pc(381) int local381 = this.anInt5413 < 14 ? 6 : 7;
		@Pc(383) int local383 = local195;
		local195 += local381 * local180;
		@Pc(391) int local391 = local195;
		local195 += local180;
		@Pc(397) int local397 = local195;
		local195 += local180;
		@Pc(407) int local407 = local195;
		local195 += local180 + local182 * 2;
		if (local148 == 1 && this.anInt5408 > 0) {
			this.aByteArray75 = new byte[this.anInt5403];
		}
		local10.anInt4960 = local237;
		if (local80) {
			this.aByteArray77 = new byte[this.anInt5403];
		}
		if (local148 == 1) {
			this.aShortArray80 = new short[this.anInt5403];
		}
		this.anIntArray388 = new int[this.anInt5398];
		if (local152 == 1) {
			this.anIntArray378 = new int[this.anInt5398];
		}
		this.anIntArray379 = new int[this.anInt5398];
		this.aShortArray73 = new short[this.anInt5403];
		this.aShortArray78 = new short[this.anInt5403];
		this.aShortArray74 = new short[this.anInt5403];
		if (local140 == 1) {
			this.aByteArray78 = new byte[this.anInt5403];
		}
		this.anIntArray381 = new int[this.anInt5398];
		if (local144 == 1) {
			this.anIntArray382 = new int[this.anInt5403];
		}
		if (this.anInt5408 > 0) {
			if (local182 > 0) {
				this.anIntArray385 = new int[local182];
				this.anIntArray383 = new int[local182];
			}
			this.aShortArray76 = new short[this.anInt5408];
			if (local180 > 0) {
				this.anIntArray380 = new int[local180];
				this.anIntArray384 = new int[local180];
				this.aByteArray74 = new byte[local180];
				this.aByteArray76 = new byte[local180];
				this.anIntArray386 = new int[local180];
				this.anIntArray387 = new int[local180];
			}
			this.aShortArray77 = new short[this.anInt5408];
			this.aShortArray82 = new short[this.anInt5408];
		}
		if (local136 == 255) {
			this.aByteArray73 = new byte[this.anInt5403];
		} else {
			this.aByte56 = (byte) local136;
		}
		this.aShortArray75 = new short[this.anInt5403];
		local15.anInt4960 = local341;
		local20.anInt4960 = local347;
		local25.anInt4960 = local353;
		local30.anInt4960 = local284;
		@Pc(605) int local605 = 0;
		@Pc(607) int local607 = 0;
		@Pc(609) int local609 = 0;
		@Pc(617) int local617;
		for (@Pc(611) int local611 = 0; local611 < this.anInt5398; local611++) {
			local617 = local10.method4220();
			@Pc(619) int local619 = 0;
			if ((local617 & 0x1) != 0) {
				local619 = local15.method4190();
			}
			@Pc(631) int local631 = 0;
			if ((local617 & 0x2) != 0) {
				local631 = local20.method4190();
			}
			@Pc(641) int local641 = 0;
			if ((local617 & 0x4) != 0) {
				local641 = local25.method4190();
			}
			this.anIntArray381[local611] = local605 + local619;
			this.anIntArray379[local611] = local631 + local607;
			this.anIntArray388[local611] = local641 + local609;
			local609 = this.anIntArray388[local611];
			local605 = this.anIntArray381[local611];
			local607 = this.anIntArray379[local611];
			if (local152 == 1) {
				this.anIntArray378[local611] = local30.method4220();
			}
		}
		local10.anInt4960 = local332;
		local15.anInt4960 = local244;
		local20.anInt4960 = local260;
		local25.anInt4960 = local296;
		local30.anInt4960 = local272;
		local35.anInt4960 = local312;
		local40.anInt4960 = local326;
		for (local617 = 0; local617 < this.anInt5403; local617++) {
			this.aShortArray73[local617] = (short) local10.method4227();
			if (local80) {
				this.aByteArray77[local617] = local15.method4196();
			}
			if (local136 == 255) {
				this.aByteArray73[local617] = local20.method4196();
			}
			if (local140 == 1) {
				this.aByteArray78[local617] = local25.method4196();
			}
			if (local144 == 1) {
				this.anIntArray382[local617] = local30.method4220();
			}
			if (local148 == 1) {
				this.aShortArray80[local617] = (short) (local35.method4227() - 1);
			}
			if (this.aByteArray75 != null) {
				if (this.aShortArray80[local617] == -1) {
					this.aByteArray75[local617] = -1;
				} else {
					this.aByteArray75[local617] = (byte) (local40.method4220() - 1);
				}
			}
		}
		local10.anInt4960 = local306;
		this.anInt5399 = -1;
		local15.anInt4960 = local253;
		@Pc(846) short local846 = 0;
		@Pc(848) short local848 = 0;
		@Pc(850) short local850 = 0;
		@Pc(852) short local852 = 0;
		@Pc(860) int local860;
		for (@Pc(854) int local854 = 0; local854 < this.anInt5403; local854++) {
			local860 = local15.method4220();
			if (local860 == 1) {
				local846 = (short) (local852 + local10.method4190());
				local848 = (short) (local846 + local10.method4190());
				local850 = (short) (local848 + local10.method4190());
				this.aShortArray78[local854] = local846;
				local852 = local850;
				this.aShortArray74[local854] = local848;
				this.aShortArray75[local854] = local850;
				if (local846 > this.anInt5399) {
					this.anInt5399 = local846;
				}
				if (local848 > this.anInt5399) {
					this.anInt5399 = local848;
				}
				if (this.anInt5399 < local850) {
					this.anInt5399 = local850;
				}
			}
			if (local860 == 2) {
				local848 = local850;
				local850 = (short) (local852 + local10.method4190());
				local852 = local850;
				this.aShortArray78[local854] = local846;
				this.aShortArray74[local854] = local848;
				this.aShortArray75[local854] = local850;
				if (this.anInt5399 < local850) {
					this.anInt5399 = local850;
				}
			}
			if (local860 == 3) {
				local846 = local850;
				local850 = (short) (local10.method4190() + local852);
				local852 = local850;
				this.aShortArray78[local854] = local846;
				this.aShortArray74[local854] = local848;
				this.aShortArray75[local854] = local850;
				if (local850 > this.anInt5399) {
					this.anInt5399 = local850;
				}
			}
			if (local860 == 4) {
				@Pc(1029) short local1029 = local846;
				local846 = local848;
				local850 = (short) (local852 + local10.method4190());
				local848 = local1029;
				local852 = local850;
				this.aShortArray78[local854] = local846;
				this.aShortArray74[local854] = local1029;
				this.aShortArray75[local854] = local850;
				if (local850 > this.anInt5399) {
					this.anInt5399 = local850;
				}
			}
		}
		this.anInt5399++;
		local10.anInt4960 = local359;
		local15.anInt4960 = local367;
		local20.anInt4960 = local383;
		local25.anInt4960 = local391;
		local30.anInt4960 = local397;
		local35.anInt4960 = local407;
		@Pc(1108) int local1108;
		for (local860 = 0; local860 < this.anInt5408; local860++) {
			local1108 = this.aByteArray72[local860] & 0xFF;
			if (local1108 == 0) {
				this.aShortArray77[local860] = (short) local10.method4227();
				this.aShortArray76[local860] = (short) local10.method4227();
				this.aShortArray82[local860] = (short) local10.method4227();
			}
			if (local1108 == 1) {
				this.aShortArray77[local860] = (short) local15.method4227();
				this.aShortArray76[local860] = (short) local15.method4227();
				this.aShortArray82[local860] = (short) local15.method4227();
				this.anIntArray384[local860] = local20.method4227();
				if (this.anInt5413 >= 14) {
					this.anIntArray380[local860] = local20.method4182();
				} else {
					this.anIntArray380[local860] = local20.method4227();
				}
				this.anIntArray387[local860] = local20.method4227();
				this.aByteArray74[local860] = local25.method4196();
				this.aByteArray76[local860] = local30.method4196();
				this.anIntArray386[local860] = local35.method4196();
			}
			if (local1108 == 2) {
				this.aShortArray77[local860] = (short) local15.method4227();
				this.aShortArray76[local860] = (short) local15.method4227();
				this.aShortArray82[local860] = (short) local15.method4227();
				this.anIntArray384[local860] = local20.method4227();
				if (this.anInt5413 >= 14) {
					this.anIntArray380[local860] = local20.method4182();
				} else {
					this.anIntArray380[local860] = local20.method4227();
				}
				this.anIntArray387[local860] = local20.method4227();
				this.aByteArray74[local860] = local25.method4196();
				this.aByteArray76[local860] = local30.method4196();
				this.anIntArray386[local860] = local35.method4196();
				this.anIntArray385[local860] = local35.method4196();
				this.anIntArray383[local860] = local35.method4196();
			}
			if (local1108 == 3) {
				this.aShortArray77[local860] = (short) local15.method4227();
				this.aShortArray76[local860] = (short) local15.method4227();
				this.aShortArray82[local860] = (short) local15.method4227();
				this.anIntArray384[local860] = local20.method4227();
				if (this.anInt5413 >= 14) {
					this.anIntArray380[local860] = local20.method4182();
				} else {
					this.anIntArray380[local860] = local20.method4227();
				}
				this.anIntArray387[local860] = local20.method4227();
				this.aByteArray74[local860] = local25.method4196();
				this.aByteArray76[local860] = local30.method4196();
				this.anIntArray386[local860] = local35.method4196();
			}
		}
		local10.anInt4960 = local195;
		@Pc(1447) int local1447;
		@Pc(1453) int local1453;
		@Pc(1459) int local1459;
		@Pc(1523) int local1523;
		if (local91) {
			local1108 = local10.method4220();
			if (local1108 > 0) {
				this.aClass223Array4 = new Class223[local1108];
				for (local1447 = 0; local1447 < local1108; local1447++) {
					local1453 = local10.method4227();
					local1459 = local10.method4227();
					@Pc(1469) byte local1469;
					if (local136 == 255) {
						local1469 = this.aByteArray73[local1459];
					} else {
						local1469 = (byte) local136;
					}
					this.aClass223Array4[local1447] = new Class223(local1453, this.aShortArray78[local1459], this.aShortArray74[local1459], this.aShortArray75[local1459], local1469);
				}
			}
			local1447 = local10.method4220();
			if (local1447 > 0) {
				this.aClass280Array4 = new Class280[local1447];
				for (local1453 = 0; local1453 < local1447; local1453++) {
					local1459 = local10.method4227();
					local1523 = local10.method4227();
					this.aClass280Array4[local1453] = new Class280(local1459, local1523);
				}
			}
		}
		if (!local102) {
			return;
		}
		local1108 = local10.method4220();
		if (local1108 <= 0) {
			return;
		}
		this.aClass21Array1 = new Class21[local1108];
		for (local1447 = 0; local1447 < local1108; local1447++) {
			local1453 = local10.method4227();
			local1459 = local10.method4227();
			local1523 = local10.method4220();
			@Pc(1573) byte local1573 = local10.method4196();
			this.aClass21Array1[local1447] = new Class21(local1453, local1459, local1523, local1573);
		}
		return;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIII)V")
	public void method4522(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5398; local7++) {
			this.anIntArray381[local7] += arg0;
			this.anIntArray379[local7] += arg1;
			this.anIntArray388[local7] += arg2;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([BZ)V")
	private void method4523(@OriginalArg(0) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class5_Sub3 local14 = new Class5_Sub3(arg0);
		@Pc(19) Class5_Sub3 local19 = new Class5_Sub3(arg0);
		@Pc(24) Class5_Sub3 local24 = new Class5_Sub3(arg0);
		@Pc(29) Class5_Sub3 local29 = new Class5_Sub3(arg0);
		@Pc(34) Class5_Sub3 local34 = new Class5_Sub3(arg0);
		local14.anInt4960 = arg0.length - 18;
		this.anInt5398 = local14.method4227();
		this.anInt5403 = local14.method4227();
		this.anInt5408 = local14.method4220();
		@Pc(59) int local59 = local14.method4220();
		@Pc(63) int local63 = local14.method4220();
		@Pc(67) int local67 = local14.method4220();
		@Pc(71) int local71 = local14.method4220();
		@Pc(75) int local75 = local14.method4220();
		@Pc(79) int local79 = local14.method4227();
		@Pc(83) int local83 = local14.method4227();
		@Pc(87) int local87 = local14.method4227();
		@Pc(91) int local91 = local14.method4227();
		@Pc(100) int local100 = this.anInt5398;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5403;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt5403;
		}
		@Pc(119) int local119 = local100;
		if (local71 == 1) {
			local100 += this.anInt5403;
		}
		@Pc(129) int local129 = local100;
		if (local59 == 1) {
			local100 += this.anInt5403;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt5398;
		}
		@Pc(153) int local153 = local100;
		if (local67 == 1) {
			local100 += this.anInt5403;
		}
		@Pc(165) int local165 = local100;
		local100 += local91;
		@Pc(171) int local171 = local100;
		local100 += this.anInt5403 * 2;
		@Pc(180) int local180 = local100;
		local100 += this.anInt5408 * 6;
		@Pc(189) int local189 = local100;
		local100 += local79;
		@Pc(195) int local195 = local100;
		local100 += local83;
		this.anIntArray379 = new int[this.anInt5398];
		if (local71 == 1) {
			this.anIntArray382 = new int[this.anInt5403];
		}
		this.aShortArray73 = new short[this.anInt5403];
		if (local59 == 1) {
			this.aShortArray80 = new short[this.anInt5403];
			this.aByteArray75 = new byte[this.anInt5403];
			this.aByteArray77 = new byte[this.anInt5403];
		}
		local14.anInt4960 = 0;
		if (this.anInt5408 > 0) {
			this.aByteArray72 = new byte[this.anInt5408];
			this.aShortArray77 = new short[this.anInt5408];
			this.aShortArray76 = new short[this.anInt5408];
			this.aShortArray82 = new short[this.anInt5408];
		}
		if (local67 == 1) {
			this.aByteArray78 = new byte[this.anInt5403];
		}
		this.anIntArray381 = new int[this.anInt5398];
		this.aShortArray74 = new short[this.anInt5403];
		this.aShortArray78 = new short[this.anInt5403];
		this.aShortArray75 = new short[this.anInt5403];
		if (local63 == 255) {
			this.aByteArray73 = new byte[this.anInt5403];
		} else {
			this.aByte56 = (byte) local63;
		}
		if (local75 == 1) {
			this.anIntArray378 = new int[this.anInt5398];
		}
		this.anIntArray388 = new int[this.anInt5398];
		local19.anInt4960 = local189;
		local24.anInt4960 = local195;
		local29.anInt4960 = local100;
		local34.anInt4960 = local141;
		@Pc(347) int local347 = 0;
		@Pc(349) int local349 = 0;
		@Pc(351) int local351 = 0;
		@Pc(359) int local359;
		@Pc(361) int local361;
		for (@Pc(353) int local353 = 0; local353 < this.anInt5398; local353++) {
			local359 = local14.method4220();
			local361 = 0;
			if ((local359 & 0x1) != 0) {
				local361 = local19.method4190();
			}
			@Pc(371) int local371 = 0;
			if ((local359 & 0x2) != 0) {
				local371 = local24.method4190();
			}
			@Pc(384) int local384 = 0;
			if ((local359 & 0x4) != 0) {
				local384 = local29.method4190();
			}
			this.anIntArray381[local353] = local347 + local361;
			this.anIntArray379[local353] = local349 + local371;
			this.anIntArray388[local353] = local351 + local384;
			local347 = this.anIntArray381[local353];
			local351 = this.anIntArray388[local353];
			local349 = this.anIntArray379[local353];
			if (local75 == 1) {
				this.anIntArray378[local353] = local34.method4220();
			}
		}
		local14.anInt4960 = local171;
		local19.anInt4960 = local129;
		local24.anInt4960 = local109;
		local29.anInt4960 = local153;
		local34.anInt4960 = local119;
		for (local359 = 0; local359 < this.anInt5403; local359++) {
			this.aShortArray73[local359] = (short) local14.method4227();
			if (local59 == 1) {
				local361 = local19.method4220();
				if ((local361 & 0x1) == 1) {
					this.aByteArray77[local359] = 1;
					local7 = true;
				} else {
					this.aByteArray77[local359] = 0;
				}
				if ((local361 & 0x2) == 2) {
					this.aByteArray75[local359] = (byte) (local361 >> 2);
					this.aShortArray80[local359] = this.aShortArray73[local359];
					this.aShortArray73[local359] = 127;
					if (this.aShortArray80[local359] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray75[local359] = -1;
					this.aShortArray80[local359] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray73[local359] = local24.method4196();
			}
			if (local67 == 1) {
				this.aByteArray78[local359] = local29.method4196();
			}
			if (local71 == 1) {
				this.anIntArray382[local359] = local34.method4220();
			}
		}
		this.anInt5399 = -1;
		local14.anInt4960 = local165;
		local19.anInt4960 = local102;
		@Pc(604) short local604 = 0;
		@Pc(606) short local606 = 0;
		@Pc(608) short local608 = 0;
		@Pc(610) short local610 = 0;
		@Pc(618) int local618;
		for (@Pc(612) int local612 = 0; local612 < this.anInt5403; local612++) {
			local618 = local19.method4220();
			if (local618 == 1) {
				local604 = (short) (local14.method4190() + local610);
				local606 = (short) (local14.method4190() + local604);
				local608 = (short) (local606 + local14.method4190());
				this.aShortArray78[local612] = local604;
				local610 = local608;
				this.aShortArray74[local612] = local606;
				this.aShortArray75[local612] = local608;
				if (local604 > this.anInt5399) {
					this.anInt5399 = local604;
				}
				if (local606 > this.anInt5399) {
					this.anInt5399 = local606;
				}
				if (local608 > this.anInt5399) {
					this.anInt5399 = local608;
				}
			}
			if (local618 == 2) {
				local606 = local608;
				local608 = (short) (local14.method4190() + local610);
				this.aShortArray78[local612] = local604;
				local610 = local608;
				this.aShortArray74[local612] = local606;
				this.aShortArray75[local612] = local608;
				if (local608 > this.anInt5399) {
					this.anInt5399 = local608;
				}
			}
			if (local618 == 3) {
				local604 = local608;
				local608 = (short) (local610 + local14.method4190());
				local610 = local608;
				this.aShortArray78[local612] = local604;
				this.aShortArray74[local612] = local606;
				this.aShortArray75[local612] = local608;
				if (local608 > this.anInt5399) {
					this.anInt5399 = local608;
				}
			}
			if (local618 == 4) {
				@Pc(773) short local773 = local604;
				local604 = local606;
				local608 = (short) (local610 + local14.method4190());
				local606 = local773;
				this.aShortArray78[local612] = local604;
				local610 = local608;
				this.aShortArray74[local612] = local773;
				this.aShortArray75[local612] = local608;
				if (local608 > this.anInt5399) {
					this.anInt5399 = local608;
				}
			}
		}
		local14.anInt4960 = local180;
		this.anInt5399++;
		for (local618 = 0; local618 < this.anInt5408; local618++) {
			this.aByteArray72[local618] = 0;
			this.aShortArray77[local618] = (short) local14.method4227();
			this.aShortArray76[local618] = (short) local14.method4227();
			this.aShortArray82[local618] = (short) local14.method4227();
		}
		if (this.aByteArray75 != null) {
			@Pc(865) boolean local865 = false;
			for (@Pc(867) int local867 = 0; local867 < this.anInt5403; local867++) {
				@Pc(876) int local876 = this.aByteArray75[local867] & 0xFF;
				if (local876 != 255) {
					if ((this.aShortArray77[local876] & 0xFFFF) == this.aShortArray78[local867] && (this.aShortArray76[local876] & 0xFFFF) == this.aShortArray74[local867] && this.aShortArray75[local867] == (this.aShortArray82[local876] & 0xFFFF)) {
						this.aByteArray75[local867] = -1;
					} else {
						local865 = true;
					}
				}
			}
			if (!local865) {
				this.aByteArray75 = null;
			}
		}
		if (!local7) {
			this.aByteArray77 = null;
		}
		if (!local9) {
			this.aShortArray80 = null;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(SSI)V")
	public void method4524(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5403; local11++) {
			if (arg1 == this.aShortArray73[local11]) {
				this.aShortArray73[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZI)[[I")
	public int[][] method4525(@OriginalArg(0) boolean arg0) {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		@Pc(18) int local18 = arg0 ? this.anInt5398 : this.anInt5399;
		for (@Pc(20) int local20 = 0; local20 < local18; local20++) {
			@Pc(27) int local27 = this.anIntArray378[local20];
			if (local27 >= 0) {
				if (local10 < local27) {
					local10 = local27;
				}
				@Pc(38) int local38 = local8[local27]++;
			}
		}
		@Pc(56) int[][] local56 = new int[local10 + 1][];
		for (@Pc(58) int local58 = 0; local58 <= local10; local58++) {
			local56[local58] = new int[local8[local58]];
			local8[local58] = 0;
		}
		for (@Pc(77) int local77 = 0; local77 < local18; local77++) {
			@Pc(84) int local84 = this.anIntArray378[local77];
			if (local84 >= 0) {
				local56[local84][local8[local84]++] = local77;
			}
		}
		return local56;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(SLclient!ld;II)I")
	private int method4526(@OriginalArg(0) short arg0, @OriginalArg(1) Class184 arg1, @OriginalArg(2) int arg2) {
		@Pc(18) int local18 = arg1.anIntArray381[arg2];
		@Pc(23) int local23 = arg1.anIntArray379[arg2];
		@Pc(28) int local28 = arg1.anIntArray388[arg2];
		for (@Pc(30) int local30 = 0; local30 < this.anInt5398; local30++) {
			if (this.anIntArray381[local30] == local18 && local23 == this.anIntArray379[local30] && local28 == this.anIntArray388[local30]) {
				this.aShortArray79[local30] |= arg0;
				return local30;
			}
		}
		this.anIntArray381[this.anInt5398] = local18;
		this.anIntArray379[this.anInt5398] = local23;
		this.anIntArray388[this.anInt5398] = local28;
		this.aShortArray79[this.anInt5398] = arg0;
		this.anIntArray378[this.anInt5398] = arg1.anIntArray378 == null ? -1 : arg1.anIntArray378[arg2];
		return this.anInt5398++;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)V")
	public void method4527(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10;
		@Pc(14) int local14;
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (arg2 != 0) {
			local10 = Class5_Sub2_Sub16.anIntArray411[arg2];
			local14 = Class5_Sub2_Sub16.anIntArray410[arg2];
			for (local16 = 0; local16 < this.anInt5398; local16++) {
				local34 = local14 * this.anIntArray381[local16] + local10 * this.anIntArray379[local16] >> 15;
				this.anIntArray379[local16] = this.anIntArray379[local16] * local14 - local10 * this.anIntArray381[local16] >> 15;
				this.anIntArray381[local16] = local34;
			}
		}
		if (arg0 != 0) {
			local10 = Class5_Sub2_Sub16.anIntArray411[arg0];
			local14 = Class5_Sub2_Sub16.anIntArray410[arg0];
			for (local16 = 0; local16 < this.anInt5398; local16++) {
				local34 = this.anIntArray379[local16] * local14 - local10 * this.anIntArray388[local16] >> 15;
				this.anIntArray388[local16] = this.anIntArray388[local16] * local14 + local10 * this.anIntArray379[local16] >> 15;
				this.anIntArray379[local16] = local34;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local10 = Class5_Sub2_Sub16.anIntArray411[arg1];
		local14 = Class5_Sub2_Sub16.anIntArray410[arg1];
		for (local16 = 0; local16 < this.anInt5398; local16++) {
			local34 = this.anIntArray388[local16] * local10 + this.anIntArray381[local16] * local14 >> 15;
			this.anIntArray388[local16] = local14 * this.anIntArray388[local16] - this.anIntArray381[local16] * local10 >> 15;
			this.anIntArray381[local16] = local34;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(SSBSBBSSIS)B")
	public byte method4528() {
		if (this.anInt5408 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray72[this.anInt5408] = 3;
		this.aShortArray77[this.anInt5408] = 0;
		this.aShortArray76[this.anInt5408] = 32767;
		this.aShortArray82[this.anInt5408] = 0;
		this.anIntArray384[this.anInt5408] = 1024;
		this.anIntArray380[this.anInt5408] = 1024;
		this.anIntArray387[this.anInt5408] = 1024;
		this.aByteArray74[this.anInt5408] = 0;
		this.aByteArray76[this.anInt5408] = 0;
		this.anIntArray386[this.anInt5408] = 0;
		return (byte) this.anInt5408++;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)[[I")
	public int[][] method4529() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.aClass21Array1.length; local12++) {
			@Pc(20) int local20 = this.aClass21Array1[local12].anInt534;
			if (local20 >= 0) {
				if (local10 < local20) {
					local10 = local20;
				}
				@Pc(38) int local38 = local8[local20]++;
			}
		}
		@Pc(52) int[][] local52 = new int[local10 + 1][];
		for (@Pc(54) int local54 = 0; local54 <= local10; local54++) {
			local52[local54] = new int[local8[local54]];
			local8[local54] = 0;
		}
		for (@Pc(79) int local79 = 0; local79 < this.aClass21Array1.length; local79++) {
			@Pc(87) int local87 = this.aClass21Array1[local79].anInt534;
			if (local87 >= 0) {
				local52[local87][local8[local87]++] = local79;
			}
		}
		return local52;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)[[I")
	public int[][] method4530() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5403; local12++) {
			@Pc(19) int local19 = this.anIntArray382[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(50) int[][] local50 = new int[local10 + 1][];
		for (@Pc(52) int local52 = 0; local52 <= local10; local52++) {
			local50[local52] = new int[local8[local52]];
			local8[local52] = 0;
		}
		for (@Pc(83) int local83 = 0; local83 < this.anInt5403; local83++) {
			@Pc(90) int local90 = this.anIntArray382[local83];
			if (local90 >= 0) {
				local50[local90][local8[local90]++] = local83;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(SBSBIIIIB)I")
	public int method4531(@OriginalArg(0) short arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray78[this.anInt5403] = (short) arg6;
		this.aShortArray74[this.anInt5403] = (short) arg4;
		this.aShortArray75[this.anInt5403] = (short) arg5;
		this.aByteArray77[this.anInt5403] = arg3;
		this.aByteArray75[this.anInt5403] = arg7;
		this.aShortArray73[this.anInt5403] = arg2;
		this.aByteArray78[this.anInt5403] = arg1;
		this.aShortArray80[this.anInt5403] = arg0;
		return this.anInt5403++;
	}
}
