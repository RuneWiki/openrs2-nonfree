import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class177 {

	@OriginalMember(owner = "client!ri", name = "c", descriptor = "[B")
	public byte[] aByteArray75;

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "[I")
	public int[] anIntArray527;

	@OriginalMember(owner = "client!ri", name = "h", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "[I")
	public int[] anIntArray528;

	@OriginalMember(owner = "client!ri", name = "n", descriptor = "[B")
	public byte[] aByteArray76;

	@OriginalMember(owner = "client!ri", name = "o", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!ri", name = "q", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!ri", name = "s", descriptor = "[S")
	public short[] aShortArray100;

	@OriginalMember(owner = "client!ri", name = "x", descriptor = "[S")
	public short[] aShortArray101;

	@OriginalMember(owner = "client!ri", name = "z", descriptor = "[Lclient!kg;")
	public Class113[] aClass113Array3;

	@OriginalMember(owner = "client!ri", name = "A", descriptor = "[S")
	public short[] aShortArray102;

	@OriginalMember(owner = "client!ri", name = "C", descriptor = "[I")
	public int[] anIntArray529;

	@OriginalMember(owner = "client!ri", name = "E", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!ri", name = "H", descriptor = "[I")
	public int[] anIntArray530;

	@OriginalMember(owner = "client!ri", name = "I", descriptor = "[I")
	public int[] anIntArray531;

	@OriginalMember(owner = "client!ri", name = "J", descriptor = "[S")
	public short[] aShortArray103;

	@OriginalMember(owner = "client!ri", name = "K", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!ri", name = "L", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!ri", name = "O", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!ri", name = "P", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!ri", name = "Q", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!ri", name = "T", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!ri", name = "U", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!ri", name = "V", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!ri", name = "Y", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!ri", name = "cb", descriptor = "[Lclient!od;")
	public Class148[] aClass148Array3;

	@OriginalMember(owner = "client!ri", name = "db", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public int anInt5472 = 0;

	@OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
	public int anInt5479 = 0;

	@OriginalMember(owner = "client!ri", name = "F", descriptor = "I")
	public int anInt5487 = 0;

	@OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
	public int anInt5491 = 0;

	@OriginalMember(owner = "client!ri", name = "M", descriptor = "B")
	public byte aByte53 = 0;

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V")
	public Class177(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method4852(arg0);
		} else {
			this.method4857(arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(III)V")
	public Class177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray97 = new short[arg1];
		this.anIntArray527 = new int[arg0];
		this.aByteArray83 = new byte[arg1];
		if (arg2 > 0) {
			this.aShortArray94 = new short[arg2];
			this.aShortArray106 = new short[arg2];
			this.aByteArray84 = new byte[arg2];
			this.aShortArray95 = new short[arg2];
			this.aByteArray75 = new byte[arg2];
			this.aByteArray82 = new byte[arg2];
			this.aShortArray104 = new short[arg2];
			this.aByteArray80 = new byte[arg2];
			this.aShortArray105 = new short[arg2];
			this.aShortArray98 = new short[arg2];
			this.aByteArray78 = new byte[arg2];
			this.aByteArray77 = new byte[arg2];
		}
		this.aByteArray79 = new byte[arg1];
		this.anIntArray531 = new int[arg0];
		this.aShortArray101 = new short[arg1];
		this.aByteArray76 = new byte[arg1];
		this.anIntArray530 = new int[arg0];
		this.aShortArray100 = new short[arg1];
		this.anIntArray529 = new int[arg0];
		this.aShortArray99 = new short[arg1];
		this.aShortArray102 = new short[arg1];
		this.anIntArray528 = new int[arg1];
		this.aByteArray81 = new byte[arg1];
	}

	@OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([Lclient!ri;I)V")
	public Class177(@OriginalArg(0) Class177[] arg0, @OriginalArg(1) int arg1) {
		this.anInt5479 = 0;
		this.anInt5487 = 0;
		this.anInt5472 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		this.aByte53 = -1;
		@Pc(44) boolean local44 = false;
		for (@Pc(46) int local46 = 0; local46 < arg1; local46++) {
			@Pc(51) Class177 local51 = arg0[local46];
			if (local51 != null) {
				this.anInt5487 += local51.anInt5487;
				this.anInt5472 += local51.anInt5472;
				this.anInt5479 += local51.anInt5479;
				if (local51.aClass113Array3 != null) {
					local27 += local51.aClass113Array3.length;
				}
				local31 |= local51.aByteArray83 != null;
				if (local51.aClass148Array3 != null) {
					local29 += local51.aClass148Array3.length;
				}
				local44 |= local51.anIntArray528 != null;
				local39 |= local51.aShortArray100 != null;
				local37 |= local51.aByteArray79 != null;
				if (local51.aByteArray81 == null) {
					if (this.aByte53 == -1) {
						this.aByte53 = local51.aByte53;
					}
					if (this.aByte53 != local51.aByte53) {
						local33 = true;
					}
				} else {
					local33 = true;
				}
				local35 |= local51.aByteArray76 != null;
			}
		}
		if (local35) {
			this.aByteArray76 = new byte[this.anInt5472];
		}
		if (this.anInt5487 > 0) {
			this.aShortArray95 = new short[this.anInt5487];
			this.aShortArray94 = new short[this.anInt5487];
			this.aByteArray78 = new byte[this.anInt5487];
			this.aShortArray105 = new short[this.anInt5487];
			this.aByteArray77 = new byte[this.anInt5487];
			this.aByteArray82 = new byte[this.anInt5487];
			this.aByteArray75 = new byte[this.anInt5487];
			this.aByteArray80 = new byte[this.anInt5487];
			this.aByteArray84 = new byte[this.anInt5487];
			this.aShortArray104 = new short[this.anInt5487];
			this.aShortArray106 = new short[this.anInt5487];
			this.aShortArray98 = new short[this.anInt5487];
		}
		this.anIntArray527 = new int[this.anInt5479];
		this.aShortArray101 = new short[this.anInt5472];
		this.aShortArray102 = new short[this.anInt5472];
		this.aShortArray96 = new short[this.anInt5479];
		this.anIntArray530 = new int[this.anInt5479];
		this.anIntArray531 = new int[this.anInt5479];
		this.anIntArray529 = new int[this.anInt5479];
		if (local27 > 0) {
			this.aClass113Array3 = new Class113[local27];
		}
		if (local37) {
			this.aByteArray79 = new byte[this.anInt5472];
		}
		if (local39) {
			this.aShortArray100 = new short[this.anInt5472];
		}
		if (local44) {
			this.anIntArray528 = new int[this.anInt5472];
		}
		this.aShortArray99 = new short[this.anInt5472];
		this.aShortArray97 = new short[this.anInt5472];
		if (local31) {
			this.aByteArray83 = new byte[this.anInt5472];
		}
		this.aShortArray103 = new short[this.anInt5472];
		if (local33) {
			this.aByteArray81 = new byte[this.anInt5472];
		}
		if (local29 > 0) {
			this.aClass148Array3 = new Class148[local29];
		}
		local29 = 0;
		this.anInt5487 = 0;
		this.anInt5479 = 0;
		local27 = 0;
		this.anInt5472 = 0;
		@Pc(542) int local542;
		@Pc(553) int local553;
		for (@Pc(347) int local347 = 0; local347 < arg1; local347++) {
			@Pc(353) short local353 = (short) (0x1 << local347);
			@Pc(357) Class177 local357 = arg0[local347];
			if (local357 != null) {
				for (@Pc(361) int local361 = 0; local361 < local357.anInt5472; local361++) {
					if (local31 && local357.aByteArray83 != null) {
						this.aByteArray83[this.anInt5472] = local357.aByteArray83[local361];
					}
					if (local33) {
						if (local357.aByteArray81 == null) {
							this.aByteArray81[this.anInt5472] = local357.aByte53;
						} else {
							this.aByteArray81[this.anInt5472] = local357.aByteArray81[local361];
						}
					}
					if (local35 && local357.aByteArray76 != null) {
						this.aByteArray76[this.anInt5472] = local357.aByteArray76[local361];
					}
					if (local39) {
						if (local357.aShortArray100 == null) {
							this.aShortArray100[this.anInt5472] = -1;
						} else {
							this.aShortArray100[this.anInt5472] = local357.aShortArray100[local361];
						}
					}
					if (local44) {
						if (local357.anIntArray528 == null) {
							this.anIntArray528[this.anInt5472] = -1;
						} else {
							this.anIntArray528[this.anInt5472] = local357.anIntArray528[local361];
						}
					}
					this.aShortArray99[this.anInt5472] = (short) this.method4859(local357.aShortArray99[local361], local353, local357);
					this.aShortArray102[this.anInt5472] = (short) this.method4859(local357.aShortArray102[local361], local353, local357);
					this.aShortArray97[this.anInt5472] = (short) this.method4859(local357.aShortArray97[local361], local353, local357);
					this.aShortArray103[this.anInt5472] = local353;
					this.aShortArray101[this.anInt5472] = local357.aShortArray101[local361];
					this.anInt5472++;
				}
				@Pc(530) int local530;
				if (local357.aClass113Array3 != null) {
					for (local530 = 0; local530 < local357.aClass113Array3.length; local530++) {
						local542 = this.method4859(local357.aClass113Array3[local530].anInt3309, local353, local357);
						local553 = this.method4859(local357.aClass113Array3[local530].anInt3320, local353, local357);
						@Pc(564) int local564 = this.method4859(local357.aClass113Array3[local530].anInt3322, local353, local357);
						this.aClass113Array3[local27] = new Class113(local357.aClass113Array3[local530].anInt3310, local542, local553, local564, local357.aClass113Array3[local530].aByte18);
						local27++;
					}
				}
				if (local357.aClass148Array3 != null) {
					for (local530 = 0; local530 < local357.aClass148Array3.length; local530++) {
						local542 = this.method4859(local357.aClass148Array3[local530].anInt4438, local353, local357);
						this.aClass148Array3[local29] = new Class148(local357.aClass148Array3[local530].anInt4440, local542);
						local29++;
					}
				}
			}
		}
		this.anInt5491 = this.anInt5479;
		@Pc(642) int local642 = 0;
		for (@Pc(644) int local644 = 0; local644 < arg1; local644++) {
			@Pc(650) short local650 = (short) (0x1 << local644);
			@Pc(654) Class177 local654 = arg0[local644];
			if (local654 != null) {
				for (local542 = 0; local542 < local654.anInt5472; local542++) {
					if (local37) {
						this.aByteArray79[local642++] = (byte) (local654.aByteArray79 == null || local654.aByteArray79[local542] == -1 ? -1 : local654.aByteArray79[local542] + this.anInt5487);
					}
				}
				for (local553 = 0; local553 < local654.anInt5487; local553++) {
					@Pc(708) byte local708 = this.aByteArray80[this.anInt5487] = local654.aByteArray80[local553];
					if (local708 == 0) {
						this.aShortArray95[this.anInt5487] = (short) this.method4859(local654.aShortArray95[local553], local650, local654);
						this.aShortArray94[this.anInt5487] = (short) this.method4859(local654.aShortArray94[local553], local650, local654);
						this.aShortArray106[this.anInt5487] = (short) this.method4859(local654.aShortArray106[local553], local650, local654);
					}
					if (local708 >= 1 && local708 <= 3) {
						this.aShortArray95[this.anInt5487] = local654.aShortArray95[local553];
						this.aShortArray94[this.anInt5487] = local654.aShortArray94[local553];
						this.aShortArray106[this.anInt5487] = local654.aShortArray106[local553];
						this.aShortArray98[this.anInt5487] = local654.aShortArray98[local553];
						this.aShortArray104[this.anInt5487] = local654.aShortArray104[local553];
						this.aShortArray105[this.anInt5487] = local654.aShortArray105[local553];
						this.aByteArray78[this.anInt5487] = local654.aByteArray78[local553];
						this.aByteArray77[this.anInt5487] = local654.aByteArray77[local553];
						this.aByteArray84[this.anInt5487] = local654.aByteArray84[local553];
					}
					if (local708 == 2) {
						this.aByteArray75[this.anInt5487] = local654.aByteArray75[local553];
						this.aByteArray82[this.anInt5487] = local654.aByteArray82[local553];
					}
					this.anInt5487++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBII)V")
	public void method4848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(15) int local15;
		@Pc(33) int local33;
		if (arg2 != 0) {
			local9 = Class187.anIntArray571[arg2];
			local13 = Class187.anIntArray570[arg2];
			for (local15 = 0; local15 < this.anInt5479; local15++) {
				local33 = local9 * this.anIntArray527[local15] + local13 * this.anIntArray530[local15] >> 15;
				this.anIntArray527[local15] = this.anIntArray527[local15] * local13 - this.anIntArray530[local15] * local9 >> 15;
				this.anIntArray530[local15] = local33;
			}
		}
		if (arg1 != 0) {
			local9 = Class187.anIntArray571[arg1];
			local13 = Class187.anIntArray570[arg1];
			for (local15 = 0; local15 < this.anInt5479; local15++) {
				local33 = this.anIntArray527[local15] * local13 - this.anIntArray529[local15] * local9 >> 15;
				this.anIntArray529[local15] = this.anIntArray529[local15] * local13 + this.anIntArray527[local15] * local9 >> 15;
				this.anIntArray527[local15] = local33;
			}
		}
		if (arg0 == 0) {
			return;
		}
		local9 = Class187.anIntArray571[arg0];
		local13 = Class187.anIntArray570[arg0];
		for (local15 = 0; local15 < this.anInt5479; local15++) {
			local33 = this.anIntArray529[local15] * local9 + local13 * this.anIntArray530[local15] >> 15;
			this.anIntArray529[local15] = local13 * this.anIntArray529[local15] - this.anIntArray530[local15] * local9 >> 15;
			this.anIntArray530[local15] = local33;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIII)I")
	public int method4849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt5479; local5++) {
			if (arg2 == this.anIntArray530[local5] && this.anIntArray527[local5] == arg0 && arg1 == this.anIntArray529[local5]) {
				return local5;
			}
		}
		this.anIntArray530[this.anInt5479] = arg2;
		this.anIntArray527[this.anInt5479] = arg0;
		this.anIntArray529[this.anInt5479] = arg1;
		this.anInt5491 = this.anInt5479 + 1;
		return this.anInt5479++;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)[[I")
	public int[][] method4851() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(20) int local20 = 0; local20 < this.anInt5472; local20++) {
			@Pc(27) int local27 = this.anIntArray528[local20];
			if (local27 >= 0) {
				@Pc(33) int local33 = local8[local27]++;
				if (local10 < local27) {
					local10 = local27;
				}
			}
		}
		@Pc(59) int[][] local59 = new int[local10 + 1][];
		for (@Pc(61) int local61 = 0; local61 <= local10; local61++) {
			local59[local61] = new int[local8[local61]];
			local8[local61] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt5472; local80++) {
			@Pc(87) int local87 = this.anIntArray528[local80];
			if (local87 >= 0) {
				local59[local87][local8[local87]++] = local80;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[B)V")
	private void method4852(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class5_Sub12 local8 = new Class5_Sub12(arg0);
		@Pc(13) Class5_Sub12 local13 = new Class5_Sub12(arg0);
		@Pc(18) Class5_Sub12 local18 = new Class5_Sub12(arg0);
		@Pc(23) Class5_Sub12 local23 = new Class5_Sub12(arg0);
		@Pc(28) Class5_Sub12 local28 = new Class5_Sub12(arg0);
		@Pc(33) Class5_Sub12 local33 = new Class5_Sub12(arg0);
		@Pc(38) Class5_Sub12 local38 = new Class5_Sub12(arg0);
		local8.anInt5731 = arg0.length - 23;
		this.anInt5479 = local8.method5106();
		this.anInt5472 = local8.method5106();
		this.anInt5487 = local8.method5115();
		@Pc(63) int local63 = local8.method5115();
		@Pc(72) boolean local72 = (local63 & 0x1) == 1;
		@Pc(81) boolean local81 = (local63 & 0x2) == 2;
		@Pc(85) int local85 = local8.method5115();
		@Pc(89) int local89 = local8.method5115();
		@Pc(93) int local93 = local8.method5115();
		@Pc(97) int local97 = local8.method5115();
		@Pc(101) int local101 = local8.method5115();
		@Pc(105) int local105 = local8.method5106();
		@Pc(111) int local111 = local8.method5106();
		@Pc(115) int local115 = local8.method5106();
		@Pc(119) int local119 = local8.method5106();
		@Pc(123) int local123 = local8.method5106();
		@Pc(125) int local125 = 0;
		@Pc(127) int local127 = 0;
		@Pc(129) int local129 = 0;
		@Pc(142) int local142;
		if (this.anInt5487 > 0) {
			local8.anInt5731 = 0;
			this.aByteArray80 = new byte[this.anInt5487];
			for (local142 = 0; local142 < this.anInt5487; local142++) {
				@Pc(152) byte local152 = this.aByteArray80[local142] = local8.method5098();
				if (local152 == 2) {
					local129++;
				}
				if (local152 == 0) {
					local125++;
				}
				if (local152 >= 1 && local152 <= 3) {
					local127++;
				}
			}
		}
		local142 = this.anInt5487;
		@Pc(184) int local184 = local142;
		local142 += this.anInt5479;
		@Pc(191) int local191 = local142;
		if (local72) {
			local142 += this.anInt5472;
		}
		@Pc(200) int local200 = local142;
		local142 += this.anInt5472;
		@Pc(207) int local207 = local142;
		if (local85 == 255) {
			local142 += this.anInt5472;
		}
		@Pc(217) int local217 = local142;
		if (local93 == 1) {
			local142 += this.anInt5472;
		}
		@Pc(229) int local229 = local142;
		if (local101 == 1) {
			local142 += this.anInt5479;
		}
		@Pc(241) int local241 = local142;
		if (local89 == 1) {
			local142 += this.anInt5472;
		}
		@Pc(253) int local253 = local142;
		local142 += local119;
		@Pc(259) int local259 = local142;
		if (local97 == 1) {
			local142 += this.anInt5472 * 2;
		}
		@Pc(271) int local271 = local142;
		local142 += local123;
		@Pc(277) int local277 = local142;
		local142 += this.anInt5472 * 2;
		@Pc(286) int local286 = local142;
		local142 += local105;
		@Pc(292) int local292 = local142;
		local142 += local111;
		@Pc(298) int local298 = local142;
		local142 += local115;
		@Pc(304) int local304 = local142;
		local142 += local125 * 6;
		@Pc(312) int local312 = local142;
		local142 += local127 * 6;
		@Pc(320) int local320 = local142;
		local142 += local127 * 6;
		@Pc(328) int local328 = local142;
		local142 += local127;
		@Pc(334) int local334 = local142;
		local142 += local127;
		@Pc(340) int local340 = local142;
		local142 += local129 * 2 + local127;
		this.aShortArray101 = new short[this.anInt5472];
		this.anIntArray527 = new int[this.anInt5479];
		if (local89 == 1) {
			this.aByteArray76 = new byte[this.anInt5472];
		}
		if (this.anInt5487 > 0) {
			if (local129 > 0) {
				this.aByteArray75 = new byte[local129];
				this.aByteArray82 = new byte[local129];
			}
			this.aShortArray94 = new short[this.anInt5487];
			this.aShortArray95 = new short[this.anInt5487];
			if (local127 > 0) {
				this.aByteArray84 = new byte[local127];
				this.aShortArray98 = new short[local127];
				this.aShortArray105 = new short[local127];
				this.aByteArray78 = new byte[local127];
				this.aShortArray104 = new short[local127];
				this.aByteArray77 = new byte[local127];
			}
			this.aShortArray106 = new short[this.anInt5487];
		}
		this.aShortArray102 = new short[this.anInt5472];
		local8.anInt5731 = local184;
		if (local97 == 1 && this.anInt5487 > 0) {
			this.aByteArray79 = new byte[this.anInt5472];
		}
		this.aShortArray99 = new short[this.anInt5472];
		this.aShortArray97 = new short[this.anInt5472];
		if (local101 == 1) {
			this.anIntArray531 = new int[this.anInt5479];
		}
		if (local85 == 255) {
			this.aByteArray81 = new byte[this.anInt5472];
		} else {
			this.aByte53 = (byte) local85;
		}
		if (local97 == 1) {
			this.aShortArray100 = new short[this.anInt5472];
		}
		this.anIntArray530 = new int[this.anInt5479];
		if (local93 == 1) {
			this.anIntArray528 = new int[this.anInt5472];
		}
		if (local72) {
			this.aByteArray83 = new byte[this.anInt5472];
		}
		this.anIntArray529 = new int[this.anInt5479];
		local13.anInt5731 = local286;
		local18.anInt5731 = local292;
		local23.anInt5731 = local298;
		local28.anInt5731 = local229;
		@Pc(532) int local532 = 0;
		@Pc(534) int local534 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < this.anInt5479; local538++) {
			local543 = local8.method5115();
			@Pc(545) int local545 = 0;
			if ((local543 & 0x1) != 0) {
				local545 = local13.method5103();
			}
			@Pc(558) int local558 = 0;
			if ((local543 & 0x2) != 0) {
				local558 = local18.method5103();
			}
			@Pc(571) int local571 = 0;
			if ((local543 & 0x4) != 0) {
				local571 = local23.method5103();
			}
			this.anIntArray530[local538] = local545 + local532;
			this.anIntArray527[local538] = local558 + local534;
			this.anIntArray529[local538] = local536 + local571;
			local534 = this.anIntArray527[local538];
			local536 = this.anIntArray529[local538];
			local532 = this.anIntArray530[local538];
			if (local101 == 1) {
				this.anIntArray531[local538] = local28.method5115();
			}
		}
		local8.anInt5731 = local277;
		local13.anInt5731 = local191;
		local18.anInt5731 = local207;
		local23.anInt5731 = local241;
		local28.anInt5731 = local217;
		local33.anInt5731 = local259;
		local38.anInt5731 = local271;
		for (local543 = 0; local543 < this.anInt5472; local543++) {
			this.aShortArray101[local543] = (short) local8.method5106();
			if (local72) {
				this.aByteArray83[local543] = local13.method5098();
			}
			if (local85 == 255) {
				this.aByteArray81[local543] = local18.method5098();
			}
			if (local89 == 1) {
				this.aByteArray76[local543] = local23.method5098();
			}
			if (local93 == 1) {
				this.anIntArray528[local543] = local28.method5115();
			}
			if (local97 == 1) {
				this.aShortArray100[local543] = (short) (local33.method5106() - 1);
			}
			if (this.aByteArray79 != null) {
				if (this.aShortArray100[local543] == -1) {
					this.aByteArray79[local543] = -1;
				} else {
					this.aByteArray79[local543] = (byte) (local38.method5115() - 1);
				}
			}
		}
		this.anInt5491 = -1;
		local8.anInt5731 = local253;
		local13.anInt5731 = local200;
		@Pc(763) short local763 = 0;
		@Pc(765) short local765 = 0;
		@Pc(767) short local767 = 0;
		@Pc(770) short local770 = 0;
		@Pc(777) int local777;
		for (@Pc(772) int local772 = 0; local772 < this.anInt5472; local772++) {
			local777 = local13.method5115();
			if (local777 == 1) {
				local763 = (short) (local8.method5103() + local770);
				local765 = (short) (local8.method5103() + local763);
				local767 = (short) (local765 + local8.method5103());
				this.aShortArray99[local772] = local763;
				local770 = local767;
				this.aShortArray102[local772] = local765;
				this.aShortArray97[local772] = local767;
				if (local763 > this.anInt5491) {
					this.anInt5491 = local763;
				}
				if (local765 > this.anInt5491) {
					this.anInt5491 = local765;
				}
				if (this.anInt5491 < local767) {
					this.anInt5491 = local767;
				}
			}
			if (local777 == 2) {
				local765 = local767;
				local767 = (short) (local8.method5103() + local770);
				local770 = local767;
				this.aShortArray99[local772] = local763;
				this.aShortArray102[local772] = local765;
				this.aShortArray97[local772] = local767;
				if (this.anInt5491 < local767) {
					this.anInt5491 = local767;
				}
			}
			if (local777 == 3) {
				local763 = local767;
				local767 = (short) (local8.method5103() + local770);
				this.aShortArray99[local772] = local763;
				local770 = local767;
				this.aShortArray102[local772] = local765;
				this.aShortArray97[local772] = local767;
				if (local767 > this.anInt5491) {
					this.anInt5491 = local767;
				}
			}
			if (local777 == 4) {
				@Pc(946) short local946 = local763;
				local763 = local765;
				local767 = (short) (local8.method5103() + local770);
				local765 = local946;
				this.aShortArray99[local772] = local763;
				local770 = local767;
				this.aShortArray102[local772] = local946;
				this.aShortArray97[local772] = local767;
				if (this.anInt5491 < local767) {
					this.anInt5491 = local767;
				}
			}
		}
		local8.anInt5731 = local304;
		this.anInt5491++;
		local13.anInt5731 = local312;
		local18.anInt5731 = local320;
		local23.anInt5731 = local328;
		local28.anInt5731 = local334;
		local33.anInt5731 = local340;
		@Pc(1028) int local1028;
		for (local777 = 0; local777 < this.anInt5487; local777++) {
			local1028 = this.aByteArray80[local777] & 0xFF;
			if (local1028 == 0) {
				this.aShortArray95[local777] = (short) local8.method5106();
				this.aShortArray94[local777] = (short) local8.method5106();
				this.aShortArray106[local777] = (short) local8.method5106();
			}
			if (local1028 == 1) {
				this.aShortArray95[local777] = (short) local13.method5106();
				this.aShortArray94[local777] = (short) local13.method5106();
				this.aShortArray106[local777] = (short) local13.method5106();
				this.aShortArray98[local777] = (short) local18.method5106();
				this.aShortArray104[local777] = (short) local18.method5106();
				this.aShortArray105[local777] = (short) local18.method5106();
				this.aByteArray78[local777] = local23.method5098();
				this.aByteArray77[local777] = local28.method5098();
				this.aByteArray84[local777] = local33.method5098();
			}
			if (local1028 == 2) {
				this.aShortArray95[local777] = (short) local13.method5106();
				this.aShortArray94[local777] = (short) local13.method5106();
				this.aShortArray106[local777] = (short) local13.method5106();
				this.aShortArray98[local777] = (short) local18.method5106();
				this.aShortArray104[local777] = (short) local18.method5106();
				this.aShortArray105[local777] = (short) local18.method5106();
				this.aByteArray78[local777] = local23.method5098();
				this.aByteArray77[local777] = local28.method5098();
				this.aByteArray84[local777] = local33.method5098();
				this.aByteArray75[local777] = local33.method5098();
				this.aByteArray82[local777] = local33.method5098();
			}
			if (local1028 == 3) {
				this.aShortArray95[local777] = (short) local13.method5106();
				this.aShortArray94[local777] = (short) local13.method5106();
				this.aShortArray106[local777] = (short) local13.method5106();
				this.aShortArray98[local777] = (short) local18.method5106();
				this.aShortArray104[local777] = (short) local18.method5106();
				this.aShortArray105[local777] = (short) local18.method5106();
				this.aByteArray78[local777] = local23.method5098();
				this.aByteArray77[local777] = local28.method5098();
				this.aByteArray84[local777] = local33.method5098();
			}
		}
		if (!local81) {
			return;
		}
		local8.anInt5731 = local142;
		local1028 = local8.method5115();
		@Pc(1322) int local1322;
		@Pc(1327) int local1327;
		if (local1028 > 0) {
			this.aClass113Array3 = new Class113[local1028];
			for (local1322 = 0; local1322 < local1028; local1322++) {
				local1327 = local8.method5106();
				@Pc(1333) int local1333 = local8.method5106();
				@Pc(1339) byte local1339;
				if (local85 == 255) {
					local1339 = this.aByteArray81[local1333];
				} else {
					local1339 = (byte) local85;
				}
				this.aClass113Array3[local1322] = new Class113(local1327, this.aShortArray99[local1333], this.aShortArray102[local1333], this.aShortArray97[local1333], local1339);
			}
		}
		local1322 = local8.method5115();
		if (local1322 <= 0) {
			return;
		}
		this.aClass148Array3 = new Class148[local1322];
		for (local1327 = 0; local1327 < local1322; local1327++) {
			this.aClass148Array3[local1327] = new Class148(local8.method5106(), local8.method5106());
		}
		return;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBIBBSISZ)I")
	public int method4853(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) short arg5, @OriginalArg(6) int arg6, @OriginalArg(7) short arg7) {
		this.aShortArray99[this.anInt5472] = (short) arg2;
		this.aShortArray102[this.anInt5472] = (short) arg6;
		this.aShortArray97[this.anInt5472] = (short) arg0;
		this.aByteArray83[this.anInt5472] = arg4;
		this.aByteArray79[this.anInt5472] = arg1;
		this.aShortArray101[this.anInt5472] = arg7;
		this.aByteArray76[this.anInt5472] = arg3;
		this.aShortArray100[this.anInt5472] = arg5;
		return this.anInt5472++;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(BIII)V")
	public void method4854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(5) int local5 = 0; local5 < this.anInt5479; local5++) {
			this.anIntArray530[local5] += arg0;
			this.anIntArray527[local5] += arg2;
			this.anIntArray529[local5] += arg1;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(SSI)V")
	public void method4855(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray100 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < this.anInt5472; local9++) {
			if (this.aShortArray100[local9] == arg1) {
				this.aShortArray100[local9] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(SISSSSBBSB)B")
	public byte method4856() {
		if (this.anInt5487 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray80[this.anInt5487] = 3;
		this.aShortArray95[this.anInt5487] = 0;
		this.aShortArray94[this.anInt5487] = 32767;
		this.aShortArray106[this.anInt5487] = 0;
		this.aShortArray98[this.anInt5487] = 1024;
		this.aShortArray104[this.anInt5487] = 1024;
		this.aShortArray105[this.anInt5487] = 1024;
		this.aByteArray78[this.anInt5487] = 0;
		this.aByteArray77[this.anInt5487] = 0;
		this.aByteArray84[this.anInt5487] = 0;
		return (byte) this.anInt5487++;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "([BI)V")
	private void method4857(@OriginalArg(0) byte[] arg0) {
		@Pc(5) boolean local5 = false;
		@Pc(7) boolean local7 = false;
		@Pc(12) Class5_Sub12 local12 = new Class5_Sub12(arg0);
		@Pc(17) Class5_Sub12 local17 = new Class5_Sub12(arg0);
		@Pc(22) Class5_Sub12 local22 = new Class5_Sub12(arg0);
		@Pc(27) Class5_Sub12 local27 = new Class5_Sub12(arg0);
		@Pc(32) Class5_Sub12 local32 = new Class5_Sub12(arg0);
		local12.anInt5731 = arg0.length - 18;
		this.anInt5479 = local12.method5106();
		this.anInt5472 = local12.method5106();
		this.anInt5487 = local12.method5115();
		@Pc(57) int local57 = local12.method5115();
		@Pc(61) int local61 = local12.method5115();
		@Pc(65) int local65 = local12.method5115();
		@Pc(69) int local69 = local12.method5115();
		@Pc(73) int local73 = local12.method5115();
		@Pc(77) int local77 = local12.method5106();
		@Pc(81) int local81 = local12.method5106();
		@Pc(85) int local85 = local12.method5106();
		@Pc(91) int local91 = local12.method5106();
		@Pc(100) int local100 = this.anInt5479;
		@Pc(102) int local102 = local100;
		local100 += this.anInt5472;
		@Pc(109) int local109 = local100;
		if (local61 == 255) {
			local100 += this.anInt5472;
		}
		@Pc(119) int local119 = local100;
		if (local69 == 1) {
			local100 += this.anInt5472;
		}
		@Pc(129) int local129 = local100;
		if (local57 == 1) {
			local100 += this.anInt5472;
		}
		@Pc(139) int local139 = local100;
		if (local73 == 1) {
			local100 += this.anInt5479;
		}
		@Pc(149) int local149 = local100;
		if (local65 == 1) {
			local100 += this.anInt5472;
		}
		@Pc(161) int local161 = local100;
		local100 += local91;
		@Pc(167) int local167 = local100;
		local100 += this.anInt5472 * 2;
		@Pc(176) int local176 = local100;
		local100 += this.anInt5487 * 6;
		@Pc(185) int local185 = local100;
		local100 += local77;
		@Pc(191) int local191 = local100;
		local100 += local81;
		this.aShortArray102 = new short[this.anInt5472];
		local12.anInt5731 = 0;
		this.aShortArray101 = new short[this.anInt5472];
		if (local61 == 255) {
			this.aByteArray81 = new byte[this.anInt5472];
		} else {
			this.aByte53 = (byte) local61;
		}
		this.anIntArray529 = new int[this.anInt5479];
		if (this.anInt5487 > 0) {
			this.aByteArray80 = new byte[this.anInt5487];
			this.aShortArray94 = new short[this.anInt5487];
			this.aShortArray95 = new short[this.anInt5487];
			this.aShortArray106 = new short[this.anInt5487];
		}
		if (local65 == 1) {
			this.aByteArray76 = new byte[this.anInt5472];
		}
		if (local57 == 1) {
			this.aShortArray100 = new short[this.anInt5472];
			this.aByteArray83 = new byte[this.anInt5472];
			this.aByteArray79 = new byte[this.anInt5472];
		}
		this.anIntArray530 = new int[this.anInt5479];
		this.aShortArray99 = new short[this.anInt5472];
		if (local73 == 1) {
			this.anIntArray531 = new int[this.anInt5479];
		}
		if (local69 == 1) {
			this.anIntArray528 = new int[this.anInt5472];
		}
		this.aShortArray97 = new short[this.anInt5472];
		this.anIntArray527 = new int[this.anInt5479];
		local17.anInt5731 = local185;
		local22.anInt5731 = local191;
		local27.anInt5731 = local100;
		local32.anInt5731 = local139;
		@Pc(340) int local340 = 0;
		@Pc(342) int local342 = 0;
		@Pc(344) int local344 = 0;
		@Pc(351) int local351;
		@Pc(353) int local353;
		for (@Pc(346) int local346 = 0; local346 < this.anInt5479; local346++) {
			local351 = local12.method5115();
			local353 = 0;
			if ((local351 & 0x1) != 0) {
				local353 = local17.method5103();
			}
			@Pc(365) int local365 = 0;
			if ((local351 & 0x2) != 0) {
				local365 = local22.method5103();
			}
			@Pc(378) int local378 = 0;
			if ((local351 & 0x4) != 0) {
				local378 = local27.method5103();
			}
			this.anIntArray530[local346] = local353 + local340;
			this.anIntArray527[local346] = local342 + local365;
			this.anIntArray529[local346] = local344 + local378;
			local342 = this.anIntArray527[local346];
			local340 = this.anIntArray530[local346];
			local344 = this.anIntArray529[local346];
			if (local73 == 1) {
				this.anIntArray531[local346] = local32.method5115();
			}
		}
		local12.anInt5731 = local167;
		local17.anInt5731 = local129;
		local22.anInt5731 = local109;
		local27.anInt5731 = local149;
		local32.anInt5731 = local119;
		for (local351 = 0; local351 < this.anInt5472; local351++) {
			this.aShortArray101[local351] = (short) local12.method5106();
			if (local57 == 1) {
				local353 = local17.method5115();
				if ((local353 & 0x1) == 1) {
					this.aByteArray83[local351] = 1;
					local5 = true;
				} else {
					this.aByteArray83[local351] = 0;
				}
				if ((local353 & 0x2) == 2) {
					this.aByteArray79[local351] = (byte) (local353 >> 2);
					this.aShortArray100[local351] = this.aShortArray101[local351];
					this.aShortArray101[local351] = 127;
					if (this.aShortArray100[local351] != -1) {
						local7 = true;
					}
				} else {
					this.aByteArray79[local351] = -1;
					this.aShortArray100[local351] = -1;
				}
			}
			if (local61 == 255) {
				this.aByteArray81[local351] = local22.method5098();
			}
			if (local65 == 1) {
				this.aByteArray76[local351] = local27.method5098();
			}
			if (local69 == 1) {
				this.anIntArray528[local351] = local32.method5115();
			}
		}
		this.anInt5491 = -1;
		local12.anInt5731 = local161;
		local17.anInt5731 = local102;
		@Pc(584) short local584 = 0;
		@Pc(586) short local586 = 0;
		@Pc(588) short local588 = 0;
		@Pc(590) short local590 = 0;
		@Pc(597) int local597;
		for (@Pc(592) int local592 = 0; local592 < this.anInt5472; local592++) {
			local597 = local17.method5115();
			if (local597 == 1) {
				local584 = (short) (local590 + local12.method5103());
				local586 = (short) (local12.method5103() + local584);
				local588 = (short) (local586 + local12.method5103());
				local590 = local588;
				this.aShortArray99[local592] = local584;
				this.aShortArray102[local592] = local586;
				this.aShortArray97[local592] = local588;
				if (local584 > this.anInt5491) {
					this.anInt5491 = local584;
				}
				if (local586 > this.anInt5491) {
					this.anInt5491 = local586;
				}
				if (this.anInt5491 < local588) {
					this.anInt5491 = local588;
				}
			}
			if (local597 == 2) {
				local586 = local588;
				local588 = (short) (local12.method5103() + local590);
				this.aShortArray99[local592] = local584;
				local590 = local588;
				this.aShortArray102[local592] = local586;
				this.aShortArray97[local592] = local588;
				if (this.anInt5491 < local588) {
					this.anInt5491 = local588;
				}
			}
			if (local597 == 3) {
				local584 = local588;
				local588 = (short) (local12.method5103() + local590);
				local590 = local588;
				this.aShortArray99[local592] = local584;
				this.aShortArray102[local592] = local586;
				this.aShortArray97[local592] = local588;
				if (this.anInt5491 < local588) {
					this.anInt5491 = local588;
				}
			}
			if (local597 == 4) {
				@Pc(750) short local750 = local584;
				local584 = local586;
				local588 = (short) (local12.method5103() + local590);
				local586 = local750;
				local590 = local588;
				this.aShortArray99[local592] = local584;
				this.aShortArray102[local592] = local750;
				this.aShortArray97[local592] = local588;
				if (this.anInt5491 < local588) {
					this.anInt5491 = local588;
				}
			}
		}
		local12.anInt5731 = local176;
		this.anInt5491++;
		for (local597 = 0; local597 < this.anInt5487; local597++) {
			this.aByteArray80[local597] = 0;
			this.aShortArray95[local597] = (short) local12.method5106();
			this.aShortArray94[local597] = (short) local12.method5106();
			this.aShortArray106[local597] = (short) local12.method5106();
		}
		if (this.aByteArray79 != null) {
			@Pc(845) boolean local845 = false;
			for (@Pc(847) int local847 = 0; local847 < this.anInt5472; local847++) {
				@Pc(855) int local855 = this.aByteArray79[local847] & 0xFF;
				if (local855 != 255) {
					if ((this.aShortArray95[local855] & 0xFFFF) == this.aShortArray99[local847] && (this.aShortArray94[local855] & 0xFFFF) == this.aShortArray102[local847] && this.aShortArray97[local847] == (this.aShortArray106[local855] & 0xFFFF)) {
						this.aByteArray79[local847] = -1;
					} else {
						local845 = true;
					}
				}
			}
			if (!local845) {
				this.aByteArray79 = null;
			}
		}
		if (!local7) {
			this.aShortArray100 = null;
		}
		if (!local5) {
			this.aByteArray83 = null;
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(SSB)V")
	public void method4858(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt5472; local11++) {
			if (this.aShortArray101[local11] == arg0) {
				this.aShortArray101[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ISILclient!ri;)I")
	private int method4859(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(3) Class177 arg2) {
		@Pc(8) int local8 = arg2.anIntArray530[arg0];
		@Pc(13) int local13 = arg2.anIntArray527[arg0];
		@Pc(18) int local18 = arg2.anIntArray529[arg0];
		for (@Pc(25) int local25 = 0; local25 < this.anInt5479; local25++) {
			if (this.anIntArray530[local25] == local8 && this.anIntArray527[local25] == local13 && this.anIntArray529[local25] == local18) {
				this.aShortArray96[local25] |= arg1;
				return local25;
			}
		}
		this.anIntArray530[this.anInt5479] = local8;
		this.anIntArray527[this.anInt5479] = local13;
		this.anIntArray529[this.anInt5479] = local18;
		this.aShortArray96[this.anInt5479] = arg1;
		this.anIntArray531[this.anInt5479] = arg2.anIntArray531 == null ? -1 : arg2.anIntArray531[arg0];
		return this.anInt5479++;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)[[I")
	public int[][] method4860() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt5491; local12++) {
			@Pc(19) int local19 = this.anIntArray531[local12];
			if (local19 >= 0) {
				@Pc(25) int local25 = local8[local19]++;
				if (local10 < local19) {
					local10 = local19;
				}
			}
		}
		@Pc(57) int[][] local57 = new int[local10 + 1][];
		for (@Pc(59) int local59 = 0; local59 <= local10; local59++) {
			local57[local59] = new int[local8[local59]];
			local8[local59] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt5491; local78++) {
			@Pc(85) int local85 = this.anIntArray531[local78];
			if (local85 >= 0) {
				local57[local85][local8[local85]++] = local78;
			}
		}
		return local57;
	}
}
