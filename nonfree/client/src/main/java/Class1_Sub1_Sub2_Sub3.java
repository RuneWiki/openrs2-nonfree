import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt674;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean169 = true;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt679;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	private int anInt680;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public int[] anIntArray212;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt677;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt678;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), -26728);
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), -26728);
		local40.anInt742 = local31.method482();
		this.anInt679 = local40.method482();
		this.anInt680 = local40.method482();
		@Pc(55) int local55 = local40.method480();
		this.anIntArray212 = new int[local55];
		for (@Pc(61) int local61 = 0; local61 < local55 - 1; local61++) {
			this.anIntArray212[local61 + 1] = local40.method484();
		}
		for (@Pc(79) int local79 = 0; local79 < arg2; local79++) {
			local40.anInt742 += 2;
			local31.anInt742 += local40.method482() * local40.method482();
			local40.anInt742++;
		}
		this.anInt677 = local40.method480();
		this.anInt678 = local40.method480();
		this.anInt675 = local40.method482();
		this.anInt676 = local40.method482();
		@Pc(126) int local126 = local40.method480();
		@Pc(132) int local132 = this.anInt675 * this.anInt676;
		this.aByteArray7 = new byte[local132];
		@Pc(140) int local140;
		if (local126 == 0) {
			for (local140 = 0; local140 < local132; local140++) {
				this.aByteArray7[local140] = local31.method481();
			}
		} else if (local126 == 1) {
			for (local140 = 0; local140 < this.anInt675; local140++) {
				for (@Pc(162) int local162 = 0; local162 < this.anInt676; local162++) {
					this.aByteArray7[local140 + local162 * this.anInt675] = local31.method481();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)V")
	public void method413() {
		try {
			this.anInt679 /= 2;
			this.anInt680 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt679 * this.anInt680];
			@Pc(22) int local22 = 0;
			for (@Pc(24) int local24 = 0; local24 < this.anInt676; local24++) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt675; local28++) {
					local20[(local28 + this.anInt677 >> 1) + (local24 + this.anInt678 >> 1) * this.anInt679] = this.aByteArray7[local22++];
				}
			}
			this.aByteArray7 = local20;
			this.anInt675 = this.anInt679;
			this.anInt676 = this.anInt680;
			this.anInt677 = 0;
			this.anInt678 = 0;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("92895, " + 34694 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method414(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt675 != this.anInt679 || this.anInt676 != this.anInt680) {
				@Pc(19) byte[] local19 = new byte[this.anInt679 * this.anInt680];
				if (arg0 == 2) {
					@Pc(25) int local25 = 0;
					for (@Pc(27) int local27 = 0; local27 < this.anInt676; local27++) {
						for (@Pc(31) int local31 = 0; local31 < this.anInt675; local31++) {
							local19[local31 + this.anInt677 + (local27 + this.anInt678) * this.anInt679] = this.aByteArray7[local25++];
						}
					}
					this.aByteArray7 = local19;
					this.anInt675 = this.anInt679;
					this.anInt676 = this.anInt680;
					this.anInt677 = 0;
					this.anInt678 = 0;
				}
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("8483, " + arg0 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method415() {
		try {
			@Pc(19) byte[] local19 = new byte[this.anInt675 * this.anInt676];
			@Pc(21) int local21 = 0;
			for (@Pc(23) int local23 = 0; local23 < this.anInt676; local23++) {
				for (@Pc(30) int local30 = this.anInt675 - 1; local30 >= 0; local30--) {
					local19[local21++] = this.aByteArray7[local30 + local23 * this.anInt675];
				}
			}
			this.aByteArray7 = local19;
			this.anInt677 = this.anInt679 - this.anInt675 - this.anInt677;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("91759, " + -72 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	public void method416() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt675 * this.anInt676];
			@Pc(10) int local10 = 0;
			for (@Pc(19) int local19 = this.anInt676 - 1; local19 >= 0; local19--) {
				for (@Pc(23) int local23 = 0; local23 < this.anInt675; local23++) {
					local8[local10++] = this.aByteArray7[local23 + local19 * this.anInt675];
				}
			}
			this.aByteArray7 = local8;
			this.anInt678 = this.anInt680 - this.anInt676 - this.anInt678;
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("55627, " + -107 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
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
			signlink.reporterror("13499, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method418(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt677;
			arg1 += this.anInt678;
			@Pc(25) int local25 = arg0 + arg1 * Class1_Sub1_Sub2.anInt695;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt676;
			@Pc(33) int local33 = this.anInt675;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt695 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt697) {
				local46 = Class1_Sub1_Sub2.anInt697 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt697;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt695;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt698) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt698;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt699) {
				local46 = Class1_Sub1_Sub2.anInt699 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt699;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt700) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt700;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method419(local37, Class1_Sub1_Sub2.anIntArray213, this.anIntArray212, this.aByteArray7, local33, local25, local39, local27, local30);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("65360, " + arg0 + ", " + arg1 + ", " + 37651 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[I[I[BBIIIII)V")
	private void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(14) int local14 = -arg8; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					@Pc(25) byte local25 = arg3[arg7++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg1[arg5++] = arg2[local25 & 0xFF];
					}
					local25 = arg3[arg7++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg1[arg5++] = arg2[local25 & 0xFF];
					}
					local25 = arg3[arg7++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg1[arg5++] = arg2[local25 & 0xFF];
					}
					local25 = arg3[arg7++];
					if (local25 == 0) {
						arg5++;
					} else {
						arg1[arg5++] = arg2[local25 & 0xFF];
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					@Pc(108) byte local108 = arg3[arg7++];
					if (local108 == 0) {
						arg5++;
					} else {
						arg1[arg5++] = arg2[local108 & 0xFF];
					}
				}
				arg5 += arg0;
				arg7 += arg6;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("95644, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 94 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
