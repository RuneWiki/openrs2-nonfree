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

@OriginalClass("client!HOSNGCXH")
public final class Class4_Sub1_Sub2_Sub2 extends Class4_Sub1_Sub2 {

	@OriginalMember(owner = "client!HOSNGCXH", name = "B", descriptor = "I")
	private int anInt338;

	@OriginalMember(owner = "client!HOSNGCXH", name = "G", descriptor = "I")
	private int anInt340;

	@OriginalMember(owner = "client!HOSNGCXH", name = "z", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!HOSNGCXH", name = "A", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!HOSNGCXH", name = "C", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!HOSNGCXH", name = "D", descriptor = "I")
	private int anInt339 = 7964;

	@OriginalMember(owner = "client!HOSNGCXH", name = "E", descriptor = "B")
	private byte aByte14 = 3;

	@OriginalMember(owner = "client!HOSNGCXH", name = "F", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!HOSNGCXH", name = "H", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!HOSNGCXH", name = "I", descriptor = "[I")
	public int[] anIntArray47;

	@OriginalMember(owner = "client!HOSNGCXH", name = "N", descriptor = "I")
	public int anInt345;

	@OriginalMember(owner = "client!HOSNGCXH", name = "J", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!HOSNGCXH", name = "O", descriptor = "I")
	public int anInt346;

	@OriginalMember(owner = "client!HOSNGCXH", name = "K", descriptor = "I")
	public int anInt342;

	@OriginalMember(owner = "client!HOSNGCXH", name = "M", descriptor = "I")
	private int anInt344;

	@OriginalMember(owner = "client!HOSNGCXH", name = "L", descriptor = "I")
	private int anInt343;

	@OriginalMember(owner = "client!HOSNGCXH", name = "<init>", descriptor = "(II)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray47 = new int[arg0 * arg1];
		this.anInt341 = this.anInt345 = arg0;
		this.anInt342 = this.anInt346 = arg1;
		this.anInt343 = this.anInt344 = 0;
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(26) Image local26 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(31) MediaTracker local31 = new MediaTracker(arg1);
			local31.addImage(local26, 0);
			local31.waitForAll();
			this.anInt341 = local26.getWidth(arg1);
			this.anInt342 = local26.getHeight(arg1);
			this.anInt345 = this.anInt341;
			this.anInt346 = this.anInt342;
			this.anInt343 = 0;
			this.anInt344 = 0;
			this.anIntArray47 = new int[this.anInt341 * this.anInt342];
			@Pc(85) PixelGrabber local85 = new PixelGrabber(local26, 0, 0, this.anInt341, this.anInt342, this.anIntArray47, 0, this.anInt341);
			local85.grabPixels();
		} catch (@Pc(90) Exception local90) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "<init>", descriptor = "(Lclient!TKEGJSFV;Ljava/lang/String;I)V")
	public Class4_Sub1_Sub2_Sub2(@OriginalArg(0) Class38 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(40) Class4_Sub1_Sub3 local40 = new Class4_Sub1_Sub3(arg0.method514(arg1 + ".dat", null), false);
		@Pc(49) Class4_Sub1_Sub3 local49 = new Class4_Sub1_Sub3(arg0.method514("index.dat", null), false);
		local49.anInt242 = local40.method169();
		this.anInt345 = local49.method169();
		this.anInt346 = local49.method169();
		@Pc(64) int local64 = local49.method167();
		@Pc(67) int[] local67 = new int[local64];
		for (@Pc(69) int local69 = 0; local69 < local64 - 1; local69++) {
			local67[local69 + 1] = local49.method171();
			if (local67[local69 + 1] == 0) {
				local67[local69 + 1] = 1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < arg2; local98++) {
			local49.anInt242 += 2;
			local40.anInt242 += local49.method169() * local49.method169();
			local49.anInt242++;
		}
		this.anInt343 = local49.method167();
		this.anInt344 = local49.method167();
		this.anInt341 = local49.method169();
		this.anInt342 = local49.method169();
		@Pc(145) int local145 = local49.method167();
		@Pc(151) int local151 = this.anInt341 * this.anInt342;
		this.anIntArray47 = new int[local151];
		@Pc(159) int local159;
		if (local145 == 0) {
			for (local159 = 0; local159 < local151; local159++) {
				this.anIntArray47[local159] = local67[local40.method167()];
			}
		} else if (local145 == 1) {
			for (local159 = 0; local159 < this.anInt341; local159++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt342; local183++) {
					this.anIntArray47[local159 + local183 * this.anInt341] = local67[local40.method167()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(Z)V")
	public void method254() {
		try {
			Class4_Sub1_Sub2.method482(this.anIntArray47, this.anInt341, this.anInt342);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("92229, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(IIBI)V")
	public void method255(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray47.length; local3++) {
				@Pc(10) int local10 = this.anIntArray47[local3];
				if (local10 != 0) {
					@Pc(18) int local18 = local10 >> 16 & 0xFF;
					local18 += arg1;
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
					local60 += arg3;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray47[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
			@Pc(100) boolean local100 = false;
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("19174, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(I)V")
	public void method256() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt345 * this.anInt346];
			for (@Pc(10) int local10 = 0; local10 < this.anInt342; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt341; local14++) {
					local8[(local10 + this.anInt344) * this.anInt345 + local14 + this.anInt343] = this.anIntArray47[local10 * this.anInt341 + local14];
				}
			}
			this.anIntArray47 = local8;
			this.anInt341 = this.anInt345;
			this.anInt342 = this.anInt346;
			this.anInt343 = 0;
			this.anInt344 = 0;
		} catch (@Pc(80) RuntimeException local80) {
			signlink.reporterror("21687, " + -985 + ", " + local80.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(ZII)V")
	public void method257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt343;
			arg1 += this.anInt344;
			@Pc(20) int local20 = arg0 + arg1 * Class4_Sub1_Sub2.anInt698;
			@Pc(22) int local22 = 0;
			@Pc(25) int local25 = this.anInt342;
			@Pc(28) int local28 = this.anInt341;
			@Pc(32) int local32 = Class4_Sub1_Sub2.anInt698 - local28;
			@Pc(34) int local34 = 0;
			@Pc(41) int local41;
			if (arg1 < Class4_Sub1_Sub2.anInt700) {
				local41 = Class4_Sub1_Sub2.anInt700 - arg1;
				local25 -= local41;
				arg1 = Class4_Sub1_Sub2.anInt700;
				local22 = local41 * local28 + 0;
				local20 += local41 * Class4_Sub1_Sub2.anInt698;
			}
			if (arg1 + local25 > Class4_Sub1_Sub2.anInt701) {
				local25 -= arg1 + local25 - Class4_Sub1_Sub2.anInt701;
			}
			if (arg0 < Class4_Sub1_Sub2.anInt702) {
				local41 = Class4_Sub1_Sub2.anInt702 - arg0;
				local28 -= local41;
				arg0 = Class4_Sub1_Sub2.anInt702;
				local22 += local41;
				local20 += local41;
				local34 = local41 + 0;
				local32 += local41;
			}
			if (arg0 + local28 > Class4_Sub1_Sub2.anInt703) {
				local41 = arg0 + local28 - Class4_Sub1_Sub2.anInt703;
				local28 -= local41;
				local34 += local41;
				local32 += local41;
			}
			if (local28 > 0 && local25 > 0) {
				this.method258(local25, local32, this.anIntArray47, local28, local20, Class4_Sub1_Sub2.anIntArray165, local22, local34);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("27501, " + false + ", " + arg0 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(II[IIII[III)V")
	private void method258(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		try {
			@Pc(11) int local11 = -(arg3 >> 2);
			@Pc(16) int local16 = -(arg3 & 0x3);
			for (@Pc(19) int local19 = -arg0; local19 < 0; local19++) {
				for (@Pc(23) int local23 = local11; local23 < 0; local23++) {
					arg5[arg4++] = arg2[arg6++];
					arg5[arg4++] = arg2[arg6++];
					arg5[arg4++] = arg2[arg6++];
					arg5[arg4++] = arg2[arg6++];
				}
				for (@Pc(62) int local62 = local16; local62 < 0; local62++) {
					arg5[arg4++] = arg2[arg6++];
				}
				arg4 += arg1;
				arg6 += arg7;
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("93113, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 147 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(III)V")
	public void method259(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt343;
			if (this.anInt339 != 7964) {
				this.aBoolean103 = !this.aBoolean103;
			}
			arg0 += this.anInt344;
			@Pc(27) int local27 = arg1 + arg0 * Class4_Sub1_Sub2.anInt698;
			@Pc(29) int local29 = 0;
			@Pc(32) int local32 = this.anInt342;
			@Pc(35) int local35 = this.anInt341;
			@Pc(39) int local39 = Class4_Sub1_Sub2.anInt698 - local35;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48;
			if (arg0 < Class4_Sub1_Sub2.anInt700) {
				local48 = Class4_Sub1_Sub2.anInt700 - arg0;
				local32 -= local48;
				arg0 = Class4_Sub1_Sub2.anInt700;
				local29 = local48 * local35 + 0;
				local27 += local48 * Class4_Sub1_Sub2.anInt698;
			}
			if (arg0 + local32 > Class4_Sub1_Sub2.anInt701) {
				local32 -= arg0 + local32 - Class4_Sub1_Sub2.anInt701;
			}
			if (arg1 < Class4_Sub1_Sub2.anInt702) {
				local48 = Class4_Sub1_Sub2.anInt702 - arg1;
				local35 -= local48;
				arg1 = Class4_Sub1_Sub2.anInt702;
				local29 += local48;
				local27 += local48;
				local41 = local48 + 0;
				local39 += local48;
			}
			if (arg1 + local35 > Class4_Sub1_Sub2.anInt703) {
				local48 = arg1 + local35 - Class4_Sub1_Sub2.anInt703;
				local35 -= local48;
				local41 += local48;
				local39 += local48;
			}
			if (local35 > 0 && local32 > 0) {
				this.method260(Class4_Sub1_Sub2.anIntArray165, this.anIntArray47, local29, local27, local35, local32, local39, local41);
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("22509, " + 7964 + ", " + arg0 + ", " + arg1 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method260(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(IIIB)V")
	public void method261(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2) {
		try {
			arg0 += this.anInt343;
			arg1 += this.anInt344;
			@Pc(15) int local15 = arg0 + arg1 * Class4_Sub1_Sub2.anInt698;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt342;
			@Pc(23) int local23 = this.anInt341;
			@Pc(27) int local27 = Class4_Sub1_Sub2.anInt698 - local23;
			@Pc(29) int local29 = 0;
			if (arg2 == this.aByte14) {
				@Pc(41) int local41;
				if (arg1 < Class4_Sub1_Sub2.anInt700) {
					local41 = Class4_Sub1_Sub2.anInt700 - arg1;
					local20 -= local41;
					arg1 = Class4_Sub1_Sub2.anInt700;
					local17 = local41 * local23 + 0;
					local15 += local41 * Class4_Sub1_Sub2.anInt698;
				}
				if (arg1 + local20 > Class4_Sub1_Sub2.anInt701) {
					local20 -= arg1 + local20 - Class4_Sub1_Sub2.anInt701;
				}
				if (arg0 < Class4_Sub1_Sub2.anInt702) {
					local41 = Class4_Sub1_Sub2.anInt702 - arg0;
					local23 -= local41;
					arg0 = Class4_Sub1_Sub2.anInt702;
					local17 += local41;
					local15 += local41;
					local29 = local41 + 0;
					local27 += local41;
				}
				if (arg0 + local23 > Class4_Sub1_Sub2.anInt703) {
					local41 = arg0 + local23 - Class4_Sub1_Sub2.anInt703;
					local23 -= local41;
					local29 += local41;
					local27 += local41;
				}
				if (local23 > 0 && local20 > 0) {
					this.method262(local29, Class4_Sub1_Sub2.anIntArray165, 0, local23, local20, local17, this.anIntArray47, local27, local15);
				}
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("1599, " + 128 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(I[IIIZIII[III)V")
	private void method262(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg4; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg3; local13 < 0; local13++) {
					@Pc(20) int local20 = arg6[arg5++];
					if (local20 == 0) {
						arg8++;
					} else {
						@Pc(26) int local26 = arg1[arg8];
						arg1[arg8++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg7;
				arg5 += arg0;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("77018, " + arg0 + ", " + arg1 + ", " + 128 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(I[IIII[IIIIII)V")
	public void method263(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(17) int local17 = -arg5 / 2;
				@Pc(22) int local22 = -arg6 / 2;
				@Pc(31) int local31 = (int) (Math.sin((double) arg0 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = (int) (Math.cos((double) arg0 / 326.11D) * 65536.0D);
				@Pc(46) int local46 = local31 * arg8 >> 8;
				@Pc(52) int local52 = local40 * arg8 >> 8;
				@Pc(64) int local64 = (arg2 << 16) + local22 * local46 + local17 * local52;
				@Pc(76) int local76 = (arg3 << 16) + (local22 * local52 - local17 * local46);
				@Pc(82) int local82 = arg7 + arg9 * Class4_Sub1_Sub2.anInt698;
				for (@Pc(84) int local84 = 0; local84 < arg6; local84++) {
					@Pc(90) int local90 = arg4[local84];
					@Pc(94) int local94 = local82 + local90;
					@Pc(100) int local100 = local64 + local52 * local90;
					@Pc(106) int local106 = local76 - local46 * local90;
					for (@Pc(111) int local111 = -arg1[local84]; local111 < 0; local111++) {
						Class4_Sub1_Sub2.anIntArray165[local94++] = this.anIntArray47[(local100 >> 16) + (local106 >> 16) * this.anInt341];
						local100 += local52;
						local106 -= local46;
					}
					local64 += local46;
					local76 += local52;
					local82 += Class4_Sub1_Sub2.anInt698;
				}
			} catch (@Pc(159) Exception local159) {
			}
		} catch (@Pc(161) RuntimeException local161) {
			signlink.reporterror("75073, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + -696 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local161.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(IIIDIBIII)V")
	public void method264(@OriginalArg(2) int arg0, @OriginalArg(3) double arg1, @OriginalArg(5) byte arg2, @OriginalArg(7) int arg3) {
		try {
			@Pc(6) boolean local6 = false;
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg0 + arg3 * Class4_Sub1_Sub2.anInt698;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray47[(local83 >> 16) + (local85 >> 16) * this.anInt341];
						if (local104 == 0) {
							local81++;
						} else {
							Class4_Sub1_Sub2.anIntArray165[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class4_Sub1_Sub2.anInt698;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("57018, " + 15 + ", " + 15 + ", " + arg0 + ", " + arg1 + ", " + 20 + ", " + arg2 + ", " + 256 + ", " + arg3 + ", " + 20 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(ILclient!DGXCFOYI;BI)V")
	public void method265(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub1_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt343;
			arg2 += this.anInt344;
			@Pc(26) int local26 = arg0 + arg2 * Class4_Sub1_Sub2.anInt698;
			@Pc(28) int local28 = 0;
			@Pc(31) int local31 = this.anInt342;
			@Pc(34) int local34 = this.anInt341;
			@Pc(38) int local38 = Class4_Sub1_Sub2.anInt698 - local34;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47;
			if (arg2 < Class4_Sub1_Sub2.anInt700) {
				local47 = Class4_Sub1_Sub2.anInt700 - arg2;
				local31 -= local47;
				arg2 = Class4_Sub1_Sub2.anInt700;
				local28 = local47 * local34 + 0;
				local26 += local47 * Class4_Sub1_Sub2.anInt698;
			}
			if (arg2 + local31 > Class4_Sub1_Sub2.anInt701) {
				local31 -= arg2 + local31 - Class4_Sub1_Sub2.anInt701;
			}
			if (arg0 < Class4_Sub1_Sub2.anInt702) {
				local47 = Class4_Sub1_Sub2.anInt702 - arg0;
				local34 -= local47;
				arg0 = Class4_Sub1_Sub2.anInt702;
				local28 += local47;
				local26 += local47;
				local40 = local47 + 0;
				local38 += local47;
			}
			if (arg0 + local34 > Class4_Sub1_Sub2.anInt703) {
				local47 = arg0 + local34 - Class4_Sub1_Sub2.anInt703;
				local34 -= local47;
				local40 += local47;
				local38 += local47;
			}
			if (local34 > 0 && local31 > 0) {
				this.method266(local34, local26, local40, local28, arg1.aByteArray2, this.anIntArray47, local38, Class4_Sub1_Sub2.anIntArray165, 0, local31);
			}
		} catch (@Pc(152) RuntimeException local152) {
			signlink.reporterror("97905, " + arg0 + ", " + arg1 + ", " + -8 + ", " + arg2 + ", " + local152.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!HOSNGCXH", name = "a", descriptor = "(IIIII[B[II[III)V")
	private void method266(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(9) int local9 = -(arg0 >> 2);
			@Pc(14) int local14 = -(arg0 & 0x3);
			for (@Pc(17) int local17 = -arg9; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					local28 = arg5[arg3++];
					if (local28 != 0 && arg4[arg1] == 0) {
						arg7[arg1++] = local28;
					} else {
						arg1++;
					}
					local28 = arg5[arg3++];
					if (local28 != 0 && arg4[arg1] == 0) {
						arg7[arg1++] = local28;
					} else {
						arg1++;
					}
					local28 = arg5[arg3++];
					if (local28 != 0 && arg4[arg1] == 0) {
						arg7[arg1++] = local28;
					} else {
						arg1++;
					}
					local28 = arg5[arg3++];
					if (local28 != 0 && arg4[arg1] == 0) {
						arg7[arg1++] = local28;
					} else {
						arg1++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg5[arg3++];
					if (local28 != 0 && arg4[arg1] == 0) {
						arg7[arg1++] = local28;
					} else {
						arg1++;
					}
				}
				arg1 += arg6;
				arg3 += arg2;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("87930, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
