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

@OriginalClass("client!ib")
public final class Class1_Sub1_Sub2_Sub2 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt638;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt640;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "I")
	private int anInt639 = 43821;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	private int anInt641 = -906;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "[I")
	public int[] anIntArray208;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt642;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	private int anInt645;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt644;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray208 = new int[arg0 * arg1];
		this.anInt642 = this.anInt646 = arg0;
		this.anInt643 = this.anInt647 = arg1;
		this.anInt644 = this.anInt645 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt642 = local20.getWidth(arg1);
			this.anInt643 = local20.getHeight(arg1);
			this.anInt646 = this.anInt642;
			this.anInt647 = this.anInt643;
			this.anInt644 = 0;
			this.anInt645 = 0;
			this.anIntArray208 = new int[this.anInt642 * this.anInt643];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt642, this.anInt643, this.anIntArray208, 0, this.anInt642);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method666(arg1 + ".dat", null), aBoolean176);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method666("index.dat", null), aBoolean176);
		local43.anInt733 = local34.method482();
		this.anInt646 = local43.method482();
		this.anInt647 = local43.method482();
		@Pc(58) int local58 = local43.method480();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method484();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < arg2; local98++) {
			local43.anInt733 += 2;
			local34.anInt733 += local43.method482() * local43.method482();
			local43.anInt733++;
		}
		this.anInt644 = local43.method480();
		this.anInt645 = local43.method480();
		this.anInt642 = local43.method482();
		this.anInt643 = local43.method482();
		@Pc(145) int local145 = local43.method480();
		@Pc(151) int local151 = this.anInt642 * this.anInt643;
		this.anIntArray208 = new int[local151];
		@Pc(159) int local159;
		if (local145 == 0) {
			for (local159 = 0; local159 < local151; local159++) {
				this.anIntArray208[local159] = local61[local34.method480()];
			}
		} else if (local145 == 1) {
			for (local159 = 0; local159 < this.anInt642; local159++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt643; local183++) {
					this.anIntArray208[local159 + local183 * this.anInt642] = local61[local34.method480()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
	public void method386() {
		try {
			Class1_Sub1_Sub2.method434(this.anInt643, this.anInt642, this.anIntArray208, 97);
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("60741, " + false + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(BIII)V")
	public void method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(13) int local13 = 0; local13 < this.anIntArray208.length; local13++) {
				@Pc(20) int local20 = this.anIntArray208[local13];
				if (local20 != 0) {
					@Pc(28) int local28 = local20 >> 16 & 0xFF;
					local28 += arg2;
					if (local28 < 1) {
						local28 = 1;
					} else if (local28 > 255) {
						local28 = 255;
					}
					@Pc(50) int local50 = local20 >> 8 & 0xFF;
					local50 += arg1;
					if (local50 < 1) {
						local50 = 1;
					} else if (local50 > 255) {
						local50 = 255;
					}
					@Pc(70) int local70 = local20 & 0xFF;
					local70 += arg0;
					if (local70 < 1) {
						local70 = 1;
					} else if (local70 > 255) {
						local70 = 255;
					}
					this.anIntArray208[local13] = (local28 << 16) + (local50 << 8) + local70;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("62537, " + 3 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method388() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt646 * this.anInt647];
			for (@Pc(10) int local10 = 0; local10 < this.anInt643; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt642; local14++) {
					local8[(local10 + this.anInt645) * this.anInt646 + local14 + this.anInt644] = this.anIntArray208[local10 * this.anInt642 + local14];
				}
			}
			this.anIntArray208 = local8;
			this.anInt642 = this.anInt646;
			this.anInt643 = this.anInt647;
			this.anInt644 = 0;
			this.anInt645 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("42490, " + 0 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZII)V")
	public void method389(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg1 += this.anInt644;
			arg2 += this.anInt645;
			if (!arg0) {
				this.aBoolean177 = !this.aBoolean177;
			}
			@Pc(25) int local25 = arg1 + arg2 * Class1_Sub1_Sub2.anInt687;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt643;
			@Pc(33) int local33 = this.anInt642;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt687 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg2 < Class1_Sub1_Sub2.anInt689) {
				local46 = Class1_Sub1_Sub2.anInt689 - arg2;
				local30 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt689;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt687;
			}
			if (arg2 + local30 > Class1_Sub1_Sub2.anInt690) {
				local30 -= arg2 + local30 - Class1_Sub1_Sub2.anInt690;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt691) {
				local46 = Class1_Sub1_Sub2.anInt691 - arg1;
				local33 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt691;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class1_Sub1_Sub2.anInt692) {
				local46 = arg1 + local33 - Class1_Sub1_Sub2.anInt692;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method390(this.anIntArray208, local30, Class1_Sub1_Sub2.anIntArray213, local37, local39, local25, local33, local27);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("59549, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([II[IIIIIII)V")
	private void method390(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(16) int local16 = -(arg6 >> 2);
			@Pc(21) int local21 = -(arg6 & 0x3);
			for (@Pc(24) int local24 = -arg1; local24 < 0; local24++) {
				for (@Pc(28) int local28 = local16; local28 < 0; local28++) {
					arg2[arg5++] = arg0[arg7++];
					arg2[arg5++] = arg0[arg7++];
					arg2[arg5++] = arg0[arg7++];
					arg2[arg5++] = arg0[arg7++];
				}
				for (@Pc(67) int local67 = local21; local67 < 0; local67++) {
					arg2[arg5++] = arg0[arg7++];
				}
				arg5 += arg3;
				arg7 += arg4;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("41862, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -99 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)V")
	public void method391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt644;
			arg1 += this.anInt645;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt687;
			@Pc(17) int local17 = 0;
			@Pc(28) int local28 = this.anInt643;
			@Pc(31) int local31 = this.anInt642;
			@Pc(35) int local35 = Class1_Sub1_Sub2.anInt687 - local31;
			@Pc(37) int local37 = 0;
			@Pc(44) int local44;
			if (arg1 < Class1_Sub1_Sub2.anInt689) {
				local44 = Class1_Sub1_Sub2.anInt689 - arg1;
				local28 -= local44;
				arg1 = Class1_Sub1_Sub2.anInt689;
				local17 = local44 * local31 + 0;
				local15 += local44 * Class1_Sub1_Sub2.anInt687;
			}
			if (arg1 + local28 > Class1_Sub1_Sub2.anInt690) {
				local28 -= arg1 + local28 - Class1_Sub1_Sub2.anInt690;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt691) {
				local44 = Class1_Sub1_Sub2.anInt691 - arg0;
				local31 -= local44;
				arg0 = Class1_Sub1_Sub2.anInt691;
				local17 += local44;
				local15 += local44;
				local37 = local44 + 0;
				local35 += local44;
			}
			if (arg0 + local31 > Class1_Sub1_Sub2.anInt692) {
				local44 = arg0 + local31 - Class1_Sub1_Sub2.anInt692;
				local31 -= local44;
				local37 += local44;
				local35 += local44;
			}
			if (local31 > 0 && local28 > 0) {
				this.method392(Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local17, local15, local31, local28, local35, local37);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("5435, " + arg0 + ", " + arg1 + ", " + false + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII)V")
	public void method393(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg1 += this.anInt644;
			arg0 += this.anInt645;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt687;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt643;
			@Pc(23) int local23 = this.anInt642;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt687 - local23;
			@Pc(29) int local29 = 0;
			@Pc(47) int local47;
			if (arg0 < Class1_Sub1_Sub2.anInt689) {
				local47 = Class1_Sub1_Sub2.anInt689 - arg0;
				local20 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt689;
				local17 = local47 * local23 + 0;
				local15 += local47 * Class1_Sub1_Sub2.anInt687;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt690) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt690;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt691) {
				local47 = Class1_Sub1_Sub2.anInt691 - arg1;
				local23 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt691;
				local17 += local47;
				local15 += local47;
				local29 = local47 + 0;
				local27 += local47;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt692) {
				local47 = arg1 + local23 - Class1_Sub1_Sub2.anInt692;
				local23 -= local47;
				local29 += local47;
				local27 += local47;
			}
			if (local23 > 0 && local20 > 0) {
				this.method394(local29, local20, local15, local17, local27, 0, local23, this.anIntArray208, Class1_Sub1_Sub2.anIntArray213);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("58356, " + arg0 + ", " + 47048 + ", " + 128 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIII[I[IB)V")
	private void method394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8) {
		try {
			for (@Pc(12) int local12 = -arg1; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg6; local17 < 0; local17++) {
					@Pc(24) int local24 = arg7[arg3++];
					if (local24 == 0) {
						arg2++;
					} else {
						@Pc(30) int local30 = arg8[arg2];
						arg8[arg2++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg4;
				arg3 += arg0;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("52101, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 50 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[III[III)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg0 / 2;
				@Pc(14) int local14 = -arg3 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg2 >> 8;
				@Pc(44) int local44 = local32 * arg2 >> 8;
				@Pc(56) int local56 = (arg4 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg1 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg6 + arg7 * Class1_Sub1_Sub2.anInt687;
				for (@Pc(76) int local76 = 0; local76 < arg3; local76++) {
					@Pc(82) int local82 = arg8[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg5[local76]; local103 < 0; local103++) {
						Class1_Sub1_Sub2.anIntArray213[local86++] = this.anIntArray208[(local92 >> 16) + (local98 >> 16) * this.anInt642];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub1_Sub2.anInt687;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("8494, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 606 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIDIII)V")
	public void method396(@OriginalArg(5) double arg0, @OriginalArg(6) int arg1, @OriginalArg(7) int arg2) {
		try {
			try {
				@Pc(22) int local22 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(28) int local28 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(34) int local34 = local22 * 256 >> 8;
				@Pc(40) int local40 = local28 * 256 >> 8;
				@Pc(52) int local52 = local34 * -10 + local40 * -10 + 983040;
				@Pc(64) int local64 = local40 * -10 + 983040 - local34 * -10;
				@Pc(70) int local70 = arg1 + arg2 * Class1_Sub1_Sub2.anInt687;
				for (@Pc(72) int local72 = 0; local72 < 20; local72++) {
					@Pc(76) int local76 = local70;
					@Pc(78) int local78 = local52;
					@Pc(80) int local80 = local64;
					for (@Pc(83) int local83 = -20; local83 < 0; local83++) {
						@Pc(99) int local99 = this.anIntArray208[(local78 >> 16) + (local80 >> 16) * this.anInt642];
						if (local99 == 0) {
							local76++;
						} else {
							Class1_Sub1_Sub2.anIntArray213[local76++] = local99;
						}
						local78 += local40;
						local80 -= local34;
					}
					local52 += local34;
					local64 += local40;
					local70 += Class1_Sub1_Sub2.anInt687;
				}
			} catch (@Pc(138) Exception local138) {
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("22043, " + 15 + ", " + -869 + ", " + 15 + ", " + 20 + ", " + 256 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIBLclient!jb;)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt644;
			arg1 += this.anInt645;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt687;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt643;
			@Pc(23) int local23 = this.anInt642;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt687 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt689) {
				local36 = Class1_Sub1_Sub2.anInt689 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt689;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt687;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt690) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt690;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt691) {
				local36 = Class1_Sub1_Sub2.anInt691 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt691;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt692) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt692;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method398(this.anInt640, local20, arg2.aByteArray7, local17, local23, local15, Class1_Sub1_Sub2.anIntArray213, this.anIntArray208, local29, local27, 0);
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("8016, " + arg0 + ", " + arg1 + ", " + 53 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[BIII[I[IIII)V")
	private void method398(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg7[arg3++];
					if (local25 != 0 && arg2[arg5] == 0) {
						arg6[arg5++] = local25;
					} else {
						arg5++;
					}
					local25 = arg7[arg3++];
					if (local25 != 0 && arg2[arg5] == 0) {
						arg6[arg5++] = local25;
					} else {
						arg5++;
					}
					local25 = arg7[arg3++];
					if (local25 != 0 && arg2[arg5] == 0) {
						arg6[arg5++] = local25;
					} else {
						arg5++;
					}
					local25 = arg7[arg3++];
					if (local25 != 0 && arg2[arg5] == 0) {
						arg6[arg5++] = local25;
					} else {
						arg5++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg7[arg3++];
					if (local25 != 0 && arg2[arg5] == 0) {
						arg6[arg5++] = local25;
					} else {
						arg5++;
					}
				}
				arg5 += arg9;
				arg3 += arg8;
			}
			if (arg0 == 0) {
				;
			}
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("76081, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}
}
