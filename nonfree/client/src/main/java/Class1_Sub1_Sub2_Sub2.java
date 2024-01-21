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

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Z")
	private boolean aBoolean162 = true;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt660 = -325;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt661 = -652;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt662 = 9244;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Z")
	private boolean aBoolean163 = true;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt663;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt666;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt663 = this.anInt667 = arg0;
		this.anInt664 = this.anInt668 = arg1;
		this.anInt665 = this.anInt666 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt663 = local20.getWidth(arg1);
			this.anInt664 = local20.getHeight(arg1);
			this.anInt667 = this.anInt663;
			this.anInt668 = this.anInt664;
			this.anInt665 = 0;
			this.anInt666 = 0;
			this.anIntArray208 = new int[this.anInt663 * this.anInt664];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt663, this.anInt664, this.anIntArray208, 0, this.anInt663);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(false, arg0.method666(arg1 + ".dat", null));
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(false, arg0.method666("index.dat", null));
		local43.anInt757 = local34.method482();
		this.anInt667 = local43.method482();
		this.anInt668 = local43.method482();
		@Pc(58) int local58 = local43.method480();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method484();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < arg2; local98++) {
			local43.anInt757 += 2;
			local34.anInt757 += local43.method482() * local43.method482();
			local43.anInt757++;
		}
		this.anInt665 = local43.method480();
		this.anInt666 = local43.method480();
		this.anInt663 = local43.method482();
		this.anInt664 = local43.method482();
		@Pc(145) int local145 = local43.method480();
		@Pc(151) int local151 = this.anInt663 * this.anInt664;
		this.anIntArray208 = new int[local151];
		@Pc(159) int local159;
		if (local145 == 0) {
			for (local159 = 0; local159 < local151; local159++) {
				this.anIntArray208[local159] = local61[local34.method480()];
			}
		} else if (local145 == 1) {
			for (local159 = 0; local159 < this.anInt663; local159++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt664; local183++) {
					this.anIntArray208[local159 + local183 * this.anInt663] = local61[local34.method480()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method386(@OriginalArg(0) int arg0) {
		try {
			Class1_Sub1_Sub2.method434(this.anInt663, this.anIntArray208, this.anInt664);
			if (arg0 == 9) {
				;
			}
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("38867, " + arg0 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray208.length; local13++) {
				@Pc(20) int local20 = this.anIntArray208[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg1;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg2;
					if (local50 < 1) {
						local50 = 1;
					} else if (local50 > 255) {
						local50 = 255;
					}
					@Pc(70) int local70 = local20 & 0xFF;
					local70 += arg0;
					if (local70 < 1) {
						local70 = 1;
					} else if (local70 > 255) {
						local70 = 255;
					}
					this.anIntArray208[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("66035, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)V")
	public void method388() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt667 * this.anInt668];
			for (@Pc(10) int local10 = 0; local10 < this.anInt664; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt663; local14++) {
					local8[(local10 + this.anInt666) * this.anInt667 + local14 + this.anInt665] = this.anIntArray208[local10 * this.anInt663 + local14];
				}
			}
			this.anIntArray208 = local8;
			this.anInt663 = this.anInt667;
			this.anInt664 = this.anInt668;
			this.anInt665 = 0;
			this.anInt666 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("654, " + 0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
	public void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt665;
			arg1 += this.anInt666;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub1_Sub2.anInt712;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt664;
			@Pc(26) int local26 = this.anInt663;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt712 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt714) {
				local39 = Class1_Sub1_Sub2.anInt714 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt714;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt712;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt715) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt715;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt716) {
				local39 = Class1_Sub1_Sub2.anInt716 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt716;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt717) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt717;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method390(local30, local18, this.anIntArray208, local23, local20, Class1_Sub1_Sub2.anIntArray213, local32, local26);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("1052, " + false + ", " + arg0 + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII[III[III)V")
	private void method390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(21) int local21 = -(arg7 & 0x3);
			for (@Pc(24) int local24 = -arg3; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg5[arg1++] = arg2[arg4++];
					arg5[arg1++] = arg2[arg4++];
					arg5[arg1++] = arg2[arg4++];
					arg5[arg1++] = arg2[arg4++];
				}
				for (@Pc(67) int local67 = local21; local67 < 0; local67++) {
					arg5[arg1++] = arg2[arg4++];
				}
				arg1 += arg0;
				arg4 += arg6;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("34147, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt665;
			arg0 += this.anInt666;
			@Pc(25) int local25 = arg1 + arg0 * Class1_Sub1_Sub2.anInt712;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt664;
			@Pc(33) int local33 = this.anInt663;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt712 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub2.anInt714) {
				local46 = Class1_Sub1_Sub2.anInt714 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt714;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt712;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt715) {
				local30 -= arg0 + local30 - Class1_Sub1_Sub2.anInt715;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt716) {
				local46 = Class1_Sub1_Sub2.anInt716 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt716;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt717) {
				local46 = arg1 + local33 - Class1_Sub1_Sub2.anInt717;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method392(Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local27, local25, local33, local30, local37, local39);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("9489, " + arg0 + ", " + arg1 + ", " + -47687 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IIII)V")
	public void method393(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt665;
			arg1 += this.anInt666;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt712;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt664;
			@Pc(23) int local23 = this.anInt663;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt712 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt714) {
				local36 = Class1_Sub1_Sub2.anInt714 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt714;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt712;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt715) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt715;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt716) {
				local36 = Class1_Sub1_Sub2.anInt716 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt716;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt717) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt717;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method394(local27, this.anIntArray208, local17, local23, 0, local20, Class1_Sub1_Sub2.anIntArray213, local15, local29);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("78487, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIIII[IIIII)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg5; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg1[arg2++];
					if (local20 == 0) {
						arg7++;
					} else {
						@Pc(26) int local26 = arg6[arg7];
						arg6[arg7++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg7 += arg0;
				arg2 += arg8;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("82659, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -8178 + ", " + arg8 + ", " + 128 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBII[II[IIIII)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(17) int local17 = -arg6 / 2;
				@Pc(22) int local22 = -arg2 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg0 >> 8;
				@Pc(52) int local52 = local40 * arg0 >> 8;
				@Pc(64) int local64 = (arg8 << 16) + local22 * local46 + local17 * local52;
				@Pc(76) int local76 = (arg7 << 16) + (local22 * local52 - local17 * local46);
				@Pc(82) int local82 = arg4 + arg9 * Class1_Sub1_Sub2.anInt712;
				for (@Pc(84) int local84 = 0; local84 < arg2; local84++) {
					@Pc(90) int local90 = arg5[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg3[local84]; local111 < 0; local111++) {
						Class1_Sub1_Sub2.anIntArray213[local94++] = this.anIntArray208[(local100 >> 16) + (local106 >> 16) * this.anInt663];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class1_Sub1_Sub2.anInt712;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("510, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBIIIDI)V")
	public void method396(@OriginalArg(5) int arg0, @OriginalArg(7) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg0 + arg2 * Class1_Sub1_Sub2.anInt712;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray208[(local83 >> 16) + (local85 >> 16) * this.anInt663];
						if (local104 == 0) {
							local81++;
						} else {
							Class1_Sub1_Sub2.anIntArray213[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class1_Sub1_Sub2.anInt712;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("75356, " + 15 + ", " + 15 + ", " + 256 + ", " + 4 + ", " + 20 + ", " + arg0 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!jb;III)V")
	public void method397(@OriginalArg(0) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt665;
			arg2 += this.anInt666;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub1_Sub2.anInt712;
			@Pc(17) int local17 = 0;
			if (this.anInt662 != 9244) {
				this.aBoolean163 = !this.aBoolean163;
			}
			@Pc(32) int local32 = this.anInt664;
			@Pc(35) int local35 = this.anInt663;
			@Pc(39) int local39 = Class1_Sub1_Sub2.anInt712 - local35;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48;
			if (arg2 < Class1_Sub1_Sub2.anInt714) {
				local48 = Class1_Sub1_Sub2.anInt714 - arg2;
				local32 -= local48;
				arg2 = Class1_Sub1_Sub2.anInt714;
				local17 = local48 * local35 + 0;
				local15 += local48 * Class1_Sub1_Sub2.anInt712;
			}
			if (arg2 + local32 > Class1_Sub1_Sub2.anInt715) {
				local32 -= arg2 + local32 - Class1_Sub1_Sub2.anInt715;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt716) {
				local48 = Class1_Sub1_Sub2.anInt716 - arg1;
				local35 -= local48;
				arg1 = Class1_Sub1_Sub2.anInt716;
				local17 += local48;
				local15 += local48;
				local41 = local48 + 0;
				local39 += local48;
			}
			if (arg1 + local35 > Class1_Sub1_Sub2.anInt717) {
				local48 = arg1 + local35 - Class1_Sub1_Sub2.anInt717;
				local35 -= local48;
				local41 += local48;
				local39 += local48;
			}
			if (local35 > 0 && local32 > 0) {
				this.method398(local41, local17, arg0.aByteArray7, local32, this.anIntArray208, 0, local35, local39, Class1_Sub1_Sub2.anIntArray213, local15);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("94062, " + arg0 + ", " + arg1 + ", " + 9244 + ", " + arg2 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[BI[IIII[II)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(14) int local14 = -arg3; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg4[arg1++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg8[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg4[arg1++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg8[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg4[arg1++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg8[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg4[arg1++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg8[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg4[arg1++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg8[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				arg9 += arg7;
				arg1 += arg0;
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("25618, " + arg0 + ", " + 2 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}
}
