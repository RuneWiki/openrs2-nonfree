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

@OriginalClass("client!DLNMSHLT")
public final class Class1_Sub1_Sub1_Sub2 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!DLNMSHLT", name = "x", descriptor = "Z")
	private boolean aBoolean37 = false;

	@OriginalMember(owner = "client!DLNMSHLT", name = "y", descriptor = "Z")
	private boolean aBoolean38 = true;

	@OriginalMember(owner = "client!DLNMSHLT", name = "z", descriptor = "I")
	private int anInt109 = -673;

	@OriginalMember(owner = "client!DLNMSHLT", name = "A", descriptor = "I")
	private int anInt110 = 3;

	@OriginalMember(owner = "client!DLNMSHLT", name = "B", descriptor = "I")
	private int anInt111 = -876;

	@OriginalMember(owner = "client!DLNMSHLT", name = "C", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!DLNMSHLT", name = "D", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!DLNMSHLT", name = "E", descriptor = "I")
	private int anInt112 = 4;

	@OriginalMember(owner = "client!DLNMSHLT", name = "F", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!DLNMSHLT", name = "K", descriptor = "I")
	public int anInt117;

	@OriginalMember(owner = "client!DLNMSHLT", name = "G", descriptor = "I")
	public int anInt113;

	@OriginalMember(owner = "client!DLNMSHLT", name = "L", descriptor = "I")
	public int anInt118;

	@OriginalMember(owner = "client!DLNMSHLT", name = "H", descriptor = "I")
	public int anInt114;

	@OriginalMember(owner = "client!DLNMSHLT", name = "J", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!DLNMSHLT", name = "I", descriptor = "I")
	private int anInt115;

	@OriginalMember(owner = "client!DLNMSHLT", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray24 = new int[arg0 * arg1];
		this.anInt113 = this.anInt117 = arg0;
		this.anInt114 = this.anInt118 = arg1;
		this.anInt115 = this.anInt116 = 0;
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt113 = local29.getWidth(arg1);
			this.anInt114 = local29.getHeight(arg1);
			this.anInt117 = this.anInt113;
			this.anInt118 = this.anInt114;
			this.anInt115 = 0;
			this.anInt116 = 0;
			this.anIntArray24 = new int[this.anInt113 * this.anInt114];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt113, this.anInt114, this.anIntArray24, 0, this.anInt113);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "<init>", descriptor = "(Lclient!HRXSNEYZ;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub1_Sub2(@OriginalArg(0) Class15 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method220(arg1 + ".dat", null), 8);
		@Pc(52) Class1_Sub1_Sub3 local52 = new Class1_Sub1_Sub3(arg0.method220("index.dat", null), 8);
		local52.anInt352 = local43.method240();
		this.anInt117 = local52.method240();
		this.anInt118 = local52.method240();
		@Pc(67) int local67 = local52.method238();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method242();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt352 += 2;
			local43.anInt352 += local52.method240() * local52.method240();
			local52.anInt352++;
		}
		this.anInt115 = local52.method238();
		this.anInt116 = local52.method238();
		this.anInt113 = local52.method240();
		this.anInt114 = local52.method240();
		@Pc(154) int local154 = local52.method238();
		@Pc(160) int local160 = this.anInt113 * this.anInt114;
		this.anIntArray24 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray24[local168] = local70[local43.method238()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt113; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt114; local192++) {
					this.anIntArray24[local168 + local192 * this.anInt113] = local70[local43.method238()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "c", descriptor = "(Z)V")
	public void method118() {
		try {
			Class1_Sub1_Sub1.method546(this.anIntArray24, this.anInt113, this.anInt114);
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("53144, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(IIII)V")
	public void method119(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray24.length; local13++) {
				@Pc(20) int local20 = this.anIntArray24[local13];
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
					this.anIntArray24[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("17129, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "d", descriptor = "(Z)V")
	public void method120() {
		try {
			@Pc(11) int[] local11 = new int[this.anInt117 * this.anInt118];
			for (@Pc(13) int local13 = 0; local13 < this.anInt114; local13++) {
				for (@Pc(17) int local17 = 0; local17 < this.anInt113; local17++) {
					local11[(local13 + this.anInt116) * this.anInt117 + local17 + this.anInt115] = this.anIntArray24[local13 * this.anInt113 + local17];
				}
			}
			this.anIntArray24 = local11;
			this.anInt113 = this.anInt117;
			this.anInt114 = this.anInt118;
			this.anInt115 = 0;
			this.anInt116 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("66246, " + true + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(IIZ)V")
	public void method121(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt115;
			arg1 += this.anInt116;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub1.anInt799;
			@Pc(17) int local17 = 0;
			@Pc(25) int local25 = this.anInt114;
			@Pc(28) int local28 = this.anInt113;
			@Pc(32) int local32 = Class1_Sub1_Sub1.anInt799 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub1.anInt801) {
				local41 = Class1_Sub1_Sub1.anInt801 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub1_Sub1.anInt801;
				local17 = local41 * local28 + 0;
				local15 += local41 * Class1_Sub1_Sub1.anInt799;
			}
			if (arg1 + local25 > Class1_Sub1_Sub1.anInt802) {
				local25 -= arg1 + local25 - Class1_Sub1_Sub1.anInt802;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt803) {
				local41 = Class1_Sub1_Sub1.anInt803 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub1_Sub1.anInt803;
				local17 += local41;
				local15 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub1_Sub1.anInt804) {
				local41 = arg0 + local28 - Class1_Sub1_Sub1.anInt804;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method122(local32, Class1_Sub1_Sub1.anIntArray206, local34, local17, local15, local25, local28, this.anIntArray24);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("51954, " + arg0 + ", " + arg1 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(I[IIIIIII[I)V")
	private void method122(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(19) int local19 = -arg5; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					arg1[arg4++] = arg7[arg3++];
					arg1[arg4++] = arg7[arg3++];
					arg1[arg4++] = arg7[arg3++];
					arg1[arg4++] = arg7[arg3++];
				}
				for (@Pc(62) int local62 = local11; local62 < 0; local62++) {
					arg1[arg4++] = arg7[arg3++];
				}
				arg4 += arg0;
				arg3 += arg2;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("97428, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -106 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(IIB)V")
	public void method123(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt115;
			arg0 += this.anInt116;
			@Pc(25) int local25 = arg1 + arg0 * Class1_Sub1_Sub1.anInt799;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt114;
			@Pc(33) int local33 = this.anInt113;
			@Pc(37) int local37 = Class1_Sub1_Sub1.anInt799 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub1.anInt801) {
				local46 = Class1_Sub1_Sub1.anInt801 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub1_Sub1.anInt801;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub1.anInt799;
			}
			if (arg0 + local30 > Class1_Sub1_Sub1.anInt802) {
				local30 -= arg0 + local30 - Class1_Sub1_Sub1.anInt802;
			}
			if (arg1 < Class1_Sub1_Sub1.anInt803) {
				local46 = Class1_Sub1_Sub1.anInt803 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub1.anInt803;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub1.anInt804) {
				local46 = arg1 + local33 - Class1_Sub1_Sub1.anInt804;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method124(Class1_Sub1_Sub1.anIntArray206, this.anIntArray24, local27, local25, local33, local30, local37, local39);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("75672, " + arg0 + ", " + arg1 + ", " + 122 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method124(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!DLNMSHLT", name = "b", descriptor = "(IIII)V")
	public void method125(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt115;
			arg1 += this.anInt116;
			@Pc(24) int local24 = arg0 + arg1 * Class1_Sub1_Sub1.anInt799;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt114;
			@Pc(32) int local32 = this.anInt113;
			@Pc(36) int local36 = Class1_Sub1_Sub1.anInt799 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub1_Sub1.anInt801) {
				local45 = Class1_Sub1_Sub1.anInt801 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub1_Sub1.anInt801;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub1.anInt799;
			}
			if (arg1 + local29 > Class1_Sub1_Sub1.anInt802) {
				local29 -= arg1 + local29 - Class1_Sub1_Sub1.anInt802;
			}
			if (arg0 < Class1_Sub1_Sub1.anInt803) {
				local45 = Class1_Sub1_Sub1.anInt803 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub1_Sub1.anInt803;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub1_Sub1.anInt804) {
				local45 = arg0 + local32 - Class1_Sub1_Sub1.anInt804;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method126(Class1_Sub1_Sub1.anIntArray206, 0, local29, local36, this.anIntArray24, local26, local24, local32, local38);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("87840, " + arg0 + ", " + arg1 + ", " + 128 + ", " + 0 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "([IIII[IIIIIII)V")
	private void method126(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg2; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg7; local16 < 0; local16++) {
					@Pc(23) int local23 = arg4[arg5++];
					if (local23 == 0) {
						arg6++;
					} else {
						@Pc(29) int local29 = arg0[arg6];
						arg0[arg6++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg6 += arg3;
				arg5 += arg8;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("50695, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(I[IIIIII[IIII)V")
	public void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(18) int local18 = -arg7 / 2;
				@Pc(23) int local23 = -arg2 / 2;
				@Pc(32) int local32 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(41) int local41 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(47) int local47 = local32 * arg5 >> 8;
				@Pc(53) int local53 = local41 * arg5 >> 8;
				@Pc(65) int local65 = (arg0 << 16) + local23 * local47 + local18 * local53;
				@Pc(77) int local77 = (arg4 << 16) + (local23 * local53 - local18 * local47);
				@Pc(83) int local83 = arg8 + arg3 * Class1_Sub1_Sub1.anInt799;
				for (@Pc(85) int local85 = 0; local85 < arg2; local85++) {
					@Pc(91) int local91 = arg6[local85];
					@Pc(95) int local95 = local83 + local91;
					@Pc(101) int local101 = local65 + local53 * local91;
					@Pc(107) int local107 = local77 - local47 * local91;
					for (@Pc(112) int local112 = -arg1[local85]; local112 < 0; local112++) {
						Class1_Sub1_Sub1.anIntArray206[local95++] = this.anIntArray24[(local101 >> 16) + (local107 >> 16) * this.anInt113];
						local101 += local53;
						local107 -= local47;
					}
					local65 += local47;
					local77 += local53;
					local83 += Class1_Sub1_Sub1.anInt799;
				}
			} catch (@Pc(160) Exception local160) {
			}
		} catch (@Pc(162) RuntimeException local162) {
			signlink.reporterror("5741, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -876 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local162.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(DIIIIIIII)V")
	public void method128(@OriginalArg(0) double arg0, @OriginalArg(7) int arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(29) int local29 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(35) int local35 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(41) int local41 = local29 * 256 >> 8;
				@Pc(47) int local47 = local35 * 256 >> 8;
				@Pc(59) int local59 = local41 * -10 + local47 * -10 + 983040;
				@Pc(71) int local71 = local47 * -10 + 983040 - local41 * -10;
				@Pc(77) int local77 = arg2 + arg1 * Class1_Sub1_Sub1.anInt799;
				for (@Pc(79) int local79 = 0; local79 < 20; local79++) {
					@Pc(83) int local83 = local77;
					@Pc(85) int local85 = local59;
					@Pc(87) int local87 = local71;
					for (@Pc(90) int local90 = -20; local90 < 0; local90++) {
						@Pc(106) int local106 = this.anIntArray24[(local85 >> 16) + (local87 >> 16) * this.anInt113];
						if (local106 == 0) {
							local83++;
						} else {
							Class1_Sub1_Sub1.anIntArray206[local83++] = local106;
						}
						local85 += local47;
						local87 -= local41;
					}
					local59 += local41;
					local71 += local47;
					local77 += Class1_Sub1_Sub1.anInt799;
				}
			} catch (@Pc(145) Exception local145) {
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("47834, " + arg0 + ", " + 20 + ", " + 15 + ", " + 256 + ", " + 20 + ", " + 0 + ", " + 15 + ", " + arg1 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "(Lclient!YAPSNHGU;III)V")
	public void method129(@OriginalArg(0) Class1_Sub1_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt115;
			arg2 += this.anInt116;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub1_Sub1.anInt799;
			@Pc(17) int local17 = 0;
			@Pc(27) int local27 = this.anInt114;
			@Pc(30) int local30 = this.anInt113;
			@Pc(34) int local34 = Class1_Sub1_Sub1.anInt799 - local30;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43;
			if (arg2 < Class1_Sub1_Sub1.anInt801) {
				local43 = Class1_Sub1_Sub1.anInt801 - arg2;
				local27 -= local43;
				arg2 = Class1_Sub1_Sub1.anInt801;
				local17 = local43 * local30 + 0;
				local15 += local43 * Class1_Sub1_Sub1.anInt799;
			}
			if (arg2 + local27 > Class1_Sub1_Sub1.anInt802) {
				local27 -= arg2 + local27 - Class1_Sub1_Sub1.anInt802;
			}
			if (arg1 < Class1_Sub1_Sub1.anInt803) {
				local43 = Class1_Sub1_Sub1.anInt803 - arg1;
				local30 -= local43;
				arg1 = Class1_Sub1_Sub1.anInt803;
				local17 += local43;
				local15 += local43;
				local36 = local43 + 0;
				local34 += local43;
			}
			if (arg1 + local30 > Class1_Sub1_Sub1.anInt804) {
				local43 = arg1 + local30 - Class1_Sub1_Sub1.anInt804;
				local30 -= local43;
				local36 += local43;
				local34 += local43;
			}
			if (local30 > 0 && local27 > 0) {
				this.method130(Class1_Sub1_Sub1.anIntArray206, local30, 0, local17, local27, arg0.aByteArray20, local34, this.anIntArray24, local15, local36);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("22609, " + arg0 + ", " + arg1 + ", " + 1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DLNMSHLT", name = "a", descriptor = "([IIIII[BIZ[III)V")
	private void method130(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(17) int local17 = -arg4; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					local28 = arg7[arg3++];
					if (local28 != 0 && arg5[arg8] == 0) {
						arg0[arg8++] = local28;
					} else {
						arg8++;
					}
					local28 = arg7[arg3++];
					if (local28 != 0 && arg5[arg8] == 0) {
						arg0[arg8++] = local28;
					} else {
						arg8++;
					}
					local28 = arg7[arg3++];
					if (local28 != 0 && arg5[arg8] == 0) {
						arg0[arg8++] = local28;
					} else {
						arg8++;
					}
					local28 = arg7[arg3++];
					if (local28 != 0 && arg5[arg8] == 0) {
						arg0[arg8++] = local28;
					} else {
						arg8++;
					}
				}
				for (@Pc(104) int local104 = local11; local104 < 0; local104++) {
					local28 = arg7[arg3++];
					if (local28 != 0 && arg5[arg8] == 0) {
						arg0[arg8++] = local28;
					} else {
						arg8++;
					}
				}
				arg8 += arg6;
				arg3 += arg9;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("61212, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
