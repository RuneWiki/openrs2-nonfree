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

@OriginalClass("client!TTFRDWZK")
public final class Class5_Sub1_Sub1_Sub3 extends Class5_Sub1_Sub1 {

	@OriginalMember(owner = "client!TTFRDWZK", name = "z", descriptor = "I")
	private int anInt665;

	@OriginalMember(owner = "client!TTFRDWZK", name = "x", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!TTFRDWZK", name = "y", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!TTFRDWZK", name = "A", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!TTFRDWZK", name = "B", descriptor = "I")
	private int anInt666 = -71;

	@OriginalMember(owner = "client!TTFRDWZK", name = "C", descriptor = "B")
	private byte aByte16 = 7;

	@OriginalMember(owner = "client!TTFRDWZK", name = "D", descriptor = "I")
	private int anInt667 = -180;

	@OriginalMember(owner = "client!TTFRDWZK", name = "E", descriptor = "I")
	private int anInt668 = -16153;

	@OriginalMember(owner = "client!TTFRDWZK", name = "F", descriptor = "[I")
	public int[] anIntArray173;

	@OriginalMember(owner = "client!TTFRDWZK", name = "K", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!TTFRDWZK", name = "G", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!TTFRDWZK", name = "L", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!TTFRDWZK", name = "H", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!TTFRDWZK", name = "J", descriptor = "I")
	private int anInt672;

	@OriginalMember(owner = "client!TTFRDWZK", name = "I", descriptor = "I")
	private int anInt671;

	@OriginalMember(owner = "client!TTFRDWZK", name = "<init>", descriptor = "(II)V")
	public Class5_Sub1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray173 = new int[arg0 * arg1];
		this.anInt669 = this.anInt673 = arg0;
		this.anInt670 = this.anInt674 = arg1;
		this.anInt671 = this.anInt672 = 0;
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class5_Sub1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt669 = local26.getWidth(arg1);
			this.anInt670 = local26.getHeight(arg1);
			this.anInt673 = this.anInt669;
			this.anInt674 = this.anInt670;
			this.anInt671 = 0;
			this.anInt672 = 0;
			this.anIntArray173 = new int[this.anInt669 * this.anInt670];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt669, this.anInt670, this.anIntArray173, 0, this.anInt669);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "<init>", descriptor = "(Lclient!TXPLZUUI;Ljava/lang/String;I)V")
	public Class5_Sub1_Sub1_Sub3(@OriginalArg(0) Class40 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class5_Sub1_Sub4 local40 = new Class5_Sub1_Sub4(arg0.method464(arg1 + ".dat", null), 0);
		@Pc(49) Class5_Sub1_Sub4 local49 = new Class5_Sub1_Sub4(arg0.method464("index.dat", null), 0);
		local49.anInt429 = local40.method242();
		this.anInt673 = local49.method242();
		this.anInt674 = local49.method242();
		@Pc(64) int local64 = local49.method240();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method244();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < arg2; local98++) {
			local49.anInt429 += 2;
			local40.anInt429 += local49.method242() * local49.method242();
			local49.anInt429++;
		}
		this.anInt671 = local49.method240();
		this.anInt672 = local49.method240();
		this.anInt669 = local49.method242();
		this.anInt670 = local49.method242();
		@Pc(145) int local145 = local49.method240();
		@Pc(151) int local151 = this.anInt669 * this.anInt670;
		this.anIntArray173 = new int[local151];
		@Pc(159) int local159;
		if (local145 == 0) {
			for (local159 = 0; local159 < local151; local159++) {
				this.anIntArray173[local159] = local67[local40.method240()];
			}
		} else if (local145 == 1) {
			for (local159 = 0; local159 < this.anInt669; local159++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt670; local183++) {
					this.anIntArray173[local159 + local183 * this.anInt669] = local67[local40.method240()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "c", descriptor = "(I)V")
	public void method450() {
		try {
			Class5_Sub1_Sub1.method544(this.anInt670, this.anInt669, this.anIntArray173);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("45039, " + -214 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(ZIII)V")
	public void method451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray173.length; local3++) {
				@Pc(10) int local10 = this.anIntArray173[local3];
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
					this.anIntArray173[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(107) RuntimeException local107) {
			signlink.reporterror("37280, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local107.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "d", descriptor = "(I)V")
	public void method452() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt673 * this.anInt674];
			for (@Pc(10) int local10 = 0; local10 < this.anInt670; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt669; local14++) {
					local8[(local10 + this.anInt672) * this.anInt673 + local14 + this.anInt671] = this.anIntArray173[local10 * this.anInt669 + local14];
				}
			}
			this.anIntArray173 = local8;
			this.anInt669 = this.anInt673;
			this.anInt670 = this.anInt674;
			this.anInt671 = 0;
			this.anInt672 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("14032, " + 0 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(III)V")
	public void method453(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt671;
			arg0 += this.anInt672;
			@Pc(15) int local15 = arg1 + arg0 * Class5_Sub1_Sub1.anInt773;
			@Pc(17) int local17 = 0;
			@Pc(25) int local25 = this.anInt670;
			@Pc(28) int local28 = this.anInt669;
			@Pc(32) int local32 = Class5_Sub1_Sub1.anInt773 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg0 < Class5_Sub1_Sub1.anInt775) {
				local41 = Class5_Sub1_Sub1.anInt775 - arg0;
				local25 -= local41;
				arg0 = Class5_Sub1_Sub1.anInt775;
				local17 = local41 * local28 + 0;
				local15 += local41 * Class5_Sub1_Sub1.anInt773;
			}
			if (arg0 + local25 > Class5_Sub1_Sub1.anInt776) {
				local25 -= arg0 + local25 - Class5_Sub1_Sub1.anInt776;
			}
			if (arg1 < Class5_Sub1_Sub1.anInt777) {
				local41 = Class5_Sub1_Sub1.anInt777 - arg1;
				local28 -= local41;
				arg1 = Class5_Sub1_Sub1.anInt777;
				local17 += local41;
				local15 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg1 + local28 > Class5_Sub1_Sub1.anInt778) {
				local41 = arg1 + local28 - Class5_Sub1_Sub1.anInt778;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method454(local32, local15, local17, Class5_Sub1_Sub1.anIntArray201, local28, local34, local25, this.anIntArray173);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("72532, " + arg0 + ", " + -640 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(III[IIIII[I)V")
	private void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg3[arg1++] = arg7[arg2++];
					arg3[arg1++] = arg7[arg2++];
					arg3[arg1++] = arg7[arg2++];
					arg3[arg1++] = arg7[arg2++];
				}
				for (@Pc(61) int local61 = local11; local61 < 0; local61++) {
					arg3[arg1++] = arg7[arg2++];
				}
				arg1 += arg0;
				arg2 += arg5;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("31776, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 9 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "b", descriptor = "(III)V")
	public void method455(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt671;
			arg1 += this.anInt672;
			@Pc(19) int local19 = arg0 + arg1 * Class5_Sub1_Sub1.anInt773;
			@Pc(21) int local21 = 0;
			@Pc(24) int local24 = this.anInt670;
			@Pc(27) int local27 = this.anInt669;
			@Pc(31) int local31 = Class5_Sub1_Sub1.anInt773 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class5_Sub1_Sub1.anInt775) {
				local40 = Class5_Sub1_Sub1.anInt775 - arg1;
				local24 -= local40;
				arg1 = Class5_Sub1_Sub1.anInt775;
				local21 = local40 * local27 + 0;
				local19 += local40 * Class5_Sub1_Sub1.anInt773;
			}
			if (arg1 + local24 > Class5_Sub1_Sub1.anInt776) {
				local24 -= arg1 + local24 - Class5_Sub1_Sub1.anInt776;
			}
			if (arg0 < Class5_Sub1_Sub1.anInt777) {
				local40 = Class5_Sub1_Sub1.anInt777 - arg0;
				local27 -= local40;
				arg0 = Class5_Sub1_Sub1.anInt777;
				local21 += local40;
				local19 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class5_Sub1_Sub1.anInt778) {
				local40 = arg0 + local27 - Class5_Sub1_Sub1.anInt778;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method456(Class5_Sub1_Sub1.anIntArray201, this.anIntArray173, local21, local19, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("46826, " + arg0 + ", " + arg1 + ", " + 30573 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method456(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(IIII)V")
	public void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt671;
			arg1 += this.anInt672;
			@Pc(22) int local22 = arg0 + arg1 * Class5_Sub1_Sub1.anInt773;
			@Pc(24) int local24 = 0;
			@Pc(27) int local27 = this.anInt670;
			@Pc(30) int local30 = this.anInt669;
			@Pc(34) int local34 = Class5_Sub1_Sub1.anInt773 - local30;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43;
			if (arg1 < Class5_Sub1_Sub1.anInt775) {
				local43 = Class5_Sub1_Sub1.anInt775 - arg1;
				local27 -= local43;
				arg1 = Class5_Sub1_Sub1.anInt775;
				local24 = local43 * local30 + 0;
				local22 += local43 * Class5_Sub1_Sub1.anInt773;
			}
			if (arg1 + local27 > Class5_Sub1_Sub1.anInt776) {
				local27 -= arg1 + local27 - Class5_Sub1_Sub1.anInt776;
			}
			if (arg0 < Class5_Sub1_Sub1.anInt777) {
				local43 = Class5_Sub1_Sub1.anInt777 - arg0;
				local30 -= local43;
				arg0 = Class5_Sub1_Sub1.anInt777;
				local24 += local43;
				local22 += local43;
				local36 = local43 + 0;
				local34 += local43;
			}
			if (arg0 + local30 > Class5_Sub1_Sub1.anInt778) {
				local43 = arg0 + local30 - Class5_Sub1_Sub1.anInt778;
				local30 -= local43;
				local36 += local43;
				local34 += local43;
			}
			if (local30 > 0 && local27 > 0) {
				this.method458(local34, local27, 0, local22, local36, this.anIntArray173, local30, local24, Class5_Sub1_Sub1.anIntArray201);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("69849, " + arg0 + ", " + arg1 + ", " + -71 + ", " + 128 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(IIIIII[IIII[I)V")
	private void method458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(14) int local14 = -arg1; local14 < 0; local14++) {
				for (@Pc(19) int local19 = -arg6; local19 < 0; local19++) {
					@Pc(26) int local26 = arg5[arg7++];
					if (local26 == 0) {
						arg3++;
					} else {
						@Pc(32) int local32 = arg8[arg3];
						arg8[arg3++] = ((local26 & 0xFF00FF) * 128 + (local32 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local26 & 0xFF00) * 128 + (local32 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg3 += arg0;
				arg7 += arg4;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("54410, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + -39397 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + 128 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(II[IIIII[IIZI)V")
	public void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg1 / 2;
				@Pc(14) int local14 = -arg8 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg9 >> 8;
				@Pc(44) int local44 = local32 * arg9 >> 8;
				@Pc(56) int local56 = (arg4 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg3 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg6 + arg5 * Class5_Sub1_Sub1.anInt773;
				for (@Pc(76) int local76 = 0; local76 < arg8; local76++) {
					@Pc(82) int local82 = arg7[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg2[local76]; local103 < 0; local103++) {
						Class5_Sub1_Sub1.anIntArray201[local86++] = this.anIntArray173[(local92 >> 16) + (local98 >> 16) * this.anInt669];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class5_Sub1_Sub1.anInt773;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("93296, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + false + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(IIDIIIIII)V")
	public void method460(@OriginalArg(2) double arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg2 + arg1 * Class5_Sub1_Sub1.anInt773;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray173[(local83 >> 16) + (local85 >> 16) * this.anInt669];
						if (local104 == 0) {
							local81++;
						} else {
							Class5_Sub1_Sub1.anIntArray201[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class5_Sub1_Sub1.anInt773;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("58348, " + 256 + ", " + 15 + ", " + arg0 + ", " + 15 + ", " + 20 + ", " + arg1 + ", " + arg2 + ", " + 20 + ", " + 0 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(ZIILclient!SFAIBATY;)V")
	public void method461(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class5_Sub1_Sub1_Sub2 arg3) {
		try {
			arg1 += this.anInt671;
			arg2 += this.anInt672;
			@Pc(15) int local15 = arg1 + arg2 * Class5_Sub1_Sub1.anInt773;
			@Pc(17) int local17 = 0;
			if (!arg0) {
				this.aBoolean176 = !this.aBoolean176;
			}
			@Pc(30) int local30 = this.anInt670;
			@Pc(33) int local33 = this.anInt669;
			@Pc(37) int local37 = Class5_Sub1_Sub1.anInt773 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg2 < Class5_Sub1_Sub1.anInt775) {
				local46 = Class5_Sub1_Sub1.anInt775 - arg2;
				local30 -= local46;
				arg2 = Class5_Sub1_Sub1.anInt775;
				local17 = local46 * local33 + 0;
				local15 += local46 * Class5_Sub1_Sub1.anInt773;
			}
			if (arg2 + local30 > Class5_Sub1_Sub1.anInt776) {
				local30 -= arg2 + local30 - Class5_Sub1_Sub1.anInt776;
			}
			if (arg1 < Class5_Sub1_Sub1.anInt777) {
				local46 = Class5_Sub1_Sub1.anInt777 - arg1;
				local33 -= local46;
				arg1 = Class5_Sub1_Sub1.anInt777;
				local17 += local46;
				local15 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class5_Sub1_Sub1.anInt778) {
				local46 = arg1 + local33 - Class5_Sub1_Sub1.anInt778;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method462(local37, arg3.aByteArray17, Class5_Sub1_Sub1.anIntArray201, local39, this.anIntArray173, local30, local33, 0, local17, local15);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("5245, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TTFRDWZK", name = "a", descriptor = "(I[B[III[IIIIII)V")
	private void method462(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(11) int local11 = -(arg6 >> 2);
			@Pc(16) int local16 = -(arg6 & 0x3);
			for (@Pc(19) int local19 = -arg5; local19 < 0; local19++) {
				@Pc(30) int local30;
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					local30 = arg4[arg8++];
					if (local30 != 0 && arg1[arg9] == 0) {
						arg2[arg9++] = local30;
					} else {
						arg9++;
					}
					local30 = arg4[arg8++];
					if (local30 != 0 && arg1[arg9] == 0) {
						arg2[arg9++] = local30;
					} else {
						arg9++;
					}
					local30 = arg4[arg8++];
					if (local30 != 0 && arg1[arg9] == 0) {
						arg2[arg9++] = local30;
					} else {
						arg9++;
					}
					local30 = arg4[arg8++];
					if (local30 != 0 && arg1[arg9] == 0) {
						arg2[arg9++] = local30;
					} else {
						arg9++;
					}
				}
				for (@Pc(106) int local106 = local16; local106 < 0; local106++) {
					local30 = arg4[arg8++];
					if (local30 != 0 && arg1[arg9] == 0) {
						arg2[arg9++] = local30;
					} else {
						arg9++;
					}
				}
				arg9 += arg0;
				arg8 += arg3;
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("57797, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + 0 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}
}
