import java.awt.Component;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub2_Sub2 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "I")
	private int anInt455 = -339;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public int anInt460;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "I")
	public int anInt456;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public int anInt457;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	private int anInt459;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	private int anInt458;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray148 = new int[arg0 * arg1];
		this.anInt456 = this.anInt460 = arg0;
		this.anInt457 = this.anInt461 = arg1;
		this.anInt458 = this.anInt459 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt456 = local17.getWidth(arg1);
			this.anInt457 = local17.getHeight(arg1);
			this.anInt460 = this.anInt456;
			this.anInt461 = this.anInt457;
			this.anInt458 = 0;
			this.anInt459 = 0;
			this.anIntArray148 = new int[this.anInt456 * this.anInt457];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt456, this.anInt457, this.anIntArray148, 0, this.anInt456);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(32) Class1_Sub3_Sub3 local32 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, arg1 + ".dat"));
		@Pc(42) Class1_Sub3_Sub3 local42 = new Class1_Sub3_Sub3((byte) 64, arg0.method536(null, "index.dat"));
		local42.anInt554 = local32.method393();
		this.anInt460 = local42.method393();
		this.anInt461 = local42.method393();
		@Pc(57) int local57 = local42.method391();
		@Pc(60) int[] local60 = new int[local57];
		for (@Pc(62) int local62 = 0; local62 < local57 - 1; local62++) {
			local60[local62 + 1] = local42.method395();
			if (local60[local62 + 1] == 0) {
				local60[local62 + 1] = 1;
			}
		}
		for (@Pc(96) int local96 = 0; local96 < arg2; local96++) {
			local42.anInt554 += 2;
			local32.anInt554 += local42.method393() * local42.method393();
			local42.anInt554++;
		}
		this.anInt458 = local42.method391();
		this.anInt459 = local42.method391();
		this.anInt456 = local42.method393();
		this.anInt457 = local42.method393();
		@Pc(143) int local143 = local42.method391();
		@Pc(149) int local149 = this.anInt456 * this.anInt457;
		this.anIntArray148 = new int[local149];
		@Pc(157) int local157;
		if (local143 == 0) {
			for (local157 = 0; local157 < local149; local157++) {
				this.anIntArray148[local157] = local60[local32.method391()];
			}
		} else if (local143 == 1) {
			for (local157 = 0; local157 < this.anInt456; local157++) {
				for (@Pc(181) int local181 = 0; local181 < this.anInt457; local181++) {
					this.anIntArray148[local157 + local181 * this.anInt456] = local60[local32.method391()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public void method318() {
		try {
			Class1_Sub3_Sub2.method354(this.anInt457, this.anIntArray148, this.anInt456);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("33750, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIII)V")
	public void method319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray148.length; local3++) {
				@Pc(10) int local10 = this.anIntArray148[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg2;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg1;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg0;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray148[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("59034, " + arg0 + ", " + arg1 + ", " + 9 + ", " + arg2 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method320(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt458;
			arg1 += this.anInt459;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt524;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt457;
			@Pc(23) int local23 = this.anInt456;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt524 - local23;
			@Pc(29) int local29 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub3_Sub2.anInt526) {
				local41 = Class1_Sub3_Sub2.anInt526 - arg1;
				local20 -= local41;
				arg1 = Class1_Sub3_Sub2.anInt526;
				local17 = local41 * local23 + 0;
				local15 += local41 * Class1_Sub3_Sub2.anInt524;
			}
			if (arg1 + local20 > Class1_Sub3_Sub2.anInt527) {
				local20 -= arg1 + local20 - Class1_Sub3_Sub2.anInt527;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt528) {
				local41 = Class1_Sub3_Sub2.anInt528 - arg0;
				local23 -= local41;
				arg0 = Class1_Sub3_Sub2.anInt528;
				local17 += local41;
				local15 += local41;
				local29 = local41 + 0;
				local27 += local41;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt529) {
				local41 = arg0 + local23 - Class1_Sub3_Sub2.anInt529;
				local23 -= local41;
				local29 += local41;
				local27 += local41;
			}
			if (local23 > 0 && local20 > 0) {
				this.method321(this.anIntArray148, local20, local15, local17, Class1_Sub3_Sub2.anIntArray178, local27, local23, local29);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("60997, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IZIII[IIII)V")
	private void method321(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(9) int local9 = -(arg6 >> 2);
			@Pc(14) int local14 = -(arg6 & 0x3);
			for (@Pc(17) int local17 = -arg1; local17 < 0; local17++) {
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					arg4[arg2++] = arg0[arg3++];
					arg4[arg2++] = arg0[arg3++];
					arg4[arg2++] = arg0[arg3++];
					arg4[arg2++] = arg0[arg3++];
				}
				for (@Pc(60) int local60 = local14; local60 < 0; local60++) {
					arg4[arg2++] = arg0[arg3++];
				}
				arg2 += arg5;
				arg3 += arg7;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("95559, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	public void method322(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt458;
			arg0 += this.anInt459;
			@Pc(27) int local27 = arg1 + arg0 * Class1_Sub3_Sub2.anInt524;
			@Pc(29) int local29 = 0;
			@Pc(32) int local32 = this.anInt457;
			@Pc(35) int local35 = this.anInt456;
			@Pc(39) int local39 = Class1_Sub3_Sub2.anInt524 - local35;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48;
			if (arg0 < Class1_Sub3_Sub2.anInt526) {
				local48 = Class1_Sub3_Sub2.anInt526 - arg0;
				local32 -= local48;
				arg0 = Class1_Sub3_Sub2.anInt526;
				local29 = local48 * local35 + 0;
				local27 += local48 * Class1_Sub3_Sub2.anInt524;
			}
			if (arg0 + local32 > Class1_Sub3_Sub2.anInt527) {
				local32 -= arg0 + local32 - Class1_Sub3_Sub2.anInt527;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt528) {
				local48 = Class1_Sub3_Sub2.anInt528 - arg1;
				local35 -= local48;
				arg1 = Class1_Sub3_Sub2.anInt528;
				local29 += local48;
				local27 += local48;
				local41 = local48 + 0;
				local39 += local48;
			}
			if (arg1 + local35 > Class1_Sub3_Sub2.anInt529) {
				local48 = arg1 + local35 - Class1_Sub3_Sub2.anInt529;
				local35 -= local48;
				local41 += local48;
				local39 += local48;
			}
			if (local35 > 0 && local32 > 0) {
				this.method323(Class1_Sub3_Sub2.anIntArray178, this.anIntArray148, local29, local27, local35, local32, local39, local41);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("30413, " + arg0 + ", " + -462 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method323(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(6) int local6 = -(arg4 >> 2);
		@Pc(11) int local11 = -(arg4 & 0x3);
		for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
			@Pc(25) int local25;
			for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			for (@Pc(85) int local85 = local11; local85 < 0; local85++) {
				local25 = arg1[arg2++];
				if (local25 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = local25;
				}
			}
			arg3 += arg6;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(IIIII)V")
	public void method324(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(11) int local11 = this.anInt456;
				@Pc(14) int local14 = this.anInt457;
				@Pc(16) int local16 = 0;
				@Pc(18) int local18 = 0;
				@Pc(33) int local33 = this.anInt460;
				@Pc(36) int local36 = this.anInt461;
				@Pc(42) int local42 = (local33 << 16) / 22;
				@Pc(48) int local48 = (local36 << 16) / 22;
				arg0 = (this.anInt458 * 22 + local33 - 1) / local33 + 5;
				arg1 = (this.anInt459 * 22 + local36 - 1) / local36 + 5;
				if (this.anInt458 * 22 % local33 != 0) {
					local16 = (local33 - this.anInt458 * 22 % local33 << 16) / 22;
				}
				if (this.anInt459 * 22 % local36 != 0) {
					local18 = (local36 - this.anInt459 * 22 % local36 << 16) / 22;
				}
				arg2 = (this.anInt456 - (local16 >> 16)) * 22 / local33;
				arg3 = (this.anInt457 - (local18 >> 16)) * 22 / local36;
				@Pc(142) int local142 = arg0 + arg1 * Class1_Sub3_Sub2.anInt524;
				@Pc(146) int local146 = Class1_Sub3_Sub2.anInt524 - arg2;
				@Pc(153) int local153;
				if (arg1 < Class1_Sub3_Sub2.anInt526) {
					local153 = Class1_Sub3_Sub2.anInt526 - arg1;
					arg3 -= local153;
					arg1 = 0;
					local142 += local153 * Class1_Sub3_Sub2.anInt524;
					local18 += local48 * local153;
				}
				if (arg1 + arg3 > Class1_Sub3_Sub2.anInt527) {
					arg3 -= arg1 + arg3 - Class1_Sub3_Sub2.anInt527;
				}
				if (arg0 < Class1_Sub3_Sub2.anInt528) {
					local153 = Class1_Sub3_Sub2.anInt528 - arg0;
					arg2 -= local153;
					arg0 = 0;
					local142 += local153;
					local16 += local42 * local153;
					local146 += local153;
				}
				if (arg0 + arg2 > Class1_Sub3_Sub2.anInt529) {
					local153 = arg0 + arg2 - Class1_Sub3_Sub2.anInt529;
					arg2 -= local153;
					local146 += local153;
				}
				this.method325(Class1_Sub3_Sub2.anIntArray178, local16, local142, local11, this.anIntArray148, local42, arg2, local18, local48, 0, local146, arg3);
			} catch (@Pc(248) Exception local248) {
				System.out.println("error in sprite clipping routine");
			}
		} catch (@Pc(253) RuntimeException local253) {
			signlink.reporterror("80248, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local253.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIZII[IIIIIIII)V")
	private void method325(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11) {
		try {
			try {
				@Pc(8) int local8 = arg1;
				for (@Pc(11) int local11 = -arg11; local11 < 0; local11++) {
					@Pc(19) int local19 = (arg7 >> 16) * arg3;
					for (@Pc(22) int local22 = -arg6; local22 < 0; local22++) {
						@Pc(32) int local32 = arg4[(arg1 >> 16) + local19];
						if (local32 == 0) {
							arg2++;
						} else {
							arg0[arg2++] = local32;
						}
						arg1 += arg5;
					}
					arg7 += arg8;
					arg1 = local8;
					arg2 += arg10;
				}
			} catch (@Pc(64) Exception local64) {
				System.out.println("error in plot_scale");
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("23158, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBII)V")
	public void method326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt458;
			arg1 += this.anInt459;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt524;
			@Pc(17) int local17 = 0;
			@Pc(31) int local31 = this.anInt457;
			@Pc(34) int local34 = this.anInt456;
			@Pc(38) int local38 = Class1_Sub3_Sub2.anInt524 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg1 < Class1_Sub3_Sub2.anInt526) {
				local47 = Class1_Sub3_Sub2.anInt526 - arg1;
				local31 -= local47;
				arg1 = Class1_Sub3_Sub2.anInt526;
				local17 = local47 * local34 + 0;
				local15 += local47 * Class1_Sub3_Sub2.anInt524;
			}
			if (arg1 + local31 > Class1_Sub3_Sub2.anInt527) {
				local31 -= arg1 + local31 - Class1_Sub3_Sub2.anInt527;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt528) {
				local47 = Class1_Sub3_Sub2.anInt528 - arg0;
				local34 -= local47;
				arg0 = Class1_Sub3_Sub2.anInt528;
				local17 += local47;
				local15 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg0 + local34 > Class1_Sub3_Sub2.anInt529) {
				local47 = arg0 + local34 - Class1_Sub3_Sub2.anInt529;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method327(local34, local17, local40, local31, local15, 0, Class1_Sub3_Sub2.anIntArray178, local38, this.anIntArray148);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("81706, " + arg0 + ", " + 34 + ", " + arg1 + ", " + 128 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIZIIIII[II[I)V")
	private void method327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(11) int local11 = -arg3; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg0; local16 < 0; local16++) {
					@Pc(23) int local23 = arg8[arg1++];
					if (local23 == 0) {
						arg4++;
					} else {
						@Pc(29) int local29 = arg6[arg4];
						arg6[arg4++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg7;
				arg1 += arg2;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("91341, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + arg3 + ", " + 128 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIII[IIIII[I)V")
	public void method328(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg7 / 2;
				@Pc(20) int local20 = -arg6 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg5 >> 8;
				@Pc(50) int local50 = local38 * arg5 >> 8;
				@Pc(62) int local62 = (arg1 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg3 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg2 + arg8 * Class1_Sub3_Sub2.anInt524;
				for (@Pc(82) int local82 = 0; local82 < arg6; local82++) {
					@Pc(88) int local88 = arg9[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg4[local82]; local109 < 0; local109++) {
						Class1_Sub3_Sub2.anIntArray178[local92++] = this.anIntArray148[(local98 >> 16) + (local104 >> 16) * this.anInt456];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub3_Sub2.anInt524;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("18214, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -163 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!ib;II)V")
	public void method329(@OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt458;
			arg2 += this.anInt459;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub3_Sub2.anInt524;
			@Pc(17) int local17 = 0;
			@Pc(29) int local29 = this.anInt457;
			@Pc(32) int local32 = this.anInt456;
			@Pc(36) int local36 = Class1_Sub3_Sub2.anInt524 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg2 < Class1_Sub3_Sub2.anInt526) {
				local45 = Class1_Sub3_Sub2.anInt526 - arg2;
				local29 -= local45;
				arg2 = Class1_Sub3_Sub2.anInt526;
				local17 = local45 * local32 + 0;
				local15 += local45 * Class1_Sub3_Sub2.anInt524;
			}
			if (arg2 + local29 > Class1_Sub3_Sub2.anInt527) {
				local29 -= arg2 + local29 - Class1_Sub3_Sub2.anInt527;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt528) {
				local45 = Class1_Sub3_Sub2.anInt528 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub3_Sub2.anInt528;
				local17 += local45;
				local15 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub3_Sub2.anInt529) {
				local45 = arg1 + local32 - Class1_Sub3_Sub2.anInt529;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method330(local29, 0, local32, local36, local15, this.anIntArray148, local38, arg0.aByteArray6, Class1_Sub3_Sub2.anIntArray178, local17);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("5864, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII[II[B[II)V")
	private void method330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(25) int local25 = -arg0; local25 < 0; local25++) {
				@Pc(36) int local36;
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					local36 = arg5[arg9++];
					if (local36 != 0 && arg7[arg4] == 0) {
						arg8[arg4++] = local36;
					} else {
						arg4++;
					}
					local36 = arg5[arg9++];
					if (local36 != 0 && arg7[arg4] == 0) {
						arg8[arg4++] = local36;
					} else {
						arg4++;
					}
					local36 = arg5[arg9++];
					if (local36 != 0 && arg7[arg4] == 0) {
						arg8[arg4++] = local36;
					} else {
						arg4++;
					}
					local36 = arg5[arg9++];
					if (local36 != 0 && arg7[arg4] == 0) {
						arg8[arg4++] = local36;
					} else {
						arg4++;
					}
				}
				for (@Pc(112) int local112 = local11; local112 < 0; local112++) {
					local36 = arg5[arg9++];
					if (local36 != 0 && arg7[arg4] == 0) {
						arg8[arg4++] = local36;
					} else {
						arg4++;
					}
				}
				arg4 += arg3;
				arg9 += arg6;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("78384, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -10520 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
