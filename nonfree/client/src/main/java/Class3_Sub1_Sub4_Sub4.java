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

@OriginalClass("client!SWNASVGQ")
public final class Class3_Sub1_Sub4_Sub4 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!SWNASVGQ", name = "y", descriptor = "I")
	private int anInt640 = 1;

	@OriginalMember(owner = "client!SWNASVGQ", name = "z", descriptor = "I")
	private int anInt641 = -770;

	@OriginalMember(owner = "client!SWNASVGQ", name = "A", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!SWNASVGQ", name = "B", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!SWNASVGQ", name = "C", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!SWNASVGQ", name = "D", descriptor = "I")
	private int anInt642 = -29;

	@OriginalMember(owner = "client!SWNASVGQ", name = "E", descriptor = "[I")
	public int[] anIntArray175;

	@OriginalMember(owner = "client!SWNASVGQ", name = "J", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!SWNASVGQ", name = "F", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!SWNASVGQ", name = "K", descriptor = "I")
	public int anInt648;

	@OriginalMember(owner = "client!SWNASVGQ", name = "G", descriptor = "I")
	public int anInt644;

	@OriginalMember(owner = "client!SWNASVGQ", name = "I", descriptor = "I")
	private int anInt646;

	@OriginalMember(owner = "client!SWNASVGQ", name = "H", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!SWNASVGQ", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray175 = new int[arg0 * arg1];
		this.anInt643 = this.anInt647 = arg0;
		this.anInt644 = this.anInt648 = arg1;
		this.anInt645 = this.anInt646 = 0;
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt643 = local23.getWidth(arg1);
			this.anInt644 = local23.getHeight(arg1);
			this.anInt647 = this.anInt643;
			this.anInt648 = this.anInt644;
			this.anInt645 = 0;
			this.anInt646 = 0;
			this.anIntArray175 = new int[this.anInt643 * this.anInt644];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt643, this.anInt644, this.anIntArray175, 0, this.anInt643);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "<init>", descriptor = "(Lclient!GWOEELWB;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub4_Sub4(@OriginalArg(0) Class13 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class3_Sub1_Sub2 local37 = new Class3_Sub1_Sub2(true, arg0.method140(arg1 + ".dat", null));
		@Pc(46) Class3_Sub1_Sub2 local46 = new Class3_Sub1_Sub2(true, arg0.method140("index.dat", null));
		local46.anInt429 = local37.method202();
		this.anInt647 = local46.method202();
		this.anInt648 = local46.method202();
		@Pc(61) int local61 = local46.method200();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method204();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt429 += 2;
			local37.anInt429 += local46.method202() * local46.method202();
			local46.anInt429++;
		}
		this.anInt645 = local46.method200();
		this.anInt646 = local46.method200();
		this.anInt643 = local46.method202();
		this.anInt644 = local46.method202();
		@Pc(148) int local148 = local46.method200();
		@Pc(154) int local154 = this.anInt643 * this.anInt644;
		this.anIntArray175 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray175[local162] = local64[local37.method200()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt643; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt644; local186++) {
					this.anIntArray175[local162 + local186 * this.anInt643] = local64[local37.method200()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "b", descriptor = "(I)V")
	public void method444() {
		try {
			Class3_Sub1_Sub4.method432(this.anInt643, this.anIntArray175, this.anInt644);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("34182, " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(IIII)V")
	public void method445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray175.length; local7++) {
				@Pc(14) int local14 = this.anIntArray175[local7];
				if (local14 != 0) {
					@Pc(22) int local22 = local14 >> 16 & 0xFF;
					local22 += arg3;
					if (local22 < 1) {
						local22 = 1;
					} else if (local22 > 255) {
						local22 = 255;
					}
					@Pc(44) int local44 = local14 >> 8 & 0xFF;
					local44 += arg2;
					if (local44 < 1) {
						local44 = 1;
					} else if (local44 > 255) {
						local44 = 255;
					}
					@Pc(64) int local64 = local14 & 0xFF;
					local64 += arg0;
					if (local64 < 1) {
						local64 = 1;
					} else if (local64 > 255) {
						local64 = 255;
					}
					this.anIntArray175[local7] = (local22 << 16) + (local44 << 8) + local64;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("29374, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "c", descriptor = "(I)V")
	public void method446() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt647 * this.anInt648];
			for (@Pc(10) int local10 = 0; local10 < this.anInt644; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt643; local14++) {
					local8[(local10 + this.anInt646) * this.anInt647 + local14 + this.anInt645] = this.anIntArray175[local10 * this.anInt643 + local14];
				}
			}
			this.anIntArray175 = local8;
			this.anInt643 = this.anInt647;
			this.anInt644 = this.anInt648;
			this.anInt645 = 0;
			this.anInt646 = 0;
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("66289, " + 9 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(IIZ)V")
	public void method447(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt645;
			arg1 += this.anInt646;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub4.anInt631;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt644;
			@Pc(23) int local23 = this.anInt643;
			@Pc(27) int local27 = Class3_Sub1_Sub4.anInt631 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class3_Sub1_Sub4.anInt633) {
				local36 = Class3_Sub1_Sub4.anInt633 - arg1;
				local20 -= local36;
				arg1 = Class3_Sub1_Sub4.anInt633;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class3_Sub1_Sub4.anInt631;
			}
			if (arg1 + local20 > Class3_Sub1_Sub4.anInt634) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub4.anInt634;
			}
			if (arg0 < Class3_Sub1_Sub4.anInt635) {
				local36 = Class3_Sub1_Sub4.anInt635 - arg0;
				local23 -= local36;
				arg0 = Class3_Sub1_Sub4.anInt635;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class3_Sub1_Sub4.anInt636) {
				local36 = arg0 + local23 - Class3_Sub1_Sub4.anInt636;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method448(local23, Class3_Sub1_Sub4.anIntArray174, local15, local27, this.anIntArray175, local17, 58, local20, local29);
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("14547, " + arg0 + ", " + arg1 + ", " + true + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(I[III[IIIII)V")
	private void method448(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(10) boolean local10 = false;
			@Pc(15) int local15 = -(arg0 & 0x3);
			for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg1[arg2++] = arg4[arg5++];
					arg1[arg2++] = arg4[arg5++];
					arg1[arg2++] = arg4[arg5++];
					arg1[arg2++] = arg4[arg5++];
				}
				for (@Pc(61) int local61 = local15; local61 < 0; local61++) {
					arg1[arg2++] = arg4[arg5++];
				}
				arg2 += arg3;
				arg5 += arg8;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("25369, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(IIB)V")
	public void method449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			arg0 += this.anInt645;
			arg1 += this.anInt646;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub4.anInt631;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt644;
			@Pc(23) int local23 = this.anInt643;
			@Pc(27) int local27 = Class3_Sub1_Sub4.anInt631 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class3_Sub1_Sub4.anInt633) {
				local36 = Class3_Sub1_Sub4.anInt633 - arg1;
				local20 -= local36;
				arg1 = Class3_Sub1_Sub4.anInt633;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class3_Sub1_Sub4.anInt631;
			}
			if (arg1 + local20 > Class3_Sub1_Sub4.anInt634) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub4.anInt634;
			}
			if (arg0 < Class3_Sub1_Sub4.anInt635) {
				local36 = Class3_Sub1_Sub4.anInt635 - arg0;
				local23 -= local36;
				arg0 = Class3_Sub1_Sub4.anInt635;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class3_Sub1_Sub4.anInt636) {
				local36 = arg0 + local23 - Class3_Sub1_Sub4.anInt636;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method450(Class3_Sub1_Sub4.anIntArray174, this.anIntArray175, local17, local15, local23, local20, local27, local29);
				@Pc(141) boolean local141 = false;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("60245, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method450(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!SWNASVGQ", name = "b", descriptor = "(IIII)V")
	public void method451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt645;
			arg1 += this.anInt646;
			@Pc(15) int local15 = arg0 + arg1 * Class3_Sub1_Sub4.anInt631;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt644;
			@Pc(23) int local23 = this.anInt643;
			@Pc(27) int local27 = Class3_Sub1_Sub4.anInt631 - local23;
			@Pc(29) int local29 = 0;
			@Pc(48) int local48;
			if (arg1 < Class3_Sub1_Sub4.anInt633) {
				local48 = Class3_Sub1_Sub4.anInt633 - arg1;
				local20 -= local48;
				arg1 = Class3_Sub1_Sub4.anInt633;
				local17 = local48 * local23 + 0;
				local15 += local48 * Class3_Sub1_Sub4.anInt631;
			}
			if (arg1 + local20 > Class3_Sub1_Sub4.anInt634) {
				local20 -= arg1 + local20 - Class3_Sub1_Sub4.anInt634;
			}
			if (arg0 < Class3_Sub1_Sub4.anInt635) {
				local48 = Class3_Sub1_Sub4.anInt635 - arg0;
				local23 -= local48;
				arg0 = Class3_Sub1_Sub4.anInt635;
				local17 += local48;
				local15 += local48;
				local29 = local48 + 0;
				local27 += local48;
			}
			if (arg0 + local23 > Class3_Sub1_Sub4.anInt636) {
				local48 = arg0 + local23 - Class3_Sub1_Sub4.anInt636;
				local23 -= local48;
				local29 += local48;
				local27 += local48;
			}
			if (local23 > 0 && local20 > 0) {
				this.method452(Class3_Sub1_Sub4.anIntArray174, local17, local15, 0, local20, this.anIntArray175, local23, local27, local29);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("91137, " + arg0 + ", " + arg1 + ", " + 128 + ", " + -770 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "([IIIIZII[IIII)V")
	private void method452(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg4; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg6; local16 < 0; local16++) {
					@Pc(23) int local23 = arg5[arg1++];
					if (local23 == 0) {
						arg2++;
					} else {
						@Pc(29) int local29 = arg0[arg2];
						arg0[arg2++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg7;
				arg1 += arg8;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("52140, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + true + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "([I[IIIIIIIIII)V")
	public void method453(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg7 / 2;
				@Pc(21) int local21 = -arg9 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg3 >> 8;
				@Pc(51) int local51 = local39 * arg3 >> 8;
				@Pc(63) int local63 = (arg5 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg6 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg4 + arg2 * Class3_Sub1_Sub4.anInt631;
				for (@Pc(83) int local83 = 0; local83 < arg9; local83++) {
					@Pc(89) int local89 = arg0[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg1[local83]; local110 < 0; local110++) {
						Class3_Sub1_Sub4.anIntArray174[local93++] = this.anIntArray175[(local99 >> 16) + (local105 >> 16) * this.anInt643];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class3_Sub1_Sub4.anInt631;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("95124, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 0 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(IIDBIIIII)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1, @OriginalArg(3) byte arg2, @OriginalArg(8) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(25) int local25 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(31) int local31 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(37) int local37 = local25 * 256 >> 8;
				@Pc(43) int local43 = local31 * 256 >> 8;
				@Pc(55) int local55 = local37 * -10 + local43 * -10 + 983040;
				@Pc(67) int local67 = local43 * -10 + 983040 - local37 * -10;
				@Pc(73) int local73 = arg0 + arg3 * Class3_Sub1_Sub4.anInt631;
				for (@Pc(75) int local75 = 0; local75 < 20; local75++) {
					@Pc(79) int local79 = local73;
					@Pc(81) int local81 = local55;
					@Pc(83) int local83 = local67;
					for (@Pc(86) int local86 = -20; local86 < 0; local86++) {
						@Pc(102) int local102 = this.anIntArray175[(local81 >> 16) + (local83 >> 16) * this.anInt643];
						if (local102 == 0) {
							local79++;
						} else {
							Class3_Sub1_Sub4.anIntArray174[local79++] = local102;
						}
						local81 += local43;
						local83 -= local37;
					}
					local55 += local37;
					local67 += local43;
					local73 += Class3_Sub1_Sub4.anInt631;
				}
			} catch (@Pc(141) Exception local141) {
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("39079, " + arg0 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + 15 + ", " + 256 + ", " + 15 + ", " + arg3 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(IIILclient!NUXLZYAZ;)V")
	public void method455(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub1_Sub4_Sub1 arg2) {
		try {
			arg1 += this.anInt645;
			arg0 += this.anInt646;
			@Pc(15) int local15 = arg1 + arg0 * Class3_Sub1_Sub4.anInt631;
			@Pc(17) int local17 = 0;
			@Pc(30) int local30 = this.anInt644;
			@Pc(33) int local33 = this.anInt643;
			@Pc(37) int local37 = Class3_Sub1_Sub4.anInt631 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg0 < Class3_Sub1_Sub4.anInt633) {
				local46 = Class3_Sub1_Sub4.anInt633 - arg0;
				local30 -= local46;
				arg0 = Class3_Sub1_Sub4.anInt633;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class3_Sub1_Sub4.anInt631;
			}
			if (arg0 + local30 > Class3_Sub1_Sub4.anInt634) {
				local30 -= arg0 + local30 - Class3_Sub1_Sub4.anInt634;
			}
			if (arg1 < Class3_Sub1_Sub4.anInt635) {
				local46 = Class3_Sub1_Sub4.anInt635 - arg1;
				local33 -= local46;
				arg1 = Class3_Sub1_Sub4.anInt635;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class3_Sub1_Sub4.anInt636) {
				local46 = arg1 + local33 - Class3_Sub1_Sub4.anInt636;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method456(local30, local33, Class3_Sub1_Sub4.anIntArray174, local37, arg2.aByteArray16, this.anIntArray175, 0, local15, local39, local17);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("21224, " + -797 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SWNASVGQ", name = "a", descriptor = "(III[II[B[IIIII)V")
	private void method456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(10) int local10 = -(arg1 >> 2);
			@Pc(15) int local15 = -(arg1 & 0x3);
			for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
				@Pc(29) int local29;
				for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
					local29 = arg5[arg9++];
					if (local29 != 0 && arg4[arg7] == 0) {
						arg2[arg7++] = local29;
					} else {
						arg7++;
					}
					local29 = arg5[arg9++];
					if (local29 != 0 && arg4[arg7] == 0) {
						arg2[arg7++] = local29;
					} else {
						arg7++;
					}
					local29 = arg5[arg9++];
					if (local29 != 0 && arg4[arg7] == 0) {
						arg2[arg7++] = local29;
					} else {
						arg7++;
					}
					local29 = arg5[arg9++];
					if (local29 != 0 && arg4[arg7] == 0) {
						arg2[arg7++] = local29;
					} else {
						arg7++;
					}
				}
				for (@Pc(105) int local105 = local15; local105 < 0; local105++) {
					local29 = arg5[arg9++];
					if (local29 != 0 && arg4[arg7] == 0) {
						arg2[arg7++] = local29;
					} else {
						arg7++;
					}
				}
				arg7 += arg3;
				arg9 += arg8;
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("87588, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}
}
