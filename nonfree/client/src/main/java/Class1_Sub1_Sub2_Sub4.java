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

@OriginalClass("client!YGMSKJOQ")
public final class Class1_Sub1_Sub2_Sub4 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!YGMSKJOQ", name = "z", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "A", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "B", descriptor = "B")
	private byte aByte43 = -83;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "C", descriptor = "I")
	private int anInt826 = 303;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "D", descriptor = "I")
	private int anInt827 = -87;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "E", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "F", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "K", descriptor = "I")
	public int anInt832;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "G", descriptor = "I")
	public int anInt828;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "L", descriptor = "I")
	public int anInt833;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "H", descriptor = "I")
	public int anInt829;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "J", descriptor = "I")
	private int anInt831;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "I", descriptor = "I")
	private int anInt830;

	@OriginalMember(owner = "client!YGMSKJOQ", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt828 = this.anInt832 = arg0;
		this.anInt829 = this.anInt833 = arg1;
		this.anInt830 = this.anInt831 = 0;
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt828 = local23.getWidth(arg1);
			this.anInt829 = local23.getHeight(arg1);
			this.anInt832 = this.anInt828;
			this.anInt833 = this.anInt829;
			this.anInt830 = 0;
			this.anInt831 = 0;
			this.anIntArray208 = new int[this.anInt828 * this.anInt829];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt828, this.anInt829, this.anIntArray208, 0, this.anInt828);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "<init>", descriptor = "(Lclient!QKFGLETG;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub4(@OriginalArg(0) Class36 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3((byte) 9, arg0.method337(arg1 + ".dat", null));
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3((byte) 9, arg0.method337("index.dat", null));
		local46.anInt806 = local37.method500();
		this.anInt832 = local46.method500();
		this.anInt833 = local46.method500();
		@Pc(61) int local61 = local46.method498();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method502();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt806 += 2;
			local37.anInt806 += local46.method500() * local46.method500();
			local46.anInt806++;
		}
		this.anInt830 = local46.method498();
		this.anInt831 = local46.method498();
		this.anInt828 = local46.method500();
		this.anInt829 = local46.method500();
		@Pc(148) int local148 = local46.method498();
		@Pc(154) int local154 = this.anInt828 * this.anInt829;
		this.anIntArray208 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray208[local162] = local64[local37.method498()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt828; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt829; local186++) {
					this.anIntArray208[local162 + local186 * this.anInt828] = local64[local37.method498()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "c", descriptor = "(I)V")
	public void method549(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			Class1_Sub1_Sub2.method537(this.anInt828, this.anIntArray208, this.anInt829);
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("62913, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(IBII)V")
	public void method550(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			if (arg1 != -79) {
				this.aBoolean183 = !this.aBoolean183;
			}
			for (@Pc(14) int local14 = 0; local14 < this.anIntArray208.length; local14++) {
				@Pc(21) int local21 = this.anIntArray208[local14];
				if (local21 != 0) {
					@Pc(29) int local29 = local21 >> 16 & 0xFF;
					local29 += arg2;
					if (local29 < 1) {
						local29 = 1;
					} else if (local29 > 255) {
						local29 = 255;
					}
					@Pc(51) int local51 = local21 >> 8 & 0xFF;
					local51 += arg3;
					if (local51 < 1) {
						local51 = 1;
					} else if (local51 > 255) {
						local51 = 255;
					}
					@Pc(71) int local71 = local21 & 0xFF;
					local71 += arg0;
					if (local71 < 1) {
						local71 = 1;
					} else if (local71 > 255) {
						local71 = 255;
					}
					this.anIntArray208[local14] = (local29 << 16) + (local51 << 8) + local71;
				}
			}
		} catch (@Pc(108) RuntimeException local108) {
			signlink.reporterror("15243, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local108.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "d", descriptor = "(I)V")
	public void method551(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int[] local8 = new int[this.anInt832 * this.anInt833];
			for (@Pc(10) int local10 = 0; local10 < this.anInt829; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt828; local14++) {
					local8[(local10 + this.anInt831) * this.anInt832 + local14 + this.anInt830] = this.anIntArray208[local10 * this.anInt828 + local14];
				}
			}
			this.anIntArray208 = local8;
			this.anInt828 = this.anInt832;
			this.anInt829 = this.anInt833;
			this.anInt830 = 0;
			@Pc(67) boolean local67 = false;
			this.anInt831 = 0;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("63165, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(BII)V")
	public void method552(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt830;
			arg1 += this.anInt831;
			@Pc(26) int local26 = arg0 + arg1 * Class1_Sub1_Sub2.anInt817;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt829;
			@Pc(34) int local34 = this.anInt828;
			@Pc(38) int local38 = Class1_Sub1_Sub2.anInt817 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg1 < Class1_Sub1_Sub2.anInt819) {
				local47 = Class1_Sub1_Sub2.anInt819 - arg1;
				local31 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt819;
				local28 = local47 * local34 + 0;
				local26 += local47 * Class1_Sub1_Sub2.anInt817;
			}
			if (arg1 + local31 > Class1_Sub1_Sub2.anInt820) {
				local31 -= arg1 + local31 - Class1_Sub1_Sub2.anInt820;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt821) {
				local47 = Class1_Sub1_Sub2.anInt821 - arg0;
				local34 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt821;
				local28 += local47;
				local26 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg0 + local34 > Class1_Sub1_Sub2.anInt822) {
				local47 = arg0 + local34 - Class1_Sub1_Sub2.anInt822;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method553(local38, local31, Class1_Sub1_Sub2.anIntArray207, this.anIntArray208, local26, local28, local34, local40);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("11182, " + 82 + ", " + arg0 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(IIB[I[IIIII)V")
	private void method553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg2[arg4++] = arg3[arg5++];
					arg2[arg4++] = arg3[arg5++];
					arg2[arg4++] = arg3[arg5++];
					arg2[arg4++] = arg3[arg5++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg2[arg4++] = arg3[arg5++];
				}
				arg4 += arg0;
				arg5 += arg7;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("63003, " + arg0 + ", " + arg1 + ", " + 10 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(IIB)V")
	public void method554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt830;
			arg0 += this.anInt831;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt817;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt829;
			@Pc(23) int local23 = this.anInt828;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt817 - local23;
			@Pc(29) int local29 = 0;
			@Pc(42) int local42;
			if (arg0 < Class1_Sub1_Sub2.anInt819) {
				local42 = Class1_Sub1_Sub2.anInt819 - arg0;
				local20 -= local42;
				arg0 = Class1_Sub1_Sub2.anInt819;
				local17 = local42 * local23 + 0;
				local15 += local42 * Class1_Sub1_Sub2.anInt817;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt820) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt820;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt821) {
				local42 = Class1_Sub1_Sub2.anInt821 - arg1;
				local23 -= local42;
				arg1 = Class1_Sub1_Sub2.anInt821;
				local17 += local42;
				local15 += local42;
				local29 = local42 + 0;
				local27 += local42;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt822) {
				local42 = arg1 + local23 - Class1_Sub1_Sub2.anInt822;
				local23 -= local42;
				local29 += local42;
				local27 += local42;
			}
			if (local23 > 0 && local20 > 0) {
				this.method555(Class1_Sub1_Sub2.anIntArray207, this.anIntArray208, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("73087, " + arg0 + ", " + arg1 + ", " + 35 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method555(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(ZIII)V")
	public void method556(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt830;
			arg0 += this.anInt831;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt817;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt829;
			@Pc(23) int local23 = this.anInt828;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt817 - local23;
			@Pc(29) int local29 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub2.anInt819) {
				local39 = Class1_Sub1_Sub2.anInt819 - arg0;
				local20 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt819;
				local17 = local39 * local23 + 0;
				local15 += local39 * Class1_Sub1_Sub2.anInt817;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt820) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt820;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt821) {
				local39 = Class1_Sub1_Sub2.anInt821 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt821;
				local17 += local39;
				local15 += local39;
				local29 = local39 + 0;
				local27 += local39;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt822) {
				local39 = arg1 + local23 - Class1_Sub1_Sub2.anInt822;
				local23 -= local39;
				local29 += local39;
				local27 += local39;
			}
			if (local23 > 0 && local20 > 0) {
				this.method557(0, local17, local27, this.anIntArray208, local20, local23, Class1_Sub1_Sub2.anIntArray207, local29, local15);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("62063, " + false + ", " + arg0 + ", " + arg1 + ", " + 128 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(IIII[III[IIII)V")
	private void method557(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg4; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg5; local13 < 0; local13++) {
					@Pc(20) int local20 = arg3[arg1++];
					if (local20 == 0) {
						arg8++;
					} else {
						@Pc(26) int local26 = arg6[arg8];
						arg6[arg8++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg2;
				arg1 += arg7;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("28274, " + 24778 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(I[IIIIII[IIII)V")
	public void method558(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(17) int local17 = -arg9 / 2;
				@Pc(22) int local22 = -arg8 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg7 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg7 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg2 >> 8;
				@Pc(52) int local52 = local40 * arg2 >> 8;
				@Pc(64) int local64 = (arg5 << 16) + local22 * local46 + local17 * local52;
				@Pc(76) int local76 = (arg0 << 16) + (local22 * local52 - local17 * local46);
				@Pc(82) int local82 = arg4 + arg3 * Class1_Sub1_Sub2.anInt817;
				for (@Pc(84) int local84 = 0; local84 < arg8; local84++) {
					@Pc(90) int local90 = arg1[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg6[local84]; local111 < 0; local111++) {
						Class1_Sub1_Sub2.anIntArray207[local94++] = this.anIntArray208[(local100 >> 16) + (local106 >> 16) * this.anInt828];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class1_Sub1_Sub2.anInt817;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("18005, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 34359 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(IDIIIBIII)V")
	public void method559(@OriginalArg(1) double arg0, @OriginalArg(4) int arg1, @OriginalArg(6) int arg2) {
		try {
			try {
				@Pc(28) int local28 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(46) int local46 = local34 * 256 >> 8;
				@Pc(58) int local58 = local40 * -10 + local46 * -10 + 983040;
				@Pc(70) int local70 = local46 * -10 + 983040 - local40 * -10;
				@Pc(76) int local76 = arg1 + arg2 * Class1_Sub1_Sub2.anInt817;
				for (@Pc(78) int local78 = 0; local78 < 20; local78++) {
					@Pc(82) int local82 = local76;
					@Pc(84) int local84 = local58;
					@Pc(86) int local86 = local70;
					for (@Pc(89) int local89 = -20; local89 < 0; local89++) {
						@Pc(105) int local105 = this.anIntArray208[(local84 >> 16) + (local86 >> 16) * this.anInt828];
						if (local105 == 0) {
							local82++;
						} else {
							Class1_Sub1_Sub2.anIntArray207[local82++] = local105;
						}
						local84 += local46;
						local86 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt817;
				}
			} catch (@Pc(144) Exception local144) {
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("56046, " + 15 + ", " + arg0 + ", " + 20 + ", " + 20 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + 15 + ", " + 256 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(Lclient!DEITBGVL;III)V")
	public void method560(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt830;
			arg1 += this.anInt831;
			@Pc(19) int local19 = arg2 + arg1 * Class1_Sub1_Sub2.anInt817;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt829;
			@Pc(27) int local27 = this.anInt828;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt817 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub2.anInt819) {
				local40 = Class1_Sub1_Sub2.anInt819 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt819;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt817;
			}
			if (arg1 + local24 > Class1_Sub1_Sub2.anInt820) {
				local24 -= arg1 + local24 - Class1_Sub1_Sub2.anInt820;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt821) {
				local40 = Class1_Sub1_Sub2.anInt821 - arg2;
				local27 -= local40;
				arg2 = Class1_Sub1_Sub2.anInt821;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg2 + local27 > Class1_Sub1_Sub2.anInt822) {
				local40 = arg2 + local27 - Class1_Sub1_Sub2.anInt822;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method561(local31, local19, this.anIntArray208, local21, local33, arg0.aByteArray2, local24, 0, local27, Class1_Sub1_Sub2.anIntArray207);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("1312, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -31972 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGMSKJOQ", name = "a", descriptor = "(IBI[III[BIII[I)V")
	private void method561(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(6) int local6 = -(arg8 >> 2);
			@Pc(11) int local11 = -(arg8 & 0x3);
			for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
				@Pc(29) int local29;
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					local29 = arg2[arg3++];
					if (local29 != 0 && arg5[arg1] == 0) {
						arg9[arg1++] = local29;
					} else {
						arg1++;
					}
					local29 = arg2[arg3++];
					if (local29 != 0 && arg5[arg1] == 0) {
						arg9[arg1++] = local29;
					} else {
						arg1++;
					}
					local29 = arg2[arg3++];
					if (local29 != 0 && arg5[arg1] == 0) {
						arg9[arg1++] = local29;
					} else {
						arg1++;
					}
					local29 = arg2[arg3++];
					if (local29 != 0 && arg5[arg1] == 0) {
						arg9[arg1++] = local29;
					} else {
						arg1++;
					}
				}
				for (@Pc(105) int local105 = local11; local105 < 0; local105++) {
					local29 = arg2[arg3++];
					if (local29 != 0 && arg5[arg1] == 0) {
						arg9[arg1++] = local29;
					} else {
						arg1++;
					}
				}
				arg1 += arg0;
				arg3 += arg4;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("68968, " + arg0 + ", " + -119 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
