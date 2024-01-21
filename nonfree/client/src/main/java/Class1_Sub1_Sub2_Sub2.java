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

	@OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
	private int anInt686;

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
	private int anInt685 = -11252;

	@OriginalMember(owner = "client!jb", name = "y", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!jb", name = "D", descriptor = "I")
	public int anInt691;

	@OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
	public int anInt687;

	@OriginalMember(owner = "client!jb", name = "E", descriptor = "I")
	public int anInt692;

	@OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
	public int anInt688;

	@OriginalMember(owner = "client!jb", name = "C", descriptor = "I")
	private int anInt690;

	@OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
	private int anInt689;

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray209 = new int[arg0 * arg1];
		this.anInt687 = this.anInt691 = arg0;
		this.anInt688 = this.anInt692 = arg1;
		this.anInt689 = this.anInt690 = 0;
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(16) MediaTracker local16 = new MediaTracker(arg1);
			local16.addImage(local11, 0);
			local16.waitForAll();
			this.anInt687 = local11.getWidth(arg1);
			this.anInt688 = local11.getHeight(arg1);
			this.anInt691 = this.anInt687;
			this.anInt692 = this.anInt688;
			this.anInt689 = 0;
			this.anInt690 = 0;
			this.anIntArray209 = new int[this.anInt687 * this.anInt688];
			@Pc(70) PixelGrabber local70 = new PixelGrabber(local11, 0, 0, this.anInt687, this.anInt688, this.anIntArray209, 0, this.anInt687);
			local70.grabPixels();
		} catch (@Pc(75) Exception local75) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!yb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class46 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(25) Class1_Sub1_Sub3 local25 = new Class1_Sub1_Sub3(arg0.method674(arg1 + ".dat", null), false);
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method674("index.dat", null), false);
		local34.anInt778 = local25.method498();
		this.anInt691 = local34.method498();
		this.anInt692 = local34.method498();
		@Pc(49) int local49 = local34.method496();
		@Pc(52) int[] local52 = new int[local49];
		for (@Pc(54) int local54 = 0; local54 < local49 - 1; local54++) {
			local52[local54 + 1] = local34.method500();
			if (local52[local54 + 1] == 0) {
				local52[local54 + 1] = 1;
			}
		}
		for (@Pc(83) int local83 = 0; local83 < arg2; local83++) {
			local34.anInt778 += 2;
			local25.anInt778 += local34.method498() * local34.method498();
			local34.anInt778++;
		}
		this.anInt689 = local34.method496();
		this.anInt690 = local34.method496();
		this.anInt687 = local34.method498();
		this.anInt688 = local34.method498();
		@Pc(130) int local130 = local34.method496();
		@Pc(136) int local136 = this.anInt687 * this.anInt688;
		this.anIntArray209 = new int[local136];
		@Pc(144) int local144;
		if (local130 == 0) {
			for (local144 = 0; local144 < local136; local144++) {
				this.anIntArray209[local144] = local52[local25.method496()];
			}
		} else if (local130 == 1) {
			for (local144 = 0; local144 < this.anInt687; local144++) {
				for (@Pc(168) int local168 = 0; local168 < this.anInt688; local168++) {
					this.anIntArray209[local144 + local168 * this.anInt687] = local52[local25.method496()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public void method399(@OriginalArg(0) byte arg0) {
		try {
			Class1_Sub1_Sub2.method451(this.anIntArray209, this.anInt687, this.anInt688);
			if (arg0 != -41) {
				this.anInt686 = -444;
			}
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("49606, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IZII)V")
	public void method400(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(8) int local8 = 0; local8 < this.anIntArray209.length; local8++) {
				@Pc(15) int local15 = this.anIntArray209[local8];
				if (local15 != 0) {
					@Pc(23) int local23 = local15 >> 16 & 0xFF;
					local23 += arg0;
					if (local23 < 1) {
						local23 = 1;
					} else if (local23 > 255) {
						local23 = 255;
					}
					@Pc(45) int local45 = local15 >> 8 & 0xFF;
					local45 += arg1;
					if (local45 < 1) {
						local45 = 1;
					} else if (local45 > 255) {
						local45 = 255;
					}
					@Pc(65) int local65 = local15 & 0xFF;
					local65 += arg2;
					if (local65 < 1) {
						local65 = 1;
					} else if (local65 > 255) {
						local65 = 255;
					}
					this.anIntArray209[local8] = (local23 << 16) + (local45 << 8) + local65;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("65685, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public void method401() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt691 * this.anInt692];
			for (@Pc(10) int local10 = 0; local10 < this.anInt688; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt687; local14++) {
					local8[(local10 + this.anInt690) * this.anInt691 + local14 + this.anInt689] = this.anIntArray209[local10 * this.anInt687 + local14];
				}
			}
			this.anIntArray209 = local8;
			this.anInt687 = this.anInt691;
			this.anInt688 = this.anInt692;
			this.anInt689 = 0;
			this.anInt690 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("32008, " + -377 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public void method402(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt689;
			arg1 += this.anInt690;
			@Pc(21) int local21 = arg0 + arg1 * Class1_Sub1_Sub2.anInt743;
			@Pc(23) int local23 = 0;
			@Pc(26) int local26 = this.anInt688;
			@Pc(29) int local29 = this.anInt687;
			@Pc(33) int local33 = Class1_Sub1_Sub2.anInt743 - local29;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42;
			if (arg1 < Class1_Sub1_Sub2.anInt745) {
				local42 = Class1_Sub1_Sub2.anInt745 - arg1;
				local26 -= local42;
				arg1 = Class1_Sub1_Sub2.anInt745;
				local23 = local42 * local29 + 0;
				local21 += local42 * Class1_Sub1_Sub2.anInt743;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt746) {
				local26 -= arg1 + local26 - Class1_Sub1_Sub2.anInt746;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt747) {
				local42 = Class1_Sub1_Sub2.anInt747 - arg0;
				local29 -= local42;
				arg0 = Class1_Sub1_Sub2.anInt747;
				local23 += local42;
				local21 += local42;
				local35 = local42 + 0;
				local33 += local42;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt748) {
				local42 = arg0 + local29 - Class1_Sub1_Sub2.anInt748;
				local29 -= local42;
				local35 += local42;
				local33 += local42;
			}
			if (local29 > 0 && local26 > 0) {
				this.method403(local33, local29, local23, Class1_Sub1_Sub2.anIntArray212, local35, this.anIntArray209, local21, local26);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("75138, " + arg0 + ", " + 49740 + ", " + arg1 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III[II[IIZI)V")
	private void method403(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(11) int local11 = -(arg1 >> 2);
			@Pc(16) int local16 = -(arg1 & 0x3);
			for (@Pc(19) int local19 = -arg7; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					arg3[arg6++] = arg5[arg2++];
					arg3[arg6++] = arg5[arg2++];
					arg3[arg6++] = arg5[arg2++];
					arg3[arg6++] = arg5[arg2++];
				}
				for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
					arg3[arg6++] = arg5[arg2++];
				}
				arg6 += arg0;
				arg2 += arg4;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("41104, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + true + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(III)V")
	public void method404(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt689;
			arg1 += this.anInt690;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub1_Sub2.anInt743;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt688;
			@Pc(26) int local26 = this.anInt687;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt743 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt745) {
				local39 = Class1_Sub1_Sub2.anInt745 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt745;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt743;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt746) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt746;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt747) {
				local39 = Class1_Sub1_Sub2.anInt747 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt747;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt748) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt748;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method405(Class1_Sub1_Sub2.anIntArray212, this.anIntArray209, local20, local18, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("33180, " + arg0 + ", " + 200 + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method405(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)V")
	public void method406(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg1 += this.anInt689;
			arg0 += this.anInt690;
			@Pc(24) int local24 = arg1 + arg0 * Class1_Sub1_Sub2.anInt743;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt688;
			@Pc(32) int local32 = this.anInt687;
			@Pc(36) int local36 = Class1_Sub1_Sub2.anInt743 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg0 < Class1_Sub1_Sub2.anInt745) {
				local45 = Class1_Sub1_Sub2.anInt745 - arg0;
				local29 -= local45;
				arg0 = Class1_Sub1_Sub2.anInt745;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class1_Sub1_Sub2.anInt743;
			}
			if (arg0 + local29 > Class1_Sub1_Sub2.anInt746) {
				local29 -= arg0 + local29 - Class1_Sub1_Sub2.anInt746;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt747) {
				local45 = Class1_Sub1_Sub2.anInt747 - arg1;
				local32 -= local45;
				arg1 = Class1_Sub1_Sub2.anInt747;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg1 + local32 > Class1_Sub1_Sub2.anInt748) {
				local45 = arg1 + local32 - Class1_Sub1_Sub2.anInt748;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method407(local24, local38, local36, local29, (byte) 6, this.anIntArray209, 0, local26, Class1_Sub1_Sub2.anIntArray212, local32);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("36206, " + 0 + ", " + 128 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIB[IIII[II)V")
	private void method407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			for (@Pc(8) int local8 = -arg3; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg9; local13 < 0; local13++) {
					@Pc(20) int local20 = arg5[arg7++];
					if (local20 == 0) {
						arg0++;
					} else {
						@Pc(26) int local26 = arg8[arg0];
						arg8[arg0++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg2;
				arg7 += arg1;
			}
			@Pc(81) boolean local81 = false;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("64926, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 128 + ", " + arg8 + ", " + arg9 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "([IZ[IIIIIIIII)V")
	public void method408(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg7 / 2;
				@Pc(14) int local14 = -arg5 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg2 >> 8;
				@Pc(44) int local44 = local32 * arg2 >> 8;
				@Pc(56) int local56 = (arg4 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg6 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg9 + arg3 * Class1_Sub1_Sub2.anInt743;
				for (@Pc(76) int local76 = 0; local76 < arg5; local76++) {
					@Pc(82) int local82 = arg0[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg1[local76]; local103 < 0; local103++) {
						Class1_Sub1_Sub2.anIntArray212[local86++] = this.anIntArray209[(local92 >> 16) + (local98 >> 16) * this.anInt687];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub1_Sub2.anInt743;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("23000, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIZDI)V")
	public void method409(@OriginalArg(3) int arg0, @OriginalArg(5) int arg1, @OriginalArg(7) double arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg0 + arg1 * Class1_Sub1_Sub2.anInt743;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray209[(local83 >> 16) + (local85 >> 16) * this.anInt687];
						if (local104 == 0) {
							local81++;
						} else {
							Class1_Sub1_Sub2.anIntArray212[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class1_Sub1_Sub2.anInt743;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("45214, " + 15 + ", " + 256 + ", " + 15 + ", " + arg0 + ", " + 20 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + 20 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILclient!kb;IB)V")
	public void method410(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt689;
			arg2 += this.anInt690;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt743;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt688;
			@Pc(23) int local23 = this.anInt687;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt743 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class1_Sub1_Sub2.anInt745) {
				local36 = Class1_Sub1_Sub2.anInt745 - arg2;
				local20 -= local36;
				arg2 = Class1_Sub1_Sub2.anInt745;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt743;
			}
			if (arg2 + local20 > Class1_Sub1_Sub2.anInt746) {
				local20 -= arg2 + local20 - Class1_Sub1_Sub2.anInt746;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt747) {
				local36 = Class1_Sub1_Sub2.anInt747 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt747;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt748) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt748;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method411(local17, local20, arg1.aByteArray7, local23, Class1_Sub1_Sub2.anIntArray212, 0, this.anIntArray209, local29, local27, local15);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("5, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 2 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II[BI[II[IIIIB)V")
	private void method411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg6[arg0++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg4[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg6[arg0++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg4[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg6[arg0++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg4[arg9++] = local25;
					} else {
						arg9++;
					}
					local25 = arg6[arg0++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg4[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg6[arg0++];
					if (local25 != 0 && arg2[arg9] == 0) {
						arg4[arg9++] = local25;
					} else {
						arg9++;
					}
				}
				arg9 += arg8;
				arg0 += arg7;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("55853, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + -75 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
