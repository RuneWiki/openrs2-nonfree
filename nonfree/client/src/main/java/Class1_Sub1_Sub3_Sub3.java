import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TKCVVLIT")
public final class Class1_Sub1_Sub3_Sub3 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!TKCVVLIT", name = "v", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!TKCVVLIT", name = "w", descriptor = "I")
	private int anInt710 = 6;

	@OriginalMember(owner = "client!TKCVVLIT", name = "x", descriptor = "I")
	private int anInt711 = -15216;

	@OriginalMember(owner = "client!TKCVVLIT", name = "y", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!TKCVVLIT", name = "z", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!TKCVVLIT", name = "A", descriptor = "I")
	private int anInt712 = 365;

	@OriginalMember(owner = "client!TKCVVLIT", name = "B", descriptor = "I")
	private int anInt713 = -619;

	@OriginalMember(owner = "client!TKCVVLIT", name = "I", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!TKCVVLIT", name = "J", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!TKCVVLIT", name = "D", descriptor = "[I")
	public int[] anIntArray182;

	@OriginalMember(owner = "client!TKCVVLIT", name = "G", descriptor = "I")
	public int anInt716;

	@OriginalMember(owner = "client!TKCVVLIT", name = "H", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!TKCVVLIT", name = "E", descriptor = "I")
	public int anInt714;

	@OriginalMember(owner = "client!TKCVVLIT", name = "F", descriptor = "I")
	public int anInt715;

	@OriginalMember(owner = "client!TKCVVLIT", name = "C", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!TKCVVLIT", name = "<init>", descriptor = "(Lclient!MNPBQFWE;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub3_Sub3(@OriginalArg(0) Class27 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class1_Sub1_Sub2 local40 = new Class1_Sub1_Sub2(false, arg0.method340(arg1 + ".dat", null));
		@Pc(49) Class1_Sub1_Sub2 local49 = new Class1_Sub1_Sub2(false, arg0.method340("index.dat", null));
		local49.anInt10 = local40.method24();
		this.anInt718 = local49.method24();
		this.anInt719 = local49.method24();
		@Pc(64) int local64 = local49.method22();
		this.anIntArray182 = new int[local64];
		for (@Pc(70) int local70 = 0; local70 < local64 - 1; local70++) {
			this.anIntArray182[local70 + 1] = local49.method26();
		}
		for (@Pc(88) int local88 = 0; local88 < arg2; local88++) {
			local49.anInt10 += 2;
			local40.anInt10 += local49.method24() * local49.method24();
			local49.anInt10++;
		}
		this.anInt716 = local49.method22();
		this.anInt717 = local49.method22();
		this.anInt714 = local49.method24();
		this.anInt715 = local49.method24();
		@Pc(135) int local135 = local49.method22();
		@Pc(141) int local141 = this.anInt714 * this.anInt715;
		this.aByteArray19 = new byte[local141];
		@Pc(149) int local149;
		if (local135 == 0) {
			for (local149 = 0; local149 < local141; local149++) {
				this.aByteArray19[local149] = local40.method23();
			}
		} else if (local135 == 1) {
			for (local149 = 0; local149 < this.anInt714; local149++) {
				for (@Pc(171) int local171 = 0; local171 < this.anInt715; local171++) {
					this.aByteArray19[local149 + local171 * this.anInt714] = local40.method23();
				}
			}
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "a", descriptor = "(I)V")
	public void method468() {
		try {
			this.anInt718 /= 2;
			this.anInt719 /= 2;
			@Pc(20) byte[] local20 = new byte[this.anInt718 * this.anInt719];
			if (this.anInt710 == 6) {
				@Pc(27) int local27 = 0;
				for (@Pc(29) int local29 = 0; local29 < this.anInt715; local29++) {
					for (@Pc(33) int local33 = 0; local33 < this.anInt714; local33++) {
						local20[(local33 + this.anInt716 >> 1) + (local29 + this.anInt717 >> 1) * this.anInt718] = this.aByteArray19[local27++];
					}
				}
				this.aByteArray19 = local20;
				this.anInt714 = this.anInt718;
				this.anInt715 = this.anInt719;
				this.anInt716 = 0;
				this.anInt717 = 0;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("2943, " + 6 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "b", descriptor = "(I)V")
	public void method469() {
		try {
			if (this.anInt714 != this.anInt718 || this.anInt715 != this.anInt719) {
				@Pc(19) byte[] local19 = new byte[this.anInt718 * this.anInt719];
				@Pc(21) int local21 = 0;
				@Pc(27) int local27;
				for (@Pc(23) int local23 = 0; local23 < this.anInt715; local23++) {
					for (local27 = 0; local27 < this.anInt714; local27++) {
						local19[local27 + this.anInt716 + (local23 + this.anInt717) * this.anInt718] = this.aByteArray19[local21++];
					}
				}
				this.aByteArray19 = local19;
				this.anInt714 = this.anInt718;
				this.anInt715 = this.anInt719;
				this.anInt716 = 0;
				this.anInt717 = 0;
				if (this.anInt711 != -15216) {
					for (local27 = 1; local27 > 0; local27++) {
					}
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("56724, " + -15216 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "c", descriptor = "(I)V")
	public void method470() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt714 * this.anInt715];
			@Pc(10) int local10 = 0;
			for (@Pc(17) int local17 = 0; local17 < this.anInt715; local17++) {
				for (@Pc(24) int local24 = this.anInt714 - 1; local24 >= 0; local24--) {
					local8[local10++] = this.aByteArray19[local24 + local17 * this.anInt714];
				}
			}
			this.aByteArray19 = local8;
			this.anInt716 = this.anInt718 - this.anInt714 - this.anInt716;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("70097, " + 418 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "d", descriptor = "(I)V")
	public void method471() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt714 * this.anInt715];
			@Pc(10) int local10 = 0;
			for (@Pc(15) int local15 = this.anInt715 - 1; local15 >= 0; local15--) {
				for (@Pc(19) int local19 = 0; local19 < this.anInt714; local19++) {
					local8[local10++] = this.aByteArray19[local19 + local15 * this.anInt714];
				}
			}
			this.aByteArray19 = local8;
			this.anInt717 = this.anInt719 - this.anInt715 - this.anInt717;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("18754, " + 0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "a", descriptor = "(IIII)V")
	public void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray182.length; local3++) {
				@Pc(14) int local14 = this.anIntArray182[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray182[local3] >> 8 & 0xFF;
				local38 += arg2;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray182[local3] & 0xFF;
				local60 += arg1;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray182[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("67422, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "a", descriptor = "(IIZ)V")
	public void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt716;
			arg1 += this.anInt717;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub3.anInt772;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt715;
			@Pc(23) int local23 = this.anInt714;
			@Pc(27) int local27 = Class1_Sub1_Sub3.anInt772 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub3.anInt774) {
				local36 = Class1_Sub1_Sub3.anInt774 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub3.anInt774;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub3.anInt772;
			}
			if (arg1 + local20 > Class1_Sub1_Sub3.anInt775) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub3.anInt775;
			}
			if (arg0 < Class1_Sub1_Sub3.anInt776) {
				local36 = Class1_Sub1_Sub3.anInt776 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub3.anInt776;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub3.anInt777) {
				local36 = arg0 + local23 - Class1_Sub1_Sub3.anInt777;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method474(this.aByteArray19, local27, local29, local17, local20, this.anIntArray182, Class1_Sub1_Sub3.anIntArray208, local23, local15);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("35103, " + arg0 + ", " + arg1 + ", " + true + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKCVVLIT", name = "a", descriptor = "([BIIIII[I[III)V")
	private void method474(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					@Pc(29) byte local29 = arg0[arg3++];
					if (local29 == 0) {
						arg8++;
					} else {
						arg6[arg8++] = arg5[local29 & 0xFF];
					}
					local29 = arg0[arg3++];
					if (local29 == 0) {
						arg8++;
					} else {
						arg6[arg8++] = arg5[local29 & 0xFF];
					}
					local29 = arg0[arg3++];
					if (local29 == 0) {
						arg8++;
					} else {
						arg6[arg8++] = arg5[local29 & 0xFF];
					}
					local29 = arg0[arg3++];
					if (local29 == 0) {
						arg8++;
					} else {
						arg6[arg8++] = arg5[local29 & 0xFF];
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					@Pc(112) byte local112 = arg0[arg3++];
					if (local112 == 0) {
						arg8++;
					} else {
						arg6[arg8++] = arg5[local112 & 0xFF];
					}
				}
				arg8 += arg1;
				arg3 += arg2;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("72900, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -26981 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
