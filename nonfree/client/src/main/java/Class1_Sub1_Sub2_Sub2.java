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
	private static int anInt661 = 1000;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int anInt662;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private int anInt663 = -567;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt665;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt667;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt666;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt664 = this.anInt668 = arg0;
		this.anInt665 = this.anInt669 = arg1;
		this.anInt666 = this.anInt667 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(17) Image local17 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(22) MediaTracker local22 = new MediaTracker(arg1);
			local22.addImage(local17, 0);
			local22.waitForAll();
			this.anInt664 = local17.getWidth(arg1);
			this.anInt665 = local17.getHeight(arg1);
			this.anInt668 = this.anInt664;
			this.anInt669 = this.anInt665;
			this.anInt666 = 0;
			this.anInt667 = 0;
			this.anIntArray208 = new int[this.anInt664 * this.anInt665];
			@Pc(76) PixelGrabber local76 = new PixelGrabber(local17, 0, 0, this.anInt664, this.anInt665, this.anIntArray208, 0, this.anInt664);
			local76.grabPixels();
		} catch (@Pc(81) Exception local81) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(31) Class1_Sub1_Sub3 local31 = new Class1_Sub1_Sub3(anInt661, arg0.method666(arg1 + ".dat", null));
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(anInt661, arg0.method666("index.dat", null));
		local40.anInt751 = local31.method482();
		this.anInt668 = local40.method482();
		this.anInt669 = local40.method482();
		@Pc(55) int local55 = local40.method480();
		@Pc(58) int[] local58 = new int[local55];
		for (@Pc(60) int local60 = 0; local60 < local55 - 1; local60++) {
			local58[local60 + 1] = local40.method484();
			if (local58[local60 + 1] == 0) {
				local58[local60 + 1] = 1;
			}
		}
		for (@Pc(89) int local89 = 0; local89 < arg2; local89++) {
			local40.anInt751 += 2;
			local31.anInt751 += local40.method482() * local40.method482();
			local40.anInt751++;
		}
		this.anInt666 = local40.method480();
		this.anInt667 = local40.method480();
		this.anInt664 = local40.method482();
		this.anInt665 = local40.method482();
		@Pc(136) int local136 = local40.method480();
		@Pc(142) int local142 = this.anInt664 * this.anInt665;
		this.anIntArray208 = new int[local142];
		@Pc(150) int local150;
		if (local136 == 0) {
			for (local150 = 0; local150 < local142; local150++) {
				this.anIntArray208[local150] = local58[local31.method480()];
			}
		} else if (local136 == 1) {
			for (local150 = 0; local150 < this.anInt664; local150++) {
				for (@Pc(174) int local174 = 0; local174 < this.anInt665; local174++) {
					this.anIntArray208[local150 + local174 * this.anInt664] = local58[local31.method480()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method386() {
		try {
			Class1_Sub1_Sub2.method434(this.anInt665, 637, this.anInt664, this.anIntArray208);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("20885, " + -127 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray208.length; local3++) {
				@Pc(10) int local10 = this.anIntArray208[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg1;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg0;
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
					this.anIntArray208[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("73652, " + arg0 + ", " + arg1 + ", " + 3 + ", " + arg2 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method388(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.aBoolean170 = !this.aBoolean170;
			}
			@Pc(18) int[] local18 = new int[this.anInt668 * this.anInt669];
			for (@Pc(20) int local20 = 0; local20 < this.anInt665; local20++) {
				for (@Pc(24) int local24 = 0; local24 < this.anInt664; local24++) {
					local18[(local20 + this.anInt667) * this.anInt668 + local24 + this.anInt666] = this.anIntArray208[local20 * this.anInt664 + local24];
				}
			}
			this.anIntArray208 = local18;
			this.anInt664 = this.anInt668;
			this.anInt665 = this.anInt669;
			this.anInt666 = 0;
			this.anInt667 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("98755, " + arg0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt666;
			arg0 += this.anInt667;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt707;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt665;
			@Pc(23) int local23 = this.anInt664;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt707 - local23;
			@Pc(29) int local29 = 0;
			@Pc(42) int local42;
			if (arg0 < Class1_Sub1_Sub2.anInt709) {
				local42 = Class1_Sub1_Sub2.anInt709 - arg0;
				local20 -= local42;
				arg0 = Class1_Sub1_Sub2.anInt709;
				local17 = local42 * local23 + 0;
				local15 += local42 * Class1_Sub1_Sub2.anInt707;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt710) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt710;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt711) {
				local42 = Class1_Sub1_Sub2.anInt711 - arg1;
				local23 -= local42;
				arg1 = Class1_Sub1_Sub2.anInt711;
				local17 += local42;
				local15 += local42;
				local29 = local42 + 0;
				local27 += local42;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt712) {
				local42 = arg1 + local23 - Class1_Sub1_Sub2.anInt712;
				local23 -= local42;
				local29 += local42;
				local27 += local42;
			}
			if (local23 > 0 && local20 > 0) {
				this.method390(local29, local15, local17, local27, Class1_Sub1_Sub2.anIntArray213, local23, this.anIntArray208, local20);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("54175, " + -8550 + ", " + arg0 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZIII[II[II)V")
	private void method390(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg4[arg1++] = arg6[arg2++];
					arg4[arg1++] = arg6[arg2++];
					arg4[arg1++] = arg6[arg2++];
					arg4[arg1++] = arg6[arg2++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg4[arg1++] = arg6[arg2++];
				}
				arg1 += arg3;
				arg2 += arg0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("13999, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt666;
			arg1 += this.anInt667;
			@Pc(20) int local20 = arg0 + arg1 * Class1_Sub1_Sub2.anInt707;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt665;
			@Pc(28) int local28 = this.anInt664;
			@Pc(32) int local32 = Class1_Sub1_Sub2.anInt707 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub2.anInt709) {
				local41 = Class1_Sub1_Sub2.anInt709 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub1_Sub2.anInt709;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class1_Sub1_Sub2.anInt707;
			}
			if (arg1 + local25 > Class1_Sub1_Sub2.anInt710) {
				local25 -= arg1 + local25 - Class1_Sub1_Sub2.anInt710;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt711) {
				local41 = Class1_Sub1_Sub2.anInt711 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub1_Sub2.anInt711;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub1_Sub2.anInt712) {
				local41 = arg0 + local28 - Class1_Sub1_Sub2.anInt712;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method392(Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local22, local20, local28, local25, local32, local34);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("54328, " + arg0 + ", " + arg1 + ", " + false + ", " + local143.toString());
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZII)V")
	public void method393(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt666;
			arg0 += this.anInt667;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt707;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt665;
			@Pc(33) int local33 = this.anInt664;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt707 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub2.anInt709) {
				local46 = Class1_Sub1_Sub2.anInt709 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt709;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt707;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt710) {
				local30 -= arg0 + local30 - Class1_Sub1_Sub2.anInt710;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt711) {
				local46 = Class1_Sub1_Sub2.anInt711 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt711;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt712) {
				local46 = arg1 + local33 - Class1_Sub1_Sub2.anInt712;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method394(this.anIntArray208, local37, local39, local15, local33, local17, Class1_Sub1_Sub2.anIntArray213, 0, local30);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("91743, " + arg0 + ", " + false + ", " + arg1 + ", " + 128 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIIIII[III)V")
	private void method394(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(15) int local15 = -arg8; local15 < 0; local15++) {
				for (@Pc(20) int local20 = -arg4; local20 < 0; local20++) {
					@Pc(27) int local27 = arg0[arg5++];
					if (local27 == 0) {
						arg3++;
					} else {
						@Pc(33) int local33 = arg6[arg3];
						arg6[arg3++] = ((local27 & 0xFF00FF) * 128 + (local33 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local27 & 0xFF00) * 128 + (local33 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg3 += arg1;
				arg5 += arg2;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("42342, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + -120 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIZIIII)V")
	public void method395(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg5 / 2;
				@Pc(21) int local21 = -arg9 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg4 >> 8;
				@Pc(51) int local51 = local39 * arg4 >> 8;
				@Pc(63) int local63 = (arg7 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg8 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg6 + arg3 * Class1_Sub1_Sub2.anInt707;
				for (@Pc(83) int local83 = 0; local83 < arg9; local83++) {
					@Pc(89) int local89 = arg0[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg1[local83]; local110 < 0; local110++) {
						Class1_Sub1_Sub2.anIntArray213[local93++] = this.anIntArray208[(local99 >> 16) + (local105 >> 16) * this.anInt664];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub1_Sub2.anInt707;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("88367, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + false + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(DIIIIIIII)V")
	public void method396(@OriginalArg(0) double arg0, @OriginalArg(4) int arg1, @OriginalArg(7) int arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg1 + arg2 * Class1_Sub1_Sub2.anInt707;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray208[(local77 >> 16) + (local79 >> 16) * this.anInt664];
						if (local98 == 0) {
							local75++;
						} else {
							Class1_Sub1_Sub2.anIntArray213[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class1_Sub1_Sub2.anInt707;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("50652, " + arg0 + ", " + 15 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + 20 + ", " + 256 + ", " + arg2 + ", " + 45109 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!jb;II)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt666;
			arg2 += this.anInt667;
			@Pc(19) int local19 = arg0 + arg2 * Class1_Sub1_Sub2.anInt707;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt665;
			@Pc(27) int local27 = this.anInt664;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt707 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg2 < Class1_Sub1_Sub2.anInt709) {
				local40 = Class1_Sub1_Sub2.anInt709 - arg2;
				local24 -= local40;
				arg2 = Class1_Sub1_Sub2.anInt709;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt707;
			}
			if (arg2 + local24 > Class1_Sub1_Sub2.anInt710) {
				local24 -= arg2 + local24 - Class1_Sub1_Sub2.anInt710;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt711) {
				local40 = Class1_Sub1_Sub2.anInt711 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt711;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub1_Sub2.anInt712) {
				local40 = arg0 + local27 - Class1_Sub1_Sub2.anInt712;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method398(local27, 0, local33, arg1.aByteArray7, local19, this.anIntArray208, Class1_Sub1_Sub2.anIntArray213, local21, local31, local24);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("29538, " + arg0 + ", " + arg1 + ", " + 28501 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[BI[I[IIIIZ)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(15) int local15 = -(arg0 >> 2);
			@Pc(20) int local20 = -(arg0 & 0x3);
			for (@Pc(23) int local23 = -arg9; local23 < 0; local23++) {
				@Pc(34) int local34;
				for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
					local34 = arg5[arg7++];
					if (local34 != 0 && arg3[arg4] == 0) {
						arg6[arg4++] = local34;
					} else {
						arg4++;
					}
					local34 = arg5[arg7++];
					if (local34 != 0 && arg3[arg4] == 0) {
						arg6[arg4++] = local34;
					} else {
						arg4++;
					}
					local34 = arg5[arg7++];
					if (local34 != 0 && arg3[arg4] == 0) {
						arg6[arg4++] = local34;
					} else {
						arg4++;
					}
					local34 = arg5[arg7++];
					if (local34 != 0 && arg3[arg4] == 0) {
						arg6[arg4++] = local34;
					} else {
						arg4++;
					}
				}
				for (@Pc(110) int local110 = local20; local110 < 0; local110++) {
					local34 = arg5[arg7++];
					if (local34 != 0 && arg3[arg4] == 0) {
						arg6[arg4++] = local34;
					} else {
						arg4++;
					}
				}
				arg4 += arg8;
				arg7 += arg2;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("21538, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + false + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
