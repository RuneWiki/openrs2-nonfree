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
	private int anInt639;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int anInt641;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
	private int anInt640 = 387;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt642 = 9;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "B")
	private byte aByte36 = 8;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "Z")
	private boolean aBoolean170 = true;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "[I")
	public int[] anIntArray207;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray207 = new int[arg0 * arg1];
		this.anInt643 = this.anInt647 = arg0;
		this.anInt644 = this.anInt648 = arg1;
		this.anInt645 = this.anInt646 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt643 = local20.getWidth(arg1);
			this.anInt644 = local20.getHeight(arg1);
			this.anInt647 = this.anInt643;
			this.anInt648 = this.anInt644;
			this.anInt645 = 0;
			this.anInt646 = 0;
			this.anIntArray207 = new int[this.anInt643 * this.anInt644];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt643, this.anInt644, this.anIntArray207, 0, this.anInt643);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method662(arg1 + ".dat", null), 15787);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method662("index.dat", null), 15787);
		local43.anInt734 = local34.method478();
		this.anInt647 = local43.method478();
		this.anInt648 = local43.method478();
		@Pc(58) int local58 = local43.method476();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method480();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt734 += 2;
			local34.anInt734 += local43.method478() * local43.method478();
			local43.anInt734++;
		}
		this.anInt645 = local43.method476();
		this.anInt646 = local43.method476();
		this.anInt643 = local43.method478();
		this.anInt644 = local43.method478();
		@Pc(139) int local139 = local43.method476();
		@Pc(145) int local145 = this.anInt643 * this.anInt644;
		this.anIntArray207 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray207[local153] = local61[local34.method476()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt643; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt644; local177++) {
					this.anIntArray207[local153 + local177 * this.anInt643] = local61[local34.method476()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
	public void method383(@OriginalArg(0) byte arg0) {
		try {
			Class1_Sub1_Sub2.method431(this.anIntArray207, this.anInt643, this.anInt644);
			@Pc(12) boolean local12 = false;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("24805, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBII)V")
	public void method384(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray207.length; local3++) {
				@Pc(10) int local10 = this.anIntArray207[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg0;
					if (local18 < 1) {
						local18 = 1;
					} else if (local18 > 255) {
						local18 = 255;
					}
					@Pc(40) int local40 = local10 >> 8 & 0xFF;
					local40 += arg2;
					if (local40 < 1) {
						local40 = 1;
					} else if (local40 > 255) {
						local40 = 255;
					}
					@Pc(60) int local60 = local10 & 0xFF;
					local60 += arg3;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray207[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			@Pc(100) boolean local100 = false;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("40145, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method385() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt647 * this.anInt648];
			for (@Pc(10) int local10 = 0; local10 < this.anInt644; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt643; local14++) {
					local8[(local10 + this.anInt646) * this.anInt647 + local14 + this.anInt645] = this.anIntArray207[local10 * this.anInt643 + local14];
				}
			}
			this.anIntArray207 = local8;
			this.anInt643 = this.anInt647;
			this.anInt644 = this.anInt648;
			this.anInt645 = 0;
			this.anInt646 = 0;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("30731, " + -15744 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt645;
			arg1 += this.anInt646;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt644;
			@Pc(23) int local23 = this.anInt643;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt688 - local23;
			@Pc(29) int local29 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt690) {
				local46 = Class1_Sub1_Sub2.anInt690 - arg1;
				local20 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt690;
				local17 = local46 * local23 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt688;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt691) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt691;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt692) {
				local46 = Class1_Sub1_Sub2.anInt692 - arg0;
				local23 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt692;
				local17 += local46;
				local15 += local46;
				local29 = local46 + 0;
				local27 += local46;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt693) {
				local46 = arg0 + local23 - Class1_Sub1_Sub2.anInt693;
				local23 -= local46;
				local29 += local46;
				local27 += local46;
			}
			if (local23 > 0 && local20 > 0) {
				this.method387(local17, Class1_Sub1_Sub2.anIntArray212, this.anIntArray207, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("29381, " + arg0 + ", " + arg1 + ", " + 8 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[I[IIIIZII)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(23) int local23 = -arg5; local23 < 0; local23++) {
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					arg1[arg3++] = arg2[arg0++];
					arg1[arg3++] = arg2[arg0++];
					arg1[arg3++] = arg2[arg0++];
					arg1[arg3++] = arg2[arg0++];
				}
				for (@Pc(66) int local66 = local11; local66 < 0; local66++) {
					arg1[arg3++] = arg2[arg0++];
				}
				arg3 += arg6;
				arg0 += arg7;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("72719, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + true + ", " + arg6 + ", " + arg7 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public void method388(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt645;
			arg0 += this.anInt646;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub1_Sub2.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt644;
			@Pc(23) int local23 = this.anInt643;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt688 - local23;
			@Pc(29) int local29 = 0;
			if (arg1 == 1) {
				@Pc(40) int local40;
				if (arg0 < Class1_Sub1_Sub2.anInt690) {
					local40 = Class1_Sub1_Sub2.anInt690 - arg0;
					local20 -= local40;
					arg0 = Class1_Sub1_Sub2.anInt690;
					local17 = local40 * local23 + 0;
					local15 += local40 * Class1_Sub1_Sub2.anInt688;
				}
				if (arg0 + local20 > Class1_Sub1_Sub2.anInt691) {
					local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt691;
				}
				if (arg2 < Class1_Sub1_Sub2.anInt692) {
					local40 = Class1_Sub1_Sub2.anInt692 - arg2;
					local23 -= local40;
					arg2 = Class1_Sub1_Sub2.anInt692;
					local17 += local40;
					local15 += local40;
					local29 = local40 + 0;
					local27 += local40;
				}
				if (arg2 + local23 > Class1_Sub1_Sub2.anInt693) {
					local40 = arg2 + local23 - Class1_Sub1_Sub2.anInt693;
					local23 -= local40;
					local29 += local40;
					local27 += local40;
				}
				if (local23 > 0 && local20 > 0) {
					this.method389(Class1_Sub1_Sub2.anIntArray212, this.anIntArray207, local17, local15, local23, local20, local27, local29);
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("37524, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method389(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt645;
			@Pc(8) int local8 = 15 / arg0;
			arg1 += this.anInt646;
			@Pc(19) int local19 = arg2 + arg1 * Class1_Sub1_Sub2.anInt688;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt644;
			@Pc(27) int local27 = this.anInt643;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt688 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub2.anInt690) {
				local40 = Class1_Sub1_Sub2.anInt690 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt690;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt688;
			}
			if (arg1 + local24 > Class1_Sub1_Sub2.anInt691) {
				local24 -= arg1 + local24 - Class1_Sub1_Sub2.anInt691;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt692) {
				local40 = Class1_Sub1_Sub2.anInt692 - arg2;
				local27 -= local40;
				arg2 = Class1_Sub1_Sub2.anInt692;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class1_Sub1_Sub2.anInt693) {
				local40 = arg2 + local27 - Class1_Sub1_Sub2.anInt693;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method391(local21, local19, local24, Class1_Sub1_Sub2.anIntArray212, this.anIntArray207, local31, local33, 0, local27);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("12746, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[I[IIIIIZ)V")
	private void method391(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg2; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg8; local16 < 0; local16++) {
					@Pc(23) int local23 = arg4[arg0++];
					if (local23 == 0) {
						arg1++;
					} else {
						@Pc(29) int local29 = arg3[arg1];
						arg3[arg1++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg1 += arg5;
				arg0 += arg6;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("94839, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + false + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([IIIIII[IIIII)V")
	public void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(11) int local11 = -arg7 / 2;
				@Pc(16) int local16 = -arg5 / 2;
				@Pc(25) int local25 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = local25 * arg3 >> 8;
				@Pc(46) int local46 = local34 * arg3 >> 8;
				@Pc(58) int local58 = (arg8 << 16) + local16 * local40 + local11 * local46;
				@Pc(70) int local70 = (arg2 << 16) + (local16 * local46 - local11 * local40);
				@Pc(76) int local76 = arg9 + arg1 * Class1_Sub1_Sub2.anInt688;
				for (@Pc(78) int local78 = 0; local78 < arg5; local78++) {
					@Pc(84) int local84 = arg0[local78];
					@Pc(88) int local88 = local76 + local84;
					@Pc(94) int local94 = local58 + local46 * local84;
					@Pc(100) int local100 = local70 - local40 * local84;
					for (@Pc(105) int local105 = -arg6[local78]; local105 < 0; local105++) {
						Class1_Sub1_Sub2.anIntArray212[local88++] = this.anIntArray207[(local94 >> 16) + (local100 >> 16) * this.anInt643];
						local94 += local46;
						local100 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt688;
				}
			} catch (@Pc(153) Exception local153) {
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("82769, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -687 + ", " + arg8 + ", " + arg9 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IDIIIIBII)V")
	public void method393(@OriginalArg(1) double arg0, @OriginalArg(5) int arg1, @OriginalArg(6) byte arg2, @OriginalArg(8) int arg3) {
		try {
			if (this.aByte36 == 8) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt641 = -392;
			}
			try {
				@Pc(28) int local28 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(46) int local46 = local34 * 256 >> 8;
				@Pc(58) int local58 = local40 * -10 + local46 * -10 + 983040;
				@Pc(70) int local70 = local46 * -10 + 983040 - local40 * -10;
				@Pc(76) int local76 = arg1 + arg3 * Class1_Sub1_Sub2.anInt688;
				for (@Pc(78) int local78 = 0; local78 < 20; local78++) {
					@Pc(82) int local82 = local76;
					@Pc(84) int local84 = local58;
					@Pc(86) int local86 = local70;
					for (@Pc(89) int local89 = -20; local89 < 0; local89++) {
						@Pc(105) int local105 = this.anIntArray207[(local84 >> 16) + (local86 >> 16) * this.anInt643];
						if (local105 == 0) {
							local82++;
						} else {
							Class1_Sub1_Sub2.anIntArray212[local82++] = local105;
						}
						local84 += local46;
						local86 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt688;
				}
			} catch (@Pc(144) Exception local144) {
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("35641, " + 15 + ", " + arg0 + ", " + 20 + ", " + 256 + ", " + 15 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILclient!jb;ZI)V")
	public void method394(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt645;
			arg2 += this.anInt646;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt644;
			@Pc(23) int local23 = this.anInt643;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt688 - local23;
			@Pc(29) int local29 = 0;
			@Pc(46) int local46;
			if (arg2 < Class1_Sub1_Sub2.anInt690) {
				local46 = Class1_Sub1_Sub2.anInt690 - arg2;
				local20 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt690;
				local17 = local46 * local23 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt688;
			}
			if (arg2 + local20 > Class1_Sub1_Sub2.anInt691) {
				local20 -= arg2 + local20 - Class1_Sub1_Sub2.anInt691;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt692) {
				local46 = Class1_Sub1_Sub2.anInt692 - arg0;
				local23 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt692;
				local17 += local46;
				local15 += local46;
				local29 = local46 + 0;
				local27 += local46;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt693) {
				local46 = arg0 + local23 - Class1_Sub1_Sub2.anInt693;
				local23 -= local46;
				local29 += local46;
				local27 += local46;
			}
			if (local23 > 0 && local20 > 0) {
				this.method395(local17, local15, local29, arg1.aByteArray7, local23, local27, 0, local20, this.anIntArray207, Class1_Sub1_Sub2.anIntArray212);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("46753, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[BIIII[IZ[I)V")
	private void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(11) int local11 = -(arg4 >> 2);
			@Pc(16) int local16 = -(arg4 & 0x3);
			for (@Pc(19) int local19 = -arg7; local19 < 0; local19++) {
				@Pc(30) int local30;
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					local30 = arg8[arg0++];
					if (local30 != 0 && arg3[arg1] == 0) {
						arg9[arg1++] = local30;
					} else {
						arg1++;
					}
					local30 = arg8[arg0++];
					if (local30 != 0 && arg3[arg1] == 0) {
						arg9[arg1++] = local30;
					} else {
						arg1++;
					}
					local30 = arg8[arg0++];
					if (local30 != 0 && arg3[arg1] == 0) {
						arg9[arg1++] = local30;
					} else {
						arg1++;
					}
					local30 = arg8[arg0++];
					if (local30 != 0 && arg3[arg1] == 0) {
						arg9[arg1++] = local30;
					} else {
						arg1++;
					}
				}
				for (@Pc(106) int local106 = local16; local106 < 0; local106++) {
					local30 = arg8[arg0++];
					if (local30 != 0 && arg3[arg1] == 0) {
						arg9[arg1++] = local30;
					} else {
						arg1++;
					}
				}
				arg1 += arg5;
				arg0 += arg2;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("52031, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + true + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
