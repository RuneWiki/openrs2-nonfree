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

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt666 = -31767;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt670;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt667 = this.anInt671 = arg0;
		this.anInt668 = this.anInt672 = arg1;
		this.anInt669 = this.anInt670 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt667 = local17.getWidth(arg1);
			this.anInt668 = local17.getHeight(arg1);
			this.anInt671 = this.anInt667;
			this.anInt672 = this.anInt668;
			this.anInt669 = 0;
			this.anInt670 = 0;
			this.anIntArray208 = new int[this.anInt667 * this.anInt668];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt667, this.anInt668, this.anIntArray208, 0, this.anInt667);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(-49365, arg0.method666(arg1 + ".dat", null));
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(-49365, arg0.method666("index.dat", null));
		local40.anInt763 = local31.method482();
		this.anInt671 = local40.method482();
		this.anInt672 = local40.method482();
		@Pc(55) int local55 = local40.method480();
		@Pc(58) int[] local58 = new int[local55];
		for (@Pc(60) int local60 = 0; local60 < local55 - 1; local60++) {
			local58[local60 + 1] = local40.method484();
			if (local58[local60 + 1] == 0) {
				local58[local60 + 1] = 1;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
			local40.anInt763 += 2;
			local31.anInt763 += local40.method482() * local40.method482();
			local40.anInt763++;
		}
		this.anInt669 = local40.method480();
		this.anInt670 = local40.method480();
		this.anInt667 = local40.method482();
		this.anInt668 = local40.method482();
		@Pc(136) int local136 = local40.method480();
		@Pc(142) int local142 = this.anInt667 * this.anInt668;
		this.anIntArray208 = new int[local142];
		@Pc(150) int local150;
		if (local136 == 0) {
			for (local150 = 0; local150 < local142; local150++) {
				this.anIntArray208[local150] = local58[local31.method480()];
			}
		} else if (local136 == 1) {
			for (local150 = 0; local150 < this.anInt667; local150++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt668; local174++) {
					this.anIntArray208[local150 + local174 * this.anInt667] = local58[local31.method480()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method386() {
		try {
			Class1_Sub1_Sub2.method434(this.anInt667, this.anIntArray208, this.anInt668);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("5056, " + 6745 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray208.length; local7++) {
				@Pc(14) int local14 = this.anIntArray208[local7];
				if (local14 != 0) {
					@Pc(22) int local22 = local14 >> 16 & 0xFF;
					local22 += arg0;
					if (local22 < 1) {
						local22 = 1;
					} else if (local22 > 255) {
						local22 = 255;
					}
					@Pc(44) int local44 = local14 >> 8 & 0xFF;
					local44 += arg1;
					if (local44 < 1) {
						local44 = 1;
					} else if (local44 > 255) {
						local44 = 255;
					}
					@Pc(64) int local64 = local14 & 0xFF;
					local64 += arg2;
					if (local64 < 1) {
						local64 = 1;
					} else if (local64 > 255) {
						local64 = 255;
					}
					this.anIntArray208[local7] = (local22 << 16) + (local44 << 8) + local64;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("77589, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public void method388() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt671 * this.anInt672];
			for (@Pc(10) int local10 = 0; local10 < this.anInt668; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt667; local14++) {
					local8[(local10 + this.anInt670) * this.anInt671 + local14 + this.anInt669] = this.anIntArray208[local10 * this.anInt667 + local14];
				}
			}
			this.anIntArray208 = local8;
			this.anInt667 = this.anInt671;
			this.anInt668 = this.anInt672;
			this.anInt669 = 0;
			this.anInt670 = 0;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("50468, " + true + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt669;
			arg1 += this.anInt670;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt719;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt668;
			@Pc(23) int local23 = this.anInt667;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt719 - local23;
			@Pc(29) int local29 = 0;
			@Pc(47) int local47;
			if (arg1 < Class1_Sub1_Sub2.anInt721) {
				local47 = Class1_Sub1_Sub2.anInt721 - arg1;
				local20 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt721;
				local17 = local47 * local23 + 0;
				local15 += local47 * Class1_Sub1_Sub2.anInt719;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt722) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt723) {
				local47 = Class1_Sub1_Sub2.anInt723 - arg0;
				local23 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt723;
				local17 += local47;
				local15 += local47;
				local29 = local47 + 0;
				local27 += local47;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt724) {
				local47 = arg0 + local23 - Class1_Sub1_Sub2.anInt724;
				local23 -= local47;
				local29 += local47;
				local27 += local47;
			}
			if (local23 > 0 && local20 > 0) {
				this.method390(local20, local15, local17, local27, Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local23, local29);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("15542, " + -30783 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[I[III)V")
	private void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(24) int local24 = -arg0; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg4[arg1++] = arg5[arg2++];
					arg4[arg1++] = arg5[arg2++];
					arg4[arg1++] = arg5[arg2++];
					arg4[arg1++] = arg5[arg2++];
				}
				for (@Pc(67) int local67 = local11; local67 < 0; local67++) {
					arg4[arg1++] = arg5[arg2++];
				}
				arg1 += arg3;
				arg2 += arg7;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("76041, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZI)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt669;
			arg1 += this.anInt670;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt719;
			@Pc(17) int local17 = 0;
			@Pc(29) int local29 = this.anInt668;
			@Pc(32) int local32 = this.anInt667;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt719 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub2.anInt721) {
				local45 = Class1_Sub1_Sub2.anInt721 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt721;
				local17 = local45 * local32 + 0;
				local15 += local45 * Class1_Sub1_Sub2.anInt719;
			}
			if (arg1 + local29 > Class1_Sub1_Sub2.anInt722) {
				local29 -= arg1 + local29 - Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt723) {
				local45 = Class1_Sub1_Sub2.anInt723 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt723;
				local17 += local45;
				local15 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub2.anInt724) {
				local45 = arg0 + local32 - Class1_Sub1_Sub2.anInt724;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method392(Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local17, local15, local32, local29, local36, local38);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("67213, " + arg0 + ", " + true + ", " + arg1 + ", " + local147.toString());
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)V")
	public void method393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt669;
			arg1 += this.anInt670;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt719;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt668;
			@Pc(33) int local33 = this.anInt667;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt719 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt721) {
				local46 = Class1_Sub1_Sub2.anInt721 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt721;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt719;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt722) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt722;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt723) {
				local46 = Class1_Sub1_Sub2.anInt723 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt723;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt724) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt724;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method394(local15, local17, local37, this.anIntArray208, 0, Class1_Sub1_Sub2.anIntArray213, local33, local39, local30);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("45991, " + arg0 + ", " + 128 + ", " + arg1 + ", " + 6 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[IIZ[IIII)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg8; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg6; local16 < 0; local16++) {
					@Pc(23) int local23 = arg3[arg1++];
					if (local23 == 0) {
						arg0++;
					} else {
						@Pc(29) int local29 = arg5[arg0];
						arg5[arg0++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg2;
				arg1 += arg7;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("59488, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + false + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[IIIII[III)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(15) int local15 = -arg1 / 2;
				@Pc(20) int local20 = -arg9 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg5 >> 8;
				@Pc(50) int local50 = local38 * arg5 >> 8;
				@Pc(62) int local62 = (arg6 << 16) + local20 * local44 + local15 * local50;
				@Pc(74) int local74 = (arg2 << 16) + (local20 * local50 - local15 * local44);
				@Pc(80) int local80 = arg4 + arg8 * Class1_Sub1_Sub2.anInt719;
				for (@Pc(82) int local82 = 0; local82 < arg9; local82++) {
					@Pc(88) int local88 = arg3[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg7[local82]; local109 < 0; local109++) {
						Class1_Sub1_Sub2.anIntArray213[local92++] = this.anIntArray208[(local98 >> 16) + (local104 >> 16) * this.anInt667];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub1_Sub2.anInt719;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("1317, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIDII)V")
	public void method396(@OriginalArg(5) int arg0, @OriginalArg(6) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg0 + arg2 * Class1_Sub1_Sub2.anInt719;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray208[(local83 >> 16) + (local85 >> 16) * this.anInt667];
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
					local75 += Class1_Sub1_Sub2.anInt719;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("34509, " + 20 + ", " + 15 + ", " + 20 + ", " + 15 + ", " + 256 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!jb;BI)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt669;
			arg0 += this.anInt670;
			@Pc(25) int local25 = arg2 + arg0 * Class1_Sub1_Sub2.anInt719;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt668;
			@Pc(33) int local33 = this.anInt667;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt719 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub2.anInt721) {
				local46 = Class1_Sub1_Sub2.anInt721 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt721;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt719;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt722) {
				local30 -= arg0 + local30 - Class1_Sub1_Sub2.anInt722;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt723) {
				local46 = Class1_Sub1_Sub2.anInt723 - arg2;
				local33 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt723;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg2 + local33 > Class1_Sub1_Sub2.anInt724) {
				local46 = arg2 + local33 - Class1_Sub1_Sub2.anInt724;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method398(local39, Class1_Sub1_Sub2.anIntArray213, 80, this.anIntArray208, 0, local27, local25, local33, arg1.aByteArray7, local37, local30);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("20269, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[II[IIIII[BII)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(10) int local10 = -(arg7 >> 2);
			@Pc(15) int local15 = -(arg7 & 0x3);
			for (@Pc(18) int local18 = -arg10; local18 < 0; local18++) {
				@Pc(29) int local29;
				for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
					local29 = arg3[arg5++];
					if (local29 != 0 && arg8[arg6] == 0) {
						arg1[arg6++] = local29;
					} else {
						arg6++;
					}
					local29 = arg3[arg5++];
					if (local29 != 0 && arg8[arg6] == 0) {
						arg1[arg6++] = local29;
					} else {
						arg6++;
					}
					local29 = arg3[arg5++];
					if (local29 != 0 && arg8[arg6] == 0) {
						arg1[arg6++] = local29;
					} else {
						arg6++;
					}
					local29 = arg3[arg5++];
					if (local29 != 0 && arg8[arg6] == 0) {
						arg1[arg6++] = local29;
					} else {
						arg6++;
					}
				}
				for (@Pc(105) int local105 = local15; local105 < 0; local105++) {
					local29 = arg3[arg5++];
					if (local29 != 0 && arg8[arg6] == 0) {
						arg1[arg6++] = local29;
					} else {
						arg6++;
					}
				}
				arg6 += arg9;
				arg5 += arg0;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("18150, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
