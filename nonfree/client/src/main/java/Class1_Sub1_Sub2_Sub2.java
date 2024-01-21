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

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	private int anInt695 = -43533;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	private int anInt696 = 7;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "B")
	private byte aByte49 = 90;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private int anInt697 = 2;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	private int anInt698 = -302;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	public int anInt699;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray210 = new int[arg0 * arg1];
		this.anInt699 = this.anInt703 = arg0;
		this.anInt700 = this.anInt704 = arg1;
		this.anInt701 = this.anInt702 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(29) Image local29 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(34) MediaTracker local34 = new MediaTracker(arg1);
			local34.addImage(local29, 0);
			local34.waitForAll();
			this.anInt699 = local29.getWidth(arg1);
			this.anInt700 = local29.getHeight(arg1);
			this.anInt703 = this.anInt699;
			this.anInt704 = this.anInt700;
			this.anInt701 = 0;
			this.anInt702 = 0;
			this.anIntArray210 = new int[this.anInt699 * this.anInt700];
			@Pc(88) PixelGrabber local88 = new PixelGrabber(local29, 0, 0, this.anInt699, this.anInt700, this.anIntArray210, 0, this.anInt699);
			local88.grabPixels();
		} catch (@Pc(93) Exception local93) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(45427, arg0.method678(arg1 + ".dat", null));
		@Pc(52) Class1_Sub1_Sub3 local52 = new Class1_Sub1_Sub3(45427, arg0.method678("index.dat", null));
		local52.anInt796 = local43.method500();
		this.anInt703 = local52.method500();
		this.anInt704 = local52.method500();
		@Pc(67) int local67 = local52.method498();
		@Pc(70) int[] local70 = new int[local67];
		for (@Pc(72) int local72 = 0; local72 < local67 - 1; local72++) {
			local70[local72 + 1] = local52.method502();
			if (local70[local72 + 1] == 0) {
				local70[local72 + 1] = 1;
			}
		}
		for (@Pc(107) int local107 = 0; local107 < arg2; local107++) {
			local52.anInt796 += 2;
			local43.anInt796 += local52.method500() * local52.method500();
			local52.anInt796++;
		}
		this.anInt701 = local52.method498();
		this.anInt702 = local52.method498();
		this.anInt699 = local52.method500();
		this.anInt700 = local52.method500();
		@Pc(154) int local154 = local52.method498();
		@Pc(160) int local160 = this.anInt699 * this.anInt700;
		this.anIntArray210 = new int[local160];
		@Pc(168) int local168;
		if (local154 == 0) {
			for (local168 = 0; local168 < local160; local168++) {
				this.anIntArray210[local168] = local70[local43.method498()];
			}
		} else if (local154 == 1) {
			for (local168 = 0; local168 < this.anInt699; local168++) {
				for (@Pc(192) int local192 = 0; local192 < this.anInt700; local192++) {
					this.anIntArray210[local168 + local192 * this.anInt699] = local70[local43.method498()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(I)V")
	public void method401() {
		try {
			Class1_Sub1_Sub2.method453(this.anIntArray210, 741, this.anInt699, this.anInt700);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("23678, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method402(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray210.length; local3++) {
				@Pc(10) int local10 = this.anIntArray210[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg2;
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
					local60 += arg1;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray210[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("97681, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method403(@OriginalArg(0) byte arg0) {
		try {
			@Pc(8) int[] local8 = new int[this.anInt703 * this.anInt704];
			if (arg0 == 8) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt700; local14++) {
					for (@Pc(18) int local18 = 0; local18 < this.anInt699; local18++) {
						local8[(local14 + this.anInt702) * this.anInt703 + local18 + this.anInt701] = this.anIntArray210[local14 * this.anInt699 + local18];
					}
				}
				this.anIntArray210 = local8;
				this.anInt699 = this.anInt703;
				this.anInt700 = this.anInt704;
				this.anInt701 = 0;
				this.anInt702 = 0;
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("45396, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt701;
			arg0 += this.anInt702;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt756;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt700;
			@Pc(33) int local33 = this.anInt699;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt756 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub2.anInt758) {
				local46 = Class1_Sub1_Sub2.anInt758 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt758;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt756;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt759) {
				local30 -= arg0 + local30 - Class1_Sub1_Sub2.anInt759;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt760) {
				local46 = Class1_Sub1_Sub2.anInt760 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt760;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt761) {
				local46 = arg1 + local33 - Class1_Sub1_Sub2.anInt761;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method405(this.anIntArray210, local15, Class1_Sub1_Sub2.anIntArray213, local39, local30, local33, local17, local37);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("63604, " + 880 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([II[IIIIIZI)V")
	private void method405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(14) int local14 = -arg4; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg2[arg1++] = arg0[arg6++];
					arg2[arg1++] = arg0[arg6++];
					arg2[arg1++] = arg0[arg6++];
					arg2[arg1++] = arg0[arg6++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg2[arg1++] = arg0[arg6++];
				}
				arg1 += arg7;
				arg6 += arg3;
			}
		} catch (@Pc(85) RuntimeException local85) {
			signlink.reporterror("67816, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + local85.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt701;
			arg0 += this.anInt702;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub1_Sub2.anInt756;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt700;
			@Pc(23) int local23 = this.anInt699;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt756 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt758) {
				local36 = Class1_Sub1_Sub2.anInt758 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt758;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt756;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt759) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt759;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt760) {
				local36 = Class1_Sub1_Sub2.anInt760 - arg2;
				local23 -= local36;
				arg2 = Class1_Sub1_Sub2.anInt760;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg2 + local23 > Class1_Sub1_Sub2.anInt761) {
				local36 = arg2 + local23 - Class1_Sub1_Sub2.anInt761;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method407(Class1_Sub1_Sub2.anIntArray213, this.anIntArray210, local17, local15, local23, local20, local27, local29);
				if (arg1 != this.anInt695) {
					for (local36 = 1; local36 > 0; local36++) {
					}
				}
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("45795, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local149.toString());
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
	public void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt701;
			arg1 += this.anInt702;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt756;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt700;
			@Pc(33) int local33 = this.anInt699;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt756 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt758) {
				local46 = Class1_Sub1_Sub2.anInt758 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt758;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt756;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt759) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt759;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt760) {
				local46 = Class1_Sub1_Sub2.anInt760 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt760;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt761) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt761;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method409(local15, Class1_Sub1_Sub2.anIntArray213, local33, 0, local30, local17, this.anIntArray210, local39, local37);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("8566, " + arg0 + ", " + arg1 + ", " + 128 + ", " + 2 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB[IIIII[IIII)V")
	private void method409(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(19) int local19 = -arg4; local19 < 0; local19++) {
				for (@Pc(24) int local24 = -arg2; local24 < 0; local24++) {
					@Pc(31) int local31 = arg6[arg5++];
					if (local31 == 0) {
						arg0++;
					} else {
						@Pc(37) int local37 = arg1[arg0];
						arg1[arg0++] = ((local31 & 0xFF00FF) * 128 + (local37 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local31 & 0xFF00) * 128 + (local37 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg8;
				arg5 += arg7;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("58970, " + arg0 + ", " + -100 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[IZIIIIII[I)V")
	public void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		try {
			@Pc(5) int local5;
			if (!arg3) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			try {
				local5 = -arg5 / 2;
				@Pc(20) int local20 = -arg4 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg9 >> 8;
				@Pc(50) int local50 = local38 * arg9 >> 8;
				@Pc(62) int local62 = (arg1 << 16) + local20 * local44 + local5 * local50;
				@Pc(74) int local74 = (arg6 << 16) + (local20 * local50 - local5 * local44);
				@Pc(80) int local80 = arg8 + arg0 * Class1_Sub1_Sub2.anInt756;
				for (@Pc(82) int local82 = 0; local82 < arg4; local82++) {
					@Pc(88) int local88 = arg2[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg10[local82]; local109 < 0; local109++) {
						Class1_Sub1_Sub2.anIntArray213[local92++] = this.anIntArray210[(local98 >> 16) + (local104 >> 16) * this.anInt699];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub1_Sub2.anInt756;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("17644, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIDBII)V")
	public void method411(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) double arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg1 + arg0 * Class1_Sub1_Sub2.anInt756;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray210[(local83 >> 16) + (local85 >> 16) * this.anInt699];
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
					local75 += Class1_Sub1_Sub2.anInt756;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("91113, " + arg0 + ", " + 15 + ", " + arg1 + ", " + 20 + ", " + 20 + ", " + arg2 + ", " + -83 + ", " + 15 + ", " + 256 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIILclient!kb;)V")
	public void method412(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt701;
			arg1 += this.anInt702;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt756;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt700;
			@Pc(23) int local23 = this.anInt699;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt756 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt758) {
				local36 = Class1_Sub1_Sub2.anInt758 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt758;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt756;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt759) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt759;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt760) {
				local36 = Class1_Sub1_Sub2.anInt760 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt760;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt761) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt761;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method413(local29, local23, local20, arg2.aByteArray7, local15, this.anIntArray210, 0, local27, local17, this.anInt697, Class1_Sub1_Sub2.anIntArray213);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("76316, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[BI[IIIII[I)V")
	private void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		try {
			@Pc(6) int local6 = -(arg1 >> 2);
			@Pc(11) int local11 = -(arg1 & 0x3);
			for (@Pc(14) int local14 = -arg2; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg5[arg8++];
					if (local25 != 0 && arg3[arg4] == 0) {
						arg10[arg4++] = local25;
					} else {
						arg4++;
					}
					local25 = arg5[arg8++];
					if (local25 != 0 && arg3[arg4] == 0) {
						arg10[arg4++] = local25;
					} else {
						arg4++;
					}
					local25 = arg5[arg8++];
					if (local25 != 0 && arg3[arg4] == 0) {
						arg10[arg4++] = local25;
					} else {
						arg4++;
					}
					local25 = arg5[arg8++];
					if (local25 != 0 && arg3[arg4] == 0) {
						arg10[arg4++] = local25;
					} else {
						arg4++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg5[arg8++];
					if (local25 != 0 && arg3[arg4] == 0) {
						arg10[arg4++] = local25;
					} else {
						arg4++;
					}
				}
				arg4 += arg7;
				arg8 += arg0;
			}
			if (arg9 != 2) {
				this.aBoolean160 = !this.aBoolean160;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("24527, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
