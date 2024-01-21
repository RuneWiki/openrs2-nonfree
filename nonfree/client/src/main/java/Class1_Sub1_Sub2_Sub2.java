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

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "Z")
	private boolean aBoolean167 = true;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "B")
	private byte aByte35 = -32;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt684 = 728;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "Z")
	private boolean aBoolean169 = false;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "Z")
	private boolean aBoolean170 = false;

	@OriginalMember(owner = "client!jb", name = "F", descriptor = "I")
	private int anInt685 = 6;

	@OriginalMember(owner = "client!jb", name = "G", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "I")
	public int anInt690;

	@OriginalMember(owner = "client!jb", name = "H", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!jb", name = "M", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!jb", name = "K", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!jb", name = "J", descriptor = "I")
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
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt686 = local26.getWidth(arg1);
			this.anInt687 = local26.getHeight(arg1);
			this.anInt690 = this.anInt686;
			this.anInt691 = this.anInt687;
			this.anInt688 = 0;
			this.anInt689 = 0;
			this.anIntArray210 = new int[this.anInt686 * this.anInt687];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt686, this.anInt687, this.anIntArray210, 0, this.anInt686);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class48 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class1_Sub1_Sub3 local40 = new Class1_Sub1_Sub3(arg0.method678(arg1 + ".dat", null), (byte) 3);
		@Pc(49) Class1_Sub1_Sub3 local49 = new Class1_Sub1_Sub3(arg0.method678("index.dat", null), (byte) 3);
		local49.anInt777 = local40.method500();
		this.anInt690 = local49.method500();
		this.anInt691 = local49.method500();
		@Pc(64) int local64 = local49.method498();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method502();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(104) int local104 = 0; local104 < arg2; local104++) {
			local49.anInt777 += 2;
			local40.anInt777 += local49.method500() * local49.method500();
			local49.anInt777++;
		}
		this.anInt688 = local49.method498();
		this.anInt689 = local49.method498();
		this.anInt686 = local49.method500();
		this.anInt687 = local49.method500();
		@Pc(151) int local151 = local49.method498();
		@Pc(157) int local157 = this.anInt686 * this.anInt687;
		this.anIntArray210 = new int[local157];
		@Pc(165) int local165;
		if (local151 == 0) {
			for (local165 = 0; local165 < local157; local165++) {
				this.anIntArray210[local165] = local67[local40.method498()];
			}
		} else if (local151 == 1) {
			for (local165 = 0; local165 < this.anInt686; local165++) {
				for (@Pc(189) int local189 = 0; local189 < this.anInt687; local189++) {
					this.anIntArray210[local165 + local189 * this.anInt686] = local67[local40.method498()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method401() {
		try {
			Class1_Sub1_Sub2.method453(this.anInt687, this.anIntArray210, this.anInt686);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("28224, " + 9 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray210.length; local3++) {
				@Pc(10) int local10 = this.anIntArray210[local3];
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
					this.anIntArray210[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("35366, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)V")
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
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("55527, " + false + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt688;
			arg0 += this.anInt689;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt738;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt687;
			@Pc(33) int local33 = this.anInt686;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt738 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub2.anInt740) {
				local46 = Class1_Sub1_Sub2.anInt740 - arg0;
				local30 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt740;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt738;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt741) {
				local30 -= arg0 + local30 - Class1_Sub1_Sub2.anInt741;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt742) {
				local46 = Class1_Sub1_Sub2.anInt742 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt742;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt743) {
				local46 = arg1 + local33 - Class1_Sub1_Sub2.anInt743;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method405(Class1_Sub1_Sub2.anIntArray213, local39, this.anIntArray210, local17, local15, local37, local30, local33);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("82160, " + arg0 + ", " + -18217 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[II[IIIIII)V")
	private void method405(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(16) int local16 = -(arg7 >> 2);
			@Pc(21) int local21 = -(arg7 & 0x3);
			for (@Pc(24) int local24 = -arg6; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					arg0[arg4++] = arg2[arg3++];
					arg0[arg4++] = arg2[arg3++];
					arg0[arg4++] = arg2[arg3++];
					arg0[arg4++] = arg2[arg3++];
				}
				for (@Pc(67) int local67 = local21; local67 < 0; local67++) {
					arg0[arg4++] = arg2[arg3++];
				}
				arg4 += arg5;
				arg3 += arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("15399, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method406(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt688;
			arg1 += this.anInt689;
			@Pc(22) int local22 = arg0 + arg1 * Class1_Sub1_Sub2.anInt738;
			@Pc(24) int local24 = 0;
			@Pc(27) int local27 = this.anInt687;
			@Pc(30) int local30 = this.anInt686;
			@Pc(34) int local34 = Class1_Sub1_Sub2.anInt738 - local30;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43;
			if (arg1 < Class1_Sub1_Sub2.anInt740) {
				local43 = Class1_Sub1_Sub2.anInt740 - arg1;
				local27 -= local43;
				arg1 = Class1_Sub1_Sub2.anInt740;
				local24 = local43 * local30 + 0;
				local22 += local43 * Class1_Sub1_Sub2.anInt738;
			}
			if (arg1 + local27 > Class1_Sub1_Sub2.anInt741) {
				local27 -= arg1 + local27 - Class1_Sub1_Sub2.anInt741;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt742) {
				local43 = Class1_Sub1_Sub2.anInt742 - arg0;
				local30 -= local43;
				arg0 = Class1_Sub1_Sub2.anInt742;
				local24 += local43;
				local22 += local43;
				local36 = local43 + 0;
				local34 += local43;
			}
			if (arg0 + local30 > Class1_Sub1_Sub2.anInt743) {
				local43 = arg0 + local30 - Class1_Sub1_Sub2.anInt743;
				local30 -= local43;
				local36 += local43;
				local34 += local43;
			}
			if (local30 > 0 && local27 > 0) {
				this.method407(Class1_Sub1_Sub2.anIntArray213, this.anIntArray210, local24, local22, local30, local27, local34, local36);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("9844, " + 1 + ", " + arg0 + ", " + arg1 + ", " + local145.toString());
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
	public void method408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt688;
			arg2 += this.anInt689;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt738;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt687;
			@Pc(23) int local23 = this.anInt686;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt738 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class1_Sub1_Sub2.anInt740) {
				local36 = Class1_Sub1_Sub2.anInt740 - arg2;
				local20 -= local36;
				arg2 = Class1_Sub1_Sub2.anInt740;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt738;
			}
			if (arg2 + local20 > Class1_Sub1_Sub2.anInt741) {
				local20 -= arg2 + local20 - Class1_Sub1_Sub2.anInt741;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt742) {
				local36 = Class1_Sub1_Sub2.anInt742 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt742;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt743) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt743;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method409(local23, this.aByte35, local17, local15, Class1_Sub1_Sub2.anIntArray213, 0, this.anIntArray210, local29, local20, local27);
				@Pc(143) boolean local143 = false;
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("79015, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IBII[III[IIII)V")
	private void method409(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			for (@Pc(8) int local8 = -arg8; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg0; local13 < 0; local13++) {
					@Pc(20) int local20 = arg6[arg2++];
					if (local20 == 0) {
						arg3++;
					} else {
						@Pc(26) int local26 = arg4[arg3];
						arg4[arg3++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg3 += arg9;
				arg2 += arg7;
			}
			if (arg1 != -32) {
				this.aBoolean170 = !this.aBoolean170;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("1526, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I[II[IZIIIIII)V")
	public void method410(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg0 / 2;
				@Pc(21) int local21 = -arg6 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg2 >> 8;
				@Pc(51) int local51 = local39 * arg2 >> 8;
				@Pc(63) int local63 = (arg5 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg8 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg4 + arg7 * Class1_Sub1_Sub2.anInt738;
				for (@Pc(83) int local83 = 0; local83 < arg6; local83++) {
					@Pc(89) int local89 = arg1[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg3[local83]; local110 < 0; local110++) {
						Class1_Sub1_Sub2.anIntArray213[local93++] = this.anIntArray210[(local99 >> 16) + (local105 >> 16) * this.anInt686];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub1_Sub2.anInt738;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("64729, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIDI)V")
	public void method411(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(7) double arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg1 + arg0 * Class1_Sub1_Sub2.anInt738;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray210[(local77 >> 16) + (local79 >> 16) * this.anInt686];
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
					local69 += Class1_Sub1_Sub2.anInt738;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("19567, " + arg0 + ", " + 20 + ", " + 256 + ", " + 15 + ", " + arg1 + ", " + 4 + ", " + 20 + ", " + arg2 + ", " + 15 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ZLclient!kb;II)V")
	public void method412(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt688;
			arg1 += this.anInt689;
			@Pc(25) int local25 = arg2 + arg1 * Class1_Sub1_Sub2.anInt738;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt687;
			@Pc(33) int local33 = this.anInt686;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt738 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt740) {
				local46 = Class1_Sub1_Sub2.anInt740 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt740;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt738;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt741) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt741;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt742) {
				local46 = Class1_Sub1_Sub2.anInt742 - arg2;
				local33 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt742;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg2 + local33 > Class1_Sub1_Sub2.anInt743) {
				local46 = arg2 + local33 - Class1_Sub1_Sub2.anInt743;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method413(local27, local39, 0, this.anIntArray210, arg0.aByteArray7, local33, local30, Class1_Sub1_Sub2.anIntArray213, local37, local25);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("55345, " + true + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[I[BII[IBII)V")
	private void method413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(25) int local25 = -arg6; local25 < 0; local25++) {
				@Pc(36) int local36;
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					local36 = arg3[arg0++];
					if (local36 != 0 && arg4[arg9] == 0) {
						arg7[arg9++] = local36;
					} else {
						arg9++;
					}
					local36 = arg3[arg0++];
					if (local36 != 0 && arg4[arg9] == 0) {
						arg7[arg9++] = local36;
					} else {
						arg9++;
					}
					local36 = arg3[arg0++];
					if (local36 != 0 && arg4[arg9] == 0) {
						arg7[arg9++] = local36;
					} else {
						arg9++;
					}
					local36 = arg3[arg0++];
					if (local36 != 0 && arg4[arg9] == 0) {
						arg7[arg9++] = local36;
					} else {
						arg9++;
					}
				}
				for (@Pc(112) int local112 = local11; local112 < 0; local112++) {
					local36 = arg3[arg0++];
					if (local36 != 0 && arg4[arg9] == 0) {
						arg7[arg9++] = local36;
					} else {
						arg9++;
					}
				}
				arg9 += arg8;
				arg0 += arg1;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("69306, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 118 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
