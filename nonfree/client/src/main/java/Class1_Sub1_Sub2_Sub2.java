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

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt684 = 784;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt685 = -39218;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	private int anInt688;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray210 = new int[arg0 * arg1];
		this.anInt686 = this.anInt690 = arg0;
		this.anInt687 = this.anInt691 = arg1;
		this.anInt688 = this.anInt689 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt686 = local20.getWidth(arg1);
			this.anInt687 = local20.getHeight(arg1);
			this.anInt690 = this.anInt686;
			this.anInt691 = this.anInt687;
			this.anInt688 = 0;
			this.anInt689 = 0;
			this.anIntArray210 = new int[this.anInt686 * this.anInt687];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt686, this.anInt687, this.anIntArray210, 0, this.anInt686);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(16, arg0.method678(arg1 + ".dat", null));
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(16, arg0.method678("index.dat", null));
		local43.anInt776 = local34.method500();
		this.anInt690 = local43.method500();
		this.anInt691 = local43.method500();
		@Pc(58) int local58 = local43.method498();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method502();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(92) int local92 = 0; local92 < arg2; local92++) {
			local43.anInt776 += 2;
			local34.anInt776 += local43.method500() * local43.method500();
			local43.anInt776++;
		}
		this.anInt688 = local43.method498();
		this.anInt689 = local43.method498();
		this.anInt686 = local43.method500();
		this.anInt687 = local43.method500();
		@Pc(139) int local139 = local43.method498();
		@Pc(145) int local145 = this.anInt686 * this.anInt687;
		this.anIntArray210 = new int[local145];
		@Pc(153) int local153;
		if (local139 == 0) {
			for (local153 = 0; local153 < local145; local153++) {
				this.anIntArray210[local153] = local61[local34.method498()];
			}
		} else if (local139 == 1) {
			for (local153 = 0; local153 < this.anInt686; local153++) {
				for (@Pc(177) int local177 = 0; local177 < this.anInt687; local177++) {
					this.anIntArray210[local153 + local177 * this.anInt686] = local61[local34.method498()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(Z)V")
	public void method401() {
		try {
			Class1_Sub1_Sub2.method453(this.anInt687, this.anIntArray210, this.anInt686, this.aBoolean183);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("9938, " + false + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray210.length; local3++) {
				@Pc(10) int local10 = this.anIntArray210[local3];
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
					this.anIntArray210[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			@Pc(99) boolean local99 = false;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("99371, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "(Z)V")
	public void method403() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt690 * this.anInt691];
			for (@Pc(10) int local10 = 0; local10 < this.anInt687; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt686; local14++) {
					local8[(local10 + this.anInt689) * this.anInt690 + local14 + this.anInt688] = this.anIntArray210[local10 * this.anInt686 + local14];
				}
			}
			this.anIntArray210 = local8;
			this.anInt686 = this.anInt690;
			this.anInt687 = this.anInt691;
			this.anInt688 = 0;
			this.anInt689 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("14562, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(BII)V")
	public void method404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt688;
			arg0 += this.anInt689;
			@Pc(17) int local17 = arg1 + arg0 * Class1_Sub1_Sub2.anInt740;
			@Pc(19) int local19 = 0;
			@Pc(22) int local22 = this.anInt687;
			@Pc(25) int local25 = this.anInt686;
			@Pc(29) int local29 = Class1_Sub1_Sub2.anInt740 - local25;
			@Pc(31) int local31 = 0;
			@Pc(51) int local51;
			if (arg0 < Class1_Sub1_Sub2.anInt742) {
				local51 = Class1_Sub1_Sub2.anInt742 - arg0;
				local22 -= local51;
				arg0 = Class1_Sub1_Sub2.anInt742;
				local19 = local51 * local25 + 0;
				local17 += local51 * Class1_Sub1_Sub2.anInt740;
			}
			if (arg0 + local22 > Class1_Sub1_Sub2.anInt743) {
				local22 -= arg0 + local22 - Class1_Sub1_Sub2.anInt743;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt744) {
				local51 = Class1_Sub1_Sub2.anInt744 - arg1;
				local25 -= local51;
				arg1 = Class1_Sub1_Sub2.anInt744;
				local19 += local51;
				local17 += local51;
				local31 = local51 + 0;
				local29 += local51;
			}
			if (arg1 + local25 > Class1_Sub1_Sub2.anInt745) {
				local51 = arg1 + local25 - Class1_Sub1_Sub2.anInt745;
				local25 -= local51;
				local31 += local51;
				local29 += local51;
			}
			if (local25 > 0 && local22 > 0) {
				this.method405(Class1_Sub1_Sub2.anIntArray213, local25, local31, local19, local29, local22, this.anIntArray210, local17);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("78310, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIIII[III)V")
	private void method405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg0[arg7++] = arg6[arg3++];
					arg0[arg7++] = arg6[arg3++];
					arg0[arg7++] = arg6[arg3++];
					arg0[arg7++] = arg6[arg3++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg0[arg7++] = arg6[arg3++];
				}
				arg7 += arg4;
				arg3 += arg2;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("31758, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 267 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method406(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt688;
			arg1 += this.anInt689;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt740;
			@Pc(17) int local17 = 0;
			@Pc(31) int local31 = this.anInt687;
			@Pc(34) int local34 = this.anInt686;
			@Pc(38) int local38 = Class1_Sub1_Sub2.anInt740 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg1 < Class1_Sub1_Sub2.anInt742) {
				local47 = Class1_Sub1_Sub2.anInt742 - arg1;
				local31 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt742;
				local17 = local47 * local34 + 0;
				local15 += local47 * Class1_Sub1_Sub2.anInt740;
			}
			if (arg1 + local31 > Class1_Sub1_Sub2.anInt743) {
				local31 -= arg1 + local31 - Class1_Sub1_Sub2.anInt743;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local47 = Class1_Sub1_Sub2.anInt744 - arg0;
				local34 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local17 += local47;
				local15 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg0 + local34 > Class1_Sub1_Sub2.anInt745) {
				local47 = arg0 + local34 - Class1_Sub1_Sub2.anInt745;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method407(Class1_Sub1_Sub2.anIntArray213, this.anIntArray210, local17, local15, local34, local31, local38, local40);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("50839, " + arg0 + ", " + -48420 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method407(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(IIII)V")
	public void method408(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt688;
			arg1 += this.anInt689;
			@Pc(26) int local26 = arg0 + arg1 * Class1_Sub1_Sub2.anInt740;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt687;
			@Pc(34) int local34 = this.anInt686;
			@Pc(38) int local38 = Class1_Sub1_Sub2.anInt740 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg1 < Class1_Sub1_Sub2.anInt742) {
				local47 = Class1_Sub1_Sub2.anInt742 - arg1;
				local31 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt742;
				local28 = local47 * local34 + 0;
				local26 += local47 * Class1_Sub1_Sub2.anInt740;
			}
			if (arg1 + local31 > Class1_Sub1_Sub2.anInt743) {
				local31 -= arg1 + local31 - Class1_Sub1_Sub2.anInt743;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt744) {
				local47 = Class1_Sub1_Sub2.anInt744 - arg0;
				local34 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt744;
				local28 += local47;
				local26 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg0 + local34 > Class1_Sub1_Sub2.anInt745) {
				local47 = arg0 + local34 - Class1_Sub1_Sub2.anInt745;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method409(Class1_Sub1_Sub2.anIntArray213, local31, local38, local40, local28, local34, this.anIntArray210, 0, local26);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("23859, " + arg0 + ", " + 128 + ", " + 0 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IIIIIIII[III)V")
	private void method409(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(13) int local13 = -arg1; local13 < 0; local13++) {
				for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
					@Pc(25) int local25 = arg6[arg4++];
					if (local25 == 0) {
						arg8++;
					} else {
						@Pc(31) int local31 = arg0[arg8];
						arg0[arg8++] = ((local25 & 0xFF00FF) * 128 + (local31 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local25 & 0xFF00) * 128 + (local31 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg2;
				arg4 += arg3;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("2140, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 128 + ", " + 0 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([III[IIIIIIII)V")
	public void method410(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(11) int local11 = -arg9 / 2;
				@Pc(16) int local16 = -arg8 / 2;
				@Pc(25) int local25 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = local25 * arg6 >> 8;
				@Pc(46) int local46 = local34 * arg6 >> 8;
				@Pc(58) int local58 = (arg4 << 16) + local16 * local40 + local11 * local46;
				@Pc(70) int local70 = (arg5 << 16) + (local16 * local46 - local11 * local40);
				@Pc(76) int local76 = arg2 + arg1 * Class1_Sub1_Sub2.anInt740;
				for (@Pc(78) int local78 = 0; local78 < arg8; local78++) {
					@Pc(84) int local84 = arg0[local78];
					@Pc(88) int local88 = local76 + local84;
					@Pc(94) int local94 = local58 + local46 * local84;
					@Pc(100) int local100 = local70 - local40 * local84;
					for (@Pc(105) int local105 = -arg3[local78]; local105 < 0; local105++) {
						Class1_Sub1_Sub2.anIntArray213[local88++] = this.anIntArray210[(local94 >> 16) + (local100 >> 16) * this.anInt686];
						local94 += local46;
						local100 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt740;
				}
			} catch (@Pc(153) Exception local153) {
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("83977, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIZIIIIDI)V")
	public void method411(@OriginalArg(0) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) double arg2) {
		try {
			try {
				@Pc(20) int local20 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(26) int local26 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(32) int local32 = local20 * 256 >> 8;
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(50) int local50 = local32 * -10 + local38 * -10 + 983040;
				@Pc(62) int local62 = local38 * -10 + 983040 - local32 * -10;
				@Pc(68) int local68 = arg0 + arg1 * Class1_Sub1_Sub2.anInt740;
				for (@Pc(70) int local70 = 0; local70 < 20; local70++) {
					@Pc(74) int local74 = local68;
					@Pc(76) int local76 = local50;
					@Pc(78) int local78 = local62;
					for (@Pc(81) int local81 = -20; local81 < 0; local81++) {
						@Pc(97) int local97 = this.anIntArray210[(local76 >> 16) + (local78 >> 16) * this.anInt686];
						if (local97 == 0) {
							local74++;
						} else {
							Class1_Sub1_Sub2.anIntArray213[local74++] = local97;
						}
						local76 += local38;
						local78 -= local32;
					}
					local50 += local32;
					local62 += local38;
					local68 += Class1_Sub1_Sub2.anInt740;
				}
			} catch (@Pc(136) Exception local136) {
			}
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("48676, " + arg0 + ", " + 20 + ", " + true + ", " + 256 + ", " + 15 + ", " + arg1 + ", " + 20 + ", " + arg2 + ", " + 15 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILclient!kb;)V")
	public void method412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg1 += this.anInt688;
			arg0 += this.anInt689;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt740;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt687;
			@Pc(26) int local26 = this.anInt686;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt740 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub2.anInt742) {
				local39 = Class1_Sub1_Sub2.anInt742 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt742;
				local17 = local39 * local26 + 0;
				local15 += local39 * Class1_Sub1_Sub2.anInt740;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt743) {
				local23 -= arg0 + local23 - Class1_Sub1_Sub2.anInt743;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt744) {
				local39 = Class1_Sub1_Sub2.anInt744 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt744;
				local17 += local39;
				local15 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt745) {
				local39 = arg1 + local26 - Class1_Sub1_Sub2.anInt745;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method413(local15, local26, local17, 0, local32, arg2.aByteArray7, this.anIntArray210, local23, Class1_Sub1_Sub2.anIntArray213, local30);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("12883, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIII[B[III[II)V")
	private void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(14) int local14 = -(arg1 & 0x3);
			for (@Pc(17) int local17 = -arg7; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local6; local21 < 0; local21++) {
					local28 = arg6[arg2++];
					if (local28 != 0 && arg5[arg0] == 0) {
						arg8[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg6[arg2++];
					if (local28 != 0 && arg5[arg0] == 0) {
						arg8[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg6[arg2++];
					if (local28 != 0 && arg5[arg0] == 0) {
						arg8[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg6[arg2++];
					if (local28 != 0 && arg5[arg0] == 0) {
						arg8[arg0++] = local28;
					} else {
						arg0++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg6[arg2++];
					if (local28 != 0 && arg5[arg0] == 0) {
						arg8[arg0++] = local28;
					} else {
						arg0++;
					}
				}
				arg0 += arg9;
				arg2 += arg4;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("86748, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -395 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
