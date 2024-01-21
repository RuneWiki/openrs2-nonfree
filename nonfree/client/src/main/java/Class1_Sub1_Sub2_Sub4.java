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

@OriginalClass("client!TPIBHECB")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!TPIBHECB", name = "y", descriptor = "I")
	private static int anInt662 = 536;

	@OriginalMember(owner = "client!TPIBHECB", name = "B", descriptor = "I")
	private int anInt664;

	@OriginalMember(owner = "client!TPIBHECB", name = "z", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!TPIBHECB", name = "A", descriptor = "I")
	private int anInt663 = -131;

	@OriginalMember(owner = "client!TPIBHECB", name = "C", descriptor = "Z")
	private boolean aBoolean146 = true;

	@OriginalMember(owner = "client!TPIBHECB", name = "D", descriptor = "I")
	private int anInt665 = -593;

	@OriginalMember(owner = "client!TPIBHECB", name = "E", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!TPIBHECB", name = "F", descriptor = "[I")
	public int[] anIntArray171;

	@OriginalMember(owner = "client!TPIBHECB", name = "K", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!TPIBHECB", name = "G", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!TPIBHECB", name = "L", descriptor = "I")
	public int anInt671;

	@OriginalMember(owner = "client!TPIBHECB", name = "H", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!TPIBHECB", name = "J", descriptor = "I")
	private int anInt669;

	@OriginalMember(owner = "client!TPIBHECB", name = "I", descriptor = "I")
	private int anInt668;

	@OriginalMember(owner = "client!TPIBHECB", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray171 = new int[arg0 * arg1];
		this.anInt666 = this.anInt670 = arg0;
		this.anInt667 = this.anInt671 = arg1;
		this.anInt668 = this.anInt669 = 0;
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt666 = local20.getWidth(arg1);
			this.anInt667 = local20.getHeight(arg1);
			this.anInt670 = this.anInt666;
			this.anInt671 = this.anInt667;
			this.anInt668 = 0;
			this.anInt669 = 0;
			this.anIntArray171 = new int[this.anInt666 * this.anInt667];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt666, this.anInt667, this.anIntArray171, 0, this.anInt666);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "<init>", descriptor = "(Lclient!UUIGNTAD;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class38 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method512(arg1 + ".dat", null), anInt662);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method512("index.dat", null), anInt662);
		local43.anInt78 = local34.method57();
		this.anInt670 = local43.method57();
		this.anInt671 = local43.method57();
		@Pc(58) int local58 = local43.method55();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method59();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt78 += 2;
			local34.anInt78 += local43.method57() * local43.method57();
			local43.anInt78++;
		}
		this.anInt668 = local43.method55();
		this.anInt669 = local43.method55();
		this.anInt666 = local43.method57();
		this.anInt667 = local43.method57();
		@Pc(139) int local139 = local43.method55();
		@Pc(145) int local145 = this.anInt666 * this.anInt667;
		this.anIntArray171 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray171[local153] = local61[local34.method55()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt666; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt667; local177++) {
					this.anIntArray171[local153 + local177 * this.anInt666] = local61[local34.method55()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(B)V")
	public void method468(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			Class1_Sub1_Sub2.method456(this.anInt666, this.anIntArray171, this.anInt667);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("40543, " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IZII)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray171.length; local13++) {
				@Pc(20) int local20 = this.anIntArray171[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg1;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg0;
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
					this.anIntArray171[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("32225, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(Z)V")
	public void method470() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt670 * this.anInt671];
			for (@Pc(10) int local10 = 0; local10 < this.anInt667; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt666; local14++) {
					local8[(local10 + this.anInt669) * this.anInt670 + local14 + this.anInt668] = this.anIntArray171[local10 * this.anInt666 + local14];
				}
			}
			this.anIntArray171 = local8;
			this.anInt666 = this.anInt670;
			this.anInt667 = this.anInt671;
			this.anInt668 = 0;
			this.anInt669 = 0;
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("29348, " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(III)V")
	public void method471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt668;
			arg0 += this.anInt669;
			@Pc(19) int local19 = arg1 + arg0 * Class1_Sub1_Sub2.anInt653;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt667;
			@Pc(27) int local27 = this.anInt666;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt653 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub2.anInt655) {
				local40 = Class1_Sub1_Sub2.anInt655 - arg0;
				local24 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt655;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt653;
			}
			if (arg0 + local24 > Class1_Sub1_Sub2.anInt656) {
				local24 -= arg0 + local24 - Class1_Sub1_Sub2.anInt656;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt657) {
				local40 = Class1_Sub1_Sub2.anInt657 - arg1;
				local27 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt657;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class1_Sub1_Sub2.anInt658) {
				local40 = arg1 + local27 - Class1_Sub1_Sub2.anInt658;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method472(this.anIntArray171, local19, local33, local24, local21, local27, local31, Class1_Sub1_Sub2.anIntArray170);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("81387, " + 2 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "([IIIIIIII[I)V")
	private void method472(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(28) int local28 = -arg3; local28 < 0; local28++) {
				for (@Pc(32) int local32 = local6; local32 < 0; local32++) {
					arg7[arg1++] = arg0[arg4++];
					arg7[arg1++] = arg0[arg4++];
					arg7[arg1++] = arg0[arg4++];
					arg7[arg1++] = arg0[arg4++];
				}
				for (@Pc(71) int local71 = local11; local71 < 0; local71++) {
					arg7[arg1++] = arg0[arg4++];
				}
				arg1 += arg6;
				arg4 += arg2;
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("97111, " + arg0 + ", " + 9 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IBI)V")
	public void method473(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt668;
			arg2 += this.anInt669;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt653;
			@Pc(17) int local17 = 0;
			if (arg1 == 2) {
				@Pc(24) int local24 = this.anInt667;
				@Pc(27) int local27 = this.anInt666;
				@Pc(31) int local31 = Class1_Sub1_Sub2.anInt653 - local27;
				@Pc(33) int local33 = 0;
				@Pc(40) int local40;
				if (arg2 < Class1_Sub1_Sub2.anInt655) {
					local40 = Class1_Sub1_Sub2.anInt655 - arg2;
					local24 -= local40;
					arg2 = Class1_Sub1_Sub2.anInt655;
					local17 = local40 * local27 + 0;
					local15 += local40 * Class1_Sub1_Sub2.anInt653;
				}
				if (arg2 + local24 > Class1_Sub1_Sub2.anInt656) {
					local24 -= arg2 + local24 - Class1_Sub1_Sub2.anInt656;
				}
				if (arg0 < Class1_Sub1_Sub2.anInt657) {
					local40 = Class1_Sub1_Sub2.anInt657 - arg0;
					local27 -= local40;
					arg0 = Class1_Sub1_Sub2.anInt657;
					local17 += local40;
					local15 += local40;
					local33 = local40 + 0;
					local31 += local40;
				}
				if (arg0 + local27 > Class1_Sub1_Sub2.anInt658) {
					local40 = arg0 + local27 - Class1_Sub1_Sub2.anInt658;
					local27 -= local40;
					local33 += local40;
					local31 += local40;
				}
				if (local27 > 0 && local24 > 0) {
					this.method474(Class1_Sub1_Sub2.anIntArray170, this.anIntArray171, local17, local15, local27, local24, local31, local33);
				}
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("67212, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method474(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IIBI)V")
	public void method475(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt668;
			arg1 += this.anInt669;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt653;
			@Pc(17) int local17 = 0;
			@Pc(26) int local26 = this.anInt667;
			@Pc(29) int local29 = this.anInt666;
			@Pc(33) int local33 = Class1_Sub1_Sub2.anInt653 - local29;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42;
			if (arg1 < Class1_Sub1_Sub2.anInt655) {
				local42 = Class1_Sub1_Sub2.anInt655 - arg1;
				local26 -= local42;
				arg1 = Class1_Sub1_Sub2.anInt655;
				local17 = local42 * local29 + 0;
				local15 += local42 * Class1_Sub1_Sub2.anInt653;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt656) {
				local26 -= arg1 + local26 - Class1_Sub1_Sub2.anInt656;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt657) {
				local42 = Class1_Sub1_Sub2.anInt657 - arg0;
				local29 -= local42;
				arg0 = Class1_Sub1_Sub2.anInt657;
				local17 += local42;
				local15 += local42;
				local35 = local42 + 0;
				local33 += local42;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt658) {
				local42 = arg0 + local29 - Class1_Sub1_Sub2.anInt658;
				local29 -= local42;
				local35 += local42;
				local33 += local42;
			}
			if (local29 > 0 && local26 > 0) {
				this.method476(this.anIntArray171, local33, local17, Class1_Sub1_Sub2.anIntArray170, local29, local15, local26, 0, local35);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("83749, " + arg0 + ", " + 128 + ", " + 16 + ", " + arg1 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "([IIBI[IIIIIII)V")
	private void method476(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg6; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg4; local13 < 0; local13++) {
					@Pc(20) int local20 = arg0[arg2++];
					if (local20 == 0) {
						arg5++;
					} else {
						@Pc(26) int local26 = arg3[arg5];
						arg3[arg5++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg5 += arg1;
				arg2 += arg8;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("74630, " + arg0 + ", " + arg1 + ", " + 37 + ", " + arg2 + ", " + arg3 + ", " + 128 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(II[II[IIIIIII)V")
	public void method477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			try {
				@Pc(11) int local11 = -arg1 / 2;
				@Pc(16) int local16 = -arg6 / 2;
				@Pc(25) int local25 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = local25 * arg3 >> 8;
				@Pc(46) int local46 = local34 * arg3 >> 8;
				@Pc(58) int local58 = (arg9 << 16) + local16 * local40 + local11 * local46;
				@Pc(70) int local70 = (arg5 << 16) + (local16 * local46 - local11 * local40);
				@Pc(76) int local76 = arg8 + arg7 * Class1_Sub1_Sub2.anInt653;
				for (@Pc(78) int local78 = 0; local78 < arg6; local78++) {
					@Pc(84) int local84 = arg2[local78];
					@Pc(88) int local88 = local76 + local84;
					@Pc(94) int local94 = local58 + local46 * local84;
					@Pc(100) int local100 = local70 - local40 * local84;
					for (@Pc(105) int local105 = -arg4[local78]; local105 < 0; local105++) {
						Class1_Sub1_Sub2.anIntArray170[local88++] = this.anIntArray171[(local94 >> 16) + (local100 >> 16) * this.anInt666];
						local94 += local46;
						local100 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt653;
				}
			} catch (@Pc(153) Exception local153) {
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("9464, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 0 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IDIIIIIII)V")
	public void method478(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1, @OriginalArg(5) int arg2, @OriginalArg(7) int arg3) {
		try {
			if (arg0 == 8496) {
				try {
					@Pc(21) int local21 = (int) (Math.sin(arg1) * 65536.0D);
					@Pc(27) int local27 = (int) (Math.cos(arg1) * 65536.0D);
					@Pc(33) int local33 = local21 * 256 >> 8;
					@Pc(39) int local39 = local27 * 256 >> 8;
					@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
					@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
					@Pc(69) int local69 = arg3 + arg2 * Class1_Sub1_Sub2.anInt653;
					for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
						@Pc(75) int local75 = local69;
						@Pc(77) int local77 = local51;
						@Pc(79) int local79 = local63;
						for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
							@Pc(98) int local98 = this.anIntArray171[(local77 >> 16) + (local79 >> 16) * this.anInt666];
							if (local98 == 0) {
								local75++;
							} else {
								Class1_Sub1_Sub2.anIntArray170[local75++] = local98;
							}
							local77 += local39;
							local79 -= local33;
						}
						local51 += local33;
						local63 += local39;
						local69 += Class1_Sub1_Sub2.anInt653;
					}
				} catch (@Pc(137) Exception local137) {
				}
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("62513, " + arg0 + ", " + arg1 + ", " + 20 + ", " + 256 + ", " + 15 + ", " + arg2 + ", " + 20 + ", " + arg3 + ", " + 15 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(IIILclient!OCPHNIUN;)V")
	public void method479(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt668;
			arg1 += this.anInt669;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt653;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt667;
			@Pc(23) int local23 = this.anInt666;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt653 - local23;
			@Pc(29) int local29 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub2.anInt655) {
				local41 = Class1_Sub1_Sub2.anInt655 - arg1;
				local20 -= local41;
				arg1 = Class1_Sub1_Sub2.anInt655;
				local17 = local41 * local23 + 0;
				local15 += local41 * Class1_Sub1_Sub2.anInt653;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt656) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt656;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt657) {
				local41 = Class1_Sub1_Sub2.anInt657 - arg0;
				local23 -= local41;
				arg0 = Class1_Sub1_Sub2.anInt657;
				local17 += local41;
				local15 += local41;
				local29 = local41 + 0;
				local27 += local41;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt658) {
				local41 = arg0 + local23 - Class1_Sub1_Sub2.anInt658;
				local23 -= local41;
				local29 += local41;
				local27 += local41;
			}
			if (local23 > 0 && local20 > 0) {
				this.method480(local15, local27, local20, Class1_Sub1_Sub2.anIntArray170, local23, this.anInt665, local29, 0, this.anIntArray171, arg2.aByteArray12, local17);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("81647, " + arg0 + ", " + -564 + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TPIBHECB", name = "a", descriptor = "(III[IIIII[I[BI)V")
	private void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) byte[] arg9, @OriginalArg(10) int arg10) {
		try {
			if (arg5 < 0) {
				@Pc(9) int local9 = -(arg4 >> 2);
				@Pc(14) int local14 = -(arg4 & 0x3);
				for (@Pc(17) int local17 = -arg2; local17 < 0; local17++) {
					@Pc(28) int local28;
					for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
						local28 = arg8[arg10++];
						if (local28 != 0 && arg9[arg0] == 0) {
							arg3[arg0++] = local28;
						} else {
							arg0++;
						}
						local28 = arg8[arg10++];
						if (local28 != 0 && arg9[arg0] == 0) {
							arg3[arg0++] = local28;
						} else {
							arg0++;
						}
						local28 = arg8[arg10++];
						if (local28 != 0 && arg9[arg0] == 0) {
							arg3[arg0++] = local28;
						} else {
							arg0++;
						}
						local28 = arg8[arg10++];
						if (local28 != 0 && arg9[arg0] == 0) {
							arg3[arg0++] = local28;
						} else {
							arg0++;
						}
					}
					for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
						local28 = arg8[arg10++];
						if (local28 != 0 && arg9[arg0] == 0) {
							arg3[arg0++] = local28;
						} else {
							arg0++;
						}
					}
					arg0 += arg1;
					arg10 += arg6;
				}
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("82250, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
