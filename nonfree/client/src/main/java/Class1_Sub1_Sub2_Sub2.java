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

@OriginalClass("client!jb")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	private int anInt681 = 397;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
	private int anInt682 = 945;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt683 = -66;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt684 = 663;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt685;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray198 = new int[arg0 * arg1];
		this.anInt685 = this.anInt689 = arg0;
		this.anInt686 = this.anInt690 = arg1;
		this.anInt687 = this.anInt688 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt685 = local20.getWidth(arg1);
			this.anInt686 = local20.getHeight(arg1);
			this.anInt689 = this.anInt685;
			this.anInt690 = this.anInt686;
			this.anInt687 = 0;
			this.anInt688 = 0;
			this.anIntArray198 = new int[this.anInt685 * this.anInt686];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt685, this.anInt686, this.anIntArray198, 0, this.anInt685);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method644(arg1 + ".dat", null), true);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method644("index.dat", null), true);
		local43.anInt777 = local34.method470();
		this.anInt689 = local43.method470();
		this.anInt690 = local43.method470();
		@Pc(58) int local58 = local43.method468();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method472();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt777 += 2;
			local34.anInt777 += local43.method470() * local43.method470();
			local43.anInt777++;
		}
		this.anInt687 = local43.method468();
		this.anInt688 = local43.method468();
		this.anInt685 = local43.method470();
		this.anInt686 = local43.method470();
		@Pc(139) int local139 = local43.method468();
		@Pc(145) int local145 = this.anInt685 * this.anInt686;
		this.anIntArray198 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray198[local153] = local61[local34.method468()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt685; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt686; local177++) {
					this.anIntArray198[local153 + local177 * this.anInt685] = local61[local34.method468()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method391() {
		try {
			Class1_Sub1_Sub2.method433(this.anIntArray198, this.anInt686, this.anInt685);
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("53618, " + 1 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBII)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray198.length; local13++) {
				@Pc(20) int local20 = this.anIntArray198[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg0;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg1;
					if (local50 < 1) {
						local50 = 1;
					} else if (local50 > 255) {
						local50 = 255;
					}
					@Pc(70) int local70 = local20 & 0xFF;
					local70 += arg2;
					if (local70 < 1) {
						local70 = 1;
					} else if (local70 > 255) {
						local70 = 255;
					}
					this.anIntArray198[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("27277, " + arg0 + ", " + 3 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt687;
			arg0 += this.anInt688;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt742;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt686;
			@Pc(23) int local23 = this.anInt685;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt742 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local36 = Class1_Sub1_Sub2.anInt744 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt742;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt745) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt745;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt746) {
				local36 = Class1_Sub1_Sub2.anInt746 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt746;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt747) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt747;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method394(this.anIntArray198, local27, Class1_Sub1_Sub2.anIntArray205, local20, local23, local17, local29, local15);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("78968, " + 8 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III[IIIIII)V")
	private void method394(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(14) int local14 = -arg3; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg2[arg7++] = arg0[arg5++];
					arg2[arg7++] = arg0[arg5++];
					arg2[arg7++] = arg0[arg5++];
					arg2[arg7++] = arg0[arg5++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg2[arg7++] = arg0[arg5++];
				}
				arg7 += arg1;
				arg5 += arg6;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("70117, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			arg2 += this.anInt687;
			arg0 += this.anInt688;
			@Pc(19) int local19 = arg2 + arg0 * Class1_Sub1_Sub2.anInt742;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt686;
			@Pc(27) int local27 = this.anInt685;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt742 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local40 = Class1_Sub1_Sub2.anInt744 - arg0;
				local24 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt742;
			}
			if (arg0 + local24 > Class1_Sub1_Sub2.anInt745) {
				local24 -= arg0 + local24 - Class1_Sub1_Sub2.anInt745;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt746) {
				local40 = Class1_Sub1_Sub2.anInt746 - arg2;
				local27 -= local40;
				arg2 = Class1_Sub1_Sub2.anInt746;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class1_Sub1_Sub2.anInt747) {
				local40 = arg2 + local27 - Class1_Sub1_Sub2.anInt747;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method396(Class1_Sub1_Sub2.anIntArray205, this.anIntArray198, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("83193, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method396(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIZ)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			try {
				@Pc(5) int local5 = this.anInt685;
				@Pc(8) int local8 = this.anInt686;
				@Pc(10) int local10 = 0;
				@Pc(12) int local12 = 0;
				@Pc(27) int local27 = this.anInt689;
				@Pc(30) int local30 = this.anInt690;
				@Pc(36) int local36 = (local27 << 16) / 22;
				@Pc(42) int local42 = (local30 << 16) / 22;
				arg0 = (this.anInt687 * 22 + local27 - 1) / local27 + 5;
				arg1 = (this.anInt688 * 22 + local30 - 1) / local30 + 5;
				if (this.anInt687 * 22 % local27 != 0) {
					local10 = (local27 - this.anInt687 * 22 % local27 << 16) / 22;
				}
				if (this.anInt688 * 22 % local30 != 0) {
					local12 = (local30 - this.anInt688 * 22 % local30 << 16) / 22;
				}
				arg2 = (this.anInt685 - (local10 >> 16)) * 22 / local27;
				arg3 = (this.anInt686 - (local12 >> 16)) * 22 / local30;
				@Pc(136) int local136 = arg0 + arg1 * Class1_Sub1_Sub2.anInt742;
				@Pc(140) int local140 = Class1_Sub1_Sub2.anInt742 - arg2;
				@Pc(147) int local147;
				if (arg1 < Class1_Sub1_Sub2.anInt744) {
					local147 = Class1_Sub1_Sub2.anInt744 - arg1;
					arg3 -= local147;
					arg1 = 0;
					local136 += local147 * Class1_Sub1_Sub2.anInt742;
					local12 += local42 * local147;
				}
				if (arg1 + arg3 > Class1_Sub1_Sub2.anInt745) {
					arg3 -= arg1 + arg3 - Class1_Sub1_Sub2.anInt745;
				}
				if (arg0 < Class1_Sub1_Sub2.anInt746) {
					local147 = Class1_Sub1_Sub2.anInt746 - arg0;
					arg2 -= local147;
					arg0 = 0;
					local136 += local147;
					local10 += local36 * local147;
					local140 += local147;
				}
				if (arg0 + arg2 > Class1_Sub1_Sub2.anInt747) {
					local147 = arg0 + arg2 - Class1_Sub1_Sub2.anInt747;
					arg2 -= local147;
					local140 += local147;
				}
				this.method398(0, local36, local5, 945, arg3, arg2, local140, this.anIntArray198, local136, Class1_Sub1_Sub2.anIntArray205, local12, local42, local10);
			} catch (@Pc(242) Exception local242) {
				System.out.println("error in sprite clipping routine");
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("93788, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII[II[IIII)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(7) int local7 = arg12;
				for (@Pc(10) int local10 = -arg4; local10 < 0; local10++) {
					@Pc(18) int local18 = (arg10 >> 16) * arg2;
					for (@Pc(21) int local21 = -arg5; local21 < 0; local21++) {
						@Pc(31) int local31 = arg7[(arg12 >> 16) + local18];
						if (local31 == 0) {
							arg8++;
						} else {
							arg9[arg8++] = local31;
						}
						arg12 += arg1;
					}
					arg10 += arg11;
					arg12 = local7;
					arg8 += arg6;
				}
			} catch (@Pc(63) Exception local63) {
				System.out.println("error in plot_scale");
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("44227, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method399(@OriginalArg(1) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt687;
			arg1 += this.anInt688;
			@Pc(25) int local25 = arg0 + arg1 * Class1_Sub1_Sub2.anInt742;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt686;
			@Pc(33) int local33 = this.anInt685;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt742 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt744) {
				local46 = Class1_Sub1_Sub2.anInt744 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt744;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt742;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt745) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt745;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt746) {
				local46 = Class1_Sub1_Sub2.anInt746 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt746;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt747) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt747;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method400(local33, local37, 0, local25, local27, this.anIntArray198, Class1_Sub1_Sub2.anIntArray205, local39, local30);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("54998, " + 128 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII[I[IZIII)V")
	private void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(17) int local17 = -arg8; local17 < 0; local17++) {
				for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
					@Pc(29) int local29 = arg5[arg4++];
					if (local29 == 0) {
						arg3++;
					} else {
						@Pc(35) int local35 = arg6[arg3];
						arg6[arg3++] = ((local29 & 0xFF00FF) * 128 + (local35 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local29 & 0xFF00) * 128 + (local35 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg3 += arg1;
				arg4 += arg7;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("49709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + 128 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIZI[II[III)V")
	public void method401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg2 / 2;
				@Pc(21) int local21 = -arg3 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg9 >> 8;
				@Pc(51) int local51 = local39 * arg9 >> 8;
				@Pc(63) int local63 = (arg1 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg0 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg6 + arg4 * Class1_Sub1_Sub2.anInt742;
				for (@Pc(83) int local83 = 0; local83 < arg3; local83++) {
					@Pc(89) int local89 = arg7[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg5[local83]; local110 < 0; local110++) {
						Class1_Sub1_Sub2.anIntArray205[local93++] = this.anIntArray198[(local99 >> 16) + (local105 >> 16) * this.anInt685];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub1_Sub2.anInt742;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("78803, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + true + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILclient!kb;)V")
	public void method402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt687;
			arg1 += this.anInt688;
			@Pc(24) int local24 = arg0 + arg1 * Class1_Sub1_Sub2.anInt742;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt686;
			@Pc(32) int local32 = this.anInt685;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt742 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub2.anInt744) {
				local45 = Class1_Sub1_Sub2.anInt744 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt744;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt742;
			}
			if (arg1 + local29 > Class1_Sub1_Sub2.anInt745) {
				local29 -= arg1 + local29 - Class1_Sub1_Sub2.anInt745;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt746) {
				local45 = Class1_Sub1_Sub2.anInt746 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt746;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub2.anInt747) {
				local45 = arg0 + local32 - Class1_Sub1_Sub2.anInt747;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method403(local32, local26, Class1_Sub1_Sub2.anIntArray205, local29, local38, 0, this.anIntArray198, arg2.aByteArray7, local36, local24);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("34142, " + -558 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[IIII[I[BII)V")
	private void method403(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg3; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg6[arg1++];
					if (local25 != 0 && arg7[arg9] == 0) {
						arg2[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg6[arg1++];
					if (local25 != 0 && arg7[arg9] == 0) {
						arg2[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg6[arg1++];
					if (local25 != 0 && arg7[arg9] == 0) {
						arg2[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg6[arg1++];
					if (local25 != 0 && arg7[arg9] == 0) {
						arg2[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg6[arg1++];
					if (local25 != 0 && arg7[arg9] == 0) {
						arg2[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				arg9 += arg8;
				arg1 += arg4;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("90500, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
