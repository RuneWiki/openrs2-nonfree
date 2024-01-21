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

@OriginalClass("client!hb")
public final class Class1_Sub3_Sub2_Sub2 extends Class1_Sub3_Sub2 {

	@OriginalMember(owner = "client!hb", name = "x", descriptor = "Z")
	private boolean aBoolean101 = false;

	@OriginalMember(owner = "client!hb", name = "y", descriptor = "B")
	private byte aByte30 = 120;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
	private int anInt459 = 1;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "I")
	private int anInt460 = 48612;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	public int anInt465;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	public int anInt461;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	public int anInt466;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "I")
	public int anInt462;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	private int anInt464;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	private int anInt463;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray148 = new int[arg0 * arg1];
		this.anInt461 = this.anInt465 = arg0;
		this.anInt462 = this.anInt466 = arg1;
		this.anInt463 = this.anInt464 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt461 = local20.getWidth(arg1);
			this.anInt462 = local20.getHeight(arg1);
			this.anInt465 = this.anInt461;
			this.anInt466 = this.anInt462;
			this.anInt463 = 0;
			this.anInt464 = 0;
			this.anIntArray148 = new int[this.anInt461 * this.anInt462];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt461, this.anInt462, this.anIntArray148, 0, this.anInt461);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(35) Class1_Sub3_Sub3 local35 = new Class1_Sub3_Sub3(0, arg0.method528(arg1 + ".dat", null));
		@Pc(45) Class1_Sub3_Sub3 local45 = new Class1_Sub3_Sub3(0, arg0.method528("index.dat", null));
		local45.anInt566 = local35.method385();
		this.anInt465 = local45.method385();
		this.anInt466 = local45.method385();
		@Pc(60) int local60 = local45.method383();
		@Pc(63) int[] local63 = new int[local60];
		for (@Pc(65) int local65 = 0; local65 < local60 - 1; local65++) {
			local63[local65 + 1] = local45.method387();
			if (local63[local65 + 1] == 0) {
				local63[local65 + 1] = 1;
			}
		}
		for (@Pc(94) int local94 = 0; local94 < arg2; local94++) {
			local45.anInt566 += 2;
			local35.anInt566 += local45.method385() * local45.method385();
			local45.anInt566++;
		}
		this.anInt463 = local45.method383();
		this.anInt464 = local45.method383();
		this.anInt461 = local45.method385();
		this.anInt462 = local45.method385();
		@Pc(141) int local141 = local45.method383();
		@Pc(147) int local147 = this.anInt461 * this.anInt462;
		this.anIntArray148 = new int[local147];
		@Pc(155) int local155;
		if (local141 == 0) {
			for (local155 = 0; local155 < local147; local155++) {
				this.anIntArray148[local155] = local63[local35.method383()];
			}
		} else if (local141 == 1) {
			for (local155 = 0; local155 < this.anInt461; local155++) {
				for (@Pc(179) int local179 = 0; local179 < this.anInt462; local179++) {
					this.anIntArray148[local155 + local179 * this.anInt461] = local63[local35.method383()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	public void method316() {
		try {
			if (this.aByte30 != 120) {
				for (@Pc(5) int local5 = 1; local5 > 0; local5++) {
				}
			}
			Class1_Sub3_Sub2.method350((byte) 2, this.anInt462, this.anIntArray148, this.anInt461);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("44631, " + 120 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IZI)V")
	public void method317(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt463;
			arg1 += this.anInt464;
			@Pc(20) int local20 = arg0 + arg1 * Class1_Sub3_Sub2.anInt532;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt462;
			@Pc(28) int local28 = this.anInt461;
			@Pc(32) int local32 = Class1_Sub3_Sub2.anInt532 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub3_Sub2.anInt534) {
				local41 = Class1_Sub3_Sub2.anInt534 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub3_Sub2.anInt534;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class1_Sub3_Sub2.anInt532;
			}
			if (arg1 + local25 > Class1_Sub3_Sub2.anInt535) {
				local25 -= arg1 + local25 - Class1_Sub3_Sub2.anInt535;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt536) {
				local41 = Class1_Sub3_Sub2.anInt536 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub3_Sub2.anInt536;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub3_Sub2.anInt537) {
				local41 = arg0 + local28 - Class1_Sub3_Sub2.anInt537;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method318(Class1_Sub3_Sub2.anIntArray178, local25, local20, local32, (byte) 3, local34, this.anIntArray148, local28, local22);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("53681, " + arg0 + ", " + true + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIBI[III)V")
	private void method318(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			@Pc(16) boolean local16 = false;
			for (@Pc(24) int local24 = -arg1; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg0[arg2++] = arg6[arg8++];
					arg0[arg2++] = arg6[arg8++];
					arg0[arg2++] = arg6[arg8++];
					arg0[arg2++] = arg6[arg8++];
				}
				for (@Pc(67) int local67 = local11; local67 < 0; local67++) {
					arg0[arg2++] = arg6[arg8++];
				}
				arg2 += arg3;
				arg8 += arg5;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("98964, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method319(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt463;
			arg1 += this.anInt464;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt532;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt462;
			@Pc(23) int local23 = this.anInt461;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt532 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub3_Sub2.anInt534) {
				local36 = Class1_Sub3_Sub2.anInt534 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub3_Sub2.anInt534;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub3_Sub2.anInt532;
			}
			if (arg1 + local20 > Class1_Sub3_Sub2.anInt535) {
				local20 -= arg1 + local20 - Class1_Sub3_Sub2.anInt535;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt536) {
				local36 = Class1_Sub3_Sub2.anInt536 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub3_Sub2.anInt536;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt537) {
				local36 = arg0 + local23 - Class1_Sub3_Sub2.anInt537;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method320(Class1_Sub3_Sub2.anIntArray178, this.anIntArray148, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("85434, " + -790 + ", " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method320(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIBII)V")
	public void method321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		try {
			try {
				@Pc(6) int local6 = this.anInt461;
				@Pc(9) int local9 = this.anInt462;
				@Pc(11) int local11 = 0;
				@Pc(13) int local13 = 0;
				@Pc(28) int local28 = this.anInt465;
				@Pc(31) int local31 = this.anInt466;
				@Pc(37) int local37 = (local28 << 16) / 22;
				@Pc(43) int local43 = (local31 << 16) / 22;
				arg0 = (this.anInt463 * 22 + local28 - 1) / local28 + 5;
				arg1 = (this.anInt464 * 22 + local31 - 1) / local31 + 5;
				if (this.anInt463 * 22 % local28 != 0) {
					local11 = (local28 - this.anInt463 * 22 % local28 << 16) / 22;
				}
				if (this.anInt464 * 22 % local31 != 0) {
					local13 = (local31 - this.anInt464 * 22 % local31 << 16) / 22;
				}
				arg3 = (this.anInt461 - (local11 >> 16)) * 22 / local28;
				arg2 = (this.anInt462 - (local13 >> 16)) * 22 / local31;
				@Pc(137) int local137 = arg0 + arg1 * Class1_Sub3_Sub2.anInt532;
				@Pc(141) int local141 = Class1_Sub3_Sub2.anInt532 - arg3;
				@Pc(148) int local148;
				if (arg1 < Class1_Sub3_Sub2.anInt534) {
					local148 = Class1_Sub3_Sub2.anInt534 - arg1;
					arg2 -= local148;
					arg1 = 0;
					local137 += local148 * Class1_Sub3_Sub2.anInt532;
					local13 += local43 * local148;
				}
				if (arg1 + arg2 > Class1_Sub3_Sub2.anInt535) {
					arg2 -= arg1 + arg2 - Class1_Sub3_Sub2.anInt535;
				}
				if (arg0 < Class1_Sub3_Sub2.anInt536) {
					local148 = Class1_Sub3_Sub2.anInt536 - arg0;
					arg3 -= local148;
					arg0 = 0;
					local137 += local148;
					local11 += local37 * local148;
					local141 += local148;
				}
				if (arg0 + arg3 > Class1_Sub3_Sub2.anInt537) {
					local148 = arg0 + arg3 - Class1_Sub3_Sub2.anInt537;
					arg3 -= local148;
					local141 += local148;
				}
				this.method322(local13, local37, arg2, local141, local6, local137, Class1_Sub3_Sub2.anIntArray178, arg3, local11, local43, 0, this.anIntArray148);
			} catch (@Pc(243) Exception local243) {
				System.out.println("error in sprite clipping routine");
			}
		} catch (@Pc(248) RuntimeException local248) {
			signlink.reporterror("2914, " + arg0 + ", " + arg1 + ", " + 4 + ", " + arg2 + ", " + arg3 + ", " + local248.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIII[IIIII[I)V")
	private void method322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11) {
		try {
			try {
				@Pc(6) int local6 = arg8;
				for (@Pc(9) int local9 = -arg2; local9 < 0; local9++) {
					@Pc(17) int local17 = (arg0 >> 16) * arg4;
					for (@Pc(20) int local20 = -arg7; local20 < 0; local20++) {
						@Pc(30) int local30 = arg11[(arg8 >> 16) + local17];
						if (local30 == 0) {
							arg5++;
						} else {
							arg6[arg5++] = local30;
						}
						arg8 += arg1;
					}
					arg0 += arg9;
					arg8 = local6;
					arg5 += arg3;
				}
			} catch (@Pc(62) Exception local62) {
				System.out.println("error in plot_scale");
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("49701, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -984 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIZ)V")
	public void method323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt463;
			arg0 += this.anInt464;
			@Pc(18) int local18 = arg1 + arg0 * Class1_Sub3_Sub2.anInt532;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt462;
			@Pc(26) int local26 = this.anInt461;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt532 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub3_Sub2.anInt534) {
				local39 = Class1_Sub3_Sub2.anInt534 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub3_Sub2.anInt534;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub3_Sub2.anInt532;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt535) {
				local23 -= arg0 + local23 - Class1_Sub3_Sub2.anInt535;
			}
			if (arg1 < Class1_Sub3_Sub2.anInt536) {
				local39 = Class1_Sub3_Sub2.anInt536 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub3_Sub2.anInt536;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub3_Sub2.anInt537) {
				local39 = arg1 + local26 - Class1_Sub3_Sub2.anInt537;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method324(local23, local26, local20, this.anIntArray148, local18, Class1_Sub3_Sub2.anIntArray178, local32, 0, local30);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("2030, " + arg0 + ", " + arg1 + ", " + 128 + ", " + false + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III[IZI[IIIII)V")
	private void method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(11) int local11 = -arg0; local11 < 0; local11++) {
				for (@Pc(16) int local16 = -arg1; local16 < 0; local16++) {
					@Pc(23) int local23 = arg3[arg2++];
					if (local23 == 0) {
						arg4++;
					} else {
						@Pc(29) int local29 = arg5[arg4];
						arg5[arg4++] = ((local23 & 0xFF00FF) * 128 + (local29 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local23 & 0xFF00) * 128 + (local29 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg8;
				arg2 += arg6;
			}
		} catch (@Pc(81) RuntimeException local81) {
			signlink.reporterror("1480, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + false + ", " + arg4 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local81.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIIIII[I[II)V")
	public void method325(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg1 / 2;
				@Pc(14) int local14 = -arg9 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg4 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg4 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg5 >> 8;
				@Pc(44) int local44 = local32 * arg5 >> 8;
				@Pc(56) int local56 = (arg0 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg3 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg2 + arg6 * Class1_Sub3_Sub2.anInt532;
				for (@Pc(76) int local76 = 0; local76 < arg9; local76++) {
					@Pc(82) int local82 = arg8[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg7[local76]; local103 < 0; local103++) {
						Class1_Sub3_Sub2.anIntArray178[local86++] = this.anIntArray148[(local92 >> 16) + (local98 >> 16) * this.anInt461];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub3_Sub2.anInt532;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("36354, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!ib;I)V")
	public void method326(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub3_Sub2_Sub3 arg2, @OriginalArg(3) int arg3) {
		try {
			arg0 += this.anInt463;
			arg1 += this.anInt464;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub3_Sub2.anInt532;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt462;
			@Pc(23) int local23 = this.anInt461;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt532 - local23;
			@Pc(29) int local29 = 0;
			if (arg3 == this.anInt459) {
				@Pc(41) int local41;
				if (arg1 < Class1_Sub3_Sub2.anInt534) {
					local41 = Class1_Sub3_Sub2.anInt534 - arg1;
					local20 -= local41;
					arg1 = Class1_Sub3_Sub2.anInt534;
					local17 = local41 * local23 + 0;
					local15 += local41 * Class1_Sub3_Sub2.anInt532;
				}
				if (arg1 + local20 > Class1_Sub3_Sub2.anInt535) {
					local20 -= arg1 + local20 - Class1_Sub3_Sub2.anInt535;
				}
				if (arg0 < Class1_Sub3_Sub2.anInt536) {
					local41 = Class1_Sub3_Sub2.anInt536 - arg0;
					local23 -= local41;
					arg0 = Class1_Sub3_Sub2.anInt536;
					local17 += local41;
					local15 += local41;
					local29 = local41 + 0;
					local27 += local41;
				}
				if (arg0 + local23 > Class1_Sub3_Sub2.anInt537) {
					local41 = arg0 + local23 - Class1_Sub3_Sub2.anInt537;
					local23 -= local41;
					local29 += local41;
					local27 += local41;
				}
				if (local23 > 0 && local20 > 0) {
					this.method327(local15, 0, this.anIntArray148, Class1_Sub3_Sub2.anIntArray178, arg2.aByteArray6, local27, local23, local20, local29, local17);
				}
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("48274, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB[I[I[BIIIII)V")
	private void method327(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = -(arg6 >> 2);
			@Pc(14) int local14 = -(arg6 & 0x3);
			for (@Pc(17) int local17 = -arg7; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					local28 = arg2[arg9++];
					if (local28 != 0 && arg4[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg2[arg9++];
					if (local28 != 0 && arg4[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg2[arg9++];
					if (local28 != 0 && arg4[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
					local28 = arg2[arg9++];
					if (local28 != 0 && arg4[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg2[arg9++];
					if (local28 != 0 && arg4[arg0] == 0) {
						arg3[arg0++] = local28;
					} else {
						arg0++;
					}
				}
				arg0 += arg5;
				arg9 += arg8;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("58200, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
