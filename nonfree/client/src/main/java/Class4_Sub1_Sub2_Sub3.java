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

@OriginalClass("client!TTWFVYGB")
public final class Class4_Sub1_Sub2_Sub3 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!TTWFVYGB", name = "y", descriptor = "I")
	private int anInt600 = -47744;

	@OriginalMember(owner = "client!TTWFVYGB", name = "z", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!TTWFVYGB", name = "A", descriptor = "Z")
	private boolean aBoolean160 = true;

	@OriginalMember(owner = "client!TTWFVYGB", name = "B", descriptor = "[I")
	public int[] anIntArray149;

	@OriginalMember(owner = "client!TTWFVYGB", name = "G", descriptor = "I")
	public int anInt605;

	@OriginalMember(owner = "client!TTWFVYGB", name = "C", descriptor = "I")
	public int anInt601;

	@OriginalMember(owner = "client!TTWFVYGB", name = "H", descriptor = "I")
	public int anInt606;

	@OriginalMember(owner = "client!TTWFVYGB", name = "D", descriptor = "I")
	public int anInt602;

	@OriginalMember(owner = "client!TTWFVYGB", name = "F", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!TTWFVYGB", name = "E", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!TTWFVYGB", name = "<init>", descriptor = "(II)V")
	public Class4_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray149 = new int[arg0 * arg1];
		this.anInt601 = this.anInt605 = arg0;
		this.anInt602 = this.anInt606 = arg1;
		this.anInt603 = this.anInt604 = 0;
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class4_Sub1_Sub2_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(14) Image local14 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(19) MediaTracker local19 = new MediaTracker(arg1);
			local19.addImage(local14, 0);
			local19.waitForAll();
			this.anInt601 = local14.getWidth(arg1);
			this.anInt602 = local14.getHeight(arg1);
			this.anInt605 = this.anInt601;
			this.anInt606 = this.anInt602;
			this.anInt603 = 0;
			this.anInt604 = 0;
			this.anIntArray149 = new int[this.anInt601 * this.anInt602];
			@Pc(73) PixelGrabber local73 = new PixelGrabber(local14, 0, 0, this.anInt601, this.anInt602, this.anIntArray149, 0, this.anInt601);
			local73.grabPixels();
		} catch (@Pc(78) Exception local78) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "<init>", descriptor = "(Lclient!QDHHNYHL;Ljava/lang/String;I)V")
	public Class4_Sub1_Sub2_Sub3(@OriginalArg(0) Class32 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(28) Class4_Sub1_Sub4 local28 = new Class4_Sub1_Sub4(5, arg0.method426(arg1 + ".dat", null));
		@Pc(37) Class4_Sub1_Sub4 local37 = new Class4_Sub1_Sub4(5, arg0.method426("index.dat", null));
		local37.anInt506 = local28.method357();
		this.anInt605 = local37.method357();
		this.anInt606 = local37.method357();
		@Pc(52) int local52 = local37.method355();
		@Pc(55) int[] local55 = new int[local52];
		for (@Pc(57) int local57 = 0; local57 < local52 - 1; local57++) {
			local55[local57 + 1] = local37.method359();
			if (local55[local57 + 1] == 0) {
				local55[local57 + 1] = 1;
			}
		}
		for (@Pc(86) int local86 = 0; local86 < arg2; local86++) {
			local37.anInt506 += 2;
			local28.anInt506 += local37.method357() * local37.method357();
			local37.anInt506++;
		}
		this.anInt603 = local37.method355();
		this.anInt604 = local37.method355();
		this.anInt601 = local37.method357();
		this.anInt602 = local37.method357();
		@Pc(133) int local133 = local37.method355();
		@Pc(139) int local139 = this.anInt601 * this.anInt602;
		this.anIntArray149 = new int[local139];
		@Pc(147) int local147;
		if (local133 == 0) {
			for (local147 = 0; local147 < local139; local147++) {
				this.anIntArray149[local147] = local55[local28.method355()];
			}
		} else if (local133 == 1) {
			for (local147 = 0; local147 < this.anInt601; local147++) {
				for (@Pc(171) int local171 = 0; local171 < this.anInt602; local171++) {
					this.anIntArray149[local147 + local171 * this.anInt601] = local55[local28.method355()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "b", descriptor = "(Z)V")
	public void method461(@OriginalArg(0) boolean arg0) {
		try {
			Class4_Sub1_Sub2.method491(this.anIntArray149, this.anInt602, this.anInt601);
			if (arg0) {
				;
			}
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("84549, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(IIIB)V")
	public void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray149.length; local3++) {
				@Pc(10) int local10 = this.anIntArray149[local3];
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
					this.anIntArray149[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("63709, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "c", descriptor = "(Z)V")
	public void method463() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt605 * this.anInt606];
			for (@Pc(10) int local10 = 0; local10 < this.anInt602; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt601; local14++) {
					local8[(local10 + this.anInt604) * this.anInt605 + local14 + this.anInt603] = this.anIntArray149[local10 * this.anInt601 + local14];
				}
			}
			this.anIntArray149 = local8;
			this.anInt601 = this.anInt605;
			this.anInt602 = this.anInt606;
			this.anInt603 = 0;
			this.anInt604 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("43571, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(III)V")
	public void method464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			arg0 += this.anInt603;
			arg2 += this.anInt604;
			@Pc(19) int local19 = arg0 + arg2 * Class4_Sub1_Sub2.anInt688;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt602;
			@Pc(27) int local27 = this.anInt601;
			@Pc(31) int local31 = Class4_Sub1_Sub2.anInt688 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg2 < Class4_Sub1_Sub2.anInt690) {
				local40 = Class4_Sub1_Sub2.anInt690 - arg2;
				local24 -= local40;
				arg2 = Class4_Sub1_Sub2.anInt690;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class4_Sub1_Sub2.anInt688;
			}
			if (arg2 + local24 > Class4_Sub1_Sub2.anInt691) {
				local24 -= arg2 + local24 - Class4_Sub1_Sub2.anInt691;
			}
			if (arg0 < Class4_Sub1_Sub2.anInt692) {
				local40 = Class4_Sub1_Sub2.anInt692 - arg0;
				local27 -= local40;
				arg0 = Class4_Sub1_Sub2.anInt692;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class4_Sub1_Sub2.anInt693) {
				local40 = arg0 + local27 - Class4_Sub1_Sub2.anInt693;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method465(local33, local19, local21, Class4_Sub1_Sub2.anIntArray164, local31, local27, local24, this.anIntArray149);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("48636, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(III[IIZII[I)V")
	private void method465(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(19) int local19 = -arg6; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					arg3[arg1++] = arg7[arg2++];
					arg3[arg1++] = arg7[arg2++];
					arg3[arg1++] = arg7[arg2++];
					arg3[arg1++] = arg7[arg2++];
				}
				for (@Pc(62) int local62 = local11; local62 < 0; local62++) {
					arg3[arg1++] = arg7[arg2++];
				}
				arg1 += arg4;
				arg2 += arg0;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("72159, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + true + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(IIZ)V")
	public void method466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt603;
			arg1 += this.anInt604;
			@Pc(15) int local15 = arg0 + arg1 * Class4_Sub1_Sub2.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt602;
			@Pc(23) int local23 = this.anInt601;
			@Pc(27) int local27 = Class4_Sub1_Sub2.anInt688 - local23;
			@Pc(29) int local29 = 0;
			@Pc(39) int local39;
			if (arg1 < Class4_Sub1_Sub2.anInt690) {
				local39 = Class4_Sub1_Sub2.anInt690 - arg1;
				local20 -= local39;
				arg1 = Class4_Sub1_Sub2.anInt690;
				local17 = local39 * local23 + 0;
				local15 += local39 * Class4_Sub1_Sub2.anInt688;
			}
			if (arg1 + local20 > Class4_Sub1_Sub2.anInt691) {
				local20 -= arg1 + local20 - Class4_Sub1_Sub2.anInt691;
			}
			if (arg0 < Class4_Sub1_Sub2.anInt692) {
				local39 = Class4_Sub1_Sub2.anInt692 - arg0;
				local23 -= local39;
				arg0 = Class4_Sub1_Sub2.anInt692;
				local17 += local39;
				local15 += local39;
				local29 = local39 + 0;
				local27 += local39;
			}
			if (arg0 + local23 > Class4_Sub1_Sub2.anInt693) {
				local39 = arg0 + local23 - Class4_Sub1_Sub2.anInt693;
				local23 -= local39;
				local29 += local39;
				local27 += local39;
			}
			if (local23 > 0 && local20 > 0) {
				this.method467(Class4_Sub1_Sub2.anIntArray164, this.anIntArray149, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("85390, " + arg0 + ", " + arg1 + ", " + false + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method467(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!TTWFVYGB", name = "b", descriptor = "(IIIB)V")
	public void method468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt603;
			arg1 += this.anInt604;
			@Pc(15) int local15 = arg0 + arg1 * Class4_Sub1_Sub2.anInt688;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt602;
			@Pc(23) int local23 = this.anInt601;
			@Pc(27) int local27 = Class4_Sub1_Sub2.anInt688 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class4_Sub1_Sub2.anInt690) {
				local36 = Class4_Sub1_Sub2.anInt690 - arg1;
				local20 -= local36;
				arg1 = Class4_Sub1_Sub2.anInt690;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class4_Sub1_Sub2.anInt688;
			}
			if (arg1 + local20 > Class4_Sub1_Sub2.anInt691) {
				local20 -= arg1 + local20 - Class4_Sub1_Sub2.anInt691;
			}
			if (arg0 < Class4_Sub1_Sub2.anInt692) {
				local36 = Class4_Sub1_Sub2.anInt692 - arg0;
				local23 -= local36;
				arg0 = Class4_Sub1_Sub2.anInt692;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class4_Sub1_Sub2.anInt693) {
				local36 = arg0 + local23 - Class4_Sub1_Sub2.anInt693;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method469(local15, local17, Class4_Sub1_Sub2.anIntArray164, this.anIntArray149, local20, local29, local23, local27, 0, 546);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("15349, " + 128 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(II[I[IIIIIIII)V")
	private void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) boolean local9 = false;
			for (@Pc(12) int local12 = -arg4; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg6; local17 < 0; local17++) {
					@Pc(24) int local24 = arg3[arg1++];
					if (local24 == 0) {
						arg0++;
					} else {
						@Pc(30) int local30 = arg2[arg0];
						arg2[arg0++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg7;
				arg1 += arg5;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("72666, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 128 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(II[IIIIII[III)V")
	public void method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(11) int local11 = -arg8 / 2;
				@Pc(16) int local16 = -arg5 / 2;
				@Pc(25) int local25 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = local25 * arg6 >> 8;
				@Pc(46) int local46 = local34 * arg6 >> 8;
				@Pc(58) int local58 = (arg3 << 16) + local16 * local40 + local11 * local46;
				@Pc(70) int local70 = (arg1 << 16) + (local16 * local46 - local11 * local40);
				@Pc(76) int local76 = arg4 + arg9 * Class4_Sub1_Sub2.anInt688;
				for (@Pc(78) int local78 = 0; local78 < arg5; local78++) {
					@Pc(84) int local84 = arg2[local78];
					@Pc(88) int local88 = local76 + local84;
					@Pc(94) int local94 = local58 + local46 * local84;
					@Pc(100) int local100 = local70 - local40 * local84;
					for (@Pc(105) int local105 = -arg7[local78]; local105 < 0; local105++) {
						Class4_Sub1_Sub2.anIntArray164[local88++] = this.anIntArray149[(local94 >> 16) + (local100 >> 16) * this.anInt601];
						local94 += local46;
						local100 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class4_Sub1_Sub2.anInt688;
				}
			} catch (@Pc(153) Exception local153) {
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("97265, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + -579 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(IIIIDIZII)V")
	public void method471(@OriginalArg(4) double arg0, @OriginalArg(5) int arg1, @OriginalArg(6) boolean arg2, @OriginalArg(8) int arg3) {
		try {
			if (!arg2) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg1 + arg3 * Class4_Sub1_Sub2.anInt688;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray149[(local82 >> 16) + (local84 >> 16) * this.anInt601];
						if (local103 == 0) {
							local80++;
						} else {
							Class4_Sub1_Sub2.anIntArray164[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class4_Sub1_Sub2.anInt688;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("22491, " + 15 + ", " + 256 + ", " + 15 + ", " + 20 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + arg3 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(IIILclient!KWBPZBYX;)V")
	public void method472(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class4_Sub1_Sub2_Sub2 arg2) {
		try {
			arg1 += this.anInt603;
			arg0 += this.anInt604;
			@Pc(18) int local18 = arg1 + arg0 * Class4_Sub1_Sub2.anInt688;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt602;
			@Pc(26) int local26 = this.anInt601;
			@Pc(30) int local30 = Class4_Sub1_Sub2.anInt688 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class4_Sub1_Sub2.anInt690) {
				local39 = Class4_Sub1_Sub2.anInt690 - arg0;
				local23 -= local39;
				arg0 = Class4_Sub1_Sub2.anInt690;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class4_Sub1_Sub2.anInt688;
			}
			if (arg0 + local23 > Class4_Sub1_Sub2.anInt691) {
				local23 -= arg0 + local23 - Class4_Sub1_Sub2.anInt691;
			}
			if (arg1 < Class4_Sub1_Sub2.anInt692) {
				local39 = Class4_Sub1_Sub2.anInt692 - arg1;
				local26 -= local39;
				arg1 = Class4_Sub1_Sub2.anInt692;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class4_Sub1_Sub2.anInt693) {
				local39 = arg1 + local26 - Class4_Sub1_Sub2.anInt693;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method473(0, local23, local20, Class4_Sub1_Sub2.anIntArray164, local18, local26, arg2.aByteArray9, this.anIntArray149, local30, local32);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("38618, " + arg0 + ", " + arg1 + ", " + 864 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTWFVYGB", name = "a", descriptor = "(III[III[B[IIII)V")
	private void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg5 >> 2);
			@Pc(11) int local11 = -(arg5 & 0x3);
			for (@Pc(24) int local24 = -arg1; local24 < 0; local24++) {
				@Pc(35) int local35;
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					local35 = arg7[arg2++];
					if (local35 != 0 && arg6[arg4] == 0) {
						arg3[arg4++] = local35;
					} else {
						arg4++;
					}
					local35 = arg7[arg2++];
					if (local35 != 0 && arg6[arg4] == 0) {
						arg3[arg4++] = local35;
					} else {
						arg4++;
					}
					local35 = arg7[arg2++];
					if (local35 != 0 && arg6[arg4] == 0) {
						arg3[arg4++] = local35;
					} else {
						arg4++;
					}
					local35 = arg7[arg2++];
					if (local35 != 0 && arg6[arg4] == 0) {
						arg3[arg4++] = local35;
					} else {
						arg4++;
					}
				}
				for (@Pc(111) int local111 = local11; local111 < 0; local111++) {
					local35 = arg7[arg2++];
					if (local35 != 0 && arg6[arg4] == 0) {
						arg3[arg4++] = local35;
					} else {
						arg4++;
					}
				}
				arg4 += arg8;
				arg2 += arg9;
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("22745, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 2 + ", " + arg8 + ", " + arg9 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}
}
