import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private int anInt716 = 22986;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
	public int anInt721;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	private int anInt722;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "[I")
	public int[] anIntArray200;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
	public int anInt719;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
	public int anInt720;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	public int anInt717;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
	public int anInt718;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class45 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class1_Sub1_Sub3 local25 = new Class1_Sub1_Sub3(699, arg0.method639(arg1 + ".dat", null));
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(699, arg0.method639("index.dat", null));
		local34.anInt771 = local25.method469();
		this.anInt721 = local34.method469();
		this.anInt722 = local34.method469();
		@Pc(49) int local49 = local34.method467();
		this.anIntArray200 = new int[local49];
		for (@Pc(55) int local55 = 0; local55 < local49 - 1; local55++) {
			this.anIntArray200[local55 + 1] = local34.method471();
		}
		for (@Pc(73) int local73 = 0; local73 < arg2; local73++) {
			local34.anInt771 += 2;
			local25.anInt771 += local34.method469() * local34.method469();
			local34.anInt771++;
		}
		this.anInt719 = local34.method467();
		this.anInt720 = local34.method467();
		this.anInt717 = local34.method469();
		this.anInt718 = local34.method469();
		@Pc(120) int local120 = local34.method467();
		@Pc(126) int local126 = this.anInt717 * this.anInt718;
		this.aByteArray7 = new byte[local126];
		@Pc(134) int local134;
		if (local120 == 0) {
			for (local134 = 0; local134 < local126; local134++) {
				this.aByteArray7[local134] = local25.method468();
			}
		} else if (local120 == 1) {
			for (local134 = 0; local134 < this.anInt717; local134++) {
				for (@Pc(156) int local156 = 0; local156 < this.anInt718; local156++) {
					this.aByteArray7[local134 + local156 * this.anInt717] = local25.method468();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method417() {
		try {
			this.anInt721 /= 2;
			this.anInt722 /= 2;
			@Pc(23) byte[] local23 = new byte[this.anInt721 * this.anInt722];
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = 0; local27 < this.anInt718; local27++) {
				for (@Pc(31) int local31 = 0; local31 < this.anInt717; local31++) {
					local23[(local31 + this.anInt719 >> 1) + (local27 + this.anInt720 >> 1) * this.anInt721] = this.aByteArray7[local25++];
				}
			}
			this.aByteArray7 = local23;
			this.anInt717 = this.anInt721;
			this.anInt718 = this.anInt722;
			this.anInt719 = 0;
			this.anInt720 = 0;
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("70440, " + true + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method418(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt717 != this.anInt721 || this.anInt718 != this.anInt722) {
				@Pc(19) byte[] local19 = new byte[this.anInt721 * this.anInt722];
				@Pc(21) int local21 = 0;
				for (@Pc(23) int local23 = 0; local23 < this.anInt718; local23++) {
					for (@Pc(27) int local27 = 0; local27 < this.anInt717; local27++) {
						local19[local27 + this.anInt719 + (local23 + this.anInt720) * this.anInt721] = this.aByteArray7[local21++];
					}
				}
				if (arg0 == 0) {
					this.aByteArray7 = local19;
					this.anInt717 = this.anInt721;
					this.anInt718 = this.anInt722;
					this.anInt719 = 0;
					this.anInt720 = 0;
				}
			}
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("87185, " + arg0 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method419() {
		try {
			@Pc(8) byte[] local8 = new byte[this.anInt717 * this.anInt718];
			@Pc(10) int local10 = 0;
			for (@Pc(22) int local22 = 0; local22 < this.anInt718; local22++) {
				for (@Pc(29) int local29 = this.anInt717 - 1; local29 >= 0; local29--) {
					local8[local10++] = this.aByteArray7[local29 + local22 * this.anInt717];
				}
			}
			this.aByteArray7 = local8;
			this.anInt719 = this.anInt721 - this.anInt717 - this.anInt719;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("4315, " + 123 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method420() {
		try {
			@Pc(17) byte[] local17 = new byte[this.anInt717 * this.anInt718];
			@Pc(19) int local19 = 0;
			for (@Pc(24) int local24 = this.anInt718 - 1; local24 >= 0; local24--) {
				for (@Pc(28) int local28 = 0; local28 < this.anInt717; local28++) {
					local17[local19++] = this.aByteArray7[local28 + local24 * this.anInt717];
				}
			}
			this.aByteArray7 = local17;
			this.anInt720 = this.anInt722 - this.anInt718 - this.anInt720;
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("32075, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V")
	public void method421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray200.length; local3++) {
				@Pc(14) int local14 = this.anIntArray200[local3] >> 16 & 0xFF;
				local14 += arg0;
				if (local14 < 0) {
					local14 = 0;
				} else if (local14 > 255) {
					local14 = 255;
				}
				@Pc(38) int local38 = this.anIntArray200[local3] >> 8 & 0xFF;
				local38 += arg1;
				if (local38 < 0) {
					local38 = 0;
				} else if (local38 > 255) {
					local38 = 255;
				}
				@Pc(60) int local60 = this.anIntArray200[local3] & 0xFF;
				local60 += arg2;
				if (local60 < 0) {
					local60 = 0;
				} else if (local60 > 255) {
					local60 = 255;
				}
				this.anIntArray200[local3] = (local14 << 16) + (local38 << 8) + local60;
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("58586, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)V")
	public void method422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt719;
			@Pc(8) boolean local8 = false;
			arg1 += this.anInt720;
			@Pc(19) int local19 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt718;
			@Pc(27) int local27 = this.anInt717;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt734 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local40 = Class1_Sub1_Sub2.anInt736 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + local24 > Class1_Sub1_Sub2.anInt737) {
				local24 -= arg1 + local24 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local40 = Class1_Sub1_Sub2.anInt738 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub1_Sub2.anInt739) {
				local40 = arg0 + local27 - Class1_Sub1_Sub2.anInt739;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method423(Class1_Sub1_Sub2.anIntArray205, local24, this.aByteArray7, local19, local21, local27, this.anIntArray200, local31, local33);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("20717, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[II[BIII[III)V")
	private void method423(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(18) int local18 = -arg1; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					@Pc(29) byte local29 = arg2[arg4++];
					if (local29 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg6[local29 & 0xFF];
					}
					local29 = arg2[arg4++];
					if (local29 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg6[local29 & 0xFF];
					}
					local29 = arg2[arg4++];
					if (local29 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg6[local29 & 0xFF];
					}
					local29 = arg2[arg4++];
					if (local29 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg6[local29 & 0xFF];
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					@Pc(112) byte local112 = arg2[arg4++];
					if (local112 == 0) {
						arg3++;
					} else {
						arg0[arg3++] = arg6[local112 & 0xFF];
					}
				}
				arg3 += arg7;
				arg4 += arg8;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("86183, " + 115 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
