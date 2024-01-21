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

@OriginalClass("client!ZSWNSCUQ")
public final class Class6_Sub1_Sub1_Sub4 extends Class6_Sub1_Sub1 {

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "y", descriptor = "I")
	private static int anInt830;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "D", descriptor = "I")
	private int anInt833;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "z", descriptor = "I")
	private int anInt831 = 1;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "A", descriptor = "B")
	private byte aByte25 = 2;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "B", descriptor = "I")
	private int anInt832 = 4;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "C", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "E", descriptor = "Z")
	private boolean aBoolean222 = true;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "F", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "G", descriptor = "[I")
	public int[] anIntArray209;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "L", descriptor = "I")
	public int anInt838;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "H", descriptor = "I")
	public int anInt834;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "M", descriptor = "I")
	public int anInt839;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "I", descriptor = "I")
	public int anInt835;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "K", descriptor = "I")
	private int anInt837;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "J", descriptor = "I")
	private int anInt836;

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "<init>", descriptor = "(II)V")
	public Class6_Sub1_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray209 = new int[arg0 * arg1];
		this.anInt834 = this.anInt838 = arg0;
		this.anInt835 = this.anInt839 = arg1;
		this.anInt836 = this.anInt837 = 0;
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "<init>", descriptor = "([BLjava/awt/Component;)V")
	public Class6_Sub1_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Component arg1) {
		try {
			@Pc(23) Image local23 = Toolkit.getDefaultToolkit().createImage(arg0);
			@Pc(28) MediaTracker local28 = new MediaTracker(arg1);
			local28.addImage(local23, 0);
			local28.waitForAll();
			this.anInt834 = local23.getWidth(arg1);
			this.anInt835 = local23.getHeight(arg1);
			this.anInt838 = this.anInt834;
			this.anInt839 = this.anInt835;
			this.anInt836 = 0;
			this.anInt837 = 0;
			this.anIntArray209 = new int[this.anInt834 * this.anInt835];
			@Pc(82) PixelGrabber local82 = new PixelGrabber(local23, 0, 0, this.anInt834, this.anInt835, this.anIntArray209, 0, this.anInt834);
			local82.grabPixels();
		} catch (@Pc(87) Exception local87) {
			System.out.println("Error converting jpg");
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "<init>", descriptor = "(Lclient!ESUFCMYV;Ljava/lang/String;I)V")
	public Class6_Sub1_Sub1_Sub4(@OriginalArg(0) Class11 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(37) Class6_Sub1_Sub4 local37 = new Class6_Sub1_Sub4(arg0.method89(arg1 + ".dat", null), (byte) -17);
		@Pc(46) Class6_Sub1_Sub4 local46 = new Class6_Sub1_Sub4(arg0.method89("index.dat", null), (byte) -17);
		local46.anInt704 = local37.method413();
		this.anInt838 = local46.method413();
		this.anInt839 = local46.method413();
		@Pc(61) int local61 = local46.method411();
		@Pc(64) int[] local64 = new int[local61];
		for (@Pc(66) int local66 = 0; local66 < local61 - 1; local66++) {
			local64[local66 + 1] = local46.method415();
			if (local64[local66 + 1] == 0) {
				local64[local66 + 1] = 1;
			}
		}
		for (@Pc(95) int local95 = 0; local95 < arg2; local95++) {
			local46.anInt704 += 2;
			local37.anInt704 += local46.method413() * local46.method413();
			local46.anInt704++;
		}
		this.anInt836 = local46.method411();
		this.anInt837 = local46.method411();
		this.anInt834 = local46.method413();
		this.anInt835 = local46.method413();
		@Pc(142) int local142 = local46.method411();
		@Pc(148) int local148 = this.anInt834 * this.anInt835;
		this.anIntArray209 = new int[local148];
		@Pc(156) int local156;
		if (local142 == 0) {
			for (local156 = 0; local156 < local148; local156++) {
				this.anIntArray209[local156] = local64[local37.method411()];
			}
		} else if (local142 == 1) {
			for (local156 = 0; local156 < this.anInt834; local156++) {
				for (@Pc(180) int local180 = 0; local180 < this.anInt835; local180++) {
					this.anIntArray209[local156 + local180 * this.anInt834] = local64[local37.method411()];
				}
			}
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(I)V")
	public void method562() {
		try {
			Class6_Sub1_Sub1.method550(this.anIntArray209, this.anInt834, this.anInt835);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("16127, " + -5281 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(IIII)V")
	public void method563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		try {
			@Pc(5) int local5 = 93 / arg2;
			for (@Pc(7) int local7 = 0; local7 < this.anIntArray209.length; local7++) {
				@Pc(14) int local14 = this.anIntArray209[local7];
				if (local14 != 0) {
					@Pc(22) int local22 = local14 >> 16 & 0xFF;
					local22 += arg3;
					if (local22 < 1) {
						local22 = 1;
					} else if (local22 > 255) {
						local22 = 255;
					}
					@Pc(44) int local44 = local14 >> 8 & 0xFF;
					local44 += arg0;
					if (local44 < 1) {
						local44 = 1;
					} else if (local44 > 255) {
						local44 = 255;
					}
					@Pc(64) int local64 = local14 & 0xFF;
					local64 += arg1;
					if (local64 < 1) {
						local64 = 1;
					} else if (local64 > 255) {
						local64 = 255;
					}
					this.anIntArray209[local7] = (local22 << 16) + (local44 << 8) + local64;
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("3139, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "b", descriptor = "(I)V")
	public void method564() {
		try {
			@Pc(8) int[] local8 = new int[this.anInt838 * this.anInt839];
			for (@Pc(17) int local17 = 0; local17 < this.anInt835; local17++) {
				for (@Pc(21) int local21 = 0; local21 < this.anInt834; local21++) {
					local8[(local17 + this.anInt837) * this.anInt838 + local21 + this.anInt836] = this.anIntArray209[local17 * this.anInt834 + local21];
				}
			}
			this.anIntArray209 = local8;
			this.anInt834 = this.anInt838;
			this.anInt835 = this.anInt839;
			this.anInt836 = 0;
			this.anInt837 = 0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("74992, " + 0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(III)V")
	public void method565(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			arg0 += this.anInt836;
			arg1 += this.anInt837;
			if (this.anInt831 > 1 || this.anInt831 < 1) {
				this.aBoolean222 = !this.aBoolean222;
			}
			@Pc(31) int local31 = arg0 + arg1 * Class6_Sub1_Sub1.anInt821;
			@Pc(33) int local33 = 0;
			@Pc(36) int local36 = this.anInt835;
			@Pc(39) int local39 = this.anInt834;
			@Pc(43) int local43 = Class6_Sub1_Sub1.anInt821 - local39;
			@Pc(45) int local45 = 0;
			@Pc(52) int local52;
			if (arg1 < Class6_Sub1_Sub1.anInt823) {
				local52 = Class6_Sub1_Sub1.anInt823 - arg1;
				local36 -= local52;
				arg1 = Class6_Sub1_Sub1.anInt823;
				local33 = local52 * local39 + 0;
				local31 += local52 * Class6_Sub1_Sub1.anInt821;
			}
			if (arg1 + local36 > Class6_Sub1_Sub1.anInt824) {
				local36 -= arg1 + local36 - Class6_Sub1_Sub1.anInt824;
			}
			if (arg0 < Class6_Sub1_Sub1.anInt825) {
				local52 = Class6_Sub1_Sub1.anInt825 - arg0;
				local39 -= local52;
				arg0 = Class6_Sub1_Sub1.anInt825;
				local33 += local52;
				local31 += local52;
				local45 = local52 + 0;
				local43 += local52;
			}
			if (arg0 + local39 > Class6_Sub1_Sub1.anInt826) {
				local52 = arg0 + local39 - Class6_Sub1_Sub1.anInt826;
				local39 -= local52;
				local45 += local52;
				local43 += local52;
			}
			if (local39 > 0 && local36 > 0) {
				this.method566(local31, local45, local33, local43, local36, this.aByte25, Class6_Sub1_Sub1.anIntArray208, local39, this.anIntArray209);
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("35295, " + arg0 + ", " + arg1 + ", " + 1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(IIIIIB[II[I)V")
	private void method566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		try {
			@Pc(6) int local6 = -(arg7 >> 2);
			@Pc(11) int local11 = -(arg7 & 0x3);
			@Pc(16) int local16;
			if (arg5 != 2) {
				for (local16 = 1; local16 > 0; local16++) {
				}
			}
			for (local16 = -arg4; local16 < 0; local16++) {
				for (@Pc(28) int local28 = local6; local28 < 0; local28++) {
					arg6[arg0++] = arg8[arg2++];
					arg6[arg0++] = arg8[arg2++];
					arg6[arg0++] = arg8[arg2++];
					arg6[arg0++] = arg8[arg2++];
				}
				for (@Pc(67) int local67 = local11; local67 < 0; local67++) {
					arg6[arg0++] = arg8[arg2++];
				}
				arg0 += arg3;
				arg2 += arg1;
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("61965, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "b", descriptor = "(III)V")
	public void method567(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		try {
			arg0 += this.anInt836;
			arg1 += this.anInt837;
			@Pc(15) int local15 = arg0 + arg1 * Class6_Sub1_Sub1.anInt821;
			@Pc(17) int local17 = 0;
			@Pc(20) int local20 = this.anInt835;
			@Pc(23) int local23 = this.anInt834;
			@Pc(27) int local27 = Class6_Sub1_Sub1.anInt821 - local23;
			@Pc(29) int local29 = 0;
			@Pc(36) int local36;
			if (arg1 < Class6_Sub1_Sub1.anInt823) {
				local36 = Class6_Sub1_Sub1.anInt823 - arg1;
				local20 -= local36;
				arg1 = Class6_Sub1_Sub1.anInt823;
				local17 = local36 * local23 + 0;
				local15 += local36 * Class6_Sub1_Sub1.anInt821;
			}
			if (arg1 + local20 > Class6_Sub1_Sub1.anInt824) {
				local20 -= arg1 + local20 - Class6_Sub1_Sub1.anInt824;
			}
			if (arg0 < Class6_Sub1_Sub1.anInt825) {
				local36 = Class6_Sub1_Sub1.anInt825 - arg0;
				local23 -= local36;
				arg0 = Class6_Sub1_Sub1.anInt825;
				local17 += local36;
				local15 += local36;
				local29 = local36 + 0;
				local27 += local36;
			}
			if (arg0 + local23 > Class6_Sub1_Sub1.anInt826) {
				local36 = arg0 + local23 - Class6_Sub1_Sub1.anInt826;
				local23 -= local36;
				local29 += local36;
				local27 += local36;
			}
			if (local23 > 0 && local20 > 0) {
				this.method568(Class6_Sub1_Sub1.anIntArray208, this.anIntArray209, local17, local15, local23, local20, local27, local29);
			}
		} catch (@Pc(149) RuntimeException local149) {
			signlink.reporterror("89449, " + arg0 + ", " + 22912 + ", " + arg1 + ", " + local149.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "([I[IIIIIIII)V")
	private void method568(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
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

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(IZII)V")
	public void method569(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		try {
			arg1 += this.anInt836;
			arg0 += this.anInt837;
			@Pc(18) int local18 = arg1 + arg0 * Class6_Sub1_Sub1.anInt821;
			@Pc(20) int local20 = 0;
			@Pc(23) int local23 = this.anInt835;
			@Pc(26) int local26 = this.anInt834;
			@Pc(30) int local30 = Class6_Sub1_Sub1.anInt821 - local26;
			@Pc(32) int local32 = 0;
			@Pc(39) int local39;
			if (arg0 < Class6_Sub1_Sub1.anInt823) {
				local39 = Class6_Sub1_Sub1.anInt823 - arg0;
				local23 -= local39;
				arg0 = Class6_Sub1_Sub1.anInt823;
				local20 = local39 * local26 + 0;
				local18 += local39 * Class6_Sub1_Sub1.anInt821;
			}
			if (arg0 + local23 > Class6_Sub1_Sub1.anInt824) {
				local23 -= arg0 + local23 - Class6_Sub1_Sub1.anInt824;
			}
			if (arg1 < Class6_Sub1_Sub1.anInt825) {
				local39 = Class6_Sub1_Sub1.anInt825 - arg1;
				local26 -= local39;
				arg1 = Class6_Sub1_Sub1.anInt825;
				local20 += local39;
				local18 += local39;
				local32 = local39 + 0;
				local30 += local39;
			}
			if (arg1 + local26 > Class6_Sub1_Sub1.anInt826) {
				local39 = arg1 + local26 - Class6_Sub1_Sub1.anInt826;
				local26 -= local39;
				local32 += local39;
				local30 += local39;
			}
			if (local26 > 0 && local23 > 0) {
				this.method570(0, local20, this.anIntArray209, local32, local18, local26, local30, local23, Class6_Sub1_Sub1.anIntArray208);
			}
		} catch (@Pc(143) RuntimeException local143) {
			signlink.reporterror("84991, " + arg0 + ", " + false + ", " + 128 + ", " + arg1 + ", " + local143.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(II[IZIIIIII[I)V")
	private void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) int arg7, @OriginalArg(10) int[] arg8) {
		try {
			for (@Pc(12) int local12 = -arg7; local12 < 0; local12++) {
				for (@Pc(17) int local17 = -arg5; local17 < 0; local17++) {
					@Pc(24) int local24 = arg2[arg1++];
					if (local24 == 0) {
						arg4++;
					} else {
						@Pc(30) int local30 = arg8[arg4];
						arg8[arg4++] = ((local24 & 0xFF00FF) * 128 + (local30 & 0xFF00FF) * 128 & 0xFF00FF00) + ((local24 & 0xFF00) * 128 + (local30 & 0xFF00) * 128 & 0xFF0000) >> 8;
					}
				}
				arg4 += arg6;
				arg1 += arg3;
			}
		} catch (@Pc(82) RuntimeException local82) {
			signlink.reporterror("17059, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 128 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + local82.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(I[IIIIIIIII[I)V")
	public void method571(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		try {
			try {
				@Pc(10) int local10 = -arg6 / 2;
				@Pc(15) int local15 = -arg7 / 2;
				@Pc(24) int local24 = (int) (Math.sin((double) arg8 / 326.11D) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos((double) arg8 / 326.11D) * 65536.0D);
				@Pc(39) int local39 = local24 * arg5 >> 8;
				@Pc(45) int local45 = local33 * arg5 >> 8;
				@Pc(57) int local57 = (arg2 << 16) + local15 * local39 + local10 * local45;
				@Pc(69) int local69 = (arg4 << 16) + (local15 * local45 - local10 * local39);
				@Pc(75) int local75 = arg3 + arg0 * Class6_Sub1_Sub1.anInt821;
				for (@Pc(77) int local77 = 0; local77 < arg7; local77++) {
					@Pc(83) int local83 = arg9[local77];
					@Pc(87) int local87 = local75 + local83;
					@Pc(93) int local93 = local57 + local45 * local83;
					@Pc(99) int local99 = local69 - local39 * local83;
					for (@Pc(104) int local104 = -arg1[local77]; local104 < 0; local104++) {
						Class6_Sub1_Sub1.anIntArray208[local87++] = this.anIntArray209[(local93 >> 16) + (local99 >> 16) * this.anInt834];
						local93 += local45;
						local99 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class6_Sub1_Sub1.anInt821;
				}
			} catch (@Pc(152) Exception local152) {
			}
		} catch (@Pc(154) RuntimeException local154) {
			signlink.reporterror("10307, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + arg6 + ", " + 35958 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local154.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(DIZIIIIII)V")
	public void method572(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			try {
				@Pc(27) int local27 = (int) (Math.sin(arg0) * 65536.0D);
				@Pc(33) int local33 = (int) (Math.cos(arg0) * 65536.0D);
				@Pc(39) int local39 = local27 * 256 >> 8;
				@Pc(45) int local45 = local33 * 256 >> 8;
				@Pc(57) int local57 = local39 * -10 + local45 * -10 + 983040;
				@Pc(69) int local69 = local45 * -10 + 983040 - local39 * -10;
				@Pc(75) int local75 = arg2 + arg1 * Class6_Sub1_Sub1.anInt821;
				for (@Pc(77) int local77 = 0; local77 < 20; local77++) {
					@Pc(81) int local81 = local75;
					@Pc(83) int local83 = local57;
					@Pc(85) int local85 = local69;
					for (@Pc(88) int local88 = -20; local88 < 0; local88++) {
						@Pc(104) int local104 = this.anIntArray209[(local83 >> 16) + (local85 >> 16) * this.anInt834];
						if (local104 == 0) {
							local81++;
						} else {
							Class6_Sub1_Sub1.anIntArray208[local81++] = local104;
						}
						local83 += local45;
						local85 -= local39;
					}
					local57 += local39;
					local69 += local45;
					local75 += Class6_Sub1_Sub1.anInt821;
				}
			} catch (@Pc(143) Exception local143) {
			}
		} catch (@Pc(145) RuntimeException local145) {
			signlink.reporterror("64153, " + arg0 + ", " + arg1 + ", " + false + ", " + arg2 + ", " + 20 + ", " + 15 + ", " + 256 + ", " + 20 + ", " + 15 + ", " + local145.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(ILclient!WGRALUSQ;II)V")
	public void method573(@OriginalArg(1) Class6_Sub1_Sub1_Sub3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			arg1 += this.anInt836;
			arg2 += this.anInt837;
			@Pc(25) int local25 = arg1 + arg2 * Class6_Sub1_Sub1.anInt821;
			@Pc(27) int local27 = 0;
			@Pc(30) int local30 = this.anInt835;
			@Pc(33) int local33 = this.anInt834;
			@Pc(37) int local37 = Class6_Sub1_Sub1.anInt821 - local33;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46;
			if (arg2 < Class6_Sub1_Sub1.anInt823) {
				local46 = Class6_Sub1_Sub1.anInt823 - arg2;
				local30 -= local46;
				arg2 = Class6_Sub1_Sub1.anInt823;
				local27 = local46 * local33 + 0;
				local25 += local46 * Class6_Sub1_Sub1.anInt821;
			}
			if (arg2 + local30 > Class6_Sub1_Sub1.anInt824) {
				local30 -= arg2 + local30 - Class6_Sub1_Sub1.anInt824;
			}
			if (arg1 < Class6_Sub1_Sub1.anInt825) {
				local46 = Class6_Sub1_Sub1.anInt825 - arg1;
				local33 -= local46;
				arg1 = Class6_Sub1_Sub1.anInt825;
				local27 += local46;
				local25 += local46;
				local39 = local46 + 0;
				local37 += local46;
			}
			if (arg1 + local33 > Class6_Sub1_Sub1.anInt826) {
				local46 = arg1 + local33 - Class6_Sub1_Sub1.anInt826;
				local33 -= local46;
				local39 += local46;
				local37 += local46;
			}
			if (local33 > 0 && local30 > 0) {
				this.method574(local33, local39, local27, this.anIntArray209, 0, local37, Class6_Sub1_Sub1.anIntArray208, local25, local30, arg0.aByteArray19);
			}
		} catch (@Pc(151) RuntimeException local151) {
			signlink.reporterror("64670, " + 22290 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local151.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZSWNSCUQ", name = "a", descriptor = "(III[IIIB[III[B)V")
	private void method574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		try {
			@Pc(6) int local6 = -(arg0 >> 2);
			@Pc(11) int local11 = -(arg0 & 0x3);
			for (@Pc(14) int local14 = -arg8; local14 < 0; local14++) {
				@Pc(25) int local25;
				for (@Pc(18) int local18 = local6; local18 < 0; local18++) {
					local25 = arg3[arg2++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg3[arg2++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg3[arg2++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
					local25 = arg3[arg2++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
				}
				for (@Pc(101) int local101 = local11; local101 < 0; local101++) {
					local25 = arg3[arg2++];
					if (local25 != 0 && arg9[arg7] == 0) {
						arg6[arg7++] = local25;
					} else {
						arg7++;
					}
				}
				arg7 += arg5;
				arg2 += arg1;
			}
		} catch (@Pc(141) RuntimeException local141) {
			signlink.reporterror("3223, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + arg4 + ", " + arg5 + ", " + 73 + ", " + arg6 + ", " + arg7 + ", " + arg8 + ", " + arg9 + ", " + local141.toString());
			throw new RuntimeException();
		}
	}
}
