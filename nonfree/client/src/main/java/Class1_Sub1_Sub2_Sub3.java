import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private int anInt673;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt670 = -41441;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private boolean aBoolean165 = true;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt671 = 35961;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt672 = -676;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "B")
	private byte aByte34 = 9;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
	private boolean aBoolean166 = true;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	private int anInt679;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method659(arg1 + ".dat", null), (byte) 1);
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0.method659("index.dat", null), (byte) 1);
		local46.anInt743 = local37.method475();
		this.anInt678 = local46.method475();
		this.anInt679 = local46.method475();
		@Pc(61) int local61 = local46.method473();
		this.anIntArray209 = new int[local61];
		for (@Pc(67) int local67 = 0; local67 < local61 - 1; local67++) {
			this.anIntArray209[local67 + 1] = local46.method477();
		}
		for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
			local46.anInt743 += 2;
			local37.anInt743 += local46.method475() * local46.method475();
			local46.anInt743++;
		}
		this.anInt676 = local46.method473();
		this.anInt677 = local46.method473();
		this.anInt674 = local46.method475();
		this.anInt675 = local46.method475();
		@Pc(132) int local132 = local46.method473();
		@Pc(138) int local138 = this.anInt674 * this.anInt675;
		this.aByteArray7 = new byte[local138];
		@Pc(146) int local146;
		if (local132 == 0) {
			for (local146 = 0; local146 < local138; local146++) {
				this.aByteArray7[local146] = local37.method474();
			}
		} else if (local132 == 1) {
			for (local146 = 0; local146 < this.anInt674; local146++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt675; local168++) {
					this.aByteArray7[local146 + local168 * this.anInt674] = local37.method474();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method410(@OriginalArg(0) byte arg0) {
		try {
			this.anInt678 /= 2;
			this.anInt679 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt678 * this.anInt679];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt675; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt674; local28++) {
					local20[(local28 + this.anInt676 >> 1) + (local24 + this.anInt677 >> 1) * this.anInt678] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt674 = this.anInt678;
			this.anInt675 = this.anInt679;
			this.anInt676 = 0;
			if (this.aByte34 == 9) {
				@Pc(83) boolean local83 = false;
				this.anInt677 = 0;
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("18160, " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method411() {
		try {
			if (this.anInt674 != this.anInt678 || this.anInt675 != this.anInt679) {
				@Pc(24) byte[] local24 = new byte[this.anInt678 * this.anInt679];
				@Pc(26) int local26 = 0;
				for (@Pc(28) int local28 = 0; local28 < this.anInt675; local28++) {
					for (@Pc(32) int local32 = 0; local32 < this.anInt674; local32++) {
						local24[local32 + this.anInt676 + (local28 + this.anInt677) * this.anInt678] = this.aByteArray7[local26++];
					}
				}
				this.aByteArray7 = local24;
				this.anInt674 = this.anInt678;
				this.anInt675 = this.anInt679;
				this.anInt676 = 0;
				this.anInt677 = 0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("37934, " + 0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method412() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt674 * this.anInt675];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt675; local12++) {
				for (@Pc(19) int local19 = this.anInt674 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt674];
				}
			}
			this.aByteArray7 = local8;
			this.anInt676 = this.anInt678 - this.anInt674 - this.anInt676;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("11741, " + 2 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public void method413() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt674 * this.anInt675];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt675 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt674; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt674];
				}
			}
			this.aByteArray7 = local8;
			this.anInt677 = this.anInt679 - this.anInt675 - this.anInt677;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("54988, " + -36 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray209.length; local3++) {
				@Pc(14) int local14 = this.anIntArray209[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray209[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray209[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray209[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("25788, " + arg0 + ", " + 6 + ", " + arg1 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
	public void method415(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt676;
			arg2 += this.anInt677;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub1_Sub2.anInt696;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt675;
			@Pc(23) int local23 = this.anInt674;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt696 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class1_Sub1_Sub2.anInt698) {
				local36 = Class1_Sub1_Sub2.anInt698 - arg2;
				local20 -= local36;
				arg2 = Class1_Sub1_Sub2.anInt698;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt696;
			}
			if (arg2 + local20 > Class1_Sub1_Sub2.anInt699) {
				local20 -= arg2 + local20 - Class1_Sub1_Sub2.anInt699;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt700) {
				local36 = Class1_Sub1_Sub2.anInt700 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt700;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt701) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt701;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method416(local29, local27, local17, local20, local23, Class1_Sub1_Sub2.anIntArray210, this.aByteArray7, local15, this.anIntArray209);
				if (arg0 != 7) {
					this.anInt670 = -485;
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("38044, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBIIII[I[BI[I)V")
	private void method416(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(18) int local18 = -arg3; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					@Pc(29) byte local29 = arg6[arg2++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg8[local29 & 0xFF];
					}
					local29 = arg6[arg2++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg8[local29 & 0xFF];
					}
					local29 = arg6[arg2++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg8[local29 & 0xFF];
					}
					local29 = arg6[arg2++];
					if (local29 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg8[local29 & 0xFF];
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					@Pc(112) byte local112 = arg6[arg2++];
					if (local112 == 0) {
						arg7++;
					} else {
						arg5[arg7++] = arg8[local112 & 0xFF];
					}
				}
				arg7 += arg1;
				arg2 += arg0;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("34776, " + arg0 + ", " + -55 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
