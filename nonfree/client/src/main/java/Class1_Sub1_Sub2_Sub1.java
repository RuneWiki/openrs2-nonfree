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

@OriginalClass("client!DUMEPGRH")
public final class Class1_Sub1_Sub2_Sub1 extends Class1_Sub1_Sub2 {

	@OriginalMember(owner = "client!DUMEPGRH", name = "B", descriptor = "I")
	private static int anInt210;

	@OriginalMember(owner = "client!DUMEPGRH", name = "F", descriptor = "I")
	private int anInt212;

	@OriginalMember(owner = "client!DUMEPGRH", name = "A", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!DUMEPGRH", name = "C", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!DUMEPGRH", name = "D", descriptor = "I")
	private int anInt211 = -44238;

	@OriginalMember(owner = "client!DUMEPGRH", name = "E", descriptor = "Z")
	private boolean aBoolean47 = true;

	@OriginalMember(owner = "client!DUMEPGRH", name = "G", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!DUMEPGRH", name = "H", descriptor = "[I")
	public int[] anIntArray30;

	@OriginalMember(owner = "client!DUMEPGRH", name = "M", descriptor = "I")
	public int anInt217;

	@OriginalMember(owner = "client!DUMEPGRH", name = "I", descriptor = "I")
	public int anInt213;

	@OriginalMember(owner = "client!DUMEPGRH", name = "N", descriptor = "I")
	public int anInt218;

	@OriginalMember(owner = "client!DUMEPGRH", name = "J", descriptor = "I")
	public int anInt214;

	@OriginalMember(owner = "client!DUMEPGRH", name = "L", descriptor = "I")
	private int anInt216;

	@OriginalMember(owner = "client!DUMEPGRH", name = "K", descriptor = "I")
	private int anInt215;

	@OriginalMember(owner = "client!DUMEPGRH", name = "<init>", descriptor = "(II)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray30 = new int[arg0 * arg1];
		this.anInt213 = this.anInt217 = arg0;
		this.anInt214 = this.anInt218 = arg1;
		this.anInt215 = this.anInt216 = 0;
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(20) Image local20 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(25) MediaTracker local25 = new MediaTracker(arg1);
			local25.addImage(local20, 0);
			local25.waitForAll();
			this.anInt213 = local20.getWidth(arg1);
			this.anInt214 = local20.getHeight(arg1);
			this.anInt217 = this.anInt213;
			this.anInt218 = this.anInt214;
			this.anInt215 = 0;
			this.anInt216 = 0;
			this.anIntArray30 = new int[this.anInt213 * this.anInt214];
			@Pc(79) PixelGrabber local79 = new PixelGrabber(local20, 0, 0, this.anInt213, this.anInt214, this.anIntArray30, 0, this.anInt213);
			local79.grabPixels();
		} catch (@Pc(84) Exception local84) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "<init>", descriptor = "(Lclient!SPZBTZXL;Ljava/lang/String;I)V")
	public Class1_Sub1_Sub2_Sub1(@OriginalArg(0) Class35 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(34) Class1_Sub1_Sub3 local34 = new Class1_Sub1_Sub3(arg0.method491(arg1 + ".dat", null), anInt210);
		@Pc(43) Class1_Sub1_Sub3 local43 = new Class1_Sub1_Sub3(arg0.method491("index.dat", null), anInt210);
		local43.anInt443 = local34.method361();
		this.anInt217 = local43.method361();
		this.anInt218 = local43.method361();
		@Pc(58) int local58 = local43.method359();
		@Pc(61) int[] local61 = new int[local58];
		for (@Pc(63) int local63 = 0; local63 < local58 - 1; local63++) {
			local61[local63 + 1] = local43.method363();
			if (local61[local63 + 1] == 0) {
				local61[local63 + 1] = 1;
			}
		}
		for (@Pc(98) int local98 = 0; local98 < arg2; local98++) {
			local43.anInt443 += 2;
			local34.anInt443 += local43.method361() * local43.method361();
			local43.anInt443++;
		}
		this.anInt215 = local43.method359();
		this.anInt216 = local43.method359();
		this.anInt213 = local43.method361();
		this.anInt214 = local43.method361();
		@Pc(145) int local145 = local43.method359();
		@Pc(151) int local151 = this.anInt213 * this.anInt214;
		this.anIntArray30 = new int[local151];
		@Pc(159) int local159;
		if (local145 == 0) {
			for (local159 = 0; local159 < local151; local159++) {
				this.anIntArray30[local159] = local61[local34.method359()];
			}
		} else if (local145 == 1) {
			for (local159 = 0; local159 < this.anInt213; local159++) {
				for (@Pc(183) int local183 = 0; local183 < this.anInt214; local183++) {
					this.anIntArray30[local159 + local183 * this.anInt213] = local61[local34.method359()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "b", descriptor = "(Z)V")
	public void method126() {
		try {
			Class1_Sub1_Sub2.method400(this.anInt213, this.anIntArray30, this.anInt214);
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("18827, " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(IIII)V")
	public void method127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(3) int local3 = 0; local3 < this.anIntArray30.length; local3++) {
				@Pc(10) int local10 = this.anIntArray30[local3];
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
					local60 += arg2;
					if (local60 < 1) {
						local60 = 1;
					} else if (local60 > 255) {
						local60 = 255;
					}
					this.anIntArray30[local3] = (local18 << 16) + (local40 << 8) + local60;
				}
			}
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("99578, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 7547 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "b", descriptor = "(I)V")
	public void method128() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt217 * this.anInt218];
			for (@Pc(10) int local10 = 0; local10 < this.anInt214; local10++) {
				for (@Pc(14) int local14 = 0; local14 < this.anInt213; local14++) {
					local8[(local10 + this.anInt216) * this.anInt217 + local14 + this.anInt215] = this.anIntArray30[local10 * this.anInt213 + local14];
				}
			}
			this.anIntArray30 = local8;
			this.anInt213 = this.anInt217;
			this.anInt214 = this.anInt218;
			this.anInt215 = 0;
			this.anInt216 = 0;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("56628, " + 472 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(ZII)V")
	public void method129(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt215;
			arg1 += this.anInt216;
			@Pc(18) int local18 = arg0 + arg1 * Class1_Sub1_Sub2.anInt453;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt214;
			@Pc(26) int local26 = this.anInt213;
			@Pc(30) int local30 = Class1_Sub1_Sub2.anInt453 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg1 < Class1_Sub1_Sub2.anInt455) {
				local39 = Class1_Sub1_Sub2.anInt455 - arg1;
				local23 -= local39;
				arg1 = Class1_Sub1_Sub2.anInt455;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class1_Sub1_Sub2.anInt453;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt456) {
				local23 -= arg1 + local23 - Class1_Sub1_Sub2.anInt456;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt457) {
				local39 = Class1_Sub1_Sub2.anInt457 - arg0;
				local26 -= local39;
				arg0 = Class1_Sub1_Sub2.anInt457;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg0 + local26 > Class1_Sub1_Sub2.anInt458) {
				local39 = arg0 + local26 - Class1_Sub1_Sub2.anInt458;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method130(local32, local30, local20, local18, local26, local23, Class1_Sub1_Sub2.anIntArray122, this.anIntArray30);
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("68071, " + false + ", " + arg0 + ", " + arg1 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(ZIIIIII[I[I)V")
	private void method130(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7) {
		try {
			@Pc(6) int local6 = -(arg4 >> 2);
			@Pc(11) int local11 = -(arg4 & 0x3);
			for (@Pc(14) int local14 = -arg5; local14 < 0; local14++) {
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					arg6[arg3++] = arg7[arg2++];
					arg6[arg3++] = arg7[arg2++];
					arg6[arg3++] = arg7[arg2++];
					arg6[arg3++] = arg7[arg2++];
				}
				for (@Pc(57) int local57 = local11; local57 < 0; local57++) {
					arg6[arg3++] = arg7[arg2++];
				}
				arg3 += arg1;
				arg2 += arg0;
			}
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("32877, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(III)V")
	public void method131(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg1 += this.anInt215;
			arg0 += this.anInt216;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt453;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt214;
			@Pc(23) int local23 = this.anInt213;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt453 - local23;
			@Pc(29) int local29 = 0;
			@Pc(46) int local46;
			if (arg0 < Class1_Sub1_Sub2.anInt455) {
				local46 = Class1_Sub1_Sub2.anInt455 - arg0;
				local20 -= local46;
				arg0 = Class1_Sub1_Sub2.anInt455;
				local17 = local46 * local23 + 0;
				local15 += local46 * Class1_Sub1_Sub2.anInt453;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt456) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt456;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt457) {
				local46 = Class1_Sub1_Sub2.anInt457 - arg1;
				local23 -= local46;
				arg1 = Class1_Sub1_Sub2.anInt457;
				local17 += local46;
				local15 += local46;
				local29 = local46 + 0;
				local27 += local46;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt458) {
				local46 = arg1 + local23 - Class1_Sub1_Sub2.anInt458;
				local23 -= local46;
				local29 += local46;
				local27 += local46;
			}
			if (local23 > 0 && local20 > 0) {
				this.method132(Class1_Sub1_Sub2.anIntArray122, this.anIntArray30, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(148) RuntimeException local148) {
			signlink.reporterror("14392, " + 448 + ", " + arg0 + ", " + arg1 + ", " + local148.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method132(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!DUMEPGRH", name = "b", descriptor = "(IIII)V")
	public void method133(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg0 += this.anInt215;
			arg1 += this.anInt216;
			@Pc(15) int local15 = arg0 + arg1 * Class1_Sub1_Sub2.anInt453;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt214;
			@Pc(23) int local23 = this.anInt213;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt453 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class1_Sub1_Sub2.anInt455) {
				local36 = Class1_Sub1_Sub2.anInt455 - arg1;
				local20 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt455;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt453;
			}
			if (arg1 + local20 > Class1_Sub1_Sub2.anInt456) {
				local20 -= arg1 + local20 - Class1_Sub1_Sub2.anInt456;
			}
			if (arg0 < Class1_Sub1_Sub2.anInt457) {
				local36 = Class1_Sub1_Sub2.anInt457 - arg0;
				local23 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt457;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class1_Sub1_Sub2.anInt458) {
				local36 = arg0 + local23 - Class1_Sub1_Sub2.anInt458;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method134(this.anIntArray30, local15, local23, local17, local27, local29, this.anInt212, local20, 0, Class1_Sub1_Sub2.anIntArray122);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("58273, " + arg0 + ", " + -7063 + ", " + 128 + ", " + arg1 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "([IIIIIIIIII[I)V")
	private void method134(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			@Pc(13) int local13;
			for (@Pc(8) int local8 = -arg7; local8 < 0; local8++) {
				for (local13 = -arg2; local13 < 0; local13++) {
					@Pc(20) int local20 = arg0[arg3++];
					if (local20 == 0) {
						arg1++;
					} else {
						@Pc(26) int local26 = arg9[arg1];
						arg9[arg1++] = ((local20 & 0xFF00FF) * 128 + (local26 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local20 & 0xFF00) * 128 + (local26 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg1 += arg4;
				arg3 += arg5;
			}
			if (arg6 != 0) {
				for (local13 = 1; local13 > 0; local13++) {
				}
			}
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("9893, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + 128 + ", " + arg9 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(IIIIII[III[II)V")
	public void method135(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		try {
			try {
				@Pc(11) int local11 = -arg6 / 2;
				@Pc(16) int local16 = -arg2 / 2;
				@Pc(25) int local25 = (int) (Math.sin((double) arg1 / 326.11D) * 65536.0D);
				@Pc(34) int local34 = (int) (Math.cos((double) arg1 / 326.11D) * 65536.0D);
				@Pc(40) int local40 = local25 * arg9 >> 8;
				@Pc(46) int local46 = local34 * arg9 >> 8;
				@Pc(58) int local58 = (arg3 << 16) + local16 * local40 + local11 * local46;
				@Pc(70) int local70 = (arg4 << 16) + (local16 * local46 - local11 * local40);
				@Pc(76) int local76 = arg0 + arg7 * Class1_Sub1_Sub2.anInt453;
				for (@Pc(78) int local78 = 0; local78 < arg2; local78++) {
					@Pc(84) int local84 = arg5[local78];
					@Pc(88) int local88 = local76 + local84;
					@Pc(94) int local94 = local58 + local46 * local84;
					@Pc(100) int local100 = local70 - local40 * local84;
					for (@Pc(105) int local105 = -arg8[local78]; local105 < 0; local105++) {
						Class1_Sub1_Sub2.anIntArray122[local88++] = this.anIntArray30[(local94 >> 16) + (local100 >> 16) * this.anInt213];
						local94 += local46;
						local100 -= local40;
					}
					local58 += local40;
					local70 += local46;
					local76 += Class1_Sub1_Sub2.anInt453;
				}
			} catch (@Pc(153) Exception local153) {
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("37472, " + -40142 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(IIIIIIDII)V")
	public void method136(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) double arg2) {
		try {
			try {
				@Pc(21) int local21 = (int) (Math.sin(arg2) * 65536.0D);
				@Pc(27) int local27 = (int) (Math.cos(arg2) * 65536.0D);
				@Pc(33) int local33 = local21 * 256 >> 8;
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(51) int local51 = local33 * -10 + local39 * -10 + 983040;
				@Pc(63) int local63 = local39 * -10 + 983040 - local33 * -10;
				@Pc(69) int local69 = arg1 + arg0 * Class1_Sub1_Sub2.anInt453;
				for (@Pc(71) int local71 = 0; local71 < 20; local71++) {
					@Pc(75) int local75 = local69;
					@Pc(77) int local77 = local51;
					@Pc(79) int local79 = local63;
					for (@Pc(82) int local82 = -20; local82 < 0; local82++) {
						@Pc(98) int local98 = this.anIntArray30[(local77 >> 16) + (local79 >> 16) * this.anInt213];
						if (local98 == 0) {
							local75++;
						} else {
							Class1_Sub1_Sub2.anIntArray122[local75++] = local98;
						}
						local77 += local39;
						local79 -= local33;
					}
					local51 += local33;
					local63 += local39;
					local69 += Class1_Sub1_Sub2.anInt453;
				}
			} catch (@Pc(137) Exception local137) {
			}
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("19719, " + 15 + ", " + 20 + ", " + 4 + ", " + arg0 + ", " + arg1 + ", " + 256 + ", " + arg2 + ", " + 15 + ", " + 20 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(IILclient!LKEIRLLI;Z)V")
	public void method137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub1_Sub2_Sub4 arg2, @OriginalArg(3) boolean arg3) {
		try {
			arg1 += this.anInt215;
			arg0 += this.anInt216;
			@Pc(15) int local15 = arg1 + arg0 * Class1_Sub1_Sub2.anInt453;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt214;
			@Pc(23) int local23 = this.anInt213;
			@Pc(27) int local27 = Class1_Sub1_Sub2.anInt453 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg0 < Class1_Sub1_Sub2.anInt455) {
				local36 = Class1_Sub1_Sub2.anInt455 - arg0;
				local20 -= local36;
				arg0 = Class1_Sub1_Sub2.anInt455;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class1_Sub1_Sub2.anInt453;
			}
			if (arg0 + local20 > Class1_Sub1_Sub2.anInt456) {
				local20 -= arg0 + local20 - Class1_Sub1_Sub2.anInt456;
			}
			if (arg1 < Class1_Sub1_Sub2.anInt457) {
				local36 = Class1_Sub1_Sub2.anInt457 - arg1;
				local23 -= local36;
				arg1 = Class1_Sub1_Sub2.anInt457;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg1 + local23 > Class1_Sub1_Sub2.anInt458) {
				local36 = arg1 + local23 - Class1_Sub1_Sub2.anInt458;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method138(0, local23, local17, local27, local15, this.anIntArray30, Class1_Sub1_Sub2.anIntArray122, local20, local29, arg2.aByteArray7);
				if (!arg3) {
					for (local36 = 1; local36 > 0; local36++) {
					}
				}
			}
		} catch (@Pc(150) RuntimeException local150) {
			signlink.reporterror("93795, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local150.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DUMEPGRH", name = "a", descriptor = "(ZIIIII[I[III[B)V")
	private void method138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(9) int local9 = -(arg1 >> 2);
			@Pc(14) int local14 = -(arg1 & 0x3);
			for (@Pc(17) int local17 = -arg7; local17 < 0; local17++) {
				@Pc(28) int local28;
				for (@Pc(21) int local21 = local9; local21 < 0; local21++) {
					local28 = arg5[arg2++];
					if (local28 != 0 && arg9[arg4] == 0) {
						arg6[arg4++] = local28;
					} else {
						arg4++;
					}
					local28 = arg5[arg2++];
					if (local28 != 0 && arg9[arg4] == 0) {
						arg6[arg4++] = local28;
					} else {
						arg4++;
					}
					local28 = arg5[arg2++];
					if (local28 != 0 && arg9[arg4] == 0) {
						arg6[arg4++] = local28;
					} else {
						arg4++;
					}
					local28 = arg5[arg2++];
					if (local28 != 0 && arg9[arg4] == 0) {
						arg6[arg4++] = local28;
					} else {
						arg4++;
					}
				}
				for (@Pc(104) int local104 = local14; local104 < 0; local104++) {
					local28 = arg5[arg2++];
					if (local28 != 0 && arg9[arg4] == 0) {
						arg6[arg4++] = local28;
					} else {
						arg4++;
					}
				}
				arg4 += arg3;
				arg2 += arg8;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("11054, " + false + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
