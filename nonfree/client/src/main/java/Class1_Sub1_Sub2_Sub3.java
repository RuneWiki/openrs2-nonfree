import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt687 = -971;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt688 = -182;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt693;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class1_Sub1_Sub3 local28 = new Class1_Sub1_Sub3(false, arg0.method666(arg1 + ".dat", null));
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(false, arg0.method666("index.dat", null));
		local37.anInt757 = local28.method482();
		this.anInt693 = local37.method482();
		this.anInt694 = local37.method482();
		@Pc(52) int local52 = local37.method480();
		this.anIntArray212 = new int[local52];
		for (@Pc(58) int local58 = 0; local58 < local52 - 1; local58++) {
			this.anIntArray212[local58 + 1] = local37.method484();
		}
		for (@Pc(76) int local76 = 0; local76 < arg2; local76++) {
			local37.anInt757 += 2;
			local28.anInt757 += local37.method482() * local37.method482();
			local37.anInt757++;
		}
		this.anInt691 = local37.method480();
		this.anInt692 = local37.method480();
		this.anInt689 = local37.method482();
		this.anInt690 = local37.method482();
		@Pc(123) int local123 = local37.method480();
		@Pc(129) int local129 = this.anInt689 * this.anInt690;
		this.aByteArray7 = new byte[local129];
		@Pc(137) int local137;
		if (local123 == 0) {
			for (local137 = 0; local137 < local129; local137++) {
				this.aByteArray7[local137] = local28.method481();
			}
		} else if (local123 == 1) {
			for (local137 = 0; local137 < this.anInt689; local137++) {
				for (@Pc(159) int local159 = 0; local159 < this.anInt690; local159++) {
					this.aByteArray7[local137 + local159 * this.anInt689] = local28.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method413(@OriginalArg(0) byte arg0) {
		try {
			this.anInt693 /= 2;
			this.anInt694 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt693 * this.anInt694];
			@Pc(22) int local22 = 0;
			@Pc(27) boolean local27 = false;
			for (@Pc(38) int local38 = 0; local38 < this.anInt690; local38++) {
				for (@Pc(42) int local42 = 0; local42 < this.anInt689; local42++) {
					local20[(local42 + this.anInt691 >> 1) + (local38 + this.anInt692 >> 1) * this.anInt693] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt689 = this.anInt693;
			this.anInt690 = this.anInt694;
			this.anInt691 = 0;
			this.anInt692 = 0;
		} catch (@Pc(96) RuntimeException local96) {
			signlink.reporterror("26681, " + arg0 + ", " + local96.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
	public void method414(@OriginalArg(0) boolean arg0) {
		try {
			if (this.anInt689 != this.anInt693 || this.anInt690 != this.anInt694) {
				@Pc(19) byte[] local19 = new byte[this.anInt693 * this.anInt694];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt690; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt689; local27++) {
						local19[local27 + this.anInt691 + (local23 + this.anInt692) * this.anInt693] = this.aByteArray7[local21++];
					}
				}
				this.aByteArray7 = local19;
				this.anInt689 = this.anInt693;
				this.anInt690 = this.anInt694;
				this.anInt691 = 0;
				this.anInt692 = 0;
				if (!arg0) {
					this.anInt687 = -59;
				}
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("48380, " + arg0 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(Z)V")
	public void method415() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt689 * this.anInt690];
			@Pc(10) int local10 = 0;
			for (@Pc(12) int local12 = 0; local12 < this.anInt690; local12++) {
				for (@Pc(19) int local19 = this.anInt689 - 1; local19 >= 0; local19--) {
					local8[local10++] = this.aByteArray7[local19 + local12 * this.anInt689];
				}
			}
			this.aByteArray7 = local8;
			this.anInt691 = this.anInt693 - this.anInt689 - this.anInt691;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("29965, " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public void method416() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt689 * this.anInt690];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt690 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt689; local19++) {
					local8[local10++] = this.aByteArray7[local19 + local15 * this.anInt689];
				}
			}
			this.aByteArray7 = local8;
			this.anInt692 = this.anInt694 - this.anInt690 - this.anInt692;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("53095, " + -127 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray212.length; local3++) {
				@Pc(14) int local14 = this.anIntArray212[local3] >> 16 & 0xFF;
				local14 += arg1;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray212[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray212[local3] & 0xFF;
				local60 += arg0;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray212[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("85814, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt691;
			arg0 += this.anInt692;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt712;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt690;
			@Pc(23) int local23 = this.anInt689;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt712 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub2.anInt714) {
				local40 = Class1_Sub1_Sub2.anInt714 - arg0;
				local20 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt714;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class1_Sub1_Sub2.anInt712;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt715) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt715;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt716) {
				local40 = Class1_Sub1_Sub2.anInt716 - arg1;
				local23 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt716;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt717) {
				local40 = arg1 + local23 - Class1_Sub1_Sub2.anInt717;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method419(local15, local29, local27, local20, local23, this.aByteArray7, this.anIntArray212, Class1_Sub1_Sub2.anIntArray213, local17);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("97538, " + arg0 + ", " + arg1 + ", " + -47687 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZIIIII[B[I[II)V")
	private void method419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(17) int local17 = -arg3; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					@Pc(28) byte local28 = arg5[arg8++];
					if (local28 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg6[local28 & 0xFF];
					}
					local28 = arg5[arg8++];
					if (local28 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg6[local28 & 0xFF];
					}
					local28 = arg5[arg8++];
					if (local28 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg6[local28 & 0xFF];
					}
					local28 = arg5[arg8++];
					if (local28 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg6[local28 & 0xFF];
					}
				}
				for (@Pc(104) int local104 = local11; local104 < 0; local104++) {
					@Pc(111) byte local111 = arg5[arg8++];
					if (local111 == 0) {
						arg0++;
					} else {
						arg7[arg0++] = arg6[local111 & 0xFF];
					}
				}
				arg0 += arg2;
				arg8 += arg1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("81137, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
