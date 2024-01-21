import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt669 = 9;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	private int anInt675;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(arg0.method689(arg1 + ".dat", null), true);
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method689("index.dat", null), true);
		local37.anInt766 = local28.method505();
		this.anInt674 = local37.method505();
		this.anInt675 = local37.method505();
		@Pc(52) int local52 = local37.method503();
		this.anIntArray207 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray207[local58 + 1] = local37.method507();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt766 += 2;
			local28.anInt766 += local37.method505() * local37.method505();
			local37.anInt766++;
		}
		this.anInt672 = local37.method503();
		this.anInt673 = local37.method503();
		this.anInt670 = local37.method505();
		this.anInt671 = local37.method505();
		@Pc(123) int local123 = local37.method503();
		@Pc(129) int local129 = this.anInt670 * this.anInt671;
		this.aByteArray7 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray7[local137] = local28.method504();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt670; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt671; local159++) {
					this.aByteArray7[local137 + local159 * this.anInt670] = local28.method504();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public void method410() {
		try {
			this.anInt674 /= 2;
			this.anInt675 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt674 * this.anInt675];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt671; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt670; local28++) {
					local20[(local28 + this.anInt672 >> 1) + (local24 + this.anInt673 >> 1) * this.anInt674] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt670 = this.anInt674;
			this.anInt671 = this.anInt675;
			this.anInt672 = 0;
			this.anInt673 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("45284, " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method411() {
		try {
			if (this.anInt670 != this.anInt674 || this.anInt671 != this.anInt675) {
				@Pc(19) byte[] local19 = new byte[this.anInt674 * this.anInt675];
				@Pc(21) int local21 = 0;
				if (this.anInt669 > 9 || this.anInt669 < 9) {
					this.anInt668 = 393;
				}
				for (@Pc(34) int local34 = 0; local34 < this.anInt671; local34++) {
					for (@Pc(38) int local38 = 0; local38 < this.anInt670; local38++) {
						local19[local38 + this.anInt672 + (local34 + this.anInt673) * this.anInt674] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt670 = this.anInt674;
				this.anInt671 = this.anInt675;
				this.anInt672 = 0;
				this.anInt673 = 0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("67788, " + 9 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public void method412() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt670 * this.anInt671];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt671; local12++) {
				for (@Pc(19) int local19 = this.anInt670 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt670];
				}
			}
			this.aByteArray7 = local8;
			this.anInt672 = this.anInt674 - this.anInt670 - this.anInt672;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("49633, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(I)V")
	public void method413() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt670 * this.anInt671];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt671 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt670; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt670];
				}
			}
			this.aByteArray7 = local8;
			this.anInt673 = this.anInt675 - this.anInt671 - this.anInt673;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("7279, " + -489 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIB)V")
	public void method414(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray207.length; local3++) {
				@Pc(14) int local14 = this.anIntArray207[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray207[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray207[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray207[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
			if (arg3 == -38) {
				;
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("62574, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
	public void method415(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt672;
			arg1 += this.anInt673;
			@Pc(17) int local17 = arg0 + arg1 * Class1_Sub1_Sub2.anInt721;
			@Pc(19) int local19 = 0;
			@Pc(35) int local35 = this.anInt671;
			@Pc(38) int local38 = this.anInt670;
			@Pc(42) int local42 = Class1_Sub1_Sub2.anInt721 - local38;
			@Pc(44) int local44 = 0;
			@Pc(51) int local51;
			if (arg1 < Class1_Sub1_Sub2.anInt723) {
				local51 = Class1_Sub1_Sub2.anInt723 - arg1;
				local35 -= local51;
				arg1 = Class1_Sub1_Sub2.anInt723;
				local19 = local51 * local38 + 0;
				local17 += local51 * Class1_Sub1_Sub2.anInt721;
			}
			if (arg1 + local35 > Class1_Sub1_Sub2.anInt724) {
				local35 -= arg1 + local35 - Class1_Sub1_Sub2.anInt724;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt725) {
				local51 = Class1_Sub1_Sub2.anInt725 - arg0;
				local38 -= local51;
				arg0 = Class1_Sub1_Sub2.anInt725;
				local19 += local51;
				local17 += local51;
				local44 = local51 + 0;
				local42 += local51;
			}
			if (arg0 + local38 > Class1_Sub1_Sub2.anInt726) {
				local51 = arg0 + local38 - Class1_Sub1_Sub2.anInt726;
				local38 -= local51;
				local44 += local51;
				local42 += local51;
			}
			if (local38 > 0 && local35 > 0) {
				this.method416(this.anIntArray207, local38, this.aByteArray7, local17, local42, local35, Class1_Sub1_Sub2.anIntArray218, local19, local44);
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("50792, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([II[BIZII[III)V")
	private void method416(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(15) int local15 = -(arg1 >> 2);
			@Pc(20) int local20 = -(arg1 & 0x3);
			for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
				for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
					@Pc(34) byte local34 = arg2[arg7++];
					if (local34 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg0[local34 & 0xFF];
					}
					local34 = arg2[arg7++];
					if (local34 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg0[local34 & 0xFF];
					}
					local34 = arg2[arg7++];
					if (local34 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg0[local34 & 0xFF];
					}
					local34 = arg2[arg7++];
					if (local34 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg0[local34 & 0xFF];
					}
				}
				for (@Pc(110) int local110 = local20; local110 < 0; local110++) {
					@Pc(117) byte local117 = arg2[arg7++];
					if (local117 == 0) {
						arg3++;
					} else {
						arg6[arg3++] = arg0[local117 & 0xFF];
					}
				}
				arg3 += arg4;
				arg7 += arg8;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("42453, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
