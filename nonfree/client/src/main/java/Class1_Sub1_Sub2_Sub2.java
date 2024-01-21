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

	@OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
	private int anInt644 = 499;

	@OriginalMember(owner = "client!ib", name = "x", descriptor = "Z")
	private boolean aBoolean171 = true;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "B")
	private byte aByte18 = -95;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt645 = 5;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	public int anInt650;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	public int anInt646;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	public int anInt651;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "I")
	public int anInt647;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	private int anInt649;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	private int anInt648;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray205 = new int[arg0 * arg1];
		this.anInt646 = this.anInt650 = arg0;
		this.anInt647 = this.anInt651 = arg1;
		this.anInt648 = this.anInt649 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt646 = local23.getWidth(arg1);
			this.anInt647 = local23.getHeight(arg1);
			this.anInt650 = this.anInt646;
			this.anInt651 = this.anInt647;
			this.anInt648 = 0;
			this.anInt649 = 0;
			this.anIntArray205 = new int[this.anInt646 * this.anInt647];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt646, this.anInt647, this.anIntArray205, 0, this.anInt646);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3(arg0.method660(arg1 + ".dat", null), 185);
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3(arg0.method660("index.dat", null), 185);
		local46.anInt738 = local37.method476();
		this.anInt650 = local46.method476();
		this.anInt651 = local46.method476();
		@Pc(61) int local61 = local46.method474();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method478();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt738 += 2;
			local37.anInt738 += local46.method476() * local46.method476();
			local46.anInt738++;
		}
		this.anInt648 = local46.method474();
		this.anInt649 = local46.method474();
		this.anInt646 = local46.method476();
		this.anInt647 = local46.method476();
		@Pc(148) int local148 = local46.method474();
		@Pc(154) int local154 = this.anInt646 * this.anInt647;
		this.anIntArray205 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray205[local162] = local64[local37.method474()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt646; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt647; local186++) {
					this.anIntArray205[local162 + local186 * this.anInt646] = local64[local37.method474()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
	public void method383() {
		try {
			Class1_Sub1_Sub2.method431(this.anInt646, this.anInt647, this.anIntArray205);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("19441, " + 979 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZI)V")
	public void method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray205.length; local3++) {
				@Pc(10) int local10 = this.anIntArray205[local3];
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
					this.anIntArray205[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("7385, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(Z)V")
	public void method385() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt650 * this.anInt651];
			for (@Pc(10) int local10 = 0; local10 < this.anInt647; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt646; local14++) {
					local8[(local10 + this.anInt649) * this.anInt650 + local14 + this.anInt648] = this.anIntArray205[local10 * this.anInt646 + local14];
				}
			}
			this.anIntArray205 = local8;
			this.anInt646 = this.anInt650;
			this.anInt647 = this.anInt651;
			this.anInt648 = 0;
			this.anInt649 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("77679, " + false + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method386(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt648;
			arg0 += this.anInt649;
			@Pc(19) int local19 = arg1 + arg0 * Class1_Sub1_Sub2.anInt691;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt647;
			@Pc(27) int local27 = this.anInt646;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt691 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub2.anInt693) {
				local40 = Class1_Sub1_Sub2.anInt693 - arg0;
				local24 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt693;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class1_Sub1_Sub2.anInt691;
			}
			if (arg0 + local24 > Class1_Sub1_Sub2.anInt694) {
				local24 -= arg0 + local24 - Class1_Sub1_Sub2.anInt694;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt695) {
				local40 = Class1_Sub1_Sub2.anInt695 - arg1;
				local27 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt695;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class1_Sub1_Sub2.anInt696) {
				local40 = arg1 + local27 - Class1_Sub1_Sub2.anInt696;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method387(local27, local21, Class1_Sub1_Sub2.anIntArray210, this.anIntArray205, local19, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("62643, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[I[IIIIIB)V")
	private void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg2[arg4++] = arg3[arg1++];
					arg2[arg4++] = arg3[arg1++];
					arg2[arg4++] = arg3[arg1++];
					arg2[arg4++] = arg3[arg1++];
				}
				for (@Pc(61) int local61 = local11; local61 < 0; local61++) {
					arg2[arg4++] = arg3[arg1++];
				}
				arg4 += arg6;
				arg1 += arg7;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("49285, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + -25 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBI)V")
	public void method388(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			arg0 += this.anInt648;
			arg2 += this.anInt649;
			@Pc(15) int local15 = arg0 + arg2 * Class1_Sub1_Sub2.anInt691;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt647;
			@Pc(23) int local23 = this.anInt646;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt691 - local23;
			@Pc(29) int local29 = 0;
			@Pc(34) boolean local34 = false;
			@Pc(51) int local51;
			if (arg2 < Class1_Sub1_Sub2.anInt693) {
				local51 = Class1_Sub1_Sub2.anInt693 - arg2;
				local20 -= local51;
				arg2 = Class1_Sub1_Sub2.anInt693;
				local17 = local51 * local23 + 0;
				local15 += local51 * Class1_Sub1_Sub2.anInt691;
			}
			if (arg2 + local20 > Class1_Sub1_Sub2.anInt694) {
				local20 -= arg2 + local20 - Class1_Sub1_Sub2.anInt694;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt695) {
				local51 = Class1_Sub1_Sub2.anInt695 - arg0;
				local23 -= local51;
				arg0 = Class1_Sub1_Sub2.anInt695;
				local17 += local51;
				local15 += local51;
				local29 = local51 + 0;
				local27 += local51;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt696) {
				local51 = arg0 + local23 - Class1_Sub1_Sub2.anInt696;
				local23 -= local51;
				local29 += local51;
				local27 += local51;
			}
			if (local23 > 0 && local20 > 0) {
				this.method389(Class1_Sub1_Sub2.anIntArray210, this.anIntArray205, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("58077, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method389(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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
	public void method390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt648;
			arg1 += this.anInt649;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt691;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt647;
			@Pc(23) int local23 = this.anInt646;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt691 - local23;
			@Pc(29) int local29 = 0;
			@Pc(47) int local47;
			if (arg1 < Class1_Sub1_Sub2.anInt693) {
				local47 = Class1_Sub1_Sub2.anInt693 - arg1;
				local20 -= local47;
				arg1 = Class1_Sub1_Sub2.anInt693;
				local17 = local47 * local23 + 0;
				local15 += local47 * Class1_Sub1_Sub2.anInt691;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt694) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt694;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt695) {
				local47 = Class1_Sub1_Sub2.anInt695 - arg0;
				local23 -= local47;
				arg0 = Class1_Sub1_Sub2.anInt695;
				local17 += local47;
				local15 += local47;
				local29 = local47 + 0;
				local27 += local47;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt696) {
				local47 = arg0 + local23 - Class1_Sub1_Sub2.anInt696;
				local23 -= local47;
				local29 += local47;
				local27 += local47;
			}
			if (local23 > 0 && local20 > 0) {
				this.method391(local15, local23, 0, local20, local29, local17, local27, Class1_Sub1_Sub2.anIntArray210, this.anIntArray205);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("8396, " + 128 + ", " + arg0 + ", " + arg1 + ", " + -6626 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIIIII[I[I)V")
	private void method391(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int[] arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(19) int local19 = -arg3; local19 < 0; local19++) {
				for (@Pc(24) int local24 = -arg1; local24 < 0; local24++) {
					@Pc(31) int local31 = arg8[arg5++];
					if (local31 == 0) {
						arg0++;
					} else {
						@Pc(37) int local37 = arg7[arg0];
						arg7[arg0++] = ((local31 & 0xFF00FF) * 128 + (local37 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local31 & 0xFF00) * 128 + (local37 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg0 += arg6;
				arg5 += arg4;
			}
		} catch (@Pc(89) RuntimeException local89) {
			signlink.reporterror("170, " + 128 + ", " + 15681 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local89.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III[II[IIIIII)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(16) int local16 = -arg0 / 2;
				@Pc(21) int local21 = -arg6 / 2;
				@Pc(30) int local30 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(45) int local45 = local30 * arg7 >> 8;
				@Pc(51) int local51 = local39 * arg7 >> 8;
				@Pc(63) int local63 = (arg1 << 16) + local21 * local45 + local16 * local51;
				@Pc(75) int local75 = (arg3 << 16) + (local21 * local51 - local16 * local45);
				@Pc(81) int local81 = arg8 + arg5 * Class1_Sub1_Sub2.anInt691;
				for (@Pc(83) int local83 = 0; local83 < arg6; local83++) {
					@Pc(89) int local89 = arg4[local83];
					@Pc(93) int local93 = local81 + local89;
					@Pc(99) int local99 = local63 + local51 * local89;
					@Pc(105) int local105 = local75 - local45 * local89;
					for (@Pc(110) int local110 = -arg2[local83]; local110 < 0; local110++) {
						Class1_Sub1_Sub2.anIntArray210[local93++] = this.anIntArray205[(local99 >> 16) + (local105 >> 16) * this.anInt646];
						local99 += local51;
						local105 -= local45;
					}
					local63 += local45;
					local75 += local51;
					local81 += Class1_Sub1_Sub2.anInt691;
				}
			} catch (@Pc(158) Exception local158) {
			}
		} catch (@Pc(160) RuntimeException local160) {
			signlink.reporterror("34224, " + arg0 + ", " + -522 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local160.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IDIIIIIII)V")
	public void method393(@OriginalArg(1) double arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2) {
		try {
			try {
				@Pc(26) int local26 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(38) int local38 = local26 * 256 >> 8;
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(56) int local56 = local38 * -10 + local44 * -10 + 983040;
				@Pc(68) int local68 = local44 * -10 + 983040 - local38 * -10;
				@Pc(74) int local74 = arg1 + arg2 * Class1_Sub1_Sub2.anInt691;
				for (@Pc(76) int local76 = 0; local76 < 20; local76++) {
					@Pc(80) int local80 = local74;
					@Pc(82) int local82 = local56;
					@Pc(84) int local84 = local68;
					for (@Pc(87) int local87 = -20; local87 < 0; local87++) {
						@Pc(103) int local103 = this.anIntArray205[(local82 >> 16) + (local84 >> 16) * this.anInt646];
						if (local103 == 0) {
							local80++;
						} else {
							Class1_Sub1_Sub2.anIntArray210[local80++] = local103;
						}
						local82 += local44;
						local84 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub1_Sub2.anInt691;
				}
			} catch (@Pc(142) Exception local142) {
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("1311, " + 20 + ", " + arg0 + ", " + arg1 + ", " + 15 + ", " + 15 + ", " + arg2 + ", " + 0 + ", " + 20 + ", " + 256 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IBILclient!jb;)V")
	public void method394(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg0 += this.anInt648;
			arg1 += this.anInt649;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub1_Sub2.anInt691;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt647;
			@Pc(26) int local26 = this.anInt646;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt691 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt693) {
				local39 = Class1_Sub1_Sub2.anInt693 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt693;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt691;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt694) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt694;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt695) {
				local39 = Class1_Sub1_Sub2.anInt695 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt695;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt696) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt696;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method395(this.anIntArray205, arg2.aByteArray7, local26, local18, local23, 0, local20, Class1_Sub1_Sub2.anIntArray210, local32, local30);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("77683, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([II[BIIIII[III)V")
	private void method395(@OriginalArg(0) int[] arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(11) int local11 = -(arg2 >> 2);
			@Pc(16) int local16 = -(arg2 & 0x3);
			for (@Pc(19) int local19 = -arg4; local19 < 0; local19++) {
				@Pc(30) int local30;
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					local30 = arg0[arg6++];
					if (local30 != 0 && arg1[arg3] == 0) {
						arg7[arg3++] = local30;
					} else {
						arg3++;
					}
					local30 = arg0[arg6++];
					if (local30 != 0 && arg1[arg3] == 0) {
						arg7[arg3++] = local30;
					} else {
						arg3++;
					}
					local30 = arg0[arg6++];
					if (local30 != 0 && arg1[arg3] == 0) {
						arg7[arg3++] = local30;
					} else {
						arg3++;
					}
					local30 = arg0[arg6++];
					if (local30 != 0 && arg1[arg3] == 0) {
						arg7[arg3++] = local30;
					} else {
						arg3++;
					}
				}
				for (@Pc(106) int local106 = local16; local106 < 0; local106++) {
					local30 = arg0[arg6++];
					if (local30 != 0 && arg1[arg3] == 0) {
						arg7[arg3++] = local30;
					} else {
						arg3++;
					}
				}
				arg3 += arg9;
				arg6 += arg8;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("3343, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
