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
	private int anInt682 = -25580;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean136 = true;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt683 = 668;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public int[] anIntArray198;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt684;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt685;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	private int anInt687;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray198 = new int[arg0 * arg1];
		this.anInt684 = this.anInt688 = arg0;
		this.anInt685 = this.anInt689 = arg1;
		this.anInt686 = this.anInt687 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt684 = local20.getWidth(arg1);
			this.anInt685 = local20.getHeight(arg1);
			this.anInt688 = this.anInt684;
			this.anInt689 = this.anInt685;
			this.anInt686 = 0;
			this.anInt687 = 0;
			this.anIntArray198 = new int[this.anInt684 * this.anInt685];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt684, this.anInt685, this.anIntArray198, 0, this.anInt684);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class45 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(699, arg0.method639(arg1 + ".dat", null));
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(699, arg0.method639("index.dat", null));
		local43.anInt771 = local34.method469();
		this.anInt688 = local43.method469();
		this.anInt689 = local43.method469();
		@Pc(58) int local58 = local43.method467();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method471();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt771 += 2;
			local34.anInt771 += local43.method469() * local43.method469();
			local43.anInt771++;
		}
		this.anInt686 = local43.method467();
		this.anInt687 = local43.method467();
		this.anInt684 = local43.method469();
		this.anInt685 = local43.method469();
		@Pc(139) int local139 = local43.method467();
		@Pc(145) int local145 = this.anInt684 * this.anInt685;
		this.anIntArray198 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray198[local153] = local61[local34.method467()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt684; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt685; local177++) {
					this.anIntArray198[local153 + local177 * this.anInt684] = local61[local34.method467()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method390() {
		try {
			Class1_Sub1_Sub2.method432(this.anInt685, this.anInt684, this.anIntArray198);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("45681, " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray198.length; local3++) {
				@Pc(10) int local10 = this.anIntArray198[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg0;
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
					local60 += arg2;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray198[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("40673, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt686;
			arg1 += this.anInt687;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt685;
			@Pc(23) int local23 = this.anInt684;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt734 - local23;
			@Pc(29) int local29 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local40 = Class1_Sub1_Sub2.anInt736 - arg1;
				local20 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local17 = local40 * local23 + 0;
				local15 += local40 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt737) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local40 = Class1_Sub1_Sub2.anInt738 - arg0;
				local23 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local17 += local40;
				local15 += local40;
				local29 = local40 + 0;
				local27 += local40;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt739) {
				local40 = arg0 + local23 - Class1_Sub1_Sub2.anInt739;
				local23 -= local40;
				local29 += local40;
				local27 += local40;
			}
			if (local23 > 0 && local20 > 0) {
				this.method393(local20, local17, local15, local23, local27, local29, this.anIntArray198, Class1_Sub1_Sub2.anIntArray205);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("79168, " + arg0 + ", " + arg1 + ", " + -7650 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIII[I[I)V")
	private void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(23) int local23 = -arg0; local23 < 0; local23++) {
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					arg7[arg2++] = arg6[arg1++];
					arg7[arg2++] = arg6[arg1++];
					arg7[arg2++] = arg6[arg1++];
					arg7[arg2++] = arg6[arg1++];
				}
				for (@Pc(66) int local66 = local11; local66 < 0; local66++) {
					arg7[arg2++] = arg6[arg1++];
				}
				arg2 += arg4;
				arg1 += arg5;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("29839, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt686;
			arg1 += this.anInt687;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt685;
			@Pc(26) int local26 = this.anInt684;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt734 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local39 = Class1_Sub1_Sub2.anInt736 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt737) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local39 = Class1_Sub1_Sub2.anInt738 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt739) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt739;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method395(Class1_Sub1_Sub2.anIntArray205, this.anIntArray198, local20, local18, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("33864, " + arg0 + ", " + arg1 + ", " + 373 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method395(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII)V")
	public void method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(5) int local5 = this.anInt684;
				@Pc(8) int local8 = this.anInt685;
				@Pc(10) int local10 = 0;
				@Pc(12) int local12 = 0;
				@Pc(27) int local27 = this.anInt688;
				@Pc(30) int local30 = this.anInt689;
				@Pc(36) int local36 = (local27 << 16) / 22;
				@Pc(42) int local42 = (local30 << 16) / 22;
				arg3 = (this.anInt686 * 22 + local27 - 1) / local27 + 5;
				arg1 = (this.anInt687 * 22 + local30 - 1) / local30 + 5;
				if (this.anInt686 * 22 % local27 != 0) {
					local10 = (local27 - this.anInt686 * 22 % local27 << 16) / 22;
				}
				if (this.anInt687 * 22 % local30 != 0) {
					local12 = (local30 - this.anInt687 * 22 % local30 << 16) / 22;
				}
				arg2 = (this.anInt684 - (local10 >> 16)) * 22 / local27;
				arg0 = (this.anInt685 - (local12 >> 16)) * 22 / local30;
				@Pc(136) int local136 = arg3 + arg1 * Class1_Sub1_Sub2.anInt734;
				@Pc(140) int local140 = Class1_Sub1_Sub2.anInt734 - arg2;
				@Pc(147) int local147;
				if (arg1 < Class1_Sub1_Sub2.anInt736) {
					local147 = Class1_Sub1_Sub2.anInt736 - arg1;
					arg0 -= local147;
					arg1 = 0;
					local136 += local147 * Class1_Sub1_Sub2.anInt734;
					local12 += local42 * local147;
				}
				if (arg1 + arg0 > Class1_Sub1_Sub2.anInt737) {
					arg0 -= arg1 + arg0 - Class1_Sub1_Sub2.anInt737;
				}
				if (arg3 < Class1_Sub1_Sub2.anInt738) {
					local147 = Class1_Sub1_Sub2.anInt738 - arg3;
					arg2 -= local147;
					arg3 = 0;
					local136 += local147;
					local10 += local36 * local147;
					local140 += local147;
				}
				if (arg3 + arg2 > Class1_Sub1_Sub2.anInt739) {
					local147 = arg3 + arg2 - Class1_Sub1_Sub2.anInt739;
					arg2 -= local147;
					local140 += local147;
				}
				this.method397(Class1_Sub1_Sub2.anIntArray205, local140, local12, arg2, 0, local136, local10, this.anIntArray198, local5, arg0, local42, local36);
			} catch (@Pc(242) Exception local242) {
				System.out.println("error in sprite clipping routine");
			}
		} catch (@Pc(247) RuntimeException local247) {
			signlink.reporterror("67190, " + arg0 + ", " + arg1 + ", " + 302 + ", " + arg2 + ", " + arg3 + ", " + local247.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIIIII[IIIIZI)V")
	private void method397(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		try {
			try {
				@Pc(12) int local12 = arg6;
				for (@Pc(15) int local15 = -arg9; local15 < 0; local15++) {
					@Pc(23) int local23 = (arg2 >> 16) * arg8;
					for (@Pc(26) int local26 = -arg3; local26 < 0; local26++) {
						@Pc(36) int local36 = arg7[(arg6 >> 16) + local23];
						if (local36 == 0) {
							arg5++;
						} else {
							arg0[arg5++] = local36;
						}
						arg6 += arg11;
					}
					arg2 += arg10;
					arg6 = local12;
					arg5 += arg1;
				}
			} catch (@Pc(68) Exception local68) {
				System.out.println("error in plot_scale");
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("48502, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + true + ", " + arg11 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
	public void method398(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt686;
			arg1 += this.anInt687;
			@Pc(25) int local25 = arg0 + arg1 * Class1_Sub1_Sub2.anInt734;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt685;
			@Pc(33) int local33 = this.anInt684;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt734 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt736) {
				local46 = Class1_Sub1_Sub2.anInt736 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt736;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt737) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt738) {
				local46 = Class1_Sub1_Sub2.anInt738 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt738;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt739) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt739;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method399(local37, local30, local27, local33, 0, local39, Class1_Sub1_Sub2.anIntArray205, this.anIntArray198, local25);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("49695, " + 128 + ", " + arg0 + ", " + arg1 + ", " + 1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BIIIIII[I[III)V")
	private void method399(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg1; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg7[arg2++];
					if (local20 == 0) {
						arg8++;
					} else {
						@Pc(26) int local26 = arg6[arg8];
						arg6[arg8++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg0;
				arg2 += arg5;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("43121, " + 34 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[IIIII[IIIII)V")
	public void method400(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg8 / 2;
				@Pc(20) int local20 = -arg5 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg0 >> 8;
				@Pc(50) int local50 = local38 * arg0 >> 8;
				@Pc(62) int local62 = (arg2 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg3 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg4 + arg9 * Class1_Sub1_Sub2.anInt734;
				for (@Pc(82) int local82 = 0; local82 < arg5; local82++) {
					@Pc(88) int local88 = arg6[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg1[local82]; local109 < 0; local109++) {
						Class1_Sub1_Sub2.anIntArray205[local92++] = this.anIntArray198[(local98 >> 16) + (local104 >> 16) * this.anInt684];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub1_Sub2.anInt734;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("24819, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + -634 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lclient!kb;ZII)V")
	public void method401(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt686;
			arg2 += this.anInt687;
			@Pc(20) int local20 = arg1 + arg2 * Class1_Sub1_Sub2.anInt734;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt685;
			@Pc(28) int local28 = this.anInt684;
			@Pc(32) int local32 = Class1_Sub1_Sub2.anInt734 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg2 < Class1_Sub1_Sub2.anInt736) {
				local41 = Class1_Sub1_Sub2.anInt736 - arg2;
				local25 -= local41;
				arg2 = Class1_Sub1_Sub2.anInt736;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class1_Sub1_Sub2.anInt734;
			}
			if (arg2 + local25 > Class1_Sub1_Sub2.anInt737) {
				local25 -= arg2 + local25 - Class1_Sub1_Sub2.anInt737;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt738) {
				local41 = Class1_Sub1_Sub2.anInt738 - arg1;
				local28 -= local41;
				arg1 = Class1_Sub1_Sub2.anInt738;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg1 + local28 > Class1_Sub1_Sub2.anInt739) {
				local41 = arg1 + local28 - Class1_Sub1_Sub2.anInt739;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method402(local22, local20, local28, Class1_Sub1_Sub2.anIntArray205, local25, 0, local32, this.anIntArray198, arg0.aByteArray7, local34);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("70331, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIB[IIII[I[BI)V")
	private void method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(20) int local20 = -arg4; local20 < 0; local20++) {
				@Pc(31) int local31;
				for (@Pc(24) int local24 = local6; local24 < 0; local24++) {
					local31 = arg7[arg0++];
					if (local31 != 0 && arg8[arg1] == 0) {
						arg3[arg1++] = local31;
					} else {
						arg1++;
					}
					local31 = arg7[arg0++];
					if (local31 != 0 && arg8[arg1] == 0) {
						arg3[arg1++] = local31;
					} else {
						arg1++;
					}
					local31 = arg7[arg0++];
					if (local31 != 0 && arg8[arg1] == 0) {
						arg3[arg1++] = local31;
					} else {
						arg1++;
					}
					local31 = arg7[arg0++];
					if (local31 != 0 && arg8[arg1] == 0) {
						arg3[arg1++] = local31;
					} else {
						arg1++;
					}
				}
				for (@Pc(107) int local107 = local11; local107 < 0; local107++) {
					local31 = arg7[arg0++];
					if (local31 != 0 && arg8[arg1] == 0) {
						arg3[arg1++] = local31;
					} else {
						arg1++;
					}
				}
				arg1 += arg6;
				arg0 += arg9;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("78387, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 69 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
