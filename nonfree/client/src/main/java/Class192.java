import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class192 {

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "[S")
	public short[] aShortArray87;

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[S")
	public short[] aShortArray88;

	@OriginalMember(owner = "client!tr", name = "h", descriptor = "[S")
	public short[] aShortArray89;

	@OriginalMember(owner = "client!tr", name = "i", descriptor = "[B")
	public byte[] aByteArray77;

	@OriginalMember(owner = "client!tr", name = "j", descriptor = "[I")
	public int[] anIntArray461;

	@OriginalMember(owner = "client!tr", name = "k", descriptor = "[S")
	public short[] aShortArray90;

	@OriginalMember(owner = "client!tr", name = "l", descriptor = "[S")
	public short[] aShortArray91;

	@OriginalMember(owner = "client!tr", name = "n", descriptor = "[B")
	public byte[] aByteArray78;

	@OriginalMember(owner = "client!tr", name = "q", descriptor = "[S")
	public short[] aShortArray92;

	@OriginalMember(owner = "client!tr", name = "s", descriptor = "[B")
	public byte[] aByteArray79;

	@OriginalMember(owner = "client!tr", name = "t", descriptor = "[B")
	public byte[] aByteArray80;

	@OriginalMember(owner = "client!tr", name = "u", descriptor = "[B")
	public byte[] aByteArray81;

	@OriginalMember(owner = "client!tr", name = "v", descriptor = "[S")
	public short[] aShortArray93;

	@OriginalMember(owner = "client!tr", name = "w", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!tr", name = "y", descriptor = "[S")
	public short[] aShortArray94;

	@OriginalMember(owner = "client!tr", name = "B", descriptor = "[Lclient!dj;")
	public Class44[] aClass44Array3;

	@OriginalMember(owner = "client!tr", name = "C", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!tr", name = "D", descriptor = "[I")
	public int[] anIntArray463;

	@OriginalMember(owner = "client!tr", name = "G", descriptor = "[B")
	public byte[] aByteArray83;

	@OriginalMember(owner = "client!tr", name = "H", descriptor = "[B")
	public byte[] aByteArray84;

	@OriginalMember(owner = "client!tr", name = "J", descriptor = "[I")
	public int[] anIntArray464;

	@OriginalMember(owner = "client!tr", name = "K", descriptor = "[S")
	public short[] aShortArray95;

	@OriginalMember(owner = "client!tr", name = "M", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!tr", name = "O", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!tr", name = "P", descriptor = "[S")
	public short[] aShortArray98;

	@OriginalMember(owner = "client!tr", name = "R", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!tr", name = "S", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!tr", name = "T", descriptor = "[Lclient!qh;")
	public Class161[] aClass161Array3;

	@OriginalMember(owner = "client!tr", name = "U", descriptor = "[I")
	public int[] anIntArray465;

	@OriginalMember(owner = "client!tr", name = "X", descriptor = "[S")
	public short[] aShortArray99;

	@OriginalMember(owner = "client!tr", name = "o", descriptor = "I")
	public int anInt6280 = 0;

	@OriginalMember(owner = "client!tr", name = "L", descriptor = "B")
	public byte aByte66 = 0;

	@OriginalMember(owner = "client!tr", name = "A", descriptor = "I")
	public int anInt6285 = 0;

	@OriginalMember(owner = "client!tr", name = "m", descriptor = "I")
	public int anInt6279 = 0;

	@OriginalMember(owner = "client!tr", name = "N", descriptor = "I")
	public int anInt6288 = 0;

	static {
		new Class93("Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.", "Unable to send abuse report - system busy.");
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "([B)V")
	public Class192(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5475(arg0);
		} else {
			this.method5464(arg0);
		}
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "(III)V")
	public Class192(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aShortArray91 = new short[arg1];
		this.aByteArray81 = new byte[arg1];
		this.aByteArray78 = new byte[arg1];
		this.aByteArray79 = new byte[arg1];
		if (arg2 > 0) {
			this.aByteArray83 = new byte[arg2];
			this.aByteArray85 = new byte[arg2];
			this.aByteArray77 = new byte[arg2];
			this.aByteArray80 = new byte[arg2];
			this.aShortArray95 = new short[arg2];
			this.aByteArray86 = new byte[arg2];
			this.aShortArray94 = new short[arg2];
			this.aByteArray84 = new byte[arg2];
			this.aShortArray92 = new short[arg2];
			this.aShortArray99 = new short[arg2];
			this.aShortArray97 = new short[arg2];
			this.aShortArray89 = new short[arg2];
		}
		this.anIntArray462 = new int[arg0];
		this.aShortArray90 = new short[arg1];
		this.anIntArray465 = new int[arg0];
		this.anIntArray461 = new int[arg1];
		this.aShortArray93 = new short[arg1];
		this.anIntArray464 = new int[arg0];
		this.aShortArray87 = new short[arg1];
		this.anIntArray463 = new int[arg0];
		this.aByteArray82 = new byte[arg1];
		this.aShortArray96 = new short[arg1];
	}

	@OriginalMember(owner = "client!tr", name = "<init>", descriptor = "([Lclient!tr;I)V")
	public Class192(@OriginalArg(0) Class192[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6288 = 0;
		this.anInt6285 = 0;
		this.anInt6280 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		@Pc(43) boolean local43 = false;
		this.aByte66 = -1;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class192 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt6288 += local54.anInt6288;
				this.anInt6285 += local54.anInt6285;
				this.anInt6280 += local54.anInt6280;
				if (local54.aClass44Array3 != null) {
					local31 += local54.aClass44Array3.length;
				}
				local33 |= local54.aByteArray78 != null;
				if (local54.aClass161Array3 != null) {
					local29 += local54.aClass161Array3.length;
				}
				local39 |= local54.aByteArray82 != null;
				local37 |= local54.aByteArray79 != null;
				if (local54.aByteArray81 == null) {
					if (this.aByte66 == -1) {
						this.aByte66 = local54.aByte66;
					}
					if (this.aByte66 != local54.aByte66) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local43 |= local54.anIntArray461 != null;
				local41 |= local54.aShortArray93 != null;
			}
		}
		if (this.anInt6280 > 0) {
			this.aShortArray97 = new short[this.anInt6280];
			this.aShortArray99 = new short[this.anInt6280];
			this.aShortArray95 = new short[this.anInt6280];
			this.aByteArray80 = new byte[this.anInt6280];
			this.aShortArray94 = new short[this.anInt6280];
			this.aByteArray77 = new byte[this.anInt6280];
			this.aByteArray83 = new byte[this.anInt6280];
			this.aByteArray84 = new byte[this.anInt6280];
			this.aByteArray86 = new byte[this.anInt6280];
			this.aShortArray92 = new short[this.anInt6280];
			this.aByteArray85 = new byte[this.anInt6280];
			this.aShortArray89 = new short[this.anInt6280];
		}
		this.anIntArray463 = new int[this.anInt6285];
		this.aShortArray90 = new short[this.anInt6288];
		if (local35) {
			this.aByteArray81 = new byte[this.anInt6288];
		}
		this.aShortArray88 = new short[this.anInt6288];
		this.aShortArray96 = new short[this.anInt6288];
		if (local29 > 0) {
			this.aClass161Array3 = new Class161[local29];
		}
		if (local39) {
			this.aByteArray82 = new byte[this.anInt6288];
		}
		this.anIntArray464 = new int[this.anInt6285];
		this.anIntArray465 = new int[this.anInt6285];
		this.aShortArray87 = new short[this.anInt6288];
		if (local43) {
			this.anIntArray461 = new int[this.anInt6288];
		}
		this.anIntArray462 = new int[this.anInt6285];
		if (local31 > 0) {
			this.aClass44Array3 = new Class44[local31];
		}
		if (local41) {
			this.aShortArray93 = new short[this.anInt6288];
		}
		this.aShortArray98 = new short[this.anInt6285];
		this.aShortArray91 = new short[this.anInt6288];
		if (local33) {
			this.aByteArray78 = new byte[this.anInt6288];
		}
		if (local37) {
			this.aByteArray79 = new byte[this.anInt6288];
		}
		this.anInt6285 = 0;
		local31 = 0;
		local29 = 0;
		this.anInt6288 = 0;
		this.anInt6280 = 0;
		@Pc(564) int local564;
		@Pc(575) int local575;
		for (@Pc(359) int local359 = 0; local359 < arg1; local359++) {
			@Pc(366) short local366 = (short) (0x1 << local359);
			@Pc(370) Class192 local370 = arg0[local359];
			if (local370 != null) {
				for (@Pc(374) int local374 = 0; local374 < local370.anInt6288; local374++) {
					if (local33 && local370.aByteArray78 != null) {
						this.aByteArray78[this.anInt6288] = local370.aByteArray78[local374];
					}
					if (local35) {
						if (local370.aByteArray81 == null) {
							this.aByteArray81[this.anInt6288] = local370.aByte66;
						} else {
							this.aByteArray81[this.anInt6288] = local370.aByteArray81[local374];
						}
					}
					if (local37 && local370.aByteArray79 != null) {
						this.aByteArray79[this.anInt6288] = local370.aByteArray79[local374];
					}
					if (local41) {
						if (local370.aShortArray93 == null) {
							this.aShortArray93[this.anInt6288] = -1;
						} else {
							this.aShortArray93[this.anInt6288] = local370.aShortArray93[local374];
						}
					}
					if (local43) {
						if (local370.anIntArray461 == null) {
							this.anIntArray461[this.anInt6288] = -1;
						} else {
							this.anIntArray461[this.anInt6288] = local370.anIntArray461[local374];
						}
					}
					this.aShortArray96[this.anInt6288] = (short) this.method5469(local370, local370.aShortArray96[local374], local366);
					this.aShortArray87[this.anInt6288] = (short) this.method5469(local370, local370.aShortArray87[local374], local366);
					this.aShortArray90[this.anInt6288] = (short) this.method5469(local370, local370.aShortArray90[local374], local366);
					this.aShortArray88[this.anInt6288] = local366;
					this.aShortArray91[this.anInt6288] = local370.aShortArray91[local374];
					this.anInt6288++;
				}
				@Pc(551) int local551;
				if (local370.aClass161Array3 != null) {
					for (local551 = 0; local551 < local370.aClass161Array3.length; local551++) {
						local564 = this.method5469(local370, local370.aClass161Array3[local551].anInt5027, local366);
						local575 = this.method5469(local370, local370.aClass161Array3[local551].anInt5023, local366);
						@Pc(586) int local586 = this.method5469(local370, local370.aClass161Array3[local551].anInt5022, local366);
						this.aClass161Array3[local29] = new Class161(local370.aClass161Array3[local551].anInt5025, local564, local575, local586, local370.aClass161Array3[local551].aByte49);
						local29++;
					}
				}
				if (local370.aClass44Array3 != null) {
					for (local551 = 0; local551 < local370.aClass44Array3.length; local551++) {
						local564 = this.method5469(local370, local370.aClass44Array3[local551].anInt1283, local366);
						this.aClass44Array3[local31] = new Class44(local370.aClass44Array3[local551].anInt1284, local564);
						local31++;
					}
				}
			}
		}
		@Pc(661) int local661 = 0;
		this.anInt6279 = this.anInt6285;
		for (@Pc(667) int local667 = 0; local667 < arg1; local667++) {
			@Pc(674) short local674 = (short) (0x1 << local667);
			@Pc(678) Class192 local678 = arg0[local667];
			if (local678 != null) {
				for (local564 = 0; local564 < local678.anInt6288; local564++) {
					if (local39) {
						this.aByteArray82[local661++] = (byte) (local678.aByteArray82 == null || local678.aByteArray82[local564] == -1 ? -1 : local678.aByteArray82[local564] + this.anInt6280);
					}
				}
				for (local575 = 0; local575 < local678.anInt6280; local575++) {
					@Pc(730) byte local730 = this.aByteArray77[this.anInt6280] = local678.aByteArray77[local575];
					if (local730 == 0) {
						this.aShortArray94[this.anInt6280] = (short) this.method5469(local678, local678.aShortArray94[local575], local674);
						this.aShortArray99[this.anInt6280] = (short) this.method5469(local678, local678.aShortArray99[local575], local674);
						this.aShortArray92[this.anInt6280] = (short) this.method5469(local678, local678.aShortArray92[local575], local674);
					}
					if (local730 >= 1 && local730 <= 3) {
						this.aShortArray94[this.anInt6280] = local678.aShortArray94[local575];
						this.aShortArray99[this.anInt6280] = local678.aShortArray99[local575];
						this.aShortArray92[this.anInt6280] = local678.aShortArray92[local575];
						this.aShortArray95[this.anInt6280] = local678.aShortArray95[local575];
						this.aShortArray97[this.anInt6280] = local678.aShortArray97[local575];
						this.aShortArray89[this.anInt6280] = local678.aShortArray89[local575];
						this.aByteArray86[this.anInt6280] = local678.aByteArray86[local575];
						this.aByteArray83[this.anInt6280] = local678.aByteArray83[local575];
						this.aByteArray84[this.anInt6280] = local678.aByteArray84[local575];
					}
					if (local730 == 2) {
						this.aByteArray80[this.anInt6280] = local678.aByteArray80[local575];
						this.aByteArray85[this.anInt6280] = local678.aByteArray85[local575];
					}
					this.anInt6280++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(B[B)V")
	private void method5464(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class2_Sub10 local14 = new Class2_Sub10(arg0);
		@Pc(19) Class2_Sub10 local19 = new Class2_Sub10(arg0);
		@Pc(24) Class2_Sub10 local24 = new Class2_Sub10(arg0);
		@Pc(29) Class2_Sub10 local29 = new Class2_Sub10(arg0);
		@Pc(34) Class2_Sub10 local34 = new Class2_Sub10(arg0);
		local14.anInt4807 = arg0.length - 18;
		this.anInt6285 = local14.method4464();
		this.anInt6288 = local14.method4464();
		this.anInt6280 = local14.method4421();
		@Pc(59) int local59 = local14.method4421();
		@Pc(63) int local63 = local14.method4421();
		@Pc(67) int local67 = local14.method4421();
		@Pc(79) int local79 = local14.method4421();
		@Pc(83) int local83 = local14.method4421();
		@Pc(87) int local87 = local14.method4464();
		@Pc(91) int local91 = local14.method4464();
		@Pc(95) int local95 = local14.method4464();
		@Pc(99) int local99 = local14.method4464();
		@Pc(108) int local108 = this.anInt6285;
		@Pc(110) int local110 = local108;
		local108 += this.anInt6288;
		@Pc(117) int local117 = local108;
		if (local63 == 255) {
			local108 += this.anInt6288;
		}
		@Pc(127) int local127 = local108;
		if (local79 == 1) {
			local108 += this.anInt6288;
		}
		@Pc(137) int local137 = local108;
		if (local59 == 1) {
			local108 += this.anInt6288;
		}
		@Pc(147) int local147 = local108;
		if (local83 == 1) {
			local108 += this.anInt6285;
		}
		@Pc(157) int local157 = local108;
		if (local67 == 1) {
			local108 += this.anInt6288;
		}
		@Pc(167) int local167 = local108;
		local108 += local99;
		@Pc(173) int local173 = local108;
		local108 += this.anInt6288 * 2;
		@Pc(182) int local182 = local108;
		local108 += this.anInt6280 * 6;
		@Pc(191) int local191 = local108;
		local108 += local87;
		@Pc(197) int local197 = local108;
		local108 += local91;
		this.aShortArray91 = new short[this.anInt6288];
		if (local79 == 1) {
			this.anIntArray461 = new int[this.anInt6288];
		}
		if (local67 == 1) {
			this.aByteArray79 = new byte[this.anInt6288];
		}
		local14.anInt4807 = 0;
		this.aShortArray90 = new short[this.anInt6288];
		if (this.anInt6280 > 0) {
			this.aShortArray94 = new short[this.anInt6280];
			this.aByteArray77 = new byte[this.anInt6280];
			this.aShortArray99 = new short[this.anInt6280];
			this.aShortArray92 = new short[this.anInt6280];
		}
		this.anIntArray464 = new int[this.anInt6285];
		this.aShortArray96 = new short[this.anInt6288];
		if (local83 == 1) {
			this.anIntArray462 = new int[this.anInt6285];
		}
		if (local59 == 1) {
			this.aShortArray93 = new short[this.anInt6288];
			this.aByteArray82 = new byte[this.anInt6288];
			this.aByteArray78 = new byte[this.anInt6288];
		}
		if (local63 == 255) {
			this.aByteArray81 = new byte[this.anInt6288];
		} else {
			this.aByte66 = (byte) local63;
		}
		this.anIntArray463 = new int[this.anInt6285];
		this.anIntArray465 = new int[this.anInt6285];
		this.aShortArray87 = new short[this.anInt6288];
		local19.anInt4807 = local191;
		local24.anInt4807 = local197;
		local29.anInt4807 = local108;
		local34.anInt4807 = local147;
		@Pc(343) int local343 = 0;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(355) int local355;
		@Pc(357) int local357;
		for (@Pc(349) int local349 = 0; local349 < this.anInt6285; local349++) {
			local355 = local14.method4421();
			local357 = 0;
			if ((local355 & 0x1) != 0) {
				local357 = local19.method4424();
			}
			@Pc(370) int local370 = 0;
			if ((local355 & 0x2) != 0) {
				local370 = local24.method4424();
			}
			@Pc(380) int local380 = 0;
			if ((local355 & 0x4) != 0) {
				local380 = local29.method4424();
			}
			this.anIntArray463[local349] = local357 + local343;
			this.anIntArray464[local349] = local370 + local345;
			this.anIntArray465[local349] = local347 + local380;
			local347 = this.anIntArray465[local349];
			local343 = this.anIntArray463[local349];
			local345 = this.anIntArray464[local349];
			if (local83 == 1) {
				this.anIntArray462[local349] = local34.method4421();
			}
		}
		local14.anInt4807 = local173;
		local19.anInt4807 = local137;
		local24.anInt4807 = local117;
		local29.anInt4807 = local157;
		local34.anInt4807 = local127;
		for (local355 = 0; local355 < this.anInt6288; local355++) {
			this.aShortArray91[local355] = (short) local14.method4464();
			if (local59 == 1) {
				local357 = local19.method4421();
				if ((local357 & 0x1) == 1) {
					local7 = true;
					this.aByteArray78[local355] = 1;
				} else {
					this.aByteArray78[local355] = 0;
				}
				if ((local357 & 0x2) == 2) {
					this.aByteArray82[local355] = (byte) (local357 >> 2);
					this.aShortArray93[local355] = this.aShortArray91[local355];
					this.aShortArray91[local355] = 127;
					if (this.aShortArray93[local355] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray82[local355] = -1;
					this.aShortArray93[local355] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray81[local355] = local24.method4436();
			}
			if (local67 == 1) {
				this.aByteArray79[local355] = local29.method4436();
			}
			if (local79 == 1) {
				this.anIntArray461[local355] = local34.method4421();
			}
		}
		this.anInt6279 = -1;
		local14.anInt4807 = local167;
		local19.anInt4807 = local110;
		@Pc(594) short local594 = 0;
		@Pc(596) short local596 = 0;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(608) int local608;
		for (@Pc(602) int local602 = 0; local602 < this.anInt6288; local602++) {
			local608 = local19.method4421();
			if (local608 == 1) {
				local594 = (short) (local14.method4424() + local600);
				local596 = (short) (local594 + local14.method4424());
				local598 = (short) (local596 + local14.method4424());
				this.aShortArray96[local602] = local594;
				local600 = local598;
				this.aShortArray87[local602] = local596;
				this.aShortArray90[local602] = local598;
				if (local594 > this.anInt6279) {
					this.anInt6279 = local594;
				}
				if (local596 > this.anInt6279) {
					this.anInt6279 = local596;
				}
				if (local598 > this.anInt6279) {
					this.anInt6279 = local598;
				}
			}
			if (local608 == 2) {
				local596 = local598;
				local598 = (short) (local14.method4424() + local600);
				local600 = local598;
				this.aShortArray96[local602] = local594;
				this.aShortArray87[local602] = local596;
				this.aShortArray90[local602] = local598;
				if (this.anInt6279 < local598) {
					this.anInt6279 = local598;
				}
			}
			if (local608 == 3) {
				local594 = local598;
				local598 = (short) (local600 + local14.method4424());
				this.aShortArray96[local602] = local594;
				local600 = local598;
				this.aShortArray87[local602] = local596;
				this.aShortArray90[local602] = local598;
				if (this.anInt6279 < local598) {
					this.anInt6279 = local598;
				}
			}
			if (local608 == 4) {
				@Pc(765) short local765 = local594;
				local594 = local596;
				local598 = (short) (local600 + local14.method4424());
				local596 = local765;
				this.aShortArray96[local602] = local594;
				local600 = local598;
				this.aShortArray87[local602] = local765;
				this.aShortArray90[local602] = local598;
				if (local598 > this.anInt6279) {
					this.anInt6279 = local598;
				}
			}
		}
		local14.anInt4807 = local182;
		this.anInt6279++;
		for (local608 = 0; local608 < this.anInt6280; local608++) {
			this.aByteArray77[local608] = 0;
			this.aShortArray94[local608] = (short) local14.method4464();
			this.aShortArray99[local608] = (short) local14.method4464();
			this.aShortArray92[local608] = (short) local14.method4464();
		}
		if (this.aByteArray82 != null) {
			@Pc(861) boolean local861 = false;
			for (@Pc(863) int local863 = 0; local863 < this.anInt6288; local863++) {
				@Pc(872) int local872 = this.aByteArray82[local863] & 0xFF;
				if (local872 != 255) {
					if (this.aShortArray96[local863] == (this.aShortArray94[local872] & 0xFFFF) && (this.aShortArray99[local872] & 0xFFFF) == this.aShortArray87[local863] && this.aShortArray90[local863] == (this.aShortArray92[local872] & 0xFFFF)) {
						this.aByteArray82[local863] = -1;
					} else {
						local861 = true;
					}
				}
			}
			if (!local861) {
				this.aByteArray82 = null;
			}
		}
		if (!local7) {
			this.aByteArray78 = null;
		}
		if (!local9) {
			this.aShortArray93 = null;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIZI)V")
	public void method5465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(23) int local23;
		@Pc(41) int local41;
		if (arg1 != 0) {
			local17 = Class24.anIntArray35[arg1];
			local21 = Class24.anIntArray36[arg1];
			for (local23 = 0; local23 < this.anInt6285; local23++) {
				local41 = this.anIntArray464[local23] * local17 + local21 * this.anIntArray463[local23] >> 15;
				this.anIntArray464[local23] = this.anIntArray464[local23] * local21 - local17 * this.anIntArray463[local23] >> 15;
				this.anIntArray463[local23] = local41;
			}
		}
		if (arg0 != 0) {
			local17 = Class24.anIntArray35[arg0];
			local21 = Class24.anIntArray36[arg0];
			for (local23 = 0; local23 < this.anInt6285; local23++) {
				local41 = local21 * this.anIntArray464[local23] - this.anIntArray465[local23] * local17 >> 15;
				this.anIntArray465[local23] = local21 * this.anIntArray465[local23] + this.anIntArray464[local23] * local17 >> 15;
				this.anIntArray464[local23] = local41;
			}
		}
		if (arg2 == 0) {
			return;
		}
		local17 = Class24.anIntArray35[arg2];
		local21 = Class24.anIntArray36[arg2];
		for (local23 = 0; local23 < this.anInt6285; local23++) {
			local41 = this.anIntArray465[local23] * local17 + local21 * this.anIntArray463[local23] >> 15;
			this.anIntArray465[local23] = this.anIntArray465[local23] * local21 - local17 * this.anIntArray463[local23] >> 15;
			this.anIntArray463[local23] = local41;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIII)I")
	public int method5466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6285; local7++) {
			if (arg1 == this.anIntArray463[local7] && this.anIntArray464[local7] == arg0 && arg2 == this.anIntArray465[local7]) {
				return local7;
			}
		}
		this.anIntArray463[this.anInt6285] = arg1;
		this.anIntArray464[this.anInt6285] = arg0;
		this.anIntArray465[this.anInt6285] = arg2;
		this.anInt6279 = this.anInt6285 + 1;
		return this.anInt6285++;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BBBSZSSSSS)B")
	public byte method5467() {
		if (this.anInt6280 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray77[this.anInt6280] = 3;
		this.aShortArray94[this.anInt6280] = 0;
		this.aShortArray99[this.anInt6280] = 32767;
		this.aShortArray92[this.anInt6280] = 0;
		this.aShortArray95[this.anInt6280] = 1024;
		this.aShortArray97[this.anInt6280] = 1024;
		this.aShortArray89[this.anInt6280] = 1024;
		this.aByteArray86[this.anInt6280] = 0;
		this.aByteArray83[this.anInt6280] = 0;
		this.aByteArray84[this.anInt6280] = 0;
		return (byte) this.anInt6280++;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!tr;IIS)I")
	private int method5469(@OriginalArg(0) Class192 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) short arg2) {
		@Pc(10) int local10 = arg0.anIntArray463[arg1];
		@Pc(15) int local15 = arg0.anIntArray464[arg1];
		@Pc(20) int local20 = arg0.anIntArray465[arg1];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6285; local22++) {
			if (this.anIntArray463[local22] == local10 && local15 == this.anIntArray464[local22] && this.anIntArray465[local22] == local20) {
				this.aShortArray98[local22] |= arg2;
				return local22;
			}
		}
		this.anIntArray463[this.anInt6285] = local10;
		this.anIntArray464[this.anInt6285] = local15;
		this.anIntArray465[this.anInt6285] = local20;
		this.aShortArray98[this.anInt6285] = arg2;
		this.anIntArray462[this.anInt6285] = arg0.anIntArray462 == null ? -1 : arg0.anIntArray462[arg1];
		return this.anInt6285++;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ISBBISIBZ)I")
	public int method5470(@OriginalArg(0) int arg0, @OriginalArg(1) short arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) short arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7) {
		this.aShortArray96[this.anInt6288] = (short) arg0;
		this.aShortArray87[this.anInt6288] = (short) arg4;
		this.aShortArray90[this.anInt6288] = (short) arg6;
		this.aByteArray78[this.anInt6288] = arg7;
		this.aByteArray82[this.anInt6288] = arg2;
		this.aShortArray91[this.anInt6288] = arg1;
		this.aByteArray79[this.anInt6288] = arg3;
		this.aShortArray93[this.anInt6288] = arg5;
		return this.anInt6288++;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIZ)V")
	public void method5471(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(3) int local3 = 0; local3 < this.anInt6285; local3++) {
			this.anIntArray463[local3] += arg2;
			this.anIntArray464[local3] += arg1;
			this.anIntArray465[local3] += arg0;
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BSS)V")
	public void method5472(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		if (this.aShortArray93 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt6288; local11++) {
			if (arg1 == this.aShortArray93[local11]) {
				this.aShortArray93[local11] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "(B)[[I")
	public int[][] method5474() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6288; local12++) {
			@Pc(19) int local19 = this.anIntArray461[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(47) int[][] local47 = new int[local10 + 1][];
		for (@Pc(55) int local55 = 0; local55 <= local10; local55++) {
			local47[local55] = new int[local8[local55]];
			local8[local55] = 0;
		}
		for (@Pc(78) int local78 = 0; local78 < this.anInt6288; local78++) {
			@Pc(85) int local85 = this.anIntArray461[local78];
			if (local85 >= 0) {
				local47[local85][local8[local85]++] = local78;
			}
		}
		return local47;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "([BI)V")
	private void method5475(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class2_Sub10 local10 = new Class2_Sub10(arg0);
		@Pc(15) Class2_Sub10 local15 = new Class2_Sub10(arg0);
		@Pc(20) Class2_Sub10 local20 = new Class2_Sub10(arg0);
		@Pc(25) Class2_Sub10 local25 = new Class2_Sub10(arg0);
		@Pc(30) Class2_Sub10 local30 = new Class2_Sub10(arg0);
		@Pc(35) Class2_Sub10 local35 = new Class2_Sub10(arg0);
		@Pc(40) Class2_Sub10 local40 = new Class2_Sub10(arg0);
		local10.anInt4807 = arg0.length - 23;
		this.anInt6285 = local10.method4464();
		this.anInt6288 = local10.method4464();
		this.anInt6280 = local10.method4421();
		@Pc(65) int local65 = local10.method4421();
		@Pc(76) boolean local76 = (local65 & 0x1) == 1;
		@Pc(85) boolean local85 = (local65 & 0x2) == 2;
		@Pc(91) int local91 = local10.method4421();
		@Pc(95) int local95 = local10.method4421();
		@Pc(101) int local101 = local10.method4421();
		@Pc(105) int local105 = local10.method4421();
		@Pc(109) int local109 = local10.method4421();
		@Pc(113) int local113 = local10.method4464();
		@Pc(117) int local117 = local10.method4464();
		@Pc(121) int local121 = local10.method4464();
		@Pc(125) int local125 = local10.method4464();
		@Pc(129) int local129 = local10.method4464();
		@Pc(131) int local131 = 0;
		@Pc(133) int local133 = 0;
		@Pc(135) int local135 = 0;
		@Pc(151) int local151;
		if (this.anInt6280 > 0) {
			this.aByteArray77 = new byte[this.anInt6280];
			local10.anInt4807 = 0;
			for (local151 = 0; local151 < this.anInt6280; local151++) {
				@Pc(162) byte local162 = this.aByteArray77[local151] = local10.method4436();
				if (local162 == 0) {
					local131++;
				}
				if (local162 >= 1 && local162 <= 3) {
					local133++;
				}
				if (local162 == 2) {
					local135++;
				}
			}
		}
		local151 = this.anInt6280;
		@Pc(195) int local195 = local151;
		local151 += this.anInt6285;
		@Pc(202) int local202 = local151;
		if (local76) {
			local151 += this.anInt6288;
		}
		@Pc(211) int local211 = local151;
		local151 += this.anInt6288;
		@Pc(218) int local218 = local151;
		if (local91 == 255) {
			local151 += this.anInt6288;
		}
		@Pc(230) int local230 = local151;
		if (local101 == 1) {
			local151 += this.anInt6288;
		}
		@Pc(240) int local240 = local151;
		if (local109 == 1) {
			local151 += this.anInt6285;
		}
		@Pc(250) int local250 = local151;
		if (local95 == 1) {
			local151 += this.anInt6288;
		}
		@Pc(262) int local262 = local151;
		local151 += local125;
		@Pc(268) int local268 = local151;
		if (local105 == 1) {
			local151 += this.anInt6288 * 2;
		}
		@Pc(280) int local280 = local151;
		local151 += local129;
		@Pc(286) int local286 = local151;
		local151 += this.anInt6288 * 2;
		@Pc(295) int local295 = local151;
		local151 += local113;
		@Pc(301) int local301 = local151;
		local151 += local117;
		@Pc(307) int local307 = local151;
		local151 += local121;
		@Pc(313) int local313 = local151;
		local151 += local131 * 6;
		@Pc(321) int local321 = local151;
		local151 += local133 * 6;
		@Pc(329) int local329 = local151;
		local151 += local133 * 6;
		@Pc(337) int local337 = local151;
		local151 += local133;
		@Pc(343) int local343 = local151;
		local151 += local133;
		@Pc(349) int local349 = local151;
		local151 += local135 * 2 + local133;
		if (local76) {
			this.aByteArray78 = new byte[this.anInt6288];
		}
		if (local105 == 1) {
			this.aShortArray93 = new short[this.anInt6288];
		}
		this.anIntArray464 = new int[this.anInt6285];
		if (local109 == 1) {
			this.anIntArray462 = new int[this.anInt6285];
		}
		if (local101 == 1) {
			this.anIntArray461 = new int[this.anInt6288];
		}
		local10.anInt4807 = local195;
		if (local91 == 255) {
			this.aByteArray81 = new byte[this.anInt6288];
		} else {
			this.aByte66 = (byte) local91;
		}
		this.aShortArray87 = new short[this.anInt6288];
		this.aShortArray96 = new short[this.anInt6288];
		this.aShortArray91 = new short[this.anInt6288];
		this.aShortArray90 = new short[this.anInt6288];
		if (this.anInt6280 > 0) {
			if (local135 > 0) {
				this.aByteArray85 = new byte[local135];
				this.aByteArray80 = new byte[local135];
			}
			this.aShortArray92 = new short[this.anInt6280];
			this.aShortArray99 = new short[this.anInt6280];
			if (local133 > 0) {
				this.aByteArray84 = new byte[local133];
				this.aByteArray86 = new byte[local133];
				this.aByteArray83 = new byte[local133];
				this.aShortArray97 = new short[local133];
				this.aShortArray89 = new short[local133];
				this.aShortArray95 = new short[local133];
			}
			this.aShortArray94 = new short[this.anInt6280];
		}
		this.anIntArray463 = new int[this.anInt6285];
		this.anIntArray465 = new int[this.anInt6285];
		if (local105 == 1 && this.anInt6280 > 0) {
			this.aByteArray82 = new byte[this.anInt6288];
		}
		if (local95 == 1) {
			this.aByteArray79 = new byte[this.anInt6288];
		}
		local15.anInt4807 = local295;
		local20.anInt4807 = local301;
		local25.anInt4807 = local307;
		local30.anInt4807 = local240;
		@Pc(534) int local534 = 0;
		@Pc(536) int local536 = 0;
		@Pc(538) int local538 = 0;
		@Pc(546) int local546;
		for (@Pc(540) int local540 = 0; local540 < this.anInt6285; local540++) {
			local546 = local10.method4421();
			@Pc(548) int local548 = 0;
			if ((local546 & 0x1) != 0) {
				local548 = local15.method4424();
			}
			@Pc(561) int local561 = 0;
			if ((local546 & 0x2) != 0) {
				local561 = local20.method4424();
			}
			@Pc(574) int local574 = 0;
			if ((local546 & 0x4) != 0) {
				local574 = local25.method4424();
			}
			this.anIntArray463[local540] = local534 + local548;
			this.anIntArray464[local540] = local536 + local561;
			this.anIntArray465[local540] = local538 + local574;
			local538 = this.anIntArray465[local540];
			local536 = this.anIntArray464[local540];
			local534 = this.anIntArray463[local540];
			if (local109 == 1) {
				this.anIntArray462[local540] = local30.method4421();
			}
		}
		local10.anInt4807 = local286;
		local15.anInt4807 = local202;
		local20.anInt4807 = local218;
		local25.anInt4807 = local250;
		local30.anInt4807 = local230;
		local35.anInt4807 = local268;
		local40.anInt4807 = local280;
		for (local546 = 0; local546 < this.anInt6288; local546++) {
			this.aShortArray91[local546] = (short) local10.method4464();
			if (local76) {
				this.aByteArray78[local546] = local15.method4436();
			}
			if (local91 == 255) {
				this.aByteArray81[local546] = local20.method4436();
			}
			if (local95 == 1) {
				this.aByteArray79[local546] = local25.method4436();
			}
			if (local101 == 1) {
				this.anIntArray461[local546] = local30.method4421();
			}
			if (local105 == 1) {
				this.aShortArray93[local546] = (short) (local35.method4464() - 1);
			}
			if (this.aByteArray82 != null) {
				if (this.aShortArray93[local546] == -1) {
					this.aByteArray82[local546] = -1;
				} else {
					this.aByteArray82[local546] = (byte) (local40.method4421() - 1);
				}
			}
		}
		this.anInt6279 = -1;
		local10.anInt4807 = local262;
		local15.anInt4807 = local211;
		@Pc(772) short local772 = 0;
		@Pc(774) short local774 = 0;
		@Pc(776) short local776 = 0;
		@Pc(778) short local778 = 0;
		@Pc(786) int local786;
		for (@Pc(780) int local780 = 0; local780 < this.anInt6288; local780++) {
			local786 = local15.method4421();
			if (local786 == 1) {
				local772 = (short) (local778 + local10.method4424());
				local774 = (short) (local772 + local10.method4424());
				local776 = (short) (local774 + local10.method4424());
				local778 = local776;
				this.aShortArray96[local780] = local772;
				this.aShortArray87[local780] = local774;
				this.aShortArray90[local780] = local776;
				if (local772 > this.anInt6279) {
					this.anInt6279 = local772;
				}
				if (local774 > this.anInt6279) {
					this.anInt6279 = local774;
				}
				if (local776 > this.anInt6279) {
					this.anInt6279 = local776;
				}
			}
			if (local786 == 2) {
				local774 = local776;
				local776 = (short) (local10.method4424() + local778);
				this.aShortArray96[local780] = local772;
				local778 = local776;
				this.aShortArray87[local780] = local774;
				this.aShortArray90[local780] = local776;
				if (this.anInt6279 < local776) {
					this.anInt6279 = local776;
				}
			}
			if (local786 == 3) {
				local772 = local776;
				local776 = (short) (local10.method4424() + local778);
				local778 = local776;
				this.aShortArray96[local780] = local772;
				this.aShortArray87[local780] = local774;
				this.aShortArray90[local780] = local776;
				if (this.anInt6279 < local776) {
					this.anInt6279 = local776;
				}
			}
			if (local786 == 4) {
				@Pc(939) short local939 = local772;
				local772 = local774;
				local774 = local939;
				local776 = (short) (local10.method4424() + local778);
				this.aShortArray96[local780] = local772;
				local778 = local776;
				this.aShortArray87[local780] = local939;
				this.aShortArray90[local780] = local776;
				if (this.anInt6279 < local776) {
					this.anInt6279 = local776;
				}
			}
		}
		this.anInt6279++;
		local10.anInt4807 = local313;
		local15.anInt4807 = local321;
		local20.anInt4807 = local329;
		local25.anInt4807 = local337;
		local30.anInt4807 = local343;
		local35.anInt4807 = local349;
		@Pc(1014) int local1014;
		for (local786 = 0; local786 < this.anInt6280; local786++) {
			local1014 = this.aByteArray77[local786] & 0xFF;
			if (local1014 == 0) {
				this.aShortArray94[local786] = (short) local10.method4464();
				this.aShortArray99[local786] = (short) local10.method4464();
				this.aShortArray92[local786] = (short) local10.method4464();
			}
			if (local1014 == 1) {
				this.aShortArray94[local786] = (short) local15.method4464();
				this.aShortArray99[local786] = (short) local15.method4464();
				this.aShortArray92[local786] = (short) local15.method4464();
				this.aShortArray95[local786] = (short) local20.method4464();
				this.aShortArray97[local786] = (short) local20.method4464();
				this.aShortArray89[local786] = (short) local20.method4464();
				this.aByteArray86[local786] = local25.method4436();
				this.aByteArray83[local786] = local30.method4436();
				this.aByteArray84[local786] = local35.method4436();
			}
			if (local1014 == 2) {
				this.aShortArray94[local786] = (short) local15.method4464();
				this.aShortArray99[local786] = (short) local15.method4464();
				this.aShortArray92[local786] = (short) local15.method4464();
				this.aShortArray95[local786] = (short) local20.method4464();
				this.aShortArray97[local786] = (short) local20.method4464();
				this.aShortArray89[local786] = (short) local20.method4464();
				this.aByteArray86[local786] = local25.method4436();
				this.aByteArray83[local786] = local30.method4436();
				this.aByteArray84[local786] = local35.method4436();
				this.aByteArray80[local786] = local35.method4436();
				this.aByteArray85[local786] = local35.method4436();
			}
			if (local1014 == 3) {
				this.aShortArray94[local786] = (short) local15.method4464();
				this.aShortArray99[local786] = (short) local15.method4464();
				this.aShortArray92[local786] = (short) local15.method4464();
				this.aShortArray95[local786] = (short) local20.method4464();
				this.aShortArray97[local786] = (short) local20.method4464();
				this.aShortArray89[local786] = (short) local20.method4464();
				this.aByteArray86[local786] = local25.method4436();
				this.aByteArray83[local786] = local30.method4436();
				this.aByteArray84[local786] = local35.method4436();
			}
		}
		if (!local85) {
			return;
		}
		local10.anInt4807 = local151;
		local1014 = local10.method4421();
		@Pc(1298) int local1298;
		@Pc(1304) int local1304;
		if (local1014 > 0) {
			this.aClass161Array3 = new Class161[local1014];
			for (local1298 = 0; local1298 < local1014; local1298++) {
				local1304 = local10.method4464();
				@Pc(1308) int local1308 = local10.method4464();
				@Pc(1316) byte local1316;
				if (local91 == 255) {
					local1316 = this.aByteArray81[local1308];
				} else {
					local1316 = (byte) local91;
				}
				this.aClass161Array3[local1298] = new Class161(local1304, this.aShortArray96[local1308], this.aShortArray87[local1308], this.aShortArray90[local1308], local1316);
			}
		}
		local1298 = local10.method4421();
		if (local1298 <= 0) {
			return;
		}
		this.aClass44Array3 = new Class44[local1298];
		for (local1304 = 0; local1304 < local1298; local1304++) {
			this.aClass44Array3[local1304] = new Class44(local10.method4464(), local10.method4464());
		}
		return;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(SIS)V")
	public void method5476(@OriginalArg(0) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6288; local7++) {
			if (arg0 == this.aShortArray91[local7]) {
				this.aShortArray91[local7] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)[[I")
	public int[][] method5477() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6279; local12++) {
			@Pc(19) int local19 = this.anIntArray462[local12];
			if (local19 >= 0) {
				if (local10 < local19) {
					local10 = local19;
				}
				@Pc(33) int local33 = local8[local19]++;
			}
		}
		@Pc(55) int[][] local55 = new int[local10 + 1][];
		for (@Pc(57) int local57 = 0; local57 <= local10; local57++) {
			local55[local57] = new int[local8[local57]];
			local8[local57] = 0;
		}
		for (@Pc(80) int local80 = 0; local80 < this.anInt6279; local80++) {
			@Pc(87) int local87 = this.anIntArray462[local80];
			if (local87 >= 0) {
				local55[local87][local8[local87]++] = local80;
			}
		}
		return local55;
	}
}
