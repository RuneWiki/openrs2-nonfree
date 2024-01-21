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

@OriginalClass("client!NUXITFPR")
public final class Class3_Sub1_Sub3_Sub2 extends Class3_Sub1_Sub3 {

	@OriginalMember(owner = "client!NUXITFPR", name = "x", descriptor = "I")
	private int anInt506 = -184;

	@OriginalMember(owner = "client!NUXITFPR", name = "y", descriptor = "I")
	private int anInt507 = 859;

	@OriginalMember(owner = "client!NUXITFPR", name = "z", descriptor = "B")
	private byte aByte20 = -126;

	@OriginalMember(owner = "client!NUXITFPR", name = "A", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!NUXITFPR", name = "B", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!NUXITFPR", name = "C", descriptor = "B")
	private byte aByte21 = 43;

	@OriginalMember(owner = "client!NUXITFPR", name = "D", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!NUXITFPR", name = "E", descriptor = "I")
	private int anInt508 = -300;

	@OriginalMember(owner = "client!NUXITFPR", name = "F", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!NUXITFPR", name = "G", descriptor = "[I")
	public int[] anIntArray83;

	@OriginalMember(owner = "client!NUXITFPR", name = "L", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!NUXITFPR", name = "H", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!NUXITFPR", name = "M", descriptor = "I")
	public int anInt514;

	@OriginalMember(owner = "client!NUXITFPR", name = "I", descriptor = "I")
	public int anInt510;

	@OriginalMember(owner = "client!NUXITFPR", name = "K", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!NUXITFPR", name = "J", descriptor = "I")
	private int anInt511;

	@OriginalMember(owner = "client!NUXITFPR", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1_Sub3_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray83 = new int[arg0 * arg1];
		this.anInt509 = this.anInt513 = arg0;
		this.anInt510 = this.anInt514 = arg1;
		this.anInt511 = this.anInt512 = 0;
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class3_Sub1_Sub3_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(32) Image local32 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(37) MediaTracker local37 = new MediaTracker(arg1);
			local37.addImage(local32, 0);
			local37.waitForAll();
			this.anInt509 = local32.getWidth(arg1);
			this.anInt510 = local32.getHeight(arg1);
			this.anInt513 = this.anInt509;
			this.anInt514 = this.anInt510;
			this.anInt511 = 0;
			this.anInt512 = 0;
			this.anIntArray83 = new int[this.anInt509 * this.anInt510];
			@Pc(91) PixelGrabber local91 = new PixelGrabber(local32, 0, 0, this.anInt509, this.anInt510, this.anIntArray83, 0, this.anInt509);
			local91.grabPixels();
		} catch (@Pc(96) Exception local96) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "<init>", descriptor = "(Lclient!DTIATKJO;Ljava/lang/String;I)V")
	public Class3_Sub1_Sub3_Sub2(@OriginalArg(0) Class7 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(46) Class3_Sub1_Sub2 local46 = new Class3_Sub1_Sub2(-527, arg0.method30(arg1 + ".dat", null));
		@Pc(55) Class3_Sub1_Sub2 local55 = new Class3_Sub1_Sub2(-527, arg0.method30("index.dat", null));
		local55.anInt257 = local46.method91();
		this.anInt513 = local55.method91();
		this.anInt514 = local55.method91();
		@Pc(70) int local70 = local55.method89();
		@Pc(73) int[] local73 = new int[local70];
		for (@Pc(75) int local75 = 0; local75 < local70 - 1; local75++) {
			local73[local75 + 1] = local55.method93();
			if (local73[local75 + 1] == 0) {
				local73[local75 + 1] = 1;
			}
		}
		for (@Pc(110) int local110 = 0; local110 < arg2; local110++) {
			local55.anInt257 += 2;
			local46.anInt257 += local55.method91() * local55.method91();
			local55.anInt257++;
		}
		this.anInt511 = local55.method89();
		this.anInt512 = local55.method89();
		this.anInt509 = local55.method91();
		this.anInt510 = local55.method91();
		@Pc(157) int local157 = local55.method89();
		@Pc(163) int local163 = this.anInt509 * this.anInt510;
		this.anIntArray83 = new int[local163];
		@Pc(171) int local171;
		if (local157 == 0) {
			for (local171 = 0; local171 < local163; local171++) {
				this.anIntArray83[local171] = local73[local46.method89()];
			}
		} else if (local157 == 1) {
			for (local171 = 0; local171 < this.anInt509; local171++) {
				for (@Pc(195) int local195 = 0; local195 < this.anInt510; local195++) {
					this.anIntArray83[local171 + local195 * this.anInt509] = local73[local46.method89()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(B)V")
	public void method298() {
		try {
			Class3_Sub1_Sub3.method427(this.anInt509, this.anInt510, this.anIntArray83);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("50846, " + -56 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(IIII)V")
	public void method299(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) boolean local5 = false;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray83.length; local7++) {
				@Pc(14) int local14 = this.anIntArray83[local7];
				if (local14 != 0) {
					@Pc(22) int local22 = local14 >> 16 & 0xFF;
					local22 += arg1;
					if (local22 < 1) {
						local22 = 1;
					} else if (local22 > 255) {
						local22 = 255;
					}
					@Pc(44) int local44 = local14 >> 8 & 0xFF;
					local44 += arg3;
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
					this.anIntArray83[local7] = (local22 << 16) + (local44 << 8) + local64;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("62621, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "c", descriptor = "(I)V")
	public void method300(@OriginalArg(0) int arg0) {
		try {
			@Pc(8) int[] local8 = new int[this.anInt513 * this.anInt514];
			for (@Pc(10) int local10 = 0; local10 < this.anInt510; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt509; local14++) {
					local8[(local10 + this.anInt512) * this.anInt513 + local14 + this.anInt511] = this.anIntArray83[local10 * this.anInt509 + local14];
				}
			}
			this.anIntArray83 = local8;
			this.anInt509 = this.anInt513;
			this.anInt510 = this.anInt514;
			@Pc(64) boolean local64 = true;
			this.anInt511 = 0;
			this.anInt512 = 0;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("64241, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(III)V")
	public void method301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg1 += this.anInt511;
			arg0 += this.anInt512;
			@Pc(15) int local15 = arg1 + arg0 * Class3_Sub1_Sub3.anInt663;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt510;
			@Pc(23) int local23 = this.anInt509;
			@Pc(27) int local27 = Class3_Sub1_Sub3.anInt663 - local23;
			@Pc(29) int local29 = 0;
			@Pc(39) int local39;
			if (arg0 < Class3_Sub1_Sub3.anInt665) {
				local39 = Class3_Sub1_Sub3.anInt665 - arg0;
				local20 -= local39;
				arg0 = Class3_Sub1_Sub3.anInt665;
				local17 = local39 * local23 + 0;
				local15 += local39 * Class3_Sub1_Sub3.anInt663;
			}
			if (arg0 + local20 > Class3_Sub1_Sub3.anInt666) {
				local20 -= arg0 + local20 - Class3_Sub1_Sub3.anInt666;
			}
			if (arg1 < Class3_Sub1_Sub3.anInt667) {
				local39 = Class3_Sub1_Sub3.anInt667 - arg1;
				local23 -= local39;
				arg1 = Class3_Sub1_Sub3.anInt667;
				local17 += local39;
				local15 += local39;
				local29 = local39 + 0;
				local27 += local39;
			}
			if (arg1 + local23 > Class3_Sub1_Sub3.anInt668) {
				local39 = arg1 + local23 - Class3_Sub1_Sub3.anInt668;
				local23 -= local39;
				local29 += local39;
				local27 += local39;
			}
			if (local23 > 0 && local20 > 0) {
				this.method302(local29, this.anIntArray83, Class3_Sub1_Sub3.anIntArray162, local23, local17, local15, local27, this.aByte20, local20);
			}
		} catch (@Pc(142) RuntimeException local142) {
			signlink.reporterror("46202, " + arg0 + ", " + arg1 + ", " + 859 + ", " + local142.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(I[I[IIIIIBI)V")
	private void method302(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int arg8) {
		try {
			@Pc(6) int local6 = -(arg3 >> 2);
			@Pc(11) int local11 = -(arg3 & 0x3);
			for (@Pc(14) int local14 = -arg8; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg2[arg5++] = arg1[arg4++];
					arg2[arg5++] = arg1[arg4++];
					arg2[arg5++] = arg1[arg4++];
					arg2[arg5++] = arg1[arg4++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg2[arg5++] = arg1[arg4++];
				}
				arg5 += arg6;
				arg4 += arg0;
			}
			if (arg7 != this.aByte20) {
				this.anInt507 = 114;
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("94129, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(IZI)V")
	public void method303(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt511;
			arg0 += this.anInt512;
			@Pc(18) int local18 = arg1 + arg0 * Class3_Sub1_Sub3.anInt663;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt510;
			@Pc(26) int local26 = this.anInt509;
			@Pc(30) int local30 = Class3_Sub1_Sub3.anInt663 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class3_Sub1_Sub3.anInt665) {
				local39 = Class3_Sub1_Sub3.anInt665 - arg0;
				local23 -= local39;
				arg0 = Class3_Sub1_Sub3.anInt665;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class3_Sub1_Sub3.anInt663;
			}
			if (arg0 + local23 > Class3_Sub1_Sub3.anInt666) {
				local23 -= arg0 + local23 - Class3_Sub1_Sub3.anInt666;
			}
			if (arg1 < Class3_Sub1_Sub3.anInt667) {
				local39 = Class3_Sub1_Sub3.anInt667 - arg1;
				local26 -= local39;
				arg1 = Class3_Sub1_Sub3.anInt667;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class3_Sub1_Sub3.anInt668) {
				local39 = arg1 + local26 - Class3_Sub1_Sub3.anInt668;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method304(Class3_Sub1_Sub3.anIntArray162, this.anIntArray83, local20, local18, local26, local23, local30, local32);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("38116, " + arg0 + ", " + true + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method304(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(IIIZ)V")
	public void method305(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt511;
			arg1 += this.anInt512;
			@Pc(24) int local24 = arg0 + arg1 * Class3_Sub1_Sub3.anInt663;
			@Pc(26) int local26 = 0;
			@Pc(29) int local29 = this.anInt510;
			@Pc(32) int local32 = this.anInt509;
			@Pc(36) int local36 = Class3_Sub1_Sub3.anInt663 - local32;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45;
			if (arg1 < Class3_Sub1_Sub3.anInt665) {
				local45 = Class3_Sub1_Sub3.anInt665 - arg1;
				local29 -= local45;
				arg1 = Class3_Sub1_Sub3.anInt665;
				local26 = local45 * local32 + 0;
				local24 += local45 * Class3_Sub1_Sub3.anInt663;
			}
			if (arg1 + local29 > Class3_Sub1_Sub3.anInt666) {
				local29 -= arg1 + local29 - Class3_Sub1_Sub3.anInt666;
			}
			if (arg0 < Class3_Sub1_Sub3.anInt667) {
				local45 = Class3_Sub1_Sub3.anInt667 - arg0;
				local32 -= local45;
				arg0 = Class3_Sub1_Sub3.anInt667;
				local26 += local45;
				local24 += local45;
				local38 = local45 + 0;
				local36 += local45;
			}
			if (arg0 + local32 > Class3_Sub1_Sub3.anInt668) {
				local45 = arg0 + local32 - Class3_Sub1_Sub3.anInt668;
				local32 -= local45;
				local38 += local45;
				local36 += local45;
			}
			if (local32 > 0 && local29 > 0) {
				this.method306(local38, Class3_Sub1_Sub3.anIntArray162, local32, local36, 0, local29, this.anIntArray83, local26, local24);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("76391, " + arg0 + ", " + 128 + ", " + arg1 + ", " + false + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(IB[IIIIII[III)V")
	private void method306(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int arg8) {
		try {
			for (@Pc(8) int local8 = -arg5; local8 < 0; local8++) {
				for (@Pc(13) int local13 = -arg2; local13 < 0; local13++) {
					@Pc(20) int local20 = arg6[arg7++];
					if (local20 == 0) {
						arg8++;
					} else {
						@Pc(26) int local26 = arg1[arg8];
						arg1[arg8++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg8 += arg3;
				arg7 += arg0;
			}
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("80284, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + 128 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "([IIIIIZIIII[I)V")
	public void method307(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		try {
			@Pc(5) int local5;
			if (!arg5) {
				for (local5 = 1; local5 > 0; local5++) {
				}
			}
			try {
				local5 = -arg2 / 2;
				@Pc(20) int local20 = -arg7 / 2;
				@Pc(29) int local29 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(38) int local38 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(44) int local44 = local29 * arg9 >> 8;
				@Pc(50) int local50 = local38 * arg9 >> 8;
				@Pc(62) int local62 = (arg1 << 16) + local20 * local44 + local5 * local50;
				@Pc(74) int local74 = (arg3 << 16) + (local20 * local50 - local5 * local44);
				@Pc(80) int local80 = arg6 + arg4 * Class3_Sub1_Sub3.anInt663;
				for (@Pc(82) int local82 = 0; local82 < arg7; local82++) {
					@Pc(88) int local88 = arg10[local82];
					@Pc(92) int local92 = local80 + local88;
					@Pc(98) int local98 = local62 + local50 * local88;
					@Pc(104) int local104 = local74 - local44 * local88;
					for (@Pc(109) int local109 = -arg0[local82]; local109 < 0; local109++) {
						Class3_Sub1_Sub3.anIntArray162[local92++] = this.anIntArray83[(local98 >> 16) + (local104 >> 16) * this.anInt509];
						local98 += local50;
						local104 -= local44;
					}
					local62 += local44;
					local74 += local50;
					local80 += Class3_Sub1_Sub3.anInt663;
				}
			} catch (@Pc(157) Exception local157) {
			}
		} catch (@Pc(159) RuntimeException local159) {
			signlink.reporterror("66026, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + arg10 + ", " + local159.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(IIDIIIIII)V")
	public void method308(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1, @OriginalArg(8) int arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg1) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg1) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg2 + arg0 * Class3_Sub1_Sub3.anInt663;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray83[(local77 >> 16) + (local79 >> 16) * this.anInt509];
						if (local98 == 0) {
							local75++;
						} else {
							Class3_Sub1_Sub3.anIntArray162[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class3_Sub1_Sub3.anInt663;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("82784, " + 15 + ", " + arg0 + ", " + arg1 + ", " + 20 + ", " + 256 + ", " + 20 + ", " + 15 + ", " + -20448 + ", " + arg2 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(ILclient!KZTQXFDC;ZI)V")
	public void method309(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3_Sub1 arg1, @OriginalArg(3) int arg2) {
		try {
			arg0 += this.anInt511;
			arg2 += this.anInt512;
			@Pc(15) int local15 = arg0 + arg2 * Class3_Sub1_Sub3.anInt663;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt510;
			@Pc(23) int local23 = this.anInt509;
			@Pc(27) int local27 = Class3_Sub1_Sub3.anInt663 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg2 < Class3_Sub1_Sub3.anInt665) {
				local36 = Class3_Sub1_Sub3.anInt665 - arg2;
				local20 -= local36;
				arg2 = Class3_Sub1_Sub3.anInt665;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class3_Sub1_Sub3.anInt663;
			}
			if (arg2 + local20 > Class3_Sub1_Sub3.anInt666) {
				local20 -= arg2 + local20 - Class3_Sub1_Sub3.anInt666;
			}
			if (arg0 < Class3_Sub1_Sub3.anInt667) {
				local36 = Class3_Sub1_Sub3.anInt667 - arg0;
				local23 -= local36;
				arg0 = Class3_Sub1_Sub3.anInt667;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class3_Sub1_Sub3.anInt668) {
				local36 = arg0 + local23 - Class3_Sub1_Sub3.anInt668;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method310(local27, local29, this.anIntArray83, local15, Class3_Sub1_Sub3.anIntArray162, local17, arg1.aByteArray10, local23, local20, 0);
			}
		} catch (@Pc(146) RuntimeException local146) {
			signlink.reporterror("17136, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + local146.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NUXITFPR", name = "a", descriptor = "(II[II[II[BIIII)V")
	private void method310(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(17) int local17 = -(arg7 & 0x3);
			for (@Pc(20) int local20 = -arg8; local20 < 0; local20++) {
				@Pc(31) int local31;
				for (@Pc(24) int local24 = local6; local24 < 0; local24++) {
					local31 = arg2[arg5++];
					if (local31 != 0 && arg6[arg3] == 0) {
						arg4[arg3++] = local31;
					} else {
						arg3++;
					}
					local31 = arg2[arg5++];
					if (local31 != 0 && arg6[arg3] == 0) {
						arg4[arg3++] = local31;
					} else {
						arg3++;
					}
					local31 = arg2[arg5++];
					if (local31 != 0 && arg6[arg3] == 0) {
						arg4[arg3++] = local31;
					} else {
						arg3++;
					}
					local31 = arg2[arg5++];
					if (local31 != 0 && arg6[arg3] == 0) {
						arg4[arg3++] = local31;
					} else {
						arg3++;
					}
				}
				for (@Pc(107) int local107 = local17; local107 < 0; local107++) {
					local31 = arg2[arg5++];
					if (local31 != 0 && arg6[arg3] == 0) {
						arg4[arg3++] = local31;
					} else {
						arg3++;
					}
				}
				arg3 += arg0;
				arg5 += arg1;
			}
		} catch (@Pc(144) RuntimeException local144) {
			signlink.reporterror("46539, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 14034 + ", " + arg9 + ", " + local144.toString());
			throw new RuntimeException();
		}
	}
}
