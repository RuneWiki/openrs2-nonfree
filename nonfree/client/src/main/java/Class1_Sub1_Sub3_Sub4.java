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

@OriginalClass("client!YZDAHXEQ")
public final class Class1_Sub1_Sub3_Sub4 extends Class1_Sub1_Sub3 {

	@OriginalMember(owner = "client!YZDAHXEQ", name = "v", descriptor = "I")
	private int anInt782 = 3;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "w", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "x", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "y", descriptor = "B")
	private byte aByte30 = 9;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "z", descriptor = "I")
	private int anInt783 = 5;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "A", descriptor = "I")
	private int anInt784 = 252;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "B", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "C", descriptor = "I")
	private int anInt785 = -90;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "D", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "I", descriptor = "I")
	public int anInt790;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "E", descriptor = "I")
	public int anInt786;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "J", descriptor = "I")
	public int anInt791;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "F", descriptor = "I")
	public int anInt787;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "H", descriptor = "I")
	private int anInt789;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "G", descriptor = "I")
	private int anInt788;

	@OriginalMember(owner = "client!YZDAHXEQ", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub3_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray209 = new int[arg0 * arg1];
		this.anInt786 = this.anInt790 = arg0;
		this.anInt787 = this.anInt791 = arg1;
		this.anInt788 = this.anInt789 = 0;
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub3_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt786 = local29.getWidth(arg1);
			this.anInt787 = local29.getHeight(arg1);
			this.anInt790 = this.anInt786;
			this.anInt791 = this.anInt787;
			this.anInt788 = 0;
			this.anInt789 = 0;
			this.anIntArray209 = new int[this.anInt786 * this.anInt787];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt786, this.anInt787, this.anIntArray209, 0, this.anInt786);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "<init>", descriptor = "(Lclient!MNPBQFWE;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub3_Sub4(@OriginalArg(0) Class27 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class1_Sub1_Sub2 local43 = new Class1_Sub1_Sub2(false, arg0.method340(arg1 + ".dat", null));
		@Pc(52) Class1_Sub1_Sub2 local52 = new Class1_Sub1_Sub2(false, arg0.method340("index.dat", null));
		local52.anInt10 = local43.method24();
		this.anInt790 = local52.method24();
		this.anInt791 = local52.method24();
		@Pc(67) int local67 = local52.method22();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method26();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt10 += 2;
			local43.anInt10 += local52.method24() * local52.method24();
			local52.anInt10++;
		}
		this.anInt788 = local52.method22();
		this.anInt789 = local52.method22();
		this.anInt786 = local52.method24();
		this.anInt787 = local52.method24();
		@Pc(154) int local154 = local52.method22();
		@Pc(160) int local160 = this.anInt786 * this.anInt787;
		this.anIntArray209 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray209[local168] = local70[local43.method22()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt786; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt787; local192++) {
					this.anIntArray209[local168 + local192 * this.anInt786] = local70[local43.method22()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(I)V")
	public void method524() {
		try {
			Class1_Sub1_Sub3.method512(196, this.anInt787, this.anInt786, this.anIntArray209);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("8023, " + 16595 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(IIII)V")
	public void method525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray209.length; local3++) {
				@Pc(10) int local10 = this.anIntArray209[local3];
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
					local60 += arg1;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray209[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("84021, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "c", descriptor = "(Z)V")
	public void method526() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt790 * this.anInt791];
			for (@Pc(10) int local10 = 0; local10 < this.anInt787; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt786; local14++) {
					local8[(local10 + this.anInt789) * this.anInt790 + local14 + this.anInt788] = this.anIntArray209[local10 * this.anInt786 + local14];
				}
			}
			this.anIntArray209 = local8;
			this.anInt786 = this.anInt790;
			this.anInt787 = this.anInt791;
			this.anInt788 = 0;
			this.anInt789 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("19685, " + false + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(ZII)V")
	public void method527(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt788;
			arg0 += this.anInt789;
			@Pc(18) int local18 = arg1 + arg0 * Class1_Sub1_Sub3.anInt772;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt787;
			@Pc(26) int local26 = this.anInt786;
			@Pc(30) int local30 = Class1_Sub1_Sub3.anInt772 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub3.anInt774) {
				local39 = Class1_Sub1_Sub3.anInt774 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub1_Sub3.anInt774;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub3.anInt772;
			}
			if (arg0 + local23 > Class1_Sub1_Sub3.anInt775) {
				local23 -= arg0 + local23 - Class1_Sub1_Sub3.anInt775;
			}
			if (arg1 < Class1_Sub1_Sub3.anInt776) {
				local39 = Class1_Sub1_Sub3.anInt776 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub1_Sub3.anInt776;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub1_Sub3.anInt777) {
				local39 = arg1 + local26 - Class1_Sub1_Sub3.anInt777;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method528(local23, local20, local26, local32, this.anIntArray209, Class1_Sub1_Sub3.anIntArray208, local18, local30);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("59566, " + true + ", " + arg0 + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(IIII[II[III)V")
	private void method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(14) int local14 = -arg0; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg5[arg6++] = arg4[arg1++];
					arg5[arg6++] = arg4[arg1++];
					arg5[arg6++] = arg4[arg1++];
					arg5[arg6++] = arg4[arg1++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg5[arg6++] = arg4[arg1++];
				}
				arg6 += arg7;
				arg1 += arg3;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("19440, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + -20964 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(IIZ)V")
	public void method529(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt788;
			arg1 += this.anInt789;
			@Pc(20) int local20 = arg0 + arg1 * Class1_Sub1_Sub3.anInt772;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt787;
			@Pc(28) int local28 = this.anInt786;
			@Pc(32) int local32 = Class1_Sub1_Sub3.anInt772 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub3.anInt774) {
				local41 = Class1_Sub1_Sub3.anInt774 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub1_Sub3.anInt774;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class1_Sub1_Sub3.anInt772;
			}
			if (arg1 + local25 > Class1_Sub1_Sub3.anInt775) {
				local25 -= arg1 + local25 - Class1_Sub1_Sub3.anInt775;
			}
			if (arg0 < Class1_Sub1_Sub3.anInt776) {
				local41 = Class1_Sub1_Sub3.anInt776 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub1_Sub3.anInt776;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub1_Sub3.anInt777) {
				local41 = arg0 + local28 - Class1_Sub1_Sub3.anInt777;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method530(Class1_Sub1_Sub3.anIntArray208, this.anIntArray209, local22, local20, local28, local25, local32, local34);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("46643, " + arg0 + ", " + arg1 + ", " + true + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method530(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(BIII)V")
	public void method531(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt788;
			arg2 += this.anInt789;
			@Pc(15) int local15 = arg1 + arg2 * Class1_Sub1_Sub3.anInt772;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt787;
			@Pc(23) int local23 = this.anInt786;
			@Pc(27) int local27 = Class1_Sub1_Sub3.anInt772 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class1_Sub1_Sub3.anInt774) {
				local36 = Class1_Sub1_Sub3.anInt774 - arg2;
				local20 -= local36;
				arg2 = Class1_Sub1_Sub3.anInt774;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub3.anInt772;
			}
			if (arg2 + local20 > Class1_Sub1_Sub3.anInt775) {
				local20 -= arg2 + local20 - Class1_Sub1_Sub3.anInt775;
			}
			if (arg1 < Class1_Sub1_Sub3.anInt776) {
				local36 = Class1_Sub1_Sub3.anInt776 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub3.anInt776;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub3.anInt777) {
				local36 = arg1 + local23 - Class1_Sub1_Sub3.anInt777;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method532(this.anIntArray209, 0, local15, local29, Class1_Sub1_Sub3.anIntArray208, local23, local27, local17, local20);
				if (arg0 != -128) {
					this.aBoolean182 = !this.aBoolean182;
				}
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("84828, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 128 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "([IIIZII[IIIII)V")
	private void method532(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg8; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg5; local16 < 0; local16++) {
					@Pc(23) int local23 = arg0[arg7++];
					if (local23 == 0) {
						arg2++;
					} else {
						@Pc(29) int local29 = arg4[arg2];
						arg4[arg2++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg6;
				arg7 += arg3;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("12901, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + 128 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "([IIIIIIBIII[I)V")
	public void method533(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			try {
				@Pc(17) int local17 = -arg1 / 2;
				@Pc(22) int local22 = -arg2 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg5 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg5 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg4 >> 8;
				@Pc(52) int local52 = local40 * arg4 >> 8;
				@Pc(64) int local64 = (arg3 << 16) + local22 * local46 + local17 * local52;
				@Pc(76) int local76 = (arg7 << 16) + (local22 * local52 - local17 * local46);
				@Pc(82) int local82 = arg8 + arg6 * Class1_Sub1_Sub3.anInt772;
				for (@Pc(84) int local84 = 0; local84 < arg2; local84++) {
					@Pc(90) int local90 = arg0[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg9[local84]; local111 < 0; local111++) {
						Class1_Sub1_Sub3.anIntArray208[local94++] = this.anIntArray209[(local100 >> 16) + (local106 >> 16) * this.anInt786];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class1_Sub1_Sub3.anInt772;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("53265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 21 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(IIIIIIDII)V")
	public void method534(@OriginalArg(1) int arg0, @OriginalArg(5) int arg1, @OriginalArg(6) double arg2, @OriginalArg(8) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg0 + arg3 * Class1_Sub1_Sub3.anInt772;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray209[(local77 >> 16) + (local79 >> 16) * this.anInt786];
						if (local98 == 0) {
							local75++;
						} else {
							Class1_Sub1_Sub3.anIntArray208[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class1_Sub1_Sub3.anInt772;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("86868, " + 15 + ", " + arg0 + ", " + 15 + ", " + 20 + ", " + 256 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + arg3 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(IILclient!TKCVVLIT;I)V")
	public void method535(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub3_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt788;
			arg2 += this.anInt789;
			if (this.anInt783 > 5 || this.anInt783 < 5) {
				this.anInt782 = 332;
			}
			@Pc(26) int local26 = arg0 + arg2 * Class1_Sub1_Sub3.anInt772;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt787;
			@Pc(34) int local34 = this.anInt786;
			@Pc(38) int local38 = Class1_Sub1_Sub3.anInt772 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg2 < Class1_Sub1_Sub3.anInt774) {
				local47 = Class1_Sub1_Sub3.anInt774 - arg2;
				local31 -= local47;
				arg2 = Class1_Sub1_Sub3.anInt774;
				local28 = local47 * local34 + 0;
				local26 += local47 * Class1_Sub1_Sub3.anInt772;
			}
			if (arg2 + local31 > Class1_Sub1_Sub3.anInt775) {
				local31 -= arg2 + local31 - Class1_Sub1_Sub3.anInt775;
			}
			if (arg0 < Class1_Sub1_Sub3.anInt776) {
				local47 = Class1_Sub1_Sub3.anInt776 - arg0;
				local34 -= local47;
				arg0 = Class1_Sub1_Sub3.anInt776;
				local28 += local47;
				local26 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg0 + local34 > Class1_Sub1_Sub3.anInt777) {
				local47 = arg0 + local34 - Class1_Sub1_Sub3.anInt777;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method536(local38, local28, local34, local40, 0, arg1.aByteArray19, local26, Class1_Sub1_Sub3.anIntArray208, local31, this.anIntArray209);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("11251, " + 5 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YZDAHXEQ", name = "a", descriptor = "(IIIII[BII[II[I)V")
	private void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(9) int local9 = -(arg2 >> 2);
			@Pc(14) int local14 = -(arg2 & 0x3);
			for (@Pc(17) int local17 = -arg8; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					local28 = arg9[arg1++];
					if (local28 != 0 && arg5[arg6] == 0) {
						arg7[arg6++] = local28;
					} else {
						arg6++;
					}
					local28 = arg9[arg1++];
					if (local28 != 0 && arg5[arg6] == 0) {
						arg7[arg6++] = local28;
					} else {
						arg6++;
					}
					local28 = arg9[arg1++];
					if (local28 != 0 && arg5[arg6] == 0) {
						arg7[arg6++] = local28;
					} else {
						arg6++;
					}
					local28 = arg9[arg1++];
					if (local28 != 0 && arg5[arg6] == 0) {
						arg7[arg6++] = local28;
					} else {
						arg6++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg9[arg1++];
					if (local28 != 0 && arg5[arg6] == 0) {
						arg7[arg6++] = local28;
					} else {
						arg6++;
					}
				}
				arg6 += arg0;
				arg1 += arg3;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("71577, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 252 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
