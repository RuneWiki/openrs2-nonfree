import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class219 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "[S")
	public short[] aShortArray104;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "[I")
	public int[] anIntArray673;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "[I")
	public int[] anIntArray674;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "[S")
	public short[] aShortArray105;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "[S")
	public short[] aShortArray106;

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "[I")
	public int[] anIntArray675;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "[B")
	public byte[] aByteArray85;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "[B")
	public byte[] aByteArray86;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "[B")
	public byte[] aByteArray87;

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "[I")
	public int[] anIntArray676;

	@OriginalMember(owner = "client!wp", name = "q", descriptor = "[Lclient!ho;")
	public Class100[] aClass100Array3;

	@OriginalMember(owner = "client!wp", name = "t", descriptor = "[B")
	public byte[] aByteArray88;

	@OriginalMember(owner = "client!wp", name = "v", descriptor = "[S")
	public short[] aShortArray108;

	@OriginalMember(owner = "client!wp", name = "w", descriptor = "[B")
	public byte[] aByteArray89;

	@OriginalMember(owner = "client!wp", name = "A", descriptor = "[S")
	public short[] aShortArray109;

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "[S")
	public short[] aShortArray110;

	@OriginalMember(owner = "client!wp", name = "C", descriptor = "[S")
	public short[] aShortArray111;

	@OriginalMember(owner = "client!wp", name = "F", descriptor = "[S")
	public short[] aShortArray112;

	@OriginalMember(owner = "client!wp", name = "H", descriptor = "[S")
	public short[] aShortArray113;

	@OriginalMember(owner = "client!wp", name = "K", descriptor = "[S")
	public short[] aShortArray114;

	@OriginalMember(owner = "client!wp", name = "M", descriptor = "[B")
	public byte[] aByteArray90;

	@OriginalMember(owner = "client!wp", name = "O", descriptor = "[I")
	public int[] anIntArray678;

	@OriginalMember(owner = "client!wp", name = "P", descriptor = "[B")
	public byte[] aByteArray91;

	@OriginalMember(owner = "client!wp", name = "S", descriptor = "[B")
	public byte[] aByteArray92;

	@OriginalMember(owner = "client!wp", name = "T", descriptor = "[B")
	public byte[] aByteArray93;

	@OriginalMember(owner = "client!wp", name = "U", descriptor = "[Lclient!kg;")
	public Class123[] aClass123Array3;

	@OriginalMember(owner = "client!wp", name = "V", descriptor = "[S")
	public short[] aShortArray115;

	@OriginalMember(owner = "client!wp", name = "W", descriptor = "[B")
	public byte[] aByteArray94;

	@OriginalMember(owner = "client!wp", name = "X", descriptor = "[S")
	public short[] aShortArray116;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "I")
	public int anInt6758 = 0;

	@OriginalMember(owner = "client!wp", name = "x", descriptor = "I")
	public int anInt6761 = 0;

	@OriginalMember(owner = "client!wp", name = "N", descriptor = "I")
	public int anInt6769 = 0;

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "I")
	public int anInt6756 = 0;

	@OriginalMember(owner = "client!wp", name = "D", descriptor = "B")
	public byte aByte75 = 0;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "([B)V")
	public Class219(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method5853(arg0);
		} else {
			this.method5843(arg0);
		}
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(III)V")
	public Class219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aByteArray93 = new byte[arg1];
		this.anIntArray676 = new int[arg0];
		this.anIntArray678 = new int[arg0];
		this.aShortArray105 = new short[arg1];
		this.aShortArray111 = new short[arg1];
		this.aByteArray89 = new byte[arg1];
		this.anIntArray674 = new int[arg0];
		if (arg2 > 0) {
			this.aByteArray94 = new byte[arg2];
			this.aShortArray109 = new short[arg2];
			this.aShortArray106 = new short[arg2];
			this.aByteArray88 = new byte[arg2];
			this.aByteArray92 = new byte[arg2];
			this.aShortArray115 = new short[arg2];
			this.aShortArray107 = new short[arg2];
			this.aByteArray91 = new byte[arg2];
			this.aByteArray87 = new byte[arg2];
			this.aByteArray90 = new byte[arg2];
			this.aShortArray110 = new short[arg2];
			this.aShortArray113 = new short[arg2];
		}
		this.anIntArray675 = new int[arg1];
		this.anIntArray673 = new int[arg0];
		this.aShortArray114 = new short[arg1];
		this.aByteArray85 = new byte[arg1];
		this.aShortArray112 = new short[arg1];
		this.aShortArray104 = new short[arg1];
		this.aByteArray86 = new byte[arg1];
	}

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "([Lclient!wp;I)V")
	public Class219(@OriginalArg(0) Class219[] arg0, @OriginalArg(1) int arg1) {
		this.anInt6756 = 0;
		this.anInt6761 = 0;
		this.anInt6769 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		@Pc(33) boolean local33 = false;
		@Pc(35) boolean local35 = false;
		@Pc(37) boolean local37 = false;
		@Pc(39) boolean local39 = false;
		@Pc(41) boolean local41 = false;
		this.aByte75 = -1;
		@Pc(46) boolean local46 = false;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			@Pc(54) Class219 local54 = arg0[local48];
			if (local54 != null) {
				this.anInt6769 += local54.anInt6769;
				this.anInt6756 += local54.anInt6756;
				this.anInt6761 += local54.anInt6761;
				if (local54.aClass100Array3 != null) {
					local29 += local54.aClass100Array3.length;
				}
				if (local54.aClass123Array3 != null) {
					local31 += local54.aClass123Array3.length;
				}
				local33 |= local54.aByteArray86 != null;
				if (local54.aByteArray89 == null) {
					if (this.aByte75 == -1) {
						this.aByte75 = local54.aByte75;
					}
					if (this.aByte75 != local54.aByte75) {
						local35 = true;
					}
				} else {
					local35 = true;
				}
				local41 |= local54.aShortArray104 != null;
				local37 |= local54.aByteArray85 != null;
				local46 |= local54.anIntArray675 != null;
				local39 |= local54.aByteArray93 != null;
			}
		}
		if (local35) {
			this.aByteArray89 = new byte[this.anInt6761];
		}
		if (local33) {
			this.aByteArray86 = new byte[this.anInt6761];
		}
		this.aShortArray108 = new short[this.anInt6769];
		this.anIntArray673 = new int[this.anInt6769];
		this.aShortArray105 = new short[this.anInt6761];
		this.aShortArray114 = new short[this.anInt6761];
		if (this.anInt6756 > 0) {
			this.aShortArray115 = new short[this.anInt6756];
			this.aShortArray106 = new short[this.anInt6756];
			this.aByteArray94 = new byte[this.anInt6756];
			this.aByteArray88 = new byte[this.anInt6756];
			this.aByteArray91 = new byte[this.anInt6756];
			this.aByteArray87 = new byte[this.anInt6756];
			this.aByteArray90 = new byte[this.anInt6756];
			this.aShortArray110 = new short[this.anInt6756];
			this.aByteArray92 = new byte[this.anInt6756];
			this.aShortArray107 = new short[this.anInt6756];
			this.aShortArray113 = new short[this.anInt6756];
			this.aShortArray109 = new short[this.anInt6756];
		}
		this.aShortArray111 = new short[this.anInt6761];
		if (local41) {
			this.aShortArray104 = new short[this.anInt6761];
		}
		if (local39) {
			this.aByteArray93 = new byte[this.anInt6761];
		}
		this.aShortArray116 = new short[this.anInt6761];
		this.aShortArray112 = new short[this.anInt6761];
		if (local46) {
			this.anIntArray675 = new int[this.anInt6761];
		}
		if (local29 > 0) {
			this.aClass100Array3 = new Class100[local29];
		}
		if (local37) {
			this.aByteArray85 = new byte[this.anInt6761];
		}
		this.anIntArray678 = new int[this.anInt6769];
		this.anIntArray674 = new int[this.anInt6769];
		if (local31 > 0) {
			this.aClass123Array3 = new Class123[local31];
		}
		this.anIntArray676 = new int[this.anInt6769];
		local31 = 0;
		local29 = 0;
		this.anInt6756 = 0;
		this.anInt6769 = 0;
		this.anInt6761 = 0;
		@Pc(557) int local557;
		@Pc(568) int local568;
		for (@Pc(356) int local356 = 0; local356 < arg1; local356++) {
			@Pc(363) short local363 = (short) (0x1 << local356);
			@Pc(367) Class219 local367 = arg0[local356];
			if (local367 != null) {
				for (@Pc(371) int local371 = 0; local371 < local367.anInt6761; local371++) {
					if (local33 && local367.aByteArray86 != null) {
						this.aByteArray86[this.anInt6761] = local367.aByteArray86[local371];
					}
					if (local35) {
						if (local367.aByteArray89 == null) {
							this.aByteArray89[this.anInt6761] = local367.aByte75;
						} else {
							this.aByteArray89[this.anInt6761] = local367.aByteArray89[local371];
						}
					}
					if (local37 && local367.aByteArray85 != null) {
						this.aByteArray85[this.anInt6761] = local367.aByteArray85[local371];
					}
					if (local41) {
						if (local367.aShortArray104 == null) {
							this.aShortArray104[this.anInt6761] = -1;
						} else {
							this.aShortArray104[this.anInt6761] = local367.aShortArray104[local371];
						}
					}
					if (local46) {
						if (local367.anIntArray675 == null) {
							this.anIntArray675[this.anInt6761] = -1;
						} else {
							this.anIntArray675[this.anInt6761] = local367.anIntArray675[local371];
						}
					}
					this.aShortArray114[this.anInt6761] = (short) this.method5852(local363, local367, local367.aShortArray114[local371]);
					this.aShortArray105[this.anInt6761] = (short) this.method5852(local363, local367, local367.aShortArray105[local371]);
					this.aShortArray112[this.anInt6761] = (short) this.method5852(local363, local367, local367.aShortArray112[local371]);
					this.aShortArray116[this.anInt6761] = local363;
					this.aShortArray111[this.anInt6761] = local367.aShortArray111[local371];
					this.anInt6761++;
				}
				@Pc(544) int local544;
				if (local367.aClass100Array3 != null) {
					for (local544 = 0; local544 < local367.aClass100Array3.length; local544++) {
						local557 = this.method5852(local363, local367, local367.aClass100Array3[local544].anInt2301);
						local568 = this.method5852(local363, local367, local367.aClass100Array3[local544].anInt2302);
						@Pc(579) int local579 = this.method5852(local363, local367, local367.aClass100Array3[local544].anInt2304);
						this.aClass100Array3[local29] = new Class100(local367.aClass100Array3[local544].anInt2295, local557, local568, local579, local367.aClass100Array3[local544].aByte42);
						local29++;
					}
				}
				if (local367.aClass123Array3 != null) {
					for (local544 = 0; local544 < local367.aClass123Array3.length; local544++) {
						local557 = this.method5852(local363, local367, local367.aClass123Array3[local544].anInt3081);
						this.aClass123Array3[local31] = new Class123(local367.aClass123Array3[local544].anInt3080, local557);
						local31++;
					}
				}
			}
		}
		@Pc(658) int local658 = 0;
		this.anInt6758 = this.anInt6769;
		for (@Pc(664) int local664 = 0; local664 < arg1; local664++) {
			@Pc(671) short local671 = (short) (0x1 << local664);
			@Pc(675) Class219 local675 = arg0[local664];
			if (local675 != null) {
				for (local557 = 0; local557 < local675.anInt6761; local557++) {
					if (local39) {
						this.aByteArray93[local658++] = (byte) (local675.aByteArray93 == null || local675.aByteArray93[local557] == -1 ? -1 : this.anInt6756 + local675.aByteArray93[local557]);
					}
				}
				for (local568 = 0; local568 < local675.anInt6756; local568++) {
					@Pc(732) byte local732 = this.aByteArray94[this.anInt6756] = local675.aByteArray94[local568];
					if (local732 == 0) {
						this.aShortArray113[this.anInt6756] = (short) this.method5852(local671, local675, local675.aShortArray113[local568]);
						this.aShortArray106[this.anInt6756] = (short) this.method5852(local671, local675, local675.aShortArray106[local568]);
						this.aShortArray115[this.anInt6756] = (short) this.method5852(local671, local675, local675.aShortArray115[local568]);
					}
					if (local732 >= 1 && local732 <= 3) {
						this.aShortArray113[this.anInt6756] = local675.aShortArray113[local568];
						this.aShortArray106[this.anInt6756] = local675.aShortArray106[local568];
						this.aShortArray115[this.anInt6756] = local675.aShortArray115[local568];
						this.aShortArray110[this.anInt6756] = local675.aShortArray110[local568];
						this.aShortArray107[this.anInt6756] = local675.aShortArray107[local568];
						this.aShortArray109[this.anInt6756] = local675.aShortArray109[local568];
						this.aByteArray91[this.anInt6756] = local675.aByteArray91[local568];
						this.aByteArray87[this.anInt6756] = local675.aByteArray87[local568];
						this.aByteArray90[this.anInt6756] = local675.aByteArray90[local568];
					}
					if (local732 == 2) {
						this.aByteArray92[this.anInt6756] = local675.aByteArray92[local568];
						this.aByteArray88[this.anInt6756] = local675.aByteArray88[local568];
					}
					this.anInt6756++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z[B)V")
	private void method5843(@OriginalArg(1) byte[] arg0) {
		@Pc(7) boolean local7 = false;
		@Pc(9) boolean local9 = false;
		@Pc(14) Class1_Sub21 local14 = new Class1_Sub21(arg0);
		@Pc(19) Class1_Sub21 local19 = new Class1_Sub21(arg0);
		@Pc(24) Class1_Sub21 local24 = new Class1_Sub21(arg0);
		@Pc(29) Class1_Sub21 local29 = new Class1_Sub21(arg0);
		@Pc(34) Class1_Sub21 local34 = new Class1_Sub21(arg0);
		local14.anInt6611 = arg0.length - 18;
		this.anInt6769 = local14.method5715();
		this.anInt6761 = local14.method5715();
		this.anInt6756 = local14.method5720();
		@Pc(59) int local59 = local14.method5720();
		@Pc(63) int local63 = local14.method5720();
		@Pc(67) int local67 = local14.method5720();
		@Pc(71) int local71 = local14.method5720();
		@Pc(75) int local75 = local14.method5720();
		@Pc(79) int local79 = local14.method5715();
		@Pc(83) int local83 = local14.method5715();
		@Pc(87) int local87 = local14.method5715();
		@Pc(91) int local91 = local14.method5715();
		@Pc(100) int local100 = this.anInt6769;
		@Pc(102) int local102 = local100;
		local100 += this.anInt6761;
		@Pc(109) int local109 = local100;
		if (local63 == 255) {
			local100 += this.anInt6761;
		}
		@Pc(121) int local121 = local100;
		if (local71 == 1) {
			local100 += this.anInt6761;
		}
		@Pc(131) int local131 = local100;
		if (local59 == 1) {
			local100 += this.anInt6761;
		}
		@Pc(141) int local141 = local100;
		if (local75 == 1) {
			local100 += this.anInt6769;
		}
		@Pc(151) int local151 = local100;
		if (local67 == 1) {
			local100 += this.anInt6761;
		}
		@Pc(161) int local161 = local100;
		local100 += local91;
		@Pc(167) int local167 = local100;
		local100 += this.anInt6761 * 2;
		@Pc(176) int local176 = local100;
		local100 += this.anInt6756 * 6;
		@Pc(185) int local185 = local100;
		local100 += local79;
		@Pc(191) int local191 = local100;
		local100 += local83;
		this.anIntArray676 = new int[this.anInt6769];
		this.anIntArray673 = new int[this.anInt6769];
		local14.anInt6611 = 0;
		this.anIntArray674 = new int[this.anInt6769];
		if (local63 == 255) {
			this.aByteArray89 = new byte[this.anInt6761];
		} else {
			this.aByte75 = (byte) local63;
		}
		this.aShortArray114 = new short[this.anInt6761];
		if (local59 == 1) {
			this.aByteArray86 = new byte[this.anInt6761];
			this.aShortArray104 = new short[this.anInt6761];
			this.aByteArray93 = new byte[this.anInt6761];
		}
		this.aShortArray112 = new short[this.anInt6761];
		if (local67 == 1) {
			this.aByteArray85 = new byte[this.anInt6761];
		}
		if (local71 == 1) {
			this.anIntArray675 = new int[this.anInt6761];
		}
		this.aShortArray105 = new short[this.anInt6761];
		if (this.anInt6756 > 0) {
			this.aShortArray106 = new short[this.anInt6756];
			this.aShortArray113 = new short[this.anInt6756];
			this.aByteArray94 = new byte[this.anInt6756];
			this.aShortArray115 = new short[this.anInt6756];
		}
		this.aShortArray111 = new short[this.anInt6761];
		if (local75 == 1) {
			this.anIntArray678 = new int[this.anInt6769];
		}
		local19.anInt6611 = local185;
		local24.anInt6611 = local191;
		local29.anInt6611 = local100;
		local34.anInt6611 = local141;
		@Pc(337) int local337 = 0;
		@Pc(345) int local345 = 0;
		@Pc(347) int local347 = 0;
		@Pc(355) int local355;
		@Pc(357) int local357;
		for (@Pc(349) int local349 = 0; local349 < this.anInt6769; local349++) {
			local355 = local14.method5720();
			local357 = 0;
			if ((local355 & 0x1) != 0) {
				local357 = local19.method5723();
			}
			@Pc(367) int local367 = 0;
			if ((local355 & 0x2) != 0) {
				local367 = local24.method5723();
			}
			@Pc(377) int local377 = 0;
			if ((local355 & 0x4) != 0) {
				local377 = local29.method5723();
			}
			this.anIntArray673[local349] = local357 + local337;
			this.anIntArray676[local349] = local345 + local367;
			this.anIntArray674[local349] = local377 + local347;
			local345 = this.anIntArray676[local349];
			local347 = this.anIntArray674[local349];
			local337 = this.anIntArray673[local349];
			if (local75 == 1) {
				this.anIntArray678[local349] = local34.method5720();
			}
		}
		local14.anInt6611 = local167;
		local19.anInt6611 = local131;
		local24.anInt6611 = local109;
		local29.anInt6611 = local151;
		local34.anInt6611 = local121;
		for (local355 = 0; local355 < this.anInt6761; local355++) {
			this.aShortArray111[local355] = (short) local14.method5715();
			if (local59 == 1) {
				local357 = local19.method5720();
				if ((local357 & 0x1) == 1) {
					local7 = true;
					this.aByteArray86[local355] = 1;
				} else {
					this.aByteArray86[local355] = 0;
				}
				if ((local357 & 0x2) == 2) {
					this.aByteArray93[local355] = (byte) (local357 >> 2);
					this.aShortArray104[local355] = this.aShortArray111[local355];
					this.aShortArray111[local355] = 127;
					if (this.aShortArray104[local355] != -1) {
						local9 = true;
					}
				} else {
					this.aByteArray93[local355] = -1;
					this.aShortArray104[local355] = -1;
				}
			}
			if (local63 == 255) {
				this.aByteArray89[local355] = local24.method5721();
			}
			if (local67 == 1) {
				this.aByteArray85[local355] = local29.method5721();
			}
			if (local71 == 1) {
				this.anIntArray675[local355] = local34.method5720();
			}
		}
		local14.anInt6611 = local161;
		this.anInt6758 = -1;
		local19.anInt6611 = local102;
		@Pc(598) short local598 = 0;
		@Pc(600) short local600 = 0;
		@Pc(602) short local602 = 0;
		@Pc(604) short local604 = 0;
		@Pc(612) int local612;
		for (@Pc(606) int local606 = 0; local606 < this.anInt6761; local606++) {
			local612 = local19.method5720();
			if (local612 == 1) {
				local598 = (short) (local14.method5723() + local604);
				local600 = (short) (local14.method5723() + local598);
				local602 = (short) (local14.method5723() + local600);
				this.aShortArray114[local606] = local598;
				local604 = local602;
				this.aShortArray105[local606] = local600;
				this.aShortArray112[local606] = local602;
				if (this.anInt6758 < local598) {
					this.anInt6758 = local598;
				}
				if (local600 > this.anInt6758) {
					this.anInt6758 = local600;
				}
				if (local602 > this.anInt6758) {
					this.anInt6758 = local602;
				}
			}
			if (local612 == 2) {
				local600 = local602;
				local602 = (short) (local14.method5723() + local604);
				this.aShortArray114[local606] = local598;
				local604 = local602;
				this.aShortArray105[local606] = local600;
				this.aShortArray112[local606] = local602;
				if (local602 > this.anInt6758) {
					this.anInt6758 = local602;
				}
			}
			if (local612 == 3) {
				local598 = local602;
				local602 = (short) (local604 + local14.method5723());
				local604 = local602;
				this.aShortArray114[local606] = local598;
				this.aShortArray105[local606] = local600;
				this.aShortArray112[local606] = local602;
				if (local602 > this.anInt6758) {
					this.anInt6758 = local602;
				}
			}
			if (local612 == 4) {
				@Pc(769) short local769 = local598;
				local598 = local600;
				local600 = local769;
				local602 = (short) (local604 + local14.method5723());
				local604 = local602;
				this.aShortArray114[local606] = local598;
				this.aShortArray105[local606] = local769;
				this.aShortArray112[local606] = local602;
				if (this.anInt6758 < local602) {
					this.anInt6758 = local602;
				}
			}
		}
		local14.anInt6611 = local176;
		this.anInt6758++;
		for (local612 = 0; local612 < this.anInt6756; local612++) {
			this.aByteArray94[local612] = 0;
			this.aShortArray113[local612] = (short) local14.method5715();
			this.aShortArray106[local612] = (short) local14.method5715();
			this.aShortArray115[local612] = (short) local14.method5715();
		}
		if (this.aByteArray93 != null) {
			@Pc(873) boolean local873 = false;
			for (@Pc(875) int local875 = 0; local875 < this.anInt6761; local875++) {
				@Pc(884) int local884 = this.aByteArray93[local875] & 0xFF;
				if (local884 != 255) {
					if (this.aShortArray114[local875] == (this.aShortArray113[local884] & 0xFFFF) && this.aShortArray105[local875] == (this.aShortArray106[local884] & 0xFFFF) && this.aShortArray112[local875] == (this.aShortArray115[local884] & 0xFFFF)) {
						this.aByteArray93[local875] = -1;
					} else {
						local873 = true;
					}
				}
			}
			if (!local873) {
				this.aByteArray93 = null;
			}
		}
		if (!local7) {
			this.aByteArray86 = null;
		}
		if (!local9) {
			this.aShortArray104 = null;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IBSBBIISB)I")
	public int method5844(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) short arg2, @OriginalArg(4) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) short arg6, @OriginalArg(8) byte arg7) {
		this.aShortArray114[this.anInt6761] = (short) arg5;
		this.aShortArray105[this.anInt6761] = (short) arg4;
		this.aShortArray112[this.anInt6761] = (short) arg0;
		this.aByteArray86[this.anInt6761] = arg3;
		this.aByteArray93[this.anInt6761] = arg1;
		this.aShortArray111[this.anInt6761] = arg2;
		this.aByteArray85[this.anInt6761] = arg7;
		this.aShortArray104[this.anInt6761] = arg6;
		return this.anInt6761++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIII)V")
	public void method5845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(17) int local17;
		@Pc(35) int local35;
		if (arg0 != 0) {
			local11 = Class1_Sub5_Sub15.anIntArray335[arg0];
			local15 = Class1_Sub5_Sub15.anIntArray333[arg0];
			for (local17 = 0; local17 < this.anInt6769; local17++) {
				local35 = local15 * this.anIntArray673[local17] + local11 * this.anIntArray676[local17] >> 15;
				this.anIntArray676[local17] = local15 * this.anIntArray676[local17] - local11 * this.anIntArray673[local17] >> 15;
				this.anIntArray673[local17] = local35;
			}
		}
		if (arg2 != 0) {
			local11 = Class1_Sub5_Sub15.anIntArray335[arg2];
			local15 = Class1_Sub5_Sub15.anIntArray333[arg2];
			for (local17 = 0; local17 < this.anInt6769; local17++) {
				local35 = this.anIntArray676[local17] * local15 - local11 * this.anIntArray674[local17] >> 15;
				this.anIntArray674[local17] = local11 * this.anIntArray676[local17] + this.anIntArray674[local17] * local15 >> 15;
				this.anIntArray676[local17] = local35;
			}
		}
		if (arg1 == 0) {
			return;
		}
		local11 = Class1_Sub5_Sub15.anIntArray335[arg1];
		local15 = Class1_Sub5_Sub15.anIntArray333[arg1];
		for (local17 = 0; local17 < this.anInt6769; local17++) {
			local35 = local11 * this.anIntArray674[local17] + this.anIntArray673[local17] * local15 >> 15;
			this.anIntArray674[local17] = this.anIntArray674[local17] * local15 - local11 * this.anIntArray673[local17] >> 15;
			this.anIntArray673[local17] = local35;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SBSSBSISSB)B")
	public byte method5846() {
		if (this.anInt6756 >= 255) {
			throw new IllegalStateException();
		}
		this.aByteArray94[this.anInt6756] = 3;
		this.aShortArray113[this.anInt6756] = 0;
		this.aShortArray106[this.anInt6756] = 32767;
		this.aShortArray115[this.anInt6756] = 0;
		this.aShortArray110[this.anInt6756] = 1024;
		this.aShortArray107[this.anInt6756] = 1024;
		this.aShortArray109[this.anInt6756] = 1024;
		this.aByteArray91[this.anInt6756] = 0;
		this.aByteArray87[this.anInt6756] = 0;
		this.aByteArray90[this.anInt6756] = 0;
		return (byte) this.anInt6756++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SSI)V")
	public void method5847(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray104 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.anInt6761; local11++) {
			if (this.aShortArray104[local11] == arg0) {
				this.aShortArray104[local11] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIB)I")
	public int method5848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6769; local7++) {
			if (arg2 == this.anIntArray673[local7] && arg1 == this.anIntArray676[local7] && arg0 == this.anIntArray674[local7]) {
				return local7;
			}
		}
		this.anIntArray673[this.anInt6769] = arg2;
		this.anIntArray676[this.anInt6769] = arg1;
		this.anIntArray674[this.anInt6769] = arg0;
		this.anInt6758 = this.anInt6769 + 1;
		return this.anInt6769++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)[[I")
	public int[][] method5849() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6761; local12++) {
			@Pc(19) int local19 = this.anIntArray675[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
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
		for (@Pc(71) int local71 = 0; local71 < this.anInt6761; local71++) {
			@Pc(78) int local78 = this.anIntArray675[local71];
			if (local78 >= 0) {
				local50[local78][local8[local78]++] = local71;
			}
		}
		return local50;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(I)[[I")
	public int[][] method5850() {
		@Pc(8) int[] local8 = new int[256];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt6758; local12++) {
			@Pc(19) int local19 = this.anIntArray678[local12];
			if (local19 >= 0) {
				if (local19 > local10) {
					local10 = local19;
				}
				@Pc(34) int local34 = local8[local19]++;
			}
		}
		@Pc(51) int[][] local51 = new int[local10 + 1][];
		for (@Pc(53) int local53 = 0; local53 <= local10; local53++) {
			local51[local53] = new int[local8[local53]];
			local8[local53] = 0;
		}
		for (@Pc(72) int local72 = 0; local72 < this.anInt6758; local72++) {
			@Pc(79) int local79 = this.anIntArray678[local72];
			if (local79 >= 0) {
				local51[local79][local8[local79]++] = local72;
			}
		}
		return local51;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ISS)V")
	public void method5851(@OriginalArg(1) short arg0, @OriginalArg(2) short arg1) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6761; local7++) {
			if (this.aShortArray111[local7] == arg1) {
				this.aShortArray111[local7] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(SILclient!wp;I)I")
	private int method5852(@OriginalArg(0) short arg0, @OriginalArg(2) Class219 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg1.anIntArray673[arg2];
		@Pc(15) int local15 = arg1.anIntArray676[arg2];
		@Pc(20) int local20 = arg1.anIntArray674[arg2];
		for (@Pc(22) int local22 = 0; local22 < this.anInt6769; local22++) {
			if (this.anIntArray673[local22] == local10 && local15 == this.anIntArray676[local22] && local20 == this.anIntArray674[local22]) {
				this.aShortArray108[local22] |= arg0;
				return local22;
			}
		}
		this.anIntArray673[this.anInt6769] = local10;
		this.anIntArray676[this.anInt6769] = local15;
		this.anIntArray674[this.anInt6769] = local20;
		this.aShortArray108[this.anInt6769] = arg0;
		this.anIntArray678[this.anInt6769] = arg1.anIntArray678 == null ? -1 : arg1.anIntArray678[arg2];
		return this.anInt6769++;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "([BI)V")
	private void method5853(@OriginalArg(0) byte[] arg0) {
		@Pc(10) Class1_Sub21 local10 = new Class1_Sub21(arg0);
		@Pc(15) Class1_Sub21 local15 = new Class1_Sub21(arg0);
		@Pc(20) Class1_Sub21 local20 = new Class1_Sub21(arg0);
		@Pc(25) Class1_Sub21 local25 = new Class1_Sub21(arg0);
		@Pc(30) Class1_Sub21 local30 = new Class1_Sub21(arg0);
		@Pc(35) Class1_Sub21 local35 = new Class1_Sub21(arg0);
		@Pc(40) Class1_Sub21 local40 = new Class1_Sub21(arg0);
		local10.anInt6611 = arg0.length - 23;
		this.anInt6769 = local10.method5715();
		this.anInt6761 = local10.method5715();
		this.anInt6756 = local10.method5720();
		@Pc(67) int local67 = local10.method5720();
		@Pc(78) boolean local78 = (local67 & 0x1) == 1;
		@Pc(87) boolean local87 = (local67 & 0x2) == 2;
		@Pc(91) int local91 = local10.method5720();
		@Pc(95) int local95 = local10.method5720();
		@Pc(99) int local99 = local10.method5720();
		@Pc(105) int local105 = local10.method5720();
		@Pc(111) int local111 = local10.method5720();
		@Pc(117) int local117 = local10.method5715();
		@Pc(123) int local123 = local10.method5715();
		@Pc(127) int local127 = local10.method5715();
		@Pc(131) int local131 = local10.method5715();
		@Pc(135) int local135 = local10.method5715();
		@Pc(137) int local137 = 0;
		@Pc(139) int local139 = 0;
		@Pc(141) int local141 = 0;
		@Pc(157) int local157;
		if (this.anInt6756 > 0) {
			local10.anInt6611 = 0;
			this.aByteArray94 = new byte[this.anInt6756];
			for (local157 = 0; local157 < this.anInt6756; local157++) {
				@Pc(170) byte local170 = this.aByteArray94[local157] = local10.method5721();
				if (local170 == 0) {
					local137++;
				}
				if (local170 >= 1 && local170 <= 3) {
					local139++;
				}
				if (local170 == 2) {
					local141++;
				}
			}
		}
		local157 = this.anInt6756;
		@Pc(201) int local201 = local157;
		local157 += this.anInt6769;
		@Pc(208) int local208 = local157;
		if (local78) {
			local157 += this.anInt6761;
		}
		@Pc(217) int local217 = local157;
		local157 += this.anInt6761;
		@Pc(224) int local224 = local157;
		if (local91 == 255) {
			local157 += this.anInt6761;
		}
		@Pc(234) int local234 = local157;
		if (local99 == 1) {
			local157 += this.anInt6761;
		}
		@Pc(246) int local246 = local157;
		if (local111 == 1) {
			local157 += this.anInt6769;
		}
		@Pc(256) int local256 = local157;
		if (local95 == 1) {
			local157 += this.anInt6761;
		}
		@Pc(266) int local266 = local157;
		local157 += local131;
		@Pc(272) int local272 = local157;
		if (local105 == 1) {
			local157 += this.anInt6761 * 2;
		}
		@Pc(284) int local284 = local157;
		local157 += local135;
		@Pc(290) int local290 = local157;
		local157 += this.anInt6761 * 2;
		@Pc(299) int local299 = local157;
		local157 += local117;
		@Pc(305) int local305 = local157;
		local157 += local123;
		@Pc(311) int local311 = local157;
		local157 += local127;
		@Pc(317) int local317 = local157;
		local157 += local137 * 6;
		@Pc(325) int local325 = local157;
		local157 += local139 * 6;
		@Pc(333) int local333 = local157;
		local157 += local139 * 6;
		@Pc(341) int local341 = local157;
		local157 += local139;
		@Pc(347) int local347 = local157;
		local157 += local139;
		@Pc(353) int local353 = local157;
		local157 += local139 + local141 * 2;
		this.anIntArray674 = new int[this.anInt6769];
		this.aShortArray114 = new short[this.anInt6761];
		this.aShortArray112 = new short[this.anInt6761];
		this.aShortArray111 = new short[this.anInt6761];
		this.aShortArray105 = new short[this.anInt6761];
		if (local78) {
			this.aByteArray86 = new byte[this.anInt6761];
		}
		if (local95 == 1) {
			this.aByteArray85 = new byte[this.anInt6761];
		}
		this.anIntArray673 = new int[this.anInt6769];
		if (this.anInt6756 > 0) {
			this.aShortArray106 = new short[this.anInt6756];
			if (local141 > 0) {
				this.aByteArray88 = new byte[local141];
				this.aByteArray92 = new byte[local141];
			}
			this.aShortArray113 = new short[this.anInt6756];
			this.aShortArray115 = new short[this.anInt6756];
			if (local139 > 0) {
				this.aShortArray109 = new short[local139];
				this.aByteArray90 = new byte[local139];
				this.aShortArray107 = new short[local139];
				this.aShortArray110 = new short[local139];
				this.aByteArray87 = new byte[local139];
				this.aByteArray91 = new byte[local139];
			}
		}
		if (local99 == 1) {
			this.anIntArray675 = new int[this.anInt6761];
		}
		if (local91 == 255) {
			this.aByteArray89 = new byte[this.anInt6761];
		} else {
			this.aByte75 = (byte) local91;
		}
		if (local105 == 1) {
			this.aShortArray104 = new short[this.anInt6761];
		}
		this.anIntArray676 = new int[this.anInt6769];
		if (local105 == 1 && this.anInt6756 > 0) {
			this.aByteArray93 = new byte[this.anInt6761];
		}
		local10.anInt6611 = local201;
		if (local111 == 1) {
			this.anIntArray678 = new int[this.anInt6769];
		}
		local15.anInt6611 = local299;
		local20.anInt6611 = local305;
		local25.anInt6611 = local311;
		local30.anInt6611 = local246;
		@Pc(547) int local547 = 0;
		@Pc(549) int local549 = 0;
		@Pc(551) int local551 = 0;
		@Pc(559) int local559;
		for (@Pc(553) int local553 = 0; local553 < this.anInt6769; local553++) {
			local559 = local10.method5720();
			@Pc(561) int local561 = 0;
			if ((local559 & 0x1) != 0) {
				local561 = local15.method5723();
			}
			@Pc(574) int local574 = 0;
			if ((local559 & 0x2) != 0) {
				local574 = local20.method5723();
			}
			@Pc(584) int local584 = 0;
			if ((local559 & 0x4) != 0) {
				local584 = local25.method5723();
			}
			this.anIntArray673[local553] = local561 + local547;
			this.anIntArray676[local553] = local574 + local549;
			this.anIntArray674[local553] = local551 + local584;
			local549 = this.anIntArray676[local553];
			local551 = this.anIntArray674[local553];
			local547 = this.anIntArray673[local553];
			if (local111 == 1) {
				this.anIntArray678[local553] = local30.method5720();
			}
		}
		local10.anInt6611 = local290;
		local15.anInt6611 = local208;
		local20.anInt6611 = local224;
		local25.anInt6611 = local256;
		local30.anInt6611 = local234;
		local35.anInt6611 = local272;
		local40.anInt6611 = local284;
		for (local559 = 0; local559 < this.anInt6761; local559++) {
			this.aShortArray111[local559] = (short) local10.method5715();
			if (local78) {
				this.aByteArray86[local559] = local15.method5721();
			}
			if (local91 == 255) {
				this.aByteArray89[local559] = local20.method5721();
			}
			if (local95 == 1) {
				this.aByteArray85[local559] = local25.method5721();
			}
			if (local99 == 1) {
				this.anIntArray675[local559] = local30.method5720();
			}
			if (local105 == 1) {
				this.aShortArray104[local559] = (short) (local35.method5715() - 1);
			}
			if (this.aByteArray93 != null) {
				if (this.aShortArray104[local559] == -1) {
					this.aByteArray93[local559] = -1;
				} else {
					this.aByteArray93[local559] = (byte) (local40.method5720() - 1);
				}
			}
		}
		local10.anInt6611 = local266;
		this.anInt6758 = -1;
		local15.anInt6611 = local217;
		@Pc(783) short local783 = 0;
		@Pc(785) short local785 = 0;
		@Pc(787) short local787 = 0;
		@Pc(789) short local789 = 0;
		@Pc(797) int local797;
		for (@Pc(791) int local791 = 0; local791 < this.anInt6761; local791++) {
			local797 = local15.method5720();
			if (local797 == 1) {
				local783 = (short) (local10.method5723() + local789);
				local785 = (short) (local10.method5723() + local783);
				local787 = (short) (local785 + local10.method5723());
				this.aShortArray114[local791] = local783;
				local789 = local787;
				this.aShortArray105[local791] = local785;
				this.aShortArray112[local791] = local787;
				if (this.anInt6758 < local783) {
					this.anInt6758 = local783;
				}
				if (this.anInt6758 < local785) {
					this.anInt6758 = local785;
				}
				if (local787 > this.anInt6758) {
					this.anInt6758 = local787;
				}
			}
			if (local797 == 2) {
				local785 = local787;
				local787 = (short) (local10.method5723() + local789);
				this.aShortArray114[local791] = local783;
				local789 = local787;
				this.aShortArray105[local791] = local785;
				this.aShortArray112[local791] = local787;
				if (this.anInt6758 < local787) {
					this.anInt6758 = local787;
				}
			}
			if (local797 == 3) {
				local783 = local787;
				local787 = (short) (local10.method5723() + local789);
				local789 = local787;
				this.aShortArray114[local791] = local783;
				this.aShortArray105[local791] = local785;
				this.aShortArray112[local791] = local787;
				if (local787 > this.anInt6758) {
					this.anInt6758 = local787;
				}
			}
			if (local797 == 4) {
				@Pc(958) short local958 = local783;
				local783 = local785;
				local787 = (short) (local789 + local10.method5723());
				local785 = local958;
				this.aShortArray114[local791] = local783;
				local789 = local787;
				this.aShortArray105[local791] = local958;
				this.aShortArray112[local791] = local787;
				if (this.anInt6758 < local787) {
					this.anInt6758 = local787;
				}
			}
		}
		this.anInt6758++;
		local10.anInt6611 = local317;
		local15.anInt6611 = local325;
		local20.anInt6611 = local333;
		local25.anInt6611 = local341;
		local30.anInt6611 = local347;
		local35.anInt6611 = local353;
		@Pc(1041) int local1041;
		for (local797 = 0; local797 < this.anInt6756; local797++) {
			local1041 = this.aByteArray94[local797] & 0xFF;
			if (local1041 == 0) {
				this.aShortArray113[local797] = (short) local10.method5715();
				this.aShortArray106[local797] = (short) local10.method5715();
				this.aShortArray115[local797] = (short) local10.method5715();
			}
			if (local1041 == 1) {
				this.aShortArray113[local797] = (short) local15.method5715();
				this.aShortArray106[local797] = (short) local15.method5715();
				this.aShortArray115[local797] = (short) local15.method5715();
				this.aShortArray110[local797] = (short) local20.method5715();
				this.aShortArray107[local797] = (short) local20.method5715();
				this.aShortArray109[local797] = (short) local20.method5715();
				this.aByteArray91[local797] = local25.method5721();
				this.aByteArray87[local797] = local30.method5721();
				this.aByteArray90[local797] = local35.method5721();
			}
			if (local1041 == 2) {
				this.aShortArray113[local797] = (short) local15.method5715();
				this.aShortArray106[local797] = (short) local15.method5715();
				this.aShortArray115[local797] = (short) local15.method5715();
				this.aShortArray110[local797] = (short) local20.method5715();
				this.aShortArray107[local797] = (short) local20.method5715();
				this.aShortArray109[local797] = (short) local20.method5715();
				this.aByteArray91[local797] = local25.method5721();
				this.aByteArray87[local797] = local30.method5721();
				this.aByteArray90[local797] = local35.method5721();
				this.aByteArray92[local797] = local35.method5721();
				this.aByteArray88[local797] = local35.method5721();
			}
			if (local1041 == 3) {
				this.aShortArray113[local797] = (short) local15.method5715();
				this.aShortArray106[local797] = (short) local15.method5715();
				this.aShortArray115[local797] = (short) local15.method5715();
				this.aShortArray110[local797] = (short) local20.method5715();
				this.aShortArray107[local797] = (short) local20.method5715();
				this.aShortArray109[local797] = (short) local20.method5715();
				this.aByteArray91[local797] = local25.method5721();
				this.aByteArray87[local797] = local30.method5721();
				this.aByteArray90[local797] = local35.method5721();
			}
		}
		if (!local87) {
			return;
		}
		local10.anInt6611 = local157;
		local1041 = local10.method5720();
		@Pc(1343) int local1343;
		@Pc(1351) int local1351;
		if (local1041 > 0) {
			this.aClass100Array3 = new Class100[local1041];
			for (local1343 = 0; local1343 < local1041; local1343++) {
				local1351 = local10.method5715();
				@Pc(1355) int local1355 = local10.method5715();
				@Pc(1363) byte local1363;
				if (local91 == 255) {
					local1363 = this.aByteArray89[local1355];
				} else {
					local1363 = (byte) local91;
				}
				this.aClass100Array3[local1343] = new Class100(local1351, this.aShortArray114[local1355], this.aShortArray105[local1355], this.aShortArray112[local1355], local1363);
			}
		}
		local1343 = local10.method5720();
		if (local1343 <= 0) {
			return;
		}
		this.aClass123Array3 = new Class123[local1343];
		for (local1351 = 0; local1351 < local1343; local1351++) {
			this.aClass123Array3[local1351] = new Class123(local10.method5715(), local10.method5715());
		}
		return;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(IIIB)V")
	public void method5854(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(7) int local7 = 0; local7 < this.anInt6769; local7++) {
			this.anIntArray673[local7] += arg1;
			this.anIntArray676[local7] += arg2;
			this.anIntArray674[local7] += arg0;
		}
	}
}
