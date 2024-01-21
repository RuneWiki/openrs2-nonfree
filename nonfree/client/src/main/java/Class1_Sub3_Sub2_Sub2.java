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
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!hb", name = "z", descriptor = "I")
	private int anInt438 = -359;

	@OriginalMember(owner = "client!hb", name = "A", descriptor = "B")
	private byte aByte19 = -100;

	@OriginalMember(owner = "client!hb", name = "B", descriptor = "B")
	private byte aByte20 = 3;

	@OriginalMember(owner = "client!hb", name = "C", descriptor = "B")
	private byte aByte21 = 5;

	@OriginalMember(owner = "client!hb", name = "D", descriptor = "I")
	private int anInt439 = 3;

	@OriginalMember(owner = "client!hb", name = "E", descriptor = "[I")
	public int[] anIntArray148;

	@OriginalMember(owner = "client!hb", name = "J", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
	public int anInt440;

	@OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
	private int anInt443;

	@OriginalMember(owner = "client!hb", name = "H", descriptor = "I")
	private int anInt442;

	static {
		aBoolean116 = true;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray148 = new int[arg0 * arg1];
		this.anInt440 = this.anInt444 = arg0;
		this.anInt441 = this.anInt445 = arg1;
		this.anInt442 = this.anInt443 = 0;
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt440 = local23.getWidth(arg1);
			this.anInt441 = local23.getHeight(arg1);
			this.anInt444 = this.anInt440;
			this.anInt445 = this.anInt441;
			this.anInt442 = 0;
			this.anInt443 = 0;
			this.anIntArray148 = new int[this.anInt440 * this.anInt441];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt440, this.anInt441, this.anIntArray148, 0, this.anInt440);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ub;Ljava/lang/String;I)V")
	public Class1_Sub3_Sub2_Sub2(@OriginalArg(0) Class39 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(38) Class1_Sub3_Sub3 local38 = new Class1_Sub3_Sub3(arg0.method516(arg1 + ".dat", null), aBoolean116);
		@Pc(48) Class1_Sub3_Sub3 local48 = new Class1_Sub3_Sub3(arg0.method516("index.dat", null), aBoolean116);
		local48.anInt539 = local38.method374();
		this.anInt444 = local48.method374();
		this.anInt445 = local48.method374();
		@Pc(63) int local63 = local48.method372();
		@Pc(66) int[] local66 = new int[local63];
		for (@Pc(68) int local68 = 0; local68 < local63 - 1; local68++) {
			local66[local68 + 1] = local48.method376();
			if (local66[local68 + 1] == 0) {
				local66[local68 + 1] = 1;
			}
		}
		for (@Pc(97) int local97 = 0; local97 < arg2; local97++) {
			local48.anInt539 += 2;
			local38.anInt539 += local48.method374() * local48.method374();
			local48.anInt539++;
		}
		this.anInt442 = local48.method372();
		this.anInt443 = local48.method372();
		this.anInt440 = local48.method374();
		this.anInt441 = local48.method374();
		@Pc(144) int local144 = local48.method372();
		@Pc(150) int local150 = this.anInt440 * this.anInt441;
		this.anIntArray148 = new int[local150];
		@Pc(158) int local158;
		if (local144 == 0) {
			for (local158 = 0; local158 < local150; local158++) {
				this.anIntArray148[local158] = local66[local38.method372()];
			}
		} else if (local144 == 1) {
			for (local158 = 0; local158 < this.anInt440; local158++) {
				for (@Pc(182) int local182 = 0; local182 < this.anInt441; local182++) {
					this.anIntArray148[local158 + local182 * this.anInt440] = local66[local38.method372()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	public void method305() {
		try {
			Class1_Sub3_Sub2.method339(this.anInt440, this.anInt441, this.anIntArray148);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("87067, " + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)V")
	public void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			arg2 += this.anInt442;
			arg1 += this.anInt443;
			@Pc(15) int local15 = arg2 + arg1 * Class1_Sub3_Sub2.anInt507;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt441;
			@Pc(23) int local23 = this.anInt440;
			@Pc(27) int local27 = Class1_Sub3_Sub2.anInt507 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub3_Sub2.anInt509) {
				local36 = Class1_Sub3_Sub2.anInt509 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub3_Sub2.anInt509;
				local17 = local36 * local23;
				local15 += local36 * Class1_Sub3_Sub2.anInt507;
			}
			if (arg1 + local20 > Class1_Sub3_Sub2.anInt510) {
				local20 -= arg1 + local20 - Class1_Sub3_Sub2.anInt510;
			}
			if (arg2 < Class1_Sub3_Sub2.anInt511) {
				local36 = Class1_Sub3_Sub2.anInt511 - arg2;
				local23 -= local36;
				arg2 = Class1_Sub3_Sub2.anInt511;
				local17 += local36;
				local15 += local36;
				local29 = local36;
				local27 += local36;
			}
			if (arg2 + local23 > Class1_Sub3_Sub2.anInt512) {
				local36 = arg2 + local23 - Class1_Sub3_Sub2.anInt512;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method307(local23, local15, this.anIntArray148, local27, local20, local29, local17, Class1_Sub3_Sub2.anIntArray178);
				while (arg0 >= 0) {
				}
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("49925, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIB[IIIII[I)V")
	private void method307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			if (this.aByte19 == -100) {
				for (@Pc(19) int local19 = -arg4; local19 < 0; local19++) {
					for (@Pc(23) int local23 = local6; local23 < 0; local23++) {
						arg7[arg1++] = arg2[arg6++];
						arg7[arg1++] = arg2[arg6++];
						arg7[arg1++] = arg2[arg6++];
						arg7[arg1++] = arg2[arg6++];
					}
					for (@Pc(62) int local62 = local11; local62 < 0; local62++) {
						arg7[arg1++] = arg2[arg6++];
					}
					arg1 += arg3;
					arg6 += arg5;
				}
			}
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("99104, " + arg0 + ", " + arg1 + ", " + -100 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(III)V")
	public void method308(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt442;
			arg1 += this.anInt443;
			@Pc(24) int local24 = arg0 + arg1 * Class1_Sub3_Sub2.anInt507;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt441;
			@Pc(32) int local32 = this.anInt440;
			@Pc(36) int local36 = Class1_Sub3_Sub2.anInt507 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class1_Sub3_Sub2.anInt509) {
				local45 = Class1_Sub3_Sub2.anInt509 - arg1;
				local29 -= local45;
				arg1 = Class1_Sub3_Sub2.anInt509;
				local26 = local45 * local32;
				local24 += local45 * Class1_Sub3_Sub2.anInt507;
			}
			if (arg1 + local29 > Class1_Sub3_Sub2.anInt510) {
				local29 -= arg1 + local29 - Class1_Sub3_Sub2.anInt510;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt511) {
				local45 = Class1_Sub3_Sub2.anInt511 - arg0;
				local32 -= local45;
				arg0 = Class1_Sub3_Sub2.anInt511;
				local26 += local45;
				local24 += local45;
				local38 = local45;
				local36 += local45;
			}
			if (arg0 + local32 > Class1_Sub3_Sub2.anInt512) {
				local45 = arg0 + local32 - Class1_Sub3_Sub2.anInt512;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method309(Class1_Sub3_Sub2.anIntArray178, this.anIntArray148, local26, local24, local32, local29, local36, local38);
			}
		} catch (@Pc(147) RuntimeException local147) {
			signlink.reporterror("74095, " + arg0 + ", " + ", " + arg1 + ", " + local147.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method309(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIB)V")
	public void method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		try {
			@Pc(4) boolean local4 = false;
			try {
				@Pc(15) int local15 = this.anInt440;
				@Pc(18) int local18 = this.anInt441;
				@Pc(20) int local20 = 0;
				@Pc(22) int local22 = 0;
				@Pc(37) int local37 = this.anInt444;
				@Pc(40) int local40 = this.anInt445;
				@Pc(46) int local46 = (local37 << 16) / 22;
				@Pc(52) int local52 = (local40 << 16) / 22;
				arg3 = (this.anInt442 * 22 + local37 - 1) / local37 + 5;
				arg2 = (this.anInt443 * 22 + local40 - 1) / local40 + 5;
				if (this.anInt442 * 22 % local37 != 0) {
					local20 = (local37 - this.anInt442 * 22 % local37 << 16) / 22;
				}
				if (this.anInt443 * 22 % local40 != 0) {
					local22 = (local40 - this.anInt443 * 22 % local40 << 16) / 22;
				}
				arg1 = (this.anInt440 - (local20 >> 16)) * 22 / local37;
				arg0 = (this.anInt441 - (local22 >> 16)) * 22 / local40;
				@Pc(146) int local146 = arg3 + arg2 * Class1_Sub3_Sub2.anInt507;
				@Pc(150) int local150 = Class1_Sub3_Sub2.anInt507 - arg1;
				@Pc(157) int local157;
				if (arg2 < Class1_Sub3_Sub2.anInt509) {
					local157 = Class1_Sub3_Sub2.anInt509 - arg2;
					arg0 -= local157;
					arg2 = 0;
					local146 += local157 * Class1_Sub3_Sub2.anInt507;
					local22 += local52 * local157;
				}
				if (arg2 + arg0 > Class1_Sub3_Sub2.anInt510) {
					arg0 -= arg2 + arg0 - Class1_Sub3_Sub2.anInt510;
				}
				if (arg3 < Class1_Sub3_Sub2.anInt511) {
					local157 = Class1_Sub3_Sub2.anInt511 - arg3;
					arg1 -= local157;
					arg3 = 0;
					local146 += local157;
					local20 += local46 * local157;
					local150 += local157;
				}
				if (arg3 + arg1 > Class1_Sub3_Sub2.anInt512) {
					local157 = arg3 + arg1 - Class1_Sub3_Sub2.anInt512;
					arg1 -= local157;
					local150 += local157;
				}
				this.method311(local20, local150, Class1_Sub3_Sub2.anIntArray178, 0, this.aByte20, local22, arg0, arg1, local146, local52, this.anIntArray148, local15, local46);
			} catch (@Pc(253) Exception local253) {
				System.out.println("error in sprite clipping routine");
			}
		} catch (@Pc(258) RuntimeException local258) {
			signlink.reporterror("58853, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + local258.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II[IIBIIIII[III)V")
	private void method311(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		try {
			if (arg4 == 3) {
				@Pc(6) boolean local6 = false;
				try {
					@Pc(11) int local11 = arg0;
					for (@Pc(14) int local14 = -arg6; local14 < 0; local14++) {
						@Pc(22) int local22 = (arg5 >> 16) * arg11;
						for (@Pc(25) int local25 = -arg7; local25 < 0; local25++) {
							@Pc(35) int local35 = arg10[(arg0 >> 16) + local22];
							if (local35 == 0) {
								arg8++;
							} else {
								arg2[arg8++] = local35;
							}
							arg0 += arg12;
						}
						arg5 += arg9;
						arg0 = local11;
						arg8 += arg1;
					}
				} catch (@Pc(67) Exception local67) {
					System.out.println("error in plot_scale");
				}
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("90404, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + arg11 + ", " + arg12 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBII)V")
	public void method312(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(11) int local11;
			if (arg1 == this.aByte21) {
				@Pc(7) boolean local7 = false;
			} else {
				for (local11 = 1; local11 > 0; local11++) {
				}
			}
			arg0 += this.anInt442;
			arg2 += this.anInt443;
			local11 = arg0 + arg2 * Class1_Sub3_Sub2.anInt507;
			@Pc(34) int local34 = 0;
			@Pc(37) int local37 = this.anInt441;
			@Pc(40) int local40 = this.anInt440;
			@Pc(44) int local44 = Class1_Sub3_Sub2.anInt507 - local40;
			@Pc(46) int local46 = 0;
			@Pc(53) int local53;
			if (arg2 < Class1_Sub3_Sub2.anInt509) {
				local53 = Class1_Sub3_Sub2.anInt509 - arg2;
				local37 -= local53;
				arg2 = Class1_Sub3_Sub2.anInt509;
				local34 = local53 * local40;
				local11 += local53 * Class1_Sub3_Sub2.anInt507;
			}
			if (arg2 + local37 > Class1_Sub3_Sub2.anInt510) {
				local37 -= arg2 + local37 - Class1_Sub3_Sub2.anInt510;
			}
			if (arg0 < Class1_Sub3_Sub2.anInt511) {
				local53 = Class1_Sub3_Sub2.anInt511 - arg0;
				local40 -= local53;
				arg0 = Class1_Sub3_Sub2.anInt511;
				local34 += local53;
				local11 += local53;
				local46 = local53;
				local44 += local53;
			}
			if (arg0 + local40 > Class1_Sub3_Sub2.anInt512) {
				local53 = arg0 + local40 - Class1_Sub3_Sub2.anInt512;
				local40 -= local53;
				local46 += local53;
				local44 += local53;
			}
			if (local40 > 0 && local37 > 0) {
				this.method313(local40, 0, local44, local37, this.anIntArray148, local34, Class1_Sub3_Sub2.anIntArray178, local11, local46);
			}
		} catch (@Pc(157) RuntimeException local157) {
			signlink.reporterror("62877, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 128 + ", " + local157.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIIII[II[III)V")
	private void method313(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg3; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg0; local13 < 0; local13++) {
					@Pc(20) int local20 = arg4[arg5++];
					if (local20 == 0) {
						arg7++;
					} else {
						@Pc(26) int local26 = arg6[arg7];
						arg6[arg7++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg7 += arg2;
				arg5 += arg8;
			}
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("31994, " + 128 + ", " + -583 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I[IIIIIIII[I)V")
	public void method314(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8) {
		try {
			try {
				@Pc(18) int local18 = -arg6 / 2;
				@Pc(23) int local23 = -arg5 / 2;
				@Pc(32) int local32 = (int) (Math.sin((double) arg2 / 326.11D) * 65536.0D);
				@Pc(41) int local41 = (int) (Math.cos((double) arg2 / 326.11D) * 65536.0D);
				@Pc(53) int local53 = (arg0 << 16) + local23 * local32 + local18 * local41;
				@Pc(65) int local65 = (arg4 << 16) + (local23 * local41 - local18 * local32);
				@Pc(71) int local71 = arg7 + arg3 * Class1_Sub3_Sub2.anInt507;
				for (@Pc(73) int local73 = 0; local73 < arg5; local73++) {
					@Pc(79) int local79 = arg8[local73];
					@Pc(83) int local83 = local71 + local79;
					@Pc(89) int local89 = local53 + local41 * local79;
					@Pc(95) int local95 = local65 - local32 * local79;
					for (@Pc(100) int local100 = -arg1[local73]; local100 < 0; local100++) {
						Class1_Sub3_Sub2.anIntArray178[local83++] = this.anIntArray148[(local89 >> 16) + (local95 >> 16) * this.anInt440];
						local89 += local41;
						local95 -= local32;
					}
					local53 += local32;
					local65 += local41;
					local71 += Class1_Sub3_Sub2.anInt507;
				}
			} catch (@Pc(148) Exception local148) {
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("22056, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!ib;ZI)V")
	public void method315(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub3_Sub2_Sub3 arg1, @OriginalArg(3) int arg2) {
		try {
			arg2 += this.anInt442;
			arg0 += this.anInt443;
			@Pc(15) int local15 = arg2 + arg0 * Class1_Sub3_Sub2.anInt507;
			@Pc(17) int local17 = 0;
			@Pc(23) int local23 = this.anInt441;
			@Pc(26) int local26 = this.anInt440;
			@Pc(30) int local30 = Class1_Sub3_Sub2.anInt507 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class1_Sub3_Sub2.anInt509) {
				local39 = Class1_Sub3_Sub2.anInt509 - arg0;
				local23 -= local39;
				arg0 = Class1_Sub3_Sub2.anInt509;
				local17 = local39 * local26;
				local15 += local39 * Class1_Sub3_Sub2.anInt507;
			}
			if (arg0 + local23 > Class1_Sub3_Sub2.anInt510) {
				local23 -= arg0 + local23 - Class1_Sub3_Sub2.anInt510;
			}
			if (arg2 < Class1_Sub3_Sub2.anInt511) {
				local39 = Class1_Sub3_Sub2.anInt511 - arg2;
				local26 -= local39;
				arg2 = Class1_Sub3_Sub2.anInt511;
				local17 += local39;
				local15 += local39;
				local32 = local39;
				local30 += local39;
			}
			if (arg2 + local26 > Class1_Sub3_Sub2.anInt512) {
				local39 = arg2 + local26 - Class1_Sub3_Sub2.anInt512;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method316(local17, local32, arg1.aByteArray7, local15, local23, 0, local26, this.anIntArray148, Class1_Sub3_Sub2.anIntArray178, local30);
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("40584, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BII[BIIII[I[II)V")
	private void method316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg6 >> 2);
			@Pc(11) int local11 = -(arg6 & 0x3);
			for (@Pc(25) int local25 = -arg4; local25 < 0; local25++) {
				@Pc(36) int local36;
				for (@Pc(29) int local29 = local6; local29 < 0; local29++) {
					local36 = arg7[arg0++];
					if (local36 != 0 && arg2[arg3] == 0) {
						arg8[arg3++] = local36;
					} else {
						arg3++;
					}
					local36 = arg7[arg0++];
					if (local36 != 0 && arg2[arg3] == 0) {
						arg8[arg3++] = local36;
					} else {
						arg3++;
					}
					local36 = arg7[arg0++];
					if (local36 != 0 && arg2[arg3] == 0) {
						arg8[arg3++] = local36;
					} else {
						arg3++;
					}
					local36 = arg7[arg0++];
					if (local36 != 0 && arg2[arg3] == 0) {
						arg8[arg3++] = local36;
					} else {
						arg3++;
					}
				}
				for (@Pc(112) int local112 = local11; local112 < 0; local112++) {
					local36 = arg7[arg0++];
					if (local36 != 0 && arg2[arg3] == 0) {
						arg8[arg3++] = local36;
					} else {
						arg3++;
					}
				}
				arg3 += arg9;
				arg0 += arg1;
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("31429, " + -20 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}
}
