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

@OriginalClass("client!IBHUFTPE")
public final class Class1_Sub1_Sub2_Sub3 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!IBHUFTPE", name = "v", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!IBHUFTPE", name = "w", descriptor = "I")
	private int anInt346 = 533;

	@OriginalMember(owner = "client!IBHUFTPE", name = "x", descriptor = "I")
	private int anInt347 = 625;

	@OriginalMember(owner = "client!IBHUFTPE", name = "y", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!IBHUFTPE", name = "z", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!IBHUFTPE", name = "A", descriptor = "I")
	private int anInt348 = 5;

	@OriginalMember(owner = "client!IBHUFTPE", name = "B", descriptor = "[I")
	public int[] anIntArray62;

	@OriginalMember(owner = "client!IBHUFTPE", name = "G", descriptor = "I")
	public int anInt353;

	@OriginalMember(owner = "client!IBHUFTPE", name = "C", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!IBHUFTPE", name = "H", descriptor = "I")
	public int anInt354;

	@OriginalMember(owner = "client!IBHUFTPE", name = "D", descriptor = "I")
	public int anInt350;

	@OriginalMember(owner = "client!IBHUFTPE", name = "F", descriptor = "I")
	private int anInt352;

	@OriginalMember(owner = "client!IBHUFTPE", name = "E", descriptor = "I")
	private int anInt351;

	@OriginalMember(owner = "client!IBHUFTPE", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray62 = new int[arg0 * arg1];
		this.anInt349 = this.anInt353 = arg0;
		this.anInt350 = this.anInt354 = arg1;
		this.anInt351 = this.anInt352 = 0;
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt349 = local23.getWidth(arg1);
			this.anInt350 = local23.getHeight(arg1);
			this.anInt353 = this.anInt349;
			this.anInt354 = this.anInt350;
			this.anInt351 = 0;
			this.anInt352 = 0;
			this.anIntArray62 = new int[this.anInt349 * this.anInt350];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt349, this.anInt350, this.anIntArray62, 0, this.anInt349);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "<init>", descriptor = "(Lclient!IEMHZJLX;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub3(@OriginalArg(0) Class15 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class1_Sub1_Sub4 local37 = new Class1_Sub1_Sub4(0, arg0.method181(arg1 + ".dat", null));
		@Pc(46) Class1_Sub1_Sub4 local46 = new Class1_Sub1_Sub4(0, arg0.method181("index.dat", null));
		local46.anInt529 = local37.method296();
		this.anInt353 = local46.method296();
		this.anInt354 = local46.method296();
		@Pc(61) int local61 = local46.method294();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method298();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(101) int local101 = 0; local101 < arg2; local101++) {
			local46.anInt529 += 2;
			local37.anInt529 += local46.method296() * local46.method296();
			local46.anInt529++;
		}
		this.anInt351 = local46.method294();
		this.anInt352 = local46.method294();
		this.anInt349 = local46.method296();
		this.anInt350 = local46.method296();
		@Pc(148) int local148 = local46.method294();
		@Pc(154) int local154 = this.anInt349 * this.anInt350;
		this.anIntArray62 = new int[local154];
		@Pc(162) int local162;
		if (local148 == 0) {
			for (local162 = 0; local162 < local154; local162++) {
				this.anIntArray62[local162] = local64[local37.method294()];
			}
		} else if (local148 == 1) {
			for (local162 = 0; local162 < this.anInt349; local162++) {
				for (@Pc(186) int local186 = 0; local186 < this.anInt350; local186++) {
					this.anIntArray62[local162 + local186 * this.anInt349] = local64[local37.method294()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "b", descriptor = "(B)V")
	public void method167() {
		try {
			Class1_Sub1_Sub2.method512(this.anIntArray62, this.anInt350, this.anInt349);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("29264, " + 59 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(BIII)V")
	public void method168(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray62.length; local3++) {
				@Pc(10) int local10 = this.anIntArray62[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg2;
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
					local60 += arg3;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray62[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			if (arg0 == 7) {
				;
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("80241, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "b", descriptor = "(I)V")
	public void method169() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt353 * this.anInt354];
			for (@Pc(10) int local10 = 0; local10 < this.anInt350; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt349; local14++) {
					local8[(local10 + this.anInt352) * this.anInt353 + local14 + this.anInt351] = this.anIntArray62[local10 * this.anInt349 + local14];
				}
			}
			this.anIntArray62 = local8;
			this.anInt349 = this.anInt353;
			this.anInt350 = this.anInt354;
			this.anInt351 = 0;
			this.anInt352 = 0;
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("73739, " + -185 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(ZII)V")
	public void method170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt351;
			arg1 += this.anInt352;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt730;
			@Pc(17) int local17 = 0;
			@Pc(25) int local25 = this.anInt350;
			@Pc(28) int local28 = this.anInt349;
			@Pc(32) int local32 = Class1_Sub1_Sub2.anInt730 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class1_Sub1_Sub2.anInt732) {
				local41 = Class1_Sub1_Sub2.anInt732 - arg1;
				local25 -= local41;
				arg1 = Class1_Sub1_Sub2.anInt732;
				local17 = local41 * local28 + 0;
				local15 += local41 * Class1_Sub1_Sub2.anInt730;
			}
			if (arg1 + local25 > Class1_Sub1_Sub2.anInt733) {
				local25 -= arg1 + local25 - Class1_Sub1_Sub2.anInt733;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt734) {
				local41 = Class1_Sub1_Sub2.anInt734 - arg0;
				local28 -= local41;
				arg0 = Class1_Sub1_Sub2.anInt734;
				local17 += local41;
				local15 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class1_Sub1_Sub2.anInt735) {
				local41 = arg0 + local28 - Class1_Sub1_Sub2.anInt735;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method171(local28, 946, Class1_Sub1_Sub2.anIntArray192, local32, local17, local34, local15, local25, this.anIntArray62);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("32546, " + false + ", " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(II[IIIIII[I)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			@Pc(15) boolean local15 = false;
			for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
				for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
					arg2[arg6++] = arg8[arg4++];
					arg2[arg6++] = arg8[arg4++];
					arg2[arg6++] = arg8[arg4++];
					arg2[arg6++] = arg8[arg4++];
				}
				for (@Pc(61) int local61 = local11; local61 < 0; local61++) {
					arg2[arg6++] = arg8[arg4++];
				}
				arg6 += arg3;
				arg4 += arg5;
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("48042, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(III)V")
	public void method172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt351;
			arg1 += this.anInt352;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt730;
			@Pc(17) int local17 = 0;
			@Pc(24) int local24 = this.anInt350;
			@Pc(27) int local27 = this.anInt349;
			@Pc(31) int local31 = Class1_Sub1_Sub2.anInt730 - local27;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40;
			if (arg1 < Class1_Sub1_Sub2.anInt732) {
				local40 = Class1_Sub1_Sub2.anInt732 - arg1;
				local24 -= local40;
				arg1 = Class1_Sub1_Sub2.anInt732;
				local17 = local40 * local27 + 0;
				local15 += local40 * Class1_Sub1_Sub2.anInt730;
			}
			if (arg1 + local24 > Class1_Sub1_Sub2.anInt733) {
				local24 -= arg1 + local24 - Class1_Sub1_Sub2.anInt733;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt734) {
				local40 = Class1_Sub1_Sub2.anInt734 - arg0;
				local27 -= local40;
				arg0 = Class1_Sub1_Sub2.anInt734;
				local17 += local40;
				local15 += local40;
				local33 = local40 + 0;
				local31 += local40;
			}
			if (arg0 + local27 > Class1_Sub1_Sub2.anInt735) {
				local40 = arg0 + local27 - Class1_Sub1_Sub2.anInt735;
				local27 -= local40;
				local33 += local40;
				local31 += local40;
			}
			if (local27 > 0 && local24 > 0) {
				this.method173(Class1_Sub1_Sub2.anIntArray192, this.anIntArray62, local17, local15, local27, local24, local31, local33);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("30278, " + -23827 + ", " + arg0 + ", " + arg1 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method173(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(IIBI)V")
	public void method174(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(4) boolean local4 = false;
			arg2 += this.anInt351;
			arg0 += this.anInt352;
			@Pc(30) int local30 = arg2 + arg0 * Class1_Sub1_Sub2.anInt730;
			@Pc(32) int local32 = 0;
			@Pc(35) int local35 = this.anInt350;
			@Pc(38) int local38 = this.anInt349;
			@Pc(42) int local42 = Class1_Sub1_Sub2.anInt730 - local38;
			@Pc(44) int local44 = 0;
			@Pc(51) int local51;
			if (arg0 < Class1_Sub1_Sub2.anInt732) {
				local51 = Class1_Sub1_Sub2.anInt732 - arg0;
				local35 -= local51;
				arg0 = Class1_Sub1_Sub2.anInt732;
				local32 = local51 * local38 + 0;
				local30 += local51 * Class1_Sub1_Sub2.anInt730;
			}
			if (arg0 + local35 > Class1_Sub1_Sub2.anInt733) {
				local35 -= arg0 + local35 - Class1_Sub1_Sub2.anInt733;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt734) {
				local51 = Class1_Sub1_Sub2.anInt734 - arg2;
				local38 -= local51;
				arg2 = Class1_Sub1_Sub2.anInt734;
				local32 += local51;
				local30 += local51;
				local44 = local51 + 0;
				local42 += local51;
			}
			if (arg2 + local38 > Class1_Sub1_Sub2.anInt735) {
				local51 = arg2 + local38 - Class1_Sub1_Sub2.anInt735;
				local38 -= local51;
				local44 += local51;
				local42 += local51;
			}
			if (local38 > 0 && local35 > 0) {
				this.method175(0, local32, local30, this.anIntArray62, local38, Class1_Sub1_Sub2.anIntArray192, local44, local42, local35);
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("72810, " + arg0 + ", " + 128 + ", " + arg1 + ", " + arg2 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(BIII[III[IIII)V")
	private void method175(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int[] arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(12) int local12 = -arg8; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg4; local17 < 0; local17++) {
					@Pc(24) int local24 = arg3[arg1++];
					if (local24 == 0) {
						arg2++;
					} else {
						@Pc(30) int local30 = arg5[arg2];
						arg5[arg2++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg2 += arg7;
				arg1 += arg6;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("54440, " + 8 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(IZ[III[IIIIII)V")
	public void method176(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(9) int local9 = -arg5 / 2;
				@Pc(14) int local14 = -arg3 / 2;
				@Pc(23) int local23 = (int) (Math.sin((double) arg9 / 326.11D) * 65536.0D);
				@Pc(32) int local32 = (int) (Math.cos((double) arg9 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = local23 * arg2 >> 8;
				@Pc(44) int local44 = local32 * arg2 >> 8;
				@Pc(56) int local56 = (arg0 << 16) + local14 * local38 + local9 * local44;
				@Pc(68) int local68 = (arg7 << 16) + (local14 * local44 - local9 * local38);
				@Pc(74) int local74 = arg8 + arg6 * Class1_Sub1_Sub2.anInt730;
				for (@Pc(76) int local76 = 0; local76 < arg3; local76++) {
					@Pc(82) int local82 = arg1[local76];
					@Pc(86) int local86 = local74 + local82;
					@Pc(92) int local92 = local56 + local44 * local82;
					@Pc(98) int local98 = local68 - local38 * local82;
					for (@Pc(103) int local103 = -arg4[local76]; local103 < 0; local103++) {
						Class1_Sub1_Sub2.anIntArray192[local86++] = this.anIntArray62[(local92 >> 16) + (local98 >> 16) * this.anInt349];
						local92 += local44;
						local98 -= local38;
					}
					local56 += local38;
					local68 += local44;
					local74 += Class1_Sub1_Sub2.anInt730;
				}
			} catch (@Pc(151) Exception local151) {
			}
		} catch (@Pc(153) RuntimeException local153) {
			signlink.reporterror("45030, " + arg0 + ", " + true + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local153.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(IIIDIIIBI)V")
	public void method177(@OriginalArg(2) int arg0, @OriginalArg(3) double arg1, @OriginalArg(7) byte arg2, @OriginalArg(8) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(32) int local32 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(44) int local44 = local32 * 256 >> 8;
				@Pc(50) int local50 = local38 * 256 >> 8;
				@Pc(62) int local62 = local44 * -10 + local50 * -10 + 983040;
				@Pc(74) int local74 = local50 * -10 + 983040 - local44 * -10;
				@Pc(80) int local80 = arg3 + arg0 * Class1_Sub1_Sub2.anInt730;
				for (@Pc(82) int local82 = 0; local82 < 20; local82++) {
					@Pc(86) int local86 = local80;
					@Pc(88) int local88 = local62;
					@Pc(90) int local90 = local74;
					for (@Pc(93) int local93 = -20; local93 < 0; local93++) {
						@Pc(109) int local109 = this.anIntArray62[(local88 >> 16) + (local90 >> 16) * this.anInt349];
						if (local109 == 0) {
							local86++;
						} else {
							Class1_Sub1_Sub2.anIntArray192[local86++] = local109;
						}
						local88 += local50;
						local90 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class1_Sub1_Sub2.anInt730;
				}
			} catch (@Pc(148) Exception local148) {
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("55715, " + 20 + ", " + 15 + ", " + arg0 + ", " + arg1 + ", " + 15 + ", " + 256 + ", " + 20 + ", " + arg2 + ", " + arg3 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(Lclient!BNGXLHWA;IIZ)V")
	public void method178(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt351;
			arg1 += this.anInt352;
			@Pc(25) int local25 = arg2 + arg1 * Class1_Sub1_Sub2.anInt730;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt350;
			@Pc(33) int local33 = this.anInt349;
			@Pc(37) int local37 = Class1_Sub1_Sub2.anInt730 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg1 < Class1_Sub1_Sub2.anInt732) {
				local46 = Class1_Sub1_Sub2.anInt732 - arg1;
				local30 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt732;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class1_Sub1_Sub2.anInt730;
			}
			if (arg1 + local30 > Class1_Sub1_Sub2.anInt733) {
				local30 -= arg1 + local30 - Class1_Sub1_Sub2.anInt733;
			}
			if (arg2 < Class1_Sub1_Sub2.anInt734) {
				local46 = Class1_Sub1_Sub2.anInt734 - arg2;
				local33 -= local46;
				arg2 = Class1_Sub1_Sub2.anInt734;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg2 + local33 > Class1_Sub1_Sub2.anInt735) {
				local46 = arg2 + local33 - Class1_Sub1_Sub2.anInt735;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method179(local27, this.anIntArray62, local25, local30, local37, arg0.aByteArray2, Class1_Sub1_Sub2.anIntArray192, local33, 0, local39);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("60302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!IBHUFTPE", name = "a", descriptor = "(I[IIII[B[IIIII)V")
	private void method179(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(20) int local20 = -(arg7 & 0x3);
			for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
				@Pc(34) int local34;
				for (@Pc(27) int local27 = local6; local27 < 0; local27++) {
					local34 = arg1[arg0++];
					if (local34 != 0 && arg5[arg2] == 0) {
						arg6[arg2++] = local34;
					} else {
						arg2++;
					}
					local34 = arg1[arg0++];
					if (local34 != 0 && arg5[arg2] == 0) {
						arg6[arg2++] = local34;
					} else {
						arg2++;
					}
					local34 = arg1[arg0++];
					if (local34 != 0 && arg5[arg2] == 0) {
						arg6[arg2++] = local34;
					} else {
						arg2++;
					}
					local34 = arg1[arg0++];
					if (local34 != 0 && arg5[arg2] == 0) {
						arg6[arg2++] = local34;
					} else {
						arg2++;
					}
				}
				for (@Pc(110) int local110 = local20; local110 < 0; local110++) {
					local34 = arg1[arg0++];
					if (local34 != 0 && arg5[arg2] == 0) {
						arg6[arg2++] = local34;
					} else {
						arg2++;
					}
				}
				arg2 += arg4;
				arg0 += arg9;
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("61966, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + 0 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}
}
