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

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "I")
	private int anInt622 = -328;

	@OriginalMember(owner = "client!ib", name = "A", descriptor = "I")
	private int anInt623 = 7;

	@OriginalMember(owner = "client!ib", name = "B", descriptor = "Z")
	private boolean aBoolean180 = false;

	@OriginalMember(owner = "client!ib", name = "C", descriptor = "B")
	private byte aByte25 = -52;

	@OriginalMember(owner = "client!ib", name = "D", descriptor = "I")
	private int anInt624 = 539;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "[I")
	public int[] anIntArray205;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
	public int anInt630;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
	private int anInt628;

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt627;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray205 = new int[arg0 * arg1];
		this.anInt625 = this.anInt629 = arg0;
		this.anInt626 = this.anInt630 = arg1;
		this.anInt627 = this.anInt628 = 0;
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt625 = local23.getWidth(arg1);
			this.anInt626 = local23.getHeight(arg1);
			this.anInt629 = this.anInt625;
			this.anInt630 = this.anInt626;
			this.anInt627 = 0;
			this.anInt628 = 0;
			this.anIntArray205 = new int[this.anInt625 * this.anInt626];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt625, this.anInt626, this.anIntArray205, 0, this.anInt625);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lclient!xb;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub2(@OriginalArg(0) Class47 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub3 local37 = new Class1_Sub1_Sub3((byte) 3, arg0.method658(arg1 + ".dat", null));
		@Pc(46) Class1_Sub1_Sub3 local46 = new Class1_Sub1_Sub3((byte) 3, arg0.method658("index.dat", null));
		local46.anInt715 = local37.method474();
		this.anInt629 = local46.method474();
		this.anInt630 = local46.method474();
		@Pc(61) int local61 = local46.method472();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method476();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt715 += 2;
			local37.anInt715 += local46.method474() * local46.method474();
			local46.anInt715++;
		}
		this.anInt627 = local46.method472();
		this.anInt628 = local46.method472();
		this.anInt625 = local46.method474();
		this.anInt626 = local46.method474();
		@Pc(148) int local148 = local46.method472();
		@Pc(154) int local154 = this.anInt625 * this.anInt626;
		this.anIntArray205 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray205[local162] = local64[local37.method472()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt625; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt626; local186++) {
					this.anIntArray205[local162 + local186 * this.anInt625] = local64[local37.method472()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
	public void method382() {
		try {
			Class1_Sub1_Sub2.method430(this.anIntArray205, this.anInt626, this.anInt625);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("18260, " + -328 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZI)V")
	public void method383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray205.length; local3++) {
				@Pc(10) int local10 = this.anIntArray205[local3];
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
					this.anIntArray205[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("38134, " + arg0 + ", " + arg1 + ", " + true + ", " + arg2 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
	public void method384() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt629 * this.anInt630];
			for (@Pc(10) int local10 = 0; local10 < this.anInt626; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt625; local14++) {
					local8[(local10 + this.anInt628) * this.anInt629 + local14 + this.anInt627] = this.anIntArray205[local10 * this.anInt625 + local14];
				}
			}
			this.anIntArray205 = local8;
			this.anInt625 = this.anInt629;
			this.anInt626 = this.anInt630;
			this.anInt627 = 0;
			this.anInt628 = 0;
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("71862, " + 2 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V")
	public void method385(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt627;
			arg0 += this.anInt628;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt670;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt626;
			@Pc(27) int local27 = this.anInt625;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt670 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg0 < Class1_Sub1_Sub2.anInt672) {
				local40 = Class1_Sub1_Sub2.anInt672 - arg0;
				local24 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt672;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class1_Sub1_Sub2.anInt670;
			}
			if (arg0 + local24 > Class1_Sub1_Sub2.anInt673) {
				local24 -= arg0 + local24 - Class1_Sub1_Sub2.anInt673;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt674) {
				local40 = Class1_Sub1_Sub2.anInt674 - arg1;
				local27 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt674;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg1 + local27 > Class1_Sub1_Sub2.anInt675) {
				local40 = arg1 + local27 - Class1_Sub1_Sub2.anInt675;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method386(local17, Class1_Sub1_Sub2.anIntArray210, this.anIntArray205, local15, local33, local31, local27, local24);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("36905, " + -47173 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[I[IIIIIII)V")
	private void method386(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(14) int local14 = -arg7; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg1[arg3++] = arg2[arg0++];
					arg1[arg3++] = arg2[arg0++];
					arg1[arg3++] = arg2[arg0++];
					arg1[arg3++] = arg2[arg0++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg1[arg3++] = arg2[arg0++];
				}
				arg3 += arg5;
				arg0 += arg4;
			}
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("58669, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + -39661 + ", " + arg6 + ", " + arg7 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)V")
	public void method387(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt627;
			arg0 += this.anInt628;
			@Pc(18) int local18 = arg1 + arg0 * Class1_Sub1_Sub2.anInt670;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt626;
			@Pc(26) int local26 = this.anInt625;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt670 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub2.anInt672) {
				local39 = Class1_Sub1_Sub2.anInt672 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt672;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt670;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt673) {
				local23 -= arg0 + local23 - Class1_Sub1_Sub2.anInt673;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt674) {
				local39 = Class1_Sub1_Sub2.anInt674 - arg1;
				local26 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt674;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class1_Sub1_Sub2.anInt675) {
				local39 = arg1 + local26 - Class1_Sub1_Sub2.anInt675;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method388(Class1_Sub1_Sub2.anIntArray210, this.anIntArray205, local20, local18, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("23995, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method388(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIB)V")
	public void method389(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt627;
			arg1 += this.anInt628;
			@Pc(25) int local25 = arg0 + arg1 * Class1_Sub1_Sub2.anInt670;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt626;
			@Pc(33) int local33 = this.anInt625;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt670 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt672) {
				local46 = Class1_Sub1_Sub2.anInt672 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt672;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt670;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt673) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt673;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt674) {
				local46 = Class1_Sub1_Sub2.anInt674 - arg0;
				local33 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt674;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg0 + local33 > Class1_Sub1_Sub2.anInt675) {
				local46 = arg0 + local33 - Class1_Sub1_Sub2.anInt675;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method390(0, local37, this.anInt623, local27, this.anIntArray205, Class1_Sub1_Sub2.anIntArray210, local30, local33, local39, local25);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("59167, " + arg0 + ", " + 128 + ", " + arg1 + ", " + -113 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIII[I[IIIII)V")
	private void method390(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			for (@Pc(8) int local8 = -arg6; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg7; local13 < 0; local13++) {
					@Pc(20) int local20 = arg4[arg3++];
					if (local20 == 0) {
						arg9++;
					} else {
						@Pc(26) int local26 = arg5[arg9];
						arg5[arg9++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg9 += arg1;
				arg3 += arg8;
			}
			if (arg2 != 7) {
				this.anInt622 = -435;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("37897, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 128 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIII[IIIIII[I)V")
	public void method391(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			try {
				@Pc(12) int local12 = -arg7 / 2;
				@Pc(17) int local17 = -arg1 / 2;
				@Pc(26) int local26 = (int) (Math.sin((double) arg6 / 326.11D) * 65536.0D);
				@Pc(35) int local35 = (int) (Math.cos((double) arg6 / 326.11D) * 65536.0D);
				@Pc(41) int local41 = local26 * arg4 >> 8;
				@Pc(47) int local47 = local35 * arg4 >> 8;
				@Pc(59) int local59 = (arg0 << 16) + local17 * local41 + local12 * local47;
				@Pc(71) int local71 = (arg8 << 16) + (local17 * local47 - local12 * local41);
				@Pc(77) int local77 = arg5 + arg2 * Class1_Sub1_Sub2.anInt670;
				for (@Pc(79) int local79 = 0; local79 < arg1; local79++) {
					@Pc(85) int local85 = arg9[local79];
					@Pc(89) int local89 = local77 + local85;
					@Pc(95) int local95 = local59 + local47 * local85;
					@Pc(101) int local101 = local71 - local41 * local85;
					for (@Pc(106) int local106 = -arg3[local79]; local106 < 0; local106++) {
						Class1_Sub1_Sub2.anIntArray210[local89++] = this.anIntArray205[(local95 >> 16) + (local101 >> 16) * this.anInt625];
						local95 += local47;
						local101 -= local41;
					}
					local59 += local41;
					local71 += local47;
					local77 += Class1_Sub1_Sub2.anInt670;
				}
			} catch (@Pc(154) Exception local154) {
			}
		} catch (@Pc(156) RuntimeException local156) {
			signlink.reporterror("58230, " + -11653 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local156.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIBIIIID)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(8) double arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg0 + arg1 * Class1_Sub1_Sub2.anInt670;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray205[(local77 >> 16) + (local79 >> 16) * this.anInt625];
						if (local98 == 0) {
							local75++;
						} else {
							Class1_Sub1_Sub2.anIntArray210[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class1_Sub1_Sub2.anInt670;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("51534, " + arg0 + ", " + arg1 + ", " + 15 + ", " + 61 + ", " + 20 + ", " + 256 + ", " + 15 + ", " + 20 + ", " + arg2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!jb;)V")
	public void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub3 arg2) {
		try {
			arg1 += this.anInt627;
			arg0 += this.anInt628;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt670;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt626;
			@Pc(23) int local23 = this.anInt625;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt670 - local23;
			@Pc(29) int local29 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub1_Sub2.anInt672) {
				local39 = Class1_Sub1_Sub2.anInt672 - arg0;
				local20 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt672;
				local17 = local39 * local23 + 0;
				local15 += local39 * Class1_Sub1_Sub2.anInt670;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt673) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt673;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt674) {
				local39 = Class1_Sub1_Sub2.anInt674 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt674;
				local17 += local39;
				local15 += local39;
				local29 = local39 + 0;
				local27 += local39;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt675) {
				local39 = arg1 + local23 - Class1_Sub1_Sub2.anInt675;
				local23 -= local39;
				local29 += local39;
				local27 += local39;
			}
			if (local23 > 0 && local20 > 0) {
				this.method394(0, this.anIntArray205, local23, local20, local29, arg2.aByteArray7, Class1_Sub1_Sub2.anIntArray210, local27, local15, local17);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("24148, " + arg0 + ", " + arg1 + ", " + 686 + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[IIIII[B[IIII)V")
	private void method394(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg2 >> 2);
			@Pc(11) int local11 = -(arg2 & 0x3);
			for (@Pc(19) int local19 = -arg3; local19 < 0; local19++) {
				@Pc(30) int local30;
				for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
					local30 = arg1[arg9++];
					if (local30 != 0 && arg5[arg8] == 0) {
						arg6[arg8++] = local30;
					} else {
						arg8++;
					}
					local30 = arg1[arg9++];
					if (local30 != 0 && arg5[arg8] == 0) {
						arg6[arg8++] = local30;
					} else {
						arg8++;
					}
					local30 = arg1[arg9++];
					if (local30 != 0 && arg5[arg8] == 0) {
						arg6[arg8++] = local30;
					} else {
						arg8++;
					}
					local30 = arg1[arg9++];
					if (local30 != 0 && arg5[arg8] == 0) {
						arg6[arg8++] = local30;
					} else {
						arg8++;
					}
				}
				for (@Pc(106) int local106 = local11; local106 < 0; local106++) {
					local30 = arg1[arg9++];
					if (local30 != 0 && arg5[arg8] == 0) {
						arg6[arg8++] = local30;
					} else {
						arg8++;
					}
				}
				arg8 += arg7;
				arg9 += arg4;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("21413, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -968 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
